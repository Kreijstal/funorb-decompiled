/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class gi implements java.awt.event.KeyListener, java.awt.event.FocusListener {
    static String field_b;
    static int field_c;
    static ea field_a;

    public final synchronized void keyReleased(java.awt.event.KeyEvent param0) {
        int var2_int = 0;
        RuntimeException stackIn_16_0 = null;
        StringBuilder stackIn_16_1 = null;
        String stackIn_17_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var2 = null;
        try {
          if (di.field_O != null) {
            hb.field_b = 0;
            var2_int = param0.getKeyCode();
            if (0 <= var2_int &&
              d.field_d.length > var2_int) {
              var2_int = d.field_d[var2_int] & -129;
            } else {
              var2_int = -1;
            }
            if (cg.field_H >= 0 &&
              var2_int >= 0) {
              ib.field_b[cg.field_H] = ~var2_int;
              cg.field_H = 127 & 1 + cg.field_H;
              if (dm.field_b == cg.field_H) {
                cg.field_H = -1;
              }
            }
          }
          param0.consume();
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2 = decompiledCaughtException;
          stackIn_16_0 = var2;
          stackIn_16_1 = new StringBuilder().append("gi.keyReleased(");
          if (param0 == null) {
            stackIn_17_2 = "null";
          } else {
            stackIn_17_2 = "{...}";
          }
          throw lj.a((Throwable) ((Object) stackIn_16_0), ((StringBuilder) (Object) stackIn_16_1).append(stackIn_17_2).append(')').toString());
        }
    }

    final static void a(int param0, int param1) {
        pi var2 = null;
        int var3 = 0;
        hf var4 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var2_ref = null;
        var3 = MinerDisturbance.field_ab;
        try {
          var4 = (hf) (kk.field_a.b(96));
          while (var4 != null) {
            ag.a(var4, param1, param0 - 195);
            var4 = (hf) (kk.field_a.b((byte) 56));
          }
          if (param0 != 85) {
            gi.a(-40, 0);
          }
          var2 = ag.field_b.b(param0 - 8);
          while (var2 != null) {
            ca.a(param1, 1);
            var2 = ag.field_b.b((byte) 56);
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2_ref = decompiledCaughtException;
          throw lj.a((Throwable) ((Object) var2_ref), "gi.B(" + param0 + ',' + param1 + ')');
        }
    }

    public static void a(int param0) {
        field_a = null;
        if (param0 != 0) {
          return;
        }
        field_b = null;
    }

    public final synchronized void focusLost(java.awt.event.FocusEvent param0) {
        try {
          if (null != di.field_O) {
            cg.field_H = -1;
          }
        } catch (RuntimeException runtimeException) {
          throw lj.a((Throwable) ((Object) runtimeException), "gi.focusLost(" + (param0 != null ? "{...}" : "null") + ')');
        }
    }

    public final void focusGained(java.awt.event.FocusEvent param0) {
    }

    public final void keyTyped(java.awt.event.KeyEvent param0) {
        int var2_int = 0;
        int var3 = 0;
        try {
          if (null != di.field_O) {
            var2_int = param0.getKeyChar();
            if (0 != var2_int && var2_int != 65535 &&
              bn.a(93, (char) var2_int)) {
              var3 = 127 & 1 + qf.field_n;
              if (var3 != dn.field_w) {
                jk.field_ib[qf.field_n] = -1;
                hj.field_n[qf.field_n] = (char)var2_int;
                qf.field_n = var3;
              }
            }
          }
          param0.consume();
        } catch (RuntimeException runtimeException) {
          throw lj.a((Throwable) ((Object) runtimeException), "gi.keyTyped(" + (param0 != null ? "{...}" : "null") + ')');
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
          if (null == di.field_O) {
            return;
          }
          hb.field_b = 0;
          var2_int = param0.getKeyCode();
          if (var2_int >= 0 &&
            d.field_d.length > var2_int) {
            var2_int = d.field_d[var2_int];
            if ((128 & var2_int) != 0) {
              var2_int = -1;
            }
          } else {
            var2_int = -1;
          }
          if (0 <= cg.field_H &&
            var2_int >= 0) {
            ib.field_b[cg.field_H] = var2_int;
            cg.field_H = 127 & cg.field_H + 1;
            if (cg.field_H == dm.field_b) {
              cg.field_H = -1;
            }
          }
          if (0 <= var2_int) {
            var3 = qf.field_n + 1 & 127;
            if (var3 != dn.field_w) {
              jk.field_ib[qf.field_n] = var2_int;
              hj.field_n[qf.field_n] = (char)0;
              qf.field_n = var3;
            }
          }
          var3Lifetime1 = param0.getModifiers();
          if (0 == (10 & var3Lifetime1) &&
            var2_int != 85 &&
            var2_int != 10) {
            return;
          }
          param0.consume();
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2 = decompiledCaughtException;
          stackIn_24_0 = var2;
          stackIn_24_1 = new StringBuilder().append("gi.keyPressed(");
          if (param0 == null) {
            stackIn_25_2 = "null";
          } else {
            stackIn_25_2 = "{...}";
          }
          throw lj.a((Throwable) ((Object) stackIn_24_0), ((StringBuilder) (Object) stackIn_24_1).append(stackIn_25_2).append(')').toString());
        }
    }

    static {
        field_b = "2x multiplier: Doubles all points. Combines with 3x muliplier to make a 6x multiplier!";
    }
}
