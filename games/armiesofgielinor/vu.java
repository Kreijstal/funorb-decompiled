/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class vu extends fw {
    static rg field_O;
    static je field_Q;
    static java.applet.Applet field_L;
    static String field_P;
    static int[] field_N;
    static au field_M;

    final void a(int param0, int param1, int param2, boolean param3) {
        ((vu) this).field_K = !((vu) this).field_K ? true : false;
        this.a(param0, param1, param2, param3);
    }

    private vu(String param0, kh param1, qo param2) {
        super(param0, param1, param2);
        ((vu) this).field_k = t.field_c.field_i;
    }

    public static void a(int param0) {
        if (param0 < 43) {
            field_O = null;
        }
        field_Q = null;
        field_O = null;
        field_P = null;
        field_L = null;
        field_N = null;
        field_M = null;
    }

    final static boolean b(boolean param0) {
        if (param0) {
            boolean discarded$0 = vu.b(false);
        }
        return field_M.field_dc == oh.field_H ? true : false;
    }

    final static boolean j(int param0) {
        if (param0 != 6) {
            field_P = null;
        }
        return wq.a(dj.field_e, wm.field_b, (byte) -116);
    }

    private vu(String param0, qo param1) {
        this(param0, t.field_c.field_j, param1);
        ((vu) this).field_k = t.field_c.field_i;
    }

    final static void a(boolean param0, boolean param1, int param2, int param3, int param4, int param5, int param6) {
        int var7 = 0;
        int var8 = 0;
        int var9 = 0;
        int var10 = 0;
        int var11 = 0;
        ru var12 = null;
        int var13 = 0;
        boolean stackIn_11_0 = false;
        boolean stackIn_12_0 = false;
        boolean stackIn_13_0 = false;
        int stackIn_13_1 = 0;
        boolean stackOut_10_0 = false;
        boolean stackOut_12_0 = false;
        int stackOut_12_1 = 0;
        boolean stackOut_11_0 = false;
        int stackOut_11_1 = 0;
        L0: {
          var13 = ArmiesOfGielinor.field_M ? 1 : 0;
          if (null == nr.field_c) {
            break L0;
          } else {
            if (param4 < 0) {
              break L0;
            } else {
              if (param4 >= nr.field_c.length) {
                break L0;
              } else {
                if (null == nr.field_c[param4]) {
                  break L0;
                } else {
                  param5 = param5 << -1177571768 | param5;
                  var7 = param5 >> 428599617 ^ param5;
                  var10 = 0;
                  L1: while (true) {
                    if (var10 >= 4) {
                      L2: {
                        if (param6 == 1) {
                          break L2;
                        } else {
                          field_N = null;
                          break L2;
                        }
                      }
                      return;
                    } else {
                      L3: {
                        var8 = 40 + (-44 + (var7 & 7)) + bm.field_y[var10][0];
                        var9 = 20 + bm.field_y[var10][1] + ((param5 & 3) + -64);
                        if (!param1) {
                          break L3;
                        } else {
                          var9 = var9 >> 689848481;
                          var8 = var8 >> 654287969;
                          break L3;
                        }
                      }
                      L4: {
                        stackOut_10_0 = param0;
                        stackIn_12_0 = stackOut_10_0;
                        stackIn_11_0 = stackOut_10_0;
                        if (var9 <= param3 - 60) {
                          stackOut_12_0 = stackIn_12_0;
                          stackOut_12_1 = 0;
                          stackIn_13_0 = stackOut_12_0;
                          stackIn_13_1 = stackOut_12_1;
                          break L4;
                        } else {
                          stackOut_11_0 = stackIn_11_0;
                          stackOut_11_1 = 1;
                          stackIn_13_0 = stackOut_11_0;
                          stackIn_13_1 = stackOut_11_1;
                          break L4;
                        }
                      }
                      L5: {
                        if (stackIn_13_0 ^ stackIn_13_1 != 0) {
                          var11 = 0 + param5 % 6;
                          if (-1 < (var11 ^ -1)) {
                            break L5;
                          } else {
                            if (var11 >= nr.field_c.length) {
                              break L5;
                            } else {
                              if (nr.field_c[var11] != null) {
                                var12 = nr.field_c[var11];
                                if (param1) {
                                  var12.d(db.a(true, param2 - -var8), u.a(var9 + param3, (byte) 94));
                                  break L5;
                                } else {
                                  var12.a(db.a(true, var8 + param2), u.a(var9 + param3, (byte) 94));
                                  break L5;
                                }
                              } else {
                                break L5;
                              }
                            }
                          }
                        } else {
                          break L5;
                        }
                      }
                      param5 = param5 >> 1;
                      var7 = var7 >> 1;
                      var10++;
                      continue L1;
                    }
                  }
                }
              }
            }
          }
        }
    }

    vu(String param0, qo param1, boolean param2) {
        this(param0, param1);
        ((vu) this).field_K = param2 ? true : false;
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_O = null;
        field_P = "Who can join";
        field_N = new int[]{5, 3, 1};
    }
}
