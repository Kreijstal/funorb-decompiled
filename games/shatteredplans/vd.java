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
        vd var6 = null;
        var5 = ShatteredPlansClient.field_F ? 1 : 0;
        if (param1 == 0) {
          if (0 == param0) {
            return;
          } else {
            ((vd) this).field_k = ((vd) this).field_k + param1;
            ((vd) this).field_t = ((vd) this).field_t + param0;
            var6 = (vd) (Object) ((vd) this).field_l.d(param2);
            L0: while (true) {
              if (var6 == null) {
                return;
              } else {
                var6.d(param0, param1, 0);
                var6 = (vd) (Object) ((vd) this).field_l.a((byte) -71);
                continue L0;
              }
            }
          }
        } else {
          ((vd) this).field_k = ((vd) this).field_k + param1;
          ((vd) this).field_t = ((vd) this).field_t + param0;
          var6 = (vd) (Object) ((vd) this).field_l.d(param2);
          L1: while (true) {
            if (var6 == null) {
              return;
            } else {
              var6.d(param0, param1, 0);
              var6 = (vd) (Object) ((vd) this).field_l.a((byte) -71);
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
            var4 = (vd) (Object) ((vd) this).field_l.a((byte) -71);
        }
    }

    final boolean a(byte param0, vd param1) {
        RuntimeException var3 = null;
        int var4 = 0;
        int var5 = 0;
        vd var6 = null;
        int stackIn_3_0 = 0;
        int stackIn_9_0 = 0;
        int stackIn_12_0 = 0;
        RuntimeException stackIn_14_0 = null;
        StringBuilder stackIn_14_1 = null;
        RuntimeException stackIn_15_0 = null;
        StringBuilder stackIn_15_1 = null;
        RuntimeException stackIn_16_0 = null;
        StringBuilder stackIn_16_1 = null;
        String stackIn_16_2 = null;
        RuntimeException decompiledCaughtException = null;
        int stackOut_11_0 = 0;
        int stackOut_8_0 = 0;
        int stackOut_2_0 = 0;
        RuntimeException stackOut_13_0 = null;
        StringBuilder stackOut_13_1 = null;
        RuntimeException stackOut_15_0 = null;
        StringBuilder stackOut_15_1 = null;
        String stackOut_15_2 = null;
        RuntimeException stackOut_14_0 = null;
        StringBuilder stackOut_14_1 = null;
        String stackOut_14_2 = null;
        var5 = ShatteredPlansClient.field_F ? 1 : 0;
        try {
          L0: {
            if (this != (Object) (Object) param1) {
              var4 = -85 / ((-63 - param0) / 47);
              var6 = (vd) (Object) ((vd) this).field_l.d(0);
              L1: while (true) {
                if (var6 == null) {
                  stackOut_11_0 = 0;
                  stackIn_12_0 = stackOut_11_0;
                  break L0;
                } else {
                  if (var6.a((byte) -125, param1)) {
                    stackOut_8_0 = 1;
                    stackIn_9_0 = stackOut_8_0;
                    return stackIn_9_0 != 0;
                  } else {
                    var6 = (vd) (Object) ((vd) this).field_l.a((byte) -71);
                    continue L1;
                  }
                }
              }
            } else {
              stackOut_2_0 = 1;
              stackIn_3_0 = stackOut_2_0;
              return stackIn_3_0 != 0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L2: {
            var3 = decompiledCaughtException;
            stackOut_13_0 = (RuntimeException) var3;
            stackOut_13_1 = new StringBuilder().append("vd.IA(").append(param0).append(',');
            stackIn_15_0 = stackOut_13_0;
            stackIn_15_1 = stackOut_13_1;
            stackIn_14_0 = stackOut_13_0;
            stackIn_14_1 = stackOut_13_1;
            if (param1 == null) {
              stackOut_15_0 = (RuntimeException) (Object) stackIn_15_0;
              stackOut_15_1 = (StringBuilder) (Object) stackIn_15_1;
              stackOut_15_2 = "null";
              stackIn_16_0 = stackOut_15_0;
              stackIn_16_1 = stackOut_15_1;
              stackIn_16_2 = stackOut_15_2;
              break L2;
            } else {
              stackOut_14_0 = (RuntimeException) (Object) stackIn_14_0;
              stackOut_14_1 = (StringBuilder) (Object) stackIn_14_1;
              stackOut_14_2 = "{...}";
              stackIn_16_0 = stackOut_14_0;
              stackIn_16_1 = stackOut_14_1;
              stackIn_16_2 = stackOut_14_2;
              break L2;
            }
          }
          throw r.a((Throwable) (Object) stackIn_16_0, stackIn_16_2 + ')');
        }
        return stackIn_12_0 != 0;
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
                    if (param0 < 0) {
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
                    if (param0 < 0) {
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
        RuntimeException var4_ref = null;
        byte[] var5 = null;
        int stackIn_3_0 = 0;
        int stackIn_6_0 = 0;
        int stackIn_8_0 = 0;
        RuntimeException stackIn_10_0 = null;
        StringBuilder stackIn_10_1 = null;
        RuntimeException stackIn_11_0 = null;
        StringBuilder stackIn_11_1 = null;
        RuntimeException stackIn_12_0 = null;
        StringBuilder stackIn_12_1 = null;
        String stackIn_12_2 = null;
        RuntimeException decompiledCaughtException = null;
        int stackOut_2_0 = 0;
        int stackOut_7_0 = 0;
        int stackOut_5_0 = 0;
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
            var5 = param1.a(param0, -1, param2);
            var4 = var5;
            if (var5 == null) {
              stackOut_2_0 = 0;
              stackIn_3_0 = stackOut_2_0;
              return stackIn_3_0 != 0;
            } else {
              k.a(var5, (byte) 62);
              if (param3 == 2) {
                stackOut_7_0 = 1;
                stackIn_8_0 = stackOut_7_0;
                break L0;
              } else {
                stackOut_5_0 = 1;
                stackIn_6_0 = stackOut_5_0;
                return stackIn_6_0 != 0;
              }
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L1: {
            var4_ref = decompiledCaughtException;
            stackOut_9_0 = (RuntimeException) var4_ref;
            stackOut_9_1 = new StringBuilder().append("vd.CA(").append(param0).append(',');
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
              break L1;
            } else {
              stackOut_10_0 = (RuntimeException) (Object) stackIn_10_0;
              stackOut_10_1 = (StringBuilder) (Object) stackIn_10_1;
              stackOut_10_2 = "{...}";
              stackIn_12_0 = stackOut_10_0;
              stackIn_12_1 = stackOut_10_1;
              stackIn_12_2 = stackOut_10_2;
              break L1;
            }
          }
          throw r.a((Throwable) (Object) stackIn_12_0, stackIn_12_2 + ',' + param2 + ',' + param3 + ')');
        }
        return stackIn_8_0 != 0;
    }

    final static void a(int param0, int param1, byte param2) {
        if (null == re.field_d) {
          L0: {
            L1: {
              re.field_d = new int[param1 * 2];
              if (null == kf.field_f) {
                break L1;
              } else {
                if (param1 > kf.field_f.length) {
                  break L1;
                } else {
                  break L0;
                }
              }
            }
            kf.field_f = new int[param1 * 2];
            break L0;
          }
          L2: {
            L3: {
              if (null == fb.field_zb) {
                break L3;
              } else {
                if (param1 > fb.field_zb.length) {
                  break L3;
                } else {
                  break L2;
                }
              }
            }
            fb.field_zb = new int[param1 * 2];
            break L2;
          }
          L4: {
            L5: {
              if (null == aj.field_d) {
                break L5;
              } else {
                if (param1 > aj.field_d.length) {
                  break L5;
                } else {
                  break L4;
                }
              }
            }
            aj.field_d = new int[2 * param1];
            break L4;
          }
          L6: {
            L7: {
              if (f.field_y == null) {
                break L7;
              } else {
                if (param1 > f.field_y.length) {
                  break L7;
                } else {
                  break L6;
                }
              }
            }
            f.field_y = new int[2 * param1];
            break L6;
          }
          L8: {
            L9: {
              if (null == dc.field_c) {
                break L9;
              } else {
                if (dc.field_c.length < param1) {
                  break L9;
                } else {
                  break L8;
                }
              }
            }
            dc.field_c = new int[param1 * 2];
            break L8;
          }
          if (lg.field_d != null) {
            if (param1 + param0 > lg.field_d.length) {
              L10: {
                L11: {
                  lg.field_d = new int[2 * (param0 + param1)];
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
              ff.field_u = 2147483647;
              s.field_e = -2147483648;
              us.field_b = -2147483648;
              ef.field_a = 2147483647;
              return;
            } else {
              L12: {
                L13: {
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
              ff.field_u = 2147483647;
              s.field_e = -2147483648;
              us.field_b = -2147483648;
              ef.field_a = 2147483647;
              return;
            }
          } else {
            L14: {
              L15: {
                lg.field_d = new int[2 * (param0 + param1)];
                if (null == aq.field_p) {
                  break L15;
                } else {
                  if (aq.field_p.length < param1) {
                    break L15;
                  } else {
                    break L14;
                  }
                }
              }
              aq.field_p = new boolean[2 * param1];
              break L14;
            }
            wm.field_c = 0;
            ff.field_u = 2147483647;
            s.field_e = -2147483648;
            us.field_b = -2147483648;
            ef.field_a = 2147483647;
            return;
          }
        } else {
          if (param1 > re.field_d.length) {
            L16: {
              L17: {
                re.field_d = new int[param1 * 2];
                if (null == kf.field_f) {
                  break L17;
                } else {
                  if (param1 > kf.field_f.length) {
                    break L17;
                  } else {
                    break L16;
                  }
                }
              }
              kf.field_f = new int[param1 * 2];
              break L16;
            }
            L18: {
              L19: {
                if (null == fb.field_zb) {
                  break L19;
                } else {
                  if (param1 > fb.field_zb.length) {
                    break L19;
                  } else {
                    break L18;
                  }
                }
              }
              fb.field_zb = new int[param1 * 2];
              break L18;
            }
            L20: {
              L21: {
                if (null == aj.field_d) {
                  break L21;
                } else {
                  if (param1 > aj.field_d.length) {
                    break L21;
                  } else {
                    break L20;
                  }
                }
              }
              aj.field_d = new int[2 * param1];
              break L20;
            }
            L22: {
              L23: {
                if (f.field_y == null) {
                  break L23;
                } else {
                  if (param1 > f.field_y.length) {
                    break L23;
                  } else {
                    break L22;
                  }
                }
              }
              f.field_y = new int[2 * param1];
              break L22;
            }
            L24: {
              L25: {
                if (null == dc.field_c) {
                  break L25;
                } else {
                  if (dc.field_c.length < param1) {
                    break L25;
                  } else {
                    break L24;
                  }
                }
              }
              dc.field_c = new int[param1 * 2];
              break L24;
            }
            if (lg.field_d != null) {
              if (param1 + param0 > lg.field_d.length) {
                L26: {
                  L27: {
                    lg.field_d = new int[2 * (param0 + param1)];
                    if (null == aq.field_p) {
                      break L27;
                    } else {
                      if (aq.field_p.length < param1) {
                        break L27;
                      } else {
                        break L26;
                      }
                    }
                  }
                  aq.field_p = new boolean[2 * param1];
                  break L26;
                }
                wm.field_c = 0;
                ff.field_u = 2147483647;
                s.field_e = -2147483648;
                us.field_b = -2147483648;
                ef.field_a = 2147483647;
                return;
              } else {
                L28: {
                  L29: {
                    if (null == aq.field_p) {
                      break L29;
                    } else {
                      if (aq.field_p.length < param1) {
                        break L29;
                      } else {
                        break L28;
                      }
                    }
                  }
                  aq.field_p = new boolean[2 * param1];
                  break L28;
                }
                wm.field_c = 0;
                ff.field_u = 2147483647;
                s.field_e = -2147483648;
                us.field_b = -2147483648;
                ef.field_a = 2147483647;
                return;
              }
            } else {
              L30: {
                L31: {
                  lg.field_d = new int[2 * (param0 + param1)];
                  if (null == aq.field_p) {
                    break L31;
                  } else {
                    if (aq.field_p.length < param1) {
                      break L31;
                    } else {
                      break L30;
                    }
                  }
                }
                aq.field_p = new boolean[2 * param1];
                break L30;
              }
              wm.field_c = 0;
              ff.field_u = 2147483647;
              s.field_e = -2147483648;
              us.field_b = -2147483648;
              ef.field_a = 2147483647;
              return;
            }
          } else {
            L32: {
              L33: {
                if (null == kf.field_f) {
                  break L33;
                } else {
                  if (param1 > kf.field_f.length) {
                    break L33;
                  } else {
                    break L32;
                  }
                }
              }
              kf.field_f = new int[param1 * 2];
              break L32;
            }
            L34: {
              L35: {
                if (null == fb.field_zb) {
                  break L35;
                } else {
                  if (param1 > fb.field_zb.length) {
                    break L35;
                  } else {
                    break L34;
                  }
                }
              }
              fb.field_zb = new int[param1 * 2];
              break L34;
            }
            if (null != aj.field_d) {
              if (param1 <= aj.field_d.length) {
                L36: {
                  L37: {
                    if (f.field_y == null) {
                      break L37;
                    } else {
                      if (param1 > f.field_y.length) {
                        break L37;
                      } else {
                        break L36;
                      }
                    }
                  }
                  f.field_y = new int[2 * param1];
                  break L36;
                }
                L38: {
                  L39: {
                    if (null == dc.field_c) {
                      break L39;
                    } else {
                      if (dc.field_c.length < param1) {
                        break L39;
                      } else {
                        break L38;
                      }
                    }
                  }
                  dc.field_c = new int[param1 * 2];
                  break L38;
                }
                if (lg.field_d != null) {
                  if (param1 + param0 > lg.field_d.length) {
                    L40: {
                      L41: {
                        lg.field_d = new int[2 * (param0 + param1)];
                        if (null == aq.field_p) {
                          break L41;
                        } else {
                          if (aq.field_p.length < param1) {
                            break L41;
                          } else {
                            break L40;
                          }
                        }
                      }
                      aq.field_p = new boolean[2 * param1];
                      break L40;
                    }
                    wm.field_c = 0;
                    ff.field_u = 2147483647;
                    s.field_e = -2147483648;
                    us.field_b = -2147483648;
                    ef.field_a = 2147483647;
                    return;
                  } else {
                    L42: {
                      L43: {
                        if (null == aq.field_p) {
                          break L43;
                        } else {
                          if (aq.field_p.length < param1) {
                            break L43;
                          } else {
                            break L42;
                          }
                        }
                      }
                      aq.field_p = new boolean[2 * param1];
                      break L42;
                    }
                    wm.field_c = 0;
                    ff.field_u = 2147483647;
                    s.field_e = -2147483648;
                    us.field_b = -2147483648;
                    ef.field_a = 2147483647;
                    return;
                  }
                } else {
                  L44: {
                    L45: {
                      lg.field_d = new int[2 * (param0 + param1)];
                      if (null == aq.field_p) {
                        break L45;
                      } else {
                        if (aq.field_p.length < param1) {
                          break L45;
                        } else {
                          break L44;
                        }
                      }
                    }
                    aq.field_p = new boolean[2 * param1];
                    break L44;
                  }
                  wm.field_c = 0;
                  ff.field_u = 2147483647;
                  s.field_e = -2147483648;
                  us.field_b = -2147483648;
                  ef.field_a = 2147483647;
                  return;
                }
              } else {
                L46: {
                  L47: {
                    aj.field_d = new int[2 * param1];
                    if (f.field_y == null) {
                      break L47;
                    } else {
                      if (param1 > f.field_y.length) {
                        break L47;
                      } else {
                        break L46;
                      }
                    }
                  }
                  f.field_y = new int[2 * param1];
                  break L46;
                }
                L48: {
                  L49: {
                    if (null == dc.field_c) {
                      break L49;
                    } else {
                      if (dc.field_c.length < param1) {
                        break L49;
                      } else {
                        break L48;
                      }
                    }
                  }
                  dc.field_c = new int[param1 * 2];
                  break L48;
                }
                L50: {
                  L51: {
                    if (lg.field_d == null) {
                      break L51;
                    } else {
                      if (param1 + param0 <= lg.field_d.length) {
                        break L50;
                      } else {
                        break L51;
                      }
                    }
                  }
                  lg.field_d = new int[2 * (param0 + param1)];
                  break L50;
                }
                L52: {
                  L53: {
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
                ff.field_u = 2147483647;
                s.field_e = -2147483648;
                us.field_b = -2147483648;
                ef.field_a = 2147483647;
                return;
              }
            } else {
              L54: {
                L55: {
                  aj.field_d = new int[2 * param1];
                  if (f.field_y == null) {
                    break L55;
                  } else {
                    if (param1 > f.field_y.length) {
                      break L55;
                    } else {
                      break L54;
                    }
                  }
                }
                f.field_y = new int[2 * param1];
                break L54;
              }
              L56: {
                L57: {
                  if (null == dc.field_c) {
                    break L57;
                  } else {
                    if (dc.field_c.length < param1) {
                      break L57;
                    } else {
                      break L56;
                    }
                  }
                }
                dc.field_c = new int[param1 * 2];
                break L56;
              }
              L58: {
                L59: {
                  if (lg.field_d == null) {
                    break L59;
                  } else {
                    if (param1 + param0 <= lg.field_d.length) {
                      break L58;
                    } else {
                      break L59;
                    }
                  }
                }
                lg.field_d = new int[2 * (param0 + param1)];
                break L58;
              }
              L60: {
                L61: {
                  if (null == aq.field_p) {
                    break L61;
                  } else {
                    if (aq.field_p.length < param1) {
                      break L61;
                    } else {
                      break L60;
                    }
                  }
                }
                aq.field_p = new boolean[2 * param1];
                break L60;
              }
              wm.field_c = 0;
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
        vd var4 = null;
        var3 = ShatteredPlansClient.field_F ? 1 : 0;
        if (!param0) {
          var4 = (vd) (Object) ((vd) this).field_l.d(0);
          L0: while (true) {
            if (var4 == null) {
              ((vd) this).e(0);
              return;
            } else {
              var4.c(false);
              var4 = (vd) (Object) ((vd) this).field_l.a((byte) -71);
              continue L0;
            }
          }
        } else {
          ((vd) this).a((byte) 48, 44, -59);
          var4 = (vd) (Object) ((vd) this).field_l.d(0);
          L1: while (true) {
            if (var4 == null) {
              ((vd) this).e(0);
              return;
            } else {
              var4.c(false);
              var4 = (vd) (Object) ((vd) this).field_l.a((byte) -71);
              continue L1;
            }
          }
        }
    }

    void a(vd param0, int param1) {
        try {
            ((vd) this).field_l.a((oh) (Object) param0, param1 ^ param1);
        } catch (RuntimeException runtimeException) {
            throw r.a((Throwable) (Object) runtimeException, "vd.M(" + (param0 != null ? "{...}" : "null") + ',' + param1 + ')');
        }
    }

    void a(int param0, int param1, int param2) {
        if (param1 != 0) {
            ((vd) this).field_l = null;
        }
    }

    public static void a(byte param0) {
        field_n = null;
        field_q = null;
        field_j = null;
        field_r = null;
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
        RuntimeException var1_ref = null;
        int var2 = 0;
        int var3 = 0;
        Object var4 = null;
        RuntimeException decompiledCaughtException = null;
        var3 = ShatteredPlansClient.field_F ? 1 : 0;
        try {
          L0: {
            var1 = js.field_f;
            L1: while (true) {
              if (!bk.a((byte) -50)) {
                L2: {
                  if (param0 == 2147483647) {
                    break L2;
                  } else {
                    var4 = null;
                    boolean discarded$4 = vd.a(0, (bc) null, -70, 78);
                    break L2;
                  }
                }
                break L0;
              } else {
                var1.h(8, 255);
                int fieldTemp$5 = var1.field_j + 1;
                var1.field_j = var1.field_j + 1;
                var2 = fieldTemp$5;
                hs.a(var1, (byte) -128);
                js.field_f.b(-var2 + var1.field_j, (byte) 118);
                continue L1;
              }
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var1_ref = decompiledCaughtException;
          throw r.a((Throwable) (Object) var1_ref, "vd.HA(" + param0 + ')');
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
