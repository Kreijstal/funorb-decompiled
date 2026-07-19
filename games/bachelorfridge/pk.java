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
        String discarded$7 = null;
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
          discarded$7 = this.d((byte) -26);
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
        RuntimeException stackIn_6_0 = null;
        StringBuilder stackIn_6_1 = null;
        RuntimeException stackIn_7_0 = null;
        StringBuilder stackIn_7_1 = null;
        RuntimeException stackIn_8_0 = null;
        StringBuilder stackIn_8_1 = null;
        String stackIn_8_2 = null;
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        String stackOut_3_0 = null;
        String stackOut_1_0 = null;
        RuntimeException stackOut_5_0 = null;
        StringBuilder stackOut_5_1 = null;
        RuntimeException stackOut_7_0 = null;
        StringBuilder stackOut_7_1 = null;
        String stackOut_7_2 = null;
        RuntimeException stackOut_6_0 = null;
        StringBuilder stackOut_6_1 = null;
        String stackOut_6_2 = null;
        try {
          L0: {
            var2 = (hd) ((Object) al.a(-56, param0.field_k));
            if (param1) {
              stackOut_3_0 = var2.field_f;
              stackIn_4_0 = stackOut_3_0;
              decompiledRegionSelector0 = 1;
              break L0;
            } else {
              stackOut_1_0 = (String) null;
              stackIn_2_0 = stackOut_1_0;
              decompiledRegionSelector0 = 0;
              break L0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L1: {
            var2_ref = decompiledCaughtException;
            stackOut_5_0 = (RuntimeException) (var2_ref);
            stackOut_5_1 = new StringBuilder().append("pk.M(");
            stackIn_7_0 = stackOut_5_0;
            stackIn_7_1 = stackOut_5_1;
            stackIn_6_0 = stackOut_5_0;
            stackIn_6_1 = stackOut_5_1;
            if (param0 == null) {
              stackOut_7_0 = (RuntimeException) ((Object) stackIn_7_0);
              stackOut_7_1 = (StringBuilder) ((Object) stackIn_7_1);
              stackOut_7_2 = "null";
              stackIn_8_0 = stackOut_7_0;
              stackIn_8_1 = stackOut_7_1;
              stackIn_8_2 = stackOut_7_2;
              break L1;
            } else {
              stackOut_6_0 = (RuntimeException) ((Object) stackIn_6_0);
              stackOut_6_1 = (StringBuilder) ((Object) stackIn_6_1);
              stackOut_6_2 = "{...}";
              stackIn_8_0 = stackOut_6_0;
              stackIn_8_1 = stackOut_6_1;
              stackIn_8_2 = stackOut_6_2;
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
