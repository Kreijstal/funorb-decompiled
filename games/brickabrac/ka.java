/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class ka extends IntrusiveNode {
    int field_x;
    int field_r;
    int field_s;
    int field_z;
    static tq field_l;
    static RgbSprite field_n;
    int field_o;
    static String field_C;
    jm field_G;
    int field_A;
    int field_q;
    int field_B;
    pq field_k;
    int field_p;
    PcmStream field_y;
    int field_v;
    int field_D;
    int field_w;
    int field_t;
    int field_i;
    static int field_E;
    int field_m;
    PcmSound field_F;
    int field_j;
    int field_u;

    final static void a(String param0, int param1) {
        int stackIn_28_0 = 0;
        RuntimeException stackIn_72_0 = null;
        StringBuilder stackIn_72_1 = null;
        String stackIn_73_2 = null;
        RuntimeException decompiledCaughtException = null;
        int var2_int = 0;
        RuntimeException var2 = null;
        int var3 = 0;
        var3 = BrickABrac.field_J ? 1 : 0;
        try {
          go.field_e = go.field_e + 1;
          if (-1 == oo.field_v &&
            ll.field_b == -1) {
            oo.field_v = pq.pointerX;
            ll.field_b = po.pointerY;
          }
          if (param1 != 22546) {
            return;
          }
          boolean decompiledFrameRemainder0 = true;
          if (param0 == null) {
            decompiledFrameRemainder0 = (null == LevelCompleteScreen.field_J);
          } else {
            decompiledFrameRemainder0 = !(param0.equals(LevelCompleteScreen.field_J));
          }
          if (decompiledFrameRemainder0) {
            if (!th.field_h &&
              go.field_e >= MonotonicTime.field_e &&
              MonotonicTime.field_e + jh.field_a > go.field_e) {
              stackIn_28_0 = 1;
            } else {
              stackIn_28_0 = 0;
            }
            var2_int = stackIn_28_0;
            if (param0 != null && (th.field_h ||
              var2_int != 0)) {
              go.field_e = MonotonicTime.field_e;
              if (var3 != 0) {
                go.field_e = 0;
              }
            } else {
              go.field_e = 0;
            }
            ad.field_j = ll.field_b;
            if (null == param0) {
              if (var2_int != 0) {
                th.field_h = true;
                if (var3 != 0) {
                  th.field_h = false;
                }
              }
            } else {
              th.field_h = false;
            }
            b.field_a = oo.field_v;
          }
          LevelCompleteScreen.field_J = param0;
          if (!th.field_h &&
            go.field_e < MonotonicTime.field_e &&
            kb.pointerChanged) {
            b.field_a = oo.field_v;
            go.field_e = 0;
            ad.field_j = ll.field_b;
          }
          if (th.field_h &&
            go.field_e == LevelPackSelectScreen.field_y) {
            th.field_h = false;
            go.field_e = 0;
          }
          ll.field_b = -1;
          oo.field_v = -1;
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2 = decompiledCaughtException;
          stackIn_72_0 = var2;
          stackIn_72_1 = new StringBuilder().append("ka.G(");
          if (param0 == null) {
            stackIn_73_2 = "null";
          } else {
            stackIn_73_2 = "{...}";
          }
          throw qb.addExceptionContext((Throwable) ((Object) stackIn_72_0), ((StringBuilder) (Object) stackIn_72_1).append(stackIn_73_2).append(',').append(param1).append(')').toString());
        }
    }

    final static void a(boolean param0, mm param1, int param2, int param3, int param4) {
        mm stackIn_68_0;
        int stackIn_68_1;
        int stackIn_68_2;
        int stackIn_68_3;
        int stackIn_68_4;
        boolean stackIn_68_5;
        boolean stackIn_69_6;
        int stackIn_90_0 = 0;
        mh stackIn_155_0;
        int stackIn_155_1;
        int stackIn_155_2;
        int stackIn_155_3;
        int stackIn_156_4 = 0;
        RuntimeException stackIn_371_0 = null;
        StringBuilder stackIn_371_1 = null;
        String stackIn_372_2 = null;
        RuntimeException decompiledCaughtException = null;
        int var5_int = 0;
        RuntimeException var5 = null;
        int var6 = 0;
        int var7 = 0;
        int var8 = 0;
        int var9 = 0;
        int var10_int = 0;
        NodeDeque var10 = null;
        int var11 = 0;
        Object var12 = null;
        id var13 = null;
        int var14 = 0;
        mh var15 = null;
        mh var16 = null;
        mh var17 = null;
        mh var18 = null;
        mh var19 = null;
        int var20 = 0;
        String var21 = null;
        int var22 = 0;
        int var23 = 0;
        int var24_int = 0;
        String var24 = null;
        int var25_int = 0;
        Object var25 = null;
        int var26_int = 0;
        Object var26 = null;
        int var27 = 0;
        int var28_int = 0;
        String var28 = null;
        int var29 = 0;
        int var30 = 0;
        int var31_int = 0;
        String var31 = null;
        int var32 = 0;
        int var11Lifetime1;
        int var25_intLifetime1;
        int var27Lifetime1;
        int var31_intLifetime1;
        int var11Lifetime2;
        int var27Lifetime2;
        var32 = BrickABrac.field_J ? 1 : 0;
        try {
          boolean decompiledFrameCompleted0 = true;
          var5_int = 0;
          var6 = 0;
          var7 = 0;
          var8 = 0;
          if (o.field_e != null && (null != NodeDeque.field_a ||
            null != AchievementsScreen.field_F ||
            null != MatchResultScreen.field_v ||
            null != me.field_e)) {
            var9 = 0;
            while (!(var9 >= cq.field_p)) {
              var10_int = 255 & o.field_e.field_Tb[var9];
              if (var32 != 0) {
                decompiledFrameCompleted0 = false;
                break;
              }
              if (null != NodeDeque.field_a &&
                null != NodeDeque.field_a[var9] &&
                NodeDeque.field_a[var9][var10_int]) {
                var5_int = 1;
              }
              if (AchievementsScreen.field_F != null &&
                AchievementsScreen.field_F[var9] != null) {
                var11 = AchievementsScreen.field_F[var9][var10_int];
                if (var11 != 0 &&
                  !ea.field_g) {
                  var5_int = 1;
                }
                if (var11 > var6) {
                  var6 = var11;
                }
              }
              if (null != me.field_e &&
                null != me.field_e[var9]) {
                var8 = var8 | me.field_e[var9][var10_int];
              }
              if (null != MatchResultScreen.field_v &&
                MatchResultScreen.field_v[var9] != null) {
                var11Lifetime2 = MatchResultScreen.field_v[var9][var10_int];
                if (var11Lifetime2 != 0 &&
                  !ea.field_g) {
                  var5_int = 1;
                }
                if (var11Lifetime2 > var7) {
                  var7 = var11Lifetime2;
                }
              }
              var9++;
            }
          }
          if (decompiledFrameCompleted0) {
            stackIn_68_0 = (mm) (param1);
            stackIn_68_1 = 2;
            stackIn_68_2 = param3 * 4 * (2 + np.field_a);
            stackIn_68_3 = np.field_a * 2 + 4;
            stackIn_68_4 = 22676;
            stackIn_68_5 = param0;
            stackIn_69_6 = (param1 == o.field_b);
            var9 = ((mm) (Object) stackIn_68_0).a(stackIn_68_1, stackIn_68_2, stackIn_68_3, stackIn_68_4, stackIn_68_5, stackIn_69_6) ? 1 : 0;
          }
          var10 = param1.field_Rb.field_bb;
          var11Lifetime1 = 73 % ((param4 - 41) / 57);
          var12 = null;
          var13 = (id) (var10.first(-67));
          while (null != var13) {
            var14 = 0;
            if (var32 != 0) {
              return;
            }
            if (null == var13.field_bb) {
              var13.field_Rb = new mh(0L, vb.field_K);
              var13.a(var13.field_Rb, 0);
              var13.field_dc = new mh(0L, OptionsScreen.field_v);
              if (vd.field_e) {
                var13.a(var13.field_dc, 0);
              }
              var13.field_dc.field_S = 2;
              var13.field_Tb = new mh(0L, ad.field_l);
              var13.a(var13.field_Tb, 0);
              var13.c(true);
              var13.field_Vb = new mh(0L, ok.field_d);
              var13.a(var13.field_Vb, 0);
              var13.field_cc = new mh(0L, MotionWaypoint.field_s);
              var13.a(var13.field_cc, 0);
              var14 = 1;
            }
            var13.field_Rb.field_Mb = null;
            var15 = var13.field_Rb;
            var13.field_Rb.field_cb = 0;
            var15.field_Ib = 0;
            var13.field_dc.field_Mb = null;
            var13.field_dc.field_cb = 0;
            var16 = var13.field_dc;
            var16.field_Ib = 0;
            var13.field_Vb.field_Mb = null;
            var17 = var13.field_Vb;
            var13.field_Vb.field_cb = 0;
            var13.field_cc.field_Mb = null;
            var17.field_Ib = 0;
            var18 = var13.field_cc;
            var13.field_cc.field_cb = 0;
            var18.field_Ib = 0;
            var13.field_Tb.field_Mb = null;
            var19 = var13.field_Tb;
            var13.field_Tb.field_cb = 0;
            var19.field_Ib = 0;
            var13.field_Ib = param1.field_Rb.field_Ib;
            var20 = 0;
            var21 = var13.field_Yb;
            var22 = 72;
            if (param1 == IsaacGenerator.field_b) {
              var22 += 42;
            }
            var21 = TextFont.truncateText(var13.field_Rb.field_O, var21, var22);
            stackIn_90_0 = (var21.equals(var13.field_Yb)) ? 0 : 1;
            var23 = stackIn_90_0;
            if (4 <= var13.field_Zb) {
              var21 = "<img=" + (LevelPackLoader.field_g - 4 + var13.field_Zb) + ">" + var21;
            } else {
              if (0 < var13.field_Zb) {
                var21 = "<img=" + (-1 + var13.field_Zb) + ">" + var21;
              }
            }
            var13.field_Rb.field_Mb = var21;
            if (!var13.i(0)) {
              var24_int = 16764006;
              var25_int = 16777215;
              if (var5_int != 0 &&
                !var13.field_ec ||
                (!(var6 <= var13.field_Wb) ||
                !(var7 <= var13.field_ac) ||
                !(0 >= (var8 & ~var13.field_Ub)))) {
                var25_int = 8421504;
                var24_int = 8414771;
              }
              var13.field_Rb.field_vb = var25_int;
              var13.field_Rb.field_Fb = var25_int;
              var13.field_Rb.field_Y = var25_int;
              var13.field_Vb.field_X = var24_int;
              var13.field_dc.field_X = var24_int;
              var13.field_Rb.field_X = var24_int;
              var13.field_dc.field_vb = var25_int;
              var13.field_dc.field_Fb = var25_int;
              var13.field_dc.field_Y = var25_int;
              var13.field_Vb.field_vb = var25_int;
              var13.field_Vb.field_Fb = var25_int;
              var13.field_Vb.field_Y = var25_int;
              if (param1 == TimedSplashScreen.field_u) {
                if (!o.field_e.field_Rb) {
                  var13.field_cc.field_Mb = LegacyUtf8Decoder.field_b;
                }
              } else if (!var13.field_Qb) {
                if (!var13.field_fc) {
                  var13.field_Vb.field_Mb = ea.field_f;
                } else {
                  var13.field_Rb.field_Mb = rd.a(ce.field_g, new String[]{var21}, (byte) 103);
                  var13.field_Vb.field_Mb = ip.field_t;
                  var13.field_cc.field_Mb = gq.field_Wb;
                }
              } else {
                var13.field_Rb.field_Mb = rd.a(ll.field_a, new String[]{var21}, (byte) 103);
                var13.field_cc.field_Mb = wl.field_L;
              }
              var26_int = 0;
              if (null != o.field_e &&
                hn.b((byte) 7) &&
                ~oc.field_p != ~var13.field_gc) {
                if (null != var13.field_Vb.field_Mb) {
                  var27 = var13.field_Vb.g(123) + 2 * om.field_oc;
                  var13.field_Vb.a(np.field_a, var20, var26_int, var27, (byte) 64);
                  var26_int = var26_int + var27;
                }
                if (var13.field_cc.field_Mb != null) {
                  if (TimedSplashScreen.field_u == param1) {
                    var27Lifetime2 = 40;
                  } else {
                    var27Lifetime2 = var13.field_cc.g(99) + 2 * om.field_oc;
                  }
                  var13.field_cc.a(np.field_a, var20, var26_int, var27Lifetime2, (byte) 64);
                  var26_int = var26_int + var27Lifetime2;
                }
              }
              stackIn_155_0 = var13.field_Rb;
              stackIn_155_1 = np.field_a;
              stackIn_155_2 = var20;
              stackIn_155_3 = var26_int;
              if (vd.field_e) {
                stackIn_156_4 = 42;
              } else {
                stackIn_156_4 = 0;
              }
              ((mh) (Object) stackIn_155_0).a(stackIn_155_1, stackIn_155_2, stackIn_155_3, -stackIn_156_4 + var13.field_Ib - var26_int, (byte) 64);
              var13.field_dc.field_Mb = Integer.toString(var13.field_Wb);
              var13.field_dc.a(np.field_a, var20, -40 + var13.field_Ib, 40, (byte) 64);
              if (var13.field_Rb.field_kb &&
                var23 != 0) {
                ep.field_e = var13.field_Yb;
                if (null != PacketBuffer.field_i &&
                  PacketBuffer.field_i[var13.field_Zb] != null) {
                  ep.field_e = ep.field_e + " - " + PacketBuffer.field_i[var13.field_Zb];
                }
              } else {
                if (var13.field_Rb.field_kb &&
                  null != PacketBuffer.field_i &&
                  PacketBuffer.field_i[var13.field_Zb] != null) {
                  ep.field_e = PacketBuffer.field_i[var13.field_Zb];
                }
              }
              var20 = var20 + np.field_a;
            }
            var24 = SoundPlayback.a((byte) -110, var21, var13.field_kc);
            if (null != var24) {
              var25_intLifetime1 = var13.field_Tb.field_O.countWrappedLines(var24, -om.field_oc + var13.field_Ib - om.field_oc);
              var13.field_Tb.field_jb = var13.field_ic * 256 / cm.field_o;
              var13.field_Tb.field_Mb = var24;
              var13.field_Tb.a(var25_intLifetime1 * np.field_a, var20, om.field_oc, var13.field_Ib - 2 * om.field_oc, (byte) 64);
              var20 = var20 + np.field_a * var25_intLifetime1;
            }
            if (var9 == 0) {
              var13.field_C = var20 - var13.field_cb;
            }
            if (var14 != 0) {
              param1.field_Rb.a((mh) (var12), 2, var13, 17290);
            }
            boolean decompiledFrameRemainder0 = true;
            if (var13.field_L != 0 &&
              !var13.i(0)) {
              if (0 == var13.field_Vb.field_L) {
                if (var13.field_cc.field_L != 0) {
                  rf.a(param2, var13.field_gc, true);
                } else {
                  SpriteGeometry.a(0, qo.pressY, var13, param1, (byte) 58, tb.pressX, 0);
                }
                decompiledFrameRemainder0 = false;
              }
              else {
                hd.a(var13.field_gc, 66, param2);
              }
            }
            var12 = var13;
            if (var13.field_G &&
              !var13.i(0)) {
              var25 = null;
              if (~var13.field_gc == ~oc.field_p) {
                if (var5_int != 0 &&
                  !var13.field_ec) {
                  var25 = ug.field_J;
                } else {
                  if (var13.field_ac >= var7) {
                    if (var6 > var13.field_Wb) {
                      var25 = rd.a(ea.field_h, new String[]{null, Integer.toString(var6)}, (byte) 103);
                    } else {
                      if ((var8 & ~var13.field_Ub) != 0) {
                        var26_int = r.a((byte) -82, ~var13.field_Ub & var8);
                        var25 = ObjectHistoryBuffer.field_j;
                        if (var26_int > 0 &&
                          eb.field_p != null &&
                          var26_int <= eb.field_p.length &&
                          eb.field_p[var26_int - 1] != null) {
                          var25 = eb.field_p[var26_int - 1][1];
                        }
                      }
                    }
                  } else {
                    var26_int = -var13.field_ac + var7;
                    if (var26_int == 1) {
                      var25 = SaveResultsPromptScreen.field_w;
                    }
                    var25 = rd.a(Brick.field_F, new String[]{null, Integer.toString(var26_int)}, (byte) 103);
                  }
                }
              } else {
                if (var5_int != 0 &&
                  !var13.field_ec) {
                  var25 = rd.a(MenuSelection.field_f, new String[]{var21}, (byte) 103);
                } else {
                  if (var13.field_ac >= var7) {
                    if (var13.field_Wb < var6) {
                      var25 = rd.a(cp.field_H, new String[]{var21, Integer.toString(var6)}, (byte) 103);
                    } else {
                      if ((var8 & ~var13.field_Ub) != 0) {
                        var26_int = r.a((byte) -82, ~var13.field_Ub & var8);
                        var25 = rd.a(IntNode.field_m, new String[]{var21}, (byte) 103);
                        if (var26_int > 0 &&
                          null != eb.field_p &&
                          var26_int <= eb.field_p.length &&
                          eb.field_p[-1 + var26_int] != null) {
                          var25 = rd.a(eb.field_p[var26_int - 1][2], new String[]{var21}, (byte) 103);
                        }
                      }
                    }
                  } else {
                    var26_int = var7 - var13.field_ac;
                    if (var26_int == 1) {
                      var25 = rd.a(di.field_b, new String[]{var21}, (byte) 103);
                    }
                    var25 = rd.a(qh.field_g, new String[]{var21, Integer.toString(var26_int)}, (byte) 103);
                  }
                }
              }
              if (var25 != null) {
                var25 = "<col=A00000>" + (String) (var25);
                var26 = null;
                var27Lifetime1 = 0;
                var28_int = 0;
                while (true) {
                  if (cq.field_p > var28_int) {
                    var29 = o.field_e.field_Tb[var28_int] & 255;
                    var30 = 0;
                    if (NodeDeque.field_a != null &&
                      NodeDeque.field_a[var28_int] != null &&
                      NodeDeque.field_a[var28_int][var29] &&
                      !var13.field_ec) {
                      var30 = 1;
                    }
                    if (null != AchievementsScreen.field_F &&
                      AchievementsScreen.field_F[var28_int] != null) {
                      var31_int = AchievementsScreen.field_F[var28_int][var29];
                      if (var31_int != 0 &&
                        !ea.field_g &&
                        !var13.field_ec) {
                        var30 = 1;
                      }
                      if (var13.field_Wb < var31_int) {
                        var30 = 1;
                      }
                    }
                    if (null != MatchResultScreen.field_v &&
                      null != MatchResultScreen.field_v[var28_int]) {
                      var31_intLifetime1 = MatchResultScreen.field_v[var28_int][var29];
                      if (var31_intLifetime1 != 0 &&
                        !ea.field_g &&
                        !var13.field_ec) {
                        var30 = 1;
                      }
                      if (var31_intLifetime1 > var13.field_ac) {
                        var30 = 1;
                      }
                    }
                    if (null != me.field_e &&
                      me.field_e[var28_int] != null &&
                      (me.field_e[var28_int][var29] & ~var13.field_Ub) != 0) {
                      var30 = 1;
                    }
                    if (var30 != 0) {
                      var31 = "<col=A00000>" + rg.field_b[var28_int] + "</col>";
                      if (var26 == null) {
                        var26 = var31;
                      } else {
                        var26 = (String) (var26) + ", " + var31;
                        var27Lifetime1 = 1;
                      }
                    }
                    var28_int++;
                    continue;
                  }
                  if (param1 != TimedSplashScreen.field_u ||
                    !hn.b((byte) 7)) {
                    if (var27Lifetime1 == 0) {
                      var25 = (String) (var25) + "<br>" + rd.a(jo.field_k, new String[]{(String) (var26)}, (byte) 103);
                    } else {
                      var25 = (String) (var25) + "<br>" + jm.field_l + (String) (var26);
                    }
                  } else {
                    if (var27Lifetime1 == 0) {
                      var25 = (String) (var25) + "<br>" + rd.a(id.field_bc, new String[]{(String) (var26)}, (byte) 103);
                    } else {
                      var25 = (String) (var25) + "<br>" + kb.field_Rb + (String) (var26);
                    }
                  }
                  break;
                }
                if (TimedSplashScreen.field_u == param1 &&
                  !hn.b((byte) 7)) {
                  var28 = o.field_e.field_Fc;
                  var25 = (String) (var25) + "<br>" + rd.a(ba.field_y, new String[]{var28}, (byte) 103);
                }
                ep.field_e = (String) (var25);
              }
            }
            var13 = (id) (var10.next((byte) 116));
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var5 = decompiledCaughtException;
          stackIn_371_0 = var5;
          stackIn_371_1 = new StringBuilder().append("ka.D(").append(param0).append(',');
          if (param1 == null) {
            stackIn_372_2 = "null";
          } else {
            stackIn_372_2 = "{...}";
          }
          throw qb.addExceptionContext((Throwable) ((Object) stackIn_371_0), ((StringBuilder) (Object) stackIn_371_1).append(stackIn_372_2).append(',').append(param2).append(',').append(param3).append(',').append(param4).append(')').toString());
        }
    }

    public static void c(byte param0) {
        RuntimeException decompiledCaughtException = null;
        RuntimeException var1 = null;
        try {
          field_l = null;
          field_C = null;
          if (param0 != 67) {
            field_n = (RgbSprite) null;
          }
          field_n = null;
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var1 = decompiledCaughtException;
          throw qb.addExceptionContext((Throwable) ((Object) var1), "ka.A(" + param0 + ')');
        }
    }

    final void a(int param0) {
        this.field_y = null;
        this.field_F = null;
        this.field_k = null;
        if (param0 > -39) {
          return;
        }
        try {
          this.field_G = null;
        } catch (RuntimeException runtimeException) {
          throw qb.addExceptionContext((Throwable) ((Object) runtimeException), "ka.B(" + param0 + ')');
        }
    }

    final static void a(int param0, int param1, int param2, ta param3) {
        RuntimeException runtimeException = null;
        RuntimeException stackIn_6_0 = null;
        StringBuilder stackIn_6_1 = null;
        String stackIn_7_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          vg.field_c = param3;
          un.field_a = param0;
          Paddle.field_A = param2;
          if (param1 >= -25) {
            field_l = (tq) null;
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          runtimeException = decompiledCaughtException;
          stackIn_6_0 = runtimeException;
          stackIn_6_1 = new StringBuilder().append("ka.F(").append(param0).append(',').append(param1).append(',').append(param2).append(',');
          if (param3 == null) {
            stackIn_7_2 = "null";
          } else {
            stackIn_7_2 = "{...}";
          }
          throw qb.addExceptionContext((Throwable) ((Object) stackIn_6_0), ((StringBuilder) (Object) stackIn_6_1).append(stackIn_7_2).append(')').toString());
        }
    }

    final static boolean a(byte param0) {
        RuntimeException var1 = null;
        boolean stackIn_10_0 = false;
        RuntimeException decompiledCaughtException = null;
        try {
          if (param0 < 60) {
            field_E = -98;
          }
          stackIn_10_0 = (r.field_A) && (~ga.field_i != ~pp.field_a);
          return stackIn_10_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var1 = decompiledCaughtException;
          throw qb.addExceptionContext((Throwable) ((Object) var1), "ka.E(" + param0 + ')');
        }
    }

    final static void a(int[] param0, int param1, int[] param2, boolean param3, boolean param4, fr param5, boolean param6) {
        int stackIn_65_0 = 0;
        int stackIn_65_1 = 0;
        RuntimeException stackIn_70_0 = null;
        StringBuilder stackIn_70_1 = null;
        String stackIn_71_2 = null;
        StringBuilder stackIn_74_1 = null;
        String stackIn_75_2 = null;
        StringBuilder stackIn_78_1 = null;
        String stackIn_79_2 = null;
        RuntimeException decompiledCaughtException = null;
        int var7_int = 0;
        RuntimeException var7 = null;
        int var8 = 0;
        int var9 = 0;
        int var10 = 0;
        int var11 = 0;
        int var12 = 0;
        int var13 = 0;
        int var14 = 0;
        int var15 = 0;
        int var16 = 0;
        int var17 = 0;
        int var18 = 0;
        int var19 = 0;
        int var20 = 0;
        int var21 = 0;
        int var22 = 0;
        int var23 = 0;
        int var24 = 0;
        int var25 = 0;
        int var26 = 0;
        int var27 = 0;
        int var28 = 0;
        int var29 = 0;
        int var30 = 0;
        int var21Lifetime1;
        int var21Lifetime2;
        int var22Lifetime1;
        int var22Lifetime2;
        int var23Lifetime1;
        int var23Lifetime2;
        int var24Lifetime1;
        int var25Lifetime1;
        int var26Lifetime1;
        int var27Lifetime1;
        int var28Lifetime1;
        int var29Lifetime1;
        var30 = BrickABrac.field_J ? 1 : 0;
        try {
          var7_int = 2147483647;
          var8 = -2147483648;
          var21 = param0[3] >> 2;
          var22 = param0[4] >> 2;
          var23 = param0[5] >> 2;
          if (param1 != -16283) {
            field_l = (tq) null;
          }
          var24 = param0[6] >> 2;
          var25 = param0[7] >> 2;
          var26 = param0[8] >> 2;
          var27 = param0[9] >> 2;
          var28 = param0[10] >> 2;
          var13 = var25 * param2[4] + (var24 * param2[3] + param2[5] * var26) >> 14;
          var29 = param0[11] >> 2;
          var12 = param2[5] * var23 + (param2[3] * var21 + param2[4] * var22) >> 14;
          var16 = param2[8] * var26 + var24 * param2[6] + param2[7] * var25 >> 14;
          var18 = var23 * param2[11] + param2[10] * var22 + param2[9] * var21 >> 14;
          var15 = param2[7] * var22 + var21 * param2[6] + param2[8] * var23 >> 14;
          var20 = var28 * param2[10] + (param2[9] * var27 + param2[11] * var29) >> 14;
          var19 = param2[11] * var26 + (var25 * param2[10] + param2[9] * var24) >> 14;
          var14 = param2[3] * var27 - (-(param2[4] * var28) - param2[5] * var29) >> 14;
          var17 = param2[8] * var29 + (var27 * param2[6] + var28 * param2[7]) >> 14;
          var21Lifetime1 = param2[0] - param0[0];
          var22Lifetime1 = param2[1] - param0[1];
          var23Lifetime1 = -param0[2] + param2[2];
          var9 = param0[4] * var22Lifetime1 + var21Lifetime1 * param0[3] + var23Lifetime1 * param0[5] >> -LevelPackCard.field_k + 16;
          var10 = var23Lifetime1 * param0[8] + (param0[7] * var22Lifetime1 + var21Lifetime1 * param0[6]) >> -LevelPackCard.field_k + 16;
          var11 = param0[11] * var23Lifetime1 + (var21Lifetime1 * param0[9] + var22Lifetime1 * param0[10]) >> 16;
          var21Lifetime2 = mg.field_d;
          var22Lifetime2 = mg.field_a;
          var23Lifetime2 = 0;
          scanLoop1: while (true) {
            if (param5.field_w > var23Lifetime2) {
              var24Lifetime1 = param5.field_B[var23Lifetime2];
              var25Lifetime1 = param5.field_Q[var23Lifetime2];
              var26Lifetime1 = param5.field_P[var23Lifetime2];
              var27Lifetime1 = var9 + (var24Lifetime1 * var12 + var15 * var25Lifetime1 + var26Lifetime1 * var18 >> -LevelPackCard.field_k + 16);
              var28Lifetime1 = var10 + (var26Lifetime1 * var19 + var24Lifetime1 * var13 + var25Lifetime1 * var16 >> -LevelPackCard.field_k + 16);
              var29Lifetime1 = var11 + (var24Lifetime1 * var14 + var17 * var25Lifetime1 + var26Lifetime1 * var20 >> 16);
              stackIn_65_0 = ~var29Lifetime1;
              stackIn_65_1 = -51;
              if (var30 == 0) {
                if (stackIn_65_0 <= stackIn_65_1) {
                  ArchiveNetworkRequest.field_M[var23Lifetime2] = var21Lifetime2 + var27Lifetime1 / var29Lifetime1;
                  ed.field_e[var23Lifetime2] = var28Lifetime1 / var29Lifetime1 + var22Lifetime2;
                  if (var7_int > var29Lifetime1) {
                    var7_int = var29Lifetime1;
                  }
                  Paddle.field_v[var23Lifetime2] = var29Lifetime1;
                  if (var29Lifetime1 > var8) {
                    var8 = var29Lifetime1;
                  }
                } else {
                  Paddle.field_v[var23Lifetime2] = -2147483648;
                }
                if (param3) {
                  fh.field_f[var23Lifetime2] = var27Lifetime1 >> LevelPackCard.field_k;
                  ep.field_f[var23Lifetime2] = var28Lifetime1 >> LevelPackCard.field_k;
                  ml.field_c[var23Lifetime2] = var29Lifetime1;
                }
                var23Lifetime2++;
                continue;
              }
            } else {
              if (null != param5.field_F &&
                null != param5.field_E &&
                param5.field_O != null &&
                null != param5.field_I &&
                param5.field_D != null &&
                null != param5.field_u &&
                param5.field_g != null &&
                null != param5.field_s &&
                param5.field_i != null) {
                var23Lifetime2 = 0;
                while (!(param5.field_C <= var23Lifetime2)) {
                  var24Lifetime1 = param5.field_F[var23Lifetime2];
                  var25Lifetime1 = param5.field_E[var23Lifetime2];
                  var26Lifetime1 = param5.field_O[var23Lifetime2];
                  nj.field_v[var23Lifetime2] = (var15 * var25Lifetime1 + (var12 * var24Lifetime1 + var18 * var26Lifetime1) >> 16) + var9;
                  nd.field_e[var23Lifetime2] = var10 + (var16 * var25Lifetime1 + (var24Lifetime1 * var13 + var26Lifetime1 * var19) >> 16);
                  jk.field_r[var23Lifetime2] = (var14 * var24Lifetime1 - (-(var25Lifetime1 * var17) - var20 * var26Lifetime1) >> 16) + var11;
                  var24Lifetime1 = param5.field_I[var23Lifetime2];
                  var25Lifetime1 = param5.field_D[var23Lifetime2];
                  var26Lifetime1 = param5.field_u[var23Lifetime2];
                  LevelPackCard.field_l[var23Lifetime2] = (var24Lifetime1 * var12 + var25Lifetime1 * var15 + var18 * var26Lifetime1 >> 16) + var9;
                  bf.field_M[var23Lifetime2] = var10 + (var19 * var26Lifetime1 + (var13 * var24Lifetime1 + var16 * var25Lifetime1) >> 16);
                  LevelCompleteScreen.field_G[var23Lifetime2] = (var26Lifetime1 * var20 + (var24Lifetime1 * var14 + var25Lifetime1 * var17) >> 16) + var11;
                  var24Lifetime1 = param5.field_g[var23Lifetime2];
                  var25Lifetime1 = param5.field_s[var23Lifetime2];
                  var26Lifetime1 = param5.field_i[var23Lifetime2];
                  vd.field_b[var23Lifetime2] = var9 + (var25Lifetime1 * var15 + (var24Lifetime1 * var12 + var26Lifetime1 * var18) >> 16);
                  NewAchievementsScreen.field_I[var23Lifetime2] = var10 + (var19 * var26Lifetime1 + var13 * var24Lifetime1 + var16 * var25Lifetime1 >> 16);
                  il.field_D[var23Lifetime2] = (var14 * var24Lifetime1 - (-(var17 * var25Lifetime1) - var26Lifetime1 * var20) >> 16) + var11;
                  var23Lifetime2++;
                  if (var30 != 0) {
                    return;
                  }
                }
              }
              if (param4) {
                var9 = param2[3];
                var10 = param2[4];
                var11 = param2[5];
                var12 = param2[6];
                var13 = param2[7];
                var14 = param2[8];
                var15 = param2[9];
                var16 = param2[10];
                var17 = param2[11];
                var18 = 0;
                while (!(var18 >= param5.field_o)) {
                  stackIn_65_0 = ~var18;
                  stackIn_65_1 = ~wl.field_R.length;
                  if (var30 != 0) {
                    break scanLoop1;
                  }
                  if (stackIn_65_0 <= stackIn_65_1) {
                    break;
                  }
                  var19 = param5.field_n[var18];
                  var20 = param5.field_H[var18];
                  var21Lifetime2 = param5.field_a[var18];
                  wl.field_R[var18] = var21Lifetime2 * var15 + (var9 * var19 + var20 * var12) >> 16;
                  ff.field_f[var18] = var21Lifetime2 * var16 + var13 * var20 + var19 * var10 >> 16;
                  nn.field_h[var18] = var19 * var11 - (-(var20 * var14) - var21Lifetime2 * var17) >> 16;
                  var18++;
                }
              }
              stackIn_65_0 = param6 ? 1 : 0;
              stackIn_65_1 = var7_int;
            }
            break;
          }
          bm.a(stackIn_65_0 != 0, stackIn_65_1, var8, false, param5);
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var7 = decompiledCaughtException;
          stackIn_70_0 = var7;
          stackIn_70_1 = new StringBuilder().append("ka.C(");
          if (param0 == null) {
            stackIn_71_2 = "null";
          } else {
            stackIn_71_2 = "{...}";
          }
          stackIn_74_1 = ((StringBuilder) (Object) stackIn_70_1).append(stackIn_71_2).append(',').append(param1).append(',');
          if (param2 == null) {
            stackIn_75_2 = "null";
          } else {
            stackIn_75_2 = "{...}";
          }
          stackIn_78_1 = ((StringBuilder) (Object) stackIn_74_1).append(stackIn_75_2).append(',').append(param3).append(',').append(param4).append(',');
          if (param5 == null) {
            stackIn_79_2 = "null";
          } else {
            stackIn_79_2 = "{...}";
          }
          throw qb.addExceptionContext((Throwable) ((Object) stackIn_70_0), ((StringBuilder) (Object) stackIn_78_1).append(stackIn_79_2).append(',').append(param6).append(')').toString());
        }
    }

    ka() {
    }

    static {
        field_C = "<%0> is not on your friend list.";
    }
}
