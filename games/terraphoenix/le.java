/*
 * Decompiled by CFR-JS 0.4.0.
 */
import java.io.*;
import java.lang.String;

final class le extends di {
    static ad field_q;
    static rh field_n;
    static String field_m;
    static java.applet.Applet field_r;
    static String[] field_o;
    static int[] field_s;
    static bg field_p;

    final static String a() {
        if (qe.field_f == ua.field_d) {
            return cg.field_H;
        }
        field_m = null;
        return nh.field_D;
    }

    final im b(String param0, int param1) {
        int var3_int = 0;
        RuntimeException var3 = null;
        CharSequence var4 = null;
        CharSequence var5 = null;
        im stackIn_3_0 = null;
        im stackIn_8_0 = null;
        RuntimeException stackIn_10_0 = null;
        StringBuilder stackIn_10_1 = null;
        RuntimeException stackIn_11_0 = null;
        StringBuilder stackIn_11_1 = null;
        RuntimeException stackIn_12_0 = null;
        StringBuilder stackIn_12_1 = null;
        String stackIn_12_2 = null;
        RuntimeException decompiledCaughtException = null;
        im stackOut_2_0 = null;
        im stackOut_7_0 = null;
        RuntimeException stackOut_9_0 = null;
        StringBuilder stackOut_9_1 = null;
        RuntimeException stackOut_11_0 = null;
        StringBuilder stackOut_11_1 = null;
        String stackOut_11_2 = null;
        RuntimeException stackOut_10_0 = null;
        StringBuilder stackOut_10_1 = null;
        String stackOut_10_2 = null;
        try {
          L0: {
            var4 = (CharSequence) (Object) param0;
            int discarded$9 = 1;
            if (!te.a(var4)) {
              stackOut_2_0 = qf.field_d;
              stackIn_3_0 = stackOut_2_0;
              return stackIn_3_0;
            } else {
              L1: {
                var5 = (CharSequence) (Object) param0;
                var3_int = ta.a(var5, 121);
                if (var3_int <= param1) {
                  break L1;
                } else {
                  if (var3_int > 130) {
                    break L1;
                  } else {
                    return dg.field_c;
                  }
                }
              }
              stackOut_7_0 = qf.field_d;
              stackIn_8_0 = stackOut_7_0;
              break L0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L2: {
            var3 = decompiledCaughtException;
            stackOut_9_0 = (RuntimeException) var3;
            stackOut_9_1 = new StringBuilder().append("le.C(");
            stackIn_11_0 = stackOut_9_0;
            stackIn_11_1 = stackOut_9_1;
            stackIn_10_0 = stackOut_9_0;
            stackIn_10_1 = stackOut_9_1;
            if (param0 == null) {
              stackOut_11_0 = (RuntimeException) (Object) stackIn_11_0;
              stackOut_11_1 = (StringBuilder) (Object) stackIn_11_1;
              stackOut_11_2 = "null";
              stackIn_12_0 = stackOut_11_0;
              stackIn_12_1 = stackOut_11_1;
              stackIn_12_2 = stackOut_11_2;
              break L2;
            } else {
              stackOut_10_0 = (RuntimeException) (Object) stackIn_10_0;
              stackOut_10_1 = (StringBuilder) (Object) stackIn_10_1;
              stackOut_10_2 = "{...}";
              stackIn_12_0 = stackOut_10_0;
              stackIn_12_1 = stackOut_10_1;
              stackIn_12_2 = stackOut_10_2;
              break L2;
            }
          }
          throw qk.a((Throwable) (Object) stackIn_12_0, stackIn_12_2 + 44 + param1 + 41);
        }
        return stackIn_8_0;
    }

    final static void a(int param0, int param1) {
        L0: {
          L1: {
            if (lk.field_a == null) {
              break L1;
            } else {
              if (param0 > lk.field_a.length) {
                break L1;
              } else {
                break L0;
              }
            }
          }
          lk.field_a = new int[2 * param0];
          break L0;
        }
        L2: {
          if (null == a.field_c) {
            break L2;
          } else {
            if (param0 <= a.field_c.length) {
              L3: {
                L4: {
                  if (null == oa.field_a) {
                    break L4;
                  } else {
                    if (oa.field_a.length < param0) {
                      break L4;
                    } else {
                      break L3;
                    }
                  }
                }
                oa.field_a = new int[2 * param0];
                break L3;
              }
              if (null == oa.field_c) {
                L5: {
                  L6: {
                    oa.field_c = new int[2 * param0];
                    if (null == dd.field_L) {
                      break L6;
                    } else {
                      if (param0 > dd.field_L.length) {
                        break L6;
                      } else {
                        break L5;
                      }
                    }
                  }
                  dd.field_L = new int[2 * param0];
                  break L5;
                }
                if (al.field_bb == null) {
                  L7: {
                    L8: {
                      al.field_bb = new int[param0 * 2];
                      if (null == pf.field_b) {
                        break L8;
                      } else {
                        if (param1 + param0 > pf.field_b.length) {
                          break L8;
                        } else {
                          break L7;
                        }
                      }
                    }
                    pf.field_b = new int[2 * (param1 + param0)];
                    break L7;
                  }
                  L9: {
                    if (dl.field_y == null) {
                      break L9;
                    } else {
                      if (dl.field_y.length >= param0) {
                        bd.field_a = 2147483647;
                        hm.field_L = 2147483647;
                        el.field_d = -2147483648;
                        pb.field_b = 0;
                        ok.field_j = -2147483648;
                        return;
                      } else {
                        break L9;
                      }
                    }
                  }
                  dl.field_y = new boolean[param0 * 2];
                  bd.field_a = 2147483647;
                  hm.field_L = 2147483647;
                  el.field_d = -2147483648;
                  pb.field_b = 0;
                  ok.field_j = -2147483648;
                  return;
                } else {
                  if (al.field_bb.length >= param0) {
                    L10: {
                      L11: {
                        if (null == pf.field_b) {
                          break L11;
                        } else {
                          if (param1 + param0 > pf.field_b.length) {
                            break L11;
                          } else {
                            break L10;
                          }
                        }
                      }
                      pf.field_b = new int[2 * (param1 + param0)];
                      break L10;
                    }
                    if (dl.field_y == null) {
                      dl.field_y = new boolean[param0 * 2];
                      bd.field_a = 2147483647;
                      hm.field_L = 2147483647;
                      el.field_d = -2147483648;
                      pb.field_b = 0;
                      ok.field_j = -2147483648;
                      return;
                    } else {
                      if (dl.field_y.length < param0) {
                        dl.field_y = new boolean[param0 * 2];
                        bd.field_a = 2147483647;
                        hm.field_L = 2147483647;
                        el.field_d = -2147483648;
                        pb.field_b = 0;
                        ok.field_j = -2147483648;
                        return;
                      } else {
                        bd.field_a = 2147483647;
                        hm.field_L = 2147483647;
                        el.field_d = -2147483648;
                        pb.field_b = 0;
                        ok.field_j = -2147483648;
                        return;
                      }
                    }
                  } else {
                    L12: {
                      L13: {
                        al.field_bb = new int[param0 * 2];
                        if (null == pf.field_b) {
                          break L13;
                        } else {
                          if (param1 + param0 > pf.field_b.length) {
                            break L13;
                          } else {
                            break L12;
                          }
                        }
                      }
                      pf.field_b = new int[2 * (param1 + param0)];
                      break L12;
                    }
                    L14: {
                      if (dl.field_y == null) {
                        break L14;
                      } else {
                        if (dl.field_y.length >= param0) {
                          bd.field_a = 2147483647;
                          hm.field_L = 2147483647;
                          el.field_d = -2147483648;
                          pb.field_b = 0;
                          ok.field_j = -2147483648;
                          return;
                        } else {
                          break L14;
                        }
                      }
                    }
                    dl.field_y = new boolean[param0 * 2];
                    bd.field_a = 2147483647;
                    hm.field_L = 2147483647;
                    el.field_d = -2147483648;
                    pb.field_b = 0;
                    ok.field_j = -2147483648;
                    return;
                  }
                }
              } else {
                if (oa.field_c.length >= param0) {
                  L15: {
                    L16: {
                      if (null == dd.field_L) {
                        break L16;
                      } else {
                        if (param0 > dd.field_L.length) {
                          break L16;
                        } else {
                          break L15;
                        }
                      }
                    }
                    dd.field_L = new int[2 * param0];
                    break L15;
                  }
                  if (al.field_bb == null) {
                    L17: {
                      L18: {
                        al.field_bb = new int[param0 * 2];
                        if (null == pf.field_b) {
                          break L18;
                        } else {
                          if (param1 + param0 > pf.field_b.length) {
                            break L18;
                          } else {
                            break L17;
                          }
                        }
                      }
                      pf.field_b = new int[2 * (param1 + param0)];
                      break L17;
                    }
                    if (dl.field_y == null) {
                      dl.field_y = new boolean[param0 * 2];
                      bd.field_a = 2147483647;
                      hm.field_L = 2147483647;
                      el.field_d = -2147483648;
                      pb.field_b = 0;
                      ok.field_j = -2147483648;
                      return;
                    } else {
                      if (dl.field_y.length < param0) {
                        dl.field_y = new boolean[param0 * 2];
                        bd.field_a = 2147483647;
                        hm.field_L = 2147483647;
                        el.field_d = -2147483648;
                        pb.field_b = 0;
                        ok.field_j = -2147483648;
                        return;
                      } else {
                        bd.field_a = 2147483647;
                        hm.field_L = 2147483647;
                        el.field_d = -2147483648;
                        pb.field_b = 0;
                        ok.field_j = -2147483648;
                        return;
                      }
                    }
                  } else {
                    if (al.field_bb.length >= param0) {
                      L19: {
                        L20: {
                          if (null == pf.field_b) {
                            break L20;
                          } else {
                            if (param1 + param0 > pf.field_b.length) {
                              break L20;
                            } else {
                              break L19;
                            }
                          }
                        }
                        pf.field_b = new int[2 * (param1 + param0)];
                        break L19;
                      }
                      if (dl.field_y == null) {
                        dl.field_y = new boolean[param0 * 2];
                        bd.field_a = 2147483647;
                        hm.field_L = 2147483647;
                        el.field_d = -2147483648;
                        pb.field_b = 0;
                        ok.field_j = -2147483648;
                        return;
                      } else {
                        if (dl.field_y.length < param0) {
                          dl.field_y = new boolean[param0 * 2];
                          bd.field_a = 2147483647;
                          hm.field_L = 2147483647;
                          el.field_d = -2147483648;
                          pb.field_b = 0;
                          ok.field_j = -2147483648;
                          return;
                        } else {
                          bd.field_a = 2147483647;
                          hm.field_L = 2147483647;
                          el.field_d = -2147483648;
                          pb.field_b = 0;
                          ok.field_j = -2147483648;
                          return;
                        }
                      }
                    } else {
                      L21: {
                        L22: {
                          al.field_bb = new int[param0 * 2];
                          if (null == pf.field_b) {
                            break L22;
                          } else {
                            if (param1 + param0 > pf.field_b.length) {
                              break L22;
                            } else {
                              break L21;
                            }
                          }
                        }
                        pf.field_b = new int[2 * (param1 + param0)];
                        break L21;
                      }
                      if (dl.field_y == null) {
                        dl.field_y = new boolean[param0 * 2];
                        bd.field_a = 2147483647;
                        hm.field_L = 2147483647;
                        el.field_d = -2147483648;
                        pb.field_b = 0;
                        ok.field_j = -2147483648;
                        return;
                      } else {
                        if (dl.field_y.length < param0) {
                          dl.field_y = new boolean[param0 * 2];
                          bd.field_a = 2147483647;
                          hm.field_L = 2147483647;
                          el.field_d = -2147483648;
                          pb.field_b = 0;
                          ok.field_j = -2147483648;
                          return;
                        } else {
                          bd.field_a = 2147483647;
                          hm.field_L = 2147483647;
                          el.field_d = -2147483648;
                          pb.field_b = 0;
                          ok.field_j = -2147483648;
                          return;
                        }
                      }
                    }
                  }
                } else {
                  L23: {
                    L24: {
                      oa.field_c = new int[2 * param0];
                      if (null == dd.field_L) {
                        break L24;
                      } else {
                        if (param0 > dd.field_L.length) {
                          break L24;
                        } else {
                          break L23;
                        }
                      }
                    }
                    dd.field_L = new int[2 * param0];
                    break L23;
                  }
                  L25: {
                    L26: {
                      if (al.field_bb == null) {
                        break L26;
                      } else {
                        if (al.field_bb.length >= param0) {
                          break L25;
                        } else {
                          break L26;
                        }
                      }
                    }
                    al.field_bb = new int[param0 * 2];
                    break L25;
                  }
                  L27: {
                    L28: {
                      if (null == pf.field_b) {
                        break L28;
                      } else {
                        if (param1 + param0 > pf.field_b.length) {
                          break L28;
                        } else {
                          break L27;
                        }
                      }
                    }
                    pf.field_b = new int[2 * (param1 + param0)];
                    break L27;
                  }
                  if (dl.field_y == null) {
                    dl.field_y = new boolean[param0 * 2];
                    bd.field_a = 2147483647;
                    hm.field_L = 2147483647;
                    el.field_d = -2147483648;
                    pb.field_b = 0;
                    ok.field_j = -2147483648;
                    return;
                  } else {
                    if (dl.field_y.length < param0) {
                      dl.field_y = new boolean[param0 * 2];
                      bd.field_a = 2147483647;
                      hm.field_L = 2147483647;
                      el.field_d = -2147483648;
                      pb.field_b = 0;
                      ok.field_j = -2147483648;
                      return;
                    } else {
                      bd.field_a = 2147483647;
                      hm.field_L = 2147483647;
                      el.field_d = -2147483648;
                      pb.field_b = 0;
                      ok.field_j = -2147483648;
                      return;
                    }
                  }
                }
              }
            } else {
              break L2;
            }
          }
        }
        L29: {
          L30: {
            a.field_c = new int[2 * param0];
            if (null == oa.field_a) {
              break L30;
            } else {
              if (oa.field_a.length < param0) {
                break L30;
              } else {
                break L29;
              }
            }
          }
          oa.field_a = new int[2 * param0];
          break L29;
        }
        L31: {
          if (null == oa.field_c) {
            break L31;
          } else {
            if (oa.field_c.length < param0) {
              break L31;
            } else {
              L32: {
                L33: {
                  if (null == dd.field_L) {
                    break L33;
                  } else {
                    if (param0 > dd.field_L.length) {
                      break L33;
                    } else {
                      break L32;
                    }
                  }
                }
                dd.field_L = new int[2 * param0];
                break L32;
              }
              L34: {
                L35: {
                  if (al.field_bb == null) {
                    break L35;
                  } else {
                    if (al.field_bb.length >= param0) {
                      break L34;
                    } else {
                      break L35;
                    }
                  }
                }
                al.field_bb = new int[param0 * 2];
                break L34;
              }
              L36: {
                L37: {
                  if (null == pf.field_b) {
                    break L37;
                  } else {
                    if (param1 + param0 > pf.field_b.length) {
                      break L37;
                    } else {
                      break L36;
                    }
                  }
                }
                pf.field_b = new int[2 * (param1 + param0)];
                break L36;
              }
              L38: {
                if (dl.field_y == null) {
                  break L38;
                } else {
                  if (dl.field_y.length >= param0) {
                    bd.field_a = 2147483647;
                    hm.field_L = 2147483647;
                    el.field_d = -2147483648;
                    pb.field_b = 0;
                    ok.field_j = -2147483648;
                    return;
                  } else {
                    break L38;
                  }
                }
              }
              dl.field_y = new boolean[param0 * 2];
              bd.field_a = 2147483647;
              hm.field_L = 2147483647;
              el.field_d = -2147483648;
              pb.field_b = 0;
              ok.field_j = -2147483648;
              return;
            }
          }
        }
        oa.field_c = new int[2 * param0];
        if (null != dd.field_L) {
          L39: {
            if (param0 > dd.field_L.length) {
              dd.field_L = new int[2 * param0];
              break L39;
            } else {
              break L39;
            }
          }
          L40: {
            L41: {
              if (al.field_bb == null) {
                break L41;
              } else {
                if (al.field_bb.length >= param0) {
                  break L40;
                } else {
                  break L41;
                }
              }
            }
            al.field_bb = new int[param0 * 2];
            break L40;
          }
          L42: {
            L43: {
              if (null == pf.field_b) {
                break L43;
              } else {
                if (param1 + param0 > pf.field_b.length) {
                  break L43;
                } else {
                  break L42;
                }
              }
            }
            pf.field_b = new int[2 * (param1 + param0)];
            break L42;
          }
          L44: {
            if (dl.field_y == null) {
              break L44;
            } else {
              if (dl.field_y.length >= param0) {
                bd.field_a = 2147483647;
                hm.field_L = 2147483647;
                el.field_d = -2147483648;
                pb.field_b = 0;
                ok.field_j = -2147483648;
                return;
              } else {
                break L44;
              }
            }
          }
          dl.field_y = new boolean[param0 * 2];
          bd.field_a = 2147483647;
          hm.field_L = 2147483647;
          el.field_d = -2147483648;
          pb.field_b = 0;
          ok.field_j = -2147483648;
          return;
        } else {
          L45: {
            L46: {
              dd.field_L = new int[2 * param0];
              if (al.field_bb == null) {
                break L46;
              } else {
                if (al.field_bb.length >= param0) {
                  break L45;
                } else {
                  break L46;
                }
              }
            }
            al.field_bb = new int[param0 * 2];
            break L45;
          }
          L47: {
            L48: {
              if (null == pf.field_b) {
                break L48;
              } else {
                if (param1 + param0 > pf.field_b.length) {
                  break L48;
                } else {
                  break L47;
                }
              }
            }
            pf.field_b = new int[2 * (param1 + param0)];
            break L47;
          }
          L49: {
            if (dl.field_y == null) {
              break L49;
            } else {
              if (dl.field_y.length >= param0) {
                bd.field_a = 2147483647;
                hm.field_L = 2147483647;
                el.field_d = -2147483648;
                pb.field_b = 0;
                ok.field_j = -2147483648;
                return;
              } else {
                break L49;
              }
            }
          }
          dl.field_y = new boolean[param0 * 2];
          bd.field_a = 2147483647;
          hm.field_L = 2147483647;
          el.field_d = -2147483648;
          pb.field_b = 0;
          ok.field_j = -2147483648;
          return;
        }
    }

    public static void e(byte param0) {
        field_m = null;
        field_r = null;
        field_q = null;
        field_n = null;
        field_p = null;
        field_o = null;
        field_s = null;
        if (param0 != -76) {
            le.e((byte) -47);
        }
    }

    le(ej param0) {
        super(param0);
    }

    final String a(String param0, int param1) {
        int var3_int = 0;
        RuntimeException var3 = null;
        String stackIn_2_0 = null;
        Object stackIn_4_0 = null;
        RuntimeException stackIn_6_0 = null;
        StringBuilder stackIn_6_1 = null;
        RuntimeException stackIn_7_0 = null;
        StringBuilder stackIn_7_1 = null;
        RuntimeException stackIn_8_0 = null;
        StringBuilder stackIn_8_1 = null;
        String stackIn_8_2 = null;
        RuntimeException decompiledCaughtException = null;
        Object stackOut_3_0 = null;
        String stackOut_1_0 = null;
        RuntimeException stackOut_5_0 = null;
        StringBuilder stackOut_5_1 = null;
        RuntimeException stackOut_7_0 = null;
        StringBuilder stackOut_7_1 = null;
        String stackOut_7_2 = null;
        RuntimeException stackOut_6_0 = null;
        StringBuilder stackOut_6_1 = null;
        String stackOut_6_2 = null;
        try {
          L0: {
            if (((le) this).b(param0, 0) != qf.field_d) {
              var3_int = -102 % ((26 - param1) / 56);
              stackOut_3_0 = null;
              stackIn_4_0 = stackOut_3_0;
              break L0;
            } else {
              stackOut_1_0 = (String) field_m;
              stackIn_2_0 = stackOut_1_0;
              return stackIn_2_0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L1: {
            var3 = decompiledCaughtException;
            stackOut_5_0 = (RuntimeException) var3;
            stackOut_5_1 = new StringBuilder().append("le.B(");
            stackIn_7_0 = stackOut_5_0;
            stackIn_7_1 = stackOut_5_1;
            stackIn_6_0 = stackOut_5_0;
            stackIn_6_1 = stackOut_5_1;
            if (param0 == null) {
              stackOut_7_0 = (RuntimeException) (Object) stackIn_7_0;
              stackOut_7_1 = (StringBuilder) (Object) stackIn_7_1;
              stackOut_7_2 = "null";
              stackIn_8_0 = stackOut_7_0;
              stackIn_8_1 = stackOut_7_1;
              stackIn_8_2 = stackOut_7_2;
              break L1;
            } else {
              stackOut_6_0 = (RuntimeException) (Object) stackIn_6_0;
              stackOut_6_1 = (StringBuilder) (Object) stackIn_6_1;
              stackOut_6_2 = "{...}";
              stackIn_8_0 = stackOut_6_0;
              stackIn_8_1 = stackOut_6_1;
              stackIn_8_2 = stackOut_6_2;
              break L1;
            }
          }
          throw qk.a((Throwable) (Object) stackIn_8_0, stackIn_8_2 + 44 + param1 + 41);
        }
        return (String) (Object) stackIn_4_0;
    }

    final static void b(boolean param0) {
        L0: {
          ga.b((byte) 111);
          if (null != ae.field_G) {
            hk.a(ae.field_G, (byte) 6);
            break L0;
          } else {
            break L0;
          }
        }
        int discarded$27 = -128;
        ab.a();
        rf.d((byte) 93);
        int discarded$28 = 1;
        lf.a();
        int discarded$29 = 255;
        if (od.b()) {
          di.field_l.k(-17410, 1);
          int discarded$30 = 0;
          bc.a(0);
          gb.g(-17464);
          return;
        } else {
          gb.g(-17464);
          return;
        }
    }

    final static boolean a(boolean param0, byte param1) {
        try {
            IOException var2 = null;
            uc var4 = null;
            uc var5 = null;
            int stackIn_12_0 = 0;
            Throwable decompiledCaughtException = null;
            int stackOut_11_0 = 0;
            int stackOut_10_0 = 0;
            L0: {
              if (null != bd.field_k) {
                break L0;
              } else {
                bd.field_k = da.field_g.a(sb.field_i, wa.field_t, (byte) 60);
                break L0;
              }
            }
            L1: {
              if (param1 > 82) {
                break L1;
              } else {
                int discarded$8 = 0;
                String discarded$9 = le.a();
                break L1;
              }
            }
            if (bd.field_k.field_d == 0) {
              return false;
            } else {
              long dupTemp$10 = ll.a(1000);
              bl.field_h = dupTemp$10;
              dm.field_c = dupTemp$10;
              if (1 == bd.field_k.field_d) {
                try {
                  L2: {
                    L3: {
                      ig.field_e = new tf((java.net.Socket) bd.field_k.field_e, da.field_g);
                      di.field_l.field_k = 0;
                      var4 = mk.field_j;
                      var5 = var4;
                      mh.field_a = va.field_e;
                      if (!param0) {
                        stackOut_11_0 = -1;
                        stackIn_12_0 = stackOut_11_0;
                        break L3;
                      } else {
                        stackOut_10_0 = -2;
                        stackIn_12_0 = stackOut_10_0;
                        break L3;
                      }
                    }
                    wc.field_r = stackIn_12_0;
                    wf.field_n = stackIn_12_0;
                    uc.field_r = stackIn_12_0;
                    var5.field_k = 0;
                    ej.a(gi.field_v, -25563, (dh) (Object) di.field_l, ij.field_d, hb.field_i);
                    int discarded$11 = 0;
                    bc.a(-1);
                    break L2;
                  }
                } catch (java.io.IOException decompiledCaughtParameter0) {
                  decompiledCaughtException = decompiledCaughtParameter0;
                  var2 = (IOException) (Object) decompiledCaughtException;
                  mh.field_a = ba.field_b;
                  bd.field_k = null;
                  return true;
                }
                bd.field_k = null;
                return true;
              } else {
                mh.field_a = ba.field_b;
                bd.field_k = null;
                return true;
              }
            }
        } catch (RuntimeException | Error decompiledUncheckedException) {
            throw decompiledUncheckedException;
        } catch (Throwable decompiledCheckedException) {
            throw new RuntimeException(decompiledCheckedException);
        }
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_m = "Please enter your age in years";
        field_o = new String[]{"Showing by rating", "Showing by win percentage"};
        field_n = new rh(14, 0, 4, 1);
        field_s = new int[]{3, 3, 3, 55, 7, 7, 7, -1, 8, 9, 10, 11, -1, -1, -1, -1, -1, -1, -1, -1, 23, 23, 23, 55, 27, 27, 27, -1, 31, 31, 31, 68, 35, 35, 35, -1, -1, -1, -1, -1, -1, -1, -1, -1, 47, 47, 47, -1, 51, 51, 51, -1, 55, 55, 55, -1, 59, 59, 59, -1, 63, 63, 63, -1, 67, 67, 67, -1, 71, 71, 71, -1, 72, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1};
    }
}
