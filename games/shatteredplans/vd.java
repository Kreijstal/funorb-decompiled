/*
 * Decompiled by CFR-JS 0.4.0.
 */
class vd extends oh {
    static pf field_j;
    static String field_n;
    static String field_r;
    int field_t;
    boolean field_s;
    Object field_h;
    int field_k;
    int field_m;
    int field_i;
    String field_o;
    pf field_l;
    boolean field_p;
    static qr field_q;

    final void d(int param0, int param1, int param2) {
        int var5 = 0;
        Object var6 = null;
        vd var6_ref = null;
        var6 = null;
        var5 = ShatteredPlansClient.field_F ? 1 : 0;
        if (param1 == 0) {
          if (0 == param0) {
            return;
          } else {
            ((vd) this).field_k = ((vd) this).field_k + param1;
            ((vd) this).field_t = ((vd) this).field_t + param0;
            var6_ref = (vd) (Object) var6_ref.field_l.d(param2);
            L0: while (true) {
              if (var6_ref == null) {
                return;
              } else {
                var6_ref.d(param0, param1, 0);
                var6_ref = (vd) (Object) var6_ref.field_l.a((byte) -71);
                continue L0;
              }
            }
          }
        } else {
          ((vd) this).field_k = ((vd) this).field_k + param1;
          ((vd) this).field_t = ((vd) this).field_t + param0;
          var6_ref = (vd) (Object) ((vd) this).field_l.d(param2);
          L1: while (true) {
            if (var6_ref == null) {
              return;
            } else {
              var6_ref.d(param0, param1, 0);
              var6_ref = (vd) (Object) var6_ref.field_l.a((byte) -71);
              continue L1;
            }
          }
        }
    }

    void e(int param0) {
        int var3 = ShatteredPlansClient.field_F ? 1 : 0;
        vd var4 = (vd) (Object) ((vd) this).field_l.d(param0 ^ param0);
        while (var4 != null) {
            var4.b((byte) -69);
            var4 = (vd) (Object) var4.field_l.a((byte) -71);
        }
    }

    final boolean a(byte param0, vd param1) {
        int var4 = 0;
        int var5 = 0;
        vd var6 = null;
        var5 = ShatteredPlansClient.field_F ? 1 : 0;
        if (this != (Object) (Object) param1) {
          var4 = -85 / ((-63 - param0) / 47);
          var6 = (vd) (Object) ((vd) this).field_l.d(0);
          L0: while (true) {
            if (var6 != null) {
              if (var6.a((byte) -125, param1)) {
                return true;
              } else {
                var6 = (vd) (Object) var6.field_l.a((byte) -71);
                continue L0;
              }
            } else {
              return false;
            }
          }
        } else {
          return true;
        }
    }

    final boolean c(int param0, int param1, int param2) {
        int stackIn_11_0 = 0;
        int stackIn_18_0 = 0;
        int stackOut_16_0 = 0;
        int stackOut_17_0 = 0;
        int stackOut_9_0 = 0;
        int stackOut_10_0 = 0;
        if (((vd) this).field_p) {
          if (((vd) this).field_s) {
            param0 = param0 - ((vd) this).field_t;
            param1 = param1 - ((vd) this).field_k;
            if (param2 != 0) {
              L0: {
                L1: {
                  vd.d(-118);
                  if (0 > param1) {
                    break L1;
                  } else {
                    if ((param0 ^ -1) > -1) {
                      break L1;
                    } else {
                      if (((vd) this).field_m <= param1) {
                        break L1;
                      } else {
                        if (param0 >= ((vd) this).field_i) {
                          break L1;
                        } else {
                          stackOut_16_0 = 1;
                          stackIn_18_0 = stackOut_16_0;
                          break L0;
                        }
                      }
                    }
                  }
                }
                stackOut_17_0 = 0;
                stackIn_18_0 = stackOut_17_0;
                break L0;
              }
              return stackIn_18_0 != 0;
            } else {
              L2: {
                L3: {
                  if (0 > param1) {
                    break L3;
                  } else {
                    if ((param0 ^ -1) > -1) {
                      break L3;
                    } else {
                      if (((vd) this).field_m <= param1) {
                        break L3;
                      } else {
                        if (param0 >= ((vd) this).field_i) {
                          break L3;
                        } else {
                          stackOut_9_0 = 1;
                          stackIn_11_0 = stackOut_9_0;
                          break L2;
                        }
                      }
                    }
                  }
                }
                stackOut_10_0 = 0;
                stackIn_11_0 = stackOut_10_0;
                break L2;
              }
              return stackIn_11_0 != 0;
            }
          } else {
            return false;
          }
        } else {
          return false;
        }
    }

