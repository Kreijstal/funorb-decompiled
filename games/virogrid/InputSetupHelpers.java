/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class InputSetupHelpers {
    static Js5Archive field_a;
    int field_j;
    static String field_h;
    static String field_c;
    int field_e;
    int field_d;
    static SpriteWidget field_b;
    static int field_g;
    int field_i;
    static SpriteWidget field_f;

    final static boolean handleNameEntryKey(byte param0) {
        int var1 = -51 / ((param0 + 22) / 47);
        if (LobbyGame.field_Xb == null) {
          return false;
        }
        if (LobbyGame.field_Xb.handleNameKey((byte) 32)) {
          return true;
        }
        return false;
    }

    public static void releaseStatics(int param0) {
        field_b = null;
        field_a = null;
        field_c = null;
        if (param0 == -1) {
          field_f = null;
          field_h = null;
          return;
        }
        field_g = 64;
        field_f = null;
        field_h = null;
    }

    InputSetupHelpers() {
    }

    InputSetupHelpers(InputSetupHelpers param0) {
        try {
          this.field_j = param0.field_j;
          this.field_e = param0.field_e;
          this.field_i = param0.field_i;
          this.field_d = param0.field_d;
        } catch (RuntimeException runtimeException) {
          throw AsyncCheckResult.wrapException((Throwable) ((Object) runtimeException), "s.<init>(" + (param0 != null ? "{...}" : "null") + ')');
        }
    }

    final static MouseWheelInput createMouseWheelHandler(byte param0) {
        try {
          Throwable var1 = null;
          MouseWheelInput stackIn_2_0 = null;
          MouseWheelInput stackIn_4_0 = null;
          Throwable decompiledCaughtException = null;
          try {
            if (param0 == -110) {
              stackIn_4_0 = (MouseWheelInput) (Class.forName("MouseWheelHandler").newInstance());
              return stackIn_4_0;
            }
            stackIn_2_0 = (MouseWheelInput) null;
            return stackIn_2_0;
          } catch (java.lang.Throwable decompiledCaughtParameter0) {
            decompiledCaughtException = decompiledCaughtParameter0;
            var1 = decompiledCaughtException;
            return null;
          }
        } catch (RuntimeException | Error decompiledUncheckedException) {
          throw decompiledUncheckedException;
        } catch (Throwable decompiledCheckedException) {
          throw new RuntimeException(decompiledCheckedException);
        }
    }

    static {
        field_h = "Exploiting a bug";
        field_g = -1;
        field_c = "Invite more players, or alternatively try changing the following settings:  ";
    }
}
