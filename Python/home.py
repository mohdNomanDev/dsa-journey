name = "Mohd Noman"

print("Name:", name)
print("Length:", len(name))
print("Uppercase:", name.upper())
print("Lowercase:", name.lower())
print("First 4 characters:", name[:4])


# -------------------------
# 2. Collections
# -------------------------

skills = ["Python", "Java", "MERN", "Git"]

print("\nMy Skills:")

for skill in skills:
    print("-", skill)


# Dictionary
developer = {
    "name": "Mohd Noman",
    "experience": "Learning",
    "language": "Python"
}

print("\nDeveloper Information:")
print("Name:", developer["name"])
print("Language:", developer["language"])


# Set
technologies = {"Python", "Java", "Python", "MERN"}

print("\nUnique Technologies:")
print(technologies)


# -------------------------
# 3. Decision Making
# -------------------------

score = 85

print("\nResult:")

if score >= 90:
    print("Excellent")
elif score >= 75:
    print("Good")
elif score >= 50:
    print("Passed")
else:
    print("Needs Improvement")