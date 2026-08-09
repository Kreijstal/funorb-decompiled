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
        int var5 = 0;
        int stackIn_20_0 = 0;
        RuntimeException stackIn_28_0 = null;
        StringBuilder stackIn_28_1 = null;
        RuntimeException stackIn_29_0 = null;
        StringBuilder stackIn_29_1 = null;
        String stackIn_29_2 = null;
        StringBuilder stackIn_32_1 = null;
        StringBuilder stackIn_33_1 = null;
        String stackIn_33_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var4 = null;
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
                  stackIn_20_0 = 0;
                  break L4;
                } else {
                  stackIn_20_0 = 1;
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
            stackIn_28_0 = (RuntimeException) (var4);

            stackIn_28_1 = new StringBuilder().append("Sumoblitz.SA(");

            if (args == null) {
              stackIn_29_0 = (RuntimeException) ((Object) stackIn_28_0);
              stackIn_29_1 = (StringBuilder) ((Object) stackIn_28_1);
              stackIn_29_2 = "null";
              break L6;
            } else {
              stackIn_29_0 = (RuntimeException) ((Object) stackIn_28_0);
              stackIn_29_1 = (StringBuilder) ((Object) stackIn_28_1);
              stackIn_29_2 = "{...}";
              break L6;
            }
          }
          L7: {


            stackIn_32_1 = ((StringBuilder) (Object) stackIn_29_1).append(stackIn_29_2).append(',').append(param1).append(',').append(param2).append(',');

            if (param3 == null) {
              stackIn_29_0 = (RuntimeException) ((Object) stackIn_29_0);
              stackIn_33_1 = (StringBuilder) ((Object) stackIn_32_1);
              stackIn_33_2 = "null";
              break L7;
            } else {
              stackIn_29_0 = (RuntimeException) ((Object) stackIn_29_0);
              stackIn_33_1 = (StringBuilder) ((Object) stackIn_32_1);
              stackIn_33_2 = "{...}";
              break L7;
            }
          }
          throw qo.a((Throwable) ((Object) stackIn_29_0), stackIn_33_2 + ')');
        }
    }

    final void g(int param0) {
        RuntimeException decompiledCaughtException = null;
        RuntimeException var2 = null;
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
        int fieldTemp$0 = 0;
        qu stackIn_58_0 = null;
        qu stackIn_59_0 = null;
        int stackIn_59_1 = 0;
        RuntimeException decompiledCaughtException = null;
        int var2_int = 0;
        RuntimeException var2 = null;
        int var3 = 0;
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
                fieldTemp$0 = qn.field_g + 1;
                qn.field_g = qn.field_g + 1;
                if ((fieldTemp$0 ^ -1) != -257) {
                  break L2;
                } else {
                  qn.field_g = 0;
                  pl.field_v.c(9);
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
                stackIn_58_0 = ph.field_b;

                if (-1 != nj.field_b) {
                  stackIn_59_0 = (qu) ((Object) stackIn_58_0);
                  stackIn_59_1 = 0;
                  break L12;
                } else {

                  stackIn_59_0 = (qu) ((Object) stackIn_58_0);
                  stackIn_59_1 = 1;
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
        ud var3 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var2_ref = null;
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
            int stackIn_50_0 = 0;
            int decompiledRegionSelector0 = 0;
            Throwable decompiledCaughtException = null;
            java.awt.Canvas var2 = null;
            RuntimeException var2_ref = null;
            ha var3 = null;
            int var4_int = 0;
            ge var4 = null;
            int var5_int = 0;
            Exception var5 = null;
            int var6 = 0;
            int var7 = 0;
            String var8_ref_String = null;
            int var8 = 0;
            pm var9 = null;
            int var10 = 0;
            var10 = field_L ? 1 : 0;
            try {
              L0: {
                var2 = hk.b(-97);
                lk.b();
                if (in.g(param0 ^ -99)) {
                  ad.a((byte) 122, var2, np.a(param0 ^ 7));
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
                                stackIn_50_0 = 1;
                                break L8;
                              } else {
                                stackIn_50_0 = ii.field_a ? 1 : 0;
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
                          bq.field_c.a(150, var5_int << 1928370328, 0, 170, -180 + rj.field_c, (int[]) null, (hr[]) null, -1 + var7, var5_int << -1003925256, 0, 18, -8787, var8_ref_String, (aa) null, 1, 0);
                          bq.field_c.a(150, var5_int << -546648104, 0, 170, -180 + rj.field_c, (int[]) null, (hr[]) null, 1 + var7, var5_int << -410178184, 0, 18, -8787, var8_ref_String, (aa) null, 1, 0);
                          bq.field_c.a(150, var5_int << 1364626776 | 16777215, 0, 170, -180 + rj.field_c, (int[]) null, (hr[]) null, var7, -1, 0, 18, -8787, var8_ref_String, (aa) null, 1, 0);
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
                      od.a(-88, var2);
                      decompiledRegionSelector0 = 2;
                      break L0;
                    }
                  } else {
                    od.a(-62, var2);
                    decompiledRegionSelector0 = 1;
                    break L0;
                  }
                }
              }
            } catch (java.lang.RuntimeException decompiledCaughtParameter1) {
              decompiledCaughtException = decompiledCaughtParameter1;
              var2_ref = (RuntimeException) (Object) decompiledCaughtException;
              throw qo.a((Throwable) ((Object) var2_ref), "Sumoblitz.I(" + param0 + ')');
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
        RuntimeException decompiledCaughtException = null;
        RuntimeException var2 = null;
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
        boolean discarded$0 = false;
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
        int statePc = 0;
        Throwable caughtException = null;
        int var2_int = 0;
        RuntimeException var2 = null;
        hg var3_ref_hg = null;
        int var3 = 0;
        int var4 = 0;
        stateLoop: while (true) {
            switch (statePc) {
                case 0: {
                    var4 = field_L ? 1 : 0;
                    statePc = 1;
                    continue stateLoop;
                }
                case 1: {
                    try {
                        fv.e((byte) 76);
                        if (gk.field_o == null) {
                            statePc = 7;
                        } else {
                            statePc = 2;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_1) {
                        caughtException = stateCaught_1;
                        statePc = 126;
                        continue stateLoop;
                    }
                }
                case 2: {
                    try {
                        if (!gk.field_o.field_a) {
                            statePc = 7;
                        } else {
                            statePc = 3;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_2) {
                        caughtException = stateCaught_2;
                        statePc = 126;
                        continue stateLoop;
                    }
                }
                case 3: {
                    try {
                        statePc = 5;
                        continue stateLoop;
                    } catch (Throwable stateCaught_3) {
                        caughtException = stateCaught_3;
                        statePc = 126;
                        continue stateLoop;
                    }
                }
                case 5: {
                    try {
                        b.c((byte) 49);
                        qw.a((byte) 35);
                        statePc = 7;
                        continue stateLoop;
                    } catch (Throwable stateCaught_5) {
                        caughtException = stateCaught_5;
                        statePc = 126;
                        continue stateLoop;
                    }
                }
                case 7: {
                    try {
                        stackIn_10_0 = this;
                        stackIn_8_0 = stackIn_10_0;
                        if (null == gk.field_o) {
                            statePc = 10;
                        } else {
                            statePc = 8;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_7) {
                        caughtException = stateCaught_7;
                        statePc = 126;
                        continue stateLoop;
                    }
                }
                case 8: {
                    try {
                        stackIn_11_0 = this;
                        stackIn_11_1 = 1;
                        statePc = 11;
                        continue stateLoop;
                    } catch (Throwable stateCaught_8) {
                        caughtException = stateCaught_8;
                        statePc = 126;
                        continue stateLoop;
                    }
                }
                case 10: {
                    try {
                        stackIn_11_0 = this;
                        stackIn_11_1 = 0;
                        statePc = 11;
                        continue stateLoop;
                    } catch (Throwable stateCaught_10) {
                        caughtException = stateCaught_10;
                        statePc = 126;
                        continue stateLoop;
                    }
                }
                case 11: {
                    try {
                        this.b(stackIn_11_1 != 0, -103);
                        if (ml.field_u) {
                            statePc = 14;
                        } else {
                            statePc = 12;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_11) {
                        caughtException = stateCaught_11;
                        statePc = 126;
                        continue stateLoop;
                    }
                }
                case 12: {
                    try {
                        statePc = 15;
                        continue stateLoop;
                    } catch (Throwable stateCaught_12) {
                        caughtException = stateCaught_12;
                        statePc = 126;
                        continue stateLoop;
                    }
                }
                case 14: {
                    try {
                        this.r(21961);
                        ml.field_u = false;
                        statePc = 15;
                        continue stateLoop;
                    } catch (Throwable stateCaught_14) {
                        caughtException = stateCaught_14;
                        statePc = 126;
                        continue stateLoop;
                    }
                }
                case 15: {
                    try {
                        if (!in.g(-42)) {
                            statePc = 25;
                        } else {
                            statePc = 16;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_15) {
                        caughtException = stateCaught_15;
                        statePc = 126;
                        continue stateLoop;
                    }
                }
                case 16: {
                    try {
                        this.m(106);
                        if (in.g(-33)) {
                            statePc = 21;
                        } else {
                            statePc = 17;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_16) {
                        caughtException = stateCaught_16;
                        statePc = 126;
                        continue stateLoop;
                    }
                }
                case 17: {
                    try {
                        statePc = 19;
                        continue stateLoop;
                    } catch (Throwable stateCaught_17) {
                        caughtException = stateCaught_17;
                        statePc = 126;
                        continue stateLoop;
                    }
                }
                case 19: {
                    try {
                        statePc = 25;
                        continue stateLoop;
                    } catch (Throwable stateCaught_19) {
                        caughtException = stateCaught_19;
                        statePc = 126;
                        continue stateLoop;
                    }
                }
                case 21: {
                    try {
                        if (!we.g(-1)) {
                            statePc = 24;
                        } else {
                            statePc = 22;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_21) {
                        caughtException = stateCaught_21;
                        statePc = 126;
                        continue stateLoop;
                    }
                }
                case 22: {
                    try {
                        discarded$0 = this.a(false, true);
                        statePc = 24;
                        continue stateLoop;
                    } catch (Throwable stateCaught_22) {
                        caughtException = stateCaught_22;
                        statePc = 126;
                        continue stateLoop;
                    }
                }
                case 24: {
                    return;
                }
                case 25: {
                    try {
                        if (!sa.field_j) {
                            statePc = 100;
                        } else {
                            statePc = 26;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_25) {
                        caughtException = stateCaught_25;
                        statePc = 126;
                        continue stateLoop;
                    }
                }
                case 26: {
                    try {
                        if (su.a(0)) {
                            statePc = 44;
                        } else {
                            statePc = 27;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_26) {
                        caughtException = stateCaught_26;
                        statePc = 126;
                        continue stateLoop;
                    }
                }
                case 27: {
                    try {
                        statePc = 29;
                        continue stateLoop;
                    } catch (Throwable stateCaught_27) {
                        caughtException = stateCaught_27;
                        statePc = 126;
                        continue stateLoop;
                    }
                }
                case 29: {
                    try {
                        ou.d((byte) -112);
                        if (su.a(0)) {
                            statePc = 34;
                        } else {
                            statePc = 30;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_29) {
                        caughtException = stateCaught_29;
                        statePc = 126;
                        continue stateLoop;
                    }
                }
                case 30: {
                    try {
                        statePc = 32;
                        continue stateLoop;
                    } catch (Throwable stateCaught_30) {
                        caughtException = stateCaught_30;
                        statePc = 126;
                        continue stateLoop;
                    }
                }
                case 32: {
                    try {
                        statePc = 106;
                        continue stateLoop;
                    } catch (Throwable stateCaught_32) {
                        caughtException = stateCaught_32;
                        statePc = 126;
                        continue stateLoop;
                    }
                }
                case 34: {
                    try {
                        oq.a(-24233);
                        ad.c(0);
                        if (5 != nj.field_b) {
                            statePc = 40;
                        } else {
                            statePc = 35;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_34) {
                        caughtException = stateCaught_34;
                        statePc = 126;
                        continue stateLoop;
                    }
                }
                case 35: {
                    try {
                        if (0 != wj.field_e) {
                            statePc = 40;
                        } else {
                            statePc = 36;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_35) {
                        caughtException = stateCaught_35;
                        statePc = 126;
                        continue stateLoop;
                    }
                }
                case 36: {
                    try {
                        statePc = 38;
                        continue stateLoop;
                    } catch (Throwable stateCaught_36) {
                        caughtException = stateCaught_36;
                        statePc = 126;
                        continue stateLoop;
                    }
                }
                case 38: {
                    try {
                        nj.field_b = 2;
                        av.a(-7753, false, 2);
                        statePc = 40;
                        continue stateLoop;
                    } catch (Throwable stateCaught_38) {
                        caughtException = stateCaught_38;
                        statePc = 126;
                        continue stateLoop;
                    }
                }
                case 40: {
                    try {
                        if (!so.a((byte) 119)) {
                            statePc = 106;
                        } else {
                            statePc = 41;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_40) {
                        caughtException = stateCaught_40;
                        statePc = 126;
                        continue stateLoop;
                    }
                }
                case 41: {
                    try {
                        vb.a((byte) -111, true);
                        if (var4 == 0) {
                            statePc = 106;
                        } else {
                            statePc = 42;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_41) {
                        caughtException = stateCaught_41;
                        statePc = 126;
                        continue stateLoop;
                    }
                }
                case 42: {
                    try {
                        statePc = 44;
                        continue stateLoop;
                    } catch (Throwable stateCaught_42) {
                        caughtException = stateCaught_42;
                        statePc = 126;
                        continue stateLoop;
                    }
                }
                case 44: {
                    try {
                        if (!so.a((byte) 107)) {
                            statePc = 74;
                        } else {
                            statePc = 45;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_44) {
                        caughtException = stateCaught_44;
                        statePc = 126;
                        continue stateLoop;
                    }
                }
                case 45: {
                    try {
                        statePc = 47;
                        continue stateLoop;
                    } catch (Throwable stateCaught_45) {
                        caughtException = stateCaught_45;
                        statePc = 126;
                        continue stateLoop;
                    }
                }
                case 47: {
                    try {
                        if (0 != ra.field_e) {
                            statePc = 71;
                        } else {
                            statePc = 48;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_47) {
                        caughtException = stateCaught_47;
                        statePc = 126;
                        continue stateLoop;
                    }
                }
                case 48: {
                    try {
                        statePc = 50;
                        continue stateLoop;
                    } catch (Throwable stateCaught_48) {
                        caughtException = stateCaught_48;
                        statePc = 126;
                        continue stateLoop;
                    }
                }
                case 50: {
                    try {
                        var2_int = kt.a(-38);
                        if (2 != var2_int) {
                            statePc = 54;
                        } else {
                            statePc = 51;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_50) {
                        caughtException = stateCaught_50;
                        statePc = 126;
                        continue stateLoop;
                    }
                }
                case 51: {
                    try {
                        b.c((byte) 71);
                        if (var4 == 0) {
                            statePc = 66;
                        } else {
                            statePc = 52;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_51) {
                        caughtException = stateCaught_51;
                        statePc = 126;
                        continue stateLoop;
                    }
                }
                case 52: {
                    try {
                        statePc = 54;
                        continue stateLoop;
                    } catch (Throwable stateCaught_52) {
                        caughtException = stateCaught_52;
                        statePc = 126;
                        continue stateLoop;
                    }
                }
                case 54: {
                    try {
                        if (3 != var2_int) {
                            statePc = 60;
                        } else {
                            statePc = 55;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_54) {
                        caughtException = stateCaught_54;
                        statePc = 126;
                        continue stateLoop;
                    }
                }
                case 55: {
                    try {
                        statePc = 57;
                        continue stateLoop;
                    } catch (Throwable stateCaught_55) {
                        caughtException = stateCaught_55;
                        statePc = 126;
                        continue stateLoop;
                    }
                }
                case 57: {
                    try {
                        vb.a((byte) -21, true);
                        if (var4 == 0) {
                            statePc = 66;
                        } else {
                            statePc = 58;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_57) {
                        caughtException = stateCaught_57;
                        statePc = 126;
                        continue stateLoop;
                    }
                }
                case 58: {
                    try {
                        statePc = 60;
                        continue stateLoop;
                    } catch (Throwable stateCaught_58) {
                        caughtException = stateCaught_58;
                        statePc = 126;
                        continue stateLoop;
                    }
                }
                case 60: {
                    try {
                        if ((var2_int ^ -1) == -5) {
                            statePc = 65;
                        } else {
                            statePc = 61;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_60) {
                        caughtException = stateCaught_60;
                        statePc = 126;
                        continue stateLoop;
                    }
                }
                case 61: {
                    try {
                        statePc = 63;
                        continue stateLoop;
                    } catch (Throwable stateCaught_61) {
                        caughtException = stateCaught_61;
                        statePc = 126;
                        continue stateLoop;
                    }
                }
                case 63: {
                    try {
                        statePc = 66;
                        continue stateLoop;
                    } catch (Throwable stateCaught_63) {
                        caughtException = stateCaught_63;
                        statePc = 126;
                        continue stateLoop;
                    }
                }
                case 65: {
                    try {
                        wn.a(true);
                        statePc = 66;
                        continue stateLoop;
                    } catch (Throwable stateCaught_65) {
                        caughtException = stateCaught_65;
                        statePc = 126;
                        continue stateLoop;
                    }
                }
                case 66: {
                    try {
                        if (!so.a((byte) 109)) {
                            statePc = 69;
                        } else {
                            statePc = 67;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_66) {
                        caughtException = stateCaught_66;
                        statePc = 126;
                        continue stateLoop;
                    }
                }
                case 67: {
                    try {
                        statePc = 70;
                        continue stateLoop;
                    } catch (Throwable stateCaught_67) {
                        caughtException = stateCaught_67;
                        statePc = 126;
                        continue stateLoop;
                    }
                }
                case 69: {
                    try {
                        iv.field_g[nj.field_b].b(-8628, true);
                        statePc = 70;
                        continue stateLoop;
                    } catch (Throwable stateCaught_69) {
                        caughtException = stateCaught_69;
                        statePc = 126;
                        continue stateLoop;
                    }
                }
                case 70: {
                    try {
                        if (var4 == 0) {
                            statePc = 106;
                        } else {
                            statePc = 71;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_70) {
                        caughtException = stateCaught_70;
                        statePc = 126;
                        continue stateLoop;
                    }
                }
                case 71: {
                    try {
                        this.g((byte) 96);
                        if (var4 == 0) {
                            statePc = 106;
                        } else {
                            statePc = 72;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_71) {
                        caughtException = stateCaught_71;
                        statePc = 126;
                        continue stateLoop;
                    }
                }
                case 72: {
                    try {
                        statePc = 74;
                        continue stateLoop;
                    } catch (Throwable stateCaught_72) {
                        caughtException = stateCaught_72;
                        statePc = 126;
                        continue stateLoop;
                    }
                }
                case 74: {
                    try {
                        if (sj.a(-123)) {
                            statePc = 80;
                        } else {
                            statePc = 75;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_74) {
                        caughtException = stateCaught_74;
                        statePc = 126;
                        continue stateLoop;
                    }
                }
                case 75: {
                    try {
                        statePc = 77;
                        continue stateLoop;
                    } catch (Throwable stateCaught_75) {
                        caughtException = stateCaught_75;
                        statePc = 126;
                        continue stateLoop;
                    }
                }
                case 77: {
                    try {
                        this.g((byte) -94);
                        if (var4 == 0) {
                            statePc = 106;
                        } else {
                            statePc = 78;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_77) {
                        caughtException = stateCaught_77;
                        statePc = 126;
                        continue stateLoop;
                    }
                }
                case 78: {
                    try {
                        statePc = 80;
                        continue stateLoop;
                    } catch (Throwable stateCaught_78) {
                        caughtException = stateCaught_78;
                        statePc = 126;
                        continue stateLoop;
                    }
                }
                case 80: {
                    try {
                        stackIn_85_0 = this;
                        stackIn_81_0 = stackIn_85_0;
                        stackIn_85_1 = -1;
                        stackIn_81_1 = stackIn_85_1;
                        if (gk.field_o == null) {
                            statePc = 85;
                        } else {
                            statePc = 81;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_80) {
                        caughtException = stateCaught_80;
                        statePc = 126;
                        continue stateLoop;
                    }
                }
                case 81: {
                    try {
                        stackIn_83_0 = this;
                        stackIn_83_1 = stackIn_81_1;
                        statePc = 83;
                        continue stateLoop;
                    } catch (Throwable stateCaught_81) {
                        caughtException = stateCaught_81;
                        statePc = 126;
                        continue stateLoop;
                    }
                }
                case 83: {
                    try {
                        stackIn_86_0 = this;
                        stackIn_86_1 = stackIn_83_1;
                        stackIn_86_2 = 1;
                        statePc = 86;
                        continue stateLoop;
                    } catch (Throwable stateCaught_83) {
                        caughtException = stateCaught_83;
                        statePc = 126;
                        continue stateLoop;
                    }
                }
                case 85: {
                    try {
                        stackIn_86_0 = this;
                        stackIn_86_1 = stackIn_85_1;
                        stackIn_86_2 = 0;
                        statePc = 86;
                        continue stateLoop;
                    } catch (Throwable stateCaught_85) {
                        caughtException = stateCaught_85;
                        statePc = 126;
                        continue stateLoop;
                    }
                }
                case 86: {
                    try {
                        var2_int = this.a(stackIn_86_1, stackIn_86_2 != 0);
                        if (1 == var2_int) {
                            statePc = 90;
                        } else {
                            statePc = 87;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_86) {
                        caughtException = stateCaught_86;
                        statePc = 126;
                        continue stateLoop;
                    }
                }
                case 87: {
                    try {
                        if (var2_int != 2) {
                            statePc = 99;
                        } else {
                            statePc = 88;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_87) {
                        caughtException = stateCaught_87;
                        statePc = 126;
                        continue stateLoop;
                    }
                }
                case 88: {
                    try {
                        statePc = 90;
                        continue stateLoop;
                    } catch (Throwable stateCaught_88) {
                        caughtException = stateCaught_88;
                        statePc = 126;
                        continue stateLoop;
                    }
                }
                case 90: {
                    try {
                        if (null == gk.field_o) {
                            statePc = 95;
                        } else {
                            statePc = 91;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_90) {
                        caughtException = stateCaught_90;
                        statePc = 126;
                        continue stateLoop;
                    }
                }
                case 91: {
                    try {
                        statePc = 93;
                        continue stateLoop;
                    } catch (Throwable stateCaught_91) {
                        caughtException = stateCaught_91;
                        statePc = 126;
                        continue stateLoop;
                    }
                }
                case 93: {
                    try {
                        b.c((byte) 49);
                        statePc = 95;
                        continue stateLoop;
                    } catch (Throwable stateCaught_93) {
                        caughtException = stateCaught_93;
                        statePc = 126;
                        continue stateLoop;
                    }
                }
                case 95: {
                    try {
                        if (2 == var2_int) {
                            statePc = 98;
                        } else {
                            statePc = 96;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_95) {
                        caughtException = stateCaught_95;
                        statePc = 126;
                        continue stateLoop;
                    }
                }
                case 96: {
                    try {
                        statePc = 99;
                        continue stateLoop;
                    } catch (Throwable stateCaught_96) {
                        caughtException = stateCaught_96;
                        statePc = 126;
                        continue stateLoop;
                    }
                }
                case 98: {
                    try {
                        jl.a(ra.c(2), false);
                        statePc = 99;
                        continue stateLoop;
                    } catch (Throwable stateCaught_98) {
                        caughtException = stateCaught_98;
                        statePc = 126;
                        continue stateLoop;
                    }
                }
                case 99: {
                    try {
                        if (var4 == 0) {
                            statePc = 106;
                        } else {
                            statePc = 100;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_99) {
                        caughtException = stateCaught_99;
                        statePc = 126;
                        continue stateLoop;
                    }
                }
                case 100: {
                    try {
                        rg.a((byte) 55, pn.field_r);
                        if (this.a(true, true)) {
                            statePc = 105;
                        } else {
                            statePc = 101;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_100) {
                        caughtException = stateCaught_100;
                        statePc = 126;
                        continue stateLoop;
                    }
                }
                case 101: {
                    try {
                        statePc = 103;
                        continue stateLoop;
                    } catch (Throwable stateCaught_101) {
                        caughtException = stateCaught_101;
                        statePc = 126;
                        continue stateLoop;
                    }
                }
                case 103: {
                    try {
                        statePc = 106;
                        continue stateLoop;
                    } catch (Throwable stateCaught_103) {
                        caughtException = stateCaught_103;
                        statePc = 126;
                        continue stateLoop;
                    }
                }
                case 105: {
                    try {
                        sa.field_j = true;
                        statePc = 106;
                        continue stateLoop;
                    } catch (Throwable stateCaught_105) {
                        caughtException = stateCaught_105;
                        statePc = 126;
                        continue stateLoop;
                    }
                }
                case 106: {
                    try {
                        var2_int = 35 % ((37 - param0) / 61);
                        if (vs.b((byte) 9)) {
                            statePc = 115;
                        } else {
                            statePc = 107;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_106) {
                        caughtException = stateCaught_106;
                        statePc = 126;
                        continue stateLoop;
                    }
                }
                case 107: {
                    try {
                        var3_ref_hg = (hg) ((Object) pn.field_q.c(9));
                        if (var3_ref_hg != null) {
                            statePc = 112;
                        } else {
                            statePc = 108;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_107) {
                        caughtException = stateCaught_107;
                        statePc = 126;
                        continue stateLoop;
                    }
                }
                case 108: {
                    try {
                        if (var4 != 0) {
                            statePc = 114;
                        } else {
                            statePc = 109;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_108) {
                        caughtException = stateCaught_108;
                        statePc = 126;
                        continue stateLoop;
                    }
                }
                case 109: {
                    try {
                        if (var4 == 0) {
                            statePc = 115;
                        } else {
                            statePc = 110;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_109) {
                        caughtException = stateCaught_109;
                        statePc = 126;
                        continue stateLoop;
                    }
                }
                case 110: {
                    try {
                        statePc = 112;
                        continue stateLoop;
                    } catch (Throwable stateCaught_110) {
                        caughtException = stateCaught_110;
                        statePc = 126;
                        continue stateLoop;
                    }
                }
                case 112: {
                    try {
                        an.a(4, (byte) 30, var3_ref_hg);
                        statePc = 114;
                        continue stateLoop;
                    } catch (Throwable stateCaught_112) {
                        caughtException = stateCaught_112;
                        statePc = 126;
                        continue stateLoop;
                    }
                }
                case 114: {
                    try {
                        if (var4 == 0) {
                            statePc = 107;
                        } else {
                            statePc = 115;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_114) {
                        caughtException = stateCaught_114;
                        statePc = 126;
                        continue stateLoop;
                    }
                }
                case 115: {
                    try {
                        if (!vs.a(ov.field_e, -126)) {
                            statePc = 120;
                        } else {
                            statePc = 116;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_115) {
                        caughtException = stateCaught_115;
                        statePc = 126;
                        continue stateLoop;
                    }
                }
                case 116: {
                    try {
                        this.q(9289);
                        if (var4 != 0) {
                            statePc = 121;
                        } else {
                            statePc = 117;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_116) {
                        caughtException = stateCaught_116;
                        statePc = 126;
                        continue stateLoop;
                    }
                }
                case 117: {
                    try {
                        if (var4 == 0) {
                            statePc = 115;
                        } else {
                            statePc = 118;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_117) {
                        caughtException = stateCaught_117;
                        statePc = 126;
                        continue stateLoop;
                    }
                }
                case 118: {
                    try {
                        statePc = 120;
                        continue stateLoop;
                    } catch (Throwable stateCaught_118) {
                        caughtException = stateCaught_118;
                        statePc = 126;
                        continue stateLoop;
                    }
                }
                case 120: {
                    try {
                        gt.a(0, 0);
                        statePc = 121;
                        continue stateLoop;
                    } catch (Throwable stateCaught_120) {
                        caughtException = stateCaught_120;
                        statePc = 126;
                        continue stateLoop;
                    }
                }
                case 121: {
                    try {
                        if (!en.a(-23517)) {
                            statePc = 127;
                        } else {
                            statePc = 122;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_121) {
                        caughtException = stateCaught_121;
                        statePc = 126;
                        continue stateLoop;
                    }
                }
                case 122: {
                    try {
                        var3 = this.b(true);
                        if (var3 != 2) {
                            statePc = 127;
                        } else {
                            statePc = 123;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_122) {
                        caughtException = stateCaught_122;
                        statePc = 126;
                        continue stateLoop;
                    }
                }
                case 123: {
                    try {
                        we.a((byte) 70);
                        statePc = 127;
                        continue stateLoop;
                    } catch (Throwable stateCaught_123) {
                        caughtException = stateCaught_123;
                        statePc = 126;
                        continue stateLoop;
                    }
                }
                case 126: {
                    var2 = (RuntimeException) ((Object) caughtException);
                    throw qo.a((Throwable) ((Object) var2), "Sumoblitz.D(" + param0 + ')');
                }
                case 127: {
                    return;
                }
                default: throw new IllegalStateException("invalid CFG state " + statePc);
            }
        }
    }

    private final boolean h(byte param0) {
        ha var2 = null;
        RuntimeException var2_ref = null;
        int stackIn_7_0 = 0;
        int stackIn_15_0 = 0;
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
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
              stackIn_7_0 = 0;
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
              stackIn_15_0 = 1;
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
            boolean discarded$0 = false;
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
            int statePc = 0;
            java.awt.Canvas var3 = null;
            int var3_int = 0;
            RuntimeException var3_ref = null;
            ha var4 = null;
            int var5_int = 0;
            ge var5 = null;
            int var6_int = 0;
            Exception var6 = null;
            int var7 = 0;
            int var8 = 0;
            String var9_ref_String = null;
            int var9 = 0;
            pm var10 = null;
            int var11 = 0;
            stateLoop: while (true) {
                switch (statePc) {
                    case 0: {
                        var11 = field_L ? 1 : 0;
                        statePc = 1;
                        continue stateLoop;
                    }
                    case 1: {
                        cl.e(-69);
                        if (null != hl.field_d) {
                            statePc = 4;
                        } else {
                            statePc = 191;
                        }
                        continue stateLoop;
                    }
                    case 4: {
                        if (!pi.field_c.b((byte) 127)) {
                            statePc = 8;
                        } else {
                            statePc = 5;
                        }
                        continue stateLoop;
                    }
                    case 5: {
                        if (pi.field_c.a("basic", 100)) {
                            statePc = 10;
                        } else {
                            statePc = 8;
                        }
                        continue stateLoop;
                    }
                    case 8: {
                        pe.a(20, 3.0f, pt.a("basic", pi.field_c, m.field_V, true, es.field_j));
                        stackIn_9_0 = 0;
                        statePc = 9;
                        continue stateLoop;
                    }
                    case 9: {
                        return stackIn_9_0 != 0;
                    }
                    case 10: {
                        if (!pi.field_c.a("arialbold14", 100)) {
                            statePc = 13;
                        } else {
                            statePc = 15;
                        }
                        continue stateLoop;
                    }
                    case 13: {
                        pe.a(20, 4.0f, pt.a("arialbold14", pi.field_c, ce.field_l, true, ow.field_a));
                        stackIn_14_0 = 0;
                        statePc = 14;
                        continue stateLoop;
                    }
                    case 14: {
                        return stackIn_14_0 != 0;
                    }
                    case 15: {
                        if (!vb.field_J.b((byte) 127)) {
                            statePc = 19;
                        } else {
                            statePc = 16;
                        }
                        continue stateLoop;
                    }
                    case 16: {
                        if (vb.field_J.a("arialbold14", 100)) {
                            statePc = 21;
                        } else {
                            statePc = 19;
                        }
                        continue stateLoop;
                    }
                    case 19: {
                        pe.a(20, 5.0f, pt.a("arialbold14", vb.field_J, ce.field_l, true, ow.field_a));
                        stackIn_20_0 = 0;
                        statePc = 20;
                        continue stateLoop;
                    }
                    case 20: {
                        return stackIn_20_0 != 0;
                    }
                    case 21: {
                        if (pi.field_c.a("arial13", 100)) {
                            statePc = 24;
                        } else {
                            statePc = 22;
                        }
                        continue stateLoop;
                    }
                    case 22: {
                        pe.a(20, 4.0f, pt.a("arial13", pi.field_c, ce.field_l, true, ow.field_a));
                        stackIn_23_0 = 0;
                        statePc = 23;
                        continue stateLoop;
                    }
                    case 23: {
                        return stackIn_23_0 != 0;
                    }
                    case 24: {
                        if (!vb.field_J.b((byte) 127)) {
                            statePc = 28;
                        } else {
                            statePc = 25;
                        }
                        continue stateLoop;
                    }
                    case 25: {
                        if (vb.field_J.a("arial13", 100)) {
                            statePc = 30;
                        } else {
                            statePc = 28;
                        }
                        continue stateLoop;
                    }
                    case 28: {
                        pe.a(20, 5.0f, pt.a("arial13", vb.field_J, ce.field_l, true, ow.field_a));
                        stackIn_29_0 = 0;
                        statePc = 29;
                        continue stateLoop;
                    }
                    case 29: {
                        return stackIn_29_0 != 0;
                    }
                    case 30: {
                        if (!hl.field_d.b((byte) 127)) {
                            statePc = 34;
                        } else {
                            statePc = 31;
                        }
                        continue stateLoop;
                    }
                    case 31: {
                        if (hl.field_d.a(true)) {
                            statePc = 36;
                        } else {
                            statePc = 34;
                        }
                        continue stateLoop;
                    }
                    case 34: {
                        pe.a(20, 10.0f, pt.a("", hl.field_d, fn.field_A, true, hq.field_a));
                        stackIn_35_0 = 0;
                        statePc = 35;
                        continue stateLoop;
                    }
                    case 35: {
                        return stackIn_35_0 != 0;
                    }
                    case 36: {
                        if (!er.field_c.b((byte) 127)) {
                            statePc = 40;
                        } else {
                            statePc = 37;
                        }
                        continue stateLoop;
                    }
                    case 37: {
                        if (er.field_c.a(param1)) {
                            statePc = 42;
                        } else {
                            statePc = 40;
                        }
                        continue stateLoop;
                    }
                    case 40: {
                        pe.a(20, 20.0f, pt.a("", er.field_c, fn.field_A, true, hq.field_a));
                        stackIn_41_0 = 0;
                        statePc = 41;
                        continue stateLoop;
                    }
                    case 41: {
                        return stackIn_41_0 != 0;
                    }
                    case 42: {
                        if (!gg.field_r.b((byte) 127)) {
                            statePc = 46;
                        } else {
                            statePc = 43;
                        }
                        continue stateLoop;
                    }
                    case 43: {
                        if (gg.field_r.a(param1)) {
                            statePc = 48;
                        } else {
                            statePc = 46;
                        }
                        continue stateLoop;
                    }
                    case 46: {
                        pe.a(20, 30.0f, nw.a(jf.field_a, (byte) 85, 0, gg.field_r, sg.field_i));
                        stackIn_47_0 = 0;
                        statePc = 47;
                        continue stateLoop;
                    }
                    case 47: {
                        return stackIn_47_0 != 0;
                    }
                    case 48: {
                        if (!be.field_s.b((byte) 127)) {
                            statePc = 52;
                        } else {
                            statePc = 49;
                        }
                        continue stateLoop;
                    }
                    case 49: {
                        if (be.field_s.a(true)) {
                            statePc = 54;
                        } else {
                            statePc = 52;
                        }
                        continue stateLoop;
                    }
                    case 52: {
                        pe.a(20, 40.0f, pt.a("", be.field_s, ve.field_l, true, gt.field_hb));
                        stackIn_53_0 = 0;
                        statePc = 53;
                        continue stateLoop;
                    }
                    case 53: {
                        return stackIn_53_0 != 0;
                    }
                    case 54: {
                        if (!kf.field_v.b((byte) 127)) {
                            statePc = 58;
                        } else {
                            statePc = 55;
                        }
                        continue stateLoop;
                    }
                    case 55: {
                        if (kf.field_v.a(true)) {
                            statePc = 60;
                        } else {
                            statePc = 58;
                        }
                        continue stateLoop;
                    }
                    case 58: {
                        pe.a(20, 45.0f, pt.a("", kf.field_v, m.field_V, true, es.field_j));
                        stackIn_59_0 = 0;
                        statePc = 59;
                        continue stateLoop;
                    }
                    case 59: {
                        return stackIn_59_0 != 0;
                    }
                    case 60: {
                        if (!dq.field_Z.b((byte) 127)) {
                            statePc = 64;
                        } else {
                            statePc = 61;
                        }
                        continue stateLoop;
                    }
                    case 61: {
                        if (dq.field_Z.a(true)) {
                            statePc = 66;
                        } else {
                            statePc = 64;
                        }
                        continue stateLoop;
                    }
                    case 64: {
                        pe.a(20, 55.0f, pt.a("", dq.field_Z, ce.field_l, true, ow.field_a));
                        stackIn_65_0 = 0;
                        statePc = 65;
                        continue stateLoop;
                    }
                    case 65: {
                        return stackIn_65_0 != 0;
                    }
                    case 66: {
                        if (!ik.field_d.b((byte) 127)) {
                            statePc = 72;
                        } else {
                            statePc = 67;
                        }
                        continue stateLoop;
                    }
                    case 67: {
                        if (!ik.field_d.a(true)) {
                            statePc = 72;
                        } else {
                            statePc = 74;
                        }
                        continue stateLoop;
                    }
                    case 72: {
                        pe.a(20, 60.0f, nw.a(nm.field_n, (byte) 85, 0, ik.field_d, b.field_f));
                        stackIn_73_0 = 0;
                        statePc = 73;
                        continue stateLoop;
                    }
                    case 73: {
                        return stackIn_73_0 != 0;
                    }
                    case 74: {
                        pe.a(20, 65.0f, hv.field_e);
                        var3 = hk.b(-22);
                        lk.b();
                        if (!in.g(-61)) {
                            statePc = 78;
                        } else {
                            statePc = 75;
                        }
                        continue stateLoop;
                    }
                    case 75: {
                        ad.a((byte) 85, var3, np.a(7));
                        if (var11 == 0) {
                            statePc = 184;
                        } else {
                            statePc = 78;
                        }
                        continue stateLoop;
                    }
                    case 78: {
                        if (sa.field_j) {
                            statePc = 84;
                        } else {
                            statePc = 81;
                        }
                        continue stateLoop;
                    }
                    case 81: {
                        od.a(-117, var3);
                        if (var11 == 0) {
                            statePc = 184;
                        } else {
                            statePc = 84;
                        }
                        continue stateLoop;
                    }
                    case 84: {
                        if (su.a(0)) {
                            statePc = 90;
                        } else {
                            statePc = 87;
                        }
                        continue stateLoop;
                    }
                    case 87: {
                        pe.a(20, 100.0f, fl.field_s);
                        od.a(-117, var3);
                        if (var11 == 0) {
                            statePc = 184;
                        } else {
                            statePc = 90;
                        }
                        continue stateLoop;
                    }
                    case 90: {
                        stackIn_95_0 = nq.field_h;
                        stackIn_91_0 = stackIn_95_0;
                        if (param1) {
                            statePc = 95;
                        } else {
                            statePc = 91;
                        }
                        continue stateLoop;
                    }
                    case 91: {
                        stackIn_93_0 = (ik) ((Object) stackIn_91_0);
                        statePc = 93;
                        continue stateLoop;
                    }
                    case 93: {
                        stackIn_96_0 = (ik) ((Object) stackIn_93_0);
                        stackIn_96_1 = 1;
                        statePc = 96;
                        continue stateLoop;
                    }
                    case 95: {
                        stackIn_96_0 = (ik) ((Object) stackIn_95_0);
                        stackIn_96_1 = 0;
                        statePc = 96;
                        continue stateLoop;
                    }
                    case 96: {
                        if (!((ik) (Object) stackIn_96_0).a(stackIn_96_1 != 0)) {
                            statePc = 100;
                        } else {
                            statePc = 97;
                        }
                        continue stateLoop;
                    }
                    case 97: {
                        if (!this.h((byte) -105)) {
                            statePc = 184;
                        } else {
                            statePc = 100;
                        }
                        continue stateLoop;
                    }
                    case 100: {
                        var4 = nq.field_h.a(-97);
                        var4.GA(0);
                        ph.field_b.a(124, var4, false);
                        if ((rc.field_k ^ -1) != (nj.field_b ^ -1)) {
                            statePc = 107;
                        } else {
                            statePc = 101;
                        }
                        continue stateLoop;
                    }
                    case 101: {
                        if (-1 == nj.field_b) {
                            statePc = 115;
                        } else {
                            statePc = 104;
                        }
                        continue stateLoop;
                    }
                    case 104: {
                        iv.field_g[nj.field_b].a(255, var4, -2355);
                        if (var11 == 0) {
                            statePc = 115;
                        } else {
                            statePc = 107;
                        }
                        continue stateLoop;
                    }
                    case 107: {
                        var5_int = 255 * eh.field_a / 30;
                        if (-1 != nj.field_b) {
                            statePc = 110;
                        } else {
                            statePc = 111;
                        }
                        continue stateLoop;
                    }
                    case 110: {
                        iv.field_g[nj.field_b].a(255 - var5_int, var4, -2355);
                        statePc = 111;
                        continue stateLoop;
                    }
                    case 111: {
                        if ((rc.field_k ^ -1) != 0) {
                            statePc = 114;
                        } else {
                            statePc = 115;
                        }
                        continue stateLoop;
                    }
                    case 114: {
                        iv.field_g[rc.field_k].a(var5_int, var4, -2355);
                        statePc = 115;
                        continue stateLoop;
                    }
                    case 115: {
                        if (!so.a((byte) 124)) {
                            statePc = 118;
                        } else {
                            statePc = 116;
                        }
                        continue stateLoop;
                    }
                    case 116: {
                        lk.a(0, 0, lk.field_b, lk.field_c);
                        pn.d((byte) -7);
                        statePc = 118;
                        continue stateLoop;
                    }
                    case 118: {
                        if (0 != ra.field_e) {
                            statePc = 121;
                        } else {
                            statePc = 124;
                        }
                        continue stateLoop;
                    }
                    case 121: {
                        var5_int = eh.field_a * 256 / 30;
                        if (-1 <= (var5_int ^ -1)) {
                            statePc = 124;
                        } else {
                            statePc = 122;
                        }
                        continue stateLoop;
                    }
                    case 122: {
                        lk.b(0, 0, lk.field_b, lk.field_c, 0, var5_int);
                        statePc = 124;
                        continue stateLoop;
                    }
                    case 124: {
                        if (!sj.a(-67)) {
                            statePc = 135;
                        } else {
                            statePc = 125;
                        }
                        continue stateLoop;
                    }
                    case 125: {
                        if (!so.a((byte) 115)) {
                            statePc = 130;
                        } else {
                            statePc = 135;
                        }
                        continue stateLoop;
                    }
                    case 130: {
                        if (null != gk.field_o) {
                            statePc = 133;
                        } else {
                            statePc = 131;
                        }
                        continue stateLoop;
                    }
                    case 131: {
                        stackIn_134_0 = ii.field_a ? 1 : 0;
                        statePc = 134;
                        continue stateLoop;
                    }
                    case 133: {
                        stackIn_134_0 = 1;
                        statePc = 134;
                        continue stateLoop;
                    }
                    case 134: {
                        kn.a(stackIn_134_0 != 0, 25);
                        statePc = 135;
                        continue stateLoop;
                    }
                    case 135: {
                        if (-3 < (ku.field_j ^ -1)) {
                            statePc = 141;
                        } else {
                            statePc = 136;
                        }
                        continue stateLoop;
                    }
                    case 136: {
                        if (!gw.field_v) {
                            statePc = 141;
                        } else {
                            statePc = 139;
                        }
                        continue stateLoop;
                    }
                    case 139: {
                        bq.field_c.a(20, 20, 16777215, Integer.toString(aj.field_B), (byte) -103, 1);
                        statePc = 141;
                        continue stateLoop;
                    }
                    case 141: {
                        var5 = (ge) ((Object) pl.field_v.b(82));
                        if (null != var5) {
                            statePc = 144;
                        } else {
                            statePc = 158;
                        }
                        continue stateLoop;
                    }
                    case 144: {
                        var7 = qn.field_g;
                        if ((var7 ^ -1) <= -65) {
                            statePc = 146;
                        } else {
                            statePc = 145;
                        }
                        continue stateLoop;
                    }
                    case 145: {
                        var6_int = 255 * var7 / 64;
                        if (var11 == 0) {
                            statePc = 151;
                        } else {
                            statePc = 146;
                        }
                        continue stateLoop;
                    }
                    case 146: {
                        if (var7 > 192) {
                            statePc = 150;
                        } else {
                            statePc = 149;
                        }
                        continue stateLoop;
                    }
                    case 149: {
                        var6_int = 255;
                        if (var11 == 0) {
                            statePc = 151;
                        } else {
                            statePc = 150;
                        }
                        continue stateLoop;
                    }
                    case 150: {
                        var6_int = (-(255 * var7) + 48960) / 64;
                        statePc = 151;
                        continue stateLoop;
                    }
                    case 151: {
                        var8 = 45;
                        if (0 > var5.field_m) {
                            statePc = 156;
                        } else {
                            statePc = 152;
                        }
                        continue stateLoop;
                    }
                    case 152: {
                        var9_ref_String = rb.field_d[var5.field_m];
                        if ((qw.field_a.length ^ -1) >= (var5.field_m ^ -1)) {
                            statePc = 157;
                        } else {
                            statePc = 153;
                        }
                        continue stateLoop;
                    }
                    case 153: {
                        qw.field_a[var5.field_m].a(-32 + (85 + rj.field_c + -180), 45, 64, 64, 0, 16777215 | var6_int << 830870136, 1);
                        var8 += 65;
                        if (var11 == 0) {
                            statePc = 157;
                        } else {
                            statePc = 156;
                        }
                        continue stateLoop;
                    }
                    case 156: {
                        var9_ref_String = aa.field_b;
                        statePc = 157;
                        continue stateLoop;
                    }
                    case 157: {
                        bq.field_c.a(150, var6_int << 2138560952, 0, 170, rj.field_c - 180, (int[]) null, (hr[]) null, -1 + var8, var6_int << -959202280, 0, 18, -8787, var9_ref_String, (aa) null, 1, 0);
                        bq.field_c.a(150, var6_int << 1113845016, 0, 170, -180 + rj.field_c, (int[]) null, (hr[]) null, 1 + var8, var6_int << -98083080, 0, 18, -8787, var9_ref_String, (aa) null, 1, 0);
                        bq.field_c.a(150, var6_int << 1533176120 | 16777215, 0, 170, rj.field_c + -180, (int[]) null, (hr[]) null, var8, -1, 0, 18, -8787, var9_ref_String, (aa) null, 1, 0);
                        statePc = 158;
                        continue stateLoop;
                    }
                    case 158: {
                        if (!oj.a(false)) {
                            statePc = 160;
                        } else {
                            statePc = 159;
                        }
                        continue stateLoop;
                    }
                    case 159: {
                        var6_int = (-lk.field_b + gi.field_h) * 0 / 2;
                        var7 = (-lk.field_c + wq.field_b) * 0 / 2;
                        cf.a(var6_int, var7, 76);
                        kn.a(false, (byte) -122);
                        this.field_F = true;
                        if (var11 == 0) {
                            statePc = 170;
                        } else {
                            statePc = 160;
                        }
                        continue stateLoop;
                    }
                    case 160: {
                        if (!sj.a(-126)) {
                            statePc = 164;
                        } else {
                            statePc = 163;
                        }
                        continue stateLoop;
                    }
                    case 163: {
                        var6_int = (-lk.field_b + gi.field_h) * 0 / 2;
                        var7 = (wq.field_b - lk.field_c) * 0 / 2;
                        ls.a(var6_int, -45, var7);
                        kn.a(false, -66);
                        this.field_F = true;
                        if (var11 == 0) {
                            statePc = 170;
                        } else {
                            statePc = 164;
                        }
                        continue stateLoop;
                    }
                    case 164: {
                        if (!ws.b((byte) 52)) {
                            statePc = 169;
                        } else {
                            statePc = 170;
                        }
                        continue stateLoop;
                    }
                    case 169: {
                        this.field_F = false;
                        statePc = 170;
                        continue stateLoop;
                    }
                    case 170: {
                        if (this.field_F) {
                            statePc = 173;
                        } else {
                            statePc = 181;
                        }
                        continue stateLoop;
                    }
                    case 173: {
                        var6_int = lk.field_b;
                        var7 = lk.field_c;
                        if (this.field_K == null) {
                            statePc = 175;
                        } else {
                            statePc = 174;
                        }
                        continue stateLoop;
                    }
                    case 174: {
                        var6_int = this.field_K.field_x;
                        var7 = this.field_K.field_u;
                        statePc = 175;
                        continue stateLoop;
                    }
                    case 175: {
                        var8 = (-var6_int + gi.field_h) / 2;
                        var9 = (-var7 + wq.field_b) / 2;
                        if (!oj.a(false)) {
                            statePc = 180;
                        } else {
                            statePc = 176;
                        }
                        continue stateLoop;
                    }
                    case 176: {
                        if (this.field_K == null) {
                            statePc = 180;
                        } else {
                            statePc = 179;
                        }
                        continue stateLoop;
                    }
                    case 179: {
                        var8 = ik.c(-10517);
                        var9 = fd.b(3878);
                        statePc = 180;
                        continue stateLoop;
                    }
                    case 180: {
                        var10 = wq.a(var4, (byte) 126);
                        var10.a((byte) 91, var9, var7 + var9, var8, var6_int + var8);
                        var9 = (-lk.field_c + wq.field_b) / 2;
                        var8 = (-lk.field_b + gi.field_h) / 2;
                        var4.SA(var8, var9, lk.field_b, lk.field_c, lk.field_a, 0, lk.field_b);
                        var10.a(29709);
                        statePc = 181;
                        continue stateLoop;
                    }
                    case 181: {
                        var4.a(true);
                        statePc = 184;
                        continue stateLoop;
                    }
                    case 184: {
                        if (!param0) {
                            statePc = 187;
                        } else {
                            statePc = 189;
                        }
                        continue stateLoop;
                    }
                    case 187: {
                        stackIn_188_0 = 0;
                        statePc = 188;
                        continue stateLoop;
                    }
                    case 188: {
                        return stackIn_188_0 != 0;
                    }
                    case 189: {
                        eb.field_b = new og(hl.field_d, er.field_c);
                        ff.a((byte) -62, hl.field_d);
                        oq.a(-24233);
                        hl.field_d = null;
                        ls.b(0);
                        stackIn_190_0 = 0;
                        statePc = 190;
                        continue stateLoop;
                    }
                    case 190: {
                        return stackIn_190_0 != 0;
                    }
                    case 191: {
                        if (null == er.field_c) {
                            statePc = 304;
                        } else {
                            statePc = 192;
                        }
                        continue stateLoop;
                    }
                    case 192: {
                        pe.a(20, 70.0f, hv.field_e);
                        var3 = hk.b(-103);
                        lk.b();
                        if (!in.g(-96)) {
                            statePc = 196;
                        } else {
                            statePc = 193;
                        }
                        continue stateLoop;
                    }
                    case 193: {
                        ad.a((byte) -45, var3, np.a(7));
                        if (var11 == 0) {
                            statePc = 302;
                        } else {
                            statePc = 196;
                        }
                        continue stateLoop;
                    }
                    case 196: {
                        if (sa.field_j) {
                            statePc = 202;
                        } else {
                            statePc = 199;
                        }
                        continue stateLoop;
                    }
                    case 199: {
                        od.a(-121, var3);
                        if (var11 == 0) {
                            statePc = 302;
                        } else {
                            statePc = 202;
                        }
                        continue stateLoop;
                    }
                    case 202: {
                        if (su.a(0)) {
                            statePc = 208;
                        } else {
                            statePc = 205;
                        }
                        continue stateLoop;
                    }
                    case 205: {
                        pe.a(20, 100.0f, fl.field_s);
                        od.a(-68, var3);
                        if (var11 == 0) {
                            statePc = 302;
                        } else {
                            statePc = 208;
                        }
                        continue stateLoop;
                    }
                    case 208: {
                        if (!nq.field_h.a(false)) {
                            statePc = 214;
                        } else {
                            statePc = 211;
                        }
                        continue stateLoop;
                    }
                    case 211: {
                        if (!this.h((byte) -99)) {
                            statePc = 302;
                        } else {
                            statePc = 214;
                        }
                        continue stateLoop;
                    }
                    case 214: {
                        var4 = nq.field_h.a(-121);
                        var4.GA(0);
                        ph.field_b.a(123, var4, false);
                        if ((rc.field_k ^ -1) == (nj.field_b ^ -1)) {
                            statePc = 224;
                        } else {
                            statePc = 215;
                        }
                        continue stateLoop;
                    }
                    case 215: {
                        var5_int = eh.field_a * 255 / 30;
                        if ((nj.field_b ^ -1) != 0) {
                            statePc = 218;
                        } else {
                            statePc = 219;
                        }
                        continue stateLoop;
                    }
                    case 218: {
                        iv.field_g[nj.field_b].a(-var5_int + 255, var4, -2355);
                        statePc = 219;
                        continue stateLoop;
                    }
                    case 219: {
                        if (rc.field_k != -1) {
                            statePc = 222;
                        } else {
                            statePc = 223;
                        }
                        continue stateLoop;
                    }
                    case 222: {
                        iv.field_g[rc.field_k].a(var5_int, var4, -2355);
                        statePc = 223;
                        continue stateLoop;
                    }
                    case 223: {
                        if (var11 == 0) {
                            statePc = 229;
                        } else {
                            statePc = 224;
                        }
                        continue stateLoop;
                    }
                    case 224: {
                        if (0 == (nj.field_b ^ -1)) {
                            statePc = 229;
                        } else {
                            statePc = 227;
                        }
                        continue stateLoop;
                    }
                    case 227: {
                        iv.field_g[nj.field_b].a(255, var4, -2355);
                        statePc = 229;
                        continue stateLoop;
                    }
                    case 229: {
                        if (!so.a((byte) 118)) {
                            statePc = 232;
                        } else {
                            statePc = 230;
                        }
                        continue stateLoop;
                    }
                    case 230: {
                        lk.a(0, 0, lk.field_b, lk.field_c);
                        pn.d((byte) -7);
                        statePc = 232;
                        continue stateLoop;
                    }
                    case 232: {
                        if ((ra.field_e ^ -1) != -1) {
                            statePc = 235;
                        } else {
                            statePc = 239;
                        }
                        continue stateLoop;
                    }
                    case 235: {
                        var5_int = eh.field_a * 256 / 30;
                        if (-1 > (var5_int ^ -1)) {
                            statePc = 238;
                        } else {
                            statePc = 239;
                        }
                        continue stateLoop;
                    }
                    case 238: {
                        lk.b(0, 0, lk.field_b, lk.field_c, 0, var5_int);
                        statePc = 239;
                        continue stateLoop;
                    }
                    case 239: {
                        if (!sj.a(-126)) {
                            statePc = 250;
                        } else {
                            statePc = 240;
                        }
                        continue stateLoop;
                    }
                    case 240: {
                        if (so.a((byte) 110)) {
                            statePc = 250;
                        } else {
                            statePc = 243;
                        }
                        continue stateLoop;
                    }
                    case 243: {
                        if (gk.field_o != null) {
                            statePc = 248;
                        } else {
                            statePc = 246;
                        }
                        continue stateLoop;
                    }
                    case 246: {
                        stackIn_249_0 = ii.field_a ? 1 : 0;
                        statePc = 249;
                        continue stateLoop;
                    }
                    case 248: {
                        stackIn_249_0 = 1;
                        statePc = 249;
                        continue stateLoop;
                    }
                    case 249: {
                        kn.a(stackIn_249_0 != 0, 64);
                        statePc = 250;
                        continue stateLoop;
                    }
                    case 250: {
                        if (2 > ku.field_j) {
                            statePc = 257;
                        } else {
                            statePc = 251;
                        }
                        continue stateLoop;
                    }
                    case 251: {
                        if (gw.field_v) {
                            statePc = 256;
                        } else {
                            statePc = 257;
                        }
                        continue stateLoop;
                    }
                    case 256: {
                        bq.field_c.a(20, 20, 16777215, Integer.toString(aj.field_B), (byte) -98, 1);
                        statePc = 257;
                        continue stateLoop;
                    }
                    case 257: {
                        var5 = (ge) ((Object) pl.field_v.b(-100));
                        if (var5 == null) {
                            statePc = 272;
                        } else {
                            statePc = 258;
                        }
                        continue stateLoop;
                    }
                    case 258: {
                        var7 = qn.field_g;
                        if (64 > var7) {
                            statePc = 264;
                        } else {
                            statePc = 259;
                        }
                        continue stateLoop;
                    }
                    case 259: {
                        if (192 < var7) {
                            statePc = 263;
                        } else {
                            statePc = 262;
                        }
                        continue stateLoop;
                    }
                    case 262: {
                        var6_int = 255;
                        if (var11 == 0) {
                            statePc = 265;
                        } else {
                            statePc = 263;
                        }
                        continue stateLoop;
                    }
                    case 263: {
                        var6_int = (48960 - 255 * var7) / 64;
                        if (var11 == 0) {
                            statePc = 265;
                        } else {
                            statePc = 264;
                        }
                        continue stateLoop;
                    }
                    case 264: {
                        var6_int = var7 * 255 / 64;
                        statePc = 265;
                        continue stateLoop;
                    }
                    case 265: {
                        var8 = 45;
                        if ((var5.field_m ^ -1) > -1) {
                            statePc = 270;
                        } else {
                            statePc = 266;
                        }
                        continue stateLoop;
                    }
                    case 266: {
                        var9_ref_String = rb.field_d[var5.field_m];
                        if ((var5.field_m ^ -1) <= (qw.field_a.length ^ -1)) {
                            statePc = 271;
                        } else {
                            statePc = 267;
                        }
                        continue stateLoop;
                    }
                    case 267: {
                        var8 += 65;
                        qw.field_a[var5.field_m].a(-180 + rj.field_c + 85 - 32, 45, 64, 64, 0, var6_int << -1273320232 | 16777215, 1);
                        if (var11 == 0) {
                            statePc = 271;
                        } else {
                            statePc = 270;
                        }
                        continue stateLoop;
                    }
                    case 270: {
                        var9_ref_String = aa.field_b;
                        statePc = 271;
                        continue stateLoop;
                    }
                    case 271: {
                        bq.field_c.a(150, var6_int << 1534841976, 0, 170, -180 + rj.field_c, (int[]) null, (hr[]) null, -1 + var8, var6_int << -354884008, 0, 18, -8787, var9_ref_String, (aa) null, 1, 0);
                        bq.field_c.a(150, var6_int << 898716536, 0, 170, rj.field_c - 180, (int[]) null, (hr[]) null, 1 + var8, var6_int << 648239480, 0, 18, -8787, var9_ref_String, (aa) null, 1, 0);
                        bq.field_c.a(150, var6_int << 644256760 | 16777215, 0, 170, rj.field_c - 180, (int[]) null, (hr[]) null, var8, -1, 0, 18, -8787, var9_ref_String, (aa) null, 1, 0);
                        statePc = 272;
                        continue stateLoop;
                    }
                    case 272: {
                        if (param1) {
                            statePc = 275;
                        } else {
                            statePc = 273;
                        }
                        continue stateLoop;
                    }
                    case 273: {
                        stackIn_276_0 = 1;
                        statePc = 276;
                        continue stateLoop;
                    }
                    case 275: {
                        stackIn_276_0 = 0;
                        statePc = 276;
                        continue stateLoop;
                    }
                    case 276: {
                        if (!oj.a(stackIn_276_0 != 0)) {
                            statePc = 278;
                        } else {
                            statePc = 277;
                        }
                        continue stateLoop;
                    }
                    case 277: {
                        var6_int = 0 * (-lk.field_b + gi.field_h) / 2;
                        var7 = 0 * (-lk.field_c + wq.field_b) / 2;
                        cf.a(var6_int, var7, 126);
                        kn.a(false, (byte) -122);
                        this.field_F = true;
                        if (var11 == 0) {
                            statePc = 288;
                        } else {
                            statePc = 278;
                        }
                        continue stateLoop;
                    }
                    case 278: {
                        if (sj.a(-124)) {
                            statePc = 287;
                        } else {
                            statePc = 281;
                        }
                        continue stateLoop;
                    }
                    case 281: {
                        if (ws.b((byte) 52)) {
                            statePc = 288;
                        } else {
                            statePc = 284;
                        }
                        continue stateLoop;
                    }
                    case 284: {
                        this.field_F = false;
                        if (var11 == 0) {
                            statePc = 288;
                        } else {
                            statePc = 287;
                        }
                        continue stateLoop;
                    }
                    case 287: {
                        var6_int = (-lk.field_b + gi.field_h) * 0 / 2;
                        var7 = (-lk.field_c + wq.field_b) * 0 / 2;
                        ls.a(var6_int, -66, var7);
                        kn.a(false, -124);
                        this.field_F = true;
                        statePc = 288;
                        continue stateLoop;
                    }
                    case 288: {
                        if (!this.field_F) {
                            statePc = 299;
                        } else {
                            statePc = 289;
                        }
                        continue stateLoop;
                    }
                    case 289: {
                        var6_int = lk.field_b;
                        var7 = lk.field_c;
                        if (null == this.field_K) {
                            statePc = 291;
                        } else {
                            statePc = 290;
                        }
                        continue stateLoop;
                    }
                    case 290: {
                        var6_int = this.field_K.field_x;
                        var7 = this.field_K.field_u;
                        statePc = 291;
                        continue stateLoop;
                    }
                    case 291: {
                        var8 = (-var6_int + gi.field_h) / 2;
                        var9 = (-var7 + wq.field_b) / 2;
                        if (!oj.a(false)) {
                            statePc = 298;
                        } else {
                            statePc = 292;
                        }
                        continue stateLoop;
                    }
                    case 292: {
                        if (null != this.field_K) {
                            statePc = 297;
                        } else {
                            statePc = 298;
                        }
                        continue stateLoop;
                    }
                    case 297: {
                        var8 = ik.c(-10517);
                        var9 = fd.b(3878);
                        statePc = 298;
                        continue stateLoop;
                    }
                    case 298: {
                        var10 = wq.a(var4, (byte) 70);
                        var10.a((byte) -88, var9, var7 + var9, var8, var6_int + var8);
                        var9 = (-lk.field_c + wq.field_b) / 2;
                        var8 = (-lk.field_b + gi.field_h) / 2;
                        var4.SA(var8, var9, lk.field_b, lk.field_c, lk.field_a, 0, lk.field_b);
                        var10.a(29709);
                        statePc = 299;
                        continue stateLoop;
                    }
                    case 299: {
                        var4.a(true);
                        statePc = 302;
                        continue stateLoop;
                    }
                    case 302: {
                        dw.a(er.field_c, 105);
                        er.field_c = null;
                        ls.b(0);
                        stackIn_303_0 = 0;
                        statePc = 303;
                        continue stateLoop;
                    }
                    case 303: {
                        return stackIn_303_0 != 0;
                    }
                    case 304: {
                        if (null != be.field_s) {
                            statePc = 307;
                        } else {
                            statePc = 416;
                        }
                        continue stateLoop;
                    }
                    case 307: {
                        pe.a(20, 75.0f, su.field_d);
                        var3 = hk.b(-103);
                        lk.b();
                        if (!in.g(-98)) {
                            statePc = 311;
                        } else {
                            statePc = 308;
                        }
                        continue stateLoop;
                    }
                    case 308: {
                        ad.a((byte) 95, var3, np.a(7));
                        if (var11 == 0) {
                            statePc = 414;
                        } else {
                            statePc = 311;
                        }
                        continue stateLoop;
                    }
                    case 311: {
                        if (sa.field_j) {
                            statePc = 317;
                        } else {
                            statePc = 314;
                        }
                        continue stateLoop;
                    }
                    case 314: {
                        od.a(-73, var3);
                        if (var11 == 0) {
                            statePc = 414;
                        } else {
                            statePc = 317;
                        }
                        continue stateLoop;
                    }
                    case 317: {
                        if (su.a(0)) {
                            statePc = 323;
                        } else {
                            statePc = 320;
                        }
                        continue stateLoop;
                    }
                    case 320: {
                        pe.a(20, 100.0f, fl.field_s);
                        od.a(-111, var3);
                        if (var11 == 0) {
                            statePc = 414;
                        } else {
                            statePc = 323;
                        }
                        continue stateLoop;
                    }
                    case 323: {
                        if (nq.field_h.a(false)) {
                            statePc = 328;
                        } else {
                            statePc = 332;
                        }
                        continue stateLoop;
                    }
                    case 328: {
                        if (this.h((byte) -48)) {
                            statePc = 332;
                        } else {
                            statePc = 329;
                        }
                        continue stateLoop;
                    }
                    case 329: {
                        if (var11 == 0) {
                            statePc = 414;
                        } else {
                            statePc = 332;
                        }
                        continue stateLoop;
                    }
                    case 332: {
                        var4 = nq.field_h.a(-128);
                        var4.GA(0);
                        ph.field_b.a(124, var4, false);
                        if ((nj.field_b ^ -1) == (rc.field_k ^ -1)) {
                            statePc = 340;
                        } else {
                            statePc = 333;
                        }
                        continue stateLoop;
                    }
                    case 333: {
                        var5_int = 255 * eh.field_a / 30;
                        if ((nj.field_b ^ -1) == 0) {
                            statePc = 336;
                        } else {
                            statePc = 334;
                        }
                        continue stateLoop;
                    }
                    case 334: {
                        iv.field_g[nj.field_b].a(-var5_int + 255, var4, -2355);
                        statePc = 336;
                        continue stateLoop;
                    }
                    case 336: {
                        if ((rc.field_k ^ -1) == 0) {
                            statePc = 339;
                        } else {
                            statePc = 337;
                        }
                        continue stateLoop;
                    }
                    case 337: {
                        iv.field_g[rc.field_k].a(var5_int, var4, -2355);
                        statePc = 339;
                        continue stateLoop;
                    }
                    case 339: {
                        if (var11 == 0) {
                            statePc = 345;
                        } else {
                            statePc = 340;
                        }
                        continue stateLoop;
                    }
                    case 340: {
                        if (-1 == nj.field_b) {
                            statePc = 345;
                        } else {
                            statePc = 343;
                        }
                        continue stateLoop;
                    }
                    case 343: {
                        iv.field_g[nj.field_b].a(255, var4, -2355);
                        statePc = 345;
                        continue stateLoop;
                    }
                    case 345: {
                        if (!so.a((byte) 109)) {
                            statePc = 348;
                        } else {
                            statePc = 346;
                        }
                        continue stateLoop;
                    }
                    case 346: {
                        lk.a(0, 0, lk.field_b, lk.field_c);
                        pn.d((byte) -7);
                        statePc = 348;
                        continue stateLoop;
                    }
                    case 348: {
                        if ((ra.field_e ^ -1) == -1) {
                            statePc = 353;
                        } else {
                            statePc = 349;
                        }
                        continue stateLoop;
                    }
                    case 349: {
                        var5_int = eh.field_a * 256 / 30;
                        if (0 < var5_int) {
                            statePc = 352;
                        } else {
                            statePc = 353;
                        }
                        continue stateLoop;
                    }
                    case 352: {
                        lk.b(0, 0, lk.field_b, lk.field_c, 0, var5_int);
                        statePc = 353;
                        continue stateLoop;
                    }
                    case 353: {
                        if (!sj.a(-28)) {
                            statePc = 364;
                        } else {
                            statePc = 354;
                        }
                        continue stateLoop;
                    }
                    case 354: {
                        if (!so.a((byte) -55)) {
                            statePc = 359;
                        } else {
                            statePc = 364;
                        }
                        continue stateLoop;
                    }
                    case 359: {
                        if (gk.field_o == null) {
                            statePc = 362;
                        } else {
                            statePc = 360;
                        }
                        continue stateLoop;
                    }
                    case 360: {
                        stackIn_363_0 = 1;
                        statePc = 363;
                        continue stateLoop;
                    }
                    case 362: {
                        stackIn_363_0 = ii.field_a ? 1 : 0;
                        statePc = 363;
                        continue stateLoop;
                    }
                    case 363: {
                        kn.a(stackIn_363_0 != 0, -122);
                        statePc = 364;
                        continue stateLoop;
                    }
                    case 364: {
                        if ((ku.field_j ^ -1) > -3) {
                            statePc = 371;
                        } else {
                            statePc = 365;
                        }
                        continue stateLoop;
                    }
                    case 365: {
                        if (gw.field_v) {
                            statePc = 370;
                        } else {
                            statePc = 371;
                        }
                        continue stateLoop;
                    }
                    case 370: {
                        bq.field_c.a(20, 20, 16777215, Integer.toString(aj.field_B), (byte) -122, 1);
                        statePc = 371;
                        continue stateLoop;
                    }
                    case 371: {
                        var5 = (ge) ((Object) pl.field_v.b(-85));
                        if (null != var5) {
                            statePc = 374;
                        } else {
                            statePc = 388;
                        }
                        continue stateLoop;
                    }
                    case 374: {
                        var7 = qn.field_g;
                        if (64 > var7) {
                            statePc = 380;
                        } else {
                            statePc = 375;
                        }
                        continue stateLoop;
                    }
                    case 375: {
                        if (var7 > 192) {
                            statePc = 379;
                        } else {
                            statePc = 378;
                        }
                        continue stateLoop;
                    }
                    case 378: {
                        var6_int = 255;
                        if (var11 == 0) {
                            statePc = 381;
                        } else {
                            statePc = 379;
                        }
                        continue stateLoop;
                    }
                    case 379: {
                        var6_int = (48960 - var7 * 255) / 64;
                        if (var11 == 0) {
                            statePc = 381;
                        } else {
                            statePc = 380;
                        }
                        continue stateLoop;
                    }
                    case 380: {
                        var6_int = 255 * var7 / 64;
                        statePc = 381;
                        continue stateLoop;
                    }
                    case 381: {
                        var8 = 45;
                        if ((var5.field_m ^ -1) <= -1) {
                            statePc = 383;
                        } else {
                            statePc = 382;
                        }
                        continue stateLoop;
                    }
                    case 382: {
                        var9_ref_String = aa.field_b;
                        if (var11 == 0) {
                            statePc = 387;
                        } else {
                            statePc = 383;
                        }
                        continue stateLoop;
                    }
                    case 383: {
                        var9_ref_String = rb.field_d[var5.field_m];
                        if (qw.field_a.length > var5.field_m) {
                            statePc = 386;
                        } else {
                            statePc = 387;
                        }
                        continue stateLoop;
                    }
                    case 386: {
                        var8 += 65;
                        qw.field_a[var5.field_m].a(rj.field_c - 180 + 53, 45, 64, 64, 0, var6_int << 845463512 | 16777215, 1);
                        statePc = 387;
                        continue stateLoop;
                    }
                    case 387: {
                        bq.field_c.a(150, var6_int << -1210373192, 0, 170, -180 + rj.field_c, (int[]) null, (hr[]) null, var8 + -1, var6_int << 156532632, 0, 18, -8787, var9_ref_String, (aa) null, 1, 0);
                        bq.field_c.a(150, var6_int << -135066696, 0, 170, rj.field_c + -180, (int[]) null, (hr[]) null, 1 + var8, var6_int << -2061898952, 0, 18, -8787, var9_ref_String, (aa) null, 1, 0);
                        bq.field_c.a(150, var6_int << 803257688 | 16777215, 0, 170, rj.field_c - 180, (int[]) null, (hr[]) null, var8, -1, 0, 18, -8787, var9_ref_String, (aa) null, 1, 0);
                        statePc = 388;
                        continue stateLoop;
                    }
                    case 388: {
                        if (!oj.a(false)) {
                            statePc = 390;
                        } else {
                            statePc = 389;
                        }
                        continue stateLoop;
                    }
                    case 389: {
                        var6_int = 0 * (gi.field_h - lk.field_b) / 2;
                        var7 = (wq.field_b - lk.field_c) * 0 / 2;
                        cf.a(var6_int, var7, 86);
                        kn.a(false, (byte) -122);
                        this.field_F = true;
                        if (var11 == 0) {
                            statePc = 400;
                        } else {
                            statePc = 390;
                        }
                        continue stateLoop;
                    }
                    case 390: {
                        if (sj.a(-63)) {
                            statePc = 399;
                        } else {
                            statePc = 393;
                        }
                        continue stateLoop;
                    }
                    case 393: {
                        if (ws.b((byte) 52)) {
                            statePc = 400;
                        } else {
                            statePc = 396;
                        }
                        continue stateLoop;
                    }
                    case 396: {
                        this.field_F = false;
                        if (var11 == 0) {
                            statePc = 400;
                        } else {
                            statePc = 399;
                        }
                        continue stateLoop;
                    }
                    case 399: {
                        var6_int = 0 * (gi.field_h + -lk.field_b) / 2;
                        var7 = (wq.field_b + -lk.field_c) * 0 / 2;
                        ls.a(var6_int, -82, var7);
                        kn.a(false, -100);
                        this.field_F = true;
                        statePc = 400;
                        continue stateLoop;
                    }
                    case 400: {
                        if (!this.field_F) {
                            statePc = 411;
                        } else {
                            statePc = 401;
                        }
                        continue stateLoop;
                    }
                    case 401: {
                        var6_int = lk.field_b;
                        var7 = lk.field_c;
                        if (this.field_K == null) {
                            statePc = 403;
                        } else {
                            statePc = 402;
                        }
                        continue stateLoop;
                    }
                    case 402: {
                        var6_int = this.field_K.field_x;
                        var7 = this.field_K.field_u;
                        statePc = 403;
                        continue stateLoop;
                    }
                    case 403: {
                        var8 = (gi.field_h + -var6_int) / 2;
                        var9 = (-var7 + wq.field_b) / 2;
                        if (!oj.a(false)) {
                            statePc = 410;
                        } else {
                            statePc = 404;
                        }
                        continue stateLoop;
                    }
                    case 404: {
                        if (this.field_K != null) {
                            statePc = 409;
                        } else {
                            statePc = 410;
                        }
                        continue stateLoop;
                    }
                    case 409: {
                        var8 = ik.c(-10517);
                        var9 = fd.b(3878);
                        statePc = 410;
                        continue stateLoop;
                    }
                    case 410: {
                        var10 = wq.a(var4, (byte) 28);
                        var10.a((byte) 127, var9, var7 + var9, var8, var8 + var6_int);
                        var9 = (wq.field_b - lk.field_c) / 2;
                        var8 = (-lk.field_b + gi.field_h) / 2;
                        var4.SA(var8, var9, lk.field_b, lk.field_c, lk.field_a, 0, lk.field_b);
                        var10.a(29709);
                        statePc = 411;
                        continue stateLoop;
                    }
                    case 411: {
                        var4.a(true);
                        statePc = 414;
                        continue stateLoop;
                    }
                    case 414: {
                        au.a(-1509, be.field_s);
                        be.field_s = null;
                        ls.b(0);
                        stackIn_415_0 = 0;
                        statePc = 415;
                        continue stateLoop;
                    }
                    case 415: {
                        return stackIn_415_0 != 0;
                    }
                    case 416: {
                        if (gg.field_r == null) {
                            statePc = 426;
                        } else {
                            statePc = 417;
                        }
                        continue stateLoop;
                    }
                    case 417: {
                        if (!il.a(false, gg.field_r)) {
                            statePc = 422;
                        } else {
                            statePc = 424;
                        }
                        continue stateLoop;
                    }
                    case 422: {
                        ls.b(0);
                        stackIn_423_0 = 0;
                        statePc = 423;
                        continue stateLoop;
                    }
                    case 423: {
                        return stackIn_423_0 != 0;
                    }
                    case 424: {
                        gg.field_r = null;
                        ls.b(0);
                        stackIn_425_0 = 0;
                        statePc = 425;
                        continue stateLoop;
                    }
                    case 425: {
                        return stackIn_425_0 != 0;
                    }
                    case 426: {
                        if (ik.field_d != null) {
                            statePc = 429;
                        } else {
                            statePc = 546;
                        }
                        continue stateLoop;
                    }
                    case 429: {
                        pe.a(20, 80.0f, om.field_n);
                        var3 = hk.b(125);
                        lk.b();
                        if (!in.g(-128)) {
                            statePc = 433;
                        } else {
                            statePc = 430;
                        }
                        continue stateLoop;
                    }
                    case 430: {
                        ad.a((byte) -75, var3, np.a(7));
                        if (var11 == 0) {
                            statePc = 544;
                        } else {
                            statePc = 433;
                        }
                        continue stateLoop;
                    }
                    case 433: {
                        if (sa.field_j) {
                            statePc = 439;
                        } else {
                            statePc = 436;
                        }
                        continue stateLoop;
                    }
                    case 436: {
                        od.a(-67, var3);
                        if (var11 == 0) {
                            statePc = 544;
                        } else {
                            statePc = 439;
                        }
                        continue stateLoop;
                    }
                    case 439: {
                        if (su.a(0)) {
                            statePc = 445;
                        } else {
                            statePc = 442;
                        }
                        continue stateLoop;
                    }
                    case 442: {
                        pe.a(20, 100.0f, fl.field_s);
                        od.a(-52, var3);
                        if (var11 == 0) {
                            statePc = 544;
                        } else {
                            statePc = 445;
                        }
                        continue stateLoop;
                    }
                    case 445: {
                        stackIn_450_0 = nq.field_h;
                        stackIn_446_0 = stackIn_450_0;
                        if (param1) {
                            statePc = 450;
                        } else {
                            statePc = 446;
                        }
                        continue stateLoop;
                    }
                    case 446: {
                        stackIn_448_0 = (ik) ((Object) stackIn_446_0);
                        statePc = 448;
                        continue stateLoop;
                    }
                    case 448: {
                        stackIn_451_0 = (ik) ((Object) stackIn_448_0);
                        stackIn_451_1 = 1;
                        statePc = 451;
                        continue stateLoop;
                    }
                    case 450: {
                        stackIn_451_0 = (ik) ((Object) stackIn_450_0);
                        stackIn_451_1 = 0;
                        statePc = 451;
                        continue stateLoop;
                    }
                    case 451: {
                        if (((ik) (Object) stackIn_451_0).a(stackIn_451_1 != 0)) {
                            statePc = 454;
                        } else {
                            statePc = 458;
                        }
                        continue stateLoop;
                    }
                    case 454: {
                        if (this.h((byte) -11)) {
                            statePc = 458;
                        } else {
                            statePc = 455;
                        }
                        continue stateLoop;
                    }
                    case 455: {
                        if (var11 == 0) {
                            statePc = 544;
                        } else {
                            statePc = 458;
                        }
                        continue stateLoop;
                    }
                    case 458: {
                        var4 = nq.field_h.a(-120);
                        var4.GA(0);
                        ph.field_b.a(122, var4, false);
                        if ((nj.field_b ^ -1) == (rc.field_k ^ -1)) {
                            statePc = 468;
                        } else {
                            statePc = 459;
                        }
                        continue stateLoop;
                    }
                    case 459: {
                        var5_int = eh.field_a * 255 / 30;
                        if (-1 != nj.field_b) {
                            statePc = 462;
                        } else {
                            statePc = 463;
                        }
                        continue stateLoop;
                    }
                    case 462: {
                        iv.field_g[nj.field_b].a(-var5_int + 255, var4, -2355);
                        statePc = 463;
                        continue stateLoop;
                    }
                    case 463: {
                        if (0 != (rc.field_k ^ -1)) {
                            statePc = 466;
                        } else {
                            statePc = 467;
                        }
                        continue stateLoop;
                    }
                    case 466: {
                        iv.field_g[rc.field_k].a(var5_int, var4, -2355);
                        statePc = 467;
                        continue stateLoop;
                    }
                    case 467: {
                        if (var11 == 0) {
                            statePc = 473;
                        } else {
                            statePc = 468;
                        }
                        continue stateLoop;
                    }
                    case 468: {
                        if (0 == (nj.field_b ^ -1)) {
                            statePc = 473;
                        } else {
                            statePc = 471;
                        }
                        continue stateLoop;
                    }
                    case 471: {
                        iv.field_g[nj.field_b].a(255, var4, -2355);
                        statePc = 473;
                        continue stateLoop;
                    }
                    case 473: {
                        if (!so.a((byte) -36)) {
                            statePc = 476;
                        } else {
                            statePc = 474;
                        }
                        continue stateLoop;
                    }
                    case 474: {
                        lk.a(0, 0, lk.field_b, lk.field_c);
                        pn.d((byte) -7);
                        statePc = 476;
                        continue stateLoop;
                    }
                    case 476: {
                        if (ra.field_e != 0) {
                            statePc = 479;
                        } else {
                            statePc = 482;
                        }
                        continue stateLoop;
                    }
                    case 479: {
                        var5_int = 256 * eh.field_a / 30;
                        if (var5_int <= 0) {
                            statePc = 482;
                        } else {
                            statePc = 480;
                        }
                        continue stateLoop;
                    }
                    case 480: {
                        lk.b(0, 0, lk.field_b, lk.field_c, 0, var5_int);
                        statePc = 482;
                        continue stateLoop;
                    }
                    case 482: {
                        if (!sj.a(-103)) {
                            statePc = 493;
                        } else {
                            statePc = 483;
                        }
                        continue stateLoop;
                    }
                    case 483: {
                        if (so.a((byte) 127)) {
                            statePc = 493;
                        } else {
                            statePc = 486;
                        }
                        continue stateLoop;
                    }
                    case 486: {
                        if (null != gk.field_o) {
                            statePc = 491;
                        } else {
                            statePc = 489;
                        }
                        continue stateLoop;
                    }
                    case 489: {
                        stackIn_492_0 = ii.field_a ? 1 : 0;
                        statePc = 492;
                        continue stateLoop;
                    }
                    case 491: {
                        stackIn_492_0 = 1;
                        statePc = 492;
                        continue stateLoop;
                    }
                    case 492: {
                        kn.a(stackIn_492_0 != 0, 115);
                        statePc = 493;
                        continue stateLoop;
                    }
                    case 493: {
                        if ((ku.field_j ^ -1) > -3) {
                            statePc = 500;
                        } else {
                            statePc = 494;
                        }
                        continue stateLoop;
                    }
                    case 494: {
                        if (gw.field_v) {
                            statePc = 499;
                        } else {
                            statePc = 500;
                        }
                        continue stateLoop;
                    }
                    case 499: {
                        bq.field_c.a(20, 20, 16777215, Integer.toString(aj.field_B), (byte) -61, 1);
                        statePc = 500;
                        continue stateLoop;
                    }
                    case 500: {
                        var5 = (ge) ((Object) pl.field_v.b(110));
                        if (null != var5) {
                            statePc = 503;
                        } else {
                            statePc = 517;
                        }
                        continue stateLoop;
                    }
                    case 503: {
                        var7 = qn.field_g;
                        if ((var7 ^ -1) <= -65) {
                            statePc = 505;
                        } else {
                            statePc = 504;
                        }
                        continue stateLoop;
                    }
                    case 504: {
                        var6_int = 255 * var7 / 64;
                        if (var11 == 0) {
                            statePc = 510;
                        } else {
                            statePc = 505;
                        }
                        continue stateLoop;
                    }
                    case 505: {
                        if ((var7 ^ -1) >= -193) {
                            statePc = 509;
                        } else {
                            statePc = 508;
                        }
                        continue stateLoop;
                    }
                    case 508: {
                        var6_int = (192 - var7) * 255 / 64;
                        if (var11 == 0) {
                            statePc = 510;
                        } else {
                            statePc = 509;
                        }
                        continue stateLoop;
                    }
                    case 509: {
                        var6_int = 255;
                        statePc = 510;
                        continue stateLoop;
                    }
                    case 510: {
                        var8 = 45;
                        if (0 <= var5.field_m) {
                            statePc = 512;
                        } else {
                            statePc = 511;
                        }
                        continue stateLoop;
                    }
                    case 511: {
                        var9_ref_String = aa.field_b;
                        if (var11 == 0) {
                            statePc = 516;
                        } else {
                            statePc = 512;
                        }
                        continue stateLoop;
                    }
                    case 512: {
                        var9_ref_String = rb.field_d[var5.field_m];
                        if (qw.field_a.length > var5.field_m) {
                            statePc = 515;
                        } else {
                            statePc = 516;
                        }
                        continue stateLoop;
                    }
                    case 515: {
                        var8 += 65;
                        qw.field_a[var5.field_m].a(-127 + rj.field_c, 45, 64, 64, 0, var6_int << -1700944808 | 16777215, 1);
                        statePc = 516;
                        continue stateLoop;
                    }
                    case 516: {
                        bq.field_c.a(150, var6_int << -1136532232, 0, 170, rj.field_c + -180, (int[]) null, (hr[]) null, -1 + var8, var6_int << 646507896, 0, 18, -8787, var9_ref_String, (aa) null, 1, 0);
                        bq.field_c.a(150, var6_int << -1511753384, 0, 170, -180 + rj.field_c, (int[]) null, (hr[]) null, 1 + var8, var6_int << 1591393016, 0, 18, -8787, var9_ref_String, (aa) null, 1, 0);
                        bq.field_c.a(150, var6_int << 1308463640 | 16777215, 0, 170, rj.field_c - 180, (int[]) null, (hr[]) null, var8, -1, 0, 18, -8787, var9_ref_String, (aa) null, 1, 0);
                        statePc = 517;
                        continue stateLoop;
                    }
                    case 517: {
                        if (!oj.a(false)) {
                            statePc = 519;
                        } else {
                            statePc = 518;
                        }
                        continue stateLoop;
                    }
                    case 518: {
                        var6_int = (gi.field_h - lk.field_b) * 0 / 2;
                        var7 = (-lk.field_c + wq.field_b) * 0 / 2;
                        cf.a(var6_int, var7, -44);
                        kn.a(false, (byte) -122);
                        this.field_F = true;
                        if (var11 == 0) {
                            statePc = 528;
                        } else {
                            statePc = 519;
                        }
                        continue stateLoop;
                    }
                    case 519: {
                        if (!sj.a(-61)) {
                            statePc = 523;
                        } else {
                            statePc = 522;
                        }
                        continue stateLoop;
                    }
                    case 522: {
                        var6_int = (-lk.field_b + gi.field_h) * 0 / 2;
                        var7 = (wq.field_b + -lk.field_c) * 0 / 2;
                        ls.a(var6_int, -95, var7);
                        kn.a(false, -109);
                        this.field_F = true;
                        if (var11 == 0) {
                            statePc = 528;
                        } else {
                            statePc = 523;
                        }
                        continue stateLoop;
                    }
                    case 523: {
                        if (ws.b((byte) 52)) {
                            statePc = 528;
                        } else {
                            statePc = 526;
                        }
                        continue stateLoop;
                    }
                    case 526: {
                        this.field_F = false;
                        statePc = 528;
                        continue stateLoop;
                    }
                    case 528: {
                        if (this.field_F) {
                            statePc = 531;
                        } else {
                            statePc = 541;
                        }
                        continue stateLoop;
                    }
                    case 531: {
                        var6_int = lk.field_b;
                        var7 = lk.field_c;
                        if (this.field_K != null) {
                            statePc = 534;
                        } else {
                            statePc = 535;
                        }
                        continue stateLoop;
                    }
                    case 534: {
                        var7 = this.field_K.field_u;
                        var6_int = this.field_K.field_x;
                        statePc = 535;
                        continue stateLoop;
                    }
                    case 535: {
                        var8 = (-var6_int + gi.field_h) / 2;
                        var9 = (-var7 + wq.field_b) / 2;
                        if (!oj.a(false)) {
                            statePc = 540;
                        } else {
                            statePc = 536;
                        }
                        continue stateLoop;
                    }
                    case 536: {
                        if (this.field_K == null) {
                            statePc = 540;
                        } else {
                            statePc = 539;
                        }
                        continue stateLoop;
                    }
                    case 539: {
                        var8 = ik.c(-10517);
                        var9 = fd.b(3878);
                        statePc = 540;
                        continue stateLoop;
                    }
                    case 540: {
                        var10 = wq.a(var4, (byte) 83);
                        var10.a((byte) 71, var9, var9 - -var7, var8, var8 + var6_int);
                        var9 = (wq.field_b + -lk.field_c) / 2;
                        var8 = (gi.field_h + -lk.field_b) / 2;
                        var4.SA(var8, var9, lk.field_b, lk.field_c, lk.field_a, 0, lk.field_b);
                        var10.a(29709);
                        statePc = 541;
                        continue stateLoop;
                    }
                    case 541: {
                        var4.a(true);
                        statePc = 544;
                        continue stateLoop;
                    }
                    case 544: {
                        sb.a(-9937, ik.field_d);
                        ik.field_d = null;
                        ls.b(0);
                        stackIn_545_0 = 0;
                        statePc = 545;
                        continue stateLoop;
                    }
                    case 545: {
                        return stackIn_545_0 != 0;
                    }
                    case 546: {
                        if (null != pi.field_c) {
                            statePc = 549;
                        } else {
                            statePc = 658;
                        }
                        continue stateLoop;
                    }
                    case 549: {
                        pe.a(20, 90.0f, kn.field_e);
                        var3 = hk.b(78);
                        lk.b();
                        if (!in.g(-70)) {
                            statePc = 553;
                        } else {
                            statePc = 550;
                        }
                        continue stateLoop;
                    }
                    case 550: {
                        ad.a((byte) -86, var3, np.a(7));
                        if (var11 == 0) {
                            statePc = 656;
                        } else {
                            statePc = 553;
                        }
                        continue stateLoop;
                    }
                    case 553: {
                        if (!sa.field_j) {
                            statePc = 558;
                        } else {
                            statePc = 559;
                        }
                        continue stateLoop;
                    }
                    case 558: {
                        od.a(-62, var3);
                        if (var11 == 0) {
                            statePc = 656;
                        } else {
                            statePc = 559;
                        }
                        continue stateLoop;
                    }
                    case 559: {
                        if (!su.a(0)) {
                            statePc = 564;
                        } else {
                            statePc = 565;
                        }
                        continue stateLoop;
                    }
                    case 564: {
                        pe.a(20, 100.0f, fl.field_s);
                        od.a(-110, var3);
                        if (var11 == 0) {
                            statePc = 656;
                        } else {
                            statePc = 565;
                        }
                        continue stateLoop;
                    }
                    case 565: {
                        if (nq.field_h.a(false)) {
                            statePc = 570;
                        } else {
                            statePc = 574;
                        }
                        continue stateLoop;
                    }
                    case 570: {
                        if (this.h((byte) -34)) {
                            statePc = 574;
                        } else {
                            statePc = 571;
                        }
                        continue stateLoop;
                    }
                    case 571: {
                        if (var11 == 0) {
                            statePc = 656;
                        } else {
                            statePc = 574;
                        }
                        continue stateLoop;
                    }
                    case 574: {
                        var4 = nq.field_h.a(-125);
                        var4.GA(0);
                        ph.field_b.a(119, var4, false);
                        if ((rc.field_k ^ -1) == (nj.field_b ^ -1)) {
                            statePc = 584;
                        } else {
                            statePc = 575;
                        }
                        continue stateLoop;
                    }
                    case 575: {
                        var5_int = eh.field_a * 255 / 30;
                        if (nj.field_b != -1) {
                            statePc = 578;
                        } else {
                            statePc = 579;
                        }
                        continue stateLoop;
                    }
                    case 578: {
                        iv.field_g[nj.field_b].a(-var5_int + 255, var4, -2355);
                        statePc = 579;
                        continue stateLoop;
                    }
                    case 579: {
                        if (-1 != rc.field_k) {
                            statePc = 582;
                        } else {
                            statePc = 583;
                        }
                        continue stateLoop;
                    }
                    case 582: {
                        iv.field_g[rc.field_k].a(var5_int, var4, -2355);
                        statePc = 583;
                        continue stateLoop;
                    }
                    case 583: {
                        if (var11 == 0) {
                            statePc = 589;
                        } else {
                            statePc = 584;
                        }
                        continue stateLoop;
                    }
                    case 584: {
                        if (0 == (nj.field_b ^ -1)) {
                            statePc = 589;
                        } else {
                            statePc = 587;
                        }
                        continue stateLoop;
                    }
                    case 587: {
                        iv.field_g[nj.field_b].a(255, var4, -2355);
                        statePc = 589;
                        continue stateLoop;
                    }
                    case 589: {
                        if (!so.a((byte) -50)) {
                            statePc = 592;
                        } else {
                            statePc = 590;
                        }
                        continue stateLoop;
                    }
                    case 590: {
                        lk.a(0, 0, lk.field_b, lk.field_c);
                        pn.d((byte) -7);
                        statePc = 592;
                        continue stateLoop;
                    }
                    case 592: {
                        if ((ra.field_e ^ -1) == -1) {
                            statePc = 596;
                        } else {
                            statePc = 593;
                        }
                        continue stateLoop;
                    }
                    case 593: {
                        var5_int = eh.field_a * 256 / 30;
                        if (var5_int <= 0) {
                            statePc = 596;
                        } else {
                            statePc = 594;
                        }
                        continue stateLoop;
                    }
                    case 594: {
                        lk.b(0, 0, lk.field_b, lk.field_c, 0, var5_int);
                        statePc = 596;
                        continue stateLoop;
                    }
                    case 596: {
                        if (!sj.a(-38)) {
                            statePc = 607;
                        } else {
                            statePc = 597;
                        }
                        continue stateLoop;
                    }
                    case 597: {
                        if (so.a((byte) 110)) {
                            statePc = 607;
                        } else {
                            statePc = 600;
                        }
                        continue stateLoop;
                    }
                    case 600: {
                        if (null == gk.field_o) {
                            statePc = 605;
                        } else {
                            statePc = 603;
                        }
                        continue stateLoop;
                    }
                    case 603: {
                        stackIn_606_0 = 1;
                        statePc = 606;
                        continue stateLoop;
                    }
                    case 605: {
                        stackIn_606_0 = ii.field_a ? 1 : 0;
                        statePc = 606;
                        continue stateLoop;
                    }
                    case 606: {
                        kn.a(stackIn_606_0 != 0, -75);
                        statePc = 607;
                        continue stateLoop;
                    }
                    case 607: {
                        if ((ku.field_j ^ -1) > -3) {
                            statePc = 614;
                        } else {
                            statePc = 608;
                        }
                        continue stateLoop;
                    }
                    case 608: {
                        if (gw.field_v) {
                            statePc = 613;
                        } else {
                            statePc = 614;
                        }
                        continue stateLoop;
                    }
                    case 613: {
                        bq.field_c.a(20, 20, 16777215, Integer.toString(aj.field_B), (byte) -93, 1);
                        statePc = 614;
                        continue stateLoop;
                    }
                    case 614: {
                        var5 = (ge) ((Object) pl.field_v.b(66));
                        if (null == var5) {
                            statePc = 629;
                        } else {
                            statePc = 615;
                        }
                        continue stateLoop;
                    }
                    case 615: {
                        var7 = qn.field_g;
                        if (-65 < (var7 ^ -1)) {
                            statePc = 621;
                        } else {
                            statePc = 616;
                        }
                        continue stateLoop;
                    }
                    case 616: {
                        if (192 < var7) {
                            statePc = 620;
                        } else {
                            statePc = 619;
                        }
                        continue stateLoop;
                    }
                    case 619: {
                        var6_int = 255;
                        if (var11 == 0) {
                            statePc = 622;
                        } else {
                            statePc = 620;
                        }
                        continue stateLoop;
                    }
                    case 620: {
                        var6_int = (192 - var7) * 255 / 64;
                        if (var11 == 0) {
                            statePc = 622;
                        } else {
                            statePc = 621;
                        }
                        continue stateLoop;
                    }
                    case 621: {
                        var6_int = var7 * 255 / 64;
                        statePc = 622;
                        continue stateLoop;
                    }
                    case 622: {
                        var8 = 45;
                        if (var5.field_m < 0) {
                            statePc = 627;
                        } else {
                            statePc = 623;
                        }
                        continue stateLoop;
                    }
                    case 623: {
                        var9_ref_String = rb.field_d[var5.field_m];
                        if ((var5.field_m ^ -1) > (qw.field_a.length ^ -1)) {
                            statePc = 626;
                        } else {
                            statePc = 628;
                        }
                        continue stateLoop;
                    }
                    case 626: {
                        var8 += 65;
                        qw.field_a[var5.field_m].a(-32 + (85 + (rj.field_c + -180)), 45, 64, 64, 0, var6_int << 685471192 | 16777215, 1);
                        if (var11 == 0) {
                            statePc = 628;
                        } else {
                            statePc = 627;
                        }
                        continue stateLoop;
                    }
                    case 627: {
                        var9_ref_String = aa.field_b;
                        statePc = 628;
                        continue stateLoop;
                    }
                    case 628: {
                        bq.field_c.a(150, var6_int << -562019272, 0, 170, -180 + rj.field_c, (int[]) null, (hr[]) null, -1 + var8, var6_int << -412562056, 0, 18, -8787, var9_ref_String, (aa) null, 1, 0);
                        bq.field_c.a(150, var6_int << -1979326344, 0, 170, -180 + rj.field_c, (int[]) null, (hr[]) null, var8 + 1, var6_int << 382074200, 0, 18, -8787, var9_ref_String, (aa) null, 1, 0);
                        bq.field_c.a(150, 16777215 | var6_int << -138879208, 0, 170, -180 + rj.field_c, (int[]) null, (hr[]) null, var8, -1, 0, 18, -8787, var9_ref_String, (aa) null, 1, 0);
                        statePc = 629;
                        continue stateLoop;
                    }
                    case 629: {
                        if (!oj.a(false)) {
                            statePc = 631;
                        } else {
                            statePc = 630;
                        }
                        continue stateLoop;
                    }
                    case 630: {
                        var6_int = 0 * (gi.field_h - lk.field_b) / 2;
                        var7 = (wq.field_b + -lk.field_c) * 0 / 2;
                        cf.a(var6_int, var7, -105);
                        kn.a(false, (byte) -122);
                        this.field_F = true;
                        if (var11 == 0) {
                            statePc = 640;
                        } else {
                            statePc = 631;
                        }
                        continue stateLoop;
                    }
                    case 631: {
                        if (!sj.a(-67)) {
                            statePc = 635;
                        } else {
                            statePc = 634;
                        }
                        continue stateLoop;
                    }
                    case 634: {
                        var6_int = 0 * (gi.field_h + -lk.field_b) / 2;
                        var7 = (-lk.field_c + wq.field_b) * 0 / 2;
                        ls.a(var6_int, -53, var7);
                        kn.a(false, -101);
                        this.field_F = true;
                        if (var11 == 0) {
                            statePc = 640;
                        } else {
                            statePc = 635;
                        }
                        continue stateLoop;
                    }
                    case 635: {
                        if (ws.b((byte) 52)) {
                            statePc = 640;
                        } else {
                            statePc = 638;
                        }
                        continue stateLoop;
                    }
                    case 638: {
                        this.field_F = false;
                        statePc = 640;
                        continue stateLoop;
                    }
                    case 640: {
                        if (this.field_F) {
                            statePc = 643;
                        } else {
                            statePc = 653;
                        }
                        continue stateLoop;
                    }
                    case 643: {
                        var6_int = lk.field_b;
                        var7 = lk.field_c;
                        if (this.field_K == null) {
                            statePc = 645;
                        } else {
                            statePc = 644;
                        }
                        continue stateLoop;
                    }
                    case 644: {
                        var6_int = this.field_K.field_x;
                        var7 = this.field_K.field_u;
                        statePc = 645;
                        continue stateLoop;
                    }
                    case 645: {
                        var8 = (gi.field_h - var6_int) / 2;
                        var9 = (wq.field_b - var7) / 2;
                        if (!oj.a(false)) {
                            statePc = 652;
                        } else {
                            statePc = 646;
                        }
                        continue stateLoop;
                    }
                    case 646: {
                        if (null != this.field_K) {
                            statePc = 651;
                        } else {
                            statePc = 652;
                        }
                        continue stateLoop;
                    }
                    case 651: {
                        var8 = ik.c(-10517);
                        var9 = fd.b(3878);
                        statePc = 652;
                        continue stateLoop;
                    }
                    case 652: {
                        var10 = wq.a(var4, (byte) 29);
                        var10.a((byte) 61, var9, var9 + var7, var8, var6_int + var8);
                        var9 = (wq.field_b + -lk.field_c) / 2;
                        var8 = (-lk.field_b + gi.field_h) / 2;
                        var4.SA(var8, var9, lk.field_b, lk.field_c, lk.field_a, 0, lk.field_b);
                        var10.a(29709);
                        statePc = 653;
                        continue stateLoop;
                    }
                    case 653: {
                        var4.a(true);
                        statePc = 656;
                        continue stateLoop;
                    }
                    case 656: {
                        pe.a(pi.field_c, dq.field_Z, 20, kf.field_v);
                        fv.a(7966, dq.field_Z, kf.field_v);
                        pi.field_c = null;
                        kf.field_v = null;
                        dq.field_Z = null;
                        ls.b(0);
                        stackIn_657_0 = 0;
                        statePc = 657;
                        continue stateLoop;
                    }
                    case 657: {
                        return stackIn_657_0 != 0;
                    }
                    case 658: {
                        if (param1) {
                            statePc = 661;
                        } else {
                            statePc = 659;
                        }
                        continue stateLoop;
                    }
                    case 659: {
                        discarded$0 = this.h((byte) -12);
                        statePc = 661;
                        continue stateLoop;
                    }
                    case 661: {
                        if (!vi.f(5)) {
                            statePc = 670;
                        } else {
                            statePc = 662;
                        }
                        continue stateLoop;
                    }
                    case 662: {
                        var3_int = 0;
                        statePc = 663;
                        continue stateLoop;
                    }
                    case 663: {
                        if (13 <= var3_int) {
                            statePc = 668;
                        } else {
                            statePc = 664;
                        }
                        continue stateLoop;
                    }
                    case 664: {
                        iv.field_g[var3_int] = ga.a(var3_int, (byte) -100);
                        var3_int++;
                        if (var11 != 0) {
                            statePc = 669;
                        } else {
                            statePc = 665;
                        }
                        continue stateLoop;
                    }
                    case 665: {
                        if (var11 == 0) {
                            statePc = 663;
                        } else {
                            statePc = 668;
                        }
                        continue stateLoop;
                    }
                    case 668: {
                        nj.field_b = 0;
                        bp.a(50, 26175);
                        nn.b(50, -106);
                        mo.a(86, 0);
                        ek.b(true, 0);
                        statePc = 669;
                        continue stateLoop;
                    }
                    case 669: {
                        vl.field_a = 0;
                        statePc = 670;
                        continue stateLoop;
                    }
                    case 670: {
                        if (nq.field_h.a(-113) == null) {
                            statePc = 673;
                        } else {
                            statePc = 676;
                        }
                        continue stateLoop;
                    }
                    case 673: {
                        nq.field_h.a(false);
                        if (this.h((byte) -124)) {
                            statePc = 676;
                        } else {
                            statePc = 674;
                        }
                        continue stateLoop;
                    }
                    case 674: {
                        stackIn_675_0 = 0;
                        statePc = 675;
                        continue stateLoop;
                    }
                    case 675: {
                        return stackIn_675_0 != 0;
                    }
                    case 676: {
                        ph.field_b = new qu();
                        stackIn_677_0 = 1;
                        statePc = 677;
                        continue stateLoop;
                    }
                    case 677: {
                        return stackIn_677_0 != 0;
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

    final void a(boolean param0) {
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
        RuntimeException var2 = null;
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
                stackIn_4_0 = 0;
                break L1;
              } else {
                stackIn_4_0 = 1;
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
                stackIn_8_0 = 0;
                break L2;
              } else {
                stackIn_8_0 = 1;
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
                stackIn_12_0 = 0;
                break L3;
              } else {
                stackIn_12_0 = 1;
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
                stackIn_16_0 = 0;
                break L4;
              } else {
                stackIn_16_0 = 1;
                break L4;
              }
            }
            L5: {
              fu.d(stackIn_16_0 != 0);
              if (param0) {
                stackIn_20_0 = 0;
                break L5;
              } else {
                stackIn_20_0 = 1;
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
                stackIn_24_0 = 0;
                break L6;
              } else {
                stackIn_24_0 = 1;
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
                stackIn_28_0 = 0;
                break L7;
              } else {
                stackIn_28_0 = 1;
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
                stackIn_32_0 = 0;
                break L8;
              } else {
                stackIn_32_0 = 1;
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
                stackIn_36_0 = 0;
                break L9;
              } else {
                stackIn_36_0 = 1;
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
                stackIn_40_0 = 0;
                break L10;
              } else {
                stackIn_40_0 = 1;
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
                stackIn_44_0 = 0;
                break L11;
              } else {
                stackIn_44_0 = 1;
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
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        int var3_int = 0;
        RuntimeException var3 = null;
        int var4 = 0;
        int var5 = 0;
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
                          fe.a(-113, rc.field_l[22 + var3_int]);
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
                      fe.a(89, lg.field_d[param0][1][var3_int]);
                      if (var5 == 0) {
                        break L1;
                      } else {
                        break L3;
                      }
                    }
                    var3_int = fi.a(lg.field_d[param0][2].length, he.field_o, (byte) -96);
                    fe.a(-121, lg.field_d[param0][2][var3_int]);
                    if (var5 == 0) {
                      break L1;
                    } else {
                      break L2;
                    }
                  }
                  var3_int = fi.a(lg.field_d[param0][0].length, he.field_o, (byte) -96);
                  fe.a(42, lg.field_d[param0][0][var3_int]);
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
