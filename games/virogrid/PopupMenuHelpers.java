/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class PopupMenuHelpers {
    static char field_d;
    static int[] field_a;
    static int field_b;
    static String field_c;

    final static boolean isIntroAnimationFinished(int param0) {
        if (param0 != 2) {
          java.applet.Applet var2 = (java.applet.Applet) null;
          PopupMenuHelpers.hasTuhstatbutCookie((java.applet.Applet) null, 111);
        }
        return 250 < DualLinkHashTable.field_e ? true : false;
    }

    public static void releaseStatics(int param0) {
        field_c = null;
        field_a = null;
        if (param0 != 26523) {
          field_c = (String) null;
        }
    }

    final static void closePopupMenu(int param0) {
        QueuedRequest.field_n = false;
        MarkerSliderPainter.field_d = null;
        LoginDialog.field_rb = null;
        if (param0 != 1) {
          Js5Archive var2 = (Js5Archive) null;
          PopupMenuHelpers.initializeGameAssets((byte[]) null, (IndexedSprite[]) null, (int[]) null, (String[][]) null, (byte[]) null, (Js5Archive) null, 27, (String[]) null, (String[][]) null, (Sprite[][]) null, true, (Sprite[][]) null, -1, (int[]) null, (byte) -43, (String[]) null, (Js5Archive) null, (Js5Archive) null, 123);
        }
        Js5Archive.field_j = null;
        RankingsRequest.field_o = null;
    }

    final static boolean hasTuhstatbutCookie(java.applet.Applet param0, int param1) {
        try {
          String var2 = null;
          String var3 = null;
          String[] var4 = null;
          int var5 = 0;
          int var6 = 0;
          int var7 = 0;
          boolean stackIn_17_0 = false;
          RuntimeException stackIn_20_0 = null;
          StringBuilder stackIn_20_1 = null;
          String stackIn_21_2 = null;
          Throwable decompiledCaughtException = null;
          Throwable var2_ref = null;
          RuntimeException var2_ref2 = null;
          var7 = Virogrid.field_F ? 1 : 0;
          try {
            if (AccountCreationSupport.field_i) {
              return true;
            }
            try {
              var2 = "tuhstatbut";
              var3 = (String) (JavaScriptBridge.callJavaScript("getcookies", 6168, param0));
              var4 = DialWidgetPainter.split(var3, (byte) -123, ';');
              var5 = 0;
              if (param1 < 77) {
                field_b = -17;
              }
              while (var4.length > var5) {
                var6 = var4[var5].indexOf('=');
                if (var6 >= 0 &&
                  var4[var5].substring(0, var6).trim().equals(var2)) {
                  return true;
                }
                var5++;
              }
            } catch (java.lang.Throwable decompiledCaughtParameter0) {
              decompiledCaughtException = decompiledCaughtParameter0;
              var2_ref = decompiledCaughtException;
            }
            stackIn_17_0 = (null != param0.getParameter("tuhstatbut"));
            return stackIn_17_0;
          } catch (java.lang.RuntimeException decompiledCaughtParameter1) {
            decompiledCaughtException = decompiledCaughtParameter1;
            var2_ref2 = (RuntimeException) (Object) decompiledCaughtException;
            stackIn_20_0 = var2_ref2;
            stackIn_20_1 = new StringBuilder().append("nm.E(");
            if (param0 == null) {
              stackIn_21_2 = "null";
            } else {
              stackIn_21_2 = "{...}";
            }
            throw AsyncCheckResult.wrapException((Throwable) ((Object) stackIn_20_0), ((StringBuilder) (Object) stackIn_20_1).append(stackIn_21_2).append(',').append(param1).append(')').toString());
          }
        } catch (RuntimeException | Error decompiledUncheckedException) {
          throw decompiledUncheckedException;
        } catch (Throwable decompiledCheckedException) {
          throw new RuntimeException(decompiledCheckedException);
        }
    }

    final static void initializeGameAssets(byte[] param0, IndexedSprite[] param1, int[] param2, String[][] param3, byte[] param4, Js5Archive param5, int param6, String[] param7, String[][] param8, Sprite[][] param9, boolean param10, Sprite[][] param11, int param12, int[] param13, byte param14, String[] param15, Js5Archive param16, Js5Archive param17, int param18) {
        RuntimeException stackIn_6_0 = null;
        StringBuilder stackIn_6_1 = null;
        String stackIn_7_2 = null;
        StringBuilder stackIn_9_1 = null;
        String stackIn_10_2 = null;
        StringBuilder stackIn_12_1 = null;
        String stackIn_13_2 = null;
        StringBuilder stackIn_15_1 = null;
        String stackIn_16_2 = null;
        StringBuilder stackIn_18_1 = null;
        String stackIn_19_2 = null;
        StringBuilder stackIn_21_1 = null;
        String stackIn_22_2 = null;
        StringBuilder stackIn_24_1 = null;
        String stackIn_25_2 = null;
        StringBuilder stackIn_27_1 = null;
        String stackIn_28_2 = null;
        StringBuilder stackIn_30_1 = null;
        String stackIn_31_2 = null;
        StringBuilder stackIn_33_1 = null;
        String stackIn_34_2 = null;
        StringBuilder stackIn_36_1 = null;
        String stackIn_37_2 = null;
        StringBuilder stackIn_39_1 = null;
        String stackIn_40_2 = null;
        StringBuilder stackIn_42_1 = null;
        String stackIn_43_2 = null;
        StringBuilder stackIn_45_1 = null;
        String stackIn_46_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var19 = null;
        String[] var20 = null;
        try {
          if (param14 > -65) {
            PopupMenuHelpers.buildPopupMenu(true, -102, (byte) 44);
          }
          var20 = (String[]) null;
          SoundCache.initializeSharedUiResources(param7, (String[]) null, param8, param0, param16, param11, param3, param4, param12, 1, param10, param1, param18, param5, param2, param17, (byte) 99, param13, param15, param9);
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var19 = decompiledCaughtException;
          stackIn_6_0 = var19;
          stackIn_6_1 = new StringBuilder().append("nm.C(");
          if (param0 == null) {
            stackIn_7_2 = "null";
          } else {
            stackIn_7_2 = "{...}";
          }
          stackIn_9_1 = ((StringBuilder) (Object) stackIn_6_1).append(stackIn_7_2).append(',');
          if (param1 == null) {
            stackIn_10_2 = "null";
          } else {
            stackIn_10_2 = "{...}";
          }
          stackIn_12_1 = ((StringBuilder) (Object) stackIn_9_1).append(stackIn_10_2).append(',');
          if (param2 == null) {
            stackIn_13_2 = "null";
          } else {
            stackIn_13_2 = "{...}";
          }
          stackIn_15_1 = ((StringBuilder) (Object) stackIn_12_1).append(stackIn_13_2).append(',');
          if (param3 == null) {
            stackIn_16_2 = "null";
          } else {
            stackIn_16_2 = "{...}";
          }
          stackIn_18_1 = ((StringBuilder) (Object) stackIn_15_1).append(stackIn_16_2).append(',');
          if (param4 == null) {
            stackIn_19_2 = "null";
          } else {
            stackIn_19_2 = "{...}";
          }
          stackIn_21_1 = ((StringBuilder) (Object) stackIn_18_1).append(stackIn_19_2).append(',');
          if (param5 == null) {
            stackIn_22_2 = "null";
          } else {
            stackIn_22_2 = "{...}";
          }
          stackIn_24_1 = ((StringBuilder) (Object) stackIn_21_1).append(stackIn_22_2).append(',').append(param6).append(',');
          if (param7 == null) {
            stackIn_25_2 = "null";
          } else {
            stackIn_25_2 = "{...}";
          }
          stackIn_27_1 = ((StringBuilder) (Object) stackIn_24_1).append(stackIn_25_2).append(',');
          if (param8 == null) {
            stackIn_28_2 = "null";
          } else {
            stackIn_28_2 = "{...}";
          }
          stackIn_30_1 = ((StringBuilder) (Object) stackIn_27_1).append(stackIn_28_2).append(',');
          if (param9 == null) {
            stackIn_31_2 = "null";
          } else {
            stackIn_31_2 = "{...}";
          }
          stackIn_33_1 = ((StringBuilder) (Object) stackIn_30_1).append(stackIn_31_2).append(',').append(param10).append(',');
          if (param11 == null) {
            stackIn_34_2 = "null";
          } else {
            stackIn_34_2 = "{...}";
          }
          stackIn_36_1 = ((StringBuilder) (Object) stackIn_33_1).append(stackIn_34_2).append(',').append(param12).append(',');
          if (param13 == null) {
            stackIn_37_2 = "null";
          } else {
            stackIn_37_2 = "{...}";
          }
          stackIn_39_1 = ((StringBuilder) (Object) stackIn_36_1).append(stackIn_37_2).append(',').append(param14).append(',');
          if (param15 == null) {
            stackIn_40_2 = "null";
          } else {
            stackIn_40_2 = "{...}";
          }
          stackIn_42_1 = ((StringBuilder) (Object) stackIn_39_1).append(stackIn_40_2).append(',');
          if (param16 == null) {
            stackIn_43_2 = "null";
          } else {
            stackIn_43_2 = "{...}";
          }
          stackIn_45_1 = ((StringBuilder) (Object) stackIn_42_1).append(stackIn_43_2).append(',');
          if (param17 == null) {
            stackIn_46_2 = "null";
          } else {
            stackIn_46_2 = "{...}";
          }
          throw AsyncCheckResult.wrapException((Throwable) ((Object) stackIn_6_0), ((StringBuilder) (Object) stackIn_45_1).append(stackIn_46_2).append(',').append(param18).append(')').toString());
        }
    }

    final static void buildPopupMenu(boolean param0, int param1, byte param2) {
        int stackIn_52_0 = 0;
        int stackIn_55_0 = 0;
        String[] stackIn_62_0 = null;
        int stackIn_62_1 = 0;
        String stackIn_63_2 = null;
        String[] stackIn_68_0 = null;
        int stackIn_68_1 = 0;
        String stackIn_69_2 = null;
        int stackIn_89_0 = 0;
        boolean stackIn_90_1 = false;
        int stackIn_113_0 = 0;
        int stackIn_114_1 = 0;
        RuntimeException decompiledCaughtException = null;
        int var3_int = 0;
        RuntimeException var3 = null;
        int var4 = 0;
        int var5 = 0;
        String[] var5_ref_String__ = null;
        int var6 = 0;
        int var7 = 0;
        int var8 = 0;
        int var9 = 0;
        int var10 = 0;
        String[] var11 = null;
        String var12 = null;
        String var13 = null;
        String[] var5_ref_String__Lifetime1;
        int var6Lifetime1;
        int var6Lifetime2;
        int var6Lifetime3;
        int var7Lifetime1;
        int var9Lifetime1;
        int var4Lifetime1;
        int var5Lifetime1;
        int var5Lifetime2;
        int var5Lifetime3;
        int var8Lifetime1;
        int var8Lifetime2;
        int var9Lifetime2;
        int var9Lifetime3;
        int var6Lifetime2Lifetime1;
        int var8Lifetime1Lifetime1;
        var10 = Virogrid.field_F ? 1 : 0;
        try {
          IntrusiveDeque.field_d = param1;
          var3_int = 120 / ((-14 - param2) / 41);
          QueuedRequest.field_n = true;
          if (IntrusiveDeque.field_d == 0) {
            var4 = DialogMessagePane.wrapBalancedText((byte) 124, LongAndTextLoginPayload.field_n, NodeHashTableIterator.field_h, TriangleSortHelpers.field_b, CellFlip.field_l);
            var5 = 3 + var4;
            DrawOfferMenuHelpers.field_c = new String[var5];
            FrameSkin.field_h = new int[var5];
            for (var6 = 0; var5 > var6; var6++) {
              FrameSkin.field_h[var6] = -1;
            }
            WidgetFactoryHelpers.field_a = new int[2];
            for (var6 = 0; var4 > var6; var6++) {
              DrawOfferMenuHelpers.field_c[var6] = CellFlip.field_l[var6];
            }
            DrawOfferMenuHelpers.field_c[-3 + var5] = "";
            DrawOfferMenuHelpers.field_c[-2 + var5] = PasswordLoginCredentials.field_m;
            FrameSkin.field_h[-2 + var5] = 0;
            WidgetFactoryHelpers.field_a[0] = 4;
            DrawOfferMenuHelpers.field_c[-1 + var5] = WidgetLayerStack.field_I;
            FrameSkin.field_h[var5 - 1] = 1;
            WidgetFactoryHelpers.field_a[1] = 5;
          } else if (1 == IntrusiveDeque.field_d) {
            var4 = DialogMessagePane.wrapBalancedText((byte) 125, LongAndTextLoginPayload.field_n, NodeHashTableIterator.field_h, TriangleSortHelpers.field_b, CellFlip.field_l);
            var5 = var4 + 2;
            FrameSkin.field_h = new int[var5];
            DrawOfferMenuHelpers.field_c = new String[var5];
            for (var6 = 0; var5 > var6; var6++) {
              FrameSkin.field_h[var6] = -1;
            }
            WidgetFactoryHelpers.field_a = new int[1];
            for (var6 = 0; var6 < var4; var6++) {
              DrawOfferMenuHelpers.field_c[var6] = CellFlip.field_l[var6];
            }
            DrawOfferMenuHelpers.field_c[-2 + var5] = "";
            DrawOfferMenuHelpers.field_c[var5 - 1] = WidgetLayerStack.field_I;
            FrameSkin.field_h[-1 + var5] = 0;
            WidgetFactoryHelpers.field_a[0] = 5;
          } else if (2 != IntrusiveDeque.field_d) {
            if (IntrusiveDeque.field_d == 3) {
              if (!MusicPlaybackHelpers.field_c.field_a) {
                var4 = DialogMessagePane.wrapBalancedText((byte) 127, WidgetContainer.field_x, NodeHashTableIterator.field_h, TriangleSortHelpers.field_b, CellFlip.field_l);
              } else {
                var4 = DialogMessagePane.wrapBalancedText((byte) 120, Js5Archive.field_h, NodeHashTableIterator.field_h, TriangleSortHelpers.field_b, CellFlip.field_l);
              }
              var5 = 2 + var4;
              DrawOfferMenuHelpers.field_c = new String[var5];
              FrameSkin.field_h = new int[var5];
              for (var6 = 0; var6 < var5; var6++) {
                FrameSkin.field_h[var6] = -1;
              }
              WidgetFactoryHelpers.field_a = new int[1];
              for (var6 = 0; var4 > var6; var6++) {
                DrawOfferMenuHelpers.field_c[var6] = CellFlip.field_l[var6];
              }
              DrawOfferMenuHelpers.field_c[-2 + var5] = "";
              DrawOfferMenuHelpers.field_c[var5 - 1] = WidgetLayerStack.field_I;
              FrameSkin.field_h[var5 - 1] = 0;
              WidgetFactoryHelpers.field_a[0] = 5;
            } else if (IntrusiveDeque.field_d == 4) {
              var4 = DialogMessagePane.wrapBalancedText((byte) 120, DirectByteStorage.field_j, NodeHashTableIterator.field_h, TriangleSortHelpers.field_b, CellFlip.field_l);
              var5 = var4 + 2;
              FrameSkin.field_h = new int[var5];
              DrawOfferMenuHelpers.field_c = new String[var5];
              for (var6 = 0; var5 > var6; var6++) {
                FrameSkin.field_h[var6] = -1;
              }
              WidgetFactoryHelpers.field_a = new int[1];
              for (var6 = 0; var6 < var4; var6++) {
                DrawOfferMenuHelpers.field_c[var6] = CellFlip.field_l[var6];
              }
              DrawOfferMenuHelpers.field_c[-2 + var5] = "";
              DrawOfferMenuHelpers.field_c[var5 - 1] = WidgetLayerStack.field_I;
              FrameSkin.field_h[-1 + var5] = 0;
              WidgetFactoryHelpers.field_a[0] = 5;
            } else {
              if (IntrusiveDeque.field_d != 5) {
                throw new IllegalArgumentException();
              }
              var4 = DialogMessagePane.wrapBalancedText((byte) 123, BufferedSocket.field_i, NodeHashTableIterator.field_h, TriangleSortHelpers.field_b, CellFlip.field_l);
              var5 = var4 + 3;
              DrawOfferMenuHelpers.field_c = new String[var5];
              FrameSkin.field_h = new int[var5];
              for (var6 = 0; var6 < var5; var6++) {
                FrameSkin.field_h[var6] = -1;
              }
              WidgetFactoryHelpers.field_a = new int[2];
              for (var6 = 0; var6 < var4; var6++) {
                DrawOfferMenuHelpers.field_c[var6] = CellFlip.field_l[var6];
              }
              DrawOfferMenuHelpers.field_c[-3 + var5] = "";
              DrawOfferMenuHelpers.field_c[-2 + var5] = EmailDomainValidationHelpers.field_a;
              FrameSkin.field_h[-2 + var5] = 0;
              WidgetFactoryHelpers.field_a[0] = 3;
              DrawOfferMenuHelpers.field_c[-1 + var5] = WidgetLayerStack.field_I;
              FrameSkin.field_h[var5 - 1] = 1;
              WidgetFactoryHelpers.field_a[1] = 5;
            }
          } else {
            var4 = DialogMessagePane.wrapBalancedText((byte) 121, MenuScreen.formatIndexedText(new String[]{"<br><%0><br>"}, BoundedRandomAccessFile.field_d, 2), NodeHashTableIterator.field_h, TriangleSortHelpers.field_b, CellFlip.field_l);
            var5 = -1;
            for (var6 = 0; var6 < var4; var6++) {
              if (!"<%0>".equals(CellFlip.field_l[var6])) {
                continue;
              }
              var5 = var6;
              break;
            }
            if (var5 == -1) {
              throw new IllegalStateException();
            }
            MarkerSliderPainter.field_d = new String[var5];
            ArraySupport.copy(CellFlip.field_l, 0, MarkerSliderPainter.field_d, 0, var5);
            Js5Archive.field_j = new String[-1 + var4 - var5];
            ArraySupport.copy(CellFlip.field_l, 1 + var5, Js5Archive.field_j, 0, -var5 + var4 - 1);
            var4 = DialogMessagePane.wrapBalancedText((byte) 124, MenuScreen.formatIndexedText(new String[]{"<br><%0><br>"}, LongAndTextCredentials.field_e, 2), NodeHashTableIterator.field_h, TriangleSortHelpers.field_b, CellFlip.field_l);
            var5 = -1;
            for (var6 = 0; var4 > var6; var6++) {
              if (!"<%0>".equals(CellFlip.field_l[var6])) {
                continue;
              }
              var5 = var6;
              break;
            }
            if (var5 == -1) {
              throw new IllegalStateException();
            }
            RankingsRequest.field_o = new String[var5];
            ArraySupport.copy(CellFlip.field_l, 0, RankingsRequest.field_o, 0, var5);
            LoginDialog.field_rb = new String[-var5 + var4 - 1];
            ArraySupport.copy(CellFlip.field_l, var5 + 1, LoginDialog.field_rb, 0, -var5 + (var4 - 1));
            if (RankingsRequest.field_o.length > MarkerSliderPainter.field_d.length) {
              stackIn_52_0 = RankingsRequest.field_o.length;
            } else {
              stackIn_52_0 = MarkerSliderPainter.field_d.length;
            }
            var6 = stackIn_52_0;
            if (LoginDialog.field_rb.length <= Js5Archive.field_j.length) {
              stackIn_55_0 = Js5Archive.field_j.length;
            } else {
              stackIn_55_0 = LoginDialog.field_rb.length;
            }
            var7 = stackIn_55_0;
            var8 = var7 + (var6 + 7);
            FrameSkin.field_h = new int[var8];
            DrawOfferMenuHelpers.field_c = new String[var8];
            for (var9 = 0; var8 > var9; var9++) {
              FrameSkin.field_h[var9] = -1;
            }
            WidgetFactoryHelpers.field_a = new int[2];
            DrawOfferMenuHelpers.field_c[1] = WeightedLruCache.field_c;
            FrameSkin.field_h[1] = 0;
            DrawOfferMenuHelpers.field_c[0] = IsaacRandom.field_b;
            DrawOfferMenuHelpers.field_c[4] = ViewModeNoticeGlobals.field_d;
            DrawOfferMenuHelpers.field_c[5] = "";
            WidgetFactoryHelpers.field_a[0] = 5;
            DrawOfferMenuHelpers.field_c[2] = Js5Transport.field_u;
            FrameSkin.field_h[3] = 1;
            WidgetFactoryHelpers.field_a[1] = 2;
            DrawOfferMenuHelpers.field_c[3] = IterableDualLinkDeque.field_a;
            for (var9Lifetime2 = 0; var9Lifetime2 < var6; var9Lifetime2++) {
              stackIn_62_0 = DrawOfferMenuHelpers.field_c;
              stackIn_62_1 = 6 + var9Lifetime2;
              if (var9Lifetime2 + RankingsRequest.field_o.length - var6 < 0) {
                stackIn_63_2 = "";
              } else {
                stackIn_63_2 = RankingsRequest.field_o[-var6 + var9Lifetime2 + RankingsRequest.field_o.length];
              }
              stackIn_62_0[stackIn_62_1] = stackIn_63_2;
            }
            DrawOfferMenuHelpers.field_c[var6 + 6] = null;
            FrameSkin.field_h[var6 + 6] = -2;
            for (var9Lifetime3 = 0; var9Lifetime3 < var7; var9Lifetime3++) {
              stackIn_68_0 = DrawOfferMenuHelpers.field_c;
              stackIn_68_1 = 7 - (-var6 - var9Lifetime3);
              if (LoginDialog.field_rb.length > var9Lifetime3) {
                stackIn_69_2 = LoginDialog.field_rb[var9Lifetime3];
              } else {
                stackIn_69_2 = "";
              }
              stackIn_68_0[stackIn_68_1] = stackIn_69_2;
            }
            AccountCreationSupport.field_e = ClockAndTextHelpers.monotonicMillis(-9986);
          }
          LoginMethod.field_k.field_o = WidgetFactoryHelpers.field_a.length;
          var4Lifetime1 = 0;
          for (var5Lifetime1 = 0; var5Lifetime1 < DrawOfferMenuHelpers.field_c.length; var5Lifetime1++) {
            stackIn_89_0 = 1492912648;
            stackIn_90_1 = !(FrameSkin.field_h[var5Lifetime1] < 0);
            var6Lifetime1 = SectorCacheStore.measureText(stackIn_89_0, stackIn_90_1, DrawOfferMenuHelpers.field_c[var5Lifetime1]);
            if (var4Lifetime1 < var6Lifetime1) {
              var4Lifetime1 = var6Lifetime1;
            }
          }
          if (IntrusiveDeque.field_d == 2) {
            var11 = MarkerSliderPainter.field_d;
            var5_ref_String__ = var11;
            for (var6Lifetime2 = 0; var11.length > var6Lifetime2; var6Lifetime2++) {
              var12 = var11[var6Lifetime2];
              var8Lifetime1 = SectorCacheStore.measureText(1492912648, false, var12);
              if (var4Lifetime1 < var8Lifetime1) {
                var4Lifetime1 = var8Lifetime1;
              }
            }
            var5_ref_String__Lifetime1 = Js5Archive.field_j;
            for (var6Lifetime2Lifetime1 = 0; var5_ref_String__Lifetime1.length > var6Lifetime2Lifetime1; var6Lifetime2Lifetime1++) {
              var13 = var5_ref_String__Lifetime1[var6Lifetime2Lifetime1];
              var8Lifetime1Lifetime1 = SectorCacheStore.measureText(1492912648, false, var13);
              if (var8Lifetime1Lifetime1 > var4Lifetime1) {
                var4Lifetime1 = var8Lifetime1Lifetime1;
              }
            }
          }
          PatchNoteUsage.field_n = LoginMethod.field_k.field_o * (DelayedPacket.field_j + BitwiseHelpers.field_d << 1);
          RasterSnapshot.field_g = var4Lifetime1 + PendingHighscoreRequest.field_q - (var4Lifetime1 >> 1);
          ArchiveBytesHelpers.field_c = -(var4Lifetime1 >> 1) + PendingHighscoreRequest.field_q;
          for (var5Lifetime2 = 0; DrawOfferMenuHelpers.field_c.length > var5Lifetime2; var5Lifetime2++) {
            stackIn_113_0 = PatchNoteUsage.field_n;
            if (FrameSkin.field_h[var5Lifetime2] >= 0) {
              stackIn_114_1 = DebouncedValidator.field_c;
            } else {
              stackIn_114_1 = LongAndTextLoginPayload.field_m;
            }
            PatchNoteUsage.field_n = stackIn_113_0 + stackIn_114_1;
          }
          FullscreenState.field_a = -(PatchNoteUsage.field_n >> 1) + QuickChatPhraseRegistry.field_i;
          PendingHighscoreRequest.field_v = new int[DrawOfferMenuHelpers.field_c.length][];
          var5Lifetime3 = 0;
          var6Lifetime3 = FullscreenState.field_a;
          while (var5Lifetime3 < DrawOfferMenuHelpers.field_c.length) {
            var7Lifetime1 = FrameSkin.field_h[var5Lifetime3];
            if (var7Lifetime1 < 0) {
              var6Lifetime3 = var6Lifetime3 + LongAndTextLoginPayload.field_m;
            } else {
              var8Lifetime2 = SectorCacheStore.measureText(1492912648, true, DrawOfferMenuHelpers.field_c[var5Lifetime3]);
              var6Lifetime3 = var6Lifetime3 + BitwiseHelpers.field_d;
              var9Lifetime1 = -(var8Lifetime2 >> 1) + PendingHighscoreRequest.field_q;
              PendingHighscoreRequest.field_v[var5Lifetime3] = new int[4];
              PendingHighscoreRequest.field_v[var5Lifetime3][0] = var9Lifetime1 - Js5Archive.field_d;
              PendingHighscoreRequest.field_v[var5Lifetime3][1] = var6Lifetime3;
              PendingHighscoreRequest.field_v[var5Lifetime3][2] = (Js5Archive.field_d << 1) + var8Lifetime2;
              var6Lifetime3 = var6Lifetime3 + ((DelayedPacket.field_j << 1) + (BitwiseHelpers.field_d + DebouncedValidator.field_c));
              PendingHighscoreRequest.field_v[var5Lifetime3][3] = (DelayedPacket.field_j << 1) + DebouncedValidator.field_c;
            }
            var5Lifetime3++;
          }
          if (IntrusiveDeque.field_d != 2) {
            LoginMethod.field_k.initializeSelection(param0, SocketJs5Transport.findPopupMenuRowAt(IconTextComponent.field_Jb, StatefulWidgetPainter.field_u, (byte) 111), -563, 0);
          } else {
            LoginMethod.field_k.initializeSelection(param0, -1, -563, -1);
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3 = decompiledCaughtException;
          throw AsyncCheckResult.wrapException((Throwable) ((Object) var3), "nm.B(" + param0 + ',' + param1 + ',' + param2 + ')');
        }
    }

    final static void detachKeyHandler(int param0) {
        Throwable decompiledCaughtException = null;
        Object var1 = null;
        if (ValidationIndicator.field_L != null) {
          var1 = ValidationIndicator.field_L;
          synchronized (var1) {
            ValidationIndicator.field_L = null;
          }
        }
        if (param0 < 109) {
          field_c = (String) null;
        }
    }

    static {
        field_b = 0;
        field_a = new int[8192];
        field_c = "You have entered another game.";
    }
}
