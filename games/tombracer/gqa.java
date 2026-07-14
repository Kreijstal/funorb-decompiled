/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class gqa {
    String field_g;
    long field_i;
    String field_b;
    int[] field_h;
    String field_f;
    static String field_a;
    jea field_l;
    int field_n;
    int field_o;
    static String field_k;
    int field_c;
    boolean field_m;
    int field_d;
    String field_j;
    int field_e;

    final int a(boolean param0) {
        if (!((gqa) this).field_m) {
          if ((((gqa) this).field_d ^ -1) != -3) {
            if ((((gqa) this).field_i ^ -1L) != (rb.field_r ^ -1L)) {
              L0: {
                if ((ae.field_g ^ -1) != -3) {
                  break L0;
                } else {
                  if (!dda.a(false, ((gqa) this).field_j)) {
                    break L0;
                  } else {
                    return 1;
                  }
                }
              }
              if (param0) {
                return 11;
              } else {
                return 0;
              }
            } else {
              return 1;
            }
          } else {
            if ((((gqa) this).field_n ^ -1) >= -1) {
              if ((((gqa) this).field_i ^ -1L) != (rb.field_r ^ -1L)) {
                L1: {
                  if ((ae.field_g ^ -1) != -3) {
                    break L1;
                  } else {
                    if (!dda.a(false, ((gqa) this).field_j)) {
                      break L1;
                    } else {
                      return 1;
                    }
                  }
                }
                if (param0) {
                  return 11;
                } else {
                  return 0;
                }
              } else {
                return 1;
              }
            } else {
              return 2;
            }
          }
        } else {
          return 2;
        }
    }

    final static int a(int param0, byte param1, int param2) {
        int var3 = 0;
        int var4 = 0;
        int var5 = 0;
        int var6 = 0;
        var3 = param0 >> 1549811728;
        if (param1 != 24) {
          field_k = null;
          var4 = 65535 & param0;
          var5 = param2 >> -83584144;
          var6 = param2 & 65535;
          return var3 * param2 - (-(var5 * var4) + -(var6 * var4 >> -1500982896));
        } else {
          var4 = 65535 & param0;
          var5 = param2 >> -83584144;
          var6 = param2 & 65535;
          return var3 * param2 - (-(var5 * var4) + -(var6 * var4 >> -1500982896));
        }
    }

    final static void a(byte param0) {
        um.field_l.a(75, (ae) (Object) new tha());
        if (param0 < 0) {
            field_k = null;
        }
    }

    final static void a(int param0, int param1, int param2, int param3, ka param4, int param5) {
        via.a(param4, param0, 0, param5, param3, param2, 51, 0);
        if (param1 != -83584144) {
            field_a = null;
        }
    }

    public static void a(int param0) {
        field_a = null;
        if (param0 < 67) {
            field_a = null;
            field_k = null;
            return;
        }
        field_k = null;
    }

    gqa(boolean param0) {
        ((gqa) this).field_i = cca.field_z;
        ((gqa) this).field_d = gja.field_x;
        ((gqa) this).field_m = sb.field_b;
        ((gqa) this).field_o = ega.field_b;
        ((gqa) this).field_f = hi.field_p;
        ((gqa) this).field_g = esa.field_c;
        ((gqa) this).field_c = gb.field_a;
        ((gqa) this).field_n = jda.field_m;
        ((gqa) this).field_e = era.field_a;
        if (!param0) {
            ((gqa) this).field_h = null;
        } else {
            ((gqa) this).field_h = qra.field_e;
        }
        ((gqa) this).field_b = dga.field_a;
        ((gqa) this).field_j = gia.field_q;
    }

    gqa(int param0, String param1, int param2, String param3, String param4) {
        ((gqa) this).field_g = param1;
        ((gqa) this).field_o = 0;
        ((gqa) this).field_f = param4;
        ((gqa) this).field_c = 0;
        ((gqa) this).field_e = param2;
        ((gqa) this).field_n = 0;
        ((gqa) this).field_i = 0L;
        ((gqa) this).field_j = param1;
        ((gqa) this).field_m = true;
        ((gqa) this).field_d = param0;
        ((gqa) this).field_b = param3;
        ((gqa) this).field_h = null;
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_k = "Searching for an opponent";
        field_a = "Shotgun";
    }
}
