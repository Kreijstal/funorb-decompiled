/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class av implements dja {
    static ShipComponent[] field_a;

    final static String a(char param0, int param1) {
        if (param1 != 6) {
          field_a = (ShipComponent[]) null;
          return String.valueOf(param0);
        }
        return String.valueOf(param0);
    }

    public final tv a(byte param0) {
        int var2 = 13 / ((param0 + 64) / 50);
        return (tv) ((Object) new MissionAction());
    }

    public static void a(boolean param0) {
        if (param0) {
          return;
        }
        field_a = null;
    }

    public final tv[] a(int param0, int param1) {
        if (param0 != 11995) {
          field_a = (ShipComponent[]) null;
          return (tv[]) ((Object) new MissionAction[param1]);
        }
        return (tv[]) ((Object) new MissionAction[param1]);
    }

    static {
        field_a = new ShipComponent[6];
    }
}
