/*
 * Decompiled by CFR-JS 0.4.0.
 */
import java.io.*;

final class SectorCacheStore {
    private int field_h;
    private BufferedFile field_i;
    static String field_a;
    static int field_d;
    static String muXDroppedOut;
    private BufferedFile field_f;
    static String noOptionsAvailable;
    private int field_b;
    static String achieved;

    public static void releaseStatics(boolean param0) {
        muXDroppedOut = null;
        achieved = null;
        noOptionsAvailable = null;
        field_a = null;
        if (!param0) {
          String var2 = (String) null;
          SectorCacheStore.a(true, (String) null, true, true, -64, (String) null);
        }
    }

    final byte[] read(byte param0, int param1) {
        try {
          int var16 = 0;
          int incrementValue$2 = 0;
          Object var3 = null;
          Object var3_ref = null;
          int var4_int = 0;
          IOException var4 = null;
          int var5 = 0;
          byte[] var6 = null;
          int var7 = 0;
          int var8 = 0;
          int var9 = 0;
          int var10 = 0;
          int var11 = 0;
          int var12 = 0;
          int var13 = 0;
          int var14 = 0;
          int var15 = 0;
          Throwable var17 = null;
          int var18 = 0;
          Object stackIn_3_0 = null;
          byte[] stackIn_7_0 = null;
          Object stackIn_19_0 = null;
          Object stackIn_47_0 = null;
          byte[] stackIn_54_0 = null;
          Object stackIn_57_0 = null;
          Throwable decompiledCaughtException = null;
          var18 = Pool.field_O;
          var3_ref = this.field_i;
          synchronized (var3_ref) {
            try {
              if (this.field_f.length((byte) 17) < (long)(6 + param1 * 6)) {
                stackIn_3_0 = null;
                return (byte[]) (stackIn_3_0);
              }
              this.field_f.seek(0, (long)(param1 * 6));
              if (param0 != -110) {
                stackIn_7_0 = (byte[]) null;
                return stackIn_7_0;
              }
              this.field_f.readFully((byte) -111, 6, 0, DiskArchiveRequest.field_S);
              var4_int = (DiskArchiveRequest.field_S[2] & 255) + (16711680 & DiskArchiveRequest.field_S[0] << 16) + (DiskArchiveRequest.field_S[1] << 8 & 65280);
              var5 = (255 & DiskArchiveRequest.field_S[5]) + (DiskArchiveRequest.field_S[3] << 16 & 16711680) + (DiskArchiveRequest.field_S[4] << 8 & 65280);
              if (var4_int < 0) {
                return null;
              }
              if (var4_int > this.field_b) {
                return null;
              }
              if (var5 <= 0) {
                return null;
              }
              if (this.field_i.length((byte) 17) / 520L < (long)var5) {
                stackIn_19_0 = null;
                return (byte[]) (stackIn_19_0);
              }
              var6 = new byte[var4_int];
              var7 = 0;
              var8 = 0;
              while (var7 < var4_int) {
                if (var5 == 0) {
                  return null;
                }
                this.field_i.seek(param0 ^ -110, (long)(520 * var5));
                var9 = var4_int - var7;
                if (65535 >= param1) {
                  if (var9 > 512) {
                    var9 = 512;
                  }
                  var14 = 8;
                  this.field_i.readFully((byte) -115, var14 + var9, 0, DiskArchiveRequest.field_S);
                  var12 = (DiskArchiveRequest.field_S[5] << 8 & 65280) + (DiskArchiveRequest.field_S[4] << 16 & 16711680) + (DiskArchiveRequest.field_S[6] & 255);
                  var11 = ((DiskArchiveRequest.field_S[2] & 255) << 8) + (DiskArchiveRequest.field_S[3] & 255);
                  var13 = DiskArchiveRequest.field_S[7] & 255;
                  var10 = (DiskArchiveRequest.field_S[1] & 255) + (65280 & DiskArchiveRequest.field_S[0] << 8);
                } else {
                  if (var9 > 510) {
                    var9 = 510;
                  }
                  var14 = 10;
                  this.field_i.readFully((byte) -126, var9 + var14, 0, DiskArchiveRequest.field_S);
                  var12 = (DiskArchiveRequest.field_S[7] << 8 & 65280) + (16711680 & DiskArchiveRequest.field_S[6] << 16) + (255 & DiskArchiveRequest.field_S[8]);
                  var13 = DiskArchiveRequest.field_S[9] & 255;
                  var11 = (255 & DiskArchiveRequest.field_S[5]) + (DiskArchiveRequest.field_S[4] << 8 & 65280);
                  var10 = (DiskArchiveRequest.field_S[3] & 255) + (-16777216 & DiskArchiveRequest.field_S[0] << 24) + ((DiskArchiveRequest.field_S[1] & 255) << 16) + ((DiskArchiveRequest.field_S[2] & 255) << 8);
                }
                if (var10 != param1) {
                  return null;
                }
                if (var11 != var8) {
                  return null;
                }
                if (var13 != this.field_h) {
                  return null;
                }
                if (var12 < 0) {
                  return null;
                }
                if ((long)var12 > this.field_i.length((byte) 17) / 520L) {
                  stackIn_47_0 = null;
                  return (byte[]) (stackIn_47_0);
                }
                var15 = var14 + var9;
                for (var16 = var14; var15 > var16; var16++) {
                  incrementValue$2 = var7;
                  var7++;
                  var6[incrementValue$2] = DiskArchiveRequest.field_S[var16];
                }
                var8++;
                var5 = var12;
              }
              stackIn_54_0 = var6;
              return stackIn_54_0;
            } catch (java.io.IOException decompiledCaughtParameter0) {
              decompiledCaughtException = decompiledCaughtParameter0;
              var4 = (IOException) (Object) decompiledCaughtException;
              stackIn_57_0 = null;
              return (byte[]) (stackIn_57_0);
            }
          }
        } catch (RuntimeException | Error decompiledUncheckedException) {
          throw decompiledUncheckedException;
        } catch (Throwable decompiledCheckedException) {
          throw new RuntimeException(decompiledCheckedException);
        }
    }

