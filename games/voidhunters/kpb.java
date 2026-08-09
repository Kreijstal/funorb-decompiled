/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class kpb extends io {
    static qkb field_q;
    static jo[] field_s;
    static String field_r;

    public static void c(int param0) {
        field_s = null;
        if (param0 != 17433) {
            kpb.c(-38);
            field_q = null;
            field_r = null;
            return;
        }
        field_q = null;
        field_r = null;
    }

    kpb(int param0) {
        this(loa.field_o, param0);
    }

    final String b(byte param0, shb param1) {
        RuntimeException var3 = null;
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
            if (param0 <= -53) {
              stackIn_4_0 = nva.a('*', true, param1.field_j.length());
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
            var3 = decompiledCaughtException;
            stackIn_7_0 = (RuntimeException) (var3);

            stackIn_7_1 = new StringBuilder().append("kpb.C(").append(param0).append(',');

            if (param1 == null) {
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
          throw rta.a((Throwable) ((Object) stackIn_8_0), stackIn_8_2 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return stackIn_2_0;
        } else {
          return stackIn_4_0;
        }
    }

    private kpb(no param0, int param1) {
        super(param0, param1);
    }

    static {
        field_r = "Name";
        field_s = new jo[256];
    }
}
