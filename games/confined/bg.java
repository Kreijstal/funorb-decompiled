/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class bg implements java.awt.event.KeyListener, java.awt.event.FocusListener {
    static String field_e;
    static pf field_b;
    static int field_f;
    static e field_g;
    static jb field_a;
    static kc field_d;
    static nf field_c;

    final static boolean a(int param0, char param1) {
        if (param0 != 175) {
          bg.a(-126, 'ﾻ');
          if (160 == param1) {
            return true;
          }
          if (param1 == 32) {
            return true;
          }
          if (95 == param1) {
            return true;
          }
          if (param1 != 45) {
            return false;
          }
          return true;
        }
        if (160 == param1) {
          return true;
        }
        if (param1 == 32) {
          return true;
        }
        if (95 == param1) {
          return true;
        }
        if (param1 != 45) {
          return false;
        }
        return true;
    }

    public final void keyTyped(java.awt.event.KeyEvent param0) {
        int var2_int = 0;
        int var3 = 0;
        try {
          if (null != tf.field_p) {
            var2_int = param0.getKeyChar();
            if (var2_int != 0 &&
              var2_int != 65535 &&
              nd.a((char) var2_int, (byte) -18)) {
              var3 = oe.field_W + 1 & 127;
              if (ic.field_b != var3) {
                ke.field_P[oe.field_W] = -1;
                mk.field_n[oe.field_W] = (char)var2_int;
                oe.field_W = var3;
              }
            }
          }
          param0.consume();
        } catch (RuntimeException runtimeException) {
          throw sd.a((Throwable) ((Object) runtimeException), "bg.keyTyped(" + (param0 != null ? "{...}" : "null") + ')');
        }
    }

    final static int a(int param0) {
        if (param0 != 12398) {
          return 114;
        }
        return (int)(1000000000L / ij.field_u);
    }

    public final synchronized void keyPressed(java.awt.event.KeyEvent param0) {
        int var2_int = 0;
        RuntimeException stackIn_26_0 = null;
        StringBuilder stackIn_26_1 = null;
        String stackIn_27_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var2 = null;
        int var3 = 0;
        int var3Lifetime1;
        try {
          if (null != tf.field_p) {
            cg.field_d = 0;
            var2_int = param0.getKeyCode();
            if (var2_int >= 0 &&
              tj.field_z.length > var2_int) {
              var2_int = tj.field_z[var2_int];
              if (0 != (128 & var2_int)) {
                var2_int = -1;
              }
            } else {
              var2_int = -1;
            }
            if (ab.field_a >= 0 &&
              var2_int >= 0) {
              on.field_f[ab.field_a] = var2_int;
              ab.field_a = 127 & 1 + ab.field_a;
              if (ab.field_a == mi.field_g) {
                ab.field_a = -1;
              }
            }
            if (var2_int >= 0) {
              var3 = 127 & 1 + oe.field_W;
              if (ic.field_b != var3) {
                ke.field_P[oe.field_W] = var2_int;
                mk.field_n[oe.field_W] = (char)0;
                oe.field_W = var3;
              }
            }
            var3Lifetime1 = param0.getModifiers();
            if ((var3Lifetime1 & 10) != 0) {
              param0.consume();
              return;
            }
            if (var2_int == 85) {
              param0.consume();
              return;
            }
            if (10 == var2_int) {
              param0.consume();
              return;
            }
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2 = decompiledCaughtException;
          stackIn_26_0 = var2;
          stackIn_26_1 = new StringBuilder().append("bg.keyPressed(");
          if (param0 == null) {
            stackIn_27_2 = "null";
          } else {
            stackIn_27_2 = "{...}";
          }
          throw sd.a((Throwable) ((Object) stackIn_26_0), ((StringBuilder) (Object) stackIn_26_1).append(stackIn_27_2).append(')').toString());
        }
    }

    public final synchronized void keyReleased(java.awt.event.KeyEvent param0) {
        int var2_int = 0;
        RuntimeException stackIn_14_0 = null;
        StringBuilder stackIn_14_1 = null;
        String stackIn_15_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var2 = null;
        try {
          if (tf.field_p != null) {
            cg.field_d = 0;
            var2_int = param0.getKeyCode();
            if (0 <= var2_int &&
              tj.field_z.length > var2_int) {
              var2_int = tj.field_z[var2_int] & -129;
            } else {
              var2_int = -1;
            }
            if (ab.field_a >= 0 &&
              0 <= var2_int) {
              on.field_f[ab.field_a] = ~var2_int;
              ab.field_a = 1 + ab.field_a & 127;
              if (mi.field_g == ab.field_a) {
                ab.field_a = -1;
              }
            }
          }
          param0.consume();
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2 = decompiledCaughtException;
          stackIn_14_0 = var2;
          stackIn_14_1 = new StringBuilder().append("bg.keyReleased(");
          if (param0 == null) {
            stackIn_15_2 = "null";
          } else {
            stackIn_15_2 = "{...}";
          }
          throw sd.a((Throwable) ((Object) stackIn_14_0), ((StringBuilder) (Object) stackIn_14_1).append(stackIn_15_2).append(')').toString());
        }
    }

    public static void a(byte param0) {
        field_d = null;
        field_a = null;
        if (param0 < -45) {
          field_e = null;
          field_c = null;
          field_g = null;
          field_b = null;
          return;
        }
        bg.a(104, '\024');
        field_e = null;
        field_c = null;
        field_g = null;
        field_b = null;
    }

    public final synchronized void focusLost(java.awt.event.FocusEvent param0) {
        try {
          if (null != tf.field_p) {
            ab.field_a = -1;
          }
        } catch (RuntimeException runtimeException) {
          throw sd.a((Throwable) ((Object) runtimeException), "bg.focusLost(" + (param0 != null ? "{...}" : "null") + ')');
        }
    }

    public final void focusGained(java.awt.event.FocusEvent param0) {
    }

    static {
        field_e = "Invalid password.";
        field_g = new e(12, 0, 1, 0);
        field_c = new nf(270, 70);
    }
}
