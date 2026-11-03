/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class ni extends IntrusiveNode {
    static SceneWidget field_s;
    static Sprite field_m;
    int field_r;
    int field_t;
    static String field_p;
    static boolean[] field_o;
    int field_k;
    int field_n;
    ni field_l;
    static int field_q;
    int field_u;

    public static void releaseStatics(byte param0) {
        field_p = null;
        field_o = null;
        field_s = null;
        field_m = null;
        if (param0 > -4) {
          field_m = (Sprite) null;
        }
    }

    final static um a(int param0, int param1) {
        um var2 = new um();
        bq.field_a.addFirst(22125, var2);
        AlphaContainer.a(true, param0);
        int var3 = -62 / ((param1 - 48) / 62);
        return var2;
    }

    final static void a(Sprite param0, int param1, int param2, int param3, int param4, boolean param5, int param6, int param7, BitmapFont param8, int param9, int param10) {
        try {
          cl.field_d = param2;
          bl.field_c = param3;
          FullscreenFocusCanvas.field_d = param0;
          ImageProducerRasterBuffer.field_l = param1;
          r.field_a = param7;
          VerticalScrollbar.field_Lb = param9;
          if (param5) {
            ni.a(88);
          }
          aq.field_a = param6;
          mp.field_f = param4;
        } catch (RuntimeException runtimeException) {
          throw aa.addExceptionContext((Throwable) ((Object) runtimeException), "ni.C(" + (param0 != null ? "{...}" : "null") + ',' + param1 + ',' + param2 + ',' + param3 + ',' + param4 + ',' + param5 + ',' + param6 + ',' + param7 + ',' + (param8 != null ? "{...}" : "null") + ',' + param9 + ',' + param10 + ')');
        }
    }

    final static void a(int param0) {
        StripedProgressBar.field_H[5].a(ug.field_n, (byte) -24);
        StripedProgressBar.field_H[6].a(DualLinkNode.field_s, (byte) -24);
        StripedProgressBar.field_H[8].a(TextHotspotWidget.field_T, (byte) -24);
        if (!gq.d(121)) {
          StripedProgressBar.field_H[1].a(BirthDateEntryPanel.field_N, (byte) -24);
          StripedProgressBar.field_H[2].a(VerticalScrollbar.field_Sb, (byte) -24);
          StripedProgressBar.field_H[4].a(UiComponent.field_m, (byte) -24);
        }
        if (param0 == -31470) {
          return;
        }
        BitmapFont var2 = (BitmapFont) null;
        ni.a((Sprite) null, -53, -40, -46, -15, true, 64, 51, (BitmapFont) null, -14, -74);
    }

    final static int a(byte param0, int param1) {
        param1 = (1431655765 & param1) + (-715827883 & param1 >>> 1);
        param1 = (param1 >>> 2 & -214748365) + (858993459 & param1);
        param1 = (param1 >>> 4) + param1 & 252645135;
        param1 = param1 + (param1 >>> 8);
        if (param0 <= -37) {
          param1 = param1 + (param1 >>> 16);
          return param1 & 255;
        }
        return 116;
    }

    ni(int param0, int param1, int param2, int param3, int param4) {
        this.field_u = param4;
        this.field_r = param2;
        this.field_n = param0;
        this.field_k = param1;
        this.field_t = param3;
    }

    static {
        field_p = "Remove <%0> from friend list";
    }
}
