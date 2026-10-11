/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class vf implements java.awt.event.KeyListener, java.awt.event.FocusListener {
    static dl[] field_b;
    static long field_d;
    static int[] field_e;
    static int[] field_a;
    static int field_c;

    public final void keyTyped(java.awt.event.KeyEvent param0) {
        int var2_int = 0;
        int var3 = 0;
        try {
          if (null != uf.field_c) {
            var2_int = param0.getKeyChar();
            if (var2_int != 0 &&
              65535 != var2_int &&
              pn.a(true, (char) var2_int)) {
              var3 = 127 & ei.field_A + 1;
              if (var3 != td.field_d) {
                re.field_o[ei.field_A] = -1;
                tp.field_i[ei.field_A] = (char)var2_int;
                ei.field_A = var3;
              }
            }
          }
          param0.consume();
        } catch (RuntimeException runtimeException) {
          throw dn.a((Throwable) ((Object) runtimeException), "vf.keyTyped(" + (param0 != null ? "{...}" : "null") + ')');
        }
    }

    public final synchronized void focusLost(java.awt.event.FocusEvent param0) {
        try {
          if (uf.field_c != null) {
            bo.field_n = -1;
          }
        } catch (RuntimeException runtimeException) {
          throw dn.a((Throwable) ((Object) runtimeException), "vf.focusLost(" + (param0 != null ? "{...}" : "null") + ')');
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
          if (null != uf.field_c) {
            jf.field_a = 0;
            var2_int = param0.getKeyCode();
            if (var2_int >= 0 &&
              rg.field_a.length > var2_int) {
              var2_int = rg.field_a[var2_int] & -129;
            } else {
              var2_int = -1;
            }
            if (bo.field_n >= 0 &&
              0 <= var2_int) {
              pl.field_n[bo.field_n] = ~var2_int;
              bo.field_n = 127 & bo.field_n + 1;
              if (bo.field_n == ud.field_Z) {
                bo.field_n = -1;
              }
            }
          }
          param0.consume();
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2 = decompiledCaughtException;
          stackIn_16_0 = var2;
          stackIn_16_1 = new StringBuilder().append("vf.keyReleased(");
          if (param0 == null) {
            stackIn_17_2 = "null";
          } else {
            stackIn_17_2 = "{...}";
          }
          throw dn.a((Throwable) ((Object) stackIn_16_0), ((StringBuilder) (Object) stackIn_16_1).append(stackIn_17_2).append(')').toString());
        }
    }

    final static void a(int param0) {
        Object var1 = null;
        Throwable var2 = null;
        Throwable decompiledCaughtException = null;
        if (uf.field_c != null) {
          var1 = uf.field_c;
          synchronized (var1) {
            uf.field_c = null;
          }
        }
        if (param0 != -1) {
          vf.a((byte) -2);
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
          if (uf.field_c == null) {
            return;
          }
          jf.field_a = 0;
          var2_int = param0.getKeyCode();
          if (var2_int >= 0 &&
            rg.field_a.length > var2_int) {
            var2_int = rg.field_a[var2_int];
            if ((var2_int & 128) != 0) {
              var2_int = -1;
            }
          } else {
            var2_int = -1;
          }
          if (0 <= bo.field_n &&
            var2_int >= 0) {
            pl.field_n[bo.field_n] = var2_int;
            bo.field_n = 127 & bo.field_n + 1;
            if (ud.field_Z == bo.field_n) {
              bo.field_n = -1;
            }
          }
          if (var2_int >= 0) {
            var3 = ei.field_A + 1 & 127;
            if (var3 != td.field_d) {
              re.field_o[ei.field_A] = var2_int;
              tp.field_i[ei.field_A] = (char)0;
              ei.field_A = var3;
            }
          }
          var3Lifetime1 = param0.getModifiers();
          if ((var3Lifetime1 & 10) == 0 &&
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
          stackIn_25_1 = new StringBuilder().append("vf.keyPressed(");
          if (param0 == null) {
            stackIn_26_2 = "null";
          } else {
            stackIn_26_2 = "{...}";
          }
          throw dn.a((Throwable) ((Object) stackIn_25_0), ((StringBuilder) (Object) stackIn_25_1).append(stackIn_26_2).append(')').toString());
        }
    }

    final static void a(int param0, byte param1, int param2, int param3) {
        mc.field_s = param3;
        if (param1 <= 113) {
          return;
        }
        jn.field_i = param2;
        ao.field_e = param0;
    }

    public static void a(byte param0) {
        field_e = null;
        if (param0 != -117) {
          vf.a(-34);
          field_a = null;
          field_b = null;
          return;
        }
        field_a = null;
        field_b = null;
    }

    public final void focusGained(java.awt.event.FocusEvent param0) {
    }

    static {
        field_c = 70;
        field_a = new int[]{0, 12, 24, 36, 0, 12, 24, 36, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0};
        field_e = new int[8192];
    }
}
