/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class uc {
    static gh field_j;
    static int[] field_c;
    static int[][] field_e;
    static int[] field_k;
    static int[] field_f;
    static cn field_i;
    static int field_l;
    static int field_a;
    static int[] field_d;
    static boolean field_g;
    static String[][] field_h;
    static int[] field_b;

    public static void a() {
        field_h = null;
        field_j = null;
        field_d = null;
        field_i = null;
        field_k = null;
        field_b = null;
        field_c = null;
        field_e = null;
        field_f = null;
    }

    final static void a(boolean param0, int param1) {
        RuntimeException var2 = null;
        int var3 = 0;
        tc var4 = null;
        kf var5 = null;
        RuntimeException decompiledCaughtException = null;
        var3 = SteelSentinels.field_G;
        try {
          L0: {
            L1: {
              if (param0) {
                break L1;
              } else {
                boolean discarded$6 = uc.a(-115, 79);
                break L1;
              }
            }
            var4 = (tc) (Object) ic.field_B.e(13058);
            L2: while (true) {
              if (var4 == null) {
                var5 = (kf) (Object) je.field_w.e(13058);
                L3: while (true) {
                  if (var5 == null) {
                    break L0;
                  } else {
                    int discarded$7 = -2864;
                    ma.a(param1, var5);
                    var5 = (kf) (Object) je.field_w.a((byte) -40);
                    continue L3;
                  }
                }
              } else {
                vh.a(param1, var4, (byte) 107);
                var4 = (tc) (Object) ic.field_B.a((byte) -53);
                continue L2;
              }
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2 = decompiledCaughtException;
          throw ci.a((Throwable) (Object) var2, "uc.B(" + param0 + ',' + param1 + ')');
        }
    }

    final static void a(wk[] param0, int param1, int param2, byte param3, int param4) {
        RuntimeException runtimeException = null;
        int var5_int = 0;
        int var6 = 0;
        int var7 = 0;
        int var8 = 0;
        int var9 = 0;
        int var10 = 0;
        RuntimeException stackIn_12_0 = null;
        StringBuilder stackIn_12_1 = null;
        RuntimeException stackIn_13_0 = null;
        StringBuilder stackIn_13_1 = null;
        RuntimeException stackIn_14_0 = null;
        StringBuilder stackIn_14_1 = null;
        String stackIn_14_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException stackOut_11_0 = null;
        StringBuilder stackOut_11_1 = null;
        RuntimeException stackOut_13_0 = null;
        StringBuilder stackOut_13_1 = null;
        String stackOut_13_2 = null;
        RuntimeException stackOut_12_0 = null;
        StringBuilder stackOut_12_1 = null;
        String stackOut_12_2 = null;
        var10 = SteelSentinels.field_G;
        try {
          L0: {
            L1: {
              if (param0 == null) {
                break L1;
              } else {
                if (param1 <= 0) {
                  break L1;
                } else {
                  var5_int = param0[0].field_z;
                  var6 = param0[2].field_z;
                  var7 = param0[1].field_z;
                  param0[0].a(param4, param2);
                  param0[2].a(param1 + (param4 - var6), param2);
                  pb.b(aj.field_v);
                  pb.h(param4 + var5_int, param2, param4 + param1 + -var6, param0[1].field_B + param2);
                  var8 = var5_int + param4;
                  var9 = param4 + param1 + -var6;
                  param4 = var8;
                  if (param3 == -39) {
                    L2: while (true) {
                      if (param4 >= var9) {
                        pb.a(aj.field_v);
                        break L0;
                      } else {
                        param0[1].a(param4, param2);
                        param4 = param4 + var7;
                        continue L2;
                      }
                    }
                  } else {
                    return;
                  }
                }
              }
            }
            return;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L3: {
            runtimeException = decompiledCaughtException;
            stackOut_11_0 = (RuntimeException) runtimeException;
            stackOut_11_1 = new StringBuilder().append("uc.D(");
            stackIn_13_0 = stackOut_11_0;
            stackIn_13_1 = stackOut_11_1;
            stackIn_12_0 = stackOut_11_0;
            stackIn_12_1 = stackOut_11_1;
            if (param0 == null) {
              stackOut_13_0 = (RuntimeException) (Object) stackIn_13_0;
              stackOut_13_1 = (StringBuilder) (Object) stackIn_13_1;
              stackOut_13_2 = "null";
              stackIn_14_0 = stackOut_13_0;
              stackIn_14_1 = stackOut_13_1;
              stackIn_14_2 = stackOut_13_2;
              break L3;
            } else {
              stackOut_12_0 = (RuntimeException) (Object) stackIn_12_0;
              stackOut_12_1 = (StringBuilder) (Object) stackIn_12_1;
              stackOut_12_2 = "{...}";
              stackIn_14_0 = stackOut_12_0;
              stackIn_14_1 = stackOut_12_1;
              stackIn_14_2 = stackOut_12_2;
              break L3;
            }
          }
          throw ci.a((Throwable) (Object) stackIn_14_0, stackIn_14_2 + ',' + param1 + ',' + param2 + ',' + param3 + ',' + param4 + ')');
        }
    }

    final static boolean a(int param0, int param1) {
        int[] var2 = null;
        RuntimeException var2_ref = null;
        int var3 = 0;
        int var4 = 0;
        int var5 = 0;
        Object var6 = null;
        int[] var7 = null;
        int stackIn_4_0 = 0;
        int stackIn_8_0 = 0;
        int stackIn_16_0 = 0;
        int stackIn_19_0 = 0;
        RuntimeException decompiledCaughtException = null;
        int stackOut_3_0 = 0;
        int stackOut_7_0 = 0;
        int stackOut_18_0 = 0;
        int stackOut_15_0 = 0;
        var5 = SteelSentinels.field_G;
        try {
          L0: {
            L1: {
              if (nk.f((byte) -125)) {
                break L1;
              } else {
                if (!oc.a(param0, -105, true)) {
                  break L1;
                } else {
                  stackOut_3_0 = 0;
                  stackIn_4_0 = stackOut_3_0;
                  return stackIn_4_0 != 0;
                }
              }
            }
            if (t.a(fe.field_D, param0, -20370)) {
              stackOut_7_0 = 1;
              stackIn_8_0 = stackOut_7_0;
              return stackIn_8_0 != 0;
            } else {
              L2: {
                var7 = dn.field_bc;
                var2 = var7;
                if (param1 == -3958) {
                  break L2;
                } else {
                  var6 = null;
                  uc.a((wk[]) null, 91, -31, (byte) -121, -77);
                  break L2;
                }
              }
              var3 = 0;
              L3: while (true) {
                if (var3 >= var7.length) {
                  stackOut_18_0 = 0;
                  stackIn_19_0 = stackOut_18_0;
                  break L0;
                } else {
                  var4 = var7[var3];
                  if (var4 == param0) {
                    stackOut_15_0 = 1;
                    stackIn_16_0 = stackOut_15_0;
                    return stackIn_16_0 != 0;
                  } else {
                    var3++;
                    continue L3;
                  }
                }
              }
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2_ref = decompiledCaughtException;
          throw ci.a((Throwable) (Object) var2_ref, "uc.A(" + param0 + ',' + param1 + ')');
        }
        return stackIn_19_0 != 0;
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_e = new int[23][];
        field_c = new int[23];
        field_k = new int[23];
        field_d = new int[23];
        field_f = new int[23];
        km.a((byte) -44, 460, new int[9], 180, 30, 160, 0);
        km.a((byte) -44, 460, new int[7], 180, 30, 200, 1);
        km.a((byte) -44, 460, new int[8], 180, 30, 200, 2);
        km.a((byte) -44, 460, new int[8], 180, 30, 200, 3);
        km.a((byte) -44, 460, new int[7], 180, 30, 200, 4);
        km.a((byte) -44, 460, new int[4], 180, 30, 406, 5);
        km.a((byte) -44, 460, new int[4], 180, 30, 406, 6);
        km.a((byte) -44, 0, new int[4], 0, 0, 0, 7);
        km.a((byte) -44, 460, new int[4], 180, 30, 406, 8);
        km.a((byte) -44, 460, new int[4], 180, 30, 406, 9);
        km.a((byte) -44, 460, new int[2], 180, 30, 400, 10);
        km.a((byte) -44, 460, new int[1], 290, 30, 400, 11);
        km.a((byte) -44, 460, new int[0], 180, 30, 200, 12);
        km.a((byte) -44, 0, new int[4], 0, 0, 0, 13);
        km.a((byte) -44, 0, new int[4], 0, 0, 0, 14);
        km.a((byte) -44, 460, new int[6], 180, 30, 400, 15);
        km.a((byte) -44, 460, new int[1], 180, 30, 400, 16);
        km.a((byte) -44, 460, new int[13], 180, 30, 140, 17);
        km.a((byte) -44, 0, new int[0], 0, 0, 0, 18);
        km.a((byte) -44, 0, new int[24], 0, 30, 0, 19);
        km.a((byte) -44, 0, new int[7], 0, 30, 0, 20);
        km.a((byte) -44, 460, new int[1], 180, 30, 200, 21);
        km.a((byte) -44, 460, new int[6], 180, 30, 200, 22);
        field_h = new String[][]{new String[3], new String[3]};
    }
}
