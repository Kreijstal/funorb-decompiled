/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class uf {
    int field_f;
    static int field_n;
    WidgetPainter field_p;
    WidgetPainter field_k;
    int field_a;
    static String field_s;
    WidgetPainter field_o;
    private boolean field_m;
    int field_l;
    BitmapFont field_d;
    int field_h;
    int field_q;
    private int field_c;
    WidgetPainter field_b;
    WidgetPainter field_i;
    static Sprite field_e;
    int field_j;
    int field_r;
    static PcmSample field_g;

    final static void a(ResourceArchive param0, ResourceArchive param1, byte param2) {
        try {
          ck.field_x = param0;
          pc.field_e = param1;
          if (param2 != -96) {
            uf.a(-27);
          }
        } catch (RuntimeException runtimeException) {
          throw t.a((Throwable) ((Object) runtimeException), "uf.K(" + (param0 != null ? "{...}" : "null") + ',' + (param1 != null ? "{...}" : "null") + ',' + param2 + ')');
        }
    }

    final static boolean c(int param0) {
        if (param0 < 2) {
          return false;
        }
        return dg.field_o == ui.field_b ? true : false;
    }

    private final void a(int param0, int param1, int param2, String param3) {
        String stackIn_32_2 = null;
        int var12 = 0;
        int var15 = EscapeVector.obfuscationControl;
        try {
          int var5_int = this.field_j + this.field_f;
          int var6 = this.field_l + this.field_r;
          int var7 = this.field_q;
          if (var7 == -1) {
            var7 = this.field_d.field_x + this.field_d.field_r;
          }
          int var8 = SoftwareRasterizer.width >> 2;
          int var9 = this.field_d.b(param3);
          int var10 = this.field_d.field_x + this.field_d.field_r;
          int var11 = 1;
          if (var8 < var9 ||
            param3.indexOf("<br>") != -1) {
            if (var8 >= var9) {
              var12 = var8;
            } else {
              int var13 = var9 / var8;
              var12 = var8 + (var9 % var8 + var13 - 1) / var13 * 2;
            }
            if (null == co.field_c) {
              co.field_c = new String[16];
            }
            int var11Lifetime1 = this.field_d.a(param3, new int[]{var12}, co.field_c);
            var9 = 0;
            var10 = var10 + (-1 + var11Lifetime1) * var7;
            for (int var13Lifetime2 = 0; var11Lifetime1 > var13Lifetime2; var13Lifetime2++) {
              int var14 = this.field_d.b(co.field_c[var13Lifetime2]);
              if (var9 < var14) {
                var9 = var14;
              }
            }
          }
          var12 = param0;
          if (var9 + var12 + var5_int > SoftwareRasterizer.width) {
            var12 = SoftwareRasterizer.width - var9 - var5_int;
          }
          int var13Lifetime1 = 32 + (-this.field_d.field_N + param2);
          if (var6 + (var13Lifetime1 + var10) > SoftwareRasterizer.height) {
            var13Lifetime1 = -var10 + (param2 - var6);
          }
          SoftwareRasterizer.b(var12, var13Lifetime1, var9 + var5_int, var6 + var10, this.field_h);
          SoftwareRasterizer.a(1 + var12, var13Lifetime1 + 1, -2 + (var9 + var5_int), -2 + var6 + var10, this.field_a);
          if (param1 <= 2) {
            return;
          }
          this.field_d.a(param3, var12 + this.field_f, this.field_l + var13Lifetime1, var9, var10, this.field_c, -1, 0, 0, var7);
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          RuntimeException decompiledCaughtException = decompiledCaughtParameter0;
          RuntimeException var5 = decompiledCaughtException;
          RuntimeException stackIn_31_0 = var5;
          StringBuilder stackIn_31_1 = new StringBuilder().append("uf.E(").append(param0).append(',').append(param1).append(',').append(param2).append(',');
          if (param3 == null) {
            stackIn_32_2 = "null";
          } else {
            stackIn_32_2 = "{...}";
          }
          throw t.a((Throwable) ((Object) stackIn_31_0), ((StringBuilder) (Object) stackIn_31_1).append(stackIn_32_2).append(')').toString());
        }
    }

    final static String a(int param0) {
        if (dn.field_q == dg.field_o) {
          return ResourceArchive.field_b;
        }
        if (param0 == 30519) {
          return bm.field_g;
        }
        ResourceArchive var2 = (ResourceArchive) null;
        uf.a((ResourceArchive) null, (ResourceArchive) null, (byte) 91);
        return bm.field_g;
    }

    final static void a(byte param0, String param1, boolean param2) {
        if (param0 <= 42) {
          return;
        }
        try {
          ha.field_a = param2;
          ei.field_i = true;
          be.field_b = new pn(bo.field_F, dl.field_b, param1, eb.field_H, ha.field_a);
          bo.field_F.b(be.field_b, 77);
        } catch (RuntimeException runtimeException) {
          throw t.a((Throwable) ((Object) runtimeException), "uf.H(" + param0 + ',' + (param1 != null ? "{...}" : "null") + ',' + param2 + ')');
        }
    }

    final void a(int param0, int param1, int param2, int param3, int param4, int param5) {
        if (param2 == -29666) {
          SoftwareRasterizer.d(param3, param4, param0, param1, param5);
          return;
        }
        uf.a(15);
        SoftwareRasterizer.d(param3, param4, param0, param1, param5);
    }

    final void a(int param0, BitmapFont param1) {
        int var15 = EscapeVector.obfuscationControl;
        try {
          TextWidgetPainter var17 = new TextWidgetPainter(param1, 2, 2, 2236962, 1, 1, 1, param1.field_x + param1.field_r + 2);
          this.field_i = (WidgetPainter) ((Object) var17);
          var17.field_h = 16777215;
          he var4 = new he();
          if (param0 != -31476) {
            field_n = 115;
          }
          var17.a(var4, 77);
          this.field_c = 15658734;
          this.field_r = 3;
          this.field_a = 5592405;
          this.field_j = 3;
          this.field_l = 3;
          this.field_h = 15658734;
          this.field_q = -1;
          this.field_f = 3;
          var4.field_i = 11711154;
          var4.field_g = 15658734;
          this.field_d = param1;
          var4.a(0, (byte) -53).a(15658734, -22572).a(2, ph.a(8947848, 1, 10066329, 7829367));
          var4.a(1, (byte) -53).a(2, ph.a(11184810, 1, 10066329, 13421772));
          var4.a(3, (byte) -53).a(2, ph.a(8947848, 1, 7829367, 10066329)).c(101, 1).a(1, (byte) 102);
          Sprite[] var5 = new Sprite[9];
          uh var16 = new uh(32, 32);
          uh var18 = var16;
          for (int var7_int = 0; var18.pixels.length > var7_int; var7_int++) {
            var16.pixels[var7_int] = 1077952576;
          }
          var5[4] = (Sprite) ((Object) var18);
          var4.a(4, (byte) -53).a(param0 ^ 31367, true).a(2, var5);
          var4.a(5, (byte) -53).a(2, vd.a(65793, 0, 0, 0, 1317)).a(param0 + 31367, true).a(-1, -22572);
          this.field_o = (WidgetPainter) ((Object) var4);
          he var6 = new he(var4, true);
          var6.field_m = 0;
          he var7 = new he(var4, true);
          var7.field_m = 0;
          var7.a(jj.a(8947848, 46), param0 + 31482);
          var7.a(1, (byte) -53).a(2, jj.a(11184810, 51)).a(2236962, -22572);
          this.field_k = (WidgetPainter) ((Object) new CheckboxPainter(param1, 2, 2, 16777215, -1, 5, 5, 15, 15, 4473924));
          sc discarded$0 = new sc(param1, 2, 2, 16777215, -1, 16777215, 16729156, 4473924);
          ve discarded$1 = new ve(param1, 16777215, -1, 125269879, 4473924, 3, 268435455);
          he var8 = new he();
          var17.a(var8, 111);
          var8.a(0, (byte) -53).a(2, ph.a(15658734, 1, 7829367, 10066329)).a(1118481, -22572).b(-93, -1);
          var8.a(4, (byte) -53).a(-121, true).a(param0 + 31478, var5);
          this.field_p = (WidgetPainter) ((Object) var8);
          Sprite[] var9 = new Sprite[9];
          Sprite[] var10 = new Sprite[9];
          var9[4] = new Sprite(2, 1);
          var10[4] = new Sprite(1, 2);
          Sprite dupTemp$2 = var9[4];
          dupTemp$2.pixels = new int[]{6710886, 7829367};
          var10[4].pixels = new int[]{6710886, 7829367};
          he var11 = new he();
          he var12 = new he();
          var11.a(var9, 0, (byte) -117);
          var12.a(var10, 0, (byte) -117);
          Sprite var13 = new Sprite(7, 4);
          var13.pixels = new int[]{8947848, 8947848, 8947848, 13421772, 8947848, 8947848, 8947848, 8947848, 8947848, 13421772, 13421772, 13421772, 8947848, 8947848, 8947848, 13421772, 13421772, 13421772, 13421772, 13421772, 8947848, 13421772, 13421772, 13421772, 13421772, 13421772, 13421772, 13421772};
          he var14 = new he(var4, true);
          var14.a(var13.copy(), (byte) 74);
          var13.rotateClockwise();
          he var14Lifetime1 = new he(var4, true);
          var14Lifetime1.a(var13.copy(), (byte) 118);
          var13.rotateClockwise();
          he var14Lifetime2 = new he(var4, true);
          var14Lifetime2.a(var13.copy(), (byte) 78);
          var13.rotateClockwise();
          he var19 = new he(var4, true);
          var19.a(var13, (byte) 87);
        } catch (RuntimeException runtimeException) {
          throw t.a((Throwable) ((Object) runtimeException), "uf.A(" + param0 + ',' + (param1 != null ? "{...}" : "null") + ')');
        }
    }

    final void a(int param0, int param1, int param2, int param3, int param4, int param5, int param6) {
        if (param1 != 1) {
          return;
        }
        SoftwareRasterizer.a(param6, param3, param4, param0, param5, param2);
    }

    final void a(byte param0, String param1, int param2, int param3) {
        String stackIn_9_2 = null;
        try {
          if (!this.field_m) {
            this.a(param1, param3, param2, 16777215);
          } else {
            this.a(param2, 29, param3, param1);
          }
          if (param0 < -29) {
            return;
          }
          this.a(-88, -91, 122, 46, 47, -59, -12);
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          RuntimeException decompiledCaughtException = decompiledCaughtParameter0;
          RuntimeException var5 = decompiledCaughtException;
          RuntimeException stackIn_8_0 = var5;
          StringBuilder stackIn_8_1 = new StringBuilder().append("uf.F(").append(param0).append(',');
          if (param1 == null) {
            stackIn_9_2 = "null";
          } else {
            stackIn_9_2 = "{...}";
          }
          throw t.a((Throwable) ((Object) stackIn_8_0), ((StringBuilder) (Object) stackIn_8_1).append(stackIn_9_2).append(',').append(param2).append(',').append(param3).append(')').toString());
        }
    }

    private final void a(String param0, int param1, int param2, int param3) {
        String stackIn_12_2 = null;
        try {
          int var5_int = this.field_d.b(param0);
          int var6 = this.field_d.field_x + this.field_d.field_N;
          int var7 = param2;
          if (SoftwareRasterizer.width < 6 + var7 + var5_int) {
            var7 = -6 - var5_int + SoftwareRasterizer.width;
          }
          if (param3 != 16777215) {
            return;
          }
          int var8 = param1 + (-this.field_d.field_N + 32);
          if (SoftwareRasterizer.height < var6 + (var8 + 6)) {
            var8 = SoftwareRasterizer.height - var6 - 6;
          }
          SoftwareRasterizer.b(var7, var8, var5_int + 6, var6 + 6, this.field_c);
          SoftwareRasterizer.a(1 + var7, 1 + var8, 4 + var5_int, 4 + var6, this.field_a);
          this.field_d.a(param0, 3 + var7, var8 + 3 + this.field_d.field_N, this.field_c, -1);
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          RuntimeException decompiledCaughtException = decompiledCaughtParameter0;
          RuntimeException var5 = decompiledCaughtException;
          RuntimeException stackIn_11_0 = var5;
          StringBuilder stackIn_11_1 = new StringBuilder().append("uf.C(");
          if (param0 == null) {
            stackIn_12_2 = "null";
          } else {
            stackIn_12_2 = "{...}";
          }
          throw t.a((Throwable) ((Object) stackIn_11_0), ((StringBuilder) (Object) stackIn_11_1).append(stackIn_12_2).append(',').append(param1).append(',').append(param2).append(',').append(param3).append(')').toString());
        }
    }

    public static void b(int param0) {
        if (param0 == -27204) {
          field_g = null;
          field_e = null;
          field_s = null;
          return;
        }
        ResourceArchive var2 = (ResourceArchive) null;
        uf.a((ResourceArchive) null, (ResourceArchive) null, (byte) 55);
        field_g = null;
        field_e = null;
        field_s = null;
    }

    public uf() {
        this.field_m = true;
    }

    static {
        field_s = "Quit";
    }
}
