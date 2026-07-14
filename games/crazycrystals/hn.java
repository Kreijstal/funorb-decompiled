/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class hn extends se {
    hn(ga param0) {
        super(param0);
    }

    final static void a(int param0, int param1, int param2, ng param3, int param4) {
        param3.a(true, param2);
        param3.c(-161478600, 17);
        param3.c(-161478600, param0);
        param3.c(-161478600, param4);
        param3.a(true, param1);
    }

    final String a(String param0, int param1) {
        int var3 = -118 / ((41 - param1) / 49);
        if (((hn) this).a(param0, (byte) -122) == rk.field_c) {
            return mg.field_f;
        }
        return rl.field_f;
    }

    final oi a(String param0, byte param1) {
        int var3 = 0;
        int stackIn_3_0 = 0;
        int stackOut_2_0 = 0;
        int stackOut_1_0 = 0;
        L0: {
          if (ab.a(param0, (byte) -114) != null) {
            stackOut_2_0 = 0;
            stackIn_3_0 = stackOut_2_0;
            break L0;
          } else {
            stackOut_1_0 = 1;
            stackIn_3_0 = stackOut_1_0;
            break L0;
          }
        }
        var3 = stackIn_3_0;
        if (var3 == 0) {
          return rk.field_c;
        } else {
          if (param1 != -122) {
            return null;
          } else {
            return ih.field_b;
          }
        }
    }

    final static String b(boolean param0) {
        if (param0) {
            return null;
        }
        return kd.field_n.i(114);
    }

    static {
    }
}
