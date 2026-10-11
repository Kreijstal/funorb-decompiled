/*
 * Decompiled by CFR-JS 0.4.0.
 */
abstract class sd {
    static volatile boolean field_a;
    static int field_c;
    static int[] field_b;

    abstract void a(int param0, th param1);

    abstract kb a(boolean param0);

    public static void a(byte param0) {
        if (param0 != -123) {
          sd.a((byte) 102);
        }
        field_b = null;
    }

    final static String a(String param0, String[] param1, boolean param2) {
        StringBuilder discarded$2 = null;
        StringBuilder discarded$0 = null;
        StringBuilder discarded$1 = null;
        String stackIn_26_0 = null;
        RuntimeException stackIn_29_0 = null;
        StringBuilder stackIn_29_1 = null;
        String stackIn_30_2 = null;
        StringBuilder stackIn_32_1 = null;
        String stackIn_33_2 = null;
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
        var11 = HoldTheLine.field_D;
        try {
          var3_int = param0.length();
          var4 = var3_int;
          var5 = 0;
          if (!param2) {
            field_c = 69;
          }
          while (true) {
            var6_int = param0.indexOf("<%", var5);
            if (var6_int >= 0) {
              for (var5 = 2 + var6_int; var3_int > var5; var5++) {
                if (ii.a(48, param0.charAt(var5))) {
                  continue;
                }
                break;
              }
              var7_ref_String = param0.substring(2 + var6_int, var5);
              if (!ik.a((CharSequence) ((Object) var7_ref_String), true)) {
                continue;
              }
              if (var3_int <= var5) {
                continue;
              }
              if (param0.charAt(var5) != 62) {
                continue;
              }
              var5++;
              var8 = mo.a((CharSequence) ((Object) var7_ref_String), (byte) -116);
              var4 = var4 + (param1[var8].length() + (-var5 + var6_int));
              continue;
            }
            break;
          }
          var6 = new StringBuilder(var4);
          var7 = 0;
          var5Lifetime1 = 0;
          while (true) {
            var8Lifetime1 = param0.indexOf("<%", var5Lifetime1);
            if (var8Lifetime1 < 0) {
              discarded$2 = var6.append(param0.substring(var7));
              stackIn_26_0 = var6.toString();
              return stackIn_26_0;
            }
            for (var5Lifetime1 = 2 + var8Lifetime1; var5Lifetime1 < var3_int; var5Lifetime1++) {
              if (ii.a(48, param0.charAt(var5Lifetime1))) {
                continue;
              }
              break;
            }
            var9 = param0.substring(2 + var8Lifetime1, var5Lifetime1);
            if (!ik.a((CharSequence) ((Object) var9), true)) {
              continue;
            }
            if (var3_int <= var5Lifetime1) {
              continue;
            }
            if (param0.charAt(var5Lifetime1) != 62) {
              continue;
            }
            var5Lifetime1++;
            var10 = mo.a((CharSequence) ((Object) var9), (byte) -116);
            discarded$0 = var6.append(param0.substring(var7, var8Lifetime1));
            var7 = var5Lifetime1;
            discarded$1 = var6.append(param1[var10]);
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3 = decompiledCaughtException;
          stackIn_29_0 = var3;
          stackIn_29_1 = new StringBuilder().append("sd.I(");
          if (param0 == null) {
            stackIn_30_2 = "null";
          } else {
            stackIn_30_2 = "{...}";
          }
          stackIn_32_1 = ((StringBuilder) (Object) stackIn_29_1).append(stackIn_30_2).append(',');
          if (param1 == null) {
            stackIn_33_2 = "null";
          } else {
            stackIn_33_2 = "{...}";
          }
          throw kk.a((Throwable) ((Object) stackIn_29_0), ((StringBuilder) (Object) stackIn_32_1).append(stackIn_33_2).append(',').append(param2).append(')').toString());
        }
    }

    final static int a(byte param0, io param1, io param2) {
        int var3_int = 0;
        RuntimeException var3 = null;
        String var4 = null;
        int stackIn_1_0 = 0;
        RuntimeException stackIn_4_0 = null;
        StringBuilder stackIn_4_1 = null;
        String stackIn_5_2 = null;
        StringBuilder stackIn_7_1 = null;
        String stackIn_8_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          var3_int = -29 / ((-76 - param0) / 48);
          var4 = (String) null;
          stackIn_1_0 = cc.a(65500, 0, 0, param2, false, (String) null, param1);
          return stackIn_1_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3 = decompiledCaughtException;
          stackIn_4_0 = var3;
          stackIn_4_1 = new StringBuilder().append("sd.K(").append(param0).append(',');
          if (param1 == null) {
            stackIn_5_2 = "null";
          } else {
            stackIn_5_2 = "{...}";
          }
          stackIn_7_1 = ((StringBuilder) (Object) stackIn_4_1).append(stackIn_5_2).append(',');
          if (param2 == null) {
            stackIn_8_2 = "null";
          } else {
            stackIn_8_2 = "{...}";
          }
          throw kk.a((Throwable) ((Object) stackIn_4_0), ((StringBuilder) (Object) stackIn_7_1).append(stackIn_8_2).append(')').toString());
        }
    }

    final static boolean a(char param0, byte param1) {
        char[] var2 = null;
        RuntimeException var2_ref = null;
        int var3 = 0;
        int var4 = 0;
        int var5 = 0;
        char[] var6 = null;
        int var7 = 0;
        RuntimeException decompiledCaughtException = null;
        char[] var2Lifetime1;
        int var3Lifetime1;
        int var4Lifetime1;
        var5 = HoldTheLine.field_D;
        try {
          if (Character.isISOControl(param0)) {
            return false;
          }
          if (dg.a((byte) 78, param0)) {
            return true;
          }
          var6 = rg.field_h;
          var2 = var6;
          for (var3 = 0; var6.length > var3; var3++) {
            var4 = var6[var3];
            if (~param0 == ~var4) {
              return true;
            }
          }
          var2Lifetime1 = nn.field_f;
          if (param1 > -48) {
            return true;
          }
          var7 = 0;
          var3Lifetime1 = var7;
          while (true) {
            if (var2Lifetime1.length <= var7) {
              return false;
            }
            var4Lifetime1 = var2Lifetime1[var7];
            if (var4Lifetime1 != param0) {
              var7++;
              continue;
            }
            break;
          }
          return true;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2_ref = decompiledCaughtException;
          throw kk.a((Throwable) ((Object) var2_ref), "sd.J(" + param0 + ',' + param1 + ')');
        }
    }

    static {
        field_a = false;
        field_b = new int[8192];
    }
}
