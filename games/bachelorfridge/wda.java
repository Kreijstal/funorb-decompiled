/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class wda {
    static long field_a;
    byte field_d;
    static int[][] field_c;
    static int[] field_b;
    int field_e;
    static String field_g;
    it field_f;

    final static void a(byte param0) {
        String[][] dupTemp$0 = null;
        int[][] dupTemp$1 = null;
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var1 = null;
        int var2 = 0;
        ne var3 = null;
        int var4 = 0;
        int var5 = 0;
        int var6_int = 0;
        String[][] var6 = null;
        int[][] var7 = null;
        int var8 = 0;
        int var9 = 0;
        int var10 = 0;
        int var11 = 0;
        int var12 = 0;
        int var13 = 0;
        pf var14 = null;
        var12 = BachelorFridge.field_y;
        try {
          L0: {
            var14 = ig.field_m;
            var2 = var14.b(16711935);
            var3 = (ne) ((Object) rg.field_f.b((byte) 90));
            if (param0 >= 98) {
              L1: while (true) {
                L2: {
                  if (var3 == null) {
                    break L2;
                  } else {
                    if (var2 != var3.field_o) {
                      var3 = (ne) ((Object) rg.field_f.c(0));
                      continue L1;
                    } else {
                      break L2;
                    }
                  }
                }
                if (var3 == null) {
                  vc.a((byte) -113);
                  decompiledRegionSelector0 = 1;
                  break L0;
                } else {
                  L3: {
                    var4 = var14.b(16711935);
                    if (var4 == 0) {
                      break L3;
                    } else {
                      vs.field_a[0] = cha.field_l;
                      var5 = var3.field_i;
                      var6_int = 1;
                      L4: while (true) {
                        if (var4 <= var6_int) {
                          iw.a(var5, -10410, var4);
                          var6_int = 0;
                          L5: while (true) {
                            if (var6_int >= var4) {
                              it.a(8766, var5);
                              dupTemp$0 = new String[2][var5];
                              var3.field_k = dupTemp$0;
                              var6 = dupTemp$0;
                              dupTemp$1 = new int[2][var5 * 4];
                              var3.field_g = dupTemp$1;
                              var7 = dupTemp$1;
                              var8 = ut.field_l;
                              var9 = 0;
                              var10 = 0;
                              L6: while (true) {
                                if (var8 <= var9) {
                                  var9 = 0;
                                  var13 = 0;
                                  var10 = var13;
                                  L7: while (true) {
                                    if (var9 >= var8) {
                                      break L3;
                                    } else {
                                      L8: {
                                        var11 = fn.field_k[var5 + var9];
                                        var6[1][var13] = vs.field_a[var11];
                                        var7[1][4 * var13] = gk.field_a[var11];
                                        var7[1][4 * var13 - -1] = mba.field_a[var11];
                                        var7[1][4 * var13 - -2] = sc.field_o[var11];
                                        var7[1][4 * var13 - -3] = uda.field_X[var11];
                                        if (wb.a((byte) 52, vs.field_a[var11])) {
                                          if (sc.field_o[var11] + (mba.field_a[var11] - -uda.field_X[var11]) == 0) {
                                            var6[1][var13] = null;
                                            var13--;
                                            break L8;
                                          } else {
                                            break L8;
                                          }
                                        } else {
                                          break L8;
                                        }
                                      }
                                      var9++;
                                      var13++;
                                      continue L7;
                                    }
                                  }
                                } else {
                                  L9: {
                                    var11 = fn.field_k[var9];
                                    var6[0][var10] = vs.field_a[var11];
                                    var7[0][4 * var10] = gk.field_a[var11];
                                    var7[0][1 + var10 * 4] = mba.field_a[var11];
                                    var7[0][2 + var10 * 4] = sc.field_o[var11];
                                    var7[0][3 + var10 * 4] = uda.field_X[var11];
                                    if (!wb.a((byte) 52, vs.field_a[var11])) {
                                      break L9;
                                    } else {
                                      if (0 != sc.field_o[var11] + mba.field_a[var11] + uda.field_X[var11]) {
                                        break L9;
                                      } else {
                                        var6[0][var10] = null;
                                        var10--;
                                        break L9;
                                      }
                                    }
                                  }
                                  var9++;
                                  var10++;
                                  continue L6;
                                }
                              }
                            } else {
                              L10: {
                                ml.a(var14, 2064384);
                                if (-1 == (var6_int ^ -1)) {
                                  var3.field_h = al.field_a;
                                  var3.field_f = gk.field_b;
                                  var3.field_l = fe.field_k;
                                  var3.field_j = kka.field_g;
                                  im.a(var6_int, kka.field_g, al.field_a, false, fe.field_k, gk.field_b);
                                  break L10;
                                } else {
                                  im.a(var6_int, kka.field_g, al.field_a, false, fe.field_k, gk.field_b);
                                  break L10;
                                }
                              }
                              var6_int++;
                              continue L5;
                            }
                          }
                        } else {
                          vs.field_a[var6_int] = var14.g(80);
                          var6_int++;
                          continue L4;
                        }
                      }
                    }
                  }
                  var3.field_p = true;
                  var3.a(false);
                  decompiledRegionSelector0 = 2;
                  break L0;
                }
              }
            } else {
              decompiledRegionSelector0 = 0;
              break L0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var1 = decompiledCaughtException;
          throw pe.a((Throwable) ((Object) var1), "wda.C(" + param0 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return;
        } else {
          if (decompiledRegionSelector0 == 1) {
            return;
          } else {
            return;
          }
        }
    }

    public static void a(int param0) {
        if (param0 != 4) {
            return;
        }
        field_c = (int[][]) null;
        field_g = null;
        field_b = null;
    }

    final boolean a(boolean param0, it param1) {
        RuntimeException var3 = null;
        int stackIn_2_0 = 0;
        int stackIn_6_0 = 0;
        int stackIn_10_0 = 0;
        RuntimeException stackIn_13_0 = null;
        StringBuilder stackIn_13_1 = null;
        RuntimeException stackIn_14_0 = null;
        StringBuilder stackIn_14_1 = null;
        String stackIn_14_2 = null;
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        try {
          L0: {
            if (param1 != null) {
              L1: {
                if (this.field_f == null) {
                  break L1;
                } else {
                  if (!this.field_f.field_a) {
                    break L1;
                  } else {
                    stackIn_6_0 = 0;
                    decompiledRegionSelector0 = 1;
                    break L0;
                  }
                }
              }
              this.field_f = param1;
              this.field_f.a((byte) -83);
              if (!param0) {
                stackIn_10_0 = 1;
                decompiledRegionSelector0 = 2;
                break L0;
              } else {
                field_g = (String) null;
                return true;
              }
            } else {
              stackIn_2_0 = 0;
              decompiledRegionSelector0 = 0;
              break L0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L2: {
            var3 = decompiledCaughtException;
            stackIn_13_0 = (RuntimeException) (var3);

            stackIn_13_1 = new StringBuilder().append("wda.B(").append(param0).append(',');

            if (param1 == null) {
              stackIn_14_0 = (RuntimeException) ((Object) stackIn_13_0);
              stackIn_14_1 = (StringBuilder) ((Object) stackIn_13_1);
              stackIn_14_2 = "null";
              break L2;
            } else {
              stackIn_14_0 = (RuntimeException) ((Object) stackIn_13_0);
              stackIn_14_1 = (StringBuilder) ((Object) stackIn_13_1);
              stackIn_14_2 = "{...}";
              break L2;
            }
          }
          throw pe.a((Throwable) ((Object) stackIn_14_0), stackIn_14_2 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return stackIn_2_0 != 0;
        } else {
          if (decompiledRegionSelector0 == 1) {
            return stackIn_6_0 != 0;
          } else {
            return stackIn_10_0 != 0;
          }
        }
    }

    wda(byte param0, int param1) {
        this.field_d = param0;
        this.field_e = param1;
    }

    wda(lu param0) {
        RuntimeException runtimeException = null;
        RuntimeException stackIn_6_0 = null;
        StringBuilder stackIn_6_1 = null;
        RuntimeException stackIn_7_0 = null;
        StringBuilder stackIn_7_1 = null;
        String stackIn_7_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          L0: {
            L1: {
              this.field_d = param0.b(true);
              this.field_e = param0.b(16711935);
              if (param0.b(true) == -1) {
                break L1;
              } else {
                param0.field_g = param0.field_g - 1;
                this.field_f = new it(param0);
                break L1;
              }
            }
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L2: {
            runtimeException = decompiledCaughtException;
            stackIn_6_0 = (RuntimeException) (runtimeException);

            stackIn_6_1 = new StringBuilder().append("wda.<init>(");

            if (param0 == null) {
              stackIn_7_0 = (RuntimeException) ((Object) stackIn_6_0);
              stackIn_7_1 = (StringBuilder) ((Object) stackIn_6_1);
              stackIn_7_2 = "null";
              break L2;
            } else {
              stackIn_7_0 = (RuntimeException) ((Object) stackIn_6_0);
              stackIn_7_1 = (StringBuilder) ((Object) stackIn_6_1);
              stackIn_7_2 = "{...}";
              break L2;
            }
          }
          throw pe.a((Throwable) ((Object) stackIn_7_0), stackIn_7_2 + ')');
        }
    }

    static {
        field_g = "Wait...";
        field_b = new int[24];
    }
}
