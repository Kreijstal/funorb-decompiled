/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class GasTrapComponent extends PrefabComponent {
    private int field_I;
    static String field_J;
    static int field_G;
    static String field_F;
    static String field_H;

    GasTrapComponent(Room param0, int param1) {
        super(param0, param1);
        this.field_I = 262144;
    }

    final boolean s(int param0) {
        if (param0 != -15254) {
          this.field_I = 69;
          return true;
        }
        return true;
    }

    final int t(int param0) {
        if (param0 != 8) {
          Room var3 = (Room) null;
          this.createTrap(false, 31, (Room) null);
          return 7;
        }
        return 7;
    }

    final boolean n(byte param0) {
        if (param0 != -122) {
          field_J = (String) null;
          return false;
        }
        return false;
    }

    final static boolean r(byte param0) {
        int var1 = -84 % ((27 - param0) / 45);
        if (hka.field_b != null) {
          return true;
        }
        if (pn.h(9807)) {
          return true;
        }
        if (null != fj.field_c) {
          return true;
        }
        if (!eba.a(true)) {
          return false;
        }
        return true;
    }

    final boolean v(int param0) {
        if (param0 != 555277520) {
          GasTrapComponent.r((byte) 71);
          return false;
        }
        return false;
    }

    final void encode(boolean param0, BitPacketBuffer param1) {
        try {
          super.encode(param0, param1);
          param1.writeBits((byte) 15, SpawnerBehaviour.a((byte) 8, 2, this.field_I), 6);
        } catch (RuntimeException runtimeException) {
          throw tba.a((Throwable) ((Object) runtimeException), "wqa.V(" + param0 + ',' + (param1 != null ? "{...}" : "null") + ')');
        }
    }

    final Trap createTrap(boolean param0, int param1, Room param2) {
        RuntimeException var4 = null;
        SimpleBlockBehaviour var5 = null;
        TimeSwitchBehaviour var6 = null;
        Trap var7 = null;
        int var8 = 0;
        int var9 = 0;
        SimpleBlockBehaviour var10 = null;
        ModelCodec var11 = null;
        GasVentModel var12 = null;
        Trap var13 = null;
        Trap stackIn_1_0 = null;
        RuntimeException stackIn_4_0 = null;
        StringBuilder stackIn_4_1 = null;
        String stackIn_5_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          var13 = new Trap(param2, param0);
          var13.b((byte) -11, this.field_k, this.field_l);
          var13.a((byte) -3, 0);
          var13.h(3, param1 ^ param1);
          var13.e(false, param1 + 116);
          var13.b((byte) 17, true);
          var13.a(1, (byte) -12, true);
          var5 = new SimpleBlockBehaviour(param2, param0);
          var13.addBehaviour((byte) 83, (Behaviour) (var5));
          var6 = new TimeSwitchBehaviour(param2, param0);
          var6.a(new mg(50 * this.field_I >> 16), (byte) -105);
          var6.k((byte) -91).b(1, 97);
          var13.addBehaviour((byte) 83, (Behaviour) (var6));
          var7 = new Trap(param2, true);
          var8 = param2.getWidth((byte) -86);
          var9 = param2.getHeight(-127);
          var7.b((byte) -11, var9, var8);
          var7.b(437453352, var9 / 2, var8 / 2);
          var7.a((byte) -3, 0);
          var7.b((byte) 17, true);
          var10 = new SimpleBlockBehaviour(param2, true);
          var10.b((byte) -106, true);
          var10.a(16, (byte) -22);
          var7.addBehaviour((byte) 83, (Behaviour) (var10));
          var7.m(-45);
          param2.addTrap(var7, (byte) 32);
          var6.k((byte) -115).h(1).a(9, new lj[]{(lj) ((Object) var7)});
          var11 = rm.field_a;
          var12 = (GasVentModel) (var11.createModel(20, 83));
          var13.a(var6, (byte) 124, var12);
          stackIn_1_0 = var13;
          return stackIn_1_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var4 = decompiledCaughtException;
          stackIn_4_0 = var4;
          stackIn_4_1 = new StringBuilder().append("wqa.AC(").append(param0).append(',').append(param1).append(',');
          if (param2 == null) {
            stackIn_5_2 = "null";
          } else {
            stackIn_5_2 = "{...}";
          }
          throw tba.a((Throwable) ((Object) stackIn_4_0), ((StringBuilder) (Object) stackIn_4_1).append(stackIn_5_2).append(')').toString());
        }
    }

    public static void releaseStatics(boolean param0) {
        if (!param0) {
          return;
        }
        field_J = null;
        field_F = null;
        field_H = null;
    }

    GasTrapComponent(Room param0, int param1, BitPacketBuffer param2, RoomComponent param3) {
        super(param0, param1, param2, param3);
        this.field_I = 262144;
        try {
          this.field_I = ji.a(param2.readBits((byte) 44, 6), 87, 2);
        } catch (RuntimeException runtimeException) {
          throw tba.a((Throwable) ((Object) runtimeException), "wqa.<init>(" + (param0 != null ? "{...}" : "null") + ',' + param1 + ',' + (param2 != null ? "{...}" : "null") + ',' + (param3 != null ? "{...}" : "null") + ')');
        }
    }

    final boolean z(int param0) {
        if (param0 != 0) {
          return false;
        }
        return false;
    }

    final void q(byte param0) {
        super.q(param0);
        this.b(82, 4194304, 4194304);
    }

    static {
        field_G = 0;
        field_F = "You can't slay these septic serpents, so steer clear - or hold <img=10><img=11> to sneak over them.";
        field_J = "The game options are not all set.";
        field_H = "Unable to connect to the data server. Please check any firewall you are using.";
    }
}
