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
        if (param0 >= 27) {
          if (!this.b((byte) 5)) {
            if ((f.b((byte) 73) ^ -1L) > (this.field_d - -350L ^ -1L)) {
              return null;
            } else {
              return this.d((byte) 115);
            }
          } else {
            return null;
          }
        } else {
          this.d((byte) -26);
          if (!this.b((byte) 5)) {
            if ((f.b((byte) 73) ^ -1L) > (this.field_d - -350L ^ -1L)) {
              return null;
            } else {
              return this.d((byte) 115);
            }
          } else {
            return null;
          }
        }
    }

    final static String a(bca param0, boolean param1) {
        hd var2 = null;
        RuntimeException var2_ref = null;
        String stackIn_2_0 = null;
        String stackIn_4_0 = null;
        RuntimeException stackIn_7_0 = null;
        StringBuilder stackIn_7_1 = null;
        RuntimeException stackIn_8_0 = null;
        StringBuilder stackIn_8_1 = null;
        String stackIn_8_2 = null;
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        try {
          L0: {
            var2 = (hd) ((Object) al.a(-56, param0.field_k));
            if (param1) {
              stackIn_4_0 = var2.field_f;
              decompiledRegionSelector0 = 1;
              break L0;
            } else {
              stackIn_2_0 = (String) null;
              decompiledRegionSelector0 = 0;
              break L0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L1: {
            var2_ref = decompiledCaughtException;
            stackIn_7_0 = (RuntimeException) (var2_ref);

            stackIn_7_1 = new StringBuilder().append("pk.M(");

            if (param0 == null) {
              stackIn_8_0 = (RuntimeException) ((Object) stackIn_7_0);
              stackIn_8_1 = (StringBuilder) ((Object) stackIn_7_1);
              stackIn_8_2 = "null";
              break L1;
            } else {
              stackIn_8_0 = (RuntimeException) ((Object) stackIn_7_0);
              stackIn_8_1 = (StringBuilder) ((Object) stackIn_7_1);
              stackIn_8_2 = "{...}";
              break L1;
            }
          }
          throw pe.a((Throwable) ((Object) stackIn_8_0), stackIn_8_2 + ',' + param1 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return stackIn_2_0;
        } else {
          return stackIn_4_0;
        }
    }

    public final jg b(int param0) {
        if (this.b((byte) 5)) {
          return md.field_o;
        } else {
          if (param0 == -19704) {
            if ((f.b((byte) 73) ^ -1L) > (350L + this.field_d ^ -1L)) {
              return cq.field_g;
            } else {
              return this.c((byte) 35);
            }
          } else {
            return (jg) null;
          }
        }
    }

    static {
        field_a = new String[]{"All scores", "My scores", "Best each"};
    }
}
