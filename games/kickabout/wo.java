/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class wo extends aa {
    static ut[] field_n;
    static int field_m;
    static int field_k;
    static String field_l;
    static String[] field_j;
    static int field_o;

    final static void a(ot param0, gm param1, byte param2, int param3) {
        RuntimeException stackIn_13_0 = null;
        StringBuilder stackIn_13_1 = null;
        String stackIn_14_2 = null;
        StringBuilder stackIn_16_1 = null;
        String stackIn_17_2 = null;
        RuntimeException decompiledCaughtException = null;
        int var4_int = 0;
        RuntimeException var4 = null;
        int var5 = 0;
        int var6 = 0;
        int var7 = 0;
        int var8 = 0;
        int var9 = 0;
        int var10 = 0;
        var10 = Kickabout.field_G;
        try {
          if (param1 == null) {
            return;
          }
          var4_int = 37 % ((param2 - 60) / 56);
          var5 = param0.field_o;
          var6 = param0.field_v;
          var7 = ug.a(0, param1.field_kb >> 16) - (var5 >> 1);
          var8 = -(var6 >> 1) + lf.a((byte) -101, param1.field_bb >> 16);
          if (hw.field_i == 256) {
            if (1 == tb.field_v) {
              param0.b(var7, var8, param3);
              return;
            }
            nh.a(param0, var7, var8);
            return;
          }
          var9 = var5 * hw.field_i >> 8;
          if (tb.field_v == 1) {
            param0.d((-var9 + var5 >> 1) + var7, (var6 - var9 >> 1) + var8, var9, var9, param3);
            return;
          }
          nh.a(param0, (-var9 + var5 >> 1) + var7, (var6 - var9 >> 1) + var8, var9, var9);
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var4 = decompiledCaughtException;
          stackIn_13_0 = var4;
          stackIn_13_1 = new StringBuilder().append("wo.C(");
          if (param0 == null) {
            stackIn_14_2 = "null";
          } else {
            stackIn_14_2 = "{...}";
          }
          stackIn_16_1 = ((StringBuilder) (Object) stackIn_13_1).append(stackIn_14_2).append(',');
          if (param1 == null) {
            stackIn_17_2 = "null";
          } else {
            stackIn_17_2 = "{...}";
          }
          throw nb.a((Throwable) ((Object) stackIn_13_0), ((StringBuilder) (Object) stackIn_16_1).append(stackIn_17_2).append(',').append(param2).append(',').append(param3).append(')').toString());
        }
    }

    wo(long param0, String param1) {
        super(param0, param1);
    }

    final kj a(byte param0) {
        if (param0 > -77) {
          return (kj) null;
        }
        return si.field_j;
    }

    public static void a(boolean param0) {
        field_l = null;
        field_n = null;
        if (param0) {
          wo.a(true);
          field_j = null;
          return;
        }
        field_j = null;
    }

    static {
        field_l = "New Game";
        field_j = new String[]{"Learn basic controls though the interactive tutorial.", "Experiment with your team on an empty pitch.", null};
        field_o = 0;
    }
}
