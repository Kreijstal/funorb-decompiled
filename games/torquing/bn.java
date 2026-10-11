/*
 * Decompiled by CFR-JS 0.4.0.
 */
abstract class bn {
    int field_e;
    static int field_h;
    static volatile boolean field_b;
    int field_c;
    int field_j;
    int field_g;
    static boolean field_i;
    int field_a;
    int field_d;
    static double[][] field_f;

    abstract void a(int param0, int param1);

    abstract void a(int param0, int param1, int param2);

    final static bm a(int param0, int param1, int param2, byte param3, int param4) {
        int var6 = Torquing.field_u;
        bm var5 = (bm) (gl.field_d.b(0));
        while (var5 != null) {
          if (~param0 == ~var5.field_s) {
            return var5;
          }
          var5 = (bm) (gl.field_d.f(-24059));
        }
        bm var8 = new bm();
        bm var9 = var8;
        var8.field_q = param4;
        if (param3 == 44) {
          var9.field_o = param2;
          var9.field_s = param0;
          gl.field_d.a((byte) 54, var9);
          mc.a((byte) 85, param1, var9);
          return var9;
        }
        String var7 = (String) null;
        bn.a((String) null, 73);
        var9.field_o = param2;
        var9.field_s = param0;
        gl.field_d.a((byte) 54, var9);
        mc.a((byte) 85, param1, var9);
        return var9;
    }

    public static void a(int param0) {
        field_f = (double[][]) null;
        if (param0 >= -54) {
          field_b = false;
        }
    }

    final static boolean a(String param0, int param1) {
        RuntimeException var2 = null;
        CharSequence var3 = null;
        boolean stackIn_3_0 = false;
        RuntimeException stackIn_6_0 = null;
        StringBuilder stackIn_6_1 = null;
        String stackIn_7_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          if (param1 != -17310) {
            field_h = -119;
          }
          var3 = (CharSequence) ((Object) param0);
          stackIn_3_0 = tj.field_j.equals(hf.a(var3, 116));
          return stackIn_3_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2 = decompiledCaughtException;
          stackIn_6_0 = var2;
          stackIn_6_1 = new StringBuilder().append("bn.B(");
          if (param0 == null) {
            stackIn_7_2 = "null";
          } else {
            stackIn_7_2 = "{...}";
          }
          throw rb.a((Throwable) ((Object) stackIn_6_0), ((StringBuilder) (Object) stackIn_6_1).append(stackIn_7_2).append(',').append(param1).append(')').toString());
        }
    }

    static {
        field_b = true;
        field_f = new double[8][];
    }
}
