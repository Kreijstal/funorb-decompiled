/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class qm {
    static ef field_f;
    static String field_c;
    static String field_e;
    static gh field_b;
    static int field_h;
    static String field_g;
    static String field_a;
    static int[] field_d;

    final static void a(boolean param0) {
        if (param0) {
          if (null == qi.field_d) {
            qi.field_d = bf.a((byte) -109, 1, 1, 3, 10);
            return;
          } else {
            return;
          }
        } else {
          field_h = 85;
          if (null != qi.field_d) {
            return;
          } else {
            qi.field_d = bf.a((byte) -109, 1, 1, 3, 10);
            return;
          }
        }
    }

    final static void a(int param0, pn param1, int param2, ic param3, boolean param4, java.awt.Component param5) {
        int var6 = 23 / ((-76 - param0) / 40);
        v.a(param2, param4, param2, param3, param1, param5, 1024, -98);
    }

    final static boolean a(byte param0, String param1, long param2) {
        ah var4 = null;
        int stackIn_23_0 = 0;
        int stackIn_30_0 = 0;
        int stackOut_28_0 = 0;
        int stackOut_29_0 = 0;
        int stackOut_21_0 = 0;
        int stackOut_22_0 = 0;
        var4 = wi.a(param1, (byte) 122);
        if (param0 == -31) {
          if (var4 != null) {
            if (null == var4.field_ac) {
              L0: {
                L1: {
                  if (null == nf.field_b) {
                    break L1;
                  } else {
                    if (kh.a(false, param2) == null) {
                      break L1;
                    } else {
                      stackOut_28_0 = 1;
                      stackIn_30_0 = stackOut_28_0;
                      break L0;
                    }
                  }
                }
                stackOut_29_0 = 0;
                stackIn_30_0 = stackOut_29_0;
                break L0;
              }
              return stackIn_30_0 != 0;
            } else {
              return true;
            }
          } else {
            L2: {
              L3: {
                if (null == nf.field_b) {
                  break L3;
                } else {
                  if (kh.a(false, param2) == null) {
                    break L3;
                  } else {
                    stackOut_21_0 = 1;
                    stackIn_23_0 = stackOut_21_0;
                    break L2;
                  }
                }
              }
              stackOut_22_0 = 0;
              stackIn_23_0 = stackOut_22_0;
              break L2;
            }
            return stackIn_23_0 != 0;
          }
        } else {
          field_h = 51;
          if (var4 != null) {
            if (null != var4.field_ac) {
              return true;
            } else {
              if (null != nf.field_b) {
                if (kh.a(false, param2) == null) {
                  return false;
                } else {
                  return true;
                }
              } else {
                return false;
              }
            }
          } else {
            if (null != nf.field_b) {
              if (kh.a(false, param2) == null) {
                return false;
              } else {
                return true;
              }
            } else {
              return false;
            }
          }
        }
    }

    final static void a(int param0) {
        if (param0 != 20272) {
          L0: {
            field_e = null;
            if (null != ch.field_O) {
              ch.field_O.m(param0 ^ 20312);
              break L0;
            } else {
              break L0;
            }
          }
          nm.field_o = new qc();
          ci.field_a.c((lh) (Object) nm.field_o, param0 + -22929007);
          return;
        } else {
          L1: {
            if (null != ch.field_O) {
              ch.field_O.m(param0 ^ 20312);
              break L1;
            } else {
              break L1;
            }
          }
          nm.field_o = new qc();
          ci.field_a.c((lh) (Object) nm.field_o, param0 + -22929007);
          return;
        }
    }

    public static void a(byte param0) {
        field_b = null;
        field_g = null;
        field_c = null;
        field_f = null;
        int var1 = 3 / ((param0 - -55) / 62);
        field_e = null;
        field_a = null;
        field_d = null;
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_f = new ef();
        field_e = "<br><br><col=ffffff>This sentinel uses the following ";
        field_h = -1;
        field_c = "RMB <img=26>: Scroll view";
        field_g = "Show private chat from my friends and opponents";
        field_a = "<%0> has not yet unlocked this option for use.";
        field_d = new int[]{108, -1, 30, 28, 29, -1, -1, -1, -1, -1, -1};
    }
}
