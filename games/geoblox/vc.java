/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class vc extends dk {
    private int field_l;
    private int field_o;
    private String field_n;
    private int field_m;
    private m field_p;
    private int field_k;
    static String field_g;
    static dm field_j;
    private int field_e;
    private boolean field_d;
    static int field_h;
    static int field_i;
    static vk field_f;

    final static void d(int param0) {
        int var2 = 0;
        int var1_int = 0;
        int var3 = 0;
        int var4 = 0;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var1 = null;
        var4 = Geoblox.field_C;
        try {
          if (param0 != 2971) {
            return;
          }
          var1_int = ch.field_d[0];
          for (var2 = 1; var2 < ch.field_d.length; var2++) {
            var3 = ch.field_d[var2];
            sf.a(pj.field_i, var2 << 4, pj.field_i, var1_int, var3);
            var1_int = var1_int + var3;
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var1 = decompiledCaughtException;
          throw t.a((Throwable) ((Object) var1), "vc.G(" + param0 + ')');
        }
    }

    final void a(int param0, int param1, byte param2, m param3, String param4) {
        RuntimeException stackIn_15_0 = null;
        StringBuilder stackIn_15_1 = null;
        String stackIn_16_2 = null;
        StringBuilder stackIn_18_1 = null;
        String stackIn_19_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var6 = null;
        m var7 = null;
        lk var9 = null;
        lk var10 = null;
        try {
          if (param4 == null) {
            this.field_a = null;
            return;
          }
          if (this.field_p == param3 &&
              this.field_d &&
              this.field_k == 2 &&
              null != this.field_n &&
              this.field_n.equals(param4)) {
            return;
          }
          this.field_p = param3;
          this.field_n = param4;
          this.field_d = true;
          this.field_k = 2;
          var9 = this.a(-1, param1, param3, param4);
          var10 = var9;
          var10.field_c[0] = param0 - param3.a(param4);
          var10.field_c[param4.length()] = param0;
          qb.a(0, var10, param4, 60, param3);
          if (param2 >= -12) {
            var7 = (m) null;
            this.a(98, 34, (String) null, 56, (m) null, 65, 122, -79);
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var6 = decompiledCaughtException;
          stackIn_15_0 = var6;
          stackIn_15_1 = new StringBuilder().append("vc.D(").append(param0).append(',').append(param1).append(',').append(param2).append(',');
          if (param3 == null) {
            stackIn_16_2 = "null";
          } else {
            stackIn_16_2 = "{...}";
          }
          stackIn_18_1 = ((StringBuilder) (Object) stackIn_15_1).append(stackIn_16_2).append(',');
          if (param4 == null) {
            stackIn_19_2 = "null";
          } else {
            stackIn_19_2 = "{...}";
          }
          throw t.a((Throwable) ((Object) stackIn_15_0), ((StringBuilder) (Object) stackIn_18_1).append(stackIn_19_2).append(')').toString());
        }
    }

    final void a(String param0, int param1, int param2, byte param3, m param4) {
        lk var8 = null;
        int var7 = 0;
        if (param0 == null) {
            this.field_a = null;
            return;
        }
        if (param3 != 58) {
            vc.d(-90);
        }
        if (this.field_p == param4 && this.field_d && this.field_k == 1 && null != this.field_n && this.field_n.equals(param0)) {
            return;
        }
        try {
            this.field_k = 1;
            this.field_d = true;
            this.field_p = param4;
            var8 = this.a(-1, param1, param4, param0);
            var7 = param4.a(param0);
            var8.field_c[0] = param2 - (var7 >> 1);
            var8.field_c[param0.length()] = (var7 >> 1) + param2;
            qb.a(0, var8, param0, 60, param4);
        } catch (RuntimeException runtimeException) {
            throw t.a((Throwable) ((Object) runtimeException), "vc.A(" + (param0 != null ? "{...}" : "null") + ',' + param1 + ',' + param2 + ',' + param3 + ',' + (param4 != null ? "{...}" : "null") + ')');
        }
    }

    final void a(int param0, int param1, String param2, int param3, m param4) {
        lk var7 = null;
        lk var8 = null;
        if (param2 == null) {
            this.field_a = null;
            return;
        }
        if (param3 > -89) {
            field_j = (dm) null;
        }
        if (this.field_p == param4 && this.field_d && 0 == this.field_k && this.field_n != null &&
            this.field_n.equals(param2)) {
            return;
        }
        try {
            this.field_n = param2;
            this.field_k = 0;
            this.field_d = true;
            this.field_p = param4;
            var7 = this.a(-1, param0, param4, param2);
            var8 = var7;
            var7.field_c[0] = param1;
            var8.field_c[param2.length()] = param4.a(param2) + param1;
            qb.a(0, var8, param2, 60, param4);
        } catch (RuntimeException runtimeException) {
            throw t.a((Throwable) ((Object) runtimeException), "vc.E(" + param0 + ',' + param1 + ',' + (param2 != null ? "{...}" : "null") + ',' + param3 + ',' + (param4 != null ? "{...}" : "null") + ')');
        }
    }

    final void a(int param0, int param1, String param2, int param3, m param4, int param5, int param6, int param7) {
        lk stackIn_35_0;
        lk stackIn_35_1;
        int stackIn_35_2;
        int stackIn_35_3;
        lk stackIn_36_0 = null;
        lk stackIn_36_1 = null;
        int stackIn_36_4 = 0;
        int stackIn_40_0 = 0;
        RuntimeException stackIn_45_0 = null;
        StringBuilder stackIn_45_1 = null;
        String stackIn_46_2 = null;
        StringBuilder stackIn_48_1 = null;
        String stackIn_49_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var9 = null;
        int var10 = 0;
        int var11 = 0;
        int var12 = 0;
        String var13 = null;
        lk var14 = null;
        int var15 = 0;
        String[] var16 = null;
        String[] var17 = null;
        int var12Lifetime1;
        var15 = Geoblox.field_C;
        try {
          if (param3 == 0) {
            param3 = param4.field_p;
          }
          if (param2 == null) {
            this.field_a = null;
            return;
          }
          if (param4 == this.field_p &&
              !this.field_d &&
              this.field_k == param6 &&
              this.field_m == param0 &&
              this.field_e == param3 &&
              param7 == this.field_o &&
              param5 == this.field_l &&
              null != this.field_n &&
              this.field_n.equals(param2)) {
            return;
          }
          this.field_o = param7;
          this.field_k = param6;
          this.field_m = param0;
          this.field_e = param3;
          this.field_l = param5;
          this.field_n = param2;
          this.field_d = false;
          this.field_p = param4;
          var16 = new String[param1 + param4.b(param2, param5)];
          var17 = var16;
          var10 = Math.max(1, param4.a(param2, new int[]{param5}, var17));
          if (this.field_m == 3 &&
              var10 == 1) {
            this.field_m = 1;
          }
          this.field_a = new lk[var10];
          if (this.field_m != 0) {
            if (this.field_m != 1) {
              if (this.field_m == 2) {
                var11 = -param4.field_q + this.field_o - var10 * this.field_e;
              } else {
                var12 = (-(this.field_e * var10) + this.field_o) / (var10 + 1);
                if (var12 < 0) {
                  var12 = 0;
                }
                this.field_e = this.field_e + var12;
                var11 = param4.field_o + var12;
              }
            } else {
              var11 = param4.field_o + (this.field_o - this.field_e * var10 >> 1);
            }
          } else {
            var11 = param4.field_o;
          }
          for (var12Lifetime1 = 0; var12Lifetime1 < var10; var12Lifetime1++) {
            var13 = var16[var12Lifetime1];
            stackIn_35_0 = null;
            stackIn_35_1 = null;
            stackIn_35_2 = -param4.field_o + var11;
            stackIn_35_3 = var11 + param4.field_q;
            if (var13 == null) {
              stackIn_36_0 = null;
              stackIn_36_1 = null;
              stackIn_36_4 = 0;
            } else {
              stackIn_36_0 = null;
              stackIn_36_1 = null;
              stackIn_36_4 = var13.length();
            }
            var14 = new lk(stackIn_35_2, stackIn_35_3, stackIn_36_4);
            var14.field_c[0] = 0;
            if (var13 != null) {
              var14.field_c[var13.length()] = param4.a(var13);
              if (param6 != 3) {
                stackIn_40_0 = 0;
              } else {
                stackIn_40_0 = this.a(-116, param4.a(var13), param5, var13);
              }
              qb.a(stackIn_40_0, var14, var13, 60, param4);
            }
            this.field_a[var12Lifetime1] = var14;
            var11 = var11 + param3;
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var9 = decompiledCaughtException;
          stackIn_45_0 = var9;
          stackIn_45_1 = new StringBuilder().append("vc.B(").append(param0).append(',').append(param1).append(',');
          if (param2 == null) {
            stackIn_46_2 = "null";
          } else {
            stackIn_46_2 = "{...}";
          }
          stackIn_48_1 = ((StringBuilder) (Object) stackIn_45_1).append(stackIn_46_2).append(',').append(param3).append(',');
          if (param4 == null) {
            stackIn_49_2 = "null";
          } else {
            stackIn_49_2 = "{...}";
          }
          throw t.a((Throwable) ((Object) stackIn_45_0), ((StringBuilder) (Object) stackIn_48_1).append(stackIn_49_2).append(',').append(param5).append(',').append(param6).append(',').append(param7).append(')').toString());
        }
    }

    final static void c(int param0) {
        int var2 = 0;
        if (param0 != -1) {
            field_h = 119;
        }
        nj var3 = (nj) (pb.field_t.g(0));
        nj var1 = var3;
        if (var1 != null) {
            var2 = eh.field_c;
            ma.a(var2, 10, tl.field_h, (byte) -92, jf.field_c, ll.field_h);
            sl.field_f[var3.field_h].f(25, var2 + (-32 + (tl.field_h - 15)) / 2);
            dd.field_G.a(pg.field_a[var3.field_h], 67, 15 + var2, jf.field_c - 42 - 30, tl.field_h - 30, 0, -1, 1, 1, 30);
        }
    }

    private final lk a(int param0, int param1, m param2, String param3) {
        lk var5 = null;
        RuntimeException var5_ref = null;
        m var6 = null;
        lk var7 = null;
        lk stackIn_3_0 = null;
        RuntimeException stackIn_6_0 = null;
        StringBuilder stackIn_6_1 = null;
        String stackIn_7_2 = null;
        StringBuilder stackIn_9_1 = null;
        String stackIn_10_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          var7 = new lk(param1 - param2.field_o, param1 + param2.field_q, param3.length());
          var5 = var7;
          if (param0 != -1) {
            var6 = (m) null;
            this.a(-65, -103, (String) null, -76, (m) null, -99, 20, -32);
          }
          this.field_a = new lk[]{var7};
          stackIn_3_0 = var5;
          return stackIn_3_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var5_ref = decompiledCaughtException;
          stackIn_6_0 = var5_ref;
          stackIn_6_1 = new StringBuilder().append("vc.C(").append(param0).append(',').append(param1).append(',');
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
          throw t.a((Throwable) ((Object) stackIn_6_0), ((StringBuilder) (Object) stackIn_9_1).append(stackIn_10_2).append(')').toString());
        }
    }

    public static void b(byte param0) {
        field_g = null;
        field_j = null;
        field_f = null;
        int var1 = 78 % ((-20 - param0) / 33);
    }

    public vc() {
    }

    static {
        field_h = 0;
    }
}
