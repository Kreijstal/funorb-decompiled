/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class ConsoleValue {
    Object value;
    boolean primitive;

    public final String toString() {
        if (this.primitive) {
          return sna.getPrimitiveType(this.value, (byte) 107) + "{" + this.value + "}";
        }
        if (this.value == null) {
          return "null";
        }
        return this.value.toString();
    }

    final static void b(int param0) {
        if (param0 != 0) {
          return;
        }
        osa.field_e = SetSniperCannonFiringLeeway.field_p;
    }

    private final long longValue(int param0) {
        if (this.value instanceof Long) {
          return ((Long) (this.value)).longValue();
        }
        if (this.value instanceof Integer) {
          return ((Integer) (this.value)).longValue();
        }
        if (this.value instanceof Short) {
          return ((Short) (this.value)).longValue();
        }
        if (this.value instanceof Byte) {
          return ((Byte) (this.value)).longValue();
        }
        if (this.value instanceof Double) {
          return ((Double) (this.value)).longValue();
        }
        if (param0 != 0) {
          return 104L;
        }
        if (!(this.value instanceof Float)) {
          throw new ClassCastException();
        }
        return ((Float) (this.value)).longValue();
    }

    ConsoleValue(int param0) {
        this.value = new Integer(param0);
        this.primitive = true;
    }

    final boolean booleanValue(boolean param0) {
        if (param0) {
          this.value = (Object) null;
          return ((Boolean) (this.value)).booleanValue();
        }
        return ((Boolean) (this.value)).booleanValue();
    }

    final int intValue(int param0) {
        if (param0 < 5) {
          ConsoleValue.b(-117);
          if (!(this.value instanceof Integer)) {
            return (int)this.longValue(0);
          }
          return ((Integer) (this.value)).intValue();
        }
        if (!(this.value instanceof Integer)) {
          return (int)this.longValue(0);
        }
        return ((Integer) (this.value)).intValue();
    }

    ConsoleValue(long param0) {
        this.value = new Long(param0);
        this.primitive = true;
    }

    ConsoleValue(boolean param0) {
        this.value = new Boolean(param0);
        this.primitive = true;
    }

    final static void a(byte param0) {
        int var1 = -53 % ((-32 - param0) / 53);
        SetVelocitySustainMax.field_o = 0;
        if (null == SetFogOfWarOn.field_o) {
          SetFogOfWarOn.field_o = new Object[]{};
        }
        GetMissionTerrainNebulaProbability.field_q = true;
    }

    final static void a(byte param0, int param1, int param2, int param3, int param4) {
        if (param0 > -79) {
          ConsoleValue.b(-58);
        }
        if (ob.field_j > param3 - param4) {
          ffb.a(param4, (byte) -89, param1, param2, param3);
        } else {
          if (param3 + param4 > GetCountermeasureLauncherProjectiles.field_o) {
            ffb.a(param4, (byte) -89, param1, param2, param3);
          } else {
            if (-param4 + param1 < NebulaField.field_c) {
              ffb.a(param4, (byte) -89, param1, param2, param3);
            } else {
              if (hab.field_i < param4 + param1) {
                ffb.a(param4, (byte) -89, param1, param2, param3);
              } else {
                GetFixedaim.a(param2, param3, param1, param4, 2);
              }
            }
          }
        }
    }

    ConsoleValue(float param0) {
        this.value = new Float(param0);
        this.primitive = true;
    }

    ConsoleValue(double param0) {
        this.value = new Double(param0);
        this.primitive = true;
    }

    final float floatValue(int param0) {
        if (this.value instanceof Double) {
          return ((Double) (this.value)).floatValue();
        }
        if (this.value instanceof Float) {
          return ((Float) (this.value)).floatValue();
        }
        if (param0 == 0) {
          return (float)this.longValue(0);
        }
        return (float)this.longValue(0);
    }

    ConsoleValue(char param0) {
        this.value = new Character(param0);
        this.primitive = true;
    }

    ConsoleValue(Object param0) {
        try {
          this.value = param0;
          this.primitive = false;
        } catch (RuntimeException runtimeException) {
          throw GetMissileLauncherRandomness.a((Throwable) ((Object) runtimeException), "nc.<init>(" + (param0 != null ? "{...}" : "null") + ')');
        }
    }

    static {
    }
}
