/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class nq extends na {
    static ik field_h;
    private dh field_e;
    static int field_i;
    static eg field_g;
    static int[] field_j;
    static String field_f;

    final gf a(byte param0, String param1) {
        v var3 = null;
        gf stackIn_5_0 = null;
        gf stackIn_9_0 = null;
        gf stackIn_16_0 = null;
        gf stackIn_20_0 = null;
        gf stackIn_28_0 = null;
        gf stackIn_32_0 = null;
        gf stackOut_31_0 = null;
        gf stackOut_30_0 = null;
        gf stackOut_27_0 = null;
        gf stackOut_26_0 = null;
        gf stackOut_19_0 = null;
        gf stackOut_18_0 = null;
        gf stackOut_15_0 = null;
        gf stackOut_14_0 = null;
        gf stackOut_8_0 = null;
        gf stackOut_7_0 = null;
        gf stackOut_4_0 = null;
        gf stackOut_3_0 = null;
        if (((nq) this).field_e instanceof op) {
          var3 = ((op) (Object) ((nq) this).field_e).a(72);
          if (var3 != null) {
            if (var3.c(88) == qe.field_a) {
              if (param0 != 26) {
                L0: {
                  int discarded$3 = nq.a(-47, 52, 56);
                  if (!param1.equals((Object) (Object) ((nq) this).field_e.field_m)) {
                    stackOut_31_0 = qr.field_e;
                    stackIn_32_0 = stackOut_31_0;
                    break L0;
                  } else {
                    stackOut_30_0 = qe.field_a;
                    stackIn_32_0 = stackOut_30_0;
                    break L0;
                  }
                }
                return stackIn_32_0;
              } else {
                L1: {
                  if (!param1.equals((Object) (Object) ((nq) this).field_e.field_m)) {
                    stackOut_27_0 = qr.field_e;
                    stackIn_28_0 = stackOut_27_0;
                    break L1;
                  } else {
                    stackOut_26_0 = qe.field_a;
                    stackIn_28_0 = stackOut_26_0;
                    break L1;
                  }
                }
                return stackIn_28_0;
              }
            } else {
              return qr.field_e;
            }
          } else {
            if (param0 != 26) {
              L2: {
                int discarded$4 = nq.a(-47, 52, 56);
                if (!param1.equals((Object) (Object) ((nq) this).field_e.field_m)) {
                  stackOut_19_0 = qr.field_e;
                  stackIn_20_0 = stackOut_19_0;
                  break L2;
                } else {
                  stackOut_18_0 = qe.field_a;
                  stackIn_20_0 = stackOut_18_0;
                  break L2;
                }
              }
              return stackIn_20_0;
            } else {
              L3: {
                if (!param1.equals((Object) (Object) ((nq) this).field_e.field_m)) {
                  stackOut_15_0 = qr.field_e;
                  stackIn_16_0 = stackOut_15_0;
                  break L3;
                } else {
                  stackOut_14_0 = qe.field_a;
                  stackIn_16_0 = stackOut_14_0;
                  break L3;
                }
              }
              return stackIn_16_0;
            }
          }
        } else {
          if (param0 != 26) {
            L4: {
              int discarded$5 = nq.a(-47, 52, 56);
              if (!param1.equals((Object) (Object) ((nq) this).field_e.field_m)) {
                stackOut_8_0 = qr.field_e;
                stackIn_9_0 = stackOut_8_0;
                break L4;
              } else {
                stackOut_7_0 = qe.field_a;
                stackIn_9_0 = stackOut_7_0;
                break L4;
              }
            }
            return stackIn_9_0;
          } else {
            L5: {
              if (!param1.equals((Object) (Object) ((nq) this).field_e.field_m)) {
                stackOut_4_0 = qr.field_e;
                stackIn_5_0 = stackOut_4_0;
                break L5;
              } else {
                stackOut_3_0 = qe.field_a;
                stackIn_5_0 = stackOut_3_0;
                break L5;
              }
            }
            return stackIn_5_0;
          }
        }
    }

    public static void c(byte param0) {
        field_j = null;
        field_f = null;
        field_h = null;
        field_g = null;
        if (param0 != -31) {
            int discarded$0 = nq.a(-90, -68, 30);
        }
    }

    final static int a(int param0, int param1, int param2) {
        int var3 = 0;
        int var4 = 0;
        var4 = Sumoblitz.field_L ? 1 : 0;
        if (param1 > 72) {
          var3 = 1;
          L0: while (true) {
            if ((param2 ^ -1) >= -2) {
              if (-2 == (param2 ^ -1)) {
                return param0 * var3;
              } else {
                return var3;
              }
            } else {
              L1: {
                if (0 == (1 & param2)) {
                  break L1;
                } else {
                  var3 = var3 * param0;
                  break L1;
                }
              }
              param0 = param0 * param0;
              param2 = param2 >> 1;
              continue L0;
            }
          }
        } else {
          return 18;
        }
    }

    final String a(int param0, String param1) {
        v var3 = null;
        if (((nq) this).field_e instanceof op) {
          var3 = ((op) (Object) ((nq) this).field_e).a(-114);
          if (var3 != null) {
            if (var3.c(param0 + -98) == qe.field_a) {
              if (param1.equals((Object) (Object) ((nq) this).field_e.field_m)) {
                return var3.a(param0 + 3690);
              } else {
                return gq.field_p;
              }
            } else {
              return var3.a(param0 + 3690);
            }
          } else {
            if (param1.equals((Object) (Object) ((nq) this).field_e.field_m)) {
              if (param0 == 0) {
                return null;
              } else {
                nq.c((byte) 75);
                return null;
              }
            } else {
              return gq.field_p;
            }
          }
        } else {
          if (param1.equals((Object) (Object) ((nq) this).field_e.field_m)) {
            if (param0 == 0) {
              return null;
            } else {
              nq.c((byte) 75);
              return null;
            }
          } else {
            return gq.field_p;
          }
        }
    }

    nq(dh param0, dh param1) {
        super(param0);
        ((nq) this).field_e = param1;
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_i = 0;
        field_f = "options";
        field_j = new int[1];
    }
}
