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
        tc.a(6 + param0, param1 + 35, -12 + this.field_x, this.field_u + -40, 2105376, 0);
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
                this.field_L = 69;
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
                di.field_t.a(param0 + this.field_x + -90, param1 + 10);
                gi.a(param1 - -35, 14191, param0 + 5, ja.field_Db, -10 + this.field_x);
                gi.a(-22 + this.field_u + param1, 14191, param0, te.field_b, this.field_x);
                var4 = this.field_u - 79;
                var6 = 127;
                var5 = 169;
                var7 = 0;
                var8 = 57 + param1;
                L3: while (true) {
                  if (var4 <= var7) {
                    return;
                  } else {
                    var9 = (-var5 + var6) * var7 / var4 + var5;
                    var9 = var9 | (var9 << -210151608 | var9 << -1390727920);
                    tc.b(param0, var8, 6, var9);
                    tc.b(-6 + this.field_x + param0, var8, 6, var9);
                    var7++;
                    var8++;
                    continue L3;
                  }
                }
              } else {
                var9 = var5 + (var6 - var5) * var7 / var4;
                var9 = var9 | (var9 << -1175873936 | var9 << 271832200);
                tc.b(param0, var8, 6, var9);
                tc.b(-6 + (param0 + this.field_x), var8, 6, var9);
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
                  var11 = this.field_x;
                  if ((var7 ^ -1) >= -21) {
                    L5: while (true) {
                      if (20 < var10) {
                        break L4;
                      } else {
                        var12 = (-var7 + 20) * (20 - var7) + (20 - var10) * (-var10 + 20);
                        if ((var12 ^ -1) >= -463) {
                          if (var12 < 420) {
                            break L4;
                          } else {
                            var13 = var9 * (-var12 + 462) / 42;
                            var13 = var13 | (var13 << 1647920720 | var13 << 956272136);
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
                  if (-21 <= (var7 ^ -1)) {
                    var12 = var11;
                    var11 -= 21;
                    var13 = 0;
                    L7: while (true) {
                      L8: {
                        if (var13 > 20) {
                          break L8;
                        } else {
                          var14 = (-var7 + 20) * (-var7 + 20) + var13 * var13;
                          if (-463 > (var14 ^ -1)) {
                            break L8;
                          } else {
                            if ((var14 ^ -1) <= -421) {
                              var15 = (462 + -var14) * var9 / 42;
                              var15 = var15 | (var15 << -1591223640 | var15 << -364927344);
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
                var9 = var9 | (var9 << 763680936 | var9 << -132778448);
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
        this.b(!param0 ? true : false);
        if (!param0) {
            this.b(-69, -36, 41, 53);
        }
        return super.a(true);
    }

    u(qj param0, int param1, int param2) {
        super(param0, param1, param2);
        this.field_L = 0;
        this.field_W = 0;
    }

    boolean g(byte param0) {
        int var2 = 0;
        int var3 = 0;
        int fieldTemp$0 = 0;
        int var5 = 0;
        int var4 = 0;
        if (param0 != 39) {
            this.field_N = 59;
        }
        if ((this.field_W ^ -1) >= -1) {
        } else {
            var2 = this.field_P;
            var3 = this.field_N;
            fieldTemp$0 = this.field_L + 1;
            this.field_L = this.field_L + 1;
            if (fieldTemp$0 < this.field_W) {
                var4 = this.field_L * (-this.field_L + this.field_W * 2);
                var5 = this.field_W * this.field_W;
                var3 = var4 * (this.field_N - this.field_M) / var5 + this.field_M;
                var2 = this.field_T - -(var4 * (this.field_P - this.field_T) / var5);
            } else {
                this.field_W = 0;
                this.k(-109);
            }
            this.b(537342017, var2, var3);
        }
        return super.g((byte) 39);
    }

    final void b(int param0, int param1, int param2, int param3) {
        if (!(param2 > 0)) {
            this.b(537342017, param1, param3);
            return;
        }
        this.field_P = param1;
        if (param0 <= 5) {
            return;
        }
        this.field_L = 0;
        this.field_N = param3;
        this.field_W = param2;
        this.field_M = this.field_u;
        this.field_T = this.field_x;
    }

    public static void l(int param0) {
        field_S = null;
        if (param0 != 6) {
            field_V = -109;
        }
        field_U = null;
        field_O = null;
        field_Q = null;
    }

    final static String j(int param0) {
        if (!(ng.field_e != null)) {
            return "";
        }
        if (param0 != 21) {
            field_O = (oa) null;
        }
        return ng.field_e;
    }

    void b(boolean param0) {
        if (!(0 < this.field_W)) {
            return;
        }
        this.b(537342017, this.field_P, this.field_N);
        this.field_W = 0;
        this.k(-108);
        if (param0) {
            this.b(true);
        }
    }

    void k(int param0) {
        boolean discarded$0 = false;
        if (param0 >= -100) {
            discarded$0 = this.g((byte) -45);
        }
    }

    static {
        field_Q = "Dragster";
        field_U = new int[8192];
        field_R = 0;
        field_S = new int[8192];
    }
}
