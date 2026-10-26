/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class ml extends IntrusiveNode {
    PcmSample[] field_f;
    short[] field_n;
    private int[] field_g;
    byte[] field_q;
    static ej field_j;
    byte[] field_k;
    dh[] field_o;
    int field_i;
    static oo field_m;
    byte[] field_e;
    static boolean field_p;
    static float[] field_h;
    static String field_l;

    final boolean a(byte[] param0, int[] param1, SoundCache param2, int param3) {
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
        var10 = AceOfSkies.obfuscationControl ? 1 : 0;
        try {
          var5_int = 1;
          if (param3 != 5193) {
            this.field_f = (PcmSample[]) null;
          }
          var6 = 0;
          var7 = null;
          for (var8 = 0; 128 > var8; var8++) {
            if (param0 == null ||
              param0[var8] != 0) {
              var9 = this.field_g[var8];
              if (var9 != 0) {
                if (var9 != var6) {
                  var6 = var9;
                  var9--;
                  if ((1 & var9) == 0) {
                    var7 = param2.getSynthesizedSample(param1, var9 >> 2, (byte) 110);
                  } else {
                    var7 = param2.getVorbisSample(var9 >> 2, param1, (byte) -92);
                  }
                  if (var7 == null) {
                    var5_int = 0;
                  }
                }
                if (var7 != null) {
                  this.field_f[var8] = (PcmSample) (var7);
                  this.field_g[var8] = 0;
                }
              }
            }
          }
          stackIn_21_0 = var5_int;
          return stackIn_21_0 != 0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var5 = decompiledCaughtException;
          stackIn_24_0 = var5;
          stackIn_24_1 = new StringBuilder().append("ml.A(");
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
          stackIn_30_1 = ((StringBuilder) (Object) stackIn_27_1).append(stackIn_28_2).append(',');
          if (param2 == null) {
            stackIn_31_2 = "null";
          } else {
            stackIn_31_2 = "{...}";
          }
          throw pn.a((Throwable) ((Object) stackIn_24_0), ((StringBuilder) (Object) stackIn_30_1).append(stackIn_31_2).append(',').append(param3).append(')').toString());
        }
    }

    final static void a(byte param0, IntrusiveNode param1, IntrusiveNode param2) {
        try {
          if (param2.previous != null) {
            param2.unlink(-126);
          }
          param2.next = param1;
          param2.previous = param1.previous;
          param2.previous.next = param2;
          if (param0 != -20) {
            field_m = (oo) null;
          }
          param2.next.previous = param2;
        } catch (RuntimeException runtimeException) {
          throw pn.a((Throwable) ((Object) runtimeException), "ml.C(" + param0 + ',' + (param1 != null ? "{...}" : "null") + ',' + (param2 != null ? "{...}" : "null") + ')');
        }
    }

    public static void a(int param0) {
        field_m = null;
        field_j = null;
        field_h = null;
        if (param0 != 0) {
          ml.a(-90);
        }
        field_l = null;
    }

    final void a(boolean param0) {
        if (!param0) {
          return;
        }
        this.field_g = null;
    }

    ml(byte[] param0) {
        int var11_int = 0;
        int incrementValue$0 = 0;
        dh dupTemp$8 = null;
        int incrementValue$5 = 0;
        int var25_int = 0;
        int incrementValue$3 = 0;
        byte[] stackIn_39_0 = null;
        byte[] stackIn_42_0 = null;
        RuntimeException stackIn_208_0 = null;
        StringBuilder stackIn_208_1 = null;
        String stackIn_209_2 = null;
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
        dh[] var13 = null;
        int var14 = 0;
        int var15_int = 0;
        byte[] var15 = null;
        dh var15_ref = null;
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
        PacketBuffer var38 = null;
        byte[] var39 = null;
        dh var40 = null;
        byte[] var41 = null;
        byte[] var42 = null;
        byte[] var43 = null;
        byte[] var44 = null;
        dh var45 = null;
        byte[] var46 = null;
        byte[] var47 = null;
        dh var48 = null;
        dh var49 = null;
        dh var50 = null;
        dh var51 = null;
        dh var52 = null;
        byte[] var53 = null;
        byte[] var54 = null;
        byte[] var55 = null;
        byte[] var56 = null;
        byte[] var57 = null;
        byte[] var58 = null;
        byte[] var59 = null;
        int var5Lifetime1;
        int var8Lifetime1;
        int var19Lifetime1;
        int var19Lifetime2;
        int var19Lifetime3;
        int var19Lifetime4;
        int var19Lifetime5;
        int var20Lifetime1;
        int var20Lifetime2;
        int var20Lifetime3;
        int var20Lifetime4;
        int var20Lifetime5;
        int var20Lifetime6;
        int var21Lifetime1;
        int var21Lifetime2;
        int var21Lifetime3;
        int var21Lifetime4;
        int var23Lifetime1;
        int var24Lifetime1;
        int var26Lifetime1;
        int var27Lifetime1;
        int var27Lifetime2;
        int var27Lifetime3;
        int var27Lifetime4;
        int var27Lifetime5;
        int var27Lifetime6;
        int var27Lifetime7;
        int var27Lifetime8;
        int var27Lifetime9;
        int var27Lifetime10;
        int var27Lifetime11;
        int var28Lifetime1;
        int var29Lifetime1;
        int var29Lifetime2;
        int var29Lifetime3;
        int var30Lifetime1;
        int var30Lifetime2;
        int var30Lifetime3;
        int var31Lifetime1;
        int var31Lifetime2;
        int var32Lifetime1;
        int var33Lifetime1;
        int var34Lifetime1;
        int var14Lifetime1;
        int var14Lifetime2;
        int var14Lifetime3;
        int var16_intLifetime1;
        int var29Lifetime4;
        int var30Lifetime4;
        int var27Lifetime6Lifetime1;
        int var29Lifetime3Lifetime1;
        int var29Lifetime3Lifetime2;
        try {
          this.field_g = new int[128];
          this.field_e = new byte[128];
          this.field_k = new byte[128];
          this.field_f = new PcmSample[128];
          this.field_q = new byte[128];
          this.field_o = new dh[128];
          this.field_n = new short[128];
          var38 = new PacketBuffer(param0);
          for (var3 = 0; var38.payload[var3 + var38.position] != 0; var3++) {
          }
          var55 = new byte[var3];
          var42 = var55;
          var4 = var42;
          for (var5 = 0; var5 < var3; var5++) {
            var4[var5] = var38.readByte(0);
          }
          var38.position = var38.position + 1;
          var3++;
          var5Lifetime1 = var38.position;
          var38.position = var38.position + var3;
          for (var6 = 0; var38.payload[var6 + var38.position] != 0; var6++) {
          }
          var56 = new byte[var6];
          var43 = var56;
          var7 = var43;
          for (var8 = 0; var8 < var6; var8++) {
            var7[var8] = var38.readByte(0);
          }
          var38.position = var38.position + 1;
          var6++;
          var8Lifetime1 = var38.position;
          var38.position = var38.position + var6;
          for (var9 = 0; var38.payload[var38.position + var9] != 0; var9++) {
          }
          var57 = new byte[var9];
          var44 = var57;
          var10 = var44;
          for (var11_int = 0; var9 > var11_int; var11_int++) {
            var10[var11_int] = var38.readByte(0);
          }
          var9++;
          var38.position = var38.position + 1;
          var53 = new byte[var9];
          var39 = var53;
          var11 = var39;
          if (var9 > 1) {
            var53[1] = (byte) 1;
            var12 = 2;
            var13_int = 1;
            for (var14 = 2; var14 < var9; var14++) {
              var15_int = var38.readUnsignedByte(-117);
              if (var15_int == 0) {
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
          var13 = new dh[var12];
          for (var14Lifetime1 = 0; var13.length > var14Lifetime1; var14Lifetime1++) {
            dupTemp$8 = new dh();
            var13[var14Lifetime1] = dupTemp$8;
            var40 = dupTemp$8;
            var15_ref = var40;
            var16_int = var38.readUnsignedByte(-60);
            if (var16_int > 0) {
              var15_ref.field_g = new byte[var16_int * 2];
            }
            var16_intLifetime1 = var38.readUnsignedByte(71);
            if (var16_intLifetime1 > 0) {
              var15_ref.field_e = new byte[2 * var16_intLifetime1 + 2];
              var40.field_e[1] = (byte)64;
            }
          }
          var14Lifetime2 = var38.readUnsignedByte(90);
          if (0 < var14Lifetime2) {
            stackIn_39_0 = new byte[2 * var14Lifetime2];
          } else {
            stackIn_39_0 = null;
          }
          var58 = stackIn_39_0;
          var46 = var58;
          var15 = var46;
          var14Lifetime3 = var38.readUnsignedByte(82);
          if (var14Lifetime3 > 0) {
            stackIn_42_0 = new byte[var14Lifetime3 * 2];
          } else {
            stackIn_42_0 = null;
          }
          var59 = stackIn_42_0;
          var47 = var59;
          var16 = var47;
          for (var17 = 0; var38.payload[var17 + var38.position] != 0; var17++) {
          }
          var54 = new byte[var17];
          var41 = var54;
          var18 = var41;
          for (var19 = 0; var17 > var19; var19++) {
            var18[var19] = var38.readByte(0);
          }
          var38.position = var38.position + 1;
          var17++;
          var19Lifetime1 = 0;
          for (var20 = 0; var20 < 128; var20++) {
            var19Lifetime1 = var19Lifetime1 + var38.readUnsignedByte(-107);
            this.field_n[var20] = (short)var19Lifetime1;
          }
          var19Lifetime2 = 0;
          for (var20Lifetime1 = 0; 128 > var20Lifetime1; var20Lifetime1++) {
            var19Lifetime2 = var19Lifetime2 + var38.readUnsignedByte(-113);
            this.field_n[var20Lifetime1] = (short)(this.field_n[var20Lifetime1] + (var19Lifetime2 << 8));
          }
          var20Lifetime2 = 0;
          var21 = 0;
          var22 = 0;
          for (var23 = 0; var23 < 128; var23++) {
            if (0 == var20Lifetime2) {
              if (var21 >= var54.length) {
                var20Lifetime2 = -1;
              } else {
                var20Lifetime2 = var18[var21++];
              }
              var22 = var38.a(127);
            }
            this.field_n[var23] = (short)(this.field_n[var23] + pg.a(32768, -1 + var22 << 14));
            var20Lifetime2--;
            this.field_g[var23] = var22;
          }
          var20Lifetime3 = 0;
          var21Lifetime1 = 0;
          var23Lifetime1 = 0;
          for (var24 = 0; 128 > var24; var24++) {
            if (0 != this.field_g[var24]) {
              if (0 == var20Lifetime3) {
                incrementValue$5 = var5Lifetime1;
                var5Lifetime1++;
                var23Lifetime1 = var38.payload[incrementValue$5] - 1;
                if (var55.length > var21Lifetime1) {
                  var20Lifetime3 = var4[var21Lifetime1++];
                } else {
                  var20Lifetime3 = -1;
                }
              }
              this.field_e[var24] = (byte)var23Lifetime1;
              var20Lifetime3--;
            }
          }
          var21Lifetime2 = 0;
          var20Lifetime4 = 0;
          var24Lifetime1 = 0;
          for (var25_int = 0; var25_int < 128; var25_int++) {
            if (this.field_g[var25_int] != 0) {
              if (0 == var20Lifetime4) {
                incrementValue$3 = var8Lifetime1;
                var8Lifetime1++;
                var24Lifetime1 = var38.payload[incrementValue$3] + 16 << 2;
                if (var56.length <= var21Lifetime2) {
                  var20Lifetime4 = -1;
                } else {
                  var20Lifetime4 = var7[var21Lifetime2++];
                }
              }
              var20Lifetime4--;
              this.field_q[var25_int] = (byte)var24Lifetime1;
            }
          }
          var21Lifetime3 = 0;
          var20Lifetime5 = 0;
          var25 = null;
          for (var26 = 0; var26 < 128; var26++) {
            if (this.field_g[var26] != 0) {
              if (var20Lifetime5 == 0) {
                var25 = var13[var53[var21Lifetime3]];
                if (var21Lifetime3 < var57.length) {
                  var20Lifetime5 = var10[var21Lifetime3++];
                } else {
                  var20Lifetime5 = -1;
                }
              }
              this.field_o[var26] = (dh) (var25);
              var20Lifetime5--;
            }
          }
          var20Lifetime6 = 0;
          var21Lifetime4 = 0;
          var26Lifetime1 = 0;
          for (var27 = 0; 128 > var27; var27++) {
            if (0 == var20Lifetime6) {
              if (var21Lifetime4 < var54.length) {
                var20Lifetime6 = var18[var21Lifetime4++];
              } else {
                var20Lifetime6 = -1;
              }
              if (0 < this.field_g[var27]) {
                var26Lifetime1 = var38.readUnsignedByte(-91) + 1;
              }
            }
            var20Lifetime6--;
            this.field_k[var27] = (byte)var26Lifetime1;
          }
          this.field_i = 1 + var38.readUnsignedByte(-94);
          for (var27Lifetime1 = 0; var27Lifetime1 < var12; var27Lifetime1++) {
            var45 = var13[var27Lifetime1];
            if (var45.field_g != null) {
              for (var29 = 1; var29 < var45.field_g.length; var29 += 2) {
                var45.field_g[var29] = var38.readByte(0);
              }
            }
            if (null != var45.field_e) {
              for (var29Lifetime4 = 3; var45.field_e.length - 2 > var29Lifetime4; var29Lifetime4 += 2) {
                var45.field_e[var29Lifetime4] = var38.readByte(0);
              }
            }
          }
          if (var15 != null) {
            for (var27Lifetime2 = 1; var27Lifetime2 < var58.length; var27Lifetime2 += 2) {
              var15[var27Lifetime2] = var38.readByte(0);
            }
          }
          if (var16 != null) {
            for (var27Lifetime3 = 1; var27Lifetime3 < var59.length; var27Lifetime3 += 2) {
              var16[var27Lifetime3] = var38.readByte(0);
            }
          }
          for (var27Lifetime4 = 0; var27Lifetime4 < var12; var27Lifetime4++) {
            var48 = var13[var27Lifetime4];
            if (var48.field_e != null) {
              var19Lifetime3 = 0;
              for (var29Lifetime1 = 2; var48.field_e.length > var29Lifetime1; var29Lifetime1 += 2) {
                var19Lifetime3 = 1 + var19Lifetime3 + var38.readUnsignedByte(123);
                var48.field_e[var29Lifetime1] = (byte)var19Lifetime3;
              }
            }
          }
          for (var27Lifetime5 = 0; var12 > var27Lifetime5; var27Lifetime5++) {
            var49 = var13[var27Lifetime5];
            if (var49.field_g != null) {
              var19Lifetime4 = 0;
              for (var29Lifetime2 = 2; var29Lifetime2 < var49.field_g.length; var29Lifetime2 += 2) {
                var19Lifetime4 = var19Lifetime4 - (-1 - var38.readUnsignedByte(-90));
                var49.field_g[var29Lifetime2] = (byte)var19Lifetime4;
              }
            }
          }
          boolean decompiledFrameRemainder0 = true;
          if (var15 == null) {
            decompiledFrameRemainder0 = (var16 != null);
            if (decompiledFrameRemainder0) {
              var19Lifetime5 = var38.readUnsignedByte(38);
              var16[0] = (byte)var19Lifetime5;
              for (var27Lifetime6 = 2; var59.length > var27Lifetime6; var27Lifetime6 += 2) {
                var19Lifetime5 = var19Lifetime5 - (-1 - var38.readUnsignedByte(-55));
                var16[var27Lifetime6] = (byte)var19Lifetime5;
              }
            }
          } else {
            var19Lifetime5 = var38.readUnsignedByte(123);
            var15[0] = (byte)var19Lifetime5;
            for (var27Lifetime6 = 2; var58.length > var27Lifetime6; var27Lifetime6 += 2) {
              var19Lifetime5 = var38.readUnsignedByte(-95) + 1 + var19Lifetime5;
              var15[var27Lifetime6] = (byte)var19Lifetime5;
            }
            var27Lifetime6 = var58[0];
            var28 = var58[1];
            for (var29Lifetime3 = 0; var27Lifetime6 > var29Lifetime3; var29Lifetime3++) {
              this.field_k[var29Lifetime3] = (byte)(this.field_k[var29Lifetime3] * var28 + 32 >> 6);
            }
            var29Lifetime3 = 2;
            while (var58.length > var29Lifetime3) {
              var30 = var58[var29Lifetime3];
              var31 = var15[var29Lifetime3 + 1];
              var32 = (-var27Lifetime6 + var30) / 2 + (-var27Lifetime6 + var30) * var28;
              for (var33 = var27Lifetime6; var30 > var33; var33++) {
                var34 = oh.a(var30 - var27Lifetime6, var32, (byte) -124);
                var32 = var32 + (var31 - var28);
                this.field_k[var33] = (byte)(this.field_k[var33] * var34 + 32 >> 6);
              }
              var29Lifetime3 += 2;
              var28 = var31;
              var27Lifetime6 = var30;
            }
            var15 = null;
            for (var30Lifetime4 = var27Lifetime6; var30Lifetime4 < 128; var30Lifetime4++) {
              this.field_k[var30Lifetime4] = (byte)(this.field_k[var30Lifetime4] * var28 + 32 >> 6);
            }
            decompiledFrameRemainder0 = (var16 != null);
            if (decompiledFrameRemainder0) {
              var19Lifetime5 = var38.readUnsignedByte(38);
              var16[0] = (byte)var19Lifetime5;
              for (var27Lifetime6 = 2; var59.length > var27Lifetime6; var27Lifetime6 += 2) {
                var19Lifetime5 = var19Lifetime5 - (-1 - var38.readUnsignedByte(-55));
                var16[var27Lifetime6] = (byte)var19Lifetime5;
              }
            }
          }
          if (decompiledFrameRemainder0) {
            var27Lifetime6Lifetime1 = var59[0];
            var28Lifetime1 = var59[1] << 1;
            for (var29Lifetime3Lifetime1 = 0; var27Lifetime6Lifetime1 > var29Lifetime3Lifetime1; var29Lifetime3Lifetime1++) {
              var30Lifetime1 = var28Lifetime1 + (this.field_q[var29Lifetime3Lifetime1] & 255);
              if (var30Lifetime1 < 0) {
                var30Lifetime1 = 0;
              }
              if (var30Lifetime1 > 128) {
                var30Lifetime1 = 128;
              }
              this.field_q[var29Lifetime3Lifetime1] = (byte)var30Lifetime1;
            }
            for (var29Lifetime3Lifetime2 = 2; var59.length > var29Lifetime3Lifetime2; var29Lifetime3Lifetime2 += 2) {
              var30Lifetime2 = var59[var29Lifetime3Lifetime2];
              var31Lifetime1 = var16[var29Lifetime3Lifetime2 + 1] << 1;
              var32Lifetime1 = (var30Lifetime2 - var27Lifetime6Lifetime1) * var28Lifetime1 + (-var27Lifetime6Lifetime1 + var30Lifetime2) / 2;
              var37 = var27Lifetime6Lifetime1;
              var33Lifetime1 = var37;
              while (var37 < var30Lifetime2) {
                var34Lifetime1 = oh.a(-var27Lifetime6Lifetime1 + var30Lifetime2, var32Lifetime1, (byte) 40);
                var35 = (this.field_q[var37] & 255) + var34Lifetime1;
                if (0 > var35) {
                  var35 = 0;
                }
                if (var35 > 128) {
                  var35 = 128;
                }
                this.field_q[var37] = (byte)var35;
                var32Lifetime1 = var32Lifetime1 + (-var28Lifetime1 + var31Lifetime1);
                var37++;
              }
              var27Lifetime6Lifetime1 = var30Lifetime2;
              var28Lifetime1 = var31Lifetime1;
            }
            for (var30Lifetime3 = var27Lifetime6Lifetime1; var30Lifetime3 < 128; var30Lifetime3++) {
              var31Lifetime2 = var28Lifetime1 + (this.field_q[var30Lifetime3] & 255);
              if (var31Lifetime2 < 0) {
                var31Lifetime2 = 0;
              }
              if (var31Lifetime2 > 128) {
                var31Lifetime2 = 128;
              }
              this.field_q[var30Lifetime3] = (byte)var31Lifetime2;
            }
            var16 = null;
          }
          for (var27Lifetime7 = 0; var27Lifetime7 < var12; var27Lifetime7++) {
            var13[var27Lifetime7].field_b = var38.readUnsignedByte(-106);
          }
          for (var27Lifetime8 = 0; var27Lifetime8 < var12; var27Lifetime8++) {
            var50 = var13[var27Lifetime8];
            if (null != var50.field_g) {
              var50.field_h = var38.readUnsignedByte(-88);
            }
            if (var50.field_e != null) {
              var50.field_l = var38.readUnsignedByte(108);
            }
            if (var50.field_b > 0) {
              var50.field_f = var38.readUnsignedByte(-107);
            }
          }
          for (var27Lifetime9 = 0; var27Lifetime9 < var12; var27Lifetime9++) {
            var13[var27Lifetime9].field_i = var38.readUnsignedByte(-84);
          }
          for (var27Lifetime10 = 0; var12 > var27Lifetime10; var27Lifetime10++) {
            var51 = var13[var27Lifetime10];
            if (var51.field_i > 0) {
              var51.field_j = var38.readUnsignedByte(82);
            }
          }
          for (var27Lifetime11 = 0; var12 > var27Lifetime11; var27Lifetime11++) {
            var52 = var13[var27Lifetime11];
            if (var52.field_j > 0) {
              var52.field_a = var38.readUnsignedByte(59);
            }
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2 = decompiledCaughtException;
          stackIn_208_0 = var2;
          stackIn_208_1 = new StringBuilder().append("ml.<init>(");
          if (param0 == null) {
            stackIn_209_2 = "null";
          } else {
            stackIn_209_2 = "{...}";
          }
          throw pn.a((Throwable) ((Object) stackIn_208_0), ((StringBuilder) (Object) stackIn_208_1).append(stackIn_209_2).append(')').toString());
        }
    }

    static {
        field_j = new ej(15, 0, 1, 0);
        field_l = "abcdefghijklmnopqrstuvwxyzABCDEFGHIJKLMNOPQRSTUVWXYZ0123456789";
        field_h = new float[]{1.0f, 0.0f, 0.0f, 0.0f, 0.0f, 1.0f, 0.0f, 0.0f, 0.0f, 0.0f, 1.0f, 0.0f, 0.0f, 0.0f, 0.0f, 1.0f};
    }

    /* Full JVM integer arguments; original narrow signature preserved. */
    final static void $cfr$intArgs$a$9910ad98b3f5(int param0, IntrusiveNode param1, IntrusiveNode param2) {
        try {
          if (param2.previous != null) {
            param2.unlink(-126);
          }
          param2.next = param1;
          param2.previous = param1.previous;
          param2.previous.next = param2;
          if (param0 != -20) {
            field_m = (oo) null;
          }
          param2.next.previous = param2;
        } catch (RuntimeException runtimeException) {
          throw pn.a((Throwable) ((Object) runtimeException), "ml.C(" + param0 + ',' + (param1 != null ? "{...}" : "null") + ',' + (param2 != null ? "{...}" : "null") + ')');
        }
    }
}
