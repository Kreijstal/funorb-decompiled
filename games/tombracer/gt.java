/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class gt implements java.awt.event.KeyListener, java.awt.event.FocusListener {
    static int field_a;
    static String field_d;
    static float[] field_c;
    static int field_b;

    final static void a(int param0, int param1, int param2, int param3, int param4, int param5) {
        int var10 = 0;
        int var6_int = 0;
        int var7 = 0;
        int var8 = 0;
        int var9 = 0;
        int var11 = 0;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var6 = null;
        var11 = TombRacer.field_G ? 1 : 0;
        try {
          var6_int = rp.a(hc.field_h, param4 - 16236, gca.field_d, param2);
          if (param4 != 10) {
            gt.a((byte) 101);
          }
          var7 = rp.a(hc.field_h, param4 ^ -16236, gca.field_d, param5);
          var8 = rp.a(ss.field_c, param4 - 16236, pka.field_b, param1);
          var9 = rp.a(ss.field_c, -16226, pka.field_b, param0);
          for (var10 = var6_int; var7 >= var10; var10++) {
            nra.a((byte) -55, param3, var9, vaa.field_a[var10], var8);
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var6 = decompiledCaughtException;
          throw tba.a((Throwable) ((Object) var6), "gt.A(" + param0 + ',' + param1 + ',' + param2 + ',' + param3 + ',' + param4 + ',' + param5 + ')');
        }
    }

    final static void a(byte param0) {
        int var1 = 0;
        int var1Lifetime1;
        if (ipa.field_P != null) {
          ipa.field_P.a();
          var1 = 1 % ((-17 - param0) / 60);
          if (null != gg.field_b) {
            gg.field_b.a();
            return;
          }
          return;
        }
        var1Lifetime1 = 1 % ((-17 - param0) / 60);
        if (null == gg.field_b) {
          return;
        }
        gg.field_b.a();
    }

    public final void focusGained(java.awt.event.FocusEvent param0) {
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
          if (null == nfa.field_n) {
            return;
          }
          cda.field_p = 0;
          var2_int = param0.getKeyCode();
          if (0 <= var2_int &&
            var2_int < bba.field_c.length) {
            var2_int = bba.field_c[var2_int];
            if ((var2_int & 128) != 0) {
              var2_int = -1;
            }
          } else {
            var2_int = -1;
          }
          if (ita.field_f >= 0 &&
            var2_int >= 0) {
            cna.field_c[ita.field_f] = var2_int;
            ita.field_f = 127 & 1 + ita.field_f;
            if (ita.field_f == hka.field_a) {
              ita.field_f = -1;
            }
          }
          if (var2_int >= 0) {
            var3 = rca.field_n + 1 & 127;
            if (var3 != vha.field_b) {
              dl.field_o[rca.field_n] = var2_int;
              uk.field_O[rca.field_n] = (char)0;
              rca.field_n = var3;
            }
          }
          var3Lifetime1 = param0.getModifiers();
          if (0 == (var3Lifetime1 & 10) &&
            85 != var2_int &&
            var2_int != 10) {
            return;
          }
          param0.consume();
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2 = decompiledCaughtException;
          stackIn_25_0 = var2;
          stackIn_25_1 = new StringBuilder().append("gt.keyPressed(");
          if (param0 == null) {
            stackIn_26_2 = "null";
          } else {
            stackIn_26_2 = "{...}";
          }
          throw tba.a((Throwable) ((Object) stackIn_25_0), ((StringBuilder) (Object) stackIn_25_1).append(stackIn_26_2).append(')').toString());
        }
    }

    public final synchronized void focusLost(java.awt.event.FocusEvent param0) {
        RuntimeException var2 = null;
        RuntimeException stackIn_6_0 = null;
        StringBuilder stackIn_6_1 = null;
        String stackIn_7_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          if (nfa.field_n == null) {
            return;
          }
          ita.field_f = -1;
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2 = decompiledCaughtException;
          stackIn_6_0 = var2;
          stackIn_6_1 = new StringBuilder().append("gt.focusLost(");
          if (param0 == null) {
            stackIn_7_2 = "null";
          } else {
            stackIn_7_2 = "{...}";
          }
          throw tba.a((Throwable) ((Object) stackIn_6_0), ((StringBuilder) (Object) stackIn_6_1).append(stackIn_7_2).append(')').toString());
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
          if (nfa.field_n != null) {
            cda.field_p = 0;
            var2_int = param0.getKeyCode();
            if (0 <= var2_int &&
              var2_int < bba.field_c.length) {
              var2_int = bba.field_c[var2_int] & -129;
            } else {
              var2_int = -1;
            }
            if (0 <= ita.field_f &&
              0 <= var2_int) {
              cna.field_c[ita.field_f] = ~var2_int;
              ita.field_f = 127 & 1 + ita.field_f;
              if (ita.field_f == hka.field_a) {
                ita.field_f = -1;
              }
            }
          }
          param0.consume();
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2 = decompiledCaughtException;
          stackIn_16_0 = var2;
          stackIn_16_1 = new StringBuilder().append("gt.keyReleased(");
          if (param0 == null) {
            stackIn_17_2 = "null";
          } else {
            stackIn_17_2 = "{...}";
          }
          throw tba.a((Throwable) ((Object) stackIn_16_0), ((StringBuilder) (Object) stackIn_16_1).append(stackIn_17_2).append(')').toString());
        }
    }

    public static void a(int param0) {
        field_c = null;
        field_d = null;
        if (param0 != 127) {
          gt.a((byte) 34);
        }
    }

    public final void keyTyped(java.awt.event.KeyEvent param0) {
        int var2_int = 0;
        int var3 = 0;
        try {
          if (nfa.field_n != null) {
            var2_int = param0.getKeyChar();
            if (var2_int != 0 &&
              var2_int != 65535 &&
              msa.a((char) var2_int, (byte) 124)) {
              var3 = 1 + rca.field_n & 127;
              if (vha.field_b != var3) {
                dl.field_o[rca.field_n] = -1;
                uk.field_O[rca.field_n] = (char)var2_int;
                rca.field_n = var3;
              }
            }
          }
          param0.consume();
        } catch (RuntimeException runtimeException) {
          throw tba.a((Throwable) ((Object) runtimeException), "gt.keyTyped(" + (param0 != null ? "{...}" : "null") + ')');
        }
    }

    static {
        field_d = "Passwords must be between 5 and 20 letters and numbers";
        field_c = new float[]{1.0f, 0.0f, 0.0f, 0.0f, 0.0f, 1.0f, 0.0f, 0.0f, 0.0f, 0.0f, 1.0f, 0.0f, 0.0f, 0.0f, 0.0f, 1.0f};
        field_b = -1;
    }
}