    final static boolean a(int param0, bc param1, int param2, int param3) {
        byte[] var4 = null;
        byte[] var5 = null;
        var5 = param1.a(param0, -1, param2);
        var4 = var5;
        if (var5 == null) {
          return false;
        } else {
          k.a(var5, (byte) 62);
          if (param3 != 2) {
            return true;
          } else {
            return true;
          }
        }
    }

    final static void a(int param0, int param1, byte param2) {
        if (null == re.field_d) {
          re.field_d = new int[param1 * 2];
          if (null != kf.field_f) {
            if (param1 <= kf.field_f.length) {
              L0: {
                L1: {
                  if (null == fb.field_zb) {
                    break L1;
                  } else {
                    if (param1 > fb.field_zb.length) {
                      break L1;
                    } else {
                      break L0;
                    }
                  }
                }
                fb.field_zb = new int[param1 * 2];
                break L0;
              }
              L2: {
                L3: {
                  if (null == aj.field_d) {
                    break L3;
                  } else {
                    if (param1 > aj.field_d.length) {
                      break L3;
                    } else {
                      break L2;
                    }
                  }
                }
                aj.field_d = new int[2 * param1];
                break L2;
              }
              L4: {
                L5: {
                  if (f.field_y == null) {
                    break L5;
                  } else {
                    if (param1 > f.field_y.length) {
                      break L5;
                    } else {
                      break L4;
                    }
                  }
                }
                f.field_y = new int[2 * param1];
                break L4;
              }
              L6: {
                L7: {
                  if (null == dc.field_c) {
                    break L7;
                  } else {
                    if (dc.field_c.length < param1) {
                      break L7;
                    } else {
                      break L6;
                    }
                  }
                }
                dc.field_c = new int[param1 * 2];
                break L6;
              }
              if (lg.field_d == null) {
                L8: {
                  L9: {
                    lg.field_d = new int[2 * (param0 + param1)];
                    if (null == aq.field_p) {
                      break L9;
                    } else {
                      if (aq.field_p.length < param1) {
                        break L9;
                      } else {
                        break L8;
                      }
                    }
                  }
                  aq.field_p = new boolean[2 * param1];
                  break L8;
                }
                wm.field_c = 0;
                if (param2 == 18) {
                  ff.field_u = 2147483647;
                  s.field_e = -2147483648;
                  us.field_b = -2147483648;
                  ef.field_a = 2147483647;
                  return;
                } else {
                  vd.a((byte) 6);
                  ff.field_u = 2147483647;
                  s.field_e = -2147483648;
                  us.field_b = -2147483648;
                  ef.field_a = 2147483647;
                  return;
                }
              } else {
                if (param1 + param0 <= lg.field_d.length) {
                  L10: {
                    L11: {
                      if (null == aq.field_p) {
                        break L11;
                      } else {
                        if (aq.field_p.length < param1) {
                          break L11;
                        } else {
                          break L10;
                        }
                      }
                    }
                    aq.field_p = new boolean[2 * param1];
                    break L10;
                  }
                  wm.field_c = 0;
                  if (param2 == 18) {
                    ff.field_u = 2147483647;
                    s.field_e = -2147483648;
                    us.field_b = -2147483648;
                    ef.field_a = 2147483647;
                    return;
                  } else {
                    vd.a((byte) 6);
                    ff.field_u = 2147483647;
                    s.field_e = -2147483648;
                    us.field_b = -2147483648;
                    ef.field_a = 2147483647;
                    return;
                  }
                } else {
                  L12: {
                    L13: {
                      lg.field_d = new int[2 * (param0 + param1)];
                      if (null == aq.field_p) {
                        break L13;
                      } else {
                        if (aq.field_p.length < param1) {
                          break L13;
                        } else {
                          break L12;
                        }
                      }
                    }
                    aq.field_p = new boolean[2 * param1];
                    break L12;
                  }
                  wm.field_c = 0;
                  if (param2 == 18) {
                    ff.field_u = 2147483647;
                    s.field_e = -2147483648;
                    us.field_b = -2147483648;
                    ef.field_a = 2147483647;
                    return;
                  } else {
                    vd.a((byte) 6);
                    ff.field_u = 2147483647;
                    s.field_e = -2147483648;
                    us.field_b = -2147483648;
                    ef.field_a = 2147483647;
                    return;
                  }
                }
              }
            } else {
              L14: {
                L15: {
                  kf.field_f = new int[param1 * 2];
                  if (null == fb.field_zb) {
                    break L15;
                  } else {
                    if (param1 > fb.field_zb.length) {
                      break L15;
                    } else {
                      break L14;
                    }
                  }
                }
                fb.field_zb = new int[param1 * 2];
                break L14;
              }
              L16: {
                L17: {
                  if (null == aj.field_d) {
                    break L17;
                  } else {
                    if (param1 > aj.field_d.length) {
                      break L17;
                    } else {
                      break L16;
                    }
                  }
                }
                aj.field_d = new int[2 * param1];
                break L16;
              }
              L18: {
                L19: {
                  if (f.field_y == null) {
                    break L19;
                  } else {
                    if (param1 > f.field_y.length) {
                      break L19;
                    } else {
                      break L18;
                    }
                  }
                }
                f.field_y = new int[2 * param1];
                break L18;
              }
              L20: {
                L21: {
                  if (null == dc.field_c) {
                    break L21;
                  } else {
                    if (dc.field_c.length < param1) {
                      break L21;
                    } else {
                      break L20;
                    }
                  }
                }
                dc.field_c = new int[param1 * 2];
                break L20;
              }
              L22: {
                L23: {
                  if (lg.field_d == null) {
                    break L23;
                  } else {
                    if (param1 + param0 <= lg.field_d.length) {
                      break L22;
                    } else {
                      break L23;
                    }
                  }
                }
                lg.field_d = new int[2 * (param0 + param1)];
                break L22;
              }
              L24: {
                L25: {
                  if (null == aq.field_p) {
                    break L25;
                  } else {
                    if (aq.field_p.length < param1) {
                      break L25;
                    } else {
                      break L24;
                    }
                  }
                }
                aq.field_p = new boolean[2 * param1];
                break L24;
              }
              wm.field_c = 0;
              if (param2 == 18) {
                ff.field_u = 2147483647;
                s.field_e = -2147483648;
                us.field_b = -2147483648;
                ef.field_a = 2147483647;
                return;
              } else {
                vd.a((byte) 6);
                ff.field_u = 2147483647;
                s.field_e = -2147483648;
                us.field_b = -2147483648;
                ef.field_a = 2147483647;
                return;
              }
            }
          } else {
            L26: {
              L27: {
                kf.field_f = new int[param1 * 2];
                if (null == fb.field_zb) {
                  break L27;
                } else {
                  if (param1 > fb.field_zb.length) {
                    break L27;
                  } else {
                    break L26;
                  }
                }
              }
              fb.field_zb = new int[param1 * 2];
              break L26;
            }
            L28: {
              L29: {
                if (null == aj.field_d) {
                  break L29;
                } else {
                  if (param1 > aj.field_d.length) {
                    break L29;
                  } else {
                    break L28;
                  }
                }
              }
              aj.field_d = new int[2 * param1];
              break L28;
            }
            L30: {
              L31: {
                if (f.field_y == null) {
                  break L31;
                } else {
                  if (param1 > f.field_y.length) {
                    break L31;
                  } else {
                    break L30;
                  }
                }
              }
              f.field_y = new int[2 * param1];
              break L30;
            }
            L32: {
              L33: {
                if (null == dc.field_c) {
                  break L33;
                } else {
                  if (dc.field_c.length < param1) {
                    break L33;
                  } else {
                    break L32;
                  }
                }
              }
              dc.field_c = new int[param1 * 2];
              break L32;
            }
            L34: {
              L35: {
                if (lg.field_d == null) {
                  break L35;
                } else {
                  if (param1 + param0 <= lg.field_d.length) {
                    break L34;
                  } else {
                    break L35;
                  }
                }
              }
              lg.field_d = new int[2 * (param0 + param1)];
              break L34;
            }
            L36: {
              L37: {
                if (null == aq.field_p) {
                  break L37;
                } else {
                  if (aq.field_p.length < param1) {
                    break L37;
                  } else {
                    break L36;
                  }
                }
              }
              aq.field_p = new boolean[2 * param1];
              break L36;
            }
            wm.field_c = 0;
            if (param2 == 18) {
              ff.field_u = 2147483647;
              s.field_e = -2147483648;
              us.field_b = -2147483648;
              ef.field_a = 2147483647;
              return;
            } else {
              vd.a((byte) 6);
              ff.field_u = 2147483647;
              s.field_e = -2147483648;
              us.field_b = -2147483648;
              ef.field_a = 2147483647;
              return;
            }
          }
        } else {
          if (param1 > re.field_d.length) {
            L38: {
              L39: {
                re.field_d = new int[param1 * 2];
                if (null == kf.field_f) {
                  break L39;
                } else {
                  if (param1 > kf.field_f.length) {
                    break L39;
                  } else {
                    break L38;
                  }
                }
              }
              kf.field_f = new int[param1 * 2];
              break L38;
            }
            L40: {
              L41: {
                if (null == fb.field_zb) {
                  break L41;
                } else {
                  if (param1 > fb.field_zb.length) {
                    break L41;
                  } else {
                    break L40;
                  }
                }
              }
              fb.field_zb = new int[param1 * 2];
              break L40;
            }
            L42: {
              L43: {
                if (null == aj.field_d) {
                  break L43;
                } else {
                  if (param1 > aj.field_d.length) {
                    break L43;
                  } else {
                    break L42;
                  }
                }
              }
              aj.field_d = new int[2 * param1];
              break L42;
            }
            L44: {
              L45: {
                if (f.field_y == null) {
                  break L45;
                } else {
                  if (param1 > f.field_y.length) {
                    break L45;
                  } else {
                    break L44;
                  }
                }
              }
              f.field_y = new int[2 * param1];
              break L44;
            }
            L46: {
              L47: {
                if (null == dc.field_c) {
                  break L47;
                } else {
                  if (dc.field_c.length < param1) {
                    break L47;
                  } else {
                    break L46;
                  }
                }
              }
              dc.field_c = new int[param1 * 2];
              break L46;
            }
            if (lg.field_d == null) {
              L48: {
                L49: {
                  lg.field_d = new int[2 * (param0 + param1)];
                  if (null == aq.field_p) {
                    break L49;
                  } else {
                    if (aq.field_p.length < param1) {
                      break L49;
                    } else {
                      break L48;
                    }
                  }
                }
                aq.field_p = new boolean[2 * param1];
                break L48;
              }
              wm.field_c = 0;
              if (param2 == 18) {
                ff.field_u = 2147483647;
                s.field_e = -2147483648;
                us.field_b = -2147483648;
                ef.field_a = 2147483647;
                return;
              } else {
                vd.a((byte) 6);
                ff.field_u = 2147483647;
                s.field_e = -2147483648;
                us.field_b = -2147483648;
                ef.field_a = 2147483647;
                return;
              }
            } else {
              if (param1 + param0 <= lg.field_d.length) {
                L50: {
                  L51: {
                    if (null == aq.field_p) {
                      break L51;
                    } else {
                      if (aq.field_p.length < param1) {
                        break L51;
                      } else {
                        break L50;
                      }
                    }
                  }
                  aq.field_p = new boolean[2 * param1];
                  break L50;
                }
                wm.field_c = 0;
                if (param2 == 18) {
                  ff.field_u = 2147483647;
                  s.field_e = -2147483648;
                  us.field_b = -2147483648;
                  ef.field_a = 2147483647;
                  return;
                } else {
                  vd.a((byte) 6);
                  ff.field_u = 2147483647;
                  s.field_e = -2147483648;
                  us.field_b = -2147483648;
                  ef.field_a = 2147483647;
                  return;
                }
              } else {
                L52: {
                  L53: {
                    lg.field_d = new int[2 * (param0 + param1)];
                    if (null == aq.field_p) {
                      break L53;
                    } else {
                      if (aq.field_p.length < param1) {
                        break L53;
                      } else {
                        break L52;
                      }
                    }
                  }
                  aq.field_p = new boolean[2 * param1];
                  break L52;
                }
                wm.field_c = 0;
                if (param2 == 18) {
                  ff.field_u = 2147483647;
                  s.field_e = -2147483648;
                  us.field_b = -2147483648;
                  ef.field_a = 2147483647;
                  return;
                } else {
                  vd.a((byte) 6);
                  ff.field_u = 2147483647;
                  s.field_e = -2147483648;
                  us.field_b = -2147483648;
                  ef.field_a = 2147483647;
                  return;
                }
              }
            }
          } else {
            L54: {
              L55: {
                if (null == kf.field_f) {
                  break L55;
                } else {
                  if (param1 > kf.field_f.length) {
                    break L55;
                  } else {
                    break L54;
                  }
                }
              }
              kf.field_f = new int[param1 * 2];
              break L54;
            }
            L56: {
              L57: {
                if (null == fb.field_zb) {
                  break L57;
                } else {
                  if (param1 > fb.field_zb.length) {
                    break L57;
                  } else {
                    break L56;
                  }
                }
              }
              fb.field_zb = new int[param1 * 2];
              break L56;
            }
            L58: {
              L59: {
                if (null == aj.field_d) {
                  break L59;
                } else {
                  if (param1 > aj.field_d.length) {
                    break L59;
                  } else {
                    break L58;
                  }
                }
              }
              aj.field_d = new int[2 * param1];
              break L58;
            }
            L60: {
              L61: {
                if (f.field_y == null) {
                  break L61;
                } else {
                  if (param1 > f.field_y.length) {
                    break L61;
                  } else {
                    break L60;
                  }
                }
              }
              f.field_y = new int[2 * param1];
              break L60;
            }
            L62: {
              L63: {
                if (null == dc.field_c) {
                  break L63;
                } else {
                  if (dc.field_c.length < param1) {
                    break L63;
                  } else {
                    break L62;
                  }
                }
              }
              dc.field_c = new int[param1 * 2];
              break L62;
            }
            L64: {
              L65: {
                if (lg.field_d == null) {
                  break L65;
                } else {
                  if (param1 + param0 <= lg.field_d.length) {
                    break L64;
                  } else {
                    break L65;
                  }
                }
              }
              lg.field_d = new int[2 * (param0 + param1)];
              break L64;
            }
            L66: {
              L67: {
                if (null == aq.field_p) {
                  break L67;
                } else {
                  if (aq.field_p.length < param1) {
                    break L67;
                  } else {
                    break L66;
                  }
                }
              }
              aq.field_p = new boolean[2 * param1];
              break L66;
            }
            wm.field_c = 0;
            if (param2 == 18) {
              ff.field_u = 2147483647;
              s.field_e = -2147483648;
              us.field_b = -2147483648;
              ef.field_a = 2147483647;
              return;
            } else {
              vd.a((byte) 6);
              ff.field_u = 2147483647;
              s.field_e = -2147483648;
              us.field_b = -2147483648;
              ef.field_a = 2147483647;
              return;
            }
          }
        }
    }

