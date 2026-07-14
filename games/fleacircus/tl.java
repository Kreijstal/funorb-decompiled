/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class tl extends r {
    private c field_n;
    static int field_o;
    static fa field_p;

    public static void c(byte param0) {
        if (param0 <= 50) {
            return;
        }
        field_p = null;
    }

    final String a(byte param0, String param1) {
        int var3_int = 0;
        jb var3 = null;
        if (((tl) this).field_n instanceof nh) {
          var3 = ((nh) (Object) ((tl) this).field_n).a((byte) 112);
          if (var3 != null) {
            if (var3.a(false) == hm.field_b) {
              if (param1.equals((Object) (Object) ((tl) this).field_n.field_i)) {
                return var3.b(126);
              } else {
                return al.field_c;
              }
            } else {
              return var3.b(126);
            }
          } else {
            if (!param1.equals((Object) (Object) ((tl) this).field_n.field_i)) {
              return al.field_c;
            } else {
              var3_int = -127 / ((24 - param0) / 46);
              return null;
            }
          }
        } else {
          if (!param1.equals((Object) (Object) ((tl) this).field_n.field_i)) {
            return al.field_c;
          } else {
            var3_int = -127 / ((24 - param0) / 46);
            return null;
          }
        }
    }

    final wd a(int param0, String param1) {
        Object var4 = null;
        jb var5 = null;
        jb var6 = null;
        wd stackIn_5_0 = null;
        wd stackIn_10_0 = null;
        wd stackIn_16_0 = null;
        wd stackIn_22_0 = null;
        wd stackIn_27_0 = null;
        wd stackIn_33_0 = null;
        wd stackOut_32_0 = null;
        wd stackOut_31_0 = null;
        wd stackOut_26_0 = null;
        wd stackOut_25_0 = null;
        wd stackOut_21_0 = null;
        wd stackOut_20_0 = null;
        wd stackOut_15_0 = null;
        wd stackOut_14_0 = null;
        wd stackOut_9_0 = null;
        wd stackOut_8_0 = null;
        wd stackOut_4_0 = null;
        wd stackOut_3_0 = null;
        if (param0 == 160) {
          if (((tl) this).field_n instanceof nh) {
            var6 = ((nh) (Object) ((tl) this).field_n).a((byte) 85);
            if (var6 != null) {
              if (var6.a(false) == hm.field_b) {
                L0: {
                  if (param1.equals((Object) (Object) ((tl) this).field_n.field_i)) {
                    stackOut_32_0 = hm.field_b;
                    stackIn_33_0 = stackOut_32_0;
                    break L0;
                  } else {
                    stackOut_31_0 = ml.field_K;
                    stackIn_33_0 = stackOut_31_0;
                    break L0;
                  }
                }
                return stackIn_33_0;
              } else {
                return ml.field_K;
              }
            } else {
              L1: {
                if (param1.equals((Object) (Object) ((tl) this).field_n.field_i)) {
                  stackOut_26_0 = hm.field_b;
                  stackIn_27_0 = stackOut_26_0;
                  break L1;
                } else {
                  stackOut_25_0 = ml.field_K;
                  stackIn_27_0 = stackOut_25_0;
                  break L1;
                }
              }
              return stackIn_27_0;
            }
          } else {
            L2: {
              if (param1.equals((Object) (Object) ((tl) this).field_n.field_i)) {
                stackOut_21_0 = hm.field_b;
                stackIn_22_0 = stackOut_21_0;
                break L2;
              } else {
                stackOut_20_0 = ml.field_K;
                stackIn_22_0 = stackOut_20_0;
                break L2;
              }
            }
            return stackIn_22_0;
          }
        } else {
          var4 = null;
          String discarded$1 = ((tl) this).a((byte) -48, (String) null);
          if (((tl) this).field_n instanceof nh) {
            var5 = ((nh) (Object) ((tl) this).field_n).a((byte) 85);
            if (var5 != null) {
              if (var5.a(false) == hm.field_b) {
                L3: {
                  if (param1.equals((Object) (Object) ((tl) this).field_n.field_i)) {
                    stackOut_15_0 = hm.field_b;
                    stackIn_16_0 = stackOut_15_0;
                    break L3;
                  } else {
                    stackOut_14_0 = ml.field_K;
                    stackIn_16_0 = stackOut_14_0;
                    break L3;
                  }
                }
                return stackIn_16_0;
              } else {
                return ml.field_K;
              }
            } else {
              L4: {
                if (param1.equals((Object) (Object) ((tl) this).field_n.field_i)) {
                  stackOut_9_0 = hm.field_b;
                  stackIn_10_0 = stackOut_9_0;
                  break L4;
                } else {
                  stackOut_8_0 = ml.field_K;
                  stackIn_10_0 = stackOut_8_0;
                  break L4;
                }
              }
              return stackIn_10_0;
            }
          } else {
            L5: {
              if (param1.equals((Object) (Object) ((tl) this).field_n.field_i)) {
                stackOut_4_0 = hm.field_b;
                stackIn_5_0 = stackOut_4_0;
                break L5;
              } else {
                stackOut_3_0 = ml.field_K;
                stackIn_5_0 = stackOut_3_0;
                break L5;
              }
            }
            return stackIn_5_0;
          }
        }
    }

    tl(c param0, c param1) {
        super(param0);
        ((tl) this).field_n = param1;
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_o = 0;
    }
}
