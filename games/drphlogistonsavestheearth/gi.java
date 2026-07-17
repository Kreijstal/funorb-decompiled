/*
 * Decompiled by CFR-JS 0.4.0.
 */
class gi {
    static he[] field_d;
    static int field_f;
    static byte[][][] field_a;
    static int field_c;
    gi field_e;
    long field_g;
    gi field_b;

    final boolean c(int param0) {
        int stackIn_4_0 = 0;
        int stackOut_3_0 = 0;
        int stackOut_2_0 = 0;
        if (param0 != -1387) {
          field_f = 76;
          if (((gi) this).field_b != null) {
            return true;
          } else {
            return false;
          }
        } else {
          L0: {
            if (((gi) this).field_b == null) {
              stackOut_3_0 = 0;
              stackIn_4_0 = stackOut_3_0;
              break L0;
            } else {
              stackOut_2_0 = 1;
              stackIn_4_0 = stackOut_2_0;
              break L0;
            }
          }
          return stackIn_4_0 != 0;
        }
    }

    final static void a(ag param0, int param1) {
        try {
            if (param1 != 3408) {
                Object var3 = null;
                gi.a((ag) null, -47);
            }
            ej.field_a.b((ic) (Object) param0);
        } catch (RuntimeException runtimeException) {
            throw ie.a((Throwable) (Object) runtimeException, "gi.TB(" + (param0 != null ? "{...}" : "null") + 44 + param1 + 41);
        }
    }

    public static void b(int param0) {
        field_a = null;
        field_d = null;
        if (param0 != 10589) {
            field_d = null;
        }
    }

    final void a(int param0) {
        if (null == ((gi) this).field_b) {
          return;
        } else {
          ((gi) this).field_b.field_e = ((gi) this).field_e;
          ((gi) this).field_e.field_b = ((gi) this).field_b;
          if (param0 != -16175) {
            gi.b(21);
            ((gi) this).field_b = null;
            ((gi) this).field_e = null;
            return;
          } else {
            ((gi) this).field_b = null;
            ((gi) this).field_e = null;
            return;
          }
        }
    }

    static {
    }
}
