/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class bd extends al {
    static tg[] field_j;
    static int[] field_n;
    private ba field_k;
    static String field_m;
    static String field_l;

    bd(ba param0, ba param1) {
        super(param0);
        ((bd) this).field_k = param1;
    }

    final vf b(String param0, byte param1) {
        Object var4 = null;
        uh var5 = null;
        uh var6 = null;
        vf stackIn_5_0 = null;
        vf stackIn_10_0 = null;
        vf stackIn_16_0 = null;
        vf stackIn_22_0 = null;
        vf stackIn_27_0 = null;
        vf stackIn_33_0 = null;
        vf stackOut_32_0 = null;
        vf stackOut_31_0 = null;
        vf stackOut_26_0 = null;
        vf stackOut_25_0 = null;
        vf stackOut_21_0 = null;
        vf stackOut_20_0 = null;
        vf stackOut_15_0 = null;
        vf stackOut_14_0 = null;
        vf stackOut_9_0 = null;
        vf stackOut_8_0 = null;
        vf stackOut_4_0 = null;
        vf stackOut_3_0 = null;
        if (param1 == 54) {
          if (((bd) this).field_k instanceof wc) {
            var6 = ((wc) (Object) ((bd) this).field_k).a(true);
            if (var6 != null) {
              if (var6.a((byte) 123) == mc.field_a) {
                L0: {
                  if (!param0.equals((Object) (Object) ((bd) this).field_k.field_h)) {
                    stackOut_32_0 = a.field_e;
                    stackIn_33_0 = stackOut_32_0;
                    break L0;
                  } else {
                    stackOut_31_0 = mc.field_a;
                    stackIn_33_0 = stackOut_31_0;
                    break L0;
                  }
                }
                return stackIn_33_0;
              } else {
                return a.field_e;
              }
            } else {
              L1: {
                if (!param0.equals((Object) (Object) ((bd) this).field_k.field_h)) {
                  stackOut_26_0 = a.field_e;
                  stackIn_27_0 = stackOut_26_0;
                  break L1;
                } else {
                  stackOut_25_0 = mc.field_a;
                  stackIn_27_0 = stackOut_25_0;
                  break L1;
                }
              }
              return stackIn_27_0;
            }
          } else {
            L2: {
              if (!param0.equals((Object) (Object) ((bd) this).field_k.field_h)) {
                stackOut_21_0 = a.field_e;
                stackIn_22_0 = stackOut_21_0;
                break L2;
              } else {
                stackOut_20_0 = mc.field_a;
                stackIn_22_0 = stackOut_20_0;
                break L2;
              }
            }
            return stackIn_22_0;
          }
        } else {
          var4 = null;
          String discarded$1 = ((bd) this).a((String) null, (byte) 8);
          if (((bd) this).field_k instanceof wc) {
            var5 = ((wc) (Object) ((bd) this).field_k).a(true);
            if (var5 != null) {
              if (var5.a((byte) 123) == mc.field_a) {
                L3: {
                  if (!param0.equals((Object) (Object) ((bd) this).field_k.field_h)) {
                    stackOut_15_0 = a.field_e;
                    stackIn_16_0 = stackOut_15_0;
                    break L3;
                  } else {
                    stackOut_14_0 = mc.field_a;
                    stackIn_16_0 = stackOut_14_0;
                    break L3;
                  }
                }
                return stackIn_16_0;
              } else {
                return a.field_e;
              }
            } else {
              L4: {
                if (!param0.equals((Object) (Object) ((bd) this).field_k.field_h)) {
                  stackOut_9_0 = a.field_e;
                  stackIn_10_0 = stackOut_9_0;
                  break L4;
                } else {
                  stackOut_8_0 = mc.field_a;
                  stackIn_10_0 = stackOut_8_0;
                  break L4;
                }
              }
              return stackIn_10_0;
            }
          } else {
            L5: {
              if (!param0.equals((Object) (Object) ((bd) this).field_k.field_h)) {
                stackOut_4_0 = a.field_e;
                stackIn_5_0 = stackOut_4_0;
                break L5;
              } else {
                stackOut_3_0 = mc.field_a;
                stackIn_5_0 = stackOut_3_0;
                break L5;
              }
            }
            return stackIn_5_0;
          }
        }
    }

    public static void h(byte param0) {
        field_l = null;
        field_m = null;
        field_n = null;
        int var1 = 117 / ((66 - param0) / 51);
        field_j = null;
    }

    final String a(String param0, byte param1) {
        uh var3 = null;
        if (((bd) this).field_k instanceof wc) {
          var3 = ((wc) (Object) ((bd) this).field_k).a(true);
          if (var3 != null) {
            if (var3.a((byte) 125) == mc.field_a) {
              if (param0.equals((Object) (Object) ((bd) this).field_k.field_h)) {
                return var3.c((byte) 66);
              } else {
                return mf.field_c;
              }
            } else {
              return var3.c((byte) 66);
            }
          } else {
            if (param1 != -114) {
              field_j = null;
              if (param0.equals((Object) (Object) ((bd) this).field_k.field_h)) {
                return null;
              } else {
                return mf.field_c;
              }
            } else {
              if (param0.equals((Object) (Object) ((bd) this).field_k.field_h)) {
                return null;
              } else {
                return mf.field_c;
              }
            }
          }
        } else {
          if (param1 != -114) {
            field_j = null;
            if (param0.equals((Object) (Object) ((bd) this).field_k.field_h)) {
              return null;
            } else {
              return mf.field_c;
            }
          } else {
            if (param0.equals((Object) (Object) ((bd) this).field_k.field_h)) {
              return null;
            } else {
              return mf.field_c;
            }
          }
        }
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_m = "This password contains your email address, and would be easy to guess";
        field_n = new int[8192];
    }
}
