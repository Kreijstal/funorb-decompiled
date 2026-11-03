/*
 * Decompiled by CFR-JS 0.4.0.
 */
import java.util.*;

final class wo {
    static int field_d;
    TabbedPanel field_g;
    static String field_e;
    static String field_b;
    static String field_a;
    static byte[][] field_f;
    static Sprite field_c;
    static int field_h;

    wo(String param0, SceneWidget param1) {
        String[] var3 = null;
        SceneWidget[] var4 = null;
        try {
          var3 = new String[]{param0, NameSuggestionsPanel.field_J, fl.field_c};
          var4 = new SceneWidget[]{param1, wa.field_f, (SceneWidget) ((Object) MouseWheelHandler.field_e)};
          this.field_g = new TabbedPanel(0L, ab.field_a, var3, AccountMessagePanel.field_J, var4, 0);
        } catch (RuntimeException runtimeException) {
          throw aa.addExceptionContext((Throwable) ((Object) runtimeException), "wo.<init>(" + (param0 != null ? "{...}" : "null") + ',' + (param1 != null ? "{...}" : "null") + ')');
        }
    }

    final static void a(int param0, int param1) {
        if (param1 <= -11) {
          wa.field_b = 1000000000L / (long)param0;
          return;
        }
        Random var3 = (Random) null;
        wo.a(-98, -125, (Random) null, (byte) -68);
        wa.field_b = 1000000000L / (long)param0;
    }

    final static MenuScreen b(int param0, int param1) {
        int var2 = -108 / ((34 - param0) / 49);
        return StripedProgressBar.field_H[param1];
    }

