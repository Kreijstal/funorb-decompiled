/*
 * Decompiled by CFR-JS 0.4.0.
 */
import java.io.*;

final class MusicDecoder_ua extends hf {
    private boolean field_A;
    private static int[] field_l;
    private static ui[] field_k;
    private int sampleCount_field_H;
    private static int[] field_f;
    static ae[] field_u;
    private static int shortBlockSize_field_v;
    private static float[] workBlock_field_B;
    private static boolean[] field_o;
    private static float[] field_g;
    private boolean field_i;
    private static int bitCursor_field_j;
    private static int byteCursor_field_y;
    private static we[] field_N;
    private static float[] field_K;
    private static float[] field_r;
    private int field_m;
    private int pcmWriteCursor_field_J;
    private static float[] field_w;
    private byte[] pcmBytes_field_E;
    private float[] previousBlock_field_C;
    private static int[] field_D;
    private static float[] field_s;
    private static int longBlockSize_field_t;
    private int field_I;
    private byte[][] packets_field_p;
    private static MusicDecodeStage_u[] field_F;
    private static float[] field_h;
    private static boolean field_z;
    private int field_q;
    private static byte[] bitstreamBytes_field_L;
    private int previousBlockSize_field_M;
    private int packetCursor_field_x;
    private int field_n;

