/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class ff {
    static t field_c;
    static boolean field_a;
    static int field_b;

    final static String a(String[] args, int param1, String param2) {
        StringBuilder discarded$0 = null;
        StringBuilder discarded$1 = null;
        StringBuilder discarded$2 = null;
        int stackIn_6_0 = 0;
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
        var11 = Torquing.field_u;
        try {
          var3_int = param2.length();
          var4 = var3_int;
          var5 = 0;
          while (true) {
            var6_int = param2.indexOf("<%", var5);
            if (var6_int >= 0) {
              stackIn_6_0 = 2 + var6_int;
              for (var5 = stackIn_6_0; var3_int > var5; var5++) {
                if (ui.a(-112, param2.charAt(var5))) {
                  continue;
                }
                break;
              }
              var7_ref_String = param2.substring(2 + var6_int, var5);
              if (!ip.a((byte) -109, (CharSequence) ((Object) var7_ref_String))) {
                continue;
              }
              if (var3_int <= var5) {
                continue;
              }
              if (param2.charAt(var5) != 62) {
                continue;
              }
              var5++;
              var8 = kc.a((byte) -94, (CharSequence) ((Object) var7_ref_String));
              var4 = var4 + (-var5 + var6_int + args[var8].length());
              continue;
            }
            break;
          }
          var6 = new StringBuilder(var4);
          var7 = param1;
          var5Lifetime1 = 0;
          while (true) {
            var8Lifetime1 = param2.indexOf("<%", var5Lifetime1);
            if (var8Lifetime1 < 0) {
              discarded$0 = var6.append(param2.substring(var7));
              stackIn_27_0 = var6.toString();
              return stackIn_27_0;
            }
            for (var5Lifetime1 = 2 + var8Lifetime1; var5Lifetime1 < var3_int; var5Lifetime1++) {
              if (ui.a(57, param2.charAt(var5Lifetime1))) {
                continue;
              }
              break;
            }
            var9 = param2.substring(2 + var8Lifetime1, var5Lifetime1);
            if (!ip.a((byte) -101, (CharSequence) ((Object) var9))) {
              continue;
            }
            if (var3_int <= var5Lifetime1) {
              continue;
            }
            if (param2.charAt(var5Lifetime1) != 62) {
              continue;
            }
            var5Lifetime1++;
            var10 = kc.a((byte) -67, (CharSequence) ((Object) var9));
            discarded$1 = var6.append(param2.substring(var7, var8Lifetime1));
            discarded$2 = var6.append(args[var10]);
            var7 = var5Lifetime1;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3 = decompiledCaughtException;
          stackIn_30_0 = var3;
          stackIn_30_1 = new StringBuilder().append("ff.C(");
          if (args == null) {
            stackIn_31_2 = "null";
          } else {
            stackIn_31_2 = "{...}";
          }
          stackIn_33_1 = ((StringBuilder) (Object) stackIn_30_1).append(stackIn_31_2).append(',').append(param1).append(',');
          if (param2 == null) {
            stackIn_34_2 = "null";
          } else {
            stackIn_34_2 = "{...}";
          }
          throw rb.a((Throwable) ((Object) stackIn_30_0), ((StringBuilder) (Object) stackIn_33_1).append(stackIn_34_2).append(')').toString());
        }
    }

    final static String a(int param0, char param1, boolean param2) {
        int var4 = 0;
        int var5 = Torquing.field_u;
        char[] var6 = new char[param0];
        char[] var3 = var6;
        if (!param2) {
          return (String) null;
        }
        for (var4 = 0; param0 > var4; var4++) {
          var6[var4] = param1;
        }
        return new String(var6);
    }

    public static void a(int param0) {
        field_c = null;
        if (param0 > -44) {
          field_c = (t) null;
        }
    }

    static {
        field_c = new t(270, 70);
    }
}
