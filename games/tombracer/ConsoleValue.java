/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class ConsoleValue {
    static BitmapFont field_c;
    Object field_d;
    static Sprite field_e;
    boolean field_a;
    static String field_b;

    public static void releaseStatics(int param0) {
        if (param0 == 17049) {
          field_c = null;
          field_b = null;
          field_e = null;
          return;
        }
        field_b = (String) null;
        field_c = null;
        field_b = null;
        field_e = null;
    }

    final boolean a(boolean param0) {
        if (param0) {
          ConsoleValue.releaseStatics(-40);
          return ((Boolean) (this.field_d)).booleanValue();
        }
        return ((Boolean) (this.field_d)).booleanValue();
    }

    private final long asLong(int param0) {
        if (this.field_d instanceof Long) {
          return ((Long) (this.field_d)).longValue();
        }
        if (this.field_d instanceof Integer) {
          return ((Integer) (this.field_d)).longValue();
        }
        if (this.field_d instanceof Short) {
          return ((Short) (this.field_d)).longValue();
        }
        if (this.field_d instanceof Byte) {
          return ((Byte) (this.field_d)).longValue();
        }
        if (param0 != -18486) {
          field_b = (String) null;
          if (this.field_d instanceof Double) {
            return ((Double) (this.field_d)).longValue();
          }
          if (!(this.field_d instanceof Float)) {
            throw new ClassCastException();
          }
          return ((Float) (this.field_d)).longValue();
        }
        if (this.field_d instanceof Double) {
          return ((Double) (this.field_d)).longValue();
        }
        if (!(this.field_d instanceof Float)) {
          throw new ClassCastException();
        }
        return ((Float) (this.field_d)).longValue();
    }

    ConsoleValue(int param0) {
        this.field_d = new Integer(param0);
        this.field_a = true;
    }

    ConsoleValue(long param0) {
        this.field_d = new Long(param0);
        this.field_a = true;
    }

    public final String toString() {
        if (this.field_a) {
          return jd.getPrimitiveType(this.field_d, 0) + "{" + this.field_d + "}";
        }
        if (null == this.field_d) {
          return "null";
        }
        return this.field_d.toString();
    }

    final int asInt(int param0) {
        if (param0 != -178) {
          return -29;
        }
        if (!(this.field_d instanceof Integer)) {
          return (int)this.asLong(param0 ^ 18564);
        }
        return ((Integer) (this.field_d)).intValue();
    }

    ConsoleValue(boolean param0) {
        this.field_d = new Boolean(param0);
        this.field_a = true;
    }

    ConsoleValue(float param0) {
        this.field_d = new Float(param0);
        this.field_a = true;
    }

    ConsoleValue(double param0) {
        this.field_d = new Double(param0);
        this.field_a = true;
    }

    ConsoleValue(char param0) {
        this.field_d = new Character(param0);
        this.field_a = true;
    }

    ConsoleValue(Object param0) {
        try {
          this.field_a = false;
          this.field_d = param0;
        } catch (RuntimeException runtimeException) {
          throw tba.a((Throwable) ((Object) runtimeException), "bfa.<init>(" + (param0 != null ? "{...}" : "null") + ')');
        }
    }

    static {
        field_b = "Flaregun";
    }
}
