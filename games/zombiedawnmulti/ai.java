/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class ai implements Runnable {
    private lq field_e;
    static gh field_g;
    static String field_d;
    static int field_a;
    private Thread field_i;
    private boolean field_f;
    static cj field_c;
    static int field_b;
    int field_h;

    final li b(int param0, bq param1, int param2) {
        li var4 = null;
        Object var5 = null;
        if (param2 != 10) {
          var5 = null;
          li discarded$1 = ((ai) this).a(-98, (bq) null, -12);
          var4 = new li();
          var4.field_B = param1;
          var4.field_r = false;
          var4.field_y = 3;
          var4.field_l = (long)param0;
          this.a(false, var4);
          return var4;
        } else {
          var4 = new li();
          var4.field_B = param1;
          var4.field_r = false;
          var4.field_y = 3;
          var4.field_l = (long)param0;
          this.a(false, var4);
          return var4;
        }
    }

    final static void a(String param0, byte param1) {
        wk.a(param0, (byte) 48);
        qj.a(jl.field_v, false, 102);
        int var2 = -102 % ((52 - param1) / 40);
    }

    public final void run() {
        try {
            InterruptedException interruptedException = null;
            Object var2 = null;
            Exception var2_ref = null;
            Throwable var4 = null;
            int var5 = 0;
            Object var6 = null;
            li var7 = null;
            int statePc = 0;
            Throwable caughtException = null;
            stateLoop: while (true) {
                switch (statePc) {
                    case 0: {
                        var5 = ZombieDawnMulti.field_E ? 1 : 0;
                        statePc = 1;
                        continue stateLoop;
                    }
                    case 1: {
                        if (!((ai) this).field_f) {
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
                        var2 = (Object) (Object) ((ai) this).field_e;
                        // monitorenter ((ai) this).field_e
                        statePc = 4;
                        continue stateLoop;
                    }
                    case 4: {
                        try {
                            var7 = (li) (Object) ((ai) this).field_e.a(11356);
                            if (var7 != null) {
                                statePc = 11;
                            } else {
                                statePc = 5;
                            }
                            continue stateLoop;
                        } catch (Throwable stateCaught_4) {
                            caughtException = stateCaught_4;
                            statePc = 13;
                            continue stateLoop;
                        }
                    }
                    case 5: {
                        try {
                            statePc = 6;
                            continue stateLoop;
                        } catch (Throwable stateCaught_5) {
                            caughtException = stateCaught_5;
                            statePc = 13;
                            continue stateLoop;
                        }
                    }
                    case 6: {
                        try {
                            ((Object) (Object) ((ai) this).field_e).wait();
                            statePc = 7;
                            continue stateLoop;
                        } catch (Throwable stateCaught_6) {
                            caughtException = stateCaught_6;
                            statePc = (stateCaught_6 instanceof InterruptedException ? 8 : 13);
                            continue stateLoop;
                        }
                    }
                    case 7: {
                        try {
                            statePc = 9;
                            continue stateLoop;
                        } catch (Throwable stateCaught_7) {
                            caughtException = stateCaught_7;
                            statePc = 13;
                            continue stateLoop;
                        }
                    }
                    case 8: {
                        try {
                            interruptedException = (InterruptedException) (Object) caughtException;
                            statePc = 9;
                            continue stateLoop;
                        } catch (Throwable stateCaught_8) {
                            caughtException = stateCaught_8;
                            statePc = 13;
                            continue stateLoop;
                        }
                    }
                    case 9: {
                        try {
                            // monitorexit var2
                            statePc = 1;
                            continue stateLoop;
                        } catch (Throwable stateCaught_9) {
                            caughtException = stateCaught_9;
                            statePc = 13;
                            continue stateLoop;
                        }
                    }
                    case 11: {
                        try {
                            ((ai) this).field_h = ((ai) this).field_h - 1;
                            // monitorexit var2
                            statePc = 15;
                            continue stateLoop;
                        } catch (Throwable stateCaught_11) {
                            caughtException = stateCaught_11;
                            statePc = 13;
                            continue stateLoop;
                        }
                    }
                    case 13: {
                        try {
                            var4 = caughtException;
                            // monitorexit var2
                            statePc = 14;
                            continue stateLoop;
                        } catch (Throwable stateCaught_13) {
                            caughtException = stateCaught_13;
                            statePc = 13;
                            continue stateLoop;
                        }
                    }
                    case 14: {
                        throw (RuntimeException) (Object) var4;
                    }
                    case 15: {
                        try {
                            if (var7.field_y == -3) {
                                statePc = 18;
                            } else {
                                statePc = 16;
                            }
                            continue stateLoop;
                        } catch (Throwable stateCaught_15) {
                            caughtException = stateCaught_15;
                            statePc = 20;
                            continue stateLoop;
                        }
                    }
                    case 16: {
                        try {
                            if (-4 != var7.field_y) {
                                statePc = 21;
                            } else {
                                statePc = 17;
                            }
                            continue stateLoop;
                        } catch (Throwable stateCaught_16) {
                            caughtException = stateCaught_16;
                            statePc = 20;
                            continue stateLoop;
                        }
                    }
                    case 17: {
                        try {
                            var7.field_D = var7.field_B.a(1, (int)var7.field_l);
                            var7.field_t = false;
                            statePc = 1;
                            continue stateLoop;
                        } catch (Throwable stateCaught_17) {
                            caughtException = stateCaught_17;
                            statePc = 20;
                            continue stateLoop;
                        }
                    }
                    case 18: {
                        try {
                            boolean discarded$1 = var7.field_B.a((byte) 118, var7.field_D, var7.field_D.length, (int)var7.field_l);
                            var7.field_t = false;
                            statePc = 1;
                            continue stateLoop;
                        } catch (Throwable stateCaught_18) {
                            caughtException = stateCaught_18;
                            statePc = 20;
                            continue stateLoop;
                        }
                    }
                    case 20: {
                        var2_ref = (Exception) (Object) caughtException;
                        var6 = null;
                        bd.a((String) null, (Throwable) (Object) var2_ref, false);
                        statePc = 21;
                        continue stateLoop;
                    }
                    case 21: {
                        var7.field_t = false;
                        statePc = 1;
                        continue stateLoop;
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

    final li a(int param0, bq param1, byte[] param2, int param3) {
        li var5 = null;
        var5 = new li();
        var5.field_r = false;
        var5.field_l = (long)param0;
        var5.field_D = param2;
        var5.field_y = 2;
        var5.field_B = param1;
        this.a(false, var5);
        if (param3 <= 26) {
          return null;
        } else {
          return var5;
        }
    }

    final static int a(boolean param0, byte param1) {
        int var2 = 0;
        int var3 = 0;
        int var4 = 0;
        int var5 = 0;
        L0: {
          var5 = ZombieDawnMulti.field_E ? 1 : 0;
          lq.field_b = lq.field_b + 65536;
          if (param1 == 110) {
            break L0;
          } else {
            field_d = null;
            break L0;
          }
        }
        L1: while (true) {
          if (65536 > sd.a((byte) 120, lq.field_b, nf.field_b)) {
            L2: {
              var2 = -1;
              if (null == ld.field_Ub) {
                if (null != ao.field_h) {
                  var2 = ao.field_h.length;
                  break L2;
                } else {
                  break L2;
                }
              } else {
                var2 = ld.field_Ub.length;
                break L2;
              }
            }
            L3: {
              if ((var2 ^ -1) != 0) {
                L4: {
                  if (lb.field_a >= nf.field_c) {
                    break L4;
                  } else {
                    L5: {
                      lb.field_a = lb.field_a + 1;
                      if (lb.field_a <= nf.field_a) {
                        break L5;
                      } else {
                        L6: {
                          if (null == ld.field_Ub) {
                            break L6;
                          } else {
                            if (null != ld.field_Ub[gf.field_g]) {
                              break L5;
                            } else {
                              break L6;
                            }
                          }
                        }
                        lb.field_a = lb.field_a - 1;
                        break L4;
                      }
                    }
                    if (lb.field_a < nf.field_c) {
                      break L4;
                    } else {
                      if (ld.field_Ub[(gf.field_g + 1) % var2] == null) {
                        lb.field_a = lb.field_a - 1;
                        break L4;
                      } else {
                        break L4;
                      }
                    }
                  }
                }
                L7: {
                  if (nf.field_c <= lb.field_a) {
                    L8: {
                      gf.field_j = gf.field_g;
                      if (qh.field_a) {
                        gf.field_g = gf.field_g + 1;
                        if (gf.field_g >= var2) {
                          gf.field_g = gf.field_g - var2;
                          break L8;
                        } else {
                          break L8;
                        }
                      } else {
                        gf.field_g = gf.field_g - 1;
                        if (gf.field_g >= 0) {
                          break L8;
                        } else {
                          gf.field_g = gf.field_g + var2;
                          break L8;
                        }
                      }
                    }
                    lb.field_a = lb.field_a - nf.field_c;
                    break L7;
                  } else {
                    break L7;
                  }
                }
                if (nf.field_a >= lb.field_a) {
                  break L3;
                } else {
                  L9: {
                    qh.field_a = true;
                    if (fa.field_Tb == null) {
                      break L9;
                    } else {
                      L10: {
                        var3 = -(fa.field_Tb.field_u / 2) + 357;
                        var4 = 0;
                        if (kd.field_b == 0) {
                          break L10;
                        } else {
                          if (ka.field_t <= var3) {
                            break L10;
                          } else {
                            if (fa.field_Tb.field_w + var3 <= ka.field_t) {
                              break L10;
                            } else {
                              L11: {
                                if (269 + -fa.field_Tb.field_x >= vb.field_f) {
                                  break L11;
                                } else {
                                  if (-270 >= vb.field_f) {
                                    break L11;
                                  } else {
                                    var4 = 1;
                                    lb.field_a = nf.field_c;
                                    qh.field_a = false;
                                    break L11;
                                  }
                                }
                              }
                              if (-587 >= vb.field_f) {
                                break L10;
                              } else {
                                if (vb.field_f < fa.field_Tb.field_x + 586) {
                                  var4 = 1;
                                  qh.field_a = true;
                                  lb.field_a = nf.field_c;
                                  break L10;
                                } else {
                                  break L10;
                                }
                              }
                            }
                          }
                        }
                      }
                      if (var4 != 0) {
                        break L9;
                      } else {
                        if (nf.field_a >= lb.field_a) {
                          break L9;
                        } else {
                          if (bo.field_d <= var3) {
                            break L9;
                          } else {
                            if (fa.field_Tb.field_w + var3 > bo.field_d) {
                              L12: {
                                if (-fa.field_Tb.field_x + 269 >= bd.field_g) {
                                  break L12;
                                } else {
                                  if (269 > bd.field_g) {
                                    lb.field_a = nf.field_a;
                                    break L12;
                                  } else {
                                    break L12;
                                  }
                                }
                              }
                              if ((bd.field_g ^ -1) >= -587) {
                                break L9;
                              } else {
                                if (bd.field_g < 586 - -fa.field_Tb.field_x) {
                                  lb.field_a = nf.field_a;
                                  break L9;
                                } else {
                                  break L9;
                                }
                              }
                            } else {
                              break L9;
                            }
                          }
                        }
                      }
                    }
                  }
                  if (param0) {
                    L13: {
                      gl.field_H.a(al.c(bo.field_d, -1, bd.field_g), 104, al.c(ka.field_t, param1 + -111, vb.field_f));
                      if (!gl.field_H.c(-85)) {
                        break L13;
                      } else {
                        if (gl.field_H.field_d == 0) {
                          return 3;
                        } else {
                          if (gl.field_H.field_d != 1) {
                            break L13;
                          } else {
                            return 2;
                          }
                        }
                      }
                    }
                    L14: while (true) {
                      if (ba.c(param1 ^ -111)) {
                        L15: {
                          gl.field_H.a(0, false);
                          if (!gl.field_H.c(-85)) {
                            break L15;
                          } else {
                            if (gl.field_H.field_d != 0) {
                              if (gl.field_H.field_d == 1) {
                                return 1;
                              } else {
                                break L15;
                              }
                            } else {
                              return 3;
                            }
                          }
                        }
                        if (13 != sj.field_p) {
                          continue L14;
                        } else {
                          return 1;
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
                break L3;
              }
            }
            if (fa.field_Tb != null) {
              var3 = -(fa.field_Tb.field_u / 2) + 357;
              var4 = 0;
              if (kd.field_b != 0) {
                L16: {
                  if (ka.field_t <= var3) {
                    break L16;
                  } else {
                    if (fa.field_Tb.field_w + var3 <= ka.field_t) {
                      break L16;
                    } else {
                      L17: {
                        if (269 + -fa.field_Tb.field_x >= vb.field_f) {
                          break L17;
                        } else {
                          if (-270 >= vb.field_f) {
                            break L17;
                          } else {
                            var4 = 1;
                            lb.field_a = nf.field_c;
                            qh.field_a = false;
                            break L17;
                          }
                        }
                      }
                      if (-587 >= vb.field_f) {
                        break L16;
                      } else {
                        if (vb.field_f < fa.field_Tb.field_x + 586) {
                          var4 = 1;
                          qh.field_a = true;
                          lb.field_a = nf.field_c;
                          break L16;
                        } else {
                          L18: {
                            if (var4 != 0) {
                              break L18;
                            } else {
                              if (nf.field_a >= lb.field_a) {
                                break L18;
                              } else {
                                if (bo.field_d <= var3) {
                                  break L18;
                                } else {
                                  if (fa.field_Tb.field_w + var3 > bo.field_d) {
                                    L19: {
                                      if (-fa.field_Tb.field_x + 269 >= bd.field_g) {
                                        break L19;
                                      } else {
                                        if (269 > bd.field_g) {
                                          lb.field_a = nf.field_a;
                                          break L19;
                                        } else {
                                          break L19;
                                        }
                                      }
                                    }
                                    if ((bd.field_g ^ -1) >= -587) {
                                      break L18;
                                    } else {
                                      if (bd.field_g < 586 - -fa.field_Tb.field_x) {
                                        lb.field_a = nf.field_a;
                                        break L18;
                                      } else {
                                        if (param0) {
                                          L20: {
                                            gl.field_H.a(al.c(bo.field_d, -1, bd.field_g), 104, al.c(ka.field_t, param1 + -111, vb.field_f));
                                            if (!gl.field_H.c(-85)) {
                                              break L20;
                                            } else {
                                              if (gl.field_H.field_d == 0) {
                                                return 3;
                                              } else {
                                                if (gl.field_H.field_d != 1) {
                                                  break L20;
                                                } else {
                                                  return 2;
                                                }
                                              }
                                            }
                                          }
                                          L21: while (true) {
                                            if (ba.c(param1 ^ -111)) {
                                              L22: {
                                                gl.field_H.a(0, false);
                                                if (!gl.field_H.c(-85)) {
                                                  break L22;
                                                } else {
                                                  if (gl.field_H.field_d != 0) {
                                                    if (gl.field_H.field_d == 1) {
                                                      return 1;
                                                    } else {
                                                      break L22;
                                                    }
                                                  } else {
                                                    return 3;
                                                  }
                                                }
                                              }
                                              if (13 != sj.field_p) {
                                                continue L21;
                                              } else {
                                                return 1;
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
                                  } else {
                                    break L18;
                                  }
                                }
                              }
                            }
                          }
                          if (param0) {
                            L23: {
                              gl.field_H.a(al.c(bo.field_d, -1, bd.field_g), 104, al.c(ka.field_t, param1 + -111, vb.field_f));
                              if (!gl.field_H.c(-85)) {
                                break L23;
                              } else {
                                if (gl.field_H.field_d == 0) {
                                  return 3;
                                } else {
                                  if (gl.field_H.field_d != 1) {
                                    break L23;
                                  } else {
                                    return 2;
                                  }
                                }
                              }
                            }
                            L24: while (true) {
                              if (ba.c(param1 ^ -111)) {
                                L25: {
                                  gl.field_H.a(0, false);
                                  if (!gl.field_H.c(-85)) {
                                    break L25;
                                  } else {
                                    if (gl.field_H.field_d != 0) {
                                      if (gl.field_H.field_d == 1) {
                                        return 1;
                                      } else {
                                        break L25;
                                      }
                                    } else {
                                      return 3;
                                    }
                                  }
                                }
                                if (13 != sj.field_p) {
                                  continue L24;
                                } else {
                                  return 1;
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
                L26: {
                  if (var4 != 0) {
                    break L26;
                  } else {
                    if (nf.field_a >= lb.field_a) {
                      break L26;
                    } else {
                      if (bo.field_d <= var3) {
                        break L26;
                      } else {
                        if (fa.field_Tb.field_w + var3 > bo.field_d) {
                          L27: {
                            if (-fa.field_Tb.field_x + 269 >= bd.field_g) {
                              break L27;
                            } else {
                              if (269 > bd.field_g) {
                                lb.field_a = nf.field_a;
                                break L27;
                              } else {
                                L28: {
                                  if ((bd.field_g ^ -1) >= -587) {
                                    break L28;
                                  } else {
                                    if (bd.field_g < 586 - -fa.field_Tb.field_x) {
                                      lb.field_a = nf.field_a;
                                      break L28;
                                    } else {
                                      if (param0) {
                                        L29: {
                                          gl.field_H.a(al.c(bo.field_d, -1, bd.field_g), 104, al.c(ka.field_t, param1 + -111, vb.field_f));
                                          if (!gl.field_H.c(-85)) {
                                            break L29;
                                          } else {
                                            if (gl.field_H.field_d == 0) {
                                              return 3;
                                            } else {
                                              if (gl.field_H.field_d != 1) {
                                                break L29;
                                              } else {
                                                return 2;
                                              }
                                            }
                                          }
                                        }
                                        L30: while (true) {
                                          if (ba.c(param1 ^ -111)) {
                                            L31: {
                                              gl.field_H.a(0, false);
                                              if (!gl.field_H.c(-85)) {
                                                break L31;
                                              } else {
                                                if (gl.field_H.field_d != 0) {
                                                  if (gl.field_H.field_d == 1) {
                                                    return 1;
                                                  } else {
                                                    break L31;
                                                  }
                                                } else {
                                                  return 3;
                                                }
                                              }
                                            }
                                            if (13 != sj.field_p) {
                                              continue L30;
                                            } else {
                                              return 1;
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
                                if (param0) {
                                  L32: {
                                    gl.field_H.a(al.c(bo.field_d, -1, bd.field_g), 104, al.c(ka.field_t, param1 + -111, vb.field_f));
                                    if (!gl.field_H.c(-85)) {
                                      break L32;
                                    } else {
                                      if (gl.field_H.field_d == 0) {
                                        return 3;
                                      } else {
                                        if (gl.field_H.field_d != 1) {
                                          break L32;
                                        } else {
                                          return 2;
                                        }
                                      }
                                    }
                                  }
                                  L33: while (true) {
                                    if (!ba.c(param1 ^ -111)) {
                                      return 0;
                                    } else {
                                      L34: {
                                        gl.field_H.a(0, false);
                                        if (!gl.field_H.c(-85)) {
                                          break L34;
                                        } else {
                                          if (gl.field_H.field_d != 0) {
                                            if (gl.field_H.field_d == 1) {
                                              return 1;
                                            } else {
                                              break L34;
                                            }
                                          } else {
                                            return 3;
                                          }
                                        }
                                      }
                                      if (13 != sj.field_p) {
                                        continue L33;
                                      } else {
                                        return 1;
                                      }
                                    }
                                  }
                                } else {
                                  return 0;
                                }
                              }
                            }
                          }
                          if ((bd.field_g ^ -1) >= -587) {
                            break L26;
                          } else {
                            if (bd.field_g < 586 - -fa.field_Tb.field_x) {
                              lb.field_a = nf.field_a;
                              break L26;
                            } else {
                              if (param0) {
                                L35: {
                                  gl.field_H.a(al.c(bo.field_d, -1, bd.field_g), 104, al.c(ka.field_t, param1 + -111, vb.field_f));
                                  if (!gl.field_H.c(-85)) {
                                    break L35;
                                  } else {
                                    if (gl.field_H.field_d == 0) {
                                      return 3;
                                    } else {
                                      if (gl.field_H.field_d != 1) {
                                        break L35;
                                      } else {
                                        return 2;
                                      }
                                    }
                                  }
                                }
                                L36: while (true) {
                                  if (!ba.c(param1 ^ -111)) {
                                    return 0;
                                  } else {
                                    L37: {
                                      gl.field_H.a(0, false);
                                      if (!gl.field_H.c(-85)) {
                                        break L37;
                                      } else {
                                        if (gl.field_H.field_d != 0) {
                                          if (gl.field_H.field_d == 1) {
                                            return 1;
                                          } else {
                                            break L37;
                                          }
                                        } else {
                                          return 3;
                                        }
                                      }
                                    }
                                    if (13 != sj.field_p) {
                                      continue L36;
                                    } else {
                                      return 1;
                                    }
                                  }
                                }
                              } else {
                                return 0;
                              }
                            }
                          }
                        } else {
                          if (param0) {
                            L38: {
                              gl.field_H.a(al.c(bo.field_d, -1, bd.field_g), 104, al.c(ka.field_t, param1 + -111, vb.field_f));
                              if (!gl.field_H.c(-85)) {
                                break L38;
                              } else {
                                if (gl.field_H.field_d == 0) {
                                  return 3;
                                } else {
                                  if (gl.field_H.field_d != 1) {
                                    break L38;
                                  } else {
                                    return 2;
                                  }
                                }
                              }
                            }
                            L39: while (true) {
                              if (ba.c(param1 ^ -111)) {
                                L40: {
                                  gl.field_H.a(0, false);
                                  if (!gl.field_H.c(-85)) {
                                    break L40;
                                  } else {
                                    if (gl.field_H.field_d != 0) {
                                      if (gl.field_H.field_d == 1) {
                                        return 1;
                                      } else {
                                        break L40;
                                      }
                                    } else {
                                      return 3;
                                    }
                                  }
                                }
                                if (13 != sj.field_p) {
                                  continue L39;
                                } else {
                                  return 1;
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
                if (param0) {
                  L41: {
                    gl.field_H.a(al.c(bo.field_d, -1, bd.field_g), 104, al.c(ka.field_t, param1 + -111, vb.field_f));
                    if (!gl.field_H.c(-85)) {
                      break L41;
                    } else {
                      if (gl.field_H.field_d == 0) {
                        return 3;
                      } else {
                        if (gl.field_H.field_d != 1) {
                          break L41;
                        } else {
                          return 2;
                        }
                      }
                    }
                  }
                  L42: while (true) {
                    if (!ba.c(param1 ^ -111)) {
                      return 0;
                    } else {
                      L43: {
                        gl.field_H.a(0, false);
                        if (!gl.field_H.c(-85)) {
                          break L43;
                        } else {
                          if (gl.field_H.field_d != 0) {
                            if (gl.field_H.field_d == 1) {
                              return 1;
                            } else {
                              break L43;
                            }
                          } else {
                            return 3;
                          }
                        }
                      }
                      if (13 != sj.field_p) {
                        continue L42;
                      } else {
                        return 1;
                      }
                    }
                  }
                } else {
                  return 0;
                }
              } else {
                L44: {
                  if (var4 != 0) {
                    break L44;
                  } else {
                    if (nf.field_a >= lb.field_a) {
                      break L44;
                    } else {
                      if (bo.field_d <= var3) {
                        break L44;
                      } else {
                        if (fa.field_Tb.field_w + var3 > bo.field_d) {
                          L45: {
                            if (-fa.field_Tb.field_x + 269 >= bd.field_g) {
                              if ((bd.field_g ^ -1) >= -587) {
                                break L44;
                              } else {
                                if (bd.field_g >= 586 - -fa.field_Tb.field_x) {
                                  if (param0) {
                                    L46: {
                                      gl.field_H.a(al.c(bo.field_d, -1, bd.field_g), 104, al.c(ka.field_t, param1 + -111, vb.field_f));
                                      if (!gl.field_H.c(-85)) {
                                        break L46;
                                      } else {
                                        if (gl.field_H.field_d == 0) {
                                          return 3;
                                        } else {
                                          if (gl.field_H.field_d != 1) {
                                            break L46;
                                          } else {
                                            return 2;
                                          }
                                        }
                                      }
                                    }
                                    L47: while (true) {
                                      if (ba.c(param1 ^ -111)) {
                                        L48: {
                                          gl.field_H.a(0, false);
                                          if (!gl.field_H.c(-85)) {
                                            break L48;
                                          } else {
                                            if (gl.field_H.field_d != 0) {
                                              if (gl.field_H.field_d == 1) {
                                                return 1;
                                              } else {
                                                break L48;
                                              }
                                            } else {
                                              return 3;
                                            }
                                          }
                                        }
                                        if (13 != sj.field_p) {
                                          continue L47;
                                        } else {
                                          return 1;
                                        }
                                      } else {
                                        return 0;
                                      }
                                    }
                                  } else {
                                    break L45;
                                  }
                                } else {
                                  lb.field_a = nf.field_a;
                                  break L44;
                                }
                              }
                            } else {
                              if (269 > bd.field_g) {
                                lb.field_a = nf.field_a;
                                if ((bd.field_g ^ -1) >= -587) {
                                  break L44;
                                } else {
                                  if (bd.field_g >= 586 - -fa.field_Tb.field_x) {
                                    if (param0) {
                                      L49: {
                                        gl.field_H.a(al.c(bo.field_d, -1, bd.field_g), 104, al.c(ka.field_t, param1 + -111, vb.field_f));
                                        if (!gl.field_H.c(-85)) {
                                          break L49;
                                        } else {
                                          if (gl.field_H.field_d == 0) {
                                            return 3;
                                          } else {
                                            if (gl.field_H.field_d != 1) {
                                              break L49;
                                            } else {
                                              return 2;
                                            }
                                          }
                                        }
                                      }
                                      L50: while (true) {
                                        if (ba.c(param1 ^ -111)) {
                                          L51: {
                                            gl.field_H.a(0, false);
                                            if (!gl.field_H.c(-85)) {
                                              break L51;
                                            } else {
                                              if (gl.field_H.field_d != 0) {
                                                if (gl.field_H.field_d == 1) {
                                                  return 1;
                                                } else {
                                                  break L51;
                                                }
                                              } else {
                                                return 3;
                                              }
                                            }
                                          }
                                          if (13 != sj.field_p) {
                                            continue L50;
                                          } else {
                                            return 1;
                                          }
                                        } else {
                                          return 0;
                                        }
                                      }
                                    } else {
                                      break L45;
                                    }
                                  } else {
                                    lb.field_a = nf.field_a;
                                    break L44;
                                  }
                                }
                              } else {
                                L52: {
                                  if ((bd.field_g ^ -1) >= -587) {
                                    break L52;
                                  } else {
                                    if (bd.field_g < 586 - -fa.field_Tb.field_x) {
                                      lb.field_a = nf.field_a;
                                      break L52;
                                    } else {
                                      break L52;
                                    }
                                  }
                                }
                                if (param0) {
                                  L53: {
                                    gl.field_H.a(al.c(bo.field_d, -1, bd.field_g), 104, al.c(ka.field_t, param1 + -111, vb.field_f));
                                    if (!gl.field_H.c(-85)) {
                                      break L53;
                                    } else {
                                      if (gl.field_H.field_d == 0) {
                                        return 3;
                                      } else {
                                        if (gl.field_H.field_d != 1) {
                                          break L53;
                                        } else {
                                          return 2;
                                        }
                                      }
                                    }
                                  }
                                  L54: while (true) {
                                    if (ba.c(param1 ^ -111)) {
                                      L55: {
                                        gl.field_H.a(0, false);
                                        if (!gl.field_H.c(-85)) {
                                          break L55;
                                        } else {
                                          if (gl.field_H.field_d != 0) {
                                            if (gl.field_H.field_d == 1) {
                                              return 1;
                                            } else {
                                              break L55;
                                            }
                                          } else {
                                            return 3;
                                          }
                                        }
                                      }
                                      if (13 != sj.field_p) {
                                        continue L54;
                                      } else {
                                        return 1;
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
                          return 0;
                        } else {
                          if (param0) {
                            L56: {
                              gl.field_H.a(al.c(bo.field_d, -1, bd.field_g), 104, al.c(ka.field_t, param1 + -111, vb.field_f));
                              if (!gl.field_H.c(-85)) {
                                break L56;
                              } else {
                                if (gl.field_H.field_d == 0) {
                                  return 3;
                                } else {
                                  if (gl.field_H.field_d != 1) {
                                    break L56;
                                  } else {
                                    return 2;
                                  }
                                }
                              }
                            }
                            L57: while (true) {
                              if (ba.c(param1 ^ -111)) {
                                L58: {
                                  gl.field_H.a(0, false);
                                  if (!gl.field_H.c(-85)) {
                                    break L58;
                                  } else {
                                    if (gl.field_H.field_d != 0) {
                                      if (gl.field_H.field_d == 1) {
                                        return 1;
                                      } else {
                                        break L58;
                                      }
                                    } else {
                                      return 3;
                                    }
                                  }
                                }
                                if (13 != sj.field_p) {
                                  continue L57;
                                } else {
                                  return 1;
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
                if (param0) {
                  L59: {
                    gl.field_H.a(al.c(bo.field_d, -1, bd.field_g), 104, al.c(ka.field_t, param1 + -111, vb.field_f));
                    if (!gl.field_H.c(-85)) {
                      break L59;
                    } else {
                      if (gl.field_H.field_d == 0) {
                        return 3;
                      } else {
                        if (gl.field_H.field_d != 1) {
                          break L59;
                        } else {
                          return 2;
                        }
                      }
                    }
                  }
                  L60: while (true) {
                    if (ba.c(param1 ^ -111)) {
                      L61: {
                        gl.field_H.a(0, false);
                        if (!gl.field_H.c(-85)) {
                          break L61;
                        } else {
                          if (gl.field_H.field_d != 0) {
                            if (gl.field_H.field_d == 1) {
                              return 1;
                            } else {
                              break L61;
                            }
                          } else {
                            return 3;
                          }
                        }
                      }
                      if (13 != sj.field_p) {
                        continue L60;
                      } else {
                        return 1;
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
                L62: {
                  gl.field_H.a(al.c(bo.field_d, -1, bd.field_g), 104, al.c(ka.field_t, param1 + -111, vb.field_f));
                  if (!gl.field_H.c(-85)) {
                    break L62;
                  } else {
                    if (gl.field_H.field_d == 0) {
                      return 3;
                    } else {
                      if (gl.field_H.field_d != 1) {
                        break L62;
                      } else {
                        return 2;
                      }
                    }
                  }
                }
                L63: while (true) {
                  if (ba.c(param1 ^ -111)) {
                    L64: {
                      gl.field_H.a(0, false);
                      if (!gl.field_H.c(-85)) {
                        break L64;
                      } else {
                        if (gl.field_H.field_d != 0) {
                          if (gl.field_H.field_d == 1) {
                            return 1;
                          } else {
                            break L64;
                          }
                        } else {
                          return 3;
                        }
                      }
                    }
                    if (13 != sj.field_p) {
                      continue L63;
                    } else {
                      return 1;
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
            fn.field_c = fn.field_c + 1;
            lq.field_b = lq.field_b - nf.field_b;
            continue L1;
          }
        }
    }

    public static void a(int param0) {
        field_d = null;
        if (param0 < 126) {
            field_a = 104;
            field_c = null;
            field_g = null;
            return;
        }
        field_c = null;
        field_g = null;
    }

    final li a(int param0, bq param1, int param2) {
        li var4 = null;
        Object var5 = null;
        li var6 = null;
        Throwable var7 = null;
        int var8 = 0;
        li stackIn_10_0 = null;
        li stackOut_9_0 = null;
        int statePc = 0;
        Throwable caughtException = null;
        stateLoop: while (true) {
            switch (statePc) {
                case 0: {
                    var8 = ZombieDawnMulti.field_E ? 1 : 0;
                    var4 = new li();
                    if (param2 == -3) {
                        statePc = 2;
                    } else {
                        statePc = 1;
                    }
                    continue stateLoop;
                }
                case 1: {
                    return null;
                }
                case 2: {
                    var4.field_y = 1;
                    var5 = (Object) (Object) ((ai) this).field_e;
                    // monitorenter ((ai) this).field_e
                    statePc = 3;
                    continue stateLoop;
                }
                case 3: {
                    try {
                        var6 = (li) (Object) ((ai) this).field_e.c((byte) 85);
                        statePc = 4;
                        continue stateLoop;
                    } catch (Throwable stateCaught_3) {
                        caughtException = stateCaught_3;
                        statePc = 14;
                        continue stateLoop;
                    }
                }
                case 4: {
                    try {
                        if (var6 == null) {
                            statePc = 12;
                        } else {
                            statePc = 5;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_4) {
                        caughtException = stateCaught_4;
                        statePc = 14;
                        continue stateLoop;
                    }
                }
                case 5: {
                    try {
                        if (var6.field_l != (long)param0) {
                            statePc = 11;
                        } else {
                            statePc = 6;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_5) {
                        caughtException = stateCaught_5;
                        statePc = 14;
                        continue stateLoop;
                    }
                }
                case 6: {
                    try {
                        if (param1 != var6.field_B) {
                            statePc = 11;
                        } else {
                            statePc = 7;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_6) {
                        caughtException = stateCaught_6;
                        statePc = 14;
                        continue stateLoop;
                    }
                }
                case 7: {
                    try {
                        if (-3 == (var6.field_y ^ -1)) {
                            statePc = 9;
                        } else {
                            statePc = 8;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_7) {
                        caughtException = stateCaught_7;
                        statePc = 14;
                        continue stateLoop;
                    }
                }
                case 8: {
                    try {
                        statePc = 11;
                        continue stateLoop;
                    } catch (Throwable stateCaught_8) {
                        caughtException = stateCaught_8;
                        statePc = 14;
                        continue stateLoop;
                    }
                }
                case 9: {
                    try {
                        var4.field_t = false;
                        var4.field_D = var6.field_D;
                        // monitorexit var5
                        stackOut_9_0 = (li) var4;
                        stackIn_10_0 = stackOut_9_0;
                        statePc = 10;
                        continue stateLoop;
                    } catch (Throwable stateCaught_9) {
                        caughtException = stateCaught_9;
                        statePc = 14;
                        continue stateLoop;
                    }
                }
                case 10: {
                    return stackIn_10_0;
                }
                case 11: {
                    try {
                        var6 = (li) (Object) ((ai) this).field_e.b((byte) 118);
                        statePc = 4;
                        continue stateLoop;
                    } catch (Throwable stateCaught_11) {
                        caughtException = stateCaught_11;
                        statePc = 14;
                        continue stateLoop;
                    }
                }
                case 12: {
                    try {
                        // monitorexit var5
                        statePc = 16;
                        continue stateLoop;
                    } catch (Throwable stateCaught_12) {
                        caughtException = stateCaught_12;
                        statePc = 14;
                        continue stateLoop;
                    }
                }
                case 14: {
                    try {
                        var7 = caughtException;
                        // monitorexit var5
                        statePc = 15;
                        continue stateLoop;
                    } catch (Throwable stateCaught_14) {
                        caughtException = stateCaught_14;
                        statePc = 14;
                        continue stateLoop;
                    }
                }
                case 15: {
                    throw (RuntimeException) (Object) var7;
                }
                case 16: {
                    var4.field_D = param1.a(1, param0);
                    var4.field_t = false;
                    var4.field_r = true;
                    return var4;
                }
                default: throw new IllegalStateException("invalid CFG state " + statePc);
            }
        }
    }

    final static Object a(int param0, boolean param1, byte[] param2) {
        bk var3 = null;
        if (param2 != null) {
          if (param0 <= (param2.length ^ -1)) {
            if (!param1) {
              return (Object) (Object) param2;
            } else {
              return (Object) (Object) re.a(255, param2);
            }
          } else {
            var3 = new bk();
            ((t) (Object) var3).a(param2, (byte) -72);
            return (Object) (Object) var3;
          }
        } else {
          return null;
        }
    }

    private final void a(boolean param0, li param1) {
        Object var3 = null;
        Throwable var4 = null;
        int statePc = 0;
        Throwable caughtException = null;
        stateLoop: while (true) {
            switch (statePc) {
                case 0: {
                    var3 = (Object) (Object) ((ai) this).field_e;
                    // monitorenter ((ai) this).field_e
                    statePc = 1;
                    continue stateLoop;
                }
                case 1: {
                    try {
                        ((ai) this).field_e.a(29664, (qa) (Object) param1);
                        if (!param0) {
                            statePc = 3;
                        } else {
                            statePc = 2;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_1) {
                        caughtException = stateCaught_1;
                        statePc = 5;
                        continue stateLoop;
                    }
                }
                case 2: {
                    try {
                        ((ai) this).field_i = null;
                        statePc = 3;
                        continue stateLoop;
                    } catch (Throwable stateCaught_2) {
                        caughtException = stateCaught_2;
                        statePc = 5;
                        continue stateLoop;
                    }
                }
                case 3: {
                    try {
                        ((ai) this).field_h = ((ai) this).field_h + 1;
                        ((Object) (Object) ((ai) this).field_e).notifyAll();
                        // monitorexit var3
                        statePc = 7;
                        continue stateLoop;
                    } catch (Throwable stateCaught_3) {
                        caughtException = stateCaught_3;
                        statePc = 5;
                        continue stateLoop;
                    }
                }
                case 5: {
                    try {
                        var4 = caughtException;
                        // monitorexit var3
                        statePc = 6;
                        continue stateLoop;
                    } catch (Throwable stateCaught_5) {
                        caughtException = stateCaught_5;
                        statePc = 5;
                        continue stateLoop;
                    }
                }
                case 6: {
                    throw (RuntimeException) (Object) var4;
                }
                case 7: {
                    return;
                }
                default: throw new IllegalStateException("invalid CFG state " + statePc);
            }
        }
    }

    final void a(byte param0) {
        ((ai) this).field_f = true;
        Object var2 = (Object) (Object) ((ai) this).field_e;
        // monitorenter ((ai) this).field_e
        ((Object) (Object) ((ai) this).field_e).notifyAll();
        if (param0 != 77) {
            Object var4 = null;
            ai.a((String) null, (byte) 75);
        }
        // monitorexit var2
        try {
            if (false) throw (InterruptedException) null;
            ((ai) this).field_i.join();
        } catch (InterruptedException interruptedException) {
        }
        ((ai) this).field_i = null;
    }

    final static boolean a(boolean param0, int param1, int param2) {
        if (-14 != (sj.field_p ^ -1)) {
          if (sj.field_p == 102) {
            mj.field_Ib.c((byte) 113);
            return true;
          } else {
            if (!param0) {
              if (null != mj.field_Ib) {
                if (!mj.field_Ib.a(96, param2, param1)) {
                  return false;
                } else {
                  return true;
                }
              } else {
                return false;
              }
            } else {
              int discarded$6 = ai.a(true, (byte) 112);
              if (null != mj.field_Ib) {
                if (!mj.field_Ib.a(96, param2, param1)) {
                  return false;
                } else {
                  return true;
                }
              } else {
                return false;
              }
            }
          }
        } else {
          ub.n(33423425);
          return true;
        }
    }

    ai(go param0) {
        ((ai) this).field_e = new lq();
        ((ai) this).field_f = false;
        ((ai) this).field_h = 0;
        di var2 = param0.a(121, (Runnable) this, 5);
        while (var2.field_f == 0) {
            vd.a(false, 10L);
        }
        if ((var2.field_f ^ -1) == -3) {
            throw new RuntimeException();
        }
        ((ai) this).field_i = (Thread) var2.field_d;
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_b = -1;
        field_d = "The game options are not all set.";
    }
}
