/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class PowerUpItemBehaviour extends ItemBehaviour {
    private StatusEffect field_x;
    static String field_s;
    static ToolkitModel[] field_t;
    static String field_v;
    static boolean[][] field_u;
    static int field_w;

    PowerUpItemBehaviour(Room param0, BitPacketBuffer param1, boolean param2) {
        super(param0, param1, param2);
        try {
          this.field_x = new StatusEffect(param0, param1);
        } catch (RuntimeException runtimeException) {
          throw tba.wrapException((Throwable) ((Object) runtimeException), "rl.<init>(" + (param0 != null ? "{...}" : "null") + ',' + (param1 != null ? "{...}" : "null") + ',' + param2 + ')');
        }
    }

    final int getTypeId(boolean param0) {
        if (param0) {
          BitPacketBuffer var3 = (BitPacketBuffer) null;
          this.encode(false, (BitPacketBuffer) null);
          return 7;
        }
        return 7;
    }

    final void onRespawn(byte param0) {
        if (param0 != 3) {
          return;
        }
        this.field_x = this.field_x.copy(-1);
    }

    final void encode(boolean param0, BitPacketBuffer param1) {
        try {
          super.encode(param0, param1);
          this.field_x.encode(-29928, param1);
        } catch (RuntimeException runtimeException) {
          throw tba.wrapException((Throwable) ((Object) runtimeException), "rl.F(" + param0 + ',' + (param1 != null ? "{...}" : "null") + ')');
        }
    }

    public static void releaseStatics(boolean param0) {
        field_t = null;
        if (param0) {
          field_u = (boolean[][]) null;
          field_s = null;
          field_v = null;
          return;
        }
        field_v = (String) null;
        field_u = (boolean[][]) null;
        field_s = null;
        field_v = null;
    }

    final static int r(int param0) {
        int var1_int = 0;
        RuntimeException var1 = null;
        int var2 = 0;
        int stackIn_7_0 = 0;
        int stackIn_11_0 = 0;
        int stackIn_14_0 = 0;
        int stackIn_18_0 = 0;
        int stackIn_23_0 = 0;
        int stackIn_25_0 = 0;
        RuntimeException decompiledCaughtException = null;
        var2 = TombRacer.field_G ? 1 : 0;
        try {
          ej.field_a.processPointerFrame(SocketArchiveNetworkClient.field_u, true, oi.field_b, -116);
          ej.field_a.g((byte) -127);
          while (NanoTickClock.pollKeyEvent(true)) {
            ej.field_a.dispatchKeyInput((byte) 116, MenuEntry.field_h, HardwareOpenGlToolkit.field_td);
          }
          if (bf.field_a != -1) {
            var1_int = bf.field_a;
            jsa.a(false, -1);
            stackIn_7_0 = var1_int;
            return stackIn_7_0;
          }
          if (TileOperator.field_p) {
            stackIn_11_0 = 3;
            return stackIn_11_0;
          }
          if (gsa.field_y == wt.field_d) {
            stackIn_14_0 = 1;
            return stackIn_14_0;
          }
          if (!DefaultRoomObjectRenderer.field_b.isComplete(108)) {
            stackIn_18_0 = 1;
            return stackIn_18_0;
          }
          if (param0 > -87) {
            field_u = (boolean[][]) null;
          }
          if (gsa.field_y != LegacyOpenGlTexture.field_a) {
            stackIn_25_0 = -1;
            return stackIn_25_0;
          }
          stackIn_23_0 = 2;
          return stackIn_23_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var1 = decompiledCaughtException;
          throw tba.wrapException((Throwable) ((Object) var1), "rl.U(" + param0 + ')');
        }
    }

    final boolean tryCollect(int param0, Player param1) {
        RuntimeException var3 = null;
        RuntimeException stackIn_7_0 = null;
        StringBuilder stackIn_7_1 = null;
        String stackIn_8_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          if (param0 > -114) {
            return false;
          }
          param1.addStatusEffect(this.field_x, (byte) 3);
          return true;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3 = decompiledCaughtException;
          stackIn_7_0 = var3;
          stackIn_7_1 = new StringBuilder().append("rl.L(").append(param0).append(',');
          if (param1 == null) {
            stackIn_8_2 = "null";
          } else {
            stackIn_8_2 = "{...}";
          }
          throw tba.wrapException((Throwable) ((Object) stackIn_7_0), ((StringBuilder) (Object) stackIn_7_1).append(stackIn_8_2).append(')').toString());
        }
    }

    static {
        field_v = "Finish Order";
        field_s = "Portals";
        field_w = 0;
    }
}
