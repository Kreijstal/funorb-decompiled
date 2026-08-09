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
        if (!(this.field_c != null)) {
            throw new IllegalStateException();
        }
        this.field_c.d(42);
        this.field_c = null;
    }

    final static void a(int param0, java.awt.Color param1, String param2, boolean param3, int param4) {
        Exception var5 = null;
        RuntimeException var5_ref = null;
        java.awt.Graphics var9 = null;
        java.awt.Graphics var10 = null;
        RuntimeException stackIn_21_0 = null;
        StringBuilder stackIn_21_1 = null;
        RuntimeException stackIn_22_0 = null;
        StringBuilder stackIn_22_1 = null;
        String stackIn_22_2 = null;
        StringBuilder stackIn_24_1 = null;
        StringBuilder stackIn_25_1 = null;
        String stackIn_25_2 = null;
        int decompiledRegionSelector0 = 0;
        int decompiledRegionSelector1 = 0;
        Throwable decompiledCaughtException = null;
        Exception var6 = null;
        int var7 = 0;
        int var8 = 0;
        try {
          L0: {
            try {
              L1: {
                L2: {
                  var9 = si.field_b.getGraphics();
                  if (null != lf.field_g) {
                    break L2;
                  } else {
                    lf.field_g = new java.awt.Font("Helvetica", 1, 13);
                    break L2;
                  }
                }
                L3: {
                  if (!param3) {
                    break L3;
                  } else {
                    var9.setColor(java.awt.Color.black);
                    var9.fillRect(0, 0, bn.field_b, dt.field_a);
                    break L3;
                  }
                }
                L4: {
                  if (param1 != null) {
                    break L4;
                  } else {
                    param1 = new java.awt.Color(140, 17, 17);
                    break L4;
                  }
                }
                try {
                  L5: {
                    L6: {
                      if (gp.field_e != null) {
                        break L6;
                      } else {
                        gp.field_e = si.field_b.createImage(304, 34);
                        break L6;
                      }
                    }
                    var10 = gp.field_e.getGraphics();
                    var10.setColor(param1);
                    if (param0 == -5790) {
                      var10.drawRect(0, 0, 303, 33);
                      var10.fillRect(2, 2, 3 * param4, 30);
                      var10.setColor(java.awt.Color.black);
                      var10.drawRect(1, 1, 301, 31);
                      var10.fillRect(param4 * 3 + 2, 2, 300 + -(param4 * 3), 30);
                      var10.setFont(lf.field_g);
                      var10.setColor(java.awt.Color.white);
                      var10.drawString(param2, (304 - 6 * param2.length()) / 2, 22);
                      var9.drawImage(gp.field_e, -152 + bn.field_b / 2, dt.field_a / 2 + -18, (java.awt.image.ImageObserver) null);
                      decompiledRegionSelector0 = 1;
                      break L5;
                    } else {
                      decompiledRegionSelector0 = 0;
                      break L5;
                    }
                  }
                } catch (java.lang.Exception decompiledCaughtParameter0) {
                  decompiledCaughtException = decompiledCaughtParameter0;
                  L7: {
                    var6 = (Exception) (Object) decompiledCaughtException;
                    var7 = bn.field_b / 2 - 152;
                    var8 = -18 + dt.field_a / 2;
                    var9.setColor(param1);
                    var9.drawRect(var7, var8, 303, 33);
                    var9.fillRect(2 + var7, var8 - -2, param4 * 3, 30);
                    var9.setColor(java.awt.Color.black);
                    var9.drawRect(var7 + 1, 1 + var8, 301, 31);
                    var9.fillRect(param4 * 3 + 2 + var7, var8 + 2, -(param4 * 3) + 300, 30);
                    var9.setFont(lf.field_g);
                    var9.setColor(java.awt.Color.white);
                    var9.drawString(param2, var7 + (304 + -(param2.length() * 6)) / 2, 22 + var8);
                    decompiledRegionSelector0 = 1;
                    break L7;
                  }
                }
                if (decompiledRegionSelector0 == 0) {
                  decompiledRegionSelector1 = 1;
                  break L1;
                } else {
                  if (an.field_G != null) {
                    var9.setFont(lf.field_g);
                    var9.setColor(java.awt.Color.white);
                    var9.drawString(an.field_G, bn.field_b / 2 + -(an.field_G.length() * 6 / 2), dt.field_a / 2 + -26);
                    decompiledRegionSelector1 = 0;
                    break L1;
                  } else {
                    return;
                  }
                }
              }
            } catch (java.lang.Exception decompiledCaughtParameter1) {
              decompiledCaughtException = decompiledCaughtParameter1;
              var5 = (Exception) (Object) decompiledCaughtException;
              si.field_b.repaint();
              return;
            }
            if (decompiledRegionSelector1 == 0) {
              return;
            } else {
              break L0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter2) {
          decompiledCaughtException = decompiledCaughtParameter2;
          L8: {
            var5_ref = (RuntimeException) (Object) decompiledCaughtException;
            stackIn_21_0 = (RuntimeException) (var5_ref);

            stackIn_21_1 = new StringBuilder().append("tl.B(").append(param0).append(',');

            if (param1 == null) {
              stackIn_22_0 = (RuntimeException) ((Object) stackIn_21_0);
              stackIn_22_1 = (StringBuilder) ((Object) stackIn_21_1);
              stackIn_22_2 = "null";
              break L8;
            } else {
              stackIn_22_0 = (RuntimeException) ((Object) stackIn_21_0);
              stackIn_22_1 = (StringBuilder) ((Object) stackIn_21_1);
              stackIn_22_2 = "{...}";
              break L8;
            }
          }
          L9: {


            stackIn_24_1 = ((StringBuilder) (Object) stackIn_22_1).append(stackIn_22_2).append(',');

            if (param2 == null) {
              stackIn_22_0 = (RuntimeException) ((Object) stackIn_22_0);
              stackIn_25_1 = (StringBuilder) ((Object) stackIn_24_1);
              stackIn_25_2 = "null";
              break L9;
            } else {
              stackIn_22_0 = (RuntimeException) ((Object) stackIn_22_0);
              stackIn_25_1 = (StringBuilder) ((Object) stackIn_24_1);
              stackIn_25_2 = "{...}";
              break L9;
            }
          }
          throw ig.a((Throwable) ((Object) stackIn_22_0), stackIn_25_2 + ',' + param3 + ',' + param4 + ')');
        }
    }

    final static void b(byte param0) {
        qn.b();
        if (param0 != -90) {
            field_i = (me) null;
            ll.field_Rb.c(2);
            return;
        }
        ll.field_Rb.c(2);
    }

    public final Object next() {
        int fieldTemp$1 = 0;
        int var2;
        tc var3;
        tc var4;
        var2 = ArmiesOfGielinor.field_M ? 1 : 0;
        if (this.field_g.field_c[this.field_b - 1] == this.field_d) {
          L0: while (true) {
            if (this.field_g.field_d > this.field_b) {
              fieldTemp$1 = this.field_b;
              this.field_b = this.field_b + 1;
              var3 = this.field_g.field_c[fieldTemp$1].field_b;
              if (var3 != this.field_g.field_c[-1 + this.field_b]) {
                this.field_c = var3;
                this.field_d = var3.field_b;
                return var3;
              } else {
                continue L0;
              }
            } else {
              return null;
            }
          }
        } else {
          var4 = this.field_d;
          this.field_d = var4.field_b;
          this.field_c = var4;
          return var4;
        }
    }

    public final boolean hasNext() {
        int fieldTemp$1 = 0;
        int var2;
        var2 = ArmiesOfGielinor.field_M ? 1 : 0;
        if (this.field_g.field_c[-1 + this.field_b] == this.field_d) {
          L0: while (true) {
            if (this.field_b < this.field_g.field_d) {
              fieldTemp$1 = this.field_b;
              this.field_b = this.field_b + 1;
              if (this.field_g.field_c[fieldTemp$1].field_b != this.field_g.field_c[this.field_b - 1]) {
                this.field_d = this.field_g.field_c[this.field_b + -1].field_b;
                return true;
              } else {
                this.field_d = this.field_g.field_c[this.field_b - 1];
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
        try {
            jj.field_c = param2;
            up.field_e = param1;
            if (param0 > -117) {
                field_a = (String) null;
            }
        } catch (RuntimeException runtimeException) {
            throw ig.a((Throwable) ((Object) runtimeException), "tl.E(" + param0 + ',' + (param1 != null ? "{...}" : "null") + ',' + (param2 != null ? "{...}" : "null") + ')');
        }
    }

    public static void a(byte param0) {
        field_a = null;
        field_i = null;
        int var1 = -28 % ((param0 - -69) / 51);
        field_f = null;
        field_e = null;
        field_h = null;
    }

    private final void c(byte param0) {
        this.field_c = null;
        this.field_d = this.field_g.field_c[0].field_b;
        if (param0 >= -85) {
          this.field_c = (tc) null;
          this.field_b = 1;
          return;
        } else {
          this.field_b = 1;
          return;
        }
    }

    tl(m param0) {
        this.field_c = null;
        try {
            this.field_g = param0;
            this.c((byte) -101);
        } catch (RuntimeException runtimeException) {
            throw ig.a((Throwable) ((Object) runtimeException), "tl.<init>(" + (param0 != null ? "{...}" : "null") + ')');
        }
    }

    static {
        field_a = "Unfortunately your configuration doesn't support fullscreen mode. You could try restarting your browser and using the signed applet.";
        field_f = "Rune";
        field_i = new me(6, 0, 4, 2);
        field_h = "Log in / Create account";
    }
}
