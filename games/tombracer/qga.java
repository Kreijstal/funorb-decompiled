/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class qga extends ci {
    static boolean field_m;

    final static String a(int param0, CharSequence[] param1, int param2, int param3) {
        int var6_int = 0;
        int var7 = 0;
        StringBuilder discarded$0 = null;
        StringBuilder discarded$1 = null;
        String stackIn_4_0 = null;
        String stackIn_9_0 = null;
        String stackIn_11_0 = null;
        String stackIn_14_0 = null;
        String stackIn_28_0 = null;
        RuntimeException stackIn_31_0 = null;
        StringBuilder stackIn_31_1 = null;
        String stackIn_32_2 = null;
        RuntimeException decompiledCaughtException = null;
        CharSequence var4 = null;
        int var4_int = 0;
        RuntimeException var4_ref = null;
        int var5 = 0;
        StringBuilder var6 = null;
        CharSequence var7_ref_CharSequence = null;
        CharSequence var8 = null;
        int var9 = 0;
        CharSequence var10 = null;
        var9 = TombRacer.field_G ? 1 : 0;
        try {
          if (param3 == 0) {
            stackIn_4_0 = "";
            return stackIn_4_0;
          }
          if (param3 == 1) {
            var10 = param1[param2];
            var4 = var10;
            if (var4 != null) {
              stackIn_11_0 = var10.toString();
              return stackIn_11_0;
            }
            stackIn_9_0 = "null";
            return stackIn_9_0;
          }
          var4_int = param3 + param2;
          var5 = 0;
          if (param0 <= 121) {
            stackIn_14_0 = (String) null;
            return stackIn_14_0;
          }
          for (var6_int = param2; var6_int < var4_int; var6_int++) {
            var7_ref_CharSequence = param1[var6_int];
            if (var7_ref_CharSequence == null) {
              var5 += 4;
            } else {
              var5 = var5 + var7_ref_CharSequence.length();
            }
          }
          var6 = new StringBuilder(var5);
          for (var7 = param2; var4_int > var7; var7++) {
            var8 = param1[var7];
            if (var8 != null) {
              discarded$0 = var6.append(var8);
            } else {
              discarded$1 = var6.append("null");
            }
          }
          stackIn_28_0 = var6.toString();
          return stackIn_28_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var4_ref = decompiledCaughtException;
          stackIn_31_0 = var4_ref;
          stackIn_31_1 = new StringBuilder().append("qga.B(").append(param0).append(',');
          if (param1 == null) {
            stackIn_32_2 = "null";
          } else {
            stackIn_32_2 = "{...}";
          }
          throw tba.a((Throwable) ((Object) stackIn_31_0), ((StringBuilder) (Object) stackIn_31_1).append(stackIn_32_2).append(',').append(param2).append(',').append(param3).append(')').toString());
        }
    }

    final int[] c(int param0, int param1) {
        if (param0 != 1) {
          qga.c(97);
        }
        return ht.field_Fb;
    }

    final static void c(int param0) {
        int var1 = 0;
        if (ot.field_v > 32) {
          var1 = ot.field_v % 32;
          if (var1 == 0) {
            var1 = 32;
          }
          mp.a(2, ot.field_v - var1);
        } else {
          mp.a(2, 0);
        }
        if (param0 != -10794) {
          field_m = false;
        }
    }

    public qga() {
        super(0, true);
    }

    final static void a(int param0, int param1, int[] param2, int param3, int param4, int param5, int param6, int param7, int param8, int param9) {
        int var16 = 0;
        int[] var17 = null;
        RuntimeException stackIn_10_0 = null;
        StringBuilder stackIn_10_1 = null;
        String stackIn_11_2 = null;
        RuntimeException decompiledCaughtException = null;
        int[] var10 = null;
        RuntimeException var10_ref = null;
        int var11 = 0;
        int var12 = 0;
        int var13 = 0;
        int var14 = 0;
        int var15 = 0;
        int[] var18 = null;
        var16 = TombRacer.field_G ? 1 : 0;
        try {
          if (param5 >= -107) {
            var17 = (int[]) null;
            qga.a(30, -67, (int[]) null, -70, -115, -54, -31, -19, 111, 23);
          }
          param6--;
          while (param6 >= 0) {
            var18 = param2;
            var10 = var18;
            var11 = param4;
            var12 = param8;
            var13 = param1;
            var14 = param0;
            var15 = 8355711 & var18[var11] >> 1;
            var10[var11] = (sea.c(33478545, var14) >> 17) + (sea.c(var13, 33423539) >> 9) - (-(sea.c(33423360, var12) >> 1) - var15);
            param4++;
            param0 = param0 + param9;
            param8 = param8 + param3;
            param1 = param1 + param7;
            param6--;
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var10_ref = decompiledCaughtException;
          stackIn_10_0 = var10_ref;
          stackIn_10_1 = new StringBuilder().append("qga.C(").append(param0).append(',').append(param1).append(',');
          if (param2 == null) {
            stackIn_11_2 = "null";
          } else {
            stackIn_11_2 = "{...}";
          }
          throw tba.a((Throwable) ((Object) stackIn_10_0), ((StringBuilder) (Object) stackIn_10_1).append(stackIn_11_2).append(',').append(param3).append(',').append(param4).append(',').append(param5).append(',').append(param6).append(',').append(param7).append(',').append(param8).append(',').append(param9).append(')').toString());
        }
    }

    static {
        field_m = true;
    }
}
