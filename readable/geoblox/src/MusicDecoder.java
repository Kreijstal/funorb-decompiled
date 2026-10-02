/*
 * Decompiled by CFR-JS 0.4.0.
 */
import java.io.*;

final class MusicDecoder extends IntrusiveNode {
    private boolean field_A;
    private static int[] field_l;
    private static ui[] field_k;
    private int sampleCount;
    private static int[] field_f;
    static ae[] field_u;
    private static int shortBlockSize;
    private static float[] workBlock;
    private static boolean[] field_o;
    private static float[] field_g;
    private boolean field_i;
    private static int bitCursor;
    private static int byteCursor;
    private static we[] field_N;
    private static float[] field_K;
    private static float[] field_r;
    private int field_m;
    private int pcmWriteCursor;
    private static float[] field_w;
    private byte[] pcmBytes;
    private float[] previousBlock;
    private static int[] field_D;
    private static float[] field_s;
    private static int longBlockSize;
    private int field_I;
    private byte[][] packets;
    private static MusicDecodeStage[] field_F;
    private static float[] field_h;
    private static boolean field_z;
    private int field_q;
    private static byte[] bitstreamBytes;
    private int previousBlockSize;
    private int packetCursor;
    private int field_n;

    private final static void setBitInput(byte[] inputBytes, int startByte) {
        bitstreamBytes = inputBytes;
        byteCursor = startByte;
        bitCursor = 0;
    }

    final static float d(int param0) {
        int var1 = param0 & 2097151;
        int var2 = param0 & -2147483648;
        int var3 = (param0 & 2145386496) >> 21;
        if (var2 != 0) {
            var1 = -var1;
        }
        return (float)((double)var1 * Math.pow(2.0, (double)(var3 - 788)));
    }

    final static MusicDecoder a(rh param0, int param1, int param2) {
        try {
            MusicDecoder var4_ref = null;
            if (!MusicDecoder.a(param0)) {
                param0.a((byte) 37, param1, param2);
                return null;
            }
            byte[] var3 = param0.a(param1, -28153, param2);
            if (var3 == null) {
                return null;
            }
            Object var4 = null;
            try {
                var4_ref = new MusicDecoder(var3);
            } catch (IOException iOException) {
                iOException.printStackTrace();
            }
            return var4_ref;
        } catch (RuntimeException | Error decompiledUncheckedException) {
            throw decompiledUncheckedException;
        } catch (Throwable decompiledCheckedException) {
            throw new RuntimeException(decompiledCheckedException);
        }
    }

    final gd decodePcmBudgeted(int[] sampleBudget) {
        int sampleIndex = 0;
        int incrementValue$0 = 0;
        int writePosition;
        int samplesToWrite;
        int unsignedPcmSample;
        float[] decodedSamples;
        byte[] completedPcm;
        if (sampleBudget != null) {
          if (sampleBudget[0] <= 0) {
            return null;
          }
        }
        if (this.pcmBytes == null) {
          this.previousBlockSize = 0;
          this.previousBlock = new float[longBlockSize];
          this.pcmBytes = new byte[this.sampleCount];
          this.pcmWriteCursor = 0;
          this.packetCursor = 0;
        }
        L2: while (this.packetCursor < this.packets.length) {
          if (sampleBudget != null) {
            if (sampleBudget[0] <= 0) {
              return null;
            }
          }
          L4: {
            decodedSamples = this.decodePacket(this.packetCursor);
            if (decodedSamples != null) {
              writePosition = this.pcmWriteCursor;
              samplesToWrite = decodedSamples.length;
              if (samplesToWrite > this.sampleCount - writePosition) {
                samplesToWrite = this.sampleCount - writePosition;
              }
              for (sampleIndex = 0; sampleIndex < samplesToWrite; sampleIndex++) {
                unsignedPcmSample = (int)(128.0f + decodedSamples[sampleIndex] * 128.0f);
                if ((unsignedPcmSample & -256) != 0) {
                  unsignedPcmSample = ~unsignedPcmSample >> 31;
                }
                incrementValue$0 = writePosition;
                writePosition++;
                this.pcmBytes[incrementValue$0] = (byte)(unsignedPcmSample - 128);
              }
              if (sampleBudget != null) {
                sampleBudget[0] = sampleBudget[0] - (writePosition - this.pcmWriteCursor);
              }
              this.pcmWriteCursor = writePosition;
              break L4;
            }
          }
          this.packetCursor = this.packetCursor + 1;
        }
        this.previousBlock = null;
        completedPcm = this.pcmBytes;
        this.pcmBytes = null;
        return new gd(this.field_q, completedPcm, this.field_I, this.field_n, this.field_A);
    }

