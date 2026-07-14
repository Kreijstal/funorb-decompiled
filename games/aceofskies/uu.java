/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class uu extends vo {
    static boolean field_e;
    private bm field_f;
    static String field_g;
    static String field_h;

    final static void a(int param0, int param1, int param2, int param3, int param4, int param5, ll[] param6, int param7, int param8, int param9, ll[] param10, int param11, int param12, hc param13, ll[] param14, hc param15, int param16, int param17, int param18, int param19, int param20) {
        md.a(param20, param0, param15, param18, new mg(param14), param8, param7, param4, param2, param13, (byte) 106, new mg(param10), param12, param17, param9, param11, param19, new mg(param6), param1, param5, param16);
        if (param3 != -28265) {
            uu.e(99);
        }
    }

    final pt a(String param0, int param1) {
        sp var4 = null;
        sp var5 = null;
        pt stackIn_5_0 = null;
        pt stackIn_10_0 = null;
        pt stackIn_16_0 = null;
        pt stackIn_22_0 = null;
        pt stackIn_27_0 = null;
        pt stackIn_33_0 = null;
        pt stackOut_32_0 = null;
        pt stackOut_31_0 = null;
        pt stackOut_26_0 = null;
        pt stackOut_25_0 = null;
        pt stackOut_21_0 = null;
        pt stackOut_20_0 = null;
        pt stackOut_15_0 = null;
        pt stackOut_14_0 = null;
        pt stackOut_9_0 = null;
        pt stackOut_8_0 = null;
        pt stackOut_4_0 = null;
        pt stackOut_3_0 = null;
        if (param1 == 8192) {
          if (((uu) this).field_f instanceof mc) {
            var5 = ((mc) ((uu) this).field_f).a(0);
            if (var5 != null) {
              if (((sp) var5).b(true) == fd.field_a) {
                L0: {
                  if (param0.equals((Object) (Object) ((uu) this).field_f.field_f)) {
                    stackOut_32_0 = fd.field_a;
                    stackIn_33_0 = stackOut_32_0;
                    break L0;
                  } else {
                    stackOut_31_0 = bt.field_a;
                    stackIn_33_0 = stackOut_31_0;
                    break L0;
                  }
                }
                return (pt) (Object) stackIn_33_0;
              } else {
                return bt.field_a;
              }
            } else {
              L1: {
                if (param0.equals((Object) (Object) ((uu) this).field_f.field_f)) {
                  stackOut_26_0 = fd.field_a;
                  stackIn_27_0 = stackOut_26_0;
                  break L1;
                } else {
                  stackOut_25_0 = bt.field_a;
                  stackIn_27_0 = stackOut_25_0;
                  break L1;
                }
              }
              return (pt) (Object) stackIn_27_0;
            }
          } else {
            L2: {
              if (param0.equals((Object) (Object) ((uu) this).field_f.field_f)) {
                stackOut_21_0 = fd.field_a;
                stackIn_22_0 = stackOut_21_0;
                break L2;
              } else {
                stackOut_20_0 = bt.field_a;
                stackIn_22_0 = stackOut_20_0;
                break L2;
              }
            }
            return (pt) (Object) stackIn_22_0;
          }
        } else {
          field_h = (String) null;
          if (((uu) this).field_f instanceof mc) {
            var4 = ((mc) ((uu) this).field_f).a(0);
            if (var4 != null) {
              if (((sp) var4).b(true) == fd.field_a) {
                L3: {
                  if (param0.equals((Object) (Object) ((uu) this).field_f.field_f)) {
                    stackOut_15_0 = fd.field_a;
                    stackIn_16_0 = stackOut_15_0;
                    break L3;
                  } else {
                    stackOut_14_0 = bt.field_a;
                    stackIn_16_0 = stackOut_14_0;
                    break L3;
                  }
                }
                return (pt) (Object) stackIn_16_0;
              } else {
                return bt.field_a;
              }
            } else {
              L4: {
                if (param0.equals((Object) (Object) ((uu) this).field_f.field_f)) {
                  stackOut_9_0 = fd.field_a;
                  stackIn_10_0 = stackOut_9_0;
                  break L4;
                } else {
                  stackOut_8_0 = bt.field_a;
                  stackIn_10_0 = stackOut_8_0;
                  break L4;
                }
              }
              return (pt) (Object) stackIn_10_0;
            }
          } else {
            L5: {
              if (param0.equals((Object) (Object) ((uu) this).field_f.field_f)) {
                stackOut_4_0 = fd.field_a;
                stackIn_5_0 = stackOut_4_0;
                break L5;
              } else {
                stackOut_3_0 = bt.field_a;
                stackIn_5_0 = stackOut_3_0;
                break L5;
              }
            }
            return (pt) (Object) stackIn_5_0;
          }
        }
    }

    uu(bm param0, bm param1) {
        super(param0);
        ((uu) this).field_f = param1;
    }

    public static void e(int param0) {
        field_h = null;
        field_g = null;
        if (param0 != 8405) {
            hc var2 = (hc) null;
            uu.a(43, -66, -29, -19, -97, -21, (ll[]) null, -106, -7, 118, (ll[]) null, 107, 7, (hc) null, (ll[]) null, (hc) null, -45, -26, 109, -56, -123);
        }
    }

    final String a(String param0, byte param1) {
        String var4 = null;
        sp var5 = null;
        sp var6 = null;
        if (param1 == 72) {
          if (((uu) this).field_f instanceof mc) {
            var6 = ((mc) ((uu) this).field_f).a(param1 ^ 72);
            if (var6 != null) {
              if (((sp) var6).b(true) == fd.field_a) {
                if (param0.equals((Object) (Object) ((uu) this).field_f.field_f)) {
                  return ((sp) var6).a(true);
                } else {
                  return rp.field_c;
                }
              } else {
                return ((sp) var6).a(true);
              }
            } else {
              if (!param0.equals((Object) (Object) ((uu) this).field_f.field_f)) {
                return rp.field_c;
              } else {
                return null;
              }
            }
          } else {
            if (!param0.equals((Object) (Object) ((uu) this).field_f.field_f)) {
              return rp.field_c;
            } else {
              return null;
            }
          }
        } else {
          var4 = (String) null;
          String discarded$1 = ((uu) this).a((String) null, (byte) -99);
          if (((uu) this).field_f instanceof mc) {
            var5 = ((mc) ((uu) this).field_f).a(param1 ^ 72);
            if (var5 != null) {
              if (((sp) var5).b(true) == fd.field_a) {
                if (param0.equals((Object) (Object) ((uu) this).field_f.field_f)) {
                  return ((sp) var5).a(true);
                } else {
                  return rp.field_c;
                }
              } else {
                return ((sp) var5).a(true);
              }
            } else {
              if (!param0.equals((Object) (Object) ((uu) this).field_f.field_f)) {
                return rp.field_c;
              } else {
                return null;
              }
            }
          } else {
            if (!param0.equals((Object) (Object) ((uu) this).field_f.field_f)) {
              return rp.field_c;
            } else {
              return null;
            }
          }
        }
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_e = false;
        field_h = "Type your age in years";
        field_g = "Checking";
    }
}
