/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class c {
    static int[] field_b;
    private static int[] field_e;
    static int field_a;
    static String field_c;
    static String field_f;
    static mg field_d;

    final static String a(CharSequence param0, boolean param1) {
        int var6 = 0;
        StringBuilder discarded$0 = null;
        Object stackIn_18_0 = null;
        RuntimeException stackIn_31_0 = null;
        StringBuilder stackIn_31_1 = null;
        String stackIn_32_2 = null;
        RuntimeException decompiledCaughtException = null;
        int var2_int = 0;
        RuntimeException var2 = null;
        int var3 = 0;
        int var4 = 0;
        StringBuilder var5 = null;
        int var7 = 0;
        int var8 = 0;
        int var9 = 0;
        var9 = Virogrid.field_F ? 1 : 0;
        try {
          if (param0 == null) {
            return null;
          }
          var2_int = 0;
          var3 = param0.length();
          while (var2_int < var3) {
            if (ck.a(param0.charAt(var2_int), -46)) {
              var2_int++;
              continue;
            }
            break;
          }
          while (var3 > var2_int) {
            if (ck.a(param0.charAt(var3 - 1), -46)) {
              var3--;
              continue;
            }
            break;
          }
          if (!param1) {
            c.a(true);
          }
          var4 = -var2_int + var3;
          if (var4 < 1) {
            return null;
          }
          if (var4 > 12) {
            stackIn_18_0 = null;
            return (String) (stackIn_18_0);
          }
          var5 = new StringBuilder(var4);
          for (var6 = var2_int; var3 > var6; var6++) {
            var7 = param0.charAt(var6);
            if (bn.a(-110, (char) var7)) {
              var8 = dm.a((char) var7, (byte) 4);
              if (var8 != 0) {
                discarded$0 = var5.append((char) var8);
              }
            }
          }
          if (var5.length() != 0) {
            return var5.toString();
          }
          return null;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2 = decompiledCaughtException;
          stackIn_31_0 = var2;
          stackIn_31_1 = new StringBuilder().append("c.C(");
          if (param0 == null) {
            stackIn_32_2 = "null";
          } else {
            stackIn_32_2 = "{...}";
          }
          throw kg.a((Throwable) ((Object) stackIn_31_0), ((StringBuilder) (Object) stackIn_31_1).append(stackIn_32_2).append(',').append(param1).append(')').toString());
        }
    }

    final static short[] a(short[] param0, int param1, int param2, hg param3) {
        int var4_int = 0;
        int var5 = 0;
        int var6 = 0;
        int var7 = 0;
        int var8 = 0;
        short[] stackIn_3_0 = null;
        Object stackIn_6_0 = null;
        short[] stackIn_19_0 = null;
        RuntimeException stackIn_22_0 = null;
        StringBuilder stackIn_22_1 = null;
        String stackIn_23_2 = null;
        StringBuilder stackIn_25_1 = null;
        String stackIn_26_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var4 = null;
        var8 = Virogrid.field_F ? 1 : 0;
        try {
          var4_int = param3.c((byte) -78, param2);
          if (param1 > -5) {
            stackIn_3_0 = (short[]) null;
            return stackIn_3_0;
          }
          if (var4_int == 0) {
            stackIn_6_0 = null;
            return (short[]) (stackIn_6_0);
          }
          if (param0 == null ||
            param0.length != var4_int) {
            param0 = new short[var4_int];
          }
          var5 = param3.c((byte) -78, 4);
          var6 = (short)param3.c((byte) -78, 16);
          if (var5 > 0) {
            for (var7 = 0; var7 < var4_int; var7++) {
              param0[var7] = (short)(var6 + param3.c((byte) -78, var5));
            }
          } else {
            for (var7 = 0; var4_int > var7; var7++) {
              param0[var7] = (short)var6;
            }
          }
          stackIn_19_0 = (short[]) (param0);
          return stackIn_19_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var4 = decompiledCaughtException;
          stackIn_22_0 = var4;
          stackIn_22_1 = new StringBuilder().append("c.B(");
          if (param0 == null) {
            stackIn_23_2 = "null";
          } else {
            stackIn_23_2 = "{...}";
          }
          stackIn_25_1 = ((StringBuilder) (Object) stackIn_22_1).append(stackIn_23_2).append(',').append(param1).append(',').append(param2).append(',');
          if (param3 == null) {
            stackIn_26_2 = "null";
          } else {
            stackIn_26_2 = "{...}";
          }
          throw kg.a((Throwable) ((Object) stackIn_22_0), ((StringBuilder) (Object) stackIn_25_1).append(stackIn_26_2).append(')').toString());
        }
    }

    public static void a(boolean param0) {
        field_c = null;
        field_d = null;
        field_b = null;
        field_f = null;
        if (param0) {
          field_d = (mg) null;
        }
        field_e = null;
    }

    static {
        int var0 = 0;
        double var1 = 0.0;
        int var0Lifetime1;
        double var1Lifetime1;
        field_e = new int[65536];
        field_b = new int[65536];
        for (var0 = 0; var0 < 65536; var0++) {
          var1 = -Math.sqrt((double)var0) + 256.0;
          field_b[var0] = (int)(0.5 + var1 * var1);
        }
        for (var0Lifetime1 = 0; 65536 > var0Lifetime1; var0Lifetime1++) {
          var1Lifetime1 = Math.sqrt((double)var0Lifetime1);
          field_e[var0Lifetime1] = (int)Math.floor(-(var1Lifetime1 * 9.0) + 768.5 + (double)var0Lifetime1 * 0.0234375);
        }
        field_a = 256;
        field_c = "Invite";
        field_f = "<%0> has resigned and is offering a rematch.";
    }
}
