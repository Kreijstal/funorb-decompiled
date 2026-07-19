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
            stackOut_25_0 = (RuntimeException) (var4);
            stackOut_25_1 = new StringBuilder().append("Sumoblitz.SA(");
            stackIn_28_0 = stackOut_25_0;
            stackIn_28_1 = stackOut_25_1;
            stackIn_26_0 = stackOut_25_0;
            stackIn_26_1 = stackOut_25_1;
            if (args == null) {
              stackOut_28_0 = (RuntimeException) ((Object) stackIn_28_0);
              stackOut_28_1 = (StringBuilder) ((Object) stackIn_28_1);
              stackOut_28_2 = "null";
              stackIn_29_0 = stackOut_28_0;
              stackIn_29_1 = stackOut_28_1;
              stackIn_29_2 = stackOut_28_2;
              break L6;
            } else {
              stackOut_26_0 = (RuntimeException) ((Object) stackIn_26_0);
              stackOut_26_1 = (StringBuilder) ((Object) stackIn_26_1);
              stackOut_26_2 = "{...}";
              stackIn_29_0 = stackOut_26_0;
              stackIn_29_1 = stackOut_26_1;
              stackIn_29_2 = stackOut_26_2;
              break L6;
            }
          }
          L7: {
            stackOut_29_0 = (RuntimeException) ((Object) stackIn_29_0);
            stackOut_29_1 = ((StringBuilder) (Object) stackIn_29_1).append(stackIn_29_2).append(',').append(param1).append(',').append(param2).append(',');
            stackIn_32_0 = stackOut_29_0;
            stackIn_32_1 = stackOut_29_1;
            stackIn_30_0 = stackOut_29_0;
            stackIn_30_1 = stackOut_29_1;
            if (param3 == null) {
              stackOut_32_0 = (RuntimeException) ((Object) stackIn_32_0);
              stackOut_32_1 = (StringBuilder) ((Object) stackIn_32_1);
              stackOut_32_2 = "null";
              stackIn_33_0 = stackOut_32_0;
              stackIn_33_1 = stackOut_32_1;
              stackIn_33_2 = stackOut_32_2;
              break L7;
            } else {
              stackOut_30_0 = (RuntimeException) ((Object) stackIn_30_0);
              stackOut_30_1 = (StringBuilder) ((Object) stackIn_30_1);
              stackOut_30_2 = "{...}";
              stackIn_33_0 = stackOut_30_0;
              stackIn_33_1 = stackOut_30_1;
              stackIn_33_2 = stackOut_30_2;
              break L7;
            }
          }
          throw qo.a((Throwable) ((Object) stackIn_33_0), stackIn_33_2 + ')');
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
          throw qo.a((Throwable) ((Object) var2), "Sumoblitz.L(" + param0 + ')');
        }
    }

    private final void g(byte param0) {
        int fieldTemp$2 = 0;
        ms discarded$3 = null;
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
                fieldTemp$2 = qn.field_g + 1;
                qn.field_g = qn.field_g + 1;
                if ((fieldTemp$2 ^ -1) != -257) {
                  break L2;
                } else {
                  qn.field_g = 0;
                  discarded$3 = pl.field_v.c(9);
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
                      if (-31 == (eh.field_a ^ -1)) {
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
                  stackOut_58_0 = (qu) ((Object) stackIn_58_0);
                  stackOut_58_1 = 0;
                  stackIn_59_0 = stackOut_58_0;
                  stackIn_59_1 = stackOut_58_1;
                  break L12;
                } else {
                  stackOut_54_0 = (qu) ((Object) stackIn_54_0);
                  stackIn_56_0 = stackOut_54_0;
                  stackOut_56_0 = (qu) ((Object) stackIn_56_0);
                  stackOut_56_1 = 1;
                  stackIn_59_0 = stackOut_56_0;
                  stackIn_59_1 = stackOut_56_1;
                  break L12;
                }
              }
              L13: {
                ((qu) (Object) stackIn_59_0).a(stackIn_59_1 != 0, (byte) -88);
                if ((rc.field_k ^ -1) == (nj.field_b ^ -1)) {
                  break L13;
                } else {
                  eh.field_a = eh.field_a + 1;
                  if (-31 == (eh.field_a ^ -1)) {
                    L14: {
                      if (-3 == (nj.field_b ^ -1)) {
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
          throw qo.a((Throwable) ((Object) var2), "Sumoblitz.TA(" + param0 + ')');
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
            this.a(100, 3, 1, 10, 2, 0, true);
            var2 = new bs();
            var2.a(177, 128, 9);
            var3 = new ud(var2, new bs());
            aa.a(lt.field_m, true, var3, (byte) -125, 48000, (java.awt.Component) ((Object) qn.field_f));
            dt.field_f = false;
            qc.field_e = var2;
            this.a(true, true, (byte) 60, true, false);
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2_ref = decompiledCaughtException;
          throw qo.a((Throwable) ((Object) var2_ref), "Sumoblitz.C(" + param0 + ')');
        }
    }

    final void d(int param0) {
        try {
            int discarded$3 = 0;
            int discarded$4 = 0;
            int discarded$5 = 0;
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
            int decompiledRegionSelector0 = 0;
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
                  decompiledRegionSelector0 = 0;
                  break L0;
                } else {
                  if (sa.field_j) {
                    if (su.a(param0 ^ 0)) {
                      L1: {
                        if (!nq.field_h.a(false)) {
                          break L1;
                        } else {
                          if (!this.h((byte) -124)) {
                            decompiledRegionSelector0 = 3;
                            break L0;
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
                        var4 = (ge) ((Object) pl.field_v.b(param0 + -121));
                        if (null != var4) {
                          L11: {
                            L12: {
                              var6 = qn.field_g;
                              if (-65 < (var6 ^ -1)) {
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
                              if ((var4.field_m ^ -1) <= -1) {
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
                              qw.field_a[var4.field_m].a(-32 + rj.field_c - 180 + 85, 45, 64, 64, 0, 16777215 | var5_int << -107247976, 1);
                              break L14;
                            } else {
                              break L14;
                            }
                          }
                          discarded$3 = bq.field_c.a(150, var5_int << 1928370328, 0, 170, -180 + rj.field_c, (int[]) null, (hr[]) null, -1 + var7, var5_int << -1003925256, 0, 18, -8787, var8_ref_String, (aa) null, 1, 0);
                          discarded$4 = bq.field_c.a(150, var5_int << -546648104, 0, 170, -180 + rj.field_c, (int[]) null, (hr[]) null, 1 + var7, var5_int << -410178184, 0, 18, -8787, var8_ref_String, (aa) null, 1, 0);
                          discarded$5 = bq.field_c.a(150, var5_int << 1364626776 | 16777215, 0, 170, -180 + rj.field_c, (int[]) null, (hr[]) null, var7, -1, 0, 18, -8787, var8_ref_String, (aa) null, 1, 0);
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
                            this.field_F = true;
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
                              this.field_F = false;
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
                        this.field_F = true;
                        break L16;
                      }
                      L19: {
                        if (!this.field_F) {
                          break L19;
                        } else {
                          L20: {
                            var5_int = lk.field_b;
                            var6 = lk.field_c;
                            if (this.field_K != null) {
                              var6 = this.field_K.field_u;
                              var5_int = this.field_K.field_x;
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
                              if (this.field_K != null) {
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
                      decompiledRegionSelector0 = 4;
                      break L0;
                    } else {
                      pe.a(param0 ^ 20, 100.0f, fl.field_s);
                      od.a(-88, var2_ref);
                      decompiledRegionSelector0 = 2;
                      break L0;
                    }
                  } else {
                    od.a(-62, var2_ref);
                    decompiledRegionSelector0 = 1;
                    break L0;
                  }
                }
              }
            } catch (java.lang.RuntimeException decompiledCaughtParameter1) {
              decompiledCaughtException = decompiledCaughtParameter1;
              var2 = (RuntimeException) (Object) decompiledCaughtException;
              throw qo.a((Throwable) ((Object) var2), "Sumoblitz.I(" + param0 + ')');
            }
            if (decompiledRegionSelector0 == 0) {
              return;
            } else {
              if (decompiledRegionSelector0 == 1) {
                return;
              } else {
                if (decompiledRegionSelector0 == 2) {
                  return;
                } else {
                  if (decompiledRegionSelector0 == 3) {
                    return;
                  } else {
                    return;
                  }
                }
              }
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
          throw qo.a((Throwable) ((Object) var2), "Sumoblitz.QA(" + param0 + ')');
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
            throw qo.a((Throwable) ((Object) runtimeException), "Sumoblitz.UA(" + param0 + ')');
        }
    }

    final void b(int param0) {
        boolean discarded$1 = false;
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
        int decompiledRegionSelector0 = 0;
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
              this.b(stackIn_11_1 != 0, -103);
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
                this.m(106);
                if (in.g(-33)) {
                  L5: {
                    if (!we.g(-1)) {
                      break L5;
                    } else {
                      discarded$1 = this.a(false, true);
                      break L5;
                    }
                  }
                  decompiledRegionSelector0 = 0;
                  break L0;
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
                            if ((var2_int ^ -1) == -5) {
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
                      var2_int = this.a(stackIn_86_1, stackIn_86_2 != 0);
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
                      var3_ref_hg = (hg) ((Object) pn.field_q.c(9));
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
                    this.q(9289);
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
                  var3 = this.b(true);
                  if (var3 != 2) {
                    break L28;
                  } else {
                    we.a((byte) 70);
                    break L28;
                  }
                }
              }
              decompiledRegionSelector0 = 1;
              break L0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2 = decompiledCaughtException;
          throw qo.a((Throwable) ((Object) var2), "Sumoblitz.D(" + param0 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return;
        } else {
          return;
        }
    }

    private final boolean h(byte param0) {
        ha var2 = null;
        RuntimeException var2_ref = null;
        int stackIn_7_0 = 0;
        int stackIn_15_0 = 0;
        int decompiledRegionSelector0 = 0;
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
              decompiledRegionSelector0 = 0;
              break L0;
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
              decompiledRegionSelector0 = 1;
              break L0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2_ref = decompiledCaughtException;
          throw qo.a((Throwable) ((Object) var2_ref), "Sumoblitz.RA(" + param0 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return stackIn_7_0 != 0;
        } else {
          return stackIn_15_0 != 0;
        }
    }

    private final boolean a(boolean param0, boolean param1) {
        try {
            int discarded$17 = 0;
            int discarded$18 = 0;
            int discarded$19 = 0;
            int discarded$20 = 0;
            int discarded$21 = 0;
            int discarded$22 = 0;
            int discarded$23 = 0;
            int discarded$24 = 0;
            int discarded$25 = 0;
            int discarded$26 = 0;
            int discarded$27 = 0;
            int discarded$28 = 0;
            boolean discarded$29 = false;
            boolean discarded$30 = false;
            int discarded$31 = 0;
            int discarded$32 = 0;
            int discarded$33 = 0;
            RuntimeException var3 = null;
            java.awt.Canvas var3_ref = null;
            int var3_int = 0;
            ha var4 = null;
            int var5_int = 0;
            ge var5 = null;
            Exception var6 = null;
            int var6_int = 0;
            int var7 = 0;
            int var8 = 0;
            String var9_ref_String = null;
            int var9 = 0;
            pm var10 = null;
            int var11 = 0;
            int stackIn_9_0 = 0;
            int stackIn_14_0 = 0;
            int stackIn_20_0 = 0;
            int stackIn_23_0 = 0;
            int stackIn_29_0 = 0;
            int stackIn_35_0 = 0;
            int stackIn_41_0 = 0;
            int stackIn_47_0 = 0;
            int stackIn_53_0 = 0;
            int stackIn_59_0 = 0;
            int stackIn_65_0 = 0;
            int stackIn_73_0 = 0;
            ik stackIn_91_0 = null;
            ik stackIn_93_0 = null;
            ik stackIn_95_0 = null;
            ik stackIn_96_0 = null;
            int stackIn_96_1 = 0;
            int stackIn_134_0 = 0;
            int stackIn_188_0 = 0;
            int stackIn_190_0 = 0;
            int stackIn_249_0 = 0;
            int stackIn_276_0 = 0;
            int stackIn_303_0 = 0;
            int stackIn_363_0 = 0;
            int stackIn_415_0 = 0;
            int stackIn_423_0 = 0;
            int stackIn_425_0 = 0;
            ik stackIn_446_0 = null;
            ik stackIn_448_0 = null;
            ik stackIn_450_0 = null;
            ik stackIn_451_0 = null;
            int stackIn_451_1 = 0;
            int stackIn_492_0 = 0;
            int stackIn_545_0 = 0;
            int stackIn_606_0 = 0;
            int stackIn_657_0 = 0;
            int stackIn_675_0 = 0;
            int stackIn_677_0 = 0;
            int decompiledRegionSelector0 = 0;
            Throwable caughtException = null;
            Throwable decompiledCaughtException = null;
            int stackOut_13_0 = 0;
            ik stackOut_90_0 = null;
            ik stackOut_95_0 = null;
            int stackOut_95_1 = 0;
            ik stackOut_91_0 = null;
            ik stackOut_93_0 = null;
            int stackOut_93_1 = 0;
            int stackOut_133_0 = 0;
            boolean stackOut_131_0 = false;
            int stackOut_187_0 = 0;
            int stackOut_189_0 = 0;
            int stackOut_72_0 = 0;
            int stackOut_64_0 = 0;
            int stackOut_58_0 = 0;
            int stackOut_52_0 = 0;
            int stackOut_46_0 = 0;
            int stackOut_40_0 = 0;
            int stackOut_34_0 = 0;
            int stackOut_28_0 = 0;
            int stackOut_22_0 = 0;
            int stackOut_19_0 = 0;
            int stackOut_8_0 = 0;
            boolean stackOut_362_0 = false;
            int stackOut_360_0 = 0;
            int stackOut_414_0 = 0;
            ik stackOut_445_0 = null;
            ik stackOut_450_0 = null;
            int stackOut_450_1 = 0;
            ik stackOut_446_0 = null;
            ik stackOut_448_0 = null;
            int stackOut_448_1 = 0;
            int stackOut_491_0 = 0;
            boolean stackOut_489_0 = false;
            int stackOut_544_0 = 0;
            boolean stackOut_605_0 = false;
            int stackOut_603_0 = 0;
            int stackOut_656_0 = 0;
            int stackOut_674_0 = 0;
            int stackOut_676_0 = 0;
            int stackOut_422_0 = 0;
            int stackOut_424_0 = 0;
            int stackOut_248_0 = 0;
            boolean stackOut_246_0 = false;
            int stackOut_275_0 = 0;
            int stackOut_273_0 = 0;
            int stackOut_302_0 = 0;
            var11 = field_L ? 1 : 0;
            try {
              L0: {
                cl.e(-69);
                if (null != hl.field_d) {
                  L1: {
                    if (!pi.field_c.b((byte) 127)) {
                      break L1;
                    } else {
                      if (pi.field_c.a("basic", 100)) {
                        if (!pi.field_c.a("arialbold14", 100)) {
                          pe.a(20, 4.0f, pt.a("arialbold14", pi.field_c, ce.field_l, true, ow.field_a));
                          stackOut_13_0 = 0;
                          stackIn_14_0 = stackOut_13_0;
                          decompiledRegionSelector0 = 1;
                          break L0;
                        } else {
                          L2: {
                            if (!vb.field_J.b((byte) 127)) {
                              break L2;
                            } else {
                              if (vb.field_J.a("arialbold14", 100)) {
                                if (pi.field_c.a("arial13", 100)) {
                                  L3: {
                                    if (!vb.field_J.b((byte) 127)) {
                                      break L3;
                                    } else {
                                      if (vb.field_J.a("arial13", 100)) {
                                        L4: {
                                          if (!hl.field_d.b((byte) 127)) {
                                            break L4;
                                          } else {
                                            if (hl.field_d.a(true)) {
                                              L5: {
                                                if (!er.field_c.b((byte) 127)) {
                                                  break L5;
                                                } else {
                                                  if (er.field_c.a(param1)) {
                                                    L6: {
                                                      if (!gg.field_r.b((byte) 127)) {
                                                        break L6;
                                                      } else {
                                                        if (gg.field_r.a(param1)) {
                                                          L7: {
                                                            if (!be.field_s.b((byte) 127)) {
                                                              break L7;
                                                            } else {
                                                              if (be.field_s.a(true)) {
                                                                L8: {
                                                                  if (!kf.field_v.b((byte) 127)) {
                                                                    break L8;
                                                                  } else {
                                                                    if (kf.field_v.a(true)) {
                                                                      L9: {
                                                                        if (!dq.field_Z.b((byte) 127)) {
                                                                          break L9;
                                                                        } else {
                                                                          if (dq.field_Z.a(true)) {
                                                                            L10: {
                                                                              if (!ik.field_d.b((byte) 127)) {
                                                                                break L10;
                                                                              } else {
                                                                                if (!ik.field_d.a(true)) {
                                                                                  break L10;
                                                                                } else {
                                                                                  L11: {
                                                                                    L12: {
                                                                                      pe.a(20, 65.0f, hv.field_e);
                                                                                      var3_ref = hk.b(-22);
                                                                                      lk.b();
                                                                                      if (!in.g(-61)) {
                                                                                        break L12;
                                                                                      } else {
                                                                                        ad.a((byte) 85, var3_ref, np.a(7));
                                                                                        if (var11 == 0) {
                                                                                          break L11;
                                                                                        } else {
                                                                                          break L12;
                                                                                        }
                                                                                      }
                                                                                    }
                                                                                    L13: {
                                                                                      if (sa.field_j) {
                                                                                        break L13;
                                                                                      } else {
                                                                                        od.a(-117, var3_ref);
                                                                                        if (var11 == 0) {
                                                                                          break L11;
                                                                                        } else {
                                                                                          break L13;
                                                                                        }
                                                                                      }
                                                                                    }
                                                                                    L14: {
                                                                                      if (su.a(0)) {
                                                                                        break L14;
                                                                                      } else {
                                                                                        pe.a(20, 100.0f, fl.field_s);
                                                                                        od.a(-117, var3_ref);
                                                                                        if (var11 == 0) {
                                                                                          break L11;
                                                                                        } else {
                                                                                          break L14;
                                                                                        }
                                                                                      }
                                                                                    }
                                                                                    L15: {
                                                                                      stackOut_90_0 = nq.field_h;
                                                                                      stackIn_95_0 = stackOut_90_0;
                                                                                      stackIn_91_0 = stackOut_90_0;
                                                                                      if (param1) {
                                                                                        stackOut_95_0 = (ik) ((Object) stackIn_95_0);
                                                                                        stackOut_95_1 = 0;
                                                                                        stackIn_96_0 = stackOut_95_0;
                                                                                        stackIn_96_1 = stackOut_95_1;
                                                                                        break L15;
                                                                                      } else {
                                                                                        stackOut_91_0 = (ik) ((Object) stackIn_91_0);
                                                                                        stackIn_93_0 = stackOut_91_0;
                                                                                        stackOut_93_0 = (ik) ((Object) stackIn_93_0);
                                                                                        stackOut_93_1 = 1;
                                                                                        stackIn_96_0 = stackOut_93_0;
                                                                                        stackIn_96_1 = stackOut_93_1;
                                                                                        break L15;
                                                                                      }
                                                                                    }
                                                                                    L16: {
                                                                                      if (((ik) (Object) stackIn_96_0).a(stackIn_96_1 == 0)) {
                                                                                        break L16;
                                                                                      } else {
                                                                                        if (!this.h((byte) -105)) {
                                                                                          break L11;
                                                                                        } else {
                                                                                          break L16;
                                                                                        }
                                                                                      }
                                                                                    }
                                                                                    L17: {
                                                                                      L18: {
                                                                                        var4 = nq.field_h.a(-97);
                                                                                        var4.GA(0);
                                                                                        ph.field_b.a(124, var4, false);
                                                                                        if ((rc.field_k ^ -1) != (nj.field_b ^ -1)) {
                                                                                          break L18;
                                                                                        } else {
                                                                                          if (-1 == nj.field_b) {
                                                                                            break L17;
                                                                                          } else {
                                                                                            iv.field_g[nj.field_b].a(255, var4, -2355);
                                                                                            if (var11 == 0) {
                                                                                              break L17;
                                                                                            } else {
                                                                                              break L18;
                                                                                            }
                                                                                          }
                                                                                        }
                                                                                      }
                                                                                      L19: {
                                                                                        var5_int = 255 * eh.field_a / 30;
                                                                                        if (-1 != nj.field_b) {
                                                                                          iv.field_g[nj.field_b].a(255 - var5_int, var4, -2355);
                                                                                          break L19;
                                                                                        } else {
                                                                                          break L19;
                                                                                        }
                                                                                      }
                                                                                      if ((rc.field_k ^ -1) != 0) {
                                                                                        iv.field_g[rc.field_k].a(var5_int, var4, -2355);
                                                                                        break L17;
                                                                                      } else {
                                                                                        break L17;
                                                                                      }
                                                                                    }
                                                                                    L20: {
                                                                                      if (!so.a((byte) 124)) {
                                                                                        break L20;
                                                                                      } else {
                                                                                        lk.a(0, 0, lk.field_b, lk.field_c);
                                                                                        pn.d((byte) -7);
                                                                                        break L20;
                                                                                      }
                                                                                    }
                                                                                    L21: {
                                                                                      if (0 != ra.field_e) {
                                                                                        var5_int = eh.field_a * 256 / 30;
                                                                                        if (-1 <= (var5_int ^ -1)) {
                                                                                          break L21;
                                                                                        } else {
                                                                                          lk.b(0, 0, lk.field_b, lk.field_c, 0, var5_int);
                                                                                          break L21;
                                                                                        }
                                                                                      } else {
                                                                                        break L21;
                                                                                      }
                                                                                    }
                                                                                    L22: {
                                                                                      if (!sj.a(-67)) {
                                                                                        break L22;
                                                                                      } else {
                                                                                        if (!so.a((byte) 115)) {
                                                                                          L23: {
                                                                                            if (null != gk.field_o) {
                                                                                              stackOut_133_0 = 1;
                                                                                              stackIn_134_0 = stackOut_133_0;
                                                                                              break L23;
                                                                                            } else {
                                                                                              stackOut_131_0 = ii.field_a;
                                                                                              stackIn_134_0 = stackOut_131_0 ? 1 : 0;
                                                                                              break L23;
                                                                                            }
                                                                                          }
                                                                                          kn.a(stackIn_134_0 != 0, 25);
                                                                                          break L22;
                                                                                        } else {
                                                                                          break L22;
                                                                                        }
                                                                                      }
                                                                                    }
                                                                                    L24: {
                                                                                      if (-3 < (ku.field_j ^ -1)) {
                                                                                        break L24;
                                                                                      } else {
                                                                                        if (!gw.field_v) {
                                                                                          break L24;
                                                                                        } else {
                                                                                          bq.field_c.a(20, 20, 16777215, Integer.toString(aj.field_B), (byte) -103, 1);
                                                                                          break L24;
                                                                                        }
                                                                                      }
                                                                                    }
                                                                                    L25: {
                                                                                      var5 = (ge) ((Object) pl.field_v.b(82));
                                                                                      if (null != var5) {
                                                                                        L26: {
                                                                                          L27: {
                                                                                            var7 = qn.field_g;
                                                                                            if ((var7 ^ -1) <= -65) {
                                                                                              break L27;
                                                                                            } else {
                                                                                              var6_int = 255 * var7 / 64;
                                                                                              if (var11 == 0) {
                                                                                                break L26;
                                                                                              } else {
                                                                                                break L27;
                                                                                              }
                                                                                            }
                                                                                          }
                                                                                          L28: {
                                                                                            if (var7 > 192) {
                                                                                              break L28;
                                                                                            } else {
                                                                                              var6_int = 255;
                                                                                              if (var11 == 0) {
                                                                                                break L26;
                                                                                              } else {
                                                                                                break L28;
                                                                                              }
                                                                                            }
                                                                                          }
                                                                                          var6_int = (-(255 * var7) + 48960) / 64;
                                                                                          break L26;
                                                                                        }
                                                                                        L29: {
                                                                                          L30: {
                                                                                            var8 = 45;
                                                                                            if (0 > var5.field_m) {
                                                                                              break L30;
                                                                                            } else {
                                                                                              var9_ref_String = rb.field_d[var5.field_m];
                                                                                              if ((qw.field_a.length ^ -1) >= (var5.field_m ^ -1)) {
                                                                                                break L29;
                                                                                              } else {
                                                                                                qw.field_a[var5.field_m].a(-32 + (85 + rj.field_c + -180), 45, 64, 64, 0, 16777215 | var6_int << 830870136, 1);
                                                                                                var8 += 65;
                                                                                                if (var11 == 0) {
                                                                                                  break L29;
                                                                                                } else {
                                                                                                  break L30;
                                                                                                }
                                                                                              }
                                                                                            }
                                                                                          }
                                                                                          var9_ref_String = aa.field_b;
                                                                                          break L29;
                                                                                        }
                                                                                        discarded$17 = bq.field_c.a(150, var6_int << 2138560952, 0, 170, rj.field_c - 180, (int[]) null, (hr[]) null, -1 + var8, var6_int << -959202280, 0, 18, -8787, var9_ref_String, (aa) null, 1, 0);
                                                                                        discarded$18 = bq.field_c.a(150, var6_int << 1113845016, 0, 170, -180 + rj.field_c, (int[]) null, (hr[]) null, 1 + var8, var6_int << -98083080, 0, 18, -8787, var9_ref_String, (aa) null, 1, 0);
                                                                                        discarded$19 = bq.field_c.a(150, var6_int << 1533176120 | 16777215, 0, 170, rj.field_c + -180, (int[]) null, (hr[]) null, var8, -1, 0, 18, -8787, var9_ref_String, (aa) null, 1, 0);
                                                                                        break L25;
                                                                                      } else {
                                                                                        break L25;
                                                                                      }
                                                                                    }
                                                                                    L31: {
                                                                                      L32: {
                                                                                        if (!oj.a(false)) {
                                                                                          break L32;
                                                                                        } else {
                                                                                          var6_int = (-lk.field_b + gi.field_h) * 0 / 2;
                                                                                          var7 = (-lk.field_c + wq.field_b) * 0 / 2;
                                                                                          cf.a(var6_int, var7, 76);
                                                                                          kn.a(false, (byte) -122);
                                                                                          this.field_F = true;
                                                                                          if (var11 == 0) {
                                                                                            break L31;
                                                                                          } else {
                                                                                            break L32;
                                                                                          }
                                                                                        }
                                                                                      }
                                                                                      L33: {
                                                                                        if (!sj.a(-126)) {
                                                                                          break L33;
                                                                                        } else {
                                                                                          var6_int = (-lk.field_b + gi.field_h) * 0 / 2;
                                                                                          var7 = (wq.field_b - lk.field_c) * 0 / 2;
                                                                                          ls.a(var6_int, -45, var7);
                                                                                          kn.a(false, -66);
                                                                                          this.field_F = true;
                                                                                          if (var11 == 0) {
                                                                                            break L31;
                                                                                          } else {
                                                                                            break L33;
                                                                                          }
                                                                                        }
                                                                                      }
                                                                                      if (!ws.b((byte) 52)) {
                                                                                        this.field_F = false;
                                                                                        break L31;
                                                                                      } else {
                                                                                        break L31;
                                                                                      }
                                                                                    }
                                                                                    L34: {
                                                                                      if (this.field_F) {
                                                                                        L35: {
                                                                                          var6_int = lk.field_b;
                                                                                          var7 = lk.field_c;
                                                                                          if (this.field_K == null) {
                                                                                            break L35;
                                                                                          } else {
                                                                                            var6_int = this.field_K.field_x;
                                                                                            var7 = this.field_K.field_u;
                                                                                            break L35;
                                                                                          }
                                                                                        }
                                                                                        L36: {
                                                                                          var8 = (-var6_int + gi.field_h) / 2;
                                                                                          var9 = (-var7 + wq.field_b) / 2;
                                                                                          if (!oj.a(false)) {
                                                                                            break L36;
                                                                                          } else {
                                                                                            if (this.field_K == null) {
                                                                                              break L36;
                                                                                            } else {
                                                                                              var8 = ik.c(-10517);
                                                                                              var9 = fd.b(3878);
                                                                                              break L36;
                                                                                            }
                                                                                          }
                                                                                        }
                                                                                        var10 = wq.a(var4, (byte) 126);
                                                                                        var10.a((byte) 91, var9, var7 + var9, var8, var6_int + var8);
                                                                                        var9 = (-lk.field_c + wq.field_b) / 2;
                                                                                        var8 = (-lk.field_b + gi.field_h) / 2;
                                                                                        var4.SA(var8, var9, lk.field_b, lk.field_c, lk.field_a, 0, lk.field_b);
                                                                                        var10.a(29709);
                                                                                        break L34;
                                                                                      } else {
                                                                                        break L34;
                                                                                      }
                                                                                    }
                                                                                    try {
                                                                                      L37: {
                                                                                        var4.a(true);
                                                                                        break L37;
                                                                                      }
                                                                                    } catch (java.lang.Exception decompiledCaughtParameter0) {
                                                                                      decompiledCaughtException = decompiledCaughtParameter0;
                                                                                      L38: {
                                                                                        var6 = (Exception) (Object) decompiledCaughtException;
                                                                                        var6.printStackTrace();
                                                                                        break L38;
                                                                                      }
                                                                                    }
                                                                                    break L11;
                                                                                  }
                                                                                  if (!param0) {
                                                                                    stackOut_187_0 = 0;
                                                                                    stackIn_188_0 = stackOut_187_0;
                                                                                    decompiledRegionSelector0 = 12;
                                                                                    break L0;
                                                                                  } else {
                                                                                    eb.field_b = new og(hl.field_d, er.field_c);
                                                                                    ff.a((byte) -62, hl.field_d);
                                                                                    oq.a(-24233);
                                                                                    hl.field_d = null;
                                                                                    ls.b(0);
                                                                                    stackOut_189_0 = 0;
                                                                                    stackIn_190_0 = stackOut_189_0;
                                                                                    decompiledRegionSelector0 = 13;
                                                                                    break L0;
                                                                                  }
                                                                                }
                                                                              }
                                                                            }
                                                                            pe.a(20, 60.0f, nw.a(nm.field_n, (byte) 85, 0, ik.field_d, b.field_f));
                                                                            stackOut_72_0 = 0;
                                                                            stackIn_73_0 = stackOut_72_0;
                                                                            decompiledRegionSelector0 = 11;
                                                                            break L0;
                                                                          } else {
                                                                            break L9;
                                                                          }
                                                                        }
                                                                      }
                                                                      pe.a(20, 55.0f, pt.a("", dq.field_Z, ce.field_l, true, ow.field_a));
                                                                      stackOut_64_0 = 0;
                                                                      stackIn_65_0 = stackOut_64_0;
                                                                      decompiledRegionSelector0 = 10;
                                                                      break L0;
                                                                    } else {
                                                                      break L8;
                                                                    }
                                                                  }
                                                                }
                                                                pe.a(20, 45.0f, pt.a("", kf.field_v, m.field_V, true, es.field_j));
                                                                stackOut_58_0 = 0;
                                                                stackIn_59_0 = stackOut_58_0;
                                                                decompiledRegionSelector0 = 9;
                                                                break L0;
                                                              } else {
                                                                break L7;
                                                              }
                                                            }
                                                          }
                                                          pe.a(20, 40.0f, pt.a("", be.field_s, ve.field_l, true, gt.field_hb));
                                                          stackOut_52_0 = 0;
                                                          stackIn_53_0 = stackOut_52_0;
                                                          decompiledRegionSelector0 = 8;
                                                          break L0;
                                                        } else {
                                                          break L6;
                                                        }
                                                      }
                                                    }
                                                    pe.a(20, 30.0f, nw.a(jf.field_a, (byte) 85, 0, gg.field_r, sg.field_i));
                                                    stackOut_46_0 = 0;
                                                    stackIn_47_0 = stackOut_46_0;
                                                    decompiledRegionSelector0 = 7;
                                                    break L0;
                                                  } else {
                                                    break L5;
                                                  }
                                                }
                                              }
                                              pe.a(20, 20.0f, pt.a("", er.field_c, fn.field_A, true, hq.field_a));
                                              stackOut_40_0 = 0;
                                              stackIn_41_0 = stackOut_40_0;
                                              decompiledRegionSelector0 = 6;
                                              break L0;
                                            } else {
                                              break L4;
                                            }
                                          }
                                        }
                                        pe.a(20, 10.0f, pt.a("", hl.field_d, fn.field_A, true, hq.field_a));
                                        stackOut_34_0 = 0;
                                        stackIn_35_0 = stackOut_34_0;
                                        decompiledRegionSelector0 = 5;
                                        break L0;
                                      } else {
                                        break L3;
                                      }
                                    }
                                  }
                                  pe.a(20, 5.0f, pt.a("arial13", vb.field_J, ce.field_l, true, ow.field_a));
                                  stackOut_28_0 = 0;
                                  stackIn_29_0 = stackOut_28_0;
                                  decompiledRegionSelector0 = 4;
                                  break L0;
                                } else {
                                  pe.a(20, 4.0f, pt.a("arial13", pi.field_c, ce.field_l, true, ow.field_a));
                                  stackOut_22_0 = 0;
                                  stackIn_23_0 = stackOut_22_0;
                                  decompiledRegionSelector0 = 3;
                                  break L0;
                                }
                              } else {
                                break L2;
                              }
                            }
                          }
                          pe.a(20, 5.0f, pt.a("arialbold14", vb.field_J, ce.field_l, true, ow.field_a));
                          stackOut_19_0 = 0;
                          stackIn_20_0 = stackOut_19_0;
                          decompiledRegionSelector0 = 2;
                          break L0;
                        }
                      } else {
                        break L1;
                      }
                    }
                  }
                  pe.a(20, 3.0f, pt.a("basic", pi.field_c, m.field_V, true, es.field_j));
                  stackOut_8_0 = 0;
                  stackIn_9_0 = stackOut_8_0;
                  decompiledRegionSelector0 = 0;
                  break L0;
                } else {
                  if (null == er.field_c) {
                    if (null != be.field_s) {
                      L39: {
                        L40: {
                          pe.a(20, 75.0f, su.field_d);
                          var3_ref = hk.b(-103);
                          lk.b();
                          if (!in.g(-98)) {
                            break L40;
                          } else {
                            ad.a((byte) 95, var3_ref, np.a(7));
                            if (var11 == 0) {
                              break L39;
                            } else {
                              break L40;
                            }
                          }
                        }
                        L41: {
                          if (sa.field_j) {
                            break L41;
                          } else {
                            od.a(-73, var3_ref);
                            if (var11 == 0) {
                              break L39;
                            } else {
                              break L41;
                            }
                          }
                        }
                        L42: {
                          if (su.a(0)) {
                            break L42;
                          } else {
                            pe.a(20, 100.0f, fl.field_s);
                            od.a(-111, var3_ref);
                            if (var11 == 0) {
                              break L39;
                            } else {
                              break L42;
                            }
                          }
                        }
                        L43: {
                          if (nq.field_h.a(false)) {
                            if (this.h((byte) -48)) {
                              break L43;
                            } else {
                              if (var11 == 0) {
                                break L39;
                              } else {
                                break L43;
                              }
                            }
                          } else {
                            break L43;
                          }
                        }
                        L44: {
                          L45: {
                            var4 = nq.field_h.a(-128);
                            var4.GA(0);
                            ph.field_b.a(124, var4, false);
                            if ((nj.field_b ^ -1) == (rc.field_k ^ -1)) {
                              break L45;
                            } else {
                              L46: {
                                var5_int = 255 * eh.field_a / 30;
                                if ((nj.field_b ^ -1) == 0) {
                                  break L46;
                                } else {
                                  iv.field_g[nj.field_b].a(-var5_int + 255, var4, -2355);
                                  break L46;
                                }
                              }
                              L47: {
                                if ((rc.field_k ^ -1) == 0) {
                                  break L47;
                                } else {
                                  iv.field_g[rc.field_k].a(var5_int, var4, -2355);
                                  break L47;
                                }
                              }
                              if (var11 == 0) {
                                break L44;
                              } else {
                                break L45;
                              }
                            }
                          }
                          if (-1 == nj.field_b) {
                            break L44;
                          } else {
                            iv.field_g[nj.field_b].a(255, var4, -2355);
                            break L44;
                          }
                        }
                        L48: {
                          if (!so.a((byte) 109)) {
                            break L48;
                          } else {
                            lk.a(0, 0, lk.field_b, lk.field_c);
                            pn.d((byte) -7);
                            break L48;
                          }
                        }
                        L49: {
                          if ((ra.field_e ^ -1) == -1) {
                            break L49;
                          } else {
                            var5_int = eh.field_a * 256 / 30;
                            if (0 < var5_int) {
                              lk.b(0, 0, lk.field_b, lk.field_c, 0, var5_int);
                              break L49;
                            } else {
                              break L49;
                            }
                          }
                        }
                        L50: {
                          if (!sj.a(-28)) {
                            break L50;
                          } else {
                            if (!so.a((byte) -55)) {
                              L51: {
                                if (gk.field_o == null) {
                                  stackOut_362_0 = ii.field_a;
                                  stackIn_363_0 = stackOut_362_0 ? 1 : 0;
                                  break L51;
                                } else {
                                  stackOut_360_0 = 1;
                                  stackIn_363_0 = stackOut_360_0;
                                  break L51;
                                }
                              }
                              kn.a(stackIn_363_0 != 0, -122);
                              break L50;
                            } else {
                              break L50;
                            }
                          }
                        }
                        L52: {
                          if ((ku.field_j ^ -1) > -3) {
                            break L52;
                          } else {
                            if (gw.field_v) {
                              bq.field_c.a(20, 20, 16777215, Integer.toString(aj.field_B), (byte) -122, 1);
                              break L52;
                            } else {
                              break L52;
                            }
                          }
                        }
                        L53: {
                          var5 = (ge) ((Object) pl.field_v.b(-85));
                          if (null != var5) {
                            L54: {
                              L55: {
                                var7 = qn.field_g;
                                if (64 > var7) {
                                  break L55;
                                } else {
                                  L56: {
                                    if (var7 > 192) {
                                      break L56;
                                    } else {
                                      var6_int = 255;
                                      if (var11 == 0) {
                                        break L54;
                                      } else {
                                        break L56;
                                      }
                                    }
                                  }
                                  var6_int = (48960 - var7 * 255) / 64;
                                  if (var11 == 0) {
                                    break L54;
                                  } else {
                                    break L55;
                                  }
                                }
                              }
                              var6_int = 255 * var7 / 64;
                              break L54;
                            }
                            L57: {
                              L58: {
                                var8 = 45;
                                if ((var5.field_m ^ -1) <= -1) {
                                  break L58;
                                } else {
                                  var9_ref_String = aa.field_b;
                                  if (var11 == 0) {
                                    break L57;
                                  } else {
                                    break L58;
                                  }
                                }
                              }
                              var9_ref_String = rb.field_d[var5.field_m];
                              if (qw.field_a.length > var5.field_m) {
                                var8 += 65;
                                qw.field_a[var5.field_m].a(rj.field_c - 180 + 53, 45, 64, 64, 0, var6_int << 845463512 | 16777215, 1);
                                break L57;
                              } else {
                                break L57;
                              }
                            }
                            discarded$20 = bq.field_c.a(150, var6_int << -1210373192, 0, 170, -180 + rj.field_c, (int[]) null, (hr[]) null, var8 + -1, var6_int << 156532632, 0, 18, -8787, var9_ref_String, (aa) null, 1, 0);
                            discarded$21 = bq.field_c.a(150, var6_int << -135066696, 0, 170, rj.field_c + -180, (int[]) null, (hr[]) null, 1 + var8, var6_int << -2061898952, 0, 18, -8787, var9_ref_String, (aa) null, 1, 0);
                            discarded$22 = bq.field_c.a(150, var6_int << 803257688 | 16777215, 0, 170, rj.field_c - 180, (int[]) null, (hr[]) null, var8, -1, 0, 18, -8787, var9_ref_String, (aa) null, 1, 0);
                            break L53;
                          } else {
                            break L53;
                          }
                        }
                        L59: {
                          L60: {
                            if (!oj.a(false)) {
                              break L60;
                            } else {
                              var6_int = 0 * (gi.field_h - lk.field_b) / 2;
                              var7 = (wq.field_b - lk.field_c) * 0 / 2;
                              cf.a(var6_int, var7, 86);
                              kn.a(false, (byte) -122);
                              this.field_F = true;
                              if (var11 == 0) {
                                break L59;
                              } else {
                                break L60;
                              }
                            }
                          }
                          L61: {
                            if (sj.a(-63)) {
                              break L61;
                            } else {
                              if (ws.b((byte) 52)) {
                                break L59;
                              } else {
                                this.field_F = false;
                                if (var11 == 0) {
                                  break L59;
                                } else {
                                  break L61;
                                }
                              }
                            }
                          }
                          var6_int = 0 * (gi.field_h + -lk.field_b) / 2;
                          var7 = (wq.field_b + -lk.field_c) * 0 / 2;
                          ls.a(var6_int, -82, var7);
                          kn.a(false, -100);
                          this.field_F = true;
                          break L59;
                        }
                        L62: {
                          if (!this.field_F) {
                            break L62;
                          } else {
                            L63: {
                              var6_int = lk.field_b;
                              var7 = lk.field_c;
                              if (this.field_K == null) {
                                break L63;
                              } else {
                                var6_int = this.field_K.field_x;
                                var7 = this.field_K.field_u;
                                break L63;
                              }
                            }
                            L64: {
                              var8 = (gi.field_h + -var6_int) / 2;
                              var9 = (-var7 + wq.field_b) / 2;
                              if (!oj.a(false)) {
                                break L64;
                              } else {
                                if (this.field_K != null) {
                                  var8 = ik.c(-10517);
                                  var9 = fd.b(3878);
                                  break L64;
                                } else {
                                  break L64;
                                }
                              }
                            }
                            var10 = wq.a(var4, (byte) 28);
                            var10.a((byte) 127, var9, var7 + var9, var8, var8 + var6_int);
                            var9 = (wq.field_b - lk.field_c) / 2;
                            var8 = (-lk.field_b + gi.field_h) / 2;
                            var4.SA(var8, var9, lk.field_b, lk.field_c, lk.field_a, 0, lk.field_b);
                            var10.a(29709);
                            break L62;
                          }
                        }
                        try {
                          L65: {
                            var4.a(true);
                            break L65;
                          }
                        } catch (java.lang.Exception decompiledCaughtParameter1) {
                          decompiledCaughtException = decompiledCaughtParameter1;
                          L66: {
                            var6 = (Exception) (Object) decompiledCaughtException;
                            var6.printStackTrace();
                            break L66;
                          }
                        }
                        break L39;
                      }
                      au.a(-1509, be.field_s);
                      be.field_s = null;
                      ls.b(0);
                      stackOut_414_0 = 0;
                      stackIn_415_0 = stackOut_414_0;
                      decompiledRegionSelector0 = 15;
                      break L0;
                    } else {
                      if (gg.field_r == null) {
                        if (ik.field_d != null) {
                          L67: {
                            L68: {
                              pe.a(20, 80.0f, om.field_n);
                              var3_ref = hk.b(125);
                              lk.b();
                              if (!in.g(-128)) {
                                break L68;
                              } else {
                                ad.a((byte) -75, var3_ref, np.a(7));
                                if (var11 == 0) {
                                  break L67;
                                } else {
                                  break L68;
                                }
                              }
                            }
                            L69: {
                              if (sa.field_j) {
                                break L69;
                              } else {
                                od.a(-67, var3_ref);
                                if (var11 == 0) {
                                  break L67;
                                } else {
                                  break L69;
                                }
                              }
                            }
                            L70: {
                              if (su.a(0)) {
                                break L70;
                              } else {
                                pe.a(20, 100.0f, fl.field_s);
                                od.a(-52, var3_ref);
                                if (var11 == 0) {
                                  break L67;
                                } else {
                                  break L70;
                                }
                              }
                            }
                            L71: {
                              stackOut_445_0 = nq.field_h;
                              stackIn_450_0 = stackOut_445_0;
                              stackIn_446_0 = stackOut_445_0;
                              if (param1) {
                                stackOut_450_0 = (ik) ((Object) stackIn_450_0);
                                stackOut_450_1 = 0;
                                stackIn_451_0 = stackOut_450_0;
                                stackIn_451_1 = stackOut_450_1;
                                break L71;
                              } else {
                                stackOut_446_0 = (ik) ((Object) stackIn_446_0);
                                stackIn_448_0 = stackOut_446_0;
                                stackOut_448_0 = (ik) ((Object) stackIn_448_0);
                                stackOut_448_1 = 1;
                                stackIn_451_0 = stackOut_448_0;
                                stackIn_451_1 = stackOut_448_1;
                                break L71;
                              }
                            }
                            L72: {
                              if (((ik) (Object) stackIn_451_0).a(stackIn_451_1 != 0)) {
                                if (this.h((byte) -11)) {
                                  break L72;
                                } else {
                                  if (var11 == 0) {
                                    break L67;
                                  } else {
                                    break L72;
                                  }
                                }
                              } else {
                                break L72;
                              }
                            }
                            L73: {
                              L74: {
                                var4 = nq.field_h.a(-120);
                                var4.GA(0);
                                ph.field_b.a(122, var4, false);
                                if ((nj.field_b ^ -1) == (rc.field_k ^ -1)) {
                                  break L74;
                                } else {
                                  L75: {
                                    var5_int = eh.field_a * 255 / 30;
                                    if (-1 != nj.field_b) {
                                      iv.field_g[nj.field_b].a(-var5_int + 255, var4, -2355);
                                      break L75;
                                    } else {
                                      break L75;
                                    }
                                  }
                                  L76: {
                                    if (0 != (rc.field_k ^ -1)) {
                                      iv.field_g[rc.field_k].a(var5_int, var4, -2355);
                                      break L76;
                                    } else {
                                      break L76;
                                    }
                                  }
                                  if (var11 == 0) {
                                    break L73;
                                  } else {
                                    break L74;
                                  }
                                }
                              }
                              if (0 == (nj.field_b ^ -1)) {
                                break L73;
                              } else {
                                iv.field_g[nj.field_b].a(255, var4, -2355);
                                break L73;
                              }
                            }
                            L77: {
                              if (!so.a((byte) -36)) {
                                break L77;
                              } else {
                                lk.a(0, 0, lk.field_b, lk.field_c);
                                pn.d((byte) -7);
                                break L77;
                              }
                            }
                            L78: {
                              if (ra.field_e != 0) {
                                var5_int = 256 * eh.field_a / 30;
                                if (var5_int <= 0) {
                                  break L78;
                                } else {
                                  lk.b(0, 0, lk.field_b, lk.field_c, 0, var5_int);
                                  break L78;
                                }
                              } else {
                                break L78;
                              }
                            }
                            L79: {
                              if (!sj.a(-103)) {
                                break L79;
                              } else {
                                if (so.a((byte) 127)) {
                                  break L79;
                                } else {
                                  L80: {
                                    if (null != gk.field_o) {
                                      stackOut_491_0 = 1;
                                      stackIn_492_0 = stackOut_491_0;
                                      break L80;
                                    } else {
                                      stackOut_489_0 = ii.field_a;
                                      stackIn_492_0 = stackOut_489_0 ? 1 : 0;
                                      break L80;
                                    }
                                  }
                                  kn.a(stackIn_492_0 != 0, 115);
                                  break L79;
                                }
                              }
                            }
                            L81: {
                              if ((ku.field_j ^ -1) > -3) {
                                break L81;
                              } else {
                                if (gw.field_v) {
                                  bq.field_c.a(20, 20, 16777215, Integer.toString(aj.field_B), (byte) -61, 1);
                                  break L81;
                                } else {
                                  break L81;
                                }
                              }
                            }
                            L82: {
                              var5 = (ge) ((Object) pl.field_v.b(110));
                              if (null != var5) {
                                L83: {
                                  L84: {
                                    var7 = qn.field_g;
                                    if ((var7 ^ -1) <= -65) {
                                      break L84;
                                    } else {
                                      var6_int = 255 * var7 / 64;
                                      if (var11 == 0) {
                                        break L83;
                                      } else {
                                        break L84;
                                      }
                                    }
                                  }
                                  L85: {
                                    if ((var7 ^ -1) >= -193) {
                                      break L85;
                                    } else {
                                      var6_int = (192 - var7) * 255 / 64;
                                      if (var11 == 0) {
                                        break L83;
                                      } else {
                                        break L85;
                                      }
                                    }
                                  }
                                  var6_int = 255;
                                  break L83;
                                }
                                L86: {
                                  L87: {
                                    var8 = 45;
                                    if (0 <= var5.field_m) {
                                      break L87;
                                    } else {
                                      var9_ref_String = aa.field_b;
                                      if (var11 == 0) {
                                        break L86;
                                      } else {
                                        break L87;
                                      }
                                    }
                                  }
                                  var9_ref_String = rb.field_d[var5.field_m];
                                  if (qw.field_a.length > var5.field_m) {
                                    var8 += 65;
                                    qw.field_a[var5.field_m].a(-127 + rj.field_c, 45, 64, 64, 0, var6_int << -1700944808 | 16777215, 1);
                                    break L86;
                                  } else {
                                    break L86;
                                  }
                                }
                                discarded$23 = bq.field_c.a(150, var6_int << -1136532232, 0, 170, rj.field_c + -180, (int[]) null, (hr[]) null, -1 + var8, var6_int << 646507896, 0, 18, -8787, var9_ref_String, (aa) null, 1, 0);
                                discarded$24 = bq.field_c.a(150, var6_int << -1511753384, 0, 170, -180 + rj.field_c, (int[]) null, (hr[]) null, 1 + var8, var6_int << 1591393016, 0, 18, -8787, var9_ref_String, (aa) null, 1, 0);
                                discarded$25 = bq.field_c.a(150, var6_int << 1308463640 | 16777215, 0, 170, rj.field_c - 180, (int[]) null, (hr[]) null, var8, -1, 0, 18, -8787, var9_ref_String, (aa) null, 1, 0);
                                break L82;
                              } else {
                                break L82;
                              }
                            }
                            L88: {
                              L89: {
                                if (!oj.a(false)) {
                                  break L89;
                                } else {
                                  var6_int = (gi.field_h - lk.field_b) * 0 / 2;
                                  var7 = (-lk.field_c + wq.field_b) * 0 / 2;
                                  cf.a(var6_int, var7, -44);
                                  kn.a(false, (byte) -122);
                                  this.field_F = true;
                                  if (var11 == 0) {
                                    break L88;
                                  } else {
                                    break L89;
                                  }
                                }
                              }
                              L90: {
                                if (!sj.a(-61)) {
                                  break L90;
                                } else {
                                  var6_int = (-lk.field_b + gi.field_h) * 0 / 2;
                                  var7 = (wq.field_b + -lk.field_c) * 0 / 2;
                                  ls.a(var6_int, -95, var7);
                                  kn.a(false, -109);
                                  this.field_F = true;
                                  if (var11 == 0) {
                                    break L88;
                                  } else {
                                    break L90;
                                  }
                                }
                              }
                              if (ws.b((byte) 52)) {
                                break L88;
                              } else {
                                this.field_F = false;
                                break L88;
                              }
                            }
                            L91: {
                              if (this.field_F) {
                                L92: {
                                  var6_int = lk.field_b;
                                  var7 = lk.field_c;
                                  if (this.field_K != null) {
                                    var7 = this.field_K.field_u;
                                    var6_int = this.field_K.field_x;
                                    break L92;
                                  } else {
                                    break L92;
                                  }
                                }
                                L93: {
                                  var8 = (-var6_int + gi.field_h) / 2;
                                  var9 = (-var7 + wq.field_b) / 2;
                                  if (!oj.a(false)) {
                                    break L93;
                                  } else {
                                    if (this.field_K == null) {
                                      break L93;
                                    } else {
                                      var8 = ik.c(-10517);
                                      var9 = fd.b(3878);
                                      break L93;
                                    }
                                  }
                                }
                                var10 = wq.a(var4, (byte) 83);
                                var10.a((byte) 71, var9, var9 - -var7, var8, var8 + var6_int);
                                var9 = (wq.field_b + -lk.field_c) / 2;
                                var8 = (gi.field_h + -lk.field_b) / 2;
                                var4.SA(var8, var9, lk.field_b, lk.field_c, lk.field_a, 0, lk.field_b);
                                var10.a(29709);
                                break L91;
                              } else {
                                break L91;
                              }
                            }
                            try {
                              L94: {
                                var4.a(true);
                                break L94;
                              }
                            } catch (java.lang.Exception decompiledCaughtParameter2) {
                              decompiledCaughtException = decompiledCaughtParameter2;
                              L95: {
                                var6 = (Exception) (Object) decompiledCaughtException;
                                var6.printStackTrace();
                                break L95;
                              }
                            }
                            break L67;
                          }
                          sb.a(-9937, ik.field_d);
                          ik.field_d = null;
                          ls.b(0);
                          stackOut_544_0 = 0;
                          stackIn_545_0 = stackOut_544_0;
                          decompiledRegionSelector0 = 18;
                          break L0;
                        } else {
                          if (null != pi.field_c) {
                            L96: {
                              L97: {
                                pe.a(20, 90.0f, kn.field_e);
                                var3_ref = hk.b(78);
                                lk.b();
                                if (!in.g(-70)) {
                                  break L97;
                                } else {
                                  ad.a((byte) -86, var3_ref, np.a(7));
                                  if (var11 == 0) {
                                    break L96;
                                  } else {
                                    break L97;
                                  }
                                }
                              }
                              L98: {
                                if (!sa.field_j) {
                                  od.a(-62, var3_ref);
                                  if (var11 == 0) {
                                    break L96;
                                  } else {
                                    break L98;
                                  }
                                } else {
                                  break L98;
                                }
                              }
                              L99: {
                                if (!su.a(0)) {
                                  pe.a(20, 100.0f, fl.field_s);
                                  od.a(-110, var3_ref);
                                  if (var11 == 0) {
                                    break L96;
                                  } else {
                                    break L99;
                                  }
                                } else {
                                  break L99;
                                }
                              }
                              L100: {
                                if (nq.field_h.a(false)) {
                                  if (this.h((byte) -34)) {
                                    break L100;
                                  } else {
                                    if (var11 == 0) {
                                      break L96;
                                    } else {
                                      break L100;
                                    }
                                  }
                                } else {
                                  break L100;
                                }
                              }
                              L101: {
                                L102: {
                                  var4 = nq.field_h.a(-125);
                                  var4.GA(0);
                                  ph.field_b.a(119, var4, false);
                                  if ((rc.field_k ^ -1) == (nj.field_b ^ -1)) {
                                    break L102;
                                  } else {
                                    L103: {
                                      var5_int = eh.field_a * 255 / 30;
                                      if (nj.field_b != -1) {
                                        iv.field_g[nj.field_b].a(-var5_int + 255, var4, -2355);
                                        break L103;
                                      } else {
                                        break L103;
                                      }
                                    }
                                    L104: {
                                      if (-1 != rc.field_k) {
                                        iv.field_g[rc.field_k].a(var5_int, var4, -2355);
                                        break L104;
                                      } else {
                                        break L104;
                                      }
                                    }
                                    if (var11 == 0) {
                                      break L101;
                                    } else {
                                      break L102;
                                    }
                                  }
                                }
                                if (0 == (nj.field_b ^ -1)) {
                                  break L101;
                                } else {
                                  iv.field_g[nj.field_b].a(255, var4, -2355);
                                  break L101;
                                }
                              }
                              L105: {
                                if (!so.a((byte) -50)) {
                                  break L105;
                                } else {
                                  lk.a(0, 0, lk.field_b, lk.field_c);
                                  pn.d((byte) -7);
                                  break L105;
                                }
                              }
                              L106: {
                                if ((ra.field_e ^ -1) == -1) {
                                  break L106;
                                } else {
                                  var5_int = eh.field_a * 256 / 30;
                                  if (var5_int <= 0) {
                                    break L106;
                                  } else {
                                    lk.b(0, 0, lk.field_b, lk.field_c, 0, var5_int);
                                    break L106;
                                  }
                                }
                              }
                              L107: {
                                if (!sj.a(-38)) {
                                  break L107;
                                } else {
                                  if (so.a((byte) 110)) {
                                    break L107;
                                  } else {
                                    L108: {
                                      if (null == gk.field_o) {
                                        stackOut_605_0 = ii.field_a;
                                        stackIn_606_0 = stackOut_605_0 ? 1 : 0;
                                        break L108;
                                      } else {
                                        stackOut_603_0 = 1;
                                        stackIn_606_0 = stackOut_603_0;
                                        break L108;
                                      }
                                    }
                                    kn.a(stackIn_606_0 != 0, -75);
                                    break L107;
                                  }
                                }
                              }
                              L109: {
                                if ((ku.field_j ^ -1) > -3) {
                                  break L109;
                                } else {
                                  if (gw.field_v) {
                                    bq.field_c.a(20, 20, 16777215, Integer.toString(aj.field_B), (byte) -93, 1);
                                    break L109;
                                  } else {
                                    break L109;
                                  }
                                }
                              }
                              L110: {
                                var5 = (ge) ((Object) pl.field_v.b(66));
                                if (null == var5) {
                                  break L110;
                                } else {
                                  L111: {
                                    L112: {
                                      var7 = qn.field_g;
                                      if (-65 < (var7 ^ -1)) {
                                        break L112;
                                      } else {
                                        L113: {
                                          if (192 < var7) {
                                            break L113;
                                          } else {
                                            var6_int = 255;
                                            if (var11 == 0) {
                                              break L111;
                                            } else {
                                              break L113;
                                            }
                                          }
                                        }
                                        var6_int = (192 - var7) * 255 / 64;
                                        if (var11 == 0) {
                                          break L111;
                                        } else {
                                          break L112;
                                        }
                                      }
                                    }
                                    var6_int = var7 * 255 / 64;
                                    break L111;
                                  }
                                  L114: {
                                    L115: {
                                      var8 = 45;
                                      if (var5.field_m < 0) {
                                        break L115;
                                      } else {
                                        var9_ref_String = rb.field_d[var5.field_m];
                                        if ((var5.field_m ^ -1) > (qw.field_a.length ^ -1)) {
                                          var8 += 65;
                                          qw.field_a[var5.field_m].a(-32 + (85 + (rj.field_c + -180)), 45, 64, 64, 0, var6_int << 685471192 | 16777215, 1);
                                          if (var11 == 0) {
                                            break L114;
                                          } else {
                                            break L115;
                                          }
                                        } else {
                                          break L114;
                                        }
                                      }
                                    }
                                    var9_ref_String = aa.field_b;
                                    break L114;
                                  }
                                  discarded$26 = bq.field_c.a(150, var6_int << -562019272, 0, 170, -180 + rj.field_c, (int[]) null, (hr[]) null, -1 + var8, var6_int << -412562056, 0, 18, -8787, var9_ref_String, (aa) null, 1, 0);
                                  discarded$27 = bq.field_c.a(150, var6_int << -1979326344, 0, 170, -180 + rj.field_c, (int[]) null, (hr[]) null, var8 + 1, var6_int << 382074200, 0, 18, -8787, var9_ref_String, (aa) null, 1, 0);
                                  discarded$28 = bq.field_c.a(150, 16777215 | var6_int << -138879208, 0, 170, -180 + rj.field_c, (int[]) null, (hr[]) null, var8, -1, 0, 18, -8787, var9_ref_String, (aa) null, 1, 0);
                                  break L110;
                                }
                              }
                              L116: {
                                L117: {
                                  if (!oj.a(false)) {
                                    break L117;
                                  } else {
                                    var6_int = 0 * (gi.field_h - lk.field_b) / 2;
                                    var7 = (wq.field_b + -lk.field_c) * 0 / 2;
                                    cf.a(var6_int, var7, -105);
                                    kn.a(false, (byte) -122);
                                    this.field_F = true;
                                    if (var11 == 0) {
                                      break L116;
                                    } else {
                                      break L117;
                                    }
                                  }
                                }
                                L118: {
                                  if (!sj.a(-67)) {
                                    break L118;
                                  } else {
                                    var6_int = 0 * (gi.field_h + -lk.field_b) / 2;
                                    var7 = (-lk.field_c + wq.field_b) * 0 / 2;
                                    ls.a(var6_int, -53, var7);
                                    kn.a(false, -101);
                                    this.field_F = true;
                                    if (var11 == 0) {
                                      break L116;
                                    } else {
                                      break L118;
                                    }
                                  }
                                }
                                if (ws.b((byte) 52)) {
                                  break L116;
                                } else {
                                  this.field_F = false;
                                  break L116;
                                }
                              }
                              L119: {
                                if (this.field_F) {
                                  L120: {
                                    var6_int = lk.field_b;
                                    var7 = lk.field_c;
                                    if (this.field_K == null) {
                                      break L120;
                                    } else {
                                      var6_int = this.field_K.field_x;
                                      var7 = this.field_K.field_u;
                                      break L120;
                                    }
                                  }
                                  L121: {
                                    var8 = (gi.field_h - var6_int) / 2;
                                    var9 = (wq.field_b - var7) / 2;
                                    if (!oj.a(false)) {
                                      break L121;
                                    } else {
                                      if (null != this.field_K) {
                                        var8 = ik.c(-10517);
                                        var9 = fd.b(3878);
                                        break L121;
                                      } else {
                                        break L121;
                                      }
                                    }
                                  }
                                  var10 = wq.a(var4, (byte) 29);
                                  var10.a((byte) 61, var9, var9 + var7, var8, var6_int + var8);
                                  var9 = (wq.field_b + -lk.field_c) / 2;
                                  var8 = (-lk.field_b + gi.field_h) / 2;
                                  var4.SA(var8, var9, lk.field_b, lk.field_c, lk.field_a, 0, lk.field_b);
                                  var10.a(29709);
                                  break L119;
                                } else {
                                  break L119;
                                }
                              }
                              try {
                                L122: {
                                  var4.a(true);
                                  break L122;
                                }
                              } catch (java.lang.Exception decompiledCaughtParameter3) {
                                decompiledCaughtException = decompiledCaughtParameter3;
                                L123: {
                                  var6 = (Exception) (Object) decompiledCaughtException;
                                  var6.printStackTrace();
                                  break L123;
                                }
                              }
                              break L96;
                            }
                            pe.a(pi.field_c, dq.field_Z, 20, kf.field_v);
                            fv.a(7966, dq.field_Z, kf.field_v);
                            pi.field_c = null;
                            kf.field_v = null;
                            dq.field_Z = null;
                            ls.b(0);
                            stackOut_656_0 = 0;
                            stackIn_657_0 = stackOut_656_0;
                            decompiledRegionSelector0 = 19;
                            break L0;
                          } else {
                            L124: {
                              if (param1) {
                                break L124;
                              } else {
                                discarded$29 = this.h((byte) -12);
                                break L124;
                              }
                            }
                            L125: {
                              if (!vi.f(5)) {
                                break L125;
                              } else {
                                var3_int = 0;
                                L126: while (true) {
                                  L127: {
                                    L128: {
                                      if (13 <= var3_int) {
                                        break L128;
                                      } else {
                                        iv.field_g[var3_int] = ga.a(var3_int, (byte) -100);
                                        var3_int++;
                                        if (var11 != 0) {
                                          break L127;
                                        } else {
                                          if (var11 == 0) {
                                            continue L126;
                                          } else {
                                            break L128;
                                          }
                                        }
                                      }
                                    }
                                    nj.field_b = 0;
                                    bp.a(50, 26175);
                                    nn.b(50, -106);
                                    mo.a(86, 0);
                                    ek.b(true, 0);
                                    break L127;
                                  }
                                  vl.field_a = 0;
                                  break L125;
                                }
                              }
                            }
                            L129: {
                              if (nq.field_h.a(-113) == null) {
                                discarded$30 = nq.field_h.a(false);
                                if (this.h((byte) -124)) {
                                  break L129;
                                } else {
                                  stackOut_674_0 = 0;
                                  stackIn_675_0 = stackOut_674_0;
                                  decompiledRegionSelector0 = 20;
                                  break L0;
                                }
                              } else {
                                break L129;
                              }
                            }
                            ph.field_b = new qu();
                            stackOut_676_0 = 1;
                            stackIn_677_0 = stackOut_676_0;
                            decompiledRegionSelector0 = 21;
                            break L0;
                          }
                        }
                      } else {
                        if (!il.a(false, gg.field_r)) {
                          ls.b(0);
                          stackOut_422_0 = 0;
                          stackIn_423_0 = stackOut_422_0;
                          decompiledRegionSelector0 = 16;
                          break L0;
                        } else {
                          gg.field_r = null;
                          ls.b(0);
                          stackOut_424_0 = 0;
                          stackIn_425_0 = stackOut_424_0;
                          decompiledRegionSelector0 = 17;
                          break L0;
                        }
                      }
                    }
                  } else {
                    L130: {
                      L131: {
                        pe.a(20, 70.0f, hv.field_e);
                        var3_ref = hk.b(-103);
                        lk.b();
                        if (!in.g(-96)) {
                          break L131;
                        } else {
                          ad.a((byte) -45, var3_ref, np.a(7));
                          if (var11 == 0) {
                            break L130;
                          } else {
                            break L131;
                          }
                        }
                      }
                      L132: {
                        if (sa.field_j) {
                          break L132;
                        } else {
                          od.a(-121, var3_ref);
                          if (var11 == 0) {
                            break L130;
                          } else {
                            break L132;
                          }
                        }
                      }
                      L133: {
                        if (su.a(0)) {
                          break L133;
                        } else {
                          pe.a(20, 100.0f, fl.field_s);
                          od.a(-68, var3_ref);
                          if (var11 == 0) {
                            break L130;
                          } else {
                            break L133;
                          }
                        }
                      }
                      L134: {
                        if (!nq.field_h.a(false)) {
                          break L134;
                        } else {
                          if (!this.h((byte) -99)) {
                            break L130;
                          } else {
                            break L134;
                          }
                        }
                      }
                      L135: {
                        L136: {
                          var4 = nq.field_h.a(-121);
                          var4.GA(0);
                          ph.field_b.a(123, var4, false);
                          if ((rc.field_k ^ -1) == (nj.field_b ^ -1)) {
                            break L136;
                          } else {
                            L137: {
                              var5_int = eh.field_a * 255 / 30;
                              if ((nj.field_b ^ -1) != 0) {
                                iv.field_g[nj.field_b].a(-var5_int + 255, var4, -2355);
                                break L137;
                              } else {
                                break L137;
                              }
                            }
                            L138: {
                              if (rc.field_k != -1) {
                                iv.field_g[rc.field_k].a(var5_int, var4, -2355);
                                break L138;
                              } else {
                                break L138;
                              }
                            }
                            if (var11 == 0) {
                              break L135;
                            } else {
                              break L136;
                            }
                          }
                        }
                        if (0 == (nj.field_b ^ -1)) {
                          break L135;
                        } else {
                          iv.field_g[nj.field_b].a(255, var4, -2355);
                          break L135;
                        }
                      }
                      L139: {
                        if (!so.a((byte) 118)) {
                          break L139;
                        } else {
                          lk.a(0, 0, lk.field_b, lk.field_c);
                          pn.d((byte) -7);
                          break L139;
                        }
                      }
                      L140: {
                        if ((ra.field_e ^ -1) != -1) {
                          var5_int = eh.field_a * 256 / 30;
                          if (-1 > (var5_int ^ -1)) {
                            lk.b(0, 0, lk.field_b, lk.field_c, 0, var5_int);
                            break L140;
                          } else {
                            break L140;
                          }
                        } else {
                          break L140;
                        }
                      }
                      L141: {
                        if (!sj.a(-126)) {
                          break L141;
                        } else {
                          if (so.a((byte) 110)) {
                            break L141;
                          } else {
                            L142: {
                              if (gk.field_o != null) {
                                stackOut_248_0 = 1;
                                stackIn_249_0 = stackOut_248_0;
                                break L142;
                              } else {
                                stackOut_246_0 = ii.field_a;
                                stackIn_249_0 = stackOut_246_0 ? 1 : 0;
                                break L142;
                              }
                            }
                            kn.a(stackIn_249_0 != 0, 64);
                            break L141;
                          }
                        }
                      }
                      L143: {
                        if (2 > ku.field_j) {
                          break L143;
                        } else {
                          if (gw.field_v) {
                            bq.field_c.a(20, 20, 16777215, Integer.toString(aj.field_B), (byte) -98, 1);
                            break L143;
                          } else {
                            break L143;
                          }
                        }
                      }
                      L144: {
                        var5 = (ge) ((Object) pl.field_v.b(-100));
                        if (var5 == null) {
                          break L144;
                        } else {
                          L145: {
                            L146: {
                              var7 = qn.field_g;
                              if (64 > var7) {
                                break L146;
                              } else {
                                L147: {
                                  if (192 < var7) {
                                    break L147;
                                  } else {
                                    var6_int = 255;
                                    if (var11 == 0) {
                                      break L145;
                                    } else {
                                      break L147;
                                    }
                                  }
                                }
                                var6_int = (48960 - 255 * var7) / 64;
                                if (var11 == 0) {
                                  break L145;
                                } else {
                                  break L146;
                                }
                              }
                            }
                            var6_int = var7 * 255 / 64;
                            break L145;
                          }
                          L148: {
                            L149: {
                              var8 = 45;
                              if ((var5.field_m ^ -1) > -1) {
                                break L149;
                              } else {
                                var9_ref_String = rb.field_d[var5.field_m];
                                if ((var5.field_m ^ -1) <= (qw.field_a.length ^ -1)) {
                                  break L148;
                                } else {
                                  var8 += 65;
                                  qw.field_a[var5.field_m].a(-180 + rj.field_c + 85 - 32, 45, 64, 64, 0, var6_int << -1273320232 | 16777215, 1);
                                  if (var11 == 0) {
                                    break L148;
                                  } else {
                                    break L149;
                                  }
                                }
                              }
                            }
                            var9_ref_String = aa.field_b;
                            break L148;
                          }
                          discarded$31 = bq.field_c.a(150, var6_int << 1534841976, 0, 170, -180 + rj.field_c, (int[]) null, (hr[]) null, -1 + var8, var6_int << -354884008, 0, 18, -8787, var9_ref_String, (aa) null, 1, 0);
                          discarded$32 = bq.field_c.a(150, var6_int << 898716536, 0, 170, rj.field_c - 180, (int[]) null, (hr[]) null, 1 + var8, var6_int << 648239480, 0, 18, -8787, var9_ref_String, (aa) null, 1, 0);
                          discarded$33 = bq.field_c.a(150, var6_int << 644256760 | 16777215, 0, 170, rj.field_c - 180, (int[]) null, (hr[]) null, var8, -1, 0, 18, -8787, var9_ref_String, (aa) null, 1, 0);
                          break L144;
                        }
                      }
                      L150: {
                        if (param1) {
                          stackOut_275_0 = 0;
                          stackIn_276_0 = stackOut_275_0;
                          break L150;
                        } else {
                          stackOut_273_0 = 1;
                          stackIn_276_0 = stackOut_273_0;
                          break L150;
                        }
                      }
                      L151: {
                        L152: {
                          if (oj.a(stackIn_276_0 == 0)) {
                            break L152;
                          } else {
                            var6_int = 0 * (-lk.field_b + gi.field_h) / 2;
                            var7 = 0 * (-lk.field_c + wq.field_b) / 2;
                            cf.a(var6_int, var7, 126);
                            kn.a(false, (byte) -122);
                            this.field_F = true;
                            if (var11 == 0) {
                              break L151;
                            } else {
                              break L152;
                            }
                          }
                        }
                        L153: {
                          if (sj.a(-124)) {
                            break L153;
                          } else {
                            if (ws.b((byte) 52)) {
                              break L151;
                            } else {
                              this.field_F = false;
                              if (var11 == 0) {
                                break L151;
                              } else {
                                break L153;
                              }
                            }
                          }
                        }
                        var6_int = (-lk.field_b + gi.field_h) * 0 / 2;
                        var7 = (-lk.field_c + wq.field_b) * 0 / 2;
                        ls.a(var6_int, -66, var7);
                        kn.a(false, -124);
                        this.field_F = true;
                        break L151;
                      }
                      L154: {
                        if (!this.field_F) {
                          break L154;
                        } else {
                          L155: {
                            var6_int = lk.field_b;
                            var7 = lk.field_c;
                            if (null == this.field_K) {
                              break L155;
                            } else {
                              var6_int = this.field_K.field_x;
                              var7 = this.field_K.field_u;
                              break L155;
                            }
                          }
                          L156: {
                            var8 = (-var6_int + gi.field_h) / 2;
                            var9 = (-var7 + wq.field_b) / 2;
                            if (!oj.a(false)) {
                              break L156;
                            } else {
                              if (null != this.field_K) {
                                var8 = ik.c(-10517);
                                var9 = fd.b(3878);
                                break L156;
                              } else {
                                break L156;
                              }
                            }
                          }
                          var10 = wq.a(var4, (byte) 70);
                          var10.a((byte) -88, var9, var7 + var9, var8, var6_int + var8);
                          var9 = (-lk.field_c + wq.field_b) / 2;
                          var8 = (-lk.field_b + gi.field_h) / 2;
                          var4.SA(var8, var9, lk.field_b, lk.field_c, lk.field_a, 0, lk.field_b);
                          var10.a(29709);
                          break L154;
                        }
                      }
                      try {
                        L157: {
                          var4.a(true);
                          break L157;
                        }
                      } catch (java.lang.Exception decompiledCaughtParameter4) {
                        decompiledCaughtException = decompiledCaughtParameter4;
                        L158: {
                          var6 = (Exception) (Object) decompiledCaughtException;
                          var6.printStackTrace();
                          break L158;
                        }
                      }
                      break L130;
                    }
                    dw.a(er.field_c, 105);
                    er.field_c = null;
                    ls.b(0);
                    stackOut_302_0 = 0;
                    stackIn_303_0 = stackOut_302_0;
                    decompiledRegionSelector0 = 14;
                    break L0;
                  }
                }
              }
            } catch (java.lang.RuntimeException decompiledCaughtParameter5) {
              decompiledCaughtException = decompiledCaughtParameter5;
              var3 = (RuntimeException) (Object) decompiledCaughtException;
              throw qo.a((Throwable) ((Object) var3), "Sumoblitz.PA(" + param0 + ',' + param1 + ')');
            }
            if (decompiledRegionSelector0 == 0) {
              return stackIn_9_0 != 0;
            } else {
              if (decompiledRegionSelector0 == 1) {
                return stackIn_14_0 != 0;
              } else {
                if (decompiledRegionSelector0 == 2) {
                  return stackIn_20_0 != 0;
                } else {
                  if (decompiledRegionSelector0 == 3) {
                    return stackIn_23_0 != 0;
                  } else {
                    if (decompiledRegionSelector0 == 4) {
                      return stackIn_29_0 != 0;
                    } else {
                      if (decompiledRegionSelector0 == 5) {
                        return stackIn_35_0 != 0;
                      } else {
                        if (decompiledRegionSelector0 == 6) {
                          return stackIn_41_0 != 0;
                        } else {
                          if (decompiledRegionSelector0 == 7) {
                            return stackIn_47_0 != 0;
                          } else {
                            if (decompiledRegionSelector0 == 8) {
                              return stackIn_53_0 != 0;
                            } else {
                              if (decompiledRegionSelector0 == 9) {
                                return stackIn_59_0 != 0;
                              } else {
                                if (decompiledRegionSelector0 == 10) {
                                  return stackIn_65_0 != 0;
                                } else {
                                  if (decompiledRegionSelector0 == 11) {
                                    return stackIn_73_0 != 0;
                                  } else {
                                    if (decompiledRegionSelector0 == 12) {
                                      return stackIn_188_0 != 0;
                                    } else {
                                      if (decompiledRegionSelector0 == 13) {
                                        return stackIn_190_0 != 0;
                                      } else {
                                        if (decompiledRegionSelector0 == 14) {
                                          return stackIn_303_0 != 0;
                                        } else {
                                          if (decompiledRegionSelector0 == 15) {
                                            return stackIn_415_0 != 0;
                                          } else {
                                            if (decompiledRegionSelector0 == 16) {
                                              return stackIn_423_0 != 0;
                                            } else {
                                              if (decompiledRegionSelector0 == 17) {
                                                return stackIn_425_0 != 0;
                                              } else {
                                                if (decompiledRegionSelector0 == 18) {
                                                  return stackIn_545_0 != 0;
                                                } else {
                                                  if (decompiledRegionSelector0 == 19) {
                                                    return stackIn_657_0 != 0;
                                                  } else {
                                                    if (decompiledRegionSelector0 == 20) {
                                                      return stackIn_675_0 != 0;
                                                    } else {
                                                      return stackIn_677_0 != 0;
                                                    }
                                                  }
                                                }
                                              }
                                            }
                                          }
                                        }
                                      }
                                    }
                                  }
                                }
                              }
                            }
                          }
                        }
                      }
                    }
                  }
                }
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
            this.field_D = null;
            this.field_K = null;
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2 = decompiledCaughtException;
          throw qo.a((Throwable) ((Object) var2), "Sumoblitz.E(" + param0 + ')');
        }
    }

    public Sumoblitz() {
        this.field_F = false;
        this.field_K = null;
    }

    public final void init() {
        try {
            this.a(13, "sumoblitz", 480);
        } catch (RuntimeException runtimeException) {
            throw qo.a((Throwable) ((Object) runtimeException), "Sumoblitz.init()");
        }
    }

    final static void a(int param0, int param1, byte param2) {
        dj discarded$4 = null;
        dj discarded$5 = null;
        dj discarded$6 = null;
        dj discarded$7 = null;
        RuntimeException var3 = null;
        int var3_int = 0;
        int var4 = 0;
        int var5 = 0;
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        var5 = field_L ? 1 : 0;
        try {
          L0: {
            if ((param0 ^ -1) != -1) {
              if (param2 <= -67) {
                L1: {
                  L2: {
                    L3: {
                      L4: {
                        var3_int = 0;
                        var4 = param1;
                        if (var4 == 1) {
                          var3_int = fi.a(5, he.field_o, (byte) -96);
                          discarded$4 = fe.a(-113, rc.field_l[22 + var3_int]);
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
                      discarded$5 = fe.a(89, lg.field_d[param0][1][var3_int]);
                      if (var5 == 0) {
                        break L1;
                      } else {
                        break L3;
                      }
                    }
                    var3_int = fi.a(lg.field_d[param0][2].length, he.field_o, (byte) -96);
                    discarded$6 = fe.a(-121, lg.field_d[param0][2][var3_int]);
                    if (var5 == 0) {
                      break L1;
                    } else {
                      break L2;
                    }
                  }
                  var3_int = fi.a(lg.field_d[param0][0].length, he.field_o, (byte) -96);
                  discarded$7 = fe.a(42, lg.field_d[param0][0][var3_int]);
                  break L1;
                }
                decompiledRegionSelector0 = 2;
                break L0;
              } else {
                decompiledRegionSelector0 = 1;
                break L0;
              }
            } else {
              decompiledRegionSelector0 = 0;
              break L0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3 = decompiledCaughtException;
          throw qo.a((Throwable) ((Object) var3), "Sumoblitz.OA(" + param0 + ',' + param1 + ',' + param2 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return;
        } else {
          if (decompiledRegionSelector0 == 1) {
            return;
          } else {
            return;
          }
        }
    }

    static {
        field_G = new int[16384];
        field_H = 0;
        field_I = 49;
    }
}
