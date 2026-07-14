/*
 * Decompiled by CFR-JS 0.4.0.
 */
import java.io.*;

final class jh extends java.awt.Canvas {
    private java.awt.Component field_g;
    static double field_h;
    static String field_a;
    static int field_e;
    static byte[][] field_b;
    static String[][] field_d;
    static int field_f;
    static ha[] field_c;

    final static void a(String param0, java.applet.Applet param1, boolean param2, byte param3) {
        try {
            if (dl.field_s.startsWith("win")) {
                if (!(!ie.b((byte) 118, param0))) {
                    return;
                }
            }
            int var4 = 89 / ((param3 - -46) / 63);
            try {
                param1.getAppletContext().showDocument(new java.net.URL(param0), "_blank");
            } catch (java.net.MalformedURLException malformedURLException) {
                jh.a((Throwable) null, "MGR1: " + param0, (byte) 20);
            }
        } catch (RuntimeException | Error decompiledUncheckedException) {
            throw decompiledUncheckedException;
        } catch (Throwable decompiledCheckedException) {
            throw new RuntimeException(decompiledCheckedException);
        }
    }

    final static void a(int param0, boolean param1) {
        int var3 = 0;
        ml var4 = null;
        ml var5 = null;
        L0: {
          var3 = ArcanistsMulti.field_G ? 1 : 0;
          if (-1 == (mj.field_p ^ -1)) {
            qn.field_ob.field_X = false;
            qn.field_ob.field_H = false;
            qn.field_ob.field_g = false;
            if (0 != rm.field_k) {
              if (rm.field_k != -2) {
                if (rm.field_k == 2) {
                  qn.field_ob.field_B = true;
                  mo.field_f = ic.field_c;
                  i.b(-127);
                  kl.field_A = 400;
                  break L0;
                } else {
                  if (-4 != rm.field_k) {
                    if (4 == rm.field_k) {
                      L1: {
                        mo.field_f = ej.field_Q;
                        if (-13 == ti.field_N) {
                          break L1;
                        } else {
                          if (rk.field_O.c((byte) 89)) {
                            break L1;
                          } else {
                            mo.field_f = sk.field_i;
                            break L1;
                          }
                        }
                      }
                      L2: {
                        if (-3 >= co.a(-20675)) {
                          rm.field_k = 5;
                          break L2;
                        } else {
                          break L2;
                        }
                      }
                      kl.field_A = 400;
                      break L0;
                    } else {
                      if (-6 == rm.field_k) {
                        mo.field_f = oi.field_b;
                        if (-2 >= co.a(param0 + -20672)) {
                          rm.field_k = 6;
                          break L0;
                        } else {
                          break L0;
                        }
                      } else {
                        if (rm.field_k != -7) {
                          break L0;
                        } else {
                          mo.field_f = kj.field_f;
                          break L0;
                        }
                      }
                    }
                  } else {
                    L3: {
                      if (ti.field_N != -13) {
                        break L3;
                      } else {
                        rm.field_k = 4;
                        break L3;
                      }
                    }
                    kl.field_A = 500;
                    mo.field_f = we.field_a;
                    break L0;
                  }
                }
              } else {
                mo.field_f = ab.field_s;
                qn.field_ob.field_B = true;
                i.b(1);
                break L0;
              }
            } else {
              mo.field_f = vc.field_f;
              qn.field_ob.field_B = true;
              i.b(97);
              kl.field_A = 400;
              break L0;
            }
          } else {
            break L0;
          }
        }
        L4: {
          if (mj.field_p != 1) {
            break L4;
          } else {
            qn.field_ob.field_H = false;
            qn.field_ob.field_g = false;
            qn.field_ob.field_X = false;
            if (rm.field_k == 0) {
              mo.field_f = re.field_m;
              qn.field_ob.field_B = true;
              i.b(-115);
              kl.field_A = 400;
              break L4;
            } else {
              if (-2 == (rm.field_k ^ -1)) {
                L5: {
                  if (-15 != (ti.field_N ^ -1)) {
                    break L5;
                  } else {
                    rm.field_k = 2;
                    break L5;
                  }
                }
                kl.field_A = 500;
                mo.field_f = ie.field_Mb;
                break L4;
              } else {
                if (2 != rm.field_k) {
                  if (3 != rm.field_k) {
                    if (rm.field_k == 4) {
                      mo.field_f = wi.field_i;
                      break L4;
                    } else {
                      break L4;
                    }
                  } else {
                    mo.field_f = vi.field_D;
                    if (1 >= co.a(param0 ^ 20672)) {
                      rm.field_k = 4;
                      break L4;
                    } else {
                      break L4;
                    }
                  }
                } else {
                  L6: {
                    mo.field_f = mk.field_R;
                    if (ti.field_N == 14) {
                      break L6;
                    } else {
                      if (!rk.field_O.c((byte) 89)) {
                        mo.field_f = ke.field_E;
                        break L6;
                      } else {
                        break L6;
                      }
                    }
                  }
                  L7: {
                    if ((co.a(param0 + -20672) ^ -1) >= -3) {
                      rm.field_k = 3;
                      break L7;
                    } else {
                      break L7;
                    }
                  }
                  kl.field_A = 400;
                  break L4;
                }
              }
            }
          }
        }
        L8: {
          if (2 != mj.field_p) {
            break L8;
          } else {
            qn.field_ob.field_H = false;
            qn.field_ob.field_X = false;
            qn.field_ob.field_g = false;
            if (-1 == rm.field_k) {
              mo.field_f = td.field_D;
              qn.field_ob.field_B = true;
              i.b(-128);
              kl.field_A = 400;
              break L8;
            } else {
              if (rm.field_k != 1) {
                if ((rm.field_k ^ -1) != -3) {
                  if ((rm.field_k ^ -1) != -4) {
                    if (rm.field_k == 4) {
                      L9: {
                        if (!rk.field_O.c((byte) 89)) {
                          mo.field_f = tf.field_h;
                          break L9;
                        } else {
                          break L9;
                        }
                      }
                      if ((co.a(-20675) ^ -1) < -3) {
                        break L8;
                      } else {
                        rm.field_k = 5;
                        break L8;
                      }
                    } else {
                      if ((rm.field_k ^ -1) == -6) {
                        mo.field_f = ra.field_g;
                        if ((co.a(-20675) ^ -1) < -2) {
                          break L8;
                        } else {
                          rm.field_k = 6;
                          break L8;
                        }
                      } else {
                        if (rm.field_k == 6) {
                          mo.field_f = lh.field_d;
                          break L8;
                        } else {
                          break L8;
                        }
                      }
                    }
                  } else {
                    L10: {
                      mo.field_f = ub.field_d;
                      if (rk.field_O.c((byte) 89)) {
                        rm.field_k = 4;
                        break L10;
                      } else {
                        break L10;
                      }
                    }
                    L11: {
                      if (-1000 == qn.field_ob.field_s) {
                        rm.field_k = 2;
                        break L11;
                      } else {
                        break L11;
                      }
                    }
                    L12: {
                      if (-3 <= (co.a(-20675) ^ -1)) {
                        rm.field_k = 5;
                        break L12;
                      } else {
                        break L12;
                      }
                    }
                    kl.field_A = 320;
                    break L8;
                  }
                } else {
                  L13: {
                    mo.field_f = nj.field_h;
                    if (0 != ti.field_N) {
                      rm.field_k = 1;
                      break L13;
                    } else {
                      break L13;
                    }
                  }
                  kl.field_A = 400;
                  if (qn.field_ob.field_s != -1000) {
                    rm.field_k = 3;
                    break L8;
                  } else {
                    break L8;
                  }
                }
              } else {
                mo.field_f = mk.field_N;
                kl.field_A = 500;
                if (-1 == ti.field_N) {
                  rm.field_k = 2;
                  break L8;
                } else {
                  break L8;
                }
              }
            }
          }
        }
        L14: {
          if (3 != mj.field_p) {
            break L14;
          } else {
            qn.field_ob.field_X = false;
            qn.field_ob.field_H = false;
            qn.field_ob.field_g = false;
            if (rm.field_k == 0) {
              L15: {
                if (20 == ti.field_N) {
                  rm.field_k = 1;
                  break L15;
                } else {
                  break L15;
                }
              }
              mo.field_f = nb.field_f;
              if (co.a(-20675) <= 2) {
                rm.field_k = 2;
                break L14;
              } else {
                break L14;
              }
            } else {
              if (1 == rm.field_k) {
                L16: {
                  mo.field_f = qn.field_jb;
                  if (20 == ti.field_N) {
                    break L16;
                  } else {
                    if (rk.field_O.c((byte) 89)) {
                      break L16;
                    } else {
                      rm.field_k = 0;
                      break L16;
                    }
                  }
                }
                L17: {
                  if ((co.a(param0 ^ 20672) ^ -1) < -3) {
                    break L17;
                  } else {
                    rm.field_k = 2;
                    break L17;
                  }
                }
                kl.field_A = 400;
                break L14;
              } else {
                if (2 == rm.field_k) {
                  mo.field_f = be.field_h;
                  if (-2 <= (co.a(-20675) ^ -1)) {
                    rm.field_k = 3;
                    break L14;
                  } else {
                    break L14;
                  }
                } else {
                  if (rm.field_k != 3) {
                    break L14;
                  } else {
                    mo.field_f = wi.field_i;
                    break L14;
                  }
                }
              }
            }
          }
        }
        L18: {
          if (mj.field_p != -5) {
            break L18;
          } else {
            L19: {
              qn.field_ob.field_X = false;
              qn.field_ob.field_H = false;
              qn.field_ob.field_g = false;
              if (-3 >= rm.field_k) {
                if (520 > rk.field_O.a(0, true).field_lb) {
                  rm.field_k = 8;
                  break L19;
                } else {
                  break L19;
                }
              } else {
                break L19;
              }
            }
            L20: {
              if (0 != rm.field_k) {
                if (rm.field_k == 1) {
                  mo.field_f = ag.field_x;
                  qn.field_ob.field_B = true;
                  i.b(param0 + -113);
                  kl.field_A = 500;
                  break L20;
                } else {
                  if (2 == rm.field_k) {
                    L21: {
                      mo.field_f = gn.field_f;
                      if ((rk.field_O.a(0, true).field_lb ^ -1) < -1301) {
                        rm.field_k = 3;
                        break L21;
                      } else {
                        break L21;
                      }
                    }
                    kl.field_A = 300;
                    i.b(-128);
                    break L20;
                  } else {
                    if (rm.field_k != -4) {
                      if (-5 != rm.field_k) {
                        if (rm.field_k != 5) {
                          if ((rm.field_k ^ -1) != -7) {
                            if (7 != rm.field_k) {
                              if (-9 == rm.field_k) {
                                L22: {
                                  if (ti.field_N != 10) {
                                    break L22;
                                  } else {
                                    rm.field_k = 4;
                                    break L22;
                                  }
                                }
                                mo.field_f = uj.field_b;
                                break L20;
                              } else {
                                break L20;
                              }
                            } else {
                              mo.field_f = jd.field_c;
                              if (rk.field_O.a(0, true).field_lb > -517) {
                                rm.field_k = 6;
                                break L20;
                              } else {
                                break L20;
                              }
                            }
                          } else {
                            mo.field_f = eb.field_c;
                            break L20;
                          }
                        } else {
                          L23: {
                            if (rk.field_O.a(3, true) == null) {
                              mo.field_f = ub.field_f;
                              break L23;
                            } else {
                              mo.field_f = ui.field_u;
                              break L23;
                            }
                          }
                          L24: {
                            if (-2 > (co.a(-20675) ^ -1)) {
                              break L24;
                            } else {
                              rm.field_k = 6;
                              break L24;
                            }
                          }
                          if (null != rk.field_O.a(2, true)) {
                            break L20;
                          } else {
                            if (null != rk.field_O.a(3, true)) {
                              break L20;
                            } else {
                              rm.field_k = 7;
                              break L20;
                            }
                          }
                        }
                      } else {
                        mo.field_f = gh.field_o;
                        if (-3 >= co.a(-20675)) {
                          rm.field_k = 5;
                          break L20;
                        } else {
                          break L20;
                        }
                      }
                    } else {
                      L25: {
                        if (-11 == ti.field_N) {
                          rm.field_k = 4;
                          break L25;
                        } else {
                          break L25;
                        }
                      }
                      kl.field_A = 320;
                      mo.field_f = e.field_D;
                      break L20;
                    }
                  }
                }
              } else {
                qn.field_ob.field_B = true;
                mo.field_f = qe.field_n;
                i.b(19);
                kl.field_A = 400;
                break L20;
              }
            }
            L26: {
              if (-801 > (rk.field_O.a(0, true).field_db ^ -1)) {
                rm.field_k = -Math.abs(rm.field_k);
                break L26;
              } else {
                break L26;
              }
            }
            if (rm.field_k >= 0) {
              break L18;
            } else {
              L27: {
                mo.field_f = io.field_u;
                if (800 > rk.field_O.a(0, true).field_db) {
                  L28: {
                    if (-801 < (rk.field_O.a(0, true).field_lb ^ -1)) {
                      rm.field_k = -rm.field_k;
                      break L28;
                    } else {
                      break L28;
                    }
                  }
                  if (rk.field_O.a(0, true).field_lb > 1200) {
                    rm.field_k = -rm.field_k;
                    break L27;
                  } else {
                    break L27;
                  }
                } else {
                  break L27;
                }
              }
              i.b(param0 + 36);
              kl.field_A = 400;
              break L18;
            }
          }
        }
        L29: {
          if (mj.field_p == 5) {
            qn.field_ob.field_X = false;
            qn.field_ob.field_H = false;
            qn.field_ob.field_g = false;
            if (rk.field_O.a(0, true) == null) {
              gj.a(true, true, 14, mn.field_r);
              co.c(114);
              return;
            } else {
              L30: {
                var4 = rk.field_O.a(qn.field_ob.field_bb, true);
                if (0 == rm.field_k) {
                  L31: {
                    kl.field_A = 400;
                    if (-7 == ti.field_N) {
                      rm.field_k = 1;
                      break L31;
                    } else {
                      break L31;
                    }
                  }
                  mo.field_f = bm.field_a;
                  break L30;
                } else {
                  if ((rm.field_k ^ -1) != -2) {
                    if (rm.field_k == -3) {
                      L32: {
                        if (var4 == null) {
                          break L32;
                        } else {
                          break L32;
                        }
                      }
                      mo.field_f = af.field_Cb;
                      break L30;
                    } else {
                      if (-4 != rm.field_k) {
                        if ((rm.field_k ^ -1) != -5) {
                          if ((rm.field_k ^ -1) != -6) {
                            if ((rm.field_k ^ -1) == -7) {
                              mo.field_f = ol.field_e;
                              if ((co.a(param0 + -20672) ^ -1) >= -2) {
                                rm.field_k = 7;
                                break L30;
                              } else {
                                break L30;
                              }
                            } else {
                              if ((rm.field_k ^ -1) != -8) {
                                break L30;
                              } else {
                                mo.field_f = pa.field_f;
                                break L30;
                              }
                            }
                          } else {
                            L33: {
                              mo.field_f = to.field_o;
                              if (null == rk.field_O.a(1, true)) {
                                break L33;
                              } else {
                                if (null == rk.field_O.a(2, true)) {
                                  break L33;
                                } else {
                                  if (null == rk.field_O.a(3, true)) {
                                    break L33;
                                  } else {
                                    if (-41 != (rk.field_O.a(1, true).field_jb ^ -1)) {
                                      break L33;
                                    } else {
                                      if ((rk.field_O.a(2, true).field_jb ^ -1) != -41) {
                                        break L33;
                                      } else {
                                        if ((rk.field_O.a(3, true).field_jb ^ -1) == -41) {
                                          break L30;
                                        } else {
                                          break L33;
                                        }
                                      }
                                    }
                                  }
                                }
                              }
                            }
                            rm.field_k = 6;
                            break L30;
                          }
                        } else {
                          L34: {
                            L35: {
                              mo.field_f = tc.field_E;
                              if (var4 == null) {
                                break L35;
                              } else {
                                if (var4.field_jb != -12) {
                                  break L35;
                                } else {
                                  break L34;
                                }
                              }
                            }
                            rm.field_k = 5;
                            break L34;
                          }
                          L36: {
                            if (-121 == ti.field_N) {
                              break L36;
                            } else {
                              rm.field_k = 5;
                              break L36;
                            }
                          }
                          L37: {
                            if (rk.field_O.a(1, true) == null) {
                              break L37;
                            } else {
                              if (rk.field_O.a(2, true) == null) {
                                break L37;
                              } else {
                                if (rk.field_O.a(3, true) == null) {
                                  break L37;
                                } else {
                                  if (-41 != (rk.field_O.a(1, true).field_jb ^ -1)) {
                                    break L37;
                                  } else {
                                    if (rk.field_O.a(2, true).field_jb != 40) {
                                      break L37;
                                    } else {
                                      if ((rk.field_O.a(3, true).field_jb ^ -1) == -41) {
                                        break L30;
                                      } else {
                                        break L37;
                                      }
                                    }
                                  }
                                }
                              }
                            }
                          }
                          rm.field_k = 6;
                          break L30;
                        }
                      } else {
                        L38: {
                          L39: {
                            mo.field_f = va.field_b;
                            if (rk.field_O.a(1, true) == null) {
                              break L39;
                            } else {
                              if (rk.field_O.a(2, true) == null) {
                                break L39;
                              } else {
                                if (rk.field_O.a(3, true) == null) {
                                  break L39;
                                } else {
                                  if (40 != rk.field_O.a(1, true).field_jb) {
                                    break L39;
                                  } else {
                                    if (rk.field_O.a(2, true).field_jb != 40) {
                                      break L39;
                                    } else {
                                      if (rk.field_O.a(3, true).field_jb == -41) {
                                        break L38;
                                      } else {
                                        break L39;
                                      }
                                    }
                                  }
                                }
                              }
                            }
                          }
                          rm.field_k = 6;
                          break L38;
                        }
                        L40: {
                          L41: {
                            if (var4 == null) {
                              break L41;
                            } else {
                              if (-12 != var4.field_jb) {
                                break L41;
                              } else {
                                break L40;
                              }
                            }
                          }
                          rm.field_k = 2;
                          break L40;
                        }
                        L42: {
                          if (120 == ti.field_N) {
                            rm.field_k = 4;
                            break L42;
                          } else {
                            break L42;
                          }
                        }
                        kl.field_A = 460;
                        break L30;
                      }
                    }
                  } else {
                    L43: {
                      mo.field_f = mk.field_M;
                      if ((rk.field_O.b(12) ^ -1) > -4) {
                        break L43;
                      } else {
                        rm.field_k = 2;
                        break L43;
                      }
                    }
                    kl.field_A = 400;
                    break L30;
                  }
                }
              }
              L44: {
                if ((rk.field_O.a(0, true).field_db ^ -1) >= -801) {
                  break L44;
                } else {
                  rm.field_k = -Math.abs(rm.field_k);
                  break L44;
                }
              }
              L45: {
                if (0 > rm.field_k) {
                  L46: {
                    L47: {
                      L48: {
                        mo.field_f = r.field_c;
                        if (var4 == null) {
                          break L48;
                        } else {
                          if (var4.field_jb != -1) {
                            break L47;
                          } else {
                            break L48;
                          }
                        }
                      }
                      if (-7 == ti.field_N) {
                        break L47;
                      } else {
                        if (var4 == null) {
                          break L46;
                        } else {
                          if (250 <= var4.field_ib) {
                            break L46;
                          } else {
                            mo.field_f = tc.field_y;
                            break L46;
                          }
                        }
                      }
                    }
                    rm.field_k = -rm.field_k;
                    rk.field_O.a(0, true).field_ib = 250;
                    break L46;
                  }
                  kl.field_A = 400;
                  break L45;
                } else {
                  break L45;
                }
              }
              if (rk.field_O.a(0, true).field_ib >= 250) {
                break L29;
              } else {
                rm.field_k = -Math.abs(rm.field_k);
                qn.field_ob.field_bb = rk.field_O.a(0, true).field_T;
                if (240 <= rk.field_O.a(0, true).field_ib) {
                  break L29;
                } else {
                  rk.field_O.a(0, true).field_ib = rk.field_O.a(0, true).field_ib + 1;
                  break L29;
                }
              }
            }
          } else {
            break L29;
          }
        }
        L49: {
          if (-7 == (mj.field_p ^ -1)) {
            if (null != rk.field_O.a(0, true)) {
              if (-1 == (rm.field_k ^ -1)) {
                mo.field_f = dc.field_g;
                qn.field_ob.field_B = true;
                qn.field_ob.field_z = 1500;
                i.b(45);
                qn.field_ob.field_H = false;
                qn.field_ob.field_X = false;
                kl.field_A = 400;
                qn.field_ob.field_g = false;
                break L49;
              } else {
                if ((rm.field_k ^ -1) == -2) {
                  mo.field_f = bh.field_a;
                  qn.field_ob.field_B = true;
                  qn.field_ob.field_z = 1500;
                  i.b(param0 + -115);
                  qn.field_ob.field_X = false;
                  qn.field_ob.field_H = false;
                  break L49;
                } else {
                  if (2 != rm.field_k) {
                    if (3 == rm.field_k) {
                      kl.field_A = 280;
                      qn.field_ob.field_z = 6000;
                      mo.field_f = jl.field_e;
                      qn.field_ob.field_B = true;
                      i.b(86);
                      break L49;
                    } else {
                      if (-5 == rm.field_k) {
                        qn.field_ob.field_z = 6000;
                        qn.field_ob.field_B = true;
                        mo.field_f = bb.field_d;
                        kl.field_A = 280;
                        i.b(-18);
                        break L49;
                      } else {
                        if (-6 != rm.field_k) {
                          if (-7 == (rm.field_k ^ -1)) {
                            qn.field_ob.field_z = 6000;
                            mo.field_f = mo.field_l;
                            qn.field_ob.field_X = false;
                            qn.field_ob.field_B = true;
                            i.b(-115);
                            break L49;
                          } else {
                            break L49;
                          }
                        } else {
                          break L49;
                        }
                      }
                    }
                  } else {
                    qn.field_ob.field_B = true;
                    mo.field_f = fk.field_i;
                    qn.field_ob.field_z = 1500;
                    i.b(120);
                    qn.field_ob.field_X = false;
                    break L49;
                  }
                }
              }
            } else {
              gj.a(true, true, 14, mn.field_r);
              co.c(108);
              return;
            }
          } else {
            break L49;
          }
        }
        L50: {
          if (param0 == -3) {
            break L50;
          } else {
            field_c = null;
            break L50;
          }
        }
        if (7 == mj.field_p) {
          if (null == rk.field_O.a(0, true)) {
            gj.a(true, true, 14, mn.field_r);
            co.c(113);
            return;
          } else {
            L51: {
              if (0 == rm.field_k) {
                mo.field_f = vd.field_j;
                qn.field_ob.field_B = true;
                break L51;
              } else {
                if (!param1) {
                  mo.field_f = oc.field_h;
                  break L51;
                } else {
                  break L51;
                }
              }
            }
            L52: {
              var5 = rk.field_O.a(qn.field_ob.field_bb, true);
              if (-1 < (rm.field_k ^ -1)) {
                L53: {
                  L54: {
                    L55: {
                      kl.field_A = 400;
                      if (var5 == null) {
                        break L55;
                      } else {
                        if (var5.field_jb != 0) {
                          break L54;
                        } else {
                          break L55;
                        }
                      }
                    }
                    if ((ti.field_N ^ -1) != 0) {
                      break L54;
                    } else {
                      break L53;
                    }
                  }
                  rm.field_k = -rm.field_k;
                  break L53;
                }
                if (var5 == null) {
                  break L52;
                } else {
                  if ((var5.field_ib ^ -1) <= -251) {
                    break L52;
                  } else {
                    mo.field_f = q.field_F;
                    break L52;
                  }
                }
              } else {
                break L52;
              }
            }
            L56: {
              if (rk.field_O.a(0, true).field_x <= 0) {
                break L56;
              } else {
                rm.field_k = -Math.abs(rm.field_k);
                qn.field_ob.field_bb = rk.field_O.a(0, true).field_T;
                break L56;
              }
            }
            return;
          }
        } else {
          return;
        }
    }

