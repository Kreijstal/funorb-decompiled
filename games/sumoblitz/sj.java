/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class sj {
    static al field_c;
    static long field_a;
    static ts field_b;

    final static void a() {
        RuntimeException var1 = null;
        int var1_int = 0;
        int var2 = 0;
        long var3_long = 0L;
        int var3 = 0;
        int var4 = 0;
        int var5 = 0;
        String var6 = null;
        int var7 = 0;
        int var8 = 0;
        qn var9 = null;
        int var10 = 0;
        int stackIn_18_0 = 0;
        int stackIn_21_0 = 0;
        String stackIn_27_0 = null;
        String stackIn_34_0 = null;
        int stackIn_39_0 = 0;
        String stackIn_39_1 = null;
        int stackIn_40_0 = 0;
        String stackIn_40_1 = null;
        int stackIn_41_0 = 0;
        String stackIn_41_1 = null;
        int stackIn_41_2 = 0;
        qn stackIn_46_0 = null;
        RuntimeException decompiledCaughtException = null;
        int stackOut_17_0 = 0;
        int stackOut_16_0 = 0;
        int stackOut_20_0 = 0;
        int stackOut_19_0 = 0;
        String stackOut_26_0 = null;
        String stackOut_25_0 = null;
        String stackOut_33_0 = null;
        String stackOut_32_0 = null;
        int stackOut_38_0 = 0;
        String stackOut_38_1 = null;
        int stackOut_40_0 = 0;
        String stackOut_40_1 = null;
        int stackOut_40_2 = 0;
        int stackOut_39_0 = 0;
        String stackOut_39_1 = null;
        int stackOut_39_2 = 0;
        qn stackOut_45_0 = null;
        qn stackOut_44_0 = null;
        var10 = Sumoblitz.field_L ? 1 : 0;
        try {
          L0: {
            L1: {
              var1_int = hh.field_f;
              var2 = 0;
              if (cl.field_s == 2) {
                var3_long = wq.a(-124) + -iv.field_f;
                var2 = (int)((10999L + -var3_long) / 1000L);
                if (var2 >= 0) {
                  break L1;
                } else {
                  var2 = 0;
                  break L1;
                }
              } else {
                break L1;
              }
            }
            var3 = 0;
            L2: while (true) {
              if (bf.field_c.length <= var3) {
                break L0;
              } else {
                L3: {
                  var4 = eb.field_a[var3];
                  if (0 <= var4) {
                    if (nj.field_a.field_g != var4) {
                      var5 = rc.field_j;
                      break L3;
                    } else {
                      var5 = ds.field_a;
                      break L3;
                    }
                  } else {
                    var5 = ke.field_d;
                    break L3;
                  }
                }
                L4: {
                  var6 = bf.field_c[var3];
                  if (2 != cl.field_s) {
                    break L4;
                  } else {
                    if (1 == var2) {
                      L5: {
                        if (no.field_b.length >= hf.field_F.length) {
                          stackOut_17_0 = no.field_b.length;
                          stackIn_18_0 = stackOut_17_0;
                          break L5;
                        } else {
                          stackOut_16_0 = hf.field_F.length;
                          stackIn_18_0 = stackOut_16_0;
                          break L5;
                        }
                      }
                      L6: {
                        var7 = stackIn_18_0;
                        if (uw.field_c.length >= uw.field_b.length) {
                          stackOut_20_0 = uw.field_c.length;
                          stackIn_21_0 = stackOut_20_0;
                          break L6;
                        } else {
                          stackOut_19_0 = uw.field_b.length;
                          stackIn_21_0 = stackOut_19_0;
                          break L6;
                        }
                      }
                      L7: {
                        var8 = stackIn_21_0;
                        if (6 > var3) {
                          break L7;
                        } else {
                          if (var3 < 6 - -var7) {
                            L8: {
                              if (-var7 + (-6 + var3 + no.field_b.length) >= 0) {
                                stackOut_26_0 = no.field_b[-var7 + no.field_b.length + (var3 + -6)];
                                stackIn_27_0 = stackOut_26_0;
                                break L8;
                              } else {
                                stackOut_25_0 = "";
                                stackIn_27_0 = stackOut_25_0;
                                break L8;
                              }
                            }
                            var6 = stackIn_27_0;
                            break L7;
                          } else {
                            break L7;
                          }
                        }
                      }
                      if (var7 + 7 > var3) {
                        break L4;
                      } else {
                        if (var8 + var7 + 7 > var3) {
                          L9: {
                            if (-var7 + (var3 - 7) >= uw.field_c.length) {
                              stackOut_33_0 = "";
                              stackIn_34_0 = stackOut_33_0;
                              break L9;
                            } else {
                              stackOut_32_0 = uw.field_c[-var7 + var3 + -7];
                              stackIn_34_0 = stackOut_32_0;
                              break L9;
                            }
                          }
                          var6 = stackIn_34_0;
                          break L4;
                        } else {
                          break L4;
                        }
                      }
                    } else {
                      break L4;
                    }
                  }
                }
                L10: {
                  if (-2 == var4) {
                    var6 = Integer.toString(var2);
                    break L10;
                  } else {
                    break L10;
                  }
                }
                L11: {
                  stackOut_38_0 = -9;
                  stackOut_38_1 = (String) var6;
                  stackIn_40_0 = stackOut_38_0;
                  stackIn_40_1 = stackOut_38_1;
                  stackIn_39_0 = stackOut_38_0;
                  stackIn_39_1 = stackOut_38_1;
                  if (0 > var4) {
                    stackOut_40_0 = stackIn_40_0;
                    stackOut_40_1 = (String) (Object) stackIn_40_1;
                    stackOut_40_2 = 0;
                    stackIn_41_0 = stackOut_40_0;
                    stackIn_41_1 = stackOut_40_1;
                    stackIn_41_2 = stackOut_40_2;
                    break L11;
                  } else {
                    stackOut_39_0 = stackIn_39_0;
                    stackOut_39_1 = (String) (Object) stackIn_39_1;
                    stackOut_39_2 = 1;
                    stackIn_41_0 = stackOut_39_0;
                    stackIn_41_1 = stackOut_39_1;
                    stackIn_41_2 = stackOut_39_2;
                    break L11;
                  }
                }
                L12: {
                  var7 = gt.a((byte) stackIn_41_0, stackIn_41_1, stackIn_41_2 != 0);
                  var8 = -(var7 >> 1) + oj.field_a;
                  if (var4 >= 0) {
                    L13: {
                      var1_int = var1_int + qc.field_a;
                      if (var4 != nj.field_a.field_g) {
                        stackOut_45_0 = vp.field_e;
                        stackIn_46_0 = stackOut_45_0;
                        break L13;
                      } else {
                        stackOut_44_0 = fs.field_k;
                        stackIn_46_0 = stackOut_44_0;
                        break L13;
                      }
                    }
                    L14: {
                      var9 = stackIn_46_0;
                      if (var9 != null) {
                        var9.a((dw.field_b << 1) + var7, -dw.field_b + var8, (ag.field_b << 1) + ga.field_h, 101, var1_int);
                        break L14;
                      } else {
                        break L14;
                      }
                    }
                    var1_int = var1_int + ag.field_b;
                    break L12;
                  } else {
                    break L12;
                  }
                }
                L15: {
                  if (var4 < 0) {
                    qq.field_R.b(var6, var8, var1_int - -ia.field_d, var5, -1);
                    var1_int = var1_int + fn.field_t;
                    break L15;
                  } else {
                    ns.field_a.b(var6, var8, var1_int - -dl.field_f, var5, -1);
                    var1_int = var1_int + (qc.field_a + (ag.field_b - -ga.field_h));
                    break L15;
                  }
                }
                var3++;
                continue L2;
              }
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var1 = decompiledCaughtException;
          throw qo.a((Throwable) (Object) var1, "sj.C(" + 124 + ')');
        }
    }

    public static void a(boolean param0) {
        field_c = null;
        field_b = null;
    }

    final static boolean a(int param0) {
        nl.field_o = true;
        field_a = 15000L + wq.a(-13);
        if (param0 >= -26) {
            field_b = null;
            return jv.field_a == 11 ? true : false;
        }
        return jv.field_a == 11 ? true : false;
    }

    final static void a(int param0, int param1, int param2) {
        int var3 = 0;
        int var4 = 0;
        var4 = Sumoblitz.field_L ? 1 : 0;
        if (!t.field_p[param2]) {
          if (!wm.field_f[param2]) {
            var3 = param2;
            if (0 != var3) {
              if (1 != var3) {
                L0: {
                  if (var3 != 2) {
                    if (var3 == 3) {
                      if (param1 != 0) {
                        break L0;
                      } else {
                        fq.field_f.a(-3388, 6);
                        t.field_p[param2] = true;
                        return;
                      }
                    } else {
                      if (4 == var3) {
                        L1: {
                          if (0 == param1) {
                            fq.field_f.a(-3388, 7);
                            break L1;
                          } else {
                            break L1;
                          }
                        }
                        L2: {
                          if (param1 == 1) {
                            fq.field_f.a(-3388, 4);
                            break L2;
                          } else {
                            break L2;
                          }
                        }
                        L3: {
                          if (param1 == 2) {
                            fq.field_f.a(-3388, 8);
                            break L3;
                          } else {
                            break L3;
                          }
                        }
                        if (param1 != 3) {
                          break L0;
                        } else {
                          fq.field_f.a(-3388, 9);
                          t.field_p[param2] = true;
                          return;
                        }
                      } else {
                        if (var3 != 5) {
                          if (6 != var3) {
                            if (var3 != 8) {
                              if (var3 != 9) {
                                if (var3 != 10) {
                                  if (11 == var3) {
                                    if (param1 == 0) {
                                      fq.field_f.a(-3388, 14);
                                      t.field_p[param2] = true;
                                      break L0;
                                    } else {
                                      return;
                                    }
                                  } else {
                                    return;
                                  }
                                } else {
                                  if (0 == param1) {
                                    fq.field_f.a(-3388, 13);
                                    t.field_p[param2] = true;
                                    return;
                                  } else {
                                    return;
                                  }
                                }
                              } else {
                                if (0 == param1) {
                                  fq.field_f.a(-3388, 12);
                                  t.field_p[param2] = true;
                                  return;
                                } else {
                                  return;
                                }
                              }
                            } else {
                              if (param1 != 1) {
                                break L0;
                              } else {
                                fq.field_f.a(-3388, 11);
                                t.field_p[param2] = true;
                                return;
                              }
                            }
                          } else {
                            L4: {
                              if (0 == param1) {
                                fq.field_f.a(-3388, 18);
                                break L4;
                              } else {
                                break L4;
                              }
                            }
                            if (param1 != 4) {
                              break L0;
                            } else {
                              fq.field_f.a(-3388, 15);
                              t.field_p[param2] = true;
                              return;
                            }
                          }
                        } else {
                          if (param1 != 0) {
                            break L0;
                          } else {
                            fq.field_f.a(-3388, 10);
                            t.field_p[param2] = true;
                            return;
                          }
                        }
                      }
                    }
                  } else {
                    L5: {
                      if (param1 == 0) {
                        fq.field_f.a(-3388, 5);
                        break L5;
                      } else {
                        break L5;
                      }
                    }
                    if (param1 != 5) {
                      break L0;
                    } else {
                      fq.field_f.a(-3388, 3);
                      t.field_p[param2] = true;
                      return;
                    }
                  }
                }
                return;
              } else {
                if (0 == param1) {
                  fq.field_f.a(-3388, 2);
                  t.field_p[param2] = true;
                  return;
                } else {
                  return;
                }
              }
            } else {
              L6: {
                if (param1 == 0) {
                  fq.field_f.a(-3388, 16);
                  break L6;
                } else {
                  break L6;
                }
              }
              L7: {
                if (param1 == 1) {
                  fq.field_f.a(-3388, 0);
                  break L7;
                } else {
                  break L7;
                }
              }
              if (2 == param1) {
                fq.field_f.a(-3388, 1);
                t.field_p[param2] = true;
                return;
              } else {
                return;
              }
            }
          } else {
            return;
          }
        } else {
          return;
        }
    }

    final static boolean a(boolean param0, int param1, CharSequence param2) {
        int var3_int = 0;
        RuntimeException var3 = null;
        int var4 = 0;
        int stackIn_4_0 = 0;
        int stackIn_9_0 = 0;
        int stackIn_14_0 = 0;
        RuntimeException stackIn_16_0 = null;
        StringBuilder stackIn_16_1 = null;
        RuntimeException stackIn_17_0 = null;
        StringBuilder stackIn_17_1 = null;
        RuntimeException stackIn_18_0 = null;
        StringBuilder stackIn_18_1 = null;
        String stackIn_18_2 = null;
        RuntimeException decompiledCaughtException = null;
        int stackOut_3_0 = 0;
        int stackOut_13_0 = 0;
        int stackOut_8_0 = 0;
        RuntimeException stackOut_15_0 = null;
        StringBuilder stackOut_15_1 = null;
        RuntimeException stackOut_17_0 = null;
        StringBuilder stackOut_17_1 = null;
        String stackOut_17_2 = null;
        RuntimeException stackOut_16_0 = null;
        StringBuilder stackOut_16_1 = null;
        String stackOut_16_2 = null;
        var4 = Sumoblitz.field_L ? 1 : 0;
        try {
          L0: {
            if (!g.a(false, 0, param2)) {
              stackOut_3_0 = 0;
              stackIn_4_0 = stackOut_3_0;
              return stackIn_4_0 != 0;
            } else {
              var3_int = 0;
              L1: while (true) {
                if (param2.length() <= var3_int) {
                  stackOut_13_0 = 1;
                  stackIn_14_0 = stackOut_13_0;
                  break L0;
                } else {
                  if (jl.a((byte) 110, param2.charAt(var3_int))) {
                    var3_int++;
                    continue L1;
                  } else {
                    stackOut_8_0 = 0;
                    stackIn_9_0 = stackOut_8_0;
                    return stackIn_9_0 != 0;
                  }
                }
              }
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L2: {
            var3 = decompiledCaughtException;
            stackOut_15_0 = (RuntimeException) var3;
            stackOut_15_1 = new StringBuilder().append("sj.E(").append(false).append(',').append(126).append(',');
            stackIn_17_0 = stackOut_15_0;
            stackIn_17_1 = stackOut_15_1;
            stackIn_16_0 = stackOut_15_0;
            stackIn_16_1 = stackOut_15_1;
            if (param2 == null) {
              stackOut_17_0 = (RuntimeException) (Object) stackIn_17_0;
              stackOut_17_1 = (StringBuilder) (Object) stackIn_17_1;
              stackOut_17_2 = "null";
              stackIn_18_0 = stackOut_17_0;
              stackIn_18_1 = stackOut_17_1;
              stackIn_18_2 = stackOut_17_2;
              break L2;
            } else {
              stackOut_16_0 = (RuntimeException) (Object) stackIn_16_0;
              stackOut_16_1 = (StringBuilder) (Object) stackIn_16_1;
              stackOut_16_2 = "{...}";
              stackIn_18_0 = stackOut_16_0;
              stackIn_18_1 = stackOut_16_1;
              stackIn_18_2 = stackOut_16_2;
              break L2;
            }
          }
          throw qo.a((Throwable) (Object) stackIn_18_0, stackIn_18_2 + ')');
        }
        return stackIn_14_0 != 0;
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_b = new ts(2, 4, 4, 0);
    }
}
