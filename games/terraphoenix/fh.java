/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class fh {
    WidgetActionListener field_q;
    int field_m;
    int field_u;
    static Sprite field_c;
    static boolean field_g;
    int field_v;
    private boolean field_j;
    int field_r;
    WidgetActionListener field_n;
    static String field_x;
    static int field_h;
    static boolean field_f;
    BitmapFont field_b;
    WidgetActionListener field_i;
    static Sprite field_s;
    private int field_w;
    int field_o;
    int field_p;
    WidgetActionListener field_t;
    static Archive field_d;
    WidgetActionListener field_e;
    static int field_a;
    static String field_l;
    int field_k;

    public static void a(byte param0) {
        field_x = null;
        field_c = null;
        if (param0 < 34) {
          field_f = false;
        }
        field_d = null;
        field_s = null;
        field_l = null;
    }

    private final void a(int param0, int param1, int param2, String param3) {
        int var5_int = 0;
        int var6 = 0;
        int var7 = 0;
        int var8 = 0;
        try {
          var5_int = this.field_b.b(param3);
          var6 = this.field_b.field_p + this.field_b.field_u;
          var7 = param1;
          if (!(6 + (var7 + var5_int) <= SoftwareRasterizer.field_k)) {
            var7 = -6 + (-var5_int + SoftwareRasterizer.field_k);
          }
          var8 = 32 + (param0 - this.field_b.field_u);
          if (var6 + var8 + 6 > SoftwareRasterizer.field_j) {
            var8 = -6 + (SoftwareRasterizer.field_j - var6);
          }
          SoftwareRasterizer.e(var7, var8, 6 + var5_int, var6 + 6, this.field_w);
          SoftwareRasterizer.f(var7 + 1, var8 + 1, 4 + var5_int, var6 + 4, this.field_u);
          this.field_b.b(param3, var7 + 3, 3 + (var8 + this.field_b.field_u), this.field_w, -1);
          int var9 = 1 % ((param2 + 66) / 37);
        } catch (RuntimeException runtimeException) {
          throw qk.wrapException((Throwable) ((Object) runtimeException), "fh.H(" + param0 + ',' + param1 + ',' + param2 + ',' + (param3 != null ? "{...}" : "null") + ')');
        }
    }

    private final void a(int param0, String param1, int param2, int param3) {
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
        int var11Lifetime1;
        int var13Lifetime1;
        int var13Lifetime2;
        var15 = Terraphoenix.field_V;
        try {
          var5_int = this.field_v + this.field_o;
          var6 = this.field_k + this.field_m;
          var7 = this.field_p;
          if (var7 == -1) {
            var7 = this.field_b.field_p + this.field_b.field_s;
          }
          var8 = SoftwareRasterizer.field_k >> 2;
          var9 = this.field_b.b(param1);
          if (param2 != 16) {
            this.a(107, -67, -114, -53, -30, true);
          }
          var10 = this.field_b.field_p + this.field_b.field_s;
          var11 = 1;
          if (var8 < var9 ||
            param1.indexOf("<br>") != -1) {
            if (null == wg.field_h) {
              wg.field_h = new String[16];
            }
            if (var8 >= var9) {
              var12 = var8;
            } else {
              var13 = var9 / var8;
              var12 = var8 + (-1 + var9 % var8 + var13) / var13 * 2;
            }
            var11Lifetime1 = this.field_b.a(param1, new int[]{var12}, wg.field_h);
            var9 = 0;
            var10 = var10 + var7 * (-1 + var11Lifetime1);
            for (var13Lifetime2 = 0; var13Lifetime2 < var11Lifetime1; var13Lifetime2++) {
              var14 = this.field_b.b(wg.field_h[var13Lifetime2]);
              if (var9 < var14) {
                var9 = var14;
              }
            }
          }
          var12 = param3;
          if (var5_int + (var9 + var12) > SoftwareRasterizer.field_k) {
            var12 = -var5_int + SoftwareRasterizer.field_k - var9;
          }
          var13Lifetime1 = -this.field_b.field_u + param0 + 32;
          if (SoftwareRasterizer.field_j < var6 + var13Lifetime1 + var10) {
            var13Lifetime1 = -var6 + (param0 - var10);
          }
          SoftwareRasterizer.e(var12, var13Lifetime1, var9 + var5_int, var6 + var10, this.field_r);
          SoftwareRasterizer.f(1 + var12, var13Lifetime1 + 1, -2 + (var9 + var5_int), -2 + var6 + var10, this.field_u);
          this.field_b.a(param1, this.field_v + var12, this.field_m + var13Lifetime1, var9, var10, this.field_w, -1, 0, 0, var7);
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var5 = decompiledCaughtException;
          stackIn_31_0 = var5;
          stackIn_31_1 = new StringBuilder().append("fh.C(").append(param0).append(',');
          if (param1 == null) {
            stackIn_32_2 = "null";
          } else {
            stackIn_32_2 = "{...}";
          }
          throw qk.wrapException((Throwable) ((Object) stackIn_31_0), ((StringBuilder) (Object) stackIn_31_1).append(stackIn_32_2).append(',').append(param2).append(',').append(param3).append(')').toString());
        }
    }

    final void a(BitmapFont param0, byte param1) {
        int var7_int = 0;
        hf var6 = null;
        hf var7 = null;
        f discarded$0 = null;
        sk discarded$1 = null;
        hf var8 = null;
        Sprite[] var9 = null;
        Sprite[] var10 = null;
        Sprite dupTemp$2 = null;
        hf var11 = null;
        hf var12 = null;
        Sprite var13 = null;
        hf var14 = null;
        hf var19 = null;
        int var15 = Terraphoenix.field_V;
        fd var17 = new fd(param0, 2, 2, 2236962, 1, 1, 1, param0.field_s + param0.field_p + 2);
        hf var14Lifetime1;
        hf var14Lifetime2;
        this.field_t = (WidgetActionListener) ((Object) var17);
        var17.field_e = 16777215;
        hf var4 = new hf();
        var17.a(var4, -46);
        var4.field_r = 11711154;
        this.field_v = 3;
        this.field_u = 5592405;
        this.field_o = 3;
        var4.field_g = 15658734;
        this.field_w = 15658734;
        this.field_m = 3;
        this.field_k = 3;
        this.field_p = -1;
        this.field_b = param0;
        this.field_r = 15658734;
        var4.a(0, 3).b(15658734, true).a(hl.a((byte) 94, 8947848, 7829367, 10066329), (byte) 45);
        var4.a(1, 3).a(hl.a((byte) 18, 11184810, 13421772, 10066329), (byte) 45);
        var4.a(3, 3).a(hl.a((byte) 115, 8947848, 10066329, 7829367), (byte) 45).b(80, 1).c(2, 1);
        Sprite[] var5 = new Sprite[9];
        ArgbSprite var16 = new ArgbSprite(32, 32);
        ArgbSprite var18 = var16;
        for (var7_int = 0; var7_int < var18.field_z.length; var7_int++) {
          var16.field_z[var7_int] = 1077952576;
        }
        if (param1 >= -84) {
          return;
        }
        try {
          var5[4] = (Sprite) ((Object) var18);
          var4.a(4, 3).a(-47, true).a(var5, (byte) 45);
          var4.a(5, 3).a(al.a(0, 0, 0, 65793, (byte) -123), (byte) 45).a(-82, true).b(-1, true);
          this.field_n = (WidgetActionListener) ((Object) var4);
          var6 = new hf(var4, true);
          var6.field_h = 0;
          var7 = new hf(var4, true);
          var7.field_h = 0;
          var7.a(Archive.f(8947848, 4), (byte) -24);
          var7.a(1, 3).a(Archive.f(11184810, 4), (byte) 45).b(2236962, true);
          this.field_q = (WidgetActionListener) ((Object) new ea(param0, 2, 2, 16777215, -1, 5, 5, 15, 15, 4473924));
          discarded$0 = new f(param0, 2, 2, 16777215, -1, 16777215, 16729156, 4473924);
          discarded$1 = new sk(param0, 16777215, -1, 125269879, 4473924, 3, 268435455);
          var8 = new hf();
          var17.a(var8, -32);
          var8.a(0, 3).a(hl.a((byte) -81, 15658734, 10066329, 7829367), (byte) 45).b(1118481, true).a(-19426, -1);
          var8.a(4, 3).a(-86, true).a(var5, (byte) 45);
          this.field_i = (WidgetActionListener) ((Object) var8);
          var9 = new Sprite[9];
          var9[4] = new Sprite(2, 1);
          var10 = new Sprite[9];
          var10[4] = new Sprite(1, 2);
          dupTemp$2 = var9[4];
          dupTemp$2.field_z = new int[]{6710886, 7829367};
          var10[4].field_z = new int[]{6710886, 7829367};
          var11 = new hf();
          var12 = new hf();
          var11.a(-26108, 0, var9);
          var12.a(-26108, 0, var10);
          var13 = new Sprite(7, 4);
          var13.field_z = new int[]{8947848, 8947848, 8947848, 13421772, 8947848, 8947848, 8947848, 8947848, 8947848, 13421772, 13421772, 13421772, 8947848, 8947848, 8947848, 13421772, 13421772, 13421772, 13421772, 13421772, 8947848, 13421772, 13421772, 13421772, 13421772, 13421772, 13421772, 13421772};
          var14 = new hf(var4, true);
          var14.a(0, var13.d());
          var13.b();
          var14Lifetime1 = new hf(var4, true);
          var14Lifetime1.a(0, var13.d());
          var13.b();
          var14Lifetime2 = new hf(var4, true);
          var14Lifetime2.a(0, var13.d());
          var13.b();
          var19 = new hf(var4, true);
          var19.a(0, var13);
        } catch (RuntimeException runtimeException) {
          throw qk.wrapException((Throwable) ((Object) runtimeException), "fh.F(" + (param0 != null ? "{...}" : "null") + ',' + param1 + ')');
        }
    }

    final void a(int param0, int param1, int param2, int param3, int param4, boolean param5) {
        if (!param5) {
          return;
        }
        SoftwareRasterizer.c(param1, param4, param2, param3, param0);
    }

    final void b(int param0, String param1, int param2, int param3) {
        RuntimeException stackIn_8_0 = null;
        StringBuilder stackIn_8_1 = null;
        String stackIn_9_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var5 = null;
        try {
          if (param3 != 4473924) {
            return;
          }
          if (!this.field_j) {
            this.a(param0, param2, param3 - 4473911, param1);
          } else {
            this.a(param0, param1, 16, param2);
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var5 = decompiledCaughtException;
          stackIn_8_0 = var5;
          stackIn_8_1 = new StringBuilder().append("fh.B(").append(param0).append(',');
          if (param1 == null) {
            stackIn_9_2 = "null";
          } else {
            stackIn_9_2 = "{...}";
          }
          throw qk.wrapException((Throwable) ((Object) stackIn_8_0), ((StringBuilder) (Object) stackIn_8_1).append(stackIn_9_2).append(',').append(param2).append(',').append(param3).append(')').toString());
        }
    }

    final void a(int param0, int param1, int param2, int param3, int param4, int param5, int param6) {
        if (param4 != 2) {
          return;
        }
        SoftwareRasterizer.d(param1, param2, param6, param5, param0, param3);
    }

    final static void a(int param0, int param1) {
        dm.field_f = 1000000000L / (long)param1;
        if (param0 <= 58) {
          fh.a((byte) 46);
        }
    }

    public fh() {
        this.field_j = true;
    }

    static {
        field_h = 250;
        field_g = true;
        field_x = "Logging in...";
        field_f = false;
        field_l = "5000pts";
        field_s = new Sprite(453, 361);
    }
}
