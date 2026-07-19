/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class nd {
    boolean field_e;
    static int[] field_b;
    static int[] field_d;
    Object field_c;
    static je field_a;

    private final long b(int param0) {
        if (this.field_c instanceof Long) {
            return ((Long) (this.field_c)).longValue();
        }
        if (this.field_c instanceof Integer) {
            return ((Integer) (this.field_c)).longValue();
        }
        if (param0 > -59) {
            this.field_c = (Object) null;
            if (!(!(this.field_c instanceof Short))) {
                return ((Short) (this.field_c)).longValue();
            }
            if (!(!(this.field_c instanceof Byte))) {
                return ((Byte) (this.field_c)).longValue();
            }
            if (this.field_c instanceof Double) {
                return ((Double) (this.field_c)).longValue();
            }
            if (!(!(this.field_c instanceof Float))) {
                return ((Float) (this.field_c)).longValue();
            }
            throw new ClassCastException();
        }
        if (!(!(this.field_c instanceof Short))) {
            return ((Short) (this.field_c)).longValue();
        }
        if (!(!(this.field_c instanceof Byte))) {
            return ((Byte) (this.field_c)).longValue();
        }
        if (this.field_c instanceof Double) {
            return ((Double) (this.field_c)).longValue();
        }
        if (!(!(this.field_c instanceof Float))) {
            return ((Float) (this.field_c)).longValue();
        }
        throw new ClassCastException();
    }

    public final String toString() {
        if (!(!this.field_e)) {
            return cq.a(this.field_c, (byte) -75) + "{" + this.field_c + "}";
        }
        if (!(this.field_c != null)) {
            return "null";
        }
        return this.field_c.toString();
    }

    final int a(int param0) {
        if (param0 == 2) {
          if (this.field_c instanceof Integer) {
            return ((Integer) (this.field_c)).intValue();
          } else {
            return (int)this.b(-101);
          }
        } else {
          if (this.field_c instanceof Integer) {
            return ((Integer) (this.field_c)).intValue();
          } else {
            return (int)this.b(-101);
          }
        }
    }

    public static void a(byte param0) {
        field_a = null;
        if (param0 != -114) {
            return;
        }
        field_d = null;
        field_b = null;
    }

    nd(int param0) {
        this.field_c = new Integer(param0);
        this.field_e = true;
    }

    nd(long param0) {
        this.field_c = new Long(param0);
        this.field_e = true;
    }

    nd(boolean param0) {
        this.field_c = new Boolean(param0);
        this.field_e = true;
    }

    nd(float param0) {
        this.field_c = new Float(param0);
        this.field_e = true;
    }

    nd(double param0) {
        this.field_c = new Double(param0);
        this.field_e = true;
    }

    nd(char param0) {
        this.field_c = new Character(param0);
        this.field_e = true;
    }

    nd(Object param0) {
        try {
            this.field_c = param0;
            this.field_e = false;
        } catch (RuntimeException runtimeException) {
            throw ig.a((Throwable) ((Object) runtimeException), "nd.<init>(" + (param0 != null ? "{...}" : "null") + ')');
        }
    }

    static {
        field_d = new int[]{0, 1, 2, 4, 5, 3};
    }
}
