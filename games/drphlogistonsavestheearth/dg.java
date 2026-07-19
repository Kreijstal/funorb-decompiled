/*
 * Decompiled by CFR-JS 0.4.0.
 */
import java.util.*;

final class dg implements Iterable {
    static int field_c;
    static int field_e;
    uh field_b;
    static String field_a;
    static int field_d;

    final static void a(byte param0) {
        if (70 <= field_e) {
          lc.a(80, (byte) 24);
          if (param0 == 34) {
            return;
          } else {
            field_a = (String) null;
            return;
          }
        } else {
          lc.a(field_e + 10, (byte) 24);
          if (param0 == 34) {
            return;
          } else {
            field_a = (String) null;
            return;
          }
        }
    }

    public final Iterator iterator() {
        return (Iterator) ((Object) new oa((dg) (this)));
    }

    public static void a(boolean param0) {
        sd discarded$0 = null;
        field_a = null;
        if (!param0) {
            java.applet.Applet var2 = (java.applet.Applet) null;
            discarded$0 = dg.a((java.applet.Applet) null, (byte) -57);
        }
    }

    final static int a(int param0, int param1) {
        int stackIn_6_0 = 0;
        int stackIn_10_0 = 0;
        int stackOut_9_0 = 0;
        int stackOut_8_0 = 0;
        int stackOut_5_0 = 0;
        int stackOut_4_0 = 0;
        if (param0 == -20870) {
          param1 = param1 & 8191;
          if (4096 <= param1) {
            L0: {
              if (-6145 >= (param1 ^ -1)) {
                stackOut_9_0 = -tc.field_a[-param1 + 8192];
                stackIn_10_0 = stackOut_9_0;
                break L0;
              } else {
                stackOut_8_0 = -tc.field_a[param1 + -4096];
                stackIn_10_0 = stackOut_8_0;
                break L0;
              }
            }
            return stackIn_10_0;
          } else {
            L1: {
              if ((param1 ^ -1) > -2049) {
                stackOut_5_0 = tc.field_a[param1];
                stackIn_6_0 = stackOut_5_0;
                break L1;
              } else {
                stackOut_4_0 = tc.field_a[-param1 + 4096];
                stackIn_6_0 = stackOut_4_0;
                break L1;
              }
            }
            return stackIn_6_0;
          }
        } else {
          return -28;
        }
    }

    final uh b(boolean param0) {
        uh var2 = null;
        var2 = this.field_b.field_p;
        if (this.field_b != var2) {
          var2.f(64);
          if (param0) {
            return (uh) null;
          } else {
            return var2;
          }
        } else {
          return null;
        }
    }

