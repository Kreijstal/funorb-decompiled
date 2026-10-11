/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class tg implements java.awt.event.KeyListener, java.awt.event.FocusListener {
    static String field_a;
    static String field_c;
    static String field_b;

    final static vk a(int param0, String param1) {
        int var3 = 0;
        int var2_int = 0;
        int var4 = 0;
        int var5 = 0;
        vk stackIn_5_0 = null;
        vk stackIn_8_0 = null;
        vk stackIn_18_0 = null;
        vk stackIn_22_0 = null;
        RuntimeException stackIn_27_0 = null;
        StringBuilder stackIn_27_1 = null;
        String stackIn_28_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var2 = null;
        var5 = ZombieDawn.field_J;
        try {
          if (param0 >= -88) {
            field_b = (String) null;
          }
          var2_int = param1.length();
          if (0 == var2_int) {
            stackIn_5_0 = bg.field_l;
            return stackIn_5_0;
          }
          if (var2_int > 63) {
            stackIn_8_0 = fg.field_m;
            return stackIn_8_0;
          }
          for (var3 = 0; var3 < var2_int; var3++) {
            var4 = param1.charAt(var3);
            if (45 == var4) {
              if (0 == var3 ||
                var3 == var2_int - 1) {
                stackIn_18_0 = vl.field_m;
                return stackIn_18_0;
              }
            } else {
              if (qm.field_a.indexOf(var4) == -1) {
                stackIn_22_0 = vl.field_m;
                return stackIn_22_0;
              }
            }
          }
          return null;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2 = decompiledCaughtException;
          stackIn_27_0 = var2;
          stackIn_27_1 = new StringBuilder().append("tg.C(").append(param0).append(',');
          if (param1 == null) {
            stackIn_28_2 = "null";
          } else {
            stackIn_28_2 = "{...}";
          }
          throw sh.a((Throwable) ((Object) stackIn_27_0), ((StringBuilder) (Object) stackIn_27_1).append(stackIn_28_2).append(')').toString());
        }
    }

    public static void a(byte param0) {
        int var1 = 36 / ((param0 - 44) / 35);
        field_b = null;
        field_c = null;
        field_a = null;
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
          if (null != ea.field_c) {
            nl.field_s = 0;
            var2_int = param0.getKeyCode();
            if (var2_int >= 0 &&
              ei.field_G.length > var2_int) {
              var2_int = ei.field_G[var2_int];
              if ((128 & var2_int) != 0) {
                var2_int = -1;
              }
            } else {
              var2_int = -1;
            }
            if (ih.field_F >= 0 &&
              var2_int >= 0) {
              nd.field_c[ih.field_F] = var2_int;
              ih.field_F = 1 + ih.field_F & 127;
              if (ih.field_F == uc.field_d) {
                ih.field_F = -1;
              }
            }
            if (var2_int >= 0) {
              var3 = je.field_c + 1 & 127;
              if (var3 != he.field_e) {
                vd.field_b[je.field_c] = var2_int;
                gg.field_a[je.field_c] = (char)0;
                je.field_c = var3;
              }
            }
            var3Lifetime1 = param0.getModifiers();
            if ((var3Lifetime1 & 10) == 0 &&
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
          stackIn_24_1 = new StringBuilder().append("tg.keyPressed(");
          if (param0 == null) {
            stackIn_25_2 = "null";
          } else {
            stackIn_25_2 = "{...}";
          }
          throw sh.a((Throwable) ((Object) stackIn_24_0), ((StringBuilder) (Object) stackIn_24_1).append(stackIn_25_2).append(')').toString());
        }
    }

    public final synchronized void keyReleased(java.awt.event.KeyEvent param0) {
        int var2_int = 0;
        RuntimeException stackIn_14_0 = null;
        StringBuilder stackIn_14_1 = null;
        String stackIn_15_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var2 = null;
        try {
          if (ea.field_c != null) {
            nl.field_s = 0;
            var2_int = param0.getKeyCode();
            if (0 <= var2_int &&
              var2_int < ei.field_G.length) {
              var2_int = ei.field_G[var2_int] & -129;
            } else {
              var2_int = -1;
            }
            if (0 <= ih.field_F &&
              0 <= var2_int) {
              nd.field_c[ih.field_F] = ~var2_int;
              ih.field_F = 1 + ih.field_F & 127;
              if (ih.field_F == uc.field_d) {
                ih.field_F = -1;
              }
            }
          }
          param0.consume();
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2 = decompiledCaughtException;
          stackIn_14_0 = var2;
          stackIn_14_1 = new StringBuilder().append("tg.keyReleased(");
          if (param0 == null) {
            stackIn_15_2 = "null";
          } else {
            stackIn_15_2 = "{...}";
          }
          throw sh.a((Throwable) ((Object) stackIn_14_0), ((StringBuilder) (Object) stackIn_14_1).append(stackIn_15_2).append(')').toString());
        }
    }

    public final synchronized void focusLost(java.awt.event.FocusEvent param0) {
        try {
          if (ea.field_c != null) {
            ih.field_F = -1;
          }
        } catch (RuntimeException runtimeException) {
          throw sh.a((Throwable) ((Object) runtimeException), "tg.focusLost(" + (param0 != null ? "{...}" : "null") + ')');
        }
    }

    final static void a(int param0) {
        jh.field_i = false;
        fj.field_g.d((byte) -122);
        if (param0 < 110) {
          String var2 = (String) null;
          tg.a(-42, (String) null);
        }
    }

    public final void keyTyped(java.awt.event.KeyEvent param0) {
        int var2_int = 0;
        int var3 = 0;
        try {
          if (null != ea.field_c) {
            var2_int = param0.getKeyChar();
            if (var2_int != 0 && var2_int != 65535 &&
              na.a(0, (char) var2_int)) {
              var3 = 1 + je.field_c & 127;
              if (var3 != he.field_e) {
                vd.field_b[je.field_c] = -1;
                gg.field_a[je.field_c] = (char)var2_int;
                je.field_c = var3;
              }
            }
          }
          param0.consume();
        } catch (RuntimeException runtimeException) {
          throw sh.a((Throwable) ((Object) runtimeException), "tg.keyTyped(" + (param0 != null ? "{...}" : "null") + ')');
        }
    }

    public final void focusGained(java.awt.event.FocusEvent param0) {
    }

    static {
        field_a = "Connection lost - attempting to reconnect";
        field_c = "Select a zombie!";
        field_b = "Creating a Jagex account is simple and free. Your account will remember your progress, highscores and achievements in every game. You can also use it to play some of our multiplayer games - and Jagex's other games!<br><br><col=2164A2>Please note - if you have a RuneScape account, you can click 'Go Back' and use your existing account to log in!</col>";
    }
}
