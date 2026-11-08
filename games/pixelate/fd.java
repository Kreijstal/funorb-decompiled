/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class fd {
    static GzipDecoder field_b;
    static String field_d;
    static Sprite field_a;
    static Sprite[] field_c;

    final static SceneWidget getPlayerListContent(int param0) {
        if (param0 != 0) {
          return (SceneWidget) null;
        }
        return Cloud.field_b.content;
    }

    final synchronized static byte[] a(int param0, int param1) {
        int fieldTemp$9 = 0;
        int dupTemp$10 = 0;
        byte[][] arrayValue$11 = null;
        int fieldTemp$14 = 0;
        int dupTemp$12 = 0;
        byte[][] arrayValue$13 = null;
        int fieldTemp$8 = 0;
        int fieldTemp$2 = 0;
        int dupTemp$3 = 0;
        byte[][] arrayValue$4 = null;
        int fieldTemp$7 = 0;
        int dupTemp$5 = 0;
        byte[][] arrayValue$6 = null;
        byte[] var2_ref_byte__;
        int var2;
        byte[] var3;
        int var2Lifetime1;
        int var2Lifetime2;
        int var2Lifetime3;
        byte[] var2_ref_byte__Lifetime1;
        byte[] var2_ref_byte__Lifetime2;
        byte[] var2_ref_byte__Lifetime3;
        byte[] var3Lifetime1;
        byte[] var3Lifetime2;
        byte[] var2_ref_byte__Lifetime4;
        byte[] var3Lifetime3;
        if (100 != param1) {
          if (~param1 == param0 &&
            IntrusiveNode.field_c > 0) {
            fieldTemp$9 = IntrusiveNode.field_c - 1;
            IntrusiveNode.field_c = IntrusiveNode.field_c - 1;
            var2_ref_byte__ = TextHotspotWidget.field_S[fieldTemp$9];
            TextHotspotWidget.field_S[IntrusiveNode.field_c] = null;
            return var2_ref_byte__;
          }
          if (param1 != 30000) {
            if (null == RasterState.field_o) {
              return new byte[param1];
            }
            for (var2 = 0; an.field_c.length > var2; var2++) {
              if (param1 == an.field_c[var2] &&
                DialWidgetPainter.field_p[var2] > 0) {
                dupTemp$10 = DialWidgetPainter.field_p[var2] - 1;
                arrayValue$11 = RasterState.field_o[var2];
                DialWidgetPainter.field_p[var2] = dupTemp$10;
                var3 = arrayValue$11[dupTemp$10];
                RasterState.field_o[var2][DialWidgetPainter.field_p[var2]] = null;
                return var3;
              }
            }
            return new byte[param1];
          }
          if (0 < RasterState.field_n) {
            fieldTemp$14 = RasterState.field_n - 1;
            RasterState.field_n = RasterState.field_n - 1;
            var2_ref_byte__Lifetime4 = CipherPacketBuffer.field_w[fieldTemp$14];
            CipherPacketBuffer.field_w[RasterState.field_n] = null;
            return var2_ref_byte__Lifetime4;
          }
          if (null == RasterState.field_o) {
            return new byte[param1];
          }
          for (var2Lifetime3 = 0; an.field_c.length > var2Lifetime3; var2Lifetime3++) {
            if (param1 == an.field_c[var2Lifetime3] &&
              DialWidgetPainter.field_p[var2Lifetime3] > 0) {
              dupTemp$12 = DialWidgetPainter.field_p[var2Lifetime3] - 1;
              arrayValue$13 = RasterState.field_o[var2Lifetime3];
              DialWidgetPainter.field_p[var2Lifetime3] = dupTemp$12;
              var3Lifetime3 = arrayValue$13[dupTemp$12];
              RasterState.field_o[var2Lifetime3][DialWidgetPainter.field_p[var2Lifetime3]] = null;
              return var3Lifetime3;
            }
          }
          return new byte[param1];
        }
        if (0 < PairedTextColumns.field_Hb) {
          fieldTemp$8 = PairedTextColumns.field_Hb - 1;
          PairedTextColumns.field_Hb = PairedTextColumns.field_Hb - 1;
          var2_ref_byte__Lifetime1 = ConditionalTextValue.field_e[fieldTemp$8];
          ConditionalTextValue.field_e[PairedTextColumns.field_Hb] = null;
          return var2_ref_byte__Lifetime1;
        }
        if (~param1 == param0 &&
          IntrusiveNode.field_c > 0) {
          fieldTemp$2 = IntrusiveNode.field_c - 1;
          IntrusiveNode.field_c = IntrusiveNode.field_c - 1;
          var2_ref_byte__Lifetime2 = TextHotspotWidget.field_S[fieldTemp$2];
          TextHotspotWidget.field_S[IntrusiveNode.field_c] = null;
          return var2_ref_byte__Lifetime2;
        }
        if (param1 != 30000) {
          if (null == RasterState.field_o) {
            return new byte[param1];
          }
          for (var2Lifetime1 = 0; an.field_c.length > var2Lifetime1; var2Lifetime1++) {
            if (param1 == an.field_c[var2Lifetime1] &&
              DialWidgetPainter.field_p[var2Lifetime1] > 0) {
              dupTemp$3 = DialWidgetPainter.field_p[var2Lifetime1] - 1;
              arrayValue$4 = RasterState.field_o[var2Lifetime1];
              DialWidgetPainter.field_p[var2Lifetime1] = dupTemp$3;
              var3Lifetime1 = arrayValue$4[dupTemp$3];
              RasterState.field_o[var2Lifetime1][DialWidgetPainter.field_p[var2Lifetime1]] = null;
              return var3Lifetime1;
            }
          }
          return new byte[param1];
        }
        if (0 < RasterState.field_n) {
          fieldTemp$7 = RasterState.field_n - 1;
          RasterState.field_n = RasterState.field_n - 1;
          var2_ref_byte__Lifetime3 = CipherPacketBuffer.field_w[fieldTemp$7];
          CipherPacketBuffer.field_w[RasterState.field_n] = null;
          return var2_ref_byte__Lifetime3;
        }
        if (null == RasterState.field_o) {
          return new byte[param1];
        }
        for (var2Lifetime2 = 0; an.field_c.length > var2Lifetime2; var2Lifetime2++) {
          if (param1 == an.field_c[var2Lifetime2] &&
            DialWidgetPainter.field_p[var2Lifetime2] > 0) {
            dupTemp$5 = DialWidgetPainter.field_p[var2Lifetime2] - 1;
            arrayValue$6 = RasterState.field_o[var2Lifetime2];
            DialWidgetPainter.field_p[var2Lifetime2] = dupTemp$5;
            var3Lifetime2 = arrayValue$6[dupTemp$5];
            RasterState.field_o[var2Lifetime2][DialWidgetPainter.field_p[var2Lifetime2]] = null;
            return var3Lifetime2;
          }
        }
        return new byte[param1];
    }

    public static void releaseStatics(int param0) {
        if (param0 == -24465) {
          field_d = null;
          field_c = null;
          field_a = null;
          field_b = null;
          return;
        }
        fd.releaseStatics(119);
        field_d = null;
        field_c = null;
        field_a = null;
        field_b = null;
    }

    static {
        field_b = new GzipDecoder();
        field_d = "If you are not, please change your password to something more obscure!";
    }
}
