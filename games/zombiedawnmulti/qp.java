/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class qp extends un {
    private pm field_q;
    static byte[][] field_t;
    static ja field_v;
    static String[] field_s;
    static String field_r;
    static ja[] field_u;
    static ef field_w;

    public static void h(int param0) {
        field_s = null;
        field_r = null;
        field_u = null;
        field_t = null;
        field_w = null;
        if (param0 != 1) {
            return;
        }
        field_v = null;
    }

    final static int a(int param0, byte param1, int param2, int param3) {
        if (!(oo.field_b < param0 - -param2)) {
            return param0;
        }
        int var4 = -6 % ((-7 - param1) / 32);
        if (!((-param2 + (param3 + param0) ^ -1) > -1)) {
            return -param2 + param0 - -param3;
        }
        return oo.field_b - param2;
    }

    final static ja[] a(int param0, int param1, int param2, int param3, int param4) {
        ja[] var5 = null;
        ja[] var6 = null;
        var6 = new ja[9];
        var5 = var6;
        var6[6] = k.a(-109, param1, param3);
        var5[3] = k.a(-109, param1, param3);
        var5[2] = k.a(-109, param1, param3);
        var5[1] = k.a(-109, param1, param3);
        var5[0] = k.a(-109, param1, param3);
        var6[8] = k.a(-125, param1, param4);
        var5[7] = k.a(-125, param1, param4);
        var5[5] = k.a(-125, param1, param4);
        if (param0 == 0) {
          if (param2 > -55) {
            return null;
          } else {
            return var5;
          }
        } else {
          var6[4] = k.a(-124, 64, param0);
          if (param2 > -55) {
            return null;
          } else {
            return var5;
          }
        }
    }

    final static void a(boolean param0, boolean param1) {
        ec.a(param0, param1, -105);
    }

    final re a(boolean param0, String param1) {
        j var4 = null;
        j var5 = null;
        re stackIn_5_0 = null;
        re stackIn_10_0 = null;
        re stackIn_15_0 = null;
        re stackIn_22_0 = null;
        re stackIn_27_0 = null;
        re stackIn_32_0 = null;
        re stackOut_31_0 = null;
        re stackOut_30_0 = null;
        re stackOut_26_0 = null;
        re stackOut_25_0 = null;
        re stackOut_21_0 = null;
        re stackOut_20_0 = null;
        re stackOut_14_0 = null;
        re stackOut_13_0 = null;
        re stackOut_9_0 = null;
        re stackOut_8_0 = null;
        re stackOut_4_0 = null;
        re stackOut_3_0 = null;
        if (!param0) {
          if (((qp) this).field_q instanceof kh) {
            var5 = ((kh) (Object) ((qp) this).field_q).a((byte) 101);
            if (var5 != null) {
              if (var5.d(49) != db.field_b) {
                return jq.field_b;
              } else {
                L0: {
                  if (param1.equals((Object) (Object) ((qp) this).field_q.field_j)) {
                    stackOut_31_0 = db.field_b;
                    stackIn_32_0 = stackOut_31_0;
                    break L0;
                  } else {
                    stackOut_30_0 = jq.field_b;
                    stackIn_32_0 = stackOut_30_0;
                    break L0;
                  }
                }
                return stackIn_32_0;
              }
            } else {
              L1: {
                if (param1.equals((Object) (Object) ((qp) this).field_q.field_j)) {
                  stackOut_26_0 = db.field_b;
                  stackIn_27_0 = stackOut_26_0;
                  break L1;
                } else {
                  stackOut_25_0 = jq.field_b;
                  stackIn_27_0 = stackOut_25_0;
                  break L1;
                }
              }
              return stackIn_27_0;
            }
          } else {
            L2: {
              if (param1.equals((Object) (Object) ((qp) this).field_q.field_j)) {
                stackOut_21_0 = db.field_b;
                stackIn_22_0 = stackOut_21_0;
                break L2;
              } else {
                stackOut_20_0 = jq.field_b;
                stackIn_22_0 = stackOut_20_0;
                break L2;
              }
            }
            return stackIn_22_0;
          }
        } else {
          field_r = null;
          if (((qp) this).field_q instanceof kh) {
            var4 = ((kh) (Object) ((qp) this).field_q).a((byte) 101);
            if (var4 != null) {
              if (var4.d(49) != db.field_b) {
                return jq.field_b;
              } else {
                L3: {
                  if (param1.equals((Object) (Object) ((qp) this).field_q.field_j)) {
                    stackOut_14_0 = db.field_b;
                    stackIn_15_0 = stackOut_14_0;
                    break L3;
                  } else {
                    stackOut_13_0 = jq.field_b;
                    stackIn_15_0 = stackOut_13_0;
                    break L3;
                  }
                }
                return stackIn_15_0;
              }
            } else {
              L4: {
                if (param1.equals((Object) (Object) ((qp) this).field_q.field_j)) {
                  stackOut_9_0 = db.field_b;
                  stackIn_10_0 = stackOut_9_0;
                  break L4;
                } else {
                  stackOut_8_0 = jq.field_b;
                  stackIn_10_0 = stackOut_8_0;
                  break L4;
                }
              }
              return stackIn_10_0;
            }
          } else {
            L5: {
              if (param1.equals((Object) (Object) ((qp) this).field_q.field_j)) {
                stackOut_4_0 = db.field_b;
                stackIn_5_0 = stackOut_4_0;
                break L5;
              } else {
                stackOut_3_0 = jq.field_b;
                stackIn_5_0 = stackOut_3_0;
                break L5;
              }
            }
            return stackIn_5_0;
          }
        }
    }

    qp(pm param0, pm param1) {
        super(param0);
        ((qp) this).field_q = param1;
    }

    final String a(String param0, int param1) {
        j var3 = null;
        if (((qp) this).field_q instanceof kh) {
          var3 = ((kh) (Object) ((qp) this).field_q).a((byte) 85);
          if (var3 != null) {
            if (var3.d(125) == db.field_b) {
              if (param0.equals((Object) (Object) ((qp) this).field_q.field_j)) {
                return var3.c(-122);
              } else {
                return de.field_d;
              }
            } else {
              return var3.c(-122);
            }
          } else {
            if (!param0.equals((Object) (Object) ((qp) this).field_q.field_j)) {
              return de.field_d;
            } else {
              if (param1 == -1276425040) {
                return null;
              } else {
                ja[] discarded$2 = qp.a(-118, 127, -62, 52, -38);
                return null;
              }
            }
          }
        } else {
          if (!param0.equals((Object) (Object) ((qp) this).field_q.field_j)) {
            return de.field_d;
          } else {
            if (param1 == -1276425040) {
              return null;
            } else {
              ja[] discarded$3 = qp.a(-118, 127, -62, 52, -38);
              return null;
            }
          }
        }
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_r = "Tech Master";
    }
}
