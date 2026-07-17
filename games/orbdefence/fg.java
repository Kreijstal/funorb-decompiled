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
            throw dd.a((Throwable) (Object) runtimeException, "fg.A(" + param0 + 44 + param1 + 44 + (param2 != null ? "{...}" : "null") + 44 + param3 + 44 + param4 + 41);
        }
    }

    final static boolean a(boolean param0, int param1) {
        try {
            IOException var2 = null;
            se var4 = null;
            se var5 = null;
            int stackIn_13_0 = 0;
            Throwable decompiledCaughtException = null;
            int stackOut_12_0 = 0;
            int stackOut_11_0 = 0;
            L0: {
              if (null != ia.field_f) {
                break L0;
              } else {
                ia.field_f = ef.field_i.a(eg.field_v, 0, jl.field_e);
                break L0;
              }
            }
            if (ia.field_f.field_a == 0) {
              return false;
            } else {
              long dupTemp$1 = ji.b(-85);
              p.field_a = dupTemp$1;
              of.field_L = dupTemp$1;
              if (ia.field_f.field_a == 1) {
                try {
                  L1: {
                    L2: {
                      p.field_d = new cb((java.net.Socket) ia.field_f.field_g, ef.field_i);
                      var4 = cd.field_t;
                      var5 = var4;
                      uk.field_b.field_i = 0;
                      if (param0) {
                        stackOut_12_0 = -2;
                        stackIn_13_0 = stackOut_12_0;
                        break L2;
                      } else {
                        stackOut_11_0 = -1;
                        stackIn_13_0 = stackOut_11_0;
                        break L2;
                      }
                    }
                    lh.field_c = stackIn_13_0;
                    fe.field_b = stackIn_13_0;
                    ce.field_d = stackIn_13_0;
                    dh.field_bb = sk.field_E;
                    var5.field_i = 0;
                    nl.a(20994, gi.field_a, ti.field_eb, (mg) (Object) uk.field_b, dk.field_a);
                    bh.a(-1, -1);
                    break L1;
                  }
                } catch (java.io.IOException decompiledCaughtParameter0) {
                  decompiledCaughtException = decompiledCaughtParameter0;
                  var2 = (IOException) (Object) decompiledCaughtException;
                  dh.field_bb = ug.field_p;
                  if (param1 > -14) {
                    return true;
                  } else {
                    ia.field_f = null;
                    return true;
                  }
                }
                if (param1 > -14) {
                  return true;
                } else {
                  ia.field_f = null;
                  return true;
                }
              } else {
                dh.field_bb = ug.field_p;
                if (param1 > -14) {
                  return true;
                } else {
                  ia.field_f = null;
                  return true;
                }
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
            wf.field_b.a((di) (Object) vb.field_f);
            ml.field_c = param6;
            ml.field_c.b(ij.field_g, 106);
            if (!param5) {
                field_u = -24;
            }
            cd.field_w.a((di) (Object) ml.field_c);
        } catch (RuntimeException runtimeException) {
            throw dd.a((Throwable) (Object) runtimeException, "fg.BA(" + param0 + 44 + param1 + 44 + param2 + 44 + (param3 != null ? "{...}" : "null") + 44 + (param4 != null ? "{...}" : "null") + 44 + param5 + 44 + (param6 != null ? "{...}" : "null") + 44 + param7 + 41);
        }
    }

    final static void a(byte param0, java.awt.Component param1) {
        RuntimeException runtimeException = null;
        Object var3 = null;
        RuntimeException stackIn_4_0 = null;
        StringBuilder stackIn_4_1 = null;
        RuntimeException stackIn_5_0 = null;
        StringBuilder stackIn_5_1 = null;
        RuntimeException stackIn_6_0 = null;
        StringBuilder stackIn_6_1 = null;
        String stackIn_6_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException stackOut_3_0 = null;
        StringBuilder stackOut_3_1 = null;
        RuntimeException stackOut_5_0 = null;
        StringBuilder stackOut_5_1 = null;
        String stackOut_5_2 = null;
        RuntimeException stackOut_4_0 = null;
        StringBuilder stackOut_4_1 = null;
        String stackOut_4_2 = null;
        try {
          L0: {
            L1: {
              param1.removeKeyListener((java.awt.event.KeyListener) (Object) ad.field_b);
              param1.removeFocusListener((java.awt.event.FocusListener) (Object) ad.field_b);
              wg.field_p = -1;
              if (param0 == 51) {
                break L1;
              } else {
                var3 = null;
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
            stackOut_3_0 = (RuntimeException) runtimeException;
            stackOut_3_1 = new StringBuilder().append("fg.W(").append(param0).append(44);
            stackIn_5_0 = stackOut_3_0;
            stackIn_5_1 = stackOut_3_1;
            stackIn_4_0 = stackOut_3_0;
            stackIn_4_1 = stackOut_3_1;
            if (param1 == null) {
              stackOut_5_0 = (RuntimeException) (Object) stackIn_5_0;
              stackOut_5_1 = (StringBuilder) (Object) stackIn_5_1;
              stackOut_5_2 = "null";
              stackIn_6_0 = stackOut_5_0;
              stackIn_6_1 = stackOut_5_1;
              stackIn_6_2 = stackOut_5_2;
              break L2;
            } else {
              stackOut_4_0 = (RuntimeException) (Object) stackIn_4_0;
              stackOut_4_1 = (StringBuilder) (Object) stackIn_4_1;
              stackOut_4_2 = "{...}";
              stackIn_6_0 = stackOut_4_0;
              stackIn_6_1 = stackOut_4_1;
              stackIn_6_2 = stackOut_4_2;
              break L2;
            }
          }
          throw dd.a((Throwable) (Object) stackIn_6_0, stackIn_6_2 + 41);
        }
    }

    final static void a(int param0, String param1) {
        RuntimeException var2 = null;
        int var2_int = 0;
        int var3 = 0;
        int stackIn_17_0 = 0;
        RuntimeException stackIn_41_0 = null;
        StringBuilder stackIn_41_1 = null;
        RuntimeException stackIn_42_0 = null;
        StringBuilder stackIn_42_1 = null;
        RuntimeException stackIn_43_0 = null;
        StringBuilder stackIn_43_1 = null;
        String stackIn_43_2 = null;
        RuntimeException decompiledCaughtException = null;
        int stackOut_15_0 = 0;
        int stackOut_14_0 = 0;
        int stackOut_12_0 = 0;
        int stackOut_10_0 = 0;
        RuntimeException stackOut_40_0 = null;
        StringBuilder stackOut_40_1 = null;
        RuntimeException stackOut_42_0 = null;
        StringBuilder stackOut_42_1 = null;
        String stackOut_42_2 = null;
        RuntimeException stackOut_41_0 = null;
        StringBuilder stackOut_41_1 = null;
        String stackOut_41_2 = null;
        var3 = OrbDefence.field_D ? 1 : 0;
        try {
          L0: {
            L1: {
              sd.field_g = sd.field_g + 1;
              if (kf.field_e != -1) {
                break L1;
              } else {
                if (lm.field_a != -1) {
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
                  if (!param1.equals((Object) (Object) ce.field_c)) {
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
                      stackOut_15_0 = 1;
                      stackIn_17_0 = stackOut_15_0;
                      break L4;
                    } else {
                      stackOut_14_0 = 0;
                      stackIn_17_0 = stackOut_14_0;
                      break L4;
                    }
                  } else {
                    stackOut_12_0 = 0;
                    stackIn_17_0 = stackOut_12_0;
                    break L4;
                  }
                } else {
                  stackOut_10_0 = 0;
                  stackIn_17_0 = stackOut_10_0;
                  break L4;
                }
              }
              L5: {
                var2_int = stackIn_17_0;
                if (param1 == null) {
                  sd.field_g = 0;
                  break L5;
                } else {
                  if (bm.field_e) {
                    sd.field_g = gk.field_b;
                    break L5;
                  } else {
                    if (var2_int == 0) {
                      sd.field_g = 0;
                      break L5;
                    } else {
                      sd.field_g = gk.field_b;
                      break L5;
                    }
                  }
                }
              }
              L6: {
                uk.field_c = kf.field_e;
                if (param1 == null) {
                  if (var2_int == 0) {
                    break L6;
                  } else {
                    bm.field_e = true;
                    break L6;
                  }
                } else {
                  bm.field_e = false;
                  break L6;
                }
              }
              sl.field_ab = lm.field_a;
              break L2;
            }
            L7: {
              if (bm.field_e) {
                break L7;
              } else {
                if (gk.field_b <= sd.field_g) {
                  break L7;
                } else {
                  if (!kd.field_d) {
                    break L7;
                  } else {
                    sd.field_g = 0;
                    sl.field_ab = lm.field_a;
                    uk.field_c = kf.field_e;
                    break L7;
                  }
                }
              }
            }
            L8: {
              ce.field_c = param1;
              lm.field_a = -1;
              kf.field_e = -1;
              if (!bm.field_e) {
                break L8;
              } else {
                if (jf.field_H != sd.field_g) {
                  break L8;
                } else {
                  sd.field_g = 0;
                  bm.field_e = false;
                  break L8;
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
          L9: {
            var2 = decompiledCaughtException;
            stackOut_40_0 = (RuntimeException) var2;
            stackOut_40_1 = new StringBuilder().append("fg.AA(").append(param0).append(44);
            stackIn_42_0 = stackOut_40_0;
            stackIn_42_1 = stackOut_40_1;
            stackIn_41_0 = stackOut_40_0;
            stackIn_41_1 = stackOut_40_1;
            if (param1 == null) {
              stackOut_42_0 = (RuntimeException) (Object) stackIn_42_0;
              stackOut_42_1 = (StringBuilder) (Object) stackIn_42_1;
              stackOut_42_2 = "null";
              stackIn_43_0 = stackOut_42_0;
              stackIn_43_1 = stackOut_42_1;
              stackIn_43_2 = stackOut_42_2;
              break L9;
            } else {
              stackOut_41_0 = (RuntimeException) (Object) stackIn_41_0;
              stackOut_41_1 = (StringBuilder) (Object) stackIn_41_1;
              stackOut_41_2 = "{...}";
              stackIn_43_0 = stackOut_41_0;
              stackIn_43_1 = stackOut_41_1;
              stackIn_43_2 = stackOut_41_2;
              break L9;
            }
          }
          throw dd.a((Throwable) (Object) stackIn_43_0, stackIn_43_2 + 41);
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
        RuntimeException decompiledCaughtException = null;
        var4 = OrbDefence.field_D ? 1 : 0;
        try {
          L0: {
            var1_int = vf.field_a[0];
            var2 = 1;
            L1: while (true) {
              if (vf.field_a.length <= var2) {
                break L0;
              } else {
                var3 = vf.field_a[var2];
                mk.a(dm.field_g, var2 << 4, dm.field_g, var1_int, var3);
                var1_int = var1_int + var3;
                var2++;
                continue L1;
              }
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var1 = decompiledCaughtException;
          throw dd.a((Throwable) (Object) var1, "fg.DA(" + 88 + 41);
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
