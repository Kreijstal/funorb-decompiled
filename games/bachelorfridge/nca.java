/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class nca {
    static String field_b;
    static IndexedSprite[] field_a;

    public static void a(byte param0) {
        if (param0 != 87) {
          field_b = (String) null;
          field_a = null;
          field_b = null;
          return;
        }
        field_a = null;
        field_b = null;
    }

    final static void a(int param0, PacketBuffer param1, BattleUpdate param2) {
        if (param2 == null) {
          param1.writeByte(-1, 0);
          return;
        }
        try {
          if (param0 < 82) {
            BattleUpdate var4 = (BattleUpdate) null;
            nca.a(-125, (PacketBuffer) null, (BattleUpdate) null);
          }
          param1.writeByte(param2.field_h, 0);
          param2.a(param1, -9);
        } catch (RuntimeException runtimeException) {
          throw pe.wrapException((Throwable) ((Object) runtimeException), "nca.B(" + param0 + ',' + (param1 != null ? "{...}" : "null") + ',' + (param2 != null ? "{...}" : "null") + ')');
        }
    }

    static {
        field_b = "Connection timed out. Please try using a different server.";
    }
}
