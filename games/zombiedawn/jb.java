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
        int decompiledRegionSelector0 = 0;
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
                  if (!((an) ((Object) param3)).field_x) {
                    break L1;
                  } else {
                    var8.b(var6_int - (-1 - (-var8.field_r + param3.field_i >> 926523969)), 1 + var7 - -(param3.field_n + -var8.field_q >> 2124725185), 256);
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
              decompiledRegionSelector0 = 1;
              break L0;
            } else {
              decompiledRegionSelector0 = 0;
              break L0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L3: {
            var6 = decompiledCaughtException;
            stackOut_8_0 = (RuntimeException) (var6);
            stackOut_8_1 = new StringBuilder().append("jb.A(").append(param0).append(',').append(param1).append(',').append(param2).append(',');
            stackIn_10_0 = stackOut_8_0;
            stackIn_10_1 = stackOut_8_1;
            stackIn_9_0 = stackOut_8_0;
            stackIn_9_1 = stackOut_8_1;
            if (param3 == null) {
              stackOut_10_0 = (RuntimeException) ((Object) stackIn_10_0);
              stackOut_10_1 = (StringBuilder) ((Object) stackIn_10_1);
              stackOut_10_2 = "null";
              stackIn_11_0 = stackOut_10_0;
              stackIn_11_1 = stackOut_10_1;
              stackIn_11_2 = stackOut_10_2;
              break L3;
            } else {
              stackOut_9_0 = (RuntimeException) ((Object) stackIn_9_0);
              stackOut_9_1 = (StringBuilder) ((Object) stackIn_9_1);
              stackOut_9_2 = "{...}";
              stackIn_11_0 = stackOut_9_0;
              stackIn_11_1 = stackOut_9_1;
              stackIn_11_2 = stackOut_9_2;
              break L3;
            }
          }
          throw sh.a((Throwable) ((Object) stackIn_11_0), stackIn_11_2 + ',' + param4 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return;
        } else {
          return;
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
        if (null != dj.field_g) {
          if (param0 <= dj.field_g.length) {
            L2: {
              L3: {
                if (qo.field_r == null) {
                  break L3;
                } else {
                  if (qo.field_r.length >= param0) {
                    break L2;
                  } else {
                    break L3;
                  }
                }
              }
              qo.field_r = new int[2 * param0];
              break L2;
            }
            if (null == sg.field_kb) {
              L4: {
                L5: {
                  sg.field_kb = new int[param0 * 2];
                  if (null == jd.field_d) {
                    break L5;
                  } else {
                    if (jd.field_d.length >= param0) {
                      break L4;
                    } else {
                      break L5;
                    }
                  }
                }
                jd.field_d = new int[2 * param0];
                break L4;
              }
              L6: {
                L7: {
                  if (qp.field_b == null) {
                    break L7;
                  } else {
                    if (param0 > qp.field_b.length) {
                      break L7;
                    } else {
                      break L6;
                    }
                  }
                }
                qp.field_b = new int[param0 * 2];
                break L6;
              }
              L8: {
                L9: {
                  if (null == qd.field_c) {
                    break L9;
                  } else {
                    if (qd.field_c.length < param0 - -param2) {
                      break L9;
                    } else {
                      break L8;
                    }
                  }
                }
                qd.field_c = new int[(param0 + param2) * 2];
                break L8;
              }
              if (ip.field_q == null) {
                ip.field_q = new boolean[2 * param0];
                ub.field_d = -2147483648;
                if (param1) {
                  qn.field_e = 0;
                  fe.field_O = 2147483647;
                  sg.field_pb = 2147483647;
                  me.field_Db = -2147483648;
                  return;
                } else {
                  field_a = (vn[]) null;
                  qn.field_e = 0;
                  fe.field_O = 2147483647;
                  sg.field_pb = 2147483647;
                  me.field_Db = -2147483648;
                  return;
                }
              } else {
                if (param0 <= ip.field_q.length) {
                  ub.field_d = -2147483648;
                  if (param1) {
                    qn.field_e = 0;
                    fe.field_O = 2147483647;
                    sg.field_pb = 2147483647;
                    me.field_Db = -2147483648;
                    return;
                  } else {
                    field_a = (vn[]) null;
                    qn.field_e = 0;
                    fe.field_O = 2147483647;
                    sg.field_pb = 2147483647;
                    me.field_Db = -2147483648;
                    return;
                  }
                } else {
                  ip.field_q = new boolean[2 * param0];
                  ub.field_d = -2147483648;
                  if (param1) {
                    qn.field_e = 0;
                    fe.field_O = 2147483647;
                    sg.field_pb = 2147483647;
                    me.field_Db = -2147483648;
                    return;
                  } else {
                    field_a = (vn[]) null;
                    qn.field_e = 0;
                    fe.field_O = 2147483647;
                    sg.field_pb = 2147483647;
                    me.field_Db = -2147483648;
                    return;
                  }
                }
              }
            } else {
              if (param0 <= sg.field_kb.length) {
                if (null == jd.field_d) {
                  L10: {
                    L11: {
                      jd.field_d = new int[2 * param0];
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
                    if (param1) {
                      qn.field_e = 0;
                      fe.field_O = 2147483647;
                      sg.field_pb = 2147483647;
                      me.field_Db = -2147483648;
                      return;
                    } else {
                      field_a = (vn[]) null;
                      qn.field_e = 0;
                      fe.field_O = 2147483647;
                      sg.field_pb = 2147483647;
                      me.field_Db = -2147483648;
                      return;
                    }
                  } else {
                    if (param0 <= ip.field_q.length) {
                      ub.field_d = -2147483648;
                      if (param1) {
                        qn.field_e = 0;
                        fe.field_O = 2147483647;
                        sg.field_pb = 2147483647;
                        me.field_Db = -2147483648;
                        return;
                      } else {
                        field_a = (vn[]) null;
                        qn.field_e = 0;
                        fe.field_O = 2147483647;
                        sg.field_pb = 2147483647;
                        me.field_Db = -2147483648;
                        return;
                      }
                    } else {
                      ip.field_q = new boolean[2 * param0];
                      ub.field_d = -2147483648;
                      if (param1) {
                        qn.field_e = 0;
                        fe.field_O = 2147483647;
                        sg.field_pb = 2147483647;
                        me.field_Db = -2147483648;
                        return;
                      } else {
                        field_a = (vn[]) null;
                        qn.field_e = 0;
                        fe.field_O = 2147483647;
                        sg.field_pb = 2147483647;
                        me.field_Db = -2147483648;
                        return;
                      }
                    }
                  }
                } else {
                  if (jd.field_d.length >= param0) {
                    L14: {
                      L15: {
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
                    if (ip.field_q == null) {
                      ip.field_q = new boolean[2 * param0];
                      ub.field_d = -2147483648;
                      if (param1) {
                        qn.field_e = 0;
                        fe.field_O = 2147483647;
                        sg.field_pb = 2147483647;
                        me.field_Db = -2147483648;
                        return;
                      } else {
                        field_a = (vn[]) null;
                        qn.field_e = 0;
                        fe.field_O = 2147483647;
                        sg.field_pb = 2147483647;
                        me.field_Db = -2147483648;
                        return;
                      }
                    } else {
                      if (param0 <= ip.field_q.length) {
                        ub.field_d = -2147483648;
                        if (param1) {
                          qn.field_e = 0;
                          fe.field_O = 2147483647;
                          sg.field_pb = 2147483647;
                          me.field_Db = -2147483648;
                          return;
                        } else {
                          field_a = (vn[]) null;
                          qn.field_e = 0;
                          fe.field_O = 2147483647;
                          sg.field_pb = 2147483647;
                          me.field_Db = -2147483648;
                          return;
                        }
                      } else {
                        ip.field_q = new boolean[2 * param0];
                        ub.field_d = -2147483648;
                        if (param1) {
                          qn.field_e = 0;
                          fe.field_O = 2147483647;
                          sg.field_pb = 2147483647;
                          me.field_Db = -2147483648;
                          return;
                        } else {
                          field_a = (vn[]) null;
                          qn.field_e = 0;
                          fe.field_O = 2147483647;
                          sg.field_pb = 2147483647;
                          me.field_Db = -2147483648;
                          return;
                        }
                      }
                    }
                  } else {
                    L18: {
                      L19: {
                        jd.field_d = new int[2 * param0];
                        if (qp.field_b == null) {
                          break L19;
                        } else {
                          if (param0 > qp.field_b.length) {
                            break L19;
                          } else {
                            break L18;
                          }
                        }
                      }
                      qp.field_b = new int[param0 * 2];
                      break L18;
                    }
                    L20: {
                      L21: {
                        if (null == qd.field_c) {
                          break L21;
                        } else {
                          if (qd.field_c.length < param0 - -param2) {
                            break L21;
                          } else {
                            break L20;
                          }
                        }
                      }
                      qd.field_c = new int[(param0 + param2) * 2];
                      break L20;
                    }
                    if (ip.field_q == null) {
                      ip.field_q = new boolean[2 * param0];
                      ub.field_d = -2147483648;
                      if (param1) {
                        qn.field_e = 0;
                        fe.field_O = 2147483647;
                        sg.field_pb = 2147483647;
                        me.field_Db = -2147483648;
                        return;
                      } else {
                        field_a = (vn[]) null;
                        qn.field_e = 0;
                        fe.field_O = 2147483647;
                        sg.field_pb = 2147483647;
                        me.field_Db = -2147483648;
                        return;
                      }
                    } else {
                      if (param0 <= ip.field_q.length) {
                        ub.field_d = -2147483648;
                        if (param1) {
                          qn.field_e = 0;
                          fe.field_O = 2147483647;
                          sg.field_pb = 2147483647;
                          me.field_Db = -2147483648;
                          return;
                        } else {
                          field_a = (vn[]) null;
                          qn.field_e = 0;
                          fe.field_O = 2147483647;
                          sg.field_pb = 2147483647;
                          me.field_Db = -2147483648;
                          return;
                        }
                      } else {
                        ip.field_q = new boolean[2 * param0];
                        ub.field_d = -2147483648;
                        if (param1) {
                          qn.field_e = 0;
                          fe.field_O = 2147483647;
                          sg.field_pb = 2147483647;
                          me.field_Db = -2147483648;
                          return;
                        } else {
                          field_a = (vn[]) null;
                          qn.field_e = 0;
                          fe.field_O = 2147483647;
                          sg.field_pb = 2147483647;
                          me.field_Db = -2147483648;
                          return;
                        }
                      }
                    }
                  }
                }
              } else {
                L22: {
                  L23: {
                    sg.field_kb = new int[param0 * 2];
                    if (null == jd.field_d) {
                      break L23;
                    } else {
                      if (jd.field_d.length >= param0) {
                        break L22;
                      } else {
                        break L23;
                      }
                    }
                  }
                  jd.field_d = new int[2 * param0];
                  break L22;
                }
                L24: {
                  L25: {
                    if (qp.field_b == null) {
                      break L25;
                    } else {
                      if (param0 > qp.field_b.length) {
                        break L25;
                      } else {
                        break L24;
                      }
                    }
                  }
                  qp.field_b = new int[param0 * 2];
                  break L24;
                }
                L26: {
                  L27: {
                    if (null == qd.field_c) {
                      break L27;
                    } else {
                      if (qd.field_c.length < param0 - -param2) {
                        break L27;
                      } else {
                        break L26;
                      }
                    }
                  }
                  qd.field_c = new int[(param0 + param2) * 2];
                  break L26;
                }
                L28: {
                  L29: {
                    if (ip.field_q == null) {
                      break L29;
                    } else {
                      if (param0 <= ip.field_q.length) {
                        break L28;
                      } else {
                        break L29;
                      }
                    }
                  }
                  ip.field_q = new boolean[2 * param0];
                  break L28;
                }
                ub.field_d = -2147483648;
                if (param1) {
                  qn.field_e = 0;
                  fe.field_O = 2147483647;
                  sg.field_pb = 2147483647;
                  me.field_Db = -2147483648;
                  return;
                } else {
                  field_a = (vn[]) null;
                  qn.field_e = 0;
                  fe.field_O = 2147483647;
                  sg.field_pb = 2147483647;
                  me.field_Db = -2147483648;
                  return;
                }
              }
            }
          } else {
            L30: {
              L31: {
                dj.field_g = new int[2 * param0];
                if (qo.field_r == null) {
                  break L31;
                } else {
                  if (qo.field_r.length >= param0) {
                    break L30;
                  } else {
                    break L31;
                  }
                }
              }
              qo.field_r = new int[2 * param0];
              break L30;
            }
            if (null == sg.field_kb) {
              L32: {
                L33: {
                  sg.field_kb = new int[param0 * 2];
                  if (null == jd.field_d) {
                    break L33;
                  } else {
                    if (jd.field_d.length >= param0) {
                      break L32;
                    } else {
                      break L33;
                    }
                  }
                }
                jd.field_d = new int[2 * param0];
                break L32;
              }
              L34: {
                L35: {
                  if (qp.field_b == null) {
                    break L35;
                  } else {
                    if (param0 > qp.field_b.length) {
                      break L35;
                    } else {
                      break L34;
                    }
                  }
                }
                qp.field_b = new int[param0 * 2];
                break L34;
              }
              L36: {
                L37: {
                  if (null == qd.field_c) {
                    break L37;
                  } else {
                    if (qd.field_c.length < param0 - -param2) {
                      break L37;
                    } else {
                      break L36;
                    }
                  }
                }
                qd.field_c = new int[(param0 + param2) * 2];
                break L36;
              }
              L38: {
                L39: {
                  if (ip.field_q == null) {
                    break L39;
                  } else {
                    if (param0 <= ip.field_q.length) {
                      break L38;
                    } else {
                      break L39;
                    }
                  }
                }
                ip.field_q = new boolean[2 * param0];
                break L38;
              }
              ub.field_d = -2147483648;
              if (param1) {
                qn.field_e = 0;
                fe.field_O = 2147483647;
                sg.field_pb = 2147483647;
                me.field_Db = -2147483648;
                return;
              } else {
                field_a = (vn[]) null;
                qn.field_e = 0;
                fe.field_O = 2147483647;
                sg.field_pb = 2147483647;
                me.field_Db = -2147483648;
                return;
              }
            } else {
              if (param0 <= sg.field_kb.length) {
                if (null == jd.field_d) {
                  L40: {
                    L41: {
                      jd.field_d = new int[2 * param0];
                      if (qp.field_b == null) {
                        break L41;
                      } else {
                        if (param0 > qp.field_b.length) {
                          break L41;
                        } else {
                          break L40;
                        }
                      }
                    }
                    qp.field_b = new int[param0 * 2];
                    break L40;
                  }
                  L42: {
                    L43: {
                      if (null == qd.field_c) {
                        break L43;
                      } else {
                        if (qd.field_c.length < param0 - -param2) {
                          break L43;
                        } else {
                          break L42;
                        }
                      }
                    }
                    qd.field_c = new int[(param0 + param2) * 2];
                    break L42;
                  }
                  L44: {
                    L45: {
                      if (ip.field_q == null) {
                        break L45;
                      } else {
                        if (param0 <= ip.field_q.length) {
                          break L44;
                        } else {
                          break L45;
                        }
                      }
                    }
                    ip.field_q = new boolean[2 * param0];
                    break L44;
                  }
                  ub.field_d = -2147483648;
                  if (param1) {
                    qn.field_e = 0;
                    fe.field_O = 2147483647;
                    sg.field_pb = 2147483647;
                    me.field_Db = -2147483648;
                    return;
                  } else {
                    field_a = (vn[]) null;
                    qn.field_e = 0;
                    fe.field_O = 2147483647;
                    sg.field_pb = 2147483647;
                    me.field_Db = -2147483648;
                    return;
                  }
                } else {
                  if (jd.field_d.length >= param0) {
                    L46: {
                      L47: {
                        if (qp.field_b == null) {
                          break L47;
                        } else {
                          if (param0 > qp.field_b.length) {
                            break L47;
                          } else {
                            break L46;
                          }
                        }
                      }
                      qp.field_b = new int[param0 * 2];
                      break L46;
                    }
                    L48: {
                      L49: {
                        if (null == qd.field_c) {
                          break L49;
                        } else {
                          if (qd.field_c.length < param0 - -param2) {
                            break L49;
                          } else {
                            break L48;
                          }
                        }
                      }
                      qd.field_c = new int[(param0 + param2) * 2];
                      break L48;
                    }
                    if (ip.field_q == null) {
                      ip.field_q = new boolean[2 * param0];
                      ub.field_d = -2147483648;
                      if (param1) {
                        qn.field_e = 0;
                        fe.field_O = 2147483647;
                        sg.field_pb = 2147483647;
                        me.field_Db = -2147483648;
                        return;
                      } else {
                        field_a = (vn[]) null;
                        qn.field_e = 0;
                        fe.field_O = 2147483647;
                        sg.field_pb = 2147483647;
                        me.field_Db = -2147483648;
                        return;
                      }
                    } else {
                      if (param0 <= ip.field_q.length) {
                        ub.field_d = -2147483648;
                        if (param1) {
                          qn.field_e = 0;
                          fe.field_O = 2147483647;
                          sg.field_pb = 2147483647;
                          me.field_Db = -2147483648;
                          return;
                        } else {
                          field_a = (vn[]) null;
                          qn.field_e = 0;
                          fe.field_O = 2147483647;
                          sg.field_pb = 2147483647;
                          me.field_Db = -2147483648;
                          return;
                        }
                      } else {
                        ip.field_q = new boolean[2 * param0];
                        ub.field_d = -2147483648;
                        if (param1) {
                          qn.field_e = 0;
                          fe.field_O = 2147483647;
                          sg.field_pb = 2147483647;
                          me.field_Db = -2147483648;
                          return;
                        } else {
                          field_a = (vn[]) null;
                          qn.field_e = 0;
                          fe.field_O = 2147483647;
                          sg.field_pb = 2147483647;
                          me.field_Db = -2147483648;
                          return;
                        }
                      }
                    }
                  } else {
                    L50: {
                      L51: {
                        jd.field_d = new int[2 * param0];
                        if (qp.field_b == null) {
                          break L51;
                        } else {
                          if (param0 > qp.field_b.length) {
                            break L51;
                          } else {
                            break L50;
                          }
                        }
                      }
                      qp.field_b = new int[param0 * 2];
                      break L50;
                    }
                    L52: {
                      L53: {
                        if (null == qd.field_c) {
                          break L53;
                        } else {
                          if (qd.field_c.length < param0 - -param2) {
                            break L53;
                          } else {
                            break L52;
                          }
                        }
                      }
                      qd.field_c = new int[(param0 + param2) * 2];
                      break L52;
                    }
                    L54: {
                      L55: {
                        if (ip.field_q == null) {
                          break L55;
                        } else {
                          if (param0 <= ip.field_q.length) {
                            break L54;
                          } else {
                            break L55;
                          }
                        }
                      }
                      ip.field_q = new boolean[2 * param0];
                      break L54;
                    }
                    ub.field_d = -2147483648;
                    if (param1) {
                      qn.field_e = 0;
                      fe.field_O = 2147483647;
                      sg.field_pb = 2147483647;
                      me.field_Db = -2147483648;
                      return;
                    } else {
                      field_a = (vn[]) null;
                      qn.field_e = 0;
                      fe.field_O = 2147483647;
                      sg.field_pb = 2147483647;
                      me.field_Db = -2147483648;
                      return;
                    }
                  }
                }
              } else {
                L56: {
                  L57: {
                    sg.field_kb = new int[param0 * 2];
                    if (null == jd.field_d) {
                      break L57;
                    } else {
                      if (jd.field_d.length >= param0) {
                        break L56;
                      } else {
                        break L57;
                      }
                    }
                  }
                  jd.field_d = new int[2 * param0];
                  break L56;
                }
                L58: {
                  L59: {
                    if (qp.field_b == null) {
                      break L59;
                    } else {
                      if (param0 > qp.field_b.length) {
                        break L59;
                      } else {
                        break L58;
                      }
                    }
                  }
                  qp.field_b = new int[param0 * 2];
                  break L58;
                }
                L60: {
                  L61: {
                    if (null == qd.field_c) {
                      break L61;
                    } else {
                      if (qd.field_c.length < param0 - -param2) {
                        break L61;
                      } else {
                        break L60;
                      }
                    }
                  }
                  qd.field_c = new int[(param0 + param2) * 2];
                  break L60;
                }
                L62: {
                  L63: {
                    if (ip.field_q == null) {
                      break L63;
                    } else {
                      if (param0 <= ip.field_q.length) {
                        break L62;
                      } else {
                        break L63;
                      }
                    }
                  }
                  ip.field_q = new boolean[2 * param0];
                  break L62;
                }
                ub.field_d = -2147483648;
                if (param1) {
                  qn.field_e = 0;
                  fe.field_O = 2147483647;
                  sg.field_pb = 2147483647;
                  me.field_Db = -2147483648;
                  return;
                } else {
                  field_a = (vn[]) null;
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
          L64: {
            L65: {
              dj.field_g = new int[2 * param0];
              if (qo.field_r == null) {
                break L65;
              } else {
                if (qo.field_r.length >= param0) {
                  break L64;
                } else {
                  break L65;
                }
              }
            }
            qo.field_r = new int[2 * param0];
            break L64;
          }
          if (null == sg.field_kb) {
            L66: {
              L67: {
                sg.field_kb = new int[param0 * 2];
                if (null == jd.field_d) {
                  break L67;
                } else {
                  if (jd.field_d.length >= param0) {
                    break L66;
                  } else {
                    break L67;
                  }
                }
              }
              jd.field_d = new int[2 * param0];
              break L66;
            }
            L68: {
              L69: {
                if (qp.field_b == null) {
                  break L69;
                } else {
                  if (param0 > qp.field_b.length) {
                    break L69;
                  } else {
                    break L68;
                  }
                }
              }
              qp.field_b = new int[param0 * 2];
              break L68;
            }
            L70: {
              L71: {
                if (null == qd.field_c) {
                  break L71;
                } else {
                  if (qd.field_c.length < param0 - -param2) {
                    break L71;
                  } else {
                    break L70;
                  }
                }
              }
              qd.field_c = new int[(param0 + param2) * 2];
              break L70;
            }
            L72: {
              L73: {
                if (ip.field_q == null) {
                  break L73;
                } else {
                  if (param0 <= ip.field_q.length) {
                    break L72;
                  } else {
                    break L73;
                  }
                }
              }
              ip.field_q = new boolean[2 * param0];
              break L72;
            }
            ub.field_d = -2147483648;
            if (param1) {
              qn.field_e = 0;
              fe.field_O = 2147483647;
              sg.field_pb = 2147483647;
              me.field_Db = -2147483648;
              return;
            } else {
              field_a = (vn[]) null;
              qn.field_e = 0;
              fe.field_O = 2147483647;
              sg.field_pb = 2147483647;
              me.field_Db = -2147483648;
              return;
            }
          } else {
            if (param0 <= sg.field_kb.length) {
              if (null == jd.field_d) {
                L74: {
                  L75: {
                    jd.field_d = new int[2 * param0];
                    if (qp.field_b == null) {
                      break L75;
                    } else {
                      if (param0 > qp.field_b.length) {
                        break L75;
                      } else {
                        break L74;
                      }
                    }
                  }
                  qp.field_b = new int[param0 * 2];
                  break L74;
                }
                L76: {
                  L77: {
                    if (null == qd.field_c) {
                      break L77;
                    } else {
                      if (qd.field_c.length < param0 - -param2) {
                        break L77;
                      } else {
                        break L76;
                      }
                    }
                  }
                  qd.field_c = new int[(param0 + param2) * 2];
                  break L76;
                }
                L78: {
                  L79: {
                    if (ip.field_q == null) {
                      break L79;
                    } else {
                      if (param0 <= ip.field_q.length) {
                        break L78;
                      } else {
                        break L79;
                      }
                    }
                  }
                  ip.field_q = new boolean[2 * param0];
                  break L78;
                }
                ub.field_d = -2147483648;
                if (param1) {
                  qn.field_e = 0;
                  fe.field_O = 2147483647;
                  sg.field_pb = 2147483647;
                  me.field_Db = -2147483648;
                  return;
                } else {
                  field_a = (vn[]) null;
                  qn.field_e = 0;
                  fe.field_O = 2147483647;
                  sg.field_pb = 2147483647;
                  me.field_Db = -2147483648;
                  return;
                }
              } else {
                if (jd.field_d.length >= param0) {
                  L80: {
                    L81: {
                      if (qp.field_b == null) {
                        break L81;
                      } else {
                        if (param0 > qp.field_b.length) {
                          break L81;
                        } else {
                          break L80;
                        }
                      }
                    }
                    qp.field_b = new int[param0 * 2];
                    break L80;
                  }
                  L82: {
                    L83: {
                      if (null == qd.field_c) {
                        break L83;
                      } else {
                        if (qd.field_c.length < param0 - -param2) {
                          break L83;
                        } else {
                          break L82;
                        }
                      }
                    }
                    qd.field_c = new int[(param0 + param2) * 2];
                    break L82;
                  }
                  if (ip.field_q == null) {
                    ip.field_q = new boolean[2 * param0];
                    ub.field_d = -2147483648;
                    if (param1) {
                      qn.field_e = 0;
                      fe.field_O = 2147483647;
                      sg.field_pb = 2147483647;
                      me.field_Db = -2147483648;
                      return;
                    } else {
                      field_a = (vn[]) null;
                      qn.field_e = 0;
                      fe.field_O = 2147483647;
                      sg.field_pb = 2147483647;
                      me.field_Db = -2147483648;
                      return;
                    }
                  } else {
                    if (param0 <= ip.field_q.length) {
                      ub.field_d = -2147483648;
                      if (param1) {
                        qn.field_e = 0;
                        fe.field_O = 2147483647;
                        sg.field_pb = 2147483647;
                        me.field_Db = -2147483648;
                        return;
                      } else {
                        field_a = (vn[]) null;
                        qn.field_e = 0;
                        fe.field_O = 2147483647;
                        sg.field_pb = 2147483647;
                        me.field_Db = -2147483648;
                        return;
                      }
                    } else {
                      ip.field_q = new boolean[2 * param0];
                      ub.field_d = -2147483648;
                      if (param1) {
                        qn.field_e = 0;
                        fe.field_O = 2147483647;
                        sg.field_pb = 2147483647;
                        me.field_Db = -2147483648;
                        return;
                      } else {
                        field_a = (vn[]) null;
                        qn.field_e = 0;
                        fe.field_O = 2147483647;
                        sg.field_pb = 2147483647;
                        me.field_Db = -2147483648;
                        return;
                      }
                    }
                  }
                } else {
                  L84: {
                    L85: {
                      jd.field_d = new int[2 * param0];
                      if (qp.field_b == null) {
                        break L85;
                      } else {
                        if (param0 > qp.field_b.length) {
                          break L85;
                        } else {
                          break L84;
                        }
                      }
                    }
                    qp.field_b = new int[param0 * 2];
                    break L84;
                  }
                  L86: {
                    L87: {
                      if (null == qd.field_c) {
                        break L87;
                      } else {
                        if (qd.field_c.length < param0 - -param2) {
                          break L87;
                        } else {
                          break L86;
                        }
                      }
                    }
                    qd.field_c = new int[(param0 + param2) * 2];
                    break L86;
                  }
                  L88: {
                    L89: {
                      if (ip.field_q == null) {
                        break L89;
                      } else {
                        if (param0 <= ip.field_q.length) {
                          break L88;
                        } else {
                          break L89;
                        }
                      }
                    }
                    ip.field_q = new boolean[2 * param0];
                    break L88;
                  }
                  ub.field_d = -2147483648;
                  if (param1) {
                    qn.field_e = 0;
                    fe.field_O = 2147483647;
                    sg.field_pb = 2147483647;
                    me.field_Db = -2147483648;
                    return;
                  } else {
                    field_a = (vn[]) null;
                    qn.field_e = 0;
                    fe.field_O = 2147483647;
                    sg.field_pb = 2147483647;
                    me.field_Db = -2147483648;
                    return;
                  }
                }
              }
            } else {
              L90: {
                L91: {
                  sg.field_kb = new int[param0 * 2];
                  if (null == jd.field_d) {
                    break L91;
                  } else {
                    if (jd.field_d.length >= param0) {
                      break L90;
                    } else {
                      break L91;
                    }
                  }
                }
                jd.field_d = new int[2 * param0];
                break L90;
              }
              L92: {
                L93: {
                  if (qp.field_b == null) {
                    break L93;
                  } else {
                    if (param0 > qp.field_b.length) {
                      break L93;
                    } else {
                      break L92;
                    }
                  }
                }
                qp.field_b = new int[param0 * 2];
                break L92;
              }
              L94: {
                L95: {
                  if (null == qd.field_c) {
                    break L95;
                  } else {
                    if (qd.field_c.length < param0 - -param2) {
                      break L95;
                    } else {
                      break L94;
                    }
                  }
                }
                qd.field_c = new int[(param0 + param2) * 2];
                break L94;
              }
              L96: {
                L97: {
                  if (ip.field_q == null) {
                    break L97;
                  } else {
                    if (param0 <= ip.field_q.length) {
                      break L96;
                    } else {
                      break L97;
                    }
                  }
                }
                ip.field_q = new boolean[2 * param0];
                break L96;
              }
              ub.field_d = -2147483648;
              if (param1) {
                qn.field_e = 0;
                fe.field_O = 2147483647;
                sg.field_pb = 2147483647;
                me.field_Db = -2147483648;
                return;
              } else {
                field_a = (vn[]) null;
                qn.field_e = 0;
                fe.field_O = 2147483647;
                sg.field_pb = 2147483647;
                me.field_Db = -2147483648;
                return;
              }
            }
          }
        }
    }

    public static void a(int param0) {
        int var1 = -81 / ((param0 - 37) / 47);
        field_d = null;
        field_a = null;
        field_b = null;
        field_c = null;
    }

    final static String a(int param0, long param1) {
        int var3 = 0;
        int var4 = 0;
        int var5 = 0;
        int var6 = 0;
        int var7 = 0;
        int var8 = 0;
        int var9 = 0;
        ni.field_d.setTime(new Date(param1));
        var3 = ni.field_d.get(7);
        var4 = ni.field_d.get(5);
        var5 = ni.field_d.get(2);
        if (param0 != 2147483647) {
          return (String) null;
        } else {
          var6 = ni.field_d.get(1);
          var7 = ni.field_d.get(11);
          var8 = ni.field_d.get(12);
          var9 = ni.field_d.get(13);
          return cn.field_e[-1 + var3] + ", " + var4 / 10 + var4 % 10 + "-" + ln.field_a[var5] + "-" + var6 + " " + var7 / 10 + var7 % 10 + ":" + var8 / 10 + var8 % 10 + ":" + var9 / 10 + var9 % 10 + " GMT";
        }
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
                  if ((var4.field_f ^ -1) == -2) {
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
            stackOut_9_0 = (RuntimeException) (var3);
            stackOut_9_1 = new StringBuilder().append("jb.G(").append(param0).append(',');
            stackIn_11_0 = stackOut_9_0;
            stackIn_11_1 = stackOut_9_1;
            stackIn_10_0 = stackOut_9_0;
            stackIn_10_1 = stackOut_9_1;
            if (param1 == null) {
              stackOut_11_0 = (RuntimeException) ((Object) stackIn_11_0);
              stackOut_11_1 = (StringBuilder) ((Object) stackIn_11_1);
              stackOut_11_2 = "null";
              stackIn_12_0 = stackOut_11_0;
              stackIn_12_1 = stackOut_11_1;
              stackIn_12_2 = stackOut_11_2;
              break L3;
            } else {
              stackOut_10_0 = (RuntimeException) ((Object) stackIn_10_0);
              stackOut_10_1 = (StringBuilder) ((Object) stackIn_10_1);
              stackOut_10_2 = "{...}";
              stackIn_12_0 = stackOut_10_0;
              stackIn_12_1 = stackOut_10_1;
              stackIn_12_2 = stackOut_10_2;
              break L3;
            }
          }
          L4: {
            stackOut_12_0 = (RuntimeException) ((Object) stackIn_12_0);
            stackOut_12_1 = ((StringBuilder) (Object) stackIn_12_1).append(stackIn_12_2).append(',');
            stackIn_14_0 = stackOut_12_0;
            stackIn_14_1 = stackOut_12_1;
            stackIn_13_0 = stackOut_12_0;
            stackIn_13_1 = stackOut_12_1;
            if (param2 == null) {
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
          throw sh.a((Throwable) ((Object) stackIn_15_0), stackIn_15_2 + ')');
        }
    }

    final static String a(byte param0) {
        if (2 <= ld.field_j) {
          if (f.field_i == null) {
            if (vo.field_d.a((byte) 73)) {
              if (vo.field_d.a(-1, "commonui")) {
                if (param0 < -49) {
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
                  return (String) null;
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
        if (param0 == 27) {
          if (Character.isISOControl(param1)) {
            return false;
          } else {
            if (!c.a(param1, 441)) {
              L0: {
                if (param1 == 45) {
                  break L0;
                } else {
                  if (160 == param1) {
                    break L0;
                  } else {
                    if (param1 == 32) {
                      break L0;
                    } else {
                      if (param1 == 95) {
                        break L0;
                      } else {
                        return false;
                      }
                    }
                  }
                }
              }
              return true;
            } else {
              return true;
            }
          }
        } else {
          jb.a(-97);
          if (Character.isISOControl(param1)) {
            return false;
          } else {
            if (!c.a(param1, 441)) {
              if (param1 != 45) {
                if (160 != param1) {
                  L1: {
                    if (param1 == 32) {
                      break L1;
                    } else {
                      if (param1 == 95) {
                        break L1;
                      } else {
                        return false;
                      }
                    }
                  }
                  return true;
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
    }

    static {
        field_d = "By clicking Create, you agree to the <%0><hotspot=0>Terms of Use</hotspot><%1> and <%0><hotspot=1>Privacy Policy</hotspot><%1>.";
        field_b = new vo();
        field_c = "Continue";
    }
}
