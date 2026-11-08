/*
 * Decompiled by CFR-JS 0.4.0.
 */
interface WidgetScrollListener extends WidgetListener {
    public abstract void onScrollDragged(int scrollYQ16, int scrollXQ16, ScrollControl source, boolean guard);

    public abstract void onScrollChanged(ScrollControl source, int guard, int scrollYQ16, int scrollXQ16);
}
