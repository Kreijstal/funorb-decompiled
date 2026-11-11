/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class fw {
    static String field_a;

    final static lp a(int param0, boolean param1) {
        lp var2 = (lp) (TrackMountComponent.field_J.get((byte) 61, (long)param0));
        if (var2 != null) {
          return var2;
        }
        byte[] var3 = GrowableIntList.field_g.a(param1, 0, param0);
        var2 = new lp();
        if (var3 != null) {
          var2.decode(-1, param0, new PacketBuffer(var3));
        }
        TrackMountComponent.field_J.put(29166, var2, (long)param0);
        return var2;
    }

    public static void releaseStatics(int param0) {
        field_a = null;
        if (param0 != 0) {
          fw.releaseStatics(-74);
        }
    }

    static {
        field_a = "TAB - hide chat temporarily";
    }
}
