/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class TouchSwitchBehaviour extends Behaviour implements SwitchSource {
    static String field_o;
    static String field_q;
    static boolean field_s;
    static int field_n;
    static String field_r;
    private SwitchState field_p;

    public static void releaseStatics(int param0) {
        field_o = null;
        field_q = null;
        field_r = null;
        if (param0 != 15) {
          field_s = true;
        }
    }

    final void encode(boolean param0, BitPacketBuffer param1) {
        try {
          super.encode(param0, param1);
          this.field_p.encode(this.getScope((byte) 113), (byte) 82, param1);
        } catch (RuntimeException runtimeException) {
          throw tba.wrapException((Throwable) ((Object) runtimeException), "rh.F(" + param0 + ',' + (param1 != null ? "{...}" : "null") + ')');
        }
    }

    TouchSwitchBehaviour(Room param0, boolean param1) {
        super(param0, param1);
        try {
          this.field_p = new SwitchState(15);
        } catch (RuntimeException runtimeException) {
          throw tba.wrapException((Throwable) ((Object) runtimeException), "rh.<init>(" + (param0 != null ? "{...}" : "null") + ',' + param1 + ')');
        }
    }

    public final int getLitColour(byte param0) {
        if (param0 != -108) {
          return 85;
        }
        return 16776960;
    }

    final int getTypeId(boolean param0) {
        if (param0) {
          field_o = (String) null;
          return 19;
        }
        return 19;
    }

    final static void b(int param0, int param1) {
        BitPacketBuffer var2 = null;
        BitPacketBuffer var2Lifetime1;
        if (param1 <= -98) {
          var2 = ql.field_k;
          var2.writeCipheredOpcode(param0, -2988);
          var2.writeByte(1, 0);
          var2.writeByte(2, 0);
          return;
        }
        field_r = (String) null;
        var2Lifetime1 = ql.field_k;
        var2Lifetime1.writeCipheredOpcode(param0, -2988);
        var2Lifetime1.writeByte(1, 0);
        var2Lifetime1.writeByte(2, 0);
    }

    final void resolveSwitchLinks(int param0) {
        super.resolveSwitchLinks(param0);
        this.field_p.resolveLinks((byte) 48, this.getScope((byte) 106));
    }

    public final int getMaxLevel(int param0) {
        int var2 = 33 / ((-46 - param0) / 45);
        return 0;
    }

    final int hashState(int param0, int param1) {
        if (param1 >= -48) {
          field_s = true;
          return this.field_p.hashState(122, param0);
        }
        return this.field_p.hashState(122, param0);
    }

    TouchSwitchBehaviour(Room param0, BitPacketBuffer param1, boolean param2) {
        super(param0, param1, param2);
        try {
          this.field_p = new SwitchState(15, param0, param1);
        } catch (RuntimeException runtimeException) {
          throw tba.wrapException((Throwable) ((Object) runtimeException), "rh.<init>(" + (param0 != null ? "{...}" : "null") + ',' + (param1 != null ? "{...}" : "null") + ',' + param2 + ')');
        }
    }

    final void tick(int param0) {
        if (this.field_p.f((byte) -56)) {
          this.stop(false);
          this.field_p.setInput((byte) -14, this.isTouchingPlayer(8031));
          if (param0 != 5418) {
            this.getSwitchState((byte) 120);
            return;
          }
          return;
        }
        this.field_p.setInput((byte) -14, this.isTouchingPlayer(8031));
        if (param0 == 5418) {
          return;
        }
        this.getSwitchState((byte) 120);
    }

    public final int getDimColour(int param0) {
        if (param0 != 17832) {
          field_s = true;
          return 5592320;
        }
        return 5592320;
    }

    public final int getLevel(byte param0) {
        if (param0 != -108) {
          return -60;
        }
        return 0;
    }

    public final SwitchState getSwitchState(byte param0) {
        if (param0 >= -67) {
          return (SwitchState) null;
        }
        return this.field_p;
    }

    static {
        field_o = "<%0> has left the lobby.";
        field_q = "Ten-megawatt lasers";
        field_n = 22;
        field_r = "To report a player, right-click on their name and select the option to report abuse.";
    }
}
