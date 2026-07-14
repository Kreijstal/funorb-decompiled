/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class ck {
    static String field_b;
    static String field_c;
    static int field_a;

    final static void a(int param0, int param1) {
        int[] var2 = null;
        RuntimeException var2_ref = null;
        int var3 = 0;
        int var4 = 0;
        int statePc = 0;
        Throwable caughtException = null;
        stateLoop: while (true) {
            switch (statePc) {
                case 0: {
                    var4 = ZombieDawnMulti.field_E ? 1 : 0;
                    statePc = 1;
                    continue stateLoop;
                }
                case 1: {
                    try {
                        if (param1 == -23838) {
                            statePc = 5;
                        } else {
                            statePc = 2;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_1) {
                        caughtException = stateCaught_1;
                        statePc = 13;
                        continue stateLoop;
                    }
                }
                case 2: {
                    try {
                        field_c = null;
                        statePc = 3;
                        continue stateLoop;
                    } catch (Throwable stateCaught_2) {
                        caughtException = stateCaught_2;
                        statePc = 13;
                        continue stateLoop;
                    }
                }
                case 3: {
                    try {
                        statePc = 5;
                        continue stateLoop;
                    } catch (Throwable stateCaught_3) {
                        caughtException = stateCaught_3;
                        statePc = 13;
                        continue stateLoop;
                    }
                }
                case 5: {
                    try {
                        var2 = new int[rb.field_c.length + 1];
                        var3 = 0;
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
                        if (rb.field_c.length <= var3) {
                            statePc = 11;
                        } else {
                            statePc = 7;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_6) {
                        caughtException = stateCaught_6;
                        statePc = 13;
                        continue stateLoop;
                    }
                }
                case 7: {
                    try {
                        var2[var3] = rb.field_c[var3];
                        var3++;
                        if (var4 != 0) {
                            statePc = 14;
                        } else {
                            statePc = 8;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_7) {
                        caughtException = stateCaught_7;
                        statePc = 10;
                        continue stateLoop;
                    }
                }
                case 8: {
                    try {
                        if (var4 == 0) {
                            statePc = 6;
                        } else {
                            statePc = 9;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_8) {
                        caughtException = stateCaught_8;
                        statePc = 10;
                        continue stateLoop;
                    }
                }
                case 9: {
                    try {
                        statePc = 11;
                        continue stateLoop;
                    } catch (Throwable stateCaught_9) {
                        caughtException = stateCaught_9;
                        statePc = 13;
                        continue stateLoop;
                    }
                }
                case 10: {
                    try {
                        throw (RuntimeException) (Object) caughtException;
                    } catch (Throwable stateCaught_10) {
                        caughtException = stateCaught_10;
                        statePc = 13;
                        continue stateLoop;
                    }
                }
                case 11: {
                    try {
                        var2[var2.length - 1] = param0;
                        rb.field_c = var2;
                        statePc = 14;
                        continue stateLoop;
                    } catch (Throwable stateCaught_11) {
                        caughtException = stateCaught_11;
                        statePc = 13;
                        continue stateLoop;
                    }
                }
                case 13: {
                    var2_ref = (RuntimeException) (Object) caughtException;
                    throw fa.a((Throwable) (Object) var2_ref, "ck.D(" + param0 + 44 + param1 + 41);
                }
                case 14: {
                    return;
                }
                default: throw new IllegalStateException("invalid CFG state " + statePc);
            }
        }
    }

    final static void a(int param0) {
        ga var1 = null;
        int var2 = 0;
        dm var3_ref_dm = null;
        int var3 = 0;
        long var3_long = 0L;
        jh var3_ref_jh = null;
        jh var4 = null;
        jh var4_ref = null;
        int var4_int = 0;
        String var5 = null;
        int var5_int = 0;
        jh var5_ref = null;
        String var6 = null;
        String var7 = null;
        dm var8_ref = null;
        int var8 = 0;
        int var9 = 0;
        int var10 = 0;
        int var11 = 0;
        int stackIn_16_0 = 0;
        dm stackIn_22_0 = null;
        dm stackIn_23_0 = null;
        dm stackIn_24_0 = null;
        int stackIn_24_1 = 0;
        String stackIn_118_0 = null;
        String stackIn_119_0 = null;
        String stackIn_120_0 = null;
        int stackIn_120_1 = 0;
        boolean stackIn_168_0 = false;
        boolean stackIn_169_0 = false;
        int stackIn_179_0 = 0;
        int stackOut_15_0 = 0;
        int stackOut_14_0 = 0;
        dm stackOut_21_0 = null;
        dm stackOut_23_0 = null;
        int stackOut_23_1 = 0;
        dm stackOut_22_0 = null;
        int stackOut_22_1 = 0;
        String stackOut_117_0 = null;
        String stackOut_119_0 = null;
        int stackOut_119_1 = 0;
        String stackOut_118_0 = null;
        int stackOut_118_1 = 0;
        boolean stackOut_167_0 = false;
        boolean stackOut_168_0 = false;
        int stackOut_178_0 = 0;
        L0: {
          var11 = ZombieDawnMulti.field_E ? 1 : 0;
          var1 = s.field_e;
          var2 = ((k) (Object) var1).g(31365);
          if (param0 == -2061) {
            break L0;
          } else {
            field_c = null;
            break L0;
          }
        }
        L1: {
          L2: {
            L3: {
              if (var2 == 0) {
                break L3;
              } else {
                if ((var2 ^ -1) == -2) {
                  break L3;
                } else {
                  if (-3 == (var2 ^ -1)) {
                    break L3;
                  } else {
                    if (3 == var2) {
                      break L3;
                    } else {
                      if (4 == var2) {
                        break L3;
                      } else {
                        L4: {
                          if ((var2 ^ -1) != -6) {
                            break L4;
                          } else {
                            L5: {
                              var3_long = ((k) (Object) var1).a((byte) -30);
                              var5 = ((k) (Object) var1).f((byte) -76);
                              var6 = ((k) (Object) var1).f((byte) -50);
                              var7 = ((k) (Object) var1).f((byte) -61);
                              var8_ref = en.a((byte) 50, var3_long);
                              if (var6.equals((Object) (Object) "")) {
                                stackOut_15_0 = 0;
                                stackIn_16_0 = stackOut_15_0;
                                break L5;
                              } else {
                                stackOut_14_0 = 1;
                                stackIn_16_0 = stackOut_14_0;
                                break L5;
                              }
                            }
                            L6: {
                              L7: {
                                var9 = stackIn_16_0;
                                if (null != var8_ref) {
                                  break L7;
                                } else {
                                  var8_ref = new dm(var5, var7, var3_long);
                                  hq.field_c.a(param0 + 2060, (qa) (Object) var8_ref, var3_long);
                                  if (var11 == 0) {
                                    break L6;
                                  } else {
                                    break L7;
                                  }
                                }
                              }
                              if (var9 == 0) {
                                break L6;
                              } else {
                                var8_ref.a(var5, var7, 43);
                                break L6;
                              }
                            }
                            L8: {
                              var8_ref.field_Kb = bl.a((byte) 98) - (long)((k) (Object) var1).i(-1478490344);
                              var8_ref.field_Mb = ((k) (Object) var1).d((byte) 69);
                              var10 = ((k) (Object) var1).a(param0 ^ -2061);
                              stackOut_21_0 = (dm) var8_ref;
                              stackIn_23_0 = stackOut_21_0;
                              stackIn_22_0 = stackOut_21_0;
                              if ((1 & var10) == 0) {
                                stackOut_23_0 = (dm) (Object) stackIn_23_0;
                                stackOut_23_1 = 0;
                                stackIn_24_0 = stackOut_23_0;
                                stackIn_24_1 = stackOut_23_1;
                                break L8;
                              } else {
                                stackOut_22_0 = (dm) (Object) stackIn_22_0;
                                stackOut_22_1 = 1;
                                stackIn_24_0 = stackOut_22_0;
                                stackIn_24_1 = stackOut_22_1;
                                break L8;
                              }
                            }
                            stackIn_24_0.field_Nb = stackIn_24_1 != 0;
                            var8_ref.field_Sb = var10 >> -178928735;
                            var8_ref.field_Yb = ((k) (Object) var1).g(31365);
                            var8_ref.field_Vb = ((k) (Object) var1).g(param0 + 33426);
                            lf.a(var8_ref, true);
                            if (var11 == 0) {
                              break L2;
                            } else {
                              break L4;
                            }
                          }
                        }
                        L9: {
                          if (6 != var2) {
                            break L9;
                          } else {
                            L10: {
                              var3_long = ((k) (Object) var1).a((byte) -30);
                              var5_int = ((k) (Object) var1).g(31365);
                              var6 = (String) (Object) en.a((byte) 50, var3_long);
                              if (var6 != null) {
                                L11: {
                                  if (!((dm) (Object) var6).field_Ob) {
                                    break L11;
                                  } else {
                                    cb.field_i = cb.field_i - 1;
                                    ((dm) (Object) var6).field_Ob = false;
                                    break L11;
                                  }
                                }
                                L12: {
                                  L13: {
                                    if (0 != var5_int) {
                                      break L13;
                                    } else {
                                      ((dm) (Object) var6).a(true);
                                      if (var11 == 0) {
                                        break L12;
                                      } else {
                                        break L13;
                                      }
                                    }
                                  }
                                  ((dm) (Object) var6).field_bc = so.field_r;
                                  ((dm) (Object) var6).field_Fb = var5_int;
                                  break L12;
                                }
                                ((dm) (Object) var6).a(-4564);
                                break L10;
                              } else {
                                break L10;
                              }
                            }
                            if (var11 == 0) {
                              break L2;
                            } else {
                              break L9;
                            }
                          }
                        }
                        L14: {
                          if (7 == var2) {
                            break L14;
                          } else {
                            L15: {
                              if ((var2 ^ -1) == -9) {
                                break L15;
                              } else {
                                L16: {
                                  if (-10 == (var2 ^ -1)) {
                                    break L16;
                                  } else {
                                    L17: {
                                      if ((var2 ^ -1) == -11) {
                                        break L17;
                                      } else {
                                        L18: {
                                          L19: {
                                            if (-12 == (var2 ^ -1)) {
                                              break L19;
                                            } else {
                                              if (var2 != 12) {
                                                break L18;
                                              } else {
                                                break L19;
                                              }
                                            }
                                          }
                                          L20: {
                                            var3 = ((k) (Object) var1).d((byte) 69);
                                            var4 = (jh) (Object) af.field_h.a((long)var3, -22877);
                                            if (var4 != null) {
                                              L21: {
                                                L22: {
                                                  if (-12 == (var2 ^ -1)) {
                                                    break L22;
                                                  } else {
                                                    var4.field_rc = true;
                                                    if (var11 == 0) {
                                                      break L21;
                                                    } else {
                                                      break L22;
                                                    }
                                                  }
                                                }
                                                var4.field_lc = true;
                                                break L21;
                                              }
                                              mi.a(var4, -126);
                                              break L20;
                                            } else {
                                              break L20;
                                            }
                                          }
                                          if (var11 == 0) {
                                            break L2;
                                          } else {
                                            break L18;
                                          }
                                        }
                                        L23: {
                                          if (var2 == 13) {
                                            break L23;
                                          } else {
                                            L24: {
                                              if (-15 == (var2 ^ -1)) {
                                                break L24;
                                              } else {
                                                if (var2 == 16) {
                                                  break L24;
                                                } else {
                                                  L25: {
                                                    L26: {
                                                      if ((var2 ^ -1) == -16) {
                                                        break L26;
                                                      } else {
                                                        if ((var2 ^ -1) != -18) {
                                                          break L25;
                                                        } else {
                                                          break L26;
                                                        }
                                                      }
                                                    }
                                                    L27: {
                                                      var3_long = ((k) (Object) var1).a((byte) -30);
                                                      var5_int = ((k) (Object) var1).g(param0 + 33426);
                                                      var6 = (String) (Object) en.a((byte) 50, var3_long);
                                                      if (var6 != null) {
                                                        L28: {
                                                          L29: {
                                                            if (var2 != 15) {
                                                              break L29;
                                                            } else {
                                                              ((dm) (Object) var6).field_Pb = false;
                                                              if (var11 == 0) {
                                                                break L28;
                                                              } else {
                                                                break L29;
                                                              }
                                                            }
                                                          }
                                                          if (((dm) (Object) var6).field_Ob) {
                                                            ((dm) (Object) var6).field_Ob = false;
                                                            cb.field_i = cb.field_i - 1;
                                                            break L28;
                                                          } else {
                                                            break L28;
                                                          }
                                                        }
                                                        L30: {
                                                          if (var5_int != 0) {
                                                            ((dm) (Object) var6).field_bc = so.field_r;
                                                            ((dm) (Object) var6).field_Fb = var5_int;
                                                            break L30;
                                                          } else {
                                                            break L30;
                                                          }
                                                        }
                                                        lf.a((dm) (Object) var6, true);
                                                        break L27;
                                                      } else {
                                                        break L27;
                                                      }
                                                    }
                                                    if (var11 == 0) {
                                                      break L2;
                                                    } else {
                                                      break L25;
                                                    }
                                                  }
                                                  L31: {
                                                    if (var2 == 18) {
                                                      break L31;
                                                    } else {
                                                      L32: {
                                                        if (-20 != (var2 ^ -1)) {
                                                          break L32;
                                                        } else {
                                                          L33: {
                                                            var3_long = ((k) (Object) var1).a((byte) -30);
                                                            var5_int = ((k) (Object) var1).g(31365);
                                                            var6 = (String) (Object) vm.a(var3_long, (byte) -54);
                                                            if (var6 == null) {
                                                              break L33;
                                                            } else {
                                                              L34: {
                                                                L35: {
                                                                  if (-1 == (var5_int ^ -1)) {
                                                                    break L35;
                                                                  } else {
                                                                    ((dm) (Object) var6).field_Fb = var5_int;
                                                                    ((dm) (Object) var6).field_bc = so.field_r;
                                                                    if (var11 == 0) {
                                                                      break L34;
                                                                    } else {
                                                                      break L35;
                                                                    }
                                                                  }
                                                                }
                                                                ((dm) (Object) var6).a(true);
                                                                break L34;
                                                              }
                                                              ((dm) (Object) var6).a(param0 ^ 6623);
                                                              mh.field_c.field_cc = mh.field_c.field_cc - 1;
                                                              break L33;
                                                            }
                                                          }
                                                          if (var11 == 0) {
                                                            break L2;
                                                          } else {
                                                            break L32;
                                                          }
                                                        }
                                                      }
                                                      L36: {
                                                        if (-21 == (var2 ^ -1)) {
                                                          break L36;
                                                        } else {
                                                          L37: {
                                                            if (-22 == (var2 ^ -1)) {
                                                              break L37;
                                                            } else {
                                                              L38: {
                                                                if (22 != var2) {
                                                                  break L38;
                                                                } else {
                                                                  bc.field_e = ((k) (Object) var1).d((byte) 69);
                                                                  dm.field_Zb = ((k) (Object) var1).a(param0 + 2061);
                                                                  if (var11 == 0) {
                                                                    break L2;
                                                                  } else {
                                                                    break L38;
                                                                  }
                                                                }
                                                              }
                                                              L39: {
                                                                if (var2 != 23) {
                                                                  break L39;
                                                                } else {
                                                                  ie.field_sb = ((k) (Object) var1).a((byte) -30);
                                                                  if (var11 == 0) {
                                                                    break L2;
                                                                  } else {
                                                                    break L39;
                                                                  }
                                                                }
                                                              }
                                                              bd.a("L1: " + ci.a(0), (Throwable) null, false);
                                                              ak.a((byte) -125);
                                                              if (var11 == 0) {
                                                                break L2;
                                                              } else {
                                                                break L37;
                                                              }
                                                            }
                                                          }
                                                          L40: {
                                                            L41: {
                                                              var3 = ((k) (Object) var1).d((byte) 69);
                                                              if (-1 != (var3 ^ -1)) {
                                                                break L41;
                                                              } else {
                                                                qi.field_c = 0L;
                                                                if (var11 == 0) {
                                                                  break L40;
                                                                } else {
                                                                  break L41;
                                                                }
                                                              }
                                                            }
                                                            qi.field_c = bl.a((byte) 97) - -(long)var3;
                                                            break L40;
                                                          }
                                                          if (var11 == 0) {
                                                            break L2;
                                                          } else {
                                                            break L36;
                                                          }
                                                        }
                                                      }
                                                      dl.a(mh.field_c, false, (k) (Object) var1, false);
                                                      if (var11 == 0) {
                                                        break L2;
                                                      } else {
                                                        break L31;
                                                      }
                                                    }
                                                  }
                                                  L42: {
                                                    var3_long = ((k) (Object) var1).a((byte) -30);
                                                    var5 = ((k) (Object) var1).f((byte) -27);
                                                    var6 = ((k) (Object) var1).f((byte) -125);
                                                    var7 = (String) (Object) vm.a(var3_long, (byte) -99);
                                                    if (null == var7) {
                                                      var7 = (String) (Object) new dm(var5, var6, var3_long);
                                                      kp.field_o.a(-1, (qa) (Object) var7, var3_long);
                                                      mh.field_c.field_cc = mh.field_c.field_cc + 1;
                                                      break L42;
                                                    } else {
                                                      break L42;
                                                    }
                                                  }
                                                  L43: {
                                                    ((dm) (Object) var7).field_Mb = ((k) (Object) var1).d((byte) 69);
                                                    var8 = ((k) (Object) var1).a(0);
                                                    ((dm) (Object) var7).field_Sb = var8 >> 573625729;
                                                    stackOut_117_0 = (String) var7;
                                                    stackIn_119_0 = stackOut_117_0;
                                                    stackIn_118_0 = stackOut_117_0;
                                                    if (-1 == (1 & var8 ^ -1)) {
                                                      stackOut_119_0 = (String) (Object) stackIn_119_0;
                                                      stackOut_119_1 = 0;
                                                      stackIn_120_0 = stackOut_119_0;
                                                      stackIn_120_1 = stackOut_119_1;
                                                      break L43;
                                                    } else {
                                                      stackOut_118_0 = (String) (Object) stackIn_118_0;
                                                      stackOut_118_1 = 1;
                                                      stackIn_120_0 = stackOut_118_0;
                                                      stackIn_120_1 = stackOut_118_1;
                                                      break L43;
                                                    }
                                                  }
                                                  ((dm) (Object) stackIn_120_0).field_Nb = stackIn_120_1 != 0;
                                                  ((dm) (Object) var7).field_Yb = ((k) (Object) var1).g(31365);
                                                  ((dm) (Object) var7).field_Vb = ((k) (Object) var1).g(31365);
                                                  nh.field_g.a((br) (Object) var7, false);
                                                  if (var11 == 0) {
                                                    break L2;
                                                  } else {
                                                    break L24;
                                                  }
                                                }
                                              }
                                            }
                                            L44: {
                                              var3_long = ((k) (Object) var1).a((byte) -30);
                                              var5 = (String) (Object) en.a((byte) 50, var3_long);
                                              if (var5 != null) {
                                                L45: {
                                                  L46: {
                                                    if (14 == var2) {
                                                      break L46;
                                                    } else {
                                                      if (((dm) (Object) var5).field_Ob) {
                                                        break L45;
                                                      } else {
                                                        cb.field_i = cb.field_i + 1;
                                                        ((dm) (Object) var5).field_Ob = true;
                                                        if (var11 == 0) {
                                                          break L45;
                                                        } else {
                                                          break L46;
                                                        }
                                                      }
                                                    }
                                                  }
                                                  ((dm) (Object) var5).field_Pb = true;
                                                  break L45;
                                                }
                                                lf.a((dm) (Object) var5, true);
                                                break L44;
                                              } else {
                                                break L44;
                                              }
                                            }
                                            if (var11 == 0) {
                                              break L2;
                                            } else {
                                              break L23;
                                            }
                                          }
                                        }
                                        L47: {
                                          var3 = ((k) (Object) var1).d((byte) 69);
                                          var4_int = ((k) (Object) var1).g(param0 + 33426);
                                          var5_ref = (jh) (Object) af.field_h.a((long)var3, -22877);
                                          if (null == var5_ref) {
                                            break L47;
                                          } else {
                                            L48: {
                                              var6 = (String) (Object) var5_ref;
                                              var5_ref.field_rc = false;
                                              if ((var4_int ^ -1) == -1) {
                                                break L48;
                                              } else {
                                                var5_ref.field_Jb = so.field_r;
                                                var5_ref.field_Vb = var4_int;
                                                break L48;
                                              }
                                            }
                                            ((jh) (Object) var6).field_lc = false;
                                            mi.a(var5_ref, -57);
                                            break L47;
                                          }
                                        }
                                        if (var11 == 0) {
                                          break L2;
                                        } else {
                                          break L17;
                                        }
                                      }
                                    }
                                    var3_ref_jh = (jh) (Object) tn.field_C.c(param0 + 2175);
                                    L49: while (true) {
                                      L50: {
                                        if (null == var3_ref_jh) {
                                          break L50;
                                        } else {
                                          var3_ref_jh.a(true);
                                          var3_ref_jh.a(param0 ^ 6623);
                                          var3_ref_jh = (jh) (Object) tn.field_C.b(param0 + 2067);
                                          if (var11 != 0) {
                                            break L2;
                                          } else {
                                            if (var11 == 0) {
                                              continue L49;
                                            } else {
                                              break L50;
                                            }
                                          }
                                        }
                                      }
                                      if (var11 == 0) {
                                        break L2;
                                      } else {
                                        break L16;
                                      }
                                    }
                                  }
                                }
                                L51: {
                                  var3 = ((k) (Object) var1).d((byte) 69);
                                  var4_int = ((k) (Object) var1).g(31365);
                                  var5_ref = (jh) (Object) af.field_h.a((long)var3, -22877);
                                  if (null != var5_ref) {
                                    L52: {
                                      L53: {
                                        if (-1 == (var4_int ^ -1)) {
                                          break L53;
                                        } else {
                                          var5_ref.field_Jb = so.field_r;
                                          var5_ref.field_Vb = var4_int;
                                          if (var11 == 0) {
                                            break L52;
                                          } else {
                                            break L53;
                                          }
                                        }
                                      }
                                      var5_ref.a(true);
                                      break L52;
                                    }
                                    var5_ref.a(-4564);
                                    break L51;
                                  } else {
                                    break L51;
                                  }
                                }
                                if (var11 == 0) {
                                  break L2;
                                } else {
                                  break L15;
                                }
                              }
                            }
                            L54: {
                              var3 = ((k) (Object) var1).d((byte) 69);
                              var4 = (jh) (Object) af.field_h.a((long)var3, -22877);
                              if (null != var4) {
                                break L54;
                              } else {
                                var4_ref = new jh(kj.field_h);
                                af.field_h.a(-1, (qa) (Object) var4_ref, (long)var3);
                                break L54;
                              }
                            }
                            dl.a(var4_ref, true, (k) (Object) var1, false);
                            mi.a(var4_ref, param0 ^ 2144);
                            if (var11 == 0) {
                              break L2;
                            } else {
                              break L14;
                            }
                          }
                        }
                        var3_ref_dm = (dm) (Object) cg.field_i.c(66);
                        L55: while (true) {
                          L56: {
                            L57: {
                              if (var3_ref_dm == null) {
                                break L57;
                              } else {
                                var3_ref_dm.a(true);
                                var3_ref_dm.a(-4564);
                                var3_ref_dm = (dm) (Object) cg.field_i.b(param0 + 2067);
                                if (var11 != 0) {
                                  break L56;
                                } else {
                                  if (var11 == 0) {
                                    continue L55;
                                  } else {
                                    break L57;
                                  }
                                }
                              }
                            }
                            cb.field_i = 0;
                            break L56;
                          }
                          if (var11 == 0) {
                            break L2;
                          } else {
                            break L3;
                          }
                        }
                      }
                    }
                  }
                }
              }
            }
            var3_ref_dm = (dm) (Object) nh.field_g.c(113);
            L58: while (true) {
              L59: {
                L60: {
                  if (var3_ref_dm == null) {
                    break L60;
                  } else {
                    var3_ref_dm.a(true);
                    var3_ref_dm.a(-4564);
                    var3_ref_dm = (dm) (Object) nh.field_g.b(6);
                    if (var11 != 0) {
                      break L59;
                    } else {
                      if (var11 == 0) {
                        continue L58;
                      } else {
                        break L60;
                      }
                    }
                  }
                }
                var3_ref_dm = (dm) (Object) hq.field_c.a((byte) 7);
                break L59;
              }
              L61: while (true) {
                L62: {
                  L63: {
                    if (null == var3_ref_dm) {
                      break L63;
                    } else {
                      stackOut_167_0 = var3_ref_dm.field_Pb;
                      stackIn_179_0 = stackOut_167_0 ? 1 : 0;
                      stackIn_168_0 = stackOut_167_0;
                      if (var11 != 0) {
                        break L62;
                      } else {
                        stackOut_168_0 = stackIn_168_0;
                        stackIn_169_0 = stackOut_168_0;
                        L64: {
                          L65: {
                            if (stackIn_169_0) {
                              break L65;
                            } else {
                              if (var3_ref_dm.field_Ob) {
                                break L65;
                              } else {
                                break L64;
                              }
                            }
                          }
                          L66: {
                            if (!var3_ref_dm.field_Ob) {
                              break L66;
                            } else {
                              cb.field_i = cb.field_i - 1;
                              var3_ref_dm.field_Ob = false;
                              break L66;
                            }
                          }
                          var3_ref_dm.field_Pb = false;
                          lf.a(var3_ref_dm, true);
                          break L64;
                        }
                        var3_ref_dm = (dm) (Object) hq.field_c.c((byte) 123);
                        if (var11 == 0) {
                          continue L61;
                        } else {
                          break L63;
                        }
                      }
                    }
                  }
                  stackOut_178_0 = -2;
                  stackIn_179_0 = stackOut_178_0;
                  break L62;
                }
                L67: {
                  if (stackIn_179_0 != (var2 ^ -1)) {
                    break L67;
                  } else {
                    if (null == mh.field_c) {
                      break L67;
                    } else {
                      sb.field_k = mh.field_c.field_Nb;
                      break L67;
                    }
                  }
                }
                L68: {
                  L69: {
                    if (var2 == 4) {
                      break L69;
                    } else {
                      mh.field_c = null;
                      if (var11 == 0) {
                        break L68;
                      } else {
                        break L69;
                      }
                    }
                  }
                  var3 = ((k) (Object) var1).d((byte) 69);
                  mh.field_c = new jh(kj.field_h);
                  mh.field_c.a((byte) -85, (long)var3);
                  dl.a(mh.field_c, false, (k) (Object) var1, false);
                  qi.field_c = 0L;
                  break L68;
                }
                L70: {
                  L71: {
                    L72: {
                      if (-3 == (var2 ^ -1)) {
                        break L72;
                      } else {
                        if (-4 != (var2 ^ -1)) {
                          break L71;
                        } else {
                          break L72;
                        }
                      }
                    }
                    if (null != ej.field_n) {
                      break L70;
                    } else {
                      ej.field_n = new jh(kj.field_h);
                      if (var11 == 0) {
                        break L70;
                      } else {
                        break L71;
                      }
                    }
                  }
                  ej.field_n = null;
                  break L70;
                }
                L73: {
                  if (var2 == 3) {
                    break L73;
                  } else {
                    la.field_k = false;
                    if (var11 == 0) {
                      break L2;
                    } else {
                      break L73;
                    }
                  }
                }
                la.field_k = true;
                var3 = 0;
                L74: while (true) {
                  L75: {
                    L76: {
                      if ((fg.field_k.length ^ -1) >= (var3 ^ -1)) {
                        break L76;
                      } else {
                        fg.field_k[var3] = ((k) (Object) var1).d(param0 + -249697519);
                        var3++;
                        if (var11 != 0) {
                          break L75;
                        } else {
                          if (var11 == 0) {
                            continue L74;
                          } else {
                            break L76;
                          }
                        }
                      }
                    }
                    pb.field_h = ((k) (Object) var1).g(31365);
                    sc.field_f = ((k) (Object) var1).g(31365);
                    break L75;
                  }
                  var3 = 0;
                  L77: while (true) {
                    if ((var3 ^ -1) <= (tg.field_a.length ^ -1)) {
                      break L2;
                    } else {
                      tg.field_a[var3] = ((k) (Object) var1).d(-249699580);
                      var3++;
                      if (var11 != 0) {
                        break L1;
                      } else {
                        if (var11 == 0) {
                          continue L77;
                        } else {
                          break L2;
                        }
                      }
                    }
                  }
                }
              }
            }
          }
          break L1;
        }
    }

    final static boolean a(char param0, int param1, CharSequence param2) {
        int var3_int = 0;
        RuntimeException var3 = null;
        int stackIn_8_0 = 0;
        int stackIn_11_0 = 0;
        int stackIn_14_0 = 0;
        int stackIn_22_0 = 0;
        int stackIn_24_0 = 0;
        RuntimeException stackIn_27_0 = null;
        StringBuilder stackIn_27_1 = null;
        RuntimeException stackIn_29_0 = null;
        StringBuilder stackIn_29_1 = null;
        RuntimeException stackIn_30_0 = null;
        StringBuilder stackIn_30_1 = null;
        String stackIn_30_2 = null;
        int stackOut_7_0 = 0;
        int stackOut_10_0 = 0;
        int stackOut_13_0 = 0;
        int stackOut_21_0 = 0;
        int stackOut_23_0 = 0;
        RuntimeException stackOut_26_0 = null;
        StringBuilder stackOut_26_1 = null;
        RuntimeException stackOut_27_0 = null;
        StringBuilder stackOut_27_1 = null;
        String stackOut_27_2 = null;
        RuntimeException stackOut_29_0 = null;
        StringBuilder stackOut_29_1 = null;
        String stackOut_29_2 = null;
        int statePc = 0;
        Throwable caughtException = null;
        stateLoop: while (true) {
            switch (statePc) {
                case 0: {
                    try {
                        if (param1 == -1) {
                            statePc = 4;
                        } else {
                            statePc = 1;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_0) {
                        caughtException = stateCaught_0;
                        statePc = 25;
                        continue stateLoop;
                    }
                }
                case 1: {
                    try {
                        field_b = null;
                        statePc = 2;
                        continue stateLoop;
                    } catch (Throwable stateCaught_1) {
                        caughtException = stateCaught_1;
                        statePc = 25;
                        continue stateLoop;
                    }
                }
                case 2: {
                    try {
                        statePc = 4;
                        continue stateLoop;
                    } catch (Throwable stateCaught_2) {
                        caughtException = stateCaught_2;
                        statePc = 25;
                        continue stateLoop;
                    }
                }
                case 4: {
                    try {
                        if (!lo.a(8192, param0)) {
                            statePc = 7;
                        } else {
                            statePc = 5;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_4) {
                        caughtException = stateCaught_4;
                        statePc = 6;
                        continue stateLoop;
                    }
                }
                case 5: {
                    try {
                        statePc = 9;
                        continue stateLoop;
                    } catch (Throwable stateCaught_5) {
                        caughtException = stateCaught_5;
                        statePc = 6;
                        continue stateLoop;
                    }
                }
                case 6: {
                    try {
                        throw (RuntimeException) (Object) caughtException;
                    } catch (Throwable stateCaught_6) {
                        caughtException = stateCaught_6;
                        statePc = 25;
                        continue stateLoop;
                    }
                }
                case 7: {
                    try {
                        stackOut_7_0 = 0;
                        stackIn_8_0 = stackOut_7_0;
                        statePc = 8;
                        continue stateLoop;
                    } catch (Throwable stateCaught_7) {
                        caughtException = stateCaught_7;
                        statePc = 25;
                        continue stateLoop;
                    }
                }
                case 8: {
                    return stackIn_8_0 != 0;
                }
                case 9: {
                    try {
                        if (param2 != null) {
                            statePc = 12;
                        } else {
                            statePc = 10;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_9) {
                        caughtException = stateCaught_9;
                        statePc = 25;
                        continue stateLoop;
                    }
                }
                case 10: {
                    try {
                        stackOut_10_0 = 0;
                        stackIn_11_0 = stackOut_10_0;
                        statePc = 11;
                        continue stateLoop;
                    } catch (Throwable stateCaught_10) {
                        caughtException = stateCaught_10;
                        statePc = 25;
                        continue stateLoop;
                    }
                }
                case 11: {
                    return stackIn_11_0 != 0;
                }
                case 12: {
                    try {
                        var3_int = param2.length();
                        if (-13 < (var3_int ^ -1)) {
                            statePc = 15;
                        } else {
                            statePc = 13;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_12) {
                        caughtException = stateCaught_12;
                        statePc = 25;
                        continue stateLoop;
                    }
                }
                case 13: {
                    try {
                        stackOut_13_0 = 0;
                        stackIn_14_0 = stackOut_13_0;
                        statePc = 14;
                        continue stateLoop;
                    } catch (Throwable stateCaught_13) {
                        caughtException = stateCaught_13;
                        statePc = 25;
                        continue stateLoop;
                    }
                }
                case 14: {
                    return stackIn_14_0 != 0;
                }
                case 15: {
                    try {
                        if (eb.a((byte) 64, param0)) {
                            statePc = 18;
                        } else {
                            statePc = 16;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_15) {
                        caughtException = stateCaught_15;
                        statePc = 25;
                        continue stateLoop;
                    }
                }
                case 16: {
                    try {
                        statePc = 23;
                        continue stateLoop;
                    } catch (Throwable stateCaught_16) {
                        caughtException = stateCaught_16;
                        statePc = 25;
                        continue stateLoop;
                    }
                }
                case 18: {
                    try {
                        if (-1 == (var3_int ^ -1)) {
                            statePc = 21;
                        } else {
                            statePc = 19;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_18) {
                        caughtException = stateCaught_18;
                        statePc = 20;
                        continue stateLoop;
                    }
                }
                case 19: {
                    try {
                        statePc = 23;
                        continue stateLoop;
                    } catch (Throwable stateCaught_19) {
                        caughtException = stateCaught_19;
                        statePc = 20;
                        continue stateLoop;
                    }
                }
                case 20: {
                    try {
                        throw (RuntimeException) (Object) caughtException;
                    } catch (Throwable stateCaught_20) {
                        caughtException = stateCaught_20;
                        statePc = 25;
                        continue stateLoop;
                    }
                }
                case 21: {
                    try {
                        stackOut_21_0 = 0;
                        stackIn_22_0 = stackOut_21_0;
                        statePc = 22;
                        continue stateLoop;
                    } catch (Throwable stateCaught_21) {
                        caughtException = stateCaught_21;
                        statePc = 25;
                        continue stateLoop;
                    }
                }
                case 22: {
                    return stackIn_22_0 != 0;
                }
                case 23: {
                    try {
                        stackOut_23_0 = 1;
                        stackIn_24_0 = stackOut_23_0;
                        statePc = 24;
                        continue stateLoop;
                    } catch (Throwable stateCaught_23) {
                        caughtException = stateCaught_23;
                        statePc = 25;
                        continue stateLoop;
                    }
                }
                case 24: {
                    return stackIn_24_0 != 0;
                }
                case 25: {
                    var3 = (RuntimeException) (Object) caughtException;
                    statePc = 26;
                    continue stateLoop;
                }
                case 26: {
                    try {
                        stackOut_26_0 = (RuntimeException) var3;
                        stackOut_26_1 = new StringBuilder().append("ck.A(").append(param0).append(44).append(param1).append(44);
                        stackIn_29_0 = stackOut_26_0;
                        stackIn_29_1 = stackOut_26_1;
                        stackIn_27_0 = stackOut_26_0;
                        stackIn_27_1 = stackOut_26_1;
                        if (param2 == null) {
                            statePc = 29;
                        } else {
                            statePc = 27;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_26) {
                        caughtException = stateCaught_26;
                        statePc = 28;
                        continue stateLoop;
                    }
                }
                case 27: {
                    try {
                        stackOut_27_0 = (RuntimeException) (Object) stackIn_27_0;
                        stackOut_27_1 = (StringBuilder) (Object) stackIn_27_1;
                        stackOut_27_2 = "{...}";
                        stackIn_30_0 = stackOut_27_0;
                        stackIn_30_1 = stackOut_27_1;
                        stackIn_30_2 = stackOut_27_2;
                        statePc = 30;
                        continue stateLoop;
                    } catch (Throwable stateCaught_27) {
                        caughtException = stateCaught_27;
                        statePc = 28;
                        continue stateLoop;
                    }
                }
                case 28: {
                    throw (RuntimeException) (Object) caughtException;
                }
                case 29: {
                    stackOut_29_0 = (RuntimeException) (Object) stackIn_29_0;
                    stackOut_29_1 = (StringBuilder) (Object) stackIn_29_1;
                    stackOut_29_2 = "null";
                    stackIn_30_0 = stackOut_29_0;
                    stackIn_30_1 = stackOut_29_1;
                    stackIn_30_2 = stackOut_29_2;
                    statePc = 30;
                    continue stateLoop;
                }
                case 30: {
                    throw fa.a((Throwable) (Object) stackIn_30_0, stackIn_30_2 + 41);
                }
                default: throw new IllegalStateException("invalid CFG state " + statePc);
            }
        }
    }

    public static void b(int param0) {
        try {
            field_c = null;
            int var1_int = -20 % ((param0 - 40) / 63);
            field_b = null;
        } catch (RuntimeException runtimeException) {
            throw fa.a((Throwable) (Object) runtimeException, "ck.B(" + param0 + 41);
        }
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_c = "OVER <%0>";
        field_b = "Players";
        field_a = 0;
    }
}
