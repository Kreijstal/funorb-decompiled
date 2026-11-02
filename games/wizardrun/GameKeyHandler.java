/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class GameKeyHandler implements java.awt.event.KeyListener, java.awt.event.FocusListener {
    static int field_b;
    static String field_a;
    static int field_c;
    static String field_d;

    public final synchronized void focusLost(java.awt.event.FocusEvent param0) {
        RuntimeException var2 = null;
        RuntimeException stackIn_6_0 = null;
        StringBuilder stackIn_6_1 = null;
        String stackIn_7_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          if (ff.keyHandler == null) {
            return;
          }
          wk.keyEventWriteIndex = -1;
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2 = decompiledCaughtException;
          stackIn_6_0 = var2;
          stackIn_6_1 = new StringBuilder().append("oj.focusLost(");
          if (param0 == null) {
            stackIn_7_2 = "null";
          } else {
            stackIn_7_2 = "{...}";
          }
          throw bd.a((Throwable) ((Object) stackIn_6_0), ((StringBuilder) (Object) stackIn_6_1).append(stackIn_7_2).append(')').toString());
        }
    }

    public final void keyTyped(java.awt.event.KeyEvent param0) {
        int var2_int = 0;
        int var3 = 0;
        try {
          if (ff.keyHandler != null) {
            var2_int = param0.getKeyChar();
            if (var2_int != 0 &&
              var2_int != 65535 &&
              ne.a((char) var2_int, 160)) {
              var3 = qh.keyQueueWriteIndex + 1 & 127;
              if (tg.keyQueueReadIndex != var3) {
                ge.keyCodeQueue[qh.keyQueueWriteIndex] = -1;
                ve.typedCharQueue[qh.keyQueueWriteIndex] = (char)var2_int;
                qh.keyQueueWriteIndex = var3;
              }
            }
          }
          param0.consume();
        } catch (RuntimeException runtimeException) {
          throw bd.a((Throwable) ((Object) runtimeException), "oj.keyTyped(" + (param0 != null ? "{...}" : "null") + ')');
        }
    }

    public static void a(byte param0) {
        field_d = null;
        field_a = null;
        if (param0 < 86) {
          field_a = (String) null;
        }
    }

    final static void a(int param0, vf param1, int param2) {
        mg var3 = null;
        try {
          if (param2 >= -9) {
            field_a = (String) null;
          }
          var3 = n.field_b;
          var3.c((byte) -127, param0);
          var3.b((byte) 11, param1.field_k);
          var3.b(-1947079288, param1.field_i);
        } catch (RuntimeException runtimeException) {
          throw bd.a((Throwable) ((Object) runtimeException), "oj.A(" + param0 + ',' + (param1 != null ? "{...}" : "null") + ',' + param2 + ')');
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
          if (null != ff.keyHandler) {
            h.keyIdleTime = 0;
            var2_int = param0.getKeyCode();
            if (var2_int >= 0 &&
              var2_int < he.field_s.length) {
              var2_int = he.field_s[var2_int] & -129;
            } else {
              var2_int = -1;
            }
            if (wk.keyEventWriteIndex >= 0 &&
              var2_int >= 0) {
              wd.keyEventQueue[wk.keyEventWriteIndex] = ~var2_int;
              wk.keyEventWriteIndex = 127 & wk.keyEventWriteIndex + 1;
              if (wk.keyEventWriteIndex == lk.keyEventReadIndex) {
                wk.keyEventWriteIndex = -1;
              }
            }
          }
          param0.consume();
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2 = decompiledCaughtException;
          stackIn_16_0 = var2;
          stackIn_16_1 = new StringBuilder().append("oj.keyReleased(");
          if (param0 == null) {
            stackIn_17_2 = "null";
          } else {
            stackIn_17_2 = "{...}";
          }
          throw bd.a((Throwable) ((Object) stackIn_16_0), ((StringBuilder) (Object) stackIn_16_1).append(stackIn_17_2).append(')').toString());
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
          if (ff.keyHandler == null) {
            return;
          }
          h.keyIdleTime = 0;
          var2_int = param0.getKeyCode();
          if (var2_int >= 0 &&
            var2_int < he.field_s.length) {
            var2_int = he.field_s[var2_int];
            if ((var2_int & 128) != 0) {
              var2_int = -1;
            }
          } else {
            var2_int = -1;
          }
          if (wk.keyEventWriteIndex >= 0 &&
            var2_int >= 0) {
            wd.keyEventQueue[wk.keyEventWriteIndex] = var2_int;
            wk.keyEventWriteIndex = 1 + wk.keyEventWriteIndex & 127;
            if (lk.keyEventReadIndex == wk.keyEventWriteIndex) {
              wk.keyEventWriteIndex = -1;
            }
          }
          if (var2_int >= 0) {
            var3 = 127 & qh.keyQueueWriteIndex + 1;
            if (var3 != tg.keyQueueReadIndex) {
              ge.keyCodeQueue[qh.keyQueueWriteIndex] = var2_int;
              ve.typedCharQueue[qh.keyQueueWriteIndex] = (char)0;
              qh.keyQueueWriteIndex = var3;
            }
          }
          var3Lifetime1 = param0.getModifiers();
          if ((10 & var3Lifetime1) == 0 &&
            var2_int != 85 &&
            var2_int != 10) {
            return;
          }
          param0.consume();
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2 = decompiledCaughtException;
          stackIn_25_0 = var2;
          stackIn_25_1 = new StringBuilder().append("oj.keyPressed(");
          if (param0 == null) {
            stackIn_26_2 = "null";
          } else {
            stackIn_26_2 = "{...}";
          }
          throw bd.a((Throwable) ((Object) stackIn_25_0), ((StringBuilder) (Object) stackIn_25_1).append(stackIn_26_2).append(')').toString());
        }
    }

    public final void focusGained(java.awt.event.FocusEvent param0) {
    }

    static {
        field_a = "Level only availiable to members";
        field_d = "Name is available";
    }
}
