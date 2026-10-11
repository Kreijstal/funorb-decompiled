/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class bu {
    static dn field_a;
    static RgbSprite[] field_c;
    static sl field_b;

    final static void a(int param0, Unit param1, int param2, PacketBuffer param3) {
        RuntimeException stackIn_16_0 = null;
        StringBuilder stackIn_16_1 = null;
        String stackIn_17_2 = null;
        StringBuilder stackIn_19_1 = null;
        String stackIn_20_2 = null;
        RuntimeException decompiledCaughtException = null;
        int var4_int = 0;
        RuntimeException var4 = null;
        int var5 = 0;
        try {
          var4_int = param1.packStatusFlags((byte) 117);
          param3.b(param2 - 1, param1.bonusStrength & 31 | param1.ownerPlayer << 5);
          param3.b(true, var4_int);
          param3.b(1, param0 + param1.maximumStrength);
          param3.b(1, param1.strength + param0);
          param3.b(1, param1.statusEffectValue << 4 | param1.statusEffectType);
          param3.b(1, param1.accessoryType);
          param3.b(1, param1.equipmentDescriptor);
          param3.b(param2 - 1, param1.immobilizedTurns);
          param3.b(1, param1.movementFlags);
          if ((4 & param1.movementFlags) != 0) {
            param3.a(param1.displayName, 413740432);
          }
          var5 = 0;
          if (0 != param1.tag) {
            var5 = var5 | 2;
          }
          if (param1.objectiveId != 0) {
            var5 = var5 | 1;
          }
          param3.b(1, var5);
          if (0 != (var5 & param2)) {
            param3.b(1, param1.tag);
          }
          if ((var5 & 1) == 0) {
            return;
          }
          param3.b(1, param1.objectiveId);
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var4 = decompiledCaughtException;
          stackIn_16_0 = var4;
          stackIn_16_1 = new StringBuilder().append("bu.B(").append(param0).append(',');
          if (param1 == null) {
            stackIn_17_2 = "null";
          } else {
            stackIn_17_2 = "{...}";
          }
          stackIn_19_1 = ((StringBuilder) (Object) stackIn_16_1).append(stackIn_17_2).append(',').append(param2).append(',');
          if (param3 == null) {
            stackIn_20_2 = "null";
          } else {
            stackIn_20_2 = "{...}";
          }
          throw ig.a((Throwable) ((Object) stackIn_16_0), ((StringBuilder) (Object) stackIn_19_1).append(stackIn_20_2).append(')').toString());
        }
    }

    public static void a(int param0) {
        field_a = null;
        field_b = null;
        field_c = null;
        if (param0 >= -76) {
          field_a = (dn) null;
        }
    }

    static {
    }
}
