/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class ToolkitRasterStateCache {
    static TextureCombineOperation field_a;
    static int[] field_b;

    public static void clearSharedReferences(byte param0) {
        field_a = null;
        if (param0 != 122) {
          return;
        }
        field_b = null;
    }

    final static ToolkitRasterStateStack getStateStack(GraphicsToolkit param0, boolean param1) {
        ToolkitRasterStateCacheEntry var2 = null;
        ToolkitRasterStateStack var3 = null;
        ToolkitRasterStateStack stackIn_3_0 = null;
        ToolkitRasterStateStack stackIn_15_0 = null;
        RuntimeException stackIn_18_0 = null;
        StringBuilder stackIn_18_1 = null;
        String stackIn_19_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var2_ref = null;
        try {
          if (GetAutoaim.field_p == param0) {
            stackIn_3_0 = GetBombletSprayProjectileLife.field_q;
            return stackIn_3_0;
          }
          var2 = (ToolkitRasterStateCacheEntry) (WidgetNode.field_k.get((long)param0.field_b, 124));
          if (!param1) {
            field_b = (int[]) null;
          }
          if (var2 != null &&
            var2.toolkit == param0) {
            var3 = var2.stateStack;
          } else {
            if (var2 != null) {
              var2.unlink(-3846);
            }
            var3 = new ToolkitRasterStateStack(param0);
            WidgetNode.field_k.put((long)param0.field_b, new ToolkitRasterStateCacheEntry(param0, var3), (byte) -127);
          }
          GetAutoaim.field_p = param0;
          GetBombletSprayProjectileLife.field_q = var3;
          stackIn_15_0 = var3;
          return stackIn_15_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2_ref = decompiledCaughtException;
          stackIn_18_0 = var2_ref;
          stackIn_18_1 = new StringBuilder().append("feb.A(");
          if (param0 == null) {
            stackIn_19_2 = "null";
          } else {
            stackIn_19_2 = "{...}";
          }
          throw GetMissileLauncherRandomness.a((Throwable) ((Object) stackIn_18_0), ((StringBuilder) (Object) stackIn_18_1).append(stackIn_19_2).append(',').append(param1).append(')').toString());
        }
    }

    static {
        field_a = new TextureCombineOperation();
    }
}
