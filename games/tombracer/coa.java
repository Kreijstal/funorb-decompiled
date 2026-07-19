/*
 * Decompiled by CFR-JS 0.4.0.
 */
class coa extends ci {
    private int field_o;
    int field_m;
    int[] field_p;
    static mla field_s;
    static String field_n;
    int field_r;
    static int[] field_q;

    final void a(byte param0, uia param1, int param2) {
        RuntimeException var4 = null;
        RuntimeException stackIn_6_0 = null;
        StringBuilder stackIn_6_1 = null;
        RuntimeException stackIn_7_0 = null;
        StringBuilder stackIn_7_1 = null;
        RuntimeException stackIn_8_0 = null;
        StringBuilder stackIn_8_1 = null;
        String stackIn_8_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException stackOut_5_0 = null;
        StringBuilder stackOut_5_1 = null;
        RuntimeException stackOut_7_0 = null;
        StringBuilder stackOut_7_1 = null;
        String stackOut_7_2 = null;
        RuntimeException stackOut_6_0 = null;
        StringBuilder stackOut_6_1 = null;
        String stackOut_6_2 = null;
        try {
          L0: {
            L1: {
              if (param0 == 107) {
                break L1;
              } else {
                this.field_r = -60;
                break L1;
              }
            }
            L2: {
              if (0 != param2) {
                break L2;
              } else {
                this.field_o = param1.d(122);
                break L2;
              }
            }
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L3: {
            var4 = decompiledCaughtException;
            stackOut_5_0 = (RuntimeException) (var4);
            stackOut_5_1 = new StringBuilder().append("coa.A(").append(param0).append(',');
            stackIn_7_0 = stackOut_5_0;
            stackIn_7_1 = stackOut_5_1;
            stackIn_6_0 = stackOut_5_0;
            stackIn_6_1 = stackOut_5_1;
            if (param1 == null) {
              stackOut_7_0 = (RuntimeException) ((Object) stackIn_7_0);
              stackOut_7_1 = (StringBuilder) ((Object) stackIn_7_1);
              stackOut_7_2 = "null";
              stackIn_8_0 = stackOut_7_0;
              stackIn_8_1 = stackOut_7_1;
              stackIn_8_2 = stackOut_7_2;
              break L3;
            } else {
              stackOut_6_0 = (RuntimeException) ((Object) stackIn_6_0);
              stackOut_6_1 = (StringBuilder) ((Object) stackIn_6_1);
              stackOut_6_2 = "{...}";
              stackIn_8_0 = stackOut_6_0;
              stackIn_8_1 = stackOut_6_1;
              stackIn_8_2 = stackOut_6_2;
              break L3;
            }
          }
          throw tba.a((Throwable) ((Object) stackIn_8_0), stackIn_8_2 + ',' + param2 + ')');
        }
    }

    public coa() {
        super(0, false);
        this.field_o = -1;
    }

    final int a(int param0) {
        if (param0 < 96) {
            this.b(-44);
        }
        return this.field_o;
    }

    final void b(int param0) {
        super.b(-77);
        if (param0 >= -32) {
            return;
        }
        this.field_p = null;
    }

    int[][] b(int param0, int param1) {
        int incrementValue$1 = 0;
        int[][] var3 = null;
        int[] var4 = null;
        int[] var5 = null;
        int[] var6 = null;
        int var7 = 0;
        int var8 = 0;
        int var9 = 0;
        int var10 = 0;
        int var11 = 0;
        int[][] var12 = null;
        int[][] var13 = null;
        int[][] var14 = null;
        int stackIn_5_0 = 0;
        int stackIn_6_0 = 0;
        int stackIn_7_0 = 0;
        int stackIn_7_1 = 0;
        int stackOut_4_0 = 0;
        int stackOut_6_0 = 0;
        int stackOut_6_1 = 0;
        int stackOut_5_0 = 0;
        int stackOut_5_1 = 0;
        var11 = TombRacer.field_G ? 1 : 0;
        var14 = this.field_h.a(param0, (byte) -66);
        var13 = var14;
        var12 = var13;
        var3 = var12;
        if (param1 == -1) {
          L0: {
            if (!this.field_h.field_f) {
              break L0;
            } else {
              if (!this.a(false)) {
                break L0;
              } else {
                L1: {
                  var4 = var14[0];
                  var5 = var14[1];
                  var6 = var14[2];
                  stackOut_4_0 = this.field_m;
                  stackIn_6_0 = stackOut_4_0;
                  stackIn_5_0 = stackOut_4_0;
                  if (qda.field_i != this.field_r) {
                    stackOut_6_0 = stackIn_6_0;
                    stackOut_6_1 = this.field_r * param0 / qda.field_i;
                    stackIn_7_0 = stackOut_6_0;
                    stackIn_7_1 = stackOut_6_1;
                    break L1;
                  } else {
                    stackOut_5_0 = stackIn_5_0;
                    stackOut_5_1 = param0;
                    stackIn_7_0 = stackOut_5_0;
                    stackIn_7_1 = stackOut_5_1;
                    break L1;
                  }
                }
                L2: {
                  var7 = stackIn_7_0 * stackIn_7_1;
                  if (this.field_m != ns.field_g) {
                    var8 = 0;
                    L3: while (true) {
                      if (var8 >= ns.field_g) {
                        break L0;
                      } else {
                        var9 = this.field_m * var8 / ns.field_g;
                        var10 = this.field_p[var7 - -var9];
                        var6[var8] = sea.c(4080, var10 << -2003868700);
                        var5[var8] = sea.c(var10, 65280) >> -1311564892;
                        var4[var8] = sea.c(16711680, var10) >> 943686380;
                        var8++;
                        if (var11 == 0) {
                          continue L3;
                        } else {
                          break L2;
                        }
                      }
                    }
                  } else {
                    var8 = 0;
                    L4: while (true) {
                      L5: {
                        if (ns.field_g <= var8) {
                          break L5;
                        } else {
                          incrementValue$1 = var7;
                          var7++;
                          var9 = this.field_p[incrementValue$1];
                          var6[var8] = sea.c(4080, var9 << 768834820);
                          var5[var8] = sea.c(4080, var9 >> -521245468);
                          var4[var8] = sea.c(var9, 16711680) >> -939575860;
                          var8++;
                          if (var11 != 0) {
                            break L0;
                          } else {
                            if (var11 == 0) {
                              continue L4;
                            } else {
                              break L5;
                            }
                          }
                        }
                      }
                      if (var11 == 0) {
                        break L0;
                      } else {
                        break L2;
                      }
                    }
                  }
                }
                var8 = 0;
                L6: while (true) {
                  if (var8 >= ns.field_g) {
                    break L0;
                  } else {
                    var9 = this.field_m * var8 / ns.field_g;
                    var10 = this.field_p[var7 - -var9];
                    var6[var8] = sea.c(4080, var10 << -2003868700);
                    var5[var8] = sea.c(var10, 65280) >> -1311564892;
                    var4[var8] = sea.c(16711680, var10) >> 943686380;
                    var8++;
                    if (var11 == 0) {
                      continue L6;
                    } else {
                      break L0;
                    }
                  }
                }
              }
            }
          }
          return var12;
        } else {
          return (int[][]) null;
        }
    }

    final boolean a(boolean param0) {
        if (!(null == this.field_p)) {
            return true;
        }
        if (param0) {
            return true;
        }
        if ((this.field_o ^ -1) > -1) {
            return false;
        }
        jpa var2 = -1 >= (gla.field_m ^ -1) ? jpa.a(np.field_m, gla.field_m, this.field_o) : jpa.a(np.field_m, this.field_o);
        var2.d();
        this.field_p = var2.e();
        this.field_r = var2.field_a;
        this.field_m = var2.field_i;
        return true;
    }

    public static void c(int param0) {
        field_s = null;
        if (param0 != 16711680) {
            coa.c(90);
        }
        field_n = null;
        field_q = null;
    }

    static {
        $cfr$clinit: {
            int var0 = 0;
            int var1 = 0;
            int var2 = 0;
            field_n = "<%0> chose character: <%1>";
            field_s = new mla();
            field_q = new int[256];
            var1 = 0;
            L0: while (true) {
              if (-257 >= (var1 ^ -1)) {
                break $cfr$clinit;
              } else {
                var0 = var1;
                var2 = 0;
                L1: while (true) {
                  if (var2 >= 8) {
                    field_q[var1] = var0;
                    var1++;
                    continue L0;
                  } else {
                    if (-2 == (var0 & 1 ^ -1)) {
                      var0 = var0 >>> -743502079 ^ -306674912;
                      var2++;
                      continue L1;
                    } else {
                      var0 = var0 >>> 1;
                      var2++;
                      continue L1;
                    }
                  }
                }
              }
            }
        }
    }
}
