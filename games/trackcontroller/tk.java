/*
 * Decompiled by CFR-JS 0.4.0.
 */
abstract class tk extends gb {
    boolean field_q;
    volatile boolean field_w;
    static gf field_u;
    static ud field_t;
    static String field_s;
    boolean field_v;
    static String field_r;
    static char[] field_o;
    static mg[] field_p;

    abstract byte[] g(int param0);

    public static void f(int param0) {
        field_t = null;
        if (param0 <= 13) {
          tk.f(103);
          field_o = null;
          field_u = null;
          field_r = null;
          field_p = null;
          field_s = null;
          return;
        } else {
          field_o = null;
          field_u = null;
          field_r = null;
          field_p = null;
          field_s = null;
          return;
        }
    }

    abstract int a(byte param0);

    final static void a(int param0, int param1, int param2) {
        L0: {
          if (null == ti.field_j) {
            break L0;
          } else {
            if (ti.field_j.length >= param0) {
              if (g.field_u == null) {
                L1: {
                  L2: {
                    g.field_u = new int[2 * param0];
                    if (ii.field_q == null) {
                      break L2;
                    } else {
                      if (ii.field_q.length < param0) {
                        break L2;
                      } else {
                        break L1;
                      }
                    }
                  }
                  ii.field_q = new int[2 * param0];
                  break L1;
                }
                L3: {
                  L4: {
                    if (null == qf.field_a) {
                      break L4;
                    } else {
                      if (qf.field_a.length < param0) {
                        break L4;
                      } else {
                        break L3;
                      }
                    }
                  }
                  qf.field_a = new int[param0 * 2];
                  break L3;
                }
                L5: {
                  L6: {
                    if (qi.field_b == null) {
                      break L6;
                    } else {
                      if (param0 > qi.field_b.length) {
                        break L6;
                      } else {
                        break L5;
                      }
                    }
                  }
                  qi.field_b = new int[param0 * 2];
                  break L5;
                }
                L7: {
                  L8: {
                    if (null == va.field_e) {
                      break L8;
                    } else {
                      if (va.field_e.length < param0) {
                        break L8;
                      } else {
                        break L7;
                      }
                    }
                  }
                  va.field_e = new int[2 * param0];
                  break L7;
                }
                if (null != lf.field_Y) {
                  if (lf.field_Y.length < param0 - -param2) {
                    L9: {
                      L10: {
                        lf.field_Y = new int[2 * (param2 + param0)];
                        if (dc.field_r == null) {
                          break L10;
                        } else {
                          if (dc.field_r.length < param0) {
                            break L10;
                          } else {
                            break L9;
                          }
                        }
                      }
                      dc.field_r = new boolean[param0 * 2];
                      break L9;
                    }
                    vi.field_d = -2147483648;
                    oe.field_c = 0;
                    fj.field_U = 2147483647;
                    sd.field_b = -2147483648;
                    mj.field_d = 2147483647;
                    return;
                  } else {
                    L11: {
                      L12: {
                        if (dc.field_r == null) {
                          break L12;
                        } else {
                          if (dc.field_r.length < param0) {
                            break L12;
                          } else {
                            break L11;
                          }
                        }
                      }
                      dc.field_r = new boolean[param0 * 2];
                      break L11;
                    }
                    vi.field_d = -2147483648;
                    oe.field_c = 0;
                    fj.field_U = 2147483647;
                    sd.field_b = -2147483648;
                    mj.field_d = 2147483647;
                    return;
                  }
                } else {
                  L13: {
                    L14: {
                      lf.field_Y = new int[2 * (param2 + param0)];
                      if (dc.field_r == null) {
                        break L14;
                      } else {
                        if (dc.field_r.length < param0) {
                          break L14;
                        } else {
                          break L13;
                        }
                      }
                    }
                    dc.field_r = new boolean[param0 * 2];
                    break L13;
                  }
                  vi.field_d = -2147483648;
                  oe.field_c = 0;
                  fj.field_U = 2147483647;
                  sd.field_b = -2147483648;
                  mj.field_d = 2147483647;
                  return;
                }
              } else {
                if (g.field_u.length < param0) {
                  L15: {
                    L16: {
                      g.field_u = new int[2 * param0];
                      if (ii.field_q == null) {
                        break L16;
                      } else {
                        if (ii.field_q.length < param0) {
                          break L16;
                        } else {
                          break L15;
                        }
                      }
                    }
                    ii.field_q = new int[2 * param0];
                    break L15;
                  }
                  L17: {
                    L18: {
                      if (null == qf.field_a) {
                        break L18;
                      } else {
                        if (qf.field_a.length < param0) {
                          break L18;
                        } else {
                          break L17;
                        }
                      }
                    }
                    qf.field_a = new int[param0 * 2];
                    break L17;
                  }
                  L19: {
                    L20: {
                      if (qi.field_b == null) {
                        break L20;
                      } else {
                        if (param0 > qi.field_b.length) {
                          break L20;
                        } else {
                          break L19;
                        }
                      }
                    }
                    qi.field_b = new int[param0 * 2];
                    break L19;
                  }
                  L21: {
                    L22: {
                      if (null == va.field_e) {
                        break L22;
                      } else {
                        if (va.field_e.length < param0) {
                          break L22;
                        } else {
                          break L21;
                        }
                      }
                    }
                    va.field_e = new int[2 * param0];
                    break L21;
                  }
                  if (null != lf.field_Y) {
                    if (lf.field_Y.length < param0 - -param2) {
                      L23: {
                        L24: {
                          lf.field_Y = new int[2 * (param2 + param0)];
                          if (dc.field_r == null) {
                            break L24;
                          } else {
                            if (dc.field_r.length < param0) {
                              break L24;
                            } else {
                              break L23;
                            }
                          }
                        }
                        dc.field_r = new boolean[param0 * 2];
                        break L23;
                      }
                      vi.field_d = -2147483648;
                      oe.field_c = 0;
                      fj.field_U = 2147483647;
                      sd.field_b = -2147483648;
                      mj.field_d = 2147483647;
                      return;
                    } else {
                      L25: {
                        L26: {
                          if (dc.field_r == null) {
                            break L26;
                          } else {
                            if (dc.field_r.length < param0) {
                              break L26;
                            } else {
                              break L25;
                            }
                          }
                        }
                        dc.field_r = new boolean[param0 * 2];
                        break L25;
                      }
                      vi.field_d = -2147483648;
                      oe.field_c = 0;
                      fj.field_U = 2147483647;
                      sd.field_b = -2147483648;
                      mj.field_d = 2147483647;
                      return;
                    }
                  } else {
                    L27: {
                      L28: {
                        lf.field_Y = new int[2 * (param2 + param0)];
                        if (dc.field_r == null) {
                          break L28;
                        } else {
                          if (dc.field_r.length < param0) {
                            break L28;
                          } else {
                            break L27;
                          }
                        }
                      }
                      dc.field_r = new boolean[param0 * 2];
                      break L27;
                    }
                    vi.field_d = -2147483648;
                    oe.field_c = 0;
                    fj.field_U = 2147483647;
                    sd.field_b = -2147483648;
                    mj.field_d = 2147483647;
                    return;
                  }
                } else {
                  L29: {
                    L30: {
                      if (ii.field_q == null) {
                        break L30;
                      } else {
                        if (ii.field_q.length < param0) {
                          break L30;
                        } else {
                          break L29;
                        }
                      }
                    }
                    ii.field_q = new int[2 * param0];
                    break L29;
                  }
                  L31: {
                    L32: {
                      if (null == qf.field_a) {
                        break L32;
                      } else {
                        if (qf.field_a.length < param0) {
                          break L32;
                        } else {
                          break L31;
                        }
                      }
                    }
                    qf.field_a = new int[param0 * 2];
                    break L31;
                  }
                  L33: {
                    L34: {
                      if (qi.field_b == null) {
                        break L34;
                      } else {
                        if (param0 > qi.field_b.length) {
                          break L34;
                        } else {
                          break L33;
                        }
                      }
                    }
                    qi.field_b = new int[param0 * 2];
                    break L33;
                  }
                  L35: {
                    L36: {
                      if (null == va.field_e) {
                        break L36;
                      } else {
                        if (va.field_e.length < param0) {
                          break L36;
                        } else {
                          break L35;
                        }
                      }
                    }
                    va.field_e = new int[2 * param0];
                    break L35;
                  }
                  if (null != lf.field_Y) {
                    if (lf.field_Y.length < param0 - -param2) {
                      L37: {
                        L38: {
                          lf.field_Y = new int[2 * (param2 + param0)];
                          if (dc.field_r == null) {
                            break L38;
                          } else {
                            if (dc.field_r.length < param0) {
                              break L38;
                            } else {
                              break L37;
                            }
                          }
                        }
                        dc.field_r = new boolean[param0 * 2];
                        break L37;
                      }
                      vi.field_d = -2147483648;
                      oe.field_c = 0;
                      fj.field_U = 2147483647;
                      sd.field_b = -2147483648;
                      mj.field_d = 2147483647;
                      return;
                    } else {
                      L39: {
                        L40: {
                          if (dc.field_r == null) {
                            break L40;
                          } else {
                            if (dc.field_r.length < param0) {
                              break L40;
                            } else {
                              break L39;
                            }
                          }
                        }
                        dc.field_r = new boolean[param0 * 2];
                        break L39;
                      }
                      vi.field_d = -2147483648;
                      oe.field_c = 0;
                      fj.field_U = 2147483647;
                      sd.field_b = -2147483648;
                      mj.field_d = 2147483647;
                      return;
                    }
                  } else {
                    L41: {
                      L42: {
                        lf.field_Y = new int[2 * (param2 + param0)];
                        if (dc.field_r == null) {
                          break L42;
                        } else {
                          if (dc.field_r.length < param0) {
                            break L42;
                          } else {
                            break L41;
                          }
                        }
                      }
                      dc.field_r = new boolean[param0 * 2];
                      break L41;
                    }
                    vi.field_d = -2147483648;
                    oe.field_c = 0;
                    fj.field_U = 2147483647;
                    sd.field_b = -2147483648;
                    mj.field_d = 2147483647;
                    return;
                  }
                }
              }
            } else {
              break L0;
            }
          }
        }
        L43: {
          L44: {
            ti.field_j = new int[param0 * 2];
            if (g.field_u == null) {
              break L44;
            } else {
              if (g.field_u.length < param0) {
                break L44;
              } else {
                break L43;
              }
            }
          }
          g.field_u = new int[2 * param0];
          break L43;
        }
        L45: {
          L46: {
            if (ii.field_q == null) {
              break L46;
            } else {
              if (ii.field_q.length < param0) {
                break L46;
              } else {
                break L45;
              }
            }
          }
          ii.field_q = new int[2 * param0];
          break L45;
        }
        L47: {
          L48: {
            if (null == qf.field_a) {
              break L48;
            } else {
              if (qf.field_a.length < param0) {
                break L48;
              } else {
                break L47;
              }
            }
          }
          qf.field_a = new int[param0 * 2];
          break L47;
        }
        L49: {
          L50: {
            if (qi.field_b == null) {
              break L50;
            } else {
              if (param0 > qi.field_b.length) {
                break L50;
              } else {
                break L49;
              }
            }
          }
          qi.field_b = new int[param0 * 2];
          break L49;
        }
        L51: {
          L52: {
            if (null == va.field_e) {
              break L52;
            } else {
              if (va.field_e.length < param0) {
                break L52;
              } else {
                break L51;
              }
            }
          }
          va.field_e = new int[2 * param0];
          break L51;
        }
        if (null != lf.field_Y) {
          if (lf.field_Y.length >= param0 - -param2) {
            L53: {
              L54: {
                if (dc.field_r == null) {
                  break L54;
                } else {
                  if (dc.field_r.length < param0) {
                    break L54;
                  } else {
                    break L53;
                  }
                }
              }
              dc.field_r = new boolean[param0 * 2];
              break L53;
            }
            vi.field_d = -2147483648;
            oe.field_c = 0;
            fj.field_U = 2147483647;
            sd.field_b = -2147483648;
            mj.field_d = 2147483647;
            return;
          } else {
            L55: {
              L56: {
                lf.field_Y = new int[2 * (param2 + param0)];
                if (dc.field_r == null) {
                  break L56;
                } else {
                  if (dc.field_r.length < param0) {
                    break L56;
                  } else {
                    break L55;
                  }
                }
              }
              dc.field_r = new boolean[param0 * 2];
              break L55;
            }
            vi.field_d = -2147483648;
            oe.field_c = 0;
            fj.field_U = 2147483647;
            sd.field_b = -2147483648;
            mj.field_d = 2147483647;
            return;
          }
        } else {
          L57: {
            L58: {
              lf.field_Y = new int[2 * (param2 + param0)];
              if (dc.field_r == null) {
                break L58;
              } else {
                if (dc.field_r.length < param0) {
                  break L58;
                } else {
                  break L57;
                }
              }
            }
            dc.field_r = new boolean[param0 * 2];
            break L57;
          }
          vi.field_d = -2147483648;
          oe.field_c = 0;
          fj.field_U = 2147483647;
          sd.field_b = -2147483648;
          mj.field_d = 2147483647;
          return;
        }
    }

    tk() {
        ((tk) this).field_w = true;
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_u = null;
        field_s = "Account created successfully!";
        field_t = new ud();
        field_o = new char[128];
        field_r = null;
        field_p = new mg[17];
    }
}
