/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class fd extends IntrusiveNode {
    int field_j;
    static int field_h;
    PlatformTask[] field_r;
    byte[][][] field_l;
    PlatformTask[] field_p;
    int[] field_i;
    int field_o;
    static char field_n;
    static int[] field_q;
    static int[] field_g;
    int[] field_m;
    int[] field_k;

    final static boolean a(boolean param0, char param1) {
        if (Character.isISOControl(param1)) {
          return false;
        }
        if (ph.a(param1, !param0 ? true : false)) {
          return true;
        }
        if (param1 == 45) {
          return true;
        }
        if (160 == param1) {
          return true;
        }
        if (32 == param1) {
          return true;
        }
        if (param1 == 95) {
          return true;
        }
        if (param0) {
          return false;
        }
        PcmSample var3 = (PcmSample) null;
        fd.a(-68, (PcmSample) null, false);
        return false;
    }

    final static int a(int param0) {
        if (param0 != -28506) {
          field_g = (int[]) null;
          return AccountRegistrationPanel.field_E;
        }
        return AccountRegistrationPanel.field_E;
    }

    public static void b(byte param0) {
        field_q = null;
        if (param0 != 3) {
          PcmSample var2 = (PcmSample) null;
          fd.a(21, (PcmSample) null, false);
          field_g = null;
          return;
        }
        field_g = null;
    }

    final static void a(int param0, PcmSample param1, boolean param2) {
        try {
          gh.a(RawPcmStream.a(param1, 100, param0), (byte) -109);
          if (param2) {
            field_h = 107;
          }
        } catch (RuntimeException runtimeException) {
          throw ma.wrapException((Throwable) ((Object) runtimeException), "fd.C(" + param0 + ',' + (param1 != null ? "{...}" : "null") + ',' + param2 + ')');
        }
    }

    fd() {
    }

    static {
        field_h = 0;
        field_g = new int[8192];
    }
}
