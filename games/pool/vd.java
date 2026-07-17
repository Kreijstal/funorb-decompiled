/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class vd implements fp {
    static int field_c;
    static int field_g;
    private int field_e;
    static String[] field_l;
    private int field_b;
    private lr field_h;
    private int field_i;
    private int field_a;
    private int field_j;
    private int field_k;
    static String field_m;
    static int field_n;
    private int field_d;
    static String field_f;

    final static void a(byte param0, int param1) {
        L0: {
          ec.field_i = param1 >> 4 & 3;
          if (2 < ec.field_i) {
            ec.field_i = 2;
            break L0;
          } else {
            break L0;
          }
        }
        L1: {
          ol.field_e = param1 >> 2 & 3;
          di.field_e = param1 & 3;
          if (ol.field_e > 2) {
            ol.field_e = 2;
            break L1;
          } else {
            break L1;
          }
        }
        if (2 >= di.field_e) {
          if (param0 != 78) {
            int discarded$4 = vd.a(111, (byte) -79, -26);
            return;
          } else {
            return;
          }
        } else {
          di.field_e = 2;
          if (param0 == 78) {
            return;
          } else {
            int discarded$5 = vd.a(111, (byte) -79, -26);
            return;
          }
        }
    }

    public final void a(boolean param0, int param1, byte param2, int param3, ei param4) {
        RuntimeException var6 = null;
        int var7 = 0;
        int var8 = 0;
        double var9 = 0.0;
        int var11 = 0;
        int var12 = 0;
        int var13 = 0;
        int var14 = 0;
        er var15 = null;
        ei stackIn_3_0 = null;
        RuntimeException stackIn_10_0 = null;
        StringBuilder stackIn_10_1 = null;
        RuntimeException stackIn_11_0 = null;
        StringBuilder stackIn_11_1 = null;
        RuntimeException stackIn_12_0 = null;
        StringBuilder stackIn_12_1 = null;
        String stackIn_12_2 = null;
        RuntimeException decompiledCaughtException = null;
        ei stackOut_2_0 = null;
        Object stackOut_1_0 = null;
        RuntimeException stackOut_9_0 = null;
        StringBuilder stackOut_9_1 = null;
        RuntimeException stackOut_11_0 = null;
        StringBuilder stackOut_11_1 = null;
        String stackOut_11_2 = null;
        RuntimeException stackOut_10_0 = null;
        StringBuilder stackOut_10_1 = null;
        String stackOut_10_2 = null;
        try {
          L0: {
            L1: {
              if (param4 instanceof er) {
                stackOut_2_0 = (ei) param4;
                stackIn_3_0 = stackOut_2_0;
                break L1;
              } else {
                stackOut_1_0 = null;
                stackIn_3_0 = (ei) (Object) stackOut_1_0;
                break L1;
              }
            }
            L2: {
              var15 = (er) (Object) stackIn_3_0;
              if (var15 == null) {
                break L2;
              } else {
                break L2;
              }
            }
            L3: {
              qh.f(param1 - -param4.field_C, param4.field_D + param3, param4.field_l, param4.field_y, ((vd) this).field_k);
              var7 = var15.field_U + (param4.field_C + param1);
              var8 = var15.field_P + param3 + param4.field_D;
              qh.a(var7, var8, var15.field_O, ((vd) this).field_i);
              if (-1 == var15.field_V) {
                break L3;
              } else {
                var9 = 2.0 * (3.141592653589793 * (double)var15.field_V) / (double)var15.field_Z;
                var11 = (int)(-Math.sin(var9) * (double)var15.field_O);
                var12 = (int)(Math.cos(var9) * (double)var15.field_O);
                qh.a(var11 + var7, var8 + var12, 1, ((vd) this).field_a);
                break L3;
              }
            }
            L4: {
              qh.a(var7, var8, 2, 1);
              var9 = 2.0 * ((double)var15.field_Y * 3.141592653589793) / (double)var15.field_Z;
              var13 = 63 % ((param2 - 2) / 41);
              var11 = (int)(-Math.sin(var9) * (double)var15.field_O);
              var12 = (int)(Math.cos(var9) * (double)var15.field_O);
              qh.d(var7, var8, var11 + var7, var8 - -var12, 1);
              if (((vd) this).field_h == null) {
                break L4;
              } else {
                var14 = ((vd) this).field_b + var15.field_O + var15.field_U;
                int discarded$1 = ((vd) this).field_h.a(param4.field_m, var14 + (param1 + param4.field_C), ((vd) this).field_j + (param3 + param4.field_D), -var14 + (-((vd) this).field_b + param4.field_l), param4.field_y + -(((vd) this).field_b << 1), ((vd) this).field_e, ((vd) this).field_d, 1, 1, 0);
                break L4;
              }
            }
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L5: {
            var6 = decompiledCaughtException;
            stackOut_9_0 = (RuntimeException) var6;
            stackOut_9_1 = new StringBuilder().append("vd.A(").append(param0).append(44).append(param1).append(44).append(param2).append(44).append(param3).append(44);
            stackIn_11_0 = stackOut_9_0;
            stackIn_11_1 = stackOut_9_1;
            stackIn_10_0 = stackOut_9_0;
            stackIn_10_1 = stackOut_9_1;
            if (param4 == null) {
              stackOut_11_0 = (RuntimeException) (Object) stackIn_11_0;
              stackOut_11_1 = (StringBuilder) (Object) stackIn_11_1;
              stackOut_11_2 = "null";
              stackIn_12_0 = stackOut_11_0;
              stackIn_12_1 = stackOut_11_1;
              stackIn_12_2 = stackOut_11_2;
              break L5;
            } else {
              stackOut_10_0 = (RuntimeException) (Object) stackIn_10_0;
              stackOut_10_1 = (StringBuilder) (Object) stackIn_10_1;
              stackOut_10_2 = "{...}";
              stackIn_12_0 = stackOut_10_0;
              stackIn_12_1 = stackOut_10_1;
              stackIn_12_2 = stackOut_10_2;
              break L5;
            }
          }
          throw wm.a((Throwable) (Object) stackIn_12_0, stackIn_12_2 + 41);
        }
    }

    final static int a(int param0, byte param1, int param2) {
        if (param1 <= 65) {
          field_f = null;
          return (fb.field_d + qh.field_c << 2) - -((param2 << 11) / param0);
        } else {
          return (fb.field_d + qh.field_c << 2) - -((param2 << 11) / param0);
        }
    }

    public static void a(int param0) {
        field_l = null;
        field_f = null;
        field_m = null;
    }

    vd(lr param0, int param1, int param2, int param3, int param4, int param5, int param6, int param7) {
        try {
            ((vd) this).field_d = param4;
            ((vd) this).field_k = param7;
            ((vd) this).field_a = param6;
            ((vd) this).field_e = param3;
            ((vd) this).field_i = param5;
            ((vd) this).field_j = param2;
            ((vd) this).field_h = param0;
            ((vd) this).field_b = param1;
        } catch (RuntimeException runtimeException) {
            throw wm.a((Throwable) (Object) runtimeException, "vd.<init>(" + (param0 != null ? "{...}" : "null") + 44 + param1 + 44 + param2 + 44 + param3 + 44 + param4 + 44 + param5 + 44 + param6 + 44 + param7 + 41);
        }
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_l = new String[]{"Three more tables: cool polar pool...", "...an ancient table in the mountains...", "...or space out in our orbital shuttle."};
        field_g = -1;
        field_m = "You have 1 unread message!";
        field_f = "Message game";
    }
}
