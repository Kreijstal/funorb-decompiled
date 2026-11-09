/*
 * Decompiled by CFR-JS 0.4.0.
 */
import java.util.*;

final class GameKeyHandler implements java.awt.event.KeyListener, java.awt.event.FocusListener {
    static id field_a;

    public final void keyTyped(java.awt.event.KeyEvent param0) {
        int var2_int = 0;
        int var3 = 0;
        try {
          if (null != EmailCredentials.field_e) {
            var2_int = param0.getKeyChar();
            if (var2_int != 0 &&
              var2_int != 65535 &&
              ScrollControl.isCp1252Character(-125, (char) var2_int)) {
              var3 = CacheReferenceNode.field_s + 1 & 127;
              if (var3 != bj.field_a) {
                WidgetTheme.field_c[CacheReferenceNode.field_s] = -1;
                SpriteMask.field_c[CacheReferenceNode.field_s] = (char)var2_int;
                CacheReferenceNode.field_s = var3;
              }
            }
          }
          param0.consume();
        } catch (RuntimeException runtimeException) {
          throw ClientExceptionSupport.wrapWithContext((Throwable) ((Object) runtimeException), "hb.keyTyped(" + (param0 != null ? "{...}" : "null") + ')');
        }
    }

    public final synchronized void keyPressed(java.awt.event.KeyEvent param0) {
        int var2_int = 0;
        RuntimeException stackIn_28_0 = null;
        StringBuilder stackIn_28_1 = null;
        String stackIn_29_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var2 = null;
        int var3 = 0;
        int var3Lifetime1;
        try {
          if (null == EmailCredentials.field_e) {
            return;
          }
          LegacyOpenGlFlowingWaterEffect.field_e = 0;
          var2_int = param0.getKeyCode();
          if (0 <= var2_int &&
            var2_int < SoftwareTransform3D.field_c.length) {
            var2_int = SoftwareTransform3D.field_c[var2_int];
            if (0 != (128 & var2_int)) {
              var2_int = -1;
            }
          } else {
            var2_int = -1;
          }
          if (LegacyOpenGlEnvironmentWaterEffect.field_i >= 0 &&
            var2_int >= 0) {
            ContentTransitionPhase.field_d[LegacyOpenGlEnvironmentWaterEffect.field_i] = var2_int;
            LegacyOpenGlEnvironmentWaterEffect.field_i = LegacyOpenGlEnvironmentWaterEffect.field_i + 1 & 127;
            if (LegacyOpenGlEnvironmentWaterEffect.field_i == HardwareTurbulentWaterNoise.field_v) {
              LegacyOpenGlEnvironmentWaterEffect.field_i = -1;
            }
          }
          if (var2_int >= 0) {
            var3 = 1 + CacheReferenceNode.field_s & 127;
            if (var3 != bj.field_a) {
              WidgetTheme.field_c[CacheReferenceNode.field_s] = var2_int;
              SpriteMask.field_c[CacheReferenceNode.field_s] = (char)0;
              CacheReferenceNode.field_s = var3;
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
          if (10 != var2_int) {
            return;
          }
          param0.consume();
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2 = decompiledCaughtException;
          stackIn_28_0 = var2;
          stackIn_28_1 = new StringBuilder().append("hb.keyPressed(");
          if (param0 == null) {
            stackIn_29_2 = "null";
          } else {
            stackIn_29_2 = "{...}";
          }
          throw ClientExceptionSupport.wrapWithContext((Throwable) ((Object) stackIn_28_0), ((StringBuilder) (Object) stackIn_28_1).append(stackIn_29_2).append(')').toString());
        }
    }

    final static void a(Drone param0, int param1) {
        int var2_int = 0;
        int var3 = 0;
        int var4 = 0;
        int var5 = 0;
        int var6 = 0;
        int var7 = 0;
        if (MessageDialog.arcadeMode) {
          return;
        }
        try {
          var2_int = param0.xQ8;
          var3 = param0.yQ8;
          var4 = -param0.velocityXQ8;
          var5 = param0.velocityYQ8;
          if (param1 != -1) {
            field_a = (id) null;
          }
          var6 = 1;
          var7 = ExpandingRingEffect.nextRandomInt(5, HardwareGraphicsHeap.field_o, (byte) -96);
          bj.powerupPickups.addLast((IntrusiveNode) (new PowerupPickup(var6, var7, var2_int, var3, var4, var5)), (byte) 39);
        } catch (RuntimeException runtimeException) {
          throw ClientExceptionSupport.wrapWithContext((Throwable) ((Object) runtimeException), "hb.B(" + (param0 != null ? "{...}" : "null") + ',' + param1 + ')');
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
          if (null != EmailCredentials.field_e) {
            LegacyOpenGlFlowingWaterEffect.field_e = 0;
            var2_int = param0.getKeyCode();
            if (var2_int >= 0 &&
              var2_int < SoftwareTransform3D.field_c.length) {
              var2_int = -129 & SoftwareTransform3D.field_c[var2_int];
            } else {
              var2_int = -1;
            }
            if (LegacyOpenGlEnvironmentWaterEffect.field_i >= 0 &&
              var2_int >= 0) {
              ContentTransitionPhase.field_d[LegacyOpenGlEnvironmentWaterEffect.field_i] = ~var2_int;
              LegacyOpenGlEnvironmentWaterEffect.field_i = LegacyOpenGlEnvironmentWaterEffect.field_i + 1 & 127;
              if (LegacyOpenGlEnvironmentWaterEffect.field_i == HardwareTurbulentWaterNoise.field_v) {
                LegacyOpenGlEnvironmentWaterEffect.field_i = -1;
              }
            }
          }
          param0.consume();
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          runtimeException = decompiledCaughtException;
          stackIn_15_0 = runtimeException;
          stackIn_15_1 = new StringBuilder().append("hb.keyReleased(");
          if (param0 == null) {
            stackIn_16_2 = "null";
          } else {
            stackIn_16_2 = "{...}";
          }
          throw ClientExceptionSupport.wrapWithContext((Throwable) ((Object) stackIn_15_0), ((StringBuilder) (Object) stackIn_15_1).append(stackIn_16_2).append(')').toString());
        }
    }

    public final void focusGained(java.awt.event.FocusEvent param0) {
    }

    public static void releaseStatics(int param0) {
        field_a = null;
        if (param0 != -2851) {
          GameKeyHandler.releaseStatics(-38);
        }
    }

    public final synchronized void focusLost(java.awt.event.FocusEvent param0) {
        RuntimeException var2 = null;
        RuntimeException stackIn_6_0 = null;
        StringBuilder stackIn_6_1 = null;
        String stackIn_7_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          if (null == EmailCredentials.field_e) {
            return;
          }
          LegacyOpenGlEnvironmentWaterEffect.field_i = -1;
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2 = decompiledCaughtException;
          stackIn_6_0 = var2;
          stackIn_6_1 = new StringBuilder().append("hb.focusLost(");
          if (param0 == null) {
            stackIn_7_2 = "null";
          } else {
            stackIn_7_2 = "{...}";
          }
          throw ClientExceptionSupport.wrapWithContext((Throwable) ((Object) stackIn_6_0), ((StringBuilder) (Object) stackIn_6_1).append(stackIn_7_2).append(')').toString());
        }
    }

    final static ScrollControl a(byte param0) {
        int var1 = -91 % ((79 - param0) / 41);
        return new ScrollControl(0, 0, HardwareTurbulentWaterNoise.widgetTheme.field_g, 0, (WidgetRenderer) null, HardwareTurbulentWaterNoise.widgetTheme.field_f, HardwareTurbulentWaterNoise.widgetTheme.field_p, HardwareTurbulentWaterNoise.widgetTheme.field_g, HardwareTurbulentWaterNoise.widgetTheme.field_g, HardwareTurbulentWaterNoise.widgetTheme.field_a, HardwareTurbulentWaterNoise.widgetTheme.field_b, false, true, 32768, 0);
    }

    final static boolean contactSortsAfter(SocialContact contact, int guard, SocialContact other) {
        int var3_int = 0;
        int var4 = 0;
        RuntimeException stackIn_19_0 = null;
        StringBuilder stackIn_19_1 = null;
        String stackIn_20_2 = null;
        StringBuilder stackIn_22_1 = null;
        String stackIn_23_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var3 = null;
        var4 = Sumoblitz.field_L ? 1 : 0;
        try {
          var3_int = -other.insertionOrder + contact.insertionOrder;
          if (jm.field_d != contact.worldName) {
            if (null == contact.worldName) {
              var3_int += 200;
            }
          } else {
            var3_int -= 200;
          }
          if (jm.field_d == other.worldName) {
            var3_int += 200;
          } else {
            if (null == other.worldName) {
              var3_int -= 200;
            }
          }
          if (guard == 0) {
            return !(var3_int <= 0);
          }
          return true;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3 = decompiledCaughtException;
          stackIn_19_0 = var3;
          stackIn_19_1 = new StringBuilder().append("hb.C(");
          if (contact == null) {
            stackIn_20_2 = "null";
          } else {
            stackIn_20_2 = "{...}";
          }
          stackIn_22_1 = ((StringBuilder) (Object) stackIn_19_1).append(stackIn_20_2).append(',').append(guard).append(',');
          if (other == null) {
            stackIn_23_2 = "null";
          } else {
            stackIn_23_2 = "{...}";
          }
          throw ClientExceptionSupport.wrapWithContext((Throwable) ((Object) stackIn_19_0), ((StringBuilder) (Object) stackIn_22_1).append(stackIn_23_2).append(')').toString());
        }
    }

    static {
        field_a = null;
    }
}
