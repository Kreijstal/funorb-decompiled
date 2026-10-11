/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class ij implements ui {
    private int field_e;
    private int field_b;
    private int field_c;
    private int field_g;
    static wk field_d;
    static int field_a;
    private int field_j;
    static ti field_h;
    private kg field_i;
    private int field_f;

    public final void a(int param0, int param1, boolean param2, byte param3, qg param4) {
        int var10 = 0;
        qg stackIn_4_0 = null;
        RuntimeException stackIn_13_0 = null;
        StringBuilder stackIn_13_1 = null;
        String stackIn_14_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var6 = null;
        int var7 = 0;
        int var8 = 0;
        int var9 = 0;
        int var11 = 0;
        int var12 = 0;
        fk var13 = null;
        var12 = Transmogrify.field_A ? 1 : 0;
        try {
          if (!(param4 instanceof fk)) {
            stackIn_4_0 = null;
          } else {
            stackIn_4_0 = (qg) (param4);
          }
          var13 = (fk) (stackIn_4_0);
          sb.a(param4.field_p + param0, param1 + param4.field_n, param4.field_l, param4.field_h, this.field_c);
          if (var13 != null) {
          }
          var7 = param4.field_l - 2 * var13.field_B;
          var8 = var13.field_B + param4.field_p + param0;
          var9 = var13.field_G + (param4.field_n + param1);
          sb.e(var8, var9, var7 + var8, var9, this.field_j);
          for (var10 = -1 + var13.h(-1); 0 <= var10; var10--) {
            sb.c(var7 * var13.b((byte) 117, var10) / var13.i(-24733) + var8, var9, this.field_e, this.field_f);
          }
          var11 = -49 % ((51 - param3) / 47);
          if (this.field_i != null) {
            this.field_i.c(var13.field_k, var8 + var7 / 2, var9 - (-this.field_i.field_C - var13.field_G), this.field_g, this.field_b);
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var6 = decompiledCaughtException;
          stackIn_13_0 = var6;
          stackIn_13_1 = new StringBuilder().append("ij.C(").append(param0).append(',').append(param1).append(',').append(param2).append(',').append(param3).append(',');
          if (param4 == null) {
            stackIn_14_2 = "null";
          } else {
            stackIn_14_2 = "{...}";
          }
          throw ch.a((Throwable) ((Object) stackIn_13_0), ((StringBuilder) (Object) stackIn_13_1).append(stackIn_14_2).append(')').toString());
        }
    }

    final static String a(String param0, String[] param1, byte param2) {
        StringBuilder discarded$2 = null;
        StringBuilder discarded$0 = null;
        StringBuilder discarded$1 = null;
        String stackIn_16_0 = null;
        String stackIn_30_0 = null;
        RuntimeException stackIn_33_0 = null;
        StringBuilder stackIn_33_1 = null;
        String stackIn_34_2 = null;
        StringBuilder stackIn_36_1 = null;
        String stackIn_37_2 = null;
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
        var11 = Transmogrify.field_A ? 1 : 0;
        try {
          var3_int = param0.length();
          var4 = var3_int;
          var5 = 0;
          while (true) {
            var6_int = param0.indexOf("<%", var5);
            if (0 <= var6_int) {
              for (var5 = 2 + var6_int; var3_int > var5; var5++) {
                if (dj.a(param0.charAt(var5), true)) {
                  continue;
                }
                break;
              }
              var7_ref_String = param0.substring(var6_int + 2, var5);
              if (!qj.a((CharSequence) ((Object) var7_ref_String), 38)) {
                continue;
              }
              if (var3_int <= var5) {
                continue;
              }
              if (param0.charAt(var5) != 62) {
                continue;
              }
              var5++;
              var8 = aa.a(55, (CharSequence) ((Object) var7_ref_String));
              var4 = var4 + (-var5 + var6_int + param1[var8].length());
              continue;
            }
            break;
          }
          if (param2 >= -25) {
            stackIn_16_0 = (String) null;
            return stackIn_16_0;
          }
          var6 = new StringBuilder(var4);
          var5Lifetime1 = 0;
          var7 = 0;
          while (true) {
            var8Lifetime1 = param0.indexOf("<%", var5Lifetime1);
            if (var8Lifetime1 < 0) {
              discarded$2 = var6.append(param0.substring(var7));
              stackIn_30_0 = var6.toString();
              return stackIn_30_0;
            }
            for (var5Lifetime1 = 2 + var8Lifetime1; var5Lifetime1 < var3_int; var5Lifetime1++) {
              if (dj.a(param0.charAt(var5Lifetime1), true)) {
                continue;
              }
              break;
            }
            var9 = param0.substring(2 + var8Lifetime1, var5Lifetime1);
            if (!qj.a((CharSequence) ((Object) var9), 49)) {
              continue;
            }
            if (var5Lifetime1 >= var3_int) {
              continue;
            }
            if (param0.charAt(var5Lifetime1) != 62) {
              continue;
            }
            var5Lifetime1++;
            var10 = aa.a(66, (CharSequence) ((Object) var9));
            discarded$0 = var6.append(param0.substring(var7, var8Lifetime1));
            discarded$1 = var6.append(param1[var10]);
            var7 = var5Lifetime1;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3 = decompiledCaughtException;
          stackIn_33_0 = var3;
          stackIn_33_1 = new StringBuilder().append("ij.A(");
          if (param0 == null) {
            stackIn_34_2 = "null";
          } else {
            stackIn_34_2 = "{...}";
          }
          stackIn_36_1 = ((StringBuilder) (Object) stackIn_33_1).append(stackIn_34_2).append(',');
          if (param1 == null) {
            stackIn_37_2 = "null";
          } else {
            stackIn_37_2 = "{...}";
          }
          throw ch.a((Throwable) ((Object) stackIn_33_0), ((StringBuilder) (Object) stackIn_36_1).append(stackIn_37_2).append(',').append(param2).append(')').toString());
        }
    }

    ij(kg param0, int param1, int param2, int param3, int param4, int param5, int param6) {
        try {
          this.field_c = param4;
          this.field_i = param0;
          this.field_b = param2;
          this.field_f = param6;
          this.field_e = param5;
          this.field_g = param1;
          this.field_j = param3;
        } catch (RuntimeException runtimeException) {
          throw ch.a((Throwable) ((Object) runtimeException), "ij.<init>(" + (param0 != null ? "{...}" : "null") + ',' + param1 + ',' + param2 + ',' + param3 + ',' + param4 + ',' + param5 + ',' + param6 + ')');
        }
    }

    public static void a(int param0) {
        field_h = null;
        if (param0 != 2) {
          return;
        }
        field_d = null;
    }

    static {
        field_d = new wk();
    }
}
