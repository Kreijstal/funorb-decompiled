/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class WeaponShooterBehaviour extends Behaviour implements mra {
    private boolean field_t;
    private TimingPattern field_n;
    private boolean field_o;
    static kia field_r;
    private boolean field_p;
    private Weapon field_u;
    private boolean field_s;
    static String[] field_q;

    final void attachToTrap(boolean param0, Trap param1) {
        try {
          if (!param0) {
            this.field_p = false;
          }
          super.attachToTrap(param0, param1);
        } catch (RuntimeException runtimeException) {
          throw MonochromeRowCacheEntry.wrapException((Throwable) ((Object) runtimeException), "ska.Q(" + param0 + ',' + (param1 != null ? "{...}" : "null") + ')');
        }
    }

    final static ConsoleToken readLiteralToken(int param0, StringCursor param1) {
        int fieldTemp$2 = 0;
        StringBuilder discarded$3 = null;
        int var2_int = 0;
        StringBuilder var3 = null;
        int var4 = 0;
        String var5 = null;
        int var6 = 0;
        ConsoleToken stackIn_21_0 = null;
        RuntimeException stackIn_24_0 = null;
        StringBuilder stackIn_24_1 = null;
        String stackIn_25_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var2 = null;
        int var4Lifetime1;
        var6 = TombRacer.field_G ? 1 : 0;
        try {
          if (param0 != -45) {
            field_r = (kia) null;
          }
          fieldTemp$2 = param1.position - 1;
          param1.position = param1.position - 1;
          var2_int = fieldTemp$2;
          var3 = new StringBuilder();
          while (!param1.isAtEnd(0)) {
            var4 = param1.nextChar(param0 + 21143);
            if (!Character.isWhitespace((char) var4) &&
              var4 != 44 &&
              var4 != 40 &&
              41 != var4) {
              discarded$3 = var3.append((char) var4);
              continue;
            }
            param1.position = param1.position - 1;
            break;
          }
          var5 = var3.toString();
          if (!var5.equals("true") &&
            !var5.equals("false")) {
            if (45 != var5.charAt(0) &&
              !Character.isDigit(var5.charAt(0))) {
              var4Lifetime1 = QuickChatPhraseSource.field_f;
            } else {
              var4Lifetime1 = CrusherModel.field_o;
            }
          } else {
            var4Lifetime1 = PressureSwitchBehaviour.field_r;
          }
          stackIn_21_0 = new ConsoleToken(var4Lifetime1, var2_int, var5);
          return stackIn_21_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2 = decompiledCaughtException;
          stackIn_24_0 = var2;
          stackIn_24_1 = new StringBuilder().append("ska.V(").append(param0).append(',');
          if (param1 == null) {
            stackIn_25_2 = "null";
          } else {
            stackIn_25_2 = "{...}";
          }
          throw MonochromeRowCacheEntry.wrapException((Throwable) ((Object) stackIn_24_0), ((StringBuilder) (Object) stackIn_24_1).append(stackIn_25_2).append(')').toString());
        }
    }

    final void setWeapon(Weapon param0, byte param1) {
        try {
          if (param1 < 40) {
            this.getTypeId(true);
          }
          this.field_u = param0;
        } catch (RuntimeException runtimeException) {
          throw MonochromeRowCacheEntry.wrapException((Throwable) ((Object) runtimeException), "ska.U(" + (param0 != null ? "{...}" : "null") + ',' + param1 + ')');
        }
    }

    public final void setTimingPattern(int param0, TimingPattern param1) {
        try {
          if (param0 < 81) {
            this.getWeapon(-69);
          }
          this.field_n = param1;
        } catch (RuntimeException runtimeException) {
          throw MonochromeRowCacheEntry.wrapException((Throwable) ((Object) runtimeException), "ska.H(" + param0 + ',' + (param1 != null ? "{...}" : "null") + ')');
        }
    }

    WeaponShooterBehaviour(Room param0, boolean param1) {
        super(param0, param1);
        this.field_o = true;
        try {
          this.field_n = new TimingPattern();
          this.field_u = TextureOperator.createFullWeapon(0, -1);
        } catch (RuntimeException runtimeException) {
          throw MonochromeRowCacheEntry.wrapException((Throwable) ((Object) runtimeException), "ska.<init>(" + (param0 != null ? "{...}" : "null") + ',' + param1 + ')');
        }
    }

    final void encode(boolean param0, BitPacketBuffer param1) {
        try {
          super.encode(param0, param1);
          this.field_n.encode(15637, param1);
          this.field_u.encode(param1, (byte) 84);
          param1.writeBits((byte) -128, this.field_o ? 1 : 0, 1);
          param1.writeBits((byte) -128, this.field_p ? 1 : 0, 1);
        } catch (RuntimeException runtimeException) {
          throw MonochromeRowCacheEntry.wrapException((Throwable) ((Object) runtimeException), "ska.F(" + param0 + ',' + (param1 != null ? "{...}" : "null") + ')');
        }
    }

    public static void releaseStatics(int param0) {
        field_r = null;
        if (param0 != 884207088) {
          return;
        }
        field_q = null;
    }

    public final boolean isFiring(int param0) {
        int var2 = -86 / ((param0 - 37) / 45);
        if (!this.field_t) {
          return false;
        }
        if (this.enabled) {
          return true;
        }
        return false;
    }

    final Weapon getWeapon(int param0) {
        if (param0 != -2) {
          WeaponShooterBehaviour.releaseStatics(-6);
          return this.field_u;
        }
        return this.field_u;
    }

    final boolean freezesInTimeStop(byte param0) {
        if (param0 != 120) {
          this.field_s = true;
          return true;
        }
        return true;
    }

    final static int atan2FirstQuadrant(int param0, int param1, int param2) {
        int var3 = 31 / ((59 - param0) / 41);
        if (param1 > param2) {
          return 2048 - RasterShape.atanFixed16(false, (param2 << 16) / param1);
        }
        return RasterShape.atanFixed16(false, (param1 << 16) / param2);
    }

    final boolean g(byte param0) {
        if (param0 != -68) {
          this.field_n = (TimingPattern) null;
          if (!this.field_s) {
            return false;
          }
          if (this.enabled) {
            return true;
          }
          return false;
        }
        if (!this.field_s) {
          return false;
        }
        if (this.enabled) {
          return true;
        }
        return false;
    }

    public final void toggle(int param0) {
        if (this.locked) {
          return;
        }
        super.toggle(-65);
        int var2 = 92 % ((param0 - 28) / 49);
        if (this.enabled) {
          return;
        }
        this.field_t = false;
    }

    final int getTypeId(boolean param0) {
        if (param0) {
          BitPacketBuffer var3 = (BitPacketBuffer) null;
          this.encode(true, (BitPacketBuffer) null);
          return 20;
        }
        return 20;
    }

    WeaponShooterBehaviour(Room param0, BitPacketBuffer param1, boolean param2) {
        super(param0, param1, param2);
        this.field_o = true;
        try {
          this.field_n = new TimingPattern(param0.formatVersion, param1);
          this.field_u = jl.decodeWeapon(param0, true, param1);
          this.field_o = param1.readBits((byte) 44, 1) == 1 ? true : false;
          this.field_u.refillAmmo(90, this.field_o);
          if (param0.formatVersion >= 8) {
            this.field_p = param1.readBits((byte) 44, 1) == 1 ? true : false;
          }
        } catch (RuntimeException runtimeException) {
          throw MonochromeRowCacheEntry.wrapException((Throwable) ((Object) runtimeException), "ska.<init>(" + (param0 != null ? "{...}" : "null") + ',' + (param1 != null ? "{...}" : "null") + ',' + param2 + ')');
        }
    }

    final void tick(int param0) {
        boolean stackIn_15_1 = false;
        boolean stackIn_45_1 = false;
        if (this.field_p) {
          if (this.getPlayer((byte) 19).isHiddenFromTrackers(-25561)) {
            return;
          }
          if (null != this.field_n) {
            this.field_n.tick(0);
            if (!this.field_n.hasToggled(0)) {
              this.field_u.tick(param0 - 5515);
              this.field_t = false;
              if (param0 != 5418) {
                field_r = (kia) null;
              }
              if (this.field_s) {
                this.field_t = this.field_u.fire(this.trap.getFacingAngle(-25787), this.trap.getTopElevation(param0 - 5418) << 16, this.getRoot(param0 - 5412), this.trap.getX(3), this.trap.getY(param0 + 4230), this.getRoom(true), 0, 0, MidiVoiceMixer.min(this.trap.getHeight((byte) 55), this.trap.getWidth(param0 ^ -5478), 123) / 2, false);
                if (!this.field_u.hasAmmo(12111)) {
                  this.stop(false);
                }
              }
              return;
            }
            stackIn_15_1 = !(this.field_s);
            this.field_s = stackIn_15_1;
          }
          this.field_u.tick(param0 - 5515);
          this.field_t = false;
          if (param0 != 5418) {
            field_r = (kia) null;
            if (this.field_s) {
              this.field_t = this.field_u.fire(this.trap.getFacingAngle(-25787), this.trap.getTopElevation(param0 - 5418) << 16, this.getRoot(param0 - 5412), this.trap.getX(3), this.trap.getY(param0 + 4230), this.getRoom(true), 0, 0, MidiVoiceMixer.min(this.trap.getHeight((byte) 55), this.trap.getWidth(param0 ^ -5478), 123) / 2, false);
              if (!this.field_u.hasAmmo(12111)) {
                this.stop(false);
              }
            }
            return;
          }
        } else {
          boolean decompiledFrameRemainder0 = true;
          if (null != this.field_n) {
            this.field_n.tick(0);
            if (!this.field_n.hasToggled(0)) {
              this.field_u.tick(param0 - 5515);
              this.field_t = false;
              if (param0 != 5418) {
                field_r = (kia) null;
                if (this.field_s) {
                  this.field_t = this.field_u.fire(this.trap.getFacingAngle(-25787), this.trap.getTopElevation(param0 - 5418) << 16, this.getRoot(param0 - 5412), this.trap.getX(3), this.trap.getY(param0 + 4230), this.getRoom(true), 0, 0, MidiVoiceMixer.min(this.trap.getHeight((byte) 55), this.trap.getWidth(param0 ^ -5478), 123) / 2, false);
                  if (!this.field_u.hasAmmo(12111)) {
                    this.stop(false);
                  }
                }
                return;
              }
              decompiledFrameRemainder0 = false;
            }
            else {
              stackIn_45_1 = !(this.field_s);
              this.field_s = stackIn_45_1;
            }
          }
          if (decompiledFrameRemainder0) {
            this.field_u.tick(param0 - 5515);
            this.field_t = false;
            if (param0 != 5418) {
              field_r = (kia) null;
            }
          }
        }
        if (!this.field_s) {
          return;
        }
        this.field_t = this.field_u.fire(this.trap.getFacingAngle(-25787), this.trap.getTopElevation(param0 - 5418) << 16, this.getRoot(param0 - 5412), this.trap.getX(3), this.trap.getY(param0 + 4230), this.getRoom(true), 0, 0, MidiVoiceMixer.min(this.trap.getHeight((byte) 55), this.trap.getWidth(param0 ^ -5478), 123) / 2, false);
        if (this.field_u.hasAmmo(12111)) {
          return;
        }
        this.stop(false);
    }

    final int hashState(int param0, int param1) {
        param0 = upa.mixHashBoolean(this.field_s, param0, (byte) -55);
        if (param1 <= -48) {
          param0 = upa.mixHashBoolean(this.field_t, param0, (byte) -119);
          param0 = CurveOperator.mixHash((byte) 89, param0, this.field_u.getCooldown(524288));
          return param0;
        }
        StringCursor var4 = (StringCursor) null;
        WeaponShooterBehaviour.readLiteralToken(-27, (StringCursor) null);
        param0 = upa.mixHashBoolean(this.field_t, param0, (byte) -119);
        param0 = CurveOperator.mixHash((byte) 89, param0, this.field_u.getCooldown(524288));
        return param0;
    }

    static {
        field_r = new kia();
        field_q = new String[100];
    }
}
