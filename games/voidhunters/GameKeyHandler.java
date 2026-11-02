/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class GameKeyHandler implements java.awt.event.KeyListener, java.awt.event.FocusListener {
    static int field_a;
    static llb field_b;

    final static void a(byte param0) {
        int var1 = 56 / ((0 - param0) / 50);
    }

    final static int a(int param0, int param1) {
        if (param0 == 22433) {
          return -4096 + (4096 ^ param1 & 8191);
        }
        field_b = (llb) null;
        return -4096 + (4096 ^ param1 & 8191);
    }

    public final synchronized void keyReleased(java.awt.event.KeyEvent param0) {
        int var2_int = 0;
        RuntimeException stackIn_16_0 = null;
        StringBuilder stackIn_16_1 = null;
        String stackIn_17_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var2 = null;
        try {
          if (null != GetMomentOfInertiaPerpointCalcDownshift.field_q) {
            GetUseCircleOutline.field_q = 0;
            var2_int = param0.getKeyCode();
            if (var2_int >= 0 &&
              GetBombletSprayRandomness.field_o.length > var2_int) {
              var2_int = GetBombletSprayRandomness.field_o[var2_int] & -129;
            } else {
              var2_int = -1;
            }
            if (SetSniperCannonAimarc.field_p >= 0 &&
              var2_int >= 0) {
              SetNumStars.field_o[SetSniperCannonAimarc.field_p] = ~var2_int;
              SetSniperCannonAimarc.field_p = 127 & 1 + SetSniperCannonAimarc.field_p;
              if (GetFixedaim.field_p == SetSniperCannonAimarc.field_p) {
                SetSniperCannonAimarc.field_p = -1;
              }
            }
          }
          param0.consume();
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2 = decompiledCaughtException;
          stackIn_16_0 = var2;
          stackIn_16_1 = new StringBuilder().append("rrb.keyReleased(");
          if (param0 == null) {
            stackIn_17_2 = "null";
          } else {
            stackIn_17_2 = "{...}";
          }
          throw GetMissileLauncherRandomness.a((Throwable) ((Object) stackIn_16_0), ((StringBuilder) (Object) stackIn_16_1).append(stackIn_17_2).append(')').toString());
        }
    }

    public final void keyTyped(java.awt.event.KeyEvent param0) {
        int var2_int = 0;
        int var3 = 0;
        try {
          if (null != GetMomentOfInertiaPerpointCalcDownshift.field_q) {
            var2_int = param0.getKeyChar();
            if (0 != var2_int && var2_int != 65535 &&
              mia.a((char) var2_int, true)) {
              var3 = SetComponentBreakingExplosionForceMultiplier.field_o + 1 & 127;
              if (var3 != bva.field_c) {
                npa.field_a[SetComponentBreakingExplosionForceMultiplier.field_o] = -1;
                GetGrapplingHookCooldown.field_q[SetComponentBreakingExplosionForceMultiplier.field_o] = (char)var2_int;
                SetComponentBreakingExplosionForceMultiplier.field_o = var3;
              }
            }
          }
          param0.consume();
        } catch (RuntimeException runtimeException) {
          throw GetMissileLauncherRandomness.a((Throwable) ((Object) runtimeException), "rrb.keyTyped(" + (param0 != null ? "{...}" : "null") + ')');
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
          if (null != GetMomentOfInertiaPerpointCalcDownshift.field_q) {
            GetUseCircleOutline.field_q = 0;
            var2_int = param0.getKeyCode();
            if (0 <= var2_int &&
              GetBombletSprayRandomness.field_o.length > var2_int) {
              var2_int = GetBombletSprayRandomness.field_o[var2_int];
              if ((128 & var2_int) != 0) {
                var2_int = -1;
              }
            } else {
              var2_int = -1;
            }
            if (SetSniperCannonAimarc.field_p >= 0 &&
              var2_int >= 0) {
              SetNumStars.field_o[SetSniperCannonAimarc.field_p] = var2_int;
              SetSniperCannonAimarc.field_p = SetSniperCannonAimarc.field_p + 1 & 127;
              if (SetSniperCannonAimarc.field_p == GetFixedaim.field_p) {
                SetSniperCannonAimarc.field_p = -1;
              }
            }
            if (0 <= var2_int) {
              var3 = 127 & 1 + SetComponentBreakingExplosionForceMultiplier.field_o;
              if (var3 != bva.field_c) {
                npa.field_a[SetComponentBreakingExplosionForceMultiplier.field_o] = var2_int;
                GetGrapplingHookCooldown.field_q[SetComponentBreakingExplosionForceMultiplier.field_o] = (char)0;
                SetComponentBreakingExplosionForceMultiplier.field_o = var3;
              }
            }
            var3Lifetime1 = param0.getModifiers();
            if ((var3Lifetime1 & 10) == 0 &&
              85 != var2_int &&
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
          stackIn_24_1 = new StringBuilder().append("rrb.keyPressed(");
          if (param0 == null) {
            stackIn_25_2 = "null";
          } else {
            stackIn_25_2 = "{...}";
          }
          throw GetMissileLauncherRandomness.a((Throwable) ((Object) stackIn_24_0), ((StringBuilder) (Object) stackIn_24_1).append(stackIn_25_2).append(')').toString());
        }
    }

    final static abb b(int param0) {
        if (param0 >= -37) {
          field_a = 79;
          return (abb) ((Object) new tgb());
        }
        return (abb) ((Object) new tgb());
    }

    final static int a(byte param0, int param1, int param2, int param3, String param4) {
        RuntimeException var5 = null;
        int stackIn_4_0 = 0;
        int stackIn_6_0 = 0;
        RuntimeException stackIn_9_0 = null;
        StringBuilder stackIn_9_1 = null;
        String stackIn_10_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          if (param0 <= 23) {
            GameKeyHandler.a(115);
          }
          if (!li.field_i) {
            stackIn_6_0 = ita.a(param2, 7988).b(param4, param3);
            return stackIn_6_0;
          }
          stackIn_4_0 = SetTorpedoEnergyUsed.a(param2, 300).a(param3, param4, true, (aja[]) null);
          return stackIn_4_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var5 = decompiledCaughtException;
          stackIn_9_0 = var5;
          stackIn_9_1 = new StringBuilder().append("rrb.B(").append(param0).append(',').append(param1).append(',').append(param2).append(',').append(param3).append(',');
          if (param4 == null) {
            stackIn_10_2 = "null";
          } else {
            stackIn_10_2 = "{...}";
          }
          throw GetMissileLauncherRandomness.a((Throwable) ((Object) stackIn_9_0), ((StringBuilder) (Object) stackIn_9_1).append(stackIn_10_2).append(')').toString());
        }
    }

    public final synchronized void focusLost(java.awt.event.FocusEvent param0) {
        RuntimeException var2 = null;
        RuntimeException stackIn_6_0 = null;
        StringBuilder stackIn_6_1 = null;
        String stackIn_7_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          if (null == GetMomentOfInertiaPerpointCalcDownshift.field_q) {
            return;
          }
          SetSniperCannonAimarc.field_p = -1;
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2 = decompiledCaughtException;
          stackIn_6_0 = var2;
          stackIn_6_1 = new StringBuilder().append("rrb.focusLost(");
          if (param0 == null) {
            stackIn_7_2 = "null";
          } else {
            stackIn_7_2 = "{...}";
          }
          throw GetMissileLauncherRandomness.a((Throwable) ((Object) stackIn_6_0), ((StringBuilder) (Object) stackIn_6_1).append(stackIn_7_2).append(')').toString());
        }
    }

    public static void a(int param0) {
        if (param0 >= -1) {
          GameKeyHandler.b(-72);
          field_b = null;
          return;
        }
        field_b = null;
    }

    public final void focusGained(java.awt.event.FocusEvent param0) {
    }

    static {
        field_a = 40;
    }
}
