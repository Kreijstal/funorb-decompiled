/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class jg implements Runnable {
    qb field_c;
    static String field_e;
    static String field_f;
    volatile ap[] field_d;
    volatile boolean field_b;
    static String field_g;
    volatile boolean field_a;

    final static void a(int param0) {
        qq.field_I = ks.c(108);
        if (param0 != 0) {
          field_f = (String) null;
          le.field_e = new tc();
          wa.a((byte) -50, true, true);
          return;
        } else {
          le.field_e = new tc();
          wa.a((byte) -50, true, true);
          return;
        }
    }

    final static void a(int param0, int param1, int param2, int param3, int param4, boolean param5, int param6, int param7, int[] param8, int param9) {
        int var16 = 0;
        RuntimeException stackIn_10_0 = null;
        StringBuilder stackIn_10_1 = null;
        RuntimeException stackIn_11_0 = null;
        StringBuilder stackIn_11_1 = null;
        String stackIn_11_2 = null;
        RuntimeException decompiledCaughtException = null;
        int[] var10 = null;
        RuntimeException var10_ref = null;
        int var11 = 0;
        int var12 = 0;
        int var13 = 0;
        int var14 = 0;
        int var15 = 0;
        int[] var17 = null;
        var16 = ShatteredPlansClient.field_F ? 1 : 0;
        if (!param5) {
          param0--;
          L0: while (true) {
            if ((param0 ^ -1) > -1) {
              return;
            } else {
              try {
                L1: {
                  var17 = param8;
                  var10 = var17;
                  var11 = param2;
                  var12 = param6;
                  var13 = param4;
                  var14 = param1;
                  var15 = (var17[var11] & 16711422) >> 112891169;
                  var10[var11] = var15 - -(we.a(33471547, var14) >> -1893278351) - (-we.a(65280, var13 >> -664740759) + -(we.a(33423360, var12) >> 1442091329));
                  param2++;
                  param1 = param1 + param7;
                  param6 = param6 + param9;
                  param4 = param4 + param3;
                  break L1;
                }
              } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
                decompiledCaughtException = decompiledCaughtParameter0;
                L2: {
                  var10_ref = decompiledCaughtException;
                  stackIn_10_0 = (RuntimeException) (var10_ref);

                  stackIn_10_1 = new StringBuilder().append("jg.E(").append(param0).append(',').append(param1).append(',').append(param2).append(',').append(param3).append(',').append(param4).append(',').append(param5).append(',').append(param6).append(',').append(param7).append(',');

                  if (param8 == null) {
                    stackIn_11_0 = (RuntimeException) ((Object) stackIn_10_0);
                    stackIn_11_1 = (StringBuilder) ((Object) stackIn_10_1);
                    stackIn_11_2 = "null";
                    break L2;
                  } else {
                    stackIn_11_0 = (RuntimeException) ((Object) stackIn_10_0);
                    stackIn_11_1 = (StringBuilder) ((Object) stackIn_10_1);
                    stackIn_11_2 = "{...}";
                    break L2;
                  }
                }
                throw r.a((Throwable) ((Object) stackIn_11_0), stackIn_11_2 + ',' + param9 + ')');
              }
              param0--;
              continue L0;
            }
          }
        } else {
          return;
        }
    }

    final static dc a(vr param0, String[] param1, int param2, int param3, int param4) {
        try {
            dc var5 = null;
            RuntimeException var5_ref = null;
            vi var6 = null;
            dc stackIn_3_0 = null;
            dc stackIn_8_0 = null;
            RuntimeException stackIn_11_0 = null;
            StringBuilder stackIn_11_1 = null;
            RuntimeException stackIn_12_0 = null;
            StringBuilder stackIn_12_1 = null;
            String stackIn_12_2 = null;
            StringBuilder stackIn_14_1 = null;
            StringBuilder stackIn_15_1 = null;
            String stackIn_15_2 = null;
            int decompiledRegionSelector0 = 0;
            int decompiledRegionSelector1 = 0;
            Throwable decompiledCaughtException = null;
            jn var6_ref = null;
            try {
              L0: {
                var5 = new dc(param2, param0, -1, param1);
                try {
                  L1: {
                    var6 = new vi();
                    var5.field_g = var6.a((byte) -116);
                    if (param3 == -22379) {
                      var5.field_g.a(var5.field_v, param0, param3 + 22383);
                      var5.e(0);
                      var5.b(-124);
                      stackIn_8_0 = (dc) (var5);
                      decompiledRegionSelector0 = 1;
                      break L1;
                    } else {
                      stackIn_3_0 = (dc) null;
                      decompiledRegionSelector0 = 0;
                      break L1;
                    }
                  }
                } catch (jn decompiledCaughtParameter0) {
                  decompiledCaughtException = decompiledCaughtParameter0;
                  var6_ref = (jn) (Object) decompiledCaughtException;
                  throw new RuntimeException();
                }
                if (decompiledRegionSelector0 == 0) {
                  decompiledRegionSelector1 = 0;
                  break L0;
                } else {
                  decompiledRegionSelector1 = 1;
                  break L0;
                }
              }
            } catch (java.lang.RuntimeException decompiledCaughtParameter1) {
              decompiledCaughtException = decompiledCaughtParameter1;
              L2: {
                var5_ref = (RuntimeException) (Object) decompiledCaughtException;
                stackIn_11_0 = (RuntimeException) (var5_ref);

                stackIn_11_1 = new StringBuilder().append("jg.C(");

                if (param0 == null) {
                  stackIn_12_0 = (RuntimeException) ((Object) stackIn_11_0);
                  stackIn_12_1 = (StringBuilder) ((Object) stackIn_11_1);
                  stackIn_12_2 = "null";
                  break L2;
                } else {
                  stackIn_12_0 = (RuntimeException) ((Object) stackIn_11_0);
                  stackIn_12_1 = (StringBuilder) ((Object) stackIn_11_1);
                  stackIn_12_2 = "{...}";
                  break L2;
                }
              }
              L3: {


                stackIn_14_1 = ((StringBuilder) (Object) stackIn_12_1).append(stackIn_12_2).append(',');

                if (param1 == null) {
                  stackIn_12_0 = (RuntimeException) ((Object) stackIn_12_0);
                  stackIn_15_1 = (StringBuilder) ((Object) stackIn_14_1);
                  stackIn_15_2 = "null";
                  break L3;
                } else {
                  stackIn_12_0 = (RuntimeException) ((Object) stackIn_12_0);
                  stackIn_15_1 = (StringBuilder) ((Object) stackIn_14_1);
                  stackIn_15_2 = "{...}";
                  break L3;
                }
              }
              throw r.a((Throwable) ((Object) stackIn_12_0), stackIn_15_2 + ',' + param2 + ',' + param3 + ',' + param4 + ')');
            }
            if (decompiledRegionSelector1 == 0) {
              return stackIn_3_0;
            } else {
              return stackIn_8_0;
            }
        } catch (RuntimeException | Error decompiledUncheckedException) {
            throw decompiledUncheckedException;
        } catch (Throwable decompiledCheckedException) {
            throw new RuntimeException(decompiledCheckedException);
        }
    }

    public final void run() {
        int var1_int = 0;
        ap var2 = null;
        int var4 = 0;
        Throwable decompiledCaughtException = null;
        Exception var1 = null;
        Throwable var3 = null;
        Object var5 = null;
        String var6 = null;
        var4 = ShatteredPlansClient.field_F ? 1 : 0;
        this.field_a = true;
        try {
          L0: {
            try {
              L1: {
                L2: while (true) {
                  if (this.field_b) {
                    break L1;
                  } else {
                    var1_int = 0;
                    L3: while (true) {
                      if (-3 >= (var1_int ^ -1)) {
                        jb.a((byte) -98, 10L);
                        var5 = (Object) null;
                        ud.a(-106, this.field_c, (Object) null);
                        continue L2;
                      } else {
                        L4: {
                          var2 = this.field_d[var1_int];
                          if (var2 != null) {
                            var2.e();
                            break L4;
                          } else {
                            break L4;
                          }
                        }
                        var1_int++;
                        continue L3;
                      }
                    }
                  }
                }
              }
            } catch (java.lang.Exception decompiledCaughtParameter0) {
              decompiledCaughtException = decompiledCaughtParameter0;
              var1 = (Exception) (Object) decompiledCaughtException;
              var6 = (String) null;
              jq.a(-29901, (Throwable) ((Object) var1), (String) null);
              this.field_a = false;
              return;
            }
            break L0;
          }
        } catch (java.lang.Throwable decompiledCaughtParameter1) {
          decompiledCaughtException = decompiledCaughtParameter1;
          var3 = decompiledCaughtException;
          this.field_a = false;
          throw jg.<RuntimeException>$cfr$sneakyThrow(var3);
        }
        this.field_a = false;
    }

    final static java.net.URL a(java.applet.Applet param0, boolean param1, java.net.URL param2) {
        Object var3 = null;
        Object var4 = null;
        java.net.URL stackIn_10_0 = null;
        Object stackIn_13_0 = null;
        StringBuilder stackIn_13_1 = null;
        Object stackIn_14_0 = null;
        StringBuilder stackIn_14_1 = null;
        String stackIn_14_2 = null;
        StringBuilder stackIn_16_1 = null;
        StringBuilder stackIn_17_1 = null;
        String stackIn_17_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          L0: {
            L1: {
              var3 = null;
              if (cj.field_u == null) {
                break L1;
              } else {
                if (cj.field_u.equals(param0.getParameter("settings"))) {
                  break L1;
                } else {
                  var3 = cj.field_u;
                  var4 = var3;
                  var4 = var3;
                  break L1;
                }
              }
            }
            L2: {
              var4 = null;
              if (!param1) {
                break L2;
              } else {
                field_f = (String) null;
                break L2;
              }
            }
            L3: {
              if (cr.field_d == null) {
                break L3;
              } else {
                if (!cr.field_d.equals(param0.getParameter("session"))) {
                  var4 = cr.field_d;
                  break L3;
                } else {
                  break L3;
                }
              }
            }
            stackIn_10_0 = np.a((String) (var3), -1, (String) (var4), false, param2);
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L4: {
            var3 = decompiledCaughtException;
            stackIn_13_0 = var3;

            stackIn_13_1 = new StringBuilder().append("jg.A(");

            if (param0 == null) {
              stackIn_14_0 = stackIn_13_0;
              stackIn_14_1 = (StringBuilder) ((Object) stackIn_13_1);
              stackIn_14_2 = "null";
              break L4;
            } else {
              stackIn_14_0 = stackIn_13_0;
              stackIn_14_1 = (StringBuilder) ((Object) stackIn_13_1);
              stackIn_14_2 = "{...}";
              break L4;
            }
          }
          L5: {


            stackIn_16_1 = ((StringBuilder) (Object) stackIn_14_1).append(stackIn_14_2).append(',').append(param1).append(',');

            if (param2 == null) {

              stackIn_17_1 = (StringBuilder) ((Object) stackIn_16_1);
              stackIn_17_2 = "null";
              break L5;
            } else {

              stackIn_17_1 = (StringBuilder) ((Object) stackIn_16_1);
              stackIn_17_2 = "{...}";
              break L5;
            }
          }
          throw r.a((Throwable) ((Object) stackIn_14_0), stackIn_17_2 + ')');
        }
        return stackIn_10_0;
    }

    public static void b(int param0) {
        String[] var2;
        field_g = null;
        field_f = null;
        field_e = null;
        if (param0 <= -41) {
          return;
        } else {
          var2 = (String[]) null;
          jg.a((vr) null, (String[]) null, 30, -16, 113);
          return;
        }
    }

    jg() {
        this.field_d = new ap[2];
        this.field_b = false;
        this.field_a = false;
    }

    static {
        field_f = "Click to offer a Non-Agression Pact to <%0>.";
        field_e = "(<%0> players want to join)";
        field_g = "You have declined the invitation.";
    }

    @SuppressWarnings("unchecked")
    private static <T extends Throwable> RuntimeException $cfr$sneakyThrow(Throwable throwable) throws T {
        throw (T) throwable;
    }
}
