package seedu.address.model.util;

import java.util.Arrays;
import java.util.Set;
import java.util.stream.Collectors;

import seedu.address.model.AddressBook;
import seedu.address.model.ReadOnlyAddressBook;
import seedu.address.model.application.Application;
import seedu.address.model.application.HrEmail;
import seedu.address.model.application.Phone;
import seedu.address.model.application.Role;
import seedu.address.model.tag.Tag;

/**
 * Contains utility methods for populating {@code AddressBook} with sample data.
 */
public class SampleDataUtil {
    public static Application[] getSampleApplications() {
        return new Application[] {
            new Application(new Role("Software Engineer Intern"),
                new Phone("87438807"), new HrEmail("alexyeoh@example.com"),
                getTagSet("friends")),
            new Application(new Role("Data Analyst Intern"),
                new Phone("99272758"), new HrEmail("berniceyu@example.com"),
                getTagSet("colleagues", "friends")),
            new Application(new Role("Frontend Developer Intern"),
                new Phone("93210283"), new HrEmail("charlotte@example.com"),
                getTagSet("neighbours")),
            new Application(new Role("Backend Developer Intern"),
                new Phone("91031282"), new HrEmail("lidavid@example.com"),
                getTagSet("family")),
            new Application(new Role("Product Manager Intern"),
                new Phone("92492021"), new HrEmail("irfan@example.com"),
                getTagSet("classmates")),
            new Application(new Role("ML Engineer Intern"),
                new Phone("92624417"), new HrEmail("royb@example.com"),
                getTagSet("colleagues"))
        };
    }

    public static ReadOnlyAddressBook getSampleAddressBook() {
        AddressBook sampleAb = new AddressBook();
        for (Application sampleApplication : getSampleApplications()) {
            sampleAb.addApplication(sampleApplication);
        }
        return sampleAb;
    }

    /**
     * Returns a tag set containing the list of strings given.
     */
    public static Set<Tag> getTagSet(String... strings) {
        return Arrays.stream(strings)
                .map(Tag::new)
                .collect(Collectors.toSet());
    }

}
