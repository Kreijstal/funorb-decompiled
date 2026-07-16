/*
 * Decompiled by CFR-JS 0.4.0.
 */
import java.io.*;

final class gh extends ea implements Cloneable {
    static boolean field_y;
    static String field_t;
    static int field_C;
    private int field_u;
    static String field_A;
    private boolean field_v;
    private transient boolean field_D;
    static vc field_F;
    int field_x;
    static int field_w;
    int field_G;
    static int[] field_E;
    static int field_B;
    static int[] field_z;

    final sl a(f[][] param0, int param1, boolean param2, int param3, int param4, int param5) {
        sl var7 = null;
        f var8 = null;
        int var9 = 0;
        sl var10 = null;
        var9 = CrazyCrystals.field_B;
        var10 = super.a(param0, param1, param2, param3, param4, param5);
        var7 = var10;
        var8 = param0[param1 + param3][param4 + param5];
        L0: while (true) {
          L1: {
            if (var8 instanceof ro) {
              jj.field_c.a(128, (param5 + param4) * 12, (param3 + param1) * 12, 60, (byte) -111);
              ((ro) (Object) var8).field_p = (gh) this;
              var10.field_p = false;
              fn.field_j = fn.field_j - 5;
              mb.field_g = mb.field_g - 5;
              break L1;
            } else {
              if (!(var8 instanceof pn)) {
                break L1;
              } else {
                var8 = ((pn) (Object) var8).field_l;
                continue L0;
              }
            }
          }
          var8 = param0[param1][param4];
          L2: while (true) {
            L3: {
              if (!(var8 instanceof ro)) {
                if (var8 instanceof pn) {
                  var8 = ((pn) (Object) var8).field_l;
                  continue L2;
                } else {
                  break L3;
                }
              } else {
                m.field_n.a(256, 12 * param4, 12 * param1, 60, (byte) -111);
                ((gh) this).field_D = false;
                ((ro) (Object) var8).field_p = null;
                fn.field_j = fn.field_j + 1;
                mb.field_g = mb.field_g + 1;
                ((ro) (Object) var8).field_o = (gh) this;
                b.field_a = b.field_a + 20;
                je.field_j = je.field_j + 20;
                we.field_h = we.field_h + 40;
                fp.field_a = fp.field_a + 40;
                break L3;
              }
            }
            return var7;
          }
        }
    }

    final static rh h(int param0) {
        if (param0 != 26500) {
            field_F = null;
        }
        return new rh(ac.c(61), km.a((byte) -102));
    }

    private final void b(int param0, boolean param1, int param2, int param3, int param4, int param5) {
        if (!(((gh) this).field_G == 0)) {
            this.a(param1, param3, 23179, param5, param2, -1, 0.0, param0);
            this.a(param1, param3, 23179, param5, param2, 1, 1.5707963267948966, param0);
        }
        if (0 != ((gh) this).field_x) {
            this.a(param1, param2, param3, -1, param0, param5, (byte) -105, 0.0);
            this.a(param1, param2, param3, 1, param0, param5, (byte) -105, 1.5707963267948966);
        }
        int var7 = 100 / ((param4 - -50) / 33);
    }

