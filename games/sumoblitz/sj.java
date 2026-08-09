/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class sj {
    static al field_c;
    static long field_a;
    static ts field_b;

    final static void a(byte param0) {
        int stackIn_20_0 = 0;
        int stackIn_23_0 = 0;
        String stackIn_29_0 = null;
        String stackIn_36_0 = null;
        int stackIn_42_0 = 0;
        String stackIn_42_1 = null;
        int stackIn_43_0 = 0;
        String stackIn_43_1 = null;
        int stackIn_43_2 = 0;
        qn stackIn_48_0 = null;
        RuntimeException decompiledCaughtException = null;
        int var1_int = 0;
        RuntimeException var1 = null;
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
        var10 = Sumoblitz.field_L ? 1 : 0;
        try {
          L0: {
            L1: {
              var1_int = hh.field_f;
              if (param0 >= 118) {
                break L1;
              } else {
                sj.a(false);
                break L1;
              }
            }
            L2: {
              var2 = 0;
              if (cl.field_s == 2) {
                var3_long = wq.a(-124) + -iv.field_f;
                var2 = (int)((10999L + -var3_long) / 1000L);
                if (-1 >= (var2 ^ -1)) {
                  break L2;
                } else {
                  var2 = 0;
                  break L2;
                }
              } else {
                break L2;
              }
            }
            var3 = 0;
            L3: while (true) {
              if (bf.field_c.length <= var3) {
                break L0;
              } else {
                L4: {
                  var4 = eb.field_a[var3];
                  if (0 <= var4) {
                    if (nj.field_a.field_g != var4) {
                      var5 = rc.field_j;
                      break L4;
                    } else {
                      var5 = ds.field_a;
                      break L4;
                    }
                  } else {
                    var5 = ke.field_d;
                    break L4;
                  }
                }
                L5: {
                  var6 = bf.field_c[var3];
                  if (2 != cl.field_s) {
                    break L5;
                  } else {
                    if (1 == var2) {
                      L6: {
                        if (no.field_b.length >= hf.field_F.length) {
                          stackIn_20_0 = no.field_b.length;
                          break L6;
                        } else {
                          stackIn_20_0 = hf.field_F.length;
                          break L6;
                        }
                      }
                      L7: {
                        var7 = stackIn_20_0;
                        if (uw.field_c.length >= uw.field_b.length) {
                          stackIn_23_0 = uw.field_c.length;
                          break L7;
                        } else {
                          stackIn_23_0 = uw.field_b.length;
                          break L7;
                        }
                      }
                      L8: {
                        var8 = stackIn_23_0;
                        if (6 > var3) {
                          break L8;
                        } else {
                          if (var3 < 6 - -var7) {
                            L9: {
                              if (-var7 + (-6 + var3 + no.field_b.length) >= 0) {
                                stackIn_29_0 = no.field_b[-var7 + no.field_b.length + (var3 + -6)];
                                break L9;
                              } else {
                                stackIn_29_0 = "";
                                break L9;
                              }
                            }
                            var6 = stackIn_29_0;
                            break L8;
                          } else {
                            break L8;
                          }
                        }
                      }
                      if (var7 + 7 > var3) {
                        break L5;
                      } else {
                        if (var8 + var7 + 7 > var3) {
                          L10: {
                            if (-var7 + (var3 - 7) >= uw.field_c.length) {
                              stackIn_36_0 = "";
                              break L10;
                            } else {
                              stackIn_36_0 = uw.field_c[-var7 + var3 + -7];
                              break L10;
                            }
                          }
                          var6 = stackIn_36_0;
                          break L5;
                        } else {
                          break L5;
                        }
                      }
                    } else {
                      break L5;
                    }
                  }
                }
                L11: {
                  if (-2 == var4) {
                    var6 = Integer.toString(var2);
                    break L11;
                  } else {
                    break L11;
                  }
                }
                L12: {
                  stackIn_42_0 = -9;

                  stackIn_42_1 = (String) (var6);

                  if (0 > var4) {
                    stackIn_43_0 = stackIn_42_0;
                    stackIn_43_1 = (String) ((Object) stackIn_42_1);
                    stackIn_43_2 = 0;
                    break L12;
                  } else {
                    stackIn_43_0 = stackIn_42_0;
                    stackIn_43_1 = (String) ((Object) stackIn_42_1);
                    stackIn_43_2 = 1;
                    break L12;
                  }
                }
                L13: {
                  var7 = gt.a((byte) stackIn_43_0, stackIn_43_1, stackIn_43_2 != 0);
                  var8 = -(var7 >> 821055745) + oj.field_a;
                  if ((var4 ^ -1) <= -1) {
                    L14: {
                      var1_int = var1_int + qc.field_a;
                      if (var4 != nj.field_a.field_g) {
                        stackIn_48_0 = vp.field_e;
                        break L14;
                      } else {
                        stackIn_48_0 = fs.field_k;
                        break L14;
                      }
                    }
                    L15: {
                      var9 = stackIn_48_0;
                      if (var9 != null) {
                        var9.a((dw.field_b << 1411955297) + var7, -dw.field_b + var8, (ag.field_b << -646696383) + ga.field_h, 101, var1_int);
                        break L15;
                      } else {
                        break L15;
                      }
                    }
                    var1_int = var1_int + ag.field_b;
                    break L13;
                  } else {
                    break L13;
                  }
                }
                L16: {
                  if ((var4 ^ -1) > -1) {
                    qq.field_R.b(var6, var8, var1_int - -ia.field_d, var5, -1);
                    var1_int = var1_int + fn.field_t;
                    break L16;
                  } else {
                    ns.field_a.b(var6, var8, var1_int - -dl.field_f, var5, -1);
                    var1_int = var1_int + (qc.field_a + (ag.field_b - -ga.field_h));
                    break L16;
                  }
                }
                var3++;
                continue L3;
              }
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var1 = decompiledCaughtException;
          throw qo.a((Throwable) ((Object) var1), "sj.C(" + param0 + ')');
        }
    }

    public static void a(boolean param0) {
        field_c = null;
        if (!param0) {
            sj.a(-105, -2, -5);
            field_b = null;
            return;
        }
        field_b = null;
    }

    final static boolean a(int param0) {
        int stackIn_4_0 = 0;
        int stackIn_8_0 = 0;
        nl.field_o = true;
        field_a = 15000L + wq.a(-13);
        if (param0 >= -26) {
          L0: {
            field_b = (ts) null;
            if (-12 != (jv.field_a ^ -1)) {
              stackIn_8_0 = 0;
              break L0;
            } else {
              stackIn_8_0 = 1;
              break L0;
            }
          }
          return stackIn_8_0 != 0;
        } else {
          L1: {
            if (-12 != (jv.field_a ^ -1)) {
              stackIn_4_0 = 0;
              break L1;
            } else {
              stackIn_4_0 = 1;
              break L1;
            }
          }
          return stackIn_4_0 != 0;
        }
    }

    final static void a(int param0, int param1, int param2) {
        int var3;
        int var4;
        var4 = Sumoblitz.field_L ? 1 : 0;
        if (param0 != -1) {
          sj.a(-9);
          if (!t.field_p[param2]) {
            if (wm.field_f[param2]) {
              return;
            } else {
              var3 = param2;
              if (0 != var3) {
                if (1 != var3) {
                  L0: {
                    if (-3 != (var3 ^ -1)) {
                      if ((var3 ^ -1) == -4) {
                        if (-1 != (param1 ^ -1)) {
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
                            if (-2 == (param1 ^ -1)) {
                              fq.field_f.a(param0 ^ 3387, 4);
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
                          if ((param1 ^ -1) != -4) {
                            break L0;
                          } else {
                            fq.field_f.a(param0 ^ 3387, 9);
                            t.field_p[param2] = true;
                            return;
                          }
                        } else {
                          if (-6 != (var3 ^ -1)) {
                            if (6 != var3) {
                              if ((var3 ^ -1) != -9) {
                                if (-10 != (var3 ^ -1)) {
                                  if (-11 != (var3 ^ -1)) {
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
                                      fq.field_f.a(param0 ^ 3387, 13);
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
                                if ((param1 ^ -1) != -2) {
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
                              if ((param1 ^ -1) != -5) {
                                break L0;
                              } else {
                                fq.field_f.a(param0 + -3387, 15);
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
                          fq.field_f.a(param0 ^ 3387, 5);
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
                    fq.field_f.a(param0 ^ 3387, 2);
                    t.field_p[param2] = true;
                    return;
                  } else {
                    return;
                  }
                }
              } else {
                L6: {
                  if (-1 == (param1 ^ -1)) {
                    fq.field_f.a(param0 ^ 3387, 16);
                    break L6;
                  } else {
                    break L6;
                  }
                }
                L7: {
                  if (-2 == (param1 ^ -1)) {
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
            }
          } else {
            return;
          }
        } else {
          L8: {
            if (t.field_p[param2]) {
              break L8;
            } else {
              if (wm.field_f[param2]) {
                break L8;
              } else {
                L9: {
                  var3 = param2;
                  if (0 != var3) {
                    if (1 != var3) {
                      if (-3 != (var3 ^ -1)) {
                        if ((var3 ^ -1) == -4) {
                          if (-1 == (param1 ^ -1)) {
                            fq.field_f.a(-3388, 6);
                            t.field_p[param2] = true;
                            break L9;
                          } else {
                            return;
                          }
                        } else {
                          if (4 == var3) {
                            L10: {
                              if (0 == param1) {
                                fq.field_f.a(-3388, 7);
                                break L10;
                              } else {
                                break L10;
                              }
                            }
                            L11: {
                              if (-2 == (param1 ^ -1)) {
                                fq.field_f.a(param0 ^ 3387, 4);
                                break L11;
                              } else {
                                break L11;
                              }
                            }
                            L12: {
                              if (param1 == 2) {
                                fq.field_f.a(-3388, 8);
                                break L12;
                              } else {
                                break L12;
                              }
                            }
                            if ((param1 ^ -1) == -4) {
                              fq.field_f.a(param0 ^ 3387, 9);
                              t.field_p[param2] = true;
                              break L9;
                            } else {
                              return;
                            }
                          } else {
                            if (-6 != (var3 ^ -1)) {
                              if (6 != var3) {
                                if ((var3 ^ -1) != -9) {
                                  if (-10 != (var3 ^ -1)) {
                                    if (-11 != (var3 ^ -1)) {
                                      if (11 == var3) {
                                        if (param1 == 0) {
                                          fq.field_f.a(-3388, 14);
                                          t.field_p[param2] = true;
                                          return;
                                        } else {
                                          return;
                                        }
                                      } else {
                                        break L9;
                                      }
                                    } else {
                                      if (0 != param1) {
                                        return;
                                      } else {
                                        fq.field_f.a(param0 ^ 3387, 13);
                                        t.field_p[param2] = true;
                                        return;
                                      }
                                    }
                                  } else {
                                    if (0 != param1) {
                                      return;
                                    } else {
                                      fq.field_f.a(-3388, 12);
                                      t.field_p[param2] = true;
                                      return;
                                    }
                                  }
                                } else {
                                  if ((param1 ^ -1) == -2) {
                                    fq.field_f.a(-3388, 11);
                                    t.field_p[param2] = true;
                                    return;
                                  } else {
                                    return;
                                  }
                                }
                              } else {
                                L13: {
                                  if (0 == param1) {
                                    fq.field_f.a(-3388, 18);
                                    break L13;
                                  } else {
                                    break L13;
                                  }
                                }
                                if ((param1 ^ -1) == -5) {
                                  fq.field_f.a(param0 + -3387, 15);
                                  t.field_p[param2] = true;
                                  break L9;
                                } else {
                                  return;
                                }
                              }
                            } else {
                              if (param1 == 0) {
                                fq.field_f.a(-3388, 10);
                                t.field_p[param2] = true;
                                break L9;
                              } else {
                                return;
                              }
                            }
                          }
                        }
                      } else {
                        L14: {
                          if (param1 == 0) {
                            fq.field_f.a(param0 ^ 3387, 5);
                            break L14;
                          } else {
                            break L14;
                          }
                        }
                        if (param1 == 5) {
                          fq.field_f.a(-3388, 3);
                          t.field_p[param2] = true;
                          break L9;
                        } else {
                          return;
                        }
                      }
                    } else {
                      if (0 == param1) {
                        fq.field_f.a(param0 ^ 3387, 2);
                        t.field_p[param2] = true;
                        break L9;
                      } else {
                        break L9;
                      }
                    }
                  } else {
                    L15: {
                      if (-1 == (param1 ^ -1)) {
                        fq.field_f.a(param0 ^ 3387, 16);
                        break L15;
                      } else {
                        break L15;
                      }
                    }
                    L16: {
                      if (-2 == (param1 ^ -1)) {
                        fq.field_f.a(-3388, 0);
                        break L16;
                      } else {
                        break L16;
                      }
                    }
                    if (2 == param1) {
                      fq.field_f.a(-3388, 1);
                      t.field_p[param2] = true;
                      break L9;
                    } else {
                      break L9;
                    }
                  }
                }
                return;
              }
            }
          }
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
        RuntimeException stackIn_17_0 = null;
        StringBuilder stackIn_17_1 = null;
        RuntimeException stackIn_18_0 = null;
        StringBuilder stackIn_18_1 = null;
        String stackIn_18_2 = null;
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        var4 = Sumoblitz.field_L ? 1 : 0;
        try {
          L0: {
            if (!g.a(param0, 0, param2)) {
              stackIn_4_0 = 0;
              decompiledRegionSelector0 = 0;
              break L0;
            } else {
              var3_int = 0;
              L1: while (true) {
                if (param2.length() <= var3_int) {
                  if (param1 > 122) {
                    stackIn_14_0 = 1;
                    decompiledRegionSelector0 = 2;
                    break L0;
                  } else {
                    sj.a(-58);
                    return true;
                  }
                } else {
                  if (jl.a((byte) 110, param2.charAt(var3_int))) {
                    var3_int++;
                    continue L1;
                  } else {
                    stackIn_9_0 = 0;
                    decompiledRegionSelector0 = 1;
                    break L0;
                  }
                }
              }
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L2: {
            var3 = decompiledCaughtException;
            stackIn_17_0 = (RuntimeException) (var3);

            stackIn_17_1 = new StringBuilder().append("sj.E(").append(param0).append(',').append(param1).append(',');

            if (param2 == null) {
              stackIn_18_0 = (RuntimeException) ((Object) stackIn_17_0);
              stackIn_18_1 = (StringBuilder) ((Object) stackIn_17_1);
              stackIn_18_2 = "null";
              break L2;
            } else {
              stackIn_18_0 = (RuntimeException) ((Object) stackIn_17_0);
              stackIn_18_1 = (StringBuilder) ((Object) stackIn_17_1);
              stackIn_18_2 = "{...}";
              break L2;
            }
          }
          throw qo.a((Throwable) ((Object) stackIn_18_0), stackIn_18_2 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return stackIn_4_0 != 0;
        } else {
          if (decompiledRegionSelector0 == 1) {
            return stackIn_9_0 != 0;
          } else {
            return stackIn_14_0 != 0;
          }
        }
    }

    static {
        field_b = new ts(2, 4, 4, 0);
    }
}
