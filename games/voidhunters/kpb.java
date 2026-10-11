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
        String stackIn_8_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          if (param0 <= -53) {
            stackIn_4_0 = nva.a('*', true, param1.field_j.length());
            return stackIn_4_0;
          }
          stackIn_2_0 = (String) null;
          return stackIn_2_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3 = decompiledCaughtException;
          stackIn_7_0 = var3;
          stackIn_7_1 = new StringBuilder().append("kpb.C(").append(param0).append(',');
          if (param1 == null) {
            stackIn_8_2 = "null";
          } else {
            stackIn_8_2 = "{...}";
          }
          throw rta.a((Throwable) ((Object) stackIn_7_0), ((StringBuilder) (Object) stackIn_7_1).append(stackIn_8_2).append(')').toString());
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
