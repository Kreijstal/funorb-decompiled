/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class RopeBridgeComponent extends PrefabComponent {
    static jea field_F;
    private int field_H;
    static String field_I;
    static String field_G;

    final int getRenderLayer(int param0) {
        if (param0 != 8) {
          this.field_H = 63;
          return 7;
        }
        return 7;
    }

    final boolean isSwitchable(int param0) {
        if (param0 != -15254) {
          return false;
        }
        return false;
    }

    final boolean hasSize(int param0) {
        if (param0 != 555277520) {
          return false;
        }
        return true;
    }

    RopeBridgeComponent(Room param0, int param1) {
        super(param0, param1);
    }

    RopeBridgeComponent(Room param0, int param1, BitPacketBuffer param2, RoomComponent param3) {
        super(param0, param1, param2, param3);
        try {
          this.field_H = param2.readBits((byte) 44, 4);
        } catch (RuntimeException runtimeException) {
          throw tba.a((Throwable) ((Object) runtimeException), "lda.<init>(" + (param0 != null ? "{...}" : "null") + ',' + param1 + ',' + (param2 != null ? "{...}" : "null") + ',' + (param3 != null ? "{...}" : "null") + ')');
        }
    }

    final boolean hasAngle(byte param0) {
        if (param0 != -122) {
          this.field_H = -119;
          return false;
        }
        return false;
    }

    final void encode(boolean param0, BitPacketBuffer param1) {
        try {
          super.encode(param0, param1);
          param1.writeBits((byte) -125, this.field_H, 4);
        } catch (RuntimeException runtimeException) {
          throw tba.a((Throwable) ((Object) runtimeException), "lda.V(" + param0 + ',' + (param1 != null ? "{...}" : "null") + ')');
        }
    }

    final Trap createTrap(boolean param0, int param1, Room param2) {
        Trap var4 = null;
        RuntimeException var4_ref = null;
        PlatformBehaviour var5 = null;
        Trap var6 = null;
        Trap var7 = null;
        SimpleBlockBehaviour var8 = null;
        SimpleBlockBehaviour var9 = null;
        ModelCodec var10 = null;
        BridgeModel var11 = null;
        int var12 = 0;
        Trap var13 = null;
        Trap stackIn_8_0 = null;
        RuntimeException stackIn_11_0 = null;
        StringBuilder stackIn_11_1 = null;
        String stackIn_12_2 = null;
        RuntimeException decompiledCaughtException = null;
        var12 = TombRacer.field_G ? 1 : 0;
        try {
          var13 = new Trap(param2, param0);
          var4 = var13;
          if (this.typeId != 46) {
            var13.setSize((byte) -11, this.height, 4194304);
          } else {
            var13.setSize((byte) -11, 4194304, this.width);
          }
          var5 = new PlatformBehaviour(param2, param0);
          var5.b(-5, this.field_H);
          var13.addBehaviour((byte) 83, (Behaviour) (var5));
          var6 = new Trap(param2, param0);
          var7 = new Trap(param2, param0);
          if (this.typeId == 46) {
            var6.setSize((byte) -11, 524288, this.width);
            var6.b(437453352, -1835008, 0);
            var7.setSize((byte) -11, 524288, this.width);
            var7.b(437453352, 1835008, 0);
          } else {
            var6.setSize((byte) -11, this.height, 524288);
            var6.b(437453352, 0, -1835008);
            var7.setSize((byte) -11, this.height, 524288);
            var7.b(437453352, 0, 1835008);
          }
          var6.setFloating((byte) 17, false);
          var6.setObstructionLevel(3, param1 - 3);
          var8 = new SimpleBlockBehaviour(param2, param0);
          var8.a(true, -45);
          var8.a(-28592, true);
          var6.addBehaviour((byte) 83, (Behaviour) (var8));
          var7.setFloating((byte) 17, false);
          var7.setObstructionLevel(param1, 0);
          var9 = new SimpleBlockBehaviour(param2, param0);
          var9.a(true, -128);
          var9.a(-28592, true);
          var7.addBehaviour((byte) 83, (Behaviour) (var9));
          var13.addChild(-107, var6);
          var13.addChild(param1 ^ -61, var7);
          var10 = rm.field_a;
          var11 = (BridgeModel) (var10.createModel(19, param1 ^ 106));
          var11.b((byte) 80, 0);
          var13.a(var5, (byte) 124, var11);
          stackIn_8_0 = var13;
          return stackIn_8_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var4_ref = decompiledCaughtException;
          stackIn_11_0 = var4_ref;
          stackIn_11_1 = new StringBuilder().append("lda.AC(").append(param0).append(',').append(param1).append(',');
          if (param2 == null) {
            stackIn_12_2 = "null";
          } else {
            stackIn_12_2 = "{...}";
          }
          throw tba.a((Throwable) ((Object) stackIn_11_0), ((StringBuilder) (Object) stackIn_11_1).append(stackIn_12_2).append(')').toString());
        }
    }

    public static void releaseStatics(byte param0) {
        field_G = null;
        if (param0 >= -38) {
          field_G = (String) null;
          field_F = null;
          field_I = null;
          return;
        }
        field_F = null;
        field_I = null;
    }

    final boolean z(int param0) {
        if (param0 != 0) {
          this.isSwitchable(26);
          return false;
        }
        return false;
    }

    final void q(byte param0) {
        super.q(param0);
    }

    static {
        field_I = "Offer draw";
        field_G = "Moving platforms";
    }
}
