/*
 * Decompiled by CFR-JS 0.4.0.
 */
import java.io.*;

final class SocketArchiveNetworkClient extends ArchiveNetworkClient {
    static String[] field_v;
    static int[] field_t;
    static String field_u;
    private BufferedSocket field_q;
    static int field_r;
    static int[] field_s;

    final boolean pollNetwork(int param0) {
        try {
          int stackIn_62_0 = 0;
          int stackIn_79_0 = 0;
          Throwable decompiledCaughtException = null;
          long var2_long = 0L;
          NetworkArchiveRequest var2 = null;
          int var2_int = 0;
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
          NetworkArchiveRequest var14_ref = null;
          int var15 = 0;
          int var16 = 0;
          NetworkArchiveRequest var2Lifetime1;
          var16 = OrbDefence.field_D ? 1 : 0;
          if (null != this.field_q) {
            var2_long = ji.correctedCurrentTimeMillis(param0 - 278);
            var4 = (int)(var2_long - this.field_j);
            this.field_j = var2_long;
            if (var4 > 200) {
              var4 = 200;
            }
            this.field_e = this.field_e + var4;
            if (this.field_e > 30000) {
              try {
                this.field_q.close(1);
              } catch (java.lang.Exception decompiledCaughtParameter0) {
                decompiledCaughtException = decompiledCaughtParameter0;
                var5_ref_Exception = (Exception) (Object) decompiledCaughtException;
              }
              this.field_q = null;
            }
          }
          if (this.field_q == null) {
            if (this.getPriorityRequestCount(-128) == 0 &&
              this.getPrefetchRequestCount(84) == 0) {
              return true;
            }
            return false;
          }
          try {
            this.field_q.checkWriteError(-120);
            var2 = (NetworkArchiveRequest) (this.field_d.b((byte) 46));
            while (var2 != null) {
              this.field_l.position = 0;
              this.field_l.writeByte(1, -41);
              this.field_l.writeLong40(123, var2.field_h);
              this.field_q.queueWrite((byte) 30, this.field_l.payload, 0, this.field_l.payload.length);
              this.field_p.a(param0 ^ -143, var2);
              var2 = (NetworkArchiveRequest) (this.field_d.b(0));
            }
            var2Lifetime1 = (NetworkArchiveRequest) (this.field_k.b((byte) 46));
            while (var2Lifetime1 != null) {
              this.field_l.position = 0;
              this.field_l.writeByte(0, -74);
              this.field_l.writeLong40(115, var2Lifetime1.field_h);
              this.field_q.queueWrite((byte) 30, this.field_l.payload, 0, this.field_l.payload.length);
              this.field_f.a(-90, var2Lifetime1);
              var2Lifetime1 = (NetworkArchiveRequest) (this.field_k.b(0));
            }
            var2_int = 0;
            if (param0 != 255) {
              return true;
            }
            while (var2_int < 100) {
              var3_int = this.field_q.availableBytes((byte) 101);
              if (var3_int < 0) {
                throw new IOException();
              }
              if (var3_int == 0) {
                return true;
              }
              this.field_e = 0;
              var4 = 0;
              if (null == this.field_a) {
                var4 = 10;
              } else {
                if (this.field_a.field_v == 0) {
                  var4 = 1;
                }
              }
              if (var4 > 0) {
                var5 = -this.field_m.position + var4;
                if (var5 > var3_int) {
                  var5 = var3_int;
                }
                this.field_q.readFully(this.field_m.position, var5, -117, this.field_m.payload);
                if (this.field_h != 0) {
                  for (var6 = 0; var6 < var5; var6++) {
                    this.field_m.payload[this.field_m.position + var6] = (byte)gi.bitwiseXor((int) this.field_m.payload[this.field_m.position + var6], (int) this.field_h);
                  }
                }
                this.field_m.position = this.field_m.position + var5;
                if (this.field_m.position >= var4) {
                  if (this.field_a == null) {
                    this.field_m.position = 0;
                    var6 = this.field_m.readUnsignedByte((byte) 90);
                    var7 = this.field_m.readInt(0);
                    var8 = this.field_m.readUnsignedByte((byte) 90);
                    var9 = this.field_m.readInt(param0 - 255);
                    var10 = 127 & var8;
                    stackIn_62_0 = (0 == (128 & var8)) ? 0 : 1;
                    boolean decompiledFrameRemainder0 = true;
                    boolean decompiledFrameCompleted0 = true;
                    var11 = stackIn_62_0;
                    var12 = ((long)var6 << 32) + (long)var7;
                    var14 = null;
                    if (var11 == 0) {
                      var14_ref = (NetworkArchiveRequest) (this.field_p.b((byte) 46));
                      while (var14_ref != null) {
                        if (~var14_ref.field_h == ~var12) {
                          decompiledFrameCompleted0 = false;
                          break;
                        }
                        var14_ref = (NetworkArchiveRequest) (this.field_p.b(0));
                      }
                      decompiledFrameRemainder0 = !(decompiledFrameCompleted0);
                    }
                    if ((decompiledFrameRemainder0) &&
                      (decompiledFrameCompleted0)) {
                      var14_ref = (NetworkArchiveRequest) (this.field_f.b((byte) 46));
                      while (var14_ref != null) {
                        if (~var14_ref.field_h == ~var12) {
                          break;
                        }
                        var14_ref = (NetworkArchiveRequest) (this.field_f.b(0));
                      }
                    }
                    if (var14_ref == null) {
                      throw new IOException();
                    }
                    this.field_a = var14_ref;
                    stackIn_79_0 = (var10 == 0) ? 5 : 9;
                    var15 = stackIn_79_0;
                    this.field_a.field_u = new PacketBuffer(this.field_a.field_s + var9 + var15);
                    this.field_a.field_u.writeByte(var10, -99);
                    this.field_a.field_u.writeInt(var9, -1);
                    this.field_a.field_v = 10;
                    this.field_m.position = 0;
                  } else {
                    if (0 != this.field_a.field_v) {
                      throw new IOException();
                    }
                    if (this.field_m.payload[0] == -1) {
                      this.field_m.position = 0;
                      this.field_a.field_v = 1;
                    } else {
                      this.field_a = null;
                    }
                  }
                }
              } else {
                var5 = this.field_a.field_u.payload.length - this.field_a.field_s;
                var6 = 512 - this.field_a.field_v;
                if (var5 - this.field_a.field_u.position < var6) {
                  var6 = var5 - this.field_a.field_u.position;
                }
                if (var6 > var3_int) {
                  var6 = var3_int;
                }
                this.field_q.readFully(this.field_a.field_u.position, var6, 87, this.field_a.field_u.payload);
                if (this.field_h != 0) {
                  for (var7 = 0; var6 > var7; var7++) {
                    this.field_a.field_u.payload[this.field_a.field_u.position + var7] = (byte)gi.bitwiseXor((int) this.field_a.field_u.payload[this.field_a.field_u.position + var7], (int) this.field_h);
                  }
                }
                this.field_a.field_v = this.field_a.field_v + var6;
                this.field_a.field_u.position = this.field_a.field_u.position + var6;
                if (this.field_a.field_u.position == var5) {
                  this.field_a.unlinkSecondary(-1);
                  this.field_a.field_l = false;
                  this.field_a = null;
                } else {
                  if (this.field_a.field_v == 512) {
                    this.field_a.field_v = 0;
                  }
                }
              }
              var2_int++;
            }
            return true;
          } catch (java.io.IOException decompiledCaughtParameter1) {
            decompiledCaughtException = decompiledCaughtParameter1;
            var2_ref = (IOException) (Object) decompiledCaughtException;
            try {
              this.field_q.close(1);
            } catch (java.lang.Exception decompiledCaughtParameter2) {
              decompiledCaughtException = decompiledCaughtParameter2;
              var3 = (Exception) (Object) decompiledCaughtException;
            }
            this.field_q = null;
            this.field_b = this.field_b + 1;
            this.field_n = -2;
            if (this.getPriorityRequestCount(-113) == 0 &&
              this.getPrefetchRequestCount(param0 - 207) == 0) {
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

    final void resetAfterValidationFailure(int param0) {
        Exception exception = null;
        Throwable decompiledCaughtException = null;
        try {
          this.field_q.close(1);
          if (param0 > -5) {
            field_u = (String) null;
          }
        } catch (java.lang.Exception decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          exception = (Exception) (Object) decompiledCaughtException;
        }
        this.field_n = -1;
        this.field_b = this.field_b + 1;
        this.field_q = null;
        this.field_h = (byte)(int)(1.0 + Math.random() * 255.0);
    }

    final static SocketConnector a(int param0, String param1, int param2) {
        int var3_int = 0;
        RuntimeException var3 = null;
        ProxySocketConnector var4 = null;
        ProxySocketConnector stackIn_1_0 = null;
        RuntimeException stackIn_4_0 = null;
        StringBuilder stackIn_4_1 = null;
        String stackIn_5_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          var3_int = -55 % ((-3 - param2) / 32);
          var4 = new ProxySocketConnector();
          ((SocketConnector) ((Object) var4)).field_b = param0;
          ((SocketConnector) ((Object) var4)).field_a = param1;
          stackIn_1_0 = var4;
          return (SocketConnector) ((Object) stackIn_1_0);
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3 = decompiledCaughtException;
          stackIn_4_0 = var3;
          stackIn_4_1 = new StringBuilder().append("a.A(").append(param0).append(',');
          if (param1 == null) {
            stackIn_5_2 = "null";
          } else {
            stackIn_5_2 = "{...}";
          }
          throw DraggableWidgetContainer.wrapClientException((Throwable) ((Object) stackIn_4_0), ((StringBuilder) (Object) stackIn_4_1).append(stackIn_5_2).append(',').append(param2).append(')').toString());
        }
    }

    private final void sendProtocolSetup(byte param0) {
        try {
          IOException iOException = null;
          Throwable decompiledCaughtException = null;
          Exception var3 = null;
          if (null == this.field_q) {
            return;
          }
          try {
            this.field_l.position = 0;
            this.field_l.writeByte(6, -32);
            if (param0 > -73) {
              field_s = (int[]) null;
            }
            this.field_l.writeMedium(3, 127);
            this.field_l.writeShort((byte) -60, 0);
            this.field_q.queueWrite((byte) 30, this.field_l.payload, 0, this.field_l.payload.length);
          } catch (java.io.IOException decompiledCaughtParameter0) {
            decompiledCaughtException = decompiledCaughtParameter0;
            iOException = (IOException) (Object) decompiledCaughtException;
            try {
              this.field_q.close(1);
            } catch (java.lang.Exception decompiledCaughtParameter1) {
              decompiledCaughtException = decompiledCaughtParameter1;
              var3 = (Exception) (Object) decompiledCaughtException;
            }
            this.field_q = null;
            this.field_b = this.field_b + 1;
            this.field_n = -2;
          }
        } catch (RuntimeException | Error decompiledUncheckedException) {
          throw decompiledUncheckedException;
        } catch (Throwable decompiledCheckedException) {
          throw new RuntimeException(decompiledCheckedException);
        }
    }

    public static void clearStaticReferences(byte param0) {
        field_v = null;
        field_s = null;
        field_u = null;
        int var1 = -22 / ((param0 + 30) / 37);
        field_t = null;
    }

    private final void sendConnectionState(int param0, boolean param1) {
        try {
          IOException iOException = null;
          PacketBuffer stackIn_6_0 = null;
          int stackIn_7_1 = 0;
          Throwable decompiledCaughtException = null;
          Exception var4 = null;
          if (param0 > -49) {
            return;
          }
          if (null == this.field_q) {
            return;
          }
          try {
            this.field_l.position = 0;
            stackIn_6_0 = this.field_l;
            if (param1) {
              stackIn_7_1 = 2;
            } else {
              stackIn_7_1 = 3;
            }
            ((PacketBuffer) (Object) stackIn_6_0).writeByte(stackIn_7_1, -105);
            this.field_l.writeLong40(106, 0L);
            this.field_q.queueWrite((byte) 30, this.field_l.payload, 0, this.field_l.payload.length);
          } catch (java.io.IOException decompiledCaughtParameter0) {
            decompiledCaughtException = decompiledCaughtParameter0;
            iOException = (IOException) (Object) decompiledCaughtException;
            try {
              this.field_q.close(1);
            } catch (java.lang.Exception decompiledCaughtParameter1) {
              decompiledCaughtException = decompiledCaughtParameter1;
              var4 = (Exception) (Object) decompiledCaughtException;
            }
            this.field_n = -2;
            this.field_q = null;
            this.field_b = this.field_b + 1;
          }
        } catch (RuntimeException | Error decompiledUncheckedException) {
          throw decompiledUncheckedException;
        } catch (Throwable decompiledCheckedException) {
          throw new RuntimeException(decompiledCheckedException);
        }
    }

    final static db[] a(PlatformTaskDispatcher param0, int param1) {
        int var6 = 0;
        db[] stackIn_3_0 = null;
        db[] stackIn_9_0 = null;
        db[] stackIn_14_0 = null;
        RuntimeException stackIn_17_0 = null;
        StringBuilder stackIn_17_1 = null;
        String stackIn_18_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var2 = null;
        int[] var3 = null;
        db[] var4 = null;
        int var5 = 0;
        db var7 = null;
        int var8 = 0;
        PlatformTask var9 = null;
        int[] var10 = null;
        int[] var11 = null;
        var8 = OrbDefence.field_D ? 1 : 0;
        try {
          if (!param0.isFullscreenAvailable((byte) -120)) {
            stackIn_3_0 = new db[]{};
            return stackIn_3_0;
          }
          var9 = param0.requestDisplayModes((byte) 31);
          while (0 == var9.status) {
            hb.sleepMillis(10L, 103);
          }
          if (var9.status == 2) {
            stackIn_9_0 = new db[]{};
            return stackIn_9_0;
          }
          var11 = (int[]) (var9.result);
          var10 = var11;
          var3 = var10;
          var4 = new db[var11.length >> 2];
          var5 = 16 / ((param1 + 29) / 44);
          for (var6 = 0; var6 < var4.length; var6++) {
            var7 = new db();
            var4[var6] = var7;
            var7.field_d = var3[var6 << 2];
            var7.field_b = var3[1 + (var6 << 2)];
            var7.field_e = var3[(var6 << 2) + 2];
            var7.field_a = var3[3 + (var6 << 2)];
          }
          stackIn_14_0 = var4;
          return stackIn_14_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2 = decompiledCaughtException;
          stackIn_17_0 = var2;
          stackIn_17_1 = new StringBuilder().append("a.E(");
          if (param0 == null) {
            stackIn_18_2 = "null";
          } else {
            stackIn_18_2 = "{...}";
          }
          throw DraggableWidgetContainer.wrapClientException((Throwable) ((Object) stackIn_17_0), ((StringBuilder) (Object) stackIn_17_1).append(stackIn_18_2).append(',').append(param1).append(')').toString());
        }
    }

    final void close(int param0) {
        if (param0 != 1) {
          return;
        }
        if (this.field_q != null) {
          this.field_q.close(1);
        }
    }

    final void attachSocket(Object param0, int param1, boolean param2) {
        try {
          RuntimeException stackIn_28_0 = null;
          StringBuilder stackIn_28_1 = null;
          String stackIn_29_2 = null;
          Throwable decompiledCaughtException = null;
          Exception var4 = null;
          NetworkArchiveRequest var4_ref = null;
          IOException var4_ref2 = null;
          RuntimeException var4_ref3 = null;
          Exception var5 = null;
          int var6 = 0;
          NetworkArchiveRequest var4_refLifetime1;
          var6 = OrbDefence.field_D ? 1 : 0;
          try {
            if (null != this.field_q) {
              try {
                this.field_q.close(param1 - 19);
              } catch (java.lang.Exception decompiledCaughtParameter0) {
                decompiledCaughtException = decompiledCaughtParameter0;
                var4 = (Exception) (Object) decompiledCaughtException;
              }
              this.field_q = null;
            }
            this.field_q = (BufferedSocket) (param0);
            this.sendProtocolSetup((byte) -103);
            this.sendConnectionState(-54, param2);
            this.field_a = null;
            this.field_m.position = 0;
            while (true) {
              var4_ref = (NetworkArchiveRequest) (this.field_p.c(30664));
              if (var4_ref != null) {
                this.field_d.a(-79, var4_ref);
                continue;
              }
              break;
            }
            while (true) {
              var4_refLifetime1 = (NetworkArchiveRequest) (this.field_f.c(30664));
              if (var4_refLifetime1 != null) {
                this.field_k.a(-63, var4_refLifetime1);
                continue;
              }
              break;
            }
            if (this.field_h != 0) {
              try {
                this.field_l.position = 0;
                this.field_l.writeByte(4, -80);
                this.field_l.writeByte((int) this.field_h, -85);
                this.field_l.writeInt(0, -1);
                this.field_q.queueWrite((byte) 30, this.field_l.payload, 0, this.field_l.payload.length);
              } catch (java.io.IOException decompiledCaughtParameter1) {
                decompiledCaughtException = decompiledCaughtParameter1;
                var4_ref2 = (IOException) (Object) decompiledCaughtException;
                try {
                  this.field_q.close(1);
                } catch (java.lang.Exception decompiledCaughtParameter2) {
                  decompiledCaughtException = decompiledCaughtParameter2;
                  var5 = (Exception) (Object) decompiledCaughtException;
                }
                this.field_b = this.field_b + 1;
                this.field_n = -2;
                this.field_q = null;
              }
            }
            this.field_e = 0;
            this.field_j = ji.correctedCurrentTimeMillis(107);
            if (param1 != 20) {
              field_s = (int[]) null;
            }
            return;
          } catch (java.lang.RuntimeException decompiledCaughtParameter3) {
            decompiledCaughtException = decompiledCaughtParameter3;
            var4_ref3 = (RuntimeException) (Object) decompiledCaughtException;
            stackIn_28_0 = var4_ref3;
            stackIn_28_1 = new StringBuilder().append("a.G(");
            if (param0 == null) {
              stackIn_29_2 = "null";
            } else {
              stackIn_29_2 = "{...}";
            }
            throw DraggableWidgetContainer.wrapClientException((Throwable) ((Object) stackIn_28_0), ((StringBuilder) (Object) stackIn_28_1).append(stackIn_29_2).append(',').append(param1).append(',').append(param2).append(')').toString());
          }
        } catch (RuntimeException | Error decompiledUncheckedException) {
          throw decompiledUncheckedException;
        } catch (Throwable decompiledCheckedException) {
          throw new RuntimeException(decompiledCheckedException);
        }
    }

    public SocketArchiveNetworkClient() {
    }

    final static void a(int param0, int param1, int param2, int param3, int param4, int param5) {
        ValidationStatusWidget.field_U[MusicPatchEnvelope.field_d] = param0;
        AccountNameAvailabilityValidator.field_o[MusicPatchEnvelope.field_d] = MusicPatchEnvelope.field_d;
        tl.field_d[MusicPatchEnvelope.field_d] = param3;
        if (!(param3 <= hc.field_j)) {
          jl.field_d = param3;
        }
        if (am.field_e > param3) {
          KeyboardListener.field_a = param3;
        }
        DiskCacheWorker.field_g[MusicPatchEnvelope.field_d] = param5;
        th.field_f[MusicPatchEnvelope.field_d] = param1;
        ld.field_b[MusicPatchEnvelope.field_d] = param4;
        int var6 = param4 + (param5 + param1);
        int var7 = var6 == 0 ? 0 : 1000 * param5 / var6;
        rh.field_c[MusicPatchEnvelope.field_d] = var7;
        if (param2 != 9664) {
          field_t = (int[]) null;
        }
        if (!(var7 <= jl.field_d)) {
          jl.field_d = var7;
        }
        MusicPatchEnvelope.field_d = MusicPatchEnvelope.field_d + 1;
        if (KeyboardListener.field_a > var7) {
          KeyboardListener.field_a = var7;
        }
    }

    static {
        field_v = new String[]{"All other member expansions", "Loads more Achievements", "Full community features"};
        field_t = new int[8192];
        field_u = "Confirm Email:";
        field_s = new int[8192];
    }
}
