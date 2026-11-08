/*
 * Decompiled by CFR-JS 0.4.0.
 */
abstract class ArchiveRequest extends DualLinkNode {
    static int field_y;
    boolean field_v;
    boolean field_w;
    static int field_s;
    static BoundedUrlRequest field_p;
    static SpriteWidget field_r;
    static ModelMesh field_x;
    static int[][] field_q;
    volatile boolean field_t;
    static int[] field_u;
    static String field_o;

    abstract int getProgress(int param0);

    public static void releaseStatics(int param0) {
        field_u = null;
        field_q = (int[][]) null;
        field_p = null;
        field_r = null;
        if (param0 != -30419) {
          return;
        }
        field_o = null;
        field_x = null;
    }

    final static void updateQuickChatMenu(boolean param0, int param1, int param2, int param3) {
        int var4;
        int var5;
        int var5Lifetime1;
        if (!ChatPanelUpdateHelpers.field_e) {
          return;
        }
        LogoRenderHelpers.field_h.updateInputFullScreen(param0, (byte) 97);
        if (param3 != 5) {
          return;
        }
        var4 = Js5Transport.field_v.hasPressedItem(-9184) ? 1 : 0;
        if (0 != MenuScreen.field_g &&
          var4 == 0) {
          param0 = false;
          TextDecodeHelpers.closeModalIfOpen((byte) -119);
        }
        if (!param0) {
          if (var4 == 0) {
            var5 = Js5Transport.field_v.getChainWidth(-10) + Js5Transport.field_v.field_Bb;
            if (var5 > 640) {
              ReflectionCheck.field_o = ReflectionCheck.field_o + 5;
              return;
            }
            if (var5 >= 635) {
              return;
            }
            if (ReflectionCheck.field_o <= 0) {
              return;
            }
            ReflectionCheck.field_o = ReflectionCheck.field_o - 5;
            return;
          }
          LogoRenderHelpers.field_h.updateInputFullScreen(param0, (byte) 126);
        } else {
          Js5Transport.field_v.processPressedItems(param1, -80, param2);
          if (var4 != 0) {
            LogoRenderHelpers.field_h.updateInputFullScreen(param0, (byte) 126);
          }
        }
        var5Lifetime1 = Js5Transport.field_v.getChainWidth(-10) + Js5Transport.field_v.field_Bb;
        if (var5Lifetime1 > 640) {
          ReflectionCheck.field_o = ReflectionCheck.field_o + 5;
          return;
        }
        if (var5Lifetime1 >= 635) {
          return;
        }
        if (ReflectionCheck.field_o <= 0) {
          return;
        }
        ReflectionCheck.field_o = ReflectionCheck.field_o - 5;
        return;
    }

    final static void addQuickChatWidget(boolean param0, QuickChatMenu param1) {
        try {
          if (param0) {
            QuickChatMenu var3 = (QuickChatMenu) null;
            ArchiveRequest.addQuickChatWidget(false, (QuickChatMenu) null);
          }
          LogoRenderHelpers.field_h.addChild(0, param1);
        } catch (RuntimeException runtimeException) {
          throw AsyncCheckResult.wrapException((Throwable) ((Object) runtimeException), "nb.E(" + param0 + ',' + (param1 != null ? "{...}" : "null") + ')');
        }
    }

    abstract byte[] getBytes(byte param0);

    ArchiveRequest() {
        this.field_t = true;
    }

    static {
        field_y = 250;
        field_u = new int[]{2, 14, 15, 6, 5, 16, 17, 18, 12};
        field_o = "Remove <%0> from friend list";
    }
}
