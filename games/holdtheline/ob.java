/*
 * Decompiled by CFR-JS 0.4.0.
 */
abstract class ob implements ia {
    private long field_a;
    static ah field_b;

    abstract String d(int param0);

    final static String d(byte param0) {
        if (bb.field_a == sf.field_n) {
          return ij.field_k;
        }
        if (!fj.field_o.a(250)) {
          return fj.field_o.b((byte) 66);
        }
        if (ak.field_b != sf.field_n) {
          int var1 = -82 / ((-21 - param0) / 40);
          return ec.field_v;
        }
        return fj.field_o.b((byte) 66);
    }

    public final String b(byte param0) {
        if (param0 != -59) {
          return (String) null;
        }
        if (this.a((byte) -41)) {
          return null;
        }
        if (bb.b(-1) >= (350L + this.field_a)) {
          return this.d(97);
        }
        return null;
    }

    public final fd b(int param0) {
        if (this.a((byte) -114)) {
          return di.field_q;
        }
        if (bb.b(-1) < (this.field_a + 350L)) {
          return hh.field_d;
        }
        if (param0 == -7447) {
          return this.c((byte) -92);
        }
        ob.d((byte) -36);
        return this.c((byte) -92);
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
        field_b = null;
        if (param0 != -24581) {
          ob.d((byte) 45);
        }
    }

    abstract fd c(byte param0);

    static {
        field_b = null;
    }
}
