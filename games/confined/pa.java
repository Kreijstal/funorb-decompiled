/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class pa {
    static int field_b;
    static char[] field_d;
    static boolean field_c;
    static boolean[] field_e;
    static double field_a;

    static long a(long param0, long param1) {
        return param0 ^ param1;
    }

    final static void a(double param0, double param1, byte param2, int param3, double param4, double param5, nf param6, double param7, vg param8) {
        double var14_double = 0.0;
        RuntimeException var14 = null;
        double var16 = 0.0;
        double var18 = 0.0;
        double var20 = 0.0;
        double var22 = 0.0;
        double var24 = 0.0;
        int var26 = 0;
        int var27 = 0;
        int var28 = 0;
        double var29 = 0.0;
        int var31 = 0;
        nf stackIn_8_0;
        int stackIn_8_1;
        int stackIn_8_2;
        int stackIn_8_3;
        int stackIn_8_4;
        nf stackIn_9_0;
        int stackIn_9_1;
        int stackIn_9_2;
        int stackIn_9_3;
        int stackIn_9_4;
        int stackIn_9_5;
        RuntimeException stackIn_13_0 = null;
        StringBuilder stackIn_13_1 = null;
        RuntimeException stackIn_14_0 = null;
        StringBuilder stackIn_14_1 = null;
        String stackIn_14_2 = null;
        StringBuilder stackIn_16_1 = null;
        StringBuilder stackIn_17_1 = null;
        String stackIn_17_2 = null;
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        try {
          L0: {
            if (param2 == -11) {
              var14_double = -param8.field_T + param0;
              var16 = param5 - param8.field_L;
              var18 = -param8.field_O + param4;
              var20 = var18 * param8.field_M + (param8.field_R * var14_double + var16 * param8.field_ab);
              var22 = param8.field_V * var14_double + var16 * param8.field_U + param8.field_F * var18;
              var24 = var18 * param8.field_N + (param8.field_P * var14_double + param8.field_H * var16);
              if (var24 >= 0.15) {
                var26 = 320 - -(int)(var20 / var24 * 640.0);
                var27 = 188 - -(int)(640.0 * (var22 / var24));
                var28 = (int)(param1 / var24 * 640.0);
                var29 = (double)(2 * param3) * (1.0 - var18 / param7);
                var31 = (int)qn.field_v.a(var29, 0, param4);
                if (-1 > (var31 ^ -1)) {
                  L1: {
                    stackIn_8_0 = (nf) (param6);

                    stackIn_8_1 = var26 - var28;

                    stackIn_8_2 = -var28 + var27;

                    stackIn_8_3 = 2 * var28;

                    stackIn_8_4 = 2 * var28;

                    if (param3 < var31) {
                      stackIn_9_0 = (nf) ((Object) stackIn_8_0);
                      stackIn_9_1 = stackIn_8_1;
                      stackIn_9_2 = stackIn_8_2;
                      stackIn_9_3 = stackIn_8_3;
                      stackIn_9_4 = stackIn_8_4;
                      stackIn_9_5 = param3;
                      break L1;
                    } else {
                      stackIn_9_0 = (nf) ((Object) stackIn_8_0);
                      stackIn_9_1 = stackIn_8_1;
                      stackIn_9_2 = stackIn_8_2;
                      stackIn_9_3 = stackIn_8_3;
                      stackIn_9_4 = stackIn_8_4;
                      stackIn_9_5 = var31;
                      break L1;
                    }
                  }
                  ((nf) (Object) stackIn_9_0).d(stackIn_9_1, stackIn_9_2, stackIn_9_3, stackIn_9_4, stackIn_9_5);
                  decompiledRegionSelector0 = 1;
                  break L0;
                } else {
                  return;
                }
              } else {
                return;
              }
            } else {
              decompiledRegionSelector0 = 0;
              break L0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L2: {
            var14 = decompiledCaughtException;
            stackIn_13_0 = (RuntimeException) (var14);

            stackIn_13_1 = new StringBuilder().append("pa.D(").append(param0).append(',').append(param1).append(',').append(param2).append(',').append(param3).append(',').append(param4).append(',').append(param5).append(',');

            if (param6 == null) {
              stackIn_14_0 = (RuntimeException) ((Object) stackIn_13_0);
              stackIn_14_1 = (StringBuilder) ((Object) stackIn_13_1);
              stackIn_14_2 = "null";
              break L2;
            } else {
              stackIn_14_0 = (RuntimeException) ((Object) stackIn_13_0);
              stackIn_14_1 = (StringBuilder) ((Object) stackIn_13_1);
              stackIn_14_2 = "{...}";
              break L2;
            }
          }
          L3: {


            stackIn_16_1 = ((StringBuilder) (Object) stackIn_14_1).append(stackIn_14_2).append(',').append(param7).append(',');

            if (param8 == null) {
              stackIn_14_0 = (RuntimeException) ((Object) stackIn_14_0);
              stackIn_17_1 = (StringBuilder) ((Object) stackIn_16_1);
              stackIn_17_2 = "null";
              break L3;
            } else {
              stackIn_14_0 = (RuntimeException) ((Object) stackIn_14_0);
              stackIn_17_1 = (StringBuilder) ((Object) stackIn_16_1);
              stackIn_17_2 = "{...}";
              break L3;
            }
          }
          throw sd.a((Throwable) ((Object) stackIn_14_0), stackIn_17_2 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return;
        } else {
          return;
        }
    }

    final static boolean a(boolean param0) {
        if (!param0) {
          if (null != kl.field_G) {
            if (!lk.field_d.a(-128)) {
              return false;
            } else {
              return true;
            }
          } else {
            return false;
          }
        } else {
          field_d = (char[]) null;
          if (null != kl.field_G) {
            if (!lk.field_d.a(-128)) {
              return false;
            } else {
              return true;
            }
          } else {
            return false;
          }
        }
    }

    final static String a(java.applet.Applet param0, int param1) {
        try {
            String var3 = null;
            String var4 = null;
            String[] var5 = null;
            int var6 = 0;
            int var7 = 0;
            int var8 = 0;
            String var9 = null;
            String stackIn_6_0 = null;
            String stackIn_13_0 = null;
            RuntimeException stackIn_16_0 = null;
            StringBuilder stackIn_16_1 = null;
            RuntimeException stackIn_17_0 = null;
            StringBuilder stackIn_17_1 = null;
            String stackIn_17_2 = null;
            int decompiledRegionSelector0 = 0;
            int decompiledRegionSelector1 = 0;
            Throwable decompiledCaughtException = null;
            Throwable var2 = null;
            RuntimeException var2_ref = null;
            var8 = Confined.field_J ? 1 : 0;
            try {
              L0: {
                try {
                  L1: {
                    var9 = param0.getParameter("cookieprefix");
                    var3 = var9 + "settings";
                    var4 = (String) (kf.a(75, "getcookies", param0));
                    var5 = ij.a(param1 ^ 59, (char)param1, var4);
                    var6 = 0;
                    L2: while (true) {
                      if (var5.length <= var6) {
                        decompiledRegionSelector0 = 0;
                        break L1;
                      } else {
                        L3: {
                          var7 = var5[var6].indexOf('=');
                          if ((var7 ^ -1) > -1) {
                            break L3;
                          } else {
                            if (!var5[var6].substring(0, var7).trim().equals(var3)) {
                              break L3;
                            } else {
                              stackIn_6_0 = var5[var6].substring(1 + var7).trim();
                              decompiledRegionSelector0 = 1;
                              break L1;
                            }
                          }
                        }
                        var6++;
                        continue L2;
                      }
                    }
                  }
                } catch (java.lang.Throwable decompiledCaughtParameter0) {
                  decompiledCaughtException = decompiledCaughtParameter0;
                  L4: {
                    var2 = decompiledCaughtException;
                    decompiledRegionSelector0 = 0;
                    break L4;
                  }
                }
                if (decompiledRegionSelector0 == 0) {
                  if (null != wm.field_jb) {
                    stackIn_13_0 = wm.field_jb;
                    decompiledRegionSelector1 = 0;
                    break L0;
                  } else {
                    return param0.getParameter("settings");
                  }
                } else {
                  decompiledRegionSelector1 = 1;
                  break L0;
                }
              }
            } catch (java.lang.RuntimeException decompiledCaughtParameter1) {
              decompiledCaughtException = decompiledCaughtParameter1;
              L5: {
                var2_ref = (RuntimeException) (Object) decompiledCaughtException;
                stackIn_16_0 = (RuntimeException) (var2_ref);

                stackIn_16_1 = new StringBuilder().append("pa.A(");

                if (param0 == null) {
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
              throw sd.a((Throwable) ((Object) stackIn_17_0), stackIn_17_2 + ',' + param1 + ')');
            }
            if (decompiledRegionSelector1 == 0) {
              return stackIn_13_0;
            } else {
              return stackIn_6_0;
            }
        } catch (RuntimeException | Error decompiledUncheckedException) {
            throw decompiledUncheckedException;
        } catch (Throwable decompiledCheckedException) {
            throw new RuntimeException(decompiledCheckedException);
        }
    }

    public static void a(byte param0) {
        field_e = null;
        int var1 = 5 / ((param0 - -16) / 38);
        field_d = null;
    }

    static {
        field_d = new char[]{(char)91, (char)93, (char)35};
        field_c = false;
        field_b = -1;
    }
}
