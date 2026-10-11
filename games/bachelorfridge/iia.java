/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class iia extends jm {
    static int field_p;
    static sna field_m;
    static String field_o;
    private int field_r;
    static String field_q;
    static String field_n;

    final void a(boolean param0, op param1) {
        try {
          if (param0) {
            field_q = (String) null;
          }
          param1.field_S[this.field_r].field_c = true;
        } catch (RuntimeException runtimeException) {
          throw pe.a((Throwable) ((Object) runtimeException), "iia.C(" + param0 + ',' + (param1 != null ? "{...}" : "null") + ')');
        }
    }

    final void a(ub param0, int param1) {
        gj var4 = param0.field_o;
        gj var3 = var4;
        if (param1 > -2) {
          return;
        }
        try {
          var4.field_T[this.field_r] = 0;
          this.a(false, var3.field_h);
        } catch (RuntimeException runtimeException) {
          throw pe.a((Throwable) ((Object) runtimeException), "iia.B(" + (param0 != null ? "{...}" : "null") + ',' + param1 + ')');
        }
    }

    iia(int param0) {
        this.field_j = 0;
        this.field_r = param0;
    }

    final static void a(int param0, vr param1) {
        le var2 = le.a(param1, "", "fridge4");
        if (param0 != -167571320) {
          return;
        }
        try {
          ni.field_l = (ss) (var2.a(0, 485, 0, -5120, 12800));
          ni.field_l.a(128, 122, 128);
        } catch (RuntimeException runtimeException) {
          throw pe.a((Throwable) ((Object) runtimeException), "iia.A(" + param0 + ',' + (param1 != null ? "{...}" : "null") + ')');
        }
    }

    final static void a(byte param0, int param1, int param2, kv param3, int param4, int param5) {
        int incrementValue$0 = 0;
        RuntimeException stackIn_32_0 = null;
        StringBuilder stackIn_32_1 = null;
        String stackIn_33_2 = null;
        RuntimeException decompiledCaughtException = null;
        int var6_int = 0;
        RuntimeException var6 = null;
        int var7 = 0;
        int var8 = 0;
        int var9 = 0;
        int var10 = 0;
        int var11 = 0;
        int var12 = 0;
        int var13 = 0;
        int var14 = 0;
        int var15 = 0;
        int var16 = 0;
        int var17 = 0;
        int var18 = 0;
        int var19 = 0;
        int var20 = 0;
        int var21 = 0;
        int var15Lifetime1;
        int var15Lifetime2;
        int var15Lifetime3;
        var21 = BachelorFridge.field_y;
        try {
          var6_int = (-param2 + param4 << 8) / param3.field_n;
          param5 = param5 + param3.field_t;
          param1 = param1 + param3.field_u;
          var7 = (param2 << 8) + param3.field_t * var6_int;
          var8 = param1 * dg.field_i + param5;
          var9 = 0;
          var10 = param3.field_p;
          var12 = 41 % ((61 - param0) / 61);
          var11 = param3.field_q;
          var13 = -var11 + dg.field_i;
          if (param1 < dg.field_j) {
            var15 = dg.field_j - param1;
            var9 = var9 + var11 * var15;
            param1 = dg.field_j;
            var8 = var8 + dg.field_i * var15;
            var10 = var10 - var15;
          }
          var14 = 0;
          if (param5 < dg.field_f) {
            var15Lifetime1 = -param5 + dg.field_f;
            var7 = var7 + var15Lifetime1 * var6_int;
            var13 = var13 + var15Lifetime1;
            var14 = var14 + var15Lifetime1;
            var8 = var8 + var15Lifetime1;
            param5 = dg.field_f;
            var11 = var11 - var15Lifetime1;
            var9 = var9 + var15Lifetime1;
          }
          if (dg.field_k < var10 + param1) {
            var10 = var10 - (-dg.field_k + (param1 + var10));
          }
          if (dg.field_h < var11 + param5) {
            var15Lifetime2 = var11 + param5 - dg.field_h;
            var11 = var11 - var15Lifetime2;
            var13 = var13 + var15Lifetime2;
            var14 = var14 + var15Lifetime2;
          }
          if (var11 > 0 &&
            var10 > 0) {
            for (param1 = -var10; param1 < 0; param1++) {
              var15Lifetime3 = var7;
              for (param5 = -var11; param5 < 0; param5++) {
                var16 = var15Lifetime3 >> 8;
                var15Lifetime3 = var15Lifetime3 + var6_int;
                var17 = -var16 + 256;
                if (var16 >= 0) {
                  incrementValue$0 = var9;
                  var9++;
                  var18 = param3.field_v[incrementValue$0];
                  if (var18 != 0) {
                    if (var16 > 255) {
                      dg.field_e[var8] = var18;
                    } else {
                      var19 = dg.field_e[var8];
                      var20 = (16711935 & var18) * var16 + (16711935 & var19) * var17 >> 8 & 16711935;
                      dg.field_e[var8] = var20 + dda.a(var17 * dda.a(65280, var19) + var16 * dda.a(var18, 65280) >> 8, 65280);
                    }
                  }
                  var8++;
                } else {
                  var8++;
                  var9++;
                }
              }
              var8 = var8 + var13;
              var9 = var9 + var14;
            }
            return;
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var6 = decompiledCaughtException;
          stackIn_32_0 = var6;
          stackIn_32_1 = new StringBuilder().append("iia.D(").append(param0).append(',').append(param1).append(',').append(param2).append(',');
          if (param3 == null) {
            stackIn_33_2 = "null";
          } else {
            stackIn_33_2 = "{...}";
          }
          throw pe.a((Throwable) ((Object) stackIn_32_0), ((StringBuilder) (Object) stackIn_32_1).append(stackIn_33_2).append(',').append(param4).append(',').append(param5).append(')').toString());
        }
    }

    final static void a(pia param0, int param1) {
        int var2_int = 0;
        int var3 = 0;
        try {
          hl.field_C = param0;
          var2_int = 1000;
          var3 = 6 + (hl.field_C.field_F + hl.field_C.field_B);
          if ((1 & var3) == param1) {
            var3++;
          }
          cea.field_i = new kv(var2_int, var3);
          oa.field_Bb = new kv(var2_int, var3);
        } catch (RuntimeException runtimeException) {
          throw pe.a((Throwable) ((Object) runtimeException), "iia.G(" + (param0 != null ? "{...}" : "null") + ',' + param1 + ')');
        }
    }

    iia(lu param0) {
        try {
          this.field_j = 0;
          this.field_r = param0.b(16711935);
        } catch (RuntimeException runtimeException) {
          throw pe.a((Throwable) ((Object) runtimeException), "iia.<init>(" + (param0 != null ? "{...}" : "null") + ')');
        }
    }

    final void b(lu param0, byte param1) {
        try {
          int var3_int = -120 / ((37 - param1) / 38);
          param0.d(this.field_r, 0);
        } catch (RuntimeException runtimeException) {
          throw pe.a((Throwable) ((Object) runtimeException), "iia.E(" + (param0 != null ? "{...}" : "null") + ',' + param1 + ')');
        }
    }

    public static void a(int param0) {
        field_o = null;
        field_n = null;
        field_q = null;
        field_m = null;
        if (param0 != 1314859432) {
          field_q = (String) null;
        }
    }

    static {
        field_o = "Accept rematch";
        field_n = "Owner";
        field_q = "To <%0>: ";
    }
}
