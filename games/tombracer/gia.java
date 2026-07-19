/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class gia extends ci {
    private int field_r;
    static String field_o;
    private int field_n;
    private int field_p;
    static String field_q;
    private int[] field_m;

    final void b(int param0, int param1, int param2) {
        int var4 = 0;
        int stackIn_6_0 = 0;
        int stackOut_5_0 = 0;
        int stackOut_4_0 = 0;
        super.b(param0, param1, param2);
        if ((this.field_n ^ -1) <= -1) {
          if (null == qw.field_j) {
            return;
          } else {
            L0: {
              if (qw.field_j.a((byte) -122, this.field_n).field_g) {
                stackOut_5_0 = 64;
                stackIn_6_0 = stackOut_5_0;
                break L0;
              } else {
                stackOut_4_0 = 128;
                stackIn_6_0 = stackOut_4_0;
                break L0;
              }
            }
            var4 = stackIn_6_0;
            this.field_m = qw.field_j.a(14907, this.field_n, false, var4, 1.0f, var4);
            this.field_p = var4;
            this.field_r = var4;
            return;
          }
        } else {
          return;
        }
    }

    public static void c(int param0) {
        field_o = null;
        field_q = null;
        if (param0 != -26382) {
            gia.c(102);
        }
    }

    final int c(byte param0) {
        if (param0 != -117) {
            this.field_m = (int[]) null;
            return this.field_n;
        }
        return this.field_n;
    }

    final void b(int param0) {
        if (param0 > -32) {
            return;
        }
        super.b(-116);
        this.field_m = null;
    }

    public gia() {
        super(0, false);
        this.field_n = -1;
    }

    final void a(byte param0, uia param1, int param2) {
        RuntimeException var4 = null;
        RuntimeException stackIn_7_0 = null;
        StringBuilder stackIn_7_1 = null;
        RuntimeException stackIn_8_0 = null;
        StringBuilder stackIn_8_1 = null;
        RuntimeException stackIn_9_0 = null;
        StringBuilder stackIn_9_1 = null;
        String stackIn_9_2 = null;
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        RuntimeException stackOut_6_0 = null;
        StringBuilder stackOut_6_1 = null;
        RuntimeException stackOut_8_0 = null;
        StringBuilder stackOut_8_1 = null;
        String stackOut_8_2 = null;
        RuntimeException stackOut_7_0 = null;
        StringBuilder stackOut_7_1 = null;
        String stackOut_7_2 = null;
        try {
          L0: {
            if (param0 == 107) {
              L1: {
                if (0 == param2) {
                  this.field_n = param1.d(122);
                  break L1;
                } else {
                  break L1;
                }
              }
              decompiledRegionSelector0 = 1;
              break L0;
            } else {
              decompiledRegionSelector0 = 0;
              break L0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L2: {
            var4 = decompiledCaughtException;
            stackOut_6_0 = (RuntimeException) (var4);
            stackOut_6_1 = new StringBuilder().append("gia.A(").append(param0).append(',');
            stackIn_8_0 = stackOut_6_0;
            stackIn_8_1 = stackOut_6_1;
            stackIn_7_0 = stackOut_6_0;
            stackIn_7_1 = stackOut_6_1;
            if (param1 == null) {
              stackOut_8_0 = (RuntimeException) ((Object) stackIn_8_0);
              stackOut_8_1 = (StringBuilder) ((Object) stackIn_8_1);
              stackOut_8_2 = "null";
              stackIn_9_0 = stackOut_8_0;
              stackIn_9_1 = stackOut_8_1;
              stackIn_9_2 = stackOut_8_2;
              break L2;
            } else {
              stackOut_7_0 = (RuntimeException) ((Object) stackIn_7_0);
              stackOut_7_1 = (StringBuilder) ((Object) stackIn_7_1);
              stackOut_7_2 = "{...}";
              stackIn_9_0 = stackOut_7_0;
              stackIn_9_1 = stackOut_7_1;
              stackIn_9_2 = stackOut_7_2;
              break L2;
            }
          }
          throw tba.a((Throwable) ((Object) stackIn_9_0), stackIn_9_2 + ',' + param2 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return;
        } else {
          return;
        }
    }

    final int[][] b(int param0, int param1) {
        int incrementValue$1 = 0;
        int[][] var3 = null;
        int var4 = 0;
        int[] var5 = null;
        int[] var6 = null;
        int[] var7 = null;
        int var8 = 0;
        int var9 = 0;
        int var10 = 0;
        int var11 = 0;
        int[][] var12 = null;
        int[][] var13 = null;
        int[][] var14 = null;
        int stackIn_7_0 = 0;
        int stackOut_6_0 = 0;
        int stackOut_5_0 = 0;
        var11 = TombRacer.field_G ? 1 : 0;
        if (param1 == -1) {
          var14 = this.field_h.a(param0, (byte) 124);
          var13 = var14;
          var12 = var13;
          var3 = var12;
          if (this.field_h.field_f) {
            L0: {
              if (qda.field_i == this.field_p) {
                stackOut_6_0 = param0;
                stackIn_7_0 = stackOut_6_0;
                break L0;
              } else {
                stackOut_5_0 = this.field_p * param0 / qda.field_i;
                stackIn_7_0 = stackOut_5_0;
                break L0;
              }
            }
            var4 = stackIn_7_0 * this.field_r;
            var5 = var14[0];
            var6 = var14[1];
            var7 = var14[2];
            if (this.field_r == ns.field_g) {
              var8 = 0;
              L1: while (true) {
                if (var8 >= ns.field_g) {
                  if (var11 == 0) {
                    return var12;
                  } else {
                    var8 = 0;
                    L2: while (true) {
                      L3: {
                        if (ns.field_g <= var8) {
                          break L3;
                        } else {
                          var9 = var8 * this.field_r / ns.field_g;
                          var10 = this.field_m[var4 - -var9];
                          var7[var8] = sea.c(var10, 255) << -713475132;
                          var6[var8] = sea.c(var10, 65280) >> -1564428764;
                          var5[var8] = sea.c(16711680, var10) >> -1466471540;
                          var8++;
                          if (var11 == 0) {
                            continue L2;
                          } else {
                            var8 = 0;
                            L4: while (true) {
                              if (ns.field_g <= var8) {
                                break L3;
                              } else {
                                var9 = var8 * this.field_r / ns.field_g;
                                var10 = this.field_m[var4 - -var9];
                                var7[var8] = sea.c(var10, 255) << -713475132;
                                var6[var8] = sea.c(var10, 65280) >> -1564428764;
                                var5[var8] = sea.c(16711680, var10) >> -1466471540;
                                var8++;
                                if (var11 == 0) {
                                  continue L4;
                                } else {
                                  break L3;
                                }
                              }
                            }
                          }
                        }
                      }
                      return var12;
                    }
                  }
                } else {
                  incrementValue$1 = var4;
                  var4++;
                  var9 = this.field_m[incrementValue$1];
                  var7[var8] = sea.c(4080, var9 << 92946724);
                  var6[var8] = sea.c(4080, var9 >> -598928700);
                  var5[var8] = sea.c(4080, var9 >> 880153548);
                  var8++;
                  if (var11 == 0) {
                    continue L1;
                  } else {
                    return var12;
                  }
                }
              }
            } else {
              var8 = 0;
              L5: while (true) {
                L6: {
                  if (ns.field_g <= var8) {
                    break L6;
                  } else {
                    var9 = var8 * this.field_r / ns.field_g;
                    var10 = this.field_m[var4 - -var9];
                    var7[var8] = sea.c(var10, 255) << -713475132;
                    var6[var8] = sea.c(var10, 65280) >> -1564428764;
                    var5[var8] = sea.c(16711680, var10) >> -1466471540;
                    var8++;
                    if (var11 == 0) {
                      continue L5;
                    } else {
                      var8 = 0;
                      L7: while (true) {
                        if (ns.field_g <= var8) {
                          break L6;
                        } else {
                          var9 = var8 * this.field_r / ns.field_g;
                          var10 = this.field_m[var4 - -var9];
                          var7[var8] = sea.c(var10, 255) << -713475132;
                          var6[var8] = sea.c(var10, 65280) >> -1564428764;
                          var5[var8] = sea.c(16711680, var10) >> -1466471540;
                          var8++;
                          if (var11 == 0) {
                            continue L7;
                          } else {
                            break L6;
                          }
                        }
                      }
                    }
                  }
                }
                return var12;
              }
            }
          } else {
            return var12;
          }
        } else {
          return (int[][]) null;
        }
    }

    static {
        field_o = "<%0> has lost connection.";
    }
}
