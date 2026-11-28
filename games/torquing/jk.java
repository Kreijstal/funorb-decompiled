/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class jk {
    static int field_a;
    static String field_b;

    final static void a(byte param0) {
        RuntimeException decompiledCaughtException = null;
        int var1_int = 0;
        RuntimeException var1 = null;
        int var2 = 0;
        int var3 = 0;
        String var4 = null;
        MenuScreen var5 = null;
        var3 = Torquing.field_u;
        try {
          hj.field_c.drawOpaque(0, 0);
          if (SocketJs5Transport.field_r >= 35) {
            if (SocketJs5Transport.field_r >= 70) {
              SingleChildWidgetContainer.field_B.drawTranslucentSprite(false, 0, 0);
              ResourceArchive.field_j.draw(je.field_a - ResourceArchive.field_j.field_s / 2, -(ResourceArchive.field_j.field_t / 2) + kc.field_v);
              jb.field_b.drawFramedPanel((byte) 81, 0, nn.field_e);
              nh.field_l.drawOpaque(0, nn.field_e);
              var5 = vo.field_f[0];
              for (var2 = 0; var2 < var5.field_a.field_i; var2++) {
                if (var5.c(4, var2)) {
                  var5.a(false, var5.a(23, var2) + nn.field_e, var2, 0);
                }
              }
              AlphaWidgetContainer.field_F.drawTranslucentSprite(false, hb.field_s, ra.field_e);
              VertexMesh.field_l.draw(hb.field_s, ra.field_e);
              cq.field_w.draw(0, nn.field_e);
            } else {
              AlphaWidgetContainer.field_F.drawTranslucentSprite(false, hb.field_s, ra.field_e);
              VertexMesh.field_l.draw(hb.field_s, ra.field_e);
              var1_int = ResourceArchive.field_j.field_s * MouseWheelInput.field_d / 100;
              var2 = ResourceArchive.field_j.field_t * MouseWheelInput.field_d / 100;
              ResourceArchive.field_j.drawScaled(-(var1_int / 2) + je.field_a, -(var2 / 2) + kc.field_v, var1_int, var2);
            }
          } else {
            AlphaWidgetContainer.field_F.drawTranslucentSprite(false, ub.field_E, ra.field_e);
            VertexMesh.field_l.b(4096, 1326547364, tj.field_l, ra.field_e + VertexMesh.field_l.field_t / 2, VertexMesh.field_l.field_s / 2 + ub.field_E);
          }
          SoftwareRasterizer.drawRectangleOutline(0, 0, 640, 480, 16777215);
          if (param0 >= -32) {
            var4 = (String) null;
            jk.a((String) null, (byte) -13, true);
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var1 = decompiledCaughtException;
          throw RichTextWidget.wrapThrowable((Throwable) ((Object) var1), "jk.B(" + param0 + ')');
        }
    }

    final static void a(String param0, byte param1, boolean param2) {
        try {
          if (param1 != -79) {
            jk.resetStaticState(81);
          }
          ArchiveRequest.field_t = param2;
          aq.field_c = true;
          IsaacCipher.field_m = new ProgressMessageDialog(dc.field_a, LoginPanel.field_E, param0, ff.field_a, ArchiveRequest.field_t);
          dc.field_a.showDialog(IsaacCipher.field_m, (byte) 112);
        } catch (RuntimeException runtimeException) {
          throw RichTextWidget.wrapThrowable((Throwable) ((Object) runtimeException), "jk.A(" + (param0 != null ? "{...}" : "null") + ',' + param1 + ',' + param2 + ')');
        }
    }

    public static void resetStaticState(int param0) {
        field_b = null;
        if (param0 != 0) {
          field_a = -53;
        }
    }

    static {
        field_a = 500;
        field_b = "Unable to connect to the data server. Please check any firewall you are using.";
    }
}
