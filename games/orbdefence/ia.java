/*
 * Decompiled by CFR-JS 0.4.0.
 */
abstract class ia {
    int field_g;
    static ba field_a;
    int field_h;
    static eb field_f;
    int field_d;
    int field_c;
    int field_b;
    int field_i;
    static int[] field_j;
    static String field_e;

    final static boolean a(int param0) {
        int stackIn_8_0 = 0;
        int stackIn_20_0 = 0;
        int stackOut_18_0 = 0;
        int stackOut_6_0 = 0;
        if (param0 == 0) {
          if (pi.field_j == null) {
            if (!gj.c(1024)) {
              if (am.field_h == null) {
                if (l.a(-1)) {
                  return true;
                } else {
                  return false;
                }
              } else {
                stackOut_18_0 = 1;
                stackIn_20_0 = stackOut_18_0;
                return stackIn_20_0 != 0;
              }
            } else {
              return true;
            }
          } else {
            return true;
          }
        } else {
          field_j = (int[]) null;
          if (pi.field_j == null) {
            if (!gj.c(1024)) {
              if (am.field_h == null) {
                if (l.a(-1)) {
                  return true;
                } else {
                  return false;
                }
              } else {
                stackOut_6_0 = 1;
                stackIn_8_0 = stackOut_6_0;
                return stackIn_8_0 != 0;
              }
            } else {
              return true;
            }
          } else {
            return true;
          }
        }
    }

    public static void a(byte param0) {
        int var1 = 67 / ((66 - param0) / 58);
        field_a = null;
        field_j = null;
        field_f = null;
        field_e = null;
    }

    final static void b(int param0, int param1) {
        L0: {
          ij.field_g = param0;
          if (ml.field_c != null) {
            ml.field_c.b(param0, 111);
            break L0;
          } else {
            break L0;
          }
        }
        L1: {
          if (gi.field_f != null) {
            gi.field_f.a(0, param0);
            break L1;
          } else {
            break L1;
          }
        }
        if (param1 == -23235) {
          return;
        } else {
          field_f = (eb) null;
          return;
        }
    }

