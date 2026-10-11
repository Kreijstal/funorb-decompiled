/*
 * Decompiled by CFR-JS 0.4.0.
 */
public final class MinerDisturbance extends ob {
    private int[] field_L;
    private boolean field_eb;
    private int field_R;
    private int field_M;
    private boolean field_Y;
    private int[] field_D;
    private int field_bb;
    private int field_T;
    private int field_cb;
    private int field_N;
    private boolean field_X;
    private int field_P;
    private int field_C;
    private int field_U;
    mc field_Q;
    boolean field_K;
    private int field_Z;
    private int field_E;
    private int field_db;
    private boolean field_O;
    private int field_G;
    private int field_I;
    private int field_W;
    private int field_F;
    private int field_H;
    private int field_S;
    private static int field_J;
    private boolean field_V;
    public static int field_ab;

    final static void a(java.awt.Color param0, byte param1, String param2, boolean param3, int param4) {
        RuntimeException stackIn_27_0 = null;
        StringBuilder stackIn_27_1 = null;
        String stackIn_28_2 = null;
        StringBuilder stackIn_31_1 = null;
        String stackIn_32_2 = null;
        Throwable decompiledCaughtException = null;
        int var5_int = 0;
        Exception var5 = null;
        RuntimeException var5_ref = null;
        java.awt.Graphics var6 = null;
        java.awt.Graphics var7 = null;
        Exception var7_ref = null;
        int var8 = 0;
        int var9 = 0;
        try {
          try {
            var5_int = -3 % ((-40 - param1) / 54);
            var6 = ef.field_c.getGraphics();
            if (null == kh.field_a) {
              kh.field_a = new java.awt.Font("Helvetica", 1, 13);
            }
            if (param3) {
              var6.setColor(java.awt.Color.black);
              var6.fillRect(0, 0, nk.field_x, ml.field_a);
            }
            if (param0 == null) {
              param0 = new java.awt.Color(140, 17, 17);
            }
            try {
              if (null == pk.field_a) {
                pk.field_a = ef.field_c.createImage(304, 34);
              }
              var7 = pk.field_a.getGraphics();
              var7.setColor(param0);
              var7.drawRect(0, 0, 303, 33);
              var7.fillRect(2, 2, param4 * 3, 30);
              var7.setColor(java.awt.Color.black);
              var7.drawRect(1, 1, 301, 31);
              var7.fillRect(3 * param4 + 2, 2, -(3 * param4) + 300, 30);
              var7.setFont(kh.field_a);
              var7.setColor(java.awt.Color.white);
              var7.drawString(param2, (-(6 * param2.length()) + 304) / 2, 22);
              var6.drawImage(pk.field_a, -152 + nk.field_x / 2, -18 + ml.field_a / 2, (java.awt.image.ImageObserver) null);
            } catch (java.lang.Exception decompiledCaughtParameter0) {
              decompiledCaughtException = decompiledCaughtParameter0;
              var7_ref = (Exception) (Object) decompiledCaughtException;
              var8 = -152 + nk.field_x / 2;
              var9 = -18 + ml.field_a / 2;
              var6.setColor(param0);
              var6.drawRect(var8, var9, 303, 33);
              var6.fillRect(2 + var8, 2 + var9, param4 * 3, 30);
              var6.setColor(java.awt.Color.black);
              var6.drawRect(var8 + 1, var9 + 1, 301, 31);
              var6.fillRect(var8 + (2 + 3 * param4), var9 + 2, 300 - 3 * param4, 30);
              var6.setFont(kh.field_a);
              var6.setColor(java.awt.Color.white);
              var6.drawString(param2, var8 + (304 - 6 * param2.length()) / 2, 22 + var9);
            }
            if (null != ab.field_c) {
              var6.setFont(kh.field_a);
              var6.setColor(java.awt.Color.white);
              var6.drawString(ab.field_c, nk.field_x / 2 - ab.field_c.length() * 6 / 2, ml.field_a / 2 - 26);
            }
          } catch (java.lang.Exception decompiledCaughtParameter1) {
            decompiledCaughtException = decompiledCaughtParameter1;
            var5 = (Exception) (Object) decompiledCaughtException;
            ef.field_c.repaint();
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter2) {
          decompiledCaughtException = decompiledCaughtParameter2;
          var5_ref = (RuntimeException) (Object) decompiledCaughtException;
          stackIn_27_0 = var5_ref;
          stackIn_27_1 = new StringBuilder().append("MinerDisturbance.BB(");
          if (param0 == null) {
            stackIn_28_2 = "null";
          } else {
            stackIn_28_2 = "{...}";
          }
          stackIn_31_1 = ((StringBuilder) (Object) stackIn_27_1).append(stackIn_28_2).append(',').append(param1).append(',');
          if (param2 == null) {
            stackIn_32_2 = "null";
          } else {
            stackIn_32_2 = "{...}";
          }
          throw lj.a((Throwable) ((Object) stackIn_27_0), ((StringBuilder) (Object) stackIn_31_1).append(stackIn_32_2).append(',').append(param3).append(',').append(param4).append(')').toString());
        }
    }

    private final void a(int param0, byte param1) {
        try {
          ll.field_h = 38054639 ^ param0;
          if (param1 <= 114) {
            this.w(-76);
          }
        } catch (RuntimeException runtimeException) {
          throw lj.a((Throwable) ((Object) runtimeException), "MinerDisturbance.RA(" + param0 + ',' + param1 + ')');
        }
    }

    private final int v(int param0) {
        RuntimeException var2 = null;
        int stackIn_4_0 = 0;
        RuntimeException decompiledCaughtException = null;
        try {
          if (param0 != -1) {
            this.b(-82);
          }
          stackIn_4_0 = 38054639 ^ ph.field_d;
          return stackIn_4_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2 = decompiledCaughtException;
          throw lj.a((Throwable) ((Object) var2), "MinerDisturbance.BA(" + param0 + ')');
        }
    }

    final void b(boolean param0) {
        Object stackIn_5_0 = null;
        int stackIn_11_0 = 0;
        Object stackIn_11_1 = null;
        boolean stackIn_12_2 = false;
        boolean stackIn_46_0 = false;
        boolean stackIn_83_0 = false;
        vm stackIn_88_0;
        String stackIn_88_1;
        int stackIn_88_2;
        int stackIn_88_3;
        int stackIn_89_4;
        RuntimeException decompiledCaughtException = null;
        Object var2 = null;
        RuntimeException var2_ref = null;
        int var3 = 0;
        int var4 = 0;
        var4 = field_ab;
        try {
          if (null == kf.field_d) {
            stackIn_5_0 = ef.field_c;
          } else {
            stackIn_5_0 = kf.field_d;
          }
          var2 = stackIn_5_0;
          if (hl.b((byte) -125)) {
            stackIn_11_0 = 240;
            stackIn_11_1 = var2;
            if (kf.field_d == null) {
              stackIn_12_2 = rd.field_f;
            } else {
              stackIn_12_2 = true;
            }
            wc.a(stackIn_11_0, (java.awt.Canvas) (stackIn_11_1), stackIn_12_2);
            return;
          }
          if (!nn.field_n) {
            mf.a(-752960408, (java.awt.Canvas) (var2));
            return;
          }
          if (!od.e(param0) &&
            !qi.f(-9202)) {
            if (cm.field_o == 0 &&
              qd.field_S ||
              cm.field_o == 1 &&
              ci.field_b) {
              this.t(48);
              if (var4 != 0) {
                eh.d();
              }
            } else {
              eh.d();
            }
            stackIn_46_0 = !(ke.field_V);
            ij.field_p = stackIn_46_0;
            if (!ke.field_V &&
              il.e(-31391) &&
              uh.field_e) {
              this.d(false);
            }
            if (ke.field_V) {
              this.g((byte) -110);
            }
            if (this.field_Q != null) {
              this.field_Q.b(77);
            }
            cc.a((byte) -125);
            if (!gd.field_w) {
              ff.a(false);
            }
            if (0 != on.field_u) {
              eh.b(0, 0, 640, 480, 1, on.field_u << 1);
            }
            boolean decompiledSharedTail0 = !(oc.d(108));
            if (!decompiledSharedTail0) {
              ee.i(14955);
              decompiledSharedTail0 = (var4 != 0);
            }
            if ((decompiledSharedTail0) &&
              (g.a((byte) -126))) {
              if (kf.field_d != null) {
                stackIn_83_0 = true;
              } else {
                stackIn_83_0 = rd.field_f;
              }
              pc.b(stackIn_83_0, (byte) 120);
            }
            if (this.field_V) {
              var3 = 60;
              ce.field_d.c("FPS: " + nd.field_b, 630, var3, 65535, -1);
              var3 += 30;
              ce.field_d.c("LPS: " + fd.field_F, 630, var3, 65535, -1);
              var3 += 30;
              ce.field_d.c("WALRUS KILLED: " + hn.field_c, 630, var3, 65535, -1);
              var3 += 30;
              ce.field_d.c("POINTS WITHOUT KILLING PINNIPED: " + eb.field_e, 630, var3, 65535, -1);
              var3 += 30;
              ce.field_d.c("POINTS EARNED COVERED IN OIL: " + eb.field_b, 630, var3, 65535, -1);
              var3 += 30;
              ce.field_d.c("SNOWTILES MINED: " + lb.field_r, 630, var3, 65535, -1);
              var3 += 30;
              ce.field_d.c("ICE BLOCKS CREATED: " + re.field_d, 630, var3, 65535, -1);
              var3 += 30;
              ce.field_d.c("PERCENT OIL FOR ACHIEVEMENT: " + 100 * pi.field_a / 2800 + "%", 630, var3, 65535, -1);
              var3 += 30;
              ce.field_d.c("CURRENTLEVEL: " + je.field_u, 630, var3, 65535, -1);
              var3 += 30;
              stackIn_88_0 = ce.field_d;
              stackIn_88_1 = "SECONDS FOR ERRUPTION: " + me.field_h / 50;
              stackIn_88_2 = 630;
              stackIn_88_3 = var3;
              if (me.field_h < 2000) {
                stackIn_89_4 = 65280;
              } else {
                stackIn_89_4 = 16711680;
              }
              ((vm) (Object) stackIn_88_0).c(stackIn_88_1, stackIn_88_2, stackIn_88_3, stackIn_89_4, -1);
              var3 += 30;
              ce.field_d.c("ACHIVEMENT BITS: " + dl.b((byte) -27), 630, var3, 65535, -1);
              var3 += 30;
              ce.field_d.c("GAMEMULTI: " + ne.a(false), 630, var3, 65535, -1);
            }
            if (wj.field_j >= 2) {
              ug.field_a.b(-91);
              pn.b((byte) -17);
            }
            cl.a((java.awt.Canvas) (var2), 0, 0, 310);
            return;
          }
          pa.a(true, ec.field_f, 100.0f);
          mf.a(-752960408, (java.awt.Canvas) (var2));
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2_ref = decompiledCaughtException;
          throw lj.a((Throwable) ((Object) var2_ref), "MinerDisturbance.QA(" + param0 + ')');
        }
    }

    private final boolean i(byte param0) {
        int stackIn_47_0 = 0;
        int stackIn_47_1 = 0;
        int stackIn_62_0 = 0;
        int stackIn_66_0 = 0;
        int stackIn_66_1 = 0;
        int stackIn_81_0 = 0;
        RuntimeException decompiledCaughtException = null;
        int var2_int = 0;
        ln[] var2 = null;
        RuntimeException var2_ref = null;
        int[] var3 = null;
        int var3_int = 0;
        int var4 = 0;
        int var5 = 0;
        ln[] var2Lifetime1;
        var5 = field_ab;
        try {
          if (null != fl.field_f &&
            fl.field_f.a(false, "supervolcano")) {
            if (null == je.field_k) {
              je.field_k = td.a("permaice", fl.field_f, "supervolcano", (byte) 122);
              je.field_y = td.a("damagedpermaice", fl.field_f, "supervolcano", (byte) 123);
              je.field_n = td.a("damagedpermaice2", fl.field_f, "supervolcano", (byte) 120);
              je.field_G = td.a("damagedpermaice3", fl.field_f, "supervolcano", (byte) 116);
              return false;
            }
            if (null == je.field_L) {
              je.field_L = td.a("snow", fl.field_f, "supervolcano", (byte) 119);
              je.field_c = td.a("damagedsnow", fl.field_f, "supervolcano", (byte) 119);
              je.field_C = td.a("damagedsnow2", fl.field_f, "supervolcano", (byte) 123);
              je.field_g = td.a("damagedsnow3", fl.field_f, "supervolcano", (byte) 120);
              return false;
            }
            if (param0 <= 0) {
              this.x(58);
            }
            if (null == je.field_d[1]) {
              je.field_d[1] = td.a("rock", fl.field_f, "supervolcano", (byte) 113);
              je.field_P[1] = td.a("damagedrock", fl.field_f, "supervolcano", (byte) 118);
              je.field_R[1] = td.a("damagedrock2", fl.field_f, "supervolcano", (byte) 115);
              je.field_p[1] = td.a("damagedrock3", fl.field_f, "supervolcano", (byte) 123);
              return false;
            }
            if (null == je.field_z[0]) {
              je.field_z[0] = md.a("snowleft", fl.field_f, 10, "supervolcano");
              je.field_z[2] = md.a("snowright", fl.field_f, 10, "supervolcano");
              je.field_z[1] = md.a("snowtop", fl.field_f, 10, "supervolcano");
              je.field_z[3] = md.a("snowbottom", fl.field_f, 10, "supervolcano");
              return false;
            }
            if (null == hk.field_a) {
              je.field_x[1] = td.a("slopes", fl.field_f, "supervolcano", (byte) 115);
              je.field_j[1] = td.a("sky", fl.field_f, "supervolcano", (byte) 120);
              ph.field_e = td.a("walrus", fl.field_f, "supervolcano", (byte) 122);
              fi.field_b = td.a("penguin", fl.field_f, "supervolcano", (byte) 124);
              g.field_j = td.a("icebomb", fl.field_f, "supervolcano", (byte) 118);
              hk.field_a = td.a("freezeexplosion", fl.field_f, "supervolcano", (byte) 113);
              me.field_k[1] = jn.a("levelbackground", -29553, "supervolcano", fl.field_f);
              return false;
            }
            if (sa.field_t[1][0] == null) {
              sa.field_t[1][0] = pb.a("supervolcano", fl.field_f, "rankings1", (byte) -77);
              var2 = tb.a("rankings2", "supervolcano", fl.field_f, 1);
              ai.a(var2, 0, sa.field_t[1], 1, var2.length);
              var2Lifetime1 = tb.a("rankings3", "supervolcano", fl.field_f, 1);
              ai.a(var2Lifetime1, 0, sa.field_t[1], 6, var2Lifetime1.length);
              sa.field_t[1][8] = pb.a("supervolcano", fl.field_f, "rankings4", (byte) -77);
              sa.field_t[1][9] = pb.a("supervolcano", fl.field_f, "rankings5", (byte) -77);
              var3_int = 0;
              while (var3_int < sa.field_t[1].length) {
                sa.field_t[1][var3_int].a();
                var3_int++;
                if (var5 == 0) {
                  continue;
                }
                break;
              }
              return false;
            }
            if (null == qf.field_o[1][8]) {
              nn.field_h[1] = jn.a("gravestone", -29553, "supervolcano", fl.field_f);
              dl.field_d[1] = jn.a("certificate_pattern", -29553, "supervolcano", fl.field_f);
              qf.field_o[1][0] = jn.a("certificate_topleft", -29553, "supervolcano", fl.field_f);
              qf.field_o[1][1] = jn.a("certificate_top", -29553, "supervolcano", fl.field_f);
              qf.field_o[1][2] = jn.a("certificate_topright", -29553, "supervolcano", fl.field_f);
              qf.field_o[1][3] = jn.a("certificate_left", -29553, "supervolcano", fl.field_f);
              qf.field_o[1][4] = jn.a("certificate_centre", -29553, "supervolcano", fl.field_f);
              qf.field_o[1][5] = jn.a("certificate_right", -29553, "supervolcano", fl.field_f);
              qf.field_o[1][6] = jn.a("certificate_bottomleft", -29553, "supervolcano", fl.field_f);
              qf.field_o[1][7] = jn.a("certificate_bottom", -29553, "supervolcano", fl.field_f);
              qf.field_o[1][8] = jn.a("certificate_bottomright", -29553, "supervolcano", fl.field_f);
              return false;
            }
            if (pl.field_k == null) {
              pl.field_k = jn.a("sub", -29553, "supervolcano", fl.field_f);
              il.field_s = jn.a("theking", -29553, "supervolcano", fl.field_f);
              bc.field_b = jn.a("obylisk", -29553, "supervolcano", fl.field_f);
              aa.field_i = jn.a("mammoth", -29553, "supervolcano", fl.field_f);
              gh.field_a = jn.a("skeleton", -29553, "supervolcano", fl.field_f);
              rd.field_b = td.a("miner2oily", fl.field_f, "supervolcano", (byte) 109);
              fg.field_c = td.a("miner_stash_oily", fl.field_f, "supervolcano", (byte) 122);
              rg.field_tb = td.a("jetpack", fl.field_f, "supervolcano", (byte) 112);
              pc.field_f = td.a("jetpack_onfire", fl.field_f, "supervolcano", (byte) 110);
              ob.field_w = td.a("miner_pickup_freezium", fl.field_f, "supervolcano", (byte) 117);
              tf.field_c = td.a("miner_pickup_freezium_oily", fl.field_f, "supervolcano", (byte) 122);
              lb.field_x = new ea[ob.field_w.length];
              var2_int = 0;
              while (true) {
                stackIn_47_0 = var2_int;
                stackIn_47_1 = lb.field_x.length;
                if (stackIn_47_0 < stackIn_47_1) {
                  lb.field_x[var2_int] = ob.field_w[var2_int].c();
                  ml.a((byte) 93, 16777215, lb.field_x[var2_int], ob.field_w[var2_int]);
                  var3 = lb.field_x[var2_int].field_D;
                  stackIn_62_0 = -1 + var3.length;
                  if (var5 == 0) {
                    var4 = stackIn_62_0;
                    while (0 <= var4) {
                      stackIn_47_0 = ~var3[var4];
                      stackIn_47_1 = -1;
                      if (stackIn_47_0 < stackIn_47_1 &&
                        var3[var4] != 16777215) {
                        var3[var4] = 0;
                      }
                      var4--;
                    }
                    var2_int++;
                    continue;
                  }
                } else {
                  stackIn_62_0 = 0;
                }
                return stackIn_62_0 != 0;
              }
            } else {
              if (null != pf.field_a) {
                ci.field_b = true;
                return true;
              }
              rf.field_d = jn.a("thermometer", -29553, "supervolcano", fl.field_f);
              rf.field_d.f();
              pn.field_c = pb.a("supervolcano", fl.field_f, "thermometer_mask", (byte) -77);
              kc.field_a = rf.field_d.c();
              pf.field_a = td.a("oildrips", fl.field_f, "supervolcano", (byte) 123);
              vc.field_o = new ea[ph.field_e.length];
              var2_int = 0;
              while (true) {
                stackIn_66_0 = ~var2_int;
                stackIn_66_1 = ~vc.field_o.length;
                if (stackIn_66_0 > stackIn_66_1) {
                  vc.field_o[var2_int] = ph.field_e[var2_int].c();
                  ml.a((byte) 93, 16777215, vc.field_o[var2_int], ph.field_e[var2_int]);
                  var3 = vc.field_o[var2_int].field_D;
                  stackIn_81_0 = var3.length - 1;
                  if (var5 == 0) {
                    var4 = stackIn_81_0;
                    while (var4 >= 0) {
                      stackIn_66_0 = ~var3[var4];
                      stackIn_66_1 = -1;
                      if (stackIn_66_0 < stackIn_66_1 &&
                        16777215 != var3[var4]) {
                        var3[var4] = 0;
                      }
                      var4--;
                    }
                    var2_int++;
                    continue;
                  }
                } else {
                  stackIn_81_0 = 0;
                }
                return stackIn_81_0 != 0;
              }
            }
          }
          return false;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2_ref = decompiledCaughtException;
          throw lj.a((Throwable) ((Object) var2_ref), "MinerDisturbance.KA(" + param0 + ')');
        }
    }

    private final void f(byte param0) {
        int fieldTemp$0 = 0;
        int fieldTemp$1 = 0;
        int stackIn_99_0 = 0;
        int stackIn_103_1 = 0;
        RuntimeException decompiledCaughtException = null;
        int var2_int = 0;
        RuntimeException var2 = null;
        int var3 = 0;
        int var4 = 0;
        int var5 = 0;
        int var2_intLifetime1;
        int var3Lifetime1;
        var5 = field_ab;
        try {
          dl.field_c = dl.field_c + 1;
          if (param0 != 7) {
            this.field_O = false;
          }
          pa.field_d = pa.field_d + 1;
          if (ke.field_V &&
            cm.field_o != 0 &&
            pj.field_a <= 0) {
            cm.field_o = 0;
          }
          fieldTemp$0 = this.field_P;
          this.field_P = this.field_P + 1;
          if (50 < fieldTemp$0) {
            this.field_P = this.field_P - 50;
          }
          if (gi.field_c > 0) {
            gi.field_c = gi.field_c - 1;
          }
          if (pa.field_d >= 65536) {
            pa.field_d = pa.field_d - 65536;
          }
          if (null != this.field_Q &&
            fl.field_d) {
            this.field_Q.a(jk.field_ab, param0 - 12, gb.field_e, nk.field_w);
            if (null != this.field_Q &&
              !this.field_Q.field_o) {
              return;
            }
          }
          if (!oc.d(71) &&
            on.field_u == 0) {
            oc.f(-18627);
          }
          boolean decompiledSharedTail0 = (this.field_K);
          if (!decompiledSharedTail0) {
            if (je.field_N[cm.field_o] != je.field_u) {
              me.field_h = me.field_h + 1;
            }
            this.field_R = this.field_R - 1;
            this.u(-16506);
            this.field_cb = this.field_cb + 1;
            bf.field_d = bf.field_d + 1;
            this.field_I = this.field_I + 1;
            if (bf.field_d > 1000) {
              pa.field_c = -1;
            }
            fieldTemp$1 = this.field_H;
            this.field_H = this.field_H + 1;
            if (fieldTemp$1 >= ma.field_O.field_A) {
              this.field_H = 0;
            }
            if (!ag.field_c) {
              fb.field_f = 0;
              if (var5 != 0) {
                fb.field_f = fb.field_f + 1;
              }
            } else {
              fb.field_f = fb.field_f + 1;
            }
            if (this.field_cb == 1) {
              this.field_cb = 0;
            }
            if (79 > this.field_S) {
              this.field_S = this.field_S + 1;
            }
            if (this.field_D.length == this.field_I) {
              this.field_I = 0;
            }
            var2_int = 6000 - rg.field_sb;
            if (var2_int <= 0) {
              var2_int = 1;
            }
            var3 = 25 * var2_int / 4000;
            var4 = var3 + lj.field_r;
            if (var4 > 50) {
              var4 = 50;
            }
            this.field_D[this.field_I] = (24 * (ll.a((byte) -73, 1 + var4) * (ll.a((byte) -73, 3) - 1) + var4) / 100 + ll.a((byte) -73, 2)) * this.field_M;
            if (Math.abs(this.field_D[this.field_I]) > 25) {
              this.field_D[this.field_I] = 25 * this.field_M;
            }
            this.field_M = this.field_M * -1;
            if (fl.field_d) {
              pi.a(this.field_K, 2);
            }
            if (sc.field_b) {
              if (!ni.a(14, 11764) &&
                10 < Math.abs(this.field_D[this.field_I])) {
                ag.a(true, 14, -1, -1);
              }
              ag.a(true, 7, -1, -1);
              ag.a(true, 8, -1, -1);
              if (a.field_c > 3000) {
                ag.a(true, 12, -1, -1);
              }
              this.field_K = ak.a(40);
              stackIn_99_0 = (this.field_K) ? 0 : 1;
              if (this.field_X) {
                stackIn_103_1 = 0;
              } else {
                stackIn_103_1 = 1;
              }
              if (stackIn_99_0 != stackIn_103_1) {
                if (!this.field_K) {
                  kh.a((byte) 92);
                  if (var5 != 0) {
                    al.e(param0 + 82);
                  }
                } else {
                  al.e(param0 + 82);
                }
              }
              this.field_X = this.field_K;
            }
            this.field_W = hf.field_t - 180;
            this.field_G = 180 + hf.field_t;
            if (this.field_W < 0) {
              this.field_W = 0;
            }
            if (this.field_Z < this.field_G) {
              this.field_G = this.field_Z;
            }
            if (this.field_eb) {
              if (this.field_G - this.field_W > 0) {
                this.field_Z = this.field_Z - 1;
                if (var5 != 0 &&
                  this.field_Z < je.field_t) {
                  this.field_Z = this.field_Z + 1;
                }
              }
            } else {
              if (this.field_Z < je.field_t) {
                this.field_Z = this.field_Z + 1;
              }
            }
            decompiledSharedTail0 = (var5 != 0);
          }
          if ((decompiledSharedTail0) &&
            (sc.field_b)) {
            if (!this.field_Y &&
              fl.field_d) {
              pi.a(this.field_K, 2);
            }
            je.j();
          }
          if (ug.field_a != null) {
            ug.field_a.d(32);
          }
          if (fl.field_d) {
            this.l((byte) -116);
          }
          if (pl.field_h == 15) {
            di.field_Z = 0;
            pk.field_i = 15;
            ij.field_p = false;
            if (var5 == 0) {
              return;
            }
          }
          L37: {
            L38: {
              L39: {
                boolean decompiledFrameRemainder0 = true;
                var2_intLifetime1 = 0;
                var3Lifetime1 = pl.field_h;
                if (((var3Lifetime1 != 8 ||
                  var5 != 0) && (var3Lifetime1 != 9 ||
                  var5 != 0) && (var3Lifetime1 != 2 ||
                  var5 != 0) && (var3Lifetime1 != 3 ||
                  var5 != 0) && var3Lifetime1 != 4) &&
                  (decompiledFrameRemainder0 = (var3Lifetime1 != 6 ||
                  var5 != 0)) &&
                  (decompiledFrameRemainder0 = (var3Lifetime1 != 7 ||
                  var5 != 0)) &&
                  (decompiledFrameRemainder0 = (var3Lifetime1 != 10)) &&
                  (decompiledFrameRemainder0 = (var3Lifetime1 != 1)) &&
                  (decompiledFrameRemainder0 = (var3Lifetime1 != 11 ||
                  var5 != 0))) {
                  if (var3Lifetime1 == 0 &&
                    var5 == 0) {
                    break L39;
                  }
                  if (var3Lifetime1 == 14 &&
                    var5 == 0) {
                    break L38;
                  }
                  if (5 != var3Lifetime1) {
                    break L37;
                  }
                  if (var5 == 0) {
                    break L38;
                  }
                }
                if (decompiledFrameRemainder0) {
                  var2_intLifetime1 = 45;
                  if (var5 == 0) {
                    break L37;
                  }
                }
                var2_intLifetime1 = 49;
                if (var5 == 0) {
                  break L37;
                }
              }
              var2_intLifetime1 = 65;
              if (var5 == 0) {
                break L37;
              }
            }
            var2_intLifetime1 = 1;
          }
          if (di.field_Z == 20) {
            if (pl.field_h != 0) {
              kj.a((byte) -123);
              if (var5 != 0) {
                ac.a((byte) -116);
              }
            } else {
              ac.a((byte) -116);
            }
          }
          if (var2_intLifetime1 >= cm.field_r) {
            di.field_Z = 0;
            if (var5 != 0) {
              if (15 != pl.field_h &&
                var2_intLifetime1 < cm.field_r) {
                di.field_Z = di.field_Z + 1;
              }
              if (!ke.field_V &&
                pk.field_i != pl.field_h &&
                ij.field_p &&
                di.field_Z > 512) {
                pk.field_i = pl.field_h;
              }
            }
          } else {
            if (15 != pl.field_h &&
              var2_intLifetime1 < cm.field_r) {
              di.field_Z = di.field_Z + 1;
            }
            if (!ke.field_V &&
              pk.field_i != pl.field_h &&
              ij.field_p &&
              di.field_Z > 512) {
              pk.field_i = pl.field_h;
            }
          }
          if (null == de.field_b) {
            mm.a(false, ph.field_a, 2, 1, true, 2);
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2 = decompiledCaughtException;
          throw lj.a((Throwable) ((Object) var2), "MinerDisturbance.MA(" + param0 + ')');
        }
    }

    private final void t(int param0) {
        int fieldTemp$0 = 0;
        int stackIn_20_0 = 0;
        Object stackIn_92_0 = null;
        gf stackIn_92_1 = null;
        RuntimeException decompiledCaughtException = null;
        ea var2 = null;
        int var2_int = 0;
        RuntimeException var2_ref = null;
        int var3 = 0;
        int var4 = 0;
        int var5 = 0;
        int var6 = 0;
        int var7 = 0;
        int var8 = 0;
        int var3Lifetime1;
        int var4Lifetime1;
        int var4Lifetime2;
        var8 = field_ab;
        try {
          boolean decompiledFrameCompleted2 = true;
          boolean decompiledFrameRemainder1 = true;
          if (vi.field_h ||
            wm.field_e) {
            eh.d();
            decompiledFrameRemainder1 = (var8 != 0);
          }
          if (decompiledFrameRemainder1) {
            var2 = me.field_k[cm.field_o];
            var3 = -(li.field_c % var2.field_x);
            while (var3 < 640) {
              stackIn_20_0 = -(db.field_d % var2.field_A);
              if (var8 != 0) {
                decompiledFrameCompleted2 = false;
                break;
              }
              var4 = stackIn_20_0;
              while (var4 < 480) {
                var2.g(var3, var4);
                var4 = var4 + var2.field_A;
              }
              var3 = var3 + var2.field_x;
            }
          }
          if (decompiledFrameCompleted2) {
            stackIn_20_0 = 0;
          }
          var2_int = stackIn_20_0;
          var3Lifetime1 = 0;
          if (!(lj.field_r <= 0) ||
            je.field_u == je.field_N[cm.field_o]) {
            var4Lifetime1 = lj.field_r;
            if (var4Lifetime1 > 4000) {
              var4Lifetime1 = 4000;
            }
            if (var4Lifetime1 < 2000) {
              var4Lifetime1 = 2000;
            }
            var2_int = (int)(Math.sin((double)dl.field_c) * (double)var4Lifetime1) / 1000;
            var3Lifetime1 = (int)(Math.cos((double)(dl.field_c >> 1)) * (double)var4Lifetime1) / 1000;
            if (12 < var2_int) {
              var2_int = 12;
            }
            if (var3Lifetime1 > 8) {
              var3Lifetime1 = 8;
            }
            if (var2_int < -12) {
              var2_int = -12;
            }
            if (var3Lifetime1 < -8) {
              var3Lifetime1 = -8;
            }
          }
          je.g(var2_int, var3Lifetime1);
          if (param0 <= 13) {
            return;
          }
          var4Lifetime2 = 0;
          L16: while (true) {
            boolean decompiledFrameRemainder2 = true;
            boolean decompiledFrameCompleted1 = true;
            boolean decompiledFrameCompleted0 = true;
            if (1000 > var4Lifetime2) {
              stackIn_92_0 = null;
              stackIn_92_1 = uf.field_p[var4Lifetime2];
              if (var8 == 0) {
                if (stackIn_92_0 != stackIn_92_1 &&
                  uf.field_p[var4Lifetime2].a(false)) {
                  uf.field_p[var4Lifetime2].b(-12);
                }
                var4Lifetime2++;
                continue;
              }
            } else {
              je.b(var2_int, var3Lifetime1);
              this.y(1);
              var4Lifetime2 = 0;
              while (var4Lifetime2 < 1000) {
                stackIn_92_0 = null;
                stackIn_92_1 = uf.field_p[var4Lifetime2];
                if (var8 != 0) {
                  decompiledFrameCompleted1 = false;
                  break;
                }
                if (stackIn_92_0 != stackIn_92_1 &&
                  !uf.field_p[var4Lifetime2].a(false) &&
                  uf.field_p[var4Lifetime2].field_h < 12) {
                  uf.field_p[var4Lifetime2].b(-12);
                }
                var4Lifetime2++;
              }
              if (decompiledFrameCompleted1) {
                var4Lifetime2 = 0;
                while (var4Lifetime2 < 1000) {
                  stackIn_92_0 = null;
                  stackIn_92_1 = uf.field_p[var4Lifetime2];
                  if (var8 != 0) {
                    decompiledFrameCompleted0 = false;
                    break;
                  }
                  if (stackIn_92_0 != stackIn_92_1 &&
                    uf.field_p[var4Lifetime2].field_h >= 12 &&
                    !uf.field_p[var4Lifetime2].a(false)) {
                    uf.field_p[var4Lifetime2].b(-12);
                  }
                  var4Lifetime2++;
                }
                if (decompiledFrameCompleted0) {
                  if (!(!qe.field_b[9])) {
                    var4Lifetime2 = 0;
                    while (var4Lifetime2 < 1000) {
                      if (var8 != 0) {
                        break L16;
                      }
                      stackIn_92_0 = null;
                      stackIn_92_1 = uf.field_p[var4Lifetime2];
                      if (stackIn_92_0 != stackIn_92_1 &&
                        uf.field_p[var4Lifetime2].a(false)) {
                        uf.field_p[var4Lifetime2].b(false);
                      }
                      var4Lifetime2++;
                    }
                  }
                  decompiledFrameRemainder2 = false;
                }
              }
            }
            if (decompiledFrameRemainder2) {
              while (true) {
                if (stackIn_92_0 != stackIn_92_1 &&
                  uf.field_p[var4Lifetime2].a(false)) {
                  uf.field_p[var4Lifetime2].b(false);
                }
                var4Lifetime2++;
                if (var8 != 0) {
                  break;
                }
                if (var4Lifetime2 >= 1000) {
                  break;
                }
                stackIn_92_0 = null;
                stackIn_92_1 = uf.field_p[var4Lifetime2];
              }
            }
            var4Lifetime2 = 0;
            break;
          }
          while (true) {
            if (var4Lifetime2 >= 1000) {
              if (!il.e(-31391)) {
                return;
              }
              lj.field_r = (int)((double)lj.field_r * 0.9);
              var4Lifetime2 = sk.field_d / 10 + (-li.field_c + ca.field_k * 32);
              break;
            }
            if (var8 == 0) {
              if (uf.field_p[var4Lifetime2] != null &&
                uf.field_p[var4Lifetime2].a(false)) {
                uf.field_p[var4Lifetime2].c(-86);
              }
              var4Lifetime2++;
              continue;
            }
            break;
          }
          var5 = mf.field_i / 10 + hf.field_t * 32 - db.field_d;
          var6 = 0;
          if (pl.field_h == 0) {
            if (500 > cm.field_r) {
              cm.field_r = cm.field_r + 1;
            }
            var6 = 7;
            a.field_a[var6].f(-4 + var4Lifetime2, var5 - 4 - cm.field_r);
          }
          if (pl.field_h == 1 ||
            pl.field_h == 11) {
            var6 = 120 + 7 * cm.field_r / 50;
          }
          if (pl.field_h == 2) {
            var6 = cm.field_r * 4 / 50 + 1;
          }
          if (pl.field_h == 8) {
            var6 = 4 * cm.field_r / 50 + 136;
          }
          boolean decompiledFrameRemainder0 = true;
          if (pl.field_h == 3) {
            rg.field_wb = rg.field_wb / 2;
            bd.field_k = bd.field_k / 2;
            if (je.e(ca.field_k, hf.field_t, 1, 1) >= 5) {
              var6 = 12;
              if (cm.field_r > 12) {
                var6++;
              }
              if (25 < cm.field_r) {
                var6++;
              }
              if (cm.field_r > 35) {
                var6++;
              }
              decompiledFrameRemainder0 = !(cm.field_r < 50);
              if (decompiledFrameRemainder0) {
                var6 = 6;
                decompiledFrameRemainder0 = (var8 != 0);
              }
            }
            if (decompiledFrameRemainder0) {
              boolean decompiledSharedTail0 = !(0 >= je.e(ca.field_k, hf.field_t, 1, 1));
              if (!decompiledSharedTail0) {
                pl.field_h = 15;
                cm.field_r = 0;
                decompiledSharedTail0 = (var8 != 0);
              }
              if (decompiledSharedTail0) {
                var6 = cm.field_r % 5 + 83;
                if (5 < cm.field_r) {
                  cm.field_r = 0;
                }
              }
            }
          }
          if (pl.field_h == 12) {
            cm.field_r = cm.field_r + 1;
            bd.field_k = bd.field_k / 2;
            rg.field_wb = rg.field_wb / 2;
            if (cm.field_r > 5) {
              var6 = 12;
            }
            if (cm.field_r > 10) {
              var6++;
            }
            if (15 < cm.field_r) {
              var6++;
            }
            if (cm.field_r > 20) {
              var6++;
            }
            if (25 <= cm.field_r) {
              var6 = 6;
            }
          }
          if (pl.field_h == 4) {
            if (cm.field_r < 50) {
              sk.field_d = sk.field_d + (int)(30.0 * Math.random()) * di.field_K;
              if (100.0 * Math.random() < 20.0) {
                di.field_K = -di.field_K;
              }
            }
            var6 = 31;
          }
          if (pl.field_h == 5 ||
            pl.field_h == 13 ||
            pl.field_h == 14) {
            if (cm.field_r < 50) {
              var6 = 102;
              a.field_a[var6].a(128 + cm.field_r * 8, 0, -(cm.field_r * 4) + 16 + var5, var4Lifetime2 + 16, -1271909436);
              if (var8 != 0) {
                cm.field_r = cm.field_r + 1;
                if (cm.field_r <= 60) {
                  wj.field_l.a(260, 0, 16 + (var5 - 196), 16 + var4Lifetime2, -1271909436);
                  wj.field_l.a(264, 0, var5 - 180 + cm.field_r - 60, var4Lifetime2 + 16, -1271909436);
                } else {
                  wj.field_l.a(264, 0, var5 - 180 + cm.field_r - 60, var4Lifetime2 + 16, -1271909436);
                }
              }
            } else {
              cm.field_r = cm.field_r + 1;
              if (cm.field_r <= 60) {
                wj.field_l.a(260, 0, 16 + (var5 - 196), 16 + var4Lifetime2, -1271909436);
                if (var8 != 0) {
                  wj.field_l.a(264, 0, var5 - 180 + cm.field_r - 60, var4Lifetime2 + 16, -1271909436);
                }
              } else {
                wj.field_l.a(264, 0, var5 - 180 + cm.field_r - 60, var4Lifetime2 + 16, -1271909436);
              }
            }
          }
          if (pl.field_h == 6) {
            var6 = 3 + (2 * cm.field_r / 50 + 48);
            if (cm.field_r >= 50) {
              var6 = 53;
              cm.field_r = cm.field_r + 1;
              if (cm.field_r > 55) {
                var6 = 54;
              }
              if (!(cm.field_r <= 60)) {
                cm.field_r = 50;
                ke.field_V = false;
                if (var8 != 0) {
                  cm.field_r = cm.field_r + 1;
                }
              }
            } else {
              cm.field_r = cm.field_r + 1;
            }
          }
          if (7 == pl.field_h ||
            10 == pl.field_h) {
            var6 = 30;
            fieldTemp$0 = cm.field_r;
            cm.field_r = cm.field_r + 1;
            var7 = 25 * fieldTemp$0;
            eh.e(var4Lifetime2 - 1250, 0, var7, 480, 0);
            eh.e(-var7 + (var4Lifetime2 + 1282), 0, var7, 480, 0);
            eh.e(0, var5 - 1250, 640, var7, 0);
            eh.e(0, 32 + var5 + (1250 - var7), 640, var7, 0);
          }
          if (13 != pl.field_h &&
            pl.field_h != 5 &&
            pl.field_h != 0 &&
            pl.field_h != 9 &&
            14 != pl.field_h) {
            if (1 == di.field_K ||
              pl.field_h == 2 &&
              var6 > 1) {
              a.field_a[var6].f(-4 + var4Lifetime2, var5 - 4);
              if (var8 == 0) {
                return;
              }
            }
            a.field_a[var6].h(var4Lifetime2 - 4, var5 - 4);
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2_ref = decompiledCaughtException;
          throw lj.a((Throwable) ((Object) var2_ref), "MinerDisturbance.EB(" + param0 + ')');
        }
    }

    final void s(int param0) {
        RuntimeException decompiledCaughtException = null;
        RuntimeException var2 = null;
        try {
          if (u.b(-4440) < mk.b(99)) {
            this.field_O = false;
            if (field_ab != 0) {
              this.field_bb = gb.field_e;
              this.field_C = nk.field_w;
              this.field_O = true;
            }
          } else {
            this.field_bb = gb.field_e;
            this.field_C = nk.field_w;
            this.field_O = true;
          }
          if (param0 < 82) {
            this.k((byte) 40);
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2 = decompiledCaughtException;
          throw lj.a((Throwable) ((Object) var2), "MinerDisturbance.W(" + param0 + ')');
        }
    }

    private final void j(byte param0) {
        RuntimeException decompiledCaughtException = null;
        RuntimeException var2 = null;
        try {
          if (param0 != 22) {
            return;
          }
          if (fh.field_c != null) {
            lg.a(fh.field_c, -36);
            fh.field_c = null;
            wf.p(param0 + 4440);
          }
          fl.field_f = lb.a(param0 - 21, 1);
          ei.field_Q = lb.a(1, 2);
          pk.field_g = lb.a(1, 3);
          ig.field_c = lb.a(1, 4);
          ge.field_e = lb.a(1, 5);
          ne.field_L = lb.a(param0 ^ 23, 6);
          id.field_c = lb.a(param0 - 21, 11);
          im.a(ob.field_q, (byte) 82, s.field_P);
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2 = decompiledCaughtException;
          throw lj.a((Throwable) ((Object) var2), "MinerDisturbance.OA(" + param0 + ')');
        }
    }

    private final void q(int param0) {
        RuntimeException runtimeException = null;
        int var2_int = 0;
        int var3 = 0;
        RuntimeException decompiledCaughtException = null;
        var3 = field_ab;
        try {
          this.field_K = false;
          vk.field_a = cm.field_o;
          this.a(3, a.field_c);
          this.field_T = ll.a((byte) -73, sl.field_u[pl.field_h].length);
          pl.field_h = 15;
          var2_int = 0;
          do {
            if (var2_int >= 21) {
              rj.field_b = false;
              qe.field_b[0] = true;
              qe.field_b[5] = true;
              dg.field_b = false;
              an.field_d = false;
              nk.field_p = false;
              break;
            }
            qe.field_b[var2_int] = false;
            var2_int++;
          } while (var3 == 0);
          if (param0 != -46) {
            this.e(true);
          }
          qe.field_b[6] = true;
          qe.field_b[2] = true;
          this.h((byte) 104);
          je.field_J = false;
          ke.field_V = false;
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          runtimeException = decompiledCaughtException;
          throw lj.a((Throwable) ((Object) runtimeException), "MinerDisturbance.VA(" + param0 + ')');
        }
    }

    private final void u(int param0) {
        int fieldTemp$0 = 0;
        int fieldTemp$1 = 0;
        int dupTemp$2 = 0;
        gf dupTemp$3 = null;
        int fieldTemp$4 = 0;
        boolean stackIn_290_0 = false;
        int stackIn_300_0 = 0;
        int stackIn_336_0 = 0;
        int stackIn_344_0 = 0;
        int stackIn_344_1 = 0;
        int stackIn_399_0 = 0;
        int stackIn_406_0 = 0;
        int stackIn_413_0 = 0;
        int stackIn_438_0 = 0;
        int stackIn_457_0 = 0;
        boolean stackIn_517_0 = false;
        boolean stackIn_518_1 = false;
        int stackIn_731_0 = 0;
        int stackIn_811_0 = 0;
        int stackIn_906_0 = 0;
        int stackIn_1669_0 = 0;
        int stackIn_2099_0 = 0;
        je stackIn_2601_0 = null;
        int stackIn_2602_1 = 0;
        int stackIn_2618_0 = 0;
        int stackIn_2637_0 = 0;
        int stackIn_2653_0 = 0;
        int stackIn_2669_0 = 0;
        int stackIn_2688_0 = 0;
        int stackIn_2704_0 = 0;
        int stackIn_2723_0 = 0;
        int stackIn_2742_0 = 0;
        int stackIn_2771_0 = 0;
        int stackIn_2934_0 = 0;
        RuntimeException decompiledCaughtException = null;
        int var2_int = 0;
        RuntimeException var2 = null;
        int var3 = 0;
        int var4 = 0;
        int var5 = 0;
        int var6 = 0;
        int var7 = 0;
        int var8 = 0;
        gf var8_ref_gf = null;
        int var9 = 0;
        int var10 = 0;
        int var11 = 0;
        int var12 = 0;
        int var13 = 0;
        gf var13_ref_gf = null;
        int var14 = 0;
        int var15 = 0;
        int var16 = 0;
        int var17 = 0;
        int var18 = 0;
        int var19 = 0;
        int var20 = 0;
        int var21 = 0;
        gf var13_ref_gfLifetime1;
        int var3Lifetime1;
        int var4Lifetime1;
        int var4Lifetime2;
        int var4Lifetime3;
        int var5Lifetime1;
        int var6Lifetime1;
        int var6Lifetime2;
        int var6Lifetime3;
        int var6Lifetime4;
        int var6Lifetime5;
        int var7Lifetime1;
        int var7Lifetime2;
        int var7Lifetime3;
        int var7Lifetime4;
        int var7Lifetime5;
        int var8Lifetime1;
        int var8Lifetime2;
        int var8Lifetime3;
        int var8Lifetime4;
        int var9Lifetime1;
        int var9Lifetime2;
        int var9Lifetime3;
        int var9Lifetime4;
        int var10Lifetime1;
        int var10Lifetime2;
        int var11Lifetime1;
        int var11Lifetime2;
        int var12Lifetime1;
        int var13Lifetime1;
        int var14Lifetime1;
        int var13Lifetime2;
        int var6Lifetime3Lifetime1;
        int var7Lifetime3Lifetime1;
        int var8Lifetime2Lifetime1;
        int var9Lifetime2Lifetime1;
        var21 = field_ab;
        try {
          ce.field_b = ce.field_b + 1;
          if (hf.field_t < 1) {
            hf.field_t = 1;
          }
          if (ce.field_b > 2560) {
            ce.field_b = ce.field_b - 2560;
          }
          if (je.field_N[cm.field_o] > je.field_u &&
            hf.field_t > (-24 + je.field_t)) {
            je.k();
            ic.field_k = ic.field_k + 6000;
            if (ic.field_k > 6000) {
              ic.field_k = 6000;
            }
          }
          if (je.field_N[cm.field_o] > je.field_u) {
            if (rg.field_sb > 0) {
              if (!(ic.field_k <= 0)) {
                ic.field_k = ic.field_k - 1;
                if (var21 != 0) {
                  je.field_u = je.field_N[cm.field_o];
                  je.k();
                  if (me.field_h < 2000) {
                    fn.a(31, 224, 3);
                  }
                }
              }
            } else {
              je.field_u = je.field_N[cm.field_o];
              je.k();
              if (me.field_h < 2000) {
                fn.a(31, 224, 3);
              }
            }
          }
          if ((cn.field_C <= -300 &&
            1 == cm.field_o ||
            !(kn.field_E > 0)) &&
            (!ke.field_V &&
            pl.field_h == 15)) {
            this.h((byte) 113);
          }
          boolean decompiledFrameRemainder11 = true;
          var2_int = bl.g(param0 ^ param0) ? 1 : 0;
          if (!il.e(param0 ^ 15079) ||
            !ke.field_V) {
            if (sc.field_b) {
              if (mh.field_e[ca.field_k][hf.field_t].field_a &&
                !mh.field_e[ca.field_k][hf.field_t].field_v) {
                ag.a(true, 15, 32 * hf.field_t, 32 * ca.field_k);
                decompiledFrameRemainder11 = (var21 != 0);
              }
              if ((decompiledFrameRemainder11) &&
                (mh.field_e[ca.field_k][-1 + hf.field_t].field_a) &&
                (mh.field_e[ca.field_k][hf.field_t - 1].field_S)) {
                ag.a(true, 4, 32 * (-1 + hf.field_t), 32 * ca.field_k);
                if (var21 != 0) {
                  cm.field_r = cm.field_r + 1;
                  if (cm.field_r > 50) {
                    this.e((byte) -109);
                  }
                }
              }
            }
          } else {
            cm.field_r = cm.field_r + 1;
            if (cm.field_r > 50) {
              this.e((byte) -109);
            }
          }
          if (pl.field_h == 15 &&
            field_J >= 0) {
            field_J = field_J + 1;
            if (field_J > 100) {
              fn.a(29, 226, 3);
            }
          }
          boolean decompiledFrameRemainder10 = true;
          boolean decompiledFrameRemainder9 = true;
          var3 = this.v(-1);
          if (!oe.field_b) {
            fieldTemp$0 = jh.field_a;
            jh.field_a = jh.field_a + 1;
            decompiledFrameRemainder9 = !(7 < fieldTemp$0);
          }
          if (decompiledFrameRemainder9) {
            if (oe.field_b) {
              jh.field_a = 0;
            }
            var3++;
            decompiledFrameRemainder10 = (var21 != 0);
          }
          if (decompiledFrameRemainder10) {
            var4 = di.a(true);
            if (var4 < var3) {
              this.a(var3, (byte) 122);
            }
            var3 = 0;
          }
          this.a((byte) -123, var3);
          oe.field_b = false;
          var4Lifetime1 = 0;
          L19: while (true) {
            if (var4Lifetime1 < 1000) {
              if (var21 == 0) {
                if (uf.field_p[var4Lifetime1] != null) {
                  uf.field_p[var4Lifetime1] = uf.field_p[var4Lifetime1].d(true);
                }
                var4Lifetime1++;
                continue;
              }
            } else {
              if (!gm.field_a) {
                if (ke.field_V) {
                  break L19;
                }
                if (pl.field_h != 15) {
                  break L19;
                }
                fieldTemp$1 = ca.field_g;
                ca.field_g = ca.field_g + 1;
                if (9000 >= fieldTemp$1) {
                  break L19;
                }
                gm.field_a = true;
                if (var21 == 0) {
                  break L19;
                }
              }
              this.h((byte) -128);
              ke.field_V = false;
            }
            gm.field_a = false;
            break;
          }
          boolean decompiledSharedTail7 = (ke.field_V ||
            15 == pl.field_h);
          if (!decompiledSharedTail7) {
            je.field_l = je.field_l + 0.1;
            decompiledSharedTail7 = (var21 != 0);
          }
          if (decompiledSharedTail7) {
            if (lj.field_r > 0) {
              rg.field_sb = rg.field_sb - 1;
              lj.field_r = lj.field_r - (1 + lj.field_r / 10);
            }
            nd.field_d.a(param0 ^ 16444);
            je.d();
          }
          if (!kd.field_i) {
            db.field_d = 16 + hf.field_t * 32 + mf.field_i / 10 - 240;
            if (var21 != 0) {
              if ((mf.field_i / 10 + (32 * hf.field_t - 240 + 16)) <= db.field_d) {
                kd.field_i = false;
                db.field_d = db.field_d + 1;
              } else {
                db.field_d = db.field_d + 1;
              }
            }
          } else {
            if ((mf.field_i / 10 + (32 * hf.field_t - 240 + 16)) <= db.field_d) {
              kd.field_i = false;
              if (var21 != 0) {
                db.field_d = db.field_d + 1;
              }
            } else {
              db.field_d = db.field_d + 1;
            }
          }
          li.field_c = -304 + (sk.field_d / 10 + 32 * ca.field_k);
          if ((!(a.field_c <= 0) ||
            ~je.field_u == ~je.field_N[cm.field_o] ||
            !(hf.field_t >= 2)) && (ca.field_k == 16 &&
            hf.field_t <= 3 &&
            15 == pl.field_h &&
            ke.field_V)) {
            pl.field_h = 0;
            var3Lifetime1 = this.v(-1);
            var4Lifetime2 = di.a(true);
            this.a(0, (byte) 123);
            this.a((byte) -44, 0);
            if (var3Lifetime1 > 500 ||
              500 < var4Lifetime2) {
              fn.a(33, 222, 3);
            }
            if (je.field_J &&
              gj.a(18740, 0)) {
              fn.a(32, 223, 3);
            }
            di.field_Z = 0;
            if (10 <= nm.field_g[4] &&
              ke.field_V) {
              fn.a(13, 242, param0 + 16509);
            }
            if (25 <= jc.field_H &&
              ke.field_V) {
              fn.a(12, 243, param0 + 16509);
            }
            ke.field_V = false;
            this.field_T = ll.a((byte) -73, sl.field_u[pl.field_h].length);
            cm.field_r = 0;
            if (wf.q(88)) {
              a.field_c = a.field_c * 2;
              var5 = a.field_c / 2;
              var6 = rg.field_sb % 3;
              if (var6 != 0) {
                if (var6 != 1) {
                  var7 = var5 / 3;
                  di.field_X = di.field_X + var7;
                  vh.field_g = vh.field_g - (-var7 + var5);
                  if (var21 != 0) {
                    vh.field_g = vh.field_g - var5;
                    di.field_X = di.field_X + var5;
                  }
                } else {
                  vh.field_g = vh.field_g - var5;
                  if (var21 != 0) {
                    di.field_X = di.field_X + var5;
                  }
                }
              } else {
                di.field_X = di.field_X + var5;
              }
            }
          }
          if (li.field_c < 16) {
            li.field_c = 16;
          }
          if ((-544 + 32 * je.field_t) < db.field_d) {
            db.field_d = -64 + 32 * je.field_t - 480;
          }
          if (368 < li.field_c) {
            li.field_c = 368;
          }
          if (16 > db.field_d) {
            db.field_d = 16;
          }
          if (!ke.field_V &&
            il.e(-31391)) {
            rg.field_wb = 0;
            bd.field_k = 0;
          }
          if (!je.c(ca.field_k, hf.field_t, 1, 1)) {
            pc.field_k = 0;
            if (var21 != 0) {
              ul.field_b = 0;
              pc.field_k = pc.field_k + 1;
            }
          } else {
            ul.field_b = 0;
            pc.field_k = pc.field_k + 1;
          }
          if (pc.field_k > 5) {
            if (tc.field_s > 0) {
              tc.field_s = tc.field_s - 1;
              je.field_O.a((ca.field_k << 2) + 1, 88, (hf.field_t << 2) - 1, true);
            }
            pc.field_k = 0;
          }
          var4Lifetime3 = fn.a(true) ? 1 : 0;
          if (var4Lifetime3 != 0 &&
            tc.field_s < 4) {
            if (qd.field_K < 100) {
              qd.field_K = qd.field_K + 1;
            }
            if (!qe.field_b[15]) {
              tc.field_s = tc.field_s + 1;
              je.field_O.e(hf.field_t, ca.field_k, (byte) 83);
            }
          }
          if (tc.field_s > 0) {
            ag.a(true, 31, hf.field_t * 32, ca.field_k * 32);
          }
          if ((!qd.field_O[98] ||
            !qd.field_O[86]) &&
            (!ca.c(-2302) &&
            (dl.field_c & 7) == 0 &&
            100 > qd.field_K)) {
            qd.field_K = qd.field_K + 1;
          }
          stackIn_290_0 = (ke.field_V) && (pl.field_h == 15);
          d.field_b = stackIn_290_0;
          if (tc.field_t > 0) {
            tc.field_t = tc.field_t - 1;
          }
          if (!ke.field_V &&
            pl.field_h == 15) {
            stackIn_300_0 = 1;
          } else {
            stackIn_300_0 = 0;
          }
          var5Lifetime1 = stackIn_300_0;
          if (var5Lifetime1 != 0) {
            hf.field_r = hf.field_r - 1;
            if (0 >= hf.field_r &&
              sk.field_d <= 160 &&
              sk.field_d >= -160) {
              hf.field_r = 50;
              var6Lifetime1 = 0;
              var7Lifetime1 = 1;
              while (true) {
                boolean decompiledFrameRemainder26 = true;
                boolean decompiledFrameRemainder25 = true;
                if (var7Lifetime1 < 5) {
                  stackIn_344_0 = -1;
                  stackIn_344_1 = ~(-var7Lifetime1 + hf.field_t);
                  decompiledFrameRemainder26 = (var21 == 0);
                  if ((decompiledFrameRemainder26) &&
                    (stackIn_344_0 >= stackIn_344_1)) {
                    if (mh.field_e[ca.field_k][hf.field_t - var7Lifetime1].field_a ||
                      mh.field_e[-1 + ca.field_k][hf.field_t - var7Lifetime1].field_a ||
                      mh.field_e[ca.field_k + 1][hf.field_t - var7Lifetime1].field_a) {
                      if (mh.field_e[ca.field_k][-var7Lifetime1 + hf.field_t].field_S &&
                        mh.field_e[ca.field_k][-var7Lifetime1 + hf.field_t].field_a) {
                        stackIn_336_0 = 1;
                      } else {
                        stackIn_336_0 = 0;
                      }
                      var6Lifetime1 = stackIn_336_0;
                      decompiledFrameRemainder25 = (!(mh.field_e[ca.field_k][hf.field_t - var7Lifetime1].field_a) ||
                        var21 != 0);
                    }
                    if (decompiledFrameRemainder25) {
                      var7Lifetime1++;
                      continue;
                    }
                  }
                }
                if (decompiledFrameRemainder26) {
                  stackIn_344_0 = 12;
                  stackIn_344_1 = ca.field_k;
                }
                if (stackIn_344_0 > stackIn_344_1) {
                  this.field_E = 1;
                }
                if ((stackIn_344_0 <= stackIn_344_1 ||
                  var21 != 0) &&
                  20 < ca.field_k) {
                  this.field_E = 2;
                }
                if (this.field_E == 1 ||
                  mh.field_e[-1 + ca.field_k][hf.field_t].field_a &&
                  sk.field_d <= -30 ||
                  this.field_U == 1) {
                  if (mh.field_e[ca.field_k + 1][hf.field_t].field_a &&
                    30 <= sk.field_d ||
                    this.field_U == 4) {
                    this.field_E = 0;
                    if (var21 != 0) {
                      this.field_E = 1;
                      this.field_E = 2;
                    }
                  } else {
                    this.field_E = 1;
                    if (var21 != 0) {
                      this.field_E = 2;
                    }
                  }
                } else {
                  this.field_E = 2;
                }
                boolean decompiledFrameRemainder8 = true;
                if (var6Lifetime1 != 0 ||
                  var2_int == 0 ||
                  !(kn.field_E > 250)) {
                  this.field_U = 0;
                  decompiledFrameRemainder8 = (var21 != 0);
                }
                if (decompiledFrameRemainder8) {
                  if (mh.field_e[ca.field_k][1 + hf.field_t].field_a &&
                    !mh.field_e[ca.field_k][1 + hf.field_t].field_b) {
                    stackIn_399_0 = 1;
                  } else {
                    stackIn_399_0 = 0;
                  }
                  var7Lifetime1 = stackIn_399_0;
                  if (mh.field_e[ca.field_k + 1][hf.field_t].field_a &&
                    !mh.field_e[1 + ca.field_k][hf.field_t].field_b) {
                    stackIn_406_0 = 1;
                  } else {
                    stackIn_406_0 = 0;
                  }
                  var8 = stackIn_406_0;
                  if (mh.field_e[-1 + ca.field_k][hf.field_t].field_a &&
                    !mh.field_e[ca.field_k - 1][hf.field_t].field_b) {
                    stackIn_413_0 = 1;
                  } else {
                    stackIn_413_0 = 0;
                  }
                  boolean decompiledFrameRemainder17 = true;
                  var9 = stackIn_413_0;
                  if (mh.field_e[ca.field_k][hf.field_t - 1].field_a &&
                    !mh.field_e[ca.field_k][hf.field_t - 1].field_b && (di.field_K > 0 &&
                    !mh.field_e[1 + ca.field_k][hf.field_t - 1].field_b &&
                    !mh.field_e[ca.field_k + 1][hf.field_t].field_b ||
                    !(0 <= di.field_K) &&
                    !mh.field_e[-1 + ca.field_k][hf.field_t - 1].field_b &&
                    !mh.field_e[ca.field_k - 1][hf.field_t].field_b)) {
                    stackIn_438_0 = 1;
                    decompiledFrameRemainder17 = false;
                  }
                  else {
                    stackIn_438_0 = 0;
                  }
                  boolean decompiledFrameRemainder16 = true;
                  var10 = stackIn_438_0;
                  if ((var8 != 0 &&
                    1 == this.field_U ||
                    var9 != 0 &&
                    this.field_U == 4) && (this.field_U != 5 &&
                    2 != this.field_U)) {
                    stackIn_457_0 = 0;
                    decompiledFrameRemainder16 = false;
                  }
                  else {
                    stackIn_457_0 = 1;
                  }
                  var11 = stackIn_457_0;
                  if (var11 != 0) {
                    if (var7Lifetime1 != 0 &&
                      this.field_U != 2) {
                      this.field_U = 2;
                      decompiledFrameRemainder8 = (var21 != 0);
                    }
                    if (decompiledFrameRemainder8) {
                      if (var8 == 0 ||
                        this.field_U == 4 &&
                        this.field_E != 1) {
                        if (var9 == 0 ||
                          this.field_U == 1 &&
                          2 != this.field_E) {
                          if (var10 != 0) {
                            this.field_U = 5;
                            if (var21 != 0) {
                              this.field_U = 0;
                              this.field_U = 4;
                              this.field_U = 1;
                            }
                          } else {
                            this.field_U = 0;
                            if (var21 != 0) {
                              this.field_U = 4;
                              this.field_U = 1;
                            }
                          }
                        } else {
                          this.field_U = 4;
                          if (var21 != 0) {
                            this.field_U = 1;
                          }
                        }
                      } else {
                        this.field_U = 1;
                      }
                    }
                  }
                }
                boolean decompiledFrameRemainder7 = true;
                if ((!mh.field_e[-1 + ca.field_k][hf.field_t].field_b ||
                  !mh.field_e[1 + ca.field_k][hf.field_t].field_b ||
                  !mh.field_e[ca.field_k][1 + hf.field_t].field_b) &&
                  (decompiledFrameRemainder7 = !(je.c(ca.field_k, hf.field_t, 3, 3))) &&
                  (decompiledFrameRemainder7 = !(!mh.field_e[ca.field_k - 1][hf.field_t].field_b))) {
                  stackIn_517_0 = mh.field_e[1 + ca.field_k][hf.field_t].field_b;
                  stackIn_518_1 = !(mh.field_e[1 + ca.field_k][hf.field_t].field_a);
                  decompiledFrameRemainder7 = !(stackIn_517_0 ^ !stackIn_518_1);
                  if ((decompiledFrameRemainder7) &&
                    (decompiledFrameRemainder7 = !(mh.field_e[1 + ca.field_k][hf.field_t].field_a))) {
                    uf.field_p[jf.b((byte) 108)] = new gf(ca.field_k, hf.field_t, 6);
                    decompiledFrameRemainder7 = (var21 != 0);
                  }
                }
                if (decompiledFrameRemainder7) {
                  if (mh.field_e[-1 + ca.field_k][-1 + hf.field_t].field_a &&
                    !mh.field_e[-1 + ca.field_k][-1 + hf.field_t].field_b ||
                    mh.field_e[ca.field_k + 1][hf.field_t - 1].field_a &&
                    !mh.field_e[ca.field_k + 1][hf.field_t - 1].field_b) {
                    this.field_U = 5;
                    decompiledFrameRemainder7 = (var21 != 0);
                  }
                  if (decompiledFrameRemainder7) {
                    if (!mh.field_e[ca.field_k - 1][-1 + hf.field_t].field_a) {
                      if (!mh.field_e[ca.field_k + 1][-1 + hf.field_t].field_a) {
                        this.field_E = 5;
                        if (var21 != 0) {
                          this.field_E = 4;
                          this.field_E = 5;
                        }
                      } else {
                        this.field_E = 4;
                        if (var21 != 0) {
                          this.field_E = 5;
                        }
                      }
                    } else {
                      this.field_E = 5;
                    }
                  }
                }
                if (250 <= kn.field_E) {
                  break;
                }
                if (!je.c(ca.field_k, -1 + hf.field_t, 1, 1)) {
                  break;
                }
                if (mh.field_e[ca.field_k][hf.field_t - 1].field_a) {
                  break;
                }
                if (mh.field_e[-1 + ca.field_k][hf.field_t - 1].field_a) {
                  if (!mh.field_e[ca.field_k + 1][-1 + hf.field_t].field_a) {
                    this.field_E = 4;
                    if (var21 != 0) {
                      this.field_E = 5;
                    }
                  }
                } else {
                  this.field_E = 5;
                }
                this.field_U = 0;
                break;
              }
            }
          }
          if (rj.field_f != 0) {
            ph.field_b = 0;
          }
          L110: {
            boolean decompiledFrameRemainder24 = true;
            boolean decompiledFrameRemainder23 = true;
            boolean decompiledFrameRemainder22 = true;
            boolean decompiledFrameRemainder21 = true;
            boolean decompiledFrameRemainder20 = true;
            boolean decompiledFrameRemainder19 = true;
            boolean decompiledFrameRemainder18 = true;
            boolean decompiledFrameRemainder6 = true;
            boolean decompiledFrameRemainder5 = true;
            var13 = rj.field_f;
            if ((var13 != 0) &&
              (decompiledFrameRemainder5 = (var13 != 1 ||
              var21 != 0)) &&
              (decompiledFrameRemainder6 = (2 != var13))) {
              decompiledFrameRemainder18 = (var13 != 3 ||
                var21 != 0);
              if (((decompiledFrameRemainder18) &&
                (decompiledFrameRemainder18 = (4 != var13 ||
                var21 != 0))) &&
                (decompiledFrameRemainder19 = (var13 != 7)) &&
                (decompiledFrameRemainder20 = (8 != var13)) &&
                (decompiledFrameRemainder21 = (var13 != 9)) &&
                (decompiledFrameRemainder22 = (10 != var13)) &&
                (decompiledFrameRemainder23 = (11 != var13)) &&
                (decompiledFrameRemainder24 = (var13 != 12 ||
                var21 != 0))) {
                if (13 != var13) {
                  break L110;
                }
                if (var21 == 0) {
                  field_J = 0;
                  ne.a(36, 57);
                  kj.field_d = kj.field_d + 1;
                  if (kj.field_d > 5) {
                    tb.field_c = tb.field_c + 1;
                    kj.field_d = 0;
                  }
                  if (tb.field_c >= pc.field_f.length) {
                    tb.field_c = 0;
                  }
                  if (nf.field_e <= 0) {
                    rj.field_f = 4;
                    tc.field_s = 0;
                  } else {
                    nf.field_e = nf.field_e - 1;
                  }
                  if (qd.field_K > 0) {
                    qd.field_K = qd.field_K - 1;
                  }
                  if (je.d(ca.field_k, hf.field_t, 1, 1)) {
                    je.field_O.a(ca.field_k, -4, hf.field_t);
                    uf.field_p[jf.b((byte) 108)] = new gf(ca.field_k, hf.field_t, 16);
                  }
                  if (d.field_b &&
                    qd.field_O[96]) {
                    di.field_K = -1;
                    rg.field_wb = -10;
                  }
                  if (bd.field_k > -160) {
                    bd.field_k = -160;
                  }
                  if (d.field_b &&
                    qd.field_O[97]) {
                    di.field_K = 1;
                    rg.field_wb = 10;
                  }
                  if ((nf.field_e & 3) == 0) {
                    var13_ref_gf = new gf(ca.field_k, hf.field_t, 16);
                    var13_ref_gf.field_g = 0;
                    var13_ref_gf.field_b = 240;
                    uf.field_p[jf.b((byte) 61)] = var13_ref_gf;
                    bd.field_k = -160;
                  }
                  mf.field_i = mf.field_i + bd.field_k;
                  sk.field_d = sk.field_d + rg.field_wb;
                  if (mf.field_i > 40 &&
                    mh.field_e[ca.field_k][hf.field_t + 1].g()) {
                    mf.field_i = 40;
                    bd.field_k = 0;
                  }
                  if (mf.field_i < -40 &&
                    mh.field_e[ca.field_k][hf.field_t - 1].g()) {
                    mf.field_i = -40;
                    bd.field_k = 0;
                  }
                  if (sk.field_d > 80 &&
                    mf.field_i < -40 &&
                    mh.field_e[ca.field_k + 1][hf.field_t - 1].g()) {
                    sk.field_d = 80;
                  }
                  if (sk.field_d < -80 &&
                    -40 > mf.field_i &&
                    mh.field_e[ca.field_k - 1][-1 + hf.field_t].g()) {
                    sk.field_d = -80;
                  }
                  if (sk.field_d > 80 &&
                    mf.field_i > 40 &&
                    mh.field_e[ca.field_k + 1][hf.field_t + 1].g()) {
                    sk.field_d = 80;
                  }
                  if (sk.field_d < -80 &&
                    40 < mf.field_i &&
                    mh.field_e[ca.field_k - 1][hf.field_t + 1].g()) {
                    sk.field_d = -80;
                  }
                  if (sk.field_d > 80 &&
                    mh.field_e[1 + ca.field_k][hf.field_t].g()) {
                    sk.field_d = 80;
                  }
                  if (-80 > sk.field_d &&
                    mh.field_e[-1 + ca.field_k][hf.field_t].g()) {
                    sk.field_d = -80;
                  }
                  if (sk.field_d > 160) {
                    ca.field_k = ca.field_k + 1;
                    sk.field_d = sk.field_d - 320;
                  }
                  if (sk.field_d < -160) {
                    ca.field_k = ca.field_k - 1;
                    sk.field_d = sk.field_d + 320;
                  }
                  if (mf.field_i > 160) {
                    hf.field_t = hf.field_t + 1;
                    mf.field_i = mf.field_i - 320;
                  }
                  if (-160 > mf.field_i) {
                    mf.field_i = mf.field_i + 320;
                    hf.field_t = hf.field_t - 1;
                  }
                  if (!(!je.c(ca.field_k, hf.field_t, 1, 1))) {
                    rj.field_f = 2;
                  }
                  break L110;
                }
              }
            }
            if ((decompiledFrameRemainder24) &&
              (decompiledFrameRemainder23) &&
              (decompiledFrameRemainder22) &&
              (decompiledFrameRemainder21) &&
              (decompiledFrameRemainder20) &&
              (decompiledFrameRemainder19) &&
              (decompiledFrameRemainder18) &&
              (decompiledFrameRemainder6) &&
              (decompiledFrameRemainder5)) {
              if (d.field_b &&
                qd.field_O[96] ||
                (2 == this.field_E ||
                this.field_E == 5)) {
                rj.field_f = 1;
                di.field_K = -1;
                if (d.field_b) {
                  gl.a(7, 25);
                }
              }
              if (d.field_b &&
                qd.field_O[97] ||
                (this.field_E == 1 ||
                this.field_E == 4)) {
                di.field_K = 1;
                rj.field_f = 1;
                if (d.field_b) {
                  gl.a(7, 25);
                }
              }
              if (d.field_b &&
                qd.field_O[98] &&
                !ag.field_c ||
                (this.field_E == 3 ||
                this.field_E == 4 ||
                this.field_E == 5)) {
                var13 = 1;
                if (mh.field_e[ca.field_k][hf.field_t].field_a) {
                  var13 = 0;
                }
                if (mh.field_e[ca.field_k][hf.field_t - 1].g()) {
                  var13 = 0;
                }
                if (sk.field_d + 10 * di.field_K > 165 &&
                  mh.field_e[1 + ca.field_k][-1 + hf.field_t].g()) {
                  var13 = 0;
                }
                if (10 * di.field_K + sk.field_d < -165 &&
                  mh.field_e[-1 + ca.field_k][-1 + hf.field_t].g()) {
                  var13 = 0;
                }
                if (var13 != 0) {
                  boolean decompiledSharedTail6 = (!(qe.field_b[20]) ||
                    !(qd.field_O[49]) ||
                    !(qd.field_K > 10));
                  if (!decompiledSharedTail6) {
                    rj.field_f = 12;
                    decompiledSharedTail6 = (var21 != 0);
                  }
                  if (decompiledSharedTail6) {
                    bd.field_k = -40;
                    rj.field_f = 3;
                    rg.field_wb = 10 * di.field_K;
                    ne.a(10, 79);
                  }
                }
              }
              boolean decompiledFrameRemainder15 = true;
              if (!qe.field_b[18] && (!(tc.field_s <= 0) ||
                mh.field_e[ca.field_k][1 + hf.field_t].field_E ||
                sk.field_d < 0 &&
                mh.field_e[ca.field_k - 1][hf.field_t + 1].field_E ||
                !(sk.field_d <= 0) &&
                mh.field_e[1 + ca.field_k][hf.field_t + 1].field_E)) {
                stackIn_731_0 = 1;
                decompiledFrameRemainder15 = false;
              }
              else {
                stackIn_731_0 = 0;
              }
              var13 = stackIn_731_0;
              if (var2_int != 0) {
                if (var13 != 0) {
                  this.w(105);
                  if (var21 != 0) {
                    rj.field_f = 4;
                  }
                }
              } else {
                rj.field_f = 4;
              }
              if ((!qe.field_b[4] ||
                var2_int == 0) &&
                ph.field_b == 6) {
                ph.field_b = 0;
              }
              boolean decompiledFrameRemainder4 = true;
              tb.field_c = 0;
              an.field_f = an.field_f - 1;
              if (an.field_f <= 0) {
                if (ph.field_b == 0) {
                  ph.field_b = (int)(3.0 * Math.random() + 1.0);
                  an.field_f = 5;
                  tf.field_b = 0;
                  decompiledFrameRemainder4 = (var21 != 0);
                }
                if (decompiledFrameRemainder4) {
                  an.field_f = 5;
                  tf.field_b = tf.field_b + 1;
                  if (tf.field_b <= 4) {
                    if ((!(3 >= tf.field_b)) &&
                      (ph.field_b == 1)) {
                      ph.field_b = 0;
                      an.field_f = 500;
                    }
                  } else {
                    ph.field_b = 0;
                    an.field_f = 500;
                  }
                }
              }
              if (ph.field_b == 0 &&
                an.field_f < 400 &&
                mh.field_e[ca.field_k][hf.field_t + 1].field_q > 0) {
                tf.field_b = 0;
                ph.field_b = 4;
                an.field_f = 5;
              }
              if (mh.field_e[ca.field_k][hf.field_t + 1].field_q > 150 &&
                ph.field_b != 5) {
                tf.field_b = 0;
                an.field_f = 5;
                ph.field_b = 5;
              }
              if (1 == ph.field_b) {
                tb.field_c = ph.field_b * 8 + tf.field_b;
              }
              if (ph.field_b == 2) {
                tb.field_c = ph.field_b * 8 + tf.field_b;
              }
              if (ph.field_b == 3) {
                tb.field_c = ph.field_b * 8 + tf.field_b;
              }
              if (ph.field_b == 4) {
                tb.field_c = 21 + tf.field_b % 3;
              }
              if (5 == ph.field_b) {
                tb.field_c = tf.field_b + 83;
              }
              if (ph.field_b == 0) {
                var13 = 0;
                var14 = hf.field_t;
                while (true) {
                  if (var13 != 0) {
                    stackIn_811_0 = 0;
                  } else {
                    stackIn_811_0 = 1;
                    if (var21 == 0) {
                    }
                  }
                  if (stackIn_811_0 != 1) {
                    break;
                  }
                  var14--;
                  if (var14 < 1) {
                    var13 = 1;
                  }
                  if (!mh.field_e[ca.field_k][var14].field_a) {
                    continue;
                  }
                  if (mh.field_e[ca.field_k][var14].field_S) {
                    tb.field_c = 29;
                    if (mh.field_e[ca.field_k][var14].field_r > 950) {
                      tb.field_c = 30;
                    }
                  }
                  var13 = 1;
                  if (var21 == 0) {
                    continue;
                  }
                  break;
                }
              }
              if (!qe.field_b[4]) {
                break L110;
              }
              if (var2_int == 0) {
                break L110;
              }
              var2_int = 0;
              if (bd.field_k >= 0 &&
                !qd.field_O[99]) {
                if (sk.field_d < -30 &&
                  mh.field_e[-1 + ca.field_k][hf.field_t].g()) {
                  var2_int = 1;
                }
                if (sk.field_d > 30 &&
                  mh.field_e[1 + ca.field_k][hf.field_t].g()) {
                  var2_int = 1;
                }
              }
              if (mf.field_i >= 0 &&
                bd.field_k >= 0) {
                if (mh.field_e[ca.field_k][1 + hf.field_t].g()) {
                  var2_int = 0;
                }
                if (sk.field_d < -80 &&
                  mh.field_e[ca.field_k - 1][1 + hf.field_t].g()) {
                  var2_int = 0;
                }
                if (80 < sk.field_d &&
                  mh.field_e[1 + ca.field_k][1 + hf.field_t].g()) {
                  var2_int = 0;
                }
              }
              if (var2_int != 0) {
                tb.field_c = 104;
                mf.field_i = mf.field_i / 2;
                if (ph.field_b != 6) {
                  an.field_f = 5;
                  ph.field_b = 6;
                }
                if (an.field_f < 2) {
                  an.field_f = 2;
                  tb.field_c = tb.field_c + 1;
                }
              }
              var2_int = 1;
              if (var21 == 0) {
                break L110;
              }
            }
            if ((decompiledFrameRemainder24) &&
              (decompiledFrameRemainder23) &&
              (decompiledFrameRemainder22) &&
              (decompiledFrameRemainder21) &&
              (decompiledFrameRemainder20) &&
              (decompiledFrameRemainder19) &&
              (decompiledFrameRemainder18) &&
              (decompiledFrameRemainder6)) {
              boolean decompiledFrameRemainder14 = true;
              var7Lifetime2 = 1;
              if (!qe.field_b[18] && (!(tc.field_s <= 0) ||
                mh.field_e[ca.field_k][1 + hf.field_t].field_E ||
                sk.field_d < 0 &&
                mh.field_e[ca.field_k - 1][hf.field_t + 1].field_E ||
                !(sk.field_d <= 0) &&
                mh.field_e[ca.field_k + 1][1 + hf.field_t].field_E)) {
                stackIn_906_0 = 1;
                decompiledFrameRemainder14 = false;
              }
              else {
                stackIn_906_0 = 0;
              }
              L195: {
                var6Lifetime2 = stackIn_906_0;
                if ((!d.field_b ||
                  !qd.field_O[96]) && this.field_E != 2) {
                  if (var6Lifetime2 != 0) {
                    break L195;
                  }
                  if (0 <= rg.field_wb) {
                    break L195;
                  }
                  rg.field_wb = rg.field_wb + 1;
                  if (var21 == 0) {
                    break L195;
                  }
                }
                if (var6Lifetime2 == 0) {
                  rg.field_wb = -20;
                }
                if ((var6Lifetime2 != 0 ||
                  var21 != 0) &&
                  rg.field_wb > -30) {
                  rg.field_wb = rg.field_wb - 1;
                }
                di.field_K = -1;
                var7Lifetime2 = 0;
                if (qe.field_b[11] &&
                  sk.field_d < 0 &&
                  mh.field_e[-1 + ca.field_k][hf.field_t].field_a) {
                  boolean decompiledSharedTail5 = !(25 > tc.field_t);
                  if (!decompiledSharedTail5) {
                    tc.field_t = tc.field_t + 2;
                    decompiledSharedTail5 = (var21 != 0);
                  }
                  if (decompiledSharedTail5) {
                    rj.field_f = 10;
                    rg.field_wb = -50;
                    kj.field_d = 0;
                    bd.field_k = -10;
                    tc.field_t = 0;
                  }
                }
              }
              L201: {
                if ((!d.field_b ||
                  !qd.field_O[97]) &&
                  this.field_E != 1) {
                  if (var6Lifetime2 != 0) {
                    break L201;
                  }
                  if (rg.field_wb <= 0) {
                    break L201;
                  }
                  rg.field_wb = rg.field_wb - 1;
                  if (var21 == 0) {
                    break L201;
                  }
                }
                di.field_K = 1;
                var7Lifetime2 = 0;
                if (var6Lifetime2 == 0) {
                  rg.field_wb = 20;
                }
                if ((var6Lifetime2 != 0 ||
                  var21 != 0) &&
                  rg.field_wb < 30) {
                  rg.field_wb = rg.field_wb + 1;
                }
                if (qe.field_b[11] &&
                  sk.field_d > 0 &&
                  mh.field_e[ca.field_k + 1][hf.field_t].field_a) {
                  if (tc.field_t >= 25) {
                    bd.field_k = -10;
                    tc.field_t = 0;
                    rj.field_f = 10;
                    rg.field_wb = 50;
                    kj.field_d = 0;
                    if (var21 != 0) {
                      tc.field_t = tc.field_t + 2;
                    }
                  } else {
                    tc.field_t = tc.field_t + 2;
                  }
                }
              }
              if (var6Lifetime2 == 0) {
                if (d.field_b &&
                  qd.field_O[96] &&
                  qd.field_O[99]) {
                  di.field_K = -1;
                  var7Lifetime2 = 0;
                  rg.field_wb = -10;
                  if ((var21 != 0) &&
                    (0 > rg.field_wb)) {
                    rg.field_wb = rg.field_wb + 1;
                  }
                } else {
                  if (0 > rg.field_wb) {
                    rg.field_wb = rg.field_wb + 1;
                  }
                }
                if (!d.field_b ||
                  !qd.field_O[97] ||
                  !qd.field_O[99]) {
                  if (!(0 >= rg.field_wb)) {
                    rg.field_wb = rg.field_wb - 1;
                    if (var21 != 0) {
                      var7Lifetime2 = 0;
                      di.field_K = 1;
                      rg.field_wb = 10;
                    }
                  }
                } else {
                  var7Lifetime2 = 0;
                  di.field_K = 1;
                  rg.field_wb = 10;
                }
              }
              if (d.field_b &&
                qd.field_O[98] &&
                !ag.field_c) {
                var13 = 1;
                if (mh.field_e[ca.field_k][hf.field_t].field_a) {
                  var13 = 0;
                }
                if (mh.field_e[ca.field_k][-1 + hf.field_t].g()) {
                  var13 = 0;
                }
                if (10 * di.field_K + sk.field_d > 165 &&
                  mh.field_e[1 + ca.field_k][-1 + hf.field_t].g()) {
                  var13 = 0;
                }
                if (sk.field_d + 10 * di.field_K < -165 &&
                  mh.field_e[ca.field_k - 1][-1 + hf.field_t].g()) {
                  var13 = 0;
                }
                if (var13 != 0) {
                  rg.field_wb = di.field_K * 10;
                  rj.field_f = 3;
                  bd.field_k = -40;
                  ne.a(10, -77);
                }
              }
              this.w(param0 + 16427);
              if (var2_int == 0) {
                rj.field_f = 4;
              }
              if ((je.c(ca.field_k, hf.field_t, 1, 1) ||
                je.a(ca.field_k, hf.field_t, 1, 1)) &&
                var2_int == 0) {
                rj.field_f = 2;
                ne.a(30, 59);
              }
              an.field_f = an.field_f - 1;
              if ((rg.field_wb == 0 ||
                var6Lifetime2 != 0 &&
                var7Lifetime2 != 0) && var2_int != 0) {
                rj.field_f = 0;
              }
              if (!(an.field_f >= 0) ||
                !(an.field_f <= 2)) {
                an.field_f = 2;
                tf.field_b = tf.field_b + 1;
                if (tf.field_b == 1 ||
                  tf.field_b == 4) {
                  ne.a(31, -101);
                }
              }
              tf.field_b = tf.field_b % 7;
              tb.field_c = tf.field_b + 112;
              if (var21 == 0) {
                break L110;
              }
            }
            if ((decompiledFrameRemainder24) &&
              (decompiledFrameRemainder23) &&
              (decompiledFrameRemainder22) &&
              (decompiledFrameRemainder21) &&
              (decompiledFrameRemainder20) &&
              (decompiledFrameRemainder19) &&
              (decompiledFrameRemainder18)) {
              if ((d.field_b &&
                qd.field_O[96] ||
                (this.field_E == 2 ||
                this.field_E == 5)) && (qe.field_b[11] &&
                0 > sk.field_d &&
                mh.field_e[ca.field_k - 1][hf.field_t].field_a &&
                mh.field_e[-1 + ca.field_k][hf.field_t].field_S)) {
                if (tc.field_t >= 25) {
                  rj.field_f = 10;
                  rg.field_wb = 50;
                  bd.field_k = -10;
                  kj.field_d = 0;
                  if (var21 != 0) {
                    tc.field_t = tc.field_t + 2;
                  }
                } else {
                  tc.field_t = tc.field_t + 2;
                }
              }
              if ((d.field_b &&
                qd.field_O[97] ||
                (this.field_E == 1 ||
                this.field_E == 4)) && (qe.field_b[11] &&
                sk.field_d > 0 &&
                mh.field_e[1 + ca.field_k][hf.field_t].field_a &&
                mh.field_e[ca.field_k + 1][hf.field_t].field_S)) {
                boolean decompiledSharedTail4 = !(25 > tc.field_t);
                if (!decompiledSharedTail4) {
                  tc.field_t = tc.field_t + 2;
                  decompiledSharedTail4 = (var21 != 0);
                }
                if (decompiledSharedTail4) {
                  bd.field_k = -10;
                  rg.field_wb = 50;
                  kj.field_d = 0;
                  rj.field_f = 10;
                }
              }
              if (!d.field_b ||
                !qd.field_O[96]) {
                if (!(0 <= rg.field_wb)) {
                  rg.field_wb = rg.field_wb + 1;
                  if (var21 != 0) {
                    rg.field_wb = -20;
                    di.field_K = -1;
                  }
                }
              } else {
                rg.field_wb = -20;
                di.field_K = -1;
              }
              if ((d.field_b &&
                qd.field_O[98] ||
                (this.field_E == 5 ||
                this.field_E == 4)) &&
                -40 < bd.field_k) {
                bd.field_k = bd.field_k - 1;
                if ((var21 != 0) &&
                  (bd.field_k < 0)) {
                  bd.field_k = bd.field_k + 1;
                }
              } else {
                if (bd.field_k < 0) {
                  bd.field_k = bd.field_k + 1;
                }
              }
              if (d.field_b &&
                qd.field_O[97]) {
                rg.field_wb = 20;
                di.field_K = 1;
                if ((var21 != 0) &&
                  (rg.field_wb > 0)) {
                  rg.field_wb = rg.field_wb - 1;
                }
              } else {
                if (rg.field_wb > 0) {
                  rg.field_wb = rg.field_wb - 1;
                }
              }
              if ((d.field_b &&
                qd.field_O[99] ||
                var5Lifetime1 != 0) &&
                (var2_int == 0 &&
                bd.field_k < 40)) {
                bd.field_k = bd.field_k + 1;
                if ((var21 != 0) &&
                  (bd.field_k > 0)) {
                  bd.field_k = bd.field_k - 1;
                }
              } else {
                if (bd.field_k > 0) {
                  bd.field_k = bd.field_k - 1;
                }
              }
              if ((d.field_b &&
                !qd.field_O[99] ||
                var5Lifetime1 != 0) &&
                (!qd.field_O[98] &&
                mh.field_e[ca.field_k][1 + hf.field_t].g() &&
                var2_int == 0 &&
                bd.field_k < 40)) {
                bd.field_k = bd.field_k + 1;
              }
              if ((d.field_b &&
                qd.field_O[99] ||
                (var5Lifetime1 != 0 ||
                !qd.field_O[98])) &&
                var2_int != 0) {
                rj.field_f = 1;
                bd.field_k = 0;
                mf.field_i = 0;
              }
              if (var4Lifetime3 != 0 &&
                !qe.field_b[15]) {
                if (rg.field_wb * rg.field_wb > 400) {
                  rg.field_wb = rg.field_wb / 2;
                }
                if (bd.field_k * bd.field_k > 400) {
                  bd.field_k = bd.field_k / 2;
                }
              }
              mf.field_i = mf.field_i + bd.field_k;
              sk.field_d = sk.field_d + rg.field_wb;
              if (!qd.field_O[98] &&
                this.field_E != 5) {
                if (80 < sk.field_d &&
                  mh.field_e[1 + ca.field_k][hf.field_t].g()) {
                  sk.field_d = 80;
                }
                if ((!(sk.field_d >= -80)) &&
                  (mh.field_e[ca.field_k - 1][hf.field_t].g())) {
                  sk.field_d = -80;
                  if (var21 != 0) {
                    if (mf.field_i > 40 &&
                      mh.field_e[ca.field_k][hf.field_t + 1].g()) {
                      mf.field_i = 40;
                      bd.field_k = 0;
                    }
                    if (mf.field_i < -40 &&
                      mh.field_e[ca.field_k][hf.field_t - 1].g()) {
                      mf.field_i = -40;
                      bd.field_k = 0;
                    }
                  }
                }
              } else {
                if (mf.field_i > 40 &&
                  mh.field_e[ca.field_k][hf.field_t + 1].g()) {
                  mf.field_i = 40;
                  bd.field_k = 0;
                }
                if (mf.field_i < -40 &&
                  mh.field_e[ca.field_k][hf.field_t - 1].g()) {
                  mf.field_i = -40;
                  bd.field_k = 0;
                }
              }
              if (sk.field_d > 80 &&
                mf.field_i < -40 &&
                mh.field_e[1 + ca.field_k][hf.field_t - 1].g()) {
                sk.field_d = 80;
              }
              if (-80 > sk.field_d &&
                -40 > mf.field_i &&
                mh.field_e[-1 + ca.field_k][-1 + hf.field_t].g()) {
                sk.field_d = -80;
              }
              if (sk.field_d > 80 &&
                mf.field_i > 40 &&
                mh.field_e[1 + ca.field_k][1 + hf.field_t].g()) {
                sk.field_d = 80;
              }
              if (sk.field_d < -80 &&
                40 < mf.field_i &&
                mh.field_e[-1 + ca.field_k][hf.field_t + 1].g()) {
                sk.field_d = -80;
              }
              if (qd.field_O[98]) {
                if (sk.field_d > 80 &&
                  mh.field_e[ca.field_k + 1][hf.field_t].g()) {
                  sk.field_d = 80;
                }
                if ((!(sk.field_d >= -80)) &&
                  (mh.field_e[ca.field_k - 1][hf.field_t].g())) {
                  sk.field_d = -80;
                  if (var21 != 0) {
                    if (40 < mf.field_i &&
                      mh.field_e[ca.field_k][hf.field_t + 1].g()) {
                      bd.field_k = 0;
                      mf.field_i = 40;
                    }
                    if (-40 > mf.field_i &&
                      mh.field_e[ca.field_k][-1 + hf.field_t].g()) {
                      mf.field_i = -40;
                      bd.field_k = 0;
                    }
                  }
                }
              } else {
                if (40 < mf.field_i &&
                  mh.field_e[ca.field_k][hf.field_t + 1].g()) {
                  bd.field_k = 0;
                  mf.field_i = 40;
                }
                if (-40 > mf.field_i &&
                  mh.field_e[ca.field_k][-1 + hf.field_t].g()) {
                  mf.field_i = -40;
                  bd.field_k = 0;
                }
              }
              if (160 < sk.field_d) {
                sk.field_d = sk.field_d - 320;
                ca.field_k = ca.field_k + 1;
              }
              if (160 < mf.field_i) {
                hf.field_t = hf.field_t + 1;
                mf.field_i = mf.field_i - 320;
              }
              if (-160 > sk.field_d) {
                sk.field_d = sk.field_d + 320;
                ca.field_k = ca.field_k - 1;
              }
              if (mf.field_i < -160) {
                hf.field_t = hf.field_t - 1;
                mf.field_i = mf.field_i + 320;
              }
              if (!je.c(ca.field_k, hf.field_t, 1, 1) &&
                !je.c(ca.field_k, hf.field_t, 0, 1) &&
                !je.c(ca.field_k, hf.field_t, 2, 1) &&
                !je.c(ca.field_k, hf.field_t, 3, 1) &&
                !je.a(ca.field_k, hf.field_t, 0, 1) &&
                !je.a(ca.field_k, hf.field_t, 1, 1) &&
                !je.a(ca.field_k, hf.field_t, 2, 1) &&
                !je.a(ca.field_k, hf.field_t, 3, 1)) {
                rj.field_f = 3;
              }
              an.field_f = an.field_f - 1;
              if (!(an.field_f >= 0) ||
                !(an.field_f <= 8)) {
                tf.field_b = tf.field_b + 1;
                an.field_f = 8;
                if (Math.abs(rg.field_wb) > 5) {
                  an.field_f = an.field_f / 4;
                }
              }
              tf.field_b = tf.field_b % 5;
              tb.field_c = 32 + tf.field_b;
              if (var21 == 0) {
                break L110;
              }
            }
            if ((decompiledFrameRemainder24) &&
              (decompiledFrameRemainder23) &&
              (decompiledFrameRemainder22) &&
              (decompiledFrameRemainder21) &&
              (decompiledFrameRemainder20) &&
              (decompiledFrameRemainder19)) {
              boolean decompiledFrameRemainder3 = true;
              if (d.field_b &&
                qd.field_O[96] ||
                5 == this.field_E) {
                di.field_K = -1;
                if (cm.field_o == 0) {
                  rg.field_wb = -20;
                  decompiledFrameRemainder3 = (var21 != 0);
                }
                if ((decompiledFrameRemainder3) &&
                  (!(-20 >= rg.field_wb))) {
                  rg.field_wb = -20;
                  if ((var21 != 0) &&
                    (rg.field_wb < 0)) {
                    rg.field_wb = rg.field_wb + 1;
                  }
                }
              } else {
                if (rg.field_wb < 0) {
                  rg.field_wb = rg.field_wb + 1;
                }
              }
              if (bd.field_k < 40 && (d.field_b ||
                var5Lifetime1 != 0)) {
                bd.field_k = bd.field_k + 1;
              }
              if (d.field_b &&
                qd.field_O[97] ||
                this.field_E == 4) {
                if (cm.field_o != 0) {
                  if (!(rg.field_wb >= 20)) {
                    rg.field_wb = 20;
                    if (var21 != 0) {
                      rg.field_wb = 20;
                    }
                  }
                } else {
                  rg.field_wb = 20;
                }
                di.field_K = 1;
                if ((var21 != 0) &&
                  (rg.field_wb > 0)) {
                  rg.field_wb = rg.field_wb - 1;
                }
              } else {
                if (rg.field_wb > 0) {
                  rg.field_wb = rg.field_wb - 1;
                }
              }
              mf.field_i = mf.field_i + bd.field_k;
              sk.field_d = sk.field_d + rg.field_wb;
              if (mf.field_i > 0 &&
                mh.field_e[ca.field_k][hf.field_t + 1].g()) {
                if (!je.c(ca.field_k, hf.field_t + 1, 1, 0)) {
                  if (cm.field_o == 0 ||
                    mh.field_e[ca.field_k][hf.field_t + 1].field_E) {
                    ne.a(32, 94);
                    if ((var21 != 0) &&
                      (cm.field_o == 1)) {
                      ne.a(41, 119);
                    }
                  } else {
                    if (cm.field_o == 1) {
                      ne.a(41, 119);
                    }
                  }
                  if (mh.field_e[ca.field_k][hf.field_t + 1].field_v &&
                    20 <= bd.field_k &&
                    !mh.field_e[ca.field_k][1 + hf.field_t].field_E) {
                    mh.field_e[ca.field_k][1 + hf.field_t].field_S = true;
                    mh.field_e[ca.field_k][1 + hf.field_t].field_r = 975;
                    if (sc.field_b) {
                      ag.a(true, 28, hf.field_t + 1 << 5, ca.field_k << 5);
                    }
                  }
                }
                mf.field_i = 0;
                bd.field_k = 0;
              }
              if (mf.field_i < 0 &&
                mh.field_e[ca.field_k][-1 + hf.field_t].g()) {
                mf.field_i = 0;
                bd.field_k = 0;
              }
              if (Math.abs(sk.field_d) >= Math.abs(mf.field_i) && (!d.field_b ||
                !qd.field_O[99])) {
                if (80 < sk.field_d &&
                  mf.field_i < 0 &&
                  bd.field_k <= 0 &&
                  mh.field_e[1 + ca.field_k][-1 + hf.field_t].g()) {
                  bd.field_k = 0;
                  mf.field_i = 0;
                }
                if (sk.field_d < -80 &&
                  0 > mf.field_i &&
                  bd.field_k <= 0 &&
                  mh.field_e[-1 + ca.field_k][hf.field_t - 1].g()) {
                  mf.field_i = 0;
                  bd.field_k = 0;
                }
                if (80 < sk.field_d &&
                  mf.field_i > 0 &&
                  bd.field_k >= 0 &&
                  mh.field_e[ca.field_k + 1][1 + hf.field_t].g()) {
                  if (mh.field_e[ca.field_k + 1][hf.field_t + 1].field_v &&
                    bd.field_k >= 20 &&
                    !mh.field_e[ca.field_k + 1][1 + hf.field_t].field_E) {
                    mh.field_e[ca.field_k + 1][1 + hf.field_t].field_S = true;
                    mh.field_e[1 + ca.field_k][1 + hf.field_t].field_r = 975;
                    if (sc.field_b) {
                      ag.a(true, 28, 1 + hf.field_t << 5, 1 + ca.field_k << 5);
                    }
                  }
                  bd.field_k = 0;
                  mf.field_i = 0;
                }
                if ((!(sk.field_d >= -80)) &&
                  (!(mf.field_i <= 0)) &&
                  (!(bd.field_k < 0)) &&
                  (mh.field_e[-1 + ca.field_k][hf.field_t + 1].g())) {
                  if (mh.field_e[ca.field_k - 1][hf.field_t + 1].field_v &&
                    bd.field_k >= 20 &&
                    !mh.field_e[ca.field_k - 1][1 + hf.field_t].field_E) {
                    mh.field_e[-1 + ca.field_k][hf.field_t + 1].field_S = true;
                    mh.field_e[-1 + ca.field_k][hf.field_t + 1].field_r = 975;
                    if (sc.field_b) {
                      ag.a(true, 28, 1 + hf.field_t << 5, -1 + ca.field_k << 5);
                    }
                  }
                  bd.field_k = 0;
                  mf.field_i = 0;
                  if (var21 != 0) {
                    if (sk.field_d > 80 &&
                      mf.field_i < 0 &&
                      rg.field_wb >= 0 &&
                      mh.field_e[ca.field_k + 1][-1 + hf.field_t].g()) {
                      sk.field_d = 80;
                    }
                    if (sk.field_d < -80 &&
                      mf.field_i < 0 &&
                      0 >= rg.field_wb &&
                      mh.field_e[-1 + ca.field_k][-1 + hf.field_t].g()) {
                      sk.field_d = -80;
                    }
                    if (sk.field_d > 80 &&
                      mf.field_i > 0 &&
                      rg.field_wb >= 0 &&
                      mh.field_e[ca.field_k + 1][1 + hf.field_t].g()) {
                      sk.field_d = 80;
                    }
                    if (sk.field_d < -80 &&
                      mf.field_i > 0 &&
                      rg.field_wb <= 0 &&
                      mh.field_e[ca.field_k - 1][1 + hf.field_t].g()) {
                      sk.field_d = -80;
                    }
                  }
                }
              } else {
                if (sk.field_d > 80 &&
                  mf.field_i < 0 &&
                  rg.field_wb >= 0 &&
                  mh.field_e[ca.field_k + 1][-1 + hf.field_t].g()) {
                  sk.field_d = 80;
                }
                if (sk.field_d < -80 &&
                  mf.field_i < 0 &&
                  0 >= rg.field_wb &&
                  mh.field_e[-1 + ca.field_k][-1 + hf.field_t].g()) {
                  sk.field_d = -80;
                }
                if (sk.field_d > 80 &&
                  mf.field_i > 0 &&
                  rg.field_wb >= 0 &&
                  mh.field_e[ca.field_k + 1][1 + hf.field_t].g()) {
                  sk.field_d = 80;
                }
                if (sk.field_d < -80 &&
                  mf.field_i > 0 &&
                  rg.field_wb <= 0 &&
                  mh.field_e[ca.field_k - 1][1 + hf.field_t].g()) {
                  sk.field_d = -80;
                }
              }
              stackIn_1669_0 = (1 != cm.field_o) ? 0 : 1;
              var8Lifetime1 = stackIn_1669_0;
              if (sk.field_d > 40 &&
                mh.field_e[ca.field_k + 1][hf.field_t].g()) {
                sk.field_d = 40;
                if (var8Lifetime1 != 0 &&
                  rg.field_wb > 28 &&
                  mh.field_e[ca.field_k + 1][hf.field_t].field_v) {
                  mh.field_e[ca.field_k + 1][hf.field_t].field_S = true;
                  mh.field_e[ca.field_k + 1][hf.field_t].field_r = 975;
                  rg.field_wb = -10;
                  bd.field_k = bd.field_k - 10;
                  if (sc.field_b) {
                    ag.a(true, 28, hf.field_t << 5, 1 + ca.field_k << 5);
                    if (var21 != 0) {
                      rg.field_wb = 0;
                    }
                  }
                } else {
                  rg.field_wb = 0;
                }
              }
              var9Lifetime1 = 0;
              if (sk.field_d < -40 &&
                mh.field_e[-1 + ca.field_k][hf.field_t].g()) {
                sk.field_d = -40;
                if (var8Lifetime1 != 0 &&
                  rg.field_wb < -28 &&
                  mh.field_e[-1 + ca.field_k][hf.field_t].field_v) {
                  mh.field_e[-1 + ca.field_k][hf.field_t].field_S = true;
                  mh.field_e[ca.field_k - 1][hf.field_t].field_r = 975;
                  rg.field_wb = 10;
                  bd.field_k = bd.field_k - 10;
                  if (sc.field_b) {
                    ag.a(true, 28, hf.field_t << 5, -1 + ca.field_k << 5);
                    if (var21 != 0) {
                      rg.field_wb = 0;
                    }
                  }
                } else {
                  rg.field_wb = 0;
                }
              }
              if (sk.field_d > 160) {
                var9Lifetime1 = 1;
                ca.field_k = ca.field_k + 1;
                sk.field_d = sk.field_d - 320;
              }
              if (sk.field_d < -160) {
                ca.field_k = ca.field_k - 1;
                var9Lifetime1 = 1;
                sk.field_d = sk.field_d + 320;
              }
              if (mf.field_i > 160) {
                mf.field_i = mf.field_i - 320;
                var9Lifetime1 = 1;
                hf.field_t = hf.field_t + 1;
              }
              if (mf.field_i < -160) {
                mf.field_i = mf.field_i + 320;
                hf.field_t = hf.field_t - 1;
                var9Lifetime1 = 1;
              }
              if (var9Lifetime1 != 0 &&
                var4Lifetime3 == 0 &&
                je.field_O.f(hf.field_t, 2, ca.field_k)) {
                ne.a(ll.a((byte) -73, 4) + 57, 85);
              }
              boolean decompiledFrameRemainder2 = true;
              if (0 < bd.field_k) {
                rj.field_f = 4;
                decompiledFrameRemainder2 = (var21 != 0);
              }
              if ((decompiledFrameRemainder2) && (bd.field_k == 0 &&
                rg.field_wb * rg.field_wb > 225)) {
                if (rg.field_wb < 0) {
                  rg.field_wb = -15;
                  if (var21 != 0) {
                    rg.field_wb = 15;
                  }
                } else {
                  rg.field_wb = 15;
                }
              }
              if (var2_int == 0 && (je.c(ca.field_k, hf.field_t, 1, 1) ||
                je.a(ca.field_k, hf.field_t, 1, 1))) {
                if (sc.field_b) {
                  ag.a(true, 17, hf.field_t * 32, ca.field_k * 32);
                }
                rj.field_f = 2;
              }
              if (var2_int != 0) {
                rj.field_f = 1;
              }
              if (!qd.field_O[98] ||
                !qd.field_O[49] ||
                !qe.field_b[20] ||
                !(10 < qd.field_K)) {
                if ((!je.c(ca.field_k, hf.field_t, 1, 3)) &&
                  (pl.field_h == 15)) {
                  var13 = (640 + mf.field_i * 4) / 320;
                  if (var13 == 4) {
                    var13--;
                  }
                  if (je.c(ca.field_k, hf.field_t + 1, 1, var13)) {
                    gm.b(100);
                  }
                  if (var21 != 0) {
                    rj.field_f = 12;
                  }
                }
              } else {
                rj.field_f = 12;
              }
              if (rj.field_f == 3) {
                tb.field_c = 7;
              }
              if (rj.field_f == 4) {
                tb.field_c = 15;
              }
              tb.field_c = 41;
              if (-10 < bd.field_k) {
                tb.field_c = tb.field_c + 1;
              }
              if (bd.field_k > -20) {
                tb.field_c = tb.field_c + 1;
              }
              if (var2_int == 0) {
                break L110;
              }
              tb.field_c = 45;
              if (var21 == 0) {
                break L110;
              }
            }
            if ((decompiledFrameRemainder24) &&
              (decompiledFrameRemainder23) &&
              (decompiledFrameRemainder22) &&
              (decompiledFrameRemainder21) &&
              (decompiledFrameRemainder20)) {
              tb.field_c = 48;
              if (kj.field_d > 3) {
                tb.field_c = tb.field_c + 1;
              }
              if (7 < kj.field_d) {
                tb.field_c = tb.field_c + 1;
              }
              kj.field_d = kj.field_d + 1;
              if (kj.field_d == 4) {
                if (mh.field_e[this.field_db][this.field_N].field_a &&
                  !mh.field_e[this.field_db][this.field_N].field_b) {
                  if (cm.field_o == 1) {
                    if (!mh.field_e[this.field_db][this.field_N].field_E) {
                      if (!mh.field_e[this.field_db][this.field_N].field_v) {
                        ne.a(ll.a((byte) -73, 3) + 54, param0 + 16598);
                        if (var21 != 0) {
                          ne.a(51 + ll.a((byte) -73, 3), -125);
                          ne.a(ll.a((byte) -73, 3) + 48, 71);
                          ne.a(24, -105);
                        }
                      } else {
                        ne.a(51 + ll.a((byte) -73, 3), -125);
                        if (var21 != 0) {
                          ne.a(ll.a((byte) -73, 3) + 48, 71);
                          ne.a(24, -105);
                        }
                      }
                    } else {
                      ne.a(ll.a((byte) -73, 3) + 48, 71);
                      if (var21 != 0) {
                        ne.a(24, -105);
                      }
                    }
                  } else {
                    ne.a(24, -105);
                  }
                  if (mh.field_e[this.field_db][this.field_N].field_S) {
                    ne.a(21, 106);
                    if ((var21 != 0) &&
                      (mh.field_e[this.field_db][this.field_N].field_b)) {
                      ne.a(23, -119);
                      if (sc.field_b) {
                        ag.a(true, 2, 32 * this.field_N, 32 * this.field_db);
                      }
                    }
                  }
                } else {
                  if (mh.field_e[this.field_db][this.field_N].field_b) {
                    ne.a(23, -119);
                    if (sc.field_b) {
                      ag.a(true, 2, 32 * this.field_N, 32 * this.field_db);
                    }
                  }
                }
              }
              if (7 == kj.field_d &&
                mh.field_e[this.field_db][this.field_N].field_a &&
                !mh.field_e[this.field_db][this.field_N].field_b) {
                boolean decompiledSharedTail3 = (mh.field_e[this.field_db][this.field_N].field_S ||
                  mh.field_e[this.field_db][this.field_N].field_v);
                if (!decompiledSharedTail3) {
                  mh.field_e[this.field_db][this.field_N].field_S = true;
                  mh.field_e[this.field_db][this.field_N].field_r = 975;
                  rg.field_sb = rg.field_sb - 3;
                  decompiledSharedTail3 = (var21 != 0);
                }
                if (decompiledSharedTail3) {
                  if (mh.field_e[this.field_db][this.field_N].field_v) {
                    lb.field_r = lb.field_r + 1;
                    if (200 <= lb.field_r) {
                      fn.a(24, 231, 3);
                    }
                  }
                  mh.field_e[this.field_db][this.field_N].field_a = false;
                  rg.field_sb = rg.field_sb - 3;
                }
              }
              if (kj.field_d <= 10) {
                break L110;
              }
              rj.field_f = 0;
              if (var21 == 0) {
                break L110;
              }
            }
            if ((decompiledFrameRemainder24) &&
              (decompiledFrameRemainder23) &&
              (decompiledFrameRemainder22) &&
              (decompiledFrameRemainder21)) {
              tb.field_c = 56;
              if (kj.field_d > 3) {
                tb.field_c = tb.field_c + 1;
              }
              if (7 < kj.field_d) {
                tb.field_c = tb.field_c + 1;
              }
              kj.field_d = kj.field_d + 1;
              if (kj.field_d == 5 &&
                mh.field_e[this.field_db][this.field_N].field_a &&
                !mh.field_e[this.field_db][this.field_N].field_b) {
                boolean decompiledSharedTail2 = (mh.field_e[this.field_db][this.field_N].field_S ||
                  mh.field_e[this.field_db][this.field_N].field_v);
                if (!decompiledSharedTail2) {
                  mh.field_e[this.field_db][this.field_N].field_S = true;
                  mh.field_e[this.field_db][this.field_N].field_r = 975;
                  rg.field_sb = rg.field_sb - 3;
                  decompiledSharedTail2 = (var21 != 0);
                }
                if (decompiledSharedTail2) {
                  if (sc.field_b &&
                    mh.field_e[this.field_db][this.field_N].field_b) {
                    ag.a(true, 2, this.field_N * 32, this.field_db * 32);
                  }
                  ne.a(21, param0 ^ 16424);
                  mh.field_e[this.field_db][this.field_N].field_a = false;
                  rg.field_sb = rg.field_sb - 3;
                }
              }
              if (kj.field_d <= 10) {
                break L110;
              }
              rj.field_f = 3;
              if (var21 == 0) {
                break L110;
              }
            }
            if ((decompiledFrameRemainder24) &&
              (decompiledFrameRemainder23) &&
              (decompiledFrameRemainder22)) {
              tb.field_c = 96;
              kj.field_d = kj.field_d + 1;
              if (5 < kj.field_d) {
                tb.field_c = tb.field_c + 1;
              }
              if (kj.field_d > 10) {
                tb.field_c = tb.field_c + 1;
              }
              if (kj.field_d == 16) {
                var13Lifetime2 = jf.b((byte) 52);
                uf.field_p[var13Lifetime2] = new gf(ca.field_k, hf.field_t, 11);
                uf.field_p[var13Lifetime2].field_i = di.field_K;
                if (je.c(ca.field_k, hf.field_t, 1, 1)) {
                  uf.field_p[var13Lifetime2].field_g = -1;
                }
                ne.a(0, param0 + 16391);
              }
              if (kj.field_d > 15) {
                tb.field_c = tb.field_c + 1;
              }
              if (kj.field_d > 20) {
                tb.field_c = tb.field_c + 1;
              }
              if (kj.field_d > 34) {
                if (qd.field_O[81]) {
                  kj.field_d = 15;
                  tb.field_c = 98;
                  if (var21 != 0) {
                    tb.field_c = tb.field_c + 1;
                  }
                } else {
                  tb.field_c = tb.field_c + 1;
                }
              }
              if (kj.field_d <= 40) {
                break L110;
              }
              rj.field_f = 0;
              if (var21 == 0) {
                break L110;
              }
            }
            if ((decompiledFrameRemainder24) &&
              (decompiledFrameRemainder23)) {
              var10Lifetime1 = di.field_K + ca.field_k;
              var11Lifetime1 = -16 + var10Lifetime1;
              if (var11Lifetime1 < 0) {
                var11Lifetime1 = -var11Lifetime1;
              }
              if (0 >= var10Lifetime1 ||
                var10Lifetime1 >= 31 ||
                !(0 < hf.field_t) ||
                var10Lifetime1 <= 0 ||
                var10Lifetime1 >= 31 ||
                !((-1 + je.field_t) > hf.field_t) ||
                !(hf.field_t > var11Lifetime1 / 2)) {
                rj.field_f = 0;
                kj.field_d = 0;
                if (var21 == 0) {
                  break L110;
                }
              }
              kj.field_d = kj.field_d + 1;
              tb.field_c = 88;
              if (kj.field_d > 5) {
                tb.field_c = 89;
              }
              if (15 < kj.field_d) {
                tb.field_c = 90;
              }
              if (18 == kj.field_d) {
                boolean decompiledSharedTail1 = !(mh.field_e[ca.field_k + di.field_K][hf.field_t].field_S);
                if (!decompiledSharedTail1) {
                  boolean decompiledSharedTail0 = !(!mh.field_e[ca.field_k + 2 * di.field_K][hf.field_t].field_a);
                  if (!decompiledSharedTail0) {
                    mh.field_e[di.field_K * 2 + ca.field_k][hf.field_t].field_a = true;
                    mh.field_e[di.field_K * 1 + ca.field_k][hf.field_t].field_a = false;
                    mh.field_e[ca.field_k + di.field_K * 2][hf.field_t].field_U = mh.field_e[di.field_K * 1 + ca.field_k][hf.field_t].field_U;
                    mh.field_e[di.field_K * 1 + ca.field_k][hf.field_t].field_U = -1;
                    mh.field_e[di.field_K * 2 + ca.field_k][hf.field_t].field_S = mh.field_e[1 * di.field_K + ca.field_k][hf.field_t].field_S;
                    mh.field_e[ca.field_k + di.field_K * 2][hf.field_t].field_r = 1000;
                    uf.field_p[jf.b((byte) 108)] = new gf(di.field_K * 1 + ca.field_k, hf.field_t, 8);
                    decompiledSharedTail0 = (var21 != 0);
                  }
                  if (decompiledSharedTail0) {
                    mh.field_e[ca.field_k + 1 * di.field_K][hf.field_t].field_a = false;
                  }
                  rg.field_wb = 50 * di.field_K;
                  rj.field_f = 3;
                  bd.field_k = -10;
                  decompiledSharedTail1 = (var21 != 0);
                }
                if (decompiledSharedTail1) {
                  mh.field_e[ca.field_k + di.field_K][hf.field_t].field_S = true;
                  mh.field_e[ca.field_k + di.field_K][hf.field_t].field_r = 1000;
                }
                uf.field_p[jf.b((byte) 60)] = new gf(di.field_K * 1 + ca.field_k, hf.field_t, 8);
              }
              if (kj.field_d <= 20) {
                break L110;
              }
              rj.field_f = 0;
              if (var21 == 0) {
                break L110;
              }
            }
            if (decompiledFrameRemainder24) {
              tb.field_c = 128;
              kj.field_d = kj.field_d + 1;
              if (kj.field_d > 5) {
                tb.field_c = tb.field_c + 1;
              }
              if (kj.field_d > 10) {
                tb.field_c = tb.field_c + 1;
              }
              if (15 < kj.field_d) {
                tb.field_c = tb.field_c + 1;
              }
              if (kj.field_d > 20) {
                tb.field_c = tb.field_c + 1;
              }
              if (30 < kj.field_d) {
                tb.field_c = tb.field_c + 1;
              }
              if (35 < kj.field_d) {
                tb.field_c = tb.field_c + 1;
              }
              if (kj.field_d > 40) {
                tb.field_c = tb.field_c + 1;
              }
              if (kj.field_d > 45) {
                tb.field_c = tb.field_c - 2;
              }
              if (kj.field_d > 50) {
                tb.field_c = tb.field_c + 1;
              }
              if (kj.field_d > 55) {
                tb.field_c = tb.field_c + 1;
              }
              if (kj.field_d <= 60) {
                break L110;
              }
              rj.field_f = 0;
              if (var21 == 0) {
                break L110;
              }
            }
            ne.a(35, param0 + 16440);
            kj.field_d = kj.field_d + 1;
            if (kj.field_d > 5) {
              tb.field_c = tb.field_c + 1;
              kj.field_d = 0;
            }
            if (!(tb.field_c >= 0) ||
              !(rg.field_tb.length > tb.field_c)) {
              tb.field_c = 0;
            }
            if (qd.field_K > 0) {
              qd.field_K = qd.field_K - 1;
            }
            if (d.field_b &&
              qd.field_O[96]) {
              di.field_K = -1;
              rg.field_wb = -10;
            }
            if (d.field_b &&
              qd.field_O[97]) {
              rg.field_wb = 10;
              di.field_K = 1;
            }
            if (je.d(ca.field_k, hf.field_t, 1, 1)) {
              je.field_O.a(ca.field_k, param0 ^ 16506, hf.field_t);
              dupTemp$2 = jf.b((byte) 73);
              dupTemp$3 = new gf(ca.field_k, hf.field_t, 16);
              uf.field_p[dupTemp$2] = dupTemp$3;
              var13_ref_gfLifetime1 = dupTemp$3;
              var13_ref_gfLifetime1.field_b = 250;
            }
            if (qd.field_K > 0 &&
              d.field_b &&
              qd.field_O[98] &&
              qd.field_O[49]) {
              stackIn_2099_0 = 1;
            } else {
              stackIn_2099_0 = 0;
            }
            var12 = stackIn_2099_0;
            if (var12 != 0 &&
              bd.field_k > -80) {
              bd.field_k = bd.field_k - 1;
              if ((var21 != 0) &&
                (40 > bd.field_k)) {
                bd.field_k = bd.field_k + 1;
              }
            } else {
              if (40 > bd.field_k) {
                bd.field_k = bd.field_k + 1;
              }
            }
            if (!qd.field_O[98] ||
              qd.field_K == 0) {
              if (var2_int != 0) {
                rj.field_f = 1;
                bd.field_k = 0;
                mf.field_i = 0;
                if (var21 != 0) {
                  rj.field_f = 4;
                }
              } else {
                rj.field_f = 4;
              }
            }
            sk.field_d = sk.field_d + rg.field_wb;
            mf.field_i = mf.field_i + bd.field_k;
            if ((var4Lifetime3 != 0 ||
              !(tc.field_s <= 0)) && (var12 != 0 &&
              !qe.field_b[15])) {
              nf.field_e = 40;
              rj.field_f = 13;
            }
            if (var12 != 0) {
              if (mf.field_i > 40 &&
                mh.field_e[ca.field_k][hf.field_t + 1].g()) {
                mf.field_i = 40;
                bd.field_k = 0;
              }
              if ((!(mf.field_i >= -40)) &&
                (mh.field_e[ca.field_k][hf.field_t - 1].g())) {
                bd.field_k = 0;
                mf.field_i = -40;
                if (var21 != 0) {
                  if (sk.field_d > 80 &&
                    mh.field_e[1 + ca.field_k][hf.field_t].g()) {
                    sk.field_d = 80;
                  }
                  if (sk.field_d < -80 &&
                    mh.field_e[ca.field_k - 1][hf.field_t].g()) {
                    sk.field_d = -80;
                  }
                }
              }
            } else {
              if (sk.field_d > 80 &&
                mh.field_e[1 + ca.field_k][hf.field_t].g()) {
                sk.field_d = 80;
              }
              if (sk.field_d < -80 &&
                mh.field_e[ca.field_k - 1][hf.field_t].g()) {
                sk.field_d = -80;
              }
            }
            if (80 < sk.field_d &&
              -40 > mf.field_i &&
              mh.field_e[ca.field_k + 1][-1 + hf.field_t].g()) {
              sk.field_d = 80;
            }
            if (sk.field_d < -80 &&
              -40 > mf.field_i &&
              mh.field_e[-1 + ca.field_k][-1 + hf.field_t].g()) {
              sk.field_d = -80;
            }
            if (sk.field_d > 80 &&
              mf.field_i > 40 &&
              mh.field_e[ca.field_k + 1][hf.field_t + 1].g()) {
              sk.field_d = 80;
            }
            if (sk.field_d < -80 &&
              mf.field_i > 40 &&
              mh.field_e[ca.field_k - 1][1 + hf.field_t].g()) {
              sk.field_d = -80;
            }
            if (var12 == 0) {
              if (40 < mf.field_i &&
                mh.field_e[ca.field_k][1 + hf.field_t].g()) {
                mf.field_i = 40;
                bd.field_k = 0;
              }
              if ((!(-40 <= mf.field_i)) &&
                (mh.field_e[ca.field_k][-1 + hf.field_t].g())) {
                mf.field_i = -40;
                bd.field_k = 0;
                if (var21 != 0) {
                  if (sk.field_d > 80 &&
                    mh.field_e[ca.field_k + 1][hf.field_t].g()) {
                    sk.field_d = 80;
                  }
                  if (sk.field_d < -80 &&
                    mh.field_e[-1 + ca.field_k][hf.field_t].g()) {
                    sk.field_d = -80;
                  }
                }
              }
            } else {
              if (sk.field_d > 80 &&
                mh.field_e[ca.field_k + 1][hf.field_t].g()) {
                sk.field_d = 80;
              }
              if (sk.field_d < -80 &&
                mh.field_e[-1 + ca.field_k][hf.field_t].g()) {
                sk.field_d = -80;
              }
            }
            if (sk.field_d > 160) {
              ca.field_k = ca.field_k + 1;
              sk.field_d = sk.field_d - 320;
            }
            if (mf.field_i > 160) {
              mf.field_i = mf.field_i - 320;
              hf.field_t = hf.field_t + 1;
            }
            if (sk.field_d < -160) {
              ca.field_k = ca.field_k - 1;
              sk.field_d = sk.field_d + 320;
            }
            if (mf.field_i < -160) {
              mf.field_i = mf.field_i + 320;
              hf.field_t = hf.field_t - 1;
            }
            if (je.c(ca.field_k, hf.field_t, 1, 1)) {
              rj.field_f = 2;
            }
          }
          boolean decompiledFrameRemainder1 = true;
          if (je.c(ca.field_k, hf.field_t, 1, 1) ||
            je.a(ca.field_k, hf.field_t, 1, 1) ||
            je.d(ca.field_k, hf.field_t, 1, 1) &&
            !qe.field_b[3]) {
            boolean decompiledFrameRemainder0 = true;
            if (!je.c(ca.field_k, hf.field_t, 1, 1) &&
              je.d(ca.field_k, hf.field_t, 1, 1) &&
              kn.field_E > 300 &&
              !qe.field_b[3]) {
              if (sc.field_b &&
                !ni.a(16, 11764)) {
                var6Lifetime3 = 32 * ca.field_k + sk.field_d / 10;
                var7Lifetime3 = mf.field_i / 10 + 32 * hf.field_t;
                var8Lifetime2 = -pd.field_a.field_x + (var6Lifetime3 - 1);
                var9Lifetime2 = -1 + var7Lifetime3;
                ag.a(true, 16, -(ef.field_b[3].field_A >> 1) + (pd.field_a.field_A >> 1) + var9Lifetime2, -ef.field_b[3].field_y + var8Lifetime2);
              }
              kn.field_E = 300;
              decompiledFrameRemainder0 = (var21 != 0);
            }
            if ((decompiledFrameRemainder0) &&
              (sc.field_b)) {
              if (!qe.field_b[2] &&
                !qe.field_b[19] ||
                !(kn.field_E < 950)) {
                if ((!qe.field_b[2]) &&
                  (!(450 <= kn.field_E)) &&
                  (!ni.a(9, 11764))) {
                  var6Lifetime3Lifetime1 = sk.field_d / 10 + ca.field_k * 32;
                  var7Lifetime3Lifetime1 = mf.field_i / 10 + 32 * hf.field_t;
                  var8Lifetime2Lifetime1 = -1 - pd.field_a.field_x + var6Lifetime3Lifetime1;
                  var9Lifetime2Lifetime1 = -1 + var7Lifetime3Lifetime1;
                  ag.a(true, 9, -(ef.field_b[3].field_A >> 1) + (pd.field_a.field_A >> 1) + var9Lifetime2Lifetime1, var8Lifetime2Lifetime1 - ef.field_b[3].field_y);
                }
              } else {
                if (!ni.a(9, 11764)) {
                  var6Lifetime3Lifetime1 = sk.field_d / 10 + ca.field_k * 32;
                  var7Lifetime3Lifetime1 = mf.field_i / 10 + 32 * hf.field_t;
                  var8Lifetime2Lifetime1 = -1 - pd.field_a.field_x + var6Lifetime3Lifetime1;
                  var9Lifetime2Lifetime1 = -1 + var7Lifetime3Lifetime1;
                  ag.a(true, 9, -(ef.field_b[3].field_A >> 1) + (pd.field_a.field_A >> 1) + var9Lifetime2Lifetime1, var8Lifetime2Lifetime1 - ef.field_b[3].field_y);
                }
              }
            }
            kn.field_E = kn.field_E - 1;
            if ((kn.field_E >= 0) &&
              (decompiledFrameRemainder1 = !(kn.field_E % 50 <= 5)) &&
              (decompiledFrameRemainder1 = !(kn.field_E % 50 >= 30))) {
              decompiledFrameRemainder1 = !(kn.field_E >= 300);
            }
            if (decompiledFrameRemainder1) {
              tb.field_c = 55;
              if (je.c(ca.field_k, hf.field_t, 1, 1)) {
                tb.field_c = 63;
              }
              if (!(kn.field_E >= 0)) {
                if (!je.c(ca.field_k, hf.field_t, 1, 1)) {
                  if ((!je.a(ca.field_k, hf.field_t, 1, 1)) &&
                    (decompiledFrameRemainder1 = !(!je.d(ca.field_k, hf.field_t, 1, 1)))) {
                    rj.a((byte) -38, 2);
                    decompiledFrameRemainder1 = (var21 != 0);
                  }
                  if (decompiledFrameRemainder1) {
                    rj.a((byte) -38, 11);
                    if (var21 != 0) {
                      rj.a((byte) -38, 1);
                      kn.field_E = 500;
                      if (qe.field_b[2]) {
                        kn.field_E = 1000;
                      }
                      if (qe.field_b[19]) {
                        kn.field_E = 2000;
                      }
                    }
                  }
                } else {
                  rj.a((byte) -38, 1);
                  if (var21 != 0) {
                    kn.field_E = 500;
                    if (qe.field_b[2]) {
                      kn.field_E = 1000;
                    }
                    if (qe.field_b[19]) {
                      kn.field_E = 2000;
                    }
                  }
                }
              }
            }
          } else {
            kn.field_E = 500;
            if (qe.field_b[2]) {
              kn.field_E = 1000;
            }
            if (qe.field_b[19]) {
              kn.field_E = 2000;
            }
          }
          if (qe.field_b[16] ||
            1 != cm.field_o ||
            !mh.field_e[ca.field_k][hf.field_t].field_A) {
            if ((!je.c(ca.field_k, hf.field_t, 1, 1)) &&
              (!je.a(ca.field_k, hf.field_t, 1, 1))) {
              cn.field_C = cn.field_C + 1;
              if (!(cn.field_C <= 0)) {
                cn.field_C = 0;
                if (var21 != 0) {
                  cn.field_C = cn.field_C - 1;
                  if (sc.field_b &&
                    !ni.a(29, 11764)) {
                    var6Lifetime4 = 32 * ca.field_k + sk.field_d / 10;
                    var7Lifetime4 = mf.field_i / 10 + 32 * hf.field_t;
                    var8Lifetime3 = 28 + var6Lifetime4;
                    var9Lifetime3 = -1 + var7Lifetime4;
                    ag.a(true, 29, var9Lifetime3 + 8 - (ef.field_b[3].field_A >> 1), var8Lifetime3 - 2);
                  }
                  if (-300 > cn.field_C &&
                    15 == pl.field_h) {
                    if (ke.field_V) {
                      cn.field_C = -300;
                    }
                    rj.a((byte) -38, 8);
                  }
                }
              }
            }
          } else {
            cn.field_C = cn.field_C - 1;
            if (sc.field_b &&
              !ni.a(29, 11764)) {
              var6Lifetime4 = 32 * ca.field_k + sk.field_d / 10;
              var7Lifetime4 = mf.field_i / 10 + 32 * hf.field_t;
              var8Lifetime3 = 28 + var6Lifetime4;
              var9Lifetime3 = -1 + var7Lifetime4;
              ag.a(true, 29, var9Lifetime3 + 8 - (ef.field_b[3].field_A >> 1), var8Lifetime3 - 2);
            }
            if (-300 > cn.field_C &&
              15 == pl.field_h) {
              if (ke.field_V) {
                cn.field_C = -300;
              }
              rj.a((byte) -38, 8);
            }
          }
          if (!(je.e(ca.field_k, hf.field_t, 1, 1) <= 0) ||
            !(je.e(ca.field_k, hf.field_t, 2, 2) <= 0)) {
            rj.a((byte) -38, 3);
          }
          var6Lifetime5 = je.a() ? 1 : 0;
          if (pl.field_h == 15 &&
            ul.field_b == 0 &&
            var6Lifetime5 != 0) {
            ul.field_b = 30;
          }
          var7Lifetime5 = je.field_O.f(hf.field_t, 2, ca.field_k) ? 1 : 0;
          if (ul.field_b > 0 && (var2_int != 0 ||
            var6Lifetime5 != 0 ||
            var7Lifetime5 != 0)) {
            if (var6Lifetime5 == 0 &&
              var7Lifetime5 != 0) {
              var8_ref_gf = new gf(ca.field_k, hf.field_t, 16);
              var8_ref_gf.field_b = 250;
              uf.field_p[jf.b((byte) 53)] = var8_ref_gf;
              ul.field_b = 1;
            }
            fieldTemp$4 = ul.field_b - 1;
            ul.field_b = ul.field_b - 1;
            if (fieldTemp$4 == 0) {
              rj.a((byte) -38, 12);
            }
          }
          if (mh.field_e[ca.field_k][hf.field_t].field_a &&
            !mh.field_e[ca.field_k][hf.field_t].field_v &&
            !qe.field_b[7]) {
            rj.a((byte) -38, 4);
          }
          if (ch.field_h != -1) {
            tb.field_c = ch.field_h;
            cl.field_I = cl.field_I + 1;
            if (ch.field_h < 5 &&
              ch.field_h >= 0) {
              tb.field_c = 4 * ch.field_h + 64;
              if (cl.field_I > 5) {
                tb.field_c = tb.field_c + 1;
              }
              if (cl.field_I > 10) {
                tb.field_c = tb.field_c + 1;
              }
            }
            if (ch.field_h == 5) {
              tb.field_c = 0;
              if (5 < cl.field_I) {
                tb.field_c = tb.field_c + 1;
              }
              if (10 < cl.field_I) {
                tb.field_c = tb.field_c + 1;
              }
            }
            if (-1 > ch.field_h) {
              tb.field_c = 3 + ch.field_h;
              if (5 < cl.field_I) {
                tb.field_c = tb.field_c - 1;
              }
              if (cl.field_I > 10) {
                tb.field_c = tb.field_c - 1;
              }
            }
            if (50 < cl.field_I) {
              cl.field_I = 0;
              ch.field_h = -1;
            }
          }
          stackIn_2601_0 = mh.field_e[ca.field_k][hf.field_t];
          if (!qe.field_b[6]) {
            stackIn_2602_1 = 180;
          } else {
            stackIn_2602_1 = 255;
          }
          boolean decompiledFrameRemainder13 = true;
          stackIn_2601_0.field_i = stackIn_2602_1;
          mh.field_e[16][0].field_i = 255;
          mh.field_e[16][1].field_i = 255;
          mh.field_e[16][2].field_i = 255;
          mh.field_e[16][3].field_i = 255;
          mh.field_e[ca.field_k][hf.field_t].field_V = true;
          mh.field_e[ca.field_k][hf.field_t].field_e = true;
          var8Lifetime4 = qd.field_O[83] ? 1 : 0;
          var9Lifetime4 = -1;
          var10Lifetime2 = -1;
          if (d.field_b && (qd.field_O[d.field_e] ||
            var8Lifetime4 != 0 &&
            qd.field_O[96] &&
            qd.field_O[98])) {
            stackIn_2618_0 = 1;
            decompiledFrameRemainder13 = false;
          }
          else {
            stackIn_2618_0 = 0;
          }
          L442: {
            var11Lifetime2 = stackIn_2618_0;
            if (d.field_b && (qd.field_O[lb.field_w] ||
              var8Lifetime4 != 0 &&
              qd.field_O[98] &&
              !qd.field_O[96] &&
              !qd.field_O[97])) {
              stackIn_2637_0 = 1;
              break L442;
            }
            stackIn_2637_0 = 0;
          }
          L445: {
            var12Lifetime1 = stackIn_2637_0;
            if (d.field_b && (qd.field_O[hd.field_l] ||
              var8Lifetime4 != 0 &&
              qd.field_O[97] &&
              qd.field_O[98])) {
              stackIn_2653_0 = 1;
              break L445;
            }
            stackIn_2653_0 = 0;
          }
          L448: {
            var13Lifetime1 = stackIn_2653_0;
            if (d.field_b && (qd.field_O[tk.field_g] ||
              var8Lifetime4 != 0 &&
              qd.field_O[96] &&
              qd.field_O[99])) {
              stackIn_2669_0 = 1;
              break L448;
            }
            stackIn_2669_0 = 0;
          }
          L451: {
            var14Lifetime1 = stackIn_2669_0;
            if (d.field_b && (qd.field_O[qc.field_c] ||
              var8Lifetime4 != 0 &&
              qd.field_O[99] &&
              !qd.field_O[96] &&
              !qd.field_O[97])) {
              stackIn_2688_0 = 1;
              break L451;
            }
            stackIn_2688_0 = 0;
          }
          L454: {
            var15 = stackIn_2688_0;
            if (d.field_b && (qd.field_O[qm.field_a] ||
              var8Lifetime4 != 0 &&
              qd.field_O[97] &&
              qd.field_O[99])) {
              stackIn_2704_0 = 1;
              break L454;
            }
            stackIn_2704_0 = 0;
          }
          L457: {
            var16 = stackIn_2704_0;
            if (d.field_b && (qd.field_O[ge.field_f] ||
              var8Lifetime4 != 0 &&
              qd.field_O[96] &&
              !qd.field_O[98] &&
              !qd.field_O[99])) {
              stackIn_2723_0 = 1;
              break L457;
            }
            stackIn_2723_0 = 0;
          }
          boolean decompiledFrameRemainder12 = true;
          var17 = stackIn_2723_0;
          if (d.field_b && (qd.field_O[hi.field_v] ||
            var8Lifetime4 != 0 &&
            qd.field_O[97] &&
            !qd.field_O[98] &&
            !qd.field_O[99])) {
            stackIn_2742_0 = 1;
            decompiledFrameRemainder12 = false;
          }
          else {
            stackIn_2742_0 = 0;
          }
          var18 = stackIn_2742_0;
          if (var11Lifetime2 != 0 ||
            var12Lifetime1 != 0 ||
            var13Lifetime1 != 0 ||
            var17 != 0 ||
            var18 != 0 ||
            var14Lifetime1 != 0 ||
            var15 != 0 ||
            var16 != 0) {
            gl.a(8, param0 ^ -16481);
          }
          stackIn_2771_0 = (rj.field_f > 1) ? 0 : 1;
          var19 = stackIn_2771_0;
          if ((var11Lifetime2 != 0 ||
            this.field_U == 5) && (var19 != 0 &&
            mh.field_e[-1 + ca.field_k][hf.field_t].field_a &&
            mh.field_e[ca.field_k][-1 + hf.field_t].field_a)) {
            rj.field_f = 7;
            kj.field_d = 0;
            var19 = 0;
            var9Lifetime4 = ca.field_k - 1;
            var10Lifetime2 = hf.field_t;
            di.field_K = -1;
          }
          if ((var14Lifetime1 != 0 ||
            this.field_U == 3) &&
            (var19 != 0 &&
            mh.field_e[-1 + ca.field_k][hf.field_t].field_a &&
            mh.field_e[ca.field_k][hf.field_t + 1].field_a)) {
            var10Lifetime2 = hf.field_t;
            kj.field_d = 0;
            di.field_K = -1;
            var19 = 0;
            var9Lifetime4 = ca.field_k - 1;
            rj.field_f = 7;
          }
          if ((var13Lifetime1 != 0 ||
            this.field_U == 5) &&
            (var19 != 0 &&
            mh.field_e[ca.field_k + 1][hf.field_t].field_a &&
            mh.field_e[ca.field_k][-1 + hf.field_t].field_a)) {
            rj.field_f = 7;
            kj.field_d = 0;
            di.field_K = 1;
            var19 = 0;
            var10Lifetime2 = hf.field_t;
            var9Lifetime4 = ca.field_k + 1;
          }
          if (var16 != 0 &&
            var19 != 0 &&
            mh.field_e[1 + ca.field_k][hf.field_t].field_a &&
            mh.field_e[ca.field_k][hf.field_t + 1].field_a) {
            var19 = 0;
            kj.field_d = 0;
            di.field_K = 1;
            var9Lifetime4 = ca.field_k + 1;
            rj.field_f = 7;
            var10Lifetime2 = hf.field_t;
          }
          if ((var11Lifetime2 != 0 ||
            5 == this.field_U) &&
            (var19 != 0 &&
            mh.field_e[-1 + ca.field_k][hf.field_t - 1].field_a)) {
            var9Lifetime4 = ca.field_k - 1;
            kj.field_d = 0;
            di.field_K = -1;
            var10Lifetime2 = -1 + hf.field_t;
            rj.field_f = 7;
          }
          if ((var17 != 0 ||
            4 == this.field_U) &&
            (var19 != 0 &&
            mh.field_e[ca.field_k - 1][hf.field_t].field_a)) {
            di.field_K = -1;
            var9Lifetime4 = ca.field_k - 1;
            var10Lifetime2 = hf.field_t;
            rj.field_f = 7;
            kj.field_d = 0;
          }
          if ((var14Lifetime1 != 0 ||
            this.field_U == 3) &&
            (var19 != 0 &&
            mh.field_e[ca.field_k - 1][hf.field_t + 1].field_a)) {
            var9Lifetime4 = ca.field_k - 1;
            kj.field_d = 0;
            rj.field_f = 7;
            di.field_K = -1;
            var10Lifetime2 = hf.field_t + 1;
          }
          if ((var13Lifetime1 != 0 ||
            this.field_U == 5) &&
            (var19 != 0 &&
            mh.field_e[1 + ca.field_k][hf.field_t - 1].field_a)) {
            rj.field_f = 7;
            di.field_K = 1;
            var10Lifetime2 = hf.field_t - 1;
            kj.field_d = 0;
            var9Lifetime4 = 1 + ca.field_k;
          }
          if ((var18 != 0 ||
            this.field_U == 1) &&
            (var19 != 0 &&
            mh.field_e[ca.field_k + 1][hf.field_t].field_a)) {
            di.field_K = 1;
            kj.field_d = 0;
            var9Lifetime4 = 1 + ca.field_k;
            var10Lifetime2 = hf.field_t;
            rj.field_f = 7;
          }
          if (var16 != 0 &&
            var19 != 0 &&
            mh.field_e[1 + ca.field_k][hf.field_t + 1].field_a) {
            var9Lifetime4 = ca.field_k + 1;
            var10Lifetime2 = hf.field_t + 1;
            di.field_K = 1;
            kj.field_d = 0;
            rj.field_f = 7;
          }
          if ((var12Lifetime1 != 0 ||
            5 == this.field_U) &&
            (var19 != 0 &&
            mh.field_e[ca.field_k][hf.field_t - 1].field_a)) {
            var10Lifetime2 = hf.field_t - 1;
            var9Lifetime4 = ca.field_k;
            di.field_K = 1;
            rj.field_f = 7;
            kj.field_d = 0;
          }
          if ((var15 != 0 ||
            this.field_U == 2) &&
            (var19 != 0 &&
            mh.field_e[ca.field_k][hf.field_t + 1].field_a)) {
            var10Lifetime2 = 1 + hf.field_t;
            rj.field_f = 7;
            kj.field_d = 0;
            var9Lifetime4 = ca.field_k;
          }
          if (qe.field_b[5]) {
            stackIn_2934_0 = (4 < rj.field_f) ? 0 : 1;
            var20 = stackIn_2934_0;
            if (var17 != 0 &&
              var20 != 0 &&
              mh.field_e[-1 + ca.field_k][hf.field_t].field_a) {
              ne.a(22, 30);
              var9Lifetime4 = -1 + ca.field_k;
              var10Lifetime2 = hf.field_t;
              kj.field_d = 0;
              rj.field_f = 8;
              di.field_K = -1;
            }
            if (var18 != 0 &&
              var20 != 0 &&
              mh.field_e[1 + ca.field_k][hf.field_t].field_a) {
              ne.a(22, 33);
              kj.field_d = 0;
              rj.field_f = 8;
              var9Lifetime4 = 1 + ca.field_k;
              var10Lifetime2 = hf.field_t;
              di.field_K = 1;
            }
          }
          if (var9Lifetime4 >= 1 &&
            var10Lifetime2 > 1 &&
            var9Lifetime4 < 31 &&
            je.field_t > var10Lifetime2) {
            this.field_db = var9Lifetime4;
            this.field_N = var10Lifetime2;
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2 = decompiledCaughtException;
          throw lj.a((Throwable) ((Object) var2), "MinerDisturbance.PA(" + param0 + ')');
        }
    }

    private final void k(byte param0) {
        int var4 = 0;
        RuntimeException decompiledCaughtException = null;
        uj[] var2 = null;
        RuntimeException var2_ref = null;
        int var3 = 0;
        var4 = field_ab;
        try {
          if (wj.field_j >= 2) {
            lf.a(-673, ce.field_d);
            ug.field_a = new bf();
            var2 = ug.field_a.e(-27555);
            var3 = 0;
            while (var2.length > var3) {
              bh.a(var2[var3], (byte) -115);
              var3++;
              if (var4 != 0) {
                return;
              }
            }
          }
          if (param0 < 64) {
            this.field_N = 54;
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2_ref = decompiledCaughtException;
          throw lj.a((Throwable) ((Object) var2_ref), "MinerDisturbance.LA(" + param0 + ')');
        }
    }

    private final void a(byte param0, int param1) {
        try {
          ph.field_d = 38054639 ^ param1;
          if (param0 > -11) {
            this.field_W = 127;
          }
        } catch (RuntimeException runtimeException) {
          throw lj.a((Throwable) ((Object) runtimeException), "MinerDisturbance.IA(" + param0 + ',' + param1 + ')');
        }
    }

    private final void x(int param0) {
        ea[] array$2 = null;
        ea[] array$3 = null;
        int var2_int = 0;
        double var2_double = 0.0;
        double var4 = 0.0;
        double var6 = 0.0;
        int var8_int = 0;
        ln[] var8 = null;
        int[] var9 = null;
        int var9_int = 0;
        ln[] var9_array = null;
        int var10_int = 0;
        ln[] var10 = null;
        int[] var11 = null;
        int var12 = 0;
        int var13 = 0;
        int stackIn_21_0 = 0;
        int stackIn_21_1 = 0;
        int stackIn_36_0 = 0;
        int stackIn_38_0 = 0;
        int stackIn_38_1 = 0;
        int stackIn_53_0 = 0;
        ln[] stackIn_81_0 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var2 = null;
        int stackIn_21_0Lifetime1;
        int stackIn_21_1Lifetime1;
        int stackIn_21_0Lifetime1Lifetime1;
        int stackIn_21_1Lifetime1Lifetime1;
        var13 = field_ab;
        try {
          if (pj.field_a <= 0) {
            ib.field_c = tb.a("screenshots", "membersexpansion", fl.field_f, 1);
          }
          ce.field_d = rd.a("", -90, ne.field_L, fl.field_f, "b12");
          pk.field_b = rd.a("", -116, ne.field_L, fl.field_f, "big_font");
          mm.field_a = rd.a("", -79, ne.field_L, fl.field_f, "small_font");
          sb.field_n = tl.a("grave_font", fl.field_f, 2, "", ne.field_L);
          wd.field_e = sb.field_n.f(16777215);
          if (param0 > -29) {
            this.field_M = 19;
          }
          bi.field_p = sb.field_n.f(65280);
          re.field_b = sb.field_n.f(16711680);
          nj.field_c = td.a("achievements", fl.field_f, "", (byte) 110);
          te.field_d = td.a("dinamite", fl.field_f, "", (byte) 127);
          wj.field_k = td.a("smoke", fl.field_f, "", (byte) 126);
          ne.field_O = td.a("charge", fl.field_f, "", (byte) 111);
          wj.field_l = jn.a("minersplat", -29553, "", fl.field_f);
          hj.field_h = jn.a("rope", -29553, "", fl.field_f);
          m.field_m = jn.a("title1", -29553, "", fl.field_f);
          l.field_c = jn.a("title_dwarf", -29553, "", fl.field_f);
          ak.field_c = bb.a("iphone_ad", fl.field_f, -127, "");
          gi.field_a = bb.a("iphone_ad_mouseover", fl.field_f, -120, "");
          jn.a("locked_option", -29553, "", fl.field_f);
          jn.a("locked_option_end", -29553, "", fl.field_f);
          pk.field_d = jn.a("gold", -29553, "shop", fl.field_f);
          gb.field_a = jn.a("sold", -29553, "shop", fl.field_f);
          kd.field_r = jn.a("green_frame", -29553, "shop", fl.field_f);
          ib.field_a = jn.a("controls", -29553, "", fl.field_f);
          vc.field_p = new ea[9];
          var2_int = 0;
          while (var2_int < 9) {
            vc.field_p[var2_int] = jn.a("fs_button" + var2_int, -29553, "", fl.field_f);
            var2_int++;
            if (var13 == 0) {
              continue;
            }
            break;
          }
          var2_double = 6.283185307179586;
          var4 = 2.356194490192345;
          var6 = 0.7853981633974483;
          ef.field_b = new ea[8];
          ef.field_b[3] = jn.a("arrow", -29553, "", fl.field_f);
          var8_int = 0;
          L5: while (true) {
            boolean decompiledFrameRemainder0 = true;
            if (var8_int < 8) {
              stackIn_21_0 = var8_int;
              stackIn_21_1 = 3;
              if (var13 != 0) {
                if (stackIn_21_0 > stackIn_21_1) {
                  pk.field_h[var8_int] = a.field_a[var8_int].c();
                  ml.a((byte) 93, 16777215, pk.field_h[var8_int], a.field_a[var8_int]);
                  var9 = pk.field_h[var8_int].field_D;
                  stackIn_36_0 = -1 + var9.length;
                  break L5;
                }
                decompiledFrameRemainder0 = false;
              }
              else {
                if (stackIn_21_0 == stackIn_21_1) {
                  var4 = var4 - var6;
                } else {
                  ef.field_b[var8_int] = new ea(32, 32);
                  ef.field_b[var8_int].g();
                  ef.field_b[3].b(-106, 16, 4096, (int)(0.5 + 65535.0 * var4 / var2_double), 16);
                  ef.field_b[var8_int].f(1);
                  var4 = var4 - var6;
                }
                var8_int++;
                continue;
              }
            }
            if (decompiledFrameRemainder0) {
              ef.field_b[3].f(1);
              bj.field_e.a((byte) -45);
              ha.field_c = jn.a("unachieved", -29553, "basic", ob.field_q);
              cb.field_e = jn.a("orbcoin", -29553, "basic", ob.field_q);
              a.field_a = td.a("miner2", fl.field_f, "", (byte) 118);
              ag.field_a = td.a("miner_stash", fl.field_f, "", (byte) 121);
              pk.field_h = new ea[a.field_a.length];
              var8_int = 0;
              while (true) {
                stackIn_21_0Lifetime1 = ~var8_int;
                stackIn_21_1Lifetime1 = ~pk.field_h.length;
                if (stackIn_21_0Lifetime1 <= stackIn_21_1Lifetime1) {
                  break;
                }
                pk.field_h[var8_int] = a.field_a[var8_int].c();
                ml.a((byte) 93, 16777215, pk.field_h[var8_int], a.field_a[var8_int]);
                var9 = pk.field_h[var8_int].field_D;
                stackIn_36_0 = -1 + var9.length;
                if (var13 != 0) {
                  break L5;
                }
                var10_int = stackIn_36_0;
                while (0 <= var10_int) {
                  stackIn_21_0Lifetime1Lifetime1 = 0;
                  stackIn_21_1Lifetime1Lifetime1 = var9[var10_int];
                  if (stackIn_21_0Lifetime1Lifetime1 < stackIn_21_1Lifetime1Lifetime1 &&
                    var9[var10_int] != 16777215) {
                    var9[var10_int] = 0;
                  }
                  var10_int--;
                }
                var8_int++;
              }
            }
            eg.field_m = new ea[ag.field_a.length];
            stackIn_36_0 = 0;
            break;
          }
          var8_int = stackIn_36_0;
          while (true) {
            stackIn_38_0 = var8_int;
            stackIn_38_1 = eg.field_m.length;
            if (stackIn_38_0 < stackIn_38_1) {
              eg.field_m[var8_int] = ag.field_a[var8_int].c();
              ml.a((byte) 93, 16777215, eg.field_m[var8_int], ag.field_a[var8_int]);
              var9 = eg.field_m[var8_int].field_D;
              stackIn_53_0 = var9.length - 1;
              if (var13 == 0) {
                var10_int = stackIn_53_0;
                while (var10_int >= 0) {
                  stackIn_38_0 = 0;
                  stackIn_38_1 = var9[var10_int];
                  if (stackIn_38_0 < stackIn_38_1 &&
                    16777215 != var9[var10_int]) {
                    var9[var10_int] = 0;
                  }
                  var10_int--;
                }
                var8_int++;
                continue;
              }
            } else {
              pj.field_e = md.a("shadow", fl.field_f, 10, "");
              tn.field_K = td.a("shop_illustrations", fl.field_f, "shop", (byte) 118);
              wc.field_c[0] = td.a("powerups_volc", fl.field_f, "shop", (byte) 109);
              array$2 = new ea[wc.field_c[0].length];
              te.field_e[0] = array$2;
              stackIn_53_0 = 0;
            }
            var8_int = stackIn_53_0;
            do {
              if (!(var8_int < te.field_e[0].length)) {
                wc.field_c[1] = td.a("powerups_super", fl.field_f, "shop", (byte) 127);
                array$3 = new ea[wc.field_c[1].length];
                te.field_e[1] = array$3;
                break;
              }
              te.field_e[0][var8_int] = new ea(wc.field_c[0][var8_int].field_x, wc.field_c[0][var8_int].field_A);
              te.field_e[0][var8_int].g();
              wc.field_c[0][var8_int].h(0, 0);
              var8_int++;
            } while (var13 == 0);
            var8_int = 0;
            do {
              if (!(te.field_e[1].length > var8_int)) {
                bj.field_e.a((byte) -45);
                he.field_b = td.a("shopframe", fl.field_f, "shop", (byte) 125);
                vh.field_a = new ea[2];
                vh.field_a[0] = jn.a("shop_background", -29553, "shop", fl.field_f);
                vh.field_a[1] = jn.a("shop_background_ice", -29553, "shop", fl.field_f);
                qc.field_d = jn.a("shop_sign", -29553, "shop", fl.field_f);
                hd.field_d = new ea[9];
                hd.field_d[0] = jn.a("frame_topleft", -29553, "", fl.field_f);
                hd.field_d[1] = jn.a("frame_top", -29553, "", fl.field_f);
                hd.field_d[2] = jn.a("frame_topright", -29553, "", fl.field_f);
                hd.field_d[3] = jn.a("frame_left", -29553, "", fl.field_f);
                hd.field_d[4] = jn.a("frame_centre", -29553, "", fl.field_f);
                hd.field_d[5] = jn.a("frame_right", -29553, "", fl.field_f);
                hd.field_d[6] = jn.a("frame_bottomleft", -29553, "", fl.field_f);
                hd.field_d[7] = jn.a("frame_bottom", -29553, "", fl.field_f);
                hd.field_d[8] = jn.a("frame_bottomright", -29553, "", fl.field_f);
                ak.field_a = new ea[9];
                ak.field_a[0] = jn.a("bigframe_topleft", -29553, "", fl.field_f);
                ak.field_a[1] = jn.a("bigframe_top", -29553, "", fl.field_f);
                ak.field_a[2] = jn.a("bigframe_topright", -29553, "", fl.field_f);
                ak.field_a[3] = jn.a("bigframe_left", -29553, "", fl.field_f);
                ak.field_a[4] = jn.a("bigframe_centre", -29553, "", fl.field_f);
                ak.field_a[5] = jn.a("bigframe_right", -29553, "", fl.field_f);
                ak.field_a[6] = jn.a("bigframe_bottomleft", -29553, "", fl.field_f);
                ak.field_a[7] = jn.a("bigframe_bottom", -29553, "", fl.field_f);
                ak.field_a[8] = jn.a("bigframe_bottomright", -29553, "", fl.field_f);
                ah.field_c = new ea[9];
                ah.field_c[0] = jn.a("danger_topleft", -29553, "", fl.field_f);
                ah.field_c[1] = jn.a("danger_top", -29553, "", fl.field_f);
                ah.field_c[2] = jn.a("danger_topright", -29553, "", fl.field_f);
                ah.field_c[3] = jn.a("danger_left", -29553, "", fl.field_f);
                ah.field_c[4] = jn.a("danger_centre", -29553, "", fl.field_f);
                ah.field_c[5] = jn.a("danger_right", -29553, "", fl.field_f);
                ah.field_c[6] = jn.a("danger_bottomleft", -29553, "", fl.field_f);
                ah.field_c[7] = jn.a("danger_bottom", -29553, "", fl.field_f);
                ah.field_c[8] = jn.a("danger_bottomright", -29553, "", fl.field_f);
                bl.field_w = jn.a("highscore_arrow", -29553, "", fl.field_f);
                h.field_c = jn.a("highscore_arrow_highlight", -29553, "", fl.field_f);
                ff.field_f = jn.a("highscore_plaque", -29553, "", fl.field_f);
                s.field_L = new ea[3];
                s.field_L[0] = jn.a("scroll_top", -29553, "", fl.field_f);
                s.field_L[1] = jn.a("scroll_middle", -29553, "", fl.field_f);
                s.field_L[2] = jn.a("scroll_bottom", -29553, "", fl.field_f);
                ck.field_a = jn.a("seismograph_base", -29553, "", fl.field_f);
                ma.field_O = jn.a("seismograph_grid", -29553, "", fl.field_f);
                bj.field_e.a((byte) -45);
                ol.field_a = jn.a("seismograph_needle", -29553, "", fl.field_f);
                ol.field_c = jn.a("title_achievements", -29553, "", fl.field_f);
                on.field_x = jn.a("title_allscores", -29553, "", fl.field_f);
                sk.field_e = jn.a("title_bestscores", -29553, "", fl.field_f);
                ld.field_x = jn.a("title_myscores", -29553, "", fl.field_f);
                ha.field_a = jn.a("title_instructions", -29553, "", fl.field_f);
                jc.field_G = jn.a("title_choose", -29553, "", fl.field_f);
                pd.field_a = jn.a("bubble", -29553, "", fl.field_f);
                jn.a("highscorearrow", -29553, "", fl.field_f);
                qn.field_J = bb.a("worm_gums", fl.field_f, -123, "");
                ij.field_t = bb.a("worm_skin", fl.field_f, -102, "");
                te.field_c = md.a("worm_teeth", fl.field_f, 10, "");
                nb.field_a = new ea[te.field_c.length];
                break;
              }
              te.field_e[1][var8_int] = new ea(wc.field_c[1][var8_int].field_x, wc.field_c[1][var8_int].field_A);
              te.field_e[1][var8_int].g();
              wc.field_c[1][var8_int].h(0, 0);
              var8_int++;
            } while (var13 == 0);
            var8_int = 0;
            do {
              if (!(te.field_c.length > var8_int)) {
                fl.field_j = tb.a("instruction_pics", "", fl.field_f, 1);
                break;
              }
              nb.field_a[var8_int] = (ea) ((Object) ((og) (te.field_c[var8_int])).h());
              ((og) (nb.field_a[var8_int])).d(0, -40, -40, -40);
              var8_int++;
            } while (var13 == 0);
            var8 = new ln[3];
            var9_int = 0;
            boolean decompiledNaturalLoopExit0 = false;
            while (!(decompiledNaturalLoopExit0 = (var9_int >= var8.length))) {
              stackIn_81_0 = var8;
              if (var13 == 0) {
                stackIn_81_0[var9_int] = fl.field_j[-var8.length + fl.field_j.length + var9_int];
                var9_int++;
                continue;
              }
              break;
            }
            if (decompiledNaturalLoopExit0) {
              stackIn_81_0 = new ln[14];
            }
            var9_array = stackIn_81_0;
            var9_array[0] = pb.a("", fl.field_f, "keys_esc", (byte) -77);
            var9_array[1] = pb.a("", fl.field_f, "keys_right", (byte) -77);
            var9_array[2] = pb.a("", fl.field_f, "keys_left", (byte) -77);
            var9_array[3] = pb.a("", fl.field_f, "keys_down", (byte) -77);
            var9_array[4] = pb.a("", fl.field_f, "keys_up", (byte) -77);
            var9_array[5] = pb.a("", fl.field_f, "keys_space", (byte) -77);
            var9_array[6] = pb.a("", fl.field_f, "keys_ctrl", (byte) -77);
            var9_array[7] = pb.a("", fl.field_f, "keys_enter", (byte) -77);
            var9_array[8] = pb.a("", fl.field_f, "keys_shift", (byte) -77);
            var9_array[9] = pb.a("", fl.field_f, "keys_w", (byte) -77);
            var9_array[10] = pb.a("", fl.field_f, "keys_d", (byte) -77);
            var9_array[11] = pb.a("", fl.field_f, "keys_c", (byte) -77);
            var9_array[12] = pb.a("", fl.field_f, "keys_s", (byte) -77);
            var9_array[13] = pb.a("", fl.field_f, "keys_alt", (byte) -77);
            var10 = new ln[var8.length + fl.field_j.length + var9_array.length];
            ai.a(fl.field_j, 0, var10, 0, fl.field_j.length);
            ai.a(var9_array, 0, var10, fl.field_j.length - var8.length, var9_array.length);
            ai.a(var8, 0, var10, -var8.length + fl.field_j.length + var9_array.length, var8.length);
            var11 = new int[var10.length];
            var12 = fl.field_j.length - var8.length;
            while (var12 < var10.length) {
              var11[var12] = 12;
              var12++;
              if (var13 != 0) {
                return;
              }
            }
            ce.field_d.a(var10, var11);
            wd.field_f = true;
            return;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2 = decompiledCaughtException;
          throw lj.a((Throwable) ((Object) var2), "MinerDisturbance.GA(" + param0 + ')');
        }
    }

    final void a(boolean param0) {
        RuntimeException decompiledCaughtException = null;
        RuntimeException var2 = null;
        try {
          if (param0) {
            this.a(-88);
          }
          if (null != kf.field_d) {
            ci.a(kf.field_d, 0);
            kf.field_d.a(param0, qa.field_a);
            kf.field_d = null;
          }
          tl.b((byte) 101);
          tn.c((byte) -44);
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2 = decompiledCaughtException;
          throw lj.a((Throwable) ((Object) var2), "MinerDisturbance.DA(" + param0 + ')');
        }
    }

    private final void a(int param0, boolean param1, int param2, int param3) {
        int stackIn_53_0 = 0;
        boolean stackIn_54_1 = false;
        int stackIn_72_0 = 0;
        boolean stackIn_73_1 = false;
        boolean stackIn_80_0 = false;
        boolean stackIn_96_0 = false;
        boolean stackIn_106_0 = false;
        int stackIn_123_0 = 0;
        boolean stackIn_124_1 = false;
        int stackIn_136_0 = 0;
        boolean stackIn_137_1 = false;
        int stackIn_217_0 = 0;
        boolean stackIn_218_1 = false;
        int stackIn_230_0 = 0;
        boolean stackIn_231_1 = false;
        boolean stackIn_247_0 = false;
        RuntimeException decompiledCaughtException = null;
        ln[] var5 = null;
        RuntimeException var5_ref = null;
        int var6 = 0;
        int var7 = 0;
        int var8 = 0;
        ea[] var9 = null;
        double var10_double = 0.0;
        int var10 = 0;
        int var12 = 0;
        ea[] var9Lifetime1;
        int var6Lifetime1;
        int var7Lifetime1;
        int var8Lifetime1;
        double var10_doubleLifetime1;
        int var7Lifetime2;
        int var7Lifetime3;
        int var7Lifetime4;
        int var7Lifetime5;
        int var8Lifetime2;
        int var8Lifetime3;
        int var8Lifetime4;
        int var8Lifetime5;
        int var7Lifetime1Lifetime1;
        int var7Lifetime1Lifetime2;
        int var7Lifetime1Lifetime3;
        int var7Lifetime1Lifetime4;
        int var8Lifetime1Lifetime1;
        int var8Lifetime1Lifetime2;
        int var8Lifetime1Lifetime3;
        int var8Lifetime1Lifetime4;
        var12 = field_ab;
        try {
          if (!param1) {
            return;
          }
          var5 = sa.field_t[cm.field_o];
          if (cm.field_o == 0) {
            var6 = param2 + 104;
            if (0 != pl.field_h) {
              var6 += 50;
            }
            boolean decompiledFrameRemainder0 = true;
            if (a.field_c != 0) {
              if (a.field_c < 1000) {
                ce.field_d.b(v.field_a, param2, param3, param0, -1);
                var5[1].b(var6, 0);
                decompiledFrameRemainder0 = (var12 != 0);
              }
              if (decompiledFrameRemainder0) {
                if (5000 > a.field_c) {
                  ce.field_d.b(se.field_J, param2, param3, param0, -1);
                  var5[2].b(var6, 0);
                  decompiledFrameRemainder0 = (var12 != 0);
                }
                if (decompiledFrameRemainder0) {
                  if (25000 > a.field_c) {
                    ce.field_d.b(wk.field_b, param2, param3, param0, -1);
                    var5[3].b(var6, 0);
                    decompiledFrameRemainder0 = (var12 != 0);
                  }
                  if (decompiledFrameRemainder0) {
                    if (a.field_c < 50000) {
                      ce.field_d.b(dl.field_b, param2, param3, param0, -1);
                      var5[4].b(var6, 0);
                      decompiledFrameRemainder0 = (var12 != 0);
                    }
                    if (decompiledFrameRemainder0) {
                      if (a.field_c >= 100000) {
                        if (a.field_c < 200000) {
                          ce.field_d.b(bn.field_a, param2, param3, param0, -1);
                          var5[6].b(var6, 0);
                          if (ne.a(false) != 6 &&
                            3 != ne.a(false) &&
                            2 != ne.a(false)) {
                            stackIn_53_0 = -2;
                            stackIn_54_1 = !(param1);
                            decompiledFrameRemainder0 = (stackIn_53_0 == ~ne.a(stackIn_54_1));
                          }
                          if (decompiledFrameRemainder0) {
                            fn.a(0, 255, 3);
                            decompiledFrameRemainder0 = (var12 != 0);
                          }
                        }
                        if (decompiledFrameRemainder0) {
                          if (a.field_c < 500000) {
                            ce.field_d.b(qm.field_n, param2, param3, param0, -1);
                            var5[7].b(var6, 0);
                            if (ne.a(false) != 6 &&
                              ne.a(false) != 3) {
                              stackIn_72_0 = -3;
                              stackIn_73_1 = !(param1);
                              if (stackIn_72_0 != ~ne.a(stackIn_73_1)) {
                                stackIn_80_0 = !param1;
                                decompiledFrameRemainder0 = (ne.a(stackIn_80_0) == 1);
                              }
                            }
                            if (decompiledFrameRemainder0) {
                              fn.a(0, 255, 3);
                              fn.a(1, 254, 3);
                              decompiledFrameRemainder0 = (var12 != 0);
                            }
                          }
                          if (decompiledFrameRemainder0) {
                            if (a.field_c < 1000000) {
                              ce.field_d.b(fn.field_r, param2, param3, param0, -1);
                              var5[8].b(var6, 0);
                              if (ne.a(false) != 6) {
                                stackIn_96_0 = !param1;
                                if (ne.a(stackIn_96_0) != 3 &&
                                  ne.a(false) != 2) {
                                  stackIn_106_0 = !param1;
                                  decompiledFrameRemainder0 = (ne.a(stackIn_106_0) == 1);
                                }
                              }
                              if (decompiledFrameRemainder0) {
                                fn.a(0, 255, 3);
                                fn.a(1, 254, 3);
                                fn.a(2, 253, 3);
                                decompiledFrameRemainder0 = (var12 != 0);
                              }
                            }
                            if (decompiledFrameRemainder0) {
                              var5[9].b(var6, 0);
                              var9 = mb.field_d;
                              var10_double = 0.0;
                              L22: while (true) {
                                if (var10_double < 6.28) {
                                  var7 = (int)((double)(160 + var6) + 128.0 * Math.sin((double)pa.field_d * 0.05 + var10_double));
                                  var8 = (int)(240.0 + 128.0 * Math.cos(var10_double + (double)pa.field_d * 0.05));
                                  var9[4].a(128, 0, var8, var7, -1271909436);
                                  var7Lifetime2 = (int)((double)(var6 + 160) + 144.0 * Math.sin(var10_double - (double)pa.field_d * 0.04));
                                  var8Lifetime2 = (int)(144.0 * Math.cos(-((double)pa.field_d * 0.04) + var10_double) + 240.0);
                                  var9[3].a(128, 0, var8Lifetime2, var7Lifetime2, -1271909436);
                                  var7Lifetime3 = (int)((double)(160 + var6) + 160.0 * Math.sin((double)pa.field_d * 0.03 + var10_double));
                                  var8Lifetime3 = (int)(Math.cos(var10_double + 0.03 * (double)pa.field_d) * 160.0 + 240.0);
                                  var9[2].a(128, 0, var8Lifetime3, var7Lifetime3, -1271909436);
                                  var7Lifetime4 = (int)(Math.sin(-(0.02 * (double)pa.field_d) + var10_double) * 176.0 + (double)(160 + var6));
                                  var8Lifetime4 = (int)(240.0 + 176.0 * Math.cos(var10_double - 0.02 * (double)pa.field_d));
                                  var9[1].a(128, 0, var8Lifetime4, var7Lifetime4, -1271909436);
                                  var7Lifetime5 = (int)((double)(160 + var6) + 192.0 * Math.sin(0.01 * (double)pa.field_d + var10_double));
                                  var8Lifetime5 = (int)(192.0 * Math.cos(0.01 * (double)pa.field_d + var10_double) + 240.0);
                                  var9[0].a(128, 0, var8Lifetime5, var7Lifetime5, -1271909436);
                                  var10_double = var10_double + 0.314;
                                  if (var12 == 0) {
                                    continue;
                                  }
                                } else {
                                  if (pl.field_h == 0) {
                                    var10 = 140;
                                    param3 -= 15;
                                    break L22;
                                  }
                                  param3 -= 27;
                                }
                                var10 = 300;
                                break;
                              }
                              ce.field_d.a(qh.field_b, -1 - var10 / 2 + param2, param3, var10, 35, 6776679, -1, 1, 0, 16);
                              ce.field_d.a(qh.field_b, 1 - var10 / 2 + param2, param3, var10, 35, 6776679, -1, 1, 0, 16);
                              ce.field_d.a(qh.field_b, param2 - var10 / 2, param3 - 1, var10, 35, 6776679, -1, 1, 0, 16);
                              ce.field_d.a(qh.field_b, param2 - var10 / 2, param3 + 1, var10, 35, 6776679, -1, 1, 0, 16);
                              ce.field_d.a(qh.field_b, -(var10 / 2) + param2, param3, var10, 35, 16159517, 1, 1, 0, 16);
                              stackIn_123_0 = -7;
                              stackIn_124_1 = !(param1);
                              boolean decompiledSharedTail1 = (stackIn_123_0 == ~ne.a(stackIn_124_1) ||
                                ne.a(false) == 3 ||
                                ne.a(false) == 2);
                              if (!decompiledSharedTail1) {
                                stackIn_136_0 = -2;
                                stackIn_137_1 = !(param1);
                                decompiledSharedTail1 = (stackIn_136_0 == ~ne.a(stackIn_137_1));
                              }
                              if (decompiledSharedTail1) {
                                fn.a(0, 255, 3);
                                fn.a(1, 254, 3);
                                fn.a(2, 253, 3);
                                fn.a(3, 252, 3);
                              }
                              if (var12 != 0) {
                                ce.field_d.b(ck.field_b, param2, param3, param0, -1);
                                var5[5].b(var6, 0);
                                ce.field_d.b(gn.field_b, param2, param3, param0, -1);
                                var5[0].b(var6, 0);
                              }
                            }
                          }
                        }
                      } else {
                        ce.field_d.b(ck.field_b, param2, param3, param0, -1);
                        var5[5].b(var6, 0);
                        if (var12 != 0) {
                          ce.field_d.b(gn.field_b, param2, param3, param0, -1);
                          var5[0].b(var6, 0);
                        }
                      }
                    }
                  }
                }
              }
            } else {
              ce.field_d.b(gn.field_b, param2, param3, param0, -1);
              var5[0].b(var6, 0);
            }
            if (var12 == 0) {
              return;
            }
          }
          if (cm.field_o == 1) {
            var6Lifetime1 = 104 + param2;
            if (0 != pl.field_h) {
              var6Lifetime1 += 50;
            }
            if (a.field_c == 0) {
              ce.field_d.b(wi.field_z, param2, param3, param0, -1);
              var5[0].b(var6Lifetime1, 0);
              if (var12 == 0) {
                return;
              }
            }
            if (a.field_c < 5000) {
              ce.field_d.b(fm.field_O, param2, param3, param0, -1);
              var5[1].b(var6Lifetime1, 0);
              if (var12 == 0) {
                return;
              }
            }
            if (a.field_c < 25000) {
              ce.field_d.b(te.field_b, param2, param3, param0, -1);
              var5[2].b(var6Lifetime1, 0);
              if (var12 == 0) {
                return;
              }
            }
            if (a.field_c >= 50000) {
              if (100000 <= a.field_c) {
                if (a.field_c < 200000) {
                  ce.field_d.b(hm.field_N, param2, param3, param0, -1);
                  var5[5].b(var6Lifetime1, 0);
                  if (var12 == 0) {
                    return;
                  }
                }
                if (a.field_c >= 500000) {
                  if (a.field_c < 1000000) {
                    ce.field_d.b(le.field_c, param2, param3, param0, -1);
                    var5[7].b(var6Lifetime1, 0);
                    if (ne.a(false) != 6 &&
                      ne.a(false) != 3 &&
                      ne.a(false) != 2 &&
                      ne.a(false) != 1) {
                      return;
                    }
                    fn.a(14, 241, 3);
                    fn.a(15, 240, 3);
                    if (var12 == 0) {
                      return;
                    }
                  }
                  if (a.field_c >= 2000000) {
                    var5[9].b(var6Lifetime1, 0);
                    var9Lifetime1 = mb.field_d;
                    var10_doubleLifetime1 = 0.0;
                    L41: while (true) {
                      if (6.28 > var10_doubleLifetime1) {
                        var7Lifetime1 = (int)((double)(160 + var6Lifetime1) + Math.sin(var10_doubleLifetime1 + 0.05 * (double)pa.field_d) * 128.0);
                        var8Lifetime1 = (int)(240.0 + Math.cos(var10_doubleLifetime1 + 0.05 * (double)pa.field_d) * 128.0);
                        var9Lifetime1[4].a(128, 0, var8Lifetime1, var7Lifetime1, -1271909436);
                        var7Lifetime1Lifetime1 = (int)(Math.sin(-((double)pa.field_d * 0.04) + var10_doubleLifetime1) * 144.0 + (double)(160 + var6Lifetime1));
                        var8Lifetime1Lifetime1 = (int)(240.0 + Math.cos(var10_doubleLifetime1 - 0.04 * (double)pa.field_d) * 144.0);
                        var9Lifetime1[3].a(128, 0, var8Lifetime1Lifetime1, var7Lifetime1Lifetime1, -1271909436);
                        var7Lifetime1Lifetime2 = (int)((double)(var6Lifetime1 + 160) + 160.0 * Math.sin(var10_doubleLifetime1 + (double)pa.field_d * 0.03));
                        var8Lifetime1Lifetime2 = (int)(160.0 * Math.cos(0.03 * (double)pa.field_d + var10_doubleLifetime1) + 240.0);
                        var9Lifetime1[2].a(128, 0, var8Lifetime1Lifetime2, var7Lifetime1Lifetime2, -1271909436);
                        var7Lifetime1Lifetime3 = (int)(176.0 * Math.sin(-((double)pa.field_d * 0.02) + var10_doubleLifetime1) + (double)(var6Lifetime1 + 160));
                        var8Lifetime1Lifetime3 = (int)(Math.cos(var10_doubleLifetime1 - (double)pa.field_d * 0.02) * 176.0 + 240.0);
                        var9Lifetime1[1].a(128, 0, var8Lifetime1Lifetime3, var7Lifetime1Lifetime3, -1271909436);
                        var7Lifetime1Lifetime4 = (int)(Math.sin(var10_doubleLifetime1 + (double)pa.field_d * 0.01) * 192.0 + (double)(var6Lifetime1 + 160));
                        var8Lifetime1Lifetime4 = (int)(192.0 * Math.cos(var10_doubleLifetime1 + (double)pa.field_d * 0.01) + 240.0);
                        var9Lifetime1[0].a(128, 0, var8Lifetime1Lifetime4, var7Lifetime1Lifetime4, -1271909436);
                        var10_doubleLifetime1 = var10_doubleLifetime1 + 0.314;
                        if (var12 == 0) {
                          continue;
                        }
                      } else {
                        if (pl.field_h == 0) {
                          var10 = 140;
                          param3 -= 15;
                          break L41;
                        }
                      }
                      var10 = 300;
                      param3 -= 27;
                      break;
                    }
                    ce.field_d.a(ug.field_b, param2 + (-(var10 / 2) - 1), param3, var10, 35, 6776679, -1, 1, 0, 16);
                    ce.field_d.a(ug.field_b, param2 + (-(var10 / 2) + 1), param3, var10, 35, 6776679, -1, 1, 0, 16);
                    ce.field_d.a(ug.field_b, -(var10 / 2) + param2, param3 - 1, var10, 35, 6776679, -1, 1, 0, 16);
                    ce.field_d.a(ug.field_b, param2 - var10 / 2, 1 + param3, var10, 35, 6776679, -1, 1, 0, 16);
                    ce.field_d.a(ug.field_b, param2 - var10 / 2, param3, var10, 35, 16159517, 1, 1, 0, 16);
                    stackIn_217_0 = -7;
                    stackIn_218_1 = !(param1);
                    boolean decompiledSharedTail0 = (stackIn_217_0 == ~ne.a(stackIn_218_1) ||
                      3 == ne.a(false) ||
                      2 == ne.a(false));
                    if (!decompiledSharedTail0) {
                      stackIn_230_0 = -2;
                      stackIn_231_1 = !(param1);
                      decompiledSharedTail0 = (stackIn_230_0 == ~ne.a(stackIn_231_1));
                    }
                    if (decompiledSharedTail0) {
                      fn.a(14, 241, 3);
                      fn.a(15, 240, 3);
                      fn.a(16, 239, 3);
                      fn.a(17, 238, 3);
                      if (a.field_c >= 4000000) {
                        fn.a(25, 230, 3);
                      }
                    }
                    if (var12 == 0) {
                      return;
                    }
                  }
                  ce.field_d.b(bd.field_a, param2, param3, param0, -1);
                  var5[8].b(var6Lifetime1, 0);
                  if (ne.a(false) != 6) {
                    stackIn_247_0 = !param1;
                    if (ne.a(stackIn_247_0) != 3 &&
                      ne.a(false) != 2 &&
                      ne.a(false) != 1) {
                      return;
                    }
                  }
                  fn.a(14, 241, 3);
                  fn.a(15, 240, 3);
                  fn.a(16, 239, 3);
                  if (var12 == 0) {
                    return;
                  }
                }
                ce.field_d.b(ti.field_L, param2, param3, param0, -1);
                var5[6].b(var6Lifetime1, 0);
                if (ne.a(false) != 6 &&
                  ne.a(false) != 3 &&
                  ne.a(false) != 2 &&
                  ne.a(false) != 1) {
                  return;
                }
                fn.a(14, 241, 3);
                if (var12 == 0) {
                  return;
                }
              }
              ce.field_d.b(bh.field_ab, param2, param3, param0, -1);
              var5[4].b(var6Lifetime1, 0);
              if (var12 == 0) {
                return;
              }
            }
            ce.field_d.b(ca.field_j, param2, param3, param0, -1);
            var5[3].b(var6Lifetime1, 0);
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var5_ref = decompiledCaughtException;
          throw lj.a((Throwable) ((Object) var5_ref), "MinerDisturbance.FA(" + param0 + ',' + param1 + ',' + param2 + ',' + param3 + ')');
        }
    }

    final void b(int param0) {
        try {
          gi.a(0);
          df.a((byte) 125);
          im.a(param0 ^ 6777);
          m.f(-1);
          kh.a(true);
          eh.c();
          kk.a((byte) 75);
          bj.c((byte) -125);
          we.a();
          di.a((byte) 98);
          eb.b((byte) 127);
          ab.b(-14839);
          ii.a((byte) 105);
          qa.a((byte) -61);
          nd.a(111);
          kd.c(94);
          en.a(10);
          ob.o(124);
          tj.a(false);
          ge.a(111);
          el.a(2);
          gn.a(param0 + 28807);
          of.a(-60);
          lg.a((byte) 76);
          ja.f(param0 ^ 151);
          bf.a(param0 ^ 49);
          wd.a(param0 - 98);
          sb.l(109);
          db.a((byte) 84);
          lf.a(false);
          oe.b((byte) 124);
          de.a((byte) 34);
          fi.a((byte) 125);
          sf.a(param0 + 8191);
          rd.a((byte) 69);
          fa.a(26686);
          dg.b((byte) 83);
          kf.a(42959);
          md.a(98);
          id.b(8192);
          pa.a(param0 ^ 2);
          fb.a(true);
          ek.a((byte) 19);
          ci.b(0);
          dm.a(20583);
          l.a((byte) 79);
          pl.e(-26537);
          mc.a((byte) -43);
          gf.a(param0 ^ -114);
          je.c();
          ie.b(5);
          pi.d(2);
          ta.d((byte) -113);
          dh.a(-123);
          in.a(param0 ^ 14913);
          kb.a((byte) 60);
          rb.a(-2004317953);
          ak.a(false);
          q.a(20);
          cg.a(param0 ^ 1);
          nl.b();
          gd.a((byte) -114);
          ri.b((byte) -25);
          fj.d();
          vd.e(98);
          qk.a(-1003);
          ch.c(-104);
          nm.a(false);
          bk.b((byte) -113);
          me.b((byte) -83);
          ll.b((byte) -121);
          ha.a((byte) 28);
          d.a((byte) 109);
          h.b(true);
          nn.a(true);
          ig.b(119);
          hm.c((byte) 112);
          uk.j((byte) -42);
          jl.h((byte) 126);
          rg.r(param0 ^ 28777);
          ik.p(120);
          qd.a(true);
          cl.o(20);
          lm.f((byte) -106);
          pf.a(-1);
          vi.a(-1);
          dl.a((byte) -118);
          g.b(16704);
          pd.a((byte) 117);
          vb.a(-7672);
          kl.a(true);
          dk.b(param0 + 96);
          sc.a(5565);
          ec.a(-65);
          hn.a(param0 - 1);
          ld.d(false);
          c.b((byte) -73);
          wm.a(param0 - 8);
          ql.b(0);
          pk.a(-94);
          al.a(-483);
          hd.a((byte) 123);
          u.c(33);
          ml.a((byte) 119);
          kj.b(false);
          he.a((byte) -124);
          cm.a(param0 + 17);
          fh.a(param0 ^ -12662);
          ff.a(-12);
          tf.a(24044);
          hi.a(true);
          uf.f(param0 ^ 201);
          wa.e(112);
          ee.h(256);
          uh.a((byte) -116);
          vl.i(param0 + 125);
          ij.a(true);
          an.a(param0);
          si.b((byte) -128);
          kc.a(param0 ^ 16575);
          em.b((byte) -86);
          mf.c((byte) 81);
          dc.a((byte) -22);
          nj.a(-109);
          ni.a((byte) -112);
          va.a();
          cn.a(param0 - 129);
          qf.a(param0 - 28582);
          vc.e(param0 + 105);
          ng.a(-1);
          j.a(90);
          rf.a((byte) -56);
          eg.c(-7709);
          ck.a((byte) -100);
          mk.a((byte) -91);
          on.d(-112);
          qg.a(0);
          fl.a(-1);
          hh.b(-125);
          fe.l(-95);
          jc.a(0);
          cc.e((byte) 15);
          nf.a(false);
          am.n(43);
          ke.s(-125);
          ui.q(param0 ^ -2);
          kn.d((byte) -15);
          jk.h((byte) -36);
          wf.g((byte) 87);
          oi.a((byte) 91);
          ei.o(-2638);
          tn.a(param0 - 3);
          qn.a((byte) 84);
          w.m(256);
          ti.c((byte) -53);
          cb.d(false);
          ol.a(1);
          ba.a((byte) 54);
          gm.a(-20);
          dj.c();
          td.a(false);
          bh.i((byte) 102);
          b.b();
          ud.a(-105);
          pb.c(-98);
          ef.a((byte) 102);
          ce.b(14480);
          mb.a(30520);
          ah.a(true);
          qe.a((byte) 104);
          fd.g(param0 - 258);
          om.b(param0 - 1);
          gl.a(-2869);
          km.a(true);
          pg.a();
          wk.a(true);
          ra.a(-124);
          hb.a(-105);
          hk.d(127);
          bb.a(-4);
          ul.a((byte) 14);
          sn.b((byte) -18);
          a.a(0);
          jh.a((byte) 39);
          pm.a(92);
          ca.b(param0 ^ 11);
          vj.d(16711680);
          o.a(param0 - 23642);
          vk.a(119);
          tm.a((byte) -107);
          ve.a();
          qm.b(-31434);
          s.m(param0 - 117);
          ne.a(2);
          nh.a((byte) -76);
          la.a();
          lj.a((byte) -69);
          t.b(param0 - 1);
          bm.d(0);
          aa.a((byte) -123);
          ma.n(27934);
          se.n(-13673);
          ph.a(0);
          bg.a(15917);
          sd.a(-1);
          qc.b(2207);
          bl.b((byte) 79);
          oh.i(-116);
          ic.b(29);
          gb.a(-102);
          bc.a(35);
          sl.a(param0 ^ -3036);
          jf.a((byte) -63);
          ae.a((byte) -67);
          jn.e(111);
          af.a(param0 - 12708);
          hf.a(-16935);
          bd.a((byte) 126);
          ed.c(-20613);
          lc.a(param0 - 52);
          wb.a(param0 ^ 1);
          fg.a(-114);
          sa.a(42);
          re.a(-10887);
          mh.a(-115);
          tb.a(127);
          tk.a(8225);
          ug.b((byte) 45);
          i.b((byte) -57);
          le.a(-9392);
          rj.a(3);
          pn.a(param0 ^ 16777214);
          sk.b(true);
          hl.b(false);
          wc.b(0);
          ka.a(param0 + 2);
          ib.a(1);
          vh.b(3);
          pj.a(param0 ^ 3);
          te.b(31960);
          v.b((byte) -44);
          bn.a(160);
          mm.a(param0 ^ 0);
          aj.b(param0 + 113);
          ub.b(76);
          li.b((byte) -90);
          wi.a((byte) -9);
          nc.a(param0 - 117);
          gk.a((byte) -61);
          mn.d(42);
          qh.a((byte) 110);
          oj.n(65536);
          pe.b((byte) -30);
          mj.a((byte) -118);
          hj.a(false);
          dn.b((byte) -100);
          nk.a(0);
          fm.e((byte) -123);
          sj.a((byte) 22);
          pc.d(12);
          tl.c((byte) -121);
          oc.e(-640);
          fn.a((byte) -96);
          th.a(-15649);
          tc.a((byte) -91);
          nb.a(19);
          mg.a(125);
          e.f(param0 - 2);
          od.f(4);
          wj.f(-27836);
          jg.b((byte) 23);
          gh.a(68);
          lb.a(param0 ^ 1);
          ag.a(false);
          ok.d(param0 + 1626);
          r.b((byte) 125);
          jb.a(110);
          il.a(-128);
          gj.a(param0 ^ 29749);
          this.field_s = null;
          this.field_L = null;
          this.field_Q = null;
          this.field_D = null;
        } catch (RuntimeException runtimeException) {
          throw lj.a((Throwable) ((Object) runtimeException), "MinerDisturbance.EA(" + param0 + ')');
        }
    }

    private final void y(int param0) {
        RuntimeException decompiledCaughtException = null;
        int var2_int = 0;
        RuntimeException var2 = null;
        int var3 = 0;
        int var4 = 0;
        int var5 = 0;
        int var6 = 0;
        int var7 = 0;
        int var8 = 0;
        int var9 = 0;
        int var10 = 0;
        int var7Lifetime1;
        int var7Lifetime2;
        int var7Lifetime3;
        int var7Lifetime4;
        int var7Lifetime5;
        int var7Lifetime6;
        int var7Lifetime7;
        int var8Lifetime1;
        int var8Lifetime2;
        int var8Lifetime3;
        int var8Lifetime4;
        int var8Lifetime5;
        int var8Lifetime6;
        int var8Lifetime7;
        try {
          if (ag.field_c &&
            d.field_b &&
            !this.field_K) {
            var2_int = bl.g(param0 ^ 1) ? 1 : 0;
            if (var2_int == 0 &&
              !qe.field_b[5]) {
              return;
            }
            var5 = 0;
            var6 = 0;
            if (lj.field_r > 0) {
              var5 = (int)((Math.random() * (double)lj.field_r - (double)(lj.field_r / 2)) / 20.0);
              if (var5 > 16) {
                var5 = 16;
              }
              var6 = (int)((Math.random() * (double)lj.field_r - (double)(lj.field_r / 2)) / 40.0);
              if (var5 < -16) {
                var5 = -16;
              }
              if (16 < var6) {
                var6 = 16;
              }
              if (var6 < -16) {
                var6 = -16;
              }
            }
            var4 = -db.field_d + hf.field_t * 32;
            var3 = -li.field_c + ca.field_k * 32;
            var4 = -4 + var4 + (var6 >> 1);
            var3 = (var5 >> 1) + var3 - 4;
            var9 = (int)(80.0 * Math.sin(0.1 * (double)fb.field_f) + 100.0);
            var10 = 4281405;
            if (var2_int != 0 &&
              !mh.field_e[-1 + ca.field_k][hf.field_t - 1].field_b &&
              mh.field_e[-1 + ca.field_k][hf.field_t - 1].field_a && (!mh.field_e[ca.field_k - 1][hf.field_t].field_a ||
              !mh.field_e[ca.field_k][-1 + hf.field_t].field_a)) {
              var8 = var4 - 32;
              var7 = var3 - 32;
              eh.b(var7, var8, 32, 32, var10, var9);
              eh.a(var7, var8, 32, 32, var10);
              ef.field_b[0].f(var7, var8);
            }
            if (var2_int != 0 &&
              !mh.field_e[ca.field_k][hf.field_t - 1].field_b &&
              mh.field_e[ca.field_k][hf.field_t - 1].field_a) {
              var7Lifetime1 = var3;
              var8Lifetime1 = var4 - 32;
              eh.b(var7Lifetime1, var8Lifetime1, 32, 32, var10, var9);
              eh.a(var7Lifetime1, var8Lifetime1, 32, 32, var10);
              ef.field_b[1].f(var7Lifetime1, var8Lifetime1);
            }
            if (var2_int != 0 &&
              !mh.field_e[ca.field_k + 1][hf.field_t - 1].field_b &&
              mh.field_e[1 + ca.field_k][-1 + hf.field_t].field_a && (!mh.field_e[1 + ca.field_k][hf.field_t].field_a ||
              !mh.field_e[ca.field_k][-1 + hf.field_t].field_a)) {
              var8Lifetime2 = -32 + var4;
              var7Lifetime2 = 32 + var3;
              eh.b(var7Lifetime2, var8Lifetime2, 32, 32, var10, var9);
              eh.a(var7Lifetime2, var8Lifetime2, 32, 32, var10);
              ef.field_b[2].f(var7Lifetime2, var8Lifetime2);
            }
            if (!mh.field_e[param0 + ca.field_k][hf.field_t].field_b &&
              mh.field_e[1 + ca.field_k][hf.field_t].field_a) {
              var8Lifetime3 = var4;
              var7Lifetime3 = var3 + 32;
              eh.b(var7Lifetime3, var8Lifetime3, 32, 32, var10, var9);
              eh.a(var7Lifetime3, var8Lifetime3, 32, 32, var10);
              ef.field_b[3].f(var7Lifetime3 + (ef.field_b[3].field_x >> 2), var8Lifetime3 + (ef.field_b[3].field_A >> 2));
            }
            if (var2_int != 0 &&
              !mh.field_e[1 + ca.field_k][1 + hf.field_t].field_b &&
              mh.field_e[ca.field_k + 1][hf.field_t + 1].field_a && (!mh.field_e[ca.field_k + 1][hf.field_t].field_a ||
              !mh.field_e[ca.field_k][hf.field_t + 1].field_a)) {
              var8Lifetime4 = 32 + var4;
              var7Lifetime4 = 32 + var3;
              eh.b(var7Lifetime4, var8Lifetime4, 32, 32, var10, var9);
              eh.a(var7Lifetime4, var8Lifetime4, 32, 32, var10);
              ef.field_b[4].f(var7Lifetime4, var8Lifetime4);
            }
            if (var2_int != 0 &&
              !mh.field_e[ca.field_k][1 + hf.field_t].field_b &&
              mh.field_e[ca.field_k][hf.field_t + 1].field_a) {
              var8Lifetime5 = 32 + var4;
              var7Lifetime5 = var3;
              eh.b(var7Lifetime5, var8Lifetime5, 32, 32, var10, var9);
              eh.a(var7Lifetime5, var8Lifetime5, 32, 32, var10);
              ef.field_b[5].f(var7Lifetime5, var8Lifetime5);
            }
            if (var2_int != 0 &&
              !mh.field_e[ca.field_k - 1][hf.field_t + 1].field_b &&
              mh.field_e[ca.field_k - 1][1 + hf.field_t].field_a && (!mh.field_e[-1 + ca.field_k][hf.field_t].field_a ||
              !mh.field_e[ca.field_k][1 + hf.field_t].field_a)) {
              var7Lifetime6 = var3 - 32;
              var8Lifetime6 = var4 + 32;
              eh.b(var7Lifetime6, var8Lifetime6, 32, 32, var10, var9);
              eh.a(var7Lifetime6, var8Lifetime6, 32, 32, var10);
              ef.field_b[6].f(var7Lifetime6, var8Lifetime6);
            }
            if (!mh.field_e[ca.field_k - 1][hf.field_t].field_b &&
              mh.field_e[ca.field_k - 1][hf.field_t].field_a) {
              var8Lifetime7 = var4;
              var7Lifetime7 = var3 - 32;
              eh.b(var7Lifetime7, var8Lifetime7, 32, 32, var10, var9);
              eh.a(var7Lifetime7, var8Lifetime7, 32, 32, var10);
              ef.field_b[7].f(var7Lifetime7, var8Lifetime7);
            }
            return;
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2 = decompiledCaughtException;
          throw lj.a((Throwable) ((Object) var2), "MinerDisturbance.CB(" + param0 + ')');
        }
    }

    private final void d(boolean param0) {
        int stackIn_134_0 = 0;
        int stackIn_188_1 = 0;
        boolean stackIn_189_2 = false;
        RuntimeException decompiledCaughtException = null;
        int var2_int = 0;
        RuntimeException var2 = null;
        int var3 = 0;
        int var4 = 0;
        int var5 = 0;
        int var6 = 0;
        int var7 = 0;
        String var8_ref_String = null;
        int var8 = 0;
        String var9_ref_String = null;
        int var9 = 0;
        int var10_int = 0;
        String var10 = null;
        int[] var10_array = null;
        int var11 = 0;
        int var12 = 0;
        String var12_ref_String = null;
        int var13 = 0;
        int var14 = 0;
        int var15 = 0;
        var15 = field_ab;
        try {
          if (128 > di.field_Z) {
            if (di.field_Z < 64) {
              var2_int = 255 - di.field_Z * 4;
              mc.field_u.f(0, 0, var2_int);
              fh.field_e.f(7, 0, var2_int);
              mh.field_d.f(628, 0, var2_int);
              ei.field_M.f(7, 472, var2_int);
            }
            var2_int = 640 * di.field_Z / 64;
            eh.a(0, 0, var2_int, 480);
          }
          boolean decompiledFrameRemainder12 = true;
          var2_int = 73;
          var3 = 245;
          var4 = 70;
          var5 = ce.field_d.field_E + ce.field_d.field_I;
          if (0 != pl.field_h) {
            nn.field_h[cm.field_o].f(0, 0);
            if (this.field_T < 0 ||
              !(this.field_T <= (-1 + sl.field_u[pl.field_h].length))) {
              this.field_T = ll.a((byte) -73, sl.field_u[pl.field_h].length);
            }
            boolean decompiledFrameRemainder11 = true;
            L7: {
              L8: {
                L9: {
                  L10: {
                    boolean decompiledFrameRemainder10 = true;
                    boolean decompiledFrameRemainder9 = true;
                    boolean decompiledFrameRemainder8 = true;
                    boolean decompiledFrameRemainder7 = true;
                    boolean decompiledFrameRemainder6 = true;
                    boolean decompiledFrameRemainder5 = true;
                    boolean decompiledFrameRemainder4 = true;
                    boolean decompiledFrameRemainder3 = true;
                    boolean decompiledFrameRemainder2 = true;
                    boolean decompiledFrameRemainder1 = true;
                    boolean decompiledFrameRemainder0 = true;
                    var8_ref_String = sl.field_u[pl.field_h][this.field_T];
                    sb.field_n.field_T[0][wd.field_e] = 4408131;
                    sb.field_n.field_T[0][bi.field_p] = 0;
                    sb.field_n.field_T[0][re.field_b] = 14540253;
                    var10_int = pl.field_h;
                    if ((var10_int != 4) &&
                      (decompiledFrameRemainder0 = (var10_int != 1)) &&
                      (decompiledFrameRemainder1 = (var10_int != 7 ||
                      var15 != 0)) &&
                      (decompiledFrameRemainder2 = (10 != var10_int ||
                      var15 != 0)) &&
                      (decompiledFrameRemainder3 = (var10_int != 5 ||
                      var15 != 0)) &&
                      (decompiledFrameRemainder4 = (var10_int != 13 ||
                      var15 != 0)) &&
                      (decompiledFrameRemainder5 = (var10_int != 3 ||
                      var15 != 0)) &&
                      (decompiledFrameRemainder6 = (var10_int != 2 ||
                      var15 != 0)) &&
                      (decompiledFrameRemainder7 = (var10_int != 6 ||
                      var15 != 0)) &&
                      (decompiledFrameRemainder8 = (0 != var10_int)) &&
                      (decompiledFrameRemainder9 = (var10_int != 8)) &&
                      (decompiledFrameRemainder10 = (var10_int != 9 ||
                      var15 != 0))) {
                      switch (var10_int) {
                        case 11:
                          break L10;
                        case 12:
                          break L9;
                        default:
                          break L7;
                        case 14:
                          if (var15 == 0) {
                            break L8;
                          }
                          break;
                      }
                    }
                    if ((decompiledFrameRemainder10) &&
                      (decompiledFrameRemainder9) &&
                      (decompiledFrameRemainder8) &&
                      (decompiledFrameRemainder7) &&
                      (decompiledFrameRemainder6) &&
                      (decompiledFrameRemainder5) &&
                      (decompiledFrameRemainder4) &&
                      (decompiledFrameRemainder3) &&
                      (decompiledFrameRemainder2) &&
                      (decompiledFrameRemainder1) &&
                      (decompiledFrameRemainder0)) {
                      var9_ref_String = nc.field_b;
                      decompiledFrameRemainder11 = (var15 != 0);
                    }
                    if ((decompiledFrameRemainder11) &&
                      (decompiledFrameRemainder10) &&
                      (decompiledFrameRemainder9) &&
                      (decompiledFrameRemainder8) &&
                      (decompiledFrameRemainder7) &&
                      (decompiledFrameRemainder6) &&
                      (decompiledFrameRemainder5) &&
                      (decompiledFrameRemainder4) &&
                      (decompiledFrameRemainder3) &&
                      (decompiledFrameRemainder2) &&
                      (decompiledFrameRemainder1)) {
                      var9_ref_String = jg.field_k;
                      decompiledFrameRemainder11 = (var15 != 0);
                    }
                    if ((decompiledFrameRemainder11) &&
                      (decompiledFrameRemainder10) &&
                      (decompiledFrameRemainder9) &&
                      (decompiledFrameRemainder8) &&
                      (decompiledFrameRemainder7) &&
                      (decompiledFrameRemainder6) &&
                      (decompiledFrameRemainder5) &&
                      (decompiledFrameRemainder4) &&
                      (decompiledFrameRemainder3) &&
                      (decompiledFrameRemainder2)) {
                      var9_ref_String = r.field_b;
                      decompiledFrameRemainder11 = (var15 != 0);
                    }
                    if ((decompiledFrameRemainder11) &&
                      (decompiledFrameRemainder10) &&
                      (decompiledFrameRemainder9) &&
                      (decompiledFrameRemainder8) &&
                      (decompiledFrameRemainder7) &&
                      (decompiledFrameRemainder6) &&
                      (decompiledFrameRemainder5) &&
                      (decompiledFrameRemainder4) &&
                      (decompiledFrameRemainder3)) {
                      var9_ref_String = rd.field_d;
                      decompiledFrameRemainder11 = (var15 != 0);
                    }
                    if ((decompiledFrameRemainder11) &&
                      (decompiledFrameRemainder10) &&
                      (decompiledFrameRemainder9) &&
                      (decompiledFrameRemainder8) &&
                      (decompiledFrameRemainder7) &&
                      (decompiledFrameRemainder6) &&
                      (decompiledFrameRemainder5) &&
                      (decompiledFrameRemainder4)) {
                      var9_ref_String = hf.field_s;
                      decompiledFrameRemainder11 = (var15 != 0);
                    }
                    if ((decompiledFrameRemainder11) &&
                      (decompiledFrameRemainder10) &&
                      (decompiledFrameRemainder9) &&
                      (decompiledFrameRemainder8) &&
                      (decompiledFrameRemainder7) &&
                      (decompiledFrameRemainder6) &&
                      (decompiledFrameRemainder5)) {
                      var9_ref_String = mg.field_c;
                      decompiledFrameRemainder11 = (var15 != 0);
                    }
                    if ((decompiledFrameRemainder11) &&
                      (decompiledFrameRemainder10) &&
                      (decompiledFrameRemainder9) &&
                      (decompiledFrameRemainder8) &&
                      (decompiledFrameRemainder7) &&
                      (decompiledFrameRemainder6)) {
                      var9_ref_String = pb.field_z;
                      decompiledFrameRemainder11 = (var15 != 0);
                    }
                    if ((decompiledFrameRemainder11) &&
                      (decompiledFrameRemainder10) &&
                      (decompiledFrameRemainder9) &&
                      (decompiledFrameRemainder8) &&
                      (decompiledFrameRemainder7)) {
                      var9_ref_String = df.field_c;
                      decompiledFrameRemainder11 = (var15 != 0);
                    }
                    if ((decompiledFrameRemainder11) &&
                      (decompiledFrameRemainder10) &&
                      (decompiledFrameRemainder9) &&
                      (decompiledFrameRemainder8)) {
                      var9_ref_String = hh.field_d;
                      decompiledFrameRemainder11 = (var15 != 0);
                    }
                    if ((decompiledFrameRemainder11) &&
                      (decompiledFrameRemainder10) &&
                      (decompiledFrameRemainder9)) {
                      var9_ref_String = ok.field_a;
                      decompiledFrameRemainder11 = (var15 != 0);
                    }
                    if ((decompiledFrameRemainder11) &&
                      (decompiledFrameRemainder10)) {
                      var9_ref_String = dh.field_a;
                      decompiledFrameRemainder11 = (var15 != 0);
                    }
                    if (decompiledFrameRemainder11) {
                      var9_ref_String = vk.field_d;
                      decompiledFrameRemainder11 = (var15 != 0);
                    }
                  }
                  if (decompiledFrameRemainder11) {
                    var9_ref_String = jl.field_bb;
                    decompiledFrameRemainder11 = (var15 != 0);
                  }
                }
                if (decompiledFrameRemainder11) {
                  var9_ref_String = hl.field_c;
                  decompiledFrameRemainder11 = (var15 != 0);
                }
              }
              if (decompiledFrameRemainder11) {
                var9_ref_String = nd.field_a;
                decompiledFrameRemainder11 = (var15 != 0);
              }
            }
            if (decompiledFrameRemainder11) {
              var9_ref_String = mc.field_z;
            }
            var4 -= 10;
            var4 = var4 + ce.field_d.a(var9_ref_String, 100, var4, 130, 480, 16777215, 6710886, 1, 0, var5) * var5;
            var4 += 10;
            var10 = ti.field_J;
            if (var10 == null) {
              var10 = lj.field_s;
            }
            sb.field_n.a(we.a(sb.field_n, var10, 170), -80 + (nn.field_h[cm.field_o].field_x >> 1), var4, 160, sb.field_n.field_E + sb.field_n.field_I, 0, -1, 1, 0, 0);
            var4 += 40;
            var7 = 175;
            ce.field_d.a(var8_ref_String, var2_int, var4, var3 - var2_int, var5 * 3, 16777215, 6710886, 1, 1, var5);
            var6 = 70;
            var11 = var6;
            var12 = var7;
            if (cm.field_o == 1) {
              var13 = 28;
              var12 += 8;
              var11 -= 6;
              if (!(1 >= ne.a(param0))) {
                var13 = 26;
                if (var15 != 0) {
                  var13 = 32;
                }
              }
            } else {
              var13 = 32;
            }
            mb.field_d[0].f(var11, var12);
            var14 = 12566463;
            ce.field_d.a(oa.a((byte) -112, uh.field_c, new String[]{Integer.toString(nm.field_g[0]), Integer.toString(nm.field_g[0] * 100)}), 32 + var6, 30 + var7, var14, -1);
            var12 = var12 + var13;
            var7 = var7 + var13;
            var14 = 13619151;
            mb.field_d[1].f(var11, var12);
            ce.field_d.a(oa.a((byte) -93, gd.field_A, new String[]{Integer.toString(nm.field_g[1]), Integer.toString(nm.field_g[1] * 250)}), var6 + 32, var7 + 30, var14, -1);
            var7 = var7 + var13;
            var12 = var12 + var13;
            var14 = 14671839;
            mb.field_d[2].f(var11, var12);
            ce.field_d.a(oa.a((byte) -116, ge.field_h, new String[]{Integer.toString(nm.field_g[2]), Integer.toString(nm.field_g[2] * 500)}), var6 + 32, 30 + var7, var14, -1);
            var7 = var7 + var13;
            var12 = var12 + var13;
            var14 = 15724527;
            mb.field_d[3].f(var11, var12);
            ce.field_d.a(oa.a((byte) -120, fl.field_h, new String[]{Integer.toString(nm.field_g[3]), Integer.toString(nm.field_g[3] * 750)}), var6 + 32, var7 + 30, var14, -1);
            if (cm.field_o == 1) {
              var12 = var12 + var13;
              var7 = var7 + var13;
              var14 = 15724527;
              mb.field_d[5].f(var11, var12);
              if (pl.field_h == 0) {
                var14 = 3092271;
              }
              ce.field_d.a(oa.a((byte) -118, nn.field_a, new String[]{Integer.toString(nm.field_g[5]), Integer.toString(1000 * nm.field_g[5])}), 32 + var6, var7 + 30, var14, -1);
            }
            var7 = var7 + var13;
            var12 = var12 + var13;
            mb.field_d[4].f(var11, var12);
            var14 = 16777215;
            ce.field_d.a(oa.a((byte) -91, bl.field_u, new String[]{Integer.toString(nm.field_g[4]), Integer.toString(2500 * nm.field_g[4])}), 32 + var6, var7 + 30, var14, -1);
            var7 += 32;
            var7 = 0;
            var6 = nn.field_h[cm.field_o].field_x >> 1;
            decompiledFrameRemainder12 = (var15 != 0);
          }
          if (decompiledFrameRemainder12) {
            g.a(30, 420, 15, 360, (byte) 113, qf.field_o[cm.field_o]);
            var8 = 75;
            dl.field_d[cm.field_o].f(60, var8);
            dl.field_d[cm.field_o].b(60, 285);
            dl.field_d[cm.field_o].h(270, var8);
            dl.field_d[cm.field_o].d();
            dl.field_d[cm.field_o].h(270, 285);
            var2_int = 100;
            var3 = 295;
            dl.field_d[cm.field_o].d();
            if (0 > this.field_T ||
              !(this.field_T <= sl.field_u[pl.field_h].length - 1)) {
              this.field_T = ll.a((byte) -73, sl.field_u[pl.field_h].length);
            }
            var9_ref_String = sl.field_u[pl.field_h][this.field_T];
            sb.field_n.field_T[0][wd.field_e] = 9737364;
            sb.field_n.field_T[0][bi.field_p] = 0;
            sb.field_n.field_T[0][re.field_b] = 12892208;
            var10 = ti.field_J;
            if (var10 == null) {
              var10 = qf.field_q;
            }
            stackIn_134_0 = (a.field_c < 1000000) ? 0 : 30;
            var11 = stackIn_134_0;
            sb.field_n.b(var10, 195, 112 + var11, 0, -1);
            ce.field_d.a(var9_ref_String, var2_int, var11 + 137, -var2_int + var3, 50, 12584192, 6710886, 1, 1, var5);
            var12_ref_String = ok.field_a;
            var6 = 100;
            ce.field_d.a(var12_ref_String, 40, var11 - ce.field_d.field_E + (var4 - ce.field_d.field_I + 70), 310, 20, 0, 16777215, 1, 0, -1);
            var7 = var11 + 175;
            var13 = 32;
            if (1 == cm.field_o) {
              var13 = 28;
            }
            vl.field_E.f(var6, 15 + var7);
            var14 = 12566463;
            if (pl.field_h == 0) {
              var14 = 10526880;
            }
            ce.field_d.a(oa.a((byte) -78, uh.field_c, new String[]{Integer.toString(nm.field_g[0]), Integer.toString(100 * nm.field_g[0])}), var6 + 32, 30 + var7, var14, -1);
            var7 = var7 + var13;
            var14 = 13619151;
            em.field_y.f(var6, 15 + var7);
            if (pl.field_h == 0) {
              var14 = 9408399;
            }
            ce.field_d.a(oa.a((byte) -109, gd.field_A, new String[]{Integer.toString(nm.field_g[1]), Integer.toString(nm.field_g[1] * 250)}), var6 + 32, 30 + var7, var14, -1);
            var7 = var7 + var13;
            sn.field_a.f(var6, 15 + var7);
            var14 = 14671839;
            if (0 == pl.field_h) {
              var14 = 5197647;
            }
            ce.field_d.a(oa.a((byte) -80, ge.field_h, new String[]{Integer.toString(nm.field_g[2]), Integer.toString(500 * nm.field_g[2])}), var6 + 32, var7 + 30, var14, -1);
            var7 = var7 + var13;
            var14 = 15724527;
            di.field_ab.f(var6, 17 + var7);
            if (pl.field_h == 0) {
              var14 = 3092271;
            }
            ce.field_d.a(oa.a((byte) -115, fl.field_h, new String[]{Integer.toString(nm.field_g[3]), Integer.toString(750 * nm.field_g[3])}), 32 + var6, 30 + var7, var14, -1);
            var7 = var7 + var13;
            if (1 == cm.field_o) {
              var14 = 15724527;
              mb.field_d[5].f(-6 + var6, 6 + var7);
              if (pl.field_h == 0) {
                var14 = 3092271;
              }
              ce.field_d.a(oa.a((byte) -80, nn.field_a, new String[]{Integer.toString(nm.field_g[5]), Integer.toString(1000 * nm.field_g[5])}), 32 + var6, var7 + 30, var14, -1);
              var7 = var7 + var13;
            }
            vh.field_c.f(var6, var7 + 15);
            var14 = 16777215;
            if (pl.field_h == 0) {
              var14 = 0;
            }
            ce.field_d.a(oa.a((byte) -110, bl.field_u, new String[]{Integer.toString(nm.field_g[4]), Integer.toString(2500 * nm.field_g[4])}), var6 + 32, 30 + var7, var14, -1);
            var7 = 0;
            var6 = 195;
          }
          if (ne.a(param0) > 1) {
            boolean decompiledSharedTail1 = (pl.field_h != 0);
            if (!decompiledSharedTail1) {
              var8 = 360;
              if (a.field_c >= 1000000) {
                var8 = 380;
              }
              if (cm.field_o == 1) {
                var8 += 5;
              }
              ce.field_d.b(oa.a((byte) -94, uh.field_f, new String[]{Integer.toString(ne.a(false))}), var6, var8, 0, -1);
              decompiledSharedTail1 = (var15 != 0);
            }
            if (decompiledSharedTail1) {
              ce.field_d.b(oa.a((byte) -91, uh.field_f, new String[]{Integer.toString(ne.a(param0))}), var6, 360, 16776960, -1);
            }
          }
          if (0 == pl.field_h) {
            var8 = 386;
            if (a.field_c >= 1000000) {
              var8 = 400;
            }
            ce.field_d.b(an.field_g, var6, var8, 0, -1);
          }
          var8 = 16776960;
          if (pl.field_h == 0) {
            var8 = 12584192;
            var7 = 80;
          }
          var7 = 408;
          var9 = var7;
          if (1000000 <= a.field_c) {
            var9 += 10;
          }
          boolean decompiledFrameCompleted0 = true;
          ce.field_d.b(oa.a((byte) -83, km.field_c, new String[]{Integer.toString(a.field_c)}), var6, var9, var8, -1);
          var7 += 32;
          var7 = 462;
          var6 = nn.field_h[cm.field_o].field_x >> 1;
          if (pl.field_h == 0) {
            var7 = 80;
            var6 = 195;
            var10_array = new int[4];
            eh.b(var10_array);
            eh.f(40, 54, 350, 426);
            var11 = Math.abs(nk.field_w - 320) / 2;
            var12 = 0;
            while (307 > var12) {
              eh.g(var11 + 40 + var12, 450 - var12, 10, 16777215, 140);
              eh.g(var11 + 60 + var12, 450 - var12, 40, 16777215, 140);
              eh.g(var11 + 107 + var12, -var12 + 450, 30, 16777215, 140);
              eh.g(var11 + var12 + 152, 450 - var12, 6, 16777215, 140);
              var12++;
              if (var15 != 0) {
                decompiledFrameCompleted0 = false;
                break;
              }
            }
            if (decompiledFrameCompleted0) {
              eh.a(var10_array);
            }
          }
          stackIn_188_1 = var8;
          stackIn_189_2 = !(param0);
          this.a(stackIn_188_1, stackIn_189_2, var6, var7);
          if (64 < di.field_Z) {
            var10 = mg.field_g;
            var11 = 400;
            var12 = 408;
            mm.field_a.a(var10, -2 + var11, var12 + pk.field_b.field_I, 4, 8218369);
            mm.field_a.a(var10, var11 + 2, pk.field_b.field_I + var12, 4, 8218369);
            mm.field_a.a(var10, var11, pk.field_b.field_I + var12 - 2, 4, 8218369);
            mm.field_a.a(var10, var11, 2 + pk.field_b.field_I + var12, 4, 8218369);
            mm.field_a.a(var10, -1 + var11, -1 + var12 + pk.field_b.field_I, 4, 8218369);
            mm.field_a.a(var10, var11 + 1, var12 - (-pk.field_b.field_I + 1), 4, 8218369);
            mm.field_a.a(var10, -1 + var11, 1 + (pk.field_b.field_I + var12), 4, 8218369);
            mm.field_a.a(var10, var11 + 1, var12 - (-pk.field_b.field_I - 1), 4, 8218369);
            boolean decompiledSharedTail0 = !(of.field_a);
            if (!decompiledSharedTail0) {
              mm.field_a.a(var10, var11, pk.field_b.field_I + var12, 15885602, -1);
              decompiledSharedTail0 = (var15 != 0);
            }
            if (decompiledSharedTail0) {
              mm.field_a.a(var10, var11, pk.field_b.field_I + var12, 16502531, -1);
            }
          }
          if (param0) {
            return;
          }
          ha.field_b = a.field_c;
          eh.a();
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2 = decompiledCaughtException;
          throw lj.a((Throwable) ((Object) var2), "MinerDisturbance.FB(" + param0 + ')');
        }
    }

    private final void w(int param0) {
        int stackIn_74_0 = 0;
        RuntimeException decompiledCaughtException = null;
        int var2_int = 0;
        RuntimeException var2 = null;
        int var3 = 0;
        int var4 = 0;
        var4 = field_ab;
        try {
          sk.field_d = sk.field_d + rg.field_wb;
          if (80 < sk.field_d &&
            mh.field_e[ca.field_k + 1][hf.field_t].g()) {
            sk.field_d = 80;
            if (mh.field_e[ca.field_k + 1][hf.field_t].field_v &&
              rg.field_wb > 28) {
              mh.field_e[1 + ca.field_k][hf.field_t].field_S = true;
              mh.field_e[ca.field_k + 1][hf.field_t].field_r = 975;
              bd.field_k = bd.field_k + 10;
              rg.field_wb = -10;
              if (sc.field_b) {
                ag.a(true, 28, hf.field_t << 5, ca.field_k + 1 << 5);
                if ((var4 != 0) &&
                  (rg.field_wb > 1)) {
                  rg.field_wb = rg.field_wb - 1;
                }
              }
            } else {
              if (rg.field_wb > 1) {
                rg.field_wb = rg.field_wb - 1;
              }
            }
          }
          if (sk.field_d < -80 &&
            mh.field_e[-1 + ca.field_k][hf.field_t].g()) {
            sk.field_d = -80;
            if (mh.field_e[-1 + ca.field_k][hf.field_t].field_v &&
              rg.field_wb < -28) {
              mh.field_e[ca.field_k - 1][hf.field_t].field_S = true;
              mh.field_e[-1 + ca.field_k][hf.field_t].field_r = 975;
              rg.field_wb = 10;
              bd.field_k = bd.field_k + 10;
              if (sc.field_b) {
                ag.a(true, 28, hf.field_t << 5, -1 + ca.field_k << 5);
                if ((var4 != 0) &&
                  (rg.field_wb < -1)) {
                  rg.field_wb = rg.field_wb + 1;
                }
              }
            } else {
              if (rg.field_wb < -1) {
                rg.field_wb = rg.field_wb + 1;
              }
            }
          }
          if (sk.field_d > 160) {
            sk.field_d = sk.field_d - 320;
            ca.field_k = ca.field_k + 1;
          }
          var2_int = -94 % ((2 - param0) / 61);
          if (-160 > sk.field_d) {
            ca.field_k = ca.field_k - 1;
            sk.field_d = sk.field_d + 320;
          }
          boolean decompiledFrameRemainder0 = true;
          if (!qe.field_b[18] && (!(tc.field_s <= 0) ||
            mh.field_e[ca.field_k][hf.field_t + 1].field_E ||
            sk.field_d > 0 &&
            mh.field_e[ca.field_k + 1][1 + hf.field_t].field_E ||
            !(sk.field_d >= 0) &&
            mh.field_e[-1 + ca.field_k][1 + hf.field_t].field_E)) {
            stackIn_74_0 = 1;
            decompiledFrameRemainder0 = false;
          }
          else {
            stackIn_74_0 = 0;
          }
          var3 = stackIn_74_0;
          if (var3 != 0 &&
            (dl.field_c & 3) == 0 &&
            !qd.field_O[96] &&
            !qd.field_O[97]) {
            if (rg.field_wb < 0) {
              rg.field_wb = rg.field_wb + 1;
              if ((var4 != 0) &&
                (rg.field_wb > 0)) {
                rg.field_wb = rg.field_wb - 1;
              }
            } else {
              if (rg.field_wb > 0) {
                rg.field_wb = rg.field_wb - 1;
              }
            }
          }
          if (var3 != 0) {
            if ((rg.field_wb == 0 ||
              qd.field_O[96] ||
              qd.field_O[97]) &&
              (!(0 > rg.field_wb) ||
              !qd.field_O[97])) {
              if (0 >= rg.field_wb) {
                return;
              }
              if (!qd.field_O[96]) {
                return;
              }
            }
            ne.a(42, -79);
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2 = decompiledCaughtException;
          throw lj.a((Throwable) ((Object) var2), "MinerDisturbance.UA(" + param0 + ')');
        }
    }

    public final void init() {
        try {
          this.a("minerdisturbance", 13, -6622);
        } catch (RuntimeException runtimeException) {
          throw lj.a((Throwable) ((Object) runtimeException), "MinerDisturbance.init()");
        }
    }

    final void a(int param0) {
        di var2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var2_ref = null;
        try {
          this.a(false, 5, (byte) -121, 9, 7, 8, 10, 12);
          pl.field_h = 15;
          cm.field_r = 0;
          if (param0 <= 37) {
            this.a(-122, -50);
          }
          hf.field_r = 50;
          ke.field_V = false;
          lj.field_r = 0;
          kj.a(1, -22156);
          var2 = new di();
          var2.a(128, -6242, 9);
          pe.a(qa.field_a, 22050, 512, (byte) -124, true, (java.awt.Component) ((Object) ef.field_c), var2, 22050);
          this.a(false, (byte) -61, true, true, false);
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2_ref = decompiledCaughtException;
          throw lj.a((Throwable) ((Object) var2_ref), "MinerDisturbance.NA(" + param0 + ')');
        }
    }

    final void a(int param0, int param1) {
        RuntimeException decompiledCaughtException = null;
        RuntimeException var3 = null;
        try {
          if (param1 > 0 &&
            !kj.a(false) &&
            !qm.field_f) {
            boolean decompiledSharedTail0 = (0 != cm.field_o);
            if (!decompiledSharedTail0) {
              tj.a(ac.field_b, 65529, qd.field_M, (byte) -66, di.field_X, new int[]{param1}, 6, vh.field_g, 3);
              decompiledSharedTail0 = (field_ab != 0);
            }
            if ((decompiledSharedTail0) &&
              (cm.field_o == 1)) {
              tj.a(ac.field_b, 65528, qd.field_M, (byte) -66, di.field_X, new int[]{param1}, 7, vh.field_g, 3);
            }
            sn.field_b[cm.field_o] = null;
          }
          if (param0 != 3) {
            this.field_L = (int[]) null;
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3 = decompiledCaughtException;
          throw lj.a((Throwable) ((Object) var3), "MinerDisturbance.AB(" + param0 + ',' + param1 + ')');
        }
    }

    private final boolean r(int param0) {
        int var2_int = 0;
        RuntimeException var2 = null;
        int var4 = 0;
        RuntimeException decompiledCaughtException = null;
        ln[] var2_array = null;
        int var3 = 0;
        ln[] var2_arrayLifetime1;
        var4 = field_ab;
        try {
          if (fl.field_f != null &&
            fl.field_f.a(false, "volcano")) {
            if (je.field_j[0] == null) {
              je.field_w = td.a("ores", fl.field_f, "volcano", (byte) 127);
              je.field_d[0] = td.a("rocks", fl.field_f, "volcano", (byte) 125);
              je.field_P[0] = td.a("damagedrocks", fl.field_f, "volcano", (byte) 122);
              je.field_R[0] = td.a("damagedrocks2", fl.field_f, "volcano", (byte) 109);
              je.field_p[0] = td.a("damagedrocks3", fl.field_f, "volcano", (byte) 125);
              mb.field_d = td.a("gemstones", fl.field_f, "volcano", (byte) 113);
              je.field_B = td.a("boulders", fl.field_f, "volcano", (byte) 117);
              je.field_x[0] = td.a("slopes", fl.field_f, "volcano", (byte) 121);
              je.field_j[0] = td.a("sky", fl.field_f, "volcano", (byte) 119);
              return false;
            }
            if (null == sa.field_t[0][0]) {
              ff.field_c = td.a("interface_items", fl.field_f, "volcano", (byte) 119);
              sa.field_t[0][0] = pb.a("volcano", fl.field_f, "rankings1", (byte) -77);
              var2_array = tb.a("rankings2", "volcano", fl.field_f, 1);
              ai.a(var2_array, 0, sa.field_t[0], 1, var2_array.length);
              var2_arrayLifetime1 = tb.a("rankings3", "volcano", fl.field_f, 1);
              ai.a(var2_arrayLifetime1, 0, sa.field_t[0], 6, var2_arrayLifetime1.length);
              sa.field_t[0][8] = pb.a("volcano", fl.field_f, "rankings4", (byte) -77);
              sa.field_t[0][9] = pb.a("volcano", fl.field_f, "rankings5", (byte) -77);
              var3 = 0;
              while (var3 < sa.field_t[0].length) {
                sa.field_t[0][var3].a();
                var3++;
                if (var4 == 0) {
                  continue;
                }
                break;
              }
              return false;
            }
            var2_int = 13 % ((param0 + 15) / 50);
            if (null != qf.field_o[0][8]) {
              if (null == mc.field_u) {
                mc.field_u = jn.a("screen_box_left", -29553, "volcano", fl.field_f);
                mh.field_d = jn.a("screen_box_right", -29553, "volcano", fl.field_f);
                fh.field_e = jn.a("screen_box_top", -29553, "volcano", fl.field_f);
                ei.field_M = jn.a("screen_box_bottom", -29553, "volcano", fl.field_f);
                pi.field_b = jn.a("score_box", -29553, "volcano", fl.field_f);
                me.field_k[0] = jn.a("levelbackground", -29553, "volcano", fl.field_f);
              }
              qd.field_S = true;
              return true;
            }
            nn.field_h[0] = jn.a("gravestone", -29553, "volcano", fl.field_f);
            dl.field_d[0] = jn.a("certificate_pattern", -29553, "volcano", fl.field_f);
            vl.field_E = jn.a("certificate_iron", -29553, "volcano", fl.field_f);
            em.field_y = jn.a("certificate_silver", -29553, "volcano", fl.field_f);
            sn.field_a = jn.a("certificate_gold", -29553, "volcano", fl.field_f);
            di.field_ab = jn.a("certificate_efluvium", -29553, "volcano", fl.field_f);
            vh.field_c = jn.a("certificate_diamond", -29553, "volcano", fl.field_f);
            qf.field_o[0][0] = jn.a("certificate_topleft", -29553, "volcano", fl.field_f);
            qf.field_o[0][1] = jn.a("certificate_top", -29553, "volcano", fl.field_f);
            qf.field_o[0][2] = jn.a("certificate_topright", -29553, "volcano", fl.field_f);
            qf.field_o[0][3] = jn.a("certificate_left", -29553, "volcano", fl.field_f);
            qf.field_o[0][4] = jn.a("certificate_centre", -29553, "volcano", fl.field_f);
            qf.field_o[0][5] = jn.a("certificate_right", -29553, "volcano", fl.field_f);
            qf.field_o[0][6] = jn.a("certificate_bottomleft", -29553, "volcano", fl.field_f);
            qf.field_o[0][7] = jn.a("certificate_bottom", -29553, "volcano", fl.field_f);
            qf.field_o[0][8] = jn.a("certificate_bottomright", -29553, "volcano", fl.field_f);
            return false;
          }
          return false;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2 = decompiledCaughtException;
          throw lj.a((Throwable) ((Object) var2), "MinerDisturbance.SA(" + param0 + ')');
        }
    }

    private final void e(boolean param0) {
        int incrementValue$0 = 0;
        int incrementValue$1 = 0;
        int stackIn_11_0 = 0;
        int stackIn_37_0 = 0;
        int stackIn_48_0 = 0;
        int stackIn_48_1 = 0;
        int stackIn_99_0 = 0;
        int stackIn_101_0 = 0;
        int stackIn_101_1 = 0;
        int stackIn_112_0 = 0;
        RuntimeException decompiledCaughtException = null;
        je var2 = null;
        RuntimeException var2_ref = null;
        int var3 = 0;
        int var4 = 0;
        int var5 = 0;
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
        int var9Lifetime1;
        int var10Lifetime1;
        int var11Lifetime1;
        int var12Lifetime1;
        int var13Lifetime1;
        int var14Lifetime1;
        int var15Lifetime1;
        int var16Lifetime1;
        int var17Lifetime1;
        int var12Lifetime1Lifetime1;
        int var13Lifetime1Lifetime1;
        int var14Lifetime1Lifetime1;
        var25 = field_ab;
        try {
          var3 = 596 - (s.field_L[1].field_x >> 1);
          s.field_L[0].f(var3, -s.field_L[0].field_A + 76);
          eh.a(var3, 76, s.field_L[1].field_x + 580, 76 - (-this.field_G + this.field_W));
          var4 = 76 + this.field_G;
          var5 = -li.field_c + (32 * ca.field_k + sk.field_d / 10);
          var6 = -db.field_d + (hf.field_t * 32 + mf.field_i / 10);
          if ((var3 - 96) < var5 &&
            var6 > -20 &&
            96 + (76 + var4) > var6) {
            stackIn_11_0 = 1;
          } else {
            stackIn_11_0 = 0;
          }
          boolean decompiledFrameCompleted0 = true;
          var7 = stackIn_11_0;
          if (var7 != 0) {
            var8 = 0;
            var9 = a.field_a[0].field_x >> 1;
            var10 = a.field_a[0].field_A >> 1;
            var11 = var9 + 48 + var5;
            var12 = var10 + var6 + 48;
            var13 = var10 + (var6 - 48);
            var14 = var9 + (var5 - 48);
            var15 = 0;
            var16 = 0;
            if (var14 < 0) {
              var15 = var14 * -1;
              var14 = 0;
            }
            if (-1 + eh.field_g < var11) {
              var16 = 1 - eh.field_g + var11;
              var11 = -1 + eh.field_g;
            }
            if (0 > var13) {
              var13 = 0;
            }
            if (var13 > -1 + eh.field_c) {
              var13 = -1 + eh.field_c;
            }
            while (var12 > var13) {
              var8 = var8 + var15;
              stackIn_37_0 = var14;
              if (var25 != 0) {
                decompiledFrameCompleted0 = false;
                break;
              }
              var17 = stackIn_37_0;
              while (var11 > var17) {
                incrementValue$0 = var8;
                var8++;
                this.field_L[incrementValue$0] = eh.field_f[var13 * eh.field_g + var17];
                var17++;
              }
              var8 = var8 + var16;
              var13++;
            }
          }
          if (decompiledFrameCompleted0) {
            stackIn_37_0 = this.field_W + 76;
          }
          var8 = stackIn_37_0;
          do {
            if (var8 >= var4) {
              var8 = 0;
              break;
            }
            s.field_L[1].g(var3, -this.field_W + var8);
            var8 = var8 + s.field_L[1].field_A;
          } while (var25 == 0);
          var9Lifetime1 = 0;
          if (!param0) {
            return;
          }
          var10Lifetime1 = this.field_W;
          while (true) {
            stackIn_48_0 = ~this.field_G;
            stackIn_48_1 = ~var10Lifetime1;
            if (stackIn_48_0 < stackIn_48_1) {
              var11Lifetime1 = 1;
              stackIn_99_0 = 0;
              if (var25 == 0) {
                var12Lifetime1 = stackIn_99_0;
                while (32 > var12Lifetime1) {
                  stackIn_48_0 = ~var10Lifetime1;
                  stackIn_48_1 = ~je.field_t;
                  if (stackIn_48_0 > stackIn_48_1) {
                    var2 = mh.field_e[var12Lifetime1][var10Lifetime1];
                    if (var2.field_V) {
                      var13Lifetime1 = 8014124;
                      if (!var2.field_a) {
                        var11Lifetime1 = 0;
                      } else {
                        var13Lifetime1 = 13016173;
                      }
                      var14Lifetime1 = je.e(var12Lifetime1, var10Lifetime1, 1, 1);
                      if (var14Lifetime1 > 0) {
                        if (var14Lifetime1 == 1) {
                          var13Lifetime1 = 7748154;
                        }
                        if (var14Lifetime1 == 2) {
                          var13Lifetime1 = 9779770;
                        }
                        if (var14Lifetime1 == 3) {
                          var13Lifetime1 = 12399154;
                        }
                        if (2 == var14Lifetime1) {
                          var13Lifetime1 = 15553598;
                        }
                        if (var14Lifetime1 == 5) {
                          var13Lifetime1 = 16733246;
                        }
                        if (6 == var14Lifetime1) {
                          var13Lifetime1 = 16728867;
                        }
                        if (var14Lifetime1 == 7) {
                          var13Lifetime1 = 16720401;
                        }
                        if (8 == var14Lifetime1) {
                          var13Lifetime1 = 16718350;
                        }
                        if (var14Lifetime1 >= 9) {
                          var13Lifetime1 = 16714252;
                        }
                      }
                      eh.b(2 + (var12Lifetime1 + 580), 76 + var9Lifetime1, var13Lifetime1);
                    }
                  }
                  var12Lifetime1++;
                }
                if (var11Lifetime1 != 0 &&
                  var9Lifetime1 > hf.field_t) {
                  var8++;
                  if (var8 >= 2) {
                    this.field_Z = var10Lifetime1;
                    this.field_G = var10Lifetime1;
                  }
                } else {
                  var8 = 0;
                }
                var9Lifetime1++;
                var10Lifetime1++;
                continue;
              }
            } else {
              var9Lifetime1 = 743564;
              var10Lifetime1 = 6373481;
              var11Lifetime1 = 0;
              stackIn_99_0 = this.field_W;
            }
            var12Lifetime1Lifetime1 = stackIn_99_0;
            while (true) {
              stackIn_101_0 = var12Lifetime1Lifetime1;
              stackIn_101_1 = 24;
              if (stackIn_101_0 < stackIn_101_1) {
                var13Lifetime1Lifetime1 = var9Lifetime1 + var12Lifetime1Lifetime1 * var10Lifetime1 / 16;
                stackIn_112_0 = 0;
                if (var25 == 0) {
                  var14Lifetime1Lifetime1 = stackIn_112_0;
                  while (32 > var14Lifetime1Lifetime1) {
                    stackIn_101_0 = Math.abs(-16 + var14Lifetime1Lifetime1) >> 1;
                    stackIn_101_1 = var12Lifetime1Lifetime1;
                    if (stackIn_101_0 >= stackIn_101_1) {
                      eh.b(580 + (var14Lifetime1Lifetime1 + 2), 76 + var11Lifetime1, var13Lifetime1Lifetime1);
                    }
                    var14Lifetime1Lifetime1++;
                  }
                  var12Lifetime1Lifetime1++;
                  var11Lifetime1++;
                  continue;
                }
              } else {
                eh.c(580 + (ca.field_k + 2), -this.field_W + (hf.field_t + 76), 2, 16777215);
                eh.d(ca.field_k + 580 + 2, 76 - this.field_W + hf.field_t, 3, 0);
                eh.a();
                s.field_L[2].f(var3, Math.max(this.field_G - this.field_W, 0) + 76);
                stackIn_112_0 = var7;
              }
              if (stackIn_112_0 != 0) {
                var11Lifetime1 = 0;
                var12Lifetime1Lifetime1 = a.field_a[0].field_x >> 1;
                var13Lifetime1Lifetime1 = a.field_a[0].field_A >> 1;
                var14Lifetime1Lifetime1 = 48 + var5 + var12Lifetime1Lifetime1;
                var15Lifetime1 = 48 + var6 + var13Lifetime1Lifetime1;
                var16Lifetime1 = var13Lifetime1Lifetime1 + var6 - 48;
                var17Lifetime1 = var12Lifetime1Lifetime1 - 48 + var5;
                var18 = 0;
                var19 = 0;
                if (var17Lifetime1 < 0) {
                  var18 = var17Lifetime1 * -1;
                  var17Lifetime1 = 0;
                }
                if (var16Lifetime1 < 0) {
                  var16Lifetime1 = 0;
                }
                if (var14Lifetime1Lifetime1 > (-1 + eh.field_g)) {
                  var19 = var14Lifetime1Lifetime1 + 1 - eh.field_g;
                  var14Lifetime1Lifetime1 = eh.field_g - 1;
                }
                if (var16Lifetime1 > (-1 + eh.field_c)) {
                  var16Lifetime1 = -1 + eh.field_c;
                }
                while (true) {
                  if (var16Lifetime1 >= var15Lifetime1) {
                    return;
                  }
                  var11Lifetime1 = var11Lifetime1 + var18;
                  if (var25 != 0) {
                    return;
                  }
                  var20 = var17Lifetime1;
                  while (var20 < var14Lifetime1Lifetime1) {
                    var21 = jl.field_gb[var11Lifetime1];
                    var22 = -var21 + 256;
                    var23 = eh.field_f[var20 + var16Lifetime1 * eh.field_g];
                    incrementValue$1 = var11Lifetime1;
                    var11Lifetime1++;
                    var24 = this.field_L[incrementValue$1];
                    eh.field_f[var16Lifetime1 * eh.field_g + var20] = c.a(-16711936, var22 * c.a(var23, 16711935) + var21 * c.a(var24, 16711935)) + c.a(16711680, var22 * c.a(var23, 65280) + c.a(65280, var24) * var21) >> 8;
                    var20++;
                  }
                  var11Lifetime1 = var11Lifetime1 + var19;
                  var16Lifetime1++;
                }
              }
              return;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2_ref = decompiledCaughtException;
          throw lj.a((Throwable) ((Object) var2_ref), "MinerDisturbance.WA(" + param0 + ')');
        }
    }

    private final void a(boolean param0, byte param1) {
        RuntimeException decompiledCaughtException = null;
        sb var3 = null;
        String var3_ref = null;
        RuntimeException var3_ref2 = null;
        sb var4 = null;
        int var5 = 0;
        var5 = field_ab;
        try {
          if (param0) {
            il.a(ki.field_n, (byte) -109);
          }
          if (ei.field_Q.a((byte) 127) &&
            ei.field_Q.b(-1)) {
            if (pk.field_g.a((byte) 104) &&
              pk.field_g.b(-1)) {
              if (ge.field_e.a((byte) 88) &&
                ge.field_e.b(-1)) {
                if (ig.field_c.a((byte) 108) &&
                  ig.field_c.b(-1)) {
                  if (fl.field_f.a((byte) 84) &&
                    fl.field_f.a(false, "")) {
                    if (fl.field_f.a((byte) 96) &&
                      fl.field_f.a(false, "shop")) {
                      if (0 >= pj.field_a && (!fl.field_f.a((byte) 86) ||
                        !fl.field_f.a(false, "membersexpansion"))) {
                        pa.a(true, u.a(ub.field_c, fl.field_f, ul.field_d, -7157, "membersexpansion"), 29.0f);
                        return;
                      }
                      if (ne.field_L.a((byte) 108) &&
                        ne.field_L.b(-1)) {
                        if (ob.field_q.a((byte) 86) &&
                          ob.field_q.a(false, "basic")) {
                          if (id.field_c.a((byte) 107) &&
                            id.field_c.b(-1)) {
                            pa.a(true, le.field_b, 50.0f);
                            if (!param0) {
                              return;
                            }
                            vh.a(-128);
                            this.b(false);
                            am.a(ei.field_Q, 27);
                            wf.p(4462);
                            pa.a(true, ik.field_S, 60.0f);
                            this.b(false);
                            ba.a(ei.field_Q, pk.field_g, ge.field_e, true, ig.field_c);
                            ig.field_c = null;
                            pk.field_g = null;
                            ge.field_e = null;
                            ei.field_Q = null;
                            wf.p(4462);
                            pa.a(true, qg.field_e, 75.0f);
                            this.b(false);
                            this.x(-33);
                            ob.field_q = null;
                            ne.field_L = null;
                            if (param1 > -77) {
                              this.g((byte) -103);
                            }
                            pa.a(true, s.field_T, 95.0f);
                            this.b(false);
                            var3 = new sb(id.field_c.a("volcano.csv", 0, ""));
                            var4 = new sb(id.field_c.a("supervolcano.csv", 0, ""));
                            ml.a(var4, (byte) 0, var3);
                            this.h((byte) 65);
                            an.a(-122, 50);
                            ke.field_V = false;
                            bj.a(-6358, ph.field_a);
                            oi.a(mm.field_a, ce.field_d, 97, 300);
                            ud.a(new ac(hd.field_d), 30, 30, 88);
                            ic.a(113, 4473924, 15885602, 16502531);
                            aa.a(6, new ac(vc.field_p), -1, 6, new ac(vc.field_p), 6);
                            bj.field_e.a((byte) -45);
                            qd.n(21);
                            nn.field_n = true;
                            wf.p(4462);
                            kf.a(this, 45977);
                            if (pj.field_a <= 0) {
                              vh.a(3, ib.field_c);
                              if (var5 != 0) {
                                ce.a(320);
                              }
                            } else {
                              ce.a(320);
                            }
                            this.k((byte) 101);
                            kd.a((byte) 48);
                            if (!kj.a(false)) {
                              sn.field_b[1] = gk.a(3, 1, 7, -65, 10);
                              sn.field_b[0] = gk.a(3, 1, 6, -12, 10);
                              dm.field_f = fn.a(0, 6);
                              r.field_d = gk.b(4, 1);
                            }
                            return;
                          }
                          pa.a(true, qn.a(ei.field_P, td.field_a, false, id.field_c), 40.0f);
                          return;
                        }
                        pa.a(true, u.a(ub.field_c, ob.field_q, ul.field_d, -7157, "basic"), 35.0f);
                        return;
                      }
                      pa.a(true, u.a(mb.field_a, ne.field_L, dc.field_a, -7157, ""), 30.0f);
                      return;
                    }
                    pa.a(true, u.a(ub.field_c, fl.field_f, ul.field_d, -7157, "shop"), 26.0f);
                    return;
                  }
                  pa.a(true, u.a(ub.field_c, fl.field_f, ul.field_d, -7157, ""), 20.0f);
                  return;
                }
                pa.a(true, u.a(gm.field_c, ig.field_c, w.field_X, -7157, ""), 16.0f);
                return;
              }
              if (ge.field_e.a((byte) 112)) {
                var3_ref = gm.field_c;
                if (var5 != 0) {
                  var3_ref = w.field_X;
                }
              } else {
                var3_ref = w.field_X;
              }
              pa.a(true, var3_ref, 8.0f);
              return;
            }
            pa.a(true, u.a(gm.field_c, pk.field_g, w.field_X, -7157, ""), 4.0f);
            return;
          }
          pa.a(true, u.a(ud.field_f, ei.field_Q, hm.field_M, -7157, ""), 0.0f);
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3_ref2 = decompiledCaughtException;
          throw lj.a((Throwable) ((Object) var3_ref2), "MinerDisturbance.TA(" + param0 + ',' + param1 + ')');
        }
    }

    final void h(byte param0) {
        RuntimeException decompiledCaughtException = null;
        int var2_int = 0;
        RuntimeException var2 = null;
        int var3 = 0;
        int var4 = 0;
        int var2_intLifetime1;
        var4 = field_ab;
        try {
          boolean decompiledFrameRemainder0 = true;
          this.a(0, (byte) 116);
          this.a((byte) -70, 0);
          nd.field_d.c(-29727);
          if (!ke.field_V) {
            var2_int = 0;
            while (true) {
              if (var2_int < 21) {
                qe.field_b[var2_int] = false;
                var2_int++;
                if (var4 == 0) {
                  continue;
                }
              } else {
                qe.field_b[7] = true;
                qe.field_b[0] = true;
                qe.field_b[6] = true;
              }
              break;
            }
            decompiledFrameRemainder0 = (var4 != 0);
          }
          if (decompiledFrameRemainder0) {
            cm.field_n = cm.field_n + 1;
            a.field_c = 0;
            hl.field_b = 2985;
            di.field_X = 312;
            pn.field_b = 3213;
            ac.field_b = 2439;
            qd.field_M = 4533;
            pe.field_sb = 1633100126;
            aa.field_b = 32424;
            vh.field_g = 1235;
          }
          ic.field_k = 1500;
          var2_intLifetime1 = -102 / ((param0 + 1) / 60);
          rg.field_sb = 6000;
          this.field_R = 300;
          cm.field_o = ah.field_f;
          this.field_S = 0;
          this.field_U = 0;
          this.field_E = 0;
          this.field_I = 0;
          qm.field_f = false;
          if (cm.field_o == 1) {
            rg.field_sb = rg.field_sb + rg.field_sb / 2;
          }
          jc.field_H = 0;
          ch.field_h = -1;
          cl.field_I = 0;
          pi.field_a = 0;
          eb.field_e = 0;
          me.field_h = 0;
          hn.field_c = false;
          field_J = -1;
          nm.field_g[2] = 0;
          qf.field_p = 0;
          vi.field_q = 0;
          re.field_d = 0;
          nm.field_g[5] = 0;
          eb.field_b = 0;
          nm.field_g[3] = 0;
          nm.field_g[1] = 0;
          nm.field_g[4] = 0;
          lb.field_r = 0;
          nm.field_g[0] = 0;
          var3 = 0;
          do {
            if (var3 >= 1000) {
              d.field_b = true;
              mh.field_e = je.i();
              je.d();
              je.d();
              je.d();
              je.d();
              je.d();
              je.d();
              je.d();
              je.d();
              je.d();
              je.d();
              qd.field_K = 100;
              tc.field_s = 0;
              hf.field_t = 4;
              ca.field_g = 0;
              ca.field_k = 16;
              kj.field_d = 0;
              this.field_Y = false;
              mf.field_i = 0;
              sk.field_d = 0;
              tb.field_c = 0;
              cn.field_C = 0;
              rj.field_f = 0;
              break;
            }
            uf.field_p[var3] = null;
            var3++;
          } while (var4 == 0);
          if (sc.field_b) {
            li.field_c = 0;
            db.field_d = 0;
          }
          bd.field_k = -1;
          rg.field_wb = 0;
          this.field_K = false;
          pc.field_k = 0;
          di.field_K = 1;
          pa.field_c = -1;
          q.field_b = mh.field_e;
          this.field_eb = false;
          kn.field_E = 1000;
          pl.field_h = 15;
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2 = decompiledCaughtException;
          throw lj.a((Throwable) ((Object) var2), "MinerDisturbance.JA(" + param0 + ')');
        }
    }

    final void b(byte param0) {
        boolean stackIn_5_1 = false;
        boolean stackIn_142_0 = false;
        RuntimeException decompiledCaughtException = null;
        int var2_int = 0;
        RuntimeException var2 = null;
        int var3 = 0;
        int var4 = 0;
        var4 = field_ab;
        try {
          gb.b(-6129);
          var2_int = 111 % ((param0 - 7) / 42);
          stackIn_5_1 = (kf.field_d != null);
          this.a(stackIn_5_1, 18808);
          if (oe.field_a) {
            this.j((byte) 22);
            oe.field_a = false;
          }
          if (kf.field_d != null &&
            kf.field_d.field_b) {
            ng.a((byte) -122);
            h.a(4);
          }
          if (!hl.b((byte) -61)) {
            boolean decompiledFrameRemainder1 = true;
            if (!nn.field_n) {
              this.a(true, (byte) -120);
              decompiledFrameRemainder1 = (var4 != 0);
            }
            if (decompiledFrameRemainder1) {
              if (!ah.field_i &&
                this.r(127) &&
                this.i((byte) 80) &&
                wd.field_f) {
                fl.field_f = null;
                ah.field_i = true;
              }
              c.a((byte) -98);
              sb.a(6);
              if (!od.e(false) &&
                !qi.f(-9202)) {
                if (!u.a(27443) ||
                  oc.d(75)) {
                  boolean decompiledFrameRemainder0 = true;
                  if (ge.field_c &&
                    vc.a(true)) {
                    if (tm.field_v != 4 ||
                      !oc.d(63)) {
                      ed.a(true);
                      if (var4 != 0) {
                        r.a(-14475);
                      }
                    } else {
                      r.a(-14475);
                    }
                    mh.field_f = true;
                    ge.field_c = false;
                    decompiledFrameRemainder0 = (var4 != 0);
                  }
                  if (decompiledFrameRemainder0) {
                    if (!mh.field_f) {
                      if (!oc.d(96)) {
                        on.field_u = on.field_u - 1;
                        decompiledFrameRemainder0 = !(0 <= on.field_u);
                        if (decompiledFrameRemainder0) {
                          on.field_u = 0;
                          decompiledFrameRemainder0 = (var4 != 0);
                        }
                      }
                      if (decompiledFrameRemainder0) {
                        on.field_u = on.field_u + 1;
                        if (on.field_u > 50) {
                          on.field_u = 50;
                        }
                        var3 = dl.b(-123);
                        switch (var3) {
                          case 4:
                            tm.field_v = 4;
                            jf.field_b = 4;
                            ge.field_c = true;
                            if (var4 == 0) {
                              break;
                            }
                          default:
                            this.f((byte) 7);
                            if (var4 == 0) {
                              break;
                            }
                          case 3:
                            cl.q(-94);
                            if (var4 == 0) {
                              break;
                            }
                          case 2:
                            ng.a((byte) -128);
                            break;
                        }
                        if (!oc.d(83)) {
                          hk.a((byte) -124);
                        }
                        decompiledFrameRemainder0 = (var4 != 0);
                      }
                    }
                    if (decompiledFrameRemainder0) {
                      var3 = 0;
                      L24: while (true) {
                        if (var3 < 2) {
                          sn.field_b[var3] = null;
                          var3++;
                          if (var4 == 0) {
                            continue;
                          }
                        } else {
                          if (kj.a(false)) {
                            jc.a(false, -105, jf.field_b);
                            if (var4 == 0) {
                              break L24;
                            }
                          }
                        }
                        if (oc.d(119)) {
                          cl.q(-85);
                        }
                        if (tm.field_v == 5 &&
                          ig.a(-20144)) {
                          jc.a(false, -121, 2);
                          kd.a(cm.field_o, (byte) -111);
                          if (var4 != 0) {
                            jc.a(false, -116, tm.field_v);
                          }
                        } else {
                          jc.a(false, -116, tm.field_v);
                        }
                        if (a.field_c > 0) {
                          this.a(3, a.field_c);
                        }
                        if (pj.field_a > 0) {
                          ce.a(320);
                        }
                        this.k((byte) 121);
                        break;
                      }
                      mh.field_f = false;
                    }
                  }
                  this.f((byte) 7);
                  decompiledFrameRemainder1 = (var4 != 0);
                }
                if (decompiledFrameRemainder1) {
                  stackIn_142_0 = (kf.field_d != null);
                  var3 = gd.a(stackIn_142_0, -61, (ob) (this));
                  boolean decompiledSharedTail0 = (var3 != 2364824);
                  if (!decompiledSharedTail0) {
                    le.b(8952);
                    decompiledSharedTail0 = (var4 != 0);
                  }
                  if ((decompiledSharedTail0) && (1 == var3 ||
                    var3 == 2)) {
                    if (kf.field_d != null) {
                      kf.field_d.a(false, qa.field_a);
                      kf.field_d = null;
                    }
                    if (2 == var3) {
                      uf.a(13, bm.c(-101));
                    }
                  }
                }
              }
            }
            while (true) {
              if (im.a(ge.field_g, 0)) {
                this.n(22);
                if (var4 == 0) {
                  continue;
                }
              } else {
                bk.a((byte) -69, 0);
              }
              break;
            }
            if (!ci.a(105)) {
              return;
            }
            var3 = this.c((byte) -119);
            if (var3 == 2) {
              eb.a((byte) -106);
            }
            if (var4 == 0) {
              return;
            }
          }
          this.k(10);
          if (bi.a(-11) &&
            !nn.field_n) {
            this.a(false, (byte) -101);
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2 = decompiledCaughtException;
          throw lj.a((Throwable) ((Object) var2), "MinerDisturbance.HA(" + param0 + ')');
        }
    }

    private final void l(byte param0) {
        int stackIn_54_0 = 0;
        int stackIn_54_1 = 0;
        boolean stackIn_61_1 = false;
        boolean stackIn_94_0 = false;
        boolean stackIn_205_0 = false;
        boolean stackIn_213_0 = false;
        boolean stackIn_221_0 = false;
        boolean stackIn_229_0 = false;
        boolean stackIn_240_0 = false;
        int stackIn_402_0 = 0;
        boolean stackIn_488_1 = false;
        RuntimeException decompiledCaughtException = null;
        int var2_int = 0;
        RuntimeException var2 = null;
        int var3 = 0;
        int var4 = 0;
        int var5 = 0;
        int var6 = 0;
        int var7 = 0;
        int var8 = 0;
        int var9 = 0;
        int var10 = 0;
        int var6Lifetime1;
        int var6Lifetime1Lifetime1;
        int var6Lifetime1Lifetime2;
        int var6Lifetime1Lifetime3;
        int var6Lifetime1Lifetime4;
        int var6Lifetime1Lifetime5;
        var10 = field_ab;
        try {
          var2_int = -1;
          if (param0 > -106) {
            return;
          }
          var3 = 4;
          var4 = 6;
          var5 = 0;
          var6 = 0;
          L1: while (true) {
            if (21 > var6) {
              stackIn_54_0 = 0;
              stackIn_54_1 = var6;
              if (var10 == 0) {
                if ((stackIn_54_0 != stackIn_54_1 ||
                  !qe.field_b[1]) && (2 != var6 ||
                  !qe.field_b[19]) && qe.field_b[var6]) {
                  if (hc.a(110, var4, 34, var3, nk.field_w, 33, gb.field_e)) {
                    var2_int = var6;
                  }
                  var5++;
                  if (var5 > 8) {
                    var3 = 4;
                    var5 = 0;
                    var4 += 33;
                  } else {
                    var3 += 33;
                  }
                }
                var6++;
                continue;
              }
            } else {
              if (!qe.field_b[14]) {
                break L1;
              }
              if (jk.field_ab == 0) {
                if (hc.a(19, 65, 10, 572, nk.field_w, 48, gb.field_e)) {
                  var2_int = -2;
                  if (var10 == 0) {
                    break L1;
                  }
                }
                if (!hc.a(119, 75, this.field_G - this.field_W, 576, nk.field_w, 44, gb.field_e)) {
                  break L1;
                }
                var2_int = -3;
                if (var10 == 0) {
                  break L1;
                }
              }
              stackIn_54_0 = 119;
              stackIn_54_1 = 65;
            }
            if (hc.a(stackIn_54_0, stackIn_54_1, 10, 572, wi.field_w, 48, m.field_e)) {
              stackIn_61_1 = !(this.field_eb);
              this.field_eb = stackIn_61_1;
            }
            break;
          }
          boolean decompiledFrameRemainder0 = true;
          lm.a(var2_int, 98);
          ag.field_c = qd.field_O[83];
          if (!ke.field_V &&
            il.e(-31391)) {
            if (this.field_C != nk.field_w ||
              ~this.field_bb != ~gb.field_e) {
              this.field_O = false;
            }
            boolean decompiledFrameRemainder1 = true;
            this.field_C = nk.field_w;
            this.field_bb = gb.field_e;
            if ((this.field_O ||
              !(nk.field_w > 398) ||
              !(nk.field_w < 623) ||
              !(gb.field_e > 429) ||
              !(gb.field_e < 449)) && !this.field_O) {
              stackIn_94_0 = false;
              decompiledFrameRemainder1 = false;
            }
            else {
              stackIn_94_0 = true;
            }
            of.field_a = stackIn_94_0;
            if (jk.field_ab != 0) {
              this.field_O = false;
              this.q(-46);
              bj.a(-6358, ph.field_a);
              fm.f((byte) 81);
              if (!kj.a(false)) {
                if (ig.a(-20144)) {
                  jc.a(true, -126, 5);
                  decompiledFrameRemainder0 = (var10 != 0);
                }
                if (decompiledFrameRemainder0) {
                  jc.a(true, -121, 2);
                  kd.a(cm.field_o, (byte) -104);
                  if (var10 != 0) {
                    if (ha.field_b <= 0) {
                      jc.a(true, -116, 4);
                      jc.a(true, -105, 6);
                    } else {
                      jc.a(true, -105, 6);
                    }
                  }
                }
              } else {
                if (ha.field_b <= 0) {
                  jc.a(true, -116, 4);
                  if (var10 != 0) {
                    jc.a(true, -105, 6);
                  }
                } else {
                  jc.a(true, -105, 6);
                }
              }
            }
          }
          while (mm.b((byte) 84)) {
            var6Lifetime1 = (lj.field_t + (rg.field_sb + (m.field_e + nk.field_w))) % 8;
            if (var10 != 0) {
              return;
            }
            if (0 == var6Lifetime1) {
              ac.field_b = ac.field_b - 1;
              di.field_X = di.field_X + qd.field_M;
            } else if (var6Lifetime1 != 1) {
              if (var6Lifetime1 == 2) {
                di.field_X = di.field_X - qd.field_M;
                ac.field_b = ac.field_b + 1;
              } else if (3 == var6Lifetime1) {
                qd.field_M = qd.field_M + 1;
                di.field_X = di.field_X - ac.field_b;
              } else if (4 == var6Lifetime1) {
                ac.field_b = ac.field_b + 1;
                vh.field_g = vh.field_g + qd.field_M;
              } else if (var6Lifetime1 == 5) {
                qd.field_M = qd.field_M + 1;
                vh.field_g = vh.field_g + ac.field_b;
              } else if (var6Lifetime1 != 6) {
                if (var6Lifetime1 == 7) {
                  vh.field_g = vh.field_g - ac.field_b;
                  qd.field_M = qd.field_M - 1;
                }
              } else {
                vh.field_g = vh.field_g - qd.field_M;
                ac.field_b = ac.field_b - 1;
              }
            } else {
              qd.field_M = qd.field_M - 1;
              di.field_X = di.field_X + ac.field_b;
            }
            var6Lifetime1Lifetime1 = (nk.field_w + m.field_e + (rg.field_sb + lj.field_t)) % 4;
            if (var6Lifetime1Lifetime1 == 0) {
              hl.field_b = hl.field_b + 1;
              pn.field_b = pn.field_b + aa.field_b;
            } else if (var6Lifetime1Lifetime1 == 1) {
              pn.field_b = pn.field_b - aa.field_b;
              hl.field_b = hl.field_b - 1;
            } else if (var6Lifetime1Lifetime1 != 2) {
              if (var6Lifetime1Lifetime1 == 3) {
                aa.field_b = aa.field_b - 1;
                pn.field_b = pn.field_b - hl.field_b;
              }
            } else {
              aa.field_b = aa.field_b + 1;
              pn.field_b = pn.field_b + hl.field_b;
            }
            if (wj.field_j >= 2 &&
              ee.e((byte) 75) &&
              var10 == 0) {
              continue;
            }
            boolean decompiledFrameRemainder3 = true;
            if (wj.field_j >= 2 &&
              ud.field_c > 0) {
              od.field_i = od.field_i.substring(1) + ud.field_c;
              if (od.field_i.equalsIgnoreCase("megaslg")) {
                stackIn_205_0 = !(an.field_d);
                an.field_d = stackIn_205_0;
                qm.field_f = true;
              }
              if (od.field_i.equalsIgnoreCase("watrbmb")) {
                stackIn_213_0 = !(dg.field_b);
                dg.field_b = stackIn_213_0;
                qm.field_f = true;
              }
              if (od.field_i.equalsIgnoreCase("fartbmb")) {
                stackIn_221_0 = !(rj.field_b);
                rj.field_b = stackIn_221_0;
                qm.field_f = true;
              }
              if (od.field_i.equalsIgnoreCase("oilybmb")) {
                stackIn_229_0 = !(nk.field_p);
                nk.field_p = stackIn_229_0;
                qm.field_f = true;
              }
              if (od.field_i.equalsIgnoreCase("lavafld")) {
                qm.field_f = true;
                je.field_u = je.field_N[cm.field_o];
                je.k();
              }
              if (od.field_i.equalsIgnoreCase("prtyhrd")) {
                stackIn_240_0 = !(ba.field_M);
                ba.field_M = stackIn_240_0;
              }
              if (od.field_i.equalsIgnoreCase("hamyths")) {
                qm.field_f = true;
                uf.field_p[jf.b((byte) 123)] = new gf(16, 4, 9);
              }
              if (od.field_i.equalsIgnoreCase("owalrus")) {
                qm.field_f = true;
                uf.field_p[jf.b((byte) 92)] = new gf(16, 4, 19);
              }
              if (od.field_i.equalsIgnoreCase("bigloot")) {
                qm.field_f = true;
                uf.field_p[jf.b((byte) 66)] = new gf(16, 4, 12);
              }
              if (od.field_i.equalsIgnoreCase("imgreat")) {
                qm.field_f = true;
                var6Lifetime1Lifetime2 = a.field_c;
                if (0 == a.field_c) {
                  a.field_c = a.field_c + 999;
                } else if (a.field_c < 1000) {
                  a.field_c = 4999;
                } else if (a.field_c >= 5000) {
                  if (a.field_c >= 25000) {
                    if (a.field_c < 50000) {
                      a.field_c = 99999;
                    } else if (a.field_c >= 100000) {
                      if (a.field_c < 200000) {
                        a.field_c = 499999;
                      } else if (a.field_c >= 500000) {
                        if (!(a.field_c >= 1000000)) {
                          a.field_c = 6000000;
                        }
                      } else {
                        a.field_c = 999999;
                      }
                    } else {
                      a.field_c = 199999;
                    }
                  } else {
                    a.field_c = 49999;
                  }
                } else {
                  a.field_c = 24999;
                }
                var7 = -var6Lifetime1Lifetime2 + a.field_c;
                var8 = rg.field_sb % 3;
                if (var8 != 0) {
                  if (var8 != 1) {
                    var9 = var7 / 3;
                    vh.field_g = vh.field_g - (-var9 + var7);
                    di.field_X = di.field_X + var9;
                  } else {
                    vh.field_g = vh.field_g - var7;
                  }
                  decompiledFrameRemainder3 = false;
                }
                else {
                  di.field_X = di.field_X + var7;
                }
              }
            }
            if (lj.field_t == 13 &&
              ke.field_V &&
              15 == pl.field_h && (!this.field_K ||
              ak.a(-120))) {
              fm.f((byte) 81);
              df.a(0, 5494, -1);
              ne.a(1, -90);
              al.e(107);
              this.field_K = true;
            }
            boolean decompiledFrameRemainder2 = true;
            if (!ke.field_V &&
              il.e(-31391)) {
              if (lj.field_t == 98 ||
                99 == lj.field_t) {
                this.field_O = true;
                of.field_a = true;
              }
              if (lj.field_t == 84) {
                this.q(-46);
                bj.a(-6358, ph.field_a);
                fm.f((byte) 81);
                if (!kj.a(false)) {
                  jc.a(false, -107, 2);
                  kd.a(cm.field_o, (byte) -106);
                  if (!(!ig.a(-20144))) {
                    jc.a(false, -114, 5);
                  }
                  decompiledFrameRemainder2 = false;
                }
                else {
                  jc.a(false, -120, 6);
                }
              }
            }
            if (d.field_b &&
              lj.field_t == 82 &&
              0 >= gi.field_c && (qe.field_b[1] ||
              qe.field_b[0]) && ke.field_V) {
              gi.field_c = 25;
              if (sc.field_b) {
                ag.a(true, 10, 32 * hf.field_t, ca.field_k * 32);
              }
              if (qe.field_b[1]) {
                var6Lifetime1Lifetime3 = jf.b((byte) 110);
                uf.field_p[var6Lifetime1Lifetime3] = new gf(ca.field_k, hf.field_t, 7);
                cc.a(var6Lifetime1Lifetime3, 136989569);
              } else {
                var6Lifetime1Lifetime3 = jf.b((byte) 101);
                uf.field_p[var6Lifetime1Lifetime3] = new gf(ca.field_k, hf.field_t, 6);
                fn.b(var6Lifetime1Lifetime3, 100);
              }
            }
            if (d.field_b &&
              lj.field_t == 86 &&
              gi.field_c <= 0 &&
              qe.field_b[17] &&
              ke.field_V) {
              gi.field_c = 25;
              if (sc.field_b) {
                ag.a(true, 26, 32 * hf.field_t, ca.field_k * 32);
              }
              var6Lifetime1Lifetime4 = jf.b((byte) 88);
              uf.field_p[var6Lifetime1Lifetime4] = new gf(ca.field_k, hf.field_t, 20);
              cc.a(var6Lifetime1Lifetime4, 136989569);
            }
            stackIn_402_0 = (rj.field_f > 1) ? 0 : 1;
            var6Lifetime1Lifetime5 = stackIn_402_0;
            if (d.field_b &&
              lj.field_t == 81 &&
              var6Lifetime1Lifetime5 != 0 &&
              qe.field_b[8] &&
              ke.field_V) {
              if (!je.c(ca.field_k, hf.field_t, 3, 3)) {
                rj.field_f = 9;
              } else {
                rj.field_f = 11;
              }
              kj.field_d = 0;
            }
            if (2 <= wj.field_j) {
              if (d.field_b &&
                86 == lj.field_t &&
                gi.field_c <= 0 &&
                ke.field_V) {
                gi.field_c = 25;
                if (dg.field_b) {
                  ne.a(17, -126);
                  uf.field_p[jf.b((byte) 78)] = new gf(ca.field_k, hf.field_t, 15);
                }
              }
              if (d.field_b &&
                lj.field_t == 80 &&
                gi.field_c <= 0 &&
                ke.field_V) {
                gi.field_c = 25;
                if (rj.field_b) {
                  ne.a(17, 115);
                  uf.field_p[jf.b((byte) 49)] = new gf(ca.field_k, hf.field_t, 18);
                }
              }
              if (d.field_b &&
                1 == lj.field_t &&
                gi.field_c <= 0 &&
                ke.field_V) {
                gi.field_c = 25;
                if (nk.field_p) {
                  ne.a(17, 93);
                  uf.field_p[jf.b((byte) 52)] = new gf(ca.field_k, hf.field_t, 22);
                }
              }
              if (~ni.field_a == ~lj.field_t) {
                qm.field_f = true;
                hf.field_t = hf.field_t + 4;
                mh.field_e[ca.field_k][hf.field_t].field_a = false;
              }
              if (~lj.field_t == ~pm.field_a) {
                qm.field_f = true;
                hf.field_t = hf.field_t - 4;
                mh.field_e[ca.field_k][hf.field_t].field_a = false;
              }
              if (39 == lj.field_t) {
                stackIn_488_1 = !(this.field_V);
                this.field_V = stackIn_488_1;
              }
              if (lj.field_t == 71 &&
                il.e(-31391)) {
                this.field_T = this.field_T - 1;
                if (0 > this.field_T) {
                  this.field_T = sl.field_u[pl.field_h].length - 1;
                }
              }
              if (lj.field_t == 72 &&
                il.e(-31391)) {
                this.field_T = this.field_T + 1;
                if ((sl.field_u[pl.field_h].length - 1) <= this.field_T) {
                  this.field_T = 0;
                }
              }
            }
            if (lj.field_t == 84) {
              this.field_K = hk.a(27);
              if (!ke.field_V &&
                fl.field_d &&
                il.e(-31391)) {
                this.field_O = false;
                this.q(-46);
                bj.a(-6358, ph.field_a);
                fm.f((byte) 81);
                if (kj.a(false)) {
                  jc.a(false, -125, 6);
                } else {
                  jc.a(false, -107, 2);
                  kd.a(cm.field_o, (byte) -124);
                  if (ig.a(-20144)) {
                    jc.a(false, -123, 5);
                  }
                }
              }
            }
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2 = decompiledCaughtException;
          throw lj.a((Throwable) ((Object) var2), "MinerDisturbance.AA(" + param0 + ')');
        }
    }

    private final void g(byte param0) {
        int stackIn_47_0 = 0;
        int stackIn_47_1 = 0;
        int stackIn_128_0 = 0;
        RuntimeException decompiledCaughtException = null;
        int var2_int = 0;
        RuntimeException var2 = null;
        int var3_int = 0;
        ea var3 = null;
        String var4_ref_String = null;
        int var4 = 0;
        int var5 = 0;
        int var6 = 0;
        int var7_int = 0;
        int[] var7 = null;
        int var8 = 0;
        int var9 = 0;
        int var10 = 0;
        int stackIn_47_0Lifetime1;
        int stackIn_47_1Lifetime1;
        int var6Lifetime1;
        int var8Lifetime1;
        int var9Lifetime1;
        var10 = field_ab;
        try {
          if (param0 >= -55) {
            return;
          }
          if (kd.field_i) {
            return;
          }
          if (this.field_R > 0) {
            if (this.field_R <= 100) {
              var2_int = this.field_R - 40;
              if (var10 != 0) {
                if (this.field_R <= 240) {
                  var2_int = 60;
                  var2_int = -this.field_R + 300;
                } else {
                  var2_int = -this.field_R + 300;
                }
              }
            } else {
              if (this.field_R <= 240) {
                var2_int = 60;
                if (var10 != 0) {
                  var2_int = -this.field_R + 300;
                }
              } else {
                var2_int = -this.field_R + 300;
              }
            }
            var3_int = var2_int;
            if (cm.field_o == 0) {
              var4_ref_String = nm.field_c;
              if (var10 != 0) {
                var4_ref_String = wf.field_V;
              }
            } else {
              var4_ref_String = wf.field_V;
            }
            var5 = 320;
            var6 = 1;
            mm.field_a.b(var4_ref_String, var5 - 2, var3_int + pk.field_b.field_I, var6, -1);
            var7_int = 16502531;
            mm.field_a.b(var4_ref_String, 2 + var5, var3_int + pk.field_b.field_I, var6, -1);
            mm.field_a.b(var4_ref_String, var5, -2 + (pk.field_b.field_I + var3_int), var6, -1);
            mm.field_a.b(var4_ref_String, var5, 2 + (var3_int + pk.field_b.field_I), var6, -1);
            mm.field_a.b(var4_ref_String, -1 + var5, var3_int + (pk.field_b.field_I - 1), var6, -1);
            mm.field_a.b(var4_ref_String, var5 + 1, pk.field_b.field_I + var3_int - 1, var6, -1);
            mm.field_a.b(var4_ref_String, var5 - 1, 1 + var3_int + pk.field_b.field_I, var6, -1);
            mm.field_a.b(var4_ref_String, var5 + 1, 1 + (pk.field_b.field_I + var3_int), var6, -1);
            mm.field_a.b(var4_ref_String, var5, pk.field_b.field_I + var3_int, var7_int, -1);
          }
          ck.field_a.g(15, 369);
          eh.a(19, 373, 69, 463);
          var2_int = -this.field_H + (373 - (-90 - ma.field_O.field_A));
          var3_int = -this.field_H + 373;
          do {
            if (var2_int <= var3_int) {
              eh.a();
              break;
            }
            ma.field_O.g(19, var3_int);
            var3_int = var3_int + ma.field_O.field_A;
          } while (var10 == 0);
          boolean decompiledFrameRemainder0 = true;
          boolean decompiledFrameCompleted0 = true;
          if (this.field_S >= 1) {
            eh.d(this.field_F, 453, this.field_D[this.field_I] + 44, 452 - this.field_cb, 1);
            var3_int = this.field_I - 1;
            if (var3_int < 0) {
              var3_int = -1 + this.field_D.length;
            }
            var4 = 1;
            L13: while (true) {
              boolean decompiledFrameRemainder1 = true;
              if (var4 < this.field_S) {
                var5 = 1 + var3_int;
                stackIn_47_0 = ~this.field_D.length;
                stackIn_47_1 = ~var5;
                if (var10 != 0) {
                  if (stackIn_47_0 < stackIn_47_1) {
                    eh.g(19, var5, 50, 1, var4);
                    var4 -= 20;
                    var5++;
                    break L13;
                  }
                  decompiledFrameRemainder1 = false;
                }
                else {
                  if (stackIn_47_0 == stackIn_47_1) {
                    var5 = 0;
                  }
                  eh.d(this.field_D[var5] + 44, 453 + (-(1 * var4) - this.field_cb), this.field_D[var3_int] + 44, -(1 * (1 + var4)) - this.field_cb + 453, 1);
                  if (0 >= var3_int) {
                    var3_int = this.field_D.length - 1;
                  } else {
                    var3_int--;
                  }
                  var4++;
                  continue;
                }
              }
              if (decompiledFrameRemainder1) {
                var4 = 180;
                var5 = 373;
                while (true) {
                  stackIn_47_0Lifetime1 = var5;
                  stackIn_47_1Lifetime1 = 382;
                  if (stackIn_47_0Lifetime1 >= stackIn_47_1Lifetime1) {
                    break;
                  }
                  eh.g(19, var5, 50, 1, var4);
                  var4 -= 20;
                  var5++;
                  if (var10 != 0) {
                    break L13;
                  }
                }
              }
              var4 = 0;
              break;
            }
            var5 = 454;
            do {
              if (var5 >= 463) {
                ol.field_a.f(this.field_D[this.field_I] + (-(ol.field_a.field_x >> 1) + 44), -(ol.field_a.field_A >> 1) + 453);
                break;
              }
              eh.g(19, var5, 50, 1, var4);
              var4 += 20;
              var5++;
            } while (var10 == 0);
            decompiledFrameRemainder0 = (var10 != 0);
          }
          if (decompiledFrameRemainder0) {
            var3_int = 180;
            var4 = 373;
            while (true) {
              if (382 > var4) {
                eh.g(19, var4, 50, 1, var3_int);
                var3_int -= 20;
                var4++;
                if (var10 == 0) {
                  continue;
                }
              } else {
                var3_int = 0;
              }
              break;
            }
            var4 = 454;
            while (var4 < 463) {
              eh.g(19, var4, 50, 1, var3_int);
              var3_int += 20;
              var4++;
              if (var10 != 0) {
                decompiledFrameCompleted0 = false;
                break;
              }
            }
            if (decompiledFrameCompleted0) {
              ol.field_a.f(44 - (ol.field_a.field_x >> 1), -(ol.field_a.field_A >> 1) + 453);
            }
          }
          if (qe.field_b[14] &&
            d.field_b) {
            this.e(true);
          }
          om.a((byte) -112);
          mc.field_u.f(0, 0);
          fh.field_e.f(7, 0);
          mh.field_d.f(628, 0);
          ei.field_M.f(7, 472);
          var3 = pi.field_b;
          var3.f(-var3.field_x + 640, 0);
          mm.field_a.c(Integer.toString(a.field_c), 627, 32, 16777215, -1);
          var4 = 2;
          var5 = 0;
          var6Lifetime1 = 0;
          var7 = new int[4];
          var8 = 0;
          boolean decompiledNaturalLoopExit0 = false;
          while (!(decompiledNaturalLoopExit0 = (var8 >= 21))) {
            stackIn_128_0 = var8;
            if (var10 == 0) {
              if ((stackIn_128_0 != 0 ||
                !qe.field_b[1]) &&
                (2 != var8 ||
                !qe.field_b[19]) &&
                qe.field_b[var8]) {
                ff.field_c[var8].f(var4, var5);
                if (var8 == pa.field_c) {
                  eh.b(var7);
                  eh.f(var4, var5 + 6, 33 + var4, var5 + 32);
                  var9 = 65 + (int)(Math.sin(0.03 * (double)bf.field_d) * 130.0 + 0.5);
                  if (var9 > 0) {
                    ff.field_c[var8].g(var4, var5, var9);
                  } else {
                    ff.field_c[var8].c(var4, var5, var9 + 256);
                  }
                  eh.a(var7);
                }
                if (var8 == 20) {
                  eh.b(var7);
                  var9Lifetime1 = 32 - qd.field_K * 32 / 100;
                  eh.f(var4, var5 + 6, 33 + var4, var9Lifetime1 + (var5 + 6));
                  ff.field_c[var8].c(var4, var5, 64);
                  eh.a(var7);
                }
                var6Lifetime1++;
                var4 += 33;
                if (var6Lifetime1 > 8) {
                  ff.field_c[21].f(var4, var5);
                  var5 += 33;
                  var4 = 4;
                  var6Lifetime1 = 0;
                  eh.a(0, 39, 640, 480);
                  eh.b(var7);
                }
              }
              var8++;
              continue;
            }
            break;
          }
          if (decompiledNaturalLoopExit0) {
            stackIn_128_0 = 0;
          }
          if (stackIn_128_0 != var5) {
            eh.a(0, 45, 640, 480);
          }
          ff.field_c[21].f(var4, var5);
          eh.a();
          var8Lifetime1 = pb.b(false);
          if (var8Lifetime1 == 6) {
            bb.a(lb.field_t, 0, ce.field_d, 16513123, -6);
            if (var10 == 0) {
              return;
            }
          }
          if (var8Lifetime1 == 0) {
            bb.a(lj.field_v, 0, ce.field_d, 16513123, -6);
            if (var10 == 0) {
              return;
            }
          }
          if (var8Lifetime1 == 1) {
            bb.a(el.field_a, 0, ce.field_d, 16513123, -6);
            if (var10 == 0) {
              return;
            }
          }
          if (var8Lifetime1 != 2) {
            if (3 == var8Lifetime1) {
              bb.a(mg.field_b, 0, ce.field_d, 16513123, -6);
              if (var10 == 0) {
                return;
              }
            }
            if (var8Lifetime1 == 7) {
              bb.a(bd.field_i, 0, ce.field_d, 16513123, -6);
              if (var10 == 0) {
                return;
              }
            }
            if (var8Lifetime1 == 9) {
              bb.a(oc.field_h, 0, ce.field_d, 16513123, -6);
              if (var10 == 0) {
                return;
              }
            }
            if (var8Lifetime1 == 11) {
              bb.a(fg.field_e, 0, ce.field_d, 16513123, -6);
              if (var10 == 0) {
                return;
              }
            }
            if (8 == var8Lifetime1) {
              bb.a(hn.field_a, 0, ce.field_d, 16513123, -6);
              if (var10 == 0) {
                return;
              }
            }
            if (var8Lifetime1 == 4) {
              bb.a(ei.field_K, 0, ce.field_d, 16513123, -6);
              if (var10 == 0) {
                return;
              }
            }
            if (var8Lifetime1 != 10) {
              if (5 == var8Lifetime1) {
                bb.a(el.field_b, 0, ce.field_d, 16513123, -6);
                if (var10 == 0) {
                  return;
                }
              }
              if (14 == var8Lifetime1) {
                bb.a(j.field_e, 0, ce.field_d, 16513123, -6);
                if (var10 == 0) {
                  return;
                }
              }
              if (12 != var8Lifetime1) {
                if (13 == var8Lifetime1) {
                  bb.a(gd.field_z, 0, ce.field_d, 16513123, -6);
                  if (var10 == 0) {
                    return;
                  }
                }
                if (var8Lifetime1 == -2) {
                  bb.a(kb.field_d, 0, ce.field_d, 16513123, -6);
                  if (var10 == 0) {
                    return;
                  }
                }
                if (var8Lifetime1 == -3) {
                  bb.a(fd.field_W, 0, ce.field_d, 16513123, -6);
                  if (var10 == 0) {
                    return;
                  }
                }
                if (var8Lifetime1 == 19) {
                  bb.a(tj.field_c, 0, ce.field_d, 16513123, -6);
                  if (var10 == 0) {
                    return;
                  }
                }
                if (var8Lifetime1 != 15) {
                  if (17 != var8Lifetime1) {
                    if (var8Lifetime1 == 16) {
                      bb.a(g.field_e, 0, ce.field_d, 16513123, -6);
                      if (var10 == 0) {
                        return;
                      }
                    }
                    if (18 == var8Lifetime1) {
                      bb.a(om.field_d, 0, ce.field_d, 16513123, -6);
                      if (var10 == 0) {
                        return;
                      }
                    }
                    if (20 != var8Lifetime1) {
                      return;
                    }
                    bb.a(ti.field_P, 0, ce.field_d, 16513123, -6);
                    if (var10 == 0) {
                      return;
                    }
                  }
                  bb.a(tj.field_a, 0, ce.field_d, 16513123, -6);
                  if (var10 == 0) {
                    return;
                  }
                }
                bb.a(th.field_a, 0, ce.field_d, 16513123, -6);
                if (var10 == 0) {
                  return;
                }
              }
              bb.a(gi.field_b, 0, ce.field_d, 16513123, -6);
              if (var10 == 0) {
                return;
              }
            }
            bb.a(tb.field_g, 0, ce.field_d, 16513123, -6);
            if (var10 == 0) {
              return;
            }
          }
          bb.a(hf.field_p, 0, ce.field_d, 16513123, -6);
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2 = decompiledCaughtException;
          throw lj.a((Throwable) ((Object) var2), "MinerDisturbance.DB(" + param0 + ')');
        }
    }

    private final void e(byte param0) {
        if (param0 > -104) {
          return;
        }
        try {
          ke.field_V = false;
          mg.a((byte) -113);
          this.field_T = ll.a((byte) -73, sl.field_u[pl.field_h].length);
        } catch (RuntimeException runtimeException) {
          throw lj.a((Throwable) ((Object) runtimeException), "MinerDisturbance.CA(" + param0 + ')');
        }
    }

    public MinerDisturbance() {
        this.field_U = 0;
        this.field_Y = false;
        this.field_I = 0;
        this.field_E = 0;
        this.field_X = this.field_K;
        this.field_H = 0;
        this.field_M = 1;
        this.field_D = new int[80];
        this.field_O = false;
        this.field_F = 44;
        this.field_L = new int[9216];
    }

    static {
        field_J = 0;
    }
}
