/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class fl {
    static rh field_e;
    static String field_a;
    static oe field_c;
    static int field_b;
    static String field_d;

    public static void a(int param0) {
        field_c = null;
        if (param0 != 827399017) {
          field_a = null;
          field_d = null;
          field_e = null;
          field_a = null;
          return;
        } else {
          field_d = null;
          field_e = null;
          field_a = null;
          return;
        }
    }

    final static void a(int param0, int[] param1, int param2, int param3, int param4, int param5, int param6, int param7, int param8, int param9) {
        int[] var10 = null;
        int var11 = 0;
        int var12 = 0;
        int var13 = 0;
        int var14 = 0;
        int var15 = 0;
        int var16 = 0;
        int[] var17 = null;
        int[] var18 = null;
        int[] var19 = null;
        var16 = Terraphoenix.field_V;
        if (param3 != 6) {
          fl.a(75);
          L0: while (true) {
            param0--;
            if (0 <= param0) {
              var19 = param1;
              var17 = var19;
              var10 = var17;
              var11 = param8;
              var12 = param5;
              var13 = param4;
              var14 = param6;
              var15 = 8355711 & var19[var11] >> -1534220799;
              var10[var11] = (dg.a(var14, 33464851) >> -351816175) + (dg.a(var13 >> 827399017, 65280) + dg.a(16711680, var12 >> 738767553) + var15);
              param8++;
              param5 = param5 + param9;
              param4 = param4 + param7;
              param6 = param6 + param2;
              continue L0;
            } else {
              return;
            }
          }
        } else {
          L1: while (true) {
            param0--;
            if (0 <= param0) {
              var18 = param1;
              var17 = var18;
              var10 = var17;
              var11 = param8;
              var12 = param5;
              var13 = param4;
              var14 = param6;
              var15 = 8355711 & var18[var11] >> -1534220799;
              var10[var11] = (dg.a(var14, 33464851) >> -351816175) + (dg.a(var13 >> 827399017, 65280) + dg.a(16711680, var12 >> 738767553) + var15);
              param8++;
              param5 = param5 + param9;
              param4 = param4 + param7;
              param6 = param6 + param2;
              continue L1;
            } else {
              return;
            }
          }
        }
    }

    final static void a(String param0, boolean param1, String[] param2, int param3) {
        int var5 = 0;
        Object var6 = null;
        String[] var7 = null;
        int stackIn_17_0 = 0;
        int stackIn_18_0 = 0;
        int stackIn_19_0 = 0;
        int stackIn_19_1 = 0;
        int stackOut_16_0 = 0;
        int stackOut_18_0 = 0;
        int stackOut_18_1 = 0;
        int stackOut_17_0 = 0;
        int stackOut_17_1 = 0;
        var5 = Terraphoenix.field_V;
        pe.field_a = k.field_b;
        if (param3 == -256) {
          L0: {
            stackOut_16_0 = 4;
            stackIn_18_0 = stackOut_16_0;
            stackIn_17_0 = stackOut_16_0;
            if (-14 >= (wf.field_q ^ -1)) {
              stackOut_18_0 = stackIn_18_0;
              stackOut_18_1 = 0;
              stackIn_19_0 = stackOut_18_0;
              stackIn_19_1 = stackOut_18_1;
              break L0;
            } else {
              stackOut_17_0 = stackIn_17_0;
              stackOut_17_1 = 1;
              stackIn_19_0 = stackOut_17_0;
              stackIn_19_1 = stackOut_17_1;
              break L0;
            }
          }
          h.field_c = ia.a(stackIn_19_0, stackIn_19_1 != 0);
          var6 = null;
          eh.a(-32202, (String[]) null);
          if (!param1) {
            return;
          } else {
            fl.a(108, (int[]) null, 127, -106, -84, -57, 125, 57, 52, 88);
            return;
          }
        } else {
          if (-101 > param3) {
            h.field_c = aj.a(param3, (byte) -21, param0);
            if (!param1) {
              return;
            } else {
              fl.a(108, (int[]) null, 127, -106, -84, -57, 125, 57, 52, 88);
              return;
            }
          } else {
            if (-106 <= (param3 ^ -1)) {
              var7 = param2;
              eh.a(-32202, var7);
              h.field_c = ib.a(true, param2);
              if (!param1) {
                return;
              } else {
                fl.a(108, (int[]) null, 127, -106, -84, -57, 125, 57, 52, 88);
                return;
              }
            } else {
              h.field_c = aj.a(param3, (byte) -21, param0);
              if (!param1) {
                return;
              } else {
                fl.a(108, (int[]) null, 127, -106, -84, -57, 125, 57, 52, 88);
                return;
              }
            }
          }
        }
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_a = "Email address is unavailable";
        field_b = 48;
        field_d = "OUT OF AMMO";
        field_e = new rh(6, 0, 4, 2);
    }
}