    final static void a(int param0, int param1, fb param2) {
        se var3 = null;
        RuntimeException var3_ref = null;
        RuntimeException stackIn_4_0 = null;
        StringBuilder stackIn_4_1 = null;
        RuntimeException stackIn_5_0 = null;
        StringBuilder stackIn_5_1 = null;
        RuntimeException stackIn_6_0 = null;
        StringBuilder stackIn_6_1 = null;
        String stackIn_6_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException stackOut_3_0 = null;
        StringBuilder stackOut_3_1 = null;
        RuntimeException stackOut_5_0 = null;
        StringBuilder stackOut_5_1 = null;
        String stackOut_5_2 = null;
        RuntimeException stackOut_4_0 = null;
        StringBuilder stackOut_4_1 = null;
        String stackOut_4_2 = null;
        try {
          L0: {
            var3 = uk.field_b;
            var3.i(param1, 126);
            var3.a(2, -29);
            var3.a(0, -63);
            var3.a(param2.field_h, -21);
            if (param0 < -11) {
              break L0;
            } else {
              field_a = (ba) null;
              return;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L1: {
            var3_ref = decompiledCaughtException;
            stackOut_3_0 = (RuntimeException) (var3_ref);
            stackOut_3_1 = new StringBuilder().append("ia.E(").append(param0).append(',').append(param1).append(',');
            stackIn_5_0 = stackOut_3_0;
            stackIn_5_1 = stackOut_3_1;
            stackIn_4_0 = stackOut_3_0;
            stackIn_4_1 = stackOut_3_1;
            if (param2 == null) {
              stackOut_5_0 = (RuntimeException) ((Object) stackIn_5_0);
              stackOut_5_1 = (StringBuilder) ((Object) stackIn_5_1);
              stackOut_5_2 = "null";
              stackIn_6_0 = stackOut_5_0;
              stackIn_6_1 = stackOut_5_1;
              stackIn_6_2 = stackOut_5_2;
              break L1;
            } else {
              stackOut_4_0 = (RuntimeException) ((Object) stackIn_4_0);
              stackOut_4_1 = (StringBuilder) ((Object) stackIn_4_1);
              stackOut_4_2 = "{...}";
              stackIn_6_0 = stackOut_4_0;
              stackIn_6_1 = stackOut_4_1;
              stackIn_6_2 = stackOut_4_2;
              break L1;
            }
          }
          throw dd.a((Throwable) ((Object) stackIn_6_0), stackIn_6_2 + ')');
        }
    }

    final static void a(og param0, boolean param1) {
        int dupTemp$4 = 0;
        int dupTemp$5 = 0;
        int incrementValue$6 = 0;
        int fieldTemp$7 = 0;
        RuntimeException var2 = null;
        int var2_int = 0;
        int var3 = 0;
        int var4 = 0;
        int var5 = 0;
        int stackIn_11_0 = 0;
        int stackIn_15_0 = 0;
        int stackIn_18_0 = 0;
        int stackIn_26_0 = 0;
        RuntimeException stackIn_29_0 = null;
        StringBuilder stackIn_29_1 = null;
        RuntimeException stackIn_30_0 = null;
        StringBuilder stackIn_30_1 = null;
        RuntimeException stackIn_31_0 = null;
        StringBuilder stackIn_31_1 = null;
        String stackIn_31_2 = null;
        RuntimeException decompiledCaughtException = null;
        int stackOut_10_0 = 0;
        int stackOut_14_0 = 0;
        int stackOut_17_0 = 0;
        int stackOut_25_0 = 0;
        RuntimeException stackOut_28_0 = null;
        StringBuilder stackOut_28_1 = null;
        RuntimeException stackOut_30_0 = null;
        StringBuilder stackOut_30_1 = null;
        String stackOut_30_2 = null;
        RuntimeException stackOut_29_0 = null;
        StringBuilder stackOut_29_1 = null;
        String stackOut_29_2 = null;
        var5 = OrbDefence.field_D ? 1 : 0;
        try {
          L0: {
            var2_int = 0;
            L1: while (true) {
              L2: {
                if (var2_int >= 3) {
                  var2_int = 0;
                  break L2;
                } else {
                  od.field_j[var2_int] = 0;
                  var2_int++;
                  if (var5 != 0) {
                    break L2;
                  } else {
                    continue L1;
                  }
                }
              }
              L3: {
                if (!param1) {
                  break L3;
                } else {
                  field_e = (String) null;
                  break L3;
                }
              }
              L4: while (true) {
                L5: {
                  L6: {
                    if (gl.field_b <= var2_int) {
                      break L6;
                    } else {
                      stackOut_10_0 = param0.field_d;
                      stackIn_15_0 = stackOut_10_0;
                      stackIn_11_0 = stackOut_10_0;
                      if (var5 != 0) {
                        break L5;
                      } else {
                        L7: {
                          if (stackIn_11_0 != jk.field_d[var2_int].field_d) {
                            break L7;
                          } else {
                            dupTemp$4 = jk.field_d[var2_int].b((byte) -63);
                            od.field_j[dupTemp$4] = od.field_j[dupTemp$4] + 1;
                            break L7;
                          }
                        }
                        var2_int++;
                        if (var5 == 0) {
                          continue L4;
                        } else {
                          break L6;
                        }
                      }
                    }
                  }
                  dupTemp$5 = param0.b((byte) -12);
                  od.field_j[dupTemp$5] = od.field_j[dupTemp$5] + 1;
                  var2_int = 0;
                  stackOut_14_0 = 0;
                  stackIn_15_0 = stackOut_14_0;
                  break L5;
                }
                var3 = stackIn_15_0;
                L8: while (true) {
                  L9: {
                    L10: {
                      if (gl.field_b <= var3) {
                        break L10;
                      } else {
                        stackOut_17_0 = param0.field_d ^ -1;
                        stackIn_26_0 = stackOut_17_0;
                        stackIn_18_0 = stackOut_17_0;
                        if (var5 != 0) {
                          break L9;
                        } else {
                          L11: {
                            L12: {
                              if (stackIn_18_0 == (jk.field_d[var3].field_d ^ -1)) {
                                var4 = jk.field_d[var3].b((byte) -25);
                                if (df.field_b < od.field_j[var4]) {
                                  od.field_j[var4] = od.field_j[var4] - 1;
                                  if (var5 == 0) {
                                    break L11;
                                  } else {
                                    break L12;
                                  }
                                } else {
                                  break L12;
                                }
                              } else {
                                break L12;
                              }
                            }
                            incrementValue$6 = var2_int;
                            var2_int++;
                            jk.field_d[incrementValue$6] = jk.field_d[var3];
                            break L11;
                          }
                          var3++;
                          if (var5 == 0) {
                            continue L8;
                          } else {
                            break L10;
                          }
                        }
                      }
                    }
                    stackOut_25_0 = var2_int;
                    stackIn_26_0 = stackOut_25_0;
                    break L9;
                  }
                  gl.field_b = stackIn_26_0;
                  fieldTemp$7 = gl.field_b;
                  gl.field_b = gl.field_b + 1;
                  jk.field_d[fieldTemp$7] = param0;
                  break L0;
                }
              }
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L13: {
            var2 = decompiledCaughtException;
            stackOut_28_0 = (RuntimeException) (var2);
            stackOut_28_1 = new StringBuilder().append("ia.H(");
            stackIn_30_0 = stackOut_28_0;
            stackIn_30_1 = stackOut_28_1;
            stackIn_29_0 = stackOut_28_0;
            stackIn_29_1 = stackOut_28_1;
            if (param0 == null) {
              stackOut_30_0 = (RuntimeException) ((Object) stackIn_30_0);
              stackOut_30_1 = (StringBuilder) ((Object) stackIn_30_1);
              stackOut_30_2 = "null";
              stackIn_31_0 = stackOut_30_0;
              stackIn_31_1 = stackOut_30_1;
              stackIn_31_2 = stackOut_30_2;
              break L13;
            } else {
              stackOut_29_0 = (RuntimeException) ((Object) stackIn_29_0);
              stackOut_29_1 = (StringBuilder) ((Object) stackIn_29_1);
              stackOut_29_2 = "{...}";
              stackIn_31_0 = stackOut_29_0;
              stackIn_31_1 = stackOut_29_1;
              stackIn_31_2 = stackOut_29_2;
              break L13;
            }
          }
          throw dd.a((Throwable) ((Object) stackIn_31_0), stackIn_31_2 + ',' + param1 + ')');
        }
    }

    abstract void a(int param0, int param1, int param2);

    abstract void a(int param0, int param1);

    static {
        field_j = new int[8192];
        field_a = new ba(2, 4, 4, 0);
        field_e = "<%0> BOSS";
    }
}
