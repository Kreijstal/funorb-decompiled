/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class ca extends da {
    private eo field_g;
    private gf field_f;
    private qm field_d;
    private boolean field_e;

    ca(eo param0, qla param1, jpa[] param2, boolean param3) {
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
        jpa var13;
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
        jpa var25;
        jpa var26;
        byte[] var27;
        int[] var28;
        jpa var29;
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
        this.field_g = param0;
        var5 = 0;
        for (var6 = 0; var6 < 256; var6++) {
          var25 = param2[var6];
          if (var25.field_a > var5) {
            var5 = var25.field_a;
          }
          if (var25.field_i > var5) {
            var5 = var25.field_i;
          }
        }
        var6Lifetime1 = var5 * 16;
        if (!param3) {
          var39 = new int[var6Lifetime1 * var6Lifetime1];
          var32 = var39;
          var7_ref_int__ = var32;
          for (var8 = 0; var8 < 256; var8++) {
            var29 = param2[var8];
            var10_ref_int__ = var29.field_g;
            var37 = var29.field_h;
            var30 = var37;
            var11_ref_byte__ = var30;
            var38 = var29.field_f;
            var31 = var38;
            var12_ref_byte__ = var31;
            var13_int = var29.field_a;
            var14 = var29.field_i;
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
          this.field_f = param0.a(true, var6Lifetime1, false, var6Lifetime1, var39);
          this.field_e = false;
        } else {
          var35 = new byte[var6Lifetime1 * var6Lifetime1];
          var27 = var35;
          var7_ref_byte__ = var27;
          for (var8 = 0; var8 < 256; var8++) {
            var26 = param2[var8];
            var10_int = var26.field_a;
            var11_int = var26.field_i;
            var12 = var8 % 16 * var5;
            var13_int = var8 / 16 * var5;
            var14 = var13_int * var6Lifetime1 + var12;
            var15 = 0;
            if (var26.field_h != null) {
              var16_ref_byte__ = var26.field_h;
              for (var17 = 0; var17 < var10_int; var17++) {
                for (var18_int = 0; var18_int < var11_int; var18_int++) {
                  var7_ref_byte__[var14++] = var16_ref_byte__[var15++];
                }
                var14 = var14 + (var6Lifetime1 - var11_int);
              }
            } else {
              var16_ref_byte__ = var26.field_f;
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
          if (!param0.a(false, una.field_g, rp.field_g)) {
            var36 = new int[var35.length];
            var28 = var36;
            var8_ref_int__ = var28;
            for (var9 = 0; var9 < var35.length; var9++) {
              var8_ref_int__[var9] = var35[var9] << 24;
            }
            this.field_f = param0.a(true, var6Lifetime1, false, var6Lifetime1, var36);
          } else {
            this.field_f = param0.a(var6Lifetime1, var35, false, rp.field_g, -128, var6Lifetime1);
          }
          this.field_e = true;
        }
        this.field_f.a(7672, ue.field_v);
        this.field_d = param0.c(6, false);
        this.field_d.a(20480, 20, true);
        var7 = 0;
        while (var7 < 4) {
          var33 = this.field_d.a(-15730, true);
          if (var33 != null) {
            var34 = this.field_g.a(var33, 127);
            var10 = this.field_f.a((float)var6Lifetime1, (byte) -33) / (float)var6Lifetime1;
            var11 = this.field_f.a(105, (float)var6Lifetime1) / (float)var6Lifetime1;
            var24 = 0;
            var12Lifetime1 = var24;
            while (var24 < 256) {
              var13 = param2[var24];
              var14Lifetime1 = var13.field_a;
              var15Lifetime1 = var13.field_i;
              var16Lifetime1 = var13.field_c;
              var17Lifetime1 = var13.field_d;
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
            if (this.field_d.a(true)) {
              return;
            }
          }
          var7++;
        }
        return;
    }

    final void a(char param0, int param1, int param2, int param3, boolean param4, aa param5, int param6, int param7) {
    }

    final void fa(char param0, int param1, int param2, int param3, boolean param4) {
        asa var6;
        this.field_g.H(-122);
        this.field_g.a(true, this.field_f);
        if (!this.field_e &&
          !param4) {
          this.field_g.a(ln.field_F, (byte) -110, ln.field_F);
        } else {
          this.field_g.a(iw.field_c, (byte) -110, ln.field_F);
          this.field_g.a(pea.field_c, 0, -121);
          this.field_g.g(3625, param3);
        }
        var6 = this.field_g.y((byte) -77);
        var6.a(false, param1, param2, 0);
        this.field_g.F(-1662);
        this.field_g.a(-128, 0, this.field_d);
        this.field_g.a(this.field_g.field_Db, -32);
        this.field_g.a(2, vs.field_T, param0 * 4, 0);
        if (this.field_e ||
          param4) {
          this.field_g.a(ej.field_c, 0, -32);
        }
    }
}
