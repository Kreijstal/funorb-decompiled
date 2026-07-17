/*
 * Decompiled by CFR-JS 0.4.0.
 */
import java.util.*;

final class md implements Iterator {
    static ka field_b;
    static int field_i;
    static int field_h;
    private da field_g;
    private da field_c;
    static boolean field_a;
    static boolean field_f;
    private int field_d;
    private fd field_e;
    static qe field_j;

    public final Object next() {
        da var1 = null;
        RuntimeException var1_ref = null;
        int var2 = 0;
        da stackIn_3_0 = null;
        da stackIn_7_0 = null;
        Object stackIn_10_0 = null;
        RuntimeException decompiledCaughtException = null;
        da stackOut_6_0 = null;
        Object stackOut_9_0 = null;
        da stackOut_2_0 = null;
        var2 = TorChallenge.field_F ? 1 : 0;
        try {
          L0: {
            if (((md) this).field_g == ((md) this).field_e.field_a[-1 + ((md) this).field_d]) {
              L1: while (true) {
                L2: {
                  if (~((md) this).field_e.field_d >= ~((md) this).field_d) {
                    break L2;
                  } else {
                    int fieldTemp$2 = ((md) this).field_d;
                    ((md) this).field_d = ((md) this).field_d + 1;
                    var1 = ((md) this).field_e.field_a[fieldTemp$2].field_f;
                    if (var1 == ((md) this).field_e.field_a[-1 + ((md) this).field_d]) {
                      if (var2 == 0) {
                        continue L1;
                      } else {
                        break L2;
                      }
                    } else {
                      ((md) this).field_c = var1;
                      ((md) this).field_g = var1.field_f;
                      stackOut_6_0 = (da) var1;
                      stackIn_7_0 = stackOut_6_0;
                      return (Object) (Object) stackIn_7_0;
                    }
                  }
                }
                stackOut_9_0 = null;
                stackIn_10_0 = stackOut_9_0;
                break L0;
              }
            } else {
              var1 = ((md) this).field_g;
              ((md) this).field_g = var1.field_f;
              ((md) this).field_c = var1;
              stackOut_2_0 = (da) var1;
              stackIn_3_0 = stackOut_2_0;
              return (Object) (Object) stackIn_3_0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var1_ref = decompiledCaughtException;
          throw oj.a((Throwable) (Object) var1_ref, "md.next()");
        }
        return stackIn_10_0;
    }

    private final void a() {
        RuntimeException var2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          L0: {
            ((md) this).field_d = 1;
            ((md) this).field_c = null;
            ((md) this).field_g = ((md) this).field_e.field_a[0].field_f;
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2 = decompiledCaughtException;
          throw oj.a((Throwable) (Object) var2, "md.C(" + 101 + 41);
        }
    }

    final static boolean a(byte param0) {
        RuntimeException var1 = null;
        int stackIn_8_0 = 0;
        int stackIn_15_0 = 0;
        boolean stackIn_18_0 = false;
        RuntimeException decompiledCaughtException = null;
        int stackOut_7_0 = 0;
        int stackOut_14_0 = 0;
        boolean stackOut_17_0 = false;
        try {
          L0: {
            L1: {
              if (param0 > 69) {
                break L1;
              } else {
                md.b(109);
                break L1;
              }
            }
            L2: {
              if (bb.field_i == -1) {
                if (pe.a((byte) 81, 1)) {
                  bb.field_i = id.field_b.j(-116);
                  id.field_b.field_q = 0;
                  break L2;
                } else {
                  stackOut_7_0 = 0;
                  stackIn_8_0 = stackOut_7_0;
                  return stackIn_8_0 != 0;
                }
              } else {
                break L2;
              }
            }
            L3: {
              if (bb.field_i == -2) {
                if (pe.a((byte) 102, 2)) {
                  bb.field_i = id.field_b.c(false);
                  id.field_b.field_q = 0;
                  break L3;
                } else {
                  stackOut_14_0 = 0;
                  stackIn_15_0 = stackOut_14_0;
                  return stackIn_15_0 != 0;
                }
              } else {
                break L3;
              }
            }
            stackOut_17_0 = pe.a((byte) 75, bb.field_i);
            stackIn_18_0 = stackOut_17_0;
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var1 = decompiledCaughtException;
          throw oj.a((Throwable) (Object) var1, "md.A(" + param0 + 41);
        }
        return stackIn_18_0;
    }

    public static void b(int param0) {
        if (param0 != -1) {
            return;
        }
        try {
            field_j = null;
            field_b = null;
        } catch (RuntimeException runtimeException) {
            throw oj.a((Throwable) (Object) runtimeException, "md.B(" + param0 + 41);
        }
    }

    final static void a(int param0, boolean param1, int param2, int param3, vg param4) {
        RuntimeException var5 = null;
        int var5_int = 0;
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
        int var17 = 0;
        int var18 = 0;
        int var19 = 0;
        int var20 = 0;
        boolean stackIn_10_0 = false;
        int stackIn_21_0 = 0;
        int stackIn_21_1 = 0;
        int stackIn_23_0 = 0;
        int stackIn_23_1 = 0;
        int stackIn_24_0 = 0;
        int stackIn_24_1 = 0;
        int stackIn_24_2 = 0;
        int stackIn_27_0 = 0;
        int stackIn_27_1 = 0;
        int stackIn_35_0 = 0;
        int stackIn_35_1 = 0;
        int stackIn_45_0 = 0;
        RuntimeException stackIn_57_0 = null;
        StringBuilder stackIn_57_1 = null;
        RuntimeException stackIn_59_0 = null;
        StringBuilder stackIn_59_1 = null;
        RuntimeException stackIn_60_0 = null;
        StringBuilder stackIn_60_1 = null;
        String stackIn_60_2 = null;
        RuntimeException decompiledCaughtException = null;
        boolean stackOut_9_0 = false;
        int stackOut_20_0 = 0;
        int stackOut_20_1 = 0;
        int stackOut_23_0 = 0;
        int stackOut_23_1 = 0;
        int stackOut_23_2 = 0;
        int stackOut_21_0 = 0;
        int stackOut_21_1 = 0;
        int stackOut_21_2 = 0;
        int stackOut_26_0 = 0;
        int stackOut_26_1 = 0;
        int stackOut_34_0 = 0;
        int stackOut_34_1 = 0;
        int stackOut_44_0 = 0;
        RuntimeException stackOut_56_0 = null;
        StringBuilder stackOut_56_1 = null;
        RuntimeException stackOut_59_0 = null;
        StringBuilder stackOut_59_1 = null;
        String stackOut_59_2 = null;
        RuntimeException stackOut_57_0 = null;
        StringBuilder stackOut_57_1 = null;
        String stackOut_57_2 = null;
        var20 = TorChallenge.field_F ? 1 : 0;
        try {
          L0: {
            L1: {
              var5_int = sa.a((byte) 119, 3 * (param3 + -param2));
              var6 = param2 * 3;
              var7 = -10 + var5_int;
              int discarded$2 = 0;
              qc.b();
              if (0 >= param4.field_s) {
                break L1;
              } else {
                if (null == param4.field_z) {
                  break L1;
                } else {
                  int discarded$3 = -13730;
                  ef.c();
                  break L1;
                }
              }
            }
            ni.field_f = 0;
            var8 = 0;
            var9 = 0;
            L2: while (true) {
              L3: {
                L4: {
                  if (~param4.field_x >= ~var8) {
                    break L4;
                  } else {
                    var10 = param4.field_i[var8];
                    var11 = param4.field_w[var8];
                    var12 = param4.field_F[var8];
                    stackOut_9_0 = param1;
                    stackIn_45_0 = stackOut_9_0 ? 1 : 0;
                    stackIn_10_0 = stackOut_9_0;
                    if (var20 != 0) {
                      break L3;
                    } else {
                      L5: {
                        L6: {
                          if (!stackIn_10_0) {
                            break L6;
                          } else {
                            var13 = tj.field_a[var10];
                            var14 = si.field_K[var10];
                            var15 = -var13 + tj.field_a[var11];
                            var16 = -var13 + tj.field_a[var12];
                            var17 = si.field_K[var11] - var14;
                            var18 = si.field_K[var12] - var14;
                            if (-(var16 * var17) + var15 * var18 >= 0) {
                              break L5;
                            } else {
                              break L6;
                            }
                          }
                        }
                        L7: {
                          var13 = bg.field_O[var10];
                          if (var13 != -2147483648) {
                            break L7;
                          } else {
                            if (var20 == 0) {
                              break L5;
                            } else {
                              break L7;
                            }
                          }
                        }
                        var14 = bg.field_O[var11];
                        if (-2147483648 == var14) {
                          break L5;
                        } else {
                          var15 = bg.field_O[var12];
                          if (var15 == -2147483648) {
                            break L5;
                          } else {
                            L8: {
                              var16 = -var6 + (var15 + var14 + var13);
                              stackOut_20_0 = vf.field_b.length;
                              stackOut_20_1 = 1;
                              stackIn_23_0 = stackOut_20_0;
                              stackIn_23_1 = stackOut_20_1;
                              stackIn_21_0 = stackOut_20_0;
                              stackIn_21_1 = stackOut_20_1;
                              if (var7 < 0) {
                                stackOut_23_0 = stackIn_23_0;
                                stackOut_23_1 = stackIn_23_1;
                                stackOut_23_2 = var16 << -var7;
                                stackIn_24_0 = stackOut_23_0;
                                stackIn_24_1 = stackOut_23_1;
                                stackIn_24_2 = stackOut_23_2;
                                break L8;
                              } else {
                                stackOut_21_0 = stackIn_21_0;
                                stackOut_21_1 = stackIn_21_1;
                                stackOut_21_2 = var16 >> var7;
                                stackIn_24_0 = stackOut_21_0;
                                stackIn_24_1 = stackOut_21_1;
                                stackIn_24_2 = stackOut_21_2;
                                break L8;
                              }
                            }
                            var17 = stackIn_24_0 - (stackIn_24_1 - -stackIn_24_2);
                            var18 = vf.field_b[var17];
                            L9: while (true) {
                              L10: {
                                L11: {
                                  if (var18 >> 4 == 0) {
                                    break L11;
                                  } else {
                                    var17--;
                                    stackOut_26_0 = ~var17;
                                    stackOut_26_1 = -1;
                                    stackIn_35_0 = stackOut_26_0;
                                    stackIn_35_1 = stackOut_26_1;
                                    stackIn_27_0 = stackOut_26_0;
                                    stackIn_27_1 = stackOut_26_1;
                                    if (var20 != 0) {
                                      break L10;
                                    } else {
                                      L12: {
                                        if (stackIn_27_0 <= stackIn_27_1) {
                                          break L12;
                                        } else {
                                          System.err.println("Out of range!");
                                          if (var20 == 0) {
                                            break L5;
                                          } else {
                                            break L12;
                                          }
                                        }
                                      }
                                      var18 = vf.field_b[var17];
                                      if (var20 == 0) {
                                        continue L9;
                                      } else {
                                        break L11;
                                      }
                                    }
                                  }
                                }
                                stackOut_34_0 = var17 << 4;
                                stackOut_34_1 = var18;
                                stackIn_35_0 = stackOut_34_0;
                                stackIn_35_1 = stackOut_34_1;
                                break L10;
                              }
                              L13: {
                                var19 = stackIn_35_0 + stackIn_35_1;
                                k.field_e[var19] = var8;
                                vf.field_b[var17] = 1 + var18;
                                if (0 >= param4.field_s) {
                                  break L13;
                                } else {
                                  if (param4.field_z != null) {
                                    m.field_i[param4.field_z[var8]] = m.field_i[param4.field_z[var8]] + 1;
                                    break L13;
                                  } else {
                                    break L13;
                                  }
                                }
                              }
                              ni.field_f = ni.field_f + 1;
                              break L5;
                            }
                          }
                        }
                      }
                      var8++;
                      if (var20 == 0) {
                        continue L2;
                      } else {
                        break L4;
                      }
                    }
                  }
                }
                stackOut_44_0 = -1;
                stackIn_45_0 = stackOut_44_0;
                break L3;
              }
              L14: {
                L15: {
                  if (stackIn_45_0 <= ~param4.field_s) {
                    break L15;
                  } else {
                    if (null == param4.field_z) {
                      break L15;
                    } else {
                      var8 = 0;
                      var9 = 0;
                      L16: while (true) {
                        if (m.field_i.length <= var9) {
                          break L15;
                        } else {
                          var10 = m.field_i[var9];
                          m.field_i[var9] = var8;
                          var8 = var8 + var10;
                          var9++;
                          if (var20 != 0) {
                            break L14;
                          } else {
                            if (var20 == 0) {
                              continue L16;
                            } else {
                              break L15;
                            }
                          }
                        }
                      }
                    }
                  }
                }
                break L14;
              }
              break L0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L17: {
            var5 = decompiledCaughtException;
            stackOut_56_0 = (RuntimeException) var5;
            stackOut_56_1 = new StringBuilder().append("md.D(").append(-2).append(44).append(param1).append(44).append(param2).append(44).append(param3).append(44);
            stackIn_59_0 = stackOut_56_0;
            stackIn_59_1 = stackOut_56_1;
            stackIn_57_0 = stackOut_56_0;
            stackIn_57_1 = stackOut_56_1;
            if (param4 == null) {
              stackOut_59_0 = (RuntimeException) (Object) stackIn_59_0;
              stackOut_59_1 = (StringBuilder) (Object) stackIn_59_1;
              stackOut_59_2 = "null";
              stackIn_60_0 = stackOut_59_0;
              stackIn_60_1 = stackOut_59_1;
              stackIn_60_2 = stackOut_59_2;
              break L17;
            } else {
              stackOut_57_0 = (RuntimeException) (Object) stackIn_57_0;
              stackOut_57_1 = (StringBuilder) (Object) stackIn_57_1;
              stackOut_57_2 = "{...}";
              stackIn_60_0 = stackOut_57_0;
              stackIn_60_1 = stackOut_57_1;
              stackIn_60_2 = stackOut_57_2;
              break L17;
            }
          }
          throw oj.a((Throwable) (Object) stackIn_60_0, stackIn_60_2 + 41);
        }
    }

    public final boolean hasNext() {
        RuntimeException var1 = null;
        int var2 = 0;
        int stackIn_5_0 = 0;
        int stackIn_9_0 = 0;
        int stackIn_12_0 = 0;
        RuntimeException decompiledCaughtException = null;
        int stackOut_4_0 = 0;
        int stackOut_8_0 = 0;
        int stackOut_11_0 = 0;
        var2 = TorChallenge.field_F ? 1 : 0;
        try {
          L0: {
            if (((md) this).field_g != ((md) this).field_e.field_a[((md) this).field_d + -1]) {
              stackOut_4_0 = 1;
              stackIn_5_0 = stackOut_4_0;
              return stackIn_5_0 != 0;
            } else {
              L1: while (true) {
                L2: {
                  if (~((md) this).field_e.field_d >= ~((md) this).field_d) {
                    break L2;
                  } else {
                    int fieldTemp$2 = ((md) this).field_d;
                    ((md) this).field_d = ((md) this).field_d + 1;
                    if (((md) this).field_e.field_a[fieldTemp$2].field_f == ((md) this).field_e.field_a[-1 + ((md) this).field_d]) {
                      ((md) this).field_g = ((md) this).field_e.field_a[((md) this).field_d + -1];
                      if (var2 == 0) {
                        continue L1;
                      } else {
                        break L2;
                      }
                    } else {
                      ((md) this).field_g = ((md) this).field_e.field_a[((md) this).field_d + -1].field_f;
                      stackOut_8_0 = 1;
                      stackIn_9_0 = stackOut_8_0;
                      return stackIn_9_0 != 0;
                    }
                  }
                }
                stackOut_11_0 = 0;
                stackIn_12_0 = stackOut_11_0;
                break L0;
              }
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var1 = decompiledCaughtException;
          throw oj.a((Throwable) (Object) var1, "md.hasNext()");
        }
        return stackIn_12_0 != 0;
    }

    public final void remove() {
        RuntimeException var1 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          L0: {
            if (((md) this).field_c != null) {
              ((md) this).field_c.a(true);
              ((md) this).field_c = null;
              break L0;
            } else {
              throw new IllegalStateException();
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var1 = decompiledCaughtException;
          throw oj.a((Throwable) (Object) var1, "md.remove()");
        }
    }

    md(fd param0) {
        RuntimeException runtimeException = null;
        RuntimeException stackIn_4_0 = null;
        StringBuilder stackIn_4_1 = null;
        RuntimeException stackIn_6_0 = null;
        StringBuilder stackIn_6_1 = null;
        RuntimeException stackIn_7_0 = null;
        StringBuilder stackIn_7_1 = null;
        String stackIn_7_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException stackOut_3_0 = null;
        StringBuilder stackOut_3_1 = null;
        RuntimeException stackOut_6_0 = null;
        StringBuilder stackOut_6_1 = null;
        String stackOut_6_2 = null;
        RuntimeException stackOut_4_0 = null;
        StringBuilder stackOut_4_1 = null;
        String stackOut_4_2 = null;
        ((md) this).field_c = null;
        try {
          L0: {
            ((md) this).field_e = param0;
            int discarded$3 = 101;
            this.a();
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L1: {
            runtimeException = decompiledCaughtException;
            stackOut_3_0 = (RuntimeException) runtimeException;
            stackOut_3_1 = new StringBuilder().append("md.<init>(");
            stackIn_6_0 = stackOut_3_0;
            stackIn_6_1 = stackOut_3_1;
            stackIn_4_0 = stackOut_3_0;
            stackIn_4_1 = stackOut_3_1;
            if (param0 == null) {
              stackOut_6_0 = (RuntimeException) (Object) stackIn_6_0;
              stackOut_6_1 = (StringBuilder) (Object) stackIn_6_1;
              stackOut_6_2 = "null";
              stackIn_7_0 = stackOut_6_0;
              stackIn_7_1 = stackOut_6_1;
              stackIn_7_2 = stackOut_6_2;
              break L1;
            } else {
              stackOut_4_0 = (RuntimeException) (Object) stackIn_4_0;
              stackOut_4_1 = (StringBuilder) (Object) stackIn_4_1;
              stackOut_4_2 = "{...}";
              stackIn_7_0 = stackOut_4_0;
              stackIn_7_1 = stackOut_4_1;
              stackIn_7_2 = stackOut_4_2;
              break L1;
            }
          }
          throw oj.a((Throwable) (Object) stackIn_7_0, stackIn_7_2 + 41);
        }
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_a = false;
        field_i = -1;
        field_h = 480;
    }
}