    final f a(f[][] param0, int param1, f param2, int param3, int param4) {
        f var6 = null;
        int var6_int = 0;
        int var7 = 0;
        int var8 = 0;
        L0: {
          var8 = CrazyCrystals.field_B;
          if (null != ab.field_D) {
            break L0;
          } else {
            gl.field_e = gl.field_e - 1;
            if (param2 == null) {
              break L0;
            } else {
              var6_int = param2.a(false);
              var7 = 0;
              L1: while (true) {
                if ((var7 ^ -1) <= -4) {
                  break L0;
                } else {
                  if ((1 << var7 & var6_int) != 0) {
                    L2: {
                      q.field_a[var7].a(false, (byte) -128);
                      b.field_a = b.field_a - 1;
                      je.field_j = je.field_j - 1;
                      fp.field_a = fp.field_a - 2;
                      we.field_h = we.field_h - 1;
                      mb.field_g = mb.field_g - 5;
                      fn.field_j = fn.field_j - 5;
                      we.field_h = we.field_h + 6;
                      fp.field_a = fp.field_a + 6;
                      b.field_a = b.field_a + 3;
                      je.field_j = je.field_j + 3;
                      mb.field_g = mb.field_g + wd.field_j;
                      ob.field_l = ob.field_l + 1;
                      if (-1 == (gl.field_e ^ -1)) {
                        va.field_d = va.field_d | 1 << var7;
                        break L2;
                      } else {
                        break L2;
                      }
                    }
                    mb.field_g = mb.field_g + 50;
                    fn.field_j = fn.field_j + 75;
                    var7++;
                    continue L1;
                  } else {
                    var7++;
                    continue L1;
                  }
                }
              }
            }
          }
        }
        if (param3 == 11460) {
          ((gh) this).b(param4, param1, -663, param0);
          var6 = param0[param1 + ((gh) this).field_s][((gh) this).field_o + param4];
          L3: while (true) {
            L4: {
              if (!(var6 instanceof ro)) {
                if (var6 instanceof pn) {
                  var6 = ((pn) (Object) var6).field_l;
                  continue L3;
                } else {
                  break L4;
                }
              } else {
                ((ro) (Object) var6).field_p = null;
                we.field_h = we.field_h + 40;
                fp.field_a = fp.field_a + 40;
                b.field_a = b.field_a + 20;
                je.field_j = je.field_j + 20;
                break L4;
              }
            }
            return ((gh) this).field_l;
          }
        } else {
          return null;
        }
    }

    final void a(int param0, f[][] param1, int param2, int param3) {
        if (param0 != -35) {
            Object var6 = null;
            nj discarded$0 = ((gh) this).a(49, (nj) null);
        }
    }

    final void f(int param0, int param1, f[][] param2, int param3) {
        f var5 = null;
        ro var6_ref_ro = null;
        int var6 = 0;
        int var7 = 0;
        int var8 = 0;
        int var9 = 0;
        int var10 = 0;
        Object var11 = null;
        var10 = CrazyCrystals.field_B;
        ((gh) this).field_v = false;
        var5 = ((gh) this).field_l;
        L0: while (true) {
          if (var5 instanceof ro) {
            var6_ref_ro = (ro) (Object) var5;
            var7 = 0;
            L1: while (true) {
              if (4 <= var7) {
                return;
              } else {
                L2: {
                  if (1 == var6_ref_ro.field_m) {
                    var8 = ((gh) this).field_x;
                    var6_ref_ro.field_m = 0;
                    var9 = ((gh) this).field_G;
                    break L2;
                  } else {
                    var6_ref_ro.field_m = 1;
                    var9 = -((gh) this).field_G;
                    var8 = -((gh) this).field_x;
                    break L2;
                  }
                }
                ((gh) this).field_G = var8;
                ((gh) this).field_x = var9;
                if (!param2[((gh) this).field_x + param1][((gh) this).field_G + param3].a(16736352, param2, true, ((gh) this).field_x, param1, param3, (ea) this, ((gh) this).field_G)) {
                  ((gh) this).a((byte) 73, param2[param1 + ((gh) this).field_x][param3 - -((gh) this).field_G]);
                  ((gh) this).field_x = -((gh) this).field_x;
                  ((gh) this).field_G = -((gh) this).field_G;
                  var7++;
                  continue L1;
                } else {
                  var6_ref_ro.a((byte) 127, (f) this);
                  ((gh) this).field_v = true;
                  sl discarded$3 = ((gh) this).a(param2, param1, false, ((gh) this).field_x, param3, ((gh) this).field_G);
                  mb.field_g = mb.field_g + ob.field_l;
                  wd.field_j = wd.field_j + 1;
                  return;
                }
              }
            }
          } else {
            if (!(var5 instanceof pn)) {
              L3: {
                var6 = 0;
                if (param0 == 1) {
                  break L3;
                } else {
                  var11 = null;
                  nj discarded$4 = ((gh) this).a(-1, (nj) null);
                  break L3;
                }
              }
              var7 = 0;
              L4: while (true) {
                if (var7 >= 2) {
                  return;
                } else {
                  if (param2[param1 - -((gh) this).field_x][param3 - -((gh) this).field_G].a(16736352, param2, true, ((gh) this).field_x, param1, param3, (ea) this, ((gh) this).field_G)) {
                    L5: {
                      if (var6 != 0) {
                        ga.field_B.a(64, param3 * 12, 12 * param1, 60, (byte) -111);
                        break L5;
                      } else {
                        break L5;
                      }
                    }
                    mb.field_g = mb.field_g + ob.field_l;
                    wd.field_j = wd.field_j + 1;
                    ((gh) this).field_v = true;
                    sl discarded$5 = ((gh) this).a(param2, param1, false, ((gh) this).field_x, param3, ((gh) this).field_G);
                    return;
                  } else {
                    ((gh) this).a((byte) 62, param2[((gh) this).field_x + param1][((gh) this).field_G + param3]);
                    ((gh) this).field_x = -((gh) this).field_x;
                    var6 = 1;
                    ((gh) this).field_G = -((gh) this).field_G;
                    var7++;
                    continue L4;
                  }
                }
              }
            } else {
              var5 = ((pn) (Object) var5).field_l;
              continue L0;
            }
          }
        }
    }

