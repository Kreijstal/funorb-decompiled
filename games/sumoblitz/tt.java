/*
 * Decompiled by CFR-JS 0.4.0.
 */
abstract class tt extends IntrusiveNode {
    static String defeatText;
    static int field_l;

    final static Sprite[] a(byte param0, int param1, ResourceArchive param2, int param3) {
        RuntimeException var4 = null;
        Sprite[] stackIn_5_0 = null;
        Sprite[] stackIn_7_0 = null;
        RuntimeException stackIn_10_0 = null;
        StringBuilder stackIn_10_1 = null;
        String stackIn_11_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          if (!k.a(param2, param1, param3, -23046)) {
            return null;
          }
          if (param0 <= -79) {
            stackIn_7_0 = ul.a(255);
            return stackIn_7_0;
          }
          stackIn_5_0 = (Sprite[]) null;
          return stackIn_5_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var4 = decompiledCaughtException;
          stackIn_10_0 = var4;
          stackIn_10_1 = new StringBuilder().append("tt.J(").append(param0).append(',').append(param1).append(',');
          if (param2 == null) {
            stackIn_11_2 = "null";
          } else {
            stackIn_11_2 = "{...}";
          }
          throw ClientExceptionSupport.wrapWithContext((Throwable) ((Object) stackIn_10_0), ((StringBuilder) (Object) stackIn_10_1).append(stackIn_11_2).append(',').append(param3).append(')').toString());
        }
    }

    final static void a(int param0) {
        if (param0 == 30692) {
          ResourceArchive.field_f = PasswordInputRenderer.field_u[0];
          LegacyOpenGlEffectManager.field_i = PasswordInputRenderer.field_u[1];
          hc.field_f = PasswordInputRenderer.field_u[2];
          return;
        }
        defeatText = (String) null;
        ResourceArchive.field_f = PasswordInputRenderer.field_u[0];
        LegacyOpenGlEffectManager.field_i = PasswordInputRenderer.field_u[1];
        hc.field_f = PasswordInputRenderer.field_u[2];
    }

    public static void releaseStatics(boolean param0) {
        defeatText = null;
        if (!param0) {
          defeatText = (String) null;
        }
    }

    tt(int param0, boolean param1) {
    }

    final static int a(byte param0, int param1) {
        int var2 = 0;
        int var3 = 0;
        int var2Lifetime1;
        int var2Lifetime2;
        int var2Lifetime3;
        int var3Lifetime1;
        int var2Lifetime4;
        if (param0 >= -127) {
          field_l = -86;
          var3 = param1;
          if (var3 != 6) {
            if (var3 == 7) {
              var2 = UiStyleNode.droneTypeColor(-26346, 0);
            } else {
              var2 = UiStyleNode.droneTypeColor(-26346, param1);
            }
            return ((8388607 ^ var2 >> 1) & 8355711) + var2;
          }
          var2Lifetime4 = UiStyleNode.droneTypeColor(-26346, 0);
          return ((8388607 ^ var2Lifetime4 >> 1) & 8355711) + var2Lifetime4;
        }
        var3Lifetime1 = param1;
        if (var3Lifetime1 == 6) {
          var2Lifetime1 = UiStyleNode.droneTypeColor(-26346, 0);
          return ((8388607 ^ var2Lifetime1 >> 1) & 8355711) + var2Lifetime1;
        }
        if (var3Lifetime1 != 7) {
          var2Lifetime2 = UiStyleNode.droneTypeColor(-26346, param1);
          return ((8388607 ^ var2Lifetime2 >> 1) & 8355711) + var2Lifetime2;
        }
        var2Lifetime3 = UiStyleNode.droneTypeColor(-26346, 0);
        return ((8388607 ^ var2Lifetime3 >> 1) & 8355711) + var2Lifetime3;
    }

    static {
        defeatText = "DEFEAT.";
        field_l = 256;
    }
}