    final static int readBit() {
        int bitValue = bitstreamBytes[byteCursor] >> bitCursor & 1;
        bitCursor = bitCursor + 1;
        byteCursor = byteCursor + (bitCursor >> 3);
        bitCursor = bitCursor & 7;
        return bitValue;
    }

    final static int readBits(int bitCount) {
        int chunkMask = 0;
        int chunkBitsThenMask = 0;
        int value = 0;
        int outputShift = 0;
        while (bitCount >= 8 - bitCursor) {
            chunkBitsThenMask = 8 - bitCursor;
            chunkMask = (1 << chunkBitsThenMask) - 1;
            value = value + ((bitstreamBytes[byteCursor] >> bitCursor & chunkMask) << outputShift);
            bitCursor = 0;
            byteCursor = byteCursor + 1;
            outputShift = outputShift + chunkBitsThenMask;
            bitCount = bitCount - chunkBitsThenMask;
        }
        if (bitCount > 0) {
            chunkBitsThenMask = (1 << bitCount) - 1;
            value = value + ((bitstreamBytes[byteCursor] >> bitCursor & chunkBitsThenMask) << outputShift);
            bitCursor = bitCursor + bitCount;
        }
        return value;
    }

    final static MusicDecoder a(rh param0, String param1, String param2) {
        try {
            MusicDecoder var4_ref = null;
            if (!MusicDecoder.a(param0)) {
                param0.a((byte) 113, param2, param1);
                return null;
            }
            byte[] var3 = param0.a(0, param2, param1);
            if (var3 == null) {
                return null;
            }
            Object var4 = null;
            try {
                var4_ref = new MusicDecoder(var3);
            } catch (IOException iOException) {
                iOException.printStackTrace();
            }
            return var4_ref;
        } catch (RuntimeException | Error decompiledUncheckedException) {
            throw decompiledUncheckedException;
        } catch (Throwable decompiledCheckedException) {
            throw new RuntimeException(decompiledCheckedException);
        }
    }

    private final void readPacketContainer(byte[] containerBytes) throws IOException {
        int var4 = 0;
        int var5 = 0;
        int var6_int = 0;
        byte[] var6 = null;
        qc var2 = new qc(containerBytes);
        this.field_q = var2.a((byte) -53);
        this.sampleCount = var2.a((byte) -128);
        this.field_I = var2.a((byte) -128);
        this.field_n = var2.a((byte) -89);
        if (this.field_n < 0) {
            this.field_n = ~this.field_n;
            this.field_A = true;
        }
        int var3 = var2.a((byte) -108);
        if (var3 < 0) {
            throw new IOException();
        }
        this.packets = new byte[var3][];
        for (var4 = 0; var4 < var3; var4++) {
            var5 = 0;
            do {
                var6_int = var2.c((byte) 34);
                var5 = var5 + var6_int;
            } while (var6_int >= 255);
            var6 = new byte[var5];
            var2.b(29915, var5, var6, 0);
            this.packets[var4] = var6;
        }
    }

    final gd decodePcm() {
        int var6 = 0;
        int incrementValue$0 = 0;
        byte[] var1;
        int var2;
        int var3;
        float[] var4;
        int var5;
        int var7;
        this.previousBlockSize = 0;
        this.previousBlock = new float[longBlockSize];
        var1 = new byte[this.sampleCount];
        var2 = 0;
        var3 = 0;
        L0: while (true) {
          if (var3 >= this.packets.length) {
            this.previousBlock = null;
            return new gd(this.field_q, var1, this.field_I, this.field_n, this.field_A);
          } else {
            var4 = this.decodePacket(var3);
            if (var4 != null) {
              var5 = var4.length;
              if (var5 > this.sampleCount - var2) {
                var5 = this.sampleCount - var2;
              }
              for (var6 = 0; var6 < var5; var6++) {
                var7 = (int)(128.0f + var4[var6] * 128.0f);
                if ((var7 & -256) != 0) {
                  var7 = ~var7 >> 31;
                }
                incrementValue$0 = var2;
                var2++;
                var1[incrementValue$0] = (byte)(var7 - 128);
              }
              var3++;
              continue L0;
            } else {
              var3++;
              continue L0;
            }
          }
        }
    }

