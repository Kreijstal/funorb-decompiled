/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class fg extends eh {
    static String field_nb;
    static bi field_mb;
    String field_ob;
    int field_lb;
    String field_kb;
    static String field_pb;

    public static void f(int param0) {
        field_pb = null;
        if (param0 != 11148) {
            field_nb = (String) null;
            field_nb = null;
            field_mb = null;
            return;
        }
        field_nb = null;
        field_mb = null;
    }

    final static void a(int param0, int param1, byte param2) {
        int var3 = 0;
        L0: {
          L1: {
            if (null == ci.field_a) {
              break L1;
            } else {
              if (ci.field_a.length >= param1) {
                break L0;
              } else {
                break L1;
              }
            }
          }
          ci.field_a = new int[param1 * 2];
          break L0;
        }
        if (null == an.field_n) {
          L2: {
            L3: {
              an.field_n = new int[2 * param1];
              if (am.field_I == null) {
                break L3;
              } else {
                if (am.field_I.length >= param1) {
                  break L2;
                } else {
                  break L3;
                }
              }
            }
            am.field_I = new int[param1 * 2];
            break L2;
          }
          L4: {
            L5: {
              var3 = -12 % ((param2 - 28) / 35);
              if (null == em.field_b) {
                break L5;
              } else {
                if (em.field_b.length < param1) {
                  break L5;
                } else {
                  break L4;
                }
              }
            }
            em.field_b = new int[2 * param1];
            break L4;
          }
          L6: {
            L7: {
              if (oc.field_m == null) {
                break L7;
              } else {
                if (oc.field_m.length >= param1) {
                  break L6;
                } else {
                  break L7;
                }
              }
            }
            oc.field_m = new int[2 * param1];
            break L6;
          }
          L8: {
            L9: {
              if (null == ik.field_cb) {
                break L9;
              } else {
                if (ik.field_cb.length < param1) {
                  break L9;
                } else {
                  break L8;
                }
              }
            }
            ik.field_cb = new int[param1 * 2];
            break L8;
          }
          L10: {
            L11: {
              if (sj.field_rb == null) {
                break L11;
              } else {
                if (param0 + param1 > sj.field_rb.length) {
                  break L11;
                } else {
                  break L10;
                }
              }
            }
            sj.field_rb = new int[2 * (param1 - -param0)];
            break L10;
          }
          L12: {
            L13: {
              if (null == ua.field_a) {
                break L13;
              } else {
                if (param1 > ua.field_a.length) {
                  break L13;
                } else {
                  break L12;
                }
              }
            }
            ua.field_a = new boolean[2 * param1];
            break L12;
          }
          hj.field_j = -2147483648;
          ka.field_P = -2147483648;
          cg.field_f = 2147483647;
          mi.field_f = 2147483647;
          mc.field_c = 0;
          return;
        } else {
          if (param1 > an.field_n.length) {
            L14: {
              L15: {
                an.field_n = new int[2 * param1];
                if (am.field_I == null) {
                  break L15;
                } else {
                  if (am.field_I.length >= param1) {
                    break L14;
                  } else {
                    break L15;
                  }
                }
              }
              am.field_I = new int[param1 * 2];
              break L14;
            }
            L16: {
              L17: {
                var3 = -12 % ((param2 - 28) / 35);
                if (null == em.field_b) {
                  break L17;
                } else {
                  if (em.field_b.length < param1) {
                    break L17;
                  } else {
                    break L16;
                  }
                }
              }
              em.field_b = new int[2 * param1];
              break L16;
            }
            if (oc.field_m != null) {
              if (oc.field_m.length >= param1) {
                L18: {
                  L19: {
                    if (null == ik.field_cb) {
                      break L19;
                    } else {
                      if (ik.field_cb.length < param1) {
                        break L19;
                      } else {
                        break L18;
                      }
                    }
                  }
                  ik.field_cb = new int[param1 * 2];
                  break L18;
                }
                L20: {
                  L21: {
                    if (sj.field_rb == null) {
                      break L21;
                    } else {
                      if (param0 + param1 > sj.field_rb.length) {
                        break L21;
                      } else {
                        break L20;
                      }
                    }
                  }
                  sj.field_rb = new int[2 * (param1 - -param0)];
                  break L20;
                }
                L22: {
                  L23: {
                    if (null == ua.field_a) {
                      break L23;
                    } else {
                      if (param1 > ua.field_a.length) {
                        break L23;
                      } else {
                        break L22;
                      }
                    }
                  }
                  ua.field_a = new boolean[2 * param1];
                  break L22;
                }
                hj.field_j = -2147483648;
                ka.field_P = -2147483648;
                cg.field_f = 2147483647;
                mi.field_f = 2147483647;
                mc.field_c = 0;
                return;
              } else {
                L24: {
                  L25: {
                    oc.field_m = new int[2 * param1];
                    if (null == ik.field_cb) {
                      break L25;
                    } else {
                      if (ik.field_cb.length < param1) {
                        break L25;
                      } else {
                        break L24;
                      }
                    }
                  }
                  ik.field_cb = new int[param1 * 2];
                  break L24;
                }
                L26: {
                  L27: {
                    if (sj.field_rb == null) {
                      break L27;
                    } else {
                      if (param0 + param1 > sj.field_rb.length) {
                        break L27;
                      } else {
                        break L26;
                      }
                    }
                  }
                  sj.field_rb = new int[2 * (param1 - -param0)];
                  break L26;
                }
                L28: {
                  L29: {
                    if (null == ua.field_a) {
                      break L29;
                    } else {
                      if (param1 > ua.field_a.length) {
                        break L29;
                      } else {
                        break L28;
                      }
                    }
                  }
                  ua.field_a = new boolean[2 * param1];
                  break L28;
                }
                hj.field_j = -2147483648;
                ka.field_P = -2147483648;
                cg.field_f = 2147483647;
                mi.field_f = 2147483647;
                mc.field_c = 0;
                return;
              }
            } else {
              L30: {
                L31: {
                  oc.field_m = new int[2 * param1];
                  if (null == ik.field_cb) {
                    break L31;
                  } else {
                    if (ik.field_cb.length < param1) {
                      break L31;
                    } else {
                      break L30;
                    }
                  }
                }
                ik.field_cb = new int[param1 * 2];
                break L30;
              }
              L32: {
                L33: {
                  if (sj.field_rb == null) {
                    break L33;
                  } else {
                    if (param0 + param1 > sj.field_rb.length) {
                      break L33;
                    } else {
                      break L32;
                    }
                  }
                }
                sj.field_rb = new int[2 * (param1 - -param0)];
                break L32;
              }
              L34: {
                L35: {
                  if (null == ua.field_a) {
                    break L35;
                  } else {
                    if (param1 > ua.field_a.length) {
                      break L35;
                    } else {
                      break L34;
                    }
                  }
                }
                ua.field_a = new boolean[2 * param1];
                break L34;
              }
              hj.field_j = -2147483648;
              ka.field_P = -2147483648;
              cg.field_f = 2147483647;
              mi.field_f = 2147483647;
              mc.field_c = 0;
              return;
            }
          } else {
            if (am.field_I == null) {
              L36: {
                L37: {
                  am.field_I = new int[param1 * 2];
                  var3 = -12 % ((param2 - 28) / 35);
                  if (null == em.field_b) {
                    break L37;
                  } else {
                    if (em.field_b.length < param1) {
                      break L37;
                    } else {
                      break L36;
                    }
                  }
                }
                em.field_b = new int[2 * param1];
                break L36;
              }
              if (oc.field_m != null) {
                if (oc.field_m.length < param1) {
                  L38: {
                    L39: {
                      oc.field_m = new int[2 * param1];
                      if (null == ik.field_cb) {
                        break L39;
                      } else {
                        if (ik.field_cb.length < param1) {
                          break L39;
                        } else {
                          break L38;
                        }
                      }
                    }
                    ik.field_cb = new int[param1 * 2];
                    break L38;
                  }
                  L40: {
                    L41: {
                      if (sj.field_rb == null) {
                        break L41;
                      } else {
                        if (param0 + param1 > sj.field_rb.length) {
                          break L41;
                        } else {
                          break L40;
                        }
                      }
                    }
                    sj.field_rb = new int[2 * (param1 - -param0)];
                    break L40;
                  }
                  L42: {
                    L43: {
                      if (null == ua.field_a) {
                        break L43;
                      } else {
                        if (param1 > ua.field_a.length) {
                          break L43;
                        } else {
                          break L42;
                        }
                      }
                    }
                    ua.field_a = new boolean[2 * param1];
                    break L42;
                  }
                  hj.field_j = -2147483648;
                  ka.field_P = -2147483648;
                  cg.field_f = 2147483647;
                  mi.field_f = 2147483647;
                  mc.field_c = 0;
                  return;
                } else {
                  L44: {
                    L45: {
                      if (null == ik.field_cb) {
                        break L45;
                      } else {
                        if (ik.field_cb.length < param1) {
                          break L45;
                        } else {
                          break L44;
                        }
                      }
                    }
                    ik.field_cb = new int[param1 * 2];
                    break L44;
                  }
                  L46: {
                    L47: {
                      if (sj.field_rb == null) {
                        break L47;
                      } else {
                        if (param0 + param1 > sj.field_rb.length) {
                          break L47;
                        } else {
                          break L46;
                        }
                      }
                    }
                    sj.field_rb = new int[2 * (param1 - -param0)];
                    break L46;
                  }
                  L48: {
                    L49: {
                      if (null == ua.field_a) {
                        break L49;
                      } else {
                        if (param1 > ua.field_a.length) {
                          break L49;
                        } else {
                          break L48;
                        }
                      }
                    }
                    ua.field_a = new boolean[2 * param1];
                    break L48;
                  }
                  hj.field_j = -2147483648;
                  ka.field_P = -2147483648;
                  cg.field_f = 2147483647;
                  mi.field_f = 2147483647;
                  mc.field_c = 0;
                  return;
                }
              } else {
                L50: {
                  L51: {
                    oc.field_m = new int[2 * param1];
                    if (null == ik.field_cb) {
                      break L51;
                    } else {
                      if (ik.field_cb.length < param1) {
                        break L51;
                      } else {
                        break L50;
                      }
                    }
                  }
                  ik.field_cb = new int[param1 * 2];
                  break L50;
                }
                L52: {
                  L53: {
                    if (sj.field_rb == null) {
                      break L53;
                    } else {
                      if (param0 + param1 > sj.field_rb.length) {
                        break L53;
                      } else {
                        break L52;
                      }
                    }
                  }
                  sj.field_rb = new int[2 * (param1 - -param0)];
                  break L52;
                }
                L54: {
                  L55: {
                    if (null == ua.field_a) {
                      break L55;
                    } else {
                      if (param1 > ua.field_a.length) {
                        break L55;
                      } else {
                        break L54;
                      }
                    }
                  }
                  ua.field_a = new boolean[2 * param1];
                  break L54;
                }
                hj.field_j = -2147483648;
                ka.field_P = -2147483648;
                cg.field_f = 2147483647;
                mi.field_f = 2147483647;
                mc.field_c = 0;
                return;
              }
            } else {
              if (am.field_I.length >= param1) {
                L56: {
                  L57: {
                    var3 = -12 % ((param2 - 28) / 35);
                    if (null == em.field_b) {
                      break L57;
                    } else {
                      if (em.field_b.length < param1) {
                        break L57;
                      } else {
                        break L56;
                      }
                    }
                  }
                  em.field_b = new int[2 * param1];
                  break L56;
                }
                if (oc.field_m != null) {
                  if (oc.field_m.length < param1) {
                    L58: {
                      L59: {
                        oc.field_m = new int[2 * param1];
                        if (null == ik.field_cb) {
                          break L59;
                        } else {
                          if (ik.field_cb.length < param1) {
                            break L59;
                          } else {
                            break L58;
                          }
                        }
                      }
                      ik.field_cb = new int[param1 * 2];
                      break L58;
                    }
                    L60: {
                      L61: {
                        if (sj.field_rb == null) {
                          break L61;
                        } else {
                          if (param0 + param1 > sj.field_rb.length) {
                            break L61;
                          } else {
                            break L60;
                          }
                        }
                      }
                      sj.field_rb = new int[2 * (param1 - -param0)];
                      break L60;
                    }
                    L62: {
                      L63: {
                        if (null == ua.field_a) {
                          break L63;
                        } else {
                          if (param1 > ua.field_a.length) {
                            break L63;
                          } else {
                            break L62;
                          }
                        }
                      }
                      ua.field_a = new boolean[2 * param1];
                      break L62;
                    }
                    hj.field_j = -2147483648;
                    ka.field_P = -2147483648;
                    cg.field_f = 2147483647;
                    mi.field_f = 2147483647;
                    mc.field_c = 0;
                    return;
                  } else {
                    L64: {
                      L65: {
                        if (null == ik.field_cb) {
                          break L65;
                        } else {
                          if (ik.field_cb.length < param1) {
                            break L65;
                          } else {
                            break L64;
                          }
                        }
                      }
                      ik.field_cb = new int[param1 * 2];
                      break L64;
                    }
                    L66: {
                      L67: {
                        if (sj.field_rb == null) {
                          break L67;
                        } else {
                          if (param0 + param1 > sj.field_rb.length) {
                            break L67;
                          } else {
                            break L66;
                          }
                        }
                      }
                      sj.field_rb = new int[2 * (param1 - -param0)];
                      break L66;
                    }
                    L68: {
                      L69: {
                        if (null == ua.field_a) {
                          break L69;
                        } else {
                          if (param1 > ua.field_a.length) {
                            break L69;
                          } else {
                            break L68;
                          }
                        }
                      }
                      ua.field_a = new boolean[2 * param1];
                      break L68;
                    }
                    hj.field_j = -2147483648;
                    ka.field_P = -2147483648;
                    cg.field_f = 2147483647;
                    mi.field_f = 2147483647;
                    mc.field_c = 0;
                    return;
                  }
                } else {
                  L70: {
                    L71: {
                      oc.field_m = new int[2 * param1];
                      if (null == ik.field_cb) {
                        break L71;
                      } else {
                        if (ik.field_cb.length < param1) {
                          break L71;
                        } else {
                          break L70;
                        }
                      }
                    }
                    ik.field_cb = new int[param1 * 2];
                    break L70;
                  }
                  L72: {
                    L73: {
                      if (sj.field_rb == null) {
                        break L73;
                      } else {
                        if (param0 + param1 > sj.field_rb.length) {
                          break L73;
                        } else {
                          break L72;
                        }
                      }
                    }
                    sj.field_rb = new int[2 * (param1 - -param0)];
                    break L72;
                  }
                  L74: {
                    L75: {
                      if (null == ua.field_a) {
                        break L75;
                      } else {
                        if (param1 > ua.field_a.length) {
                          break L75;
                        } else {
                          break L74;
                        }
                      }
                    }
                    ua.field_a = new boolean[2 * param1];
                    break L74;
                  }
                  hj.field_j = -2147483648;
                  ka.field_P = -2147483648;
                  cg.field_f = 2147483647;
                  mi.field_f = 2147483647;
                  mc.field_c = 0;
                  return;
                }
              } else {
                L76: {
                  L77: {
                    am.field_I = new int[param1 * 2];
                    var3 = -12 % ((param2 - 28) / 35);
                    if (null == em.field_b) {
                      break L77;
                    } else {
                      if (em.field_b.length < param1) {
                        break L77;
                      } else {
                        break L76;
                      }
                    }
                  }
                  em.field_b = new int[2 * param1];
                  break L76;
                }
                if (oc.field_m != null) {
                  if (oc.field_m.length < param1) {
                    L78: {
                      L79: {
                        oc.field_m = new int[2 * param1];
                        if (null == ik.field_cb) {
                          break L79;
                        } else {
                          if (ik.field_cb.length < param1) {
                            break L79;
                          } else {
                            break L78;
                          }
                        }
                      }
                      ik.field_cb = new int[param1 * 2];
                      break L78;
                    }
                    L80: {
                      L81: {
                        if (sj.field_rb == null) {
                          break L81;
                        } else {
                          if (param0 + param1 > sj.field_rb.length) {
                            break L81;
                          } else {
                            break L80;
                          }
                        }
                      }
                      sj.field_rb = new int[2 * (param1 - -param0)];
                      break L80;
                    }
                    L82: {
                      L83: {
                        if (null == ua.field_a) {
                          break L83;
                        } else {
                          if (param1 > ua.field_a.length) {
                            break L83;
                          } else {
                            break L82;
                          }
                        }
                      }
                      ua.field_a = new boolean[2 * param1];
                      break L82;
                    }
                    hj.field_j = -2147483648;
                    ka.field_P = -2147483648;
                    cg.field_f = 2147483647;
                    mi.field_f = 2147483647;
                    mc.field_c = 0;
                    return;
                  } else {
                    L84: {
                      L85: {
                        if (null == ik.field_cb) {
                          break L85;
                        } else {
                          if (ik.field_cb.length < param1) {
                            break L85;
                          } else {
                            break L84;
                          }
                        }
                      }
                      ik.field_cb = new int[param1 * 2];
                      break L84;
                    }
                    L86: {
                      L87: {
                        if (sj.field_rb == null) {
                          break L87;
                        } else {
                          if (param0 + param1 > sj.field_rb.length) {
                            break L87;
                          } else {
                            break L86;
                          }
                        }
                      }
                      sj.field_rb = new int[2 * (param1 - -param0)];
                      break L86;
                    }
                    L88: {
                      L89: {
                        if (null == ua.field_a) {
                          break L89;
                        } else {
                          if (param1 > ua.field_a.length) {
                            break L89;
                          } else {
                            break L88;
                          }
                        }
                      }
                      ua.field_a = new boolean[2 * param1];
                      break L88;
                    }
                    hj.field_j = -2147483648;
                    ka.field_P = -2147483648;
                    cg.field_f = 2147483647;
                    mi.field_f = 2147483647;
                    mc.field_c = 0;
                    return;
                  }
                } else {
                  L90: {
                    L91: {
                      oc.field_m = new int[2 * param1];
                      if (null == ik.field_cb) {
                        break L91;
                      } else {
                        if (ik.field_cb.length < param1) {
                          break L91;
                        } else {
                          break L90;
                        }
                      }
                    }
                    ik.field_cb = new int[param1 * 2];
                    break L90;
                  }
                  L92: {
                    L93: {
                      if (sj.field_rb == null) {
                        break L93;
                      } else {
                        if (param0 + param1 > sj.field_rb.length) {
                          break L93;
                        } else {
                          break L92;
                        }
                      }
                    }
                    sj.field_rb = new int[2 * (param1 - -param0)];
                    break L92;
                  }
                  L94: {
                    L95: {
                      if (null == ua.field_a) {
                        break L95;
                      } else {
                        if (param1 > ua.field_a.length) {
                          break L95;
                        } else {
                          break L94;
                        }
                      }
                    }
                    ua.field_a = new boolean[2 * param1];
                    break L94;
                  }
                  hj.field_j = -2147483648;
                  ka.field_P = -2147483648;
                  cg.field_f = 2147483647;
                  mi.field_f = 2147483647;
                  mc.field_c = 0;
                  return;
                }
              }
            }
          }
        }
    }

    fg() {
        super(0L, (eh) null);
    }

    static {
        field_nb = "SHIELD LOST";
        field_pb = "This password contains your Player Name, and would be easy to guess";
    }
}
