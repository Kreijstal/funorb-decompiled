/*
 * Decompiled by CFR-JS 0.4.0.
 */
abstract class u extends rl {
    private int field_P;
    private int field_M;
    static oa field_O;
    static int field_V;
    static String field_Q;
    static int[] field_S;
    private int field_N;
    static int[] field_U;
    private int field_L;
    private int field_T;
    static volatile int field_R;
    private int field_W;

    void a(int param0, int param1, byte param2) {
        int var4 = 0;
        int var5 = 0;
        int var6 = 0;
        int var7 = 0;
        int var8 = 0;
        int var9 = 0;
        int var10 = 0;
        int var11 = 0;
        int var12 = 0;
        int var13 = 0;
        int var14 = 0;
        int var15 = 0;
        int var16 = 0;
        var16 = HoldTheLine.field_D;
        tc.a(6 + param0, param1 + 35, -12 + ((u) this).field_x, ((u) this).field_u + -40, 2105376, 0);
        var5 = 211;
        var4 = 35;
        var6 = 194;
        var7 = 0;
        var8 = param1;
        L0: while (true) {
          if (var7 >= var4) {
            L1: {
              if (param2 == 20) {
                break L1;
              } else {
                ((u) this).field_L = 69;
                break L1;
              }
            }
            var5 = 194;
            var4 = 22;
            var6 = 169;
            var7 = 0;
            var8 = param1 - -35;
            L2: while (true) {
              if (var7 >= var4) {
                di.field_t.a(param0 + ((u) this).field_x + -90, param1 + 10);
                gi.a(param1 - -35, 14191, param0 + 5, ja.field_Db, -10 + ((u) this).field_x);
                gi.a(-22 + ((u) this).field_u + param1, 14191, param0, te.field_b, ((u) this).field_x);
                var4 = ((u) this).field_u - 79;
                var6 = 127;
                var5 = 169;
                var7 = 0;
                var8 = 57 + param1;
                L3: while (true) {
                  if (var4 <= var7) {
                    return;
                  } else {
                    var9 = (-var5 + var6) * var7 / var4 + var5;
                    var9 = var9 | (var9 << 8 | var9 << 16);
                    tc.b(param0, var8, 6, var9);
                    tc.b(-6 + ((u) this).field_x + param0, var8, 6, var9);
                    var7++;
                    var8++;
                    continue L3;
                  }
                }
              } else {
                var9 = var5 + (var6 - var5) * var7 / var4;
                var9 = var9 | (var9 << 16 | var9 << 8);
                tc.b(param0, var8, 6, var9);
                tc.b(-6 + (param0 + ((u) this).field_x), var8, 6, var9);
                var8++;
                var7++;
                continue L2;
              }
            }
          } else {
            if (var8 >= tc.field_a) {
              if (var8 < tc.field_i) {
                L4: {
                  var9 = var5 - -(var7 * (-var5 + var6) / var4);
                  var10 = 0;
                  var11 = ((u) this).field_x;
                  if (var7 <= 20) {
                    L5: while (true) {
                      if (20 < var10) {
                        break L4;
                      } else {
                        var12 = (-var7 + 20) * (20 - var7) + (20 - var10) * (-var10 + 20);
                        if (var12 <= 462) {
                          if (var12 < 420) {
                            break L4;
                          } else {
                            var13 = var9 * (-var12 + 462) / 42;
                            var13 = var13 | (var13 << 16 | var13 << 8);
                            tc.field_b[tc.field_j * var8 - (-param0 - var10)] = var13;
                            var10++;
                            continue L5;
                          }
                        } else {
                          var10++;
                          continue L5;
                        }
                      }
                    }
                  } else {
                    break L4;
                  }
                }
                L6: {
                  if (var7 <= 20) {
                    var12 = var11;
                    var11 -= 21;
                    var13 = 0;
                    L7: while (true) {
                      L8: {
                        if (var13 > 20) {
                          break L8;
                        } else {
                          var14 = (-var7 + 20) * (-var7 + 20) + var13 * var13;
                          if (var14 > 462) {
                            break L8;
                          } else {
                            if (var14 >= 420) {
                              var15 = (462 + -var14) * var9 / 42;
                              var15 = var15 | (var15 << 8 | var15 << 16);
                              tc.field_b[param0 + (tc.field_j * var8 - -var11)] = var15;
                              var13++;
                              var11++;
                              continue L7;
                            } else {
                              var12 = var11 - -1;
                              var13++;
                              var11++;
                              continue L7;
                            }
                          }
                        }
                      }
                      var11 = var12;
                      break L6;
                    }
                  } else {
                    break L6;
                  }
                }
                var9 = var9 | (var9 << 8 | var9 << 16);
                tc.b(param0 + var10, var8, -var10 + var11, var9);
                var7++;
                var8++;
                continue L0;
              } else {
                var7++;
                var8++;
                continue L0;
              }
            } else {
              var7++;
              var8++;
              continue L0;
            }
          }
        }
    }

