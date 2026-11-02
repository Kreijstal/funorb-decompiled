/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class ni {
    static int field_c;
    static long field_d;
    static int[] field_b;
    static hk field_a;

    final static boolean b(int param0) {
        if (param0 < 8) {
          field_d = 102L;
          return QuickChatMenu.field_ac;
        }
        return QuickChatMenu.field_ac;
    }

    public static void a(int param0) {
        if (param0 < 21) {
          return;
        }
        field_a = null;
        field_b = null;
    }

    final synchronized static byte[] a(int param0, byte param1) {
        int fieldTemp$22 = 0;
        int fieldTemp$19 = 0;
        int dupTemp$20 = 0;
        byte[][] arrayValue$21 = null;
        int fieldTemp$13 = 0;
        int dupTemp$17 = 0;
        byte[][] arrayValue$18 = null;
        int fieldTemp$14 = 0;
        int dupTemp$15 = 0;
        byte[][] arrayValue$16 = null;
        int dupTemp$2 = 0;
        byte[][] arrayValue$3 = null;
        int fieldTemp$4 = 0;
        int dupTemp$5 = 0;
        byte[][] arrayValue$6 = null;
        int fieldTemp$7 = 0;
        int dupTemp$8 = 0;
        byte[][] arrayValue$9 = null;
        int fieldTemp$10 = 0;
        int dupTemp$11 = 0;
        byte[][] arrayValue$12 = null;
        byte[] var2_ref_byte__;
        int var2;
        byte[] var3;
        int var2Lifetime1;
        int var2Lifetime2;
        int var2Lifetime3;
        int var2Lifetime4;
        int var2Lifetime5;
        int var2Lifetime1Lifetime1;
        byte[] var2_ref_byte__Lifetime1;
        byte[] var2_ref_byte__Lifetime2;
        byte[] var2_ref_byte__Lifetime3;
        byte[] var3Lifetime1;
        byte[] var3Lifetime2;
        byte[] var3Lifetime3;
        byte[] var2_ref_byte__Lifetime4;
        byte[] var2_ref_byte__Lifetime5;
        byte[] var2_ref_byte__Lifetime6;
        byte[] var3Lifetime4;
        byte[] var3Lifetime5;
        byte[] var3Lifetime1Lifetime1;
        if (param0 == 100) {
          if (IntrusiveNode.field_h > 0) {
            fieldTemp$22 = IntrusiveNode.field_h - 1;
            IntrusiveNode.field_h = IntrusiveNode.field_h - 1;
            var2_ref_byte__ = SceneWidgetNode.field_A[fieldTemp$22];
            SceneWidgetNode.field_A[IntrusiveNode.field_h] = null;
            return var2_ref_byte__;
          }
          if (param1 != -45) {
            return (byte[]) null;
          }
          if (param0 != 5000) {
            if (param0 == 30000 &&
              0 < AccountRequestDialog.field_Gb) {
              fieldTemp$19 = AccountRequestDialog.field_Gb - 1;
              AccountRequestDialog.field_Gb = AccountRequestDialog.field_Gb - 1;
              var2_ref_byte__Lifetime4 = ValidatedTextWidget.field_vb[fieldTemp$19];
              ValidatedTextWidget.field_vb[AccountRequestDialog.field_Gb] = null;
              return var2_ref_byte__Lifetime4;
            }
            if (null == VerticalScrollbar.field_Wb) {
              return new byte[param0];
            }
            for (var2 = 0; StripedProgressBar.field_W.length > var2; var2++) {
              if (param0 == StripedProgressBar.field_W[var2] &&
                ValidationHelpWidget.field_ub[var2] > 0) {
                dupTemp$20 = ValidationHelpWidget.field_ub[var2] - 1;
                arrayValue$21 = VerticalScrollbar.field_Wb[var2];
                ValidationHelpWidget.field_ub[var2] = dupTemp$20;
                var3 = arrayValue$21[dupTemp$20];
                VerticalScrollbar.field_Wb[var2][ValidationHelpWidget.field_ub[var2]] = null;
                return var3;
              }
            }
            return new byte[param0];
          }
          if (0 < ak.field_c) {
            fieldTemp$13 = ak.field_c - 1;
            ak.field_c = ak.field_c - 1;
            var2_ref_byte__Lifetime5 = WeightedCacheEntry.field_A[fieldTemp$13];
            WeightedCacheEntry.field_A[ak.field_c] = null;
            return var2_ref_byte__Lifetime5;
          }
          if (param0 != 30000) {
            if (null == VerticalScrollbar.field_Wb) {
              return new byte[param0];
            }
            for (var2Lifetime4 = 0; StripedProgressBar.field_W.length > var2Lifetime4; var2Lifetime4++) {
              if (param0 == StripedProgressBar.field_W[var2Lifetime4] &&
                ValidationHelpWidget.field_ub[var2Lifetime4] > 0) {
                dupTemp$17 = ValidationHelpWidget.field_ub[var2Lifetime4] - 1;
                arrayValue$18 = VerticalScrollbar.field_Wb[var2Lifetime4];
                ValidationHelpWidget.field_ub[var2Lifetime4] = dupTemp$17;
                var3Lifetime4 = arrayValue$18[dupTemp$17];
                VerticalScrollbar.field_Wb[var2Lifetime4][ValidationHelpWidget.field_ub[var2Lifetime4]] = null;
                return var3Lifetime4;
              }
            }
            return new byte[param0];
          }
          if (0 < AccountRequestDialog.field_Gb) {
            fieldTemp$14 = AccountRequestDialog.field_Gb - 1;
            AccountRequestDialog.field_Gb = AccountRequestDialog.field_Gb - 1;
            var2_ref_byte__Lifetime6 = ValidatedTextWidget.field_vb[fieldTemp$14];
            ValidatedTextWidget.field_vb[AccountRequestDialog.field_Gb] = null;
            return var2_ref_byte__Lifetime6;
          }
          if (null == VerticalScrollbar.field_Wb) {
            return new byte[param0];
          }
          for (var2Lifetime5 = 0; StripedProgressBar.field_W.length > var2Lifetime5; var2Lifetime5++) {
            if (param0 == StripedProgressBar.field_W[var2Lifetime5] &&
              ValidationHelpWidget.field_ub[var2Lifetime5] > 0) {
              dupTemp$15 = ValidationHelpWidget.field_ub[var2Lifetime5] - 1;
              arrayValue$16 = VerticalScrollbar.field_Wb[var2Lifetime5];
              ValidationHelpWidget.field_ub[var2Lifetime5] = dupTemp$15;
              var3Lifetime5 = arrayValue$16[dupTemp$15];
              VerticalScrollbar.field_Wb[var2Lifetime5][ValidationHelpWidget.field_ub[var2Lifetime5]] = null;
              return var3Lifetime5;
            }
          }
          return new byte[param0];
        }
        if (param1 != -45) {
          return (byte[]) null;
        }
        if (param0 != 5000) {
          if (param0 != 30000) {
            if (null == VerticalScrollbar.field_Wb) {
              return new byte[param0];
            }
            for (var2Lifetime1 = 0; StripedProgressBar.field_W.length > var2Lifetime1; var2Lifetime1++) {
              if (param0 == StripedProgressBar.field_W[var2Lifetime1] &&
                ValidationHelpWidget.field_ub[var2Lifetime1] > 0) {
                dupTemp$2 = ValidationHelpWidget.field_ub[var2Lifetime1] - 1;
                arrayValue$3 = VerticalScrollbar.field_Wb[var2Lifetime1];
                ValidationHelpWidget.field_ub[var2Lifetime1] = dupTemp$2;
                var3Lifetime1 = arrayValue$3[dupTemp$2];
                VerticalScrollbar.field_Wb[var2Lifetime1][ValidationHelpWidget.field_ub[var2Lifetime1]] = null;
                return var3Lifetime1;
              }
            }
            return new byte[param0];
          }
          if (0 < AccountRequestDialog.field_Gb) {
            fieldTemp$4 = AccountRequestDialog.field_Gb - 1;
            AccountRequestDialog.field_Gb = AccountRequestDialog.field_Gb - 1;
            var2_ref_byte__Lifetime1 = ValidatedTextWidget.field_vb[fieldTemp$4];
            ValidatedTextWidget.field_vb[AccountRequestDialog.field_Gb] = null;
            return var2_ref_byte__Lifetime1;
          }
          if (null == VerticalScrollbar.field_Wb) {
            return new byte[param0];
          }
          for (var2Lifetime1Lifetime1 = 0; StripedProgressBar.field_W.length > var2Lifetime1Lifetime1; var2Lifetime1Lifetime1++) {
            if (param0 == StripedProgressBar.field_W[var2Lifetime1Lifetime1] &&
              ValidationHelpWidget.field_ub[var2Lifetime1Lifetime1] > 0) {
              dupTemp$5 = ValidationHelpWidget.field_ub[var2Lifetime1Lifetime1] - 1;
              arrayValue$6 = VerticalScrollbar.field_Wb[var2Lifetime1Lifetime1];
              ValidationHelpWidget.field_ub[var2Lifetime1Lifetime1] = dupTemp$5;
              var3Lifetime1Lifetime1 = arrayValue$6[dupTemp$5];
              VerticalScrollbar.field_Wb[var2Lifetime1Lifetime1][ValidationHelpWidget.field_ub[var2Lifetime1Lifetime1]] = null;
              return var3Lifetime1Lifetime1;
            }
          }
          return new byte[param0];
        }
        if (0 < ak.field_c) {
          fieldTemp$7 = ak.field_c - 1;
          ak.field_c = ak.field_c - 1;
          var2_ref_byte__Lifetime2 = WeightedCacheEntry.field_A[fieldTemp$7];
          WeightedCacheEntry.field_A[ak.field_c] = null;
          return var2_ref_byte__Lifetime2;
        }
        if (param0 != 30000) {
          if (null == VerticalScrollbar.field_Wb) {
            return new byte[param0];
          }
          for (var2Lifetime2 = 0; StripedProgressBar.field_W.length > var2Lifetime2; var2Lifetime2++) {
            if (param0 == StripedProgressBar.field_W[var2Lifetime2] &&
              ValidationHelpWidget.field_ub[var2Lifetime2] > 0) {
              dupTemp$8 = ValidationHelpWidget.field_ub[var2Lifetime2] - 1;
              arrayValue$9 = VerticalScrollbar.field_Wb[var2Lifetime2];
              ValidationHelpWidget.field_ub[var2Lifetime2] = dupTemp$8;
              var3Lifetime2 = arrayValue$9[dupTemp$8];
              VerticalScrollbar.field_Wb[var2Lifetime2][ValidationHelpWidget.field_ub[var2Lifetime2]] = null;
              return var3Lifetime2;
            }
          }
          return new byte[param0];
        }
        if (0 < AccountRequestDialog.field_Gb) {
          fieldTemp$10 = AccountRequestDialog.field_Gb - 1;
          AccountRequestDialog.field_Gb = AccountRequestDialog.field_Gb - 1;
          var2_ref_byte__Lifetime3 = ValidatedTextWidget.field_vb[fieldTemp$10];
          ValidatedTextWidget.field_vb[AccountRequestDialog.field_Gb] = null;
          return var2_ref_byte__Lifetime3;
        }
        if (null == VerticalScrollbar.field_Wb) {
          return new byte[param0];
        }
        for (var2Lifetime3 = 0; StripedProgressBar.field_W.length > var2Lifetime3; var2Lifetime3++) {
          if (param0 == StripedProgressBar.field_W[var2Lifetime3] &&
            ValidationHelpWidget.field_ub[var2Lifetime3] > 0) {
            dupTemp$11 = ValidationHelpWidget.field_ub[var2Lifetime3] - 1;
            arrayValue$12 = VerticalScrollbar.field_Wb[var2Lifetime3];
            ValidationHelpWidget.field_ub[var2Lifetime3] = dupTemp$11;
            var3Lifetime3 = arrayValue$12[dupTemp$11];
            VerticalScrollbar.field_Wb[var2Lifetime3][ValidationHelpWidget.field_ub[var2Lifetime3]] = null;
            return var3Lifetime3;
          }
        }
        return new byte[param0];
    }

    static {
        field_c = 250;
        field_b = new int[128];
    }
}