    final static void j(int param0) {
        int var1 = 0;
        Object var2 = null;
        nj var2_ref = null;
        int var3 = 0;
        dl var4 = null;
        String var5 = null;
        String var6 = null;
        nj var7 = null;
        int var8 = 0;
        nj var9 = null;
        var8 = CrazyCrystals.field_B;
        if (ge.field_c != 0) {
          var1 = mm.a(ge.field_c, (byte) -120);
          if (param0 == -10935) {
            L0: {
              L1: {
                if (li.field_a == null) {
                  break L1;
                } else {
                  if (li.field_a.field_l != null) {
                    L2: {
                      var9 = li.field_a;
                      var2_ref = var9;
                      var1++;
                      if (300 > var9.field_f) {
                        var9.field_f = 300;
                        break L2;
                      } else {
                        break L2;
                      }
                    }
                    L3: while (true) {
                      if (null == var2_ref.field_n) {
                        if ((var1 ^ -1) < -4) {
                          var2_ref = null;
                          break L0;
                        } else {
                          break L0;
                        }
                      } else {
                        var2_ref = var2_ref.field_n;
                        var1++;
                        continue L3;
                      }
                    }
                  } else {
                    break L1;
                  }
                }
              }
              var2_ref = null;
              break L0;
            }
            var3 = 0;
            L4: while (true) {
              if (var3 >= 17) {
                ge.field_c = 0;
                return;
              } else {
                if ((ge.field_c & 1 << var3) != 0) {
                  L5: {
                    var4 = vf.field_b[var3];
                    var5 = jm.field_e[var3];
                    var6 = ci.a(new String[1], wn.field_a, 3);
                    var7 = new nj(var4, var5, var6);
                    if (var2_ref != null) {
                      L6: {
                        if (!var2_ref.field_i) {
                          break L6;
                        } else {
                          var7.field_i = true;
                          break L6;
                        }
                      }
                      var2_ref.field_n = var7;
                      break L5;
                    } else {
                      li.field_a = var7;
                      break L5;
                    }
                  }
                  var2_ref = var7;
                  var3++;
                  continue L4;
                } else {
                  var3++;
                  continue L4;
                }
              }
            }
          } else {
            return;
          }
        } else {
          return;
        }
    }

    gh(f param0, int param1, int param2) {
        super(param0);
        ((gh) this).field_D = true;
        ((gh) this).field_G = param1;
        ((gh) this).field_x = param2;
    }

    final int a(boolean param0, int param1) {
        if (param1 != 0) {
            int discarded$0 = ((gh) this).a(true, 46);
        }
        return 12;
    }

    private final dl e(byte param0) {
        if (!(((gh) this).field_G >= 0)) {
            return vp.field_d;
        }
        if (-1 > ((gh) this).field_G) {
            return na.field_eb;
        }
        if (-1 > ((gh) this).field_x) {
            return mk.field_a;
        }
        if (param0 != 79) {
            return null;
        }
        return tl.field_b;
    }

    final nj a(int param0, nj param1) {
        if (param0 != 23525) {
            gh.j(58);
        }
        return ng.a(rb.field_e, param1, (f) (Object) new gh((f) (Object) new kp(-1), 0, 0), (byte) -83, fl.field_f);
    }

