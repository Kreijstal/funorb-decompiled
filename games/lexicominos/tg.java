/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class tg extends kd {
    static java.applet.Applet field_i;
    static int field_j;
    int field_k;
    byte[] field_h;

    final static void a(java.math.BigInteger param0, int param1, java.math.BigInteger param2, byte param3, wf param4, int param5, byte[] param6) {
        RuntimeException stackIn_23_0 = null;
        StringBuilder stackIn_23_1 = null;
        RuntimeException stackIn_24_0 = null;
        StringBuilder stackIn_24_1 = null;
        String stackIn_24_2 = null;
        StringBuilder stackIn_26_1 = null;
        StringBuilder stackIn_27_1 = null;
        String stackIn_27_2 = null;
        StringBuilder stackIn_29_1 = null;
        StringBuilder stackIn_30_1 = null;
        String stackIn_30_2 = null;
        StringBuilder stackIn_32_1 = null;
        StringBuilder stackIn_33_1 = null;
        String stackIn_33_2 = null;
        RuntimeException decompiledCaughtException = null;
        int var7_int = 0;
        RuntimeException var7 = null;
        int[] var8 = null;
        int var9 = 0;
        int var10 = 0;
        int var11 = 0;
        int[] var12 = null;
        int[] var13 = null;
        var10 = Lexicominos.field_L ? 1 : 0;
        try {
          L0: {
            L1: {
              if (param3 == 84) {
                break L1;
              } else {
                field_i = (java.applet.Applet) null;
                break L1;
              }
            }
            L2: {
              var7_int = kf.a((byte) -21, param1);
              if (null != kd.field_e) {
                break L2;
              } else {
                kd.field_e = new java.security.SecureRandom();
                break L2;
              }
            }
            var13 = new int[4];
            var12 = var13;
            var8 = var12;
            var9 = 0;
            L3: while (true) {
              if (-5 >= (var9 ^ -1)) {
                L4: {
                  L5: {
                    if (null == gd.field_m) {
                      break L5;
                    } else {
                      if (var7_int > gd.field_m.field_j.length) {
                        break L5;
                      } else {
                        break L4;
                      }
                    }
                  }
                  gd.field_m = new wf(var7_int);
                  break L4;
                }
                L6: {
                  L7: {
                    gd.field_m.field_h = 0;
                    gd.field_m.a(param5, param6, 255, param1);
                    gd.field_m.e(var7_int, (byte) 82);
                    gd.field_m.a(-661454965, var13);
                    if (null == fc.field_z) {
                      break L7;
                    } else {
                      if ((fc.field_z.field_j.length ^ -1) > -101) {
                        break L7;
                      } else {
                        break L6;
                      }
                    }
                  }
                  fc.field_z = new wf(100);
                  break L6;
                }
                fc.field_z.field_h = 0;
                fc.field_z.c(10, -1);
                var11 = 0;
                var9 = var11;
                L8: while (true) {
                  if (var11 >= 4) {
                    fc.field_z.e(112, param1);
                    fc.field_z.a(param3 ^ -11, param2, param0);
                    param4.a(0, fc.field_z.field_j, param3 + 171, fc.field_z.field_h);
                    param4.a(0, gd.field_m.field_j, 255, gd.field_m.field_h);
                    break L0;
                  } else {
                    fc.field_z.f(var13[var11], -32287);
                    var11++;
                    continue L8;
                  }
                }
              } else {
                var8[var9] = kd.field_e.nextInt();
                var9++;
                continue L3;
              }
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L9: {
            var7 = decompiledCaughtException;
            stackIn_23_0 = (RuntimeException) (var7);

            stackIn_23_1 = new StringBuilder().append("tg.D(");

            if (param0 == null) {
              stackIn_24_0 = (RuntimeException) ((Object) stackIn_23_0);
              stackIn_24_1 = (StringBuilder) ((Object) stackIn_23_1);
              stackIn_24_2 = "null";
              break L9;
            } else {
              stackIn_24_0 = (RuntimeException) ((Object) stackIn_23_0);
              stackIn_24_1 = (StringBuilder) ((Object) stackIn_23_1);
              stackIn_24_2 = "{...}";
              break L9;
            }
          }
          L10: {


            stackIn_26_1 = ((StringBuilder) (Object) stackIn_24_1).append(stackIn_24_2).append(',').append(param1).append(',');

            if (param2 == null) {
              stackIn_24_0 = (RuntimeException) ((Object) stackIn_24_0);
              stackIn_27_1 = (StringBuilder) ((Object) stackIn_26_1);
              stackIn_27_2 = "null";
              break L10;
            } else {
              stackIn_24_0 = (RuntimeException) ((Object) stackIn_24_0);
              stackIn_27_1 = (StringBuilder) ((Object) stackIn_26_1);
              stackIn_27_2 = "{...}";
              break L10;
            }
          }
          L11: {


            stackIn_29_1 = ((StringBuilder) (Object) stackIn_27_1).append(stackIn_27_2).append(',').append(param3).append(',');

            if (param4 == null) {
              stackIn_24_0 = (RuntimeException) ((Object) stackIn_24_0);
              stackIn_30_1 = (StringBuilder) ((Object) stackIn_29_1);
              stackIn_30_2 = "null";
              break L11;
            } else {
              stackIn_24_0 = (RuntimeException) ((Object) stackIn_24_0);
              stackIn_30_1 = (StringBuilder) ((Object) stackIn_29_1);
              stackIn_30_2 = "{...}";
              break L11;
            }
          }
          L12: {


            stackIn_32_1 = ((StringBuilder) (Object) stackIn_30_1).append(stackIn_30_2).append(',').append(param5).append(',');

            if (param6 == null) {
              stackIn_24_0 = (RuntimeException) ((Object) stackIn_24_0);
              stackIn_33_1 = (StringBuilder) ((Object) stackIn_32_1);
              stackIn_33_2 = "null";
              break L12;
            } else {
              stackIn_24_0 = (RuntimeException) ((Object) stackIn_24_0);
              stackIn_33_1 = (StringBuilder) ((Object) stackIn_32_1);
              stackIn_33_2 = "{...}";
              break L12;
            }
          }
          throw ld.a((Throwable) ((Object) stackIn_24_0), stackIn_33_2 + ')');
        }
    }

    final static void a(boolean param0, boolean param1, int param2) {
        if (param1) {
            lf.c(0, 0, lf.field_f, lf.field_a, 0, 192);
        } else {
            lf.a();
        }
        we.a((byte) -65, param1);
        int var3 = -78 % ((param2 - -61) / 51);
    }

    public static void a(int param0) {
        field_i = null;
        if (param0 != 0) {
            tg.a(true, false, 96);
        }
    }

    final static void a(wh param0, int param1, wh param2, int param3, int param4, int param5) {
        try {
            oh.field_b = param5;
            we.field_l = param3;
            fg.field_c = param2;
            if (param4 >= -99) {
                field_j = -2;
            }
            sc.field_d = param0;
            jh.field_e = param1;
        } catch (RuntimeException runtimeException) {
            throw ld.a((Throwable) ((Object) runtimeException), "tg.C(" + (param0 != null ? "{...}" : "null") + ',' + param1 + ',' + (param2 != null ? "{...}" : "null") + ',' + param3 + ',' + param4 + ',' + param5 + ')');
        }
    }

    private tg() throws Throwable {
        throw new Error();
    }

    static {
        field_j = 8;
    }
}
