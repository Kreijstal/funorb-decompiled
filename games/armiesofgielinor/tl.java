/*
 * Decompiled by CFR-JS 0.4.0.
 */
import java.util.*;

final class tl implements Iterator {
    private tc field_d;
    static wk field_e;
    private int field_b;
    private tc field_c;
    static String field_a;
    static String field_f;
    static me field_i;
    private m field_g;
    static String field_h;

    public final void remove() {
        if (!(((tl) this).field_c != null)) {
            throw new IllegalStateException();
        }
        ((tl) this).field_c.d(42);
        ((tl) this).field_c = null;
    }

    final static void a(int param0, java.awt.Color param1, String param2, boolean param3, int param4) {
        java.awt.Graphics var5 = null;
        Exception var5_ref = null;
        RuntimeException var5_ref2 = null;
        Exception var6 = null;
        java.awt.Graphics var6_ref = null;
        int var7 = 0;
        int var8 = 0;
        RuntimeException stackIn_21_0 = null;
        StringBuilder stackIn_21_1 = null;
        RuntimeException stackIn_22_0 = null;
        StringBuilder stackIn_22_1 = null;
        RuntimeException stackIn_23_0 = null;
        StringBuilder stackIn_23_1 = null;
        String stackIn_23_2 = null;
        RuntimeException stackIn_24_0 = null;
        StringBuilder stackIn_24_1 = null;
        RuntimeException stackIn_25_0 = null;
        StringBuilder stackIn_25_1 = null;
        RuntimeException stackIn_26_0 = null;
        StringBuilder stackIn_26_1 = null;
        String stackIn_26_2 = null;
        Throwable decompiledCaughtException = null;
        RuntimeException stackOut_20_0 = null;
        StringBuilder stackOut_20_1 = null;
        RuntimeException stackOut_22_0 = null;
        StringBuilder stackOut_22_1 = null;
        String stackOut_22_2 = null;
        RuntimeException stackOut_21_0 = null;
        StringBuilder stackOut_21_1 = null;
        String stackOut_21_2 = null;
        RuntimeException stackOut_23_0 = null;
        StringBuilder stackOut_23_1 = null;
        RuntimeException stackOut_25_0 = null;
        StringBuilder stackOut_25_1 = null;
        String stackOut_25_2 = null;
        RuntimeException stackOut_24_0 = null;
        StringBuilder stackOut_24_1 = null;
        String stackOut_24_2 = null;
        try {
          try {
            L0: {
              var5 = si.field_b.getGraphics();
              if (null != lf.field_g) {
                break L0;
              } else {
                lf.field_g = new java.awt.Font("Helvetica", 1, 13);
                break L0;
              }
            }
            L1: {
              if (!param3) {
                break L1;
              } else {
                var5.setColor(java.awt.Color.black);
                var5.fillRect(0, 0, bn.field_b, dt.field_a);
                break L1;
              }
            }
            L2: {
              if (param1 != null) {
                break L2;
              } else {
                param1 = new java.awt.Color(140, 17, 17);
                break L2;
              }
            }
            try {
              L3: {
                L4: {
                  if (gp.field_e != null) {
                    var6_ref = gp.field_e.getGraphics();
                    var6_ref.setColor(param1);
                    break L4;
                  } else {
                    gp.field_e = si.field_b.createImage(304, 34);
                    var6_ref = gp.field_e.getGraphics();
                    var6_ref.setColor(param1);
                    break L4;
                  }
                }
                var6_ref.drawRect(0, 0, 303, 33);
                var6_ref.fillRect(2, 2, 3 * param4, 30);
                var6_ref.setColor(java.awt.Color.black);
                var6_ref.drawRect(1, 1, 301, 31);
                var6_ref.fillRect(param4 * 3 + 2, 2, 300 + -(param4 * 3), 30);
                var6_ref.setFont(lf.field_g);
                var6_ref.setColor(java.awt.Color.white);
                var6_ref.drawString(param2, (304 - 6 * param2.length()) / 2, 22);
                boolean discarded$1 = var5.drawImage(gp.field_e, -152 + bn.field_b / 2, dt.field_a / 2 + -18, (java.awt.image.ImageObserver) null);
                break L3;
              }
            } catch (java.lang.Exception decompiledCaughtParameter0) {
              decompiledCaughtException = decompiledCaughtParameter0;
              L5: {
                var6 = (Exception) (Object) decompiledCaughtException;
                var7 = bn.field_b / 2 - 152;
                var8 = -18 + dt.field_a / 2;
                var5.setColor(param1);
                var5.drawRect(var7, var8, 303, 33);
                var5.fillRect(2 + var7, var8 - -2, param4 * 3, 30);
                var5.setColor(java.awt.Color.black);
                var5.drawRect(var7 + 1, 1 + var8, 301, 31);
                var5.fillRect(param4 * 3 + 2 + var7, var8 + 2, -(param4 * 3) + 300, 30);
                var5.setFont(lf.field_g);
                var5.setColor(java.awt.Color.white);
                var5.drawString(param2, var7 + (304 + -(param2.length() * 6)) / 2, 22 + var8);
                break L5;
              }
            }
            if (an.field_G != null) {
              var5.setFont(lf.field_g);
              var5.setColor(java.awt.Color.white);
              var5.drawString(an.field_G, bn.field_b / 2 + -(an.field_G.length() * 6 / 2), dt.field_a / 2 + -26);
              return;
            } else {
              return;
            }
          } catch (java.lang.Exception decompiledCaughtParameter1) {
            decompiledCaughtException = decompiledCaughtParameter1;
            var5_ref = (Exception) (Object) decompiledCaughtException;
            si.field_b.repaint();
            return;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter2) {
          decompiledCaughtException = decompiledCaughtParameter2;
          L6: {
            var5_ref2 = (RuntimeException) (Object) decompiledCaughtException;
            stackOut_20_0 = (RuntimeException) var5_ref2;
            stackOut_20_1 = new StringBuilder().append("tl.B(").append(-5790).append(',');
            stackIn_22_0 = stackOut_20_0;
            stackIn_22_1 = stackOut_20_1;
            stackIn_21_0 = stackOut_20_0;
            stackIn_21_1 = stackOut_20_1;
            if (param1 == null) {
              stackOut_22_0 = (RuntimeException) (Object) stackIn_22_0;
              stackOut_22_1 = (StringBuilder) (Object) stackIn_22_1;
              stackOut_22_2 = "null";
              stackIn_23_0 = stackOut_22_0;
              stackIn_23_1 = stackOut_22_1;
              stackIn_23_2 = stackOut_22_2;
              break L6;
            } else {
              stackOut_21_0 = (RuntimeException) (Object) stackIn_21_0;
              stackOut_21_1 = (StringBuilder) (Object) stackIn_21_1;
              stackOut_21_2 = "{...}";
              stackIn_23_0 = stackOut_21_0;
              stackIn_23_1 = stackOut_21_1;
              stackIn_23_2 = stackOut_21_2;
              break L6;
            }
          }
          L7: {
            stackOut_23_0 = (RuntimeException) (Object) stackIn_23_0;
            stackOut_23_1 = ((StringBuilder) (Object) stackIn_23_1).append(stackIn_23_2).append(',');
            stackIn_25_0 = stackOut_23_0;
            stackIn_25_1 = stackOut_23_1;
            stackIn_24_0 = stackOut_23_0;
            stackIn_24_1 = stackOut_23_1;
            if (param2 == null) {
              stackOut_25_0 = (RuntimeException) (Object) stackIn_25_0;
              stackOut_25_1 = (StringBuilder) (Object) stackIn_25_1;
              stackOut_25_2 = "null";
              stackIn_26_0 = stackOut_25_0;
              stackIn_26_1 = stackOut_25_1;
              stackIn_26_2 = stackOut_25_2;
              break L7;
            } else {
              stackOut_24_0 = (RuntimeException) (Object) stackIn_24_0;
              stackOut_24_1 = (StringBuilder) (Object) stackIn_24_1;
              stackOut_24_2 = "{...}";
              stackIn_26_0 = stackOut_24_0;
              stackIn_26_1 = stackOut_24_1;
              stackIn_26_2 = stackOut_24_2;
              break L7;
            }
          }
          throw ig.a((Throwable) (Object) stackIn_26_0, stackIn_26_2 + ',' + param3 + ',' + param4 + ')');
        }
    }

    final static void b() {
        qn.b();
        ll.field_Rb.c(2);
    }

    public final Object next() {
        tc var1 = null;
        int var2 = 0;
        var2 = ArmiesOfGielinor.field_M ? 1 : 0;
        if (((tl) this).field_g.field_c[((tl) this).field_b - 1] == ((tl) this).field_d) {
          L0: while (true) {
            if (((tl) this).field_g.field_d > ((tl) this).field_b) {
              int fieldTemp$2 = ((tl) this).field_b;
              ((tl) this).field_b = ((tl) this).field_b + 1;
              var1 = ((tl) this).field_g.field_c[fieldTemp$2].field_b;
              if (var1 != ((tl) this).field_g.field_c[-1 + ((tl) this).field_b]) {
                ((tl) this).field_c = var1;
                ((tl) this).field_d = var1.field_b;
                return (Object) (Object) var1;
              } else {
                continue L0;
              }
            } else {
              return null;
            }
          }
        } else {
          var1 = ((tl) this).field_d;
          ((tl) this).field_d = var1.field_b;
          ((tl) this).field_c = var1;
          return (Object) (Object) var1;
        }
    }

    public final boolean hasNext() {
        int var2 = 0;
        var2 = ArmiesOfGielinor.field_M ? 1 : 0;
        if (((tl) this).field_g.field_c[-1 + ((tl) this).field_b] == ((tl) this).field_d) {
          L0: while (true) {
            if (((tl) this).field_b < ((tl) this).field_g.field_d) {
              int fieldTemp$1 = ((tl) this).field_b;
              ((tl) this).field_b = ((tl) this).field_b + 1;
              if (((tl) this).field_g.field_c[fieldTemp$1].field_b != ((tl) this).field_g.field_c[((tl) this).field_b - 1]) {
                ((tl) this).field_d = ((tl) this).field_g.field_c[((tl) this).field_b + -1].field_b;
                return true;
              } else {
                ((tl) this).field_d = ((tl) this).field_g.field_c[((tl) this).field_b - 1];
                continue L0;
              }
            } else {
              return false;
            }
          }
        } else {
          return true;
        }
    }

    final static void a(byte param0, kl param1, kl param2) {
        RuntimeException var3 = null;
        RuntimeException stackIn_3_0 = null;
        StringBuilder stackIn_3_1 = null;
        RuntimeException stackIn_4_0 = null;
        StringBuilder stackIn_4_1 = null;
        RuntimeException stackIn_5_0 = null;
        StringBuilder stackIn_5_1 = null;
        String stackIn_5_2 = null;
        RuntimeException stackIn_6_0 = null;
        StringBuilder stackIn_6_1 = null;
        RuntimeException stackIn_7_0 = null;
        StringBuilder stackIn_7_1 = null;
        RuntimeException stackIn_8_0 = null;
        StringBuilder stackIn_8_1 = null;
        String stackIn_8_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException stackOut_2_0 = null;
        StringBuilder stackOut_2_1 = null;
        RuntimeException stackOut_4_0 = null;
        StringBuilder stackOut_4_1 = null;
        String stackOut_4_2 = null;
        RuntimeException stackOut_3_0 = null;
        StringBuilder stackOut_3_1 = null;
        String stackOut_3_2 = null;
        RuntimeException stackOut_5_0 = null;
        StringBuilder stackOut_5_1 = null;
        RuntimeException stackOut_7_0 = null;
        StringBuilder stackOut_7_1 = null;
        String stackOut_7_2 = null;
        RuntimeException stackOut_6_0 = null;
        StringBuilder stackOut_6_1 = null;
        String stackOut_6_2 = null;
        try {
          jj.field_c = param2;
          up.field_e = param1;
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L0: {
            var3 = decompiledCaughtException;
            stackOut_2_0 = (RuntimeException) var3;
            stackOut_2_1 = new StringBuilder().append("tl.E(").append(-121).append(',');
            stackIn_4_0 = stackOut_2_0;
            stackIn_4_1 = stackOut_2_1;
            stackIn_3_0 = stackOut_2_0;
            stackIn_3_1 = stackOut_2_1;
            if (param1 == null) {
              stackOut_4_0 = (RuntimeException) (Object) stackIn_4_0;
              stackOut_4_1 = (StringBuilder) (Object) stackIn_4_1;
              stackOut_4_2 = "null";
              stackIn_5_0 = stackOut_4_0;
              stackIn_5_1 = stackOut_4_1;
              stackIn_5_2 = stackOut_4_2;
              break L0;
            } else {
              stackOut_3_0 = (RuntimeException) (Object) stackIn_3_0;
              stackOut_3_1 = (StringBuilder) (Object) stackIn_3_1;
              stackOut_3_2 = "{...}";
              stackIn_5_0 = stackOut_3_0;
              stackIn_5_1 = stackOut_3_1;
              stackIn_5_2 = stackOut_3_2;
              break L0;
            }
          }
          L1: {
            stackOut_5_0 = (RuntimeException) (Object) stackIn_5_0;
            stackOut_5_1 = ((StringBuilder) (Object) stackIn_5_1).append(stackIn_5_2).append(',');
            stackIn_7_0 = stackOut_5_0;
            stackIn_7_1 = stackOut_5_1;
            stackIn_6_0 = stackOut_5_0;
            stackIn_6_1 = stackOut_5_1;
            if (param2 == null) {
              stackOut_7_0 = (RuntimeException) (Object) stackIn_7_0;
              stackOut_7_1 = (StringBuilder) (Object) stackIn_7_1;
              stackOut_7_2 = "null";
              stackIn_8_0 = stackOut_7_0;
              stackIn_8_1 = stackOut_7_1;
              stackIn_8_2 = stackOut_7_2;
              break L1;
            } else {
              stackOut_6_0 = (RuntimeException) (Object) stackIn_6_0;
              stackOut_6_1 = (StringBuilder) (Object) stackIn_6_1;
              stackOut_6_2 = "{...}";
              stackIn_8_0 = stackOut_6_0;
              stackIn_8_1 = stackOut_6_1;
              stackIn_8_2 = stackOut_6_2;
              break L1;
            }
          }
          throw ig.a((Throwable) (Object) stackIn_8_0, stackIn_8_2 + ')');
        }
    }

    public static void a() {
        field_a = null;
        field_i = null;
        int var1 = -1;
        field_f = null;
        field_e = null;
        field_h = null;
    }

    private final void c() {
        ((tl) this).field_c = null;
        ((tl) this).field_d = ((tl) this).field_g.field_c[0].field_b;
        ((tl) this).field_b = 1;
    }

    tl(m param0) {
        ((tl) this).field_c = null;
        try {
            ((tl) this).field_g = param0;
            int discarded$0 = -101;
            this.c();
        } catch (RuntimeException runtimeException) {
            throw ig.a((Throwable) (Object) runtimeException, "tl.<init>(" + (param0 != null ? "{...}" : "null") + ')');
        }
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_a = "Unfortunately your configuration doesn't support fullscreen mode. You could try restarting your browser and using the signed applet.";
        field_f = "Rune";
        field_i = new me(6, 0, 4, 2);
        field_h = "Log in / Create account";
    }
}
