/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class fo implements java.awt.event.KeyListener, java.awt.event.FocusListener {
    static String[] field_a;
    static int[][][] field_c;
    static String field_d;
    static int[] field_e;
    static int[] field_b;

    public final synchronized void keyPressed(java.awt.event.KeyEvent param0) {
        int var2_int = 0;
        int var3 = 0;
        RuntimeException stackIn_23_0 = null;
        StringBuilder stackIn_23_1 = null;
        String stackIn_24_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var2 = null;
        int var3Lifetime1;
        try {
          if (wn.field_a != null) {
            ti.field_e = 0;
            var2_int = param0.getKeyCode();
            if (var2_int >= 0 &&
              var2_int < el.field_H.length) {
              var2_int = el.field_H[var2_int];
              if ((var2_int & 128) != 0) {
                var2_int = -1;
              }
            } else {
              var2_int = -1;
            }
            if (qq.field_xb >= 0 &&
              var2_int >= 0) {
              field_b[qq.field_xb] = var2_int;
              qq.field_xb = 1 + qq.field_xb & 127;
              if (qq.field_xb == jq.field_g) {
                qq.field_xb = -1;
              }
            }
            if (0 <= var2_int) {
              var3 = op.field_h + 1 & 127;
              if (var3 != bl.field_s) {
                ee.field_b[op.field_h] = var2_int;
                ek.field_c[op.field_h] = (char)0;
                op.field_h = var3;
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
          stackIn_23_0 = var2;
          stackIn_23_1 = new StringBuilder().append("fo.keyPressed(");
          if (param0 == null) {
            stackIn_24_2 = "null";
          } else {
            stackIn_24_2 = "{...}";
          }
          throw wm.a((Throwable) ((Object) stackIn_23_0), ((StringBuilder) (Object) stackIn_23_1).append(stackIn_24_2).append(')').toString());
        }
    }

    final static void a(byte param0, boolean param1, java.awt.Canvas param2) {
        int var4 = 0;
        RuntimeException stackIn_16_0 = null;
        StringBuilder stackIn_16_1 = null;
        String stackIn_17_2 = null;
        RuntimeException decompiledCaughtException = null;
        int var3_int = 0;
        RuntimeException var3 = null;
        var4 = Pool.field_O;
        try {
          if (sf.field_y < 10) {
            var3_int = 0;
            if (he.field_c) {
              he.field_c = false;
              var3_int = 1;
            }
            vc.a(var3_int != 0, 30, df.a((byte) 84), cm.field_H, tj.i(19535));
          } else {
            if (u.a(108)) {
              if (fk.field_ab == 0) {
                di.a(param1, (byte) 109, false);
                fe.a(0, 0, (byte) -65, param2);
              } else {
                vc.a(true, param2);
              }
            } else {
              qh.d();
              er.a(240, false, 320);
              fe.a(0, 0, (byte) -89, param2);
            }
          }
          if (param0 != -55) {
            field_d = (String) null;
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3 = decompiledCaughtException;
          stackIn_16_0 = var3;
          stackIn_16_1 = new StringBuilder().append("fo.B(").append(param0).append(',').append(param1).append(',');
          if (param2 == null) {
            stackIn_17_2 = "null";
          } else {
            stackIn_17_2 = "{...}";
          }
          throw wm.a((Throwable) ((Object) stackIn_16_0), ((StringBuilder) (Object) stackIn_16_1).append(stackIn_17_2).append(')').toString());
        }
    }

    public static void a(int param0) {
        field_a = null;
        if (param0 != -1) {
          return;
        }
        field_d = null;
        field_b = null;
        field_c = (int[][][]) null;
        field_e = null;
    }

    public final void focusGained(java.awt.event.FocusEvent param0) {
    }

    public final void keyTyped(java.awt.event.KeyEvent param0) {
        int var2_int = 0;
        int var3 = 0;
        try {
          if (null != wn.field_a) {
            var2_int = param0.getKeyChar();
            if (var2_int != 0 && 65535 != var2_int &&
              kn.a((byte) 112, (char) var2_int)) {
              var3 = 1 + op.field_h & 127;
              if (bl.field_s != var3) {
                ee.field_b[op.field_h] = -1;
                ek.field_c[op.field_h] = (char)var2_int;
                op.field_h = var3;
              }
            }
          }
          param0.consume();
        } catch (RuntimeException runtimeException) {
          throw wm.a((Throwable) ((Object) runtimeException), "fo.keyTyped(" + (param0 != null ? "{...}" : "null") + ')');
        }
    }

    public final synchronized void keyReleased(java.awt.event.KeyEvent param0) {
        RuntimeException runtimeException = null;
        int var2_int = 0;
        RuntimeException stackIn_14_0 = null;
        StringBuilder stackIn_14_1 = null;
        String stackIn_15_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          if (null != wn.field_a) {
            ti.field_e = 0;
            var2_int = param0.getKeyCode();
            if (var2_int >= 0 &&
              el.field_H.length > var2_int) {
              var2_int = el.field_H[var2_int] & -129;
            } else {
              var2_int = -1;
            }
            if (qq.field_xb >= 0 &&
              var2_int >= 0) {
              field_b[qq.field_xb] = ~var2_int;
              qq.field_xb = 127 & 1 + qq.field_xb;
              if (qq.field_xb == jq.field_g) {
                qq.field_xb = -1;
              }
            }
          }
          param0.consume();
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          runtimeException = decompiledCaughtException;
          stackIn_14_0 = runtimeException;
          stackIn_14_1 = new StringBuilder().append("fo.keyReleased(");
          if (param0 == null) {
            stackIn_15_2 = "null";
          } else {
            stackIn_15_2 = "{...}";
          }
          throw wm.a((Throwable) ((Object) stackIn_14_0), ((StringBuilder) (Object) stackIn_14_1).append(stackIn_15_2).append(')').toString());
        }
    }

    final static qb a(byte param0) {
        int var2 = 77 % ((20 - param0) / 41);
        qb var1 = new qb(vd.field_c, tq.field_r, el.field_I[0], ih.field_d[0], pd.field_a[0], rc.field_f[0], v.field_b[0], ma.field_h);
        sh.h(-1);
        return var1;
    }

    final static void a(String param0, float param1, boolean param2) {
        try {
          if (param2) {
            fo.a((String) null, 0.6310321688652039f, false);
          }
          am.field_n = param0;
          kk.field_w = param1;
        } catch (RuntimeException runtimeException) {
          throw wm.a((Throwable) ((Object) runtimeException), "fo.D(" + (param0 != null ? "{...}" : "null") + ',' + param1 + ',' + param2 + ')');
        }
    }

    public final synchronized void focusLost(java.awt.event.FocusEvent param0) {
        try {
          if (wn.field_a != null) {
            qq.field_xb = -1;
          }
        } catch (RuntimeException runtimeException) {
          throw wm.a((Throwable) ((Object) runtimeException), "fo.focusLost(" + (param0 != null ? "{...}" : "null") + ')');
        }
    }

    static {
        int var1 = 0;
        int var2 = 0;
        int var0;
        field_d = "Find opponent";
        field_e = new int[256];
        field_b = new int[128];
        for (var1 = 0; var1 < 256; var1++) {
          var0 = var1;
          for (var2 = 0; var2 < 8; var2++) {
            if ((1 & var0) == 1) {
              var0 = -306674912 ^ var0 >>> 1;
            } else {
              var0 = var0 >>> 1;
            }
          }
          field_e[var1] = var0;
        }
    }
}
