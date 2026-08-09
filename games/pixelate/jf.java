/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class jf {
    static tf field_a;
    static String field_b;
    static mj field_c;

    public static void a(int param0) {
        field_a = null;
        field_c = null;
        field_b = null;
        if (param0 != -31476) {
            field_a = (tf) null;
        }
    }

    final static boolean a(boolean param0, int[] param1) {
        int stackIn_3_0 = 0;
        int stackIn_14_0 = 0;
        int stackIn_19_0 = 0;
        int stackIn_23_0 = 0;
        int stackIn_35_0 = 0;
        RuntimeException stackIn_38_0 = null;
        StringBuilder stackIn_38_1 = null;
        RuntimeException stackIn_39_0 = null;
        StringBuilder stackIn_39_1 = null;
        String stackIn_39_2 = null;
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        long var2_long = 0L;
        RuntimeException var2 = null;
        ug var4_ref_ug = null;
        int var4 = 0;
        int var5_int = 0;
        ug var5 = null;
        int var6 = 0;
        int var7 = 0;
        var7 = Pixelate.field_H ? 1 : 0;
        try {
          L0: {
            if (Pixelate.field_G == uk.field_s) {
              L1: {
                if (param0) {
                  break L1;
                } else {
                  field_c = (mj) null;
                  break L1;
                }
              }
              L2: {
                var2_long = hm.a(64);
                if (0 == ij.field_s) {
                  break L2;
                } else {
                  if (0 <= ao.field_c) {
                    break L2;
                  } else {
                    var4_ref_ug = (ug) ((Object) id.field_d.c(1504642273));
                    if (var4_ref_ug == null) {
                      break L2;
                    } else {
                      if (var2_long <= var4_ref_ug.field_o) {
                        break L2;
                      } else {
                        var4_ref_ug.c(2779);
                        jj.field_b = var4_ref_ug.field_r.length;
                        vi.field_o.field_m = 0;
                        var5_int = 0;
                        L3: while (true) {
                          if (jj.field_b <= var5_int) {
                            oj.field_G = gb.field_d;
                            gb.field_d = tm.field_U;
                            tm.field_U = mn.field_e;
                            mn.field_e = var4_ref_ug.field_m;
                            stackIn_14_0 = 1;
                            decompiledRegionSelector0 = 1;
                            break L0;
                          } else {
                            vi.field_o.field_k[var5_int] = var4_ref_ug.field_r[var5_int];
                            var5_int++;
                            continue L3;
                          }
                        }
                      }
                    }
                  }
                }
              }
              L4: while (true) {
                L5: {
                  if (-1 >= (ao.field_c ^ -1)) {
                    break L5;
                  } else {
                    vi.field_o.field_m = 0;
                    if (rd.a(1, false)) {
                      ao.field_c = vi.field_o.f((byte) 114);
                      vi.field_o.field_m = 0;
                      jj.field_b = param1[ao.field_c];
                      break L5;
                    } else {
                      stackIn_19_0 = 0;
                      decompiledRegionSelector0 = 2;
                      break L0;
                    }
                  }
                }
                if (in.e(-18481)) {
                  if (0 == ij.field_s) {
                    oj.field_G = gb.field_d;
                    gb.field_d = tm.field_U;
                    tm.field_U = mn.field_e;
                    mn.field_e = ao.field_c;
                    ao.field_c = -1;
                    stackIn_35_0 = 1;
                    decompiledRegionSelector0 = 4;
                    break L0;
                  } else {
                    L6: {
                      var4 = ij.field_s;
                      if (k.field_h != 0.0) {
                        var4 = (int)((double)var4 + ai.field_d.nextGaussian() * k.field_h);
                        if (var4 < 0) {
                          var4 = 0;
                          break L6;
                        } else {
                          break L6;
                        }
                      } else {
                        break L6;
                      }
                    }
                    var5 = new ug(var2_long - -(long)var4, ao.field_c, new byte[jj.field_b]);
                    var6 = 0;
                    L7: while (true) {
                      if (var6 >= jj.field_b) {
                        id.field_d.a(22125, var5);
                        ao.field_c = -1;
                        continue L4;
                      } else {
                        var5.field_r[var6] = vi.field_o.field_k[var6];
                        var6++;
                        continue L7;
                      }
                    }
                  }
                } else {
                  stackIn_23_0 = 0;
                  decompiledRegionSelector0 = 3;
                  break L0;
                }
              }
            } else {
              stackIn_3_0 = 0;
              decompiledRegionSelector0 = 0;
              break L0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L8: {
            var2 = decompiledCaughtException;
            stackIn_38_0 = (RuntimeException) (var2);

            stackIn_38_1 = new StringBuilder().append("jf.A(").append(param0).append(',');

            if (param1 == null) {
              stackIn_39_0 = (RuntimeException) ((Object) stackIn_38_0);
              stackIn_39_1 = (StringBuilder) ((Object) stackIn_38_1);
              stackIn_39_2 = "null";
              break L8;
            } else {
              stackIn_39_0 = (RuntimeException) ((Object) stackIn_38_0);
              stackIn_39_1 = (StringBuilder) ((Object) stackIn_38_1);
              stackIn_39_2 = "{...}";
              break L8;
            }
          }
          throw aa.a((Throwable) ((Object) stackIn_39_0), stackIn_39_2 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return stackIn_3_0 != 0;
        } else {
          if (decompiledRegionSelector0 == 1) {
            return stackIn_14_0 != 0;
          } else {
            if (decompiledRegionSelector0 == 2) {
              return stackIn_19_0 != 0;
            } else {
              if (decompiledRegionSelector0 == 3) {
                return stackIn_23_0 != 0;
              } else {
                return stackIn_35_0 != 0;
              }
            }
          }
        }
    }

    final static String a(String param0, int param1, byte param2) {
        String stackIn_3_0 = null;
        String stackIn_6_0 = null;
        String stackIn_9_0 = null;
        String stackIn_13_0 = null;
        String stackIn_18_0 = null;
        String stackIn_24_0 = null;
        String stackIn_27_0 = null;
        Object stackIn_29_0 = null;
        RuntimeException stackIn_32_0 = null;
        StringBuilder stackIn_32_1 = null;
        RuntimeException stackIn_33_0 = null;
        StringBuilder stackIn_33_1 = null;
        String stackIn_33_2 = null;
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var3 = null;
        int var4 = 0;
        pc var5 = null;
        CharSequence var6 = null;
        try {
          L0: {
            var6 = (CharSequence) ((Object) param0);
            if (!ai.a((byte) -126, var6)) {
              stackIn_3_0 = qn.field_n;
              decompiledRegionSelector0 = 0;
              break L0;
            } else {
              if (gk.field_db == 2) {
                if (!sm.a(param0, -1)) {
                  if (ha.a(param0, (byte) 37)) {
                    stackIn_13_0 = sd.a(mo.field_b, 34, new String[]{param0});
                    decompiledRegionSelector0 = 3;
                    break L0;
                  } else {
                    L1: {
                      if ((f.field_q ^ -1) > -101) {
                        break L1;
                      } else {
                        if ((uo.field_j ^ -1) >= -1) {
                          stackIn_18_0 = tm.field_Q;
                          decompiledRegionSelector0 = 4;
                          break L0;
                        } else {
                          break L1;
                        }
                      }
                    }
                    L2: {
                      if (param2 >= 57) {
                        break L2;
                      } else {
                        field_c = (mj) null;
                        break L2;
                      }
                    }
                    if ((f.field_q ^ -1) <= -201) {
                      stackIn_24_0 = tm.field_Q;
                      decompiledRegionSelector0 = 5;
                      break L0;
                    } else {
                      if (!i.a(-640, param0)) {
                        var5 = aa.field_f;
                        var5.g(param1, 15514);
                        var5.field_m = var5.field_m + 1;
                        var4 = var5.field_m;
                        var5.e(160, 0);
                        var5.b((byte) -41, param0);
                        var5.f(-var4 + var5.field_m, -1);
                        stackIn_29_0 = null;
                        decompiledRegionSelector0 = 7;
                        break L0;
                      } else {
                        stackIn_27_0 = sd.a(bm.field_r, 85, new String[]{param0});
                        decompiledRegionSelector0 = 6;
                        break L0;
                      }
                    }
                  }
                } else {
                  stackIn_9_0 = wd.field_h;
                  decompiledRegionSelector0 = 2;
                  break L0;
                }
              } else {
                stackIn_6_0 = ai.field_C;
                decompiledRegionSelector0 = 1;
                break L0;
              }
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L3: {
            var3 = decompiledCaughtException;
            stackIn_32_0 = (RuntimeException) (var3);

            stackIn_32_1 = new StringBuilder().append("jf.C(");

            if (param0 == null) {
              stackIn_33_0 = (RuntimeException) ((Object) stackIn_32_0);
              stackIn_33_1 = (StringBuilder) ((Object) stackIn_32_1);
              stackIn_33_2 = "null";
              break L3;
            } else {
              stackIn_33_0 = (RuntimeException) ((Object) stackIn_32_0);
              stackIn_33_1 = (StringBuilder) ((Object) stackIn_32_1);
              stackIn_33_2 = "{...}";
              break L3;
            }
          }
          throw aa.a((Throwable) ((Object) stackIn_33_0), stackIn_33_2 + ',' + param1 + ',' + param2 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return stackIn_3_0;
        } else {
          if (decompiledRegionSelector0 == 1) {
            return stackIn_6_0;
          } else {
            if (decompiledRegionSelector0 == 2) {
              return stackIn_9_0;
            } else {
              if (decompiledRegionSelector0 == 3) {
                return stackIn_13_0;
              } else {
                if (decompiledRegionSelector0 == 4) {
                  return stackIn_18_0;
                } else {
                  if (decompiledRegionSelector0 == 5) {
                    return stackIn_24_0;
                  } else {
                    if (decompiledRegionSelector0 == 6) {
                      return stackIn_27_0;
                    } else {
                      return (String) ((Object) stackIn_29_0);
                    }
                  }
                }
              }
            }
          }
        }
    }

    final static el a(String param0, int param1) {
        int var2_int = 0;
        RuntimeException var2 = null;
        String[] var3 = null;
        String[] var4 = null;
        int var5 = 0;
        String var6 = null;
        el var7 = null;
        int var8 = 0;
        el stackIn_4_0 = null;
        el stackIn_7_0 = null;
        el stackIn_10_0 = null;
        el stackIn_13_0 = null;
        el stackIn_19_0 = null;
        el stackIn_22_0 = null;
        RuntimeException stackIn_25_0 = null;
        StringBuilder stackIn_25_1 = null;
        RuntimeException stackIn_26_0 = null;
        StringBuilder stackIn_26_1 = null;
        String stackIn_26_2 = null;
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        var8 = Pixelate.field_H ? 1 : 0;
        try {
          L0: {
            var2_int = param0.length();
            if (0 == var2_int) {
              stackIn_4_0 = pd.field_Kb;
              decompiledRegionSelector0 = 0;
              break L0;
            } else {
              if (var2_int <= 255) {
                var3 = dd.a(param0, (byte) -96, '.');
                if (2 <= var3.length) {
                  var4 = var3;
                  if (param1 == -4384) {
                    var5 = 0;
                    L1: while (true) {
                      if (var5 >= var4.length) {
                        stackIn_22_0 = uo.a(-58, var3[var3.length + -1]);
                        decompiledRegionSelector0 = 5;
                        break L0;
                      } else {
                        var6 = var4[var5];
                        var7 = sl.a(var6, (byte) 120);
                        if (var7 != null) {
                          stackIn_19_0 = (el) (var7);
                          decompiledRegionSelector0 = 4;
                          break L0;
                        } else {
                          var5++;
                          continue L1;
                        }
                      }
                    }
                  } else {
                    stackIn_13_0 = (el) null;
                    decompiledRegionSelector0 = 3;
                    break L0;
                  }
                } else {
                  stackIn_10_0 = pd.field_Kb;
                  decompiledRegionSelector0 = 2;
                  break L0;
                }
              } else {
                stackIn_7_0 = mk.field_a;
                decompiledRegionSelector0 = 1;
                break L0;
              }
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L2: {
            var2 = decompiledCaughtException;
            stackIn_25_0 = (RuntimeException) (var2);

            stackIn_25_1 = new StringBuilder().append("jf.E(");

            if (param0 == null) {
              stackIn_26_0 = (RuntimeException) ((Object) stackIn_25_0);
              stackIn_26_1 = (StringBuilder) ((Object) stackIn_25_1);
              stackIn_26_2 = "null";
              break L2;
            } else {
              stackIn_26_0 = (RuntimeException) ((Object) stackIn_25_0);
              stackIn_26_1 = (StringBuilder) ((Object) stackIn_25_1);
              stackIn_26_2 = "{...}";
              break L2;
            }
          }
          throw aa.a((Throwable) ((Object) stackIn_26_0), stackIn_26_2 + ',' + param1 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return stackIn_4_0;
        } else {
          if (decompiledRegionSelector0 == 1) {
            return stackIn_7_0;
          } else {
            if (decompiledRegionSelector0 == 2) {
              return stackIn_10_0;
            } else {
              if (decompiledRegionSelector0 == 3) {
                return stackIn_13_0;
              } else {
                if (decompiledRegionSelector0 == 4) {
                  return stackIn_19_0;
                } else {
                  return stackIn_22_0;
                }
              }
            }
          }
        }
    }

    final static ob a(fm param0, int param1, fm param2, int param3, byte param4) {
        RuntimeException var5 = null;
        String var6 = null;
        Object stackIn_4_0 = null;
        ob stackIn_6_0 = null;
        RuntimeException stackIn_9_0 = null;
        StringBuilder stackIn_9_1 = null;
        RuntimeException stackIn_10_0 = null;
        StringBuilder stackIn_10_1 = null;
        String stackIn_10_2 = null;
        StringBuilder stackIn_12_1 = null;
        StringBuilder stackIn_13_1 = null;
        String stackIn_13_2 = null;
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        try {
          L0: {
            L1: {
              if (param4 > 96) {
                break L1;
              } else {
                var6 = (String) null;
                jf.a((String) null, -39, (byte) 9);
                break L1;
              }
            }
            if (rk.a(param3, false, param2, param1)) {
              stackIn_6_0 = ed.a(param0.a(param1, param3, true), -28628);
              decompiledRegionSelector0 = 1;
              break L0;
            } else {
              stackIn_4_0 = null;
              decompiledRegionSelector0 = 0;
              break L0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L2: {
            var5 = decompiledCaughtException;
            stackIn_9_0 = (RuntimeException) (var5);

            stackIn_9_1 = new StringBuilder().append("jf.D(");

            if (param0 == null) {
              stackIn_10_0 = (RuntimeException) ((Object) stackIn_9_0);
              stackIn_10_1 = (StringBuilder) ((Object) stackIn_9_1);
              stackIn_10_2 = "null";
              break L2;
            } else {
              stackIn_10_0 = (RuntimeException) ((Object) stackIn_9_0);
              stackIn_10_1 = (StringBuilder) ((Object) stackIn_9_1);
              stackIn_10_2 = "{...}";
              break L2;
            }
          }
          L3: {


            stackIn_12_1 = ((StringBuilder) (Object) stackIn_10_1).append(stackIn_10_2).append(',').append(param1).append(',');

            if (param2 == null) {
              stackIn_10_0 = (RuntimeException) ((Object) stackIn_10_0);
              stackIn_13_1 = (StringBuilder) ((Object) stackIn_12_1);
              stackIn_13_2 = "null";
              break L3;
            } else {
              stackIn_10_0 = (RuntimeException) ((Object) stackIn_10_0);
              stackIn_13_1 = (StringBuilder) ((Object) stackIn_12_1);
              stackIn_13_2 = "{...}";
              break L3;
            }
          }
          throw aa.a((Throwable) ((Object) stackIn_10_0), stackIn_13_2 + ',' + param3 + ',' + param4 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return (ob) ((Object) stackIn_4_0);
        } else {
          return stackIn_6_0;
        }
    }

    static {
        field_b = "Type your email address again to make sure it's correct";
    }
}
