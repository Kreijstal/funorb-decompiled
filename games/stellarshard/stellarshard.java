/*
 * Decompiled by CFR-JS 0.4.0.
 */
public final class stellarshard extends rb implements cf {
    private int field_M;
    private int field_O;
    private pi field_H;
    private int[] field_P;
    static int field_T;
    private int[] field_N;
    private int field_R;
    private int field_J;
    static th field_E;
    private pb field_F;
    private int[] field_S;
    static int[] field_U;
    private pb field_G;
    private int field_I;
    private int field_Q;
    static String[] field_L;
    static boolean field_K;
    public static int field_B;

    public static void r(int param0) {
        field_U = null;
        if (param0 != 50) {
          return;
        }
        try {
          field_L = null;
          field_E = null;
        } catch (RuntimeException runtimeException) {
          throw ma.a((Throwable) ((Object) runtimeException), "stellarshard.DB(" + param0 + ')');
        }
    }

    public final int a(int param0, int param1) {
        RuntimeException var3 = null;
        int stackIn_4_0 = 0;
        RuntimeException decompiledCaughtException = null;
        try {
          if (param0 != 16711680) {
            this.p(2);
          }
          stackIn_4_0 = 16711680;
          return stackIn_4_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3 = decompiledCaughtException;
          throw ma.a((Throwable) ((Object) var3), "stellarshard.D(" + param0 + ',' + param1 + ')');
        }
    }

