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
        ((pk) this).field_d = f.b((byte) 73);
    }

    abstract String d(byte param0);

    public static void c() {
        field_a = null;
        field_b = null;
    }

    abstract jg c(byte param0);

    public final String a(byte param0) {
        if (param0 >= 27) {
          if (!((pk) this).b((byte) 5)) {
            if (~f.b((byte) 73) > ~(((pk) this).field_d - -350L)) {
              return null;
            } else {
              return ((pk) this).d((byte) 115);
            }
          } else {
            return null;
          }
        } else {
          String discarded$7 = ((pk) this).d((byte) -26);
          if (!((pk) this).b((byte) 5)) {
            if (~f.b((byte) 73) > ~(((pk) this).field_d - -350L)) {
              return null;
            } else {
              return ((pk) this).d((byte) 115);
            }
          } else {
            return null;
          }
        }
    }

    final static String a(bca param0) {
        hd var2 = null;
        RuntimeException var2_ref = null;
        RuntimeException stackIn_3_0 = null;
        StringBuilder stackIn_3_1 = null;
        RuntimeException stackIn_4_0 = null;
        StringBuilder stackIn_4_1 = null;
        RuntimeException stackIn_5_0 = null;
        StringBuilder stackIn_5_1 = null;
        String stackIn_5_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException stackOut_2_0 = null;
        StringBuilder stackOut_2_1 = null;
        RuntimeException stackOut_4_0 = null;
        StringBuilder stackOut_4_1 = null;
        String stackOut_4_2 = null;
        RuntimeException stackOut_3_0 = null;
        StringBuilder stackOut_3_1 = null;
        String stackOut_3_2 = null;
        try {
          var2 = (hd) (Object) al.a(-56, param0.field_k);
          return var2.field_f;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L0: {
            var2_ref = decompiledCaughtException;
            stackOut_2_0 = (RuntimeException) var2_ref;
            stackOut_2_1 = new StringBuilder().append("pk.M(");
            stackIn_4_0 = stackOut_2_0;
            stackIn_4_1 = stackOut_2_1;
            stackIn_3_0 = stackOut_2_0;
            stackIn_3_1 = stackOut_2_1;
            if (param0 == null) {
              stackOut_4_0 = (RuntimeException) (Object) stackIn_4_0;
              stackOut_4_1 = (StringBuilder) (Object) stackIn_4_1;
              stackOut_4_2 = "null";
              stackIn_5_0 = stackOut_4_0;
              stackIn_5_1 = stackOut_4_1;
              stackIn_5_2 = stackOut_4_2;
              break L0;
            } else {
              stackOut_3_0 = (RuntimeException) (Object) stackIn_3_0;
              stackOut_3_1 = (StringBuilder) (Object) stackIn_3_1;
              stackOut_3_2 = "{...}";
              stackIn_5_0 = stackOut_3_0;
              stackIn_5_1 = stackOut_3_1;
              stackIn_5_2 = stackOut_3_2;
              break L0;
            }
          }
          throw pe.a((Throwable) (Object) stackIn_5_0, stackIn_5_2 + ',' + true + ')');
        }
    }

    public final jg b(int param0) {
        if (((pk) this).b((byte) 5)) {
          return md.field_o;
        } else {
          if (param0 == -19704) {
            if (~f.b((byte) 73) > ~(350L + ((pk) this).field_d)) {
              return cq.field_g;
            } else {
              return ((pk) this).c((byte) 35);
            }
          } else {
            return null;
          }
        }
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_a = new String[]{"All scores", "My scores", "Best each"};
    }
}
