/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class isa extends rqa {
    final nc a(nc[] param0, int param1) {
        RuntimeException var3 = null;
        nc[] var4 = null;
        nc stackIn_3_0 = null;
        RuntimeException stackIn_6_0 = null;
        StringBuilder stackIn_6_1 = null;
        String stackIn_7_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          jj.field_p = param0[0].d(0);
          if (param1 > -119) {
            var4 = (nc[]) null;
            this.a((nc[]) null, -2);
          }
          stackIn_3_0 = new nc("void");
          return stackIn_3_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3 = decompiledCaughtException;
          stackIn_6_0 = var3;
          stackIn_6_1 = new StringBuilder().append("isa.A(");
          if (param0 == null) {
            stackIn_7_2 = "null";
          } else {
            stackIn_7_2 = "{...}";
          }
          throw rta.a((Throwable) ((Object) stackIn_6_0), ((StringBuilder) (Object) stackIn_6_1).append(stackIn_7_2).append(',').append(param1).append(')').toString());
        }
    }

    final static String a(String param0, String[] param1, int param2) {
        StringBuilder discarded$2 = null;
        StringBuilder discarded$0 = null;
        StringBuilder discarded$1 = null;
        int stackIn_6_0 = 0;
        String stackIn_17_0 = null;
        int stackIn_23_0 = 0;
        String stackIn_33_0 = null;
        RuntimeException stackIn_36_0 = null;
        StringBuilder stackIn_36_1 = null;
        String stackIn_37_2 = null;
        StringBuilder stackIn_39_1 = null;
        String stackIn_40_2 = null;
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
        var11 = VoidHunters.field_G;
        try {
          var3_int = param0.length();
          var4 = var3_int;
          var5 = 0;
          while (true) {
            var6_int = param0.indexOf("<%", var5);
            if (0 <= var6_int) {
              stackIn_6_0 = var6_int + 2;
              for (var5 = stackIn_6_0; var3_int > var5; var5++) {
                if (haa.a(param0.charAt(var5), true)) {
                  continue;
                }
                break;
              }
              var7_ref_String = param0.substring(2 + var6_int, var5);
              if (!hwa.a((CharSequence) ((Object) var7_ref_String), 10)) {
                continue;
              }
              if (var5 >= var3_int) {
                continue;
              }
              if (param0.charAt(var5) != 62) {
                continue;
              }
              var5++;
              var8 = lob.a(24, (CharSequence) ((Object) var7_ref_String));
              var4 = var4 + (param1[var8].length() - var5 + var6_int);
              continue;
            }
            break;
          }
          if (param2 <= 71) {
            stackIn_17_0 = (String) null;
            return stackIn_17_0;
          }
          var6 = new StringBuilder(var4);
          var7 = 0;
          var5Lifetime1 = 0;
          while (true) {
            var8Lifetime1 = param0.indexOf("<%", var5Lifetime1);
            if (var8Lifetime1 < 0) {
              discarded$2 = var6.append(param0.substring(var7));
              stackIn_33_0 = var6.toString();
              return stackIn_33_0;
            }
            stackIn_23_0 = var8Lifetime1 + 2;
            for (var5Lifetime1 = stackIn_23_0; var3_int > var5Lifetime1; var5Lifetime1++) {
              if (haa.a(param0.charAt(var5Lifetime1), true)) {
                continue;
              }
              break;
            }
            var9 = param0.substring(var8Lifetime1 + 2, var5Lifetime1);
            if (!hwa.a((CharSequence) ((Object) var9), 10)) {
              continue;
            }
            if (var3_int <= var5Lifetime1) {
              continue;
            }
            if (62 != param0.charAt(var5Lifetime1)) {
              continue;
            }
            var5Lifetime1++;
            var10 = lob.a(-88, (CharSequence) ((Object) var9));
            discarded$0 = var6.append(param0.substring(var7, var8Lifetime1));
            var7 = var5Lifetime1;
            discarded$1 = var6.append(param1[var10]);
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3 = decompiledCaughtException;
          stackIn_36_0 = var3;
          stackIn_36_1 = new StringBuilder().append("isa.B(");
          if (param0 == null) {
            stackIn_37_2 = "null";
          } else {
            stackIn_37_2 = "{...}";
          }
          stackIn_39_1 = ((StringBuilder) (Object) stackIn_36_1).append(stackIn_37_2).append(',');
          if (param1 == null) {
            stackIn_40_2 = "null";
          } else {
            stackIn_40_2 = "{...}";
          }
          throw rta.a((Throwable) ((Object) stackIn_36_0), ((StringBuilder) (Object) stackIn_39_1).append(stackIn_40_2).append(',').append(param2).append(')').toString());
        }
    }

    isa(String param0, Class[] param1, String param2) {
        super(param0, param1, param2);
    }

    static {
    }
}
