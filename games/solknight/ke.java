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
            Throwable decompiledCaughtException = null;
            L0: {
              if (!dl.field_t.startsWith("win")) {
                break L0;
              } else {
                if (!sj.a(97, param2)) {
                  break L0;
                } else {
                  return;
                }
              }
            }
            try {
              L1: {
                L2: {
                  param1.getAppletContext().showDocument(new java.net.URL(param2), "_blank");
                  if (param0 < -60) {
                    break L2;
                  } else {
                    int discarded$2 = ke.a((byte) -80);
                    break L2;
                  }
                }
                break L1;
              }
            } catch (java.net.MalformedURLException decompiledCaughtParameter0) {
              decompiledCaughtException = decompiledCaughtParameter0;
              L3: {
                var4 = (java.net.MalformedURLException) (Object) decompiledCaughtException;
                hi.a((Throwable) null, "MGR1: " + param2, 1);
                break L3;
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
                  if ((ti.field_e ^ -1) > (uc.field_c ^ -1)) {
                    L5: {
                      ti.field_e = ti.field_e + 1;
                      if (ti.field_e <= uc.field_e) {
                        break L5;
                      } else {
                        L6: {
                          if (null == jb.field_d) {
                            break L6;
                          } else {
                            if (null != jb.field_d[we.field_h]) {
                              break L5;
                            } else {
                              break L6;
                            }
                          }
                        }
                        ti.field_e = ti.field_e - 1;
                        break L4;
                      }
                    }
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
                  } else {
                    break L4;
                  }
                }
                L7: {
                  if (uc.field_c <= ti.field_e) {
                    L8: {
                      vb.field_g = we.field_h;
                      if (!fh.field_g) {
                        we.field_h = we.field_h - 1;
                        if (-1 < (we.field_h ^ -1)) {
                          we.field_h = we.field_h + var2;
                          break L8;
                        } else {
                          break L8;
                        }
                      } else {
                        we.field_h = we.field_h + 1;
                        if (var2 <= we.field_h) {
                          we.field_h = we.field_h - var2;
                          break L8;
                        } else {
                          break L8;
                        }
                      }
                    }
                    ti.field_e = ti.field_e - uc.field_c;
                    break L7;
                  } else {
                    break L7;
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
                  if ((s.field_gb ^ -1) > (kj.field_S.field_t + var3 ^ -1)) {
                    L9: {
                      if (db.field_o <= 269 + -kj.field_S.field_p) {
                        break L9;
                      } else {
                        if (-270 >= (db.field_o ^ -1)) {
                          break L9;
                        } else {
                          var4 = 1;
                          ti.field_e = uc.field_c;
                          fh.field_g = false;
                          break L9;
                        }
                      }
                    }
                    L10: {
                      if (db.field_o <= 586) {
                        break L10;
                      } else {
                        if ((kj.field_S.field_p + 586 ^ -1) < (db.field_o ^ -1)) {
                          var4 = 1;
                          ti.field_e = uc.field_c;
                          fh.field_g = true;
                          break L10;
                        } else {
                          L11: {
                            if (var4 != 0) {
                              break L11;
                            } else {
                              if ((uc.field_e ^ -1) <= (ti.field_e ^ -1)) {
                                break L11;
                              } else {
                                if (var3 >= ad.field_m) {
                                  break L11;
                                } else {
                                  if ((ad.field_m ^ -1) <= (var3 - -kj.field_S.field_t ^ -1)) {
                                    break L11;
                                  } else {
                                    L12: {
                                      if (gb.field_j <= 269 - kj.field_S.field_p) {
                                        break L12;
                                      } else {
                                        if ((gb.field_j ^ -1) <= -270) {
                                          break L12;
                                        } else {
                                          L13: {
                                            ti.field_e = uc.field_e;
                                            if (586 >= gb.field_j) {
                                              break L13;
                                            } else {
                                              if (kj.field_S.field_p + 586 <= gb.field_j) {
                                                break L13;
                                              } else {
                                                ti.field_e = uc.field_e;
                                                break L13;
                                              }
                                            }
                                          }
                                          if (param0) {
                                            L14: {
                                              qh.field_b.a(-117, ad.a(ad.field_m, gb.field_j, 0), ad.a(s.field_gb, db.field_o, 0));
                                              if (!qh.field_b.d((byte) -8)) {
                                                break L14;
                                              } else {
                                                if (qh.field_b.field_f != 0) {
                                                  if (-2 != (qh.field_b.field_f ^ -1)) {
                                                    break L14;
                                                  } else {
                                                    return 2;
                                                  }
                                                } else {
                                                  return 3;
                                                }
                                              }
                                            }
                                            L15: while (true) {
                                              if (!wk.a((byte) -56)) {
                                                return 0;
                                              } else {
                                                L16: {
                                                  qh.field_b.a(0, false);
                                                  if (qh.field_b.d((byte) -33)) {
                                                    if (-1 != (qh.field_b.field_f ^ -1)) {
                                                      if (-2 != (qh.field_b.field_f ^ -1)) {
                                                        break L16;
                                                      } else {
                                                        return 1;
                                                      }
                                                    } else {
                                                      return 3;
                                                    }
                                                  } else {
                                                    break L16;
                                                  }
                                                }
                                                if (-14 == (el.field_n ^ -1)) {
                                                  return 1;
                                                } else {
                                                  continue L15;
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
                                      break L11;
                                    } else {
                                      if (kj.field_S.field_p + 586 <= gb.field_j) {
                                        break L11;
                                      } else {
                                        L17: {
                                          ti.field_e = uc.field_e;
                                          if (param0) {
                                            L18: {
                                              qh.field_b.a(-117, ad.a(ad.field_m, gb.field_j, 0), ad.a(s.field_gb, db.field_o, 0));
                                              if (!qh.field_b.d((byte) -8)) {
                                                break L18;
                                              } else {
                                                if (qh.field_b.field_f != 0) {
                                                  if (-2 != (qh.field_b.field_f ^ -1)) {
                                                    break L18;
                                                  } else {
                                                    return 2;
                                                  }
                                                } else {
                                                  return 3;
                                                }
                                              }
                                            }
                                            L19: while (true) {
                                              if (!wk.a((byte) -56)) {
                                                break L17;
                                              } else {
                                                L20: {
                                                  qh.field_b.a(0, false);
                                                  if (qh.field_b.d((byte) -33)) {
                                                    if (-1 != (qh.field_b.field_f ^ -1)) {
                                                      if (-2 != (qh.field_b.field_f ^ -1)) {
                                                        break L20;
                                                      } else {
                                                        return 1;
                                                      }
                                                    } else {
                                                      return 3;
                                                    }
                                                  } else {
                                                    break L20;
                                                  }
                                                }
                                                if (-14 == (el.field_n ^ -1)) {
                                                  return 1;
                                                } else {
                                                  continue L19;
                                                }
                                              }
                                            }
                                          } else {
                                            break L17;
                                          }
                                        }
                                        return 0;
                                      }
                                    }
                                  }
                                }
                              }
                            }
                          }
                          if (param0) {
                            L21: {
                              qh.field_b.a(-117, ad.a(ad.field_m, gb.field_j, 0), ad.a(s.field_gb, db.field_o, 0));
                              if (!qh.field_b.d((byte) -8)) {
                                break L21;
                              } else {
                                if (qh.field_b.field_f != 0) {
                                  if (-2 != (qh.field_b.field_f ^ -1)) {
                                    break L21;
                                  } else {
                                    return 2;
                                  }
                                } else {
                                  return 3;
                                }
                              }
                            }
                            L22: while (true) {
                              if (!wk.a((byte) -56)) {
                                return 0;
                              } else {
                                L23: {
                                  qh.field_b.a(0, false);
                                  if (qh.field_b.d((byte) -33)) {
                                    if (-1 != (qh.field_b.field_f ^ -1)) {
                                      if (-2 != (qh.field_b.field_f ^ -1)) {
                                        break L23;
                                      } else {
                                        return 1;
                                      }
                                    } else {
                                      return 3;
                                    }
                                  } else {
                                    break L23;
                                  }
                                }
                                if (-14 == (el.field_n ^ -1)) {
                                  return 1;
                                } else {
                                  continue L22;
                                }
                              }
                            }
                          } else {
                            return 0;
                          }
                        }
                      }
                    }
                    L24: {
                      if (var4 != 0) {
                        break L24;
                      } else {
                        if ((uc.field_e ^ -1) <= (ti.field_e ^ -1)) {
                          break L24;
                        } else {
                          if (var3 >= ad.field_m) {
                            break L24;
                          } else {
                            if ((ad.field_m ^ -1) <= (var3 - -kj.field_S.field_t ^ -1)) {
                              break L24;
                            } else {
                              L25: {
                                if (gb.field_j <= 269 - kj.field_S.field_p) {
                                  break L25;
                                } else {
                                  if ((gb.field_j ^ -1) <= -270) {
                                    break L25;
                                  } else {
                                    L26: {
                                      ti.field_e = uc.field_e;
                                      if (586 >= gb.field_j) {
                                        break L26;
                                      } else {
                                        if (kj.field_S.field_p + 586 <= gb.field_j) {
                                          break L26;
                                        } else {
                                          L27: {
                                            ti.field_e = uc.field_e;
                                            if (param0) {
                                              L28: {
                                                qh.field_b.a(-117, ad.a(ad.field_m, gb.field_j, 0), ad.a(s.field_gb, db.field_o, 0));
                                                if (!qh.field_b.d((byte) -8)) {
                                                  break L28;
                                                } else {
                                                  if (qh.field_b.field_f != 0) {
                                                    if (-2 != (qh.field_b.field_f ^ -1)) {
                                                      break L28;
                                                    } else {
                                                      return 2;
                                                    }
                                                  } else {
                                                    return 3;
                                                  }
                                                }
                                              }
                                              L29: while (true) {
                                                if (!wk.a((byte) -56)) {
                                                  break L27;
                                                } else {
                                                  L30: {
                                                    qh.field_b.a(0, false);
                                                    if (qh.field_b.d((byte) -33)) {
                                                      if (-1 != (qh.field_b.field_f ^ -1)) {
                                                        if (-2 != (qh.field_b.field_f ^ -1)) {
                                                          break L30;
                                                        } else {
                                                          return 1;
                                                        }
                                                      } else {
                                                        return 3;
                                                      }
                                                    } else {
                                                      break L30;
                                                    }
                                                  }
                                                  if (-14 == (el.field_n ^ -1)) {
                                                    return 1;
                                                  } else {
                                                    continue L29;
                                                  }
                                                }
                                              }
                                            } else {
                                              break L27;
                                            }
                                          }
                                          return 0;
                                        }
                                      }
                                    }
                                    if (param0) {
                                      L31: {
                                        qh.field_b.a(-117, ad.a(ad.field_m, gb.field_j, 0), ad.a(s.field_gb, db.field_o, 0));
                                        if (!qh.field_b.d((byte) -8)) {
                                          break L31;
                                        } else {
                                          if (qh.field_b.field_f != 0) {
                                            if (-2 != (qh.field_b.field_f ^ -1)) {
                                              break L31;
                                            } else {
                                              return 2;
                                            }
                                          } else {
                                            return 3;
                                          }
                                        }
                                      }
                                      L32: while (true) {
                                        if (!wk.a((byte) -56)) {
                                          return 0;
                                        } else {
                                          L33: {
                                            qh.field_b.a(0, false);
                                            if (qh.field_b.d((byte) -33)) {
                                              if (-1 != (qh.field_b.field_f ^ -1)) {
                                                if (-2 != (qh.field_b.field_f ^ -1)) {
                                                  break L33;
                                                } else {
                                                  return 1;
                                                }
                                              } else {
                                                return 3;
                                              }
                                            } else {
                                              break L33;
                                            }
                                          }
                                          if (-14 == (el.field_n ^ -1)) {
                                            return 1;
                                          } else {
                                            continue L32;
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
                                break L24;
                              } else {
                                if (kj.field_S.field_p + 586 <= gb.field_j) {
                                  break L24;
                                } else {
                                  ti.field_e = uc.field_e;
                                  if (param0) {
                                    L34: {
                                      qh.field_b.a(-117, ad.a(ad.field_m, gb.field_j, 0), ad.a(s.field_gb, db.field_o, 0));
                                      if (!qh.field_b.d((byte) -8)) {
                                        break L34;
                                      } else {
                                        if (qh.field_b.field_f != 0) {
                                          if (-2 != (qh.field_b.field_f ^ -1)) {
                                            break L34;
                                          } else {
                                            return 2;
                                          }
                                        } else {
                                          return 3;
                                        }
                                      }
                                    }
                                    L35: while (true) {
                                      if (!wk.a((byte) -56)) {
                                        return 0;
                                      } else {
                                        L36: {
                                          qh.field_b.a(0, false);
                                          if (qh.field_b.d((byte) -33)) {
                                            if (-1 != (qh.field_b.field_f ^ -1)) {
                                              if (-2 != (qh.field_b.field_f ^ -1)) {
                                                break L36;
                                              } else {
                                                return 1;
                                              }
                                            } else {
                                              return 3;
                                            }
                                          } else {
                                            break L36;
                                          }
                                        }
                                        if (-14 == (el.field_n ^ -1)) {
                                          return 1;
                                        } else {
                                          continue L35;
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
                      L37: {
                        qh.field_b.a(-117, ad.a(ad.field_m, gb.field_j, 0), ad.a(s.field_gb, db.field_o, 0));
                        if (!qh.field_b.d((byte) -8)) {
                          break L37;
                        } else {
                          if (qh.field_b.field_f != 0) {
                            if (-2 != (qh.field_b.field_f ^ -1)) {
                              break L37;
                            } else {
                              return 2;
                            }
                          } else {
                            return 3;
                          }
                        }
                      }
                      L38: while (true) {
                        if (!wk.a((byte) -56)) {
                          return 0;
                        } else {
                          L39: {
                            qh.field_b.a(0, false);
                            if (qh.field_b.d((byte) -33)) {
                              if (-1 != (qh.field_b.field_f ^ -1)) {
                                if (-2 != (qh.field_b.field_f ^ -1)) {
                                  break L39;
                                } else {
                                  return 1;
                                }
                              } else {
                                return 3;
                              }
                            } else {
                              break L39;
                            }
                          }
                          if (-14 == (el.field_n ^ -1)) {
                            return 1;
                          } else {
                            continue L38;
                          }
                        }
                      }
                    } else {
                      return 0;
                    }
                  } else {
                    L40: {
                      if (var4 != 0) {
                        break L40;
                      } else {
                        if ((uc.field_e ^ -1) <= (ti.field_e ^ -1)) {
                          break L40;
                        } else {
                          if (var3 >= ad.field_m) {
                            break L40;
                          } else {
                            if ((ad.field_m ^ -1) <= (var3 - -kj.field_S.field_t ^ -1)) {
                              break L40;
                            } else {
                              L41: {
                                if (gb.field_j <= 269 - kj.field_S.field_p) {
                                  break L41;
                                } else {
                                  if ((gb.field_j ^ -1) <= -270) {
                                    break L41;
                                  } else {
                                    ti.field_e = uc.field_e;
                                    break L41;
                                  }
                                }
                              }
                              if (586 >= gb.field_j) {
                                break L40;
                              } else {
                                if (kj.field_S.field_p + 586 <= gb.field_j) {
                                  break L40;
                                } else {
                                  ti.field_e = uc.field_e;
                                  break L40;
                                }
                              }
                            }
                          }
                        }
                      }
                    }
                    if (param0) {
                      L42: {
                        qh.field_b.a(-117, ad.a(ad.field_m, gb.field_j, 0), ad.a(s.field_gb, db.field_o, 0));
                        if (!qh.field_b.d((byte) -8)) {
                          break L42;
                        } else {
                          if (qh.field_b.field_f != 0) {
                            if (-2 != (qh.field_b.field_f ^ -1)) {
                              break L42;
                            } else {
                              return 2;
                            }
                          } else {
                            return 3;
                          }
                        }
                      }
                      L43: while (true) {
                        if (!wk.a((byte) -56)) {
                          return 0;
                        } else {
                          L44: {
                            qh.field_b.a(0, false);
                            if (qh.field_b.d((byte) -33)) {
                              if (-1 != (qh.field_b.field_f ^ -1)) {
                                if (-2 != (qh.field_b.field_f ^ -1)) {
                                  break L44;
                                } else {
                                  return 1;
                                }
                              } else {
                                return 3;
                              }
                            } else {
                              break L44;
                            }
                          }
                          if (-14 == (el.field_n ^ -1)) {
                            return 1;
                          } else {
                            continue L43;
                          }
                        }
                      }
                    } else {
                      return 0;
                    }
                  }
                } else {
                  L45: {
                    if (var4 != 0) {
                      break L45;
                    } else {
                      if ((uc.field_e ^ -1) <= (ti.field_e ^ -1)) {
                        break L45;
                      } else {
                        if (var3 >= ad.field_m) {
                          break L45;
                        } else {
                          if ((ad.field_m ^ -1) <= (var3 - -kj.field_S.field_t ^ -1)) {
                            break L45;
                          } else {
                            L46: {
                              if (gb.field_j <= 269 - kj.field_S.field_p) {
                                break L46;
                              } else {
                                if ((gb.field_j ^ -1) <= -270) {
                                  break L46;
                                } else {
                                  L47: {
                                    ti.field_e = uc.field_e;
                                    if (586 >= gb.field_j) {
                                      break L47;
                                    } else {
                                      if (kj.field_S.field_p + 586 <= gb.field_j) {
                                        break L47;
                                      } else {
                                        ti.field_e = uc.field_e;
                                        break L47;
                                      }
                                    }
                                  }
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
                                      if (!wk.a((byte) -56)) {
                                        return 0;
                                      } else {
                                        L50: {
                                          qh.field_b.a(0, false);
                                          if (qh.field_b.d((byte) -33)) {
                                            if (-1 != (qh.field_b.field_f ^ -1)) {
                                              if (-2 != (qh.field_b.field_f ^ -1)) {
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
                                      }
                                    }
                                  } else {
                                    return 0;
                                  }
                                }
                              }
                            }
                            if (586 >= gb.field_j) {
                              break L45;
                            } else {
                              if (kj.field_S.field_p + 586 <= gb.field_j) {
                                break L45;
                              } else {
                                L51: {
                                  ti.field_e = uc.field_e;
                                  if (param0) {
                                    L52: {
                                      qh.field_b.a(-117, ad.a(ad.field_m, gb.field_j, 0), ad.a(s.field_gb, db.field_o, 0));
                                      if (!qh.field_b.d((byte) -8)) {
                                        break L52;
                                      } else {
                                        if (qh.field_b.field_f != 0) {
                                          if (-2 != (qh.field_b.field_f ^ -1)) {
                                            break L52;
                                          } else {
                                            return 2;
                                          }
                                        } else {
                                          return 3;
                                        }
                                      }
                                    }
                                    L53: while (true) {
                                      if (!wk.a((byte) -56)) {
                                        break L51;
                                      } else {
                                        L54: {
                                          qh.field_b.a(0, false);
                                          if (qh.field_b.d((byte) -33)) {
                                            if (-1 != (qh.field_b.field_f ^ -1)) {
                                              if (-2 != (qh.field_b.field_f ^ -1)) {
                                                break L54;
                                              } else {
                                                return 1;
                                              }
                                            } else {
                                              return 3;
                                            }
                                          } else {
                                            break L54;
                                          }
                                        }
                                        if (-14 == (el.field_n ^ -1)) {
                                          return 1;
                                        } else {
                                          continue L53;
                                        }
                                      }
                                    }
                                  } else {
                                    break L51;
                                  }
                                }
                                return 0;
                              }
                            }
                          }
                        }
                      }
                    }
                  }
                  if (param0) {
                    L55: {
                      qh.field_b.a(-117, ad.a(ad.field_m, gb.field_j, 0), ad.a(s.field_gb, db.field_o, 0));
                      if (!qh.field_b.d((byte) -8)) {
                        break L55;
                      } else {
                        if (qh.field_b.field_f != 0) {
                          if (-2 != (qh.field_b.field_f ^ -1)) {
                            break L55;
                          } else {
                            return 2;
                          }
                        } else {
                          return 3;
                        }
                      }
                    }
                    L56: while (true) {
                      if (!wk.a((byte) -56)) {
                        return 0;
                      } else {
                        L57: {
                          qh.field_b.a(0, false);
                          if (qh.field_b.d((byte) -33)) {
                            if (-1 != (qh.field_b.field_f ^ -1)) {
                              if (-2 != (qh.field_b.field_f ^ -1)) {
                                break L57;
                              } else {
                                return 1;
                              }
                            } else {
                              return 3;
                            }
                          } else {
                            break L57;
                          }
                        }
                        if (-14 == (el.field_n ^ -1)) {
                          return 1;
                        } else {
                          continue L56;
                        }
                      }
                    }
                  } else {
                    return 0;
                  }
                }
              } else {
                L58: {
                  if (var4 != 0) {
                    break L58;
                  } else {
                    if ((uc.field_e ^ -1) <= (ti.field_e ^ -1)) {
                      break L58;
                    } else {
                      if (var3 >= ad.field_m) {
                        break L58;
                      } else {
                        if ((ad.field_m ^ -1) <= (var3 - -kj.field_S.field_t ^ -1)) {
                          break L58;
                        } else {
                          L59: {
                            if (gb.field_j <= 269 - kj.field_S.field_p) {
                              break L59;
                            } else {
                              if ((gb.field_j ^ -1) <= -270) {
                                break L59;
                              } else {
                                L60: {
                                  ti.field_e = uc.field_e;
                                  if (586 >= gb.field_j) {
                                    break L60;
                                  } else {
                                    if (kj.field_S.field_p + 586 <= gb.field_j) {
                                      break L60;
                                    } else {
                                      ti.field_e = uc.field_e;
                                      break L60;
                                    }
                                  }
                                }
                                if (param0) {
                                  L61: {
                                    qh.field_b.a(-117, ad.a(ad.field_m, gb.field_j, 0), ad.a(s.field_gb, db.field_o, 0));
                                    if (!qh.field_b.d((byte) -8)) {
                                      break L61;
                                    } else {
                                      if (qh.field_b.field_f != 0) {
                                        if (-2 != (qh.field_b.field_f ^ -1)) {
                                          break L61;
                                        } else {
                                          return 2;
                                        }
                                      } else {
                                        return 3;
                                      }
                                    }
                                  }
                                  L62: while (true) {
                                    if (!wk.a((byte) -56)) {
                                      return 0;
                                    } else {
                                      L63: {
                                        qh.field_b.a(0, false);
                                        if (qh.field_b.d((byte) -33)) {
                                          if (-1 != (qh.field_b.field_f ^ -1)) {
                                            if (-2 != (qh.field_b.field_f ^ -1)) {
                                              break L63;
                                            } else {
                                              return 1;
                                            }
                                          } else {
                                            return 3;
                                          }
                                        } else {
                                          break L63;
                                        }
                                      }
                                      if (-14 == (el.field_n ^ -1)) {
                                        return 1;
                                      } else {
                                        continue L62;
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
                            break L58;
                          } else {
                            if (kj.field_S.field_p + 586 <= gb.field_j) {
                              break L58;
                            } else {
                              L64: {
                                ti.field_e = uc.field_e;
                                if (param0) {
                                  L65: {
                                    qh.field_b.a(-117, ad.a(ad.field_m, gb.field_j, 0), ad.a(s.field_gb, db.field_o, 0));
                                    if (!qh.field_b.d((byte) -8)) {
                                      break L65;
                                    } else {
                                      if (qh.field_b.field_f != 0) {
                                        if (-2 != (qh.field_b.field_f ^ -1)) {
                                          break L65;
                                        } else {
                                          return 2;
                                        }
                                      } else {
                                        return 3;
                                      }
                                    }
                                  }
                                  L66: while (true) {
                                    if (!wk.a((byte) -56)) {
                                      break L64;
                                    } else {
                                      L67: {
                                        qh.field_b.a(0, false);
                                        if (qh.field_b.d((byte) -33)) {
                                          if (-1 != (qh.field_b.field_f ^ -1)) {
                                            if (-2 != (qh.field_b.field_f ^ -1)) {
                                              break L67;
                                            } else {
                                              return 1;
                                            }
                                          } else {
                                            return 3;
                                          }
                                        } else {
                                          break L67;
                                        }
                                      }
                                      if (-14 == (el.field_n ^ -1)) {
                                        return 1;
                                      } else {
                                        continue L66;
                                      }
                                    }
                                  }
                                } else {
                                  break L64;
                                }
                              }
                              return 0;
                            }
                          }
                        }
                      }
                    }
                  }
                }
                if (param0) {
                  L68: {
                    qh.field_b.a(-117, ad.a(ad.field_m, gb.field_j, 0), ad.a(s.field_gb, db.field_o, 0));
                    if (!qh.field_b.d((byte) -8)) {
                      break L68;
                    } else {
                      if (qh.field_b.field_f != 0) {
                        if (-2 != (qh.field_b.field_f ^ -1)) {
                          break L68;
                        } else {
                          return 2;
                        }
                      } else {
                        return 3;
                      }
                    }
                  }
                  L69: while (true) {
                    if (!wk.a((byte) -56)) {
                      return 0;
                    } else {
                      L70: {
                        qh.field_b.a(0, false);
                        if (qh.field_b.d((byte) -33)) {
                          if (-1 != (qh.field_b.field_f ^ -1)) {
                            if (-2 != (qh.field_b.field_f ^ -1)) {
                              break L70;
                            } else {
                              return 1;
                            }
                          } else {
                            return 3;
                          }
                        } else {
                          break L70;
                        }
                      }
                      if (-14 == (el.field_n ^ -1)) {
                        return 1;
                      } else {
                        continue L69;
                      }
                    }
                  }
                } else {
                  return 0;
                }
              }
            } else {
              if (param0) {
                L71: {
                  qh.field_b.a(-117, ad.a(ad.field_m, gb.field_j, 0), ad.a(s.field_gb, db.field_o, 0));
                  if (!qh.field_b.d((byte) -8)) {
                    break L71;
                  } else {
                    if (qh.field_b.field_f != 0) {
                      if (-2 != (qh.field_b.field_f ^ -1)) {
                        break L71;
                      } else {
                        return 2;
                      }
                    } else {
                      return 3;
                    }
                  }
                }
                L72: while (true) {
                  if (!wk.a((byte) -56)) {
                    return 0;
                  } else {
                    L73: {
                      qh.field_b.a(0, false);
                      if (qh.field_b.d((byte) -33)) {
                        if (-1 != (qh.field_b.field_f ^ -1)) {
                          if (-2 != (qh.field_b.field_f ^ -1)) {
                            break L73;
                          } else {
                            return 1;
                          }
                        } else {
                          return 3;
                        }
                      } else {
                        break L73;
                      }
                    }
                    if (-14 == (el.field_n ^ -1)) {
                      return 1;
                    } else {
                      continue L72;
                    }
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