    final static void a(byte[] param0) {
        int var6 = 0;
        int var7_int = 0;
        int var8_int = 0;
        int var9_int = 0;
        int var11 = 0;
        int stackIn_5_0 = 0;
        boolean[] stackIn_39_0 = null;
        int stackIn_39_1 = 0;
        boolean[] stackIn_40_0 = null;
        int stackIn_40_1 = 0;
        int stackIn_40_2 = 0;
        int var1;
        int var2;
        int var3;
        int var4;
        int var5;
        float[] var6_ref_float__;
        float[] var7;
        float[] var8;
        int[] var9;
        int var10;
        MusicDecoder.setBitInput(param0, 0);
        shortBlockSize = 1 << MusicDecoder.readBits(4);
        longBlockSize = 1 << MusicDecoder.readBits(4);
        workBlock = new float[longBlockSize];
        var1 = 0;
        L0: while (true) {
          if (var1 >= 2) {
            var1 = MusicDecoder.readBits(8) + 1;
            field_u = new ae[var1];
            for (var2 = 0; var2 < var1; var2++) {
              field_u[var2] = new ae();
            }
            var2 = MusicDecoder.readBits(6) + 1;
            for (var3 = 0; var3 < var2; var3++) {
              MusicDecoder.readBits(16);
            }
            var2 = MusicDecoder.readBits(6) + 1;
            field_F = new MusicDecodeStage[var2];
            for (var3 = 0; var3 < var2; var3++) {
              field_F[var3] = new MusicDecodeStage();
            }
            var3 = MusicDecoder.readBits(6) + 1;
            field_k = new ui[var3];
            for (var4 = 0; var4 < var3; var4++) {
              field_k[var4] = new ui();
            }
            var4 = MusicDecoder.readBits(6) + 1;
            field_N = new we[var4];
            for (var5 = 0; var5 < var4; var5++) {
              field_N[var5] = new we();
            }
            var5 = MusicDecoder.readBits(6) + 1;
            field_o = new boolean[var5];
            field_D = new int[var5];
            for (var6 = 0; var6 < var5; var6++) {
              stackIn_39_0 = (boolean[]) (field_o);

              stackIn_39_1 = var6;

              if (MusicDecoder.readBit() == 0) {
                stackIn_40_0 = (boolean[]) ((Object) stackIn_39_0);
                stackIn_40_1 = stackIn_39_1;
                stackIn_40_2 = 0;
              } else {
                stackIn_40_0 = (boolean[]) ((Object) stackIn_39_0);
                stackIn_40_1 = stackIn_39_1;
                stackIn_40_2 = 1;
              }
              stackIn_40_0[stackIn_40_1] = stackIn_40_2 != 0;
              MusicDecoder.readBits(16);
              MusicDecoder.readBits(16);
              field_D[var6] = MusicDecoder.readBits(8);
            }
            field_z = true;
            return;
          } else {
            if (var1 == 0) {
              stackIn_5_0 = shortBlockSize;
            } else {
              stackIn_5_0 = longBlockSize;
            }
            var2 = stackIn_5_0;
            var3 = var2 >> 1;
            var4 = var2 >> 2;
            var5 = var2 >> 3;
            var6_ref_float__ = new float[var3];
            for (var7_int = 0; var7_int < var4; var7_int++) {
              var6_ref_float__[2 * var7_int] = (float)Math.cos((double)(4 * var7_int) * 3.141592653589793 / (double)var2);
              var6_ref_float__[2 * var7_int + 1] = -(float)Math.sin((double)(4 * var7_int) * 3.141592653589793 / (double)var2);
            }
            var7 = new float[var3];
            for (var8_int = 0; var8_int < var4; var8_int++) {
              var7[2 * var8_int] = (float)Math.cos((double)(2 * var8_int + 1) * 3.141592653589793 / (double)(2 * var2));
              var7[2 * var8_int + 1] = (float)Math.sin((double)(2 * var8_int + 1) * 3.141592653589793 / (double)(2 * var2));
            }
            var8 = new float[var4];
            for (var9_int = 0; var9_int < var5; var9_int++) {
              var8[2 * var9_int] = (float)Math.cos((double)(4 * var9_int + 2) * 3.141592653589793 / (double)var2);
              var8[2 * var9_int + 1] = -(float)Math.sin((double)(4 * var9_int + 2) * 3.141592653589793 / (double)var2);
            }
            var9 = new int[var5];
            var10 = hj.a((byte) 58, var5 - 1);
            for (var11 = 0; var11 < var5; var11++) {
              var9[var11] = nd.a(var11, 0, var10);
            }
            if (var1 == 0) {
              field_s = var6_ref_float__;
              field_K = var7;
              field_r = var8;
              field_f = var9;
              var1++;
              continue L0;
            } else {
              field_w = var6_ref_float__;
              field_g = var7;
              field_h = var8;
              field_l = var9;
              var1++;
              continue L0;
            }
          }
        }
    }