    final f a(sl param0, f[][] param1, int param2, int param3, int param4, int param5, int param6) {
        ((gh) this).field_u = (38 + (((gh) this).field_u + 12 * (((gh) this).field_G + ((gh) this).field_x))) % 38;
        ((gh) this).field_D = param0.field_p;
        if (param4 != 17512) {
            return null;
        }
        return super.a(param0, param1, param2, param3, 17512, param5, param6);
    }

    final static java.net.URL a(java.applet.Applet param0, java.net.URL param1, byte param2) {
        Object var3 = null;
        Object var4 = null;
        if (null != to.field_f) {
            if (!(to.field_f.equals((Object) (Object) param0.getParameter("settings")))) {
                var3 = (Object) (Object) to.field_f;
                var4 = var3;
                var4 = var3;
            }
        }
        if (param2 != 67) {
            field_y = true;
        }
        if (hm.field_c != null) {
            if (!(hm.field_c.equals((Object) (Object) param0.getParameter("session")))) {
                var4 = (Object) (Object) hm.field_c;
            }
        }
        return rf.a(-1, (String) var4, true, (String) var3, param1);
    }

    final void a(boolean param0, int param1, int param2, int param3, int param4, int param5) {
        L0: {
          if (param5 == 4261) {
            break L0;
          } else {
            boolean discarded$2 = ((gh) this).g(3);
            break L0;
          }
        }
        L1: {
          if (((gh) this).field_v) {
            this.b(param3, false, param2, param4, -5, param1);
            break L1;
          } else {
            break L1;
          }
        }
        L2: {
          L3: {
            if (-25 != (param2 ^ -1)) {
              break L3;
            } else {
              if (param3 == 24) {
                il.field_e.a(param1, param4 - param3);
                if (param0) {
                  this.e((byte) 79).a(param1, param4 - param3);
                  break L2;
                } else {
                  break L2;
                }
              } else {
                break L3;
              }
            }
          }
          il.field_e.b(param1, param4 + -param3, 2 * param2, param3 * 3);
          if (!param0) {
            break L2;
          } else {
            this.e((byte) 79).b(param1, param4 + -param3, 2 * param2, 3 * param3);
            break L2;
          }
        }
        L4: {
          if (!((gh) this).field_v) {
            break L4;
          } else {
            this.b(param3, true, param2, param4, 2, param1);
            break L4;
          }
        }
    }

    final static void a(String param0, int param1, int param2, int param3) {
        Object var4 = null;
        Throwable var5 = null;
        Throwable decompiledCaughtException = null;
        L0: {
          rn.field_q = param0;
          if (param1 == 12) {
            break L0;
          } else {
            field_B = -26;
            break L0;
          }
        }
        lc.field_d = param3;
        var4 = (Object) (Object) gf.field_c;
        synchronized (var4) {
          L1: {
            fq.field_x.d(62);
            gf.field_c.a();
            break L1;
          }
        }
        L2: {
          om.field_x = null;
          if (param0 != null) {
            fq.field_x.e(-20562, param3 * param2 >> 1425808326);
            om.field_x = param0;
            break L2;
          } else {
            break L2;
          }
        }
    }

    public static void k(int param0) {
        field_z = null;
        field_E = null;
        field_F = null;
        field_t = null;
        if (param0 != 0) {
            field_F = null;
        }
        field_A = null;
    }

    final static int a(String param0, int param1) {
        int var2 = -122 % ((param1 - -54) / 35);
        return an.field_q.a(param0, 148);
    }

