/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class BirthDatePromptPanel extends ArrayWidgetGroup implements ButtonActivationListener {
    private ButtonWidget field_O;
    private BirthDateInputWidget field_N;
    static String hidePlayersInXsGame;
    static Sprite[] field_S;
    static String enterignoreDel;
    static int field_F;
    static String tutorialTitleBasics;

    final static BrowserCookieSupport a(int param0, String param1) {
        int var2_int = 0;
        RuntimeException var2 = null;
        String[] var3 = null;
        int var4 = 0;
        String[] var5 = null;
        int var6 = 0;
        String var7 = null;
        BrowserCookieSupport var8 = null;
        int var9 = 0;
        BrowserCookieSupport stackIn_4_0 = null;
        BrowserCookieSupport stackIn_8_0 = null;
        BrowserCookieSupport stackIn_12_0 = null;
        BrowserCookieSupport stackIn_17_0 = null;
        BrowserCookieSupport stackIn_20_0 = null;
        RuntimeException stackIn_23_0 = null;
        StringBuilder stackIn_23_1 = null;
        String stackIn_24_2 = null;
        RuntimeException decompiledCaughtException = null;
        var9 = Pool.field_O;
        try {
          var2_int = param1.length();
          if (0 == var2_int) {
            stackIn_4_0 = WorldPointProjectionSupport.field_e;
            return stackIn_4_0;
          }
          if (var2_int > 255) {
            stackIn_8_0 = ChatPanelSupport.field_h;
            return stackIn_8_0;
          }
          var3 = AppletUrlSupport.splitString(30634, param1, '.');
          if (var3.length < 2) {
            stackIn_12_0 = WorldPointProjectionSupport.field_e;
            return stackIn_12_0;
          }
          var4 = -7 % ((3 - param0) / 47);
          var5 = var3;
          var6 = 0;
          while (true) {
            if (var6 >= var5.length) {
              stackIn_20_0 = ChatPanelSupport.a(0, var3[var3.length - 1]);
              return stackIn_20_0;
            }
            var7 = var5[var6];
            var8 = Pocket.a(105, var7);
            if (var8 == null) {
              var6++;
              continue;
            }
            break;
          }
          stackIn_17_0 = var8;
          return stackIn_17_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2 = decompiledCaughtException;
          stackIn_23_0 = var2;
          stackIn_23_1 = new StringBuilder().append("jj.A(").append(param0).append(',');
          if (param1 == null) {
            stackIn_24_2 = "null";
          } else {
            stackIn_24_2 = "{...}";
          }
          throw ReportAbuseDialog.addExceptionContext((Throwable) ((Object) stackIn_23_0), ((StringBuilder) (Object) stackIn_23_1).append(stackIn_24_2).append(')').toString());
        }
    }

    BirthDatePromptPanel(int param0, int param1, int param2, int param3) {
        super(param0, param1, param2, param3, (WidgetPainter) null);
        this.field_N = new BirthDateInputWidget(new TextInputPainter(10000536), NineSliceFrame.field_b, 0, 0, 140, 25);
        this.field_N.setBirthDateValidator(-15309, new BirthDateValidator());
        this.field_O = new ButtonWidget(WeightedLruCache.cont, (WidgetListener) (this));
        this.children = new UiWidget[]{(UiWidget) ((Object) this.field_N), (UiWidget) ((Object) this.field_O)};
        this.field_O.renderer = (WidgetPainter) ((Object) new ThreeSliceButtonPainter());
        this.refreshLayout((byte) -72);
    }

    final static void h(int param0) {
        int var3 = 0;
        boolean stackIn_10_0 = false;
        NineSliceFrame stackIn_15_0 = null;
        RuntimeException decompiledCaughtException = null;
        int var1_int = 0;
        RuntimeException var1 = null;
        int var2 = 0;
        int var4 = 0;
        int var5 = 0;
        String var6 = null;
        int var7 = 0;
        int var8 = 0;
        NineSliceFrame var9 = null;
        byte[] var10 = null;
        try {
          var1_int = -CacheEntry.field_z + AchievementProtocolSupport.field_c;
          CacheEntry.field_z = -(var1_int >> 1) + ArchiveIndex.field_u;
          AchievementProtocolSupport.field_c = CacheEntry.field_z + var1_int;
          AccountContentDialog.field_wb = RatingTextState.field_f - (DialWidget.field_R >> 1);
          var2 = AccountContentDialog.field_wb;
          for (var3 = 0; var3 < QuickChatMenu.field_Sb.length; var3++) {
            var4 = BrowserUrlSupport.field_a[var3];
            if (var4 >= 0) {
              if (LookupProtocolSupport.field_f.selectedIndex == var4) {
                var5 = SocketConnector.field_d;
              } else {
                var5 = MembershipBenefitsScreen.field_H;
              }
            } else {
              var5 = DialogLayer.field_V;
            }
            var6 = QuickChatMenu.field_Sb[var3];
            stackIn_10_0 = !(var4 < 0);
            var7 = ReportAbuseDialog.a(stackIn_10_0, param0 ^ -9377, var6);
            var8 = ArchiveIndex.field_u - (var7 >> 1);
            if (var4 >= 0) {
              var2 = var2 + LookupQuery.field_m;
              if (LookupProtocolSupport.field_f.selectedIndex == var4) {
                stackIn_15_0 = IntrusiveNodeHashTable.field_d;
              } else {
                stackIn_15_0 = MeshSymmetrySupport.field_e;
              }
              var9 = stackIn_15_0;
              if (var9 != null) {
                var9.draw((IterableDualLinkDeque.field_g << 1) + var7, var2, -6316, -IterableDualLinkDeque.field_g + var8, (TriangleMesh.field_B << 1) + LobbyGame.field_yc);
              }
              var2 = var2 + TriangleMesh.field_B;
            }
            if (var4 >= 0) {
              HotspotRectangle.field_t.d(var6, var8, var2 + AvailabilityQueryResult.field_g, var5, -1);
              var2 = var2 + (LobbyGame.field_yc + (TriangleMesh.field_B + LookupQuery.field_m));
            } else {
              QuickChatMenu.field_ec.d(var6, var8, LookupProtocolSupport.field_h + var2, var5, -1);
              var2 = var2 + MenuScreen.field_u;
            }
          }
          if (param0 != -9395) {
            var10 = (byte[]) null;
            BirthDatePromptPanel.a((byte[]) null, (byte) -29);
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var1 = decompiledCaughtException;
          throw ReportAbuseDialog.addExceptionContext((Throwable) ((Object) var1), "jj.C(" + param0 + ')');
        }
    }

    final void updatePointerState(UiWidget param0, int param1, int param2, int param3) {
        try {
          super.updatePointerState(param0, param1, param2, param3);
          this.field_O.enabled = this.field_N.getValidationProvider(param1 - 997).getDebouncedValidationState(-31873) == ProxySocketConnector.field_e ? true : false;
        } catch (RuntimeException runtimeException) {
          throw ReportAbuseDialog.addExceptionContext((Throwable) ((Object) runtimeException), "jj.S(" + (param0 != null ? "{...}" : "null") + ',' + param1 + ',' + param2 + ',' + param3 + ')');
        }
    }

    public static void releaseStatics(int param0) {
        field_S = null;
        enterignoreDel = null;
        hidePlayersInXsGame = null;
        tutorialTitleBasics = null;
        if (param0 != 100) {
          field_S = (Sprite[]) null;
        }
    }

    public final void onButtonActivated(boolean param0, int param1, int param2, ButtonWidget param3, int param4) {
        if (this.field_N.getValidationProvider(-41).getDebouncedValidationState(-31873) != ProxySocketConnector.field_e) {
          return;
        }
        try {
          if (!param0) {
            BirthDatePromptPanel.releaseStatics(82);
          }
          ReportAbuseDialog.a(-121, this.field_N.getYear(37), this.field_N.getMonthIndex(25), this.field_N.getDay((byte) -119));
        } catch (RuntimeException runtimeException) {
          throw ReportAbuseDialog.addExceptionContext((Throwable) ((Object) runtimeException), "jj.P(" + param0 + ',' + param1 + ',' + param2 + ',' + (param3 != null ? "{...}" : "null") + ',' + param4 + ')');
        }
    }

    final static byte[] a(byte[] param0, byte param1) {
        int var2_int = 0;
        RuntimeException var2 = null;
        byte[] var3 = null;
        byte[] stackIn_3_0 = null;
        RuntimeException stackIn_6_0 = null;
        StringBuilder stackIn_6_1 = null;
        String stackIn_7_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          var2_int = param0.length;
          var3 = new byte[var2_int];
          if (param1 != 91) {
            field_S = (Sprite[]) null;
          }
          ArrayOperations.copy(param0, 0, var3, 0, var2_int);
          stackIn_3_0 = var3;
          return stackIn_3_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2 = decompiledCaughtException;
          stackIn_6_0 = var2;
          stackIn_6_1 = new StringBuilder().append("jj.B(");
          if (param0 == null) {
            stackIn_7_2 = "null";
          } else {
            stackIn_7_2 = "{...}";
          }
          throw ReportAbuseDialog.addExceptionContext((Throwable) ((Object) stackIn_6_0), ((StringBuilder) (Object) stackIn_6_1).append(stackIn_7_2).append(',').append(param1).append(')').toString());
        }
    }

    final void renderWidget(int param0, byte param1, int param2, int param3) {
        int var5 = 17 % ((-42 - param1) / 53);
        super.renderWidget(param0, (byte) 110, param2, param3);
        PoolUiText.field_a.d(WireframeQuad.dobEnterforchat, this.widgetX + (param2 + 4), 4 + (param3 + this.widgetY) + PoolUiText.field_a.maxAscent, 16777215, -1);
    }

    final void f(byte param0) {
        int var2 = 250;
        this.field_N.setWidgetBounds(140, -var2 + this.widgetWidth >> 1, 25, false, -25 + (20 + this.widgetHeight) >> 1);
        this.field_O.setWidgetBounds(100, (this.widgetWidth - var2 >> 1) + 140 + 10, 30, false, 2 + (this.widgetHeight + 20 - 30 >> 1));
        if (param0 > -68) {
          UiWidget var3 = (UiWidget) null;
          this.updatePointerState((UiWidget) null, 99, -2, 11);
        }
    }

    static {
        enterignoreDel = "Enter name of player to delete from list";
        hidePlayersInXsGame = "Hide players in <%0>'s game";
        tutorialTitleBasics = "Basics Tutorial";
    }
}
