/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class rt {
    private int field_a;
    private int field_b;
    private int field_d;
    private ij field_f;
    private dcb[] field_e;
    private int[][][] field_c;
    private int field_h;
    boolean field_g;

    final int[][][] b(int param0) {
        int var2 = 0;
        int var3 = VoidHunters.field_G;
        if (!(this.field_a == this.field_h)) {
            throw new RuntimeException("Can only retrieve a full image cache");
        }
        for (var2 = 0; var2 < this.field_h; var2++) {
            this.field_e[var2] = ag.field_o;
        }
        if (param0 < 75) {
            this.field_g = true;
        }
        return this.field_c;
    }

    final int[][] a(int param0, byte param1) {
        dcb var3 = null;
        dcb var4 = null;
        int var5 = 0;
        Object stackIn_12_0 = null;
        Object stackIn_13_0 = null;
        Object stackIn_14_0 = null;
        int stackIn_14_1 = 0;
        Object stackIn_16_0 = null;
        Object stackIn_17_0 = null;
        Object stackIn_18_0 = null;
        int stackIn_18_1 = 0;
        Object stackOut_15_0 = null;
        Object stackOut_17_0 = null;
        int stackOut_17_1 = 0;
        Object stackOut_16_0 = null;
        int stackOut_16_1 = 0;
        Object stackOut_11_0 = null;
        Object stackOut_13_0 = null;
        int stackOut_13_1 = 0;
        Object stackOut_12_0 = null;
        int stackOut_12_1 = 0;
        L0: {
          var5 = VoidHunters.field_G;
          if (param1 <= -82) {
            break L0;
          } else {
            this.field_d = 122;
            break L0;
          }
        }
        if (this.field_h == this.field_a) {
          L1: {
            stackOut_15_0 = this;
            stackIn_17_0 = stackOut_15_0;
            stackIn_16_0 = stackOut_15_0;
            if (this.field_e[param0] != null) {
              stackOut_17_0 = this;
              stackOut_17_1 = 0;
              stackIn_18_0 = stackOut_17_0;
              stackIn_18_1 = stackOut_17_1;
              break L1;
            } else {
              stackOut_16_0 = this;
              stackOut_16_1 = 1;
              stackIn_18_0 = stackOut_16_0;
              stackIn_18_1 = stackOut_16_1;
              break L1;
            }
          }
          ((rt) (this)).field_g = stackIn_18_1 != 0;
          this.field_e[param0] = ag.field_o;
          return this.field_c[param0];
        } else {
          if (-2 == (this.field_h ^ -1)) {
            L2: {
              stackOut_11_0 = this;
              stackIn_13_0 = stackOut_11_0;
              stackIn_12_0 = stackOut_11_0;
              if (this.field_b == param0) {
                stackOut_13_0 = this;
                stackOut_13_1 = 0;
                stackIn_14_0 = stackOut_13_0;
                stackIn_14_1 = stackOut_13_1;
                break L2;
              } else {
                stackOut_12_0 = this;
                stackOut_12_1 = 1;
                stackIn_14_0 = stackOut_12_0;
                stackIn_14_1 = stackOut_12_1;
                break L2;
              }
            }
            ((rt) (this)).field_g = stackIn_14_1 != 0;
            this.field_b = param0;
            return this.field_c[0];
          } else {
            L3: {
              var3 = this.field_e[param0];
              if (var3 != null) {
                this.field_g = false;
                break L3;
              } else {
                L4: {
                  this.field_g = true;
                  if (this.field_d < this.field_h) {
                    var3 = new dcb(param0, this.field_d);
                    this.field_d = this.field_d + 1;
                    break L4;
                  } else {
                    var4 = (dcb) ((Object) this.field_f.b((byte) 120));
                    var3 = new dcb(param0, var4.field_e);
                    this.field_e[var4.field_g] = null;
                    var4.b(-3846);
                    break L4;
                  }
                }
                this.field_e[param0] = var3;
                break L3;
              }
            }
            this.field_f.a(var3, (byte) -55);
            return this.field_c[var3.field_e];
          }
        }
    }

    final void a(int param0) {
        int[][] discarded$0 = null;
        int var3 = VoidHunters.field_G;
        int var2 = 0;
        if (param0 != 1) {
            discarded$0 = this.a(43, (byte) 61);
        }
        while (this.field_h > var2) {
            this.field_c[var2][0] = null;
            this.field_c[var2][1] = null;
            this.field_c[var2][2] = null;
            this.field_c[var2] = (int[][]) null;
            var2++;
        }
        this.field_c = (int[][][]) null;
        this.field_e = null;
        this.field_f.e(102);
        this.field_f = null;
    }

    final static int c(int param0) {
        boolean discarded$12 = false;
        boolean discarded$13 = false;
        int var1_int = 0;
        RuntimeException var1 = null;
        int var2 = 0;
        int stackIn_7_0 = 0;
        int stackIn_11_0 = 0;
        int stackIn_14_0 = 0;
        int stackIn_17_0 = 0;
        int stackIn_21_0 = 0;
        int stackIn_24_0 = 0;
        int stackIn_26_0 = 0;
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        int stackOut_6_0 = 0;
        int stackOut_10_0 = 0;
        int stackOut_20_0 = 0;
        int stackOut_25_0 = 0;
        int stackOut_23_0 = 0;
        int stackOut_16_0 = 0;
        int stackOut_13_0 = 0;
        var2 = VoidHunters.field_G;
        try {
          L0: {
            discarded$12 = klb.field_r.a((byte) -5, wua.field_k, dmb.field_c, true);
            klb.field_r.h(19976);
            L1: while (true) {
              if (!ata.e(127)) {
                if ((ci.field_b ^ -1) != 0) {
                  var1_int = ci.field_b;
                  cea.a(-59, -1);
                  stackOut_6_0 = var1_int;
                  stackIn_7_0 = stackOut_6_0;
                  decompiledRegionSelector0 = 0;
                  break L0;
                } else {
                  if (rg.field_b) {
                    stackOut_10_0 = 3;
                    stackIn_11_0 = stackOut_10_0;
                    decompiledRegionSelector0 = 1;
                    break L0;
                  } else {
                    if (dw.field_c != lrb.field_b) {
                      if (param0 == 1) {
                        if (!wba.field_p.a(4)) {
                          stackOut_20_0 = 1;
                          stackIn_21_0 = stackOut_20_0;
                          decompiledRegionSelector0 = 4;
                          break L0;
                        } else {
                          if (dw.field_c != dn.field_r) {
                            stackOut_25_0 = -1;
                            stackIn_26_0 = stackOut_25_0;
                            decompiledRegionSelector0 = 6;
                            break L0;
                          } else {
                            stackOut_23_0 = 2;
                            stackIn_24_0 = stackOut_23_0;
                            decompiledRegionSelector0 = 5;
                            break L0;
                          }
                        }
                      } else {
                        stackOut_16_0 = -23;
                        stackIn_17_0 = stackOut_16_0;
                        decompiledRegionSelector0 = 3;
                        break L0;
                      }
                    } else {
                      stackOut_13_0 = 1;
                      stackIn_14_0 = stackOut_13_0;
                      decompiledRegionSelector0 = 2;
                      break L0;
                    }
                  }
                }
              } else {
                discarded$13 = klb.field_r.a(-9445, pma.field_o, jl.field_r);
                continue L1;
              }
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var1 = decompiledCaughtException;
          throw rta.a((Throwable) ((Object) var1), "rt.A(" + param0 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return stackIn_7_0;
        } else {
          if (decompiledRegionSelector0 == 1) {
            return stackIn_11_0;
          } else {
            if (decompiledRegionSelector0 == 2) {
              return stackIn_14_0;
            } else {
              if (decompiledRegionSelector0 == 3) {
                return stackIn_17_0;
              } else {
                if (decompiledRegionSelector0 == 4) {
                  return stackIn_21_0;
                } else {
                  if (decompiledRegionSelector0 == 5) {
                    return stackIn_24_0;
                  } else {
                    return stackIn_26_0;
                  }
                }
              }
            }
          }
        }
    }

    rt(int param0, int param1, int param2) {
        this.field_b = -1;
        this.field_d = 0;
        this.field_f = new ij();
        this.field_g = false;
        this.field_h = param0;
        this.field_a = param1;
        this.field_c = new int[this.field_h][3][param2];
        this.field_e = new dcb[this.field_a];
    }

    static {
    }
}