    private final void a(boolean param0, int param1, int param2, int param3, int param4, int param5, double param6, int param7) {
        int var10 = 0;
        int var11 = 0;
        double var12 = 0.0;
        int var14 = 0;
        double var15 = 0.0;
        int var17 = 0;
        int var18 = 0;
        boolean stackIn_3_0 = false;
        boolean stackIn_4_0 = false;
        boolean stackIn_5_0 = false;
        int stackIn_5_1 = 0;
        int stackIn_11_0 = 0;
        int stackIn_12_0 = 0;
        int stackIn_13_0 = 0;
        int stackIn_14_0 = 0;
        int stackIn_14_1 = 0;
        boolean stackOut_2_0 = false;
        boolean stackOut_4_0 = false;
        int stackOut_4_1 = 0;
        boolean stackOut_3_0 = false;
        int stackOut_3_1 = 0;
        int stackOut_10_0 = 0;
        int stackOut_9_0 = 0;
        int stackOut_11_0 = 0;
        int stackOut_13_0 = 0;
        int stackOut_13_1 = 0;
        int stackOut_12_0 = 0;
        int stackOut_12_1 = 0;
        if (param2 == 23179) {
          L0: {
            var10 = param4 + param3 << -375276892;
            var11 = (param1 << -40748796) + (param7 << 1275796195);
            var12 = 0.16534698176788384 * (double)(((gh) this).field_u + ((gh) this).field_G * ((gh) this).field_m) + param6;
            var14 = param5;
            var15 = Math.cos(var12);
            var17 = (int)(13.856406460551018 * ((double)param4 * Math.sin(var12)));
            var18 = (int)(6.928203230275509 * (var15 * (double)param7));
            stackOut_2_0 = param0;
            stackIn_4_0 = stackOut_2_0;
            stackIn_3_0 = stackOut_2_0;
            if (0.0 >= 4.0 * (double)var14 - var15 * 13.856406460551018) {
              stackOut_4_0 = stackIn_4_0;
              stackOut_4_1 = 0;
              stackIn_5_0 = stackOut_4_0;
              stackIn_5_1 = stackOut_4_1;
              break L0;
            } else {
              stackOut_3_0 = stackIn_3_0;
              stackOut_3_1 = 1;
              stackIn_5_0 = stackOut_3_0;
              stackIn_5_1 = stackOut_3_1;
              break L0;
            }
          }
          L1: {
            if ((stackIn_5_0 ? 1 : 0) == stackIn_5_1) {
              kh.a(var10 - var17, var18 + (var11 + param5 * (int)((double)param7 * 8.0)), param4 << -1710387903, 15, rn.field_j);
              break L1;
            } else {
              break L1;
            }
          }
          L2: {
            if (var15 * 13.856406460551018 + 4.0 * (double)var14 > 0.0) {
              stackOut_10_0 = 0;
              stackIn_11_0 = stackOut_10_0;
              break L2;
            } else {
              stackOut_9_0 = 1;
              stackIn_11_0 = stackOut_9_0;
              break L2;
            }
          }
          L3: {
            stackOut_11_0 = stackIn_11_0;
            stackIn_13_0 = stackOut_11_0;
            stackIn_12_0 = stackOut_11_0;
            if (param0) {
              stackOut_13_0 = stackIn_13_0;
              stackOut_13_1 = 0;
              stackIn_14_0 = stackOut_13_0;
              stackIn_14_1 = stackOut_13_1;
              break L3;
            } else {
              stackOut_12_0 = stackIn_12_0;
              stackOut_12_1 = 1;
              stackIn_14_0 = stackOut_12_0;
              stackIn_14_1 = stackOut_12_1;
              break L3;
            }
          }
          L4: {
            if (stackIn_14_0 == stackIn_14_1) {
              kh.a(var10 + var17, var11 - var18 - -((int)((double)param7 * 8.0) * param5), param4 << 753506913, 15, rn.field_j);
              break L4;
            } else {
              break L4;
            }
          }
          return;
        } else {
          return;
        }
    }

    final void a(int param0, DataInputStream param1, int param2, byte param3, int param4) throws IOException {
        if (param3 >= -69) {
            field_F = null;
        }
        int var6 = param1.readUnsignedByte();
        ((gh) this).field_G = mo.field_h[var6];
        ((gh) this).field_x = kl.field_S[var6];
    }

    final void b(int param0, int param1, int param2, boolean param3, int param4, int param5) {
        int var7 = 18 % ((74 - param0) / 41);
        if (((gh) this).field_D) {
            super.b(120, param1, param2, param3, param4, param5);
        }
    }

    final boolean g(int param0) {
        if (param0 != 0) {
            Object var3 = null;
            f discarded$0 = ((gh) this).a((f[][]) null, -81, (f) null, 72, -60);
            return false;
        }
        return false;
    }

    final void c(boolean param0, boolean param1) {
        if (!param0) {
            gh.k(-98);
        }
        if (param1) {
            return;
        }
        gl.field_e = gl.field_e + 1;
    }

