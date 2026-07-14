/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class wq {
    static String field_e;
    static String field_f;
    static int field_a;
    static ja[][] field_c;
    static String field_d;
    static String[][] field_g;
    static String field_b;

    final static ri a(int param0, String param1, ul param2, String param3) {
        int var4 = param2.a(param1, (byte) 124);
        int var5 = -82 % ((-79 - param0) / 37);
        int var6 = param2.a(param3, var4, -1);
        return ka.a(-1, var6, var4, param2);
    }

    final static int a(byte param0) {
        if (param0 < 61) {
            return -124;
        }
        return (int)(1000000000L / td.field_g);
    }

    public static void b(byte param0) {
        if (param0 <= 108) {
          int discarded$2 = wq.a((byte) 91);
          field_b = null;
          field_d = null;
          field_c = null;
          field_g = null;
          field_f = null;
          field_e = null;
          return;
        } else {
          field_b = null;
          field_d = null;
          field_c = null;
          field_g = null;
          field_f = null;
          field_e = null;
          return;
        }
    }

    final static wf a(ga param0, int param1) {
        int var2 = param0.d((byte) 69);
        int var5 = -60 / ((-63 - param1) / 52);
        int var3 = param0.g(31365);
        int var4 = param0.g(31365);
        int var6 = param0.g(31365);
        int var7 = param0.d((byte) 69);
        int var8 = param0.d((byte) 69);
        int var9 = param0.d((byte) 69);
        return rm.a(var2, var8, var9, var4, var6, var3, 8128, var7);
    }

    final static void a(int param0, pd param1, int param2, pd param3, int param4, boolean param5) {
        wb.field_db = param4;
        pb.field_b = param0;
        li.field_E = param3;
        vk.field_I = param1;
        if (param5) {
          field_b = null;
          ne.field_tb = param2;
          return;
        } else {
          ne.field_tb = param2;
          return;
        }
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_e = "Powerups with this modifier will not immobilise your zombies. Try it on Screech for some on-the-go karaoke.";
        field_c = new ja[23][];
        field_f = "Please select an option in the '<%0>' row.";
        field_d = "Powerups recharge between uses. Drag BROWN (circle) research here to equip it.";
        field_b = "IO error - unable to communicate reliably with the data server. Please check any firewall/antivirus/filtering software.";
    }
}
