/*
 * Decompiled by CFR-JS 0.4.0.
 */
import java.io.*;

final class SocketArchiveNetworkClient extends Js5Transport {
    static ml field_v;
    static UiComponent field_x;
    static int field_u;
    private BufferedSocket socket;

    private final void sendSetupPacket(int param0) {
        try {
          IOException iOException = null;
          Throwable decompiledCaughtException = null;
          Exception var3 = null;
          if (null == this.socket) {
            return;
          }
          try {
            this.outgoingControl.position = 0;
            this.outgoingControl.a(6, false);
            if (param0 >= -36) {
              return;
            }
            this.outgoingControl.b(3, 99);
            this.outgoingControl.writeShort((byte) -81, 0);
            this.socket.a(this.outgoingControl.payload, (byte) -105, this.outgoingControl.payload.length, 0);
          } catch (java.io.IOException decompiledCaughtParameter0) {
            decompiledCaughtException = decompiledCaughtParameter0;
            iOException = (IOException) (Object) decompiledCaughtException;
            try {
              this.socket.c(-114);
            } catch (java.lang.Exception decompiledCaughtParameter1) {
              decompiledCaughtException = decompiledCaughtParameter1;
              var3 = (Exception) (Object) decompiledCaughtException;
            }
            this.field_a = -2;
            this.field_e = this.field_e + 1;
            this.socket = null;
          }
        } catch (RuntimeException | Error decompiledUncheckedException) {
          throw decompiledUncheckedException;
        } catch (Throwable decompiledCheckedException) {
          throw new RuntimeException(decompiledCheckedException);
        }
    }

    final void resetAfterValidationFailure(byte param0) {
        try {
          this.socket.c(-98);
        } catch (Exception exception) {
        }
        this.field_a = -1;
        if (param0 >= -4) {
          this.socket = (BufferedSocket) null;
        }
        this.field_e = this.field_e + 1;
        this.socket = null;
        this.field_c = (byte)(int)(Math.random() * 255.0 + 1.0);
    }