    final void b(int param0, int param1, int param2, f[][] param3) {
        f var5 = null;
        int var6 = 0;
        var6 = CrazyCrystals.field_B;
        var5 = param3[param1][param0];
        L0: while (true) {
          L1: {
            if (var5 instanceof ro) {
              ((ro) (Object) var5).field_o = null;
              ((gh) this).field_D = true;
              break L1;
            } else {
              if (!(var5 instanceof pn)) {
                break L1;
              } else {
                var5 = ((pn) (Object) var5).field_l;
                continue L0;
              }
            }
          }
          L2: {
            if (param2 == -663) {
              break L2;
            } else {
              ((gh) this).f(99, -94, (f[][]) null, -15);
              break L2;
            }
          }
          return;
        }
    }

    final f e(int param0, int param1, f[][] param2, int param3) {
        f var5 = null;
        de var6 = null;
        int var7 = 0;
        var7 = CrazyCrystals.field_B;
        var5 = ((gh) this).field_l;
        L0: while (true) {
          L1: {
            if (!(var5 instanceof de)) {
              if (var5 instanceof pn) {
                var5 = ((pn) (Object) var5).field_l;
                continue L0;
              } else {
                break L1;
              }
            } else {
              var6 = (de) (Object) var5;
              if (null != var6.field_j) {
                break L1;
              } else {
                ua.field_a.a(256, param1 * 12, param0 * 12, 0, (byte) -111);
                var6.field_j = (ea) this;
                ((gh) this).field_v = false;
                return ((gh) this).a(param2, param0, (f) this, 11460, param1);
              }
            }
          }
          L2: {
            if (param3 >= 120) {
              break L2;
            } else {
              ((gh) this).field_v = true;
              break L2;
            }
          }
          return (f) this;
        }
    }

    private final void a(boolean param0, int param1, int param2, int param3, int param4, int param5, byte param6, double param7) {
        int var10 = 0;
        int var11 = 0;
        double var12 = 0.0;
        double var14 = 0.0;
        double var16 = 0.0;
        int var18 = 0;
        int var19 = 0;
        int stackIn_5_0 = 0;
        int stackIn_6_0 = 0;
        int stackIn_7_0 = 0;
        int stackIn_8_0 = 0;
        int stackIn_8_1 = 0;
        int stackIn_13_0 = 0;
        int stackIn_14_0 = 0;
        int stackIn_15_0 = 0;
        int stackIn_16_0 = 0;
        int stackIn_16_1 = 0;
        int stackOut_4_0 = 0;
        int stackOut_3_0 = 0;
        int stackOut_5_0 = 0;
        int stackOut_7_0 = 0;
        int stackOut_7_1 = 0;
        int stackOut_6_0 = 0;
        int stackOut_6_1 = 0;
        int stackOut_12_0 = 0;
        int stackOut_11_0 = 0;
        int stackOut_13_0 = 0;
        int stackOut_15_0 = 0;
        int stackOut_15_1 = 0;
        int stackOut_14_0 = 0;
        int stackOut_14_1 = 0;
        L0: {
          var10 = param1 + param5 << -571334556;
          var11 = (param4 << -2101005021) + (param2 << -1113589852);
          if (param6 == -105) {
            break L0;
          } else {
            gh.k(107);
            break L0;
          }
        }
        L1: {
          var12 = param7 + 0.16534698176788384 * (double)(((gh) this).field_m * ((gh) this).field_x + ((gh) this).field_u);
          var14 = Math.sin(var12);
          var16 = Math.cos(var12);
          var18 = (int)(11.313708498984761 * (double)param1);
          var19 = (int)(5.656854249492381 * (var16 * (double)param4) + 11.313708498984761 * ((double)param1 * var14));
          if (0.0 >= -(var16 * 11.313708498984761) + 5.656854249492381 * var14) {
            stackOut_4_0 = 0;
            stackIn_5_0 = stackOut_4_0;
            break L1;
          } else {
            stackOut_3_0 = 1;
            stackIn_5_0 = stackOut_3_0;
            break L1;
          }
        }
        L2: {
          stackOut_5_0 = stackIn_5_0;
          stackIn_7_0 = stackOut_5_0;
          stackIn_6_0 = stackOut_5_0;
          if (param0) {
            stackOut_7_0 = stackIn_7_0;
            stackOut_7_1 = 0;
            stackIn_8_0 = stackOut_7_0;
            stackIn_8_1 = stackOut_7_1;
            break L2;
          } else {
            stackOut_6_0 = stackIn_6_0;
            stackOut_6_1 = 1;
            stackIn_8_0 = stackOut_6_0;
            stackIn_8_1 = stackOut_6_1;
            break L2;
          }
        }
        L3: {
          if (stackIn_8_0 == stackIn_8_1) {
            break L3;
          } else {
            kh.a(param3 * var18 + var10, var11 - var19, param1 << 728090657, 15, rn.field_j);
            break L3;
          }
        }
        L4: {
          if (5.656854249492381 * var14 - 11.313708498984761 * var16 >= 0.0) {
            stackOut_12_0 = 0;
            stackIn_13_0 = stackOut_12_0;
            break L4;
          } else {
            stackOut_11_0 = 1;
            stackIn_13_0 = stackOut_11_0;
            break L4;
          }
        }
        L5: {
          stackOut_13_0 = stackIn_13_0;
          stackIn_15_0 = stackOut_13_0;
          stackIn_14_0 = stackOut_13_0;
          if (param0) {
            stackOut_15_0 = stackIn_15_0;
            stackOut_15_1 = 0;
            stackIn_16_0 = stackOut_15_0;
            stackIn_16_1 = stackOut_15_1;
            break L5;
          } else {
            stackOut_14_0 = stackIn_14_0;
            stackOut_14_1 = 1;
            stackIn_16_0 = stackOut_14_0;
            stackIn_16_1 = stackOut_14_1;
            break L5;
          }
        }
        L6: {
          if (stackIn_16_0 == stackIn_16_1) {
            break L6;
          } else {
            kh.a(var10 + param3 * var18, var11 - -var19, param1 << 269794305, 15, rn.field_j);
            break L6;
          }
        }
    }

