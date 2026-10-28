/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class ArchiveLoadTask {
    static dn field_e;
    String groupName;
    int groupId;
    static int spriteCount;
    String progressText;
    ResourceArchive archive;
    static String field_a;
    static SystemTask field_g;
    static int[] spritePalette;
    String waitingText;

    public static void releaseStatics(byte guard) {
        int var1 = -8 / ((4 - guard) / 38);
        field_e = null;
        spritePalette = null;
        field_a = null;
        field_g = null;
    }

    final static void a(boolean param0, int param1) {
        di.field_d = null;
        mj.field_d = 0;
        int var2 = -17 % ((-17 - param1) / 39);
        AlternateUsernameCredentials.field_q.b(-26480, param0);
        ChatMessage.clearFrameOffsets((byte) -123);
    }

    final static void cycleSelectionFromArrowKey(int[] choices, int guard) {
        String stackIn_19_2 = null;
        try {
          if (PasswordValidator.field_n == 97 ||
            PasswordValidator.field_n == 99) {
            int var2_int = di.field_d.field_h;
            var2_int++;
            if (var2_int >= choices.length) {
              var2_int = 0;
            }
            di.field_d.a(false, var2_int);
          }
          if (guard != 0) {
            field_e = (dn) null;
          }
          if (96 != PasswordValidator.field_n &&
            98 != PasswordValidator.field_n) {
            return;
          }
          int var2_intLifetime1 = di.field_d.field_h;
          var2_intLifetime1--;
          if (0 > var2_intLifetime1) {
            var2_intLifetime1 = -1 + choices.length;
          }
          di.field_d.a(false, var2_intLifetime1);
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          RuntimeException decompiledCaughtException = decompiledCaughtParameter0;
          RuntimeException var2 = decompiledCaughtException;
          RuntimeException stackIn_18_0 = var2;
          StringBuilder stackIn_18_1 = new StringBuilder().append("qk.C(");
          if (choices == null) {
            stackIn_19_2 = "null";
          } else {
            stackIn_19_2 = "{...}";
          }
          throw t.a((Throwable) ((Object) stackIn_18_0), ((StringBuilder) (Object) stackIn_18_1).append(stackIn_19_2).append(',').append(guard).append(')').toString());
        }
    }

    static {
        field_a = "To server list";
    }
}
