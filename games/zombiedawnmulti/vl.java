/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class vl extends br {
    int field_g;
    static ja field_k;
    int field_i;
    static String[] field_j;
    static int field_h;
    static ri field_f;

    final static String a(String param0, String[] param1, int param2) {
        StringBuilder discarded$0 = null;
        StringBuilder discarded$1 = null;
        StringBuilder discarded$2 = null;
        String stackIn_16_0 = null;
        String stackIn_27_0 = null;
        RuntimeException stackIn_30_0 = null;
        StringBuilder stackIn_30_1 = null;
        String stackIn_31_2 = null;
        StringBuilder stackIn_33_1 = null;
        String stackIn_34_2 = null;
        RuntimeException decompiledCaughtException = null;
        int var3_int = 0;
        RuntimeException var3 = null;
        int var4 = 0;
        int var5 = 0;
        int var6_int = 0;
        StringBuilder var6 = null;
        String var7_ref_String = null;
        int var7 = 0;
        int var8 = 0;
        String var9 = null;
        int var10 = 0;
        int var11 = 0;
        int var5Lifetime1;
        int var8Lifetime1;
        var11 = ZombieDawnMulti.field_E ? 1 : 0;
        try {
          var3_int = param0.length();
          var4 = var3_int;
          var5 = 0;
          while (true) {
            var6_int = param0.indexOf("<%", var5);
            if (var6_int >= 0) {
              for (var5 = var6_int + 2; var5 < var3_int; var5++) {
                if (vh.a(param0.charAt(var5), (byte) 85)) {
                  continue;
                }
                break;
              }
              var7_ref_String = param0.substring(2 + var6_int, var5);
              if (!ti.a((byte) 87, (CharSequence) ((Object) var7_ref_String))) {
                continue;
              }
              if (var5 >= var3_int) {
                continue;
              }
              if (param0.charAt(var5) != 62) {
                continue;
              }
              var5++;
              var8 = md.a((CharSequence) ((Object) var7_ref_String), -9159);
              var4 = var4 + (var6_int - (var5 - param1[var8].length()));
              continue;
            }
            break;
          }
          var6 = new StringBuilder(var4);
          var7 = 0;
          var5Lifetime1 = 0;
          if (param2 != 2) {
            stackIn_16_0 = (String) null;
            return stackIn_16_0;
          }
          while (true) {
            var8Lifetime1 = param0.indexOf("<%", var5Lifetime1);
            if (var8Lifetime1 < 0) {
              discarded$0 = var6.append(param0.substring(var7));
              stackIn_27_0 = var6.toString();
              return stackIn_27_0;
            }
            for (var5Lifetime1 = var8Lifetime1 + 2; var3_int > var5Lifetime1; var5Lifetime1++) {
              if (vh.a(param0.charAt(var5Lifetime1), (byte) 85)) {
                continue;
              }
              break;
            }
            var9 = param0.substring(var8Lifetime1 + 2, var5Lifetime1);
            if (!ti.a((byte) 74, (CharSequence) ((Object) var9))) {
              continue;
            }
            if (var5Lifetime1 >= var3_int) {
              continue;
            }
            if (param0.charAt(var5Lifetime1) != 62) {
              continue;
            }
            var5Lifetime1++;
            var10 = md.a((CharSequence) ((Object) var9), param2 ^ -9157);
            discarded$1 = var6.append(param0.substring(var7, var8Lifetime1));
            var7 = var5Lifetime1;
            discarded$2 = var6.append(param1[var10]);
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3 = decompiledCaughtException;
          stackIn_30_0 = var3;
          stackIn_30_1 = new StringBuilder().append("vl.B(");
          if (param0 == null) {
            stackIn_31_2 = "null";
          } else {
            stackIn_31_2 = "{...}";
          }
          stackIn_33_1 = ((StringBuilder) (Object) stackIn_30_1).append(stackIn_31_2).append(',');
          if (param1 == null) {
            stackIn_34_2 = "null";
          } else {
            stackIn_34_2 = "{...}";
          }
          throw fa.a((Throwable) ((Object) stackIn_30_0), ((StringBuilder) (Object) stackIn_33_1).append(stackIn_34_2).append(',').append(param2).append(')').toString());
        }
    }

    final static void a(pd param0, pd param1, int param2, int param3, int param4, int param5) {
        try {
          wk.field_G = param4;
          no.field_Gb = param3;
          al.field_bb = param5;
          mc.field_a = param0;
          en.field_d = param1;
          if (param2 <= 43) {
            pd var7 = (pd) null;
            vl.a((pd) null, (pd) null, -67, -110, -57, -56);
          }
        } catch (RuntimeException runtimeException) {
          throw fa.a((Throwable) ((Object) runtimeException), "vl.C(" + (param0 != null ? "{...}" : "null") + ',' + (param1 != null ? "{...}" : "null") + ',' + param2 + ',' + param3 + ',' + param4 + ',' + param5 + ')');
        }
    }

    public static void a(int param0) {
        if (param0 != 0) {
          field_f = (ri) null;
        }
        field_j = null;
        field_k = null;
        field_f = null;
    }

    final static int a(int param0, byte param1) {
        if (param1 != -103) {
          field_h = -19;
        }
        int var2 = param0 >>> 1;
        var2 = var2 | var2 >>> 1;
        var2 = var2 | var2 >>> 2;
        var2 = var2 | var2 >>> 4;
        var2 = var2 | var2 >>> 8;
        var2 = var2 | var2 >>> 16;
        return param0 & ~var2;
    }

    private vl() throws Throwable {
        throw new Error();
    }

    static {
        field_j = new String[]{"By rating", "By win percentage"};
    }
}
