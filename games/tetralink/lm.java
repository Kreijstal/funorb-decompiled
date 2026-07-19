/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class lm {
    int field_k;
    static int[] field_f;
    static int field_g;
    int field_c;
    int field_j;
    int field_a;
    int field_b;
    static String field_l;
    byte[] field_d;
    int field_i;
    byte[] field_e;
    int field_h;

    final static void a(int param0, int param1, byte param2) {
        L0: {
          L1: {
            if (null == go.field_b) {
              break L1;
            } else {
              if (go.field_b.length < param1) {
                break L1;
              } else {
                break L0;
              }
            }
          }
          go.field_b = new int[2 * param1];
          break L0;
        }
        if (null == lb.field_P) {
          lb.field_P = new int[param1 * 2];
          if (ac.field_b != null) {
            if (param1 > ac.field_b.length) {
              L2: {
                L3: {
                  ac.field_b = new int[2 * param1];
                  if (ai.field_g == null) {
                    break L3;
                  } else {
                    if (param1 > ai.field_g.length) {
                      break L3;
                    } else {
                      break L2;
                    }
                  }
                }
                ai.field_g = new int[param1 * 2];
                break L2;
              }
              if (null == gl.field_n) {
                L4: {
                  L5: {
                    gl.field_n = new int[2 * param1];
                    if (null == fe.field_b) {
                      break L5;
                    } else {
                      if (param1 > fe.field_b.length) {
                        break L5;
                      } else {
                        break L4;
                      }
                    }
                  }
                  fe.field_b = new int[2 * param1];
                  break L4;
                }
                L6: {
                  L7: {
                    if (qd.field_W == null) {
                      break L7;
                    } else {
                      if (param0 + param1 > qd.field_W.length) {
                        break L7;
                      } else {
                        break L6;
                      }
                    }
                  }
                  qd.field_W = new int[2 * (param0 + param1)];
                  break L6;
                }
                L8: {
                  L9: {
                    if (uk.field_w == null) {
                      break L9;
                    } else {
                      if (uk.field_w.length < param1) {
                        break L9;
                      } else {
                        break L8;
                      }
                    }
                  }
                  uk.field_w = new boolean[2 * param1];
                  break L8;
                }
                nd.field_Mb = 0;
                ai.field_h = 2147483647;
                if (param2 != 71) {
                  return;
                } else {
                  mh.field_d = 2147483647;
                  eh.field_s = -2147483648;
                  va.field_z = -2147483648;
                  return;
                }
              } else {
                if (gl.field_n.length >= param1) {
                  L10: {
                    L11: {
                      if (null == fe.field_b) {
                        break L11;
                      } else {
                        if (param1 > fe.field_b.length) {
                          break L11;
                        } else {
                          break L10;
                        }
                      }
                    }
                    fe.field_b = new int[2 * param1];
                    break L10;
                  }
                  L12: {
                    L13: {
                      if (qd.field_W == null) {
                        break L13;
                      } else {
                        if (param0 + param1 > qd.field_W.length) {
                          break L13;
                        } else {
                          break L12;
                        }
                      }
                    }
                    qd.field_W = new int[2 * (param0 + param1)];
                    break L12;
                  }
                  L14: {
                    L15: {
                      if (uk.field_w == null) {
                        break L15;
                      } else {
                        if (uk.field_w.length < param1) {
                          break L15;
                        } else {
                          break L14;
                        }
                      }
                    }
                    uk.field_w = new boolean[2 * param1];
                    break L14;
                  }
                  nd.field_Mb = 0;
                  ai.field_h = 2147483647;
                  if (param2 != 71) {
                    return;
                  } else {
                    mh.field_d = 2147483647;
                    eh.field_s = -2147483648;
                    va.field_z = -2147483648;
                    return;
                  }
                } else {
                  L16: {
                    L17: {
                      gl.field_n = new int[2 * param1];
                      if (null == fe.field_b) {
                        break L17;
                      } else {
                        if (param1 > fe.field_b.length) {
                          break L17;
                        } else {
                          break L16;
                        }
                      }
                    }
                    fe.field_b = new int[2 * param1];
                    break L16;
                  }
                  L18: {
                    L19: {
                      if (qd.field_W == null) {
                        break L19;
                      } else {
                        if (param0 + param1 > qd.field_W.length) {
                          break L19;
                        } else {
                          break L18;
                        }
                      }
                    }
                    qd.field_W = new int[2 * (param0 + param1)];
                    break L18;
                  }
                  L20: {
                    L21: {
                      if (uk.field_w == null) {
                        break L21;
                      } else {
                        if (uk.field_w.length < param1) {
                          break L21;
                        } else {
                          break L20;
                        }
                      }
                    }
                    uk.field_w = new boolean[2 * param1];
                    break L20;
                  }
                  nd.field_Mb = 0;
                  ai.field_h = 2147483647;
                  if (param2 != 71) {
                    return;
                  } else {
                    mh.field_d = 2147483647;
                    eh.field_s = -2147483648;
                    va.field_z = -2147483648;
                    return;
                  }
                }
              }
            } else {
              L22: {
                L23: {
                  if (ai.field_g == null) {
                    break L23;
                  } else {
                    if (param1 > ai.field_g.length) {
                      break L23;
                    } else {
                      break L22;
                    }
                  }
                }
                ai.field_g = new int[param1 * 2];
                break L22;
              }
              L24: {
                L25: {
                  if (null == gl.field_n) {
                    break L25;
                  } else {
                    if (gl.field_n.length >= param1) {
                      break L24;
                    } else {
                      break L25;
                    }
                  }
                }
                gl.field_n = new int[2 * param1];
                break L24;
              }
              L26: {
                L27: {
                  if (null == fe.field_b) {
                    break L27;
                  } else {
                    if (param1 > fe.field_b.length) {
                      break L27;
                    } else {
                      break L26;
                    }
                  }
                }
                fe.field_b = new int[2 * param1];
                break L26;
              }
              L28: {
                L29: {
                  if (qd.field_W == null) {
                    break L29;
                  } else {
                    if (param0 + param1 > qd.field_W.length) {
                      break L29;
                    } else {
                      break L28;
                    }
                  }
                }
                qd.field_W = new int[2 * (param0 + param1)];
                break L28;
              }
              L30: {
                L31: {
                  if (uk.field_w == null) {
                    break L31;
                  } else {
                    if (uk.field_w.length < param1) {
                      break L31;
                    } else {
                      break L30;
                    }
                  }
                }
                uk.field_w = new boolean[2 * param1];
                break L30;
              }
              nd.field_Mb = 0;
              ai.field_h = 2147483647;
              if (param2 != 71) {
                return;
              } else {
                mh.field_d = 2147483647;
                eh.field_s = -2147483648;
                va.field_z = -2147483648;
                return;
              }
            }
          } else {
            L32: {
              L33: {
                ac.field_b = new int[2 * param1];
                if (ai.field_g == null) {
                  break L33;
                } else {
                  if (param1 > ai.field_g.length) {
                    break L33;
                  } else {
                    break L32;
                  }
                }
              }
              ai.field_g = new int[param1 * 2];
              break L32;
            }
            L34: {
              L35: {
                if (null == gl.field_n) {
                  break L35;
                } else {
                  if (gl.field_n.length >= param1) {
                    break L34;
                  } else {
                    break L35;
                  }
                }
              }
              gl.field_n = new int[2 * param1];
              break L34;
            }
            L36: {
              L37: {
                if (null == fe.field_b) {
                  break L37;
                } else {
                  if (param1 > fe.field_b.length) {
                    break L37;
                  } else {
                    break L36;
                  }
                }
              }
              fe.field_b = new int[2 * param1];
              break L36;
            }
            L38: {
              L39: {
                if (qd.field_W == null) {
                  break L39;
                } else {
                  if (param0 + param1 > qd.field_W.length) {
                    break L39;
                  } else {
                    break L38;
                  }
                }
              }
              qd.field_W = new int[2 * (param0 + param1)];
              break L38;
            }
            L40: {
              L41: {
                if (uk.field_w == null) {
                  break L41;
                } else {
                  if (uk.field_w.length < param1) {
                    break L41;
                  } else {
                    break L40;
                  }
                }
              }
              uk.field_w = new boolean[2 * param1];
              break L40;
            }
            nd.field_Mb = 0;
            ai.field_h = 2147483647;
            if (param2 != 71) {
              return;
            } else {
              mh.field_d = 2147483647;
              eh.field_s = -2147483648;
              va.field_z = -2147483648;
              return;
            }
          }
        } else {
          if (lb.field_P.length >= param1) {
            if (ac.field_b == null) {
              L42: {
                L43: {
                  ac.field_b = new int[2 * param1];
                  if (ai.field_g == null) {
                    break L43;
                  } else {
                    if (param1 > ai.field_g.length) {
                      break L43;
                    } else {
                      break L42;
                    }
                  }
                }
                ai.field_g = new int[param1 * 2];
                break L42;
              }
              if (null == gl.field_n) {
                L44: {
                  L45: {
                    gl.field_n = new int[2 * param1];
                    if (null == fe.field_b) {
                      break L45;
                    } else {
                      if (param1 > fe.field_b.length) {
                        break L45;
                      } else {
                        break L44;
                      }
                    }
                  }
                  fe.field_b = new int[2 * param1];
                  break L44;
                }
                L46: {
                  L47: {
                    if (qd.field_W == null) {
                      break L47;
                    } else {
                      if (param0 + param1 > qd.field_W.length) {
                        break L47;
                      } else {
                        break L46;
                      }
                    }
                  }
                  qd.field_W = new int[2 * (param0 + param1)];
                  break L46;
                }
                L48: {
                  L49: {
                    if (uk.field_w == null) {
                      break L49;
                    } else {
                      if (uk.field_w.length < param1) {
                        break L49;
                      } else {
                        break L48;
                      }
                    }
                  }
                  uk.field_w = new boolean[2 * param1];
                  break L48;
                }
                nd.field_Mb = 0;
                ai.field_h = 2147483647;
                if (param2 == 71) {
                  mh.field_d = 2147483647;
                  eh.field_s = -2147483648;
                  va.field_z = -2147483648;
                  return;
                } else {
                  return;
                }
              } else {
                if (gl.field_n.length >= param1) {
                  L50: {
                    L51: {
                      if (null == fe.field_b) {
                        break L51;
                      } else {
                        if (param1 > fe.field_b.length) {
                          break L51;
                        } else {
                          break L50;
                        }
                      }
                    }
                    fe.field_b = new int[2 * param1];
                    break L50;
                  }
                  L52: {
                    L53: {
                      if (qd.field_W == null) {
                        break L53;
                      } else {
                        if (param0 + param1 > qd.field_W.length) {
                          break L53;
                        } else {
                          break L52;
                        }
                      }
                    }
                    qd.field_W = new int[2 * (param0 + param1)];
                    break L52;
                  }
                  L54: {
                    L55: {
                      if (uk.field_w == null) {
                        break L55;
                      } else {
                        if (uk.field_w.length < param1) {
                          break L55;
                        } else {
                          break L54;
                        }
                      }
                    }
                    uk.field_w = new boolean[2 * param1];
                    break L54;
                  }
                  nd.field_Mb = 0;
                  ai.field_h = 2147483647;
                  if (param2 == 71) {
                    mh.field_d = 2147483647;
                    eh.field_s = -2147483648;
                    va.field_z = -2147483648;
                    return;
                  } else {
                    return;
                  }
                } else {
                  L56: {
                    L57: {
                      gl.field_n = new int[2 * param1];
                      if (null == fe.field_b) {
                        break L57;
                      } else {
                        if (param1 > fe.field_b.length) {
                          break L57;
                        } else {
                          break L56;
                        }
                      }
                    }
                    fe.field_b = new int[2 * param1];
                    break L56;
                  }
                  L58: {
                    L59: {
                      if (qd.field_W == null) {
                        break L59;
                      } else {
                        if (param0 + param1 > qd.field_W.length) {
                          break L59;
                        } else {
                          break L58;
                        }
                      }
                    }
                    qd.field_W = new int[2 * (param0 + param1)];
                    break L58;
                  }
                  L60: {
                    L61: {
                      if (uk.field_w == null) {
                        break L61;
                      } else {
                        if (uk.field_w.length < param1) {
                          break L61;
                        } else {
                          break L60;
                        }
                      }
                    }
                    uk.field_w = new boolean[2 * param1];
                    break L60;
                  }
                  nd.field_Mb = 0;
                  ai.field_h = 2147483647;
                  if (param2 == 71) {
                    mh.field_d = 2147483647;
                    eh.field_s = -2147483648;
                    va.field_z = -2147483648;
                    return;
                  } else {
                    return;
                  }
                }
              }
            } else {
              if (param1 <= ac.field_b.length) {
                L62: {
                  L63: {
                    if (ai.field_g == null) {
                      break L63;
                    } else {
                      if (param1 > ai.field_g.length) {
                        break L63;
                      } else {
                        break L62;
                      }
                    }
                  }
                  ai.field_g = new int[param1 * 2];
                  break L62;
                }
                if (null == gl.field_n) {
                  L64: {
                    L65: {
                      gl.field_n = new int[2 * param1];
                      if (null == fe.field_b) {
                        break L65;
                      } else {
                        if (param1 > fe.field_b.length) {
                          break L65;
                        } else {
                          break L64;
                        }
                      }
                    }
                    fe.field_b = new int[2 * param1];
                    break L64;
                  }
                  L66: {
                    L67: {
                      if (qd.field_W == null) {
                        break L67;
                      } else {
                        if (param0 + param1 > qd.field_W.length) {
                          break L67;
                        } else {
                          break L66;
                        }
                      }
                    }
                    qd.field_W = new int[2 * (param0 + param1)];
                    break L66;
                  }
                  L68: {
                    L69: {
                      if (uk.field_w == null) {
                        break L69;
                      } else {
                        if (uk.field_w.length < param1) {
                          break L69;
                        } else {
                          break L68;
                        }
                      }
                    }
                    uk.field_w = new boolean[2 * param1];
                    break L68;
                  }
                  nd.field_Mb = 0;
                  ai.field_h = 2147483647;
                  if (param2 == 71) {
                    mh.field_d = 2147483647;
                    eh.field_s = -2147483648;
                    va.field_z = -2147483648;
                    return;
                  } else {
                    return;
                  }
                } else {
                  if (gl.field_n.length >= param1) {
                    L70: {
                      L71: {
                        if (null == fe.field_b) {
                          break L71;
                        } else {
                          if (param1 > fe.field_b.length) {
                            break L71;
                          } else {
                            break L70;
                          }
                        }
                      }
                      fe.field_b = new int[2 * param1];
                      break L70;
                    }
                    L72: {
                      L73: {
                        if (qd.field_W == null) {
                          break L73;
                        } else {
                          if (param0 + param1 > qd.field_W.length) {
                            break L73;
                          } else {
                            break L72;
                          }
                        }
                      }
                      qd.field_W = new int[2 * (param0 + param1)];
                      break L72;
                    }
                    L74: {
                      L75: {
                        if (uk.field_w == null) {
                          break L75;
                        } else {
                          if (uk.field_w.length < param1) {
                            break L75;
                          } else {
                            break L74;
                          }
                        }
                      }
                      uk.field_w = new boolean[2 * param1];
                      break L74;
                    }
                    nd.field_Mb = 0;
                    ai.field_h = 2147483647;
                    if (param2 == 71) {
                      mh.field_d = 2147483647;
                      eh.field_s = -2147483648;
                      va.field_z = -2147483648;
                      return;
                    } else {
                      return;
                    }
                  } else {
                    L76: {
                      L77: {
                        gl.field_n = new int[2 * param1];
                        if (null == fe.field_b) {
                          break L77;
                        } else {
                          if (param1 > fe.field_b.length) {
                            break L77;
                          } else {
                            break L76;
                          }
                        }
                      }
                      fe.field_b = new int[2 * param1];
                      break L76;
                    }
                    L78: {
                      L79: {
                        if (qd.field_W == null) {
                          break L79;
                        } else {
                          if (param0 + param1 > qd.field_W.length) {
                            break L79;
                          } else {
                            break L78;
                          }
                        }
                      }
                      qd.field_W = new int[2 * (param0 + param1)];
                      break L78;
                    }
                    L80: {
                      L81: {
                        if (uk.field_w == null) {
                          break L81;
                        } else {
                          if (uk.field_w.length < param1) {
                            break L81;
                          } else {
                            break L80;
                          }
                        }
                      }
                      uk.field_w = new boolean[2 * param1];
                      break L80;
                    }
                    nd.field_Mb = 0;
                    ai.field_h = 2147483647;
                    if (param2 == 71) {
                      mh.field_d = 2147483647;
                      eh.field_s = -2147483648;
                      va.field_z = -2147483648;
                      return;
                    } else {
                      return;
                    }
                  }
                }
              } else {
                L82: {
                  L83: {
                    ac.field_b = new int[2 * param1];
                    if (ai.field_g == null) {
                      break L83;
                    } else {
                      if (param1 > ai.field_g.length) {
                        break L83;
                      } else {
                        break L82;
                      }
                    }
                  }
                  ai.field_g = new int[param1 * 2];
                  break L82;
                }
                if (null == gl.field_n) {
                  L84: {
                    L85: {
                      gl.field_n = new int[2 * param1];
                      if (null == fe.field_b) {
                        break L85;
                      } else {
                        if (param1 > fe.field_b.length) {
                          break L85;
                        } else {
                          break L84;
                        }
                      }
                    }
                    fe.field_b = new int[2 * param1];
                    break L84;
                  }
                  L86: {
                    L87: {
                      if (qd.field_W == null) {
                        break L87;
                      } else {
                        if (param0 + param1 > qd.field_W.length) {
                          break L87;
                        } else {
                          break L86;
                        }
                      }
                    }
                    qd.field_W = new int[2 * (param0 + param1)];
                    break L86;
                  }
                  L88: {
                    L89: {
                      if (uk.field_w == null) {
                        break L89;
                      } else {
                        if (uk.field_w.length < param1) {
                          break L89;
                        } else {
                          break L88;
                        }
                      }
                    }
                    uk.field_w = new boolean[2 * param1];
                    break L88;
                  }
                  nd.field_Mb = 0;
                  ai.field_h = 2147483647;
                  if (param2 != 71) {
                    return;
                  } else {
                    mh.field_d = 2147483647;
                    eh.field_s = -2147483648;
                    va.field_z = -2147483648;
                    return;
                  }
                } else {
                  if (gl.field_n.length >= param1) {
                    L90: {
                      L91: {
                        if (null == fe.field_b) {
                          break L91;
                        } else {
                          if (param1 > fe.field_b.length) {
                            break L91;
                          } else {
                            break L90;
                          }
                        }
                      }
                      fe.field_b = new int[2 * param1];
                      break L90;
                    }
                    L92: {
                      L93: {
                        if (qd.field_W == null) {
                          break L93;
                        } else {
                          if (param0 + param1 > qd.field_W.length) {
                            break L93;
                          } else {
                            break L92;
                          }
                        }
                      }
                      qd.field_W = new int[2 * (param0 + param1)];
                      break L92;
                    }
                    L94: {
                      L95: {
                        if (uk.field_w == null) {
                          break L95;
                        } else {
                          if (uk.field_w.length < param1) {
                            break L95;
                          } else {
                            break L94;
                          }
                        }
                      }
                      uk.field_w = new boolean[2 * param1];
                      break L94;
                    }
                    nd.field_Mb = 0;
                    ai.field_h = 2147483647;
                    if (param2 == 71) {
                      mh.field_d = 2147483647;
                      eh.field_s = -2147483648;
                      va.field_z = -2147483648;
                      return;
                    } else {
                      return;
                    }
                  } else {
                    L96: {
                      L97: {
                        gl.field_n = new int[2 * param1];
                        if (null == fe.field_b) {
                          break L97;
                        } else {
                          if (param1 > fe.field_b.length) {
                            break L97;
                          } else {
                            break L96;
                          }
                        }
                      }
                      fe.field_b = new int[2 * param1];
                      break L96;
                    }
                    L98: {
                      L99: {
                        if (qd.field_W == null) {
                          break L99;
                        } else {
                          if (param0 + param1 > qd.field_W.length) {
                            break L99;
                          } else {
                            break L98;
                          }
                        }
                      }
                      qd.field_W = new int[2 * (param0 + param1)];
                      break L98;
                    }
                    L100: {
                      L101: {
                        if (uk.field_w == null) {
                          break L101;
                        } else {
                          if (uk.field_w.length < param1) {
                            break L101;
                          } else {
                            break L100;
                          }
                        }
                      }
                      uk.field_w = new boolean[2 * param1];
                      break L100;
                    }
                    nd.field_Mb = 0;
                    ai.field_h = 2147483647;
                    if (param2 != 71) {
                      return;
                    } else {
                      mh.field_d = 2147483647;
                      eh.field_s = -2147483648;
                      va.field_z = -2147483648;
                      return;
                    }
                  }
                }
              }
            }
          } else {
            L102: {
              L103: {
                lb.field_P = new int[param1 * 2];
                if (ac.field_b == null) {
                  break L103;
                } else {
                  if (param1 <= ac.field_b.length) {
                    break L102;
                  } else {
                    break L103;
                  }
                }
              }
              ac.field_b = new int[2 * param1];
              break L102;
            }
            L104: {
              L105: {
                if (ai.field_g == null) {
                  break L105;
                } else {
                  if (param1 > ai.field_g.length) {
                    break L105;
                  } else {
                    break L104;
                  }
                }
              }
              ai.field_g = new int[param1 * 2];
              break L104;
            }
            L106: {
              L107: {
                if (null == gl.field_n) {
                  break L107;
                } else {
                  if (gl.field_n.length >= param1) {
                    break L106;
                  } else {
                    break L107;
                  }
                }
              }
              gl.field_n = new int[2 * param1];
              break L106;
            }
            L108: {
              L109: {
                if (null == fe.field_b) {
                  break L109;
                } else {
                  if (param1 > fe.field_b.length) {
                    break L109;
                  } else {
                    break L108;
                  }
                }
              }
              fe.field_b = new int[2 * param1];
              break L108;
            }
            L110: {
              L111: {
                if (qd.field_W == null) {
                  break L111;
                } else {
                  if (param0 + param1 > qd.field_W.length) {
                    break L111;
                  } else {
                    break L110;
                  }
                }
              }
              qd.field_W = new int[2 * (param0 + param1)];
              break L110;
            }
            L112: {
              L113: {
                if (uk.field_w == null) {
                  break L113;
                } else {
                  if (uk.field_w.length < param1) {
                    break L113;
                  } else {
                    break L112;
                  }
                }
              }
              uk.field_w = new boolean[2 * param1];
              break L112;
            }
            nd.field_Mb = 0;
            ai.field_h = 2147483647;
            if (param2 != 71) {
              return;
            } else {
              mh.field_d = 2147483647;
              eh.field_s = -2147483648;
              va.field_z = -2147483648;
              return;
            }
          }
        }
    }

    public static void a(int param0) {
        if (param0 != 2) {
            field_l = (String) null;
            field_l = null;
            field_f = null;
            return;
        }
        field_l = null;
        field_f = null;
    }

    static {
        field_l = "Return to game";
    }
}
