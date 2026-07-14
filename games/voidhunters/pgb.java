/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class pgb {
    int[] field_m;
    llb field_j;
    static gl field_b;
    String field_n;
    int field_h;
    long field_i;
    int field_q;
    String field_d;
    boolean field_k;
    String field_e;
    int field_f;
    String field_o;
    int field_a;
    int field_c;
    static dja field_g;
    static String field_l;
    static String field_p;

    final static void a(int param0, int param1, int param2, faa param3, int[] param4) {
        int var5 = 0;
        int var6 = 0;
        int[] var7_ref_int__ = null;
        int var7 = 0;
        int var8 = 0;
        int var9 = 0;
        int var10 = 0;
        L0: {
          var10 = VoidHunters.field_G;
          if (param4 == null) {
            break L0;
          } else {
            if (param1 != 0) {
              var5 = 2147483647;
              var6 = -2147483648;
              var7_ref_int__ = param4;
              var8 = 0;
              L1: while (true) {
                if (var8 >= var7_ref_int__.length) {
                  L2: {
                    param3.a(-632, param1, param0);
                    var7 = iia.a(-103, -var5 + var6);
                    param3.a(-632, var7, 6);
                    param3.a(-632, var5, 32);
                    if (var7 <= 0) {
                      break L2;
                    } else {
                      var8 = 0;
                      L3: while (true) {
                        if (var8 >= param1) {
                          break L2;
                        } else {
                          param3.a(-632, -var5 + param4[var8], var7);
                          var8++;
                          continue L3;
                        }
                      }
                    }
                  }
                  var8 = 72 % ((-35 - param2) / 54);
                  return;
                } else {
                  L4: {
                    var9 = var7_ref_int__[var8];
                    if (var9 <= var6) {
                      break L4;
                    } else {
                      var6 = var9;
                      break L4;
                    }
                  }
                  if (var9 < var5) {
                    var5 = var9;
                    var8++;
                    continue L1;
                  } else {
                    var8++;
                    continue L1;
                  }
                }
              }
            } else {
              break L0;
            }
          }
        }
        param3.a(-632, 0, param0);
    }

    final int a(int param0) {
        if (!((pgb) this).field_k) {
            // if_icmpne L31
            // if_icmplt L29
        } else {
            return 2;
        }
        if (!((((pgb) this).field_i ^ -1L) != (wqa.field_a ^ -1L))) {
            return 1;
        }
        if ((iwa.field_b ^ -1) == -3) {
            if (uaa.a(((pgb) this).field_n, (byte) -105)) {
                return 1;
            }
        }
        if (param0 != 1) {
            return -30;
        }
        return 0;
    }

    public static void a(byte param0) {
        if (param0 <= 49) {
            return;
        }
        field_b = null;
        field_g = null;
        field_l = null;
        field_p = null;
    }

    pgb(boolean param0) {
        ((pgb) this).field_f = sj.field_o;
        ((pgb) this).field_o = pva.field_f;
        ((pgb) this).field_i = sga.field_q;
        if (!param0) {
            ((pgb) this).field_m = null;
        } else {
            ((pgb) this).field_m = un.field_h;
        }
        ((pgb) this).field_q = psb.field_a;
        ((pgb) this).field_c = bl.field_A;
        ((pgb) this).field_a = wja.field_a;
        ((pgb) this).field_k = dab.field_e;
        ((pgb) this).field_e = ti.field_h;
        ((pgb) this).field_h = jkb.field_b;
        ((pgb) this).field_n = uja.field_a;
        ((pgb) this).field_d = jh.field_p;
    }

    pgb(int param0, String param1, int param2, String param3, String param4) {
        ((pgb) this).field_n = param1;
        ((pgb) this).field_e = param1;
        ((pgb) this).field_q = param2;
        ((pgb) this).field_d = param4;
        ((pgb) this).field_f = 0;
        ((pgb) this).field_a = param0;
        ((pgb) this).field_c = 0;
        ((pgb) this).field_k = true;
        ((pgb) this).field_h = 0;
        ((pgb) this).field_m = null;
        ((pgb) this).field_o = param3;
        ((pgb) this).field_i = 0L;
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_b = new gl(3);
        field_g = (dja) (Object) new gfb();
        field_p = "Toggle condition not";
        field_l = "ESC - cancel private message";
    }
}
