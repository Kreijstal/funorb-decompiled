/*
 * Decompiled by CFR-JS 0.4.0.
 */
import java.util.*;

final class jb implements io {
    static vo field_b;
    static String field_d;
    static String field_c;
    static vn[] field_a;

    public final void a(int param0, boolean param1, int param2, ga param3, int param4) {
        RuntimeException var6 = null;
        int var6_int = 0;
        int var7 = 0;
        vn var8 = null;
        RuntimeException stackIn_9_0 = null;
        StringBuilder stackIn_9_1 = null;
        RuntimeException stackIn_10_0 = null;
        StringBuilder stackIn_10_1 = null;
        RuntimeException stackIn_11_0 = null;
        StringBuilder stackIn_11_1 = null;
        String stackIn_11_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException stackOut_8_0 = null;
        StringBuilder stackOut_8_1 = null;
        RuntimeException stackOut_10_0 = null;
        StringBuilder stackOut_10_1 = null;
        String stackOut_10_2 = null;
        RuntimeException stackOut_9_0 = null;
        StringBuilder stackOut_9_1 = null;
        String stackOut_9_2 = null;
        try {
          L0: {
            if (param0 == 16777215) {
              L1: {
                var6_int = param3.field_k + param4;
                var7 = param2 - -param3.field_j;
                pb.a(var6_int, param3.field_n, var7, 48, param3.field_i);
                var8 = dj.field_k[1];
                if (!(param3 instanceof an)) {
                  break L1;
                } else {
                  if (!((an) (Object) param3).field_x) {
                    break L1;
                  } else {
                    var8.b(var6_int - (-1 - (-var8.field_r + param3.field_i >> 1)), 1 + var7 - -(param3.field_n + -var8.field_q >> 1), 256);
                    break L1;
                  }
                }
              }
              L2: {
                if (!param3.e(-17741)) {
                  break L2;
                } else {
                  on.b(param3.field_i - 4, -4 + param3.field_n, var6_int + 2, param0 + -16777157, 2 + var7);
                  break L2;
                }
              }
              break L0;
            } else {
              return;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L3: {
            var6 = decompiledCaughtException;
            stackOut_8_0 = (RuntimeException) var6;
            stackOut_8_1 = new StringBuilder().append("jb.A(").append(param0).append(',').append(param1).append(',').append(param2).append(',');
            stackIn_10_0 = stackOut_8_0;
            stackIn_10_1 = stackOut_8_1;
            stackIn_9_0 = stackOut_8_0;
            stackIn_9_1 = stackOut_8_1;
            if (param3 == null) {
              stackOut_10_0 = (RuntimeException) (Object) stackIn_10_0;
              stackOut_10_1 = (StringBuilder) (Object) stackIn_10_1;
              stackOut_10_2 = "null";
              stackIn_11_0 = stackOut_10_0;
              stackIn_11_1 = stackOut_10_1;
              stackIn_11_2 = stackOut_10_2;
              break L3;
            } else {
              stackOut_9_0 = (RuntimeException) (Object) stackIn_9_0;
              stackOut_9_1 = (StringBuilder) (Object) stackIn_9_1;
              stackOut_9_2 = "{...}";
              stackIn_11_0 = stackOut_9_0;
              stackIn_11_1 = stackOut_9_1;
              stackIn_11_2 = stackOut_9_2;
              break L3;
            }
          }
          throw sh.a((Throwable) (Object) stackIn_11_0, stackIn_11_2 + ',' + param4 + ')');
        }
    }

    final static void a(int param0, boolean param1, int param2) {
        L0: {
          L1: {
            if (null == j.field_b) {
              break L1;
            } else {
              if (param0 > j.field_b.length) {
                break L1;
              } else {
                break L0;
              }
            }
          }
          j.field_b = new int[param0 * 2];
          break L0;
        }
        L2: {
          L3: {
            if (null == dj.field_g) {
              break L3;
            } else {
              if (param0 > dj.field_g.length) {
                break L3;
              } else {
                break L2;
              }
            }
          }
          dj.field_g = new int[2 * param0];
          break L2;
        }
        L4: {
          if (qo.field_r == null) {
            break L4;
          } else {
            if (qo.field_r.length >= param0) {
              if (null == sg.field_kb) {
                sg.field_kb = new int[param0 * 2];
                if (null == jd.field_d) {
                  L5: {
                    L6: {
                      jd.field_d = new int[2 * param0];
                      if (qp.field_b == null) {
                        break L6;
                      } else {
                        if (param0 > qp.field_b.length) {
                          break L6;
                        } else {
                          break L5;
                        }
                      }
                    }
                    qp.field_b = new int[param0 * 2];
                    break L5;
                  }
                  L7: {
                    L8: {
                      if (null == qd.field_c) {
                        break L8;
                      } else {
                        if (qd.field_c.length < param0 - -param2) {
                          break L8;
                        } else {
                          break L7;
                        }
                      }
                    }
                    qd.field_c = new int[(param0 + param2) * 2];
                    break L7;
                  }
                  L9: {
                    if (ip.field_q == null) {
                      break L9;
                    } else {
                      if (param0 <= ip.field_q.length) {
                        ub.field_d = -2147483648;
                        qn.field_e = 0;
                        fe.field_O = 2147483647;
                        sg.field_pb = 2147483647;
                        me.field_Db = -2147483648;
                        return;
                      } else {
                        break L9;
                      }
                    }
                  }
                  ip.field_q = new boolean[2 * param0];
                  ub.field_d = -2147483648;
                  qn.field_e = 0;
                  fe.field_O = 2147483647;
                  sg.field_pb = 2147483647;
                  me.field_Db = -2147483648;
                  return;
                } else {
                  if (jd.field_d.length >= param0) {
                    L10: {
                      L11: {
                        if (qp.field_b == null) {
                          break L11;
                        } else {
                          if (param0 > qp.field_b.length) {
                            break L11;
                          } else {
                            break L10;
                          }
                        }
                      }
                      qp.field_b = new int[param0 * 2];
                      break L10;
                    }
                    L12: {
                      L13: {
                        if (null == qd.field_c) {
                          break L13;
                        } else {
                          if (qd.field_c.length < param0 - -param2) {
                            break L13;
                          } else {
                            break L12;
                          }
                        }
                      }
                      qd.field_c = new int[(param0 + param2) * 2];
                      break L12;
                    }
                    if (ip.field_q == null) {
                      ip.field_q = new boolean[2 * param0];
                      ub.field_d = -2147483648;
                      qn.field_e = 0;
                      fe.field_O = 2147483647;
                      sg.field_pb = 2147483647;
                      me.field_Db = -2147483648;
                      return;
                    } else {
                      if (param0 <= ip.field_q.length) {
                        ub.field_d = -2147483648;
                        qn.field_e = 0;
                        fe.field_O = 2147483647;
                        sg.field_pb = 2147483647;
                        me.field_Db = -2147483648;
                        return;
                      } else {
                        ip.field_q = new boolean[2 * param0];
                        ub.field_d = -2147483648;
                        qn.field_e = 0;
                        fe.field_O = 2147483647;
                        sg.field_pb = 2147483647;
                        me.field_Db = -2147483648;
                        return;
                      }
                    }
                  } else {
                    L14: {
                      L15: {
                        jd.field_d = new int[2 * param0];
                        if (qp.field_b == null) {
                          break L15;
                        } else {
                          if (param0 > qp.field_b.length) {
                            break L15;
                          } else {
                            break L14;
                          }
                        }
                      }
                      qp.field_b = new int[param0 * 2];
                      break L14;
                    }
                    L16: {
                      L17: {
                        if (null == qd.field_c) {
                          break L17;
                        } else {
                          if (qd.field_c.length < param0 - -param2) {
                            break L17;
                          } else {
                            break L16;
                          }
                        }
                      }
                      qd.field_c = new int[(param0 + param2) * 2];
                      break L16;
                    }
                    L18: {
                      if (ip.field_q == null) {
                        break L18;
                      } else {
                        if (param0 <= ip.field_q.length) {
                          ub.field_d = -2147483648;
                          qn.field_e = 0;
                          fe.field_O = 2147483647;
                          sg.field_pb = 2147483647;
                          me.field_Db = -2147483648;
                          return;
                        } else {
                          break L18;
                        }
                      }
                    }
                    ip.field_q = new boolean[2 * param0];
                    ub.field_d = -2147483648;
                    qn.field_e = 0;
                    fe.field_O = 2147483647;
                    sg.field_pb = 2147483647;
                    me.field_Db = -2147483648;
                    return;
                  }
                }
              } else {
                if (param0 <= sg.field_kb.length) {
                  if (null == jd.field_d) {
                    L19: {
                      L20: {
                        jd.field_d = new int[2 * param0];
                        if (qp.field_b == null) {
                          break L20;
                        } else {
                          if (param0 > qp.field_b.length) {
                            break L20;
                          } else {
                            break L19;
                          }
                        }
                      }
                      qp.field_b = new int[param0 * 2];
                      break L19;
                    }
                    L21: {
                      L22: {
                        if (null == qd.field_c) {
                          break L22;
                        } else {
                          if (qd.field_c.length < param0 - -param2) {
                            break L22;
                          } else {
                            break L21;
                          }
                        }
                      }
                      qd.field_c = new int[(param0 + param2) * 2];
                      break L21;
                    }
                    if (ip.field_q == null) {
                      ip.field_q = new boolean[2 * param0];
                      ub.field_d = -2147483648;
                      qn.field_e = 0;
                      fe.field_O = 2147483647;
                      sg.field_pb = 2147483647;
                      me.field_Db = -2147483648;
                      return;
                    } else {
                      if (param0 <= ip.field_q.length) {
                        ub.field_d = -2147483648;
                        qn.field_e = 0;
                        fe.field_O = 2147483647;
                        sg.field_pb = 2147483647;
                        me.field_Db = -2147483648;
                        return;
                      } else {
                        ip.field_q = new boolean[2 * param0];
                        ub.field_d = -2147483648;
                        qn.field_e = 0;
                        fe.field_O = 2147483647;
                        sg.field_pb = 2147483647;
                        me.field_Db = -2147483648;
                        return;
                      }
                    }
                  } else {
                    if (jd.field_d.length >= param0) {
                      L23: {
                        L24: {
                          if (qp.field_b == null) {
                            break L24;
                          } else {
                            if (param0 > qp.field_b.length) {
                              break L24;
                            } else {
                              break L23;
                            }
                          }
                        }
                        qp.field_b = new int[param0 * 2];
                        break L23;
                      }
                      L25: {
                        L26: {
                          if (null == qd.field_c) {
                            break L26;
                          } else {
                            if (qd.field_c.length < param0 - -param2) {
                              break L26;
                            } else {
                              break L25;
                            }
                          }
                        }
                        qd.field_c = new int[(param0 + param2) * 2];
                        break L25;
                      }
                      if (ip.field_q == null) {
                        ip.field_q = new boolean[2 * param0];
                        ub.field_d = -2147483648;
                        qn.field_e = 0;
                        fe.field_O = 2147483647;
                        sg.field_pb = 2147483647;
                        me.field_Db = -2147483648;
                        return;
                      } else {
                        if (param0 <= ip.field_q.length) {
                          ub.field_d = -2147483648;
                          qn.field_e = 0;
                          fe.field_O = 2147483647;
                          sg.field_pb = 2147483647;
                          me.field_Db = -2147483648;
                          return;
                        } else {
                          ip.field_q = new boolean[2 * param0];
                          ub.field_d = -2147483648;
                          qn.field_e = 0;
                          fe.field_O = 2147483647;
                          sg.field_pb = 2147483647;
                          me.field_Db = -2147483648;
                          return;
                        }
                      }
                    } else {
                      L27: {
                        L28: {
                          jd.field_d = new int[2 * param0];
                          if (qp.field_b == null) {
                            break L28;
                          } else {
                            if (param0 > qp.field_b.length) {
                              break L28;
                            } else {
                              break L27;
                            }
                          }
                        }
                        qp.field_b = new int[param0 * 2];
                        break L27;
                      }
                      L29: {
                        L30: {
                          if (null == qd.field_c) {
                            break L30;
                          } else {
                            if (qd.field_c.length < param0 - -param2) {
                              break L30;
                            } else {
                              break L29;
                            }
                          }
                        }
                        qd.field_c = new int[(param0 + param2) * 2];
                        break L29;
                      }
                      if (ip.field_q == null) {
                        ip.field_q = new boolean[2 * param0];
                        ub.field_d = -2147483648;
                        qn.field_e = 0;
                        fe.field_O = 2147483647;
                        sg.field_pb = 2147483647;
                        me.field_Db = -2147483648;
                        return;
                      } else {
                        if (param0 <= ip.field_q.length) {
                          ub.field_d = -2147483648;
                          qn.field_e = 0;
                          fe.field_O = 2147483647;
                          sg.field_pb = 2147483647;
                          me.field_Db = -2147483648;
                          return;
                        } else {
                          ip.field_q = new boolean[2 * param0];
                          ub.field_d = -2147483648;
                          qn.field_e = 0;
                          fe.field_O = 2147483647;
                          sg.field_pb = 2147483647;
                          me.field_Db = -2147483648;
                          return;
                        }
                      }
                    }
                  }
                } else {
                  L31: {
                    L32: {
                      sg.field_kb = new int[param0 * 2];
                      if (null == jd.field_d) {
                        break L32;
                      } else {
                        if (jd.field_d.length >= param0) {
                          break L31;
                        } else {
                          break L32;
                        }
                      }
                    }
                    jd.field_d = new int[2 * param0];
                    break L31;
                  }
                  L33: {
                    L34: {
                      if (qp.field_b == null) {
                        break L34;
                      } else {
                        if (param0 > qp.field_b.length) {
                          break L34;
                        } else {
                          break L33;
                        }
                      }
                    }
                    qp.field_b = new int[param0 * 2];
                    break L33;
                  }
                  L35: {
                    L36: {
                      if (null == qd.field_c) {
                        break L36;
                      } else {
                        if (qd.field_c.length < param0 - -param2) {
                          break L36;
                        } else {
                          break L35;
                        }
                      }
                    }
                    qd.field_c = new int[(param0 + param2) * 2];
                    break L35;
                  }
                  if (ip.field_q == null) {
                    ip.field_q = new boolean[2 * param0];
                    ub.field_d = -2147483648;
                    qn.field_e = 0;
                    fe.field_O = 2147483647;
                    sg.field_pb = 2147483647;
                    me.field_Db = -2147483648;
                    return;
                  } else {
                    if (param0 <= ip.field_q.length) {
                      ub.field_d = -2147483648;
                      qn.field_e = 0;
                      fe.field_O = 2147483647;
                      sg.field_pb = 2147483647;
                      me.field_Db = -2147483648;
                      return;
                    } else {
                      ip.field_q = new boolean[2 * param0];
                      ub.field_d = -2147483648;
                      qn.field_e = 0;
                      fe.field_O = 2147483647;
                      sg.field_pb = 2147483647;
                      me.field_Db = -2147483648;
                      return;
                    }
                  }
                }
              }
            } else {
              break L4;
            }
          }
        }
        L37: {
          L38: {
            qo.field_r = new int[2 * param0];
            if (null == sg.field_kb) {
              break L38;
            } else {
              if (param0 <= sg.field_kb.length) {
                break L37;
              } else {
                break L38;
              }
            }
          }
          sg.field_kb = new int[param0 * 2];
          break L37;
        }
        if (null != jd.field_d) {
          if (jd.field_d.length < param0) {
            L39: {
              L40: {
                jd.field_d = new int[2 * param0];
                if (qp.field_b == null) {
                  break L40;
                } else {
                  if (param0 > qp.field_b.length) {
                    break L40;
                  } else {
                    break L39;
                  }
                }
              }
              qp.field_b = new int[param0 * 2];
              break L39;
            }
            L41: {
              L42: {
                if (null == qd.field_c) {
                  break L42;
                } else {
                  if (qd.field_c.length < param0 - -param2) {
                    break L42;
                  } else {
                    break L41;
                  }
                }
              }
              qd.field_c = new int[(param0 + param2) * 2];
              break L41;
            }
            L43: {
              if (ip.field_q == null) {
                break L43;
              } else {
                if (param0 <= ip.field_q.length) {
                  ub.field_d = -2147483648;
                  qn.field_e = 0;
                  fe.field_O = 2147483647;
                  sg.field_pb = 2147483647;
                  me.field_Db = -2147483648;
                  return;
                } else {
                  break L43;
                }
              }
            }
            ip.field_q = new boolean[2 * param0];
            ub.field_d = -2147483648;
            qn.field_e = 0;
            fe.field_O = 2147483647;
            sg.field_pb = 2147483647;
            me.field_Db = -2147483648;
            return;
          } else {
            L44: {
              L45: {
                if (qp.field_b == null) {
                  break L45;
                } else {
                  if (param0 > qp.field_b.length) {
                    break L45;
                  } else {
                    break L44;
                  }
                }
              }
              qp.field_b = new int[param0 * 2];
              break L44;
            }
            L46: {
              L47: {
                if (null == qd.field_c) {
                  break L47;
                } else {
                  if (qd.field_c.length < param0 - -param2) {
                    break L47;
                  } else {
                    break L46;
                  }
                }
              }
              qd.field_c = new int[(param0 + param2) * 2];
              break L46;
            }
            L48: {
              if (ip.field_q == null) {
                break L48;
              } else {
                if (param0 <= ip.field_q.length) {
                  ub.field_d = -2147483648;
                  qn.field_e = 0;
                  fe.field_O = 2147483647;
                  sg.field_pb = 2147483647;
                  me.field_Db = -2147483648;
                  return;
                } else {
                  break L48;
                }
              }
            }
            ip.field_q = new boolean[2 * param0];
            ub.field_d = -2147483648;
            qn.field_e = 0;
            fe.field_O = 2147483647;
            sg.field_pb = 2147483647;
            me.field_Db = -2147483648;
            return;
          }
        } else {
          L49: {
            L50: {
              jd.field_d = new int[2 * param0];
              if (qp.field_b == null) {
                break L50;
              } else {
                if (param0 > qp.field_b.length) {
                  break L50;
                } else {
                  break L49;
                }
              }
            }
            qp.field_b = new int[param0 * 2];
            break L49;
          }
          L51: {
            L52: {
              if (null == qd.field_c) {
                break L52;
              } else {
                if (qd.field_c.length < param0 - -param2) {
                  break L52;
                } else {
                  break L51;
                }
              }
            }
            qd.field_c = new int[(param0 + param2) * 2];
            break L51;
          }
          L53: {
            if (ip.field_q == null) {
              break L53;
            } else {
              if (param0 <= ip.field_q.length) {
                ub.field_d = -2147483648;
                qn.field_e = 0;
                fe.field_O = 2147483647;
                sg.field_pb = 2147483647;
                me.field_Db = -2147483648;
                return;
              } else {
                break L53;
              }
            }
          }
          ip.field_q = new boolean[2 * param0];
          ub.field_d = -2147483648;
          qn.field_e = 0;
          fe.field_O = 2147483647;
          sg.field_pb = 2147483647;
          me.field_Db = -2147483648;
          return;
        }
    }

    public static void a(int param0) {
        int var1 = 40;
        field_d = null;
        field_a = null;
        field_b = null;
        field_c = null;
    }

    final static String a(int param0, long param1) {
        ni.field_d.setTime(new Date(param1));
        int var3 = ni.field_d.get(7);
        int var4 = ni.field_d.get(5);
        int var5 = ni.field_d.get(2);
        int var6 = ni.field_d.get(1);
        int var7 = ni.field_d.get(11);
        int var8 = ni.field_d.get(12);
        int var9 = ni.field_d.get(13);
        return cn.field_e[-1 + var3] + ", " + var4 / 10 + var4 % 10 + "-" + ln.field_a[var5] + "-" + var6 + " " + var7 / 10 + var7 % 10 + ":" + var8 / 10 + var8 % 10 + ":" + var9 / 10 + var9 % 10 + " GMT";
    }

    final static void a(int param0, java.awt.Frame param1, ec param2) {
        int var3_int = 0;
        RuntimeException var3 = null;
        op var4 = null;
        int var5 = 0;
        RuntimeException stackIn_10_0 = null;
        StringBuilder stackIn_10_1 = null;
        RuntimeException stackIn_11_0 = null;
        StringBuilder stackIn_11_1 = null;
        RuntimeException stackIn_12_0 = null;
        StringBuilder stackIn_12_1 = null;
        String stackIn_12_2 = null;
        RuntimeException stackIn_13_0 = null;
        StringBuilder stackIn_13_1 = null;
        RuntimeException stackIn_14_0 = null;
        StringBuilder stackIn_14_1 = null;
        RuntimeException stackIn_15_0 = null;
        StringBuilder stackIn_15_1 = null;
        String stackIn_15_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException stackOut_9_0 = null;
        StringBuilder stackOut_9_1 = null;
        RuntimeException stackOut_11_0 = null;
        StringBuilder stackOut_11_1 = null;
        String stackOut_11_2 = null;
        RuntimeException stackOut_10_0 = null;
        StringBuilder stackOut_10_1 = null;
        String stackOut_10_2 = null;
        RuntimeException stackOut_12_0 = null;
        StringBuilder stackOut_12_1 = null;
        RuntimeException stackOut_14_0 = null;
        StringBuilder stackOut_14_1 = null;
        String stackOut_14_2 = null;
        RuntimeException stackOut_13_0 = null;
        StringBuilder stackOut_13_1 = null;
        String stackOut_13_2 = null;
        var5 = ZombieDawn.field_J;
        try {
          L0: {
            var3_int = -100 % ((62 - param0) / 39);
            L1: while (true) {
              var4 = param2.a(param1, (byte) 52);
              L2: while (true) {
                if (var4.field_f != 0) {
                  if (var4.field_f == 1) {
                    param1.setVisible(false);
                    param1.dispose();
                    break L0;
                  } else {
                    ld.a(100L, (byte) 70);
                    continue L1;
                  }
                } else {
                  ld.a(10L, (byte) 115);
                  continue L2;
                }
              }
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L3: {
            var3 = decompiledCaughtException;
            stackOut_9_0 = (RuntimeException) var3;
            stackOut_9_1 = new StringBuilder().append("jb.G(").append(param0).append(',');
            stackIn_11_0 = stackOut_9_0;
            stackIn_11_1 = stackOut_9_1;
            stackIn_10_0 = stackOut_9_0;
            stackIn_10_1 = stackOut_9_1;
            if (param1 == null) {
              stackOut_11_0 = (RuntimeException) (Object) stackIn_11_0;
              stackOut_11_1 = (StringBuilder) (Object) stackIn_11_1;
              stackOut_11_2 = "null";
              stackIn_12_0 = stackOut_11_0;
              stackIn_12_1 = stackOut_11_1;
              stackIn_12_2 = stackOut_11_2;
              break L3;
            } else {
              stackOut_10_0 = (RuntimeException) (Object) stackIn_10_0;
              stackOut_10_1 = (StringBuilder) (Object) stackIn_10_1;
              stackOut_10_2 = "{...}";
              stackIn_12_0 = stackOut_10_0;
              stackIn_12_1 = stackOut_10_1;
              stackIn_12_2 = stackOut_10_2;
              break L3;
            }
          }
          L4: {
            stackOut_12_0 = (RuntimeException) (Object) stackIn_12_0;
            stackOut_12_1 = ((StringBuilder) (Object) stackIn_12_1).append(stackIn_12_2).append(',');
            stackIn_14_0 = stackOut_12_0;
            stackIn_14_1 = stackOut_12_1;
            stackIn_13_0 = stackOut_12_0;
            stackIn_13_1 = stackOut_12_1;
            if (param2 == null) {
              stackOut_14_0 = (RuntimeException) (Object) stackIn_14_0;
              stackOut_14_1 = (StringBuilder) (Object) stackIn_14_1;
              stackOut_14_2 = "null";
              stackIn_15_0 = stackOut_14_0;
              stackIn_15_1 = stackOut_14_1;
              stackIn_15_2 = stackOut_14_2;
              break L4;
            } else {
              stackOut_13_0 = (RuntimeException) (Object) stackIn_13_0;
              stackOut_13_1 = (StringBuilder) (Object) stackIn_13_1;
              stackOut_13_2 = "{...}";
              stackIn_15_0 = stackOut_13_0;
              stackIn_15_1 = stackOut_13_1;
              stackIn_15_2 = stackOut_13_2;
              break L4;
            }
          }
          throw sh.a((Throwable) (Object) stackIn_15_0, stackIn_15_2 + ')');
        }
    }

    final static String a() {
        if (2 <= ld.field_j) {
          if (f.field_i == null) {
            if (vo.field_d.a((byte) 73)) {
              if (vo.field_d.a(-1, "commonui")) {
                if (!da.field_l.a((byte) 73)) {
                  return nd.field_d;
                } else {
                  if (!da.field_l.a(-1, "commonui")) {
                    return ba.field_e + " - " + da.field_l.b("commonui", 86) + "%";
                  } else {
                    if (al.field_a.a((byte) 73)) {
                      if (!al.field_a.c(9001)) {
                        return lo.field_p + " - " + al.field_a.e(-94) + "%";
                      } else {
                        return jh.field_l;
                      }
                    } else {
                      return ad.field_o;
                    }
                  }
                }
              } else {
                return el.field_m + " - " + vo.field_d.b("commonui", 88) + "%";
              }
            } else {
              return nb.field_o;
            }
          } else {
            if (!f.field_i.a((byte) 73)) {
              return cj.field_e;
            } else {
              return l.field_g;
            }
          }
        } else {
          return ki.field_V;
        }
    }

    final static boolean a(byte param0, char param1) {
        if (Character.isISOControl(param1)) {
          return false;
        } else {
          int discarded$6 = 441;
          if (!c.a(param1)) {
            if (param1 != 45) {
              if (160 != param1) {
                if (param1 != 32) {
                  if (param1 == 95) {
                    return true;
                  } else {
                    return false;
                  }
                } else {
                  return true;
                }
              } else {
                return true;
              }
            } else {
              return true;
            }
          } else {
            return true;
          }
        }
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_d = "By clicking Create, you agree to the <%0><hotspot=0>Terms of Use</hotspot><%1> and <%0><hotspot=1>Privacy Policy</hotspot><%1>.";
        field_b = new vo();
        field_c = "Continue";
    }
}
