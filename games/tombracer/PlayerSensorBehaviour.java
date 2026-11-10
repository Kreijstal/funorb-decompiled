/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class PlayerSensorBehaviour extends Behaviour implements SwitchSource {
    private boolean field_s;
    private boolean field_r;
    private int field_u;
    private int field_v;
    private int field_p;
    private int field_o;
    private boolean field_t;
    private boolean field_q;
    private SwitchState field_n;

    public final int getLevel(byte param0) {
        if (param0 != -108) {
          return 74;
        }
        return 0;
    }

    final int hashState(int param0, int param1) {
        param0 = this.field_n.hashState(121, param0);
        if (param1 > -48) {
          return 47;
        }
        return param0;
    }

    private final boolean r(int param0) {
        int var2 = this.getPlayer((byte) 19).getFacingAngle(-25787);
        int var3 = S2CNextRoundPacket.abs(var2 - (4096 + this.field_v), -120);
        var3 = GameScreen.positiveModulo(var3, param0, 109);
        if (4096 < var3) {
          var3 = 8192 - var3;
        }
        return this.field_u / 2 >= var3 ? true : false;
    }

    final void attachToTrap(boolean param0, Trap param1) {
        try {
          super.attachToTrap(param0, param1);
        } catch (RuntimeException runtimeException) {
          throw tba.a((Throwable) ((Object) runtimeException), "kj.Q(" + param0 + ',' + (param1 != null ? "{...}" : "null") + ')');
        }
    }

    private final boolean l(int param0) {
        int var2 = this.trap.getFacingAngle(-25787);
        int var3 = S2CNextRoundPacket.abs(var2 - this.field_v, -113);
        var3 = GameScreen.positiveModulo(var3, param0, param0 ^ -8300);
        if (var3 > 4096) {
          var3 = -var3 + 8192;
        }
        return this.field_o / 2 >= var3 ? true : false;
    }

    public final int getLitColour(byte param0) {
        if (param0 != -108) {
          this.getLitColour((byte) -25);
          return 7798954;
        }
        return 7798954;
    }

    final int getTypeId(boolean param0) {
        if (param0) {
          this.hashState(-15, 107);
          return 22;
        }
        return 22;
    }

    public final int getDimColour(int param0) {
        if (param0 != 17832) {
          return 6;
        }
        return 4456550;
    }

    public final SwitchState getSwitchState(byte param0) {
        if (param0 >= -67) {
          this.field_v = 68;
          return this.field_n;
        }
        return this.field_n;
    }

    private final boolean e(boolean param0) {
        int var4 = 0;
        int var5 = 0;
        int var6 = 0;
        int var2 = this.field_p >> 16;
        int var4Lifetime1;
        int var5Lifetime1;
        int var6Lifetime1;
        var2 = var2 * var2;
        Player var3 = this.getPlayer((byte) 19);
        if (!param0) {
          var4 = this.trap.getX(3) - var3.getX(3) >> 16;
          var5 = this.trap.getY(9648) - var3.getY(9648) >> 16;
          var6 = var4 * var4 + var5 * var5;
          return var6 < var2 ? true : false;
        }
        this.field_s = false;
        var4Lifetime1 = this.trap.getX(3) - var3.getX(3) >> 16;
        var5Lifetime1 = this.trap.getY(9648) - var3.getY(9648) >> 16;
        var6Lifetime1 = var4Lifetime1 * var4Lifetime1 + var5Lifetime1 * var5Lifetime1;
        return var6Lifetime1 < var2 ? true : false;
    }

    PlayerSensorBehaviour(Room param0, BitPacketBuffer param1, boolean param2) {
        super(param0, param1, param2);
        boolean stackIn_4_1 = false;
        boolean stackIn_9_1 = false;
        boolean stackIn_14_1 = false;
        boolean stackIn_19_1 = false;
        RuntimeException stackIn_23_0 = null;
        StringBuilder stackIn_23_1 = null;
        String stackIn_24_2 = null;
        StringBuilder stackIn_26_1 = null;
        String stackIn_27_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var4 = null;
        try {
          stackIn_4_1 = (param1.readBits((byte) 44, 1) == 1);
          this.field_s = stackIn_4_1;
          if (this.field_s) {
            this.field_u = SnakePitModel.a(8, 8192, 0, param1.readBits((byte) 44, 8));
          }
          stackIn_9_1 = (param1.readBits((byte) 44, 1) == 1);
          this.field_r = stackIn_9_1;
          if (this.field_r) {
            this.field_o = SnakePitModel.a(8, 8192, 0, param1.readBits((byte) 44, 8));
          }
          stackIn_14_1 = (1 == param1.readBits((byte) 44, 1));
          this.field_q = stackIn_14_1;
          if (this.field_q) {
            this.field_p = param1.readBits((byte) 44, 10) << 16;
          }
          stackIn_19_1 = (param1.readBits((byte) 44, 1) == 1);
          this.field_t = stackIn_19_1;
          this.field_n = new SwitchState(15, param0, param1);
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var4 = decompiledCaughtException;
          stackIn_23_0 = var4;
          stackIn_23_1 = new StringBuilder().append("kj.<init>(");
          if (param0 == null) {
            stackIn_24_2 = "null";
          } else {
            stackIn_24_2 = "{...}";
          }
          stackIn_26_1 = ((StringBuilder) (Object) stackIn_23_1).append(stackIn_24_2).append(',');
          if (param1 == null) {
            stackIn_27_2 = "null";
          } else {
            stackIn_27_2 = "{...}";
          }
          throw tba.a((Throwable) ((Object) stackIn_23_0), ((StringBuilder) (Object) stackIn_26_1).append(stackIn_27_2).append(',').append(param2).append(')').toString());
        }
    }

    final void resolveSwitchLinks(int param0) {
        super.resolveSwitchLinks(param0);
        this.field_n.resolveLinks((byte) 48, this.getScope((byte) 127));
    }

    final void tick(int param0) {
        int stackIn_13_0 = 0;
        int stackIn_20_0 = 0;
        int stackIn_26_0 = 0;
        int stackIn_34_0 = 0;
        int stackIn_42_0 = 0;
        int stackIn_49_0 = 0;
        int stackIn_55_0 = 0;
        int stackIn_66_0 = 0;
        int stackIn_73_0 = 0;
        int stackIn_81_0 = 0;
        int stackIn_89_0 = 0;
        int stackIn_104_0 = 0;
        int stackIn_111_0 = 0;
        int stackIn_117_0 = 0;
        int stackIn_126_0 = 0;
        int stackIn_133_0 = 0;
        int stackIn_141_0 = 0;
        int stackIn_147_0 = 0;
        int stackIn_155_0 = 0;
        int stackIn_165_0 = 0;
        int stackIn_173_0 = 0;
        int stackIn_179_0 = 0;
        int stackIn_187_0 = 0;
        int stackIn_195_0 = 0;
        int stackIn_202_0 = 0;
        int stackIn_210_0 = 0;
        int stackIn_218_0 = 0;
        int stackIn_226_0 = 0;
        int stackIn_232_0 = 0;
        int stackIn_240_0 = 0;
        int var2;
        int var4;
        int var5;
        Player var6;
        Player var7;
        Player var8;
        Player var9;
        Player var10;
        Player var11;
        Player var12;
        Player var13;
        var2 = 1;
        if (param0 == 5418) {
          if (var2 != 0) {
            if (!this.field_t) {
              if (this.field_s) {
                var6 = this.getPlayer((byte) 19);
                var4 = var6.getX(3) - this.trap.getX(3);
                var5 = var6.getY(9648) - this.trap.getY(9648);
                this.field_v = qva.a((byte) -94, var5, var4);
              } else {
                if (this.field_r) {
                  var7 = this.getPlayer((byte) 19);
                  var4 = var7.getX(3) - this.trap.getX(3);
                  var5 = var7.getY(9648) - this.trap.getY(9648);
                  this.field_v = qva.a((byte) -94, var5, var4);
                }
              }
              if (var2 != 0 &&
                this.field_s) {
                stackIn_13_0 = (!this.r(8192)) ? 0 : 1;
                var2 = stackIn_13_0;
              }
              if (var2 != 0 &&
                this.field_r) {
                stackIn_20_0 = (!this.l(8192)) ? 0 : 1;
                var2 = stackIn_20_0;
              }
              if (var2 != 0 &&
                this.field_q) {
                stackIn_26_0 = (!this.e(false)) ? 0 : 1;
                var2 = stackIn_26_0;
              }
              this.field_n.setInput((byte) -14, var2 != 0);
              return;
            }
            stackIn_34_0 = (!this.d(false)) ? 0 : 1;
            var2 = stackIn_34_0;
          }
          if (var2 != 0) {
            if (this.field_s) {
              var9 = this.getPlayer((byte) 19);
              var4 = var9.getX(3) - this.trap.getX(3);
              var5 = var9.getY(9648) - this.trap.getY(9648);
              this.field_v = qva.a((byte) -94, var5, var4);
            } else {
              if (this.field_r) {
                var8 = this.getPlayer((byte) 19);
                var4 = var8.getX(3) - this.trap.getX(3);
                var5 = var8.getY(9648) - this.trap.getY(9648);
                this.field_v = qva.a((byte) -94, var5, var4);
                if (this.field_s) {
                  stackIn_42_0 = (!this.r(8192)) ? 0 : 1;
                  var2 = stackIn_42_0;
                }
                if (var2 != 0 &&
                  this.field_r) {
                  stackIn_49_0 = (!this.l(8192)) ? 0 : 1;
                  var2 = stackIn_49_0;
                }
                if (var2 != 0 &&
                  this.field_q) {
                  stackIn_55_0 = (!this.e(false)) ? 0 : 1;
                  var2 = stackIn_55_0;
                }
                this.field_n.setInput((byte) -14, var2 != 0);
                return;
              }
            }
          }
          if (var2 != 0 &&
            this.field_s) {
            stackIn_66_0 = (!this.r(8192)) ? 0 : 1;
            var2 = stackIn_66_0;
          }
          boolean decompiledFrameRemainder2 = true;
          if (var2 != 0) {
            if (!this.field_r) {
              if (this.field_q) {
                stackIn_73_0 = (!this.e(false)) ? 0 : 1;
                var2 = stackIn_73_0;
              }
              decompiledFrameRemainder2 = false;
            }
            else {
              stackIn_81_0 = (!this.l(8192)) ? 0 : 1;
              var2 = stackIn_81_0;
            }
          }
          if ((decompiledFrameRemainder2) && (var2 != 0 &&
            this.field_q)) {
            stackIn_89_0 = (!this.e(false)) ? 0 : 1;
            var2 = stackIn_89_0;
          }
        } else {
          this.field_q = false;
          if (var2 != 0) {
            if (!this.field_t) {
              if (this.field_s) {
                var10 = this.getPlayer((byte) 19);
                var4 = var10.getX(3) - this.trap.getX(3);
                var5 = var10.getY(9648) - this.trap.getY(9648);
                this.field_v = qva.a((byte) -94, var5, var4);
              } else {
                if (this.field_r) {
                  var11 = this.getPlayer((byte) 19);
                  var4 = var11.getX(3) - this.trap.getX(3);
                  var5 = var11.getY(9648) - this.trap.getY(9648);
                  this.field_v = qva.a((byte) -94, var5, var4);
                }
              }
              if (var2 != 0 &&
                this.field_s) {
                stackIn_104_0 = (!this.r(8192)) ? 0 : 1;
                var2 = stackIn_104_0;
              }
              if (var2 != 0 &&
                this.field_r) {
                stackIn_111_0 = (!this.l(8192)) ? 0 : 1;
                var2 = stackIn_111_0;
              }
              if (var2 != 0 &&
                this.field_q) {
                stackIn_117_0 = (!this.e(false)) ? 0 : 1;
                var2 = stackIn_117_0;
              }
              this.field_n.setInput((byte) -14, var2 != 0);
              return;
            }
            stackIn_126_0 = (!this.d(false)) ? 0 : 1;
            var2 = stackIn_126_0;
          }
          if (var2 == 0) {
            if (var2 != 0 &&
              this.field_s) {
              stackIn_133_0 = (!this.r(8192)) ? 0 : 1;
              var2 = stackIn_133_0;
            }
            boolean decompiledFrameRemainder1 = true;
            if (var2 != 0) {
              if (!this.field_r) {
                if (this.field_q) {
                  stackIn_141_0 = (!this.e(false)) ? 0 : 1;
                  var2 = stackIn_141_0;
                }
                decompiledFrameRemainder1 = false;
              }
              else {
                stackIn_147_0 = (!this.l(8192)) ? 0 : 1;
                var2 = stackIn_147_0;
              }
            }
            if ((decompiledFrameRemainder1) && (var2 != 0 &&
              this.field_q)) {
              stackIn_155_0 = (!this.e(false)) ? 0 : 1;
              var2 = stackIn_155_0;
            }
          } else {
            if (this.field_s) {
              var13 = this.getPlayer((byte) 19);
              var4 = var13.getX(3) - this.trap.getX(3);
              var5 = var13.getY(9648) - this.trap.getY(9648);
              this.field_v = qva.a((byte) -94, var5, var4);
              if (var2 != 0 &&
                this.field_s) {
                stackIn_218_0 = (!this.r(8192)) ? 0 : 1;
                var2 = stackIn_218_0;
              }
              boolean decompiledFrameRemainder0 = true;
              if (var2 != 0) {
                if (!this.field_r) {
                  if (this.field_q) {
                    stackIn_226_0 = (!this.e(false)) ? 0 : 1;
                    var2 = stackIn_226_0;
                  }
                  decompiledFrameRemainder0 = false;
                }
                else {
                  stackIn_232_0 = (!this.l(8192)) ? 0 : 1;
                  var2 = stackIn_232_0;
                }
              }
              if ((decompiledFrameRemainder0) && (var2 != 0 &&
                this.field_q)) {
                stackIn_240_0 = (!this.e(false)) ? 0 : 1;
                var2 = stackIn_240_0;
              }
              this.field_n.setInput((byte) -14, var2 != 0);
              return;
            }
            if (this.field_r) {
              var12 = this.getPlayer((byte) 19);
              var4 = var12.getX(3) - this.trap.getX(3);
              var5 = var12.getY(9648) - this.trap.getY(9648);
              this.field_v = qva.a((byte) -94, var5, var4);
              if (var2 != 0 &&
                this.field_s) {
                stackIn_195_0 = (!this.r(8192)) ? 0 : 1;
                var2 = stackIn_195_0;
              }
              if (var2 != 0 &&
                this.field_r) {
                stackIn_202_0 = (!this.l(8192)) ? 0 : 1;
                var2 = stackIn_202_0;
              }
              if (var2 != 0 &&
                this.field_q) {
                stackIn_210_0 = (!this.e(false)) ? 0 : 1;
                var2 = stackIn_210_0;
              }
              this.field_n.setInput((byte) -14, var2 != 0);
              return;
            }
            if (var2 != 0 &&
              this.field_s) {
              stackIn_165_0 = (!this.r(8192)) ? 0 : 1;
              var2 = stackIn_165_0;
            }
            if (var2 != 0) {
              if (!this.field_r) {
                if (this.field_q) {
                  stackIn_173_0 = (!this.e(false)) ? 0 : 1;
                  var2 = stackIn_173_0;
                }
                this.field_n.setInput((byte) -14, var2 != 0);
                return;
              }
              stackIn_179_0 = (!this.l(8192)) ? 0 : 1;
              var2 = stackIn_179_0;
            }
            if (var2 != 0 &&
              this.field_q) {
              stackIn_187_0 = (!this.e(false)) ? 0 : 1;
              var2 = stackIn_187_0;
            }
          }
        }
        this.field_n.setInput((byte) -14, var2 != 0);
    }

    public final int getMaxLevel(int param0) {
        int var2 = -67 / ((-46 - param0) / 45);
        return 0;
    }

    final void encode(boolean param0, BitPacketBuffer param1) {
        try {
          super.encode(param0, param1);
          param1.writeBits((byte) -126, this.field_s ? 1 : 0, 1);
          if (this.field_s) {
            param1.writeBits((byte) -126, ResourceArchive.a((byte) -120, this.field_u, 8192, 8), 8);
          }
          param1.writeBits((byte) 5, !this.field_r ? 0 : 1, 1);
          if (this.field_r) {
            param1.writeBits((byte) -125, ResourceArchive.a((byte) 111, this.field_o, 8192, 8), 8);
          }
          param1.writeBits((byte) -127, !this.field_q ? 0 : 1, 1);
          if (this.field_q) {
            param1.writeBits((byte) -125, this.field_p >> 16, 10);
          }
          param1.writeBits((byte) -127, this.field_t ? 1 : 0, 1);
          this.field_n.encode(this.getScope((byte) 111), (byte) 85, param1);
        } catch (RuntimeException runtimeException) {
          throw tba.a((Throwable) ((Object) runtimeException), "kj.F(" + param0 + ',' + (param1 != null ? "{...}" : "null") + ')');
        }
    }

    private final boolean d(boolean param0) {
        if (param0) {
          return false;
        }
        return this.getPlayer((byte) 19).p((byte) -110);
    }

    static {
    }
}
