/*
 * Decompiled by CFR-JS 0.4.0.
 */
class DualLinkNode extends IntrusiveNode {
    static String field_q;
    DualLinkNode secondaryNext;
    long secondaryKey;
    static int[] field_r;
    static String field_p;
    DualLinkNode secondaryPrevious;

    final long getSecondaryKey(int param0) {
        int var2 = 17 / ((param0 + 27) / 46);
        return this.secondaryKey;
    }

    final void setSecondaryKey(long param0, int param1) {
        if (null != this.secondaryPrevious) {
          throw new RuntimeException();
        }
        if (param1 != 17260) {
          DualLinkNode.enterFullscreen((byte) -92, true);
        }
        this.secondaryKey = param0;
    }

    final boolean isSecondaryLinked(int param0) {
        if (null == this.secondaryPrevious) {
          return false;
        }
        if (param0 != 2) {
          field_r = (int[]) null;
          return true;
        }
        return true;
    }

    final static IndexedSprite createRepalettedSprite(boolean param0, int[] param1, IndexedSprite param2) {
        IndexedSprite var3 = null;
        RuntimeException var3_ref = null;
        IndexedSprite stackIn_2_0 = null;
        IndexedSprite stackIn_4_0 = null;
        RuntimeException stackIn_7_0 = null;
        StringBuilder stackIn_7_1 = null;
        String stackIn_8_2 = null;
        StringBuilder stackIn_10_1 = null;
        String stackIn_11_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          if (param0) {
            stackIn_2_0 = (IndexedSprite) null;
            return stackIn_2_0;
          }
          var3 = new IndexedSprite(0, 0, 0);
          var3.field_k = param2.field_k;
          var3.field_d = param2.field_d;
          var3.field_f = param2.field_f;
          var3.field_b = param2.field_b;
          var3.field_j = param2.field_j;
          var3.field_h = param2.field_h;
          var3.field_p = param1;
          var3.field_o = param2.field_o;
          stackIn_4_0 = var3;
          return stackIn_4_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3_ref = decompiledCaughtException;
          stackIn_7_0 = var3_ref;
          stackIn_7_1 = new StringBuilder().append("gb.TA(").append(param0).append(',');
          if (param1 == null) {
            stackIn_8_2 = "null";
          } else {
            stackIn_8_2 = "{...}";
          }
          stackIn_10_1 = ((StringBuilder) (Object) stackIn_7_1).append(stackIn_8_2).append(',');
          if (param2 == null) {
            stackIn_11_2 = "null";
          } else {
            stackIn_11_2 = "{...}";
          }
          throw IndexedSpriteState.wrapException((Throwable) ((Object) stackIn_7_0), ((StringBuilder) (Object) stackIn_10_1).append(stackIn_11_2).append(')').toString());
        }
    }

    final static void enterFullscreen(byte param0, boolean param1) {
        int var2;
        int var3;
        IndexedSprite var4;
        var3 = TetraLink.field_J;
        if (0 >= CacheEntry.field_C) {
          var2 = (!LoadingProgressDialog.isKeyboardIdle(-115)) ? 1 : 0;
        } else {
          if (DateInputWidget.field_M != null) {
            EmailAvailabilityValidator.field_u = DateInputWidget.field_M.enterFullscreen(false);
            PlayerContextMenu.notifyBrowserResize(123, 2);
          } else {
            EmailAvailabilityValidator.field_u = FullscreenCanvasHelpers.createFullscreenCanvas(480, 0, 0, 640, 0, QuickChatHelpDialog.field_Pb);
          }
          if (EmailAvailabilityValidator.field_u == null) {
            var2 = 3;
          } else {
            CanvasAndErrorHelpers.attachCanvasInput((byte) -76, EmailAvailabilityValidator.field_u);
            var2 = 2;
          }
        }
        if (null == DateInputWidget.field_M &&
          LoadingScreenHelpers.field_f) {
          ReportAbuseDialog.buildFullscreenDialog(param1, 10, var2);
        }
        if (param0 > -68) {
          var4 = (IndexedSprite) null;
          DualLinkNode.createRepalettedSprite(false, (int[]) null, (IndexedSprite) null);
        }
    }

    final void unlinkSecondary(int param0) {
        if (null == this.secondaryPrevious) {
          return;
        }
        this.secondaryPrevious.secondaryNext = this.secondaryNext;
        this.secondaryNext.secondaryPrevious = this.secondaryPrevious;
        this.secondaryPrevious = null;
        if (param0 != 0) {
          return;
        }
        this.secondaryNext = null;
    }

    final static LoginMethod readLastLoginMethod(byte param0, java.applet.Applet param1) {
        int var4 = 0;
        String var2 = null;
        RuntimeException var2_ref = null;
        LoginMethod[] var3_ref_dk__ = null;
        int var3 = 0;
        LoginMethod var5 = null;
        int var6 = 0;
        LoginMethod stackIn_4_0 = null;
        LoginMethod stackIn_10_0 = null;
        LoginMethod stackIn_13_0 = null;
        RuntimeException stackIn_16_0 = null;
        StringBuilder stackIn_16_1 = null;
        String stackIn_17_2 = null;
        RuntimeException decompiledCaughtException = null;
        var6 = TetraLink.field_J;
        try {
          var2 = TetraLink.readCookie("jagex-last-login-method", -28536, param1);
          if (var2 == null) {
            stackIn_4_0 = DefaultQuickChatContext.field_b;
            return stackIn_4_0;
          }
          var3_ref_dk__ = BevelFrameSpriteFactory.getLoginMethods(7);
          for (var4 = 0; var4 < var3_ref_dk__.length; var4++) {
            var5 = var3_ref_dk__[var4];
            if (var5.matchesCookieValue(16412, var2)) {
              stackIn_10_0 = var5;
              return stackIn_10_0;
            }
          }
          var3 = -31 / ((param0 - 21) / 47);
          stackIn_13_0 = DefaultQuickChatContext.field_b;
          return stackIn_13_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2_ref = decompiledCaughtException;
          stackIn_16_0 = var2_ref;
          stackIn_16_1 = new StringBuilder().append("gb.UA(").append(param0).append(',');
          if (param1 == null) {
            stackIn_17_2 = "null";
          } else {
            stackIn_17_2 = "{...}";
          }
          throw IndexedSpriteState.wrapException((Throwable) ((Object) stackIn_16_0), ((StringBuilder) (Object) stackIn_16_1).append(stackIn_17_2).append(')').toString());
        }
    }

    public static void releaseStatics(int param0) {
        field_q = null;
        field_p = null;
        if (param0 < 88) {
          field_r = (int[]) null;
        }
        field_r = null;
    }

    protected DualLinkNode() {
    }

    static {
        field_q = "You do not have a suitable number of players for the current options.";
        field_p = "If you do nothing the game will revert to normal view in <%0> seconds.";
    }
}
