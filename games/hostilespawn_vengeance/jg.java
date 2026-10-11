/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class jg implements java.awt.event.KeyListener, java.awt.event.FocusListener {
    static String field_b;
    static bd field_h;
    static String field_a;
    static int field_l;
    static String field_e;
    static bd field_d;
    static int field_c;
    static String field_k;
    static bd field_j;
    static bd field_f;
    static String field_g;
    static bd field_i;

    public final synchronized void keyReleased(java.awt.event.KeyEvent param0) {
        int var2_int = 0;
        RuntimeException stackIn_15_0 = null;
        StringBuilder stackIn_15_1 = null;
        String stackIn_16_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var2 = null;
        try {
          if (null != nj.field_c) {
            ae.field_s = 0;
            var2_int = param0.getKeyCode();
            if (0 <= var2_int &&
              var2_int < vc.field_i.length) {
              var2_int = -129 & vc.field_i[var2_int];
            } else {
              var2_int = -1;
            }
            if (0 <= uc.field_b &&
              var2_int >= 0) {
              al.field_W[uc.field_b] = ~var2_int;
              uc.field_b = uc.field_b + 1 & 127;
              if (md.field_o == uc.field_b) {
                uc.field_b = -1;
              }
            }
          }
          param0.consume();
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2 = decompiledCaughtException;
          stackIn_15_0 = var2;
          stackIn_15_1 = new StringBuilder().append("jg.keyReleased(");
          if (param0 == null) {
            stackIn_16_2 = "null";
          } else {
            stackIn_16_2 = "{...}";
          }
          throw wg.a((Throwable) ((Object) stackIn_15_0), ((StringBuilder) (Object) stackIn_15_1).append(stackIn_16_2).append(')').toString());
        }
    }

    public final synchronized void focusLost(java.awt.event.FocusEvent param0) {
        try {
          if (null != nj.field_c) {
            uc.field_b = -1;
          }
        } catch (RuntimeException runtimeException) {
          throw wg.a((Throwable) ((Object) runtimeException), "jg.focusLost(" + (param0 != null ? "{...}" : "null") + ')');
        }
    }

    public final synchronized void keyPressed(java.awt.event.KeyEvent param0) {
        RuntimeException stackIn_26_0 = null;
        StringBuilder stackIn_26_1 = null;
        String stackIn_27_2 = null;
        RuntimeException decompiledCaughtException = null;
        int var2_int = 0;
        RuntimeException var2 = null;
        int var3 = 0;
        int var3Lifetime1;
        try {
          if (null != nj.field_c) {
            ae.field_s = 0;
            var2_int = param0.getKeyCode();
            if (var2_int >= 0 &&
              vc.field_i.length > var2_int) {
              var2_int = vc.field_i[var2_int];
              if ((var2_int & 128) != 0) {
                var2_int = -1;
              }
            } else {
              var2_int = -1;
            }
            if (uc.field_b >= 0 &&
              0 <= var2_int) {
              al.field_W[uc.field_b] = var2_int;
              uc.field_b = 127 & 1 + uc.field_b;
              if (uc.field_b == md.field_o) {
                uc.field_b = -1;
              }
            }
            if (var2_int >= 0) {
              var3 = 127 & 1 + oa.field_a;
              if (var3 != ee.field_e) {
                cm.field_a[oa.field_a] = var2_int;
                pe.field_db[oa.field_a] = (char)0;
                oa.field_a = var3;
              }
            }
            var3Lifetime1 = param0.getModifiers();
            if ((10 & var3Lifetime1) != 0) {
              param0.consume();
              return;
            }
            if (var2_int == 85) {
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
          stackIn_26_0 = var2;
          stackIn_26_1 = new StringBuilder().append("jg.keyPressed(");
          if (param0 == null) {
            stackIn_27_2 = "null";
          } else {
            stackIn_27_2 = "{...}";
          }
          throw wg.a((Throwable) ((Object) stackIn_26_0), ((StringBuilder) (Object) stackIn_26_1).append(stackIn_27_2).append(')').toString());
        }
    }

    public final void focusGained(java.awt.event.FocusEvent param0) {
    }

    public final void keyTyped(java.awt.event.KeyEvent param0) {
        int var2_int = 0;
        int var3 = 0;
        try {
          if (null != nj.field_c) {
            var2_int = param0.getKeyChar();
            if (var2_int != 0 &&
              65535 != var2_int &&
              j.a(false, (char) var2_int)) {
              var3 = 1 + oa.field_a & 127;
              if (ee.field_e != var3) {
                cm.field_a[oa.field_a] = -1;
                pe.field_db[oa.field_a] = (char)var2_int;
                oa.field_a = var3;
              }
            }
          }
          param0.consume();
        } catch (RuntimeException runtimeException) {
          throw wg.a((Throwable) ((Object) runtimeException), "jg.keyTyped(" + (param0 != null ? "{...}" : "null") + ')');
        }
    }

    final static int a(int param0) {
        int var1_int = 0;
        RuntimeException var1 = null;
        int var2 = 0;
        int stackIn_6_0 = 0;
        int stackIn_9_0 = 0;
        int stackIn_13_0 = 0;
        int stackIn_16_0 = 0;
        int stackIn_19_0 = 0;
        int stackIn_21_0 = 0;
        RuntimeException decompiledCaughtException = null;
        int var1_intLifetime1;
        var2 = HostileSpawn.field_I ? 1 : 0;
        try {
          im.field_e.a(ri.field_n, 8799, true, mf.field_b);
          im.field_e.e((byte) 114);
          while (jn.e((byte) -79)) {
            im.field_e.a(pj.field_e, aj.field_e, 80);
          }
          if (dn.field_a != -1) {
            var1_int = dn.field_a;
            g.a((byte) 122, -1);
            stackIn_6_0 = var1_int;
            return stackIn_6_0;
          }
          var1_intLifetime1 = -20 / ((param0 + 42) / 36);
          if (eh.field_e) {
            stackIn_9_0 = 3;
            return stackIn_9_0;
          }
          if (ti.field_b == ki.field_f) {
            stackIn_13_0 = 1;
            return stackIn_13_0;
          }
          if (!c.field_a.d((byte) -112)) {
            stackIn_16_0 = 1;
            return stackIn_16_0;
          }
          if (ti.field_b != od.field_I) {
            stackIn_21_0 = -1;
            return stackIn_21_0;
          }
          stackIn_19_0 = 2;
          return stackIn_19_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var1 = decompiledCaughtException;
          throw wg.a((Throwable) ((Object) var1), "jg.B(" + param0 + ')');
        }
    }

    final static ue a(int param0, byte param1, fd param2, int param3, int param4, int param5) {
        java.awt.Frame var6 = null;
        RuntimeException var6_ref = null;
        ue var7 = null;
        java.awt.Frame var8 = null;
        ue stackIn_6_0 = null;
        RuntimeException stackIn_9_0 = null;
        StringBuilder stackIn_9_1 = null;
        String stackIn_10_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          var8 = g.a(param4, param3, (byte) 30, param2, param5, param0);
          var6 = var8;
          if (var8 == null) {
            return null;
          }
          var7 = new ue();
          var7.field_i = var8;
          var7.field_i.add((java.awt.Component) ((Object) var7));
          var7.setBounds(0, 0, param0, param4);
          if (param1 >= -32) {
            field_f = (bd) null;
          }
          var7.addFocusListener(var7);
          var7.requestFocus();
          stackIn_6_0 = var7;
          return stackIn_6_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var6_ref = decompiledCaughtException;
          stackIn_9_0 = var6_ref;
          stackIn_9_1 = new StringBuilder().append("jg.C(").append(param0).append(',').append(param1).append(',');
          if (param2 == null) {
            stackIn_10_2 = "null";
          } else {
            stackIn_10_2 = "{...}";
          }
          throw wg.a((Throwable) ((Object) stackIn_9_0), ((StringBuilder) (Object) stackIn_9_1).append(stackIn_10_2).append(',').append(param3).append(',').append(param4).append(',').append(param5).append(')').toString());
        }
    }

    final static void a(int param0, int param1, int param2) {
        if (param0 > -98) {
          field_e = (String) null;
          hn.field_b = param1;
          qh.field_s = param2;
          return;
        }
        hn.field_b = param1;
        qh.field_s = param2;
    }

    public static void b(int param0) {
        field_e = null;
        field_f = null;
        field_b = null;
        field_k = null;
        int var1 = -81 % ((param0 - 68) / 37);
        field_a = null;
        field_i = null;
        field_d = null;
        field_h = null;
        field_j = null;
        field_g = null;
    }

    static {
        field_b = "Login: ";
        field_e = "Open in popup window";
        field_g = "Data server full or too many connections from your address. Please try again in a few minutes.";
        field_k = "Destroy the reactor to stop more spawn entering the base, then get back to the lift.";
        field_a = "Charges planted: ";
    }
}