    public final void paint(java.awt.Graphics param0) {
        ((jh) this).field_g.paint(param0);
    }

    jh(java.awt.Component param0) {
        ((jh) this).field_g = param0;
    }

    final static int a(wk param0, byte param1, String param2) {
        int var3 = param0.field_g;
        if (param1 != 127) {
            field_h = 0.05152737468678133;
        }
        CharSequence var5 = (CharSequence) (Object) param2;
        byte[] var4 = go.a(var5, (byte) -82);
        param0.d(var4.length, (byte) -124);
        param0.field_g = param0.field_g + kh.field_g.a(param0.field_j, var4.length, var4, param0.field_g, 1, 0);
        return -var3 + param0.field_g;
    }

    final static void a(Throwable param0, String param1, byte param2) {
        try {
            Exception var3 = null;
            String var3_ref = null;
            og var4 = null;
            DataInputStream var5 = null;
            int var6 = 0;
            Object var7 = null;
            String var8 = null;
            dl stackIn_13_0 = null;
            int stackIn_13_1 = 0;
            java.net.URL stackIn_13_2 = null;
            java.net.URL stackIn_13_3 = null;
            java.net.URL stackIn_13_4 = null;
            StringBuilder stackIn_13_5 = null;
            dl stackIn_14_0 = null;
            int stackIn_14_1 = 0;
            java.net.URL stackIn_14_2 = null;
            java.net.URL stackIn_14_3 = null;
            java.net.URL stackIn_14_4 = null;
            StringBuilder stackIn_14_5 = null;
            dl stackIn_15_0 = null;
            int stackIn_15_1 = 0;
            java.net.URL stackIn_15_2 = null;
            java.net.URL stackIn_15_3 = null;
            java.net.URL stackIn_15_4 = null;
            StringBuilder stackIn_15_5 = null;
            String stackIn_15_6 = null;
            dl stackOut_12_0 = null;
            int stackOut_12_1 = 0;
            java.net.URL stackOut_12_2 = null;
            java.net.URL stackOut_12_3 = null;
            java.net.URL stackOut_12_4 = null;
            StringBuilder stackOut_12_5 = null;
            dl stackOut_13_0 = null;
            int stackOut_13_1 = 0;
            java.net.URL stackOut_13_2 = null;
            java.net.URL stackOut_13_3 = null;
            java.net.URL stackOut_13_4 = null;
            StringBuilder stackOut_13_5 = null;
            String stackOut_13_6 = null;
            dl stackOut_14_0 = null;
            int stackOut_14_1 = 0;
            java.net.URL stackOut_14_2 = null;
            java.net.URL stackOut_14_3 = null;
            java.net.URL stackOut_14_4 = null;
            StringBuilder stackOut_14_5 = null;
            String stackOut_14_6 = null;
            int statePc = 0;
            Throwable caughtException = null;
            stateLoop: while (true) {
                switch (statePc) {
                    case 0: {
                        var6 = ArcanistsMulti.field_G ? 1 : 0;
                        statePc = 1;
                        continue stateLoop;
                    }
                    case 1: {
                        try {
                            var3_ref = "";
                            if (param0 == null) {
                                statePc = 3;
                            } else {
                                statePc = 2;
                            }
                            continue stateLoop;
                        } catch (Throwable stateCaught_1) {
                            caughtException = stateCaught_1;
                            statePc = 21;
                            continue stateLoop;
                        }
                    }
                    case 2: {
                        try {
                            var3_ref = b.a((byte) 122, param0);
                            statePc = 3;
                            continue stateLoop;
                        } catch (Throwable stateCaught_2) {
                            caughtException = stateCaught_2;
                            statePc = 21;
                            continue stateLoop;
                        }
                    }
                    case 3: {
                        try {
                            if (param1 == null) {
                                statePc = 7;
                            } else {
                                statePc = 4;
                            }
                            continue stateLoop;
                        } catch (Throwable stateCaught_3) {
                            caughtException = stateCaught_3;
                            statePc = 21;
                            continue stateLoop;
                        }
                    }
                    case 4: {
                        try {
                            if (param0 == null) {
                                statePc = 6;
                            } else {
                                statePc = 5;
                            }
                            continue stateLoop;
                        } catch (Throwable stateCaught_4) {
                            caughtException = stateCaught_4;
                            statePc = 21;
                            continue stateLoop;
                        }
                    }
                    case 5: {
                        try {
                            var3_ref = var3_ref + " | ";
                            statePc = 6;
                            continue stateLoop;
                        } catch (Throwable stateCaught_5) {
                            caughtException = stateCaught_5;
                            statePc = 21;
                            continue stateLoop;
                        }
                    }
                    case 6: {
                        try {
                            var3_ref = var3_ref + param1;
                            statePc = 7;
                            continue stateLoop;
                        } catch (Throwable stateCaught_6) {
                            caughtException = stateCaught_6;
                            statePc = 21;
                            continue stateLoop;
                        }
                    }
                    case 7: {
                        try {
                            se.a((byte) -125, var3_ref);
                            if (param2 == 20) {
                                statePc = 9;
                            } else {
                                statePc = 8;
                            }
                            continue stateLoop;
                        } catch (Throwable stateCaught_7) {
                            caughtException = stateCaught_7;
                            statePc = 21;
                            continue stateLoop;
                        }
                    }
                    case 8: {
                        try {
                            var7 = null;
                            jh.a((String) null, (java.applet.Applet) null, true, (byte) 83);
                            statePc = 9;
                            continue stateLoop;
                        } catch (Throwable stateCaught_8) {
                            caughtException = stateCaught_8;
                            statePc = 21;
                            continue stateLoop;
                        }
                    }
                    case 9: {
                        try {
                            var3_ref = si.a(var3_ref, ":", "%3a", (byte) 107);
                            var3_ref = si.a(var3_ref, "@", "%40", (byte) 125);
                            var3_ref = si.a(var3_ref, "&", "%26", (byte) 100);
                            var8 = si.a(var3_ref, "#", "%23", (byte) 100);
                            if (hh.field_e == null) {
                                statePc = 11;
                            } else {
                                statePc = 10;
                            }
                            continue stateLoop;
                        } catch (Throwable stateCaught_9) {
                            caughtException = stateCaught_9;
                            statePc = 21;
                            continue stateLoop;
                        }
                    }
                    case 10: {
                        try {
                            statePc = 12;
                            continue stateLoop;
                        } catch (Throwable stateCaught_10) {
                            caughtException = stateCaught_10;
                            statePc = 21;
                            continue stateLoop;
                        }
                    }
                    case 11: {
                        return;
                    }
                    case 12: {
                        try {
                            stackOut_12_0 = rb.field_k;
                            stackOut_12_1 = 1;
                            stackOut_12_2 = null;
                            stackOut_12_3 = null;
                            stackOut_12_4 = hh.field_e.getCodeBase();
                            stackOut_12_5 = new StringBuilder().append("clienterror.ws?c=").append(ji.field_g).append("&u=");
                            stackIn_14_0 = stackOut_12_0;
                            stackIn_14_1 = stackOut_12_1;
                            stackIn_14_2 = stackOut_12_2;
                            stackIn_14_3 = stackOut_12_3;
                            stackIn_14_4 = stackOut_12_4;
                            stackIn_14_5 = stackOut_12_5;
                            stackIn_13_0 = stackOut_12_0;
                            stackIn_13_1 = stackOut_12_1;
                            stackIn_13_2 = stackOut_12_2;
                            stackIn_13_3 = stackOut_12_3;
                            stackIn_13_4 = stackOut_12_4;
                            stackIn_13_5 = stackOut_12_5;
                            if (null == fj.field_i) {
                                statePc = 14;
                            } else {
                                statePc = 13;
                            }
                            continue stateLoop;
                        } catch (Throwable stateCaught_12) {
                            caughtException = stateCaught_12;
                            statePc = 21;
                            continue stateLoop;
                        }
                    }
                    case 13: {
                        try {
                            stackOut_13_0 = (dl) (Object) stackIn_13_0;
                            stackOut_13_1 = stackIn_13_1;
                            stackOut_13_2 = null;
                            stackOut_13_3 = null;
                            stackOut_13_4 = (java.net.URL) (Object) stackIn_13_4;
                            stackOut_13_5 = (StringBuilder) (Object) stackIn_13_5;
                            stackOut_13_6 = fj.field_i;
                            stackIn_15_0 = stackOut_13_0;
                            stackIn_15_1 = stackOut_13_1;
                            stackIn_15_2 = stackOut_13_2;
                            stackIn_15_3 = stackOut_13_3;
                            stackIn_15_4 = stackOut_13_4;
                            stackIn_15_5 = stackOut_13_5;
                            stackIn_15_6 = stackOut_13_6;
                            statePc = 15;
                            continue stateLoop;
                        } catch (Throwable stateCaught_13) {
                            caughtException = stateCaught_13;
                            statePc = 21;
                            continue stateLoop;
                        }
                    }
                    case 14: {
                        try {
                            stackOut_14_0 = (dl) (Object) stackIn_14_0;
                            stackOut_14_1 = stackIn_14_1;
                            stackOut_14_2 = null;
                            stackOut_14_3 = null;
                            stackOut_14_4 = (java.net.URL) (Object) stackIn_14_4;
                            stackOut_14_5 = (StringBuilder) (Object) stackIn_14_5;
                            stackOut_14_6 = "" + vg.field_K;
                            stackIn_15_0 = stackOut_14_0;
                            stackIn_15_1 = stackOut_14_1;
                            stackIn_15_2 = stackOut_14_2;
                            stackIn_15_3 = stackOut_14_3;
                            stackIn_15_4 = stackOut_14_4;
                            stackIn_15_5 = stackOut_14_5;
                            stackIn_15_6 = stackOut_14_6;
                            statePc = 15;
                            continue stateLoop;
                        } catch (Throwable stateCaught_14) {
                            caughtException = stateCaught_14;
                            statePc = 21;
                            continue stateLoop;
                        }
                    }
                    case 15: {
                        try {
                            new java.net.URL((java.net.URL) (Object) stackIn_15_4, (String) (Object) (stackIn_15_6 + "&v1=" + dl.field_l + "&v2=" + dl.field_c + "&e=" + var8));
                            var4 = ((dl) (Object) stackIn_15_0).a(stackIn_15_1 != 0, (java.net.URL) (Object) stackIn_15_2);
                            statePc = 16;
                            continue stateLoop;
                        } catch (Throwable stateCaught_15) {
                            caughtException = stateCaught_15;
                            statePc = 21;
                            continue stateLoop;
                        }
                    }
                    case 16: {
                        try {
                            if (var4.field_e != -1) {
                                statePc = 18;
                            } else {
                                statePc = 17;
                            }
                            continue stateLoop;
                        } catch (Throwable stateCaught_16) {
                            caughtException = stateCaught_16;
                            statePc = 21;
                            continue stateLoop;
                        }
                    }
                    case 17: {
                        try {
                            ao.a(1L, 1);
                            statePc = 16;
                            continue stateLoop;
                        } catch (Throwable stateCaught_17) {
                            caughtException = stateCaught_17;
                            statePc = 21;
                            continue stateLoop;
                        }
                    }
                    case 18: {
                        try {
                            if (-2 != var4.field_e) {
                                statePc = 22;
                            } else {
                                statePc = 19;
                            }
                            continue stateLoop;
                        } catch (Throwable stateCaught_18) {
                            caughtException = stateCaught_18;
                            statePc = 21;
                            continue stateLoop;
                        }
                    }
                    case 19: {
                        try {
                            var5 = (DataInputStream) var4.field_g;
                            int discarded$1 = var5.read();
                            var5.close();
                            statePc = 22;
                            continue stateLoop;
                        } catch (Throwable stateCaught_19) {
                            caughtException = stateCaught_19;
                            statePc = 21;
                            continue stateLoop;
                        }
                    }
                    case 21: {
                        var3 = (Exception) (Object) caughtException;
                        statePc = 22;
                        continue stateLoop;
                    }
                    case 22: {
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

    public static void a(byte param0) {
        field_c = null;
        if (param0 <= 24) {
            field_f = 116;
        }
        field_a = null;
        field_b = null;
        field_d = null;
    }

    public final void update(java.awt.Graphics param0) {
        ((jh) this).field_g.update(param0);
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_a = null;
        field_b = new byte[50][];
        field_d = new String[][]{new String[7], new String[10], new String[2]};
        field_h = Math.atan2(1.0, 0.0);
        field_f = 0;
    }
}
