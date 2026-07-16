/*
 * Decompiled by CFR-JS 0.4.0.
 */
abstract class ek {
    static int field_b;
    static mk field_d;
    static rk[] field_c;
    static int field_a;
    static String[] field_f;
    static String field_e;

    abstract int a(byte param0);

    final static void a(int param0, int param1, byte param2) {
        L0: {
          L1: {
            if (gb.field_A == null) {
              break L1;
            } else {
              if (param1 > gb.field_A.length) {
                break L1;
              } else {
                break L0;
              }
            }
          }
          gb.field_A = new int[2 * param1];
          break L0;
        }
        if (null == hg.field_d) {
          hg.field_d = new int[param1 * 2];
          if (param2 >= 52) {
            L2: {
              L3: {
                if (hn.field_e == null) {
                  break L3;
                } else {
                  if (hn.field_e.length >= param1) {
                    break L2;
                  } else {
                    break L3;
                  }
                }
              }
              hn.field_e = new int[param1 * 2];
              break L2;
            }
            L4: {
              L5: {
                if (null == in.field_j) {
                  break L5;
                } else {
                  if (in.field_j.length < param1) {
                    break L5;
                  } else {
                    break L4;
                  }
                }
              }
              in.field_j = new int[param1 * 2];
              break L4;
            }
            L6: {
              L7: {
                if (oc.field_n == null) {
                  break L7;
                } else {
                  if (oc.field_n.length < param1) {
                    break L7;
                  } else {
                    break L6;
                  }
                }
              }
              oc.field_n = new int[2 * param1];
              break L6;
            }
            if (null == gh.field_a) {
              L8: {
                L9: {
                  gh.field_a = new int[param1 * 2];
                  if (null == vn.field_Ab) {
                    break L9;
                  } else {
                    if (param0 + param1 > vn.field_Ab.length) {
                      break L9;
                    } else {
                      break L8;
                    }
                  }
                }
                vn.field_Ab = new int[(param0 + param1) * 2];
                break L8;
              }
              L10: {
                L11: {
                  if (ok.field_Lb == null) {
                    break L11;
                  } else {
                    if (ok.field_Lb.length < param1) {
                      break L11;
                    } else {
                      break L10;
                    }
                  }
                }
                ok.field_Lb = new boolean[2 * param1];
                break L10;
              }
              ed.field_b = 0;
              bj.field_gb = -2147483648;
              bh.field_F = 2147483647;
              nj.field_t = 2147483647;
              eb.field_y = -2147483648;
              return;
            } else {
              if (param1 <= gh.field_a.length) {
                L12: {
                  L13: {
                    if (null == vn.field_Ab) {
                      break L13;
                    } else {
                      if (param0 + param1 > vn.field_Ab.length) {
                        break L13;
                      } else {
                        break L12;
                      }
                    }
                  }
                  vn.field_Ab = new int[(param0 + param1) * 2];
                  break L12;
                }
                L14: {
                  L15: {
                    if (ok.field_Lb == null) {
                      break L15;
                    } else {
                      if (ok.field_Lb.length < param1) {
                        break L15;
                      } else {
                        break L14;
                      }
                    }
                  }
                  ok.field_Lb = new boolean[2 * param1];
                  break L14;
                }
                ed.field_b = 0;
                bj.field_gb = -2147483648;
                bh.field_F = 2147483647;
                nj.field_t = 2147483647;
                eb.field_y = -2147483648;
                return;
              } else {
                L16: {
                  L17: {
                    gh.field_a = new int[param1 * 2];
                    if (null == vn.field_Ab) {
                      break L17;
                    } else {
                      if (param0 + param1 > vn.field_Ab.length) {
                        break L17;
                      } else {
                        break L16;
                      }
                    }
                  }
                  vn.field_Ab = new int[(param0 + param1) * 2];
                  break L16;
                }
                L18: {
                  L19: {
                    if (ok.field_Lb == null) {
                      break L19;
                    } else {
                      if (ok.field_Lb.length < param1) {
                        break L19;
                      } else {
                        break L18;
                      }
                    }
                  }
                  ok.field_Lb = new boolean[2 * param1];
                  break L18;
                }
                ed.field_b = 0;
                bj.field_gb = -2147483648;
                bh.field_F = 2147483647;
                nj.field_t = 2147483647;
                eb.field_y = -2147483648;
                return;
              }
            }
          } else {
            return;
          }
        } else {
          if (param1 <= hg.field_d.length) {
            if (param2 >= 52) {
              if (hn.field_e == null) {
                L20: {
                  L21: {
                    hn.field_e = new int[param1 * 2];
                    if (null == in.field_j) {
                      break L21;
                    } else {
                      if (in.field_j.length < param1) {
                        break L21;
                      } else {
                        break L20;
                      }
                    }
                  }
                  in.field_j = new int[param1 * 2];
                  break L20;
                }
                L22: {
                  L23: {
                    if (oc.field_n == null) {
                      break L23;
                    } else {
                      if (oc.field_n.length < param1) {
                        break L23;
                      } else {
                        break L22;
                      }
                    }
                  }
                  oc.field_n = new int[2 * param1];
                  break L22;
                }
                if (null == gh.field_a) {
                  L24: {
                    L25: {
                      gh.field_a = new int[param1 * 2];
                      if (null == vn.field_Ab) {
                        break L25;
                      } else {
                        if (param0 + param1 > vn.field_Ab.length) {
                          break L25;
                        } else {
                          break L24;
                        }
                      }
                    }
                    vn.field_Ab = new int[(param0 + param1) * 2];
                    break L24;
                  }
                  L26: {
                    L27: {
                      if (ok.field_Lb == null) {
                        break L27;
                      } else {
                        if (ok.field_Lb.length < param1) {
                          break L27;
                        } else {
                          break L26;
                        }
                      }
                    }
                    ok.field_Lb = new boolean[2 * param1];
                    break L26;
                  }
                  ed.field_b = 0;
                  bj.field_gb = -2147483648;
                  bh.field_F = 2147483647;
                  nj.field_t = 2147483647;
                  eb.field_y = -2147483648;
                  return;
                } else {
                  if (param1 <= gh.field_a.length) {
                    L28: {
                      L29: {
                        if (null == vn.field_Ab) {
                          break L29;
                        } else {
                          if (param0 + param1 > vn.field_Ab.length) {
                            break L29;
                          } else {
                            break L28;
                          }
                        }
                      }
                      vn.field_Ab = new int[(param0 + param1) * 2];
                      break L28;
                    }
                    L30: {
                      L31: {
                        if (ok.field_Lb == null) {
                          break L31;
                        } else {
                          if (ok.field_Lb.length < param1) {
                            break L31;
                          } else {
                            break L30;
                          }
                        }
                      }
                      ok.field_Lb = new boolean[2 * param1];
                      break L30;
                    }
                    ed.field_b = 0;
                    bj.field_gb = -2147483648;
                    bh.field_F = 2147483647;
                    nj.field_t = 2147483647;
                    eb.field_y = -2147483648;
                    return;
                  } else {
                    L32: {
                      L33: {
                        gh.field_a = new int[param1 * 2];
                        if (null == vn.field_Ab) {
                          break L33;
                        } else {
                          if (param0 + param1 > vn.field_Ab.length) {
                            break L33;
                          } else {
                            break L32;
                          }
                        }
                      }
                      vn.field_Ab = new int[(param0 + param1) * 2];
                      break L32;
                    }
                    L34: {
                      L35: {
                        if (ok.field_Lb == null) {
                          break L35;
                        } else {
                          if (ok.field_Lb.length < param1) {
                            break L35;
                          } else {
                            break L34;
                          }
                        }
                      }
                      ok.field_Lb = new boolean[2 * param1];
                      break L34;
                    }
                    ed.field_b = 0;
                    bj.field_gb = -2147483648;
                    bh.field_F = 2147483647;
                    nj.field_t = 2147483647;
                    eb.field_y = -2147483648;
                    return;
                  }
                }
              } else {
                if (hn.field_e.length >= param1) {
                  L36: {
                    L37: {
                      if (null == in.field_j) {
                        break L37;
                      } else {
                        if (in.field_j.length < param1) {
                          break L37;
                        } else {
                          break L36;
                        }
                      }
                    }
                    in.field_j = new int[param1 * 2];
                    break L36;
                  }
                  L38: {
                    L39: {
                      if (oc.field_n == null) {
                        break L39;
                      } else {
                        if (oc.field_n.length < param1) {
                          break L39;
                        } else {
                          break L38;
                        }
                      }
                    }
                    oc.field_n = new int[2 * param1];
                    break L38;
                  }
                  if (null == gh.field_a) {
                    L40: {
                      L41: {
                        gh.field_a = new int[param1 * 2];
                        if (null == vn.field_Ab) {
                          break L41;
                        } else {
                          if (param0 + param1 > vn.field_Ab.length) {
                            break L41;
                          } else {
                            break L40;
                          }
                        }
                      }
                      vn.field_Ab = new int[(param0 + param1) * 2];
                      break L40;
                    }
                    L42: {
                      L43: {
                        if (ok.field_Lb == null) {
                          break L43;
                        } else {
                          if (ok.field_Lb.length < param1) {
                            break L43;
                          } else {
                            break L42;
                          }
                        }
                      }
                      ok.field_Lb = new boolean[2 * param1];
                      break L42;
                    }
                    ed.field_b = 0;
                    bj.field_gb = -2147483648;
                    bh.field_F = 2147483647;
                    nj.field_t = 2147483647;
                    eb.field_y = -2147483648;
                    return;
                  } else {
                    if (param1 <= gh.field_a.length) {
                      L44: {
                        L45: {
                          if (null == vn.field_Ab) {
                            break L45;
                          } else {
                            if (param0 + param1 > vn.field_Ab.length) {
                              break L45;
                            } else {
                              break L44;
                            }
                          }
                        }
                        vn.field_Ab = new int[(param0 + param1) * 2];
                        break L44;
                      }
                      L46: {
                        L47: {
                          if (ok.field_Lb == null) {
                            break L47;
                          } else {
                            if (ok.field_Lb.length < param1) {
                              break L47;
                            } else {
                              break L46;
                            }
                          }
                        }
                        ok.field_Lb = new boolean[2 * param1];
                        break L46;
                      }
                      ed.field_b = 0;
                      bj.field_gb = -2147483648;
                      bh.field_F = 2147483647;
                      nj.field_t = 2147483647;
                      eb.field_y = -2147483648;
                      return;
                    } else {
                      L48: {
                        L49: {
                          gh.field_a = new int[param1 * 2];
                          if (null == vn.field_Ab) {
                            break L49;
                          } else {
                            if (param0 + param1 > vn.field_Ab.length) {
                              break L49;
                            } else {
                              break L48;
                            }
                          }
                        }
                        vn.field_Ab = new int[(param0 + param1) * 2];
                        break L48;
                      }
                      L50: {
                        L51: {
                          if (ok.field_Lb == null) {
                            break L51;
                          } else {
                            if (ok.field_Lb.length < param1) {
                              break L51;
                            } else {
                              break L50;
                            }
                          }
                        }
                        ok.field_Lb = new boolean[2 * param1];
                        break L50;
                      }
                      ed.field_b = 0;
                      bj.field_gb = -2147483648;
                      bh.field_F = 2147483647;
                      nj.field_t = 2147483647;
                      eb.field_y = -2147483648;
                      return;
                    }
                  }
                } else {
                  L52: {
                    L53: {
                      hn.field_e = new int[param1 * 2];
                      if (null == in.field_j) {
                        break L53;
                      } else {
                        if (in.field_j.length < param1) {
                          break L53;
                        } else {
                          break L52;
                        }
                      }
                    }
                    in.field_j = new int[param1 * 2];
                    break L52;
                  }
                  L54: {
                    L55: {
                      if (oc.field_n == null) {
                        break L55;
                      } else {
                        if (oc.field_n.length < param1) {
                          break L55;
                        } else {
                          break L54;
                        }
                      }
                    }
                    oc.field_n = new int[2 * param1];
                    break L54;
                  }
                  if (null == gh.field_a) {
                    L56: {
                      L57: {
                        gh.field_a = new int[param1 * 2];
                        if (null == vn.field_Ab) {
                          break L57;
                        } else {
                          if (param0 + param1 > vn.field_Ab.length) {
                            break L57;
                          } else {
                            break L56;
                          }
                        }
                      }
                      vn.field_Ab = new int[(param0 + param1) * 2];
                      break L56;
                    }
                    L58: {
                      L59: {
                        if (ok.field_Lb == null) {
                          break L59;
                        } else {
                          if (ok.field_Lb.length < param1) {
                            break L59;
                          } else {
                            break L58;
                          }
                        }
                      }
                      ok.field_Lb = new boolean[2 * param1];
                      break L58;
                    }
                    ed.field_b = 0;
                    bj.field_gb = -2147483648;
                    bh.field_F = 2147483647;
                    nj.field_t = 2147483647;
                    eb.field_y = -2147483648;
                    return;
                  } else {
                    if (param1 <= gh.field_a.length) {
                      L60: {
                        L61: {
                          if (null == vn.field_Ab) {
                            break L61;
                          } else {
                            if (param0 + param1 > vn.field_Ab.length) {
                              break L61;
                            } else {
                              break L60;
                            }
                          }
                        }
                        vn.field_Ab = new int[(param0 + param1) * 2];
                        break L60;
                      }
                      L62: {
                        L63: {
                          if (ok.field_Lb == null) {
                            break L63;
                          } else {
                            if (ok.field_Lb.length < param1) {
                              break L63;
                            } else {
                              break L62;
                            }
                          }
                        }
                        ok.field_Lb = new boolean[2 * param1];
                        break L62;
                      }
                      ed.field_b = 0;
                      bj.field_gb = -2147483648;
                      bh.field_F = 2147483647;
                      nj.field_t = 2147483647;
                      eb.field_y = -2147483648;
                      return;
                    } else {
                      L64: {
                        L65: {
                          gh.field_a = new int[param1 * 2];
                          if (null == vn.field_Ab) {
                            break L65;
                          } else {
                            if (param0 + param1 > vn.field_Ab.length) {
                              break L65;
                            } else {
                              break L64;
                            }
                          }
                        }
                        vn.field_Ab = new int[(param0 + param1) * 2];
                        break L64;
                      }
                      L66: {
                        L67: {
                          if (ok.field_Lb == null) {
                            break L67;
                          } else {
                            if (ok.field_Lb.length < param1) {
                              break L67;
                            } else {
                              break L66;
                            }
                          }
                        }
                        ok.field_Lb = new boolean[2 * param1];
                        break L66;
                      }
                      ed.field_b = 0;
                      bj.field_gb = -2147483648;
                      bh.field_F = 2147483647;
                      nj.field_t = 2147483647;
                      eb.field_y = -2147483648;
                      return;
                    }
                  }
                }
              }
            } else {
              return;
            }
          } else {
            hg.field_d = new int[param1 * 2];
            if (param2 >= 52) {
              L68: {
                L69: {
                  if (hn.field_e == null) {
                    break L69;
                  } else {
                    if (hn.field_e.length >= param1) {
                      break L68;
                    } else {
                      break L69;
                    }
                  }
                }
                hn.field_e = new int[param1 * 2];
                break L68;
              }
              L70: {
                L71: {
                  if (null == in.field_j) {
                    break L71;
                  } else {
                    if (in.field_j.length < param1) {
                      break L71;
                    } else {
                      break L70;
                    }
                  }
                }
                in.field_j = new int[param1 * 2];
                break L70;
              }
              L72: {
                L73: {
                  if (oc.field_n == null) {
                    break L73;
                  } else {
                    if (oc.field_n.length < param1) {
                      break L73;
                    } else {
                      break L72;
                    }
                  }
                }
                oc.field_n = new int[2 * param1];
                break L72;
              }
              L74: {
                L75: {
                  if (null == gh.field_a) {
                    break L75;
                  } else {
                    if (param1 <= gh.field_a.length) {
                      break L74;
                    } else {
                      break L75;
                    }
                  }
                }
                gh.field_a = new int[param1 * 2];
                break L74;
              }
              L76: {
                L77: {
                  if (null == vn.field_Ab) {
                    break L77;
                  } else {
                    if (param0 + param1 > vn.field_Ab.length) {
                      break L77;
                    } else {
                      break L76;
                    }
                  }
                }
                vn.field_Ab = new int[(param0 + param1) * 2];
                break L76;
              }
              if (ok.field_Lb != null) {
                if (ok.field_Lb.length < param1) {
                  ok.field_Lb = new boolean[2 * param1];
                  ed.field_b = 0;
                  bj.field_gb = -2147483648;
                  bh.field_F = 2147483647;
                  nj.field_t = 2147483647;
                  eb.field_y = -2147483648;
                  return;
                } else {
                  ed.field_b = 0;
                  bj.field_gb = -2147483648;
                  bh.field_F = 2147483647;
                  nj.field_t = 2147483647;
                  eb.field_y = -2147483648;
                  return;
                }
              } else {
                ok.field_Lb = new boolean[2 * param1];
                ed.field_b = 0;
                bj.field_gb = -2147483648;
                bh.field_F = 2147483647;
                nj.field_t = 2147483647;
                eb.field_y = -2147483648;
                return;
              }
            } else {
              return;
            }
          }
        }
    }

