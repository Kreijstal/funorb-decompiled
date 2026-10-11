/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class pu implements dja {
    static String[] field_c;
    static String field_b;
    static boolean field_a;

    public final tv a(byte param0) {
        int var2 = -51 / ((param0 + 64) / 50);
        return (tv) ((Object) new oq());
    }

    final static int a(byte param0, int param1) {
        if (param1 == 6406) {
          return 1;
        }
        if (param1 == 6409) {
          return 1;
        }
        if (32841 == param1) {
          return 1;
        }
        if (param1 == 6410) {
          return 2;
        }
        if (param1 == 6407) {
          return 3;
        }
        if (param1 == 6408) {
          return 4;
        }
        if (param0 < -92) {
          throw new IllegalArgumentException("");
        }
        pu.a((byte) -64, -74);
        throw new IllegalArgumentException("");
    }

    public static void a(int param0) {
        field_c = null;
        if (param0 < 49) {
          field_b = (String) null;
          field_b = null;
          return;
        }
        field_b = null;
    }

    public final tv[] a(int param0, int param1) {
        if (param0 != 11995) {
          field_b = (String) null;
          return (tv[]) ((Object) new oq[param1]);
        }
        return (tv[]) ((Object) new oq[param1]);
    }

    static {
        field_c = new String[]{"None", "Blue points", "Yellow points", "Game timer", "Blue wins", "Yellow wins", "Blue modules", "Yellow modules", "Blue reinforcements", "Yellow reinforcements", "Targets destroyed", "Targets destroyed"};
        field_b = "Copied";
    }
}
