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
          if (this.field_b != null) {
            return true;
          } else {
            return false;
          }
        } else {
          L0: {
            if (this.field_b == null) {
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
                ag var3 = (ag) null;
                gi.a((ag) null, -47);
            }
            ej.field_a.b(param0);
        } catch (RuntimeException runtimeException) {
            throw ie.a((Throwable) ((Object) runtimeException), "gi.TB(" + (param0 != null ? "{...}" : "null") + ',' + param1 + ')');
        }
    }

    public static void b(int param0) {
        field_a = (byte[][][]) null;
        field_d = null;
        if (param0 != 10589) {
            field_d = (he[]) null;
        }
    }

    final void a(int param0) {
        if (null == this.field_b) {
          return;
        } else {
          this.field_b.field_e = this.field_e;
          this.field_e.field_b = this.field_b;
          if (param0 != -16175) {
            gi.b(21);
            this.field_b = null;
            this.field_e = null;
            return;
          } else {
            this.field_b = null;
            this.field_e = null;
            return;
          }
        }
    }

    static {
    }
}