    final static IntrusiveDeque a(int[] param0, int param1, String param2, int param3, BitmapFont param4, boolean param5, int param6) {
        int var11 = 0;
        int var13 = 0;
        IntrusiveDeque stackIn_2_0 = null;
        IntrusiveDeque stackIn_42_0 = null;
        RuntimeException stackIn_45_0 = null;
        StringBuilder stackIn_45_1 = null;
        String stackIn_46_2 = null;
        StringBuilder stackIn_48_1 = null;
        String stackIn_49_2 = null;
        StringBuilder stackIn_51_1 = null;
        String stackIn_52_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var7 = null;
        String[] var8 = null;
        int var9 = 0;
        String var10 = null;
        String[] var12 = null;
        String var14 = null;
        int var15 = 0;
        int var16 = 0;
        int var17 = 0;
        int var18 = 0;
        TextHotspotRegion var19 = null;
        TextHotspotRegion var20 = null;
        int var21 = 0;
        int var22 = 0;
        int var23 = 0;
        int var24 = 0;
        int var25 = 0;
        IntrusiveDeque var26 = null;
        try {
          var26 = new IntrusiveDeque();
          var8 = new String[100];
          if (!param5) {
            stackIn_2_0 = (IntrusiveDeque) null;
            return stackIn_2_0;
          }
          var9 = param4.a(param2, new int[]{param1}, var8);
          var10 = param2.toLowerCase();
          for (var11 = 0; var11 < lb.field_P.length; var11++) {
            var12 = lb.field_P[var11];
            for (var13 = 0; var12.length > var13; var13++) {
              var14 = var12[var13];
              if (var14 != null) {
                var15 = var14.length();
                if (var15 != 0) {
                  var16 = var10.indexOf(var14);
                  while (-1 != var16) {
                    boolean decompiledFrameRemainder0 = true;
                    if (var16 > 0) {
                      decompiledFrameRemainder0 = !(ContextMenu.a(var10.charAt(-1 + var16), 22987));
                      if ((decompiledFrameRemainder0) &&
                        (35 == var10.charAt(-1 + var16))) {
                        var16 = var10.indexOf(var14, var16 + 1);
                        continue;
                      }
                    }
                    if ((decompiledFrameRemainder0) && (!(var10.length() > var15 + var16) ||
                      !ContextMenu.a(var10.charAt(var16 + var15), 22987))) {
                      var17 = var15 + var16;
                      var18 = 0;
                      var19 = new TextHotspotRegion(var11);
                      var20 = var19;
                      var21 = 0;
                      var22 = param3;
                      scanLoop1: while (true) {
                        if (var21 < var9) {
                          var23 = var8[var21].length();
                          var24 = param0[(-1 + (var21 + param0.length)) % param0.length];
                          if (var18 <= var16 &&
                            var18 + var23 > var16) {
                            var25 = param4.b(var8[var21].substring(0, var16 - var18));
                            var20.field_r = 1 + param4.maxAscent + param4.maxDescent;
                            var20.field_m = param6 + var25;
                            var20.field_q = var22;
                            if (var17 >= var18 &&
                              var23 + var18 >= var17) {
                              var20.field_l = param4.b(var8[var21].substring(-var18 + var16, var17 - var18));
                              break scanLoop1;
                            }
                            var20.field_l = param4.b(var8[var21].substring(var16 - var18));
                            var20.next = new TextHotspotRegion(var20.field_p);
                            var20 = var20.next;
                          } else {
                            if (var18 <= var17 &&
                              var17 < var23 + var18) {
                              var25 = param4.b(var8[var21].substring(0, -var18 + var17));
                              var20.field_m = param6;
                              var20.field_l = var25;
                              var20.field_q = var22;
                              var20.field_r = var24;
                              break scanLoop1;
                            }
                            if (var16 < var18 &&
                              var18 + var23 < var17) {
                              var20.field_l = param1;
                              var20.field_m = param6;
                              var20.field_r = var24;
                              var20.field_q = var22;
                              var20.next = new TextHotspotRegion(var20.field_p);
                              var20 = var20.next;
                            }
                          }
                          if (var8[var21].endsWith("<br>")) {
                            var18 = var18 + var23;
                          } else {
                            var18 = var18 + (var23 + 1);
                          }
                          var21++;
                          var22 = var22 + param0[var21 % param0.length];
                          continue;
                        }
                        break;
                      }
                      var26.b((byte) 116, var19);
                    }
                    var16 = var10.indexOf(var14, var16 + 1);
                  }
                }
              }
            }
          }
          stackIn_42_0 = var26;
          return stackIn_42_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var7 = decompiledCaughtException;
          stackIn_45_0 = var7;
          stackIn_45_1 = new StringBuilder().append("ug.G(");
          if (param0 == null) {
            stackIn_46_2 = "null";
          } else {
            stackIn_46_2 = "{...}";
          }
          stackIn_48_1 = ((StringBuilder) (Object) stackIn_45_1).append(stackIn_46_2).append(',').append(param1).append(',');
          if (param2 == null) {
            stackIn_49_2 = "null";
          } else {
            stackIn_49_2 = "{...}";
          }
          stackIn_51_1 = ((StringBuilder) (Object) stackIn_48_1).append(stackIn_49_2).append(',').append(param3).append(',');
          if (param4 == null) {
            stackIn_52_2 = "null";
          } else {
            stackIn_52_2 = "{...}";
          }
          throw ReportAbuseDialog.addExceptionContext((Throwable) ((Object) stackIn_45_0), ((StringBuilder) (Object) stackIn_51_1).append(stackIn_52_2).append(',').append(param5).append(',').append(param6).append(')').toString());
        }
    }

    final static TickClock e(int param0) {
        if (param0 != 0) {
          return (TickClock) null;
        }
        return (TickClock) ((Object) new NanoTickClock());
    }

