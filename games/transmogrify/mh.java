/*
 * Decompiled by CFR-JS 0.4.0.
 */
import java.io.*;

final class mh {
    static int[] field_b;
    static qj field_e;
    static String field_c;
    static String field_d;
    static qj field_a;

    final static void a(int param0, String param1) {
        try {
            ql.field_a = param1;
            if (param0 != 11207) {
                field_e = (qj) null;
            }
            ba.a(108, 12);
        } catch (RuntimeException runtimeException) {
            throw ch.a((Throwable) ((Object) runtimeException), "mh.D(" + param0 + ',' + (param1 != null ? "{...}" : "null") + ')');
        }
    }

    final static q a(String param0, int param1) {
        int var2_int = 0;
        RuntimeException var2 = null;
        String[] var3 = null;
        String[] var4 = null;
        int var5 = 0;
        String var6 = null;
        q var7 = null;
        int var8 = 0;
        q stackIn_3_0 = null;
        q stackIn_7_0 = null;
        q stackIn_10_0 = null;
        q stackIn_14_0 = null;
        q stackIn_16_0 = null;
        q stackIn_19_0 = null;
        RuntimeException stackIn_21_0 = null;
        StringBuilder stackIn_21_1 = null;
        RuntimeException stackIn_22_0 = null;
        StringBuilder stackIn_22_1 = null;
        RuntimeException stackIn_23_0 = null;
        StringBuilder stackIn_23_1 = null;
        String stackIn_23_2 = null;
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        q stackOut_6_0 = null;
        q stackOut_13_0 = null;
        q stackOut_15_0 = null;
        q stackOut_18_0 = null;
        q stackOut_9_0 = null;
        q stackOut_2_0 = null;
        RuntimeException stackOut_20_0 = null;
        StringBuilder stackOut_20_1 = null;
        RuntimeException stackOut_22_0 = null;
        StringBuilder stackOut_22_1 = null;
        String stackOut_22_2 = null;
        RuntimeException stackOut_21_0 = null;
        StringBuilder stackOut_21_1 = null;
        String stackOut_21_2 = null;
        var8 = Transmogrify.field_A ? 1 : 0;
        try {
          L0: {
            var2_int = param0.length();
            if (var2_int != 0) {
              if (255 < var2_int) {
                stackOut_6_0 = rd.field_d;
                stackIn_7_0 = stackOut_6_0;
                decompiledRegionSelector0 = 1;
                break L0;
              } else {
                var3 = vi.a((char)param1, param0, 0);
                if (var3.length >= 2) {
                  var4 = var3;
                  var5 = 0;
                  L1: while (true) {
                    L2: {
                      L3: {
                        if (var5 >= var4.length) {
                          break L3;
                        } else {
                          var6 = var4[var5];
                          stackOut_13_0 = gj.a(param1 + -46, var6);
                          stackIn_19_0 = stackOut_13_0;
                          stackIn_14_0 = stackOut_13_0;
                          if (var8 != 0) {
                            break L2;
                          } else {
                            var7 = stackIn_14_0;
                            if (var7 == null) {
                              var5++;
                              if (var8 == 0) {
                                continue L1;
                              } else {
                                break L3;
                              }
                            } else {
                              stackOut_15_0 = (q) (var7);
                              stackIn_16_0 = stackOut_15_0;
                              decompiledRegionSelector0 = 4;
                              break L0;
                            }
                          }
                        }
                      }
                      stackOut_18_0 = uf.a(false, var3[var3.length - 1]);
                      stackIn_19_0 = stackOut_18_0;
                      break L2;
                    }
                    decompiledRegionSelector0 = 3;
                    break L0;
                  }
                } else {
                  stackOut_9_0 = ai.field_a;
                  stackIn_10_0 = stackOut_9_0;
                  decompiledRegionSelector0 = 2;
                  break L0;
                }
              }
            } else {
              stackOut_2_0 = ai.field_a;
              stackIn_3_0 = stackOut_2_0;
              decompiledRegionSelector0 = 0;
              break L0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L4: {
            var2 = decompiledCaughtException;
            stackOut_20_0 = (RuntimeException) (var2);
            stackOut_20_1 = new StringBuilder().append("mh.B(");
            stackIn_22_0 = stackOut_20_0;
            stackIn_22_1 = stackOut_20_1;
            stackIn_21_0 = stackOut_20_0;
            stackIn_21_1 = stackOut_20_1;
            if (param0 == null) {
              stackOut_22_0 = (RuntimeException) ((Object) stackIn_22_0);
              stackOut_22_1 = (StringBuilder) ((Object) stackIn_22_1);
              stackOut_22_2 = "null";
              stackIn_23_0 = stackOut_22_0;
              stackIn_23_1 = stackOut_22_1;
              stackIn_23_2 = stackOut_22_2;
              break L4;
            } else {
              stackOut_21_0 = (RuntimeException) ((Object) stackIn_21_0);
              stackOut_21_1 = (StringBuilder) ((Object) stackIn_21_1);
              stackOut_21_2 = "{...}";
              stackIn_23_0 = stackOut_21_0;
              stackIn_23_1 = stackOut_21_1;
              stackIn_23_2 = stackOut_21_2;
              break L4;
            }
          }
          throw ch.a((Throwable) ((Object) stackIn_23_0), stackIn_23_2 + ',' + param1 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return stackIn_3_0;
        } else {
          if (decompiledRegionSelector0 == 1) {
            return stackIn_7_0;
          } else {
            if (decompiledRegionSelector0 == 2) {
              return stackIn_10_0;
            } else {
              if (decompiledRegionSelector0 == 3) {
                return stackIn_19_0;
              } else {
                return stackIn_16_0;
              }
            }
          }
        }
    }

    final static void a(int param0, sg param1) {
        int dupTemp$4 = 0;
        int dupTemp$5 = 0;
        int incrementValue$6 = 0;
        int fieldTemp$7 = 0;
        RuntimeException var2 = null;
        int var2_int = 0;
        int var3 = 0;
        int var4 = 0;
        int var5 = 0;
        int var6 = 0;
        int var7 = 0;
        int stackIn_20_0 = 0;
        int stackIn_27_0 = 0;
        RuntimeException stackIn_30_0 = null;
        StringBuilder stackIn_30_1 = null;
        RuntimeException stackIn_31_0 = null;
        StringBuilder stackIn_31_1 = null;
        RuntimeException stackIn_32_0 = null;
        StringBuilder stackIn_32_1 = null;
        String stackIn_32_2 = null;
        RuntimeException decompiledCaughtException = null;
        int stackOut_19_0 = 0;
        int stackOut_26_0 = 0;
        RuntimeException stackOut_29_0 = null;
        StringBuilder stackOut_29_1 = null;
        RuntimeException stackOut_31_0 = null;
        StringBuilder stackOut_31_1 = null;
        String stackOut_31_2 = null;
        RuntimeException stackOut_30_0 = null;
        StringBuilder stackOut_30_1 = null;
        String stackOut_30_2 = null;
        var5 = Transmogrify.field_A ? 1 : 0;
        try {
          L0: {
            var2_int = 0;
            L1: while (true) {
              L2: {
                L3: {
                  if ((var2_int ^ -1) <= -4) {
                    break L3;
                  } else {
                    ol.field_d[var2_int] = 0;
                    var2_int++;
                    if (var5 != 0) {
                      break L2;
                    } else {
                      if (var5 == 0) {
                        continue L1;
                      } else {
                        break L3;
                      }
                    }
                  }
                }
                var2_int = 0;
                break L2;
              }
              L4: while (true) {
                L5: {
                  L6: {
                    L7: {
                      if (q.field_b <= var2_int) {
                        break L7;
                      } else {
                        var7 = param1.field_i ^ -1;
                        var6 = eg.field_a[var2_int].field_i ^ -1;
                        if (var5 != 0) {
                          if (var6 == var7) {
                            break L5;
                          } else {
                            break L6;
                          }
                        } else {
                          L8: {
                            if (var6 == var7) {
                              dupTemp$4 = eg.field_a[var2_int].a(true);
                              ol.field_d[dupTemp$4] = ol.field_d[dupTemp$4] + 1;
                              break L8;
                            } else {
                              break L8;
                            }
                          }
                          var2_int++;
                          if (var5 == 0) {
                            continue L4;
                          } else {
                            break L7;
                          }
                        }
                      }
                    }
                    if (param0 == -27968) {
                      break L5;
                    } else {
                      break L6;
                    }
                  }
                  field_b = (int[]) null;
                  break L5;
                }
                dupTemp$5 = param1.a(true);
                ol.field_d[dupTemp$5] = ol.field_d[dupTemp$5] + 1;
                var2_int = 0;
                var3 = 0;
                L9: while (true) {
                  L10: {
                    L11: {
                      if (q.field_b <= var3) {
                        break L11;
                      } else {
                        stackOut_19_0 = eg.field_a[var3].field_i;
                        stackIn_27_0 = stackOut_19_0;
                        stackIn_20_0 = stackOut_19_0;
                        if (var5 != 0) {
                          break L10;
                        } else {
                          L12: {
                            L13: {
                              if (stackIn_20_0 != param1.field_i) {
                                break L13;
                              } else {
                                var4 = eg.field_a[var3].a(true);
                                if (ol.field_d[var4] > kh.field_d) {
                                  ol.field_d[var4] = ol.field_d[var4] - 1;
                                  if (var5 == 0) {
                                    break L12;
                                  } else {
                                    break L13;
                                  }
                                } else {
                                  break L13;
                                }
                              }
                            }
                            incrementValue$6 = var2_int;
                            var2_int++;
                            eg.field_a[incrementValue$6] = eg.field_a[var3];
                            break L12;
                          }
                          var3++;
                          if (var5 == 0) {
                            continue L9;
                          } else {
                            break L11;
                          }
                        }
                      }
                    }
                    stackOut_26_0 = var2_int;
                    stackIn_27_0 = stackOut_26_0;
                    break L10;
                  }
                  q.field_b = stackIn_27_0;
                  fieldTemp$7 = q.field_b;
                  q.field_b = q.field_b + 1;
                  eg.field_a[fieldTemp$7] = param1;
                  break L0;
                }
              }
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L14: {
            var2 = decompiledCaughtException;
            stackOut_29_0 = (RuntimeException) (var2);
            stackOut_29_1 = new StringBuilder().append("mh.C(").append(param0).append(',');
            stackIn_31_0 = stackOut_29_0;
            stackIn_31_1 = stackOut_29_1;
            stackIn_30_0 = stackOut_29_0;
            stackIn_30_1 = stackOut_29_1;
            if (param1 == null) {
              stackOut_31_0 = (RuntimeException) ((Object) stackIn_31_0);
              stackOut_31_1 = (StringBuilder) ((Object) stackIn_31_1);
              stackOut_31_2 = "null";
              stackIn_32_0 = stackOut_31_0;
              stackIn_32_1 = stackOut_31_1;
              stackIn_32_2 = stackOut_31_2;
              break L14;
            } else {
              stackOut_30_0 = (RuntimeException) ((Object) stackIn_30_0);
              stackOut_30_1 = (StringBuilder) ((Object) stackIn_30_1);
              stackOut_30_2 = "{...}";
              stackIn_32_0 = stackOut_30_0;
              stackIn_32_1 = stackOut_30_1;
              stackIn_32_2 = stackOut_30_2;
              break L14;
            }
          }
          throw ch.a((Throwable) ((Object) stackIn_32_0), stackIn_32_2 + ')');
        }
    }

    final static String b(int param0) {
        if (!((bi.field_L ^ -1) <= -3)) {
            return vj.field_a;
        }
        if (null != hg.field_a) {
            if (!(hg.field_a.a((byte) -118))) {
                return dj.field_c;
            }
            return od.field_h;
        }
        if (!(cj.field_c.a((byte) -124))) {
            return vg.field_a;
        }
        if (!cj.field_c.a((byte) 120, "commonui")) {
            return aa.field_f + " - " + cj.field_c.a(0, "commonui") + "%";
        }
        if (param0 <= 75) {
            return (String) null;
        }
        if (!(wi.field_e.a((byte) -121))) {
            return dj.field_a;
        }
        if (!wi.field_e.a((byte) 120, "commonui")) {
            return i.field_c + " - " + wi.field_e.a(0, "commonui") + "%";
        }
        if (!(nd.field_n.a((byte) -123))) {
            return gk.field_a;
        }
        if (!(nd.field_n.c(32031))) {
            return fj.field_b + " - " + nd.field_n.b(-22884) + "%";
        }
        return field_d;
    }

    final static ci a(int param0, boolean param1, boolean param2, boolean param3, int param4, int param5) {
        try {
            Object var6 = null;
            Object var7 = null;
            be var8 = null;
            ci stackIn_15_0 = null;
            Throwable decompiledCaughtException = null;
            ci stackOut_14_0 = null;
            if (param0 == -26159) {
              try {
                L0: {
                  L1: {
                    var6 = null;
                    if (null != qi.field_a.field_b) {
                      kk.field_b = new we(qi.field_a.field_b, 5200, 0);
                      qi.field_a.field_b = null;
                      var6 = new ak(255, kk.field_b, new we(qi.field_a.field_h, 12000, 0), 2097152);
                      break L1;
                    } else {
                      break L1;
                    }
                  }
                  L2: {
                    var7 = null;
                    if (kk.field_b == null) {
                      break L2;
                    } else {
                      L3: {
                        if (null != oa.field_m) {
                          break L3;
                        } else {
                          oa.field_m = new we[qi.field_a.field_s.length];
                          break L3;
                        }
                      }
                      L4: {
                        if (oa.field_m[param5] != null) {
                          break L4;
                        } else {
                          oa.field_m[param5] = new we(qi.field_a.field_s[param5], 12000, 0);
                          qi.field_a.field_s[param5] = null;
                          break L4;
                        }
                      }
                      var7 = new ak(param5, kk.field_b, oa.field_m[param5], 2097152);
                      break L2;
                    }
                  }
                  L5: {
                    var8 = we.field_j.a(param5, param3, 24108, (ak) (var6), (ak) (var7));
                    if (param1) {
                      var8.a(true);
                      break L5;
                    } else {
                      break L5;
                    }
                  }
                  stackOut_14_0 = new ci(var8, param2, param4);
                  stackIn_15_0 = stackOut_14_0;
                  break L0;
                }
              } catch (java.io.IOException decompiledCaughtParameter0) {
                decompiledCaughtException = decompiledCaughtParameter0;
                var6 = (IOException) (Object) decompiledCaughtException;
                throw new RuntimeException(((IOException) (var6)).toString());
              }
              return stackIn_15_0;
            } else {
              return (ci) null;
            }
        } catch (RuntimeException | Error decompiledUncheckedException) {
            throw decompiledUncheckedException;
        } catch (Throwable decompiledCheckedException) {
            throw new RuntimeException(decompiledCheckedException);
        }
    }

    public static void a(int param0) {
        field_a = null;
        field_b = null;
        field_c = null;
        field_e = null;
        field_d = null;
        if (param0 == 0) {
            return;
        }
        mh.a(1);
    }

    static {
        field_b = new int[1024];
        field_e = new qj();
        field_d = "Please wait...";
        field_a = new qj();
    }
}
