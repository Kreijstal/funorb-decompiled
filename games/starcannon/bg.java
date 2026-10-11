/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class bg implements java.awt.event.KeyListener, java.awt.event.FocusListener {
    static int field_e;
    static o field_f;
    static String field_b;
    static int field_a;
    static String field_d;
    static hl field_c;

    public final void keyTyped(java.awt.event.KeyEvent param0) {
        int var2_int = 0;
        int var3 = 0;
        try {
          if (null != hj.field_c) {
            var2_int = param0.getKeyChar();
            if (var2_int != 0 &&
              65535 != var2_int &&
              ua.a((char) var2_int, 0)) {
              var3 = 127 & pd.field_b + 1;
              if (wg.field_b != var3) {
                pe.field_e[pd.field_b] = -1;
                ik.field_s[pd.field_b] = (char)var2_int;
                pd.field_b = var3;
              }
            }
          }
          param0.consume();
        } catch (RuntimeException runtimeException) {
          throw sd.a((Throwable) ((Object) runtimeException), "bg.keyTyped(" + (param0 != null ? "{...}" : "null") + ')');
        }
    }

    public static void a(int param0) {
        int var1 = 123 % ((-4 - param0) / 33);
        field_f = null;
        field_c = null;
        field_d = null;
        field_b = null;
    }

    public final synchronized void keyReleased(java.awt.event.KeyEvent param0) {
        int var2_int = 0;
        RuntimeException stackIn_16_0 = null;
        StringBuilder stackIn_16_1 = null;
        String stackIn_17_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var2 = null;
        try {
          if (null != hj.field_c) {
            ie.field_D = 0;
            var2_int = param0.getKeyCode();
            if (0 <= var2_int &&
              cg.field_j.length > var2_int) {
              var2_int = cg.field_j[var2_int] & -129;
            } else {
              var2_int = -1;
            }
            if (ah.field_c >= 0 &&
              var2_int >= 0) {
              ab.field_A[ah.field_c] = ~var2_int;
              ah.field_c = 127 & ah.field_c + 1;
              if (ec.field_a == ah.field_c) {
                ah.field_c = -1;
              }
            }
          }
          param0.consume();
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2 = decompiledCaughtException;
          stackIn_16_0 = var2;
          stackIn_16_1 = new StringBuilder().append("bg.keyReleased(");
          if (param0 == null) {
            stackIn_17_2 = "null";
          } else {
            stackIn_17_2 = "{...}";
          }
          throw sd.a((Throwable) ((Object) stackIn_16_0), ((StringBuilder) (Object) stackIn_16_1).append(stackIn_17_2).append(')').toString());
        }
    }

    public final synchronized void keyPressed(java.awt.event.KeyEvent param0) {
        int var2_int = 0;
        RuntimeException stackIn_24_0 = null;
        StringBuilder stackIn_24_1 = null;
        String stackIn_25_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var2 = null;
        int var3 = 0;
        int var3Lifetime1;
        try {
          if (hj.field_c != null) {
            ie.field_D = 0;
            var2_int = param0.getKeyCode();
            if (var2_int >= 0 &&
              var2_int < cg.field_j.length) {
              var2_int = cg.field_j[var2_int];
              if (0 != (var2_int & 128)) {
                var2_int = -1;
              }
            } else {
              var2_int = -1;
            }
            if (ah.field_c >= 0 &&
              var2_int >= 0) {
              ab.field_A[ah.field_c] = var2_int;
              ah.field_c = 1 + ah.field_c & 127;
              if (ah.field_c == ec.field_a) {
                ah.field_c = -1;
              }
            }
            if (var2_int >= 0) {
              var3 = 127 & pd.field_b + 1;
              if (wg.field_b != var3) {
                pe.field_e[pd.field_b] = var2_int;
                ik.field_s[pd.field_b] = (char)0;
                pd.field_b = var3;
              }
            }
            var3Lifetime1 = param0.getModifiers();
            if ((var3Lifetime1 & 10) != 0) {
              param0.consume();
              return;
            }
            if (85 == var2_int) {
              param0.consume();
              return;
            }
            if (var2_int == 10) {
              param0.consume();
              return;
            }
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2 = decompiledCaughtException;
          stackIn_24_0 = var2;
          stackIn_24_1 = new StringBuilder().append("bg.keyPressed(");
          if (param0 == null) {
            stackIn_25_2 = "null";
          } else {
            stackIn_25_2 = "{...}";
          }
          throw sd.a((Throwable) ((Object) stackIn_24_0), ((StringBuilder) (Object) stackIn_24_1).append(stackIn_25_2).append(')').toString());
        }
    }

    public final synchronized void focusLost(java.awt.event.FocusEvent param0) {
        try {
          if (null != hj.field_c) {
            ah.field_c = -1;
          }
        } catch (RuntimeException runtimeException) {
          throw sd.a((Throwable) ((Object) runtimeException), "bg.focusLost(" + (param0 != null ? "{...}" : "null") + ')');
        }
    }

    final static void b(int param0) {
        int var3 = 0;
        int stackIn_20_0 = 0;
        String stackIn_25_0 = null;
        int stackIn_29_0 = 0;
        String stackIn_35_0 = null;
        String stackIn_40_0 = null;
        int stackIn_40_1 = 0;
        boolean stackIn_41_2 = false;
        gi stackIn_45_0 = null;
        RuntimeException decompiledCaughtException = null;
        int var1_int = 0;
        RuntimeException var1 = null;
        int var2 = 0;
        long var3_long = 0L;
        int var4 = 0;
        int var5 = 0;
        String var6 = null;
        int var7 = 0;
        int var8 = 0;
        gi var9 = null;
        int var10 = 0;
        int var7Lifetime1;
        int var8Lifetime1;
        var10 = StarCannon.field_A;
        try {
          if (param0 != 1000) {
            return;
          }
          var1_int = nd.field_m;
          var2 = 0;
          if (bh.field_a == 2) {
            var3_long = dd.b(57) - af.field_x;
            var2 = (int)((-var3_long + 10999L) / 1000L);
            if (var2 < 0) {
              var2 = 0;
            }
          }
          for (var3 = 0; uh.field_h.length > var3; var3++) {
            var4 = eg.field_a[var3];
            if (var4 >= 0) {
              if (ja.field_c.field_k == var4) {
                var5 = ig.field_b;
              } else {
                var5 = sd.field_a;
              }
            } else {
              var5 = sb.field_m;
            }
            var6 = uh.field_h[var3];
            if (bh.field_a == 2 &&
              1 == var2) {
              if (se.field_n.length >= ri.field_b.length) {
                stackIn_20_0 = se.field_n.length;
              } else {
                stackIn_20_0 = ri.field_b.length;
              }
              var7 = stackIn_20_0;
              if (var3 >= 6 &&
                6 + var7 > var3) {
                if (-var7 + se.field_n.length + (-6 + var3) >= 0) {
                  stackIn_25_0 = se.field_n[-var7 + var3 + (-6 + se.field_n.length)];
                } else {
                  stackIn_25_0 = "";
                }
                var6 = stackIn_25_0;
              }
              if (fb.field_c.length >= rd.field_q.length) {
                stackIn_29_0 = fb.field_c.length;
              } else {
                stackIn_29_0 = rd.field_q.length;
              }
              var8 = stackIn_29_0;
              if (var3 >= 7 + var7 &&
                var3 < 7 + (var7 + var8)) {
                if (-var7 + (-7 + var3) >= fb.field_c.length) {
                  stackIn_35_0 = "";
                } else {
                  stackIn_35_0 = fb.field_c[-7 + (var3 - var7)];
                }
                var6 = stackIn_35_0;
              }
            }
            if (var4 == -2) {
              var6 = Integer.toString(var2);
            }
            stackIn_40_0 = var6;
            stackIn_40_1 = 26;
            stackIn_41_2 = !(var4 < 0);
            var7Lifetime1 = fb.$cfr$intArgs$a$1694234bddb3(stackIn_40_0, stackIn_40_1, stackIn_41_2);
            var8Lifetime1 = -(var7Lifetime1 >> 1) + ee.field_b;
            if (var4 >= 0) {
              if (var4 == ja.field_c.field_k) {
                stackIn_45_0 = ie.field_y;
              } else {
                stackIn_45_0 = wj.field_d;
              }
              var9 = stackIn_45_0;
              var1_int = var1_int + mc.field_h;
              if (var9 != null) {
                var9.a(-rh.field_i + var8Lifetime1, (rh.field_i << 1) + var7Lifetime1, param0 ^ -947, var1_int, pk.field_c + (kc.field_S << 1));
              }
              var1_int = var1_int + kc.field_S;
            }
            if (var4 >= 0) {
              ai.field_h.a(var6, var8Lifetime1, var1_int + rg.field_D, var5, -1);
              var1_int = var1_int + (pk.field_c + (kc.field_S + mc.field_h));
            } else {
              rh.field_h.a(var6, var8Lifetime1, kf.field_v + var1_int, var5, -1);
              var1_int = var1_int + sg.field_e;
            }
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var1 = decompiledCaughtException;
          throw sd.a((Throwable) ((Object) var1), "bg.A(" + param0 + ')');
        }
    }

    public final void focusGained(java.awt.event.FocusEvent param0) {
    }

    static {
        field_f = new o(10, 2, 2, 0);
        field_b = "Quit to website";
        field_d = "Unfortunately you are not eligible to create an account.";
    }
}
