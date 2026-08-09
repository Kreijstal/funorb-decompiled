/*
 * Decompiled by CFR-JS 0.4.0.
 */
import java.util.*;

final class ul {
    static Calendar field_c;
    static int field_b;
    static dm field_a;

    public static void a(int param0) {
        field_c = null;
        field_a = null;
        if (param0 > -58) {
            j var2 = (j) null;
            ul.a((j) null, (j) null, (byte) -96);
        }
    }

    final static void b(int param0) {
        int stackIn_10_0 = 0;
        int stackIn_13_0 = 0;
        int stackIn_21_0 = 0;
        int stackIn_27_0 = 0;
        int stackIn_38_0 = 0;
        int stackIn_44_0 = 0;
        int[] stackIn_64_0;
        int stackIn_64_1;
        int stackIn_64_2;
        int stackIn_64_3;
        int[] stackIn_65_0 = null;
        int stackIn_65_1 = 0;
        int stackIn_65_2 = 0;
        int stackIn_65_3 = 0;
        int stackIn_65_4 = 0;
        int stackIn_68_5;
        int stackIn_82_0 = 0;
        int stackIn_82_1 = 0;
        RuntimeException decompiledCaughtException = null;
        int var1_int = 0;
        RuntimeException var1 = null;
        int var2 = 0;
        ja var3 = null;
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
        var16 = Geoblox.field_C;
        try {
          L0: {
            L1: {
              h.field_a = 0;
              var1_int = 0;
              var2 = 0;
              var3 = (ja) ((Object) a.field_d.g(0));
              if (param0 == -2) {
                break L1;
              } else {
                field_a = (dm) null;
                break L1;
              }
            }
            L2: while (true) {
              if (var3 == null) {
                L3: {
                  if (var1_int != 0) {
                    if (var2 == 0) {
                      stackIn_82_0 = 4;
                      stackIn_82_1 = 0;
                      jc.a(stackIn_82_0, stackIn_82_1 != 0);
                      break L3;
                    } else {
                      jc.a(5, false);
                      break L3;
                    }
                  } else {
                    break L3;
                  }
                }
                break L0;
              } else {
                L4: {
                  L5: {
                    if (-2 > (var3.field_m ^ -1)) {
                      break L5;
                    } else {
                      if (var3.field_N <= 1) {
                        break L4;
                      } else {
                        break L5;
                      }
                    }
                  }
                  L6: {
                    var3.field_K = bh.field_c;
                    if ((var3.field_m ^ -1) >= -2) {
                      stackIn_10_0 = 0;
                      break L6;
                    } else {
                      stackIn_10_0 = 1;
                      break L6;
                    }
                  }
                  L7: {
                    var4 = stackIn_10_0;
                    if (-2 <= (var3.field_N ^ -1)) {
                      stackIn_13_0 = 0;
                      break L7;
                    } else {
                      stackIn_13_0 = 1;
                      break L7;
                    }
                  }
                  var5 = stackIn_13_0;
                  var6 = 0;
                  L8: while (true) {
                    if (var6 >= var3.field_L) {
                      break L4;
                    } else {
                      L9: {
                        var1_int = 1;
                        if (var4 != 0) {
                          if (var3.field_M == var3.field_n[var6].field_M) {
                            stackIn_21_0 = 1;
                            break L9;
                          } else {
                            stackIn_21_0 = 0;
                            break L9;
                          }
                        } else {
                          stackIn_21_0 = 0;
                          break L9;
                        }
                      }
                      L10: {
                        var7 = stackIn_21_0;
                        if (var5 != 0) {
                          if (var3.field_C == var3.field_n[var6].field_C) {
                            stackIn_27_0 = 1;
                            break L10;
                          } else {
                            stackIn_27_0 = 0;
                            break L10;
                          }
                        } else {
                          stackIn_27_0 = 0;
                          break L10;
                        }
                      }
                      L11: {
                        L12: {
                          var8 = stackIn_27_0;
                          if (var7 != 0) {
                            break L12;
                          } else {
                            if (var8 == 0) {
                              break L11;
                            } else {
                              break L12;
                            }
                          }
                        }
                        var9 = var6 + 1;
                        L13: while (true) {
                          if (var9 >= var3.field_L) {
                            break L11;
                          } else {
                            L14: {
                              if (var8 != 0) {
                                if (var3.field_n[var9].field_C == var3.field_C) {
                                  stackIn_38_0 = 1;
                                  break L14;
                                } else {
                                  stackIn_38_0 = 0;
                                  break L14;
                                }
                              } else {
                                stackIn_38_0 = 0;
                                break L14;
                              }
                            }
                            L15: {
                              var10 = stackIn_38_0;
                              if (var7 != 0) {
                                if (var3.field_M == var3.field_n[var9].field_M) {
                                  stackIn_44_0 = 1;
                                  break L15;
                                } else {
                                  stackIn_44_0 = 0;
                                  break L15;
                                }
                              } else {
                                stackIn_44_0 = 0;
                                break L15;
                              }
                            }
                            L16: {
                              L17: {
                                var11 = stackIn_44_0;
                                if (var10 != 0) {
                                  break L17;
                                } else {
                                  if (var11 == 0) {
                                    break L16;
                                  } else {
                                    break L17;
                                  }
                                }
                              }
                              L18: {
                                var3.field_n[var6].field_K = bh.field_c;
                                var3.field_n[var9].field_K = bh.field_c;
                                var13 = var3.field_n[var6].field_H;
                                var12 = var3.field_H;
                                var14 = var3.field_n[var9].field_H;
                                if (var13 >= var14) {
                                  break L18;
                                } else {
                                  var15 = var13;
                                  var13 = var14;
                                  var14 = var15;
                                  break L18;
                                }
                              }
                              L19: {
                                if (var11 != 0) {
                                  dd.field_D = dd.field_D + 1;
                                  break L19;
                                } else {
                                  break L19;
                                }
                              }
                              L20: {
                                if (var11 == 0) {
                                  break L20;
                                } else {
                                  if (var10 != 0) {
                                    break L20;
                                  } else {
                                    break L20;
                                  }
                                }
                              }
                              L21: {
                                if (var10 != 0) {
                                  dk.field_b = dk.field_b + 1;
                                  break L21;
                                } else {
                                  break L21;
                                }
                              }
                              L22: {
                                if (var12 >= var14) {
                                  if (var13 <= var12) {
                                    break L22;
                                  } else {
                                    var15 = var12;
                                    var12 = var13;
                                    var13 = var15;
                                    break L22;
                                  }
                                } else {
                                  var15 = var13;
                                  var13 = var14;
                                  var14 = var12;
                                  var12 = var15;
                                  break L22;
                                }
                              }
                              L23: {
                                stackIn_64_0 = nk.field_f;

                                stackIn_64_1 = h.field_a;

                                stackIn_64_2 = nk.field_f[h.field_a];

                                stackIn_64_3 = var14;

                                if (var10 == 0) {
                                  stackIn_65_0 = (int[]) ((Object) stackIn_64_0);
                                  stackIn_65_1 = stackIn_64_1;
                                  stackIn_65_2 = stackIn_64_2;
                                  stackIn_65_3 = stackIn_64_3;
                                  stackIn_65_4 = 0;
                                  break L23;
                                } else {
                                  stackIn_65_0 = (int[]) ((Object) stackIn_64_0);
                                  stackIn_65_1 = stackIn_64_1;
                                  stackIn_65_2 = stackIn_64_2;
                                  stackIn_65_3 = stackIn_64_3;
                                  stackIn_65_4 = -2147483648;
                                  break L23;
                                }
                              }
                              L24: {










                                if (var11 == 0) {
                                  stackIn_65_0 = (int[]) ((Object) stackIn_65_0);




                                  stackIn_68_5 = 0;
                                  break L24;
                                } else {
                                  stackIn_65_0 = (int[]) ((Object) stackIn_65_0);




                                  stackIn_68_5 = 1073741824;
                                  break L24;
                                }
                              }
                              stackIn_65_0[stackIn_65_1] = lb.a(stackIn_65_2, lb.a(stackIn_65_3, lb.a(lb.a(lb.a(stackIn_65_4, stackIn_68_5), var12 << -1372000780), var13 << 147551786)));
                              h.field_a = h.field_a + 1;
                              break L16;
                            }
                            if (var10 != 0) {
                              L25: {
                                if (var11 != 0) {
                                  var2 = 1;
                                  break L25;
                                } else {
                                  break L25;
                                }
                              }
                              var9++;
                              continue L13;
                            } else {
                              var9++;
                              continue L13;
                            }
                          }
                        }
                      }
                      var6++;
                      continue L8;
                    }
                  }
                }
                var3 = (ja) ((Object) a.field_d.d(1));
                continue L2;
              }
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var1 = decompiledCaughtException;
          throw t.a((Throwable) ((Object) var1), "ul.C(" + param0 + ')');
        }
    }

    final static boolean a(j param0, j param1, byte param2) {
        int var3_int = 0;
        RuntimeException var3 = null;
        int var4 = 0;
        int stackIn_3_0 = 0;
        int stackIn_15_0 = 0;
        RuntimeException stackIn_18_0 = null;
        StringBuilder stackIn_18_1 = null;
        RuntimeException stackIn_19_0 = null;
        StringBuilder stackIn_19_1 = null;
        String stackIn_19_2 = null;
        StringBuilder stackIn_21_1 = null;
        StringBuilder stackIn_22_1 = null;
        String stackIn_22_2 = null;
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        var4 = Geoblox.field_C;
        try {
          L0: {
            if (param2 == 127) {
              L1: {
                var3_int = param0.field_kb - param1.field_kb;
                if (eg.field_l != param0.field_mb) {
                  if (param0.field_mb != null) {
                    break L1;
                  } else {
                    var3_int += 200;
                    break L1;
                  }
                } else {
                  var3_int -= 200;
                  break L1;
                }
              }
              L2: {
                if (param1.field_mb == eg.field_l) {
                  var3_int += 200;
                  break L2;
                } else {
                  if (null != param1.field_mb) {
                    break L2;
                  } else {
                    var3_int -= 200;
                    break L2;
                  }
                }
              }
              L3: {
                if (0 >= var3_int) {
                  stackIn_15_0 = 0;
                  break L3;
                } else {
                  stackIn_15_0 = 1;
                  break L3;
                }
              }
              decompiledRegionSelector0 = 1;
              break L0;
            } else {
              stackIn_3_0 = 0;
              decompiledRegionSelector0 = 0;
              break L0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L4: {
            var3 = decompiledCaughtException;
            stackIn_18_0 = (RuntimeException) (var3);

            stackIn_18_1 = new StringBuilder().append("ul.D(");

            if (param0 == null) {
              stackIn_19_0 = (RuntimeException) ((Object) stackIn_18_0);
              stackIn_19_1 = (StringBuilder) ((Object) stackIn_18_1);
              stackIn_19_2 = "null";
              break L4;
            } else {
              stackIn_19_0 = (RuntimeException) ((Object) stackIn_18_0);
              stackIn_19_1 = (StringBuilder) ((Object) stackIn_18_1);
              stackIn_19_2 = "{...}";
              break L4;
            }
          }
          L5: {


            stackIn_21_1 = ((StringBuilder) (Object) stackIn_19_1).append(stackIn_19_2).append(',');

            if (param1 == null) {
              stackIn_19_0 = (RuntimeException) ((Object) stackIn_19_0);
              stackIn_22_1 = (StringBuilder) ((Object) stackIn_21_1);
              stackIn_22_2 = "null";
              break L5;
            } else {
              stackIn_19_0 = (RuntimeException) ((Object) stackIn_19_0);
              stackIn_22_1 = (StringBuilder) ((Object) stackIn_21_1);
              stackIn_22_2 = "{...}";
              break L5;
            }
          }
          throw t.a((Throwable) ((Object) stackIn_19_0), stackIn_22_2 + ',' + param2 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return stackIn_3_0 != 0;
        } else {
          return stackIn_15_0 != 0;
        }
    }

    final static void a(int param0, rh param1) {
        dm var2 = null;
        int var3 = 0;
        int var4 = 0;
        try {
            var2 = new dm(param1.a(0, "", "final_frame.jpg"), (java.awt.Component) ((Object) f.field_kb));
            var3 = var2.field_r;
            var4 = var2.field_m;
            oc.b(param0 + 21619);
            bk.field_b = new dm(var3, 3 * var4 / 4);
            bk.field_b.e();
            var2.c(0, 0);
            cl.field_b = new dm(var3, var4 + -bk.field_b.field_m);
            cl.field_b.e();
            if (param0 != -21541) {
                field_a = (dm) null;
            }
            var2.c(0, -bk.field_b.field_m);
            cl.field_b.field_p = bk.field_b.field_m;
            id.a(true);
        } catch (RuntimeException runtimeException) {
            throw t.a((Throwable) ((Object) runtimeException), "ul.A(" + param0 + ',' + (param1 != null ? "{...}" : "null") + ')');
        }
    }

    static {
        field_c = Calendar.getInstance(TimeZone.getTimeZone("GMT"));
    }
}