    public final int[] a(boolean param0, int param1, float param2) {
        RuntimeException var4 = null;
        int[] stackIn_2_0 = null;
        int[] stackIn_4_0 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          if (param0) {
            stackIn_4_0 = mf.field_a[param1].field_z;
            return stackIn_4_0;
          }
          stackIn_2_0 = (int[]) null;
          return stackIn_2_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var4 = decompiledCaughtException;
          throw ma.a((Throwable) ((Object) var4), "stellarshard.B(" + param0 + ',' + param1 + ',' + param2 + ')');
        }
    }

    public final boolean b(int param0, int param1) {
        RuntimeException var3 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          if (param1 != 7152) {
            this.field_H = (pi) null;
          }
          return false;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3 = decompiledCaughtException;
          throw ma.a((Throwable) ((Object) var3), "stellarshard.A(" + param0 + ',' + param1 + ')');
        }
    }

    private final void k(byte param0) {
        int var2_int = 0;
        boolean stackIn_20_0 = false;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var2 = null;
        try {
          if (0 == te.field_c &&
            0 == tl.field_a &&
            tf.field_a.a(0)) {
            oa.field_D = true;
          }
          boolean decompiledSharedTail0 = !(!ah.a(-1));
          if (!decompiledSharedTail0) {
            this.c(127, te.field_c);
            oc.field_d = false;
            cl.field_a = cl.field_a + te.field_c;
            if (tl.field_a > 0) {
              oc.field_d = true;
            }
            stackIn_20_0 = !(mk.field_k <= 0);
            oa.field_D = stackIn_20_0;
            te.field_c = 0;
            decompiledSharedTail0 = (field_B != 0);
          }
          if (decompiledSharedTail0) {
            na.field_j = new ij(this);
            if (!(te.field_c <= 0) ||
              !(0 >= tl.field_a) ||
              !tf.field_a.a(0)) {
              tl.field_c = 5;
            }
          }
          s.field_i = false;
          ll.a(16);
          nc.field_H = 0;
          var2_int = -73 % ((param0 - 31) / 34);
          if (fe.field_e) {
            ll.field_c.a(sb.field_e[19], 100, pk.field_h * 2);
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2 = decompiledCaughtException;
          throw ma.a((Throwable) ((Object) var2), "stellarshard.BB(" + param0 + ')');
        }
    }

    private final void q(int param0) {
        RuntimeException decompiledCaughtException = null;
        int var2_int = 0;
        RuntimeException var2 = null;
        try {
          if (pk.a(-12663, 0) &&
            0.004 > Math.random()) {
            var2_int = (int)(9.0 * Math.random()) + 42;
            if (fe.field_e) {
              ll.field_c.a(sb.field_e[var2_int], 50 + (int)(Math.random() * 50.0), 2 * pk.field_h);
            }
          }
          if (param0 != 50) {
            field_E = (th) null;
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2 = decompiledCaughtException;
          throw ma.a((Throwable) ((Object) var2), "stellarshard.VA(" + param0 + ')');
        }
    }

    public final boolean a(int param0, byte param1) {
        RuntimeException var3 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          if (param1 < 65) {
            this.a(false, (byte) 48);
          }
          return true;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3 = decompiledCaughtException;
          throw ma.a((Throwable) ((Object) var3), "stellarshard.E(" + param0 + ',' + param1 + ')');
        }
    }

    private final void p(int param0) {
        RuntimeException runtimeException = null;
        double var2_double = 0.0;
        double var4 = 0.0;
        double var6 = 0.0;
        double var8 = 0.0;
        double var10 = 0.0;
        double var12 = 0.0;
        double var14 = 0.0;
        double var16 = 0.0;
        double var18 = 0.0;
        int var20 = 0;
        int[] var21 = null;
        int[] var22 = null;
        int var23 = 0;
        int var24 = 0;
        int var25 = 0;
        int var26 = 0;
        int var27 = 0;
        double var28_double = 0.0;
        int var28 = 0;
        int var29 = 0;
        double var30_double = 0.0;
        int var30 = 0;
        int var31 = 0;
        double var32_double = 0.0;
        int var32 = 0;
        double var34 = 0.0;
        double var36 = 0.0;
        double var38 = 0.0;
        double var40 = 0.0;
        int var42 = 0;
        int stackIn_6_0 = 0;
        int stackIn_16_0 = 0;
        int stackIn_16_1 = 0;
        RuntimeException decompiledCaughtException = null;
        int var27Lifetime1;
        int var30Lifetime1;
        int var31Lifetime1;
        int var32Lifetime1;
        var42 = field_B;
        try {
          cc.a();
          this.field_H.a(sk.field_a, 8);
          var2_double = sk.field_a[3];
          var4 = sk.field_a[4];
          if (param0 <= 15) {
            field_T = -66;
          }
          var6 = sk.field_a[5];
          var8 = sk.field_a[6];
          var10 = sk.field_a[7];
          var12 = sk.field_a[8];
          var14 = sk.field_a[9];
          var16 = sk.field_a[10];
          var18 = sk.field_a[11];
          var20 = 0;
          L1: while (true) {
            stackIn_6_0 = -7;
            if (stackIn_6_0 < ~var20) {
              var21 = ag.field_b[var20];
              var22 = og.field_d[var20];
              var23 = wd.field_e[var20];
              var24 = th.field_a[var20];
              var25 = el.field_F[var20];
              var26 = lg.field_a[var20];
              if (var42 != 0) {
                return;
              }
              var27 = 0;
              while (var27 < 25) {
                var28_double = nj.field_l[var27] * (double)this.field_P[var25] + ((double)this.field_P[var24] * nj.field_e[var27] + (double)this.field_P[var23] * nj.field_b[var27]) + (double)this.field_P[var26] * nj.field_h[var27];
                var30_double = nj.field_h[var27] * (double)this.field_N[var26] + (nj.field_b[var27] * (double)this.field_N[var23] + (double)this.field_N[var24] * nj.field_e[var27] + nj.field_l[var27] * (double)this.field_N[var25]);
                var32_double = nj.field_l[var27] * (double)this.field_S[var25] + (nj.field_e[var27] * (double)this.field_S[var24] + nj.field_b[var27] * (double)this.field_S[var23]) + nj.field_h[var27] * (double)this.field_S[var26];
                var34 = 384.0 / Math.sqrt(var32_double * var32_double + (var28_double * var28_double + var30_double * var30_double));
                var36 = var34 * var28_double;
                var38 = var34 * var30_double;
                var40 = var32_double * var34;
                uf.field_c[var27] = (int)(var40 * var14 + (var38 * (var8 * 1.0 + -var2_double * 0.0) + (var8 * 0.0 + 1.0 * var2_double) * var36));
                fd.field_qb[var27] = (int)((var10 * 0.0 + var4 * 1.0) * var36 + (0.0 * -var4 + var10 * 1.0) * var38 + var40 * var16);
                uc.field_a[var27] = (int)((var38 * (1.0 * var12 + -var6 * 0.0) + var36 * (var6 * 1.0 + 0.0 * var12) + var18 * var40) * 0.8);
                var27++;
              }
              var27Lifetime1 = 0;
              L8: while (true) {
                stackIn_16_0 = ~var27Lifetime1;
                stackIn_16_1 = -5;
                if (stackIn_16_0 > stackIn_16_1) {
                  stackIn_6_0 = 0;
                  var28 = stackIn_6_0;
                  while (var28 < 4) {
                    var29 = 4 * var28 + var27Lifetime1;
                    stackIn_16_0 = -3;
                    stackIn_16_1 = ~var20;
                    if (stackIn_16_0 == stackIn_16_1 ||
                      4 == var20) {
                      var29 += 16;
                    }
                    if (var20 == 0) {
                      var29 += 32;
                    }
                    if (var20 == 1) {
                      var29 += 48;
                    }
                    var30 = 5 * var28 + var27Lifetime1;
                    var31 = var28 * 5 + (var27Lifetime1 + 1);
                    var32 = 1 + var27Lifetime1 + 5 * (1 + var28);
                    qa.a(uf.field_c, fd.field_qb, uc.field_a, var32, var30, var31, var21, var22, var26, var23, var24);
                    qa.a(0, 2, var29, uf.field_c, fd.field_qb, uc.field_a, var32, var30, var31, 128, 128, 128);
                    var30Lifetime1 = var27Lifetime1 + 5 * var28;
                    var32Lifetime1 = (1 + var28) * 5 + var27Lifetime1;
                    var31Lifetime1 = (1 + var28) * 5 + (var27Lifetime1 + 1);
                    qa.a(uf.field_c, fd.field_qb, uc.field_a, var32Lifetime1, var30Lifetime1, var31Lifetime1, var21, var22, var25, var23, var26);
                    qa.a(0, 2, var29, uf.field_c, fd.field_qb, uc.field_a, var32Lifetime1, var30Lifetime1, var31Lifetime1, 128, 128, 128);
                    var28++;
                  }
                  var27Lifetime1++;
                  continue L8;
                }
                break;
              }
              var20++;
              continue L1;
            }
            break;
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          runtimeException = decompiledCaughtException;
          throw ma.a((Throwable) ((Object) runtimeException), "stellarshard.IB(" + param0 + ')');
        }
    }

    final void a(int param0) {
        int stackIn_6_1 = 0;
        boolean stackIn_7_2 = false;
        int stackIn_81_1 = 0;
        boolean stackIn_82_2 = false;
        RuntimeException decompiledCaughtException = null;
        kl var2 = null;
        int var2_int = 0;
        RuntimeException var2_ref = null;
        int var3 = 0;
        var3 = field_B;
        try {
          if (param0 < 21) {
            return;
          }
          ac.field_h.a();
          ka.field_m.a();
          stackIn_6_1 = 119;
          stackIn_7_2 = (s.field_e != null);
          this.b(stackIn_6_1, stackIn_7_2);
          if (qd.field_h) {
            this.o(122);
            qd.field_h = false;
          }
          if (s.field_e != null &&
            s.field_e.field_c) {
            ke.a(4);
            nd.a(-26621, s.field_e);
            s.field_e.a(ic.field_d, -57);
            qd.field_j.requestFocus();
            s.field_e = null;
          }
          if (ee.b(122)) {
            this.k(-11);
            if (!vj.a(25424)) {
              return;
            }
            this.a(false, (byte) -81);
            if (var3 == 0) {
              return;
            }
          }
          if (fd.field_mb) {
            if (fd.d((byte) -21)) {
              this.l((byte) -124);
            }
            fd.field_mb = false;
          }
          boolean decompiledFrameRemainder0 = true;
          boolean decompiledFrameCompleted0 = true;
          if (hf.field_f) {
            if ((be.field_g != null) &&
              (decompiledFrameRemainder0 = !(!be.field_g.field_n))) {
              tl.field_a = tl.field_a & ~be.field_g.field_m[0];
              sd.field_d = sd.field_d | be.field_g.field_m[0];
              be.field_g = null;
              if (na.field_j != null &&
                tl.field_a == 0) {
                oc.field_d = false;
              }
              hi.b((byte) 109);
              var2 = (kl) (ue.field_c.b(-91));
              while (var2 != null) {
                tc.a(var2, 4, false);
                var2 = (kl) (ue.field_c.b((byte) -128));
                if (var3 != 0) {
                  decompiledFrameCompleted0 = false;
                  break;
                }
              }
              if (decompiledFrameCompleted0) {
                decompiledFrameRemainder0 = (var3 != 0);
              }
            }
            if ((decompiledFrameRemainder0) &&
              (decompiledFrameCompleted0)) {
              if ((null != gg.field_f) &&
                (decompiledFrameRemainder0 = !(!gg.field_f.field_m))) {
                if (of.field_A < gg.field_f.field_s[0]) {
                  of.field_A = gg.field_f.field_s[0];
                }
                gg.field_f = null;
                decompiledFrameRemainder0 = (var3 != 0);
              }
              if (decompiledFrameRemainder0) {
                if (!fd.d((byte) -21)) {
                  if (wk.a(113)) {
                    stackIn_81_1 = 0;
                    stackIn_82_2 = (null != s.field_e);
                    var2_int = oa.a((rb) (this), stackIn_81_1, stackIn_82_2);
                    switch (var2_int) {
                      case 1:
                        if (null == s.field_e) {
                          break;
                        }
                        nd.a(-26621, s.field_e);
                        s.field_e.a(ic.field_d, -71);
                        s.field_e = null;
                        qd.field_j.requestFocus();
                      default:
                        break;
                      case 2364824:
                        cj.b(-5);
                        if (var3 == 0) {
                          break;
                        }
                      case 2:
                        if (null != s.field_e) {
                          nd.a(-26621, s.field_e);
                          s.field_e.a(ic.field_d, -15);
                          s.field_e = null;
                          qd.field_j.requestFocus();
                        }
                        df.a(false, hf.a((byte) -84));
                        break;
                    }
                    decompiledFrameRemainder0 = (var3 != 0);
                  }
                  if (decompiledFrameRemainder0) {
                    this.d(true);
                    decompiledFrameRemainder0 = (var3 != 0);
                  }
                }
                if (decompiledFrameRemainder0) {
                  var2_int = vd.a((byte) -61);
                  if (var2_int == 2 &&
                    s.field_e != null) {
                    nd.a(-26621, s.field_e);
                    s.field_e.a(ic.field_d, -15);
                    s.field_e = null;
                    qd.field_j.requestFocus();
                  }
                  if (var2_int == 3) {
                    this.l((byte) -110);
                  }
                  if (4 == var2_int) {
                    wj.h(-128);
                    fd.field_mb = true;
                  }
                  if (var3 != 0) {
                    this.a(true, (byte) -111);
                  }
                }
              }
            }
          } else {
            this.a(true, (byte) -111);
          }
          do {
            if (!fh.a((byte) 73, i.field_e)) {
              ue.a((byte) 85, 0);
              break;
            }
            this.h(6476);
          } while (var3 == 0);
          if (!il.e(32525)) {
            return;
          }
          var2_int = this.f(-16028);
          if (2 != var2_int) {
            return;
          }
          jj.a(true, 0, 8, 240, 320, 8, 0, (pb[]) null, (pb[]) null, l.field_f.field_N, 0, qj.field_a.field_N, qj.field_a, l.field_f);
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2_ref = decompiledCaughtException;
          throw ma.a((Throwable) ((Object) var2_ref), "stellarshard.LA(" + param0 + ')');
        }
    }

    final void c(int param0, int param1) {
        RuntimeException decompiledCaughtException = null;
        RuntimeException var3 = null;
        try {
          if (param0 <= 125) {
            this.l((byte) -28);
          }
          if (bi.field_u == null) {
            if (param1 > 0 &&
              !e.field_c &&
              !ah.a(-1)) {
              ue.field_a = param1;
              bi.field_u = bb.a(5, gg.field_i, cl.field_a, si.field_gb, 3, new int[]{param1}, 65530, 0, qb.field_k);
              if (field_B == 0) {
                return;
              }
            }
            ue.field_a = 0;
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3 = decompiledCaughtException;
          throw ma.a((Throwable) ((Object) var3), "stellarshard.AB(" + param0 + ',' + param1 + ')');
        }
    }

    final void a(boolean param0) {
        int stackIn_33_0 = 0;
        int stackIn_35_0 = 0;
        int stackIn_35_1 = 0;
        int stackIn_62_0 = 0;
        int stackIn_62_1 = 0;
        RuntimeException decompiledCaughtException = null;
        int[] var2 = null;
        RuntimeException var2_ref = null;
        int[] var3 = null;
        int[] var4 = null;
        int var5 = 0;
        float var6_float = 0.0f;
        int var6 = 0;
        int var7 = 0;
        int var8 = 0;
        int var9_int = 0;
        int[] var9 = null;
        int var10 = 0;
        int var11 = 0;
        int var12 = 0;
        int var6Lifetime1;
        int var7Lifetime1;
        int var8Lifetime1;
        var12 = field_B;
        try {
          this.a(8, 0, 10, 6, false, 10, (byte) -7, 9);
          cc.b(0.800000011920929f);
          cc.a();
          cc.field_f = false;
          eh.field_e = new int[256];
          var2 = new int[256];
          var3 = new int[256];
          var4 = new int[256];
          var5 = 0;
          do {
            if (!(var5 < eh.field_e.length)) {
              this.field_H = new pi();
              sg.field_a.a(1.0, 0.0, 0.0, (byte) -20, 1.0);
              this.field_H.a(sg.field_a, 19);
              sg.field_a.a(0.0, 0.0, 1.0, (byte) -20, 0.5);
              this.field_H.a(sg.field_a, 103);
              ea.field_m = new pb(80, 160);
              ea.field_m.e();
              var5 = 0;
              break;
            }
            eh.field_e[var5] = 65793 * var5;
            var2[var5] = var5 * 256;
            var3[var5] = var5 * 1;
            var4[var5] = 65536 * var5;
            var5++;
          } while (var12 == 0);
          var6_float = 0.0f;
          do {
            if (!(20.0f > var6_float)) {
              var6_float = 20.0f;
              break;
            }
            var5 = (int)(-((-var6_float + 20.0f) * (-var6_float + 20.0f) / 20.0f) + 40.0f);
            ti.e(40, (int)(-(var6_float * 2.0f) + 120.0f), var5, (int)(Math.random() * 16.0) * 1052688 | 1);
            var6_float = (float)((double)var6_float + 0.1);
          } while (var12 == 0);
          do {
            if (!(var6_float <= 40.0f)) {
              pd.field_h.a((byte) -107);
              ei.field_D = new pb[12];
              fk.field_k = new int[48];
              break;
            }
            var5 = (int)(40.0f - (var6_float - 20.0f) * (var6_float - 20.0f) / 20.0f);
            ti.e(40, (int)(120.0f - var6_float * 2.0f), var5, 1 | (int)(16.0 * Math.random()) * 1052688);
            var6_float = (float)((double)var6_float + 0.1);
          } while (var12 == 0);
          var5 = 0;
          L9: while (true) {
            if (var5 < 12) {
              fk.field_k[0 + var5 * 4] = (int)(640.0 * Math.random()) << 4;
              fk.field_k[var5 * 4 + 1] = (int)(Math.random() * 480.0) << 4;
              fk.field_k[2 + var5 * 4] = (int)(33.0 * Math.random() - 16.0);
              fk.field_k[3 + 4 * var5] = (int)(33.0 * Math.random() - 16.0);
              ei.field_D[var5] = new pb(256, 256);
              ei.field_D[var5].e();
              stackIn_33_0 = 0;
              if (var12 != 0) {
                break L9;
              }
              var6 = stackIn_33_0;
              while (var6 < 4) {
                var7 = (int)(64.0 * Math.random() + 64.0);
                var8 = (int)(Math.random() * (double)((128 - var7) * 2) + (double)var7);
                var9_int = (int)(Math.random() * (double)(2 * (-var7 + 128)) + (double)var7);
                ti.a(var8 << 4, var9_int << 4, var7 << 4, -var7 + 128, eh.field_e);
                var6++;
              }
              var5++;
              continue L9;
            }
            lc.field_k = new pb(640, 480);
            lc.field_k.e();
            stackIn_33_0 = 0;
            break;
          }
          var5 = stackIn_33_0;
          while (true) {
            stackIn_35_0 = ~var5;
            stackIn_35_1 = -257;
            if (stackIn_35_0 > stackIn_35_1) {
              var6Lifetime1 = (int)(Math.random() * 112.0 + 16.0);
              var7Lifetime1 = (int)(640.0 * Math.random() - (double)var6Lifetime1);
              var8Lifetime1 = (int)(480.0 * Math.random() - (double)var6Lifetime1);
              var9 = eh.field_e;
              var10 = (int)(4.0 * Math.random());
              stackIn_62_0 = 1;
              stackIn_62_1 = var10;
              if (var12 == 0) {
                if (stackIn_62_0 == stackIn_62_1) {
                  var9 = var2;
                }
                if (var10 == 2) {
                  var9 = var3;
                }
                if (var10 == 3) {
                  var9 = var4;
                }
                var11 = 0;
                while (4 > var11) {
                  ti.a(var7Lifetime1 << 4, var8Lifetime1 << 4, var6Lifetime1 << 4, -var6Lifetime1 + 128, var9);
                  stackIn_35_0 = 0;
                  stackIn_35_1 = var11;
                  if (stackIn_35_0 == stackIn_35_1) {
                    var7Lifetime1 += 640;
                  }
                  if (1 == var11) {
                    var8Lifetime1 += 480;
                  }
                  if (var11 == 2) {
                    var7Lifetime1 -= 640;
                  }
                  var11++;
                }
                var5++;
                continue;
              }
            } else {
              pd.field_h.a((byte) -107);
              stackIn_62_0 = 22050;
              stackIn_62_1 = 0;
            }
            ba.a(stackIn_62_0, stackIn_62_1 != 0, 10);
            ac.field_h = ba.a(ic.field_d, (java.awt.Component) ((Object) qd.field_j), 0, 512);
            ka.field_m = ba.a(ic.field_d, (java.awt.Component) ((Object) qd.field_j), 1, 22050);
            ll.field_c = new hl();
            nj.field_o = new hl();
            ac.field_h.a(ll.field_c);
            ka.field_m.a(nj.field_o);
            fe.field_e = param0;
            s.field_i = false;
            wh.field_c = 0;
            ke.field_a = 16777215;
            kg.field_D = 255;
            al.field_c = 0;
            jg.field_pb = 512;
            ll.a(16);
            tc.field_r = 0;
            qi.field_a = 0;
            cc.a((cf) (this));
            this.a(true, -113, false, false, true);
            return;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2_ref = decompiledCaughtException;
          throw ma.a((Throwable) ((Object) var2_ref), "stellarshard.GA(" + param0 + ')');
        }
    }

    final void m(byte param0) {
        RuntimeException decompiledCaughtException = null;
        RuntimeException var2 = null;
        try {
          a.field_h[pl.e((byte) 63)] = new qe(-1);
          ue.field_a = 0;
          bi.field_u = null;
          cl.field_a = cl.field_a + te.field_c;
          s.field_i = true;
          if (qi.field_a > 10) {
            e.field_e = 0;
          }
          if (param0 != 127) {
            this.a(false);
          }
          vh.field_e = 0;
          ta.field_p = 0;
          nc.field_H = 3;
          te.field_c = 0;
          sj.field_K = 0;
          gh.field_b = 250;
          sf.field_b = 0;
          ua.field_d = 0;
          this.field_R = 255;
          mg.field_t = qi.field_a;
          nc.field_A = 0;
          tb.field_K = 0;
          sd.field_b = 0;
          if (qi.field_a > 20) {
            e.field_e = 2;
          }
          if (qi.field_a > 30) {
            e.field_e = 1;
          }
          gf.field_c = 0;
          lh.field_d = lh.field_d - 1;
          if (qi.field_a > 40) {
            e.field_e = 3;
          }
          ml.field_h = 0;
          q.field_a = qi.field_a;
          ag.field_a = 0;
          hk.field_p = hk.field_p - ed.field_b;
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2 = decompiledCaughtException;
          throw ma.a((Throwable) ((Object) var2), "stellarshard.HB(" + param0 + ')');
        }
    }

    private final void d(boolean param0) {
        int fieldTemp$0 = 0;
        int fieldTemp$1 = 0;
        qe dupTemp$2 = null;
        qe dupTemp$3 = null;
        qe dupTemp$4 = null;
        qe dupTemp$5 = null;
        qe dupTemp$6 = null;
        qe dupTemp$7 = null;
        qe dupTemp$8 = null;
        qe dupTemp$9 = null;
        qe dupTemp$10 = null;
        qe dupTemp$11 = null;
        qe dupTemp$12 = null;
        int fieldTemp$13 = 0;
        int fieldTemp$14 = 0;
        int fieldTemp$15 = 0;
        qe dupTemp$16 = null;
        int fieldTemp$17 = 0;
        int fieldTemp$18 = 0;
        int fieldTemp$19 = 0;
        int stackIn_134_0 = 0;
        int stackIn_134_1 = 0;
        int stackIn_176_0 = 0;
        int stackIn_176_1 = 0;
        int stackIn_191_0 = 0;
        int stackIn_191_1 = 0;
        int stackIn_205_0 = 0;
        int stackIn_205_1 = 0;
        int stackIn_225_0 = 0;
        int stackIn_225_1 = 0;
        int stackIn_270_0 = 0;
        int stackIn_270_1 = 0;
        int stackIn_368_0 = 0;
        int stackIn_369_1 = 0;
        qe stackIn_415_0 = null;
        double stackIn_415_1 = 0.0;
        double stackIn_415_2 = 0.0;
        double stackIn_416_3 = 0.0;
        qe stackIn_419_0 = null;
        double stackIn_419_1 = 0.0;
        double stackIn_419_2 = 0.0;
        double stackIn_420_3 = 0.0;
        vl stackIn_440_0 = null;
        vl stackIn_440_1 = null;
        vl stackIn_441_0 = null;
        vl stackIn_441_1 = null;
        int stackIn_441_2 = 0;
        vl stackIn_454_0 = null;
        vl stackIn_454_1 = null;
        vl stackIn_455_0 = null;
        vl stackIn_455_1 = null;
        int stackIn_455_2 = 0;
        gd stackIn_484_0 = null;
        int stackIn_484_1 = 0;
        int stackIn_485_2 = 0;
        gd stackIn_491_0 = null;
        int stackIn_491_1 = 0;
        int stackIn_492_2 = 0;
        int stackIn_503_0 = 0;
        int stackIn_529_0 = 0;
        int stackIn_919_0 = 0;
        int stackIn_919_1 = 0;
        int stackIn_930_0 = 0;
        int stackIn_930_1 = 0;
        int stackIn_981_0 = 0;
        int stackIn_993_0 = 0;
        int stackIn_993_1 = 0;
        boolean stackIn_1012_0 = false;
        int stackIn_1026_0 = 0;
        qe stackIn_1090_0 = null;
        int stackIn_1097_0 = 0;
        int stackIn_1168_0 = 0;
        int stackIn_1168_1 = 0;
        Object stackIn_1217_0 = null;
        vl stackIn_1217_1 = null;
        vl stackIn_1220_0 = null;
        Object stackIn_1258_0 = null;
        Object stackIn_1305_0 = null;
        ij stackIn_1305_1 = null;
        RuntimeException decompiledCaughtException = null;
        int var2_int = 0;
        pi var2 = null;
        vl var2_ref = null;
        RuntimeException var2_ref2 = null;
        pi var3_ref_pi = null;
        int var3 = 0;
        vl var4_ref_vl = null;
        int var4 = 0;
        int var5 = 0;
        double var5_double = 0.0;
        qe var6_ref_qe = null;
        int var6 = 0;
        double var6_double = 0.0;
        int var7 = 0;
        Object var8 = null;
        int var9 = 0;
        qe var10 = null;
        int var11 = 0;
        int var12 = 0;
        double var13 = 0.0;
        int var15 = 0;
        vl var2_refLifetime1;
        vl var4_ref_vlLifetime1;
        vl var2_refLifetime2;
        vl var4_ref_vlLifetime2;
        vl var4_ref_vlLifetime1Lifetime1;
        int stackIn_919_0Lifetime1;
        int stackIn_919_1Lifetime1;
        int stackIn_930_0Lifetime1;
        int stackIn_930_1Lifetime1;
        int stackIn_981_0Lifetime1;
        int stackIn_993_0Lifetime1;
        int stackIn_993_1Lifetime1;
        boolean stackIn_1012_0Lifetime1;
        int stackIn_1168_0Lifetime1;
        int stackIn_1168_1Lifetime1;
        double var5_doubleLifetime1;
        int var9Lifetime1;
        int stackIn_981_0Lifetime2;
        double var5_doubleLifetime1Lifetime1;
        var15 = field_B;
        try {
          if (ni.field_e != this.field_Q ||
            eb.field_a != this.field_O ||
            0 != gh.field_c) {
            this.field_Q = ni.field_e;
            v.field_e = true;
            this.field_O = eb.field_a;
            ld.field_F = -1;
          }
          if (si.field_jb[98]) {
            ld.field_F = 0;
            v.field_e = false;
          }
          if (si.field_jb[99]) {
            ld.field_F = 1;
            v.field_e = false;
          }
          ki.field_s = ki.field_s + 1;
          if (si.field_jb[84]) {
            v.field_e = false;
          }
          qb.field_k = qb.field_k + 1;
          lg.field_f = lg.field_f - 1;
          hk.field_p = hk.field_p + 1;
          if (10 < ki.field_s) {
            ki.field_s = 0;
          }
          if (qi.field_a > 1 &&
            this.field_J > 0) {
            this.field_J = this.field_J - 1;
          }
          cl.field_a = cl.field_a + 1;
          if (0 != gh.field_c) {
            qb.field_k = qb.field_k - gg.field_i;
            si.field_gb = si.field_gb + 1;
            hk.field_p = hk.field_p + lh.field_d;
            ed.field_b = ed.field_b + 1;
          }
          if (null != hf.field_i.b(-97)) {
            fieldTemp$0 = this.field_I + 1;
            this.field_I = this.field_I + 1;
            if (fieldTemp$0 == 335) {
              this.field_I = 0;
              hf.field_i.d((byte) -35);
            }
          }
          if (af.field_o > 0) {
            af.field_o = af.field_o - 1;
          }
          if (0 < og.field_a) {
            og.field_a = og.field_a - 1;
          }
          fieldTemp$1 = bf.field_c;
          bf.field_c = bf.field_c + 1;
          if (fieldTemp$1 > qj.field_a.b(sj.field_C)) {
            bf.field_c = bf.field_c - qj.field_a.b(sj.field_C) * 2;
          }
          if (0 < this.field_R) {
            this.field_R = this.field_R / 2;
          }
          if (this.field_R > 0) {
            this.field_R = this.field_R - 1;
          }
          if (null != na.field_j) {
            if (!s.field_i) {
              sg.field_a.a(1.0, 0.0, 0.0, (byte) -20, 0.001);
              this.field_H.a(sg.field_a, -127);
              sg.field_a.a(0.0, 0.0, 1.0, (byte) -20, 0.0005);
              this.field_H.a(sg.field_a, -125);
            }
            if (null != gj.field_r &&
              og.field_a <= 0) {
              og.field_a = 25;
              gj.field_r.b(25, 0);
            }
            if (tl.field_c == 8) {
              var2_int = qc.a((byte) -115, true);
              if (3 == var2_int) {
                qd.a(hf.a((byte) -68), (byte) -30);
              }
              if (var2_int == 1) {
                na.field_j.field_l = 0;
                tl.field_c = 0;
                return;
              }
              if (var2_int == 2) {
                tl.field_c = 0;
                na.field_j.field_l = -1;
                return;
              }
            }
            if (tl.field_c == 3 &&
              gh.field_c == 1 &&
              na.field_j.field_r != -1) {
              if (na.field_j.field_u != na.field_j.field_r) {
                na.field_j.field_u = na.field_j.field_r;
                if (var15 != 0) {
                  na.field_j.field_u = -1;
                }
              } else {
                na.field_j.field_u = -1;
              }
            }
            if (qi.field_a <= na.field_j.field_t) {
              if (4 == tl.field_c) {
                na.field_j.field_p = na.field_j.field_p + 1;
                if (na.field_j.field_p > 50) {
                  na.field_j.field_p = na.field_j.field_p - 50;
                  na.field_j.field_s = na.field_j.field_s - 1;
                }
                if (!(na.field_j.field_s > 0)) {
                  gh.field_d = null;
                  tl.field_c = 2;
                  na.field_j.field_l = 9;
                  if (tl.field_a > 0) {
                    tl.field_c = 3;
                  }
                  n.field_L = 256;
                  if (var15 != 0) {
                    na.field_j.field_p = na.field_j.field_p + 1;
                    if (10 < na.field_j.field_p) {
                      na.field_j.field_t = na.field_j.field_t + 1;
                      na.field_j.field_p = na.field_j.field_p - 10;
                    }
                  }
                }
              }
            } else {
              na.field_j.field_p = na.field_j.field_p + 1;
              if (10 < na.field_j.field_p) {
                na.field_j.field_t = na.field_j.field_t + 1;
                na.field_j.field_p = na.field_j.field_p - 10;
              }
            }
            if (tl.field_c == 0) {
              var2_int = 0;
              while (true) {
                if (var2_int < 9) {
                  stackIn_134_0 = na.field_j.field_l;
                  stackIn_134_1 = var2_int;
                  if (var15 == 0) {
                    if (stackIn_134_0 == stackIn_134_1) {
                      nj.field_f[var2_int] = nj.field_f[var2_int] * 15 + 64 >> 4;
                    } else {
                      nj.field_f[var2_int] = 0 + nj.field_f[var2_int] * 15 >> 4;
                    }
                    var2_int++;
                    continue;
                  }
                } else {
                  stackIn_134_0 = -3;
                  stackIn_134_1 = ~ph.field_D;
                }
                if (stackIn_134_0 < stackIn_134_1) {
                  break;
                }
                if (si.field_jb[16]) {
                  this.field_H.field_b = 1.0;
                  var2 = this.field_H;
                  var3_ref_pi = this.field_H;
                  this.field_H.field_a = 0.0;
                  var2.field_d = 0.0;
                  var3_ref_pi.field_c = 0.0;
                }
                if (si.field_jb[17]) {
                  this.field_H.field_b = 0.1513824462890625;
                  this.field_H.field_c = -0.939178466796875;
                  this.field_H.field_a = -0.258941650390625;
                  this.field_H.field_d = -0.949249267578125;
                }
                if (si.field_jb[18]) {
                  this.field_H.field_c = -0.0067138671875;
                  this.field_H.field_a = -0.82244873046875;
                  this.field_H.field_b = 0.13287353515625;
                  this.field_H.field_d = -0.552978515625;
                }
                if (si.field_jb[19]) {
                  this.field_H.field_d = -0.846764809241;
                  this.field_H.field_b = 0.26812744140625;
                  this.field_H.field_a = 0.4404144287109375;
                  this.field_H.field_c = 0.130889892578125;
                }
                if (si.field_jb[20]) {
                  this.field_H.field_b = 0.7213134765625;
                  this.field_H.field_c = 0.5408782958984375;
                  this.field_H.field_a = -0.334014892578125;
                  this.field_H.field_d = 0.2748870849609375;
                }
                if (!si.field_jb[21]) {
                  break;
                }
                this.field_H.field_d = -0.5489211794018304;
                this.field_H.field_a = -0.49565616706475396;
                this.field_H.field_b = -0.6729829114278874;
                this.field_H.field_c = -0.010222709116862912;
                break;
              }
            }
            boolean decompiledFrameCompleted16 = true;
            if (tl.field_c == 4) {
              var2_int = 8;
              while (var2_int < 9) {
                stackIn_176_0 = var2_int;
                stackIn_176_1 = na.field_j.field_l;
                if (var15 != 0) {
                  decompiledFrameCompleted16 = false;
                  break;
                }
                if (stackIn_176_0 != stackIn_176_1) {
                  nj.field_f[var2_int] = 0 + 15 * nj.field_f[var2_int] >> 4;
                } else {
                  nj.field_f[var2_int] = 64 + nj.field_f[var2_int] * 15 >> 4;
                }
                var2_int++;
              }
            }
            if (decompiledFrameCompleted16) {
              stackIn_176_0 = ~tl.field_c;
              stackIn_176_1 = -2;
            }
            boolean decompiledFrameCompleted15 = true;
            if (stackIn_176_0 == stackIn_176_1) {
              var2_int = 9;
              while (var2_int < 10) {
                stackIn_191_0 = ~var2_int;
                stackIn_191_1 = ~na.field_j.field_l;
                if (var15 != 0) {
                  decompiledFrameCompleted15 = false;
                  break;
                }
                if (stackIn_191_0 != stackIn_191_1) {
                  nj.field_f[var2_int] = nj.field_f[var2_int] * 15 - 0 >> 4;
                } else {
                  nj.field_f[var2_int] = 64 + nj.field_f[var2_int] * 15 >> 4;
                }
                var2_int++;
              }
            }
            if (decompiledFrameCompleted15) {
              stackIn_191_0 = 2;
              stackIn_191_1 = tl.field_c;
            }
            boolean decompiledFrameCompleted14 = true;
            if (stackIn_191_0 == stackIn_191_1) {
              var2_int = 8;
              var3 = var2_int;
              while (10 > var3) {
                stackIn_205_0 = ~na.field_j.field_l;
                stackIn_205_1 = ~var3;
                if (var15 != 0) {
                  decompiledFrameCompleted14 = false;
                  break;
                }
                if (stackIn_205_0 != stackIn_205_1) {
                  nj.field_f[var3] = 0 + 15 * nj.field_f[var3] >> 4;
                } else {
                  nj.field_f[var3] = nj.field_f[var3] * 15 + 64 >> 4;
                }
                var3++;
              }
            }
            if (decompiledFrameCompleted14) {
              stackIn_205_0 = ~tl.field_c;
              stackIn_205_1 = -4;
            }
            boolean decompiledFrameCompleted13 = true;
            if (stackIn_205_0 == stackIn_205_1) {
              var2_int = 8;
              if (!ah.a(-1) &&
                !oc.field_d) {
                var2_int = 9;
              }
              var3 = var2_int;
              while (var3 < 10) {
                stackIn_225_0 = na.field_j.field_l;
                stackIn_225_1 = var3;
                if (var15 != 0) {
                  decompiledFrameCompleted13 = false;
                  break;
                }
                if (stackIn_225_0 == stackIn_225_1) {
                  nj.field_f[var3] = 15 * nj.field_f[var3] + 64 >> 4;
                } else {
                  nj.field_f[var3] = 15 * nj.field_f[var3] + 0 >> 4;
                }
                var3++;
              }
            }
            if (decompiledFrameCompleted13) {
              stackIn_225_0 = 0;
              stackIn_225_1 = n.field_L;
            }
            if (stackIn_225_0 < stackIn_225_1) {
              n.field_L = n.field_L / 2;
            }
            if (n.field_L > 0) {
              n.field_L = n.field_L - 1;
            }
          }
          if (null != na.field_j &&
            s.field_i) {
            boolean decompiledNaturalLoopExit1 = false;
            while (!(decompiledNaturalLoopExit1 = (!qh.c(103)))) {
              stackIn_270_0 = gi.field_f;
              stackIn_270_1 = 13;
              if (var15 == 0) {
                if (stackIn_270_0 == stackIn_270_1 &&
                  tl.field_c == 0) {
                  na.field_j = null;
                }
                if (na.field_j != null &&
                  gi.field_f == 13 && (tl.field_c == 2 ||
                  tl.field_c == 1 ||
                  tl.field_c == 3)) {
                  n.field_L = 256;
                  tl.field_c = 0;
                  gh.field_d = null;
                  continue;
                }
                if (null == na.field_j) {
                  continue;
                }
                na.field_j.b(8);
                continue;
              }
              break;
            }
            if (decompiledNaturalLoopExit1) {
              if (na.field_j == null) {
                return;
              }
              stackIn_270_0 = -4;
              stackIn_270_1 = ~tl.field_c;
            }
            if (stackIn_270_0 == stackIn_270_1) {
            }
            if (tl.field_c == 2) {
            }
            if (tl.field_c == 1) {
            }
            na.field_j.a(true);
            return;
          }
          if (0 < ig.field_D) {
            ig.field_D = ig.field_D - 6;
          }
          if (0 == wh.field_c) {
            jg.field_pb = jg.field_pb - 8;
            if (jg.field_pb <= 0) {
              wh.field_c = 1;
              jg.field_pb = 0;
              if (fe.field_e) {
                ll.field_c.a(sb.field_e[36], 100, pk.field_h * 2);
              }
            }
          }
          if (wh.field_c == 1) {
            jg.field_pb = jg.field_pb + 1;
            if (jg.field_pb >= 36) {
              jg.field_pb = 0;
              wh.field_c = 2;
            }
          }
          if (2 == wh.field_c) {
            jg.field_pb = jg.field_pb + 1;
            if (jg.field_pb >= 30) {
              wh.field_c = 3;
              jg.field_pb = 0;
            }
          }
          if (wh.field_c == 3) {
            jg.field_pb = jg.field_pb + 1;
            if (1 == jg.field_pb &&
              fe.field_e &&
              !s.field_i) {
              ll.field_c.a(sb.field_e[37], 100, pk.field_h * 2);
            }
            if (jg.field_pb > 250) {
              jg.field_pb = 0;
              wh.field_c = 2;
            }
          }
          if (~al.field_c != ~ke.field_a) {
            kg.field_D = kg.field_D - 1;
            if (kg.field_D <= 0) {
              kg.field_D = 255;
              ke.field_a = al.field_c;
            }
          }
          al.field_c = qi.field_a % 7 * 6912 + qi.field_a % 10 * 19 + 851968 * (qi.field_a % 14);
          if (!s.field_i) {
            al.field_c = 858899;
          }
          if (nc.field_H == 1) {
            if (a.field_h[0].field_g < 1) {
              dupTemp$2 = a.field_h[0];
              dupTemp$2.field_g = dupTemp$2.field_g + 1;
              gh.field_b = gh.field_b - 1;
            }
            if (0 >= gh.field_b) {
              nc.field_H = 0;
            }
          }
          if (nc.field_H == 2) {
            gh.field_b = gh.field_b - 1;
            if (0 >= gh.field_b) {
              gh.field_b = 5;
              nc.field_H = 1;
            }
          }
          if (nc.field_H == 3) {
            gh.field_b = gh.field_b - 1;
            if (gh.field_b <= 0) {
              gh.field_b = 5;
              nc.field_H = 1;
            }
          }
          if (96 > tc.field_r) {
            tc.field_r = tc.field_r + 1;
          }
          if (nc.field_H == 4) {
            gh.field_b = gh.field_b - 1;
            if (0 >= gh.field_b) {
              gh.field_b = 5;
              nc.field_H = 1;
            }
          }
          if (null == a.field_h[0] ||
            a.field_h[0].field_m != -1) {
            stackIn_368_0 = 0;
            if (s.field_i) {
              stackIn_369_1 = 0;
            } else {
              stackIn_369_1 = 1;
            }
            if (stackIn_368_0 == stackIn_369_1) {
              this.k((byte) -69);
            }
          }
          boolean decompiledFrameCompleted3 = true;
          boolean decompiledFrameCompleted2 = true;
          boolean decompiledFrameRemainder17 = true;
          boolean decompiledFrameCompleted4 = true;
          boolean decompiledFrameCompleted5 = true;
          boolean decompiledFrameCompleted1 = true;
          boolean decompiledFrameRemainder20 = true;
          boolean decompiledFrameCompleted7 = true;
          boolean decompiledFrameCompleted6 = true;
          if (s.field_i) {
            boolean decompiledFrameRemainder16 = true;
            boolean decompiledFrameCompleted10 = true;
            boolean decompiledFrameRemainder15 = true;
            boolean decompiledFrameCompleted12 = true;
            boolean decompiledFrameCompleted11 = true;
            if ((!si.field_jb[98] &&
              4 != nc.field_H ||
              !(a.field_h[0].field_g > 0)) &&
              (decompiledFrameRemainder15 = !(!si.field_jb[99])) &&
              (decompiledFrameRemainder15 = !(0 >= a.field_h[0].field_g))) {
              dupTemp$3 = a.field_h[0];
              dupTemp$3.field_k = dupTemp$3.field_k + 0.05 * Math.cos(2.0 * ((double)a.field_h[0].field_h * 3.141592653589793) / 256.0);
              dupTemp$4 = a.field_h[0];
              dupTemp$4.field_d = dupTemp$4.field_d + 0.05 * Math.sin(2.0 * (3.141592653589793 * (double)a.field_h[0].field_h) / 256.0);
              if (fe.field_e &&
                og.field_a <= 0) {
                ll.field_c.a(sb.field_e[0], 100, pk.field_h / 4);
                og.field_a = 5;
              }
              var2_int = 3;
              var3 = 5;
              var5 = 0;
              while (true) {
                if (var2_int > var5) {
                  var4_ref_vl = new vl(1, a.field_h[0]);
                  var4_ref_vl.field_q = 16711680;
                  var4_ref_vl.field_j = var4_ref_vl.field_j + Math.sin(2.0 * (((double)(96 + a.field_h[0].field_h) + 2.0 * ((double)var3 * Math.random()) - (double)var3) * 3.141592653589793) / 256.0) * 2.0;
                  var4_ref_vl.field_a = var4_ref_vl.field_a + 2.0 * Math.cos(2.0 * (((double)(-var3) + ((double)(-32 + (a.field_h[0].field_h + 128)) + 2.0 * ((double)var3 * Math.random()))) * 3.141592653589793) / 256.0);
                  var4_ref_vl.field_c = var4_ref_vl.field_j * 4.0 + a.field_h[0].field_a;
                  var4_ref_vl.field_k = a.field_h[0].field_l + var4_ref_vl.field_a * 4.0;
                  var4_ref_vl.field_a = var4_ref_vl.field_a + a.field_h[0].field_k;
                  var4_ref_vl.field_j = var4_ref_vl.field_j + a.field_h[0].field_d;
                  wk.field_b[eg.a(-71)] = var4_ref_vl;
                  var5++;
                  if (var15 == 0) {
                    continue;
                  }
                } else {
                  var5 = 0;
                }
                break;
              }
              while (var2_int > var5) {
                var4_ref_vlLifetime2 = new vl(1, a.field_h[0]);
                var4_ref_vlLifetime2.field_q = 16711680;
                var4_ref_vlLifetime2.field_j = var4_ref_vlLifetime2.field_j + 2.0 * Math.sin(2.0 * (3.141592653589793 * ((double)(32 + a.field_h[0].field_h + 128) + 2.0 * ((double)var3 * Math.random()) - (double)var3)) / 256.0);
                var4_ref_vlLifetime2.field_a = var4_ref_vlLifetime2.field_a + 2.0 * Math.cos(((double)(32 + (a.field_h[0].field_h + 128)) + (double)var3 * Math.random() * 2.0 - (double)var3) * 3.141592653589793 * 2.0 / 256.0);
                var4_ref_vlLifetime2.field_c = var4_ref_vlLifetime2.field_j * 4.0 + a.field_h[0].field_a;
                var4_ref_vlLifetime2.field_k = 4.0 * var4_ref_vlLifetime2.field_a + a.field_h[0].field_l;
                var4_ref_vlLifetime2.field_j = var4_ref_vlLifetime2.field_j + a.field_h[0].field_d;
                var4_ref_vlLifetime2.field_a = var4_ref_vlLifetime2.field_a + a.field_h[0].field_k;
                wk.field_b[eg.a(-53)] = var4_ref_vlLifetime2;
                var5++;
                if (var15 != 0) {
                  decompiledFrameCompleted12 = false;
                  break;
                }
              }
              if (decompiledFrameCompleted12) {
                decompiledFrameRemainder15 = (var15 != 0);
              }
            }
            if ((decompiledFrameRemainder15) &&
              (decompiledFrameCompleted12)) {
              dupTemp$5 = a.field_h[0];
              stackIn_415_0 = dupTemp$5;
              stackIn_415_1 = dupTemp$5.field_k;
              stackIn_415_2 = Math.cos(2.0 * (3.141592653589793 * (double)a.field_h[0].field_h) / 256.0);
              if (8 != e.field_e) {
                stackIn_416_3 = 0.1;
              } else {
                stackIn_416_3 = 0.15;
              }
              stackIn_415_0.field_k = stackIn_415_1 - stackIn_415_2 * stackIn_416_3;
              dupTemp$6 = a.field_h[0];
              stackIn_419_0 = dupTemp$6;
              stackIn_419_1 = dupTemp$6.field_d;
              stackIn_419_2 = Math.sin(2.0 * (3.141592653589793 * (double)a.field_h[0].field_h) / 256.0);
              if (e.field_e == 8) {
                stackIn_420_3 = 0.15;
              } else {
                stackIn_420_3 = 0.1;
              }
              stackIn_419_0.field_d = stackIn_419_1 - stackIn_419_2 * stackIn_420_3;
              if (nc.field_H == 4) {
                dupTemp$7 = a.field_h[0];
                dupTemp$7.field_k = dupTemp$7.field_k - 0.1 * Math.cos(3.141592653589793 * (double)a.field_h[0].field_h * 2.0 / 256.0);
                dupTemp$8 = a.field_h[0];
                dupTemp$8.field_d = dupTemp$8.field_d - 0.1 * Math.sin((double)a.field_h[0].field_h * 3.141592653589793 * 2.0 / 256.0);
                if (fe.field_e &&
                  og.field_a <= 0) {
                  ll.field_c.a(sb.field_e[35], 100, pk.field_h / 2);
                  og.field_a = 7;
                }
              }
              var2_int = 3;
              var3 = 5;
              if (nc.field_H == 4) {
                var3 = 10;
                var2_int = 6;
              }
              var5 = 0;
              while (var5 < var2_int) {
                if (var15 != 0) {
                  decompiledFrameCompleted11 = false;
                  break;
                }
                stackIn_440_0 = null;
                stackIn_440_1 = null;
                if (nc.field_H != 4) {
                  stackIn_441_0 = null;
                  stackIn_441_1 = null;
                  stackIn_441_2 = 1;
                } else {
                  stackIn_441_0 = null;
                  stackIn_441_1 = null;
                  stackIn_441_2 = 4;
                }
                var4_ref_vlLifetime1 = new vl(stackIn_441_2, a.field_h[0]);
                var4_ref_vlLifetime1.field_q = 16711680;
                if (nc.field_H == 4) {
                  var4_ref_vlLifetime1.field_q = 16776960;
                  var4_ref_vlLifetime1.field_p = 10;
                }
                var4_ref_vlLifetime1.field_j = var4_ref_vlLifetime1.field_j + 4.0 * Math.sin(((double)(-var3) + ((double)a.field_h[0].field_h + Math.random() * (double)var3 * 2.0)) * 3.141592653589793 * 2.0 / 256.0);
                var4_ref_vlLifetime1.field_a = var4_ref_vlLifetime1.field_a + 4.0 * Math.cos(2.0 * (((double)(-var3) + ((double)a.field_h[0].field_h + (double)var3 * Math.random() * 2.0)) * 3.141592653589793) / 256.0);
                var4_ref_vlLifetime1.field_c = var4_ref_vlLifetime1.field_j * 4.0 + a.field_h[0].field_a;
                var4_ref_vlLifetime1.field_k = var4_ref_vlLifetime1.field_a * 4.0 + a.field_h[0].field_l;
                var4_ref_vlLifetime1.field_a = var4_ref_vlLifetime1.field_a + a.field_h[0].field_k;
                var4_ref_vlLifetime1.field_j = var4_ref_vlLifetime1.field_j + a.field_h[0].field_d;
                wk.field_b[eg.a(-87)] = var4_ref_vlLifetime1;
                var5++;
              }
              if ((decompiledFrameCompleted11) &&
                (4 == nc.field_H)) {
                var5 = 4 * (gh.field_b % 8);
                while (var5 < 256) {
                  if (var15 != 0) {
                    decompiledFrameCompleted10 = false;
                    break;
                  }
                  stackIn_454_0 = null;
                  stackIn_454_1 = null;
                  if (nc.field_H == 4) {
                    stackIn_455_0 = null;
                    stackIn_455_1 = null;
                    stackIn_455_2 = 4;
                  } else {
                    stackIn_455_0 = null;
                    stackIn_455_1 = null;
                    stackIn_455_2 = 1;
                  }
                  var4_ref_vlLifetime1Lifetime1 = new vl(stackIn_455_2, a.field_h[0]);
                  var4_ref_vlLifetime1Lifetime1.field_q = 16711680;
                  if (nc.field_H == 4) {
                    var4_ref_vlLifetime1Lifetime1.field_p = 10;
                    var4_ref_vlLifetime1Lifetime1.field_q = 16776960;
                  }
                  var4_ref_vlLifetime1Lifetime1.field_j = var4_ref_vlLifetime1Lifetime1.field_j + 2.0 * Math.sin(2.0 * (3.141592653589793 * (double)(a.field_h[0].field_h + var5)) / 256.0);
                  var4_ref_vlLifetime1Lifetime1.field_a = var4_ref_vlLifetime1Lifetime1.field_a + Math.cos(2.0 * ((double)(var5 + a.field_h[0].field_h) * 3.141592653589793) / 256.0) * 2.0;
                  var4_ref_vlLifetime1Lifetime1.field_a = var4_ref_vlLifetime1Lifetime1.field_a + a.field_h[0].field_k * 0.8;
                  var4_ref_vlLifetime1Lifetime1.field_j = var4_ref_vlLifetime1Lifetime1.field_j + a.field_h[0].field_d * 0.8;
                  var4_ref_vlLifetime1Lifetime1.field_c = a.field_h[0].field_a;
                  var4_ref_vlLifetime1Lifetime1.field_k = a.field_h[0].field_l;
                  wk.field_b[eg.a(-67)] = var4_ref_vlLifetime1Lifetime1;
                  var5 += 32;
                }
              }
            }
            if ((decompiledFrameCompleted10) && (!si.field_jb[98] &&
              !si.field_jb[99] &&
              0 < a.field_h[0].field_g)) {
              dupTemp$9 = a.field_h[0];
              dupTemp$9.field_d = dupTemp$9.field_d * 0.99;
              dupTemp$10 = a.field_h[0];
              dupTemp$10.field_k = dupTemp$10.field_k * 0.99;
              decompiledFrameRemainder16 = (gj.field_r != null);
              if ((decompiledFrameRemainder16) &&
                (decompiledFrameRemainder16 = !(0 > og.field_a))) {
                og.field_a = -1;
                gj.field_r.b(25, 0);
                decompiledFrameRemainder16 = (var15 != 0);
              }
            }
            if (decompiledFrameRemainder16) {
              if (null != gj.field_r) {
                if (!(0 < og.field_a)) {
                  og.field_a = 10;
                  stackIn_484_0 = gj.field_r;
                  stackIn_484_1 = 10;
                  if (fe.field_e) {
                    stackIn_485_2 = pk.field_h / 2;
                  } else {
                    stackIn_485_2 = 0;
                  }
                  ((gd) (Object) stackIn_484_0).b(stackIn_484_1, stackIn_485_2);
                  if (var15 != 0) {
                    gj.field_r = gd.a(sb.field_e[0], 100, 0);
                    gj.field_r.e(-1);
                    ll.field_c.a(gj.field_r);
                    stackIn_491_0 = gj.field_r;
                    stackIn_491_1 = 10;
                    if (fe.field_e) {
                      stackIn_492_2 = pk.field_h / 2;
                    } else {
                      stackIn_492_2 = 0;
                    }
                    ((gd) (Object) stackIn_491_0).b(stackIn_491_1, stackIn_492_2);
                  }
                }
              } else {
                gj.field_r = gd.a(sb.field_e[0], 100, 0);
                gj.field_r.e(-1);
                ll.field_c.a(gj.field_r);
                stackIn_491_0 = gj.field_r;
                stackIn_491_1 = 10;
                if (fe.field_e) {
                  stackIn_492_2 = pk.field_h / 2;
                } else {
                  stackIn_492_2 = 0;
                }
                ((gd) (Object) stackIn_491_0).b(stackIn_491_1, stackIn_492_2);
              }
            }
            dupTemp$11 = a.field_h[0];
            dupTemp$11.field_k = dupTemp$11.field_k * 0.99;
            if (si.field_jb[97] &&
              a.field_h[0].field_g > 0) {
              stackIn_503_0 = (8 != e.field_e) ? -75 : -150;
              var2_int = stackIn_503_0;
              if (this.field_M > var2_int / 3) {
                this.field_M = var2_int / 3;
              }
              if (var2_int < this.field_M) {
                this.field_M = this.field_M - 6;
              }
              if (var15 != 0 &&
                this.field_M < 0) {
                this.field_M = this.field_M + 5;
                if (0 < this.field_M) {
                  this.field_M = 0;
                }
              }
            } else {
              if (this.field_M < 0) {
                this.field_M = this.field_M + 5;
                if (0 < this.field_M) {
                  this.field_M = 0;
                }
              }
            }
            dupTemp$12 = a.field_h[0];
            dupTemp$12.field_d = dupTemp$12.field_d * 0.99;
            if (si.field_jb[96] &&
              a.field_h[0].field_g > 0) {
              stackIn_529_0 = (e.field_e != 8) ? 75 : 150;
              var2_int = stackIn_529_0;
              if ((var2_int / 3) > this.field_M) {
                this.field_M = var2_int / 3;
              }
              if (this.field_M < var2_int) {
                this.field_M = this.field_M + 6;
              }
              if (var15 != 0 &&
                this.field_M > 0) {
                this.field_M = this.field_M - 5;
                if (this.field_M < 0) {
                  this.field_M = 0;
                }
              }
            } else {
              if (this.field_M > 0) {
                this.field_M = this.field_M - 5;
                if (this.field_M < 0) {
                  this.field_M = 0;
                }
              }
            }
            a.field_h[0].field_j = this.field_M;
            if ((!si.field_jb[83] &&
              !si.field_jb[82]) &&
              (decompiledFrameRemainder20 = (10 == e.field_e))) {
              decompiledFrameRemainder20 = !(a.field_h[0].field_i >= 0);
            }
            if (decompiledFrameRemainder20) {
              if (0 < a.field_h[0].field_g) {
                L128: {
                  boolean decompiledFrameRemainder14 = true;
                  boolean decompiledFrameRemainder13 = true;
                  boolean decompiledFrameRemainder12 = true;
                  boolean decompiledFrameRemainder11 = true;
                  boolean decompiledFrameRemainder10 = true;
                  boolean decompiledFrameRemainder9 = true;
                  boolean decompiledFrameRemainder8 = true;
                  boolean decompiledFrameRemainder7 = true;
                  boolean decompiledFrameRemainder6 = true;
                  boolean decompiledFrameRemainder5 = true;
                  boolean decompiledFrameRemainder4 = true;
                  var2_int = e.field_e;
                  if ((var2_int != -1) &&
                    (decompiledFrameRemainder4 = (var2_int != 0)) &&
                    (decompiledFrameRemainder5 = (var2_int != 1 ||
                    var15 != 0)) &&
                    (decompiledFrameRemainder6 = (2 != var2_int)) &&
                    (decompiledFrameRemainder7 = (3 != var2_int ||
                    var15 != 0)) &&
                    (decompiledFrameRemainder8 = (4 != var2_int)) &&
                    (decompiledFrameRemainder9 = (var2_int != 5)) &&
                    (decompiledFrameRemainder10 = (var2_int != 6)) &&
                    (decompiledFrameRemainder11 = (var2_int != 7)) &&
                    (decompiledFrameRemainder12 = (var2_int != 8 ||
                    var15 != 0)) &&
                    (decompiledFrameRemainder13 = (var2_int != 9))) {
                    if (var2_int != 10) {
                      break L128;
                    }
                    decompiledFrameRemainder14 = (var15 != 0);
                  }
                  if ((decompiledFrameRemainder14) &&
                    (decompiledFrameRemainder13) &&
                    (decompiledFrameRemainder12) &&
                    (decompiledFrameRemainder11) &&
                    (decompiledFrameRemainder10) &&
                    (decompiledFrameRemainder9) &&
                    (decompiledFrameRemainder8) &&
                    (decompiledFrameRemainder7) &&
                    (decompiledFrameRemainder6) &&
                    (decompiledFrameRemainder5) &&
                    (decompiledFrameRemainder4)) {
                    if (!fe.field_e) {
                      break L128;
                    }
                    if (a.field_h[0].field_i > 0) {
                      break L128;
                    }
                    ll.field_c.a(sb.field_e[27], 100, 2 * pk.field_h);
                    if (var15 == 0) {
                      break L128;
                    }
                  }
                  if ((decompiledFrameRemainder14) &&
                    (decompiledFrameRemainder13) &&
                    (decompiledFrameRemainder12) &&
                    (decompiledFrameRemainder11) &&
                    (decompiledFrameRemainder10) &&
                    (decompiledFrameRemainder9) &&
                    (decompiledFrameRemainder8) &&
                    (decompiledFrameRemainder7) &&
                    (decompiledFrameRemainder6) &&
                    (decompiledFrameRemainder5)) {
                    if (!fe.field_e) {
                      break L128;
                    }
                    if (0 < a.field_h[0].field_i) {
                      break L128;
                    }
                    ll.field_c.a(sb.field_e[38], 100, pk.field_h * 2);
                    if (var15 == 0) {
                      break L128;
                    }
                  }
                  if ((decompiledFrameRemainder14) &&
                    (decompiledFrameRemainder13) &&
                    (decompiledFrameRemainder12) &&
                    (decompiledFrameRemainder11) &&
                    (decompiledFrameRemainder10) &&
                    (decompiledFrameRemainder9) &&
                    (decompiledFrameRemainder8) &&
                    (decompiledFrameRemainder7) &&
                    (decompiledFrameRemainder6)) {
                    if (!fe.field_e) {
                      break L128;
                    }
                    if (a.field_h[0].field_i > 0) {
                      break L128;
                    }
                    ll.field_c.a(sb.field_e[33], 100, pk.field_h * 2);
                    if (var15 == 0) {
                      break L128;
                    }
                  }
                  if ((decompiledFrameRemainder14) &&
                    (decompiledFrameRemainder13) &&
                    (decompiledFrameRemainder12) &&
                    (decompiledFrameRemainder11) &&
                    (decompiledFrameRemainder10) &&
                    (decompiledFrameRemainder9) &&
                    (decompiledFrameRemainder8) &&
                    (decompiledFrameRemainder7)) {
                    if (!fe.field_e) {
                      break L128;
                    }
                    if (a.field_h[0].field_i > 0) {
                      break L128;
                    }
                    ll.field_c.a(sb.field_e[1], 100, pk.field_h * 2);
                    if (var15 == 0) {
                      break L128;
                    }
                  }
                  if ((decompiledFrameRemainder14) &&
                    (decompiledFrameRemainder13) &&
                    (decompiledFrameRemainder12) &&
                    (decompiledFrameRemainder11) &&
                    (decompiledFrameRemainder10) &&
                    (decompiledFrameRemainder9) &&
                    (decompiledFrameRemainder8)) {
                    if (!fe.field_e) {
                      break L128;
                    }
                    if (a.field_h[0].field_i > 0) {
                      break L128;
                    }
                    ll.field_c.a(sb.field_e[21], 100, 2 * pk.field_h);
                    if (var15 == 0) {
                      break L128;
                    }
                  }
                  if ((decompiledFrameRemainder14) &&
                    (decompiledFrameRemainder13) &&
                    (decompiledFrameRemainder12) &&
                    (decompiledFrameRemainder11) &&
                    (decompiledFrameRemainder10) &&
                    (decompiledFrameRemainder9)) {
                    if (!fe.field_e) {
                      break L128;
                    }
                    if (0 < af.field_o) {
                      break L128;
                    }
                    ll.field_c.a(sb.field_e[24], 100, 2 * pk.field_h);
                    af.field_o = 3;
                    if (var15 == 0) {
                      break L128;
                    }
                  }
                  if ((decompiledFrameRemainder14) &&
                    (decompiledFrameRemainder13) &&
                    (decompiledFrameRemainder12) &&
                    (decompiledFrameRemainder11) &&
                    (decompiledFrameRemainder10)) {
                    if (!fe.field_e) {
                      break L128;
                    }
                    if (0 < a.field_h[0].field_i) {
                      break L128;
                    }
                    ll.field_c.a(sb.field_e[39], 100, pk.field_h * 2);
                    if (var15 == 0) {
                      break L128;
                    }
                  }
                  if ((decompiledFrameRemainder14) &&
                    (decompiledFrameRemainder13) &&
                    (decompiledFrameRemainder12) &&
                    (decompiledFrameRemainder11)) {
                    if (!fe.field_e) {
                      break L128;
                    }
                    if (a.field_h[0].field_i > 0) {
                      break L128;
                    }
                    ll.field_c.a(sb.field_e[22], 100, 2 * pk.field_h);
                    if (var15 == 0) {
                      break L128;
                    }
                  }
                  if ((decompiledFrameRemainder14) &&
                    (decompiledFrameRemainder13) &&
                    (decompiledFrameRemainder12)) {
                    if (!fe.field_e) {
                      break L128;
                    }
                    if (a.field_h[0].field_i > 0) {
                      break L128;
                    }
                    ll.field_c.a(sb.field_e[34], 100, 2 * pk.field_h);
                    if (var15 == 0) {
                      break L128;
                    }
                  }
                  if ((decompiledFrameRemainder14) &&
                    (decompiledFrameRemainder13)) {
                    if (!fe.field_e) {
                      break L128;
                    }
                    if (af.field_o > 0) {
                      break L128;
                    }
                    ll.field_c.a(sb.field_e[20], 100, pk.field_h * 2);
                    af.field_o = (int)(Math.random() * 10.0) + 15;
                    if (var15 == 0) {
                      break L128;
                    }
                  }
                  if (decompiledFrameRemainder14) {
                    if (!fe.field_e) {
                      break L128;
                    }
                    if (af.field_o > 0) {
                      break L128;
                    }
                    ll.field_c.a(sb.field_e[7], 100, 2 * pk.field_h);
                    af.field_o = 5;
                    if (var15 == 0) {
                      break L128;
                    }
                  }
                  if (fe.field_e &&
                    a.field_h[0].field_i == -1) {
                    ll.field_c.a(sb.field_e[25], 100, pk.field_h * 2);
                  }
                }
                if (a.field_h[0].field_i <= 0) {
                  boolean decompiledFrameRemainder3 = true;
                  var4 = e.field_e;
                  if (var4 != -1 ||
                    var15 != 0) {
                    boolean decompiledFrameCompleted9 = true;
                    boolean decompiledFrameCompleted8 = true;
                    if (var4 == 0) {
                      fieldTemp$13 = mj.field_F + 1;
                      mj.field_F = mj.field_F + 1;
                      if (fieldTemp$13 > 1) {
                        mj.field_F = 0;
                      }
                      a.field_h[0].field_i = 10;
                      var4 = -4;
                      while (var4 <= 4) {
                        var2_ref = new vl(0, a.field_h[0]);
                        var2_ref.field_j = var2_ref.field_j - Math.sin(2.0 * ((double)(a.field_h[0].field_h + 1 * var4) * 3.141592653589793) / 256.0) * 8.0;
                        var2_ref.field_a = var2_ref.field_a - Math.cos(3.141592653589793 * (double)(1 * var4 + a.field_h[0].field_h) * 2.0 / 256.0) * 8.0;
                        var2_ref.field_k = -((double)var4 * var2_ref.field_j / 4.0) + (a.field_h[0].field_l + 2.0 * var2_ref.field_a);
                        var2_ref.field_c = var2_ref.field_a * (double)var4 / 4.0 + (a.field_h[0].field_a + 2.0 * var2_ref.field_j);
                        var2_ref.field_q = 255;
                        var2_ref.field_a = var2_ref.field_a + a.field_h[0].field_k;
                        var2_ref.field_n = e.field_e;
                        var2_ref.field_p = 2;
                        var2_ref.field_j = var2_ref.field_j + a.field_h[0].field_d;
                        stackIn_993_0 = ~var4;
                        stackIn_993_1 = -1;
                        if (var15 != 0) {
                          decompiledFrameCompleted9 = false;
                          break;
                        }
                        if (stackIn_993_0 == stackIn_993_1 &&
                          mj.field_F == 0 ||
                          var4 != 0 &&
                          1 == mj.field_F) {
                          var2_ref.field_q = 8421631;
                        }
                        wk.field_b[eg.a(-109)] = var2_ref;
                        var4 += 4;
                      }
                      decompiledFrameRemainder20 = !(decompiledFrameCompleted9);
                    }
                    if ((decompiledFrameRemainder20) &&
                      (decompiledFrameCompleted9)) {
                      if (var4 == 1) {
                        fieldTemp$14 = mj.field_F + 1;
                        mj.field_F = mj.field_F + 1;
                        if (fieldTemp$14 > 1) {
                          mj.field_F = 0;
                        }
                        a.field_h[0].field_i = 5;
                        var4 = -3;
                        while (var4 <= 3) {
                          var2_refLifetime2 = new vl(0, a.field_h[0]);
                          var2_refLifetime2.field_j = var2_refLifetime2.field_j - Math.sin(2.0 * (3.141592653589793 * (double)(a.field_h[0].field_h + var4)) / 256.0) * 6.0;
                          var2_refLifetime2.field_a = var2_refLifetime2.field_a - 6.0 * Math.cos((double)(a.field_h[0].field_h + var4) * 3.141592653589793 * 2.0 / 256.0);
                          var2_refLifetime2.field_k = a.field_h[0].field_l + var2_refLifetime2.field_a * 4.0 - (double)var4 * var2_refLifetime2.field_j / 2.0;
                          var2_refLifetime2.field_c = var2_refLifetime2.field_a * (double)var4 / 2.0 + (var2_refLifetime2.field_j * 4.0 + a.field_h[0].field_a);
                          var2_refLifetime2.field_j = var2_refLifetime2.field_j + a.field_h[0].field_d;
                          var2_refLifetime2.field_a = var2_refLifetime2.field_a + a.field_h[0].field_k;
                          var2_refLifetime2.field_p = 1;
                          wk.field_b[eg.a(-91)] = var2_refLifetime2;
                          var2_refLifetime2.field_q = 16728128;
                          var2_refLifetime2.field_n = e.field_e;
                          stackIn_993_0 = ~Math.abs(var4);
                          stackIn_993_1 = -2;
                          if (var15 != 0) {
                            decompiledFrameCompleted8 = false;
                            break;
                          }
                          if (stackIn_993_0 >= stackIn_993_1 &&
                            mj.field_F == 0 ||
                            !(Math.abs(var4) <= 1) &&
                            mj.field_F == 1) {
                            var2_refLifetime2.field_q = 16760896;
                          }
                          var4 += 2;
                        }
                        decompiledFrameRemainder20 = !(decompiledFrameCompleted8);
                      }
                      if ((decompiledFrameRemainder20) &&
                        (decompiledFrameCompleted8)) {
                        if (var4 == 2 &&
                          var15 == 0) {
                          a.field_h[0].field_i = 6;
                          fieldTemp$15 = mj.field_F + 1;
                          mj.field_F = mj.field_F + 1;
                          if (fieldTemp$15 > 3) {
                            mj.field_F = 0;
                          }
                          var4 = -1;
                          while (var4 <= 1) {
                            var2_refLifetime2 = new vl(0, a.field_h[0]);
                            stackIn_981_0 = ~var4;
                            if (stackIn_981_0 == 0) {
                              mj.field_F = 3 - mj.field_F;
                            }
                            var2_refLifetime2.field_j = var2_refLifetime2.field_j - Math.sin(3.141592653589793 * (double)(a.field_h[0].field_h + 4 * (1 + mj.field_F) * var4) * 2.0 / 256.0) * 6.0;
                            var2_refLifetime2.field_a = var2_refLifetime2.field_a - Math.cos((double)(a.field_h[0].field_h + (mj.field_F + 1) * (var4 * 4)) * 3.141592653589793 * 2.0 / 256.0) * 6.0;
                            var2_refLifetime2.field_c = var2_refLifetime2.field_j * 3.0 + a.field_h[0].field_a;
                            if (var4 == -1) {
                              mj.field_F = -mj.field_F + 3;
                            }
                            var2_refLifetime2.field_k = a.field_h[0].field_l + var2_refLifetime2.field_a * 3.0;
                            var2_refLifetime2.field_j = var2_refLifetime2.field_j + a.field_h[0].field_d;
                            var2_refLifetime2.field_a = var2_refLifetime2.field_a + a.field_h[0].field_k;
                            var2_refLifetime2.field_q = 255;
                            var2_refLifetime2.field_p = 4;
                            var2_refLifetime2.field_n = e.field_e;
                            if (var4 == 0 &&
                              0 == mj.field_F % 2 ||
                              var4 != 0 &&
                              mj.field_F % 2 == 1) {
                              var2_refLifetime2.field_q = 8421631;
                            }
                            wk.field_b[eg.a(-51)] = var2_refLifetime2;
                            var4 += 2;
                          }
                          decompiledFrameRemainder20 = false;
                        }
                        else {
                          if (3 == var4 &&
                            var15 == 0) {
                            a.field_h[0].field_i = 10;
                            var4 = -3;
                            while (var4 <= 3) {
                              var2_refLifetime2 = new vl(0, a.field_h[0]);
                              var5_double = 5.0;
                              stackIn_993_0 = ~Math.abs(var4);
                              stackIn_993_1 = -4;
                              if (stackIn_993_0 == stackIn_993_1) {
                                var5_double = 4.5;
                              }
                              if (2 == Math.abs(var4)) {
                                var5_double = 4.8;
                              }
                              var2_refLifetime2.field_j = var2_refLifetime2.field_j - var5_double * Math.sin((double)(var4 + a.field_h[0].field_h) * 3.141592653589793 * 2.0 / 256.0);
                              var2_refLifetime2.field_a = var2_refLifetime2.field_a - var5_double * Math.cos((double)(a.field_h[0].field_h + var4) * 3.141592653589793 * 2.0 / 256.0);
                              var2_refLifetime2.field_k = var2_refLifetime2.field_a * 4.0 + a.field_h[0].field_l;
                              var2_refLifetime2.field_c = a.field_h[0].field_a + var2_refLifetime2.field_j * 4.0;
                              var2_refLifetime2.field_a = var2_refLifetime2.field_a + a.field_h[0].field_k / 5.0;
                              var2_refLifetime2.field_j = var2_refLifetime2.field_j + a.field_h[0].field_d / 5.0;
                              var2_refLifetime2.field_q = 16711680;
                              var2_refLifetime2.field_d = 16744576;
                              var2_refLifetime2.field_p = 3;
                              if (2 == Math.abs(var4)) {
                                var2_refLifetime2.field_q = 16711680;
                                var2_refLifetime2.field_d = 16760960;
                              }
                              if (Math.abs(var4) == 1) {
                                var2_refLifetime2.field_q = 16711680;
                                var2_refLifetime2.field_d = 16777088;
                              }
                              if (Math.abs(var4) == 0) {
                                var2_refLifetime2.field_q = 16711680;
                                var2_refLifetime2.field_d = 16777088;
                              }
                              wk.field_b[eg.a(-67)] = var2_refLifetime2;
                              var2_refLifetime2.field_n = e.field_e;
                              var2_refLifetime2.field_l = 5;
                              var4++;
                            }
                            decompiledFrameRemainder20 = false;
                          }
                          else {
                            if (var4 == 4 &&
                              var15 == 0) {
                              a.field_h[0].field_i = 0;
                              var2_refLifetime2 = new vl(0, a.field_h[0]);
                              var2_refLifetime2.field_j = var2_refLifetime2.field_j - Math.sin(2.0 * (3.141592653589793 * (double)a.field_h[0].field_h) / 256.0) * 8.0;
                              var2_refLifetime2.field_a = var2_refLifetime2.field_a - Math.cos((double)a.field_h[0].field_h * 3.141592653589793 * 2.0 / 256.0) * 8.0;
                              var2_refLifetime2.field_q = 12422335;
                              var2_refLifetime2.field_m = 2;
                              var2_refLifetime2.field_k = var2_refLifetime2.field_a * 2.0 + a.field_h[0].field_l;
                              var2_refLifetime2.field_d = 9578383;
                              var2_refLifetime2.field_c = 2.0 * var2_refLifetime2.field_j + a.field_h[0].field_a;
                              var2_refLifetime2.field_l = 1000;
                              var2_refLifetime2.field_p = 1;
                              var4 = eg.a(-36);
                              if (var4 != -1) {
                                wk.field_b[var4] = var2_refLifetime2;
                              }
                              var2_refLifetime2.field_n = e.field_e;
                              decompiledFrameRemainder20 = false;
                            }
                            else {
                              if (5 == var4 &&
                                var15 == 0) {
                                a.field_h[0].field_i = 35;
                                var4 = -30;
                                while (30 >= var4) {
                                  var2_refLifetime2 = new vl(0, a.field_h[0]);
                                  var2_refLifetime2.field_j = var2_refLifetime2.field_j - Math.sin(3.141592653589793 * (double)(var4 + a.field_h[0].field_h) * 2.0 / 256.0) * 4.0;
                                  var2_refLifetime2.field_a = var2_refLifetime2.field_a - 4.0 * Math.cos((double)(var4 + a.field_h[0].field_h) * 3.141592653589793 * 2.0 / 256.0);
                                  var2_refLifetime2.field_c = a.field_h[0].field_a + var2_refLifetime2.field_j * 4.0;
                                  var2_refLifetime2.field_k = a.field_h[0].field_l + 4.0 * var2_refLifetime2.field_a;
                                  var2_refLifetime2.field_j = var2_refLifetime2.field_j + a.field_h[0].field_d;
                                  var2_refLifetime2.field_p = 1;
                                  var2_refLifetime2.field_a = var2_refLifetime2.field_a + a.field_h[0].field_k;
                                  var2_refLifetime2.field_q = 65280 + (Math.abs(var4) * 255 / 30 << 16 & 16771312);
                                  wk.field_b[eg.a(-54)] = var2_refLifetime2;
                                  var2_refLifetime2.field_n = e.field_e;
                                  var4++;
                                }
                                decompiledFrameRemainder20 = false;
                              }
                              else {
                                if (6 == var4) {
                                  a.field_h[0].field_i = 5;
                                  var4 = -10;
                                  while (var4 <= 10) {
                                    var2_refLifetime2 = new vl(0, a.field_h[0]);
                                    var2_refLifetime2.field_j = var2_refLifetime2.field_j - Math.sin((double)(var4 + a.field_h[0].field_h) * 3.141592653589793 * 2.0 / 256.0) * 6.0;
                                    var2_refLifetime2.field_a = var2_refLifetime2.field_a - 6.0 * Math.cos(2.0 * ((double)(a.field_h[0].field_h + var4) * 3.141592653589793) / 256.0);
                                    var2_refLifetime2.field_c = var2_refLifetime2.field_j * 4.0 + a.field_h[0].field_a;
                                    var2_refLifetime2.field_k = a.field_h[0].field_l + var2_refLifetime2.field_a * 4.0;
                                    var2_refLifetime2.field_p = 1;
                                    var2_refLifetime2.field_d = 65535;
                                    var2_refLifetime2.field_a = var2_refLifetime2.field_a + a.field_h[0].field_k;
                                    var2_refLifetime2.field_q = 16776960;
                                    var2_refLifetime2.field_j = var2_refLifetime2.field_j + a.field_h[0].field_d;
                                    wk.field_b[eg.a(-113)] = var2_refLifetime2;
                                    var2_refLifetime2.field_n = e.field_e;
                                    var4 += 4;
                                    if (var15 != 0) {
                                      decompiledFrameCompleted7 = false;
                                      break;
                                    }
                                  }
                                  decompiledFrameRemainder20 = !(decompiledFrameCompleted7);
                                }
                                if ((decompiledFrameRemainder20) &&
                                  (decompiledFrameCompleted7)) {
                                  if (var4 == 7 &&
                                    var15 == 0) {
                                    a.field_h[0].field_i = 10;
                                    var4 = -11;
                                    while (var4 <= -9) {
                                      var2_refLifetime2 = new vl(0, a.field_h[0]);
                                      var5_doubleLifetime1 = 5.0;
                                      stackIn_919_0 = 3;
                                      stackIn_919_1 = Math.abs(var4 + 10);
                                      if (stackIn_919_0 == stackIn_919_1) {
                                        var5_doubleLifetime1 = 4.5;
                                      }
                                      if (2 == Math.abs(var4 + 10)) {
                                        var5_doubleLifetime1 = 4.8;
                                      }
                                      var2_refLifetime2.field_j = var2_refLifetime2.field_j - var5_doubleLifetime1 * Math.sin(2.0 * ((double)(var4 + a.field_h[0].field_h) * 3.141592653589793) / 256.0);
                                      var2_refLifetime2.field_a = var2_refLifetime2.field_a - var5_doubleLifetime1 * Math.cos(2.0 * (3.141592653589793 * (double)(var4 + a.field_h[0].field_h)) / 256.0);
                                      var2_refLifetime2.field_c = a.field_h[0].field_a + 4.0 * var2_refLifetime2.field_j;
                                      var2_refLifetime2.field_k = a.field_h[0].field_l + var2_refLifetime2.field_a * 4.0;
                                      var2_refLifetime2.field_l = 5;
                                      var2_refLifetime2.field_a = var2_refLifetime2.field_a + a.field_h[0].field_k / 5.0;
                                      var2_refLifetime2.field_d = 8454143;
                                      var2_refLifetime2.field_q = 255;
                                      var2_refLifetime2.field_p = 2;
                                      var2_refLifetime2.field_j = var2_refLifetime2.field_j + a.field_h[0].field_d / 5.0;
                                      wk.field_b[eg.a(-71)] = var2_refLifetime2;
                                      var2_refLifetime2.field_n = e.field_e;
                                      var4++;
                                    }
                                    var4 = -3;
                                    while (true) {
                                      stackIn_919_0Lifetime1 = var4;
                                      stackIn_919_1Lifetime1 = 3;
                                      if (stackIn_919_0Lifetime1 > stackIn_919_1Lifetime1) {
                                        break;
                                      }
                                      var2_refLifetime2 = new vl(0, a.field_h[0]);
                                      var5_doubleLifetime1 = 5.0;
                                      stackIn_930_0 = ~Math.abs(var4);
                                      stackIn_930_1 = -4;
                                      if (stackIn_930_0 == stackIn_930_1) {
                                        var5_doubleLifetime1 = 4.5;
                                      }
                                      if (Math.abs(var4) == 2) {
                                        var5_doubleLifetime1 = 4.8;
                                      }
                                      var2_refLifetime2.field_j = var2_refLifetime2.field_j - var5_doubleLifetime1 * Math.sin(3.141592653589793 * (double)(var4 + a.field_h[0].field_h) * 2.0 / 256.0);
                                      var2_refLifetime2.field_a = var2_refLifetime2.field_a - var5_doubleLifetime1 * Math.cos(2.0 * (3.141592653589793 * (double)(var4 + a.field_h[0].field_h)) / 256.0);
                                      var2_refLifetime2.field_c = var2_refLifetime2.field_j * 4.0 + a.field_h[0].field_a;
                                      var2_refLifetime2.field_k = var2_refLifetime2.field_a * 4.0 + a.field_h[0].field_l;
                                      var2_refLifetime2.field_p = 3;
                                      var2_refLifetime2.field_a = var2_refLifetime2.field_a + a.field_h[0].field_k / 5.0;
                                      var2_refLifetime2.field_q = 49407;
                                      var2_refLifetime2.field_d = 8454143;
                                      var2_refLifetime2.field_j = var2_refLifetime2.field_j + a.field_h[0].field_d / 5.0;
                                      wk.field_b[eg.a(-40)] = var2_refLifetime2;
                                      var2_refLifetime2.field_n = e.field_e;
                                      var2_refLifetime2.field_l = 5;
                                      var4++;
                                    }
                                    var4 = 9;
                                    while (true) {
                                      stackIn_930_0Lifetime1 = ~var4;
                                      stackIn_930_1Lifetime1 = -12;
                                      if (stackIn_930_0Lifetime1 < stackIn_930_1Lifetime1) {
                                        break;
                                      }
                                      var2_refLifetime2 = new vl(0, a.field_h[0]);
                                      var5_doubleLifetime1 = 5.0;
                                      stackIn_993_0 = Math.abs(var4 - 10);
                                      stackIn_993_1 = 3;
                                      if (stackIn_993_0 == stackIn_993_1) {
                                        var5_doubleLifetime1 = 4.5;
                                      }
                                      if (Math.abs(var4 - 10) == 2) {
                                        var5_doubleLifetime1 = 4.8;
                                      }
                                      var2_refLifetime2.field_j = var2_refLifetime2.field_j - var5_doubleLifetime1 * Math.sin(2.0 * (3.141592653589793 * (double)(var4 + a.field_h[0].field_h)) / 256.0);
                                      var2_refLifetime2.field_a = var2_refLifetime2.field_a - Math.cos(2.0 * ((double)(a.field_h[0].field_h + var4) * 3.141592653589793) / 256.0) * var5_doubleLifetime1;
                                      var2_refLifetime2.field_k = 4.0 * var2_refLifetime2.field_a + a.field_h[0].field_l;
                                      var2_refLifetime2.field_c = a.field_h[0].field_a + 4.0 * var2_refLifetime2.field_j;
                                      var2_refLifetime2.field_q = 255;
                                      var2_refLifetime2.field_p = 2;
                                      var2_refLifetime2.field_j = var2_refLifetime2.field_j + a.field_h[0].field_d / 5.0;
                                      var2_refLifetime2.field_a = var2_refLifetime2.field_a + a.field_h[0].field_k / 5.0;
                                      var2_refLifetime2.field_d = 8454143;
                                      wk.field_b[eg.a(-112)] = var2_refLifetime2;
                                      var2_refLifetime2.field_n = e.field_e;
                                      var2_refLifetime2.field_l = 5;
                                      var4++;
                                    }
                                    decompiledFrameRemainder20 = false;
                                  }
                                  else {
                                    if (var4 == 8 &&
                                      var15 == 0) {
                                      a.field_h[0].field_i = 1;
                                      var4 = 0;
                                      while (10 > var4) {
                                        var5_doubleLifetime1Lifetime1 = -8.0 + Math.random() * 17.0;
                                        var2_refLifetime2 = new vl(4, a.field_h[0]);
                                        var2_refLifetime2.field_q = 16776960;
                                        var2_refLifetime2.field_j = var2_refLifetime2.field_j - 5.0 * Math.sin(2.0 * (3.141592653589793 * (var5_doubleLifetime1Lifetime1 + (double)a.field_h[0].field_h)) / 256.0);
                                        var2_refLifetime2.field_a = var2_refLifetime2.field_a - 5.0 * Math.cos(2.0 * (((double)a.field_h[0].field_h + var5_doubleLifetime1Lifetime1) * 3.141592653589793) / 256.0);
                                        var2_refLifetime2.field_c = var2_refLifetime2.field_j * 3.0 + a.field_h[0].field_a;
                                        var2_refLifetime2.field_k = a.field_h[0].field_l + var2_refLifetime2.field_a * 3.0;
                                        var2_refLifetime2.field_j = var2_refLifetime2.field_j + a.field_h[0].field_d;
                                        var2_refLifetime2.field_p = 2;
                                        var2_refLifetime2.field_m = 1;
                                        var2_refLifetime2.field_a = var2_refLifetime2.field_a + a.field_h[0].field_k;
                                        wk.field_b[eg.a(-80)] = var2_refLifetime2;
                                        var4++;
                                      }
                                      decompiledFrameRemainder20 = false;
                                    }
                                    else {
                                      if (var4 == 9) {
                                        a.field_h[0].field_i = 1;
                                        var4 = -2;
                                        while (var4 <= 2) {
                                          var2_refLifetime2 = new vl(0, a.field_h[0]);
                                          var2_refLifetime2.field_j = var2_refLifetime2.field_j - Math.sin(2.0 * ((double)(var4 + a.field_h[0].field_h) * 3.141592653589793) / 256.0) * 2.0;
                                          var2_refLifetime2.field_a = var2_refLifetime2.field_a - Math.cos(2.0 * (3.141592653589793 * (double)(a.field_h[0].field_h + var4)) / 256.0) * 2.0;
                                          var2_refLifetime2.field_m = 2;
                                          var2_refLifetime2.field_q = 16711680;
                                          var2_refLifetime2.field_d = 16776960;
                                          var2_refLifetime2.field_k = 8.0 * var2_refLifetime2.field_a + a.field_h[0].field_l;
                                          var2_refLifetime2.field_p = 1;
                                          var2_refLifetime2.field_c = 8.0 * var2_refLifetime2.field_j + a.field_h[0].field_a;
                                          wk.field_b[eg.a(-70)] = var2_refLifetime2;
                                          var2_refLifetime2.field_l = 1001;
                                          var2_refLifetime2.field_n = e.field_e;
                                          var4 += 4;
                                          if (var15 != 0) {
                                            decompiledFrameCompleted6 = false;
                                            break;
                                          }
                                        }
                                        decompiledFrameRemainder20 = !(decompiledFrameCompleted6);
                                      }
                                      if (((decompiledFrameRemainder20) && (decompiledFrameCompleted6)) &&
                                        (decompiledFrameRemainder20 = (10 == var4)) &&
                                        (decompiledFrameRemainder3 = (var15 == 0))) {
                                        dupTemp$16 = a.field_h[0];
                                        dupTemp$16.field_i = dupTemp$16.field_i - 1;
                                        if (a.field_h[0].field_i <= -25) {
                                          a.field_h[0].field_i = 10;
                                        }
                                        var3 = -a.field_h[0].field_i;
                                        if (15 < var3) {
                                          var3 = -var3 + 25;
                                        }
                                        if (var3 > 10) {
                                          var3 = 10;
                                        }
                                        if (var3 < 1) {
                                          var3 = 1;
                                        }
                                        var4 = -1;
                                        while (var4 <= 1) {
                                          var2_refLifetime2 = new vl(0, a.field_h[0]);
                                          var2_refLifetime2.field_j = var2_refLifetime2.field_j - Math.sin(2.0 * (3.141592653589793 * (double)(a.field_h[0].field_h + 0 * var4)) / 256.0) * 8.0;
                                          var2_refLifetime2.field_a = var2_refLifetime2.field_a - Math.cos(2.0 * (3.141592653589793 * (double)(a.field_h[0].field_h + var4 * 0)) / 256.0) * 8.0;
                                          var2_refLifetime2.field_m = 2;
                                          var2_refLifetime2.field_p = var3;
                                          var2_refLifetime2.field_q = 65535;
                                          var2_refLifetime2.field_d = 16777215;
                                          var2_refLifetime2.field_c = (double)var4 * var2_refLifetime2.field_a * (double)var3 / 10.0 + (var2_refLifetime2.field_j * 2.0 + a.field_h[0].field_a);
                                          var2_refLifetime2.field_k = a.field_h[0].field_l + var2_refLifetime2.field_a * 2.0 - var2_refLifetime2.field_j * (double)var4 * (double)var3 / 10.0;
                                          wk.field_b[eg.a(-75)] = var2_refLifetime2;
                                          var2_refLifetime2.field_l = 6;
                                          var2_refLifetime2.field_n = e.field_e;
                                          stackIn_981_0Lifetime2 = var4;
                                          if (stackIn_981_0Lifetime2 != 0) {
                                            var2_refLifetime2.field_n = 11;
                                          }
                                          var4++;
                                        }
                                        decompiledFrameRemainder20 = false;
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
                    if ((decompiledFrameRemainder20) &&
                      (decompiledFrameRemainder3) &&
                      (decompiledFrameCompleted7) &&
                      (decompiledFrameCompleted6)) {
                      while (true) {
                        if (stackIn_993_0 == stackIn_993_1 &&
                          ph.field_D >= 2) {
                          e.field_e = e.field_e + 1;
                          e.field_c = true;
                          if (e.field_e > 10) {
                            e.field_e = -1;
                          }
                        }
                        if (41 == gi.field_f &&
                          ph.field_D >= 2) {
                          stackIn_1012_0 = !(hd.field_b);
                          hd.field_b = stackIn_1012_0;
                        }
                        if (gi.field_f == 48 &&
                          ph.field_D >= 2) {
                          hj.a(255, 0, 1);
                        }
                        if (gi.field_f == 13) {
                          decompiledFrameCompleted5 = false;
                          break;
                        }
                        if (!qh.c(89)) {
                          decompiledFrameCompleted4 = false;
                          break;
                        }
                        stackIn_1026_0 = ~gi.field_f;
                        if (var15 != 0) {
                          decompiledFrameCompleted3 = false;
                          break;
                        }
                        stackIn_993_0 = stackIn_1026_0;
                        stackIn_993_1 = -34;
                      }
                    }
                  }
                  if ((decompiledFrameRemainder20) &&
                    (decompiledFrameCompleted7) &&
                    (decompiledFrameCompleted6) &&
                    (decompiledFrameCompleted5) &&
                    (decompiledFrameCompleted4) &&
                    (decompiledFrameCompleted3)) {
                    fieldTemp$17 = mj.field_F + 1;
                    mj.field_F = mj.field_F + 1;
                    if (fieldTemp$17 > 4) {
                      mj.field_F = 0;
                    }
                    a.field_h[0].field_i = 5;
                    var4 = mj.field_F - 1;
                    if (var4 == 2) {
                      var4 = 0;
                    }
                    if (var4 == 3) {
                      var4 = -1;
                    }
                    var2_refLifetime1 = new vl(0, a.field_h[0]);
                    var2_refLifetime1.field_j = var2_refLifetime1.field_j - Math.sin(2.0 * ((double)(var4 + a.field_h[0].field_h) * 3.141592653589793) / 256.0) * 8.0;
                    var2_refLifetime1.field_a = var2_refLifetime1.field_a - Math.cos((double)(var4 + a.field_h[0].field_h) * 3.141592653589793 * 2.0 / 256.0) * 8.0;
                    var2_refLifetime1.field_k = var2_refLifetime1.field_a * 2.0 + a.field_h[0].field_l;
                    var2_refLifetime1.field_c = a.field_h[0].field_a + var2_refLifetime1.field_j * 2.0;
                    var2_refLifetime1.field_q = 255;
                    var2_refLifetime1.field_p = 1;
                    var2_refLifetime1.field_n = e.field_e;
                    var2_refLifetime1.field_j = var2_refLifetime1.field_j + a.field_h[0].field_d;
                    var2_refLifetime1.field_a = var2_refLifetime1.field_a + a.field_h[0].field_k;
                    if (0 == var4) {
                      var2_refLifetime1.field_q = 8421631;
                      var2_refLifetime1.field_p = 2;
                    }
                    wk.field_b[eg.a(-27)] = var2_refLifetime1;
                  }
                }
              }
            }
          }
          if ((decompiledFrameCompleted5) &&
            (decompiledFrameCompleted4) &&
            (decompiledFrameCompleted3)) {
            stackIn_981_0Lifetime1 = s.field_i ? 1 : 0;
            decompiledFrameRemainder17 = (stackIn_981_0Lifetime1 != 0);
            if ((decompiledFrameRemainder17) &&
              (decompiledFrameRemainder17 = (na.field_j == null))) {
              while (qh.c(89)) {
                stackIn_1026_0 = ~gi.field_f;
                if (var15 != 0) {
                  decompiledFrameCompleted2 = false;
                  break;
                }
                stackIn_993_0Lifetime1 = stackIn_1026_0;
                stackIn_993_1Lifetime1 = -34;
                if (stackIn_993_0Lifetime1 == stackIn_993_1Lifetime1 &&
                  ph.field_D >= 2) {
                  e.field_e = e.field_e + 1;
                  e.field_c = true;
                  if (e.field_e > 10) {
                    e.field_e = -1;
                  }
                }
                if (41 == gi.field_f &&
                  ph.field_D >= 2) {
                  stackIn_1012_0Lifetime1 = !(hd.field_b);
                  hd.field_b = stackIn_1012_0Lifetime1;
                }
                if (gi.field_f == 48 &&
                  ph.field_D >= 2) {
                  hj.a(255, 0, 1);
                }
                if (gi.field_f == 13) {
                  decompiledFrameCompleted1 = false;
                  break;
                }
              }
              if (decompiledFrameCompleted2) {
                decompiledFrameRemainder17 = !(decompiledFrameCompleted1);
              }
            }
          }
          if ((decompiledFrameRemainder17) &&
            (decompiledFrameCompleted4) &&
            (decompiledFrameCompleted3) &&
            (decompiledFrameCompleted2)) {
            na.field_j = new ij(this);
            tl.field_c = 0;
            return;
          }
          if ((decompiledFrameCompleted3) &&
            (decompiledFrameCompleted2)) {
            this.q(50);
            stackIn_1026_0 = 0;
          }
          var2_int = stackIn_1026_0;
          var3 = 0;
          var4 = 0;
          var5 = 0;
          L230: while (true) {
            boolean decompiledFrameRemainder2 = true;
            boolean decompiledFrameRemainder19 = true;
            boolean decompiledFrameRemainder1 = true;
            if (var5 < 1000) {
              stackIn_1090_0 = a.field_h[var5];
              if (var15 == 0) {
                if (stackIn_1090_0 != null &&
                  14 == a.field_h[var5].field_m &&
                  var5 < 999 && (null == a.field_h[1 + var5] ||
                  a.field_h[1 + var5].field_m != 14)) {
                  var6_ref_qe = a.field_h[var5];
                  a.field_h[var5] = a.field_h[1 + var5];
                  a.field_h[1 + var5] = var6_ref_qe;
                }
                if (a.field_h[var5] != null) {
                  if (a.field_h[var5].field_m != -1) {
                    if (a.field_h[var5].field_m != 11) {
                      var4++;
                      if (1 == a.field_h[var5].field_m) {
                        var4 += 2;
                      }
                      if (a.field_h[var5].field_m == 5) {
                        var4 += 2;
                      }
                      if (3 == a.field_h[var5].field_m) {
                        var4 += 2;
                      }
                      if (7 == a.field_h[var5].field_m) {
                        var4 += 4;
                      }
                      if (6 == a.field_h[var5].field_m) {
                        var4 += 4;
                      }
                      if (a.field_h[var5].field_m == 14) {
                        var4 += 20;
                      }
                    }
                  } else {
                    var2_int = (int)a.field_h[var5].field_a;
                    var3 = (int)a.field_h[var5].field_l;
                  }
                  a.field_h[var5] = a.field_h[var5].a(-95);
                }
                var5++;
                continue;
              }
            } else {
              decompiledFrameRemainder2 = !(!s.field_i);
              if (((decompiledFrameRemainder2) &&
                (decompiledFrameRemainder2 = !(!pk.a(-12663, 0)))) &&
                (decompiledFrameRemainder1 = (null != a.field_h[0])) &&
                (decompiledFrameRemainder1 = (a.field_h[0].field_m == -1))) {
                stackIn_1090_0 = a.field_h[0];
              }
            }
            if ((decompiledFrameRemainder2) && (decompiledFrameRemainder1) && (stackIn_1090_0.field_g <= 0 &&
              0 == nc.field_H)) {
              stackIn_1097_0 = 1;
              decompiledFrameRemainder19 = false;
            }
            if ((decompiledFrameRemainder19) &&
              (decompiledFrameRemainder2)) {
              stackIn_1097_0 = 0;
            }
            if (decompiledFrameRemainder2) {
              var5 = stackIn_1097_0;
              if (var5 == 0) {
                pk.field_c = pk.field_c - 1;
                if (pk.field_c < 0) {
                  var6 = gh.field_b;
                  if (var6 > 5) {
                    var6 = 5;
                  }
                  pk.field_c = 25 + var6 * 25;
                  var7 = 160 - var6 * 32;
                  if (var7 > 0 &&
                    fe.field_e) {
                    ll.field_c.a(sb.field_e[46], var7, pk.field_h * 6);
                  }
                }
              }
              gf.field_c = gf.field_c + 1;
              var6_double = 1.7976931348623157e+308;
              var8 = null;
              var9 = 0;
              while (var9 < 1000) {
                var10 = a.field_h[var9];
                if (var15 != 0) {
                  break L230;
                }
                if (var10 != null &&
                  var10.field_m != -1 &&
                  var10.a((byte) -102)) {
                  var11 = -(int)var10.field_a + var2_int;
                  var12 = var3 - (int)var10.field_l;
                  var13 = Math.sqrt((double)(var12 * var12 + var11 * var11));
                  if (var13 < var6_double) {
                    var6_double = var13;
                    var8 = var10;
                  }
                }
                var9++;
              }
              if (null != var8) {
                var9Lifetime1 = 128;
                if (var6_double > 0.0) {
                  var9Lifetime1 = (int)(2560.0 / var6_double);
                }
                if (var9Lifetime1 > 128) {
                  var9Lifetime1 = 128;
                }
                ag.field_a = ag.field_a + var9Lifetime1;
                if (!(256 >= ag.field_a)) {
                  if (fe.field_e) {
                    ll.field_c.a(sb.field_e[13], var9Lifetime1, pk.field_h * 64 / 50);
                  }
                  ag.field_a = 0;
                }
              }
            }
            fb.field_b = fb.field_b - var2_int;
            tk.field_b = tk.field_b - var3;
            sg.field_a.a(1.0, 0.0, 0.0, (byte) -20, 0.001 * (double)var3);
            this.field_H.a(sg.field_a, -125);
            sg.field_a.a(0.0, 0.0, 1.0, (byte) -20, 0.001 * (double)(-var2_int));
            this.field_H.a(sg.field_a, -126);
            var5 = 0;
            break;
          }
          var6 = 0;
          L255: while (true) {
            L256: {
              boolean decompiledFrameRemainder21 = true;
              boolean decompiledFrameCompleted0 = true;
              boolean decompiledFrameRemainder18 = true;
              if (var6 < 12) {
                fk.field_k[var5] = fk.field_k[var5] + (-(var2_int << 4) + fk.field_k[var5 + 2]);
                fk.field_k[1 + var5] = fk.field_k[1 + var5] + (fk.field_k[var5 + 3] - (var3 << 4));
                stackIn_1168_0 = fk.field_k[var5];
                stackIn_1168_1 = -2048;
                if (var15 != 0) {
                  if (stackIn_1168_0 < stackIn_1168_1) {
                    stackIn_1220_0 = wk.field_b[var5];
                    decompiledFrameRemainder18 = false;
                  }
                  decompiledFrameRemainder21 = !(decompiledFrameRemainder18);
                }
                if ((decompiledFrameRemainder21) &&
                  (decompiledFrameRemainder18)) {
                  if (stackIn_1168_0 < stackIn_1168_1) {
                    fk.field_k[var5] = fk.field_k[var5] + 14336;
                  }
                  if (fk.field_k[var5] > 12288) {
                    fk.field_k[var5] = fk.field_k[var5] - 14336;
                  }
                  if (fk.field_k[1 + var5] < -2048) {
                    fk.field_k[1 + var5] = fk.field_k[1 + var5] + 11776;
                  }
                  if (fk.field_k[1 + var5] > 9728) {
                    fk.field_k[var5 + 1] = fk.field_k[var5 + 1] - 11776;
                  }
                  var5 += 4;
                  var6++;
                  continue;
                }
              }
              if ((decompiledFrameRemainder21) &&
                (decompiledFrameRemainder18)) {
                var5 = 0;
                while (true) {
                  stackIn_1168_0Lifetime1 = var5;
                  stackIn_1168_1Lifetime1 = 3000;
                  if (stackIn_1168_0Lifetime1 >= stackIn_1168_1Lifetime1) {
                    decompiledFrameCompleted0 = false;
                    break;
                  }
                  stackIn_1220_0 = wk.field_b[var5];
                  if (var15 != 0) {
                    break;
                  }
                  if (stackIn_1220_0 != null &&
                    5 == wk.field_b[var5].field_f) {
                    wk.field_b[var5] = null;
                  }
                  var5++;
                }
              }
              if ((decompiledFrameRemainder21) &&
                (decompiledFrameCompleted0)) {
                while (true) {
                  ((vl) (Object) stackIn_1220_0).a(var3, var2_int, param0);
                  do {
                    var5++;
                    if (var15 != 0) {
                      break L256;
                    }
                    if (var5 >= 3000) {
                      break L256;
                    }
                    stackIn_1258_0 = null;
                    stackIn_1217_0 = stackIn_1258_0;
                    stackIn_1217_1 = wk.field_b[var5];
                  } while (stackIn_1217_0 == stackIn_1217_1);
                  stackIn_1220_0 = wk.field_b[var5];
                }
              }
              var5 = 0;
              while (3000 > var5) {
                stackIn_1217_0 = null;
                stackIn_1217_1 = wk.field_b[var5];
                if (var15 != 0) {
                  while (true) {
                    if (stackIn_1217_0 != stackIn_1217_1) {
                      stackIn_1220_0 = wk.field_b[var5];
                      ((vl) (Object) stackIn_1220_0).a(var3, var2_int, param0);
                    }
                    var5++;
                    break L256;
                  }
                }
                if (stackIn_1217_0 != stackIn_1217_1) {
                  wk.field_b[var5] = wk.field_b[var5].a((byte) -126);
                }
                var5++;
                if (var15 == 0) {
                  continue;
                }
                break;
              }
              o.field_j = 0;
              var5 = 0;
              while (var5 < 1000) {
                stackIn_1258_0 = null;
                if (var15 != 0) {
                  break L255;
                }
                if (stackIn_1258_0 != hf.field_e[var5]) {
                  hf.field_e[var5] = hf.field_e[var5].a(0);
                  o.field_j = o.field_j + 1;
                }
                var5++;
              }
              var5 = 0;
              while (var5 < 1000) {
                stackIn_1258_0 = null;
                if (var15 != 0) {
                  break L255;
                }
                if (stackIn_1258_0 != a.field_h[var5]) {
                  a.field_h[var5].a((byte) -110, var2_int, var3);
                }
                var5++;
              }
              if (!param0) {
                return;
              }
              var5 = 0;
              while (var5 < 3000) {
                stackIn_1258_0 = null;
                if (var15 != 0) {
                  break L255;
                }
                stackIn_1217_0 = stackIn_1258_0;
                stackIn_1217_1 = wk.field_b[var5];
                if (stackIn_1217_0 != stackIn_1217_1) {
                  stackIn_1220_0 = wk.field_b[var5];
                  ((vl) (Object) stackIn_1220_0).a(var3, var2_int, param0);
                }
                var5++;
              }
            }
            if (qi.field_a >= 10 &&
              mk.field_k <= 0 &&
              s.field_i) {
              nc.field_A = nc.field_A - 1;
              if (nc.field_A <= 0) {
                a.field_h[0] = null;
                this.k((byte) 97);
              }
            }
            if (50 == qi.field_a &&
              nc.field_A > 0) {
              nc.field_A = nc.field_A - 1;
              if (nc.field_A <= 0) {
                a.field_h[0] = null;
                this.k((byte) 121);
              }
            }
            if (qi.field_a >= var4 && (!(qi.field_a >= 10) ||
              !(mk.field_k <= 0)) && na.field_j == null) {
              this.n(3);
            }
            stackIn_1258_0 = null;
            break;
          }
          boolean decompiledFrameRemainder0 = true;
          if (stackIn_1258_0 == na.field_j ||
            s.field_i) {
            if (!s.field_i) {
              if (wh.field_c <= 1 &&
                ni.field_a) {
                return;
              }
              na.field_j = new ij(this);
              if (!ni.field_a) {
                tl.field_c = 4;
                na.field_j.field_l = 8;
              }
              ni.field_a = false;
              decompiledFrameRemainder0 = (var15 == 0);
            }
            if (decompiledFrameRemainder0) {
              return;
            }
          }
          boolean decompiledNaturalLoopExit0 = false;
          while (!(decompiledNaturalLoopExit0 = (!qh.c(79)))) {
            stackIn_1305_0 = null;
            stackIn_1305_1 = na.field_j;
            if (var15 == 0) {
              if (stackIn_1305_0 != stackIn_1305_1 &&
                gi.field_f == 13 && (tl.field_c == 2 ||
                tl.field_c == 1 ||
                tl.field_c == 3)) {
                n.field_L = 256;
                tl.field_c = 0;
                continue;
              }
              if (na.field_j == null) {
                continue;
              }
              na.field_j.b(8);
              continue;
            }
            break;
          }
          if (decompiledNaturalLoopExit0) {
            stackIn_1305_0 = null;
            stackIn_1305_1 = na.field_j;
          }
          if (stackIn_1305_0 != stackIn_1305_1) {
            if (tl.field_c == 1 &&
              this.field_Q >= 612 &&
              628 > this.field_Q &&
              this.field_O >= 176 &&
              this.field_O < 192 &&
              gh.field_c == 1) {
              n.field_L = 256;
              tl.field_c = 0;
            }
            if (tl.field_c == 2) {
              if (this.field_Q >= 496 &&
                512 > this.field_Q &&
                208 <= this.field_O &&
                this.field_O < 224 &&
                gh.field_c == 1) {
                tl.field_c = 0;
                gh.field_d = null;
                n.field_L = 256;
              }
              if (this.field_Q >= 248 &&
                this.field_Q <= 264 &&
                460 <= this.field_O &&
                this.field_O <= 484 &&
                1 == gh.field_c) {
                fieldTemp$18 = si.field_X - 1;
                si.field_X = si.field_X - 1;
                if (fieldTemp$18 < 0) {
                  si.field_X = si.field_X + 3;
                }
              }
              if (this.field_Q >= 376 &&
                this.field_Q <= 392 &&
                460 <= this.field_O &&
                this.field_O <= 484 &&
                gh.field_c == 1) {
                fieldTemp$19 = si.field_X + 1;
                si.field_X = si.field_X + 1;
                if (fieldTemp$19 >= 3) {
                  si.field_X = si.field_X - 3;
                }
              }
            }
            if (3 == tl.field_c &&
              this.field_Q >= 496 &&
              this.field_Q < 512 &&
              208 <= this.field_O &&
              this.field_O < 224 &&
              gh.field_c == 1) {
              tl.field_c = 0;
              n.field_L = 256;
              if (oc.field_d) {
                tl.field_c = 2;
                oc.field_d = false;
              }
            }
            na.field_j.a(true);
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2_ref2 = decompiledCaughtException;
          throw ma.a((Throwable) ((Object) var2_ref2), "stellarshard.CB(" + param0 + ')');
        }
    }

    final static String a(boolean param0, boolean param1, int param2, boolean param3) {
        int var4_int = 0;
        RuntimeException var4 = null;
        String stackIn_13_0 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          var4_int = 0;
          if (param1) {
            var4_int += 4;
          }
          if (param2 != 6) {
            field_T = 20;
          }
          if (param0) {
            var4_int += 2;
          }
          if (param3) {
            var4_int++;
          }
          stackIn_13_0 = mh.field_h[var4_int];
          return stackIn_13_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var4 = decompiledCaughtException;
          throw ma.a((Throwable) ((Object) var4), "stellarshard.EB(" + param0 + ',' + param1 + ',' + param2 + ',' + param3 + ')');
        }
    }

    final void f(byte param0) {
        RuntimeException decompiledCaughtException = null;
        RuntimeException var2 = null;
        try {
          if (null != s.field_e) {
            nd.a(-26621, s.field_e);
            s.field_e.a(ic.field_d, -101);
            s.field_e = null;
            qd.field_j.requestFocus();
          }
          if (null != ac.field_h) {
            ac.field_h.e();
          }
          if (param0 <= 47) {
            return;
          }
          if (null != ka.field_m) {
            ka.field_m.e();
          }
          t.a(false);
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2 = decompiledCaughtException;
          throw ma.a((Throwable) ((Object) var2), "stellarshard.FA(" + param0 + ')');
        }
    }

    final void c(byte param0) {
        int var3 = 0;
        int var4 = 0;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var2 = null;
        var3 = field_B;
        try {
          stellarshard.r(50);
          ni.a(-78);
          eb.a(-1);
          ob.a(30063);
          rl.a((byte) -84);
          rb.m(-12);
          wg.a((byte) -107);
          ac.b(-53);
          be.a((byte) -20);
          fe.a(31147);
          ti.a();
          pf.a(30300);
          t.a(param0 ^ 6079);
          wi.a((byte) -93);
          ka.a((byte) -14);
          ih.a(38858);
          te.a((byte) -84);
          hj.a(121);
          ak.a(true);
          wd.a((byte) 104);
          ca.a(false);
          qj.a((byte) -69);
          hd.a((byte) -41);
          nj.a(param0 ^ 49);
          cj.a(0);
          ed.a(param0 + 30);
          bl.a(false);
          sf.a(false);
          ci.c(-1);
          vi.b((byte) 82);
          fj.a((byte) 59);
          va.a((byte) 88);
          jb.a(0);
          vl.a(-118);
          mb.a(false);
          oj.a(true);
          jj.a(param0 + 19045);
          d.e();
          ba.d();
          ag.a((byte) 126);
          gg.b((byte) -127);
          fb.c(-2918);
          rk.a(true);
          vh.b((byte) 48);
          fh.a((byte) 89);
          jf.a(-15917);
          ha.i(param0 + 244);
          pk.a((byte) 96);
          cc.b();
          ie.e(-28692);
          ah.a((byte) -31);
          ra.b(-14755);
          qf.a(-15967);
          gf.a(-118);
          bd.a();
          de.a(4);
          bf.a(2);
          qd.b(54);
          eh.a((byte) 5);
          k.a((byte) 98);
          h.a((byte) 45);
          ei.g((byte) 77);
          jg.e(true);
          pg.m(7694);
          ck.m(-121);
          mj.l(120);
          se.e((byte) 9);
          la.a(param0 ^ -16);
          lj.h(120);
          am.b(param0 ^ 36);
          hc.a(param0 ^ -21153);
          lg.a(param0 ^ 69);
          lh.a((byte) -16);
          sl.a(-127);
          wf.b(param0 + 227);
          qh.a(param0 - 15392);
          tj.a();
          ad.c();
          mi.a();
          gk.a(param0 + 129);
          fc.a((byte) 86);
          tf.b(param0 + 22);
          l.a(0);
          nk.a((byte) 52);
          o.a(1);
          ve.a(-9746);
          bi.e(0);
          tk.a((byte) -86);
          jd.a(-126);
          ib.a(0);
          ok.b((byte) -30);
          if (param0 != -128) {
            this.l((byte) 47);
          }
          mf.a(119);
          ue.b((byte) -99);
          oe.a(0);
          ua.a((byte) -50);
          sk.a(true);
          a.a(-3323);
          qa.c();
          vd.a(94);
          kc.a(true);
          wj.d((byte) 92);
          al.b(param0 + 128);
          ph.h(param0 ^ -15);
          el.h(param0 + 186);
          wc.a(true);
          kb.a((byte) 37);
          rh.a(param0 + 26);
          ki.e(param0 + 16512);
          na.b(124);
          tg.b((byte) 0);
          dj.a(4);
          id.a(param0 + 1392322593);
          wh.b(-1);
          n.c((byte) -11);
          fl.a(43);
          ke.a(false);
          ng.a((byte) -60);
          eg.b(-89);
          aa.a((byte) 77);
          si.f(-16412);
          sb.a((byte) 105);
          hi.a((byte) -92);
          e.a(186);
          vj.a((byte) 104);
          i.b(64);
          j.a();
          mg.a(true);
          lb.a((byte) 122);
          og.a((byte) 78);
          bb.a(false);
          tc.e(-64);
          hh.a(25434);
          df.b(11324);
          vk.a((byte) 112);
          rj.b(true);
          ig.a(-8278);
          dg.h(32);
          ui.e((byte) -29);
          g.d((byte) 109);
          ug.c(param0 ^ -72);
          q.a((byte) 84);
          oc.a(0);
          ch.a((byte) -56);
          od.d((byte) 11);
          cm.a(-118);
          wk.a((byte) 31);
          wa.b(0);
          mc.a(17913);
          dd.b(-26269);
          pe.a(param0 ^ -126);
          ce.a((byte) 125);
          nl.a((byte) 64);
          rc.d(23805);
          mh.a(2188);
          sc.b();
          gh.a((byte) 125);
          we.b((byte) 116);
          pl.q(0);
          ae.m(122);
          wl.k(115);
          nc.e(true);
          ul.a(160);
          rg.d(true);
          ii.a((byte) 25);
          cd.d((byte) 122);
          nd.h(-94);
          lk.d(67);
          aj.a((byte) 101);
          sj.e((byte) 23);
          fg.g(param0 ^ -128);
          nb.a((byte) 105);
          dh.a();
          sg.a(-29297);
          pd.b((byte) 117);
          sa.c(-17002);
          ol.a(true);
          dl.i(80);
          of.d((byte) -120);
          li.a((byte) 89);
          ai.a(-1);
          bg.a((byte) -117);
          gj.d((byte) -66);
          ld.g(param0 + 13566);
          bc.b((byte) 55);
          td.b((byte) -17);
          ga.a((byte) 3);
          s.a(false);
          u.a(540);
          b.b(true);
          ll.b(512);
          vg.c(-7392);
          il.d(param0 ^ 5634);
          kf.a((byte) 63);
          oa.i(-80);
          hk.a(false);
          nf.a(65535);
          uf.a((byte) 43);
          fd.g(-30900);
          ta.a(true);
          vc.a(-1);
          he.a((byte) -82);
          kl.c((byte) -106);
          af.a(54);
          fk.a(param0 ^ -24024);
          uc.a(-8749);
          ml.a((byte) -102);
          bk.a(-127);
          th.a(-116);
          fa.a(false);
          vf.d(false);
          bh.a((byte) -120);
          nh.b(245);
          hf.b(-27159);
          ma.a((byte) 6);
          mk.a((byte) -64);
          le.a(param0 ^ 63);
          uj.b(0);
          ge.b(false);
          lc.f(3988);
          qb.g(21403);
          ef.a(false);
          kk.e((byte) -61);
          ea.g((byte) 117);
          rd.a((byte) -83);
          ja.a((byte) -121);
          cg.a(param0 - 26686);
          ic.d((byte) 37);
          wb.a(param0 ^ 61);
          this.field_G = null;
          this.field_H = null;
          this.field_S = null;
          this.field_C = null;
          this.field_N = null;
          this.field_P = null;
          this.field_F = null;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2 = decompiledCaughtException;
          throw ma.a((Throwable) ((Object) var2), "stellarshard.IA(" + param0 + ')');
        }
        if (var3 != 0) {
          var4 = ac.field_m;
          var4++;
          ac.field_m = var4;
        }
    }

    private final void a(boolean param0, byte param1) {
        int stackIn_177_0 = 0;
        int stackIn_177_1 = 0;
        int stackIn_202_0 = 0;
        int stackIn_226_0 = 0;
        int stackIn_236_0 = 0;
        int stackIn_261_0 = 0;
        int stackIn_261_1 = 0;
        int stackIn_275_0 = 0;
        RuntimeException decompiledCaughtException = null;
        Object var3 = null;
        pb[] var4 = null;
        int var4_int = 0;
        ek[] var4_array = null;
        pb var4_ref = null;
        gk var4_ref2 = null;
        int var5 = 0;
        int[] var5_ref_int__ = null;
        int var6_int = 0;
        Object var6 = null;
        pa var7 = null;
        pb var7_ref = null;
        int var8_int = 0;
        int[] var8 = null;
        int var9 = 0;
        bj var10_ref_bj = null;
        int var10 = 0;
        int var11 = 0;
        int stackIn_261_0Lifetime1;
        int stackIn_261_1Lifetime1;
        int var4_intLifetime1;
        int var6_intLifetime1;
        int var4_intLifetime1Lifetime1;
        var11 = field_B;
        try {
          cl.a((byte) -70);
          if (param0) {
            sg.a(116, ke.field_b);
          }
          if (mf.field_b != null) {
            if (wk.field_a.a((byte) -36) &&
              wk.field_a.c((byte) -111)) {
              if (mf.field_b.a((byte) -36) &&
                mf.field_b.c((byte) -111)) {
                if (ka.field_n.a((byte) -36) &&
                  ka.field_n.c((byte) -111)) {
                  if (bh.field_a.a((byte) -36) &&
                    bh.field_a.c((byte) -111)) {
                    if (fc.field_a.a((byte) -36) &&
                      fc.field_a.a("basic", (byte) -109)) {
                      if (be.field_d.a((byte) -36) &&
                        be.field_d.c((byte) -111)) {
                        if (jf.field_m.a((byte) -36) &&
                          jf.field_m.c((byte) -111)) {
                          rd.a((byte) -72, 70.0f, ve.field_b);
                          if (!param0) {
                            return;
                          }
                          hi.b((byte) 109);
                          this.d(-20880);
                          var3 = new qh(22050, ba.field_m);
                          if (!pk.a(-12663, 0)) {
                            sb.field_e = new ud[41];
                            if (var11 != 0) {
                              sb.field_e = new ud[61];
                            }
                          } else {
                            sb.field_e = new ud[61];
                          }
                          sb.field_e[0] = kj.a(wk.field_a, "", "afterburner").a().a((qh) (var3));
                          sb.field_e[1] = kj.a(wk.field_a, "", "bounce-gun").a().a((qh) (var3));
                          sb.field_e[2] = kj.a(wk.field_a, "", "collision_asteroid").a().a((qh) (var3));
                          sb.field_e[3] = kj.a(wk.field_a, "", "collision_ice").a().a((qh) (var3));
                          sb.field_e[4] = kj.a(wk.field_a, "", "collision_iron").a().a((qh) (var3));
                          sb.field_e[5] = kj.a(wk.field_a, "", "combined-homer_loop_1000ms").a().a((qh) (var3));
                          sb.field_e[6] = kj.a(wk.field_a, "", "combined-shooter_loop_1000ms").a().a((qh) (var3));
                          sb.field_e[7] = kj.a(wk.field_a, "", "dual-laser_loop_100ms").a().a((qh) (var3));
                          sb.field_e[8] = kj.a(wk.field_a, "", "enemy_shoot").a().a((qh) (var3));
                          sb.field_e[9] = kj.a(wk.field_a, "", "explosion_asteroid_large").a().a((qh) (var3));
                          sb.field_e[10] = kj.a(wk.field_a, "", "explosion_asteroid_medium").a().a((qh) (var3));
                          sb.field_e[11] = kj.a(wk.field_a, "", "explosion_asteroid_small").a().a((qh) (var3));
                          sb.field_e[12] = kj.a(wk.field_a, "", "explosion_enemy").a().a((qh) (var3));
                          sb.field_e[13] = kj.a(wk.field_a, "", "explosion_ice_large").a().a((qh) (var3));
                          sb.field_e[14] = kj.a(wk.field_a, "", "explosion_ice_medium").a().a((qh) (var3));
                          sb.field_e[15] = kj.a(wk.field_a, "", "explosion_ice_small").a().a((qh) (var3));
                          sb.field_e[16] = kj.a(wk.field_a, "", "explosion_iron_large").a().a((qh) (var3));
                          sb.field_e[17] = kj.a(wk.field_a, "", "explosion_iron_medium").a().a((qh) (var3));
                          sb.field_e[18] = kj.a(wk.field_a, "", "explosion_iron_small").a().a((qh) (var3));
                          sb.field_e[19] = kj.a(wk.field_a, "", "explosion_player").a().a((qh) (var3));
                          sb.field_e[20] = kj.a(wk.field_a, "", "flame-cannon_loop_300-500ms").a().a((qh) (var3));
                          sb.field_e[21] = kj.a(wk.field_a, "", "heavy-cannon").a().a((qh) (var3));
                          sb.field_e[22] = kj.a(wk.field_a, "", "hex-cannon_70ms_loop").a().a((qh) (var3));
                          sb.field_e[23] = kj.a(wk.field_a, "", "homing_loop_200ms").a().a((qh) (var3));
                          sb.field_e[24] = kj.a(wk.field_a, "", "laser_70ms_loop").a().a((qh) (var3));
                          sb.field_e[25] = kj.a(wk.field_a, "", "mega-laser_loop_500ms").a().a((qh) (var3));
                          sb.field_e[26] = kj.a(wk.field_a, "", "mine_loop_200ms").a().a((qh) (var3));
                          sb.field_e[27] = kj.a(wk.field_a, "", "narrowgun").a().a((qh) (var3));
                          sb.field_e[28] = kj.a(wk.field_a, "", "nuke_explosion").a().a((qh) (var3));
                          sb.field_e[29] = kj.a(wk.field_a, "", "powerup_invulnerability").a().a((qh) (var3));
                          sb.field_e[30] = kj.a(wk.field_a, "", "powerup_phase_shield").a().a((qh) (var3));
                          sb.field_e[31] = kj.a(wk.field_a, "", "powerup_shield").a().a((qh) (var3));
                          sb.field_e[32] = kj.a(wk.field_a, "", "powerup_weapon").a().a((qh) (var3));
                          sb.field_e[33] = kj.a(wk.field_a, "", "quad-cannon").a().a((qh) (var3));
                          sb.field_e[34] = kj.a(wk.field_a, "", "super-cannon").a().a((qh) (var3));
                          sb.field_e[35] = kj.a(wk.field_a, "", "thruster").a().a((qh) (var3));
                          sb.field_e[36] = kj.a(wk.field_a, "", "title_explosion").a().a((qh) (var3));
                          sb.field_e[37] = kj.a(wk.field_a, "", "title_shinesound").a().a((qh) (var3));
                          sb.field_e[38] = kj.a(wk.field_a, "", "trigun").a().a((qh) (var3));
                          sb.field_e[39] = kj.a(wk.field_a, "", "wavegun").a().a((qh) (var3));
                          sb.field_e[40] = kj.a(wk.field_a, "", "hit").a().a((qh) (var3));
                          if (pk.a(-12663, 0)) {
                            sb.field_e[41] = kj.a(wk.field_a, "", "collect_ghost").a().a((qh) (var3));
                            sb.field_e[42] = kj.a(wk.field_a, "", "eerie_creak1").a().a((qh) (var3));
                            sb.field_e[43] = kj.a(wk.field_a, "", "eerie_creak2").a().a((qh) (var3));
                            sb.field_e[44] = kj.a(wk.field_a, "", "eerie_creak3").a().a((qh) (var3));
                            sb.field_e[45] = kj.a(wk.field_a, "", "eerie_creak4").a().a((qh) (var3));
                            sb.field_e[46] = ad.a(mf.field_b, "", "heartbeat").b().a((qh) (var3));
                            sb.field_e[47] = kj.a(wk.field_a, "", "howling1").a().a((qh) (var3));
                            sb.field_e[48] = kj.a(wk.field_a, "", "howling2").a().a((qh) (var3));
                            sb.field_e[49] = kj.a(wk.field_a, "", "howling3").a().a((qh) (var3));
                            sb.field_e[50] = kj.a(wk.field_a, "", "howling4").a().a((qh) (var3));
                            sb.field_e[51] = kj.a(wk.field_a, "", "static2").a().a((qh) (var3));
                            sb.field_e[52] = kj.a(wk.field_a, "", "static3").a().a((qh) (var3));
                            sb.field_e[53] = kj.a(wk.field_a, "", "static4").a().a((qh) (var3));
                            sb.field_e[54] = kj.a(wk.field_a, "", "trans1").a().a((qh) (var3));
                            sb.field_e[55] = kj.a(wk.field_a, "", "trans2").a().a((qh) (var3));
                            sb.field_e[56] = kj.a(wk.field_a, "", "trans3").a().a((qh) (var3));
                            sb.field_e[57] = ad.a(mf.field_b, "", "cyber_laugh1").b().a((qh) (var3));
                            sb.field_e[58] = ad.a(mf.field_b, "", "cyber_laugh2").b().a((qh) (var3));
                            sb.field_e[59] = ad.a(mf.field_b, "", "cyber_laugh4").b().a((qh) (var3));
                            sb.field_e[60] = ad.a(mf.field_b, "", "cyber_laugh5_rev").b().a((qh) (var3));
                          }
                          var4_ref2 = new gk(wk.field_a, mf.field_b);
                          wk.field_a = null;
                          mf.field_b = null;
                          if (pk.a(-12663, 0)) {
                            oe.field_a = ij.a(576, var4_ref2, "music/Stellar_Shard_Halloween", ka.field_n, "");
                            if (var11 != 0) {
                              oe.field_a = ij.a(576, var4_ref2, "music/Stellar_Shard_ingame", ka.field_n, "");
                            }
                          } else {
                            oe.field_a = ij.a(576, var4_ref2, "music/Stellar_Shard_ingame", ka.field_n, "");
                          }
                          ka.field_n = null;
                          rg.g(-33);
                          return;
                        }
                        rd.a((byte) -115, 60.0f, ak.a("", he.field_o, jf.field_m, (byte) 51, lj.field_B));
                        return;
                      }
                      rd.a((byte) -105, 50.0f, ak.a("", mb.field_c, be.field_d, (byte) 51, le.field_l));
                      return;
                    }
                    rd.a((byte) -96, 40.0f, ak.a("basic", lg.field_e, fc.field_a, (byte) 51, am.field_e));
                    return;
                  }
                  rd.a((byte) -89, 30.0f, ak.a("", lg.field_e, bh.field_a, (byte) 51, am.field_e));
                  return;
                }
                rd.a((byte) -63, 20.0f, ak.a("", qh.field_f, ka.field_n, (byte) 51, qd.field_e));
                return;
              }
              rd.a((byte) -90, 10.0f, ak.a("", qh.field_f, mf.field_b, (byte) 51, qd.field_e));
              return;
            }
            rd.a((byte) -71, 8.0f, ak.a("", ma.field_o, wk.field_a, (byte) 51, hc.field_k));
            return;
          }
          if (bh.field_a == null) {
            rd.a((byte) -60, 100.0f, ve.field_b);
            this.d(-20880);
            kl.field_k = 16777215;
            ul.field_G = 10742263;
            if (param1 >= -60) {
              this.a(70, -17);
            }
            vf.field_L = fe.field_c;
            lg.field_b = 5883647;
            aj.a(50, 11236);
            ef.a(50, (byte) 63);
            fe.field_c = new d(oe.field_a);
            if (vf.field_L != null) {
              nj.field_o.b(vf.field_L);
              vf.field_L.c();
              nj.field_o.a(vf.field_L);
            }
            vf.field_L = fe.field_c;
            nj.field_o.a(vf.field_L);
            vf.field_L.d(ai.field_c / 2);
            if (!ah.a(-1)) {
              be.field_g = ab.a(-5094, 4);
              wh.a(-124);
            }
            hf.field_f = true;
            rg.g(-33);
            return;
          }
          if (null == cm.field_d[0]) {
            rd.a((byte) -127, 75.0f, ea.field_k);
            this.d(-20880);
            qd.a(bh.field_a, "space", "", (byte) 42);
            qd.a(bh.field_a, "nebula", "", (byte) 73);
            wh.field_e = ml.a("", (byte) 83, bh.field_a, "achievements_lrg");
            pg.field_hb = ml.a("", (byte) -88, bh.field_a, "explosion");
            hk.field_l = ml.a("", (byte) 107, bh.field_a, "titlepics");
            uf.field_g = qd.a(fc.field_a, "unachieved", "basic", (byte) 106);
            ce.field_a = qd.a(fc.field_a, "locked", "basic", (byte) 60);
            af.field_n = qd.a(fc.field_a, "orbcoin", "basic", (byte) 111);
            var4 = new pb[16];
            var4 = ml.a("", (byte) 85, bh.field_a, "powerups");
            var5 = 0;
            do {
              if (16 <= var5) {
                var5 = 0;
                break;
              }
              var3 = new pb(96, 96);
              ((pb) (var3)).e();
              var4[var5].b(48, 48, 0, 4096);
              e.field_g[var5] = (pb) (var3);
              var5++;
            } while (var11 == 0);
            while (64 > var5) {
              cm.field_d[var5] = new pb(96, 96);
              var5++;
              if (var11 != 0) {
                return;
              }
            }
            pd.field_h.a((byte) -107);
            cg.field_c = 0;
            rg.g(-33);
            return;
          }
          if (cg.field_c < 16) {
            rd.a((byte) -47, (float)(80 + cg.field_c), ea.field_k);
            this.d(-20880);
            var3 = null;
            var4_int = 0;
            if (0 == cg.field_c) {
              var3 = pa.a(jf.field_m, "", "asteroid_craters_2");
              var4_int = 0;
            }
            var5 = 1500;
            if (1 == cg.field_c) {
              var4_int = 1;
              var3 = pa.a(jf.field_m, "", "asteroid_craters_3");
            }
            if (2 == cg.field_c) {
              var4_int = 0;
              var3 = pa.a(jf.field_m, "", "asteroid_iron_2");
            }
            if (3 == cg.field_c) {
              var3 = pa.a(jf.field_m, "", "asteroid_iron_3");
              var4_int = 1;
            }
            if (cg.field_c == 4) {
              var4_int = 0;
              var3 = pa.a(jf.field_m, "", "asteroid_ice_2");
            }
            if (5 == cg.field_c) {
              var3 = pa.a(jf.field_m, "", "asteroid_ice_3");
              var4_int = 1;
            }
            if (cg.field_c == 6) {
              var4_int = 1;
              var5 = 2000;
              var3 = pa.a(jf.field_m, "", "shooter_hub");
            }
            if (cg.field_c == 7) {
              var5 = 2000;
              var3 = pa.a(jf.field_m, "", "homer_hub");
              var4_int = 1;
            }
            if (cg.field_c == 8) {
              var5 = 2500;
              var4_int = 2;
              var3 = pa.a(jf.field_m, "", "asteroid_craters_1");
            }
            if (cg.field_c == 9) {
              var4_int = 2;
              var3 = pa.a(jf.field_m, "", "asteroid_iron_1");
              var5 = 2500;
            }
            if (cg.field_c == 10) {
              var5 = 2500;
              var3 = pa.a(jf.field_m, "", "asteroid_ice_1");
              var4_int = 2;
            }
            if (cg.field_c == 11) {
              var3 = pa.a(jf.field_m, "", "player");
              var4_int = 3;
              rh.field_b = (pa) (var3);
            }
            if (12 == cg.field_c) {
              var3 = pa.a(jf.field_m, "", "shooter");
              var4_int = 4;
              var5 = 2000;
            }
            if (13 == cg.field_c) {
              var5 = 2000;
              var3 = pa.a(jf.field_m, "", "homer");
              var4_int = 2;
            }
            if (cg.field_c == 14) {
              var5 = 2500;
              var3 = pa.a(jf.field_m, "", "gravity_well");
              var4_int = 4;
            }
            if (cg.field_c == 15) {
              var5 = 2500;
              var3 = pa.a(jf.field_m, "", "spinner");
              var4_int = 4;
            }
            var6_int = 0;
            boolean decompiledNaturalLoopExit2 = false;
            while (!(decompiledNaturalLoopExit2 = (var6_int >= 128))) {
              var7 = new pa((pa) (var3), false, false, false, false);
              var8_int = (int)(65536.0 * Math.cos(3.141592653589793 * (double)var6_int / 64.0));
              var9 = (int)(65536.0 * Math.sin((double)var6_int * 3.141592653589793 / 64.0));
              stackIn_177_0 = -4;
              stackIn_177_1 = ~var4_int;
              if (var11 == 0) {
                if (stackIn_177_0 >= stackIn_177_1) {
                  var7.a(new int[]{0, 0, 0, -65536, 0, 0, 0, -65536, 0, 0, 0, 65536});
                  var7.a(new int[]{0, 0, 0, 65536, 0, 0, 0, 0, -65536, 0, 65536, 0});
                }
                var7.a(new int[]{0, 0, 0, var8_int, -var9, 0, var9, var8_int, 0, 0, 0, 65536});
                if (var4_int < 3) {
                  var7.a(new int[]{0, 0, 0, var8_int, 0, -var9, 0, 65536, 0, var9, 0, var8_int});
                  var7.a(new int[]{0, 0, 0, 65536, 0, 0, 0, var8_int, -var9, 0, var9, var8_int});
                }
                var10_ref_bj = var7.a(128, 341, 50, 50, -50);
                if (1 == var4_int) {
                  fe.field_d[cg.field_c][var6_int] = new pb(96, 96);
                  fe.field_d[cg.field_c][var6_int].e();
                  ti.f(0, 0, 96, 96, 0);
                  cc.a();
                  var10_ref_bj.a(0, 0, 0, 0, 0, 0, var5, -1L);
                  fe.field_d[cg.field_c][var6_int].d();
                }
                if (0 == var4_int) {
                  fe.field_d[cg.field_c][var6_int] = new pb(96, 96);
                  fe.field_d[cg.field_c][var6_int].e();
                  ti.f(0, 0, 96, 96, 0);
                  cc.a();
                  var10_ref_bj.a(0, 0, 0, 0, 0, 0, var5, -1L);
                  fe.field_d[cg.field_c][var6_int].d();
                }
                if (var4_int == 2 ||
                  var4_int == 4) {
                  rd.field_a[cg.field_c - 8][var6_int >> 2] = new pb(96, 96);
                  rd.field_a[-8 + cg.field_c][var6_int >> 2].e();
                  ti.f(0, 0, 96, 96, 0);
                  cc.a();
                  var10_ref_bj.a(0, 0, 0, 0, 0, 0, var5, -1L);
                  rd.field_a[-8 + cg.field_c][var6_int >> 2].d();
                }
                if (var4_int == 3) {
                  cm.field_d[var6_int >> 1] = new pb(96, 96);
                  cm.field_d[var6_int >> 1].e();
                  ti.f(0, 0, 96, 96, 0);
                  cc.a();
                  var10_ref_bj.a(0, 0, 0, 0, 0, 0, 2500, -1L);
                  cm.field_d[var6_int >> 1].d();
                }
                var6_int++;
                continue;
              }
              break;
            }
            if (decompiledNaturalLoopExit2) {
              pd.field_h.a((byte) -107);
              stackIn_177_0 = ~cg.field_c;
              stackIn_177_1 = -16;
            }
            if (stackIn_177_0 == stackIn_177_1) {
              jf.field_n = ml.a("", (byte) 87, bh.field_a, "bar");
              jf.field_m = null;
            }
            cg.field_c = cg.field_c + 1;
            rg.g(-33);
            return;
          }
          if (null == l.field_f) {
            rd.a((byte) -53, 98.0f, ua.field_g);
            this.d(-20880);
            fh.field_k = ml.a("", (byte) 98, bh.field_a, "slider");
            fg.field_P = ml.a("", (byte) 124, bh.field_a, "frame");
            fg.field_P[4] = null;
            wc.field_s = qd.a(bh.field_a, "stel", "", (byte) 107);
            pl.field_R = qd.a(bh.field_a, "lar", "", (byte) 93);
            aa.field_b = qd.a(bh.field_a, "central_iceblock", "", (byte) 81);
            ml.a("", (byte) -32, bh.field_a, "menu");
            rh.field_a = new pb[12];
            var3 = null;
            var4_intLifetime1 = 0;
            boolean decompiledNaturalLoopExit1 = false;
            while (!(decompiledNaturalLoopExit1 = (var4_intLifetime1 >= 12))) {
              stackIn_202_0 = var4_intLifetime1;
              if (var11 == 0) {
                if (stackIn_202_0 == 0) {
                  var3 = ml.a("", (byte) 94, bh.field_a, "anim_shatter");
                }
                if (3 == var4_intLifetime1) {
                  var3 = ml.a("", (byte) 103, bh.field_a, "anim_shatter2");
                }
                if (var4_intLifetime1 == 6) {
                  var3 = ml.a("", (byte) -72, bh.field_a, "anim_shatter3");
                }
                if (var4_intLifetime1 == 9) {
                  var3 = ml.a("", (byte) 119, bh.field_a, "anim_shatter4");
                }
                rh.field_a[var4_intLifetime1 - 0] = (pb) (((Object[]) (var3))[0]);
                rh.field_a[var4_intLifetime1 + 1] = (pb) (((Object[]) (var3))[1]);
                rh.field_a[2 + var4_intLifetime1] = (pb) (((Object[]) (var3))[2]);
                rh.field_a[var4_intLifetime1 + 0].d();
                rh.field_a[1 + var4_intLifetime1].d();
                rh.field_a[2 + var4_intLifetime1].d();
                var4_intLifetime1 += 3;
                continue;
              }
              break;
            }
            if (decompiledNaturalLoopExit1) {
              fa.field_k = new pb[15];
              stackIn_202_0 = 0;
            }
            var4_intLifetime1Lifetime1 = stackIn_202_0;
            boolean decompiledNaturalLoopExit0 = false;
            while (!(decompiledNaturalLoopExit0 = (var4_intLifetime1Lifetime1 >= 15))) {
              stackIn_226_0 = var4_intLifetime1Lifetime1;
              if (var11 == 0) {
                if (stackIn_226_0 == 0) {
                  var3 = ml.a("", (byte) 121, bh.field_a, "anim_shine");
                }
                if (var4_intLifetime1Lifetime1 == 3) {
                  var3 = ml.a("", (byte) 118, bh.field_a, "anim_shine2");
                }
                if (6 == var4_intLifetime1Lifetime1) {
                  var3 = ml.a("", (byte) 110, bh.field_a, "anim_shine3");
                }
                if (9 == var4_intLifetime1Lifetime1) {
                  var3 = ml.a("", (byte) 83, bh.field_a, "anim_shine4");
                }
                if (var4_intLifetime1Lifetime1 == 12) {
                  var3 = ml.a("", (byte) -25, bh.field_a, "anim_shine5");
                }
                fa.field_k[var4_intLifetime1Lifetime1 + 0] = (pb) (((Object[]) (var3))[0]);
                fa.field_k[1 + var4_intLifetime1Lifetime1] = (pb) (((Object[]) (var3))[1]);
                fa.field_k[2 + var4_intLifetime1Lifetime1] = (pb) (((Object[]) (var3))[2]);
                fa.field_k[0 + var4_intLifetime1Lifetime1].d();
                fa.field_k[1 + var4_intLifetime1Lifetime1].d();
                fa.field_k[2 + var4_intLifetime1Lifetime1].d();
                var4_intLifetime1Lifetime1 += 3;
                continue;
              }
              break;
            }
            if (decompiledNaturalLoopExit0) {
              qd.a(bh.field_a, "title", "", (byte) 119);
              qj.field_a = ae.a("", "b12", bh.field_a, -115, be.field_d);
              stackIn_226_0 = 7;
            }
            var4_array = new ek[stackIn_226_0];
            var5_ref_int__ = new int[7];
            var6_intLifetime1 = 0;
            while (var6_intLifetime1 < 7) {
              var5_ref_int__[var6_intLifetime1] = 12;
              var6_intLifetime1++;
              if (var11 != 0) {
                return;
              }
            }
            var4_array[0] = el.a("keyboard_up", bh.field_a, (byte) -90, "");
            var4_array[1] = el.a("keyboard_space", bh.field_a, (byte) -74, "");
            var4_array[2] = el.a("keyboard_ctrl", bh.field_a, (byte) -123, "");
            var4_array[3] = el.a("keyboard_esc", bh.field_a, (byte) 127, "");
            var4_array[4] = el.a("keyboard_left", bh.field_a, (byte) -82, "");
            var4_array[5] = el.a("keyboard_right", bh.field_a, (byte) -116, "");
            var4_array[6] = el.a("keyboard_down", bh.field_a, (byte) 126, "");
            qj.field_a.a(var4_array, var5_ref_int__);
            l.field_f = ae.a("", "b122", bh.field_a, -117, be.field_d);
            rg.g(-33);
            return;
          }
          rd.a((byte) -65, 99.0f, ua.field_g);
          this.d(-20880);
          var3 = ml.a("", (byte) 80, bh.field_a, "screenshots");
          sd.a(qd.a(bh.field_a, "mbfg", "", (byte) 104), (byte) 60, "Stellar Shard");
          ga.a(-8039, qd.a(bh.field_a, "smalllogo", "", (byte) 124));
          te.a(8, 129, 1500, 0, qd.a(bh.field_a, "mbpb", "", (byte) 124), 40, 134, 97, 0);
          q.a(118, (pb[]) (var3));
          ie.field_u = null;
          fb.a(192, sg.field_c, 0, (java.applet.Applet) (this), -1, 16777215);
          var4_ref = new pb(128, 128);
          mf.field_a = new pb[64];
          var5 = 0;
          while (true) {
            stackIn_236_0 = ~var5;
            boolean decompiledFrameRemainder0 = true;
            if (stackIn_236_0 > -5) {
              var6 = null;
              stackIn_275_0 = var5;
              decompiledFrameRemainder0 = (var11 == 0);
              if (decompiledFrameRemainder0) {
                if (stackIn_275_0 == 0) {
                  var6 = "stars2";
                }
                if (var5 == 1) {
                  var6 = "stars3";
                }
                if (var5 == 2) {
                  var6 = "stars0";
                }
                if (3 == var5) {
                  var6 = "stars1";
                }
                var7_ref = n.a(qd.a(bh.field_a, (String) (var6), "", (byte) 42), (byte) -42, true);
                var7_ref.e();
                ti.d(1, 1, 0, 0, 496, 496);
                var8 = ti.field_a;
                var9 = 0;
                L61: while (true) {
                  if (var8.length > var9) {
                    stackIn_261_0 = ~var8[var9];
                    stackIn_261_1 = -1;
                    if (stackIn_261_0 == stackIn_261_1) {
                      var8[var9] = 1;
                    }
                    var9++;
                    continue;
                  }
                  var9 = 0;
                  while (true) {
                    stackIn_261_0Lifetime1 = ~var9;
                    stackIn_261_1Lifetime1 = -5;
                    if (stackIn_261_0Lifetime1 <= stackIn_261_1Lifetime1) {
                      break L61;
                    }
                    stackIn_236_0 = 0;
                    var10 = stackIn_236_0;
                    while (var10 < 4) {
                      var4_ref.e();
                      ti.d(2, 2, 126, 126);
                      var7_ref.e(2 + -var9 * 124, -var10 * 124 + 2);
                      ti.d(0, 2, 1, 126);
                      var4_ref.e(-2, 0);
                      ti.d(1, 2, 2, 126);
                      var4_ref.e(-1, 0);
                      ti.d(127, 2, 128, 126);
                      var4_ref.e(2, 0);
                      ti.d(126, 2, 127, 126);
                      var4_ref.e(1, 0);
                      ti.d(0, 0, 128, 1);
                      var4_ref.e(0, -2);
                      ti.d(0, 1, 128, 2);
                      var4_ref.e(0, -1);
                      ti.d(0, 127, 128, 128);
                      var4_ref.e(0, 2);
                      ti.d(0, 126, 128, 127);
                      var4_ref.e(0, 1);
                      mf.field_a[var9 + var10 * 4 + var5 * 16] = var4_ref.a();
                      var10++;
                    }
                    var9++;
                  }

                }
                pd.field_h.a((byte) -107);
                var5++;
                continue;
              }
            }
            if (decompiledFrameRemainder0) {
              be.field_d = null;
              bh.field_a = null;
              stackIn_275_0 = -33;
            }
            rg.g(stackIn_275_0);
            return;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3 = decompiledCaughtException;
          throw ma.a((Throwable) (var3), "stellarshard.UA(" + param0 + ',' + param1 + ')');
        }
    }

    private final void n(int param0) {
        int fieldTemp$0 = 0;
        int fieldTemp$1 = 0;
        int fieldTemp$2 = 0;
        int fieldTemp$3 = 0;
        RuntimeException decompiledCaughtException = null;
        int var2_int = 0;
        int[] var2 = null;
        RuntimeException var2_ref = null;
        fk var3_ref_fk = null;
        int var3 = 0;
        int var4 = 0;
        int var5 = 0;
        var5 = field_B;
        try {
          field_U[8] = field_U[8] + 1;
          if (5 < field_U[8]) {
            field_U[8] = 5;
          }
          cl.field_a = cl.field_a + si.field_gb;
          gg.field_i = gg.field_i + 1;
          lg.field_f = lg.field_f - 127;
          hk.field_p = hk.field_p + 127;
          if (7 == e.field_e) {
            fieldTemp$0 = vh.field_e;
            vh.field_e = vh.field_e + 1;
            if (fieldTemp$0 == 5) {
              hj.a(255, 0, 1);
            }
          }
          if (e.field_e == 8) {
            fieldTemp$1 = sf.field_b;
            sf.field_b = sf.field_b + 1;
            if (fieldTemp$1 == 5) {
              hj.a(253, 2, 1);
            }
          }
          if (e.field_e == 9) {
            fieldTemp$2 = sj.field_K;
            sj.field_K = sj.field_K + 1;
            if (fieldTemp$2 == 5) {
              hj.a(252, 3, 1);
            }
          }
          if (e.field_e == 10) {
            fieldTemp$3 = ua.field_d;
            ua.field_d = ua.field_d + 1;
            if (fieldTemp$3 == 5) {
              hj.a(251, 4, 1);
            }
          }
          qi.field_a = qi.field_a + 1;
          if (e.field_e == -1) {
            field_U[0] = 5;
          }
          if (qi.field_a > (-1 + mg.field_t)) {
            var2_int = of.field_A;
            of.field_A = Math.max(qi.field_a, of.field_A);
            if (of.field_A > 50) {
              of.field_A = 50;
            }
            var3_ref_fk = new fk(0, -1 + qi.field_a, 0, 0, 0, 0);
            if (!ah.a(-1)) {
              hf.a(var3_ref_fk, 89, 5);
              if (var5 != 0) {
                tf.field_a.b(-113, var3_ref_fk);
                of.field_A = var2_int;
              }
            } else {
              tf.field_a.b(-113, var3_ref_fk);
              of.field_A = var2_int;
            }
          }
          if (10 <= qi.field_a &&
            nc.field_A <= 0 &&
            mk.field_k <= 0 &&
            s.field_i) {
            nc.field_A = 1500;
          }
          if (null == this.field_F) {
            this.field_F = new pb(640, 480);
          }
          if (qi.field_a > 50) {
            qi.field_a = 50;
            if (nc.field_A <= 0) {
              nc.field_A = 1500;
            }
          }
          if (qi.field_a == 1) {
            this.field_J = 100;
          }
          if (10 == qi.field_a &&
            nf.field_r) {
            hj.a(249, 6, 1);
          }
          if (qi.field_a == 20 &&
            nf.field_r) {
            hj.a(248, 7, 1);
          }
          if (qi.field_a == 10 &&
            field_K) {
            hj.a(247, 8, 1);
          }
          if (30 == qi.field_a &&
            field_K) {
            hj.a(246, 9, 1);
          }
          if (qi.field_a == 50 &&
            field_K) {
            hj.a(245, 10, param0 - 2);
          }
          var2 = new int[16];
          if (qi.field_a == 1) {
            var2[1] = 4;
          }
          if (2 == qi.field_a) {
            var2[1] = 6;
          }
          if (qi.field_a == param0) {
            var2[1] = 4;
            var2[3] = 4;
          }
          if (qi.field_a == 6) {
            var2[5] = 6;
          }
          if (qi.field_a == 4) {
            var2[13] = 2;
            var2[1] = 8;
          }
          if (qi.field_a == 5) {
            var2[12] = 2;
            var2[3] = 8;
          }
          if (qi.field_a == 8) {
            var2[5] = 8;
            var2[7] = 1;
          }
          if (qi.field_a == 7) {
            var2[15] = 2;
            var2[1] = 10;
          }
          if (qi.field_a == 9) {
            var2[6] = 1;
            var2[3] = 8;
          }
          if (qi.field_a == 10) {
            var2[14] = 1;
            var2[1] = 5;
          }
          if (10 < qi.field_a) {
            if (qi.field_a % 10 == 1) {
              var2[1] = qi.field_a / 2 + 5;
            }
            if (4 == qi.field_a % 10) {
              var2[15] = qi.field_a / 10 + 1;
              var2[5] = qi.field_a / 3 + 5;
            }
            if (3 == qi.field_a % 10) {
              var2[12] = qi.field_a / 5;
              var2[3] = 5 + qi.field_a / 3;
            }
            if (qi.field_a % 10 == 2) {
              var2[1] = 5 + qi.field_a / 3;
              var2[13] = qi.field_a / 5;
            }
            if (qi.field_a % 10 == 5) {
              var2[1] = qi.field_a / 4 + 3;
              var2[14] = 1;
            }
            if (qi.field_a % 10 == 7) {
              var2[6] = qi.field_a / 10;
              var2[5] = qi.field_a / 3 + 5;
              var2[12] = qi.field_a / 5;
            }
            if (6 == qi.field_a % 10) {
              var2[7] = qi.field_a / 10;
              var2[13] = qi.field_a / 5;
              var2[3] = qi.field_a / 3 + 5;
            }
            if (8 == qi.field_a % 10) {
              var2[15] = qi.field_a / 6;
              var2[1] = qi.field_a / 4 + 3;
            }
            if (qi.field_a % 10 == 9) {
              var2[3] = qi.field_a / 6;
              var2[1] = qi.field_a / 6;
              var2[5] = qi.field_a / 6;
            }
            if (qi.field_a == 20) {
              var2[14] = 1;
              var2[7] = 10;
            }
            if (qi.field_a == 30) {
              var2[14] = 2;
              var2[6] = 10;
            }
            if (qi.field_a == 40) {
              var2[14] = 4;
              var2[6] = 5;
              var2[7] = 5;
              var2[15] = 5;
            }
            if (qi.field_a == 50) {
              var2[14] = qi.field_a / 5;
            }
            if (qi.field_a % 10 == 0 &&
              qi.field_a > 50) {
              var2[14] = qi.field_a / 5;
            }
          }
          var3 = 0;
          while (var3 < 16) {
            if (var5 != 0) {
              return;
            }
            var4 = 0;
            while (var4 < var2[var3]) {
              a.field_h[pl.e((byte) 63)] = new qe(var3);
              var4++;
            }
            var3++;
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2_ref = decompiledCaughtException;
          throw ma.a((Throwable) ((Object) var2_ref), "stellarshard.FB(" + param0 + ')');
        }
    }

    final void l(byte param0) {
        int stackIn_24_0 = 0;
        int stackIn_24_1 = 0;
        int stackIn_24_2 = 0;
        int stackIn_25_3;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var2 = null;
        try {
          if (param0 >= -107) {
            this.field_H = (pi) null;
          }
          if (mk.field_k > 0 &&
            lh.a(ic.field_d, (byte) 115)) {
            s.field_e = wb.a(0, -107, 480, ic.field_d, 640, 0);
            if (null != s.field_e) {
              nc.a(s.field_e, (byte) 121);
            }
          }
          stackIn_24_0 = qj.field_a.field_N;
          stackIn_24_1 = 0;
          stackIn_24_2 = l.field_f.field_N;
          if (ah.a(-1)) {
            stackIn_25_3 = 0;
          } else {
            if (mk.field_k <= 0) {
              stackIn_25_3 = 1;
            } else {
              if (null == s.field_e) {
                stackIn_25_3 = 3;
              } else {
                stackIn_25_3 = 2;
              }
            }
          }
          vf.a(stackIn_24_0, stackIn_24_1, stackIn_24_2, stackIn_25_3, (pb[]) null, 320, qj.field_a, 8, (pb[]) null, 8, 8 + qj.field_a.field_N, l.field_f.field_N, 260, true, 240, l.field_f);
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2 = decompiledCaughtException;
          throw ma.a((Throwable) ((Object) var2), "stellarshard.WA(" + param0 + ')');
        }
    }

    static long a(long param0, long param1) {
        long stackIn_1_0 = 0L;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var4 = null;
        try {
          stackIn_1_0 = param0 & param1;
          return stackIn_1_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var4 = decompiledCaughtException;
          throw ma.a((Throwable) ((Object) var4), "stellarshard.JB(" + param0 + ',' + param1 + ')');
        }
    }

    final void d(int param0) {
        int incrementValue$0 = 0;
        Object stackIn_5_0 = null;
        Object stackIn_11_0 = null;
        int stackIn_11_1 = 0;
        boolean stackIn_12_2 = false;
        Object stackIn_126_0 = null;
        int stackIn_133_0 = 0;
        int stackIn_133_1 = 0;
        int stackIn_141_0 = 0;
        int stackIn_145_0 = 0;
        int stackIn_174_0 = 0;
        int stackIn_174_1 = 0;
        int stackIn_258_0 = 0;
        int stackIn_258_1 = 0;
        int stackIn_438_0 = 0;
        int stackIn_438_1 = 0;
        int stackIn_447_0 = 0;
        int stackIn_447_1 = 0;
        boolean stackIn_511_0 = false;
        Object stackIn_516_0 = null;
        RuntimeException decompiledCaughtException = null;
        Object var2 = null;
        RuntimeException var2_ref = null;
        int var3 = 0;
        int var4 = 0;
        int var5_int = 0;
        String var5 = null;
        int var6_int = 0;
        String var6 = null;
        jf var6_ref = null;
        int var7 = 0;
        Object var7_ref = null;
        int var8 = 0;
        int var9 = 0;
        int var10_int = 0;
        Object var10 = null;
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
        Object stackIn_126_0Lifetime1;
        String var5Lifetime1;
        String var6Lifetime1;
        String var6Lifetime2;
        String var5Lifetime2;
        String var5Lifetime3;
        String var5Lifetime4;
        int stackIn_174_0Lifetime1;
        int stackIn_174_1Lifetime1;
        int stackIn_438_0Lifetime1;
        int stackIn_438_1Lifetime1;
        int var6_intLifetime1;
        int var6_intLifetime2;
        int var6_intLifetime3;
        int var7Lifetime1;
        int var7Lifetime2;
        int var7Lifetime3;
        int var8Lifetime1;
        int var8Lifetime2;
        int var8Lifetime3;
        int var8Lifetime4;
        int var9Lifetime1;
        int var9Lifetime2;
        int var9Lifetime3;
        int var9Lifetime4;
        int var10_intLifetime1;
        int var18Lifetime1;
        int var7Lifetime1Lifetime1;
        int var9Lifetime3Lifetime1;
        var20 = field_B;
        try {
          if (s.field_e != null) {
            stackIn_5_0 = s.field_e;
          } else {
            stackIn_5_0 = qd.field_j;
          }
          var2 = stackIn_5_0;
          if (ee.b(93)) {
            stackIn_11_0 = var2;
            stackIn_11_1 = -11;
            if (s.field_e != null) {
              stackIn_12_2 = true;
            } else {
              stackIn_12_2 = ua.field_b;
            }
            rl.a((java.awt.Canvas) (stackIn_11_0), stackIn_11_1, stackIn_12_2);
            return;
          }
          if (!hf.field_f) {
            i.a((java.awt.Canvas) (var2), -113);
            return;
          }
          if (null != be.field_g) {
            i.a((java.awt.Canvas) (var2), -101);
            return;
          }
          if (null != gg.field_f) {
            i.a((java.awt.Canvas) (var2), -99);
            return;
          }
          boolean decompiledFrameCompleted6 = true;
          if (null != this.field_F) {
            var3 = 0;
            var4 = -this.field_F.field_z.length;
            while (var4 < 0) {
              incrementValue$0 = var3;
              var3++;
              this.field_F.field_z[incrementValue$0] = pd.field_h.field_e[incrementValue$0];
              var4++;
              if (var20 != 0) {
                decompiledFrameCompleted6 = false;
                break;
              }
            }
          }
          if ((decompiledFrameCompleted6) && (null == na.field_j &&
            !s.field_i && (!(wh.field_c <= 1) ||
            !ni.field_a))) {
            na.field_j = new ij(this);
            if (!ni.field_a) {
              tl.field_c = 4;
              na.field_j.field_l = 8;
            }
            ni.field_a = false;
          }
          if (0 > fb.field_b) {
            fb.field_b = fb.field_b + 640;
          }
          if (0 > tk.field_b) {
            tk.field_b = tk.field_b + 480;
          }
          if (fb.field_b >= 640) {
            fb.field_b = fb.field_b - 640;
          }
          if (tk.field_b >= 480) {
            tk.field_b = tk.field_b - 480;
          }
          this.p(param0 ^ -20914);
          if (null != this.field_F &&
            el.field_I > 0 &&
            na.field_j == null) {
            this.field_F.e(0, 0, 5 * el.field_I);
            if (!s.field_i) {
              el.field_I = el.field_I - 1;
            }
          }
          var3 = 0;
          if (param0 != -20880) {
            stellarshard.a(true, false, -57, true);
          }
          var4 = 0;
          do {
            if (var4 >= 12) {
              var3 = 0;
              break;
            }
            ei.field_D[var4].d((fk.field_k[var3] >> 4) - 128, (fk.field_k[var3 + 1] >> 4) - 128, 128 - el.field_I * 2);
            var3 += 8;
            var4 += 2;
          } while (var20 == 0);
          L17: while (true) {
            boolean decompiledFrameCompleted5 = true;
            if (var3 < 1000) {
              stackIn_126_0 = null;
              if (var20 != 0) {
                while (true) {
                  if (stackIn_126_0 != hf.field_e[var3]) {
                    hf.field_e[var3].a(true);
                  }
                  var3++;
                  decompiledFrameCompleted5 = false;
                  break;
                }
              }
              if (decompiledFrameCompleted5) {
                if (stackIn_126_0 != a.field_h[var3] &&
                  a.field_h[var3].field_m != 14 &&
                  !a.field_h[var3].a((byte) -96)) {
                  a.field_h[var3].e(106);
                }
                var3++;
                if (var20 == 0) {
                  continue;
                }
              }
            }
            if (decompiledFrameCompleted5) {
              if (this.field_G != null) {
                this.field_G.e();
                ti.f(0, 0, 640, 480, 0);
                pd.field_h.a((byte) -107);
                if (var20 != 0) {
                  this.field_G = new pb(640, 480);
                }
              } else {
                this.field_G = new pb(640, 480);
              }
              var3 = 0;
              boolean decompiledNaturalLoopExit0 = false;
              while (!(decompiledNaturalLoopExit0 = (var3 >= 3000))) {
                if (var20 == 0) {
                  if (wk.field_b[var3] != null) {
                    wk.field_b[var3].a(-57, this.field_G);
                  }
                  var3++;
                  continue;
                }
                break;
              }
              if (decompiledNaturalLoopExit0) {
                var3 = 0;
              }
              while (1000 > var3) {
                if (var20 != 0) {
                  break L17;
                }
                stackIn_126_0Lifetime1 = null;
                if (stackIn_126_0Lifetime1 != hf.field_e[var3]) {
                  hf.field_e[var3].a(true);
                }
                var3++;
              }
            }
            var3 = 0;
            var3 = var3 + this.field_G.field_t;
            break;
          }
          var5_int = 0;
          while (true) {
            stackIn_133_0 = this.field_G.field_y;
            stackIn_133_1 = var5_int;
            boolean decompiledFrameRemainder0 = true;
            boolean decompiledFrameCompleted4 = true;
            boolean decompiledFrameRemainder1 = true;
            if (stackIn_133_0 > stackIn_133_1) {
              var6_int = var3;
              var7 = var5_int * this.field_G.field_v;
              stackIn_174_0 = ~var6_int;
              stackIn_174_1 = -1;
              if (var20 != 0) {
                decompiledFrameRemainder0 = !(stackIn_174_0 > stackIn_174_1);
                decompiledFrameRemainder1 = !(decompiledFrameRemainder0);
              }
              if ((decompiledFrameRemainder1) &&
                (decompiledFrameRemainder0)) {
                if (stackIn_174_0 > stackIn_174_1) {
                  stackIn_141_0 = -var6_int;
                } else {
                  stackIn_141_0 = 0;
                }
                var8 = stackIn_141_0;
                if (this.field_G.field_v + var6_int <= 640) {
                  stackIn_145_0 = this.field_G.field_v;
                } else {
                  stackIn_145_0 = 640 - var6_int;
                }
                var9 = stackIn_145_0;
                var10_int = var8;
                while (var10_int < var9) {
                  var4 = this.field_G.field_z[var7 + var10_int];
                  stackIn_133_0 = -1;
                  stackIn_133_1 = ~var4;
                  if (stackIn_133_0 > stackIn_133_1) {
                    if (var4 > 0 &&
                      var4 <= 96) {
                      this.field_G.field_z[var7 + var10_int] = var4 * 255 / 96 << 16;
                    }
                    if (var4 > 96 &&
                      var4 < 160) {
                      this.field_G.field_z[var7 + var10_int] = 16711680 + ((-24480 + 255 * var4) / 64 << 8);
                    }
                    if (160 <= var4 &&
                      var4 < 255) {
                      this.field_G.field_z[var10_int + var7] = 255 * (-160 + var4) / 95 + 16776960;
                    }
                  }
                  var10_int++;
                }
                var5_int++;
                continue;
              }
            }
            if ((decompiledFrameRemainder1) &&
              (decompiledFrameRemainder0)) {
              this.field_G.d(0, 0, 255);
              var5_int = 0;
              while (true) {
                stackIn_174_0Lifetime1 = 1000;
                stackIn_174_1Lifetime1 = var5_int;
                if (stackIn_174_0Lifetime1 <= stackIn_174_1Lifetime1) {
                  break;
                }
                if (var20 != 0) {
                  decompiledFrameCompleted4 = false;
                  break;
                }
                if (a.field_h[var5_int] != null && (14 == a.field_h[var5_int].field_m ||
                  a.field_h[var5_int].a((byte) -83))) {
                  a.field_h[var5_int].e(122);
                }
                var5_int++;
              }
            }
            if ((decompiledFrameRemainder0) &&
              (decompiledFrameCompleted4)) {
              var5_int = 4;
            }
            var6_intLifetime1 = 1;
            while (true) {
              if (var6_intLifetime1 < 12) {
                ei.field_D[var6_intLifetime1].d(-128 + (fk.field_k[var5_int] >> 4), -128 + (fk.field_k[1 + var5_int] >> 4), -(el.field_I * 2) + 128);
                var5_int += 8;
                var6_intLifetime1 += 2;
                if (var20 == 0) {
                  continue;
                }
              } else {
                if (pk.a(param0 ^ 24825, 0) &&
                  s.field_i) {
                  if (ag.field_a > 0 &&
                    128 > ag.field_a) {
                    ti.e(10, 330, 4, 16711680);
                  }
                  if (ag.field_a > 0 &&
                    ag.field_a < 128) {
                    qj.field_a.a(nd.field_F, 20, 335, 16711680, -1);
                  }
                  var5_int = gf.field_c;
                  var6_intLifetime1 = 100;
                  if (ml.field_h > 0 &&
                    var6_intLifetime1 >= var5_int) {
                    var7Lifetime1 = 32;
                    var8Lifetime1 = var7Lifetime1 >> 1;
                    if (16 <= var5_int) {
                      if ((-64 + var6_intLifetime1) < var5_int) {
                        var7Lifetime1Lifetime1 = -var5_int + var6_intLifetime1;
                        if (var20 != 0) {
                          var7Lifetime1Lifetime1 = var5_int * 4;
                        }
                      }
                    } else {
                      var7Lifetime1Lifetime1 = var5_int * 4;
                    }
                    var9Lifetime1 = (int)((Math.exp((double)((float)(-var5_int) / 20.0f)) - Math.exp((double)((float)(-var6_intLifetime1) / 20.0f))) * 200.0);
                    ja.a(320, 2 * var5_int, var8Lifetime1, 240, false, var9Lifetime1, 256, 1);
                  }
                }
              }
              break;
            }
            if (s.field_i) {
              var5_int = 148;
              ti.b(1, 351, var5_int, 128, 65280, 64);
              ti.d(2, 352, var5_int - 1, 478);
              var6_intLifetime2 = 0;
              while (true) {
                if (1000 > var6_intLifetime2) {
                  if (var20 == 0) {
                    if (a.field_h[var6_intLifetime2] != null) {
                      a.field_h[var6_intLifetime2].a(false);
                    }
                    var6_intLifetime2++;
                    continue;
                  }
                } else {
                  ti.b();
                }
                break;
              }
              var6 = wb.field_i;
              if (!hf.field_i.a(0)) {
                var6 = te.field_a;
              }
              boolean decompiledFrameCompleted3 = true;
              var7Lifetime2 = qj.field_a.b(var6) + 10;
              ti.e(0, 350, var5_int + 2, 130, 4, 0);
              ti.f(-(var7Lifetime2 / 2) + var5_int / 2 - 3, 341, 6 + var7Lifetime2, 21, 10, 0);
              ti.e(1, 351, var5_int, 128, 3, 8421504);
              ti.e(2, 352, var5_int - 2, 126, 2, 8421504);
              ti.g(3, 351, var5_int - 5, 16777215);
              ti.f(1, 353, 123, 16777215);
              ti.g(4, 478, var5_int - 1 - 4, 4210752);
              ti.f(-1 + var5_int + 1, 354, 123, 4210752);
              ti.e(3, 353, -4 + var5_int, 124, 1, 0);
              ti.f(-2 - var7Lifetime2 / 2 + var5_int / 2, 342, 4 + var7Lifetime2, 19, 9, 8421504);
              ti.e(-2 - var7Lifetime2 / 2 + var5_int / 2, 342, var7Lifetime2 + 4, 19, 9, 16777215);
              ti.d(-(var7Lifetime2 / 2) + var5_int / 2 - 2, 350, 8 + var5_int / 2 + var7Lifetime2 / 2 - 2, 361);
              ti.e(-(var7Lifetime2 / 2) + var5_int / 2 - 2, 342, 4 + var7Lifetime2, 19, 9, 4210752);
              ti.b();
              if (var7Lifetime2 < 100) {
                var8Lifetime2 = 0;
                while (var8Lifetime2 < 15) {
                  var9Lifetime2 = (int)(5.0 + Math.cos(3.14 * (double)var8Lifetime2 / 20.0) * 5.0);
                  stackIn_258_0 = ~var9Lifetime2;
                  stackIn_258_1 = -10;
                  if (var20 != 0) {
                    decompiledFrameCompleted3 = false;
                    break;
                  }
                  if (stackIn_258_0 < stackIn_258_1) {
                    var9Lifetime2 = 9;
                  }
                  ti.f(var5_int / 2 + (4 + -var7Lifetime2 / 2) - var8Lifetime2, -var9Lifetime2 + 351, var9Lifetime2 * 2, 8421504);
                  ti.f(-var7Lifetime2 / 2 - var8Lifetime2 - (-4 - var5_int / 2), 1 + (351 - var9Lifetime2), 1, 16777215);
                  ti.f(4 + (-var8Lifetime2 + (-var7Lifetime2 / 2 + var5_int / 2)), 351 - var9Lifetime2, 1, 0);
                  ti.f(var5_int / 2 + (-var7Lifetime2 / 2 + (-var8Lifetime2 + 4)), 351 + (var9Lifetime2 - 1), 1, 4210752);
                  ti.f(var5_int / 2 + (-var7Lifetime2 / 2 - var8Lifetime2 + 4), var9Lifetime2 + 351, 1, 0);
                  ti.f(var8Lifetime2 - -var7Lifetime2 / 2 - (4 - var5_int / 2), -var9Lifetime2 + 351, 2 * var9Lifetime2, 8421504);
                  ti.f(var5_int / 2 - 4 - (-var8Lifetime2 + -var7Lifetime2 / 2), 1 - var9Lifetime2 + 351, 1, 16777215);
                  ti.f(-4 + (-(-var7Lifetime2 / 2) - (-var8Lifetime2 - var5_int / 2)), -var9Lifetime2 + 351, 1, 0);
                  ti.f(var5_int / 2 - (4 - var8Lifetime2) - -var7Lifetime2 / 2, 351 - (-var9Lifetime2 + 1), 1, 4210752);
                  ti.f(var5_int / 2 + var8Lifetime2 - (-var7Lifetime2 / 2 + 4), 351 + var9Lifetime2, 1, 0);
                  var8Lifetime2++;
                }
              }
              if (decompiledFrameCompleted3) {
                stackIn_258_0 = var5_int / 2 - var7Lifetime2 / 2;
                stackIn_258_1 = 344;
              }
              ti.f(stackIn_258_0, stackIn_258_1, var7Lifetime2, 15, 7, 0);
              qj.field_a.c(var6, 1 + (var5_int / 2 - 1), 355, 0, -1);
              qj.field_a.c(var6, -1 + (1 + var5_int / 2), 357, 0, -1);
              qj.field_a.c(var6, -1 + var5_int / 2, 356, 0, -1);
              qj.field_a.c(var6, -1 + (var5_int / 2 + 2), 356, 0, -1);
              qj.field_a.c(var6, 1 + (var5_int / 2 - 1), 356, 16777215, -1);
            }
            if (!s.field_i && (na.field_j == null ||
              tl.field_c != 8 &&
              tl.field_c != 1 &&
              tl.field_c != 3 &&
              tl.field_c != 2)) {
              if (wh.field_c == 0 &&
                rh.field_a == null) {
                pl.field_R = null;
                wh.field_c = 2;
                jg.field_pb = 0;
                aa.field_b = null;
                wc.field_s = null;
              }
              if (0 == wh.field_c) {
                aa.field_b.a(0, 128, 310, (byte) -120, 90);
                wc.field_s.a(0, 128, -jg.field_pb + 320 - 10, (byte) -124, 90);
                pl.field_R.a(0, 128, 310 + jg.field_pb, (byte) -119, 90);
              }
              if (wh.field_c == 1) {
                rh.field_a[jg.field_pb / 3].a(0, 128, 310, (byte) 82, 90);
              }
              if (wh.field_c == 2) {
                rh.field_a = null;
                fa.field_k[0].a(0, 128, 310, (byte) -120, 90);
                fa.field_k[jg.field_pb / 2].a(0, 128, 310, (byte) 37, 90);
              }
              if (wh.field_c == 3) {
                fa.field_k[0].a(0, 128, 310, (byte) 54, 90);
              }
            }
            if (s.field_i) {
              var5 = h.a(hh.field_d, 0, new String[]{"" + qi.field_a});
              var6_intLifetime3 = nj.field_f[0];
              nj.field_f[0] = qi.field_a * 64 / 50;
              if (nj.field_f[0] > 63) {
                nj.field_f[0] = 63;
              }
              ic.a(var5, 0, -1, false, 480, 16777215, 0);
              nj.field_f[0] = 64 * te.field_c / 250000;
              var5Lifetime2 = ce.field_f + te.field_c;
              if (nj.field_f[0] > 63) {
                nj.field_f[0] = 63;
              }
              ic.a(var5Lifetime2, 0, -1, false, 160, 16777215, 0);
              var5Lifetime3 = bb.field_f;
              var7_ref = null;
              var8Lifetime3 = e.field_e;
              if (0 == e.field_e) {
                var7_ref = ei.field_A;
              }
              if (e.field_e == 1) {
                var7_ref = gf.field_a;
              }
              if (e.field_e == 2) {
                var7_ref = ka.field_l;
              }
              if (3 == e.field_e) {
                var7_ref = he.field_l;
              }
              if (4 == e.field_e) {
                var7_ref = td.field_e;
              }
              if (e.field_e == 5) {
                var7_ref = nl.field_f;
              }
              if (e.field_e == 6) {
                var7_ref = qh.field_h;
              }
              if (e.field_e == 7) {
                var7_ref = we.field_e;
              }
              if (e.field_e == 8) {
                var7_ref = nb.field_O;
                var8Lifetime3 += 5;
              }
              if (e.field_e == 9) {
                var7_ref = ja.field_k;
                var8Lifetime3 += 5;
              }
              if (10 == e.field_e) {
                var8Lifetime3 += 5;
                var7_ref = rd.field_b;
              }
              if (var7_ref != null) {
                var7_ref = ((String) (var7_ref)).toUpperCase();
                var9Lifetime3 = qj.field_a.b((String) (var7_ref)) + 40;
                var10_intLifetime1 = 307;
                ti.f(-20 + var10_intLifetime1, 427, 42, 42, 20, 0);
                ti.f(-2 + var10_intLifetime1 - var9Lifetime3, 435, var9Lifetime3 + 4 + 19, 26, 12, 0);
                ti.f(var10_intLifetime1 - var9Lifetime3, 437, 19 + var9Lifetime3, 22, 10, 11186350);
                ti.f(var10_intLifetime1 - 18, 429, 38, 38, 18, 11186350);
                ti.a(var10_intLifetime1 - 20 << 4, 7152, 200, 100, eh.field_e);
                ti.a(var10_intLifetime1 + 10 - var9Lifetime3 << 4, 7152, 200, 150, eh.field_e);
                ti.a(-var9Lifetime3 + var10_intLifetime1 + 40 << 4, 7152, 200, 150, eh.field_e);
                ti.a(var10_intLifetime1 + 10 << 4, 7152, 200, 200, eh.field_e);
                ti.f(-var9Lifetime3 + 2 + var10_intLifetime1, 439, 21 - (-var9Lifetime3 - 96) - 140, 18, 8, 0);
                qj.field_a.b((String) (var7_ref), -63 + var10_intLifetime1 + 33, 453, 16777215, -1);
                ti.a(var10_intLifetime1 - 15, 432, 32, 32, 14, 0, 192);
                e.field_g[var8Lifetime3].e(var10_intLifetime1 + 33 - 80, 400);
              }
              var9Lifetime3Lifetime1 = 250;
              var10 = null;
              var11 = -1;
              if (nc.field_H == 1) {
                var10 = pe.field_a;
                var11 = 8;
              }
              if (2 == nc.field_H) {
                var10 = ha.field_x;
                var11 = 10;
              }
              if (3 == nc.field_H) {
                var11 = 11;
                var10 = fc.field_c;
              }
              if (4 == nc.field_H) {
                var11 = 12;
                var10 = wg.field_e;
              }
              if (null != var10) {
                var10 = ((String) (var10)).toUpperCase();
                var12 = 40 + qj.field_a.b((String) (var10));
                var13 = 100;
                var9Lifetime3Lifetime1 += 250;
                ti.f(var9Lifetime3Lifetime1 - 20 - 1, 427, 42, 42, 20, 0);
                ti.f(-2 - var12 + var9Lifetime3Lifetime1, 435, 21 - (-4 - var12), 26, 12, 0);
                if (0 < var13) {
                  ti.f(var9Lifetime3Lifetime1 - 2, 435, 4 + var13 + 21, 26, 12, 0);
                }
                ti.f(var9Lifetime3Lifetime1 - var12, 437, 21 + var12, 22, 10, 11186350);
                if (var13 > 0) {
                  ti.f(var9Lifetime3Lifetime1, 437, var13 + 21, 22, 10, 11186350);
                }
                ti.f(-1 + (-18 + var9Lifetime3Lifetime1), 429, 38, 38, 18, 11186350);
                ti.a(-20 + var9Lifetime3Lifetime1 << 4, 7152, 200, 100, eh.field_e);
                ti.a(var9Lifetime3Lifetime1 + 10 << 4, 7152, 200, 150, eh.field_e);
                ti.a(40 + (-var12 + var9Lifetime3Lifetime1) << 4, 7152, 200, 150, eh.field_e);
                ti.a(-var12 - (-20 - var9Lifetime3Lifetime1) << 4, 7152, 200, 200, eh.field_e);
                if (0 < var13) {
                  ti.a(var13 + var9Lifetime3Lifetime1 << 4, 7152, 200, 200, eh.field_e);
                }
                boolean decompiledFrameCompleted2 = true;
                boolean decompiledFrameCompleted0 = true;
                boolean decompiledFrameCompleted1 = true;
                ti.f(var9Lifetime3Lifetime1 + 2 - var12, 439, -119 + var12 + 96, 18, 8, 0);
                if (var13 > 0) {
                  var14 = 0;
                  var15 = 0;
                  if (2 == nc.field_H) {
                    if (gh.field_b > 500) {
                      gh.field_b = 500;
                    }
                    var14 = 8421504;
                    var15 = gh.field_b * 20 / 500;
                    if (gh.field_b < 250) {
                      var14 = 327680 * (gh.field_b % 50);
                    }
                  }
                  if (nc.field_H == 3) {
                    if (gh.field_b > 1500) {
                      gh.field_b = 1500;
                    }
                    var15 = 20 * gh.field_b / 1500;
                    var14 = 16777215;
                    if (gh.field_b < 250) {
                      var14 = gh.field_b % 50 * 327680;
                    }
                  }
                  if (nc.field_H == 4) {
                    if (500 < gh.field_b) {
                      gh.field_b = 500;
                    }
                    var14 = 16776960;
                    var15 = gh.field_b * 20 / 500;
                    if (gh.field_b < 250) {
                      var14 = gh.field_b % 50 * 327680;
                    }
                  }
                  if (nc.field_H == 1) {
                    if (gh.field_b == 5) {
                      var14 = 16777215;
                    }
                    var15 = gh.field_b * 4;
                    if (gh.field_b == 4) {
                      var14 = 8454143;
                    }
                    if (gh.field_b == 3) {
                      var14 = 8421631;
                    }
                    if (gh.field_b == 2) {
                      var14 = 16744703;
                    }
                    if (gh.field_b == 1) {
                      var14 = 16744576;
                    }
                  }
                  var16 = 20 + (2 + var9Lifetime3Lifetime1);
                  var17 = 439;
                  ti.f(var16, var17, -3 + var13, 18, 8, (var14 & 16711422) >> 1);
                  if (3 == nc.field_H) {
                    ti.e(var16, var17, -3 + var13, 18, 8, var14);
                    if (var20 != 0) {
                      ti.e(var16, var17, var13 - 3, 18, 8, 4144959 & var14 >> 2);
                    }
                  } else {
                    ti.e(var16, var17, var13 - 3, 18, 8, 4144959 & var14 >> 2);
                  }
                  var16 = var16 << 4;
                  var17 = var17 << 4;
                  var19 = 0;
                  while (var19 < var15) {
                    var18 = (ki.field_s + var19) % 10;
                    stackIn_438_0 = ~var18;
                    stackIn_438_1 = -6;
                    if (var20 != 0) {
                      if (stackIn_438_0 > stackIn_438_1) {
                        var18 = (var19 + ki.field_s) % 10;
                        stackIn_447_0 = ~var18;
                        stackIn_447_1 = -6;
                        decompiledFrameCompleted2 = false;
                        break;
                      }
                      decompiledFrameCompleted1 = false;
                      break;
                    }
                    if (stackIn_438_0 < stackIn_438_1) {
                      var18 = 10 - var18;
                    }
                    if (nc.field_H == 2) {
                      ti.a((var13 - 35) * (10 * var19) / 10 + (136 + var16), (var18 << 2) + (136 + var17), -var18 + 9 << 4, 50, eh.field_e);
                    } else {
                      ti.a((var13 - 35) * (var18 + var19 * 10) / 10 + var16 + 136, 136 + var17, 144, 50, eh.field_e);
                    }
                    var19++;
                  }
                  if ((decompiledFrameCompleted2) &&
                    (decompiledFrameCompleted1)) {
                    var19 += 2;
                    while (true) {
                      stackIn_438_0Lifetime1 = ~var19;
                      stackIn_438_1Lifetime1 = -21;
                      if (stackIn_438_0Lifetime1 <= stackIn_438_1Lifetime1) {
                        break;
                      }
                      var18Lifetime1 = (var19 + ki.field_s) % 10;
                      stackIn_447_0 = ~var18Lifetime1;
                      stackIn_447_1 = -6;
                      if (var20 != 0) {
                        decompiledFrameCompleted0 = false;
                        break;
                      }
                      if (stackIn_447_0 >= stackIn_447_1) {
                        var18Lifetime1 = 10 - var18Lifetime1;
                      }
                      ti.c((var18Lifetime1 + var19 * 10) * (var13 - 35) / 10 + var16 + 136 >> 4, 136 + var17 >> 4, 9, 0, 32);
                      ti.c((var13 - 35) * (var18Lifetime1 + var19 * 10) / 10 + (var16 + 136) >> 4, var17 + 136 >> 4, 7, 0, 32);
                      ti.c(136 + var16 + (var13 - 35) * (var18Lifetime1 + var19 * 10) / 10 >> 4, var17 + 136 >> 4, 5, 0, 32);
                      var19++;
                    }
                  }
                }
                if ((decompiledFrameCompleted2) &&
                  (decompiledFrameCompleted0)) {
                  var9Lifetime3Lifetime1 -= 48;
                  stackIn_447_0 = var9Lifetime3Lifetime1 + 32;
                  stackIn_447_1 = 432;
                }
                ti.a(stackIn_447_0, stackIn_447_1, 32, 32, 14, 0, 192);
                e.field_g[var11].e(var9Lifetime3Lifetime1, 400);
                qj.field_a.b((String) (var10), 18 + var9Lifetime3Lifetime1, 453, 16777215, -1);
              }
              nj.field_f[0] = var6_intLifetime3;
              if (this.field_J > 0) {
                var5Lifetime4 = ah.field_k;
              }
            }
            if (ig.field_D > 0) {
              ti.b(0, 0, 640, 480, 16777215, ig.field_D);
            }
            ti.a(0, 0, 640, 480, 0, 192);
            ti.a(1, 1, 638, 478, 0, 128);
            ti.a(2, 2, 636, 476, 0, 64);
            if (na.field_j != null) {
              na.field_j.a((byte) 85);
            }
            if (this.field_R > 0) {
              ti.b(0, 0, 640, 480, 16777215, this.field_R);
            }
            if (nc.field_A > 0 &&
              s.field_i &&
              mk.field_k <= 0) {
              var6Lifetime1 = dd.field_i + nc.field_A / 50 + ef.field_o;
              l.field_f.a(var6Lifetime1, 32, -l.field_f.field_N + 68, 575, 480, 0, 0, 1, 0, l.field_f.field_N);
              l.field_f.a(var6Lifetime1, 32, 68 - l.field_f.field_N, 576, 479, 0, 0, 1, 0, l.field_f.field_N);
              l.field_f.a(var6Lifetime1, 32, -l.field_f.field_N + 68, 576, 480, 16777215, -1, 1, 0, l.field_f.field_N);
            }
            if (nc.field_A > 0 &&
              s.field_i &&
              qi.field_a >= 50) {
              var6Lifetime2 = lk.field_g + hf.field_g + nc.field_A / 50 + ef.field_o;
              l.field_f.a(var6Lifetime2, 32, 68 - l.field_f.field_N, 575, 480, 0, 0, 1, 0, l.field_f.field_N);
              l.field_f.a(var6Lifetime2, 32, -l.field_f.field_N + 68, 576, 479, 0, 0, 1, 0, l.field_f.field_N);
              l.field_f.a(var6Lifetime2, 32, -l.field_f.field_N + 68, 576, 480, 16777215, -1, 1, 0, l.field_f.field_N);
            }
            var6_ref = (jf) (hf.field_i.b(-119));
            if (null != var6_ref) {
              var7Lifetime3 = this.field_I;
              if (var7Lifetime3 < 80) {
                var8Lifetime4 = 255 * var7Lifetime3 / 80;
                if (var20 != 0) {
                  if (var7Lifetime3 >= 230) {
                    var8Lifetime4 = (310 - var7Lifetime3) * 255 / 80;
                    var8Lifetime4 = 255;
                  } else {
                    var8Lifetime4 = 255;
                  }
                }
              } else {
                if (var7Lifetime3 >= 230) {
                  var8Lifetime4 = (310 - var7Lifetime3) * 255 / 80;
                  if (var20 != 0) {
                    var8Lifetime4 = 255;
                  }
                } else {
                  var8Lifetime4 = 255;
                }
              }
              var9Lifetime4 = 148;
              if (var8Lifetime4 < 0) {
                var8Lifetime4 = 0;
              }
              ti.b(4, 353, -6 + var9Lifetime4, 123, 0, var8Lifetime4);
              if (var8Lifetime4 == 255) {
                wh.field_e[var6_ref.field_o].a(-24 + var9Lifetime4 / 2, 369, 48, 48);
                qj.field_a.a(rc.field_e[var6_ref.field_o], 8, 425, var9Lifetime4 - 16, 56, 65535, -1, 1, 1, qj.field_a.field_N);
              }
              var5Lifetime1 = te.field_a;
              qj.field_a.c(var5Lifetime1, var9Lifetime4 / 2 + 1, 355, 0, -1);
              qj.field_a.c(var5Lifetime1, 1 + var9Lifetime4 / 2, 357, 0, -1);
              qj.field_a.c(var5Lifetime1, var9Lifetime4 / 2, 356, 0, -1);
              qj.field_a.c(var5Lifetime1, var9Lifetime4 / 2 + 2, 356, 0, -1);
              qj.field_a.c(var5Lifetime1, var9Lifetime4 / 2 + 1, 356, 16777215, -1);
            }
            if (fd.d((byte) -21)) {
              ti.b(0, 0, 640, 480, 0, 128);
              ti.f(-(ok.a((byte) 126) / 2) + 320 - 19, -16 - kb.b((byte) -114) / 2 + 240 - 5, ok.a((byte) 125) + 6 + 32, kb.b((byte) 121) + 10 + 32, 0);
              na.a(28, 256, 28, fg.field_P);
            }
            if (hd.field_b) {
              ti.b(0, 0, 150, 480, 0, 64);
              ti.b(0, 0, 150, 480, 16777215);
            }
            if (id.b(param0 ^ 20876) &&
              !fd.d((byte) -21)) {
              if (null != s.field_e) {
                stackIn_511_0 = true;
              } else {
                stackIn_511_0 = ua.field_b;
              }
              bc.a(stackIn_511_0, -102);
            }
            if (null == s.field_e) {
              stackIn_516_0 = qd.field_j;
            } else {
              stackIn_516_0 = s.field_e;
            }
            pd.a((java.awt.Canvas) (stackIn_516_0), 0, 0, (byte) -73);
            return;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2_ref = decompiledCaughtException;
          throw ma.a((Throwable) ((Object) var2_ref), "stellarshard.TA(" + param0 + ')');
        }
    }

    public final int a(byte param0, int param1) {
        RuntimeException var3 = null;
        int stackIn_4_0 = 0;
        RuntimeException decompiledCaughtException = null;
        try {
          if (param0 != -77) {
            this.c((byte) -68);
          }
          stackIn_4_0 = 0;
          return stackIn_4_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3 = decompiledCaughtException;
          throw ma.a((Throwable) ((Object) var3), "stellarshard.C(" + param0 + ',' + param1 + ')');
        }
    }

    public final void init() {
        try {
          this.a(11, true, "stellarshard");
        } catch (RuntimeException runtimeException) {
          throw ma.a((Throwable) ((Object) runtimeException), "stellarshard.init()");
        }
    }

    public stellarshard() {
        this.field_P = new int[]{384, 384, -384, -384, 384, 384, -384, -384};
        this.field_N = new int[]{384, -384, -384, 384, 384, -384, -384, 384};
        this.field_S = new int[]{384, 384, 384, 384, -384, -384, -384, -384};
        this.field_I = 0;
    }

    private final void o(int param0) {
        int var2_int = 0;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var2 = null;
        try {
          if (null != ld.field_G) {
            le.a(ld.field_G, 26949);
            ld.field_G = null;
            rg.g(-33);
          }
          bh.field_a = wl.a(1, 1);
          wk.field_a = wl.a(1, 2);
          var2_int = 122 / ((-3 - param0) / 34);
          mf.field_b = wl.a(1, 3);
          ka.field_n = wl.a(1, 4);
          be.field_d = wl.a(1, 5);
          jf.field_m = wl.a(1, 7);
          jg.a(ie.field_u, fc.field_a, (byte) 118);
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2 = decompiledCaughtException;
          throw ma.a((Throwable) ((Object) var2), "stellarshard.GB(" + param0 + ')');
        }
    }

    static {
        field_U = new int[16];
        field_E = new th();
    }
}
