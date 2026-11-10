/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class Path extends IntrusiveDeque {
    static long field_e;
    int field_g;
    static int field_f;

    final static void showLoginResponse(int param0, int param1, String param2) {
        int var3_int = 0;
        try {
          if (param0 != 10) {
            String var4 = (String) null;
            Path.showLoginResponse(24, 51, (String) null);
          }
          VisualPropertyNode.field_q = false;
          RankingRowHelpers.field_e = false;
          if (Point.field_i != null) {
            if (!Point.field_i.field_H) {
              return;
            }
            if (param1 == 8) {
              param1 = 2;
              if (IntRecordReplyHelpers.field_c) {
                param2 = GameResourceLoader.field_e;
              } else {
                param2 = AccountResultHelpers.field_b;
              }
              LoginDialogGlobals.field_a.setAccountAndClearPassword(GameLoopApplet.field_B, 20);
            }
            var3_int = 1;
            if (param1 == 10) {
              var3_int = 0;
              MenuSelection.showChooseNameDialog((byte) -70);
            }
            if (var3_int != 0) {
              if (RankingRowHelpers.field_e) {
                param2 = BlastAffectedObject.substituteTemplateArguments(1938762664, PacketRequestHelpers.field_e, new String[]{param2});
              }
              if (DropdownItemList.field_J) {
                param2 = AccountTermsPanel.field_L;
              }
              Point.field_i.showResultMessage(param2, param1, param0 ^ 27);
            }
            if (param1 != 256) {
              if (param1 == 10) {
                return;
              }
              if (!IntRecordReplyHelpers.field_c) {
                LoginDialogGlobals.field_a.clearInputs(-123);
                return;
              }
            }
          }
        } catch (RuntimeException runtimeException) {
          throw ExceptionWrapper.wrapException((Throwable) ((Object) runtimeException), "qh.N(" + param0 + ',' + param1 + ',' + (param2 != null ? "{...}" : "null") + ')');
        }
    }

    Path() {
    }

    final static void showLoadingProgress(float param0, String param1, byte param2, boolean param3) {
        if (null == NameCharacterHelpers.field_c) {
          NameCharacterHelpers.field_c = new LoadingProgressDialog(MessageDialogContent.field_S, MenuLayoutHelpers.field_c);
          MessageDialogContent.field_S.addDialog(NameCharacterHelpers.field_c, true);
        }
        NameCharacterHelpers.field_c.setProgress(param3, param0, (byte) -97, param1);
        if (param2 >= -18) {
          return;
        }
        try {
          Rasterizer.clear();
          PendingRecordRequest.drawDialogLayer(true, (byte) -63);
        } catch (RuntimeException runtimeException) {
          throw ExceptionWrapper.wrapException((Throwable) ((Object) runtimeException), "qh.M(" + param0 + ',' + (param1 != null ? "{...}" : "null") + ',' + param2 + ',' + param3 + ')');
        }
    }

    static {
    }
}
