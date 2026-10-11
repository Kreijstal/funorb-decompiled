/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class gb implements java.awt.event.KeyListener, java.awt.event.FocusListener {
    static String field_d;
    static db field_c;
    static cj field_a;
    static th field_e;
    static byte[][][] field_b;

    public final void focusGained(java.awt.event.FocusEvent param0) {
    }

    public final void keyTyped(java.awt.event.KeyEvent param0) {
        int var2_int = 0;
        int var3 = 0;
        try {
          if (um.field_c != null) {
            var2_int = param0.getKeyChar();
            if (0 != var2_int &&
              var2_int != 65535 &&
              am.a((char) var2_int, (byte) 91)) {
              var3 = f.field_c + 1 & 127;
              if (var3 != lp.field_j) {
                td.field_a[f.field_c] = -1;
                ta.field_pb[f.field_c] = (char)var2_int;
                f.field_c = var3;
              }
            }
          }
          param0.consume();
        } catch (RuntimeException runtimeException) {
          throw fa.a((Throwable) ((Object) runtimeException), "gb.keyTyped(" + (param0 != null ? "{...}" : "null") + ')');
        }
    }

    public final synchronized void keyPressed(java.awt.event.KeyEvent param0) {
        RuntimeException stackIn_27_0 = null;
        StringBuilder stackIn_27_1 = null;
        String stackIn_28_2 = null;
        RuntimeException decompiledCaughtException = null;
        int var2_int = 0;
        RuntimeException var2 = null;
        int var3 = 0;
        int var3Lifetime1;
        try {
          if (um.field_c == null) {
            return;
          }
          em.field_cb = 0;
          var2_int = param0.getKeyCode();
          if (0 <= var2_int &&
            ud.field_V.length > var2_int) {
            var2_int = ud.field_V[var2_int];
            if ((128 & var2_int) != 0) {
              var2_int = -1;
            }
          } else {
            var2_int = -1;
          }
          if (qf.field_f >= 0 &&
            0 <= var2_int) {
            ln.field_f[qf.field_f] = var2_int;
            qf.field_f = 127 & 1 + qf.field_f;
            if (fh.field_j == qf.field_f) {
              qf.field_f = -1;
            }
          }
          if (var2_int >= 0) {
            var3 = 127 & f.field_c + 1;
            if (var3 != lp.field_j) {
              td.field_a[f.field_c] = var2_int;
              ta.field_pb[f.field_c] = (char)0;
              f.field_c = var3;
            }
          }
          var3Lifetime1 = param0.getModifiers();
          if (0 != (var3Lifetime1 & 10)) {
            param0.consume();
            return;
          }
          if (var2_int == 85) {
            param0.consume();
            return;
          }
          if (var2_int != 10) {
            return;
          }
          param0.consume();
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2 = decompiledCaughtException;
          stackIn_27_0 = var2;
          stackIn_27_1 = new StringBuilder().append("gb.keyPressed(");
          if (param0 == null) {
            stackIn_28_2 = "null";
          } else {
            stackIn_28_2 = "{...}";
          }
          throw fa.a((Throwable) ((Object) stackIn_27_0), ((StringBuilder) (Object) stackIn_27_1).append(stackIn_28_2).append(')').toString());
        }
    }

    public final synchronized void keyReleased(java.awt.event.KeyEvent param0) {
        RuntimeException runtimeException = null;
        int var2_int = 0;
        RuntimeException stackIn_16_0 = null;
        StringBuilder stackIn_16_1 = null;
        String stackIn_17_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          if (null != um.field_c) {
            em.field_cb = 0;
            var2_int = param0.getKeyCode();
            if (var2_int >= 0 &&
              var2_int < ud.field_V.length) {
              var2_int = -129 & ud.field_V[var2_int];
            } else {
              var2_int = -1;
            }
            if (qf.field_f >= 0 &&
              var2_int >= 0) {
              ln.field_f[qf.field_f] = ~var2_int;
              qf.field_f = 1 + qf.field_f & 127;
              if (fh.field_j == qf.field_f) {
                qf.field_f = -1;
              }
            }
          }
          param0.consume();
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          runtimeException = decompiledCaughtException;
          stackIn_16_0 = runtimeException;
          stackIn_16_1 = new StringBuilder().append("gb.keyReleased(");
          if (param0 == null) {
            stackIn_17_2 = "null";
          } else {
            stackIn_17_2 = "{...}";
          }
          throw fa.a((Throwable) ((Object) stackIn_16_0), ((StringBuilder) (Object) stackIn_16_1).append(stackIn_17_2).append(')').toString());
        }
    }

    public static void b(int param0) {
        field_a = null;
        if (param0 > 96) {
          field_d = null;
          field_e = null;
          field_b = (byte[][][]) null;
          field_c = null;
          return;
        }
        field_c = (db) null;
        field_d = null;
        field_e = null;
        field_b = (byte[][][]) null;
        field_c = null;
    }

    final static void a(int param0, int param1, int param2, int param3, byte param4) {
        oo.f(param1, param0, param3, param2, 0, 96);
        int var5 = 3;
        oo.i(var5, var5, param1, param0, param3, param2);
        if (param4 == 122) {
          return;
        }
        field_b = (byte[][][]) null;
    }

    final static boolean a(int param0) {
        if (param0 != 250) {
          return true;
        }
        return f.field_a > 250 ? true : false;
    }

    public final synchronized void focusLost(java.awt.event.FocusEvent param0) {
        RuntimeException var2 = null;
        RuntimeException stackIn_6_0 = null;
        StringBuilder stackIn_6_1 = null;
        String stackIn_7_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          if (um.field_c == null) {
            return;
          }
          qf.field_f = -1;
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2 = decompiledCaughtException;
          stackIn_6_0 = var2;
          stackIn_6_1 = new StringBuilder().append("gb.focusLost(");
          if (param0 == null) {
            stackIn_7_2 = "null";
          } else {
            stackIn_7_2 = "{...}";
          }
          throw fa.a((Throwable) ((Object) stackIn_6_0), ((StringBuilder) (Object) stackIn_6_1).append(stackIn_7_2).append(')').toString());
        }
    }

    static {
        field_d = "No players";
        field_c = new db();
        field_e = new th();
    }
}
