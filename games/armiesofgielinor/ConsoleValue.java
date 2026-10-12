/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class ConsoleValue {
    boolean primitive;
    static int[] field_b;
    static int[] field_d;
    Object payload;
    static ClientUiComponent field_a;

    private final long asLong(int obfuscationGuard) {
        if (this.payload instanceof Long) {
          return ((Long) (this.payload)).longValue();
        }
        if (this.payload instanceof Integer) {
          return ((Integer) (this.payload)).longValue();
        }
        if (obfuscationGuard > -59) {
          this.payload = (Object) null;
          if (this.payload instanceof Short) {
            return ((Short) (this.payload)).longValue();
          }
          if (this.payload instanceof Byte) {
            return ((Byte) (this.payload)).longValue();
          }
          if (this.payload instanceof Double) {
            return ((Double) (this.payload)).longValue();
          }
          if (this.payload instanceof Float) {
            return ((Float) (this.payload)).longValue();
          }
          throw new ClassCastException();
        }
        if (this.payload instanceof Short) {
          return ((Short) (this.payload)).longValue();
        }
        if (this.payload instanceof Byte) {
          return ((Byte) (this.payload)).longValue();
        }
        if (this.payload instanceof Double) {
          return ((Double) (this.payload)).longValue();
        }
        if (this.payload instanceof Float) {
          return ((Float) (this.payload)).longValue();
        }
        throw new ClassCastException();
    }

    public final String toString() {
        if (this.primitive) {
          return CampaignMenuEntry.getBoxedPrimitiveType(this.payload, (byte) -75) + "{" + this.payload + "}";
        }
        if (this.payload == null) {
          return "null";
        }
        return this.payload.toString();
    }

    final int asInt(int obfuscationGuard) {
        if (obfuscationGuard != 2) {
          if (!(this.payload instanceof Integer)) {
            return (int)this.asLong(-101);
          }
          return ((Integer) (this.payload)).intValue();
        }
        if (!(this.payload instanceof Integer)) {
          return (int)this.asLong(-101);
        }
        return ((Integer) (this.payload)).intValue();
    }

    public static void a(byte param0) {
        field_a = null;
        if (param0 != -114) {
          return;
        }
        field_d = null;
        field_b = null;
    }

    ConsoleValue(int value) {
        this.payload = new Integer(value);
        this.primitive = true;
    }

    ConsoleValue(long value) {
        this.payload = new Long(value);
        this.primitive = true;
    }

    ConsoleValue(boolean value) {
        this.payload = new Boolean(value);
        this.primitive = true;
    }

    ConsoleValue(float value) {
        this.payload = new Float(value);
        this.primitive = true;
    }

    ConsoleValue(double value) {
        this.payload = new Double(value);
        this.primitive = true;
    }

    ConsoleValue(char value) {
        this.payload = new Character(value);
        this.primitive = true;
    }

    ConsoleValue(Object value) {
        try {
          this.payload = value;
          this.primitive = false;
        } catch (RuntimeException runtimeException) {
          throw AnimationSkeleton.addExceptionContext((Throwable) ((Object) runtimeException), "nd.<init>(" + (value != null ? "{...}" : "null") + ')');
        }
    }

    static {
        field_d = new int[]{0, 1, 2, 4, 5, 3};
    }
}
