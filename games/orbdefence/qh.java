/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class qh implements java.awt.event.KeyListener, java.awt.event.FocusListener {
    static hj[] field_d;
    static int field_a;
    static int[] field_c;
    static byte[][] field_b;

    public static void c(int param0) {
        field_d = null;
        field_b = (byte[][]) null;
        field_c = null;
        if (param0 < 9) {
          field_a = 6;
        }
    }

    public final synchronized void focusLost(java.awt.event.FocusEvent param0) {
        RuntimeException var2 = null;
        RuntimeException stackIn_6_0 = null;
        StringBuilder stackIn_6_1 = null;
        String stackIn_7_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          if (ad.field_b == null) {
            return;
          }
          wg.field_p = -1;
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
          throw dd.a((Throwable) ((Object) stackIn_6_0), ((StringBuilder) (Object) stackIn_6_1).append(stackIn_7_2).append(')').toString());
        }
    }

    public final synchronized void keyReleased(java.awt.event.KeyEvent param0) {
        RuntimeException runtimeException = null;
        int var2_int = 0;
        RuntimeException stackIn_15_0 = null;
        StringBuilder stackIn_15_1 = null;
        String stackIn_16_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          if (ad.field_b != null) {
            ji.field_c = 0;
            var2_int = param0.getKeyCode();
            if (var2_int >= 0 &&
              nd.field_a.length > var2_int) {
              var2_int = nd.field_a[var2_int] & -129;
            } else {
              var2_int = -1;
            }
            if (wg.field_p >= 0 &&
              var2_int >= 0) {
              gl.field_i[wg.field_p] = ~var2_int;
              wg.field_p = 1 + wg.field_p & 127;
              if (al.field_b == wg.field_p) {
                wg.field_p = -1;
              }
            }
          }
          param0.consume();
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          runtimeException = decompiledCaughtException;
          stackIn_15_0 = runtimeException;
          stackIn_15_1 = new StringBuilder().append("qh.keyReleased(");
          if (param0 == null) {
            stackIn_16_2 = "null";
          } else {
            stackIn_16_2 = "{...}";
          }
          throw dd.a((Throwable) ((Object) stackIn_15_0), ((StringBuilder) (Object) stackIn_15_1).append(stackIn_16_2).append(')').toString());
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
          if (null != ad.field_b) {
            ji.field_c = 0;
            var2_int = param0.getKeyCode();
            if (0 <= var2_int &&
              nd.field_a.length > var2_int) {
              var2_int = nd.field_a[var2_int];
              if ((var2_int & 128) != 0) {
                var2_int = -1;
              }
            } else {
              var2_int = -1;
            }
            if (wg.field_p >= 0 &&
              var2_int >= 0) {
              gl.field_i[wg.field_p] = var2_int;
              wg.field_p = wg.field_p + 1 & 127;
              if (al.field_b == wg.field_p) {
                wg.field_p = -1;
              }
            }
            if (var2_int >= 0) {
              var3 = 127 & 1 + uf.field_a;
              if (var3 != md.field_g) {
                g.field_g[uf.field_a] = var2_int;
                ll.field_b[uf.field_a] = (char)0;
                uf.field_a = var3;
              }
            }
            var3Lifetime1 = param0.getModifiers();
            if ((10 & var3Lifetime1) == 0 &&
              var2_int != 85 &&
              var2_int != 10) {
              return;
            }
            param0.consume();
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2 = decompiledCaughtException;
          stackIn_24_0 = var2;
          stackIn_24_1 = new StringBuilder().append("qh.keyPressed(");
          if (param0 == null) {
            stackIn_25_2 = "null";
          } else {
            stackIn_25_2 = "{...}";
          }
          throw dd.a((Throwable) ((Object) stackIn_24_0), ((StringBuilder) (Object) stackIn_24_1).append(stackIn_25_2).append(')').toString());
        }
    }

    final static String a(int param0) {
        if (qc.field_g == mg.field_m) {
          return sk.field_G;
        }
        if (!bd.field_u.a(false)) {
          return bd.field_u.a(-63);
        }
        int var1 = -5 % ((29 - param0) / 53);
        if (tg.field_c != mg.field_m) {
          return vh.field_k;
        }
        return bd.field_u.a(-118);
    }

    public final void keyTyped(java.awt.event.KeyEvent param0) {
        int var2_int = 0;
        int var3 = 0;
        try {
          if (ad.field_b != null) {
            var2_int = param0.getKeyChar();
            if (var2_int != 0 &&
              var2_int != 65535 &&
              oc.a((char) var2_int, 0)) {
              var3 = 127 & 1 + uf.field_a;
              if (var3 != md.field_g) {
                g.field_g[uf.field_a] = -1;
                ll.field_b[uf.field_a] = (char)var2_int;
                uf.field_a = var3;
              }
            }
          }
          param0.consume();
        } catch (RuntimeException runtimeException) {
          throw dd.a((Throwable) ((Object) runtimeException), "qh.keyTyped(" + (param0 != null ? "{...}" : "null") + ')');
        }
    }

    public final void focusGained(java.awt.event.FocusEvent param0) {
    }

    final static int[] b(int param0) {
        if (param0 != 8) {
          qh.a(122);
          return new int[8];
        }
        return new int[8];
    }

    static {
        field_c = new int[12];
        field_b = new byte[1000][];
        field_c[9] = 1;
        field_c[2] = 1;
        field_c[6] = 10;
        field_c[7] = 1;
        field_c[4] = 500;
        field_c[10] = 10;
        field_c[0] = 1;
        field_c[8] = 1;
        field_c[1] = 1;
        field_c[3] = 10;
        field_c[5] = 1;
        field_c[11] = 500;
    }
}
