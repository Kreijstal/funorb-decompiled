/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class ue {
    int field_b;
    ue field_d;
    int field_a;
    int field_c;

    final int a(boolean param0) {
        int var4 = Terraphoenix.field_V;
        Object var2 = this;
        int var3 = ((ue) (var2)).field_c;
        while (null != ((ue) (var2)).field_d) {
            var2 = ((ue) (var2)).field_d;
            var3 = var3 + ((ue) (var2)).field_c;
        }
        if (!param0) {
            this.field_d = (ue) null;
        }
        return var3;
    }

    final void a(int param0, int param1, int param2, byte param3) {
        int var5;
        ue var6;
        int var7;
        int var8;
        L0: {
          var8 = Terraphoenix.field_V;
          var5 = 5 % ((param3 - -11) / 33);
          if (this.field_d != null) {
            var6 = this.field_d;
            var7 = 0;
            L1: while (true) {
              if (var6.field_d == null) {
                var6.field_d = new ue(param2, param1, param0);
                break L0;
              } else {
                var6 = var6.field_d;
                var7++;
                if (-1025 <= (var7 ^ -1)) {
                  continue L1;
                } else {
                  System.out.println(var7);
                  continue L1;
                }
              }
            }
          } else {
            this.field_d = new ue(param2, param1, param0);
            break L0;
          }
        }
    }

    final void a(int param0, ue param1) {
        ue var3 = null;
        int var4 = 0;
        RuntimeException stackIn_12_0 = null;
        StringBuilder stackIn_12_1 = null;
        RuntimeException stackIn_13_0 = null;
        StringBuilder stackIn_13_1 = null;
        String stackIn_13_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var3_ref = null;
        var4 = Terraphoenix.field_V;
        try {
          L0: {
            L1: {
              if (this.field_d != null) {
                var3 = this.field_d;
                L2: while (true) {
                  if (null == var3.field_d) {
                    var3.field_d = param1;
                    break L1;
                  } else {
                    var3 = var3.field_d;
                    continue L2;
                  }
                }
              } else {
                this.field_d = param1;
                break L1;
              }
            }
            L3: {
              if (param0 == -19020) {
                break L3;
              } else {
                this.field_a = -12;
                break L3;
              }
            }
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L4: {
            var3_ref = decompiledCaughtException;
            stackIn_12_0 = (RuntimeException) (var3_ref);

            stackIn_12_1 = new StringBuilder().append("ue.B(").append(param0).append(',');

            if (param1 == null) {
              stackIn_13_0 = (RuntimeException) ((Object) stackIn_12_0);
              stackIn_13_1 = (StringBuilder) ((Object) stackIn_12_1);
              stackIn_13_2 = "null";
              break L4;
            } else {
              stackIn_13_0 = (RuntimeException) ((Object) stackIn_12_0);
              stackIn_13_1 = (StringBuilder) ((Object) stackIn_12_1);
              stackIn_13_2 = "{...}";
              break L4;
            }
          }
          throw qk.a((Throwable) ((Object) stackIn_13_0), stackIn_13_2 + ')');
        }
    }

    final static boolean a(String param0, int param1) {
        String var2 = null;
        Exception var2_ref = null;
        RuntimeException var2_ref2 = null;
        int var3 = 0;
        int var4 = 0;
        int stackIn_4_0 = 0;
        int stackIn_9_0 = 0;
        int stackIn_14_0 = 0;
        int stackIn_17_0 = 0;
        int stackIn_19_0 = 0;
        RuntimeException stackIn_22_0 = null;
        StringBuilder stackIn_22_1 = null;
        RuntimeException stackIn_23_0 = null;
        StringBuilder stackIn_23_1 = null;
        String stackIn_23_2 = null;
        int decompiledRegionSelector0 = 0;
        int decompiledRegionSelector1 = 0;
        Throwable decompiledCaughtException = null;
        var4 = Terraphoenix.field_V;
        try {
          L0: {
            try {
              L1: {
                if (!he.field_o.startsWith("win")) {
                  stackIn_4_0 = 0;
                  decompiledRegionSelector0 = 0;
                  break L1;
                } else {
                  L2: {
                    if (param0.startsWith("http://")) {
                      break L2;
                    } else {
                      if (!param0.startsWith("https://")) {
                        stackIn_9_0 = 0;
                        decompiledRegionSelector0 = 1;
                        break L1;
                      } else {
                        break L2;
                      }
                    }
                  }
                  var2 = "abcdefghijklmnopqrstuvwxyzABCDEFGHIJKLMNOPQRSTUVWXYZ0123456789?&=,.%+-_#:/*";
                  var3 = param1;
                  L3: while (true) {
                    if (var3 >= param0.length()) {
                      Runtime.getRuntime().exec("cmd /c start \"j\" \"" + param0 + "\"");
                      stackIn_17_0 = 1;
                      decompiledRegionSelector0 = 3;
                      break L1;
                    } else {
                      if (-1 != var2.indexOf((int) param0.charAt(var3))) {
                        var3++;
                        continue L3;
                      } else {
                        stackIn_14_0 = 0;
                        decompiledRegionSelector0 = 2;
                        break L1;
                      }
                    }
                  }
                }
              }
            } catch (java.lang.Exception decompiledCaughtParameter0) {
              decompiledCaughtException = decompiledCaughtParameter0;
              var2_ref = (Exception) (Object) decompiledCaughtException;
              stackIn_19_0 = 0;
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
          L4: {
            var2_ref2 = (RuntimeException) (Object) decompiledCaughtException;
            stackIn_22_0 = (RuntimeException) (var2_ref2);

            stackIn_22_1 = new StringBuilder().append("ue.A(");

            if (param0 == null) {
              stackIn_23_0 = (RuntimeException) ((Object) stackIn_22_0);
              stackIn_23_1 = (StringBuilder) ((Object) stackIn_22_1);
              stackIn_23_2 = "null";
              break L4;
            } else {
              stackIn_23_0 = (RuntimeException) ((Object) stackIn_22_0);
              stackIn_23_1 = (StringBuilder) ((Object) stackIn_22_1);
              stackIn_23_2 = "{...}";
              break L4;
            }
          }
          throw qk.a((Throwable) ((Object) stackIn_23_0), stackIn_23_2 + ',' + param1 + ')');
        }
        if (decompiledRegionSelector1 == 0) {
          return stackIn_4_0 != 0;
        } else {
          if (decompiledRegionSelector1 == 1) {
            return stackIn_9_0 != 0;
          } else {
            if (decompiledRegionSelector1 == 2) {
              return stackIn_14_0 != 0;
            } else {
              return stackIn_17_0 != 0;
            }
          }
        }
    }

    ue(int param0, int param1, int param2) {
        this.field_c = param2;
        this.field_d = null;
        this.field_b = param0;
        this.field_a = param1;
    }

    static {
    }
}
