/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class je {
    static bi field_f;
    static boolean field_e;
    static bi field_b;
    static oa field_a;
    static int field_d;
    static int field_g;
    static int field_c;

    final static int a(int param0, byte param1) {
        int stackIn_5_0 = 0;
        int stackIn_9_0 = 0;
        int stackIn_15_0 = 0;
        int stackIn_19_0 = 0;
        if (param1 == -104) {
          param0 = param0 & 8191;
          if (param0 >= 4096) {
            if (param0 < 6144) {
              stackIn_19_0 = -br.field_o[param0 - 4096];
            } else {
              stackIn_19_0 = -br.field_o[-param0 + 8192];
            }
            return stackIn_19_0;
          }
          if (2048 <= param0) {
            stackIn_15_0 = br.field_o[4096 - param0];
          } else {
            stackIn_15_0 = br.field_o[param0];
          }
          return stackIn_15_0;
        }
        field_c = -25;
        param0 = param0 & 8191;
        if (param0 >= 4096) {
          if (param0 < 6144) {
            stackIn_9_0 = -br.field_o[param0 - 4096];
          } else {
            stackIn_9_0 = -br.field_o[-param0 + 8192];
          }
          return stackIn_9_0;
        }
        if (2048 <= param0) {
          stackIn_5_0 = br.field_o[4096 - param0];
        } else {
          stackIn_5_0 = br.field_o[param0];
        }
        return stackIn_5_0;
    }

    final static void a(byte param0, int param1) {
        sl var2 = js.field_f;
        var2.h(param1, 255);
        if (param0 > 32) {
          var2.c(1, (byte) -104);
          var2.c(1, (byte) -93);
          return;
        }
        je.a(-116, (byte) -104);
        var2.c(1, (byte) -104);
        var2.c(1, (byte) -93);
    }

    public static void a(int param0) {
        if (param0 == 1) {
          field_b = null;
          field_f = null;
          field_a = null;
          return;
        }
        field_e = false;
        field_b = null;
        field_f = null;
        field_a = null;
    }

    static {
        field_a = new oa();
        field_d = 0;
        field_c = 0;
    }
}
