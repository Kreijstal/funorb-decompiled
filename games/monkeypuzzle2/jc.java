/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class jc {
    static float[][] field_f;
    static int field_b;
    static pe field_d;
    static int field_e;
    static uj field_c;
    static int[] field_a;

    final static le[] a(int param0, int param1, int param2, int param3, int param4) {
        int var5 = -68 / ((-34 - param2) / 37);
        return c.a(param0, 3, param3, 1, param4, param1, 1, 1, true);
    }

    final static h a(int param0, String param1) {
        if (bb.field_a.a(0)) {
            if (!param1.equals((Object) (Object) bb.field_a.a(true))) {
                bb.field_a = ia.a(29, param1);
            }
        }
        int var2 = 9 / ((param0 - 35) / 62);
        return bb.field_a;
    }

    final static void a(ki param0, byte param1, ki param2) {
        int var3_int = 0;
        ki[] var3 = null;
        il var3_ref = null;
        int var4 = 0;
        ki[] var5 = null;
        il var6 = null;
        var4 = MonkeyPuzzle2.field_F ? 1 : 0;
        var3_int = 0;
        L0: while (true) {
          if (var3_int >= param2.field_m) {
            if ((param2.field_w ^ -1) != -5) {
              if (4 == param0.field_w) {
                L1: {
                  if (5 == param2.field_w) {
                    break L1;
                  } else {
                    if (param2.field_v * param2.field_v + param2.field_D * param2.field_D >= 0.009999999776482582f) {
                      L2: {
                        if (param0.field_p != param2.field_l) {
                          param2.field_D = param2.field_D - 0.0010000000474974513f * param2.field_D;
                          param2.field_v = param2.field_v - param2.field_v * 0.0010000000474974513f;
                          break L2;
                        } else {
                          break L2;
                        }
                      }
                      return;
                    } else {
                      break L1;
                    }
                  }
                }
                L3: {
                  if ((param0.field_w ^ -1) != -5) {
                    break L3;
                  } else {
                    if (param0.field_o.length != param0.field_m) {
                      break L3;
                    } else {
                      var5 = new ki[param0.field_m + 6];
                      var3 = var5;
                      gl.a((Object[]) (Object) param0.field_o, 0, (Object[]) (Object) var5, 0, param0.field_m);
                      param0.field_o = var3;
                      break L3;
                    }
                  }
                }
                L4: {
                  if (-6 != (param2.field_w ^ -1)) {
                    break L4;
                  } else {
                    param0.field_p = param2.field_l;
                    break L4;
                  }
                }
                param2.field_m = param2.field_m + 1;
                param2.field_o[param2.field_m] = param0;
                param0.field_m = param0.field_m + 1;
                param0.field_o[param0.field_m] = param2;
                param2.field_v = 0.0f;
                param2.field_D = 0.0f;
                param2.field_x = true;
                return;
              } else {
                L5: {
                  if (param1 < -88) {
                    break L5;
                  } else {
                    le[] discarded$1 = jc.a(117, 85, 82, 12, -45);
                    break L5;
                  }
                }
                L6: {
                  L7: {
                    if (2 == param0.field_w) {
                      break L7;
                    } else {
                      if (param0.field_w != 3) {
                        L8: {
                          param2.field_m = param2.field_m + 1;
                          param2.field_o[param2.field_m] = param0;
                          param0.field_m = param0.field_m + 1;
                          param0.field_o[param0.field_m] = param2;
                          if (!aj.field_b.e(11253)) {
                            var6 = (il) (Object) aj.field_b.d(4011);
                            var3_ref = var6;
                            var6.a(-1, param2, 32.0f, param0);
                            break L8;
                          } else {
                            var3_ref = new il(param2, param0, 32.0f);
                            break L8;
                          }
                        }
                        L9: {
                          rf.field_a.a(-8212, (ug) (Object) var3_ref);
                          if (-1 == (param0.field_w ^ -1)) {
                            kc.b(true);
                            break L9;
                          } else {
                            if (param2.field_w == 0) {
                              kc.b(true);
                              break L9;
                            } else {
                              be.b(-127);
                              break L9;
                            }
                          }
                        }
                        if (param0.field_l == param2.field_l) {
                          param2.field_F = param2.field_F + 1;
                          param0.field_F = param0.field_F + 1;
                          ok.field_d = true;
                          break L6;
                        } else {
                          break L6;
                        }
                      } else {
                        break L7;
                      }
                    }
                  }
                  if (3 == param0.field_w) {
                    param0.field_n = 1;
                    break L6;
                  } else {
                    break L6;
                  }
                }
                return;
              }
            } else {
              return;
            }
          } else {
            if (param0 == param2.field_o[var3_int]) {
              return;
            } else {
              var3_int++;
              continue L0;
            }
          }
        }
    }

    public static void a(int param0) {
        field_c = null;
        field_d = null;
        if (param0 != 336) {
            return;
        }
        field_f = null;
        field_a = null;
    }

    final static void b(int param0) {
        if ((re.field_e ^ -1) < -33) {
            qb.a(256, -32 + re.field_e);
        } else {
            qb.a(256, 0);
        }
        int var1 = -54 / ((65 - param0) / 61);
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_f = new float[][]{new float[2], new float[2], new float[2], new float[2], new float[2], new float[2], new float[2], new float[2], new float[2], new float[2], new float[2], new float[2]};
    }
}
