/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class kh {
    char[][] field_c;
    byte field_e;
    static mk field_a;
    byte field_f;
    static int field_d;
    static int field_g;
    static int field_b;

    final static Object a(boolean param0, byte[] param1, int param2) {
        qe var3 = null;
        RuntimeException var3_ref = null;
        qe stackIn_6_0 = null;
        byte[] stackIn_9_0 = null;
        byte[] stackIn_11_0 = null;
        RuntimeException stackIn_13_0 = null;
        StringBuilder stackIn_13_1 = null;
        RuntimeException stackIn_14_0 = null;
        StringBuilder stackIn_14_1 = null;
        RuntimeException stackIn_15_0 = null;
        StringBuilder stackIn_15_1 = null;
        String stackIn_15_2 = null;
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        qe stackOut_5_0 = null;
        byte[] stackOut_10_0 = null;
        byte[] stackOut_8_0 = null;
        RuntimeException stackOut_12_0 = null;
        StringBuilder stackOut_12_1 = null;
        RuntimeException stackOut_14_0 = null;
        StringBuilder stackOut_14_1 = null;
        String stackOut_14_2 = null;
        RuntimeException stackOut_13_0 = null;
        StringBuilder stackOut_13_1 = null;
        String stackOut_13_2 = null;
        try {
          L0: {
            if (param1 != null) {
              if ((param1.length ^ -1) < param2) {
                var3 = new qe();
                ((hd) ((Object) var3)).a(param2 + 13, param1);
                stackOut_5_0 = (qe) (var3);
                stackIn_6_0 = stackOut_5_0;
                decompiledRegionSelector0 = 0;
                break L0;
              } else {
                if (!param0) {
                  stackOut_10_0 = (byte[]) (param1);
                  stackIn_11_0 = stackOut_10_0;
                  decompiledRegionSelector0 = 2;
                  break L0;
                } else {
                  stackOut_8_0 = rl.a(1, param1);
                  stackIn_9_0 = stackOut_8_0;
                  decompiledRegionSelector0 = 1;
                  break L0;
                }
              }
            } else {
              return null;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L1: {
            var3_ref = decompiledCaughtException;
            stackOut_12_0 = (RuntimeException) (var3_ref);
            stackOut_12_1 = new StringBuilder().append("kh.A(").append(param0).append(',');
            stackIn_14_0 = stackOut_12_0;
            stackIn_14_1 = stackOut_12_1;
            stackIn_13_0 = stackOut_12_0;
            stackIn_13_1 = stackOut_12_1;
            if (param1 == null) {
              stackOut_14_0 = (RuntimeException) ((Object) stackIn_14_0);
              stackOut_14_1 = (StringBuilder) ((Object) stackIn_14_1);
              stackOut_14_2 = "null";
              stackIn_15_0 = stackOut_14_0;
              stackIn_15_1 = stackOut_14_1;
              stackIn_15_2 = stackOut_14_2;
              break L1;
            } else {
              stackOut_13_0 = (RuntimeException) ((Object) stackIn_13_0);
              stackOut_13_1 = (StringBuilder) ((Object) stackIn_13_1);
              stackOut_13_2 = "{...}";
              stackIn_15_0 = stackOut_13_0;
              stackIn_15_1 = stackOut_13_1;
              stackIn_15_2 = stackOut_13_2;
              break L1;
            }
          }
          throw pf.a((Throwable) ((Object) stackIn_15_0), stackIn_15_2 + ',' + param2 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return stackIn_6_0;
        } else {
          if (decompiledRegionSelector0 == 1) {
            return stackIn_9_0;
          } else {
            return stackIn_11_0;
          }
        }
    }

    public static void a(byte param0) {
        if (param0 > -34) {
            return;
        }
        field_a = null;
    }

    kh(byte[] param0) {
        int var2_int = 0;
        RuntimeException var2 = null;
        int var3 = 0;
        int var4 = 0;
        int var5 = 0;
        RuntimeException stackIn_13_0 = null;
        StringBuilder stackIn_13_1 = null;
        RuntimeException stackIn_14_0 = null;
        StringBuilder stackIn_14_1 = null;
        RuntimeException stackIn_15_0 = null;
        StringBuilder stackIn_15_1 = null;
        String stackIn_15_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException stackOut_12_0 = null;
        StringBuilder stackOut_12_1 = null;
        RuntimeException stackOut_14_0 = null;
        StringBuilder stackOut_14_1 = null;
        String stackOut_14_2 = null;
        RuntimeException stackOut_13_0 = null;
        StringBuilder stackOut_13_1 = null;
        String stackOut_13_2 = null;
        var5 = fleas.field_A ? 1 : 0;
        try {
          L0: {
            var2_int = 3;
            this.field_f = param0[1];
            this.field_e = param0[2];
            this.field_c = new char[40][21];
            var3 = 0;
            L1: while (true) {
              if (-41 >= (var3 ^ -1)) {
                break L0;
              } else {
                if (var5 == 0) {
                  var4 = 0;
                  L2: while (true) {
                    L3: {
                      if ((var4 ^ -1) <= -22) {
                        var3++;
                        break L3;
                      } else {
                        this.field_c[var3][var4] = (char)param0[var2_int];
                        var2_int++;
                        var4++;
                        if (var5 != 0) {
                          break L3;
                        } else {
                          continue L2;
                        }
                      }
                    }
                    continue L1;
                  }
                } else {
                  return;
                }
              }
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L4: {
            var2 = decompiledCaughtException;
            stackOut_12_0 = (RuntimeException) (var2);
            stackOut_12_1 = new StringBuilder().append("kh.<init>(");
            stackIn_14_0 = stackOut_12_0;
            stackIn_14_1 = stackOut_12_1;
            stackIn_13_0 = stackOut_12_0;
            stackIn_13_1 = stackOut_12_1;
            if (param0 == null) {
              stackOut_14_0 = (RuntimeException) ((Object) stackIn_14_0);
              stackOut_14_1 = (StringBuilder) ((Object) stackIn_14_1);
              stackOut_14_2 = "null";
              stackIn_15_0 = stackOut_14_0;
              stackIn_15_1 = stackOut_14_1;
              stackIn_15_2 = stackOut_14_2;
              break L4;
            } else {
              stackOut_13_0 = (RuntimeException) ((Object) stackIn_13_0);
              stackOut_13_1 = (StringBuilder) ((Object) stackIn_13_1);
              stackOut_13_2 = "{...}";
              stackIn_15_0 = stackOut_13_0;
              stackIn_15_1 = stackOut_13_1;
              stackIn_15_2 = stackOut_13_2;
              break L4;
            }
          }
          throw pf.a((Throwable) ((Object) stackIn_15_0), stackIn_15_2 + ')');
        }
    }

    final static void a(int param0, int param1, int param2) {
        L0: {
          L1: {
            if (rl.field_e == null) {
              break L1;
            } else {
              if (rl.field_e.length < param1) {
                break L1;
              } else {
                break L0;
              }
            }
          }
          rl.field_e = new int[param1 * 2];
          break L0;
        }
        L2: {
          L3: {
            if (null == jl.field_b) {
              break L3;
            } else {
              if (param1 > jl.field_b.length) {
                break L3;
              } else {
                break L2;
              }
            }
          }
          jl.field_b = new int[param1 * 2];
          break L2;
        }
        L4: {
          L5: {
            if (null == kk.field_b) {
              break L5;
            } else {
              if (param1 <= kk.field_b.length) {
                break L4;
              } else {
                break L5;
              }
            }
          }
          kk.field_b = new int[param1 * 2];
          break L4;
        }
        if (hg.field_q == null) {
          L6: {
            L7: {
              hg.field_q = new int[param1 * 2];
              if (vh.field_i == null) {
                break L7;
              } else {
                if (vh.field_i.length >= param1) {
                  break L6;
                } else {
                  break L7;
                }
              }
            }
            vh.field_i = new int[2 * param1];
            break L6;
          }
          L8: {
            L9: {
              if (null == uj.field_a) {
                break L9;
              } else {
                if (uj.field_a.length < param1) {
                  break L9;
                } else {
                  break L8;
                }
              }
            }
            uj.field_a = new int[2 * param1];
            break L8;
          }
          L10: {
            if (param2 == 26721) {
              break L10;
            } else {
              kh.a(-42, -43, 83);
              break L10;
            }
          }
          L11: {
            L12: {
              if (mh.field_y == null) {
                break L12;
              } else {
                if (param0 + param1 > mh.field_y.length) {
                  break L12;
                } else {
                  break L11;
                }
              }
            }
            mh.field_y = new int[(param1 + param0) * 2];
            break L11;
          }
          if (null == se.field_d) {
            se.field_d = new boolean[param1 * 2];
            lc.field_u = -2147483648;
            ok.field_L = -2147483648;
            ak.field_f = 2147483647;
            ea.field_a = 2147483647;
            qh.field_D = 0;
            return;
          } else {
            if (se.field_d.length < param1) {
              se.field_d = new boolean[param1 * 2];
              lc.field_u = -2147483648;
              ok.field_L = -2147483648;
              ak.field_f = 2147483647;
              ea.field_a = 2147483647;
              qh.field_D = 0;
              return;
            } else {
              lc.field_u = -2147483648;
              ok.field_L = -2147483648;
              ak.field_f = 2147483647;
              ea.field_a = 2147483647;
              qh.field_D = 0;
              return;
            }
          }
        } else {
          if (param1 <= hg.field_q.length) {
            if (vh.field_i == null) {
              L13: {
                L14: {
                  vh.field_i = new int[2 * param1];
                  if (null == uj.field_a) {
                    break L14;
                  } else {
                    if (uj.field_a.length < param1) {
                      break L14;
                    } else {
                      break L13;
                    }
                  }
                }
                uj.field_a = new int[2 * param1];
                break L13;
              }
              if (param2 == 26721) {
                L15: {
                  L16: {
                    if (mh.field_y == null) {
                      break L16;
                    } else {
                      if (param0 + param1 > mh.field_y.length) {
                        break L16;
                      } else {
                        break L15;
                      }
                    }
                  }
                  mh.field_y = new int[(param1 + param0) * 2];
                  break L15;
                }
                if (null == se.field_d) {
                  se.field_d = new boolean[param1 * 2];
                  lc.field_u = -2147483648;
                  ok.field_L = -2147483648;
                  ak.field_f = 2147483647;
                  ea.field_a = 2147483647;
                  qh.field_D = 0;
                  return;
                } else {
                  if (se.field_d.length < param1) {
                    se.field_d = new boolean[param1 * 2];
                    lc.field_u = -2147483648;
                    ok.field_L = -2147483648;
                    ak.field_f = 2147483647;
                    ea.field_a = 2147483647;
                    qh.field_D = 0;
                    return;
                  } else {
                    lc.field_u = -2147483648;
                    ok.field_L = -2147483648;
                    ak.field_f = 2147483647;
                    ea.field_a = 2147483647;
                    qh.field_D = 0;
                    return;
                  }
                }
              } else {
                L17: {
                  L18: {
                    kh.a(-42, -43, 83);
                    if (mh.field_y == null) {
                      break L18;
                    } else {
                      if (param0 + param1 > mh.field_y.length) {
                        break L18;
                      } else {
                        break L17;
                      }
                    }
                  }
                  mh.field_y = new int[(param1 + param0) * 2];
                  break L17;
                }
                L19: {
                  if (null == se.field_d) {
                    break L19;
                  } else {
                    if (se.field_d.length >= param1) {
                      lc.field_u = -2147483648;
                      ok.field_L = -2147483648;
                      ak.field_f = 2147483647;
                      ea.field_a = 2147483647;
                      qh.field_D = 0;
                      return;
                    } else {
                      break L19;
                    }
                  }
                }
                se.field_d = new boolean[param1 * 2];
                lc.field_u = -2147483648;
                ok.field_L = -2147483648;
                ak.field_f = 2147483647;
                ea.field_a = 2147483647;
                qh.field_D = 0;
                return;
              }
            } else {
              if (vh.field_i.length >= param1) {
                L20: {
                  L21: {
                    if (null == uj.field_a) {
                      break L21;
                    } else {
                      if (uj.field_a.length < param1) {
                        break L21;
                      } else {
                        break L20;
                      }
                    }
                  }
                  uj.field_a = new int[2 * param1];
                  break L20;
                }
                L22: {
                  if (param2 == 26721) {
                    break L22;
                  } else {
                    kh.a(-42, -43, 83);
                    break L22;
                  }
                }
                L23: {
                  L24: {
                    if (mh.field_y == null) {
                      break L24;
                    } else {
                      if (param0 + param1 > mh.field_y.length) {
                        break L24;
                      } else {
                        break L23;
                      }
                    }
                  }
                  mh.field_y = new int[(param1 + param0) * 2];
                  break L23;
                }
                if (null == se.field_d) {
                  se.field_d = new boolean[param1 * 2];
                  lc.field_u = -2147483648;
                  ok.field_L = -2147483648;
                  ak.field_f = 2147483647;
                  ea.field_a = 2147483647;
                  qh.field_D = 0;
                  return;
                } else {
                  if (se.field_d.length < param1) {
                    se.field_d = new boolean[param1 * 2];
                    lc.field_u = -2147483648;
                    ok.field_L = -2147483648;
                    ak.field_f = 2147483647;
                    ea.field_a = 2147483647;
                    qh.field_D = 0;
                    return;
                  } else {
                    lc.field_u = -2147483648;
                    ok.field_L = -2147483648;
                    ak.field_f = 2147483647;
                    ea.field_a = 2147483647;
                    qh.field_D = 0;
                    return;
                  }
                }
              } else {
                L25: {
                  L26: {
                    vh.field_i = new int[2 * param1];
                    if (null == uj.field_a) {
                      break L26;
                    } else {
                      if (uj.field_a.length < param1) {
                        break L26;
                      } else {
                        break L25;
                      }
                    }
                  }
                  uj.field_a = new int[2 * param1];
                  break L25;
                }
                if (param2 == 26721) {
                  L27: {
                    L28: {
                      if (mh.field_y == null) {
                        break L28;
                      } else {
                        if (param0 + param1 > mh.field_y.length) {
                          break L28;
                        } else {
                          break L27;
                        }
                      }
                    }
                    mh.field_y = new int[(param1 + param0) * 2];
                    break L27;
                  }
                  if (null == se.field_d) {
                    se.field_d = new boolean[param1 * 2];
                    lc.field_u = -2147483648;
                    ok.field_L = -2147483648;
                    ak.field_f = 2147483647;
                    ea.field_a = 2147483647;
                    qh.field_D = 0;
                    return;
                  } else {
                    if (se.field_d.length < param1) {
                      se.field_d = new boolean[param1 * 2];
                      lc.field_u = -2147483648;
                      ok.field_L = -2147483648;
                      ak.field_f = 2147483647;
                      ea.field_a = 2147483647;
                      qh.field_D = 0;
                      return;
                    } else {
                      lc.field_u = -2147483648;
                      ok.field_L = -2147483648;
                      ak.field_f = 2147483647;
                      ea.field_a = 2147483647;
                      qh.field_D = 0;
                      return;
                    }
                  }
                } else {
                  L29: {
                    L30: {
                      kh.a(-42, -43, 83);
                      if (mh.field_y == null) {
                        break L30;
                      } else {
                        if (param0 + param1 > mh.field_y.length) {
                          break L30;
                        } else {
                          break L29;
                        }
                      }
                    }
                    mh.field_y = new int[(param1 + param0) * 2];
                    break L29;
                  }
                  L31: {
                    if (null == se.field_d) {
                      break L31;
                    } else {
                      if (se.field_d.length >= param1) {
                        lc.field_u = -2147483648;
                        ok.field_L = -2147483648;
                        ak.field_f = 2147483647;
                        ea.field_a = 2147483647;
                        qh.field_D = 0;
                        return;
                      } else {
                        break L31;
                      }
                    }
                  }
                  se.field_d = new boolean[param1 * 2];
                  lc.field_u = -2147483648;
                  ok.field_L = -2147483648;
                  ak.field_f = 2147483647;
                  ea.field_a = 2147483647;
                  qh.field_D = 0;
                  return;
                }
              }
            }
          } else {
            hg.field_q = new int[param1 * 2];
            if (vh.field_i != null) {
              if (vh.field_i.length < param1) {
                L32: {
                  L33: {
                    vh.field_i = new int[2 * param1];
                    if (null == uj.field_a) {
                      break L33;
                    } else {
                      if (uj.field_a.length < param1) {
                        break L33;
                      } else {
                        break L32;
                      }
                    }
                  }
                  uj.field_a = new int[2 * param1];
                  break L32;
                }
                L34: {
                  if (param2 == 26721) {
                    break L34;
                  } else {
                    kh.a(-42, -43, 83);
                    break L34;
                  }
                }
                L35: {
                  L36: {
                    if (mh.field_y == null) {
                      break L36;
                    } else {
                      if (param0 + param1 > mh.field_y.length) {
                        break L36;
                      } else {
                        break L35;
                      }
                    }
                  }
                  mh.field_y = new int[(param1 + param0) * 2];
                  break L35;
                }
                L37: {
                  if (null == se.field_d) {
                    break L37;
                  } else {
                    if (se.field_d.length >= param1) {
                      lc.field_u = -2147483648;
                      ok.field_L = -2147483648;
                      ak.field_f = 2147483647;
                      ea.field_a = 2147483647;
                      qh.field_D = 0;
                      return;
                    } else {
                      break L37;
                    }
                  }
                }
                se.field_d = new boolean[param1 * 2];
                lc.field_u = -2147483648;
                ok.field_L = -2147483648;
                ak.field_f = 2147483647;
                ea.field_a = 2147483647;
                qh.field_D = 0;
                return;
              } else {
                L38: {
                  L39: {
                    if (null == uj.field_a) {
                      break L39;
                    } else {
                      if (uj.field_a.length < param1) {
                        break L39;
                      } else {
                        break L38;
                      }
                    }
                  }
                  uj.field_a = new int[2 * param1];
                  break L38;
                }
                L40: {
                  if (param2 == 26721) {
                    break L40;
                  } else {
                    kh.a(-42, -43, 83);
                    break L40;
                  }
                }
                L41: {
                  L42: {
                    if (mh.field_y == null) {
                      break L42;
                    } else {
                      if (param0 + param1 > mh.field_y.length) {
                        break L42;
                      } else {
                        break L41;
                      }
                    }
                  }
                  mh.field_y = new int[(param1 + param0) * 2];
                  break L41;
                }
                L43: {
                  if (null == se.field_d) {
                    break L43;
                  } else {
                    if (se.field_d.length >= param1) {
                      lc.field_u = -2147483648;
                      ok.field_L = -2147483648;
                      ak.field_f = 2147483647;
                      ea.field_a = 2147483647;
                      qh.field_D = 0;
                      return;
                    } else {
                      break L43;
                    }
                  }
                }
                se.field_d = new boolean[param1 * 2];
                lc.field_u = -2147483648;
                ok.field_L = -2147483648;
                ak.field_f = 2147483647;
                ea.field_a = 2147483647;
                qh.field_D = 0;
                return;
              }
            } else {
              L44: {
                L45: {
                  vh.field_i = new int[2 * param1];
                  if (null == uj.field_a) {
                    break L45;
                  } else {
                    if (uj.field_a.length < param1) {
                      break L45;
                    } else {
                      break L44;
                    }
                  }
                }
                uj.field_a = new int[2 * param1];
                break L44;
              }
              L46: {
                if (param2 == 26721) {
                  break L46;
                } else {
                  kh.a(-42, -43, 83);
                  break L46;
                }
              }
              L47: {
                L48: {
                  if (mh.field_y == null) {
                    break L48;
                  } else {
                    if (param0 + param1 > mh.field_y.length) {
                      break L48;
                    } else {
                      break L47;
                    }
                  }
                }
                mh.field_y = new int[(param1 + param0) * 2];
                break L47;
              }
              L49: {
                if (null == se.field_d) {
                  break L49;
                } else {
                  if (se.field_d.length >= param1) {
                    lc.field_u = -2147483648;
                    ok.field_L = -2147483648;
                    ak.field_f = 2147483647;
                    ea.field_a = 2147483647;
                    qh.field_D = 0;
                    return;
                  } else {
                    break L49;
                  }
                }
              }
              se.field_d = new boolean[param1 * 2];
              lc.field_u = -2147483648;
              ok.field_L = -2147483648;
              ak.field_f = 2147483647;
              ea.field_a = 2147483647;
              qh.field_D = 0;
              return;
            }
          }
        }
    }

    static {
    }
}