    private final void sendControlPacket(byte param0, boolean param1) {
        try {
          IOException iOException = null;
          PacketBuffer stackIn_6_0 = null;
          int stackIn_7_1 = 0;
          Throwable decompiledCaughtException = null;
          Exception var4 = null;
          if (this.socket == null) {
            return;
          }
          try {
            this.outgoingControl.position = 0;
            if (param0 != 72) {
              this.sendControlPacket((byte) 2, true);
            }
            stackIn_6_0 = this.outgoingControl;
            if (!param1) {
              stackIn_7_1 = 3;
            } else {
              stackIn_7_1 = 2;
            }
            ((PacketBuffer) (Object) stackIn_6_0).a(stackIn_7_1, false);
            this.outgoingControl.b(0L, 24136);
            this.socket.a(this.outgoingControl.payload, (byte) -102, this.outgoingControl.payload.length, 0);
          } catch (java.io.IOException decompiledCaughtParameter0) {
            decompiledCaughtException = decompiledCaughtParameter0;
            iOException = (IOException) (Object) decompiledCaughtException;
            try {
              this.socket.c(-83);
            } catch (java.lang.Exception decompiledCaughtParameter1) {
              decompiledCaughtException = decompiledCaughtParameter1;
              var4 = (Exception) (Object) decompiledCaughtException;
            }
            this.field_a = -2;
            this.socket = null;
            this.field_e = this.field_e + 1;
          }
        } catch (RuntimeException | Error decompiledUncheckedException) {
          throw decompiledUncheckedException;
        } catch (Throwable decompiledCheckedException) {
          throw new RuntimeException(decompiledCheckedException);
        }
    }

    final void attachConnection(int param0, boolean param1, Object param2) {
        try {
          RuntimeException stackIn_25_0 = null;
          StringBuilder stackIn_25_1 = null;
          String stackIn_26_2 = null;
          Throwable decompiledCaughtException = null;
          Exception var4 = null;
          NetworkArchiveRequest var4_ref = null;
          IOException var4_ref2 = null;
          RuntimeException var4_ref3 = null;
          Exception var5 = null;
          int var6 = 0;
          NetworkArchiveRequest var4_refLifetime1;
          var6 = Pool.field_O;
          try {
            if (this.socket != null) {
              try {
                this.socket.c(-112);
              } catch (java.lang.Exception decompiledCaughtParameter0) {
                decompiledCaughtException = decompiledCaughtParameter0;
                var4 = (Exception) (Object) decompiledCaughtException;
              }
              this.socket = null;
            }
            this.socket = (BufferedSocket) (param2);
            this.sendSetupPacket(-55);
            this.sendControlPacket((byte) 72, param1);
            this.incomingHeader.position = 0;
            this.currentRequest = null;
            while (true) {
              var4_ref = (NetworkArchiveRequest) (this.urgentInFlight.a(0));
              if (var4_ref != null) {
                this.urgentPending.a(var4_ref, false);
                continue;
              }
              break;
            }
            while (true) {
              var4_refLifetime1 = (NetworkArchiveRequest) (this.prefetchInFlight.a(0));
              if (var4_refLifetime1 != null) {
                this.prefetchPending.a(var4_refLifetime1, false);
                continue;
              }
              break;
            }
            if (this.field_c != 0) {
              try {
                this.outgoingControl.position = 0;
                this.outgoingControl.a(4, false);
                this.outgoingControl.a((int) this.field_c, false);
                this.outgoingControl.a(true, 0);
                this.socket.a(this.outgoingControl.payload, (byte) -102, this.outgoingControl.payload.length, 0);
              } catch (java.io.IOException decompiledCaughtParameter1) {
                decompiledCaughtException = decompiledCaughtParameter1;
                var4_ref2 = (IOException) (Object) decompiledCaughtException;
                try {
                  this.socket.c(-127);
                } catch (java.lang.Exception decompiledCaughtParameter2) {
                  decompiledCaughtException = decompiledCaughtParameter2;
                  var5 = (Exception) (Object) decompiledCaughtException;
                }
                this.field_a = -2;
                this.socket = null;
                this.field_e = this.field_e + 1;
              }
            }
            this.field_m = 0;
            if (param0 <= 8) {
              return;
            }
            this.field_d = rl.monotonicTimeMillis((byte) -117);
            return;
          } catch (java.lang.RuntimeException decompiledCaughtParameter3) {
            decompiledCaughtException = decompiledCaughtParameter3;
            var4_ref3 = (RuntimeException) (Object) decompiledCaughtException;
            stackIn_25_0 = var4_ref3;
            stackIn_25_1 = new StringBuilder().append("ug.H(").append(param0).append(',').append(param1).append(',');
            if (param2 == null) {
              stackIn_26_2 = "null";
            } else {
              stackIn_26_2 = "{...}";
            }
            throw ReportAbuseDialog.addExceptionContext((Throwable) ((Object) stackIn_25_0), ((StringBuilder) (Object) stackIn_25_1).append(stackIn_26_2).append(')').toString());
          }
        } catch (RuntimeException | Error decompiledUncheckedException) {
          throw decompiledUncheckedException;
        } catch (Throwable decompiledCheckedException) {
          throw new RuntimeException(decompiledCheckedException);
        }
    }

