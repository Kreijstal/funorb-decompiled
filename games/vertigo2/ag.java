/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class ag {
    static nj field_b;
    static String field_c;
    static String[] field_a;

    final static aa a(cr param0, cr param1, int param2, int[] param3, cr param4) {
        int var10_int = 0;
        int var5_int = 0;
        String[] var6 = null;
        char[] var7 = null;
        aa[] var8 = null;
        int var9 = 0;
        q var11 = null;
        int var12 = 0;
        char[] var13 = null;
        char[] var14 = null;
        Object stackIn_9_0 = null;
        aa stackIn_11_0 = null;
        RuntimeException stackIn_14_0 = null;
        StringBuilder stackIn_14_1 = null;
        String stackIn_15_2 = null;
        StringBuilder stackIn_17_1 = null;
        String stackIn_18_2 = null;
        StringBuilder stackIn_20_1 = null;
        String stackIn_21_2 = null;
        StringBuilder stackIn_23_1 = null;
        String stackIn_24_2 = null;
        Throwable decompiledCaughtException = null;
        RuntimeException var5 = null;
        Exception var10 = null;
        var12 = Vertigo2.field_L ? 1 : 0;
        try {
          var5_int = param3.length;
          if (param2 <= 0) {
            field_c = (String) null;
          }
          var6 = new String[var5_int];
          var14 = new char[var5_int];
          var13 = var14;
          var7 = var13;
          var8 = new aa[var5_int];
          var9 = 49;
          try {
            for (var10_int = 0; var10_int < var5_int; var10_int++) {
              var11 = wm.field_k.a(1, param3[var10_int]);
              var6[var10_int] = var11.h(33);
              var9 = (char)(var9 + 1);
              var7[var10_int] = (char)var9;
              var8[var10_int] = null;
            }
          } catch (java.lang.Exception decompiledCaughtParameter0) {
            decompiledCaughtException = decompiledCaughtParameter0;
            var10 = (Exception) (Object) decompiledCaughtException;
            stackIn_9_0 = null;
            return (aa) (stackIn_9_0);
          }
          stackIn_11_0 = new aa(0L, param4, param1, param0, var8, param3, var6, var14);
          return stackIn_11_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter1) {
          decompiledCaughtException = decompiledCaughtParameter1;
          var5 = (RuntimeException) (Object) decompiledCaughtException;
          stackIn_14_0 = var5;
          stackIn_14_1 = new StringBuilder().append("ag.A(");
          if (param0 == null) {
            stackIn_15_2 = "null";
          } else {
            stackIn_15_2 = "{...}";
          }
          stackIn_17_1 = ((StringBuilder) (Object) stackIn_14_1).append(stackIn_15_2).append(',');
          if (param1 == null) {
            stackIn_18_2 = "null";
          } else {
            stackIn_18_2 = "{...}";
          }
          stackIn_20_1 = ((StringBuilder) (Object) stackIn_17_1).append(stackIn_18_2).append(',').append(param2).append(',');
          if (param3 == null) {
            stackIn_21_2 = "null";
          } else {
            stackIn_21_2 = "{...}";
          }
          stackIn_23_1 = ((StringBuilder) (Object) stackIn_20_1).append(stackIn_21_2).append(',');
          if (param4 == null) {
            stackIn_24_2 = "null";
          } else {
            stackIn_24_2 = "{...}";
          }
          throw wn.a((Throwable) ((Object) stackIn_14_0), ((StringBuilder) (Object) stackIn_23_1).append(stackIn_24_2).append(')').toString());
        }
    }

    public static void a(int param0) {
        field_b = null;
        if (param0 != -2883) {
          return;
        }
        field_a = null;
        field_c = null;
    }

    final static boolean b(int param0) {
        if (param0 != 49) {
          ag.b(-63);
        }
        return sq.field_c;
    }

    static {
        field_b = new nj();
        field_c = "Passwords must be between 5 and 20 letters and numbers";
        field_a = new String[]{"Contains enough paint for five tiles; comes in blue and purple.", "This is worth 100 points.", "Lets you destroy blocks around you; use it to save paint.", "Pick this up to gain an extra life!", "Lets you jump higher than normal. Each jetpack has enough fuel for one use.", "Saves the level so that, if you die, you'll start from when you touched it.", "Shows the entire level to aid navigation."};
    }
}
