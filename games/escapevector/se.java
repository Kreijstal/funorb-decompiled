/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class se {
    static String[] field_a;
    static p field_b;

    public static void releaseStatics(byte guard) {
        if (guard != 23) {
          field_a = (String[]) null;
          field_a = null;
          field_b = null;
          return;
        }
        field_a = null;
        field_b = null;
    }

    final static int a(int param0) {
        if (param0 != 0) {
          field_b = (p) null;
          return (int)(1000000000L / sn.field_d);
        }
        return (int)(1000000000L / sn.field_d);
    }

    final static void a(boolean param0, int param1) {
        if (param1 != 17113) {
          field_a = (String[]) null;
          Checkbox.field_F.render(0, 0, (byte) -55);
          return;
        }
        Checkbox.field_F.render(0, 0, (byte) -55);
    }

    final static void writeBrowserSessionMarker(byte guard, java.applet.Applet applet) {
        String stackIn_6_2 = null;
        try {
          BrowserSessionMarkerState.markerSet = true;
          String var2 = "tuhstatbut";
          String var3 = "rvnadlm";
          long var4 = -1L;
          DialogueScreen.writeCookie((byte) 71, applet, var2, var3, var4);
          if (guard > 1) {
            return;
          }
          field_a = (String[]) null;
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          RuntimeException decompiledCaughtException = decompiledCaughtParameter0;
          RuntimeException var2_ref = decompiledCaughtException;
          RuntimeException stackIn_5_0 = var2_ref;
          StringBuilder stackIn_5_1 = new StringBuilder().append("se.D(").append(guard).append(',');
          if (applet == null) {
            stackIn_6_2 = "null";
          } else {
            stackIn_6_2 = "{...}";
          }
          throw MainMenuScreen.wrapClientException((Throwable) ((Object) stackIn_5_0), ((StringBuilder) (Object) stackIn_5_1).append(stackIn_6_2).append(')').toString());
        }
    }

    static {
        field_a = new String[]{"We are entering the aliens' home system now.<br><br>The first destination is an <photo>asteroid belt on the edge of the system. Our long-range analysis has suggested that the asteroids were only excavated recently, so defences are likely to be minimal.", "When you find a container, land next to it. Your ship's tether will automatically attach to it. Guide it out of the cave and up to the mothership.<delay><br><br>Good luck, commander."};
    }
}
