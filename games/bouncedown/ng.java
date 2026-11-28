/*
 * Decompiled by CFR-JS 0.4.0.
 */
abstract class ng {
    static boolean field_b;
    static boolean[] field_a;

    final static RgbSprite[] a(byte param0) {
        int var2 = 0;
        int var3 = 0;
        byte[] var4 = null;
        int[] var5 = null;
        int var6 = 0;
        int var7 = Bounce.field_N;
        RgbSprite[] var1 = new RgbSprite[EmailFormatValidator.field_p];
        for (var2 = 0; var2 < EmailFormatValidator.field_p; var2++) {
          var3 = qh.field_i[var2] * ih.field_V[var2];
          var4 = ph.field_c[var2];
          var5 = new int[var3];
          for (var6 = 0; var3 > var6; var6++) {
            var5[var6] = he.field_k[da.bitwiseAnd((int) var4[var6], 255)];
          }
          var1[var2] = new RgbSprite(DropTargetWidgetContainer.field_C, fk.field_e, ConfirmedEmailAvailabilityValidator.field_n[var2], ae.field_c[var2], ih.field_V[var2], qh.field_i[var2], var5);
        }
        if (param0 > -47) {
          return (RgbSprite[]) null;
        }
        vb.a((byte) 122);
        return var1;
    }

    final static boolean a(int param0) {
        boolean stackIn_6_0 = false;
        if (param0 <= 108) {
          ng.clearStaticReferences(51);
        }
        stackIn_6_0 = (vd.field_b != null) && (vd.field_b.b((byte) 121));
        return stackIn_6_0;
    }

    abstract sb b(byte param0);

    final static void a(int param0, int param1, int param2) {
        if (null == bl.field_e ||
          !(bl.field_e.length >= param2)) {
          bl.field_e = new int[param2 * 2];
        }
        if (null == sj.field_j ||
          !(sj.field_j.length >= param2)) {
          sj.field_j = new int[2 * param2];
        }
        if (null == FullscreenStatusDialog.field_S ||
          !(param2 <= FullscreenStatusDialog.field_S.length)) {
          FullscreenStatusDialog.field_S = new int[param2 * 2];
        }
        if (param0 != -15936) {
          ng.a((byte) -73);
        }
        if (ResourceArchive.field_i == null ||
          !(ResourceArchive.field_i.length >= param2)) {
          ResourceArchive.field_i = new int[2 * param2];
        }
        if (DelegatingCanvas.field_c == null ||
          !(DelegatingCanvas.field_c.length >= param2)) {
          DelegatingCanvas.field_c = new int[2 * param2];
        }
        if (null == ij.field_b ||
          !(param2 <= ij.field_b.length)) {
          ij.field_b = new int[2 * param2];
        }
        if (w.field_f == null ||
          !(param1 + param2 <= w.field_f.length)) {
          w.field_f = new int[2 * (param2 + param1)];
        }
        if (pg.field_a == null ||
          !(pg.field_a.length >= param2)) {
          pg.field_a = new boolean[param2 * 2];
        }
        AccountNameAvailabilityValidator.field_n = 2147483647;
        va.field_b = 2147483647;
        w.field_d = -2147483648;
        DisplayNameSelectionPanel.field_M = 0;
        DialogMessagePane.field_A = -2147483648;
    }

    abstract void a(boolean param0, PacketBuffer param1);

    public static void clearStaticReferences(int param0) {
        if (param0 != 2) {
          return;
        }
        field_a = null;
    }

    final static boolean a(byte param0, char param1) {
        char[] var2 = null;
        int var3 = 0;
        int var4 = 0;
        int var5 = 0;
        char[] var6 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var2_ref = null;
        char[] var2Lifetime1;
        int var3Lifetime1;
        int var4Lifetime1;
        var5 = Bounce.field_N;
        try {
          if (Character.isISOControl(param1)) {
            return false;
          }
          if (DiskArchiveRequest.a(106, param1)) {
            return true;
          }
          var6 = a.field_b;
          var2 = var6;
          if (param0 != -95) {
            field_a = (boolean[]) null;
          }
          for (var3 = 0; var6.length > var3; var3++) {
            var4 = var6[var3];
            if (param1 == var4) {
              return true;
            }
          }
          var2Lifetime1 = FullscreenStatusDialog.field_O;
          for (var3Lifetime1 = 0; var2Lifetime1.length > var3Lifetime1; var3Lifetime1++) {
            var4Lifetime1 = var2Lifetime1[var3Lifetime1];
            if (param1 == var4Lifetime1) {
              return true;
            }
          }
          return false;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2_ref = decompiledCaughtException;
          throw CipherPacketBuffer.wrapClientException((Throwable) ((Object) var2_ref), "ng.D(" + param0 + ',' + param1 + ')');
        }
    }

    static {
        field_a = new boolean[112];
        field_b = false;
    }
}
