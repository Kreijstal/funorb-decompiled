/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class KeyItemComponent extends ItemComponent {
    static int field_G;

    final static void e(boolean param0) {
        if (!qga.field_m) {
          throw new IllegalStateException();
        }
        sra.field_t = param0;
        jda.a(false, 262144);
        Transform3D.field_c = 0;
    }

    final Trap createTrap(boolean param0, int param1, Room param2) {
        Trap var4 = null;
        RuntimeException var4_ref = null;
        MiscItemBehaviour var5 = null;
        ModelCodec var6 = null;
        ItemModel var7 = null;
        Trap stackIn_1_0 = null;
        RuntimeException stackIn_4_0 = null;
        StringBuilder stackIn_4_1 = null;
        String stackIn_5_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          var4 = super.createTrap(param0, 3, param2);
          var4.a((byte) -3, 1);
          var5 = new MiscItemBehaviour(param2, param0);
          var5.setItemType(0, false);
          var4.addBehaviour((byte) 83, (Behaviour) (var5));
          var6 = rm.field_a;
          var7 = (ItemModel) (var6.createModel(12, param1 + 94));
          var7.b((byte) 123, param1);
          var4.a(var5, (byte) 124, var7);
          stackIn_1_0 = var4;
          return stackIn_1_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var4_ref = decompiledCaughtException;
          stackIn_4_0 = var4_ref;
          stackIn_4_1 = new StringBuilder().append("tta.AC(").append(param0).append(',').append(param1).append(',');
          if (param2 == null) {
            stackIn_5_2 = "null";
          } else {
            stackIn_5_2 = "{...}";
          }
          throw tba.a((Throwable) ((Object) stackIn_4_0), ((StringBuilder) (Object) stackIn_4_1).append(stackIn_5_2).append(')').toString());
        }
    }

    KeyItemComponent(Room param0, int param1, BitPacketBuffer param2, RoomComponent param3) {
        super(param0, param1, param2, param3);
    }

    KeyItemComponent(Room param0, int param1) {
        super(param0, param1);
    }

    static {
        field_G = 0;
    }
}