    boolean a(boolean param0) {
        ((u) this).b(!param0 ? true : false);
        if (!param0) {
            ((u) this).b(-69, -36, 41, 53);
        }
        return super.a(true);
    }

    u(qj param0, int param1, int param2) {
        super(param0, param1, param2);
        ((u) this).field_L = 0;
        ((u) this).field_W = 0;
    }

    boolean g(byte param0) {
        int var2 = 0;
        int var3 = 0;
        int var5 = 0;
        int var4 = 0;
        if (param0 != 39) {
            ((u) this).field_N = 59;
        }
        if (((u) this).field_W <= 0) {
        } else {
            var2 = ((u) this).field_P;
            var3 = ((u) this).field_N;
            int fieldTemp$0 = ((u) this).field_L + 1;
            ((u) this).field_L = ((u) this).field_L + 1;
            if (fieldTemp$0 < ((u) this).field_W) {
                var4 = ((u) this).field_L * (-((u) this).field_L + ((u) this).field_W * 2);
                var5 = ((u) this).field_W * ((u) this).field_W;
                var3 = var4 * (((u) this).field_N - ((u) this).field_M) / var5 + ((u) this).field_M;
                var2 = ((u) this).field_T - -(var4 * (((u) this).field_P - ((u) this).field_T) / var5);
            } else {
                ((u) this).field_W = 0;
                ((u) this).k(-109);
            }
            ((u) this).b(537342017, var2, var3);
        }
        return super.g((byte) 39);
    }

    final void b(int param0, int param1, int param2, int param3) {
        if (!(param2 > 0)) {
            ((u) this).b(537342017, param1, param3);
            return;
        }
        ((u) this).field_P = param1;
        if (param0 <= 5) {
            return;
        }
        ((u) this).field_L = 0;
        ((u) this).field_N = param3;
        ((u) this).field_W = param2;
        ((u) this).field_M = ((u) this).field_u;
        ((u) this).field_T = ((u) this).field_x;
    }

    public static void l(int param0) {
        field_S = null;
        field_U = null;
        field_O = null;
        field_Q = null;
    }

    final static String j(int param0) {
        if (!(ng.field_e != null)) {
            return "";
        }
        return ng.field_e;
    }

    void b(boolean param0) {
        if (!(0 < ((u) this).field_W)) {
            return;
        }
        ((u) this).b(537342017, ((u) this).field_P, ((u) this).field_N);
        ((u) this).field_W = 0;
        ((u) this).k(-108);
        if (param0) {
            ((u) this).b(true);
        }
    }

    void k(int param0) {
        if (param0 >= -100) {
            boolean discarded$0 = ((u) this).g((byte) -45);
        }
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_Q = "Dragster";
        field_U = new int[8192];
        field_R = 0;
        field_S = new int[8192];
    }
}
