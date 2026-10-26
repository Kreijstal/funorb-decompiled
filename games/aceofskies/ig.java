/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class ig extends BitmapFont {
    private tl field_h;
    private boolean field_g;
    private bf field_f;
    private qi field_e;

    final void a(char param0, int param1, int param2, int param3, boolean param4, aa param5, int param6, int param7) {
    }

    ig(bf param0, vs param1, vd[] param2, boolean param3) {
        super(param0, param1);
        int incrementValue$3 = 0;
        int incrementValue$0 = 0;
        byte dupTemp$1 = 0;
        int incrementValue$2 = 0;
        int incrementValue$6 = 0;
        int incrementValue$7 = 0;
        int var9 = 0;
        byte[] stackIn_21_0 = null;
        int stackIn_21_1 = 0;
        int stackIn_22_2 = 0;
        int var5;
        int var6;
        int[] var7_ref_int__;
        byte[] var7_ref_byte__;
        int var7;
        int var8;
        int[] var8_ref_int__;
        int[] var10_ref_int__;
        int var10_int;
        float var10;
        byte[] var11_ref_byte__;
        int var11_int;
        float var11;
        byte[] var12_ref_byte__;
        int var12;
        int var13_int;
        vd var13;
        int var14;
        int var15;
        int var16;
        byte[] var16_ref_byte__;
        int var17;
        int var18_int;
        float var18;
        int var19_int;
        float var19;
        int var20_int;
        float var20;
        int var21_int;
        float var21;
        float var22;
        float var23;
        int var24;
        vd var25;
        vd var26;
        byte[] var27;
        int[] var28;
        vd var29;
        byte[] var30;
        byte[] var31;
        int[] var32;
        jaclib.memory.Buffer var33;
        jaclib.memory.Stream var34;
        byte[] var35;
        int[] var36;
        byte[] var37;
        byte[] var38;
        int[] var39;
        int var12Lifetime1;
        int var14Lifetime1;
        int var15Lifetime1;
        int var16Lifetime1;
        int var17Lifetime1;
        int var6Lifetime1;
        this.field_f = param0;
        var5 = 0;
        for (var6 = 0; var6 < 256; var6++) {
          var25 = param2[var6];
          if (var25.field_c > var5) {
            var5 = var25.field_c;
          }
          if (var25.field_h > var5) {
            var5 = var25.field_h;
          }
        }
        var6Lifetime1 = var5 * 16;
        if (!param3) {
          var39 = new int[var6Lifetime1 * var6Lifetime1];
          var32 = var39;
          var7_ref_int__ = var32;
          for (var8 = 0; var8 < 256; var8++) {
            var29 = param2[var8];
            var10_ref_int__ = var29.field_f;
            var37 = var29.field_e;
            var30 = var37;
            var11_ref_byte__ = var30;
            var38 = var29.field_d;
            var31 = var38;
            var12_ref_byte__ = var31;
            var13_int = var29.field_c;
            var14 = var29.field_h;
            var15 = var8 % 16 * var5;
            var16 = var8 / 16 * var5;
            var17 = var16 * var6Lifetime1 + var15;
            var18_int = 0;
            if (var11_ref_byte__ != null) {
              for (var19_int = 0; var19_int < var13_int; var19_int++) {
                for (var20_int = 0; var20_int < var14; var20_int++) {
                  incrementValue$3 = var17;
                  var17++;
                  var7_ref_int__[incrementValue$3] = var37[var18_int] << 24 | var10_ref_int__[var38[var18_int] & 255];
                  var18_int++;
                }
                var17 = var17 + (var6Lifetime1 - var14);
              }
            } else {
              for (var19_int = 0; var19_int < var13_int; var19_int++) {
                for (var20_int = 0; var20_int < var14; var20_int++) {
                  incrementValue$0 = var18_int;
                  var18_int++;
                  dupTemp$1 = var12_ref_byte__[incrementValue$0];
                  var21_int = dupTemp$1;
                  if (dupTemp$1 == 0) {
                    var17++;
                  } else {
                    incrementValue$2 = var17;
                    var17++;
                    var7_ref_int__[incrementValue$2] = -16777216 | var10_ref_int__[var21_int & 255];
                  }
                }
                var17 = var17 + (var6Lifetime1 - var14);
              }
            }
          }
          this.field_e = param0.a(var39, var6Lifetime1, 0, false, var6Lifetime1);
          this.field_g = false;
        } else {
          var35 = new byte[var6Lifetime1 * var6Lifetime1];
          var27 = var35;
          var7_ref_byte__ = var27;
          for (var8 = 0; var8 < 256; var8++) {
            var26 = param2[var8];
            var10_int = var26.field_c;
            var11_int = var26.field_h;
            var12 = var8 % 16 * var5;
            var13_int = var8 / 16 * var5;
            var14 = var13_int * var6Lifetime1 + var12;
            var15 = 0;
            if (var26.field_e != null) {
              var16_ref_byte__ = var26.field_e;
              for (var17 = 0; var17 < var10_int; var17++) {
                for (var18_int = 0; var18_int < var11_int; var18_int++) {
                  var7_ref_byte__[var14++] = var16_ref_byte__[var15++];
                }
                var14 = var14 + (var6Lifetime1 - var11_int);
              }
            } else {
              var16_ref_byte__ = var26.field_d;
              for (var17 = 0; var17 < var10_int; var17++) {
                for (var18_int = 0; var18_int < var11_int; var18_int++) {
                  incrementValue$6 = var14;
                  var14++;
                  incrementValue$7 = var15;
                  var15++;
                  stackIn_21_0 = var7_ref_byte__;
                  stackIn_21_1 = incrementValue$6;
                  if (var16_ref_byte__[incrementValue$7] != 0) {
                    stackIn_22_2 = -1;
                  } else {
                    stackIn_22_2 = 0;
                  }
                  stackIn_21_0[stackIn_21_1] = (byte)stackIn_22_2;
                }
                var14 = var14 + (var6Lifetime1 - var11_int);
              }
            }
          }
          if (!param0.a(la.field_h, 0, ro.field_o)) {
            var36 = new int[var35.length];
            var28 = var36;
            var8_ref_int__ = var28;
            for (var9 = 0; var9 < var35.length; var9++) {
              var8_ref_int__[var9] = var35[var9] << 24;
            }
            this.field_e = param0.a(var36, var6Lifetime1, 0, false, var6Lifetime1);
          } else {
            this.field_e = param0.a(var35, var6Lifetime1, true, var6Lifetime1, ro.field_o, false);
          }
          this.field_g = true;
        }
        this.field_e.a(jp.field_a, -31662);
        this.field_h = param0.a(false, (byte) 126);
        this.field_h.a(20, -121, 20480);
        var7 = 0;
        while (var7 < 4) {
          var33 = this.field_h.a(true, (byte) -126);
          if (var33 != null) {
            var34 = this.field_f.a(112, var33);
            var10 = this.field_e.a(118, (float)var6Lifetime1) / (float)var6Lifetime1;
            var11 = this.field_e.a((float)var6Lifetime1, (byte) -32) / (float)var6Lifetime1;
            var24 = 0;
            var12Lifetime1 = var24;
            while (var24 < 256) {
              var13 = param2[var24];
              var14Lifetime1 = var13.field_c;
              var15Lifetime1 = var13.field_h;
              var16Lifetime1 = var13.field_i;
              var17Lifetime1 = var13.field_a;
              var18 = (float)(var24 % 16 * var5);
              var19 = (float)(var24 / 16 * var5);
              var20 = var18 * var10;
              var21 = var19 * var11;
              var22 = (var18 + (float)var15Lifetime1) * var10;
              var23 = (var19 + (float)var14Lifetime1) * var11;
              if (!jaclib.memory.Stream.b()) {
                var34.a((float)var17Lifetime1);
                var34.a((float)var16Lifetime1);
                var34.a(0.0f);
                var34.a(var20);
                var34.a(var21);
                var34.a((float)var17Lifetime1);
                var34.a((float)(var16Lifetime1 + var14Lifetime1));
                var34.a(0.0f);
                var34.a(var20);
                var34.a(var23);
                var34.a((float)(var17Lifetime1 + var15Lifetime1));
                var34.a((float)(var16Lifetime1 + var14Lifetime1));
                var34.a(0.0f);
                var34.a(var22);
                var34.a(var23);
                var34.a((float)(var17Lifetime1 + var15Lifetime1));
                var34.a((float)var16Lifetime1);
                var34.a(0.0f);
                var34.a(var22);
                var34.a(var21);
              } else {
                var34.b((float)var17Lifetime1);
                var34.b((float)var16Lifetime1);
                var34.b(0.0f);
                var34.b(var20);
                var34.b(var21);
                var34.b((float)var17Lifetime1);
                var34.b((float)(var16Lifetime1 + var14Lifetime1));
                var34.b(0.0f);
                var34.b(var20);
                var34.b(var23);
                var34.b((float)(var17Lifetime1 + var15Lifetime1));
                var34.b((float)(var16Lifetime1 + var14Lifetime1));
                var34.b(0.0f);
                var34.b(var22);
                var34.b(var23);
                var34.b((float)(var17Lifetime1 + var15Lifetime1));
                var34.b((float)var16Lifetime1);
                var34.b(0.0f);
                var34.b(var22);
                var34.b(var21);
              }
              var24++;
            }
            var34.a();
            if (this.field_h.a((byte) -60)) {
              return;
            }
          }
          var7++;
        }
        return;
    }

    final void fa(char param0, int param1, int param2, int param3, boolean param4) {
        ec var6;
        this.field_f.x(-23608);
        this.field_f.a(this.field_e, -9135);
        if (!this.field_g &&
          !param4) {
          this.field_f.a(bd.field_C, true, bd.field_C);
        } else {
          this.field_f.a(bd.field_C, true, ru.field_a);
          this.field_f.a((byte) 122, 0, bs.field_a);
          this.field_f.a((byte) -74, param3);
        }
        var6 = this.field_f.y(-108);
        var6.a(0, (byte) 106, param1, param2);
        this.field_f.q((byte) 57);
        this.field_f.a(1, this.field_h, 0);
        this.field_f.a(this.field_f.field_Eb, (byte) 75);
        this.field_f.a(true, qp.field_j, 2, param0 * 4);
        if (this.field_g ||
          param4) {
          this.field_f.a((byte) 118, 0, CipherPacketBuffer.field_p);
        }
    }
}
