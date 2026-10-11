/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class vg {
    static bd field_d;
    static String field_f;
    static String field_g;
    static ji field_h;
    static pg field_c;
    static int[] field_a;
    static String field_b;
    static v[] field_e;

    final static boolean a(boolean param0, String param1) {
        RuntimeException var2 = null;
        RuntimeException stackIn_13_0 = null;
        StringBuilder stackIn_13_1 = null;
        String stackIn_14_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          if (param1 != null &&
            param1.length() >= eb.field_a) {
            if (param1.length() > vd.field_D) {
              return true;
            }
            if (param0) {
              return false;
            }
            return true;
          }
          return true;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2 = decompiledCaughtException;
          stackIn_13_0 = var2;
          stackIn_13_1 = new StringBuilder().append("vg.A(").append(param0).append(',');
          if (param1 == null) {
            stackIn_14_2 = "null";
          } else {
            stackIn_14_2 = "{...}";
          }
          throw wg.a((Throwable) ((Object) stackIn_13_0), ((StringBuilder) (Object) stackIn_13_1).append(stackIn_14_2).append(')').toString());
        }
    }

    public static void a(int param0) {
        field_c = null;
        field_f = null;
        if (param0 != 2) {
          String var2 = (String) null;
          vg.a((String[]) null, 105, (String) null);
        }
        field_b = null;
        field_g = null;
        field_e = null;
        field_a = null;
        field_h = null;
        field_d = null;
    }

    final static String a(String[] args, int param1, String param2) {
        StringBuilder discarded$2 = null;
        StringBuilder discarded$0 = null;
        StringBuilder discarded$1 = null;
        int stackIn_8_0 = 0;
        String stackIn_29_0 = null;
        RuntimeException stackIn_32_0 = null;
        StringBuilder stackIn_32_1 = null;
        String stackIn_33_2 = null;
        StringBuilder stackIn_35_1 = null;
        String stackIn_36_2 = null;
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
        var11 = HostileSpawn.field_I ? 1 : 0;
        try {
          var3_int = param2.length();
          if (param1 <= 12) {
            field_f = (String) null;
          }
          var4 = var3_int;
          var5 = 0;
          while (true) {
            var6_int = param2.indexOf("<%", var5);
            if (0 <= var6_int) {
              stackIn_8_0 = var6_int + 2;
              for (var5 = stackIn_8_0; var5 < var3_int; var5++) {
                if (qh.a(param2.charAt(var5), -49)) {
                  continue;
                }
                break;
              }
              var7_ref_String = param2.substring(2 + var6_int, var5);
              if (!sf.a((byte) 95, (CharSequence) ((Object) var7_ref_String))) {
                continue;
              }
              if (var3_int <= var5) {
                continue;
              }
              if (62 != param2.charAt(var5)) {
                continue;
              }
              var5++;
              var8 = hi.a(-110, (CharSequence) ((Object) var7_ref_String));
              var4 = var4 + (var6_int - var5 + args[var8].length());
              continue;
            }
            break;
          }
          var6 = new StringBuilder(var4);
          var7 = 0;
          var5Lifetime1 = 0;
          while (true) {
            var8Lifetime1 = param2.indexOf("<%", var5Lifetime1);
            if (var8Lifetime1 < 0) {
              discarded$2 = var6.append(param2.substring(var7));
              stackIn_29_0 = var6.toString();
              return stackIn_29_0;
            }
            for (var5Lifetime1 = var8Lifetime1 + 2; var5Lifetime1 < var3_int; var5Lifetime1++) {
              if (qh.a(param2.charAt(var5Lifetime1), -49)) {
                continue;
              }
              break;
            }
            var9 = param2.substring(var8Lifetime1 + 2, var5Lifetime1);
            if (!sf.a((byte) 80, (CharSequence) ((Object) var9))) {
              continue;
            }
            if (var3_int <= var5Lifetime1) {
              continue;
            }
            if (62 != param2.charAt(var5Lifetime1)) {
              continue;
            }
            var5Lifetime1++;
            var10 = hi.a(-29, (CharSequence) ((Object) var9));
            discarded$0 = var6.append(param2.substring(var7, var8Lifetime1));
            var7 = var5Lifetime1;
            discarded$1 = var6.append(args[var10]);
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3 = decompiledCaughtException;
          stackIn_32_0 = var3;
          stackIn_32_1 = new StringBuilder().append("vg.C(");
          if (args == null) {
            stackIn_33_2 = "null";
          } else {
            stackIn_33_2 = "{...}";
          }
          stackIn_35_1 = ((StringBuilder) (Object) stackIn_32_1).append(stackIn_33_2).append(',').append(param1).append(',');
          if (param2 == null) {
            stackIn_36_2 = "null";
          } else {
            stackIn_36_2 = "{...}";
          }
          throw wg.a((Throwable) ((Object) stackIn_32_0), ((StringBuilder) (Object) stackIn_35_1).append(stackIn_36_2).append(')').toString());
        }
    }

    static {
        field_g = "Player";
        field_b = "Head to the bridge to download the mission data disc.";
        field_f = "Player names can be up to 12 letters, numbers and underscores";
    }
}
