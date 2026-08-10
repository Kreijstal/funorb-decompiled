/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class ga {
    static volatile int field_b;
    static rj field_a;

    final static boolean a(String param0, int param1) {
        int var2_int = 0;
        RuntimeException var2 = null;
        int var3 = 0;
        int var4 = 0;
        int stackIn_9_0 = 0;
        int stackIn_12_0 = 0;
        RuntimeException stackIn_15_0 = null;
        StringBuilder stackIn_15_1 = null;
        RuntimeException stackIn_16_0 = null;
        StringBuilder stackIn_16_1 = null;
        String stackIn_16_2 = null;
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        var4 = Transmogrify.field_A ? 1 : 0;
        try {
          L0: {
            L1: {
              if (param1 == 3336) {
                break L1;
              } else {
                field_a = (rj) null;
                break L1;
              }
            }
            var2_int = 0;
            L2: while (true) {
              if (param0.length() <= var2_int) {
                stackIn_12_0 = 0;
                decompiledRegionSelector0 = 1;
                break L0;
              } else {
                L3: {
                  var3 = param0.charAt(var2_int);
                  if (k.a((char) var3, -37)) {
                    break L3;
                  } else {
                    if (!dj.a((char) var3, true)) {
                      stackIn_9_0 = 1;
                      decompiledRegionSelector0 = 0;
                      break L0;
                    } else {
                      break L3;
                    }
                  }
                }
                var2_int++;
                continue L2;
              }
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L4: {
            var2 = decompiledCaughtException;
            stackIn_15_0 = (RuntimeException) (var2);

            stackIn_15_1 = new StringBuilder().append("ga.E(");

            if (param0 == null) {
              stackIn_16_0 = (RuntimeException) ((Object) stackIn_15_0);
              stackIn_16_1 = (StringBuilder) ((Object) stackIn_15_1);
              stackIn_16_2 = "null";
              break L4;
            } else {
              stackIn_16_0 = (RuntimeException) ((Object) stackIn_15_0);
              stackIn_16_1 = (StringBuilder) ((Object) stackIn_15_1);
              stackIn_16_2 = "{...}";
              break L4;
            }
          }
          throw ch.a((Throwable) ((Object) stackIn_16_0), stackIn_16_2 + ',' + param1 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return stackIn_9_0 != 0;
        } else {
          return stackIn_12_0 != 0;
        }
    }

    final static kh a(int param0, java.applet.Applet param1) {
        String var2 = null;
        RuntimeException var2_ref = null;
        kh[] var3 = null;
        int var4 = 0;
        kh var5 = null;
        int var6 = 0;
        kh stackIn_3_0 = null;
        kh stackIn_7_0 = null;
        kh stackIn_13_0 = null;
        kh stackIn_16_0 = null;
        RuntimeException stackIn_19_0 = null;
        StringBuilder stackIn_19_1 = null;
        RuntimeException stackIn_20_0 = null;
        StringBuilder stackIn_20_1 = null;
        String stackIn_20_2 = null;
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        var6 = Transmogrify.field_A ? 1 : 0;
        try {
          L0: {
            if (param0 > 58) {
              var2 = lj.a(true, "jagex-last-login-method", param1);
              if (var2 == null) {
                stackIn_7_0 = qe.field_x;
                decompiledRegionSelector0 = 1;
                break L0;
              } else {
                var3 = hd.b((byte) 87);
                var4 = 0;
                L1: while (true) {
                  if (var3.length <= var4) {
                    stackIn_16_0 = qe.field_x;
                    decompiledRegionSelector0 = 3;
                    break L0;
                  } else {
                    var5 = var3[var4];
                    if (var5.a(var2, 0)) {
                      stackIn_13_0 = (kh) (var5);
                      decompiledRegionSelector0 = 2;
                      break L0;
                    } else {
                      var4++;
                      continue L1;
                    }
                  }
                }
              }
            } else {
              stackIn_3_0 = (kh) null;
              decompiledRegionSelector0 = 0;
              break L0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L2: {
            var2_ref = decompiledCaughtException;
            stackIn_19_0 = (RuntimeException) (var2_ref);

            stackIn_19_1 = new StringBuilder().append("ga.B(").append(param0).append(',');

            if (param1 == null) {
              stackIn_20_0 = (RuntimeException) ((Object) stackIn_19_0);
              stackIn_20_1 = (StringBuilder) ((Object) stackIn_19_1);
              stackIn_20_2 = "null";
              break L2;
            } else {
              stackIn_20_0 = (RuntimeException) ((Object) stackIn_19_0);
              stackIn_20_1 = (StringBuilder) ((Object) stackIn_19_1);
              stackIn_20_2 = "{...}";
              break L2;
            }
          }
          throw ch.a((Throwable) ((Object) stackIn_20_0), stackIn_20_2 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return stackIn_3_0;
        } else {
          if (decompiledRegionSelector0 == 1) {
            return stackIn_7_0;
          } else {
            if (decompiledRegionSelector0 == 2) {
              return stackIn_13_0;
            } else {
              return stackIn_16_0;
            }
          }
        }
    }

    public static void a(boolean param0) {
        if (!param0) {
            field_b = -87;
            field_a = null;
            return;
        }
        field_a = null;
    }

    final static void a(byte param0) {
        java.applet.Applet var2;
        if (si.field_l != 0 + -tf.field_a) {
          if (si.field_l != 250 - tf.field_a) {
            if (param0 != 94) {
              var2 = (java.applet.Applet) null;
              ga.a(49, (java.applet.Applet) null);
              si.field_l = si.field_l + 1;
              return;
            } else {
              si.field_l = si.field_l + 1;
              return;
            }
          } else {
            if (param0 != 94) {
              var2 = (java.applet.Applet) null;
              ga.a(49, (java.applet.Applet) null);
              si.field_l = si.field_l + 1;
              return;
            } else {
              si.field_l = si.field_l + 1;
              return;
            }
          }
        } else {
          if (param0 != 94) {
            var2 = (java.applet.Applet) null;
            ga.a(49, (java.applet.Applet) null);
            si.field_l = si.field_l + 1;
            return;
          } else {
            si.field_l = si.field_l + 1;
            return;
          }
        }
    }

    final static int a(int param0, byte param1) {
        if (param1 >= -35) {
            field_a = (rj) null;
            if (!(param0 != 16711935)) {
                return 0;
            }
            return ((param0 & 240) >> 626342052) + ((61440 & param0) >> -1249371256);
        }
        if (!(param0 != 16711935)) {
            return 0;
        }
        return ((param0 & 240) >> 626342052) + ((61440 & param0) >> -1249371256);
    }

    static {
        field_b = 0;
    }
}
