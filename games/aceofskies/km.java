/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class km {
    private gk field_c;
    static int field_b;
    private gq field_a;
    private gk field_d;

    final static int a(int param0) {
        if (param0 != 1) {
            return 11;
        }
        return 1;
    }

    final static boolean a(String param0, int param1) {
        boolean discarded$4 = false;
        Process discarded$5 = null;
        String var2 = null;
        Exception var2_ref = null;
        RuntimeException var2_ref2 = null;
        int var3 = 0;
        int var4 = 0;
        String var5 = null;
        int stackIn_3_0 = 0;
        int stackIn_7_0 = 0;
        int stackIn_14_0 = 0;
        int stackIn_17_0 = 0;
        int stackIn_19_0 = 0;
        RuntimeException stackIn_21_0 = null;
        StringBuilder stackIn_21_1 = null;
        RuntimeException stackIn_22_0 = null;
        StringBuilder stackIn_22_1 = null;
        RuntimeException stackIn_23_0 = null;
        StringBuilder stackIn_23_1 = null;
        String stackIn_23_2 = null;
        int decompiledRegionSelector0 = 0;
        int decompiledRegionSelector1 = 0;
        Throwable decompiledCaughtException = null;
        int stackOut_6_0 = 0;
        int stackOut_16_0 = 0;
        int stackOut_13_0 = 0;
        int stackOut_2_0 = 0;
        int stackOut_18_0 = 0;
        RuntimeException stackOut_20_0 = null;
        StringBuilder stackOut_20_1 = null;
        RuntimeException stackOut_22_0 = null;
        StringBuilder stackOut_22_1 = null;
        String stackOut_22_2 = null;
        RuntimeException stackOut_21_0 = null;
        StringBuilder stackOut_21_1 = null;
        String stackOut_21_2 = null;
        var4 = AceOfSkies.field_G ? 1 : 0;
        try {
          L0: {
            try {
              L1: {
                if (rk.field_f.startsWith("win")) {
                  L2: {
                    if (param0.startsWith("http://")) {
                      break L2;
                    } else {
                      if (param0.startsWith("https://")) {
                        break L2;
                      } else {
                        stackOut_6_0 = 0;
                        stackIn_7_0 = stackOut_6_0;
                        decompiledRegionSelector0 = 1;
                        break L1;
                      }
                    }
                  }
                  L3: {
                    var2 = "abcdefghijklmnopqrstuvwxyzABCDEFGHIJKLMNOPQRSTUVWXYZ0123456789?&=,.%+-_#:/*";
                    if (param1 == 1) {
                      break L3;
                    } else {
                      var5 = (String) null;
                      discarded$4 = km.a((String) null, -68);
                      break L3;
                    }
                  }
                  var3 = 0;
                  L4: while (true) {
                    if (param0.length() <= var3) {
                      discarded$5 = Runtime.getRuntime().exec("cmd /c start \"j\" \"" + param0 + "\"");
                      stackOut_16_0 = 1;
                      stackIn_17_0 = stackOut_16_0;
                      decompiledRegionSelector0 = 3;
                      break L1;
                    } else {
                      if (-1 != var2.indexOf((int) param0.charAt(var3))) {
                        var3++;
                        continue L4;
                      } else {
                        stackOut_13_0 = 0;
                        stackIn_14_0 = stackOut_13_0;
                        decompiledRegionSelector0 = 2;
                        break L1;
                      }
                    }
                  }
                } else {
                  stackOut_2_0 = 0;
                  stackIn_3_0 = stackOut_2_0;
                  decompiledRegionSelector0 = 0;
                  break L1;
                }
              }
            } catch (java.lang.Exception decompiledCaughtParameter0) {
              decompiledCaughtException = decompiledCaughtParameter0;
              var2_ref = (Exception) (Object) decompiledCaughtException;
              stackOut_18_0 = 0;
              stackIn_19_0 = stackOut_18_0;
              return stackIn_19_0 != 0;
            }
            if (decompiledRegionSelector0 == 0) {
              decompiledRegionSelector1 = 0;
              break L0;
            } else {
              if (decompiledRegionSelector0 == 1) {
                decompiledRegionSelector1 = 1;
                break L0;
              } else {
                if (decompiledRegionSelector0 == 2) {
                  decompiledRegionSelector1 = 2;
                  break L0;
                } else {
                  decompiledRegionSelector1 = 3;
                  break L0;
                }
              }
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter1) {
          decompiledCaughtException = decompiledCaughtParameter1;
          L5: {
            var2_ref2 = (RuntimeException) (Object) decompiledCaughtException;
            stackOut_20_0 = (RuntimeException) (var2_ref2);
            stackOut_20_1 = new StringBuilder().append("km.B(");
            stackIn_22_0 = stackOut_20_0;
            stackIn_22_1 = stackOut_20_1;
            stackIn_21_0 = stackOut_20_0;
            stackIn_21_1 = stackOut_20_1;
            if (param0 == null) {
              stackOut_22_0 = (RuntimeException) ((Object) stackIn_22_0);
              stackOut_22_1 = (StringBuilder) ((Object) stackIn_22_1);
              stackOut_22_2 = "null";
              stackIn_23_0 = stackOut_22_0;
              stackIn_23_1 = stackOut_22_1;
              stackIn_23_2 = stackOut_22_2;
              break L5;
            } else {
              stackOut_21_0 = (RuntimeException) ((Object) stackIn_21_0);
              stackOut_21_1 = (StringBuilder) ((Object) stackIn_21_1);
              stackOut_21_2 = "{...}";
              stackIn_23_0 = stackOut_21_0;
              stackIn_23_1 = stackOut_21_1;
              stackIn_23_2 = stackOut_21_2;
              break L5;
            }
          }
          throw pn.a((Throwable) ((Object) stackIn_23_0), stackIn_23_2 + ',' + param1 + ')');
        }
        if (decompiledRegionSelector1 == 0) {
          return stackIn_3_0 != 0;
        } else {
          if (decompiledRegionSelector1 == 1) {
            return stackIn_7_0 != 0;
          } else {
            if (decompiledRegionSelector1 == 2) {
              return stackIn_14_0 != 0;
            } else {
              return stackIn_17_0 != 0;
            }
          }
        }
    }

    final jr a(int param0, int param1) {
        jr var3 = null;
        int var4 = 0;
        byte[] var5 = null;
        var3 = (jr) (this.field_a.a((long)param0, -94));
        var4 = -15 / ((36 - param1) / 45);
        if (var3 != null) {
          return var3;
        } else {
          L0: {
            if (-32769 >= (param0 ^ -1)) {
              var5 = this.field_c.a(1, -10470, param0 & 32767);
              break L0;
            } else {
              var5 = this.field_d.a(1, -10470, param0);
              break L0;
            }
          }
          var3 = new jr();
          if (var5 != null) {
            L1: {
              var3.a((byte) 111, new rb(var5));
              if ((param0 ^ -1) <= -32769) {
                var3.b(true);
                break L1;
              } else {
                break L1;
              }
            }
            this.field_a.a((long)param0, var3, -105);
            return var3;
          } else {
            L2: {
              if ((param0 ^ -1) <= -32769) {
                var3.b(true);
                break L2;
              } else {
                break L2;
              }
            }
            this.field_a.a((long)param0, var3, -105);
            return var3;
          }
        }
    }

    private km() throws Throwable {
        throw new Error();
    }

    static {
    }
}
