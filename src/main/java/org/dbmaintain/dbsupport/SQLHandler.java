package org.dbmaintain.dbsupport;

import org.dbmaintain.util.DbMaintainException;

import javax.sql.DataSource;

import java.util.Set;

public interface SQLHandler {

	/**
	 * Executes the given statement.
	 *
	 * @param sql The sql string for retrieving the items
	 * @param dataSource 
	 * @return The nr of updates
	 */
	int executeUpdate(String sql, DataSource dataSource);

	/**
	 * Returns the long extracted from the result of the given query. If no value is found, a {@link DbMaintainException}
	 * is thrown.
	 *
	 * @param sql The sql string for retrieving the items
	 * @param dataSource 
	 * @return The long item value
	 */
	long getItemAsLong(String sql, DataSource dataSource);

	/**
	 * Returns the value extracted from the result of the given query. If no value is found, a {@link DbMaintainException}
	 * is thrown.
	 *
	 * @param sql The sql string for retrieving the items
	 * @param dataSource 
	 * @return The string item value
	 */
	String getItemAsString(String sql, DataSource dataSource);

	/**
	 * Returns the items extracted from the result of the given query.
	 *
	 * @param sql The sql string for retrieving the items
	 * @param dataSource 
	 * @return The items, not null
	 */
	Set<String> getItemsAsStringSet(String sql, DataSource dataSource);

	/**
	 * Returns true if the query returned a record.
	 *
	 * @param sql The sql string for checking the existence
	 * @param dataSource 
	 * @return True if a record was returned
	 */
	boolean exists(String sql, DataSource dataSource);

	/**
	 * @return Whether updates are executed on the database or not
	 */
	boolean isDoExecuteUpdates();

}