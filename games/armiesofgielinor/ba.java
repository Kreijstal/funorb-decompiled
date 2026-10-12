/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class ba extends dr {
    static int field_F;
    static String[] field_E;

    final nd a(int param0, nd[] param1) {
        RuntimeException var3 = null;
        nd stackIn_3_0 = null;
        RuntimeException stackIn_6_0 = null;
        StringBuilder stackIn_6_1 = null;
        String stackIn_7_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          if (param0 != -24872) {
            field_E = (String[]) null;
          }
          stackIn_3_0 = new nd(SkeletonLimitMarker.a((byte) 119));
          return stackIn_3_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3 = decompiledCaughtException;
          stackIn_6_0 = var3;
          stackIn_6_1 = new StringBuilder().append("ba.C(").append(param0).append(',');
          if (param1 == null) {
            stackIn_7_2 = "null";
          } else {
            stackIn_7_2 = "{...}";
          }
          throw ig.addExceptionContext((Throwable) ((Object) stackIn_6_0), ((StringBuilder) (Object) stackIn_6_1).append(stackIn_7_2).append(')').toString());
        }
    }

    ba(String param0, Class[] param1, String param2) {
        super(param0, param1, param2);
    }

    final static void g(int param0) {
        if (param0 < 68) {
          return;
        }
        lt.field_g.a(new ce(), (byte) 66);
    }

    public static void i(int param0) {
        field_E = null;
        if (param0 <= 111) {
          field_F = 29;
        }
    }

    final static int h(int param0) {
        int var1_int = 0;
        int var3 = 0;
        int stackIn_18_0 = 0;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var1 = null;
        int var2 = 0;
        var3 = ArmiesOfGielinor.obfuscationControl ? 1 : 0;
        try {
          if (param0 > -103) {
            field_F = 107;
          }
          var1_int = 0;
          while (Unit.i((byte) -52)) {
            MovementPlanner.field_z.pollNavigationKeys((byte) -120);
            if (!MovementPlanner.field_z.hasActivationInput((byte) 82)) {
              continue;
            }
            var1_int = 1;
          }
          MovementPlanner.field_z.updatePointerSelection(0, vo.a((byte) -47, TeleportAction.field_z, iu.field_t), vo.a((byte) 93, ko.field_b, AiPlanningStrategy.field_d));
          if (MovementPlanner.field_z.hasActivationInput((byte) 46)) {
            var1_int = 1;
          }
          var2 = 0;
          if (var1_int != 0 &&
            MovementPlanner.field_z.selectedIndex >= 0) {
            var2 = SpellMenuGroup.field_m[MovementPlanner.field_z.selectedIndex];
            if (var2 == 2) {
              CombatPresentation.n(-112);
            }
          }
          stackIn_18_0 = var2;
          return stackIn_18_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var1 = decompiledCaughtException;
          throw ig.addExceptionContext((Throwable) ((Object) var1), "ba.D(" + param0 + ')');
        }
    }

    static {
        field_F = -1;
        field_E = new String[]{"This unit is immobilised and unable to move for 1 turn", "This unit is immobilised and unable to move for <%0> turns"};
    }
}
