/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class fl {
    int field_s;
    int field_d;
    WidgetPainter field_i;
    private int field_v;
    int field_x;
    BitmapFont field_m;
    static h field_u;
    WidgetPainter field_j;
    static int field_e;
    WidgetPainter field_k;
    int field_c;
    int field_a;
    private boolean field_g;
    int field_n;
    WidgetPainter field_w;
    WidgetPainter field_t;
    int field_h;
    int field_b;
    int field_o;
    WidgetPainter field_p;
    static String field_l;
    int field_r;
    WidgetPainter field_q;
    static int[] field_f;

    final static void a(Battlefield param0, int param1) {
        try {
          if (param1 >= -107) {
            field_f = (int[]) null;
          }
          hf.a(param0, (byte) 9, true);
        } catch (RuntimeException runtimeException) {
          throw AnimationSkeleton.addExceptionContext((Throwable) ((Object) runtimeException), "fl.I(" + (param0 != null ? "{...}" : "null") + ',' + param1 + ')');
        }
    }

    final void a(int param0, int param1, int param2, byte param3, int param4, int param5) {
        if (param3 < 44) {
          this.a(69, 37, 82, 84, -66);
        }
        SoftwareRaster.h(param2, param4, param5, param1, param0);
    }

    private final void a(int param0, int param1, int param2, String param3) {
        int var5_int = 0;
        int var6 = 0;
        int var7 = 0;
        int var8 = 0;
        try {
          var5_int = this.field_m.a(param3);
          var6 = this.field_m.field_z + this.field_m.field_L;
          var7 = param1;
          if (var5_int + (var7 - param0) > SoftwareRaster.width) {
            var7 = -6 - var5_int + SoftwareRaster.width;
          }
          var8 = 32 + (param2 - this.field_m.field_z);
          if (SoftwareRaster.height < var6 + (var8 + 6)) {
            var8 = -6 - var6 + SoftwareRaster.height;
          }
          SoftwareRaster.b(var7, var8, 6 + var5_int, var6 + 6, this.field_v);
          SoftwareRaster.f(1 + var7, 1 + var8, 4 + var5_int, var6 + 4, this.field_c);
          this.field_m.b(param3, var7 + 3, this.field_m.field_z + var8 + 3, this.field_v, -1);
        } catch (RuntimeException runtimeException) {
          throw AnimationSkeleton.addExceptionContext((Throwable) ((Object) runtimeException), "fl.J(" + param0 + ',' + param1 + ',' + param2 + ',' + (param3 != null ? "{...}" : "null") + ')');
        }
    }

    public static void a(byte param0) {
        field_f = null;
        field_u = null;
        if (param0 <= 75) {
          Battlefield var2 = (Battlefield) null;
          fl.a((Battlefield) null, -110);
        }
        field_l = null;
    }

    final void a(int param0, int param1, String param2, int param3) {
        RuntimeException stackIn_8_0 = null;
        StringBuilder stackIn_8_1 = null;
        String stackIn_9_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var5 = null;
        try {
          if (!this.field_g) {
            this.a(-6, param3, param0, param2);
          } else {
            this.a(true, param0, param3, param2);
          }
          if (param1 >= -99) {
            this.field_d = 107;
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var5 = decompiledCaughtException;
          stackIn_8_0 = var5;
          stackIn_8_1 = new StringBuilder().append("fl.D(").append(param0).append(',').append(param1).append(',');
          if (param2 == null) {
            stackIn_9_2 = "null";
          } else {
            stackIn_9_2 = "{...}";
          }
          throw AnimationSkeleton.addExceptionContext((Throwable) ((Object) stackIn_8_0), ((StringBuilder) (Object) stackIn_8_1).append(stackIn_9_2).append(',').append(param3).append(')').toString());
        }
    }

    private final void a(boolean param0, int param1, int param2, String param3) {
        RuntimeException stackIn_29_0 = null;
        StringBuilder stackIn_29_1 = null;
        String stackIn_30_2 = null;
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
        var15 = ArmiesOfGielinor.obfuscationControl ? 1 : 0;
        try {
          var5_int = this.field_r + this.field_x;
          var6 = this.field_d + this.field_h;
          var7 = this.field_o;
          if (var7 == -1) {
            var7 = this.field_m.field_H + this.field_m.field_L;
          }
          var8 = SoftwareRaster.width >> 2;
          var9 = this.field_m.a(param3);
          var10 = this.field_m.field_L + this.field_m.field_H;
          var11 = 1;
          if (var9 > var8 ||
            param3.indexOf("<br>") != -1) {
            if (null == MatchConditionRegistry.field_a) {
              MatchConditionRegistry.field_a = new String[16];
            }
            if (var8 >= var9) {
              var12 = var8;
            } else {
              var13 = var9 / var8;
              var12 = var8 + (-1 + var9 % var8 + var13) / var13 * 2;
            }
            var11Lifetime1 = this.field_m.a(param3, new int[]{var12}, MatchConditionRegistry.field_a);
            var10 = var10 + (-1 + var11Lifetime1) * var7;
            var9 = 0;
            for (var13Lifetime2 = 0; var11Lifetime1 > var13Lifetime2; var13Lifetime2++) {
              var14 = this.field_m.a(MatchConditionRegistry.field_a[var13Lifetime2]);
              if (var9 < var14) {
                var9 = var14;
              }
            }
          }
          var12 = param2;
          if (SoftwareRaster.width < var5_int + var9 + var12) {
            var12 = -var5_int + (SoftwareRaster.width - var9);
          }
          if (!param0) {
            this.field_w = (WidgetPainter) null;
          }
          var13Lifetime1 = 32 + param1 - this.field_m.field_z;
          if (SoftwareRaster.height < var6 + var13Lifetime1 + var10) {
            var13Lifetime1 = -var10 + (param1 - var6);
          }
          SoftwareRaster.b(var12, var13Lifetime1, var9 + var5_int, var10 + var6, this.field_s);
          SoftwareRaster.f(var12 + 1, 1 + var13Lifetime1, var5_int + (var9 - 2), -2 + (var10 + var6), this.field_c);
          this.field_m.a(param3, var12 + this.field_x, this.field_h + var13Lifetime1, var9, var10, this.field_v, -1, 0, 0, var7);
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var5 = decompiledCaughtException;
          stackIn_29_0 = var5;
          stackIn_29_1 = new StringBuilder().append("fl.A(").append(param0).append(',').append(param1).append(',').append(param2).append(',');
          if (param3 == null) {
            stackIn_30_2 = "null";
          } else {
            stackIn_30_2 = "{...}";
          }
          throw AnimationSkeleton.addExceptionContext((Throwable) ((Object) stackIn_29_0), ((StringBuilder) (Object) stackIn_29_1).append(stackIn_30_2).append(')').toString());
        }
    }

    final void a(int param0, int param1, int param2, int param3, int param4) {
        CampaignUnitOverride.a(param4, param1, param0, param2, (byte) 83);
        int var6 = 26 / ((param3 + 48) / 53);
    }

    final void a(int param0, int param1, int param2, boolean param3, int param4, int param5, int param6) {
        SoftwareRaster.b(param1, param2, param5, param4, param6, param0);
        if (!param3) {
          fl.a((byte) 3);
        }
    }

    final void a(int param0) {
        rf.b(-18862);
        if (param0 < 15) {
          field_l = (String) null;
        }
    }

    final void a(int param0, BitmapFont param1) {
        lk var17 = null;
        ao var4 = null;
        RgbSprite[] var5 = null;
        nj var16 = null;
        nj var18 = null;
        int var7_int = 0;
        ao var6 = null;
        ao var7 = null;
        or discarded$0 = null;
        kp discarded$1 = null;
        ao var8 = null;
        RgbSprite[] var9 = null;
        RgbSprite[] var10 = null;
        RgbSprite dupTemp$2 = null;
        ao var11 = null;
        ao var12 = null;
        RgbSprite var13 = null;
        ao var14 = null;
        ao var19 = null;
        int var15 = ArmiesOfGielinor.obfuscationControl ? 1 : 0;
        ao var14Lifetime1;
        ao var14Lifetime2;
        try {
          var17 = new lk(param1, 2, 2, 2236962, 1, 1, 1, param1.field_L + (param1.field_H + 2));
          this.field_t = (WidgetPainter) ((Object) var17);
          var17.field_d = 16777215;
          var4 = new ao();
          var17.a(var4, 24978);
          this.field_o = -1;
          this.field_x = 3;
          this.field_h = 3;
          this.field_m = param1;
          var4.field_l = 11711154;
          this.field_s = 15658734;
          this.field_d = 3;
          this.field_c = 5592405;
          this.field_v = 15658734;
          this.field_r = 3;
          var4.field_o = 15658734;
          var4.a(0, (byte) -102).a(15658734, (byte) -108).a(BufferedFile.a(10066329, 8947848, 1, 7829367), 53);
          var4.a(1, (byte) -119).a(BufferedFile.a(10066329, 11184810, 1, 13421772), 31);
          var4.a(3, (byte) -128).a(BufferedFile.a(7829367, 8947848, 1, 10066329), -128).a(1, 1).a((byte) 81, 1);
          var5 = new RgbSprite[9];
          var16 = new nj(32, 32);
          var18 = var16;
          for (var7_int = 0; var7_int < var18.pixels.length; var7_int++) {
            var16.pixels[var7_int] = 1077952576;
          }
          var5[4] = (RgbSprite) ((Object) var18);
          var4.a(4, (byte) -105).a(true, (byte) 66).a(var5, param0 - 13421900);
          var4.a(5, (byte) -113).a(ByteStorage.a(65793, 0, (byte) -125, 0, 0), -126).a(true, (byte) 121).a(-1, (byte) -109);
          this.field_j = (WidgetPainter) ((Object) var4);
          var6 = new ao(var4, true);
          var6.field_n = 0;
          var7 = new ao(var4, true);
          var7.field_n = 0;
          var7.a(-128, ak.b(8947848, 5));
          var7.a(1, (byte) -85).a(ak.b(11184810, 5), 67).a(2236962, (byte) -127);
          this.field_i = (WidgetPainter) ((Object) new tk(param1, 2, 2, 16777215, -1, 5, 5, 15, 15, 4473924));
          discarded$0 = new or(param1, 2, 2, 16777215, -1, 16777215, 16729156, 4473924);
          discarded$1 = new kp(param1, 16777215, -1, 125269879, 4473924, 3, 268435455);
          var8 = new ao();
          var17.a(var8, param0 ^ 13413726);
          var8.a(0, (byte) -128).a(BufferedFile.a(7829367, 15658734, param0 ^ 13421773, 10066329), 36).a(1118481, (byte) 27).b(-1, param0 ^ 13421751);
          var8.a(4, (byte) -108).a(true, (byte) 104).a(var5, -126);
          this.field_w = (WidgetPainter) ((Object) var8);
          var9 = new RgbSprite[9];
          var10 = new RgbSprite[9];
          var9[4] = new RgbSprite(2, 1);
          var10[4] = new RgbSprite(1, 2);
          dupTemp$2 = var9[4];
          dupTemp$2.pixels = new int[]{6710886, 7829367};
          var10[4].pixels = new int[]{6710886, 7829367};
          var11 = new ao();
          var12 = new ao();
          var11.a(var9, 0, param0 - 13421779);
          var12.a(var10, 0, param0 - 13421779);
          this.field_k = (WidgetPainter) ((Object) var12);
          this.field_p = (WidgetPainter) ((Object) var4);
          var13 = new RgbSprite(7, 4);
          var13.pixels = new int[]{8947848, 8947848, 8947848, 13421772, 8947848, 8947848, 8947848, 8947848, 8947848, param0, 13421772, 13421772, 8947848, 8947848, 8947848, 13421772, 13421772, 13421772, 13421772, 13421772, 8947848, 13421772, 13421772, 13421772, 13421772, 13421772, 13421772, 13421772};
          this.field_a = 10;
          var14 = new ao(var4, true);
          var14.a(0, var13.g());
          var13.d();
          var14Lifetime1 = new ao(var4, true);
          var14Lifetime1.a(0, var13.g());
          var13.d();
          var14Lifetime2 = new ao(var4, true);
          var14Lifetime2.a(0, var13.g());
          var13.d();
          var19 = new ao(var4, true);
          var19.a(0, var13);
        } catch (RuntimeException runtimeException) {
          throw AnimationSkeleton.addExceptionContext((Throwable) ((Object) runtimeException), "fl.C(" + param0 + ',' + (param1 != null ? "{...}" : "null") + ')');
        }
    }

    public fl() {
        this.field_g = true;
    }

    static {
        field_u = new h(2);
        field_l = "Join";
        field_f = new int[8192];
    }
}
