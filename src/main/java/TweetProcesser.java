//Given a stream of tweets, display the top 10 trending hashtags
//Assume the stream to be a contiguous set of micro batches(1 sec)
//Hashtag is any word in the tweet that starts with #

//insert DB

import java.util.*;

public class TweetProcesser {
    public Map<String,Integer> topics = new HashMap<String,Integer>();
    public static void main(String args[]) {

    }

    public List<String> getTrendingTopics() {
        int max = 10;
        Map<Integer,List<String>> countsHash = new HashMap<Integer, List<String>>();
        List<Integer> counts = new ArrayList<Integer>();

        List<String> trendTopics = new ArrayList<String>();

        for(Map.Entry<String,Integer> entry : topics.entrySet()) {
            if(countsHash.get(entry.getValue()) == null)
                countsHash.put(entry.getValue(), new ArrayList<String>());
            countsHash.get(entry.getValue()).add(entry.getKey());
        }

        Collections.sort(counts);

        for(int j=0; j < counts.size(); j--) {
            if(trendTopics.size() >= max) {
                return trendTopics;
            }
            trendTopics.addAll(countsHash.get(counts.get(j)));
        }

        return  trendTopics;
    }

    public void processTweets(List<String> tweets) {
        for(String tweet: tweets) {
            if(tweet.trim().isEmpty())
                continue;

            String[] parts = tweet.split(" ");

            for(int i=0; i<parts.length; i++) {
                if(parts[i].startsWith("#")) {
                    if(topics.get(parts[i]) == null)
                        topics.put(parts[i], 0);
                    topics.put(parts[i], topics.get(parts[i]) + 1);
                }
            }
        }
    }

}
