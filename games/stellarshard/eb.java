/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class eb implements java.awt.event.KeyListener, java.awt.event.FocusListener {
    static int[] field_b;
    private static int[] field_c;
    static String field_d;
    static int field_a;

    public static void a(int param0) {
        field_c = null;
        field_d = null;
        field_b = null;
        if (param0 != -1) {
          field_c = (int[]) null;
        }
    }

    final static int a(int param0, int param1, int param2) {
        int var3_int = 0;
        RuntimeException var3 = null;
        int var4 = 0;
        int var5 = 0;
        int var6 = 0;
        int var7 = 0;
        int var8 = 0;
        int stackIn_3_0 = 0;
        int stackIn_10_0 = 0;
        int stackIn_15_0 = 0;
        RuntimeException decompiledCaughtException = null;
        var8 = stellarshard.field_B;
        try {
          var3_int = 0;
          if (param2 >= -80) {
            stackIn_3_0 = 103;
            return stackIn_3_0;
          }
          var4 = rg.field_F;
          while (var3_int < stellarshard.field_L.length) {
            var5 = sj.field_J[var3_int];
            if (var5 < 0) {
              var4 = var4 + l.field_e;
            } else {
              var6 = qe.$cfr$intArgs$a$590e95718a07(-103, stellarshard.field_L[var3_int], true);
              var4 = var4 + nh.field_f;
              var7 = s.field_b - (var6 >> 1);
              if (ma.a(param0, var7 - le.field_k, var4, (byte) -86, na.field_a + (nh.field_h << 1), param1, var6 + (le.field_k << 1))) {
                stackIn_10_0 = var5;
                return stackIn_10_0;
              }
              var4 = var4 + (na.field_a + ((nh.field_h << 1) + nh.field_f));
            }
            var3_int++;
          }
          stackIn_15_0 = -1;
          return stackIn_15_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3 = decompiledCaughtException;
          throw ma.a((Throwable) ((Object) var3), "eb.B(" + param0 + ',' + param1 + ',' + param2 + ')');
        }
    }

    public final void keyTyped(java.awt.event.KeyEvent param0) {
        int var2_int = 0;
        int var3 = 0;
        try {
          if (null != pk.field_e) {
            var2_int = param0.getKeyChar();
            if (var2_int != 0 &&
              var2_int != 65535 &&
              wa.a((char) var2_int, (byte) -79)) {
              var3 = 127 & 1 + l.field_h;
              if (var3 != di.field_a) {
                sf.field_d[l.field_h] = -1;
                ac.field_i[l.field_h] = (char)var2_int;
                l.field_h = var3;
              }
            }
          }
          param0.consume();
        } catch (RuntimeException runtimeException) {
          throw ma.a((Throwable) ((Object) runtimeException), "eb.keyTyped(" + (param0 != null ? "{...}" : "null") + ')');
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
          if (pk.field_e != null) {
            ce.field_e = 0;
            var2_int = param0.getKeyCode();
            if (var2_int >= 0 &&
              hd.field_a.length > var2_int) {
              var2_int = hd.field_a[var2_int];
              if ((var2_int & 128) != 0) {
                var2_int = -1;
              }
            } else {
              var2_int = -1;
            }
            if (se.field_H >= 0 &&
              var2_int >= 0) {
              ob.field_c[se.field_H] = var2_int;
              se.field_H = se.field_H + 1 & 127;
              if (se.field_H == vd.field_e) {
                se.field_H = -1;
              }
            }
            if (var2_int >= 0) {
              var3 = 1 + l.field_h & 127;
              if (var3 != di.field_a) {
                sf.field_d[l.field_h] = var2_int;
                ac.field_i[l.field_h] = (char)0;
                l.field_h = var3;
              }
            }
            var3Lifetime1 = param0.getModifiers();
            if (0 == (var3Lifetime1 & 10) &&
              var2_int != 85 &&
              10 != var2_int) {
              return;
            }
            param0.consume();
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2 = decompiledCaughtException;
          stackIn_25_0 = var2;
          stackIn_25_1 = new StringBuilder().append("eb.keyPressed(");
          if (param0 == null) {
            stackIn_26_2 = "null";
          } else {
            stackIn_26_2 = "{...}";
          }
          throw ma.a((Throwable) ((Object) stackIn_25_0), ((StringBuilder) (Object) stackIn_25_1).append(stackIn_26_2).append(')').toString());
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
          if (null != pk.field_e) {
            ce.field_e = 0;
            var2_int = param0.getKeyCode();
            if (var2_int >= 0 &&
              hd.field_a.length > var2_int) {
              var2_int = hd.field_a[var2_int] & -129;
            } else {
              var2_int = -1;
            }
            if (se.field_H >= 0 &&
              var2_int >= 0) {
              ob.field_c[se.field_H] = ~var2_int;
              se.field_H = se.field_H + 1 & 127;
              if (vd.field_e == se.field_H) {
                se.field_H = -1;
              }
            }
          }
          param0.consume();
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          runtimeException = decompiledCaughtException;
          stackIn_16_0 = runtimeException;
          stackIn_16_1 = new StringBuilder().append("eb.keyReleased(");
          if (param0 == null) {
            stackIn_17_2 = "null";
          } else {
            stackIn_17_2 = "{...}";
          }
          throw ma.a((Throwable) ((Object) stackIn_16_0), ((StringBuilder) (Object) stackIn_16_1).append(stackIn_17_2).append(')').toString());
        }
    }

    public final void focusGained(java.awt.event.FocusEvent param0) {
    }

    final static wb a(String param0, int param1) {
        int var3 = 0;
        int var2_int = 0;
        RuntimeException var2 = null;
        int var4 = 0;
        int var5 = 0;
        wb stackIn_3_0 = null;
        wb stackIn_13_0 = null;
        RuntimeException stackIn_16_0 = null;
        StringBuilder stackIn_16_1 = null;
        String stackIn_17_2 = null;
        RuntimeException decompiledCaughtException = null;
        var5 = stellarshard.field_B;
        try {
          if (param1 < 31) {
            stackIn_3_0 = (wb) null;
            return stackIn_3_0;
          }
          var2_int = param0.length();
          for (var3 = 0; var2_int > var3; var3++) {
            var4 = param0.charAt(var3);
            if (48 > var4) {
              return null;
            }
            if (57 < var4) {
              return null;
            }
          }
          stackIn_13_0 = h.field_a;
          return stackIn_13_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2 = decompiledCaughtException;
          stackIn_16_0 = var2;
          stackIn_16_1 = new StringBuilder().append("eb.A(");
          if (param0 == null) {
            stackIn_17_2 = "null";
          } else {
            stackIn_17_2 = "{...}";
          }
          throw ma.a((Throwable) ((Object) stackIn_16_0), ((StringBuilder) (Object) stackIn_16_1).append(stackIn_17_2).append(',').append(param1).append(')').toString());
        }
    }

    public final synchronized void focusLost(java.awt.event.FocusEvent param0) {
        try {
          if (pk.field_e != null) {
            se.field_H = -1;
          }
        } catch (RuntimeException runtimeException) {
          throw ma.a((Throwable) ((Object) runtimeException), "eb.focusLost(" + (param0 != null ? "{...}" : "null") + ')');
        }
    }

    static {
        int var0 = 0;
        long var6 = 0L;
        long var4 = 0L;
        int var3 = 0;
        int var2 = 0;
        int var1 = 0;
        field_b = new int[8192];
        field_d = "IO error - unable to communicate reliably with the data server. Please check any firewall/antivirus/filtering software.";
        field_a = 0;
        field_c = new int[98304];
        for (var0 = 92682; var0 >= 46341; var0--) {
          var6 = (long)((var0 << 1) + 1);
          var4 = (long)((var0 << 1) - 1);
          var3 = (int)(-32768L + (var6 * var6 >> 18));
          var2 = (int)(-32768L + (var4 * var4 >> 18));
          if (!(field_c.length > var3)) {
            var3 = field_c.length - 1;
          }
          for (var1 = var2 >= 0 ? var2 : 0; var1 <= var3; var1++) {
            field_c[var1] = var0;
          }
        }
    }
}
