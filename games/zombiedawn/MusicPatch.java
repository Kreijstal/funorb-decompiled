/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class MusicPatch extends IntrusiveNode {
    PcmSample[] field_o;
    static String field_q;
    byte[] field_h;
    FullscreenCanvasHelpers[] field_s;
    byte[] field_m;
    static String field_n;
    byte[] field_t;
    static int field_r;
    static int field_k;
    static boolean field_p;
    int field_u;
    short[] field_j;
    private int[] field_l;
    static String field_i;

    final static String getPromptVariantText(boolean param0, int param1, boolean param2, boolean param3) {
        int var4 = 0;
        if (param1 < 81) {
          MusicPatch.getPromptVariantText(false, 21, true, true);
        }
        if (param0) {
          var4 += 4;
        }
        if (param2) {
          var4 += 2;
        }
        if (param3) {
          var4++;
        }
        return CheckboxPainter.field_p[var4];
    }

    final boolean prepareSamples(boolean param0, int[] param1, SoundEffectLibrary param2, byte[] param3) {
        int var8 = 0;
        SoundEffectLibrary stackIn_13_0 = null;
        int stackIn_13_1 = 0;
        boolean stackIn_14_2 = false;
        int stackIn_23_0 = 0;
        RuntimeException stackIn_26_0 = null;
        StringBuilder stackIn_26_1 = null;
        String stackIn_27_2 = null;
        StringBuilder stackIn_29_1 = null;
        String stackIn_30_2 = null;
        StringBuilder stackIn_32_1 = null;
        String stackIn_33_2 = null;
        RuntimeException decompiledCaughtException = null;
        int var5_int = 0;
        RuntimeException var5 = null;
        int var6 = 0;
        Object var7 = null;
        int var9 = 0;
        int var10 = 0;
        var10 = ZombieDawn.field_J;
        try {
          var5_int = param0 ? 1 : 0;
          var6 = 0;
          var7 = null;
          for (var8 = 0; var8 < 128; var8++) {
            if (param3 == null ||
              param3[var8] != 0) {
              var9 = this.field_l[var8];
              if (0 != var9) {
                if (var9 != var6) {
                  var6 = var9;
                  var9--;
                  if ((1 & var9) != 0) {
                    var7 = param2.getVorbisSampleById(1856253636, param1, var9 >> 2);
                  } else {
                    stackIn_13_0 = (SoundEffectLibrary) (param2);
                    stackIn_13_1 = var9 >> 2;
                    stackIn_14_2 = !(param0);
                    var7 = ((SoundEffectLibrary) (Object) stackIn_13_0).getSynthesizedSampleById(stackIn_13_1, stackIn_14_2, param1);
                  }
                  if (var7 == null) {
                    var5_int = 0;
                  }
                }
                if (var7 != null) {
                  this.field_o[var8] = (PcmSample) (var7);
                  this.field_l[var8] = 0;
                }
              }
            }
          }
          stackIn_23_0 = var5_int;
          return stackIn_23_0 != 0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var5 = decompiledCaughtException;
          stackIn_26_0 = var5;
          stackIn_26_1 = new StringBuilder().append("ma.D(").append(param0).append(',');
          if (param1 == null) {
            stackIn_27_2 = "null";
          } else {
            stackIn_27_2 = "{...}";
          }
          stackIn_29_1 = ((StringBuilder) (Object) stackIn_26_1).append(stackIn_27_2).append(',');
          if (param2 == null) {
            stackIn_30_2 = "null";
          } else {
            stackIn_30_2 = "{...}";
          }
          stackIn_32_1 = ((StringBuilder) (Object) stackIn_29_1).append(stackIn_30_2).append(',');
          if (param3 == null) {
            stackIn_33_2 = "null";
          } else {
            stackIn_33_2 = "{...}";
          }
          throw ExceptionWrapper.wrapException((Throwable) ((Object) stackIn_26_0), ((StringBuilder) (Object) stackIn_32_1).append(stackIn_33_2).append(')').toString());
        }
    }

    final static void populateCaretPositions(TextLayoutLine param0, int param1, String param2, Font param3, boolean param4) {
        int var7 = 0;
        RuntimeException stackIn_22_0 = null;
        StringBuilder stackIn_22_1 = null;
        String stackIn_23_2 = null;
        StringBuilder stackIn_25_1 = null;
        String stackIn_26_2 = null;
        StringBuilder stackIn_28_1 = null;
        String stackIn_29_2 = null;
        RuntimeException decompiledCaughtException = null;
        int var5_int = 0;
        RuntimeException var5 = null;
        int var6 = 0;
        int var8 = 0;
        int var9 = 0;
        var9 = ZombieDawn.field_J;
        try {
          var5_int = 0;
          var6 = -1;
          if (param4) {
            MusicPatch.getLegacyMenuWidth((byte) 75);
          }
          for (var7 = 1; param2.length() > var7; var7++) {
            var8 = param2.charAt(var7);
            if (var8 == 60) {
              var6 = param0.field_e[0] + ((var5_int >> 8) + param3.textWidth(param2.substring(0, var7)));
            }
            if (-1 != var6) {
              param0.field_e[var7] = var6;
            } else {
              if (var8 == 32) {
                var5_int = var5_int + param1;
              }
              param0.field_e[var7] = (var5_int >> 8) + param0.field_e[0] + param3.textWidth(param2.substring(0, 1 + var7)) - param3.charWidth((char) var8);
            }
            if (62 == var8) {
              var6 = -1;
            }
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var5 = decompiledCaughtException;
          stackIn_22_0 = var5;
          stackIn_22_1 = new StringBuilder().append("ma.B(");
          if (param0 == null) {
            stackIn_23_2 = "null";
          } else {
            stackIn_23_2 = "{...}";
          }
          stackIn_25_1 = ((StringBuilder) (Object) stackIn_22_1).append(stackIn_23_2).append(',').append(param1).append(',');
          if (param2 == null) {
            stackIn_26_2 = "null";
          } else {
            stackIn_26_2 = "{...}";
          }
          stackIn_28_1 = ((StringBuilder) (Object) stackIn_25_1).append(stackIn_26_2).append(',');
          if (param3 == null) {
            stackIn_29_2 = "null";
          } else {
            stackIn_29_2 = "{...}";
          }
          throw ExceptionWrapper.wrapException((Throwable) ((Object) stackIn_22_0), ((StringBuilder) (Object) stackIn_28_1).append(stackIn_29_2).append(',').append(param4).append(')').toString());
        }
    }

    public static void releaseStatics(byte param0) {
        int var1 = 47 % ((param0 + 23) / 32);
        field_n = null;
        field_i = null;
        field_q = null;
    }

    MusicPatch(byte[] param0) {
        int var11_int = 0;
        int incrementValue$0 = 0;
        FullscreenCanvasHelpers dupTemp$8 = null;
        int incrementValue$6 = 0;
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
        FullscreenCanvasHelpers[] var13 = null;
        int var14 = 0;
        int var15_int = 0;
        byte[] var15 = null;
        FullscreenCanvasHelpers var15_ref = null;
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
        int var28_int = 0;
        FullscreenCanvasHelpers var28 = null;
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
        FullscreenCanvasHelpers var40 = null;
        byte[] var41 = null;
        byte[] var42 = null;
        byte[] var43 = null;
        byte[] var44 = null;
        FullscreenCanvasHelpers var45 = null;
        byte[] var46 = null;
        byte[] var47 = null;
        FullscreenCanvasHelpers var48 = null;
        FullscreenCanvasHelpers var49 = null;
        FullscreenCanvasHelpers var50 = null;
        FullscreenCanvasHelpers var51 = null;
        FullscreenCanvasHelpers var52 = null;
        byte[] var53 = null;
        byte[] var54 = null;
        byte[] var55 = null;
        byte[] var56 = null;
        byte[] var57 = null;
        byte[] var58 = null;
        byte[] var59 = null;
        FullscreenCanvasHelpers var28Lifetime1;
        int var5Lifetime1;
        int var8Lifetime1;
        int var19Lifetime1;
        int var19Lifetime2;
        int var19Lifetime3;
        int var19Lifetime4;
        int var19Lifetime5;
        int var19Lifetime6;
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
        int var27Lifetime12;
        int var28_intLifetime1;
        int var29Lifetime1;
        int var29Lifetime2;
        int var29Lifetime3;
        int var29Lifetime4;
        int var30Lifetime1;
        int var31Lifetime1;
        int var32Lifetime1;
        int var33Lifetime1;
        int var34Lifetime1;
        int var14Lifetime1;
        int var14Lifetime2;
        int var14Lifetime3;
        int var16_intLifetime1;
        int var29Lifetime5;
        int var30Lifetime2;
        int var27Lifetime6Lifetime1;
        int var27Lifetime7Lifetime1;
        int var29Lifetime3Lifetime1;
        int var29Lifetime4Lifetime1;
        int var30Lifetime1Lifetime1;
        int var30Lifetime1Lifetime2;
        int var31Lifetime1Lifetime1;
        try {
          this.field_o = new PcmSample[128];
          this.field_l = new int[128];
          this.field_t = new byte[128];
          this.field_j = new short[128];
          this.field_h = new byte[128];
          this.field_s = new FullscreenCanvasHelpers[128];
          this.field_m = new byte[128];
          var38 = new PacketBuffer(param0);
          for (var3 = 0; var38.payload[var38.position + var3] != 0; var3++) {
          }
          var55 = new byte[var3];
          var42 = var55;
          var4 = var42;
          for (var5 = 0; var5 < var3; var5++) {
            var4[var5] = var38.readByte((byte) 116);
          }
          var3++;
          var38.position = var38.position + 1;
          var5Lifetime1 = var38.position;
          var38.position = var38.position + var3;
          for (var6 = 0; 0 != var38.payload[var38.position + var6]; var6++) {
          }
          var56 = new byte[var6];
          var43 = var56;
          var7 = var43;
          for (var8 = 0; var6 > var8; var8++) {
            var7[var8] = var38.readByte((byte) 116);
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
            var10[var11_int] = var38.readByte((byte) 116);
          }
          var38.position = var38.position + 1;
          var9++;
          var53 = new byte[var9];
          var39 = var53;
          var11 = var39;
          if (var9 > 1) {
            var53[1] = (byte) 1;
            var13_int = 1;
            var12 = 2;
            for (var14 = 2; var9 > var14; var14++) {
              var15_int = var38.readUnsignedByte((byte) -118);
              if (var15_int != 0) {
                if (var13_int >= var15_int) {
                  var15_int--;
                }
                var13_int = var15_int;
              } else {
                incrementValue$0 = var12;
                var12++;
                var13_int = incrementValue$0;
              }
              var11[var14] = (byte)var13_int;
            }
          } else {
            var12 = var9;
          }
          var13 = new FullscreenCanvasHelpers[var12];
          for (var14Lifetime1 = 0; var14Lifetime1 < var13.length; var14Lifetime1++) {
            dupTemp$8 = new FullscreenCanvasHelpers();
            var13[var14Lifetime1] = dupTemp$8;
            var40 = dupTemp$8;
            var15_ref = var40;
            var16_int = var38.readUnsignedByte((byte) -125);
            if (var16_int > 0) {
              var15_ref.field_h = new byte[2 * var16_int];
            }
            var16_intLifetime1 = var38.readUnsignedByte((byte) -123);
            if (var16_intLifetime1 > 0) {
              var15_ref.field_b = new byte[2 + var16_intLifetime1 * 2];
              var40.field_b[1] = (byte)64;
            }
          }
          var14Lifetime2 = var38.readUnsignedByte((byte) -117);
          if (0 < var14Lifetime2) {
            stackIn_39_0 = new byte[2 * var14Lifetime2];
          } else {
            stackIn_39_0 = null;
          }
          var58 = stackIn_39_0;
          var46 = var58;
          var15 = var46;
          var14Lifetime3 = var38.readUnsignedByte((byte) -124);
          if (var14Lifetime3 > 0) {
            stackIn_42_0 = new byte[2 * var14Lifetime3];
          } else {
            stackIn_42_0 = null;
          }
          var59 = stackIn_42_0;
          var47 = var59;
          var16 = var47;
          for (var17 = 0; var38.payload[var38.position + var17] != 0; var17++) {
          }
          var54 = new byte[var17];
          var41 = var54;
          var18 = var41;
          for (var19 = 0; var17 > var19; var19++) {
            var18[var19] = var38.readByte((byte) 116);
          }
          var17++;
          var38.position = var38.position + 1;
          var19Lifetime1 = 0;
          for (var20 = 0; var20 < 128; var20++) {
            var19Lifetime1 = var19Lifetime1 + var38.readUnsignedByte((byte) -121);
            this.field_j[var20] = (short)var19Lifetime1;
          }
          var19Lifetime2 = 0;
          for (var20Lifetime1 = 0; var20Lifetime1 < 128; var20Lifetime1++) {
            var19Lifetime2 = var19Lifetime2 + var38.readUnsignedByte((byte) -123);
            this.field_j[var20Lifetime1] = (short)(this.field_j[var20Lifetime1] + (var19Lifetime2 << 8));
          }
          var20Lifetime2 = 0;
          var21 = 0;
          var22 = 0;
          for (var23 = 0; 128 > var23; var23++) {
            if (var20Lifetime2 == 0) {
              if (var21 >= var54.length) {
                var20Lifetime2 = -1;
              } else {
                var20Lifetime2 = var18[var21++];
              }
              var22 = var38.readVarInt(true);
            }
            this.field_j[var23] = (short)(this.field_j[var23] + (TextHotspotRegion.bitAnd(2, var22 - 1) << 14));
            this.field_l[var23] = var22;
            var20Lifetime2--;
          }
          var21Lifetime1 = 0;
          var20Lifetime3 = 0;
          var23Lifetime1 = 0;
          for (var24 = 0; var24 < 128; var24++) {
            if (0 != this.field_l[var24]) {
              if (var20Lifetime3 == 0) {
                if (var55.length <= var21Lifetime1) {
                  var20Lifetime3 = -1;
                } else {
                  var20Lifetime3 = var4[var21Lifetime1++];
                }
                incrementValue$6 = var5Lifetime1;
                var5Lifetime1++;
                var23Lifetime1 = var38.payload[incrementValue$6] - 1;
              }
              this.field_t[var24] = (byte)var23Lifetime1;
              var20Lifetime3--;
            }
          }
          var21Lifetime2 = 0;
          var20Lifetime4 = 0;
          var24Lifetime1 = 0;
          for (var25_int = 0; var25_int < 128; var25_int++) {
            if (0 != this.field_l[var25_int]) {
              if (var20Lifetime4 == 0) {
                incrementValue$3 = var8Lifetime1;
                var8Lifetime1++;
                var24Lifetime1 = 16 + var38.payload[incrementValue$3] << 2;
                if (var21Lifetime2 < var56.length) {
                  var20Lifetime4 = var7[var21Lifetime2++];
                } else {
                  var20Lifetime4 = -1;
                }
              }
              var20Lifetime4--;
              this.field_h[var25_int] = (byte)var24Lifetime1;
            }
          }
          var21Lifetime3 = 0;
          var20Lifetime5 = 0;
          var25 = null;
          for (var26 = 0; 128 > var26; var26++) {
            if (0 != this.field_l[var26]) {
              if (0 == var20Lifetime5) {
                var25 = var13[var53[var21Lifetime3]];
                if (var21Lifetime3 < var57.length) {
                  var20Lifetime5 = var10[var21Lifetime3++];
                } else {
                  var20Lifetime5 = -1;
                }
              }
              this.field_s[var26] = (FullscreenCanvasHelpers) (var25);
              var20Lifetime5--;
            }
          }
          var21Lifetime4 = 0;
          var20Lifetime6 = 0;
          var26Lifetime1 = 0;
          for (var27 = 0; var27 < 128; var27++) {
            if (var20Lifetime6 == 0) {
              if (var54.length > var21Lifetime4) {
                var20Lifetime6 = var18[var21Lifetime4++];
              } else {
                var20Lifetime6 = -1;
              }
              if (0 < this.field_l[var27]) {
                var26Lifetime1 = var38.readUnsignedByte((byte) -119) + 1;
              }
            }
            this.field_m[var27] = (byte)var26Lifetime1;
            var20Lifetime6--;
          }
          this.field_u = 1 + var38.readUnsignedByte((byte) -123);
          for (var27Lifetime1 = 0; var27Lifetime1 < var12; var27Lifetime1++) {
            var45 = var13[var27Lifetime1];
            if (null != var45.field_h) {
              for (var29 = 1; var45.field_h.length > var29; var29 += 2) {
                var45.field_h[var29] = var38.readByte((byte) 116);
              }
            }
            if (null != var45.field_b) {
              for (var29Lifetime5 = 3; var45.field_b.length - 2 > var29Lifetime5; var29Lifetime5 += 2) {
                var45.field_b[var29Lifetime5] = var38.readByte((byte) 116);
              }
            }
          }
          if (null != var15) {
            for (var27Lifetime2 = 1; var27Lifetime2 < var58.length; var27Lifetime2 += 2) {
              var15[var27Lifetime2] = var38.readByte((byte) 116);
            }
          }
          if (var16 != null) {
            for (var27Lifetime3 = 1; var59.length > var27Lifetime3; var27Lifetime3 += 2) {
              var16[var27Lifetime3] = var38.readByte((byte) 116);
            }
          }
          for (var27Lifetime4 = 0; var27Lifetime4 < var12; var27Lifetime4++) {
            var48 = var13[var27Lifetime4];
            if (var48.field_b != null) {
              var19Lifetime3 = 0;
              for (var29Lifetime1 = 2; var29Lifetime1 < var48.field_b.length; var29Lifetime1 += 2) {
                var19Lifetime3 = 1 + (var19Lifetime3 + var38.readUnsignedByte((byte) -125));
                var48.field_b[var29Lifetime1] = (byte)var19Lifetime3;
              }
            }
          }
          for (var27Lifetime5 = 0; var12 > var27Lifetime5; var27Lifetime5++) {
            var49 = var13[var27Lifetime5];
            var28 = var49;
            if (null != var49.field_h) {
              var19Lifetime4 = 0;
              for (var29Lifetime2 = 2; var29Lifetime2 < var49.field_h.length; var29Lifetime2 += 2) {
                var19Lifetime4 = var19Lifetime4 + 1 + var38.readUnsignedByte((byte) -128);
                var49.field_h[var29Lifetime2] = (byte)var19Lifetime4;
              }
            }
          }
          if (var15 != null) {
            var19Lifetime5 = var38.readUnsignedByte((byte) -115);
            var15[0] = (byte)var19Lifetime5;
            for (var27Lifetime6 = 2; var58.length > var27Lifetime6; var27Lifetime6 += 2) {
              var19Lifetime5 = var38.readUnsignedByte((byte) -122) + (1 + var19Lifetime5);
              var15[var27Lifetime6] = (byte)var19Lifetime5;
            }
            var27Lifetime6Lifetime1 = var58[0];
            var28_int = var58[1];
            for (var29Lifetime3 = 0; var29Lifetime3 < var27Lifetime6Lifetime1; var29Lifetime3++) {
              this.field_m[var29Lifetime3] = (byte)(32 + var28_int * this.field_m[var29Lifetime3] >> 6);
            }
            for (var29Lifetime3Lifetime1 = 2; var29Lifetime3Lifetime1 < var58.length; var29Lifetime3Lifetime1 += 2) {
              var30 = var58[var29Lifetime3Lifetime1];
              var31 = var15[var29Lifetime3Lifetime1 + 1];
              var32 = (var30 - var27Lifetime6Lifetime1) / 2 + var28_int * (-var27Lifetime6Lifetime1 + var30);
              for (var33 = var27Lifetime6Lifetime1; var33 < var30; var33++) {
                var34 = DelegatingCanvas.floorDivide(-var27Lifetime6Lifetime1 + var30, var32, false);
                this.field_m[var33] = (byte)(var34 * this.field_m[var33] + 32 >> 6);
                var32 = var32 + (var31 - var28_int);
              }
              var28_int = var31;
              var27Lifetime6Lifetime1 = var30;
            }
            for (var30Lifetime2 = var27Lifetime6Lifetime1; var30Lifetime2 < 128; var30Lifetime2++) {
              this.field_m[var30Lifetime2] = (byte)(var28_int * this.field_m[var30Lifetime2] + 32 >> 6);
            }
            var15 = null;
          }
          if (var16 != null) {
            var19Lifetime6 = var38.readUnsignedByte((byte) -118);
            var16[0] = (byte)var19Lifetime6;
            for (var27Lifetime7 = 2; var59.length > var27Lifetime7; var27Lifetime7 += 2) {
              var19Lifetime6 = var19Lifetime6 + 1 + var38.readUnsignedByte((byte) -118);
              var16[var27Lifetime7] = (byte)var19Lifetime6;
            }
            var27Lifetime7Lifetime1 = var59[0];
            var28_intLifetime1 = var59[1] << 1;
            for (var29Lifetime4 = 0; var29Lifetime4 < var27Lifetime7Lifetime1; var29Lifetime4++) {
              var30Lifetime1 = (255 & this.field_h[var29Lifetime4]) + var28_intLifetime1;
              if (var30Lifetime1 < 0) {
                var30Lifetime1 = 0;
              }
              if (var30Lifetime1 > 128) {
                var30Lifetime1 = 128;
              }
              this.field_h[var29Lifetime4] = (byte)var30Lifetime1;
            }
            var29Lifetime4Lifetime1 = 2;
            while (var59.length > var29Lifetime4Lifetime1) {
              var30Lifetime1Lifetime1 = var59[var29Lifetime4Lifetime1];
              var31Lifetime1 = var16[var29Lifetime4Lifetime1 + 1] << 1;
              var32Lifetime1 = (-var27Lifetime7Lifetime1 + var30Lifetime1Lifetime1) / 2 + (var30Lifetime1Lifetime1 - var27Lifetime7Lifetime1) * var28_intLifetime1;
              var37 = var27Lifetime7Lifetime1;
              var33Lifetime1 = var37;
              while (var30Lifetime1Lifetime1 > var37) {
                var34Lifetime1 = DelegatingCanvas.floorDivide(-var27Lifetime7Lifetime1 + var30Lifetime1Lifetime1, var32Lifetime1, false);
                var35 = var34Lifetime1 + (this.field_h[var37] & 255);
                if (0 > var35) {
                  var35 = 0;
                }
                if (var35 > 128) {
                  var35 = 128;
                }
                this.field_h[var37] = (byte)var35;
                var32Lifetime1 = var32Lifetime1 + (-var28_intLifetime1 + var31Lifetime1);
                var37++;
              }
              var29Lifetime4Lifetime1 += 2;
              var28_intLifetime1 = var31Lifetime1;
              var27Lifetime7Lifetime1 = var30Lifetime1Lifetime1;
            }
            var16 = null;
            for (var30Lifetime1Lifetime2 = var27Lifetime7Lifetime1; var30Lifetime1Lifetime2 < 128; var30Lifetime1Lifetime2++) {
              var31Lifetime1Lifetime1 = var28_intLifetime1 + (255 & this.field_h[var30Lifetime1Lifetime2]);
              if (var31Lifetime1Lifetime1 < 0) {
                var31Lifetime1Lifetime1 = 0;
              }
              if (var31Lifetime1Lifetime1 > 128) {
                var31Lifetime1Lifetime1 = 128;
              }
              this.field_h[var30Lifetime1Lifetime2] = (byte)var31Lifetime1Lifetime1;
            }
          }
          for (var27Lifetime8 = 0; var12 > var27Lifetime8; var27Lifetime8++) {
            var13[var27Lifetime8].field_j = var38.readUnsignedByte((byte) -122);
          }
          for (var27Lifetime9 = 0; var27Lifetime9 < var12; var27Lifetime9++) {
            var50 = var13[var27Lifetime9];
            var28Lifetime1 = var50;
            if (null != var50.field_h) {
              var28Lifetime1.field_i = var38.readUnsignedByte((byte) -118);
            }
            if (null != var28Lifetime1.field_b) {
              var28Lifetime1.field_e = var38.readUnsignedByte((byte) -120);
            }
            if (var28Lifetime1.field_j > 0) {
              var28Lifetime1.field_c = var38.readUnsignedByte((byte) -127);
            }
          }
          for (var27Lifetime10 = 0; var27Lifetime10 < var12; var27Lifetime10++) {
            var13[var27Lifetime10].field_a = var38.readUnsignedByte((byte) -128);
          }
          for (var27Lifetime11 = 0; var12 > var27Lifetime11; var27Lifetime11++) {
            var51 = var13[var27Lifetime11];
            if (0 < var51.field_a) {
              var51.field_f = var38.readUnsignedByte((byte) -126);
            }
          }
          for (var27Lifetime12 = 0; var27Lifetime12 < var12; var27Lifetime12++) {
            var52 = var13[var27Lifetime12];
            if (0 < var52.field_f) {
              var52.field_g = var38.readUnsignedByte((byte) -119);
            }
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2 = decompiledCaughtException;
          stackIn_205_0 = var2;
          stackIn_205_1 = new StringBuilder().append("ma.<init>(");
          if (param0 == null) {
            stackIn_206_2 = "null";
          } else {
            stackIn_206_2 = "{...}";
          }
          throw ExceptionWrapper.wrapException((Throwable) ((Object) stackIn_205_0), ((StringBuilder) (Object) stackIn_205_1).append(stackIn_206_2).append(')').toString());
        }
    }

    final static int getLegacyMenuWidth(byte param0) {
        int var1 = 45 % ((-7 - param0) / 35);
        return DropdownArrowPainter.field_a - DropdownArrowPainter.field_c;
    }

    static {
        field_q = "If you do nothing the game will revert to normal view in <%0> seconds.";
        field_n = "Resizable";
        field_i = "That name is not available";
    }
}
