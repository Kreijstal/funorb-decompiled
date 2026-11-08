/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class gb {
    static int[] field_f;
    static Sprite field_b;
    static int[] field_e;
    static int field_a;
    static int field_d;
    static int field_c;

    final static boolean containsForwardOrReversed(String param0, String param1, int param2) {
        String var3 = null;
        boolean stackIn_5_0 = false;
        RuntimeException stackIn_8_0 = null;
        StringBuilder stackIn_8_1 = null;
        String stackIn_9_2 = null;
        StringBuilder stackIn_11_1 = null;
        String stackIn_12_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var3_ref = null;
        try {
          param1 = ub.replaceCharacter(param1, 0, "", (char)param2);
          var3 = EmailValidator.reverseString(param2 ^ 95, param1);
          stackIn_5_0 = (param0.indexOf(param1) != -1) || (param0.indexOf(var3) != -1);
          return stackIn_5_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3_ref = decompiledCaughtException;
          stackIn_8_0 = var3_ref;
          stackIn_8_1 = new StringBuilder().append("gb.D(");
          if (param0 == null) {
            stackIn_9_2 = "null";
          } else {
            stackIn_9_2 = "{...}";
          }
          stackIn_11_1 = ((StringBuilder) (Object) stackIn_8_1).append(stackIn_9_2).append(',');
          if (param1 == null) {
            stackIn_12_2 = "null";
          } else {
            stackIn_12_2 = "{...}";
          }
          throw ChatMessage.addExceptionContext((Throwable) ((Object) stackIn_8_0), ((StringBuilder) (Object) stackIn_11_1).append(stackIn_12_2).append(',').append(param2).append(')').toString());
        }
    }

    final static IndexedSprite[] buildIndexedSprites(byte param0) {
        int var2 = 0;
        int var3 = Pixelate.field_H ? 1 : 0;
        IndexedSprite[] var1 = new IndexedSprite[SocialListEntry.field_Qb];
        for (var2 = 0; var2 < SocialListEntry.field_Qb; var2++) {
          var1[var2] = new IndexedSprite(StrongCacheReference.field_y, jb.field_a, IntrusiveNode.field_b[var2], e.field_b[var2], ByteStorage.field_g[var2], ge.field_c[var2], wo.field_f[var2], AsyncValidationResult.field_g);
        }
        LoadingStepTracker.clearSpriteDecodeBuffers(140);
        if (param0 != -96) {
          field_a = 112;
        }
        return var1;
    }

    public static void releaseStatics(boolean param0) {
        field_f = null;
        if (param0) {
          field_e = (int[]) null;
        }
        field_b = null;
        field_e = null;
    }

    final static void updateReportAbuseDialog(byte param0, boolean param1, int param2) {
        int var3 = 0;
        int var4 = 0;
        if (param0 < 107) {
          field_d = -55;
        }
        if (null != AccountTermsPanel.field_M) {
          var3 = AccountTermsPanel.field_M.pollOffence((byte) 126, param1);
          if (var3 != -2) {
            if (var3 != -1) {
              var4 = AccountTermsPanel.field_M.isMuteSelected(2) ? 1 : 0;
              cm.sendPlayerReport(89, var4 != 0, AccountTermsPanel.field_M.field_Ub, AccountTermsPanel.field_M.getEnteredText(123), var3, param2);
            }
            AccountTermsPanel.field_M = null;
            ArchiveProvider.closeContextMenu(116);
          }
        }
    }

    static {
        field_e = new int[]{31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};
        field_d = -1;
        field_a = 4;
    }
}
