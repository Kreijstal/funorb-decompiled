/*
 * Decompiled by CFR-JS 0.4.0.
 */
import java.lang.String;
import java.awt.Canvas;

final class mf extends ml {
    private fj field_s;
    static nq field_x;
    static boolean field_r;
    static String field_u;
    static nk[] field_o;
    static String[] field_w;
    static sq[] field_q;
    static String field_v;
    private boolean field_n;
    private String field_t;
    static boolean field_p;

    final static th a(int param0, int param1, bc param2, bc param3, int param4) {
        RuntimeException var5 = null;
        Object stackIn_4_0 = null;
        th stackIn_9_0 = null;
        RuntimeException stackIn_11_0 = null;
        StringBuilder stackIn_11_1 = null;
        RuntimeException stackIn_13_0 = null;
        StringBuilder stackIn_13_1 = null;
        RuntimeException stackIn_14_0 = null;
        StringBuilder stackIn_14_1 = null;
        String stackIn_14_2 = null;
        RuntimeException stackIn_15_0 = null;
        StringBuilder stackIn_15_1 = null;
        RuntimeException stackIn_17_0 = null;
        StringBuilder stackIn_17_1 = null;
        RuntimeException stackIn_18_0 = null;
        StringBuilder stackIn_18_1 = null;
        String stackIn_18_2 = null;
        RuntimeException decompiledCaughtException = null;
        Object stackOut_3_0 = null;
        th stackOut_8_0 = null;
        RuntimeException stackOut_10_0 = null;
        StringBuilder stackOut_10_1 = null;
        RuntimeException stackOut_13_0 = null;
        StringBuilder stackOut_13_1 = null;
        String stackOut_13_2 = null;
        RuntimeException stackOut_11_0 = null;
        StringBuilder stackOut_11_1 = null;
        String stackOut_11_2 = null;
        RuntimeException stackOut_14_0 = null;
        StringBuilder stackOut_14_1 = null;
        RuntimeException stackOut_17_0 = null;
        StringBuilder stackOut_17_1 = null;
        String stackOut_17_2 = null;
        RuntimeException stackOut_15_0 = null;
        StringBuilder stackOut_15_1 = null;
        String stackOut_15_2 = null;
        try {
          L0: {
            if (!vd.a(param1, param2, param0, 2)) {
              stackOut_3_0 = null;
              stackIn_4_0 = stackOut_3_0;
              return (th) (Object) stackIn_4_0;
            } else {
              L1: {
                if (param4 <= -83) {
                  break L1;
                } else {
                  mf.e(87);
                  break L1;
                }
              }
              stackOut_8_0 = in.a(15, param3.a(param1, -1, param0));
              stackIn_9_0 = stackOut_8_0;
              break L0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L2: {
            var5 = decompiledCaughtException;
            stackOut_10_0 = (RuntimeException) var5;
            stackOut_10_1 = new StringBuilder().append("mf.Q(").append(param0).append(',').append(param1).append(',');
            stackIn_13_0 = stackOut_10_0;
            stackIn_13_1 = stackOut_10_1;
            stackIn_11_0 = stackOut_10_0;
            stackIn_11_1 = stackOut_10_1;
            if (param2 == null) {
              stackOut_13_0 = (RuntimeException) (Object) stackIn_13_0;
              stackOut_13_1 = (StringBuilder) (Object) stackIn_13_1;
              stackOut_13_2 = "null";
              stackIn_14_0 = stackOut_13_0;
              stackIn_14_1 = stackOut_13_1;
              stackIn_14_2 = stackOut_13_2;
              break L2;
            } else {
              stackOut_11_0 = (RuntimeException) (Object) stackIn_11_0;
              stackOut_11_1 = (StringBuilder) (Object) stackIn_11_1;
              stackOut_11_2 = "{...}";
              stackIn_14_0 = stackOut_11_0;
              stackIn_14_1 = stackOut_11_1;
              stackIn_14_2 = stackOut_11_2;
              break L2;
            }
          }
          L3: {
            stackOut_14_0 = (RuntimeException) (Object) stackIn_14_0;
            stackOut_14_1 = ((StringBuilder) (Object) stackIn_14_1).append(stackIn_14_2).append(',');
            stackIn_17_0 = stackOut_14_0;
            stackIn_17_1 = stackOut_14_1;
            stackIn_15_0 = stackOut_14_0;
            stackIn_15_1 = stackOut_14_1;
            if (param3 == null) {
              stackOut_17_0 = (RuntimeException) (Object) stackIn_17_0;
              stackOut_17_1 = (StringBuilder) (Object) stackIn_17_1;
              stackOut_17_2 = "null";
              stackIn_18_0 = stackOut_17_0;
              stackIn_18_1 = stackOut_17_1;
              stackIn_18_2 = stackOut_17_2;
              break L3;
            } else {
              stackOut_15_0 = (RuntimeException) (Object) stackIn_15_0;
              stackOut_15_1 = (StringBuilder) (Object) stackIn_15_1;
              stackOut_15_2 = "{...}";
              stackIn_18_0 = stackOut_15_0;
              stackIn_18_1 = stackOut_15_1;
              stackIn_18_2 = stackOut_15_2;
              break L3;
            }
          }
          throw r.a((Throwable) (Object) stackIn_18_0, stackIn_18_2 + ',' + param4 + ')');
        }
        return stackIn_9_0;
    }

    final static lp a(qk[] param0, boolean param1) {
        lp var2 = null;
        RuntimeException var2_ref = null;
        int var3 = 0;
        int var4 = 0;
        Object stackIn_9_0 = null;
        lp stackIn_11_0 = null;
        RuntimeException stackIn_13_0 = null;
        StringBuilder stackIn_13_1 = null;
        RuntimeException stackIn_15_0 = null;
        StringBuilder stackIn_15_1 = null;
        RuntimeException stackIn_16_0 = null;
        StringBuilder stackIn_16_1 = null;
        String stackIn_16_2 = null;
        RuntimeException decompiledCaughtException = null;
        Object stackOut_8_0 = null;
        lp stackOut_10_0 = null;
        RuntimeException stackOut_12_0 = null;
        StringBuilder stackOut_12_1 = null;
        RuntimeException stackOut_15_0 = null;
        StringBuilder stackOut_15_1 = null;
        String stackOut_15_2 = null;
        RuntimeException stackOut_13_0 = null;
        StringBuilder stackOut_13_1 = null;
        String stackOut_13_2 = null;
        var4 = ShatteredPlansClient.field_F ? 1 : 0;
        try {
          L0: {
            var2 = new lp(0, 0, 182, param0.length * rs.field_Cb.field_J);
            var3 = 0;
            L1: while (true) {
              L2: {
                L3: {
                  if (~param0.length >= ~var3) {
                    break L3;
                  } else {
                    param0[var3].a((byte) 119, 0, rs.field_Cb.field_J * var3);
                    var2.a((vd) (Object) param0[var3], 8);
                    var3++;
                    if (var4 != 0) {
                      break L2;
                    } else {
                      if (var4 == 0) {
                        continue L1;
                      } else {
                        break L3;
                      }
                    }
                  }
                }
                if (param1) {
                  break L2;
                } else {
                  stackOut_8_0 = null;
                  stackIn_9_0 = stackOut_8_0;
                  return (lp) (Object) stackIn_9_0;
                }
              }
              stackOut_10_0 = (lp) var2;
              stackIn_11_0 = stackOut_10_0;
              break L0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L4: {
            var2_ref = decompiledCaughtException;
            stackOut_12_0 = (RuntimeException) var2_ref;
            stackOut_12_1 = new StringBuilder().append("mf.R(");
            stackIn_15_0 = stackOut_12_0;
            stackIn_15_1 = stackOut_12_1;
            stackIn_13_0 = stackOut_12_0;
            stackIn_13_1 = stackOut_12_1;
            if (param0 == null) {
              stackOut_15_0 = (RuntimeException) (Object) stackIn_15_0;
              stackOut_15_1 = (StringBuilder) (Object) stackIn_15_1;
              stackOut_15_2 = "null";
              stackIn_16_0 = stackOut_15_0;
              stackIn_16_1 = stackOut_15_1;
              stackIn_16_2 = stackOut_15_2;
              break L4;
            } else {
              stackOut_13_0 = (RuntimeException) (Object) stackIn_13_0;
              stackOut_13_1 = (StringBuilder) (Object) stackIn_13_1;
              stackOut_13_2 = "{...}";
              stackIn_16_0 = stackOut_13_0;
              stackIn_16_1 = stackOut_13_1;
              stackIn_16_2 = stackOut_13_2;
              break L4;
            }
          }
          throw r.a((Throwable) (Object) stackIn_16_0, stackIn_16_2 + ',' + param1 + ')');
        }
        return stackIn_11_0;
    }

    final String a(boolean param0, String param1) {
        RuntimeException var3 = null;
        String stackIn_4_0 = null;
        Object stackIn_7_0 = null;
        String stackIn_12_0 = null;
        String stackIn_14_0 = null;
        RuntimeException stackIn_16_0 = null;
        StringBuilder stackIn_16_1 = null;
        RuntimeException stackIn_18_0 = null;
        StringBuilder stackIn_18_1 = null;
        RuntimeException stackIn_19_0 = null;
        StringBuilder stackIn_19_1 = null;
        String stackIn_19_2 = null;
        RuntimeException decompiledCaughtException = null;
        String stackOut_3_0 = null;
        String stackOut_11_0 = null;
        String stackOut_13_0 = null;
        Object stackOut_6_0 = null;
        RuntimeException stackOut_15_0 = null;
        StringBuilder stackOut_15_1 = null;
        RuntimeException stackOut_18_0 = null;
        StringBuilder stackOut_18_1 = null;
        String stackOut_18_2 = null;
        RuntimeException stackOut_16_0 = null;
        StringBuilder stackOut_16_1 = null;
        String stackOut_16_2 = null;
        try {
          L0: {
            if (((mf) this).field_s.b(-11196, param1) == tj.field_b) {
              stackOut_3_0 = ((mf) this).field_s.a(false, param1);
              stackIn_4_0 = stackOut_3_0;
              return stackIn_4_0;
            } else {
              if (!param0) {
                if (((mf) this).b(-11196, param1) == tj.field_b) {
                  stackOut_11_0 = ab.field_d;
                  stackIn_12_0 = stackOut_11_0;
                  return stackIn_12_0;
                } else {
                  stackOut_13_0 = dn.field_g;
                  stackIn_14_0 = stackOut_13_0;
                  break L0;
                }
              } else {
                stackOut_6_0 = null;
                stackIn_7_0 = stackOut_6_0;
                return (String) (Object) stackIn_7_0;
              }
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L1: {
            var3 = decompiledCaughtException;
            stackOut_15_0 = (RuntimeException) var3;
            stackOut_15_1 = new StringBuilder().append("mf.P(").append(param0).append(',');
            stackIn_18_0 = stackOut_15_0;
            stackIn_18_1 = stackOut_15_1;
            stackIn_16_0 = stackOut_15_0;
            stackIn_16_1 = stackOut_15_1;
            if (param1 == null) {
              stackOut_18_0 = (RuntimeException) (Object) stackIn_18_0;
              stackOut_18_1 = (StringBuilder) (Object) stackIn_18_1;
              stackOut_18_2 = "null";
              stackIn_19_0 = stackOut_18_0;
              stackIn_19_1 = stackOut_18_1;
              stackIn_19_2 = stackOut_18_2;
              break L1;
            } else {
              stackOut_16_0 = (RuntimeException) (Object) stackIn_16_0;
              stackOut_16_1 = (StringBuilder) (Object) stackIn_16_1;
              stackOut_16_2 = "{...}";
              stackIn_19_0 = stackOut_16_0;
              stackIn_19_1 = stackOut_16_1;
              stackIn_19_2 = stackOut_16_2;
              break L1;
            }
          }
          throw r.a((Throwable) (Object) stackIn_19_0, stackIn_19_2 + ')');
        }
        return stackIn_14_0;
    }

    final u b(int param0, String param1) {
        RuntimeException var3 = null;
        ks var3_ref = null;
        u stackIn_2_0 = null;
        u stackIn_8_0 = null;
        u stackIn_14_0 = null;
        RuntimeException stackIn_16_0 = null;
        StringBuilder stackIn_16_1 = null;
        RuntimeException stackIn_18_0 = null;
        StringBuilder stackIn_18_1 = null;
        RuntimeException stackIn_19_0 = null;
        StringBuilder stackIn_19_1 = null;
        String stackIn_19_2 = null;
        RuntimeException decompiledCaughtException = null;
        u stackOut_7_0 = null;
        u stackOut_13_0 = null;
        u stackOut_11_0 = null;
        u stackOut_1_0 = null;
        RuntimeException stackOut_15_0 = null;
        StringBuilder stackOut_15_1 = null;
        RuntimeException stackOut_18_0 = null;
        StringBuilder stackOut_18_1 = null;
        String stackOut_18_2 = null;
        RuntimeException stackOut_16_0 = null;
        StringBuilder stackOut_16_1 = null;
        String stackOut_16_2 = null;
        try {
          L0: {
            if (((mf) this).field_s.b(param0, param1) != tj.field_b) {
              L1: {
                if (!param1.equals((Object) (Object) ((mf) this).field_t)) {
                  var3_ref = os.a(202, param1);
                  if (var3_ref.b(14)) {
                    ((mf) this).field_t = param1;
                    ((mf) this).field_n = var3_ref.a(true);
                    break L1;
                  } else {
                    stackOut_7_0 = lm.field_d;
                    stackIn_8_0 = stackOut_7_0;
                    return stackIn_8_0;
                  }
                } else {
                  break L1;
                }
              }
              L2: {
                if (!((mf) this).field_n) {
                  stackOut_13_0 = tj.field_b;
                  stackIn_14_0 = stackOut_13_0;
                  break L2;
                } else {
                  stackOut_11_0 = p.field_g;
                  stackIn_14_0 = stackOut_11_0;
                  break L2;
                }
              }
              break L0;
            } else {
              stackOut_1_0 = tj.field_b;
              stackIn_2_0 = stackOut_1_0;
              return stackIn_2_0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L3: {
            var3 = decompiledCaughtException;
            stackOut_15_0 = (RuntimeException) var3;
            stackOut_15_1 = new StringBuilder().append("mf.N(").append(param0).append(',');
            stackIn_18_0 = stackOut_15_0;
            stackIn_18_1 = stackOut_15_1;
            stackIn_16_0 = stackOut_15_0;
            stackIn_16_1 = stackOut_15_1;
            if (param1 == null) {
              stackOut_18_0 = (RuntimeException) (Object) stackIn_18_0;
              stackOut_18_1 = (StringBuilder) (Object) stackIn_18_1;
              stackOut_18_2 = "null";
              stackIn_19_0 = stackOut_18_0;
              stackIn_19_1 = stackOut_18_1;
              stackIn_19_2 = stackOut_18_2;
              break L3;
            } else {
              stackOut_16_0 = (RuntimeException) (Object) stackIn_16_0;
              stackOut_16_1 = (StringBuilder) (Object) stackIn_16_1;
              stackOut_16_2 = "{...}";
              stackIn_19_0 = stackOut_16_0;
              stackIn_19_1 = stackOut_16_1;
              stackIn_19_2 = stackOut_16_2;
              break L3;
            }
          }
          throw r.a((Throwable) (Object) stackIn_19_0, stackIn_19_2 + ')');
        }
        return stackIn_14_0;
    }

    final static void a(boolean param0, boolean param1) {
        RuntimeException var2 = null;
        int var3 = 0;
        RuntimeException decompiledCaughtException = null;
        var3 = ShatteredPlansClient.field_F ? 1 : 0;
        try {
          L0: {
            L1: {
              L2: {
                if (param1) {
                  break L2;
                } else {
                  if (np.field_a == null) {
                    break L2;
                  } else {
                    break L1;
                  }
                }
              }
              ti.field_e = false;
              break L1;
            }
            L3: {
              L4: {
                if (param1) {
                  break L4;
                } else {
                  L5: {
                    if (np.field_a == null) {
                      break L5;
                    } else {
                      L6: {
                        if (0 < qa.field_t) {
                          break L6;
                        } else {
                          L7: {
                            if (bc.field_b > 0) {
                              break L7;
                            } else {
                              if (~ee.field_k > ~ed.field_f) {
                                L8: {
                                  if (0 == ee.field_k) {
                                    tc.a(true, false);
                                    break L8;
                                  } else {
                                    break L8;
                                  }
                                }
                                ee.field_k = ee.field_k + 1;
                                if (var3 == 0) {
                                  break L3;
                                } else {
                                  break L7;
                                }
                              } else {
                                break L3;
                              }
                            }
                          }
                          bc.field_b = bc.field_b - 1;
                          if (var3 == 0) {
                            break L3;
                          } else {
                            break L6;
                          }
                        }
                      }
                      qa.field_t = qa.field_t - 1;
                      if (var3 == 0) {
                        break L3;
                      } else {
                        break L5;
                      }
                    }
                  }
                  L9: {
                    if (null == he.field_p) {
                      break L9;
                    } else {
                      L10: {
                        if (qa.field_t <= 0) {
                          break L10;
                        } else {
                          qa.field_t = qa.field_t - 1;
                          if (var3 == 0) {
                            break L3;
                          } else {
                            break L10;
                          }
                        }
                      }
                      L11: {
                        if (ee.field_k <= 0) {
                          break L11;
                        } else {
                          ee.field_k = ee.field_k - 1;
                          if (var3 == 0) {
                            break L3;
                          } else {
                            break L11;
                          }
                        }
                      }
                      if (ed.field_f > bc.field_b) {
                        L12: {
                          if (0 == bc.field_b) {
                            tc.a(true, true);
                            break L12;
                          } else {
                            break L12;
                          }
                        }
                        bc.field_b = bc.field_b + 1;
                        if (var3 == 0) {
                          break L3;
                        } else {
                          break L9;
                        }
                      } else {
                        break L3;
                      }
                    }
                  }
                  L13: {
                    ti.field_e = false;
                    if (bc.field_b <= 0) {
                      break L13;
                    } else {
                      bc.field_b = bc.field_b - 1;
                      if (var3 == 0) {
                        break L3;
                      } else {
                        break L13;
                      }
                    }
                  }
                  L14: {
                    if (0 >= ee.field_k) {
                      break L14;
                    } else {
                      ee.field_k = ee.field_k - 1;
                      if (var3 == 0) {
                        break L3;
                      } else {
                        break L14;
                      }
                    }
                  }
                  if (~ed.field_f >= ~qa.field_t) {
                    break L3;
                  } else {
                    L15: {
                      if (qa.field_t == 0) {
                        in.a((byte) -83);
                        break L15;
                      } else {
                        break L15;
                      }
                    }
                    qa.field_t = qa.field_t + 1;
                    if (var3 == 0) {
                      break L3;
                    } else {
                      break L4;
                    }
                  }
                }
              }
              L16: {
                if (0 < qa.field_t) {
                  break L16;
                } else {
                  L17: {
                    if (bc.field_b <= 0) {
                      break L17;
                    } else {
                      bc.field_b = bc.field_b - 1;
                      if (var3 == 0) {
                        break L3;
                      } else {
                        break L17;
                      }
                    }
                  }
                  if (0 < ee.field_k) {
                    ee.field_k = ee.field_k - 1;
                    if (var3 == 0) {
                      break L3;
                    } else {
                      break L16;
                    }
                  } else {
                    break L3;
                  }
                }
              }
              qa.field_t = qa.field_t - 1;
              break L3;
            }
            L18: {
              if (param0) {
                break L18;
              } else {
                field_q = null;
                break L18;
              }
            }
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2 = decompiledCaughtException;
          throw r.a((Throwable) (Object) var2, "mf.U(" + param0 + ',' + param1 + ')');
        }
    }

    public static void f(int param0) {
        RuntimeException var1 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          L0: {
            L1: {
              field_u = null;
              field_o = null;
              if (param0 == 0) {
                break L1;
              } else {
                field_p = true;
                break L1;
              }
            }
            field_x = null;
            field_w = null;
            field_q = null;
            field_v = null;
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var1 = decompiledCaughtException;
          throw r.a((Throwable) (Object) var1, "mf.T(" + param0 + ')');
        }
    }

    mf(go param0, go param1) {
        super(param0);
        RuntimeException runtimeException = null;
        RuntimeException stackIn_4_0 = null;
        StringBuilder stackIn_4_1 = null;
        RuntimeException stackIn_6_0 = null;
        StringBuilder stackIn_6_1 = null;
        RuntimeException stackIn_7_0 = null;
        StringBuilder stackIn_7_1 = null;
        String stackIn_7_2 = null;
        RuntimeException stackIn_8_0 = null;
        StringBuilder stackIn_8_1 = null;
        RuntimeException stackIn_10_0 = null;
        StringBuilder stackIn_10_1 = null;
        RuntimeException stackIn_11_0 = null;
        StringBuilder stackIn_11_1 = null;
        String stackIn_11_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException stackOut_3_0 = null;
        StringBuilder stackOut_3_1 = null;
        RuntimeException stackOut_6_0 = null;
        StringBuilder stackOut_6_1 = null;
        String stackOut_6_2 = null;
        RuntimeException stackOut_4_0 = null;
        StringBuilder stackOut_4_1 = null;
        String stackOut_4_2 = null;
        RuntimeException stackOut_7_0 = null;
        StringBuilder stackOut_7_1 = null;
        RuntimeException stackOut_10_0 = null;
        StringBuilder stackOut_10_1 = null;
        String stackOut_10_2 = null;
        RuntimeException stackOut_8_0 = null;
        StringBuilder stackOut_8_1 = null;
        String stackOut_8_2 = null;
        ((mf) this).field_n = false;
        ((mf) this).field_t = "";
        try {
          L0: {
            ((mf) this).field_s = new fj(param0, param1);
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L1: {
            runtimeException = decompiledCaughtException;
            stackOut_3_0 = (RuntimeException) runtimeException;
            stackOut_3_1 = new StringBuilder().append("mf.<init>(");
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
          L2: {
            stackOut_7_0 = (RuntimeException) (Object) stackIn_7_0;
            stackOut_7_1 = ((StringBuilder) (Object) stackIn_7_1).append(stackIn_7_2).append(',');
            stackIn_10_0 = stackOut_7_0;
            stackIn_10_1 = stackOut_7_1;
            stackIn_8_0 = stackOut_7_0;
            stackIn_8_1 = stackOut_7_1;
            if (param1 == null) {
              stackOut_10_0 = (RuntimeException) (Object) stackIn_10_0;
              stackOut_10_1 = (StringBuilder) (Object) stackIn_10_1;
              stackOut_10_2 = "null";
              stackIn_11_0 = stackOut_10_0;
              stackIn_11_1 = stackOut_10_1;
              stackIn_11_2 = stackOut_10_2;
              break L2;
            } else {
              stackOut_8_0 = (RuntimeException) (Object) stackIn_8_0;
              stackOut_8_1 = (StringBuilder) (Object) stackIn_8_1;
              stackOut_8_2 = "{...}";
              stackIn_11_0 = stackOut_8_0;
              stackIn_11_1 = stackOut_8_1;
              stackIn_11_2 = stackOut_8_2;
              break L2;
            }
          }
          throw r.a((Throwable) (Object) stackIn_11_0, stackIn_11_2 + ')');
        }
    }

    final static void e(int param0) {
        RuntimeException runtimeException = null;
        int[] var1 = null;
        int var2 = 0;
        int var3 = 0;
        int var4 = 0;
        RuntimeException decompiledCaughtException = null;
        var4 = ShatteredPlansClient.field_F ? 1 : 0;
        try {
          L0: {
            L1: {
              var1 = uo.field_h;
              if (param0 > 92) {
                break L1;
              } else {
                mf.e(20);
                break L1;
              }
            }
            var2 = 0;
            var3 = var1.length;
            L2: while (true) {
              L3: {
                L4: {
                  if (var3 <= var2) {
                    break L4;
                  } else {
                    int incrementValue$16 = var2;
                    var2++;
                    var1[incrementValue$16] = 0;
                    int incrementValue$17 = var2;
                    var2++;
                    var1[incrementValue$17] = 0;
                    int incrementValue$18 = var2;
                    var2++;
                    var1[incrementValue$18] = 0;
                    int incrementValue$19 = var2;
                    var2++;
                    var1[incrementValue$19] = 0;
                    int incrementValue$20 = var2;
                    var2++;
                    var1[incrementValue$20] = 0;
                    int incrementValue$21 = var2;
                    var2++;
                    var1[incrementValue$21] = 0;
                    int incrementValue$22 = var2;
                    var2++;
                    var1[incrementValue$22] = 0;
                    int incrementValue$23 = var2;
                    var2++;
                    var1[incrementValue$23] = 0;
                    if (var4 != 0) {
                      break L3;
                    } else {
                      if (var4 == 0) {
                        continue L2;
                      } else {
                        break L4;
                      }
                    }
                  }
                }
                break L3;
              }
              break L0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          runtimeException = decompiledCaughtException;
          throw r.a((Throwable) (Object) runtimeException, "mf.O(" + param0 + ')');
        }
    }

    final static bi a(bc param0, String param1, String param2, boolean param3) {
        byte[] var4 = null;
        RuntimeException var4_ref = null;
        Object stackIn_3_0 = null;
        bi stackIn_8_0 = null;
        bi stackIn_8_1 = null;
        byte[] stackIn_8_2 = null;
        bi stackIn_10_0 = null;
        bi stackIn_10_1 = null;
        byte[] stackIn_10_2 = null;
        bi stackIn_11_0 = null;
        bi stackIn_11_1 = null;
        byte[] stackIn_11_2 = null;
        Object stackIn_11_3 = null;
        bi stackIn_12_0 = null;
        RuntimeException stackIn_14_0 = null;
        StringBuilder stackIn_14_1 = null;
        RuntimeException stackIn_16_0 = null;
        StringBuilder stackIn_16_1 = null;
        RuntimeException stackIn_17_0 = null;
        StringBuilder stackIn_17_1 = null;
        String stackIn_17_2 = null;
        RuntimeException stackIn_18_0 = null;
        StringBuilder stackIn_18_1 = null;
        RuntimeException stackIn_20_0 = null;
        StringBuilder stackIn_20_1 = null;
        RuntimeException stackIn_21_0 = null;
        StringBuilder stackIn_21_1 = null;
        String stackIn_21_2 = null;
        RuntimeException stackIn_22_0 = null;
        StringBuilder stackIn_22_1 = null;
        RuntimeException stackIn_24_0 = null;
        StringBuilder stackIn_24_1 = null;
        RuntimeException stackIn_25_0 = null;
        StringBuilder stackIn_25_1 = null;
        String stackIn_25_2 = null;
        RuntimeException decompiledCaughtException = null;
        Object stackOut_2_0 = null;
        bi stackOut_7_0 = null;
        bi stackOut_7_1 = null;
        byte[] stackOut_7_2 = null;
        bi stackOut_10_0 = null;
        bi stackOut_10_1 = null;
        byte[] stackOut_10_2 = null;
        java.awt.Canvas stackOut_10_3 = null;
        bi stackOut_8_0 = null;
        bi stackOut_8_1 = null;
        byte[] stackOut_8_2 = null;
        eb stackOut_8_3 = null;
        bi stackOut_11_0 = null;
        RuntimeException stackOut_13_0 = null;
        StringBuilder stackOut_13_1 = null;
        RuntimeException stackOut_16_0 = null;
        StringBuilder stackOut_16_1 = null;
        String stackOut_16_2 = null;
        RuntimeException stackOut_14_0 = null;
        StringBuilder stackOut_14_1 = null;
        String stackOut_14_2 = null;
        RuntimeException stackOut_17_0 = null;
        StringBuilder stackOut_17_1 = null;
        RuntimeException stackOut_20_0 = null;
        StringBuilder stackOut_20_1 = null;
        String stackOut_20_2 = null;
        RuntimeException stackOut_18_0 = null;
        StringBuilder stackOut_18_1 = null;
        String stackOut_18_2 = null;
        RuntimeException stackOut_21_0 = null;
        StringBuilder stackOut_21_1 = null;
        RuntimeException stackOut_24_0 = null;
        StringBuilder stackOut_24_1 = null;
        String stackOut_24_2 = null;
        RuntimeException stackOut_22_0 = null;
        StringBuilder stackOut_22_1 = null;
        String stackOut_22_2 = null;
        try {
          L0: {
            L1: {
              if (param0.a((byte) 96, param2, param1)) {
                break L1;
              } else {
                param2 = param2 + ".jpg";
                if (param0.a((byte) 127, param2, param1)) {
                  break L1;
                } else {
                  stackOut_2_0 = null;
                  stackIn_3_0 = stackOut_2_0;
                  return (bi) (Object) stackIn_3_0;
                }
              }
            }
            L2: {
              var4 = param0.a(true, param2, param1);
              if (!param3) {
                break L2;
              } else {
                mf.a(false, true);
                break L2;
              }
            }
            L3: {
              stackOut_7_0 = null;
              stackOut_7_1 = null;
              stackOut_7_2 = (byte[]) var4;
              stackIn_10_0 = stackOut_7_0;
              stackIn_10_1 = stackOut_7_1;
              stackIn_10_2 = stackOut_7_2;
              stackIn_8_0 = stackOut_7_0;
              stackIn_8_1 = stackOut_7_1;
              stackIn_8_2 = stackOut_7_2;
              if (null == bj.field_K) {
                stackOut_10_0 = null;
                stackOut_10_1 = null;
                stackOut_10_2 = (byte[]) (Object) stackIn_10_2;
                stackOut_10_3 = tm.field_i;
                stackIn_11_0 = stackOut_10_0;
                stackIn_11_1 = stackOut_10_1;
                stackIn_11_2 = stackOut_10_2;
                stackIn_11_3 = (Object) (Object) stackOut_10_3;
                break L3;
              } else {
                stackOut_8_0 = null;
                stackOut_8_1 = null;
                stackOut_8_2 = (byte[]) (Object) stackIn_8_2;
                stackOut_8_3 = bj.field_K;
                stackIn_11_0 = stackOut_8_0;
                stackIn_11_1 = stackOut_8_1;
                stackIn_11_2 = stackOut_8_2;
                stackIn_11_3 = (Object) (Object) stackOut_8_3;
                break L3;
              }
            }
            stackOut_11_0 = new bi(stackIn_11_2, (java.awt.Component) (Object) stackIn_11_3);
            stackIn_12_0 = stackOut_11_0;
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L4: {
            var4_ref = decompiledCaughtException;
            stackOut_13_0 = (RuntimeException) var4_ref;
            stackOut_13_1 = new StringBuilder().append("mf.S(");
            stackIn_16_0 = stackOut_13_0;
            stackIn_16_1 = stackOut_13_1;
            stackIn_14_0 = stackOut_13_0;
            stackIn_14_1 = stackOut_13_1;
            if (param0 == null) {
              stackOut_16_0 = (RuntimeException) (Object) stackIn_16_0;
              stackOut_16_1 = (StringBuilder) (Object) stackIn_16_1;
              stackOut_16_2 = "null";
              stackIn_17_0 = stackOut_16_0;
              stackIn_17_1 = stackOut_16_1;
              stackIn_17_2 = stackOut_16_2;
              break L4;
            } else {
              stackOut_14_0 = (RuntimeException) (Object) stackIn_14_0;
              stackOut_14_1 = (StringBuilder) (Object) stackIn_14_1;
              stackOut_14_2 = "{...}";
              stackIn_17_0 = stackOut_14_0;
              stackIn_17_1 = stackOut_14_1;
              stackIn_17_2 = stackOut_14_2;
              break L4;
            }
          }
          L5: {
            stackOut_17_0 = (RuntimeException) (Object) stackIn_17_0;
            stackOut_17_1 = ((StringBuilder) (Object) stackIn_17_1).append(stackIn_17_2).append(',');
            stackIn_20_0 = stackOut_17_0;
            stackIn_20_1 = stackOut_17_1;
            stackIn_18_0 = stackOut_17_0;
            stackIn_18_1 = stackOut_17_1;
            if (param1 == null) {
              stackOut_20_0 = (RuntimeException) (Object) stackIn_20_0;
              stackOut_20_1 = (StringBuilder) (Object) stackIn_20_1;
              stackOut_20_2 = "null";
              stackIn_21_0 = stackOut_20_0;
              stackIn_21_1 = stackOut_20_1;
              stackIn_21_2 = stackOut_20_2;
              break L5;
            } else {
              stackOut_18_0 = (RuntimeException) (Object) stackIn_18_0;
              stackOut_18_1 = (StringBuilder) (Object) stackIn_18_1;
              stackOut_18_2 = "{...}";
              stackIn_21_0 = stackOut_18_0;
              stackIn_21_1 = stackOut_18_1;
              stackIn_21_2 = stackOut_18_2;
              break L5;
            }
          }
          L6: {
            stackOut_21_0 = (RuntimeException) (Object) stackIn_21_0;
            stackOut_21_1 = ((StringBuilder) (Object) stackIn_21_1).append(stackIn_21_2).append(',');
            stackIn_24_0 = stackOut_21_0;
            stackIn_24_1 = stackOut_21_1;
            stackIn_22_0 = stackOut_21_0;
            stackIn_22_1 = stackOut_21_1;
            if (param2 == null) {
              stackOut_24_0 = (RuntimeException) (Object) stackIn_24_0;
              stackOut_24_1 = (StringBuilder) (Object) stackIn_24_1;
              stackOut_24_2 = "null";
              stackIn_25_0 = stackOut_24_0;
              stackIn_25_1 = stackOut_24_1;
              stackIn_25_2 = stackOut_24_2;
              break L6;
            } else {
              stackOut_22_0 = (RuntimeException) (Object) stackIn_22_0;
              stackOut_22_1 = (StringBuilder) (Object) stackIn_22_1;
              stackOut_22_2 = "{...}";
              stackIn_25_0 = stackOut_22_0;
              stackIn_25_1 = stackOut_22_1;
              stackIn_25_2 = stackOut_22_2;
              break L6;
            }
          }
          throw r.a((Throwable) (Object) stackIn_25_0, stackIn_25_2 + ',' + param3 + ')');
        }
        return stackIn_12_0;
    }

    final static void d(int param0) {
        RuntimeException var1 = null;
        mj var1_ref = null;
        fb var1_ref2 = null;
        int var2 = 0;
        int stackIn_6_0 = 0;
        int stackIn_6_1 = 0;
        int stackIn_39_0 = 0;
        int stackIn_39_1 = 0;
        RuntimeException decompiledCaughtException = null;
        int stackOut_5_0 = 0;
        int stackOut_5_1 = 0;
        int stackOut_37_0 = 0;
        int stackOut_37_1 = 0;
        var2 = ShatteredPlansClient.field_F ? 1 : 0;
        try {
          L0: {
            L1: {
              var1_ref = (mj) (Object) gr.field_p.d(0);
              if (param0 >= 4) {
                break L1;
              } else {
                mf.a(true, true);
                break L1;
              }
            }
            L2: while (true) {
              L3: {
                L4: {
                  L5: {
                    if (null == var1_ref) {
                      break L5;
                    } else {
                      stackOut_5_0 = 0;
                      stackOut_5_1 = var1_ref.field_Gb;
                      stackIn_39_0 = stackOut_5_0;
                      stackIn_39_1 = stackOut_5_1;
                      stackIn_6_0 = stackOut_5_0;
                      stackIn_6_1 = stackOut_5_1;
                      if (var2 != 0) {
                        L6: while (true) {
                          L7: {
                            if (stackIn_39_0 == stackIn_39_1) {
                              var1_ref.field_Eb = 0;
                              if (var1_ref.h(-96)) {
                                var1_ref.b((byte) -108);
                                break L7;
                              } else {
                                break L7;
                              }
                            } else {
                              break L7;
                            }
                          }
                          L8: while (true) {
                            var1_ref = (mj) (Object) uo.field_a.a((byte) -71);
                            if (var2 == 0) {
                              if (var1_ref == null) {
                                break L4;
                              } else {
                                if (var2 != 0) {
                                  break L3;
                                } else {
                                  if (var1_ref.field_Gb <= 0) {
                                    continue L8;
                                  } else {
                                    var1_ref.field_Gb = var1_ref.field_Gb - 1;
                                    stackOut_37_0 = -1;
                                    stackOut_37_1 = ~var1_ref.field_Gb;
                                    stackIn_39_0 = stackOut_37_0;
                                    stackIn_39_1 = stackOut_37_1;
                                    continue L6;
                                  }
                                }
                              }
                            } else {
                              break L4;
                            }
                          }
                        }
                      } else {
                        L9: {
                          if (stackIn_6_0 >= stackIn_6_1) {
                            break L9;
                          } else {
                            var1_ref.field_Gb = var1_ref.field_Gb - 1;
                            if (var1_ref.field_Gb == 0) {
                              var1_ref.field_Eb = 0;
                              if (!var1_ref.h(-122)) {
                                break L9;
                              } else {
                                var1_ref.b((byte) -58);
                                break L9;
                              }
                            } else {
                              break L9;
                            }
                          }
                        }
                        var1_ref = (mj) (Object) gr.field_p.a((byte) -71);
                        if (var2 == 0) {
                          continue L2;
                        } else {
                          break L5;
                        }
                      }
                    }
                  }
                  var1_ref2 = (fb) (Object) kj.field_a.d(0);
                  L10: while (true) {
                    L11: {
                      if (var1_ref2 == null) {
                        break L11;
                      } else {
                        L12: {
                          if (0 < var1_ref2.field_Nb) {
                            var1_ref2.field_Nb = var1_ref2.field_Nb - 1;
                            if (var1_ref2.field_Nb == 0) {
                              var1_ref2.field_hc = 0;
                              if (var1_ref2.f((byte) -78)) {
                                var1_ref2.b((byte) -58);
                                break L12;
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
                        var1_ref2 = (fb) (Object) kj.field_a.a((byte) -71);
                        if (var2 == 0) {
                          continue L10;
                        } else {
                          break L11;
                        }
                      }
                    }
                    var1_ref = (mj) (Object) uo.field_a.d(0);
                    L13: while (true) {
                      if (var1_ref == null) {
                        break L4;
                      } else {
                        if (var2 != 0) {
                          break L3;
                        } else {
                          L14: {
                            if (var1_ref.field_Gb <= 0) {
                              break L14;
                            } else {
                              var1_ref.field_Gb = var1_ref.field_Gb - 1;
                              stackOut_37_0 = -1;
                              stackOut_37_1 = ~var1_ref.field_Gb;
                              stackIn_39_0 = stackOut_37_0;
                              stackIn_39_1 = stackOut_37_1;
                              if (stackIn_39_0 == stackIn_39_1) {
                                var1_ref.field_Eb = 0;
                                if (var1_ref.h(-96)) {
                                  var1_ref.b((byte) -108);
                                  break L14;
                                } else {
                                  break L14;
                                }
                              } else {
                                break L14;
                              }
                            }
                          }
                          var1_ref = (mj) (Object) uo.field_a.a((byte) -71);
                          if (var2 == 0) {
                            continue L13;
                          } else {
                            break L4;
                          }
                        }
                      }
                    }
                  }
                }
                break L3;
              }
              break L0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var1 = decompiledCaughtException;
          throw r.a((Throwable) (Object) var1, "mf.V(" + param0 + ')');
        }
    }

    final static int[] a(byte param0, int[] param1) {
        int var2_int = 0;
        RuntimeException var2 = null;
        int[] var3 = null;
        int var4 = 0;
        int var5 = 0;
        int var6 = 0;
        int stackIn_6_0 = 0;
        int stackIn_6_1 = 0;
        int stackIn_10_0 = 0;
        int stackIn_10_1 = 0;
        int[] stackIn_16_0 = null;
        RuntimeException stackIn_18_0 = null;
        StringBuilder stackIn_18_1 = null;
        RuntimeException stackIn_20_0 = null;
        StringBuilder stackIn_20_1 = null;
        RuntimeException stackIn_21_0 = null;
        StringBuilder stackIn_21_1 = null;
        String stackIn_21_2 = null;
        RuntimeException decompiledCaughtException = null;
        int stackOut_5_0 = 0;
        int stackOut_5_1 = 0;
        int stackOut_9_0 = 0;
        int stackOut_9_1 = 0;
        int[] stackOut_15_0 = null;
        RuntimeException stackOut_17_0 = null;
        StringBuilder stackOut_17_1 = null;
        RuntimeException stackOut_20_0 = null;
        StringBuilder stackOut_20_1 = null;
        String stackOut_20_2 = null;
        RuntimeException stackOut_18_0 = null;
        StringBuilder stackOut_18_1 = null;
        String stackOut_18_2 = null;
        var6 = ShatteredPlansClient.field_F ? 1 : 0;
        try {
          L0: {
            L1: {
              var2_int = param1.length;
              var3 = new int[var2_int];
              if (param0 == 74) {
                break L1;
              } else {
                mf.e(40);
                break L1;
              }
            }
            var4 = 1;
            L2: while (true) {
              stackOut_5_0 = ~var2_int;
              stackOut_5_1 = ~var4;
              stackIn_6_0 = stackOut_5_0;
              stackIn_6_1 = stackOut_5_1;
              L3: while (true) {
                L4: {
                  if (stackIn_6_0 >= stackIn_6_1) {
                    break L4;
                  } else {
                    var5 = var4;
                    L5: while (true) {
                      L6: {
                        var5--;
                        if (0 > var5) {
                          break L6;
                        } else {
                          stackOut_9_0 = param1[var3[var5]];
                          stackOut_9_1 = param1[var4];
                          stackIn_6_0 = stackOut_9_0;
                          stackIn_6_1 = stackOut_9_1;
                          stackIn_10_0 = stackOut_9_0;
                          stackIn_10_1 = stackOut_9_1;
                          if (var6 != 0) {
                            continue L3;
                          } else {
                            if (stackIn_10_0 >= stackIn_10_1) {
                              break L6;
                            } else {
                              var3[var5 + 1] = var3[var5];
                              if (var6 == 0) {
                                continue L5;
                              } else {
                                break L6;
                              }
                            }
                          }
                        }
                      }
                      var3[1 + var5] = var4;
                      var4++;
                      if (var6 == 0) {
                        continue L2;
                      } else {
                        break L4;
                      }
                    }
                  }
                }
                stackOut_15_0 = (int[]) var3;
                stackIn_16_0 = stackOut_15_0;
                break L0;
              }
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L7: {
            var2 = decompiledCaughtException;
            stackOut_17_0 = (RuntimeException) var2;
            stackOut_17_1 = new StringBuilder().append("mf.M(").append(param0).append(',');
            stackIn_20_0 = stackOut_17_0;
            stackIn_20_1 = stackOut_17_1;
            stackIn_18_0 = stackOut_17_0;
            stackIn_18_1 = stackOut_17_1;
            if (param1 == null) {
              stackOut_20_0 = (RuntimeException) (Object) stackIn_20_0;
              stackOut_20_1 = (StringBuilder) (Object) stackIn_20_1;
              stackOut_20_2 = "null";
              stackIn_21_0 = stackOut_20_0;
              stackIn_21_1 = stackOut_20_1;
              stackIn_21_2 = stackOut_20_2;
              break L7;
            } else {
              stackOut_18_0 = (RuntimeException) (Object) stackIn_18_0;
              stackOut_18_1 = (StringBuilder) (Object) stackIn_18_1;
              stackOut_18_2 = "{...}";
              stackIn_21_0 = stackOut_18_0;
              stackIn_21_1 = stackOut_18_1;
              stackIn_21_2 = stackOut_18_2;
              break L7;
            }
          }
          throw r.a((Throwable) (Object) stackIn_21_0, stackIn_21_2 + ')');
        }
        return stackIn_16_0;
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_u = "You have offered a Non-Agression Pact to <%0>.";
        field_v = "READY";
        field_w = new String[]{"£3.20", "€4.25", "US$ 5.00", "Can$ 4.95", "Aus$ 6.50", "Krn 29.95", "", "Rp 160", "Rng 17.95", "NZ$ 7.95", "SG$ 6.95", "Krn 44.95", "R$ 7,00"};
    }
}
