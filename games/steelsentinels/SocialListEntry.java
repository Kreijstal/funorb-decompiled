/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class SocialListEntry extends SceneWidget {
    SceneWidget field_cc;
    String field_dc;
    static int field_Wb;
    SceneWidget field_Ub;
    static SceneWidget[] field_Yb;
    static String field_Sb;
    int field_bc;
    String field_Tb;
    String field_Vb;
    static RgbSprite[] field_Zb;
    String field_ac;
    static String field_Xb;
    static String field_fc;
    SceneWidget field_ec;

    public static void releaseStatics(boolean param0) {
        field_Yb = null;
        field_Zb = null;
        field_Xb = null;
        if (!param0) {
          field_fc = null;
          field_Sb = null;
          return;
        }
        byte[] var2 = (byte[]) null;
        SocialListEntry.a(false, (byte[]) null, 18);
        field_fc = null;
        field_Sb = null;
    }

    final static void a(int param0, ResourceArchive param1) {
        RgbSprite var2 = null;
        int var3 = 0;
        int var4 = 0;
        try {
          if (param0 < 54) {
            field_Xb = (String) null;
          }
          var2 = new RgbSprite(param1.a("", -742, "final_frame.jpg"), (java.awt.Component) ((Object) sl.field_n));
          var3 = var2.field_A;
          var4 = var2.field_F;
          ArchiveIndex.a(false);
          dj.field_c = new RgbSprite(var3, 3 * var4 / 4);
          dj.field_c.bindRasterTarget();
          var2.drawOpaque(0, 0);
          BattleTerrain.field_k = new RgbSprite(var3, -dj.field_c.field_F + var4);
          BattleTerrain.field_k.bindRasterTarget();
          var2.drawOpaque(0, -dj.field_c.field_F);
          BattleTerrain.field_k.field_H = dj.field_c.field_F;
          MatchingTextValidator.$cfr$intArgs$f$20d51497949f(107);
        } catch (RuntimeException runtimeException) {
          throw ci.a((Throwable) ((Object) runtimeException), "ah.C(" + param0 + ',' + (param1 != null ? "{...}" : "null") + ')');
        }
    }

    SocialListEntry() {
        super(0L, (SceneWidget) null);
    }

    final static Object a(boolean param0, byte[] param1, int param2) {
        DirectByteStorage var3 = null;
        RuntimeException var3_ref = null;
        DirectByteStorage stackIn_5_0 = null;
        byte[] stackIn_10_0 = null;
        byte[] stackIn_12_0 = null;
        RuntimeException stackIn_15_0 = null;
        StringBuilder stackIn_15_1 = null;
        String stackIn_16_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          if (param1 == null) {
            return null;
          }
          if (136 < param1.length) {
            var3 = new DirectByteStorage();
            ((ByteStorage) ((Object) var3)).setBytes((byte) -62, param1);
            stackIn_5_0 = var3;
            return stackIn_5_0;
          }
          if (param2 != 0) {
            field_Wb = -90;
          }
          if (param0) {
            stackIn_12_0 = ValidationHelpWidget.a((byte) 89, param1);
            return stackIn_12_0;
          }
          stackIn_10_0 = (byte[]) (param1);
          return stackIn_10_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3_ref = decompiledCaughtException;
          stackIn_15_0 = var3_ref;
          stackIn_15_1 = new StringBuilder().append("ah.D(").append(param0).append(',');
          if (param1 == null) {
            stackIn_16_2 = "null";
          } else {
            stackIn_16_2 = "{...}";
          }
          throw ci.a((Throwable) ((Object) stackIn_15_0), ((StringBuilder) (Object) stackIn_15_1).append(stackIn_16_2).append(',').append(param2).append(')').toString());
        }
    }

    final static void a(boolean param0, int param1) {
        ResourceArchive var3;
        ResourceArchive var3Lifetime1;
        if (SentinelCommand.field_t <= 0) {
          if (bd.field_c > 0) {
            if (GzipDecoder.field_c) {
              SoftwareRaster.halveBrightnessRectangle(0, 0, SoftwareRaster.field_c, DisplayNameForm.field_V.field_cb);
              UsernameCredentials.field_r.a(param0, (byte) 127);
            }
          } else {
            if (fj.field_f > 0 &&
              GzipDecoder.field_c) {
              SoftwareRaster.halveBrightnessRectangle(0, 0, SoftwareRaster.field_c, DisplayNameForm.field_V.field_cb);
              UsernameCredentials.field_r.a(param0, (byte) 127);
            }
          }
        } else {
          if (!im.field_b) {
            if ((!(bd.field_c <= 0) ||
              !(fj.field_f <= 0)) &&
              GzipDecoder.field_c) {
              SoftwareRaster.halveBrightnessRectangle(0, 0, SoftwareRaster.field_c, DisplayNameForm.field_V.field_cb);
              UsernameCredentials.field_r.a(param0, (byte) 127);
            }
          } else {
            SoftwareRaster.halveBrightnessRectangle(0, 0, SoftwareRaster.field_c, DisplayNameForm.field_V.field_cb);
            TeamColourTinter.field_b.a(param0, (byte) 127);
            if (bd.field_c <= 0 &&
              fj.field_f <= 0) {
              if (param1 <= -25) {
                return;
              }
              var3 = (ResourceArchive) null;
              SocialListEntry.a(87, (ResourceArchive) null);
              return;
            }
            if (GzipDecoder.field_c) {
              SoftwareRaster.halveBrightnessRectangle(0, 0, SoftwareRaster.field_c, DisplayNameForm.field_V.field_cb);
              UsernameCredentials.field_r.a(param0, (byte) 127);
            }
          }
        }
        if (param1 <= -25) {
          return;
        }
        var3Lifetime1 = (ResourceArchive) null;
        SocialListEntry.a(87, (ResourceArchive) null);
    }

    static {
        field_Xb = "Accept invitation to <%0>'s game";
        field_fc = "Searching for an opponent";
        field_Sb = "Continue";
    }
}
