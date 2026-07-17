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
            field_nb = null;
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
              var3 = 0;
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
              an.field_n = new int[2 * param1];
              if (am.field_I == null) {
                break L14;
              } else {
                if (am.field_I.length < param1) {
                  break L14;
                } else {
                  L15: {
                    L16: {
                      var3 = 0;
                      if (null == em.field_b) {
                        break L16;
                      } else {
                        if (em.field_b.length < param1) {
                          break L16;
                        } else {
                          break L15;
                        }
                      }
                    }
                    em.field_b = new int[2 * param1];
                    break L15;
                  }
                  L17: {
                    L18: {
                      if (oc.field_m == null) {
                        break L18;
                      } else {
                        if (oc.field_m.length >= param1) {
                          break L17;
                        } else {
                          break L18;
                        }
                      }
                    }
                    oc.field_m = new int[2 * param1];
                    break L17;
                  }
                  L19: {
                    L20: {
                      if (null == ik.field_cb) {
                        break L20;
                      } else {
                        if (ik.field_cb.length < param1) {
                          break L20;
                        } else {
                          break L19;
                        }
                      }
                    }
                    ik.field_cb = new int[param1 * 2];
                    break L19;
                  }
                  L21: {
                    L22: {
                      if (sj.field_rb == null) {
                        break L22;
                      } else {
                        if (param0 + param1 > sj.field_rb.length) {
                          break L22;
                        } else {
                          break L21;
                        }
                      }
                    }
                    sj.field_rb = new int[2 * (param1 - -param0)];
                    break L21;
                  }
                  L23: {
                    L24: {
                      if (null == ua.field_a) {
                        break L24;
                      } else {
                        if (param1 > ua.field_a.length) {
                          break L24;
                        } else {
                          break L23;
                        }
                      }
                    }
                    ua.field_a = new boolean[2 * param1];
                    break L23;
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
            am.field_I = new int[param1 * 2];
            var3 = 0;
            if (null != em.field_b) {
              L25: {
                if (em.field_b.length < param1) {
                  em.field_b = new int[2 * param1];
                  break L25;
                } else {
                  break L25;
                }
              }
              if (oc.field_m != null) {
                if (oc.field_m.length < param1) {
                  L26: {
                    L27: {
                      oc.field_m = new int[2 * param1];
                      if (null == ik.field_cb) {
                        break L27;
                      } else {
                        if (ik.field_cb.length < param1) {
                          break L27;
                        } else {
                          break L26;
                        }
                      }
                    }
                    ik.field_cb = new int[param1 * 2];
                    break L26;
                  }
                  L28: {
                    L29: {
                      if (sj.field_rb == null) {
                        break L29;
                      } else {
                        if (param0 + param1 > sj.field_rb.length) {
                          break L29;
                        } else {
                          break L28;
                        }
                      }
                    }
                    sj.field_rb = new int[2 * (param1 - -param0)];
                    break L28;
                  }
                  L30: {
                    L31: {
                      if (null == ua.field_a) {
                        break L31;
                      } else {
                        if (param1 > ua.field_a.length) {
                          break L31;
                        } else {
                          break L30;
                        }
                      }
                    }
                    ua.field_a = new boolean[2 * param1];
                    break L30;
                  }
                  hj.field_j = -2147483648;
                  ka.field_P = -2147483648;
                  cg.field_f = 2147483647;
                  mi.field_f = 2147483647;
                  mc.field_c = 0;
                  return;
                } else {
                  L32: {
                    L33: {
                      if (null == ik.field_cb) {
                        break L33;
                      } else {
                        if (ik.field_cb.length < param1) {
                          break L33;
                        } else {
                          break L32;
                        }
                      }
                    }
                    ik.field_cb = new int[param1 * 2];
                    break L32;
                  }
                  L34: {
                    L35: {
                      if (sj.field_rb == null) {
                        break L35;
                      } else {
                        if (param0 + param1 > sj.field_rb.length) {
                          break L35;
                        } else {
                          break L34;
                        }
                      }
                    }
                    sj.field_rb = new int[2 * (param1 - -param0)];
                    break L34;
                  }
                  L36: {
                    L37: {
                      if (null == ua.field_a) {
                        break L37;
                      } else {
                        if (param1 > ua.field_a.length) {
                          break L37;
                        } else {
                          break L36;
                        }
                      }
                    }
                    ua.field_a = new boolean[2 * param1];
                    break L36;
                  }
                  hj.field_j = -2147483648;
                  ka.field_P = -2147483648;
                  cg.field_f = 2147483647;
                  mi.field_f = 2147483647;
                  mc.field_c = 0;
                  return;
                }
              } else {
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
              }
            } else {
              L44: {
                L45: {
                  em.field_b = new int[2 * param1];
                  if (oc.field_m == null) {
                    break L45;
                  } else {
                    if (oc.field_m.length >= param1) {
                      break L44;
                    } else {
                      break L45;
                    }
                  }
                }
                oc.field_m = new int[2 * param1];
                break L44;
              }
              L46: {
                L47: {
                  if (null == ik.field_cb) {
                    break L47;
                  } else {
                    if (ik.field_cb.length < param1) {
                      break L47;
                    } else {
                      break L46;
                    }
                  }
                }
                ik.field_cb = new int[param1 * 2];
                break L46;
              }
              L48: {
                L49: {
                  if (sj.field_rb == null) {
                    break L49;
                  } else {
                    if (param0 + param1 > sj.field_rb.length) {
                      break L49;
                    } else {
                      break L48;
                    }
                  }
                }
                sj.field_rb = new int[2 * (param1 - -param0)];
                break L48;
              }
              L50: {
                L51: {
                  if (null == ua.field_a) {
                    break L51;
                  } else {
                    if (param1 > ua.field_a.length) {
                      break L51;
                    } else {
                      break L50;
                    }
                  }
                }
                ua.field_a = new boolean[2 * param1];
                break L50;
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
              L52: {
                L53: {
                  am.field_I = new int[param1 * 2];
                  var3 = 0;
                  if (null == em.field_b) {
                    break L53;
                  } else {
                    if (em.field_b.length < param1) {
                      break L53;
                    } else {
                      break L52;
                    }
                  }
                }
                em.field_b = new int[2 * param1];
                break L52;
              }
              if (oc.field_m != null) {
                if (oc.field_m.length < param1) {
                  L54: {
                    L55: {
                      oc.field_m = new int[2 * param1];
                      if (null == ik.field_cb) {
                        break L55;
                      } else {
                        if (ik.field_cb.length < param1) {
                          break L55;
                        } else {
                          break L54;
                        }
                      }
                    }
                    ik.field_cb = new int[param1 * 2];
                    break L54;
                  }
                  L56: {
                    L57: {
                      if (sj.field_rb == null) {
                        break L57;
                      } else {
                        if (param0 + param1 > sj.field_rb.length) {
                          break L57;
                        } else {
                          break L56;
                        }
                      }
                    }
                    sj.field_rb = new int[2 * (param1 - -param0)];
                    break L56;
                  }
                  L58: {
                    L59: {
                      if (null == ua.field_a) {
                        break L59;
                      } else {
                        if (param1 > ua.field_a.length) {
                          break L59;
                        } else {
                          break L58;
                        }
                      }
                    }
                    ua.field_a = new boolean[2 * param1];
                    break L58;
                  }
                  hj.field_j = -2147483648;
                  ka.field_P = -2147483648;
                  cg.field_f = 2147483647;
                  mi.field_f = 2147483647;
                  mc.field_c = 0;
                  return;
                } else {
                  L60: {
                    L61: {
                      if (null == ik.field_cb) {
                        break L61;
                      } else {
                        if (ik.field_cb.length < param1) {
                          break L61;
                        } else {
                          break L60;
                        }
                      }
                    }
                    ik.field_cb = new int[param1 * 2];
                    break L60;
                  }
                  L62: {
                    L63: {
                      if (sj.field_rb == null) {
                        break L63;
                      } else {
                        if (param0 + param1 > sj.field_rb.length) {
                          break L63;
                        } else {
                          break L62;
                        }
                      }
                    }
                    sj.field_rb = new int[2 * (param1 - -param0)];
                    break L62;
                  }
                  L64: {
                    L65: {
                      if (null == ua.field_a) {
                        break L65;
                      } else {
                        if (param1 > ua.field_a.length) {
                          break L65;
                        } else {
                          break L64;
                        }
                      }
                    }
                    ua.field_a = new boolean[2 * param1];
                    break L64;
                  }
                  hj.field_j = -2147483648;
                  ka.field_P = -2147483648;
                  cg.field_f = 2147483647;
                  mi.field_f = 2147483647;
                  mc.field_c = 0;
                  return;
                }
              } else {
                L66: {
                  L67: {
                    oc.field_m = new int[2 * param1];
                    if (null == ik.field_cb) {
                      break L67;
                    } else {
                      if (ik.field_cb.length < param1) {
                        break L67;
                      } else {
                        break L66;
                      }
                    }
                  }
                  ik.field_cb = new int[param1 * 2];
                  break L66;
                }
                L68: {
                  L69: {
                    if (sj.field_rb == null) {
                      break L69;
                    } else {
                      if (param0 + param1 > sj.field_rb.length) {
                        break L69;
                      } else {
                        break L68;
                      }
                    }
                  }
                  sj.field_rb = new int[2 * (param1 - -param0)];
                  break L68;
                }
                L70: {
                  L71: {
                    if (null == ua.field_a) {
                      break L71;
                    } else {
                      if (param1 > ua.field_a.length) {
                        break L71;
                      } else {
                        break L70;
                      }
                    }
                  }
                  ua.field_a = new boolean[2 * param1];
                  break L70;
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
                L72: {
                  L73: {
                    var3 = 0;
                    if (null == em.field_b) {
                      break L73;
                    } else {
                      if (em.field_b.length < param1) {
                        break L73;
                      } else {
                        break L72;
                      }
                    }
                  }
                  em.field_b = new int[2 * param1];
                  break L72;
                }
                if (oc.field_m != null) {
                  if (oc.field_m.length < param1) {
                    L74: {
                      L75: {
                        oc.field_m = new int[2 * param1];
                        if (null == ik.field_cb) {
                          break L75;
                        } else {
                          if (ik.field_cb.length < param1) {
                            break L75;
                          } else {
                            break L74;
                          }
                        }
                      }
                      ik.field_cb = new int[param1 * 2];
                      break L74;
                    }
                    L76: {
                      L77: {
                        if (sj.field_rb == null) {
                          break L77;
                        } else {
                          if (param0 + param1 > sj.field_rb.length) {
                            break L77;
                          } else {
                            break L76;
                          }
                        }
                      }
                      sj.field_rb = new int[2 * (param1 - -param0)];
                      break L76;
                    }
                    L78: {
                      L79: {
                        if (null == ua.field_a) {
                          break L79;
                        } else {
                          if (param1 > ua.field_a.length) {
                            break L79;
                          } else {
                            break L78;
                          }
                        }
                      }
                      ua.field_a = new boolean[2 * param1];
                      break L78;
                    }
                    hj.field_j = -2147483648;
                    ka.field_P = -2147483648;
                    cg.field_f = 2147483647;
                    mi.field_f = 2147483647;
                    mc.field_c = 0;
                    return;
                  } else {
                    L80: {
                      L81: {
                        if (null == ik.field_cb) {
                          break L81;
                        } else {
                          if (ik.field_cb.length < param1) {
                            break L81;
                          } else {
                            break L80;
                          }
                        }
                      }
                      ik.field_cb = new int[param1 * 2];
                      break L80;
                    }
                    L82: {
                      L83: {
                        if (sj.field_rb == null) {
                          break L83;
                        } else {
                          if (param0 + param1 > sj.field_rb.length) {
                            break L83;
                          } else {
                            break L82;
                          }
                        }
                      }
                      sj.field_rb = new int[2 * (param1 - -param0)];
                      break L82;
                    }
                    L84: {
                      L85: {
                        if (null == ua.field_a) {
                          break L85;
                        } else {
                          if (param1 > ua.field_a.length) {
                            break L85;
                          } else {
                            break L84;
                          }
                        }
                      }
                      ua.field_a = new boolean[2 * param1];
                      break L84;
                    }
                    hj.field_j = -2147483648;
                    ka.field_P = -2147483648;
                    cg.field_f = 2147483647;
                    mi.field_f = 2147483647;
                    mc.field_c = 0;
                    return;
                  }
                } else {
                  L86: {
                    L87: {
                      oc.field_m = new int[2 * param1];
                      if (null == ik.field_cb) {
                        break L87;
                      } else {
                        if (ik.field_cb.length < param1) {
                          break L87;
                        } else {
                          break L86;
                        }
                      }
                    }
                    ik.field_cb = new int[param1 * 2];
                    break L86;
                  }
                  L88: {
                    L89: {
                      if (sj.field_rb == null) {
                        break L89;
                      } else {
                        if (param0 + param1 > sj.field_rb.length) {
                          break L89;
                        } else {
                          break L88;
                        }
                      }
                    }
                    sj.field_rb = new int[2 * (param1 - -param0)];
                    break L88;
                  }
                  L90: {
                    L91: {
                      if (null == ua.field_a) {
                        break L91;
                      } else {
                        if (param1 > ua.field_a.length) {
                          break L91;
                        } else {
                          break L90;
                        }
                      }
                    }
                    ua.field_a = new boolean[2 * param1];
                    break L90;
                  }
                  hj.field_j = -2147483648;
                  ka.field_P = -2147483648;
                  cg.field_f = 2147483647;
                  mi.field_f = 2147483647;
                  mc.field_c = 0;
                  return;
                }
              } else {
                L92: {
                  L93: {
                    am.field_I = new int[param1 * 2];
                    var3 = 0;
                    if (null == em.field_b) {
                      break L93;
                    } else {
                      if (em.field_b.length < param1) {
                        break L93;
                      } else {
                        break L92;
                      }
                    }
                  }
                  em.field_b = new int[2 * param1];
                  break L92;
                }
                if (oc.field_m != null) {
                  if (oc.field_m.length < param1) {
                    L94: {
                      L95: {
                        oc.field_m = new int[2 * param1];
                        if (null == ik.field_cb) {
                          break L95;
                        } else {
                          if (ik.field_cb.length < param1) {
                            break L95;
                          } else {
                            break L94;
                          }
                        }
                      }
                      ik.field_cb = new int[param1 * 2];
                      break L94;
                    }
                    L96: {
                      L97: {
                        if (sj.field_rb == null) {
                          break L97;
                        } else {
                          if (param0 + param1 > sj.field_rb.length) {
                            break L97;
                          } else {
                            break L96;
                          }
                        }
                      }
                      sj.field_rb = new int[2 * (param1 - -param0)];
                      break L96;
                    }
                    L98: {
                      L99: {
                        if (null == ua.field_a) {
                          break L99;
                        } else {
                          if (param1 > ua.field_a.length) {
                            break L99;
                          } else {
                            break L98;
                          }
                        }
                      }
                      ua.field_a = new boolean[2 * param1];
                      break L98;
                    }
                    hj.field_j = -2147483648;
                    ka.field_P = -2147483648;
                    cg.field_f = 2147483647;
                    mi.field_f = 2147483647;
                    mc.field_c = 0;
                    return;
                  } else {
                    L100: {
                      L101: {
                        if (null == ik.field_cb) {
                          break L101;
                        } else {
                          if (ik.field_cb.length < param1) {
                            break L101;
                          } else {
                            break L100;
                          }
                        }
                      }
                      ik.field_cb = new int[param1 * 2];
                      break L100;
                    }
                    L102: {
                      L103: {
                        if (sj.field_rb == null) {
                          break L103;
                        } else {
                          if (param0 + param1 > sj.field_rb.length) {
                            break L103;
                          } else {
                            break L102;
                          }
                        }
                      }
                      sj.field_rb = new int[2 * (param1 - -param0)];
                      break L102;
                    }
                    L104: {
                      L105: {
                        if (null == ua.field_a) {
                          break L105;
                        } else {
                          if (param1 > ua.field_a.length) {
                            break L105;
                          } else {
                            break L104;
                          }
                        }
                      }
                      ua.field_a = new boolean[2 * param1];
                      break L104;
                    }
                    hj.field_j = -2147483648;
                    ka.field_P = -2147483648;
                    cg.field_f = 2147483647;
                    mi.field_f = 2147483647;
                    mc.field_c = 0;
                    return;
                  }
                } else {
                  L106: {
                    L107: {
                      oc.field_m = new int[2 * param1];
                      if (null == ik.field_cb) {
                        break L107;
                      } else {
                        if (ik.field_cb.length < param1) {
                          break L107;
                        } else {
                          break L106;
                        }
                      }
                    }
                    ik.field_cb = new int[param1 * 2];
                    break L106;
                  }
                  L108: {
                    L109: {
                      if (sj.field_rb == null) {
                        break L109;
                      } else {
                        if (param0 + param1 > sj.field_rb.length) {
                          break L109;
                        } else {
                          break L108;
                        }
                      }
                    }
                    sj.field_rb = new int[2 * (param1 - -param0)];
                    break L108;
                  }
                  L110: {
                    L111: {
                      if (null == ua.field_a) {
                        break L111;
                      } else {
                        if (param1 > ua.field_a.length) {
                          break L111;
                        } else {
                          break L110;
                        }
                      }
                    }
                    ua.field_a = new boolean[2 * param1];
                    break L110;
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
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_nb = "SHIELD LOST";
        field_pb = "This password contains your Player Name, and would be easy to guess";
    }
}
