/*
 * Decompiled by CFR-JS 0.4.0.
 */
import java.net.URL;
import java.lang.String;

abstract class wf extends ch {
    private int field_x;
    private long field_k;
    private int field_r;
    static rf field_o;
    private boolean field_t;
    private boolean field_v;
    String field_n;
    private boolean field_m;
    private int field_u;
    static String field_q;
    private int field_w;
    private int field_l;
    private int field_s;
    static int field_p;

    private final int k() {
        int var2 = 0;
        if (!((wf) this).field_a) {
          if (!sb.a(75)) {
            return -1;
          } else {
            if (ii.field_e) {
              return -1;
            } else {
              int discarded$3 = 1;
              var2 = ri.a(true, sa.a(), ((wf) this).field_r, ((wf) this).field_v, al.b(0), 0);
              if (var2 == -1) {
                return -1;
              } else {
                L0: {
                  if (var2 != 0) {
                    if (var2 == 1) {
                      if (-12 == hj.field_a) {
                        if (ib.field_e == 0) {
                          int discarded$4 = -12618;
                          gi.b();
                          break L0;
                        } else {
                          return var2;
                        }
                      } else {
                        return var2;
                      }
                    } else {
                      L1: {
                        if (!ff.field_k) {
                          ((wf) this).a((byte) 79, "reconnect");
                          break L1;
                        } else {
                          break L1;
                        }
                      }
                      kd.b((byte) 103);
                      q.a((byte) 124, var2, kh.field_a);
                      ii.field_e = true;
                      hi.field_G = oa.a(-12520) - -15000L;
                      return var2;
                    }
                  } else {
                    if (-12 == hj.field_a) {
                      if (ib.field_e == 0) {
                        int discarded$5 = -12618;
                        gi.b();
                        break L0;
                      } else {
                        return var2;
                      }
                    } else {
                      return var2;
                    }
                  }
                }
                return var2;
              }
            }
          }
        } else {
          return -1;
        }
    }

