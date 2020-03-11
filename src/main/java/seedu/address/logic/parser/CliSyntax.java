package seedu.address.logic.parser;

/**
 * Contains Command Line Interface (CLI) syntax definitions common to multiple commands
 */
public class CliSyntax {

    /* Prefix definitions */
    public static final Prefix PREFIX_MODULE = new Prefix("m/");
    public static final Prefix PREFIX_SEMESTER = new Prefix("y/");
    public static final Prefix PREFIX_GRADE = new Prefix("g/");
    public static final Prefix PREFIX_TASK = new Prefix("t/");
    public static final Prefix PREFIX_DEADLINE = new Prefix("d/");

    public static final Prefix PREFIX_NAME = new Prefix("n/");
    public static final Prefix PREFIX_COURSE = new Prefix("c/");
    public static final Prefix PREFIX_CURRENT_SEMESTER = new Prefix("cs/");
    public static final Prefix PREFIX_SPEC = new Prefix("s/");

}