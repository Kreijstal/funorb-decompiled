/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class mb {
    static String field_a;
    String field_e;
    boolean field_c;
    String[] field_d;
    boolean field_b;
    int field_f;

    final static la a(byte param0, String param1) {
        if (param0 != -63) {
            field_a = null;
            return new la(param1);
        }
        return new la(param1);
    }

    final static void a(int param0, int param1, String param2, String[] param3) {
        int var5 = 0;
        Object var6 = null;
        Object var7 = null;
        String[] var9 = null;
        String[] var10 = null;
        int stackIn_5_0 = 0;
        int stackIn_16_0 = 0;
        int stackOut_15_0 = 0;
        int stackOut_14_0 = 0;
        int stackOut_4_0 = 0;
        int stackOut_3_0 = 0;
        var5 = Lexicominos.field_L ? 1 : 0;
        if (param0 == 105) {
          ee.field_c = c.field_o;
          if (param1 != 255) {
            if (100 <= param1) {
              if (param1 <= 105) {
                var10 = param3;
                th.a((byte) 85, var10);
                n.field_k = oe.a(-118, param3);
                return;
              } else {
                n.field_k = wi.a(param1, (byte) -108, param2);
                return;
              }
            } else {
              n.field_k = wi.a(param1, (byte) -108, param2);
              return;
            }
          } else {
            L0: {
              if (-14 >= (cg.field_l ^ -1)) {
                stackOut_15_0 = 0;
                stackIn_16_0 = stackOut_15_0;
                break L0;
              } else {
                stackOut_14_0 = 1;
                stackIn_16_0 = stackOut_14_0;
                break L0;
              }
            }
            n.field_k = mc.b(stackIn_16_0 != 0, 102);
            var7 = null;
            th.a((byte) 83, (String[]) null);
            return;
          }
        } else {
          var6 = null;
          mb.a(58, 95, (String) null, (String[]) null);
          ee.field_c = c.field_o;
          if (param1 != 255) {
            if (100 <= param1) {
              if (param1 <= 105) {
                var9 = param3;
                th.a((byte) 85, var9);
                n.field_k = oe.a(-118, param3);
                return;
              } else {
                n.field_k = wi.a(param1, (byte) -108, param2);
                return;
              }
            } else {
              n.field_k = wi.a(param1, (byte) -108, param2);
              return;
            }
          } else {
            L1: {
              if (-14 >= (cg.field_l ^ -1)) {
                stackOut_4_0 = 0;
                stackIn_5_0 = stackOut_4_0;
                break L1;
              } else {
                stackOut_3_0 = 1;
                stackIn_5_0 = stackOut_3_0;
                break L1;
              }
            }
            n.field_k = mc.b(stackIn_5_0 != 0, 102);
            var7 = null;
            th.a((byte) 83, (String[]) null);
            return;
          }
        }
    }

    final static void a(int param0) {
        int var2 = 0;
        int var3 = 0;
        int var4 = Lexicominos.field_L ? 1 : 0;
        int var1 = qg.field_b[param0];
        for (var2 = 1; qg.field_b.length > var2; var2++) {
            var3 = qg.field_b[var2];
            o.a(bf.field_a, var2 << -952767164, bf.field_a, var1, var3);
            var1 = var1 + var3;
        }
    }

    public static void b(int param0) {
        field_a = null;
        int var1 = 72 / ((param0 - 46) / 49);
    }

    mb(boolean param0) {
        ((mb) this).field_c = param0 ? true : false;
    }

    static {
    }
}