    final void c(boolean param0) {
        int var3 = 0;
        Object var4 = null;
        vd var4_ref = null;
        var4 = null;
        var3 = ShatteredPlansClient.field_F ? 1 : 0;
        if (!param0) {
          var4_ref = (vd) (Object) ((vd) this).field_l.d(0);
          L0: while (true) {
            if (var4_ref == null) {
              ((vd) this).e(0);
              return;
            } else {
              var4_ref.c(false);
              var4_ref = (vd) (Object) var4_ref.field_l.a((byte) -71);
              continue L0;
            }
          }
        } else {
          ((vd) this).a((byte) 48, 44, -59);
          var4_ref = (vd) (Object) var4_ref.field_l.d(0);
          L1: while (true) {
            if (var4_ref == null) {
              ((vd) this).e(0);
              return;
            } else {
              var4_ref.c(false);
              var4_ref = (vd) (Object) var4_ref.field_l.a((byte) -71);
              continue L1;
            }
          }
        }
    }

    void a(vd param0, int param1) {
        ((vd) this).field_l.a((oh) (Object) param0, param1 ^ param1);
    }

    void a(int param0, int param1, int param2) {
        if (param1 != 0) {
            ((vd) this).field_l = null;
        }
    }

    public static void a(byte param0) {
        Object var2 = null;
        field_n = null;
        if (param0 > -114) {
          var2 = null;
          boolean discarded$2 = vd.a(40, (bc) null, 88, 85);
          field_q = null;
          field_j = null;
          field_r = null;
          return;
        } else {
          field_q = null;
          field_j = null;
          field_r = null;
          return;
        }
    }

