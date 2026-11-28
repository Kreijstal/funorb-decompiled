/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class ji {
    static ProgressDialog field_a;
    static String field_b;

    final static void a(boolean param0) {
        eh var1 = (eh) (UiWidget.field_g.removeLast(-48));
        if (var1 == null) {
          var1 = new eh();
        }
        if (param0) {
          var1.a(SoftwareRasterizer.field_l, SoftwareRasterizer.field_h, SoftwareRasterizer.field_g, 107, SoftwareRasterizer.field_a, SoftwareRasterizer.field_b, SoftwareRasterizer.field_j, SoftwareRasterizer.field_f);
          AgeValidator.field_k.addLast(var1, 27362);
          return;
        }
        ji.a(false);
        var1.a(SoftwareRasterizer.field_l, SoftwareRasterizer.field_h, SoftwareRasterizer.field_g, 107, SoftwareRasterizer.field_a, SoftwareRasterizer.field_b, SoftwareRasterizer.field_j, SoftwareRasterizer.field_f);
        AgeValidator.field_k.addLast(var1, 27362);
    }

    static long bitwiseXor(long param0, long param1) {
        return param0 ^ param1;
    }

    final static void a(int param0, int param1) {
        byte dupTemp$0 = 0;
        ResizableModalDialog.field_O.field_l[oj.field_c] = (short)(param0 >> 1);
        ResizableModalDialog.field_O.field_l[eb.field_d] = (short)(param0 >> 1);
        if (param1 == 24355) {
          dupTemp$0 = 0 != bc.bitwiseAnd(param0, 1) ? StripedProgressWidget.field_H : db.field_p;
          ResizableModalDialog.field_O.field_O[eb.field_d] = dupTemp$0;
          ResizableModalDialog.field_O.field_O[oj.field_c] = dupTemp$0;
          return;
        }
        field_b = (String) null;
        byte dupTemp$1 = 0 != bc.bitwiseAnd(param0, 1) ? StripedProgressWidget.field_H : db.field_p;
        ResizableModalDialog.field_O.field_O[eb.field_d] = dupTemp$1;
        ResizableModalDialog.field_O.field_O[oj.field_c] = dupTemp$1;
    }

    final static void a(byte param0, RgbSprite[] param1) {
        MeshData var19 = null;
        int var3 = 0;
        int var4 = 0;
        int var5 = 0;
        int var6 = 0;
        int var7 = 0;
        int var8 = 0;
        int var9 = 0;
        int var10 = 0;
        int var11 = 0;
        int var12 = 0;
        int var13 = 0;
        int var14 = 0;
        int var15 = 0;
        int var16 = 0;
        int var17 = 0;
        int var18 = 0;
        try {
          DiskArchiveRequest.field_p = new cf(param1);
          TriangleRasterizer.useRasterClip();
          TriangleRasterizer.setTextureProvider(DiskArchiveRequest.field_p);
          TriangleRasterizer.rebuildPaletteWithGamma(1.0f);
          var19 = new MeshData(16, 8, 4);
          var3 = FullscreenNoticeType.a(var19, 0, 0, 0, (byte) -72);
          var4 = FullscreenNoticeType.a(var19, 0, 1, 0, (byte) -93);
          var5 = FullscreenNoticeType.a(var19, 0, 0, 1, (byte) -87);
          var6 = FullscreenNoticeType.a(var19, 0, 1, 1, (byte) -122);
          var7 = FullscreenNoticeType.a(var19, 1, 0, 0, (byte) -61);
          var8 = FullscreenNoticeType.a(var19, 1, 1, 0, (byte) -84);
          var9 = FullscreenNoticeType.a(var19, 1, 0, 1, (byte) -90);
          var10 = FullscreenNoticeType.a(var19, 1, 1, 1, (byte) -122);
          var11 = FullscreenNoticeType.a(var19, 2, 0, 0, (byte) -52);
          var12 = FullscreenNoticeType.a(var19, 0, 0, 2, (byte) -53);
          var13 = FullscreenNoticeType.a(var19, 0, 0, -1, (byte) -98);
          var14 = FullscreenNoticeType.a(var19, 1, 1, -1, (byte) -60);
          var15 = FullscreenNoticeType.a(var19, -1, 1, 0, (byte) -111);
          var16 = FullscreenNoticeType.a(var19, 2, 0, -1, (byte) -118);
          var17 = FullscreenNoticeType.a(var19, -1, 1, -1, (byte) -94);
          var18 = FullscreenNoticeType.a(var19, 1, 1, 2, (byte) -82);
          var19.addFace(var6, var5, var4, (byte) 1, (byte) -1, (short) 63, (short) -1);
          var19.addFace(var4, var5, var3, (byte) 1, (byte) -1, (short) 63, (short) -1);
          var19.addFace(var9, var10, var7, (byte) 1, (byte) -1, (short) 63, (short) -1);
          var19.addFace(var7, var10, var8, (byte) 1, (byte) -1, (short) 63, (short) -1);
          cf.field_d = var19.addTextureTriangle((short) var3, (short) var11, (short) var12);
          db.field_p = var19.addTextureTriangle((short) var8, (short) var15, (short) var18);
          AccountRequestState.field_a = var19.addTextureTriangle((short) var13, (short) var16, (short) var5);
          StripedProgressWidget.field_H = var19.addTextureTriangle((short) var14, (short) var17, (short) var10);
          ModalDialog.field_F = var19.addFace(var3, var5, var7, (byte) 1, cf.field_d, (short) 0, (short) 0);
          if (param0 >= -87) {
            ji.a(-42);
          }
          od.field_a = var19.addFace(var7, var5, var9, (byte) 1, cf.field_d, (short) 0, (short) 0);
          eb.field_d = var19.addFace(var4, var10, var6, (byte) 1, db.field_p, (short) 1, (short) 1);
          oj.field_c = var19.addFace(var8, var10, var4, (byte) 1, db.field_p, (short) 1, (short) 1);
          ResizableModalDialog.field_O = (SoftwareModelMesh) (var19.createModel(127, 65535, -1, 0, 0));
          ResizableModalDialog.field_O.field_h = qa.a(-100, var19.field_d);
          ResizableModalDialog.field_O.field_u = qa.a(-36, var19.field_B);
          ResizableModalDialog.field_O.field_U = qa.a(-107, var19.field_z);
          ResizableModalDialog.field_O.field_O = var19.field_c;
        } catch (RuntimeException runtimeException) {
          throw ma.wrapException((Throwable) ((Object) runtimeException), "ji.A(" + param0 + ',' + (param1 != null ? "{...}" : "null") + ')');
        }
    }

    public static void a(int param0) {
        field_b = null;
        if (param0 >= -15) {
          RgbSprite[] var2 = (RgbSprite[]) null;
          ji.a((byte) -45, (RgbSprite[]) null);
          field_a = null;
          return;
        }
        field_a = null;
    }

    static {
    }
}
