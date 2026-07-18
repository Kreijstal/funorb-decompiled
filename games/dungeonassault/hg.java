/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class hg extends qb {
    private ug field_m;
    static md field_n;
    static long field_s;
    static int[] field_t;
    static wi field_r;
    static String field_p;
    md field_q;
    mb field_o;

    private final void a(lp param0, int[] param1, int param2, int param3, int param4, boolean param5) {
        RuntimeException var7 = null;
        int var7_int = 0;
        int var8 = 0;
        int var9 = 0;
        int var10 = 0;
        ni var11 = null;
        int var12 = 0;
        ug stackIn_11_0 = null;
        lp stackIn_11_1 = null;
        int stackIn_11_2 = 0;
        ug stackIn_12_0 = null;
        lp stackIn_12_1 = null;
        int stackIn_12_2 = 0;
        ug stackIn_13_0 = null;
        lp stackIn_13_1 = null;
        int stackIn_13_2 = 0;
        int stackIn_13_3 = 0;
        RuntimeException stackIn_27_0 = null;
        StringBuilder stackIn_27_1 = null;
        RuntimeException stackIn_28_0 = null;
        StringBuilder stackIn_28_1 = null;
        RuntimeException stackIn_29_0 = null;
        StringBuilder stackIn_29_1 = null;
        String stackIn_29_2 = null;
        RuntimeException stackIn_30_0 = null;
        StringBuilder stackIn_30_1 = null;
        RuntimeException stackIn_31_0 = null;
        StringBuilder stackIn_31_1 = null;
        RuntimeException stackIn_32_0 = null;
        StringBuilder stackIn_32_1 = null;
        String stackIn_32_2 = null;
        RuntimeException decompiledCaughtException = null;
        ug stackOut_10_0 = null;
        lp stackOut_10_1 = null;
        int stackOut_10_2 = 0;
        ug stackOut_12_0 = null;
        lp stackOut_12_1 = null;
        int stackOut_12_2 = 0;
        int stackOut_12_3 = 0;
        ug stackOut_11_0 = null;
        lp stackOut_11_1 = null;
        int stackOut_11_2 = 0;
        int stackOut_11_3 = 0;
        RuntimeException stackOut_26_0 = null;
        StringBuilder stackOut_26_1 = null;
        RuntimeException stackOut_28_0 = null;
        StringBuilder stackOut_28_1 = null;
        String stackOut_28_2 = null;
        RuntimeException stackOut_27_0 = null;
        StringBuilder stackOut_27_1 = null;
        String stackOut_27_2 = null;
        RuntimeException stackOut_29_0 = null;
        StringBuilder stackOut_29_1 = null;
        RuntimeException stackOut_31_0 = null;
        StringBuilder stackOut_31_1 = null;
        String stackOut_31_2 = null;
        RuntimeException stackOut_30_0 = null;
        StringBuilder stackOut_30_1 = null;
        String stackOut_30_2 = null;
        var12 = DungeonAssault.field_K;
        try {
          L0: {
            L1: {
              if (0 == (4 & ((hg) this).field_m.field_G[param0.field_p])) {
                param0.field_v.b(param1, param3, param4);
                break L1;
              } else {
                if (param0.field_r >= 0) {
                  param0.field_v.b(param1, param3, param4);
                  break L1;
                } else {
                  var7_int = ((hg) this).field_m.field_Q[param0.field_p] / vn.field_t;
                  L2: while (true) {
                    var8 = (-param0.field_m + (1048575 - -var7_int)) / var7_int;
                    if (var8 <= param4) {
                      L3: {
                        param0.field_v.b(param1, param3, var8);
                        param3 = param3 + var8;
                        param0.field_m = param0.field_m + (-1048576 + var8 * var7_int);
                        param4 = param4 - var8;
                        var9 = vn.field_t / 100;
                        var10 = 262144 / var7_int;
                        if (~var10 > ~var9) {
                          var9 = var10;
                          break L3;
                        } else {
                          break L3;
                        }
                      }
                      L4: {
                        var11 = param0.field_v;
                        if (((hg) this).field_m.field_o[param0.field_p] == 0) {
                          param0.field_v = ni.a(param0.field_I, var11.l(), var11.i(), var11.h());
                          break L4;
                        } else {
                          L5: {
                            param0.field_v = ni.a(param0.field_I, var11.l(), 0, var11.h());
                            stackOut_10_0 = ((hg) this).field_m;
                            stackOut_10_1 = (lp) param0;
                            stackOut_10_2 = 4917;
                            stackIn_12_0 = stackOut_10_0;
                            stackIn_12_1 = stackOut_10_1;
                            stackIn_12_2 = stackOut_10_2;
                            stackIn_11_0 = stackOut_10_0;
                            stackIn_11_1 = stackOut_10_1;
                            stackIn_11_2 = stackOut_10_2;
                            if (param0.field_x.field_r[param0.field_y] >= 0) {
                              stackOut_12_0 = (ug) (Object) stackIn_12_0;
                              stackOut_12_1 = (lp) (Object) stackIn_12_1;
                              stackOut_12_2 = stackIn_12_2;
                              stackOut_12_3 = 0;
                              stackIn_13_0 = stackOut_12_0;
                              stackIn_13_1 = stackOut_12_1;
                              stackIn_13_2 = stackOut_12_2;
                              stackIn_13_3 = stackOut_12_3;
                              break L5;
                            } else {
                              stackOut_11_0 = (ug) (Object) stackIn_11_0;
                              stackOut_11_1 = (lp) (Object) stackIn_11_1;
                              stackOut_11_2 = stackIn_11_2;
                              stackOut_11_3 = 1;
                              stackIn_13_0 = stackOut_11_0;
                              stackIn_13_1 = stackOut_11_1;
                              stackIn_13_2 = stackOut_11_2;
                              stackIn_13_3 = stackOut_11_3;
                              break L5;
                            }
                          }
                          ((ug) (Object) stackIn_13_0).a(stackIn_13_1, stackIn_13_2, stackIn_13_3 != 0);
                          param0.field_v.a(var9, var11.i());
                          break L4;
                        }
                      }
                      L6: {
                        if (0 > param0.field_x.field_r[param0.field_y]) {
                          param0.field_v.e(-1);
                          break L6;
                        } else {
                          break L6;
                        }
                      }
                      var11.f(var9);
                      var11.b(param1, param3, -param3 + param2);
                      if (var11.e()) {
                        ((hg) this).field_o.b((qb) (Object) var11);
                        continue L2;
                      } else {
                        continue L2;
                      }
                    } else {
                      param0.field_m = param0.field_m + param4 * var7_int;
                      param0.field_v.b(param1, param3, param4);
                      break L1;
                    }
                  }
                }
              }
            }
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L7: {
            var7 = decompiledCaughtException;
            stackOut_26_0 = (RuntimeException) var7;
            stackOut_26_1 = new StringBuilder().append("hg.D(");
            stackIn_28_0 = stackOut_26_0;
            stackIn_28_1 = stackOut_26_1;
            stackIn_27_0 = stackOut_26_0;
            stackIn_27_1 = stackOut_26_1;
            if (param0 == null) {
              stackOut_28_0 = (RuntimeException) (Object) stackIn_28_0;
              stackOut_28_1 = (StringBuilder) (Object) stackIn_28_1;
              stackOut_28_2 = "null";
              stackIn_29_0 = stackOut_28_0;
              stackIn_29_1 = stackOut_28_1;
              stackIn_29_2 = stackOut_28_2;
              break L7;
            } else {
              stackOut_27_0 = (RuntimeException) (Object) stackIn_27_0;
              stackOut_27_1 = (StringBuilder) (Object) stackIn_27_1;
              stackOut_27_2 = "{...}";
              stackIn_29_0 = stackOut_27_0;
              stackIn_29_1 = stackOut_27_1;
              stackIn_29_2 = stackOut_27_2;
              break L7;
            }
          }
          L8: {
            stackOut_29_0 = (RuntimeException) (Object) stackIn_29_0;
            stackOut_29_1 = ((StringBuilder) (Object) stackIn_29_1).append(stackIn_29_2).append(',');
            stackIn_31_0 = stackOut_29_0;
            stackIn_31_1 = stackOut_29_1;
            stackIn_30_0 = stackOut_29_0;
            stackIn_30_1 = stackOut_29_1;
            if (param1 == null) {
              stackOut_31_0 = (RuntimeException) (Object) stackIn_31_0;
              stackOut_31_1 = (StringBuilder) (Object) stackIn_31_1;
              stackOut_31_2 = "null";
              stackIn_32_0 = stackOut_31_0;
              stackIn_32_1 = stackOut_31_1;
              stackIn_32_2 = stackOut_31_2;
              break L8;
            } else {
              stackOut_30_0 = (RuntimeException) (Object) stackIn_30_0;
              stackOut_30_1 = (StringBuilder) (Object) stackIn_30_1;
              stackOut_30_2 = "{...}";
              stackIn_32_0 = stackOut_30_0;
              stackIn_32_1 = stackOut_30_1;
              stackIn_32_2 = stackOut_30_2;
              break L8;
            }
          }
          throw vk.a((Throwable) (Object) stackIn_32_0, stackIn_32_2 + ',' + param2 + ',' + param3 + ',' + param4 + ',' + true + ')');
        }
    }

    final static void a(int param0, int param1, int param2) {
        if (null != kc.field_Q) {
          if (~kc.field_Q.length > ~param2) {
            L0: {
              kc.field_Q = new int[param2 * 2];
              if (i.field_t == null) {
                i.field_t = new int[param2 * 2];
                break L0;
              } else {
                if (~param2 < ~i.field_t.length) {
                  i.field_t = new int[param2 * 2];
                  break L0;
                } else {
                  break L0;
                }
              }
            }
            L1: {
              L2: {
                if (null == mf.field_d) {
                  break L2;
                } else {
                  if (~param2 < ~mf.field_d.length) {
                    break L2;
                  } else {
                    break L1;
                  }
                }
              }
              mf.field_d = new int[param2 * 2];
              break L1;
            }
            L3: {
              L4: {
                if (wa.field_m == null) {
                  break L4;
                } else {
                  if (~param2 < ~wa.field_m.length) {
                    break L4;
                  } else {
                    break L3;
                  }
                }
              }
              wa.field_m = new int[param2 * 2];
              break L3;
            }
            if (null == tc.field_w) {
              L5: {
                L6: {
                  tc.field_w = new int[param2 * 2];
                  if (null == ci.field_n) {
                    break L6;
                  } else {
                    if (param2 > ci.field_n.length) {
                      break L6;
                    } else {
                      break L5;
                    }
                  }
                }
                ci.field_n = new int[param2 * 2];
                break L5;
              }
              L7: {
                L8: {
                  if (ol.field_k == null) {
                    break L8;
                  } else {
                    if (param2 + param1 <= ol.field_k.length) {
                      break L7;
                    } else {
                      break L8;
                    }
                  }
                }
                ol.field_k = new int[2 * (param1 + param2)];
                break L7;
              }
              if (tf.field_e == null) {
                tf.field_e = new boolean[param2 * 2];
                ln.field_d = -2147483648;
                n.field_d = -2147483648;
                ib.field_e = 2147483647;
                da.field_B = 2147483647;
                if (param0 == 31751) {
                  lc.field_d = 0;
                  return;
                } else {
                  hg.a(59, -22, 8);
                  lc.field_d = 0;
                  return;
                }
              } else {
                if (param2 <= tf.field_e.length) {
                  ln.field_d = -2147483648;
                  n.field_d = -2147483648;
                  ib.field_e = 2147483647;
                  da.field_B = 2147483647;
                  if (param0 == 31751) {
                    lc.field_d = 0;
                    return;
                  } else {
                    hg.a(59, -22, 8);
                    lc.field_d = 0;
                    return;
                  }
                } else {
                  tf.field_e = new boolean[param2 * 2];
                  ln.field_d = -2147483648;
                  n.field_d = -2147483648;
                  ib.field_e = 2147483647;
                  da.field_B = 2147483647;
                  if (param0 == 31751) {
                    lc.field_d = 0;
                    return;
                  } else {
                    hg.a(59, -22, 8);
                    lc.field_d = 0;
                    return;
                  }
                }
              }
            } else {
              if (param2 <= tc.field_w.length) {
                L9: {
                  L10: {
                    if (null == ci.field_n) {
                      break L10;
                    } else {
                      if (param2 > ci.field_n.length) {
                        break L10;
                      } else {
                        break L9;
                      }
                    }
                  }
                  ci.field_n = new int[param2 * 2];
                  break L9;
                }
                if (ol.field_k == null) {
                  ol.field_k = new int[2 * (param1 + param2)];
                  if (tf.field_e == null) {
                    tf.field_e = new boolean[param2 * 2];
                    ln.field_d = -2147483648;
                    n.field_d = -2147483648;
                    ib.field_e = 2147483647;
                    da.field_B = 2147483647;
                    if (param0 == 31751) {
                      lc.field_d = 0;
                      return;
                    } else {
                      hg.a(59, -22, 8);
                      lc.field_d = 0;
                      return;
                    }
                  } else {
                    if (param2 <= tf.field_e.length) {
                      ln.field_d = -2147483648;
                      n.field_d = -2147483648;
                      ib.field_e = 2147483647;
                      da.field_B = 2147483647;
                      if (param0 == 31751) {
                        lc.field_d = 0;
                        return;
                      } else {
                        hg.a(59, -22, 8);
                        lc.field_d = 0;
                        return;
                      }
                    } else {
                      tf.field_e = new boolean[param2 * 2];
                      ln.field_d = -2147483648;
                      n.field_d = -2147483648;
                      ib.field_e = 2147483647;
                      da.field_B = 2147483647;
                      if (param0 == 31751) {
                        lc.field_d = 0;
                        return;
                      } else {
                        hg.a(59, -22, 8);
                        lc.field_d = 0;
                        return;
                      }
                    }
                  }
                } else {
                  if (param2 + param1 <= ol.field_k.length) {
                    if (tf.field_e == null) {
                      tf.field_e = new boolean[param2 * 2];
                      ln.field_d = -2147483648;
                      n.field_d = -2147483648;
                      ib.field_e = 2147483647;
                      da.field_B = 2147483647;
                      if (param0 == 31751) {
                        lc.field_d = 0;
                        return;
                      } else {
                        hg.a(59, -22, 8);
                        lc.field_d = 0;
                        return;
                      }
                    } else {
                      if (param2 <= tf.field_e.length) {
                        ln.field_d = -2147483648;
                        n.field_d = -2147483648;
                        ib.field_e = 2147483647;
                        da.field_B = 2147483647;
                        if (param0 == 31751) {
                          lc.field_d = 0;
                          return;
                        } else {
                          hg.a(59, -22, 8);
                          lc.field_d = 0;
                          return;
                        }
                      } else {
                        tf.field_e = new boolean[param2 * 2];
                        ln.field_d = -2147483648;
                        n.field_d = -2147483648;
                        ib.field_e = 2147483647;
                        da.field_B = 2147483647;
                        if (param0 == 31751) {
                          lc.field_d = 0;
                          return;
                        } else {
                          hg.a(59, -22, 8);
                          lc.field_d = 0;
                          return;
                        }
                      }
                    }
                  } else {
                    ol.field_k = new int[2 * (param1 + param2)];
                    if (tf.field_e == null) {
                      tf.field_e = new boolean[param2 * 2];
                      ln.field_d = -2147483648;
                      n.field_d = -2147483648;
                      ib.field_e = 2147483647;
                      da.field_B = 2147483647;
                      if (param0 == 31751) {
                        lc.field_d = 0;
                        return;
                      } else {
                        hg.a(59, -22, 8);
                        lc.field_d = 0;
                        return;
                      }
                    } else {
                      if (param2 <= tf.field_e.length) {
                        ln.field_d = -2147483648;
                        n.field_d = -2147483648;
                        ib.field_e = 2147483647;
                        da.field_B = 2147483647;
                        if (param0 == 31751) {
                          lc.field_d = 0;
                          return;
                        } else {
                          hg.a(59, -22, 8);
                          lc.field_d = 0;
                          return;
                        }
                      } else {
                        tf.field_e = new boolean[param2 * 2];
                        ln.field_d = -2147483648;
                        n.field_d = -2147483648;
                        ib.field_e = 2147483647;
                        da.field_B = 2147483647;
                        if (param0 == 31751) {
                          lc.field_d = 0;
                          return;
                        } else {
                          hg.a(59, -22, 8);
                          lc.field_d = 0;
                          return;
                        }
                      }
                    }
                  }
                }
              } else {
                L11: {
                  L12: {
                    tc.field_w = new int[param2 * 2];
                    if (null == ci.field_n) {
                      break L12;
                    } else {
                      if (param2 > ci.field_n.length) {
                        break L12;
                      } else {
                        break L11;
                      }
                    }
                  }
                  ci.field_n = new int[param2 * 2];
                  break L11;
                }
                L13: {
                  L14: {
                    if (ol.field_k == null) {
                      break L14;
                    } else {
                      if (param2 + param1 <= ol.field_k.length) {
                        break L13;
                      } else {
                        break L14;
                      }
                    }
                  }
                  ol.field_k = new int[2 * (param1 + param2)];
                  break L13;
                }
                L15: {
                  L16: {
                    if (tf.field_e == null) {
                      break L16;
                    } else {
                      if (param2 <= tf.field_e.length) {
                        break L15;
                      } else {
                        break L16;
                      }
                    }
                  }
                  tf.field_e = new boolean[param2 * 2];
                  break L15;
                }
                ln.field_d = -2147483648;
                n.field_d = -2147483648;
                ib.field_e = 2147483647;
                da.field_B = 2147483647;
                if (param0 == 31751) {
                  lc.field_d = 0;
                  return;
                } else {
                  hg.a(59, -22, 8);
                  lc.field_d = 0;
                  return;
                }
              }
            }
          } else {
            L17: {
              if (i.field_t == null) {
                i.field_t = new int[param2 * 2];
                break L17;
              } else {
                if (~param2 < ~i.field_t.length) {
                  i.field_t = new int[param2 * 2];
                  break L17;
                } else {
                  break L17;
                }
              }
            }
            L18: {
              L19: {
                if (null == mf.field_d) {
                  break L19;
                } else {
                  if (~param2 < ~mf.field_d.length) {
                    break L19;
                  } else {
                    break L18;
                  }
                }
              }
              mf.field_d = new int[param2 * 2];
              break L18;
            }
            L20: {
              L21: {
                if (wa.field_m == null) {
                  break L21;
                } else {
                  if (~param2 < ~wa.field_m.length) {
                    break L21;
                  } else {
                    break L20;
                  }
                }
              }
              wa.field_m = new int[param2 * 2];
              break L20;
            }
            if (null == tc.field_w) {
              L22: {
                L23: {
                  tc.field_w = new int[param2 * 2];
                  if (null == ci.field_n) {
                    break L23;
                  } else {
                    if (param2 > ci.field_n.length) {
                      break L23;
                    } else {
                      break L22;
                    }
                  }
                }
                ci.field_n = new int[param2 * 2];
                break L22;
              }
              L24: {
                L25: {
                  if (ol.field_k == null) {
                    break L25;
                  } else {
                    if (param2 + param1 <= ol.field_k.length) {
                      break L24;
                    } else {
                      break L25;
                    }
                  }
                }
                ol.field_k = new int[2 * (param1 + param2)];
                break L24;
              }
              L26: {
                L27: {
                  if (tf.field_e == null) {
                    break L27;
                  } else {
                    if (param2 <= tf.field_e.length) {
                      break L26;
                    } else {
                      break L27;
                    }
                  }
                }
                tf.field_e = new boolean[param2 * 2];
                break L26;
              }
              ln.field_d = -2147483648;
              n.field_d = -2147483648;
              ib.field_e = 2147483647;
              da.field_B = 2147483647;
              if (param0 == 31751) {
                lc.field_d = 0;
                return;
              } else {
                hg.a(59, -22, 8);
                lc.field_d = 0;
                return;
              }
            } else {
              if (param2 <= tc.field_w.length) {
                L28: {
                  L29: {
                    if (null == ci.field_n) {
                      break L29;
                    } else {
                      if (param2 > ci.field_n.length) {
                        break L29;
                      } else {
                        break L28;
                      }
                    }
                  }
                  ci.field_n = new int[param2 * 2];
                  break L28;
                }
                if (ol.field_k == null) {
                  L30: {
                    L31: {
                      ol.field_k = new int[2 * (param1 + param2)];
                      if (tf.field_e == null) {
                        break L31;
                      } else {
                        if (param2 <= tf.field_e.length) {
                          break L30;
                        } else {
                          break L31;
                        }
                      }
                    }
                    tf.field_e = new boolean[param2 * 2];
                    break L30;
                  }
                  ln.field_d = -2147483648;
                  n.field_d = -2147483648;
                  ib.field_e = 2147483647;
                  da.field_B = 2147483647;
                  if (param0 == 31751) {
                    lc.field_d = 0;
                    return;
                  } else {
                    hg.a(59, -22, 8);
                    lc.field_d = 0;
                    return;
                  }
                } else {
                  if (param2 + param1 <= ol.field_k.length) {
                    if (tf.field_e == null) {
                      tf.field_e = new boolean[param2 * 2];
                      ln.field_d = -2147483648;
                      n.field_d = -2147483648;
                      ib.field_e = 2147483647;
                      da.field_B = 2147483647;
                      if (param0 == 31751) {
                        lc.field_d = 0;
                        return;
                      } else {
                        hg.a(59, -22, 8);
                        lc.field_d = 0;
                        return;
                      }
                    } else {
                      if (param2 <= tf.field_e.length) {
                        ln.field_d = -2147483648;
                        n.field_d = -2147483648;
                        ib.field_e = 2147483647;
                        da.field_B = 2147483647;
                        if (param0 == 31751) {
                          lc.field_d = 0;
                          return;
                        } else {
                          hg.a(59, -22, 8);
                          lc.field_d = 0;
                          return;
                        }
                      } else {
                        tf.field_e = new boolean[param2 * 2];
                        ln.field_d = -2147483648;
                        n.field_d = -2147483648;
                        ib.field_e = 2147483647;
                        da.field_B = 2147483647;
                        if (param0 == 31751) {
                          lc.field_d = 0;
                          return;
                        } else {
                          hg.a(59, -22, 8);
                          lc.field_d = 0;
                          return;
                        }
                      }
                    }
                  } else {
                    L32: {
                      L33: {
                        ol.field_k = new int[2 * (param1 + param2)];
                        if (tf.field_e == null) {
                          break L33;
                        } else {
                          if (param2 <= tf.field_e.length) {
                            break L32;
                          } else {
                            break L33;
                          }
                        }
                      }
                      tf.field_e = new boolean[param2 * 2];
                      break L32;
                    }
                    ln.field_d = -2147483648;
                    n.field_d = -2147483648;
                    ib.field_e = 2147483647;
                    da.field_B = 2147483647;
                    if (param0 == 31751) {
                      lc.field_d = 0;
                      return;
                    } else {
                      hg.a(59, -22, 8);
                      lc.field_d = 0;
                      return;
                    }
                  }
                }
              } else {
                L34: {
                  L35: {
                    tc.field_w = new int[param2 * 2];
                    if (null == ci.field_n) {
                      break L35;
                    } else {
                      if (param2 > ci.field_n.length) {
                        break L35;
                      } else {
                        break L34;
                      }
                    }
                  }
                  ci.field_n = new int[param2 * 2];
                  break L34;
                }
                L36: {
                  L37: {
                    if (ol.field_k == null) {
                      break L37;
                    } else {
                      if (param2 + param1 <= ol.field_k.length) {
                        break L36;
                      } else {
                        break L37;
                      }
                    }
                  }
                  ol.field_k = new int[2 * (param1 + param2)];
                  break L36;
                }
                L38: {
                  L39: {
                    if (tf.field_e == null) {
                      break L39;
                    } else {
                      if (param2 <= tf.field_e.length) {
                        break L38;
                      } else {
                        break L39;
                      }
                    }
                  }
                  tf.field_e = new boolean[param2 * 2];
                  break L38;
                }
                ln.field_d = -2147483648;
                n.field_d = -2147483648;
                ib.field_e = 2147483647;
                da.field_B = 2147483647;
                if (param0 == 31751) {
                  lc.field_d = 0;
                  return;
                } else {
                  hg.a(59, -22, 8);
                  lc.field_d = 0;
                  return;
                }
              }
            }
          }
        } else {
          L40: {
            kc.field_Q = new int[param2 * 2];
            if (i.field_t == null) {
              i.field_t = new int[param2 * 2];
              break L40;
            } else {
              if (~param2 < ~i.field_t.length) {
                i.field_t = new int[param2 * 2];
                break L40;
              } else {
                break L40;
              }
            }
          }
          L41: {
            if (null == mf.field_d) {
              mf.field_d = new int[param2 * 2];
              break L41;
            } else {
              if (~param2 < ~mf.field_d.length) {
                mf.field_d = new int[param2 * 2];
                break L41;
              } else {
                break L41;
              }
            }
          }
          L42: {
            if (wa.field_m == null) {
              wa.field_m = new int[param2 * 2];
              break L42;
            } else {
              if (~param2 < ~wa.field_m.length) {
                wa.field_m = new int[param2 * 2];
                break L42;
              } else {
                break L42;
              }
            }
          }
          if (null == tc.field_w) {
            L43: {
              L44: {
                tc.field_w = new int[param2 * 2];
                if (null == ci.field_n) {
                  break L44;
                } else {
                  if (param2 > ci.field_n.length) {
                    break L44;
                  } else {
                    break L43;
                  }
                }
              }
              ci.field_n = new int[param2 * 2];
              break L43;
            }
            L45: {
              L46: {
                if (ol.field_k == null) {
                  break L46;
                } else {
                  if (param2 + param1 <= ol.field_k.length) {
                    break L45;
                  } else {
                    break L46;
                  }
                }
              }
              ol.field_k = new int[2 * (param1 + param2)];
              break L45;
            }
            L47: {
              L48: {
                if (tf.field_e == null) {
                  break L48;
                } else {
                  if (param2 <= tf.field_e.length) {
                    break L47;
                  } else {
                    break L48;
                  }
                }
              }
              tf.field_e = new boolean[param2 * 2];
              break L47;
            }
            ln.field_d = -2147483648;
            n.field_d = -2147483648;
            ib.field_e = 2147483647;
            da.field_B = 2147483647;
            if (param0 == 31751) {
              lc.field_d = 0;
              return;
            } else {
              hg.a(59, -22, 8);
              lc.field_d = 0;
              return;
            }
          } else {
            if (param2 <= tc.field_w.length) {
              L49: {
                L50: {
                  if (null == ci.field_n) {
                    break L50;
                  } else {
                    if (param2 > ci.field_n.length) {
                      break L50;
                    } else {
                      break L49;
                    }
                  }
                }
                ci.field_n = new int[param2 * 2];
                break L49;
              }
              if (ol.field_k == null) {
                L51: {
                  L52: {
                    ol.field_k = new int[2 * (param1 + param2)];
                    if (tf.field_e == null) {
                      break L52;
                    } else {
                      if (param2 <= tf.field_e.length) {
                        break L51;
                      } else {
                        break L52;
                      }
                    }
                  }
                  tf.field_e = new boolean[param2 * 2];
                  break L51;
                }
                ln.field_d = -2147483648;
                n.field_d = -2147483648;
                ib.field_e = 2147483647;
                da.field_B = 2147483647;
                if (param0 == 31751) {
                  lc.field_d = 0;
                  return;
                } else {
                  hg.a(59, -22, 8);
                  lc.field_d = 0;
                  return;
                }
              } else {
                if (param2 + param1 <= ol.field_k.length) {
                  if (tf.field_e == null) {
                    tf.field_e = new boolean[param2 * 2];
                    ln.field_d = -2147483648;
                    n.field_d = -2147483648;
                    ib.field_e = 2147483647;
                    da.field_B = 2147483647;
                    if (param0 == 31751) {
                      lc.field_d = 0;
                      return;
                    } else {
                      hg.a(59, -22, 8);
                      lc.field_d = 0;
                      return;
                    }
                  } else {
                    if (param2 <= tf.field_e.length) {
                      ln.field_d = -2147483648;
                      n.field_d = -2147483648;
                      ib.field_e = 2147483647;
                      da.field_B = 2147483647;
                      if (param0 == 31751) {
                        lc.field_d = 0;
                        return;
                      } else {
                        hg.a(59, -22, 8);
                        lc.field_d = 0;
                        return;
                      }
                    } else {
                      tf.field_e = new boolean[param2 * 2];
                      ln.field_d = -2147483648;
                      n.field_d = -2147483648;
                      ib.field_e = 2147483647;
                      da.field_B = 2147483647;
                      if (param0 == 31751) {
                        lc.field_d = 0;
                        return;
                      } else {
                        hg.a(59, -22, 8);
                        lc.field_d = 0;
                        return;
                      }
                    }
                  }
                } else {
                  L53: {
                    L54: {
                      ol.field_k = new int[2 * (param1 + param2)];
                      if (tf.field_e == null) {
                        break L54;
                      } else {
                        if (param2 <= tf.field_e.length) {
                          break L53;
                        } else {
                          break L54;
                        }
                      }
                    }
                    tf.field_e = new boolean[param2 * 2];
                    break L53;
                  }
                  ln.field_d = -2147483648;
                  n.field_d = -2147483648;
                  ib.field_e = 2147483647;
                  da.field_B = 2147483647;
                  if (param0 == 31751) {
                    lc.field_d = 0;
                    return;
                  } else {
                    hg.a(59, -22, 8);
                    lc.field_d = 0;
                    return;
                  }
                }
              }
            } else {
              L55: {
                L56: {
                  tc.field_w = new int[param2 * 2];
                  if (null == ci.field_n) {
                    break L56;
                  } else {
                    if (param2 > ci.field_n.length) {
                      break L56;
                    } else {
                      break L55;
                    }
                  }
                }
                ci.field_n = new int[param2 * 2];
                break L55;
              }
              L57: {
                L58: {
                  if (ol.field_k == null) {
                    break L58;
                  } else {
                    if (param2 + param1 <= ol.field_k.length) {
                      break L57;
                    } else {
                      break L58;
                    }
                  }
                }
                ol.field_k = new int[2 * (param1 + param2)];
                break L57;
              }
              L59: {
                L60: {
                  if (tf.field_e == null) {
                    break L60;
                  } else {
                    if (param2 <= tf.field_e.length) {
                      break L59;
                    } else {
                      break L60;
                    }
                  }
                }
                tf.field_e = new boolean[param2 * 2];
                break L59;
              }
              ln.field_d = -2147483648;
              n.field_d = -2147483648;
              ib.field_e = 2147483647;
              da.field_B = 2147483647;
              if (param0 == 31751) {
                lc.field_d = 0;
                return;
              } else {
                hg.a(59, -22, 8);
                lc.field_d = 0;
                return;
              }
            }
          }
        }
    }

    private final void a(int param0, lp param1, int param2) {
        RuntimeException var4 = null;
        int var4_int = 0;
        int var5 = 0;
        ug stackIn_6_0 = null;
        lp stackIn_6_1 = null;
        int stackIn_6_2 = 0;
        ug stackIn_7_0 = null;
        lp stackIn_7_1 = null;
        int stackIn_7_2 = 0;
        ug stackIn_8_0 = null;
        lp stackIn_8_1 = null;
        int stackIn_8_2 = 0;
        int stackIn_8_3 = 0;
        RuntimeException stackIn_18_0 = null;
        StringBuilder stackIn_18_1 = null;
        RuntimeException stackIn_19_0 = null;
        StringBuilder stackIn_19_1 = null;
        RuntimeException stackIn_20_0 = null;
        StringBuilder stackIn_20_1 = null;
        String stackIn_20_2 = null;
        RuntimeException decompiledCaughtException = null;
        ug stackOut_5_0 = null;
        lp stackOut_5_1 = null;
        int stackOut_5_2 = 0;
        ug stackOut_7_0 = null;
        lp stackOut_7_1 = null;
        int stackOut_7_2 = 0;
        int stackOut_7_3 = 0;
        ug stackOut_6_0 = null;
        lp stackOut_6_1 = null;
        int stackOut_6_2 = 0;
        int stackOut_6_3 = 0;
        RuntimeException stackOut_17_0 = null;
        StringBuilder stackOut_17_1 = null;
        RuntimeException stackOut_19_0 = null;
        StringBuilder stackOut_19_1 = null;
        String stackOut_19_2 = null;
        RuntimeException stackOut_18_0 = null;
        StringBuilder stackOut_18_1 = null;
        String stackOut_18_2 = null;
        try {
          L0: {
            L1: {
              if (0 == (4 & ((hg) this).field_m.field_G[param1.field_p])) {
                break L1;
              } else {
                if (param1.field_r >= 0) {
                  break L1;
                } else {
                  var4_int = ((hg) this).field_m.field_Q[param1.field_p] / vn.field_t;
                  var5 = (-param1.field_m + var4_int + 1048575) / var4_int;
                  param1.field_m = 1048575 & var4_int * param2 + param1.field_m;
                  if (param2 >= var5) {
                    L2: {
                      if (0 == ((hg) this).field_m.field_o[param1.field_p]) {
                        param1.field_v = ni.a(param1.field_I, param1.field_v.l(), param1.field_v.i(), param1.field_v.h());
                        break L2;
                      } else {
                        L3: {
                          param1.field_v = ni.a(param1.field_I, param1.field_v.l(), 0, param1.field_v.h());
                          stackOut_5_0 = ((hg) this).field_m;
                          stackOut_5_1 = (lp) param1;
                          stackOut_5_2 = 4917;
                          stackIn_7_0 = stackOut_5_0;
                          stackIn_7_1 = stackOut_5_1;
                          stackIn_7_2 = stackOut_5_2;
                          stackIn_6_0 = stackOut_5_0;
                          stackIn_6_1 = stackOut_5_1;
                          stackIn_6_2 = stackOut_5_2;
                          if (param1.field_x.field_r[param1.field_y] >= 0) {
                            stackOut_7_0 = (ug) (Object) stackIn_7_0;
                            stackOut_7_1 = (lp) (Object) stackIn_7_1;
                            stackOut_7_2 = stackIn_7_2;
                            stackOut_7_3 = 0;
                            stackIn_8_0 = stackOut_7_0;
                            stackIn_8_1 = stackOut_7_1;
                            stackIn_8_2 = stackOut_7_2;
                            stackIn_8_3 = stackOut_7_3;
                            break L3;
                          } else {
                            stackOut_6_0 = (ug) (Object) stackIn_6_0;
                            stackOut_6_1 = (lp) (Object) stackIn_6_1;
                            stackOut_6_2 = stackIn_6_2;
                            stackOut_6_3 = 1;
                            stackIn_8_0 = stackOut_6_0;
                            stackIn_8_1 = stackOut_6_1;
                            stackIn_8_2 = stackOut_6_2;
                            stackIn_8_3 = stackOut_6_3;
                            break L3;
                          }
                        }
                        ((ug) (Object) stackIn_8_0).a(stackIn_8_1, stackIn_8_2, stackIn_8_3 != 0);
                        break L2;
                      }
                    }
                    L4: {
                      if (param1.field_x.field_r[param1.field_y] >= 0) {
                        break L4;
                      } else {
                        param1.field_v.e(-1);
                        break L4;
                      }
                    }
                    param2 = param1.field_m / var4_int;
                    break L1;
                  } else {
                    break L1;
                  }
                }
              }
            }
            L5: {
              if (param0 < -71) {
                break L5;
              } else {
                field_t = null;
                break L5;
              }
            }
            param1.field_v.a(param2);
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L6: {
            var4 = decompiledCaughtException;
            stackOut_17_0 = (RuntimeException) var4;
            stackOut_17_1 = new StringBuilder().append("hg.B(").append(param0).append(',');
            stackIn_19_0 = stackOut_17_0;
            stackIn_19_1 = stackOut_17_1;
            stackIn_18_0 = stackOut_17_0;
            stackIn_18_1 = stackOut_17_1;
            if (param1 == null) {
              stackOut_19_0 = (RuntimeException) (Object) stackIn_19_0;
              stackOut_19_1 = (StringBuilder) (Object) stackIn_19_1;
              stackOut_19_2 = "null";
              stackIn_20_0 = stackOut_19_0;
              stackIn_20_1 = stackOut_19_1;
              stackIn_20_2 = stackOut_19_2;
              break L6;
            } else {
              stackOut_18_0 = (RuntimeException) (Object) stackIn_18_0;
              stackOut_18_1 = (StringBuilder) (Object) stackIn_18_1;
              stackOut_18_2 = "{...}";
              stackIn_20_0 = stackOut_18_0;
              stackIn_20_1 = stackOut_18_1;
              stackIn_20_2 = stackOut_18_2;
              break L6;
            }
          }
          throw vk.a((Throwable) (Object) stackIn_20_0, stackIn_20_2 + ',' + param2 + ')');
        }
    }

    final int a() {
        return 0;
    }

    final void a(int param0) {
        int var2 = 0;
        lp var3 = null;
        int var4 = 0;
        var4 = DungeonAssault.field_K;
        ((hg) this).field_o.a(param0);
        var3 = (lp) (Object) ((hg) this).field_q.e(-24172);
        L0: while (true) {
          if (var3 != null) {
            if (!((hg) this).field_m.a(var3, -16257)) {
              var2 = param0;
              L1: while (true) {
                if (~var3.field_H <= ~var2) {
                  this.a(-84, var3, var2);
                  var3.field_H = var3.field_H - var2;
                  var3 = (lp) (Object) ((hg) this).field_q.a(4);
                  continue L0;
                } else {
                  this.a(-72, var3, var3.field_H);
                  var2 = var2 - var3.field_H;
                  if (((hg) this).field_m.a(-127, 0, var2, var3, (int[]) null)) {
                    var3 = (lp) (Object) ((hg) this).field_q.a(4);
                    continue L0;
                  } else {
                    continue L1;
                  }
                }
              }
            } else {
              var3 = (lp) (Object) ((hg) this).field_q.a(4);
              continue L0;
            }
          } else {
            return;
          }
        }
    }

    final qb c() {
        lp var1_ref = null;
        int var2 = DungeonAssault.field_K;
        do {
            var1_ref = (lp) (Object) ((hg) this).field_q.a(4);
            if (var1_ref == null) {
                return null;
            }
        } while (null == var1_ref.field_v);
        return (qb) (Object) var1_ref.field_v;
    }

    public static void d(int param0) {
        field_r = null;
        field_p = null;
        field_n = null;
        field_t = null;
    }

    final qb d() {
        lp var1 = (lp) (Object) ((hg) this).field_q.e(-24172);
        if (var1 == null) {
            return null;
        }
        if (!(null == var1.field_v)) {
            return (qb) (Object) var1.field_v;
        }
        return ((hg) this).c();
    }

    final void b(int[] param0, int param1, int param2) {
        RuntimeException var4 = null;
        int var4_int = 0;
        int var5 = 0;
        lp var6 = null;
        int var7 = 0;
        RuntimeException stackIn_14_0 = null;
        StringBuilder stackIn_14_1 = null;
        RuntimeException stackIn_15_0 = null;
        StringBuilder stackIn_15_1 = null;
        RuntimeException stackIn_16_0 = null;
        StringBuilder stackIn_16_1 = null;
        String stackIn_16_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException stackOut_13_0 = null;
        StringBuilder stackOut_13_1 = null;
        RuntimeException stackOut_15_0 = null;
        StringBuilder stackOut_15_1 = null;
        String stackOut_15_2 = null;
        RuntimeException stackOut_14_0 = null;
        StringBuilder stackOut_14_1 = null;
        String stackOut_14_2 = null;
        var7 = DungeonAssault.field_K;
        try {
          L0: {
            ((hg) this).field_o.b(param0, param1, param2);
            var6 = (lp) (Object) ((hg) this).field_q.e(-24172);
            L1: while (true) {
              if (var6 == null) {
                break L0;
              } else {
                if (((hg) this).field_m.a(var6, -16257)) {
                  var6 = (lp) (Object) ((hg) this).field_q.a(4);
                  continue L1;
                } else {
                  var5 = param2;
                  var4_int = param1;
                  L2: while (true) {
                    if (var5 <= var6.field_H) {
                      this.a(var6, param0, var4_int - -var5, var4_int, var5, true);
                      var6.field_H = var6.field_H - var5;
                      var6 = (lp) (Object) ((hg) this).field_q.a(4);
                      continue L1;
                    } else {
                      this.a(var6, param0, var5 + var4_int, var4_int, var6.field_H, true);
                      var5 = var5 - var6.field_H;
                      var4_int = var4_int + var6.field_H;
                      if (((hg) this).field_m.a(118, var4_int, var5, var6, param0)) {
                        var6 = (lp) (Object) ((hg) this).field_q.a(4);
                        continue L1;
                      } else {
                        continue L2;
                      }
                    }
                  }
                }
              }
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L3: {
            var4 = decompiledCaughtException;
            stackOut_13_0 = (RuntimeException) var4;
            stackOut_13_1 = new StringBuilder().append("hg.F(");
            stackIn_15_0 = stackOut_13_0;
            stackIn_15_1 = stackOut_13_1;
            stackIn_14_0 = stackOut_13_0;
            stackIn_14_1 = stackOut_13_1;
            if (param0 == null) {
              stackOut_15_0 = (RuntimeException) (Object) stackIn_15_0;
              stackOut_15_1 = (StringBuilder) (Object) stackIn_15_1;
              stackOut_15_2 = "null";
              stackIn_16_0 = stackOut_15_0;
              stackIn_16_1 = stackOut_15_1;
              stackIn_16_2 = stackOut_15_2;
              break L3;
            } else {
              stackOut_14_0 = (RuntimeException) (Object) stackIn_14_0;
              stackOut_14_1 = (StringBuilder) (Object) stackIn_14_1;
              stackOut_14_2 = "{...}";
              stackIn_16_0 = stackOut_14_0;
              stackIn_16_1 = stackOut_14_1;
              stackIn_16_2 = stackOut_14_2;
              break L3;
            }
          }
          throw vk.a((Throwable) (Object) stackIn_16_0, stackIn_16_2 + ',' + param1 + ',' + param2 + ')');
        }
    }

    hg(ug param0) {
        ((hg) this).field_q = new md();
        ((hg) this).field_o = new mb();
        try {
            ((hg) this).field_m = param0;
        } catch (RuntimeException runtimeException) {
            throw vk.a((Throwable) (Object) runtimeException, "hg.<init>(" + (param0 != null ? "{...}" : "null") + ')');
        }
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_n = new md();
        field_p = "Skeleton Sentinels";
    }
}