    void a(boolean param0, int param1, int param2) {
        ((vd) this).field_i = param1;
        if (!param0) {
          ((vd) this).b(55, 44, 18);
          ((vd) this).field_m = param2;
          return;
        } else {
          ((vd) this).field_m = param2;
          return;
        }
    }

    final static void d(int param0) {
        sl var1 = null;
        int var2 = 0;
        int var3 = 0;
        Object var4 = null;
        var3 = ShatteredPlansClient.field_F ? 1 : 0;
        var1 = js.field_f;
        L0: while (true) {
          if (!bk.a((byte) -50)) {
            if (param0 != 2147483647) {
              var4 = null;
              boolean discarded$2 = vd.a(0, (bc) null, -70, 78);
              return;
            } else {
              return;
            }
          } else {
            var1.h(8, 255);
            var1.field_j = var1.field_j + 1;
            var2 = var1.field_j + 1;
            hs.a(var1, (byte) -128);
            js.field_f.b(-var2 + var1.field_j, (byte) 118);
            continue L0;
          }
        }
    }

    vd b(byte param0, int param1, int param2) {
        if (((vd) this).c(param1, param2, 0)) {
            return (vd) this;
        }
        if (param0 > 51) {
            return null;
        }
        ((vd) this).field_k = -116;
        return null;
    }

