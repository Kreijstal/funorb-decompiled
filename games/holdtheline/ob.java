/*
 * Decompiled by CFR-JS 0.4.0.
 */
abstract class ob implements ia {
    private long field_a;
    static ah field_b;

    abstract String d(int param0);

    final static String d(byte param0) {
        int var1 = 0;
        if (bb.field_a == sf.field_n) {
          return ij.field_k;
        } else {
          if (fj.field_o.a(250)) {
            if (ak.field_b == sf.field_n) {
              return fj.field_o.b((byte) 66);
            } else {
              var1 = -82 / ((-21 - param0) / 40);
              return ec.field_v;
            }
          } else {
            return fj.field_o.b((byte) 66);
          }
        }
    }

    public final String b(byte param0) {
        if (param0 == -59) {
          if (!this.a((byte) -41)) {
            if ((bb.b(-1) ^ -1L) > (350L + this.field_a ^ -1L)) {
              return null;
            } else {
              return this.d(97);
            }
          } else {
            return null;
          }
        } else {
          return (String) null;
        }
    }

    public final fd b(int param0) {
        String discarded$2 = null;
        if (this.a((byte) -114)) {
          return di.field_q;
        } else {
          if ((bb.b(-1) ^ -1L) <= (this.field_a + 350L ^ -1L)) {
            if (param0 != -7447) {
              discarded$2 = ob.d((byte) -36);
              return this.c((byte) -92);
            } else {
              return this.c((byte) -92);
            }
          } else {
            return hh.field_d;
          }
        }
    }

    public final void a(int param0) {
        if (param0 != 21871) {
            field_b = (ah) null;
            this.field_a = bb.b(-1);
            return;
        }
        this.field_a = bb.b(-1);
    }

    public static void c(int param0) {
        String discarded$0 = null;
        field_b = null;
        if (param0 != -24581) {
            discarded$0 = ob.d((byte) 45);
        }
    }

    abstract fd c(byte param0);

    static {
        field_b = null;
    }
}
