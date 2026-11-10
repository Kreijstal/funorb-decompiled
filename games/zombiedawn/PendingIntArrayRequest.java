/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class PendingIntArrayRequest extends IntrusiveNode {
    static int field_l;
    int[] field_k;
    boolean field_o;
    static CoverageBitmapFont field_j;
    static java.applet.Applet field_m;
    static ClientProtocolStage field_n;
    static int field_q;
    static int[] field_p;
    static boolean field_h;
    static String field_i;

    final static void flushOutgoingPackets(int param0, int param1) {
        RuntimeException decompiledCaughtException = null;
        long var2_long = 0L;
        int var2_int = 0;
        RuntimeException var2 = null;
        int var4 = 0;
        int var6 = 0;
        DelayedPacket var6_ref_bg = null;
        int var7 = 0;
        byte[] var8 = null;
        DelayedPacket var9 = null;
        int var10 = 0;
        byte[] var11 = null;
        DelayedPacket var13 = null;
        byte[] var14 = null;
        byte[] var17 = null;
        int var6Lifetime1;
        var7 = ZombieDawn.field_J;
        try {
          if (ThreeSliceButtonPainter.field_w != 0) {
            var2_long = MonotonicClock.monotonicTimeMillis(-22826);
            var4 = ThreeSliceButtonPainter.field_w;
            if (LoginPromptTexts.field_d != 0.0) {
              var4 = (int)((double)var4 + SessionSocketHelpers.field_b.nextGaussian() * LoginPromptTexts.field_d);
              if (0 > var4) {
                var4 = 0;
              }
            }
            if (LinkTextPainter.field_e.position > 0) {
              var14 = new byte[LinkTextPainter.field_e.position];
              var11 = var14;
              var8 = var11;
              var17 = var8;
              for (var6 = 0; var14.length > var6; var6++) {
                var8[var6] = LinkTextPainter.field_e.payload[var6];
              }
              var6_ref_bg = new DelayedPacket((long)var4 + var2_long, LinkTextPainter.field_e.position, var17);
              Js5Archive.field_m.addFirst(0, var6_ref_bg);
              LinkTextPainter.field_e.position = 0;
            }
            var9 = (DelayedPacket) (Js5Archive.field_m.last((byte) 26));
            var13 = var9;
            if (var13 != null &&
              var2_long > var13.field_h) {
              var13.unlink(-27598);
              var10 = 0;
              var6Lifetime1 = var10;
              while (var13.field_j > var10) {
                LinkTextPainter.field_e.payload[var10] = var9.field_m[var10];
                var10++;
              }
              LinkTextPainter.field_e.position = var13.field_j;
            }
          }
          CheckboxPainter.flushOutgoingPackets((byte) -46, param0);
          var2_int = -68 % ((param1 - 1) / 43);
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2 = decompiledCaughtException;
          throw ExceptionWrapper.wrapException((Throwable) ((Object) var2), "b.B(" + param0 + ',' + param1 + ')');
        }
    }

    public static void releaseStatics(byte param0) {
        field_n = null;
        field_i = null;
        field_j = null;
        field_m = null;
        field_p = null;
        if (param0 != -47) {
          PendingIntArrayRequest.flushOutgoingPackets(-22, -89);
        }
    }

    PendingIntArrayRequest() {
        this.field_o = false;
    }

    static {
        field_l = 480;
        field_q = -1;
        field_n = new ClientProtocolStage();
        field_h = false;
        field_i = "Player Name: ";
    }
}
