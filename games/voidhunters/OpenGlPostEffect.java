/*
 * Decompiled by CFR-JS 0.4.0.
 */
abstract class OpenGlPostEffect extends IntrusiveNode {
    boolean enabled;
    static IntrusiveDeque field_e;
    OpenGlToolkit toolkit;

    abstract void finishPass(int param0, int param1);

    final static boolean isRepeatedCharacter(int param0, String param1) {
        int var2_int = 0;
        RuntimeException var2 = null;
        int var3 = 0;
        int var4 = 0;
        RuntimeException stackIn_13_0 = null;
        StringBuilder stackIn_13_1 = null;
        String stackIn_14_2 = null;
        RuntimeException decompiledCaughtException = null;
        var4 = VoidHunters.field_G;
        try {
          if (param0 < 112) {
            OpenGlPostEffect.a(-5, (byte) 121, 58, -64);
          }
          var2_int = param1.charAt(0);
          var3 = 1;
          while (true) {
            if (param1.length() <= var3) {
              return true;
            }
            if (var2_int == param1.charAt(var3)) {
              var3++;
              continue;
            }
            break;
          }
          return false;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2 = decompiledCaughtException;
          stackIn_13_0 = var2;
          stackIn_13_1 = new StringBuilder().append("mea.J(").append(param0).append(',');
          if (param1 == null) {
            stackIn_14_2 = "null";
          } else {
            stackIn_14_2 = "{...}";
          }
          throw GetMissileLauncherRandomness.a((Throwable) ((Object) stackIn_13_0), ((StringBuilder) (Object) stackIn_13_1).append(stackIn_14_2).append(')').toString());
        }
    }

    final int getPassCount(int param0) {
        if (param0 != 23230) {
          this.enabled = false;
          return 1;
        }
        return 1;
    }

    public static void clearSharedReferences(int param0) {
        field_e = null;
        if (param0 >= -88) {
          field_e = (IntrusiveDeque) null;
        }
    }

    abstract void releaseResources(byte param0);

    abstract void resize(int param0, int param1, int param2);

    int getColorBufferPrecision(byte param0) {
        if (param0 != 7) {
          this.finishPass(39, 72);
          return 0;
        }
        return 0;
    }

    final boolean requiresDepthTexture(int param0) {
        if (param0 != 0) {
          return false;
        }
        return false;
    }

    final boolean isEnabled(byte param0) {
        if (param0 <= 56) {
          this.enabled = false;
          return this.enabled;
        }
        return this.enabled;
    }

    final static void a(int param0, byte param1, int param2, int param3) {
        if (param3 == 0) {
          if (param0 == ActivateSelfDestructOrderDefinition.field_d) {
            if (param1 > -69) {
              field_e = (IntrusiveDeque) null;
            }
            if (param3 == 1 &&
              GetThrusterSmallForce.field_p != param0) {
              ShipBodyFactoryHolder.field_b = true;
              GetThrusterSmallForce.field_p = param0;
              LaserWeaponDefinition.a(40, param2);
            }
            if (2 != param3) {
              return;
            }
            if (GzipCodec.field_h == param0) {
              return;
            }
            ShipBodyFactoryHolder.field_b = true;
            GzipCodec.field_h = param0;
            LaserWeaponDefinition.a(40, param2);
            return;
          }
          ActivateSelfDestructOrderDefinition.field_d = param0;
          ShipBodyFactoryHolder.field_b = true;
          LaserWeaponDefinition.a(40, param2);
        }
        if (param1 <= -69) {
          if (param3 == 1 &&
            GetThrusterSmallForce.field_p != param0) {
            ShipBodyFactoryHolder.field_b = true;
            GetThrusterSmallForce.field_p = param0;
            LaserWeaponDefinition.a(40, param2);
          }
        } else {
          field_e = (IntrusiveDeque) null;
          if (param3 == 1) {
            if (GetThrusterSmallForce.field_p == param0) {
              if (2 != param3) {
                return;
              }
              if (GzipCodec.field_h == param0) {
                return;
              }
              ShipBodyFactoryHolder.field_b = true;
              GzipCodec.field_h = param0;
              LaserWeaponDefinition.a(40, param2);
              return;
            }
            ShipBodyFactoryHolder.field_b = true;
            GetThrusterSmallForce.field_p = param0;
            LaserWeaponDefinition.a(40, param2);
          }
        }
        if (2 == param3) {
          if (GzipCodec.field_h == param0) {
            return;
          }
          ShipBodyFactoryHolder.field_b = true;
          GzipCodec.field_h = param0;
          LaserWeaponDefinition.a(40, param2);
        }
    }

    abstract void setupPass(OpenGlTexture2D param0, int param1, OpenGlTexture2D param2, int param3);

    abstract boolean isInitialized(int param0);

    abstract boolean initialize(int param0);

    OpenGlPostEffect(OpenGlToolkit param0) {
        try {
          this.toolkit = param0;
        } catch (RuntimeException runtimeException) {
          throw GetMissileLauncherRandomness.a((Throwable) ((Object) runtimeException), "mea.<init>(" + (param0 != null ? "{...}" : "null") + ')');
        }
    }

    final static String readIncomingString(boolean param0) {
        if (!param0) {
          field_e = (IntrusiveDeque) null;
          return AccountNameAvailabilityReplies.field_b.readString(-1);
        }
        return AccountNameAvailabilityReplies.field_b.readString(-1);
    }

    static {
    }
}
