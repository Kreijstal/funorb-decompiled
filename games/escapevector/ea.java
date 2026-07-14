/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class ea {
    private ed field_a;
    private int field_c;
    private gb field_h;
    private int field_e;
    static String field_i;
    private gb field_j;
    static om field_g;
    private gb field_k;
    static ed field_d;
    private int field_b;
    static ed field_f;

    final void a(int param0) {
        if (param0 != 256) {
          boolean discarded$2 = ea.c((byte) -28);
          ((ea) this).field_a.d(((ea) this).field_j.field_a, ((ea) this).field_j.field_c, ((ea) this).field_c);
          return;
        } else {
          ((ea) this).field_a.d(((ea) this).field_j.field_a, ((ea) this).field_j.field_c, ((ea) this).field_c);
          return;
        }
    }

    final static ab a(byte[] param0, int param1) {
        ab var2 = null;
        if (param1 == -1) {
          if (param0 == null) {
            return null;
          } else {
            var2 = new ab(param0, gn.field_k, gi.field_e, qh.field_k, bc.field_a, qk.field_f, qe.field_a);
            of.a(false);
            return var2;
          }
        } else {
          field_f = null;
          if (param0 == null) {
            return null;
          } else {
            var2 = new ab(param0, gn.field_k, gi.field_e, qh.field_k, bc.field_a, qk.field_f, qe.field_a);
            of.a(false);
            return var2;
          }
        }
    }

    public static void b(byte param0) {
        field_g = null;
        field_i = null;
        field_d = null;
        if (param0 <= 114) {
            field_f = null;
            field_f = null;
            return;
        }
        field_f = null;
    }

    final static int d(byte param0) {
        if (param0 > -95) {
            ea.b((byte) -6);
            return mh.field_f;
        }
        return mh.field_f;
    }

    final boolean e(byte param0) {
        int stackIn_4_0 = 0;
        int stackIn_8_0 = 0;
        int stackOut_7_0 = 0;
        int stackOut_6_0 = 0;
        int stackOut_3_0 = 0;
        int stackOut_2_0 = 0;
        if (param0 != -7) {
          L0: {
            field_i = null;
            if (((ea) this).field_b < ((ea) this).field_e) {
              stackOut_7_0 = 0;
              stackIn_8_0 = stackOut_7_0;
              break L0;
            } else {
              stackOut_6_0 = 1;
              stackIn_8_0 = stackOut_6_0;
              break L0;
            }
          }
          return stackIn_8_0 != 0;
        } else {
          L1: {
            if (((ea) this).field_b < ((ea) this).field_e) {
              stackOut_3_0 = 0;
              stackIn_4_0 = stackOut_3_0;
              break L1;
            } else {
              stackOut_2_0 = 1;
              stackIn_4_0 = stackOut_2_0;
              break L1;
            }
          }
          return stackIn_4_0 != 0;
        }
    }

    final void a(byte param0) {
        ((ea) this).field_b = ((ea) this).field_b + 1;
        if (param0 <= 36) {
          L0: {
            ((ea) this).field_c = -19;
            if (((ea) this).e((byte) -7)) {
              ((ea) this).field_b = ((ea) this).field_e;
              break L0;
            } else {
              break L0;
            }
          }
          ((ea) this).field_c = dc.a(256, ((ea) this).field_e, 0, ((ea) this).field_b, 64);
          ((ea) this).field_j.field_a = dc.a(((ea) this).field_h.field_a, ((ea) this).field_e, ((ea) this).field_k.field_a, ((ea) this).field_b, 64);
          ((ea) this).field_j.field_c = dc.a(((ea) this).field_h.field_c, ((ea) this).field_e, ((ea) this).field_k.field_c, ((ea) this).field_b, 64);
          return;
        } else {
          L1: {
            if (((ea) this).e((byte) -7)) {
              ((ea) this).field_b = ((ea) this).field_e;
              break L1;
            } else {
              break L1;
            }
          }
          ((ea) this).field_c = dc.a(256, ((ea) this).field_e, 0, ((ea) this).field_b, 64);
          ((ea) this).field_j.field_a = dc.a(((ea) this).field_h.field_a, ((ea) this).field_e, ((ea) this).field_k.field_a, ((ea) this).field_b, 64);
          ((ea) this).field_j.field_c = dc.a(((ea) this).field_h.field_c, ((ea) this).field_e, ((ea) this).field_k.field_c, ((ea) this).field_b, 64);
          return;
        }
    }

    final static boolean c(byte param0) {
        mn var1 = null;
        int var2 = 0;
        int var3 = 0;
        mn var4 = null;
        var3 = EscapeVector.field_A;
        var4 = (mn) (Object) je.field_a.a(false);
        var1 = var4;
        if (var1 != null) {
          if (param0 <= -47) {
            var2 = 0;
            L0: while (true) {
              if (var1.field_i > var2) {
                L1: {
                  if (var4.field_r[var2] == null) {
                    break L1;
                  } else {
                    if (0 != var4.field_r[var2].field_f) {
                      break L1;
                    } else {
                      return false;
                    }
                  }
                }
                if (null == var4.field_p[var2]) {
                  var2++;
                  var2++;
                  continue L0;
                } else {
                  if (var4.field_p[var2].field_f == 0) {
                    return false;
                  } else {
                    var2++;
                    continue L0;
                  }
                }
              } else {
                return true;
              }
            }
          } else {
            return true;
          }
        } else {
          return false;
        }
    }

    ea(gb param0, gb param1, ed param2, int param3) {
        ((ea) this).field_c = 0;
        ((ea) this).field_b = 0;
        ((ea) this).field_h = param1;
        ((ea) this).field_a = param2;
        ((ea) this).field_k = param0;
        ((ea) this).field_e = param3;
        ((ea) this).field_j = ((ea) this).field_k.a(10);
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_i = "M";
        field_g = new om(9, 0, 4, 1);
        field_d = new ed(270, 70);
    }
}