    private final static void setBitInput_a(byte[] inputBytes_param0, int startByte_param1) {
        bitstreamBytes_field_L = inputBytes_param0;
        byteCursor_field_y = startByte_param1;
        bitCursor_field_j = 0;
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

    final static MusicDecoder_ua a(rh param0, int param1, int param2) {
        try {
            MusicDecoder_ua var4_ref = null;
            if (!MusicDecoder_ua.a(param0)) {
                param0.a((byte) 37, param1, param2);
                return null;
            }
            byte[] var3 = param0.a(param1, -28153, param2);
            if (var3 == null) {
                return null;
            }
            Object var4 = null;
            try {
                var4_ref = new MusicDecoder_ua(var3);
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

    final gd decodePcmBudgeted_a(int[] sampleBudget_param0) {
        int incrementValue$0 = 0;
        int writePosition_var3;
        int samplesToWrite_var4;
        int sampleIndex_var5;
        int unsignedPcmSample_var6;
        float[] decodedSamples_var7;
        byte[] completedPcm_var12;
        L0: {
          if (sampleBudget_param0 == null) {
            break L0;
          } else {
            if (sampleBudget_param0[0] > 0) {
              break L0;
            } else {
              return null;
            }
          }
        }
        L1: {
          if (this.pcmBytes_field_E != null) {
            break L1;
          } else {
            this.previousBlockSize_field_M = 0;
            this.previousBlock_field_C = new float[longBlockSize_field_t];
            this.pcmBytes_field_E = new byte[this.sampleCount_field_H];
            this.pcmWriteCursor_field_J = 0;
            this.packetCursor_field_x = 0;
            break L1;
          }
        }
        L2: while (true) {
          if (this.packetCursor_field_x >= this.packets_field_p.length) {
            this.previousBlock_field_C = null;
            completedPcm_var12 = this.pcmBytes_field_E;
            this.pcmBytes_field_E = null;
            return new gd(this.field_q, completedPcm_var12, this.field_I, this.field_n, this.field_A);
          } else {
            L3: {
              if (sampleBudget_param0 == null) {
                break L3;
              } else {
                if (sampleBudget_param0[0] > 0) {
                  break L3;
                } else {
                  return null;
                }
              }
            }
            L4: {
              decodedSamples_var7 = this.decodePacket_c(this.packetCursor_field_x);
              if (decodedSamples_var7 == null) {
                break L4;
              } else {
                L5: {
                  writePosition_var3 = this.pcmWriteCursor_field_J;
                  samplesToWrite_var4 = decodedSamples_var7.length;
                  if (samplesToWrite_var4 <= this.sampleCount_field_H - writePosition_var3) {
                    break L5;
                  } else {
                    samplesToWrite_var4 = this.sampleCount_field_H - writePosition_var3;
                    break L5;
                  }
                }
                sampleIndex_var5 = 0;
                L6: while (true) {
                  if (sampleIndex_var5 >= samplesToWrite_var4) {
                    L7: {
                      if (sampleBudget_param0 == null) {
                        break L7;
                      } else {
                        sampleBudget_param0[0] = sampleBudget_param0[0] - (writePosition_var3 - this.pcmWriteCursor_field_J);
                        break L7;
                      }
                    }
                    this.pcmWriteCursor_field_J = writePosition_var3;
                    break L4;
                  } else {
                    L8: {
                      unsignedPcmSample_var6 = (int)(128.0f + decodedSamples_var7[sampleIndex_var5] * 128.0f);
                      if ((unsignedPcmSample_var6 & -256) == 0) {
                        break L8;
                      } else {
                        unsignedPcmSample_var6 = (unsignedPcmSample_var6 ^ -1) >> 31;
                        break L8;
                      }
                    }
                    incrementValue$0 = writePosition_var3;
                    writePosition_var3++;
                    this.pcmBytes_field_E[incrementValue$0] = (byte)(unsignedPcmSample_var6 - 128);
                    sampleIndex_var5++;
                    continue L6;
                  }
                }
              }
            }
            this.packetCursor_field_x = this.packetCursor_field_x + 1;
            continue L2;
          }
        }
    }

    final static int readBit_b() {
        int bitValue_var0 = bitstreamBytes_field_L[byteCursor_field_y] >> bitCursor_field_j & 1;
        bitCursor_field_j = bitCursor_field_j + 1;
        byteCursor_field_y = byteCursor_field_y + (bitCursor_field_j >> 3);
        bitCursor_field_j = bitCursor_field_j & 7;
        return bitValue_var0;
    }

    final static int readBits_b(int bitCount_param0) {
        int chunkMask_var4 = 0;
        int chunkBitsThenMask_var3 = 0;
        int value_var1 = 0;
        int outputShift_var2 = 0;
        while (bitCount_param0 >= 8 - bitCursor_field_j) {
            chunkBitsThenMask_var3 = 8 - bitCursor_field_j;
            chunkMask_var4 = (1 << chunkBitsThenMask_var3) - 1;
            value_var1 = value_var1 + ((bitstreamBytes_field_L[byteCursor_field_y] >> bitCursor_field_j & chunkMask_var4) << outputShift_var2);
            bitCursor_field_j = 0;
            byteCursor_field_y = byteCursor_field_y + 1;
            outputShift_var2 = outputShift_var2 + chunkBitsThenMask_var3;
            bitCount_param0 = bitCount_param0 - chunkBitsThenMask_var3;
        }
        if (bitCount_param0 > 0) {
            chunkBitsThenMask_var3 = (1 << bitCount_param0) - 1;
            value_var1 = value_var1 + ((bitstreamBytes_field_L[byteCursor_field_y] >> bitCursor_field_j & chunkBitsThenMask_var3) << outputShift_var2);
            bitCursor_field_j = bitCursor_field_j + bitCount_param0;
        }
        return value_var1;
    }

    final static MusicDecoder_ua a(rh param0, String param1, String param2) {
        try {
            MusicDecoder_ua var4_ref = null;
            if (!MusicDecoder_ua.a(param0)) {
                param0.a((byte) 113, param2, param1);
                return null;
            }
            byte[] var3 = param0.a(0, param2, param1);
            if (var3 == null) {
                return null;
            }
            Object var4 = null;
            try {
                var4_ref = new MusicDecoder_ua(var3);
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

    private final void readPacketContainer_b(byte[] containerBytes_param0) throws IOException {
        int var4 = 0;
        int var5 = 0;
        int var6_int = 0;
        byte[] var6 = null;
        qc var2 = new qc(containerBytes_param0);
        this.field_q = var2.a((byte) -53);
        this.sampleCount_field_H = var2.a((byte) -128);
        this.field_I = var2.a((byte) -128);
        this.field_n = var2.a((byte) -89);
        if (this.field_n < 0) {
            this.field_n = this.field_n ^ -1;
            this.field_A = true;
        }
        int var3 = var2.a((byte) -108);
        if (var3 < 0) {
            throw new IOException();
        }
        this.packets_field_p = new byte[var3][];
        for (var4 = 0; var4 < var3; var4++) {
            var5 = 0;
            do {
                var6_int = var2.c((byte) 34);
                var5 = var5 + var6_int;
            } while (var6_int >= 255);
            var6 = new byte[var5];
            var2.b(29915, var5, var6, 0);
            this.packets_field_p[var4] = var6;
        }
    }

    final gd decodePcm_c() {
        int incrementValue$0 = 0;
        byte[] var1;
        int var2;
        int var3;
        float[] var4;
        int var5;
        int var6;
        int var7;
        this.previousBlockSize_field_M = 0;
        this.previousBlock_field_C = new float[longBlockSize_field_t];
        var1 = new byte[this.sampleCount_field_H];
        var2 = 0;
        var3 = 0;
        L0: while (true) {
          if (var3 >= this.packets_field_p.length) {
            this.previousBlock_field_C = null;
            return new gd(this.field_q, var1, this.field_I, this.field_n, this.field_A);
          } else {
            var4 = this.decodePacket_c(var3);
            if (var4 != null) {
              L1: {
                var5 = var4.length;
                if (var5 <= this.sampleCount_field_H - var2) {
                  break L1;
                } else {
                  var5 = this.sampleCount_field_H - var2;
                  break L1;
                }
              }
              var6 = 0;
              L2: while (true) {
                if (var6 < var5) {
                  L3: {
                    var7 = (int)(128.0f + var4[var6] * 128.0f);
                    if ((var7 & -256) == 0) {
                      break L3;
                    } else {
                      var7 = (var7 ^ -1) >> 31;
                      break L3;
                    }
                  }
                  incrementValue$0 = var2;
                  var2++;
                  var1[incrementValue$0] = (byte)(var7 - 128);
                  var6++;
                  continue L2;
                } else {
                  var3++;
                  continue L0;
                }
              }
            } else {
              var3++;
              continue L0;
            }
          }
        }
    }

    final static void a(byte[] param0) {
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
        int var6;
        float[] var6_ref_float__;
        int var7_int;
        float[] var7;
        int var8_int;
        float[] var8;
        int var9_int;
        int[] var9;
        int var10;
        int var11;
        MusicDecoder_ua.setBitInput_a(param0, 0);
        shortBlockSize_field_v = 1 << MusicDecoder_ua.readBits_b(4);
        longBlockSize_field_t = 1 << MusicDecoder_ua.readBits_b(4);
        workBlock_field_B = new float[longBlockSize_field_t];
        var1 = 0;
        L0: while (true) {
          if (var1 >= 2) {
            var1 = MusicDecoder_ua.readBits_b(8) + 1;
            field_u = new ae[var1];
            var2 = 0;
            L1: while (true) {
              if (var2 >= var1) {
                var2 = MusicDecoder_ua.readBits_b(6) + 1;
                var3 = 0;
                L2: while (true) {
                  if (var3 >= var2) {
                    var2 = MusicDecoder_ua.readBits_b(6) + 1;
                    field_F = new MusicDecodeStage_u[var2];
                    var3 = 0;
                    L3: while (true) {
                      if (var3 >= var2) {
                        var3 = MusicDecoder_ua.readBits_b(6) + 1;
                        field_k = new ui[var3];
                        var4 = 0;
                        L4: while (true) {
                          if (var4 >= var3) {
                            var4 = MusicDecoder_ua.readBits_b(6) + 1;
                            field_N = new we[var4];
                            var5 = 0;
                            L5: while (true) {
                              if (var5 >= var4) {
                                var5 = MusicDecoder_ua.readBits_b(6) + 1;
                                field_o = new boolean[var5];
                                field_D = new int[var5];
                                var6 = 0;
                                L6: while (true) {
                                  if (var6 >= var5) {
                                    field_z = true;
                                    return;
                                  } else {
                                    L7: {
                                      stackIn_39_0 = (boolean[]) (field_o);

                                      stackIn_39_1 = var6;

                                      if (MusicDecoder_ua.readBit_b() == 0) {
                                        stackIn_40_0 = (boolean[]) ((Object) stackIn_39_0);
                                        stackIn_40_1 = stackIn_39_1;
                                        stackIn_40_2 = 0;
                                        break L7;
                                      } else {
                                        stackIn_40_0 = (boolean[]) ((Object) stackIn_39_0);
                                        stackIn_40_1 = stackIn_39_1;
                                        stackIn_40_2 = 1;
                                        break L7;
                                      }
                                    }
                                    stackIn_40_0[stackIn_40_1] = stackIn_40_2 != 0;
                                    MusicDecoder_ua.readBits_b(16);
                                    MusicDecoder_ua.readBits_b(16);
                                    field_D[var6] = MusicDecoder_ua.readBits_b(8);
                                    var6++;
                                    continue L6;
                                  }
                                }
                              } else {
                                field_N[var5] = new we();
                                var5++;
                                continue L5;
                              }
                            }
                          } else {
                            field_k[var4] = new ui();
                            var4++;
                            continue L4;
                          }
                        }
                      } else {
                        field_F[var3] = new MusicDecodeStage_u();
                        var3++;
                        continue L3;
                      }
                    }
                  } else {
                    MusicDecoder_ua.readBits_b(16);
                    var3++;
                    continue L2;
                  }
                }
              } else {
                field_u[var2] = new ae();
                var2++;
                continue L1;
              }
            }
          } else {
            L8: {
              if (var1 == 0) {
                stackIn_5_0 = shortBlockSize_field_v;
                break L8;
              } else {
                stackIn_5_0 = longBlockSize_field_t;
                break L8;
              }
            }
            var2 = stackIn_5_0;
            var3 = var2 >> 1;
            var4 = var2 >> 2;
            var5 = var2 >> 3;
            var6_ref_float__ = new float[var3];
            var7_int = 0;
            L9: while (true) {
              if (var7_int >= var4) {
                var7 = new float[var3];
                var8_int = 0;
                L10: while (true) {
                  if (var8_int >= var4) {
                    var8 = new float[var4];
                    var9_int = 0;
                    L11: while (true) {
                      if (var9_int >= var5) {
                        var9 = new int[var5];
                        var10 = hj.a((byte) 58, var5 - 1);
                        var11 = 0;
                        L12: while (true) {
                          if (var11 >= var5) {
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
                          } else {
                            var9[var11] = nd.a(var11, 0, var10);
                            var11++;
                            continue L12;
                          }
                        }
                      } else {
                        var8[2 * var9_int] = (float)Math.cos((double)(4 * var9_int + 2) * 3.141592653589793 / (double)var2);
                        var8[2 * var9_int + 1] = -(float)Math.sin((double)(4 * var9_int + 2) * 3.141592653589793 / (double)var2);
                        var9_int++;
                        continue L11;
                      }
                    }
                  } else {
                    var7[2 * var8_int] = (float)Math.cos((double)(2 * var8_int + 1) * 3.141592653589793 / (double)(2 * var2));
                    var7[2 * var8_int + 1] = (float)Math.sin((double)(2 * var8_int + 1) * 3.141592653589793 / (double)(2 * var2));
                    var8_int++;
                    continue L10;
                  }
                }
              } else {
                var6_ref_float__[2 * var7_int] = (float)Math.cos((double)(4 * var7_int) * 3.141592653589793 / (double)var2);
                var6_ref_float__[2 * var7_int + 1] = -(float)Math.sin((double)(4 * var7_int) * 3.141592653589793 / (double)var2);
                var7_int++;
                continue L9;
              }
            }
          }
        }
    }

    public static void a() {
        bitstreamBytes_field_L = null;
        field_u = null;
        field_F = null;
        field_k = null;
        field_N = null;
        field_o = null;
        field_D = null;
        workBlock_field_B = null;
        field_s = null;
        field_K = null;
        field_r = null;
        field_w = null;
        field_g = null;
        field_h = null;
        field_f = null;
        field_l = null;
    }

    private final float[] decodePacket_c(int packetIndex_param0) {
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
        int var32_int;
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
        L0: {
          MusicDecoder_ua.setBitInput_a(this.packets_field_p[packetIndex_param0], 0);
          MusicDecoder_ua.readBit_b();
          var2 = MusicDecoder_ua.readBits_b(hj.a((byte) 58, field_D.length - 1));
          var3 = field_o[var2] ? 1 : 0;
          if (var3 == 0) {
            stackIn_3_0 = shortBlockSize_field_v;
            break L0;
          } else {
            stackIn_3_0 = longBlockSize_field_t;
            break L0;
          }
        }
        L1: {
          var4 = stackIn_3_0;
          var5 = 0;
          var6 = 0;
          if (var3 == 0) {
            break L1;
          } else {
            L2: {
              if (MusicDecoder_ua.readBit_b() == 0) {
                stackIn_7_0 = 0;
                break L2;
              } else {
                stackIn_7_0 = 1;
                break L2;
              }
            }
            L3: {
              var5 = stackIn_7_0;
              if (MusicDecoder_ua.readBit_b() == 0) {
                stackIn_10_0 = 0;
                break L3;
              } else {
                stackIn_10_0 = 1;
                break L3;
              }
            }
            var6 = stackIn_10_0;
            break L1;
          }
        }
        L4: {
          L5: {
            var7 = var4 >> 1;
            if (var3 == 0) {
              break L5;
            } else {
              if (var5 != 0) {
                break L5;
              } else {
                var8 = (var4 >> 2) - (shortBlockSize_field_v >> 2);
                var9 = (var4 >> 2) + (shortBlockSize_field_v >> 2);
                var10 = shortBlockSize_field_v >> 1;
                break L4;
              }
            }
          }
          var8 = 0;
          var9 = var7;
          var10 = var4 >> 1;
          break L4;
        }
        L6: {
          L7: {
            if (var3 == 0) {
              break L7;
            } else {
              if (var6 != 0) {
                break L7;
              } else {
                var11 = var4 - (var4 >> 2) - (shortBlockSize_field_v >> 2);
                var12 = var4 - (var4 >> 2) + (shortBlockSize_field_v >> 2);
                var13 = shortBlockSize_field_v >> 1;
                break L6;
              }
            }
          }
          var11 = var7;
          var12 = var4;
          var13 = var4 >> 1;
          break L6;
        }
        L8: {
          var14 = field_N[field_D[var2]];
          var16 = var14.field_a;
          var17_int = var14.field_c[var16];
          if (field_F[var17_int].b()) {
            stackIn_22_0 = 0;
            break L8;
          } else {
            stackIn_22_0 = 1;
            break L8;
          }
        }
        var15 = stackIn_22_0;
        var16 = var15;
        var17_int = 0;
        L9: while (true) {
          if (var17_int >= var14.field_b) {
            L10: {
              if (var15 != 0) {
                break L10;
              } else {
                var17_int = var14.field_a;
                var18_int = var14.field_c[var17_int];
                field_F[var18_int].a(workBlock_field_B, var4 >> 1);
                break L10;
              }
            }
            L11: {
              if (var15 == 0) {
                var17_int = var4 >> 1;
                var18_int = var4 >> 2;
                var19 = var4 >> 3;
                var49 = workBlock_field_B;
                var45 = var49;
                var20_ref_float__ = var45;
                var21_int = 0;
                L12: while (true) {
                  if (var21_int >= var17_int) {
                    var41 = var17_int;
                    var21_int = var41;
                    L13: while (true) {
                      if (var41 >= var4) {
                        L14: {
                          if (var3 == 0) {
                            stackIn_40_0 = (float[]) (field_s);
                            break L14;
                          } else {
                            stackIn_40_0 = (float[]) (field_w);
                            break L14;
                          }
                        }
                        L15: {
                          var21 = stackIn_40_0;
                          if (var3 == 0) {
                            stackIn_43_0 = (float[]) (field_K);
                            break L15;
                          } else {
                            stackIn_43_0 = (float[]) (field_g);
                            break L15;
                          }
                        }
                        L16: {
                          var22 = stackIn_43_0;
                          if (var3 == 0) {
                            stackIn_46_0 = (float[]) (field_r);
                            break L16;
                          } else {
                            stackIn_46_0 = (float[]) (field_h);
                            break L16;
                          }
                        }
                        L17: {
                          var23 = stackIn_46_0;
                          if (var3 == 0) {
                            stackIn_49_0 = (int[]) (field_f);
                            break L17;
                          } else {
                            stackIn_49_0 = (int[]) (field_l);
                            break L17;
                          }
                        }
                        var48 = stackIn_49_0;
                        var44 = var48;
                        var24 = var44;
                        var25 = 0;
                        L18: while (true) {
                          if (var25 >= var18_int) {
                            var25 = 0;
                            L19: while (true) {
                              if (var25 >= var19) {
                                var25 = hj.a((byte) 58, var4 - 1);
                                var26 = 0;
                                L20: while (true) {
                                  if (var26 >= var25 - 3) {
                                    var26 = 1;
                                    L21: while (true) {
                                      if (var26 >= var19 - 1) {
                                        var26 = 0;
                                        L22: while (true) {
                                          if (var26 >= var17_int) {
                                            var26 = 0;
                                            L23: while (true) {
                                              if (var26 >= var19) {
                                                var26 = 0;
                                                L24: while (true) {
                                                  if (var26 >= var19) {
                                                    var26 = 0;
                                                    L25: while (true) {
                                                      if (var26 >= var18_int) {
                                                        var26 = 0;
                                                        L26: while (true) {
                                                          if (var26 >= var18_int) {
                                                            var26 = 0;
                                                            L27: while (true) {
                                                              if (var26 >= var18_int) {
                                                                var26 = 0;
                                                                L28: while (true) {
                                                                  if (var26 >= var18_int) {
                                                                    var26 = 0;
                                                                    L29: while (true) {
                                                                      if (var26 >= var18_int) {
                                                                        var26 = var8;
                                                                        L30: while (true) {
                                                                          if (var26 >= var9) {
                                                                            var26 = var11;
                                                                            L31: while (true) {
                                                                              if (var26 >= var12) {
                                                                                break L11;
                                                                              } else {
                                                                                var27 = (float)Math.sin(((double)(var26 - var11) + 0.5) / (double)var13 * 0.5 * 3.141592653589793 + 1.5707963267948966);
                                                                                workBlock_field_B[var26] = workBlock_field_B[var26] * (float)Math.sin(1.5707963267948966 * (double)var27 * (double)var27);
                                                                                var26++;
                                                                                continue L31;
                                                                              }
                                                                            }
                                                                          } else {
                                                                            var27 = (float)Math.sin(((double)(var26 - var8) + 0.5) / (double)var10 * 0.5 * 3.141592653589793);
                                                                            workBlock_field_B[var26] = workBlock_field_B[var26] * (float)Math.sin(1.5707963267948966 * (double)var27 * (double)var27);
                                                                            var26++;
                                                                            continue L30;
                                                                          }
                                                                        }
                                                                      } else {
                                                                        var20_ref_float__[var17_int + var26] = var20_ref_float__[var4 - var26 - 1];
                                                                        var26++;
                                                                        continue L29;
                                                                      }
                                                                    }
                                                                  } else {
                                                                    var20_ref_float__[var18_int + var26] = -var20_ref_float__[var18_int - var26 - 1];
                                                                    var26++;
                                                                    continue L28;
                                                                  }
                                                                }
                                                              } else {
                                                                var20_ref_float__[var26] = var20_ref_float__[var18_int + var26];
                                                                var26++;
                                                                continue L27;
                                                              }
                                                            }
                                                          } else {
                                                            var20_ref_float__[var4 - var18_int + var26] = -var49[var26];
                                                            var26++;
                                                            continue L26;
                                                          }
                                                        }
                                                      } else {
                                                        var20_ref_float__[var26] = var20_ref_float__[2 * var26 + var17_int] * var22[2 * var26] + var20_ref_float__[2 * var26 + 1 + var17_int] * var22[2 * var26 + 1];
                                                        var20_ref_float__[var17_int - 1 - var26] = var20_ref_float__[2 * var26 + var17_int] * var22[2 * var26 + 1] - var20_ref_float__[2 * var26 + 1 + var17_int] * var22[2 * var26];
                                                        var26++;
                                                        continue L25;
                                                      }
                                                    }
                                                  } else {
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
                                                    var26++;
                                                    continue L24;
                                                  }
                                                }
                                              } else {
                                                var20_ref_float__[var4 - 1 - 2 * var26] = var20_ref_float__[4 * var26];
                                                var20_ref_float__[var4 - 2 - 2 * var26] = var20_ref_float__[4 * var26 + 1];
                                                var20_ref_float__[var4 - var18_int - 1 - 2 * var26] = var20_ref_float__[4 * var26 + 2];
                                                var20_ref_float__[var4 - var18_int - 2 - 2 * var26] = var20_ref_float__[4 * var26 + 3];
                                                var26++;
                                                continue L23;
                                              }
                                            }
                                          } else {
                                            var20_ref_float__[var26] = var20_ref_float__[2 * var26 + 1];
                                            var26++;
                                            continue L22;
                                          }
                                        }
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
                                    var27_int = var4 >> var26 + 2;
                                    var28_int = 8 << var26;
                                    var29_int = 0;
                                    L32: while (true) {
                                      if (var29_int >= 2 << var26) {
                                        var26++;
                                        continue L20;
                                      } else {
                                        var30_int = var4 - var27_int * 2 * var29_int;
                                        var31_int = var4 - var27_int * (2 * var29_int + 1);
                                        var32_int = 0;
                                        L33: while (true) {
                                          if (var32_int >= var4 >> var26 + 4) {
                                            var29_int++;
                                            continue L32;
                                          } else {
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
                                            var32_int++;
                                            continue L33;
                                          }
                                        }
                                      }
                                    }
                                  }
                                }
                              } else {
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
                                var25++;
                                continue L19;
                              }
                            }
                          } else {
                            var26_float = var20_ref_float__[4 * var25] - var20_ref_float__[var4 - 4 * var25 - 1];
                            var27 = var20_ref_float__[4 * var25 + 2] - var20_ref_float__[var4 - 4 * var25 - 3];
                            var28 = var21[2 * var25];
                            var29 = var21[2 * var25 + 1];
                            var20_ref_float__[var4 - 4 * var25 - 1] = var26_float * var28 - var27 * var29;
                            var20_ref_float__[var4 - 4 * var25 - 3] = var26_float * var29 + var27 * var28;
                            var25++;
                            continue L18;
                          }
                        }
                      } else {
                        var20_ref_float__[var41] = -var20_ref_float__[var4 - var41 - 1];
                        var41++;
                        continue L13;
                      }
                    }
                  } else {
                    var20_ref_float__[var21_int] = var20_ref_float__[var21_int] * 0.5f;
                    var21_int++;
                    continue L12;
                  }
                }
              } else {
                var17_int = var4 >> 1;
                L34: while (true) {
                  if (var17_int >= var4) {
                    break L11;
                  } else {
                    workBlock_field_B[var17_int] = 0.0f;
                    var17_int++;
                    continue L34;
                  }
                }
              }
            }
            L35: {
              var17 = null;
              if (this.previousBlockSize_field_M <= 0) {
                break L35;
              } else {
                L36: {
                  var18_int = this.previousBlockSize_field_M + var4 >> 2;
                  var50 = new float[var18_int];
                  var46 = var50;
                  var40 = var46;
                  var17 = var40;
                  if (this.field_i) {
                    break L36;
                  } else {
                    var19 = 0;
                    L37: while (true) {
                      if (var19 >= this.field_m) {
                        break L36;
                      } else {
                        var20 = (this.previousBlockSize_field_M >> 1) + var19;
                        var40[var19] = var40[var19] + this.previousBlock_field_C[var20];
                        var19++;
                        continue L37;
                      }
                    }
                  }
                }
                if (var15 != 0) {
                  break L35;
                } else {
                  var19 = var8;
                  L38: while (true) {
                    if (var19 >= var4 >> 1) {
                      break L35;
                    } else {
                      var20 = var50.length - (var4 >> 1) + var19;
                      var40[var20] = var40[var20] + workBlock_field_B[var19];
                      var19++;
                      continue L38;
                    }
                  }
                }
              }
            }
            L39: {
              var18 = this.previousBlock_field_C;
              this.previousBlock_field_C = workBlock_field_B;
              workBlock_field_B = var18;
              this.previousBlockSize_field_M = var4;
              this.field_m = var12 - (var4 >> 1);
              stackIn_110_0 = this;

              if (var15 == 0) {
                stackIn_111_0 = this;
                stackIn_111_1 = 0;
                break L39;
              } else {
                stackIn_111_0 = this;
                stackIn_111_1 = 1;
                break L39;
              }
            }
            ((MusicDecoder_ua) (this)).field_i = stackIn_111_1 != 0;
            return (float[]) (var17);
          } else {
            var42 = field_k[var14.field_d[var17_int]];
            var52 = workBlock_field_B;
            var42.a(var52, var4 >> 1, var16 != 0);
            var17_int++;
            continue L9;
          }
        }
    }

    private final static boolean a(rh param0) {
        byte[] var1 = null;
        if (!field_z) {
            var1 = param0.a(0, -28153, 0);
            if (var1 == null) {
                return false;
            }
            MusicDecoder_ua.a(var1);
        }
        return true;
    }

    private MusicDecoder_ua(byte[] param0) throws IOException {
        this.readPacketContainer_b(param0);
    }

    static {
        field_z = false;
    }
}