    final static java.net.URL a(java.net.URL param0, int param1, java.applet.Applet param2) {
        Object var3 = null;
        int var4 = 0;
        Object var5 = null;
        java.net.URL stackIn_9_0 = null;
        Object stackIn_11_0 = null;
        StringBuilder stackIn_11_1 = null;
        Object stackIn_12_0 = null;
        StringBuilder stackIn_12_1 = null;
        Object stackIn_13_0 = null;
        StringBuilder stackIn_13_1 = null;
        String stackIn_13_2 = null;
        Object stackIn_14_0 = null;
        StringBuilder stackIn_14_1 = null;
        Object stackIn_15_0 = null;
        StringBuilder stackIn_15_1 = null;
        Object stackIn_16_0 = null;
        StringBuilder stackIn_16_1 = null;
        String stackIn_16_2 = null;
        RuntimeException decompiledCaughtException = null;
        java.net.URL stackOut_8_0 = null;
        Object stackOut_10_0 = null;
        StringBuilder stackOut_10_1 = null;
        Object stackOut_12_0 = null;
        StringBuilder stackOut_12_1 = null;
        String stackOut_12_2 = null;
        Object stackOut_11_0 = null;
        StringBuilder stackOut_11_1 = null;
        String stackOut_11_2 = null;
        Object stackOut_13_0 = null;
        StringBuilder stackOut_13_1 = null;
        Object stackOut_15_0 = null;
        StringBuilder stackOut_15_1 = null;
        String stackOut_15_2 = null;
        Object stackOut_14_0 = null;
        StringBuilder stackOut_14_1 = null;
        String stackOut_14_2 = null;
        try {
          L0: {
            L1: {
              var4 = -16 / ((param1 - -4) / 62);
              var3 = null;
              var5 = null;
              if (null == sd.field_z) {
                break L1;
              } else {
                if (!sd.field_z.equals((Object) (Object) param2.getParameter("settings"))) {
                  var3 = (Object) (Object) sd.field_z;
                  break L1;
                } else {
                  break L1;
                }
              }
            }
            L2: {
              if (me.field_j == null) {
                break L2;
              } else {
                if (!me.field_j.equals((Object) (Object) param2.getParameter("session"))) {
                  var5 = (Object) (Object) me.field_j;
                  break L2;
                } else {
                  break L2;
                }
              }
            }
            int discarded$4 = 1;
            int discarded$5 = -1;
            stackOut_8_0 = ai.a((String) var5, (String) var3, param0);
            stackIn_9_0 = stackOut_8_0;
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L3: {
            var3 = (Object) (Object) decompiledCaughtException;
            stackOut_10_0 = var3;
            stackOut_10_1 = new StringBuilder().append("wf.KA(");
            stackIn_12_0 = stackOut_10_0;
            stackIn_12_1 = stackOut_10_1;
            stackIn_11_0 = stackOut_10_0;
            stackIn_11_1 = stackOut_10_1;
            if (param0 == null) {
              stackOut_12_0 = stackIn_12_0;
              stackOut_12_1 = (StringBuilder) (Object) stackIn_12_1;
              stackOut_12_2 = "null";
              stackIn_13_0 = stackOut_12_0;
              stackIn_13_1 = stackOut_12_1;
              stackIn_13_2 = stackOut_12_2;
              break L3;
            } else {
              stackOut_11_0 = stackIn_11_0;
              stackOut_11_1 = (StringBuilder) (Object) stackIn_11_1;
              stackOut_11_2 = "{...}";
              stackIn_13_0 = stackOut_11_0;
              stackIn_13_1 = stackOut_11_1;
              stackIn_13_2 = stackOut_11_2;
              break L3;
            }
          }
          L4: {
            stackOut_13_0 = stackIn_13_0;
            stackOut_13_1 = ((StringBuilder) (Object) stackIn_13_1).append(stackIn_13_2).append(',').append(param1).append(',');
            stackIn_15_0 = stackOut_13_0;
            stackIn_15_1 = stackOut_13_1;
            stackIn_14_0 = stackOut_13_0;
            stackIn_14_1 = stackOut_13_1;
            if (param2 == null) {
              stackOut_15_0 = stackIn_15_0;
              stackOut_15_1 = (StringBuilder) (Object) stackIn_15_1;
              stackOut_15_2 = "null";
              stackIn_16_0 = stackOut_15_0;
              stackIn_16_1 = stackOut_15_1;
              stackIn_16_2 = stackOut_15_2;
              break L4;
            } else {
              stackOut_14_0 = stackIn_14_0;
              stackOut_14_1 = (StringBuilder) (Object) stackIn_14_1;
              stackOut_14_2 = "{...}";
              stackIn_16_0 = stackOut_14_0;
              stackIn_16_1 = stackOut_14_1;
              stackIn_16_2 = stackOut_14_2;
              break L4;
            }
          }
          throw t.a((Throwable) (Object) stackIn_16_0, stackIn_16_2 + ')');
        }
        return stackIn_9_0;
    }

    final void a(byte param0, int param1, int param2, int param3, int param4, boolean param5, int param6, int param7) {
        java.awt.Frame var10 = null;
        var10 = new java.awt.Frame("Jagex");
        var10.pack();
        var10.dispose();
        ((wf) this).setBackground(java.awt.Color.black);
        va.field_a = ((wf) this).field_u;
        da.a(true, va.field_a);
        if (param0 != -70) {
          return;
        } else {
          ic.a(((wf) this).field_s, ((wf) this).field_k, 5000, param7, ((wf) this).field_m, param5, va.field_a, ((wf) this).field_w, 5000, ((wf) this).field_n, ((wf) this).field_x, ka.field_i, 64, ((wf) this).field_l);
          q.a(param7, va.field_a, ((wf) this).field_l, ((wf) this).field_x, -23949, ka.field_i, ((wf) this).field_n, ((wf) this).field_s, ((wf) this).field_w);
          int discarded$2 = 28;
          rd.b();
          vc.field_f = nd.a(param0 + 113);
          int discarded$3 = 57;
          sl.a(f.field_kb);
          lk.field_e = param2;
          ib.field_c = param4;
          pb.field_r = param6;
          sb.field_d = param3;
          ah.field_a = param1;
          this.e(123);
          pk.k((byte) -13);
          return;
        }
    }

    private final void f(int param0) {
        if (param0 != -11) {
            return;
        }
        int discarded$0 = 1000;
        String var2 = vf.i();
        va.a(var2, k.c(111), param0 + 10);
    }

    final void a(boolean param0, boolean param1, boolean param2, boolean param3, int param4) {
        this.a(false, (byte) -91);
        if (!(!param3)) {
            int discarded$0 = 32;
            this.f();
        }
        if (param2) {
            this.i(16072);
        }
        if (param4 > -87) {
            ((wf) this).field_w = -34;
        }
        if (!(!param0)) {
            this.e((byte) -19);
        }
        if (param1) {
            this.d(true);
        }
    }

    final void a(int param0, String param1, int param2) {
        try {
            this.a(480, param1, param0, (byte) 81, param2);
        } catch (RuntimeException runtimeException) {
            throw t.a((Throwable) (Object) runtimeException, "wf.EA(" + param0 + ',' + (param1 != null ? "{...}" : "null") + ',' + param2 + ')');
        }
    }

    final int d(byte param0) {
        int var2 = 0;
        Object var3 = null;
        L0: {
          if (param0 == -67) {
            break L0;
          } else {
            var3 = null;
            java.net.URL discarded$10 = wf.a((java.net.URL) null, 48, (java.applet.Applet) null);
            break L0;
          }
        }
        L1: {
          L2: {
            int discarded$11 = -1;
            var2 = this.k();
            if (var2 == 0) {
              break L2;
            } else {
              if (1 == var2) {
                break L2;
              } else {
                break L1;
              }
            }
          }
          L3: {
            if (!wj.field_G[1]) {
              break L3;
            } else {
              qc.a(true, 2);
              break L3;
            }
          }
          L4: {
            if (wj.field_G[2]) {
              ec.a(param0 ^ 76, 3);
              break L4;
            } else {
              break L4;
            }
          }
          L5: {
            if (wj.field_G[3]) {
              int discarded$12 = 4;
              int discarded$13 = -125;
              ud.a();
              break L5;
            } else {
              break L5;
            }
          }
          L6: {
            if (wj.field_G[4]) {
              oi.a(5, 116);
              break L6;
            } else {
              break L6;
            }
          }
          L7: {
            if (!wj.field_G[5]) {
              break L7;
            } else {
              di.a(6, param0 + 21789);
              break L7;
            }
          }
          L8: {
            if (!wj.field_G[6]) {
              break L8;
            } else {
              wd.a(true, 7);
              break L8;
            }
          }
          if (!wj.field_G[8]) {
            break L1;
          } else {
            int discarded$14 = -13912;
            ng.g();
            break L1;
          }
        }
        return var2;
    }

    private final void a(boolean param0, byte param1) {
        wj.field_G[18] = true;
        wj.field_G[17] = true;
        wj.field_G[8] = false;
        wj.field_G[0] = true;
        wj.field_G[3] = true;
        wj.field_G[7] = true;
        wj.field_G[16] = true;
    }

    private final void e(int param0) {
        pb.field_m[11] = -1;
        pb.field_m[3] = -1;
        pb.field_m[10] = -1;
        pb.field_m[17] = -1;
        pb.field_m[5] = -1;
        pb.field_m[16] = -1;
        pb.field_m[6] = -2;
        pb.field_m[1] = 16;
        pb.field_m[9] = -1;
        pb.field_m[13] = -1;
        int var2 = -13 / ((param0 - 56) / 60);
        pb.field_m[7] = -1;
        pb.field_m[2] = -2;
        pb.field_m[4] = -1;
        pb.field_m[8] = -2;
        pb.field_m[18] = 1;
        pb.field_m[12] = -1;
    }

    final void b(boolean param0, int param1) {
        int var3 = 0;
        java.awt.Dimension var4 = null;
        int var5 = 0;
        java.awt.Container var6 = null;
        int stackIn_24_0 = 0;
        int stackIn_99_0 = 0;
        String stackIn_99_1 = null;
        int stackIn_100_0 = 0;
        String stackIn_100_1 = null;
        int stackIn_101_0 = 0;
        String stackIn_101_1 = null;
        int stackIn_101_2 = 0;
        int stackIn_102_0 = 0;
        String stackIn_102_1 = null;
        int stackIn_102_2 = 0;
        int stackIn_103_0 = 0;
        String stackIn_103_1 = null;
        int stackIn_103_2 = 0;
        int stackIn_104_0 = 0;
        String stackIn_104_1 = null;
        int stackIn_104_2 = 0;
        int stackIn_104_3 = 0;
        int stackIn_135_0 = 0;
        int stackOut_23_0 = 0;
        int stackOut_22_0 = 0;
        int stackOut_98_0 = 0;
        String stackOut_98_1 = null;
        int stackOut_100_0 = 0;
        String stackOut_100_1 = null;
        int stackOut_100_2 = 0;
        int stackOut_99_0 = 0;
        String stackOut_99_1 = null;
        int stackOut_99_2 = 0;
        int stackOut_101_0 = 0;
        String stackOut_101_1 = null;
        int stackOut_101_2 = 0;
        int stackOut_103_0 = 0;
        String stackOut_103_1 = null;
        int stackOut_103_2 = 0;
        int stackOut_103_3 = 0;
        int stackOut_102_0 = 0;
        String stackOut_102_1 = null;
        int stackOut_102_2 = 0;
        int stackOut_102_3 = 0;
        int stackOut_134_0 = 0;
        int stackOut_133_0 = 0;
        L0: {
          var5 = Geoblox.field_C;
          if (null == rb.field_d) {
            break L0;
          } else {
            L1: {
              if (vl.field_n != null) {
                break L1;
              } else {
                int discarded$28 = 1;
                var6 = jf.a();
                var4 = var6.getSize();
                rb.field_d.a((byte) 126, var4.height, var4.width);
                break L1;
              }
            }
            rb.field_d.a((byte) -126);
            break L0;
          }
        }
        L2: {
          re.b(true);
          int discarded$29 = -128;
          mc.a();
          int discarded$30 = 255;
          if (bl.b()) {
            break L2;
          } else {
            if (hj.field_a != 11) {
              int discarded$31 = 1;
              ck.c();
              break L2;
            } else {
              break L2;
            }
          }
        }
        L3: {
          if (null != vc.field_f) {
            vc.field_i = vc.field_f.a(true);
            break L3;
          } else {
            break L3;
          }
        }
        L4: {
          if (t.b(param1 ^ 19649)) {
            L5: {
              int discarded$32 = 1;
              var3 = 1200 * sb.a();
              if (((wf) this).field_t) {
                break L5;
              } else {
                int discarded$33 = -76;
                if (~var3 <= ~ha.a()) {
                  break L4;
                } else {
                  int discarded$34 = 0;
                  if (var3 >= jk.a()) {
                    break L4;
                  } else {
                    break L5;
                  }
                }
              }
            }
            ((wf) this).field_t = false;
            jl.a((byte) -115);
            kd.b((byte) 81);
            q.a((byte) 124, 2, fa.field_d);
            int discarded$35 = -113;
            bl.c();
            ii.field_e = true;
            hi.field_G = oa.a(-12520) - -15000L;
            break L4;
          } else {
            break L4;
          }
        }
        L6: {
          L7: {
            if (ib.field_e == -1) {
              break L7;
            } else {
              if (ib.field_e != 0) {
                break L6;
              } else {
                break L7;
              }
            }
          }
          L8: {
            if (-1 != ib.field_e) {
              stackOut_23_0 = 0;
              stackIn_24_0 = stackOut_23_0;
              break L8;
            } else {
              stackOut_22_0 = 1;
              stackIn_24_0 = stackOut_22_0;
              break L8;
            }
          }
          L9: {
            var3 = stackIn_24_0;
            int discarded$36 = 15869;
            ib.field_e = ma.b();
            if (var3 == 0) {
              break L9;
            } else {
              if (ib.field_e == 0) {
                if (11 != hj.field_a) {
                  break L9;
                } else {
                  if (sb.a(73)) {
                    break L9;
                  } else {
                    int discarded$37 = -12618;
                    gi.b();
                    break L9;
                  }
                }
              } else {
                break L9;
              }
            }
          }
          if (-1 == ib.field_e) {
            break L6;
          } else {
            if (ib.field_e == 0) {
              break L6;
            } else {
              hi.field_G = 15000L + oa.a(-12520);
              break L6;
            }
          }
        }
        L10: {
          if (ib.field_e == -1) {
            break L10;
          } else {
            if (ib.field_e != 0) {
              if (mi.field_C >= 10) {
                if (hj.field_a < 10) {
                  break L10;
                } else {
                  L11: {
                    kd.b((byte) 114);
                    if (ib.field_e != 3) {
                      if (4 != ib.field_e) {
                        if (2 == ib.field_e) {
                          q.a((byte) 124, 256, rc.field_g);
                          break L11;
                        } else {
                          if (ib.field_e != 5) {
                            q.a((byte) 124, 256, ki.field_e);
                            break L11;
                          } else {
                            q.a((byte) 124, 5, jg.field_c);
                            break L11;
                          }
                        }
                      } else {
                        q.a((byte) 124, 256, qb.field_F);
                        break L11;
                      }
                    } else {
                      q.a((byte) 124, 256, pf.field_H);
                      break L11;
                    }
                  }
                  ii.field_e = true;
                  break L10;
                }
              } else {
                if (ib.field_e != 3) {
                  if (ib.field_e != 4) {
                    if (2 == ib.field_e) {
                      ((wf) this).a((byte) 79, "js5connect_full");
                      break L10;
                    } else {
                      if (ib.field_e != 5) {
                        ((wf) this).a((byte) 79, "js5connect");
                        break L10;
                      } else {
                        ((wf) this).a((byte) 79, "outofdate");
                        break L10;
                      }
                    }
                  } else {
                    ((wf) this).a((byte) 79, "js5io");
                    break L10;
                  }
                } else {
                  ((wf) this).a((byte) 79, "js5crc");
                  break L10;
                }
              }
            } else {
              break L10;
            }
          }
        }
        L12: {
          L13: {
            L14: {
              if (ib.field_e == -1) {
                break L14;
              } else {
                if (ib.field_e != 0) {
                  break L13;
                } else {
                  break L14;
                }
              }
            }
            if (sb.a(param1 + -19585)) {
              break L13;
            } else {
              break L12;
            }
          }
          if (~hi.field_G >= ~oa.a(param1 + -32180)) {
            ii.field_e = false;
            if (-1 == ib.field_e) {
              break L12;
            } else {
              if (ib.field_e != 0) {
                ib.field_e = -1;
                int discarded$38 = -21754;
                j.e();
                break L12;
              } else {
                break L12;
              }
            }
          } else {
            break L12;
          }
        }
        L15: {
          if (ib.field_e != 0) {
            break L15;
          } else {
            if (sb.a(93)) {
              break L15;
            } else {
              lb.field_a = false;
              break L15;
            }
          }
        }
        L16: {
          if (mi.field_C != 0) {
            break L16;
          } else {
            int discarded$39 = 108;
            if (qi.b()) {
              mi.field_C = 1;
              break L16;
            } else {
              break L16;
            }
          }
        }
        L17: {
          if (mi.field_C == 1) {
            L18: {
              if (va.field_a == 0) {
                break L18;
              } else {
                dd.field_J = kk.a(lk.field_e, (byte) -62);
                break L18;
              }
            }
            int discarded$40 = 1;
            int discarded$41 = 0;
            int discarded$42 = 1;
            l.field_h = rj.a(ib.field_c, (byte) -18);
            int discarded$43 = 1;
            int discarded$44 = 0;
            int discarded$45 = 1;
            dc.field_c = rj.a(pb.field_r, (byte) -124);
            int discarded$46 = 1;
            int discarded$47 = 0;
            int discarded$48 = 1;
            hb.field_n = rj.a(sb.field_d, (byte) -41);
            ki.field_b = l.field_h;
            mi.field_C = 2;
            re.field_i = dc.field_c;
            break L17;
          } else {
            break L17;
          }
        }
        L19: {
          if (mi.field_C != 2) {
            break L19;
          } else {
            L20: {
              if (dd.field_J == null) {
                break L20;
              } else {
                if (dd.field_J.a(0)) {
                  if (!dd.field_J.b((byte) -116, "")) {
                    dd.field_J = null;
                    break L20;
                  } else {
                    if (!dd.field_J.a("", (byte) -126)) {
                      break L20;
                    } else {
                      wi.a((byte) 74, dd.field_J);
                      dd.field_J = null;
                      ih.b(-50);
                      break L20;
                    }
                  }
                } else {
                  break L20;
                }
              }
            }
            if (null == dd.field_J) {
              mi.field_C = 3;
              break L19;
            } else {
              break L19;
            }
          }
        }
        L21: {
          if (3 == mi.field_C) {
            int discarded$49 = -11652;
            if (!ma.a(hb.field_n, dc.field_c, l.field_h)) {
              break L21;
            } else {
              if (!rj.a((byte) -127, hb.field_n)) {
                break L21;
              } else {
                L22: {
                  L23: {
                    int discarded$50 = -105;
                    tj.c();
                    int discarded$51 = 120;
                    ke.b();
                    oi.field_e = nh.field_c;
                    kf.field_e = false;
                    fj.a((byte) 114, hb.field_n, rb.field_c, dc.field_c, l.field_h);
                    if (ri.field_a) {
                      break L23;
                    } else {
                      if (jg.field_d != null) {
                        break L23;
                      } else {
                        break L22;
                      }
                    }
                  }
                  L24: {
                    stackOut_98_0 = 2274;
                    stackOut_98_1 = jg.field_d;
                    stackIn_100_0 = stackOut_98_0;
                    stackIn_100_1 = stackOut_98_1;
                    stackIn_99_0 = stackOut_98_0;
                    stackIn_99_1 = stackOut_98_1;
                    if (ri.field_a) {
                      stackOut_100_0 = stackIn_100_0;
                      stackOut_100_1 = (String) (Object) stackIn_100_1;
                      stackOut_100_2 = 0;
                      stackIn_101_0 = stackOut_100_0;
                      stackIn_101_1 = stackOut_100_1;
                      stackIn_101_2 = stackOut_100_2;
                      break L24;
                    } else {
                      stackOut_99_0 = stackIn_99_0;
                      stackOut_99_1 = (String) (Object) stackIn_99_1;
                      stackOut_99_2 = 1;
                      stackIn_101_0 = stackOut_99_0;
                      stackIn_101_1 = stackOut_99_1;
                      stackIn_101_2 = stackOut_99_2;
                      break L24;
                    }
                  }
                  L25: {
                    stackOut_101_0 = stackIn_101_0;
                    stackOut_101_1 = (String) (Object) stackIn_101_1;
                    stackOut_101_2 = stackIn_101_2;
                    stackIn_103_0 = stackOut_101_0;
                    stackIn_103_1 = stackOut_101_1;
                    stackIn_103_2 = stackOut_101_2;
                    stackIn_102_0 = stackOut_101_0;
                    stackIn_102_1 = stackOut_101_1;
                    stackIn_102_2 = stackOut_101_2;
                    if (ri.field_a) {
                      stackOut_103_0 = stackIn_103_0;
                      stackOut_103_1 = (String) (Object) stackIn_103_1;
                      stackOut_103_2 = stackIn_103_2;
                      stackOut_103_3 = 0;
                      stackIn_104_0 = stackOut_103_0;
                      stackIn_104_1 = stackOut_103_1;
                      stackIn_104_2 = stackOut_103_2;
                      stackIn_104_3 = stackOut_103_3;
                      break L25;
                    } else {
                      stackOut_102_0 = stackIn_102_0;
                      stackOut_102_1 = (String) (Object) stackIn_102_1;
                      stackOut_102_2 = stackIn_102_2;
                      stackOut_102_3 = 1;
                      stackIn_104_0 = stackOut_102_0;
                      stackIn_104_1 = stackOut_102_1;
                      stackIn_104_2 = stackOut_102_2;
                      stackIn_104_3 = stackOut_102_3;
                      break L25;
                    }
                  }
                  og.a(stackIn_104_0, stackIn_104_1, stackIn_104_2 != 0, stackIn_104_3 != 0);
                  break L22;
                }
                L26: {
                  if (p.field_m) {
                    hk.e(83);
                    break L26;
                  } else {
                    break L26;
                  }
                }
                L27: {
                  if (null != bh.field_a) {
                    break L27;
                  } else {
                    bh.field_a = df.b((byte) 72);
                    int discarded$52 = 110;
                    hc.field_R = fe.b();
                    break L27;
                  }
                }
                bk.a(hb.field_n, hc.field_R, 111, bh.field_a);
                hb.field_n = null;
                dc.field_c = null;
                l.field_h = null;
                int discarded$53 = -82;
                fd.a((java.applet.Applet) this);
                ih.b(-69);
                mi.field_C = 10;
                break L21;
              }
            }
          } else {
            break L21;
          }
        }
        L28: {
          if (10 == mi.field_C) {
            L29: {
              if (va.field_a == 0) {
                break L29;
              } else {
                ak.field_b = kk.a(ah.field_a, (byte) -62);
                break L29;
              }
            }
            mi.field_C = 11;
            break L28;
          } else {
            break L28;
          }
        }
        L30: {
          if (mi.field_C != 11) {
            break L30;
          } else {
            L31: {
              if (null == ak.field_b) {
                break L31;
              } else {
                L32: {
                  if (!ak.field_b.a(0)) {
                    break L32;
                  } else {
                    if (!ak.field_b.b(true)) {
                      break L32;
                    } else {
                      break L31;
                    }
                  }
                }
                lc.a(si.a(ri.field_c, 2147483647, vc.field_g, ak.field_b), -2, 0.0f);
                break L30;
              }
            }
            cf.field_k = true;
            mi.field_C = 12;
            break L30;
          }
        }
        if (param1 == 19660) {
          L33: {
            if (mi.field_C == 12) {
              if (!cf.field_k) {
                mi.field_C = 13;
                break L33;
              } else {
                break L33;
              }
            } else {
              break L33;
            }
          }
          L34: {
            if (mi.field_C != 13) {
              break L34;
            } else {
              L35: {
                var3 = 1;
                if (null == b.field_b) {
                  break L35;
                } else {
                  L36: {
                    if (!b.field_b.a(true)) {
                      stackOut_134_0 = 0;
                      stackIn_135_0 = stackOut_134_0;
                      break L36;
                    } else {
                      stackOut_133_0 = 1;
                      stackIn_135_0 = stackOut_133_0;
                      break L36;
                    }
                  }
                  var3 = stackIn_135_0;
                  lc.a(b.field_b.field_e, -2, b.field_b.field_j);
                  break L35;
                }
              }
              if (var3 != 0) {
                mi.field_C = 20;
                break L34;
              } else {
                break L34;
              }
            }
          }
          L37: {
            if (param0) {
              break L37;
            } else {
              if (ab.field_a) {
                nb.a(-2, f.field_kb);
                ((wf) this).b(true);
                int discarded$54 = 57;
                sl.a(f.field_kb);
                break L37;
              } else {
                break L37;
              }
            }
          }
          L38: {
            if (wj.field_G[8]) {
              int discarded$55 = -102;
              ji.f();
              break L38;
            } else {
              break L38;
            }
          }
          return;
        } else {
          return;
        }
    }

    final void h(int param0) {
        int var3 = 0;
        Object stackIn_2_0 = null;
        int stackIn_2_1 = 0;
        Object stackIn_3_0 = null;
        int stackIn_3_1 = 0;
        Object stackIn_4_0 = null;
        int stackIn_4_1 = 0;
        int stackIn_4_2 = 0;
        Object stackOut_1_0 = null;
        int stackOut_1_1 = 0;
        Object stackOut_3_0 = null;
        int stackOut_3_1 = 0;
        int stackOut_3_2 = 0;
        Object stackOut_2_0 = null;
        int stackOut_2_1 = 0;
        int stackOut_2_2 = 0;
        L0: {
          var3 = Geoblox.field_C;
          int discarded$656 = -31456;
          if (!fj.f()) {
            if (mi.field_C < 10) {
              break L0;
            } else {
              if (!wj.f(7426)) {
                int discarded$657 = 88;
                td.g();
                break L0;
              } else {
                if (hj.field_a != 0) {
                  oj.a(vc.field_i, (byte) -96);
                  break L0;
                } else {
                  int discarded$658 = -1;
                  int discarded$659 = this.a(false, false);
                  break L0;
                }
              }
            }
          } else {
            L1: {
              stackOut_1_0 = this;
              stackOut_1_1 = 0;
              stackIn_3_0 = stackOut_1_0;
              stackIn_3_1 = stackOut_1_1;
              stackIn_2_0 = stackOut_1_0;
              stackIn_2_1 = stackOut_1_1;
              if (vl.field_n == null) {
                stackOut_3_0 = this;
                stackOut_3_1 = stackIn_3_1;
                stackOut_3_2 = 0;
                stackIn_4_0 = stackOut_3_0;
                stackIn_4_1 = stackOut_3_1;
                stackIn_4_2 = stackOut_3_2;
                break L1;
              } else {
                stackOut_2_0 = this;
                stackOut_2_1 = stackIn_2_1;
                stackOut_2_2 = 1;
                stackIn_4_0 = stackOut_2_0;
                stackIn_4_1 = stackOut_2_1;
                stackIn_4_2 = stackOut_2_2;
                break L1;
              }
            }
            int discarded$660 = -1;
            int discarded$661 = this.a(stackIn_4_1 != 0, stackIn_4_2 != 0);
            break L0;
          }
        }
        L2: {
          if (param0 >= 104) {
            break L2;
          } else {
            this.f(80);
            break L2;
          }
        }
    }

    public static void g(int param0) {
        field_o = null;
        field_q = null;
    }

    private final int a(boolean param0, boolean param1) {
        try {
            int var4 = 0;
            Exception var5 = null;
            int var5_int = 0;
            String var7 = null;
            int var8 = 0;
            Object var9 = null;
            Object var10 = null;
            Boolean var11 = null;
            qc var12 = null;
            Throwable decompiledCaughtException = null;
            var8 = Geoblox.field_C;
            var4 = gk.a(va.field_a, vc.field_i, param1, (byte) -117);
            if (var4 == 0) {
              throw new IllegalStateException();
            } else {
              L0: {
                if (var4 != 1) {
                  break L0;
                } else {
                  L1: {
                    int discarded$10 = 25;
                    var5_int = qc.a(qh.i(), pf.h((byte) -42), -121);
                    if (var5_int != -1) {
                      kb.a(var5_int, 6568, si.field_i, kh.field_a);
                      kh.field_a = null;
                      si.field_i = null;
                      break L1;
                    } else {
                      break L1;
                    }
                  }
                  int discarded$11 = 111;
                  var11 = vf.a();
                  if (var11 != null) {
                    mk.a(-111, var11.booleanValue());
                    break L0;
                  } else {
                    break L0;
                  }
                }
              }
              L2: {
                if (var4 == 2) {
                  int discarded$12 = 1;
                  var5_int = uf.a((byte) -94, sa.a(), qj.b((byte) 81), ((wf) this).field_r, vh.f(100), al.b(0), cg.a((byte) 27));
                  if (var5_int == -1) {
                    break L2;
                  } else {
                    gj.a(kh.field_a, var5_int, (byte) 30, si.field_i);
                    kh.field_a = null;
                    si.field_i = null;
                    break L2;
                  }
                } else {
                  break L2;
                }
              }
              L3: {
                if (var4 == 3) {
                  L4: {
                    if (-1 == ib.field_e) {
                      break L4;
                    } else {
                      if (ib.field_e != 0) {
                        ib.field_e = -1;
                        int discarded$13 = -21754;
                        j.e();
                        break L4;
                      } else {
                        break L4;
                      }
                    }
                  }
                  if (!param0) {
                    int discarded$14 = 1;
                    var5_int = ri.a(false, sa.a(), ((wf) this).field_r, ((wf) this).field_v, al.b(0), 0);
                    if (var5_int == -1) {
                      break L3;
                    } else {
                      if (var5_int == 0) {
                        vi.field_H = oa.field_c;
                        int discarded$15 = -12618;
                        gi.b();
                        hl.field_G = false;
                        hj.field_a = 10;
                        break L3;
                      } else {
                        q.a((byte) 124, var5_int, kh.field_a);
                        kh.field_a = null;
                        break L3;
                      }
                    }
                  } else {
                    ii.field_e = false;
                    break L3;
                  }
                } else {
                  break L3;
                }
              }
              L5: {
                if (var4 != 4) {
                  break L5;
                } else {
                  if (!rb.field_c) {
                    hl.field_G = true;
                    hj.field_a = 10;
                    break L5;
                  } else {
                    ba.a((byte) 116, k.c(121));
                    break L5;
                  }
                }
              }
              L6: {
                if (5 == var4) {
                  int discarded$16 = 62;
                  gf.a(k.c(120));
                  break L6;
                } else {
                  break L6;
                }
              }
              L7: {
                if (var4 != 6) {
                  break L7;
                } else {
                  if (kf.field_e) {
                    hj.field_a = 10;
                    break L7;
                  } else {
                    break L7;
                  }
                }
              }
              L8: {
                if (var4 != 7) {
                  break L8;
                } else {
                  je.a((byte) 114, k.c(107));
                  break L8;
                }
              }
              L9: {
                if (var4 == 8) {
                  ba.a((byte) 116, k.c(119));
                  break L9;
                } else {
                  break L9;
                }
              }
              L10: {
                if (9 == var4) {
                  int discarded$17 = -91;
                  tl.a(k.c(115));
                  break L10;
                } else {
                  break L10;
                }
              }
              L11: {
                if (var4 == 10) {
                  fj.field_q.a(17, (byte) -21);
                  break L11;
                } else {
                  break L11;
                }
              }
              L12: {
                if (var4 == 11) {
                  h.a(k.c(110), false);
                  break L12;
                } else {
                  break L12;
                }
              }
              L13: {
                if (var4 == 12) {
                  int discarded$18 = 240;
                  eb.a(k.c(121), (byte) 117, gf.a());
                  break L13;
                } else {
                  break L13;
                }
              }
              L14: {
                if (var4 != 13) {
                  break L14;
                } else {
                  try {
                    L15: {
                      L16: {
                        if (null == mk.field_n) {
                          mk.field_n = new wg(ka.field_i, new java.net.URL(((wf) this).getCodeBase(), "countrylist.ws"), 5000);
                          break L16;
                        } else {
                          break L16;
                        }
                      }
                      L17: {
                        if (!mk.field_n.a((byte) 45)) {
                          break L17;
                        } else {
                          L18: {
                            var12 = mk.field_n.b((byte) 91);
                            if (var12 == null) {
                              var9 = null;
                              wd.a((byte) 69, (String) null);
                              break L18;
                            } else {
                              var7 = bc.a(-46, var12.field_j, 0, var12.field_f);
                              wd.a((byte) 69, var7);
                              break L18;
                            }
                          }
                          mk.field_n = null;
                          break L17;
                        }
                      }
                      break L15;
                    }
                  } catch (java.lang.Exception decompiledCaughtParameter0) {
                    decompiledCaughtException = decompiledCaughtParameter0;
                    L19: {
                      var5 = (Exception) (Object) decompiledCaughtException;
                      int discarded$19 = 125;
                      gi.a((Throwable) (Object) var5, "S1");
                      var10 = null;
                      wd.a((byte) 69, (String) null);
                      mk.field_n = null;
                      break L19;
                    }
                  }
                  break L14;
                }
              }
              L20: {
                if (var4 != 15) {
                  break L20;
                } else {
                  hj.field_a = 10;
                  break L20;
                }
              }
              if (16 == var4) {
                return 1;
              } else {
                if (var4 == 17) {
                  return 2;
                } else {
                  return 0;
                }
              }
            }
        } catch (RuntimeException | Error decompiledUncheckedException) {
            throw decompiledUncheckedException;
        } catch (Throwable decompiledCheckedException) {
            throw new RuntimeException(decompiledCheckedException);
        }
    }

    private final void e(byte param0) {
        wj.field_G[4] = true;
        int var2 = 0;
    }

    private final void a(int param0, String param1, int param2, byte param3, int param4) {
        Exception var6 = null;
        RuntimeException var6_ref = null;
        String var6_ref2 = null;
        String var7 = null;
        String var8 = null;
        String var9 = null;
        Object stackIn_3_0 = null;
        Object stackIn_4_0 = null;
        Object stackIn_5_0 = null;
        Object stackIn_6_0 = null;
        Object stackIn_7_0 = null;
        int stackIn_7_1 = 0;
        RuntimeException stackIn_21_0 = null;
        StringBuilder stackIn_21_1 = null;
        RuntimeException stackIn_22_0 = null;
        StringBuilder stackIn_22_1 = null;
        RuntimeException stackIn_23_0 = null;
        StringBuilder stackIn_23_1 = null;
        String stackIn_23_2 = null;
        Throwable decompiledCaughtException = null;
        Object stackOut_2_0 = null;
        Object stackOut_3_0 = null;
        Object stackOut_6_0 = null;
        int stackOut_6_1 = 0;
        Object stackOut_4_0 = null;
        Object stackOut_5_0 = null;
        int stackOut_5_1 = 0;
        RuntimeException stackOut_20_0 = null;
        StringBuilder stackOut_20_1 = null;
        RuntimeException stackOut_22_0 = null;
        StringBuilder stackOut_22_1 = null;
        String stackOut_22_2 = null;
        RuntimeException stackOut_21_0 = null;
        StringBuilder stackOut_21_1 = null;
        String stackOut_21_2 = null;
        try {
          try {
            L0: {
              if (((wf) this).a(false)) {
                L1: {
                  L2: {
                    ((wf) this).field_n = ((wf) this).getCodeBase().getHost();
                    var6_ref2 = ((wf) this).field_n.toLowerCase();
                    stackOut_2_0 = this;
                    stackIn_5_0 = stackOut_2_0;
                    stackIn_3_0 = stackOut_2_0;
                    if (var6_ref2.equals((Object) (Object) "jagex.com")) {
                      break L2;
                    } else {
                      stackOut_3_0 = this;
                      stackIn_6_0 = stackOut_3_0;
                      stackIn_4_0 = stackOut_3_0;
                      if (!var6_ref2.endsWith(".jagex.com")) {
                        stackOut_6_0 = this;
                        stackOut_6_1 = 0;
                        stackIn_7_0 = stackOut_6_0;
                        stackIn_7_1 = stackOut_6_1;
                        break L1;
                      } else {
                        stackOut_4_0 = this;
                        stackIn_5_0 = stackOut_4_0;
                        break L2;
                      }
                    }
                  }
                  stackOut_5_0 = this;
                  stackOut_5_1 = 1;
                  stackIn_7_0 = stackOut_5_0;
                  stackIn_7_1 = stackOut_5_1;
                  break L1;
                }
                L3: {
                  ((wf) this).field_v = stackIn_7_1 != 0;
                  ((wf) this).field_l = Integer.parseInt(((wf) this).getParameter("gameport1"));
                  ((wf) this).field_w = Integer.parseInt(((wf) this).getParameter("gameport2"));
                  var7 = ((wf) this).getParameter("servernum");
                  if (var7 == null) {
                    break L3;
                  } else {
                    ((wf) this).field_x = Integer.parseInt(var7);
                    break L3;
                  }
                }
                L4: {
                  ((wf) this).field_s = Integer.parseInt(((wf) this).getParameter("gamecrc"));
                  ((wf) this).field_k = Long.parseLong(((wf) this).getParameter("instanceid"));
                  ((wf) this).field_m = ((wf) this).getParameter("member").equals((Object) (Object) "yes");
                  var8 = ((wf) this).getParameter("lang");
                  if (var8 == null) {
                    break L4;
                  } else {
                    ((wf) this).field_u = Integer.parseInt(var8);
                    break L4;
                  }
                }
                L5: {
                  if (((wf) this).field_u < 5) {
                    break L5;
                  } else {
                    ((wf) this).field_u = 0;
                    break L5;
                  }
                }
                L6: {
                  var9 = ((wf) this).getParameter("affid");
                  if (var9 != null) {
                    ((wf) this).field_r = Integer.parseInt(var9);
                    break L6;
                  } else {
                    break L6;
                  }
                }
                p.field_m = Boolean.valueOf(((wf) this).getParameter("simplemode")).booleanValue();
                ((wf) this).a(32, -14948, ((wf) this).field_s, 480, param4, param1, param2);
                break L0;
              } else {
                return;
              }
            }
          } catch (java.lang.Exception decompiledCaughtParameter0) {
            decompiledCaughtException = decompiledCaughtParameter0;
            L7: {
              var6 = (Exception) (Object) decompiledCaughtException;
              int discarded$1 = 125;
              gi.a((Throwable) (Object) var6, (String) null);
              ((wf) this).a((byte) 79, "crash");
              break L7;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter1) {
          decompiledCaughtException = decompiledCaughtParameter1;
          L8: {
            var6_ref = (RuntimeException) (Object) decompiledCaughtException;
            stackOut_20_0 = (RuntimeException) var6_ref;
            stackOut_20_1 = new StringBuilder().append("wf.UA(").append(480).append(',');
            stackIn_22_0 = stackOut_20_0;
            stackIn_22_1 = stackOut_20_1;
            stackIn_21_0 = stackOut_20_0;
            stackIn_21_1 = stackOut_20_1;
            if (param1 == null) {
              stackOut_22_0 = (RuntimeException) (Object) stackIn_22_0;
              stackOut_22_1 = (StringBuilder) (Object) stackIn_22_1;
              stackOut_22_2 = "null";
              stackIn_23_0 = stackOut_22_0;
              stackIn_23_1 = stackOut_22_1;
              stackIn_23_2 = stackOut_22_2;
              break L8;
            } else {
              stackOut_21_0 = (RuntimeException) (Object) stackIn_21_0;
              stackOut_21_1 = (StringBuilder) (Object) stackIn_21_1;
              stackOut_21_2 = "{...}";
              stackIn_23_0 = stackOut_21_0;
              stackIn_23_1 = stackOut_21_1;
              stackIn_23_2 = stackOut_21_2;
              break L8;
            }
          }
          throw t.a((Throwable) (Object) stackIn_23_0, stackIn_23_2 + ',' + param2 + ',' + 81 + ',' + param4 + ')');
        }
    }

    final static int[] j(int param0) {
        if (param0 < 81) {
            field_p = -43;
        }
        return new int[8];
    }

    final void l(int param0) {
        int var2 = 0;
        vd var3 = null;
        int var4 = 0;
        int stackIn_30_0 = 0;
        int stackOut_29_0 = 0;
        int stackOut_28_0 = 0;
        L0: {
          var4 = Geoblox.field_C;
          if (param0 >= 119) {
            break L0;
          } else {
            ((wf) this).field_m = true;
            break L0;
          }
        }
        L1: {
          var2 = me.field_l;
          if (var2 >= 64) {
            break L1;
          } else {
            if (!wj.field_G[var2]) {
              break L1;
            } else {
              if (var2 == 0) {
                return;
              } else {
                L2: {
                  if (var2 == 1) {
                    int discarded$10 = -1073741824;
                    ec.a();
                    break L2;
                  } else {
                    if (var2 == 2) {
                      int discarded$11 = -24839;
                      cm.c();
                      break L2;
                    } else {
                      if (3 == var2) {
                        int discarded$12 = 119;
                        ud.b();
                        break L2;
                      } else {
                        if (var2 != 4) {
                          if (5 == var2) {
                            int discarded$13 = 26146;
                            al.a();
                            break L2;
                          } else {
                            if (var2 == 6) {
                              bh.a(2);
                              break L2;
                            } else {
                              if (var2 != 7) {
                                if (8 == var2) {
                                  pg.a(-4, ka.field_i, p.field_k, (qc) (Object) eh.field_d);
                                  break L2;
                                } else {
                                  if (var2 == 16) {
                                    rc.b(1);
                                    break L2;
                                  } else {
                                    L3: {
                                      if (11 == var2) {
                                        break L3;
                                      } else {
                                        if (12 == var2) {
                                          break L3;
                                        } else {
                                          if (var2 != 13) {
                                            if (17 == var2) {
                                              this.g((byte) 12);
                                              break L2;
                                            } else {
                                              if (var2 == 18) {
                                                int discarded$14 = 11560;
                                                dl.a();
                                                break L2;
                                              } else {
                                                int discarded$15 = 125;
                                                gi.a((Throwable) null, "MGS1: " + og.e(55));
                                                jl.a((byte) -122);
                                                break L2;
                                              }
                                            }
                                          } else {
                                            int discarded$16 = 104;
                                            lc.a();
                                            break L2;
                                          }
                                        }
                                      }
                                    }
                                    L4: {
                                      if (var2 != 12) {
                                        stackOut_29_0 = 0;
                                        stackIn_30_0 = stackOut_29_0;
                                        break L4;
                                      } else {
                                        stackOut_28_0 = 1;
                                        stackIn_30_0 = stackOut_28_0;
                                        break L4;
                                      }
                                    }
                                    var3 = bk.a(stackIn_30_0 != 0, 128);
                                    int discarded$17 = 0;
                                    s.a(var3);
                                    break L2;
                                  }
                                }
                              } else {
                                this.f(-11);
                                break L2;
                              }
                            }
                          }
                        } else {
                          int discarded$18 = -103;
                          pf.f();
                          break L2;
                        }
                      }
                    }
                  }
                }
                return;
              }
            }
          }
        }
        int discarded$19 = 125;
        gi.a((Throwable) null, "MGS2: " + og.e(55));
        jl.a((byte) -118);
    }

    private final void g(byte param0) {
        int var2 = eh.field_d.c((byte) 34);
        int var3 = (var2 & 1) != 0 ? 1 : 0;
        int var4 = -1 + p.field_k;
        byte[] var5 = new byte[var4];
        eh.field_d.c(96, 0, var5, var4);
        pa.a(ag.a(1, var5), (byte) -128, var3 != 0, k.c(112));
    }

    private final void i(int param0) {
        wj.field_G[2] = true;
    }

    private final void d(boolean param0) {
        wj.field_G[5] = true;
    }

    private final void f() {
        wj.field_G[1] = true;
    }

    final void h(byte param0) {
        ((wf) this).field_t = true;
        int var2 = -21 / ((-82 - param0) / 37);
    }

    final int a(boolean param0, int param1) {
        if (param1 != -17978) {
            this.e(-61);
        }
        int discarded$0 = -1;
        return this.a(true, param0);
    }

    protected wf() {
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_q = "Fullscreen";
    }
}
