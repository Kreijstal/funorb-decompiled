/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class PitchSurfaceLoader {
    static String field_b;
    static String field_a;

    final static void c(int param0) {
        if (param0 != -3) {
          return;
        }
        String var2 = (String) null;
        NetworkArchiveRequest.a(AccountInputValidationResult.field_a, (byte) 111, (String) null);
    }

    final static int a(int param0, int param1) {
        int[] var3 = null;
        int[] var2 = null;
        int[] var3Lifetime1;
        int[] var2Lifetime1;
        if (param0 == -2) {
          var3 = VerticalScrollbar.field_zb[RankingsScreen.field_C];
          var2 = var3;
          return param1 < var3.length ? var3[param1] : 100;
        }
        field_b = (String) null;
        var3Lifetime1 = VerticalScrollbar.field_zb[RankingsScreen.field_C];
        var2Lifetime1 = var3Lifetime1;
        return param1 < var3Lifetime1.length ? var3Lifetime1[param1] : 100;
    }

    public static void releaseStatics(byte param0) {
        if (param0 >= -117) {
          field_b = (String) null;
          field_b = null;
          field_a = null;
          return;
        }
        field_b = null;
        field_a = null;
    }

    final static void openServerList(java.applet.Applet param0, int param1) {
        try {
          java.net.URL var2 = null;
          Exception var2_ref = null;
          RuntimeException var2_ref2 = null;
          RuntimeException stackIn_7_0 = null;
          StringBuilder stackIn_7_1 = null;
          String stackIn_8_2 = null;
          Throwable decompiledCaughtException = null;
          try {
            try {
              var2 = new java.net.URL(param0.getCodeBase(), "toserverlist.ws");
              param0.getAppletContext().showDocument(SessionUrlSupport.decorateSessionUrl(param0, var2, 3), "_top");
              if (param1 == 23607) {
                return;
              }
              field_a = (String) null;
              return;
            } catch (java.lang.Exception decompiledCaughtParameter0) {
              decompiledCaughtException = decompiledCaughtParameter0;
              var2_ref = (Exception) (Object) decompiledCaughtException;
              var2_ref.printStackTrace();
              return;
            }
          } catch (java.lang.RuntimeException decompiledCaughtParameter1) {
            decompiledCaughtException = decompiledCaughtParameter1;
            var2_ref2 = (RuntimeException) (Object) decompiledCaughtException;
            stackIn_7_0 = var2_ref2;
            stackIn_7_1 = new StringBuilder().append("vr.C(");
            if (param0 == null) {
              stackIn_8_2 = "null";
            } else {
              stackIn_8_2 = "{...}";
            }
            throw GameSoundEffect.wrapException((Throwable) ((Object) stackIn_7_0), ((StringBuilder) (Object) stackIn_7_1).append(stackIn_8_2).append(',').append(param1).append(')').toString());
          }
        } catch (RuntimeException | Error decompiledUncheckedException) {
          throw decompiledUncheckedException;
        } catch (Throwable decompiledCheckedException) {
          throw new RuntimeException(decompiledCheckedException);
        }
    }

    final static void a(int param0) {
        RuntimeException var1 = null;
        int var2 = 0;
        LobbyPlayerRow var3 = null;
        RuntimeException decompiledCaughtException = null;
        var2 = Kickabout.field_G;
        try {
          InstrumentNoteMask.field_k = false;
          PlayerContextMenu.field_i = null;
          ArchiveSource.field_b = null;
          if (PasswordFieldPainter.field_B != null) {
            PasswordFieldPainter.field_B.clear(param0 + 22999);
            PasswordFieldPainter.field_B = null;
          }
          if (param0 != -2) {
            return;
          }
          SquadPickerDialog.field_N = null;
          if (SquadSlotWidget.field_yb != null) {
            SquadSlotWidget.field_yb.clear(param0 ^ -22997);
            SquadSlotWidget.field_yb = null;
          }
          SortCriterion.field_f = null;
          if (null != ProxyAuthenticationRequiredException.field_d) {
            ProxyAuthenticationRequiredException.field_d.clear(param0 ^ -22997);
            ProxyAuthenticationRequiredException.field_d = null;
          }
          TrinketSlot.field_Eb = null;
          if (null == SquadPickerDialog.field_N) {
            return;
          }
          var3 = (LobbyPlayerRow) (SquadPickerDialog.field_N.b((byte) 72));
          while (var3 != null) {
            var3.unlinkSecondary(57);
            var3 = (LobbyPlayerRow) (SquadPickerDialog.field_N.a(0));
          }
          SquadPickerDialog.field_N = null;
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var1 = decompiledCaughtException;
          throw GameSoundEffect.wrapException((Throwable) ((Object) var1), "vr.B(" + param0 + ')');
        }
    }

    final static void enqueueTutorialChoice(byte param0) {
        ScrollPane.field_Jb.addLast(new TutorialChoiceDialog(), 3);
        if (param0 > -114) {
          PitchSurfaceLoader.releaseStatics((byte) -74);
        }
    }

    final static boolean d(int param0) {
        if (param0 != 1) {
          PitchSurfaceLoader.loadPitchSurface(8, 93, (byte) -111);
          return true;
        }
        return true;
    }

    final static int loadPitchSurface(int param0, int param1, byte param2) {
        Object var3;
        String var5;
        String var6;
        if (null != MeshObject.field_b[param1][param0]) {
          return -1;
        }
        var3 = null;
        if (0 == param1) {
          var3 = "park";
        }
        if (1 == param1) {
          var3 = "beach";
        }
        if (param1 == 2) {
          var3 = "street";
        }
        var5 = (String) (var3) + "_surface" + param0;
        var6 = var5;
        if (param2 > -48) {
          PitchSurfaceLoader.a(22);
        }
        if (!QuickChatKeysHelpPanel.field_Cb.a(false, var6)) {
          return QuickChatKeysHelpPanel.field_Cb.getGroupProgressByName(var6, -16248);
        }
        MeshObject.field_b[param1][param0] = SpriteResourceSupport.loadNamedSprite((byte) 113, var6, QuickChatKeysHelpPanel.field_Cb, "");
        if (param1 != 1) {
          return -1;
        }
        if (param0 != 3) {
          return -1;
        }
        SpritePixelSupport.adjustSpriteHsv(MeshObject.field_b[param1][param0], 0.0, 1.6, 1.0);
        return -1;
    }

    final static void b(int param0) {
        TickClock.a(-106);
        if (param0 != 1) {
          field_b = (String) null;
        }
    }

    static {
        field_b = "Here you can set up a rated game. If you win, your rating will go up. If<nbsp>you lose, it will go down!<br><br>Please specify your preferences and click '<%0>'. Our system will then attempt to find a suitable opponent in under a minute, depending on how busy the lobby<nbsp>is.<br><br>This is an excellent way to get to know new people!";
        field_a = "Real-life threats";
    }
}
