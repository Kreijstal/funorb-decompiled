/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class kp {
    int field_j;
    int[][][] field_e;
    static String[] field_g;
    int field_k;
    int field_b;
    static ut field_m;
    static String field_i;
    boolean field_d;
    int[] field_c;
    int field_o;
    int field_n;
    static String field_a;
    int field_l;
    int field_f;
    int field_h;

    final static void a(int param0, int param1) {
        gn var2 = null;
        RuntimeException var2_ref = null;
        int var3 = 0;
        ii var4 = null;
        RuntimeException decompiledCaughtException = null;
        var3 = Kickabout.field_G;
        try {
          L0: {
            var4 = (ii) (Object) il.field_a.g(24009);
            L1: while (true) {
              if (var4 == null) {
                var2 = ap.field_j.g(24009);
                L2: while (true) {
                  if (var2 == null) {
                    L3: {
                      if (param1 <= -36) {
                        break L3;
                      } else {
                        field_g = null;
                        break L3;
                      }
                    }
                    break L0;
                  } else {
                    lb.a((byte) -105, 4);
                    var2 = ap.field_j.c(33);
                    continue L2;
                  }
                }
              } else {
                int discarded$2 = -112;
                te.a(4, var4);
                var4 = (ii) (Object) il.field_a.c(33);
                continue L1;
              }
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2_ref = decompiledCaughtException;
          throw nb.a((Throwable) (Object) var2_ref, "kp.C(" + 4 + ',' + param1 + ')');
        }
    }

    final static void a(int param0) {
        RuntimeException var1 = null;
        he var1_ref = null;
        qb var1_ref2 = null;
        int var2 = 0;
        int var3 = 0;
        RuntimeException decompiledCaughtException = null;
        var3 = Kickabout.field_G;
        try {
          L0: {
            var1_ref = (he) (Object) rp.field_B.g(24009);
            L1: while (true) {
              if (var1_ref == null) {
                var1_ref2 = (qb) (Object) kq.field_yb.g(24009);
                L2: while (true) {
                  if (var1_ref2 == null) {
                    var1_ref = (he) (Object) lw.field_d.g(24009);
                    L3: while (true) {
                      if (var1_ref == null) {
                        var2 = -15;
                        break L0;
                      } else {
                        L4: {
                          if (var1_ref.field_Jb <= 0) {
                            break L4;
                          } else {
                            var1_ref.field_Jb = var1_ref.field_Jb - 1;
                            if (var1_ref.field_Jb != 0) {
                              break L4;
                            } else {
                              var1_ref.field_Mb = 0;
                              if (var1_ref.h(-13356)) {
                                var1_ref.c((byte) -109);
                                break L4;
                              } else {
                                break L4;
                              }
                            }
                          }
                        }
                        var1_ref = (he) (Object) lw.field_d.c(33);
                        continue L3;
                      }
                    }
                  } else {
                    L5: {
                      if (0 >= var1_ref2.field_Db) {
                        break L5;
                      } else {
                        var1_ref2.field_Db = var1_ref2.field_Db - 1;
                        if (var1_ref2.field_Db == 0) {
                          var1_ref2.field_Ab = 0;
                          if (!var1_ref2.b(-7)) {
                            break L5;
                          } else {
                            var1_ref2.c((byte) -109);
                            break L5;
                          }
                        } else {
                          var1_ref2 = (qb) (Object) kq.field_yb.c(33);
                          continue L2;
                        }
                      }
                    }
                    var1_ref2 = (qb) (Object) kq.field_yb.c(33);
                    continue L2;
                  }
                }
              } else {
                L6: {
                  if (var1_ref.field_Jb > 0) {
                    var1_ref.field_Jb = var1_ref.field_Jb - 1;
                    if (var1_ref.field_Jb != 0) {
                      break L6;
                    } else {
                      var1_ref.field_Mb = 0;
                      if (var1_ref.h(-13356)) {
                        var1_ref.c((byte) -109);
                        break L6;
                      } else {
                        break L6;
                      }
                    }
                  } else {
                    break L6;
                  }
                }
                var1_ref = (he) (Object) rp.field_B.c(33);
                continue L1;
              }
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var1 = decompiledCaughtException;
          throw nb.a((Throwable) (Object) var1, "kp.D(" + -121 + ')');
        }
    }

    final void a(byte param0, ml param1) {
        RuntimeException var3 = null;
        int var3_int = 0;
        int var4 = 0;
        int var5 = 0;
        Object stackIn_7_0 = null;
        Object stackIn_8_0 = null;
        Object stackIn_9_0 = null;
        int stackIn_9_1 = 0;
        RuntimeException stackIn_20_0 = null;
        StringBuilder stackIn_20_1 = null;
        RuntimeException stackIn_21_0 = null;
        StringBuilder stackIn_21_1 = null;
        RuntimeException stackIn_22_0 = null;
        StringBuilder stackIn_22_1 = null;
        String stackIn_22_2 = null;
        RuntimeException decompiledCaughtException = null;
        Object stackOut_6_0 = null;
        Object stackOut_8_0 = null;
        int stackOut_8_1 = 0;
        Object stackOut_7_0 = null;
        int stackOut_7_1 = 0;
        RuntimeException stackOut_19_0 = null;
        StringBuilder stackOut_19_1 = null;
        RuntimeException stackOut_21_0 = null;
        StringBuilder stackOut_21_1 = null;
        String stackOut_21_2 = null;
        RuntimeException stackOut_20_0 = null;
        StringBuilder stackOut_20_1 = null;
        String stackOut_20_2 = null;
        var5 = Kickabout.field_G;
        try {
          L0: {
            L1: {
              if (param0 < -96) {
                break L1;
              } else {
                field_i = null;
                break L1;
              }
            }
            ((kp) this).field_c = new int[2];
            var3_int = 0;
            L2: while (true) {
              if (var3_int >= 2) {
                L3: {
                  stackOut_6_0 = this;
                  stackIn_8_0 = stackOut_6_0;
                  stackIn_7_0 = stackOut_6_0;
                  if (param1.h((byte) -111) != 1) {
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
                L4: {
                  ((kp) this).field_d = stackIn_9_1 != 0;
                  ((kp) this).field_f = param1.j((byte) -123);
                  ((kp) this).field_j = param1.h((byte) -126);
                  ((kp) this).field_b = param1.h((byte) -125);
                  if (5 != ((kp) this).field_f) {
                    break L4;
                  } else {
                    ((kp) this).field_o = param1.j((byte) -96);
                    ((kp) this).field_k = param1.j((byte) -104);
                    break L4;
                  }
                }
                L5: {
                  if (((kp) this).field_f != 4) {
                    break L5;
                  } else {
                    ((kp) this).field_h = param1.a((byte) 81) - 1;
                    ((kp) this).field_n = param1.h((byte) -112);
                    ((kp) this).field_l = param1.h((byte) -111);
                    var3_int = 0;
                    L6: while (true) {
                      if (var3_int >= 2) {
                        break L5;
                      } else {
                        var4 = 0;
                        L7: while (true) {
                          if (var4 >= 5) {
                            var3_int++;
                            continue L6;
                          } else {
                            ((kp) this).field_e[var3_int][var4][0] = param1.h((byte) -110);
                            ((kp) this).field_e[var3_int][var4][1] = param1.h((byte) -121);
                            var4++;
                            continue L7;
                          }
                        }
                      }
                    }
                  }
                }
                break L0;
              } else {
                ((kp) this).field_c[var3_int] = param1.j((byte) -94);
                var3_int++;
                continue L2;
              }
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L8: {
            var3 = decompiledCaughtException;
            stackOut_19_0 = (RuntimeException) var3;
            stackOut_19_1 = new StringBuilder().append("kp.B(").append(param0).append(',');
            stackIn_21_0 = stackOut_19_0;
            stackIn_21_1 = stackOut_19_1;
            stackIn_20_0 = stackOut_19_0;
            stackIn_20_1 = stackOut_19_1;
            if (param1 == null) {
              stackOut_21_0 = (RuntimeException) (Object) stackIn_21_0;
              stackOut_21_1 = (StringBuilder) (Object) stackIn_21_1;
              stackOut_21_2 = "null";
              stackIn_22_0 = stackOut_21_0;
              stackIn_22_1 = stackOut_21_1;
              stackIn_22_2 = stackOut_21_2;
              break L8;
            } else {
              stackOut_20_0 = (RuntimeException) (Object) stackIn_20_0;
              stackOut_20_1 = (StringBuilder) (Object) stackIn_20_1;
              stackOut_20_2 = "{...}";
              stackIn_22_0 = stackOut_20_0;
              stackIn_22_1 = stackOut_20_1;
              stackIn_22_2 = stackOut_20_2;
              break L8;
            }
          }
          throw nb.a((Throwable) (Object) stackIn_22_0, stackIn_22_2 + ')');
        }
    }

    final void a(boolean param0, kp param1) {
        RuntimeException var3 = null;
        int var3_int = 0;
        int var4 = 0;
        int var5 = 0;
        int var6 = 0;
        int var7 = 0;
        int var8 = 0;
        int var9 = 0;
        int var10 = 0;
        int var11 = 0;
        RuntimeException stackIn_26_0 = null;
        StringBuilder stackIn_26_1 = null;
        RuntimeException stackIn_27_0 = null;
        StringBuilder stackIn_27_1 = null;
        RuntimeException stackIn_28_0 = null;
        StringBuilder stackIn_28_1 = null;
        String stackIn_28_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException stackOut_25_0 = null;
        StringBuilder stackOut_25_1 = null;
        RuntimeException stackOut_27_0 = null;
        StringBuilder stackOut_27_1 = null;
        String stackOut_27_2 = null;
        RuntimeException stackOut_26_0 = null;
        StringBuilder stackOut_26_1 = null;
        String stackOut_26_2 = null;
        var11 = Kickabout.field_G;
        try {
          L0: {
            ((kp) this).field_k = param1.field_k;
            ((kp) this).field_o = param1.field_o;
            ((kp) this).field_b = param1.field_b;
            ((kp) this).field_f = param1.field_f;
            ((kp) this).field_h = param1.field_h;
            ((kp) this).field_j = param1.field_j;
            ((kp) this).field_c = new int[param1.field_c.length];
            var3_int = 0;
            L1: while (true) {
              if (((kp) this).field_c.length <= var3_int) {
                L2: {
                  ((kp) this).field_d = param1.field_d;
                  var3_int = param1.field_n << 16;
                  var4 = param1.field_l << 16;
                  var5 = -((kp) this).field_n + var3_int;
                  var6 = -((kp) this).field_l + var4;
                  var7 = var5 >> 4;
                  if (Math.abs(var5 >> 16) >= 50) {
                    ((kp) this).field_n = var3_int;
                    break L2;
                  } else {
                    ((kp) this).field_n = ((kp) this).field_n + var7;
                    break L2;
                  }
                }
                L3: {
                  var8 = var6 >> 4;
                  if (Math.abs(var6 >> 16) >= 50) {
                    ((kp) this).field_l = var4;
                    break L3;
                  } else {
                    ((kp) this).field_l = ((kp) this).field_l + var8;
                    break L3;
                  }
                }
                var9 = 0;
                L4: while (true) {
                  if (var9 >= 2) {
                    L5: {
                      if (!param0) {
                        break L5;
                      } else {
                        ((kp) this).field_e = null;
                        break L5;
                      }
                    }
                    break L0;
                  } else {
                    var10 = 0;
                    L6: while (true) {
                      if (var10 >= 5) {
                        var9++;
                        continue L4;
                      } else {
                        L7: {
                          var4 = param1.field_e[var9][var10][1] << 16;
                          var3_int = param1.field_e[var9][var10][0] << 16;
                          var5 = var3_int + -((kp) this).field_e[var9][var10][0];
                          var6 = -((kp) this).field_e[var9][var10][1] + var4;
                          var8 = var6 >> 4;
                          var7 = var5 >> 4;
                          if (20 > Math.abs(var5 >> 16)) {
                            ((kp) this).field_e[var9][var10][0] = ((kp) this).field_e[var9][var10][0] + var7;
                            break L7;
                          } else {
                            ((kp) this).field_e[var9][var10][0] = var3_int;
                            break L7;
                          }
                        }
                        L8: {
                          if (Math.abs(var6 >> 16) >= 20) {
                            ((kp) this).field_e[var9][var10][1] = var4;
                            break L8;
                          } else {
                            ((kp) this).field_e[var9][var10][1] = ((kp) this).field_e[var9][var10][1] + var8;
                            break L8;
                          }
                        }
                        var10++;
                        continue L6;
                      }
                    }
                  }
                }
              } else {
                ((kp) this).field_c[var3_int] = param1.field_c[var3_int];
                var3_int++;
                continue L1;
              }
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L9: {
            var3 = decompiledCaughtException;
            stackOut_25_0 = (RuntimeException) var3;
            stackOut_25_1 = new StringBuilder().append("kp.F(").append(param0).append(',');
            stackIn_27_0 = stackOut_25_0;
            stackIn_27_1 = stackOut_25_1;
            stackIn_26_0 = stackOut_25_0;
            stackIn_26_1 = stackOut_25_1;
            if (param1 == null) {
              stackOut_27_0 = (RuntimeException) (Object) stackIn_27_0;
              stackOut_27_1 = (StringBuilder) (Object) stackIn_27_1;
              stackOut_27_2 = "null";
              stackIn_28_0 = stackOut_27_0;
              stackIn_28_1 = stackOut_27_1;
              stackIn_28_2 = stackOut_27_2;
              break L9;
            } else {
              stackOut_26_0 = (RuntimeException) (Object) stackIn_26_0;
              stackOut_26_1 = (StringBuilder) (Object) stackIn_26_1;
              stackOut_26_2 = "{...}";
              stackIn_28_0 = stackOut_26_0;
              stackIn_28_1 = stackOut_26_1;
              stackIn_28_2 = stackOut_26_2;
              break L9;
            }
          }
          throw nb.a((Throwable) (Object) stackIn_28_0, stackIn_28_2 + ')');
        }
    }

    public static void a() {
        field_a = null;
        field_g = null;
        field_m = null;
        field_i = null;
    }

    final void b(boolean param0, kp param1) {
        RuntimeException var3 = null;
        int var3_int = 0;
        int var4 = 0;
        int var5 = 0;
        RuntimeException stackIn_15_0 = null;
        StringBuilder stackIn_15_1 = null;
        RuntimeException stackIn_16_0 = null;
        StringBuilder stackIn_16_1 = null;
        RuntimeException stackIn_17_0 = null;
        StringBuilder stackIn_17_1 = null;
        String stackIn_17_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException stackOut_14_0 = null;
        StringBuilder stackOut_14_1 = null;
        RuntimeException stackOut_16_0 = null;
        StringBuilder stackOut_16_1 = null;
        String stackOut_16_2 = null;
        RuntimeException stackOut_15_0 = null;
        StringBuilder stackOut_15_1 = null;
        String stackOut_15_2 = null;
        var5 = Kickabout.field_G;
        try {
          L0: {
            ((kp) this).field_o = param1.field_o;
            ((kp) this).field_k = param1.field_k;
            ((kp) this).field_h = param1.field_h;
            ((kp) this).field_f = param1.field_f;
            ((kp) this).field_c = new int[param1.field_c.length];
            var3_int = 0;
            L1: while (true) {
              if (((kp) this).field_c.length <= var3_int) {
                ((kp) this).field_l = param1.field_l << 16;
                ((kp) this).field_n = param1.field_n << 16;
                ((kp) this).field_d = param1.field_d;
                var3_int = 0;
                L2: while (true) {
                  if (2 <= var3_int) {
                    ((kp) this).field_b = param1.field_b;
                    if (!param0) {
                      ((kp) this).field_j = param1.field_j;
                      break L0;
                    } else {
                      return;
                    }
                  } else {
                    var4 = 0;
                    L3: while (true) {
                      if (var4 >= 5) {
                        var3_int++;
                        continue L2;
                      } else {
                        ((kp) this).field_e[var3_int][var4][0] = param1.field_e[var3_int][var4][0] << 16;
                        ((kp) this).field_e[var3_int][var4][1] = param1.field_e[var3_int][var4][1] << 16;
                        var4++;
                        continue L3;
                      }
                    }
                  }
                }
              } else {
                ((kp) this).field_c[var3_int] = param1.field_c[var3_int];
                var3_int++;
                continue L1;
              }
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L4: {
            var3 = decompiledCaughtException;
            stackOut_14_0 = (RuntimeException) var3;
            stackOut_14_1 = new StringBuilder().append("kp.A(").append(param0).append(',');
            stackIn_16_0 = stackOut_14_0;
            stackIn_16_1 = stackOut_14_1;
            stackIn_15_0 = stackOut_14_0;
            stackIn_15_1 = stackOut_14_1;
            if (param1 == null) {
              stackOut_16_0 = (RuntimeException) (Object) stackIn_16_0;
              stackOut_16_1 = (StringBuilder) (Object) stackIn_16_1;
              stackOut_16_2 = "null";
              stackIn_17_0 = stackOut_16_0;
              stackIn_17_1 = stackOut_16_1;
              stackIn_17_2 = stackOut_16_2;
              break L4;
            } else {
              stackOut_15_0 = (RuntimeException) (Object) stackIn_15_0;
              stackOut_15_1 = (StringBuilder) (Object) stackIn_15_1;
              stackOut_15_2 = "{...}";
              stackIn_17_0 = stackOut_15_0;
              stackIn_17_1 = stackOut_15_1;
              stackIn_17_2 = stackOut_15_2;
              break L4;
            }
          }
          throw nb.a((Throwable) (Object) stackIn_17_0, stackIn_17_2 + ')');
        }
    }

    public kp() {
        ((kp) this).field_e = new int[2][5][2];
        ((kp) this).field_c = new int[]{-1, -1};
        ((kp) this).field_j = 0;
        ((kp) this).field_o = -2;
        ((kp) this).field_k = -1;
        ((kp) this).field_b = 0;
        ((kp) this).field_n = lj.a(448, false);
        ((kp) this).field_l = lj.a(672, false);
        ((kp) this).field_f = -1;
        ((kp) this).field_h = -1;
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_a = "Waiting for other players.";
        field_i = "(1 player wants to join)";
    }
}
