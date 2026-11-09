/*
 * Decompiled by CFR-JS 0.4.0.
 */
abstract class RasterBuffer {
    int field_h;
    static String invalidPasswordText;
    int[] field_c;
    java.awt.Image field_f;
    static ts field_i;
    static int[] field_a;
    static int[] field_e;
    static String quitText;
    int field_b;

    public static void releaseStatics(byte param0) {
        field_a = null;
        field_e = null;
        quitText = null;
        invalidPasswordText = null;
        field_i = null;
        if (param0 < 33) {
          field_a = (int[]) null;
        }
    }

    final static int a(int param0, int param1) {
        if (param0 > -34) {
          return 14;
        }
        if (param1 < 0) {
          return -1;
        }
        if (param1 > 0) {
          return 1;
        }
        return param1;
    }

    abstract void a(java.awt.Component param0, int param1, int param2, int param3);

    abstract void a(int param0, int param1, java.awt.Graphics param2, int param3);

    final static void b(int param0) {
        int var1;
        int var2;
        var2 = Sumoblitz.field_L ? 1 : 0;
        StatusMessagePanel.field_A = false;
        SocketJs5Client.field_s = null;
        if (pg.field_a) {
          hc.field_c.e(false);
          if (param0 == 2) {
            return;
          }
          RasterBuffer.a(-6, -112);
          return;
        }
        var1 = jk.field_c;
        if (var1 > 0) {
          if (1 != var1) {
            SocketJs5Client.field_s = ic.a(ph.youHaveUnreadMessagesText, new String[]{Integer.toString(var1)}, (byte) -128);
          } else {
            SocketJs5Client.field_s = FullscreenMembershipDialog.youHave1UnreadText;
          }
          SocketJs5Client.field_s = HardwareReflectionEffect.a(false, new CharSequence[]{(CharSequence) ((Object) SocketJs5Client.field_s), (CharSequence) ((Object) "<br>"), (CharSequence) ((Object) LegacyOpenGlEnvironmentWaterEffect.visitTheAccountManagementText)});
        }
        hc.field_c.n(param0 ^ -5);
        SoftwareRenderBuffer.a(5178);
        if (param0 == 2) {
          return;
        }
        RasterBuffer.a(-6, -112);
        return;
    }

    final static bj a(int param0, String param1) {
        RuntimeException var2 = null;
        bj stackIn_7_0 = null;
        RuntimeException stackIn_10_0 = null;
        StringBuilder stackIn_10_1 = null;
        String stackIn_11_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          if (AffineTransform3D.field_o.a(true) &&
            !param1.equals(AffineTransform3D.field_o.b(66))) {
            AffineTransform3D.field_o = DroneDebris.a(false, param1);
          }
          if (param0 != 1) {
            quitText = (String) null;
          }
          stackIn_7_0 = AffineTransform3D.field_o;
          return stackIn_7_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2 = decompiledCaughtException;
          stackIn_10_0 = var2;
          stackIn_10_1 = new StringBuilder().append("ov.K(").append(param0).append(',');
          if (param1 == null) {
            stackIn_11_2 = "null";
          } else {
            stackIn_11_2 = "{...}";
          }
          throw ClientExceptionSupport.wrapWithContext((Throwable) ((Object) stackIn_10_0), ((StringBuilder) (Object) stackIn_10_1).append(stackIn_11_2).append(')').toString());
        }
    }

    final void a(int param0) {
        SoftwareRasterizer.setRaster(this.field_c, this.field_h, this.field_b);
        if (param0 != -1) {
          String var3 = (String) null;
          RasterBuffer.a(111, (String) null);
        }
    }

    static {
        invalidPasswordText = "Invalid password.";
        quitText = "Quit";
        field_e = new int[256];
        field_i = new ts(1, 2, 2, 0);
    }
}
