/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class RevolverItemComponent extends ItemComponent {
    static ResourceArchive field_H;
    static String field_G;
    static ka[] field_J;
    static String field_I;

    public static void releaseStatics(byte param0) {
        field_H = null;
        field_J = null;
        field_I = null;
        if (param0 != -18) {
          field_J = (ka[]) null;
          field_G = null;
          return;
        }
        field_G = null;
    }

    final Trap createTrap(boolean param0, int param1, Room param2) {
        Trap var4 = null;
        RuntimeException var4_ref = null;
        WeaponItemBehaviour var5 = null;
        ModelCodec var6 = null;
        ItemModel var7 = null;
        Trap stackIn_1_0 = null;
        RuntimeException stackIn_4_0 = null;
        StringBuilder stackIn_4_1 = null;
        String stackIn_5_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          var4 = super.createTrap(param0, 3, param2);
          var5 = new WeaponItemBehaviour(param2, param0);
          var5.setWeapon(TextureOperator.createFullWeapon(4, -1), 5);
          var4.addBehaviour((byte) 83, (Behaviour) (var5));
          var4.setStatCategory(param1, 146366800);
          var6 = rm.field_a;
          var7 = (ItemModel) (var6.createModel(12, 104));
          var7.b((byte) 74, 4);
          var4.addModel(var5, (byte) 124, var7);
          stackIn_1_0 = var4;
          return stackIn_1_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var4_ref = decompiledCaughtException;
          stackIn_4_0 = var4_ref;
          stackIn_4_1 = new StringBuilder().append("df.AC(").append(param0).append(',').append(param1).append(',');
          if (param2 == null) {
            stackIn_5_2 = "null";
          } else {
            stackIn_5_2 = "{...}";
          }
          throw tba.wrapException((Throwable) ((Object) stackIn_4_0), ((StringBuilder) (Object) stackIn_4_1).append(stackIn_5_2).append(')').toString());
        }
    }

    RevolverItemComponent(Room param0, int param1) {
        super(param0, param1);
    }

    RevolverItemComponent(Room param0, int param1, BitPacketBuffer param2, RoomComponent param3) {
        super(param0, param1, param2, param3);
    }

    static {
        field_G = "Type your password again to make sure it's correct";
        field_I = "Cancel rematch";
    }
}
