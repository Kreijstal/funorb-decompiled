/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class roa extends ka {
    private int field_Q;
    private int[][] field_a;
    private short[] field_i;
    private glb field_C;
    private int[] field_l;
    private float[] field_D;
    private int field_v;
    private int field_B;
    private int field_L;
    private int[] field_j;
    private int[] field_g;
    private boolean field_m;
    private glb field_h;
    private int field_z;
    private short[] field_r;
    private int[] field_K;
    private short[] field_e;
    private short[] field_d;
    private int field_I;
    private int field_M;
    private int field_u;
    private float[] field_y;
    private int[] field_t;
    private short[] field_c;
    private short[] field_x;
    private glb field_o;
    private int[] field_p;
    private int field_P;
    private byte[] field_b;
    private int field_G;
    private short[] field_O;
    private short[] field_A;
    private short[] field_f;
    private short[] field_J;
    private gib[] field_E;
    private short[] field_N;
    private rv field_H;
    private int[] field_w;
    private glb field_q;
    private short[] field_F;
    private byte[] field_n;
    private lga[] field_k;
    private int field_s;

    final int HA() {
        if (!this.field_m) {
          this.b(-27337);
        }
        return this.field_z;
    }

    final void H(int param0, int param1, int param2) {
        int var4 = 0;
        int var5;
        var5 = VoidHunters.field_G;
        for (var4 = 0; var4 < this.field_P; var4++) {
          if (param0 != 0) {
            this.field_K[var4] = this.field_K[var4] + param0;
          }
          if (param1 != 0) {
            this.field_j[var4] = this.field_j[var4] + param1;
          }
          if (0 != param2) {
            this.field_p[var4] = this.field_p[var4] + param2;
          }
        }
        this.a((byte) -53);
        this.field_m = false;
    }

    private final void a(byte param0) {
        short discarded$0 = 0;
        if (this.field_o != null) {
        }
        if (param0 > -42) {
          discarded$0 = this.a(73, 73, 17, 37, 0.2685146629810333f, (cbb) null, -53, 101, -66L, 29, 0.045781638473272324f);
        }
    }

    roa(pf param0, cbb param1, int param2, int param3, int param4, int param5) {
        this(param0, param2, param5, true, false);
        int var9_int = 0;
        int fieldTemp$4 = 0;
        short dupTemp$5 = 0;
        short dupTemp$6 = 0;
        short dupTemp$7 = 0;
        int var11_int = 0;
        vib dupTemp$3 = null;
        int[] array$2 = null;
        int dupTemp$0 = 0;
        int[] arrayValue$1 = null;
        int stackIn_15_0 = 0;
        int stackIn_43_0 = 0;
        int stackIn_63_0 = 0;
        int stackIn_64_1 = 0;
        int stackIn_85_0 = 0;
        int stackIn_101_0 = 0;
        int stackIn_155_0 = 0;
        int stackIn_156_1 = 0;
        RuntimeException stackIn_213_0 = null;
        StringBuilder stackIn_213_1 = null;
        String stackIn_214_2 = null;
        StringBuilder stackIn_216_1 = null;
        String stackIn_217_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var7 = null;
        int[] var8 = null;
        long[] var9 = null;
        int var10 = 0;
        opa var10_ref_opa = null;
        hu[] var11 = null;
        int var12 = 0;
        int var13 = 0;
        Object var13_ref = null;
        int var14 = 0;
        int var15_int = 0;
        vib[] var15 = null;
        int var16 = 0;
        int var17_int = 0;
        int[] var17 = null;
        int var18 = 0;
        int var19 = 0;
        int var20 = 0;
        bqa var20_ref_bqa = null;
        int var21 = 0;
        sr var21_ref_sr = null;
        int var22 = 0;
        float var22_float = 0.0f;
        float var23 = 0.0f;
        int var23_int = 0;
        float var24 = 0.0f;
        int var24_int = 0;
        float var25 = 0.0f;
        int var25_int = 0;
        float var26 = 0.0f;
        int var26_int = 0;
        float var27 = 0.0f;
        int var27_int = 0;
        int var28 = 0;
        int var29 = 0;
        int var30 = 0;
        int var31 = 0;
        vib var31_ref_vib = null;
        int var32_int = 0;
        long var32 = 0L;
        vib var32_ref_vib = null;
        int var33_int = 0;
        long var33 = 0L;
        int var34 = 0;
        int var35 = 0;
        int var36 = 0;
        int var37 = 0;
        float var38 = 0.0f;
        float var39 = 0.0f;
        int var39_int = 0;
        float var40 = 0.0f;
        float var41 = 0.0f;
        float var42 = 0.0f;
        float var43 = 0.0f;
        int var43_int = 0;
        float var44 = 0.0f;
        int var44_int = 0;
        float var45 = 0.0f;
        int var45_int = 0;
        float var46 = 0.0f;
        int var46_int = 0;
        float var47 = 0.0f;
        int var47_int = 0;
        float var48 = 0.0f;
        int var48_int = 0;
        float var49 = 0.0f;
        int var49_int = 0;
        float var50 = 0.0f;
        int var50_int = 0;
        float var51 = 0.0f;
        int var51_int = 0;
        float var52 = 0.0f;
        float var53 = 0.0f;
        float var54 = 0.0f;
        float var55 = 0.0f;
        float var56 = 0.0f;
        float var57 = 0.0f;
        float var58 = 0.0f;
        float var59 = 0.0f;
        float var60 = 0.0f;
        float var61 = 0.0f;
        float var62 = 0.0f;
        d var64 = null;
        int[] var65 = null;
        opa var66 = null;
        opa var67 = null;
        long[] var68 = null;
        bqa var69 = null;
        sr var70 = null;
        hu var71 = null;
        hu var72 = null;
        hu var73 = null;
        opa var74 = null;
        kua var75 = null;
        hu var77 = null;
        hu var78 = null;
        hu var79 = null;
        int[] var80 = null;
        int[] var81 = null;
        long[] var82 = null;
        int[] var84 = null;
        float[] var86 = null;
        int var14Lifetime1;
        int var15_intLifetime1;
        int var15_intLifetime2;
        int var17_intLifetime1;
        int var17_intLifetime2;
        int var17_intLifetime3;
        int var19Lifetime1;
        int var19Lifetime2;
        int var19Lifetime3;
        int var19Lifetime4;
        int var20Lifetime1;
        int var20Lifetime2;
        int var21Lifetime1;
        int var21Lifetime2;
        int var22Lifetime1;
        int var28Lifetime1;
        int var29Lifetime1;
        int var30Lifetime1;
        int var31Lifetime1;
        int var34Lifetime1;
        int var35Lifetime1;
        int var36Lifetime1;
        float var59Lifetime1;
        float var60Lifetime1;
        float var61Lifetime1;
        float var62Lifetime1;
        int var12Lifetime1;
        int var12Lifetime2;
        int var16Lifetime1;
        int var16Lifetime2;
        int var16Lifetime3;
        int var16Lifetime4;
        int var16Lifetime5;
        int var18Lifetime1;
        int var18Lifetime2;
        int var18Lifetime3;
        int var18Lifetime4;
        int var18Lifetime5;
        int var19Lifetime5;
        int var17_intLifetime3Lifetime1;
        int var19Lifetime3Lifetime1;
        int var19Lifetime4Lifetime1;
        int var22Lifetime1Lifetime1;
        int var22Lifetime1Lifetime2;
        int var16Lifetime1Lifetime1;
        int var16Lifetime1Lifetime2;
        int var18Lifetime3Lifetime1;
        try {
          var64 = param0.field_a;
          var81 = new int[param1.field_j];
          var65 = var81;
          var8 = var65;
          this.field_l = new int[param1.field_D + 1];
          for (var9_int = 0; param1.field_j > var9_int; var9_int++) {
            boolean decompiledFrameRemainder0 = true;
            if (null == param1.field_E ||
              2 != param1.field_E[var9_int]) {
              if (null != param1.field_u &&
                param1.field_u[var9_int] != -1) {
                var10_ref_opa = var64.a(-20292, 65535 & param1.field_u[var9_int]);
                decompiledFrameRemainder0 = (((this.field_s & 64) != 0 &&
                  var10_ref_opa.field_r) || !(var10_ref_opa.field_m));
              }
              if (decompiledFrameRemainder0) {
                fieldTemp$4 = this.field_v;
                this.field_v = this.field_v + 1;
                var8[fieldTemp$4] = var9_int;
                dupTemp$5 = param1.field_k[var9_int];
                this.field_l[dupTemp$5] = this.field_l[dupTemp$5] + 1;
                dupTemp$6 = param1.field_o[var9_int];
                this.field_l[dupTemp$6] = this.field_l[dupTemp$6] + 1;
                dupTemp$7 = param1.field_K[var9_int];
                this.field_l[dupTemp$7] = this.field_l[dupTemp$7] + 1;
              }
            }
          }
          this.field_Q = this.field_v;
          var82 = new long[this.field_v];
          var68 = var82;
          var9 = var68;
          stackIn_15_0 = ((this.field_I & 256) == 0) ? 0 : 1;
          var10 = stackIn_15_0;
          for (var11_int = 0; this.field_v > var11_int; var11_int++) {
            boolean decompiledFrameRemainder1 = true;
            var12 = var81[var11_int];
            var13_ref = null;
            var14 = 0;
            var15_int = 0;
            var16 = 0;
            var17_int = 0;
            if (param1.field_g != null) {
              var18 = 0;
              for (var19 = 0; param1.field_g.length > var19; var19++) {
                var20_ref_bqa = param1.field_g[var19];
                if (var12 == var20_ref_bqa.field_b) {
                  var21_ref_sr = jm.a(var20_ref_bqa.field_e, 0);
                  if (var21_ref_sr.field_a) {
                    var18 = 1;
                  }
                  if (var21_ref_sr.field_e != -1) {
                    var66 = var64.a(-20292, var21_ref_sr.field_e);
                    if (2 != var66.field_q) {
                    }
                  }
                }
              }
              if (var18 != 0) {
                var9[var11_int] = 9223372036854775807L;
                this.field_Q = this.field_Q - 1;
                decompiledFrameRemainder1 = false;
              }
            }
            if (decompiledFrameRemainder1) {
              var18Lifetime5 = -1;
              if (param1.field_u != null) {
                var18Lifetime5 = param1.field_u[var12];
                if (-1 != var18Lifetime5) {
                  var67 = var64.a(-20292, var18Lifetime5 & 65535);
                  var13_ref = var67;
                  if ((64 & this.field_s) != 0 &&
                    var67.field_r) {
                    var13_ref = null;
                    var18Lifetime5 = -1;
                  } else {
                    var16 = var67.field_c;
                    var17_int = var67.field_n;
                  }
                }
              }
              if (null != param1.field_r &&
                param1.field_r[var12] != 0) {
                stackIn_43_0 = 1;
              } else {
                if (var13_ref != null) {
                  stackIn_43_0 = (((opa) (var13_ref)).field_q != 0) ? 1 : 0;
                } else {
                  stackIn_43_0 = 0;
                }
              }
              var19Lifetime5 = stackIn_43_0;
              if ((var10 != 0 ||
                var19Lifetime5 != 0) && param1.field_m != null) {
                var14 = var14 + (param1.field_m[var12] << 17);
              }
              if (var19Lifetime5 != 0) {
                var14 = var14 + 65536;
              }
              var14 = var14 + (var16 << 8 & 65280);
              var14 = var14 + (var17_int & 255);
              var15_int = var15_int + (-65536 & var18Lifetime5 << 16);
              var15_int = var15_int + (var11_int & 65535);
              var9[var11_int] = (long)var15_int + ((long)var14 << 32);
            }
          }
          kn.a((byte) -24, var81, var82);
          this.field_P = param1.field_D;
          this.field_j = param1.field_G;
          this.field_p = param1.field_x;
          this.field_K = param1.field_v;
          var11 = new hu[this.field_P];
          if (null != param1.field_g) {
            this.field_u = param1.field_g.length;
            this.field_k = new lga[this.field_u];
            this.field_E = new gib[this.field_u];
            for (var12Lifetime1 = 0; this.field_u > var12Lifetime1; var12Lifetime1++) {
              var69 = param1.field_g[var12Lifetime1];
              var70 = jm.a(var69.field_e, 0);
              var15_intLifetime1 = -1;
              for (var16Lifetime1 = 0; var16Lifetime1 < this.field_v; var16Lifetime1++) {
                if (var81[var16Lifetime1] != var69.field_b) {
                  continue;
                }
                var15_intLifetime1 = var16Lifetime1;
                break;
              }
              if (var15_intLifetime1 == -1) {
                throw new RuntimeException();
              }
              var16Lifetime1Lifetime1 = 16777215 & klb.field_o[param1.field_b[var69.field_b] & 65535];
              stackIn_63_0 = var16Lifetime1Lifetime1;
              if (param1.field_r == null) {
                stackIn_64_1 = 0;
              } else {
                stackIn_64_1 = param1.field_r[var69.field_b];
              }
              var16Lifetime1Lifetime2 = stackIn_63_0 | -stackIn_64_1 + 255 << 24;
              this.field_k[var12Lifetime1] = new lga(var15_intLifetime1, (int) param1.field_k[var69.field_b], (int) param1.field_o[var69.field_b], (int) param1.field_K[var69.field_b], var70.field_g, var70.field_b, var70.field_e, var70.field_d, var70.field_f, var70.field_a, var70.field_c, var69.field_c);
              this.field_E[var12Lifetime1] = new gib(var16Lifetime1Lifetime2);
            }
          }
          var12Lifetime2 = 3 * this.field_v;
          this.field_e = new short[this.field_v];
          this.field_A = new short[var12Lifetime2];
          bsb.field_b = new long[var12Lifetime2];
          this.field_x = new short[var12Lifetime2];
          this.field_y = new float[var12Lifetime2];
          this.field_F = new short[var12Lifetime2];
          this.field_r = new short[var12Lifetime2];
          this.field_i = new short[this.field_v];
          this.field_n = new byte[this.field_v];
          this.field_J = new short[var12Lifetime2];
          this.field_f = new short[var12Lifetime2];
          this.field_O = new short[this.field_v];
          this.field_N = new short[this.field_v];
          this.field_b = new byte[var12Lifetime2];
          this.field_D = new float[var12Lifetime2];
          this.field_c = new short[this.field_v];
          if (param1.field_w != null) {
            this.field_d = new short[this.field_v];
          }
          var13 = 0;
          for (var14Lifetime1 = 0; var14Lifetime1 < param1.field_D; var14Lifetime1++) {
            var15_intLifetime2 = this.field_l[var14Lifetime1];
            this.field_l[var14Lifetime1] = var13;
            var11[var14Lifetime1] = new hu();
            var13 = var13 + var15_intLifetime2;
          }
          this.field_l[param1.field_D] = var13;
          var75 = ao.a(param1, var81, this.field_v, -3);
          var15 = new vib[param1.field_j];
          var16Lifetime2 = 0;
          while (var16Lifetime2 < param1.field_j) {
            var17_intLifetime1 = param1.field_k[var16Lifetime2];
            var18Lifetime1 = param1.field_o[var16Lifetime2];
            var19Lifetime1 = param1.field_K[var16Lifetime2];
            var20 = this.field_K[var18Lifetime1] - this.field_K[var17_intLifetime1];
            var21 = -this.field_j[var17_intLifetime1] + this.field_j[var18Lifetime1];
            var22 = -this.field_p[var17_intLifetime1] + this.field_p[var18Lifetime1];
            var23_int = -this.field_K[var17_intLifetime1] + this.field_K[var19Lifetime1];
            var24_int = -this.field_j[var17_intLifetime1] + this.field_j[var19Lifetime1];
            var25_int = this.field_p[var19Lifetime1] - this.field_p[var17_intLifetime1];
            var26_int = -(var22 * var24_int) + var25_int * var21;
            var27_int = -(var20 * var25_int) + var22 * var23_int;
            var28 = -(var23_int * var21) + var20 * var24_int;
            while (true) {
              if (8192 >= var26_int &&
                var27_int <= 8192 &&
                var28 <= 8192 &&
                var26_int >= -8192 &&
                var27_int >= -8192 &&
                var28 >= -8192) {
                var29 = (int)Math.sqrt((double)(var26_int * var26_int + var27_int * var27_int + var28 * var28));
                if (var29 <= 0) {
                  var29 = 1;
                }
                var26_int = var26_int * 256 / var29;
                var27_int = var27_int * 256 / var29;
                var28 = 256 * var28 / var29;
                if (param1.field_E == null) {
                  stackIn_85_0 = 0;
                } else {
                  stackIn_85_0 = param1.field_E[var16Lifetime2];
                }
                var30 = stackIn_85_0;
                if (var30 == 0) {
                  var71 = var11[var17_intLifetime1];
                  var71.field_a = var71.field_a + var26_int;
                  var71.field_c = var71.field_c + var28;
                  var71.field_e = var71.field_e + 1;
                  var71.field_d = var71.field_d + var27_int;
                  var72 = var11[var18Lifetime1];
                  var72.field_a = var72.field_a + var26_int;
                  var72.field_e = var72.field_e + 1;
                  var72.field_d = var72.field_d + var27_int;
                  var72.field_c = var72.field_c + var28;
                  var73 = var11[var19Lifetime1];
                  var73.field_a = var73.field_a + var26_int;
                  var73.field_d = var73.field_d + var27_int;
                  var73.field_c = var73.field_c + var28;
                  var73.field_e = var73.field_e + 1;
                } else {
                  if (1 == var30) {
                    dupTemp$3 = new vib();
                    var15[var16Lifetime2] = dupTemp$3;
                    var31_ref_vib = dupTemp$3;
                    var31_ref_vib.field_d = var27_int;
                    var31_ref_vib.field_a = var26_int;
                    var31_ref_vib.field_c = var28;
                  }
                }
                var16Lifetime2++;
                break;
              }
              var28 = var28 >> 1;
              var26_int = var26_int >> 1;
              var27_int = var27_int >> 1;
            }
          }
          for (var16Lifetime3 = 0; this.field_v > var16Lifetime3; var16Lifetime3++) {
            var17_intLifetime2 = var81[var16Lifetime3];
            var18Lifetime2 = 65535 & param1.field_b[var17_intLifetime2];
            if (param1.field_M == null) {
              var19Lifetime2 = -1;
            } else {
              var19Lifetime2 = param1.field_M[var17_intLifetime2];
            }
            if (param1.field_r != null) {
              var20Lifetime1 = param1.field_r[var17_intLifetime2] & 255;
            } else {
              var20Lifetime1 = 0;
            }
            if (null == param1.field_u) {
              stackIn_101_0 = -1;
            } else {
              stackIn_101_0 = param1.field_u[var17_intLifetime2];
            }
            var21Lifetime1 = stackIn_101_0;
            if (-1 != var21Lifetime1 &&
              (64 & this.field_s) != 0) {
              var74 = var64.a(-20292, var21Lifetime1 & 65535);
              if (var74.field_r) {
                var21Lifetime1 = -1;
              }
            }
            var22_float = 0.0f;
            var23 = 0.0f;
            var24 = 0.0f;
            var25 = 0.0f;
            var26 = 0.0f;
            var27 = 0.0f;
            var28Lifetime1 = 0;
            var29Lifetime1 = 0;
            var30Lifetime1 = 0;
            if (var21Lifetime1 != -1) {
              if (var19Lifetime2 == -1) {
                var24 = 1.0f;
                var29Lifetime1 = 2;
                var22_float = 0.0f;
                var25 = 1.0f;
                var28Lifetime1 = 1;
                var27 = 0.0f;
                var26 = 0.0f;
                var23 = 1.0f;
              } else {
                var19Lifetime2 = var19Lifetime2 & 255;
                var31 = param1.field_e[var19Lifetime2];
                if (var31 == 0) {
                  var32_int = param1.field_k[var17_intLifetime2];
                  var33_int = param1.field_o[var17_intLifetime2];
                  var34 = param1.field_K[var17_intLifetime2];
                  var35 = param1.field_t[var19Lifetime2];
                  var36 = param1.field_i[var19Lifetime2];
                  var37 = param1.field_H[var19Lifetime2];
                  var38 = (float)param1.field_v[var35];
                  var39 = (float)param1.field_G[var35];
                  var40 = (float)param1.field_x[var35];
                  var41 = (float)param1.field_v[var36] - var38;
                  var42 = (float)param1.field_G[var36] - var39;
                  var43 = -var40 + (float)param1.field_x[var36];
                  var44 = -var38 + (float)param1.field_v[var37];
                  var45 = (float)param1.field_G[var37] - var39;
                  var46 = (float)param1.field_x[var37] - var40;
                  var47 = (float)param1.field_v[var32_int] - var38;
                  var48 = (float)param1.field_G[var32_int] - var39;
                  var49 = (float)param1.field_x[var32_int] - var40;
                  var50 = -var38 + (float)param1.field_v[var33_int];
                  var51 = -var39 + (float)param1.field_G[var33_int];
                  var52 = (float)param1.field_x[var33_int] - var40;
                  var53 = -var38 + (float)param1.field_v[var34];
                  var54 = -var39 + (float)param1.field_G[var34];
                  var55 = -var40 + (float)param1.field_x[var34];
                  var56 = -(var43 * var45) + var42 * var46;
                  var57 = -(var41 * var46) + var44 * var43;
                  var58 = var45 * var41 - var42 * var44;
                  var59 = var45 * var58 - var57 * var46;
                  var60 = -(var58 * var44) + var56 * var46;
                  var61 = var57 * var44 - var45 * var56;
                  var62 = 1.0f / (var42 * var60 + var41 * var59 + var43 * var61);
                  var24 = (var52 * var61 + (var51 * var60 + var50 * var59)) * var62;
                  var26 = var62 * (var55 * var61 + (var54 * var60 + var59 * var53));
                  var22_float = var62 * (var49 * var61 + (var60 * var48 + var47 * var59));
                  var60Lifetime1 = var56 * var43 - var41 * var58;
                  var59Lifetime1 = -(var43 * var57) + var58 * var42;
                  var61Lifetime1 = var57 * var41 - var56 * var42;
                  var62Lifetime1 = 1.0f / (var46 * var61Lifetime1 + (var44 * var59Lifetime1 + var60Lifetime1 * var45));
                  var25 = var62Lifetime1 * (var59Lifetime1 * var50 + var60Lifetime1 * var51 + var52 * var61Lifetime1);
                  var23 = var62Lifetime1 * (var48 * var60Lifetime1 + var47 * var59Lifetime1 + var49 * var61Lifetime1);
                  var27 = (var55 * var61Lifetime1 + (var54 * var60Lifetime1 + var59Lifetime1 * var53)) * var62Lifetime1;
                } else {
                  var32_int = param1.field_k[var17_intLifetime2];
                  var33_int = param1.field_o[var17_intLifetime2];
                  var34 = param1.field_K[var17_intLifetime2];
                  var35 = var75.field_d[var19Lifetime2];
                  var36 = var75.field_b[var19Lifetime2];
                  var37 = var75.field_f[var19Lifetime2];
                  var86 = var75.field_c[var19Lifetime2];
                  var39_int = param1.field_n[var19Lifetime2];
                  var40 = (float)param1.field_L[var19Lifetime2] / 256.0f;
                  if (1 != var31) {
                    if (2 == var31) {
                      var41 = (float)param1.field_f[var19Lifetime2] / 256.0f;
                      var42 = (float)param1.field_I[var19Lifetime2] / 256.0f;
                      var43_int = param1.field_v[var33_int] - param1.field_v[var32_int];
                      var44_int = -param1.field_G[var32_int] + param1.field_G[var33_int];
                      var45_int = -param1.field_x[var32_int] + param1.field_x[var33_int];
                      var46_int = -param1.field_v[var32_int] + param1.field_v[var34];
                      var47_int = param1.field_G[var34] - param1.field_G[var32_int];
                      var48_int = param1.field_x[var34] - param1.field_x[var32_int];
                      var49_int = var48_int * var44_int - var47_int * var45_int;
                      var50_int = var45_int * var46_int - var48_int * var43_int;
                      var51_int = -(var44_int * var46_int) + var43_int * var47_int;
                      var52 = 64.0f / (float)param1.field_F[var19Lifetime2];
                      var53 = 64.0f / (float)param1.field_a[var19Lifetime2];
                      var54 = 64.0f / (float)param1.field_C[var19Lifetime2];
                      var55 = ((float)var51_int * var86[2] + ((float)var49_int * var86[0] + (float)var50_int * var86[1])) / var52;
                      var56 = (var86[5] * (float)var51_int + ((float)var50_int * var86[4] + (float)var49_int * var86[3])) / var53;
                      var57 = (var86[7] * (float)var50_int + (float)var49_int * var86[6] + (float)var51_int * var86[8]) / var54;
                      var30Lifetime1 = mpa.a(-74, var56, var55, var57);
                      dhb.a(var42, param1.field_x[var32_int], var41, (byte) 47, param1.field_v[var32_int], var37, param1.field_G[var32_int], var30Lifetime1, jqb.field_o, var35, var39_int, var86, var36, var40);
                      var23 = jqb.field_o[1];
                      var22_float = jqb.field_o[0];
                      dhb.a(var42, param1.field_x[var33_int], var41, (byte) 81, param1.field_v[var33_int], var37, param1.field_G[var33_int], var30Lifetime1, jqb.field_o, var35, var39_int, var86, var36, var40);
                      var24 = jqb.field_o[0];
                      var25 = jqb.field_o[1];
                      dhb.a(var42, param1.field_x[var34], var41, (byte) 39, param1.field_v[var34], var37, param1.field_G[var34], var30Lifetime1, jqb.field_o, var35, var39_int, var86, var36, var40);
                      var26 = jqb.field_o[0];
                      var27 = jqb.field_o[1];
                    } else {
                      if (var31 == 3) {
                        oma.a(var86, param1.field_x[var32_int], var40, jqb.field_o, var37, param1.field_v[var32_int], (byte) -82, var36, param1.field_G[var32_int], var39_int, var35);
                        var23 = jqb.field_o[1];
                        var22_float = jqb.field_o[0];
                        oma.a(var86, param1.field_x[var33_int], var40, jqb.field_o, var37, param1.field_v[var33_int], (byte) -82, var36, param1.field_G[var33_int], var39_int, var35);
                        var25 = jqb.field_o[1];
                        var24 = jqb.field_o[0];
                        oma.a(var86, param1.field_x[var34], var40, jqb.field_o, var37, param1.field_v[var34], (byte) -82, var36, param1.field_G[var34], var39_int, var35);
                        var26 = jqb.field_o[0];
                        var27 = jqb.field_o[1];
                        if ((1 & var39_int) != 0) {
                          if (!(var25 - var23 > 0.5f)) {
                            if (var23 - var25 > 0.5f) {
                              var28Lifetime1 = 2;
                              var25 = var25 + 1.0f;
                            }
                          } else {
                            var25 = var25 - 1.0f;
                            var28Lifetime1 = 1;
                          }
                          if (!(0.5f < -var23 + var27)) {
                            if (0.5f < -var27 + var23) {
                              var27 = var27 + 1.0f;
                              var29Lifetime1 = 2;
                            }
                          } else {
                            var29Lifetime1 = 1;
                            var27 = var27 - 1.0f;
                          }
                        } else {
                          if (0.5f < var24 - var22_float) {
                            var24 = var24 - 1.0f;
                            var28Lifetime1 = 1;
                          } else {
                            if (-var24 + var22_float > 0.5f) {
                              var24 = var24 + 1.0f;
                              var28Lifetime1 = 2;
                            }
                          }
                          if (0.5f < -var22_float + var26) {
                            var26 = var26 - 1.0f;
                            var29Lifetime1 = 1;
                          } else {
                            if (0.5f < var22_float - var26) {
                              var29Lifetime1 = 2;
                              var26 = var26 + 1.0f;
                            }
                          }
                        }
                      }
                    }
                  } else {
                    var41 = (float)param1.field_C[var19Lifetime2] / 1024.0f;
                    ac.a(var86, var36, var39_int, var40, param1.field_v[var32_int], param1.field_G[var32_int], (byte) -52, var41, var37, jqb.field_o, var35, param1.field_x[var32_int]);
                    var22_float = jqb.field_o[0];
                    var23 = jqb.field_o[1];
                    ac.a(var86, var36, var39_int, var40, param1.field_v[var33_int], param1.field_G[var33_int], (byte) -52, var41, var37, jqb.field_o, var35, param1.field_x[var33_int]);
                    var25 = jqb.field_o[1];
                    var24 = jqb.field_o[0];
                    ac.a(var86, var36, var39_int, var40, param1.field_v[var34], param1.field_G[var34], (byte) -52, var41, var37, jqb.field_o, var35, param1.field_x[var34]);
                    var27 = jqb.field_o[1];
                    var26 = jqb.field_o[0];
                    var42 = var41 / 2.0f;
                    if ((var39_int & 1) == 0) {
                      if (!(var42 < var24 - var22_float)) {
                        if (var42 < -var24 + var22_float) {
                          var28Lifetime1 = 2;
                          var24 = var24 + var41;
                        }
                      } else {
                        var28Lifetime1 = 1;
                        var24 = var24 - var41;
                      }
                      if (!(var26 - var22_float > var42)) {
                        if (var42 < -var26 + var22_float) {
                          var29Lifetime1 = 2;
                          var26 = var26 + var41;
                        }
                      } else {
                        var29Lifetime1 = 1;
                        var26 = var26 - var41;
                      }
                    } else {
                      if (var42 < -var23 + var25) {
                        var28Lifetime1 = 1;
                        var25 = var25 - var41;
                      } else {
                        if (var42 < var23 - var25) {
                          var28Lifetime1 = 2;
                          var25 = var25 + var41;
                        }
                      }
                      if (!(var42 < -var23 + var27)) {
                        if (var23 - var27 > var42) {
                          var27 = var27 + var41;
                          var29Lifetime1 = 2;
                        }
                      } else {
                        var29Lifetime1 = 1;
                        var27 = var27 - var41;
                      }
                    }
                  }
                }
              }
            }
            if (null != param1.field_E) {
              var31Lifetime1 = param1.field_E[var17_intLifetime2];
            } else {
              var31Lifetime1 = 0;
            }
            if (var31Lifetime1 == 0) {
              var32 = ((long)var20Lifetime1 + (long)(var30Lifetime1 << 24) + (long)(var18Lifetime2 << 8) << 32) + (long)(var19Lifetime2 << 2);
              var34Lifetime1 = param1.field_k[var17_intLifetime2];
              var35Lifetime1 = param1.field_o[var17_intLifetime2];
              var36Lifetime1 = param1.field_K[var17_intLifetime2];
              var77 = var11[var34Lifetime1];
              this.field_N[var16Lifetime3] = this.a(var77.field_d, var16Lifetime3, var34Lifetime1, 31809, var22_float, param1, var77.field_e, var77.field_c, var32, var77.field_a, var23);
              var78 = var11[var35Lifetime1];
              this.field_e[var16Lifetime3] = this.a(var78.field_d, var16Lifetime3, var35Lifetime1, 31809, var24, param1, var78.field_e, var78.field_c, var32 + (long)var28Lifetime1, var78.field_a, var25);
              var79 = var11[var36Lifetime1];
              this.field_i[var16Lifetime3] = this.a(var79.field_d, var16Lifetime3, var36Lifetime1, 31809, var26, param1, var79.field_e, var79.field_c, var32 + (long)var29Lifetime1, var79.field_a, var27);
            } else {
              if (var31Lifetime1 == 1) {
                var32_ref_vib = var15[var17_intLifetime2];
                stackIn_155_0 = (256 + var32_ref_vib.field_c << 22) + (var19Lifetime2 << 2);
                if (var32_ref_vib.field_a > 0) {
                  stackIn_156_1 = 1024;
                } else {
                  stackIn_156_1 = 2048;
                }
                var33 = (long)(stackIn_155_0 + (stackIn_156_1 + (var32_ref_vib.field_d + 256 << 12))) + ((long)(var30Lifetime1 << 24) + (long)(var18Lifetime2 << 8) + (long)var20Lifetime1 << 32);
                this.field_N[var16Lifetime3] = this.a(var32_ref_vib.field_d, var16Lifetime3, (int) param1.field_k[var17_intLifetime2], 31809, var22_float, param1, 0, var32_ref_vib.field_c, var33, var32_ref_vib.field_a, var23);
                this.field_e[var16Lifetime3] = this.a(var32_ref_vib.field_d, var16Lifetime3, (int) param1.field_o[var17_intLifetime2], 31809, var24, param1, 0, var32_ref_vib.field_c, var33 + (long)var28Lifetime1, var32_ref_vib.field_a, var25);
                this.field_i[var16Lifetime3] = this.a(var32_ref_vib.field_d, var16Lifetime3, (int) param1.field_K[var17_intLifetime2], 31809, var26, param1, 0, var32_ref_vib.field_c, var33 + (long)var29Lifetime1, var32_ref_vib.field_a, var27);
              }
            }
            if (param1.field_r != null) {
              this.field_n[var16Lifetime3] = param1.field_r[var17_intLifetime2];
            }
            if (null != param1.field_w) {
              this.field_d[var16Lifetime3] = param1.field_w[var17_intLifetime2];
            }
            this.field_c[var16Lifetime3] = param1.field_b[var17_intLifetime2];
            this.field_O[var16Lifetime3] = (short)var21Lifetime1;
          }
          if (this.field_Q > 0) {
            var16Lifetime4 = 1;
            var17_intLifetime3 = this.field_O[0];
            for (var18Lifetime3 = 0; this.field_Q > var18Lifetime3; var18Lifetime3++) {
              var19Lifetime3 = this.field_O[var18Lifetime3];
              if (var19Lifetime3 != var17_intLifetime3) {
                var17_intLifetime3 = var19Lifetime3;
                var16Lifetime4++;
              }
            }
            this.field_w = new int[var16Lifetime4];
            this.field_g = new int[1 + var16Lifetime4];
            this.field_t = new int[var16Lifetime4];
            this.field_g[0] = 0;
            var18Lifetime3Lifetime1 = this.field_L;
            var16Lifetime4 = 0;
            var19Lifetime3Lifetime1 = 0;
            var17_intLifetime3Lifetime1 = this.field_O[0];
            for (var20Lifetime2 = 0; var20Lifetime2 < this.field_Q; var20Lifetime2++) {
              var21Lifetime2 = this.field_O[var20Lifetime2];
              if (~var21Lifetime2 != ~var17_intLifetime3Lifetime1) {
                this.field_t[var16Lifetime4] = var18Lifetime3Lifetime1;
                this.field_w[var16Lifetime4] = var19Lifetime3Lifetime1 - var18Lifetime3Lifetime1 + 1;
                var16Lifetime4++;
                this.field_g[var16Lifetime4] = var20Lifetime2;
                var18Lifetime3Lifetime1 = this.field_L;
                var19Lifetime3Lifetime1 = 0;
                var17_intLifetime3Lifetime1 = var21Lifetime2;
              }
              var22Lifetime1 = this.field_N[var20Lifetime2];
              if (var22Lifetime1 > var19Lifetime3Lifetime1) {
                var19Lifetime3Lifetime1 = var22Lifetime1;
              }
              if (var18Lifetime3Lifetime1 > var22Lifetime1) {
                var18Lifetime3Lifetime1 = var22Lifetime1;
              }
              var22Lifetime1Lifetime1 = this.field_e[var20Lifetime2];
              if (var18Lifetime3Lifetime1 > var22Lifetime1Lifetime1) {
                var18Lifetime3Lifetime1 = var22Lifetime1Lifetime1;
              }
              if (var22Lifetime1Lifetime1 > var19Lifetime3Lifetime1) {
                var19Lifetime3Lifetime1 = var22Lifetime1Lifetime1;
              }
              var22Lifetime1Lifetime2 = this.field_i[var20Lifetime2];
              if (var18Lifetime3Lifetime1 > var22Lifetime1Lifetime2) {
                var18Lifetime3Lifetime1 = var22Lifetime1Lifetime2;
              }
              if (var22Lifetime1Lifetime2 > var19Lifetime3Lifetime1) {
                var19Lifetime3Lifetime1 = var22Lifetime1Lifetime2;
              }
            }
            this.field_t[var16Lifetime4] = var18Lifetime3Lifetime1;
            this.field_w[var16Lifetime4] = var19Lifetime3Lifetime1 - var18Lifetime3Lifetime1 + 1;
            var16Lifetime4++;
            this.field_g[var16Lifetime4] = this.field_Q;
          }
          bsb.field_b = null;
          this.field_A = rh.a(this.field_L, this.field_A, (byte) 53);
          this.field_J = rh.a(this.field_L, this.field_J, (byte) 108);
          this.field_F = rh.a(this.field_L, this.field_F, (byte) 69);
          this.field_r = rh.a(this.field_L, this.field_r, (byte) 50);
          this.field_x = rh.a(this.field_L, this.field_x, (byte) 59);
          this.field_b = aba.a(this.field_b, this.field_L, -28321);
          this.field_D = jp.a(this.field_D, this.field_L, 7353);
          this.field_y = jp.a(this.field_y, this.field_L, 7353);
          if (null != param1.field_p &&
            kg.a((byte) 11, this.field_s, param2)) {
            param1.a((byte) -37, false);
          }
          if (null != param1.field_g &&
            lnb.a(param2, this.field_s, false)) {
            param1.a(-126);
          }
          if (null != param1.field_y &&
            mhb.a(this.field_s, param2, -2679)) {
            var16Lifetime5 = 0;
            var84 = new int[256];
            var80 = var84;
            var17 = var80;
            for (var18Lifetime4 = 0; this.field_v > var18Lifetime4; var18Lifetime4++) {
              var19Lifetime4 = param1.field_y[var81[var18Lifetime4]];
              if (0 <= var19Lifetime4) {
                if (var19Lifetime4 > var16Lifetime5) {
                  var16Lifetime5 = var19Lifetime4;
                }
                var17[var19Lifetime4] = var17[var19Lifetime4] + 1;
              }
            }
            this.field_a = new int[1 + var16Lifetime5][];
            for (var18Lifetime4 = 0; var16Lifetime5 >= var18Lifetime4; var18Lifetime4++) {
              array$2 = new int[var84[var18Lifetime4]];
              this.field_a[var18Lifetime4] = array$2;
              var84[var18Lifetime4] = 0;
            }
            for (var18Lifetime4 = 0; var18Lifetime4 < this.field_v; var18Lifetime4++) {
              var19Lifetime4Lifetime1 = param1.field_y[var81[var18Lifetime4]];
              if (var19Lifetime4Lifetime1 >= 0) {
                dupTemp$0 = var17[var19Lifetime4Lifetime1];
                arrayValue$1 = this.field_a[var19Lifetime4Lifetime1];
                var17[var19Lifetime4Lifetime1] = dupTemp$0 + 1;
                arrayValue$1[dupTemp$0] = var18Lifetime4;
              }
            }
            return;
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var7 = decompiledCaughtException;
          stackIn_213_0 = var7;
          stackIn_213_1 = new StringBuilder().append("roa.<init>(");
          if (param0 == null) {
            stackIn_214_2 = "null";
          } else {
            stackIn_214_2 = "{...}";
          }
          stackIn_216_1 = ((StringBuilder) (Object) stackIn_213_1).append(stackIn_214_2).append(',');
          if (param1 == null) {
            stackIn_217_2 = "null";
          } else {
            stackIn_217_2 = "{...}";
          }
          throw rta.a((Throwable) ((Object) stackIn_213_0), ((StringBuilder) (Object) stackIn_216_1).append(stackIn_217_2).append(',').append(param2).append(',').append(param3).append(',').append(param4).append(',').append(param5).append(')').toString());
        }
    }

    final int V() {
        if (!this.field_m) {
          this.b(-27337);
        }
        return this.field_B;
    }

    private final short a(int param0, int param1, int param2, int param3, float param4, cbb param5, int param6, int param7, long param8, int param9, float param10) {
        int fieldTemp$0 = 0;
        int stackIn_3_0 = 0;
        short stackIn_11_0 = 0;
        short stackIn_14_0 = 0;
        RuntimeException stackIn_17_0 = null;
        StringBuilder stackIn_17_1 = null;
        String stackIn_18_2 = null;
        RuntimeException decompiledCaughtException = null;
        int var13_int = 0;
        RuntimeException var13 = null;
        int var14 = 0;
        int var15 = 0;
        int var16 = 0;
        int var17 = 0;
        int var18 = 0;
        var18 = VoidHunters.field_G;
        try {
          var13_int = this.field_l[param2];
          var14 = this.field_l[param2 + 1];
          var15 = 0;
          var16 = var13_int;
          if (param3 != 31809) {
            stackIn_3_0 = 108;
            return (short) stackIn_3_0;
          }
          while (var16 < var14) {
            var17 = this.field_f[var16];
            if (var17 != 0) {
              if (param8 == bsb.field_b[var16]) {
                stackIn_11_0 = (short)(-1 + var17);
                return stackIn_11_0;
              }
              var16++;
              continue;
            }
            var15 = var16;
            break;
          }
          this.field_f[var15] = (short)(this.field_L + 1);
          bsb.field_b[var15] = param8;
          this.field_J[this.field_L] = (short)param1;
          this.field_A[this.field_L] = (short)param2;
          this.field_F[this.field_L] = (short)param9;
          this.field_r[this.field_L] = (short)param0;
          this.field_x[this.field_L] = (short)param7;
          this.field_b[this.field_L] = (byte)param6;
          this.field_D[this.field_L] = param4;
          this.field_y[this.field_L] = param10;
          fieldTemp$0 = this.field_L;
          this.field_L = this.field_L + 1;
          stackIn_14_0 = (short)fieldTemp$0;
          return stackIn_14_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var13 = decompiledCaughtException;
          stackIn_17_0 = var13;
          stackIn_17_1 = new StringBuilder().append("roa.C(").append(param0).append(',').append(param1).append(',').append(param2).append(',').append(param3).append(',').append(param4).append(',');
          if (param5 == null) {
            stackIn_18_2 = "null";
          } else {
            stackIn_18_2 = "{...}";
          }
          throw rta.a((Throwable) ((Object) stackIn_17_0), ((StringBuilder) (Object) stackIn_17_1).append(stackIn_18_2).append(',').append(param6).append(',').append(param7).append(',').append(param8).append(',').append(param9).append(',').append(param10).append(')').toString());
        }
    }

    final void O(int param0, int param1, int param2) {
        int var4 = 0;
        int var5;
        var5 = VoidHunters.field_G;
        for (var4 = 0; var4 < this.field_P; var4++) {
          if (param0 != 128) {
            this.field_K[var4] = param0 * this.field_K[var4] >> 7;
          }
          if (param1 != 128) {
            this.field_j[var4] = this.field_j[var4] * param1 >> 7;
          }
          if (param2 != 128) {
            this.field_p[var4] = param2 * this.field_p[var4] >> 7;
          }
        }
        this.a((byte) -111);
        this.field_m = false;
    }

    private final void b(int param0) {
        int var10 = 0;
        int var2;
        int var3;
        int var4;
        int var5;
        int var6;
        int var7;
        int var8;
        int var9;
        int var11;
        int var12;
        int var13;
        int var14;
        int var15;
        int var14Lifetime1;
        var15 = VoidHunters.field_G;
        var2 = 32767;
        var3 = 32767;
        var4 = 32767;
        var5 = -32768;
        var6 = -32768;
        var7 = -32768;
        var8 = 0;
        var9 = 0;
        for (var10 = 0; var10 < this.field_P; var10++) {
          var11 = this.field_K[var10];
          var12 = this.field_j[var10];
          if (var3 > var12) {
            var3 = var12;
          }
          if (var6 < var12) {
            var6 = var12;
          }
          if (var11 > var5) {
            var5 = var11;
          }
          var13 = this.field_p[var10];
          if (var11 < var2) {
            var2 = var11;
          }
          if (var13 > var7) {
            var7 = var13;
          }
          if (var13 < var4) {
            var4 = var13;
          }
          var14 = var11 * var11 + var13 * var13;
          if (var14 > var8) {
            var8 = var14;
          }
          var14Lifetime1 = var12 * var12 + (var13 * var13 + var11 * var11);
          if (var9 < var14Lifetime1) {
            var9 = var14Lifetime1;
          }
        }
        this.field_z = var4;
        this.field_M = var7;
        if (param0 != -27337) {
          return;
        }
        this.field_B = var2;
        this.field_G = var5;
        Math.sqrt((double)var8);
        Math.sqrt((double)var9);
        this.field_m = true;
    }

    final int G() {
        if (!this.field_m) {
          this.b(-27337);
        }
        return this.field_M;
    }

    final void a(int param0) {
        if (param0 != 26385) {
          this.field_x = (short[]) null;
        }
        if (this.field_o != null) {
          this.field_o.a(26363);
        }
        if (null != this.field_q) {
          this.field_q.a(26363);
        }
        if (null != this.field_C) {
          this.field_C.a(param0 ^ 490);
        }
        if (this.field_h != null) {
          this.field_h.a(26363);
        }
        if (null != this.field_H) {
          this.field_H.a((byte) -35);
        }
    }

    final int RA() {
        if (!this.field_m) {
          this.b(-27337);
        }
        return this.field_G;
    }

    roa(pf param0, int param1, int param2, boolean param3, boolean param4) {
        RuntimeException stackIn_19_0 = null;
        StringBuilder stackIn_19_1 = null;
        String stackIn_20_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var6 = null;
        this.field_Q = 0;
        this.field_v = 0;
        this.field_P = 0;
        this.field_m = false;
        this.field_L = 0;
        try {
          this.field_I = param1;
          this.field_s = param2;
          if (param3 ||
            rfb.a((byte) -89, this.field_I, this.field_s)) {
            this.field_o = new glb(lga.a(14216, this.field_s, this.field_I));
          }
          if (param3 ||
            bdb.a(this.field_s, false, this.field_I)) {
            this.field_q = new glb(cma.a(this.field_s, this.field_I, -22785));
          }
          if (param3 ||
            eja.a(this.field_I, (byte) -111, this.field_s)) {
            this.field_C = new glb(pf.a(0, this.field_I, this.field_s));
          }
          if (param3 ||
            wh.a(this.field_s, (byte) 127, this.field_I)) {
            this.field_h = new glb(lbb.a(this.field_s, this.field_I, (byte) 30));
          }
          if (!param3 &&
            !eta.a(this.field_s, -1104, this.field_I)) {
            return;
          }
          this.field_H = new rv(iea.a(this.field_I, this.field_s, (byte) -106));
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var6 = decompiledCaughtException;
          stackIn_19_0 = var6;
          stackIn_19_1 = new StringBuilder().append("roa.<init>(");
          if (param0 == null) {
            stackIn_20_2 = "null";
          } else {
            stackIn_20_2 = "{...}";
          }
          throw rta.a((Throwable) ((Object) stackIn_19_0), ((StringBuilder) (Object) stackIn_19_1).append(stackIn_20_2).append(',').append(param1).append(',').append(param2).append(',').append(param3).append(',').append(param4).append(')').toString());
        }
    }

    static {
    }
}
