
/// interface javax.swing.event.TableColumnModelListener ///

package org.swiftjava.javax_swing;

@SuppressWarnings("JniMissingFunction")
public class TableColumnModelListenerProxy implements javax.swing.event.TableColumnModelListener {

    long __swiftObject;

    TableColumnModelListenerProxy( long __swiftObject ) {
        this.__swiftObject = __swiftObject;
    }

    /// public abstract void javax.swing.event.TableColumnModelListener.columnAdded(javax.swing.event.TableColumnModelEvent)

    public native void __columnAdded( long __swiftObject, javax.swing.event.TableColumnModelEvent e );

    public void columnAdded( javax.swing.event.TableColumnModelEvent e ) {
        __columnAdded( __swiftObject, e );
    }

    /// public abstract void javax.swing.event.TableColumnModelListener.columnRemoved(javax.swing.event.TableColumnModelEvent)

    public native void __columnRemoved( long __swiftObject, javax.swing.event.TableColumnModelEvent e );

    public void columnRemoved( javax.swing.event.TableColumnModelEvent e ) {
        __columnRemoved( __swiftObject, e );
    }

    /// public abstract void javax.swing.event.TableColumnModelListener.columnMoved(javax.swing.event.TableColumnModelEvent)

    public native void __columnMoved( long __swiftObject, javax.swing.event.TableColumnModelEvent e );

    public void columnMoved( javax.swing.event.TableColumnModelEvent e ) {
        __columnMoved( __swiftObject, e );
    }

    /// public abstract void javax.swing.event.TableColumnModelListener.columnMarginChanged(javax.swing.event.ChangeEvent)

    public native void __columnMarginChanged( long __swiftObject, javax.swing.event.ChangeEvent e );

    public void columnMarginChanged( javax.swing.event.ChangeEvent e ) {
        __columnMarginChanged( __swiftObject, e );
    }

    /// public abstract void javax.swing.event.TableColumnModelListener.columnSelectionChanged(javax.swing.event.ListSelectionEvent)

    public native void __columnSelectionChanged( long __swiftObject, javax.swing.event.ListSelectionEvent e );

    public void columnSelectionChanged( javax.swing.event.ListSelectionEvent e ) {
        __columnSelectionChanged( __swiftObject, e );
    }

    public native void __finalize( long __swiftObject );

    public void finalize() {
        __finalize( __swiftObject );
    }

}