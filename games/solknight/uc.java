/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class uc {
    static int field_b;
    static int field_f;
    static int field_c;
    static int field_e;
    static nc field_j;
    static String field_d;
    static mg field_g;
    static nc field_a;
    static int field_i;
    static String[] field_h;
    static String field_k;

    final static String a(int param0, char param1, int param2) {
        int var4 = 0;
        int var5 = SolKnight.field_L ? 1 : 0;
        if (param0 > -54) {
          uc.a(49);
        }
        char[] var6 = new char[param2];
        char[] var3 = var6;
        for (var4 = 0; var4 < param2; var4++) {
          var6[var4] = param1;
        }
        return new String(var6);
    }

    final static int a(int param0, int param1, int param2) {
        int var3_int = 0;
        RuntimeException var3 = null;
        int var4 = 0;
        int var5 = 0;
        int var6 = 0;
        int var7 = 0;
        int var8 = 0;
        int stackIn_9_0 = 0;
        int stackIn_15_0 = 0;
        RuntimeException decompiledCaughtException = null;
        var8 = SolKnight.field_L ? 1 : 0;
        try {
          var3_int = 0;
          var4 = th.field_J;
          while (vc.field_d.length > var3_int) {
            var5 = oa.field_l[var3_int];
            if (var5 >= 0) {
              var6 = fa.a(vc.field_d[var3_int], true, (byte) 99);
              var4 = var4 + vg.field_N;
              var7 = sb.field_d - (var6 >> 1);
              if (gh.a(var4, we.field_c + (g.field_l << 1), param0, var6 + (bl.field_i << 1), 16777215, param2, -bl.field_i + var7)) {
                stackIn_9_0 = var5;
                return stackIn_9_0;
              }
              var4 = var4 + (we.field_c + vg.field_N + (g.field_l << 1));
            } else {
              var4 = var4 + field_i;
            }
            var3_int++;
          }
          if (param1 != 1691746689) {
            field_k = (String) null;
          }
          stackIn_15_0 = -1;
          return stackIn_15_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3 = decompiledCaughtException;
          throw fc.a((Throwable) ((Object) var3), "uc.C(" + param0 + ',' + param1 + ',' + param2 + ')');
        }
    }

    final static String a(boolean param0, CharSequence param1, int param2) {
        int var6 = 0;
        int var3_int = 0;
        RuntimeException var3 = null;
        String var4 = null;
        int var5 = 0;
        int var7 = 0;
        int var8 = 0;
        String stackIn_3_0 = null;
        String stackIn_8_0 = null;
        String stackIn_13_0 = null;
        String stackIn_18_0 = null;
        String stackIn_28_0 = null;
        String stackIn_33_0 = null;
        RuntimeException stackIn_36_0 = null;
        StringBuilder stackIn_36_1 = null;
        String stackIn_37_2 = null;
        RuntimeException decompiledCaughtException = null;
        var8 = SolKnight.field_L ? 1 : 0;
        try {
          if (param1 == null) {
            stackIn_3_0 = rk.field_b;
            return stackIn_3_0;
          }
          var3_int = param1.length();
          if (var3_int >= 1 &&
            12 >= var3_int) {
            var4 = jg.a(param1, -2);
            if (var4 != null &&
              1 <= var4.length()) {
              if (!ck.a(var4.charAt(0), true) &&
                !ck.a(var4.charAt(var4.length() - 1), true)) {
                var5 = 0;
                for (var6 = param2; param1.length() > var6; var6++) {
                  var7 = param1.charAt(var6);
                  if (ck.a((char) var7, true)) {
                    var5++;
                  } else {
                    var5 = 0;
                  }
                  if (var5 >= 2 &&
                    !param0) {
                    stackIn_28_0 = td.field_n;
                    return stackIn_28_0;
                  }
                }
                if (var5 <= 0) {
                  return null;
                }
                stackIn_33_0 = qf.field_f;
                return stackIn_33_0;
              }
              stackIn_18_0 = qf.field_f;
              return stackIn_18_0;
            }
            stackIn_13_0 = rk.field_b;
            return stackIn_13_0;
          }
          stackIn_8_0 = rk.field_b;
          return stackIn_8_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3 = decompiledCaughtException;
          stackIn_36_0 = var3;
          stackIn_36_1 = new StringBuilder().append("uc.B(").append(param0).append(',');
          if (param1 == null) {
            stackIn_37_2 = "null";
          } else {
            stackIn_37_2 = "{...}";
          }
          throw fc.a((Throwable) ((Object) stackIn_36_0), ((StringBuilder) (Object) stackIn_36_1).append(stackIn_37_2).append(',').append(param2).append(')').toString());
        }
    }

    public static void a(int param0) {
        field_h = null;
        field_a = null;
        field_g = null;
        int var1 = 7 / ((param0 + 35) / 46);
        field_d = null;
        field_j = null;
        field_k = null;
    }

    static {
        pg.a(50, 1);
        field_j = new nc();
        field_d = "Passwords must be between 5 and 20 letters and numbers";
        field_a = new nc();
        field_k = "Player names can be up to 12 letters, numbers and underscores";
        field_h = new String[]{"Defender of Humanity", "Warrior of the Void", "Heavenly Guardian", "Astral Avenger", "Rock Crusher", "Lord of the System", "Earth's Last Hope", "Revenge of the Rock Scum"};
    }
}
