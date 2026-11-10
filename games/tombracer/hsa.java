/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class hsa {
    private SoftReferenceCache field_d;
    private d field_b;
    static int field_a;
    private OpenGlToolkit field_e;
    static String field_c;

    final void c(int param0) {
        if (param0 != -29413) {
          field_a = 14;
          this.field_d.demoteOldEntries(104, 5);
          return;
        }
        this.field_d.demoteOldEntries(104, 5);
    }

    final LegacyOpenGlTexture2D a(int param0, int param1) {
        Object var3;
        dw var5;
        int var6;
        int[] var7;
        int var8;
        dw var12;
        int stackIn_9_0 = 0;
        LegacyOpenGlTexture2D stackIn_17_0;
        LegacyOpenGlTexture2D stackIn_17_1;
        OpenGlToolkit stackIn_17_2;
        int stackIn_17_3;
        int stackIn_17_4;
        int stackIn_17_5;
        int stackIn_17_6;
        LegacyOpenGlTexture2D stackIn_18_0 = null;
        LegacyOpenGlTexture2D stackIn_18_1 = null;
        boolean stackIn_18_7 = false;
        LegacyOpenGlTexture2D stackIn_23_0;
        LegacyOpenGlTexture2D stackIn_23_1;
        OpenGlToolkit stackIn_23_2;
        int stackIn_23_3;
        int stackIn_23_4;
        int stackIn_23_5;
        int stackIn_23_6;
        LegacyOpenGlTexture2D stackIn_24_0 = null;
        LegacyOpenGlTexture2D stackIn_24_1 = null;
        boolean stackIn_24_7 = false;
        LegacyOpenGlTexture2D stackIn_28_0;
        LegacyOpenGlTexture2D stackIn_28_1;
        OpenGlToolkit stackIn_28_2;
        int stackIn_28_3;
        int stackIn_28_4;
        int stackIn_28_5;
        int stackIn_28_6;
        LegacyOpenGlTexture2D stackIn_29_0 = null;
        LegacyOpenGlTexture2D stackIn_29_1 = null;
        boolean stackIn_29_7 = false;
        LegacyOpenGlTexture2D stackIn_34_0;
        LegacyOpenGlTexture2D stackIn_34_1;
        OpenGlToolkit stackIn_34_2;
        int stackIn_34_3;
        int stackIn_34_4;
        int stackIn_34_5;
        int stackIn_34_6;
        LegacyOpenGlTexture2D stackIn_35_0 = null;
        LegacyOpenGlTexture2D stackIn_35_1 = null;
        boolean stackIn_35_7 = false;
        LegacyOpenGlTexture2D stackIn_38_0;
        LegacyOpenGlTexture2D stackIn_38_1;
        OpenGlToolkit stackIn_38_2;
        int stackIn_38_3;
        int stackIn_38_4;
        int stackIn_38_5;
        int stackIn_38_6;
        LegacyOpenGlTexture2D stackIn_39_0 = null;
        LegacyOpenGlTexture2D stackIn_39_1 = null;
        boolean stackIn_39_7 = false;
        int stackIn_49_0 = 0;
        LegacyOpenGlTexture2D stackIn_56_0;
        LegacyOpenGlTexture2D stackIn_56_1;
        OpenGlToolkit stackIn_56_2;
        int stackIn_56_3;
        int stackIn_56_4;
        int stackIn_56_5;
        int stackIn_56_6;
        LegacyOpenGlTexture2D stackIn_57_0 = null;
        LegacyOpenGlTexture2D stackIn_57_1 = null;
        boolean stackIn_57_7 = false;
        LegacyOpenGlTexture2D stackIn_61_0;
        LegacyOpenGlTexture2D stackIn_61_1;
        OpenGlToolkit stackIn_61_2;
        int stackIn_61_3;
        int stackIn_61_4;
        int stackIn_61_5;
        int stackIn_61_6;
        LegacyOpenGlTexture2D stackIn_62_0;
        LegacyOpenGlTexture2D stackIn_62_1;
        boolean stackIn_62_7;
        LegacyOpenGlTexture2D stackIn_71_0;
        LegacyOpenGlTexture2D stackIn_71_1;
        OpenGlToolkit stackIn_71_2;
        int stackIn_71_3;
        int stackIn_71_4;
        int stackIn_71_5;
        int stackIn_71_6;
        LegacyOpenGlTexture2D stackIn_72_0 = null;
        LegacyOpenGlTexture2D stackIn_72_1 = null;
        boolean stackIn_72_7 = false;
        LegacyOpenGlTexture2D var4;
        float[] var7_array;
        float[] var9;
        float[] var10;
        float[] var11;
        LegacyOpenGlTexture2D var13;
        LegacyOpenGlTexture2D var21;
        LegacyOpenGlTexture2D var28;
        LegacyOpenGlTexture2D var35;
        LegacyOpenGlTexture2D var38;
        dw var39;
        LegacyOpenGlTexture2D var40;
        LegacyOpenGlTexture2D var41;
        int[] var43;
        int[] var45;
        int[] var47;
        int var6Lifetime1;
        int[] var7Lifetime1;
        float[] var7_arrayLifetime1;
        float[] var9Lifetime1;
        float[] var10Lifetime1;
        float[] var11Lifetime1;
        int[] var7Lifetime2;
        var8 = TombRacer.field_G ? 1 : 0;
        var3 = this.field_d.a((byte) 56, (long)param0);
        if (param1 == 0) {
          if (var3 != null) {
            return (LegacyOpenGlTexture2D) (var3);
          }
          if (!this.field_b.a(param0, (byte) 34)) {
            return null;
          }
          var39 = this.field_b.a((byte) 96, param0);
          if (var39.field_g) {
            stackIn_49_0 = 64;
          } else {
            stackIn_49_0 = this.field_e.field_dc;
          }
          var6 = stackIn_49_0;
          if (!var39.field_l) {
            if (2 != var39.field_d &&
              PlayTrackCommand.a((int) var39.field_h, false)) {
              var7 = this.field_b.a(14907, param0, true, var6, 0.699999988079071f, var6);
            } else {
              var7 = this.field_b.a((byte) 40, var6, 0.699999988079071f, param0, false, var6);
            }
            stackIn_56_0 = null;
            stackIn_56_1 = null;
            stackIn_56_2 = this.field_e;
            stackIn_56_3 = 3553;
            stackIn_56_4 = 6408;
            stackIn_56_5 = var6;
            stackIn_56_6 = var6;
            if (0 == var39.field_r) {
              stackIn_57_0 = null;
              stackIn_57_1 = null;
              stackIn_57_7 = false;
            } else {
              stackIn_57_0 = null;
              stackIn_57_1 = null;
              stackIn_57_7 = true;
            }
            var40 = new LegacyOpenGlTexture2D(stackIn_56_2, stackIn_56_3, stackIn_56_4, stackIn_56_5, stackIn_56_6, stackIn_57_7, var7, 0, 0, false);
            var40.setWrap(var39.field_n, var39.field_b, -3554);
            this.field_d.put(param1 + 29166, var40, (long)param0);
            return var40;
          }
          if (this.field_e.f()) {
            var11 = this.field_b.a(param1 ^ 122, var6, var6, param0, 0.699999988079071f, false);
            var10 = var11;
            var9 = var10;
            var7_array = var9;
            stackIn_61_0 = null;
            stackIn_61_1 = null;
            stackIn_61_2 = this.field_e;
            stackIn_61_3 = 3553;
            stackIn_61_4 = 34842;
            stackIn_61_5 = var6;
            stackIn_61_6 = var6;
            if (var39.field_r == 0) {
              stackIn_62_0 = null;
              stackIn_62_1 = null;
              stackIn_62_7 = false;
            } else {
              stackIn_62_0 = null;
              stackIn_62_1 = null;
              stackIn_62_7 = true;
            }
            var4 = new LegacyOpenGlTexture2D(stackIn_61_2, stackIn_61_3, stackIn_61_4, stackIn_61_5, stackIn_61_6, stackIn_62_7, var11, 6408);
            var4.setWrap(var39.field_n, var39.field_b, -3554);
            this.field_d.put(param1 + 29166, var4, (long)param0);
            return var4;
          }
          if (2 != var39.field_d &&
            PlayTrackCommand.a((int) var39.field_h, false)) {
            var7Lifetime2 = this.field_b.a(14907, param0, true, var6, 0.699999988079071f, var6);
          } else {
            var7Lifetime2 = this.field_b.a((byte) 40, var6, 0.699999988079071f, param0, false, var6);
          }
          stackIn_71_0 = null;
          stackIn_71_1 = null;
          stackIn_71_2 = this.field_e;
          stackIn_71_3 = 3553;
          stackIn_71_4 = 6408;
          stackIn_71_5 = var6;
          stackIn_71_6 = var6;
          if (0 == var39.field_r) {
            stackIn_72_0 = null;
            stackIn_72_1 = null;
            stackIn_72_7 = false;
          } else {
            stackIn_72_0 = null;
            stackIn_72_1 = null;
            stackIn_72_7 = true;
          }
          var41 = new LegacyOpenGlTexture2D(stackIn_71_2, stackIn_71_3, stackIn_71_4, stackIn_71_5, stackIn_71_6, stackIn_72_7, var7Lifetime2, 0, 0, false);
          var41.setWrap(var39.field_n, var39.field_b, -3554);
          this.field_d.put(param1 + 29166, var41, (long)param0);
          return var41;
        }
        hsa.releaseStatics(74);
        if (var3 != null) {
          return (LegacyOpenGlTexture2D) (var3);
        }
        if (!this.field_b.a(param0, (byte) 34)) {
          return null;
        }
        var12 = this.field_b.a((byte) 96, param0);
        var5 = var12;
        if (var12.field_g) {
          stackIn_9_0 = 64;
        } else {
          stackIn_9_0 = this.field_e.field_dc;
        }
        var6Lifetime1 = stackIn_9_0;
        if (!var12.field_l) {
          if (2 == var12.field_d) {
            var7Lifetime1 = this.field_b.a((byte) 40, var6Lifetime1, 0.699999988079071f, param0, false, var6Lifetime1);
          } else {
            if (!PlayTrackCommand.a((int) var12.field_h, false)) {
              var7Lifetime1 = this.field_b.a((byte) 40, var6Lifetime1, 0.699999988079071f, param0, false, var6Lifetime1);
            } else {
              var7Lifetime1 = this.field_b.a(14907, param0, true, var6Lifetime1, 0.699999988079071f, var6Lifetime1);
            }
          }
          stackIn_17_0 = null;
          stackIn_17_1 = null;
          stackIn_17_2 = this.field_e;
          stackIn_17_3 = 3553;
          stackIn_17_4 = 6408;
          stackIn_17_5 = var6Lifetime1;
          stackIn_17_6 = var6Lifetime1;
          if (0 == var12.field_r) {
            stackIn_18_0 = null;
            stackIn_18_1 = null;
            stackIn_18_7 = false;
          } else {
            stackIn_18_0 = null;
            stackIn_18_1 = null;
            stackIn_18_7 = true;
          }
          var13 = new LegacyOpenGlTexture2D(stackIn_17_2, stackIn_17_3, stackIn_17_4, stackIn_17_5, stackIn_17_6, stackIn_18_7, var7Lifetime1, 0, 0, false);
          var13.setWrap(var12.field_n, var12.field_b, -3554);
          this.field_d.put(param1 + 29166, var13, (long)param0);
          return var13;
        }
        if (this.field_e.f()) {
          var11Lifetime1 = this.field_b.a(param1 ^ 122, var6Lifetime1, var6Lifetime1, param0, 0.699999988079071f, false);
          var10Lifetime1 = var11Lifetime1;
          var9Lifetime1 = var10Lifetime1;
          var7_arrayLifetime1 = var9Lifetime1;
          stackIn_23_0 = null;
          stackIn_23_1 = null;
          stackIn_23_2 = this.field_e;
          stackIn_23_3 = 3553;
          stackIn_23_4 = 34842;
          stackIn_23_5 = var6Lifetime1;
          stackIn_23_6 = var6Lifetime1;
          if (var12.field_r == 0) {
            stackIn_24_0 = null;
            stackIn_24_1 = null;
            stackIn_24_7 = false;
          } else {
            stackIn_24_0 = null;
            stackIn_24_1 = null;
            stackIn_24_7 = true;
          }
          var38 = new LegacyOpenGlTexture2D(stackIn_23_2, stackIn_23_3, stackIn_23_4, stackIn_23_5, stackIn_23_6, stackIn_24_7, var11Lifetime1, 6408);
          var38.setWrap(var12.field_n, var12.field_b, -3554);
          this.field_d.put(param1 + 29166, var38, (long)param0);
          return var38;
        }
        if (2 == var12.field_d) {
          var43 = this.field_b.a((byte) 40, var6Lifetime1, 0.699999988079071f, param0, false, var6Lifetime1);
          stackIn_28_0 = null;
          stackIn_28_1 = null;
          stackIn_28_2 = this.field_e;
          stackIn_28_3 = 3553;
          stackIn_28_4 = 6408;
          stackIn_28_5 = var6Lifetime1;
          stackIn_28_6 = var6Lifetime1;
          if (0 == var12.field_r) {
            stackIn_29_0 = null;
            stackIn_29_1 = null;
            stackIn_29_7 = false;
          } else {
            stackIn_29_0 = null;
            stackIn_29_1 = null;
            stackIn_29_7 = true;
          }
          var21 = new LegacyOpenGlTexture2D(stackIn_28_2, stackIn_28_3, stackIn_28_4, stackIn_28_5, stackIn_28_6, stackIn_29_7, var43, 0, 0, false);
          var21.setWrap(var12.field_n, var12.field_b, -3554);
          this.field_d.put(param1 + 29166, var21, (long)param0);
          return var21;
        }
        if (!PlayTrackCommand.a((int) var12.field_h, false)) {
          var45 = this.field_b.a((byte) 40, var6Lifetime1, 0.699999988079071f, param0, false, var6Lifetime1);
          stackIn_38_0 = null;
          stackIn_38_1 = null;
          stackIn_38_2 = this.field_e;
          stackIn_38_3 = 3553;
          stackIn_38_4 = 6408;
          stackIn_38_5 = var6Lifetime1;
          stackIn_38_6 = var6Lifetime1;
          if (0 == var12.field_r) {
            stackIn_39_0 = null;
            stackIn_39_1 = null;
            stackIn_39_7 = false;
          } else {
            stackIn_39_0 = null;
            stackIn_39_1 = null;
            stackIn_39_7 = true;
          }
          var28 = new LegacyOpenGlTexture2D(stackIn_38_2, stackIn_38_3, stackIn_38_4, stackIn_38_5, stackIn_38_6, stackIn_39_7, var45, 0, 0, false);
          var28.setWrap(var12.field_n, var12.field_b, -3554);
          this.field_d.put(param1 + 29166, var28, (long)param0);
          return var28;
        }
        var47 = this.field_b.a(14907, param0, true, var6Lifetime1, 0.699999988079071f, var6Lifetime1);
        stackIn_34_0 = null;
        stackIn_34_1 = null;
        stackIn_34_2 = this.field_e;
        stackIn_34_3 = 3553;
        stackIn_34_4 = 6408;
        stackIn_34_5 = var6Lifetime1;
        stackIn_34_6 = var6Lifetime1;
        if (0 == var12.field_r) {
          stackIn_35_0 = null;
          stackIn_35_1 = null;
          stackIn_35_7 = false;
        } else {
          stackIn_35_0 = null;
          stackIn_35_1 = null;
          stackIn_35_7 = true;
        }
        var35 = new LegacyOpenGlTexture2D(stackIn_34_2, stackIn_34_3, stackIn_34_4, stackIn_34_5, stackIn_34_6, stackIn_35_7, var47, 0, 0, false);
        var35.setWrap(var12.field_n, var12.field_b, -3554);
        this.field_d.put(param1 + 29166, var35, (long)param0);
        return var35;
    }

    final static int a(int param0, int param1, int param2, byte param3) {
        int var4 = 77 % ((param3 + 18) / 63);
        if (!(param1 + (param0 + param2) > SoftwareRasterizer.height)) {
          return param0 + param2;
        }
        if (-param1 + param2 < 0) {
          return SoftwareRasterizer.height - param1;
        }
        return -param1 + param2;
    }

    final void a(int param0) {
        this.field_d.clear((byte) -118);
        if (param0 != 10659) {
          this.field_e = (OpenGlToolkit) null;
        }
    }

    public static void releaseStatics(int param0) {
        int var1 = 68 % ((-12 - param0) / 61);
        field_c = null;
    }

    hsa(OpenGlToolkit param0, d param1) {
        this.field_d = new SoftReferenceCache(256);
        try {
          this.field_b = param1;
          this.field_e = param0;
        } catch (RuntimeException runtimeException) {
          throw tba.a((Throwable) ((Object) runtimeException), "hsa.<init>(" + (param0 != null ? "{...}" : "null") + ',' + (param1 != null ? "{...}" : "null") + ')');
        }
    }

    static {
        field_c = "Press to start a room again";
    }
}
