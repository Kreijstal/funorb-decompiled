/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class gd {
    static int[] field_b;
    static String field_c;
    static String field_a;

    public static void clearStatics(int param0) {
        field_b = null;
        int var1 = 122 / ((param0 - 7) / 63);
        field_c = null;
        field_a = null;
    }

    final static void a(int param0) {
        int var2 = 0;
        if (null == va.field_d) {
          va.field_d = new Sprite[]{ProxyAuthenticationRequiredException.a(0, MusicVoice.field_w[0]), ProxyAuthenticationRequiredException.a(0, MusicVoice.field_w[1])};
        }
        SoftwareRasterizer.clear();
        int var1 = 240;
        wc.a(-27030, FleetTrailPoint.field_m << 1, -va.field_d[0].field_z + 640 >> 1, va.field_d[0], var1, 256);
        wc.a(-27030, -128 + (FleetTrailPoint.field_m << 1), -va.field_d[1].field_z + 640 >> 1, va.field_d[1], var1 + va.field_d[1].field_w, 256);
        if (!EmailValidator.field_r) {
          var2 = DerelictVictoryChecker.field_n.getGroupProgressByName("intro", (byte) 53);
          AttackTask.a((byte) 73, 455, 15, 16711680, 10, var2, 100);
        }
        if (param0 <= -63) {
          return;
        }
        gd.clearStatics(-96);
    }

    final static void a(int param0, int param1) {
        CipherPacketBuffer var2 = js.field_f;
        var2.h(param0, 255);
        var2.writeByte(param1, (byte) -123);
        var2.writeByte(0, (byte) -78);
    }

    final static void a(lq param0, int param1, int param2) {
        try {
          rs.field_Bb.addLast((byte) -113, param0);
          if (param1 != 1500005281) {
            gd.clearStatics(66);
          }
          wj.a(320, param2, param0);
        } catch (RuntimeException runtimeException) {
          throw UrlLoader.wrapThrowable((Throwable) ((Object) runtimeException), "gd.D(" + (param0 != null ? "{...}" : "null") + ',' + param1 + ',' + param2 + ')');
        }
    }

    static {
        field_b = new int[1024];
        field_c = "Name";
        field_a = null;
    }
}
