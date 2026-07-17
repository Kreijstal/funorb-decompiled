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
        if (((nd) this).field_c instanceof Long) {
            return ((Long) ((nd) this).field_c).longValue();
        }
        if (((nd) this).field_c instanceof Integer) {
            return ((Integer) ((nd) this).field_c).longValue();
        }
        if (param0 > -59) {
            ((nd) this).field_c = null;
            if (!(!(((nd) this).field_c instanceof Short))) {
                return ((Short) ((nd) this).field_c).longValue();
            }
            if (!(!(((nd) this).field_c instanceof Byte))) {
                return ((Byte) ((nd) this).field_c).longValue();
            }
            if (((nd) this).field_c instanceof Double) {
                return ((Double) ((nd) this).field_c).longValue();
            }
            if (!(!(((nd) this).field_c instanceof Float))) {
                return ((Float) ((nd) this).field_c).longValue();
            }
            throw new ClassCastException();
        }
        if (!(!(((nd) this).field_c instanceof Short))) {
            return ((Short) ((nd) this).field_c).longValue();
        }
        if (!(!(((nd) this).field_c instanceof Byte))) {
            return ((Byte) ((nd) this).field_c).longValue();
        }
        if (((nd) this).field_c instanceof Double) {
            return ((Double) ((nd) this).field_c).longValue();
        }
        if (!(!(((nd) this).field_c instanceof Float))) {
            return ((Float) ((nd) this).field_c).longValue();
        }
        throw new ClassCastException();
    }

    public final String toString() {
        if (!(!((nd) this).field_e)) {
            return cq.a(((nd) this).field_c, (byte) -75) + "{" + ((nd) this).field_c + "}";
        }
        if (!(((nd) this).field_c != null)) {
            return "null";
        }
        return ((nd) this).field_c.toString();
    }

    final int a(int param0) {
        if (param0 == 2) {
          if (((nd) this).field_c instanceof Integer) {
            return ((Integer) ((nd) this).field_c).intValue();
          } else {
            return (int)this.b(-101);
          }
        } else {
          if (((nd) this).field_c instanceof Integer) {
            return ((Integer) ((nd) this).field_c).intValue();
          } else {
            return (int)this.b(-101);
          }
        }
    }

    public static void a(byte param0) {
        field_a = null;
        field_d = null;
        field_b = null;
    }

    nd(int param0) {
        ((nd) this).field_c = (Object) (Object) new Integer(param0);
        ((nd) this).field_e = true;
    }

    nd(long param0) {
        ((nd) this).field_c = (Object) (Object) new Long(param0);
        ((nd) this).field_e = true;
    }

    nd(boolean param0) {
        ((nd) this).field_c = (Object) (Object) new Boolean(param0);
        ((nd) this).field_e = true;
    }

    nd(float param0) {
        ((nd) this).field_c = (Object) (Object) new Float(param0);
        ((nd) this).field_e = true;
    }

    nd(double param0) {
        ((nd) this).field_c = (Object) (Object) new Double(param0);
        ((nd) this).field_e = true;
    }

    nd(char param0) {
        ((nd) this).field_c = (Object) (Object) new Character(param0);
        ((nd) this).field_e = true;
    }

    nd(Object param0) {
        try {
            ((nd) this).field_c = param0;
            ((nd) this).field_e = false;
        } catch (RuntimeException runtimeException) {
            throw ig.a((Throwable) (Object) runtimeException, "nd.<init>(" + (param0 != null ? "{...}" : "null") + 41);
        }
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_d = new int[]{0, 1, 2, 4, 5, 3};
    }
}
