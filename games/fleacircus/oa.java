/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class oa extends lh {
    static String field_o;
    byte[] field_k;
    int field_i;
    static rh field_l;
    static int field_j;
    static int[] field_m;
    static boolean field_n;

    public static void a(byte param0) {
        field_l = null;
        if (param0 >= -67) {
          return;
        }
        field_m = null;
        field_o = null;
    }

    private oa() throws Throwable {
        throw new Error();
    }

    final static void a(int param0, boolean param1, int param2) {
        int var3;
        int var3Lifetime1;
        if (param0 == 7 &&
          !qh.c((byte) 57) &&
          0 < wc.field_q) {
          param0 = 0;
        }
        if (bc.field_V == param0) {
          return;
        }
        pg.field_f = -60;
        bc.field_V = param0;
        af.field_g = 0;
        if (bc.field_V == 0) {
          bj.field_m = bc.field_V;
          k.a(0, td.field_j);
          if (bc.field_V >= 0) {
            pi.field_b[bc.field_V].a(param1, true);
          }
          var3 = -72 % ((param2 + 26) / 39);
          if (bc.field_V != 8) {
            return;
          }
          vf.e(-6359);
          return;
        }
        if (-2 == bc.field_V) {
          bj.field_m = bc.field_V;
          k.a(0, td.field_j);
        }
        if (bc.field_V >= 0) {
          pi.field_b[bc.field_V].a(param1, true);
        }
        var3Lifetime1 = -72 % ((param2 + 26) / 39);
        if (bc.field_V != 8) {
          return;
        }
        vf.e(-6359);
    }

    final static ob a(String param0, int param1) {
        int var2_int = 0;
        RuntimeException var2 = null;
        int var3 = 0;
        int var4 = 0;
        int var5 = 0;
        ob stackIn_11_0 = null;
        RuntimeException stackIn_14_0 = null;
        StringBuilder stackIn_14_1 = null;
        String stackIn_15_2 = null;
        RuntimeException decompiledCaughtException = null;
        var5 = fleas.field_A ? 1 : 0;
        try {
          var2_int = param0.length();
          var3 = 0;
          if (param1 > -5) {
            field_o = (String) null;
          }
          while (var2_int > var3) {
            var4 = param0.charAt(var3);
            if (var4 < 48) {
              return null;
            }
            if (57 < var4) {
              return null;
            }
            var3++;
          }
          stackIn_11_0 = je.field_M;
          return stackIn_11_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2 = decompiledCaughtException;
          stackIn_14_0 = var2;
          stackIn_14_1 = new StringBuilder().append("oa.C(");
          if (param0 == null) {
            stackIn_15_2 = "null";
          } else {
            stackIn_15_2 = "{...}";
          }
          throw pf.a((Throwable) ((Object) stackIn_14_0), ((StringBuilder) (Object) stackIn_14_1).append(stackIn_15_2).append(',').append(param1).append(')').toString());
        }
    }

    static {
        field_n = false;
        field_m = new int[5];
    }
}
