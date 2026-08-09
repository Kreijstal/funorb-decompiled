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
        this.field_K = !this.field_K ? true : false;
        super.a(param0, param1, param2, param3);
    }

    private vu(String param0, kh param1, qo param2) {
        super(param0, param1, param2);
        try {
            this.field_k = t.field_c.field_i;
        } catch (RuntimeException runtimeException) {
            throw ig.a((Throwable) ((Object) runtimeException), "vu.<init>(" + (param0 != null ? "{...}" : "null") + ',' + (param1 != null ? "{...}" : "null") + ',' + (param2 != null ? "{...}" : "null") + ')');
        }
    }

    public static void a(int param0) {
        if (param0 < 43) {
            field_O = (rg) null;
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
            vu.b(false);
        }
        return field_M.field_dc == oh.field_H ? true : false;
    }

    final static boolean j(int param0) {
        if (param0 != 6) {
            field_P = (String) null;
        }
        return wq.a(dj.field_e, wm.field_b, (byte) -116);
    }

    private vu(String param0, qo param1) {
        this(param0, t.field_c.field_j, param1);
        try {
            this.field_k = t.field_c.field_i;
        } catch (RuntimeException runtimeException) {
            throw ig.a((Throwable) ((Object) runtimeException), "vu.<init>(" + (param0 != null ? "{...}" : "null") + ',' + (param1 != null ? "{...}" : "null") + ')');
        }
    }

    final static void a(boolean param0, boolean param1, int param2, int param3, int param4, int param5, int param6) {
        boolean stackIn_13_0 = false;
        boolean stackIn_14_0 = false;
        int stackIn_14_1 = 0;
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        int var7_int = 0;
        RuntimeException var7 = null;
        int var8 = 0;
        int var9 = 0;
        int var10 = 0;
        int var11 = 0;
        ru var12 = null;
        int var13 = 0;
        var13 = ArmiesOfGielinor.field_M ? 1 : 0;
        try {
          L0: {
            L1: {
              if (null == nr.field_c) {
                break L1;
              } else {
                if (param4 < 0) {
                  break L1;
                } else {
                  if (param4 >= nr.field_c.length) {
                    break L1;
                  } else {
                    if (null == nr.field_c[param4]) {
                      break L1;
                    } else {
                      param5 = param5 << -1177571768 | param5;
                      var7_int = param5 >> 428599617 ^ param5;
                      var10 = 0;
                      L2: while (true) {
                        if (var10 >= 4) {
                          L3: {
                            if (param6 == 1) {
                              break L3;
                            } else {
                              field_N = (int[]) null;
                              break L3;
                            }
                          }
                          decompiledRegionSelector0 = 1;
                          break L0;
                        } else {
                          L4: {
                            var8 = 40 + (-44 + (var7_int & 7)) + bm.field_y[var10][0];
                            var9 = 20 + bm.field_y[var10][1] + ((param5 & 3) + -64);
                            if (!param1) {
                              break L4;
                            } else {
                              var9 = var9 >> 689848481;
                              var8 = var8 >> 654287969;
                              break L4;
                            }
                          }
                          L5: {
                            stackIn_13_0 = param0;

                            if (var9 <= param3 - 60) {
                              stackIn_14_0 = stackIn_13_0;
                              stackIn_14_1 = 0;
                              break L5;
                            } else {
                              stackIn_14_0 = stackIn_13_0;
                              stackIn_14_1 = 1;
                              break L5;
                            }
                          }
                          L6: {
                            if (stackIn_14_0 ^ stackIn_14_1 != 0) {
                              var11 = 0 + param5 % 6;
                              if (-1 < (var11 ^ -1)) {
                                break L6;
                              } else {
                                if (var11 >= nr.field_c.length) {
                                  break L6;
                                } else {
                                  if (nr.field_c[var11] != null) {
                                    var12 = nr.field_c[var11];
                                    if (param1) {
                                      var12.d(db.a(true, param2 - -var8), u.a(var9 + param3, (byte) 94));
                                      break L6;
                                    } else {
                                      var12.a(db.a(true, var8 + param2), u.a(var9 + param3, (byte) 94));
                                      break L6;
                                    }
                                  } else {
                                    break L6;
                                  }
                                }
                              }
                            } else {
                              break L6;
                            }
                          }
                          param5 = param5 >> 1;
                          var7_int = var7_int >> 1;
                          var10++;
                          continue L2;
                        }
                      }
                    }
                  }
                }
              }
            }
            decompiledRegionSelector0 = 0;
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var7 = decompiledCaughtException;
          throw ig.a((Throwable) ((Object) var7), "vu.B(" + param0 + ',' + param1 + ',' + param2 + ',' + param3 + ',' + param4 + ',' + param5 + ',' + param6 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return;
        } else {
          return;
        }
    }

    vu(String param0, qo param1, boolean param2) {
        this(param0, param1);
        try {
            this.field_K = param2 ? true : false;
        } catch (RuntimeException runtimeException) {
            throw ig.a((Throwable) ((Object) runtimeException), "vu.<init>(" + (param0 != null ? "{...}" : "null") + ',' + (param1 != null ? "{...}" : "null") + ',' + param2 + ')');
        }
    }

    static {
        field_O = null;
        field_P = "Who can join";
        field_N = new int[]{5, 3, 1};
    }
}
