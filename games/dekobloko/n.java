/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class n implements java.awt.event.KeyListener, java.awt.event.FocusListener {
    static int field_c;
    static String field_d;
    static String field_a;
    static String field_b;

    public static void b(int param0) {
        if (param0 == 128) {
          field_d = null;
          field_b = null;
          field_a = null;
          return;
        }
        field_d = (String) null;
        field_d = null;
        field_b = null;
        field_a = null;
    }

    final static void a(int param0, cc param1, mm param2, int param3, int param4, cc param5, int param6, mm param7, int param8, int param9, cc param10, int param11, int param12, int param13, int param14, int param15, int param16, int param17, int param18, int param19, int param20) {
        RuntimeException stackIn_4_0 = null;
        StringBuilder stackIn_4_1 = null;
        String stackIn_5_2 = null;
        StringBuilder stackIn_7_1 = null;
        String stackIn_8_2 = null;
        StringBuilder stackIn_10_1 = null;
        String stackIn_11_2 = null;
        StringBuilder stackIn_13_1 = null;
        String stackIn_14_2 = null;
        StringBuilder stackIn_16_1 = null;
        String stackIn_17_2 = null;
        RuntimeException decompiledCaughtException = null;
        int var21_int = 0;
        RuntimeException var21 = null;
        try {
          lk.a(param7, true, param2, param8);
          var21_int = 80 % ((param12 + 81) / 39);
          s.a(param6, param20, (byte) -91, param0, param16);
          pj.a(31004, param15, param14);
          ci.a(param10, param13, param4, (byte) -63, param11, param5);
          gk.a(param19, param18, (byte) -75, param1);
          wf.a(param17, param3, param9, true);
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var21 = decompiledCaughtException;
          stackIn_4_0 = var21;
          stackIn_4_1 = new StringBuilder().append("n.D(").append(param0).append(',');
          if (param1 == null) {
            stackIn_5_2 = "null";
          } else {
            stackIn_5_2 = "{...}";
          }
          stackIn_7_1 = ((StringBuilder) (Object) stackIn_4_1).append(stackIn_5_2).append(',');
          if (param2 == null) {
            stackIn_8_2 = "null";
          } else {
            stackIn_8_2 = "{...}";
          }
          stackIn_10_1 = ((StringBuilder) (Object) stackIn_7_1).append(stackIn_8_2).append(',').append(param3).append(',').append(param4).append(',');
          if (param5 == null) {
            stackIn_11_2 = "null";
          } else {
            stackIn_11_2 = "{...}";
          }
          stackIn_13_1 = ((StringBuilder) (Object) stackIn_10_1).append(stackIn_11_2).append(',').append(param6).append(',');
          if (param7 == null) {
            stackIn_14_2 = "null";
          } else {
            stackIn_14_2 = "{...}";
          }
          stackIn_16_1 = ((StringBuilder) (Object) stackIn_13_1).append(stackIn_14_2).append(',').append(param8).append(',').append(param9).append(',');
          if (param10 == null) {
            stackIn_17_2 = "null";
          } else {
            stackIn_17_2 = "{...}";
          }
          throw dh.a((Throwable) ((Object) stackIn_4_0), ((StringBuilder) (Object) stackIn_16_1).append(stackIn_17_2).append(',').append(param11).append(',').append(param12).append(',').append(param13).append(',').append(param14).append(',').append(param15).append(',').append(param16).append(',').append(param17).append(',').append(param18).append(',').append(param19).append(',').append(param20).append(')').toString());
        }
    }

    public final synchronized void keyPressed(java.awt.event.KeyEvent param0) {
        int var2_int = 0;
        RuntimeException stackIn_27_0 = null;
        StringBuilder stackIn_27_1 = null;
        String stackIn_28_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var2 = null;
        int var3 = 0;
        int var3Lifetime1;
        try {
          if (f.field_r == null) {
            return;
          }
          om.field_d = 0;
          var2_int = param0.getKeyCode();
          if (0 <= var2_int &&
            var2_int < be.field_w.length) {
            var2_int = be.field_w[var2_int];
            if ((128 & var2_int) != 0) {
              var2_int = -1;
            }
          } else {
            var2_int = -1;
          }
          if (wi.field_b >= 0 &&
            var2_int >= 0) {
            la.field_h[wi.field_b] = var2_int;
            wi.field_b = wi.field_b + 1 & 127;
            if (wi.field_b == rc.field_a) {
              wi.field_b = -1;
            }
          }
          if (var2_int >= 0) {
            var3 = jh.field_e + 1 & 127;
            if (var3 != sf.field_B) {
              pf.field_i[jh.field_e] = var2_int;
              bl.field_Z[jh.field_e] = (char)0;
              jh.field_e = var3;
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
          if (var2_int != 10) {
            return;
          }
          param0.consume();
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2 = decompiledCaughtException;
          stackIn_27_0 = var2;
          stackIn_27_1 = new StringBuilder().append("n.keyPressed(");
          if (param0 == null) {
            stackIn_28_2 = "null";
          } else {
            stackIn_28_2 = "{...}";
          }
          throw dh.a((Throwable) ((Object) stackIn_27_0), ((StringBuilder) (Object) stackIn_27_1).append(stackIn_28_2).append(')').toString());
        }
    }

    public final void focusGained(java.awt.event.FocusEvent param0) {
    }

    public final synchronized void focusLost(java.awt.event.FocusEvent param0) {
        try {
          if (null != f.field_r) {
            wi.field_b = -1;
          }
        } catch (RuntimeException runtimeException) {
          throw dh.a((Throwable) ((Object) runtimeException), "n.focusLost(" + (param0 != null ? "{...}" : "null") + ')');
        }
    }

    public final void keyTyped(java.awt.event.KeyEvent param0) {
        int var2_int = 0;
        int var3 = 0;
        try {
          if (f.field_r != null) {
            var2_int = param0.getKeyChar();
            if (var2_int != 0 && 65535 != var2_int &&
              he.a(-97, (char) var2_int)) {
              var3 = 1 + jh.field_e & 127;
              if (var3 != sf.field_B) {
                pf.field_i[jh.field_e] = -1;
                bl.field_Z[jh.field_e] = (char)var2_int;
                jh.field_e = var3;
              }
            }
          }
          param0.consume();
        } catch (RuntimeException runtimeException) {
          throw dh.a((Throwable) ((Object) runtimeException), "n.keyTyped(" + (param0 != null ? "{...}" : "null") + ')');
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
          if (f.field_r != null) {
            om.field_d = 0;
            var2_int = param0.getKeyCode();
            if (var2_int >= 0 &&
              var2_int < be.field_w.length) {
              var2_int = be.field_w[var2_int] & -129;
            } else {
              var2_int = -1;
            }
            if (wi.field_b >= 0 &&
              var2_int >= 0) {
              la.field_h[wi.field_b] = ~var2_int;
              wi.field_b = 127 & wi.field_b + 1;
              if (rc.field_a == wi.field_b) {
                wi.field_b = -1;
              }
            }
          }
          param0.consume();
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          runtimeException = decompiledCaughtException;
          stackIn_14_0 = runtimeException;
          stackIn_14_1 = new StringBuilder().append("n.keyReleased(");
          if (param0 == null) {
            stackIn_15_2 = "null";
          } else {
            stackIn_15_2 = "{...}";
          }
          throw dh.a((Throwable) ((Object) stackIn_14_0), ((StringBuilder) (Object) stackIn_14_1).append(stackIn_15_2).append(')').toString());
        }
    }

    final static int a(byte param0) {
        if (param0 != -74) {
          n.a((byte) -95);
          return (int)(1000000000L / ul.field_g);
        }
        return (int)(1000000000L / ul.field_g);
    }

    final static void a(int param0) {
        int var1;
        int var2;
        var2 = client.field_A ? 1 : 0;
        ed.field_d = null;
        if (param0 != 1) {
          return;
        }
        mg.field_Nb = false;
        if (vb.field_Z) {
          cl.field_r.o(4210752);
        } else {
          var1 = bb.field_e;
          if (0 < var1) {
            if (var1 == 1) {
              ed.field_d = aa.field_d;
            } else {
              ed.field_d = cm.$cfr$intArgs$a$53ce4ab4c593(87, jc.field_e, new String[]{Integer.toString(var1)});
            }
            ed.field_d = db.a(new CharSequence[]{(CharSequence) ((Object) ed.field_d), (CharSequence) ((Object) "<br>"), (CharSequence) ((Object) hf.field_b)}, -62);
          }
          cl.field_r.n(-127);
          em.a(-1199770620);
        }
    }

    final static int a(int param0, int param1, int param2) {
        int var3_int = 0;
        RuntimeException var3 = null;
        int var4 = 0;
        int stackIn_9_0 = 0;
        RuntimeException decompiledCaughtException = null;
        int var3_intLifetime1;
        var4 = client.field_A ? 1 : 0;
        try {
          if (param1 < param2) {
            var3_int = param1;
            param1 = param2;
            param2 = var3_int;
          }
          if (param0 < 37) {
            n.b(77);
          }
          while (param2 != 0) {
            var3_intLifetime1 = param1 % param2;
            param1 = param2;
            param2 = var3_intLifetime1;
          }
          stackIn_9_0 = param1;
          return stackIn_9_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3 = decompiledCaughtException;
          throw dh.a((Throwable) ((Object) var3), "n.E(" + param0 + ',' + param1 + ',' + param2 + ')');
        }
    }

    static {
        field_d = "Day";
        field_a = "Total: ";
    }
}
