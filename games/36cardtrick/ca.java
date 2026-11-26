/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class ca {
    static int field_b;
    static int[] field_c;
    static int field_a;
    static int field_d;

    final static void a(String param0, boolean param1, int param2) {
        try {
          ij.field_g = param1;
          r.field_p = true;
          if (param2 != 16777215) {
            PcmStreamMixer var4 = (PcmStreamMixer) null;
            ca.a((qk) null, (PcmStreamMixer) null, -27, -28);
          }
          Crc32Table.field_a = new af(sd.field_c, vd.field_p, param0, DirectByteArrayStore.field_e, ij.field_g);
          sd.field_c.b(Crc32Table.field_a, (byte) -98);
        } catch (RuntimeException runtimeException) {
          throw ma.wrapException((Throwable) ((Object) runtimeException), "ca.B(" + (param0 != null ? "{...}" : "null") + ',' + param1 + ',' + param2 + ')');
        }
    }

    final static void a(qk param0, PcmStreamMixer param1, int param2, int param3) {
        try {
          vb.field_b = SecondaryNodeDeque.a(22018) * param2 / 1000;
          ch.a(-114, param0);
          kk.a(-16998, param0);
          ab.a(param0, 0);
          pf.d(260);
          ri.a((byte) -124);
          h.field_F = param3 - vb.field_b;
        } catch (RuntimeException runtimeException) {
          throw ma.wrapException((Throwable) ((Object) runtimeException), "ca.D(" + (param0 != null ? "{...}" : "null") + ',' + (param1 != null ? "{...}" : "null") + ',' + param2 + ',' + param3 + ')');
        }
    }

    final static void a(qk param0, qk param1, qk param2, int param3) {
        RgbSprite var17 = null;
        wb[] var5 = null;
        wb[][] var6 = null;
        int[][] var19 = null;
        int[][] var16 = null;
        int[][] var7 = null;
        wb[] var14 = null;
        int var11_int = 0;
        RgbSprite var15 = null;
        RgbSprite var18 = null;
        RgbSprite var11 = null;
        RgbSprite var12 = null;
        int var8 = 0;
        int var9 = 0;
        int var13 = Main.field_T;
        int var8Lifetime1;
        int var9Lifetime1;
        try {
          se.field_G = gl.a("frame_top", param1, "commonui", -13244);
          rc.field_k = gl.a("frame_bottom", param1, "commonui", param3 + 11944);
          PacketBuffer.field_k = DelegatingCanvas.a(param3 ^ 25118, "jagex_logo_grey", "commonui", param1);
          eg.field_c = gl.a("button", param1, "commonui", -13244);
          gh.field_n = ProxyAuthenticationRequiredException.a("validation", "commonui", 0, param1);
          me.field_c = (ee) ((Object) ec.a("commonui", param2, false, "arezzo12", param1));
          j.field_C = (ee) ((Object) ec.a("commonui", param2, false, "arezzo14", param1));
          vd.field_p = (ee) ((Object) ec.a("commonui", param2, false, "arezzo14bold", param1));
          var17 = new RgbSprite(param0.a((byte) 7, "", "button.gif"), (java.awt.Component) ((Object) tb.field_c));
          lh.a("dropdown", param1, "commonui", 105);
          var5 = lk.a("screen_options", "commonui", (byte) 98, param1);
          ri.field_d = new wb[4];
          fb.field_b = new wb[4];
          nb.field_d = new wb[4];
          var6 = new wb[][]{nb.field_d, fb.field_b, ri.field_d};
          var19 = new int[4][];
          var16 = var19;
          var7 = var16;
          var7[0] = var5[0].field_j;
          for (var8 = 1; var8 < var19.length; var8++) {
            var7[var8] = (int[]) ((Object) var19[0].clone());
          }
          if (param3 != -25188) {
            field_c = (int[]) null;
          }
          var8Lifetime1 = var5[0].field_i[0];
          var19[2][var8Lifetime1] = 16777215;
          var19[1][var8Lifetime1] = 2394342;
          var19[3][var8Lifetime1] = 4767999;
          for (var9 = 0; var9 < 3; var9++) {
            var14 = var6[var9];
            wb[] var10 = var14;
            for (var11_int = 0; var14.length > var11_int; var11_int++) {
              var14[var11_int] = a.a(var5[var9], var19[var11_int], -88);
            }
          }
          var9Lifetime1 = var17.field_o;
          ji.a(true);
          var17.c();
          SoftwareRasterizer.grayscaleRectangle(0, 0, SoftwareRasterizer.field_l, SoftwareRasterizer.field_g);
          var15 = new RgbSprite(var9Lifetime1, var9Lifetime1);
          var18 = var15;
          var18.c();
          var17.b(0, 0);
          var11 = new RgbSprite(var9Lifetime1, var9Lifetime1);
          var11.c();
          var17.b(var9Lifetime1 - var17.field_p, 0);
          var12 = new RgbSprite(-(2 * var9Lifetime1) + var17.field_p, var9Lifetime1);
          var12.c();
          var17.b(-var9Lifetime1, 0);
          gg.a(14756);
          eg.field_c = new RgbSprite[]{var15, var12, var11};
        } catch (RuntimeException runtimeException) {
          throw ma.wrapException((Throwable) ((Object) runtimeException), "ca.A(" + (param0 != null ? "{...}" : "null") + ',' + (param1 != null ? "{...}" : "null") + ',' + (param2 != null ? "{...}" : "null") + ',' + param3 + ')');
        }
    }

    final static gk a(boolean param0) {
        if (param0) {
          return (gk) null;
        }
        return (gk) ((Object) new ec());
    }

    public static void clearStaticReferences(byte param0) {
        if (param0 <= 126) {
          return;
        }
        field_c = null;
    }

    static {
        field_a = -1;
        field_c = new int[16];
    }
}
