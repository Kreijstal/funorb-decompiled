/*
 * Decompiled by CFR-JS 0.4.0.
 */
import java.io.*;

class fg extends jc {
    static int field_u;

    public final void a(int param0, int param1, pj param2, int param3, boolean param4) {
        try {
            if (param4) {
                tl.a(param2.field_r, param2.field_n + param0, param2.field_s + param1, param2.field_m, param3 ^ 4459);
            }
            super.a(param0, param1, param2, param3, param4);
        } catch (RuntimeException runtimeException) {
            throw dd.a((Throwable) ((Object) runtimeException), "fg.A(" + param0 + ',' + param1 + ',' + (param2 != null ? "{...}" : "null") + ',' + param3 + ',' + param4 + ')');
        }
    }

    final static boolean a(boolean param0, int param1) {
        try {
            long dupTemp$1 = 0L;
            IOException var2 = null;
            se var4 = null;
            se var5 = null;
            int stackIn_11_0 = 0;
            int decompiledRegionSelector0 = 0;
            Throwable decompiledCaughtException = null;
            L0: {
              if (null != ia.field_f) {
                break L0;
              } else {
                ia.field_f = ef.field_i.a(eg.field_v, 0, jl.field_e);
                break L0;
              }
            }
            if (-1 == (ia.field_f.field_a ^ -1)) {
              return false;
            } else {
              L1: {
                L2: {
                  dupTemp$1 = ji.b(-85);
                  p.field_a = dupTemp$1;
                  of.field_L = dupTemp$1;
                  if ((ia.field_f.field_a ^ -1) == -2) {
                    break L2;
                  } else {
                    dh.field_bb = ug.field_p;
                    if (!OrbDefence.field_D) {
                      break L1;
                    } else {
                      break L2;
                    }
                  }
                }
                try {
                  L3: {
                    L4: {
                      p.field_d = new cb((java.net.Socket) (ia.field_f.field_g), ef.field_i);
                      var4 = cd.field_t;
                      var5 = var4;
                      uk.field_b.field_i = 0;
                      if (param0) {
                        stackIn_11_0 = -2;
                        break L4;
                      } else {
                        stackIn_11_0 = -1;
                        break L4;
                      }
                    }
                    lh.field_c = stackIn_11_0;
                    fe.field_b = stackIn_11_0;
                    ce.field_d = stackIn_11_0;
                    dh.field_bb = sk.field_E;
                    var5.field_i = 0;
                    nl.a(20994, gi.field_a, ti.field_eb, uk.field_b, dk.field_a);
                    bh.a(-1, -1);
                    decompiledRegionSelector0 = 0;
                    break L3;
                  }
                } catch (java.io.IOException decompiledCaughtParameter0) {
                  decompiledCaughtException = decompiledCaughtParameter0;
                  L5: {
                    var2 = (IOException) (Object) decompiledCaughtException;
                    dh.field_bb = ug.field_p;
                    decompiledRegionSelector0 = 1;
                    break L5;
                  }
                }
                if (decompiledRegionSelector0 == 0) {
                  if (param1 > -14) {
                    return true;
                  } else {
                    ia.field_f = null;
                    return true;
                  }
                } else {
                  break L1;
                }
              }
              if (param1 > -14) {
                return true;
              } else {
                ia.field_f = null;
                return true;
              }
            }
        } catch (RuntimeException | Error decompiledUncheckedException) {
            throw decompiledUncheckedException;
        } catch (Throwable decompiledCheckedException) {
            throw new RuntimeException(decompiledCheckedException);
        }
    }

    final static void a(int param0, int param1, int param2, java.awt.Component param3, be param4, boolean param5, lj param6, boolean param7) {
        try {
            la.a(param2, param7, 10);
            cd.field_w = la.a(param4, param3, 0, param0);
            wf.field_b = la.a(param4, param3, 1, param1);
            vb.field_f = new v();
            h.field_H = param1 * 1000 / param2;
            wf.field_b.a(vb.field_f);
            ml.field_c = param6;
            ml.field_c.b(ij.field_g, 106);
            if (!param5) {
                field_u = -24;
            }
            cd.field_w.a(ml.field_c);
        } catch (RuntimeException runtimeException) {
            throw dd.a((Throwable) ((Object) runtimeException), "fg.BA(" + param0 + ',' + param1 + ',' + param2 + ',' + (param3 != null ? "{...}" : "null") + ',' + (param4 != null ? "{...}" : "null") + ',' + param5 + ',' + (param6 != null ? "{...}" : "null") + ',' + param7 + ')');
        }
    }

