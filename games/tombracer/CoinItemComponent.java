/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class CoinItemComponent extends ItemComponent {
    static long field_I;
    static int[] field_H;
    static af field_G;

    CoinItemComponent(Room param0, int param1) {
        super(param0, param1);
    }

    final static void a(hea param0, byte param1) {
        int[] var4 = null;
        try {
          var4 = new int[]{22, 1, 3, 4, 12, 14, 13, 8, 9};
          uw.field_g = new wv[13];
          qpa.a(245, var4, 0, 40, 440, 126, 200);
          qpa.a(440, MirrorComponent.field_H, 1, 40, 440, 125, 290);
          qpa.a(275, uj.field_d, 3, 40, 440, 126, 200);
          qpa.a(275, PathMoverComponent.field_F, 5, 40, 440, 124, 200);
          qpa.a(275, vj.field_a, 6, 40, 440, 125, 200);
          qpa.a(480, oe.field_j, 2, 40, 440, 124, 200);
          qpa.a(185, ll.field_g, 4, 40, 440, 126, 200);
          qpa.a(185, hh.field_c, 12, 40, 440, 124, 200);
          int var3 = -120 % ((param1 + 61) / 53);
          qpa.a(205, ma.field_f, 7, 35, 440, 125, 200);
          qpa.a(480, paa.field_x, 8, 40, 440, 126, 200);
          qpa.a(335, mna.field_a, 9, 40, 440, 126, 200);
          qpa.a(400, gca.field_f, 10, 40, 440, 124, 200);
          qpa.a(400, hd.field_b, 11, 40, 440, 125, 200);
          param0.b(qf.field_l);
          param0.b(DamageableBehaviour.field_x);
        } catch (RuntimeException runtimeException) {
          throw tba.a((Throwable) ((Object) runtimeException), "bla.SB(" + (param0 != null ? "{...}" : "null") + ',' + param1 + ')');
        }
    }

    public static void e(boolean param0) {
        if (!param0) {
          field_I = 114L;
          field_H = null;
          field_G = null;
          return;
        }
        field_H = null;
        field_G = null;
    }

    final Trap createTrap(boolean param0, int param1, Room param2) {
        Trap var4 = null;
        RuntimeException var4_ref = null;
        MiscItemBehaviour var5 = null;
        ModelCodec var6 = null;
        ItemModel var7 = null;
        Trap stackIn_2_0 = null;
        Trap stackIn_4_0 = null;
        RuntimeException stackIn_7_0 = null;
        StringBuilder stackIn_7_1 = null;
        String stackIn_8_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          if (param1 != 3) {
            stackIn_2_0 = (Trap) null;
            return stackIn_2_0;
          }
          var4 = super.createTrap(param0, param1 + 0, param2);
          var5 = new MiscItemBehaviour(param2, param0);
          var5.setItemType(1, false);
          var4.addBehaviour((byte) 83, (Behaviour) (var5));
          var6 = rm.field_a;
          var7 = (ItemModel) (var6.createModel(12, 93));
          var7.b((byte) 112, 0);
          var4.a(var5, (byte) 124, var7);
          stackIn_4_0 = var4;
          return stackIn_4_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var4_ref = decompiledCaughtException;
          stackIn_7_0 = var4_ref;
          stackIn_7_1 = new StringBuilder().append("bla.AC(").append(param0).append(',').append(param1).append(',');
          if (param2 == null) {
            stackIn_8_2 = "null";
          } else {
            stackIn_8_2 = "{...}";
          }
          throw tba.a((Throwable) ((Object) stackIn_7_0), ((StringBuilder) (Object) stackIn_7_1).append(stackIn_8_2).append(')').toString());
        }
    }

    final static int a(boolean param0, int param1, int param2) {
        if (param0) {
          return param2 - (1 << param1 - 1);
        }
        field_G = (af) null;
        return param2 - (1 << param1 - 1);
    }

    CoinItemComponent(Room param0, int param1, BitPacketBuffer param2, RoomComponent param3) {
        super(param0, param1, param2, param3);
    }

    static {
    }
}
