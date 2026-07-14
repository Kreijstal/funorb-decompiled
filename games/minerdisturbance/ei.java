/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class ei extends kn implements sh {
    private hc[] field_N;
    static int[] field_J;
    private f field_I;
    private String[] field_O;
    static String field_P;
    static boolean field_L;
    static bj field_Q;
    static String field_K;
    static ea field_M;

    public static void o(int param0) {
        field_J = null;
        field_K = null;
        if (param0 != -2638) {
            int discarded$0 = ei.n(115);
        }
        field_M = null;
        field_P = null;
        field_Q = null;
    }

    final void a(byte param0, String[] param1) {
        int var3 = 0;
        int var4_int = 0;
        nc var4 = null;
        int var5 = 0;
        int var6 = 0;
        int var7 = 0;
        L0: {
          var7 = MinerDisturbance.field_ab;
          ((ei) this).field_G.a((byte) 55);
          if (param1 == null) {
            break L0;
          } else {
            if (param1.length != 0) {
              var3 = param1.length;
              ((ei) this).field_O = new String[var3];
              var4_int = 0;
              L1: while (true) {
                if (var3 <= var4_int) {
                  var4 = new nc(bn.field_d, 0, 1);
                  var5 = -58 % ((-20 - param0) / 54);
                  ((ei) this).field_N = new hc[1 + var3];
                  var6 = 0;
                  L2: while (true) {
                    if (var6 >= var3) {
                      ((ei) this).field_N[var3] = new hc(gl.field_t, (rm) this);
                      ((ei) this).field_N[var3].field_A = (ad) (Object) var4;
                      ((ei) this).field_N[var3].a(15, -112, 0, 100, 16 * (var3 - -1) + 20);
                      ((ei) this).a(-1, (fe) (Object) ((ei) this).field_N[var3]);
                      return;
                    } else {
                      ((ei) this).field_N[var6] = new hc(((ei) this).field_O[var6], (rm) this);
                      ((ei) this).field_N[var6].field_A = (ad) (Object) var4;
                      ((ei) this).field_N[var6].field_n = vl.field_I;
                      ((ei) this).field_N[var6].a(15, -52, 0, 80, 20 - -(var6 * 16));
                      ((ei) this).a(-1, (fe) (Object) ((ei) this).field_N[var6]);
                      var6++;
                      continue L2;
                    }
                  }
                } else {
                  ((ei) this).field_O[var4_int] = dn.a((CharSequence) (Object) param1[var4_int], false).replace(' ', ' ');
                  var4_int++;
                  continue L1;
                }
              }
            } else {
              break L0;
            }
          }
        }
        ((ei) this).field_O = null;
    }

    final static int n(int param0) {
        if (param0 != 0) {
            ei.o(116);
        }
        return hn.field_b;
    }

    final void a(byte param0, int param1, int param2, int param3) {
        super.a(param0, param1, param2, param3);
        if (!(-1 == (param3 ^ -1))) {
            return;
        }
        we var5 = bn.field_d;
        if (null != ((ei) this).field_O) {
            int discarded$0 = var5.a(wj.field_i, param1 + ((ei) this).field_u, ((ei) this).field_t + param2, ((ei) this).field_v, 20, 16777215, -1, 0, 0, var5.field_E + var5.field_I);
        }
    }

    ei(f param0) {
        super(0, 0, 0, 0, (ad) null);
        ((ei) this).field_I = param0;
    }

    final boolean a(char param0, fe param1, byte param2, int param3) {
        if (!(!super.a(param0, param1, param2, param3))) {
            return true;
        }
        if (param3 == 98) {
            return ((ei) this).b(param1, param2 ^ -79);
        }
        if ((param3 ^ -1) == -100) {
            return ((ei) this).a(param1, (byte) 12);
        }
        return false;
    }

    public final void a(int param0, byte param1, hc param2, int param3, int param4) {
        int var6 = 0;
        int var7 = 0;
        L0: {
          var7 = MinerDisturbance.field_ab;
          var6 = 0;
          if (param1 == 6) {
            break L0;
          } else {
            ((ei) this).field_N = null;
            break L0;
          }
        }
        L1: while (true) {
          if (var6 >= ((ei) this).field_O.length) {
            L2: {
              if (((ei) this).field_N[((ei) this).field_O.length] != param2) {
                break L2;
              } else {
                ((ei) this).field_I.a((byte) 47);
                break L2;
              }
            }
            return;
          } else {
            if (param2 == ((ei) this).field_N[var6]) {
              ((ei) this).field_I.a(((ei) this).field_O[var6], param1 ^ -105);
              var6++;
              continue L1;
            } else {
              var6++;
              continue L1;
            }
          }
        }
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        int var0 = 0;
        int var1 = 0;
        int var2 = 0;
        field_J = new int[256];
        var1 = 0;
        L0: while (true) {
          if (var1 >= 256) {
            field_K = "Climbing hooks: Allows sheer surfaces to be scaled.";
            field_P = "Waiting for levels";
          } else {
            var0 = var1;
            var2 = 0;
            L1: while (true) {
              if (8 <= var2) {
                field_J[var1] = var0;
                var1++;
                continue L0;
              } else {
                if ((var0 & 1) != 1) {
                  var0 = var0 >>> 1;
                  var2++;
                  continue L1;
                } else {
                  var0 = -306674912 ^ var0 >>> 1435348001;
                  var2++;
                  continue L1;
                }
              }
            }
          }
        }
    }
}
