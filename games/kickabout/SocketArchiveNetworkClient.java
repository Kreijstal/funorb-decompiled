/*
 * Decompiled by CFR-JS 0.4.0.
 */
import java.io.*;

final class SocketArchiveNetworkClient extends ArchiveNetworkClient {
    static int field_s;
    static ff field_t;
    private BufferedSocket field_x;
    static int field_v;
    static String field_r;
    static Sprite[] field_q;
    static CommonGame field_w;
    static String field_u;

    final boolean pollResponses(byte param0) {
        try {
          int var2_int = 0;
          int stackIn_46_0 = 0;
          int stackIn_61_0 = 0;
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
          int var17 = 0;
          NetworkArchiveRequest var2Lifetime1;
          int var3_intLifetime1;
          var16 = Kickabout.field_G;
          if (null != this.field_x) {
            var2_long = nj.monotonicMillis(-70);
            var4 = (int)(-this.field_p + var2_long);
            this.field_p = var2_long;
            if (var4 > 200) {
              var4 = 200;
            }
            this.field_f = this.field_f + var4;
            if (this.field_f > 30000) {
              try {
                this.field_x.close(1);
              } catch (java.lang.Exception decompiledCaughtParameter0) {
                decompiledCaughtException = decompiledCaughtParameter0;
                var5_ref_Exception = (Exception) (Object) decompiledCaughtException;
              }
              this.field_x = null;
            }
          }
          if (null == this.field_x) {
            if (0 != this.countPriorityRequests(0)) {
              return false;
            }
            if (0 == this.countBackgroundRequests(-21)) {
              return true;
            }
            return false;
          }
          try {
            this.field_x.checkWriteError((byte) -113);
            var2 = (NetworkArchiveRequest) (this.field_h.a(-116));
            var3_int = -71 % ((param0 - 30) / 37);
            while (var2 != null) {
              this.field_d.field_n = 0;
              this.field_d.writeByte(107, 1);
              this.field_d.b((byte) 83, var2.field_l);
              this.field_x.write(this.field_d.field_f.length, (byte) -127, 0, this.field_d.field_f);
              this.field_b.addLast(127, var2);
              var2 = (NetworkArchiveRequest) (this.field_h.b(0));
            }
            var2Lifetime1 = (NetworkArchiveRequest) (this.field_c.a(-117));
            while (var2Lifetime1 != null) {
              this.field_d.field_n = 0;
              this.field_d.writeByte(116, 0);
              this.field_d.b((byte) 18, var2Lifetime1.field_l);
              this.field_x.write(this.field_d.field_f.length, (byte) -127, 0, this.field_d.field_f);
              this.field_j.addLast(127, var2Lifetime1);
              var2Lifetime1 = (NetworkArchiveRequest) (this.field_c.b(0));
            }
            for (var2_int = 0; 100 > var2_int; var2_int++) {
              var3_intLifetime1 = this.field_x.a((byte) 63);
              if (var3_intLifetime1 < 0) {
                throw new IOException();
              }
              if (var3_intLifetime1 != 0) {
                this.field_f = 0;
                var4 = 0;
                if (null != this.field_k) {
                  if (0 == this.field_k.field_u) {
                    var4 = 1;
                  }
                } else {
                  var4 = 10;
                }
                if (var4 <= 0) {
                  var5 = this.field_k.field_v.field_f.length - this.field_k.field_x;
                  var6 = -this.field_k.field_u + 512;
                  if (var5 - this.field_k.field_v.field_n < var6) {
                    var6 = -this.field_k.field_v.field_n + var5;
                  }
                  if (var3_intLifetime1 < var6) {
                    var6 = var3_intLifetime1;
                  }
                  this.field_x.readFully(this.field_k.field_v.field_f, var6, this.field_k.field_v.field_n, -4847);
                  if (0 != this.field_g) {
                    var17 = 0;
                    var7 = var17;
                    while (var6 > var17) {
                      this.field_k.field_v.field_f[this.field_k.field_v.field_n + var17] = (byte)TrinketShopDialog.b((int) this.field_k.field_v.field_f[this.field_k.field_v.field_n + var17], (int) this.field_g);
                      var17++;
                    }
                  }
                  this.field_k.field_v.field_n = this.field_k.field_v.field_n + var6;
                  this.field_k.field_u = this.field_k.field_u + var6;
                  if (this.field_k.field_v.field_n == var5) {
                    this.field_k.unlinkSecondary(50);
                    this.field_k.pending = false;
                    this.field_k = null;
                  } else {
                    if (this.field_k.field_u == 512) {
                      this.field_k.field_u = 0;
                    }
                  }
                } else {
                  var5 = -this.field_n.field_n + var4;
                  if (var3_intLifetime1 < var5) {
                    var5 = var3_intLifetime1;
                  }
                  this.field_x.readFully(this.field_n.field_f, var5, this.field_n.field_n, -4847);
                  if (this.field_g != 0) {
                    for (var6 = 0; var6 < var5; var6++) {
                      this.field_n.field_f[this.field_n.field_n + var6] = (byte)TrinketShopDialog.b((int) this.field_n.field_f[this.field_n.field_n + var6], (int) this.field_g);
                    }
                  }
                  this.field_n.field_n = this.field_n.field_n + var5;
                  if (this.field_n.field_n >= var4) {
                    if (this.field_k == null) {
                      this.field_n.field_n = 0;
                      var6 = this.field_n.readUnsignedByte((byte) -128);
                      var7 = this.field_n.readInt(4);
                      var8 = this.field_n.readUnsignedByte((byte) -117);
                      var9 = this.field_n.readInt(4);
                      var10 = var8 & 127;
                      stackIn_46_0 = ((128 & var8) == 0) ? 0 : 1;
                      boolean decompiledFrameRemainder0 = true;
                      boolean decompiledFrameCompleted0 = true;
                      var11 = stackIn_46_0;
                      var12 = ((long)var6 << 32) + (long)var7;
                      var14 = null;
                      if (var11 != 0) {
                        var14_ref = (NetworkArchiveRequest) (this.field_j.a(-127));
                        while (var14_ref != null) {
                          if (~var12 == ~var14_ref.field_l) {
                            decompiledFrameCompleted0 = false;
                            break;
                          }
                          var14_ref = (NetworkArchiveRequest) (this.field_j.b(0));
                        }
                        decompiledFrameRemainder0 = !(decompiledFrameCompleted0);
                      }
                      if ((decompiledFrameRemainder0) &&
                        (decompiledFrameCompleted0)) {
                        var14_ref = (NetworkArchiveRequest) (this.field_b.a(-115));
                        while (var14_ref != null) {
                          if (~var12 == ~var14_ref.field_l) {
                            break;
                          }
                          var14_ref = (NetworkArchiveRequest) (this.field_b.b(0));
                        }
                      }
                      if (var14_ref == null) {
                        throw new IOException();
                      }
                      stackIn_61_0 = (var10 != 0) ? 9 : 5;
                      var15 = stackIn_61_0;
                      this.field_k = var14_ref;
                      this.field_k.field_v = new PacketBuffer(var15 + var9 + this.field_k.field_x);
                      this.field_k.field_v.writeByte(110, var10);
                      this.field_k.field_v.writeInt(-125, var9);
                      this.field_k.field_u = 10;
                      this.field_n.field_n = 0;
                    } else {
                      if (this.field_k.field_u != 0) {
                        throw new IOException();
                      }
                      if (this.field_n.field_f[0] == -1) {
                        this.field_k.field_u = 1;
                        this.field_n.field_n = 0;
                      } else {
                        this.field_k = null;
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
              this.field_x.close(1);
            } catch (java.lang.Exception decompiledCaughtParameter2) {
              decompiledCaughtException = decompiledCaughtParameter2;
              var3 = (Exception) (Object) decompiledCaughtException;
            }
            this.field_o = this.field_o + 1;
            this.field_l = -2;
            this.field_x = null;
            if (this.countPriorityRequests(0) == 0 &&
              this.countBackgroundRequests(-21) == 0) {
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

    final static void a(byte param0, int param1) {
        PopupDialog var5 = null;
        int var3 = Kickabout.field_G;
        try {
          if (param0 != 126) {
            ResourceArchive var4 = (ResourceArchive) null;
            SocketArchiveNetworkClient.a(5, (ResourceArchive) null);
          }
          if (param1 == 28) {
            if (su.field_c != null) {
              su.field_c.beginClose(19910);
            }
            var5 = (PopupDialog) (ScrollPane.field_Jb.g(24009));
            while (var5 != null) {
              var5.c((byte) -109);
              var5 = (PopupDialog) (ScrollPane.field_Jb.c(33));
            }
          }
          ScrollPane.field_Jb.addLast(new MessageDialog(param1), 3);
        } catch (RuntimeException runtimeException) {
          throw GameSoundEffect.wrapException((Throwable) ((Object) runtimeException), "tb.I(" + param0 + ',' + param1 + ')');
        }
    }

    private final void sendSetupPacket(int param0) {
        try {
          IOException iOException = null;
          Throwable decompiledCaughtException = null;
          Exception var3 = null;
          if (null == this.field_x) {
            return;
          }
          try {
            this.field_d.field_n = param0;
            this.field_d.writeByte(param0 ^ 122, 6);
            this.field_d.writeMedium(3, (byte) 126);
            this.field_d.writeShort(param0 - 1207444472, 0);
            this.field_x.write(this.field_d.field_f.length, (byte) -127, 0, this.field_d.field_f);
          } catch (java.io.IOException decompiledCaughtParameter0) {
            decompiledCaughtException = decompiledCaughtParameter0;
            iOException = (IOException) (Object) decompiledCaughtException;
            try {
              this.field_x.close(1);
            } catch (java.lang.Exception decompiledCaughtParameter1) {
              decompiledCaughtException = decompiledCaughtParameter1;
              var3 = (Exception) (Object) decompiledCaughtException;
            }
            this.field_o = this.field_o + 1;
            this.field_l = -2;
            this.field_x = null;
          }
        } catch (RuntimeException | Error decompiledUncheckedException) {
          throw decompiledUncheckedException;
        } catch (Throwable decompiledCheckedException) {
          throw new RuntimeException(decompiledCheckedException);
        }
    }

    final void attachSocket(Object param0, int param1, boolean param2) {
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
          var6 = Kickabout.field_G;
          try {
            if (this.field_x != null) {
              try {
                this.field_x.close(param1 ^ 21);
              } catch (java.lang.Exception decompiledCaughtParameter0) {
                decompiledCaughtException = decompiledCaughtParameter0;
                var4 = (Exception) (Object) decompiledCaughtException;
              }
              this.field_x = null;
            }
            this.field_x = (BufferedSocket) (param0);
            this.sendSetupPacket(0);
            if (param1 != 20) {
              this.closeSocket((byte) 19);
            }
            this.sendControlPacket(param2, false);
            this.field_k = null;
            this.field_n.field_n = 0;
            while (true) {
              var4_ref = (NetworkArchiveRequest) (this.field_b.removeFirst((byte) 105));
              if (var4_ref != null) {
                this.field_h.addLast(127, var4_ref);
                continue;
              }
              break;
            }
            while (true) {
              var4_refLifetime1 = (NetworkArchiveRequest) (this.field_j.removeFirst((byte) 118));
              if (var4_refLifetime1 != null) {
                this.field_c.addLast(127, var4_refLifetime1);
                continue;
              }
              break;
            }
            if (this.field_g != 0) {
              try {
                this.field_d.field_n = 0;
                this.field_d.writeByte(123, 4);
                this.field_d.writeByte(103, (int) this.field_g);
                this.field_d.writeInt(param1 ^ -50, 0);
                this.field_x.write(this.field_d.field_f.length, (byte) -127, 0, this.field_d.field_f);
              } catch (java.io.IOException decompiledCaughtParameter1) {
                decompiledCaughtException = decompiledCaughtParameter1;
                var4_ref2 = (IOException) (Object) decompiledCaughtException;
                try {
                  this.field_x.close(1);
                } catch (java.lang.Exception decompiledCaughtParameter2) {
                  decompiledCaughtException = decompiledCaughtParameter2;
                  var5 = (Exception) (Object) decompiledCaughtException;
                }
                this.field_l = -2;
                this.field_o = this.field_o + 1;
                this.field_x = null;
              }
            }
            this.field_f = 0;
            this.field_p = nj.monotonicMillis(-119);
            return;
          } catch (java.lang.RuntimeException decompiledCaughtParameter3) {
            decompiledCaughtException = decompiledCaughtParameter3;
            var4_ref3 = (RuntimeException) (Object) decompiledCaughtException;
            stackIn_25_0 = var4_ref3;
            stackIn_25_1 = new StringBuilder().append("tb.A(");
            if (param0 == null) {
              stackIn_26_2 = "null";
            } else {
              stackIn_26_2 = "{...}";
            }
            throw GameSoundEffect.wrapException((Throwable) ((Object) stackIn_25_0), ((StringBuilder) (Object) stackIn_25_1).append(stackIn_26_2).append(',').append(param1).append(',').append(param2).append(')').toString());
          }
        } catch (RuntimeException | Error decompiledUncheckedException) {
          throw decompiledUncheckedException;
        } catch (Throwable decompiledCheckedException) {
          throw new RuntimeException(decompiledCheckedException);
        }
    }

    final void resetAfterValidationFailure(int param0) {
        try {
          this.field_x.close(1);
        } catch (Exception exception) {
        }
        this.field_x = null;
        this.field_o = this.field_o + 1;
        this.field_l = -1;
        int var2 = -89 % ((57 - param0) / 33);
        this.field_g = (byte)(int)(1.0 + Math.random() * 255.0);
    }

    final static void a(int param0, ResourceArchive param1) {
        UiLayoutNode var6 = null;
        UiLayoutNode var7 = null;
        UiLayoutNode var3 = null;
        try {
          DirectByteStorage.field_n = wa.a((byte) 126, "basic", param1, "display_name_changed");
          ei.field_d = new FriendsListPanel(0L, BroadcastServerCommand.field_D, le.field_a, ButtonMenuScreen.field_k);
          TournamentChampionDialog.field_F = new FriendsListPanel(0L, BroadcastServerCommand.field_D, CheatCodeListener.field_j, IsSixCommand.field_D);
          TriangleMesh.field_R = new UiLayoutNode(0L, (UiLayoutNode) null);
          du.field_f = new UiLayoutNode(0L, ConsoleEvaluationException.field_e);
          du.field_f.field_A = 1;
          AlphaContainer.field_E = new UiLayoutNode(0L, TrinketIcon.field_zb, oh.field_h);
          ph.field_f = new UiLayoutNode(0L, SquadPickerDialog.field_P, TextFieldNode.field_Vb);
          BlankScreen.field_h = new UiLayoutNode(0L, ul.field_c);
          TriangleMesh.field_R.addChild((byte) -109, du.field_f);
          TriangleMesh.field_R.addChild((byte) -122, AlphaContainer.field_E);
          TriangleMesh.field_R.addChild((byte) -108, ph.field_f);
          TriangleMesh.field_R.addChild((byte) -124, (UiLayoutNode) (ei.field_d));
          TriangleMesh.field_R.addChild((byte) -108, BlankScreen.field_h);
          ei.field_d.field_Cb.field_zb.applyStyle(ConsoleEvaluationException.field_e, (byte) 87);
          if (param0 >= -59) {
            ResourceArchive var4 = (ResourceArchive) null;
            SocketArchiveNetworkClient.a(-39, (ResourceArchive) null);
          }
          ei.field_d.field_Cb.field_zb.field_p = 1;
          var6 = ei.field_d.field_Cb.field_zb;
          var7 = var6;
          var7.field_A = 1;
          TournamentChampionDialog.field_F.field_Cb.field_zb.applyStyle(ConsoleEvaluationException.field_e, (byte) -128);
          var3 = TournamentChampionDialog.field_F.field_Cb.field_zb;
          TournamentChampionDialog.field_F.field_Cb.field_zb.field_p = 1;
          var3.field_A = 1;
        } catch (RuntimeException runtimeException) {
          throw GameSoundEffect.wrapException((Throwable) ((Object) runtimeException), "tb.E(" + param0 + ',' + (param1 != null ? "{...}" : "null") + ')');
        }
    }

    private final void sendControlPacket(boolean param0, boolean param1) {
        try {
          IOException iOException = null;
          PacketBuffer stackIn_5_0 = null;
          int stackIn_5_1 = 0;
          int stackIn_6_2 = 0;
          Throwable decompiledCaughtException = null;
          Exception var4 = null;
          if (null == this.field_x) {
            return;
          }
          try {
            this.field_d.field_n = 0;
            stackIn_5_0 = this.field_d;
            stackIn_5_1 = 105;
            if (param0) {
              stackIn_6_2 = 2;
            } else {
              stackIn_6_2 = 3;
            }
            ((PacketBuffer) (Object) stackIn_5_0).writeByte(stackIn_5_1, stackIn_6_2);
            this.field_d.b((byte) 89, 0L);
            this.field_x.write(this.field_d.field_f.length, (byte) -127, 0, this.field_d.field_f);
          } catch (java.io.IOException decompiledCaughtParameter0) {
            decompiledCaughtException = decompiledCaughtParameter0;
            iOException = (IOException) (Object) decompiledCaughtException;
            try {
              this.field_x.close(1);
            } catch (java.lang.Exception decompiledCaughtParameter1) {
              decompiledCaughtException = decompiledCaughtParameter1;
              var4 = (Exception) (Object) decompiledCaughtException;
            }
            this.field_l = -2;
            this.field_o = this.field_o + 1;
            this.field_x = null;
          }
          if (param1) {
            this.sendControlPacket(true, true);
          }
        } catch (RuntimeException | Error decompiledUncheckedException) {
          throw decompiledUncheckedException;
        } catch (Throwable decompiledCheckedException) {
          throw new RuntimeException(decompiledCheckedException);
        }
    }

    public static void releaseStatics(byte param0) {
        field_t = null;
        field_r = null;
        field_w = null;
        field_q = null;
        field_u = null;
        if (param0 >= -89) {
          String var2 = (String) null;
          SocketArchiveNetworkClient.a((String) null, -77);
        }
    }

    final static boolean a(String param0, int param1) {
        int var2_int = 0;
        RuntimeException var2 = null;
        boolean stackIn_7_0 = false;
        RuntimeException stackIn_10_0 = null;
        StringBuilder stackIn_10_1 = null;
        String stackIn_11_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          var2_int = -16 % ((param1 + 16) / 36);
          if (null == LoginMethod.field_e) {
            return false;
          }
          stackIn_7_0 = !(param0.toLowerCase().indexOf(LoginMethod.field_e.toLowerCase()) < 0);
          return stackIn_7_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2 = decompiledCaughtException;
          stackIn_10_0 = var2;
          stackIn_10_1 = new StringBuilder().append("tb.D(");
          if (param0 == null) {
            stackIn_11_2 = "null";
          } else {
            stackIn_11_2 = "{...}";
          }
          throw GameSoundEffect.wrapException((Throwable) ((Object) stackIn_10_0), ((StringBuilder) (Object) stackIn_10_1).append(stackIn_11_2).append(',').append(param1).append(')').toString());
        }
    }

    final void closeSocket(byte param0) {
        if (param0 != 109) {
          field_w = (CommonGame) null;
        }
        if (this.field_x != null) {
          this.field_x.close(param0 ^ 108);
        }
    }

    public SocketArchiveNetworkClient() {
    }

    static {
        field_v = 1;
        field_t = new ff(4, 1, 1, 1);
        field_r = "Names cannot start or end with space or underscore";
        field_u = "Accept invitation to <%0>'s game";
    }
}
