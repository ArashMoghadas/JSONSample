package com.example.asus.jsonsample.data;

import com.example.asus.jsonsample.Data;

import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

import java.util.ArrayList;
import java.util.List;

public class QueryUtils {
    public static List<Data> getDataFromJson(){
        String json = JSON_Data;
        List<Data> datas = new ArrayList<>();
        try {
            JSONObject root = new JSONObject();
            JSONArray items = root.getJSONArray("items");
            for (int i = 0; i < items.length(); i++){
                JSONObject item = items.getJSONObject(i);
                Integer id = item.getInt("id");
                String name = item.getString("name");

                Data data = new Data(name, id);
                datas.add(data);
            }
        }catch (JSONException e){
            e.printStackTrace();
        }
        return datas;
    }

    private static String JSON_Data = "{\n" +
            "  \"total_count\": 736630,\n" +
            "  \"incomplete_results\": false,\n" +
            "  \"items\": [\n" +
            "    {\n" +
            "      \"id\": 14098069,\n" +
            "      \"node_id\": \"MDEwOlJlcG9zaXRvcnkxNDA5ODA2OQ==\",\n" +
            "      \"name\": \"free-programming-books-zh_CN\",\n" +
            "      \"full_name\": \"justjavac/free-programming-books-zh_CN\",\n" +
            "      \"owner\": {\n" +
            "        \"login\": \"justjavac\",\n" +
            "        \"id\": 359395,\n" +
            "        \"node_id\": \"MDQ6VXNlcjM1OTM5NQ==\",\n" +
            "        \"avatar_url\": \"https://avatars1.githubusercontent.com/u/359395?v=4\",\n" +
            "        \"gravatar_id\": \"\",\n" +
            "        \"url\": \"https://api.github.com/users/justjavac\",\n" +
            "        \"html_url\": \"https://github.com/justjavac\",\n" +
            "        \"followers_url\": \"https://api.github.com/users/justjavac/followers\",\n" +
            "        \"following_url\": \"https://api.github.com/users/justjavac/following{/other_user}\",\n" +
            "        \"gists_url\": \"https://api.github.com/users/justjavac/gists{/gist_id}\",\n" +
            "        \"starred_url\": \"https://api.github.com/users/justjavac/starred{/owner}{/repo}\",\n" +
            "        \"subscriptions_url\": \"https://api.github.com/users/justjavac/subscriptions\",\n" +
            "        \"organizations_url\": \"https://api.github.com/users/justjavac/orgs\",\n" +
            "        \"repos_url\": \"https://api.github.com/users/justjavac/repos\",\n" +
            "        \"events_url\": \"https://api.github.com/users/justjavac/events{/privacy}\",\n" +
            "        \"received_events_url\": \"https://api.github.com/users/justjavac/received_events\",\n" +
            "        \"type\": \"User\",\n" +
            "        \"site_admin\": false\n" +
            "      },\n" +
            "      \"private\": false,\n" +
            "      \"html_url\": \"https://github.com/justjavac/free-programming-books-zh_CN\",\n" +
            "      \"description\": \":books: 免费的计算机编程类中文书籍，欢迎投稿\",\n" +
            "      \"fork\": false,\n" +
            "      \"url\": \"https://api.github.com/repos/justjavac/free-programming-books-zh_CN\",\n" +
            "      \"forks_url\": \"https://api.github.com/repos/justjavac/free-programming-books-zh_CN/forks\",\n" +
            "      \"keys_url\": \"https://api.github.com/repos/justjavac/free-programming-books-zh_CN/keys{/key_id}\",\n" +
            "      \"collaborators_url\": \"https://api.github.com/repos/justjavac/free-programming-books-zh_CN/collaborators{/collaborator}\",\n" +
            "      \"teams_url\": \"https://api.github.com/repos/justjavac/free-programming-books-zh_CN/teams\",\n" +
            "      \"hooks_url\": \"https://api.github.com/repos/justjavac/free-programming-books-zh_CN/hooks\",\n" +
            "      \"issue_events_url\": \"https://api.github.com/repos/justjavac/free-programming-books-zh_CN/issues/events{/number}\",\n" +
            "      \"events_url\": \"https://api.github.com/repos/justjavac/free-programming-books-zh_CN/events\",\n" +
            "      \"assignees_url\": \"https://api.github.com/repos/justjavac/free-programming-books-zh_CN/assignees{/user}\",\n" +
            "      \"branches_url\": \"https://api.github.com/repos/justjavac/free-programming-books-zh_CN/branches{/branch}\",\n" +
            "      \"tags_url\": \"https://api.github.com/repos/justjavac/free-programming-books-zh_CN/tags\",\n" +
            "      \"blobs_url\": \"https://api.github.com/repos/justjavac/free-programming-books-zh_CN/git/blobs{/sha}\",\n" +
            "      \"git_tags_url\": \"https://api.github.com/repos/justjavac/free-programming-books-zh_CN/git/tags{/sha}\",\n" +
            "      \"git_refs_url\": \"https://api.github.com/repos/justjavac/free-programming-books-zh_CN/git/refs{/sha}\",\n" +
            "      \"trees_url\": \"https://api.github.com/repos/justjavac/free-programming-books-zh_CN/git/trees{/sha}\",\n" +
            "      \"statuses_url\": \"https://api.github.com/repos/justjavac/free-programming-books-zh_CN/statuses/{sha}\",\n" +
            "      \"languages_url\": \"https://api.github.com/repos/justjavac/free-programming-books-zh_CN/languages\",\n" +
            "      \"stargazers_url\": \"https://api.github.com/repos/justjavac/free-programming-books-zh_CN/stargazers\",\n" +
            "      \"contributors_url\": \"https://api.github.com/repos/justjavac/free-programming-books-zh_CN/contributors\",\n" +
            "      \"subscribers_url\": \"https://api.github.com/repos/justjavac/free-programming-books-zh_CN/subscribers\",\n" +
            "      \"subscription_url\": \"https://api.github.com/repos/justjavac/free-programming-books-zh_CN/subscription\",\n" +
            "      \"commits_url\": \"https://api.github.com/repos/justjavac/free-programming-books-zh_CN/commits{/sha}\",\n" +
            "      \"git_commits_url\": \"https://api.github.com/repos/justjavac/free-programming-books-zh_CN/git/commits{/sha}\",\n" +
            "      \"comments_url\": \"https://api.github.com/repos/justjavac/free-programming-books-zh_CN/comments{/number}\",\n" +
            "      \"issue_comment_url\": \"https://api.github.com/repos/justjavac/free-programming-books-zh_CN/issues/comments{/number}\",\n" +
            "      \"contents_url\": \"https://api.github.com/repos/justjavac/free-programming-books-zh_CN/contents/{+path}\",\n" +
            "      \"compare_url\": \"https://api.github.com/repos/justjavac/free-programming-books-zh_CN/compare/{base}...{head}\",\n" +
            "      \"merges_url\": \"https://api.github.com/repos/justjavac/free-programming-books-zh_CN/merges\",\n" +
            "      \"archive_url\": \"https://api.github.com/repos/justjavac/free-programming-books-zh_CN/{archive_format}{/ref}\",\n" +
            "      \"downloads_url\": \"https://api.github.com/repos/justjavac/free-programming-books-zh_CN/downloads\",\n" +
            "      \"issues_url\": \"https://api.github.com/repos/justjavac/free-programming-books-zh_CN/issues{/number}\",\n" +
            "      \"pulls_url\": \"https://api.github.com/repos/justjavac/free-programming-books-zh_CN/pulls{/number}\",\n" +
            "      \"milestones_url\": \"https://api.github.com/repos/justjavac/free-programming-books-zh_CN/milestones{/number}\",\n" +
            "      \"notifications_url\": \"https://api.github.com/repos/justjavac/free-programming-books-zh_CN/notifications{?since,all,participating}\",\n" +
            "      \"labels_url\": \"https://api.github.com/repos/justjavac/free-programming-books-zh_CN/labels{/name}\",\n" +
            "      \"releases_url\": \"https://api.github.com/repos/justjavac/free-programming-books-zh_CN/releases{/id}\",\n" +
            "      \"deployments_url\": \"https://api.github.com/repos/justjavac/free-programming-books-zh_CN/deployments\",\n" +
            "      \"created_at\": \"2013-11-04T01:59:19Z\",\n" +
            "      \"updated_at\": \"2018-08-12T08:36:37Z\",\n" +
            "      \"pushed_at\": \"2018-07-13T10:50:25Z\",\n" +
            "      \"git_url\": \"git://github.com/justjavac/free-programming-books-zh_CN.git\",\n" +
            "      \"ssh_url\": \"git@github.com:justjavac/free-programming-books-zh_CN.git\",\n" +
            "      \"clone_url\": \"https://github.com/justjavac/free-programming-books-zh_CN.git\",\n" +
            "      \"svn_url\": \"https://github.com/justjavac/free-programming-books-zh_CN\",\n" +
            "      \"homepage\": \"http://weibo.com/justjavac\",\n" +
            "      \"size\": 825,\n" +
            "      \"stargazers_count\": 37032,\n" +
            "      \"watchers_count\": 37032,\n" +
            "      \"language\": \"JavaScript\",\n" +
            "      \"has_issues\": true,\n" +
            "      \"has_projects\": true,\n" +
            "      \"has_downloads\": true,\n" +
            "      \"has_wiki\": false,\n" +
            "      \"has_pages\": false,\n" +
            "      \"forks_count\": 12989,\n" +
            "      \"mirror_url\": null,\n" +
            "      \"archived\": false,\n" +
            "      \"open_issues_count\": 148,\n" +
            "      \"license\": {\n" +
            "        \"key\": \"gpl-3.0\",\n" +
            "        \"name\": \"GNU General Public License v3.0\",\n" +
            "        \"spdx_id\": \"GPL-3.0\",\n" +
            "        \"url\": \"https://api.github.com/licenses/gpl-3.0\",\n" +
            "        \"node_id\": \"MDc6TGljZW5zZTk=\"\n" +
            "      },\n" +
            "      \"forks\": 12989,\n" +
            "      \"open_issues\": 148,\n" +
            "      \"watchers\": 37032,\n" +
            "      \"default_branch\": \"master\",\n" +
            "      \"score\": 24.192104\n" +
            "    },\n" +
            "    {\n" +
            "      \"id\": 24953448,\n" +
            "      \"node_id\": \"MDEwOlJlcG9zaXRvcnkyNDk1MzQ0OA==\",\n" +
            "      \"name\": \"material-design-icons\",\n" +
            "      \"full_name\": \"google/material-design-icons\",\n" +
            "      \"owner\": {\n" +
            "        \"login\": \"google\",\n" +
            "        \"id\": 1342004,\n" +
            "        \"node_id\": \"MDEyOk9yZ2FuaXphdGlvbjEzNDIwMDQ=\",\n" +
            "        \"avatar_url\": \"https://avatars1.githubusercontent.com/u/1342004?v=4\",\n" +
            "        \"gravatar_id\": \"\",\n" +
            "        \"url\": \"https://api.github.com/users/google\",\n" +
            "        \"html_url\": \"https://github.com/google\",\n" +
            "        \"followers_url\": \"https://api.github.com/users/google/followers\",\n" +
            "        \"following_url\": \"https://api.github.com/users/google/following{/other_user}\",\n" +
            "        \"gists_url\": \"https://api.github.com/users/google/gists{/gist_id}\",\n" +
            "        \"starred_url\": \"https://api.github.com/users/google/starred{/owner}{/repo}\",\n" +
            "        \"subscriptions_url\": \"https://api.github.com/users/google/subscriptions\",\n" +
            "        \"organizations_url\": \"https://api.github.com/users/google/orgs\",\n" +
            "        \"repos_url\": \"https://api.github.com/users/google/repos\",\n" +
            "        \"events_url\": \"https://api.github.com/users/google/events{/privacy}\",\n" +
            "        \"received_events_url\": \"https://api.github.com/users/google/received_events\",\n" +
            "        \"type\": \"Organization\",\n" +
            "        \"site_admin\": false\n" +
            "      },\n" +
            "      \"private\": false,\n" +
            "      \"html_url\": \"https://github.com/google/material-design-icons\",\n" +
            "      \"description\": \"Material Design icons by Google\",\n" +
            "      \"fork\": false,\n" +
            "      \"url\": \"https://api.github.com/repos/google/material-design-icons\",\n" +
            "      \"forks_url\": \"https://api.github.com/repos/google/material-design-icons/forks\",\n" +
            "      \"keys_url\": \"https://api.github.com/repos/google/material-design-icons/keys{/key_id}\",\n" +
            "      \"collaborators_url\": \"https://api.github.com/repos/google/material-design-icons/collaborators{/collaborator}\",\n" +
            "      \"teams_url\": \"https://api.github.com/repos/google/material-design-icons/teams\",\n" +
            "      \"hooks_url\": \"https://api.github.com/repos/google/material-design-icons/hooks\",\n" +
            "      \"issue_events_url\": \"https://api.github.com/repos/google/material-design-icons/issues/events{/number}\",\n" +
            "      \"events_url\": \"https://api.github.com/repos/google/material-design-icons/events\",\n" +
            "      \"assignees_url\": \"https://api.github.com/repos/google/material-design-icons/assignees{/user}\",\n" +
            "      \"branches_url\": \"https://api.github.com/repos/google/material-design-icons/branches{/branch}\",\n" +
            "      \"tags_url\": \"https://api.github.com/repos/google/material-design-icons/tags\",\n" +
            "      \"blobs_url\": \"https://api.github.com/repos/google/material-design-icons/git/blobs{/sha}\",\n" +
            "      \"git_tags_url\": \"https://api.github.com/repos/google/material-design-icons/git/tags{/sha}\",\n" +
            "      \"git_refs_url\": \"https://api.github.com/repos/google/material-design-icons/git/refs{/sha}\",\n" +
            "      \"trees_url\": \"https://api.github.com/repos/google/material-design-icons/git/trees{/sha}\",\n" +
            "      \"statuses_url\": \"https://api.github.com/repos/google/material-design-icons/statuses/{sha}\",\n" +
            "      \"languages_url\": \"https://api.github.com/repos/google/material-design-icons/languages\",\n" +
            "      \"stargazers_url\": \"https://api.github.com/repos/google/material-design-icons/stargazers\",\n" +
            "      \"contributors_url\": \"https://api.github.com/repos/google/material-design-icons/contributors\",\n" +
            "      \"subscribers_url\": \"https://api.github.com/repos/google/material-design-icons/subscribers\",\n" +
            "      \"subscription_url\": \"https://api.github.com/repos/google/material-design-icons/subscription\",\n" +
            "      \"commits_url\": \"https://api.github.com/repos/google/material-design-icons/commits{/sha}\",\n" +
            "      \"git_commits_url\": \"https://api.github.com/repos/google/material-design-icons/git/commits{/sha}\",\n" +
            "      \"comments_url\": \"https://api.github.com/repos/google/material-design-icons/comments{/number}\",\n" +
            "      \"issue_comment_url\": \"https://api.github.com/repos/google/material-design-icons/issues/comments{/number}\",\n" +
            "      \"contents_url\": \"https://api.github.com/repos/google/material-design-icons/contents/{+path}\",\n" +
            "      \"compare_url\": \"https://api.github.com/repos/google/material-design-icons/compare/{base}...{head}\",\n" +
            "      \"merges_url\": \"https://api.github.com/repos/google/material-design-icons/merges\",\n" +
            "      \"archive_url\": \"https://api.github.com/repos/google/material-design-icons/{archive_format}{/ref}\",\n" +
            "      \"downloads_url\": \"https://api.github.com/repos/google/material-design-icons/downloads\",\n" +
            "      \"issues_url\": \"https://api.github.com/repos/google/material-design-icons/issues{/number}\",\n" +
            "      \"pulls_url\": \"https://api.github.com/repos/google/material-design-icons/pulls{/number}\",\n" +
            "      \"milestones_url\": \"https://api.github.com/repos/google/material-design-icons/milestones{/number}\",\n" +
            "      \"notifications_url\": \"https://api.github.com/repos/google/material-design-icons/notifications{?since,all,participating}\",\n" +
            "      \"labels_url\": \"https://api.github.com/repos/google/material-design-icons/labels{/name}\",\n" +
            "      \"releases_url\": \"https://api.github.com/repos/google/material-design-icons/releases{/id}\",\n" +
            "      \"deployments_url\": \"https://api.github.com/repos/google/material-design-icons/deployments\",\n" +
            "      \"created_at\": \"2014-10-08T18:01:28Z\",\n" +
            "      \"updated_at\": \"2018-08-12T02:21:19Z\",\n" +
            "      \"pushed_at\": \"2018-07-21T20:52:09Z\",\n" +
            "      \"git_url\": \"git://github.com/google/material-design-icons.git\",\n" +
            "      \"ssh_url\": \"git@github.com:google/material-design-icons.git\",\n" +
            "      \"clone_url\": \"https://github.com/google/material-design-icons.git\",\n" +
            "      \"svn_url\": \"https://github.com/google/material-design-icons\",\n" +
            "      \"homepage\": \"http://google.github.io/material-design-icons/\",\n" +
            "      \"size\": 47085,\n" +
            "      \"stargazers_count\": 35668,\n" +
            "      \"watchers_count\": 35668,\n" +
            "      \"language\": \"CSS\",\n" +
            "      \"has_issues\": true,\n" +
            "      \"has_projects\": true,\n" +
            "      \"has_downloads\": false,\n" +
            "      \"has_wiki\": true,\n" +
            "      \"has_pages\": true,\n" +
            "      \"forks_count\": 7096,\n" +
            "      \"mirror_url\": null,\n" +
            "      \"archived\": false,\n" +
            "      \"open_issues_count\": 485,\n" +
            "      \"license\": {\n" +
            "        \"key\": \"apache-2.0\",\n" +
            "        \"name\": \"Apache License 2.0\",\n" +
            "        \"spdx_id\": \"Apache-2.0\",\n" +
            "        \"url\": \"https://api.github.com/licenses/apache-2.0\",\n" +
            "        \"node_id\": \"MDc6TGljZW5zZTI=\"\n" +
            "      },\n" +
            "      \"forks\": 7096,\n" +
            "      \"open_issues\": 485,\n" +
            "      \"watchers\": 35668,\n" +
            "      \"default_branch\": \"master\",\n" +
            "      \"score\": 39.279766\n" +
            "    },\n" +
            "    {\n" +
            "      \"id\": 31792824,\n" +
            "      \"node_id\": \"MDEwOlJlcG9zaXRvcnkzMTc5MjgyNA==\",\n" +
            "      \"name\": \"flutter\",\n" +
            "      \"full_name\": \"flutter/flutter\",\n" +
            "      \"owner\": {\n" +
            "        \"login\": \"flutter\",\n" +
            "        \"id\": 14101776,\n" +
            "        \"node_id\": \"MDEyOk9yZ2FuaXphdGlvbjE0MTAxNzc2\",\n" +
            "        \"avatar_url\": \"https://avatars3.githubusercontent.com/u/14101776?v=4\",\n" +
            "        \"gravatar_id\": \"\",\n" +
            "        \"url\": \"https://api.github.com/users/flutter\",\n" +
            "        \"html_url\": \"https://github.com/flutter\",\n" +
            "        \"followers_url\": \"https://api.github.com/users/flutter/followers\",\n" +
            "        \"following_url\": \"https://api.github.com/users/flutter/following{/other_user}\",\n" +
            "        \"gists_url\": \"https://api.github.com/users/flutter/gists{/gist_id}\",\n" +
            "        \"starred_url\": \"https://api.github.com/users/flutter/starred{/owner}{/repo}\",\n" +
            "        \"subscriptions_url\": \"https://api.github.com/users/flutter/subscriptions\",\n" +
            "        \"organizations_url\": \"https://api.github.com/users/flutter/orgs\",\n" +
            "        \"repos_url\": \"https://api.github.com/users/flutter/repos\",\n" +
            "        \"events_url\": \"https://api.github.com/users/flutter/events{/privacy}\",\n" +
            "        \"received_events_url\": \"https://api.github.com/users/flutter/received_events\",\n" +
            "        \"type\": \"Organization\",\n" +
            "        \"site_admin\": false\n" +
            "      },\n" +
            "      \"private\": false,\n" +
            "      \"html_url\": \"https://github.com/flutter/flutter\",\n" +
            "      \"description\": \"Flutter makes it easy and fast to build beautiful mobile apps.\",\n" +
            "      \"fork\": false,\n" +
            "      \"url\": \"https://api.github.com/repos/flutter/flutter\",\n" +
            "      \"forks_url\": \"https://api.github.com/repos/flutter/flutter/forks\",\n" +
            "      \"keys_url\": \"https://api.github.com/repos/flutter/flutter/keys{/key_id}\",\n" +
            "      \"collaborators_url\": \"https://api.github.com/repos/flutter/flutter/collaborators{/collaborator}\",\n" +
            "      \"teams_url\": \"https://api.github.com/repos/flutter/flutter/teams\",\n" +
            "      \"hooks_url\": \"https://api.github.com/repos/flutter/flutter/hooks\",\n" +
            "      \"issue_events_url\": \"https://api.github.com/repos/flutter/flutter/issues/events{/number}\",\n" +
            "      \"events_url\": \"https://api.github.com/repos/flutter/flutter/events\",\n" +
            "      \"assignees_url\": \"https://api.github.com/repos/flutter/flutter/assignees{/user}\",\n" +
            "      \"branches_url\": \"https://api.github.com/repos/flutter/flutter/branches{/branch}\",\n" +
            "      \"tags_url\": \"https://api.github.com/repos/flutter/flutter/tags\",\n" +
            "      \"blobs_url\": \"https://api.github.com/repos/flutter/flutter/git/blobs{/sha}\",\n" +
            "      \"git_tags_url\": \"https://api.github.com/repos/flutter/flutter/git/tags{/sha}\",\n" +
            "      \"git_refs_url\": \"https://api.github.com/repos/flutter/flutter/git/refs{/sha}\",\n" +
            "      \"trees_url\": \"https://api.github.com/repos/flutter/flutter/git/trees{/sha}\",\n" +
            "      \"statuses_url\": \"https://api.github.com/repos/flutter/flutter/statuses/{sha}\",\n" +
            "      \"languages_url\": \"https://api.github.com/repos/flutter/flutter/languages\",\n" +
            "      \"stargazers_url\": \"https://api.github.com/repos/flutter/flutter/stargazers\",\n" +
            "      \"contributors_url\": \"https://api.github.com/repos/flutter/flutter/contributors\",\n" +
            "      \"subscribers_url\": \"https://api.github.com/repos/flutter/flutter/subscribers\",\n" +
            "      \"subscription_url\": \"https://api.github.com/repos/flutter/flutter/subscription\",\n" +
            "      \"commits_url\": \"https://api.github.com/repos/flutter/flutter/commits{/sha}\",\n" +
            "      \"git_commits_url\": \"https://api.github.com/repos/flutter/flutter/git/commits{/sha}\",\n" +
            "      \"comments_url\": \"https://api.github.com/repos/flutter/flutter/comments{/number}\",\n" +
            "      \"issue_comment_url\": \"https://api.github.com/repos/flutter/flutter/issues/comments{/number}\",\n" +
            "      \"contents_url\": \"https://api.github.com/repos/flutter/flutter/contents/{+path}\",\n" +
            "      \"compare_url\": \"https://api.github.com/repos/flutter/flutter/compare/{base}...{head}\",\n" +
            "      \"merges_url\": \"https://api.github.com/repos/flutter/flutter/merges\",\n" +
            "      \"archive_url\": \"https://api.github.com/repos/flutter/flutter/{archive_format}{/ref}\",\n" +
            "      \"downloads_url\": \"https://api.github.com/repos/flutter/flutter/downloads\",\n" +
            "      \"issues_url\": \"https://api.github.com/repos/flutter/flutter/issues{/number}\",\n" +
            "      \"pulls_url\": \"https://api.github.com/repos/flutter/flutter/pulls{/number}\",\n" +
            "      \"milestones_url\": \"https://api.github.com/repos/flutter/flutter/milestones{/number}\",\n" +
            "      \"notifications_url\": \"https://api.github.com/repos/flutter/flutter/notifications{?since,all,participating}\",\n" +
            "      \"labels_url\": \"https://api.github.com/repos/flutter/flutter/labels{/name}\",\n" +
            "      \"releases_url\": \"https://api.github.com/repos/flutter/flutter/releases{/id}\",\n" +
            "      \"deployments_url\": \"https://api.github.com/repos/flutter/flutter/deployments\",\n" +
            "      \"created_at\": \"2015-03-06T22:54:58Z\",\n" +
            "      \"updated_at\": \"2018-08-12T07:19:51Z\",\n" +
            "      \"pushed_at\": \"2018-08-12T07:54:45Z\",\n" +
            "      \"git_url\": \"git://github.com/flutter/flutter.git\",\n" +
            "      \"ssh_url\": \"git@github.com:flutter/flutter.git\",\n" +
            "      \"clone_url\": \"https://github.com/flutter/flutter.git\",\n" +
            "      \"svn_url\": \"https://github.com/flutter/flutter\",\n" +
            "      \"homepage\": \"https://flutter.io\",\n" +
            "      \"size\": 43665,\n" +
            "      \"stargazers_count\": 34923,\n" +
            "      \"watchers_count\": 34923,\n" +
            "      \"language\": \"Dart\",\n" +
            "      \"has_issues\": true,\n" +
            "      \"has_projects\": true,\n" +
            "      \"has_downloads\": true,\n" +
            "      \"has_wiki\": true,\n" +
            "      \"has_pages\": false,\n" +
            "      \"forks_count\": 3222,\n" +
            "      \"mirror_url\": null,\n" +
            "      \"archived\": false,\n" +
            "      \"open_issues_count\": 3778,\n" +
            "      \"license\": {\n" +
            "        \"key\": \"other\",\n" +
            "        \"name\": \"Other\",\n" +
            "        \"spdx_id\": null,\n" +
            "        \"url\": null,\n" +
            "        \"node_id\": \"MDc6TGljZW5zZTA=\"\n" +
            "      },\n" +
            "      \"forks\": 3222,\n" +
            "      \"open_issues\": 3778,\n" +
            "      \"watchers\": 34923,\n" +
            "      \"default_branch\": \"master\",\n" +
            "      \"score\": 42.936787\n" +
            "    }]}";
}
