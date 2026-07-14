/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class rd extends pa {
    static int field_D;

    final static int a(boolean param0, int param1) {
        int stackIn_5_0 = 0;
        int stackIn_9_0 = 0;
        int stackIn_15_0 = 0;
        int stackIn_19_0 = 0;
        int stackOut_18_0 = 0;
        int stackOut_17_0 = 0;
        int stackOut_14_0 = 0;
        int stackOut_13_0 = 0;
        int stackOut_8_0 = 0;
        int stackOut_7_0 = 0;
        int stackOut_4_0 = 0;
        int stackOut_3_0 = 0;
        if (param0) {
          param1 = param1 & 8191;
          if (4096 <= param1) {
            L0: {
              if (param1 < 6144) {
                stackOut_18_0 = -lo.field_q[-4096 + param1];
                stackIn_19_0 = stackOut_18_0;
                break L0;
              } else {
                stackOut_17_0 = -lo.field_q[8192 - param1];
                stackIn_19_0 = stackOut_17_0;
                break L0;
              }
            }
            return stackIn_19_0;
          } else {
            L1: {
              if ((param1 ^ -1) > -2049) {
                stackOut_14_0 = lo.field_q[param1];
                stackIn_15_0 = stackOut_14_0;
                break L1;
              } else {
                stackOut_13_0 = lo.field_q[4096 + -param1];
                stackIn_15_0 = stackOut_13_0;
                break L1;
              }
            }
            return stackIn_15_0;
          }
        } else {
          int discarded$1 = rd.a(false, 94);
          param1 = param1 & 8191;
          if (4096 <= param1) {
            L2: {
              if (param1 < 6144) {
                stackOut_8_0 = -lo.field_q[-4096 + param1];
                stackIn_9_0 = stackOut_8_0;
                break L2;
              } else {
                stackOut_7_0 = -lo.field_q[8192 - param1];
                stackIn_9_0 = stackOut_7_0;
                break L2;
              }
            }
            return stackIn_9_0;
          } else {
            L3: {
              if ((param1 ^ -1) > -2049) {
                stackOut_4_0 = lo.field_q[param1];
                stackIn_5_0 = stackOut_4_0;
                break L3;
              } else {
                stackOut_3_0 = lo.field_q[4096 + -param1];
                stackIn_5_0 = stackOut_3_0;
                break L3;
              }
            }
            return stackIn_5_0;
          }
        }
    }

    final void a(int param0, int param1, int param2, int param3, int param4, ga param5) {
        ij var7 = null;
        ij var8 = null;
        ij var9 = null;
        if (param1 >= 1) {
          super.a(param0, 5, param2, param3, param4, param5);
          var9 = np.field_H;
          if (var9 != null) {
            if (((rd) this).b(param3, 21224, param4, param0, param2)) {
              if (!(((rd) this).field_v instanceof in)) {
                if (var9.field_v instanceof in) {
                  ((in) (Object) var9.field_v).a(-12156, (rd) this, var9);
                  np.field_H = null;
                  return;
                } else {
                  return;
                }
              } else {
                ((in) (Object) ((rd) this).field_v).a(-12156, (rd) this, var9);
                np.field_H = null;
                return;
              }
            } else {
              return;
            }
          } else {
            return;
          }
        } else {
          field_D = 107;
          super.a(param0, 5, param2, param3, param4, param5);
          var8 = np.field_H;
          var7 = var8;
          if (var8 != null) {
            if (((rd) this).b(param3, 21224, param4, param0, param2)) {
              if (!(((rd) this).field_v instanceof in)) {
                if (var8.field_v instanceof in) {
                  ((in) (Object) var8.field_v).a(-12156, (rd) this, var8);
                  np.field_H = null;
                  return;
                } else {
                  return;
                }
              } else {
                ((in) (Object) ((rd) this).field_v).a(-12156, (rd) this, var8);
                np.field_H = null;
                return;
              }
            } else {
              return;
            }
          } else {
            return;
          }
        }
    }

    private rd(int param0, int param1, int param2, int param3, io param4, sk param5, ga param6) {
        super(param0, param1, param2, param3, param4, param5);
        ((rd) this).field_z = param6;
    }

    final static void a(int param0, int param1) {
        f.field_b = (58 & param1) >> -1876486332;
        c.field_c = (param1 & 13) >> -2138271422;
        if (2 >= f.field_b) {
          L0: {
            if (2 < c.field_c) {
              c.field_c = 2;
              break L0;
            } else {
              break L0;
            }
          }
          gf.field_c = param1 & 3;
          if (param0 != 20348) {
            return;
          } else {
            L1: {
              if ((gf.field_c ^ -1) >= -3) {
                break L1;
              } else {
                gf.field_c = 2;
                break L1;
              }
            }
            return;
          }
        } else {
          L2: {
            f.field_b = 2;
            if (2 < c.field_c) {
              c.field_c = 2;
              break L2;
            } else {
              break L2;
            }
          }
          gf.field_c = param1 & 3;
          if (param0 != 20348) {
            return;
          } else {
            L3: {
              if ((gf.field_c ^ -1) >= -3) {
                break L3;
              } else {
                gf.field_c = 2;
                break L3;
              }
            }
            return;
          }
        }
    }

    static int b(int param0, int param1) {
        return param0 ^ param1;
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_D = 68;
    }
}
