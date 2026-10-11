/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class mj implements java.awt.event.KeyListener, java.awt.event.FocusListener {
    static ug field_c;
    static boolean field_b;
    static String field_d;
    static jk field_a;

    public final void keyTyped(java.awt.event.KeyEvent param0) {
        int var2_int = 0;
        int var3 = 0;
        try {
          if (null != hl.field_d) {
            var2_int = param0.getKeyChar();
            if (var2_int != 0 &&
              var2_int != 65535 &&
              jj.a((byte) 118, (char) var2_int)) {
              var3 = 127 & 1 + b.field_M;
              if (var3 != ja.field_f) {
                fj.field_C[b.field_M] = -1;
                ql.field_k[b.field_M] = (char)var2_int;
                b.field_M = var3;
              }
            }
          }
          param0.consume();
        } catch (RuntimeException runtimeException) {
          throw oj.a((Throwable) ((Object) runtimeException), "mj.keyTyped(" + (param0 != null ? "{...}" : "null") + ')');
        }
    }

    public final void focusGained(java.awt.event.FocusEvent param0) {
    }

    final static String a(java.applet.Applet param0, int param1) {
        try {
          int var6 = 0;
          String var3 = null;
          String var4 = null;
          String[] var5 = null;
          int var7 = 0;
          int var8 = 0;
          String var9 = null;
          String stackIn_3_0 = null;
          String stackIn_9_0 = null;
          String stackIn_16_0 = null;
          RuntimeException stackIn_19_0 = null;
          StringBuilder stackIn_19_1 = null;
          String stackIn_20_2 = null;
          Throwable decompiledCaughtException = null;
          Throwable var2 = null;
          RuntimeException var2_ref = null;
          var8 = TorChallenge.field_F ? 1 : 0;
          try {
            try {
              if (param1 <= 99) {
                stackIn_3_0 = (String) null;
                return stackIn_3_0;
              }
              var9 = param0.getParameter("cookieprefix");
              var3 = var9 + "settings";
              var4 = (String) (ff.a("getcookies", param0, 20511));
              var5 = dl.a(var4, ';', -32);
              for (var6 = 0; var6 < var5.length; var6++) {
                var7 = var5[var6].indexOf('=');
                if (0 <= var7 &&
                  var5[var6].substring(0, var7).trim().equals(var3)) {
                  stackIn_9_0 = var5[var6].substring(var7 + 1).trim();
                  return stackIn_9_0;
                }
              }
            } catch (java.lang.Throwable decompiledCaughtParameter0) {
              decompiledCaughtException = decompiledCaughtParameter0;
              var2 = decompiledCaughtException;
            }
            if (null == ah.field_g) {
              return param0.getParameter("settings");
            }
            stackIn_16_0 = ah.field_g;
            return stackIn_16_0;
          } catch (java.lang.RuntimeException decompiledCaughtParameter1) {
            decompiledCaughtException = decompiledCaughtParameter1;
            var2_ref = (RuntimeException) (Object) decompiledCaughtException;
            stackIn_19_0 = var2_ref;
            stackIn_19_1 = new StringBuilder().append("mj.B(");
            if (param0 == null) {
              stackIn_20_2 = "null";
            } else {
              stackIn_20_2 = "{...}";
            }
            throw oj.a((Throwable) ((Object) stackIn_19_0), ((StringBuilder) (Object) stackIn_19_1).append(stackIn_20_2).append(',').append(param1).append(')').toString());
          }
        } catch (RuntimeException | Error decompiledUncheckedException) {
          throw decompiledUncheckedException;
        } catch (Throwable decompiledCheckedException) {
          throw new RuntimeException(decompiledCheckedException);
        }
    }

    public final synchronized void keyPressed(java.awt.event.KeyEvent param0) {
        RuntimeException stackIn_24_0 = null;
        StringBuilder stackIn_24_1 = null;
        String stackIn_25_2 = null;
        RuntimeException decompiledCaughtException = null;
        int var2_int = 0;
        RuntimeException var2 = null;
        int var3 = 0;
        int var3Lifetime1;
        try {
          if (null != hl.field_d) {
            vf.field_a = 0;
            var2_int = param0.getKeyCode();
            if (var2_int >= 0 &&
              var2_int < tf.field_l.length) {
              var2_int = tf.field_l[var2_int];
              if (0 != (var2_int & 128)) {
                var2_int = -1;
              }
            } else {
              var2_int = -1;
            }
            if (df.field_Q >= 0 &&
              var2_int >= 0) {
              bb.field_g[df.field_Q] = var2_int;
              df.field_Q = 127 & df.field_Q + 1;
              if (df.field_Q == qa.field_a) {
                df.field_Q = -1;
              }
            }
            if (0 <= var2_int) {
              var3 = 127 & b.field_M + 1;
              if (ja.field_f != var3) {
                fj.field_C[b.field_M] = var2_int;
                ql.field_k[b.field_M] = (char)0;
                b.field_M = var3;
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
          stackIn_24_0 = var2;
          stackIn_24_1 = new StringBuilder().append("mj.keyPressed(");
          if (param0 == null) {
            stackIn_25_2 = "null";
          } else {
            stackIn_25_2 = "{...}";
          }
          throw oj.a((Throwable) ((Object) stackIn_24_0), ((StringBuilder) (Object) stackIn_24_1).append(stackIn_25_2).append(')').toString());
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
          if (hl.field_d != null) {
            vf.field_a = 0;
            var2_int = param0.getKeyCode();
            if (var2_int >= 0 &&
              var2_int < tf.field_l.length) {
              var2_int = tf.field_l[var2_int] & -129;
            } else {
              var2_int = -1;
            }
            if (df.field_Q >= 0 &&
              var2_int >= 0) {
              bb.field_g[df.field_Q] = ~var2_int;
              df.field_Q = 1 + df.field_Q & 127;
              if (qa.field_a == df.field_Q) {
                df.field_Q = -1;
              }
            }
          }
          param0.consume();
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2 = decompiledCaughtException;
          stackIn_16_0 = var2;
          stackIn_16_1 = new StringBuilder().append("mj.keyReleased(");
          if (param0 == null) {
            stackIn_17_2 = "null";
          } else {
            stackIn_17_2 = "{...}";
          }
          throw oj.a((Throwable) ((Object) stackIn_16_0), ((StringBuilder) (Object) stackIn_16_1).append(stackIn_17_2).append(')').toString());
        }
    }

    public final synchronized void focusLost(java.awt.event.FocusEvent param0) {
        try {
          if (hl.field_d != null) {
            df.field_Q = -1;
          }
        } catch (RuntimeException runtimeException) {
          throw oj.a((Throwable) ((Object) runtimeException), "mj.focusLost(" + (param0 != null ? "{...}" : "null") + ')');
        }
    }

    public static void a(byte param0) {
        if (param0 != -36) {
          field_c = (ug) null;
        }
        field_d = null;
        field_a = null;
    }

    static {
        field_b = false;
        field_c = null;
    }
}