    public static void releaseStatics(int param0) {
        if (param0 > -60) {
          return;
        }
        field_x = null;
        field_v = null;
    }

    final boolean processNetwork(int param0) {
        try {
          int var2_int = 0;
          int stackIn_46_0 = 0;
          int stackIn_62_0 = 0;
          Throwable decompiledCaughtException = null;
          long var2_long = 0L;
          NetworkArchiveRequest var2 = null;
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
          BitmapFont var17 = null;
          NetworkArchiveRequest var2Lifetime1;
          var16 = Pool.field_O;
          if (null != this.socket) {
            var2_long = rl.monotonicTimeMillis((byte) -126);
            var4 = (int)(-this.field_d + var2_long);
            this.field_d = var2_long;
            if (200 < var4) {
              var4 = 200;
            }
            this.field_m = this.field_m + var4;
            if (this.field_m > 30000) {
              try {
                this.socket.c(-100);
              } catch (java.lang.Exception decompiledCaughtParameter0) {
                decompiledCaughtException = decompiledCaughtParameter0;
                var5_ref_Exception = (Exception) (Object) decompiledCaughtException;
              }
              this.socket = null;
            }
          }
          if (this.socket == null) {
            if (0 == this.urgentCount(4609) &&
              this.prefetchCount(false) == 0) {
              return true;
            }
            return false;
          }
          try {
            this.socket.e(0);
            var2 = (NetworkArchiveRequest) (this.urgentPending.a((byte) -22));
            while (var2 != null) {
              this.outgoingControl.position = 0;
              this.outgoingControl.a(1, false);
              this.outgoingControl.b(var2.field_m, 24136);
              this.socket.a(this.outgoingControl.payload, (byte) -97, this.outgoingControl.payload.length, 0);
              this.urgentInFlight.a(var2, false);
              var2 = (NetworkArchiveRequest) (this.urgentPending.b((byte) -116));
            }
            var2Lifetime1 = (NetworkArchiveRequest) (this.prefetchPending.a((byte) 117));
            while (var2Lifetime1 != null) {
              this.outgoingControl.position = 0;
              this.outgoingControl.a(0, false);
              this.outgoingControl.b(var2Lifetime1.field_m, 24136);
              this.socket.a(this.outgoingControl.payload, (byte) 55, this.outgoingControl.payload.length, 0);
              this.prefetchInFlight.a(var2Lifetime1, false);
              var2Lifetime1 = (NetworkArchiveRequest) (this.prefetchPending.b((byte) -112));
            }
            if (param0 != -2147483648) {
              var17 = (BitmapFont) null;
              SocketArchiveNetworkClient.a((int[]) null, 69, (String) null, 35, (BitmapFont) null, true, -63);
            }
            for (var2_int = 0; 100 > var2_int; var2_int++) {
              var3_int = this.socket.d(75);
              if (0 > var3_int) {
                throw new IOException();
              }
              if (var3_int != 0) {
                this.field_m = 0;
                var4 = 0;
                if (null == this.currentRequest) {
                  var4 = 10;
                } else {
                  if (this.currentRequest.blockPosition == 0) {
                    var4 = 1;
                  }
                }
                if (var4 <= 0) {
                  var5 = -this.currentRequest.reservedTailBytes + this.currentRequest.responseBuffer.payload.length;
                  var6 = -this.currentRequest.blockPosition + 512;
                  if (var5 - this.currentRequest.responseBuffer.position < var6) {
                    var6 = -this.currentRequest.responseBuffer.position + var5;
                  }
                  if (var3_int < var6) {
                    var6 = var3_int;
                  }
                  this.socket.a(var6, param0 + -2147483648, this.currentRequest.responseBuffer.position, this.currentRequest.responseBuffer.payload);
                  if (this.field_c != 0) {
                    for (var7 = 0; var7 < var6; var7++) {
                      this.currentRequest.responseBuffer.payload[var7 + this.currentRequest.responseBuffer.position] = (byte)cq.a((int) this.currentRequest.responseBuffer.payload[var7 + this.currentRequest.responseBuffer.position], (int) this.field_c);
                    }
                  }
                  this.currentRequest.responseBuffer.position = this.currentRequest.responseBuffer.position + var6;
                  this.currentRequest.blockPosition = this.currentRequest.blockPosition + var6;
                  if (this.currentRequest.responseBuffer.position == var5) {
                    this.currentRequest.a(false);
                    this.currentRequest.pending = false;
                    this.currentRequest = null;
                  } else {
                    if (this.currentRequest.blockPosition == 512) {
                      this.currentRequest.blockPosition = 0;
                    }
                  }
                } else {
                  var5 = -this.incomingHeader.position + var4;
                  if (var3_int < var5) {
                    var5 = var3_int;
                  }
                  this.socket.a(var5, 0, this.incomingHeader.position, this.incomingHeader.payload);
                  if (this.field_c != 0) {
                    for (var6 = 0; var5 > var6; var6++) {
                      this.incomingHeader.payload[this.incomingHeader.position + var6] = (byte)cq.a((int) this.incomingHeader.payload[this.incomingHeader.position + var6], (int) this.field_c);
                    }
                  }
                  this.incomingHeader.position = this.incomingHeader.position + var5;
                  if (this.incomingHeader.position >= var4) {
                    if (this.currentRequest != null) {
                      if (this.currentRequest.blockPosition != 0) {
                        throw new IOException();
                      }
                      if (this.incomingHeader.payload[0] == -1) {
                        this.currentRequest.blockPosition = 1;
                        this.incomingHeader.position = 0;
                      } else {
                        this.currentRequest = null;
                      }
                    } else {
                      this.incomingHeader.position = 0;
                      var6 = this.incomingHeader.readUnsignedByte(param0 + 2147483550);
                      var7 = this.incomingHeader.readInt(true);
                      var8 = this.incomingHeader.readUnsignedByte(param0 + 2147483525);
                      var9 = this.incomingHeader.readInt(true);
                      var10 = var8 & 127;
                      stackIn_46_0 = (0 == (128 & var8)) ? 0 : 1;
                      boolean decompiledFrameRemainder0 = true;
                      boolean decompiledFrameCompleted0 = true;
                      var11 = stackIn_46_0;
                      var12 = (long)var7 + ((long)var6 << 32);
                      var14 = null;
                      if (var11 == 0) {
                        var14_ref = (NetworkArchiveRequest) (this.urgentInFlight.a((byte) -113));
                        while (var14_ref != null) {
                          if (~var12 == ~var14_ref.field_m) {
                            decompiledFrameCompleted0 = false;
                            break;
                          }
                          var14_ref = (NetworkArchiveRequest) (this.urgentInFlight.b((byte) -87));
                        }
                        decompiledFrameRemainder0 = !(decompiledFrameCompleted0);
                      }
                      if ((decompiledFrameRemainder0) &&
                        (decompiledFrameCompleted0)) {
                        var14_ref = (NetworkArchiveRequest) (this.prefetchInFlight.a((byte) 96));
                        while (var14_ref != null) {
                          if (var12 == var14_ref.field_m) {
                            break;
                          }
                          var14_ref = (NetworkArchiveRequest) (this.prefetchInFlight.b((byte) -99));
                        }
                      }
                      if (var14_ref == null) {
                        throw new IOException();
                      }
                      stackIn_62_0 = (var10 != 0) ? 9 : 5;
                      var15 = stackIn_62_0;
                      this.currentRequest = var14_ref;
                      this.currentRequest.responseBuffer = new PacketBuffer(var15 + (var9 + this.currentRequest.reservedTailBytes));
                      this.currentRequest.responseBuffer.a(var10, false);
                      this.currentRequest.responseBuffer.a(true, var9);
                      this.incomingHeader.position = 0;
                      this.currentRequest.blockPosition = 10;
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
              this.socket.c(-128);
            } catch (java.lang.Exception decompiledCaughtParameter2) {
              decompiledCaughtException = decompiledCaughtParameter2;
              var3 = (Exception) (Object) decompiledCaughtException;
            }
            this.field_e = this.field_e + 1;
            this.socket = null;
            this.field_a = -2;
            if (this.urgentCount(4609) == 0 &&
              this.prefetchCount(false) == 0) {
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

    final void closeSocket(byte param0) {
        if (null != this.socket) {
          this.socket.c(-102);
        }
        if (param0 >= -24) {
          this.socket = (BufferedSocket) null;
        }
    }

    final static String a(String param0, String param1, String param2, int param3) {
        StringBuilder discarded$2 = null;
        StringBuilder discarded$0 = null;
        StringBuilder discarded$1 = null;
        String stackIn_14_0 = null;
        RuntimeException stackIn_17_0 = null;
        StringBuilder stackIn_17_1 = null;
        String stackIn_18_2 = null;
        StringBuilder stackIn_20_1 = null;
        String stackIn_21_2 = null;
        StringBuilder stackIn_23_1 = null;
        String stackIn_24_2 = null;
        RuntimeException decompiledCaughtException = null;
        int var4_int = 0;
        RuntimeException var4 = null;
        int var5 = 0;
        int var6 = 0;
        int var7 = 0;
        int var8 = 0;
        int var9_int = 0;
        StringBuilder var9 = null;
        int var10 = 0;
        int var11 = 0;
        int var12 = 0;
        var12 = Pool.field_O;
        try {
          var4_int = param2.length();
          var5 = param0.length();
          var6 = param1.length();
          if (var5 == 0) {
            throw new IllegalArgumentException("Key cannot have zero length");
          }
          var7 = var4_int;
          var8 = -var5 + var6;
          if (param3 != ~var8) {
            var9_int = 0;
            while (true) {
              var9_int = param2.indexOf(param0, var9_int);
              if (0 > var9_int) {
                break;
              }
              var7 = var7 + var8;
              var9_int = var9_int + var5;
            }
          }
          var9 = new StringBuilder(var7);
          var10 = 0;
          while (true) {
            var11 = param2.indexOf(param0, var10);
            if (var11 < 0) {
              discarded$2 = var9.append(param2.substring(var10));
              stackIn_14_0 = var9.toString();
              return stackIn_14_0;
            }
            discarded$0 = var9.append(param2.substring(var10, var11));
            var10 = var11 + var5;
            discarded$1 = var9.append(param1);
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var4 = decompiledCaughtException;
          stackIn_17_0 = var4;
          stackIn_17_1 = new StringBuilder().append("ug.A(");
          if (param0 == null) {
            stackIn_18_2 = "null";
          } else {
            stackIn_18_2 = "{...}";
          }
          stackIn_20_1 = ((StringBuilder) (Object) stackIn_17_1).append(stackIn_18_2).append(',');
          if (param1 == null) {
            stackIn_21_2 = "null";
          } else {
            stackIn_21_2 = "{...}";
          }
          stackIn_23_1 = ((StringBuilder) (Object) stackIn_20_1).append(stackIn_21_2).append(',');
          if (param2 == null) {
            stackIn_24_2 = "null";
          } else {
            stackIn_24_2 = "{...}";
          }
          throw ReportAbuseDialog.addExceptionContext((Throwable) ((Object) stackIn_17_0), ((StringBuilder) (Object) stackIn_23_1).append(stackIn_24_2).append(',').append(param3).append(')').toString());
        }
    }

    public SocketArchiveNetworkClient() {
    }

    final static int g(int param0) {
        try {
          int stackIn_14_0 = 0;
          int stackIn_24_0 = 0;
          int stackIn_27_0 = 0;
          int stackIn_31_0 = 0;
          int stackIn_34_0 = 0;
          int stackIn_36_0 = 0;
          Throwable decompiledCaughtException = null;
          int var1_int = 0;
          IOException var1 = null;
          PacketBuffer var2 = null;
          if (GameRules.field_c.field_e >= 4) {
            if (-1 == GameRules.field_c.field_a) {
              return 3;
            }
            if (-2 != GameRules.field_c.field_a) {
              return 1;
            }
            return 4;
          }
          try {
            if (rl.field_e == 0) {
              AudioService.field_c = ButtonWidget.field_M.a(AccountWelcomePanel.field_X, na.field_a, 0);
              rl.field_e = rl.field_e + 1;
            }
            if (rl.field_e == 1) {
              if (AudioService.field_c.field_f == 2) {
                stackIn_14_0 = Under13NoticePanel.a(false, -1);
                return stackIn_14_0;
              }
              if (AudioService.field_c.field_f == 1) {
                rl.field_e = rl.field_e + 1;
              }
            }
            if (2 == rl.field_e) {
              dq.field_h = new BufferedSocket((java.net.Socket) (AudioService.field_c.field_e), ButtonWidget.field_M);
              var2 = new PacketBuffer(13);
              ArrayWidgetGroup.a(var2, true, DebugTuningSlider.field_k, om.field_v, UiWidget.field_B);
              var2.a(15, false);
              var2.a(true, qf.field_f);
              dq.field_h.a(var2.payload, (byte) 72, 13, 0);
              rl.field_e = rl.field_e + 1;
              ae.field_d = rl.monotonicTimeMillis((byte) -105) + 30000L;
            }
            if (rl.field_e == 3) {
              if (0 < dq.field_h.d(72)) {
                var1_int = dq.field_h.a(14528);
                if (var1_int != 0) {
                  stackIn_27_0 = Under13NoticePanel.a(false, var1_int);
                  return stackIn_27_0;
                }
                rl.field_e = rl.field_e + 1;
              } else {
                if (rl.monotonicTimeMillis((byte) -110) > ae.field_d) {
                  stackIn_24_0 = Under13NoticePanel.a(false, -2);
                  return stackIn_24_0;
                }
              }
            }
            if (rl.field_e != 4) {
              if (param0 == -27108) {
                stackIn_36_0 = -1;
                return stackIn_36_0;
              }
              stackIn_34_0 = -29;
              return stackIn_34_0;
            }
            GameRules.field_c.attachConnection(101, sa.field_k, dq.field_h);
            AudioService.field_c = null;
            rl.field_e = 0;
            dq.field_h = null;
            stackIn_31_0 = 0;
            return stackIn_31_0;
          } catch (java.io.IOException decompiledCaughtParameter0) {
            decompiledCaughtException = decompiledCaughtParameter0;
            var1 = (IOException) (Object) decompiledCaughtException;
            return Under13NoticePanel.a(false, -3);
          }
        } catch (RuntimeException | Error decompiledUncheckedException) {
          throw decompiledUncheckedException;
        } catch (Throwable decompiledCheckedException) {
          throw new RuntimeException(decompiledCheckedException);
        }
    }

    static {
        field_v = new ml("usename");
    }
}
