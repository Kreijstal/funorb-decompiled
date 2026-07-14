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
        int var7 = 0;
        int var8 = 0;
        int var9 = 0;
        int var10 = 0;
        ni var11 = null;
        int var12 = 0;
        ug stackIn_16_0 = null;
        lp stackIn_16_1 = null;
        int stackIn_16_2 = 0;
        ug stackIn_17_0 = null;
        lp stackIn_17_1 = null;
        int stackIn_17_2 = 0;
        ug stackIn_18_0 = null;
        lp stackIn_18_1 = null;
        int stackIn_18_2 = 0;
        int stackIn_18_3 = 0;
        ug stackOut_15_0 = null;
        lp stackOut_15_1 = null;
        int stackOut_15_2 = 0;
        ug stackOut_17_0 = null;
        lp stackOut_17_1 = null;
        int stackOut_17_2 = 0;
        int stackOut_17_3 = 0;
        ug stackOut_16_0 = null;
        lp stackOut_16_1 = null;
        int stackOut_16_2 = 0;
        int stackOut_16_3 = 0;
        var12 = DungeonAssault.field_K;
        if (0 != (4 & ((hg) this).field_m.field_G[param0.field_p])) {
          if (param0.field_r < 0) {
            var7 = ((hg) this).field_m.field_Q[param0.field_p] / vn.field_t;
            L0: while (true) {
              var8 = (-param0.field_m + (1048575 - -var7)) / var7;
              if (var8 <= param4) {
                L1: {
                  param0.field_v.b(param1, param3, var8);
                  param3 = param3 + var8;
                  param0.field_m = param0.field_m + (-1048576 + var8 * var7);
                  param4 = param4 - var8;
                  var9 = vn.field_t / 100;
                  var10 = 262144 / var7;
                  if ((var10 ^ -1) > (var9 ^ -1)) {
                    var9 = var10;
                    break L1;
                  } else {
                    break L1;
                  }
                }
                L2: {
                  var11 = param0.field_v;
                  if (((hg) this).field_m.field_o[param0.field_p] == 0) {
                    param0.field_v = ni.a(param0.field_I, var11.l(), var11.i(), var11.h());
                    break L2;
                  } else {
                    L3: {
                      param0.field_v = ni.a(param0.field_I, var11.l(), 0, var11.h());
                      stackOut_15_0 = ((hg) this).field_m;
                      stackOut_15_1 = (lp) param0;
                      stackOut_15_2 = 4917;
                      stackIn_17_0 = stackOut_15_0;
                      stackIn_17_1 = stackOut_15_1;
                      stackIn_17_2 = stackOut_15_2;
                      stackIn_16_0 = stackOut_15_0;
                      stackIn_16_1 = stackOut_15_1;
                      stackIn_16_2 = stackOut_15_2;
                      if (param0.field_x.field_r[param0.field_y] >= 0) {
                        stackOut_17_0 = (ug) (Object) stackIn_17_0;
                        stackOut_17_1 = (lp) (Object) stackIn_17_1;
                        stackOut_17_2 = stackIn_17_2;
                        stackOut_17_3 = 0;
                        stackIn_18_0 = stackOut_17_0;
                        stackIn_18_1 = stackOut_17_1;
                        stackIn_18_2 = stackOut_17_2;
                        stackIn_18_3 = stackOut_17_3;
                        break L3;
                      } else {
                        stackOut_16_0 = (ug) (Object) stackIn_16_0;
                        stackOut_16_1 = (lp) (Object) stackIn_16_1;
                        stackOut_16_2 = stackIn_16_2;
                        stackOut_16_3 = 1;
                        stackIn_18_0 = stackOut_16_0;
                        stackIn_18_1 = stackOut_16_1;
                        stackIn_18_2 = stackOut_16_2;
                        stackIn_18_3 = stackOut_16_3;
                        break L3;
                      }
                    }
                    ((ug) (Object) stackIn_18_0).a(stackIn_18_1, stackIn_18_2, stackIn_18_3 != 0);
                    param0.field_v.a(var9, var11.i());
                    break L2;
                  }
                }
                L4: {
                  if (0 > param0.field_x.field_r[param0.field_y]) {
                    param0.field_v.e(-1);
                    break L4;
                  } else {
                    break L4;
                  }
                }
                var11.f(var9);
                var11.b(param1, param3, -param3 + param2);
                if (var11.e()) {
                  ((hg) this).field_o.b((qb) (Object) var11);
                  continue L0;
                } else {
                  continue L0;
                }
              } else {
                param0.field_m = param0.field_m + param4 * var7;
                param0.field_v.b(param1, param3, param4);
                if (!param5) {
                  field_s = 44L;
                  return;
                } else {
                  return;
                }
              }
            }
          } else {
            param0.field_v.b(param1, param3, param4);
            if (!param5) {
              field_s = 44L;
              return;
            } else {
              return;
            }
          }
        } else {
          param0.field_v.b(param1, param3, param4);
          if (!param5) {
            field_s = 44L;
            return;
          } else {
            return;
          }
        }
    }

    final static void a(int param0, int param1, int param2) {
        if (null != kc.field_Q) {
          if ((kc.field_Q.length ^ -1) > (param2 ^ -1)) {
            L0: {
              kc.field_Q = new int[param2 * 2];
              if (i.field_t == null) {
                i.field_t = new int[param2 * 2];
                break L0;
              } else {
                if ((param2 ^ -1) < (i.field_t.length ^ -1)) {
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
                  if ((param2 ^ -1) < (mf.field_d.length ^ -1)) {
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
                  if ((param2 ^ -1) < (wa.field_m.length ^ -1)) {
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
                if ((param2 ^ -1) < (i.field_t.length ^ -1)) {
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
                  if ((param2 ^ -1) < (mf.field_d.length ^ -1)) {
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
                  if ((param2 ^ -1) < (wa.field_m.length ^ -1)) {
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
              if ((param2 ^ -1) < (i.field_t.length ^ -1)) {
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
              if ((param2 ^ -1) < (mf.field_d.length ^ -1)) {
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
              if ((param2 ^ -1) < (wa.field_m.length ^ -1)) {
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
        int var4 = 0;
        int var5 = 0;
        ug stackIn_17_0 = null;
        lp stackIn_17_1 = null;
        int stackIn_17_2 = 0;
        ug stackIn_18_0 = null;
        lp stackIn_18_1 = null;
        int stackIn_18_2 = 0;
        ug stackIn_19_0 = null;
        lp stackIn_19_1 = null;
        int stackIn_19_2 = 0;
        int stackIn_19_3 = 0;
        ug stackOut_16_0 = null;
        lp stackOut_16_1 = null;
        int stackOut_16_2 = 0;
        ug stackOut_18_0 = null;
        lp stackOut_18_1 = null;
        int stackOut_18_2 = 0;
        int stackOut_18_3 = 0;
        ug stackOut_17_0 = null;
        lp stackOut_17_1 = null;
        int stackOut_17_2 = 0;
        int stackOut_17_3 = 0;
        if (0 != (4 & ((hg) this).field_m.field_G[param1.field_p])) {
          if ((param1.field_r ^ -1) > -1) {
            var4 = ((hg) this).field_m.field_Q[param1.field_p] / vn.field_t;
            var5 = (-param1.field_m + var4 + 1048575) / var4;
            param1.field_m = 1048575 & var4 * param2 + param1.field_m;
            if (param2 >= var5) {
              if (0 == ((hg) this).field_m.field_o[param1.field_p]) {
                param1.field_v = ni.a(param1.field_I, param1.field_v.l(), param1.field_v.i(), param1.field_v.h());
                if (-1 >= (param1.field_x.field_r[param1.field_y] ^ -1)) {
                  param2 = param1.field_m / var4;
                  if (param0 < -71) {
                    param1.field_v.a(param2);
                    return;
                  } else {
                    field_t = null;
                    param1.field_v.a(param2);
                    return;
                  }
                } else {
                  param1.field_v.e(-1);
                  param2 = param1.field_m / var4;
                  if (param0 < -71) {
                    param1.field_v.a(param2);
                    return;
                  } else {
                    field_t = null;
                    param1.field_v.a(param2);
                    return;
                  }
                }
              } else {
                L0: {
                  param1.field_v = ni.a(param1.field_I, param1.field_v.l(), 0, param1.field_v.h());
                  stackOut_16_0 = ((hg) this).field_m;
                  stackOut_16_1 = (lp) param1;
                  stackOut_16_2 = 4917;
                  stackIn_18_0 = stackOut_16_0;
                  stackIn_18_1 = stackOut_16_1;
                  stackIn_18_2 = stackOut_16_2;
                  stackIn_17_0 = stackOut_16_0;
                  stackIn_17_1 = stackOut_16_1;
                  stackIn_17_2 = stackOut_16_2;
                  if ((param1.field_x.field_r[param1.field_y] ^ -1) <= -1) {
                    stackOut_18_0 = (ug) (Object) stackIn_18_0;
                    stackOut_18_1 = (lp) (Object) stackIn_18_1;
                    stackOut_18_2 = stackIn_18_2;
                    stackOut_18_3 = 0;
                    stackIn_19_0 = stackOut_18_0;
                    stackIn_19_1 = stackOut_18_1;
                    stackIn_19_2 = stackOut_18_2;
                    stackIn_19_3 = stackOut_18_3;
                    break L0;
                  } else {
                    stackOut_17_0 = (ug) (Object) stackIn_17_0;
                    stackOut_17_1 = (lp) (Object) stackIn_17_1;
                    stackOut_17_2 = stackIn_17_2;
                    stackOut_17_3 = 1;
                    stackIn_19_0 = stackOut_17_0;
                    stackIn_19_1 = stackOut_17_1;
                    stackIn_19_2 = stackOut_17_2;
                    stackIn_19_3 = stackOut_17_3;
                    break L0;
                  }
                }
                ((ug) (Object) stackIn_19_0).a(stackIn_19_1, stackIn_19_2, stackIn_19_3 != 0);
                if (-1 >= (param1.field_x.field_r[param1.field_y] ^ -1)) {
                  param2 = param1.field_m / var4;
                  if (param0 < -71) {
                    param1.field_v.a(param2);
                    return;
                  } else {
                    field_t = null;
                    param1.field_v.a(param2);
                    return;
                  }
                } else {
                  param1.field_v.e(-1);
                  param2 = param1.field_m / var4;
                  if (param0 < -71) {
                    param1.field_v.a(param2);
                    return;
                  } else {
                    field_t = null;
                    param1.field_v.a(param2);
                    return;
                  }
                }
              }
            } else {
              if (param0 < -71) {
                param1.field_v.a(param2);
                return;
              } else {
                field_t = null;
                param1.field_v.a(param2);
                return;
              }
            }
          } else {
            if (param0 < -71) {
              param1.field_v.a(param2);
              return;
            } else {
              field_t = null;
              param1.field_v.a(param2);
              return;
            }
          }
        } else {
          if (param0 < -71) {
            param1.field_v.a(param2);
            return;
          } else {
            field_t = null;
            param1.field_v.a(param2);
            return;
          }
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
                if ((var3.field_H ^ -1) <= (var2 ^ -1)) {
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
        if (param0 != 26609) {
            field_s = -67L;
            field_r = null;
            field_p = null;
            field_n = null;
            field_t = null;
            return;
        }
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
        int var4 = 0;
        int var5 = 0;
        lp var6 = null;
        int var7 = 0;
        var7 = DungeonAssault.field_K;
        ((hg) this).field_o.b(param0, param1, param2);
        var6 = (lp) (Object) ((hg) this).field_q.e(-24172);
        L0: while (true) {
          if (var6 != null) {
            if (((hg) this).field_m.a(var6, -16257)) {
              var6 = (lp) (Object) ((hg) this).field_q.a(4);
              continue L0;
            } else {
              var5 = param2;
              var4 = param1;
              L1: while (true) {
                if (var5 <= var6.field_H) {
                  this.a(var6, param0, var4 - -var5, var4, var5, true);
                  var6.field_H = var6.field_H - var5;
                  var6 = (lp) (Object) ((hg) this).field_q.a(4);
                  continue L0;
                } else {
                  this.a(var6, param0, var5 + var4, var4, var6.field_H, true);
                  var5 = var5 - var6.field_H;
                  var4 = var4 + var6.field_H;
                  if (((hg) this).field_m.a(118, var4, var5, var6, param0)) {
                    var6 = (lp) (Object) ((hg) this).field_q.a(4);
                    continue L0;
                  } else {
                    continue L1;
                  }
                }
              }
            }
          } else {
            return;
          }
        }
    }

    hg(ug param0) {
        ((hg) this).field_q = new md();
        ((hg) this).field_o = new mb();
        ((hg) this).field_m = param0;
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_n = new md();
        field_p = "Skeleton Sentinels";
    }
}
