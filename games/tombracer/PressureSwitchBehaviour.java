/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class PressureSwitchBehaviour extends Behaviour implements SwitchSource {
    static UiComponent field_p;
    private SwitchState field_n;
    static int field_r;
    private boolean field_q;
    private int requiredWeight;
    private int loadWeight;
    static String[] field_s;

    public static void releaseStatics(int param0) {
        field_s = null;
        if (param0 != 1) {
          field_r = 91;
        }
        field_p = null;
    }

    final int hashState(int param0, int param1) {
        if (param1 >= -48) {
          this.getDimColour(56);
        }
        param0 = CurveOperator.mixHash((byte) 122, param0, this.loadWeight);
        return this.field_n.hashState(105, param0);
    }

    final void tick(int param0) {
        int var2;
        CollisionGrid var3;
        Collidable[] var4;
        int var5;
        int var6;
        int var5Lifetime1;
        var6 = TombRacer.field_G ? 1 : 0;
        if (this.field_n.f((byte) -56)) {
          this.stop(false);
        }
        var2 = 0;
        var3 = this.getRoom(true).collisionGrid;
        var4 = var3.queryCollidable((byte) -26, this.trap);
        for (var5 = 0; var5 < var4.length; var5++) {
          if (this.isPressingPlate(var4[var5], (byte) -103)) {
            var2 = var2 + var4[var5].getWeight(75);
          }
        }
        this.loadWeight = var2;
        var5Lifetime1 = 0;
        if (param0 != 5418) {
          return;
        }
        if (0 < var2 &&
          this.requiredWeight <= var2) {
          var5Lifetime1 = 1;
        }
        this.field_n.setInput((byte) -14, var5Lifetime1 != 0);
    }

    public final int getDimColour(int param0) {
        if (param0 != 17832) {
          this.tick(121);
        }
        return 3364198;
    }

    final void encode(boolean param0, BitPacketBuffer param1) {
        try {
          super.encode(param0, param1);
          param1.writeBits((byte) -127, this.requiredWeight, 8);
          param1.writeBits((byte) -128, !this.field_q ? 0 : 1, 1);
          this.field_n.encode(this.getScope((byte) 117), (byte) 117, param1);
        } catch (RuntimeException runtimeException) {
          throw MonochromeRowCacheEntry.wrapException((Throwable) ((Object) runtimeException), "dja.F(" + param0 + ',' + (param1 != null ? "{...}" : "null") + ')');
        }
    }

    PressureSwitchBehaviour(Room param0, BitPacketBuffer param1, boolean param2) {
        super(param0, param1, param2);
        try {
          this.requiredWeight = param1.readBits((byte) 44, 8);
          if (param0.formatVersion <= 10) {
            this.requiredWeight = this.requiredWeight / 5;
          }
          if (9 <= param0.formatVersion) {
            this.field_q = 1 != param1.readBits((byte) 44, 1) ? false : true;
          }
          this.field_n = new SwitchState(15, param0, param1);
        } catch (RuntimeException runtimeException) {
          throw MonochromeRowCacheEntry.wrapException((Throwable) ((Object) runtimeException), "dja.<init>(" + (param0 != null ? "{...}" : "null") + ',' + (param1 != null ? "{...}" : "null") + ',' + param2 + ')');
        }
    }

    public final int getMaxLevel(int param0) {
        int var2 = 33 % ((param0 + 46) / 45);
        return this.requiredWeight;
    }

    PressureSwitchBehaviour(Room param0, boolean param1) {
        super(param0, param1);
        try {
          this.requiredWeight = 50;
          this.field_n = new SwitchState(15);
        } catch (RuntimeException runtimeException) {
          throw MonochromeRowCacheEntry.wrapException((Throwable) ((Object) runtimeException), "dja.<init>(" + (param0 != null ? "{...}" : "null") + ',' + param1 + ')');
        }
    }

    final int getTypeId(boolean param0) {
        if (param0) {
          field_s = (String[]) null;
        }
        return 17;
    }

    public final int getLitColour(byte param0) {
        if (param0 != -108) {
          return -69;
        }
        return 8969727;
    }

    public final SwitchState getSwitchState(byte param0) {
        if (param0 >= -67) {
          this.field_q = true;
        }
        return this.field_n;
    }

    final void setRequiredWeight(int param0, boolean param1) {
        this.requiredWeight = param0;
        if (!param1) {
          PressureSwitchBehaviour.releaseStatics(56);
        }
    }

    private final boolean isPressingPlate(Collidable param0, byte param1) {
        RuntimeException var3 = null;
        RuntimeException stackIn_20_0 = null;
        StringBuilder stackIn_20_1 = null;
        String stackIn_21_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          if (!param0.restsOnFloor(124)) {
            return false;
          }
          if (param1 > -73) {
            this.tick(15);
          }
          if (this.trap == param0) {
            return false;
          }
          if (!this.field_q) {
            if (!io.centredBoxesOverlap(this.trap.getWidth(-73), param0.getY(9648), (byte) -89, this.trap.getHeight((byte) 55), param0.getX(3), this.trap.getY(9648), param0.getHeight((byte) 55), param0.getWidth(-43), this.trap.getX(3))) {
              return false;
            }
          } else {
            if (!ck.containsCentredBox(param0.getX(3), param0.getHeight((byte) 55), this.trap.getX(3), this.trap.getWidth(-113), this.trap.getHeight((byte) 55), param0.getY(9648), (byte) 67, this.trap.getY(9648), param0.getWidth(-51))) {
              return false;
            }
          }
          return true;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3 = decompiledCaughtException;
          stackIn_20_0 = var3;
          stackIn_20_1 = new StringBuilder().append("dja.P(");
          if (param0 == null) {
            stackIn_21_2 = "null";
          } else {
            stackIn_21_2 = "{...}";
          }
          throw MonochromeRowCacheEntry.wrapException((Throwable) ((Object) stackIn_20_0), ((StringBuilder) (Object) stackIn_20_1).append(stackIn_21_2).append(',').append(param1).append(')').toString());
        }
    }

    final void resolveSwitchLinks(int param0) {
        super.resolveSwitchLinks(param0);
        this.field_n.resolveLinks((byte) 48, this.getScope((byte) 125));
    }

    public final int getLevel(byte param0) {
        if (param0 != -108) {
          this.field_q = true;
        }
        return this.loadWeight;
    }

    final static boolean isAsciiLetter(byte param0, char param1) {
        int var2;
        boolean stackIn_8_0 = false;
        boolean decompiledFrameRemainder0 = true;
        var2 = -39 % ((param0 + 76) / 36);
        if ((param1 < 65 ||
          param1 > 90) && (param1 < 97 ||
          param1 > 122)) {
          stackIn_8_0 = false;
          decompiledFrameRemainder0 = false;
        }
        else {
          stackIn_8_0 = true;
        }
        return stackIn_8_0;
    }

    final static boolean dispatchCancelKey(int param0, int param1, byte param2, int param3) {
        if (hka.field_b != null &&
          hka.field_b.handleEscape(13)) {
          wp.closeContextMenu(param2 ^ 105);
          return true;
        }
        if (null != RoomViewRenderer.field_c &&
          RoomViewRenderer.field_c.handleCancelKey(true)) {
          RoomViewRenderer.field_c = null;
          wp.closeContextMenu(-1);
          return true;
        }
        if (param2 != -106) {
          field_s = (String[]) null;
        }
        if (bc.a(true)) {
          return true;
        }
        if (Puddle.routeKeyInput(param3, (byte) -44, param1, param0)) {
          return true;
        }
        return false;
    }

    static {
        field_r = 7;
    }
}
