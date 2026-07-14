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
            field_a = null;
            return;
          }
        } else {
          lc.a(field_e + 10, (byte) 24);
          if (param0 == 34) {
            return;
          } else {
            field_a = null;
            return;
          }
        }
    }

    public final Iterator iterator() {
        return (Iterator) (Object) new oa((dg) this);
    }

    public static void a(boolean param0) {
        field_a = null;
        if (!param0) {
            Object var2 = null;
            sd discarded$0 = dg.a((java.applet.Applet) null, (byte) -57);
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
              if (-6145 <= param1) {
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
              if (param1 > -2049) {
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
        var2 = ((dg) this).field_b.field_p;
        if (((dg) this).field_b != var2) {
          var2.f(64);
          if (param0) {
            return null;
          } else {
            return var2;
          }
        } else {
          return null;
        }
    }

    final static void a(byte param0, java.awt.Component param1) {
        param1.addMouseListener((java.awt.event.MouseListener) (Object) pj.field_G);
        param1.addMouseMotionListener((java.awt.event.MouseMotionListener) (Object) pj.field_G);
        param1.addFocusListener((java.awt.event.FocusListener) (Object) pj.field_G);
        if (param0 != 50) {
            field_d = -106;
        }
    }

    final void a(uh param0, byte param1) {
        int var3 = -94 % ((10 - param1) / 40);
        if (!(param0.field_n == null)) {
            param0.f(64);
        }
        param0.field_n = ((dg) this).field_b.field_n;
        param0.field_p = ((dg) this).field_b;
        param0.field_n.field_p = param0;
        param0.field_p.field_n = param0;
    }

    final static sd a(java.applet.Applet param0, byte param1) {
        String var2 = null;
        sd[] var3 = null;
        int var4 = 0;
        sd var5 = null;
        int var6 = 0;
        var6 = DrPhlogistonSavesTheEarth.field_D ? 1 : 0;
        var2 = le.a(param0, "jagex-last-login-method", 43);
        if (param1 < -25) {
          if (var2 == null) {
            return mf.field_A;
          } else {
            var3 = eg.b((byte) -128);
            var4 = 0;
            L0: while (true) {
              if (var3.length > var4) {
                var5 = var3[var4];
                if (var5.a(var2, 125)) {
                  return var5;
                } else {
                  var4++;
                  continue L0;
                }
              } else {
                return mf.field_A;
              }
            }
          }
        } else {
          int discarded$37 = dg.a(-9, -29);
          if (var2 == null) {
            return mf.field_A;
          } else {
            var3 = eg.b((byte) -128);
            var4 = 0;
            L1: while (true) {
              if (var3.length > var4) {
                var5 = var3[var4];
                if (var5.a(var2, 125)) {
                  return var5;
                } else {
                  var4++;
                  continue L1;
                }
              } else {
                return mf.field_A;
              }
            }
          }
        }
    }

    private dg() throws Throwable {
        throw new Error();
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_e = 80;
        field_a = "Connection timed out. Please try using a different server.";
    }
}
