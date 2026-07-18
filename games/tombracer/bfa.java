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
        if (param0 != 17049) {
          field_b = null;
          field_c = null;
          field_b = null;
          field_e = null;
          return;
        } else {
          field_c = null;
          field_b = null;
          field_e = null;
          return;
        }
    }

    final boolean a(boolean param0) {
        if (param0) {
            bfa.a(-40);
            return ((Boolean) ((bfa) this).field_d).booleanValue();
        }
        return ((Boolean) ((bfa) this).field_d).booleanValue();
    }

    private final long b(int param0) {
        if (((bfa) this).field_d instanceof Long) {
          return ((Long) ((bfa) this).field_d).longValue();
        } else {
          if (!(((bfa) this).field_d instanceof Integer)) {
            if (!(((bfa) this).field_d instanceof Short)) {
              if (!(((bfa) this).field_d instanceof Byte)) {
                if (param0 == -18486) {
                  if (!(((bfa) this).field_d instanceof Double)) {
                    if (((bfa) this).field_d instanceof Float) {
                      return ((Float) ((bfa) this).field_d).longValue();
                    } else {
                      throw new ClassCastException();
                    }
                  } else {
                    return ((Double) ((bfa) this).field_d).longValue();
                  }
                } else {
                  field_b = null;
                  if (!(((bfa) this).field_d instanceof Double)) {
                    if (((bfa) this).field_d instanceof Float) {
                      return ((Float) ((bfa) this).field_d).longValue();
                    } else {
                      throw new ClassCastException();
                    }
                  } else {
                    return ((Double) ((bfa) this).field_d).longValue();
                  }
                }
              } else {
                return ((Byte) ((bfa) this).field_d).longValue();
              }
            } else {
              return ((Short) ((bfa) this).field_d).longValue();
            }
          } else {
            return ((Integer) ((bfa) this).field_d).longValue();
          }
        }
    }

    bfa(int param0) {
        ((bfa) this).field_d = (Object) (Object) new Integer(param0);
        ((bfa) this).field_a = true;
    }

    bfa(long param0) {
        ((bfa) this).field_d = (Object) (Object) new Long(param0);
        ((bfa) this).field_a = true;
    }

    public final String toString() {
        if (((bfa) this).field_a) {
            return (Object) (Object) jd.a(((bfa) this).field_d, 0) + "{" + ((bfa) this).field_d + "}";
        }
        if (!(null != ((bfa) this).field_d)) {
            return "null";
        }
        return ((bfa) this).field_d.toString();
    }

    final int c(int param0) {
        if (param0 == -178) {
          if (((bfa) this).field_d instanceof Integer) {
            return ((Integer) ((bfa) this).field_d).intValue();
          } else {
            return (int)this.b(param0 ^ 18564);
          }
        } else {
          return -29;
        }
    }

    bfa(boolean param0) {
        ((bfa) this).field_d = (Object) (Object) new Boolean(param0);
        ((bfa) this).field_a = true;
    }

    bfa(float param0) {
        ((bfa) this).field_d = (Object) (Object) new Float(param0);
        ((bfa) this).field_a = true;
    }

    bfa(double param0) {
        ((bfa) this).field_d = (Object) (Object) new Double(param0);
        ((bfa) this).field_a = true;
    }

    bfa(char param0) {
        ((bfa) this).field_d = (Object) (Object) new Character(param0);
        ((bfa) this).field_a = true;
    }

    bfa(Object param0) {
        try {
            ((bfa) this).field_a = false;
            ((bfa) this).field_d = param0;
        } catch (RuntimeException runtimeException) {
            throw tba.a((Throwable) (Object) runtimeException, "bfa.<init>(" + (param0 != null ? "{...}" : "null") + ')');
        }
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_b = "Flaregun";
    }
}
