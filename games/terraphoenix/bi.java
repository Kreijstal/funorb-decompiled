/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class bi {
    static fa field_b;
    static String field_c;
    static String field_a;
    static fa field_d;

    final static oa a(int param0, String param1) {
        int var2_int = 0;
        RuntimeException var2 = null;
        String var3 = null;
        String var4 = null;
        oa var5 = null;
        java.awt.Component var6 = null;
        oa stackIn_4_0 = null;
        oa stackIn_8_0 = null;
        oa stackIn_14_0 = null;
        RuntimeException stackIn_17_0 = null;
        StringBuilder stackIn_17_1 = null;
        RuntimeException stackIn_18_0 = null;
        StringBuilder stackIn_18_1 = null;
        String stackIn_18_2 = null;
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        try {
          L0: {
            L1: {
              if (param1 == null) {
                break L1;
              } else {
                if (-1 == (param1.length() ^ -1)) {
                  break L1;
                } else {
                  var2_int = param1.indexOf('@');
                  if (-1 == var2_int) {
                    stackIn_8_0 = b.field_f;
                    decompiledRegionSelector0 = 1;
                    break L0;
                  } else {
                    L2: {
                      if (param0 == -29456) {
                        break L2;
                      } else {
                        var6 = (java.awt.Component) null;
                        bi.a(-98, -86, 70, (java.awt.Component) null);
                        break L2;
                      }
                    }
                    var3 = param1.substring(0, var2_int);
                    var4 = param1.substring(1 + var2_int);
                    var5 = jh.a((byte) 42, var3);
                    if (var5 != null) {
                      stackIn_14_0 = (oa) (var5);
                      decompiledRegionSelector0 = 2;
                      break L0;
                    } else {
                      return ma.a(var4, 46);
                    }
                  }
                }
              }
            }
            stackIn_4_0 = rf.field_w;
            decompiledRegionSelector0 = 0;
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L3: {
            var2 = decompiledCaughtException;
            stackIn_17_0 = (RuntimeException) (var2);

            stackIn_17_1 = new StringBuilder().append("bi.B(").append(param0).append(',');

            if (param1 == null) {
              stackIn_18_0 = (RuntimeException) ((Object) stackIn_17_0);
              stackIn_18_1 = (StringBuilder) ((Object) stackIn_17_1);
              stackIn_18_2 = "null";
              break L3;
            } else {
              stackIn_18_0 = (RuntimeException) ((Object) stackIn_17_0);
              stackIn_18_1 = (StringBuilder) ((Object) stackIn_17_1);
              stackIn_18_2 = "{...}";
              break L3;
            }
          }
          throw qk.a((Throwable) ((Object) stackIn_18_0), stackIn_18_2 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return stackIn_4_0;
        } else {
          if (decompiledRegionSelector0 == 1) {
            return stackIn_8_0;
          } else {
            return stackIn_14_0;
          }
        }
    }

    final static void a(int param0, String param1, String[] param2, int param3) {
        RuntimeException var4 = null;
        int var5 = 0;
        java.awt.Component var6 = null;
        int stackIn_6_0 = 0;
        int stackIn_7_0 = 0;
        int stackIn_7_1 = 0;
        RuntimeException stackIn_16_0 = null;
        StringBuilder stackIn_16_1 = null;
        RuntimeException stackIn_17_0 = null;
        StringBuilder stackIn_17_1 = null;
        String stackIn_17_2 = null;
        StringBuilder stackIn_19_1 = null;
        StringBuilder stackIn_20_1 = null;
        String stackIn_20_2 = null;
        RuntimeException decompiledCaughtException = null;
        var5 = Terraphoenix.field_V;
        try {
          L0: {
            if (param3 == -14) {
              break L0;
            } else {
              var6 = (java.awt.Component) null;
              bi.a(-13, 13, 17, (java.awt.Component) null);
              break L0;
            }
          }
          qe.field_f = k.field_b;
          if ((param0 ^ -1) != -256) {
            if (-101 < (param0 ^ -1)) {
              wl.field_Q = aj.a(param0, (byte) 113, param1);
              return;
            } else {
              if (-106 > (param0 ^ -1)) {
                wl.field_Q = aj.a(param0, (byte) 113, param1);
                return;
              } else {
                wl.field_Q = ib.a(true, param2);
                return;
              }
            }
          } else {
            L1: {
              stackIn_6_0 = param3 ^ -10;

              if ((wf.field_q ^ -1) <= -14) {
                stackIn_7_0 = stackIn_6_0;
                stackIn_7_1 = 0;
                break L1;
              } else {
                stackIn_7_0 = stackIn_6_0;
                stackIn_7_1 = 1;
                break L1;
              }
            }
            wl.field_Q = ia.a(stackIn_7_0, stackIn_7_1 != 0);
            return;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L2: {
            var4 = decompiledCaughtException;
            stackIn_16_0 = (RuntimeException) (var4);

            stackIn_16_1 = new StringBuilder().append("bi.C(").append(param0).append(',');

            if (param1 == null) {
              stackIn_17_0 = (RuntimeException) ((Object) stackIn_16_0);
              stackIn_17_1 = (StringBuilder) ((Object) stackIn_16_1);
              stackIn_17_2 = "null";
              break L2;
            } else {
              stackIn_17_0 = (RuntimeException) ((Object) stackIn_16_0);
              stackIn_17_1 = (StringBuilder) ((Object) stackIn_16_1);
              stackIn_17_2 = "{...}";
              break L2;
            }
          }
          L3: {


            stackIn_19_1 = ((StringBuilder) (Object) stackIn_17_1).append(stackIn_17_2).append(',');

            if (param2 == null) {
              stackIn_17_0 = (RuntimeException) ((Object) stackIn_17_0);
              stackIn_20_1 = (StringBuilder) ((Object) stackIn_19_1);
              stackIn_20_2 = "null";
              break L3;
            } else {
              stackIn_17_0 = (RuntimeException) ((Object) stackIn_17_0);
              stackIn_20_1 = (StringBuilder) ((Object) stackIn_19_1);
              stackIn_20_2 = "{...}";
              break L3;
            }
          }
          throw qk.a((Throwable) ((Object) stackIn_17_0), stackIn_20_2 + ',' + param3 + ')');
        }
    }

    public static void a(int param0) {
        field_b = null;
        if (param0 > -1) {
          field_d = (fa) null;
          field_d = null;
          field_c = null;
          field_a = null;
          return;
        } else {
          field_d = null;
          field_c = null;
          field_a = null;
          return;
        }
    }

    final static te a(int param0, int param1, int param2, java.awt.Component param3) {
        try {
            Class var4 = null;
            Throwable var4_ref = null;
            RuntimeException var4_ref2 = null;
            te var5 = null;
            of var5_ref = null;
            te stackIn_2_0 = null;
            te stackIn_4_0 = null;
            of stackIn_6_0 = null;
            RuntimeException stackIn_9_0 = null;
            StringBuilder stackIn_9_1 = null;
            RuntimeException stackIn_10_0 = null;
            StringBuilder stackIn_10_1 = null;
            String stackIn_10_2 = null;
            int decompiledRegionSelector0 = 0;
            int decompiledRegionSelector1 = 0;
            Throwable decompiledCaughtException = null;
            try {
              L0: {
                try {
                  L1: {
                    var4 = Class.forName("ri");
                    if (param1 < -70) {
                      var5 = (te) (var4.newInstance());
                      var5.a(param0, param2, (byte) -36, param3);
                      stackIn_4_0 = (te) (var5);
                      decompiledRegionSelector0 = 1;
                      break L1;
                    } else {
                      stackIn_2_0 = (te) null;
                      decompiledRegionSelector0 = 0;
                      break L1;
                    }
                  }
                } catch (java.lang.Throwable decompiledCaughtParameter0) {
                  decompiledCaughtException = decompiledCaughtParameter0;
                  var4_ref = decompiledCaughtException;
                  var5_ref = new of();
                  ((te) ((Object) var5_ref)).a(param0, param2, (byte) -36, param3);
                  stackIn_6_0 = (of) (var5_ref);
                  return (te) ((Object) stackIn_6_0);
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
                var4_ref2 = (RuntimeException) (Object) decompiledCaughtException;
                stackIn_9_0 = (RuntimeException) (var4_ref2);

                stackIn_9_1 = new StringBuilder().append("bi.A(").append(param0).append(',').append(param1).append(',').append(param2).append(',');

                if (param3 == null) {
                  stackIn_10_0 = (RuntimeException) ((Object) stackIn_9_0);
                  stackIn_10_1 = (StringBuilder) ((Object) stackIn_9_1);
                  stackIn_10_2 = "null";
                  break L2;
                } else {
                  stackIn_10_0 = (RuntimeException) ((Object) stackIn_9_0);
                  stackIn_10_1 = (StringBuilder) ((Object) stackIn_9_1);
                  stackIn_10_2 = "{...}";
                  break L2;
                }
              }
              throw qk.a((Throwable) ((Object) stackIn_10_0), stackIn_10_2 + ')');
            }
            if (decompiledRegionSelector1 == 0) {
              return stackIn_2_0;
            } else {
              return stackIn_4_0;
            }
        } catch (RuntimeException | Error decompiledUncheckedException) {
            throw decompiledUncheckedException;
        } catch (Throwable decompiledCheckedException) {
            throw new RuntimeException(decompiledCheckedException);
        }
    }

    static {
        field_c = "Invalid Login or Password<br><br>For accounts created after the 24th of November 2010, please use your email address to log in.<br><br>Otherwise please log in with your username.";
        field_a = "Difficulty: Hard";
    }
}
