/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class pg extends al {
    static vn field_t;
    static String field_n;
    private int field_s;
    static int field_p;
    private int field_q;
    static int field_o;
    static String field_r;
    private int field_m;

    final int c(int param0, int param1) {
        if (param1 != 6) {
            return -32;
        }
        return vh.field_b + ((pg) this).field_s;
    }

    final void a(byte param0) {
        int var2 = 0;
        int var3 = 0;
        int var4 = 0;
        L0: {
          var4 = ZombieDawn.field_J;
          og.g(0);
          if (param0 <= -35) {
            break L0;
          } else {
            ((pg) this).field_m = -72;
            break L0;
          }
        }
        L1: {
          bi.f(5, 5, -5 + bd.field_e, -5 + nh.field_P);
          la.a(30);
          qk.a(6, -(2 * ((pg) this).field_q) + 640, -11 + nh.field_P, 3 + (((pg) this).field_q + vh.field_b), false);
          la.field_d.b((byte) -55);
          if (nh.field_P != 480) {
            var2 = -5 + nh.field_P;
            var3 = 6;
            L2: while (true) {
              if (var3 >= var2) {
                var3 = 6;
                L3: while (true) {
                  if (var3 >= var2) {
                    break L1;
                  } else {
                    mo.field_a.b(640 + vh.field_b + -((pg) this).field_q, var3);
                    var3 += 128;
                    continue L3;
                  }
                }
              } else {
                lo.field_i.b(vh.field_b - -((pg) this).field_q, var3);
                var3 += 130;
                continue L2;
              }
            }
          } else {
            lo.field_i.b(((pg) this).field_q + vh.field_b, 136);
            lo.field_i.b(((pg) this).field_q + vh.field_b, 6);
            mo.field_a.b(640 + (vh.field_b - ((pg) this).field_q), 6);
            mo.field_a.b(-((pg) this).field_q + vh.field_b - -640, 134);
            break L1;
          }
        }
        bi.c();
        ql.field_g.b(vh.field_b, id.field_M / 2);
        super.a((byte) -112);
    }

    final void d(byte param0) {
        int var2 = 0;
        int var3 = 0;
        int[] var4 = null;
        int var5 = 0;
        String var6 = null;
        int var7 = 0;
        int var8 = 0;
        int var9 = 0;
        String var10 = null;
        int[] var11 = null;
        int[] var12 = null;
        int[] var13 = null;
        int[] var14 = null;
        int[] stackIn_5_0 = null;
        int[] stackOut_4_0 = null;
        int[] stackOut_3_0 = null;
        var9 = ZombieDawn.field_J;
        ((pg) this).field_m = 0;
        var2 = 0;
        var3 = -77 / ((14 - param0) / 54);
        L0: while (true) {
          if (var2 >= 2) {
            L1: {
              ((pg) this).field_s = 320 - (((pg) this).field_m >> 1066342401);
              ((pg) this).field_q = ((pg) this).field_s - 20;
              if (null == la.field_d) {
                la.field_d = new uh(true);
                break L1;
              } else {
                break L1;
              }
            }
            return;
          } else {
            L2: {
              if (var2 == 0) {
                stackOut_4_0 = jj.c(1, 122).field_h;
                stackIn_5_0 = stackOut_4_0;
                break L2;
              } else {
                stackOut_3_0 = jj.c(14, 73).field_h;
                stackIn_5_0 = stackOut_3_0;
                break L2;
              }
            }
            var14 = stackIn_5_0;
            var13 = var14;
            var12 = var13;
            var11 = var12;
            var4 = var11;
            var5 = 0;
            L3: while (true) {
              if (var14.length <= var5) {
                var2++;
                continue L0;
              } else {
                L4: {
                  var10 = vk.field_b[var14[var5]];
                  var7 = sg.field_jb.b(var10);
                  if ((var14[var5] ^ -1) != -38) {
                    break L4;
                  } else {
                    var8 = sg.field_jb.b(wl.field_a[1]);
                    if (var7 >= var8) {
                      break L4;
                    } else {
                      var6 = wl.field_a[1];
                      var7 = var8;
                      break L4;
                    }
                  }
                }
                L5: {
                  L6: {
                    if ((var14[var5] ^ -1) == -13) {
                      break L6;
                    } else {
                      if (var14[var5] == 13) {
                        break L6;
                      } else {
                        break L5;
                      }
                    }
                  }
                  var7 += 140;
                  break L5;
                }
                if (var7 > ((pg) this).field_m) {
                  ((pg) this).field_m = var7;
                  var5++;
                  continue L3;
                } else {
                  var5++;
                  continue L3;
                }
              }
            }
          }
        }
    }

    pg(int param0, boolean param1, int param2, int param3, int param4, int param5, int[] param6) {
        super(param0, param1, param2, param3, param4, param5, param6);
    }

    final void a(byte param0, boolean param1) {
        super.a((byte) 95, param1);
        la.field_d.a(ei.field_K, ha.field_b, true);
        int var3 = 87 % ((-39 - param0) / 61);
    }

    final static void a(boolean param0, java.applet.Applet param1, long param2, String param3, String param4) {
        try {
            Throwable var6 = null;
            String var7 = null;
            String var8 = null;
            String var9 = null;
            Throwable decompiledCaughtException = null;
            try {
              L0: {
                L1: {
                  if (param0) {
                    break L1;
                  } else {
                    pg.d(68);
                    break L1;
                  }
                }
                L2: {
                  var8 = param1.getParameter("cookiehost");
                  var7 = var8;
                  var7 = var8;
                  var9 = param3 + "=" + param4 + "; version=1; path=/; domain=" + var8;
                  var7 = var9;
                  var7 = var9;
                  if (0L > param2) {
                    var7 = var9 + "; Discard;";
                    break L2;
                  } else {
                    var7 = var9 + "; Expires=" + jb.a(2147483647, pd.a(-22826) + param2 * 1000L) + "; Max-Age=" + param2;
                    break L2;
                  }
                }
                qe.a("document.cookie=\"" + var7 + "\"", param1, (byte) 125);
                break L0;
              }
            } catch (java.lang.Throwable decompiledCaughtParameter0) {
              decompiledCaughtException = decompiledCaughtParameter0;
              L3: {
                var6 = decompiledCaughtException;
                break L3;
              }
            }
        } catch (RuntimeException | Error decompiledUncheckedException) {
            throw decompiledUncheckedException;
        } catch (Throwable decompiledCheckedException) {
            throw new RuntimeException(decompiledCheckedException);
        }
    }

    final static void a(java.awt.Component param0, byte param1) {
        param0.addMouseListener((java.awt.event.MouseListener) (Object) ng.field_b);
        param0.addMouseMotionListener((java.awt.event.MouseMotionListener) (Object) ng.field_b);
        param0.addFocusListener((java.awt.event.FocusListener) (Object) ng.field_b);
        if (param1 != 66) {
            field_n = null;
        }
    }

    public static void d(int param0) {
        if (param0 != -5) {
            Object var2 = null;
            pg.a(true, (java.applet.Applet) null, 14L, (String) null, (String) null);
        }
        field_r = null;
        field_t = null;
        field_n = null;
    }

    final int a(boolean param0, int param1) {
        if (!param0) {
            ((pg) this).field_m = -123;
        }
        return ((pg) this).field_m + (((pg) this).field_s + vh.field_b);
    }

    final static void c(int param0) {
        re.a((byte) -71);
        if (null != cj.field_d) {
            fa.a((byte) -46, cj.field_d);
        }
        fc.o((byte) -101);
        jo.x(-2);
        hg.c(param0 ^ 1);
        if (!(!lb.m(-83))) {
            dp.field_e.j(11, 1);
            vl.a((byte) -46, 0);
        }
        p.a(param0);
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_n = "Retry (<%0> Left)";
        field_r = "Names should contain a maximum of 12 characters";
    }
}
