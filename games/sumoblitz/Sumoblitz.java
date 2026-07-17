/*
 * Decompiled by CFR-JS 0.4.0.
 */
import java.util.*;

public final class Sumoblitz extends fn {
    static int[] field_G;
    static hr[] field_J;
    private boolean field_F;
    static int field_H;
    static int field_I;
    private wb field_K;
    public static boolean field_L;

    final static void a(String[] args, int param1, int param2, String param3) {
        RuntimeException var4 = null;
        int var5 = 0;
        int stackIn_20_0 = 0;
        RuntimeException stackIn_26_0 = null;
        StringBuilder stackIn_26_1 = null;
        RuntimeException stackIn_28_0 = null;
        StringBuilder stackIn_28_1 = null;
        RuntimeException stackIn_29_0 = null;
        StringBuilder stackIn_29_1 = null;
        String stackIn_29_2 = null;
        RuntimeException stackIn_30_0 = null;
        StringBuilder stackIn_30_1 = null;
        RuntimeException stackIn_32_0 = null;
        StringBuilder stackIn_32_1 = null;
        RuntimeException stackIn_33_0 = null;
        StringBuilder stackIn_33_1 = null;
        String stackIn_33_2 = null;
        RuntimeException decompiledCaughtException = null;
        int stackOut_19_0 = 0;
        int stackOut_17_0 = 0;
        RuntimeException stackOut_25_0 = null;
        StringBuilder stackOut_25_1 = null;
        RuntimeException stackOut_28_0 = null;
        StringBuilder stackOut_28_1 = null;
        String stackOut_28_2 = null;
        RuntimeException stackOut_26_0 = null;
        StringBuilder stackOut_26_1 = null;
        String stackOut_26_2 = null;
        RuntimeException stackOut_29_0 = null;
        StringBuilder stackOut_29_1 = null;
        RuntimeException stackOut_32_0 = null;
        StringBuilder stackOut_32_1 = null;
        String stackOut_32_2 = null;
        RuntimeException stackOut_30_0 = null;
        StringBuilder stackOut_30_1 = null;
        String stackOut_30_2 = null;
        var5 = field_L ? 1 : 0;
        try {
          L0: {
            L1: {
              L2: {
                nw.field_e = st.field_z;
                if (255 == param2) {
                  break L2;
                } else {
                  L3: {
                    if (param2 < 100) {
                      break L3;
                    } else {
                      if (param2 > 105) {
                        break L3;
                      } else {
                        eg.field_l = qr.a(args, 8192);
                        if (var5 == 0) {
                          break L1;
                        } else {
                          break L3;
                        }
                      }
                    }
                  }
                  eg.field_l = au.a(40, param3, param2);
                  if (var5 == 0) {
                    break L1;
                  } else {
                    break L2;
                  }
                }
              }
              L4: {
                if (13 <= lq.field_d) {
                  stackOut_19_0 = 0;
                  stackIn_20_0 = stackOut_19_0;
                  break L4;
                } else {
                  stackOut_17_0 = 1;
                  stackIn_20_0 = stackOut_17_0;
                  break L4;
                }
              }
              eg.field_l = bq.a(stackIn_20_0 != 0, 8192);
              break L1;
            }
            L5: {
              if (param1 == 13) {
                break L5;
              } else {
                field_H = -63;
                break L5;
              }
            }
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L6: {
            var4 = decompiledCaughtException;
            stackOut_25_0 = (RuntimeException) var4;
            stackOut_25_1 = new StringBuilder().append("Sumoblitz.SA(");
            stackIn_28_0 = stackOut_25_0;
            stackIn_28_1 = stackOut_25_1;
            stackIn_26_0 = stackOut_25_0;
            stackIn_26_1 = stackOut_25_1;
            if (args == null) {
              stackOut_28_0 = (RuntimeException) (Object) stackIn_28_0;
              stackOut_28_1 = (StringBuilder) (Object) stackIn_28_1;
              stackOut_28_2 = "null";
              stackIn_29_0 = stackOut_28_0;
              stackIn_29_1 = stackOut_28_1;
              stackIn_29_2 = stackOut_28_2;
              break L6;
            } else {
              stackOut_26_0 = (RuntimeException) (Object) stackIn_26_0;
              stackOut_26_1 = (StringBuilder) (Object) stackIn_26_1;
              stackOut_26_2 = "{...}";
              stackIn_29_0 = stackOut_26_0;
              stackIn_29_1 = stackOut_26_1;
              stackIn_29_2 = stackOut_26_2;
              break L6;
            }
          }
          L7: {
            stackOut_29_0 = (RuntimeException) (Object) stackIn_29_0;
            stackOut_29_1 = ((StringBuilder) (Object) stackIn_29_1).append(stackIn_29_2).append(44).append(param1).append(44).append(param2).append(44);
            stackIn_32_0 = stackOut_29_0;
            stackIn_32_1 = stackOut_29_1;
            stackIn_30_0 = stackOut_29_0;
            stackIn_30_1 = stackOut_29_1;
            if (param3 == null) {
              stackOut_32_0 = (RuntimeException) (Object) stackIn_32_0;
              stackOut_32_1 = (StringBuilder) (Object) stackIn_32_1;
              stackOut_32_2 = "null";
              stackIn_33_0 = stackOut_32_0;
              stackIn_33_1 = stackOut_32_1;
              stackIn_33_2 = stackOut_32_2;
              break L7;
            } else {
              stackOut_30_0 = (RuntimeException) (Object) stackIn_30_0;
              stackOut_30_1 = (StringBuilder) (Object) stackIn_30_1;
              stackOut_30_2 = "{...}";
              stackIn_33_0 = stackOut_30_0;
              stackIn_33_1 = stackOut_30_1;
              stackIn_33_2 = stackOut_30_2;
              break L7;
            }
          }
          throw qo.a((Throwable) (Object) stackIn_33_0, stackIn_33_2 + 41);
        }
    }

    final void g(int param0) {
        RuntimeException var2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          L0: {
            L1: {
              if (param0 == -15254) {
                break L1;
              } else {
                this.r(36);
                break L1;
              }
            }
            L2: {
              oi.a(-27864);
              if (gk.field_o == null) {
                break L2;
              } else {
                b.c((byte) 81);
                break L2;
              }
            }
            gt.m(0);
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2 = decompiledCaughtException;
          throw qo.a((Throwable) (Object) var2, "Sumoblitz.L(" + param0 + 41);
        }
    }

    private final void g(byte param0) {
        RuntimeException var2 = null;
        int var2_int = 0;
        int var3 = 0;
        qu stackIn_54_0 = null;
        qu stackIn_56_0 = null;
        qu stackIn_58_0 = null;
        qu stackIn_59_0 = null;
        int stackIn_59_1 = 0;
        RuntimeException decompiledCaughtException = null;
        qu stackOut_53_0 = null;
        qu stackOut_58_0 = null;
        int stackOut_58_1 = 0;
        qu stackOut_54_0 = null;
        qu stackOut_56_0 = null;
        int stackOut_56_1 = 0;
        var3 = field_L ? 1 : 0;
        try {
          L0: {
            L1: {
              if (2 > ku.field_j) {
                break L1;
              } else {
                if (!hw.field_b[41]) {
                  break L1;
                } else {
                  f.field_w = true;
                  kh.field_e = 16777215;
                  break L1;
                }
              }
            }
            L2: {
              var2_int = -73 / ((8 - param0) / 40);
              if (null == pl.field_v.b(-98)) {
                break L2;
              } else {
                int fieldTemp$2 = qn.field_g + 1;
                qn.field_g = qn.field_g + 1;
                if (fieldTemp$2 != 256) {
                  break L2;
                } else {
                  qn.field_g = 0;
                  ms discarded$3 = pl.field_v.c(9);
                  break L2;
                }
              }
            }
            L3: {
              L4: {
                if (0 == ra.field_e) {
                  break L4;
                } else {
                  L5: {
                    if (ra.field_e != 1) {
                      break L5;
                    } else {
                      eh.field_a = eh.field_a + 1;
                      if (eh.field_a == 30) {
                        L6: {
                          L7: {
                            if (so.a((byte) -58)) {
                              break L7;
                            } else {
                              bf.a(0);
                              if (var3 == 0) {
                                break L6;
                              } else {
                                break L7;
                              }
                            }
                          }
                          wn.a(true);
                          break L6;
                        }
                        ra.field_e = 2;
                        if (var3 == 0) {
                          break L3;
                        } else {
                          break L5;
                        }
                      } else {
                        break L3;
                      }
                    }
                  }
                  L8: {
                    if (2 != ra.field_e) {
                      break L8;
                    } else {
                      L9: {
                        L10: {
                          if (!vs.b((byte) 9)) {
                            break L10;
                          } else {
                            nj.field_b = qw.field_b;
                            if (var3 == 0) {
                              break L9;
                            } else {
                              break L10;
                            }
                          }
                        }
                        L11: {
                          nq.field_g = ew.a((byte) 113, 4);
                          if (ph.field_b == null) {
                            break L11;
                          } else {
                            ph.field_b.e(-119);
                            break L11;
                          }
                        }
                        nj.field_b = ro.field_d;
                        if (-2 != nj.field_b) {
                          break L9;
                        } else {
                          nj.field_b = 0;
                          vb.a((byte) 122, false);
                          break L9;
                        }
                      }
                      ra.field_e = 3;
                      rc.field_k = nj.field_b;
                      eh.field_a = 29;
                      if (var3 == 0) {
                        break L3;
                      } else {
                        break L8;
                      }
                    }
                  }
                  eh.field_a = eh.field_a - 1;
                  if (eh.field_a != 0) {
                    break L3;
                  } else {
                    ra.field_e = 0;
                    if (var3 == 0) {
                      break L3;
                    } else {
                      break L4;
                    }
                  }
                }
              }
              L12: {
                stackOut_53_0 = ph.field_b;
                stackIn_58_0 = stackOut_53_0;
                stackIn_54_0 = stackOut_53_0;
                if (-1 != nj.field_b) {
                  stackOut_58_0 = (qu) (Object) stackIn_58_0;
                  stackOut_58_1 = 0;
                  stackIn_59_0 = stackOut_58_0;
                  stackIn_59_1 = stackOut_58_1;
                  break L12;
                } else {
                  stackOut_54_0 = (qu) (Object) stackIn_54_0;
                  stackIn_56_0 = stackOut_54_0;
                  stackOut_56_0 = (qu) (Object) stackIn_56_0;
                  stackOut_56_1 = 1;
                  stackIn_59_0 = stackOut_56_0;
                  stackIn_59_1 = stackOut_56_1;
                  break L12;
                }
              }
              L13: {
                ((qu) (Object) stackIn_59_0).a(stackIn_59_1 != 0, (byte) -88);
                if (~rc.field_k == ~nj.field_b) {
                  break L13;
                } else {
                  eh.field_a = eh.field_a + 1;
                  if (eh.field_a == 30) {
                    L14: {
                      if (nj.field_b == 2) {
                        mr.field_f = null;
                        break L14;
                      } else {
                        break L14;
                      }
                    }
                    eh.field_a = 0;
                    nj.field_b = rc.field_k;
                    if (var3 == 0) {
                      break L3;
                    } else {
                      break L13;
                    }
                  } else {
                    break L3;
                  }
                }
              }
              if (nj.field_b != -1) {
                iv.field_g[nj.field_b].b(-18556);
                break L3;
              } else {
                break L3;
              }
            }
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2 = decompiledCaughtException;
          throw qo.a((Throwable) (Object) var2, "Sumoblitz.TA(" + param0 + 41);
        }
    }

    final void f(int param0) {
        bs var2 = null;
        RuntimeException var2_ref = null;
        ud var3 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          L0: {
            L1: {
              if (param0 == 28196) {
                break L1;
              } else {
                Sumoblitz.a(59, -122, (byte) 42);
                break L1;
              }
            }
            ((Sumoblitz) this).a(100, 3, 1, 10, 2, 0, true);
            var2 = new bs();
            var2.a(177, 128, 9);
            var3 = new ud(var2, new bs());
            aa.a(lt.field_m, true, var3, (byte) -125, 48000, (java.awt.Component) (Object) qn.field_f);
            dt.field_f = false;
            qc.field_e = var2;
            ((Sumoblitz) this).a(true, true, (byte) 60, true, false);
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2_ref = decompiledCaughtException;
          throw qo.a((Throwable) (Object) var2_ref, "Sumoblitz.C(" + param0 + 41);
        }
    }

    final void d(int param0) {
        try {
            RuntimeException var2 = null;
            java.awt.Canvas var2_ref = null;
            ha var3 = null;
            int var4_int = 0;
            ge var4 = null;
            Exception var5 = null;
            int var5_int = 0;
            int var6 = 0;
            int var7 = 0;
            String var8_ref_String = null;
            int var8 = 0;
            pm var9 = null;
            int var10 = 0;
            int stackIn_50_0 = 0;
            Throwable decompiledCaughtException = null;
            int stackOut_49_0 = 0;
            boolean stackOut_47_0 = false;
            var10 = field_L ? 1 : 0;
            try {
              L0: {
                var2_ref = hk.b(-97);
                lk.b();
                if (in.g(param0 ^ -99)) {
                  ad.a((byte) 122, var2_ref, np.a(param0 ^ 7));
                  return;
                } else {
                  if (sa.field_j) {
                    if (su.a(param0)) {
                      L1: {
                        if (!nq.field_h.a(false)) {
                          break L1;
                        } else {
                          if (!this.h((byte) -124)) {
                            return;
                          } else {
                            break L1;
                          }
                        }
                      }
                      L2: {
                        L3: {
                          var3 = nq.field_h.a(-115);
                          var3.GA(0);
                          ph.field_b.a(param0 ^ 120, var3, false);
                          if (rc.field_k != nj.field_b) {
                            break L3;
                          } else {
                            if (-1 == nj.field_b) {
                              break L2;
                            } else {
                              iv.field_g[nj.field_b].a(255, var3, -2355);
                              if (var10 == 0) {
                                break L2;
                              } else {
                                break L3;
                              }
                            }
                          }
                        }
                        L4: {
                          var4_int = 255 * eh.field_a / 30;
                          if (-1 == nj.field_b) {
                            break L4;
                          } else {
                            iv.field_g[nj.field_b].a(-var4_int + 255, var3, -2355);
                            break L4;
                          }
                        }
                        if (-1 != rc.field_k) {
                          iv.field_g[rc.field_k].a(var4_int, var3, -2355);
                          break L2;
                        } else {
                          break L2;
                        }
                      }
                      L5: {
                        if (!so.a((byte) 103)) {
                          break L5;
                        } else {
                          lk.a(0, 0, lk.field_b, lk.field_c);
                          pn.d((byte) -7);
                          break L5;
                        }
                      }
                      L6: {
                        if (param0 == ra.field_e) {
                          break L6;
                        } else {
                          var4_int = 256 * eh.field_a / 30;
                          if (var4_int <= 0) {
                            break L6;
                          } else {
                            lk.b(0, 0, lk.field_b, lk.field_c, 0, var4_int);
                            break L6;
                          }
                        }
                      }
                      L7: {
                        if (!sj.a(param0 + -85)) {
                          break L7;
                        } else {
                          if (so.a((byte) -75)) {
                            break L7;
                          } else {
                            L8: {
                              if (gk.field_o != null) {
                                stackOut_49_0 = 1;
                                stackIn_50_0 = stackOut_49_0;
                                break L8;
                              } else {
                                stackOut_47_0 = ii.field_a;
                                stackIn_50_0 = stackOut_47_0 ? 1 : 0;
                                break L8;
                              }
                            }
                            kn.a(stackIn_50_0 != 0, 25);
                            break L7;
                          }
                        }
                      }
                      L9: {
                        if (ku.field_j < 2) {
                          break L9;
                        } else {
                          if (!gw.field_v) {
                            break L9;
                          } else {
                            bq.field_c.a(20, 20, 16777215, Integer.toString(aj.field_B), (byte) -81, 1);
                            break L9;
                          }
                        }
                      }
                      L10: {
                        var4 = (ge) (Object) pl.field_v.b(param0 + -121);
                        if (null != var4) {
                          L11: {
                            L12: {
                              var6 = qn.field_g;
                              if (var6 < 64) {
                                break L12;
                              } else {
                                L13: {
                                  if (var6 > 192) {
                                    break L13;
                                  } else {
                                    var5_int = 255;
                                    if (var10 == 0) {
                                      break L11;
                                    } else {
                                      break L13;
                                    }
                                  }
                                }
                                var5_int = (-var6 + 192) * 255 / 64;
                                if (var10 == 0) {
                                  break L11;
                                } else {
                                  break L12;
                                }
                              }
                            }
                            var5_int = 255 * var6 / 64;
                            break L11;
                          }
                          L14: {
                            L15: {
                              var7 = 45;
                              if (var4.field_m >= 0) {
                                break L15;
                              } else {
                                var8_ref_String = aa.field_b;
                                if (var10 == 0) {
                                  break L14;
                                } else {
                                  break L15;
                                }
                              }
                            }
                            var8_ref_String = rb.field_d[var4.field_m];
                            if (qw.field_a.length > var4.field_m) {
                              var7 += 65;
                              qw.field_a[var4.field_m].a(-32 + rj.field_c - 95, 45, 64, 64, 0, 16777215 | var5_int << 24, 1);
                              break L14;
                            } else {
                              break L14;
                            }
                          }
                          int discarded$3 = bq.field_c.a(150, var5_int << 24, 0, 170, -180 + rj.field_c, (int[]) null, (hr[]) null, -1 + var7, var5_int << 24, 0, 18, -8787, var8_ref_String, (aa) null, 1, 0);
                          int discarded$4 = bq.field_c.a(150, var5_int << 24, 0, 170, -180 + rj.field_c, (int[]) null, (hr[]) null, 1 + var7, var5_int << 24, 0, 18, -8787, var8_ref_String, (aa) null, 1, 0);
                          int discarded$5 = bq.field_c.a(150, var5_int << 24 | 16777215, 0, 170, -180 + rj.field_c, (int[]) null, (hr[]) null, var7, -1, 0, 18, -8787, var8_ref_String, (aa) null, 1, 0);
                          break L10;
                        } else {
                          break L10;
                        }
                      }
                      L16: {
                        L17: {
                          if (!oj.a(false)) {
                            break L17;
                          } else {
                            var5_int = (-lk.field_b + gi.field_h) * 0 / 2;
                            var6 = 0 * (wq.field_b + -lk.field_c) / 2;
                            cf.a(var5_int, var6, 59);
                            kn.a(false, (byte) -122);
                            ((Sumoblitz) this).field_F = true;
                            if (var10 == 0) {
                              break L16;
                            } else {
                              break L17;
                            }
                          }
                        }
                        L18: {
                          if (sj.a(-44)) {
                            break L18;
                          } else {
                            if (!ws.b((byte) 52)) {
                              ((Sumoblitz) this).field_F = false;
                              if (var10 == 0) {
                                break L16;
                              } else {
                                break L18;
                              }
                            } else {
                              break L16;
                            }
                          }
                        }
                        var5_int = 0 * (-lk.field_b + gi.field_h) / 2;
                        var6 = (wq.field_b - lk.field_c) * 0 / 2;
                        ls.a(var5_int, -80, var6);
                        kn.a(false, param0 ^ 121);
                        ((Sumoblitz) this).field_F = true;
                        break L16;
                      }
                      L19: {
                        if (!((Sumoblitz) this).field_F) {
                          break L19;
                        } else {
                          L20: {
                            var5_int = lk.field_b;
                            var6 = lk.field_c;
                            if (((Sumoblitz) this).field_K != null) {
                              var6 = ((Sumoblitz) this).field_K.field_u;
                              var5_int = ((Sumoblitz) this).field_K.field_x;
                              break L20;
                            } else {
                              break L20;
                            }
                          }
                          L21: {
                            var7 = (-var5_int + gi.field_h) / 2;
                            var8 = (wq.field_b - var6) / 2;
                            if (!oj.a(false)) {
                              break L21;
                            } else {
                              if (((Sumoblitz) this).field_K != null) {
                                var7 = ik.c(param0 ^ -10517);
                                var8 = fd.b(3878);
                                break L21;
                              } else {
                                break L21;
                              }
                            }
                          }
                          var9 = wq.a(var3, (byte) 18);
                          var9.a((byte) 111, var8, var8 + var6, var7, var7 - -var5_int);
                          var7 = (-lk.field_b + gi.field_h) / 2;
                          var8 = (wq.field_b + -lk.field_c) / 2;
                          var3.SA(var7, var8, lk.field_b, lk.field_c, lk.field_a, 0, lk.field_b);
                          var9.a(param0 + 29709);
                          break L19;
                        }
                      }
                      try {
                        L22: {
                          var3.a(true);
                          break L22;
                        }
                      } catch (java.lang.Exception decompiledCaughtParameter0) {
                        decompiledCaughtException = decompiledCaughtParameter0;
                        L23: {
                          var5 = (Exception) (Object) decompiledCaughtException;
                          var5.printStackTrace();
                          break L23;
                        }
                      }
                      break L0;
                    } else {
                      pe.a(param0 ^ 20, 100.0f, fl.field_s);
                      od.a(-88, var2_ref);
                      return;
                    }
                  } else {
                    od.a(-62, var2_ref);
                    return;
                  }
                }
              }
            } catch (java.lang.RuntimeException decompiledCaughtParameter1) {
              decompiledCaughtException = decompiledCaughtParameter1;
              var2 = (RuntimeException) (Object) decompiledCaughtException;
              throw qo.a((Throwable) (Object) var2, "Sumoblitz.I(" + param0 + 41);
            }
        } catch (RuntimeException | Error decompiledUncheckedException) {
            throw decompiledUncheckedException;
        } catch (Throwable decompiledCheckedException) {
            throw new RuntimeException(decompiledCheckedException);
        }
    }

    private final void r(int param0) {
        RuntimeException var2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          L0: {
            L1: {
              if (null != vf.field_a) {
                rj.a(vf.field_a, -5);
                vf.field_a = null;
                ls.b(param0 + -21961);
                break L1;
              } else {
                break L1;
              }
            }
            L2: {
              if (param0 == 21961) {
                break L2;
              } else {
                this.g((byte) -69);
                break L2;
              }
            }
            L3: {
              jg.field_a = true;
              kf.field_v = wd.a(4, (byte) 125);
              dq.field_Z = wd.a(5, (byte) 125);
              hl.field_d = wd.a(6, (byte) 125);
              er.field_c = wd.a(7, (byte) 125);
              gg.field_r = wd.a(8, (byte) 125);
              be.field_s = wd.a(9, (byte) 125);
              ik.field_d = wd.a(12, (byte) 125);
              iv.field_b = new Random(wq.a(-52));
              if (null != nq.field_h) {
                break L3;
              } else {
                nq.field_h = new ik(11, -1, (d) null);
                break L3;
              }
            }
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2 = decompiledCaughtException;
          throw qo.a((Throwable) (Object) var2, "Sumoblitz.QA(" + param0 + 41);
        }
    }

    public static void s(int param0) {
        field_J = null;
        if (param0 != 0) {
            return;
        }
        try {
            field_G = null;
        } catch (RuntimeException runtimeException) {
            throw qo.a((Throwable) (Object) runtimeException, "Sumoblitz.UA(" + param0 + 41);
        }
    }

    final void b(int param0) {
        RuntimeException var2 = null;
        int var2_int = 0;
        hg var3_ref_hg = null;
        int var3 = 0;
        int var4 = 0;
        Object stackIn_8_0 = null;
        Object stackIn_10_0 = null;
        Object stackIn_11_0 = null;
        int stackIn_11_1 = 0;
        Object stackIn_81_0 = null;
        int stackIn_81_1 = 0;
        Object stackIn_83_0 = null;
        int stackIn_83_1 = 0;
        Object stackIn_85_0 = null;
        int stackIn_85_1 = 0;
        Object stackIn_86_0 = null;
        int stackIn_86_1 = 0;
        int stackIn_86_2 = 0;
        RuntimeException decompiledCaughtException = null;
        Object stackOut_7_0 = null;
        Object stackOut_10_0 = null;
        int stackOut_10_1 = 0;
        Object stackOut_8_0 = null;
        int stackOut_8_1 = 0;
        Object stackOut_80_0 = null;
        int stackOut_80_1 = 0;
        Object stackOut_85_0 = null;
        int stackOut_85_1 = 0;
        int stackOut_85_2 = 0;
        Object stackOut_81_0 = null;
        int stackOut_81_1 = 0;
        Object stackOut_83_0 = null;
        int stackOut_83_1 = 0;
        int stackOut_83_2 = 0;
        var4 = field_L ? 1 : 0;
        try {
          L0: {
            L1: {
              fv.e((byte) 76);
              if (gk.field_o == null) {
                break L1;
              } else {
                if (!gk.field_o.field_a) {
                  break L1;
                } else {
                  b.c((byte) 49);
                  qw.a((byte) 35);
                  break L1;
                }
              }
            }
            L2: {
              stackOut_7_0 = this;
              stackIn_10_0 = stackOut_7_0;
              stackIn_8_0 = stackOut_7_0;
              if (null == gk.field_o) {
                stackOut_10_0 = this;
                stackOut_10_1 = 0;
                stackIn_11_0 = stackOut_10_0;
                stackIn_11_1 = stackOut_10_1;
                break L2;
              } else {
                stackOut_8_0 = this;
                stackOut_8_1 = 1;
                stackIn_11_0 = stackOut_8_0;
                stackIn_11_1 = stackOut_8_1;
                break L2;
              }
            }
            L3: {
              ((Sumoblitz) this).b(stackIn_11_1 != 0, -103);
              if (ml.field_u) {
                this.r(21961);
                ml.field_u = false;
                break L3;
              } else {
                break L3;
              }
            }
            L4: {
              if (!in.g(-42)) {
                break L4;
              } else {
                ((Sumoblitz) this).m(106);
                if (in.g(-33)) {
                  L5: {
                    if (!we.g(-1)) {
                      break L5;
                    } else {
                      boolean discarded$1 = this.a(false, true);
                      break L5;
                    }
                  }
                  return;
                } else {
                  break L4;
                }
              }
            }
            L6: {
              L7: {
                if (!sa.field_j) {
                  break L7;
                } else {
                  L8: {
                    if (su.a(0)) {
                      break L8;
                    } else {
                      ou.d((byte) -112);
                      if (su.a(0)) {
                        L9: {
                          oq.a(-24233);
                          ad.c(0);
                          if (5 != nj.field_b) {
                            break L9;
                          } else {
                            if (0 != wj.field_e) {
                              break L9;
                            } else {
                              nj.field_b = 2;
                              av.a(-7753, false, 2);
                              break L9;
                            }
                          }
                        }
                        if (!so.a((byte) 119)) {
                          break L6;
                        } else {
                          vb.a((byte) -111, true);
                          if (var4 == 0) {
                            break L6;
                          } else {
                            break L8;
                          }
                        }
                      } else {
                        break L6;
                      }
                    }
                  }
                  L10: {
                    if (!so.a((byte) 107)) {
                      break L10;
                    } else {
                      L11: {
                        if (0 != ra.field_e) {
                          break L11;
                        } else {
                          L12: {
                            L13: {
                              var2_int = kt.a(-38);
                              if (2 != var2_int) {
                                break L13;
                              } else {
                                b.c((byte) 71);
                                if (var4 == 0) {
                                  break L12;
                                } else {
                                  break L13;
                                }
                              }
                            }
                            L14: {
                              if (3 != var2_int) {
                                break L14;
                              } else {
                                vb.a((byte) -21, true);
                                if (var4 == 0) {
                                  break L12;
                                } else {
                                  break L14;
                                }
                              }
                            }
                            if (var2_int == 4) {
                              wn.a(true);
                              break L12;
                            } else {
                              break L12;
                            }
                          }
                          L15: {
                            if (!so.a((byte) 109)) {
                              iv.field_g[nj.field_b].b(-8628, true);
                              break L15;
                            } else {
                              break L15;
                            }
                          }
                          if (var4 == 0) {
                            break L6;
                          } else {
                            break L11;
                          }
                        }
                      }
                      this.g((byte) 96);
                      if (var4 == 0) {
                        break L6;
                      } else {
                        break L10;
                      }
                    }
                  }
                  L16: {
                    if (sj.a(-123)) {
                      break L16;
                    } else {
                      this.g((byte) -94);
                      if (var4 == 0) {
                        break L6;
                      } else {
                        break L16;
                      }
                    }
                  }
                  L17: {
                    stackOut_80_0 = this;
                    stackOut_80_1 = -1;
                    stackIn_85_0 = stackOut_80_0;
                    stackIn_85_1 = stackOut_80_1;
                    stackIn_81_0 = stackOut_80_0;
                    stackIn_81_1 = stackOut_80_1;
                    if (gk.field_o == null) {
                      stackOut_85_0 = this;
                      stackOut_85_1 = stackIn_85_1;
                      stackOut_85_2 = 0;
                      stackIn_86_0 = stackOut_85_0;
                      stackIn_86_1 = stackOut_85_1;
                      stackIn_86_2 = stackOut_85_2;
                      break L17;
                    } else {
                      stackOut_81_0 = this;
                      stackOut_81_1 = stackIn_81_1;
                      stackIn_83_0 = stackOut_81_0;
                      stackIn_83_1 = stackOut_81_1;
                      stackOut_83_0 = this;
                      stackOut_83_1 = stackIn_83_1;
                      stackOut_83_2 = 1;
                      stackIn_86_0 = stackOut_83_0;
                      stackIn_86_1 = stackOut_83_1;
                      stackIn_86_2 = stackOut_83_2;
                      break L17;
                    }
                  }
                  L18: {
                    L19: {
                      var2_int = ((Sumoblitz) this).a(stackIn_86_1, stackIn_86_2 != 0);
                      if (1 == var2_int) {
                        break L19;
                      } else {
                        if (var2_int != 2) {
                          break L18;
                        } else {
                          break L19;
                        }
                      }
                    }
                    L20: {
                      if (null == gk.field_o) {
                        break L20;
                      } else {
                        b.c((byte) 49);
                        break L20;
                      }
                    }
                    if (2 == var2_int) {
                      jl.a(ra.c(2), false);
                      break L18;
                    } else {
                      break L18;
                    }
                  }
                  if (var4 == 0) {
                    break L6;
                  } else {
                    break L7;
                  }
                }
              }
              rg.a((byte) 55, pn.field_r);
              if (this.a(true, true)) {
                sa.field_j = true;
                break L6;
              } else {
                break L6;
              }
            }
            L21: {
              var2_int = 35 % ((37 - param0) / 61);
              if (vs.b((byte) 9)) {
                break L21;
              } else {
                L22: while (true) {
                  L23: {
                    L24: {
                      var3_ref_hg = (hg) (Object) pn.field_q.c(9);
                      if (var3_ref_hg != null) {
                        break L24;
                      } else {
                        if (var4 != 0) {
                          break L23;
                        } else {
                          if (var4 == 0) {
                            break L21;
                          } else {
                            break L24;
                          }
                        }
                      }
                    }
                    an.a(4, (byte) 30, var3_ref_hg);
                    break L23;
                  }
                  if (var4 == 0) {
                    continue L22;
                  } else {
                    break L21;
                  }
                }
              }
            }
            L25: while (true) {
              L26: {
                L27: {
                  if (!vs.a(ov.field_e, -126)) {
                    break L27;
                  } else {
                    ((Sumoblitz) this).q(9289);
                    if (var4 != 0) {
                      break L26;
                    } else {
                      if (var4 == 0) {
                        continue L25;
                      } else {
                        break L27;
                      }
                    }
                  }
                }
                gt.a(0, 0);
                break L26;
              }
              L28: {
                if (!en.a(-23517)) {
                  break L28;
                } else {
                  var3 = ((Sumoblitz) this).b(true);
                  if (var3 != 2) {
                    break L28;
                  } else {
                    we.a((byte) 70);
                    break L28;
                  }
                }
              }
              break L0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2 = decompiledCaughtException;
          throw qo.a((Throwable) (Object) var2, "Sumoblitz.D(" + param0 + 41);
        }
    }

    private final boolean h(byte param0) {
        ha var2 = null;
        RuntimeException var2_ref = null;
        int stackIn_7_0 = 0;
        int stackIn_15_0 = 0;
        RuntimeException decompiledCaughtException = null;
        int stackOut_6_0 = 0;
        int stackOut_14_0 = 0;
        try {
          L0: {
            L1: {
              if (param0 < -4) {
                break L1;
              } else {
                field_H = -36;
                break L1;
              }
            }
            var2 = nq.field_h.a(-125);
            if (var2 == null) {
              stackOut_6_0 = 0;
              stackIn_7_0 = stackOut_6_0;
              return stackIn_7_0 != 0;
            } else {
              L2: {
                L3: {
                  if (!var2.c()) {
                    break L3;
                  } else {
                    wj.field_k = false;
                    ul.field_f = 0;
                    if (!field_L) {
                      break L2;
                    } else {
                      break L3;
                    }
                  }
                }
                ul.field_f = 1;
                wj.field_k = true;
                break L2;
              }
              er.a(false);
              stackOut_14_0 = 1;
              stackIn_15_0 = stackOut_14_0;
              break L0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2_ref = decompiledCaughtException;
          throw qo.a((Throwable) (Object) var2_ref, "Sumoblitz.RA(" + param0 + 41);
        }
        return stackIn_15_0 != 0;
    }

    private final boolean a(boolean param0, boolean param1) {
        try {
            java.awt.Canvas var3 = null;
            int var3_int = 0;
            ha var4 = null;
            int var5_int = 0;
            ge var5 = null;
            int var6_int = 0;
            int var7 = 0;
            int var8 = 0;
            String var9_ref_String = null;
            int var9 = 0;
            pm var10 = null;
            int var11 = 0;
            ik stackIn_60_0 = null;
            ik stackIn_61_0 = null;
            ik stackIn_62_0 = null;
            ik stackIn_63_0 = null;
            int stackIn_63_1 = 0;
            int stackIn_90_0 = 0;
            int stackIn_173_0 = 0;
            int stackIn_195_0 = 0;
            int stackIn_256_0 = 0;
            ik stackIn_316_0 = null;
            ik stackIn_317_0 = null;
            ik stackIn_318_0 = null;
            ik stackIn_319_0 = null;
            int stackIn_319_1 = 0;
            int stackIn_348_0 = 0;
            int stackIn_430_0 = 0;
            ik stackOut_59_0 = null;
            ik stackOut_62_0 = null;
            int stackOut_62_1 = 0;
            ik stackOut_60_0 = null;
            ik stackOut_61_0 = null;
            int stackOut_61_1 = 0;
            int stackOut_89_0 = 0;
            boolean stackOut_88_0 = false;
            boolean stackOut_255_0 = false;
            int stackOut_254_0 = 0;
            ik stackOut_315_0 = null;
            ik stackOut_318_0 = null;
            int stackOut_318_1 = 0;
            ik stackOut_316_0 = null;
            ik stackOut_317_0 = null;
            int stackOut_317_1 = 0;
            int stackOut_347_0 = 0;
            boolean stackOut_346_0 = false;
            boolean stackOut_429_0 = false;
            int stackOut_428_0 = 0;
            int stackOut_172_0 = 0;
            boolean stackOut_171_0 = false;
            int stackOut_194_0 = 0;
            int stackOut_193_0 = 0;
            var11 = field_L ? 1 : 0;
            cl.e(-69);
            if (null != hl.field_d) {
              L0: {
                if (!pi.field_c.b((byte) 127)) {
                  break L0;
                } else {
                  if (pi.field_c.a("basic", 100)) {
                    if (!pi.field_c.a("arialbold14", 100)) {
                      pe.a(20, 4.0f, pt.a("arialbold14", pi.field_c, ce.field_l, true, ow.field_a));
                      return false;
                    } else {
                      L1: {
                        if (!vb.field_J.b((byte) 127)) {
                          break L1;
                        } else {
                          if (vb.field_J.a("arialbold14", 100)) {
                            if (pi.field_c.a("arial13", 100)) {
                              L2: {
                                if (!vb.field_J.b((byte) 127)) {
                                  break L2;
                                } else {
                                  if (vb.field_J.a("arial13", 100)) {
                                    L3: {
                                      if (!hl.field_d.b((byte) 127)) {
                                        break L3;
                                      } else {
                                        if (hl.field_d.a(true)) {
                                          L4: {
                                            if (!er.field_c.b((byte) 127)) {
                                              break L4;
                                            } else {
                                              if (er.field_c.a(param1)) {
                                                L5: {
                                                  if (!gg.field_r.b((byte) 127)) {
                                                    break L5;
                                                  } else {
                                                    if (gg.field_r.a(param1)) {
                                                      L6: {
                                                        if (!be.field_s.b((byte) 127)) {
                                                          break L6;
                                                        } else {
                                                          if (be.field_s.a(true)) {
                                                            L7: {
                                                              if (!kf.field_v.b((byte) 127)) {
                                                                break L7;
                                                              } else {
                                                                if (kf.field_v.a(true)) {
                                                                  L8: {
                                                                    if (!dq.field_Z.b((byte) 127)) {
                                                                      break L8;
                                                                    } else {
                                                                      if (dq.field_Z.a(true)) {
                                                                        L9: {
                                                                          if (!ik.field_d.b((byte) 127)) {
                                                                            break L9;
                                                                          } else {
                                                                            if (!ik.field_d.a(true)) {
                                                                              break L9;
                                                                            } else {
                                                                              L10: {
                                                                                L11: {
                                                                                  pe.a(20, 65.0f, hv.field_e);
                                                                                  var3 = hk.b(-22);
                                                                                  lk.b();
                                                                                  if (!in.g(-61)) {
                                                                                    break L11;
                                                                                  } else {
                                                                                    ad.a((byte) 85, var3, np.a(7));
                                                                                    if (var11 == 0) {
                                                                                      break L10;
                                                                                    } else {
                                                                                      break L11;
                                                                                    }
                                                                                  }
                                                                                }
                                                                                L12: {
                                                                                  if (sa.field_j) {
                                                                                    break L12;
                                                                                  } else {
                                                                                    od.a(-117, var3);
                                                                                    if (var11 == 0) {
                                                                                      break L10;
                                                                                    } else {
                                                                                      break L12;
                                                                                    }
                                                                                  }
                                                                                }
                                                                                L13: {
                                                                                  if (su.a(0)) {
                                                                                    break L13;
                                                                                  } else {
                                                                                    pe.a(20, 100.0f, fl.field_s);
                                                                                    od.a(-117, var3);
                                                                                    if (var11 == 0) {
                                                                                      break L10;
                                                                                    } else {
                                                                                      break L13;
                                                                                    }
                                                                                  }
                                                                                }
                                                                                L14: {
                                                                                  stackOut_59_0 = nq.field_h;
                                                                                  stackIn_62_0 = stackOut_59_0;
                                                                                  stackIn_60_0 = stackOut_59_0;
                                                                                  if (param1) {
                                                                                    stackOut_62_0 = (ik) (Object) stackIn_62_0;
                                                                                    stackOut_62_1 = 0;
                                                                                    stackIn_63_0 = stackOut_62_0;
                                                                                    stackIn_63_1 = stackOut_62_1;
                                                                                    break L14;
                                                                                  } else {
                                                                                    stackOut_60_0 = (ik) (Object) stackIn_60_0;
                                                                                    stackIn_61_0 = stackOut_60_0;
                                                                                    stackOut_61_0 = (ik) (Object) stackIn_61_0;
                                                                                    stackOut_61_1 = 1;
                                                                                    stackIn_63_0 = stackOut_61_0;
                                                                                    stackIn_63_1 = stackOut_61_1;
                                                                                    break L14;
                                                                                  }
                                                                                }
                                                                                L15: {
                                                                                  if (((ik) (Object) stackIn_63_0).a(stackIn_63_1 == 0)) {
                                                                                    break L15;
                                                                                  } else {
                                                                                    if (!this.h((byte) -105)) {
                                                                                      break L10;
                                                                                    } else {
                                                                                      break L15;
                                                                                    }
                                                                                  }
                                                                                }
                                                                                L16: {
                                                                                  L17: {
                                                                                    var4 = nq.field_h.a(-97);
                                                                                    var4.GA(0);
                                                                                    ph.field_b.a(124, var4, false);
                                                                                    if (~rc.field_k != ~nj.field_b) {
                                                                                      break L17;
                                                                                    } else {
                                                                                      if (-1 == nj.field_b) {
                                                                                        break L16;
                                                                                      } else {
                                                                                        iv.field_g[nj.field_b].a(255, var4, -2355);
                                                                                        if (var11 == 0) {
                                                                                          break L16;
                                                                                        } else {
                                                                                          break L17;
                                                                                        }
                                                                                      }
                                                                                    }
                                                                                  }
                                                                                  L18: {
                                                                                    var5_int = 255 * eh.field_a / 30;
                                                                                    if (-1 != nj.field_b) {
                                                                                      iv.field_g[nj.field_b].a(255 - var5_int, var4, -2355);
                                                                                      break L18;
                                                                                    } else {
                                                                                      break L18;
                                                                                    }
                                                                                  }
                                                                                  if (rc.field_k != -1) {
                                                                                    iv.field_g[rc.field_k].a(var5_int, var4, -2355);
                                                                                    break L16;
                                                                                  } else {
                                                                                    break L16;
                                                                                  }
                                                                                }
                                                                                L19: {
                                                                                  if (!so.a((byte) 124)) {
                                                                                    break L19;
                                                                                  } else {
                                                                                    lk.a(0, 0, lk.field_b, lk.field_c);
                                                                                    pn.d((byte) -7);
                                                                                    break L19;
                                                                                  }
                                                                                }
                                                                                L20: {
                                                                                  if (0 != ra.field_e) {
                                                                                    var5_int = eh.field_a * 256 / 30;
                                                                                    if (var5_int <= 0) {
                                                                                      break L20;
                                                                                    } else {
                                                                                      lk.b(0, 0, lk.field_b, lk.field_c, 0, var5_int);
                                                                                      break L20;
                                                                                    }
                                                                                  } else {
                                                                                    break L20;
                                                                                  }
                                                                                }
                                                                                L21: {
                                                                                  if (!sj.a(-67)) {
                                                                                    break L21;
                                                                                  } else {
                                                                                    if (!so.a((byte) 115)) {
                                                                                      L22: {
                                                                                        if (null != gk.field_o) {
                                                                                          stackOut_89_0 = 1;
                                                                                          stackIn_90_0 = stackOut_89_0;
                                                                                          break L22;
                                                                                        } else {
                                                                                          stackOut_88_0 = ii.field_a;
                                                                                          stackIn_90_0 = stackOut_88_0 ? 1 : 0;
                                                                                          break L22;
                                                                                        }
                                                                                      }
                                                                                      kn.a(stackIn_90_0 != 0, 25);
                                                                                      break L21;
                                                                                    } else {
                                                                                      break L21;
                                                                                    }
                                                                                  }
                                                                                }
                                                                                L23: {
                                                                                  if (ku.field_j < 2) {
                                                                                    break L23;
                                                                                  } else {
                                                                                    if (!gw.field_v) {
                                                                                      break L23;
                                                                                    } else {
                                                                                      bq.field_c.a(20, 20, 16777215, Integer.toString(aj.field_B), (byte) -103, 1);
                                                                                      break L23;
                                                                                    }
                                                                                  }
                                                                                }
                                                                                L24: {
                                                                                  var5 = (ge) (Object) pl.field_v.b(82);
                                                                                  if (null != var5) {
                                                                                    L25: {
                                                                                      L26: {
                                                                                        var7 = qn.field_g;
                                                                                        if (var7 >= 64) {
                                                                                          break L26;
                                                                                        } else {
                                                                                          var6_int = 255 * var7 / 64;
                                                                                          if (var11 == 0) {
                                                                                            break L25;
                                                                                          } else {
                                                                                            break L26;
                                                                                          }
                                                                                        }
                                                                                      }
                                                                                      L27: {
                                                                                        if (var7 > 192) {
                                                                                          break L27;
                                                                                        } else {
                                                                                          var6_int = 255;
                                                                                          if (var11 == 0) {
                                                                                            break L25;
                                                                                          } else {
                                                                                            break L27;
                                                                                          }
                                                                                        }
                                                                                      }
                                                                                      var6_int = (-(255 * var7) + 48960) / 64;
                                                                                      break L25;
                                                                                    }
                                                                                    L28: {
                                                                                      L29: {
                                                                                        var8 = 45;
                                                                                        if (0 > var5.field_m) {
                                                                                          break L29;
                                                                                        } else {
                                                                                          var9_ref_String = rb.field_d[var5.field_m];
                                                                                          if (~qw.field_a.length >= ~var5.field_m) {
                                                                                            break L28;
                                                                                          } else {
                                                                                            qw.field_a[var5.field_m].a(-32 + (85 + rj.field_c + -180), 45, 64, 64, 0, 16777215 | var6_int << 24, 1);
                                                                                            var8 += 65;
                                                                                            if (var11 == 0) {
                                                                                              break L28;
                                                                                            } else {
                                                                                              break L29;
                                                                                            }
                                                                                          }
                                                                                        }
                                                                                      }
                                                                                      var9_ref_String = aa.field_b;
                                                                                      break L28;
                                                                                    }
                                                                                    int discarded$17 = bq.field_c.a(150, var6_int << 24, 0, 170, rj.field_c - 180, (int[]) null, (hr[]) null, -1 + var8, var6_int << 24, 0, 18, -8787, var9_ref_String, (aa) null, 1, 0);
                                                                                    int discarded$18 = bq.field_c.a(150, var6_int << 24, 0, 170, -180 + rj.field_c, (int[]) null, (hr[]) null, 1 + var8, var6_int << 24, 0, 18, -8787, var9_ref_String, (aa) null, 1, 0);
                                                                                    int discarded$19 = bq.field_c.a(150, var6_int << 24 | 16777215, 0, 170, rj.field_c + -180, (int[]) null, (hr[]) null, var8, -1, 0, 18, -8787, var9_ref_String, (aa) null, 1, 0);
                                                                                    break L24;
                                                                                  } else {
                                                                                    break L24;
                                                                                  }
                                                                                }
                                                                                L30: {
                                                                                  L31: {
                                                                                    if (!oj.a(false)) {
                                                                                      break L31;
                                                                                    } else {
                                                                                      var6_int = (-lk.field_b + gi.field_h) * 0 / 2;
                                                                                      var7 = (-lk.field_c + wq.field_b) * 0 / 2;
                                                                                      cf.a(var6_int, var7, 76);
                                                                                      kn.a(false, (byte) -122);
                                                                                      ((Sumoblitz) this).field_F = true;
                                                                                      if (var11 == 0) {
                                                                                        break L30;
                                                                                      } else {
                                                                                        break L31;
                                                                                      }
                                                                                    }
                                                                                  }
                                                                                  L32: {
                                                                                    if (!sj.a(-126)) {
                                                                                      break L32;
                                                                                    } else {
                                                                                      var6_int = (-lk.field_b + gi.field_h) * 0 / 2;
                                                                                      var7 = (wq.field_b - lk.field_c) * 0 / 2;
                                                                                      ls.a(var6_int, -45, var7);
                                                                                      kn.a(false, -66);
                                                                                      ((Sumoblitz) this).field_F = true;
                                                                                      if (var11 == 0) {
                                                                                        break L30;
                                                                                      } else {
                                                                                        break L32;
                                                                                      }
                                                                                    }
                                                                                  }
                                                                                  if (!ws.b((byte) 52)) {
                                                                                    ((Sumoblitz) this).field_F = false;
                                                                                    break L30;
                                                                                  } else {
                                                                                    break L30;
                                                                                  }
                                                                                }
                                                                                L33: {
                                                                                  if (((Sumoblitz) this).field_F) {
                                                                                    L34: {
                                                                                      var6_int = lk.field_b;
                                                                                      var7 = lk.field_c;
                                                                                      if (((Sumoblitz) this).field_K == null) {
                                                                                        break L34;
                                                                                      } else {
                                                                                        var6_int = ((Sumoblitz) this).field_K.field_x;
                                                                                        var7 = ((Sumoblitz) this).field_K.field_u;
                                                                                        break L34;
                                                                                      }
                                                                                    }
                                                                                    L35: {
                                                                                      var8 = (-var6_int + gi.field_h) / 2;
                                                                                      var9 = (-var7 + wq.field_b) / 2;
                                                                                      if (!oj.a(false)) {
                                                                                        break L35;
                                                                                      } else {
                                                                                        if (((Sumoblitz) this).field_K == null) {
                                                                                          break L35;
                                                                                        } else {
                                                                                          var8 = ik.c(-10517);
                                                                                          var9 = fd.b(3878);
                                                                                          break L35;
                                                                                        }
                                                                                      }
                                                                                    }
                                                                                    var10 = wq.a(var4, (byte) 126);
                                                                                    var10.a((byte) 91, var9, var7 + var9, var8, var6_int + var8);
                                                                                    var9 = (-lk.field_c + wq.field_b) / 2;
                                                                                    var8 = (-lk.field_b + gi.field_h) / 2;
                                                                                    var4.SA(var8, var9, lk.field_b, lk.field_c, lk.field_a, 0, lk.field_b);
                                                                                    var10.a(29709);
                                                                                    break L33;
                                                                                  } else {
                                                                                    break L33;
                                                                                  }
                                                                                }
                                                                                var4.a(true);
                                                                                break L10;
                                                                              }
                                                                              if (!param0) {
                                                                                return false;
                                                                              } else {
                                                                                eb.field_b = new og(hl.field_d, er.field_c);
                                                                                ff.a((byte) -62, hl.field_d);
                                                                                oq.a(-24233);
                                                                                hl.field_d = null;
                                                                                ls.b(0);
                                                                                return false;
                                                                              }
                                                                            }
                                                                          }
                                                                        }
                                                                        pe.a(20, 60.0f, nw.a(nm.field_n, (byte) 85, 0, ik.field_d, b.field_f));
                                                                        return false;
                                                                      } else {
                                                                        break L8;
                                                                      }
                                                                    }
                                                                  }
                                                                  pe.a(20, 55.0f, pt.a("", dq.field_Z, ce.field_l, true, ow.field_a));
                                                                  return false;
                                                                } else {
                                                                  break L7;
                                                                }
                                                              }
                                                            }
                                                            pe.a(20, 45.0f, pt.a("", kf.field_v, m.field_V, true, es.field_j));
                                                            return false;
                                                          } else {
                                                            break L6;
                                                          }
                                                        }
                                                      }
                                                      pe.a(20, 40.0f, pt.a("", be.field_s, ve.field_l, true, gt.field_hb));
                                                      return false;
                                                    } else {
                                                      break L5;
                                                    }
                                                  }
                                                }
                                                pe.a(20, 30.0f, nw.a(jf.field_a, (byte) 85, 0, gg.field_r, sg.field_i));
                                                return false;
                                              } else {
                                                break L4;
                                              }
                                            }
                                          }
                                          pe.a(20, 20.0f, pt.a("", er.field_c, fn.field_A, true, hq.field_a));
                                          return false;
                                        } else {
                                          break L3;
                                        }
                                      }
                                    }
                                    pe.a(20, 10.0f, pt.a("", hl.field_d, fn.field_A, true, hq.field_a));
                                    return false;
                                  } else {
                                    break L2;
                                  }
                                }
                              }
                              pe.a(20, 5.0f, pt.a("arial13", vb.field_J, ce.field_l, true, ow.field_a));
                              return false;
                            } else {
                              pe.a(20, 4.0f, pt.a("arial13", pi.field_c, ce.field_l, true, ow.field_a));
                              return false;
                            }
                          } else {
                            break L1;
                          }
                        }
                      }
                      pe.a(20, 5.0f, pt.a("arialbold14", vb.field_J, ce.field_l, true, ow.field_a));
                      return false;
                    }
                  } else {
                    break L0;
                  }
                }
              }
              pe.a(20, 3.0f, pt.a("basic", pi.field_c, m.field_V, true, es.field_j));
              return false;
            } else {
              if (null == er.field_c) {
                if (null != be.field_s) {
                  L36: {
                    L37: {
                      pe.a(20, 75.0f, su.field_d);
                      var3 = hk.b(-103);
                      lk.b();
                      if (!in.g(-98)) {
                        break L37;
                      } else {
                        ad.a((byte) 95, var3, np.a(7));
                        if (var11 == 0) {
                          break L36;
                        } else {
                          break L37;
                        }
                      }
                    }
                    L38: {
                      if (sa.field_j) {
                        break L38;
                      } else {
                        od.a(-73, var3);
                        if (var11 == 0) {
                          break L36;
                        } else {
                          break L38;
                        }
                      }
                    }
                    L39: {
                      if (su.a(0)) {
                        break L39;
                      } else {
                        pe.a(20, 100.0f, fl.field_s);
                        od.a(-111, var3);
                        if (var11 == 0) {
                          break L36;
                        } else {
                          break L39;
                        }
                      }
                    }
                    L40: {
                      if (nq.field_h.a(false)) {
                        if (this.h((byte) -48)) {
                          break L40;
                        } else {
                          if (var11 == 0) {
                            break L36;
                          } else {
                            break L40;
                          }
                        }
                      } else {
                        break L40;
                      }
                    }
                    L41: {
                      L42: {
                        var4 = nq.field_h.a(-128);
                        var4.GA(0);
                        ph.field_b.a(124, var4, false);
                        if (~nj.field_b == ~rc.field_k) {
                          break L42;
                        } else {
                          L43: {
                            var5_int = 255 * eh.field_a / 30;
                            if (nj.field_b == -1) {
                              break L43;
                            } else {
                              iv.field_g[nj.field_b].a(-var5_int + 255, var4, -2355);
                              break L43;
                            }
                          }
                          L44: {
                            if (rc.field_k == -1) {
                              break L44;
                            } else {
                              iv.field_g[rc.field_k].a(var5_int, var4, -2355);
                              break L44;
                            }
                          }
                          if (var11 == 0) {
                            break L41;
                          } else {
                            break L42;
                          }
                        }
                      }
                      if (-1 == nj.field_b) {
                        break L41;
                      } else {
                        iv.field_g[nj.field_b].a(255, var4, -2355);
                        break L41;
                      }
                    }
                    L45: {
                      if (!so.a((byte) 109)) {
                        break L45;
                      } else {
                        lk.a(0, 0, lk.field_b, lk.field_c);
                        pn.d((byte) -7);
                        break L45;
                      }
                    }
                    L46: {
                      if (ra.field_e == 0) {
                        break L46;
                      } else {
                        var5_int = eh.field_a * 256 / 30;
                        if (0 < var5_int) {
                          lk.b(0, 0, lk.field_b, lk.field_c, 0, var5_int);
                          break L46;
                        } else {
                          break L46;
                        }
                      }
                    }
                    L47: {
                      if (!sj.a(-28)) {
                        break L47;
                      } else {
                        if (!so.a((byte) -55)) {
                          L48: {
                            if (gk.field_o == null) {
                              stackOut_255_0 = ii.field_a;
                              stackIn_256_0 = stackOut_255_0 ? 1 : 0;
                              break L48;
                            } else {
                              stackOut_254_0 = 1;
                              stackIn_256_0 = stackOut_254_0;
                              break L48;
                            }
                          }
                          kn.a(stackIn_256_0 != 0, -122);
                          break L47;
                        } else {
                          break L47;
                        }
                      }
                    }
                    L49: {
                      if (ku.field_j < 2) {
                        break L49;
                      } else {
                        if (gw.field_v) {
                          bq.field_c.a(20, 20, 16777215, Integer.toString(aj.field_B), (byte) -122, 1);
                          break L49;
                        } else {
                          break L49;
                        }
                      }
                    }
                    L50: {
                      var5 = (ge) (Object) pl.field_v.b(-85);
                      if (null != var5) {
                        L51: {
                          L52: {
                            var7 = qn.field_g;
                            if (64 > var7) {
                              break L52;
                            } else {
                              L53: {
                                if (var7 > 192) {
                                  break L53;
                                } else {
                                  var6_int = 255;
                                  if (var11 == 0) {
                                    break L51;
                                  } else {
                                    break L53;
                                  }
                                }
                              }
                              var6_int = (48960 - var7 * 255) / 64;
                              if (var11 == 0) {
                                break L51;
                              } else {
                                break L52;
                              }
                            }
                          }
                          var6_int = 255 * var7 / 64;
                          break L51;
                        }
                        L54: {
                          L55: {
                            var8 = 45;
                            if (var5.field_m >= 0) {
                              break L55;
                            } else {
                              var9_ref_String = aa.field_b;
                              if (var11 == 0) {
                                break L54;
                              } else {
                                break L55;
                              }
                            }
                          }
                          var9_ref_String = rb.field_d[var5.field_m];
                          if (qw.field_a.length > var5.field_m) {
                            var8 += 65;
                            qw.field_a[var5.field_m].a(rj.field_c - 127, 45, 64, 64, 0, var6_int << 24 | 16777215, 1);
                            break L54;
                          } else {
                            break L54;
                          }
                        }
                        int discarded$20 = bq.field_c.a(150, var6_int << 24, 0, 170, -180 + rj.field_c, (int[]) null, (hr[]) null, var8 + -1, var6_int << 24, 0, 18, -8787, var9_ref_String, (aa) null, 1, 0);
                        int discarded$21 = bq.field_c.a(150, var6_int << 24, 0, 170, rj.field_c + -180, (int[]) null, (hr[]) null, 1 + var8, var6_int << 24, 0, 18, -8787, var9_ref_String, (aa) null, 1, 0);
                        int discarded$22 = bq.field_c.a(150, var6_int << 24 | 16777215, 0, 170, rj.field_c - 180, (int[]) null, (hr[]) null, var8, -1, 0, 18, -8787, var9_ref_String, (aa) null, 1, 0);
                        break L50;
                      } else {
                        break L50;
                      }
                    }
                    L56: {
                      L57: {
                        if (!oj.a(false)) {
                          break L57;
                        } else {
                          var6_int = 0 * (gi.field_h - lk.field_b) / 2;
                          var7 = (wq.field_b - lk.field_c) * 0 / 2;
                          cf.a(var6_int, var7, 86);
                          kn.a(false, (byte) -122);
                          ((Sumoblitz) this).field_F = true;
                          if (var11 == 0) {
                            break L56;
                          } else {
                            break L57;
                          }
                        }
                      }
                      L58: {
                        if (sj.a(-63)) {
                          break L58;
                        } else {
                          if (ws.b((byte) 52)) {
                            break L56;
                          } else {
                            ((Sumoblitz) this).field_F = false;
                            if (var11 == 0) {
                              break L56;
                            } else {
                              break L58;
                            }
                          }
                        }
                      }
                      var6_int = 0 * (gi.field_h + -lk.field_b) / 2;
                      var7 = (wq.field_b + -lk.field_c) * 0 / 2;
                      ls.a(var6_int, -82, var7);
                      kn.a(false, -100);
                      ((Sumoblitz) this).field_F = true;
                      break L56;
                    }
                    L59: {
                      if (!((Sumoblitz) this).field_F) {
                        break L59;
                      } else {
                        L60: {
                          var6_int = lk.field_b;
                          var7 = lk.field_c;
                          if (((Sumoblitz) this).field_K == null) {
                            break L60;
                          } else {
                            var6_int = ((Sumoblitz) this).field_K.field_x;
                            var7 = ((Sumoblitz) this).field_K.field_u;
                            break L60;
                          }
                        }
                        L61: {
                          var8 = (gi.field_h + -var6_int) / 2;
                          var9 = (-var7 + wq.field_b) / 2;
                          if (!oj.a(false)) {
                            break L61;
                          } else {
                            if (((Sumoblitz) this).field_K != null) {
                              var8 = ik.c(-10517);
                              var9 = fd.b(3878);
                              break L61;
                            } else {
                              break L61;
                            }
                          }
                        }
                        var10 = wq.a(var4, (byte) 28);
                        var10.a((byte) 127, var9, var7 + var9, var8, var8 + var6_int);
                        var9 = (wq.field_b - lk.field_c) / 2;
                        var8 = (-lk.field_b + gi.field_h) / 2;
                        var4.SA(var8, var9, lk.field_b, lk.field_c, lk.field_a, 0, lk.field_b);
                        var10.a(29709);
                        break L59;
                      }
                    }
                    var4.a(true);
                    break L36;
                  }
                  au.a(-1509, be.field_s);
                  be.field_s = null;
                  ls.b(0);
                  return false;
                } else {
                  if (gg.field_r == null) {
                    if (ik.field_d != null) {
                      L62: {
                        L63: {
                          pe.a(20, 80.0f, om.field_n);
                          var3 = hk.b(125);
                          lk.b();
                          if (!in.g(-128)) {
                            break L63;
                          } else {
                            ad.a((byte) -75, var3, np.a(7));
                            if (var11 == 0) {
                              break L62;
                            } else {
                              break L63;
                            }
                          }
                        }
                        L64: {
                          if (sa.field_j) {
                            break L64;
                          } else {
                            od.a(-67, var3);
                            if (var11 == 0) {
                              break L62;
                            } else {
                              break L64;
                            }
                          }
                        }
                        L65: {
                          if (su.a(0)) {
                            break L65;
                          } else {
                            pe.a(20, 100.0f, fl.field_s);
                            od.a(-52, var3);
                            if (var11 == 0) {
                              break L62;
                            } else {
                              break L65;
                            }
                          }
                        }
                        L66: {
                          stackOut_315_0 = nq.field_h;
                          stackIn_318_0 = stackOut_315_0;
                          stackIn_316_0 = stackOut_315_0;
                          if (param1) {
                            stackOut_318_0 = (ik) (Object) stackIn_318_0;
                            stackOut_318_1 = 0;
                            stackIn_319_0 = stackOut_318_0;
                            stackIn_319_1 = stackOut_318_1;
                            break L66;
                          } else {
                            stackOut_316_0 = (ik) (Object) stackIn_316_0;
                            stackIn_317_0 = stackOut_316_0;
                            stackOut_317_0 = (ik) (Object) stackIn_317_0;
                            stackOut_317_1 = 1;
                            stackIn_319_0 = stackOut_317_0;
                            stackIn_319_1 = stackOut_317_1;
                            break L66;
                          }
                        }
                        L67: {
                          if (((ik) (Object) stackIn_319_0).a(stackIn_319_1 != 0)) {
                            if (this.h((byte) -11)) {
                              break L67;
                            } else {
                              if (var11 == 0) {
                                break L62;
                              } else {
                                break L67;
                              }
                            }
                          } else {
                            break L67;
                          }
                        }
                        L68: {
                          L69: {
                            var4 = nq.field_h.a(-120);
                            var4.GA(0);
                            ph.field_b.a(122, var4, false);
                            if (~nj.field_b == ~rc.field_k) {
                              break L69;
                            } else {
                              L70: {
                                var5_int = eh.field_a * 255 / 30;
                                if (-1 != nj.field_b) {
                                  iv.field_g[nj.field_b].a(-var5_int + 255, var4, -2355);
                                  break L70;
                                } else {
                                  break L70;
                                }
                              }
                              L71: {
                                if (rc.field_k != -1) {
                                  iv.field_g[rc.field_k].a(var5_int, var4, -2355);
                                  break L71;
                                } else {
                                  break L71;
                                }
                              }
                              if (var11 == 0) {
                                break L68;
                              } else {
                                break L69;
                              }
                            }
                          }
                          if (nj.field_b == -1) {
                            break L68;
                          } else {
                            iv.field_g[nj.field_b].a(255, var4, -2355);
                            break L68;
                          }
                        }
                        L72: {
                          if (!so.a((byte) -36)) {
                            break L72;
                          } else {
                            lk.a(0, 0, lk.field_b, lk.field_c);
                            pn.d((byte) -7);
                            break L72;
                          }
                        }
                        L73: {
                          if (ra.field_e != 0) {
                            var5_int = 256 * eh.field_a / 30;
                            if (var5_int <= 0) {
                              break L73;
                            } else {
                              lk.b(0, 0, lk.field_b, lk.field_c, 0, var5_int);
                              break L73;
                            }
                          } else {
                            break L73;
                          }
                        }
                        L74: {
                          if (!sj.a(-103)) {
                            break L74;
                          } else {
                            if (so.a((byte) 127)) {
                              break L74;
                            } else {
                              L75: {
                                if (null != gk.field_o) {
                                  stackOut_347_0 = 1;
                                  stackIn_348_0 = stackOut_347_0;
                                  break L75;
                                } else {
                                  stackOut_346_0 = ii.field_a;
                                  stackIn_348_0 = stackOut_346_0 ? 1 : 0;
                                  break L75;
                                }
                              }
                              kn.a(stackIn_348_0 != 0, 115);
                              break L74;
                            }
                          }
                        }
                        L76: {
                          if (ku.field_j < 2) {
                            break L76;
                          } else {
                            if (gw.field_v) {
                              bq.field_c.a(20, 20, 16777215, Integer.toString(aj.field_B), (byte) -61, 1);
                              break L76;
                            } else {
                              break L76;
                            }
                          }
                        }
                        L77: {
                          var5 = (ge) (Object) pl.field_v.b(110);
                          if (null != var5) {
                            L78: {
                              L79: {
                                var7 = qn.field_g;
                                if (var7 >= 64) {
                                  break L79;
                                } else {
                                  var6_int = 255 * var7 / 64;
                                  if (var11 == 0) {
                                    break L78;
                                  } else {
                                    break L79;
                                  }
                                }
                              }
                              L80: {
                                if (var7 <= 192) {
                                  break L80;
                                } else {
                                  var6_int = (192 - var7) * 255 / 64;
                                  if (var11 == 0) {
                                    break L78;
                                  } else {
                                    break L80;
                                  }
                                }
                              }
                              var6_int = 255;
                              break L78;
                            }
                            L81: {
                              L82: {
                                var8 = 45;
                                if (0 <= var5.field_m) {
                                  break L82;
                                } else {
                                  var9_ref_String = aa.field_b;
                                  if (var11 == 0) {
                                    break L81;
                                  } else {
                                    break L82;
                                  }
                                }
                              }
                              var9_ref_String = rb.field_d[var5.field_m];
                              if (qw.field_a.length > var5.field_m) {
                                var8 += 65;
                                qw.field_a[var5.field_m].a(-127 + rj.field_c, 45, 64, 64, 0, var6_int << 24 | 16777215, 1);
                                break L81;
                              } else {
                                break L81;
                              }
                            }
                            int discarded$23 = bq.field_c.a(150, var6_int << 24, 0, 170, rj.field_c + -180, (int[]) null, (hr[]) null, -1 + var8, var6_int << 24, 0, 18, -8787, var9_ref_String, (aa) null, 1, 0);
                            int discarded$24 = bq.field_c.a(150, var6_int << 24, 0, 170, -180 + rj.field_c, (int[]) null, (hr[]) null, 1 + var8, var6_int << 24, 0, 18, -8787, var9_ref_String, (aa) null, 1, 0);
                            int discarded$25 = bq.field_c.a(150, var6_int << 24 | 16777215, 0, 170, rj.field_c - 180, (int[]) null, (hr[]) null, var8, -1, 0, 18, -8787, var9_ref_String, (aa) null, 1, 0);
                            break L77;
                          } else {
                            break L77;
                          }
                        }
                        L83: {
                          L84: {
                            if (!oj.a(false)) {
                              break L84;
                            } else {
                              var6_int = (gi.field_h - lk.field_b) * 0 / 2;
                              var7 = (-lk.field_c + wq.field_b) * 0 / 2;
                              cf.a(var6_int, var7, -44);
                              kn.a(false, (byte) -122);
                              ((Sumoblitz) this).field_F = true;
                              if (var11 == 0) {
                                break L83;
                              } else {
                                break L84;
                              }
                            }
                          }
                          L85: {
                            if (!sj.a(-61)) {
                              break L85;
                            } else {
                              var6_int = (-lk.field_b + gi.field_h) * 0 / 2;
                              var7 = (wq.field_b + -lk.field_c) * 0 / 2;
                              ls.a(var6_int, -95, var7);
                              kn.a(false, -109);
                              ((Sumoblitz) this).field_F = true;
                              if (var11 == 0) {
                                break L83;
                              } else {
                                break L85;
                              }
                            }
                          }
                          if (ws.b((byte) 52)) {
                            break L83;
                          } else {
                            ((Sumoblitz) this).field_F = false;
                            break L83;
                          }
                        }
                        L86: {
                          if (((Sumoblitz) this).field_F) {
                            L87: {
                              var6_int = lk.field_b;
                              var7 = lk.field_c;
                              if (((Sumoblitz) this).field_K != null) {
                                var7 = ((Sumoblitz) this).field_K.field_u;
                                var6_int = ((Sumoblitz) this).field_K.field_x;
                                break L87;
                              } else {
                                break L87;
                              }
                            }
                            L88: {
                              var8 = (-var6_int + gi.field_h) / 2;
                              var9 = (-var7 + wq.field_b) / 2;
                              if (!oj.a(false)) {
                                break L88;
                              } else {
                                if (((Sumoblitz) this).field_K == null) {
                                  break L88;
                                } else {
                                  var8 = ik.c(-10517);
                                  var9 = fd.b(3878);
                                  break L88;
                                }
                              }
                            }
                            var10 = wq.a(var4, (byte) 83);
                            var10.a((byte) 71, var9, var9 - -var7, var8, var8 + var6_int);
                            var9 = (wq.field_b + -lk.field_c) / 2;
                            var8 = (gi.field_h + -lk.field_b) / 2;
                            var4.SA(var8, var9, lk.field_b, lk.field_c, lk.field_a, 0, lk.field_b);
                            var10.a(29709);
                            break L86;
                          } else {
                            break L86;
                          }
                        }
                        var4.a(true);
                        break L62;
                      }
                      sb.a(-9937, ik.field_d);
                      ik.field_d = null;
                      ls.b(0);
                      return false;
                    } else {
                      if (null != pi.field_c) {
                        L89: {
                          L90: {
                            pe.a(20, 90.0f, kn.field_e);
                            var3 = hk.b(78);
                            lk.b();
                            if (!in.g(-70)) {
                              break L90;
                            } else {
                              ad.a((byte) -86, var3, np.a(7));
                              if (var11 == 0) {
                                break L89;
                              } else {
                                break L90;
                              }
                            }
                          }
                          L91: {
                            if (!sa.field_j) {
                              od.a(-62, var3);
                              if (var11 == 0) {
                                break L89;
                              } else {
                                break L91;
                              }
                            } else {
                              break L91;
                            }
                          }
                          L92: {
                            if (!su.a(0)) {
                              pe.a(20, 100.0f, fl.field_s);
                              od.a(-110, var3);
                              if (var11 == 0) {
                                break L89;
                              } else {
                                break L92;
                              }
                            } else {
                              break L92;
                            }
                          }
                          L93: {
                            if (nq.field_h.a(false)) {
                              if (this.h((byte) -34)) {
                                break L93;
                              } else {
                                if (var11 == 0) {
                                  break L89;
                                } else {
                                  break L93;
                                }
                              }
                            } else {
                              break L93;
                            }
                          }
                          L94: {
                            L95: {
                              var4 = nq.field_h.a(-125);
                              var4.GA(0);
                              ph.field_b.a(119, var4, false);
                              if (~rc.field_k == ~nj.field_b) {
                                break L95;
                              } else {
                                L96: {
                                  var5_int = eh.field_a * 255 / 30;
                                  if (nj.field_b != -1) {
                                    iv.field_g[nj.field_b].a(-var5_int + 255, var4, -2355);
                                    break L96;
                                  } else {
                                    break L96;
                                  }
                                }
                                L97: {
                                  if (-1 != rc.field_k) {
                                    iv.field_g[rc.field_k].a(var5_int, var4, -2355);
                                    break L97;
                                  } else {
                                    break L97;
                                  }
                                }
                                if (var11 == 0) {
                                  break L94;
                                } else {
                                  break L95;
                                }
                              }
                            }
                            if (nj.field_b == -1) {
                              break L94;
                            } else {
                              iv.field_g[nj.field_b].a(255, var4, -2355);
                              break L94;
                            }
                          }
                          L98: {
                            if (!so.a((byte) -50)) {
                              break L98;
                            } else {
                              lk.a(0, 0, lk.field_b, lk.field_c);
                              pn.d((byte) -7);
                              break L98;
                            }
                          }
                          L99: {
                            if (ra.field_e == 0) {
                              break L99;
                            } else {
                              var5_int = eh.field_a * 256 / 30;
                              if (var5_int <= 0) {
                                break L99;
                              } else {
                                lk.b(0, 0, lk.field_b, lk.field_c, 0, var5_int);
                                break L99;
                              }
                            }
                          }
                          L100: {
                            if (!sj.a(-38)) {
                              break L100;
                            } else {
                              if (so.a((byte) 110)) {
                                break L100;
                              } else {
                                L101: {
                                  if (null == gk.field_o) {
                                    stackOut_429_0 = ii.field_a;
                                    stackIn_430_0 = stackOut_429_0 ? 1 : 0;
                                    break L101;
                                  } else {
                                    stackOut_428_0 = 1;
                                    stackIn_430_0 = stackOut_428_0;
                                    break L101;
                                  }
                                }
                                kn.a(stackIn_430_0 != 0, -75);
                                break L100;
                              }
                            }
                          }
                          L102: {
                            if (ku.field_j < 2) {
                              break L102;
                            } else {
                              if (gw.field_v) {
                                bq.field_c.a(20, 20, 16777215, Integer.toString(aj.field_B), (byte) -93, 1);
                                break L102;
                              } else {
                                break L102;
                              }
                            }
                          }
                          L103: {
                            var5 = (ge) (Object) pl.field_v.b(66);
                            if (null == var5) {
                              break L103;
                            } else {
                              L104: {
                                L105: {
                                  var7 = qn.field_g;
                                  if (var7 < 64) {
                                    break L105;
                                  } else {
                                    L106: {
                                      if (192 < var7) {
                                        break L106;
                                      } else {
                                        var6_int = 255;
                                        if (var11 == 0) {
                                          break L104;
                                        } else {
                                          break L106;
                                        }
                                      }
                                    }
                                    var6_int = (192 - var7) * 255 / 64;
                                    if (var11 == 0) {
                                      break L104;
                                    } else {
                                      break L105;
                                    }
                                  }
                                }
                                var6_int = var7 * 255 / 64;
                                break L104;
                              }
                              L107: {
                                L108: {
                                  var8 = 45;
                                  if (var5.field_m < 0) {
                                    break L108;
                                  } else {
                                    var9_ref_String = rb.field_d[var5.field_m];
                                    if (~var5.field_m > ~qw.field_a.length) {
                                      var8 += 65;
                                      qw.field_a[var5.field_m].a(-32 + (85 + (rj.field_c + -180)), 45, 64, 64, 0, var6_int << 24 | 16777215, 1);
                                      if (var11 == 0) {
                                        break L107;
                                      } else {
                                        break L108;
                                      }
                                    } else {
                                      break L107;
                                    }
                                  }
                                }
                                var9_ref_String = aa.field_b;
                                break L107;
                              }
                              int discarded$26 = bq.field_c.a(150, var6_int << 24, 0, 170, -180 + rj.field_c, (int[]) null, (hr[]) null, -1 + var8, var6_int << 24, 0, 18, -8787, var9_ref_String, (aa) null, 1, 0);
                              int discarded$27 = bq.field_c.a(150, var6_int << 24, 0, 170, -180 + rj.field_c, (int[]) null, (hr[]) null, var8 + 1, var6_int << 24, 0, 18, -8787, var9_ref_String, (aa) null, 1, 0);
                              int discarded$28 = bq.field_c.a(150, 16777215 | var6_int << 24, 0, 170, -180 + rj.field_c, (int[]) null, (hr[]) null, var8, -1, 0, 18, -8787, var9_ref_String, (aa) null, 1, 0);
                              break L103;
                            }
                          }
                          L109: {
                            L110: {
                              if (!oj.a(false)) {
                                break L110;
                              } else {
                                var6_int = 0 * (gi.field_h - lk.field_b) / 2;
                                var7 = (wq.field_b + -lk.field_c) * 0 / 2;
                                cf.a(var6_int, var7, -105);
                                kn.a(false, (byte) -122);
                                ((Sumoblitz) this).field_F = true;
                                if (var11 == 0) {
                                  break L109;
                                } else {
                                  break L110;
                                }
                              }
                            }
                            L111: {
                              if (!sj.a(-67)) {
                                break L111;
                              } else {
                                var6_int = 0 * (gi.field_h + -lk.field_b) / 2;
                                var7 = (-lk.field_c + wq.field_b) * 0 / 2;
                                ls.a(var6_int, -53, var7);
                                kn.a(false, -101);
                                ((Sumoblitz) this).field_F = true;
                                if (var11 == 0) {
                                  break L109;
                                } else {
                                  break L111;
                                }
                              }
                            }
                            if (ws.b((byte) 52)) {
                              break L109;
                            } else {
                              ((Sumoblitz) this).field_F = false;
                              break L109;
                            }
                          }
                          L112: {
                            if (((Sumoblitz) this).field_F) {
                              L113: {
                                var6_int = lk.field_b;
                                var7 = lk.field_c;
                                if (((Sumoblitz) this).field_K == null) {
                                  break L113;
                                } else {
                                  var6_int = ((Sumoblitz) this).field_K.field_x;
                                  var7 = ((Sumoblitz) this).field_K.field_u;
                                  break L113;
                                }
                              }
                              L114: {
                                var8 = (gi.field_h - var6_int) / 2;
                                var9 = (wq.field_b - var7) / 2;
                                if (!oj.a(false)) {
                                  break L114;
                                } else {
                                  if (null != ((Sumoblitz) this).field_K) {
                                    var8 = ik.c(-10517);
                                    var9 = fd.b(3878);
                                    break L114;
                                  } else {
                                    break L114;
                                  }
                                }
                              }
                              var10 = wq.a(var4, (byte) 29);
                              var10.a((byte) 61, var9, var9 + var7, var8, var6_int + var8);
                              var9 = (wq.field_b + -lk.field_c) / 2;
                              var8 = (-lk.field_b + gi.field_h) / 2;
                              var4.SA(var8, var9, lk.field_b, lk.field_c, lk.field_a, 0, lk.field_b);
                              var10.a(29709);
                              break L112;
                            } else {
                              break L112;
                            }
                          }
                          var4.a(true);
                          break L89;
                        }
                        pe.a(pi.field_c, dq.field_Z, 20, kf.field_v);
                        fv.a(7966, dq.field_Z, kf.field_v);
                        pi.field_c = null;
                        kf.field_v = null;
                        dq.field_Z = null;
                        ls.b(0);
                        return false;
                      } else {
                        L115: {
                          if (param1) {
                            break L115;
                          } else {
                            boolean discarded$29 = this.h((byte) -12);
                            break L115;
                          }
                        }
                        L116: {
                          if (!vi.f(5)) {
                            break L116;
                          } else {
                            var3_int = 0;
                            L117: while (true) {
                              L118: {
                                L119: {
                                  if (13 <= var3_int) {
                                    break L119;
                                  } else {
                                    iv.field_g[var3_int] = ga.a(var3_int, (byte) -100);
                                    var3_int++;
                                    if (var11 != 0) {
                                      break L118;
                                    } else {
                                      if (var11 == 0) {
                                        continue L117;
                                      } else {
                                        break L119;
                                      }
                                    }
                                  }
                                }
                                nj.field_b = 0;
                                bp.a(50, 26175);
                                nn.b(50, -106);
                                mo.a(86, 0);
                                ek.b(true, 0);
                                break L118;
                              }
                              vl.field_a = 0;
                              break L116;
                            }
                          }
                        }
                        L120: {
                          if (nq.field_h.a(-113) == null) {
                            boolean discarded$30 = nq.field_h.a(false);
                            if (this.h((byte) -124)) {
                              break L120;
                            } else {
                              return false;
                            }
                          } else {
                            break L120;
                          }
                        }
                        ph.field_b = new qu();
                        return true;
                      }
                    }
                  } else {
                    if (!il.a(false, gg.field_r)) {
                      ls.b(0);
                      return false;
                    } else {
                      gg.field_r = null;
                      ls.b(0);
                      return false;
                    }
                  }
                }
              } else {
                L121: {
                  L122: {
                    pe.a(20, 70.0f, hv.field_e);
                    var3 = hk.b(-103);
                    lk.b();
                    if (!in.g(-96)) {
                      break L122;
                    } else {
                      ad.a((byte) -45, var3, np.a(7));
                      if (var11 == 0) {
                        break L121;
                      } else {
                        break L122;
                      }
                    }
                  }
                  L123: {
                    if (sa.field_j) {
                      break L123;
                    } else {
                      od.a(-121, var3);
                      if (var11 == 0) {
                        break L121;
                      } else {
                        break L123;
                      }
                    }
                  }
                  L124: {
                    if (su.a(0)) {
                      break L124;
                    } else {
                      pe.a(20, 100.0f, fl.field_s);
                      od.a(-68, var3);
                      if (var11 == 0) {
                        break L121;
                      } else {
                        break L124;
                      }
                    }
                  }
                  L125: {
                    if (!nq.field_h.a(false)) {
                      break L125;
                    } else {
                      if (!this.h((byte) -99)) {
                        break L121;
                      } else {
                        break L125;
                      }
                    }
                  }
                  L126: {
                    L127: {
                      var4 = nq.field_h.a(-121);
                      var4.GA(0);
                      ph.field_b.a(123, var4, false);
                      if (~rc.field_k == ~nj.field_b) {
                        break L127;
                      } else {
                        L128: {
                          var5_int = eh.field_a * 255 / 30;
                          if (nj.field_b != -1) {
                            iv.field_g[nj.field_b].a(-var5_int + 255, var4, -2355);
                            break L128;
                          } else {
                            break L128;
                          }
                        }
                        L129: {
                          if (rc.field_k != -1) {
                            iv.field_g[rc.field_k].a(var5_int, var4, -2355);
                            break L129;
                          } else {
                            break L129;
                          }
                        }
                        if (var11 == 0) {
                          break L126;
                        } else {
                          break L127;
                        }
                      }
                    }
                    if (nj.field_b == -1) {
                      break L126;
                    } else {
                      iv.field_g[nj.field_b].a(255, var4, -2355);
                      break L126;
                    }
                  }
                  L130: {
                    if (!so.a((byte) 118)) {
                      break L130;
                    } else {
                      lk.a(0, 0, lk.field_b, lk.field_c);
                      pn.d((byte) -7);
                      break L130;
                    }
                  }
                  L131: {
                    if (ra.field_e != 0) {
                      var5_int = eh.field_a * 256 / 30;
                      if (var5_int > 0) {
                        lk.b(0, 0, lk.field_b, lk.field_c, 0, var5_int);
                        break L131;
                      } else {
                        break L131;
                      }
                    } else {
                      break L131;
                    }
                  }
                  L132: {
                    if (!sj.a(-126)) {
                      break L132;
                    } else {
                      if (so.a((byte) 110)) {
                        break L132;
                      } else {
                        L133: {
                          if (gk.field_o != null) {
                            stackOut_172_0 = 1;
                            stackIn_173_0 = stackOut_172_0;
                            break L133;
                          } else {
                            stackOut_171_0 = ii.field_a;
                            stackIn_173_0 = stackOut_171_0 ? 1 : 0;
                            break L133;
                          }
                        }
                        kn.a(stackIn_173_0 != 0, 64);
                        break L132;
                      }
                    }
                  }
                  L134: {
                    if (2 > ku.field_j) {
                      break L134;
                    } else {
                      if (gw.field_v) {
                        bq.field_c.a(20, 20, 16777215, Integer.toString(aj.field_B), (byte) -98, 1);
                        break L134;
                      } else {
                        break L134;
                      }
                    }
                  }
                  L135: {
                    var5 = (ge) (Object) pl.field_v.b(-100);
                    if (var5 == null) {
                      break L135;
                    } else {
                      L136: {
                        L137: {
                          var7 = qn.field_g;
                          if (64 > var7) {
                            break L137;
                          } else {
                            L138: {
                              if (192 < var7) {
                                break L138;
                              } else {
                                var6_int = 255;
                                if (var11 == 0) {
                                  break L136;
                                } else {
                                  break L138;
                                }
                              }
                            }
                            var6_int = (48960 - 255 * var7) / 64;
                            if (var11 == 0) {
                              break L136;
                            } else {
                              break L137;
                            }
                          }
                        }
                        var6_int = var7 * 255 / 64;
                        break L136;
                      }
                      L139: {
                        L140: {
                          var8 = 45;
                          if (var5.field_m < 0) {
                            break L140;
                          } else {
                            var9_ref_String = rb.field_d[var5.field_m];
                            if (~var5.field_m <= ~qw.field_a.length) {
                              break L139;
                            } else {
                              var8 += 65;
                              qw.field_a[var5.field_m].a(-180 + rj.field_c + 53, 45, 64, 64, 0, var6_int << 24 | 16777215, 1);
                              if (var11 == 0) {
                                break L139;
                              } else {
                                break L140;
                              }
                            }
                          }
                        }
                        var9_ref_String = aa.field_b;
                        break L139;
                      }
                      int discarded$31 = bq.field_c.a(150, var6_int << 24, 0, 170, -180 + rj.field_c, (int[]) null, (hr[]) null, -1 + var8, var6_int << 24, 0, 18, -8787, var9_ref_String, (aa) null, 1, 0);
                      int discarded$32 = bq.field_c.a(150, var6_int << 24, 0, 170, rj.field_c - 180, (int[]) null, (hr[]) null, 1 + var8, var6_int << 24, 0, 18, -8787, var9_ref_String, (aa) null, 1, 0);
                      int discarded$33 = bq.field_c.a(150, var6_int << 24 | 16777215, 0, 170, rj.field_c - 180, (int[]) null, (hr[]) null, var8, -1, 0, 18, -8787, var9_ref_String, (aa) null, 1, 0);
                      break L135;
                    }
                  }
                  L141: {
                    if (param1) {
                      stackOut_194_0 = 0;
                      stackIn_195_0 = stackOut_194_0;
                      break L141;
                    } else {
                      stackOut_193_0 = 1;
                      stackIn_195_0 = stackOut_193_0;
                      break L141;
                    }
                  }
                  L142: {
                    L143: {
                      if (oj.a(stackIn_195_0 == 0)) {
                        break L143;
                      } else {
                        var6_int = 0 * (-lk.field_b + gi.field_h) / 2;
                        var7 = 0 * (-lk.field_c + wq.field_b) / 2;
                        cf.a(var6_int, var7, 126);
                        kn.a(false, (byte) -122);
                        ((Sumoblitz) this).field_F = true;
                        if (var11 == 0) {
                          break L142;
                        } else {
                          break L143;
                        }
                      }
                    }
                    L144: {
                      if (sj.a(-124)) {
                        break L144;
                      } else {
                        if (ws.b((byte) 52)) {
                          break L142;
                        } else {
                          ((Sumoblitz) this).field_F = false;
                          if (var11 == 0) {
                            break L142;
                          } else {
                            break L144;
                          }
                        }
                      }
                    }
                    var6_int = (-lk.field_b + gi.field_h) * 0 / 2;
                    var7 = (-lk.field_c + wq.field_b) * 0 / 2;
                    ls.a(var6_int, -66, var7);
                    kn.a(false, -124);
                    ((Sumoblitz) this).field_F = true;
                    break L142;
                  }
                  L145: {
                    if (!((Sumoblitz) this).field_F) {
                      break L145;
                    } else {
                      L146: {
                        var6_int = lk.field_b;
                        var7 = lk.field_c;
                        if (null == ((Sumoblitz) this).field_K) {
                          break L146;
                        } else {
                          var6_int = ((Sumoblitz) this).field_K.field_x;
                          var7 = ((Sumoblitz) this).field_K.field_u;
                          break L146;
                        }
                      }
                      L147: {
                        var8 = (-var6_int + gi.field_h) / 2;
                        var9 = (-var7 + wq.field_b) / 2;
                        if (!oj.a(false)) {
                          break L147;
                        } else {
                          if (null != ((Sumoblitz) this).field_K) {
                            var8 = ik.c(-10517);
                            var9 = fd.b(3878);
                            break L147;
                          } else {
                            break L147;
                          }
                        }
                      }
                      var10 = wq.a(var4, (byte) 70);
                      var10.a((byte) -88, var9, var7 + var9, var8, var6_int + var8);
                      var9 = (-lk.field_c + wq.field_b) / 2;
                      var8 = (-lk.field_b + gi.field_h) / 2;
                      var4.SA(var8, var9, lk.field_b, lk.field_c, lk.field_a, 0, lk.field_b);
                      var10.a(29709);
                      break L145;
                    }
                  }
                  var4.a(true);
                  break L121;
                }
                dw.a(er.field_c, 105);
                er.field_c = null;
                ls.b(0);
                return false;
              }
            }
        } catch (RuntimeException | Error decompiledUncheckedException) {
            throw decompiledUncheckedException;
        } catch (Throwable decompiledCheckedException) {
            throw new RuntimeException(decompiledCheckedException);
        }
    }

    final void a(boolean param0) {
        RuntimeException var2 = null;
        int stackIn_4_0 = 0;
        int stackIn_8_0 = 0;
        int stackIn_12_0 = 0;
        int stackIn_16_0 = 0;
        int stackIn_20_0 = 0;
        int stackIn_24_0 = 0;
        int stackIn_28_0 = 0;
        int stackIn_32_0 = 0;
        int stackIn_36_0 = 0;
        int stackIn_40_0 = 0;
        int stackIn_44_0 = 0;
        RuntimeException decompiledCaughtException = null;
        int stackOut_3_0 = 0;
        int stackOut_1_0 = 0;
        int stackOut_7_0 = 0;
        int stackOut_5_0 = 0;
        int stackOut_11_0 = 0;
        int stackOut_9_0 = 0;
        int stackOut_15_0 = 0;
        int stackOut_13_0 = 0;
        int stackOut_19_0 = 0;
        int stackOut_17_0 = 0;
        int stackOut_23_0 = 0;
        int stackOut_21_0 = 0;
        int stackOut_27_0 = 0;
        int stackOut_25_0 = 0;
        int stackOut_31_0 = 0;
        int stackOut_29_0 = 0;
        int stackOut_35_0 = 0;
        int stackOut_33_0 = 0;
        int stackOut_39_0 = 0;
        int stackOut_37_0 = 0;
        int stackOut_43_0 = 0;
        int stackOut_41_0 = 0;
        try {
          L0: {
            L1: {
              Sumoblitz.s(0);
              kc.b((byte) -19);
              ge.a(6334);
              jn.c((byte) 117);
              ha.e(0);
              fs.c(-22);
              wq.a(false);
              oi.a(param0);
              ik.b(-1);
              hw.a(5460);
              ud.c(-127);
              rn.a(13921);
              ma.a(20283);
              bi.a((byte) 84);
              hb.a(-2851);
              wv.a(true);
              fn.k(119);
              su.b((byte) -18);
              cc.a(126);
              os.a(8);
              ns.a((byte) -75);
              lk.a();
              ki.a((byte) 35);
              wf.a(116);
              ws.a((byte) -71);
              hk.a(0);
              gs.a((byte) 14);
              kt.a((byte) -14);
              kd.a((byte) 95);
              uq.a((byte) -106);
              br.a(23050);
              lb.a(0);
              uc.a(-1);
              vs.a((byte) -68);
              uw.c((byte) 96);
              ov.a((byte) 41);
              mn.a((byte) 17);
              cq.a(true);
              og.a(false);
              ak.a(-6);
              qu.a((byte) 42);
              kv.a((byte) 30);
              vm.a((byte) 118);
              if (param0) {
                stackOut_3_0 = 0;
                stackIn_4_0 = stackOut_3_0;
                break L1;
              } else {
                stackOut_1_0 = 1;
                stackIn_4_0 = stackOut_1_0;
                break L1;
              }
            }
            L2: {
              gd.a(stackIn_4_0 != 0);
              ti.a(87);
              rj.a(2);
              dt.d(68);
              ms.b((byte) 80);
              ta.a(false);
              bs.f(-95);
              te.b(6406);
              uu.a((byte) 115);
              sh.g();
              rh.a((byte) 81);
              du.h();
              dn.a(-3);
              kp.a(-1);
              sg.a(-95);
              jg.a((byte) 98);
              rb.a((byte) -45);
              hc.a((byte) 127);
              bk.a(4);
              nj.a((byte) 115);
              if (param0) {
                stackOut_7_0 = 0;
                stackIn_8_0 = stackOut_7_0;
                break L2;
              } else {
                stackOut_5_0 = 1;
                stackIn_8_0 = stackOut_5_0;
                break L2;
              }
            }
            L3: {
              ig.a(stackIn_8_0 != 0);
              vp.a((byte) -111);
              vd.a((byte) -89);
              dg.g(128);
              uk.g(false);
              m.e(true);
              dc.m(105);
              gt.l(124);
              js.g(0);
              cv.g(-118);
              vq.g(121);
              lj.a((byte) 108);
              cp.a((byte) 117);
              pc.a(100);
              bc.a(113);
              ah.c(0);
              vl.a((byte) 113);
              nm.c(1432625512);
              lg.b(544);
              tr.c(1);
              jp.c(32);
              bb.b((byte) 41);
              ii.a((byte) -55);
              ps.a(28);
              er.b(true);
              nt.d(31295);
              qo.a(false);
              kh.a(2);
              dr.c(false);
              fe.n((byte) -68);
              tl.f(91);
              bw.c((byte) 122);
              cb.a(-1384583532);
              lq.a(param0);
              rf.a(1);
              za.a((byte) -103);
              pl.j(24599);
              pi.a(20437);
              ds.a((byte) -1);
              qn.a(0);
              ss.a((byte) 102);
              vn.a();
              hm.a(-11418);
              rv.a(true);
              qi.a((byte) 16);
              se.b(8192);
              if (param0) {
                stackOut_11_0 = 0;
                stackIn_12_0 = stackOut_11_0;
                break L3;
              } else {
                stackOut_9_0 = 1;
                stackIn_12_0 = stackOut_9_0;
                break L3;
              }
            }
            L4: {
              aa.a(stackIn_12_0 != 0);
              sb.a(true);
              mu.a(-109);
              pj.d(37);
              ee.a(1600);
              sr.c(100);
              wo.a(92);
              wn.a(0);
              kw.a((byte) -88);
              ea.b(-123);
              sj.a(true);
              jo.a((byte) -115);
              lw.a(-1685);
              no.a(10);
              vg.a(false);
              fl.b(0);
              rg.e((byte) 95);
              ag.c(82);
              cd.a((byte) -126);
              hf.j(101);
              ld.a((byte) 58);
              wp.a((byte) 54);
              nd.f(-16099);
              sp.d(true);
              ao.a(0);
              ok.b((byte) -122);
              pp.a(2);
              t.f(1);
              ro.c(0);
              fv.d((byte) 62);
              wl.a((byte) -90);
              ql.d((byte) 64);
              am.d((byte) -96);
              rw.c(true);
              fa.a(false);
              nk.c();
              q.a();
              eh.a(-66);
              l.a(-104);
              gk.a(0);
              im.a(true);
              gh.a(-126);
              kr.a(-119);
              up.a(-127);
              jk.a((byte) -104);
              dq.a(-1);
              ci.b(8192);
              bf.b(18260);
              nn.a(-100);
              w.a();
              ku.a(true);
              rd.c(false);
              pb.b(3);
              ih.a((byte) 122);
              lo.a();
              oq.g(-6811);
              qw.a(-122);
              is.a(false);
              sd.a(1);
              un.a(true);
              ow.a((byte) 123);
              sv.a(1284);
              g.a(85);
              hh.a(127);
              fd.c(121);
              fh.d(-48);
              qg.a();
              qe.a(0);
              np.a((byte) -58);
              tj.a((byte) 125);
              td.a((byte) 111);
              mq.a((byte) 110);
              o.b(6);
              wm.a(param0);
              rt.g(-107);
              qq.l(-15648);
              dh.j(82);
              ur.k(0);
              pq.a(-1346554936);
              pe.g(-18490);
              ar.f((byte) -118);
              vr.a(-21433);
              bn.g((byte) -79);
              wr.a(454);
              na.a(false);
              ll.b(-109);
              th.f(false);
              vb.a(0);
              if (param0) {
                stackOut_15_0 = 0;
                stackIn_16_0 = stackOut_15_0;
                break L4;
              } else {
                stackOut_13_0 = 1;
                stackIn_16_0 = stackOut_13_0;
                break L4;
              }
            }
            L5: {
              fu.d(stackIn_16_0 != 0);
              if (param0) {
                stackOut_19_0 = 0;
                stackIn_20_0 = stackOut_19_0;
                break L5;
              } else {
                stackOut_17_0 = 1;
                stackIn_20_0 = stackOut_17_0;
                break L5;
              }
            }
            L6: {
              mb.a(stackIn_20_0 != 0);
              ce.a(-73);
              hi.a(5423);
              rp.b(param0);
              eu.a(false);
              fr.d((byte) 66);
              kk.b((byte) -24);
              iv.a(255);
              eb.b((byte) 0);
              gq.c(false);
              ic.b(106);
              b.a((byte) -69);
              cm.b(0);
              dl.b(0);
              ht.a((byte) -81);
              us.c((byte) 28);
              bt.c((byte) -21);
              hp.d(1);
              aw.G(8);
              ls.a(2);
              io.a(0);
              sk.b(128);
              ut.b((byte) 49);
              hv.b(-7520);
              ko.d(0);
              tf.a((byte) 17);
              mr.a((byte) -109);
              rq.c(-119);
              em.a(true);
              il.a(26238);
              jl.c(786336);
              hq.a((byte) 101);
              gu.a(true);
              mi.a(false);
              mp.a((byte) -100);
              hu.b(61303);
              ck.a(-99);
              sc.a(false);
              rs.a(-26791);
              jd.d(0);
              jh.g(-1);
              st.a((byte) 118);
              mc.f(param0);
              qk.g((byte) -43);
              kq.k(50);
              if (param0) {
                stackOut_23_0 = 0;
                stackIn_24_0 = stackOut_23_0;
                break L6;
              } else {
                stackOut_21_0 = 1;
                stackIn_24_0 = stackOut_21_0;
                break L6;
              }
            }
            L7: {
              we.e(stackIn_24_0 != 0);
              si.b(17);
              ts.a(-13252);
              hl.a(-103);
              jt.d((byte) 54);
              av.f(24);
              nw.b(1183);
              re.a();
              k.a(28322);
              kn.b(-1);
              le.a();
              li.d(119);
              ka.a((byte) -59);
              r.a(33);
              sn.a((byte) -62);
              ek.d(-21551);
              ve.a((byte) -58);
              bq.a((byte) -76);
              ch.a((byte) 60);
              lf.a(1821625704);
              kf.e(-21057);
              ad.d(-20388);
              if (param0) {
                stackOut_27_0 = 0;
                stackIn_28_0 = stackOut_27_0;
                break L7;
              } else {
                stackOut_25_0 = 1;
                stackIn_28_0 = stackOut_25_0;
                break L7;
              }
            }
            L8: {
              f.d(stackIn_28_0 != 0);
              wh.a(-1);
              uj.a(true);
              jq.a(107);
              tq.a((byte) -51);
              pt.a((byte) 43);
              hn.b(true);
              kb.a(true);
              sl.b(-124);
              wt.c((byte) -38);
              es.c(4);
              tt.c(true);
              mo.e(2);
              vk.b(429166529);
              gi.c(8192);
              pr.d(7064);
              au.c((byte) -127);
              ga.a(true);
              lv.c(3);
              gr.c((byte) -19);
              mk.a(-25140);
              ei.a(-124);
              ji.a(0);
              he.a(124);
              jm.a(-23787);
              vu.a((byte) -69);
              pu.a(1);
              ng.d(0);
              ib.e(1);
              uo.d((byte) 79);
              ni.d(false);
              ml.c((byte) 30);
              en.b((byte) 101);
              ff.b(param0);
              ab.a(64);
              sq.a(-127);
              rc.b(124);
              go.a((byte) -17);
              pn.d(12);
              wj.d((byte) 79);
              if (param0) {
                stackOut_31_0 = 0;
                stackIn_32_0 = stackOut_31_0;
                break L8;
              } else {
                stackOut_29_0 = 1;
                stackIn_32_0 = stackOut_29_0;
                break L8;
              }
            }
            L9: {
              ej.d(stackIn_32_0 != 0);
              oh.a((byte) -60);
              ua.a((byte) 13);
              ju.a(param0);
              fq.a(123);
              ia.a(1);
              vv.a(-95);
              if (param0) {
                stackOut_35_0 = 0;
                stackIn_36_0 = stackOut_35_0;
                break L9;
              } else {
                stackOut_33_0 = 1;
                stackIn_36_0 = stackOut_33_0;
                break L9;
              }
            }
            L10: {
              lu.b(stackIn_36_0 != 0);
              ph.a(1882049616);
              qj.a((byte) -70);
              fw.c(-114);
              bl.a(false);
              of.a(-26437);
              if (param0) {
                stackOut_39_0 = 0;
                stackIn_40_0 = stackOut_39_0;
                break L10;
              } else {
                stackOut_37_0 = 1;
                stackIn_40_0 = stackOut_37_0;
                break L10;
              }
            }
            L11: {
              id.c(stackIn_40_0 != 0);
              df.a(false);
              dj.a(1022768328);
              pd.a((byte) -127);
              ue.b(126);
              bv.b(118);
              nl.b(2147483647);
              c.c(22760);
              oj.a(-4);
              in.a((byte) -84);
              uv.a((byte) -31);
              cn.e(0);
              km.a(-11807);
              gn.a(true);
              to.c(false);
              if (param0) {
                stackOut_43_0 = 0;
                stackIn_44_0 = stackOut_43_0;
                break L11;
              } else {
                stackOut_41_0 = 1;
                stackIn_44_0 = stackOut_41_0;
                break L11;
              }
            }
            eg.c(stackIn_44_0 != 0);
            hg.a((byte) 12);
            lh.a(12);
            cj.a(0);
            mm.a(90);
            an.a((byte) 89);
            bj.a(-121);
            qr.a((byte) 119);
            om.a((byte) 99);
            aj.e(2);
            gw.c(false);
            eq.e(3190);
            be.e(6408);
            gb.e(0);
            vi.c(true);
            as.e(83);
            cl.f(4);
            qc.b((byte) 105);
            jj.a(0);
            wd.b((byte) 88);
            vf.b(1);
            rl.a(480);
            sm.a((byte) -30);
            tk.b(122);
            fm.a((byte) -115);
            tm.a(false);
            dv.a(59);
            ac.d(false);
            hd.f(67);
            qv.c(18);
            lt.a(1);
            ou.c((byte) -119);
            tc.f(-1);
            wk.b(false);
            jc.c((byte) -91);
            nq.c((byte) -31);
            jf.a((byte) 91);
            s.a(18232);
            gf.a(1431655765);
            ct.d((byte) -75);
            ks.d(-11701);
            lr.c(16766976);
            lm.b(6);
            dk.a(-102);
            ip.d((byte) 110);
            ke.b(true);
            gg.a(0);
            ((Sumoblitz) this).field_D = null;
            ((Sumoblitz) this).field_K = null;
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2 = decompiledCaughtException;
          throw qo.a((Throwable) (Object) var2, "Sumoblitz.E(" + param0 + 41);
        }
    }

    public Sumoblitz() {
        ((Sumoblitz) this).field_F = false;
        ((Sumoblitz) this).field_K = null;
    }

    public final void init() {
        try {
            ((Sumoblitz) this).a(13, "sumoblitz", 480);
        } catch (RuntimeException runtimeException) {
            throw qo.a((Throwable) (Object) runtimeException, "Sumoblitz.init()");
        }
    }

    final static void a(int param0, int param1, byte param2) {
        RuntimeException var3 = null;
        int var3_int = 0;
        int var4 = 0;
        int var5 = 0;
        RuntimeException decompiledCaughtException = null;
        var5 = field_L ? 1 : 0;
        try {
          L0: {
            if (param0 != 0) {
              if (param2 <= -67) {
                L1: {
                  L2: {
                    L3: {
                      L4: {
                        var3_int = 0;
                        var4 = param1;
                        if (var4 == 1) {
                          var3_int = fi.a(5, he.field_o, (byte) -96);
                          dj discarded$4 = fe.a(-113, rc.field_l[22 + var3_int]);
                          if (var5 == 0) {
                            break L1;
                          } else {
                            break L4;
                          }
                        } else {
                          L5: {
                            if (2 != var4) {
                              break L5;
                            } else {
                              if (var5 == 0) {
                                break L4;
                              } else {
                                break L5;
                              }
                            }
                          }
                          L6: {
                            if (3 != var4) {
                              break L6;
                            } else {
                              if (var5 == 0) {
                                break L4;
                              } else {
                                break L6;
                              }
                            }
                          }
                          if (var4 == 0) {
                            break L4;
                          } else {
                            if (4 == var4) {
                              break L3;
                            } else {
                              if (6 == var4) {
                                break L2;
                              } else {
                                if (var4 == 5) {
                                  break L2;
                                } else {
                                  break L1;
                                }
                              }
                            }
                          }
                        }
                      }
                      var3_int = fi.a(lg.field_d[param0][1].length, he.field_o, (byte) -96);
                      dj discarded$5 = fe.a(89, lg.field_d[param0][1][var3_int]);
                      if (var5 == 0) {
                        break L1;
                      } else {
                        break L3;
                      }
                    }
                    var3_int = fi.a(lg.field_d[param0][2].length, he.field_o, (byte) -96);
                    dj discarded$6 = fe.a(-121, lg.field_d[param0][2][var3_int]);
                    if (var5 == 0) {
                      break L1;
                    } else {
                      break L2;
                    }
                  }
                  var3_int = fi.a(lg.field_d[param0][0].length, he.field_o, (byte) -96);
                  dj discarded$7 = fe.a(42, lg.field_d[param0][0][var3_int]);
                  break L1;
                }
                break L0;
              } else {
                return;
              }
            } else {
              return;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3 = decompiledCaughtException;
          throw qo.a((Throwable) (Object) var3, "Sumoblitz.OA(" + param0 + 44 + param1 + 44 + param2 + 41);
        }
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_G = new int[16384];
        field_H = 0;
        field_I = 49;
    }
}
