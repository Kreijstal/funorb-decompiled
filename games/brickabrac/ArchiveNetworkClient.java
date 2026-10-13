/*
 * Decompiled by CFR-JS 0.4.0.
 */
import java.io.*;

final class ArchiveNetworkClient extends ArchiveFetchClient {
    static TextFont field_u;
    static String field_t;
    static RgbSprite[] field_s;
    private BufferedSocket transport;
    static String field_r;

    final static void a(int param0, MultiplayerMatch param1, PlayerBoard param2) {
        RuntimeException stackIn_25_0 = null;
        StringBuilder stackIn_25_1 = null;
        String stackIn_26_2 = null;
        StringBuilder stackIn_28_1 = null;
        String stackIn_29_2 = null;
        RuntimeException decompiledCaughtException = null;
        int var3_int = 0;
        RuntimeException var3 = null;
        RgbSprite var4 = null;
        RgbSprite var5 = null;
        int var6 = 0;
        RgbSprite[] var7 = null;
        RgbSprite var9 = null;
        RgbSprite var10 = null;
        try {
          if (oa.currentBackground == null) {
            return;
          }
          var3_int = 256 * MenuScreen.field_i / 32;
          var4 = oa.currentBackground.c((byte) -123);
          if (var4 != null) {
            if (MenuScreen.field_i == 0) {
              var4.drawTransparent(-var4.canvasWidth + 640, 470 - var4.canvasHeight);
            } else {
              var4.b(-var4.canvasWidth + 640, 470 - var4.canvasHeight, 256 - var3_int);
            }
          }
          if (param0 != 640) {
            field_r = (String) null;
          }
          if (MenuScreen.field_i > 0 &&
            ArchiveFetchClient.field_k != null) {
            ArchiveFetchClient.field_k.b(640 - ArchiveFetchClient.field_k.canvasWidth, 480 - ArchiveFetchClient.field_k.canvasHeight - 10, var3_int);
          }
          var5 = IntrusiveNode.field_f[param2.field_y];
          if (var4 != null) {
            var5.drawTransparent(-3 + (640 - (var4.canvasWidth + var5.canvasWidth) / 2), -var4.canvasHeight + 480 - 10 + 45);
          }
          var6 = kb.a(param1, 0, 100, param2);
          var7 = oa.currentBackground.b(param0 ^ -746);
          if (var7 != null) {
            var9 = var7[var6];
            var9.drawTransparent(-20 + (-var9.canvasWidth + 640), 520 - var9.canvasHeight);
          }
          if (MenuScreen.field_i > 0) {
            if (null == fq.field_c) {
              return;
            }
            var10 = fq.field_c[var6];
            var10.b(-var10.canvasWidth + 620, 40 + (-var10.canvasHeight + 480), var3_int);
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3 = decompiledCaughtException;
          stackIn_25_0 = var3;
          stackIn_25_1 = new StringBuilder().append("a.B(").append(param0).append(',');
          if (param1 == null) {
            stackIn_26_2 = "null";
          } else {
            stackIn_26_2 = "{...}";
          }
          stackIn_28_1 = ((StringBuilder) (Object) stackIn_25_1).append(stackIn_26_2).append(',');
          if (param2 == null) {
            stackIn_29_2 = "null";
          } else {
            stackIn_29_2 = "{...}";
          }
          throw FarmBackground.addExceptionContext((Throwable) ((Object) stackIn_25_0), ((StringBuilder) (Object) stackIn_28_1).append(stackIn_29_2).append(')').toString());
        }
    }

    private final void g(byte param0) {
        try {
          IOException iOException = null;
          int var2 = 0;
          Throwable decompiledCaughtException = null;
          Exception var4 = null;
          if (this.transport == null) {
            return;
          }
          var2 = 74 % ((param0 - 14) / 57);
          try {
            this.controlPacket.position = 0;
            this.controlPacket.writeByte(44, 6);
            this.controlPacket.writeMedium((byte) 47, 3);
            this.controlPacket.writeShort((byte) 125, 0);
            this.transport.write(this.controlPacket.data, true, this.controlPacket.data.length, 0);
          } catch (java.io.IOException decompiledCaughtParameter0) {
            decompiledCaughtException = decompiledCaughtParameter0;
            iOException = (IOException) (Object) decompiledCaughtException;
            try {
              this.transport.close((byte) 112);
            } catch (java.lang.Exception decompiledCaughtParameter1) {
              decompiledCaughtException = decompiledCaughtParameter1;
              var4 = (Exception) (Object) decompiledCaughtException;
            }
            this.lastError = -2;
            this.transport = null;
            this.failureCount = this.failureCount + 1;
          }
        } catch (RuntimeException | Error decompiledUncheckedException) {
          throw decompiledUncheckedException;
        } catch (Throwable decompiledCheckedException) {
          throw new RuntimeException(decompiledCheckedException);
        }
    }

    final boolean pollTransport(int obfuscationGuard) {
        try {
          int var2_int = 0;
          int stackIn_50_0 = 0;
          int stackIn_66_0 = 0;
          Throwable decompiledCaughtException = null;
          long var2_long = 0L;
          ArchiveNetworkRequest var2 = null;
          IOException var2_ref = null;
          int var3_int = 0;
          Exception var3 = null;
          int var4 = 0;
          Exception var5_ref_Exception = null;
          int var5 = 0;
          int var6 = 0;
          int var7 = 0;
          int var8 = 0;
          int var9 = 0;
          int var10 = 0;
          int var11 = 0;
          long var12 = 0L;
          Object var14 = null;
          ArchiveNetworkRequest var14_ref = null;
          int var15 = 0;
          int var16 = 0;
          ArchiveNetworkRequest var2Lifetime1;
          var16 = BrickABrac.field_J ? 1 : 0;
          if (this.transport != null) {
            var2_long = MonotonicTime.nowMillis(false);
            var4 = (int)(var2_long - this.lastPollMillis);
            if (var4 > 200) {
              var4 = 200;
            }
            this.lastPollMillis = var2_long;
            this.idleMillis = this.idleMillis + var4;
            if (this.idleMillis > 30000) {
              try {
                this.transport.close((byte) 120);
              } catch (java.lang.Exception decompiledCaughtParameter0) {
                decompiledCaughtException = decompiledCaughtParameter0;
                var5_ref_Exception = (Exception) (Object) decompiledCaughtException;
              }
              this.transport = null;
            }
          }
          if (this.transport == null) {
            if (0 != this.getPriorityCount((byte) -67)) {
              return false;
            }
            if (this.getBackgroundCount((byte) -105) == 0) {
              return true;
            }
            return false;
          }
          try {
            this.transport.checkWriteError(-1);
            var2 = (ArchiveNetworkRequest) (this.pendingPriority.first(true));
            while (var2 != null) {
              this.controlPacket.position = 0;
              this.controlPacket.writeByte(-102, 1);
              this.controlPacket.writeLong40(var2.secondaryKey, (byte) -32);
              this.transport.write(this.controlPacket.data, true, this.controlPacket.data.length, 0);
              this.activePriority.addLast(var2, false);
              var2 = (ArchiveNetworkRequest) (this.pendingPriority.next(-8394));
            }
            var2Lifetime1 = (ArchiveNetworkRequest) (this.pendingBackground.first(true));
            while (var2Lifetime1 != null) {
              this.controlPacket.position = 0;
              this.controlPacket.writeByte(-128, 0);
              this.controlPacket.writeLong40(var2Lifetime1.secondaryKey, (byte) -32);
              this.transport.write(this.controlPacket.data, true, this.controlPacket.data.length, 0);
              this.activeBackground.addLast(var2Lifetime1, false);
              var2Lifetime1 = (ArchiveNetworkRequest) (this.pendingBackground.next(-8394));
            }
            if (obfuscationGuard <= 10) {
              ArchiveNetworkClient.h((byte) -19);
            }
            for (var2_int = 0; 100 > var2_int; var2_int++) {
              var3_int = this.transport.available(10434);
              if (var3_int < 0) {
                throw new IOException();
              }
              if (0 != var3_int) {
                this.idleMillis = 0;
                var4 = 0;
                if (null == this.currentResponse) {
                  var4 = 10;
                } else {
                  if (0 == this.currentResponse.blockPosition) {
                    var4 = 1;
                  }
                }
                if (var4 <= 0) {
                  var5 = -this.currentResponse.trailerBytes + this.currentResponse.packet.data.length;
                  var6 = 512 - this.currentResponse.blockPosition;
                  if (var6 > var5 - this.currentResponse.packet.position) {
                    var6 = var5 - this.currentResponse.packet.position;
                  }
                  if (var3_int < var6) {
                    var6 = var3_int;
                  }
                  this.transport.readFully(25826, this.currentResponse.packet.data, var6, this.currentResponse.packet.position);
                  if (this.xorKey != 0) {
                    for (var7 = 0; var7 < var6; var7++) {
                      this.currentResponse.packet.data[var7 + this.currentResponse.packet.position] = (byte)LevelResultSubmission.a((int) this.currentResponse.packet.data[var7 + this.currentResponse.packet.position], (int) this.xorKey);
                    }
                  }
                  this.currentResponse.blockPosition = this.currentResponse.blockPosition + var6;
                  this.currentResponse.packet.position = this.currentResponse.packet.position + var6;
                  if (var5 != this.currentResponse.packet.position) {
                    if (this.currentResponse.blockPosition == 512) {
                      this.currentResponse.blockPosition = 0;
                    }
                  } else {
                    this.currentResponse.unlinkSecondary(3);
                    this.currentResponse.pending = false;
                    this.currentResponse = null;
                  }
                } else {
                  var5 = var4 - this.responseHeader.position;
                  if (var3_int < var5) {
                    var5 = var3_int;
                  }
                  this.transport.readFully(25826, this.responseHeader.data, var5, this.responseHeader.position);
                  if (0 != this.xorKey) {
                    for (var6 = 0; var6 < var5; var6++) {
                      this.responseHeader.data[this.responseHeader.position + var6] = (byte)LevelResultSubmission.a((int) this.responseHeader.data[this.responseHeader.position + var6], (int) this.xorKey);
                    }
                  }
                  this.responseHeader.position = this.responseHeader.position + var5;
                  if (this.responseHeader.position >= var4) {
                    if (null == this.currentResponse) {
                      this.responseHeader.position = 0;
                      var6 = this.responseHeader.readUnsignedByte(255);
                      var7 = this.responseHeader.readInt(255);
                      var8 = this.responseHeader.readUnsignedByte(255);
                      var9 = this.responseHeader.readInt(255);
                      var10 = var8 & 127;
                      stackIn_50_0 = (0 == (var8 & 128)) ? 0 : 1;
                      boolean decompiledFrameRemainder0 = true;
                      boolean decompiledFrameCompleted0 = true;
                      var11 = stackIn_50_0;
                      var12 = (long)var7 + ((long)var6 << 32);
                      var14 = null;
                      if (var11 == 0) {
                        var14_ref = (ArchiveNetworkRequest) (this.activePriority.first(true));
                        while (var14_ref != null) {
                          if (var14_ref.secondaryKey == var12) {
                            decompiledFrameCompleted0 = false;
                            break;
                          }
                          var14_ref = (ArchiveNetworkRequest) (this.activePriority.next(-8394));
                        }
                        decompiledFrameRemainder0 = !(decompiledFrameCompleted0);
                      }
                      if ((decompiledFrameRemainder0) &&
                        (decompiledFrameCompleted0)) {
                        var14_ref = (ArchiveNetworkRequest) (this.activeBackground.first(true));
                        while (var14_ref != null) {
                          if (var12 == var14_ref.secondaryKey) {
                            break;
                          }
                          var14_ref = (ArchiveNetworkRequest) (this.activeBackground.next(-8394));
                        }
                      }
                      if (var14_ref == null) {
                        throw new IOException();
                      }
                      stackIn_66_0 = (var10 != 0) ? 9 : 5;
                      var15 = stackIn_66_0;
                      this.currentResponse = var14_ref;
                      this.currentResponse.packet = new PacketBuffer(var9 + var15 + this.currentResponse.trailerBytes);
                      this.currentResponse.packet.writeByte(-107, var10);
                      this.currentResponse.packet.writeInt(var9, (byte) -79);
                      this.currentResponse.blockPosition = 10;
                      this.responseHeader.position = 0;
                    } else {
                      if (0 != this.currentResponse.blockPosition) {
                        throw new IOException();
                      }
                      if (this.responseHeader.data[0] == -1) {
                        this.responseHeader.position = 0;
                        this.currentResponse.blockPosition = 1;
                      } else {
                        this.currentResponse = null;
                      }
                    }
                  }
                }
                continue;
              }
              break;
            }
            return true;
          } catch (java.io.IOException decompiledCaughtParameter1) {
            decompiledCaughtException = decompiledCaughtParameter1;
            var2_ref = (IOException) (Object) decompiledCaughtException;
            try {
              this.transport.close((byte) 119);
            } catch (java.lang.Exception decompiledCaughtParameter2) {
              decompiledCaughtException = decompiledCaughtParameter2;
              var3 = (Exception) (Object) decompiledCaughtException;
            }
            this.lastError = -2;
            this.transport = null;
            this.failureCount = this.failureCount + 1;
            if (this.getPriorityCount((byte) -41) == 0 &&
              0 == this.getBackgroundCount((byte) 101)) {
              return true;
            }
            return false;
          }
        } catch (RuntimeException | Error decompiledUncheckedException) {
          throw decompiledUncheckedException;
        } catch (Throwable decompiledCheckedException) {
          throw new RuntimeException(decompiledCheckedException);
        }
    }

    final static boolean a(int param0, mp param1, mp param2) {
        int var3_int = 0;
        RuntimeException var3 = null;
        int var4 = 0;
        RuntimeException stackIn_19_0 = null;
        StringBuilder stackIn_19_1 = null;
        String stackIn_20_2 = null;
        StringBuilder stackIn_22_1 = null;
        String stackIn_23_2 = null;
        RuntimeException decompiledCaughtException = null;
        var4 = BrickABrac.field_J ? 1 : 0;
        try {
          var3_int = param2.field_Sb - param1.field_Sb;
          if (rk.field_Tb != param2.field_Ub) {
            if (null == param2.field_Ub) {
              var3_int += 200;
            }
          } else {
            var3_int -= 200;
          }
          if (param0 != 200) {
            return false;
          }
          if (rk.field_Tb == param1.field_Ub) {
            var3_int += 200;
          } else {
            if (param1.field_Ub == null) {
              var3_int -= 200;
            }
          }
          return !(var3_int <= 0);
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3 = decompiledCaughtException;
          stackIn_19_0 = var3;
          stackIn_19_1 = new StringBuilder().append("a.I(").append(param0).append(',');
          if (param1 == null) {
            stackIn_20_2 = "null";
          } else {
            stackIn_20_2 = "{...}";
          }
          stackIn_22_1 = ((StringBuilder) (Object) stackIn_19_1).append(stackIn_20_2).append(',');
          if (param2 == null) {
            stackIn_23_2 = "null";
          } else {
            stackIn_23_2 = "{...}";
          }
          throw FarmBackground.addExceptionContext((Throwable) ((Object) stackIn_19_0), ((StringBuilder) (Object) stackIn_22_1).append(stackIn_23_2).append(')').toString());
        }
    }

    final void reportIntegrityFailure(byte obfuscationGuard) {
        try {
          this.transport.close((byte) 113);
        } catch (Exception exception) {
        }
        this.failureCount = this.failureCount + 1;
        if (obfuscationGuard != 8) {
          return;
        }
        this.lastError = -1;
        this.transport = null;
        this.xorKey = (byte)(int)(1.0 + 255.0 * Math.random());
    }

    public static void h(byte param0) {
        field_r = null;
        if (param0 > -92) {
          ArchiveNetworkClient.h((byte) 64);
        }
        field_u = null;
        field_s = null;
        field_t = null;
    }

    final static void f(byte param0) {
        int var2 = 0;
        int var1_int = 0;
        int var3 = 0;
        int var4 = 0;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var1 = null;
        var4 = BrickABrac.field_J ? 1 : 0;
        try {
          var1_int = ArcticBackground.faceDepthBucketCounts[0];
          if (param0 != 94) {
            ArchiveNetworkClient.f((byte) 52);
          }
          for (var2 = 1; ArcticBackground.faceDepthBucketCounts.length > var2; var2++) {
            var3 = ArcticBackground.faceDepthBucketCounts[var2];
            ArrayOperations.copy(ek.sortedFaceIds, var2 << 4, ek.sortedFaceIds, var1_int, var3);
            var1_int = var1_int + var3;
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var1 = decompiledCaughtException;
          throw FarmBackground.addExceptionContext((Throwable) ((Object) var1), "a.F(" + param0 + ')');
        }
    }

    final void attachTransport(Object transport, boolean connectionMode, int obfuscationGuard) {
        try {
          RuntimeException stackIn_26_0 = null;
          StringBuilder stackIn_26_1 = null;
          String stackIn_27_2 = null;
          Throwable decompiledCaughtException = null;
          Exception var4 = null;
          ArchiveNetworkRequest var4_ref = null;
          IOException var4_ref2 = null;
          RuntimeException var4_ref3 = null;
          Exception var5 = null;
          int var6 = 0;
          ArchiveNetworkRequest var4_refLifetime1;
          var6 = BrickABrac.field_J ? 1 : 0;
          try {
            if (this.transport != null) {
              try {
                this.transport.close((byte) 114);
              } catch (java.lang.Exception decompiledCaughtParameter0) {
                decompiledCaughtException = decompiledCaughtParameter0;
                var4 = (Exception) (Object) decompiledCaughtException;
              }
              this.transport = null;
            }
            this.transport = (BufferedSocket) (transport);
            this.g((byte) 116);
            this.a(connectionMode, false);
            if (obfuscationGuard != 12) {
              this.reportIntegrityFailure((byte) -71);
            }
            this.responseHeader.position = 0;
            this.currentResponse = null;
            while (true) {
              var4_ref = (ArchiveNetworkRequest) (this.activePriority.removeFirst(25609));
              if (var4_ref != null) {
                this.pendingPriority.addLast(var4_ref, false);
                continue;
              }
              break;
            }
            while (true) {
              var4_refLifetime1 = (ArchiveNetworkRequest) (this.activeBackground.removeFirst(obfuscationGuard + 25597));
              if (var4_refLifetime1 != null) {
                this.pendingBackground.addLast(var4_refLifetime1, false);
                continue;
              }
              break;
            }
            if (this.xorKey != 0) {
              try {
                this.controlPacket.position = 0;
                this.controlPacket.writeByte(obfuscationGuard + 50, 4);
                this.controlPacket.writeByte(40, (int) this.xorKey);
                this.controlPacket.writeInt(0, (byte) -79);
                this.transport.write(this.controlPacket.data, true, this.controlPacket.data.length, 0);
              } catch (java.io.IOException decompiledCaughtParameter1) {
                decompiledCaughtException = decompiledCaughtParameter1;
                var4_ref2 = (IOException) (Object) decompiledCaughtException;
                try {
                  this.transport.close((byte) 116);
                } catch (java.lang.Exception decompiledCaughtParameter2) {
                  decompiledCaughtException = decompiledCaughtParameter2;
                  var5 = (Exception) (Object) decompiledCaughtException;
                }
                this.failureCount = this.failureCount + 1;
                this.transport = null;
                this.lastError = -2;
              }
            }
            this.idleMillis = 0;
            this.lastPollMillis = MonotonicTime.nowMillis(false);
            return;
          } catch (java.lang.RuntimeException decompiledCaughtParameter3) {
            decompiledCaughtException = decompiledCaughtParameter3;
            var4_ref3 = (RuntimeException) (Object) decompiledCaughtException;
            stackIn_26_0 = var4_ref3;
            stackIn_26_1 = new StringBuilder().append("a.E(");
            if (transport == null) {
              stackIn_27_2 = "null";
            } else {
              stackIn_27_2 = "{...}";
            }
            throw FarmBackground.addExceptionContext((Throwable) ((Object) stackIn_26_0), ((StringBuilder) (Object) stackIn_26_1).append(stackIn_27_2).append(',').append(connectionMode).append(',').append(obfuscationGuard).append(')').toString());
          }
        } catch (RuntimeException | Error decompiledUncheckedException) {
          throw decompiledUncheckedException;
        } catch (Throwable decompiledCheckedException) {
          throw new RuntimeException(decompiledCheckedException);
        }
    }

    final void closeTransport(byte obfuscationGuard) {
        if (this.transport != null) {
          this.transport.close((byte) 111);
        }
        if (obfuscationGuard != 30) {
          this.g((byte) -72);
        }
    }

    private final void a(boolean param0, boolean param1) {
        try {
          IOException iOException = null;
          PacketBuffer stackIn_6_0 = null;
          int stackIn_6_1 = 0;
          int stackIn_7_2 = 0;
          Throwable decompiledCaughtException = null;
          Exception var4 = null;
          if (this.transport == null) {
            return;
          }
          try {
            this.controlPacket.position = 0;
            if (param1) {
              return;
            }
            stackIn_6_0 = this.controlPacket;
            stackIn_6_1 = 37;
            if (!param0) {
              stackIn_7_2 = 3;
            } else {
              stackIn_7_2 = 2;
            }
            ((PacketBuffer) (Object) stackIn_6_0).writeByte(stackIn_6_1, stackIn_7_2);
            this.controlPacket.writeLong40(0L, (byte) -32);
            this.transport.write(this.controlPacket.data, true, this.controlPacket.data.length, 0);
          } catch (java.io.IOException decompiledCaughtParameter0) {
            decompiledCaughtException = decompiledCaughtParameter0;
            iOException = (IOException) (Object) decompiledCaughtException;
            try {
              this.transport.close((byte) 117);
            } catch (java.lang.Exception decompiledCaughtParameter1) {
              decompiledCaughtException = decompiledCaughtParameter1;
              var4 = (Exception) (Object) decompiledCaughtException;
            }
            this.lastError = -2;
            this.failureCount = this.failureCount + 1;
            this.transport = null;
          }
        } catch (RuntimeException | Error decompiledUncheckedException) {
          throw decompiledUncheckedException;
        } catch (Throwable decompiledCheckedException) {
          throw new RuntimeException(decompiledCheckedException);
        }
    }

    public ArchiveNetworkClient() {
    }

    static {
        field_t = "Enter name of friend to add to list";
        field_r = "Music: ";
    }
}
