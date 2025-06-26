package org.teavm.classlib.java.sql;

import java.util.Iterator;
import java.util.NoSuchElementException;

/**
 * Stub implementation of java.sql.SQLException for testing purposes.
 */
public class TSQLException extends Exception implements java.io.Serializable {
    private String SQLState;
    private int vendorCode;
    private TSQLException next;

    public TSQLException() {
        super();
        this.SQLState = null;
        this.vendorCode = 0;
        this.next = null;
    }

    public TSQLException(String reason) {
        super(reason);
        this.SQLState = null;
        this.vendorCode = 0;
        this.next = null;
    }

    public TSQLException(String reason, String SQLState) {
        super(reason);
        this.SQLState = SQLState;
        this.vendorCode = 0;
        this.next = null;
    }

    public TSQLException(String reason, String SQLState, int vendorCode) {
        super(reason);
        this.SQLState = SQLState;
        this.vendorCode = vendorCode;
        this.next = null;
    }

    public TSQLException(Throwable cause) {
        super(cause);
        this.SQLState = null;
        this.vendorCode = 0;
        this.next = null;
    }

    public TSQLException(String reason, Throwable cause) {
        super(reason, cause);
        this.SQLState = null;
        this.vendorCode = 0;
        this.next = null;
    }

    public TSQLException(String reason, String SQLState, Throwable cause) {
        super(reason, cause);
        this.SQLState = SQLState;
        this.vendorCode = 0;
        this.next = null;
    }

    public TSQLException(String reason, String SQLState, int vendorCode, Throwable cause) {
        super(reason, cause);
        this.SQLState = SQLState;
        this.vendorCode = vendorCode;
        this.next = null;
    }

    public String getSQLState() {
        return SQLState;
    }

    public int getErrorCode() {
        return vendorCode;
    }

    public TSQLException getNextException() {
        return next;
    }

    public void setNextException(TSQLException ex) {
        if (next == null) {
            next = ex;
        } else {
            next.setNextException(ex);
        }
    }

    public Iterator<Throwable> iterator() {
        return new Iterator<Throwable>() {
            TSQLException current = TSQLException.this;
            
            public boolean hasNext() {
                return current != null;
            }
            
            public Throwable next() {
                if (current == null) {
                    throw new NoSuchElementException();
                }
                Throwable result = current;
                current = current.getNextException();
                return result;
            }
            
            public void remove() {
                throw new UnsupportedOperationException();
            }
        };
    }
}