    public static void a() {
        bitstreamBytes = null;
        field_u = null;
        field_F = null;
        field_k = null;
        field_N = null;
        field_o = null;
        field_D = null;
        workBlock = null;
        field_s = null;
        field_K = null;
        field_r = null;
        field_w = null;
        field_g = null;
        field_h = null;
        field_f = null;
        field_l = null;
    }

    private final float[] decodePacket(int packetIndex) {
        int var32_int = 0;
        int stackIn_3_0 = 0;
        int stackIn_7_0 = 0;
        int stackIn_10_0 = 0;
        int stackIn_22_0 = 0;
        float[] stackIn_40_0 = null;
        float[] stackIn_43_0 = null;
        float[] stackIn_46_0 = null;
        int[] stackIn_49_0 = null;
        Object stackIn_110_0 = null;
        Object stackIn_111_0 = null;
        int stackIn_111_1 = 0;
        int var2;
        int var3;
        int var4;
        int var5;
        int var6;
        int var7;
        int var8;
        int var9;
        int var10;
        int var11;
        int var12;
        int var13;
        we var14;
        int var15;
        int var16;
        int var17_int;
        Object var17;
        int var18_int;
        float[] var18;
        int var19;
        float[] var20_ref_float__;
        int var20;
        int var21_int;
        float[] var21;
        float[] var22;
        float[] var23;
        int[] var24;
        int var25;
        int var26;
        float var26_float;
        float var27;
        int var27_int;
        float var28;
        int var28_int;
        float var29;
        int var29_int;
        float var30;
        int var30_int;
        float var31;
        int var31_int;
        float var32;
        float var33;
        int var33_int;
        float var34;
        float var35;
        float var36;
        float var37;
        float var38;
        float var39;
        float[] var40;
        int var41;
        ui var42;
        int[] var44;
        float[] var45;
        float[] var46;
        int[] var48;
        float[] var49;
        float[] var50;
        float[] var52;
        MusicDecoder.setBitInput(this.packets[packetIndex], 0);
        MusicDecoder.readBit();
        var2 = MusicDecoder.readBits(hj.a((byte) 58, field_D.length - 1));
        var3 = field_o[var2] ? 1 : 0;
        if (var3 == 0) {
          stackIn_3_0 = shortBlockSize;
        } else {
          stackIn_3_0 = longBlockSize;
        }
        var4 = stackIn_3_0;
        var5 = 0;
        var6 = 0;
        if (var3 != 0) {
          if (MusicDecoder.readBit() == 0) {
            stackIn_7_0 = 0;
          } else {
            stackIn_7_0 = 1;
          }
          var5 = stackIn_7_0;
          if (MusicDecoder.readBit() == 0) {
            stackIn_10_0 = 0;
          } else {
            stackIn_10_0 = 1;
          }
          var6 = stackIn_10_0;
        }
        L4: {
          var7 = var4 >> 1;
          if (var3 != 0) {
            if (var5 == 0) {
              var8 = (var4 >> 2) - (shortBlockSize >> 2);
              var9 = (var4 >> 2) + (shortBlockSize >> 2);
              var10 = shortBlockSize >> 1;
              break L4;
            }
          }
          var8 = 0;
          var9 = var7;
          var10 = var4 >> 1;
        }
        L6: {
          if (var3 != 0) {
            if (var6 == 0) {
              var11 = var4 - (var4 >> 2) - (shortBlockSize >> 2);
              var12 = var4 - (var4 >> 2) + (shortBlockSize >> 2);
              var13 = shortBlockSize >> 1;
              break L6;
            }
          }
          var11 = var7;
          var12 = var4;
          var13 = var4 >> 1;
        }
        var14 = field_N[field_D[var2]];
        var16 = var14.field_a;
        var17_int = var14.field_c[var16];
        if (field_F[var17_int].b()) {
          stackIn_22_0 = 0;
        } else {
          stackIn_22_0 = 1;
        }
        var15 = stackIn_22_0;
        var16 = var15;
        for (var17_int = 0; var17_int < var14.field_b; var17_int++) {
          var42 = field_k[var14.field_d[var17_int]];
          var52 = workBlock;
          var42.a(var52, var4 >> 1, var16 != 0);
        }
        if (var15 == 0) {
          var17_int = var14.field_a;
          var18_int = var14.field_c[var17_int];
          field_F[var18_int].a(workBlock, var4 >> 1);
        }
        L11: {
          if (var15 == 0) {
            var17_int = var4 >> 1;
            var18_int = var4 >> 2;
            var19 = var4 >> 3;
            var49 = workBlock;
            var45 = var49;
            var20_ref_float__ = var45;
            for (var21_int = 0; var21_int < var17_int; var21_int++) {
              var20_ref_float__[var21_int] = var20_ref_float__[var21_int] * 0.5f;
            }
            var41 = var17_int;
            var21_int = var41;
            L13: while (var41 < var4) {
              var20_ref_float__[var41] = -var20_ref_float__[var4 - var41 - 1];
              var41++;
            }
            if (var3 == 0) {
              stackIn_40_0 = (float[]) (field_s);
            } else {
              stackIn_40_0 = (float[]) (field_w);
            }
            var21 = stackIn_40_0;
            if (var3 == 0) {
              stackIn_43_0 = (float[]) (field_K);
            } else {
              stackIn_43_0 = (float[]) (field_g);
            }
            var22 = stackIn_43_0;
            if (var3 == 0) {
              stackIn_46_0 = (float[]) (field_r);
            } else {
              stackIn_46_0 = (float[]) (field_h);
            }
            var23 = stackIn_46_0;
            if (var3 == 0) {
              stackIn_49_0 = (int[]) (field_f);
            } else {
              stackIn_49_0 = (int[]) (field_l);
            }
            var48 = stackIn_49_0;
            var44 = var48;
            var24 = var44;
            for (var25 = 0; var25 < var18_int; var25++) {
              var26_float = var20_ref_float__[4 * var25] - var20_ref_float__[var4 - 4 * var25 - 1];
              var27 = var20_ref_float__[4 * var25 + 2] - var20_ref_float__[var4 - 4 * var25 - 3];
              var28 = var21[2 * var25];
              var29 = var21[2 * var25 + 1];
              var20_ref_float__[var4 - 4 * var25 - 1] = var26_float * var28 - var27 * var29;
              var20_ref_float__[var4 - 4 * var25 - 3] = var26_float * var29 + var27 * var28;
            }
            for (var25 = 0; var25 < var19; var25++) {
              var26_float = var20_ref_float__[var17_int + 3 + 4 * var25];
              var27 = var20_ref_float__[var17_int + 1 + 4 * var25];
              var28 = var20_ref_float__[4 * var25 + 3];
              var29 = var20_ref_float__[4 * var25 + 1];
              var20_ref_float__[var17_int + 3 + 4 * var25] = var26_float + var28;
              var20_ref_float__[var17_int + 1 + 4 * var25] = var27 + var29;
              var30 = var21[var17_int - 4 - 4 * var25];
              var31 = var21[var17_int - 3 - 4 * var25];
              var20_ref_float__[4 * var25 + 3] = (var26_float - var28) * var30 - (var27 - var29) * var31;
              var20_ref_float__[4 * var25 + 1] = (var27 - var29) * var30 + (var26_float - var28) * var31;
            }
            var25 = hj.a((byte) 58, var4 - 1);
            for (var26 = 0; var26 < var25 - 3; var26++) {
              var27_int = var4 >> var26 + 2;
              var28_int = 8 << var26;
              for (var29_int = 0; var29_int < 2 << var26; var29_int++) {
                var30_int = var4 - var27_int * 2 * var29_int;
                var31_int = var4 - var27_int * (2 * var29_int + 1);
                for (var32_int = 0; var32_int < var4 >> var26 + 4; var32_int++) {
                  var33_int = 4 * var32_int;
                  var34 = var20_ref_float__[var30_int - 1 - var33_int];
                  var35 = var20_ref_float__[var30_int - 3 - var33_int];
                  var36 = var20_ref_float__[var31_int - 1 - var33_int];
                  var37 = var20_ref_float__[var31_int - 3 - var33_int];
                  var20_ref_float__[var30_int - 1 - var33_int] = var34 + var36;
                  var20_ref_float__[var30_int - 3 - var33_int] = var35 + var37;
                  var38 = var21[var32_int * var28_int];
                  var39 = var21[var32_int * var28_int + 1];
                  var20_ref_float__[var31_int - 1 - var33_int] = (var34 - var36) * var38 - (var35 - var37) * var39;
                  var20_ref_float__[var31_int - 3 - var33_int] = (var35 - var37) * var38 + (var34 - var36) * var39;
                }
              }
            }
            var26 = 1;
            L21: while (true) {
              if (var26 >= var19 - 1) {
                for (var26 = 0; var26 < var17_int; var26++) {
                  var20_ref_float__[var26] = var20_ref_float__[2 * var26 + 1];
                }
                for (var26 = 0; var26 < var19; var26++) {
                  var20_ref_float__[var4 - 1 - 2 * var26] = var20_ref_float__[4 * var26];
                  var20_ref_float__[var4 - 2 - 2 * var26] = var20_ref_float__[4 * var26 + 1];
                  var20_ref_float__[var4 - var18_int - 1 - 2 * var26] = var20_ref_float__[4 * var26 + 2];
                  var20_ref_float__[var4 - var18_int - 2 - 2 * var26] = var20_ref_float__[4 * var26 + 3];
                }
                for (var26 = 0; var26 < var19; var26++) {
                  var27 = var23[2 * var26];
                  var28 = var23[2 * var26 + 1];
                  var29 = var20_ref_float__[var17_int + 2 * var26];
                  var30 = var20_ref_float__[var17_int + 2 * var26 + 1];
                  var31 = var20_ref_float__[var4 - 2 - 2 * var26];
                  var32 = var20_ref_float__[var4 - 1 - 2 * var26];
                  var33 = var28 * (var29 - var31) + var27 * (var30 + var32);
                  var20_ref_float__[var17_int + 2 * var26] = (var29 + var31 + var33) * 0.5f;
                  var20_ref_float__[var4 - 2 - 2 * var26] = (var29 + var31 - var33) * 0.5f;
                  var33 = var28 * (var30 + var32) - var27 * (var29 - var31);
                  var20_ref_float__[var17_int + 2 * var26 + 1] = (var30 - var32 + var33) * 0.5f;
                  var20_ref_float__[var4 - 1 - 2 * var26] = (-var30 + var32 + var33) * 0.5f;
                }
                for (var26 = 0; var26 < var18_int; var26++) {
                  var20_ref_float__[var26] = var20_ref_float__[2 * var26 + var17_int] * var22[2 * var26] + var20_ref_float__[2 * var26 + 1 + var17_int] * var22[2 * var26 + 1];
                  var20_ref_float__[var17_int - 1 - var26] = var20_ref_float__[2 * var26 + var17_int] * var22[2 * var26 + 1] - var20_ref_float__[2 * var26 + 1 + var17_int] * var22[2 * var26];
                }
                for (var26 = 0; var26 < var18_int; var26++) {
                  var20_ref_float__[var4 - var18_int + var26] = -var49[var26];
                }
                for (var26 = 0; var26 < var18_int; var26++) {
                  var20_ref_float__[var26] = var20_ref_float__[var18_int + var26];
                }
                for (var26 = 0; var26 < var18_int; var26++) {
                  var20_ref_float__[var18_int + var26] = -var20_ref_float__[var18_int - var26 - 1];
                }
                for (var26 = 0; var26 < var18_int; var26++) {
                  var20_ref_float__[var17_int + var26] = var20_ref_float__[var4 - var26 - 1];
                }
                for (var26 = var8; var26 < var9; var26++) {
                  var27 = (float)Math.sin(((double)(var26 - var8) + 0.5) / (double)var10 * 0.5 * 3.141592653589793);
                  workBlock[var26] = workBlock[var26] * (float)Math.sin(1.5707963267948966 * (double)var27 * (double)var27);
                }
                for (var26 = var11; var26 < var12; var26++) {
                  var27 = (float)Math.sin(((double)(var26 - var11) + 0.5) / (double)var13 * 0.5 * 3.141592653589793 + 1.5707963267948966);
                  workBlock[var26] = workBlock[var26] * (float)Math.sin(1.5707963267948966 * (double)var27 * (double)var27);
                }
                break L11;
              } else {
                var27_int = var48[var26];
                if (var26 < var27_int) {
                  var28_int = 8 * var26;
                  var29_int = 8 * var27_int;
                  var30 = var20_ref_float__[var28_int + 1];
                  var20_ref_float__[var28_int + 1] = var20_ref_float__[var29_int + 1];
                  var20_ref_float__[var29_int + 1] = var30;
                  var30 = var20_ref_float__[var28_int + 3];
                  var20_ref_float__[var28_int + 3] = var20_ref_float__[var29_int + 3];
                  var20_ref_float__[var29_int + 3] = var30;
                  var30 = var20_ref_float__[var28_int + 5];
                  var20_ref_float__[var28_int + 5] = var20_ref_float__[var29_int + 5];
                  var20_ref_float__[var29_int + 5] = var30;
                  var30 = var20_ref_float__[var28_int + 7];
                  var20_ref_float__[var28_int + 7] = var20_ref_float__[var29_int + 7];
                  var20_ref_float__[var29_int + 7] = var30;
                  var26++;
                  continue L21;
                } else {
                  var26++;
                  continue L21;
                }
              }
            }
          } else {
            for (var17_int = var4 >> 1; var17_int < var4; var17_int++) {
              workBlock[var17_int] = 0.0f;
            }
            break L11;
          }
        }
        L35: {
          var17 = null;
          if (this.previousBlockSize > 0) {
            L36: {
              var18_int = this.previousBlockSize + var4 >> 2;
              var50 = new float[var18_int];
              var46 = var50;
              var40 = var46;
              var17 = var40;
              if (!this.field_i) {
                for (var19 = 0; var19 < this.field_m; var19++) {
                  var20 = (this.previousBlockSize >> 1) + var19;
                  var40[var19] = var40[var19] + this.previousBlock[var20];
                }
                break L36;
              }
            }
            if (var15 == 0) {
              for (var19 = var8; var19 < var4 >> 1; var19++) {
                var20 = var50.length - (var4 >> 1) + var19;
                var40[var20] = var40[var20] + workBlock[var19];
              }
              break L35;
            }
          }
        }
        var18 = this.previousBlock;
        this.previousBlock = workBlock;
        workBlock = var18;
        this.previousBlockSize = var4;
        this.field_m = var12 - (var4 >> 1);
        stackIn_110_0 = this;

        if (var15 == 0) {
          stackIn_111_0 = this;
          stackIn_111_1 = 0;
        } else {
          stackIn_111_0 = this;
          stackIn_111_1 = 1;
        }
        ((MusicDecoder) (this)).field_i = stackIn_111_1 != 0;
        return (float[]) (var17);
    }

    private final static boolean a(rh param0) {
        byte[] var1 = null;
        if (!field_z) {
            var1 = param0.a(0, -28153, 0);
            if (var1 == null) {
                return false;
            }
            MusicDecoder.a(var1);
        }
        return true;
    }

    private MusicDecoder(byte[] param0) throws IOException {
        this.readPacketContainer(param0);
    }

    static {
        field_z = false;
    }
}
