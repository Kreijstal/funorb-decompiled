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
        if (param0 != 0) {
          field_e = (da) null;
          field_e = null;
          return;
        } else {
          field_e = null;
          return;
        }
    }

    final static void a(int param0, qm param1, int param2, el param3) {
        RuntimeException stackIn_16_0 = null;
        StringBuilder stackIn_16_1 = null;
        RuntimeException stackIn_17_0 = null;
        StringBuilder stackIn_17_1 = null;
        String stackIn_17_2 = null;
        StringBuilder stackIn_19_1 = null;
        StringBuilder stackIn_20_1 = null;
        String stackIn_20_2 = null;
        RuntimeException decompiledCaughtException = null;
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
            var10 = db.b(param3, var7, param0 * pc.field_h >> -699864667, var8);
            lg.a(var10, (byte) -68);
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L5: {
            var4 = decompiledCaughtException;
            stackIn_16_0 = (RuntimeException) (var4);

            stackIn_16_1 = new StringBuilder().append("rd.L(").append(param0).append(',');

            if (param1 == null) {
              stackIn_17_0 = (RuntimeException) ((Object) stackIn_16_0);
              stackIn_17_1 = (StringBuilder) ((Object) stackIn_16_1);
              stackIn_17_2 = "null";
              break L5;
            } else {
              stackIn_17_0 = (RuntimeException) ((Object) stackIn_16_0);
              stackIn_17_1 = (StringBuilder) ((Object) stackIn_16_1);
              stackIn_17_2 = "{...}";
              break L5;
            }
          }
          L6: {


            stackIn_19_1 = ((StringBuilder) (Object) stackIn_17_1).append(stackIn_17_2).append(',').append(param2).append(',');

            if (param3 == null) {
              stackIn_17_0 = (RuntimeException) ((Object) stackIn_17_0);
              stackIn_20_1 = (StringBuilder) ((Object) stackIn_19_1);
              stackIn_20_2 = "null";
              break L6;
            } else {
              stackIn_17_0 = (RuntimeException) ((Object) stackIn_17_0);
              stackIn_20_1 = (StringBuilder) ((Object) stackIn_19_1);
              stackIn_20_2 = "{...}";
              break L6;
            }
          }
          throw kk.a((Throwable) ((Object) stackIn_17_0), stackIn_20_2 + ')');
        }
    }

    final static void a(int param0, int param1, byte param2, int param3, int param4, String param5) {
        try {
            if (param2 != -83) {
                rd.a(54, -109);
            }
            on.field_t.a(param0 - 381, param4);
            nj.field_i.a(param0, param4);
            nm.field_c.a(param5, param3, (nm.field_c.field_G + 30) / 2 + (param4 + -2), param1, -1);
        } catch (RuntimeException runtimeException) {
            throw kk.a((Throwable) ((Object) runtimeException), "rd.H(" + param0 + ',' + param1 + ',' + param2 + ',' + param3 + ',' + param4 + ',' + (param5 != null ? "{...}" : "null") + ')');
        }
    }

    final static void a(byte param0, ib param1, java.awt.Frame param2) {
        af var3 = null;
        int var4 = 0;
        String var5 = null;
        RuntimeException stackIn_13_0 = null;
        StringBuilder stackIn_13_1 = null;
        RuntimeException stackIn_14_0 = null;
        StringBuilder stackIn_14_1 = null;
        String stackIn_14_2 = null;
        StringBuilder stackIn_16_1 = null;
        StringBuilder stackIn_17_1 = null;
        String stackIn_17_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var3_ref = null;
        var4 = HoldTheLine.field_D;
        try {
          L0: {
            L1: {
              if (param0 > 101) {
                break L1;
              } else {
                var5 = (String) null;
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
            stackIn_13_0 = (RuntimeException) (var3_ref);

            stackIn_13_1 = new StringBuilder().append("rd.J(").append(param0).append(',');

            if (param1 == null) {
              stackIn_14_0 = (RuntimeException) ((Object) stackIn_13_0);
              stackIn_14_1 = (StringBuilder) ((Object) stackIn_13_1);
              stackIn_14_2 = "null";
              break L4;
            } else {
              stackIn_14_0 = (RuntimeException) ((Object) stackIn_13_0);
              stackIn_14_1 = (StringBuilder) ((Object) stackIn_13_1);
              stackIn_14_2 = "{...}";
              break L4;
            }
          }
          L5: {


            stackIn_16_1 = ((StringBuilder) (Object) stackIn_14_1).append(stackIn_14_2).append(',');

            if (param2 == null) {
              stackIn_14_0 = (RuntimeException) ((Object) stackIn_14_0);
              stackIn_17_1 = (StringBuilder) ((Object) stackIn_16_1);
              stackIn_17_2 = "null";
              break L5;
            } else {
              stackIn_14_0 = (RuntimeException) ((Object) stackIn_14_0);
              stackIn_17_1 = (StringBuilder) ((Object) stackIn_16_1);
              stackIn_17_2 = "{...}";
              break L5;
            }
          }
          throw kk.a((Throwable) ((Object) stackIn_14_0), stackIn_17_2 + ')');
        }
    }

    abstract void a(int[] param0, int param1, byte param2, int[] param3);

    final static int a(int param0, int param1) {
        param1 = (1431655765 & param1) - -(-715827883 & param1 >>> 479355201);
        param1 = (param1 & 858993459) - -(-1288490189 & param1 >>> -94366878);
        param1 = 252645135 & param1 - -(param1 >>> 648006948);
        if (param0 != -699864667) {
          rd.b(27);
          param1 = param1 + (param1 >>> -1772444088);
          param1 = param1 + (param1 >>> 384594992);
          return param1 & 255;
        } else {
          param1 = param1 + (param1 >>> -1772444088);
          param1 = param1 + (param1 >>> 384594992);
          return param1 & 255;
        }
    }

    final static boolean b(int param0) {
        if (param0 >= -46) {
            field_e = (da) null;
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
            RuntimeException stackIn_6_0 = null;
            StringBuilder stackIn_6_1 = null;
            RuntimeException stackIn_7_0 = null;
            StringBuilder stackIn_7_1 = null;
            String stackIn_7_2 = null;
            Throwable decompiledCaughtException = null;
            try {
              L0: {
                try {
                  L1: {
                    var4 = Class.forName("mb");
                    var5 = (mm) (var4.newInstance());
                    var6 = -115 / ((param1 - 2) / 39);
                    var5.a(param3, param0, param2, 0);
                    stackIn_1_0 = (mm) (var5);
                    break L1;
                  }
                } catch (java.lang.Throwable decompiledCaughtParameter0) {
                  decompiledCaughtException = decompiledCaughtParameter0;
                  var4_ref = decompiledCaughtException;
                  var5_ref = new sf();
                  ((mm) ((Object) var5_ref)).a(param3, param0, param2, 0);
                  stackIn_3_0 = (sf) (var5_ref);
                  return (mm) ((Object) stackIn_3_0);
                }
                break L0;
              }
            } catch (java.lang.RuntimeException decompiledCaughtParameter1) {
              decompiledCaughtException = decompiledCaughtParameter1;
              L2: {
                var4_ref2 = (RuntimeException) (Object) decompiledCaughtException;
                stackIn_6_0 = (RuntimeException) (var4_ref2);

                stackIn_6_1 = new StringBuilder().append("rd.M(").append(param0).append(',').append(param1).append(',');

                if (param2 == null) {
                  stackIn_7_0 = (RuntimeException) ((Object) stackIn_6_0);
                  stackIn_7_1 = (StringBuilder) ((Object) stackIn_6_1);
                  stackIn_7_2 = "null";
                  break L2;
                } else {
                  stackIn_7_0 = (RuntimeException) ((Object) stackIn_6_0);
                  stackIn_7_1 = (StringBuilder) ((Object) stackIn_6_1);
                  stackIn_7_2 = "{...}";
                  break L2;
                }
              }
              throw kk.a((Throwable) ((Object) stackIn_7_0), stackIn_7_2 + ',' + param3 + ')');
            }
            return stackIn_1_0;
        } catch (RuntimeException | Error decompiledUncheckedException) {
            throw decompiledUncheckedException;
        } catch (Throwable decompiledCheckedException) {
            throw new RuntimeException(decompiledCheckedException);
        }
    }

    static {
        field_b = new float[]{50.0f, 300.0f, 500.0f};
        field_a = "Loading levels";
        field_f = 0;
        field_l = -1;
    }
}
