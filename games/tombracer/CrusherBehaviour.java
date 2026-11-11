/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class CrusherBehaviour extends Behaviour {
    private int crushedTicks;
    private int field_q;
    private boolean field_u;
    private boolean field_p;
    private int windUpTicks;
    private int waitTicks;
    private int phase;
    private int phaseTicks;
    static String field_r;
    private int retractTicks;
    private Effect crushEffect;

    final boolean isRetracting(int param0) {
        if (param0 == -5) {
          return this.phase == 4 ? true : false;
        }
        this.crushEffect = (Effect) null;
        return this.phase == 4 ? true : false;
    }

    final boolean isWaiting(int param0) {
        int var2 = 97 / ((param0 - 2) / 62);
        return this.phase == 1 ? true : false;
    }

    final boolean isWindingUp(int param0) {
        if (param0 <= -31) {
          return this.phase == 2 ? true : false;
        }
        this.windUpTicks = 10;
        return this.phase == 2 ? true : false;
    }

    final void attachToTrap(boolean param0, Trap param1) {
        RuntimeException stackIn_8_0 = null;
        StringBuilder stackIn_8_1 = null;
        String stackIn_9_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var3 = null;
        try {
          super.attachToTrap(param0, param1);
          if (4 > this.getRoom(true).formatVersion) {
            param1.setObstructionLevel(3, 0);
          }
          param1.b((byte) -62, 8);
          if (0 == this.field_q) {
            param1.setFloating((byte) 17, true);
            this.field_q = param1.getWeight(73);
            param1.setWeight((byte) -3, 0);
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3 = decompiledCaughtException;
          stackIn_8_0 = var3;
          stackIn_8_1 = new StringBuilder().append("rea.Q(").append(param0).append(',');
          if (param1 == null) {
            stackIn_9_2 = "null";
          } else {
            stackIn_9_2 = "{...}";
          }
          throw tba.wrapException((Throwable) ((Object) stackIn_8_0), ((StringBuilder) (Object) stackIn_8_1).append(stackIn_9_2).append(')').toString());
        }
    }

    final void encode(boolean param0, BitPacketBuffer param1) {
        try {
          super.encode(param0, param1);
          param1.writeBits((byte) 116, this.waitTicks, 8);
          param1.writeBits((byte) -128, this.windUpTicks, 8);
          param1.writeBits((byte) 107, this.crushedTicks, 8);
          param1.writeBits((byte) -20, this.retractTicks, 8);
          param1.writeBits((byte) -126, this.field_u ? 1 : 0, 1);
          param1.writeBits((byte) -23, this.field_p ? 1 : 0, 1);
          this.crushEffect.encode(param1, (byte) 125);
        } catch (RuntimeException runtimeException) {
          throw tba.wrapException((Throwable) ((Object) runtimeException), "rea.F(" + param0 + ',' + (param1 != null ? "{...}" : "null") + ')');
        }
    }

    CrusherBehaviour(Room param0, boolean param1) {
        super(param0, param1);
        this.field_u = false;
        this.field_p = false;
        try {
          this.crushedTicks = 25;
          this.retractTicks = 50;
          this.waitTicks = 50;
          this.windUpTicks = 25;
          this.crushEffect = new Effect(0, 100);
          this.crushEffect.setDeathMessageIndex(1, 4);
          this.clampPhaseTicks((byte) -106);
        } catch (RuntimeException runtimeException) {
          throw tba.wrapException((Throwable) ((Object) runtimeException), "rea.<init>(" + (param0 != null ? "{...}" : "null") + ',' + param1 + ')');
        }
    }

    private final void clampPhaseTicks(byte param0) {
        int var2;
        int var2Lifetime1;
        int var2Lifetime2;
        if (0 >= this.crushedTicks) {
          this.crushedTicks = 1;
          if (0 >= this.waitTicks) {
            this.waitTicks = 1;
          }
          if (this.windUpTicks <= 0) {
            this.windUpTicks = 1;
          }
          if (this.retractTicks <= 0) {
            this.retractTicks = 1;
          }
          var2 = 7 % ((-26 - param0) / 56);
          return;
        }
        if (0 >= this.waitTicks) {
          this.waitTicks = 1;
        }
        if (this.windUpTicks <= 0) {
          this.windUpTicks = 1;
        }
        if (this.retractTicks > 0) {
          var2Lifetime1 = 7 % ((-26 - param0) / 56);
          return;
        }
        this.retractTicks = 1;
        var2Lifetime2 = 7 % ((-26 - param0) / 56);
        return;
    }

    final int getWindUpTicks(byte param0) {
        if (param0 != 90) {
          field_r = (String) null;
          return this.windUpTicks;
        }
        return this.windUpTicks;
    }

    final void b(byte param0, boolean param1) {
        this.field_u = param1 ? true : false;
        if (param0 <= 64) {
          this.field_q = -123;
        }
    }

    final int getTypeId(boolean param0) {
        if (param0) {
          this.setTimings(109, 0, 65, 72, 73);
          return 2;
        }
        return 2;
    }

    final boolean isCrushed(int param0) {
        int var2 = -108 % ((param0 + 19) / 49);
        return this.phase == 3 ? true : false;
    }

    CrusherBehaviour(Room param0, BitPacketBuffer param1, boolean param2) {
        super(param0, param1, param2);
        boolean stackIn_8_1 = false;
        boolean stackIn_12_1 = false;
        RuntimeException stackIn_20_0 = null;
        StringBuilder stackIn_20_1 = null;
        String stackIn_21_2 = null;
        StringBuilder stackIn_23_1 = null;
        String stackIn_24_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var4 = null;
        this.field_u = false;
        this.field_p = false;
        try {
          if (param0.formatVersion >= 3) {
            this.waitTicks = param1.readBits((byte) 44, 8);
            this.windUpTicks = param1.readBits((byte) 44, 8);
            if (param0.formatVersion >= 20) {
              this.crushedTicks = param1.readBits((byte) 44, 8);
            }
            this.retractTicks = param1.readBits((byte) 44, 8);
            stackIn_8_1 = (param1.readBits((byte) 44, 1) == 1);
            this.field_u = stackIn_8_1;
            if (param0.formatVersion >= 20) {
              stackIn_12_1 = (param1.readBits((byte) 44, 1) == 1);
              this.field_p = stackIn_12_1;
            }
          } else {
            this.windUpTicks = 25;
            this.field_u = false;
            this.waitTicks = 50;
            this.retractTicks = 50;
          }
          if (16 <= param0.formatVersion) {
            this.crushEffect = CharacterChoiceTile.decodeEffect((byte) 87, param1);
          } else {
            this.crushEffect = new Effect(0, 100);
          }
          this.clampPhaseTicks((byte) -101);
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var4 = decompiledCaughtException;
          stackIn_20_0 = var4;
          stackIn_20_1 = new StringBuilder().append("rea.<init>(");
          if (param0 == null) {
            stackIn_21_2 = "null";
          } else {
            stackIn_21_2 = "{...}";
          }
          stackIn_23_1 = ((StringBuilder) (Object) stackIn_20_1).append(stackIn_21_2).append(',');
          if (param1 == null) {
            stackIn_24_2 = "null";
          } else {
            stackIn_24_2 = "{...}";
          }
          throw tba.wrapException((Throwable) ((Object) stackIn_20_0), ((StringBuilder) (Object) stackIn_23_1).append(stackIn_24_2).append(',').append(param2).append(')').toString());
        }
    }

    final boolean freezesInTimeStop(byte param0) {
        if (param0 != 120) {
          return true;
        }
        return true;
    }

    final void tick(int param0) {
        int var3;
        int var4;
        int var5;
        int var6_int;
        Room var6;
        int var7;
        Player var8;
        var7 = TombRacer.field_G ? 1 : 0;
        var8 = this.trap.getPlayer(param0 - 5537);
        var3 = this.field_p ? 1 : 0;
        var4 = this.trap.getX(3);
        var5 = this.trap.getY(param0 + 4230);
        if (var3 == 0) {
          if (this.phase != 0) {
            if (1 == this.phase) {
              var3 = ck.containsCentredBox(var8.getX(3), 1, var4, this.trap.getWidth(param0 - 5496), this.trap.getHeight((byte) 55), var8.getY(9648), (byte) 82, var5, 1) ? 1 : 0;
            }
          } else {
            var3 = ck.containsCentredBox(var8.getX(3), var8.getHeight((byte) 55), var4, this.trap.getWidth(-23), this.trap.getHeight((byte) 55), var8.getY(9648), (byte) 69, var5, var8.getWidth(param0 - 5519)) ? 1 : 0;
          }
        }
        var6_int = this.phase;
        if (var6_int == 0) {
          if (var3 == 0) {
            this.setPhase(0, 0);
            if (this.field_u) {
              this.trap.enableLocomotors(-31);
              if (param0 != 5418) {
                this.waitTicks = -69;
              }
              return;
            }
          } else {
            this.phase = 1;
            if (this.field_u) {
              this.trap.disableLocomotors(121);
            }
            this.phaseTicks = this.phaseTicks + 1;
            if (this.waitTicks < this.phaseTicks) {
              this.setPhase(param0 ^ 5418, 2);
              if (!this.field_u) {
                this.trap.disableLocomotors(121);
                if (param0 != 5418) {
                  this.waitTicks = -69;
                }
                return;
              }
            }
          }
        } else {
          if (var6_int != 1) {
            if (2 == var6_int) {
              this.phaseTicks = this.phaseTicks + 1;
              if (this.phaseTicks > this.windUpTicks) {
                var6 = this.getRoom(true);
                var6.applyAreaEffect(123, var5, this.crushEffect, this.trap.getHeight((byte) 55), this.trap.getWidth(-79), var4);
                this.setPhase(0, 3);
                this.trap.setWeight((byte) -3, this.field_q);
                this.trap.setFloating((byte) 17, false);
                if (param0 == 5418) {
                  return;
                }
                this.waitTicks = -69;
                return;
              }
            } else {
              if (3 != var6_int) {
                if (var6_int == 4) {
                  this.phaseTicks = this.phaseTicks + 1;
                  if (this.phaseTicks > this.retractTicks) {
                    this.setPhase(param0 - 5418, 1);
                    this.trap.enableLocomotors(127);
                  }
                }
              } else {
                this.phaseTicks = this.phaseTicks + 1;
                if (this.crushedTicks < this.phaseTicks) {
                  this.setPhase(param0 - 5418, 4);
                  this.trap.setWeight((byte) -3, 0);
                  this.trap.setFloating((byte) 17, true);
                }
              }
            }
          } else {
            if (var3 != 0) {
              this.phase = 1;
              if (this.field_u) {
                this.trap.disableLocomotors(121);
              }
              this.phaseTicks = this.phaseTicks + 1;
              if (this.waitTicks < this.phaseTicks) {
                this.setPhase(param0 ^ 5418, 2);
                if (!this.field_u) {
                  this.trap.disableLocomotors(121);
                }
              }
            } else {
              this.setPhase(0, 0);
              if (this.field_u) {
                this.trap.enableLocomotors(-31);
              }
            }
          }
        }
        if (param0 == 5418) {
          return;
        }
        this.waitTicks = -69;
    }

    final static IndexedSprite[] loadIndexedSprites(ResourceArchive param0, int param1, int param2, byte param3) {
        RuntimeException var4 = null;
        IndexedSprite[] stackIn_6_0 = null;
        RuntimeException stackIn_9_0 = null;
        StringBuilder stackIn_9_1 = null;
        String stackIn_10_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          if (!GameApplet.loadSpriteSheet(false, param2, param1, param0)) {
            return null;
          }
          if (param3 <= 20) {
            field_r = (String) null;
          }
          stackIn_6_0 = S2CPlayerSyncPacket.createDecodedIndexedSprites(0);
          return stackIn_6_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var4 = decompiledCaughtException;
          stackIn_9_0 = var4;
          stackIn_9_1 = new StringBuilder().append("rea.FA(");
          if (param0 == null) {
            stackIn_10_2 = "null";
          } else {
            stackIn_10_2 = "{...}";
          }
          throw tba.wrapException((Throwable) ((Object) stackIn_9_0), ((StringBuilder) (Object) stackIn_9_1).append(stackIn_10_2).append(',').append(param1).append(',').append(param2).append(',').append(param3).append(')').toString());
        }
    }

    public static void releaseStatics(int param0) {
        field_r = null;
        if (param0 != 12134) {
          CrusherBehaviour.rectContainsPoint(85, 105, 55, -55, 43, true, 103);
        }
    }

    private final void setPhase(int param0, int param1) {
        this.phase = param1;
        this.phaseTicks = param0;
    }

    final int hashState(int param0, int param1) {
        param0 = CurveOperator.mixHash((byte) 49, param0, this.phase);
        if (param1 >= -48) {
          return -52;
        }
        return param0;
    }

    final int getRetractTicks(boolean param0) {
        if (param0) {
          this.getPhaseTicks((byte) -41);
          return this.retractTicks;
        }
        return this.retractTicks;
    }

    final int getPhaseTicks(byte param0) {
        if (param0 > -36) {
          field_r = (String) null;
          return this.phaseTicks;
        }
        return this.phaseTicks;
    }

    final static boolean rectContainsPoint(int param0, int param1, int param2, int param3, int param4, boolean param5, int param6) {
        boolean stackIn_18_0 = false;
        if (param5) {
          CrusherBehaviour.rectContainsPoint(-44, -75, 109, 115, -67, true, -126);
          if (param2 > param3) {
            return false;
          }
          if (param1 + param2 <= param3) {
            return false;
          }
          if (param6 > param0) {
            return false;
          }
          if (param4 + param6 <= param0) {
            return false;
          }
          return true;
        }
        if (param2 > param3) {
          return false;
        }
        if (param1 + param2 <= param3) {
          return false;
        }
        stackIn_18_0 = (param6 <= param0) && (param4 + param6 > param0);
        return stackIn_18_0;
    }

    final boolean blocksOverlap(int param0, int param1, int param2, int param3, int param4, int param5, Collidable param6) {
        RuntimeException var8 = null;
        boolean stackIn_5_0 = false;
        RuntimeException stackIn_8_0 = null;
        StringBuilder stackIn_8_1 = null;
        String stackIn_9_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          if (param2 != 1) {
            this.getPhaseTicks((byte) 48);
          }
          stackIn_5_0 = (this.phase == 3);
          return stackIn_5_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var8 = decompiledCaughtException;
          stackIn_8_0 = var8;
          stackIn_8_1 = new StringBuilder().append("rea.HA(").append(param0).append(',').append(param1).append(',').append(param2).append(',').append(param3).append(',').append(param4).append(',').append(param5).append(',');
          if (param6 == null) {
            stackIn_9_2 = "null";
          } else {
            stackIn_9_2 = "{...}";
          }
          throw tba.wrapException((Throwable) ((Object) stackIn_8_0), ((StringBuilder) (Object) stackIn_8_1).append(stackIn_9_2).append(')').toString());
        }
    }

    final void setTimings(int param0, int param1, int param2, int param3, int param4) {
        this.windUpTicks = param1;
        if (param2 == 1) {
          this.waitTicks = param4;
          this.retractTicks = param3;
          this.crushedTicks = param0;
          return;
        }
        this.field_q = -90;
        this.waitTicks = param4;
        this.retractTicks = param3;
        this.crushedTicks = param0;
    }

    final boolean interceptsBeam(int param0, int param1, BeamSegment param2, int param3) {
        RuntimeException var5 = null;
        BeamSegment var6 = null;
        RuntimeException stackIn_10_0 = null;
        StringBuilder stackIn_10_1 = null;
        String stackIn_11_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          if (3 != this.phase) {
            return false;
          }
          if (param1 != 1) {
            var6 = (BeamSegment) null;
            this.interceptsBeam(-121, -9, (BeamSegment) null, -81);
          }
          param2.shortenTo(param3, (byte) 47);
          return true;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var5 = decompiledCaughtException;
          stackIn_10_0 = var5;
          stackIn_10_1 = new StringBuilder().append("rea.K(").append(param0).append(',').append(param1).append(',');
          if (param2 == null) {
            stackIn_11_2 = "null";
          } else {
            stackIn_11_2 = "{...}";
          }
          throw tba.wrapException((Throwable) ((Object) stackIn_10_0), ((StringBuilder) (Object) stackIn_10_1).append(stackIn_11_2).append(',').append(param3).append(')').toString());
        }
    }

    static {
        field_r = "Player Name: ";
    }
}
