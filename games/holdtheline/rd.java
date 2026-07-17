/*
 * Decompiled by CFR-JS 0.4.0.
 */
abstract class rd {
    static int field_g;
    float field_k;
    int field_i;
    static float[] field_b;
    static da field_e;
    static java.applet.Applet field_d;
    static int field_f;
    static int field_l;
    static String field_a;
    int field_h;
    int field_c;
    static String field_j;

    public static void a(int param0) {
        field_a = null;
        field_b = null;
        field_j = null;
        field_d = null;
        field_e = null;
    }

    final static void a(int param0, qm param1, int param2, el param3) {
        int var4_int = 0;
        RuntimeException var4 = null;
        int var5 = 0;
        int var6 = 0;
        int var7 = 0;
        int var8 = 0;
        int var9 = 0;
        float var10_float = 0.0f;
        db var10 = null;
        float var11 = 0.0f;
        float var12 = 0.0f;
        float var13 = 0.0f;
        float var14 = 0.0f;
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
        RuntimeException decompiledCaughtException = null;
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
        try {
          L0: {
            L1: {
              var4_int = 0;
              var5 = 0;
              var6 = 0;
              if (ch.field_i != null) {
                var4_int = param1.field_h + -ch.field_i.field_A.field_h;
                var5 = -ch.field_i.field_A.field_f + param1.field_f;
                var6 = var5 * var5 + var4_int * var4_int;
                break L1;
              } else {
                break L1;
              }
            }
            L2: {
              var9 = -68 % ((param2 - 47) / 59);
              if (var6 <= 0) {
                var7 = 256;
                var8 = 8192;
                break L2;
              } else {
                L3: {
                  var10_float = (float)Math.sqrt((double)var6);
                  var11 = -ch.field_i.field_t;
                  var12 = -ch.field_i.field_x;
                  var13 = (var12 * (float)var5 + var11 * (float)var4_int) / var10_float;
                  var13 = 160.0f / (var13 + 160.0f);
                  if (var13 < 0.75f) {
                    var13 = 0.75f;
                    break L3;
                  } else {
                    break L3;
                  }
                }
                L4: {
                  if (1.25f < var13) {
                    var13 = 1.25f;
                    break L4;
                  } else {
                    break L4;
                  }
                }
                var7 = (int)(var13 * 256.0f);
                var14 = (float)var4_int / var10_float;
                var8 = (int)(8192.0f * (1.0f + var14));
                break L2;
              }
            }
            var10 = db.b(param3, var7, param0 * pc.field_h >> 5, var8);
            ui discarded$1 = lg.a(var10, (byte) -68);
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L5: {
            var4 = decompiledCaughtException;
            stackOut_14_0 = (RuntimeException) var4;
            stackOut_14_1 = new StringBuilder().append("rd.L(").append(param0).append(44);
            stackIn_16_0 = stackOut_14_0;
            stackIn_16_1 = stackOut_14_1;
            stackIn_15_0 = stackOut_14_0;
            stackIn_15_1 = stackOut_14_1;
            if (param1 == null) {
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
            stackOut_17_1 = ((StringBuilder) (Object) stackIn_17_1).append(stackIn_17_2).append(44).append(param2).append(44);
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
          throw kk.a((Throwable) (Object) stackIn_20_0, stackIn_20_2 + 41);
        }
    }

    final static void a(int param0, int param1, byte param2, int param3, int param4, String param5) {
        try {
            if (param2 != -83) {
                int discarded$0 = rd.a(54, -109);
            }
            on.field_t.a(param0 - 381, param4);
            nj.field_i.a(param0, param4);
            nm.field_c.a(param5, param3, (nm.field_c.field_G + 30) / 2 + (param4 + -2), param1, -1);
        } catch (RuntimeException runtimeException) {
            throw kk.a((Throwable) (Object) runtimeException, "rd.H(" + param0 + 44 + param1 + 44 + param2 + 44 + param3 + 44 + param4 + 44 + (param5 != null ? "{...}" : "null") + 41);
        }
    }

    final static void a(byte param0, ib param1, java.awt.Frame param2) {
        af var3 = null;
        RuntimeException var3_ref = null;
        int var4 = 0;
        Object var5 = null;
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
        RuntimeException decompiledCaughtException = null;
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
        var4 = HoldTheLine.field_D;
        try {
          L0: {
            L1: {
              if (param0 > 101) {
                break L1;
              } else {
                var5 = null;
                rd.a(113, -110, (byte) 115, 12, -60, (String) null);
                break L1;
              }
            }
            L2: while (true) {
              var3 = param1.a(param2, (byte) -95);
              L3: while (true) {
                if (var3.field_d != 0) {
                  if (1 != var3.field_d) {
                    qe.a(100L, (byte) 45);
                    continue L2;
                  } else {
                    param2.setVisible(false);
                    param2.dispose();
                    break L0;
                  }
                } else {
                  qe.a(10L, (byte) 45);
                  continue L3;
                }
              }
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L4: {
            var3_ref = decompiledCaughtException;
            stackOut_11_0 = (RuntimeException) var3_ref;
            stackOut_11_1 = new StringBuilder().append("rd.J(").append(param0).append(44);
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
          throw kk.a((Throwable) (Object) stackIn_17_0, stackIn_17_2 + 41);
        }
    }

    abstract void a(int[] param0, int param1, byte param2, int[] param3);

    final static int a(int param0, int param1) {
        param1 = (1431655765 & param1) - -(-715827883 & param1 >>> 1);
        param1 = (param1 & 858993459) - -(-1288490189 & param1 >>> 2);
        param1 = 252645135 & param1 - -(param1 >>> 4);
        if (param0 != -699864667) {
          boolean discarded$2 = rd.b(27);
          param1 = param1 + (param1 >>> 8);
          param1 = param1 + (param1 >>> 16);
          return param1 & 255;
        } else {
          param1 = param1 + (param1 >>> 8);
          param1 = param1 + (param1 >>> 16);
          return param1 & 255;
        }
    }

    final static boolean b(int param0) {
        if (param0 >= -46) {
            field_e = null;
            return ci.field_o;
        }
        return ci.field_o;
    }

    final static mm a(int param0, int param1, java.awt.Component param2, int param3) {
        try {
            Class var4 = null;
            Throwable var4_ref = null;
            RuntimeException var4_ref2 = null;
            mm var5 = null;
            sf var5_ref = null;
            int var6 = 0;
            mm stackIn_1_0 = null;
            sf stackIn_3_0 = null;
            RuntimeException stackIn_5_0 = null;
            StringBuilder stackIn_5_1 = null;
            RuntimeException stackIn_6_0 = null;
            StringBuilder stackIn_6_1 = null;
            RuntimeException stackIn_7_0 = null;
            StringBuilder stackIn_7_1 = null;
            String stackIn_7_2 = null;
            Throwable decompiledCaughtException = null;
            mm stackOut_0_0 = null;
            sf stackOut_2_0 = null;
            RuntimeException stackOut_4_0 = null;
            StringBuilder stackOut_4_1 = null;
            RuntimeException stackOut_6_0 = null;
            StringBuilder stackOut_6_1 = null;
            String stackOut_6_2 = null;
            RuntimeException stackOut_5_0 = null;
            StringBuilder stackOut_5_1 = null;
            String stackOut_5_2 = null;
            try {
              try {
                var4 = Class.forName("mb");
                var5 = (mm) var4.newInstance();
                var6 = -115 / ((param1 - 2) / 39);
                var5.a(param3, param0, param2, 0);
                stackOut_0_0 = (mm) var5;
                stackIn_1_0 = stackOut_0_0;
                return stackIn_1_0;
              } catch (java.lang.Throwable decompiledCaughtParameter0) {
                decompiledCaughtException = decompiledCaughtParameter0;
                var4_ref = decompiledCaughtException;
                var5_ref = new sf();
                ((mm) (Object) var5_ref).a(param3, param0, param2, 0);
                stackOut_2_0 = (sf) var5_ref;
                stackIn_3_0 = stackOut_2_0;
                return (mm) (Object) stackIn_3_0;
              }
            } catch (java.lang.RuntimeException decompiledCaughtParameter1) {
              decompiledCaughtException = decompiledCaughtParameter1;
              L0: {
                var4_ref2 = (RuntimeException) (Object) decompiledCaughtException;
                stackOut_4_0 = (RuntimeException) var4_ref2;
                stackOut_4_1 = new StringBuilder().append("rd.M(").append(param0).append(44).append(param1).append(44);
                stackIn_6_0 = stackOut_4_0;
                stackIn_6_1 = stackOut_4_1;
                stackIn_5_0 = stackOut_4_0;
                stackIn_5_1 = stackOut_4_1;
                if (param2 == null) {
                  stackOut_6_0 = (RuntimeException) (Object) stackIn_6_0;
                  stackOut_6_1 = (StringBuilder) (Object) stackIn_6_1;
                  stackOut_6_2 = "null";
                  stackIn_7_0 = stackOut_6_0;
                  stackIn_7_1 = stackOut_6_1;
                  stackIn_7_2 = stackOut_6_2;
                  break L0;
                } else {
                  stackOut_5_0 = (RuntimeException) (Object) stackIn_5_0;
                  stackOut_5_1 = (StringBuilder) (Object) stackIn_5_1;
                  stackOut_5_2 = "{...}";
                  stackIn_7_0 = stackOut_5_0;
                  stackIn_7_1 = stackOut_5_1;
                  stackIn_7_2 = stackOut_5_2;
                  break L0;
                }
              }
              throw kk.a((Throwable) (Object) stackIn_7_0, stackIn_7_2 + 44 + param3 + 41);
            }
        } catch (RuntimeException | Error decompiledUncheckedException) {
            throw decompiledUncheckedException;
        } catch (Throwable decompiledCheckedException) {
            throw new RuntimeException(decompiledCheckedException);
        }
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_b = new float[]{50.0f, 300.0f, 500.0f};
        field_a = "Loading levels";
        field_f = 0;
        field_l = -1;
    }
}
