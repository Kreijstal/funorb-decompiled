/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class qh implements java.awt.event.KeyListener, java.awt.event.FocusListener {
    static sf field_b;
    static int field_c;
    static String field_d;
    static String field_e;
    static int[] field_a;

    public final void keyTyped(java.awt.event.KeyEvent param0) {
        int var2_int = 0;
        int var3 = 0;
        try {
          if (null != i.field_J) {
            var2_int = param0.getKeyChar();
            if (var2_int != 0 &&
              var2_int != 65535 &&
              hi.a((char) var2_int, (byte) 70)) {
              var3 = 127 & rh.field_e + 1;
              if (var3 != pf.field_a) {
                lb.field_V[rh.field_e] = -1;
                r.field_g[rh.field_e] = (char)var2_int;
                rh.field_e = var3;
              }
            }
          }
          param0.consume();
        } catch (RuntimeException runtimeException) {
          throw fc.a((Throwable) ((Object) runtimeException), "qh.keyTyped(" + (param0 != null ? "{...}" : "null") + ')');
        }
    }

    public final void focusGained(java.awt.event.FocusEvent param0) {
    }

    final static ff[] a(int param0) {
        if (param0 <= -63) {
          return new ff[]{u.field_a, ne.field_f, ng.field_f, ti.field_c, da.field_i, di.field_i, rg.field_b, me.field_f, kj.field_J, mb.field_b, wh.field_a, kg.field_f, ef.field_a, la.field_l};
        }
        field_b = (sf) null;
        return new ff[]{u.field_a, ne.field_f, ng.field_f, ti.field_c, da.field_i, di.field_i, rg.field_b, me.field_f, kj.field_J, mb.field_b, wh.field_a, kg.field_f, ef.field_a, la.field_l};
    }

    public final synchronized void keyReleased(java.awt.event.KeyEvent param0) {
        int var2_int = 0;
        RuntimeException stackIn_17_0 = null;
        StringBuilder stackIn_17_1 = null;
        String stackIn_18_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var2 = null;
        try {
          if (null != i.field_J) {
            lf.field_c = 0;
            var2_int = param0.getKeyCode();
            if (var2_int >= 0 &&
              var2_int < sg.field_b.length) {
              var2_int = -129 & sg.field_b[var2_int];
            } else {
              var2_int = -1;
            }
            if (fg.field_b >= 0 &&
              var2_int >= 0) {
              ci.field_qb[fg.field_b] = ~var2_int;
              fg.field_b = 127 & fg.field_b + 1;
              if (fg.field_b == qd.field_d) {
                fg.field_b = -1;
              }
            }
          }
          param0.consume();
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2 = decompiledCaughtException;
          stackIn_17_0 = var2;
          stackIn_17_1 = new StringBuilder().append("qh.keyReleased(");
          if (param0 == null) {
            stackIn_18_2 = "null";
          } else {
            stackIn_18_2 = "{...}";
          }
          throw fc.a((Throwable) ((Object) stackIn_17_0), ((StringBuilder) (Object) stackIn_17_1).append(stackIn_18_2).append(')').toString());
        }
    }

    public final synchronized void keyPressed(java.awt.event.KeyEvent param0) {
        int var2_int = 0;
        RuntimeException stackIn_25_0 = null;
        StringBuilder stackIn_25_1 = null;
        String stackIn_26_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var2 = null;
        int var3 = 0;
        int var3Lifetime1;
        try {
          if (i.field_J != null) {
            lf.field_c = 0;
            var2_int = param0.getKeyCode();
            if (var2_int >= 0 &&
              sg.field_b.length > var2_int) {
              var2_int = sg.field_b[var2_int];
              if ((128 & var2_int) != 0) {
                var2_int = -1;
              }
            } else {
              var2_int = -1;
            }
            if (fg.field_b >= 0 &&
              var2_int >= 0) {
              ci.field_qb[fg.field_b] = var2_int;
              fg.field_b = fg.field_b + 1 & 127;
              if (qd.field_d == fg.field_b) {
                fg.field_b = -1;
              }
            }
            if (var2_int >= 0) {
              var3 = 127 & 1 + rh.field_e;
              if (var3 != pf.field_a) {
                lb.field_V[rh.field_e] = var2_int;
                r.field_g[rh.field_e] = (char)0;
                rh.field_e = var3;
              }
            }
            var3Lifetime1 = param0.getModifiers();
            if ((10 & var3Lifetime1) != 0) {
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
          stackIn_25_0 = var2;
          stackIn_25_1 = new StringBuilder().append("qh.keyPressed(");
          if (param0 == null) {
            stackIn_26_2 = "null";
          } else {
            stackIn_26_2 = "{...}";
          }
          throw fc.a((Throwable) ((Object) stackIn_25_0), ((StringBuilder) (Object) stackIn_25_1).append(stackIn_26_2).append(')').toString());
        }
    }

    final static java.awt.Container a(byte param0) {
        if (null != oc.field_a) {
          return (java.awt.Container) ((Object) oc.field_a);
        }
        if (param0 == 60) {
          return (java.awt.Container) ((Object) ia.g(param0 ^ 99));
        }
        field_e = (String) null;
        return (java.awt.Container) ((Object) ia.g(param0 ^ 99));
    }

    public final synchronized void focusLost(java.awt.event.FocusEvent param0) {
        RuntimeException var2 = null;
        RuntimeException stackIn_6_0 = null;
        StringBuilder stackIn_6_1 = null;
        String stackIn_7_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          if (null == i.field_J) {
            return;
          }
          fg.field_b = -1;
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2 = decompiledCaughtException;
          stackIn_6_0 = var2;
          stackIn_6_1 = new StringBuilder().append("qh.focusLost(");
          if (param0 == null) {
            stackIn_7_2 = "null";
          } else {
            stackIn_7_2 = "{...}";
          }
          throw fc.a((Throwable) ((Object) stackIn_6_0), ((StringBuilder) (Object) stackIn_6_1).append(stackIn_7_2).append(')').toString());
        }
    }

    final static String a(boolean param0, boolean param1, boolean param2, byte param3) {
        int var4;
        int var4Lifetime1;
        if (param3 == 8) {
          var4 = 0;
          if (param0) {
            var4 += 4;
          }
          if (param1) {
            var4 += 2;
          }
          if (param2) {
            var4++;
          }
          return ua.field_M[var4];
        }
        field_c = -10;
        var4Lifetime1 = 0;
        if (param0) {
          var4Lifetime1 += 4;
        }
        if (param1) {
          var4Lifetime1 += 2;
        }
        if (param2) {
          var4Lifetime1++;
        }
        return ua.field_M[var4Lifetime1];
    }

    public static void b(int param0) {
        field_e = null;
        if (param0 == 1) {
          field_b = null;
          field_a = null;
          field_d = null;
          return;
        }
        qh.a(-19);
        field_b = null;
        field_a = null;
        field_d = null;
    }

    static {
        field_e = "Please enter your age in years";
        field_d = "Your email address is used to identify this account";
        field_a = new int[]{100, 200, 350, 500, 700, 900, 1150, 1300};
    }
}