    final static void i(int param0) {
        int var1 = 0;
        int var2 = 0;
        var2 = CrazyCrystals.field_B;
        sc.field_i[0].a((byte) -123);
        sc.field_i[0] = null;
        sc.field_i[1].a((byte) -65);
        sc.field_i[1] = null;
        ga.field_B.a((byte) -127);
        ga.field_B = null;
        ua.field_a.a((byte) -113);
        ua.field_a = null;
        cb.field_n.a((byte) -84);
        cb.field_n = null;
        tm.field_f.a((byte) -74);
        tm.field_f = null;
        var1 = 0;
        L0: while (true) {
          if (var1 >= 4) {
            if (param0 >= 126) {
              si.field_e.a((byte) -93);
              si.field_e = null;
              td.field_e.a((byte) -87);
              td.field_e = null;
              bc.field_a.a((byte) -82);
              bc.field_a = null;
              dn.field_d.a((byte) -87);
              dn.field_d = null;
              wp.field_b.a((byte) -91);
              wp.field_b = null;
              bn.field_h.a((byte) -91);
              bn.field_h = null;
              pm.field_b.a((byte) -87);
              pm.field_b = null;
              so.field_g.a((byte) -118);
              so.field_g = null;
              fn.field_h.a((byte) -75);
              fn.field_h = null;
              dd.field_c.a((byte) -17);
              dd.field_c = null;
              cn.field_e.a((byte) -64);
              cn.field_e = null;
              jj.field_c.a((byte) -30);
              jj.field_c = null;
              m.field_n.a((byte) -32);
              m.field_n = null;
              a.field_d.a((byte) -14);
              a.field_d = null;
              rb.field_g.a((byte) -75);
              rb.field_g = null;
              ln.field_f.a((byte) -29);
              ln.field_f = null;
              oj.field_E.a((byte) -42);
              oj.field_E = null;
              c.field_q.a((byte) -68);
              c.field_q = null;
              ck.field_db.a((byte) -86);
              vk.field_N.a((byte) -16);
              fp.field_c.a((byte) -84);
              aa.field_a.a((byte) -94);
              mn.b(false);
              return;
            } else {
              return;
            }
          } else {
            il.field_h[var1].a((byte) -112);
            il.field_h[var1] = null;
            var1++;
            continue L0;
          }
        }
    }

    final static void f(byte param0) {
        if (null != sp.field_a) {
            sp.field_a.i((byte) -45);
        }
        oh.field_d = new qk();
        jm.field_d.a((qm) (Object) oh.field_d, (byte) -50);
        if (param0 != -10) {
            field_F = null;
        }
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_t = "You have <%0> unread messages!";
        field_E = new int[16384];
    }
}
