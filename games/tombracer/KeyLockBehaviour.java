/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class KeyLockBehaviour extends Behaviour implements SwitchSource {
    private int field_p;
    private int field_n;
    private boolean field_s;
    private SwitchState field_q;
    private boolean field_t;
    static jea field_r;
    static String field_o;

    final void tick(int param0) {
        if (this.field_q.f((byte) -56)) {
          this.stop(false);
        }
        if (param0 == 5418) {
          this.field_t = this.r(param0 - 5416);
          this.field_q.a((byte) -14, this.field_t);
          return;
        }
        this.b(-64, 64);
        this.field_t = this.r(param0 - 5416);
        this.field_q.a((byte) -14, this.field_t);
    }

    private final boolean r(int param0) {
        int stackIn_6_1 = 0;
        int stackIn_19_1 = 0;
        int var3;
        int var4;
        int var5;
        Player var6;
        Player var7;
        Player var8;
        int var3Lifetime1;
        int var4Lifetime1;
        int var5Lifetime1;
        if (!this.field_s) {
          var8 = this.getRoom(true).getPlayer(-98);
          if (var8.getHeldItemKind((byte) 127) != 1) {
            stackIn_19_1 = 0;
          } else {
            stackIn_19_1 = 1;
          }
          this.field_n = stackIn_19_1;
          var3 = var8.getX(3) - this.trap.getX(3);
          var4 = var8.getY(param0 ^ 9650) - this.trap.getY(9648);
          var5 = 262144;
          if (ua.abs(var3, param0 ^ -122) <= this.trap.getWidth(-120) / param0 + var8.getWidth(-59) / 2 + var5 &&
            ua.abs(var4, -121) <= var5 + this.trap.getHeight((byte) 55) / 2 + var8.getHeight((byte) 55) / 2) {
            if (this.field_p > this.field_n) {
              return false;
            }
            if (!this.field_s) {
              return true;
            }
            var8.clearHeldItem(0);
            return true;
          }
          this.field_n = 0;
          return false;
        }
        if (this.field_t) {
          return true;
        }
        var7 = this.getRoom(true).getPlayer(-98);
        var6 = var7;
        if (var7.getHeldItemKind((byte) 127) != 1) {
          stackIn_6_1 = 0;
        } else {
          stackIn_6_1 = 1;
        }
        this.field_n = stackIn_6_1;
        var3Lifetime1 = var7.getX(3) - this.trap.getX(3);
        var4Lifetime1 = var7.getY(param0 ^ 9650) - this.trap.getY(9648);
        var5Lifetime1 = 262144;
        if (ua.abs(var3Lifetime1, param0 ^ -122) > this.trap.getWidth(-120) / param0 + var7.getWidth(-59) / 2 + var5Lifetime1) {
          this.field_n = 0;
          return false;
        }
        if (ua.abs(var4Lifetime1, -121) > var5Lifetime1 + this.trap.getHeight((byte) 55) / 2 + var7.getHeight((byte) 55) / 2) {
          this.field_n = 0;
          return false;
        }
        if (this.field_p > this.field_n) {
          return false;
        }
        if (!this.field_s) {
          return true;
        }
        var7.clearHeldItem(0);
        return true;
    }

    final void attachToTrap(boolean param0, Trap param1) {
        if (!param0) {
          return;
        }
        try {
          super.attachToTrap(param0, param1);
        } catch (RuntimeException runtimeException) {
          throw tba.a((Throwable) ((Object) runtimeException), "sm.Q(" + param0 + ',' + (param1 != null ? "{...}" : "null") + ')');
        }
    }

    public final int getLevel(byte param0) {
        if (param0 != -108) {
          this.field_p = 106;
          return this.field_n;
        }
        return this.field_n;
    }

    public static void l(int param0) {
        field_o = null;
        field_r = null;
        if (param0 != 11162931) {
          KeyLockBehaviour.a(-113, -37, -83);
        }
    }

    public final int getDimColour(int param0) {
        if (param0 != 17832) {
          this.hashState(97, 98);
          return 7820595;
        }
        return 7820595;
    }

    public final SwitchState getSwitchState(byte param0) {
        if (param0 > -67) {
          return (SwitchState) null;
        }
        return this.field_q;
    }

    final static boolean a(int param0, int param1, int param2) {
        if (param0 != 2) {
          KeyLockBehaviour.a(52, -115, -20);
          if (!o.a(-1, param2, param1)) {
            return vua.e(param1, param2, 13650) ? true : false;
          }
          return true;
        }
        if (o.a(-1, param2, param1)) {
          return true;
        }
        if (!vua.e(param1, param2, 13650)) {
          return false;
        }
        return true;
    }

    KeyLockBehaviour(Room param0, boolean param1) {
        super(param0, param1);
        this.field_s = true;
        this.field_p = 1;
        try {
          this.field_q = new SwitchState(15);
        } catch (RuntimeException runtimeException) {
          throw tba.a((Throwable) ((Object) runtimeException), "sm.<init>(" + (param0 != null ? "{...}" : "null") + ',' + param1 + ')');
        }
    }

    public final int getMaxLevel(int param0) {
        int var2 = 44 / ((-46 - param0) / 45);
        return this.field_p;
    }

    final int hashState(int param0, int param1) {
        if (param1 >= -48) {
          return -8;
        }
        return this.field_q.hashState(77, param0);
    }

    final void b(int param0, int param1) {
        this.field_p = param1;
        if (param0 != 0) {
          KeyLockBehaviour.a(8, -65, -15);
        }
    }

    final void g(int param0) {
        super.g(param0);
        this.field_q.a((byte) 48, this.getScope((byte) 109));
    }

    KeyLockBehaviour(Room param0, BitPacketBuffer param1, boolean param2) {
        super(param0, param1, param2);
        this.field_s = true;
        this.field_p = 1;
        try {
          if (16 < param0.formatVersion) {
            this.field_p = 1;
          } else {
            this.field_p = param1.readBits((byte) 44, 3);
          }
          this.field_q = new SwitchState(15, param0, param1);
          this.field_s = 1 == param1.readBits((byte) 44, 1) ? true : false;
        } catch (RuntimeException runtimeException) {
          throw tba.a((Throwable) ((Object) runtimeException), "sm.<init>(" + (param0 != null ? "{...}" : "null") + ',' + (param1 != null ? "{...}" : "null") + ',' + param2 + ')');
        }
    }

    final int getTypeId(boolean param0) {
        if (param0) {
          this.getMaxLevel(82);
          return 32;
        }
        return 32;
    }

    final void encode(boolean param0, BitPacketBuffer param1) {
        try {
          super.encode(param0, param1);
          this.field_q.a(this.getScope((byte) 111), (byte) 108, param1);
          param1.writeBits((byte) -127, this.field_s ? 1 : 0, 1);
        } catch (RuntimeException runtimeException) {
          throw tba.a((Throwable) ((Object) runtimeException), "sm.F(" + param0 + ',' + (param1 != null ? "{...}" : "null") + ')');
        }
    }

    public final int getLitColour(byte param0) {
        if (param0 != -108) {
          this.field_p = -8;
          return 11162931;
        }
        return 11162931;
    }

    static {
        field_o = "Back";
    }
}
