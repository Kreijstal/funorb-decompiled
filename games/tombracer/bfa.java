/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class bfa {
    static il field_c;
    Object field_d;
    static iu field_e;
    boolean field_a;
    static String field_b;

    public static void a(int param0) {
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
          bfa.a(-40);
          return ((Boolean) (this.field_d)).booleanValue();
        }
        return ((Boolean) (this.field_d)).booleanValue();
    }

    private final long b(int param0) {
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

    bfa(int param0) {
        this.field_d = new Integer(param0);
        this.field_a = true;
    }

    bfa(long param0) {
        this.field_d = new Long(param0);
        this.field_a = true;
    }

    public final String toString() {
        if (this.field_a) {
          return jd.a(this.field_d, 0) + "{" + this.field_d + "}";
        }
        if (null == this.field_d) {
          return "null";
        }
        return this.field_d.toString();
    }

    final int c(int param0) {
        if (param0 != -178) {
          return -29;
        }
        if (!(this.field_d instanceof Integer)) {
          return (int)this.b(param0 ^ 18564);
        }
        return ((Integer) (this.field_d)).intValue();
    }

    bfa(boolean param0) {
        this.field_d = new Boolean(param0);
        this.field_a = true;
    }

    bfa(float param0) {
        this.field_d = new Float(param0);
        this.field_a = true;
    }

    bfa(double param0) {
        this.field_d = new Double(param0);
        this.field_a = true;
    }

    bfa(char param0) {
        this.field_d = new Character(param0);
        this.field_a = true;
    }

    bfa(Object param0) {
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
