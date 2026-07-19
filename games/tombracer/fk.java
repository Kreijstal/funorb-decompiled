/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class fk {
    private dq[] field_k;
    static it field_d;
    private int field_g;
    private int field_c;
    private int field_e;
    static int field_b;
    private vna field_h;
    private int[][][] field_a;
    static String field_j;
    private int field_i;
    boolean field_f;

    final int[][][] a(byte param0) {
        int var2 = 0;
        int var3 = 0;
        int var4 = 0;
        Object stackIn_7_0 = null;
        Object stackIn_8_0 = null;
        Object stackOut_6_0 = null;
        var4 = TombRacer.field_G ? 1 : 0;
        var2 = -59 % ((param0 - 3) / 52);
        if (this.field_c != this.field_e) {
          throw new RuntimeException("Can only retrieve a full image cache");
        } else {
          var3 = 0;
          L0: while (true) {
            if (var3 < this.field_e) {
              stackOut_6_0 = this;
              stackIn_8_0 = stackOut_6_0;
              stackIn_7_0 = stackOut_6_0;
              if (var4 == 0) {
                ((fk) (this)).field_k[var3] = ioa.field_n;
                var3++;
                continue L0;
              } else {
                return ((fk) (this)).field_a;
              }
            } else {
              return this.field_a;
            }
          }
        }
    }

    final int[][] a(int param0, byte param1) {
        int var3 = 0;
        dq var4 = null;
        int var6 = 0;
        dq var7 = null;
        dq var8 = null;
        Object stackIn_2_0 = null;
        Object stackIn_3_0 = null;
        Object stackIn_4_0 = null;
        int stackIn_4_1 = 0;
        Object stackIn_7_0 = null;
        Object stackIn_8_0 = null;
        Object stackIn_9_0 = null;
        int stackIn_9_1 = 0;
        Object stackOut_6_0 = null;
        Object stackOut_8_0 = null;
        int stackOut_8_1 = 0;
        Object stackOut_7_0 = null;
        int stackOut_7_1 = 0;
        Object stackOut_1_0 = null;
        Object stackOut_3_0 = null;
        int stackOut_3_1 = 0;
        Object stackOut_2_0 = null;
        int stackOut_2_1 = 0;
        var6 = TombRacer.field_G ? 1 : 0;
        var3 = 89 / ((param1 - 61) / 38);
        if (this.field_c != this.field_e) {
          if ((this.field_e ^ -1) != -2) {
            var4 = this.field_k[param0];
            var8 = var4;
            if (var4 != null) {
              this.field_f = false;
              if (var6 != 0) {
                L0: {
                  this.field_f = true;
                  if (this.field_g < this.field_e) {
                    break L0;
                  } else {
                    var7 = (dq) ((Object) this.field_h.b(3));
                    var4 = new dq(param0, var7.field_g);
                    this.field_k[var7.field_i] = null;
                    var7.p(63);
                    break L0;
                  }
                }
                var4 = var8;
                var4 = new dq(param0, this.field_g);
                this.field_g = this.field_g + 1;
                var4 = var8;
                this.field_k[param0] = var4;
                this.field_h.a((byte) 116, (vg) (var4));
                return this.field_a[var4.field_g];
              } else {
                var4 = var8;
                this.field_h.a((byte) 116, (vg) (var4));
                return this.field_a[var4.field_g];
              }
            } else {
              L1: {
                L2: {
                  var4 = var8;
                  this.field_f = true;
                  if (this.field_g < this.field_e) {
                    break L2;
                  } else {
                    var8 = (dq) ((Object) this.field_h.b(3));
                    var4 = new dq(param0, var8.field_g);
                    this.field_k[var8.field_i] = null;
                    var8.p(63);
                    if (var6 == 0) {
                      break L1;
                    } else {
                      break L2;
                    }
                  }
                }
                var4 = new dq(param0, this.field_g);
                this.field_g = this.field_g + 1;
                break L1;
              }
              this.field_k[param0] = var4;
              var4 = var8;
              this.field_h.a((byte) 116, (vg) (var4));
              return this.field_a[var4.field_g];
            }
          } else {
            L3: {
              stackOut_6_0 = this;
              stackIn_8_0 = stackOut_6_0;
              stackIn_7_0 = stackOut_6_0;
              if (this.field_i == param0) {
                stackOut_8_0 = this;
                stackOut_8_1 = 0;
                stackIn_9_0 = stackOut_8_0;
                stackIn_9_1 = stackOut_8_1;
                break L3;
              } else {
                stackOut_7_0 = this;
                stackOut_7_1 = 1;
                stackIn_9_0 = stackOut_7_0;
                stackIn_9_1 = stackOut_7_1;
                break L3;
              }
            }
            ((fk) (this)).field_f = stackIn_9_1 != 0;
            this.field_i = param0;
            return this.field_a[0];
          }
        } else {
          L4: {
            stackOut_1_0 = this;
            stackIn_3_0 = stackOut_1_0;
            stackIn_2_0 = stackOut_1_0;
            if (this.field_k[param0] != null) {
              stackOut_3_0 = this;
              stackOut_3_1 = 0;
              stackIn_4_0 = stackOut_3_0;
              stackIn_4_1 = stackOut_3_1;
              break L4;
            } else {
              stackOut_2_0 = this;
              stackOut_2_1 = 1;
              stackIn_4_0 = stackOut_2_0;
              stackIn_4_1 = stackOut_2_1;
              break L4;
            }
          }
          ((fk) (this)).field_f = stackIn_4_1 != 0;
          this.field_k[param0] = ioa.field_n;
          return this.field_a[param0];
        }
    }

    final static int a(int param0, byte param1, int param2) {
        int var3_int = 0;
        RuntimeException var3 = null;
        int var4 = 0;
        int var5 = 0;
        int var6 = 0;
        int var7 = 0;
        int var8 = 0;
        int stackIn_6_0 = 0;
        int stackIn_10_0 = 0;
        int stackIn_14_0 = 0;
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        int stackOut_13_0 = 0;
        int stackOut_5_0 = 0;
        int stackOut_9_0 = 0;
        var8 = TombRacer.field_G ? 1 : 0;
        try {
          L0: {
            L1: {
              var3_int = 0;
              if (param1 == -113) {
                break L1;
              } else {
                field_j = (String) null;
                break L1;
              }
            }
            var4 = wp.field_b;
            L2: while (true) {
              L3: {
                if (cna.field_b.length <= var3_int) {
                  stackOut_13_0 = -1;
                  stackIn_14_0 = stackOut_13_0;
                  break L3;
                } else {
                  var5 = f.field_c[var3_int];
                  stackOut_5_0 = var5;
                  stackIn_14_0 = stackOut_5_0;
                  stackIn_6_0 = stackOut_5_0;
                  if (var8 != 0) {
                    break L3;
                  } else {
                    L4: {
                      L5: {
                        if (stackIn_6_0 >= 0) {
                          break L5;
                        } else {
                          var4 = var4 + uda.field_x;
                          if (var8 == 0) {
                            break L4;
                          } else {
                            break L5;
                          }
                        }
                      }
                      var6 = apa.a((byte) -50, true, cna.field_b[var3_int]);
                      var7 = gda.field_a + -(var6 >> 1065113793);
                      var4 = var4 + aqa.field_a;
                      if (!rea.a(param2, var6 + (vra.field_a << 1973548385), var7 + -vra.field_a, param0, am.field_n - -(vf.field_d << -611719359), false, var4)) {
                        var4 = var4 + ((vf.field_d << 541864929) + (aqa.field_a + am.field_n));
                        break L4;
                      } else {
                        stackOut_9_0 = var5;
                        stackIn_10_0 = stackOut_9_0;
                        decompiledRegionSelector0 = 1;
                        break L0;
                      }
                    }
                    var3_int++;
                    continue L2;
                  }
                }
              }
              decompiledRegionSelector0 = 0;
              break L0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3 = decompiledCaughtException;
          throw tba.a((Throwable) ((Object) var3), "fk.C(" + param0 + ',' + param1 + ',' + param2 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return stackIn_14_0;
        } else {
          return stackIn_10_0;
        }
    }

    final void a(int param0) {
        int[][][] discarded$1 = null;
        int var2 = 0;
        int var3 = 0;
        var3 = TombRacer.field_G ? 1 : 0;
        var2 = 0;
        if (param0 != 2) {
          discarded$1 = this.a((byte) 23);
          L0: while (true) {
            if (var2 < this.field_e) {
              this.field_a[var2][0] = null;
              this.field_a[var2][1] = null;
              this.field_a[var2][2] = null;
              this.field_a[var2] = (int[][]) null;
              var2++;
              if (var3 == 0) {
                continue L0;
              } else {
                return;
              }
            } else {
              this.field_a = (int[][][]) null;
              this.field_k = null;
              this.field_h.d(8);
              this.field_h = null;
              return;
            }
          }
        } else {
          L1: while (true) {
            if (var2 < this.field_e) {
              this.field_a[var2][0] = null;
              this.field_a[var2][1] = null;
              this.field_a[var2][2] = null;
              this.field_a[var2] = (int[][]) null;
              var2++;
              if (var3 == 0) {
                continue L1;
              } else {
                return;
              }
            } else {
              this.field_a = (int[][][]) null;
              this.field_k = null;
              this.field_h.d(8);
              this.field_h = null;
              return;
            }
          }
        }
    }

    public static void b(int param0) {
        field_j = null;
        if (param0 >= -101) {
            return;
        }
        field_d = null;
    }

    fk(int param0, int param1, int param2) {
        this.field_g = 0;
        this.field_i = -1;
        this.field_h = new vna();
        this.field_f = false;
        this.field_c = param1;
        this.field_e = param0;
        this.field_a = new int[this.field_e][3][param2];
        this.field_k = new dq[this.field_c];
    }

    static {
        field_j = "The temple door creaks open... <br>Use <img=4><img=7><img=6><img=5> or <img=0><img=1><img=2><img=3> to reach the chamber exit to the north.";
        field_d = new it();
    }
}
