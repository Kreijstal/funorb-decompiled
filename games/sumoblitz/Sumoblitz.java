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
        boolean stackIn_20_0 = false;
        RuntimeException stackIn_28_0 = null;
        StringBuilder stackIn_28_1 = null;
        String stackIn_29_2 = null;
        StringBuilder stackIn_32_1 = null;
        String stackIn_33_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var4 = null;
        var5 = field_L ? 1 : 0;
        try {
          nw.field_e = st.field_z;
          if (255 != param2) {
            if (param2 >= 100 &&
              param2 <= 105) {
              eg.field_l = qr.a(args, 8192);
              if (var5 != 0) {
                eg.field_l = au.a(40, param3, param2);
                stackIn_20_0 = !(13 <= lq.field_d);
                eg.field_l = bq.a(stackIn_20_0, 8192);
              }
            } else {
              eg.field_l = au.a(40, param3, param2);
              if (var5 != 0) {
                stackIn_20_0 = !(13 <= lq.field_d);
                eg.field_l = bq.a(stackIn_20_0, 8192);
              }
            }
          } else {
            stackIn_20_0 = !(13 <= lq.field_d);
            eg.field_l = bq.a(stackIn_20_0, 8192);
          }
          if (param1 != 13) {
            field_H = -63;
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var4 = decompiledCaughtException;
          stackIn_28_0 = var4;
          stackIn_28_1 = new StringBuilder().append("Sumoblitz.SA(");
          if (args == null) {
            stackIn_29_2 = "null";
          } else {
            stackIn_29_2 = "{...}";
          }
          stackIn_32_1 = ((StringBuilder) (Object) stackIn_28_1).append(stackIn_29_2).append(',').append(param1).append(',').append(param2).append(',');
          if (param3 == null) {
            stackIn_33_2 = "null";
          } else {
            stackIn_33_2 = "{...}";
          }
          throw qo.a((Throwable) ((Object) stackIn_28_0), ((StringBuilder) (Object) stackIn_32_1).append(stackIn_33_2).append(')').toString());
        }
    }

    final void g(int param0) {
        RuntimeException decompiledCaughtException = null;
        RuntimeException var2 = null;
        try {
          if (param0 != -15254) {
            this.r(36);
          }
          oi.a(-27864);
          if (gk.field_o != null) {
            b.c((byte) 81);
          }
          gt.m(0);
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2 = decompiledCaughtException;
          throw qo.a((Throwable) ((Object) var2), "Sumoblitz.L(" + param0 + ')');
        }
    }

    private final void g(byte param0) {
        int fieldTemp$0 = 0;
        qu stackIn_58_0 = null;
        boolean stackIn_59_1 = false;
        RuntimeException decompiledCaughtException = null;
        int var2_int = 0;
        RuntimeException var2 = null;
        int var3 = 0;
        var3 = field_L ? 1 : 0;
        try {
          if (2 <= ku.field_j &&
            hw.field_b[41]) {
            f.field_w = true;
            kh.field_e = 16777215;
          }
          var2_int = -73 / ((8 - param0) / 40);
          if (null != pl.field_v.b(-98)) {
            fieldTemp$0 = qn.field_g + 1;
            qn.field_g = qn.field_g + 1;
            if (fieldTemp$0 == 256) {
              qn.field_g = 0;
              pl.field_v.c(9);
            }
          }
          if (0 != ra.field_e) {
            if (ra.field_e == 1) {
              eh.field_a = eh.field_a + 1;
              if (eh.field_a != 30) {
                return;
              }
              if (!so.a((byte) -58)) {
                bf.a(0);
                if (var3 != 0) {
                  wn.a(true);
                }
              } else {
                wn.a(true);
              }
              ra.field_e = 2;
              if (var3 == 0) {
                return;
              }
            }
            if (2 == ra.field_e) {
              boolean decompiledSharedTail0 = !(vs.b((byte) 9));
              if (!decompiledSharedTail0) {
                nj.field_b = qw.field_b;
                decompiledSharedTail0 = (var3 != 0);
              }
              if (decompiledSharedTail0) {
                nq.field_g = ew.a((byte) 113, 4);
                if (ph.field_b != null) {
                  ph.field_b.e(-119);
                }
                nj.field_b = ro.field_d;
                if (-2 == nj.field_b) {
                  nj.field_b = 0;
                  vb.a((byte) 122, false);
                }
              }
              ra.field_e = 3;
              rc.field_k = nj.field_b;
              eh.field_a = 29;
              if (var3 == 0) {
                return;
              }
            }
            eh.field_a = eh.field_a - 1;
            if (eh.field_a != 0) {
              return;
            }
            ra.field_e = 0;
            if (var3 == 0) {
              return;
            }
          }
          stackIn_58_0 = ph.field_b;
          stackIn_59_1 = (-1 == nj.field_b);
          ((qu) (Object) stackIn_58_0).a(stackIn_59_1, (byte) -88);
          if (~rc.field_k != ~nj.field_b) {
            eh.field_a = eh.field_a + 1;
            if (eh.field_a != 30) {
              return;
            }
            if (nj.field_b == 2) {
              mr.field_f = null;
            }
            eh.field_a = 0;
            nj.field_b = rc.field_k;
            if (var3 == 0) {
              return;
            }
          }
          if (nj.field_b != -1) {
            iv.field_g[nj.field_b].b(-18556);
          }
          return;
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
          if (param0 != 28196) {
            Sumoblitz.a(59, -122, (byte) 42);
          }
          this.a(100, 3, 1, 10, 2, 0, true);
          var2 = new bs();
          var2.a(177, 128, 9);
          var3 = new ud(var2, new bs());
          aa.a(lt.field_m, true, var3, (byte) -125, 48000, (java.awt.Component) ((Object) qn.field_f));
          dt.field_f = false;
          qc.field_e = var2;
          this.a(true, true, (byte) 60, true, false);
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2_ref = decompiledCaughtException;
          throw qo.a((Throwable) ((Object) var2_ref), "Sumoblitz.C(" + param0 + ')');
        }
    }

    final void d(int param0) {
        try {
          boolean stackIn_50_0 = false;
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
          int var4_intLifetime1;
          int var5_intLifetime1;
          int var5_intLifetime2;
          int var6Lifetime1;
          int var6Lifetime2;
          int var7Lifetime1;
          int var8Lifetime1;
          int var5_intLifetime1Lifetime1;
          int var6Lifetime1Lifetime1;
          int var7Lifetime1Lifetime1;
          var10 = field_L ? 1 : 0;
          try {
            var2 = hk.b(-97);
            lk.b();
            if (in.g(param0 ^ -99)) {
              ad.a((byte) 122, var2, np.a(param0 ^ 7));
              return;
            }
            if (!sa.field_j) {
              od.a(-62, var2);
              return;
            }
            if (!su.a(param0 ^ 0)) {
              pe.a(param0 ^ 20, 100.0f, fl.field_s);
              od.a(-88, var2);
              return;
            }
            if (nq.field_h.a(false) &&
              !this.h((byte) -124)) {
              return;
            }
            var3 = nq.field_h.a(-115);
            var3.GA(0);
            ph.field_b.a(param0 ^ 120, var3, false);
            if (rc.field_k == nj.field_b) {
              if (-1 != nj.field_b) {
                iv.field_g[nj.field_b].a(255, var3, -2355);
                if (var10 != 0) {
                  var4_int = 255 * eh.field_a / 30;
                  if (-1 != nj.field_b) {
                    iv.field_g[nj.field_b].a(-var4_int + 255, var3, -2355);
                  }
                  if (-1 != rc.field_k) {
                    iv.field_g[rc.field_k].a(var4_int, var3, -2355);
                  }
                }
              }
            } else {
              var4_int = 255 * eh.field_a / 30;
              if (-1 != nj.field_b) {
                iv.field_g[nj.field_b].a(-var4_int + 255, var3, -2355);
              }
              if (-1 != rc.field_k) {
                iv.field_g[rc.field_k].a(var4_int, var3, -2355);
              }
            }
            if (so.a((byte) 103)) {
              lk.a(0, 0, lk.field_b, lk.field_c);
              pn.d((byte) -7);
            }
            if (param0 != ra.field_e) {
              var4_intLifetime1 = 256 * eh.field_a / 30;
              if (var4_intLifetime1 > 0) {
                lk.b(0, 0, lk.field_b, lk.field_c, 0, var4_intLifetime1);
              }
            }
            if (sj.a(param0 - 85) &&
              !so.a((byte) -75)) {
              if (gk.field_o != null) {
                stackIn_50_0 = true;
              } else {
                stackIn_50_0 = ii.field_a;
              }
              kn.a(stackIn_50_0, 25);
            }
            if (ku.field_j >= 2 &&
              gw.field_v) {
              bq.field_c.a(20, 20, 16777215, Integer.toString(aj.field_B), (byte) -81, 1);
            }
            var4 = (ge) (pl.field_v.b(param0 - 121));
            if (null != var4) {
              var6 = qn.field_g;
              if (var6 >= 64) {
                if (var6 <= 192) {
                  var5_int = 255;
                  if (var10 != 0) {
                    var5_int = (-var6 + 192) * 255 / 64;
                    var5_int = 255 * var6 / 64;
                  }
                } else {
                  var5_int = (-var6 + 192) * 255 / 64;
                  if (var10 != 0) {
                    var5_int = 255 * var6 / 64;
                  }
                }
              } else {
                var5_int = 255 * var6 / 64;
              }
              var7 = 45;
              boolean decompiledSharedTail0 = !(var4.field_m < 0);
              if (!decompiledSharedTail0) {
                var8_ref_String = aa.field_b;
                decompiledSharedTail0 = (var10 != 0);
              }
              if (decompiledSharedTail0) {
                var8_ref_String = rb.field_d[var4.field_m];
                if (qw.field_a.length > var4.field_m) {
                  var7 += 65;
                  qw.field_a[var4.field_m].a(-32 + rj.field_c - 180 + 85, 45, 64, 64, 0, 16777215 | var5_int << 24, 1);
                }
              }
              bq.field_c.a(150, var5_int << 24, 0, 170, -180 + rj.field_c, (int[]) null, (hr[]) null, -1 + var7, var5_int << 24, 0, 18, -8787, var8_ref_String, (aa) null, 1, 0);
              bq.field_c.a(150, var5_int << 24, 0, 170, -180 + rj.field_c, (int[]) null, (hr[]) null, 1 + var7, var5_int << 24, 0, 18, -8787, var8_ref_String, (aa) null, 1, 0);
              bq.field_c.a(150, var5_int << 24 | 16777215, 0, 170, -180 + rj.field_c, (int[]) null, (hr[]) null, var7, -1, 0, 18, -8787, var8_ref_String, (aa) null, 1, 0);
            }
            boolean decompiledFrameRemainder0 = true;
            if (oj.a(false)) {
              var5_intLifetime1 = (-lk.field_b + gi.field_h) * 0 / 2;
              var6Lifetime1 = 0 * (wq.field_b - lk.field_c) / 2;
              cf.a(var5_intLifetime1, var6Lifetime1, 59);
              kn.a(false, (byte) -122);
              this.field_F = true;
              decompiledFrameRemainder0 = (var10 != 0);
            }
            if (decompiledFrameRemainder0) {
              if (!sj.a(-44)) {
                if (!ws.b((byte) 52)) {
                  this.field_F = false;
                  if (var10 != 0) {
                    var5_intLifetime1Lifetime1 = 0 * (-lk.field_b + gi.field_h) / 2;
                    var6Lifetime1Lifetime1 = (wq.field_b - lk.field_c) * 0 / 2;
                    ls.a(var5_intLifetime1Lifetime1, -80, var6Lifetime1Lifetime1);
                    kn.a(false, param0 ^ 121);
                    this.field_F = true;
                  }
                }
              } else {
                var5_intLifetime1Lifetime1 = 0 * (-lk.field_b + gi.field_h) / 2;
                var6Lifetime1Lifetime1 = (wq.field_b - lk.field_c) * 0 / 2;
                ls.a(var5_intLifetime1Lifetime1, -80, var6Lifetime1Lifetime1);
                kn.a(false, param0 ^ 121);
                this.field_F = true;
              }
            }
            if (this.field_F) {
              var5_intLifetime2 = lk.field_b;
              var6Lifetime2 = lk.field_c;
              if (this.field_K != null) {
                var6Lifetime2 = this.field_K.field_u;
                var5_intLifetime2 = this.field_K.field_x;
              }
              var7Lifetime1 = (-var5_intLifetime2 + gi.field_h) / 2;
              var8 = (wq.field_b - var6Lifetime2) / 2;
              if (oj.a(false) &&
                this.field_K != null) {
                var7Lifetime1 = ik.c(param0 ^ -10517);
                var8 = fd.b(3878);
              }
              var9 = wq.a(var3, (byte) 18);
              var9.a((byte) 111, var8, var8 + var6Lifetime2, var7Lifetime1, var7Lifetime1 + var5_intLifetime2);
              var7Lifetime1Lifetime1 = (-lk.field_b + gi.field_h) / 2;
              var8Lifetime1 = (wq.field_b - lk.field_c) / 2;
              var3.SA(var7Lifetime1Lifetime1, var8Lifetime1, lk.field_b, lk.field_c, lk.field_a, 0, lk.field_b);
              var9.a(param0 + 29709);
            }
            try {
              var3.a(true);
            } catch (java.lang.Exception decompiledCaughtParameter0) {
              decompiledCaughtException = decompiledCaughtParameter0;
              var5 = (Exception) (Object) decompiledCaughtException;
              var5.printStackTrace();
            }
            return;
          } catch (java.lang.RuntimeException decompiledCaughtParameter1) {
            decompiledCaughtException = decompiledCaughtParameter1;
            var2_ref = (RuntimeException) (Object) decompiledCaughtException;
            throw qo.a((Throwable) ((Object) var2_ref), "Sumoblitz.I(" + param0 + ')');
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
          if (null != vf.field_a) {
            rj.a(vf.field_a, -5);
            vf.field_a = null;
            ls.b(param0 - 21961);
          }
          if (param0 != 21961) {
            this.g((byte) -69);
          }
          jg.field_a = true;
          kf.field_v = wd.a(4, (byte) 125);
          dq.field_Z = wd.a(5, (byte) 125);
          hl.field_d = wd.a(6, (byte) 125);
          er.field_c = wd.a(7, (byte) 125);
          gg.field_r = wd.a(8, (byte) 125);
          be.field_s = wd.a(9, (byte) 125);
          ik.field_d = wd.a(12, (byte) 125);
          iv.field_b = new Random(wq.a(-52));
          if (null == nq.field_h) {
            nq.field_h = new ik(11, -1, (d) null);
          }
          return;
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
        boolean stackIn_11_1 = false;
        int stackIn_85_1 = 0;
        boolean stackIn_86_2 = false;
        RuntimeException decompiledCaughtException = null;
        int var2_int = 0;
        RuntimeException var2 = null;
        hg var3_ref_hg = null;
        int var3 = 0;
        int var4 = 0;
        var4 = field_L ? 1 : 0;
        try {
          fv.e((byte) 76);
          if (gk.field_o != null &&
            gk.field_o.field_a) {
            b.c((byte) 49);
            qw.a((byte) 35);
          }
          stackIn_11_1 = (null != gk.field_o);
          this.b(stackIn_11_1, -103);
          if (ml.field_u) {
            this.r(21961);
            ml.field_u = false;
          }
          if (in.g(-42)) {
            this.m(106);
            if (in.g(-33)) {
              if (we.g(-1)) {
                discarded$0 = this.a(false, true);
              }
              return;
            }
          }
          boolean decompiledFrameRemainder0 = true;
          boolean decompiledSharedTail0 = !(sa.field_j);
          if (!decompiledSharedTail0) {
            if (!su.a(0)) {
              ou.d((byte) -112);
              decompiledFrameRemainder0 = !(!su.a(0));
              if (decompiledFrameRemainder0) {
                oq.a(-24233);
                ad.c(0);
                if (5 == nj.field_b &&
                  0 == wj.field_e) {
                  nj.field_b = 2;
                  av.a(-7753, false, 2);
                }
                decompiledFrameRemainder0 = !(!so.a((byte) 119));
                if (decompiledFrameRemainder0) {
                  vb.a((byte) -111, true);
                  decompiledFrameRemainder0 = (var4 != 0);
                }
              }
            }
            if (decompiledFrameRemainder0) {
              if (so.a((byte) 107)) {
                if (0 == ra.field_e) {
                  var2_int = kt.a(-38);
                  switch (var2_int) {
                    case 2:
                      b.c((byte) 71);
                      break;
                    case 3:
                      vb.a((byte) -21, true);
                      break;
                    case 4:
                      wn.a(true);
                      break;
                    default:
                      break;
                  }
                  if (!so.a((byte) 109)) {
                    iv.field_g[nj.field_b].b(-8628, true);
                  }
                  decompiledFrameRemainder0 = (var4 != 0);
                }
                if (decompiledFrameRemainder0) {
                  this.g((byte) 96);
                  decompiledFrameRemainder0 = (var4 != 0);
                }
              }
              if (decompiledFrameRemainder0) {
                if (!sj.a(-123)) {
                  this.g((byte) -94);
                  decompiledFrameRemainder0 = (var4 != 0);
                }
                if (decompiledFrameRemainder0) {
                  stackIn_85_1 = -1;
                  stackIn_86_2 = (gk.field_o != null);
                  var2_int = this.a(stackIn_85_1, stackIn_86_2);
                  if (1 == var2_int ||
                    var2_int == 2) {
                    if (null != gk.field_o) {
                      b.c((byte) 49);
                    }
                    if (2 == var2_int) {
                      jl.a(ra.c(2), false);
                    }
                  }
                  decompiledSharedTail0 = (var4 != 0);
                }
              }
            }
          }
          if ((decompiledFrameRemainder0) &&
            (decompiledSharedTail0)) {
            rg.a((byte) 55, pn.field_r);
            if (this.a(true, true)) {
              sa.field_j = true;
            }
          }
          var2_int = 35 % ((37 - param0) / 61);
          if (!vs.b((byte) 9)) {
            do {
              var3_ref_hg = (hg) (pn.field_q.c(9));
              if (var3_ref_hg == null) {
                if (var4 == 0) {
                  break;
                }
              } else {
                an.a(4, (byte) 30, var3_ref_hg);
              }
            } while (var4 == 0);
          }
          do {
            if (!vs.a(ov.field_e, -126)) {
              gt.a(0, 0);
              break;
            }
            this.q(9289);
          } while (var4 == 0);
          if (en.a(-23517)) {
            var3 = this.b(true);
            if (var3 == 2) {
              we.a((byte) 70);
            }
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2 = decompiledCaughtException;
          throw qo.a((Throwable) ((Object) var2), "Sumoblitz.D(" + param0 + ')');
        }
    }

    private final boolean h(byte param0) {
        ha var2 = null;
        RuntimeException var2_ref = null;
        RuntimeException decompiledCaughtException = null;
        try {
          if (param0 >= -4) {
            field_H = -36;
          }
          var2 = nq.field_h.a(-125);
          if (var2 == null) {
            return false;
          }
          if (var2.c()) {
            wj.field_k = false;
            ul.field_f = 0;
            if (field_L) {
              ul.field_f = 1;
              wj.field_k = true;
            }
          } else {
            ul.field_f = 1;
            wj.field_k = true;
          }
          er.a(false);
          return true;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2_ref = decompiledCaughtException;
          throw qo.a((Throwable) ((Object) var2_ref), "Sumoblitz.RA(" + param0 + ')');
        }
    }

    private final boolean a(boolean param0, boolean param1) {
        try {
          boolean discarded$0 = false;
          ik stackIn_95_0 = null;
          boolean stackIn_96_1 = false;
          boolean stackIn_134_0 = false;
          boolean stackIn_249_0 = false;
          boolean stackIn_276_0 = false;
          boolean stackIn_363_0 = false;
          ik stackIn_450_0 = null;
          boolean stackIn_451_1 = false;
          boolean stackIn_492_0 = false;
          boolean stackIn_606_0 = false;
          Throwable decompiledCaughtException = null;
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
          var11 = field_L ? 1 : 0;
          try {
            cl.e(-69);
            if (null != hl.field_d) {
              if (pi.field_c.b((byte) 127) &&
                pi.field_c.a("basic", 100)) {
                if (!pi.field_c.a("arialbold14", 100)) {
                  pe.a(20, 4.0f, pt.a("arialbold14", pi.field_c, ce.field_l, true, ow.field_a));
                  return false;
                }
                if (vb.field_J.b((byte) 127) &&
                  vb.field_J.a("arialbold14", 100)) {
                  if (!pi.field_c.a("arial13", 100)) {
                    pe.a(20, 4.0f, pt.a("arial13", pi.field_c, ce.field_l, true, ow.field_a));
                    return false;
                  }
                  if (vb.field_J.b((byte) 127) &&
                    vb.field_J.a("arial13", 100)) {
                    if (hl.field_d.b((byte) 127) &&
                      hl.field_d.a(true)) {
                      if (er.field_c.b((byte) 127) &&
                        er.field_c.a(param1)) {
                        if (gg.field_r.b((byte) 127) &&
                          gg.field_r.a(param1)) {
                          if (be.field_s.b((byte) 127) &&
                            be.field_s.a(true)) {
                            if (kf.field_v.b((byte) 127) &&
                              kf.field_v.a(true)) {
                              if (dq.field_Z.b((byte) 127) &&
                                dq.field_Z.a(true)) {
                                if (ik.field_d.b((byte) 127) &&
                                  ik.field_d.a(true)) {
                                  boolean decompiledFrameRemainder6 = true;
                                  pe.a(20, 65.0f, hv.field_e);
                                  var3 = hk.b(-22);
                                  lk.b();
                                  if (in.g(-61)) {
                                    ad.a((byte) 85, var3, np.a(7));
                                    decompiledFrameRemainder6 = (var11 != 0);
                                  }
                                  if (decompiledFrameRemainder6) {
                                    if (!sa.field_j) {
                                      od.a(-117, var3);
                                      decompiledFrameRemainder6 = (var11 != 0);
                                    }
                                    if (decompiledFrameRemainder6) {
                                      if (!su.a(0)) {
                                        pe.a(20, 100.0f, fl.field_s);
                                        od.a(-117, var3);
                                        decompiledFrameRemainder6 = (var11 != 0);
                                      }
                                      if (decompiledFrameRemainder6) {
                                        stackIn_95_0 = nq.field_h;
                                        stackIn_96_1 = !(param1);
                                        if (!((ik) (Object) stackIn_95_0).a(stackIn_96_1) ||
                                          this.h((byte) -105)) {
                                          var4 = nq.field_h.a(-97);
                                          var4.GA(0);
                                          ph.field_b.a(124, var4, false);
                                          if (~rc.field_k == ~nj.field_b) {
                                            if (-1 != nj.field_b) {
                                              iv.field_g[nj.field_b].a(255, var4, -2355);
                                              if (var11 != 0) {
                                                var5_int = 255 * eh.field_a / 30;
                                                if (-1 != nj.field_b) {
                                                  iv.field_g[nj.field_b].a(255 - var5_int, var4, -2355);
                                                }
                                                if (rc.field_k != -1) {
                                                  iv.field_g[rc.field_k].a(var5_int, var4, -2355);
                                                }
                                              }
                                            }
                                          } else {
                                            var5_int = 255 * eh.field_a / 30;
                                            if (-1 != nj.field_b) {
                                              iv.field_g[nj.field_b].a(255 - var5_int, var4, -2355);
                                            }
                                            if (rc.field_k != -1) {
                                              iv.field_g[rc.field_k].a(var5_int, var4, -2355);
                                            }
                                          }
                                          if (so.a((byte) 124)) {
                                            lk.a(0, 0, lk.field_b, lk.field_c);
                                            pn.d((byte) -7);
                                          }
                                          if (0 != ra.field_e) {
                                            var5_int = eh.field_a * 256 / 30;
                                            if (var5_int > 0) {
                                              lk.b(0, 0, lk.field_b, lk.field_c, 0, var5_int);
                                            }
                                          }
                                          if (sj.a(-67) &&
                                            !so.a((byte) 115)) {
                                            if (null != gk.field_o) {
                                              stackIn_134_0 = true;
                                            } else {
                                              stackIn_134_0 = ii.field_a;
                                            }
                                            kn.a(stackIn_134_0, 25);
                                          }
                                          if (ku.field_j >= 2 &&
                                            gw.field_v) {
                                            bq.field_c.a(20, 20, 16777215, Integer.toString(aj.field_B), (byte) -103, 1);
                                          }
                                          var5 = (ge) (pl.field_v.b(82));
                                          if (null != var5) {
                                            var7 = qn.field_g;
                                            if (var7 < 64) {
                                              var6_int = 255 * var7 / 64;
                                              if (var11 != 0) {
                                                if (var7 <= 192) {
                                                  var6_int = 255;
                                                  var6_int = (-(255 * var7) + 48960) / 64;
                                                } else {
                                                  var6_int = (-(255 * var7) + 48960) / 64;
                                                }
                                              }
                                            } else {
                                              if (var7 <= 192) {
                                                var6_int = 255;
                                                if (var11 != 0) {
                                                  var6_int = (-(255 * var7) + 48960) / 64;
                                                }
                                              } else {
                                                var6_int = (-(255 * var7) + 48960) / 64;
                                              }
                                            }
                                            var8 = 45;
                                            if (0 <= var5.field_m) {
                                              var9_ref_String = rb.field_d[var5.field_m];
                                              if (!(qw.field_a.length <= var5.field_m)) {
                                                qw.field_a[var5.field_m].a(-32 + (85 + rj.field_c - 180), 45, 64, 64, 0, 16777215 | var6_int << 24, 1);
                                                var8 += 65;
                                                if (var11 != 0) {
                                                  var9_ref_String = aa.field_b;
                                                }
                                              }
                                            } else {
                                              var9_ref_String = aa.field_b;
                                            }
                                            bq.field_c.a(150, var6_int << 24, 0, 170, rj.field_c - 180, (int[]) null, (hr[]) null, -1 + var8, var6_int << 24, 0, 18, -8787, var9_ref_String, (aa) null, 1, 0);
                                            bq.field_c.a(150, var6_int << 24, 0, 170, -180 + rj.field_c, (int[]) null, (hr[]) null, 1 + var8, var6_int << 24, 0, 18, -8787, var9_ref_String, (aa) null, 1, 0);
                                            bq.field_c.a(150, var6_int << 24 | 16777215, 0, 170, rj.field_c - 180, (int[]) null, (hr[]) null, var8, -1, 0, 18, -8787, var9_ref_String, (aa) null, 1, 0);
                                          }
                                          boolean decompiledSharedTail8 = !(oj.a(false));
                                          if (!decompiledSharedTail8) {
                                            var6_int = (-lk.field_b + gi.field_h) * 0 / 2;
                                            var7 = (-lk.field_c + wq.field_b) * 0 / 2;
                                            cf.a(var6_int, var7, 76);
                                            kn.a(false, (byte) -122);
                                            this.field_F = true;
                                            decompiledSharedTail8 = (var11 != 0);
                                          }
                                          if (decompiledSharedTail8) {
                                            if (sj.a(-126)) {
                                              var6_int = (-lk.field_b + gi.field_h) * 0 / 2;
                                              var7 = (wq.field_b - lk.field_c) * 0 / 2;
                                              ls.a(var6_int, -45, var7);
                                              kn.a(false, -66);
                                              this.field_F = true;
                                              if (var11 != 0 &&
                                                !ws.b((byte) 52)) {
                                                this.field_F = false;
                                              }
                                            } else {
                                              if (!ws.b((byte) 52)) {
                                                this.field_F = false;
                                              }
                                            }
                                          }
                                          if (this.field_F) {
                                            var6_int = lk.field_b;
                                            var7 = lk.field_c;
                                            if (this.field_K != null) {
                                              var6_int = this.field_K.field_x;
                                              var7 = this.field_K.field_u;
                                            }
                                            var8 = (-var6_int + gi.field_h) / 2;
                                            var9 = (-var7 + wq.field_b) / 2;
                                            if (oj.a(false) &&
                                              this.field_K != null) {
                                              var8 = ik.c(-10517);
                                              var9 = fd.b(3878);
                                            }
                                            var10 = wq.a(var4, (byte) 126);
                                            var10.a((byte) 91, var9, var7 + var9, var8, var6_int + var8);
                                            var9 = (-lk.field_c + wq.field_b) / 2;
                                            var8 = (-lk.field_b + gi.field_h) / 2;
                                            var4.SA(var8, var9, lk.field_b, lk.field_c, lk.field_a, 0, lk.field_b);
                                            var10.a(29709);
                                          }
                                          try {
                                            var4.a(true);
                                          } catch (java.lang.Exception decompiledCaughtParameter0) {
                                            decompiledCaughtException = decompiledCaughtParameter0;
                                            var6 = (Exception) (Object) decompiledCaughtException;
                                            var6.printStackTrace();
                                          }
                                        }
                                      }
                                    }
                                  }
                                  if (!param0) {
                                    return false;
                                  }
                                  eb.field_b = new og(hl.field_d, er.field_c);
                                  ff.a((byte) -62, hl.field_d);
                                  oq.a(-24233);
                                  hl.field_d = null;
                                  ls.b(0);
                                  return false;
                                }
                                pe.a(20, 60.0f, nw.a(nm.field_n, (byte) 85, 0, ik.field_d, b.field_f));
                                return false;
                              }
                              pe.a(20, 55.0f, pt.a("", dq.field_Z, ce.field_l, true, ow.field_a));
                              return false;
                            }
                            pe.a(20, 45.0f, pt.a("", kf.field_v, m.field_V, true, es.field_j));
                            return false;
                          }
                          pe.a(20, 40.0f, pt.a("", be.field_s, ve.field_l, true, gt.field_hb));
                          return false;
                        }
                        pe.a(20, 30.0f, nw.a(jf.field_a, (byte) 85, 0, gg.field_r, sg.field_i));
                        return false;
                      }
                      pe.a(20, 20.0f, pt.a("", er.field_c, fn.field_A, true, hq.field_a));
                      return false;
                    }
                    pe.a(20, 10.0f, pt.a("", hl.field_d, fn.field_A, true, hq.field_a));
                    return false;
                  }
                  pe.a(20, 5.0f, pt.a("arial13", vb.field_J, ce.field_l, true, ow.field_a));
                  return false;
                }
                pe.a(20, 5.0f, pt.a("arialbold14", vb.field_J, ce.field_l, true, ow.field_a));
                return false;
              }
              pe.a(20, 3.0f, pt.a("basic", pi.field_c, m.field_V, true, es.field_j));
              return false;
            }
            if (null != er.field_c) {
              boolean decompiledFrameRemainder5 = true;
              pe.a(20, 70.0f, hv.field_e);
              var3 = hk.b(-103);
              lk.b();
              if (in.g(-96)) {
                ad.a((byte) -45, var3, np.a(7));
                decompiledFrameRemainder5 = (var11 != 0);
              }
              if (decompiledFrameRemainder5) {
                if (!sa.field_j) {
                  od.a(-121, var3);
                  decompiledFrameRemainder5 = (var11 != 0);
                }
                if (decompiledFrameRemainder5) {
                  if (!su.a(0)) {
                    pe.a(20, 100.0f, fl.field_s);
                    od.a(-68, var3);
                    decompiledFrameRemainder5 = (var11 != 0);
                  }
                  if ((decompiledFrameRemainder5) && (!nq.field_h.a(false) ||
                    this.h((byte) -99))) {
                    var4 = nq.field_h.a(-121);
                    var4.GA(0);
                    ph.field_b.a(123, var4, false);
                    boolean decompiledSharedTail7 = (~rc.field_k == ~nj.field_b);
                    if (!decompiledSharedTail7) {
                      var5_int = eh.field_a * 255 / 30;
                      if (nj.field_b != -1) {
                        iv.field_g[nj.field_b].a(-var5_int + 255, var4, -2355);
                      }
                      if (rc.field_k != -1) {
                        iv.field_g[rc.field_k].a(var5_int, var4, -2355);
                      }
                      decompiledSharedTail7 = (var11 != 0);
                    }
                    if ((decompiledSharedTail7) &&
                      (nj.field_b != -1)) {
                      iv.field_g[nj.field_b].a(255, var4, -2355);
                    }
                    if (so.a((byte) 118)) {
                      lk.a(0, 0, lk.field_b, lk.field_c);
                      pn.d((byte) -7);
                    }
                    if (ra.field_e != 0) {
                      var5_int = eh.field_a * 256 / 30;
                      if (var5_int > 0) {
                        lk.b(0, 0, lk.field_b, lk.field_c, 0, var5_int);
                      }
                    }
                    if (sj.a(-126) &&
                      !so.a((byte) 110)) {
                      if (gk.field_o != null) {
                        stackIn_249_0 = true;
                      } else {
                        stackIn_249_0 = ii.field_a;
                      }
                      kn.a(stackIn_249_0, 64);
                    }
                    if (2 <= ku.field_j &&
                      gw.field_v) {
                      bq.field_c.a(20, 20, 16777215, Integer.toString(aj.field_B), (byte) -98, 1);
                    }
                    var5 = (ge) (pl.field_v.b(-100));
                    if (var5 != null) {
                      var7 = qn.field_g;
                      if (64 <= var7) {
                        if (192 >= var7) {
                          var6_int = 255;
                          if (var11 != 0) {
                            var6_int = (48960 - 255 * var7) / 64;
                            var6_int = var7 * 255 / 64;
                          }
                        } else {
                          var6_int = (48960 - 255 * var7) / 64;
                          if (var11 != 0) {
                            var6_int = var7 * 255 / 64;
                          }
                        }
                      } else {
                        var6_int = var7 * 255 / 64;
                      }
                      var8 = 45;
                      if (var5.field_m >= 0) {
                        var9_ref_String = rb.field_d[var5.field_m];
                        if (!(var5.field_m >= qw.field_a.length)) {
                          var8 += 65;
                          qw.field_a[var5.field_m].a(-180 + rj.field_c + 85 - 32, 45, 64, 64, 0, var6_int << 24 | 16777215, 1);
                          if (var11 != 0) {
                            var9_ref_String = aa.field_b;
                          }
                        }
                      } else {
                        var9_ref_String = aa.field_b;
                      }
                      bq.field_c.a(150, var6_int << 24, 0, 170, -180 + rj.field_c, (int[]) null, (hr[]) null, -1 + var8, var6_int << 24, 0, 18, -8787, var9_ref_String, (aa) null, 1, 0);
                      bq.field_c.a(150, var6_int << 24, 0, 170, rj.field_c - 180, (int[]) null, (hr[]) null, 1 + var8, var6_int << 24, 0, 18, -8787, var9_ref_String, (aa) null, 1, 0);
                      bq.field_c.a(150, var6_int << 24 | 16777215, 0, 170, rj.field_c - 180, (int[]) null, (hr[]) null, var8, -1, 0, 18, -8787, var9_ref_String, (aa) null, 1, 0);
                    }
                    stackIn_276_0 = !param1;
                    boolean decompiledFrameRemainder4 = true;
                    if (oj.a(stackIn_276_0)) {
                      var6_int = 0 * (-lk.field_b + gi.field_h) / 2;
                      var7 = 0 * (-lk.field_c + wq.field_b) / 2;
                      cf.a(var6_int, var7, 126);
                      kn.a(false, (byte) -122);
                      this.field_F = true;
                      decompiledFrameRemainder4 = (var11 != 0);
                    }
                    if (decompiledFrameRemainder4) {
                      if (!sj.a(-124)) {
                        if (!ws.b((byte) 52)) {
                          this.field_F = false;
                          if (var11 != 0) {
                            var6_int = (-lk.field_b + gi.field_h) * 0 / 2;
                            var7 = (-lk.field_c + wq.field_b) * 0 / 2;
                            ls.a(var6_int, -66, var7);
                            kn.a(false, -124);
                            this.field_F = true;
                          }
                        }
                      } else {
                        var6_int = (-lk.field_b + gi.field_h) * 0 / 2;
                        var7 = (-lk.field_c + wq.field_b) * 0 / 2;
                        ls.a(var6_int, -66, var7);
                        kn.a(false, -124);
                        this.field_F = true;
                      }
                    }
                    if (this.field_F) {
                      var6_int = lk.field_b;
                      var7 = lk.field_c;
                      if (null != this.field_K) {
                        var6_int = this.field_K.field_x;
                        var7 = this.field_K.field_u;
                      }
                      var8 = (-var6_int + gi.field_h) / 2;
                      var9 = (-var7 + wq.field_b) / 2;
                      if (oj.a(false) &&
                        null != this.field_K) {
                        var8 = ik.c(-10517);
                        var9 = fd.b(3878);
                      }
                      var10 = wq.a(var4, (byte) 70);
                      var10.a((byte) -88, var9, var7 + var9, var8, var6_int + var8);
                      var9 = (-lk.field_c + wq.field_b) / 2;
                      var8 = (-lk.field_b + gi.field_h) / 2;
                      var4.SA(var8, var9, lk.field_b, lk.field_c, lk.field_a, 0, lk.field_b);
                      var10.a(29709);
                    }
                    try {
                      var4.a(true);
                    } catch (java.lang.Exception decompiledCaughtParameter4) {
                      decompiledCaughtException = decompiledCaughtParameter4;
                      var6 = (Exception) (Object) decompiledCaughtException;
                      var6.printStackTrace();
                    }
                  }
                }
              }
              dw.a(er.field_c, 105);
              er.field_c = null;
              ls.b(0);
              return false;
            }
            if (null != be.field_s) {
              boolean decompiledFrameRemainder3 = true;
              pe.a(20, 75.0f, su.field_d);
              var3 = hk.b(-103);
              lk.b();
              if (in.g(-98)) {
                ad.a((byte) 95, var3, np.a(7));
                decompiledFrameRemainder3 = (var11 != 0);
              }
              if (decompiledFrameRemainder3) {
                if (!sa.field_j) {
                  od.a(-73, var3);
                  decompiledFrameRemainder3 = (var11 != 0);
                }
                if (decompiledFrameRemainder3) {
                  if (!su.a(0)) {
                    pe.a(20, 100.0f, fl.field_s);
                    od.a(-111, var3);
                    decompiledFrameRemainder3 = (var11 != 0);
                  }
                  if ((decompiledFrameRemainder3) && (!nq.field_h.a(false) ||
                    this.h((byte) -48) ||
                    var11 != 0)) {
                    var4 = nq.field_h.a(-128);
                    var4.GA(0);
                    ph.field_b.a(124, var4, false);
                    boolean decompiledSharedTail6 = (~nj.field_b == ~rc.field_k);
                    if (!decompiledSharedTail6) {
                      var5_int = 255 * eh.field_a / 30;
                      if (nj.field_b != -1) {
                        iv.field_g[nj.field_b].a(-var5_int + 255, var4, -2355);
                      }
                      if (rc.field_k != -1) {
                        iv.field_g[rc.field_k].a(var5_int, var4, -2355);
                      }
                      decompiledSharedTail6 = (var11 != 0);
                    }
                    if ((decompiledSharedTail6) &&
                      (-1 != nj.field_b)) {
                      iv.field_g[nj.field_b].a(255, var4, -2355);
                    }
                    if (so.a((byte) 109)) {
                      lk.a(0, 0, lk.field_b, lk.field_c);
                      pn.d((byte) -7);
                    }
                    if (ra.field_e != 0) {
                      var5_int = eh.field_a * 256 / 30;
                      if (0 < var5_int) {
                        lk.b(0, 0, lk.field_b, lk.field_c, 0, var5_int);
                      }
                    }
                    if (sj.a(-28) &&
                      !so.a((byte) -55)) {
                      if (gk.field_o == null) {
                        stackIn_363_0 = ii.field_a;
                      } else {
                        stackIn_363_0 = true;
                      }
                      kn.a(stackIn_363_0, -122);
                    }
                    if (ku.field_j >= 2 &&
                      gw.field_v) {
                      bq.field_c.a(20, 20, 16777215, Integer.toString(aj.field_B), (byte) -122, 1);
                    }
                    var5 = (ge) (pl.field_v.b(-85));
                    if (null != var5) {
                      var7 = qn.field_g;
                      if (64 <= var7) {
                        if (var7 <= 192) {
                          var6_int = 255;
                          if (var11 != 0) {
                            var6_int = (48960 - var7 * 255) / 64;
                            var6_int = 255 * var7 / 64;
                          }
                        } else {
                          var6_int = (48960 - var7 * 255) / 64;
                          if (var11 != 0) {
                            var6_int = 255 * var7 / 64;
                          }
                        }
                      } else {
                        var6_int = 255 * var7 / 64;
                      }
                      var8 = 45;
                      boolean decompiledSharedTail5 = !(var5.field_m < 0);
                      if (!decompiledSharedTail5) {
                        var9_ref_String = aa.field_b;
                        decompiledSharedTail5 = (var11 != 0);
                      }
                      if (decompiledSharedTail5) {
                        var9_ref_String = rb.field_d[var5.field_m];
                        if (qw.field_a.length > var5.field_m) {
                          var8 += 65;
                          qw.field_a[var5.field_m].a(rj.field_c - 180 + 53, 45, 64, 64, 0, var6_int << 24 | 16777215, 1);
                        }
                      }
                      bq.field_c.a(150, var6_int << 24, 0, 170, -180 + rj.field_c, (int[]) null, (hr[]) null, var8 - 1, var6_int << 24, 0, 18, -8787, var9_ref_String, (aa) null, 1, 0);
                      bq.field_c.a(150, var6_int << 24, 0, 170, rj.field_c - 180, (int[]) null, (hr[]) null, 1 + var8, var6_int << 24, 0, 18, -8787, var9_ref_String, (aa) null, 1, 0);
                      bq.field_c.a(150, var6_int << 24 | 16777215, 0, 170, rj.field_c - 180, (int[]) null, (hr[]) null, var8, -1, 0, 18, -8787, var9_ref_String, (aa) null, 1, 0);
                    }
                    boolean decompiledFrameRemainder2 = true;
                    if (oj.a(false)) {
                      var6_int = 0 * (gi.field_h - lk.field_b) / 2;
                      var7 = (wq.field_b - lk.field_c) * 0 / 2;
                      cf.a(var6_int, var7, 86);
                      kn.a(false, (byte) -122);
                      this.field_F = true;
                      decompiledFrameRemainder2 = (var11 != 0);
                    }
                    if (decompiledFrameRemainder2) {
                      if (!sj.a(-63)) {
                        if (!ws.b((byte) 52)) {
                          this.field_F = false;
                          if (var11 != 0) {
                            var6_int = 0 * (gi.field_h - lk.field_b) / 2;
                            var7 = (wq.field_b - lk.field_c) * 0 / 2;
                            ls.a(var6_int, -82, var7);
                            kn.a(false, -100);
                            this.field_F = true;
                          }
                        }
                      } else {
                        var6_int = 0 * (gi.field_h - lk.field_b) / 2;
                        var7 = (wq.field_b - lk.field_c) * 0 / 2;
                        ls.a(var6_int, -82, var7);
                        kn.a(false, -100);
                        this.field_F = true;
                      }
                    }
                    if (this.field_F) {
                      var6_int = lk.field_b;
                      var7 = lk.field_c;
                      if (this.field_K != null) {
                        var6_int = this.field_K.field_x;
                        var7 = this.field_K.field_u;
                      }
                      var8 = (gi.field_h - var6_int) / 2;
                      var9 = (-var7 + wq.field_b) / 2;
                      if (oj.a(false) &&
                        this.field_K != null) {
                        var8 = ik.c(-10517);
                        var9 = fd.b(3878);
                      }
                      var10 = wq.a(var4, (byte) 28);
                      var10.a((byte) 127, var9, var7 + var9, var8, var8 + var6_int);
                      var9 = (wq.field_b - lk.field_c) / 2;
                      var8 = (-lk.field_b + gi.field_h) / 2;
                      var4.SA(var8, var9, lk.field_b, lk.field_c, lk.field_a, 0, lk.field_b);
                      var10.a(29709);
                    }
                    try {
                      var4.a(true);
                    } catch (java.lang.Exception decompiledCaughtParameter1) {
                      decompiledCaughtException = decompiledCaughtParameter1;
                      var6 = (Exception) (Object) decompiledCaughtException;
                      var6.printStackTrace();
                    }
                  }
                }
              }
              au.a(-1509, be.field_s);
              be.field_s = null;
              ls.b(0);
              return false;
            }
            if (gg.field_r != null) {
              if (!il.a(false, gg.field_r)) {
                ls.b(0);
                return false;
              }
              gg.field_r = null;
              ls.b(0);
              return false;
            }
            if (ik.field_d != null) {
              boolean decompiledFrameRemainder1 = true;
              pe.a(20, 80.0f, om.field_n);
              var3 = hk.b(125);
              lk.b();
              if (in.g(-128)) {
                ad.a((byte) -75, var3, np.a(7));
                decompiledFrameRemainder1 = (var11 != 0);
              }
              if (decompiledFrameRemainder1) {
                if (!sa.field_j) {
                  od.a(-67, var3);
                  decompiledFrameRemainder1 = (var11 != 0);
                }
                if (decompiledFrameRemainder1) {
                  if (!su.a(0)) {
                    pe.a(20, 100.0f, fl.field_s);
                    od.a(-52, var3);
                    decompiledFrameRemainder1 = (var11 != 0);
                  }
                  if (decompiledFrameRemainder1) {
                    stackIn_450_0 = nq.field_h;
                    stackIn_451_1 = !(param1);
                    if (!((ik) (Object) stackIn_450_0).a(stackIn_451_1) ||
                      this.h((byte) -11) ||
                      var11 != 0) {
                      var4 = nq.field_h.a(-120);
                      var4.GA(0);
                      ph.field_b.a(122, var4, false);
                      boolean decompiledSharedTail4 = (~nj.field_b == ~rc.field_k);
                      if (!decompiledSharedTail4) {
                        var5_int = eh.field_a * 255 / 30;
                        if (-1 != nj.field_b) {
                          iv.field_g[nj.field_b].a(-var5_int + 255, var4, -2355);
                        }
                        if (rc.field_k != -1) {
                          iv.field_g[rc.field_k].a(var5_int, var4, -2355);
                        }
                        decompiledSharedTail4 = (var11 != 0);
                      }
                      if ((decompiledSharedTail4) &&
                        (nj.field_b != -1)) {
                        iv.field_g[nj.field_b].a(255, var4, -2355);
                      }
                      if (so.a((byte) -36)) {
                        lk.a(0, 0, lk.field_b, lk.field_c);
                        pn.d((byte) -7);
                      }
                      if (ra.field_e != 0) {
                        var5_int = 256 * eh.field_a / 30;
                        if (var5_int > 0) {
                          lk.b(0, 0, lk.field_b, lk.field_c, 0, var5_int);
                        }
                      }
                      if (sj.a(-103) &&
                        !so.a((byte) 127)) {
                        if (null != gk.field_o) {
                          stackIn_492_0 = true;
                        } else {
                          stackIn_492_0 = ii.field_a;
                        }
                        kn.a(stackIn_492_0, 115);
                      }
                      if (ku.field_j >= 2 &&
                        gw.field_v) {
                        bq.field_c.a(20, 20, 16777215, Integer.toString(aj.field_B), (byte) -61, 1);
                      }
                      var5 = (ge) (pl.field_v.b(110));
                      if (null != var5) {
                        var7 = qn.field_g;
                        if (var7 < 64) {
                          var6_int = 255 * var7 / 64;
                          if (var11 != 0) {
                            if (var7 > 192) {
                              var6_int = (192 - var7) * 255 / 64;
                              var6_int = 255;
                            } else {
                              var6_int = 255;
                            }
                          }
                        } else {
                          if (var7 > 192) {
                            var6_int = (192 - var7) * 255 / 64;
                            if (var11 != 0) {
                              var6_int = 255;
                            }
                          } else {
                            var6_int = 255;
                          }
                        }
                        var8 = 45;
                        boolean decompiledSharedTail3 = !(0 > var5.field_m);
                        if (!decompiledSharedTail3) {
                          var9_ref_String = aa.field_b;
                          decompiledSharedTail3 = (var11 != 0);
                        }
                        if (decompiledSharedTail3) {
                          var9_ref_String = rb.field_d[var5.field_m];
                          if (qw.field_a.length > var5.field_m) {
                            var8 += 65;
                            qw.field_a[var5.field_m].a(-127 + rj.field_c, 45, 64, 64, 0, var6_int << 24 | 16777215, 1);
                          }
                        }
                        bq.field_c.a(150, var6_int << 24, 0, 170, rj.field_c - 180, (int[]) null, (hr[]) null, -1 + var8, var6_int << 24, 0, 18, -8787, var9_ref_String, (aa) null, 1, 0);
                        bq.field_c.a(150, var6_int << 24, 0, 170, -180 + rj.field_c, (int[]) null, (hr[]) null, 1 + var8, var6_int << 24, 0, 18, -8787, var9_ref_String, (aa) null, 1, 0);
                        bq.field_c.a(150, var6_int << 24 | 16777215, 0, 170, rj.field_c - 180, (int[]) null, (hr[]) null, var8, -1, 0, 18, -8787, var9_ref_String, (aa) null, 1, 0);
                      }
                      boolean decompiledSharedTail2 = !(oj.a(false));
                      if (!decompiledSharedTail2) {
                        var6_int = (gi.field_h - lk.field_b) * 0 / 2;
                        var7 = (-lk.field_c + wq.field_b) * 0 / 2;
                        cf.a(var6_int, var7, -44);
                        kn.a(false, (byte) -122);
                        this.field_F = true;
                        decompiledSharedTail2 = (var11 != 0);
                      }
                      if (decompiledSharedTail2) {
                        if (sj.a(-61)) {
                          var6_int = (-lk.field_b + gi.field_h) * 0 / 2;
                          var7 = (wq.field_b - lk.field_c) * 0 / 2;
                          ls.a(var6_int, -95, var7);
                          kn.a(false, -109);
                          this.field_F = true;
                          if (var11 != 0 &&
                            !ws.b((byte) 52)) {
                            this.field_F = false;
                          }
                        } else {
                          if (!ws.b((byte) 52)) {
                            this.field_F = false;
                          }
                        }
                      }
                      if (this.field_F) {
                        var6_int = lk.field_b;
                        var7 = lk.field_c;
                        if (this.field_K != null) {
                          var7 = this.field_K.field_u;
                          var6_int = this.field_K.field_x;
                        }
                        var8 = (-var6_int + gi.field_h) / 2;
                        var9 = (-var7 + wq.field_b) / 2;
                        if (oj.a(false) &&
                          this.field_K != null) {
                          var8 = ik.c(-10517);
                          var9 = fd.b(3878);
                        }
                        var10 = wq.a(var4, (byte) 83);
                        var10.a((byte) 71, var9, var9 + var7, var8, var8 + var6_int);
                        var9 = (wq.field_b - lk.field_c) / 2;
                        var8 = (gi.field_h - lk.field_b) / 2;
                        var4.SA(var8, var9, lk.field_b, lk.field_c, lk.field_a, 0, lk.field_b);
                        var10.a(29709);
                      }
                      try {
                        var4.a(true);
                      } catch (java.lang.Exception decompiledCaughtParameter2) {
                        decompiledCaughtException = decompiledCaughtParameter2;
                        var6 = (Exception) (Object) decompiledCaughtException;
                        var6.printStackTrace();
                      }
                    }
                  }
                }
              }
              sb.a(-9937, ik.field_d);
              ik.field_d = null;
              ls.b(0);
              return false;
            }
            if (null == pi.field_c) {
              if (!param1) {
                discarded$0 = this.h((byte) -12);
              }
              if (vi.f(5)) {
                var3_int = 0;
                while (true) {
                  if (13 > var3_int) {
                    iv.field_g[var3_int] = ga.a(var3_int, (byte) -100);
                    var3_int++;
                    if (var11 == 0) {
                      continue;
                    }
                  } else {
                    nj.field_b = 0;
                    bp.a(50, 26175);
                    nn.b(50, -106);
                    mo.a(86, 0);
                    ek.b(true, 0);
                  }
                  break;
                }
                vl.field_a = 0;
              }
              if (nq.field_h.a(-113) == null) {
                nq.field_h.a(false);
                if (!this.h((byte) -124)) {
                  return false;
                }
              }
              ph.field_b = new qu();
              return true;
            }
            boolean decompiledFrameRemainder0 = true;
            pe.a(20, 90.0f, kn.field_e);
            var3 = hk.b(78);
            lk.b();
            if (in.g(-70)) {
              ad.a((byte) -86, var3, np.a(7));
              decompiledFrameRemainder0 = (var11 != 0);
            }
            if (decompiledFrameRemainder0) {
              if (!sa.field_j) {
                od.a(-62, var3);
                decompiledFrameRemainder0 = (var11 != 0);
              }
              if (decompiledFrameRemainder0) {
                if (!su.a(0)) {
                  pe.a(20, 100.0f, fl.field_s);
                  od.a(-110, var3);
                  decompiledFrameRemainder0 = (var11 != 0);
                }
                if ((decompiledFrameRemainder0) && (!nq.field_h.a(false) ||
                  this.h((byte) -34) ||
                  var11 != 0)) {
                  var4 = nq.field_h.a(-125);
                  var4.GA(0);
                  ph.field_b.a(119, var4, false);
                  boolean decompiledSharedTail1 = (~rc.field_k == ~nj.field_b);
                  if (!decompiledSharedTail1) {
                    var5_int = eh.field_a * 255 / 30;
                    if (nj.field_b != -1) {
                      iv.field_g[nj.field_b].a(-var5_int + 255, var4, -2355);
                    }
                    if (-1 != rc.field_k) {
                      iv.field_g[rc.field_k].a(var5_int, var4, -2355);
                    }
                    decompiledSharedTail1 = (var11 != 0);
                  }
                  if ((decompiledSharedTail1) &&
                    (nj.field_b != -1)) {
                    iv.field_g[nj.field_b].a(255, var4, -2355);
                  }
                  if (so.a((byte) -50)) {
                    lk.a(0, 0, lk.field_b, lk.field_c);
                    pn.d((byte) -7);
                  }
                  if (ra.field_e != 0) {
                    var5_int = eh.field_a * 256 / 30;
                    if (var5_int > 0) {
                      lk.b(0, 0, lk.field_b, lk.field_c, 0, var5_int);
                    }
                  }
                  if (sj.a(-38) &&
                    !so.a((byte) 110)) {
                    if (null == gk.field_o) {
                      stackIn_606_0 = ii.field_a;
                    } else {
                      stackIn_606_0 = true;
                    }
                    kn.a(stackIn_606_0, -75);
                  }
                  if (ku.field_j >= 2 &&
                    gw.field_v) {
                    bq.field_c.a(20, 20, 16777215, Integer.toString(aj.field_B), (byte) -93, 1);
                  }
                  var5 = (ge) (pl.field_v.b(66));
                  if (null != var5) {
                    var7 = qn.field_g;
                    if (var7 >= 64) {
                      if (192 >= var7) {
                        var6_int = 255;
                        if (var11 != 0) {
                          var6_int = (192 - var7) * 255 / 64;
                          var6_int = var7 * 255 / 64;
                        }
                      } else {
                        var6_int = (192 - var7) * 255 / 64;
                        if (var11 != 0) {
                          var6_int = var7 * 255 / 64;
                        }
                      }
                    } else {
                      var6_int = var7 * 255 / 64;
                    }
                    var8 = 45;
                    if (var5.field_m >= 0) {
                      var9_ref_String = rb.field_d[var5.field_m];
                      if (!(var5.field_m >= qw.field_a.length)) {
                        var8 += 65;
                        qw.field_a[var5.field_m].a(-32 + (85 + (rj.field_c - 180)), 45, 64, 64, 0, var6_int << 24 | 16777215, 1);
                        if (var11 != 0) {
                          var9_ref_String = aa.field_b;
                        }
                      }
                    } else {
                      var9_ref_String = aa.field_b;
                    }
                    bq.field_c.a(150, var6_int << 24, 0, 170, -180 + rj.field_c, (int[]) null, (hr[]) null, -1 + var8, var6_int << 24, 0, 18, -8787, var9_ref_String, (aa) null, 1, 0);
                    bq.field_c.a(150, var6_int << 24, 0, 170, -180 + rj.field_c, (int[]) null, (hr[]) null, var8 + 1, var6_int << 24, 0, 18, -8787, var9_ref_String, (aa) null, 1, 0);
                    bq.field_c.a(150, 16777215 | var6_int << 24, 0, 170, -180 + rj.field_c, (int[]) null, (hr[]) null, var8, -1, 0, 18, -8787, var9_ref_String, (aa) null, 1, 0);
                  }
                  boolean decompiledSharedTail0 = !(oj.a(false));
                  if (!decompiledSharedTail0) {
                    var6_int = 0 * (gi.field_h - lk.field_b) / 2;
                    var7 = (wq.field_b - lk.field_c) * 0 / 2;
                    cf.a(var6_int, var7, -105);
                    kn.a(false, (byte) -122);
                    this.field_F = true;
                    decompiledSharedTail0 = (var11 != 0);
                  }
                  if (decompiledSharedTail0) {
                    if (sj.a(-67)) {
                      var6_int = 0 * (gi.field_h - lk.field_b) / 2;
                      var7 = (-lk.field_c + wq.field_b) * 0 / 2;
                      ls.a(var6_int, -53, var7);
                      kn.a(false, -101);
                      this.field_F = true;
                      if (var11 != 0 &&
                        !ws.b((byte) 52)) {
                        this.field_F = false;
                      }
                    } else {
                      if (!ws.b((byte) 52)) {
                        this.field_F = false;
                      }
                    }
                  }
                  if (this.field_F) {
                    var6_int = lk.field_b;
                    var7 = lk.field_c;
                    if (this.field_K != null) {
                      var6_int = this.field_K.field_x;
                      var7 = this.field_K.field_u;
                    }
                    var8 = (gi.field_h - var6_int) / 2;
                    var9 = (wq.field_b - var7) / 2;
                    if (oj.a(false) &&
                      null != this.field_K) {
                      var8 = ik.c(-10517);
                      var9 = fd.b(3878);
                    }
                    var10 = wq.a(var4, (byte) 29);
                    var10.a((byte) 61, var9, var9 + var7, var8, var6_int + var8);
                    var9 = (wq.field_b - lk.field_c) / 2;
                    var8 = (-lk.field_b + gi.field_h) / 2;
                    var4.SA(var8, var9, lk.field_b, lk.field_c, lk.field_a, 0, lk.field_b);
                    var10.a(29709);
                  }
                  try {
                    var4.a(true);
                  } catch (java.lang.Exception decompiledCaughtParameter3) {
                    decompiledCaughtException = decompiledCaughtParameter3;
                    var6 = (Exception) (Object) decompiledCaughtException;
                    var6.printStackTrace();
                  }
                }
              }
            }
            pe.a(pi.field_c, dq.field_Z, 20, kf.field_v);
            fv.a(7966, dq.field_Z, kf.field_v);
            pi.field_c = null;
            kf.field_v = null;
            dq.field_Z = null;
            ls.b(0);
            return false;
          } catch (java.lang.RuntimeException decompiledCaughtParameter5) {
            decompiledCaughtException = decompiledCaughtParameter5;
            var3_ref = (RuntimeException) (Object) decompiledCaughtException;
            throw qo.a((Throwable) ((Object) var3_ref), "Sumoblitz.PA(" + param0 + ',' + param1 + ')');
          }
        } catch (RuntimeException | Error decompiledUncheckedException) {
          throw decompiledUncheckedException;
        } catch (Throwable decompiledCheckedException) {
          throw new RuntimeException(decompiledCheckedException);
        }
    }

    final void a(boolean param0) {
        RuntimeException decompiledCaughtException = null;
        RuntimeException var2 = null;
        try {
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
          gd.a(!param0);
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
          ig.a(!param0);
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
          aa.a(!param0);
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
          fu.d(!param0);
          mb.a(!param0);
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
          we.e(!param0);
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
          f.d(!param0);
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
          ej.d(!param0);
          oh.a((byte) -60);
          ua.a((byte) 13);
          ju.a(param0);
          fq.a(123);
          ia.a(1);
          vv.a(-95);
          lu.b(!param0);
          ph.a(1882049616);
          qj.a((byte) -70);
          fw.c(-114);
          bl.a(false);
          of.a(-26437);
          id.c(!param0);
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
          eg.c(!param0);
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
          return;
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
        RuntimeException decompiledCaughtException = null;
        int var3_int = 0;
        RuntimeException var3 = null;
        int var4 = 0;
        int var5 = 0;
        var5 = field_L ? 1 : 0;
        try {
          if (param0 == 0) {
            return;
          }
          if (param2 > -67) {
            return;
          }
          L1: {
            L2: {
              var3_int = 0;
              var4 = param1;
              if (var4 == 1) {
                var3_int = fi.a(5, he.field_o, (byte) -96);
                fe.a(-113, rc.field_l[22 + var3_int]);
                if (var5 == 0) {
                  return;
                }
              } else {
                if ((2 != var4 ||
                  var5 != 0) &&
                  (3 != var4 ||
                  var5 != 0)) {
                  switch (var4) {
                    case 4:
                      break L2;
                    case 6:
                      break L1;
                    case 5:
                      break L1;
                    default:
                      return;
                    case 0:
                      break;
                  }
                }
              }
              var3_int = fi.a(lg.field_d[param0][1].length, he.field_o, (byte) -96);
              fe.a(89, lg.field_d[param0][1][var3_int]);
              if (var5 == 0) {
                return;
              }
            }
            var3_int = fi.a(lg.field_d[param0][2].length, he.field_o, (byte) -96);
            fe.a(-121, lg.field_d[param0][2][var3_int]);
            if (var5 == 0) {
              return;
            }
          }
          var3_int = fi.a(lg.field_d[param0][0].length, he.field_o, (byte) -96);
          fe.a(42, lg.field_d[param0][0][var3_int]);
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3 = decompiledCaughtException;
          throw qo.a((Throwable) ((Object) var3), "Sumoblitz.OA(" + param0 + ',' + param1 + ',' + param2 + ')');
        }
    }

    static {
        field_G = new int[16384];
        field_H = 0;
        field_I = 49;
    }
}