    final static String toHexString(boolean param0, CipherPacketBuffer param1) {
        int var3 = 0;
        StringBuilder discarded$2 = null;
        StringBuilder discarded$3 = null;
        StringBuilder var2 = null;
        RuntimeException var2_ref = null;
        int var4 = 0;
        StringBuilder var5 = null;
        String stackIn_2_0 = null;
        String stackIn_7_0 = null;
        RuntimeException stackIn_10_0 = null;
        StringBuilder stackIn_10_1 = null;
        String stackIn_11_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          if (param0) {
            stackIn_2_0 = (String) null;
            return stackIn_2_0;
          }
          var5 = new StringBuilder(2 * param1.position);
          var2 = var5;
          for (var3 = 0; param1.position > var3; var3++) {
            var4 = 255 & param1.payload[var3];
            discarded$2 = var5.append(BallDebugOverlay.field_j[var4 >> 4 & 15]);
            discarded$3 = var5.append(BallDebugOverlay.field_j[15 & var4]);
          }
          stackIn_7_0 = var2.toString();
          return stackIn_7_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2_ref = decompiledCaughtException;
          stackIn_10_0 = var2_ref;
          stackIn_10_1 = new StringBuilder().append("np.E(").append(param0).append(',');
          if (param1 == null) {
            stackIn_11_2 = "null";
          } else {
            stackIn_11_2 = "{...}";
          }
          throw ReportAbuseDialog.addExceptionContext((Throwable) ((Object) stackIn_10_0), ((StringBuilder) (Object) stackIn_10_1).append(stackIn_11_2).append(')').toString());
        }
    }

    final boolean write(int param0, int param1, int param2, byte[] param3) {
        Object var5 = null;
        RuntimeException var5_ref = null;
        int var6 = 0;
        Throwable var7 = null;
        int stackIn_11_0 = 0;
        RuntimeException stackIn_16_0 = null;
        StringBuilder stackIn_16_1 = null;
        String stackIn_17_2 = null;
        Throwable decompiledCaughtException = null;
        try {
          var5 = this.field_i;
          synchronized (var5) {
            if (param1 != -12875) {
              field_d = 96;
            }
            if (param2 >= 0 &&
              param2 <= this.field_b) {
              var6 = this.writeSectors(param0, param2, true, param3, (byte) 93) ? 1 : 0;
              if (var6 == 0) {
                var6 = this.writeSectors(param0, param2, false, param3, (byte) 93) ? 1 : 0;
              }
              stackIn_11_0 = var6;
            } else {
              throw new IllegalArgumentException();
            }
          }
          return stackIn_11_0 != 0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var5_ref = (RuntimeException) (Object) decompiledCaughtException;
          stackIn_16_0 = var5_ref;
          stackIn_16_1 = new StringBuilder().append("np.A(").append(param0).append(',').append(param1).append(',').append(param2).append(',');
          if (param3 == null) {
            stackIn_17_2 = "null";
          } else {
            stackIn_17_2 = "{...}";
          }
          throw ReportAbuseDialog.addExceptionContext((Throwable) ((Object) stackIn_16_0), ((StringBuilder) (Object) stackIn_16_1).append(stackIn_17_2).append(')').toString());
        }
    }

    private final boolean writeSectors(int param0, int param1, boolean param2, byte[] param3, byte param4) {
        try {
          RuntimeException stackIn_70_0 = null;
          StringBuilder stackIn_70_1 = null;
          String stackIn_71_2 = null;
          int decompiledRegionSelector0 = 0;
          int decompiledRegionSelector1 = 0;
          Throwable decompiledCaughtException = null;
          Object var6 = null;
          RuntimeException var6_ref = null;
          int var7_int = 0;
          IOException var7 = null;
          int var8 = 0;
          int var9 = 0;
          int var10 = 0;
          int var11 = 0;
          int var12 = 0;
          int var13 = 0;
          EOFException var14 = null;
          int var16 = 0;
          var16 = Pool.field_O;
          try {
            var6 = this.field_i;
            synchronized (var6) {
              try {
                if (param2) {
                  if ((long)(6 + param0 * 6) > this.field_f.length((byte) 17)) {
                    return false;
                  }
                  this.field_f.seek(0, (long)(param0 * 6));
                  this.field_f.readFully((byte) -110, 6, 0, DiskArchiveRequest.field_S);
                  var7_int = (DiskArchiveRequest.field_S[5] & 255) + (16711680 & DiskArchiveRequest.field_S[3] << 16) + (DiskArchiveRequest.field_S[4] << 8 & 65280);
                  if (var7_int <= 0 ||
                    !((long)var7_int <= this.field_i.length((byte) 17) / 520L)) {
                    return false;
                  }
                } else {
                  var7_int = (int)((519L + this.field_i.length((byte) 17)) / 520L);
                  if (var7_int == 0) {
                    var7_int = 1;
                  }
                }
                DiskArchiveRequest.field_S[3] = (byte)(var7_int >> 16);
                DiskArchiveRequest.field_S[2] = (byte)param1;
                DiskArchiveRequest.field_S[0] = (byte)(param1 >> 16);
                DiskArchiveRequest.field_S[1] = (byte)(param1 >> 8);
                DiskArchiveRequest.field_S[4] = (byte)(var7_int >> 8);
                DiskArchiveRequest.field_S[5] = (byte)var7_int;
                this.field_f.seek(0, (long)(param0 * 6));
                this.field_f.write(6, DiskArchiveRequest.field_S, 0, -1);
                var8 = 0;
                var9 = 0;
                scanLoop1: while (true) {
                  if (var8 < param1) {
                    boolean decompiledFrameRemainder0 = true;
                    var10 = 0;
                    if (param2) {
                      this.field_i.seek(param4 ^ 93, (long)(520 * var7_int));
                      if (65535 >= param0) {
                        try {
                          this.field_i.readFully((byte) -110, 8, 0, DiskArchiveRequest.field_S);
                          decompiledRegionSelector0 = 0;
                        } catch (java.io.EOFException decompiledCaughtParameter0) {
                          decompiledCaughtException = decompiledCaughtParameter0;
                          var14 = (EOFException) (Object) decompiledCaughtException;
                          decompiledRegionSelector0 = 1;
                        }
                        if (decompiledRegionSelector0 != 0) {
                          break scanLoop1;
                        }
                        var12 = (DiskArchiveRequest.field_S[3] & 255) + (65280 & DiskArchiveRequest.field_S[2] << 8);
                        var10 = ((255 & DiskArchiveRequest.field_S[5]) << 8) + ((16711680 & DiskArchiveRequest.field_S[4] << 16) + (255 & DiskArchiveRequest.field_S[6]));
                        var11 = (DiskArchiveRequest.field_S[0] << 8 & 65280) + (255 & DiskArchiveRequest.field_S[1]);
                        var13 = DiskArchiveRequest.field_S[7] & 255;
                      } else {
                        try {
                          this.field_i.readFully((byte) -118, 10, 0, DiskArchiveRequest.field_S);
                          decompiledRegionSelector1 = 0;
                        } catch (java.io.EOFException decompiledCaughtParameter1) {
                          decompiledCaughtException = decompiledCaughtParameter1;
                          var14 = (EOFException) (Object) decompiledCaughtException;
                          decompiledRegionSelector1 = 1;
                        }
                        if (decompiledRegionSelector1 != 0) {
                          break scanLoop1;
                        }
                        var11 = (DiskArchiveRequest.field_S[3] & 255) + ((65280 & DiskArchiveRequest.field_S[2] << 8) + ((DiskArchiveRequest.field_S[0] << 24 & -16777216) + (16711680 & DiskArchiveRequest.field_S[1] << 16)));
                        var12 = (65280 & DiskArchiveRequest.field_S[4] << 8) + (DiskArchiveRequest.field_S[5] & 255);
                        var10 = (16711680 & DiskArchiveRequest.field_S[6] << 16) - (-(65280 & DiskArchiveRequest.field_S[7] << 8) - (DiskArchiveRequest.field_S[8] & 255));
                        var13 = 255 & DiskArchiveRequest.field_S[9];
                      }
                      if ((var11 == param0 &&
                        var12 == var9 &&
                        var13 == this.field_h) &&
                        (decompiledFrameRemainder0 = (!(0 <= var10) ||
                        !(this.field_i.length((byte) 17) / 520L >= (long)var10)))) {
                        return false;
                      }
                      if (decompiledFrameRemainder0) {
                        return false;
                      }
                    }
                    if (var10 == 0) {
                      param2 = false;
                      var10 = (int)((this.field_i.length((byte) 17) + 519L) / 520L);
                      if (var10 == 0) {
                        var10++;
                      }
                      if (var10 == var7_int) {
                        var10++;
                      }
                    }
                    if (param1 - var8 <= 512) {
                      var10 = 0;
                    }
                    if (param0 <= 65535) {
                      DiskArchiveRequest.field_S[0] = (byte)(param0 >> 8);
                      DiskArchiveRequest.field_S[1] = (byte)param0;
                      DiskArchiveRequest.field_S[5] = (byte)(var10 >> 8);
                      DiskArchiveRequest.field_S[6] = (byte)var10;
                      DiskArchiveRequest.field_S[2] = (byte)(var9 >> 8);
                      DiskArchiveRequest.field_S[3] = (byte)var9;
                      DiskArchiveRequest.field_S[7] = (byte)this.field_h;
                      DiskArchiveRequest.field_S[4] = (byte)(var10 >> 16);
                      this.field_i.seek(0, (long)(520 * var7_int));
                      this.field_i.write(8, DiskArchiveRequest.field_S, 0, -1);
                      var11 = -var8 + param1;
                      if (var11 > 512) {
                        var11 = 512;
                      }
                      this.field_i.write(var11, param3, var8, -1);
                      var8 = var8 + var11;
                    } else {
                      DiskArchiveRequest.field_S[7] = (byte)(var10 >> 8);
                      DiskArchiveRequest.field_S[9] = (byte)this.field_h;
                      DiskArchiveRequest.field_S[3] = (byte)param0;
                      DiskArchiveRequest.field_S[8] = (byte)var10;
                      DiskArchiveRequest.field_S[2] = (byte)(param0 >> 8);
                      DiskArchiveRequest.field_S[4] = (byte)(var9 >> 8);
                      DiskArchiveRequest.field_S[0] = (byte)(param0 >> 24);
                      DiskArchiveRequest.field_S[1] = (byte)(param0 >> 16);
                      DiskArchiveRequest.field_S[6] = (byte)(var10 >> 16);
                      DiskArchiveRequest.field_S[5] = (byte)var9;
                      this.field_i.seek(0, (long)(520 * var7_int));
                      this.field_i.write(10, DiskArchiveRequest.field_S, 0, param4 - 94);
                      var11 = -var8 + param1;
                      if (var11 > 510) {
                        var11 = 510;
                      }
                      this.field_i.write(var11, param3, var8, -1);
                      var8 = var8 + var11;
                    }
                    var7_int = var10;
                    var9++;
                    continue;
                  }
                  break;
                }
                if (param4 != 93) {
                  SectorCacheStore.releaseStatics(false);
                }
                return true;
              } catch (java.io.IOException decompiledCaughtParameter2) {
                decompiledCaughtException = decompiledCaughtParameter2;
                var7 = (IOException) (Object) decompiledCaughtException;
                return false;
              }
            }
          } catch (java.lang.RuntimeException decompiledCaughtParameter3) {
            decompiledCaughtException = decompiledCaughtParameter3;
            var6_ref = (RuntimeException) (Object) decompiledCaughtException;
            stackIn_70_0 = var6_ref;
            stackIn_70_1 = new StringBuilder().append("np.B(").append(param0).append(',').append(param1).append(',').append(param2).append(',');
            if (param3 == null) {
              stackIn_71_2 = "null";
            } else {
              stackIn_71_2 = "{...}";
            }
            throw ReportAbuseDialog.addExceptionContext((Throwable) ((Object) stackIn_70_0), ((StringBuilder) (Object) stackIn_70_1).append(stackIn_71_2).append(',').append(param4).append(')').toString());
          }
        } catch (RuntimeException | Error decompiledUncheckedException) {
          throw decompiledUncheckedException;
        } catch (Throwable decompiledCheckedException) {
          throw new RuntimeException(decompiledCheckedException);
        }
    }

    final static int a(boolean param0, String param1, boolean param2, boolean param3, int param4, String param5) {
        try {
          int stackIn_5_0 = 0;
          int stackIn_32_0 = 0;
          boolean stackIn_44_0 = false;
          boolean stackIn_48_0 = false;
          boolean stackIn_51_0 = false;
          boolean stackIn_54_0 = false;
          LoginMethod stackIn_67_0 = null;
          java.applet.Applet stackIn_67_1 = null;
          boolean stackIn_68_2 = false;
          int stackIn_86_0 = 0;
          int stackIn_98_0 = 0;
          int stackIn_100_0 = 0;
          int stackIn_107_0 = 0;
          int stackIn_110_0 = 0;
          RuntimeException stackIn_113_0 = null;
          StringBuilder stackIn_113_1 = null;
          String stackIn_114_2 = null;
          StringBuilder stackIn_116_1 = null;
          String stackIn_117_2 = null;
          Throwable decompiledCaughtException = null;
          int var6_int = 0;
          RuntimeException var6 = null;
          int var7 = 0;
          int var8 = 0;
          Throwable var8_ref_Throwable = null;
          int var9 = 0;
          String var10 = null;
          String var11 = null;
          String var12 = null;
          CharSequence var13 = null;
          int var6_intLifetime1;
          int var6_intLifetime2;
          int var8Lifetime1;
          var9 = Pool.field_O;
          try {
            if (null == Atan2Support.field_c &&
              !CollisionContact.a((byte) 65, param2)) {
              stackIn_5_0 = -1;
              return stackIn_5_0;
            }
            if (RankingsScreen.field_J == Js5Transport.field_h) {
              if (!param2) {
                CookieDateSupport.field_c = TickClock.createNamedLoginPayload(false, param1, -5790, param5);
              } else {
                var11 = (String) null;
                CookieDateSupport.field_c = LoginPayloadFactory.createLoginPayload(Quaternion.field_a, -16595, param5, false, (String) null);
              }
              JaggrabDownloader.field_j.position = 0;
              JaggrabDownloader.field_j.writeByte(14, false);
              JaggrabDownloader.field_j.writeByte(CookieDateSupport.field_c.payloadKind((byte) -101).wireId, false);
              DebugTuningSupport.flushClientPackets(-1, 0);
              RankingsScreen.field_J = ReflectionRequestSupport.field_d;
            }
            if (ReflectionRequestSupport.field_d == RankingsScreen.field_J &&
              DialogLayer.pollPacketBytes((byte) 87, 1)) {
              var6_int = PlayerContextMenu.field_e.readUnsignedByte(-82);
              if (var6_int == 0) {
                RankingsScreen.field_J = DelayedServerPacket.field_o;
              } else {
                Bzip2DecoderState.field_c = var6_int;
                ScrollPane.field_Pb = -1;
                RankingsScreen.field_J = Quaternion.field_k;
              }
              PlayerContextMenu.field_e.position = 0;
            }
            if (DelayedServerPacket.field_o == RankingsScreen.field_J &&
              DialogLayer.pollPacketBytes((byte) 43, 8)) {
              Pool.field_Q = PlayerContextMenu.field_e.readLong(-412303328);
              PlayerContextMenu.field_e.position = 0;
              MessageScreen.a(param2, CookieDateSupport.field_c, param3, -98300704, param4);
              RankingsScreen.field_J = DualLinkDeque.field_g;
            }
            boolean decompiledFrameRemainder0 = true;
            if (RankingsScreen.field_J == DualLinkDeque.field_g &&
              DialogLayer.pollPacketBytes((byte) 79, 1)) {
              var6_intLifetime1 = PlayerContextMenu.field_e.readUnsignedByte(-110);
              PlayerContextMenu.field_e.position = 0;
              CheckboxWidget.field_N = null;
              Bzip2DecoderState.field_c = var6_intLifetime1;
              if (var6_intLifetime1 != 0 &&
                1 != var6_intLifetime1) {
                if (var6_intLifetime1 != 8) {
                  RankingsScreen.field_J = Quaternion.field_k;
                  ScrollPane.field_Pb = -1;
                  decompiledFrameRemainder0 = false;
                }
                else {
                  ShotEvent.closeClientSocket(-115);
                  ArchiveLoadStep.field_e = false;
                  stackIn_32_0 = var6_intLifetime1;
                  return stackIn_32_0;
                }
              }
              if (decompiledFrameRemainder0) {
                ScrollPane.field_Pb = -1;
                RankingsScreen.field_J = SlidingPanelSupport.field_b;
              }
            }
            if (SlidingPanelSupport.field_b == RankingsScreen.field_J &&
              PacketAvailabilitySupport.hasCompletePacket((byte) 39)) {
              Quaternion.field_a = PlayerContextMenu.field_e.readLong(-412303328);
              UiWidget.field_E = param5;
              TutorialController.field_i = PlayerContextMenu.field_e.readUnsignedByte(-68);
              GradientPaletteSupport.field_f = PlayerContextMenu.field_e.readUnsignedByte(-105);
              UsernameSuggestionsPanel.field_V = PlayerContextMenu.field_e.readUnsignedShort(-1034);
              var12 = PlayerContextMenu.field_e.readNullableString(108);
              var7 = PlayerContextMenu.field_e.readUnsignedByte(-76);
              if (0 != (1 & var7)) {
                LoginTextValue.persistRandomSeedFromPacket(100);
              }
              stackIn_44_0 = ((16 & var7) != 0);
              NineSliceFrame.field_b = stackIn_44_0;
              if (!param2) {
                stackIn_48_0 = ((8 & var7) != 0);
                RankingsRequest.field_z = stackIn_48_0;
                stackIn_51_0 = ((4 & var7) != 0);
                AccountCreationDialog.field_Gb = stackIn_51_0;
                stackIn_54_0 = ((2 & var7) != 0);
                ViewportController.field_y = stackIn_54_0;
                if (RankingsRequest.field_z) {
                  ViewportController.field_y = true;
                }
              }
              if (NanoTickClock.field_s) {
                PlayerContextMenu.field_e.readUnsignedByte(-114);
                PlayerContextMenu.field_e.readUnsignedByte(-99);
                PlayerContextMenu.field_e.readInt(true);
                MultiHandleSliderWidget.field_X = PlayerContextMenu.field_e.readUnsignedShort(-1034);
                BirthDateValidator.field_n = new byte[MultiHandleSliderWidget.field_X];
                for (var8 = 0; MultiHandleSliderWidget.field_X > var8; var8++) {
                  BirthDateValidator.field_n[var8] = PlayerContextMenu.field_e.readByte((byte) 105);
                }
              }
              ResourceArchive.field_j = PlayerContextMenu.field_e.readNullTerminatedString(-22);
              var13 = (CharSequence) ((Object) ResourceArchive.field_j);
              HighScoreSubmission.field_y = TutorialController.normalizeDisplayName(101, var13);
              Js5Transport.field_l = PlayerContextMenu.field_e.readUnsignedByte(-126);
              RankingsScreen.field_J = GradientPaletteSupport.field_a;
              if (CookieDateSupport.field_c.payloadKind((byte) -110) == DiskArchiveRequest.field_L) {
                stackIn_67_0 = SocialListEntry.field_Xb;
                stackIn_67_1 = NanoTickClock.getApplet(78);
                stackIn_68_2 = !(param0);
                ((LoginMethod) (Object) stackIn_67_0).saveLastLoginMethodCookie(stackIn_67_1, stackIn_68_2);
              } else {
                if (CookieDateSupport.field_c.payloadKind((byte) 37) == NineSliceFrameSupport.field_b) {
                  SocketArchiveNetworkClient.field_v.saveLastLoginMethodCookie(NanoTickClock.getApplet(105), true);
                }
              }
              ArchiveLoadStep.field_e = false;
              if (var12 != null) {
                WeightedLruCache.writeSettingsCookie(NanoTickClock.getApplet(100), -124, var12);
              }
              if (UsernameSuggestionsPanel.field_V <= 0 &&
                !AccountCreationDialog.field_Gb) {
                try {
                  JavaScriptBridge.callWindowFunction((byte) 126, "unzap", NanoTickClock.getApplet(125));
                } catch (java.lang.Throwable decompiledCaughtParameter0) {
                  decompiledCaughtException = decompiledCaughtParameter0;
                  var8_ref_Throwable = decompiledCaughtException;
                }
              } else {
                try {
                  JavaScriptBridge.callWindowFunctionWithArguments("zap", new Object[]{TextInputWidget.decodeBase37Name(false, Quaternion.field_a)}, 105, NanoTickClock.getApplet(107));
                } catch (java.lang.Throwable decompiledCaughtParameter1) {
                  decompiledCaughtException = decompiledCaughtParameter1;
                  var8_ref_Throwable = decompiledCaughtException;
                }
              }
              if (UsernameSuggestionsPanel.field_V > 0) {
                CushionSegment.field_g = true;
              }
              JaggrabDownloader.field_j.initializeCipher(32, Pool.field_L);
              for (var8Lifetime1 = 0; var8Lifetime1 < 4; var8Lifetime1++) {
                Pool.field_L[var8Lifetime1] = Pool.field_L[var8Lifetime1] + 50;
              }
              PlayerContextMenu.field_e.initializeCipher(32, Pool.field_L);
              stackIn_86_0 = Bzip2DecoderState.field_c;
              return stackIn_86_0;
            }
            if (param0) {
              var10 = (String) null;
              SectorCacheStore.a(true, (String) null, false, false, 59, (String) null);
            }
            if (RankingsScreen.field_J == Quaternion.field_k &&
              PacketAvailabilitySupport.hasCompletePacket((byte) 39)) {
              ShotEvent.closeClientSocket(-64);
              if (Bzip2DecoderState.field_c == 7 &&
                !ArchiveLoadStep.field_e) {
                ArchiveLoadStep.field_e = true;
                stackIn_100_0 = -1;
                return stackIn_100_0;
              }
              if (Bzip2DecoderState.field_c == 7) {
                Bzip2DecoderState.field_c = 3;
              }
              LoginTextValue.field_g = PlayerContextMenu.field_e.readNullTerminatedString(-51);
              ArchiveLoadStep.field_e = false;
              stackIn_98_0 = Bzip2DecoderState.field_c;
              return stackIn_98_0;
            }
            if (null == Atan2Support.field_c) {
              if (ArchiveLoadStep.field_e) {
                if (30000L >= CushionSegment.millisSinceNetworkActivity((byte) 118)) {
                  LoginTextValue.field_g = DialWidget.loginm2;
                } else {
                  LoginTextValue.field_g = TabbedPane.loginm3;
                }
                ArchiveLoadStep.field_e = false;
                stackIn_107_0 = 3;
                return stackIn_107_0;
              }
              var6_intLifetime2 = TextLineLayout.field_d;
              TextLineLayout.field_d = TutorialFactory.field_a;
              ArchiveLoadStep.field_e = true;
              TutorialFactory.field_a = var6_intLifetime2;
            }
            stackIn_110_0 = -1;
            return stackIn_110_0;
          } catch (java.lang.RuntimeException decompiledCaughtParameter2) {
            decompiledCaughtException = decompiledCaughtParameter2;
            var6 = (RuntimeException) (Object) decompiledCaughtException;
            stackIn_113_0 = var6;
            stackIn_113_1 = new StringBuilder().append("np.F(").append(param0).append(',');
            if (param1 == null) {
              stackIn_114_2 = "null";
            } else {
              stackIn_114_2 = "{...}";
            }
            stackIn_116_1 = ((StringBuilder) (Object) stackIn_113_1).append(stackIn_114_2).append(',').append(param2).append(',').append(param3).append(',').append(param4).append(',');
            if (param5 == null) {
              stackIn_117_2 = "null";
            } else {
              stackIn_117_2 = "{...}";
            }
            throw ReportAbuseDialog.addExceptionContext((Throwable) ((Object) stackIn_113_0), ((StringBuilder) (Object) stackIn_116_1).append(stackIn_117_2).append(')').toString());
          }
        } catch (RuntimeException | Error decompiledUncheckedException) {
          throw decompiledUncheckedException;
        } catch (Throwable decompiledCheckedException) {
          throw new RuntimeException(decompiledCheckedException);
        }
    }

    public final String toString() {
        return "" + this.field_h;
    }

    SectorCacheStore(int param0, BufferedFile param1, BufferedFile param2, int param3) {
        this.field_f = null;
        this.field_i = null;
        this.field_b = 65000;
        try {
          this.field_i = param1;
          this.field_f = param2;
          this.field_h = param0;
          this.field_b = param3;
        } catch (RuntimeException runtimeException) {
          throw ReportAbuseDialog.addExceptionContext((Throwable) ((Object) runtimeException), "np.<init>(" + param0 + ',' + (param1 != null ? "{...}" : "null") + ',' + (param2 != null ? "{...}" : "null") + ',' + param3 + ')');
        }
    }

    static {
        muXDroppedOut = "<%0> has dropped out.";
        noOptionsAvailable = "No options available";
        achieved = "Achieved";
    }
}
