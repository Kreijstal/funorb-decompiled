/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class vi {
    static boolean field_d;
    static int lastQuickChatPhraseId;
    static String field_c;
    static PcmSample[] field_a;
    static String field_b;
    static String field_f;

    final static void a(String param0, int param1, String param2) {
        try {
          if (null != qc.field_a) {
            qc.field_a.closeDialog(true);
          }
          if (param1 != 640) {
            String var4 = (String) null;
            vi.a((String) null, -8, (String) null);
          }
          ContextActionMenu.field_Qb = new df(param0, param2, false, true, true);
          lt.field_g.replaceContent(ContextActionMenu.field_Qb, (byte) -77);
        } catch (RuntimeException runtimeException) {
          throw AnimationSkeleton.addExceptionContext((Throwable) ((Object) runtimeException), "vi.D(" + (param0 != null ? "{...}" : "null") + ',' + param1 + ',' + (param2 != null ? "{...}" : "null") + ')');
        }
    }

    final static void a(int param0) {
        int var1 = mj.field_c * mj.field_c;
        int var2 = -(TurnTimerDial.field_d * TurnTimerDial.field_d) + var1;
        int var3 = sh.field_l + var2 * (-sh.field_l + EquipmentBattleTutorial.field_y) / var1;
        if (param0 < -53) {
          CombatEvent.field_I.setBounds(120, -20500, 640, var3, QuickChatCategory.field_u);
          PlayerProfile.a(-1, MusicPatchNode.field_l, 0, MusicPatch.field_n, 5, EquipmentBattleTutorial.field_y - 24, 640);
          return;
        }
    }

    public static void a(boolean param0) {
        field_f = null;
        if (!param0) {
          return;
        }
        field_a = null;
        field_c = null;
        field_b = null;
    }

    final synchronized static long monotonicMillis(int obfuscationGuard) {
        long var1 = System.currentTimeMillis();
        int var3 = -1 / ((-3 - obfuscationGuard) / 38);
        if (!(var1 >= h.field_a)) {
          IndexedSpriteBase.field_c = IndexedSpriteBase.field_c + (-var1 + h.field_a);
        }
        h.field_a = var1;
        return IndexedSpriteBase.field_c + var1;
    }

    static {
        field_f = null;
        field_c = "Lost";
        field_b = "You need a rating of <%1> to play with the current options.";
    }
}