    abstract void a(java.awt.Component param0, int param1);

    final static boolean a(String param0, boolean param1) {
        String var2 = null;
        Exception var2_ref = null;
        int var3 = 0;
        int var4 = 0;
        int stackIn_4_0 = 0;
        int stackIn_9_0 = 0;
        int stackIn_12_0 = 0;
        int stackIn_17_0 = 0;
        int stackIn_20_0 = 0;
        Throwable decompiledCaughtException = null;
        int stackOut_3_0 = 0;
        int stackOut_8_0 = 0;
        int stackOut_19_0 = 0;
        int stackOut_16_0 = 0;
        int stackOut_11_0 = 0;
        var4 = Chess.field_G;
        try {
          L0: {
            if (!jk.field_c.startsWith("win")) {
              stackOut_3_0 = 0;
              stackIn_4_0 = stackOut_3_0;
              return stackIn_4_0 != 0;
            } else {
              L1: {
                if (param0.startsWith("http://")) {
                  break L1;
                } else {
                  if (!param0.startsWith("https://")) {
                    stackOut_8_0 = 0;
                    stackIn_9_0 = stackOut_8_0;
                    return stackIn_9_0 != 0;
                  } else {
                    break L1;
                  }
                }
              }
              var2 = "abcdefghijklmnopqrstuvwxyzABCDEFGHIJKLMNOPQRSTUVWXYZ0123456789?&=,.%+-_#:/*";
              if (!param1) {
                var3 = 0;
                L2: while (true) {
                  if (param0.length() <= var3) {
                    Process discarded$2 = Runtime.getRuntime().exec("cmd /c start \"j\" \"" + param0 + "\"");
                    stackOut_19_0 = 1;
                    stackIn_20_0 = stackOut_19_0;
                    break L0;
                  } else {
                    if (0 != (var2.indexOf((int) param0.charAt(var3)) ^ -1)) {
                      var3++;
                      continue L2;
                    } else {
                      stackOut_16_0 = 0;
                      stackIn_17_0 = stackOut_16_0;
                      return stackIn_17_0 != 0;
                    }
                  }
                }
              } else {
                stackOut_11_0 = 1;
                stackIn_12_0 = stackOut_11_0;
                return stackIn_12_0 != 0;
              }
            }
          }
        } catch (java.lang.Exception decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2_ref = (Exception) (Object) decompiledCaughtException;
          return false;
        }
        return stackIn_20_0 != 0;
    }

    final static void a(int param0, int param1, int param2, int param3, int param4, int param5, byte param6, int param7) {
        if (param6 != 63) {
          ek.a(90, -50, (byte) -48);
          wb.a(-param3 + param2, param1 - param3, param3 * 2 + param7 - param2, -param1 + param4 - -(param3 * 2), param3, param5, 170);
          wb.a(param2 - param3, -param3 + param1, param3 * 2 + param7 - param2, param4 - param1 - -(2 * param3), param3, param0);
          return;
        } else {
          wb.a(-param3 + param2, param1 - param3, param3 * 2 + param7 - param2, -param1 + param4 - -(param3 * 2), param3, param5, 170);
          wb.a(param2 - param3, -param3 + param1, param3 * 2 + param7 - param2, param4 - param1 - -(2 * param3), param3, param0);
          return;
        }
    }

    public static void b(byte param0) {
        if (param0 != 30) {
            return;
        }
        field_f = null;
        field_c = null;
        field_e = null;
        field_d = null;
    }

    abstract void a(byte param0, java.awt.Component param1);

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_d = new mk();
        field_f = new String[]{"Total player time (minutes)"};
        field_e = "This password contains your email address, and would be easy to guess";
    }
}
