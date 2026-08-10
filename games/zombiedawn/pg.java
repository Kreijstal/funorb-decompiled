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
        return vh.field_b + this.field_s;
    }

    final void a(byte param0) {
        int var2;
        int var3;
        int var4;
        L0: {
          var4 = ZombieDawn.field_J;
          og.g(0);
          if (param0 <= -35) {
            break L0;
          } else {
            this.field_m = -72;
            break L0;
          }
        }
        L1: {
          bi.f(5, 5, -5 + bd.field_e, -5 + nh.field_P);
          la.a(30);
          qk.a(6, -(2 * this.field_q) + 640, -11 + nh.field_P, 3 + (this.field_q + vh.field_b), false);
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
                    mo.field_a.b(640 + vh.field_b + -this.field_q, var3);
                    var3 += 128;
                    continue L3;
                  }
                }
              } else {
                lo.field_i.b(vh.field_b - -this.field_q, var3);
                var3 += 130;
                continue L2;
              }
            }
          } else {
            lo.field_i.b(this.field_q + vh.field_b, 136);
            lo.field_i.b(this.field_q + vh.field_b, 6);
            mo.field_a.b(640 + (vh.field_b - this.field_q), 6);
            mo.field_a.b(-this.field_q + vh.field_b - -640, 134);
            break L1;
          }
        }
        bi.c();
        ql.field_g.b(vh.field_b, id.field_M / 2);
        super.a((byte) -112);
    }

    final void d(byte param0) {
        int var2;
        int var3;
        int[] var4;
        int var5;
        String var6;
        int var7;
        int var8;
        int var9;
        String var10;
        int[] var11;
        int[] var12;
        int[] stackIn_5_0 = null;
        var9 = ZombieDawn.field_J;
        this.field_m = 0;
        var2 = 0;
        var3 = -77 / ((14 - param0) / 54);
        L0: while (true) {
          if (var2 >= 2) {
            L1: {
              this.field_s = 320 - (this.field_m >> 1066342401);
              this.field_q = this.field_s - 20;
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
                stackIn_5_0 = jj.c(1, 122).field_h;
                break L2;
              } else {
                stackIn_5_0 = jj.c(14, 73).field_h;
                break L2;
              }
            }
            var12 = stackIn_5_0;
            var11 = var12;
            var4 = var11;
            var5 = 0;
            L3: while (true) {
              if (var12.length <= var5) {
                var2++;
                continue L0;
              } else {
                L4: {
                  var10 = vk.field_b[var12[var5]];
                  var7 = sg.field_jb.b(var10);
                  if ((var12[var5] ^ -1) != -38) {
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
                    if ((var12[var5] ^ -1) == -13) {
                      break L6;
                    } else {
                      if (var12[var5] == 13) {
                        break L6;
                      } else {
                        break L5;
                      }
                    }
                  }
                  var7 += 140;
                  break L5;
                }
                if (var7 > this.field_m) {
                  this.field_m = var7;
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
            RuntimeException stackIn_11_0 = null;
            StringBuilder stackIn_11_1 = null;
            RuntimeException stackIn_12_0 = null;
            StringBuilder stackIn_12_1 = null;
            String stackIn_12_2 = null;
            StringBuilder stackIn_14_1 = null;
            StringBuilder stackIn_15_1 = null;
            String stackIn_15_2 = null;
            StringBuilder stackIn_17_1 = null;
            StringBuilder stackIn_18_1 = null;
            String stackIn_18_2 = null;
            Throwable decompiledCaughtException = null;
            Throwable var6 = null;
            RuntimeException var6_ref = null;
            String var7 = null;
            String var8 = null;
            String var9 = null;
            try {
              L0: {
                try {
                  L1: {
                    L2: {
                      if (param0) {
                        break L2;
                      } else {
                        pg.d(68);
                        break L2;
                      }
                    }
                    L3: {
                      var8 = param1.getParameter("cookiehost");
                      var7 = var8;
                      var7 = var8;
                      var9 = param3 + "=" + param4 + "; version=1; path=/; domain=" + var8;
                      var7 = var9;
                      var7 = var9;
                      if (0L > param2) {
                        var7 = var9 + "; Discard;";
                        break L3;
                      } else {
                        var7 = var9 + "; Expires=" + jb.a(2147483647, pd.a(-22826) + param2 * 1000L) + "; Max-Age=" + param2;
                        break L3;
                      }
                    }
                    qe.a("document.cookie=\"" + var7 + "\"", param1, (byte) 125);
                    break L1;
                  }
                } catch (java.lang.Throwable decompiledCaughtParameter0) {
                  decompiledCaughtException = decompiledCaughtParameter0;
                  L4: {
                    var6 = decompiledCaughtException;
                    break L4;
                  }
                }
                break L0;
              }
            } catch (java.lang.RuntimeException decompiledCaughtParameter1) {
              decompiledCaughtException = decompiledCaughtParameter1;
              L5: {
                var6_ref = (RuntimeException) (Object) decompiledCaughtException;
                stackIn_11_0 = (RuntimeException) (var6_ref);

                stackIn_11_1 = new StringBuilder().append("pg.C(").append(param0).append(',');

                if (param1 == null) {
                  stackIn_12_0 = (RuntimeException) ((Object) stackIn_11_0);
                  stackIn_12_1 = (StringBuilder) ((Object) stackIn_11_1);
                  stackIn_12_2 = "null";
                  break L5;
                } else {
                  stackIn_12_0 = (RuntimeException) ((Object) stackIn_11_0);
                  stackIn_12_1 = (StringBuilder) ((Object) stackIn_11_1);
                  stackIn_12_2 = "{...}";
                  break L5;
                }
              }
              L6: {


                stackIn_14_1 = ((StringBuilder) (Object) stackIn_12_1).append(stackIn_12_2).append(',').append(param2).append(',');

                if (param3 == null) {
                  stackIn_12_0 = (RuntimeException) ((Object) stackIn_12_0);
                  stackIn_15_1 = (StringBuilder) ((Object) stackIn_14_1);
                  stackIn_15_2 = "null";
                  break L6;
                } else {
                  stackIn_12_0 = (RuntimeException) ((Object) stackIn_12_0);
                  stackIn_15_1 = (StringBuilder) ((Object) stackIn_14_1);
                  stackIn_15_2 = "{...}";
                  break L6;
                }
              }
              L7: {


                stackIn_17_1 = ((StringBuilder) (Object) stackIn_15_1).append(stackIn_15_2).append(',');

                if (param4 == null) {
                  stackIn_12_0 = (RuntimeException) ((Object) stackIn_12_0);
                  stackIn_18_1 = (StringBuilder) ((Object) stackIn_17_1);
                  stackIn_18_2 = "null";
                  break L7;
                } else {
                  stackIn_12_0 = (RuntimeException) ((Object) stackIn_12_0);
                  stackIn_18_1 = (StringBuilder) ((Object) stackIn_17_1);
                  stackIn_18_2 = "{...}";
                  break L7;
                }
              }
              throw sh.a((Throwable) ((Object) stackIn_12_0), stackIn_18_2 + ')');
            }
        } catch (RuntimeException | Error decompiledUncheckedException) {
            throw decompiledUncheckedException;
        } catch (Throwable decompiledCheckedException) {
            throw new RuntimeException(decompiledCheckedException);
        }
    }

    final static void a(java.awt.Component param0, byte param1) {
        try {
            param0.addMouseListener(ng.field_b);
            param0.addMouseMotionListener(ng.field_b);
            param0.addFocusListener(ng.field_b);
            if (param1 != 66) {
                field_n = (String) null;
            }
        } catch (RuntimeException runtimeException) {
            throw sh.a((Throwable) ((Object) runtimeException), "pg.D(" + (param0 != null ? "{...}" : "null") + ',' + param1 + ')');
        }
    }

    public static void d(int param0) {
        if (param0 != -5) {
            String var2 = (String) null;
            pg.a(true, (java.applet.Applet) null, 14L, (String) null, (String) null);
        }
        field_r = null;
        field_t = null;
        field_n = null;
    }

    final int a(boolean param0, int param1) {
        if (!param0) {
            this.field_m = -123;
        }
        return this.field_m + (this.field_s + vh.field_b);
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
        field_n = "Retry (<%0> Left)";
        field_r = "Names should contain a maximum of 12 characters";
    }
}
