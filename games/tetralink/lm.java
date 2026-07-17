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

    final static void a(int param0, int param1) {
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
          L2: {
            L3: {
              lb.field_P = new int[param1 * 2];
              if (ac.field_b == null) {
                break L3;
              } else {
                if (param1 <= ac.field_b.length) {
                  break L2;
                } else {
                  break L3;
                }
              }
            }
            ac.field_b = new int[2 * param1];
            break L2;
          }
          L4: {
            L5: {
              if (ai.field_g == null) {
                break L5;
              } else {
                if (param1 > ai.field_g.length) {
                  break L5;
                } else {
                  break L4;
                }
              }
            }
            ai.field_g = new int[param1 * 2];
            break L4;
          }
          if (null != gl.field_n) {
            if (gl.field_n.length < param1) {
              L6: {
                L7: {
                  gl.field_n = new int[2 * param1];
                  if (null == fe.field_b) {
                    break L7;
                  } else {
                    if (param1 > fe.field_b.length) {
                      break L7;
                    } else {
                      break L6;
                    }
                  }
                }
                fe.field_b = new int[2 * param1];
                break L6;
              }
              L8: {
                L9: {
                  if (qd.field_W == null) {
                    break L9;
                  } else {
                    if (param0 + param1 > qd.field_W.length) {
                      break L9;
                    } else {
                      break L8;
                    }
                  }
                }
                qd.field_W = new int[2 * (param0 + param1)];
                break L8;
              }
              L10: {
                L11: {
                  if (uk.field_w == null) {
                    break L11;
                  } else {
                    if (uk.field_w.length < param1) {
                      break L11;
                    } else {
                      break L10;
                    }
                  }
                }
                uk.field_w = new boolean[2 * param1];
                break L10;
              }
              nd.field_Mb = 0;
              ai.field_h = 2147483647;
              mh.field_d = 2147483647;
              eh.field_s = -2147483648;
              va.field_z = -2147483648;
              return;
            } else {
              L12: {
                L13: {
                  if (null == fe.field_b) {
                    break L13;
                  } else {
                    if (param1 > fe.field_b.length) {
                      break L13;
                    } else {
                      break L12;
                    }
                  }
                }
                fe.field_b = new int[2 * param1];
                break L12;
              }
              L14: {
                L15: {
                  if (qd.field_W == null) {
                    break L15;
                  } else {
                    if (param0 + param1 > qd.field_W.length) {
                      break L15;
                    } else {
                      break L14;
                    }
                  }
                }
                qd.field_W = new int[2 * (param0 + param1)];
                break L14;
              }
              L16: {
                L17: {
                  if (uk.field_w == null) {
                    break L17;
                  } else {
                    if (uk.field_w.length < param1) {
                      break L17;
                    } else {
                      break L16;
                    }
                  }
                }
                uk.field_w = new boolean[2 * param1];
                break L16;
              }
              nd.field_Mb = 0;
              ai.field_h = 2147483647;
              mh.field_d = 2147483647;
              eh.field_s = -2147483648;
              va.field_z = -2147483648;
              return;
            }
          } else {
            L18: {
              L19: {
                gl.field_n = new int[2 * param1];
                if (null == fe.field_b) {
                  break L19;
                } else {
                  if (param1 > fe.field_b.length) {
                    break L19;
                  } else {
                    break L18;
                  }
                }
              }
              fe.field_b = new int[2 * param1];
              break L18;
            }
            L20: {
              L21: {
                if (qd.field_W == null) {
                  break L21;
                } else {
                  if (param0 + param1 > qd.field_W.length) {
                    break L21;
                  } else {
                    break L20;
                  }
                }
              }
              qd.field_W = new int[2 * (param0 + param1)];
              break L20;
            }
            L22: {
              L23: {
                if (uk.field_w == null) {
                  break L23;
                } else {
                  if (uk.field_w.length < param1) {
                    break L23;
                  } else {
                    break L22;
                  }
                }
              }
              uk.field_w = new boolean[2 * param1];
              break L22;
            }
            nd.field_Mb = 0;
            ai.field_h = 2147483647;
            mh.field_d = 2147483647;
            eh.field_s = -2147483648;
            va.field_z = -2147483648;
            return;
          }
        } else {
          if (lb.field_P.length >= param1) {
            if (ac.field_b == null) {
              L24: {
                L25: {
                  ac.field_b = new int[2 * param1];
                  if (ai.field_g == null) {
                    break L25;
                  } else {
                    if (param1 > ai.field_g.length) {
                      break L25;
                    } else {
                      break L24;
                    }
                  }
                }
                ai.field_g = new int[param1 * 2];
                break L24;
              }
              if (null != gl.field_n) {
                if (gl.field_n.length < param1) {
                  L26: {
                    L27: {
                      gl.field_n = new int[2 * param1];
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
                  mh.field_d = 2147483647;
                  eh.field_s = -2147483648;
                  va.field_z = -2147483648;
                  return;
                } else {
                  L32: {
                    L33: {
                      if (null == fe.field_b) {
                        break L33;
                      } else {
                        if (param1 > fe.field_b.length) {
                          break L33;
                        } else {
                          break L32;
                        }
                      }
                    }
                    fe.field_b = new int[2 * param1];
                    break L32;
                  }
                  L34: {
                    L35: {
                      if (qd.field_W == null) {
                        break L35;
                      } else {
                        if (param0 + param1 > qd.field_W.length) {
                          break L35;
                        } else {
                          break L34;
                        }
                      }
                    }
                    qd.field_W = new int[2 * (param0 + param1)];
                    break L34;
                  }
                  L36: {
                    L37: {
                      if (uk.field_w == null) {
                        break L37;
                      } else {
                        if (uk.field_w.length < param1) {
                          break L37;
                        } else {
                          break L36;
                        }
                      }
                    }
                    uk.field_w = new boolean[2 * param1];
                    break L36;
                  }
                  nd.field_Mb = 0;
                  ai.field_h = 2147483647;
                  mh.field_d = 2147483647;
                  eh.field_s = -2147483648;
                  va.field_z = -2147483648;
                  return;
                }
              } else {
                L38: {
                  L39: {
                    gl.field_n = new int[2 * param1];
                    if (null == fe.field_b) {
                      break L39;
                    } else {
                      if (param1 > fe.field_b.length) {
                        break L39;
                      } else {
                        break L38;
                      }
                    }
                  }
                  fe.field_b = new int[2 * param1];
                  break L38;
                }
                L40: {
                  L41: {
                    if (qd.field_W == null) {
                      break L41;
                    } else {
                      if (param0 + param1 > qd.field_W.length) {
                        break L41;
                      } else {
                        break L40;
                      }
                    }
                  }
                  qd.field_W = new int[2 * (param0 + param1)];
                  break L40;
                }
                L42: {
                  L43: {
                    if (uk.field_w == null) {
                      break L43;
                    } else {
                      if (uk.field_w.length < param1) {
                        break L43;
                      } else {
                        break L42;
                      }
                    }
                  }
                  uk.field_w = new boolean[2 * param1];
                  break L42;
                }
                nd.field_Mb = 0;
                ai.field_h = 2147483647;
                mh.field_d = 2147483647;
                eh.field_s = -2147483648;
                va.field_z = -2147483648;
                return;
              }
            } else {
              if (param1 <= ac.field_b.length) {
                L44: {
                  L45: {
                    if (ai.field_g == null) {
                      break L45;
                    } else {
                      if (param1 > ai.field_g.length) {
                        break L45;
                      } else {
                        break L44;
                      }
                    }
                  }
                  ai.field_g = new int[param1 * 2];
                  break L44;
                }
                if (null != gl.field_n) {
                  if (gl.field_n.length >= param1) {
                    L46: {
                      L47: {
                        if (null == fe.field_b) {
                          break L47;
                        } else {
                          if (param1 > fe.field_b.length) {
                            break L47;
                          } else {
                            break L46;
                          }
                        }
                      }
                      fe.field_b = new int[2 * param1];
                      break L46;
                    }
                    L48: {
                      L49: {
                        if (qd.field_W == null) {
                          break L49;
                        } else {
                          if (param0 + param1 > qd.field_W.length) {
                            break L49;
                          } else {
                            break L48;
                          }
                        }
                      }
                      qd.field_W = new int[2 * (param0 + param1)];
                      break L48;
                    }
                    L50: {
                      L51: {
                        if (uk.field_w == null) {
                          break L51;
                        } else {
                          if (uk.field_w.length < param1) {
                            break L51;
                          } else {
                            break L50;
                          }
                        }
                      }
                      uk.field_w = new boolean[2 * param1];
                      break L50;
                    }
                    nd.field_Mb = 0;
                    ai.field_h = 2147483647;
                    mh.field_d = 2147483647;
                    eh.field_s = -2147483648;
                    va.field_z = -2147483648;
                    return;
                  } else {
                    L52: {
                      L53: {
                        gl.field_n = new int[2 * param1];
                        if (null == fe.field_b) {
                          break L53;
                        } else {
                          if (param1 > fe.field_b.length) {
                            break L53;
                          } else {
                            break L52;
                          }
                        }
                      }
                      fe.field_b = new int[2 * param1];
                      break L52;
                    }
                    L54: {
                      L55: {
                        if (qd.field_W == null) {
                          break L55;
                        } else {
                          if (param0 + param1 > qd.field_W.length) {
                            break L55;
                          } else {
                            break L54;
                          }
                        }
                      }
                      qd.field_W = new int[2 * (param0 + param1)];
                      break L54;
                    }
                    L56: {
                      L57: {
                        if (uk.field_w == null) {
                          break L57;
                        } else {
                          if (uk.field_w.length < param1) {
                            break L57;
                          } else {
                            break L56;
                          }
                        }
                      }
                      uk.field_w = new boolean[2 * param1];
                      break L56;
                    }
                    nd.field_Mb = 0;
                    ai.field_h = 2147483647;
                    mh.field_d = 2147483647;
                    eh.field_s = -2147483648;
                    va.field_z = -2147483648;
                    return;
                  }
                } else {
                  L58: {
                    L59: {
                      gl.field_n = new int[2 * param1];
                      if (null == fe.field_b) {
                        break L59;
                      } else {
                        if (param1 > fe.field_b.length) {
                          break L59;
                        } else {
                          break L58;
                        }
                      }
                    }
                    fe.field_b = new int[2 * param1];
                    break L58;
                  }
                  L60: {
                    L61: {
                      if (qd.field_W == null) {
                        break L61;
                      } else {
                        if (param0 + param1 > qd.field_W.length) {
                          break L61;
                        } else {
                          break L60;
                        }
                      }
                    }
                    qd.field_W = new int[2 * (param0 + param1)];
                    break L60;
                  }
                  L62: {
                    L63: {
                      if (uk.field_w == null) {
                        break L63;
                      } else {
                        if (uk.field_w.length < param1) {
                          break L63;
                        } else {
                          break L62;
                        }
                      }
                    }
                    uk.field_w = new boolean[2 * param1];
                    break L62;
                  }
                  nd.field_Mb = 0;
                  ai.field_h = 2147483647;
                  mh.field_d = 2147483647;
                  eh.field_s = -2147483648;
                  va.field_z = -2147483648;
                  return;
                }
              } else {
                L64: {
                  L65: {
                    ac.field_b = new int[2 * param1];
                    if (ai.field_g == null) {
                      break L65;
                    } else {
                      if (param1 > ai.field_g.length) {
                        break L65;
                      } else {
                        break L64;
                      }
                    }
                  }
                  ai.field_g = new int[param1 * 2];
                  break L64;
                }
                if (null != gl.field_n) {
                  if (gl.field_n.length < param1) {
                    L66: {
                      L67: {
                        gl.field_n = new int[2 * param1];
                        if (null == fe.field_b) {
                          break L67;
                        } else {
                          if (param1 > fe.field_b.length) {
                            break L67;
                          } else {
                            break L66;
                          }
                        }
                      }
                      fe.field_b = new int[2 * param1];
                      break L66;
                    }
                    L68: {
                      L69: {
                        if (qd.field_W == null) {
                          break L69;
                        } else {
                          if (param0 + param1 > qd.field_W.length) {
                            break L69;
                          } else {
                            break L68;
                          }
                        }
                      }
                      qd.field_W = new int[2 * (param0 + param1)];
                      break L68;
                    }
                    L70: {
                      L71: {
                        if (uk.field_w == null) {
                          break L71;
                        } else {
                          if (uk.field_w.length < param1) {
                            break L71;
                          } else {
                            break L70;
                          }
                        }
                      }
                      uk.field_w = new boolean[2 * param1];
                      break L70;
                    }
                    nd.field_Mb = 0;
                    ai.field_h = 2147483647;
                    mh.field_d = 2147483647;
                    eh.field_s = -2147483648;
                    va.field_z = -2147483648;
                    return;
                  } else {
                    L72: {
                      L73: {
                        if (null == fe.field_b) {
                          break L73;
                        } else {
                          if (param1 > fe.field_b.length) {
                            break L73;
                          } else {
                            break L72;
                          }
                        }
                      }
                      fe.field_b = new int[2 * param1];
                      break L72;
                    }
                    L74: {
                      L75: {
                        if (qd.field_W == null) {
                          break L75;
                        } else {
                          if (param0 + param1 > qd.field_W.length) {
                            break L75;
                          } else {
                            break L74;
                          }
                        }
                      }
                      qd.field_W = new int[2 * (param0 + param1)];
                      break L74;
                    }
                    L76: {
                      L77: {
                        if (uk.field_w == null) {
                          break L77;
                        } else {
                          if (uk.field_w.length < param1) {
                            break L77;
                          } else {
                            break L76;
                          }
                        }
                      }
                      uk.field_w = new boolean[2 * param1];
                      break L76;
                    }
                    nd.field_Mb = 0;
                    ai.field_h = 2147483647;
                    mh.field_d = 2147483647;
                    eh.field_s = -2147483648;
                    va.field_z = -2147483648;
                    return;
                  }
                } else {
                  L78: {
                    L79: {
                      gl.field_n = new int[2 * param1];
                      if (null == fe.field_b) {
                        break L79;
                      } else {
                        if (param1 > fe.field_b.length) {
                          break L79;
                        } else {
                          break L78;
                        }
                      }
                    }
                    fe.field_b = new int[2 * param1];
                    break L78;
                  }
                  L80: {
                    L81: {
                      if (qd.field_W == null) {
                        break L81;
                      } else {
                        if (param0 + param1 > qd.field_W.length) {
                          break L81;
                        } else {
                          break L80;
                        }
                      }
                    }
                    qd.field_W = new int[2 * (param0 + param1)];
                    break L80;
                  }
                  L82: {
                    L83: {
                      if (uk.field_w == null) {
                        break L83;
                      } else {
                        if (uk.field_w.length < param1) {
                          break L83;
                        } else {
                          break L82;
                        }
                      }
                    }
                    uk.field_w = new boolean[2 * param1];
                    break L82;
                  }
                  nd.field_Mb = 0;
                  ai.field_h = 2147483647;
                  mh.field_d = 2147483647;
                  eh.field_s = -2147483648;
                  va.field_z = -2147483648;
                  return;
                }
              }
            }
          } else {
            L84: {
              L85: {
                lb.field_P = new int[param1 * 2];
                if (ac.field_b == null) {
                  break L85;
                } else {
                  if (param1 <= ac.field_b.length) {
                    break L84;
                  } else {
                    break L85;
                  }
                }
              }
              ac.field_b = new int[2 * param1];
              break L84;
            }
            L86: {
              L87: {
                if (ai.field_g == null) {
                  break L87;
                } else {
                  if (param1 > ai.field_g.length) {
                    break L87;
                  } else {
                    break L86;
                  }
                }
              }
              ai.field_g = new int[param1 * 2];
              break L86;
            }
            L88: {
              L89: {
                if (null == gl.field_n) {
                  break L89;
                } else {
                  if (gl.field_n.length >= param1) {
                    break L88;
                  } else {
                    break L89;
                  }
                }
              }
              gl.field_n = new int[2 * param1];
              break L88;
            }
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
            if (uk.field_w != null) {
              if (uk.field_w.length < param1) {
                uk.field_w = new boolean[2 * param1];
                nd.field_Mb = 0;
                ai.field_h = 2147483647;
                mh.field_d = 2147483647;
                eh.field_s = -2147483648;
                va.field_z = -2147483648;
                return;
              } else {
                nd.field_Mb = 0;
                ai.field_h = 2147483647;
                mh.field_d = 2147483647;
                eh.field_s = -2147483648;
                va.field_z = -2147483648;
                return;
              }
            } else {
              uk.field_w = new boolean[2 * param1];
              nd.field_Mb = 0;
              ai.field_h = 2147483647;
              mh.field_d = 2147483647;
              eh.field_s = -2147483648;
              va.field_z = -2147483648;
              return;
            }
          }
        }
    }

    public static void a() {
        field_l = null;
        field_f = null;
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_l = "Return to game";
    }
}
