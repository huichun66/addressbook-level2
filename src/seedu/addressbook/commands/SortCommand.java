package seedu.addressbook.commands;

import seedu.addressbook.data.person.ReadOnlyPerson;

import java.util.Collections;
import java.util.Comparator;
import java.util.List;


/**
 * Sorts the list of persons in address book in alphabetical order.
 */
public class SortCommand extends Command {

    public static final String COMMAND_WORD = "sort";

    public static final String MESSAGE_USAGE = COMMAND_WORD
            + ": Sorts and list the persons in the address book in alphabetical order of their names (not case-sensitive).\n"
            + "Example: " + COMMAND_WORD;


    @Override
    public CommandResult execute() {
        //List<ReadOnlyPerson> allPersons = addressBook.getAllPersons().immutableListView();
        List<ReadOnlyPerson> allPersons = addressBook.getAllPersons().sortedImmutableList();
        return new CommandResult(getMessageForPersonListShownSummary(allPersons), allPersons);
    }
}
