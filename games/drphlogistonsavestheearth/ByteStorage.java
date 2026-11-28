/*
 * Decompiled by CFR-JS 0.4.0.
 */
abstract class ByteStorage {
    static String field_d;
    static he[] field_b;
    static RgbSprite[] field_c;
    static int field_a;
    static he[] field_e;

    final static void a(byte param0) {
        if (null != ol.field_a) {
          ol.field_a.closeDialog(true);
        }
        dd.field_g = new DisplayNameSelectionPanel();
        PcmOutputWorker.field_e.replaceContent(33, dd.field_g);
        if (param0 < -11) {
          return;
        }
        ByteStorage.a((byte) 18);
    }

    public static void clearStaticReferences(int param0) {
        field_e = null;
        if (param0 <= 50) {
          return;
        }
        field_b = null;
        field_c = null;
        field_d = null;
    }

    abstract byte[] getBytes(int param0);

    final static void b(int param0) {
        int var1 = -57 % ((param0 + 21) / 51);
        ConfirmedEmailAvailabilityValidator.e(-20480);
    }

    abstract void setBytes(byte[] param0, byte param1);

    final static boolean b(byte param0) {
        if (param0 < -92) {
          return hg.field_ub == lc.field_h ? true : false;
        }
        field_d = (String) null;
        return hg.field_ub == lc.field_h ? true : false;
    }

    static {
        field_d = "Waiting for fonts";
    }
}
