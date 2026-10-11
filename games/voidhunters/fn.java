/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class fn extends da {
    private qfa field_f;
    private bt field_d;
    private boolean field_c;
    private im field_e;

    fn(qfa param0, sw param1, ima[] param2, boolean param3) {
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
        float var7;
        int var8_int;
        float var8;
        int[] var10;
        int var10_int;
        byte[] var11_ref_byte__;
        int var11;
        byte[] var12_ref_byte__;
        int var12;
        int var13;
        int var14;
        int var15_int;
        float var15;
        int var16_int;
        byte[] var16_ref_byte__;
        float var16;
        int var17_int;
        float var17;
        int var18_int;
        float var18;
        int var19_int;
        float var19;
        int var20_int;
        float var20;
        int var21;
        ima var22;
        ima var23;
        byte[] var24;
        ima var25;
        byte[] var26;
        byte[] var27;
        int[] var28;
        ima var29;
        byte[] var30;
        byte[] var31;
        byte[] var32;
        int[] var33;
        int var11Lifetime1;
        int var12Lifetime1;
        int var13Lifetime1;
        int var14Lifetime1;
        int var6Lifetime1;
        this.field_f = param0;
        var5 = 0;
        for (var6 = 0; var6 < 256; var6++) {
          var22 = param2[var6];
          if (var22.field_e > var5) {
            var5 = var22.field_e;
          }
          if (var22.field_f > var5) {
            var5 = var22.field_f;
          }
        }
        var6Lifetime1 = var5 * 16;
        if (!param3) {
          var33 = new int[var6Lifetime1 * var6Lifetime1];
          var28 = var33;
          var7_ref_int__ = var28;
          for (var8_int = 0; var8_int < 256; var8_int++) {
            var25 = param2[var8_int];
            var10 = var25.field_b;
            var31 = var25.field_a;
            var26 = var31;
            var11_ref_byte__ = var26;
            var32 = var25.field_h;
            var27 = var32;
            var12_ref_byte__ = var27;
            var13 = var25.field_e;
            var14 = var25.field_f;
            var15_int = var8_int % 16 * var5;
            var16_int = var8_int / 16 * var5;
            var17_int = var16_int * var6Lifetime1 + var15_int;
            var18_int = 0;
            if (var11_ref_byte__ != null) {
              for (var19_int = 0; var19_int < var13; var19_int++) {
                for (var20_int = 0; var20_int < var14; var20_int++) {
                  incrementValue$3 = var17_int;
                  var17_int++;
                  var7_ref_int__[incrementValue$3] = var31[var18_int] << 24 | var10[var32[var18_int] & 255];
                  var18_int++;
                }
                var17_int = var17_int + (var6Lifetime1 - var14);
              }
            } else {
              for (var19_int = 0; var19_int < var13; var19_int++) {
                for (var20_int = 0; var20_int < var14; var20_int++) {
                  incrementValue$0 = var18_int;
                  var18_int++;
                  dupTemp$1 = var12_ref_byte__[incrementValue$0];
                  var21 = dupTemp$1;
                  if (dupTemp$1 == 0) {
                    var17_int++;
                  } else {
                    incrementValue$2 = var17_int;
                    var17_int++;
                    var7_ref_int__[incrementValue$2] = -16777216 | var10[var21 & 255];
                  }
                }
                var17_int = var17_int + (var6Lifetime1 - var14);
              }
            }
          }
          this.field_e = uw.a(param0, 0, 0, var6Lifetime1, var33, var6Lifetime1, false, (byte) 60);
          this.field_c = false;
        } else {
          var30 = new byte[var6Lifetime1 * var6Lifetime1];
          var24 = var30;
          var7_ref_byte__ = var24;
          for (var8_int = 0; var8_int < 256; var8_int++) {
            var23 = param2[var8_int];
            var10_int = var23.field_e;
            var11 = var23.field_f;
            var12 = var8_int % 16 * var5;
            var13 = var8_int / 16 * var5;
            var14 = var13 * var6Lifetime1 + var12;
            var15_int = 0;
            if (var23.field_a != null) {
              var16_ref_byte__ = var23.field_a;
              for (var17_int = 0; var17_int < var10_int; var17_int++) {
                for (var18_int = 0; var18_int < var11; var18_int++) {
                  var7_ref_byte__[var14++] = var16_ref_byte__[var15_int++];
                }
                var14 = var14 + (var6Lifetime1 - var11);
              }
            } else {
              var16_ref_byte__ = var23.field_h;
              for (var17_int = 0; var17_int < var10_int; var17_int++) {
                for (var18_int = 0; var18_int < var11; var18_int++) {
                  incrementValue$6 = var14;
                  var14++;
                  incrementValue$7 = var15_int;
                  var15_int++;
                  stackIn_21_0 = var7_ref_byte__;
                  stackIn_21_1 = incrementValue$6;
                  if (var16_ref_byte__[incrementValue$7] != 0) {
                    stackIn_22_2 = -1;
                  } else {
                    stackIn_22_2 = 0;
                  }
                  stackIn_21_0[stackIn_21_1] = (byte)stackIn_22_2;
                }
                var14 = var14 + (var6Lifetime1 - var11);
              }
            }
          }
          this.field_e = kia.a(var6Lifetime1, param0, var6Lifetime1, var30, 6406, false, 21989, 6406);
          this.field_c = true;
        }
        this.field_e.a(107, false);
        this.field_d = new bt(param0, 256);
        var7 = this.field_e.field_n / (float)this.field_e.field_m;
        var8 = this.field_e.field_o / (float)this.field_e.field_p;
        for (var9 = 0; var9 < 256; var9++) {
          var29 = param2[var9];
          var11Lifetime1 = var29.field_e;
          var12Lifetime1 = var29.field_f;
          var13Lifetime1 = var29.field_g;
          var14Lifetime1 = var29.field_c;
          var15 = (float)(var9 % 16 * var5);
          var16 = (float)(var9 / 16 * var5);
          var17 = var15 * var7;
          var18 = var16 * var8;
          var19 = (var15 + (float)var12Lifetime1) * var7;
          var20 = (var16 + (float)var11Lifetime1) * var8;
          this.field_d.a(-104, var9);
          jaggl.OpenGL.glBegin(7);
          jaggl.OpenGL.glTexCoord2f(var17, this.field_e.field_o - var18);
          jaggl.OpenGL.glVertex2i(var14Lifetime1, var13Lifetime1);
          jaggl.OpenGL.glTexCoord2f(var17, this.field_e.field_o - var20);
          jaggl.OpenGL.glVertex2i(var14Lifetime1, var13Lifetime1 + var11Lifetime1);
          jaggl.OpenGL.glTexCoord2f(var19, this.field_e.field_o - var20);
          jaggl.OpenGL.glVertex2i(var14Lifetime1 + var12Lifetime1, var13Lifetime1 + var11Lifetime1);
          jaggl.OpenGL.glTexCoord2f(var19, this.field_e.field_o - var18);
          jaggl.OpenGL.glVertex2i(var14Lifetime1 + var12Lifetime1, var13Lifetime1);
          jaggl.OpenGL.glEnd();
          this.field_d.b(4864);
        }
    }

    final void fa(char param0, int param1, int param2, int param3, boolean param4) {
        this.field_f.c(false);
        this.field_f.a(115, this.field_e);
        if (!this.field_c &&
          !param4) {
          this.field_f.b(7681, 7681, false);
        } else {
          this.field_f.b(7681, 8448, false);
          this.field_f.c(0, 34192, 768, 34168);
        }
        jaggl.OpenGL.glColor4ub((byte)(param3 >> 16), (byte)(param3 >> 8), (byte)param3, (byte)(param3 >> 24));
        jaggl.OpenGL.glTranslatef((float)param1, (float)param2, 0.0f);
        this.field_d.a(true, param0);
        jaggl.OpenGL.glLoadIdentity();
        if (this.field_c ||
          param4) {
          this.field_f.c(0, 34192, 768, 5890);
        }
    }

    final void a(char param0, int param1, int param2, int param3, boolean param4, aa param5, int param6, int param7) {
        asa var9;
        im var10;
        float var11;
        float var12;
        var9 = (asa) (param5);
        var10 = var9.field_b;
        this.field_f.c(false);
        this.field_f.a(34, this.field_e);
        if (!this.field_c &&
          !param4) {
          this.field_f.b(7681, 7681, false);
        } else {
          this.field_f.b(7681, 8448, false);
          this.field_f.c(0, 34192, 768, 34168);
        }
        this.field_f.h(33984, 1);
        this.field_f.a(126, var10);
        this.field_f.b(7681, 8448, false);
        this.field_f.c(0, 34192, 768, 34168);
        jaggl.OpenGL.glTexGeni(8192, 9472, 9216);
        jaggl.OpenGL.glTexGeni(8193, 9472, 9216);
        var11 = var10.field_n / (float)var10.field_m;
        var12 = var10.field_o / (float)var10.field_p;
        jaggl.OpenGL.glTexGenfv(8192, 9474, new float[]{var11, 0.0f, 0.0f, (float)(-param6) * var11}, 0);
        jaggl.OpenGL.glTexGenfv(8193, 9474, new float[]{0.0f, var12, 0.0f, (float)(-param7) * var12}, 0);
        jaggl.OpenGL.glEnable(3168);
        jaggl.OpenGL.glEnable(3169);
        jaggl.OpenGL.glColor4ub((byte)(param3 >> 16), (byte)(param3 >> 8), (byte)param3, (byte)(param3 >> 24));
        jaggl.OpenGL.glTranslatef((float)param1, (float)param2, 0.0f);
        this.field_d.a(true, param0);
        jaggl.OpenGL.glLoadIdentity();
        jaggl.OpenGL.glDisable(3168);
        jaggl.OpenGL.glDisable(3169);
        this.field_f.c(0, 34192, 768, 5890);
        this.field_f.b(8448, 8448, false);
        this.field_f.a(109, (pib) null);
        this.field_f.h(33984, 0);
        if (this.field_c ||
          param4) {
          this.field_f.c(0, 34192, 768, 5890);
        }
    }
}