    final static Puzzle a(int param0, int param1, Random param2, byte param3) {
        int var4_int = 0;
        RuntimeException var4 = null;
        int stackIn_4_0 = 0;
        Puzzle stackIn_9_0 = null;
        Puzzle stackIn_11_0 = null;
        RuntimeException stackIn_14_0 = null;
        StringBuilder stackIn_14_1 = null;
        String stackIn_15_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          var4_int = 0;
          if (param0 == 1) {
            stackIn_4_0 = (JavaRandomHelpers.a(param2, -108, 4) != 0) ? 0 : 1;
            var4_int = stackIn_4_0;
          }
          if (2 == param0) {
            var4_int = 1;
          }
          if (param3 == 116) {
            stackIn_11_0 = mc.a(param2, param1, var4_int != 0, MarkerSlider.field_Y[param0], -67);
            return stackIn_11_0;
          }
          stackIn_9_0 = (Puzzle) null;
          return stackIn_9_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var4 = decompiledCaughtException;
          stackIn_14_0 = var4;
          stackIn_14_1 = new StringBuilder().append("wo.G(").append(param0).append(',').append(param1).append(',');
          if (param2 == null) {
            stackIn_15_2 = "null";
          } else {
            stackIn_15_2 = "{...}";
          }
          throw aa.addExceptionContext((Throwable) ((Object) stackIn_14_0), ((StringBuilder) (Object) stackIn_14_1).append(stackIn_15_2).append(',').append(param3).append(')').toString());
        }
    }

    final void a(int param0, int param1, int param2, int param3, int param4) {
        int var6 = 24;
        int var7 = param4;
        this.field_g.a(-19360, param2, var7, param0, param1, var6, param3);
        SceneWidget.field_E.setBounds(0, fq.field_q, 0, param4 ^ 261, wa.field_f.field_K);
        EmailConfirmationValidator.field_u.setBounds(fq.field_q + 2, 18, 0, 256, -2 + (-DelegatingCanvas.field_b + (wa.field_f.field_K - 2) - 80));
        Vector3.field_e.setBounds(fq.field_q + 2, 18, -80 + (-2 + (-DelegatingCanvas.field_b + wa.field_f.field_K)), 256, 82 + DelegatingCanvas.field_b);
        ScoreMarkerBar.field_z.a(0, wa.field_f.field_K, 20, fq.field_q + 2 + 20, false, DelegatingCanvas.field_b, 2, -fq.field_q + wa.field_f.height - 22);
        MouseWheelHandler.field_e.a(20, true, 2, DelegatingCanvas.field_b);
    }

    public static void releaseStatics(boolean param0) {
        field_e = null;
        field_a = null;
        field_f = (byte[][]) null;
        if (param0) {
          field_b = null;
          field_c = null;
          return;
        }
        field_b = (String) null;
        field_b = null;
        field_c = null;
    }

    final static void c(int param0, int param1) {
        CipherPacketBuffer var2 = null;
        CipherPacketBuffer var2Lifetime1;
        if (param0 == -1) {
          var2 = aa.field_f;
          var2.writeOpcode(param1, 15514);
          var2.writeByte(160, 1);
          var2.writeByte(160, 3);
          return;
        }
        field_f = (byte[][]) null;
        var2Lifetime1 = aa.field_f;
        var2Lifetime1.writeOpcode(param1, 15514);
        var2Lifetime1.writeByte(160, 1);
        var2Lifetime1.writeByte(160, 3);
    }

    final static void a(int param0) {
        Sprite var1 = null;
        int var2 = 0;
        int var3 = Pixelate.field_H ? 1 : 0;
        try {
          var1 = new Sprite(50, 30);
          Match.field_l = new Sprite[param0];
          for (var2 = 3; var2 > 0; var2--) {
            var1.makeRasterTarget();
            SoftwareRasterizer.clear();
            rk.field_e.drawCentered(Integer.toString(var2), SoftwareRasterizer.field_j >> 1, SoftwareRasterizer.field_d, 0, -1);
            Match.field_l[-var2 + 3] = new Sprite(150, 90);
            Match.field_l[3 - var2].makeRasterTarget();
            var1.drawScaled(0, 0, SoftwareRasterizer.field_j, SoftwareRasterizer.field_d);
          }
          ClientException.field_f.bindRaster(param0 ^ 19695);
          ArrayWidgetContainer.field_J = rk.field_e.textWidth(IntrusiveDeque.field_e);
          Js5Transport.field_n = rk.field_e.textWidth(SoundCache.field_j);
        } catch (RuntimeException runtimeException) {
          throw aa.addExceptionContext((Throwable) ((Object) runtimeException), "wo.A(" + param0 + ')');
        }
    }

    final static FullscreenFocusCanvas a(PlatformTaskDispatcher param0, int param1, int param2, int param3, int param4, int param5) {
        java.awt.Frame var6 = null;
        RuntimeException var6_ref = null;
        FullscreenFocusCanvas var7 = null;
        java.awt.Frame var8 = null;
        FullscreenFocusCanvas stackIn_2_0 = null;
        FullscreenFocusCanvas stackIn_7_0 = null;
        RuntimeException stackIn_10_0 = null;
        StringBuilder stackIn_10_1 = null;
        String stackIn_11_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          var8 = TextWidgetPainter.openFullscreenFrame(param0, param5, param4, param2, param3, true);
          var6 = var8;
          if (param1 != 150) {
            stackIn_2_0 = (FullscreenFocusCanvas) null;
            return stackIn_2_0;
          }
          if (var8 == null) {
            return null;
          }
          var7 = new FullscreenFocusCanvas();
          var7.field_f = var8;
          var7.field_f.add((java.awt.Component) ((Object) var7));
          var7.setBounds(0, 0, param4, param2);
          var7.addFocusListener(var7);
          var7.requestFocus();
          stackIn_7_0 = var7;
          return stackIn_7_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var6_ref = decompiledCaughtException;
          stackIn_10_0 = var6_ref;
          stackIn_10_1 = new StringBuilder().append("wo.B(");
          if (param0 == null) {
            stackIn_11_2 = "null";
          } else {
            stackIn_11_2 = "{...}";
          }
          throw aa.addExceptionContext((Throwable) ((Object) stackIn_10_0), ((StringBuilder) (Object) stackIn_10_1).append(stackIn_11_2).append(',').append(param1).append(',').append(param2).append(',').append(param3).append(',').append(param4).append(',').append(param5).append(')').toString());
        }
    }

    static {
        field_a = "No highscores";
        field_e = "CRC mismatch - unable to get a valid download. Please check any firewall/antivirus/filtering software.";
    }
}
