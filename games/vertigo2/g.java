/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class g {
    static ve field_f;
    int field_d;
    int field_c;
    int field_a;
    static String field_b;
    static String field_e;

    final static int a(int param0, int param1) {
        int var2 = 0;
        int var3 = 0;
        L0: {
          var2 = 0;
          if (-1 == (7 & param0 ^ -1)) {
            break L0;
          } else {
            var2 = -(param0 & 7) + 8;
            break L0;
          }
        }
        var3 = param0 - -var2;
        if (param1 != -25349) {
          field_f = null;
          return var3;
        } else {
          return var3;
        }
    }

    final static void a(int param0) {
        try {
            Exception var1 = null;
            int statePc = 0;
            Throwable caughtException = null;
            stateLoop: while (true) {
                switch (statePc) {
                    case 0: {
                        if (null != as.field_d) {
                            statePc = 4;
                        } else {
                            statePc = 1;
                        }
                        continue stateLoop;
                    }
                    case 1: {
                        if (param0 == 0) {
                            statePc = 3;
                        } else {
                            statePc = 2;
                        }
                        continue stateLoop;
                    }
                    case 2: {
                        g.b(11);
                        statePc = 3;
                        continue stateLoop;
                    }
                    case 3: {
                        id.field_f.field_u = id.field_f.field_u + 24;
                        return;
                    }
                    case 4: {
                        try {
                            as.field_d.a(-23669, 0L);
                            as.field_d.a(param0 ^ 0, 24, id.field_f.field_u, id.field_f.field_p);
                            statePc = 5;
                            continue stateLoop;
                        } catch (Throwable stateCaught_4) {
                            caughtException = stateCaught_4;
                            statePc = 8;
                            continue stateLoop;
                        }
                    }
                    case 5: {
                        if (param0 == 0) {
                            statePc = 7;
                        } else {
                            statePc = 6;
                        }
                        continue stateLoop;
                    }
                    case 6: {
                        g.b(11);
                        statePc = 7;
                        continue stateLoop;
                    }
                    case 7: {
                        id.field_f.field_u = id.field_f.field_u + 24;
                        return;
                    }
                    case 8: {
                        var1 = (Exception) (Object) caughtException;
                        if (param0 != 0) {
                            statePc = 10;
                        } else {
                            statePc = 9;
                        }
                        continue stateLoop;
                    }
                    case 9: {
                        id.field_f.field_u = id.field_f.field_u + 24;
                        return;
                    }
                    case 10: {
                        g.b(11);
                        id.field_f.field_u = id.field_f.field_u + 24;
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

    final static void b(boolean param0) {
        qn var1 = null;
        mi var2 = null;
        mi stackIn_4_0 = null;
        mi stackIn_5_0 = null;
        mi stackIn_6_0 = null;
        int stackIn_6_1 = 0;
        mi stackIn_7_0 = null;
        mi stackIn_8_0 = null;
        mi stackIn_9_0 = null;
        int stackIn_9_1 = 0;
        mi stackOut_3_0 = null;
        mi stackOut_5_0 = null;
        int stackOut_5_1 = 0;
        mi stackOut_4_0 = null;
        int stackOut_4_1 = 0;
        mi stackOut_6_0 = null;
        mi stackOut_8_0 = null;
        int stackOut_8_1 = 0;
        mi stackOut_7_0 = null;
        int stackOut_7_1 = 0;
        var1 = (qn) (Object) te.field_z.a((byte) 100);
        if (var1 == null) {
          rm.b((byte) 85);
          return;
        } else {
          L0: {
            var2 = id.field_f;
            int discarded$34 = var2.b(true);
            stackOut_3_0 = (mi) var2;
            stackIn_5_0 = stackOut_3_0;
            stackIn_4_0 = stackOut_3_0;
            if (param0) {
              stackOut_5_0 = (mi) (Object) stackIn_5_0;
              stackOut_5_1 = 0;
              stackIn_6_0 = stackOut_5_0;
              stackIn_6_1 = stackOut_5_1;
              break L0;
            } else {
              stackOut_4_0 = (mi) (Object) stackIn_4_0;
              stackOut_4_1 = 1;
              stackIn_6_0 = stackOut_4_0;
              stackIn_6_1 = stackOut_4_1;
              break L0;
            }
          }
          L1: {
            int discarded$35 = ((mi) (Object) stackIn_6_0).b(stackIn_6_1 != 0);
            int discarded$36 = var2.b(true);
            stackOut_6_0 = (mi) var2;
            stackIn_8_0 = stackOut_6_0;
            stackIn_7_0 = stackOut_6_0;
            if (param0) {
              stackOut_8_0 = (mi) (Object) stackIn_8_0;
              stackOut_8_1 = 0;
              stackIn_9_0 = stackOut_8_0;
              stackIn_9_1 = stackOut_8_1;
              break L1;
            } else {
              stackOut_7_0 = (mi) (Object) stackIn_7_0;
              stackOut_7_1 = 1;
              stackIn_9_0 = stackOut_7_0;
              stackIn_9_1 = stackOut_7_1;
              break L1;
            }
          }
          int discarded$37 = ((mi) (Object) stackIn_9_0).b(stackIn_9_1 != 0);
          if (param0) {
            field_b = null;
            var1.c(2);
            return;
          } else {
            var1.c(2);
            return;
          }
        }
    }

    final static void a(byte param0) {
        if (param0 != -10) {
            return;
        }
        ui.field_g = 0;
        nb.h(param0 + -14819);
    }

    final static void b(int param0) {
        int var1 = 0;
        int var2 = 0;
        int var3 = 0;
        int stackIn_10_0 = 0;
        int stackIn_14_0 = 0;
        int stackIn_33_0 = 0;
        int stackIn_37_0 = 0;
        int stackIn_61_0 = 0;
        int stackIn_65_0 = 0;
        int stackIn_98_0 = 0;
        int stackIn_102_0 = 0;
        int stackIn_120_0 = 0;
        int stackIn_135_0 = 0;
        int stackOut_101_0 = 0;
        int stackOut_100_0 = 0;
        int stackOut_97_0 = 0;
        int stackOut_96_0 = 0;
        int stackOut_134_0 = 0;
        int stackOut_133_0 = 0;
        int stackOut_119_0 = 0;
        int stackOut_118_0 = 0;
        int stackOut_64_0 = 0;
        int stackOut_63_0 = 0;
        int stackOut_60_0 = 0;
        int stackOut_59_0 = 0;
        int stackOut_36_0 = 0;
        int stackOut_35_0 = 0;
        int stackOut_32_0 = 0;
        int stackOut_31_0 = 0;
        int stackOut_13_0 = 0;
        int stackOut_12_0 = 0;
        int stackOut_9_0 = 0;
        int stackOut_8_0 = 0;
        var3 = Vertigo2.field_L ? 1 : 0;
        if (lc.field_b == am.field_n) {
          return;
        } else {
          if (!al.a(lc.field_b, (byte) -94)) {
            L0: {
              qh.field_g = lc.field_d;
              vl.field_c = 0;
              lc.field_b = am.field_n;
              if ((lc.field_b ^ -1) == 0) {
                break L0;
              } else {
                if (1 == lc.field_b) {
                  break L0;
                } else {
                  if (2 == lc.field_b) {
                    break L0;
                  } else {
                    if ((lc.field_b ^ -1) == -23) {
                      break L0;
                    } else {
                      if (3 == lc.field_b) {
                        break L0;
                      } else {
                        if (lc.field_b == -5) {
                          break L0;
                        } else {
                          if (-19 != lc.field_b) {
                            L1: {
                              db.a(false, 12, (byte) -128, op.field_d, true, 12);
                              if (an.field_c) {
                                ln.field_d = null;
                                an.field_c = false;
                                oe.field_pb = null;
                                break L1;
                              } else {
                                break L1;
                              }
                            }
                            if (param0 == 7) {
                              if (!qh.field_f) {
                                if (sk.field_g) {
                                  ki.a((byte) -107);
                                  k.a(false);
                                  lh.a((byte) -22);
                                  sk.field_g = false;
                                  return;
                                } else {
                                  return;
                                }
                              } else {
                                L2: {
                                  j.field_n = null;
                                  mb.field_y = null;
                                  uh.field_Xb = null;
                                  fg.field_eb.c(0);
                                  ml.field_z = 0;
                                  jq.field_e = 0;
                                  t.field_l = 0;
                                  oh.field_D.c(0);
                                  qh.field_f = false;
                                  if (!sk.field_g) {
                                    break L2;
                                  } else {
                                    ki.a((byte) -107);
                                    k.a(false);
                                    lh.a((byte) -22);
                                    sk.field_g = false;
                                    break L2;
                                  }
                                }
                                return;
                              }
                            } else {
                              L3: {
                                g.a((byte) 107);
                                if (!qh.field_f) {
                                  break L3;
                                } else {
                                  j.field_n = null;
                                  mb.field_y = null;
                                  uh.field_Xb = null;
                                  fg.field_eb.c(0);
                                  ml.field_z = 0;
                                  jq.field_e = 0;
                                  t.field_l = 0;
                                  oh.field_D.c(0);
                                  qh.field_f = false;
                                  break L3;
                                }
                              }
                              L4: {
                                if (!sk.field_g) {
                                  break L4;
                                } else {
                                  ki.a((byte) -107);
                                  k.a(false);
                                  lh.a((byte) -22);
                                  sk.field_g = false;
                                  break L4;
                                }
                              }
                              return;
                            }
                          } else {
                            L5: {
                              var1 = 0;
                              var2 = 0;
                              if (null != ln.field_d) {
                                L6: {
                                  var1 = ln.field_d.field_D.b(-6133);
                                  if (1 != ln.field_d.field_D.field_r.h(9979)) {
                                    stackOut_101_0 = 0;
                                    stackIn_102_0 = stackOut_101_0;
                                    break L6;
                                  } else {
                                    stackOut_100_0 = 1;
                                    stackIn_102_0 = stackOut_100_0;
                                    break L6;
                                  }
                                }
                                var2 = stackIn_102_0;
                                break L5;
                              } else {
                                if (null == oe.field_pb) {
                                  break L5;
                                } else {
                                  L7: {
                                    var1 = oe.field_pb.field_D.b(-6133);
                                    if (1 != oe.field_pb.field_D.field_r.h(9979)) {
                                      stackOut_97_0 = 0;
                                      stackIn_98_0 = stackOut_97_0;
                                      break L7;
                                    } else {
                                      stackOut_96_0 = 1;
                                      stackIn_98_0 = stackOut_96_0;
                                      break L7;
                                    }
                                  }
                                  var2 = stackIn_98_0;
                                  break L5;
                                }
                              }
                            }
                            L8: {
                              if (var2 == 0) {
                                break L8;
                              } else {
                                db.a(false, 12, (byte) 117, up.field_B[var1 % up.field_B.length], false, 12);
                                break L8;
                              }
                            }
                            L9: {
                              if (an.field_c) {
                                ln.field_d = null;
                                an.field_c = false;
                                oe.field_pb = null;
                                break L9;
                              } else {
                                break L9;
                              }
                            }
                            L10: {
                              if (param0 == 7) {
                                break L10;
                              } else {
                                g.a((byte) 107);
                                break L10;
                              }
                            }
                            L11: {
                              if (!qh.field_f) {
                                break L11;
                              } else {
                                j.field_n = null;
                                mb.field_y = null;
                                uh.field_Xb = null;
                                fg.field_eb.c(0);
                                ml.field_z = 0;
                                jq.field_e = 0;
                                t.field_l = 0;
                                oh.field_D.c(0);
                                qh.field_f = false;
                                break L11;
                              }
                            }
                            L12: {
                              if (!sk.field_g) {
                                break L12;
                              } else {
                                ki.a((byte) -107);
                                k.a(false);
                                lh.a((byte) -22);
                                sk.field_g = false;
                                break L12;
                              }
                            }
                            return;
                          }
                        }
                      }
                    }
                  }
                }
              }
            }
            L13: {
              var1 = 0;
              var2 = 0;
              if (null != ln.field_d) {
                L14: {
                  var1 = ln.field_d.field_D.b(-6133);
                  if (1 != ln.field_d.field_D.field_r.h(9979)) {
                    stackOut_134_0 = 0;
                    stackIn_135_0 = stackOut_134_0;
                    break L14;
                  } else {
                    stackOut_133_0 = 1;
                    stackIn_135_0 = stackOut_133_0;
                    break L14;
                  }
                }
                var2 = stackIn_135_0;
                break L13;
              } else {
                if (null == oe.field_pb) {
                  break L13;
                } else {
                  L15: {
                    var1 = oe.field_pb.field_D.b(-6133);
                    if (1 != oe.field_pb.field_D.field_r.h(9979)) {
                      stackOut_119_0 = 0;
                      stackIn_120_0 = stackOut_119_0;
                      break L15;
                    } else {
                      stackOut_118_0 = 1;
                      stackIn_120_0 = stackOut_118_0;
                      break L15;
                    }
                  }
                  L16: {
                    var2 = stackIn_120_0;
                    if (var2 == 0) {
                      break L16;
                    } else {
                      db.a(false, 12, (byte) 117, up.field_B[var1 % up.field_B.length], false, 12);
                      break L16;
                    }
                  }
                  L17: {
                    if (an.field_c) {
                      ln.field_d = null;
                      an.field_c = false;
                      oe.field_pb = null;
                      break L17;
                    } else {
                      break L17;
                    }
                  }
                  L18: {
                    if (param0 == 7) {
                      break L18;
                    } else {
                      g.a((byte) 107);
                      break L18;
                    }
                  }
                  L19: {
                    if (!qh.field_f) {
                      break L19;
                    } else {
                      j.field_n = null;
                      mb.field_y = null;
                      uh.field_Xb = null;
                      fg.field_eb.c(0);
                      ml.field_z = 0;
                      jq.field_e = 0;
                      t.field_l = 0;
                      oh.field_D.c(0);
                      qh.field_f = false;
                      break L19;
                    }
                  }
                  L20: {
                    if (!sk.field_g) {
                      break L20;
                    } else {
                      ki.a((byte) -107);
                      k.a(false);
                      lh.a((byte) -22);
                      sk.field_g = false;
                      break L20;
                    }
                  }
                  return;
                }
              }
            }
            if (var2 == 0) {
              L21: {
                if (an.field_c) {
                  ln.field_d = null;
                  an.field_c = false;
                  oe.field_pb = null;
                  break L21;
                } else {
                  break L21;
                }
              }
              if (param0 == 7) {
                if (!qh.field_f) {
                  if (sk.field_g) {
                    ki.a((byte) -107);
                    k.a(false);
                    lh.a((byte) -22);
                    sk.field_g = false;
                    return;
                  } else {
                    return;
                  }
                } else {
                  j.field_n = null;
                  mb.field_y = null;
                  uh.field_Xb = null;
                  fg.field_eb.c(0);
                  ml.field_z = 0;
                  jq.field_e = 0;
                  t.field_l = 0;
                  oh.field_D.c(0);
                  qh.field_f = false;
                  if (sk.field_g) {
                    ki.a((byte) -107);
                    k.a(false);
                    lh.a((byte) -22);
                    sk.field_g = false;
                    return;
                  } else {
                    return;
                  }
                }
              } else {
                g.a((byte) 107);
                if (!qh.field_f) {
                  if (sk.field_g) {
                    ki.a((byte) -107);
                    k.a(false);
                    lh.a((byte) -22);
                    sk.field_g = false;
                    return;
                  } else {
                    return;
                  }
                } else {
                  L22: {
                    j.field_n = null;
                    mb.field_y = null;
                    uh.field_Xb = null;
                    fg.field_eb.c(0);
                    ml.field_z = 0;
                    jq.field_e = 0;
                    t.field_l = 0;
                    oh.field_D.c(0);
                    qh.field_f = false;
                    if (!sk.field_g) {
                      break L22;
                    } else {
                      ki.a((byte) -107);
                      k.a(false);
                      lh.a((byte) -22);
                      sk.field_g = false;
                      break L22;
                    }
                  }
                  return;
                }
              }
            } else {
              L23: {
                db.a(false, 12, (byte) 117, up.field_B[var1 % up.field_B.length], false, 12);
                if (an.field_c) {
                  ln.field_d = null;
                  an.field_c = false;
                  oe.field_pb = null;
                  break L23;
                } else {
                  break L23;
                }
              }
              L24: {
                if (param0 == 7) {
                  break L24;
                } else {
                  g.a((byte) 107);
                  break L24;
                }
              }
              L25: {
                if (!qh.field_f) {
                  break L25;
                } else {
                  j.field_n = null;
                  mb.field_y = null;
                  uh.field_Xb = null;
                  fg.field_eb.c(0);
                  ml.field_z = 0;
                  jq.field_e = 0;
                  t.field_l = 0;
                  oh.field_D.c(0);
                  qh.field_f = false;
                  break L25;
                }
              }
              L26: {
                if (!sk.field_g) {
                  break L26;
                } else {
                  ki.a((byte) -107);
                  k.a(false);
                  lh.a((byte) -22);
                  sk.field_g = false;
                  break L26;
                }
              }
              return;
            }
          } else {
            fh.field_y[lc.field_b].c(20);
            qh.field_g = lc.field_d;
            vl.field_c = 0;
            lc.field_b = am.field_n;
            if ((lc.field_b ^ -1) != 0) {
              if (1 != lc.field_b) {
                L27: {
                  L28: {
                    if (2 == lc.field_b) {
                      break L28;
                    } else {
                      if ((lc.field_b ^ -1) == -23) {
                        break L28;
                      } else {
                        if (3 == lc.field_b) {
                          break L28;
                        } else {
                          if (lc.field_b == -5) {
                            break L28;
                          } else {
                            if (-19 != lc.field_b) {
                              db.a(false, 12, (byte) -128, op.field_d, true, 12);
                              break L27;
                            } else {
                              break L28;
                            }
                          }
                        }
                      }
                    }
                  }
                  L29: {
                    var1 = 0;
                    var2 = 0;
                    if (null != ln.field_d) {
                      L30: {
                        var1 = ln.field_d.field_D.b(-6133);
                        if (1 != ln.field_d.field_D.field_r.h(9979)) {
                          stackOut_64_0 = 0;
                          stackIn_65_0 = stackOut_64_0;
                          break L30;
                        } else {
                          stackOut_63_0 = 1;
                          stackIn_65_0 = stackOut_63_0;
                          break L30;
                        }
                      }
                      var2 = stackIn_65_0;
                      break L29;
                    } else {
                      if (null == oe.field_pb) {
                        break L29;
                      } else {
                        L31: {
                          var1 = oe.field_pb.field_D.b(-6133);
                          if (1 != oe.field_pb.field_D.field_r.h(9979)) {
                            stackOut_60_0 = 0;
                            stackIn_61_0 = stackOut_60_0;
                            break L31;
                          } else {
                            stackOut_59_0 = 1;
                            stackIn_61_0 = stackOut_59_0;
                            break L31;
                          }
                        }
                        var2 = stackIn_61_0;
                        break L29;
                      }
                    }
                  }
                  if (var2 == 0) {
                    break L27;
                  } else {
                    db.a(false, 12, (byte) 117, up.field_B[var1 % up.field_B.length], false, 12);
                    break L27;
                  }
                }
                L32: {
                  if (an.field_c) {
                    ln.field_d = null;
                    an.field_c = false;
                    oe.field_pb = null;
                    break L32;
                  } else {
                    break L32;
                  }
                }
                if (param0 != 7) {
                  g.a((byte) 107);
                  if (!qh.field_f) {
                    L33: {
                      if (!sk.field_g) {
                        break L33;
                      } else {
                        ki.a((byte) -107);
                        k.a(false);
                        lh.a((byte) -22);
                        sk.field_g = false;
                        break L33;
                      }
                    }
                    return;
                  } else {
                    L34: {
                      j.field_n = null;
                      mb.field_y = null;
                      uh.field_Xb = null;
                      fg.field_eb.c(0);
                      ml.field_z = 0;
                      jq.field_e = 0;
                      t.field_l = 0;
                      oh.field_D.c(0);
                      qh.field_f = false;
                      if (!sk.field_g) {
                        break L34;
                      } else {
                        ki.a((byte) -107);
                        k.a(false);
                        lh.a((byte) -22);
                        sk.field_g = false;
                        break L34;
                      }
                    }
                    return;
                  }
                } else {
                  L35: {
                    if (!qh.field_f) {
                      break L35;
                    } else {
                      j.field_n = null;
                      mb.field_y = null;
                      uh.field_Xb = null;
                      fg.field_eb.c(0);
                      ml.field_z = 0;
                      jq.field_e = 0;
                      t.field_l = 0;
                      oh.field_D.c(0);
                      qh.field_f = false;
                      break L35;
                    }
                  }
                  L36: {
                    if (!sk.field_g) {
                      break L36;
                    } else {
                      ki.a((byte) -107);
                      k.a(false);
                      lh.a((byte) -22);
                      sk.field_g = false;
                      break L36;
                    }
                  }
                  return;
                }
              } else {
                L37: {
                  var1 = 0;
                  var2 = 0;
                  if (null != ln.field_d) {
                    L38: {
                      var1 = ln.field_d.field_D.b(-6133);
                      if (1 != ln.field_d.field_D.field_r.h(9979)) {
                        stackOut_36_0 = 0;
                        stackIn_37_0 = stackOut_36_0;
                        break L38;
                      } else {
                        stackOut_35_0 = 1;
                        stackIn_37_0 = stackOut_35_0;
                        break L38;
                      }
                    }
                    var2 = stackIn_37_0;
                    break L37;
                  } else {
                    if (null == oe.field_pb) {
                      break L37;
                    } else {
                      L39: {
                        var1 = oe.field_pb.field_D.b(-6133);
                        if (1 != oe.field_pb.field_D.field_r.h(9979)) {
                          stackOut_32_0 = 0;
                          stackIn_33_0 = stackOut_32_0;
                          break L39;
                        } else {
                          stackOut_31_0 = 1;
                          stackIn_33_0 = stackOut_31_0;
                          break L39;
                        }
                      }
                      var2 = stackIn_33_0;
                      break L37;
                    }
                  }
                }
                L40: {
                  if (var2 == 0) {
                    break L40;
                  } else {
                    db.a(false, 12, (byte) 117, up.field_B[var1 % up.field_B.length], false, 12);
                    break L40;
                  }
                }
                L41: {
                  if (an.field_c) {
                    ln.field_d = null;
                    an.field_c = false;
                    oe.field_pb = null;
                    break L41;
                  } else {
                    break L41;
                  }
                }
                L42: {
                  if (param0 == 7) {
                    break L42;
                  } else {
                    g.a((byte) 107);
                    break L42;
                  }
                }
                L43: {
                  if (!qh.field_f) {
                    break L43;
                  } else {
                    j.field_n = null;
                    mb.field_y = null;
                    uh.field_Xb = null;
                    fg.field_eb.c(0);
                    ml.field_z = 0;
                    jq.field_e = 0;
                    t.field_l = 0;
                    oh.field_D.c(0);
                    qh.field_f = false;
                    break L43;
                  }
                }
                L44: {
                  if (!sk.field_g) {
                    break L44;
                  } else {
                    ki.a((byte) -107);
                    k.a(false);
                    lh.a((byte) -22);
                    sk.field_g = false;
                    break L44;
                  }
                }
                return;
              }
            } else {
              L45: {
                var1 = 0;
                var2 = 0;
                if (null != ln.field_d) {
                  L46: {
                    var1 = ln.field_d.field_D.b(-6133);
                    if (1 != ln.field_d.field_D.field_r.h(9979)) {
                      stackOut_13_0 = 0;
                      stackIn_14_0 = stackOut_13_0;
                      break L46;
                    } else {
                      stackOut_12_0 = 1;
                      stackIn_14_0 = stackOut_12_0;
                      break L46;
                    }
                  }
                  var2 = stackIn_14_0;
                  break L45;
                } else {
                  if (null == oe.field_pb) {
                    break L45;
                  } else {
                    L47: {
                      var1 = oe.field_pb.field_D.b(-6133);
                      if (1 != oe.field_pb.field_D.field_r.h(9979)) {
                        stackOut_9_0 = 0;
                        stackIn_10_0 = stackOut_9_0;
                        break L47;
                      } else {
                        stackOut_8_0 = 1;
                        stackIn_10_0 = stackOut_8_0;
                        break L47;
                      }
                    }
                    var2 = stackIn_10_0;
                    break L45;
                  }
                }
              }
              L48: {
                if (var2 == 0) {
                  break L48;
                } else {
                  db.a(false, 12, (byte) 117, up.field_B[var1 % up.field_B.length], false, 12);
                  break L48;
                }
              }
              L49: {
                if (an.field_c) {
                  ln.field_d = null;
                  an.field_c = false;
                  oe.field_pb = null;
                  break L49;
                } else {
                  break L49;
                }
              }
              L50: {
                if (param0 == 7) {
                  break L50;
                } else {
                  g.a((byte) 107);
                  break L50;
                }
              }
              L51: {
                if (!qh.field_f) {
                  break L51;
                } else {
                  j.field_n = null;
                  mb.field_y = null;
                  uh.field_Xb = null;
                  fg.field_eb.c(0);
                  ml.field_z = 0;
                  jq.field_e = 0;
                  t.field_l = 0;
                  oh.field_D.c(0);
                  qh.field_f = false;
                  break L51;
                }
              }
              L52: {
                if (!sk.field_g) {
                  break L52;
                } else {
                  ki.a((byte) -107);
                  k.a(false);
                  lh.a((byte) -22);
                  sk.field_g = false;
                  break L52;
                }
              }
              return;
            }
          }
        }
    }

    public static void a(boolean param0) {
        field_b = null;
        field_f = null;
        if (param0) {
            field_e = null;
            field_e = null;
            return;
        }
        field_e = null;
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_f = new ve(0, 2, 2, 1);
        field_e = "You are invited to <%0>'s game.";
        field_b = "Seriously offensive language";
    }
}
