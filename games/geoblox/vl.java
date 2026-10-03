/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class vl extends hf {
    byte[] field_m;
    private int[] field_h;
    byte[] field_o;
    gd[] field_k;
    static boolean field_q;
    static java.math.BigInteger field_l;
    short[] field_j;
    t[] field_f;
    byte[] field_i;
    static int field_p;
    static he field_n;
    int field_g;

    final boolean a(int[] param0, byte[] param1, int param2, ci param3) {
        int var8 = 0;
        int stackIn_21_0 = 0;
        RuntimeException stackIn_24_0 = null;
        StringBuilder stackIn_24_1 = null;
        String stackIn_25_2 = null;
        StringBuilder stackIn_27_1 = null;
        String stackIn_28_2 = null;
        StringBuilder stackIn_30_1 = null;
        String stackIn_31_2 = null;
        RuntimeException decompiledCaughtException = null;
        int var5_int = 0;
        RuntimeException var5 = null;
        int var6 = 0;
        Object var7 = null;
        int var9 = 0;
        int var10 = 0;
        var10 = Geoblox.field_C;
        try {
          var5_int = 1;
          var6 = 0;
          var7 = null;
          for (var8 = 0; var8 < 128; var8++) {
            if (!((param1 != null) &&
                  (param1[var8] == 0))) {
              var9 = this.field_h[var8];
              if (var9 != 0) {
                if (var9 != var6) {
                  var6 = var9;
                  var9--;
                  if ((var9 & 1) != 0) {
                    var7 = param3.a(var9 >> 2, 1, param0);
                  } else {
                    var7 = param3.a(var9 >> 2, param0, false);
                  }
                  if (var7 == null) {
                    var5_int = 0;
                  }
                }
                if (var7 != null) {
                  this.field_k[var8] = (gd) (var7);
                  this.field_h[var8] = 0;
                }
              }
            }
          }
          if (param2 <= 8) {
            field_q = true;
          }
          stackIn_21_0 = var5_int;
          return stackIn_21_0 != 0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var5 = decompiledCaughtException;
          stackIn_24_0 = var5;
          stackIn_24_1 = new StringBuilder().append("vl.C(");
          if (param0 == null) {
            stackIn_25_2 = "null";
          } else {
            stackIn_25_2 = "{...}";
          }
          stackIn_27_1 = ((StringBuilder) (Object) stackIn_24_1).append(stackIn_25_2).append(',');
          if (param1 == null) {
            stackIn_28_2 = "null";
          } else {
            stackIn_28_2 = "{...}";
          }
          stackIn_30_1 = ((StringBuilder) (Object) stackIn_27_1).append(stackIn_28_2).append(',').append(param2).append(',');
          if (param3 == null) {
            stackIn_31_2 = "null";
          } else {
            stackIn_31_2 = "{...}";
          }
          throw t.a((Throwable) ((Object) stackIn_24_0), ((StringBuilder) (Object) stackIn_30_1).append(stackIn_31_2).append(')').toString());
        }
    }

    public static void b(boolean param0) {
        if (!param0) {
            field_l = (java.math.BigInteger) null;
        }
        field_n = null;
        field_l = null;
    }

    final static vl a(int param0, byte param1, rh param2) {
        byte[] var3 = null;
        RuntimeException var3_ref = null;
        byte[] var4 = null;
        Object stackIn_4_0 = null;
        vl stackIn_6_0 = null;
        RuntimeException stackIn_9_0 = null;
        StringBuilder stackIn_9_1 = null;
        String stackIn_10_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          var4 = param2.d(28319, param0);
          var3 = var4;
          if (param1 < 26) {
            field_p = 30;
          }
          if (var4 != null) {
            stackIn_6_0 = new vl(var4);
            return stackIn_6_0;
          }
          stackIn_4_0 = null;
          return (vl) (stackIn_4_0);
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3_ref = decompiledCaughtException;
          stackIn_9_0 = var3_ref;
          stackIn_9_1 = new StringBuilder().append("vl.D(").append(param0).append(',').append(param1).append(',');
          if (param2 == null) {
            stackIn_10_2 = "null";
          } else {
            stackIn_10_2 = "{...}";
          }
          throw t.a((Throwable) ((Object) stackIn_9_0), ((StringBuilder) (Object) stackIn_9_1).append(stackIn_10_2).append(')').toString());
        }
    }

    final void a(byte param0) {
        if (param0 > -94) {
            this.field_j = (short[]) null;
        }
        this.field_h = null;
    }

    final static void a(dm[] param0, int param1, int param2, int param3, byte param4) {
        RuntimeException stackIn_13_0 = null;
        StringBuilder stackIn_13_1 = null;
        String stackIn_14_2 = null;
        RuntimeException decompiledCaughtException = null;
        int var5_int = 0;
        RuntimeException var5 = null;
        int var6 = 0;
        int var7 = 0;
        int var8 = 0;
        int var9 = 0;
        int var10 = 0;
        var10 = Geoblox.field_C;
        try {
          if ((param0 != null) &&
              (param1 > 0)) {
            var5_int = param0[0].field_s;
            var6 = param0[2].field_s;
            var7 = param0[1].field_s;
            param0[0].b(param3, param2);
            param0[2].b(param3 + param1 - var6, param2);
            vb.a(da.field_d);
            vb.b(param3 + var5_int, param2, param3 + param1 - var6, param2 + param0[1].field_o);
            var8 = var5_int + param3;
            var9 = param1 + (param3 - var6);
            for (param3 = var8; param3 < var9; param3 = param3 + var7) {
              param0[1].b(param3, param2);
            }
            vb.b(da.field_d);
            if (param4 != 107) {
              field_l = (java.math.BigInteger) null;
            }
            return;
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var5 = decompiledCaughtException;
          stackIn_13_0 = var5;
          stackIn_13_1 = new StringBuilder().append("vl.B(");
          if (param0 == null) {
            stackIn_14_2 = "null";
          } else {
            stackIn_14_2 = "{...}";
          }
          throw t.a((Throwable) ((Object) stackIn_13_0), ((StringBuilder) (Object) stackIn_13_1).append(stackIn_14_2).append(',').append(param1).append(',').append(param2).append(',').append(param3).append(',').append(param4).append(')').toString());
        }
    }

    private vl(byte[] param0) {
        int var11_int = 0;
        int incrementValue$0 = 0;
        t dupTemp$8 = null;
        int incrementValue$5 = 0;
        int var25_int = 0;
        int incrementValue$3 = 0;
        byte[] stackIn_39_0 = null;
        byte[] stackIn_42_0 = null;
        RuntimeException stackIn_205_0 = null;
        StringBuilder stackIn_205_1 = null;
        String stackIn_206_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var2 = null;
        int var3 = 0;
        byte[] var4 = null;
        int var5 = 0;
        int var6 = 0;
        byte[] var7 = null;
        int var8 = 0;
        int var9 = 0;
        byte[] var10 = null;
        byte[] var11 = null;
        int var12 = 0;
        int var13_int = 0;
        t[] var13 = null;
        int var14 = 0;
        int var15_int = 0;
        byte[] var15 = null;
        t var15_ref = null;
        byte[] var16 = null;
        int var16_int = 0;
        int var17 = 0;
        byte[] var18 = null;
        int var19 = 0;
        int var20 = 0;
        int var21 = 0;
        int var22 = 0;
        int var23 = 0;
        int var24 = 0;
        Object var25 = null;
        int var26 = 0;
        int var27 = 0;
        int var28 = 0;
        int var29 = 0;
        int var30 = 0;
        int var31 = 0;
        int var32 = 0;
        int var33 = 0;
        int var34 = 0;
        int var35 = 0;
        int var37 = 0;
        qc var38 = null;
        byte[] var39 = null;
        t var40 = null;
        byte[] var41 = null;
        byte[] var42 = null;
        byte[] var43 = null;
        byte[] var44 = null;
        t var45 = null;
        byte[] var46 = null;
        byte[] var47 = null;
        t var48 = null;
        t var49 = null;
        t var50 = null;
        t var51 = null;
        t var52 = null;
        byte[] var53 = null;
        byte[] var54 = null;
        byte[] var55 = null;
        byte[] var56 = null;
        byte[] var57 = null;
        try {
          this.field_m = new byte[128];
          this.field_f = new t[128];
          this.field_k = new gd[128];
          this.field_h = new int[128];
          this.field_j = new short[128];
          this.field_i = new byte[128];
          this.field_o = new byte[128];
          var38 = new qc(param0);
          for (var3 = 0; var38.field_j[var3 + var38.field_f] != 0; var3++) {
          }
          var55 = new byte[var3];
          var42 = var55;
          var4 = var42;
          for (var5 = 0; var5 < var3; var5++) {
            var4[var5] = var38.f((byte) 81);
          }
          var38.field_f = var38.field_f + 1;
          var3++;
          var5 = var38.field_f;
          var38.field_f = var38.field_f + var3;
          for (var6 = 0; 0 != var38.field_j[var6 + var38.field_f]; var6++) {
          }
          var56 = new byte[var6];
          var43 = var56;
          var7 = var43;
          for (var8 = 0; var8 < var6; var8++) {
            var7[var8] = var38.f((byte) 91);
          }
          var6++;
          var38.field_f = var38.field_f + 1;
          var8 = var38.field_f;
          var38.field_f = var38.field_f + var6;
          for (var9 = 0; var38.field_j[var9 + var38.field_f] != 0; var9++) {
          }
          var57 = new byte[var9];
          var44 = var57;
          var10 = var44;
          for (var11_int = 0; var11_int < var9; var11_int++) {
            var10[var11_int] = var38.f((byte) 125);
          }
          var38.field_f = var38.field_f + 1;
          var9++;
          var53 = new byte[var9];
          var39 = var53;
          var11 = var39;
          if (var9 > 1) {
            var53[1] = (byte) 1;
            var13_int = 1;
            var12 = 2;
            for (var14 = 2; var9 > var14; var14++) {
              var15_int = var38.c((byte) 34);
              if (0 == var15_int) {
                incrementValue$0 = var12;
                var12++;
                var13_int = incrementValue$0;
              } else {
                if (var15_int <= var13_int) {
                  var15_int--;
                }
                var13_int = var15_int;
              }
              var11[var14] = (byte)var13_int;
            }
          } else {
            var12 = var9;
          }
          var13 = new t[var12];
          for (var14 = 0; var14 < var13.length; var14++) {
            dupTemp$8 = new t();
            var13[var14] = dupTemp$8;
            var40 = dupTemp$8;
            var15_ref = var40;
            var16_int = var38.c((byte) 34);
            if (0 < var16_int) {
              var15_ref.field_f = new byte[2 * var16_int];
            }
            var16_int = var38.c((byte) 34);
            if (0 < var16_int) {
              var15_ref.field_e = new byte[2 * var16_int + 2];
              var40.field_e[1] = (byte)64;
            }
          }
          var14 = var38.c((byte) 34);
          if (var14 <= 0) {
            stackIn_39_0 = null;
          } else {
            stackIn_39_0 = new byte[var14 * 2];
          }
          var46 = stackIn_39_0;
          var15 = var46;
          var14 = var38.c((byte) 34);
          if (0 >= var14) {
            stackIn_42_0 = null;
          } else {
            stackIn_42_0 = new byte[var14 * 2];
          }
          var47 = stackIn_42_0;
          var16 = var47;
          for (var17 = 0; var38.field_j[var17 + var38.field_f] != 0; var17++) {
          }
          var54 = new byte[var17];
          var41 = var54;
          var18 = var41;
          for (var19 = 0; var17 > var19; var19++) {
            var18[var19] = var38.f((byte) 127);
          }
          var38.field_f = var38.field_f + 1;
          var17++;
          var19 = 0;
          for (var20 = 0; var20 < 128; var20++) {
            var19 = var19 + var38.c((byte) 34);
            this.field_j[var20] = (short)var19;
          }
          var19 = 0;
          for (var20 = 0; var20 < 128; var20++) {
            var19 = var19 + var38.c((byte) 34);
            this.field_j[var20] = (short)(this.field_j[var20] + (var19 << 8));
          }
          var20 = 0;
          var21 = 0;
          var22 = 0;
          for (var23 = 0; var23 < 128; var23++) {
            if (var20 == 0) {
              if (var54.length > var21) {
                var20 = var18[var21++];
              } else {
                var20 = -1;
              }
              var22 = var38.g((byte) -116);
            }
            this.field_j[var23] = (short)(this.field_j[var23] + cd.a(-1 + var22 << 14, 32768));
            this.field_h[var23] = var22;
            var20--;
          }
          var21 = 0;
          var20 = 0;
          var23 = 0;
          for (var24 = 0; var24 < 128; var24++) {
            if (this.field_h[var24] != 0) {
              if (var20 == 0) {
                incrementValue$5 = var5;
                var5++;
                var23 = -1 + var38.field_j[incrementValue$5];
                if (var21 >= var55.length) {
                  var20 = -1;
                } else {
                  var20 = var4[var21++];
                }
              }
              var20--;
              this.field_i[var24] = (byte)var23;
            }
          }
          var21 = 0;
          var20 = 0;
          var24 = 0;
          for (var25_int = 0; var25_int < 128; var25_int++) {
            if (0 != this.field_h[var25_int]) {
              if (var20 == 0) {
                incrementValue$3 = var8;
                var8++;
                var24 = 16 + var38.field_j[incrementValue$3] << 2;
                if (var56.length > var21) {
                  var20 = var7[var21++];
                } else {
                  var20 = -1;
                }
              }
              this.field_m[var25_int] = (byte)var24;
              var20--;
            }
          }
          var20 = 0;
          var21 = 0;
          var25 = null;
          for (var26 = 0; var26 < 128; var26++) {
            if (0 != this.field_h[var26]) {
              if (var20 == 0) {
                var25 = var13[var53[var21]];
                if (var21 < var57.length) {
                  var20 = var10[var21++];
                } else {
                  var20 = -1;
                }
              }
              var20--;
              this.field_f[var26] = (t) (var25);
            }
          }
          var21 = 0;
          var20 = 0;
          var26 = 0;
          for (var27 = 0; var27 < 128; var27++) {
            if (0 == var20) {
              if (var54.length > var21) {
                var20 = var18[var21++];
              } else {
                var20 = -1;
              }
              if (0 < this.field_h[var27]) {
                var26 = var38.c((byte) 34) + 1;
              }
            }
            var20--;
            this.field_o[var27] = (byte)var26;
          }
          this.field_g = 1 + var38.c((byte) 34);
          for (var27 = 0; var12 > var27; var27++) {
            var45 = var13[var27];
            if (null != var45.field_f) {
              for (var29 = 1; var45.field_f.length > var29; var29 += 2) {
                var45.field_f[var29] = var38.f((byte) 76);
              }
            }
            if (var45.field_e != null) {
              for (var29 = 3; -2 + var45.field_e.length > var29; var29 += 2) {
                var45.field_e[var29] = var38.f((byte) 102);
              }
            }
          }
          if (null != var15) {
            for (var27 = 1; var27 < var46.length; var27 += 2) {
              var15[var27] = var38.f((byte) 96);
            }
          }
          if (var16 != null) {
            for (var27 = 1; var47.length > var27; var27 += 2) {
              var16[var27] = var38.f((byte) 75);
            }
          }
          for (var27 = 0; var27 < var12; var27++) {
            var48 = var13[var27];
            if (null != var48.field_e) {
              var19 = 0;
              for (var29 = 2; var29 < var48.field_e.length; var29 += 2) {
                var19 = var38.c((byte) 34) + (1 + var19);
                var48.field_e[var29] = (byte)var19;
              }
            }
          }
          for (var27 = 0; var12 > var27; var27++) {
            var49 = var13[var27];
            if (null != var49.field_f) {
              var19 = 0;
              for (var29 = 2; var29 < var49.field_f.length; var29 += 2) {
                var19 = var38.c((byte) 34) + (1 + var19);
                var49.field_f[var29] = (byte)var19;
              }
            }
          }
          if (null != var15) {
            var19 = var38.c((byte) 34);
            var15[0] = (byte)var19;
            for (var27 = 2; var27 < var46.length; var27 += 2) {
              var19 = var38.c((byte) 34) + 1 + var19;
              var15[var27] = (byte)var19;
            }
            var27 = var46[0];
            var28 = var46[1];
            for (var29 = 0; var27 > var29; var29++) {
              this.field_o[var29] = (byte)(this.field_o[var29] * var28 + 32 >> 6);
            }
            for (var29 = 2; var46.length > var29; var29 += 2) {
              var30 = var46[var29];
              var31 = var15[1 + var29];
              var32 = var28 * (var30 - var27) + (-var27 + var30) / 2;
              for (var33 = var27; var30 > var33; var33++) {
                var34 = pk.a(var30 - var27, (byte) -6, var32);
                this.field_o[var33] = (byte)(32 + this.field_o[var33] * var34 >> 6);
                var32 = var32 + (var31 - var28);
              }
              var27 = var30;
              var28 = var31;
            }
            for (var30 = var27; var30 < 128; var30++) {
              this.field_o[var30] = (byte)(32 + this.field_o[var30] * var28 >> 6);
            }
            var15 = null;
          }
          if (var16 != null) {
            var19 = var38.c((byte) 34);
            var16[0] = (byte)var19;
            for (var27 = 2; var27 < var47.length; var27 += 2) {
              var19 = var38.c((byte) 34) + 1 + var19;
              var16[var27] = (byte)var19;
            }
            var27 = var47[0];
            var28 = var47[1] << 1;
            for (var29 = 0; var27 > var29; var29++) {
              var30 = (255 & this.field_m[var29]) + var28;
              if (var30 < 0) {
                var30 = 0;
              }
              if (var30 > 128) {
                var30 = 128;
              }
              this.field_m[var29] = (byte)var30;
            }
            var29 = 2;
            while (var29 < var47.length) {
              var30 = var47[var29];
              var31 = var16[var29 + 1] << 1;
              var32 = (var30 - var27) * var28 + (-var27 + var30) / 2;
              var37 = var27;
              var33 = var37;
              while (var30 > var37) {
                var34 = pk.a(var30 - var27, (byte) -6, var32);
                var35 = (this.field_m[var37] & 255) + var34;
                if (var35 < 0) {
                  var35 = 0;
                }
                if (var35 > 128) {
                  var35 = 128;
                }
                this.field_m[var37] = (byte)var35;
                var32 = var32 + (var31 - var28);
                var37++;
              }
              var29 += 2;
              var28 = var31;
              var27 = var30;
            }
            for (var30 = var27; var30 < 128; var30++) {
              var31 = (this.field_m[var30] & 255) + var28;
              if (var31 < 0) {
                var31 = 0;
              }
              if (var31 > 128) {
                var31 = 128;
              }
              this.field_m[var30] = (byte)var31;
            }
            var16 = null;
          }
          for (var27 = 0; var12 > var27; var27++) {
            var13[var27].field_c = var38.c((byte) 34);
          }
          for (var27 = 0; var27 < var12; var27++) {
            var50 = var13[var27];
            if (null != var50.field_f) {
              var50.field_g = var38.c((byte) 34);
            }
            if (var50.field_e != null) {
              var50.field_a = var38.c((byte) 34);
            }
            if (var50.field_c > 0) {
              var50.field_h = var38.c((byte) 34);
            }
          }
          for (var27 = 0; var12 > var27; var27++) {
            var13[var27].field_d = var38.c((byte) 34);
          }
          for (var27 = 0; var27 < var12; var27++) {
            var51 = var13[var27];
            if (var51.field_d > 0) {
              var51.field_b = var38.c((byte) 34);
            }
          }
          for (var27 = 0; var27 < var12; var27++) {
            var52 = var13[var27];
            if (0 < var52.field_b) {
              var52.field_j = var38.c((byte) 34);
            }
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2 = decompiledCaughtException;
          stackIn_205_0 = var2;
          stackIn_205_1 = new StringBuilder().append("vl.<init>(");
          if (param0 == null) {
            stackIn_206_2 = "null";
          } else {
            stackIn_206_2 = "{...}";
          }
          throw t.a((Throwable) ((Object) stackIn_205_0), ((StringBuilder) (Object) stackIn_205_1).append(stackIn_206_2).append(')').toString());
        }
    }

    static {
        field_q = false;
        field_l = new java.math.BigInteger("6757747274818513864204534133465045479284128469717186816691454417744823753827902036844748836683348383638677747113757906301249837209713747402067689777172847");
    }
}
