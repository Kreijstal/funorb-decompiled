/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class vw {
    static ArenaTheme[] field_a;

    final static java.awt.Container a(int param0) {
        if (null != fda.field_j) {
          return (java.awt.Container) ((Object) fda.field_j);
        }
        if (param0 != -1334) {
          field_a = (ArenaTheme[]) null;
          return (java.awt.Container) ((Object) nia.d(-31768));
        }
        return (java.awt.Container) ((Object) nia.d(-31768));
    }

    public static void releaseStatics(int param0) {
        if (param0 != 7130) {
          return;
        }
        field_a = null;
    }

    static {
    }
}
