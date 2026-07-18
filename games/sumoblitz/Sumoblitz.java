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
                        int discarded$2 = 8192;
                        eg.field_l = qr.a(args);
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
            stackOut_29_1 = ((StringBuilder) (Object) stackIn_29_1).append(stackIn_29_2).append(',').append(param1).append(',').append(param2).append(',');
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
          throw qo.a((Throwable) (Object) stackIn_33_0, stackIn_33_2 + ')');
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
            int discarded$2 = 0;
            gt.m();
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2 = decompiledCaughtException;
          throw qo.a((Throwable) (Object) var2, "Sumoblitz.L(" + param0 + ')');
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
                int fieldTemp$4 = qn.field_g + 1;
                qn.field_g = qn.field_g + 1;
                if (fieldTemp$4 != 256) {
                  break L2;
                } else {
                  qn.field_g = 0;
                  ms discarded$5 = pl.field_v.c(9);
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
                              int discarded$6 = 0;
                              bf.a();
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
                          int discarded$7 = 9;
                          if (!vs.b()) {
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
          throw qo.a((Throwable) (Object) var2, "Sumoblitz.TA(" + param0 + ')');
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
          throw qo.a((Throwable) (Object) var2_ref, "Sumoblitz.C(" + param0 + ')');
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
                          int discarded$6 = -7;
                          pn.d();
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
                          int discarded$7 = bq.field_c.a(150, var5_int << 24, 0, 170, -180 + rj.field_c, (int[]) null, (hr[]) null, -1 + var7, var5_int << 24, 0, 18, -8787, var8_ref_String, (aa) null, 1, 0);
                          int discarded$8 = bq.field_c.a(150, var5_int << 24, 0, 170, -180 + rj.field_c, (int[]) null, (hr[]) null, 1 + var7, var5_int << 24, 0, 18, -8787, var8_ref_String, (aa) null, 1, 0);
                          int discarded$9 = bq.field_c.a(150, var5_int << 24 | 16777215, 0, 170, -180 + rj.field_c, (int[]) null, (hr[]) null, var7, -1, 0, 18, -8787, var8_ref_String, (aa) null, 1, 0);
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
                            int discarded$10 = 52;
                            if (!ws.b()) {
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
                                int discarded$11 = 3878;
                                var8 = fd.b();
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
              throw qo.a((Throwable) (Object) var2, "Sumoblitz.I(" + param0 + ')');
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
          throw qo.a((Throwable) (Object) var2, "Sumoblitz.QA(" + param0 + ')');
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
            throw qo.a((Throwable) (Object) runtimeException, "Sumoblitz.UA(" + param0 + ')');
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
              int discarded$8 = 76;
              fv.e();
              if (gk.field_o == null) {
                break L1;
              } else {
                if (!gk.field_o.field_a) {
                  break L1;
                } else {
                  b.c((byte) 49);
                  int discarded$9 = 35;
                  qw.a();
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
                    int discarded$10 = -1;
                    if (!we.g()) {
                      break L5;
                    } else {
                      boolean discarded$11 = this.a(false, true);
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
                      int discarded$12 = -112;
                      ou.d();
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
                      int discarded$13 = 0;
                      jl.a(ra.c(2));
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
              int discarded$14 = 9;
              if (vs.b()) {
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
                  int discarded$15 = -126;
                  if (!vs.a(ov.field_e)) {
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
          throw qo.a((Throwable) (Object) var2, "Sumoblitz.D(" + param0 + ')');
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
              int discarded$2 = 0;
              er.a();
              stackOut_14_0 = 1;
              stackIn_15_0 = stackOut_14_0;
              break L0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2_ref = decompiledCaughtException;
          throw qo.a((Throwable) (Object) var2_ref, "Sumoblitz.RA(" + param0 + ')');
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
            int stackIn_87_0 = 0;
            int stackIn_170_0 = 0;
            int stackIn_251_0 = 0;
            ik stackIn_311_0 = null;
            int stackIn_340_0 = 0;
            int stackIn_422_0 = 0;
            ik stackOut_59_0 = null;
            int stackOut_86_0 = 0;
            boolean stackOut_85_0 = false;
            boolean stackOut_250_0 = false;
            int stackOut_249_0 = 0;
            ik stackOut_310_0 = null;
            int stackOut_339_0 = 0;
            boolean stackOut_338_0 = false;
            boolean stackOut_421_0 = false;
            int stackOut_420_0 = 0;
            int stackOut_169_0 = 0;
            boolean stackOut_168_0 = false;
            var11 = field_L ? 1 : 0;
            int discarded$36 = -69;
            cl.e();
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
                                              if (er.field_c.a(true)) {
                                                L5: {
                                                  if (!gg.field_r.b((byte) 127)) {
                                                    break L5;
                                                  } else {
                                                    if (gg.field_r.a(true)) {
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
                                                                                stackOut_59_0 = nq.field_h;
                                                                                stackIn_60_0 = stackOut_59_0;
                                                                                L14: {
                                                                                  if (!((ik) (Object) stackIn_60_0).a(false)) {
                                                                                    break L14;
                                                                                  } else {
                                                                                    if (!this.h((byte) -105)) {
                                                                                      break L10;
                                                                                    } else {
                                                                                      break L14;
                                                                                    }
                                                                                  }
                                                                                }
                                                                                L15: {
                                                                                  L16: {
                                                                                    var4 = nq.field_h.a(-97);
                                                                                    var4.GA(0);
                                                                                    ph.field_b.a(124, var4, false);
                                                                                    if (~rc.field_k != ~nj.field_b) {
                                                                                      break L16;
                                                                                    } else {
                                                                                      if (-1 == nj.field_b) {
                                                                                        break L15;
                                                                                      } else {
                                                                                        iv.field_g[nj.field_b].a(255, var4, -2355);
                                                                                        if (var11 == 0) {
                                                                                          break L15;
                                                                                        } else {
                                                                                          break L16;
                                                                                        }
                                                                                      }
                                                                                    }
                                                                                  }
                                                                                  L17: {
                                                                                    var5_int = 255 * eh.field_a / 30;
                                                                                    if (-1 != nj.field_b) {
                                                                                      iv.field_g[nj.field_b].a(255 - var5_int, var4, -2355);
                                                                                      break L17;
                                                                                    } else {
                                                                                      break L17;
                                                                                    }
                                                                                  }
                                                                                  if (rc.field_k != -1) {
                                                                                    iv.field_g[rc.field_k].a(var5_int, var4, -2355);
                                                                                    break L15;
                                                                                  } else {
                                                                                    break L15;
                                                                                  }
                                                                                }
                                                                                L18: {
                                                                                  if (!so.a((byte) 124)) {
                                                                                    break L18;
                                                                                  } else {
                                                                                    lk.a(0, 0, lk.field_b, lk.field_c);
                                                                                    int discarded$37 = -7;
                                                                                    pn.d();
                                                                                    break L18;
                                                                                  }
                                                                                }
                                                                                L19: {
                                                                                  if (0 != ra.field_e) {
                                                                                    var5_int = eh.field_a * 256 / 30;
                                                                                    if (var5_int <= 0) {
                                                                                      break L19;
                                                                                    } else {
                                                                                      lk.b(0, 0, lk.field_b, lk.field_c, 0, var5_int);
                                                                                      break L19;
                                                                                    }
                                                                                  } else {
                                                                                    break L19;
                                                                                  }
                                                                                }
                                                                                L20: {
                                                                                  if (!sj.a(-67)) {
                                                                                    break L20;
                                                                                  } else {
                                                                                    if (!so.a((byte) 115)) {
                                                                                      L21: {
                                                                                        if (null != gk.field_o) {
                                                                                          stackOut_86_0 = 1;
                                                                                          stackIn_87_0 = stackOut_86_0;
                                                                                          break L21;
                                                                                        } else {
                                                                                          stackOut_85_0 = ii.field_a;
                                                                                          stackIn_87_0 = stackOut_85_0 ? 1 : 0;
                                                                                          break L21;
                                                                                        }
                                                                                      }
                                                                                      kn.a(stackIn_87_0 != 0, 25);
                                                                                      break L20;
                                                                                    } else {
                                                                                      break L20;
                                                                                    }
                                                                                  }
                                                                                }
                                                                                L22: {
                                                                                  if (ku.field_j < 2) {
                                                                                    break L22;
                                                                                  } else {
                                                                                    if (!gw.field_v) {
                                                                                      break L22;
                                                                                    } else {
                                                                                      bq.field_c.a(20, 20, 16777215, Integer.toString(aj.field_B), (byte) -103, 1);
                                                                                      break L22;
                                                                                    }
                                                                                  }
                                                                                }
                                                                                L23: {
                                                                                  var5 = (ge) (Object) pl.field_v.b(82);
                                                                                  if (null != var5) {
                                                                                    L24: {
                                                                                      L25: {
                                                                                        var7 = qn.field_g;
                                                                                        if (var7 >= 64) {
                                                                                          break L25;
                                                                                        } else {
                                                                                          var6_int = 255 * var7 / 64;
                                                                                          if (var11 == 0) {
                                                                                            break L24;
                                                                                          } else {
                                                                                            break L25;
                                                                                          }
                                                                                        }
                                                                                      }
                                                                                      L26: {
                                                                                        if (var7 > 192) {
                                                                                          break L26;
                                                                                        } else {
                                                                                          var6_int = 255;
                                                                                          if (var11 == 0) {
                                                                                            break L24;
                                                                                          } else {
                                                                                            break L26;
                                                                                          }
                                                                                        }
                                                                                      }
                                                                                      var6_int = (-(255 * var7) + 48960) / 64;
                                                                                      break L24;
                                                                                    }
                                                                                    L27: {
                                                                                      L28: {
                                                                                        var8 = 45;
                                                                                        if (0 > var5.field_m) {
                                                                                          break L28;
                                                                                        } else {
                                                                                          var9_ref_String = rb.field_d[var5.field_m];
                                                                                          if (~qw.field_a.length >= ~var5.field_m) {
                                                                                            break L27;
                                                                                          } else {
                                                                                            qw.field_a[var5.field_m].a(-32 + (85 + rj.field_c + -180), 45, 64, 64, 0, 16777215 | var6_int << 24, 1);
                                                                                            var8 += 65;
                                                                                            if (var11 == 0) {
                                                                                              break L27;
                                                                                            } else {
                                                                                              break L28;
                                                                                            }
                                                                                          }
                                                                                        }
                                                                                      }
                                                                                      var9_ref_String = aa.field_b;
                                                                                      break L27;
                                                                                    }
                                                                                    int discarded$38 = bq.field_c.a(150, var6_int << 24, 0, 170, rj.field_c - 180, (int[]) null, (hr[]) null, -1 + var8, var6_int << 24, 0, 18, -8787, var9_ref_String, (aa) null, 1, 0);
                                                                                    int discarded$39 = bq.field_c.a(150, var6_int << 24, 0, 170, -180 + rj.field_c, (int[]) null, (hr[]) null, 1 + var8, var6_int << 24, 0, 18, -8787, var9_ref_String, (aa) null, 1, 0);
                                                                                    int discarded$40 = bq.field_c.a(150, var6_int << 24 | 16777215, 0, 170, rj.field_c + -180, (int[]) null, (hr[]) null, var8, -1, 0, 18, -8787, var9_ref_String, (aa) null, 1, 0);
                                                                                    break L23;
                                                                                  } else {
                                                                                    break L23;
                                                                                  }
                                                                                }
                                                                                L29: {
                                                                                  L30: {
                                                                                    if (!oj.a(false)) {
                                                                                      break L30;
                                                                                    } else {
                                                                                      var6_int = (-lk.field_b + gi.field_h) * 0 / 2;
                                                                                      var7 = (-lk.field_c + wq.field_b) * 0 / 2;
                                                                                      cf.a(var6_int, var7, 76);
                                                                                      kn.a(false, (byte) -122);
                                                                                      ((Sumoblitz) this).field_F = true;
                                                                                      if (var11 == 0) {
                                                                                        break L29;
                                                                                      } else {
                                                                                        break L30;
                                                                                      }
                                                                                    }
                                                                                  }
                                                                                  L31: {
                                                                                    if (!sj.a(-126)) {
                                                                                      break L31;
                                                                                    } else {
                                                                                      var6_int = (-lk.field_b + gi.field_h) * 0 / 2;
                                                                                      var7 = (wq.field_b - lk.field_c) * 0 / 2;
                                                                                      ls.a(var6_int, -45, var7);
                                                                                      kn.a(false, -66);
                                                                                      ((Sumoblitz) this).field_F = true;
                                                                                      if (var11 == 0) {
                                                                                        break L29;
                                                                                      } else {
                                                                                        break L31;
                                                                                      }
                                                                                    }
                                                                                  }
                                                                                  int discarded$41 = 52;
                                                                                  if (!ws.b()) {
                                                                                    ((Sumoblitz) this).field_F = false;
                                                                                    break L29;
                                                                                  } else {
                                                                                    break L29;
                                                                                  }
                                                                                }
                                                                                L32: {
                                                                                  if (((Sumoblitz) this).field_F) {
                                                                                    L33: {
                                                                                      var6_int = lk.field_b;
                                                                                      var7 = lk.field_c;
                                                                                      if (((Sumoblitz) this).field_K == null) {
                                                                                        break L33;
                                                                                      } else {
                                                                                        var6_int = ((Sumoblitz) this).field_K.field_x;
                                                                                        var7 = ((Sumoblitz) this).field_K.field_u;
                                                                                        break L33;
                                                                                      }
                                                                                    }
                                                                                    L34: {
                                                                                      var8 = (-var6_int + gi.field_h) / 2;
                                                                                      var9 = (-var7 + wq.field_b) / 2;
                                                                                      if (!oj.a(false)) {
                                                                                        break L34;
                                                                                      } else {
                                                                                        if (((Sumoblitz) this).field_K == null) {
                                                                                          break L34;
                                                                                        } else {
                                                                                          var8 = ik.c(-10517);
                                                                                          int discarded$42 = 3878;
                                                                                          var9 = fd.b();
                                                                                          break L34;
                                                                                        }
                                                                                      }
                                                                                    }
                                                                                    var10 = wq.a(var4, (byte) 126);
                                                                                    var10.a((byte) 91, var9, var7 + var9, var8, var6_int + var8);
                                                                                    var9 = (-lk.field_c + wq.field_b) / 2;
                                                                                    var8 = (-lk.field_b + gi.field_h) / 2;
                                                                                    var4.SA(var8, var9, lk.field_b, lk.field_c, lk.field_a, 0, lk.field_b);
                                                                                    var10.a(29709);
                                                                                    break L32;
                                                                                  } else {
                                                                                    break L32;
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
                  L35: {
                    L36: {
                      pe.a(20, 75.0f, su.field_d);
                      var3 = hk.b(-103);
                      lk.b();
                      if (!in.g(-98)) {
                        break L36;
                      } else {
                        ad.a((byte) 95, var3, np.a(7));
                        if (var11 == 0) {
                          break L35;
                        } else {
                          break L36;
                        }
                      }
                    }
                    L37: {
                      if (sa.field_j) {
                        break L37;
                      } else {
                        od.a(-73, var3);
                        if (var11 == 0) {
                          break L35;
                        } else {
                          break L37;
                        }
                      }
                    }
                    L38: {
                      if (su.a(0)) {
                        break L38;
                      } else {
                        pe.a(20, 100.0f, fl.field_s);
                        od.a(-111, var3);
                        if (var11 == 0) {
                          break L35;
                        } else {
                          break L38;
                        }
                      }
                    }
                    L39: {
                      if (nq.field_h.a(false)) {
                        if (this.h((byte) -48)) {
                          break L39;
                        } else {
                          if (var11 == 0) {
                            break L35;
                          } else {
                            break L39;
                          }
                        }
                      } else {
                        break L39;
                      }
                    }
                    L40: {
                      L41: {
                        var4 = nq.field_h.a(-128);
                        var4.GA(0);
                        ph.field_b.a(124, var4, false);
                        if (~nj.field_b == ~rc.field_k) {
                          break L41;
                        } else {
                          L42: {
                            var5_int = 255 * eh.field_a / 30;
                            if (nj.field_b == -1) {
                              break L42;
                            } else {
                              iv.field_g[nj.field_b].a(-var5_int + 255, var4, -2355);
                              break L42;
                            }
                          }
                          L43: {
                            if (rc.field_k == -1) {
                              break L43;
                            } else {
                              iv.field_g[rc.field_k].a(var5_int, var4, -2355);
                              break L43;
                            }
                          }
                          if (var11 == 0) {
                            break L40;
                          } else {
                            break L41;
                          }
                        }
                      }
                      if (-1 == nj.field_b) {
                        break L40;
                      } else {
                        iv.field_g[nj.field_b].a(255, var4, -2355);
                        break L40;
                      }
                    }
                    L44: {
                      if (!so.a((byte) 109)) {
                        break L44;
                      } else {
                        lk.a(0, 0, lk.field_b, lk.field_c);
                        int discarded$43 = -7;
                        pn.d();
                        break L44;
                      }
                    }
                    L45: {
                      if (ra.field_e == 0) {
                        break L45;
                      } else {
                        var5_int = eh.field_a * 256 / 30;
                        if (0 < var5_int) {
                          lk.b(0, 0, lk.field_b, lk.field_c, 0, var5_int);
                          break L45;
                        } else {
                          break L45;
                        }
                      }
                    }
                    L46: {
                      if (!sj.a(-28)) {
                        break L46;
                      } else {
                        if (!so.a((byte) -55)) {
                          L47: {
                            if (gk.field_o == null) {
                              stackOut_250_0 = ii.field_a;
                              stackIn_251_0 = stackOut_250_0 ? 1 : 0;
                              break L47;
                            } else {
                              stackOut_249_0 = 1;
                              stackIn_251_0 = stackOut_249_0;
                              break L47;
                            }
                          }
                          kn.a(stackIn_251_0 != 0, -122);
                          break L46;
                        } else {
                          break L46;
                        }
                      }
                    }
                    L48: {
                      if (ku.field_j < 2) {
                        break L48;
                      } else {
                        if (gw.field_v) {
                          bq.field_c.a(20, 20, 16777215, Integer.toString(aj.field_B), (byte) -122, 1);
                          break L48;
                        } else {
                          break L48;
                        }
                      }
                    }
                    L49: {
                      var5 = (ge) (Object) pl.field_v.b(-85);
                      if (null != var5) {
                        L50: {
                          L51: {
                            var7 = qn.field_g;
                            if (64 > var7) {
                              break L51;
                            } else {
                              L52: {
                                if (var7 > 192) {
                                  break L52;
                                } else {
                                  var6_int = 255;
                                  if (var11 == 0) {
                                    break L50;
                                  } else {
                                    break L52;
                                  }
                                }
                              }
                              var6_int = (48960 - var7 * 255) / 64;
                              if (var11 == 0) {
                                break L50;
                              } else {
                                break L51;
                              }
                            }
                          }
                          var6_int = 255 * var7 / 64;
                          break L50;
                        }
                        L53: {
                          L54: {
                            var8 = 45;
                            if (var5.field_m >= 0) {
                              break L54;
                            } else {
                              var9_ref_String = aa.field_b;
                              if (var11 == 0) {
                                break L53;
                              } else {
                                break L54;
                              }
                            }
                          }
                          var9_ref_String = rb.field_d[var5.field_m];
                          if (qw.field_a.length > var5.field_m) {
                            var8 += 65;
                            qw.field_a[var5.field_m].a(rj.field_c - 127, 45, 64, 64, 0, var6_int << 24 | 16777215, 1);
                            break L53;
                          } else {
                            break L53;
                          }
                        }
                        int discarded$44 = bq.field_c.a(150, var6_int << 24, 0, 170, -180 + rj.field_c, (int[]) null, (hr[]) null, var8 + -1, var6_int << 24, 0, 18, -8787, var9_ref_String, (aa) null, 1, 0);
                        int discarded$45 = bq.field_c.a(150, var6_int << 24, 0, 170, rj.field_c + -180, (int[]) null, (hr[]) null, 1 + var8, var6_int << 24, 0, 18, -8787, var9_ref_String, (aa) null, 1, 0);
                        int discarded$46 = bq.field_c.a(150, var6_int << 24 | 16777215, 0, 170, rj.field_c - 180, (int[]) null, (hr[]) null, var8, -1, 0, 18, -8787, var9_ref_String, (aa) null, 1, 0);
                        break L49;
                      } else {
                        break L49;
                      }
                    }
                    L55: {
                      L56: {
                        if (!oj.a(false)) {
                          break L56;
                        } else {
                          var6_int = 0 * (gi.field_h - lk.field_b) / 2;
                          var7 = (wq.field_b - lk.field_c) * 0 / 2;
                          cf.a(var6_int, var7, 86);
                          kn.a(false, (byte) -122);
                          ((Sumoblitz) this).field_F = true;
                          if (var11 == 0) {
                            break L55;
                          } else {
                            break L56;
                          }
                        }
                      }
                      L57: {
                        if (sj.a(-63)) {
                          break L57;
                        } else {
                          int discarded$47 = 52;
                          if (ws.b()) {
                            break L55;
                          } else {
                            ((Sumoblitz) this).field_F = false;
                            if (var11 == 0) {
                              break L55;
                            } else {
                              break L57;
                            }
                          }
                        }
                      }
                      var6_int = 0 * (gi.field_h + -lk.field_b) / 2;
                      var7 = (wq.field_b + -lk.field_c) * 0 / 2;
                      ls.a(var6_int, -82, var7);
                      kn.a(false, -100);
                      ((Sumoblitz) this).field_F = true;
                      break L55;
                    }
                    L58: {
                      if (!((Sumoblitz) this).field_F) {
                        break L58;
                      } else {
                        L59: {
                          var6_int = lk.field_b;
                          var7 = lk.field_c;
                          if (((Sumoblitz) this).field_K == null) {
                            break L59;
                          } else {
                            var6_int = ((Sumoblitz) this).field_K.field_x;
                            var7 = ((Sumoblitz) this).field_K.field_u;
                            break L59;
                          }
                        }
                        L60: {
                          var8 = (gi.field_h + -var6_int) / 2;
                          var9 = (-var7 + wq.field_b) / 2;
                          if (!oj.a(false)) {
                            break L60;
                          } else {
                            if (((Sumoblitz) this).field_K != null) {
                              var8 = ik.c(-10517);
                              int discarded$48 = 3878;
                              var9 = fd.b();
                              break L60;
                            } else {
                              break L60;
                            }
                          }
                        }
                        var10 = wq.a(var4, (byte) 28);
                        var10.a((byte) 127, var9, var7 + var9, var8, var8 + var6_int);
                        var9 = (wq.field_b - lk.field_c) / 2;
                        var8 = (-lk.field_b + gi.field_h) / 2;
                        var4.SA(var8, var9, lk.field_b, lk.field_c, lk.field_a, 0, lk.field_b);
                        var10.a(29709);
                        break L58;
                      }
                    }
                    var4.a(true);
                    break L35;
                  }
                  au.a(-1509, be.field_s);
                  be.field_s = null;
                  ls.b(0);
                  return false;
                } else {
                  if (gg.field_r == null) {
                    if (ik.field_d != null) {
                      L61: {
                        L62: {
                          pe.a(20, 80.0f, om.field_n);
                          var3 = hk.b(125);
                          lk.b();
                          if (!in.g(-128)) {
                            break L62;
                          } else {
                            ad.a((byte) -75, var3, np.a(7));
                            if (var11 == 0) {
                              break L61;
                            } else {
                              break L62;
                            }
                          }
                        }
                        L63: {
                          if (sa.field_j) {
                            break L63;
                          } else {
                            od.a(-67, var3);
                            if (var11 == 0) {
                              break L61;
                            } else {
                              break L63;
                            }
                          }
                        }
                        L64: {
                          if (su.a(0)) {
                            break L64;
                          } else {
                            pe.a(20, 100.0f, fl.field_s);
                            od.a(-52, var3);
                            if (var11 == 0) {
                              break L61;
                            } else {
                              break L64;
                            }
                          }
                        }
                        stackOut_310_0 = nq.field_h;
                        stackIn_311_0 = stackOut_310_0;
                        L65: {
                          if (((ik) (Object) stackIn_311_0).a(false)) {
                            if (this.h((byte) -11)) {
                              break L65;
                            } else {
                              if (var11 == 0) {
                                break L61;
                              } else {
                                break L65;
                              }
                            }
                          } else {
                            break L65;
                          }
                        }
                        L66: {
                          L67: {
                            var4 = nq.field_h.a(-120);
                            var4.GA(0);
                            ph.field_b.a(122, var4, false);
                            if (~nj.field_b == ~rc.field_k) {
                              break L67;
                            } else {
                              L68: {
                                var5_int = eh.field_a * 255 / 30;
                                if (-1 != nj.field_b) {
                                  iv.field_g[nj.field_b].a(-var5_int + 255, var4, -2355);
                                  break L68;
                                } else {
                                  break L68;
                                }
                              }
                              L69: {
                                if (rc.field_k != -1) {
                                  iv.field_g[rc.field_k].a(var5_int, var4, -2355);
                                  break L69;
                                } else {
                                  break L69;
                                }
                              }
                              if (var11 == 0) {
                                break L66;
                              } else {
                                break L67;
                              }
                            }
                          }
                          if (nj.field_b == -1) {
                            break L66;
                          } else {
                            iv.field_g[nj.field_b].a(255, var4, -2355);
                            break L66;
                          }
                        }
                        L70: {
                          if (!so.a((byte) -36)) {
                            break L70;
                          } else {
                            lk.a(0, 0, lk.field_b, lk.field_c);
                            int discarded$49 = -7;
                            pn.d();
                            break L70;
                          }
                        }
                        L71: {
                          if (ra.field_e != 0) {
                            var5_int = 256 * eh.field_a / 30;
                            if (var5_int <= 0) {
                              break L71;
                            } else {
                              lk.b(0, 0, lk.field_b, lk.field_c, 0, var5_int);
                              break L71;
                            }
                          } else {
                            break L71;
                          }
                        }
                        L72: {
                          if (!sj.a(-103)) {
                            break L72;
                          } else {
                            if (so.a((byte) 127)) {
                              break L72;
                            } else {
                              L73: {
                                if (null != gk.field_o) {
                                  stackOut_339_0 = 1;
                                  stackIn_340_0 = stackOut_339_0;
                                  break L73;
                                } else {
                                  stackOut_338_0 = ii.field_a;
                                  stackIn_340_0 = stackOut_338_0 ? 1 : 0;
                                  break L73;
                                }
                              }
                              kn.a(stackIn_340_0 != 0, 115);
                              break L72;
                            }
                          }
                        }
                        L74: {
                          if (ku.field_j < 2) {
                            break L74;
                          } else {
                            if (gw.field_v) {
                              bq.field_c.a(20, 20, 16777215, Integer.toString(aj.field_B), (byte) -61, 1);
                              break L74;
                            } else {
                              break L74;
                            }
                          }
                        }
                        L75: {
                          var5 = (ge) (Object) pl.field_v.b(110);
                          if (null != var5) {
                            L76: {
                              L77: {
                                var7 = qn.field_g;
                                if (var7 >= 64) {
                                  break L77;
                                } else {
                                  var6_int = 255 * var7 / 64;
                                  if (var11 == 0) {
                                    break L76;
                                  } else {
                                    break L77;
                                  }
                                }
                              }
                              L78: {
                                if (var7 <= 192) {
                                  break L78;
                                } else {
                                  var6_int = (192 - var7) * 255 / 64;
                                  if (var11 == 0) {
                                    break L76;
                                  } else {
                                    break L78;
                                  }
                                }
                              }
                              var6_int = 255;
                              break L76;
                            }
                            L79: {
                              L80: {
                                var8 = 45;
                                if (0 <= var5.field_m) {
                                  break L80;
                                } else {
                                  var9_ref_String = aa.field_b;
                                  if (var11 == 0) {
                                    break L79;
                                  } else {
                                    break L80;
                                  }
                                }
                              }
                              var9_ref_String = rb.field_d[var5.field_m];
                              if (qw.field_a.length > var5.field_m) {
                                var8 += 65;
                                qw.field_a[var5.field_m].a(-127 + rj.field_c, 45, 64, 64, 0, var6_int << 24 | 16777215, 1);
                                break L79;
                              } else {
                                break L79;
                              }
                            }
                            int discarded$50 = bq.field_c.a(150, var6_int << 24, 0, 170, rj.field_c + -180, (int[]) null, (hr[]) null, -1 + var8, var6_int << 24, 0, 18, -8787, var9_ref_String, (aa) null, 1, 0);
                            int discarded$51 = bq.field_c.a(150, var6_int << 24, 0, 170, -180 + rj.field_c, (int[]) null, (hr[]) null, 1 + var8, var6_int << 24, 0, 18, -8787, var9_ref_String, (aa) null, 1, 0);
                            int discarded$52 = bq.field_c.a(150, var6_int << 24 | 16777215, 0, 170, rj.field_c - 180, (int[]) null, (hr[]) null, var8, -1, 0, 18, -8787, var9_ref_String, (aa) null, 1, 0);
                            break L75;
                          } else {
                            break L75;
                          }
                        }
                        L81: {
                          L82: {
                            if (!oj.a(false)) {
                              break L82;
                            } else {
                              var6_int = (gi.field_h - lk.field_b) * 0 / 2;
                              var7 = (-lk.field_c + wq.field_b) * 0 / 2;
                              cf.a(var6_int, var7, -44);
                              kn.a(false, (byte) -122);
                              ((Sumoblitz) this).field_F = true;
                              if (var11 == 0) {
                                break L81;
                              } else {
                                break L82;
                              }
                            }
                          }
                          L83: {
                            if (!sj.a(-61)) {
                              break L83;
                            } else {
                              var6_int = (-lk.field_b + gi.field_h) * 0 / 2;
                              var7 = (wq.field_b + -lk.field_c) * 0 / 2;
                              ls.a(var6_int, -95, var7);
                              kn.a(false, -109);
                              ((Sumoblitz) this).field_F = true;
                              if (var11 == 0) {
                                break L81;
                              } else {
                                break L83;
                              }
                            }
                          }
                          int discarded$53 = 52;
                          if (ws.b()) {
                            break L81;
                          } else {
                            ((Sumoblitz) this).field_F = false;
                            break L81;
                          }
                        }
                        L84: {
                          if (((Sumoblitz) this).field_F) {
                            L85: {
                              var6_int = lk.field_b;
                              var7 = lk.field_c;
                              if (((Sumoblitz) this).field_K != null) {
                                var7 = ((Sumoblitz) this).field_K.field_u;
                                var6_int = ((Sumoblitz) this).field_K.field_x;
                                break L85;
                              } else {
                                break L85;
                              }
                            }
                            L86: {
                              var8 = (-var6_int + gi.field_h) / 2;
                              var9 = (-var7 + wq.field_b) / 2;
                              if (!oj.a(false)) {
                                break L86;
                              } else {
                                if (((Sumoblitz) this).field_K == null) {
                                  break L86;
                                } else {
                                  var8 = ik.c(-10517);
                                  int discarded$54 = 3878;
                                  var9 = fd.b();
                                  break L86;
                                }
                              }
                            }
                            var10 = wq.a(var4, (byte) 83);
                            var10.a((byte) 71, var9, var9 - -var7, var8, var8 + var6_int);
                            var9 = (wq.field_b + -lk.field_c) / 2;
                            var8 = (gi.field_h + -lk.field_b) / 2;
                            var4.SA(var8, var9, lk.field_b, lk.field_c, lk.field_a, 0, lk.field_b);
                            var10.a(29709);
                            break L84;
                          } else {
                            break L84;
                          }
                        }
                        var4.a(true);
                        break L61;
                      }
                      sb.a(-9937, ik.field_d);
                      ik.field_d = null;
                      ls.b(0);
                      return false;
                    } else {
                      if (null != pi.field_c) {
                        L87: {
                          L88: {
                            pe.a(20, 90.0f, kn.field_e);
                            var3 = hk.b(78);
                            lk.b();
                            if (!in.g(-70)) {
                              break L88;
                            } else {
                              ad.a((byte) -86, var3, np.a(7));
                              if (var11 == 0) {
                                break L87;
                              } else {
                                break L88;
                              }
                            }
                          }
                          L89: {
                            if (!sa.field_j) {
                              od.a(-62, var3);
                              if (var11 == 0) {
                                break L87;
                              } else {
                                break L89;
                              }
                            } else {
                              break L89;
                            }
                          }
                          L90: {
                            if (!su.a(0)) {
                              pe.a(20, 100.0f, fl.field_s);
                              od.a(-110, var3);
                              if (var11 == 0) {
                                break L87;
                              } else {
                                break L90;
                              }
                            } else {
                              break L90;
                            }
                          }
                          L91: {
                            if (nq.field_h.a(false)) {
                              if (this.h((byte) -34)) {
                                break L91;
                              } else {
                                if (var11 == 0) {
                                  break L87;
                                } else {
                                  break L91;
                                }
                              }
                            } else {
                              break L91;
                            }
                          }
                          L92: {
                            L93: {
                              var4 = nq.field_h.a(-125);
                              var4.GA(0);
                              ph.field_b.a(119, var4, false);
                              if (~rc.field_k == ~nj.field_b) {
                                break L93;
                              } else {
                                L94: {
                                  var5_int = eh.field_a * 255 / 30;
                                  if (nj.field_b != -1) {
                                    iv.field_g[nj.field_b].a(-var5_int + 255, var4, -2355);
                                    break L94;
                                  } else {
                                    break L94;
                                  }
                                }
                                L95: {
                                  if (-1 != rc.field_k) {
                                    iv.field_g[rc.field_k].a(var5_int, var4, -2355);
                                    break L95;
                                  } else {
                                    break L95;
                                  }
                                }
                                if (var11 == 0) {
                                  break L92;
                                } else {
                                  break L93;
                                }
                              }
                            }
                            if (nj.field_b == -1) {
                              break L92;
                            } else {
                              iv.field_g[nj.field_b].a(255, var4, -2355);
                              break L92;
                            }
                          }
                          L96: {
                            if (!so.a((byte) -50)) {
                              break L96;
                            } else {
                              lk.a(0, 0, lk.field_b, lk.field_c);
                              int discarded$55 = -7;
                              pn.d();
                              break L96;
                            }
                          }
                          L97: {
                            if (ra.field_e == 0) {
                              break L97;
                            } else {
                              var5_int = eh.field_a * 256 / 30;
                              if (var5_int <= 0) {
                                break L97;
                              } else {
                                lk.b(0, 0, lk.field_b, lk.field_c, 0, var5_int);
                                break L97;
                              }
                            }
                          }
                          L98: {
                            if (!sj.a(-38)) {
                              break L98;
                            } else {
                              if (so.a((byte) 110)) {
                                break L98;
                              } else {
                                L99: {
                                  if (null == gk.field_o) {
                                    stackOut_421_0 = ii.field_a;
                                    stackIn_422_0 = stackOut_421_0 ? 1 : 0;
                                    break L99;
                                  } else {
                                    stackOut_420_0 = 1;
                                    stackIn_422_0 = stackOut_420_0;
                                    break L99;
                                  }
                                }
                                kn.a(stackIn_422_0 != 0, -75);
                                break L98;
                              }
                            }
                          }
                          L100: {
                            if (ku.field_j < 2) {
                              break L100;
                            } else {
                              if (gw.field_v) {
                                bq.field_c.a(20, 20, 16777215, Integer.toString(aj.field_B), (byte) -93, 1);
                                break L100;
                              } else {
                                break L100;
                              }
                            }
                          }
                          L101: {
                            var5 = (ge) (Object) pl.field_v.b(66);
                            if (null == var5) {
                              break L101;
                            } else {
                              L102: {
                                L103: {
                                  var7 = qn.field_g;
                                  if (var7 < 64) {
                                    break L103;
                                  } else {
                                    L104: {
                                      if (192 < var7) {
                                        break L104;
                                      } else {
                                        var6_int = 255;
                                        if (var11 == 0) {
                                          break L102;
                                        } else {
                                          break L104;
                                        }
                                      }
                                    }
                                    var6_int = (192 - var7) * 255 / 64;
                                    if (var11 == 0) {
                                      break L102;
                                    } else {
                                      break L103;
                                    }
                                  }
                                }
                                var6_int = var7 * 255 / 64;
                                break L102;
                              }
                              L105: {
                                L106: {
                                  var8 = 45;
                                  if (var5.field_m < 0) {
                                    break L106;
                                  } else {
                                    var9_ref_String = rb.field_d[var5.field_m];
                                    if (~var5.field_m > ~qw.field_a.length) {
                                      var8 += 65;
                                      qw.field_a[var5.field_m].a(-32 + (85 + (rj.field_c + -180)), 45, 64, 64, 0, var6_int << 24 | 16777215, 1);
                                      if (var11 == 0) {
                                        break L105;
                                      } else {
                                        break L106;
                                      }
                                    } else {
                                      break L105;
                                    }
                                  }
                                }
                                var9_ref_String = aa.field_b;
                                break L105;
                              }
                              int discarded$56 = bq.field_c.a(150, var6_int << 24, 0, 170, -180 + rj.field_c, (int[]) null, (hr[]) null, -1 + var8, var6_int << 24, 0, 18, -8787, var9_ref_String, (aa) null, 1, 0);
                              int discarded$57 = bq.field_c.a(150, var6_int << 24, 0, 170, -180 + rj.field_c, (int[]) null, (hr[]) null, var8 + 1, var6_int << 24, 0, 18, -8787, var9_ref_String, (aa) null, 1, 0);
                              int discarded$58 = bq.field_c.a(150, 16777215 | var6_int << 24, 0, 170, -180 + rj.field_c, (int[]) null, (hr[]) null, var8, -1, 0, 18, -8787, var9_ref_String, (aa) null, 1, 0);
                              break L101;
                            }
                          }
                          L107: {
                            L108: {
                              if (!oj.a(false)) {
                                break L108;
                              } else {
                                var6_int = 0 * (gi.field_h - lk.field_b) / 2;
                                var7 = (wq.field_b + -lk.field_c) * 0 / 2;
                                cf.a(var6_int, var7, -105);
                                kn.a(false, (byte) -122);
                                ((Sumoblitz) this).field_F = true;
                                if (var11 == 0) {
                                  break L107;
                                } else {
                                  break L108;
                                }
                              }
                            }
                            L109: {
                              if (!sj.a(-67)) {
                                break L109;
                              } else {
                                var6_int = 0 * (gi.field_h + -lk.field_b) / 2;
                                var7 = (-lk.field_c + wq.field_b) * 0 / 2;
                                ls.a(var6_int, -53, var7);
                                kn.a(false, -101);
                                ((Sumoblitz) this).field_F = true;
                                if (var11 == 0) {
                                  break L107;
                                } else {
                                  break L109;
                                }
                              }
                            }
                            int discarded$59 = 52;
                            if (ws.b()) {
                              break L107;
                            } else {
                              ((Sumoblitz) this).field_F = false;
                              break L107;
                            }
                          }
                          L110: {
                            if (((Sumoblitz) this).field_F) {
                              L111: {
                                var6_int = lk.field_b;
                                var7 = lk.field_c;
                                if (((Sumoblitz) this).field_K == null) {
                                  break L111;
                                } else {
                                  var6_int = ((Sumoblitz) this).field_K.field_x;
                                  var7 = ((Sumoblitz) this).field_K.field_u;
                                  break L111;
                                }
                              }
                              L112: {
                                var8 = (gi.field_h - var6_int) / 2;
                                var9 = (wq.field_b - var7) / 2;
                                if (!oj.a(false)) {
                                  break L112;
                                } else {
                                  if (null != ((Sumoblitz) this).field_K) {
                                    var8 = ik.c(-10517);
                                    int discarded$60 = 3878;
                                    var9 = fd.b();
                                    break L112;
                                  } else {
                                    break L112;
                                  }
                                }
                              }
                              var10 = wq.a(var4, (byte) 29);
                              var10.a((byte) 61, var9, var9 + var7, var8, var6_int + var8);
                              var9 = (wq.field_b + -lk.field_c) / 2;
                              var8 = (-lk.field_b + gi.field_h) / 2;
                              var4.SA(var8, var9, lk.field_b, lk.field_c, lk.field_a, 0, lk.field_b);
                              var10.a(29709);
                              break L110;
                            } else {
                              break L110;
                            }
                          }
                          var4.a(true);
                          break L87;
                        }
                        pe.a(pi.field_c, dq.field_Z, 20, kf.field_v);
                        fv.a(7966, dq.field_Z, kf.field_v);
                        pi.field_c = null;
                        kf.field_v = null;
                        dq.field_Z = null;
                        ls.b(0);
                        return false;
                      } else {
                        L113: {
                          int discarded$61 = 5;
                          if (!vi.f()) {
                            break L113;
                          } else {
                            var3_int = 0;
                            L114: while (true) {
                              L115: {
                                L116: {
                                  if (13 <= var3_int) {
                                    break L116;
                                  } else {
                                    iv.field_g[var3_int] = ga.a(var3_int, (byte) -100);
                                    var3_int++;
                                    if (var11 != 0) {
                                      break L115;
                                    } else {
                                      if (var11 == 0) {
                                        continue L114;
                                      } else {
                                        break L116;
                                      }
                                    }
                                  }
                                }
                                nj.field_b = 0;
                                bp.a(50, 26175);
                                nn.b(50, -106);
                                mo.a(86, 0);
                                int discarded$62 = 0;
                                int discarded$63 = 1;
                                ek.b();
                                break L115;
                              }
                              vl.field_a = 0;
                              break L113;
                            }
                          }
                        }
                        L117: {
                          if (nq.field_h.a(-113) == null) {
                            boolean discarded$64 = nq.field_h.a(false);
                            if (this.h((byte) -124)) {
                              break L117;
                            } else {
                              return false;
                            }
                          } else {
                            break L117;
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
                L118: {
                  L119: {
                    pe.a(20, 70.0f, hv.field_e);
                    var3 = hk.b(-103);
                    lk.b();
                    if (!in.g(-96)) {
                      break L119;
                    } else {
                      ad.a((byte) -45, var3, np.a(7));
                      if (var11 == 0) {
                        break L118;
                      } else {
                        break L119;
                      }
                    }
                  }
                  L120: {
                    if (sa.field_j) {
                      break L120;
                    } else {
                      od.a(-121, var3);
                      if (var11 == 0) {
                        break L118;
                      } else {
                        break L120;
                      }
                    }
                  }
                  L121: {
                    if (su.a(0)) {
                      break L121;
                    } else {
                      pe.a(20, 100.0f, fl.field_s);
                      od.a(-68, var3);
                      if (var11 == 0) {
                        break L118;
                      } else {
                        break L121;
                      }
                    }
                  }
                  L122: {
                    if (!nq.field_h.a(false)) {
                      break L122;
                    } else {
                      if (!this.h((byte) -99)) {
                        break L118;
                      } else {
                        break L122;
                      }
                    }
                  }
                  L123: {
                    L124: {
                      var4 = nq.field_h.a(-121);
                      var4.GA(0);
                      ph.field_b.a(123, var4, false);
                      if (~rc.field_k == ~nj.field_b) {
                        break L124;
                      } else {
                        L125: {
                          var5_int = eh.field_a * 255 / 30;
                          if (nj.field_b != -1) {
                            iv.field_g[nj.field_b].a(-var5_int + 255, var4, -2355);
                            break L125;
                          } else {
                            break L125;
                          }
                        }
                        L126: {
                          if (rc.field_k != -1) {
                            iv.field_g[rc.field_k].a(var5_int, var4, -2355);
                            break L126;
                          } else {
                            break L126;
                          }
                        }
                        if (var11 == 0) {
                          break L123;
                        } else {
                          break L124;
                        }
                      }
                    }
                    if (nj.field_b == -1) {
                      break L123;
                    } else {
                      iv.field_g[nj.field_b].a(255, var4, -2355);
                      break L123;
                    }
                  }
                  L127: {
                    if (!so.a((byte) 118)) {
                      break L127;
                    } else {
                      lk.a(0, 0, lk.field_b, lk.field_c);
                      int discarded$65 = -7;
                      pn.d();
                      break L127;
                    }
                  }
                  L128: {
                    if (ra.field_e != 0) {
                      var5_int = eh.field_a * 256 / 30;
                      if (var5_int > 0) {
                        lk.b(0, 0, lk.field_b, lk.field_c, 0, var5_int);
                        break L128;
                      } else {
                        break L128;
                      }
                    } else {
                      break L128;
                    }
                  }
                  L129: {
                    if (!sj.a(-126)) {
                      break L129;
                    } else {
                      if (so.a((byte) 110)) {
                        break L129;
                      } else {
                        L130: {
                          if (gk.field_o != null) {
                            stackOut_169_0 = 1;
                            stackIn_170_0 = stackOut_169_0;
                            break L130;
                          } else {
                            stackOut_168_0 = ii.field_a;
                            stackIn_170_0 = stackOut_168_0 ? 1 : 0;
                            break L130;
                          }
                        }
                        kn.a(stackIn_170_0 != 0, 64);
                        break L129;
                      }
                    }
                  }
                  L131: {
                    if (2 > ku.field_j) {
                      break L131;
                    } else {
                      if (gw.field_v) {
                        bq.field_c.a(20, 20, 16777215, Integer.toString(aj.field_B), (byte) -98, 1);
                        break L131;
                      } else {
                        break L131;
                      }
                    }
                  }
                  L132: {
                    var5 = (ge) (Object) pl.field_v.b(-100);
                    if (var5 == null) {
                      break L132;
                    } else {
                      L133: {
                        L134: {
                          var7 = qn.field_g;
                          if (64 > var7) {
                            break L134;
                          } else {
                            L135: {
                              if (192 < var7) {
                                break L135;
                              } else {
                                var6_int = 255;
                                if (var11 == 0) {
                                  break L133;
                                } else {
                                  break L135;
                                }
                              }
                            }
                            var6_int = (48960 - 255 * var7) / 64;
                            if (var11 == 0) {
                              break L133;
                            } else {
                              break L134;
                            }
                          }
                        }
                        var6_int = var7 * 255 / 64;
                        break L133;
                      }
                      L136: {
                        L137: {
                          var8 = 45;
                          if (var5.field_m < 0) {
                            break L137;
                          } else {
                            var9_ref_String = rb.field_d[var5.field_m];
                            if (~var5.field_m <= ~qw.field_a.length) {
                              break L136;
                            } else {
                              var8 += 65;
                              qw.field_a[var5.field_m].a(-180 + rj.field_c + 53, 45, 64, 64, 0, var6_int << 24 | 16777215, 1);
                              if (var11 == 0) {
                                break L136;
                              } else {
                                break L137;
                              }
                            }
                          }
                        }
                        var9_ref_String = aa.field_b;
                        break L136;
                      }
                      int discarded$66 = bq.field_c.a(150, var6_int << 24, 0, 170, -180 + rj.field_c, (int[]) null, (hr[]) null, -1 + var8, var6_int << 24, 0, 18, -8787, var9_ref_String, (aa) null, 1, 0);
                      int discarded$67 = bq.field_c.a(150, var6_int << 24, 0, 170, rj.field_c - 180, (int[]) null, (hr[]) null, 1 + var8, var6_int << 24, 0, 18, -8787, var9_ref_String, (aa) null, 1, 0);
                      int discarded$68 = bq.field_c.a(150, var6_int << 24 | 16777215, 0, 170, rj.field_c - 180, (int[]) null, (hr[]) null, var8, -1, 0, 18, -8787, var9_ref_String, (aa) null, 1, 0);
                      break L132;
                    }
                  }
                  L138: {
                    L139: {
                      if (!oj.a(false)) {
                        break L139;
                      } else {
                        var6_int = 0 * (-lk.field_b + gi.field_h) / 2;
                        var7 = 0 * (-lk.field_c + wq.field_b) / 2;
                        cf.a(var6_int, var7, 126);
                        kn.a(false, (byte) -122);
                        ((Sumoblitz) this).field_F = true;
                        if (var11 == 0) {
                          break L138;
                        } else {
                          break L139;
                        }
                      }
                    }
                    L140: {
                      if (sj.a(-124)) {
                        break L140;
                      } else {
                        int discarded$69 = 52;
                        if (ws.b()) {
                          break L138;
                        } else {
                          ((Sumoblitz) this).field_F = false;
                          if (var11 == 0) {
                            break L138;
                          } else {
                            break L140;
                          }
                        }
                      }
                    }
                    var6_int = (-lk.field_b + gi.field_h) * 0 / 2;
                    var7 = (-lk.field_c + wq.field_b) * 0 / 2;
                    ls.a(var6_int, -66, var7);
                    kn.a(false, -124);
                    ((Sumoblitz) this).field_F = true;
                    break L138;
                  }
                  L141: {
                    if (!((Sumoblitz) this).field_F) {
                      break L141;
                    } else {
                      L142: {
                        var6_int = lk.field_b;
                        var7 = lk.field_c;
                        if (null == ((Sumoblitz) this).field_K) {
                          break L142;
                        } else {
                          var6_int = ((Sumoblitz) this).field_K.field_x;
                          var7 = ((Sumoblitz) this).field_K.field_u;
                          break L142;
                        }
                      }
                      L143: {
                        var8 = (-var6_int + gi.field_h) / 2;
                        var9 = (-var7 + wq.field_b) / 2;
                        if (!oj.a(false)) {
                          break L143;
                        } else {
                          if (null != ((Sumoblitz) this).field_K) {
                            var8 = ik.c(-10517);
                            int discarded$70 = 3878;
                            var9 = fd.b();
                            break L143;
                          } else {
                            break L143;
                          }
                        }
                      }
                      var10 = wq.a(var4, (byte) 70);
                      var10.a((byte) -88, var9, var7 + var9, var8, var6_int + var8);
                      var9 = (-lk.field_c + wq.field_b) / 2;
                      var8 = (-lk.field_b + gi.field_h) / 2;
                      var4.SA(var8, var9, lk.field_b, lk.field_c, lk.field_a, 0, lk.field_b);
                      var10.a(29709);
                      break L141;
                    }
                  }
                  var4.a(true);
                  break L118;
                }
                int discarded$71 = 105;
                dw.a(er.field_c);
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
        int stackIn_3_0 = 0;
        int stackIn_6_0 = 0;
        int stackIn_9_0 = 0;
        int stackIn_12_0 = 0;
        int stackIn_15_0 = 0;
        int stackIn_18_0 = 0;
        int stackIn_21_0 = 0;
        int stackIn_24_0 = 0;
        int stackIn_27_0 = 0;
        int stackIn_30_0 = 0;
        int stackIn_33_0 = 0;
        int stackOut_2_0 = 0;
        int stackOut_1_0 = 0;
        int stackOut_5_0 = 0;
        int stackOut_4_0 = 0;
        int stackOut_8_0 = 0;
        int stackOut_7_0 = 0;
        int stackOut_11_0 = 0;
        int stackOut_10_0 = 0;
        int stackOut_14_0 = 0;
        int stackOut_13_0 = 0;
        int stackOut_17_0 = 0;
        int stackOut_16_0 = 0;
        int stackOut_20_0 = 0;
        int stackOut_19_0 = 0;
        int stackOut_23_0 = 0;
        int stackOut_22_0 = 0;
        int stackOut_26_0 = 0;
        int stackOut_25_0 = 0;
        int stackOut_29_0 = 0;
        int stackOut_28_0 = 0;
        int stackOut_32_0 = 0;
        int stackOut_31_0 = 0;
        L0: {
          Sumoblitz.s(0);
          kc.b((byte) -19);
          int discarded$229 = 6334;
          ge.a();
          int discarded$230 = 117;
          jn.c();
          ha.e(0);
          int discarded$231 = -22;
          fs.c();
          int discarded$232 = 0;
          wq.a();
          oi.a(param0);
          int discarded$233 = -1;
          ik.b();
          int discarded$234 = 5460;
          hw.a();
          ud.c(-127);
          rn.a(13921);
          int discarded$235 = 20283;
          ma.a();
          bi.a((byte) 84);
          hb.a(-2851);
          wv.a(true);
          int discarded$236 = 119;
          fn.k();
          su.b((byte) -18);
          cc.a(126);
          int discarded$237 = 8;
          os.a();
          int discarded$238 = -75;
          ns.a();
          lk.a();
          int discarded$239 = 35;
          ki.a();
          wf.a(116);
          int discarded$240 = -71;
          ws.a();
          int discarded$241 = 0;
          hk.a();
          int discarded$242 = 14;
          gs.a();
          int discarded$243 = -14;
          kt.a();
          int discarded$244 = 95;
          kd.a();
          int discarded$245 = -106;
          uq.a();
          int discarded$246 = 23050;
          br.a();
          int discarded$247 = 0;
          lb.a();
          int discarded$248 = -1;
          uc.a();
          int discarded$249 = -68;
          vs.a();
          int discarded$250 = 96;
          uw.c();
          int discarded$251 = 41;
          ov.a();
          int discarded$252 = 17;
          mn.a();
          int discarded$253 = 1;
          cq.a();
          og.a(false);
          ak.a(-6);
          int discarded$254 = 42;
          qu.a();
          int discarded$255 = 30;
          kv.a();
          int discarded$256 = 118;
          vm.a();
          if (param0) {
            stackOut_2_0 = 0;
            stackIn_3_0 = stackOut_2_0;
            break L0;
          } else {
            stackOut_1_0 = 1;
            stackIn_3_0 = stackOut_1_0;
            break L0;
          }
        }
        L1: {
          gd.a(stackIn_3_0 != 0);
          int discarded$257 = 87;
          ti.a();
          rj.a(2);
          dt.d(68);
          ms.b((byte) 80);
          int discarded$258 = 0;
          ta.a();
          bs.f(-95);
          te.b(6406);
          uu.a((byte) 115);
          sh.g();
          rh.a((byte) 81);
          du.h();
          int discarded$259 = -3;
          dn.a();
          int discarded$260 = -1;
          kp.a();
          int discarded$261 = -95;
          sg.a();
          int discarded$262 = 98;
          jg.a();
          int discarded$263 = -45;
          rb.a();
          int discarded$264 = 127;
          hc.a();
          bk.a(4);
          int discarded$265 = 115;
          nj.a();
          if (param0) {
            stackOut_5_0 = 0;
            stackIn_6_0 = stackOut_5_0;
            break L1;
          } else {
            stackOut_4_0 = 1;
            stackIn_6_0 = stackOut_4_0;
            break L1;
          }
        }
        L2: {
          ig.a(stackIn_6_0 != 0);
          int discarded$266 = -111;
          vp.a();
          int discarded$267 = -89;
          vd.a();
          dg.g(128);
          int discarded$268 = 0;
          uk.g();
          int discarded$269 = 1;
          m.e();
          int discarded$270 = 105;
          dc.m();
          int discarded$271 = 124;
          gt.l();
          js.g(0);
          int discarded$272 = -118;
          cv.g();
          int discarded$273 = 121;
          vq.g();
          lj.a((byte) 108);
          int discarded$274 = 117;
          cp.a();
          int discarded$275 = 100;
          pc.a();
          int discarded$276 = 113;
          bc.a();
          ah.c(0);
          int discarded$277 = 113;
          vl.a();
          nm.c(1432625512);
          int discarded$278 = 544;
          lg.b();
          tr.c(1);
          int discarded$279 = 32;
          jp.c();
          int discarded$280 = 41;
          bb.b();
          ii.a((byte) -55);
          int discarded$281 = 28;
          ps.a();
          int discarded$282 = 1;
          er.b();
          int discarded$283 = 31295;
          nt.d();
          int discarded$284 = 0;
          qo.a();
          int discarded$285 = 2;
          kh.a();
          dr.c(false);
          int discarded$286 = -68;
          fe.n();
          int discarded$287 = 91;
          tl.f();
          bw.c((byte) 122);
          int discarded$288 = -1384583532;
          cb.a();
          lq.a(param0);
          int discarded$289 = 1;
          rf.a();
          int discarded$290 = -103;
          za.a();
          int discarded$291 = 24599;
          pl.j();
          pi.a(20437);
          int discarded$292 = -1;
          ds.a();
          qn.a(0);
          int discarded$293 = 102;
          ss.a();
          vn.a();
          int discarded$294 = -11418;
          hm.a();
          int discarded$295 = 1;
          rv.a();
          int discarded$296 = 16;
          qi.a();
          int discarded$297 = 8192;
          se.b();
          if (param0) {
            stackOut_8_0 = 0;
            stackIn_9_0 = stackOut_8_0;
            break L2;
          } else {
            stackOut_7_0 = 1;
            stackIn_9_0 = stackOut_7_0;
            break L2;
          }
        }
        L3: {
          aa.a(stackIn_9_0 != 0);
          sb.a(true);
          mu.a(-109);
          pj.d(37);
          ee.a(1600);
          int discarded$298 = 100;
          sr.c();
          int discarded$299 = 92;
          wo.a();
          int discarded$300 = 0;
          wn.a();
          int discarded$301 = -88;
          kw.a();
          int discarded$302 = -123;
          ea.b();
          sj.a(true);
          int discarded$303 = -115;
          jo.a();
          int discarded$304 = -1685;
          lw.a();
          no.a(10);
          int discarded$305 = 0;
          vg.a();
          int discarded$306 = 0;
          fl.b();
          rg.e((byte) 95);
          ag.c(82);
          int discarded$307 = -126;
          cd.a();
          int discarded$308 = 101;
          hf.j();
          int discarded$309 = 58;
          ld.a();
          wp.a((byte) 54);
          int discarded$310 = -16099;
          nd.f();
          int discarded$311 = 1;
          sp.d();
          ao.a(0);
          int discarded$312 = -122;
          ok.b();
          pp.a(2);
          t.f(1);
          ro.c(0);
          fv.d((byte) 62);
          int discarded$313 = -90;
          wl.a();
          int discarded$314 = 64;
          ql.d();
          int discarded$315 = -96;
          am.d();
          int discarded$316 = 1;
          rw.c();
          fa.a(false);
          nk.c();
          q.a();
          int discarded$317 = -66;
          eh.a();
          int discarded$318 = -104;
          l.a();
          int discarded$319 = 0;
          gk.a();
          int discarded$320 = 1;
          im.a();
          gh.a(-126);
          kr.a(-119);
          int discarded$321 = -127;
          up.a();
          jk.a((byte) -104);
          dq.a(-1);
          ci.b(8192);
          int discarded$322 = 18260;
          bf.b();
          int discarded$323 = -100;
          nn.a();
          w.a();
          ku.a(true);
          rd.c(false);
          int discarded$324 = 3;
          pb.b();
          int discarded$325 = 122;
          ih.a();
          lo.a();
          int discarded$326 = -6811;
          oq.g();
          qw.a(-122);
          is.a(false);
          int discarded$327 = 1;
          sd.a();
          int discarded$328 = 1;
          un.a();
          int discarded$329 = 123;
          ow.a();
          int discarded$330 = 1284;
          sv.a();
          int discarded$331 = 85;
          g.a();
          int discarded$332 = 127;
          hh.a();
          fd.c(121);
          int discarded$333 = -48;
          fh.d();
          qg.a();
          int discarded$334 = 0;
          qe.a();
          int discarded$335 = -58;
          np.a();
          int discarded$336 = 125;
          tj.a();
          int discarded$337 = 111;
          td.a();
          int discarded$338 = 110;
          mq.a();
          int discarded$339 = 6;
          o.b();
          wm.a(param0);
          int discarded$340 = -107;
          rt.g();
          int discarded$341 = -15648;
          qq.l();
          dh.j(82);
          ur.k(0);
          pq.a(-1346554936);
          int discarded$342 = -18490;
          pe.g();
          int discarded$343 = -118;
          ar.f();
          int discarded$344 = -21433;
          vr.a();
          int discarded$345 = -79;
          bn.g();
          int discarded$346 = 454;
          wr.a();
          int discarded$347 = 0;
          na.a();
          int discarded$348 = -109;
          ll.b();
          th.f(false);
          int discarded$349 = 0;
          vb.a();
          if (param0) {
            stackOut_11_0 = 0;
            stackIn_12_0 = stackOut_11_0;
            break L3;
          } else {
            stackOut_10_0 = 1;
            stackIn_12_0 = stackOut_10_0;
            break L3;
          }
        }
        L4: {
          fu.d(stackIn_12_0 != 0);
          if (param0) {
            stackOut_14_0 = 0;
            stackIn_15_0 = stackOut_14_0;
            break L4;
          } else {
            stackOut_13_0 = 1;
            stackIn_15_0 = stackOut_13_0;
            break L4;
          }
        }
        L5: {
          mb.a(stackIn_15_0 != 0);
          int discarded$350 = -73;
          ce.a();
          int discarded$351 = 5423;
          hi.a();
          rp.b(param0);
          eu.a(false);
          fr.d((byte) 66);
          int discarded$352 = -24;
          kk.b();
          int discarded$353 = 255;
          iv.a();
          int discarded$354 = 0;
          eb.b();
          gq.c(false);
          int discarded$355 = 106;
          ic.b();
          int discarded$356 = -69;
          b.a();
          cm.b(0);
          dl.b(0);
          ht.a((byte) -81);
          us.c((byte) 28);
          int discarded$357 = -21;
          bt.c();
          int discarded$358 = 1;
          hp.d();
          int discarded$359 = 8;
          aw.G();
          ls.a(2);
          io.a(0);
          sk.b(128);
          int discarded$360 = 49;
          ut.b();
          hv.b(-7520);
          int discarded$361 = 0;
          ko.d();
          tf.a((byte) 17);
          mr.a((byte) -109);
          int discarded$362 = -119;
          rq.c();
          int discarded$363 = 1;
          em.a();
          int discarded$364 = 26238;
          il.a();
          int discarded$365 = 786336;
          jl.c();
          hq.a((byte) 101);
          int discarded$366 = 1;
          gu.a();
          int discarded$367 = 0;
          mi.a();
          int discarded$368 = -100;
          mp.a();
          int discarded$369 = 61303;
          hu.b();
          ck.a(-99);
          int discarded$370 = 0;
          sc.a();
          int discarded$371 = -26791;
          rs.a();
          int discarded$372 = 0;
          jd.d();
          int discarded$373 = -1;
          jh.g();
          st.a((byte) 118);
          mc.f(param0);
          qk.g((byte) -43);
          int discarded$374 = 50;
          kq.k();
          if (param0) {
            stackOut_17_0 = 0;
            stackIn_18_0 = stackOut_17_0;
            break L5;
          } else {
            stackOut_16_0 = 1;
            stackIn_18_0 = stackOut_16_0;
            break L5;
          }
        }
        L6: {
          we.e(stackIn_18_0 != 0);
          int discarded$375 = 17;
          si.b();
          int discarded$376 = -13252;
          ts.a();
          hl.a(-103);
          int discarded$377 = 54;
          jt.d();
          av.f(24);
          nw.b(1183);
          re.a();
          int discarded$378 = 28322;
          k.a();
          int discarded$379 = -1;
          kn.b();
          le.a();
          int discarded$380 = 119;
          li.d();
          ka.a((byte) -59);
          int discarded$381 = 33;
          r.a();
          int discarded$382 = -62;
          sn.a();
          int discarded$383 = -21551;
          ek.d();
          int discarded$384 = -58;
          ve.a();
          int discarded$385 = -76;
          bq.a();
          int discarded$386 = 60;
          ch.a();
          int discarded$387 = 1821625704;
          lf.a();
          int discarded$388 = -21057;
          kf.e();
          int discarded$389 = -20388;
          ad.d();
          if (param0) {
            stackOut_20_0 = 0;
            stackIn_21_0 = stackOut_20_0;
            break L6;
          } else {
            stackOut_19_0 = 1;
            stackIn_21_0 = stackOut_19_0;
            break L6;
          }
        }
        L7: {
          f.d(stackIn_21_0 != 0);
          wh.a(-1);
          int discarded$390 = 1;
          uj.a();
          int discarded$391 = 107;
          jq.a();
          int discarded$392 = -51;
          tq.a();
          pt.a((byte) 43);
          int discarded$393 = 1;
          hn.b();
          int discarded$394 = 1;
          kb.a();
          int discarded$395 = -124;
          sl.b();
          int discarded$396 = -38;
          wt.c();
          int discarded$397 = 4;
          es.c();
          int discarded$398 = 1;
          tt.c();
          int discarded$399 = 2;
          mo.e();
          int discarded$400 = 429166529;
          vk.b();
          gi.c(8192);
          pr.d(7064);
          int discarded$401 = -127;
          au.c();
          ga.a(true);
          int discarded$402 = 3;
          lv.c();
          int discarded$403 = -19;
          gr.c();
          mk.a(-25140);
          int discarded$404 = -124;
          ei.a();
          int discarded$405 = 0;
          ji.a();
          he.a(124);
          int discarded$406 = -23787;
          jm.a();
          vu.a((byte) -69);
          pu.a(1);
          int discarded$407 = 0;
          ng.d();
          int discarded$408 = 1;
          ib.e();
          int discarded$409 = 79;
          uo.d();
          ni.d(false);
          ml.c((byte) 30);
          en.b((byte) 101);
          ff.b(param0);
          int discarded$410 = 64;
          ab.a();
          sq.a(-127);
          rc.b(124);
          go.a((byte) -17);
          pn.d(12);
          int discarded$411 = 79;
          wj.d();
          if (param0) {
            stackOut_23_0 = 0;
            stackIn_24_0 = stackOut_23_0;
            break L7;
          } else {
            stackOut_22_0 = 1;
            stackIn_24_0 = stackOut_22_0;
            break L7;
          }
        }
        L8: {
          ej.d(stackIn_24_0 != 0);
          int discarded$412 = -60;
          oh.a();
          ua.a((byte) 13);
          ju.a(param0);
          int discarded$413 = 123;
          fq.a();
          int discarded$414 = 1;
          ia.a();
          int discarded$415 = -95;
          vv.a();
          if (param0) {
            stackOut_26_0 = 0;
            stackIn_27_0 = stackOut_26_0;
            break L8;
          } else {
            stackOut_25_0 = 1;
            stackIn_27_0 = stackOut_25_0;
            break L8;
          }
        }
        L9: {
          lu.b(stackIn_27_0 != 0);
          ph.a(1882049616);
          int discarded$416 = -70;
          qj.a();
          int discarded$417 = -114;
          fw.c();
          bl.a(false);
          of.a(-26437);
          if (param0) {
            stackOut_29_0 = 0;
            stackIn_30_0 = stackOut_29_0;
            break L9;
          } else {
            stackOut_28_0 = 1;
            stackIn_30_0 = stackOut_28_0;
            break L9;
          }
        }
        L10: {
          id.c(stackIn_30_0 != 0);
          int discarded$418 = 0;
          df.a();
          int discarded$419 = 1022768328;
          dj.a();
          pd.a((byte) -127);
          int discarded$420 = 126;
          ue.b();
          int discarded$421 = 118;
          bv.b();
          int discarded$422 = 2147483647;
          nl.b();
          int discarded$423 = 22760;
          c.c();
          int discarded$424 = -4;
          oj.a();
          in.a((byte) -84);
          int discarded$425 = -31;
          uv.a();
          int discarded$426 = 0;
          cn.e();
          km.a(-11807);
          int discarded$427 = 1;
          gn.a();
          int discarded$428 = 0;
          to.c();
          if (param0) {
            stackOut_32_0 = 0;
            stackIn_33_0 = stackOut_32_0;
            break L10;
          } else {
            stackOut_31_0 = 1;
            stackIn_33_0 = stackOut_31_0;
            break L10;
          }
        }
        eg.c(stackIn_33_0 != 0);
        int discarded$429 = 12;
        hg.a();
        int discarded$430 = 12;
        lh.a();
        int discarded$431 = 0;
        cj.a();
        int discarded$432 = 90;
        mm.a();
        int discarded$433 = 89;
        an.a();
        int discarded$434 = -121;
        bj.a();
        int discarded$435 = 119;
        qr.a();
        int discarded$436 = 99;
        om.a();
        int discarded$437 = 2;
        aj.e();
        int discarded$438 = 0;
        gw.c();
        eq.e(3190);
        int discarded$439 = 6408;
        be.e();
        int discarded$440 = 0;
        gb.e();
        vi.c(true);
        as.e(83);
        int discarded$441 = 4;
        cl.f();
        qc.b((byte) 105);
        jj.a(0);
        wd.b((byte) 88);
        int discarded$442 = 1;
        vf.b();
        rl.a(480);
        sm.a((byte) -30);
        int discarded$443 = 122;
        tk.b();
        fm.a((byte) -115);
        int discarded$444 = 0;
        tm.a();
        int discarded$445 = 59;
        dv.a();
        ac.d(false);
        int discarded$446 = 67;
        hd.f();
        int discarded$447 = 18;
        qv.c();
        lt.a(1);
        ou.c((byte) -119);
        int discarded$448 = -1;
        tc.f();
        wk.b(false);
        int discarded$449 = -91;
        jc.c();
        nq.c((byte) -31);
        jf.a((byte) 91);
        int discarded$450 = 18232;
        s.a();
        int discarded$451 = 1431655765;
        gf.a();
        int discarded$452 = -75;
        ct.d();
        int discarded$453 = -11701;
        ks.d();
        int discarded$454 = 16766976;
        lr.c();
        int discarded$455 = 6;
        lm.b();
        dk.a(-102);
        ip.d((byte) 110);
        int discarded$456 = 1;
        ke.b();
        int discarded$457 = 0;
        gg.a();
        ((Sumoblitz) this).field_D = null;
        ((Sumoblitz) this).field_K = null;
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
                          int discarded$8 = -96;
                          var3_int = fi.a(5, he.field_o);
                          dj discarded$9 = fe.a(-113, rc.field_l[22 + var3_int]);
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
                      int discarded$10 = -96;
                      var3_int = fi.a(lg.field_d[param0][1].length, he.field_o);
                      dj discarded$11 = fe.a(89, lg.field_d[param0][1][var3_int]);
                      if (var5 == 0) {
                        break L1;
                      } else {
                        break L3;
                      }
                    }
                    int discarded$12 = -96;
                    var3_int = fi.a(lg.field_d[param0][2].length, he.field_o);
                    dj discarded$13 = fe.a(-121, lg.field_d[param0][2][var3_int]);
                    if (var5 == 0) {
                      break L1;
                    } else {
                      break L2;
                    }
                  }
                  int discarded$14 = -96;
                  var3_int = fi.a(lg.field_d[param0][0].length, he.field_o);
                  dj discarded$15 = fe.a(42, lg.field_d[param0][0][var3_int]);
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
          throw qo.a((Throwable) (Object) var3, "Sumoblitz.OA(" + param0 + ',' + param1 + ',' + param2 + ')');
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
