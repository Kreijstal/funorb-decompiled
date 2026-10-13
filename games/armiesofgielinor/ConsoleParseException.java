/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class ConsoleParseException extends Exception {
    static String[] field_d;
    static int field_c;
    int sourceOffset;
    static String field_a;

    final static void b(int param0) {
        ro.field_lb = null;
        CipherPacketBuffer.currentBattlefield = null;
        ConsoleExpression.field_p = null;
        vs.field_e = null;
        NetworkResourceRequest.field_C = null;
        PaletteRegionMap.field_g = null;
        ResourceArchive.field_a = null;
        CampaignMenuEntry.field_u = null;
        if (param0 != -1) {
          ConsoleParseException.b(95);
        }
    }

    ConsoleParseException(int sourceOffset) {
        this.sourceOffset = sourceOffset;
    }

    final static void a(int param0, byte param1, int param2, boolean param3, int param4, int param5, int param6, String param7) {
        if (param1 <= 24) {
          return;
        }
        try {
          if (0 == we.field_f.pressedButton) {
          } else {
            if (NodeIterator.field_a) {
            } else {
              if (!vi.field_d) {
                hf.textChatActive = true;
              } else {
                ContextActionMenu.openPublicQuickChat(86);
              }
            }
          }
          if (!hf.textChatActive) {
            return;
          }
          TextLineLayout.a(param7, param2, param4, 20, param0, param0, param5, 15676, param6);
          UnitCycler.field_g.updateInput(true, param3);
          if (param3) {
            if (qf.field_e.pressedButton != 0) {
              hf.textChatActive = false;
            }
            if (ed.field_e.pressedButton != 0) {
              rd.clearChatText(8445);
              hf.textChatActive = false;
              return;
            }
          }
        } catch (RuntimeException runtimeException) {
          throw AnimationSkeleton.addExceptionContext((Throwable) ((Object) runtimeException), "ef.A(" + param0 + ',' + param1 + ',' + param2 + ',' + param3 + ',' + param4 + ',' + param5 + ',' + param6 + ',' + (param7 != null ? "{...}" : "null") + ')');
        }
    }

    public static void a(int param0) {
        field_a = null;
        if (param0 != 0) {
          field_c = 83;
          field_d = null;
          return;
        }
        field_d = null;
    }

    static {
        field_a = "Loading...";
    }
}
