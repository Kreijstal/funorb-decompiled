/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class bb extends wf {
    int field_j;
    int[] field_e;
    int[] field_i;
    en[] field_h;
    int[] field_l;
    byte[][][] field_k;
    static int[] field_m;
    int field_g;
    en[] field_f;

    final static int a(cd param0, byte param1, cd param2) {
        int var3_int = 0;
        RuntimeException var3 = null;
        String var4 = null;
        int stackIn_1_0 = 0;
        RuntimeException stackIn_4_0 = null;
        StringBuilder stackIn_4_1 = null;
        String stackIn_5_2 = null;
        StringBuilder stackIn_7_1 = null;
        String stackIn_8_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          var3_int = 126 % ((-44 - param1) / 37);
          var4 = (String) null;
          stackIn_1_0 = u.a(param0, 0, (String) null, false, -107, 0, param2);
          return stackIn_1_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3 = decompiledCaughtException;
          stackIn_4_0 = var3;
          stackIn_4_1 = new StringBuilder().append("bb.A(");
          if (param0 == null) {
            stackIn_5_2 = "null";
          } else {
            stackIn_5_2 = "{...}";
          }
          stackIn_7_1 = ((StringBuilder) (Object) stackIn_4_1).append(stackIn_5_2).append(',').append(param1).append(',');
          if (param2 == null) {
            stackIn_8_2 = "null";
          } else {
            stackIn_8_2 = "{...}";
          }
          throw pn.a((Throwable) ((Object) stackIn_4_0), ((StringBuilder) (Object) stackIn_7_1).append(stackIn_8_2).append(')').toString());
        }
    }

    public static void a(int param0) {
        field_m = null;
        if (param0 != -15388) {
          field_m = (int[]) null;
        }
    }

    bb() {
    }

    static {
    }
}
