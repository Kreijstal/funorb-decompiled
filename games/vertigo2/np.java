/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class np extends cr {
    private cr field_Hb;
    static cr field_Ib;
    static float field_Nb;
    static r field_Kb;
    static int field_Lb;
    static int field_Ob;
    static String field_Mb;
    static String field_Jb;

    final boolean a(byte param0, boolean param1) {
        int stackIn_5_0 = 0;
        int stackIn_11_0 = 0;
        int stackIn_17_0 = 0;
        int stackIn_22_0 = 0;
        int stackOut_21_0 = 0;
        int stackOut_20_0 = 0;
        int stackOut_16_0 = 0;
        int stackOut_15_0 = 0;
        int stackOut_10_0 = 0;
        int stackOut_9_0 = 0;
        int stackOut_4_0 = 0;
        int stackOut_3_0 = 0;
        ((np) this).a(param0 ^ -51, true);
        if (param0 == -51) {
          L0: {
            if (kf.field_c == 0) {
              if (((np) this).field_Hb.field_tb == 0) {
                stackOut_21_0 = 0;
                stackIn_22_0 = stackOut_21_0;
                break L0;
              } else {
                return true;
              }
            } else {
              if (((np) this).field_tb == 0) {
                stackOut_20_0 = 1;
                stackIn_22_0 = stackOut_20_0;
                break L0;
              } else {
                L1: {
                  if (((np) this).field_Hb.field_tb == 0) {
                    stackOut_16_0 = 0;
                    stackIn_17_0 = stackOut_16_0;
                    break L1;
                  } else {
                    stackOut_15_0 = 1;
                    stackIn_17_0 = stackOut_15_0;
                    break L1;
                  }
                }
                return stackIn_17_0 != 0;
              }
            }
          }
          return stackIn_22_0 != 0;
        } else {
          field_Ob = 28;
          if (kf.field_c != 0) {
            if (((np) this).field_tb != 0) {
              L2: {
                if (((np) this).field_Hb.field_tb == 0) {
                  stackOut_10_0 = 0;
                  stackIn_11_0 = stackOut_10_0;
                  break L2;
                } else {
                  stackOut_9_0 = 1;
                  stackIn_11_0 = stackOut_9_0;
                  break L2;
                }
              }
              return stackIn_11_0 != 0;
            } else {
              return true;
            }
          } else {
            L3: {
              if (((np) this).field_Hb.field_tb == 0) {
                stackOut_4_0 = 0;
                stackIn_5_0 = stackOut_4_0;
                break L3;
              } else {
                stackOut_3_0 = 1;
                stackIn_5_0 = stackOut_3_0;
                break L3;
              }
            }
            return stackIn_5_0 != 0;
          }
        }
    }

    public static void a(byte param0) {
        field_Mb = null;
        field_Kb = null;
        field_Ib = null;
        field_Jb = null;
        int var1 = -17;
    }

    np(cr param0, cr param1, cr param2, cr param3, cr param4, cr param5) {
        RuntimeException var7 = null;
        cr var8 = null;
        cr var9 = null;
        int var10 = 0;
        int var11 = 0;
        int var12 = 0;
        cr var13 = null;
        cr var14 = null;
        int var15 = 0;
        cr var17 = null;
        RuntimeException stackIn_9_0 = null;
        StringBuilder stackIn_9_1 = null;
        RuntimeException stackIn_10_0 = null;
        StringBuilder stackIn_10_1 = null;
        RuntimeException stackIn_11_0 = null;
        StringBuilder stackIn_11_1 = null;
        String stackIn_11_2 = null;
        RuntimeException stackIn_12_0 = null;
        StringBuilder stackIn_12_1 = null;
        RuntimeException stackIn_13_0 = null;
        StringBuilder stackIn_13_1 = null;
        RuntimeException stackIn_14_0 = null;
        StringBuilder stackIn_14_1 = null;
        String stackIn_14_2 = null;
        RuntimeException stackIn_15_0 = null;
        StringBuilder stackIn_15_1 = null;
        RuntimeException stackIn_16_0 = null;
        StringBuilder stackIn_16_1 = null;
        RuntimeException stackIn_17_0 = null;
        StringBuilder stackIn_17_1 = null;
        String stackIn_17_2 = null;
        RuntimeException stackIn_18_0 = null;
        StringBuilder stackIn_18_1 = null;
        RuntimeException stackIn_19_0 = null;
        StringBuilder stackIn_19_1 = null;
        RuntimeException stackIn_20_0 = null;
        StringBuilder stackIn_20_1 = null;
        String stackIn_20_2 = null;
        RuntimeException stackIn_21_0 = null;
        StringBuilder stackIn_21_1 = null;
        RuntimeException stackIn_22_0 = null;
        StringBuilder stackIn_22_1 = null;
        RuntimeException stackIn_23_0 = null;
        StringBuilder stackIn_23_1 = null;
        String stackIn_23_2 = null;
        RuntimeException stackIn_24_0 = null;
        StringBuilder stackIn_24_1 = null;
        RuntimeException stackIn_25_0 = null;
        StringBuilder stackIn_25_1 = null;
        RuntimeException stackIn_26_0 = null;
        StringBuilder stackIn_26_1 = null;
        String stackIn_26_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException stackOut_8_0 = null;
        StringBuilder stackOut_8_1 = null;
        RuntimeException stackOut_10_0 = null;
        StringBuilder stackOut_10_1 = null;
        String stackOut_10_2 = null;
        RuntimeException stackOut_9_0 = null;
        StringBuilder stackOut_9_1 = null;
        String stackOut_9_2 = null;
        RuntimeException stackOut_11_0 = null;
        StringBuilder stackOut_11_1 = null;
        RuntimeException stackOut_13_0 = null;
        StringBuilder stackOut_13_1 = null;
        String stackOut_13_2 = null;
        RuntimeException stackOut_12_0 = null;
        StringBuilder stackOut_12_1 = null;
        String stackOut_12_2 = null;
        RuntimeException stackOut_14_0 = null;
        StringBuilder stackOut_14_1 = null;
        RuntimeException stackOut_16_0 = null;
        StringBuilder stackOut_16_1 = null;
        String stackOut_16_2 = null;
        RuntimeException stackOut_15_0 = null;
        StringBuilder stackOut_15_1 = null;
        String stackOut_15_2 = null;
        RuntimeException stackOut_17_0 = null;
        StringBuilder stackOut_17_1 = null;
        RuntimeException stackOut_19_0 = null;
        StringBuilder stackOut_19_1 = null;
        String stackOut_19_2 = null;
        RuntimeException stackOut_18_0 = null;
        StringBuilder stackOut_18_1 = null;
        String stackOut_18_2 = null;
        RuntimeException stackOut_20_0 = null;
        StringBuilder stackOut_20_1 = null;
        RuntimeException stackOut_22_0 = null;
        StringBuilder stackOut_22_1 = null;
        String stackOut_22_2 = null;
        RuntimeException stackOut_21_0 = null;
        StringBuilder stackOut_21_1 = null;
        String stackOut_21_2 = null;
        RuntimeException stackOut_23_0 = null;
        StringBuilder stackOut_23_1 = null;
        RuntimeException stackOut_25_0 = null;
        StringBuilder stackOut_25_1 = null;
        String stackOut_25_2 = null;
        RuntimeException stackOut_24_0 = null;
        StringBuilder stackOut_24_1 = null;
        String stackOut_24_2 = null;
        try {
          L0: {
            var17 = new cr(0L, param1, br.field_W.toUpperCase());
            var17.field_O = 1;
            ((np) this).field_Hb = new cr(0L, param2);
            var8 = new cr(0L, param3);
            var9 = new cr(0L, param3, ac.field_N);
            var9.field_O = 1;
            var10 = 50;
            var11 = 0;
            var12 = 0;
            L1: while (true) {
              if (sd.field_M.length <= var12) {
                var10 += 15;
                var17.a(126, 90 + (var11 - -20), 24, 0, 0);
                ((np) this).a(95, var17.field_Fb, var17.field_db + var10, 100, 100);
                ((np) this).field_Hb.a(84, 15, 15, 5, var17.field_Fb - 20);
                var8.a(87, ((np) this).field_Fb, ((np) this).field_db + -var17.field_db, var17.field_db, 0);
                var9.a(83, ((np) this).field_Fb, 15, 20, 0);
                var8.field_Bb = vl.a(var8.field_db, 3, 0, 2105376, 11579568, 8421504);
                var17.b(((np) this).field_Hb, 124);
                var8.b(var9, 127);
                ((np) this).b(var17, 121);
                ((np) this).b(var8, 118);
                var10 = -(((np) this).field_db >> 1) + 240;
                ((np) this).field_wb = -(((np) this).field_Fb >> 1) + 320;
                break L0;
              } else {
                L2: {
                  var13 = new cr(0L, param3, qr.field_k[var12]);
                  var14 = new cr(0L, param3, sd.field_M[var12]);
                  var15 = param3.field_z.c(sd.field_M[var12]);
                  var13.a(115, 65, 15, var10, 20);
                  if (var11 >= var15) {
                    break L2;
                  } else {
                    var11 = var15;
                    break L2;
                  }
                }
                var14.a(85, 640, 15, var10, 90);
                var8.b(var13, 121);
                var8.b(var14, 125);
                var10 += 30;
                var12++;
                continue L1;
              }
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L3: {
            var7 = decompiledCaughtException;
            stackOut_8_0 = (RuntimeException) var7;
            stackOut_8_1 = new StringBuilder().append("np.<init>(");
            stackIn_10_0 = stackOut_8_0;
            stackIn_10_1 = stackOut_8_1;
            stackIn_9_0 = stackOut_8_0;
            stackIn_9_1 = stackOut_8_1;
            if (param0 == null) {
              stackOut_10_0 = (RuntimeException) (Object) stackIn_10_0;
              stackOut_10_1 = (StringBuilder) (Object) stackIn_10_1;
              stackOut_10_2 = "null";
              stackIn_11_0 = stackOut_10_0;
              stackIn_11_1 = stackOut_10_1;
              stackIn_11_2 = stackOut_10_2;
              break L3;
            } else {
              stackOut_9_0 = (RuntimeException) (Object) stackIn_9_0;
              stackOut_9_1 = (StringBuilder) (Object) stackIn_9_1;
              stackOut_9_2 = "{...}";
              stackIn_11_0 = stackOut_9_0;
              stackIn_11_1 = stackOut_9_1;
              stackIn_11_2 = stackOut_9_2;
              break L3;
            }
          }
          L4: {
            stackOut_11_0 = (RuntimeException) (Object) stackIn_11_0;
            stackOut_11_1 = ((StringBuilder) (Object) stackIn_11_1).append(stackIn_11_2).append(44);
            stackIn_13_0 = stackOut_11_0;
            stackIn_13_1 = stackOut_11_1;
            stackIn_12_0 = stackOut_11_0;
            stackIn_12_1 = stackOut_11_1;
            if (param1 == null) {
              stackOut_13_0 = (RuntimeException) (Object) stackIn_13_0;
              stackOut_13_1 = (StringBuilder) (Object) stackIn_13_1;
              stackOut_13_2 = "null";
              stackIn_14_0 = stackOut_13_0;
              stackIn_14_1 = stackOut_13_1;
              stackIn_14_2 = stackOut_13_2;
              break L4;
            } else {
              stackOut_12_0 = (RuntimeException) (Object) stackIn_12_0;
              stackOut_12_1 = (StringBuilder) (Object) stackIn_12_1;
              stackOut_12_2 = "{...}";
              stackIn_14_0 = stackOut_12_0;
              stackIn_14_1 = stackOut_12_1;
              stackIn_14_2 = stackOut_12_2;
              break L4;
            }
          }
          L5: {
            stackOut_14_0 = (RuntimeException) (Object) stackIn_14_0;
            stackOut_14_1 = ((StringBuilder) (Object) stackIn_14_1).append(stackIn_14_2).append(44);
            stackIn_16_0 = stackOut_14_0;
            stackIn_16_1 = stackOut_14_1;
            stackIn_15_0 = stackOut_14_0;
            stackIn_15_1 = stackOut_14_1;
            if (param2 == null) {
              stackOut_16_0 = (RuntimeException) (Object) stackIn_16_0;
              stackOut_16_1 = (StringBuilder) (Object) stackIn_16_1;
              stackOut_16_2 = "null";
              stackIn_17_0 = stackOut_16_0;
              stackIn_17_1 = stackOut_16_1;
              stackIn_17_2 = stackOut_16_2;
              break L5;
            } else {
              stackOut_15_0 = (RuntimeException) (Object) stackIn_15_0;
              stackOut_15_1 = (StringBuilder) (Object) stackIn_15_1;
              stackOut_15_2 = "{...}";
              stackIn_17_0 = stackOut_15_0;
              stackIn_17_1 = stackOut_15_1;
              stackIn_17_2 = stackOut_15_2;
              break L5;
            }
          }
          L6: {
            stackOut_17_0 = (RuntimeException) (Object) stackIn_17_0;
            stackOut_17_1 = ((StringBuilder) (Object) stackIn_17_1).append(stackIn_17_2).append(44);
            stackIn_19_0 = stackOut_17_0;
            stackIn_19_1 = stackOut_17_1;
            stackIn_18_0 = stackOut_17_0;
            stackIn_18_1 = stackOut_17_1;
            if (param3 == null) {
              stackOut_19_0 = (RuntimeException) (Object) stackIn_19_0;
              stackOut_19_1 = (StringBuilder) (Object) stackIn_19_1;
              stackOut_19_2 = "null";
              stackIn_20_0 = stackOut_19_0;
              stackIn_20_1 = stackOut_19_1;
              stackIn_20_2 = stackOut_19_2;
              break L6;
            } else {
              stackOut_18_0 = (RuntimeException) (Object) stackIn_18_0;
              stackOut_18_1 = (StringBuilder) (Object) stackIn_18_1;
              stackOut_18_2 = "{...}";
              stackIn_20_0 = stackOut_18_0;
              stackIn_20_1 = stackOut_18_1;
              stackIn_20_2 = stackOut_18_2;
              break L6;
            }
          }
          L7: {
            stackOut_20_0 = (RuntimeException) (Object) stackIn_20_0;
            stackOut_20_1 = ((StringBuilder) (Object) stackIn_20_1).append(stackIn_20_2).append(44);
            stackIn_22_0 = stackOut_20_0;
            stackIn_22_1 = stackOut_20_1;
            stackIn_21_0 = stackOut_20_0;
            stackIn_21_1 = stackOut_20_1;
            if (param4 == null) {
              stackOut_22_0 = (RuntimeException) (Object) stackIn_22_0;
              stackOut_22_1 = (StringBuilder) (Object) stackIn_22_1;
              stackOut_22_2 = "null";
              stackIn_23_0 = stackOut_22_0;
              stackIn_23_1 = stackOut_22_1;
              stackIn_23_2 = stackOut_22_2;
              break L7;
            } else {
              stackOut_21_0 = (RuntimeException) (Object) stackIn_21_0;
              stackOut_21_1 = (StringBuilder) (Object) stackIn_21_1;
              stackOut_21_2 = "{...}";
              stackIn_23_0 = stackOut_21_0;
              stackIn_23_1 = stackOut_21_1;
              stackIn_23_2 = stackOut_21_2;
              break L7;
            }
          }
          L8: {
            stackOut_23_0 = (RuntimeException) (Object) stackIn_23_0;
            stackOut_23_1 = ((StringBuilder) (Object) stackIn_23_1).append(stackIn_23_2).append(44);
            stackIn_25_0 = stackOut_23_0;
            stackIn_25_1 = stackOut_23_1;
            stackIn_24_0 = stackOut_23_0;
            stackIn_24_1 = stackOut_23_1;
            if (param5 == null) {
              stackOut_25_0 = (RuntimeException) (Object) stackIn_25_0;
              stackOut_25_1 = (StringBuilder) (Object) stackIn_25_1;
              stackOut_25_2 = "null";
              stackIn_26_0 = stackOut_25_0;
              stackIn_26_1 = stackOut_25_1;
              stackIn_26_2 = stackOut_25_2;
              break L8;
            } else {
              stackOut_24_0 = (RuntimeException) (Object) stackIn_24_0;
              stackOut_24_1 = (StringBuilder) (Object) stackIn_24_1;
              stackOut_24_2 = "{...}";
              stackIn_26_0 = stackOut_24_0;
              stackIn_26_1 = stackOut_24_1;
              stackIn_26_2 = stackOut_24_2;
              break L8;
            }
          }
          throw wn.a((Throwable) (Object) stackIn_26_0, stackIn_26_2 + 41);
        }
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_Mb = "Concluded";
        field_Jb = "End Game";
        field_Ob = -1;
    }
}
