/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class ue {
    static String field_a;
    static boolean field_e;
    static ResourceArchive field_d;
    static PacketBuffer field_c;
    static int[][] field_b;

    final static void clearChatInput(int param0) {
        hi.field_e.setLength(0);
        if (param0 != 10) {
          field_c = (PacketBuffer) null;
          nj.field_c = 0;
          return;
        }
        nj.field_c = 0;
    }

    public static void releaseStatics(byte param0) {
        field_b = (int[][]) null;
        field_c = null;
        field_d = null;
        if (param0 == 62) {
          field_a = null;
          return;
        }
        ue.getSelectedOption((byte) -12);
        field_a = null;
    }

    final static void startBattleScreen(byte param0, BattleScreen param1) {
        try {
          ArrayWidgetContainer.field_A = 320;
          if (param0 > -26) {
            ue.clearChatInput(-27);
          }
          mf.field_g = -1;
          ConditionalTextValue.field_f = true;
          DropdownList.field_N = -1;
          Checkbox.field_J = param1.field_V;
          bm.field_g = param1;
          IntrusiveNodeHashTable.field_f = null;
          i.resetFadeTimer(-120);
        } catch (RuntimeException runtimeException) {
          throw aa.wrapException((Throwable) ((Object) runtimeException), "ue.C(" + param0 + ',' + (param1 != null ? "{...}" : "null") + ')');
        }
    }

    final static int getSelectedOption(byte param0) {
        if (param0 > -20) {
          return 25;
        }
        return uc.field_b;
    }

    final static boolean isReadyForLobby(int param0) {
        if (param0 < 119) {
          field_e = true;
          if (10 > fj.field_j) {
            return false;
          }
          if (13 <= ih.field_f) {
            return true;
          }
          return false;
        }
        if (10 > fj.field_j) {
          return false;
        }
        if (13 <= ih.field_f) {
          return true;
        }
        return false;
    }

    static {
        field_a = "Players and their health";
    }
}
