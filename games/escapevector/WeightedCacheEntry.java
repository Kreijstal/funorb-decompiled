/*
 * Decompiled by CFR-JS 0.4.0.
 */
abstract class WeightedCacheEntry extends DualLinkNode {
    int weight;
    static String field_r;
    static String field_s;

    abstract boolean isSoft(byte guard);

    abstract Object getValue(byte guard);

    public static void releaseStatics(int guard) {
        field_s = null;
        field_r = null;
        if (guard != 0) {
          java.net.URL var2 = (java.net.URL) null;
          WeightedCacheEntry.withSessionParameters((byte) -113, (java.applet.Applet) null, (java.net.URL) null);
        }
    }

    final static LoginMethod readLastLoginMethod(byte guard, java.applet.Applet applet) {
        LoginMethod var5 = null;
        String stackIn_18_2 = null;
        int var6 = EscapeVector.obfuscationControl;
        try {
          String var2 = ProgressQuery.readCookie((byte) 90, "jagex-last-login-method", applet);
          if (guard != -1) {
            LoginMethod stackIn_3_0 = (LoginMethod) null;
            return stackIn_3_0;
          }
          if (var2 == null) {
            LoginMethod stackIn_6_0 = PathPoint.field_g;
            return stackIn_6_0;
          }
          LoginMethod[] var3 = BoundedRandomAccessFile.a(false);
          int var4 = 0;
          while (true) {
            if (var3.length <= var4) {
              LoginMethod stackIn_14_0 = PathPoint.field_g;
              return stackIn_14_0;
            }
            var5 = var3[var4];
            if (!var5.matchesName(var2, (byte) 119)) {
              var4++;
              continue;
            }
            break;
          }
          LoginMethod stackIn_11_0 = var5;
          return stackIn_11_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          RuntimeException decompiledCaughtException = decompiledCaughtParameter0;
          RuntimeException var2_ref = decompiledCaughtException;
          RuntimeException stackIn_17_0 = var2_ref;
          StringBuilder stackIn_17_1 = new StringBuilder().append("sh.C(").append(guard).append(',');
          if (applet == null) {
            stackIn_18_2 = "null";
          } else {
            stackIn_18_2 = "{...}";
          }
          throw MainMenuScreen.wrapClientException((Throwable) ((Object) stackIn_17_0), ((StringBuilder) (Object) stackIn_17_1).append(stackIn_18_2).append(')').toString());
        }
    }

    WeightedCacheEntry(int weight) {
        this.weight = weight;
    }

    final static java.net.URL withSessionParameters(byte guard, java.applet.Applet applet, java.net.URL url) {
        Object var3 = null;
        String stackIn_14_2 = null;
        String stackIn_17_2 = null;
        try {
          var3 = null;
          Object var4 = null;
          if (guard < 11) {
            java.net.URL stackIn_2_0 = (java.net.URL) null;
            return stackIn_2_0;
          }
          if (null != MenuEdgeSegment.field_p &&
            !MenuEdgeSegment.field_p.equals(applet.getParameter("settings"))) {
            var3 = MenuEdgeSegment.field_p;
            var4 = var3;
            var4 = var3;
          }
          if (TileSpriteCacheEntry.field_i != null &&
            !TileSpriteCacheEntry.field_i.equals(applet.getParameter("session"))) {
            var4 = TileSpriteCacheEntry.field_i;
          }
          java.net.URL stackIn_10_0 = RasterBuffer.a((String) (var4), -1, (String) (var3), url, 1);
          return stackIn_10_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          RuntimeException decompiledCaughtException = decompiledCaughtParameter0;
          var3 = decompiledCaughtException;
          Object stackIn_13_0 = var3;
          StringBuilder stackIn_13_1 = new StringBuilder().append("sh.A(").append(guard).append(',');
          if (applet == null) {
            stackIn_14_2 = "null";
          } else {
            stackIn_14_2 = "{...}";
          }
          StringBuilder stackIn_16_1 = ((StringBuilder) (Object) stackIn_13_1).append(stackIn_14_2).append(',');
          if (url == null) {
            stackIn_17_2 = "null";
          } else {
            stackIn_17_2 = "{...}";
          }
          throw MainMenuScreen.wrapClientException((Throwable) (stackIn_13_0), ((StringBuilder) (Object) stackIn_16_1).append(stackIn_17_2).append(')').toString());
        }
    }

    static {
        field_r = "Escape Vector Expansion";
        field_s = "Retry";
    }
}
