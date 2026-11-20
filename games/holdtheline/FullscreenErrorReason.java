/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class FullscreenErrorReason {
    static String field_e;
    static String field_a;
    static String field_f;
    static String field_c;
    static String field_d;
    static RotatedSpriteAsset field_b;

    final static int a(String param0, byte param1, boolean param2) {
        RuntimeException var3 = null;
        int stackIn_2_0 = 0;
        int stackIn_5_0 = 0;
        int stackIn_7_0 = 0;
        RuntimeException stackIn_10_0 = null;
        StringBuilder stackIn_10_1 = null;
        String stackIn_11_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          if (param1 != -113) {
            stackIn_2_0 = -102;
            return stackIn_2_0;
          }
          if (param2) {
            stackIn_7_0 = q.field_a.measureText(param0);
            return stackIn_7_0;
          }
          stackIn_5_0 = CheckboxWidget.field_G.measureText(param0);
          return stackIn_5_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3 = decompiledCaughtException;
          stackIn_10_0 = var3;
          stackIn_10_1 = new StringBuilder().append("h.B(");
          if (param0 == null) {
            stackIn_11_2 = "null";
          } else {
            stackIn_11_2 = "{...}";
          }
          throw EntitySound.wrapException((Throwable) ((Object) stackIn_10_0), ((StringBuilder) (Object) stackIn_10_1).append(stackIn_11_2).append(',').append(param1).append(',').append(param2).append(')').toString());
        }
    }

    public final String toString() {
        throw new IllegalStateException();
    }

    public static void clearSharedReferences(byte param0) {
        field_c = null;
        field_a = null;
        field_f = null;
        field_d = null;
        field_e = null;
        if (param0 <= 6) {
          String var2 = (String) null;
          FullscreenErrorReason.measureMenuTextWidthWithIntGuard((String) null, 43, false);
        }
        field_b = null;
    }

    final static void b(byte param0) {
        StringBuilder discarded$24 = null;
        StringBuilder discarded$25 = null;
        StringBuilder discarded$26 = null;
        StringBuilder discarded$27 = null;
        StringBuilder discarded$28 = null;
        StringBuilder discarded$29 = null;
        StringBuilder discarded$30 = null;
        StringBuilder discarded$31 = null;
        StringBuilder discarded$32 = null;
        StringBuilder discarded$33 = null;
        StringBuilder discarded$0 = null;
        StringBuilder discarded$1 = null;
        StringBuilder discarded$2 = null;
        StringBuilder discarded$3 = null;
        StringBuilder discarded$4 = null;
        StringBuilder discarded$18 = null;
        StringBuilder discarded$19 = null;
        StringBuilder discarded$20 = null;
        StringBuilder discarded$21 = null;
        StringBuilder discarded$22 = null;
        StringBuilder discarded$23 = null;
        StringBuilder discarded$5 = null;
        StringBuilder discarded$6 = null;
        StringBuilder discarded$7 = null;
        StringBuilder discarded$8 = null;
        StringBuilder discarded$9 = null;
        StringBuilder discarded$10 = null;
        StringBuilder discarded$11 = null;
        StringBuilder discarded$12 = null;
        StringBuilder discarded$13 = null;
        StringBuilder discarded$14 = null;
        StringBuilder discarded$15 = null;
        StringBuilder discarded$16 = null;
        StringBuilder discarded$17 = null;
        String[] stackIn_49_0 = null;
        int stackIn_49_1 = 0;
        String stackIn_50_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var1 = null;
        int var2 = 0;
        int var3 = 0;
        String[] var5 = null;
        int var5_int = 0;
        String[] var6 = null;
        int var6_int = 0;
        Sprite[] var7 = null;
        int var8 = 0;
        int var10 = 0;
        int var11 = 0;
        int var12 = 0;
        int var13 = 0;
        int var14 = 0;
        StringBuilder var15 = null;
        Object var16 = null;
        RaceSetupMenu var16_ref = null;
        StringBuilder var17 = null;
        CourseDefinition var19 = null;
        String[] var20 = null;
        Sprite var21 = null;
        StringBuilder var22 = null;
        String[] var23 = null;
        Sprite[] var24 = null;
        CourseDefinition var26 = null;
        String[] var27 = null;
        Sprite var28 = null;
        StringBuilder var29 = null;
        String[] var30 = null;
        Sprite[] var31 = null;
        int[] var36 = null;
        int[] var37 = null;
        String[] var5Lifetime1;
        String[] var6Lifetime1;
        Sprite[] var7Lifetime1;
        int var5_intLifetime1;
        int var8Lifetime1;
        int var3Lifetime1;
        int var3Lifetime2;
        int var3Lifetime3;
        var16 = null;
        var13 = HoldTheLine.field_D;
        try {
          var2 = -127 % ((45 - param0) / 55);
          var16_ref = (RaceSetupMenu) (l.field_a[13]);
          if (DelegatingCanvas.field_d == 7) {
            for (var3 = 0; var3 < 4; var3++) {
              var15 = new StringBuilder(20);
              discarded$24 = var15.append("<col=1>");
              discarded$25 = var15.append(ViewportSizingController.field_t[var3]);
              discarded$26 = var15.append("</col><br><br>");
              var5_int = PolarSortVector.a((byte) 105, var3);
              if (2 != var5_int) {
                if (var5_int == 1) {
                  discarded$27 = var15.append(ArchiveLoadProgress.field_a[var3]);
                } else {
                  discarded$28 = var15.append(NameRequestState.field_d[var3]);
                  discarded$29 = var15.append("<br><br>");
                  var6_int = d.field_c[var3];
                  if (var6_int == -1) {
                    discarded$30 = var15.append(NameCheckProgressDialog.field_tb);
                  } else {
                    discarded$31 = var15.append(AccountTermsPanel.field_I);
                    discarded$32 = var15.append(DisplayNameValidator.formatPreciseRaceTime(90, var6_int));
                  }
                }
              } else {
                discarded$33 = var15.append(MarkerSliderRenderer.field_m);
              }
              var16_ref.rowLabels[0][var3] = ViewportSizingController.field_t[var3];
              var16_ref.rowDescriptions[0][var3] = var15.toString();
              var16_ref.rowSprites[0][var3] = IndexedSpriteState.a(PolarSortVector.a((byte) 30, var3), (byte) -37, var3);
            }
            var16_ref.rowTitles[0] = TutorialCondition.field_a;
            return;
          }
          if (1 != DelegatingCanvas.field_d &&
            DelegatingCanvas.field_d != 0) {
            var3Lifetime1 = MenuList.field_l[5];
            var37 = new int[var3Lifetime1];
            var27 = new String[var3Lifetime1];
            var5 = var27;
            var30 = new String[var3Lifetime1];
            var6 = var30;
            var31 = new Sprite[var3Lifetime1];
            var7 = var31;
            var14 = 0;
            var8 = var14;
            while (var3Lifetime1 > var14) {
              var37[var14] = var14;
              var26 = VehicleEngineSounds.field_c[5][var14];
              var10 = PolarSortVector.a((byte) 55, var14);
              if (var10 == 0 &&
                !var26.field_r) {
                var5[var14] = var26.field_b;
                var29 = new StringBuilder(20);
                discarded$0 = var29.append("<col=1>");
                discarded$1 = var29.append(var26.field_b);
                discarded$2 = var29.append("</col><br>(");
                discarded$3 = var29.append(ViewportSizingController.field_t[var26.field_p]);
                discarded$4 = var29.append(")");
                var6[var14] = var29.toString();
                var7[var14] = var26.getPreview(9392, 2, 111);
              } else {
                var27[var14] = "";
                stackIn_49_0 = var6;
                stackIn_49_1 = var14;
                if (1 != var10) {
                  stackIn_50_2 = MarkerSliderRenderer.field_m;
                } else {
                  stackIn_50_2 = TextLineLayout.field_f[var14];
                }
                stackIn_49_0[stackIn_49_1] = stackIn_50_2;
                var28 = var26.getPreview(9392, 2, 111).copy();
                Point2i.scaleSpriteIntensity(var28, 64, -1);
                vb.a(-109, var28);
                FullscreenErrorDialog.field_ab.draw(-FullscreenErrorDialog.field_ab.width + var28.width >> 1, var28.height - FullscreenErrorDialog.field_ab.height >> 1);
                MarkerSliderRenderer.restoreRasterTarget(-1);
                var7[var14] = var28;
              }
              var14++;
            }
            var16_ref.rowItemIds[0] = var37;
            var16_ref.rowLabels[0] = var27;
            var16_ref.rowDescriptions[0] = var30;
            var16_ref.rowSprites[0] = var31;
            var16_ref.rowTitles[0] = NodeHashTableIterator.field_a;
            return;
          }
          for (var3Lifetime2 = 0; var3Lifetime2 < 4; var3Lifetime2++) {
            var17 = new StringBuilder(20);
            discarded$18 = var17.append("<col=1>");
            discarded$19 = var17.append(ViewportSizingController.field_t[var3Lifetime2]);
            discarded$20 = var17.append("</col><br><br>");
            var5_intLifetime1 = PolarSortVector.a((byte) 2, var3Lifetime2);
            if (var5_intLifetime1 != 2) {
              if (var5_intLifetime1 != 1) {
                discarded$21 = var17.append(NameRequestState.field_d[var3Lifetime2]);
              } else {
                discarded$22 = var17.append(TextLineLayout.field_f[var3Lifetime2]);
              }
            } else {
              discarded$23 = var17.append(MarkerSliderRenderer.field_m);
            }
            var16_ref.rowLabels[0][var3Lifetime2] = ViewportSizingController.field_t[var3Lifetime2];
            var16_ref.rowDescriptions[0][var3Lifetime2] = var17.toString();
            var16_ref.rowSprites[0][var3Lifetime2] = IndexedSpriteState.a(PolarSortVector.a((byte) 41, var3Lifetime2), (byte) -109, var3Lifetime2);
          }
          var3Lifetime3 = MenuList.field_l[StrongCacheEntry.field_w];
          var36 = new int[var3Lifetime3];
          var20 = new String[var3Lifetime3];
          var5Lifetime1 = var20;
          var23 = new String[var3Lifetime3];
          var6Lifetime1 = var23;
          var24 = new Sprite[var3Lifetime3];
          var7Lifetime1 = var24;
          for (var8Lifetime1 = 0; var8Lifetime1 < var3Lifetime3; var8Lifetime1++) {
            var36[var8Lifetime1] = var8Lifetime1;
            var19 = VehicleEngineSounds.field_c[StrongCacheEntry.field_w][var8Lifetime1];
            if (0 == ArcTrackBoundary.a(var8Lifetime1, -10, StrongCacheEntry.field_w) &&
              !var19.field_r) {
              var5Lifetime1[var8Lifetime1] = var19.field_b;
              var22 = new StringBuilder(20);
              discarded$5 = var22.append("<col=1>");
              discarded$6 = var22.append(var19.field_b);
              discarded$7 = var22.append("</col><br><br>");
              var11 = hk.field_c[StrongCacheEntry.field_w][var8Lifetime1];
              if (var11 == -1) {
                discarded$8 = var22.append(sm.field_d);
              } else {
                discarded$9 = var22.append(AccountTermsPanel.field_I);
                discarded$10 = var22.append(DisplayNameValidator.formatPreciseRaceTime(53, var11));
                discarded$11 = var22.append(' ');
                discarded$12 = var22.append('(');
                if (BoundaryIntersection.field_j[StrongCacheEntry.field_w][var8Lifetime1] >= 0 &&
                  BoundaryIntersection.field_j[StrongCacheEntry.field_w][var8Lifetime1] < 4) {
                  discarded$13 = var22.append(FullscreenErrorDialog.field_Y[BoundaryIntersection.field_j[StrongCacheEntry.field_w][var8Lifetime1]]);
                }
                discarded$14 = var22.append(')');
                discarded$15 = var22.append(NameCheckProgressDialog.field_zb);
                var12 = QuickChatPhraseDefinition.field_v[StrongCacheEntry.field_w][var8Lifetime1];
                if (var12 != -1) {
                  discarded$16 = var22.append(DisplayNameValidator.formatPreciseRaceTime(61, var12));
                } else {
                  discarded$17 = var22.append(QuickChatPhraseDefinition.field_p);
                }
              }
              var6Lifetime1[var8Lifetime1] = var22.toString();
              var7Lifetime1[var8Lifetime1] = var19.getPreview(9392, 1, 111);
            } else {
              var20[var8Lifetime1] = "";
              var6Lifetime1[var8Lifetime1] = HoldTheLine.field_G[StrongCacheEntry.field_w];
              var21 = var19.getPreview(9392, DelegatingCanvas.field_d, 111).copy();
              Point2i.scaleSpriteIntensity(var21, 64, -1);
              vb.a(-97, var21);
              FullscreenErrorDialog.field_ab.draw(-FullscreenErrorDialog.field_ab.width + var21.width >> 1, var21.height - FullscreenErrorDialog.field_ab.height >> 1);
              MarkerSliderRenderer.restoreRasterTarget(-1);
              var7Lifetime1[var8Lifetime1] = var21;
            }
          }
          var16_ref.rowItemIds[1] = var36;
          var16_ref.rowLabels[1] = var20;
          var16_ref.rowDescriptions[1] = var23;
          var16_ref.rowSprites[1] = var24;
          var16_ref.rowTitles[0] = vb.field_c;
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var1 = decompiledCaughtException;
          throw EntitySound.wrapException((Throwable) ((Object) var1), "h.A(" + param0 + ')');
        }
    }

    static {
        field_e = "2P";
        field_f = "Close";
        field_c = "You have <%0> unread messages!";
        field_a = "No retry attempts remaining";
        field_d = "OK";
    }

    /* Full JVM integer arguments; original narrow signature preserved. */
    final static int measureMenuTextWidthWithIntGuard(String param0, int param1, boolean param2) {
        RuntimeException var3 = null;
        int stackIn_2_0 = 0;
        int stackIn_5_0 = 0;
        int stackIn_7_0 = 0;
        RuntimeException stackIn_10_0 = null;
        StringBuilder stackIn_10_1 = null;
        String stackIn_11_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          if (param1 != -113) {
            stackIn_2_0 = -102;
            return stackIn_2_0;
          }
          if (param2) {
            stackIn_7_0 = q.field_a.measureText(param0);
            return stackIn_7_0;
          }
          stackIn_5_0 = CheckboxWidget.field_G.measureText(param0);
          return stackIn_5_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3 = decompiledCaughtException;
          stackIn_10_0 = var3;
          stackIn_10_1 = new StringBuilder().append("h.B(");
          if (param0 == null) {
            stackIn_11_2 = "null";
          } else {
            stackIn_11_2 = "{...}";
          }
          throw EntitySound.wrapException((Throwable) ((Object) stackIn_10_0), ((StringBuilder) (Object) stackIn_10_1).append(stackIn_11_2).append(',').append(param1).append(',').append(param2).append(')').toString());
        }
    }
}
