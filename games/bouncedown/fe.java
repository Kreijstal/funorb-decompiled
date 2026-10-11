/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class fe {
    fc field_l;
    int field_m;
    fc field_e;
    fc field_c;
    int field_o;
    int field_k;
    fc field_a;
    private boolean field_j;
    static int field_i;
    private int field_p;
    static boolean field_g;
    int field_h;
    fc field_b;
    int field_q;
    int field_n;
    int field_f;
    tj field_d;

    private final void a(String param0, int param1, int param2, boolean param3) {
        RuntimeException stackIn_31_0 = null;
        StringBuilder stackIn_31_1 = null;
        String stackIn_32_2 = null;
        RuntimeException decompiledCaughtException = null;
        int var5_int = 0;
        RuntimeException var5 = null;
        int var6 = 0;
        int var7 = 0;
        int var8 = 0;
        int var9 = 0;
        int var10 = 0;
        int var11 = 0;
        int var12 = 0;
        int var13 = 0;
        int var14 = 0;
        int var15 = 0;
        String var16 = null;
        int var11Lifetime1;
        int var13Lifetime1;
        int var13Lifetime2;
        var15 = Bounce.field_N;
        try {
          var5_int = this.field_f + this.field_k;
          var6 = this.field_h + this.field_o;
          var7 = this.field_n;
          if (var7 == -1) {
            var7 = this.field_d.field_s + this.field_d.field_x;
          }
          var8 = na.field_e >> 2;
          var9 = this.field_d.b(param0);
          var10 = this.field_d.field_x + this.field_d.field_s;
          var11 = 1;
          if (var8 < var9 ||
            param0.indexOf("<br>") != -1) {
            if (ai.field_a == null) {
              ai.field_a = new String[16];
            }
            if (var9 <= var8) {
              var12 = var8;
            } else {
              var13 = var9 / var8;
              var12 = 2 * ((-1 + var13 + var9 % var8) / var13) + var8;
            }
            var11Lifetime1 = this.field_d.a(param0, new int[]{var12}, ai.field_a);
            var10 = var10 + var7 * (var11Lifetime1 - 1);
            var9 = 0;
            for (var13Lifetime2 = 0; var11Lifetime1 > var13Lifetime2; var13Lifetime2++) {
              var14 = this.field_d.b(ai.field_a[var13Lifetime2]);
              if (var14 > var9) {
                var9 = var14;
              }
            }
          }
          var12 = param2;
          if (na.field_e < var9 + (var12 + var5_int)) {
            var12 = -var9 + na.field_e - var5_int;
          }
          var13Lifetime1 = param1 - this.field_d.field_F + 32;
          if (var6 + (var10 + var13Lifetime1) > na.field_k) {
            var13Lifetime1 = param1 - (var10 + var6);
          }
          if (!param3) {
            var16 = (String) null;
            this.a((byte) 90, (String) null, -77, 113);
          }
          na.b(var12, var13Lifetime1, var5_int + var9, var10 + var6, this.field_q);
          na.e(var12 + 1, 1 + var13Lifetime1, -2 + var5_int + var9, -2 + (var10 + var6), this.field_m);
          this.field_d.a(param0, this.field_k + var12, this.field_o + var13Lifetime1, var9, var10, this.field_p, -1, 0, 0, var7);
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var5 = decompiledCaughtException;
          stackIn_31_0 = var5;
          stackIn_31_1 = new StringBuilder().append("fe.E(");
          if (param0 == null) {
            stackIn_32_2 = "null";
          } else {
            stackIn_32_2 = "{...}";
          }
          throw ii.a((Throwable) ((Object) stackIn_31_0), ((StringBuilder) (Object) stackIn_31_1).append(stackIn_32_2).append(',').append(param1).append(',').append(param2).append(',').append(param3).append(')').toString());
        }
    }

    final void a(int param0, int param1, int param2, boolean param3, int param4, int param5) {
        na.a(param0, param1, param4, param5, param2);
        if (param3) {
          this.field_e = (fc) null;
        }
    }

    final void a(int param0, String param1, int param2, boolean param3) {
        RuntimeException var5 = null;
        tj var6 = null;
        RuntimeException stackIn_8_0 = null;
        StringBuilder stackIn_8_1 = null;
        String stackIn_9_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          if (!this.field_j) {
            this.a((byte) 121, param1, param2, param0);
          } else {
            this.a(param1, param0, param2, param3);
          }
          if (param3) {
            return;
          }
          var6 = (tj) null;
          this.a(87, (tj) null);
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var5 = decompiledCaughtException;
          stackIn_8_0 = var5;
          stackIn_8_1 = new StringBuilder().append("fe.F(").append(param0).append(',');
          if (param1 == null) {
            stackIn_9_2 = "null";
          } else {
            stackIn_9_2 = "{...}";
          }
          throw ii.a((Throwable) ((Object) stackIn_8_0), ((StringBuilder) (Object) stackIn_8_1).append(stackIn_9_2).append(',').append(param2).append(',').append(param3).append(')').toString());
        }
    }

    private final void a(byte param0, String param1, int param2, int param3) {
        RuntimeException stackIn_10_0 = null;
        StringBuilder stackIn_10_1 = null;
        String stackIn_11_2 = null;
        RuntimeException decompiledCaughtException = null;
        int var5_int = 0;
        RuntimeException var5 = null;
        int var6 = 0;
        int var7 = 0;
        int var8 = 0;
        int var9 = 0;
        try {
          var5_int = this.field_d.b(param1);
          var6 = this.field_d.field_F + this.field_d.field_x;
          var7 = param2;
          if (na.field_e < var5_int + var7 + 6) {
            var7 = -6 + na.field_e - var5_int;
          }
          var9 = -45 % ((-17 - param0) / 47);
          var8 = 32 + (param3 - this.field_d.field_F);
          if (var8 + var6 + 6 > na.field_k) {
            var8 = na.field_k - var6 - 6;
          }
          na.b(var7, var8, var5_int + 6, 6 + var6, this.field_p);
          na.e(var7 + 1, 1 + var8, var5_int + 4, var6 + 4, this.field_m);
          this.field_d.b(param1, 3 + var7, this.field_d.field_F + (3 + var8), this.field_p, -1);
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var5 = decompiledCaughtException;
          stackIn_10_0 = var5;
          stackIn_10_1 = new StringBuilder().append("fe.D(").append(param0).append(',');
          if (param1 == null) {
            stackIn_11_2 = "null";
          } else {
            stackIn_11_2 = "{...}";
          }
          throw ii.a((Throwable) ((Object) stackIn_10_0), ((StringBuilder) (Object) stackIn_10_1).append(stackIn_11_2).append(',').append(param2).append(',').append(param3).append(')').toString());
        }
    }

    final void a(int param0, tj param1) {
        jd var17 = null;
        qi var4 = null;
        tg[] var5 = null;
        bg var16 = null;
        bg var18 = null;
        int var7_int = 0;
        qi var6 = null;
        qi var7 = null;
        sj discarded$0 = null;
        vg discarded$1 = null;
        qi var8 = null;
        tg[] var9 = null;
        tg[] var10 = null;
        tg dupTemp$2 = null;
        qi var11 = null;
        qi var12 = null;
        tg var13 = null;
        qi var14 = null;
        qi var19 = null;
        int var15 = Bounce.field_N;
        qi var14Lifetime1;
        qi var14Lifetime2;
        try {
          var17 = new jd(param1, 2, 2, 2236962, 1, 1, 1, param1.field_s + (param1.field_x + 2));
          this.field_c = (fc) ((Object) var17);
          var17.field_h = 16777215;
          var4 = new qi();
          var17.a(var4, (byte) -122);
          this.field_d = param1;
          this.field_h = 3;
          this.field_m = 5592405;
          this.field_o = 3;
          var4.field_j = 15658734;
          this.field_p = 15658734;
          this.field_q = 15658734;
          this.field_n = -1;
          this.field_k = 3;
          var4.field_i = 11711154;
          this.field_f = 3;
          var4.b(-1, 0).a(15658734, -2).a(ed.a(8947848, 7829367, 78, 10066329), -1);
          var4.b(-1, 1).a(ed.a(11184810, 13421772, 73, 10066329), -1);
          var4.b(param0 - 33, 3).a(ed.a(8947848, 10066329, param0 ^ 78, 7829367), param0 - 33).a((byte) 74, 1).b(1, (byte) -54);
          var5 = new tg[9];
          var16 = new bg(32, param0);
          var18 = var16;
          for (var7_int = 0; var18.field_v.length > var7_int; var7_int++) {
            var16.field_v[var7_int] = 1077952576;
          }
          var5[4] = (tg) ((Object) var18);
          var4.b(-1, 4).a(true, (byte) -118).a(var5, -1);
          var4.b(-1, 5).a(ok.a(param0 ^ 18906, 0, 0, 0, 65793), -1).a(true, (byte) -46).a(-1, param0 - 34);
          this.field_b = (fc) ((Object) var4);
          var6 = new qi(var4, true);
          var6.field_d = 0;
          var7 = new qi(var4, true);
          var7.field_d = 0;
          var7.a(param0 - 25, wj.a((byte) -67, 8947848));
          var7.b(-1, 1).a(wj.a((byte) -63, 11184810), param0 ^ -33).a(2236962, param0 ^ -34);
          this.field_a = (fc) ((Object) new vb(param1, 2, 2, 16777215, -1, 5, 5, 15, 15, 4473924));
          discarded$0 = new sj(param1, 2, 2, 16777215, -1, 16777215, 16729156, 4473924);
          discarded$1 = new vg(param1, 16777215, -1, 125269879, 4473924, 3, 268435455);
          var8 = new qi();
          var17.a(var8, (byte) -122);
          var8.b(-1, 0).a(ed.a(15658734, 10066329, 67, 7829367), -1).a(1118481, param0 ^ -34).a(-1, (byte) -49);
          var8.b(param0 ^ -33, 4).a(true, (byte) -61).a(var5, -1);
          this.field_e = (fc) ((Object) var8);
          var9 = new tg[9];
          var9[4] = new tg(2, 1);
          var10 = new tg[9];
          var10[4] = new tg(1, 2);
          dupTemp$2 = var9[4];
          dupTemp$2.field_v = new int[]{6710886, 7829367};
          var10[4].field_v = new int[]{6710886, 7829367};
          var11 = new qi();
          var12 = new qi();
          var11.a(param0 - 25058, 0, var9);
          var12.a(-25026, 0, var10);
          var13 = new tg(7, 4);
          var13.field_v = new int[]{8947848, 8947848, 8947848, 13421772, 8947848, 8947848, 8947848, 8947848, 8947848, 13421772, 13421772, 13421772, 8947848, 8947848, 8947848, 13421772, 13421772, 13421772, 13421772, 13421772, 8947848, 13421772, 13421772, 13421772, 13421772, 13421772, 13421772, 13421772};
          var14 = new qi(var4, true);
          var14.a(true, var13.b());
          var13.c();
          var14Lifetime1 = new qi(var4, true);
          var14Lifetime1.a(true, var13.b());
          var13.c();
          var14Lifetime2 = new qi(var4, true);
          var14Lifetime2.a(true, var13.b());
          var13.c();
          var19 = new qi(var4, true);
          var19.a(true, var13);
        } catch (RuntimeException runtimeException) {
          throw ii.a((Throwable) ((Object) runtimeException), "fe.B(" + param0 + ',' + (param1 != null ? "{...}" : "null") + ')');
        }
    }

    final void a(int param0, int param1, int param2, int param3, int param4, int param5, int param6) {
        na.a(param5, param6, param4, param1, param2, param3);
        if (param0 != -1) {
          String var9 = (String) null;
          fe.a((String) null, (byte) 2);
        }
    }

    public fe() {
        this.field_j = true;
    }

    final static boolean a(String param0, byte param1) {
        RuntimeException var2 = null;
        boolean stackIn_5_0 = false;
        RuntimeException stackIn_8_0 = null;
        StringBuilder stackIn_8_1 = null;
        String stackIn_9_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          if (param1 < 123) {
            field_i = 109;
          }
          stackIn_5_0 = (hf.a(param0, true) != null);
          return stackIn_5_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2 = decompiledCaughtException;
          stackIn_8_0 = var2;
          stackIn_8_1 = new StringBuilder().append("fe.G(");
          if (param0 == null) {
            stackIn_9_2 = "null";
          } else {
            stackIn_9_2 = "{...}";
          }
          throw ii.a((Throwable) ((Object) stackIn_8_0), ((StringBuilder) (Object) stackIn_8_1).append(stackIn_9_2).append(',').append(param1).append(')').toString());
        }
    }

    static {
    }
}
