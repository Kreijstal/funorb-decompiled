/*
 * Decompiled by CFR-JS 0.4.0.
 */
import java.io.*;

final class le extends di {
    static ad field_q;
    static rh field_n;
    static String field_m;
    static java.applet.Applet field_r;
    static String[] field_o;
    static int[] field_s;
    static bg field_p;

    final static String a(boolean param0) {
        if (qe.field_f == ua.field_d) {
            return cg.field_H;
        }
        if (param0) {
            field_m = (String) null;
            return nh.field_D;
        }
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
        int decompiledRegionSelector0 = 0;
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
            var4 = (CharSequence) ((Object) param0);
            if (!te.a(var4, true)) {
              stackOut_2_0 = qf.field_d;
              stackIn_3_0 = stackOut_2_0;
              decompiledRegionSelector0 = 0;
              break L0;
            } else {
              L1: {
                var5 = (CharSequence) ((Object) param0);
                var3_int = ta.a(var5, 121);
                if (var3_int <= param1) {
                  break L1;
                } else {
                  if (-131 > (var3_int ^ -1)) {
                    break L1;
                  } else {
                    return dg.field_c;
                  }
                }
              }
              stackOut_7_0 = qf.field_d;
              stackIn_8_0 = stackOut_7_0;
              decompiledRegionSelector0 = 1;
              break L0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L2: {
            var3 = decompiledCaughtException;
            stackOut_9_0 = (RuntimeException) (var3);
            stackOut_9_1 = new StringBuilder().append("le.C(");
            stackIn_11_0 = stackOut_9_0;
            stackIn_11_1 = stackOut_9_1;
            stackIn_10_0 = stackOut_9_0;
            stackIn_10_1 = stackOut_9_1;
            if (param0 == null) {
              stackOut_11_0 = (RuntimeException) ((Object) stackIn_11_0);
              stackOut_11_1 = (StringBuilder) ((Object) stackIn_11_1);
              stackOut_11_2 = "null";
              stackIn_12_0 = stackOut_11_0;
              stackIn_12_1 = stackOut_11_1;
              stackIn_12_2 = stackOut_11_2;
              break L2;
            } else {
              stackOut_10_0 = (RuntimeException) ((Object) stackIn_10_0);
              stackOut_10_1 = (StringBuilder) ((Object) stackIn_10_1);
              stackOut_10_2 = "{...}";
              stackIn_12_0 = stackOut_10_0;
              stackIn_12_1 = stackOut_10_1;
              stackIn_12_2 = stackOut_10_2;
              break L2;
            }
          }
          throw qk.a((Throwable) ((Object) stackIn_12_0), stackIn_12_2 + ',' + param1 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return stackIn_3_0;
        } else {
          return stackIn_8_0;
        }
    }

    final static void a(int param0, int param1, boolean param2) {
        boolean discarded$1 = false;
        L0: {
          if (!param2) {
            break L0;
          } else {
            discarded$1 = le.a(false, (byte) -3);
            break L0;
          }
        }
        L1: {
          L2: {
            if (lk.field_a == null) {
              break L2;
            } else {
              if (param0 > lk.field_a.length) {
                break L2;
              } else {
                break L1;
              }
            }
          }
          lk.field_a = new int[2 * param0];
          break L1;
        }
        L3: {
          if (null == a.field_c) {
            break L3;
          } else {
            if (param0 <= a.field_c.length) {
              L4: {
                L5: {
                  if (null == oa.field_a) {
                    break L5;
                  } else {
                    if (oa.field_a.length < param0) {
                      break L5;
                    } else {
                      break L4;
                    }
                  }
                }
                oa.field_a = new int[2 * param0];
                break L4;
              }
              if (null == oa.field_c) {
                L6: {
                  L7: {
                    oa.field_c = new int[2 * param0];
                    if (null == dd.field_L) {
                      break L7;
                    } else {
                      if (param0 > dd.field_L.length) {
                        break L7;
                      } else {
                        break L6;
                      }
                    }
                  }
                  dd.field_L = new int[2 * param0];
                  break L6;
                }
                if (al.field_bb == null) {
                  L8: {
                    L9: {
                      al.field_bb = new int[param0 * 2];
                      if (null == pf.field_b) {
                        break L9;
                      } else {
                        if (param1 + param0 > pf.field_b.length) {
                          break L9;
                        } else {
                          break L8;
                        }
                      }
                    }
                    pf.field_b = new int[2 * (param1 + param0)];
                    break L8;
                  }
                  L10: {
                    if (dl.field_y == null) {
                      break L10;
                    } else {
                      if (dl.field_y.length >= param0) {
                        bd.field_a = 2147483647;
                        hm.field_L = 2147483647;
                        el.field_d = -2147483648;
                        pb.field_b = 0;
                        ok.field_j = -2147483648;
                        return;
                      } else {
                        break L10;
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
                    L11: {
                      L12: {
                        if (null == pf.field_b) {
                          break L12;
                        } else {
                          if (param1 + param0 > pf.field_b.length) {
                            break L12;
                          } else {
                            break L11;
                          }
                        }
                      }
                      pf.field_b = new int[2 * (param1 + param0)];
                      break L11;
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
                    L13: {
                      L14: {
                        al.field_bb = new int[param0 * 2];
                        if (null == pf.field_b) {
                          break L14;
                        } else {
                          if (param1 + param0 > pf.field_b.length) {
                            break L14;
                          } else {
                            break L13;
                          }
                        }
                      }
                      pf.field_b = new int[2 * (param1 + param0)];
                      break L13;
                    }
                    L15: {
                      if (dl.field_y == null) {
                        break L15;
                      } else {
                        if (dl.field_y.length >= param0) {
                          bd.field_a = 2147483647;
                          hm.field_L = 2147483647;
                          el.field_d = -2147483648;
                          pb.field_b = 0;
                          ok.field_j = -2147483648;
                          return;
                        } else {
                          break L15;
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
                  L16: {
                    L17: {
                      if (null == dd.field_L) {
                        break L17;
                      } else {
                        if (param0 > dd.field_L.length) {
                          break L17;
                        } else {
                          break L16;
                        }
                      }
                    }
                    dd.field_L = new int[2 * param0];
                    break L16;
                  }
                  if (al.field_bb == null) {
                    L18: {
                      L19: {
                        al.field_bb = new int[param0 * 2];
                        if (null == pf.field_b) {
                          break L19;
                        } else {
                          if (param1 + param0 > pf.field_b.length) {
                            break L19;
                          } else {
                            break L18;
                          }
                        }
                      }
                      pf.field_b = new int[2 * (param1 + param0)];
                      break L18;
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
                      L20: {
                        L21: {
                          if (null == pf.field_b) {
                            break L21;
                          } else {
                            if (param1 + param0 > pf.field_b.length) {
                              break L21;
                            } else {
                              break L20;
                            }
                          }
                        }
                        pf.field_b = new int[2 * (param1 + param0)];
                        break L20;
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
                      L22: {
                        L23: {
                          al.field_bb = new int[param0 * 2];
                          if (null == pf.field_b) {
                            break L23;
                          } else {
                            if (param1 + param0 > pf.field_b.length) {
                              break L23;
                            } else {
                              break L22;
                            }
                          }
                        }
                        pf.field_b = new int[2 * (param1 + param0)];
                        break L22;
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
                  L24: {
                    L25: {
                      oa.field_c = new int[2 * param0];
                      if (null == dd.field_L) {
                        break L25;
                      } else {
                        if (param0 > dd.field_L.length) {
                          break L25;
                        } else {
                          break L24;
                        }
                      }
                    }
                    dd.field_L = new int[2 * param0];
                    break L24;
                  }
                  L26: {
                    L27: {
                      if (al.field_bb == null) {
                        break L27;
                      } else {
                        if (al.field_bb.length >= param0) {
                          break L26;
                        } else {
                          break L27;
                        }
                      }
                    }
                    al.field_bb = new int[param0 * 2];
                    break L26;
                  }
                  L28: {
                    L29: {
                      if (null == pf.field_b) {
                        break L29;
                      } else {
                        if (param1 + param0 > pf.field_b.length) {
                          break L29;
                        } else {
                          break L28;
                        }
                      }
                    }
                    pf.field_b = new int[2 * (param1 + param0)];
                    break L28;
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
              break L3;
            }
          }
        }
        L30: {
          L31: {
            a.field_c = new int[2 * param0];
            if (null == oa.field_a) {
              break L31;
            } else {
              if (oa.field_a.length < param0) {
                break L31;
              } else {
                break L30;
              }
            }
          }
          oa.field_a = new int[2 * param0];
          break L30;
        }
        L32: {
          if (null == oa.field_c) {
            break L32;
          } else {
            if (oa.field_c.length < param0) {
              break L32;
            } else {
              L33: {
                L34: {
                  if (null == dd.field_L) {
                    break L34;
                  } else {
                    if (param0 > dd.field_L.length) {
                      break L34;
                    } else {
                      break L33;
                    }
                  }
                }
                dd.field_L = new int[2 * param0];
                break L33;
              }
              L35: {
                L36: {
                  if (al.field_bb == null) {
                    break L36;
                  } else {
                    if (al.field_bb.length >= param0) {
                      break L35;
                    } else {
                      break L36;
                    }
                  }
                }
                al.field_bb = new int[param0 * 2];
                break L35;
              }
              L37: {
                L38: {
                  if (null == pf.field_b) {
                    break L38;
                  } else {
                    if (param1 + param0 > pf.field_b.length) {
                      break L38;
                    } else {
                      break L37;
                    }
                  }
                }
                pf.field_b = new int[2 * (param1 + param0)];
                break L37;
              }
              L39: {
                if (dl.field_y == null) {
                  break L39;
                } else {
                  if (dl.field_y.length >= param0) {
                    bd.field_a = 2147483647;
                    hm.field_L = 2147483647;
                    el.field_d = -2147483648;
                    pb.field_b = 0;
                    ok.field_j = -2147483648;
                    return;
                  } else {
                    break L39;
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
          L40: {
            if (param0 > dd.field_L.length) {
              dd.field_L = new int[2 * param0];
              break L40;
            } else {
              break L40;
            }
          }
          L41: {
            L42: {
              if (al.field_bb == null) {
                break L42;
              } else {
                if (al.field_bb.length >= param0) {
                  break L41;
                } else {
                  break L42;
                }
              }
            }
            al.field_bb = new int[param0 * 2];
            break L41;
          }
          L43: {
            L44: {
              if (null == pf.field_b) {
                break L44;
              } else {
                if (param1 + param0 > pf.field_b.length) {
                  break L44;
                } else {
                  break L43;
                }
              }
            }
            pf.field_b = new int[2 * (param1 + param0)];
            break L43;
          }
          L45: {
            if (dl.field_y == null) {
              break L45;
            } else {
              if (dl.field_y.length >= param0) {
                bd.field_a = 2147483647;
                hm.field_L = 2147483647;
                el.field_d = -2147483648;
                pb.field_b = 0;
                ok.field_j = -2147483648;
                return;
              } else {
                break L45;
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
          L46: {
            L47: {
              dd.field_L = new int[2 * param0];
              if (al.field_bb == null) {
                break L47;
              } else {
                if (al.field_bb.length >= param0) {
                  break L46;
                } else {
                  break L47;
                }
              }
            }
            al.field_bb = new int[param0 * 2];
            break L46;
          }
          L48: {
            L49: {
              if (null == pf.field_b) {
                break L49;
              } else {
                if (param1 + param0 > pf.field_b.length) {
                  break L49;
                } else {
                  break L48;
                }
              }
            }
            pf.field_b = new int[2 * (param1 + param0)];
            break L48;
          }
          L50: {
            if (dl.field_y == null) {
              break L50;
            } else {
              if (dl.field_y.length >= param0) {
                bd.field_a = 2147483647;
                hm.field_L = 2147483647;
                el.field_d = -2147483648;
                pb.field_b = 0;
                ok.field_j = -2147483648;
                return;
              } else {
                break L50;
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
        int decompiledRegionSelector0 = 0;
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
            if (this.b(param0, 0) != qf.field_d) {
              var3_int = -102 % ((26 - param1) / 56);
              stackOut_3_0 = null;
              stackIn_4_0 = stackOut_3_0;
              decompiledRegionSelector0 = 1;
              break L0;
            } else {
              stackOut_1_0 = (String) (field_m);
              stackIn_2_0 = stackOut_1_0;
              decompiledRegionSelector0 = 0;
              break L0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L1: {
            var3 = decompiledCaughtException;
            stackOut_5_0 = (RuntimeException) (var3);
            stackOut_5_1 = new StringBuilder().append("le.B(");
            stackIn_7_0 = stackOut_5_0;
            stackIn_7_1 = stackOut_5_1;
            stackIn_6_0 = stackOut_5_0;
            stackIn_6_1 = stackOut_5_1;
            if (param0 == null) {
              stackOut_7_0 = (RuntimeException) ((Object) stackIn_7_0);
              stackOut_7_1 = (StringBuilder) ((Object) stackIn_7_1);
              stackOut_7_2 = "null";
              stackIn_8_0 = stackOut_7_0;
              stackIn_8_1 = stackOut_7_1;
              stackIn_8_2 = stackOut_7_2;
              break L1;
            } else {
              stackOut_6_0 = (RuntimeException) ((Object) stackIn_6_0);
              stackOut_6_1 = (StringBuilder) ((Object) stackIn_6_1);
              stackOut_6_2 = "{...}";
              stackIn_8_0 = stackOut_6_0;
              stackIn_8_1 = stackOut_6_1;
              stackIn_8_2 = stackOut_6_2;
              break L1;
            }
          }
          throw qk.a((Throwable) ((Object) stackIn_8_0), stackIn_8_2 + ',' + param1 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return stackIn_2_0;
        } else {
          return (String) ((Object) stackIn_4_0);
        }
    }

    final static void b(boolean param0) {
        if (param0) {
          L0: {
            ga.b((byte) 111);
            if (null != ae.field_G) {
              hk.a(ae.field_G, (byte) 6);
              break L0;
            } else {
              break L0;
            }
          }
          ab.a((byte) -128);
          rf.d((byte) 93);
          lf.a(param0);
          if (od.b(255)) {
            di.field_l.k(-17410, 1);
            bc.a(0, 0);
            gb.g(-17464);
            return;
          } else {
            gb.g(-17464);
            return;
          }
        } else {
          L1: {
            le.a(-62, 72, true);
            ga.b((byte) 111);
            if (null != ae.field_G) {
              hk.a(ae.field_G, (byte) 6);
              break L1;
            } else {
              break L1;
            }
          }
          ab.a((byte) -128);
          rf.d((byte) 93);
          lf.a(param0);
          if (!od.b(255)) {
            gb.g(-17464);
            return;
          } else {
            di.field_l.k(-17410, 1);
            bc.a(0, 0);
            gb.g(-17464);
            return;
          }
        }
    }

    final static boolean a(boolean param0, byte param1) {
        try {
            String discarded$4 = null;
            long dupTemp$5 = 0L;
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
                discarded$4 = le.a(false);
                break L1;
              }
            }
            if (bd.field_k.field_d == 0) {
              return false;
            } else {
              dupTemp$5 = ll.a(1000);
              bl.field_h = dupTemp$5;
              dm.field_c = dupTemp$5;
              if (1 == bd.field_k.field_d) {
                try {
                  L2: {
                    L3: {
                      ig.field_e = new tf((java.net.Socket) (bd.field_k.field_e), da.field_g);
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
                    ej.a(gi.field_v, -25563, di.field_l, ij.field_d, hb.field_i);
                    bc.a(-1, 0);
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
        field_m = "Please enter your age in years";
        field_o = new String[]{"Showing by rating", "Showing by win percentage"};
        field_n = new rh(14, 0, 4, 1);
        field_s = new int[]{3, 3, 3, 55, 7, 7, 7, -1, 8, 9, 10, 11, -1, -1, -1, -1, -1, -1, -1, -1, 23, 23, 23, 55, 27, 27, 27, -1, 31, 31, 31, 68, 35, 35, 35, -1, -1, -1, -1, -1, -1, -1, -1, -1, 47, 47, 47, -1, 51, 51, 51, -1, 55, 55, 55, -1, 59, 59, 59, -1, 63, 63, 63, -1, 67, 67, 67, -1, 71, 71, 71, -1, 72, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1};
    }
}
