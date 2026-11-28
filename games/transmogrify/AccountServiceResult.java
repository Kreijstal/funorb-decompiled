/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class AccountServiceResult {
    static ResourceArchive field_h;
    boolean field_a;
    static volatile int field_i;
    String[] suggestions;
    String message;
    static Sprite field_e;
    static int[] field_d;
    boolean success;
    int statusCode;
    static IntrusiveDeque field_c;

    final static Sprite[] a(int param0) {
        int var2 = 0;
        int var3 = 0;
        byte[] var4 = null;
        int[] var5 = null;
        int var6 = 0;
        int var7 = Transmogrify.field_A ? 1 : 0;
        Sprite[] var1 = new Sprite[ih.field_b];
        for (var2 = 0; ih.field_b > var2; var2++) {
          var3 = ql.field_b[var2] * wk.field_b[var2];
          var4 = Bzip2State.field_K[var2];
          var5 = new int[var3];
          for (var6 = 0; var3 > var6; var6++) {
            var5[var6] = EditableTextField.field_D[vg.bitwiseAnd((int) var4[var6], 255)];
          }
          var1[var2] = new Sprite(NetworkArchiveRequest.field_y, FullscreenStatusDialog.field_U, BufferedSocket.field_j[var2], Bzip2State.field_a[var2], ql.field_b[var2], wk.field_b[var2], var5);
        }
        MidiNoteMask.d(-9);
        if (param0 == 31151) {
          return var1;
        }
        field_e = (Sprite) null;
        return var1;
    }

    public static void clearStaticReferences(int param0) {
        field_h = null;
        if (param0 == -1) {
          field_c = null;
          field_e = null;
          field_d = null;
          return;
        }
        field_e = (Sprite) null;
        field_c = null;
        field_e = null;
        field_d = null;
    }

    AccountServiceResult(boolean param0) {
        this.success = param0 ? true : false;
    }

    static {
        field_i = -1;
        field_c = new IntrusiveDeque();
    }
}
