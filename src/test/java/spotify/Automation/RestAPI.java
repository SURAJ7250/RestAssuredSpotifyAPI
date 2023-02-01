package spotify.Automation;

import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import io.restassured.response.Response;

import io.restassured.RestAssured;

public class RestAPI 
{
	public String token;
	String userId;
	@BeforeMethod
	public void setup() {
        token="Bearer BQAXXvF_E4ZzTOlngq2A_kGV2sjWdd19MW5SzBF"
        		+ "BJVtR77ImwCuisS4gUeiOB-1d2rDU9pb49jjqLScKy"
        		+ "3bTWlJXQoOx5XRAkZOGvEZnz6gjpiskuuJVpRIodF"
        		+ "TIEO33dQ357tB4i5UHjaHhTRY9-HM0vlbfiAA6OH6L"
        		+ "ZnOecJrGXzXdQnhjJYfOWvEdfswSW3BcXQRzqNG5_-Ev"
        		+ "j3GvEp6ozuoAM07AU6rTnsI1aYF7GdxFJRxkfd"
        		+ "UDfCKVBx1l5cZyQy62mbo";
	}
	@Test(priority=1)
 public void userId() 
	{
	     Response res = RestAssured.given()
			 .header("Accept","application/json")
			 .header("Content-Type","application/json")
			 .header("Authorization",token)
			 .when()
			 .get("https://api.spotify.com/v1/me");
			 res.prettyPrint();
			 res.then().statusCode(200);
			 Assert.assertEquals(res.statusCode(),200);
			 userId=res.path("id");
			 String name = res.path("display_name");
			 System.out.println(name);
 }
	@Test(priority=2)
	public void GetUserProfile() 
	{
	     Response res = RestAssured.given()
			 .header("Accept","application/json")
			 .header("Content-Type","application/json")
			 .header("Authorization",token)
			 .when()
			 .get("https://api.spotify.com/v1/users/"+userId);
			 res.prettyPrint();
			 res.then().statusCode(200);
			 Assert.assertEquals(res.statusCode(),200);
			 //userId=res.path("id");
			 String name = res.path("display_name");
			 System.out.println(name);
 }
	@Test
	public void GetTracks() 
	{
	     Response res = RestAssured.given()
			 .header("Accept","application/json")
			 .header("Content-Type","application/json")
			 .header("Authorization",token)
			 .when()
			 .get("https://api.spotify.com/v1/tracks/11dFghVXANMlKmJXsNCbNl");
			 res.prettyPrint();
			 res.then().statusCode(200);
			 Assert.assertEquals(res.statusCode(),200);
 }
	@Test
	public void GetSeveralTracks() 
	{
	     Response res = RestAssured.given()
			 .header("Accept","application/json")
			 .header("Content-Type","application/json")
			 .header("Authorization",token)
			 .when()
			 .get("https://api.spotify.com/v1/tracks?ids=7ouMYWpwJ422jRcDASZB7P%2C4VqPOruhp5EdPBeR92t6lQ%2C2takcwOaAZWiXQijPHIx7B");
			 res.prettyPrint();
			 res.then().statusCode(200);
			 Assert.assertEquals(res.statusCode(),200);
 }
	@Test
	public void GetAudioTracksFeatures() 
	{
	     Response res = RestAssured.given()
			 .header("Accept","application/json")
			 .header("Content-Type","application/json")
			 .header("Authorization",token)
			 .when()
			 .get("https://api.spotify.com/v1/audio-features/11dFghVXANMlKmJXsNCbNl");
			 res.prettyPrint();
			 res.then().statusCode(200);
			 Assert.assertEquals(res.statusCode(),200);
 }
	@Test
	public void GetAudioTracksFeatured() 
	{
	     Response res = RestAssured.given()
			 .header("Accept","application/json")
			 .header("Content-Type","application/json")
			 .header("Authorization",token)
			 .when()
			 .get("https://api.spotify.com/v1/audio-features?ids=7ouMYWpwJ422jRcDASZB7P%2C4VqPOruhp5EdPBeR92t6lQ%2C2takcwOaAZWiXQijPHIx7B");
			 res.prettyPrint();
			 res.then().statusCode(200);
			 Assert.assertEquals(res.statusCode(),200);
 }
	@Test
	public void GetTracksAudioAnalysis() 
	{
	     Response res = RestAssured.given()
			 .header("Accept","application/json")
			 .header("Content-Type","application/json")
			 .header("Authorization",token)
			 .when()
			 .get("https://api.spotify.com/v1/audio-analysis/11dFghVXANMlKmJXsNCbNl");
			 res.prettyPrint();
			 res.then().statusCode(200);
			 Assert.assertEquals(res.statusCode(),200);
 }
	@Test
	public void GetShow() 
	{
	     Response res = RestAssured.given()
			 .header("Accept","application/json")
			 .header("Content-Type","application/json")
			 .header("Authorization",token)
			 .when()
			 .get("https://api.spotify.com/v1/shows/38bS44xjbVVZ3No3ByF1dJ");
			 res.prettyPrint();
			 res.then().statusCode(200);
			 Assert.assertEquals(res.statusCode(),200);
 }
	@Test
	public void GetShowEpisodes() 
	{
	     Response res = RestAssured.given()
			 .header("Accept","application/json")
			 .header("Content-Type","application/json")
			 .header("Authorization",token)
			 .when()
			 .get("https://api.spotify.com/v1/shows/38bS44xjbVVZ3No3ByF1dJ/episodes");
			 res.prettyPrint();
			 res.then().statusCode(200);
			 Assert.assertEquals(res.statusCode(),200);
 }
	@Test
	public void GetSeveralShow() 
	{
	     Response res = RestAssured.given()
			 .header("Accept","application/json")
			 .header("Content-Type","application/json")
			 .header("Authorization",token)
			 .when()
			 .get("https://api.spotify.com/v1/shows?ids=5as3aKmN2k11yfDDDSrvaZ");
			 res.prettyPrint();
			 res.then().statusCode(200);
			 Assert.assertEquals(res.statusCode(),200);
 }
	@Test
	public void GetcurrentUserPlaylist() 
	{
	     Response res = RestAssured.given()
			 .header("Accept","application/json")
			 .header("Content-Type","application/json")
			 .header("Authorization",token)
			 .when()
			 .get("https://api.spotify.com/v1/me/playlists");
			 res.prettyPrint();
			 res.then().statusCode(200);
			 Assert.assertEquals(res.statusCode(),200);
 }
	@Test
	public void GetPlaylistcoverImage() 
	{
	     Response res = RestAssured.given()
			 .header("Accept","application/json")
			 .header("Content-Type","application/json")
			 .header("Authorization",token)
			 .when()
			 .get("https://api.spotify.com/v1/playlists/3cEYpjA9oz9GiPac4AsH4n/images");
			 res.prettyPrint();
			 res.then().statusCode(200);
			 Assert.assertEquals(res.statusCode(),200);
 }
	@Test
	public void GetPlaylistItems() 
	{
	     Response res = RestAssured.given()
			 .header("Accept","application/json")
			 .header("Content-Type","application/json")
			 .header("Authorization",token)
			 .when()
			 .get("https://api.spotify.com/v1/playlists/3cEYpjA9oz9GiPac4AsH4n/tracks");
			 res.prettyPrint();
			 res.then().statusCode(200);
			 Assert.assertEquals(res.statusCode(),200);
 }
	@Test
	public void GetPlaylist() 
	{
	     Response res = RestAssured.given()
			 .header("Accept","application/json")
			 .header("Content-Type","application/json")
			 .header("Authorization",token)
			 .when()
			 .get("https://api.spotify.com/v1/playlists/3cEYpjA9oz9GiPac4AsH4n");
			 res.prettyPrint();
			 res.then().statusCode(200);
			 Assert.assertEquals(res.statusCode(),200);
 }
	@Test
	public void GetuserPlaylist() 
	{
	     Response res = RestAssured.given()
			 .header("Accept","application/json")
			 .header("Content-Type","application/json")
			 .header("Authorization",token)
			 .when()
			 .get("https://api.spotify.com/v1/users/userId/playlists");
			 res.prettyPrint();
			 userId=res.path("id");
			 res.then().statusCode(200);
			 Assert.assertEquals(res.statusCode(),200);
 }
	@Test
	public void AddPlaylistItems() 
	{
	     Response res = RestAssured.given()
			 .header("Accept","application/json")
			 .header("Content-Type","application/json")
			 .header("Authorization",token)
			 .when()
			 .get("https://api.spotify.com/v1/users/userId/playlists");
			 res.prettyPrint();
			 userId=res.path("id");
			 res.then().statusCode(200);
			 Assert.assertEquals(res.statusCode(),200);
 }
	@Test
	public void CreatePlaylist() 
	{
	     Response res = RestAssured.given()
			 .header("Accept","application/json")
			 .header("Content-Type","application/json")
			 .header("Authorization",token)
			 .body("{\"name\":\"Suraj Playlist\",\"description\":\"New playlist description\",\"public\":false}")
			 .when()
			 .post("https://api.spotify.com/v1/users/312rg6w5mgbm2ugo4xvr7eoo7hni/playlists");
			 res.prettyPrint();
			 res.then().statusCode(201);
			 Assert.assertEquals(res.statusCode(),201);
 }
	@Test
	public void UpdatePlaylistItems() 
	{
	     Response res = RestAssured.given()
			 .header("Accept","application/json")
			 .header("Content-Type","application/json")
			 .header("Authorization",token)
			 .body("{\"range_start\":1,\"insert_before\":3,\"range_length\":2}")
			 .when()
			 .put("https://api.spotify.com/v1/playlists/5t5dPpvYefZqsECqnJQIKa/tracks");
			 res.prettyPrint();
			 res.then().statusCode(400);
			 Assert.assertEquals(res.statusCode(),400);
 }
	@Test
	public void ChangePlaylistDetails() 
	{
	     Response res = RestAssured.given()
			 .header("Accept","application/json")
			 .header("Content-Type","application/json")
			 .header("Authorization",token)
			 .body("{\"name\":\"Shivam Playlist Name\",\"description\":\"Updated playlist description\",\"public\":false}")
			 .when()
			 .put("https://api.spotify.com/v1/playlists/5t5dPpvYefZqsECqnJQIKa");
			 res.prettyPrint();
			 res.then().statusCode(200);
			 Assert.assertEquals(res.statusCode(),200);
 }
	public void RemovePlaylistItems() 
	{
	     Response res = RestAssured.given()
			 .header("Accept","application/json")
			 .header("Content-Type","application/json")
			 .header("Authorization",token)
			 .body("{\"tracks\\\":[{\"uri\":\"spotify:track:4iV5W9uYEdYUVa79Axb7Rh\"},{\"uri\":\"spotify:track:1301WleyT98MSxVHPZCA6M\"}]}")
			 .when()
			 .delete("https://api.spotify.com/v1/playlists/5t5dPpvYefZqsECqnJQIKa/tracks");
			 res.prettyPrint();
			 res.then().statusCode(200);
			 Assert.assertEquals(res.statusCode(),200);
 }
	@Test
	public void SearchForItems_pathParam()
	{
        Response res = RestAssured.given()
                .header("Accept","application/json")
                .header("Content-Type","application/json")
                .header("Authorization",token)
                .pathParam("q","artist")
                .pathParam("type","track")
                .when()
                .get("https://api.spotify.com/v1/search?q={q}&type={type}");
                res.prettyPrint();
                res.then().statusCode(200);            
                Assert.assertEquals(res.statusCode(),200);    
   }
	@Test
	public void SearchForItems_queryParam()
	{
        Response res = RestAssured.given()
                .header("Accept","application/json")
                .header("Content-Type","application/json")
                .header("Authorization",token)
                .queryParam("q","artist")
                .queryParam("type","track")
                .when()
                .get("https://api.spotify.com/v1/search");
                res.prettyPrint();
                res.then().statusCode(200);            
                Assert.assertEquals(res.statusCode(),200);    
   }
	@Test
	public void GetRecentlyPlayedTracks() 
	{
	     Response res = RestAssured.given()
			 .header("Accept","application/json")
			 .header("Content-Type","application/json")
			 .header("Authorization",token)
			 .when()
			 .get("https://api.spotify.com/v1/me/player/recently-played");
			 res.prettyPrint();
			 res.then().statusCode(403);
			 Assert.assertEquals(res.statusCode(),403);
 }
	@Test
	public void GetAvailableDevices() 
	{
	     Response res = RestAssured.given()
			 .header("Accept","application/json")
			 .header("Content-Type","application/json")
			 .header("Authorization",token)
			 .when()
			 .get("https://api.spotify.com/v1/me/player/devices");
			 res.prettyPrint();
			 res.then().statusCode(200);
			 Assert.assertEquals(res.statusCode(),200);
 }
	@Test
	public void SkiptoNextPost() 
	{
	     Response res = RestAssured.given()
			 .header("Accept","application/json")
			 .header("Content-Type","application/json")
			 .header("Authorization",token)
			 .when()
			 .post("https://api.spotify.com/v1/me/player/next?device_id=0d1841b0976bae2a3a310dd74c0f3df354899bc8");
			 res.prettyPrint();
			 res.then().statusCode(403);
			 Assert.assertEquals(res.statusCode(),403);
 }
	@Test
	public void SkiptoPreviousPost() 
	{
	     Response res = RestAssured.given()
			 .header("Accept","application/json")
			 .header("Content-Type","application/json")
			 .header("Authorization",token)
			 .when()
			 .post("https://api.spotify.com/v1/me/player/previous?device_id=0d1841b0976bae2a3a310dd74c0f3df354899bc8");
			 res.prettyPrint();
			 res.then().statusCode(403);
			 Assert.assertEquals(res.statusCode(),403);
 }
	@Test
	public void GetUserTopItems() 
	{
	     Response res = RestAssured.given()
			 .header("Accept","application/json")
			 .header("Content-Type","application/json")
			 .header("Authorization",token)
			 .when()
			 .get("https://api.spotify.com/v1/me/top/artists");
			 res.prettyPrint();
			 res.then().statusCode(403);
			 Assert.assertEquals(res.statusCode(),403);
 }
	@Test
	public void GetAvailableMarkets() 
	{
	     Response res = RestAssured.given()
			 .header("Accept","application/json")
			 .header("Content-Type","application/json")
			 .header("Authorization",token)
			 .when()
			 .get("https://api.spotify.com/v1/markets");
			 res.prettyPrint();
			 res.then().statusCode(200);
			 Assert.assertEquals(res.statusCode(),200);
 }
	@Test
	public void CheckIfUserFollowsArtistsorUsers() 
	{
	     Response res = RestAssured.given()
			 .header("Accept","application/json")
			 .header("Content-Type","application/json")
			 .header("Authorization",token)
			 .when()
			 .get("https://api.spotify.com/v1/me/following/contains?type=artist&ids=74ASZWbe4lXaubB36ztrGX%2C08td7MxkoHQkXnWAYD8d6Q");
			 res.prettyPrint();
			 res.then().statusCode(400);
			 Assert.assertEquals(res.statusCode(),400);
 }
	@Test
	public void GetFollowedArtists() 
	{
	     Response res = RestAssured.given()
			 .header("Accept","application/json")
			 .header("Content-Type","application/json")
			 .header("Authorization",token)
			 .when()
			 .get("https://api.spotify.com/v1/me/following?type=artist&after=0I2XqVXqHScXjHhk6AYYRe");
			 res.prettyPrint();
			 res.then().statusCode(200);
			 Assert.assertEquals(res.statusCode(),200);
 }
	@Test
	public void CheckifUsersFollowPlaylist() 
	{
	     Response res = RestAssured.given()
			 .header("Accept","application/json")
			 .header("Content-Type","application/json")
			 .header("Authorization",token)
			 .when()
			 .get("https://api.spotify.com/v1/playlists/3cEYpjA9oz9GiPac4AsH4n/followers/contains?ids=jmperezperez%2Cthelinmichael%2Cwizzler");
			 res.prettyPrint();
			 res.then().statusCode(502);
			 Assert.assertEquals(res.statusCode(),502);
 }
	@Test
	public void FollowPlaylist() 
	{
	     Response res = RestAssured.given()
			 .header("Accept","application/json")
			 .header("Content-Type","application/json")
			 .header("Authorization",token)
			 .body("{\"public\":false}")
			 .when()
			 .put("https://api.spotify.com/v1/playlists/3cEYpjA9oz9GiPac4AsH4n/followers");
			 res.prettyPrint();
			 res.then().statusCode(200);
			 Assert.assertEquals(res.statusCode(),200);
 }
	@Test
	public void GetEpisode() 
	{
	     Response res = RestAssured.given()
			 .header("Accept","application/json")
			 .header("Content-Type","application/json")
			 .header("Authorization",token)
			 .when()
			 .get("https://api.spotify.com/v1/episodes/512ojhOuo1ktJprKbVcKyQ");
			 res.prettyPrint();
			 res.then().statusCode(200);
			 Assert.assertEquals(res.statusCode(),200);
 }
	@Test
	public void GetSeveralEpisode() 
	{
	     Response res = RestAssured.given()
			 .header("Accept","application/json")
			 .header("Content-Type","application/json")
			 .header("Authorization",token)
			 .when()
			 .get("https://api.spotify.com/v1/episodes?ids=77o6BIVlYM3msb4MMIL1jH%2C0Q86acNRm6V9GYx55SXKwf");
			 res.prettyPrint();
			 res.then().statusCode(400);
			 Assert.assertEquals(res.statusCode(),400);
 }
	@Test
	public void GetSeveralChapters() 
	{
	     Response res = RestAssured.given()
			 .header("Accept","application/json")
			 .header("Content-Type","application/json")
			 .header("Authorization",token)
			 .when()
			 .get("https://api.spotify.com/v1/chapters?ids=7ouMYWpwJ422jRcDASZB7P%2C4VqPOruhp5EdPBeR92t6lQ%2C2takcwOaAZWiXQijPHIx7B");
			 res.prettyPrint();
			 res.then().statusCode(200);
			 Assert.assertEquals(res.statusCode(),200);
 }
	@Test
	public void GetAvailableBrowseSeeds() 
	{
	     Response res = RestAssured.given()
			 .header("Accept","application/json")
			 .header("Content-Type","application/json")
			 .header("Authorization",token)
			 .when()
			 .get("https://api.spotify.com/v1/recommendations/available-genre-seeds");
			 res.prettyPrint();
			 res.then().statusCode(200);
			 Assert.assertEquals(res.statusCode(),200);
 }
	@Test
	public void GetSeveralBrowseCategories() 
	{
	     Response res = RestAssured.given()
			 .header("Accept","application/json")
			 .header("Content-Type","application/json")
			 .header("Authorization",token)
			 .when()
			 .get("https://api.spotify.com/v1/browse/categories");
			 res.prettyPrint();
			 res.then().statusCode(200);
			 Assert.assertEquals(res.statusCode(),200);
 }
	@Test
	public void GetSingleBrowseCategory() 
	{
	     Response res = RestAssured.given()
			 .header("Accept","application/json")
			 .header("Content-Type","application/json")
			 .header("Authorization",token)
			 .when()
			 .get("https://api.spotify.com/v1/browse/categories/dinner");
			 res.prettyPrint();
			 res.then().statusCode(200);
			 Assert.assertEquals(res.statusCode(),200);
 }
	@Test
	public void GetBrowseCategoryPlaylist() 
	{
	     Response res = RestAssured.given()
			 .header("Accept","application/json")
			 .header("Content-Type","application/json")
			 .header("Authorization",token)
			 .when()
			 .get("https://api.spotify.com/v1/browse/categories/dinner/playlists");
			 res.prettyPrint();
			 res.then().statusCode(200);
			 Assert.assertEquals(res.statusCode(),200);
 }
	@Test
	public void GetFeaturedBrowsePlaylist() 
	{
	     Response res = RestAssured.given()
			 .header("Accept","application/json")
			 .header("Content-Type","application/json")
			 .header("Authorization",token)
			 .when()
			 .get("https://api.spotify.com/v1/browse/featured-playlists");
			 res.prettyPrint();
			 res.then().statusCode(200);
			 Assert.assertEquals(res.statusCode(),200);
 }
	@Test
	public void GetNewRealsesBrowse() 
	{
	     Response res = RestAssured.given()
			 .header("Accept","application/json")
			 .header("Content-Type","application/json")
			 .header("Authorization",token)
			 .when()
			 .get("https://api.spotify.com/v1/browse/new-releases");
			 res.prettyPrint();
			 res.then().statusCode(200);
			 Assert.assertEquals(res.statusCode(),200);
 }
	@Test
	public void GetBrowseRecommendations() 
	{
	     Response res = RestAssured.given()
			 .header("Accept","application/json")
			 .header("Content-Type","application/json")
			 .header("Authorization",token)
			 .when()
			 .get("https://api.spotify.com/v1/recommendations?seed_artists=4NHQUGzhtTLFvgF5SZesLK&seed_genres=classical%2Ccountry&seed_tracks=0c6xIDDpzE81m2q797ordA");
			 res.prettyPrint();
			 res.then().statusCode(200);
			 Assert.assertEquals(res.statusCode(),200);
 }
	@Test
	public void GetSeveralAudiobooks() 
	{
	     Response res = RestAssured.given()
			 .header("Accept","application/json")
			 .header("Content-Type","application/json")
			 .header("Authorization",token)
			 .when()
			 .get("https://api.spotify.com/v1/audiobooks?ids=7ouMYWpwJ422jRcDASZB7P%2C4VqPOruhp5EdPBeR92t6lQ%2C2takcwOaAZWiXQijPHIx7B");
			 res.prettyPrint();
			 res.then().statusCode(200);
			 Assert.assertEquals(res.statusCode(),200);
 }
	@Test
	public void GetArtistAlbums() 
	{
	     Response res = RestAssured.given()
			 .header("Accept","application/json")
			 .header("Content-Type","application/json")
			 .header("Authorization",token)
			 .when()
			 .get("https://api.spotify.com/v1/artists/0TnOYISbd1XYRBk9myaseg/albums");
			 res.prettyPrint();
			 res.then().statusCode(200);
			 Assert.assertEquals(res.statusCode(),200);
 }
	@Test
	public void GetArtistRelatedArtists() 
	{
	     Response res = RestAssured.given()
			 .header("Accept","application/json")
			 .header("Content-Type","application/json")
			 .header("Authorization",token)
			 .when()
			 .get("https://api.spotify.com/v1/artists/0TnOYISbd1XYRBk9myaseg/related-artists");
			 res.prettyPrint();
			 res.then().statusCode(200);
			 Assert.assertEquals(res.statusCode(),200);
 }
	@Test
	public void GetArtist() 
	{
	     Response res = RestAssured.given()
			 .header("Accept","application/json")
			 .header("Content-Type","application/json")
			 .header("Authorization",token)
			 .when()
			 .get("https://api.spotify.com/v1/artists/0TnOYISbd1XYRBk9myaseg");
			 res.prettyPrint();
			 res.then().statusCode(200);
			 Assert.assertEquals(res.statusCode(),200);
 }
	@Test
	public void GetSeveralArtist() 
	{
	     Response res = RestAssured.given()
			 .header("Accept","application/json")
			 .header("Content-Type","application/json")
			 .header("Authorization",token)
			 .when()
			 .get("https://api.spotify.com/v1/artists?ids=2CIMQHirSU0MQqyYHq0eOx%2C57dN52uHvrHOxijzpIgu3E%2C1vCWHaC5f2uS3yhpwWbIA6");
			 res.prettyPrint();
			 res.then().statusCode(400);
			 Assert.assertEquals(res.statusCode(),400);
 }
	@Test
	public void GetAlbumsTrack() 
	{
	     Response res = RestAssured.given()
			 .header("Accept","application/json")
			 .header("Content-Type","application/json")
			 .header("Authorization",token)
			 .when()
			 .get("https://api.spotify.com/v1/albums/4aawyAB9vmqN3uQ7FjRGTy/tracks");
			 res.prettyPrint();
			 res.then().statusCode(200);
			 Assert.assertEquals(res.statusCode(),200);
 }
	@Test
	public void GetAlbums() 
	{
	     Response res = RestAssured.given()
			 .header("Accept","application/json")
			 .header("Content-Type","application/json")
			 .header("Authorization",token)
			 .when()
			 .get("https://api.spotify.com/v1/albums/4aawyAB9vmqN3uQ7FjRGTy");
			 res.prettyPrint();
			 res.then().statusCode(200);
			 Assert.assertEquals(res.statusCode(),200);
 }
}