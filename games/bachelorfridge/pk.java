/*
 * Decompiled by CFR-JS 0.4.0.
 */
abstract class pk implements qu {
    static ee[] field_b;
    private long field_d;
    static long field_c;
    static String[] field_a;

    public final void a(int param0) {
        if (param0 != 574) {
          return;
        }
        this.field_d = f.b((byte) 73);
    }

    abstract String d(byte param0);

    public static void c(int param0) {
        if (param0 >= -41) {
          return;
        }
        field_a = null;
        field_b = null;
    }

    abstract jg c(byte param0);

    public final String a(byte param0) {
        if (param0 < 27) {
          this.d((byte) -26);
          if (this.b((byte) 5)) {
            return null;
          }
          if (f.b((byte) 73) >= (this.field_d + 350L)) {
            return this.d((byte) 115);
          }
          return null;
        }
        if (this.b((byte) 5)) {
          return null;
        }
        if (f.b((byte) 73) >= (this.field_d + 350L)) {
          return this.d((byte) 115);
        }
        return null;
    }

    final static String a(bca param0, boolean param1) {
        hd var2 = null;
        RuntimeException var2_ref = null;
        String stackIn_2_0 = null;
        String stackIn_4_0 = null;
        RuntimeException stackIn_7_0 = null;
        StringBuilder stackIn_7_1 = null;
        String stackIn_8_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          var2 = (hd) (al.a(-56, param0.field_k));
          if (param1) {
            stackIn_4_0 = var2.field_f;
            return stackIn_4_0;
          }
          stackIn_2_0 = (String) null;
          return stackIn_2_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2_ref = decompiledCaughtException;
          stackIn_7_0 = var2_ref;
          stackIn_7_1 = new StringBuilder().append("pk.M(");
          if (param0 == null) {
            stackIn_8_2 = "null";
          } else {
            stackIn_8_2 = "{...}";
          }
          throw pe.a((Throwable) ((Object) stackIn_7_0), ((StringBuilder) (Object) stackIn_7_1).append(stackIn_8_2).append(',').append(param1).append(')').toString());
        }
    }

    public final jg b(int param0) {
        if (this.b((byte) 5)) {
          return md.field_o;
        }
        if (param0 != -19704) {
          return (jg) null;
        }
        if (f.b((byte) 73) >= (350L + this.field_d)) {
          return this.c((byte) 35);
        }
        return cq.field_g;
    }

    static {
        field_a = new String[]{"All scores", "My scores", "Best each"};
    }
}
