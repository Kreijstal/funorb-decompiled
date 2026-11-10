/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class IdolItemComponent extends ItemComponent {
    static String field_G;
    static String field_J;
    static dn field_H;
    static String field_I;
    static int field_L;
    static String field_K;

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
          var4 = super.createTrap(param0, param1, param2);
          var4.a((byte) -3, 2);
          var5 = new MiscItemBehaviour(param2, param0);
          var5.setItemType(3, false);
          var4.addBehaviour((byte) 83, (Behaviour) (var5));
          var6 = rm.field_a;
          var7 = (ItemModel) (var6.createModel(12, param1 ^ 117));
          var7.b((byte) 98, 2);
          var4.a(var5, (byte) 124, var7);
          stackIn_1_0 = var4;
          return stackIn_1_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var4_ref = decompiledCaughtException;
          stackIn_4_0 = var4_ref;
          stackIn_4_1 = new StringBuilder().append("gd.AC(").append(param0).append(',').append(param1).append(',');
          if (param2 == null) {
            stackIn_5_2 = "null";
          } else {
            stackIn_5_2 = "{...}";
          }
          throw tba.a((Throwable) ((Object) stackIn_4_0), ((StringBuilder) (Object) stackIn_4_1).append(stackIn_5_2).append(')').toString());
        }
    }

    IdolItemComponent(Room param0, int param1) {
        super(param0, param1);
    }

    public static void releaseStatics(boolean param0) {
        field_K = null;
        field_I = null;
        field_H = null;
        if (!param0) {
          return;
        }
        field_J = null;
        field_G = null;
    }

    IdolItemComponent(Room param0, int param1, BitPacketBuffer param2, RoomComponent param3) {
        super(param0, param1, param2, param3);
    }

    static {
        field_G = "Unfortunately your configuration doesn't support fullscreen mode.";
        field_J = "Show players in <%0>'s game";
        field_I = "Try changing the '<%0>' setting.";
        field_H = new dn();
        field_K = "Offline";
    }
}