    final static void a(byte param0, java.awt.Component param1) {
        RuntimeException runtimeException = null;
        lj var3 = null;
        RuntimeException stackIn_5_0 = null;
        StringBuilder stackIn_5_1 = null;
        RuntimeException stackIn_6_0 = null;
        StringBuilder stackIn_6_1 = null;
        String stackIn_6_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          L0: {
            L1: {
              param1.removeKeyListener(ad.field_b);
              param1.removeFocusListener(ad.field_b);
              wg.field_p = -1;
              if (param0 == 51) {
                break L1;
              } else {
                var3 = (lj) null;
                fg.a(127, -79, -7, (java.awt.Component) null, (be) null, false, (lj) null, false);
                break L1;
              }
            }
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L2: {
            runtimeException = decompiledCaughtException;
            stackIn_5_0 = (RuntimeException) (runtimeException);

            stackIn_5_1 = new StringBuilder().append("fg.W(").append(param0).append(',');

            if (param1 == null) {
              stackIn_6_0 = (RuntimeException) ((Object) stackIn_5_0);
              stackIn_6_1 = (StringBuilder) ((Object) stackIn_5_1);
              stackIn_6_2 = "null";
              break L2;
            } else {
              stackIn_6_0 = (RuntimeException) ((Object) stackIn_5_0);
              stackIn_6_1 = (StringBuilder) ((Object) stackIn_5_1);
              stackIn_6_2 = "{...}";
              break L2;
            }
          }
          throw dd.a((Throwable) ((Object) stackIn_6_0), stackIn_6_2 + ')');
        }
    }

