/*
 * Decompiled by CFR-JS 0.4.0.
 */
abstract class ByteStorage {
    static String field_a;
    static ResourceArchive field_b;

    abstract void setBytes(byte[] param0, int param1);

    abstract byte[] getBytes(int param0);

    public static void clearStaticReferences(int param0) {
        if (param0 != -24420) {
          return;
        }
        field_b = null;
        field_a = null;
    }

    final static void a(int param0, boolean param1) {
        int var2 = 0;
        int var3 = 0;
        int var4 = 0;
        if (param1) {
          var2 = (PcmOutputWorker.field_d - 640) / 2;
          var3 = ug.field_b * ug.field_b;
          var4 = -(param0 * param0) + var3;
          ModalDialogHost.field_T.a(var2 - 199 * var4 / var3, 199, -2147483648, -4 + SoftwareRasterizer.field_c - 210, 90);
          BirthDateValidator.field_k.a(var2 + (202 + var4 * 438 / var3), 438, -2147483648, -120 + (SoftwareRasterizer.field_c - 4), 0);
          return;
        }
    }

    static {
    }
}
