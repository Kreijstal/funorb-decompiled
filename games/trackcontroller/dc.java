/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class dc extends ic {
    private int field_u;
    static jb field_w;
    private int field_q;
    static java.awt.Font field_s;
    static boolean[] field_r;
    private qj[] field_t;
    private int field_v;
    static String field_o;
    static qj field_p;

    public final void a(int param0, al param1, int param2, boolean param3, int param4) {
        RuntimeException var6 = null;
        int var6_int = 0;
        int var7 = 0;
        int var8 = 0;
        int stackIn_6_0 = 0;
        int stackIn_15_0 = 0;
        int stackIn_18_0 = 0;
        RuntimeException stackIn_21_0 = null;
        StringBuilder stackIn_21_1 = null;
        RuntimeException stackIn_22_0 = null;
        StringBuilder stackIn_22_1 = null;
        RuntimeException stackIn_23_0 = null;
        StringBuilder stackIn_23_1 = null;
        String stackIn_23_2 = null;
        RuntimeException decompiledCaughtException = null;
        int stackOut_4_0 = 0;
        int stackOut_3_0 = 0;
        int stackOut_1_0 = 0;
        int stackOut_14_0 = 0;
        int stackOut_13_0 = 0;
        int stackOut_12_0 = 0;
        int stackOut_17_0 = 0;
        int stackOut_16_0 = 0;
        RuntimeException stackOut_20_0 = null;
        StringBuilder stackOut_20_1 = null;
        RuntimeException stackOut_22_0 = null;
        StringBuilder stackOut_22_1 = null;
        String stackOut_22_2 = null;
        RuntimeException stackOut_21_0 = null;
        StringBuilder stackOut_21_1 = null;
        String stackOut_21_2 = null;
        try {
          L0: {
            L1: {
              if (!param1.field_q) {
                if (param1.h(-87)) {
                  stackOut_4_0 = 1;
                  stackIn_6_0 = stackOut_4_0;
                  break L1;
                } else {
                  stackOut_3_0 = 0;
                  stackIn_6_0 = stackOut_3_0;
                  break L1;
                }
              } else {
                stackOut_1_0 = 1;
                stackIn_6_0 = stackOut_1_0;
                break L1;
              }
            }
            L2: {
              var6_int = stackIn_6_0;
              if (!(param1 instanceof rh)) {
                break L2;
              } else {
                param3 = param3 & ((rh) (Object) param1).field_B;
                break L2;
              }
            }
            L3: {
              if (param0 == -24969) {
                break L3;
              } else {
                dc.c((byte) -91);
                break L3;
              }
            }
            L4: {
              if (!param3) {
                stackOut_14_0 = ((dc) this).field_q;
                stackIn_15_0 = stackOut_14_0;
                break L4;
              } else {
                if (var6_int != 0) {
                  stackOut_13_0 = ((dc) this).field_u;
                  stackIn_15_0 = stackOut_13_0;
                  break L4;
                } else {
                  stackOut_12_0 = ((dc) this).field_v;
                  stackIn_15_0 = stackOut_12_0;
                  break L4;
                }
              }
            }
            L5: {
              var7 = stackIn_15_0;
              cb.a(param2 + param1.field_m + (param1.field_u - ((dc) this).field_t[0].field_v >> 1), (byte) -128, var7, param1.field_x, ((dc) this).field_t, param1.field_p + param4);
              if (!param3) {
                stackOut_17_0 = 7105644;
                stackIn_18_0 = stackOut_17_0;
                break L5;
              } else {
                stackOut_16_0 = 16777215;
                stackIn_18_0 = stackOut_16_0;
                break L5;
              }
            }
            var8 = stackIn_18_0;
            int discarded$1 = ((dc) this).field_k.a(param1.field_s, param4 - -param1.field_p, param1.field_m + param2 - 2, param1.field_x, param1.field_u, var8, -1, 1, 1, ((dc) this).field_k.field_G);
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L6: {
            var6 = decompiledCaughtException;
            stackOut_20_0 = (RuntimeException) var6;
            stackOut_20_1 = new StringBuilder().append("dc.L(").append(param0).append(44);
            stackIn_22_0 = stackOut_20_0;
            stackIn_22_1 = stackOut_20_1;
            stackIn_21_0 = stackOut_20_0;
            stackIn_21_1 = stackOut_20_1;
            if (param1 == null) {
              stackOut_22_0 = (RuntimeException) (Object) stackIn_22_0;
              stackOut_22_1 = (StringBuilder) (Object) stackIn_22_1;
              stackOut_22_2 = "null";
              stackIn_23_0 = stackOut_22_0;
              stackIn_23_1 = stackOut_22_1;
              stackIn_23_2 = stackOut_22_2;
              break L6;
            } else {
              stackOut_21_0 = (RuntimeException) (Object) stackIn_21_0;
              stackOut_21_1 = (StringBuilder) (Object) stackIn_21_1;
              stackOut_21_2 = "{...}";
              stackIn_23_0 = stackOut_21_0;
              stackIn_23_1 = stackOut_21_1;
              stackIn_23_2 = stackOut_21_2;
              break L6;
            }
          }
          throw sl.a((Throwable) (Object) stackIn_23_0, stackIn_23_2 + 44 + param2 + 44 + param3 + 44 + param4 + 41);
        }
    }

    public static void c(byte param0) {
        field_s = null;
        if (param0 < 20) {
          dc.c((byte) -11);
          field_o = null;
          field_w = null;
          field_p = null;
          field_r = null;
          return;
        } else {
          field_o = null;
          field_w = null;
          field_p = null;
          field_r = null;
          return;
        }
    }

    final static void a(int param0, int param1, int param2, int param3, int param4, int param5, int param6, int param7, int param8, int param9, int param10, int param11, int param12, int param13, int param14, int param15) {
        int var17 = 0;
        var17 = TrackController.field_F ? 1 : 0;
        if (param3 >= param15) {
          if (param0 <= param3) {
            if (param0 > param15) {
              ld.a(param2, param13, param12, param11, param9, param4, param6, param5, param0, param3, param14, param15, param7, true, param8, ll.field_i, param10);
              return;
            } else {
              ld.a(param14, param13, param11, param12, param7, param4, param5, param6, param15, param3, param2, param0, param9, true, param8, ll.field_i, param10);
              return;
            }
          } else {
            ld.a(param10, param5, param12, param8, param9, param7, param6, param13, param3, param0, param14, param15, param4, true, param11, ll.field_i, param2);
            return;
          }
        } else {
          if (param0 <= param15) {
            if (param3 >= param0) {
              ld.a(param10, param6, param11, param8, param7, param9, param5, param13, param3, param15, param2, param0, param4, true, param12, ll.field_i, param14);
              return;
            } else {
              ld.a(param2, param6, param8, param11, param4, param9, param13, param5, param0, param15, param10, param3, param7, true, param12, ll.field_i, param14);
              return;
            }
          } else {
            ld.a(param14, param5, param8, param12, param4, param7, param13, param6, param15, param0, param10, param3, param9, true, param11, ll.field_i, param2);
            return;
          }
        }
    }

    private dc(int param0, int param1, int param2) {
        ((dc) this).field_v = param0;
        ((dc) this).field_t = il.field_l;
        ((dc) this).field_q = param2;
        ((dc) this).field_u = param1;
        ((dc) this).field_k = p.field_a;
    }

    public dc() {
        this(2188450, 2591221, 9543);
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_w = new jb();
    }
}
