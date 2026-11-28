/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class al {
    static int field_a;
    static byte[][] field_b;
    static String field_c;

    final static void a(int param0) {
        int var1;
        int var2;
        var2 = Main.field_T;
        r.field_p = false;
        if (param0 < -18) {
          ProgressDialog.field_ab = null;
          if (DirectByteArrayStore.field_e) {
            Crc32Table.field_a.showConnectionFailure(false);
            return;
          }
          var1 = IntrusiveNode.field_b;
          if (var1 > 0) {
            if (var1 == 1) {
              ProgressDialog.field_ab = dh.field_g;
            } else {
              ProgressDialog.field_ab = re.a(nc.field_a, new String[]{Integer.toString(var1)}, (byte) -50);
            }
            ProgressDialog.field_ab = AccountCreationResultPanel.a((byte) 92, new CharSequence[]{(CharSequence) ((Object) ProgressDialog.field_ab), (CharSequence) ((Object) "<br>"), (CharSequence) ((Object) TextHotspotBounds.field_l)});
          }
          Crc32Table.field_a.closeDialog(-93);
          e.a((byte) 112);
          return;
        }
        field_b = (byte[][]) null;
        ProgressDialog.field_ab = null;
        if (DirectByteArrayStore.field_e) {
          Crc32Table.field_a.showConnectionFailure(false);
        } else {
          var1 = IntrusiveNode.field_b;
          if (var1 > 0) {
            if (var1 == 1) {
              ProgressDialog.field_ab = dh.field_g;
            } else {
              ProgressDialog.field_ab = re.a(nc.field_a, new String[]{Integer.toString(var1)}, (byte) -50);
            }
            ProgressDialog.field_ab = AccountCreationResultPanel.a((byte) 92, new CharSequence[]{(CharSequence) ((Object) ProgressDialog.field_ab), (CharSequence) ((Object) "<br>"), (CharSequence) ((Object) TextHotspotBounds.field_l)});
          }
          Crc32Table.field_a.closeDialog(-93);
          e.a((byte) 112);
        }
    }

    public static void clearStaticReferences(byte param0) {
        if (param0 > -22) {
          field_c = (String) null;
          field_c = null;
          field_b = (byte[][]) null;
          return;
        }
        field_c = null;
        field_b = (byte[][]) null;
    }

    static {
        field_b = new byte[1000][];
    }
}
