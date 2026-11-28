/*
 * Decompiled by CFR-JS 0.4.0.
 */
class fd extends DualLinkNode {
    static RgbSprite field_m;
    static RgbSprite[] field_n;
    static String field_o;

    public static void a(boolean param0) {
        field_o = null;
        field_n = null;
        field_m = null;
        if (param0) {
          fd.c((byte) 32);
        }
    }

    final static void a(ResourceArchive param0, int param1) {
        VorbisSample var2 = null;
        try {
          if (param1 != -1) {
            ResourceArchive var3 = (ResourceArchive) null;
            fd.a((ResourceArchive) null, 94);
          }
          VorbisSample.decodeSetup(param0.getFileByName("headers.packvorbis", "", param1 - 72));
          var2 = VorbisSample.loadByName(param0, "jagex logo2.packvorbis", "");
          var2.decodeAllToPcm();
        } catch (RuntimeException runtimeException) {
          throw CipherPacketBuffer.wrapClientException((Throwable) ((Object) runtimeException), "fd.G(" + (param0 != null ? "{...}" : "null") + ',' + param1 + ')');
        }
    }

    fd() {
    }

    final static String c(byte param0) {
        String var1 = "";
        if (param0 == 61) {
          if (null != vk.field_c) {
            var1 = vk.field_c.a(0);
          }
          if (var1.length() == 0) {
            var1 = DraggableWidgetContainer.j(44);
          }
          if (var1.length() == 0) {
            var1 = ResizableModalDialog.field_H;
          }
          return var1;
        }
        field_o = (String) null;
        if (null != vk.field_c) {
          var1 = vk.field_c.a(0);
        }
        if (var1.length() == 0) {
          var1 = DraggableWidgetContainer.j(44);
        }
        if (var1.length() == 0) {
          var1 = ResizableModalDialog.field_H;
        }
        return var1;
    }

    static {
        field_o = "Type your password again to make sure it's correct";
    }
}
