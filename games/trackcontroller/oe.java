/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class oe {
    static String field_d;
    static int field_e;
    static int field_c;
    static le field_b;
    private int[] field_a;

    public static void a(int param0) {
        if (param0 != -1) {
            return;
        }
        field_b = null;
        field_d = null;
    }

    final static String a(CharSequence param0, byte param1, boolean param2) {
        String var3 = null;
        int var4 = 0;
        int var5 = 0;
        CharSequence var6 = null;
        String stackIn_5_0 = null;
        String stackIn_12_0 = null;
        RuntimeException stackIn_17_0 = null;
        StringBuilder stackIn_17_1 = null;
        RuntimeException stackIn_18_0 = null;
        StringBuilder stackIn_18_1 = null;
        String stackIn_18_2 = null;
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var3_ref = null;
        var5 = TrackController.field_F ? 1 : 0;
        try {
          L0: {
            L1: {
              if (param1 == -70) {
                break L1;
              } else {
                var6 = (CharSequence) null;
                oe.a((CharSequence) null, (byte) 1, false);
                break L1;
              }
            }
            var3 = lb.a(param0, param2, 1236);
            if (var3 == null) {
              var4 = 0;
              L2: while (true) {
                if (var4 < param0.length()) {
                  if (!ue.a(-16490, param0.charAt(var4))) {
                    stackIn_12_0 = gj.field_d;
                    decompiledRegionSelector0 = 1;
                    break L0;
                  } else {
                    var4++;
                    continue L2;
                  }
                } else {
                  return null;
                }
              }
            } else {
              stackIn_5_0 = (String) (var3);
              decompiledRegionSelector0 = 0;
              break L0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L3: {
            var3_ref = decompiledCaughtException;
            stackIn_17_0 = (RuntimeException) (var3_ref);

            stackIn_17_1 = new StringBuilder().append("oe.D(");

            if (param0 == null) {
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
          throw sl.a((Throwable) ((Object) stackIn_18_0), stackIn_18_2 + ',' + param1 + ',' + param2 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return stackIn_5_0;
        } else {
          return stackIn_12_0;
        }
    }

    oe(int[] param0) {
        int var2_int = 0;
        int var3 = 0;
        int var4 = 0;
        RuntimeException stackIn_16_0 = null;
        StringBuilder stackIn_16_1 = null;
        RuntimeException stackIn_17_0 = null;
        StringBuilder stackIn_17_1 = null;
        String stackIn_17_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var2 = null;
        try {
          L0: {
            var2_int = 1;
            L1: while (true) {
              if (var2_int > param0.length - -(param0.length >> -1176631327)) {
                this.field_a = new int[var2_int + var2_int];
                var3 = 0;
                L2: while (true) {
                  if (var2_int + var2_int <= var3) {
                    var3 = 0;
                    L3: while (true) {
                      if (var3 >= param0.length) {
                        break L0;
                      } else {
                        var4 = var2_int - 1 & param0[var3];
                        L4: while (true) {
                          if (this.field_a[1 + var4 + var4] == -1) {
                            this.field_a[var4 + var4] = param0[var3];
                            this.field_a[1 + var4 + var4] = var3;
                            var3++;
                            continue L3;
                          } else {
                            var4 = var2_int - 1 & var4 - -1;
                            continue L4;
                          }
                        }
                      }
                    }
                  } else {
                    this.field_a[var3] = -1;
                    var3++;
                    continue L2;
                  }
                }
              } else {
                var2_int = var2_int << 1;
                continue L1;
              }
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L5: {
            var2 = decompiledCaughtException;
            stackIn_16_0 = (RuntimeException) (var2);

            stackIn_16_1 = new StringBuilder().append("oe.<init>(");

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
          throw sl.a((Throwable) ((Object) stackIn_17_0), stackIn_17_2 + ')');
        }
    }

    final static void a(boolean param0, kk param1, kk param2, kk param3, int param4) {
        try {
            sa.field_Q = c.a("", param4 + 59176);
            sa.field_Q.a(false, true);
            ak.a(param3, param1, param2, 127);
            jh.a(-128);
            fd.field_h = hf.field_f;
            if (param4 != -28484) {
                CharSequence var6 = (CharSequence) null;
                oe.a((CharSequence) null, (byte) 110, true);
            }
            rk.field_X = hf.field_f;
        } catch (RuntimeException runtimeException) {
            throw sl.a((Throwable) ((Object) runtimeException), "oe.A(" + param0 + ',' + (param1 != null ? "{...}" : "null") + ',' + (param2 != null ? "{...}" : "null") + ',' + (param3 != null ? "{...}" : "null") + ',' + param4 + ')');
        }
    }

    final int a(int param0, int param1) {
        int var3;
        int var4;
        int var5;
        int var6;
        var6 = TrackController.field_F ? 1 : 0;
        var3 = (this.field_a.length >> -1540622911) + -1;
        if (param1 == -26556) {
          var4 = param0 & var3;
          L0: while (true) {
            var5 = this.field_a[1 + var4 + var4];
            if (var5 != -1) {
              if (param0 == this.field_a[var4 + var4]) {
                return var5;
              } else {
                var4 = var3 & var4 + 1;
                continue L0;
              }
            } else {
              return -1;
            }
          }
        } else {
          return -121;
        }
    }

    static {
        field_d = "Achievements";
        field_b = new le();
    }
}
