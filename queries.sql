## Part 1: Test it with SQL
id int
name varchar((75))
## Part 2: Test it with SQL
SELECT * FROM techjobs.employer
where (location="St. Louis City");
## Part 3: Test it with SQL
DROP TABLE job;
## Part 4: Test it with SQL
SELECT Name, description from techjobs.skill
INNER JOIN job_skills on skill.id=job_skills.skills_id
WHERE jobs_id IS NOT NULL
ORDER BY name;