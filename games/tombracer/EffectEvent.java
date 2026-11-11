/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class EffectEvent extends GameEvent {
    static ur field_l;
    private int effectSlot;
    private int value;
    static Sprite field_j;
    static String field_i;
    static String field_m;

    final void encode(BitPacketBuffer param0, int param1) {
        try {
          super.encode(param0, param1);
          param0.writeBits((byte) -128, this.effectSlot, 4);
          param0.writeBits((byte) -125, this.value, 6);
        } catch (RuntimeException runtimeException) {
          throw MonochromeRowCacheEntry.wrapException((Throwable) ((Object) runtimeException), "gfa.G(" + (param0 != null ? "{...}" : "null") + ',' + param1 + ')');
        }
    }

    public static void releaseStatics(int param0) {
        field_i = null;
        field_m = null;
        field_l = null;
        if (param0 <= 33) {
          EffectEvent.releaseStatics(-87);
          field_j = null;
          return;
        }
        field_j = null;
    }

    final boolean isRoomScoped(boolean param0) {
        if (param0) {
          return false;
        }
        int var2 = this.effectSlot;
        if (var2 == 4) {
          return true;
        }
        if (var2 == 5) {
          return true;
        }
        return false;
    }

    final int getTypeId(byte param0) {
        if (param0 != 121) {
          this.value = -8;
          return 0;
        }
        return 0;
    }

    EffectEvent(int param0, BitPacketBuffer param1) {
        super(param0, param1);
        try {
          this.effectSlot = param1.readBits((byte) 44, 4);
          this.value = param1.readBits((byte) 44, 6);
        } catch (RuntimeException runtimeException) {
          throw MonochromeRowCacheEntry.wrapException((Throwable) ((Object) runtimeException), "gfa.<init>(" + param0 + ',' + (param1 != null ? "{...}" : "null") + ')');
        }
    }

    final int getValue(byte param0) {
        if (param0 != -28) {
          field_j = (Sprite) null;
          return this.value;
        }
        return this.value;
    }

    final boolean isEquivalentTo(boolean param0, GameEvent param1) {
        RuntimeException var3 = null;
        boolean stackIn_9_0 = false;
        RuntimeException stackIn_12_0 = null;
        StringBuilder stackIn_12_1 = null;
        String stackIn_13_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          if (param0) {
            field_j = (Sprite) null;
          }
          if (!(param1 instanceof EffectEvent)) {
            return false;
          }
          stackIn_9_0 = (((EffectEvent) (param1)).effectSlot == this.effectSlot);
          return stackIn_9_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3 = decompiledCaughtException;
          stackIn_12_0 = var3;
          stackIn_12_1 = new StringBuilder().append("gfa.I(").append(param0).append(',');
          if (param1 == null) {
            stackIn_13_2 = "null";
          } else {
            stackIn_13_2 = "{...}";
          }
          throw MonochromeRowCacheEntry.wrapException((Throwable) ((Object) stackIn_12_0), ((StringBuilder) (Object) stackIn_12_1).append(stackIn_13_2).append(')').toString());
        }
    }

    final void applyTick(PlayerSimulation param0, int param1, int param2, int param3) {
        RuntimeException var5 = null;
        RuntimeException stackIn_8_0 = null;
        StringBuilder stackIn_8_1 = null;
        String stackIn_9_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          if (param1 <= 110) {
            field_j = (Sprite) null;
          }
          if (this.isRoomScoped(false)) {
            param0.setRoomEffectSlot(this.effectSlot, param3, -121, param2);
            return;
          }
          param0.setEffectSlot(this.effectSlot, param3, -85);
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var5 = decompiledCaughtException;
          stackIn_8_0 = var5;
          stackIn_8_1 = new StringBuilder().append("gfa.A(");
          if (param0 == null) {
            stackIn_9_2 = "null";
          } else {
            stackIn_9_2 = "{...}";
          }
          throw MonochromeRowCacheEntry.wrapException((Throwable) ((Object) stackIn_8_0), ((StringBuilder) (Object) stackIn_8_1).append(stackIn_9_2).append(',').append(param1).append(',').append(param2).append(',').append(param3).append(')').toString());
        }
    }

    final void finish(int param0, byte param1, PlayerSimulation param2) {
        try {
          if (this.isRoomScoped(false)) {
            param2.clearRoomEffectSlot((byte) -97, this.effectSlot, param0);
          } else {
            param2.setEffectSlot(this.effectSlot, -1);
          }
          int var4_int = 30 % ((param1 - 46) / 46);
        } catch (RuntimeException runtimeException) {
          throw MonochromeRowCacheEntry.wrapException((Throwable) ((Object) runtimeException), "gfa.E(" + param0 + ',' + param1 + ',' + (param2 != null ? "{...}" : "null") + ')');
        }
    }

    static {
        field_l = new ur(3);
        field_i = "This is <%0>'s RuneScape clan if they have one.";
        field_m = "Report abuse";
    }
}
