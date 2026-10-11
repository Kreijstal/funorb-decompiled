/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class tk implements java.awt.event.KeyListener, java.awt.event.FocusListener {
    static String field_a;

    public final void keyTyped(java.awt.event.KeyEvent param0) {
        int var2_int = 0;
        int var3 = 0;
        try {
          if (null != wj.field_k) {
            var2_int = param0.getKeyChar();
            if (var2_int != 0 && var2_int != 65535 &&
              ak.a(-1, (char) var2_int)) {
              var3 = 1 + jk.field_w & 127;
              if (o.field_b != var3) {
                oi.field_e[jk.field_w] = -1;
                ia.field_d[jk.field_w] = (char)var2_int;
                jk.field_w = var3;
              }
            }
          }
          param0.consume();
        } catch (RuntimeException runtimeException) {
          throw la.a((Throwable) ((Object) runtimeException), "tk.keyTyped(" + (param0 != null ? "{...}" : "null") + ')');
        }
    }

    public final void focusGained(java.awt.event.FocusEvent param0) {
    }

    public final synchronized void keyPressed(java.awt.event.KeyEvent param0) {
        int var2_int = 0;
        RuntimeException var2 = null;
        int var3 = 0;
        RuntimeException stackIn_26_0 = null;
        StringBuilder stackIn_26_1 = null;
        String stackIn_27_2 = null;
        RuntimeException decompiledCaughtException = null;
        int var3Lifetime1;
        try {
          if (wj.field_k == null) {
            return;
          }
          je.field_c = 0;
          var2_int = param0.getKeyCode();
          if (var2_int >= 0 &&
            var2_int < cb.field_c.length) {
            var2_int = cb.field_c[var2_int];
            if ((var2_int & 128) != 0) {
              var2_int = -1;
            }
          } else {
            var2_int = -1;
          }
          if (vf.field_a >= 0 &&
            var2_int >= 0) {
            ia.field_g[vf.field_a] = var2_int;
            vf.field_a = 1 + vf.field_a & 127;
            if (vf.field_a == sl.field_j) {
              vf.field_a = -1;
            }
          }
          if (0 <= var2_int) {
            var3 = jk.field_w + 1 & 127;
            if (o.field_b != var3) {
              oi.field_e[jk.field_w] = var2_int;
              ia.field_d[jk.field_w] = (char)0;
              jk.field_w = var3;
            }
          }
          var3Lifetime1 = param0.getModifiers();
          if ((var3Lifetime1 & 10) == 0 &&
            var2_int != 85 &&
            10 != var2_int) {
            return;
          }
          param0.consume();
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2 = decompiledCaughtException;
          stackIn_26_0 = var2;
          stackIn_26_1 = new StringBuilder().append("tk.keyPressed(");
          if (param0 == null) {
            stackIn_27_2 = "null";
          } else {
            stackIn_27_2 = "{...}";
          }
          throw la.a((Throwable) ((Object) stackIn_26_0), ((StringBuilder) (Object) stackIn_26_1).append(stackIn_27_2).append(')').toString());
        }
    }

    public final synchronized void keyReleased(java.awt.event.KeyEvent param0) {
        int var2_int = 0;
        RuntimeException stackIn_16_0 = null;
        StringBuilder stackIn_16_1 = null;
        String stackIn_17_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var2 = null;
        try {
          if (null != wj.field_k) {
            je.field_c = 0;
            var2_int = param0.getKeyCode();
            if (var2_int >= 0 &&
              var2_int < cb.field_c.length) {
              var2_int = cb.field_c[var2_int] & -129;
            } else {
              var2_int = -1;
            }
            if (vf.field_a >= 0 &&
              var2_int >= 0) {
              ia.field_g[vf.field_a] = ~var2_int;
              vf.field_a = 127 & vf.field_a + 1;
              if (vf.field_a == sl.field_j) {
                vf.field_a = -1;
              }
            }
          }
          param0.consume();
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2 = decompiledCaughtException;
          stackIn_16_0 = var2;
          stackIn_16_1 = new StringBuilder().append("tk.keyReleased(");
          if (param0 == null) {
            stackIn_17_2 = "null";
          } else {
            stackIn_17_2 = "{...}";
          }
          throw la.a((Throwable) ((Object) stackIn_16_0), ((StringBuilder) (Object) stackIn_16_1).append(stackIn_17_2).append(')').toString());
        }
    }

    final static String a(ad param0, String param1, String param2, int param3, String param4) {
        RuntimeException var5 = null;
        String stackIn_2_0 = null;
        String stackIn_5_0 = null;
        String stackIn_7_0 = null;
        RuntimeException stackIn_10_0 = null;
        StringBuilder stackIn_10_1 = null;
        String stackIn_11_2 = null;
        StringBuilder stackIn_13_1 = null;
        String stackIn_14_2 = null;
        StringBuilder stackIn_16_1 = null;
        String stackIn_17_2 = null;
        StringBuilder stackIn_19_1 = null;
        String stackIn_20_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          if (param3 != 1) {
            stackIn_2_0 = (String) null;
            return stackIn_2_0;
          }
          if (param0.a(120)) {
            stackIn_7_0 = param2 + " - " + param0.a(param1, (byte) -81) + "%";
            return stackIn_7_0;
          }
          stackIn_5_0 = (String) (param4);
          return stackIn_5_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var5 = decompiledCaughtException;
          stackIn_10_0 = var5;
          stackIn_10_1 = new StringBuilder().append("tk.B(");
          if (param0 == null) {
            stackIn_11_2 = "null";
          } else {
            stackIn_11_2 = "{...}";
          }
          stackIn_13_1 = ((StringBuilder) (Object) stackIn_10_1).append(stackIn_11_2).append(',');
          if (param1 == null) {
            stackIn_14_2 = "null";
          } else {
            stackIn_14_2 = "{...}";
          }
          stackIn_16_1 = ((StringBuilder) (Object) stackIn_13_1).append(stackIn_14_2).append(',');
          if (param2 == null) {
            stackIn_17_2 = "null";
          } else {
            stackIn_17_2 = "{...}";
          }
          stackIn_19_1 = ((StringBuilder) (Object) stackIn_16_1).append(stackIn_17_2).append(',').append(param3).append(',');
          if (param4 == null) {
            stackIn_20_2 = "null";
          } else {
            stackIn_20_2 = "{...}";
          }
          throw la.a((Throwable) ((Object) stackIn_10_0), ((StringBuilder) (Object) stackIn_19_1).append(stackIn_20_2).append(')').toString());
        }
    }

    final static void a(int param0, boolean param1) {
        if (!param1) {
          field_a = (String) null;
          ed.field_d = 1000000000L / (long)param0;
          return;
        }
        ed.field_d = 1000000000L / (long)param0;
    }

    public final synchronized void focusLost(java.awt.event.FocusEvent param0) {
        try {
          if (wj.field_k != null) {
            vf.field_a = -1;
          }
        } catch (RuntimeException runtimeException) {
          throw la.a((Throwable) ((Object) runtimeException), "tk.focusLost(" + (param0 != null ? "{...}" : "null") + ')');
        }
    }

    public static void a(int param0) {
        if (param0 < 114) {
          tk.a(-14);
          field_a = null;
          return;
        }
        field_a = null;
    }

    static {
    }
}
