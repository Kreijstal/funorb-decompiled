/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class jo extends wf {
    int field_k;
    static int[] field_j;
    jo field_f;
    static String field_l;
    int field_g;
    int field_i;
    int field_e;
    int field_h;

    public static void a(byte param0) {
        field_j = null;
        if (param0 < -118) {
          field_l = null;
          return;
        }
        al var2 = (al) null;
        jo.a((al) null, -12, (byte) -87);
        field_l = null;
    }

    final static rh a(al param0, int param1, byte param2) {
        RuntimeException var3 = null;
        rh stackIn_3_0 = null;
        RuntimeException stackIn_6_0 = null;
        StringBuilder stackIn_6_1 = null;
        String stackIn_7_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          if (param2 >= -18) {
            jo.a((byte) 24);
          }
          stackIn_3_0 = w.a(-23159, su.a(param0, 100, param1));
          return stackIn_3_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3 = decompiledCaughtException;
          stackIn_6_0 = var3;
          stackIn_6_1 = new StringBuilder().append("jo.B(");
          if (param0 == null) {
            stackIn_7_2 = "null";
          } else {
            stackIn_7_2 = "{...}";
          }
          throw pn.a((Throwable) ((Object) stackIn_6_0), ((StringBuilder) (Object) stackIn_6_1).append(stackIn_7_2).append(',').append(param1).append(',').append(param2).append(')').toString());
        }
    }

    jo(int param0, int param1, int param2, int param3, int param4) {
        this.field_g = param2;
        this.field_e = param4;
        this.field_k = param0;
        this.field_h = param3;
        this.field_i = param1;
    }

    static {
        field_l = "BEST HIGHSCORES";
        field_j = new int[4];
    }
}
