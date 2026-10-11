/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class ah extends ub {
    private int field_m;
    private int field_f;
    private String field_k;
    static ci field_i;
    private boolean field_j;
    private int field_n;
    private int field_l;
    private int field_o;
    static hg field_g;
    private lh field_h;

    final void a(int param0, String param1, int param2, int param3, lh param4) {
        fj var8 = null;
        int var7 = 0;
        if (param1 == null) {
          this.field_a = null;
          return;
        }
        if (param4 == this.field_h &&
          this.field_j &&
          this.field_l == 1 &&
          null != this.field_k &&
          this.field_k.equals(param1)) {
          return;
        }
        try {
          this.field_j = true;
          this.field_h = param4;
          this.field_l = 1;
          var8 = this.a(param3, -110, param4, param1);
          var7 = param4.b(param1);
          var8.field_i[param0] = -(var7 >> 1) + param2;
          var8.field_i[param1.length()] = param2 + (var7 >> 1);
          me.a(param1, 0, var8, param4, (byte) 79);
        } catch (RuntimeException runtimeException) {
          throw fk.a((Throwable) ((Object) runtimeException), "ah.C(" + param0 + ',' + (param1 != null ? "{...}" : "null") + ',' + param2 + ',' + param3 + ',' + (param4 != null ? "{...}" : "null") + ')');
        }
    }

    private final fj a(int param0, int param1, lh param2, String param3) {
        fj var5 = null;
        RuntimeException var5_ref = null;
        fj var6 = null;
        fj stackIn_3_0 = null;
        RuntimeException stackIn_6_0 = null;
        StringBuilder stackIn_6_1 = null;
        String stackIn_7_2 = null;
        StringBuilder stackIn_9_1 = null;
        String stackIn_10_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          if (param1 > -103) {
            this.field_k = (String) null;
          }
          var6 = new fj(param0 - param2.field_C, param0 + param2.field_t, param3.length());
          var5 = var6;
          this.field_a = new fj[]{var6};
          stackIn_3_0 = var5;
          return stackIn_3_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var5_ref = decompiledCaughtException;
          stackIn_6_0 = var5_ref;
          stackIn_6_1 = new StringBuilder().append("ah.G(").append(param0).append(',').append(param1).append(',');
          if (param2 == null) {
            stackIn_7_2 = "null";
          } else {
            stackIn_7_2 = "{...}";
          }
          stackIn_9_1 = ((StringBuilder) (Object) stackIn_6_1).append(stackIn_7_2).append(',');
          if (param3 == null) {
            stackIn_10_2 = "null";
          } else {
            stackIn_10_2 = "{...}";
          }
          throw fk.a((Throwable) ((Object) stackIn_6_0), ((StringBuilder) (Object) stackIn_9_1).append(stackIn_10_2).append(')').toString());
        }
    }

    final static boolean a(String param0, int param1) {
        int var2_int = 0;
        RuntimeException var2 = null;
        boolean stackIn_3_0 = false;
        RuntimeException stackIn_6_0 = null;
        StringBuilder stackIn_6_1 = null;
        String stackIn_7_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          var2_int = -123 / ((param1 - 2) / 50);
          stackIn_3_0 = (null != mn.a(-1, param0));
          return stackIn_3_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2 = decompiledCaughtException;
          stackIn_6_0 = var2;
          stackIn_6_1 = new StringBuilder().append("ah.D(");
          if (param0 == null) {
            stackIn_7_2 = "null";
          } else {
            stackIn_7_2 = "{...}";
          }
          throw fk.a((Throwable) ((Object) stackIn_6_0), ((StringBuilder) (Object) stackIn_6_1).append(stackIn_7_2).append(',').append(param1).append(')').toString());
        }
    }

    final void a(String param0, int param1, lh param2, int param3, int param4) {
        fj var7 = null;
        fj var8 = null;
        if (param4 != 8829) {
          this.field_l = -109;
        }
        if (param0 == null) {
          this.field_a = null;
          return;
        }
        if (this.field_h == param2 && this.field_j && this.field_l == 0 && null != this.field_k &&
          this.field_k.equals(param0)) {
          return;
        }
        try {
          this.field_h = param2;
          this.field_l = 0;
          this.field_j = true;
          this.field_k = param0;
          var7 = this.a(param3, -125, param2, param0);
          var8 = var7;
          var7.field_i[0] = param1;
          var8.field_i[param0.length()] = param2.b(param0) + param1;
          me.a(param0, 0, var8, param2, (byte) 79);
        } catch (RuntimeException runtimeException) {
          throw fk.a((Throwable) ((Object) runtimeException), "ah.H(" + (param0 != null ? "{...}" : "null") + ',' + param1 + ',' + (param2 != null ? "{...}" : "null") + ',' + param3 + ',' + param4 + ')');
        }
    }

    final void a(int param0, int param1, int param2, String param3, lh param4) {
        fj var8 = null;
        fj var9 = null;
        if (param3 == null) {
          this.field_a = null;
          return;
        }
        if (this.field_h == param4 && this.field_j && this.field_l == 2 && null != this.field_k &&
          this.field_k.equals(param3)) {
          return;
        }
        try {
          this.field_j = true;
          this.field_l = 2;
          this.field_h = param4;
          this.field_k = param3;
          var8 = this.a(param1, -109, param4, param3);
          var9 = var8;
          var9.field_i[param0] = param2 - param4.b(param3);
          var9.field_i[param3.length()] = param2;
          me.a(param3, 0, var9, param4, (byte) 79);
        } catch (RuntimeException runtimeException) {
          throw fk.a((Throwable) ((Object) runtimeException), "ah.B(" + param0 + ',' + param1 + ',' + param2 + ',' + (param3 != null ? "{...}" : "null") + ',' + (param4 != null ? "{...}" : "null") + ')');
        }
    }

    final void a(int param0, byte param1, int param2, int param3, int param4, String param5, int param6, lh param7) {
        fj stackIn_36_0;
        fj stackIn_36_1;
        int stackIn_36_2;
        int stackIn_36_3;
        fj stackIn_37_0 = null;
        fj stackIn_37_1 = null;
        int stackIn_37_4 = 0;
        String stackIn_40_0 = null;
        int stackIn_41_1 = 0;
        RuntimeException stackIn_46_0 = null;
        StringBuilder stackIn_46_1 = null;
        String stackIn_47_2 = null;
        StringBuilder stackIn_49_1 = null;
        String stackIn_50_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var9 = null;
        int var10 = 0;
        int var11 = 0;
        int var12 = 0;
        String var13 = null;
        fj var14 = null;
        int var15 = 0;
        String[] var16 = null;
        String[] var17 = null;
        int var12Lifetime1;
        var15 = Chess.field_G;
        try {
          if (param3 == 0) {
            param3 = param7.field_q;
          }
          if (param5 == null) {
            this.field_a = null;
            return;
          }
          if (this.field_h == param7 &&
            !this.field_j &&
            param0 == this.field_l &&
            param4 == this.field_m &&
            param3 == this.field_n &&
            param2 == this.field_f &&
            param6 == this.field_o &&
            this.field_k != null &&
            this.field_k.equals(param5)) {
            return;
          }
          this.field_j = false;
          this.field_k = param5;
          this.field_o = param6;
          this.field_f = param2;
          this.field_m = param4;
          this.field_h = param7;
          this.field_l = param0;
          this.field_n = param3;
          var16 = new String[param7.b(param5, param6) + 1];
          var17 = var16;
          var10 = Math.max(1, param7.a(param5, new int[]{param6}, var17));
          if (this.field_m == 3 &&
            var10 == 1) {
            this.field_m = 1;
          }
          if (this.field_m == 0) {
            var11 = param7.field_C;
          } else {
            if (this.field_m != 1) {
              if (this.field_m != 2) {
                var12 = (this.field_f - var10 * this.field_n) / (1 + var10);
                if (var12 < 0) {
                  var12 = 0;
                }
                this.field_n = this.field_n + var12;
                var11 = var12 + param7.field_C;
              } else {
                var11 = -(var10 * this.field_n) + (-param7.field_t + this.field_f);
              }
            } else {
              var11 = param7.field_C + (-(this.field_n * var10) + this.field_f >> 1);
            }
          }
          this.field_a = new fj[var10];
          if (param1 < 107) {
            return;
          }
          for (var12Lifetime1 = 0; var12Lifetime1 < var10; var12Lifetime1++) {
            var13 = var16[var12Lifetime1];
            stackIn_36_0 = null;
            stackIn_36_1 = null;
            stackIn_36_2 = -param7.field_C + var11;
            stackIn_36_3 = param7.field_t + var11;
            if (var13 != null) {
              stackIn_37_0 = null;
              stackIn_37_1 = null;
              stackIn_37_4 = var13.length();
            } else {
              stackIn_37_0 = null;
              stackIn_37_1 = null;
              stackIn_37_4 = 0;
            }
            var14 = new fj(stackIn_36_2, stackIn_36_3, stackIn_37_4);
            var14.field_i[0] = 0;
            if (var13 != null) {
              var14.field_i[var13.length()] = param7.b(var13);
              stackIn_40_0 = var13;
              if (param0 == 3) {
                stackIn_41_1 = this.a(param7.b(var13), true, var13, param6);
              } else {
                stackIn_41_1 = 0;
              }
              me.a(stackIn_40_0, stackIn_41_1, var14, param7, (byte) 79);
            }
            this.field_a[var12Lifetime1] = var14;
            var11 = var11 + param3;
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var9 = decompiledCaughtException;
          stackIn_46_0 = var9;
          stackIn_46_1 = new StringBuilder().append("ah.E(").append(param0).append(',').append(param1).append(',').append(param2).append(',').append(param3).append(',').append(param4).append(',');
          if (param5 == null) {
            stackIn_47_2 = "null";
          } else {
            stackIn_47_2 = "{...}";
          }
          stackIn_49_1 = ((StringBuilder) (Object) stackIn_46_1).append(stackIn_47_2).append(',').append(param6).append(',');
          if (param7 == null) {
            stackIn_50_2 = "null";
          } else {
            stackIn_50_2 = "{...}";
          }
          throw fk.a((Throwable) ((Object) stackIn_46_0), ((StringBuilder) (Object) stackIn_49_1).append(stackIn_50_2).append(')').toString());
        }
    }

    final static boolean a(String param0, byte param1) {
        int var2_int = 0;
        RuntimeException var2 = null;
        int var3 = 0;
        int var4 = 0;
        RuntimeException stackIn_15_0 = null;
        StringBuilder stackIn_15_1 = null;
        String stackIn_16_2 = null;
        RuntimeException decompiledCaughtException = null;
        var4 = Chess.field_G;
        try {
          for (var2_int = 0; var2_int < param0.length(); var2_int++) {
            var3 = param0.charAt(var2_int);
            if (!b.a((char) var3, (byte) 104) &&
              !di.a(param1 - 20, (char) var3)) {
              return true;
            }
          }
          if (param1 == -29) {
            return false;
          }
          field_i = (ci) null;
          return false;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2 = decompiledCaughtException;
          stackIn_15_0 = var2;
          stackIn_15_1 = new StringBuilder().append("ah.A(");
          if (param0 == null) {
            stackIn_16_2 = "null";
          } else {
            stackIn_16_2 = "{...}";
          }
          throw fk.a((Throwable) ((Object) stackIn_15_0), ((StringBuilder) (Object) stackIn_15_1).append(stackIn_16_2).append(',').append(param1).append(')').toString());
        }
    }

    public static void d(byte param0) {
        field_g = null;
        if (param0 <= 48) {
          field_i = (ci) null;
        }
        field_i = null;
    }

    final static boolean a(byte param0, int param1, boolean param2, int param3, int param4, int param5, int param6) {
        if (lk.a((byte) 95)) {
          ih.a(param4, param2, param3, -1);
          if (pi.field_d != null &&
            pi.field_d.a(param5, param2, param4, param1, -11)) {
            fi.a(-393711775);
            param2 = false;
          }
          ai.a(param2, 3, param4);
          kj.a(param2, param6, 4239);
          param2 = false;
        }
        int var7 = -87 % ((49 - param0) / 52);
        return param2;
    }

    public ah() {
    }

    static {
        field_g = new hg(2, 4, 4, 0);
    }
}
