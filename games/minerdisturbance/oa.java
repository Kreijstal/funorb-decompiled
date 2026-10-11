/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class oa {
    final static eg a(int param0) {
        if (null == kj.field_c) {
          kj.field_c = new eg(sl.field_q, 20, 0, 0, 0, 11579568, -1, 0, 0, sl.field_q.field_I, -1, 2147483647, true);
        }
        if (param0 != 0) {
          return (eg) null;
        }
        return kj.field_c;
    }

    final static String a(byte param0, String param1, String[] param2) {
        StringBuilder discarded$0 = null;
        StringBuilder discarded$1 = null;
        StringBuilder discarded$2 = null;
        String stackIn_15_0 = null;
        String stackIn_28_0 = null;
        RuntimeException stackIn_31_0 = null;
        StringBuilder stackIn_31_1 = null;
        String stackIn_32_2 = null;
        StringBuilder stackIn_34_1 = null;
        String stackIn_35_2 = null;
        RuntimeException decompiledCaughtException = null;
        int var3_int = 0;
        RuntimeException var3 = null;
        int var4 = 0;
        int var5 = 0;
        int var6_int = 0;
        StringBuilder var6 = null;
        int var7 = 0;
        String var7_ref_String = null;
        int var8 = 0;
        String var9 = null;
        int var10 = 0;
        int var11 = 0;
        int var5Lifetime1;
        int var8Lifetime1;
        var11 = MinerDisturbance.field_ab;
        try {
          var3_int = param1.length();
          var4 = var3_int;
          var5 = 0;
          while (true) {
            var6_int = param1.indexOf("<%", var5);
            if (0 <= var6_int) {
              for (var5 = var6_int + 2; var3_int > var5; var5++) {
                if (g.a(param1.charAt(var5), (byte) -68)) {
                  continue;
                }
                break;
              }
              var7_ref_String = param1.substring(var6_int + 2, var5);
              if (!oi.a(-19804, (CharSequence) ((Object) var7_ref_String))) {
                continue;
              }
              if (var3_int <= var5) {
                continue;
              }
              if (param1.charAt(var5) != 62) {
                continue;
              }
              var5++;
              var8 = md.a((CharSequence) ((Object) var7_ref_String), true);
              var4 = var4 + (param2[var8].length() - var5 + var6_int);
              continue;
            }
            break;
          }
          if (param0 >= -70) {
            stackIn_15_0 = (String) null;
            return stackIn_15_0;
          }
          var6 = new StringBuilder(var4);
          var7 = 0;
          var5Lifetime1 = 0;
          while (true) {
            var8Lifetime1 = param1.indexOf("<%", var5Lifetime1);
            if (var8Lifetime1 < 0) {
              discarded$0 = var6.append(param1.substring(var7));
              stackIn_28_0 = var6.toString();
              return stackIn_28_0;
            }
            for (var5Lifetime1 = var8Lifetime1 + 2; var5Lifetime1 < var3_int; var5Lifetime1++) {
              if (g.a(param1.charAt(var5Lifetime1), (byte) -68)) {
                continue;
              }
              break;
            }
            var9 = param1.substring(var8Lifetime1 + 2, var5Lifetime1);
            if (!oi.a(-19804, (CharSequence) ((Object) var9))) {
              continue;
            }
            if (var5Lifetime1 >= var3_int) {
              continue;
            }
            if (param1.charAt(var5Lifetime1) != 62) {
              continue;
            }
            var5Lifetime1++;
            var10 = md.a((CharSequence) ((Object) var9), true);
            discarded$1 = var6.append(param1.substring(var7, var8Lifetime1));
            var7 = var5Lifetime1;
            discarded$2 = var6.append(param2[var10]);
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3 = decompiledCaughtException;
          stackIn_31_0 = var3;
          stackIn_31_1 = new StringBuilder().append("oa.B(").append(param0).append(',');
          if (param1 == null) {
            stackIn_32_2 = "null";
          } else {
            stackIn_32_2 = "{...}";
          }
          stackIn_34_1 = ((StringBuilder) (Object) stackIn_31_1).append(stackIn_32_2).append(',');
          if (param2 == null) {
            stackIn_35_2 = "null";
          } else {
            stackIn_35_2 = "{...}";
          }
          throw lj.a((Throwable) ((Object) stackIn_31_0), ((StringBuilder) (Object) stackIn_34_1).append(stackIn_35_2).append(')').toString());
        }
    }

    static {
    }
}
