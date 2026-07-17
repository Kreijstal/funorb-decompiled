/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class r {
    static int field_c;
    static int[] field_b;
    static String field_a;

    final static boolean a(int param0, boolean param1, int param2, int param3) {
        int var4 = 0;
        int var5 = 0;
        int stackIn_18_0 = 0;
        int stackIn_45_0 = 0;
        int stackIn_54_0 = 0;
        int stackOut_53_0 = 0;
        int stackOut_52_0 = 0;
        int stackOut_44_0 = 0;
        int stackOut_43_0 = 0;
        int stackOut_17_0 = 0;
        int stackOut_16_0 = 0;
        if (param1) {
          if (i.field_t[param2] < i.field_t[param3]) {
            return true;
          } else {
            if (i.field_t[param2] <= i.field_t[param3]) {
              if (ci.field_n[param2] >= ci.field_n[param3]) {
                if (ci.field_n[param3] >= ci.field_n[param2]) {
                  if (param0 == 2) {
                    var4 = tc.field_w[param2] + mf.field_d[param2] - -wa.field_m[param2];
                    var5 = mf.field_d[param3] - (-wa.field_m[param3] - tc.field_w[param3]);
                    if (var5 <= var4) {
                      if (var4 > var5) {
                        return false;
                      } else {
                        L0: {
                          if (param2 >= param3) {
                            stackOut_53_0 = 0;
                            stackIn_54_0 = stackOut_53_0;
                            break L0;
                          } else {
                            stackOut_52_0 = 1;
                            stackIn_54_0 = stackOut_52_0;
                            break L0;
                          }
                        }
                        return stackIn_54_0 != 0;
                      }
                    } else {
                      return true;
                    }
                  } else {
                    r.a((byte) -57, 96);
                    var4 = tc.field_w[param2] + mf.field_d[param2] - -wa.field_m[param2];
                    var5 = mf.field_d[param3] - (-wa.field_m[param3] - tc.field_w[param3]);
                    if (var5 <= var4) {
                      if (var4 > var5) {
                        return false;
                      } else {
                        L1: {
                          if (param2 >= param3) {
                            stackOut_44_0 = 0;
                            stackIn_45_0 = stackOut_44_0;
                            break L1;
                          } else {
                            stackOut_43_0 = 1;
                            stackIn_45_0 = stackOut_43_0;
                            break L1;
                          }
                        }
                        return stackIn_45_0 != 0;
                      }
                    } else {
                      return true;
                    }
                  }
                } else {
                  return false;
                }
              } else {
                return true;
              }
            } else {
              return false;
            }
          }
        } else {
          if (ci.field_n[param2] >= ci.field_n[param3]) {
            if (ci.field_n[param2] > ci.field_n[param3]) {
              return false;
            } else {
              if (i.field_t[param2] >= i.field_t[param3]) {
                if (i.field_t[param2] <= i.field_t[param3]) {
                  if (param0 != 2) {
                    r.a((byte) -57, 96);
                    var4 = tc.field_w[param2] + mf.field_d[param2] - -wa.field_m[param2];
                    var5 = mf.field_d[param3] - (-wa.field_m[param3] - tc.field_w[param3]);
                    if (var5 <= var4) {
                      if (var4 <= var5) {
                        if (param2 >= param3) {
                          return false;
                        } else {
                          return true;
                        }
                      } else {
                        return false;
                      }
                    } else {
                      return true;
                    }
                  } else {
                    var4 = tc.field_w[param2] + mf.field_d[param2] - -wa.field_m[param2];
                    var5 = mf.field_d[param3] - (-wa.field_m[param3] - tc.field_w[param3]);
                    if (var5 <= var4) {
                      if (var4 > var5) {
                        return false;
                      } else {
                        L2: {
                          if (param2 >= param3) {
                            stackOut_17_0 = 0;
                            stackIn_18_0 = stackOut_17_0;
                            break L2;
                          } else {
                            stackOut_16_0 = 1;
                            stackIn_18_0 = stackOut_16_0;
                            break L2;
                          }
                        }
                        return stackIn_18_0 != 0;
                      }
                    } else {
                      return true;
                    }
                  }
                } else {
                  return false;
                }
              } else {
                return true;
              }
            }
          } else {
            return true;
          }
        }
    }

    public final String toString() {
        throw new IllegalStateException();
    }

    final static void a(byte param0, int param1) {
        lm.field_k = (param1 & 54) >> 4;
        mp.field_d = (12 & param1) >> 2;
        if (param0 >= -58) {
          L0: {
            field_a = null;
            if (2 < lm.field_k) {
              lm.field_k = 2;
              break L0;
            } else {
              break L0;
            }
          }
          L1: {
            uk.field_c = param1 & 3;
            if (2 < mp.field_d) {
              mp.field_d = 2;
              break L1;
            } else {
              break L1;
            }
          }
          L2: {
            if (2 < uk.field_c) {
              uk.field_c = 2;
              break L2;
            } else {
              break L2;
            }
          }
          return;
        } else {
          L3: {
            if (2 < lm.field_k) {
              lm.field_k = 2;
              break L3;
            } else {
              break L3;
            }
          }
          L4: {
            uk.field_c = param1 & 3;
            if (2 < mp.field_d) {
              mp.field_d = 2;
              break L4;
            } else {
              break L4;
            }
          }
          L5: {
            if (2 < uk.field_c) {
              uk.field_c = 2;
              break L5;
            } else {
              break L5;
            }
          }
          return;
        }
    }

    public static void a(int param0) {
        field_a = null;
        field_b = null;
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_c = 4;
        field_a = "EXIT";
    }
}
