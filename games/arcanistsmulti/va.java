/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class va implements pf {
    static String field_a;
    static eg field_c;
    static String field_b;
    static String field_d;
    static String field_e;

    public final void a(qm param0, int param1, int param2, int param3, boolean param4) {
        RuntimeException stackIn_19_0 = null;
        StringBuilder stackIn_19_1 = null;
        String stackIn_20_2 = null;
        RuntimeException decompiledCaughtException = null;
        int var6_int = 0;
        RuntimeException var6 = null;
        int var7 = 0;
        int var8 = 0;
        int var9 = 0;
        int var10 = 0;
        int var6_intLifetime1;
        int var7Lifetime1;
        int var8Lifetime1;
        var10 = ArcanistsMulti.field_G ? 1 : 0;
        try {
          for (var6_int = 0; var6_int <= param0.field_k; var6_int++) {
            var7 = 48 * var6_int / param0.field_k + 152;
            var8 = var7 | (var7 << 8 | var7 << 16);
            de.f(param0.field_n + param2, param3 - (-param0.field_j - var6_int), param0.field_v, var8);
          }
          if (param1 != 5592405) {
            return;
          }
          for (var6_intLifetime1 = 1; 5 >= var6_intLifetime1; var6_intLifetime1++) {
            var7Lifetime1 = var6_intLifetime1 + (-5 - (param0.field_v >> 1) + (param0.field_n + param2) + param0.field_v);
            var8Lifetime1 = (param0.field_v >> 1) - var6_intLifetime1 * 2;
            var9 = var6_intLifetime1 + (param3 + param0.field_j + (-4 + param0.field_k >> 1));
            if (var9 >= de.field_c &&
              var9 < de.field_k) {
              if (var7Lifetime1 > de.field_i) {
                de.field_l[-1 + (de.field_e * var9 + var7Lifetime1)] = dg.a(16711422, de.field_l[de.field_e * var9 + var7Lifetime1 - 1]) >> 1;
              }
              if (de.field_h > var8Lifetime1 + var7Lifetime1) {
                de.field_l[var9 * de.field_e + var7Lifetime1 + var8Lifetime1] = dg.a(16711422, de.field_l[de.field_e * var9 + var7Lifetime1 + var8Lifetime1]) >> 1;
              }
            }
            de.f(var7Lifetime1, var9, var8Lifetime1, 0);
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var6 = decompiledCaughtException;
          stackIn_19_0 = var6;
          stackIn_19_1 = new StringBuilder().append("va.A(");
          if (param0 == null) {
            stackIn_20_2 = "null";
          } else {
            stackIn_20_2 = "{...}";
          }
          throw aa.a((Throwable) ((Object) stackIn_19_0), ((StringBuilder) (Object) stackIn_19_1).append(stackIn_20_2).append(',').append(param1).append(',').append(param2).append(',').append(param3).append(',').append(param4).append(')').toString());
        }
    }

    final static boolean a(long param0, int param1, int[] param2, String param3, int param4) {
        ij var6 = null;
        RuntimeException var6_ref = null;
        CharSequence var7 = null;
        RuntimeException stackIn_9_0 = null;
        StringBuilder stackIn_9_1 = null;
        String stackIn_10_2 = null;
        StringBuilder stackIn_12_1 = null;
        String stackIn_13_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          if (!wj.a(param3, param2, param4, 2, param0)) {
            return false;
          }
          if (param4 == param1) {
            param4 = 0;
          }
          nj.field_c = param4;
          so.field_p = param3;
          var7 = (CharSequence) ((Object) param3);
          ua.field_S = gk.a(var7, param1 ^ -14);
          gg.field_e = param0;
          var6 = ff.a(param2, 49, gl.field_c, mj.field_z, ab.field_p);
          ag.a(var6, (byte) -104);
          return true;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var6_ref = decompiledCaughtException;
          stackIn_9_0 = var6_ref;
          stackIn_9_1 = new StringBuilder().append("va.B(").append(param0).append(',').append(param1).append(',');
          if (param2 == null) {
            stackIn_10_2 = "null";
          } else {
            stackIn_10_2 = "{...}";
          }
          stackIn_12_1 = ((StringBuilder) (Object) stackIn_9_1).append(stackIn_10_2).append(',');
          if (param3 == null) {
            stackIn_13_2 = "null";
          } else {
            stackIn_13_2 = "{...}";
          }
          throw aa.a((Throwable) ((Object) stackIn_9_0), ((StringBuilder) (Object) stackIn_12_1).append(stackIn_13_2).append(',').append(param4).append(')').toString());
        }
    }

    public static void a(int param0) {
        field_c = null;
        field_e = null;
        if (param0 < 110) {
          field_a = (String) null;
        }
        field_a = null;
        field_d = null;
        field_b = null;
    }

    static {
        field_a = "  If you don't like playing Team Games, just select the <col=ffffff>Free-For-All</col> button on the game creation screen.";
        field_b = "Imps can use the Self Destruct spell. This spell causes the Imp to explode, damaging anything nearby - the more health the Imp has, the more damage the explosion causes. It also has the effect of healing any other imps caught in the blast, which can lead to some very dangerous Imps...<br>Select an Imp's Self Destruct spell";
        field_d = "Only show private chat from my friends and opponents";
    }
}
