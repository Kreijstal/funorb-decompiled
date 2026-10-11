/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class cv {
    static String field_v;
    private cq field_d;
    private iq field_p;
    private int field_a;
    static String field_r;
    private iq field_c;
    static String field_q;
    static Boolean field_s;
    static String field_n;
    private cq field_b;
    static String field_m;
    private bg field_i;
    private cq field_u;
    private iq field_f;
    static String field_k;
    private int field_l;
    private iq field_t;
    private iq field_j;
    private iq field_h;
    private iq field_o;
    private pr field_e;
    private bg field_g;

    final void e(byte param0) {
        int var3 = 0;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var2 = null;
        var3 = ArmiesOfGielinor.field_M ? 1 : 0;
        try {
          if (param0 <= 13) {
            this.field_t = (iq) null;
          }
          if (this.field_a != 1) {
            if (this.field_a != 0) {
              if (this.field_a == 2) {
                this.e(-25752);
                this.a((byte) 88);
                if (var3 == 0) {
                  return;
                }
              }
              if (this.field_a != 3) {
                return;
              }
              this.e(-25752);
              this.d(26);
              if (var3 == 0) {
                return;
              }
            }
            this.h(396);
            if (var3 == 0) {
              return;
            }
          }
          this.e(-25752);
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2 = decompiledCaughtException;
          throw ig.a((Throwable) ((Object) var2), "cv.N(" + param0 + ')');
        }
    }

    private final void f(int param0) {
        RuntimeException runtimeException = null;
        sl var2 = null;
        om var3 = null;
        int var4 = 0;
        int var5 = 0;
        RuntimeException decompiledCaughtException = null;
        try {
          var2 = ku.j(124);
          var3 = ar.a(var2.field_g, var2.field_e, 0);
          ts.a(var3, -1, var2);
          var4 = var3.field_w;
          var5 = rd.field_j.field_xb.field_mb[var4];
          if (~var5 < param0) {
            vo.a(false, 1, var5, var3);
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          runtimeException = decompiledCaughtException;
          throw ig.a((Throwable) ((Object) runtimeException), "cv.FA(" + param0 + ')');
        }
    }

    final void a(int param0, byte param1, int param2) {
        RuntimeException runtimeException = null;
        cq var4 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          var4 = this.a(321, param0);
          if (param1 != 33) {
            this.field_i = (bg) null;
          }
          if (null != var4) {
            if (var4.field_A > param2 &&
              1 != param2) {
              return;
            }
            var4.field_r = ir.a(10602, param2);
            var4.field_A = param2;
            return;
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          runtimeException = decompiledCaughtException;
          throw ig.a((Throwable) ((Object) runtimeException), "cv.E(" + param0 + ',' + param1 + ',' + param2 + ')');
        }
    }

    final void a(boolean param0) {
        RuntimeException decompiledCaughtException = null;
        RuntimeException var2 = null;
        try {
          if (param0) {
            this.field_o = (iq) null;
          }
          this.field_g = new bg(32);
          this.a(0, (byte) 42);
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2 = decompiledCaughtException;
          throw ig.a((Throwable) ((Object) var2), "cv.CA(" + param0 + ')');
        }
    }

    final void c(byte param0) {
        RuntimeException decompiledCaughtException = null;
        int var2_int = 0;
        RuntimeException var2 = null;
        String var3 = null;
        int var4 = 0;
        var4 = ArmiesOfGielinor.field_M ? 1 : 0;
        try {
          ef.b(-1);
          if (rd.field_j != null) {
            rd.field_j.A(111);
          }
          if (null != bc.field_a) {
            bc.field_a.A(111);
          }
          rd.field_j = null;
          bc.field_a = null;
          System.gc();
          vk.field_e[0] = new wk(vc.field_m.a("campaign_1.jpg", -105, ""), (java.awt.Component) ((Object) ll.p(0)));
          vk.field_e[1] = new wk(vc.field_m.a("campaign_2.jpg", 13, ""), (java.awt.Component) ((Object) ll.p(0)));
          vk.field_e[2] = new wk(vc.field_m.a("campaign_3.jpg", -91, ""), (java.awt.Component) ((Object) ll.p(0)));
          mu.field_g = new ru[3][3];
          var2_int = 0;
          while (3 > var2_int) {
            var3 = "campaign_map" + (var2_int + 1);
            mu.field_g[var2_int][0] = pv.a("campaign", var3, iw.field_l, 24914);
            mu.field_g[var2_int][1] = pv.a("campaign", var3 + "_areas", iw.field_l, 24914);
            mu.field_g[var2_int][2] = pv.a("campaign", var3 + "_full", iw.field_l, 24914);
            var2_int++;
            if (var4 != 0) {
              return;
            }
          }
          if (param0 > -62) {
            cv.d((byte) -46);
          }
          pl.field_D = new wk[3];
          pl.field_D[0] = nh.a("takenicon_zamorak", "campaign", iw.field_l, false);
          pl.field_D[1] = nh.a("takenicon_saradomin", "campaign", iw.field_l, false);
          pl.field_D[2] = nh.a("takenicon_guthix", "campaign", iw.field_l, false);
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2 = decompiledCaughtException;
          throw ig.a((Throwable) ((Object) var2), "cv.F(" + param0 + ')');
        }
    }

    final void a(int param0) {
        RuntimeException runtimeException = null;
        int var2_int = 0;
        int var3 = 0;
        RuntimeException decompiledCaughtException = null;
        var3 = ArmiesOfGielinor.field_M ? 1 : 0;
        try {
          var2_int = 0;
          while (var2_int < 3) {
            vk.field_e[var2_int] = null;
            var2_int++;
            if (var3 != 0) {
              return;
            }
          }
          if (param0 < 119) {
            this.b(4, 127);
          }
          mu.field_g = (ru[][]) null;
          pl.field_D = null;
          System.gc();
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          runtimeException = decompiledCaughtException;
          throw ig.a((Throwable) ((Object) runtimeException), "cv.EA(" + param0 + ')');
        }
    }

    private final void a(byte param0) {
        RuntimeException runtimeException = null;
        sl var2 = null;
        om var3 = null;
        int var4 = 0;
        String var5 = null;
        String var6 = null;
        int var7 = 0;
        int var8 = 0;
        int var9 = 0;
        int var10 = 0;
        int var11 = 0;
        int var12 = 0;
        int var13 = 0;
        int var14 = 0;
        int var15 = 0;
        int var16 = 0;
        RuntimeException decompiledCaughtException = null;
        int var8Lifetime1;
        int var9Lifetime1;
        try {
          var2 = ku.j(111);
          var3 = ar.a(var2.field_g, var2.field_e, 0);
          var4 = ha.a(var3.field_B.length, var2.field_c, false);
          var5 = fo.a(4800, wd.field_e, new String[]{var3.field_J, Integer.toString(var4)});
          var6 = fo.a(4800, hi.field_h, new String[]{var5});
          if (this.field_h == null) {
            var7 = 164;
            var8 = nr.field_e.a(qf.field_c) / 2 + 26;
            if (var7 < var8) {
              var7 = var8;
            }
            var9 = 26 + nr.field_e.a(lb.field_c) / 2;
            if (var7 < var9) {
              var7 = var9;
            }
            if (ArmiesOfGielinor.field_M) {
              var7 = this.field_h.field_i;
            }
          } else {
            var7 = this.field_h.field_i;
          }
          var8Lifetime1 = 26 + var7;
          var9Lifetime1 = rs.field_n.a(var6, var8Lifetime1, 0);
          var10 = 60 + (30 + (var9Lifetime1 + 14) + 40 + 10);
          var11 = -(var8Lifetime1 / 2) + 320;
          var12 = -(var10 / 2) + 240;
          var13 = 13 + var11;
          fe.b(db.a(true, var11), u.a(var12, (byte) 94), var8Lifetime1, var10, io.field_m, ci.field_e, 0, 192);
          var14 = -26 + var8Lifetime1;
          var15 = var13;
          var16 = var12 + 30;
          if (param0 < 9) {
            field_s = (Boolean) null;
          }
          fe.a(this.field_b.field_w, db.a(true, var8Lifetime1 / 2 + var11), u.a(var16, (byte) 94), var8Lifetime1 - 20, nd.field_b, true, 40, 1);
          var16 += 14;
          rs.field_n.a(var6, db.a(true, var15), u.a(var16, (byte) 94), var14, var10, 16777215, 1, 1, 0, 0);
          var16 = var16 + (var9Lifetime1 + 30);
          if (this.field_h == null) {
            this.field_h = new iq(qf.field_c, var15, var16, var7);
          }
          this.field_h.a(0);
          var16 += 40;
          if (null == this.field_f) {
            this.field_f = new iq(lb.field_c, var15, var16, var7);
          }
          this.field_f.a(0);
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          runtimeException = decompiledCaughtException;
          throw ig.a((Throwable) ((Object) runtimeException), "cv.A(" + param0 + ')');
        }
    }

    private final void h(int param0) {
        String stackIn_8_0 = null;
        int stackIn_11_0;
        int stackIn_11_1;
        int stackIn_11_2;
        int stackIn_11_3;
        wk[] stackIn_11_4;
        int[] stackIn_12_5 = null;
        boolean stackIn_31_0 = false;
        int stackIn_43_0 = 0;
        int stackIn_53_0 = 0;
        RuntimeException decompiledCaughtException = null;
        boolean stackOut_30_0;
        Object var2 = null;
        String var3 = null;
        cq var3_ref = null;
        int var4 = 0;
        int var5 = 0;
        int var6 = 0;
        int var7 = 0;
        int var8 = 0;
        int var4Lifetime1;
        var8 = ArmiesOfGielinor.field_M ? 1 : 0;
        try {
          fe.a(db.a(true, 32), u.a(71, (byte) 94), 305, 228, io.field_m, jh.field_k, 0, 128, ai.field_V, true, nd.field_b);
          fe.a(db.a(true, 32), u.a(321, (byte) 94), 305, 92, io.field_m, jh.field_k, 0, 128, be.field_A, true, nd.field_b);
          if (null != this.field_d) {
            if (this.field_d.field_k == -1) {
              stackIn_8_0 = be.field_A;
            } else {
              stackIn_8_0 = this.field_d.field_w;
            }
            var2 = stackIn_8_0;
            fe.a(db.a(true, 346), u.a(70, (byte) 94), 262, 343, io.field_m, jh.field_k, 0, 128, (String) (var2), true, nd.field_b);
            stackIn_11_0 = db.a(true, 354);
            stackIn_11_1 = u.a(361, (byte) 94);
            stackIn_11_2 = 246;
            stackIn_11_3 = 41;
            stackIn_11_4 = il.field_s;
            if (!wg.a(-33, db.a(true, 354), db.a(true, 354) + 246, u.a(361, (byte) 94), u.a(361, (byte) 94) + 41)) {
              stackIn_12_5 = nd.field_b;
            } else {
              stackIn_12_5 = ci.field_e;
            }
            fe.a(stackIn_11_0, stackIn_11_1, stackIn_11_2, stackIn_11_3, stackIn_11_4, stackIn_12_5, 0, 0);
            var3 = io.field_o;
            if (this.field_d.field_k == -1) {
              var3 = es.field_b;
            }
            fe.c(var3, db.a(true, 477), u.a(396, (byte) 94), 0, true);
            var4 = db.a(true, 359);
            var5 = u.a(85, (byte) 94);
            id.a(var4, var4 + 236, var5 + 200, var5, (byte) 83);
            boolean decompiledSharedTail0 = (this.field_d == null ||
              this.field_d.field_k != -1);
            if (!decompiledSharedTail0) {
              this.field_d.field_m.f(-(this.field_d.field_m.field_y / 2) + (var4 + 118), var5);
              decompiledSharedTail0 = (var8 != 0);
            }
            if (decompiledSharedTail0) {
              vk.field_e[this.field_d.field_k].g(var4, var5);
              this.field_d.field_m.f(var4, var5, Math.abs(g.a(param0 ^ -397, uk.field_n << 5) * 100 >> 16) + 80);
            }
            rf.b(param0 ^ -18466);
            var6 = 5;
            var7 = 5 + rs.field_n.a(this.field_d.field_q, 232, 0);
            en.field_E.a(this.field_d.field_q, var4 + var6, 200 + var5, -(2 * var6) + 236, var7, 16777215, -1, 1, 0, 0);
          }
          if (param0 != 396) {
            return;
          }
          var2 = null;
          var3_ref = (cq) (this.field_g.b(param0 ^ 397));
          L7: while (true) {
            if (null != var3_ref) {
              stackOut_30_0 = var3_ref.field_l;
              stackIn_53_0 = stackOut_30_0 ? 1 : 0;
              stackIn_31_0 = stackOut_30_0;
              if (var8 == 0) {
                boolean decompiledFrameRemainder0 = true;
                if (stackIn_31_0 && (var3_ref.a(sm.field_d, ko.field_b, param0 - 275) ||
                  var3_ref == this.field_d)) {
                  stackIn_43_0 = 1;
                  decompiledFrameRemainder0 = false;
                }
                else {
                  stackIn_43_0 = 0;
                }
                var4Lifetime1 = stackIn_43_0;
                this.a((byte) 13, false, var3_ref, var4Lifetime1 != 0);
                if (var4Lifetime1 != 0) {
                  var2 = var3_ref;
                }
                var3_ref = (cq) (this.field_g.b((byte) 101));
                continue;
              }
            } else {
              if (this.field_u == var2) {
                break L7;
              }
              if (null == var2) {
                break L7;
              }
              stackIn_53_0 = 55;
            }
            ub.$cfr$intArgs$a$6d836999ad61(stackIn_53_0, im.field_v[1]);
            break;
          }
          this.field_u = (cq) (var2);
          fe.a(og.field_u, db.a(true, 320), u.a(30, (byte) 94), nd.field_b, 1, false);
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2 = decompiledCaughtException;
          throw ig.a((Throwable) (var2), "cv.M(" + param0 + ')');
        }
    }

    public static void d(byte param0) {
        RuntimeException decompiledCaughtException = null;
        RuntimeException var1 = null;
        try {
          field_s = null;
          field_v = null;
          field_r = null;
          field_m = null;
          field_n = null;
          field_q = null;
          if (param0 != 44) {
            field_q = (String) null;
          }
          field_k = null;
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var1 = decompiledCaughtException;
          throw ig.a((Throwable) ((Object) var1), "cv.U(" + param0 + ')');
        }
    }

    private final void a(byte param0, boolean param1, cq param2, boolean param3) {
        int stackIn_5_0 = 0;
        int stackIn_17_0;
        int stackIn_17_1;
        int stackIn_17_2;
        int stackIn_17_3;
        wk[] stackIn_17_4;
        int[] stackIn_18_5 = null;
        RuntimeException stackIn_26_0 = null;
        StringBuilder stackIn_26_1 = null;
        String stackIn_27_2 = null;
        RuntimeException decompiledCaughtException = null;
        int var5_int = 0;
        RuntimeException var5 = null;
        int var6 = 0;
        int var7 = 0;
        int var8 = 0;
        int var9 = 0;
        int var10 = 0;
        int var11 = 0;
        int var9Lifetime1;
        try {
          var5_int = db.a(true, -15 + param2.field_y);
          var6 = u.a(19 + param2.field_x, (byte) 94);
          id.a(db.a(true, param2.field_y), db.a(true, param2.field_B + param2.field_y), u.a(param2.field_x + param2.field_o, (byte) 94), u.a(param2.field_x, (byte) 94), (byte) 125);
          var7 = 54;
          var8 = 128;
          var9 = -1;
          if (!param2.field_l) {
            var8 = 48;
            stackIn_5_0 = (param2.field_k == 2) ? 2 : 0;
            var9Lifetime1 = stackIn_5_0 + 1;
            if (ArmiesOfGielinor.field_M) {
              if (param3) {
                var8 = (int)(Math.sin((double)uk.field_n / 3.141592653589793 / 6.0) * 20.0 + 235.0);
              }
              var9Lifetime1 = 1 + param2.field_D;
            }
          } else {
            if (param3) {
              var8 = (int)(Math.sin((double)uk.field_n / 3.141592653589793 / 6.0) * 20.0 + 235.0);
            }
            var9Lifetime1 = 1 + param2.field_D;
          }
          hr.field_d[var9Lifetime1].g(var5_int, var6, var8);
          gt.field_c[var9Lifetime1].g(-12 + var5_int, var6 - 18, var8);
          if (param0 != 13) {
            field_n = (String) null;
          }
          rf.b(param0 - 18875);
          stackIn_17_0 = db.a(true, param2.field_y);
          stackIn_17_1 = u.a(param2.field_x, (byte) 94);
          stackIn_17_2 = param2.field_B;
          stackIn_17_3 = param2.field_o;
          stackIn_17_4 = tb.field_j;
          if (param3) {
            stackIn_18_5 = nd.field_b;
          } else {
            stackIn_18_5 = jh.field_k;
          }
          fe.b(stackIn_17_0, stackIn_17_1, stackIn_17_2, stackIn_17_3, stackIn_17_4, stackIn_18_5, 0, 0);
          if (null != param2.field_w) {
            var10 = db.a(true, param2.field_y + var7);
            var11 = param2.field_o / 2 + param2.field_x + rs.field_n.field_v;
            fe.a(param2.field_w, var10, u.a(8 + (param2.field_x + param2.field_o / 2), (byte) 94), true);
            fe.a(param2.field_w, var10, u.a(param2.field_o / 2 + param2.field_x + 8, (byte) 94), nd.field_b, true);
            rs.field_n.b(param2.field_r, var10, u.a(var11, (byte) 94), 12303291, 1);
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var5 = decompiledCaughtException;
          stackIn_26_0 = var5;
          stackIn_26_1 = new StringBuilder().append("cv.Q(").append(param0).append(',').append(param1).append(',');
          if (param2 == null) {
            stackIn_27_2 = "null";
          } else {
            stackIn_27_2 = "{...}";
          }
          throw ig.a((Throwable) ((Object) stackIn_26_0), ((StringBuilder) (Object) stackIn_26_1).append(stackIn_27_2).append(',').append(param3).append(')').toString());
        }
    }

    final static void a(kl param0, int param1, int param2) {
        RuntimeException runtimeException = null;
        int var3_int = 0;
        RuntimeException stackIn_10_0 = null;
        StringBuilder stackIn_10_1 = null;
        String stackIn_11_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          var3_int = 12 % ((param2 + 16) / 40);
          if (0 == param1) {
            nu.a(23948, param0, 0);
            if (!ArmiesOfGielinor.field_M) {
              return;
            }
          }
          nu.a(23948, param0, 1);
          nu.a(23948, param0, 2);
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          runtimeException = decompiledCaughtException;
          stackIn_10_0 = runtimeException;
          stackIn_10_1 = new StringBuilder().append("cv.G(");
          if (param0 == null) {
            stackIn_11_2 = "null";
          } else {
            stackIn_11_2 = "{...}";
          }
          throw ig.a((Throwable) ((Object) stackIn_10_0), ((StringBuilder) (Object) stackIn_10_1).append(stackIn_11_2).append(',').append(param1).append(',').append(param2).append(')').toString());
        }
    }

    private final void a(int param0, boolean param1, boolean param2, cq param3, boolean param4) {
        RuntimeException stackIn_90_0 = null;
        StringBuilder stackIn_90_1 = null;
        String stackIn_91_2 = null;
        RuntimeException decompiledCaughtException = null;
        int var6_int = 0;
        at var6 = null;
        RuntimeException var6_ref = null;
        a var7 = null;
        int var7_int = 0;
        Object var8 = null;
        wk var9 = null;
        int var10 = 0;
        int var11 = 0;
        float var12 = 0.0f;
        int var13 = 0;
        var13 = ArmiesOfGielinor.field_M ? 1 : 0;
        try {
          var6_int = 36 / ((param0 + 78) / 43);
          if (this.field_b == param3 ||
            param4) {
            param3.field_t = param3.field_t + 20;
            if (var13 != 0) {
              param3.field_t = param3.field_t - 14;
            }
          } else {
            param3.field_t = param3.field_t - 14;
          }
          if (param3.field_m == null) {
            param3.field_m = this.field_e.a(param3.field_k, 3355443, (byte) -73, 0);
            var6 = this.field_e.a(param3.field_k, 1);
            if (null != var6) {
              var7 = (a) (var6.e((byte) 95));
              if (null != var7) {
                param3.field_y = var7.field_p;
                param3.field_x = var7.field_l;
              }
            }
          }
          if (param3.field_m != null) {
            if (null != param3.field_r) {
              L6: {
                L7: {
                  var6_int = 8421504;
                  var7_int = this.field_l;
                  switch (var7_int) {
                    case 1:
                      break;
                    default:
                      break L6;
                    case 2:
                      if (var13 == 0) {
                        break L7;
                      }
                    case 0:
                      var6_int = 8388608;
                      if (var13 == 0) {
                        break L6;
                      }
                      break;
                  }
                  var6_int = 10066380;
                  if (var13 == 0) {
                    break L6;
                  }
                }
                var6_int = 8573219;
              }
              fe.c(param3.field_m, db.a(true, 0), u.a(3, (byte) 94), param3.field_m.field_y, var6_int);
            }
            if (param4) {
              param3.field_m.f(db.a(true, 0), u.a(0, (byte) 94), 128);
            }
            if (param2) {
              if (null == param3.field_s) {
                param3.field_s = param3.field_m.g();
                param3.field_s.c(228, 130, 4);
              }
              param3.field_s.e(db.a(true, 0), u.a(0, (byte) 94), (ae.b(uk.field_n << 6, 100) >> 12) + 22);
            }
            if (!param2 ||
              var13 != 0) {
              param3.field_s = null;
            }
            if (param3.field_l) {
              var6 = this.field_e.a(param3.field_k, 1);
              if (var6 != null) {
                var7 = (a) (var6.e((byte) 120));
                if (null != var7) {
                  var8 = null;
                  var10 = param3.field_p.field_E;
                  if (param3.field_r != null) {
                    var10 = 0;
                    var9 = pl.field_D[this.field_l];
                  } else {
                    var8 = km.field_h[2];
                    var9 = param3.field_p.g(-1).field_h;
                  }
                  if (var8 == null &&
                    null == var9) {
                    return;
                  }
                  boolean decompiledFrameRemainder0 = true;
                  var11 = 0;
                  var12 = 1.0f;
                  if (null != param3.field_r) {
                    var12 = 0.8999999761581421f;
                    decompiledFrameRemainder0 = (var13 != 0);
                  }
                  if (decompiledFrameRemainder0) {
                    if (param3.field_t < 256) {
                      if (!(0 < param3.field_t)) {
                        param3.field_t = 0;
                        if (var13 != 0) {
                          param3.field_t = 256;
                        }
                      }
                    } else {
                      param3.field_t = 256;
                    }
                    if (param3.field_t < 164) {
                      if (param3.field_t > 32) {
                        var12 = 0.5f + 0.5f * (float)(-32 + param3.field_t) / 132.0f;
                        if (var13 != 0) {
                          var12 = 0.5f;
                          var12 = 1.0f;
                        }
                      } else {
                        var12 = 0.5f;
                        if (var13 != 0) {
                          var12 = 1.0f;
                        }
                      }
                    } else {
                      var12 = 1.0f;
                    }
                  }
                  this.a((wk) (var8), var11, var10, var7.field_l, var9, 1, var12, var7.field_p);
                }
              }
            }
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var6_ref = decompiledCaughtException;
          stackIn_90_0 = var6_ref;
          stackIn_90_1 = new StringBuilder().append("cv.J(").append(param0).append(',').append(param1).append(',').append(param2).append(',');
          if (param3 == null) {
            stackIn_91_2 = "null";
          } else {
            stackIn_91_2 = "{...}";
          }
          throw ig.a((Throwable) ((Object) stackIn_90_0), ((StringBuilder) (Object) stackIn_90_1).append(stackIn_91_2).append(',').append(param4).append(')').toString());
        }
    }

    private final void d(int param0) {
        RuntimeException runtimeException = null;
        sl var2 = null;
        om var3 = null;
        int var4 = 0;
        String var5 = null;
        int var6 = 0;
        int var7 = 0;
        int var8 = 0;
        int var9 = 0;
        int var10 = 0;
        int var11 = 0;
        int var12 = 0;
        int var13 = 0;
        int var14 = 0;
        int var15 = 0;
        RuntimeException decompiledCaughtException = null;
        int var7Lifetime1;
        int var8Lifetime1;
        int var9Lifetime1;
        try {
          var2 = ku.j(97);
          var3 = ar.a(var2.field_g, var2.field_e, param0 - 26);
          var4 = ha.a(var3.field_B.length, var2.field_c, false);
          var5 = fo.a(4800, sb.field_f, new String[]{Integer.toString(var4)});
          boolean decompiledSharedTail0 = (null == this.field_c);
          if (!decompiledSharedTail0) {
            var6 = this.field_c.field_i;
            decompiledSharedTail0 = (ArmiesOfGielinor.field_M);
          }
          if (decompiledSharedTail0) {
            var6 = 164;
            var7 = nr.field_e.a(kd.field_Y) / 2 + 26;
            if (var6 < var7) {
              var6 = var7;
            }
            var8 = 26 + nr.field_e.a(vh.field_r) / 2;
            if (var6 < var8) {
              var6 = var8;
            }
            var9 = 26 + nr.field_e.a(lb.field_c) / 2;
            if (var9 > var6) {
              var6 = var9;
            }
          }
          var7Lifetime1 = param0 + var6;
          var8Lifetime1 = rs.field_n.a(var5, var7Lifetime1, 0);
          var9Lifetime1 = 154 + (var8Lifetime1 + 40);
          var10 = -(var7Lifetime1 / 2) + 320;
          var11 = 240 - var9Lifetime1 / 2;
          var12 = var10 + 13;
          fe.b(db.a(true, var10), u.a(var11, (byte) 94), var7Lifetime1, var9Lifetime1, io.field_m, ci.field_e, 0, 192);
          var13 = var7Lifetime1 - 26;
          var14 = var12;
          var15 = 30 + var11;
          fe.a(this.field_b.field_w, db.a(true, var10 + var7Lifetime1 / 2), u.a(var15, (byte) 94), var7Lifetime1 - 20, nd.field_b, true, 40, 1);
          var15 += 14;
          rs.field_n.a(var5, db.a(true, var14), u.a(var15, (byte) 94), var13, var9Lifetime1, 16777215, 1, 1, 0, 0);
          var15 = var15 + (30 + var8Lifetime1);
          if (null == this.field_c) {
            this.field_c = new iq(kd.field_Y, var14, var15, var6);
          }
          this.field_c.a(param0 - 26);
          var15 += 40;
          if (null == this.field_j) {
            this.field_j = new iq(vh.field_r, var14, var15, var6);
          }
          var15 += 40;
          this.field_j.a(0);
          if (this.field_o == null) {
            this.field_o = new iq(lb.field_c, var14, var15, var6);
          }
          this.field_o.a(param0 ^ 26);
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          runtimeException = decompiledCaughtException;
          throw ig.a((Throwable) ((Object) runtimeException), "cv.R(" + param0 + ')');
        }
    }

    final void b(int param0) {
        int stackIn_32_0 = 0;
        int[] stackIn_38_0 = null;
        int stackIn_38_1 = 0;
        int stackIn_39_2 = 0;
        RuntimeException decompiledCaughtException = null;
        Object var2 = null;
        int var3 = 0;
        vk var4 = null;
        int[] var5 = null;
        int var6 = 0;
        int var7 = 0;
        int var8 = 0;
        int var9 = 0;
        int var3Lifetime1;
        var9 = ArmiesOfGielinor.field_M ? 1 : 0;
        try {
          boolean decompiledFrameRemainder0 = true;
          hh.a(-16147, 50, qf.field_f, true);
          var2 = null;
          if (0 != this.field_a) {
            var3 = this.field_l;
            if (var3 != 0) {
              if (var3 == 1 &&
                var9 == 0) {
                var2 = new int[]{1, 2, 4, 11, 12, 13};
                decompiledFrameRemainder0 = false;
              }
              if (((decompiledFrameRemainder0) &&
                (decompiledFrameRemainder0 = (var3 == 2))) && (var9 == 0)) {
                var2 = new int[]{1, 14, 15, 16};
                decompiledFrameRemainder0 = false;
              }
            }
            if (decompiledFrameRemainder0) {
              var2 = new int[]{1, 2, 3, 9, 10};
            }
          } else {
            var2 = new int[]{1, 2, 3, 5, 6, 7, 8};
          }
          var3Lifetime1 = 113 % ((-3 - param0) / 56);
          if (null != var2) {
            var4 = new vk();
            var5 = (int[]) var2;
            var6 = 0;
            while (var6 < var5.length) {
              var7 = var5[var6];
              var7--;
              if (var9 != 0) {
                return;
              }
              if (2 == this.field_l &&
                var7 == 0) {
                stackIn_32_0 = 20 + gi.field_b;
              } else {
                stackIn_32_0 = gi.field_b;
              }
              var8 = stackIn_32_0;
              stackIn_38_0 = var4.field_a;
              stackIn_38_1 = var7;
              if (this.field_a != 0 &&
                3 >= var7) {
                stackIn_39_2 = var8;
              } else {
                stackIn_39_2 = 256;
              }
              stackIn_38_0[stackIn_38_1] = stackIn_39_2;
              var6++;
            }
            ((wn) (lk.field_e.field_y)).a((byte) 48, wf.field_v, var4);
            return;
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2 = decompiledCaughtException;
          throw ig.a((Throwable) (var2), "cv.AA(" + param0 + ')');
        }
    }

    final static void a(byte param0, nr param1, int param2, int param3) {
        RuntimeException stackIn_8_0 = null;
        StringBuilder stackIn_8_1 = null;
        String stackIn_9_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var4 = null;
        try {
          if (param0 != 123) {
            field_q = (String) null;
          }
          b.field_k = param3;
          sg.field_c = param1;
          ov.field_b = param2;
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var4 = decompiledCaughtException;
          stackIn_8_0 = var4;
          stackIn_8_1 = new StringBuilder().append("cv.BA(").append(param0).append(',');
          if (param1 == null) {
            stackIn_9_2 = "null";
          } else {
            stackIn_9_2 = "{...}";
          }
          throw ig.a((Throwable) ((Object) stackIn_8_0), ((StringBuilder) (Object) stackIn_8_1).append(stackIn_9_2).append(',').append(param2).append(',').append(param3).append(')').toString());
        }
    }

    private final void c(int param0) {
        String[] array$0 = null;
        int stackIn_26_0 = 0;
        cq stackIn_31_0 = null;
        int stackIn_37_0;
        String stackIn_37_1;
        String[] stackIn_37_2;
        String[] stackIn_37_3;
        int stackIn_37_4;
        String stackIn_38_5 = null;
        int stackIn_70_0 = 0;
        int stackIn_98_0 = 0;
        RuntimeException decompiledCaughtException = null;
        int var2_int = 0;
        RuntimeException var2 = null;
        int var3 = 0;
        int var4 = 0;
        int var5 = 0;
        int var6 = 0;
        lo var7 = null;
        int var8 = 0;
        int var9 = 0;
        int var10 = 0;
        int var11 = 0;
        int var12 = 0;
        int[][] var13 = null;
        int var14 = 0;
        int var15_int = 0;
        om var15 = null;
        int var16 = 0;
        tc var16_ref_tc = null;
        int var17 = 0;
        String var17_ref_String = null;
        int var18 = 0;
        int var19_int = 0;
        Object var19 = null;
        int var20 = 0;
        int var21 = 0;
        int var22 = 0;
        int[] var23 = null;
        fu var23_ref = null;
        int var24_int = 0;
        wk var24 = null;
        int var25_int = 0;
        sl var25 = null;
        sd var26_ref_sd = null;
        int var26 = 0;
        int var27 = 0;
        int var28 = 0;
        int var29 = 0;
        int var3Lifetime1;
        int var4Lifetime1;
        int var5Lifetime1;
        int var6Lifetime1;
        int var6Lifetime2;
        int var6Lifetime3;
        int var8Lifetime1;
        int var9Lifetime1;
        int var10Lifetime1;
        int var15_intLifetime1;
        int var16Lifetime1;
        int var17Lifetime1;
        int var17Lifetime2;
        int var18Lifetime1;
        int var18Lifetime2;
        int var19_intLifetime1;
        int var20Lifetime1;
        int var25_intLifetime1;
        int var25_intLifetime2;
        int var26Lifetime1;
        int var26Lifetime2;
        int var27Lifetime1;
        int var27Lifetime2;
        int var28Lifetime1;
        int var28Lifetime2;
        var29 = ArmiesOfGielinor.field_M ? 1 : 0;
        try {
          if (this.field_b != null &&
            this.field_b.field_l) {
            boolean decompiledSharedTail0 = (null == this.field_t);
            if (!decompiledSharedTail0) {
              var2_int = this.field_t.field_i;
              decompiledSharedTail0 = (var29 != 0);
            }
            if (decompiledSharedTail0) {
              var2_int = 184;
              var3 = 26 + nr.field_e.a(ul.field_j) / 2;
              if (var3 > var2_int) {
                var2_int = var3;
              }
              var4 = nr.field_e.a(pn.field_k) / 2 + 26;
              if (var2_int < var4) {
                var2_int = var4;
              }
            }
            var3Lifetime1 = var2_int + 26;
            var4Lifetime1 = -26 + var3Lifetime1;
            fe.b(db.a(true, 5), u.a(4, (byte) 94), var3Lifetime1, 472, io.field_m, ci.field_e, 0, 112);
            var5 = 18;
            var6 = 34;
            var6Lifetime1 = 34;
            fe.a(this.field_b.field_w, db.a(true, var3Lifetime1 / 2 + 5), u.a(var6Lifetime1, (byte) 94), -20 + var3Lifetime1, nd.field_b, true, 40, 1);
            var6Lifetime1 += 14;
            var7 = this.field_b.field_p.a(-127);
            var8 = 0;
            var9 = 6;
            var10 = 5;
            var11 = var4Lifetime1;
            var12 = 2 * var11 / 3;
            var9Lifetime1 = var11 / var7.field_l;
            var8Lifetime1 = (-(var9Lifetime1 * var7.field_l) + var11) / 2;
            var10Lifetime1 = var12 / var7.field_n;
            var13 = var7.e(28554);
            var14 = var13[0].length - 1;
            var15_int = 0;
            L4: while (true) {
              if (var15_int < var13.length) {
                stackIn_26_0 = 0;
                if (var29 != 0) {
                  break L4;
                }
                var16 = stackIn_26_0;
                while (var16 < var13[0].length) {
                  var17 = var13[var15_int][-var16 + var13[0].length - 1];
                  var18 = mc.field_d[var7.field_p].field_i[var17];
                  var19_int = db.a(true, var8Lifetime1 + var9Lifetime1 * (var14 - var16) + var5);
                  var20 = u.a(var6Lifetime1 + var10Lifetime1 * var15_int, (byte) 94);
                  qn.f(var19_int, var20, var9Lifetime1, var10Lifetime1, var18);
                  qn.e(var19_int, var20, var19_int + var9Lifetime1, var20, 16777215, 16);
                  qn.e(var19_int, 1 + var20, var19_int, var20 + var10Lifetime1, 16777215, 16);
                  qn.d(1 + var19_int, var10Lifetime1 + (var20 - 1), var9Lifetime1 + var19_int, -1 + (var10Lifetime1 + var20), 0, 16);
                  qn.e(var9Lifetime1 + (var19_int - 1), var20 + 1, var19_int + var9Lifetime1 - 1, var20 + var10Lifetime1 - 1, 0, 16);
                  var16++;
                }
                var15_int++;
                continue L4;
              }
              fe.b(db.a(true, var5 + var8Lifetime1), u.a(var6Lifetime1, (byte) 94), var9Lifetime1 * var7.field_l, var7.field_n * var10Lifetime1, io.field_m, ci.field_e, 0, 0);
              var6Lifetime1 = var6Lifetime1 + (124 + ro.field_rb[0].field_f);
              stackIn_26_0 = 18;
              break;
            }
            var15_intLifetime1 = stackIn_26_0;
            var16_ref_tc = this.field_b.field_n.b(param0 ^ 21);
            boolean decompiledNaturalLoopExit0 = false;
            while (!(decompiledNaturalLoopExit0 = (var16_ref_tc == null))) {
              var17Lifetime1 = (int)var16_ref_tc.field_i;
              ro.field_rb[var17Lifetime1].a(db.a(true, var15_intLifetime1), u.a(var6Lifetime1 - ro.field_rb[var17Lifetime1].field_f, (byte) 94));
              var15_intLifetime1 = var15_intLifetime1 + ro.field_rb[var17Lifetime1].field_g;
              stackIn_31_0 = this.field_b;
              if (var29 == 0) {
                var16_ref_tc = ((bg) (Object) stackIn_31_0.field_n).b((byte) 77);
                continue;
              }
              break;
            }
            if (decompiledNaturalLoopExit0) {
              stackIn_31_0 = this.field_b;
            }
            var15 = stackIn_31_0.field_p;
            rs.field_n.a(k.field_b + var15.field_E, db.a(true, var5), u.a(var6Lifetime1, (byte) 94), var4Lifetime1, 472, 16776960, 1, 0, 0, 0);
            var6Lifetime1 = var6Lifetime1 + rs.field_n.field_v;
            var16Lifetime1 = 1;
            if (this.field_b.field_r != null) {
              array$0 = new String[1];
              stackIn_37_0 = 4800;
              stackIn_37_1 = uh.field_c;
              stackIn_37_2 = array$0;
              stackIn_37_3 = array$0;
              stackIn_37_4 = 0;
              if (null == this.field_b.field_r) {
                stackIn_38_5 = dv.field_g;
              } else {
                stackIn_38_5 = this.field_b.field_r;
              }
              stackIn_37_3[stackIn_37_4] = stackIn_38_5;
              var17_ref_String = fo.a(stackIn_37_0, stackIn_37_1, stackIn_37_2);
              var16Lifetime1 = rs.field_n.a(var17_ref_String, db.a(true, var5), u.a(var6Lifetime1, (byte) 94), var4Lifetime1, 472, 16776960, 1, 0, 0, 0);
              var18Lifetime1 = rs.field_n.a(var17_ref_String, var4Lifetime1);
              var19_intLifetime1 = this.field_b.field_A;
              if (1000 >= var19_intLifetime1) {
                if (var19_intLifetime1 > 500) {
                  am.field_C[1].g(db.a(true, 5 + var18Lifetime1 + var5), u.a(var6Lifetime1 + rs.field_n.field_H - rs.field_n.field_z, (byte) 94));
                }
                if ((!(var19_intLifetime1 > 500) ||
                  var29 != 0) &&
                  (!(10 >= var19_intLifetime1))) {
                  am.field_C[2].g(db.a(true, var5 + var18Lifetime1 + 5), u.a(-rs.field_n.field_z + rs.field_n.field_H + var6Lifetime1, (byte) 94));
                  if (var29 != 0) {
                    am.field_C[0].g(db.a(true, var5 - (-var18Lifetime1 - 5)), u.a(-rs.field_n.field_z + rs.field_n.field_H + var6Lifetime1, (byte) 94));
                  }
                }} else {
                am.field_C[0].g(db.a(true, var5 - (-var18Lifetime1 - 5)), u.a(-rs.field_n.field_z + rs.field_n.field_H + var6Lifetime1, (byte) 94));
              }
            }
            var6Lifetime1 = var6Lifetime1 + rs.field_n.field_v * (-1 + var16Lifetime1);
            var17Lifetime2 = 276;
            var5Lifetime1 = 18;
            var18Lifetime2 = var5Lifetime1;
            var17Lifetime2 += 30;
            var17Lifetime2 += 17;
            var19 = null;
            var18Lifetime2 = var18Lifetime2 + param0;
            var20Lifetime1 = var15.field_B.length - 1;
            var21 = 50;
            var22 = 15;
            if (var20Lifetime1 > 2) {
              var21 = 25;
              var22 = 0;
              var17Lifetime2 += 30;
            }
            var17Lifetime2 = var17Lifetime2 + (var20Lifetime1 * var21 / 2 - 50);
            var23 = var15.field_B;
            var24_int = 0;
            while (true) {
              if (var24_int >= var23.length) {
                var5Lifetime1 = 18;
                var6Lifetime1 += 16;
                en.field_E.a(var15.field_n, db.a(true, var5Lifetime1), u.a(var6Lifetime1, (byte) 94), var4Lifetime1, 472, 16777215, 1, 0, 0, 12);
                stackIn_70_0 = 391;
                break;
              }
              var25_int = var23[var24_int];
              stackIn_70_0 = 0;
              if (var29 == 0) {
                if (stackIn_70_0 <= var25_int) {
                  var26_ref_sd = var15.field_G.field_q[var25_int];
                  if (var20Lifetime1 > 2) {
                    var26_ref_sd.field_q.a(false, false, (byte) 68, false, false, false, u.a(var17Lifetime2, (byte) 94), var26_ref_sd.field_u, db.a(true, -5 + var18Lifetime2));
                  } else {
                    var26_ref_sd.field_q.a(false, 0, u.a(var17Lifetime2, (byte) 94), false, db.a(true, var18Lifetime2 - 5), var26_ref_sd.field_u, false, false, false, param0 - 19764);
                  }
                  var27 = var18Lifetime2 + 60;
                  var28 = 5 + var4Lifetime1 - var27;
                  rs.field_n.a(var26_ref_sd.field_u, db.a(true, var27), u.a(var17Lifetime2 + var22, (byte) 94), var28, 20, 16777215, 1, 0, 2, 0);
                  var17Lifetime2 = var17Lifetime2 - var21;
                }
                var24_int++;
                continue;
              }
              break;
            }
            var6Lifetime2 = stackIn_70_0;
            var23_ref = var15.g(-1);
            var24 = km.field_h[2];
            this.a(var24, 0, 0, 10 + var6Lifetime2, var23_ref.field_h, param0 - 19, 1.0f, 18 + var23_ref.field_h.field_A / 2);
            if (var23_ref.field_i != null &&
              ml.a(u.a(var6Lifetime2 + 10, (byte) 94), db.a(true, var23_ref.field_h.field_A / 2 + 18), 25, false)) {
              var25_intLifetime1 = var4Lifetime1 * 2;
              var26 = var3Lifetime1 + 5;
              if (so.field_b.field_a < var26 + var25_intLifetime1) {
                var25_intLifetime1 = so.field_b.field_a - var26;
              }
              var27Lifetime1 = rs.field_n.a(var23_ref.field_i, var25_intLifetime1, 0);
              var28Lifetime1 = var6Lifetime2 - var27Lifetime1 / 2;
              qn.b(db.a(true, var26), u.a(var28Lifetime1, (byte) 94), var25_intLifetime1, var27Lifetime1 + 2, 0, 128);
              rs.field_n.a(var23_ref.field_i, db.a(true, var26), u.a(var28Lifetime1, (byte) 94), var25_intLifetime1, 472, 16777215, 1, 1, 0, 0);
            }
            rs.field_n.a(ft.field_l + var23_ref.field_c, db.a(true, var23_ref.field_h.field_A + 31), u.a(-10 + var6Lifetime2, (byte) 94), -13 + (-var23_ref.field_h.field_A + var4Lifetime1), var23_ref.field_h.field_x, 16776960, 0, 0, 1, 0);
            if (null != var19) {
              var25_intLifetime2 = 100;
              var26Lifetime1 = sm.field_d;
              var27Lifetime2 = rs.field_n.a(((sd) (var19)).field_u, var25_intLifetime2, 0);
              var28Lifetime2 = -(var27Lifetime2 / 2) + (25 + ko.field_b);
              qn.b(db.a(true, var26Lifetime1), u.a(var28Lifetime2, (byte) 94), var25_intLifetime2, var27Lifetime2 + 2, 0, 255);
              rs.field_n.a(((sd) (var19)).field_u, db.a(true, var26Lifetime1), u.a(var28Lifetime2, (byte) 94), var25_intLifetime2, 472, 16777215, 1, 1, 0, 0);
            }
            var6Lifetime3 = 436;
            if (this.field_t == null) {
              this.field_t = new iq(ul.field_j, var5Lifetime1, var6Lifetime3, var2_int);
            }
            if (null == this.field_p) {
              this.field_p = new iq(pn.field_k, var5Lifetime1, var6Lifetime3, var2_int);
            }
            var25 = ku.j(121);
            if (null != var25 &&
              ~this.field_l == ~var25.field_g &&
              ~var25.field_e == ~this.field_b.field_k) {
              stackIn_98_0 = 1;
            } else {
              stackIn_98_0 = 0;
            }
            var26Lifetime2 = stackIn_98_0;
            if (this.field_a == 1) {
              if (this.field_b.field_r != null &&
                var26Lifetime2 == 0) {
                this.field_p.a(0);
                if (var29 == 0) {
                  return;
                }
              }
              this.field_t.a(0);
            }
            return;
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2 = decompiledCaughtException;
          throw ig.a((Throwable) ((Object) var2), "cv.K(" + param0 + ')');
        }
    }

    private final void a(wk param0, int param1, int param2, int param3, wk param4, int param5, float param6, int param7) {
        RuntimeException stackIn_58_0 = null;
        StringBuilder stackIn_58_1 = null;
        String stackIn_59_2 = null;
        StringBuilder stackIn_62_1 = null;
        String stackIn_63_2 = null;
        RuntimeException decompiledCaughtException = null;
        int var9_int = 0;
        RuntimeException var9 = null;
        int var10 = 0;
        int var11 = 0;
        int var12 = 0;
        int var13 = 0;
        int var14 = 0;
        int var15 = 0;
        var15 = ArmiesOfGielinor.field_M ? 1 : 0;
        try {
          var9_int = param4.field_y;
          param7 = db.a(true, param7);
          param3 = u.a(param3, (byte) 94);
          var10 = (13 * param3 + fe.field_b + param7 * 57) % 100;
          if (param6 == (float)param5) {
            if (param0 != null) {
              lw.field_ob.g(1 + (param7 - var9_int / 2), -(var9_int / 2) + (param3 + 1));
            }
            if (null != param4) {
              param4.g(-(var9_int / 2) + param7 + 1, 1 - var9_int / 2 + param3);
            }
            if (param0 != null) {
              param0.g(-22 + param7, param3 - 22);
            }
            if (param2 <= 0) {
              return;
            }
            fe.a(param7, param3, param1, param2, var10, 40, 96);
            if (var15 == 0) {
              return;
            }
          }
          if (0.5f != param6) {
            var11 = (int)((float)var9_int * param6);
            var12 = (int)(46.0f * param6);
            var13 = (int)(param6 * 40.0f);
            var14 = (int)(96.0f * param6);
            if (param0 != null) {
              lw.field_ob.c(param7 - var11 / 2, -(var11 / 2) + param3, var11, var11);
            }
            if (null != param4) {
              param4.c(-(var11 / 2) + param7, -(var11 / 2) + param3, var11, var11);
            }
            if (param0 != null) {
              param0.c(param7 - var12 / 2, param3 - var12 / 2, var12, var12);
            }
            if (param2 > 0) {
              fe.a(param7, param3, param1, param2, var10, var13, var14);
            }
            if (var15 == 0) {
              return;
            }
          }
          if (param0 != null) {
            lw.field_ob.h(-(var9_int / 4) + (param7 + 1), param3 - var9_int / 4 + 1);
          }
          if (null != param4) {
            param4.h(-(var9_int / 4) + param7 + 1, 1 + (-(var9_int / 4) + param3));
          }
          if (param0 != null) {
            param0.h(-11 + param7, -11 + param3);
          }
          if (param2 > 0) {
            fe.a(param7, param3, param1, param2, var10, 20, 48);
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var9 = decompiledCaughtException;
          stackIn_58_0 = var9;
          stackIn_58_1 = new StringBuilder().append("cv.DA(");
          if (param0 == null) {
            stackIn_59_2 = "null";
          } else {
            stackIn_59_2 = "{...}";
          }
          stackIn_62_1 = ((StringBuilder) (Object) stackIn_58_1).append(stackIn_59_2).append(',').append(param1).append(',').append(param2).append(',').append(param3).append(',');
          if (param4 == null) {
            stackIn_63_2 = "null";
          } else {
            stackIn_63_2 = "{...}";
          }
          throw ig.a((Throwable) ((Object) stackIn_58_0), ((StringBuilder) (Object) stackIn_62_1).append(stackIn_63_2).append(',').append(param5).append(',').append(param6).append(',').append(param7).append(')').toString());
        }
    }

    private final wk a(om param0, sl param1, int param2, int param3, int param4) {
        RuntimeException runtimeException = null;
        wk var6 = null;
        lo var7 = null;
        int var8 = 0;
        int var9 = 0;
        int var10 = 0;
        int var11 = 0;
        int[][] var12 = null;
        String[] var13 = null;
        int var14_int = 0;
        ha var14 = null;
        int var15 = 0;
        int var16 = 0;
        int var17 = 0;
        ne var18 = null;
        int var19 = 0;
        int var23 = 0;
        int stackIn_20_0 = 0;
        int stackIn_20_1 = 0;
        wk stackIn_21_0 = null;
        RuntimeException stackIn_25_0 = null;
        StringBuilder stackIn_25_1 = null;
        String stackIn_26_2 = null;
        StringBuilder stackIn_29_1 = null;
        String stackIn_30_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var6_ref = null;
        int var20 = 0;
        jd var21_ref_jd = null;
        int var21 = 0;
        int var22 = 0;
        var23 = ArmiesOfGielinor.field_M ? 1 : 0;
        try {
          var6 = new wk(param4, param2);
          var7 = param0.a(-98);
          var8 = var6.field_v / var7.field_n;
          var9 = var6.field_y / var7.field_l;
          var10 = (var6.field_y - var9 * var7.field_l) / 2;
          var11 = (-(var9 * var7.field_n) + var6.field_v) / 2;
          var12 = new int[][]{kb.field_o};
          var13 = new String[param0.field_B.length];
          var14_int = 0;
          while (var13.length > var14_int) {
            var13[var14_int] = "-";
            var14_int++;
            if (var23 == 0) {
              continue;
            }
            break;
          }
          var14 = new ha(0, var13, -1, var12, 0, true, false, param0.field_o, 1, var7.field_p, false, (int[][]) null, 4, 0, 0, param0);
          var14.field_sb = 0;
          try {
            ml.a(param0, (byte) -26);
            var14.b(param3 ^ param3, new vh(param1.field_c));
          } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
            decompiledCaughtException = decompiledCaughtParameter0;
            runtimeException = decompiledCaughtException;
            runtimeException.printStackTrace();
          }
          vn.a(var6, 3);
          qn.f(0, 0, var6.field_y, var6.field_v, 4473924);
          var15 = 0;
          boolean decompiledNaturalLoopExit0 = false;
          while (!(decompiledNaturalLoopExit0 = (!(var15 < var14.field_Eb.length)))) {
            var16 = var15 / var14.field_v;
            var17 = var15 % var14.field_v;
            var18 = var14.field_Eb[var15];
            var19 = var18.field_h;
            stackIn_20_0 = -17;
            stackIn_20_1 = ~var19;
            if (var23 == 0) {
              if (stackIn_20_0 >= stackIn_20_1) {
                var19 = 0;
              }
              var20 = mc.field_d[var7.field_p].field_i[var19];
              if (null != var18.field_c) {
                var21_ref_jd = var18.field_c;
                var20 = op.field_c[0][var21_ref_jd.field_O];
              }
              var21 = var9 * var17 + var10;
              var22 = var11 + var8 * var16;
              qn.f(var21, var22, var9, var8, var20);
              qn.e(var21, var22, var21 + var9, var22, 16777215, 16);
              qn.e(var21, var22 + 1, var21, var8 + var22, 16777215, 16);
              qn.d(1 + var21, -1 + (var8 + var22), var21 + var9, -1 + var22 + var8, 0, 16);
              qn.e(var21 + var9 - 1, var22 + 1, var21 + (var9 - 1), var8 + (var22 - 1), 0, 16);
              var15++;
              continue;
            }
            break;
          }
          if (decompiledNaturalLoopExit0) {
            stackIn_20_0 = param3;
            stackIn_20_1 = -18863;
          }
          rf.b(stackIn_20_0 + stackIn_20_1);
          stackIn_21_0 = var6;
          return stackIn_21_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter1) {
          decompiledCaughtException = decompiledCaughtParameter1;
          var6_ref = decompiledCaughtException;
          stackIn_25_0 = var6_ref;
          stackIn_25_1 = new StringBuilder().append("cv.V(");
          if (param0 == null) {
            stackIn_26_2 = "null";
          } else {
            stackIn_26_2 = "{...}";
          }
          stackIn_29_1 = ((StringBuilder) (Object) stackIn_25_1).append(stackIn_26_2).append(',');
          if (param1 == null) {
            stackIn_30_2 = "null";
          } else {
            stackIn_30_2 = "{...}";
          }
          throw ig.a((Throwable) ((Object) stackIn_25_0), ((StringBuilder) (Object) stackIn_29_1).append(stackIn_30_2).append(',').append(param2).append(',').append(param3).append(',').append(param4).append(')').toString());
        }
    }

    private final void a(int param0, om param1) {
        RuntimeException runtimeException = null;
        cq var3 = null;
        int var4 = 0;
        RuntimeException stackIn_8_0 = null;
        StringBuilder stackIn_8_1 = null;
        String stackIn_9_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          var3 = new cq(param1);
          var4 = mh.a(this.field_l, param0 - 119, var3.field_k);
          if (~var4 < param0) {
            var3.field_r = ir.a(10602, var4);
            var3.field_A = var4;
          }
          this.field_i.a(var3, (long)var3.field_k, 122);
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          runtimeException = decompiledCaughtException;
          stackIn_8_0 = runtimeException;
          stackIn_8_1 = new StringBuilder().append("cv.L(").append(param0).append(',');
          if (param1 == null) {
            stackIn_9_2 = "null";
          } else {
            stackIn_9_2 = "{...}";
          }
          throw ig.a((Throwable) ((Object) stackIn_8_0), ((StringBuilder) (Object) stackIn_8_1).append(stackIn_9_2).append(')').toString());
        }
    }

    private final cq a(int param0, int param1) {
        cq var3 = null;
        RuntimeException var3_ref = null;
        cq stackIn_4_0 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          if (param0 != 321) {
            this.a((byte) -52, true, (cq) null, true);
          }
          var3 = (cq) (this.field_i.a(-128, (long)param1));
          stackIn_4_0 = var3;
          return stackIn_4_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3_ref = decompiledCaughtException;
          throw ig.a((Throwable) ((Object) var3_ref), "cv.W(" + param0 + ',' + param1 + ')');
        }
    }

    private final void g(int param0) {
        sl var2 = null;
        om var3 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var2_ref = null;
        try {
          this.field_b = null;
          if (this.field_d.field_k == -1) {
            var2 = ku.j(param0 + 86);
            if (!ei.a(var2.field_g, param0 + 11906) &&
              rf.a(27875)) {
              pr.field_i = bn.field_g;
              bv.a(false, 11, param0 ^ 1, jt.field_a);
              return;
            }
            this.b(var2.field_g, 53);
            var3 = ar.a(var2.field_g, var2.field_e, 0);
            l.field_c = var3;
            bv.a(true, -11, param0 + 1, 0);
            if (ArmiesOfGielinor.field_M) {
              this.a(this.field_d.field_k, true);
            }
          } else {
            this.a(this.field_d.field_k, true);
          }
          if (param0 != 0) {
            this.field_p = (iq) null;
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2_ref = decompiledCaughtException;
          throw ig.a((Throwable) ((Object) var2_ref), "cv.D(" + param0 + ')');
        }
    }

    final void f(byte param0) {
        int stackIn_189_0 = 0;
        int stackIn_189_1 = 0;
        RuntimeException decompiledCaughtException = null;
        Object var2 = null;
        int var2_int = 0;
        int var3_int = 0;
        Object var3 = null;
        Object var4 = null;
        cq var4_ref = null;
        int var4_int = 0;
        int var5 = 0;
        int var6 = 0;
        int var7 = 0;
        var7 = ArmiesOfGielinor.field_M ? 1 : 0;
        try {
          fe.field_b = fe.field_b + 1;
          fe.field_b = fe.field_b % 100;
          if (param0 < 114) {
            return;
          }
          if (2 <= hi.field_j &&
            br.field_f[5] &&
            br.field_f[81]) {
            kw.field_R = 2297;
            cg.field_j = 72584621;
            wr.field_L = 224;
            ii.field_b = 4452;
            var2 = br.a(this.field_l, (byte) -125).field_n;
            var3_int = 0;
            while (true) {
              if (java.lang.reflect.Array.getLength(var2) > var3_int) {
                var4 = ((Object[]) (var2))[var3_int];
                ra.a(4, -1, (om) (var4), true, 1, -1);
                var3_int++;
                if (var7 == 0) {
                  continue;
                }
              } else {
                pg.field_d.field_g = new cm();
              }
              break;
            }
            this.a(this.field_l, true);
          }
          if (1 == this.field_a) {
            if (null != this.field_b) {
              this.field_b.field_v = this.field_b.field_v + 1;
            }
            boolean decompiledFrameCompleted0 = true;
            if (tr.field_A == 1 &&
              null != this.field_e) {
              if (null != this.field_b &&
                this.field_b.field_l &&
                this.field_t != null &&
                this.field_t.a((byte) -27)) {
                this.b((byte) 107);
                return;
              }
              var2_int = this.field_e.a(sm.field_d - db.a(true, 0), (byte) -79, ko.field_b - u.a(0, (byte) 94));
              if (-1 < var2_int) {
                var3 = null;
                var4_ref = (cq) (this.field_i.b(1));
                while (var4_ref != null) {
                  stackIn_189_0 = var4_ref.field_k;
                  stackIn_189_1 = var2_int;
                  if (var7 != 0) {
                    decompiledFrameCompleted0 = false;
                    break;
                  }
                  if (stackIn_189_0 != stackIn_189_1) {
                    var4_ref = (cq) (this.field_i.b((byte) 60));
                    continue;
                  }
                  var3 = var4_ref;
                  break;
                }
                if ((decompiledFrameCompleted0) &&
                  (var3 != null &&
                  ((cq) (var3)).field_l)) {
                  var4_int = 0;
                  if (hi.field_j >= 2) {
                    boolean decompiledSharedTail0 = !(br.field_f[81]);
                    if (!decompiledSharedTail0) {
                      cg.field_j = 72584621;
                      ii.field_b = 4452;
                      wr.field_L = 224;
                      kw.field_R = 2297;
                      hc.field_b = hc.field_b + 1;
                      hc.field_b = hc.field_b + (ko.field_b ^ sm.field_d);
                      hc.field_b = Math.abs(hc.field_b);
                      var5 = hc.field_b % 4;
                      var6 = var5;
                      switch ((var7 == 0
                        || var6 == 0
                        || var6 == 3
                        ) ? var6 : -1) {
                        case 0:
                          ii.field_b = ii.field_b - 12;
                          kw.field_R = kw.field_R - 3;
                          if (var7 == 0) {
                            break;
                          }
                        case 1:
                          ii.field_b = ii.field_b + 3;
                          kw.field_R = kw.field_R + 12;
                          if (var7 == 0) {
                            break;
                          }
                        case 2:
                          kw.field_R = kw.field_R + 9;
                          if (var7 == 0) {
                            break;
                          }
                        case 3:
                          ii.field_b = ii.field_b - 9;
                          if (var7 == 0) {
                            break;
                          }
                        default:
                          throw new IllegalStateException("");
                      }
                      var5 = b.a(2, 10, 12, (byte) 25, 3);
                      ra.a(4, 12, ((cq) (var3)).field_p, true, var5, 3);
                      this.a(((cq) (var3)).field_p.field_G.field_r, true);
                      System.out.println("m  id " + ((cq) (var3)).field_k + " " + ((cq) (var3)).field_w);
                      var4_int = 1;
                      decompiledSharedTail0 = (var7 != 0);
                    }
                    if ((decompiledSharedTail0) &&
                      (br.field_f[82])) {
                      var4_int = 1;
                      ra.a(4, -1, ((cq) (var3)).field_p, true, 1, -1);
                      this.a(((cq) (var3)).field_p.field_G.field_r, true);
                    }
                  }
                  if (var4_int == 0) {
                    if (this.field_b == var3) {
                      if (!(this.field_b.field_v >= 20)) {
                        this.b((byte) 72);
                        if (var7 != 0) {
                          ub.$cfr$intArgs$a$6d836999ad61(80, im.field_v[11]);
                        }
                      }
                    } else {
                      ub.$cfr$intArgs$a$6d836999ad61(80, im.field_v[11]);
                    }
                    this.field_b = (cq) (var3);
                    this.field_b.field_v = 0;
                  }
                }
              }
            }
            if (decompiledFrameCompleted0) {
              stackIn_189_0 = -3;
              stackIn_189_1 = ~tr.field_A;
            }
            if (stackIn_189_0 == stackIn_189_1) {
              this.field_b = null;
            }
          } else {
            if (this.field_a != 0) {
              if (this.field_a == 3) {
                if (tr.field_A == 1 &&
                  this.field_c != null &&
                  this.field_c.a((byte) -49)) {
                  var2 = ku.j(86);
                  var3 = ar.a(((sl) (var2)).field_g, ((sl) (var2)).field_e, 0);
                  l.field_c = (om) (var3);
                  bv.a(true, -11, 1, 0);
                }
                if (tr.field_A == 1 &&
                  null != this.field_j &&
                  this.field_j.a((byte) 121)) {
                  this.f(-2);
                  l.field_c = this.field_b.field_p;
                  bv.a(true, -10, 1, 0);
                }
                if (tr.field_A == 1 &&
                  this.field_o != null &&
                  this.field_o.a((byte) -52)) {
                  this.field_a = 1;
                }
                return;
              }
              if (this.field_a == 2) {
                if (tr.field_A == 1 &&
                  null != this.field_h &&
                  this.field_h.a((byte) 86)) {
                  this.f(-2);
                  l.field_c = this.field_b.field_p;
                  bv.a(true, -10, 1, 0);
                }
                if (tr.field_A == 1 &&
                  this.field_f != null &&
                  this.field_f.a((byte) -69)) {
                  this.field_a = 1;
                }
                return;
              }
            } else {
              if (this.field_d != null) {
                this.field_d.field_v = this.field_d.field_v + 1;
              }
              if (null != this.field_d &&
                tr.field_A == 1 &&
                wg.a(-33, db.a(true, 354), db.a(true, 600), u.a(361, (byte) 94), u.a(402, (byte) 94))) {
                this.g(0);
                return;
              }
            }
          }
          if (2 == tr.field_A) {
            this.field_b = null;
            this.field_d = null;
          }
          if (tr.field_A == 1) {
            var2 = null;
            var3 = null;
            var4_int = this.field_a;
            if (0 == var4_int) {
              var3 = this.field_g;
            } else {
              if (1 == var4_int) {
                var3 = this.field_i;
              }
            }
            if (null != var3) {
              var4_ref = (cq) (((bg) (var3)).b(1));
              while (null != var4_ref) {
                if (var7 != 0) {
                  return;
                }
                if (var4_ref.field_l &&
                  var4_ref.a(sm.field_d, ko.field_b, 122)) {
                  var2 = var4_ref;
                } else {
                  var4_ref = (cq) (((bg) (var3)).b((byte) 80));
                  continue;
                }
                break;
              }
              if (null == var2) {
                return;
              }
              if (this.field_a == 1) {
                if (hi.field_j < 2) {
                  return;
                }
                if (!br.field_f[81]) {
                  return;
                }
                pg.field_d.field_g.a(65535, ((cq) (var2)).field_k, uk.field_n % 10 + ((cq) (var2)).field_k * 10, this.field_l, ((cq) (var2)).field_k * 200 + uk.field_n % 200);
                this.a(this.field_l, true);
                if (var7 == 0) {
                  return;
                }
              }
              if (this.field_a != 0) {
                return;
              }
              if (this.field_d != var2) {
                ub.$cfr$intArgs$a$6d836999ad61(98, im.field_v[11]);
              }
              this.field_d = (cq) (var2);
              if (this.field_d.field_v < 20) {
                this.g(0);
              }
              this.field_d.field_v = 0;
              return;
            }
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2 = decompiledCaughtException;
          throw ig.a((Throwable) (var2), "cv.H(" + param0 + ')');
        }
    }

    private final void b(byte param0) {
        RuntimeException runtimeException = null;
        sl var2 = null;
        int var3 = 0;
        int var4 = 0;
        RuntimeException decompiledCaughtException = null;
        var4 = ArmiesOfGielinor.field_M ? 1 : 0;
        try {
          var2 = ku.j(91);
          if (null == var2) {
            l.field_c = this.field_b.field_p;
            bv.a(true, -10, 1, 0);
            if (var4 != 0) {
              if (this.field_b.field_k == var2.field_e &&
                var2.field_g == this.field_l) {
                this.a(3, (byte) 42);
                this.a(2, (byte) 42);
              } else {
                this.a(2, (byte) 42);
              }
            }
          } else {
            if (this.field_b.field_k == var2.field_e &&
              var2.field_g == this.field_l) {
              this.a(3, (byte) 42);
              if (var4 != 0) {
                this.a(2, (byte) 42);
              }
            } else {
              this.a(2, (byte) 42);
            }
          }
          var3 = -127 % ((param0 - 10) / 55);
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          runtimeException = decompiledCaughtException;
          throw ig.a((Throwable) ((Object) runtimeException), "cv.S(" + param0 + ')');
        }
    }

    private final cq a(boolean param0, cf param1) {
        cq stackIn_3_0 = null;
        cq stackIn_11_0 = null;
        boolean stackIn_14_1 = false;
        cf stackIn_18_0 = null;
        Object stackIn_34_0 = null;
        cq stackIn_39_0 = null;
        RuntimeException stackIn_43_0 = null;
        StringBuilder stackIn_43_1 = null;
        String stackIn_44_2 = null;
        RuntimeException decompiledCaughtException = null;
        cf stackOut_17_0;
        cq var3 = null;
        RuntimeException var3_ref = null;
        int var4_int = 0;
        Object var4 = null;
        int var5 = 0;
        int var6_int = 0;
        wk var6 = null;
        wk var7 = null;
        int var8 = 0;
        int var9 = 0;
        var9 = ArmiesOfGielinor.field_M ? 1 : 0;
        try {
          if (!param0) {
            stackIn_3_0 = (cq) null;
            return stackIn_3_0;
          }
          var3 = new cq(param1.field_r, param1.field_k);
          var3.field_D = param1.field_s;
          var3.field_q = param1.field_o;
          stackIn_11_0 = var3;
          stackIn_14_1 = (param1.c((byte) -45)) || !(0 >= df.field_M) || !(hi.field_j < 2);
          boolean decompiledFrameCompleted0 = true;
          stackIn_11_0.field_l = stackIn_14_1;
          if (var3.field_l) {
            var4_int = 0;
            var5 = param1.field_n.length;
            var6_int = 0;
            while (var5 > var6_int) {
              stackOut_17_0 = (cf) (param1);
              stackIn_34_0 = stackOut_17_0;
              stackIn_18_0 = stackOut_17_0;
              if (var9 != 0) {
                decompiledFrameCompleted0 = false;
                break;
              }
              if (mh.a(stackIn_18_0.field_r, -120, var6_int) > 0) {
                var4_int++;
              }
              var6_int++;
            }
            if (decompiledFrameCompleted0) {
              var3.field_r = fo.a(4800, og.field_l, new String[]{Integer.toString(var4_int), Integer.toString(var5)});
              var6 = ps.field_w[var3.field_k];
              var7 = new wk(var6.field_A, var6.field_x);
              vn.a(var7, 3);
              var6.f(0, 0);
              var8 = 18;
              boolean decompiledSharedTail0 = (var3.field_k == 1);
              if (!decompiledSharedTail0) {
                qn.c(var8, var8, 0, 0, var6.field_A, var6.field_x);
                decompiledSharedTail0 = (var9 != 0);
              }
              if (decompiledSharedTail0) {
                qn.c(var8, var8, 0, var8, var6.field_A, -var8 + var6.field_x);
              }
              rf.b(-18862);
              var3.field_m = var7;
              if (var9 != 0) {
                var3.field_r = bn.field_g;
              }
            }
          } else {
            var3.field_r = bn.field_g;
          }
          if (decompiledFrameCompleted0) {
            stackIn_34_0 = this.field_g.a(-64, (long)var3.field_k);
          }
          var4 = stackIn_34_0;
          if (null != var4) {
            ((tc) (var4)).d(-100);
          }
          this.field_g.a(var3, (long)var3.field_k, 97);
          stackIn_39_0 = var3;
          return stackIn_39_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3_ref = decompiledCaughtException;
          stackIn_43_0 = var3_ref;
          stackIn_43_1 = new StringBuilder().append("cv.I(").append(param0).append(',');
          if (param1 == null) {
            stackIn_44_2 = "null";
          } else {
            stackIn_44_2 = "{...}";
          }
          throw ig.a((Throwable) ((Object) stackIn_43_0), ((StringBuilder) (Object) stackIn_43_1).append(stackIn_44_2).append(')').toString());
        }
    }

    private final void b(int param0, int param1) {
        int stackIn_26_0 = 0;
        cq stackIn_42_0 = null;
        RuntimeException decompiledCaughtException = null;
        cf var3 = null;
        RuntimeException var3_ref = null;
        om[] var4_ref_om__ = null;
        int var4 = 0;
        int var5 = 0;
        om var6_ref_om = null;
        int var6 = 0;
        int var7 = 0;
        int var8 = 0;
        int var9 = 0;
        int var10 = 0;
        int var11 = 0;
        int var12 = 0;
        cq var13 = null;
        int var14 = 0;
        int var15 = 0;
        int[] var16 = null;
        int var17 = 0;
        int var18 = 0;
        int var19 = 0;
        int var20 = 0;
        cq stackIn_42_0Lifetime1;
        int var5Lifetime1;
        var20 = ArmiesOfGielinor.field_M ? 1 : 0;
        try {
          this.field_e = new pr(mu.field_g[param0][1], 1, 16777215);
          this.field_i = new bg(32);
          var3 = br.a(param0, (byte) -118);
          if (var3 != null) {
            var4_ref_om__ = var3.field_n;
            var5 = 0;
            while (var4_ref_om__.length > var5) {
              var6_ref_om = var4_ref_om__[var5];
              if (var6_ref_om != null) {
                this.a(-1, var6_ref_om);
              }
              var5++;
              if (var20 == 0) {
                continue;
              }
              break;
            }
          }
          var4 = 90;
          var5Lifetime1 = 80;
          var6 = var4;
          var7 = var5Lifetime1;
          var8 = 400;
          var9 = 150;
          var10 = 38;
          var11 = var10 / 2;
          var12 = 10;
          var13 = (cq) (this.field_i.b(1));
          while (null != var13) {
            if (var20 != 0) {
              return;
            }
            boolean decompiledFrameRemainder0 = true;
            if (null != var13.field_p.field_y &&
              null == var13.field_r) {
              var14 = var13.field_p.e((byte) 68) ? 1 : 0;
              var15 = var14;
              var16 = var13.field_p.field_y;
              var17 = 0;
              while (var16.length > var17) {
                var18 = var16[var17];
                stackIn_42_0 = this.a(321, var18);
                stackIn_26_0 = (stackIn_42_0.field_r == null) ? 0 : 1;
                var19 = stackIn_26_0;
                if (var19 != 0 &&
                  var14 == 0) {
                  var15 = 1;
                } else {
                  if (var19 == 0 &&
                    var14 != 0) {
                    var15 = 0;
                  } else {
                    var17++;
                    continue;
                  }
                }
                break;
              }
              stackIn_42_0Lifetime1 = var13;
              stackIn_42_0Lifetime1.field_l = var15 != 0;
              decompiledFrameRemainder0 = false;
            }
            else {
              var13.field_l = true;
            }
            var13.field_B = var9;
            var13.field_o = var10;
            var13.field_x = var7;
            var13.field_y = var6;
            var6 = var6 + (var12 + var13.field_B);
            if (var13.field_y > var8) {
              var6 = var4;
              var7 = var7 + (var13.field_o + var11);
            }
            var13 = (cq) (this.field_i.b((byte) 64));
          }
          if (param1 < 15) {
            this.a(45, (om) null);
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3_ref = decompiledCaughtException;
          throw ig.a((Throwable) ((Object) var3_ref), "cv.C(" + param0 + ',' + param1 + ')');
        }
    }

    final void a(int param0, boolean param1) {
        wk discarded$1 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var3 = null;
        try {
          if (!ei.a(param0, 11906) &&
            rf.a(27875)) {
            pr.field_i = bn.field_g;
            bv.a(false, 11, 1, jt.field_a);
            return;
          }
          if (null == mu.field_g) {
            this.c((byte) -122);
          }
          this.field_l = param0;
          this.b(param0, 98);
          if (!param1) {
            discarded$1 = this.a((om) null, (sl) null, -116, 21, 100);
          }
          this.a(1, (byte) 42);
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3 = decompiledCaughtException;
          throw ig.a((Throwable) ((Object) var3), "cv.P(" + param0 + ',' + param1 + ')');
        }
    }

    final void a(int param0, int param1, int param2) {
        int stackIn_46_0 = 0;
        RuntimeException decompiledCaughtException = null;
        int var4_int = 0;
        RuntimeException var4 = null;
        int var5 = 0;
        int var6 = 0;
        int var5Lifetime1;
        var6 = ArmiesOfGielinor.field_M ? 1 : 0;
        try {
          if (param0 == 13) {
            if (this.field_a != 1) {
              if (this.field_a != 0) {
                if (this.field_a == 2 ||
                  this.field_a == 3) {
                  this.field_a = 1;
                  if (var6 != 0) {
                    bv.a(false, 0, 1, jt.field_a);
                    this.a(0, (byte) 42);
                  }
                }
              } else {
                bv.a(false, 0, 1, jt.field_a);
                if (var6 != 0) {
                  this.a(0, (byte) 42);
                }
              }
            } else {
              this.a(0, (byte) 42);
            }
          }
          if (param2 <= hi.field_j) {
            var4_int = -2;
            var5 = 256;
            if (param0 < 16 ||
              param0 > 25) {
              if (26 != param0) {
                if (param0 != 27) {
                  if (param0 == 85) {
                    var4_int = -1;
                    if (var6 != 0) {
                      var4_int = 11;
                      var4_int = 10;
                      var4_int = param0 - 16;
                    }
                  }
                } else {
                  var4_int = 11;
                  if (var6 != 0) {
                    var4_int = 10;
                    var4_int = param0 - 16;
                  }
                }
              } else {
                var4_int = 10;
                if (var6 != 0) {
                  var4_int = param0 - 16;
                }
              }
            } else {
              var4_int = param0 - 16;
            }
            stackIn_46_0 = (!br.field_f[81]) ? 256 : 0;
            var5Lifetime1 = stackIn_46_0;
            if (var4_int != -2) {
              lk.field_e.field_w.a(var5Lifetime1, var4_int, (byte) -52);
              lk.field_e.field_D.a(var5Lifetime1, var4_int, (byte) -116);
            }
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var4 = decompiledCaughtException;
          throw ig.a((Throwable) ((Object) var4), "cv.B(" + param0 + ',' + param1 + ',' + param2 + ')');
        }
    }

    private final void e(int param0) {
        int stackIn_38_0 = 0;
        int stackIn_48_0 = 0;
        int stackIn_61_0 = 0;
        Object stackIn_68_0;
        int stackIn_68_1;
        boolean stackIn_68_2;
        int stackIn_68_3;
        cq stackIn_68_4;
        Object stackIn_70_0;
        boolean stackIn_71_5 = false;
        int stackIn_89_0 = 0;
        int stackIn_96_0 = 0;
        int stackIn_96_1 = 0;
        RuntimeException decompiledCaughtException = null;
        ru var2 = null;
        RuntimeException var2_ref = null;
        Object var3 = null;
        cq var4 = null;
        sl var4_ref = null;
        cq var5_ref_cq = null;
        int var5 = 0;
        int var6 = 0;
        int var7 = 0;
        int var8 = 0;
        Object stackIn_68_0Lifetime1;
        Object stackIn_70_0Lifetime1;
        int var6Lifetime1;
        int var7Lifetime1;
        var8 = ArmiesOfGielinor.field_M ? 1 : 0;
        try {
          var2 = mu.field_g[this.field_l][0];
          var2.b(db.a(true, 0), u.a(0, (byte) 94));
          if (null != this.field_e) {
            try {
              var3 = new boolean[this.field_i.a((byte) 117)];
              var4 = (cq) (this.field_i.b(param0 ^ -25751));
              do {
                if (var4 == null) {
                  this.field_e.a((byte) 93, db.a(true, 0), (boolean[]) (var3), u.a(0, (byte) 94), mu.field_g[this.field_l][2]);
                  break;
                }
                ((byte[]) (var3))[var4.field_k] = (byte) (var4.field_l ? 1 : 0);
                var4 = (cq) (this.field_i.b((byte) 109));
              } while (var8 == 0);
            } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
              decompiledCaughtException = decompiledCaughtParameter0;
              var3 = decompiledCaughtException;
              ((RuntimeException) (var3)).printStackTrace();
              this.field_e = null;
            }
          }
          if (param0 != -25752) {
            this.a(85, (byte) -25);
          }
          var3 = null;
          var4_ref = ku.j(85);
          var5_ref_cq = (cq) (this.field_i.b(1));
          boolean decompiledNaturalLoopExit0 = false;
          while (!(decompiledNaturalLoopExit0 = (var5_ref_cq == null))) {
            var6Lifetime1 = 0;
            stackIn_96_0 = this.field_a;
            stackIn_96_1 = 1;
            if (var8 == 0) {
              if (stackIn_96_0 == stackIn_96_1) {
                if (var5_ref_cq.field_l &&
                  sm.field_d >= db.a(true, var5_ref_cq.field_y) &&
                  sm.field_d <= db.a(true, var5_ref_cq.field_y + var5_ref_cq.field_B) &&
                  ko.field_b >= u.a(var5_ref_cq.field_x, (byte) 94) &&
                  ko.field_b <= u.a(var5_ref_cq.field_o + var5_ref_cq.field_x, (byte) 94)) {
                  stackIn_38_0 = 1;
                } else {
                  stackIn_38_0 = 0;
                }
                var6Lifetime1 = stackIn_38_0;
                if (this.field_e != null) {
                  if (var5_ref_cq.field_l &&
                    this.field_e.a(sm.field_d - db.a(true, 0), (byte) -128, ko.field_b - u.a(0, (byte) 94)) == var5_ref_cq.field_k) {
                    stackIn_48_0 = 1;
                  } else {
                    stackIn_48_0 = 0;
                  }
                  var6Lifetime1 = stackIn_48_0;
                }
              }
              if (var6Lifetime1 != 0) {
                var3 = var5_ref_cq;
              }
              if (var4_ref != null &&
                this.field_l == var4_ref.field_g &&
                var5_ref_cq.field_k == var4_ref.field_e) {
                stackIn_61_0 = 1;
              } else {
                stackIn_61_0 = 0;
              }
              L18: {
                boolean decompiledFrameRemainder0 = true;
                var7Lifetime1 = stackIn_61_0;
                stackIn_68_0 = this;
                stackIn_68_1 = -125;
                stackIn_68_2 = false;
                stackIn_68_3 = var7Lifetime1;
                stackIn_68_4 = var5_ref_cq;
                if (var6Lifetime1 == 0) {
                  stackIn_70_0 = this;
                  if (null != this.field_b) {
                    stackIn_70_0Lifetime1 = this;
                    if (var5_ref_cq == this.field_b) {
                      stackIn_68_0Lifetime1 = this;
                      decompiledFrameRemainder0 = false;
                    }
                  }
                  if (decompiledFrameRemainder0) {
                    stackIn_71_5 = false;
                    break L18;
                  }
                }
                stackIn_71_5 = true;
              }
              this.a(stackIn_68_1, stackIn_68_2, stackIn_68_3 != 0, stackIn_68_4, stackIn_71_5);
              var5_ref_cq = (cq) (this.field_i.b((byte) 110));
              continue;
            }
            break;
          }
          if (decompiledNaturalLoopExit0) {
            if (null != var3) {
              var5 = nr.field_e.a(((cq) (var3)).field_w) >> 2;
              var6 = ((cq) (var3)).field_y;
              if (var5 + var6 > 630) {
                var6 = -var5 + 630;
              }
              if (-var5 + var6 < 225) {
                var6 = 225 + var5;
              }
              fe.b(((cq) (var3)).field_w, db.a(true, var6), u.a(((cq) (var3)).field_x - 12, (byte) 94), true);
              fe.c(((cq) (var3)).field_w, db.a(true, var6), u.a(((cq) (var3)).field_x - 12, (byte) 94), nd.field_b, true);
              if (null != var4_ref &&
                ~this.field_l == ~var4_ref.field_g &&
                var4_ref.field_e == ((cq) (var3)).field_k) {
                stackIn_89_0 = 1;
              } else {
                stackIn_89_0 = 0;
              }
              var7 = stackIn_89_0;
              if (var7 != 0) {
                fe.b(qf.field_a, db.a(true, ((cq) (var3)).field_y), u.a(10 + ((cq) (var3)).field_x, (byte) 94), true);
                fe.c(qf.field_a, db.a(true, ((cq) (var3)).field_y), u.a(((cq) (var3)).field_x + 10, (byte) 94), nd.field_b, true);
              }
              if (this.field_u != var3) {
                ub.$cfr$intArgs$a$6d836999ad61(127, im.field_v[1]);
              }
            }
            this.field_u = (cq) (var3);
            stackIn_96_0 = -2;
            stackIn_96_1 = ~this.field_a;
          }
          if (stackIn_96_0 == stackIn_96_1 &&
            this.field_b != null) {
            this.c(param0 + 25772);
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter1) {
          decompiledCaughtException = decompiledCaughtParameter1;
          var2_ref = decompiledCaughtException;
          throw ig.a((Throwable) ((Object) var2_ref), "cv.O(" + param0 + ')');
        }
    }

    private final void a(int param0, byte param1) {
        cq discarded$0 = null;
        RuntimeException decompiledCaughtException = null;
        int var3_int = 0;
        RuntimeException var3 = null;
        int var4 = 0;
        int var5 = 0;
        int var6 = 0;
        int var7 = 0;
        int var8 = 0;
        int var9 = 0;
        int var10 = 0;
        sl var10_ref_sl = null;
        RuntimeException var10_ref_RuntimeException = null;
        cq var11 = null;
        cf var11_ref = null;
        om var12 = null;
        cq var12_ref = null;
        int var13_int = 0;
        tc var13 = null;
        String var14 = null;
        wk var15 = null;
        int var16 = 0;
        int var5Lifetime1;
        int var6Lifetime1;
        var16 = ArmiesOfGielinor.field_M ? 1 : 0;
        try {
          this.field_a = param0;
          var10 = this.field_a;
          if (0 == var10 &&
            var16 == 0 || var10 == 1) {
            if (0 == var10 &&
              var16 == 0 || var16 != 0) {
              var4 = 50;
              var3_int = 200;
              var6 = 150;
              var5 = -(var3_int / 2) + so.field_b.field_a / 2;
              var6Lifetime1 = 90;
              var4 = 56;
              var3_int = 278;
              var5Lifetime1 = 45;
              var7 = var5Lifetime1;
              if (this.field_g == null) {
                this.a(false);
              }
              var8 = var6Lifetime1;
              var9 = 10;
              this.field_g.c((byte) -124);
              try {
                var10_ref_sl = ku.j(84);
                if (var10_ref_sl != null) {
                  var11 = new cq(-1, be.field_A);
                  var11.field_B = 278;
                  var11.field_x = 341;
                  var11.field_o = 57;
                  var11.field_y = 45;
                  var12 = ar.a(var10_ref_sl.field_g, var10_ref_sl.field_e, 0);
                  var13_int = ha.a(var12.field_B.length, var10_ref_sl.field_c, false);
                  var14 = fo.a(4800, wd.field_e, new String[]{var12.field_J, Integer.toString(var13_int)});
                  var11.field_w = var12.field_G.field_k;
                  var11.field_l = true;
                  var11.field_p = var12;
                  var11.field_D = var12.field_G.field_s;
                  var11.field_r = var14;
                  var11.field_q = var12.field_n;
                  if (!var12.field_G.c((byte) -45) &&
                    rf.a(27875)) {
                    var11.field_l = false;
                    var11.field_r = bn.field_g + " (" + var11.field_r + ")";
                  }
                  var15 = this.a(var12, var10_ref_sl, 200, 1, 200);
                  var11.field_m = var15;
                  this.field_g.a(var11, (long)var11.field_k, 82);
                }
              } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
                decompiledCaughtException = decompiledCaughtParameter0;
                var10_ref_RuntimeException = decompiledCaughtException;
                af.a((Throwable) ((Object) var10_ref_RuntimeException), 93, "Error reading quicksave map.");
                qh.b((byte) 27);
              }
              var10 = 0;
              L10: while (true) {
                if (var10 < 3) {
                  var11_ref = br.a(var10, (byte) -12);
                  if (var16 == 0) {
                    if (var11_ref != null) {
                      var12_ref = this.a(true, var11_ref);
                    } else {
                      var12_ref = new cq(var10, (String) null);
                      var12_ref.field_l = false;
                      var13 = this.field_g.a(-89, (long)var12_ref.field_k);
                      if (null != var13) {
                        var13.d(param1 + 14);
                      }
                      this.field_g.a(var12_ref, (long)var12_ref.field_k, 105);
                    }
                    var12_ref.field_o = var4;
                    var12_ref.field_B = var3_int;
                    var12_ref.field_y = var7;
                    var12_ref.field_x = var8;
                    var8 = var8 + (var4 + var9);
                    var10++;
                    continue;
                  }
                } else {
                  if (this.field_d == null) {
                    break L10;
                  }
                }
                this.field_d = (cq) (this.field_g.a(-19, (long)this.field_d.field_k));
                break;
              }
              bv.a(true, 21, 1, 0);
              if (var16 != 0) {
                bv.a(true, 22, 1, 21);
              }
            } else {
              bv.a(true, 22, 1, 21);
            }
          }
          if (param1 != 42) {
            discarded$0 = this.a(122, 13);
          }
          this.b(78);
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter1) {
          decompiledCaughtException = decompiledCaughtParameter1;
          var3 = decompiledCaughtException;
          throw ig.a((Throwable) ((Object) var3), "cv.T(" + param0 + ',' + param1 + ')');
        }
    }

    static {
        field_v = "This password contains repeated characters, and would be easy to guess";
        field_m = "<%0>'s game";
        field_q = "Message game";
        field_n = "Report abuse";
        field_k = "IO error - unable to communicate reliably with the data server. Please check any firewall/antivirus/filtering software.";
        field_r = "Please enter a year between <%0> and <%1>";
    }
}
