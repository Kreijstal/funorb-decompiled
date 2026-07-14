/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class kp {
    static String field_b;
    static boolean field_a;

    final static int a(of param0, int param1, id param2, int param3) {
        int var4 = 0;
        int var5 = 0;
        int var6 = 0;
        int var7 = 0;
        int var8 = 0;
        var8 = Sumoblitz.field_L ? 1 : 0;
        if (param0 != null) {
          if (param0.field_m != null) {
            L0: {
              if (param2 == null) {
                break L0;
              } else {
                if (param0.field_p != param2.field_l) {
                  break L0;
                } else {
                  if (param1 == -1) {
                    var4 = param2.field_q.length;
                    var5 = param0.field_m[param3].length / var4;
                    var6 = 0;
                    L1: while (true) {
                      if (var5 > var6) {
                        if (param0.field_r[param3][var6] != param2.field_s) {
                          var6++;
                          var6++;
                          continue L1;
                        } else {
                          if (ea.a(param0.field_o[param3][var6], (byte) -25)) {
                            var7 = 0;
                            L2: while (true) {
                              if (var4 <= var7) {
                                return var6;
                              } else {
                                if (param2.field_q[var7] == param0.field_m[param3][var6 * var4 + var7]) {
                                  var7++;
                                  continue L2;
                                } else {
                                  var6++;
                                  continue L1;
                                }
                              }
                            }
                          } else {
                            var6++;
                            continue L1;
                          }
                        }
                      } else {
                        return -1;
                      }
                    }
                  } else {
                    field_a = true;
                    var4 = param2.field_q.length;
                    var5 = param0.field_m[param3].length / var4;
                    var6 = 0;
                    L3: while (true) {
                      if (var5 > var6) {
                        if (param0.field_r[param3][var6] != param2.field_s) {
                          var6++;
                          var6++;
                          continue L3;
                        } else {
                          if (ea.a(param0.field_o[param3][var6], (byte) -25)) {
                            var7 = 0;
                            L4: while (true) {
                              if (var4 <= var7) {
                                return var6;
                              } else {
                                if (param2.field_q[var7] == param0.field_m[param3][var6 * var4 + var7]) {
                                  var7++;
                                  continue L4;
                                } else {
                                  var6++;
                                  continue L3;
                                }
                              }
                            }
                          } else {
                            var6++;
                            continue L3;
                          }
                        }
                      } else {
                        return -1;
                      }
                    }
                  }
                }
              }
            }
            return -1;
          } else {
            return -1;
          }
        } else {
          return -1;
        }
    }

    public static void a(int param0) {
        Object var2 = null;
        if (param0 != -1) {
          var2 = null;
          int discarded$2 = kp.a((of) null, -64, (id) null, -29);
          field_b = null;
          return;
        } else {
          field_b = null;
          return;
        }
    }

    final static void a(int param0, id param1, int param2) {
        Object var4 = null;
        if (param2 <= 60) {
          var4 = null;
          int discarded$2 = kp.a((of) null, 14, (id) null, -12);
          ow.field_f.a((ms) (Object) param1, (byte) 39);
          km.a((byte) 69, param0, param1);
          return;
        } else {
          ow.field_f.a((ms) (Object) param1, (byte) 39);
          km.a((byte) 69, param0, param1);
          return;
        }
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_b = "Classic";
        field_a = false;
    }
}
