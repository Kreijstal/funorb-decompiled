/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class vf implements java.awt.event.MouseListener, java.awt.event.MouseMotionListener, java.awt.event.FocusListener {
    static int[] field_b;
    static int field_d;
    static String field_c;
    static volatile int field_a;

    public final synchronized void mouseExited(java.awt.event.MouseEvent param0) {
        try {
          if (te.field_b != null) {
            sj.field_L = 0;
            bj.field_c = -1;
            qb.field_g = -1;
            ua.field_c = true;
          }
        } catch (RuntimeException runtimeException) {
          throw oj.a((Throwable) ((Object) runtimeException), "vf.mouseExited(" + (param0 != null ? "{...}" : "null") + ')');
        }
    }

    public final void focusGained(java.awt.event.FocusEvent param0) {
    }

    public final void mouseClicked(java.awt.event.MouseEvent param0) {
        try {
          if (param0.isPopupTrigger()) {
            param0.consume();
          }
        } catch (RuntimeException runtimeException) {
          throw oj.a((Throwable) ((Object) runtimeException), "vf.mouseClicked(" + (param0 != null ? "{...}" : "null") + ')');
        }
    }

    public final synchronized void focusLost(java.awt.event.FocusEvent param0) {
        try {
          if (null != te.field_b) {
            jc.field_h = 0;
          }
        } catch (RuntimeException runtimeException) {
          throw oj.a((Throwable) ((Object) runtimeException), "vf.focusLost(" + (param0 != null ? "{...}" : "null") + ')');
        }
    }

    public final synchronized void mouseDragged(java.awt.event.MouseEvent param0) {
        RuntimeException stackIn_6_0 = null;
        StringBuilder stackIn_6_1 = null;
        String stackIn_7_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var2 = null;
        try {
          if (te.field_b != null) {
            sj.field_L = 0;
            bj.field_c = param0.getX();
            qb.field_g = param0.getY();
            ua.field_c = true;
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2 = decompiledCaughtException;
          stackIn_6_0 = var2;
          stackIn_6_1 = new StringBuilder().append("vf.mouseDragged(");
          if (param0 == null) {
            stackIn_7_2 = "null";
          } else {
            stackIn_7_2 = "{...}";
          }
          throw oj.a((Throwable) ((Object) stackIn_6_0), ((StringBuilder) (Object) stackIn_6_1).append(stackIn_7_2).append(')').toString());
        }
    }

    public final synchronized void mouseEntered(java.awt.event.MouseEvent param0) {
        RuntimeException stackIn_6_0 = null;
        StringBuilder stackIn_6_1 = null;
        String stackIn_7_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var2 = null;
        try {
          if (te.field_b != null) {
            sj.field_L = 0;
            bj.field_c = param0.getX();
            qb.field_g = param0.getY();
            ua.field_c = true;
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2 = decompiledCaughtException;
          stackIn_6_0 = var2;
          stackIn_6_1 = new StringBuilder().append("vf.mouseEntered(");
          if (param0 == null) {
            stackIn_7_2 = "null";
          } else {
            stackIn_7_2 = "{...}";
          }
          throw oj.a((Throwable) ((Object) stackIn_6_0), ((StringBuilder) (Object) stackIn_6_1).append(stackIn_7_2).append(')').toString());
        }
    }

    final static String a(int param0, long param1) {
        long var8 = 0L;
        int var10 = 0;
        int var11 = 0;
        StringBuilder discarded$0 = null;
        int var12 = TorChallenge.field_F ? 1 : 0;
        if (param1 <= 0L) {
          return null;
        }
        if (6582952005840035281L <= param1) {
          return null;
        }
        if (0L == param1 % 37L) {
          return null;
        }
        int var3 = 0;
        long var4 = param1;
        int var6 = -13 % ((param0 + 43) / 44);
        while (var4 != 0L) {
          var4 = var4 / 37L;
          var3++;
        }
        StringBuilder var7 = new StringBuilder(var3);
        while (param1 != 0L) {
          var8 = param1;
          param1 = param1 / 37L;
          var10 = rj.field_h[(int)(-(37L * param1) + var8)];
          if (95 == var10) {
            var11 = -1 + var7.length();
            var7.setCharAt(var11, Character.toUpperCase(var7.charAt(var11)));
            var10 = 160;
          }
          discarded$0 = var7.append((char) var10);
        }
        var7.reverse();
        var7.setCharAt(0, Character.toUpperCase(var7.charAt(0)));
        return var7.toString();
    }

    final static void b(byte param0) {
        int var6 = 0;
        int var9 = 0;
        RuntimeException decompiledCaughtException = null;
        int var1_int = 0;
        RuntimeException var1 = null;
        int var2 = 0;
        int var3 = 0;
        int var4 = 0;
        int var5 = 0;
        int var7 = 0;
        int var8 = 0;
        int var10 = 0;
        int var2Lifetime1;
        int var2Lifetime2;
        int var8Lifetime1;
        int var8Lifetime2;
        int var2Lifetime3;
        var10 = TorChallenge.field_F ? 1 : 0;
        try {
          var3 = 5;
          var7 = -111 / ((24 - param0) / 59);
          for (var6 = 0; var6 < 3; var6++) {
            var1_int = ii.field_f[var6][0];
            for (var8 = 1 + var1_int; var8 < 6; var8++) {
              var2 = 0;
              var2 = 1 << var8 | var2;
              if ((var2 & k.field_b[var6]) > 0) {
                k.field_b[var6] = TorChallenge.a(var2, k.field_b[var6]);
              }
              for (var9 = 0; var3 > var9; var9++) {
                var2Lifetime3 = 0;
                var2Lifetime3 = 1 << var9 | var2Lifetime3;
                if ((var2Lifetime3 & pi.field_d[var6][var8]) > 0) {
                  pi.field_d[var6][var8] = TorChallenge.a(var2Lifetime3, pi.field_d[var6][var8]);
                }
              }
            }
            for (var8Lifetime1 = 0; 3 > var8Lifetime1; var8Lifetime1++) {
              var4 = (var8Lifetime1 + 1) * 2 - 1;
              if (var4 > var1_int) {
                var2Lifetime1 = 0;
                var2Lifetime1 = var2Lifetime1 | 1 << var8Lifetime1;
                if ((hk.field_c[var6] & var2Lifetime1) > 0) {
                  hk.field_c[var6] = TorChallenge.a(var2Lifetime1, hk.field_c[var6]);
                }
              }
            }
            for (var8Lifetime2 = 0; var8Lifetime2 < 3; var8Lifetime2++) {
              var5 = il.field_o[var8Lifetime2];
              if (var5 > var1_int) {
                var5 = var5 - 1;
                var2Lifetime2 = 0;
                var2Lifetime2 = 1 << var5 | var2Lifetime2;
                if ((hd.field_c[var6] & var2Lifetime2) > 0) {
                  hd.field_c[var6] = TorChallenge.a(hd.field_c[var6], var2Lifetime2);
                }
              }
            }
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var1 = decompiledCaughtException;
          throw oj.a((Throwable) ((Object) var1), "vf.A(" + param0 + ')');
        }
    }

    public static void a(byte param0) {
        field_c = null;
        field_b = null;
        int var1 = -57 % ((param0 - 40) / 37);
    }

    public final synchronized void mouseMoved(java.awt.event.MouseEvent param0) {
        try {
          if (null != te.field_b) {
            sj.field_L = 0;
            bj.field_c = param0.getX();
            qb.field_g = param0.getY();
            ua.field_c = true;
          }
        } catch (RuntimeException runtimeException) {
          throw oj.a((Throwable) ((Object) runtimeException), "vf.mouseMoved(" + (param0 != null ? "{...}" : "null") + ')');
        }
    }

    public final synchronized void mousePressed(java.awt.event.MouseEvent param0) {
        int var2_int = 0;
        RuntimeException stackIn_13_0 = null;
        StringBuilder stackIn_13_1 = null;
        String stackIn_14_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var2 = null;
        try {
          if (te.field_b != null) {
            sj.field_L = 0;
            aa.field_a = param0.getX();
            ll.field_g = param0.getY();
            ol.a(256);
            if (!javax.swing.SwingUtilities.isRightMouseButton(param0)) {
              e.field_o = 1;
              jc.field_h = 1;
            } else {
              e.field_o = 2;
              jc.field_h = 2;
            }
            var2_int = param0.getModifiers();
            if ((8 & var2_int) != 0) {
            }
            ua.field_c = true;
            if (0 == (4 & var2_int)) {
            }
            if ((var2_int & 16) == 0) {
            }
          }
          if (param0.isPopupTrigger()) {
            param0.consume();
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2 = decompiledCaughtException;
          stackIn_13_0 = var2;
          stackIn_13_1 = new StringBuilder().append("vf.mousePressed(");
          if (param0 == null) {
            stackIn_14_2 = "null";
          } else {
            stackIn_14_2 = "{...}";
          }
          throw oj.a((Throwable) ((Object) stackIn_13_0), ((StringBuilder) (Object) stackIn_13_1).append(stackIn_14_2).append(')').toString());
        }
    }

    public final synchronized void mouseReleased(java.awt.event.MouseEvent param0) {
        int var2_int = 0;
        RuntimeException stackIn_11_0 = null;
        StringBuilder stackIn_11_1 = null;
        String stackIn_12_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var2 = null;
        try {
          if (null != te.field_b) {
            sj.field_L = 0;
            jc.field_h = 0;
            ua.field_c = true;
            var2_int = param0.getModifiers();
            if ((var2_int & 8) == 0) {
            }
            if ((16 & var2_int) == 0) {
            }
            if ((4 & var2_int) == 0) {
            }
          }
          if (param0.isPopupTrigger()) {
            param0.consume();
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2 = decompiledCaughtException;
          stackIn_11_0 = var2;
          stackIn_11_1 = new StringBuilder().append("vf.mouseReleased(");
          if (param0 == null) {
            stackIn_12_2 = "null";
          } else {
            stackIn_12_2 = "{...}";
          }
          throw oj.a((Throwable) ((Object) stackIn_11_0), ((StringBuilder) (Object) stackIn_11_1).append(stackIn_12_2).append(')').toString());
        }
    }

    final static byte[] a(int param0, String param1) {
        RuntimeException var2 = null;
        byte[] stackIn_3_0 = null;
        RuntimeException stackIn_6_0 = null;
        StringBuilder stackIn_6_1 = null;
        String stackIn_7_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          if (param0 != 95) {
            field_b = (int[]) null;
          }
          stackIn_3_0 = dj.field_cb.a(-2, param1, "");
          return stackIn_3_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2 = decompiledCaughtException;
          stackIn_6_0 = var2;
          stackIn_6_1 = new StringBuilder().append("vf.C(").append(param0).append(',');
          if (param1 == null) {
            stackIn_7_2 = "null";
          } else {
            stackIn_7_2 = "{...}";
          }
          throw oj.a((Throwable) ((Object) stackIn_6_0), ((StringBuilder) (Object) stackIn_6_1).append(stackIn_7_2).append(')').toString());
        }
    }

    static {
        field_c = "No highscores";
        field_b = new int[1024];
        field_a = 0;
    }
}
