/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class PowerDownItemBehaviour extends ItemBehaviour {
    static boolean field_s;
    private EffectEvent field_t;

    final static void a(int param0, int param1, byte param2, boolean param3, long param4, String param5) {
        ql.field_k.writeCipheredOpcode(param1, -2988);
        ql.field_k.position = ql.field_k.position + 1;
        int var7_int = ql.field_k.position;
        ql.field_k.writeLong(1736565456, param4);
        ql.field_k.writeString(param5, false);
        if (param2 <= 70) {
          return;
        }
        try {
          ql.field_k.writeByte(param0, 0);
          ql.field_k.writeByte(param3 ? 1 : 0, 0);
          ql.field_k.backpatchByteLength(-var7_int + ql.field_k.position, (byte) 35);
        } catch (RuntimeException runtimeException) {
          throw tba.wrapException((Throwable) ((Object) runtimeException), "ok.R(" + param0 + ',' + param1 + ',' + param2 + ',' + param3 + ',' + param4 + ',' + (param5 != null ? "{...}" : "null") + ')');
        }
    }

    final int getTypeId(boolean param0) {
        if (param0) {
          return 89;
        }
        return 6;
    }

    PowerDownItemBehaviour(Room param0, BitPacketBuffer param1, boolean param2) {
        super(param0, param1, param2);
        try {
          this.field_t = (EffectEvent) (EventFactory.readEvent(-25, param1, param0.formatVersion));
        } catch (RuntimeException runtimeException) {
          throw tba.wrapException((Throwable) ((Object) runtimeException), "ok.<init>(" + (param0 != null ? "{...}" : "null") + ',' + (param1 != null ? "{...}" : "null") + ',' + param2 + ')');
        }
    }

    final void encode(boolean param0, BitPacketBuffer param1) {
        try {
          super.encode(param0, param1);
          this.field_t.encode(param1, -5);
        } catch (RuntimeException runtimeException) {
          throw tba.wrapException((Throwable) ((Object) runtimeException), "ok.F(" + param0 + ',' + (param1 != null ? "{...}" : "null") + ')');
        }
    }

    final void onRespawn(byte param0) {
        if (param0 != 3) {
          BitPacketBuffer var3 = (BitPacketBuffer) null;
          this.encode(true, (BitPacketBuffer) null);
        }
    }

    final boolean tryCollect(int param0, Player param1) {
        RuntimeException var3 = null;
        BitPacketBuffer var4 = null;
        RuntimeException stackIn_6_0 = null;
        StringBuilder stackIn_6_1 = null;
        String stackIn_7_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          if (param0 > -114) {
            var4 = (BitPacketBuffer) null;
            this.encode(true, (BitPacketBuffer) null);
          }
          this.getRoom(true).getObserver(-1).queueEvent(this.field_t, param1, true);
          return true;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3 = decompiledCaughtException;
          stackIn_6_0 = var3;
          stackIn_6_1 = new StringBuilder().append("ok.L(").append(param0).append(',');
          if (param1 == null) {
            stackIn_7_2 = "null";
          } else {
            stackIn_7_2 = "{...}";
          }
          throw tba.wrapException((Throwable) ((Object) stackIn_6_0), ((StringBuilder) (Object) stackIn_6_1).append(stackIn_7_2).append(')').toString());
        }
    }

    static {
    }
}