    final static void a(int param0, String param1) {
        int stackIn_17_0 = 0;
        RuntimeException stackIn_44_0 = null;
        StringBuilder stackIn_44_1 = null;
        RuntimeException stackIn_45_0 = null;
        StringBuilder stackIn_45_1 = null;
        String stackIn_45_2 = null;
        RuntimeException decompiledCaughtException = null;
        int var2_int = 0;
        RuntimeException var2 = null;
        int var3 = 0;
        var3 = OrbDefence.field_D ? 1 : 0;
        try {
          L0: {
            L1: {
              sd.field_g = sd.field_g + 1;
              if (kf.field_e != -1) {
                break L1;
              } else {
                if ((lm.field_a ^ -1) != 0) {
                  break L1;
                } else {
                  kf.field_e = ua.field_a;
                  lm.field_a = vl.field_d;
                  break L1;
                }
              }
            }
            L2: {
              L3: {
                if (param1 != null) {
                  if (!param1.equals(ce.field_c)) {
                    break L3;
                  } else {
                    break L2;
                  }
                } else {
                  if (ce.field_c != null) {
                    break L2;
                  } else {
                    break L3;
                  }
                }
              }
              L4: {
                if (!bm.field_e) {
                  if (sd.field_g >= gk.field_b) {
                    if (gk.field_b + df.field_i > sd.field_g) {
                      stackIn_17_0 = 1;
                      break L4;
                    } else {
                      stackIn_17_0 = 0;
                      break L4;
                    }
                  } else {
                    stackIn_17_0 = 0;
                    break L4;
                  }
                } else {
                  stackIn_17_0 = 0;
                  break L4;
                }
              }
              L5: {
                var2_int = stackIn_17_0;
                if (param1 == null) {
                  sd.field_g = 0;
                  break L5;
                } else {
                  L6: {
                    if (bm.field_e) {
                      break L6;
                    } else {
                      if (var2_int == 0) {
                        sd.field_g = 0;
                        break L5;
                      } else {
                        break L6;
                      }
                    }
                  }
                  sd.field_g = gk.field_b;
                  if (var3 == 0) {
                    break L5;
                  } else {
                    sd.field_g = 0;
                    break L5;
                  }
                }
              }
              L7: {
                L8: {
                  uk.field_c = kf.field_e;
                  if (param1 == null) {
                    break L8;
                  } else {
                    bm.field_e = false;
                    if (var3 == 0) {
                      break L7;
                    } else {
                      break L8;
                    }
                  }
                }
                if (var2_int == 0) {
                  break L7;
                } else {
                  bm.field_e = true;
                  break L7;
                }
              }
              sl.field_ab = lm.field_a;
              break L2;
            }
            L9: {
              if (bm.field_e) {
                break L9;
              } else {
                if (gk.field_b <= sd.field_g) {
                  break L9;
                } else {
                  if (!kd.field_d) {
                    break L9;
                  } else {
                    sd.field_g = 0;
                    sl.field_ab = lm.field_a;
                    uk.field_c = kf.field_e;
                    break L9;
                  }
                }
              }
            }
            L10: {
              ce.field_c = param1;
              lm.field_a = -1;
              kf.field_e = -1;
              if (!bm.field_e) {
                break L10;
              } else {
                if (jf.field_H != sd.field_g) {
                  break L10;
                } else {
                  sd.field_g = 0;
                  bm.field_e = false;
                  break L10;
                }
              }
            }
            if (param0 > 53) {
              break L0;
            } else {
              field_u = -91;
              return;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L11: {
            var2 = decompiledCaughtException;
            stackIn_44_0 = (RuntimeException) (var2);

            stackIn_44_1 = new StringBuilder().append("fg.AA(").append(param0).append(',');

            if (param1 == null) {
              stackIn_45_0 = (RuntimeException) ((Object) stackIn_44_0);
              stackIn_45_1 = (StringBuilder) ((Object) stackIn_44_1);
              stackIn_45_2 = "null";
              break L11;
            } else {
              stackIn_45_0 = (RuntimeException) ((Object) stackIn_44_0);
              stackIn_45_1 = (StringBuilder) ((Object) stackIn_44_1);
              stackIn_45_2 = "{...}";
              break L11;
            }
          }
          throw dd.a((Throwable) ((Object) stackIn_45_0), stackIn_45_2 + ')');
        }
    }

    final static void a(byte param0, boolean param1) {
        t.a(param1, true, true);
        if (param0 < 58) {
            field_u = -67;
        }
    }

    final static void b(byte param0) {
        int var1_int = 0;
        RuntimeException var1 = null;
        int var2 = 0;
        int var3 = 0;
        int var4 = 0;
        int decompiledRegionSelector0 = 0;
        int statePc = 0;
        Throwable caughtException = null;
        stateLoop: while (true) {
            switch (statePc) {
                case 0: {
                    var4 = OrbDefence.field_D ? 1 : 0;
                    statePc = 1;
                    continue stateLoop;
                }
                case 1: {
                    try {
                        var1_int = vf.field_a[0];
                        if (param0 == 88) {
                            statePc = 3;
                        } else {
                            statePc = 2;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_1) {
                        caughtException = stateCaught_1;
                        statePc = 10;
                        continue stateLoop;
                    }
                }
                case 2: {
                    return;
                }
                case 3: {
                    try {
                        var2 = 1;
                        statePc = 4;
                        continue stateLoop;
                    } catch (Throwable stateCaught_3) {
                        caughtException = stateCaught_3;
                        statePc = 10;
                        continue stateLoop;
                    }
                }
                case 4: {
                    try {
                        if (vf.field_a.length <= var2) {
                            statePc = 11;
                        } else {
                            statePc = 5;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_4) {
                        caughtException = stateCaught_4;
                        statePc = 10;
                        continue stateLoop;
                    }
                }
                case 5: {
                    try {
                        var3 = vf.field_a[var2];
                        mk.a(dm.field_g, var2 << 342465508, dm.field_g, var1_int, var3);
                        var1_int = var1_int + var3;
                        var2++;
                        if (var4 == 0) {
                            statePc = 7;
                        } else {
                            statePc = 6;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_5) {
                        caughtException = stateCaught_5;
                        statePc = 10;
                        continue stateLoop;
                    }
                }
                case 6: {
                    try {
                        return;
                    } catch (Throwable stateCaught_6) {
                        caughtException = stateCaught_6;
                        statePc = 10;
                        continue stateLoop;
                    }
                }
                case 7: {
                    try {
                        if (var4 == 0) {
                            statePc = 4;
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
                        return;
                    } catch (Throwable stateCaught_8) {
                        caughtException = stateCaught_8;
                        statePc = 10;
                        continue stateLoop;
                    }
                }
                case 10: {
                    var1 = (RuntimeException) ((Object) caughtException);
                    throw dd.a((Throwable) ((Object) var1), "fg.DA(" + param0 + ')');
                }
                case 11: {
                    return;
                }
                default: throw new IllegalStateException("invalid CFG state " + statePc);
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
        field_u = 0;
    }
}
