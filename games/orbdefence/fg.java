/*
 * Decompiled by CFR-JS 0.4.0.
 */
import java.io.*;

class fg extends jc {
    static int field_u;

    public final void a(int param0, int param1, pj param2, int param3, boolean param4) {
        if (param4) {
          tl.a(param2.field_r, param2.field_n + param0, param2.field_s + param1, param2.field_m, param3 ^ 4459);
          super.a(param0, param1, param2, param3, param4);
          return;
        } else {
          super.a(param0, param1, param2, param3, param4);
          return;
        }
    }

    final static boolean a(boolean param0, int param1) {
        try {
            IOException var2 = null;
            se var4 = null;
            se var5 = null;
            int stackIn_13_0 = 0;
            int stackOut_11_0 = 0;
            int stackOut_12_0 = 0;
            int statePc = 0;
            Throwable caughtException = null;
            stateLoop: while (true) {
                switch (statePc) {
                    case 0: {
                        if (null != ia.field_f) {
                            statePc = 2;
                        } else {
                            statePc = 1;
                        }
                        continue stateLoop;
                    }
                    case 1: {
                        ia.field_f = ef.field_i.a(eg.field_v, 0, jl.field_e);
                        statePc = 2;
                        continue stateLoop;
                    }
                    case 2: {
                        if (-1 == (ia.field_f.field_a ^ -1)) {
                            statePc = 4;
                        } else {
                            statePc = 5;
                        }
                        continue stateLoop;
                    }
                    case 4: {
                        return false;
                    }
                    case 5: {
                        p.field_a = ji.b(-85);
                        of.field_L = ji.b(-85);
                        if ((ia.field_f.field_a ^ -1) == -2) {
                            statePc = 10;
                        } else {
                            statePc = 6;
                        }
                        continue stateLoop;
                    }
                    case 6: {
                        dh.field_bb = ug.field_p;
                        if (param1 > -14) {
                            statePc = 8;
                        } else {
                            statePc = 7;
                        }
                        continue stateLoop;
                    }
                    case 7: {
                        ia.field_f = null;
                        return true;
                    }
                    case 8: {
                        return true;
                    }
                    case 10: {
                        try {
                            p.field_d = new cb((java.net.Socket) ia.field_f.field_g, ef.field_i);
                            var4 = cd.field_t;
                            var5 = var4;
                            uk.field_b.field_i = 0;
                            if (param0) {
                                statePc = 12;
                            } else {
                                statePc = 11;
                            }
                            continue stateLoop;
                        } catch (Throwable stateCaught_10) {
                            caughtException = stateCaught_10;
                            statePc = 18;
                            continue stateLoop;
                        }
                    }
                    case 11: {
                        try {
                            stackOut_11_0 = -1;
                            stackIn_13_0 = stackOut_11_0;
                            statePc = 13;
                            continue stateLoop;
                        } catch (Throwable stateCaught_11) {
                            caughtException = stateCaught_11;
                            statePc = 18;
                            continue stateLoop;
                        }
                    }
                    case 12: {
                        try {
                            stackOut_12_0 = -2;
                            stackIn_13_0 = stackOut_12_0;
                            statePc = 13;
                            continue stateLoop;
                        } catch (Throwable stateCaught_12) {
                            caughtException = stateCaught_12;
                            statePc = 18;
                            continue stateLoop;
                        }
                    }
                    case 13: {
                        try {
                            lh.field_c = stackIn_13_0;
                            fe.field_b = stackIn_13_0;
                            ce.field_d = stackIn_13_0;
                            dh.field_bb = sk.field_E;
                            var5.field_i = 0;
                            nl.a(20994, gi.field_a, ti.field_eb, (mg) (Object) uk.field_b, dk.field_a);
                            bh.a(-1, -1);
                            statePc = 14;
                            continue stateLoop;
                        } catch (Throwable stateCaught_13) {
                            caughtException = stateCaught_13;
                            statePc = 18;
                            continue stateLoop;
                        }
                    }
                    case 14: {
                        if (param1 > -14) {
                            statePc = 16;
                        } else {
                            statePc = 15;
                        }
                        continue stateLoop;
                    }
                    case 15: {
                        ia.field_f = null;
                        return true;
                    }
                    case 16: {
                        return true;
                    }
                    case 18: {
                        var2 = (IOException) (Object) caughtException;
                        dh.field_bb = ug.field_p;
                        if (param1 > -14) {
                            statePc = 20;
                        } else {
                            statePc = 19;
                        }
                        continue stateLoop;
                    }
                    case 19: {
                        ia.field_f = null;
                        return true;
                    }
                    case 20: {
                        return true;
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

    final static void a(int param0, int param1, int param2, java.awt.Component param3, be param4, boolean param5, lj param6, boolean param7) {
        la.a(param2, param7, 10);
        cd.field_w = la.a(param4, param3, 0, param0);
        wf.field_b = la.a(param4, param3, 1, param1);
        vb.field_f = new v();
        h.field_H = param1 * 1000 / param2;
        wf.field_b.a((di) (Object) vb.field_f);
        ml.field_c = param6;
        ml.field_c.b(ij.field_g, 106);
        if (!param5) {
            field_u = -24;
        } else {
            cd.field_w.a((di) (Object) ml.field_c);
            return;
        }
        cd.field_w.a((di) (Object) ml.field_c);
    }

    final static void a(byte param0, java.awt.Component param1) {
        param1.removeKeyListener((java.awt.event.KeyListener) (Object) ad.field_b);
        param1.removeFocusListener((java.awt.event.FocusListener) (Object) ad.field_b);
        wg.field_p = -1;
        if (param0 != 51) {
            Object var3 = null;
            fg.a(127, -79, -7, (java.awt.Component) null, (be) null, false, (lj) null, false);
        }
    }

    final static void a(int param0, String param1) {
        int var2 = 0;
        int var3 = 0;
        int stackIn_14_0 = 0;
        int stackIn_79_0 = 0;
        int stackIn_124_0 = 0;
        int stackIn_157_0 = 0;
        int stackIn_198_0 = 0;
        int stackOut_197_0 = 0;
        int stackOut_196_0 = 0;
        int stackOut_194_0 = 0;
        int stackOut_155_0 = 0;
        int stackOut_154_0 = 0;
        int stackOut_152_0 = 0;
        int stackOut_150_0 = 0;
        int stackOut_123_0 = 0;
        int stackOut_122_0 = 0;
        int stackOut_120_0 = 0;
        int stackOut_118_0 = 0;
        int stackOut_77_0 = 0;
        int stackOut_76_0 = 0;
        int stackOut_74_0 = 0;
        int stackOut_72_0 = 0;
        int stackOut_12_0 = 0;
        int stackOut_7_0 = 0;
        int stackOut_5_0 = 0;
        var3 = OrbDefence.field_D ? 1 : 0;
        sd.field_g = sd.field_g + 1;
        if (kf.field_e == -1) {
          if ((lm.field_a ^ -1) != 0) {
            if (param1 != null) {
              if (!param1.equals((Object) (Object) ce.field_c)) {
                if (bm.field_e) {
                  L0: {
                    L1: {
                      var2 = 0;
                      if (param1 == null) {
                        break L1;
                      } else {
                        if (bm.field_e) {
                          sd.field_g = gk.field_b;
                          break L0;
                        } else {
                          if (var2 == 0) {
                            break L1;
                          } else {
                            sd.field_g = gk.field_b;
                            break L0;
                          }
                        }
                      }
                    }
                    sd.field_g = 0;
                    break L0;
                  }
                  L2: {
                    L3: {
                      uk.field_c = kf.field_e;
                      if (param1 == null) {
                        if (var2 == 0) {
                          break L3;
                        } else {
                          bm.field_e = true;
                          sl.field_ab = lm.field_a;
                          break L2;
                        }
                      } else {
                        bm.field_e = false;
                        break L3;
                      }
                    }
                    sl.field_ab = lm.field_a;
                    break L2;
                  }
                  L4: {
                    if (bm.field_e) {
                      break L4;
                    } else {
                      if (gk.field_b <= sd.field_g) {
                        break L4;
                      } else {
                        if (!kd.field_d) {
                          break L4;
                        } else {
                          sd.field_g = 0;
                          sl.field_ab = lm.field_a;
                          uk.field_c = kf.field_e;
                          break L4;
                        }
                      }
                    }
                  }
                  L5: {
                    ce.field_c = param1;
                    lm.field_a = -1;
                    kf.field_e = -1;
                    if (!bm.field_e) {
                      break L5;
                    } else {
                      if (jf.field_H != sd.field_g) {
                        break L5;
                      } else {
                        sd.field_g = 0;
                        bm.field_e = false;
                        break L5;
                      }
                    }
                  }
                  L6: {
                    if (param0 > 53) {
                      break L6;
                    } else {
                      field_u = -91;
                      break L6;
                    }
                  }
                  return;
                } else {
                  L7: {
                    if (sd.field_g >= gk.field_b) {
                      if (gk.field_b + df.field_i <= sd.field_g) {
                        stackOut_197_0 = 0;
                        stackIn_198_0 = stackOut_197_0;
                        break L7;
                      } else {
                        stackOut_196_0 = 1;
                        stackIn_198_0 = stackOut_196_0;
                        break L7;
                      }
                    } else {
                      stackOut_194_0 = 0;
                      stackIn_198_0 = stackOut_194_0;
                      break L7;
                    }
                  }
                  L8: {
                    L9: {
                      var2 = stackIn_198_0;
                      if (param1 == null) {
                        break L9;
                      } else {
                        if (bm.field_e) {
                          sd.field_g = gk.field_b;
                          break L8;
                        } else {
                          if (var2 == 0) {
                            break L9;
                          } else {
                            sd.field_g = gk.field_b;
                            break L8;
                          }
                        }
                      }
                    }
                    sd.field_g = 0;
                    break L8;
                  }
                  L10: {
                    L11: {
                      uk.field_c = kf.field_e;
                      if (param1 == null) {
                        if (var2 == 0) {
                          break L11;
                        } else {
                          bm.field_e = true;
                          sl.field_ab = lm.field_a;
                          break L10;
                        }
                      } else {
                        bm.field_e = false;
                        break L11;
                      }
                    }
                    sl.field_ab = lm.field_a;
                    break L10;
                  }
                  L12: {
                    if (bm.field_e) {
                      break L12;
                    } else {
                      if (gk.field_b <= sd.field_g) {
                        break L12;
                      } else {
                        if (!kd.field_d) {
                          break L12;
                        } else {
                          sd.field_g = 0;
                          sl.field_ab = lm.field_a;
                          uk.field_c = kf.field_e;
                          break L12;
                        }
                      }
                    }
                  }
                  L13: {
                    ce.field_c = param1;
                    lm.field_a = -1;
                    kf.field_e = -1;
                    if (!bm.field_e) {
                      break L13;
                    } else {
                      if (jf.field_H != sd.field_g) {
                        break L13;
                      } else {
                        sd.field_g = 0;
                        bm.field_e = false;
                        break L13;
                      }
                    }
                  }
                  L14: {
                    if (param0 > 53) {
                      break L14;
                    } else {
                      field_u = -91;
                      break L14;
                    }
                  }
                  return;
                }
              } else {
                L15: {
                  if (bm.field_e) {
                    break L15;
                  } else {
                    if (gk.field_b <= sd.field_g) {
                      break L15;
                    } else {
                      if (!kd.field_d) {
                        break L15;
                      } else {
                        sd.field_g = 0;
                        sl.field_ab = lm.field_a;
                        uk.field_c = kf.field_e;
                        break L15;
                      }
                    }
                  }
                }
                L16: {
                  ce.field_c = param1;
                  lm.field_a = -1;
                  kf.field_e = -1;
                  if (!bm.field_e) {
                    break L16;
                  } else {
                    if (jf.field_H != sd.field_g) {
                      break L16;
                    } else {
                      sd.field_g = 0;
                      bm.field_e = false;
                      break L16;
                    }
                  }
                }
                L17: {
                  if (param0 > 53) {
                    break L17;
                  } else {
                    field_u = -91;
                    break L17;
                  }
                }
                return;
              }
            } else {
              if (ce.field_c != null) {
                L18: {
                  if (bm.field_e) {
                    break L18;
                  } else {
                    if (gk.field_b <= sd.field_g) {
                      break L18;
                    } else {
                      if (!kd.field_d) {
                        break L18;
                      } else {
                        sd.field_g = 0;
                        sl.field_ab = lm.field_a;
                        uk.field_c = kf.field_e;
                        break L18;
                      }
                    }
                  }
                }
                L19: {
                  ce.field_c = param1;
                  lm.field_a = -1;
                  kf.field_e = -1;
                  if (!bm.field_e) {
                    break L19;
                  } else {
                    if (jf.field_H != sd.field_g) {
                      break L19;
                    } else {
                      sd.field_g = 0;
                      bm.field_e = false;
                      break L19;
                    }
                  }
                }
                L20: {
                  if (param0 > 53) {
                    break L20;
                  } else {
                    field_u = -91;
                    break L20;
                  }
                }
                return;
              } else {
                L21: {
                  if (!bm.field_e) {
                    if (sd.field_g >= gk.field_b) {
                      if (gk.field_b + df.field_i <= sd.field_g) {
                        stackOut_155_0 = 0;
                        stackIn_157_0 = stackOut_155_0;
                        break L21;
                      } else {
                        stackOut_154_0 = 1;
                        stackIn_157_0 = stackOut_154_0;
                        break L21;
                      }
                    } else {
                      stackOut_152_0 = 0;
                      stackIn_157_0 = stackOut_152_0;
                      break L21;
                    }
                  } else {
                    stackOut_150_0 = 0;
                    stackIn_157_0 = stackOut_150_0;
                    break L21;
                  }
                }
                L22: {
                  L23: {
                    var2 = stackIn_157_0;
                    if (param1 == null) {
                      break L23;
                    } else {
                      if (bm.field_e) {
                        sd.field_g = gk.field_b;
                        break L22;
                      } else {
                        if (var2 == 0) {
                          break L23;
                        } else {
                          sd.field_g = gk.field_b;
                          break L22;
                        }
                      }
                    }
                  }
                  sd.field_g = 0;
                  break L22;
                }
                L24: {
                  uk.field_c = kf.field_e;
                  if (param1 == null) {
                    if (var2 == 0) {
                      break L24;
                    } else {
                      bm.field_e = true;
                      break L24;
                    }
                  } else {
                    bm.field_e = false;
                    break L24;
                  }
                }
                L25: {
                  sl.field_ab = lm.field_a;
                  if (bm.field_e) {
                    break L25;
                  } else {
                    if (gk.field_b <= sd.field_g) {
                      break L25;
                    } else {
                      if (!kd.field_d) {
                        break L25;
                      } else {
                        sd.field_g = 0;
                        sl.field_ab = lm.field_a;
                        uk.field_c = kf.field_e;
                        break L25;
                      }
                    }
                  }
                }
                L26: {
                  ce.field_c = param1;
                  lm.field_a = -1;
                  kf.field_e = -1;
                  if (!bm.field_e) {
                    break L26;
                  } else {
                    if (jf.field_H != sd.field_g) {
                      break L26;
                    } else {
                      sd.field_g = 0;
                      bm.field_e = false;
                      break L26;
                    }
                  }
                }
                L27: {
                  if (param0 > 53) {
                    break L27;
                  } else {
                    field_u = -91;
                    break L27;
                  }
                }
                return;
              }
            }
          } else {
            L28: {
              L29: {
                kf.field_e = ua.field_a;
                lm.field_a = vl.field_d;
                if (param1 != null) {
                  if (!param1.equals((Object) (Object) ce.field_c)) {
                    break L29;
                  } else {
                    break L28;
                  }
                } else {
                  if (ce.field_c != null) {
                    break L28;
                  } else {
                    break L29;
                  }
                }
              }
              L30: {
                if (!bm.field_e) {
                  if (sd.field_g >= gk.field_b) {
                    if (gk.field_b + df.field_i <= sd.field_g) {
                      stackOut_123_0 = 0;
                      stackIn_124_0 = stackOut_123_0;
                      break L30;
                    } else {
                      stackOut_122_0 = 1;
                      stackIn_124_0 = stackOut_122_0;
                      break L30;
                    }
                  } else {
                    stackOut_120_0 = 0;
                    stackIn_124_0 = stackOut_120_0;
                    break L30;
                  }
                } else {
                  stackOut_118_0 = 0;
                  stackIn_124_0 = stackOut_118_0;
                  break L30;
                }
              }
              L31: {
                L32: {
                  var2 = stackIn_124_0;
                  if (param1 == null) {
                    break L32;
                  } else {
                    if (bm.field_e) {
                      sd.field_g = gk.field_b;
                      break L31;
                    } else {
                      if (var2 == 0) {
                        break L32;
                      } else {
                        sd.field_g = gk.field_b;
                        break L31;
                      }
                    }
                  }
                }
                sd.field_g = 0;
                break L31;
              }
              L33: {
                uk.field_c = kf.field_e;
                if (param1 == null) {
                  if (var2 == 0) {
                    break L33;
                  } else {
                    bm.field_e = true;
                    break L33;
                  }
                } else {
                  bm.field_e = false;
                  break L33;
                }
              }
              sl.field_ab = lm.field_a;
              break L28;
            }
            L34: {
              if (bm.field_e) {
                break L34;
              } else {
                if (gk.field_b <= sd.field_g) {
                  break L34;
                } else {
                  if (!kd.field_d) {
                    break L34;
                  } else {
                    sd.field_g = 0;
                    sl.field_ab = lm.field_a;
                    uk.field_c = kf.field_e;
                    break L34;
                  }
                }
              }
            }
            L35: {
              ce.field_c = param1;
              lm.field_a = -1;
              kf.field_e = -1;
              if (!bm.field_e) {
                break L35;
              } else {
                if (jf.field_H != sd.field_g) {
                  break L35;
                } else {
                  sd.field_g = 0;
                  bm.field_e = false;
                  break L35;
                }
              }
            }
            L36: {
              if (param0 > 53) {
                break L36;
              } else {
                field_u = -91;
                break L36;
              }
            }
            return;
          }
        } else {
          if (param1 == null) {
            if (ce.field_c == null) {
              L37: {
                if (!bm.field_e) {
                  if (sd.field_g >= gk.field_b) {
                    if (gk.field_b + df.field_i > sd.field_g) {
                      stackOut_77_0 = 1;
                      stackIn_79_0 = stackOut_77_0;
                      break L37;
                    } else {
                      stackOut_76_0 = 0;
                      stackIn_79_0 = stackOut_76_0;
                      break L37;
                    }
                  } else {
                    stackOut_74_0 = 0;
                    stackIn_79_0 = stackOut_74_0;
                    break L37;
                  }
                } else {
                  stackOut_72_0 = 0;
                  stackIn_79_0 = stackOut_72_0;
                  break L37;
                }
              }
              L38: {
                var2 = stackIn_79_0;
                if (param1 != null) {
                  L39: {
                    if (bm.field_e) {
                      break L39;
                    } else {
                      if (var2 != 0) {
                        break L39;
                      } else {
                        sd.field_g = 0;
                        break L38;
                      }
                    }
                  }
                  sd.field_g = gk.field_b;
                  break L38;
                } else {
                  sd.field_g = 0;
                  break L38;
                }
              }
              L40: {
                uk.field_c = kf.field_e;
                if (param1 == null) {
                  if (var2 == 0) {
                    break L40;
                  } else {
                    bm.field_e = true;
                    break L40;
                  }
                } else {
                  bm.field_e = false;
                  break L40;
                }
              }
              L41: {
                sl.field_ab = lm.field_a;
                if (!bm.field_e) {
                  if (gk.field_b > sd.field_g) {
                    if (kd.field_d) {
                      sd.field_g = 0;
                      sl.field_ab = lm.field_a;
                      uk.field_c = kf.field_e;
                      ce.field_c = param1;
                      lm.field_a = -1;
                      kf.field_e = -1;
                      if (!bm.field_e) {
                        break L41;
                      } else {
                        if (jf.field_H != sd.field_g) {
                          break L41;
                        } else {
                          sd.field_g = 0;
                          bm.field_e = false;
                          break L41;
                        }
                      }
                    } else {
                      ce.field_c = param1;
                      lm.field_a = -1;
                      kf.field_e = -1;
                      if (!bm.field_e) {
                        break L41;
                      } else {
                        if (jf.field_H != sd.field_g) {
                          break L41;
                        } else {
                          sd.field_g = 0;
                          bm.field_e = false;
                          break L41;
                        }
                      }
                    }
                  } else {
                    ce.field_c = param1;
                    lm.field_a = -1;
                    kf.field_e = -1;
                    if (!bm.field_e) {
                      break L41;
                    } else {
                      if (jf.field_H != sd.field_g) {
                        break L41;
                      } else {
                        sd.field_g = 0;
                        bm.field_e = false;
                        break L41;
                      }
                    }
                  }
                } else {
                  ce.field_c = param1;
                  lm.field_a = -1;
                  kf.field_e = -1;
                  if (!bm.field_e) {
                    break L41;
                  } else {
                    if (jf.field_H != sd.field_g) {
                      break L41;
                    } else {
                      sd.field_g = 0;
                      bm.field_e = false;
                      break L41;
                    }
                  }
                }
              }
              L42: {
                if (param0 > 53) {
                  break L42;
                } else {
                  field_u = -91;
                  break L42;
                }
              }
              return;
            } else {
              L43: {
                if (!bm.field_e) {
                  if (gk.field_b > sd.field_g) {
                    if (kd.field_d) {
                      sd.field_g = 0;
                      sl.field_ab = lm.field_a;
                      uk.field_c = kf.field_e;
                      ce.field_c = param1;
                      lm.field_a = -1;
                      kf.field_e = -1;
                      if (!bm.field_e) {
                        break L43;
                      } else {
                        if (jf.field_H != sd.field_g) {
                          break L43;
                        } else {
                          sd.field_g = 0;
                          bm.field_e = false;
                          break L43;
                        }
                      }
                    } else {
                      ce.field_c = param1;
                      lm.field_a = -1;
                      kf.field_e = -1;
                      if (!bm.field_e) {
                        break L43;
                      } else {
                        if (jf.field_H != sd.field_g) {
                          break L43;
                        } else {
                          sd.field_g = 0;
                          bm.field_e = false;
                          break L43;
                        }
                      }
                    }
                  } else {
                    ce.field_c = param1;
                    lm.field_a = -1;
                    kf.field_e = -1;
                    if (!bm.field_e) {
                      break L43;
                    } else {
                      if (jf.field_H != sd.field_g) {
                        break L43;
                      } else {
                        sd.field_g = 0;
                        bm.field_e = false;
                        break L43;
                      }
                    }
                  }
                } else {
                  ce.field_c = param1;
                  lm.field_a = -1;
                  kf.field_e = -1;
                  if (!bm.field_e) {
                    break L43;
                  } else {
                    if (jf.field_H != sd.field_g) {
                      break L43;
                    } else {
                      sd.field_g = 0;
                      bm.field_e = false;
                      break L43;
                    }
                  }
                }
              }
              L44: {
                if (param0 > 53) {
                  break L44;
                } else {
                  field_u = -91;
                  break L44;
                }
              }
              return;
            }
          } else {
            L45: {
              L46: {
                if (!param1.equals((Object) (Object) ce.field_c)) {
                  L47: {
                    if (!bm.field_e) {
                      if (sd.field_g >= gk.field_b) {
                        if (gk.field_b + df.field_i <= sd.field_g) {
                          stackOut_12_0 = 0;
                          stackIn_14_0 = stackOut_12_0;
                          break L47;
                        } else {
                          ce.field_c = param1;
                          lm.field_a = -1;
                          kf.field_e = -1;
                          if (!bm.field_e) {
                            break L45;
                          } else {
                            if (jf.field_H != sd.field_g) {
                              break L45;
                            } else {
                              sd.field_g = 0;
                              bm.field_e = false;
                              break L45;
                            }
                          }
                        }
                      } else {
                        stackOut_7_0 = 0;
                        stackIn_14_0 = stackOut_7_0;
                        break L47;
                      }
                    } else {
                      stackOut_5_0 = 0;
                      stackIn_14_0 = stackOut_5_0;
                      break L47;
                    }
                  }
                  L48: {
                    var2 = stackIn_14_0;
                    if (param1 == null) {
                      sd.field_g = 0;
                      break L48;
                    } else {
                      if (!bm.field_e) {
                        if (var2 == 0) {
                          ce.field_c = param1;
                          lm.field_a = -1;
                          kf.field_e = -1;
                          if (!bm.field_e) {
                            break L45;
                          } else {
                            if (jf.field_H != sd.field_g) {
                              break L45;
                            } else {
                              sd.field_g = 0;
                              bm.field_e = false;
                              break L45;
                            }
                          }
                        } else {
                          sd.field_g = gk.field_b;
                          break L48;
                        }
                      } else {
                        sd.field_g = gk.field_b;
                        break L48;
                      }
                    }
                  }
                  L49: {
                    uk.field_c = kf.field_e;
                    if (param1 == null) {
                      if (var2 == 0) {
                        break L49;
                      } else {
                        bm.field_e = true;
                        sl.field_ab = lm.field_a;
                        break L46;
                      }
                    } else {
                      bm.field_e = false;
                      break L49;
                    }
                  }
                  sl.field_ab = lm.field_a;
                  break L46;
                } else {
                  break L46;
                }
              }
              if (!bm.field_e) {
                if (gk.field_b > sd.field_g) {
                  if (kd.field_d) {
                    sd.field_g = 0;
                    sl.field_ab = lm.field_a;
                    uk.field_c = kf.field_e;
                    ce.field_c = param1;
                    lm.field_a = -1;
                    kf.field_e = -1;
                    if (!bm.field_e) {
                      break L45;
                    } else {
                      if (jf.field_H != sd.field_g) {
                        break L45;
                      } else {
                        sd.field_g = 0;
                        bm.field_e = false;
                        break L45;
                      }
                    }
                  } else {
                    ce.field_c = param1;
                    lm.field_a = -1;
                    kf.field_e = -1;
                    if (!bm.field_e) {
                      break L45;
                    } else {
                      if (jf.field_H != sd.field_g) {
                        break L45;
                      } else {
                        sd.field_g = 0;
                        bm.field_e = false;
                        break L45;
                      }
                    }
                  }
                } else {
                  ce.field_c = param1;
                  lm.field_a = -1;
                  kf.field_e = -1;
                  if (!bm.field_e) {
                    break L45;
                  } else {
                    if (jf.field_H != sd.field_g) {
                      break L45;
                    } else {
                      sd.field_g = 0;
                      bm.field_e = false;
                      break L45;
                    }
                  }
                }
              } else {
                ce.field_c = param1;
                lm.field_a = -1;
                kf.field_e = -1;
                if (!bm.field_e) {
                  break L45;
                } else {
                  if (jf.field_H != sd.field_g) {
                    break L45;
                  } else {
                    sd.field_g = 0;
                    bm.field_e = false;
                    break L45;
                  }
                }
              }
            }
            L50: {
              if (param0 > 53) {
                break L50;
              } else {
                field_u = -91;
                break L50;
              }
            }
            return;
          }
        }
    }

    final static void a(byte param0, boolean param1) {
        t.a(param1, true, true);
        if (param0 < 58) {
            field_u = -67;
        }
    }

    final static void b(byte param0) {
        int var1 = 0;
        int var2 = 0;
        int var3 = 0;
        int var4 = 0;
        var4 = OrbDefence.field_D ? 1 : 0;
        var1 = vf.field_a[0];
        if (param0 != 88) {
          return;
        } else {
          var2 = 1;
          L0: while (true) {
            if (vf.field_a.length <= var2) {
              return;
            } else {
              var3 = vf.field_a[var2];
              mk.a(dm.field_g, var2 << 342465508, dm.field_g, var1, var3);
              var1 = var1 + var3;
              var2++;
              continue L0;
            }
          }
        }
    }

    fg(int param0) {
        this(lm.field_f, param0);
    }

    fg(kc param0, int param1) {
        super(param0, 4, 2, 2, 2, param1, -1, 0, 1, param0.field_H, -1, 2147483647, false);
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_u = 0;
    }
}
