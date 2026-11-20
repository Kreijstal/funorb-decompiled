/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class SetSalvoHoldable extends ConsoleCommand {
    static IntrusiveDeque pendingIntegerRecordWrites;

    final static SoftwareIndexedSprite2D copyWithPalette(int param0, SoftwareIndexedSprite2D param1, int[] param2) {
        SoftwareIndexedSprite2D var3 = null;
        RuntimeException var3_ref = null;
        int var4 = 0;
        SoftwareIndexedSprite2D stackIn_1_0 = null;
        RuntimeException stackIn_4_0 = null;
        StringBuilder stackIn_4_1 = null;
        String stackIn_5_2 = null;
        StringBuilder stackIn_7_1 = null;
        String stackIn_8_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          var3 = new SoftwareIndexedSprite2D(0, 0, 0);
          var3.canvasHeight = param1.canvasHeight;
          var3.height = param1.height;
          var4 = 50 / ((param0 - 20) / 62);
          var3.offsetY = param1.offsetY;
          var3.indices = param1.indices;
          var3.canvasWidth = param1.canvasWidth;
          var3.offsetX = param1.offsetX;
          var3.palette = param2;
          var3.width = param1.width;
          stackIn_1_0 = var3;
          return stackIn_1_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3_ref = decompiledCaughtException;
          stackIn_4_0 = var3_ref;
          stackIn_4_1 = new StringBuilder().append("mhb.B(").append(param0).append(',');
          if (param1 == null) {
            stackIn_5_2 = "null";
          } else {
            stackIn_5_2 = "{...}";
          }
          stackIn_7_1 = ((StringBuilder) (Object) stackIn_4_1).append(stackIn_5_2).append(',');
          if (param2 == null) {
            stackIn_8_2 = "null";
          } else {
            stackIn_8_2 = "{...}";
          }
          throw GetMissileLauncherRandomness.wrapClientException((Throwable) ((Object) stackIn_4_0), ((StringBuilder) (Object) stackIn_7_1).append(stackIn_8_2).append(')').toString());
        }
    }

    final static boolean needsFaceGroups(int param0, int param1, int param2) {
        if (param2 == -2679) {
          return (384 & param1) != 0 ? true : false;
        }
        SetSalvoHoldable.clearSharedReferences((byte) 84);
        return (384 & param1) != 0 ? true : false;
    }

    public static void clearSharedReferences(byte param0) {
        if (param0 != -127) {
          SetSalvoHoldable.needsFaceGroups(8, 67, -87);
          pendingIntegerRecordWrites = null;
          return;
        }
        pendingIntegerRecordWrites = null;
    }

    SetSalvoHoldable(String param0, Class[] param1, String param2) {
        super(param0, param1, param2);
    }

    final ConsoleValue execute(ConsoleValue[] arguments, int obfuscationGuard) {
        RuntimeException var3 = null;
        ConsoleValue stackIn_3_0 = null;
        RuntimeException stackIn_6_0 = null;
        StringBuilder stackIn_6_1 = null;
        String stackIn_7_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          SetMachineGunEnergyUsed.submitSettingsChange(30, 62, arguments[0].intValue(23));
          if (obfuscationGuard > -119) {
            pendingIntegerRecordWrites = (IntrusiveDeque) null;
          }
          stackIn_3_0 = new ConsoleValue("void");
          return stackIn_3_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3 = decompiledCaughtException;
          stackIn_6_0 = var3;
          stackIn_6_1 = new StringBuilder().append("mhb.A(");
          if (arguments == null) {
            stackIn_7_2 = "null";
          } else {
            stackIn_7_2 = "{...}";
          }
          throw GetMissileLauncherRandomness.wrapClientException((Throwable) ((Object) stackIn_6_0), ((StringBuilder) (Object) stackIn_6_1).append(stackIn_7_2).append(',').append(obfuscationGuard).append(')').toString());
        }
    }

    static {
        pendingIntegerRecordWrites = new IntrusiveDeque();
    }
}