    final void a(byte param0, int param1, int param2) {
        if (param1 == ((vd) this).field_k) {
          if (param2 != ((vd) this).field_t) {
            L0: {
              ((vd) this).d(param2 - ((vd) this).field_t, -((vd) this).field_k + param1, 0);
              if (param0 >= 37) {
                break L0;
              } else {
                vd discarded$4 = ((vd) this).b((byte) -125, 17, -8);
                break L0;
              }
            }
            return;
          } else {
            return;
          }
        } else {
          L1: {
            ((vd) this).d(param2 - ((vd) this).field_t, -((vd) this).field_k + param1, 0);
            if (param0 >= 37) {
              break L1;
            } else {
              vd discarded$5 = ((vd) this).b((byte) -125, 17, -8);
              break L1;
            }
          }
          return;
        }
    }

    void a(int param0) {
        int var2 = 27 / ((param0 - 67) / 47);
    }

    vd(int param0, int param1, int param2, int param3) {
        int discarded$0 = rs.field_Cb.c("200");
        ((vd) this).field_k = param0;
        ((vd) this).field_h = null;
        ((vd) this).field_i = param3;
        ((vd) this).field_t = param1;
        ((vd) this).field_p = true;
        ((vd) this).field_s = true;
        ((vd) this).field_m = param2;
        ((vd) this).field_l = new pf();
    }

    void b(int param0, int param1, int param2) {
        if (param2 != -498) {
            ((vd) this).field_p = true;
        }
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_r = "This game option is only available to members.";
        field_n = "Colony homeworld";
    }
}
