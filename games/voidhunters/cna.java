/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class cna extends llb {
    static String field_wb;
    private llb field_vb;
    static String field_xb;
    llb field_yb;
    static int[] field_zb;

    public static void h(int param0) {
        field_zb = null;
        if (param0 != 1) {
            field_wb = null;
            field_xb = null;
            field_wb = null;
            return;
        }
        field_xb = null;
        field_wb = null;
    }

    final void a(int param0, int param1, int param2, int param3, int param4, int param5, int param6) {
        ((cna) this).a(param1, -79, param5, param0, param6);
        this.a((byte) -98, param3, param4);
        if (param2 >= -114) {
            ((cna) this).a(14, -14, 125, -124, -11, -99, -44);
        }
    }

    cna(long param0, llb param1, llb param2, llb param3, phb param4, String param5) {
        super(param0, param1);
        if (param4 != null) {
            ((cna) this).field_vb = new llb(0L, param2);
            ((cna) this).field_vb.field_tb = param4;
            ((cna) this).b(-561, ((cna) this).field_vb);
        }
        if (param5 != null) {
            ((cna) this).field_yb = new llb(0L, param3, param5);
            ((cna) this).b(-561, ((cna) this).field_yb);
        }
        ((cna) this).g(109);
    }

    final int a(int param0, int param1, int param2) {
        int var4 = 0;
        int var5 = 0;
        L0: {
          var4 = -param0;
          if (((cna) this).field_vb == null) {
            break L0;
          } else {
            var4 = ((cna) this).field_vb.e(58);
            break L0;
          }
        }
        if (param2 >= -52) {
          return 23;
        } else {
          L1: {
            var5 = -param0;
            if (null != ((cna) this).field_yb) {
              var5 = ((cna) this).field_yb.e(17);
              break L1;
            } else {
              break L1;
            }
          }
          return var5 + (param0 + param1 - -var4) - -param1;
        }
    }

    private final void a(byte param0, int param1, int param2) {
        int var4 = 0;
        int var5 = 0;
        int var6 = 0;
        int var7 = 0;
        L0: {
          var5 = 60 % ((param0 - -53) / 39);
          var4 = -param2;
          var6 = -param2;
          if (null == ((cna) this).field_vb) {
            break L0;
          } else {
            var4 = ((cna) this).field_vb.e(6);
            break L0;
          }
        }
        L1: {
          if (((cna) this).field_yb != null) {
            var6 = ((cna) this).field_yb.a(-param1 + -param2 + (-var4 + -param1 + ((cna) this).field_hb), (byte) 114);
            break L1;
          } else {
            break L1;
          }
        }
        L2: {
          var7 = var6 + (param1 - -var4) + (param2 + param1);
          if (((cna) this).field_hb < var7) {
            var6 = var6 + (((cna) this).field_hb + -var7);
            var7 = ((cna) this).field_hb;
            break L2;
          } else {
            break L2;
          }
        }
        L3: {
          if (((cna) this).field_F != 1) {
            break L3;
          } else {
            param1 = param1 + (((cna) this).field_hb + -var7) / 2;
            break L3;
          }
        }
        L4: {
          if (2 == ((cna) this).field_F) {
            param1 = param1 + (((cna) this).field_hb - var7);
            break L4;
          } else {
            break L4;
          }
        }
        L5: {
          if (null != ((cna) this).field_vb) {
            ((cna) this).field_vb.a(param1, 126, var4, 0, ((cna) this).field_G);
            ((cna) this).field_vb.field_B = ((cna) this).field_B;
            break L5;
          } else {
            break L5;
          }
        }
        if (((cna) this).field_yb != null) {
          ((cna) this).field_yb.a(param2 + var4 + param1, 34, var6, 0, ((cna) this).field_G);
          if (null != ((cna) this).field_vb) {
            ((cna) this).field_yb.field_F = 0;
            ((cna) this).field_yb.field_B = ((cna) this).field_B;
            return;
          } else {
            ((cna) this).field_yb.field_F = ((cna) this).field_F;
            ((cna) this).field_yb.field_B = ((cna) this).field_B;
            return;
          }
        } else {
          return;
        }
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_wb = "IO error - unable to communicate reliably with the data server. Please check any firewall/antivirus/filtering software.";
        field_xb = "Press TAB to chat or F10 to open Quick Chat.";
        field_zb = new int[]{1, 50, 50, 50, 50, 50, 1, 1, 1, 1, 1, 1};
    }
}
