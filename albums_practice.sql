CREATE TABLE artist(
a_id INT PRIMARY KEY,
name varchar(40)
);

CREATE TABLE genre(
g_id INT PRIMARY KEY,
name varchar(20)
);

CREATE TABLE album(
alb_id INT primary key,
name varchar(40),
a_id INT,
FOREIGN KEY (a_id) REFERENCES artist(a_id)
);

CREATE TABLE track(
t_id INT primary key,
name varchar(40),
composer varchar(60),
alb_id INT,
g_id INT,
foreign key (alb_id) references album(alb_id),
foreign key (g_id) references genre(g_id)
);

INSERT INTO genre(g_id,name) VALUES
(1,'rock'),(2,'jazz'),(3,'metal'),(4,'alternative and punk'),(5,'rockANDroll'),(6,'Blues'),(7,'Lati'),(8,'Reggae'),(9,'Pop'),(10,'SoundTrack');

INSERT INTO artist(a_id,name) VALUES
(1,'AC/DC'),(2,'Accept'),(3,'Aerosmith'),(4,'Alanis Morissette'),(5,'AliceInChains'),(6,'AntoniosCarlosJobim'),(7,'Apocalyptica'),(8,'Audioslave'),(9,'BackBeat'),(10,'BillyCobham');

INSERT INTO album(alb_id,name,a_id) VALUES
(1, 'for those about to rock we salute you',1),
(2,'balls to the wall',2),
(3,'restless and wild',2),
(4,'let them be rock',1),
(5,'big ones',3),
(6,'jagged little pill',4),
(7,'facelift',5),
(8,'warner 25 anos',6),
(9,'plays mettalica by 4 cellos',7),
(10,'audioslave',8),
(11,'out of exile',8),
(12,'backbeat soundtrack',9),
(13,'the best of billy cobham',10);

INSERT INTO track(t_id,alb_id,g_id,name,composer) VALUES
(1,1,1,'For Those About To Rock (We Salute You)','Angus Young. Malcolm Young. Brian Johnson'),
(2,2,1,'Balls to the Wall','NULL'),
(3,3,1,'Fast As a Shark','F. Baltes, S. Kaufman, U. Dirkscneider & W. Hoffman'),
(4,3,1,'Restless and Wild','F. Baltes, R.A. Smith-Diesel, S. Kaufman, U. Dirks...'),
(5,3,1,'Princess of the Daw','Deaffy & R.A. Smith-Diesel'),
(6,1,1,'Put The Finger On You','Angus Young. Malcolm Young, Brian Johnso'),
(7,1,2,'Let''s Get It Up','Angus Young. Malcolm Young, Brian Johnso'),
(8,1,1,'Inject The Venom','Angus Young. Malcolm Young, Brian Johnso'),
(9,1,1,'Snowballed','Angus Young. Malcolm Young, Brian Johnso'),
(10,1,1,'Evil Walks','Angus Young. Malcolm Young, Brian Johnso'),
(11,1,1,'C.O.D.','Angus Young. Malcolm Young, Brian Johnso'),
(12,1,3,'Breaking The Rules','Angus Young. Malcolm Young, Brian Johnso'),
(13,1,2,'Night Of The Long Knives','Angus Young. Malcolm Young, Brian Johnso'),
(14,1,3,'Spellbound','Angus Young. Malcolm Young, Brian Johnso'),
(15,4,5,'Go Dow','AC/DC'),
(16,4,6,'Dog Eat Dog','AC/DC'),
(17,4,2,'Let There Be Rock','AC/DC'),
(18,4,3,'Bad Boy Boogie','AC/DC'),
(19,4,7,'Problem Child','AC/DC'),
(20,4,1,'Overdose','AC/DC'),
(21,4,1,'Hell Ai''t A Bad Place To Be.','AC/DC');

----

SELECT 
    album.name AS AlbumTitle,
    COUNT(track.t_id) AS NoOfTracks
FROM 
    album
RIGHT JOIN 
    track ON album.alb_id = track.alb_id
GROUP BY 
    album.name
ORDER BY 
    NoOfTracks ASC;

----

SELECT artist.name AS ArtistName, album.name AS AlbumTitle 
FROM artist JOIN album ON album.a_id = artist.a_id 
WHERE artist.name LIKE '%m' ORDER BY artist.name ASC;

----