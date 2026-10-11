/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class ni implements de {
    static int field_k;
    private int field_n;
    private int field_c;
    private int field_l;
    private int field_i;
    private int field_d;
    private qe field_m;
    private int field_j;
    private int field_b;
    private int field_a;
    private int field_h;
    private int field_g;
    private int field_e;
    static String[] field_f;

    public final void a(int param0, boolean param1, int param2, int param3, uj param4) {
        uj stackIn_3_0 = null;
        RuntimeException stackIn_15_0 = null;
        StringBuilder stackIn_15_1 = null;
        String stackIn_16_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var6 = null;
        int var7 = 0;
        int var8 = 0;
        int var9 = 0;
        int var10 = 0;
        int var11 = 0;
        gh var12 = null;
        try {
          if (param4 instanceof gh) {
            stackIn_3_0 = (uj) (param4);
          } else {
            stackIn_3_0 = null;
          }
          var12 = (gh) (stackIn_3_0);
          if (var12 != null) {
            param1 = param1 & var12.field_u;
          }
          var7 = 5592405;
          ki.d(param0 + param4.field_s, param3 + param4.field_j, param4.field_i, param4.field_f, this.field_d);
          if (param1) {
            var7 = 16777215;
          }
          var10 = 97 % ((2 - param2) / 54);
          var8 = param4.field_s + (param0 + this.field_l);
          var9 = this.field_g + param4.field_j + param3;
          ki.b(var8, var9, this.field_b, this.field_c, 5592405);
          ki.d(var8, var9, this.field_b, this.field_c, var7);
          if (var12.field_z) {
            ki.a(var8, var9, var8 + this.field_b, var9 + this.field_c, 1);
            ki.a(this.field_b + var8, var9, var8, this.field_c + var9, 1);
          }
          if (this.field_m != null) {
            var11 = this.field_b + this.field_l + this.field_i;
            this.field_m.a(param4.field_k, param4.field_s + (param0 + var11), this.field_a + (param4.field_j + param3), param4.field_i + (-this.field_i - var11), -(this.field_i << 1) + param4.field_f, this.field_j, this.field_e, this.field_n, this.field_h, 0);
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var6 = decompiledCaughtException;
          stackIn_15_0 = var6;
          stackIn_15_1 = new StringBuilder().append("ni.L(").append(param0).append(',').append(param1).append(',').append(param2).append(',').append(param3).append(',');
          if (param4 == null) {
            stackIn_16_2 = "null";
          } else {
            stackIn_16_2 = "{...}";
          }
          throw sd.a((Throwable) ((Object) stackIn_15_0), ((StringBuilder) (Object) stackIn_15_1).append(stackIn_16_2).append(')').toString());
        }
    }

    public static void a(int param0) {
        if (param0 >= -3) {
          return;
        }
        field_f = null;
    }

    final static String a(int param0, CharSequence param1) {
        int var6 = 0;
        StringBuilder discarded$0 = null;
        Object stackIn_2_0 = null;
        String stackIn_18_0 = null;
        Object stackIn_28_0 = null;
        String stackIn_30_0 = null;
        RuntimeException stackIn_33_0 = null;
        StringBuilder stackIn_33_1 = null;
        String stackIn_34_2 = null;
        RuntimeException decompiledCaughtException = null;
        int var2_int = 0;
        RuntimeException var2 = null;
        int var3 = 0;
        int var4 = 0;
        StringBuilder var5 = null;
        int var7 = 0;
        int var8 = 0;
        try {
          if (param1 == null) {
            stackIn_2_0 = null;
            return (String) (stackIn_2_0);
          }
          var2_int = 0;
          var3 = param1.length();
          while (var3 > var2_int) {
            if (dk.a((byte) -122, param1.charAt(var2_int))) {
              var2_int++;
              continue;
            }
            break;
          }
          while (var2_int < var3) {
            if (dk.a((byte) -126, param1.charAt(var3 - 1))) {
              var3--;
              continue;
            }
            break;
          }
          var4 = -var2_int + var3;
          if (var4 < 1) {
            return null;
          }
          if (12 < var4) {
            return null;
          }
          var5 = new StringBuilder(var4);
          if (param0 < 106) {
            stackIn_18_0 = (String) null;
            return stackIn_18_0;
          }
          for (var6 = var2_int; var6 < var3; var6++) {
            var7 = param1.charAt(var6);
            if (dk.a((char) var7, (byte) 90)) {
              var8 = pa.a((char) var7, -80);
              if (var8 != 0) {
                discarded$0 = var5.append((char) var8);
              }
            }
          }
          if (var5.length() != 0) {
            stackIn_30_0 = var5.toString();
            return stackIn_30_0;
          }
          stackIn_28_0 = null;
          return (String) (stackIn_28_0);
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2 = decompiledCaughtException;
          stackIn_33_0 = var2;
          stackIn_33_1 = new StringBuilder().append("ni.B(").append(param0).append(',');
          if (param1 == null) {
            stackIn_34_2 = "null";
          } else {
            stackIn_34_2 = "{...}";
          }
          throw sd.a((Throwable) ((Object) stackIn_33_0), ((StringBuilder) (Object) stackIn_33_1).append(stackIn_34_2).append(')').toString());
        }
    }

    ni(qe param0, int param1, int param2, int param3, int param4, int param5, int param6, int param7, int param8, int param9) {
        this.field_n = 1;
        this.field_h = 1;
        try {
          this.field_l = param5;
          this.field_g = param6;
          this.field_d = param9;
          this.field_i = param1;
          this.field_c = param7;
          this.field_e = param4;
          this.field_b = param8;
          this.field_a = param2;
          this.field_m = param0;
          this.field_j = param3;
        } catch (RuntimeException runtimeException) {
          throw sd.a((Throwable) ((Object) runtimeException), "ni.<init>(" + (param0 != null ? "{...}" : "null") + ',' + param1 + ',' + param2 + ',' + param3 + ',' + param4 + ',' + param5 + ',' + param6 + ',' + param7 + ',' + param8 + ',' + param9 + ')');
        }
    }

    static {
        field_k = 0;
        field_f = new String[]{"Showing by rating", "Showing by win percentage"};
    }
}
