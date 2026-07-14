/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class di extends mk {
    private fn field_k;
    static String field_j;
    static je field_l;

    final static void c(byte param0) {
        if (param0 > -120) {
            di.c((byte) 114);
            qf.a(56);
            gl.a(124, 4);
            return;
        }
        qf.a(56);
        gl.a(124, 4);
    }

    public static void g(int param0) {
        field_l = null;
        field_j = null;
        int var1 = -96 / ((param0 - -9) / 42);
    }

    final gu a(int param0, String param1) {
        n var3 = null;
        gu stackIn_5_0 = null;
        gu stackIn_9_0 = null;
        gu stackIn_16_0 = null;
        gu stackIn_20_0 = null;
        gu stackIn_28_0 = null;
        gu stackIn_32_0 = null;
        gu stackOut_31_0 = null;
        gu stackOut_30_0 = null;
        gu stackOut_27_0 = null;
        gu stackOut_26_0 = null;
        gu stackOut_19_0 = null;
        gu stackOut_18_0 = null;
        gu stackOut_15_0 = null;
        gu stackOut_14_0 = null;
        gu stackOut_8_0 = null;
        gu stackOut_7_0 = null;
        gu stackOut_4_0 = null;
        gu stackOut_3_0 = null;
        if (((di) this).field_k instanceof eg) {
          var3 = ((eg) (Object) ((di) this).field_k).a(-918933630);
          if (var3 != null) {
            if (var3.a(false) == oo.field_g) {
              if (param0 != -3137) {
                L0: {
                  field_l = null;
                  if (!param1.equals((Object) (Object) ((di) this).field_k.field_v)) {
                    stackOut_31_0 = rn.field_e;
                    stackIn_32_0 = stackOut_31_0;
                    break L0;
                  } else {
                    stackOut_30_0 = oo.field_g;
                    stackIn_32_0 = stackOut_30_0;
                    break L0;
                  }
                }
                return (gu) (Object) stackIn_32_0;
              } else {
                L1: {
                  if (!param1.equals((Object) (Object) ((di) this).field_k.field_v)) {
                    stackOut_27_0 = rn.field_e;
                    stackIn_28_0 = stackOut_27_0;
                    break L1;
                  } else {
                    stackOut_26_0 = oo.field_g;
                    stackIn_28_0 = stackOut_26_0;
                    break L1;
                  }
                }
                return (gu) (Object) stackIn_28_0;
              }
            } else {
              return rn.field_e;
            }
          } else {
            if (param0 != -3137) {
              L2: {
                field_l = null;
                if (!param1.equals((Object) (Object) ((di) this).field_k.field_v)) {
                  stackOut_19_0 = rn.field_e;
                  stackIn_20_0 = stackOut_19_0;
                  break L2;
                } else {
                  stackOut_18_0 = oo.field_g;
                  stackIn_20_0 = stackOut_18_0;
                  break L2;
                }
              }
              return (gu) (Object) stackIn_20_0;
            } else {
              L3: {
                if (!param1.equals((Object) (Object) ((di) this).field_k.field_v)) {
                  stackOut_15_0 = rn.field_e;
                  stackIn_16_0 = stackOut_15_0;
                  break L3;
                } else {
                  stackOut_14_0 = oo.field_g;
                  stackIn_16_0 = stackOut_14_0;
                  break L3;
                }
              }
              return (gu) (Object) stackIn_16_0;
            }
          }
        } else {
          if (param0 != -3137) {
            L4: {
              field_l = null;
              if (!param1.equals((Object) (Object) ((di) this).field_k.field_v)) {
                stackOut_8_0 = rn.field_e;
                stackIn_9_0 = stackOut_8_0;
                break L4;
              } else {
                stackOut_7_0 = oo.field_g;
                stackIn_9_0 = stackOut_7_0;
                break L4;
              }
            }
            return (gu) (Object) stackIn_9_0;
          } else {
            L5: {
              if (!param1.equals((Object) (Object) ((di) this).field_k.field_v)) {
                stackOut_4_0 = rn.field_e;
                stackIn_5_0 = stackOut_4_0;
                break L5;
              } else {
                stackOut_3_0 = oo.field_g;
                stackIn_5_0 = stackOut_3_0;
                break L5;
              }
            }
            return (gu) (Object) stackIn_5_0;
          }
        }
    }

    di(fn param0, fn param1) {
        super(param0);
        ((di) this).field_k = param1;
    }

    final String a(byte param0, String param1) {
        n var3 = null;
        if (((di) this).field_k instanceof eg) {
          var3 = ((eg) (Object) ((di) this).field_k).a(-918933630);
          if (var3 == null) {
            if (param0 > 89) {
              if (param1.equals((Object) (Object) ((di) this).field_k.field_v)) {
                return null;
              } else {
                return ak.field_j;
              }
            } else {
              di.c((byte) 94);
              if (param1.equals((Object) (Object) ((di) this).field_k.field_v)) {
                return null;
              } else {
                return ak.field_j;
              }
            }
          } else {
            if (var3.a(false) == oo.field_g) {
              if (param1.equals((Object) (Object) ((di) this).field_k.field_v)) {
                return var3.a((byte) 55);
              } else {
                return ak.field_j;
              }
            } else {
              return var3.a((byte) 55);
            }
          }
        } else {
          if (param0 <= 89) {
            di.c((byte) 94);
            if (param1.equals((Object) (Object) ((di) this).field_k.field_v)) {
              return null;
            } else {
              return ak.field_j;
            }
          } else {
            if (param1.equals((Object) (Object) ((di) this).field_k.field_v)) {
              return null;
            } else {
              return ak.field_j;
            }
          }
        }
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_j = "<%0> cannot join; the game is full.";
    }
}
