/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class MusicPatch extends IntrusiveNode {
    int gain;
    static PlayerNameChooserPanel field_o;
    MusicEnvelope[] envelopes;
    static String field_q;
    short[] pitchOffsets;
    byte[] volume;
    static int pointerX;
    static String field_m;
    byte[] exclusiveGroups;
    private int[] sampleCodes;
    PcmSound[] samples;
    static String field_n;
    byte[] pan;

    final boolean loadSamples(byte[] usedNotes, byte obfuscationGuard, SoundCache soundCache, int[] budget) {
        int var8 = 0;
        int stackIn_24_0 = 0;
        RuntimeException stackIn_27_0 = null;
        StringBuilder stackIn_27_1 = null;
        String stackIn_28_2 = null;
        StringBuilder stackIn_30_1 = null;
        String stackIn_31_2 = null;
        StringBuilder stackIn_33_1 = null;
        String stackIn_34_2 = null;
        RuntimeException decompiledCaughtException = null;
        int var5_int = 0;
        RuntimeException var5 = null;
        int var6 = 0;
        Object var7 = null;
        int var9 = 0;
        int var10 = 0;
        String var11 = null;
        var10 = BrickABrac.field_J ? 1 : 0;
        try {
          var5_int = 1;
          if (obfuscationGuard >= -48) {
            var11 = (String) null;
            MusicPatch.a(121, (String) null, false);
          }
          var6 = 0;
          var7 = null;
          for (var8 = 0; var8 < 128; var8++) {
            if (usedNotes == null ||
              usedNotes[var8] != 0) {
              var9 = this.sampleCodes[var8];
              if (0 != var9) {
                if (var6 != var9) {
                  var6 = var9;
                  var9--;
                  if ((var9 & 1) != 0) {
                    var7 = soundCache.getMusicSampleById(var9 >> 2, budget, 92);
                  } else {
                    var7 = soundCache.getSoundEffectById(budget, var9 >> 2, -127);
                  }
                  if (var7 == null) {
                    var5_int = 0;
                  }
                }
                if (var7 != null) {
                  this.samples[var8] = (PcmSound) (var7);
                  this.sampleCodes[var8] = 0;
                }
              }
            }
          }
          stackIn_24_0 = var5_int;
          return stackIn_24_0 != 0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var5 = decompiledCaughtException;
          stackIn_27_0 = var5;
          stackIn_27_1 = new StringBuilder().append("pq.E(");
          if (usedNotes == null) {
            stackIn_28_2 = "null";
          } else {
            stackIn_28_2 = "{...}";
          }
          stackIn_30_1 = ((StringBuilder) (Object) stackIn_27_1).append(stackIn_28_2).append(',').append(obfuscationGuard).append(',');
          if (soundCache == null) {
            stackIn_31_2 = "null";
          } else {
            stackIn_31_2 = "{...}";
          }
          stackIn_33_1 = ((StringBuilder) (Object) stackIn_30_1).append(stackIn_31_2).append(',');
          if (budget == null) {
            stackIn_34_2 = "null";
          } else {
            stackIn_34_2 = "{...}";
          }
          throw FarmBackground.addExceptionContext((Throwable) ((Object) stackIn_27_0), ((StringBuilder) (Object) stackIn_33_1).append(stackIn_34_2).append(')').toString());
        }
    }

    final static void a(int param0, boolean param1) {
        int var3;
        var3 = BrickABrac.field_J ? 1 : 0;
        if (param1 ||
          null == ClientResourceHelpers.currentLobbyGame) {
          MeshLobbyUiHelpers.joinRequestsPanelOpen = false;
        }
        if (param0 >= -111) {
          return;
        }
        if (param1) {
          if (TextLineLayout.field_b > 0) {
            TextLineLayout.field_b = TextLineLayout.field_b - 1;
          } else {
            if (IntArrayRequest.field_j <= 0) {
              if (TableDataRequest.field_m > 0) {
                TableDataRequest.field_m = TableDataRequest.field_m - 1;
              }
            } else {
              IntArrayRequest.field_j = IntArrayRequest.field_j - 1;
            }
          }
        } else {
          if (null == ClientResourceHelpers.currentLobbyGame) {
            if (IncomingPacketHelpers.pendingLobbyGame == null) {
              MeshLobbyUiHelpers.joinRequestsPanelOpen = false;
              if (IntArrayRequest.field_j > 0) {
                IntArrayRequest.field_j = IntArrayRequest.field_j - 1;
              } else {
                if (TableDataRequest.field_m > 0) {
                  TableDataRequest.field_m = TableDataRequest.field_m - 1;
                } else {
                  if (TextLineLayout.field_b < ScrollPaneWithFooter.field_Yb) {
                    if (TextLineLayout.field_b == 0) {
                      SingleChildWidget.g((byte) -24);
                    }
                    TextLineLayout.field_b = TextLineLayout.field_b + 1;
                  }
                }
              }
            } else {
              if (TextLineLayout.field_b > 0) {
                TextLineLayout.field_b = TextLineLayout.field_b - 1;
              } else {
                if (0 < TableDataRequest.field_m) {
                  TableDataRequest.field_m = TableDataRequest.field_m - 1;
                } else {
                  if (ScrollPaneWithFooter.field_Yb > IntArrayRequest.field_j) {
                    if (IntArrayRequest.field_j == 0) {
                      NodeDeque.a(true, -122);
                    }
                    IntArrayRequest.field_j = IntArrayRequest.field_j + 1;
                  }
                }
              }
            }
          } else {
            if (TextLineLayout.field_b <= 0) {
              if (0 >= IntArrayRequest.field_j) {
                if (ScrollPaneWithFooter.field_Yb > TableDataRequest.field_m) {
                  if (TableDataRequest.field_m == 0) {
                    NodeDeque.a(false, -64);
                  }
                  TableDataRequest.field_m = TableDataRequest.field_m + 1;
                }
              } else {
                IntArrayRequest.field_j = IntArrayRequest.field_j - 1;
              }
            } else {
              TextLineLayout.field_b = TextLineLayout.field_b - 1;
            }
          }
        }
    }

    public static void a(byte param0) {
        field_o = null;
        if (param0 < 80) {
          MusicPatch.a((byte) -66);
        }
        field_n = null;
        field_q = null;
        field_m = null;
    }

    final static void a(int param0, String param1, boolean param2) {
        try {
          BytePayloadSubmission.field_l = param2;
          if (param0 != 0) {
            pointerX = 121;
          }
          CanvasInputCleanup.field_g = true;
          StrongCacheEntry.field_I = new AccountMessageDialog(ResourceArchive.field_f, wm.field_a, param1, NanoGameClock.field_l, BytePayloadSubmission.field_l);
          ResourceArchive.field_f.pushLayer(-80, StrongCacheEntry.field_I);
        } catch (RuntimeException runtimeException) {
          throw FarmBackground.addExceptionContext((Throwable) ((Object) runtimeException), "pq.D(" + param0 + ',' + (param1 != null ? "{...}" : "null") + ',' + param2 + ')');
        }
    }

    final void c(byte param0) {
        this.sampleCodes = null;
        if (param0 != 81) {
          String var3 = (String) null;
          MusicPatch.a(116, (String) null, true);
        }
    }

    MusicPatch(byte[] param0) {
        int var11_int = 0;
        int incrementValue$0 = 0;
        MusicEnvelope dupTemp$8 = null;
        int incrementValue$5 = 0;
        int var25_int = 0;
        int incrementValue$3 = 0;
        byte[] stackIn_39_0 = null;
        byte[] stackIn_42_0 = null;
        RuntimeException stackIn_204_0 = null;
        StringBuilder stackIn_204_1 = null;
        String stackIn_205_2 = null;
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
        MusicEnvelope[] var13 = null;
        int var14 = 0;
        int var15_int = 0;
        byte[] var15 = null;
        MusicEnvelope var15_ref = null;
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
        MusicEnvelope var40 = null;
        byte[] var41 = null;
        byte[] var42 = null;
        byte[] var43 = null;
        byte[] var44 = null;
        MusicEnvelope var45 = null;
        byte[] var46 = null;
        byte[] var47 = null;
        MusicEnvelope var48 = null;
        MusicEnvelope var49 = null;
        MusicEnvelope var50 = null;
        MusicEnvelope var51 = null;
        MusicEnvelope var52 = null;
        byte[] var53 = null;
        byte[] var54 = null;
        byte[] var55 = null;
        byte[] var56 = null;
        byte[] var57 = null;
        byte[] var58 = null;
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
        int var28Lifetime1;
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
          this.volume = new byte[128];
          this.pitchOffsets = new short[128];
          this.sampleCodes = new int[128];
          this.samples = new PcmSound[128];
          this.exclusiveGroups = new byte[128];
          this.pan = new byte[128];
          this.envelopes = new MusicEnvelope[128];
          var38 = new PacketBuffer(param0);
          for (var3 = 0; var38.data[var38.position + var3] != 0; var3++) {
          }
          var55 = new byte[var3];
          var42 = var55;
          var4 = var42;
          for (var5 = 0; var5 < var3; var5++) {
            var4[var5] = var38.readByte(true);
          }
          var38.position = var38.position + 1;
          var3++;
          var5Lifetime1 = var38.position;
          var38.position = var38.position + var3;
          for (var6 = 0; var38.data[var6 + var38.position] != 0; var6++) {
          }
          var56 = new byte[var6];
          var43 = var56;
          var7 = var43;
          for (var8 = 0; var8 < var6; var8++) {
            var7[var8] = var38.readByte(true);
          }
          var6++;
          var38.position = var38.position + 1;
          var8Lifetime1 = var38.position;
          var38.position = var38.position + var6;
          for (var9 = 0; var38.data[var9 + var38.position] != 0; var9++) {
          }
          var57 = new byte[var9];
          var44 = var57;
          var10 = var44;
          for (var11_int = 0; var11_int < var9; var11_int++) {
            var10[var11_int] = var38.readByte(true);
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
              var15_int = var38.readUnsignedByte(255);
              if (0 != var15_int) {
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
          var13 = new MusicEnvelope[var12];
          for (var14Lifetime1 = 0; var13.length > var14Lifetime1; var14Lifetime1++) {
            dupTemp$8 = new MusicEnvelope();
            var13[var14Lifetime1] = dupTemp$8;
            var40 = dupTemp$8;
            var15_ref = var40;
            var16_int = var38.readUnsignedByte(255);
            if (0 < var16_int) {
              var15_ref.volumeEnvelope = new byte[var16_int * 2];
            }
            var16_intLifetime1 = var38.readUnsignedByte(255);
            if (var16_intLifetime1 > 0) {
              var15_ref.releaseEnvelope = new byte[var16_intLifetime1 * 2 + 2];
              var40.releaseEnvelope[1] = (byte)64;
            }
          }
          var14Lifetime2 = var38.readUnsignedByte(255);
          if (var14Lifetime2 <= 0) {
            stackIn_39_0 = null;
          } else {
            stackIn_39_0 = new byte[var14Lifetime2 * 2];
          }
          var46 = stackIn_39_0;
          var15 = var46;
          var14Lifetime3 = var38.readUnsignedByte(255);
          if (var14Lifetime3 > 0) {
            stackIn_42_0 = new byte[2 * var14Lifetime3];
          } else {
            stackIn_42_0 = null;
          }
          var58 = stackIn_42_0;
          var47 = var58;
          var16 = var47;
          for (var17 = 0; 0 != var38.data[var17 + var38.position]; var17++) {
          }
          var54 = new byte[var17];
          var41 = var54;
          var18 = var41;
          for (var19 = 0; var17 > var19; var19++) {
            var18[var19] = var38.readByte(true);
          }
          var38.position = var38.position + 1;
          var17++;
          var19Lifetime1 = 0;
          for (var20 = 0; 128 > var20; var20++) {
            var19Lifetime1 = var19Lifetime1 + var38.readUnsignedByte(255);
            this.pitchOffsets[var20] = (short)var19Lifetime1;
          }
          var19Lifetime2 = 0;
          for (var20Lifetime1 = 0; var20Lifetime1 < 128; var20Lifetime1++) {
            var19Lifetime2 = var19Lifetime2 + var38.readUnsignedByte(255);
            this.pitchOffsets[var20Lifetime1] = (short)(this.pitchOffsets[var20Lifetime1] + (var19Lifetime2 << 8));
          }
          var20Lifetime2 = 0;
          var21 = 0;
          var22 = 0;
          for (var23 = 0; var23 < 128; var23++) {
            if (var20Lifetime2 == 0) {
              if (var21 >= var54.length) {
                var20Lifetime2 = -1;
              } else {
                var20Lifetime2 = var18[var21++];
              }
              var22 = var38.readVarInt((byte) 112);
            }
            this.pitchOffsets[var23] = (short)(this.pitchOffsets[var23] + (IntrusiveHashIterator.a(2, -1 + var22) << 14));
            var20Lifetime2--;
            this.sampleCodes[var23] = var22;
          }
          var21Lifetime1 = 0;
          var20Lifetime3 = 0;
          var23Lifetime1 = 0;
          for (var24 = 0; var24 < 128; var24++) {
            if (this.sampleCodes[var24] != 0) {
              if (var20Lifetime3 == 0) {
                incrementValue$5 = var5Lifetime1;
                var5Lifetime1++;
                var23Lifetime1 = -1 + var38.data[incrementValue$5];
                if (var21Lifetime1 >= var55.length) {
                  var20Lifetime3 = -1;
                } else {
                  var20Lifetime3 = var4[var21Lifetime1++];
                }
              }
              var20Lifetime3--;
              this.exclusiveGroups[var24] = (byte)var23Lifetime1;
            }
          }
          var21Lifetime2 = 0;
          var20Lifetime4 = 0;
          var24Lifetime1 = 0;
          for (var25_int = 0; var25_int < 128; var25_int++) {
            if (this.sampleCodes[var25_int] != 0) {
              if (var20Lifetime4 == 0) {
                incrementValue$3 = var8Lifetime1;
                var8Lifetime1++;
                var24Lifetime1 = 16 + var38.data[incrementValue$3] << 2;
                if (var21Lifetime2 >= var56.length) {
                  var20Lifetime4 = -1;
                } else {
                  var20Lifetime4 = var7[var21Lifetime2++];
                }
              }
              this.pan[var25_int] = (byte)var24Lifetime1;
              var20Lifetime4--;
            }
          }
          var21Lifetime3 = 0;
          var20Lifetime5 = 0;
          var25 = null;
          for (var26 = 0; var26 < 128; var26++) {
            if (this.sampleCodes[var26] != 0) {
              if (0 == var20Lifetime5) {
                var25 = var13[var53[var21Lifetime3]];
                if (var21Lifetime3 >= var57.length) {
                  var20Lifetime5 = -1;
                } else {
                  var20Lifetime5 = var10[var21Lifetime3++];
                }
              }
              this.envelopes[var26] = (MusicEnvelope) (var25);
              var20Lifetime5--;
            }
          }
          var20Lifetime6 = 0;
          var21Lifetime4 = 0;
          var26Lifetime1 = 0;
          for (var27 = 0; var27 < 128; var27++) {
            if (var20Lifetime6 == 0) {
              if (var21Lifetime4 >= var54.length) {
                var20Lifetime6 = -1;
              } else {
                var20Lifetime6 = var18[var21Lifetime4++];
              }
              if (this.sampleCodes[var27] > 0) {
                var26Lifetime1 = 1 + var38.readUnsignedByte(255);
              }
            }
            var20Lifetime6--;
            this.volume[var27] = (byte)var26Lifetime1;
          }
          this.gain = 1 + var38.readUnsignedByte(255);
          for (var27Lifetime1 = 0; var27Lifetime1 < var12; var27Lifetime1++) {
            var45 = var13[var27Lifetime1];
            if (null != var45.volumeEnvelope) {
              for (var29 = 1; var29 < var45.volumeEnvelope.length; var29 += 2) {
                var45.volumeEnvelope[var29] = var38.readByte(true);
              }
            }
            if (var45.releaseEnvelope != null) {
              for (var29Lifetime5 = 3; var29Lifetime5 < var45.releaseEnvelope.length - 2; var29Lifetime5 += 2) {
                var45.releaseEnvelope[var29Lifetime5] = var38.readByte(true);
              }
            }
          }
          if (null != var15) {
            for (var27Lifetime2 = 1; var27Lifetime2 < var46.length; var27Lifetime2 += 2) {
              var15[var27Lifetime2] = var38.readByte(true);
            }
          }
          if (var16 != null) {
            for (var27Lifetime3 = 1; var58.length > var27Lifetime3; var27Lifetime3 += 2) {
              var16[var27Lifetime3] = var38.readByte(true);
            }
          }
          for (var27Lifetime4 = 0; var12 > var27Lifetime4; var27Lifetime4++) {
            var48 = var13[var27Lifetime4];
            if (var48.releaseEnvelope != null) {
              var19Lifetime3 = 0;
              for (var29Lifetime1 = 2; var48.releaseEnvelope.length > var29Lifetime1; var29Lifetime1 += 2) {
                var19Lifetime3 = var38.readUnsignedByte(255) + 1 + var19Lifetime3;
                var48.releaseEnvelope[var29Lifetime1] = (byte)var19Lifetime3;
              }
            }
          }
          for (var27Lifetime5 = 0; var12 > var27Lifetime5; var27Lifetime5++) {
            var49 = var13[var27Lifetime5];
            if (null != var49.volumeEnvelope) {
              var19Lifetime4 = 0;
              for (var29Lifetime2 = 2; var29Lifetime2 < var49.volumeEnvelope.length; var29Lifetime2 += 2) {
                var19Lifetime4 = var19Lifetime4 + 1 + var38.readUnsignedByte(255);
                var49.volumeEnvelope[var29Lifetime2] = (byte)var19Lifetime4;
              }
            }
          }
          if (var15 != null) {
            var19Lifetime5 = var38.readUnsignedByte(255);
            var15[0] = (byte)var19Lifetime5;
            for (var27Lifetime6 = 2; var27Lifetime6 < var46.length; var27Lifetime6 += 2) {
              var19Lifetime5 = 1 + var19Lifetime5 + var38.readUnsignedByte(255);
              var15[var27Lifetime6] = (byte)var19Lifetime5;
            }
            var27Lifetime6Lifetime1 = var46[0];
            var28 = var46[1];
            for (var29Lifetime3 = 0; var27Lifetime6Lifetime1 > var29Lifetime3; var29Lifetime3++) {
              this.volume[var29Lifetime3] = (byte)(32 + this.volume[var29Lifetime3] * var28 >> 6);
            }
            var29Lifetime3Lifetime1 = 2;
            while (var29Lifetime3Lifetime1 < var46.length) {
              var30 = var46[var29Lifetime3Lifetime1];
              var31 = var15[var29Lifetime3Lifetime1 + 1];
              var32 = var28 * (-var27Lifetime6Lifetime1 + var30) + (-var27Lifetime6Lifetime1 + var30) / 2;
              for (var33 = var27Lifetime6Lifetime1; var33 < var30; var33++) {
                var34 = AccountDateHelpers.divideFloorPositive(var30 - var27Lifetime6Lifetime1, (byte) 15, var32);
                var32 = var32 + (var31 - var28);
                this.volume[var33] = (byte)(this.volume[var33] * var34 + 32 >> 6);
              }
              var28 = var31;
              var29Lifetime3Lifetime1 += 2;
              var27Lifetime6Lifetime1 = var30;
            }
            for (var30Lifetime2 = var27Lifetime6Lifetime1; var30Lifetime2 < 128; var30Lifetime2++) {
              this.volume[var30Lifetime2] = (byte)(this.volume[var30Lifetime2] * var28 + 32 >> 6);
            }
            var15 = null;
          }
          if (null != var16) {
            var19Lifetime6 = var38.readUnsignedByte(255);
            var16[0] = (byte)var19Lifetime6;
            for (var27Lifetime7 = 2; var58.length > var27Lifetime7; var27Lifetime7 += 2) {
              var19Lifetime6 = 1 + (var19Lifetime6 + var38.readUnsignedByte(255));
              var16[var27Lifetime7] = (byte)var19Lifetime6;
            }
            var27Lifetime7Lifetime1 = var58[0];
            var28Lifetime1 = var58[1] << 1;
            for (var29Lifetime4 = 0; var27Lifetime7Lifetime1 > var29Lifetime4; var29Lifetime4++) {
              var30Lifetime1 = var28Lifetime1 + (255 & this.pan[var29Lifetime4]);
              if (0 > var30Lifetime1) {
                var30Lifetime1 = 0;
              }
              if (var30Lifetime1 > 128) {
                var30Lifetime1 = 128;
              }
              this.pan[var29Lifetime4] = (byte)var30Lifetime1;
            }
            for (var29Lifetime4Lifetime1 = 2; var58.length > var29Lifetime4Lifetime1; var29Lifetime4Lifetime1 += 2) {
              var30Lifetime1Lifetime1 = var58[var29Lifetime4Lifetime1];
              var31Lifetime1 = var16[1 + var29Lifetime4Lifetime1] << 1;
              var32Lifetime1 = (-var27Lifetime7Lifetime1 + var30Lifetime1Lifetime1) * var28Lifetime1 + (var30Lifetime1Lifetime1 - var27Lifetime7Lifetime1) / 2;
              var37 = var27Lifetime7Lifetime1;
              var33Lifetime1 = var37;
              while (var30Lifetime1Lifetime1 > var37) {
                var34Lifetime1 = AccountDateHelpers.divideFloorPositive(var30Lifetime1Lifetime1 - var27Lifetime7Lifetime1, (byte) 15, var32Lifetime1);
                var35 = (this.pan[var37] & 255) + var34Lifetime1;
                if (var35 < 0) {
                  var35 = 0;
                }
                if (var35 > 128) {
                  var35 = 128;
                }
                this.pan[var37] = (byte)var35;
                var32Lifetime1 = var32Lifetime1 + (var31Lifetime1 - var28Lifetime1);
                var37++;
              }
              var27Lifetime7Lifetime1 = var30Lifetime1Lifetime1;
              var28Lifetime1 = var31Lifetime1;
            }
            var16 = null;
            for (var30Lifetime1Lifetime2 = var27Lifetime7Lifetime1; var30Lifetime1Lifetime2 < 128; var30Lifetime1Lifetime2++) {
              var31Lifetime1Lifetime1 = var28Lifetime1 + (255 & this.pan[var30Lifetime1Lifetime2]);
              if (var31Lifetime1Lifetime1 < 0) {
                var31Lifetime1Lifetime1 = 0;
              }
              if (var31Lifetime1Lifetime1 > 128) {
                var31Lifetime1Lifetime1 = 128;
              }
              this.pan[var30Lifetime1Lifetime2] = (byte)var31Lifetime1Lifetime1;
            }
          }
          for (var27Lifetime8 = 0; var27Lifetime8 < var12; var27Lifetime8++) {
            var13[var27Lifetime8].decayRate = var38.readUnsignedByte(255);
          }
          for (var27Lifetime9 = 0; var12 > var27Lifetime9; var27Lifetime9++) {
            var50 = var13[var27Lifetime9];
            if (var50.volumeEnvelope != null) {
              var50.field_h = var38.readUnsignedByte(255);
            }
            if (var50.releaseEnvelope != null) {
              var50.field_b = var38.readUnsignedByte(255);
            }
            if (0 < var50.decayRate) {
              var50.field_k = var38.readUnsignedByte(255);
            }
          }
          for (var27Lifetime10 = 0; var27Lifetime10 < var12; var27Lifetime10++) {
            var13[var27Lifetime10].vibratoRate = var38.readUnsignedByte(255);
          }
          for (var27Lifetime11 = 0; var12 > var27Lifetime11; var27Lifetime11++) {
            var51 = var13[var27Lifetime11];
            if (var51.vibratoRate > 0) {
              var51.vibratoDepth = var38.readUnsignedByte(255);
            }
          }
          for (var27Lifetime12 = 0; var27Lifetime12 < var12; var27Lifetime12++) {
            var52 = var13[var27Lifetime12];
            if (var52.vibratoDepth > 0) {
              var52.vibratoDelay = var38.readUnsignedByte(255);
            }
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2 = decompiledCaughtException;
          stackIn_204_0 = var2;
          stackIn_204_1 = new StringBuilder().append("pq.<init>(");
          if (param0 == null) {
            stackIn_205_2 = "null";
          } else {
            stackIn_205_2 = "{...}";
          }
          throw FarmBackground.addExceptionContext((Throwable) ((Object) stackIn_204_0), ((StringBuilder) (Object) stackIn_204_1).append(stackIn_205_2).append(')').toString());
        }
    }

    static {
        pointerX = 0;
        field_m = "Accept rematch";
        field_q = "Grow: makes your paddle longer.";
        field_n = "Names cannot contain consecutive spaces";
    }
}
