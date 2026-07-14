/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class ih {
    static String field_e;
    static ak field_g;
    static int[] field_c;
    static String field_d;
    static String field_b;
    static tf[] field_a;
    static int field_f;

    final static uc a(byte param0) {
        int var1 = 116 % ((3 - param0) / 36);
        if (!(rf.field_d != null)) {
            rf.field_d = new uc(ep.field_b, 20, 0, 0, 0, 11579568, -1, 0, 0, ep.field_b.field_w, -1, 2147483647, true);
        }
        return rf.field_d;
    }

    public static void a(int param0) {
        field_c = null;
        field_d = null;
        field_a = null;
        field_e = null;
        field_b = null;
        if (param0 != -1) {
            return;
        }
        field_g = null;
    }

    final static void a(boolean param0) {
        int stackIn_7_0 = 0;
        int stackIn_10_0 = 0;
        int stackIn_20_0 = 0;
        int stackIn_23_0 = 0;
        int stackIn_33_0 = 0;
        int stackIn_36_0 = 0;
        int stackIn_43_0 = 0;
        int stackIn_46_0 = 0;
        int stackOut_42_0 = 0;
        int stackOut_41_0 = 0;
        int stackOut_45_0 = 0;
        int stackOut_44_0 = 0;
        int stackOut_32_0 = 0;
        int stackOut_31_0 = 0;
        int stackOut_35_0 = 0;
        int stackOut_34_0 = 0;
        int stackOut_19_0 = 0;
        int stackOut_18_0 = 0;
        int stackOut_22_0 = 0;
        int stackOut_21_0 = 0;
        int stackOut_6_0 = 0;
        int stackOut_5_0 = 0;
        int stackOut_9_0 = 0;
        int stackOut_8_0 = 0;
        if (!param0) {
          L0: {
            if (fq.field_o == null) {
              break L0;
            } else {
              fq.field_o.c(-1);
              hn.field_d = hn.field_d + 1;
              if (hn.field_d + 1 < ce.field_f) {
                L1: {
                  fo.field_t = hn.field_d + -128;
                  if (fo.field_t >= 0) {
                    stackOut_42_0 = 6 * fo.field_t;
                    stackIn_43_0 = stackOut_42_0;
                    break L1;
                  } else {
                    stackOut_41_0 = 0;
                    stackIn_43_0 = stackOut_41_0;
                    break L1;
                  }
                }
                L2: {
                  fo.field_t = stackIn_43_0;
                  if ((fo.field_t ^ -1) >= -257) {
                    stackOut_45_0 = fo.field_t;
                    stackIn_46_0 = stackOut_45_0;
                    break L2;
                  } else {
                    stackOut_44_0 = 256;
                    stackIn_46_0 = stackOut_44_0;
                    break L2;
                  }
                }
                fo.field_t = stackIn_46_0;
                if (jc.field_d) {
                  break L0;
                } else {
                  if (hn.field_d >= ce.field_f - 2) {
                    break L0;
                  } else {
                    hn.field_d = -2 + ce.field_f;
                    return;
                  }
                }
              } else {
                L3: {
                  rg.field_e = fq.field_o;
                  hn.field_d = 0;
                  fq.field_o = null;
                  fo.field_t = hn.field_d + -128;
                  if (fo.field_t >= 0) {
                    stackOut_32_0 = 6 * fo.field_t;
                    stackIn_33_0 = stackOut_32_0;
                    break L3;
                  } else {
                    stackOut_31_0 = 0;
                    stackIn_33_0 = stackOut_31_0;
                    break L3;
                  }
                }
                L4: {
                  fo.field_t = stackIn_33_0;
                  if ((fo.field_t ^ -1) >= -257) {
                    stackOut_35_0 = fo.field_t;
                    stackIn_36_0 = stackOut_35_0;
                    break L4;
                  } else {
                    stackOut_34_0 = 256;
                    stackIn_36_0 = stackOut_34_0;
                    break L4;
                  }
                }
                L5: {
                  fo.field_t = stackIn_36_0;
                  if (jc.field_d) {
                    break L5;
                  } else {
                    if (hn.field_d >= ce.field_f - 2) {
                      break L5;
                    } else {
                      hn.field_d = -2 + ce.field_f;
                      return;
                    }
                  }
                }
                return;
              }
            }
          }
          return;
        } else {
          field_c = null;
          if (fq.field_o != null) {
            fq.field_o.c(-1);
            hn.field_d = hn.field_d + 1;
            if (hn.field_d + 1 >= ce.field_f) {
              L6: {
                rg.field_e = fq.field_o;
                hn.field_d = 0;
                fq.field_o = null;
                fo.field_t = hn.field_d + -128;
                if (fo.field_t >= 0) {
                  stackOut_19_0 = 6 * fo.field_t;
                  stackIn_20_0 = stackOut_19_0;
                  break L6;
                } else {
                  stackOut_18_0 = 0;
                  stackIn_20_0 = stackOut_18_0;
                  break L6;
                }
              }
              L7: {
                fo.field_t = stackIn_20_0;
                if ((fo.field_t ^ -1) >= -257) {
                  stackOut_22_0 = fo.field_t;
                  stackIn_23_0 = stackOut_22_0;
                  break L7;
                } else {
                  stackOut_21_0 = 256;
                  stackIn_23_0 = stackOut_21_0;
                  break L7;
                }
              }
              fo.field_t = stackIn_23_0;
              if (!jc.field_d) {
                if (hn.field_d < ce.field_f - 2) {
                  hn.field_d = -2 + ce.field_f;
                  return;
                } else {
                  return;
                }
              } else {
                return;
              }
            } else {
              L8: {
                fo.field_t = hn.field_d + -128;
                if (fo.field_t >= 0) {
                  stackOut_6_0 = 6 * fo.field_t;
                  stackIn_7_0 = stackOut_6_0;
                  break L8;
                } else {
                  stackOut_5_0 = 0;
                  stackIn_7_0 = stackOut_5_0;
                  break L8;
                }
              }
              L9: {
                fo.field_t = stackIn_7_0;
                if ((fo.field_t ^ -1) >= -257) {
                  stackOut_9_0 = fo.field_t;
                  stackIn_10_0 = stackOut_9_0;
                  break L9;
                } else {
                  stackOut_8_0 = 256;
                  stackIn_10_0 = stackOut_8_0;
                  break L9;
                }
              }
              fo.field_t = stackIn_10_0;
              if (!jc.field_d) {
                if (hn.field_d < ce.field_f - 2) {
                  hn.field_d = -2 + ce.field_f;
                  return;
                } else {
                  return;
                }
              } else {
                return;
              }
            }
          } else {
            return;
          }
        }
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_c = new int[8192];
        field_d = "Connecting to<br>friend server...";
        field_e = "End Game";
        field_b = "Invite";
    }
}
