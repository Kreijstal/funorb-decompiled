/*
 * Decompiled by CFR-JS 0.4.0.
 */
abstract class MouseWheelInput {
    static UiLayoutNode field_a;
    static UiLayoutNode field_e;
    static boolean field_b;
    static String field_d;
    static long[] field_c;
    static boolean field_f;

    public static void releaseStatics(byte param0) {
        field_a = null;
        field_d = null;
        if (param0 == 66) {
          field_e = null;
          field_c = null;
          return;
        }
        field_e = (UiLayoutNode) null;
        field_e = null;
        field_c = null;
    }

    final static void a(byte param0, boolean param1) {
        if (WeightedLruCache.a(false)) {
          param1 = false;
        }
        ScrollBar.a((byte) 123, param1);
        NetworkGameClient.k(1);
        if (param0 < -115) {
          return;
        }
        MouseWheelInput.a((byte) 9, true);
    }

    final static void a(int param0, int param1) {
        int var2;
        int var3;
        int var4;
        int var5;
        int var6;
        int var2Lifetime1;
        int var4Lifetime1;
        int var4Lifetime2;
        int var4Lifetime3;
        int var5Lifetime1;
        int var5Lifetime2;
        int var5Lifetime3;
        var6 = Kickabout.field_G;
        var2 = 0;
        var3 = PlayerStats.field_p;
        if (var3 < 5) {
          var2 = 8192 * (var3 * var3) / 1100;
          var4 = param1;
          var5 = 0;
          if (param0 == 3) {
            var4 = -1;
          }
          if (param0 == 1) {
            var5 = 1;
          }
          if (param0 == 4) {
            var5 = 1;
            var4 = 1;
          }
          if (param0 == 5) {
            var5 = 1;
            var4 = -1;
          }
          if (param0 == 6) {
            var5 = -1;
            var4 = 1;
          }
          if (param0 == 7 ||
            param0 == 8) {
            var4 = -1;
            var5 = -1;
          }
          if (param0 == 11) {
            var4 = -1;
          }
          if (param0 == 12) {
            var5 = -1;
            var4 = -1;
          }
          if (param0 == 13) {
            var4 = 1;
            var5 = -1;
          }
          if (param0 == 14) {
            var4 = -1;
            var5 = 1;
          }
          if (15 == param0) {
            var5 = 1;
            var4 = 1;
          }
          FullscreenFailureReason.field_g = SocialTabsPanel.a(var4 * var2, -125, var5 * var2);
          return;
        }
        if (var3 < 105) {
          var2 = (-40960 + 16384 * var3) / 220;
          var4Lifetime1 = param1;
          var5Lifetime1 = 0;
          if (param0 == 3) {
            var4Lifetime1 = -1;
          }
          if (param0 == 1) {
            var5Lifetime1 = 1;
          }
          if (param0 == 4) {
            var5Lifetime1 = 1;
            var4Lifetime1 = 1;
          }
          if (param0 == 5) {
            var5Lifetime1 = 1;
            var4Lifetime1 = -1;
          }
          if (param0 == 6) {
            var5Lifetime1 = -1;
            var4Lifetime1 = 1;
          }
          if (param0 == 7 ||
            param0 == 8) {
            var4Lifetime1 = -1;
            var5Lifetime1 = -1;
          }
          if (param0 == 11) {
            var4Lifetime1 = -1;
          }
          if (param0 == 12) {
            var5Lifetime1 = -1;
            var4Lifetime1 = -1;
          }
          if (param0 == 13) {
            var4Lifetime1 = 1;
            var5Lifetime1 = -1;
          }
          if (param0 == 14) {
            var4Lifetime1 = -1;
            var5Lifetime1 = 1;
          }
          if (15 == param0) {
            var5Lifetime1 = 1;
            var4Lifetime1 = 1;
          }
          FullscreenFailureReason.field_g = SocialTabsPanel.a(var4Lifetime1 * var2, -125, var5Lifetime1 * var2);
          return;
        }
        if (var3 >= 120) {
          var4Lifetime2 = param1;
          var5Lifetime2 = 0;
          if (param0 == 3) {
            var4Lifetime2 = -1;
          }
          if (param0 == 1) {
            var5Lifetime2 = 1;
          }
          if (param0 == 4) {
            var5Lifetime2 = 1;
            var4Lifetime2 = 1;
          }
          if (param0 == 5) {
            var5Lifetime2 = 1;
            var4Lifetime2 = -1;
          }
          if (param0 == 6) {
            var5Lifetime2 = -1;
            var4Lifetime2 = 1;
          }
          if (param0 == 7 ||
            param0 == 8) {
            var4Lifetime2 = -1;
            var5Lifetime2 = -1;
          }
          if (param0 == 11) {
            var4Lifetime2 = -1;
          }
          if (param0 == 12) {
            var5Lifetime2 = -1;
            var4Lifetime2 = -1;
          }
          if (param0 == 13) {
            var4Lifetime2 = 1;
            var5Lifetime2 = -1;
          }
          if (param0 == 14) {
            var4Lifetime2 = -1;
            var5Lifetime2 = 1;
          }
          if (15 == param0) {
            var5Lifetime2 = 1;
            var4Lifetime2 = 1;
          }
          FullscreenFailureReason.field_g = SocialTabsPanel.a(var4Lifetime2 * var2, -125, var5Lifetime2 * var2);
          return;
        }
        var3 = 120 - var3;
        var2Lifetime1 = -(var3 * var3 * 8192 / 3300) + 8192;
        var4Lifetime3 = param1;
        var5Lifetime3 = 0;
        if (param0 == 3) {
          var4Lifetime3 = -1;
        }
        if (param0 == 1) {
          var5Lifetime3 = 1;
        }
        if (param0 == 4) {
          var5Lifetime3 = 1;
          var4Lifetime3 = 1;
        }
        if (param0 == 5) {
          var5Lifetime3 = 1;
          var4Lifetime3 = -1;
        }
        if (param0 == 6) {
          var5Lifetime3 = -1;
          var4Lifetime3 = 1;
        }
        if (param0 == 7) {
          var4Lifetime3 = -1;
          var5Lifetime3 = -1;
        } else {
          if (param0 == 8) {
            var4Lifetime3 = -1;
            var5Lifetime3 = -1;
          }
        }
        if (param0 == 11) {
          var4Lifetime3 = -1;
        }
        if (param0 == 12) {
          var5Lifetime3 = -1;
          var4Lifetime3 = -1;
        }
        if (param0 == 13) {
          var4Lifetime3 = 1;
          var5Lifetime3 = -1;
        }
        if (param0 == 14) {
          var4Lifetime3 = -1;
          var5Lifetime3 = 1;
        }
        if (15 == param0) {
          var5Lifetime3 = 1;
          var4Lifetime3 = 1;
        }
        FullscreenFailureReason.field_g = SocialTabsPanel.a(var4Lifetime3 * var2Lifetime1, -125, var5Lifetime3 * var2Lifetime1);
        return;
    }

    final static void a(int param0) {
        FootballerAiOverlaySupport.field_d.b(9, (byte) -52);
        if (param0 != -1822) {
          MouseWheelInput.a(-16, -37);
          LoginText.field_e = true;
          return;
        }
        LoginText.field_e = true;
    }

    abstract void detach(byte param0, java.awt.Component param1);

    abstract void attach(byte param0, java.awt.Component param1);

    abstract int pollRotation(byte param0);

    static {
        field_f = true;
        field_c = new long[1000];
        field_d = "Exp: <%0>";
    }
}