    final static void a(byte param0, java.awt.Component param1) {
        RuntimeException runtimeException = null;
        RuntimeException stackIn_4_0 = null;
        StringBuilder stackIn_4_1 = null;
        RuntimeException stackIn_5_0 = null;
        StringBuilder stackIn_5_1 = null;
        RuntimeException stackIn_6_0 = null;
        StringBuilder stackIn_6_1 = null;
        String stackIn_6_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException stackOut_3_0 = null;
        StringBuilder stackOut_3_1 = null;
        RuntimeException stackOut_5_0 = null;
        StringBuilder stackOut_5_1 = null;
        String stackOut_5_2 = null;
        RuntimeException stackOut_4_0 = null;
        StringBuilder stackOut_4_1 = null;
        String stackOut_4_2 = null;
        try {
          L0: {
            L1: {
              param1.addMouseListener(pj.field_G);
              param1.addMouseMotionListener(pj.field_G);
              param1.addFocusListener(pj.field_G);
              if (param0 == 50) {
                break L1;
              } else {
                field_d = -106;
                break L1;
              }
            }
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L2: {
            runtimeException = decompiledCaughtException;
            stackOut_3_0 = (RuntimeException) (runtimeException);
            stackOut_3_1 = new StringBuilder().append("dg.C(").append(param0).append(',');
            stackIn_5_0 = stackOut_3_0;
            stackIn_5_1 = stackOut_3_1;
            stackIn_4_0 = stackOut_3_0;
            stackIn_4_1 = stackOut_3_1;
            if (param1 == null) {
              stackOut_5_0 = (RuntimeException) ((Object) stackIn_5_0);
              stackOut_5_1 = (StringBuilder) ((Object) stackIn_5_1);
              stackOut_5_2 = "null";
              stackIn_6_0 = stackOut_5_0;
              stackIn_6_1 = stackOut_5_1;
              stackIn_6_2 = stackOut_5_2;
              break L2;
            } else {
              stackOut_4_0 = (RuntimeException) ((Object) stackIn_4_0);
              stackOut_4_1 = (StringBuilder) ((Object) stackIn_4_1);
              stackOut_4_2 = "{...}";
              stackIn_6_0 = stackOut_4_0;
              stackIn_6_1 = stackOut_4_1;
              stackIn_6_2 = stackOut_4_2;
              break L2;
            }
          }
          throw ie.a((Throwable) ((Object) stackIn_6_0), stackIn_6_2 + ')');
        }
    }

    final void a(uh param0, byte param1) {
        try {
            int var3_int = -94 % ((10 - param1) / 40);
            if (!(param0.field_n == null)) {
                param0.f(64);
            }
            param0.field_n = this.field_b.field_n;
            param0.field_p = this.field_b;
            param0.field_n.field_p = param0;
            param0.field_p.field_n = param0;
        } catch (RuntimeException runtimeException) {
            throw ie.a((Throwable) ((Object) runtimeException), "dg.E(" + (param0 != null ? "{...}" : "null") + ',' + param1 + ')');
        }
    }

    final static sd a(java.applet.Applet param0, byte param1) {
        int discarded$2 = 0;
        String var2 = null;
        RuntimeException var2_ref = null;
        sd[] var3 = null;
        int var4 = 0;
        sd var5 = null;
        int var6 = 0;
        sd stackIn_6_0 = null;
        sd stackIn_12_0 = null;
        sd stackIn_15_0 = null;
        RuntimeException stackIn_17_0 = null;
        StringBuilder stackIn_17_1 = null;
        RuntimeException stackIn_18_0 = null;
        StringBuilder stackIn_18_1 = null;
        RuntimeException stackIn_19_0 = null;
        StringBuilder stackIn_19_1 = null;
        String stackIn_19_2 = null;
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        sd stackOut_5_0 = null;
        sd stackOut_14_0 = null;
        sd stackOut_11_0 = null;
        RuntimeException stackOut_16_0 = null;
        StringBuilder stackOut_16_1 = null;
        RuntimeException stackOut_18_0 = null;
        StringBuilder stackOut_18_1 = null;
        String stackOut_18_2 = null;
        RuntimeException stackOut_17_0 = null;
        StringBuilder stackOut_17_1 = null;
        String stackOut_17_2 = null;
        var6 = DrPhlogistonSavesTheEarth.field_D ? 1 : 0;
        try {
          L0: {
            L1: {
              var2 = le.a(param0, "jagex-last-login-method", 43);
              if (param1 < -25) {
                break L1;
              } else {
                discarded$2 = dg.a(-9, -29);
                break L1;
              }
            }
            if (var2 == null) {
              stackOut_5_0 = mf.field_A;
              stackIn_6_0 = stackOut_5_0;
              decompiledRegionSelector0 = 0;
              break L0;
            } else {
              var3 = eg.b((byte) -128);
              var4 = 0;
              L2: while (true) {
                if (var3.length <= var4) {
                  stackOut_14_0 = mf.field_A;
                  stackIn_15_0 = stackOut_14_0;
                  decompiledRegionSelector0 = 2;
                  break L0;
                } else {
                  var5 = var3[var4];
                  if (var5.a(var2, 125)) {
                    stackOut_11_0 = (sd) (var5);
                    stackIn_12_0 = stackOut_11_0;
                    decompiledRegionSelector0 = 1;
                    break L0;
                  } else {
                    var4++;
                    continue L2;
                  }
                }
              }
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L3: {
            var2_ref = decompiledCaughtException;
            stackOut_16_0 = (RuntimeException) (var2_ref);
            stackOut_16_1 = new StringBuilder().append("dg.D(");
            stackIn_18_0 = stackOut_16_0;
            stackIn_18_1 = stackOut_16_1;
            stackIn_17_0 = stackOut_16_0;
            stackIn_17_1 = stackOut_16_1;
            if (param0 == null) {
              stackOut_18_0 = (RuntimeException) ((Object) stackIn_18_0);
              stackOut_18_1 = (StringBuilder) ((Object) stackIn_18_1);
              stackOut_18_2 = "null";
              stackIn_19_0 = stackOut_18_0;
              stackIn_19_1 = stackOut_18_1;
              stackIn_19_2 = stackOut_18_2;
              break L3;
            } else {
              stackOut_17_0 = (RuntimeException) ((Object) stackIn_17_0);
              stackOut_17_1 = (StringBuilder) ((Object) stackIn_17_1);
              stackOut_17_2 = "{...}";
              stackIn_19_0 = stackOut_17_0;
              stackIn_19_1 = stackOut_17_1;
              stackIn_19_2 = stackOut_17_2;
              break L3;
            }
          }
          throw ie.a((Throwable) ((Object) stackIn_19_0), stackIn_19_2 + ',' + param1 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return stackIn_6_0;
        } else {
          if (decompiledRegionSelector0 == 1) {
            return stackIn_12_0;
          } else {
            return stackIn_15_0;
          }
        }
    }

    private dg() throws Throwable {
        throw new Error();
    }

    static {
        field_e = 80;
        field_a = "Connection timed out. Please try using a different server.";
    }
}
