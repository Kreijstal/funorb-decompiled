/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class PendingRecordRequest extends IntrusiveNode {
    int field_o;
    int field_t;
    static FullscreenErrorReason field_h;
    int field_l;
    int field_i;
    int field_q;
    static String field_r;
    long field_s;
    int field_m;
    int field_n;
    static String field_j;
    static Sprite field_v;
    static int field_p;
    static String field_w;
    int[] field_k;
    static int[] field_u;
    static int field_x;

    final static void rasterizeLitMesh(byte param0, int param1, int param2, TriangleMesh param3, int param4, int param5, int param6, int param7) {
        int stackIn_18_0 = 0;
        int[] stackIn_20_0 = null;
        int stackIn_21_1 = 0;
        int stackIn_27_0 = 0;
        int stackIn_30_0 = 0;
        int stackIn_33_0 = 0;
        GlowAreaSupport stackIn_41_0 = null;
        int stackIn_47_0 = 0;
        int stackIn_51_0 = 0;
        RuntimeException stackIn_56_0 = null;
        StringBuilder stackIn_56_1 = null;
        String stackIn_57_2 = null;
        RuntimeException decompiledCaughtException = null;
        int[] var8 = null;
        RuntimeException var8_ref = null;
        int var13 = 0;
        int var14 = 0;
        int var15 = 0;
        int var16 = 0;
        int var17 = 0;
        int var18 = 0;
        int var19 = 0;
        int var20 = 0;
        GlowAreaSupport var21 = null;
        int var22 = 0;
        int var23 = 0;
        int var24 = 0;
        int var25 = 0;
        int var26 = 0;
        int var27 = 0;
        int var28 = 0;
        int var29 = 0;
        int var30 = 0;
        int var31 = 0;
        int var32 = 0;
        int var33 = 0;
        int var34 = 0;
        int var35 = 0;
        int var36 = 0;
        int var37 = 0;
        int var38 = 0;
        int var39 = 0;
        int var40 = 0;
        int[] var41 = null;
        TriangleMesh var44 = null;
        int[] var49 = null;
        int[] var54 = null;
        byte[] var60 = null;
        int[] var61 = null;
        int[] var62 = null;
        int[] var63 = null;
        int[] var64 = null;
        int var13Lifetime1;
        int var14Lifetime1;
        int var15Lifetime1;
        int var14Lifetime2;
        int var15Lifetime2;
        var40 = ZombieDawn.field_J;
        try {
          var44 = param3;
          if (null != var44.field_F &&
            var44.field_p > 1) {
            var60 = var44.field_F;
            GameApplet.redistributeFacesByPriority(0, 0, MenuSelection.field_f, var60, 0);
          } else {
            SoundEffectCleanupHelpers.compactDepthBucketFaceOrder(1);
          }
          if (param0 >= -67) {
            PendingRecordRequest.releaseStatics(-5);
          }
          var54 = new int[param3.field_f];
          var49 = var54;
          var41 = var49;
          var8 = var41;
          var64 = new int[param3.field_f];
          var62 = NetworkArchiveRequest.field_y;
          var63 = StrongCacheEntry.field_s;
          var61 = AbstractSprite.field_c;
          for (var13 = 0; param3.field_f > var13; var13++) {
            var14 = param6 * var61[var13] + (param4 * var62[var13] + param5 * var63[var13]) >> 8;
            if (var14 < 0) {
              var14 = -var14;
            }
            if (var14 >= 0) {
              if (var14 >= 128) {
                stackIn_18_0 = 256;
              } else {
                stackIn_18_0 = 128 + var14;
              }
            } else {
              stackIn_18_0 = 128;
            }
            var14Lifetime2 = stackIn_18_0;
            var15 = param1 * var61[var13] + (param2 * var63[var13] + var62[var13] * param7) >> 8;
            stackIn_20_0 = SweepingSpotlight.field_H;
            if (var15 < 0) {
              stackIn_21_1 = -var15;
            } else {
              stackIn_21_1 = var15;
            }
            var15Lifetime2 = stackIn_20_0[stackIn_21_1];
            var14Lifetime2 = var14Lifetime2 * (256 - var15Lifetime2) >>> 8;
            var54[var13] = var14Lifetime2;
            var64[var13] = var15Lifetime2;
          }
          for (var13Lifetime1 = 0; ArrayWidgetContainer.field_A > var13Lifetime1; var13Lifetime1++) {
            var14Lifetime1 = RasterState.field_o[var13Lifetime1];
            var15Lifetime1 = param3.field_g[var14Lifetime1];
            var16 = param3.field_H[var14Lifetime1];
            var17 = param3.field_r[var14Lifetime1];
            if (param3.field_O[var14Lifetime1] < NetworkArchiveRequest.field_y.length) {
              stackIn_27_0 = param3.field_O[var14Lifetime1];
            } else {
              stackIn_27_0 = -1;
            }
            var18 = stackIn_27_0;
            if (NetworkArchiveRequest.field_y.length > param3.field_n[var14Lifetime1]) {
              stackIn_30_0 = param3.field_n[var14Lifetime1];
            } else {
              stackIn_30_0 = -1;
            }
            var19 = stackIn_30_0;
            if (NetworkArchiveRequest.field_y.length <= param3.field_v[var14Lifetime1]) {
              stackIn_33_0 = -1;
            } else {
              stackIn_33_0 = param3.field_v[var14Lifetime1];
            }
            var20 = stackIn_33_0;
            if (null != SecondaryNodeDequeIterator.field_a &&
              param3.field_x != null &&
              param3.field_x.length > var14Lifetime1 &&
              param3.field_x[var14Lifetime1] != -1 &&
              param3.field_x[var14Lifetime1] < SecondaryNodeDequeIterator.field_a.length) {
              stackIn_41_0 = SecondaryNodeDequeIterator.field_a[param3.field_x[var14Lifetime1]];
            } else {
              stackIn_41_0 = null;
            }
            var21 = stackIn_41_0;
            var22 = IntroSpeedHelpers.field_a[var15Lifetime1];
            var23 = MinigunGunner.field_Nb[var15Lifetime1];
            var24 = IntroSpeedHelpers.field_a[var16];
            var25 = MinigunGunner.field_Nb[var16];
            var26 = IntroSpeedHelpers.field_a[var17];
            var27 = MinigunGunner.field_Nb[var17];
            if (var18 == var19 &&
              var19 == var20) {
              var28 = var54[var18];
              var29 = var64[var18];
              if (var21 != null) {
                stackIn_51_0 = var21.field_h;
              } else {
                stackIn_51_0 = 8355711;
              }
              var30 = stackIn_51_0;
              var31 = 16711935 & var30;
              var32 = var30 & 65280;
              var33 = (var32 * var28 & 16711929) >>> 8 | (-16711868 & var31 * var28) >>> 8;
              var33 = var33 + var29 * 65793;
              DialWidget.fillTriangle(var22, var27, var24, var33 >> 1 & 8355711, var25, var23, var26, (byte) 75);
            } else {
              var28 = var54[var18];
              var29 = var54[var19];
              var30 = var54[var20];
              var31 = var64[var18];
              var32 = var64[var19];
              var33 = var64[var20];
              if (var21 == null) {
                stackIn_47_0 = 8355711;
              } else {
                stackIn_47_0 = var21.field_h;
              }
              var34 = stackIn_47_0;
              var35 = var34 & 16711935;
              var36 = 65280 & var34;
              var37 = (16711863 & var28 * var36) >>> 8 | var28 * var35 >>> 8 & -1090584321;
              var38 = var29 * var35 >>> 8 & 1056899327 | var29 * var36 >>> 8 & 218169088;
              var37 = var37 + var31 * 65793;
              var38 = var38 + var32 * 65793;
              var39 = var30 * var36 >>> 8 & 2013331200 | (-16711925 & var35 * var30) >>> 8;
              var39 = var39 + 65793 * var33;
              ProxySocketConnector.drawSortedTriangle(false, var22, 255 & var37, var38 & 255, var25, var38 >> 16, var37 >> 16, (var39 & 65350) >> 8, var39 & 255, var37 >> 8 & 255, var24, var39 >> 16, 255 & var38 >> 8, var23, var27, var26);
            }
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var8_ref = decompiledCaughtException;
          stackIn_56_0 = var8_ref;
          stackIn_56_1 = new StringBuilder().append("rc.D(").append(param0).append(',').append(param1).append(',').append(param2).append(',');
          if (param3 == null) {
            stackIn_57_2 = "null";
          } else {
            stackIn_57_2 = "{...}";
          }
          throw ExceptionWrapper.wrapException((Throwable) ((Object) stackIn_56_0), ((StringBuilder) (Object) stackIn_56_1).append(stackIn_57_2).append(',').append(param4).append(',').append(param5).append(',').append(param6).append(',').append(param7).append(')').toString());
        }
    }

    final static java.net.URL appendSessionParameters(int param0, java.applet.Applet param1, java.net.URL param2) {
        Object var3 = null;
        Object var4 = null;
        java.net.URL stackIn_10_0 = null;
        Object stackIn_13_0 = null;
        StringBuilder stackIn_13_1 = null;
        String stackIn_14_2 = null;
        StringBuilder stackIn_16_1 = null;
        String stackIn_17_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          var3 = null;
          var4 = null;
          if (param0 != -1) {
            PendingRecordRequest.releaseStatics(48);
          }
          if (null != FullscreenConfirmationDialog.field_X &&
            !FullscreenConfirmationDialog.field_X.equals(param1.getParameter("settings"))) {
            var3 = FullscreenConfirmationDialog.field_X;
            var4 = var3;
            var4 = var3;
          }
          if (Mover.field_H != null &&
            !Mover.field_H.equals(param1.getParameter("session"))) {
            var4 = Mover.field_H;
          }
          stackIn_10_0 = MenuSelection.rewriteAppletUrl((byte) 97, param2, (String) (var4), (String) (var3), -1);
          return stackIn_10_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3 = decompiledCaughtException;
          stackIn_13_0 = var3;
          stackIn_13_1 = new StringBuilder().append("rc.C(").append(param0).append(',');
          if (param1 == null) {
            stackIn_14_2 = "null";
          } else {
            stackIn_14_2 = "{...}";
          }
          stackIn_16_1 = ((StringBuilder) (Object) stackIn_13_1).append(stackIn_14_2).append(',');
          if (param2 == null) {
            stackIn_17_2 = "null";
          } else {
            stackIn_17_2 = "{...}";
          }
          throw ExceptionWrapper.wrapException((Throwable) (stackIn_13_0), ((StringBuilder) (Object) stackIn_16_1).append(stackIn_17_2).append(')').toString());
        }
    }

    final static void drawDialogLayer(boolean param0, byte param1) {
        MessageDialogContent.field_S.drawAllLayers(0, 0, 0);
        if (param1 > -35) {
          PendingRecordRequest.drawDialogLayer(false, (byte) -121);
        }
    }

    public static void releaseStatics(int param0) {
        field_r = null;
        field_u = null;
        if (param0 != 0) {
          return;
        }
        field_v = null;
        field_j = null;
        field_h = null;
        field_w = null;
    }

    PendingRecordRequest(int param0, int param1, int param2, int param3, int param4, int param5, int[] param6) {
        int fieldTemp$0 = 0;
        try {
          this.field_q = param2;
          fieldTemp$0 = QueuedStatSubmission.field_p;
          QueuedStatSubmission.field_p = QueuedStatSubmission.field_p + 1;
          this.field_i = fieldTemp$0 & 65535;
          this.field_t = param5;
          this.field_m = param3;
          this.field_l = param4;
          this.field_k = param6;
          this.field_n = param1;
          this.field_o = param0;
        } catch (RuntimeException runtimeException) {
          throw ExceptionWrapper.wrapException((Throwable) ((Object) runtimeException), "rc.<init>(" + param0 + ',' + param1 + ',' + param2 + ',' + param3 + ',' + param4 + ',' + param5 + ',' + (param6 != null ? "{...}" : "null") + ')');
        }
    }

    static {
        field_r = "Log in / Create account";
        field_h = new FullscreenErrorReason();
        field_j = "You need to choose a name before you can log in. This is the name that will be displayed to other players.";
        field_u = new int[]{};
        field_x = 0;
        field_p = field_x;
    }
}
