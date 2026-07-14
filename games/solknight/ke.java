/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class ke extends si {
    static int field_I;
    private int field_P;
    static int field_J;
    static o field_K;
    private mg field_M;
    static String[] field_O;
    static int field_N;
    static mg field_H;
    private int field_S;
    private String field_Q;
    private boolean field_L;
    private int field_R;

    public static void d(byte param0) {
        Object var2 = null;
        if (param0 != -61) {
          var2 = null;
          ke.a((byte) 115, (java.applet.Applet) null, (String) null, false);
          field_K = null;
          field_O = null;
          field_H = null;
          return;
        } else {
          field_K = null;
          field_O = null;
          field_H = null;
          return;
        }
    }

    final static int a(byte param0) {
        int var1 = 0;
        d.field_b.a(24561);
        var1 = 17 / ((40 - param0) / 47);
        if (il.field_c.d((byte) 0)) {
          return 0;
        } else {
          return pg.a((byte) 83);
        }
    }

    final static void a(byte param0, java.applet.Applet param1, String param2, boolean param3) {
        try {
            java.net.MalformedURLException var4 = null;
            int statePc = 0;
            Throwable caughtException = null;
            stateLoop: while (true) {
                switch (statePc) {
                    case 0: {
                        if (!dl.field_t.startsWith("win")) {
                            statePc = 3;
                        } else {
                            statePc = 1;
                        }
                        continue stateLoop;
                    }
                    case 1: {
                        if (!sj.a(97, param2)) {
                            statePc = 3;
                        } else {
                            statePc = 2;
                        }
                        continue stateLoop;
                    }
                    case 2: {
                        return;
                    }
                    case 3: {
                        try {
                            param1.getAppletContext().showDocument(new java.net.URL(param2), "_blank");
                            if (param0 < -60) {
                                statePc = 7;
                            } else {
                                statePc = 4;
                            }
                            continue stateLoop;
                        } catch (Throwable stateCaught_3) {
                            caughtException = stateCaught_3;
                            statePc = 6;
                            continue stateLoop;
                        }
                    }
                    case 4: {
                        try {
                            int discarded$2 = ke.a((byte) -80);
                            statePc = 7;
                            continue stateLoop;
                        } catch (Throwable stateCaught_4) {
                            caughtException = stateCaught_4;
                            statePc = 6;
                            continue stateLoop;
                        }
                    }
                    case 6: {
                        var4 = (java.net.MalformedURLException) (Object) caughtException;
                        hi.a((Throwable) null, "MGR1: " + param2, 1);
                        statePc = 7;
                        continue stateLoop;
                    }
                    case 7: {
                        return;
                    }
                    default: throw new IllegalStateException("invalid CFG state " + statePc);
                }
            }
        } catch (RuntimeException | Error decompiledUncheckedException) {
            throw decompiledUncheckedException;
        } catch (Throwable decompiledCheckedException) {
            throw new RuntimeException(decompiledCheckedException);
        }
    }

    static long a(long param0, long param1) {
        return param0 ^ param1;
    }

    final static int a(boolean param0, boolean param1) {
        int var2 = 0;
        int var3 = 0;
        int var4 = 0;
        int var5 = 0;
        var5 = SolKnight.field_L ? 1 : 0;
        ua.field_L = ua.field_L + 65536;
        L0: while (true) {
          if (sb.a(ua.field_L, uc.field_b, 1513551664) < 65536) {
            L1: {
              var2 = -1;
              if (param1) {
                break L1;
              } else {
                int discarded$1 = ke.b(-18, 56, 85);
                break L1;
              }
            }
            L2: {
              if (null == jb.field_d) {
                if (qd.field_e == null) {
                  break L2;
                } else {
                  var2 = qd.field_e.length;
                  break L2;
                }
              } else {
                var2 = jb.field_d.length;
                break L2;
              }
            }
            L3: {
              if ((var2 ^ -1) == 0) {
                break L3;
              } else {
                L4: {
                  if (ti.field_e < uc.field_c) {
                    ti.field_e = ti.field_e + 1;
                    if (ti.field_e > uc.field_e) {
                      L5: {
                        if (null == jb.field_d) {
                          break L5;
                        } else {
                          break L5;
                        }
                      }
                      ti.field_e = ti.field_e - 1;
                      break L4;
                    } else {
                      if (uc.field_c > ti.field_e) {
                        break L4;
                      } else {
                        if (null != jb.field_d[(we.field_h + 1) % var2]) {
                          break L4;
                        } else {
                          ti.field_e = ti.field_e - 1;
                          break L4;
                        }
                      }
                    }
                  } else {
                    break L4;
                  }
                }
                L6: {
                  if (uc.field_c <= ti.field_e) {
                    L7: {
                      vb.field_g = we.field_h;
                      if (!fh.field_g) {
                        we.field_h = we.field_h - 1;
                        if (-1 < (we.field_h ^ -1)) {
                          we.field_h = we.field_h + var2;
                          break L7;
                        } else {
                          break L7;
                        }
                      } else {
                        we.field_h = we.field_h + 1;
                        if (var2 <= we.field_h) {
                          we.field_h = we.field_h - var2;
                          break L7;
                        } else {
                          break L7;
                        }
                      }
                    }
                    ti.field_e = ti.field_e - uc.field_c;
                    break L6;
                  } else {
                    break L6;
                  }
                }
                if (uc.field_e < ti.field_e) {
                  fh.field_g = true;
                  break L3;
                } else {
                  break L3;
                }
              }
            }
            if (kj.field_S != null) {
              var3 = 357 - kj.field_S.field_r / 2;
              var4 = 0;
              if (hg.field_F != 0) {
                if (s.field_gb > var3) {
                  if (s.field_gb < kj.field_S.field_t + var3) {
                    L8: {
                      if (db.field_o <= 269 + -kj.field_S.field_p) {
                        break L8;
                      } else {
                        if (-270 <= db.field_o) {
                          break L8;
                        } else {
                          var4 = 1;
                          ti.field_e = uc.field_c;
                          fh.field_g = false;
                          break L8;
                        }
                      }
                    }
                    L9: {
                      if (db.field_o <= 586) {
                        break L9;
                      } else {
                        if (kj.field_S.field_p + 586 > db.field_o) {
                          var4 = 1;
                          ti.field_e = uc.field_c;
                          fh.field_g = true;
                          break L9;
                        } else {
                          L10: {
                            if (var4 != 0) {
                              break L10;
                            } else {
                              if (uc.field_e >= ti.field_e) {
                                break L10;
                              } else {
                                if (var3 >= ad.field_m) {
                                  break L10;
                                } else {
                                  if (ad.field_m >= var3 - -kj.field_S.field_t) {
                                    break L10;
                                  } else {
                                    L11: {
                                      if (gb.field_j <= 269 - kj.field_S.field_p) {
                                        break L11;
                                      } else {
                                        if ((gb.field_j ^ -1) <= -270) {
                                          break L11;
                                        } else {
                                          L12: {
                                            ti.field_e = uc.field_e;
                                            if (586 >= gb.field_j) {
                                              break L12;
                                            } else {
                                              if (kj.field_S.field_p + 586 <= gb.field_j) {
                                                break L12;
                                              } else {
                                                ti.field_e = uc.field_e;
                                                break L12;
                                              }
                                            }
                                          }
                                          if (param0) {
                                            L13: {
                                              qh.field_b.a(-117, ad.a(ad.field_m, gb.field_j, 0), ad.a(s.field_gb, db.field_o, 0));
                                              if (!qh.field_b.d((byte) -8)) {
                                                break L13;
                                              } else {
                                                if (qh.field_b.field_f != 0) {
                                                  if (-2 != (qh.field_b.field_f ^ -1)) {
                                                    break L13;
                                                  } else {
                                                    return 2;
                                                  }
                                                } else {
                                                  return 3;
                                                }
                                              }
                                            }
                                            L14: while (true) {
                                              if (wk.a((byte) -56)) {
                                                L15: {
                                                  qh.field_b.a(0, false);
                                                  if (qh.field_b.d((byte) -33)) {
                                                    if (-1 != qh.field_b.field_f) {
                                                      if (-2 != qh.field_b.field_f) {
                                                        break L15;
                                                      } else {
                                                        return 1;
                                                      }
                                                    } else {
                                                      return 3;
                                                    }
                                                  } else {
                                                    break L15;
                                                  }
                                                }
                                                if (-14 == (el.field_n ^ -1)) {
                                                  return 1;
                                                } else {
                                                  continue L14;
                                                }
                                              } else {
                                                return 0;
                                              }
                                            }
                                          } else {
                                            return 0;
                                          }
                                        }
                                      }
                                    }
                                    if (586 >= gb.field_j) {
                                      break L10;
                                    } else {
                                      if (kj.field_S.field_p + 586 <= gb.field_j) {
                                        break L10;
                                      } else {
                                        ti.field_e = uc.field_e;
                                        if (param0) {
                                          L16: {
                                            qh.field_b.a(-117, ad.a(ad.field_m, gb.field_j, 0), ad.a(s.field_gb, db.field_o, 0));
                                            if (!qh.field_b.d((byte) -8)) {
                                              break L16;
                                            } else {
                                              if (qh.field_b.field_f != 0) {
                                                if (-2 != (qh.field_b.field_f ^ -1)) {
                                                  break L16;
                                                } else {
                                                  return 2;
                                                }
                                              } else {
                                                return 3;
                                              }
                                            }
                                          }
                                          L17: while (true) {
                                            if (wk.a((byte) -56)) {
                                              L18: {
                                                qh.field_b.a(0, false);
                                                if (qh.field_b.d((byte) -33)) {
                                                  if (-1 != qh.field_b.field_f) {
                                                    if (-2 != qh.field_b.field_f) {
                                                      break L18;
                                                    } else {
                                                      return 1;
                                                    }
                                                  } else {
                                                    return 3;
                                                  }
                                                } else {
                                                  break L18;
                                                }
                                              }
                                              if (-14 == (el.field_n ^ -1)) {
                                                return 1;
                                              } else {
                                                continue L17;
                                              }
                                            } else {
                                              return 0;
                                            }
                                          }
                                        } else {
                                          return 0;
                                        }
                                      }
                                    }
                                  }
                                }
                              }
                            }
                          }
                          if (param0) {
                            L19: {
                              qh.field_b.a(-117, ad.a(ad.field_m, gb.field_j, 0), ad.a(s.field_gb, db.field_o, 0));
                              if (!qh.field_b.d((byte) -8)) {
                                break L19;
                              } else {
                                if (qh.field_b.field_f != 0) {
                                  if (-2 != (qh.field_b.field_f ^ -1)) {
                                    break L19;
                                  } else {
                                    return 2;
                                  }
                                } else {
                                  return 3;
                                }
                              }
                            }
                            L20: while (true) {
                              if (wk.a((byte) -56)) {
                                L21: {
                                  qh.field_b.a(0, false);
                                  if (qh.field_b.d((byte) -33)) {
                                    if (-1 != qh.field_b.field_f) {
                                      if (-2 != qh.field_b.field_f) {
                                        break L21;
                                      } else {
                                        return 1;
                                      }
                                    } else {
                                      return 3;
                                    }
                                  } else {
                                    break L21;
                                  }
                                }
                                if (-14 == (el.field_n ^ -1)) {
                                  return 1;
                                } else {
                                  continue L20;
                                }
                              } else {
                                return 0;
                              }
                            }
                          } else {
                            return 0;
                          }
                        }
                      }
                    }
                    L22: {
                      if (var4 != 0) {
                        break L22;
                      } else {
                        if (uc.field_e >= ti.field_e) {
                          break L22;
                        } else {
                          if (var3 >= ad.field_m) {
                            break L22;
                          } else {
                            if (ad.field_m >= var3 - -kj.field_S.field_t) {
                              break L22;
                            } else {
                              L23: {
                                if (gb.field_j <= 269 - kj.field_S.field_p) {
                                  break L23;
                                } else {
                                  if ((gb.field_j ^ -1) <= -270) {
                                    break L23;
                                  } else {
                                    L24: {
                                      ti.field_e = uc.field_e;
                                      if (586 >= gb.field_j) {
                                        break L24;
                                      } else {
                                        if (kj.field_S.field_p + 586 <= gb.field_j) {
                                          break L24;
                                        } else {
                                          L25: {
                                            ti.field_e = uc.field_e;
                                            if (param0) {
                                              L26: {
                                                qh.field_b.a(-117, ad.a(ad.field_m, gb.field_j, 0), ad.a(s.field_gb, db.field_o, 0));
                                                if (!qh.field_b.d((byte) -8)) {
                                                  break L26;
                                                } else {
                                                  if (qh.field_b.field_f != 0) {
                                                    if (-2 != (qh.field_b.field_f ^ -1)) {
                                                      break L26;
                                                    } else {
                                                      return 2;
                                                    }
                                                  } else {
                                                    return 3;
                                                  }
                                                }
                                              }
                                              L27: while (true) {
                                                if (!wk.a((byte) -56)) {
                                                  break L25;
                                                } else {
                                                  L28: {
                                                    qh.field_b.a(0, false);
                                                    if (qh.field_b.d((byte) -33)) {
                                                      if (-1 != qh.field_b.field_f) {
                                                        if (-2 != qh.field_b.field_f) {
                                                          break L28;
                                                        } else {
                                                          return 1;
                                                        }
                                                      } else {
                                                        return 3;
                                                      }
                                                    } else {
                                                      break L28;
                                                    }
                                                  }
                                                  if (-14 == (el.field_n ^ -1)) {
                                                    return 1;
                                                  } else {
                                                    continue L27;
                                                  }
                                                }
                                              }
                                            } else {
                                              break L25;
                                            }
                                          }
                                          return 0;
                                        }
                                      }
                                    }
                                    if (param0) {
                                      L29: {
                                        qh.field_b.a(-117, ad.a(ad.field_m, gb.field_j, 0), ad.a(s.field_gb, db.field_o, 0));
                                        if (!qh.field_b.d((byte) -8)) {
                                          break L29;
                                        } else {
                                          if (qh.field_b.field_f != 0) {
                                            if (-2 != (qh.field_b.field_f ^ -1)) {
                                              break L29;
                                            } else {
                                              return 2;
                                            }
                                          } else {
                                            return 3;
                                          }
                                        }
                                      }
                                      L30: while (true) {
                                        if (!wk.a((byte) -56)) {
                                          return 0;
                                        } else {
                                          L31: {
                                            qh.field_b.a(0, false);
                                            if (qh.field_b.d((byte) -33)) {
                                              if (-1 != qh.field_b.field_f) {
                                                if (-2 != qh.field_b.field_f) {
                                                  break L31;
                                                } else {
                                                  return 1;
                                                }
                                              } else {
                                                return 3;
                                              }
                                            } else {
                                              break L31;
                                            }
                                          }
                                          if (-14 == (el.field_n ^ -1)) {
                                            return 1;
                                          } else {
                                            continue L30;
                                          }
                                        }
                                      }
                                    } else {
                                      return 0;
                                    }
                                  }
                                }
                              }
                              if (586 >= gb.field_j) {
                                break L22;
                              } else {
                                if (kj.field_S.field_p + 586 <= gb.field_j) {
                                  break L22;
                                } else {
                                  ti.field_e = uc.field_e;
                                  if (param0) {
                                    L32: {
                                      qh.field_b.a(-117, ad.a(ad.field_m, gb.field_j, 0), ad.a(s.field_gb, db.field_o, 0));
                                      if (!qh.field_b.d((byte) -8)) {
                                        break L32;
                                      } else {
                                        if (qh.field_b.field_f != 0) {
                                          if (-2 != (qh.field_b.field_f ^ -1)) {
                                            break L32;
                                          } else {
                                            return 2;
                                          }
                                        } else {
                                          return 3;
                                        }
                                      }
                                    }
                                    L33: while (true) {
                                      if (!wk.a((byte) -56)) {
                                        return 0;
                                      } else {
                                        L34: {
                                          qh.field_b.a(0, false);
                                          if (qh.field_b.d((byte) -33)) {
                                            if (-1 != qh.field_b.field_f) {
                                              if (-2 != qh.field_b.field_f) {
                                                break L34;
                                              } else {
                                                return 1;
                                              }
                                            } else {
                                              return 3;
                                            }
                                          } else {
                                            break L34;
                                          }
                                        }
                                        if (-14 == (el.field_n ^ -1)) {
                                          return 1;
                                        } else {
                                          continue L33;
                                        }
                                      }
                                    }
                                  } else {
                                    return 0;
                                  }
                                }
                              }
                            }
                          }
                        }
                      }
                    }
                    if (param0) {
                      L35: {
                        qh.field_b.a(-117, ad.a(ad.field_m, gb.field_j, 0), ad.a(s.field_gb, db.field_o, 0));
                        if (!qh.field_b.d((byte) -8)) {
                          break L35;
                        } else {
                          if (qh.field_b.field_f != 0) {
                            if (-2 != (qh.field_b.field_f ^ -1)) {
                              break L35;
                            } else {
                              return 2;
                            }
                          } else {
                            return 3;
                          }
                        }
                      }
                      L36: while (true) {
                        if (!wk.a((byte) -56)) {
                          return 0;
                        } else {
                          L37: {
                            qh.field_b.a(0, false);
                            if (qh.field_b.d((byte) -33)) {
                              if (-1 != qh.field_b.field_f) {
                                if (-2 != qh.field_b.field_f) {
                                  break L37;
                                } else {
                                  return 1;
                                }
                              } else {
                                return 3;
                              }
                            } else {
                              break L37;
                            }
                          }
                          if (-14 == (el.field_n ^ -1)) {
                            return 1;
                          } else {
                            continue L36;
                          }
                        }
                      }
                    } else {
                      return 0;
                    }
                  } else {
                    L38: {
                      if (var4 != 0) {
                        break L38;
                      } else {
                        if (uc.field_e >= ti.field_e) {
                          break L38;
                        } else {
                          if (var3 >= ad.field_m) {
                            break L38;
                          } else {
                            if (ad.field_m >= var3 - -kj.field_S.field_t) {
                              break L38;
                            } else {
                              if (gb.field_j > 269 - kj.field_S.field_p) {
                                if ((gb.field_j ^ -1) > -270) {
                                  ti.field_e = uc.field_e;
                                  if (586 >= gb.field_j) {
                                    break L38;
                                  } else {
                                    if (kj.field_S.field_p + 586 <= gb.field_j) {
                                      break L38;
                                    } else {
                                      ti.field_e = uc.field_e;
                                      break L38;
                                    }
                                  }
                                } else {
                                  if (586 >= gb.field_j) {
                                    break L38;
                                  } else {
                                    if (kj.field_S.field_p + 586 <= gb.field_j) {
                                      break L38;
                                    } else {
                                      ti.field_e = uc.field_e;
                                      break L38;
                                    }
                                  }
                                }
                              } else {
                                if (586 >= gb.field_j) {
                                  break L38;
                                } else {
                                  if (kj.field_S.field_p + 586 <= gb.field_j) {
                                    break L38;
                                  } else {
                                    ti.field_e = uc.field_e;
                                    break L38;
                                  }
                                }
                              }
                            }
                          }
                        }
                      }
                    }
                    if (param0) {
                      L39: {
                        qh.field_b.a(-117, ad.a(ad.field_m, gb.field_j, 0), ad.a(s.field_gb, db.field_o, 0));
                        if (!qh.field_b.d((byte) -8)) {
                          break L39;
                        } else {
                          if (qh.field_b.field_f != 0) {
                            if (-2 != (qh.field_b.field_f ^ -1)) {
                              break L39;
                            } else {
                              return 2;
                            }
                          } else {
                            return 3;
                          }
                        }
                      }
                      L40: while (true) {
                        if (wk.a((byte) -56)) {
                          L41: {
                            qh.field_b.a(0, false);
                            if (qh.field_b.d((byte) -33)) {
                              if (-1 != qh.field_b.field_f) {
                                if (-2 != qh.field_b.field_f) {
                                  break L41;
                                } else {
                                  return 1;
                                }
                              } else {
                                return 3;
                              }
                            } else {
                              break L41;
                            }
                          }
                          if (-14 == el.field_n) {
                            return 1;
                          } else {
                            continue L40;
                          }
                        } else {
                          return 0;
                        }
                      }
                    } else {
                      return 0;
                    }
                  }
                } else {
                  L42: {
                    if (var4 != 0) {
                      break L42;
                    } else {
                      if (uc.field_e >= ti.field_e) {
                        break L42;
                      } else {
                        if (var3 >= ad.field_m) {
                          break L42;
                        } else {
                          if (ad.field_m >= var3 - -kj.field_S.field_t) {
                            break L42;
                          } else {
                            L43: {
                              if (gb.field_j <= 269 - kj.field_S.field_p) {
                                break L43;
                              } else {
                                if ((gb.field_j ^ -1) <= -270) {
                                  break L43;
                                } else {
                                  L44: {
                                    ti.field_e = uc.field_e;
                                    if (586 >= gb.field_j) {
                                      break L44;
                                    } else {
                                      if (kj.field_S.field_p + 586 <= gb.field_j) {
                                        break L44;
                                      } else {
                                        ti.field_e = uc.field_e;
                                        break L44;
                                      }
                                    }
                                  }
                                  if (param0) {
                                    L45: {
                                      qh.field_b.a(-117, ad.a(ad.field_m, gb.field_j, 0), ad.a(s.field_gb, db.field_o, 0));
                                      if (!qh.field_b.d((byte) -8)) {
                                        break L45;
                                      } else {
                                        if (qh.field_b.field_f != 0) {
                                          if (-2 != (qh.field_b.field_f ^ -1)) {
                                            break L45;
                                          } else {
                                            return 2;
                                          }
                                        } else {
                                          return 3;
                                        }
                                      }
                                    }
                                    L46: while (true) {
                                      if (wk.a((byte) -56)) {
                                        L47: {
                                          qh.field_b.a(0, false);
                                          if (qh.field_b.d((byte) -33)) {
                                            if (-1 != qh.field_b.field_f) {
                                              if (-2 != qh.field_b.field_f) {
                                                break L47;
                                              } else {
                                                return 1;
                                              }
                                            } else {
                                              return 3;
                                            }
                                          } else {
                                            break L47;
                                          }
                                        }
                                        if (-14 == (el.field_n ^ -1)) {
                                          return 1;
                                        } else {
                                          continue L46;
                                        }
                                      } else {
                                        return 0;
                                      }
                                    }
                                  } else {
                                    return 0;
                                  }
                                }
                              }
                            }
                            if (586 >= gb.field_j) {
                              break L42;
                            } else {
                              if (kj.field_S.field_p + 586 <= gb.field_j) {
                                break L42;
                              } else {
                                ti.field_e = uc.field_e;
                                if (param0) {
                                  L48: {
                                    qh.field_b.a(-117, ad.a(ad.field_m, gb.field_j, 0), ad.a(s.field_gb, db.field_o, 0));
                                    if (!qh.field_b.d((byte) -8)) {
                                      break L48;
                                    } else {
                                      if (qh.field_b.field_f != 0) {
                                        if (-2 != (qh.field_b.field_f ^ -1)) {
                                          break L48;
                                        } else {
                                          return 2;
                                        }
                                      } else {
                                        return 3;
                                      }
                                    }
                                  }
                                  L49: while (true) {
                                    if (wk.a((byte) -56)) {
                                      L50: {
                                        qh.field_b.a(0, false);
                                        if (qh.field_b.d((byte) -33)) {
                                          if (-1 != qh.field_b.field_f) {
                                            if (-2 != qh.field_b.field_f) {
                                              break L50;
                                            } else {
                                              return 1;
                                            }
                                          } else {
                                            return 3;
                                          }
                                        } else {
                                          break L50;
                                        }
                                      }
                                      if (-14 == (el.field_n ^ -1)) {
                                        return 1;
                                      } else {
                                        continue L49;
                                      }
                                    } else {
                                      return 0;
                                    }
                                  }
                                } else {
                                  return 0;
                                }
                              }
                            }
                          }
                        }
                      }
                    }
                  }
                  if (param0) {
                    L51: {
                      qh.field_b.a(-117, ad.a(ad.field_m, gb.field_j, 0), ad.a(s.field_gb, db.field_o, 0));
                      if (!qh.field_b.d((byte) -8)) {
                        break L51;
                      } else {
                        if (qh.field_b.field_f != 0) {
                          if (-2 != (qh.field_b.field_f ^ -1)) {
                            break L51;
                          } else {
                            return 2;
                          }
                        } else {
                          return 3;
                        }
                      }
                    }
                    L52: while (true) {
                      if (wk.a((byte) -56)) {
                        L53: {
                          qh.field_b.a(0, false);
                          if (qh.field_b.d((byte) -33)) {
                            if (-1 != qh.field_b.field_f) {
                              if (-2 != qh.field_b.field_f) {
                                break L53;
                              } else {
                                return 1;
                              }
                            } else {
                              return 3;
                            }
                          } else {
                            break L53;
                          }
                        }
                        if (-14 == (el.field_n ^ -1)) {
                          return 1;
                        } else {
                          continue L52;
                        }
                      } else {
                        return 0;
                      }
                    }
                  } else {
                    return 0;
                  }
                }
              } else {
                L54: {
                  if (var4 != 0) {
                    break L54;
                  } else {
                    if (uc.field_e >= ti.field_e) {
                      break L54;
                    } else {
                      if (var3 >= ad.field_m) {
                        break L54;
                      } else {
                        if (ad.field_m >= var3 - -kj.field_S.field_t) {
                          break L54;
                        } else {
                          L55: {
                            if (gb.field_j <= 269 - kj.field_S.field_p) {
                              break L55;
                            } else {
                              if ((gb.field_j ^ -1) <= -270) {
                                break L55;
                              } else {
                                L56: {
                                  ti.field_e = uc.field_e;
                                  if (586 >= gb.field_j) {
                                    break L56;
                                  } else {
                                    if (kj.field_S.field_p + 586 <= gb.field_j) {
                                      break L56;
                                    } else {
                                      ti.field_e = uc.field_e;
                                      break L56;
                                    }
                                  }
                                }
                                if (param0) {
                                  L57: {
                                    qh.field_b.a(-117, ad.a(ad.field_m, gb.field_j, 0), ad.a(s.field_gb, db.field_o, 0));
                                    if (!qh.field_b.d((byte) -8)) {
                                      break L57;
                                    } else {
                                      if (qh.field_b.field_f != 0) {
                                        if (-2 != (qh.field_b.field_f ^ -1)) {
                                          break L57;
                                        } else {
                                          return 2;
                                        }
                                      } else {
                                        return 3;
                                      }
                                    }
                                  }
                                  L58: while (true) {
                                    if (wk.a((byte) -56)) {
                                      L59: {
                                        qh.field_b.a(0, false);
                                        if (qh.field_b.d((byte) -33)) {
                                          if (-1 != qh.field_b.field_f) {
                                            if (-2 != qh.field_b.field_f) {
                                              break L59;
                                            } else {
                                              return 1;
                                            }
                                          } else {
                                            return 3;
                                          }
                                        } else {
                                          break L59;
                                        }
                                      }
                                      if (-14 == (el.field_n ^ -1)) {
                                        return 1;
                                      } else {
                                        continue L58;
                                      }
                                    } else {
                                      return 0;
                                    }
                                  }
                                } else {
                                  return 0;
                                }
                              }
                            }
                          }
                          if (586 >= gb.field_j) {
                            break L54;
                          } else {
                            if (kj.field_S.field_p + 586 <= gb.field_j) {
                              break L54;
                            } else {
                              ti.field_e = uc.field_e;
                              if (param0) {
                                L60: {
                                  qh.field_b.a(-117, ad.a(ad.field_m, gb.field_j, 0), ad.a(s.field_gb, db.field_o, 0));
                                  if (!qh.field_b.d((byte) -8)) {
                                    break L60;
                                  } else {
                                    if (qh.field_b.field_f != 0) {
                                      if (-2 != (qh.field_b.field_f ^ -1)) {
                                        break L60;
                                      } else {
                                        return 2;
                                      }
                                    } else {
                                      return 3;
                                    }
                                  }
                                }
                                L61: while (true) {
                                  if (wk.a((byte) -56)) {
                                    L62: {
                                      qh.field_b.a(0, false);
                                      if (qh.field_b.d((byte) -33)) {
                                        if (-1 != qh.field_b.field_f) {
                                          if (-2 != qh.field_b.field_f) {
                                            break L62;
                                          } else {
                                            return 1;
                                          }
                                        } else {
                                          return 3;
                                        }
                                      } else {
                                        break L62;
                                      }
                                    }
                                    if (-14 == (el.field_n ^ -1)) {
                                      return 1;
                                    } else {
                                      continue L61;
                                    }
                                  } else {
                                    return 0;
                                  }
                                }
                              } else {
                                return 0;
                              }
                            }
                          }
                        }
                      }
                    }
                  }
                }
                if (param0) {
                  L63: {
                    qh.field_b.a(-117, ad.a(ad.field_m, gb.field_j, 0), ad.a(s.field_gb, db.field_o, 0));
                    if (!qh.field_b.d((byte) -8)) {
                      break L63;
                    } else {
                      if (qh.field_b.field_f != 0) {
                        if (-2 != (qh.field_b.field_f ^ -1)) {
                          break L63;
                        } else {
                          return 2;
                        }
                      } else {
                        return 3;
                      }
                    }
                  }
                  L64: while (true) {
                    if (wk.a((byte) -56)) {
                      L65: {
                        qh.field_b.a(0, false);
                        if (qh.field_b.d((byte) -33)) {
                          if (-1 != qh.field_b.field_f) {
                            if (-2 != qh.field_b.field_f) {
                              break L65;
                            } else {
                              return 1;
                            }
                          } else {
                            return 3;
                          }
                        } else {
                          break L65;
                        }
                      }
                      if (-14 == (el.field_n ^ -1)) {
                        return 1;
                      } else {
                        continue L64;
                      }
                    } else {
                      return 0;
                    }
                  }
                } else {
                  return 0;
                }
              }
            } else {
              if (param0) {
                L66: {
                  qh.field_b.a(-117, ad.a(ad.field_m, gb.field_j, 0), ad.a(s.field_gb, db.field_o, 0));
                  if (!qh.field_b.d((byte) -8)) {
                    break L66;
                  } else {
                    if (qh.field_b.field_f != 0) {
                      if (-2 != (qh.field_b.field_f ^ -1)) {
                        break L66;
                      } else {
                        return 2;
                      }
                    } else {
                      return 3;
                    }
                  }
                }
                L67: while (true) {
                  if (wk.a((byte) -56)) {
                    L68: {
                      qh.field_b.a(0, false);
                      if (qh.field_b.d((byte) -33)) {
                        if (-1 != qh.field_b.field_f) {
                          if (-2 != qh.field_b.field_f) {
                            break L68;
                          } else {
                            return 1;
                          }
                        } else {
                          return 3;
                        }
                      } else {
                        break L68;
                      }
                    }
                    if (-14 == (el.field_n ^ -1)) {
                      return 1;
                    } else {
                      continue L67;
                    }
                  } else {
                    return 0;
                  }
                }
              } else {
                return 0;
              }
            }
          } else {
            wd.field_a = wd.field_a + 1;
            ua.field_L = ua.field_L - uc.field_b;
            continue L0;
          }
        }
    }

    final String c(byte param0) {
        int var2 = 0;
        String var3 = null;
        rc stackIn_1_0 = null;
        rc stackIn_2_0 = null;
        rc stackIn_3_0 = null;
        int stackIn_3_1 = 0;
        rc stackOut_0_0 = null;
        rc stackOut_2_0 = null;
        int stackOut_2_1 = 0;
        rc stackOut_1_0 = null;
        int stackOut_1_1 = 0;
        L0: {
          var2 = ((ke) this).field_G.field_v ? 1 : 0;
          ((ke) this).field_G.field_v = ((ke) this).field_v;
          var3 = ((ke) this).field_G.c((byte) 45);
          stackOut_0_0 = ((ke) this).field_G;
          stackIn_2_0 = stackOut_0_0;
          stackIn_1_0 = stackOut_0_0;
          if (var2 == 0) {
            stackOut_2_0 = (rc) (Object) stackIn_2_0;
            stackOut_2_1 = 0;
            stackIn_3_0 = stackOut_2_0;
            stackIn_3_1 = stackOut_2_1;
            break L0;
          } else {
            stackOut_1_0 = (rc) (Object) stackIn_1_0;
            stackOut_1_1 = 1;
            stackIn_3_0 = stackOut_1_0;
            stackIn_3_1 = stackOut_1_1;
            break L0;
          }
        }
        stackIn_3_0.field_v = stackIn_3_1 != 0;
        if (param0 <= 14) {
          int discarded$2 = ke.a(false, true);
          return var3;
        } else {
          return var3;
        }
    }

    final void a(int param0, int param1, int param2, int param3) {
        int var5 = param2 + ((ke) this).field_m;
        int var6 = ((ke) this).field_j + param0;
        super.a(param0, param1, param2, param3 + 0);
        if (!(param1 == param3)) {
            return;
        }
        int var7 = ((ke) this).field_L ? ((ke) this).field_t + (-((ke) this).field_R + -(2 * ((ke) this).field_P)) : 0;
        int discarded$0 = ((ke) this).field_M.a(((ke) this).field_Q, ((ke) this).field_P + (var5 - -var7), ((ke) this).field_P + var6, ((ke) this).field_R + -((ke) this).field_P, ((ke) this).field_x - 2 * ((ke) this).field_P, ((ke) this).field_S, -1, ((ke) this).field_L ? 0 : 2, 1, ((ke) this).field_M.field_F);
    }

    final static int b(int param0, int param1, int param2) {
        if (param1 != -1697860097) {
            return 78;
        }
        int var3 = param0 >>> -1697860097;
        return -var3 + (param0 + var3) / param2;
    }

    ke(int param0, int param1, int param2, int param3, rc param4, boolean param5, int param6, int param7, mg param8, int param9, String param10) {
        super(param0, param1, param2, param3, (j) null, (dg) null);
        ((ke) this).field_S = param9;
        ((ke) this).field_M = param8;
        ((ke) this).field_G = param4;
        ((ke) this).field_R = param6;
        ((ke) this).field_Q = param10;
        ((ke) this).field_L = param5 ? true : false;
        ((ke) this).field_P = param7;
        int var12 = ((ke) this).field_R + -((ke) this).field_P;
        int var13 = ((ke) this).field_M.b(param10, var12, ((ke) this).field_M.field_F) + 2 * ((ke) this).field_P;
        if (param3 < var13) {
            ((ke) this).b(var13, param2, param0, 0, param1);
        } else {
            var13 = param3;
        }
        int var14 = ((ke) this).field_L ? 0 : 2 * ((ke) this).field_P + ((ke) this).field_R;
        ((ke) this).field_G.b(-(2 * ((ke) this).field_P) + param3, -(((ke) this).field_P * 3) + param2 + -((ke) this).field_R, var14, 0, (-param3 + var13 >> -30316799) + ((ke) this).field_P);
    }

    static {
    }
}
