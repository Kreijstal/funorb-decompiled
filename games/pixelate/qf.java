/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class qf {
    static int field_b;
    static DraggableWidget field_a;
    static Sprite field_c;
    static String field_d;

    public static void releaseStatics(boolean param0) {
        field_c = null;
        field_a = null;
        field_d = null;
        if (param0) {
          qf.initialiseKeyMap(-39);
        }
    }

    final static void a(int param0, int param1) {
        if (param0 != 21983) {
          return;
        }
        MusicPatchPcmStream.a(param1, (byte) 112);
    }

    final static void initialiseKeyMap(int param0) {
        GameApplet.field_j[59] = 57;
        GameApplet.field_j[92] = 74;
        GameApplet.field_j[61] = 27;
        GameApplet.field_j[520] = 59;
        GameApplet.field_j[192] = 28;
        if (param0 == 31171) {
          GameApplet.field_j[222] = 58;
          GameApplet.field_j[93] = 43;
          GameApplet.field_j[47] = 73;
          GameApplet.field_j[46] = 72;
          GameApplet.field_j[45] = 26;
          GameApplet.field_j[44] = 71;
          GameApplet.field_j[91] = 42;
          return;
        }
        field_c = (Sprite) null;
        GameApplet.field_j[222] = 58;
        GameApplet.field_j[93] = 43;
        GameApplet.field_j[47] = 73;
        GameApplet.field_j[46] = 72;
        GameApplet.field_j[45] = 26;
        GameApplet.field_j[44] = 71;
        GameApplet.field_j[91] = 42;
    }

    static {
        field_d = "Blast from the Past";
    }
}
