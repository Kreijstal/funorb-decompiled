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
          L1: {
            if (null == ti.field_j) {
              break L1;
            } else {
              if (ti.field_j.length >= param0) {
                break L0;
              } else {
                break L1;
              }
            }
          }
          ti.field_j = new int[param0 * 2];
          break L0;
        }
        if (g.field_u == null) {
          L2: {
            L3: {
              g.field_u = new int[2 * param0];
              if (ii.field_q == null) {
                break L3;
              } else {
                if (ii.field_q.length < param0) {
                  break L3;
                } else {
                  break L2;
                }
              }
            }
            ii.field_q = new int[2 * param0];
            break L2;
          }
          L4: {
            L5: {
              if (null == qf.field_a) {
                break L5;
              } else {
                if (qf.field_a.length < param0) {
                  break L5;
                } else {
                  break L4;
                }
              }
            }
            qf.field_a = new int[param0 * 2];
            break L4;
          }
          L6: {
            L7: {
              if (qi.field_b == null) {
                break L7;
              } else {
                if (param0 > qi.field_b.length) {
                  break L7;
                } else {
                  break L6;
                }
              }
            }
            qi.field_b = new int[param0 * 2];
            break L6;
          }
          L8: {
            L9: {
              if (null == va.field_e) {
                break L9;
              } else {
                if (va.field_e.length < param0) {
                  break L9;
                } else {
                  break L8;
                }
              }
            }
            va.field_e = new int[2 * param0];
            break L8;
          }
          L10: {
            L11: {
              if (null == lf.field_Y) {
                break L11;
              } else {
                if (lf.field_Y.length >= param0 - -param2) {
                  break L10;
                } else {
                  break L11;
                }
              }
            }
            lf.field_Y = new int[2 * (param2 + param0)];
            break L10;
          }
          if (param1 != -14032) {
            L12: {
              L13: {
                field_p = (mg[]) null;
                if (dc.field_r == null) {
                  break L13;
                } else {
                  if (dc.field_r.length < param0) {
                    break L13;
                  } else {
                    break L12;
                  }
                }
              }
              dc.field_r = new boolean[param0 * 2];
              break L12;
            }
            vi.field_d = -2147483648;
            oe.field_c = 0;
            fj.field_U = 2147483647;
            sd.field_b = -2147483648;
            mj.field_d = 2147483647;
            return;
          } else {
            L14: {
              L15: {
                if (dc.field_r == null) {
                  break L15;
                } else {
                  if (dc.field_r.length < param0) {
                    break L15;
                  } else {
                    break L14;
                  }
                }
              }
              dc.field_r = new boolean[param0 * 2];
              break L14;
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
            L16: {
              L17: {
                g.field_u = new int[2 * param0];
                if (ii.field_q == null) {
                  break L17;
                } else {
                  if (ii.field_q.length < param0) {
                    break L17;
                  } else {
                    break L16;
                  }
                }
              }
              ii.field_q = new int[2 * param0];
              break L16;
            }
            L18: {
              L19: {
                if (null == qf.field_a) {
                  break L19;
                } else {
                  if (qf.field_a.length < param0) {
                    break L19;
                  } else {
                    break L18;
                  }
                }
              }
              qf.field_a = new int[param0 * 2];
              break L18;
            }
            L20: {
              L21: {
                if (qi.field_b == null) {
                  break L21;
                } else {
                  if (param0 > qi.field_b.length) {
                    break L21;
                  } else {
                    break L20;
                  }
                }
              }
              qi.field_b = new int[param0 * 2];
              break L20;
            }
            L22: {
              L23: {
                if (null == va.field_e) {
                  break L23;
                } else {
                  if (va.field_e.length < param0) {
                    break L23;
                  } else {
                    break L22;
                  }
                }
              }
              va.field_e = new int[2 * param0];
              break L22;
            }
            if (null != lf.field_Y) {
              if (lf.field_Y.length >= param0 - -param2) {
                if (param1 != -14032) {
                  L24: {
                    L25: {
                      field_p = (mg[]) null;
                      if (dc.field_r == null) {
                        break L25;
                      } else {
                        if (dc.field_r.length < param0) {
                          break L25;
                        } else {
                          break L24;
                        }
                      }
                    }
                    dc.field_r = new boolean[param0 * 2];
                    break L24;
                  }
                  vi.field_d = -2147483648;
                  oe.field_c = 0;
                  fj.field_U = 2147483647;
                  sd.field_b = -2147483648;
                  mj.field_d = 2147483647;
                  return;
                } else {
                  L26: {
                    L27: {
                      if (dc.field_r == null) {
                        break L27;
                      } else {
                        if (dc.field_r.length < param0) {
                          break L27;
                        } else {
                          break L26;
                        }
                      }
                    }
                    dc.field_r = new boolean[param0 * 2];
                    break L26;
                  }
                  vi.field_d = -2147483648;
                  oe.field_c = 0;
                  fj.field_U = 2147483647;
                  sd.field_b = -2147483648;
                  mj.field_d = 2147483647;
                  return;
                }
              } else {
                L28: {
                  lf.field_Y = new int[2 * (param2 + param0)];
                  if (param1 == -14032) {
                    break L28;
                  } else {
                    field_p = (mg[]) null;
                    break L28;
                  }
                }
                L29: {
                  L30: {
                    if (dc.field_r == null) {
                      break L30;
                    } else {
                      if (dc.field_r.length < param0) {
                        break L30;
                      } else {
                        break L29;
                      }
                    }
                  }
                  dc.field_r = new boolean[param0 * 2];
                  break L29;
                }
                vi.field_d = -2147483648;
                oe.field_c = 0;
                fj.field_U = 2147483647;
                sd.field_b = -2147483648;
                mj.field_d = 2147483647;
                return;
              }
            } else {
              L31: {
                lf.field_Y = new int[2 * (param2 + param0)];
                if (param1 == -14032) {
                  break L31;
                } else {
                  field_p = (mg[]) null;
                  break L31;
                }
              }
              L32: {
                L33: {
                  if (dc.field_r == null) {
                    break L33;
                  } else {
                    if (dc.field_r.length < param0) {
                      break L33;
                    } else {
                      break L32;
                    }
                  }
                }
                dc.field_r = new boolean[param0 * 2];
                break L32;
              }
              vi.field_d = -2147483648;
              oe.field_c = 0;
              fj.field_U = 2147483647;
              sd.field_b = -2147483648;
              mj.field_d = 2147483647;
              return;
            }
          } else {
            L34: {
              L35: {
                if (ii.field_q == null) {
                  break L35;
                } else {
                  if (ii.field_q.length < param0) {
                    break L35;
                  } else {
                    break L34;
                  }
                }
              }
              ii.field_q = new int[2 * param0];
              break L34;
            }
            if (null != qf.field_a) {
              if (qf.field_a.length < param0) {
                L36: {
                  L37: {
                    qf.field_a = new int[param0 * 2];
                    if (qi.field_b == null) {
                      break L37;
                    } else {
                      if (param0 > qi.field_b.length) {
                        break L37;
                      } else {
                        break L36;
                      }
                    }
                  }
                  qi.field_b = new int[param0 * 2];
                  break L36;
                }
                L38: {
                  L39: {
                    if (null == va.field_e) {
                      break L39;
                    } else {
                      if (va.field_e.length < param0) {
                        break L39;
                      } else {
                        break L38;
                      }
                    }
                  }
                  va.field_e = new int[2 * param0];
                  break L38;
                }
                L40: {
                  L41: {
                    if (null == lf.field_Y) {
                      break L41;
                    } else {
                      if (lf.field_Y.length >= param0 - -param2) {
                        break L40;
                      } else {
                        break L41;
                      }
                    }
                  }
                  lf.field_Y = new int[2 * (param2 + param0)];
                  break L40;
                }
                L42: {
                  if (param1 == -14032) {
                    break L42;
                  } else {
                    field_p = (mg[]) null;
                    break L42;
                  }
                }
                L43: {
                  L44: {
                    if (dc.field_r == null) {
                      break L44;
                    } else {
                      if (dc.field_r.length < param0) {
                        break L44;
                      } else {
                        break L43;
                      }
                    }
                  }
                  dc.field_r = new boolean[param0 * 2];
                  break L43;
                }
                vi.field_d = -2147483648;
                oe.field_c = 0;
                fj.field_U = 2147483647;
                sd.field_b = -2147483648;
                mj.field_d = 2147483647;
                return;
              } else {
                L45: {
                  L46: {
                    if (qi.field_b == null) {
                      break L46;
                    } else {
                      if (param0 > qi.field_b.length) {
                        break L46;
                      } else {
                        break L45;
                      }
                    }
                  }
                  qi.field_b = new int[param0 * 2];
                  break L45;
                }
                L47: {
                  L48: {
                    if (null == va.field_e) {
                      break L48;
                    } else {
                      if (va.field_e.length < param0) {
                        break L48;
                      } else {
                        break L47;
                      }
                    }
                  }
                  va.field_e = new int[2 * param0];
                  break L47;
                }
                L49: {
                  L50: {
                    if (null == lf.field_Y) {
                      break L50;
                    } else {
                      if (lf.field_Y.length >= param0 - -param2) {
                        break L49;
                      } else {
                        break L50;
                      }
                    }
                  }
                  lf.field_Y = new int[2 * (param2 + param0)];
                  break L49;
                }
                L51: {
                  if (param1 == -14032) {
                    break L51;
                  } else {
                    field_p = (mg[]) null;
                    break L51;
                  }
                }
                L52: {
                  L53: {
                    if (dc.field_r == null) {
                      break L53;
                    } else {
                      if (dc.field_r.length < param0) {
                        break L53;
                      } else {
                        break L52;
                      }
                    }
                  }
                  dc.field_r = new boolean[param0 * 2];
                  break L52;
                }
                vi.field_d = -2147483648;
                oe.field_c = 0;
                fj.field_U = 2147483647;
                sd.field_b = -2147483648;
                mj.field_d = 2147483647;
                return;
              }
            } else {
              L54: {
                L55: {
                  qf.field_a = new int[param0 * 2];
                  if (qi.field_b == null) {
                    break L55;
                  } else {
                    if (param0 > qi.field_b.length) {
                      break L55;
                    } else {
                      break L54;
                    }
                  }
                }
                qi.field_b = new int[param0 * 2];
                break L54;
              }
              L56: {
                L57: {
                  if (null == va.field_e) {
                    break L57;
                  } else {
                    if (va.field_e.length < param0) {
                      break L57;
                    } else {
                      break L56;
                    }
                  }
                }
                va.field_e = new int[2 * param0];
                break L56;
              }
              L58: {
                L59: {
                  if (null == lf.field_Y) {
                    break L59;
                  } else {
                    if (lf.field_Y.length >= param0 - -param2) {
                      break L58;
                    } else {
                      break L59;
                    }
                  }
                }
                lf.field_Y = new int[2 * (param2 + param0)];
                break L58;
              }
              L60: {
                if (param1 == -14032) {
                  break L60;
                } else {
                  field_p = (mg[]) null;
                  break L60;
                }
              }
              L61: {
                L62: {
                  if (dc.field_r == null) {
                    break L62;
                  } else {
                    if (dc.field_r.length < param0) {
                      break L62;
                    } else {
                      break L61;
                    }
                  }
                }
                dc.field_r = new boolean[param0 * 2];
                break L61;
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
    }

    tk() {
        this.field_w = true;
    }

    static {
        field_u = null;
        field_s = "Account created successfully!";
        field_t = new ud();
        field_o = new char[128];
        field_r = null;
        field_p = new mg[17];
    }
}
