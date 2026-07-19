/*
 * Decompiled by CFR-JS 0.4.0.
 */
abstract class ud extends wf {
    static int field_g;
    static int[] field_e;
    static vd[] field_f;

    public static void a(boolean param0) {
        if (param0) {
            field_e = (int[]) null;
            field_e = null;
            field_f = null;
            return;
        }
        field_e = null;
        field_f = null;
    }

    final static void a(rh param0, int param1) {
        if (param1 >= -93) {
            return;
        }
        try {
            qn.field_b.a(param0.field_g);
        } catch (RuntimeException runtimeException) {
            throw pn.a((Throwable) ((Object) runtimeException), "ud.A(" + (param0 != null ? "{...}" : "null") + ',' + param1 + ')');
        }
    }

    ud(int param0, boolean param1) {
    }

    final static void a(int param0, int param1, int param2) {
        L0: {
          if (null == vs.field_b) {
            vs.field_b = new int[param0 * 2];
            break L0;
          } else {
            if (param0 > vs.field_b.length) {
              L1: {
                L2: {
                  vs.field_b = new int[param0 * 2];
                  if (null == js.field_c) {
                    break L2;
                  } else {
                    if (param0 <= js.field_c.length) {
                      break L1;
                    } else {
                      break L2;
                    }
                  }
                }
                js.field_c = new int[2 * param0];
                break L1;
              }
              L3: {
                L4: {
                  if (null == hg.field_C) {
                    break L4;
                  } else {
                    if (hg.field_C.length >= param0) {
                      break L3;
                    } else {
                      break L4;
                    }
                  }
                }
                hg.field_C = new int[param0 * 2];
                break L3;
              }
              L5: {
                L6: {
                  if (null == qd.field_p) {
                    break L6;
                  } else {
                    if (qd.field_p.length < param0) {
                      break L6;
                    } else {
                      break L5;
                    }
                  }
                }
                qd.field_p = new int[param0 * 2];
                break L5;
              }
              L7: {
                L8: {
                  if (null == dd.field_c) {
                    break L8;
                  } else {
                    if (param0 > dd.field_c.length) {
                      break L8;
                    } else {
                      break L7;
                    }
                  }
                }
                dd.field_c = new int[param0 * 2];
                break L7;
              }
              if (param2 == 2) {
                L9: {
                  L10: {
                    if (ai.field_a == null) {
                      break L10;
                    } else {
                      if (param0 > ai.field_a.length) {
                        break L10;
                      } else {
                        break L9;
                      }
                    }
                  }
                  ai.field_a = new int[param0 * 2];
                  break L9;
                }
                L11: {
                  L12: {
                    if (uf.field_d == null) {
                      break L12;
                    } else {
                      if (param1 + param0 > uf.field_d.length) {
                        break L12;
                      } else {
                        break L11;
                      }
                    }
                  }
                  uf.field_d = new int[2 * (param1 + param0)];
                  break L11;
                }
                L13: {
                  if (null == sg.field_a) {
                    break L13;
                  } else {
                    if (param0 <= sg.field_a.length) {
                      op.field_a = 2147483647;
                      ft.field_o = -2147483648;
                      nh.field_a = 2147483647;
                      os.field_w = 0;
                      fj.field_d = -2147483648;
                      return;
                    } else {
                      break L13;
                    }
                  }
                }
                sg.field_a = new boolean[2 * param0];
                op.field_a = 2147483647;
                ft.field_o = -2147483648;
                nh.field_a = 2147483647;
                os.field_w = 0;
                fj.field_d = -2147483648;
                return;
              } else {
                return;
              }
            } else {
              break L0;
            }
          }
        }
        if (null == js.field_c) {
          js.field_c = new int[2 * param0];
          if (null == hg.field_C) {
            L14: {
              L15: {
                hg.field_C = new int[param0 * 2];
                if (null == qd.field_p) {
                  break L15;
                } else {
                  if (qd.field_p.length < param0) {
                    break L15;
                  } else {
                    break L14;
                  }
                }
              }
              qd.field_p = new int[param0 * 2];
              break L14;
            }
            L16: {
              L17: {
                if (null == dd.field_c) {
                  break L17;
                } else {
                  if (param0 > dd.field_c.length) {
                    break L17;
                  } else {
                    break L16;
                  }
                }
              }
              dd.field_c = new int[param0 * 2];
              break L16;
            }
            if (param2 == 2) {
              L18: {
                L19: {
                  if (ai.field_a == null) {
                    break L19;
                  } else {
                    if (param0 > ai.field_a.length) {
                      break L19;
                    } else {
                      break L18;
                    }
                  }
                }
                ai.field_a = new int[param0 * 2];
                break L18;
              }
              L20: {
                L21: {
                  if (uf.field_d == null) {
                    break L21;
                  } else {
                    if (param1 + param0 > uf.field_d.length) {
                      break L21;
                    } else {
                      break L20;
                    }
                  }
                }
                uf.field_d = new int[2 * (param1 + param0)];
                break L20;
              }
              L22: {
                if (null == sg.field_a) {
                  break L22;
                } else {
                  if (param0 <= sg.field_a.length) {
                    op.field_a = 2147483647;
                    ft.field_o = -2147483648;
                    nh.field_a = 2147483647;
                    os.field_w = 0;
                    fj.field_d = -2147483648;
                    return;
                  } else {
                    break L22;
                  }
                }
              }
              sg.field_a = new boolean[2 * param0];
              op.field_a = 2147483647;
              ft.field_o = -2147483648;
              nh.field_a = 2147483647;
              os.field_w = 0;
              fj.field_d = -2147483648;
              return;
            } else {
              return;
            }
          } else {
            if (hg.field_C.length >= param0) {
              L23: {
                L24: {
                  if (null == qd.field_p) {
                    break L24;
                  } else {
                    if (qd.field_p.length < param0) {
                      break L24;
                    } else {
                      break L23;
                    }
                  }
                }
                qd.field_p = new int[param0 * 2];
                break L23;
              }
              L25: {
                L26: {
                  if (null == dd.field_c) {
                    break L26;
                  } else {
                    if (param0 > dd.field_c.length) {
                      break L26;
                    } else {
                      break L25;
                    }
                  }
                }
                dd.field_c = new int[param0 * 2];
                break L25;
              }
              if (param2 == 2) {
                L27: {
                  L28: {
                    if (ai.field_a == null) {
                      break L28;
                    } else {
                      if (param0 > ai.field_a.length) {
                        break L28;
                      } else {
                        break L27;
                      }
                    }
                  }
                  ai.field_a = new int[param0 * 2];
                  break L27;
                }
                L29: {
                  L30: {
                    if (uf.field_d == null) {
                      break L30;
                    } else {
                      if (param1 + param0 > uf.field_d.length) {
                        break L30;
                      } else {
                        break L29;
                      }
                    }
                  }
                  uf.field_d = new int[2 * (param1 + param0)];
                  break L29;
                }
                if (null == sg.field_a) {
                  sg.field_a = new boolean[2 * param0];
                  op.field_a = 2147483647;
                  ft.field_o = -2147483648;
                  nh.field_a = 2147483647;
                  os.field_w = 0;
                  fj.field_d = -2147483648;
                  return;
                } else {
                  if (param0 > sg.field_a.length) {
                    sg.field_a = new boolean[2 * param0];
                    op.field_a = 2147483647;
                    ft.field_o = -2147483648;
                    nh.field_a = 2147483647;
                    os.field_w = 0;
                    fj.field_d = -2147483648;
                    return;
                  } else {
                    op.field_a = 2147483647;
                    ft.field_o = -2147483648;
                    nh.field_a = 2147483647;
                    os.field_w = 0;
                    fj.field_d = -2147483648;
                    return;
                  }
                }
              } else {
                return;
              }
            } else {
              L31: {
                L32: {
                  hg.field_C = new int[param0 * 2];
                  if (null == qd.field_p) {
                    break L32;
                  } else {
                    if (qd.field_p.length < param0) {
                      break L32;
                    } else {
                      break L31;
                    }
                  }
                }
                qd.field_p = new int[param0 * 2];
                break L31;
              }
              L33: {
                L34: {
                  if (null == dd.field_c) {
                    break L34;
                  } else {
                    if (param0 > dd.field_c.length) {
                      break L34;
                    } else {
                      break L33;
                    }
                  }
                }
                dd.field_c = new int[param0 * 2];
                break L33;
              }
              if (param2 == 2) {
                L35: {
                  L36: {
                    if (ai.field_a == null) {
                      break L36;
                    } else {
                      if (param0 > ai.field_a.length) {
                        break L36;
                      } else {
                        break L35;
                      }
                    }
                  }
                  ai.field_a = new int[param0 * 2];
                  break L35;
                }
                L37: {
                  L38: {
                    if (uf.field_d == null) {
                      break L38;
                    } else {
                      if (param1 + param0 > uf.field_d.length) {
                        break L38;
                      } else {
                        break L37;
                      }
                    }
                  }
                  uf.field_d = new int[2 * (param1 + param0)];
                  break L37;
                }
                L39: {
                  if (null == sg.field_a) {
                    break L39;
                  } else {
                    if (param0 <= sg.field_a.length) {
                      op.field_a = 2147483647;
                      ft.field_o = -2147483648;
                      nh.field_a = 2147483647;
                      os.field_w = 0;
                      fj.field_d = -2147483648;
                      return;
                    } else {
                      break L39;
                    }
                  }
                }
                sg.field_a = new boolean[2 * param0];
                op.field_a = 2147483647;
                ft.field_o = -2147483648;
                nh.field_a = 2147483647;
                os.field_w = 0;
                fj.field_d = -2147483648;
                return;
              } else {
                return;
              }
            }
          }
        } else {
          if (param0 <= js.field_c.length) {
            if (null == hg.field_C) {
              L40: {
                L41: {
                  hg.field_C = new int[param0 * 2];
                  if (null == qd.field_p) {
                    break L41;
                  } else {
                    if (qd.field_p.length < param0) {
                      break L41;
                    } else {
                      break L40;
                    }
                  }
                }
                qd.field_p = new int[param0 * 2];
                break L40;
              }
              L42: {
                L43: {
                  if (null == dd.field_c) {
                    break L43;
                  } else {
                    if (param0 > dd.field_c.length) {
                      break L43;
                    } else {
                      break L42;
                    }
                  }
                }
                dd.field_c = new int[param0 * 2];
                break L42;
              }
              if (param2 == 2) {
                L44: {
                  L45: {
                    if (ai.field_a == null) {
                      break L45;
                    } else {
                      if (param0 > ai.field_a.length) {
                        break L45;
                      } else {
                        break L44;
                      }
                    }
                  }
                  ai.field_a = new int[param0 * 2];
                  break L44;
                }
                L46: {
                  L47: {
                    if (uf.field_d == null) {
                      break L47;
                    } else {
                      if (param1 + param0 > uf.field_d.length) {
                        break L47;
                      } else {
                        break L46;
                      }
                    }
                  }
                  uf.field_d = new int[2 * (param1 + param0)];
                  break L46;
                }
                if (null == sg.field_a) {
                  sg.field_a = new boolean[2 * param0];
                  op.field_a = 2147483647;
                  ft.field_o = -2147483648;
                  nh.field_a = 2147483647;
                  os.field_w = 0;
                  fj.field_d = -2147483648;
                  return;
                } else {
                  if (param0 > sg.field_a.length) {
                    sg.field_a = new boolean[2 * param0];
                    op.field_a = 2147483647;
                    ft.field_o = -2147483648;
                    nh.field_a = 2147483647;
                    os.field_w = 0;
                    fj.field_d = -2147483648;
                    return;
                  } else {
                    op.field_a = 2147483647;
                    ft.field_o = -2147483648;
                    nh.field_a = 2147483647;
                    os.field_w = 0;
                    fj.field_d = -2147483648;
                    return;
                  }
                }
              } else {
                return;
              }
            } else {
              if (hg.field_C.length >= param0) {
                L48: {
                  L49: {
                    if (null == qd.field_p) {
                      break L49;
                    } else {
                      if (qd.field_p.length < param0) {
                        break L49;
                      } else {
                        break L48;
                      }
                    }
                  }
                  qd.field_p = new int[param0 * 2];
                  break L48;
                }
                L50: {
                  L51: {
                    if (null == dd.field_c) {
                      break L51;
                    } else {
                      if (param0 > dd.field_c.length) {
                        break L51;
                      } else {
                        break L50;
                      }
                    }
                  }
                  dd.field_c = new int[param0 * 2];
                  break L50;
                }
                if (param2 == 2) {
                  L52: {
                    L53: {
                      if (ai.field_a == null) {
                        break L53;
                      } else {
                        if (param0 > ai.field_a.length) {
                          break L53;
                        } else {
                          break L52;
                        }
                      }
                    }
                    ai.field_a = new int[param0 * 2];
                    break L52;
                  }
                  L54: {
                    L55: {
                      if (uf.field_d == null) {
                        break L55;
                      } else {
                        if (param1 + param0 > uf.field_d.length) {
                          break L55;
                        } else {
                          break L54;
                        }
                      }
                    }
                    uf.field_d = new int[2 * (param1 + param0)];
                    break L54;
                  }
                  if (null == sg.field_a) {
                    sg.field_a = new boolean[2 * param0];
                    op.field_a = 2147483647;
                    ft.field_o = -2147483648;
                    nh.field_a = 2147483647;
                    os.field_w = 0;
                    fj.field_d = -2147483648;
                    return;
                  } else {
                    if (param0 > sg.field_a.length) {
                      sg.field_a = new boolean[2 * param0];
                      op.field_a = 2147483647;
                      ft.field_o = -2147483648;
                      nh.field_a = 2147483647;
                      os.field_w = 0;
                      fj.field_d = -2147483648;
                      return;
                    } else {
                      op.field_a = 2147483647;
                      ft.field_o = -2147483648;
                      nh.field_a = 2147483647;
                      os.field_w = 0;
                      fj.field_d = -2147483648;
                      return;
                    }
                  }
                } else {
                  return;
                }
              } else {
                L56: {
                  L57: {
                    hg.field_C = new int[param0 * 2];
                    if (null == qd.field_p) {
                      break L57;
                    } else {
                      if (qd.field_p.length < param0) {
                        break L57;
                      } else {
                        break L56;
                      }
                    }
                  }
                  qd.field_p = new int[param0 * 2];
                  break L56;
                }
                L58: {
                  L59: {
                    if (null == dd.field_c) {
                      break L59;
                    } else {
                      if (param0 > dd.field_c.length) {
                        break L59;
                      } else {
                        break L58;
                      }
                    }
                  }
                  dd.field_c = new int[param0 * 2];
                  break L58;
                }
                if (param2 == 2) {
                  L60: {
                    L61: {
                      if (ai.field_a == null) {
                        break L61;
                      } else {
                        if (param0 > ai.field_a.length) {
                          break L61;
                        } else {
                          break L60;
                        }
                      }
                    }
                    ai.field_a = new int[param0 * 2];
                    break L60;
                  }
                  L62: {
                    L63: {
                      if (uf.field_d == null) {
                        break L63;
                      } else {
                        if (param1 + param0 > uf.field_d.length) {
                          break L63;
                        } else {
                          break L62;
                        }
                      }
                    }
                    uf.field_d = new int[2 * (param1 + param0)];
                    break L62;
                  }
                  if (null == sg.field_a) {
                    sg.field_a = new boolean[2 * param0];
                    op.field_a = 2147483647;
                    ft.field_o = -2147483648;
                    nh.field_a = 2147483647;
                    os.field_w = 0;
                    fj.field_d = -2147483648;
                    return;
                  } else {
                    if (param0 > sg.field_a.length) {
                      sg.field_a = new boolean[2 * param0];
                      op.field_a = 2147483647;
                      ft.field_o = -2147483648;
                      nh.field_a = 2147483647;
                      os.field_w = 0;
                      fj.field_d = -2147483648;
                      return;
                    } else {
                      op.field_a = 2147483647;
                      ft.field_o = -2147483648;
                      nh.field_a = 2147483647;
                      os.field_w = 0;
                      fj.field_d = -2147483648;
                      return;
                    }
                  }
                } else {
                  return;
                }
              }
            }
          } else {
            L64: {
              L65: {
                js.field_c = new int[2 * param0];
                if (null == hg.field_C) {
                  break L65;
                } else {
                  if (hg.field_C.length >= param0) {
                    break L64;
                  } else {
                    break L65;
                  }
                }
              }
              hg.field_C = new int[param0 * 2];
              break L64;
            }
            L66: {
              L67: {
                if (null == qd.field_p) {
                  break L67;
                } else {
                  if (qd.field_p.length < param0) {
                    break L67;
                  } else {
                    break L66;
                  }
                }
              }
              qd.field_p = new int[param0 * 2];
              break L66;
            }
            L68: {
              L69: {
                if (null == dd.field_c) {
                  break L69;
                } else {
                  if (param0 > dd.field_c.length) {
                    break L69;
                  } else {
                    break L68;
                  }
                }
              }
              dd.field_c = new int[param0 * 2];
              break L68;
            }
            if (param2 == 2) {
              L70: {
                L71: {
                  if (ai.field_a == null) {
                    break L71;
                  } else {
                    if (param0 > ai.field_a.length) {
                      break L71;
                    } else {
                      break L70;
                    }
                  }
                }
                ai.field_a = new int[param0 * 2];
                break L70;
              }
              if (uf.field_d != null) {
                if (param1 + param0 <= uf.field_d.length) {
                  if (null == sg.field_a) {
                    sg.field_a = new boolean[2 * param0];
                    op.field_a = 2147483647;
                    ft.field_o = -2147483648;
                    nh.field_a = 2147483647;
                    os.field_w = 0;
                    fj.field_d = -2147483648;
                    return;
                  } else {
                    if (param0 > sg.field_a.length) {
                      sg.field_a = new boolean[2 * param0];
                      op.field_a = 2147483647;
                      ft.field_o = -2147483648;
                      nh.field_a = 2147483647;
                      os.field_w = 0;
                      fj.field_d = -2147483648;
                      return;
                    } else {
                      op.field_a = 2147483647;
                      ft.field_o = -2147483648;
                      nh.field_a = 2147483647;
                      os.field_w = 0;
                      fj.field_d = -2147483648;
                      return;
                    }
                  }
                } else {
                  L72: {
                    uf.field_d = new int[2 * (param1 + param0)];
                    if (null == sg.field_a) {
                      break L72;
                    } else {
                      if (param0 <= sg.field_a.length) {
                        op.field_a = 2147483647;
                        ft.field_o = -2147483648;
                        nh.field_a = 2147483647;
                        os.field_w = 0;
                        fj.field_d = -2147483648;
                        return;
                      } else {
                        break L72;
                      }
                    }
                  }
                  sg.field_a = new boolean[2 * param0];
                  op.field_a = 2147483647;
                  ft.field_o = -2147483648;
                  nh.field_a = 2147483647;
                  os.field_w = 0;
                  fj.field_d = -2147483648;
                  return;
                }
              } else {
                L73: {
                  uf.field_d = new int[2 * (param1 + param0)];
                  if (null == sg.field_a) {
                    break L73;
                  } else {
                    if (param0 <= sg.field_a.length) {
                      op.field_a = 2147483647;
                      ft.field_o = -2147483648;
                      nh.field_a = 2147483647;
                      os.field_w = 0;
                      fj.field_d = -2147483648;
                      return;
                    } else {
                      break L73;
                    }
                  }
                }
                sg.field_a = new boolean[2 * param0];
                op.field_a = 2147483647;
                ft.field_o = -2147483648;
                nh.field_a = 2147483647;
                os.field_w = 0;
                fj.field_d = -2147483648;
                return;
              }
            } else {
              return;
            }
          }
        }
    }

    static {
    }
}
