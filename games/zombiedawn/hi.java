/*
 * Decompiled by CFR-JS 0.4.0.
 */
import java.util.*;

final class hi {
    private boolean field_F;
    private boolean field_A;
    static String field_pb;
    int field_eb;
    private int field_I;
    static String field_Y;
    int field_K;
    private int field_C;
    private int field_ab;
    int field_g;
    private int field_c;
    static vn field_x;
    private vo field_ob;
    private int field_Z;
    static op field_O;
    int field_r;
    private qj field_b;
    int field_f;
    ej field_H;
    int field_nb;
    int field_G;
    private int field_z;
    wk field_S;
    int field_P;
    int field_hb;
    private ub field_gb;
    uh field_Q;
    int field_q;
    private int field_j;
    private vo field_T;
    private int field_N;
    int[] field_u;
    private int field_k;
    private boolean field_p;
    private vn field_t;
    int field_db;
    private int field_jb;
    private vo field_v;
    private boolean field_w;
    vo field_R;
    private int field_U;
    private int[] field_s;
    private int field_B;
    private int field_o;
    int field_h;
    on field_mb;
    private ra field_W;
    vo field_e;
    mj field_n;
    private int field_fb;
    private fn field_L;
    private int field_ib;
    int[] field_J;
    private boolean field_X;
    private boolean field_M;
    private vn field_V;
    private vo field_m;
    private kd field_kb;
    int field_bb;
    private int[] field_D;
    private int field_y;
    vo field_lb;
    private vo field_d;
    int field_l;
    private vo field_i;
    private int field_cb;
    private ah field_a;
    private int field_E;

    private final void g(byte param0) {
        int fieldTemp$0 = 0;
        int stackIn_41_0 = 0;
        int stackIn_45_0 = 0;
        int stackIn_62_0 = 0;
        int stackIn_137_1 = 0;
        RuntimeException decompiledCaughtException = null;
        int var2_int = 0;
        RuntimeException var2 = null;
        int var3 = 0;
        wg var4_ref_wg = null;
        int var4 = 0;
        int var5 = 0;
        int var6_int = 0;
        ap var6 = null;
        int var7 = 0;
        int var8 = 0;
        int var3Lifetime1;
        var8 = ZombieDawn.field_J;
        try {
          var2_int = 58 / ((60 - param0) / 46);
          if (this.field_ib != -1) {
            if (this.field_ib != 0) {
              if (1 != this.field_ib &&
                this.field_ib != 2) {
                return;
              }
              this.field_p = false;
              fieldTemp$0 = this.field_cb;
              this.field_cb = this.field_cb - 1;
              if (fieldTemp$0 > 0) {
                return;
              }
              if (this.field_ib == 1) {
                var3 = this.f(86);
                if (var3 == to.field_b[this.field_bb]) {
                  to.field_b[this.field_bb] = var3 + 1;
                  if (!(lo.field_j < 2) ||
                    !this.field_F) {
                    var4_ref_wg = new wg(this.field_bb, -1 + to.field_b[this.field_bb], this.field_c, this.field_C, this.field_eb, this.field_Z);
                    if (po.w(13296)) {
                      dn.field_D.a(0, var4_ref_wg);
                      if (var8 != 0) {
                        dd.a(5, var4_ref_wg, -40);
                      }
                    } else {
                      dd.a(5, var4_ref_wg, -40);
                    }
                  }
                }
              }
              ca.a(false, true, 10);
              if (var8 == 0) {
                return;
              }
            }
            stackIn_41_0 = (this.field_h != -1) ? 0 : 1;
            var3Lifetime1 = stackIn_41_0;
            stackIn_45_0 = (0 < be.field_j) ? 0 : 1;
            var4 = stackIn_45_0;
            var6_int = 0;
            while (true) {
              if (3 > var6_int) {
                stackIn_62_0 = -1;
                if (var8 == 0) {
                  if (stackIn_62_0 > ~this.field_u[var6_int] &&
                    this.field_J[var6_int] == 0 &&
                    !this.field_gb.b(true)) {
                    ck.a(-8, 6836);
                  }
                  var6_int++;
                  continue;
                }
              } else {
                stackIn_62_0 = 0;
              }
              break;
            }
            var5 = stackIn_62_0;
            if (vj.field_q >= 500) {
              var5 = 1;
            }
            boolean decompiledFrameRemainder0 = true;
            if ((var3Lifetime1 == 0) &&
              (decompiledFrameRemainder0 = (this.field_gb.g(16954) ||
              this.field_gb.b(true)))) {
              var5 = 1;
            }
            if ((decompiledFrameRemainder0) &&
              (var3Lifetime1 != 0 ||
              var8 != 0)) {
              if ((this.field_q == 0 ||
                2 == this.field_q) &&
                (this.field_gb.b(true) ||
                this.field_gb.k(16284))) {
                var5 = 1;
              }
              if (this.field_q == 1 &&
                this.field_gb.field_k == 0) {
                var5 = 1;
              }
              if (bo.field_i &&
                wo.field_wb) {
                var5 = 1;
              }
              if ((4 == this.field_q ||
                this.field_q == 5) &&
                this.field_gb.k(16284)) {
                var5 = 1;
              }
              if (6 == this.field_q && (this.field_gb.k(16284) ||
                this.field_gb.field_k == 0)) {
                var5 = 1;
              }
            }
            if (var5 != 0) {
              var6 = (ap) (jj.c(10, 94));
              var7 = this.field_gb.field_k;
              if (var3Lifetime1 != 0) {
                if (1 != this.field_q &&
                  this.field_q != 6) {
                  if (this.field_q == 5) {
                    var7 = this.field_nb;
                    if (var8 != 0) {
                      var7 = this.field_gb.field_b;
                    }
                  }
                } else {
                  var7 = this.field_gb.field_b;
                }
              }
              this.c(true);
              var6.a(this.field_G, this.field_q, this.field_gb.a((byte) 117), (byte) -101, var7, this.field_gb.b(true), var3Lifetime1 != 0, var4 != 0);
              if (!bo.field_i) {
                tp.a(100, false, w.field_a[5]);
              }
              this.field_cb = 60;
              if (var3Lifetime1 == 0 &&
                !this.field_gb.b(true)) {
                stackIn_137_1 = 2;
              } else {
                stackIn_137_1 = 1;
              }
              this.field_ib = stackIn_137_1;
              if (this.field_ib == 1) {
                if (this.field_P == 250 &&
                  this.field_q == 0 &&
                  this.field_h == -1) {
                  this.a(252, 3, (byte) -23);
                }
                if (this.field_gb.field_k >= 400 &&
                  this.field_q == 4 &&
                  this.field_h == -1) {
                  this.a(239, 16, (byte) -23);
                }
                if (~this.field_f == ~this.field_P &&
                  this.field_q == 2 &&
                  -1 == this.field_h) {
                  this.a(250, 5, (byte) -23);
                }
                if (this.field_q == 0 &&
                  5 == this.field_h) {
                  this.a(247, 8, (byte) -23);
                }
                if (1 == this.field_q &&
                  this.field_h == 5 &&
                  this.field_y <= 7 &&
                  vi.field_a) {
                  this.a(246, 9, (byte) -23);
                }
                if (this.field_q == 2 &&
                  this.field_h == 5 &&
                  this.field_y <= 14 &&
                  vi.field_a) {
                  this.a(245, 10, (byte) -23);
                }
                if (this.field_q == 3 &&
                  5 == this.field_h &&
                  this.field_y <= 21 &&
                  vi.field_a) {
                  this.a(244, 11, (byte) -23);
                }
                if (this.field_q == 4 &&
                  5 == this.field_h &&
                  this.field_y <= 28 &&
                  vi.field_a) {
                  this.a(230, 25, (byte) -23);
                }
                if (this.field_q == 5 &&
                  this.field_h == 5 &&
                  this.field_y <= 35 &&
                  vi.field_a) {
                  this.a(229, 26, (byte) -23);
                }
                if (this.field_q == 6 &&
                  this.field_h == 5 &&
                  this.field_y <= 42 &&
                  vi.field_a) {
                  this.a(228, 27, (byte) -23);
                }
                if (7 == this.field_q &&
                  this.field_h == 5 &&
                  this.field_y <= 49 &&
                  vi.field_a) {
                  this.a(227, 28, (byte) -23);
                }
              }
            }
            if (var8 == 0) {
              return;
            }
          }
          if (!this.field_S.field_d) {
            this.field_ib = 0;
            ck.a(-1, 6836);
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2 = decompiledCaughtException;
          throw sh.a((Throwable) ((Object) var2), "hi.C(" + param0 + ')');
        }
    }

    private final void a(boolean param0, kd param1) {
        Object stackIn_49_0 = null;
        StringBuilder stackIn_49_1 = null;
        String stackIn_50_2 = null;
        RuntimeException decompiledCaughtException = null;
        Object var3 = null;
        qh var4_ref_qh = null;
        int var4 = 0;
        int var5 = 0;
        var5 = ZombieDawn.field_J;
        try {
          if (param0) {
            return;
          }
          if (this.field_q == 6) {
            if (this.field_h == 3) {
              boolean decompiledSharedTail0 = (2 != param1.field_fb);
              if (!decompiledSharedTail0) {
                var3 = this.a(80, (byte) 121, 180, 104, 694);
                ((kd) (var3)).field_gb = 30;
                ((kd) (var3)).field_fb = param1.field_fb;
                decompiledSharedTail0 = (var5 != 0);
              }
              if (decompiledSharedTail0) {
                var3 = this.a(80, (byte) 124, 110, 1610, 150);
                ((kd) (var3)).field_gb = 30;
                ((kd) (var3)).field_fb = param1.field_fb;
              }
              this.field_gb.d((byte) -106);
              if (var5 == 0) {
                return;
              }
            }
            if (this.field_h != 4) {
              if (this.field_h != 5) {
                return;
              }
              var3 = this.a(30, (byte) 126, 20, 1440, 400);
              var4_ref_qh = new qh();
              var4_ref_qh.a(0, new kk(((kd) (var3)).a(true) - 400, ((kd) (var3)).f(237239984)));
              ((kd) (var3)).a(var4_ref_qh, true);
              ((kd) (var3)).field_fb = 2;
              this.field_gb.d((byte) -106);
              if (var5 == 0) {
                return;
              }
            }
            var3 = null;
            var4 = param1.field_fb;
            if (var4 == 1 &&
              var5 == 0) {
              var3 = this.a(200, (byte) 126, 70, 350, 150);
            } else if (var4 == 2 &&
              var5 == 0) {
              var3 = this.a(20, (byte) 120, 100, 650, 370);
            } else {
              if (var4 == 3) {
                var3 = this.a(20, (byte) 123, 100, 720, 60);
              }
            }
            if (var3 != null) {
              ((kd) (var3)).field_fb = param1.field_fb;
              ((kd) (var3)).field_gb = 30;
            }
            this.field_gb.d((byte) -106);
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3 = decompiledCaughtException;
          stackIn_49_0 = var3;
          stackIn_49_1 = new StringBuilder().append("hi.CB(").append(param0).append(',');
          if (param1 == null) {
            stackIn_50_2 = "null";
          } else {
            stackIn_50_2 = "{...}";
          }
          throw sh.a((Throwable) (stackIn_49_0), ((StringBuilder) (Object) stackIn_49_1).append(stackIn_50_2).append(')').toString());
        }
    }

    final void a(int param0, int param1, byte param2) {
        RuntimeException runtimeException = null;
        int[] var4 = null;
        int var5 = 0;
        RuntimeException decompiledCaughtException = null;
        int[] var4Lifetime1;
        int var5Lifetime1;
        try {
          if (vi.a(param1, dj.field_i, -88)) {
            return;
          }
          var4 = dj.field_i;
          var5 = param1;
          var4[var5 >> 5] = hi.a(var4[var5 >> 5], 1 << eg.a(31, var5));
          var4Lifetime1 = kg.field_g;
          var5Lifetime1 = param1;
          if (param2 != -23) {
            this.field_q = -95;
          }
          var4Lifetime1[var5Lifetime1 >> 5] = hi.a(var4Lifetime1[var5Lifetime1 >> 5], 1 << eg.a(31, var5Lifetime1));
          this.field_ob.a(0, new da(param1));
          if (!this.field_F) {
            kk.field_j.a(0, new bo(param1, param0, this.field_c, this.field_C, this.field_eb, this.field_Z));
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          runtimeException = decompiledCaughtException;
          throw sh.a((Throwable) ((Object) runtimeException), "hi.I(" + param0 + ',' + param1 + ',' + param2 + ')');
        }
    }

    final void a(boolean param0) {
        RuntimeException runtimeException = null;
        fb var2 = null;
        si var3 = null;
        jo var3_ref = null;
        kd var3_ref2 = null;
        int var4 = 0;
        vo stackIn_27_0 = null;
        boolean stackIn_28_1 = false;
        RuntimeException decompiledCaughtException = null;
        var4 = ZombieDawn.field_J;
        try {
          var2 = (fb) (this.field_R.b((byte) 26));
          if (!param0) {
            return;
          }
          while (null != var2) {
            if (var4 != 0) {
              return;
            }
            if (!(var2 instanceof kd)) {
              if (var2 instanceof si) {
                var3 = (si) (var2);
                var3.g(107);
              } else if (var2 instanceof jo) {
                var3_ref = (jo) (var2);
                var3_ref.l((byte) 52);
              }
            } else {
              var3_ref2 = (kd) (var2);
              if (var3_ref2.field_fb > 0) {
                var3_ref2.field_gb = so.c(var3_ref2.field_sb);
              }
              var3_ref2.j((byte) 82);
              if (!var3_ref2.n((byte) 25)) {
                var3_ref2.B(-124);
              }
            }
            stackIn_27_0 = this.field_R;
            stackIn_28_1 = !(param0);
            var2 = (fb) (((vo) (Object) stackIn_27_0).a(stackIn_28_1));
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          runtimeException = decompiledCaughtException;
          throw sh.a((Throwable) ((Object) runtimeException), "hi.BB(" + param0 + ')');
        }
    }

    final boolean b(int param0) {
        RuntimeException var2 = null;
        boolean stackIn_7_0 = false;
        RuntimeException decompiledCaughtException = null;
        try {
          if (param0 != -25983) {
            this.field_d = (vo) null;
          }
          stackIn_7_0 = !(eh.field_y <= 0);
          return stackIn_7_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2 = decompiledCaughtException;
          throw sh.a((Throwable) ((Object) var2), "hi.B(" + param0 + ')');
        }
    }

    final void a(int param0, boolean param1) {
        int fieldTemp$0 = 0;
        int fieldTemp$1 = 0;
        int stackIn_29_0 = 0;
        wk stackIn_39_0 = null;
        boolean stackIn_42_1 = false;
        boolean stackIn_49_2 = false;
        boolean stackIn_59_3 = false;
        int stackIn_63_4;
        boolean stackIn_66_5;
        boolean stackIn_79_0 = false;
        int stackIn_92_0 = 0;
        boolean stackIn_123_0 = false;
        int stackIn_136_0 = 0;
        int stackIn_137_0 = 0;
        RuntimeException decompiledCaughtException = null;
        boolean stackOut_78_0;
        boolean stackOut_122_0;
        int var3_int = 0;
        RuntimeException var3 = null;
        int var4 = 0;
        int var5 = 0;
        int var6 = 0;
        int var7 = 0;
        var7 = ZombieDawn.field_J;
        try {
          if (!this.field_X) {
            this.e(false);
            return;
          }
          this.field_Z = this.field_Z + 1;
          this.field_eb = this.field_eb + this.field_c;
          if (this.field_r > 0) {
            fieldTemp$0 = this.field_r - 1;
            this.field_r = this.field_r - 1;
            if (fieldTemp$0 <= 0) {
              pc.a((byte) 13, this.field_L);
            }
            if (this.field_r % 32 == 0) {
              this.field_H.a(true, 33);
            }
          }
          this.d((byte) -127);
          this.e((byte) -115);
          mm.d((byte) 93);
          this.field_b.b(param0);
          if (this.field_p) {
            this.field_Q.a(-1, -1, true);
            if (var7 != 0) {
              this.field_Q.a(ei.field_K, ha.field_b, true);
            }
          } else {
            this.field_Q.a(ei.field_K, ha.field_b, true);
          }
          if (!ei.h(param0 ^ 123) &&
            param1) {
            stackIn_29_0 = 0;
          } else {
            stackIn_29_0 = 1;
          }
          var3_int = stackIn_29_0;
          var4 = this.field_S.field_u;
          var5 = this.field_S.field_c;
          if (!param1) {
            this.field_S.a(false, false, false, (byte) -87, false, false);
          }
          if (param1 ||
            var7 != 0) {
            stackIn_39_0 = this.field_S;
            stackIn_42_1 = (bo.field_p[99]) || (bo.field_p[ge.field_e]);
            stackIn_49_2 = (bo.field_p[98]) || (bo.field_p[vf.field_d]);
            boolean decompiledFrameRemainder1 = true;
            if (!bo.field_p[96] && (!bo.field_p[ic.field_P] ||
              bo.field_p[82])) {
              stackIn_59_3 = false;
              decompiledFrameRemainder1 = false;
            }
            else {
              stackIn_59_3 = true;
            }
            stackIn_63_4 = -48;
            stackIn_66_5 = (bo.field_p[97]) || (bo.field_p[me.field_Gb]);
            ((wk) (Object) stackIn_39_0).a(stackIn_42_1, stackIn_49_2, stackIn_59_3, (byte) stackIn_63_4, stackIn_66_5, bo.field_p[81]);
          }
          if (bo.field_i &&
            this.field_ib != -1 &&
            var3_int == 0) {
            this.field_S.field_u = var4;
            this.field_S.field_c = var5;
            var6 = 0;
            do {
              boolean decompiledFrameRemainder3 = true;
              if (this.field_A) {
                stackOut_78_0 = param1;
                stackIn_92_0 = stackOut_78_0 ? 1 : 0;
                stackIn_79_0 = stackOut_78_0;
                decompiledFrameRemainder3 = (var7 == 0);
                if ((decompiledFrameRemainder3) && (stackIn_79_0 &&
                  bo.field_p[80])) {
                  if (bo.field_p[81]) {
                    stackIn_92_0 = 16;
                  } else {
                    stackIn_92_0 = 8;
                  }
                  decompiledFrameRemainder3 = false;
                }
              }
              if (decompiledFrameRemainder3) {
                stackIn_92_0 = 1;
              }
              if (stackIn_92_0 <= var6) {
                break;
              }
              vl.a(this.field_S, this.field_gb, -91);
              var6++;
            } while (var7 == 0);
          }
          if (this.field_p &&
            1 == kc.field_R) {
            this.field_B = this.field_B - (-var4 + this.field_S.field_u);
            this.field_j = this.field_j - (this.field_S.field_c - var5);
            if (this.field_B == -1) {
              this.field_B = this.field_B - 1;
            }
          }
          if (null != this.field_ob.b((byte) 26)) {
            fieldTemp$1 = this.field_z + 1;
            this.field_z = this.field_z + 1;
            if (fieldTemp$1 >= 335) {
              this.field_z = 0;
              this.field_ob.f(62);
            }
          }
          if (this.field_h == -1 &&
            this.field_q == 1) {
            this.g(115);
          }
          this.field_H.field_A.a(0, false);
          co.a(0);
          if (var3_int == 0) {
            var6 = 0;
            do {
              boolean decompiledFrameRemainder0 = true;
              boolean decompiledFrameRemainder2 = true;
              if (this.field_A) {
                stackOut_122_0 = param1;
                stackIn_137_0 = stackOut_122_0 ? 1 : 0;
                stackIn_123_0 = stackOut_122_0;
                decompiledFrameRemainder0 = (var7 == 0);
                if ((decompiledFrameRemainder0) && (stackIn_123_0 &&
                  bo.field_p[80])) {
                  if (bo.field_p[81]) {
                    stackIn_136_0 = 16;
                  } else {
                    stackIn_136_0 = 8;
                  }
                  decompiledFrameRemainder2 = false;
                }
              }
              if ((decompiledFrameRemainder2) &&
                (decompiledFrameRemainder0)) {
                stackIn_136_0 = 1;
              }
              if (decompiledFrameRemainder0) {
                stackIn_137_0 = ~stackIn_136_0;
              }
              if (stackIn_137_0 >= ~var6) {
                break;
              }
              this.b((byte) 93);
              var6++;
            } while (var7 == 0);
          }
          if (0 < this.field_N && (0 == this.field_ib ||
            this.field_ib == -1 &&
            (double)this.field_S.field_e > 0.95)) {
            this.field_N = this.field_N - 15;
          }
          this.g((byte) 125);
          so.b(this.field_R);
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3 = decompiledCaughtException;
          throw sh.a((Throwable) ((Object) var3), "hi.GA(" + param0 + ',' + param1 + ')');
        }
    }

    private final void a(on param0, byte param1) {
        RuntimeException runtimeException = null;
        RuntimeException stackIn_7_0 = null;
        StringBuilder stackIn_7_1 = null;
        String stackIn_8_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          this.field_X = false;
          if (param1 != -99) {
            return;
          }
          this.field_mb = param0;
          this.e(false);
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          runtimeException = decompiledCaughtException;
          stackIn_7_0 = runtimeException;
          stackIn_7_1 = new StringBuilder().append("hi.D(");
          if (param0 == null) {
            stackIn_8_2 = "null";
          } else {
            stackIn_8_2 = "{...}";
          }
          throw sh.a((Throwable) ((Object) stackIn_7_0), ((StringBuilder) (Object) stackIn_7_1).append(stackIn_8_2).append(',').append(param1).append(')').toString());
        }
    }

    final void a(int param0, int param1, boolean param2, int param3) {
        RuntimeException runtimeException = null;
        int var5_int = 0;
        int var6 = 0;
        int var7 = 0;
        fb var8 = null;
        int var9 = 0;
        int var10 = 0;
        int var11 = 0;
        RuntimeException decompiledCaughtException = null;
        var11 = ZombieDawn.field_J;
        try {
          kh.a(78, false);
          if (!param2) {
            return;
          }
          var5_int = param1 >> 7;
          var6 = param0 >> 7;
          var7 = param3 * param3;
          var8 = (fb) (this.field_n.a((param3 >> 7) + 1, var6, 29845, var5_int));
          while (var8 != null) {
            if (var11 != 0) {
              return;
            }
            if (var8 instanceof g) {
              var9 = -param1 + var8.a(true);
              var10 = var8.f(237239984) - param0;
              if (var7 > (var9 * var9 + var10 * var10)) {
                ((g) (var8)).b((byte) 126, 1000);
              }
            }
            var8 = (fb) (this.field_n.b(false));
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          runtimeException = decompiledCaughtException;
          throw sh.a((Throwable) ((Object) runtimeException), "hi.K(" + param0 + ',' + param1 + ',' + param2 + ',' + param3 + ')');
        }
    }

    private final void a(int param0, int param1, int param2, int param3, int param4) {
        le var6 = null;
        kd var7 = null;
        int var8 = 0;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var6_ref = null;
        var8 = ZombieDawn.field_J;
        try {
          if (bo.field_i) {
            return;
          }
          if (param3 < 31) {
            this.f((byte) 105);
          }
          var6 = this.field_R.b((byte) 26);
          while (var6 instanceof fb) {
            if (var8 != 0) {
              return;
            }
            if (var6 instanceof kd) {
              var7 = (kd) (var6);
              if (var7.i((byte) -126)) {
                var7.field_qb = false;
                if (var7.a(param1, param4, param2, param0, false)) {
                  this.field_W.a(var7, (byte) -123);
                  var7.r(-31340);
                }
              }
            }
            var6 = var6.field_b;
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var6_ref = decompiledCaughtException;
          throw sh.a((Throwable) ((Object) var6_ref), "hi.L(" + param0 + ',' + param1 + ',' + param2 + ',' + param3 + ',' + param4 + ')');
        }
    }

    final kd a(int param0, byte param1, int param2, int param3, int param4) {
        kd var6 = null;
        RuntimeException var6_ref = null;
        kd stackIn_2_0 = null;
        kd stackIn_6_0;
        kd stackIn_6_1;
        int stackIn_6_2;
        int stackIn_6_3;
        kd stackIn_7_0;
        kd stackIn_7_1;
        boolean stackIn_7_4;
        kd stackIn_8_0 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          if (param1 <= 119) {
            stackIn_2_0 = (kd) null;
            return stackIn_2_0;
          }
          stackIn_6_0 = null;
          stackIn_6_1 = null;
          stackIn_6_2 = param3 + pb.a(so.field_a, param2, 1);
          stackIn_6_3 = param4 + pb.a(so.field_a, param0, 1);
          if (pb.a(so.field_a, 2, 1) != 1) {
            stackIn_7_0 = null;
            stackIn_7_1 = null;
            stackIn_7_4 = false;
          } else {
            stackIn_7_0 = null;
            stackIn_7_1 = null;
            stackIn_7_4 = true;
          }
          var6 = new kd(stackIn_6_2, stackIn_6_3, stackIn_7_4, 0);
          var6.field_gb = 500;
          this.field_R.a(0, var6);
          this.field_gb.d((byte) -106);
          stackIn_8_0 = var6;
          return stackIn_8_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var6_ref = decompiledCaughtException;
          throw sh.a((Throwable) ((Object) var6_ref), "hi.RA(" + param0 + ',' + param1 + ',' + param2 + ',' + param3 + ',' + param4 + ')');
        }
    }

    final void c(int param0, int param1, int param2) {
        try {
          this.field_lb.a(0, new mm(param0, param2));
          if (param1 != 54) {
            field_O = (op) null;
          }
        } catch (RuntimeException runtimeException) {
          throw sh.a((Throwable) ((Object) runtimeException), "hi.P(" + param0 + ',' + param1 + ',' + param2 + ')');
        }
    }

    final static void a(java.applet.Applet param0, int param1) {
        try {
          java.net.URL var2 = null;
          RuntimeException stackIn_10_0 = null;
          StringBuilder stackIn_10_1 = null;
          String stackIn_11_2 = null;
          Throwable decompiledCaughtException = null;
          Exception var2_ref = null;
          RuntimeException var2_ref2 = null;
          try {
            try {
              var2 = new java.net.URL(param0.getCodeBase(), "subscribe.ws");
              if (param1 < 117) {
                hi.f(true);
              }
              param0.getAppletContext().showDocument(rc.a(-1, param0, var2), "_top");
            } catch (java.lang.Exception decompiledCaughtParameter0) {
              decompiledCaughtException = decompiledCaughtParameter0;
              var2_ref = (Exception) (Object) decompiledCaughtException;
              var2_ref.printStackTrace();
            }
            return;
          } catch (java.lang.RuntimeException decompiledCaughtParameter1) {
            decompiledCaughtException = decompiledCaughtParameter1;
            var2_ref2 = (RuntimeException) (Object) decompiledCaughtException;
            stackIn_10_0 = var2_ref2;
            stackIn_10_1 = new StringBuilder().append("hi.F(");
            if (param0 == null) {
              stackIn_11_2 = "null";
            } else {
              stackIn_11_2 = "{...}";
            }
            throw sh.a((Throwable) ((Object) stackIn_10_0), ((StringBuilder) (Object) stackIn_10_1).append(stackIn_11_2).append(',').append(param1).append(')').toString());
          }
        } catch (RuntimeException | Error decompiledUncheckedException) {
          throw decompiledUncheckedException;
        } catch (Throwable decompiledCheckedException) {
          throw new RuntimeException(decompiledCheckedException);
        }
    }

    private final void d(int param0) {
        int stackIn_14_0 = 0;
        int stackIn_27_0 = 0;
        RuntimeException decompiledCaughtException = null;
        int var2_int = 0;
        RuntimeException var2 = null;
        int var3 = 0;
        int var4 = 0;
        int var5 = 0;
        int var6 = 0;
        int var4Lifetime1;
        var6 = ZombieDawn.field_J;
        try {
          var2_int = 1 * fb.a(1311979239, (int)(tp.field_p << 1)) + 2 * rd.a(true, (int)(tp.field_p >> 1)) >> 16;
          var3 = (-this.field_S.field_u + (-1 + (int)tp.field_p * bd.field_e)) % 1337;
          var4 = var3 / bd.field_e;
          boolean decompiledNaturalLoopExit0 = false;
          while (!(decompiledNaturalLoopExit0 = (!(nh.field_P > var4)))) {
            stackIn_14_0 = (5 * var4 + var3 * 3) % 9;
            if (var6 == 0) {
              if (stackIn_14_0 == 0) {
                bi.e(var3, var4, var2_int + var3 - 3, -7 + var4, 6715272);
              }
              var3 += 939;
              if (var3 <= bd.field_e) {
                continue;
              }
              var4 = var4 + var3 / bd.field_e;
              var3 = var3 % bd.field_e;
              continue;
            }
            break;
          }
          if (decompiledNaturalLoopExit0) {
            var3 = ((int)tp.field_p * bd.field_e - 1 - this.field_S.field_u) % 917;
            stackIn_14_0 = var3 / bd.field_e;
          }
          var4Lifetime1 = stackIn_14_0;
          while (true) {
            if (!(nh.field_P > var4Lifetime1)) {
              var4Lifetime1 = -54 / ((-32 - param0) / 46);
              var3 = (-this.field_S.field_u - 1 + (int)tp.field_p * bd.field_e) % 593;
              stackIn_27_0 = var3 / bd.field_e;
              break;
            }
            stackIn_27_0 = (2 * var3 + 4 * var4Lifetime1) % 7;
            if (var6 == 0) {
              if (stackIn_27_0 == 0) {
                bi.e(var3, var4Lifetime1, var2_int + (var3 - 3), var4Lifetime1 - 5, 3364192);
              }
              var3 += 547;
              if (bd.field_e >= var3) {
                continue;
              }
              var4Lifetime1 = var4Lifetime1 + var3 / bd.field_e;
              var3 = var3 % bd.field_e;
              continue;
            }
            break;
          }
          var5 = stackIn_27_0;
          while (nh.field_P > var5) {
            if (var6 != 0) {
              return;
            }
            if ((4 * var5 + var3 * 2) % 7 == 0) {
              bi.e(var3, var5, var3 - 4 + var2_int, -7 + var5, 5461344);
            }
            var3 += 375;
            if (var3 <= bd.field_e) {
              continue;
            }
            var5 = var5 + var3 / bd.field_e;
            var3 = var3 % bd.field_e;
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2 = decompiledCaughtException;
          throw sh.a((Throwable) ((Object) var2), "hi.W(" + param0 + ')');
        }
    }

    final int f(int param0) {
        int var2_int = 0;
        RuntimeException var2 = null;
        int stackIn_3_0 = 0;
        int stackIn_4_1 = 0;
        int stackIn_5_0 = 0;
        RuntimeException decompiledCaughtException = null;
        try {
          var2_int = 37 / ((param0 - 28) / 37);
          stackIn_3_0 = 7 * (this.field_q % 4);
          if (this.field_h != -1) {
            stackIn_4_1 = this.field_h;
          } else {
            stackIn_4_1 = 6;
          }
          stackIn_5_0 = stackIn_3_0 + stackIn_4_1;
          return stackIn_5_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2 = decompiledCaughtException;
          throw sh.a((Throwable) ((Object) var2), "hi.Q(" + param0 + ')');
        }
    }

    private final void b(int param0, int param1) {
        int stackIn_42_0;
        int stackIn_42_1;
        int stackIn_42_2;
        int stackIn_42_3;
        int stackIn_43_4 = 0;
        int stackIn_46_0;
        int stackIn_46_1;
        int stackIn_46_2;
        int stackIn_46_3;
        int stackIn_47_4 = 0;
        int stackIn_50_0;
        int stackIn_50_1;
        int stackIn_50_2;
        int stackIn_50_3;
        int stackIn_51_4 = 0;
        int stackIn_54_0;
        int stackIn_54_1;
        int stackIn_54_2;
        int stackIn_54_3;
        int stackIn_55_4 = 0;
        int stackIn_58_0;
        int stackIn_58_1;
        int stackIn_58_2;
        int stackIn_58_3;
        int stackIn_59_4 = 0;
        int stackIn_62_0;
        int stackIn_62_1;
        int stackIn_62_2;
        int stackIn_62_3;
        int stackIn_63_4 = 0;
        int stackIn_66_0;
        int stackIn_66_1;
        int stackIn_66_2;
        int stackIn_66_3;
        int stackIn_67_4 = 0;
        int stackIn_70_0;
        int stackIn_70_1;
        int stackIn_70_2;
        int stackIn_70_3;
        int stackIn_71_4 = 0;
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
        int var11 = 0;
        int var12 = 0;
        int var4Lifetime1;
        int var5Lifetime1;
        int var10Lifetime1;
        int var10Lifetime2;
        int var10Lifetime3;
        int var10Lifetime4;
        int var10Lifetime5;
        int var10Lifetime6;
        int var10Lifetime7;
        var12 = ZombieDawn.field_J;
        try {
          boolean decompiledFrameRemainder0 = true;
          a.a((byte) 40);
          po.f(-1, param1);
          if (param1 != 0) {
            if (param1 != 1) {
              if (param1 != 2) {
                if ((param1 != 3) &&
                  (decompiledFrameRemainder0 = (param1 != 4))) {
                  if (param1 == 5) {
                    ul.b(397, (byte) -118);
                    ul.b(414, (byte) -116);
                    ul.b(415, (byte) -84);
                    ul.b(413, (byte) -83);
                    ul.b(430, (byte) -127);
                    ul.b(431, (byte) -105);
                    ul.b(429, (byte) -68);
                    tm.a(413, (byte) -77, true, 429);
                    tm.a(397, (byte) -77, true, 430);
                    tm.a(414, (byte) -77, true, 430);
                    tm.a(415, (byte) -77, true, 431);
                    ul.b(69, (byte) -79);
                    ul.b(68, (byte) -109);
                    tm.a(68, (byte) -77, false, 343);
                    tm.a(69, (byte) -77, false, 343);
                    var3_int = 16;
                    var4 = 2;
                    var5 = 1;
                    var6 = 22;
                    var7 = pj.a(131072, -80) >> 2;
                    var8 = 16384;
                    var8 = var8 << 1;
                    var9 = 18432;
                    var7 = var7 << 1;
                    var5Lifetime1 = 8 + var3_int;
                    var9 = var9 << 1;
                    var4Lifetime1 = 1;
                    hk.a(var5Lifetime1 + 2, (byte) -23, var6, 0, var4Lifetime1 + (var5Lifetime1 + 2), -var7, var3_int - 0);
                    hk.a(4 + var5Lifetime1, (byte) -23, var6, var8, var4Lifetime1 + (4 + var5Lifetime1), -var8, var3_int + 1);
                    hk.a(0 + var5Lifetime1, (byte) -23, var6, var7, var4Lifetime1 + var5Lifetime1 + 0, 0, var3_int + 2);
                    hk.a(6 + var5Lifetime1, (byte) -23, var6, var8, var5Lifetime1 + (6 + var4Lifetime1), var8, 3 + var3_int);
                    hk.a(var4Lifetime1 + (2 + var5Lifetime1), (byte) -23, var6, 0, var5Lifetime1 + 2, var7, 4 + var3_int);
                    hk.a(var4Lifetime1 + var5Lifetime1 + 4, (byte) -23, var6, -var8, var5Lifetime1 + 4, var8, 5 + var3_int);
                    hk.a(0 + var5Lifetime1 + var4Lifetime1, (byte) -23, var6, -var7, var5Lifetime1 - 0, 0, var3_int + 6);
                    hk.a(var4Lifetime1 + (var5Lifetime1 + 6), (byte) -23, var6, -var8, var5Lifetime1 + 6, -var8, 7 + var3_int);
                    var3_int += 32;
                    var10 = 0;
                    hk.a(-16 + var10 + var3_int, (byte) -23, var6, var9, var10 + (var3_int - 16) + 1, -var8, var10 + var3_int);
                    var10Lifetime1 = 1;
                    hk.a(-17 + var3_int + var10Lifetime1, (byte) -23, var6, -var8, var10Lifetime1 + var3_int - 16, var9, var10Lifetime1 + var3_int);
                    var10Lifetime2 = 2;
                    hk.a(-16 + (var10Lifetime2 + var3_int), (byte) -23, var6, var8, 1 + var3_int + (var10Lifetime2 - 16), -var9, var3_int + var10Lifetime2);
                    var10Lifetime3 = 3;
                    hk.a(var3_int - (-var10Lifetime3 + 17), (byte) -23, var6, -var9, -16 + (var3_int + var10Lifetime3), var8, var3_int + var10Lifetime3);
                    var10Lifetime4 = 4;
                    hk.a(-16 + var10Lifetime4 + var3_int, (byte) -23, var6, var8, 1 + var3_int - (-var10Lifetime4 + 16), var9, var3_int + var10Lifetime4);
                    var10Lifetime5 = 5;
                    hk.a(var3_int + var10Lifetime5 - 17, (byte) -23, var6, -var9, -16 + (var3_int + var10Lifetime5), -var8, var3_int + var10Lifetime5);
                    var10Lifetime6 = 6;
                    hk.a(var3_int + var10Lifetime6 - 16, (byte) -23, var6, var9, 1 + (-16 + var10Lifetime6 + var3_int), var8, var3_int + var10Lifetime6);
                    var10Lifetime7 = 7;
                    hk.a(-17 + var3_int + var10Lifetime7, (byte) -23, var6, -var8, var3_int + (var10Lifetime7 - 16), -var9, var10Lifetime7 + var3_int);
                    var11 = 150;
                    while (true) {
                      if (var11 < 180) {
                        np.a((byte) 9, var11);
                        var11++;
                        if (var12 == 0) {
                          continue;
                        }
                      } else {
                        np.a((byte) 9, 155);
                        np.a((byte) 9, 156);
                        np.a((byte) 9, 157);
                        np.a((byte) 9, 169);
                        np.a((byte) 9, 170);
                      }
                      break;
                    }
                    decompiledFrameRemainder0 = (var12 != 0);
                  }
                  if (decompiledFrameRemainder0) {
                    if (param1 != 6) {
                      if ((param1 != 7) &&
                        (decompiledFrameRemainder0 = (param1 == 8))) {
                        tm.a(184, (byte) -77, false, 200);
                        ul.b(184, (byte) -113);
                        ul.b(185, (byte) -111);
                        ul.b(186, (byte) -103);
                        ul.b(187, (byte) -115);
                        ul.b(200, (byte) -126);
                        tm.a(323, (byte) -77, false, 416);
                        tm.a(324, (byte) -77, false, 406);
                        tm.a(325, (byte) -77, false, 417);
                        ul.b(323, (byte) -118);
                        ul.b(324, (byte) -104);
                        ul.b(325, (byte) -113);
                        ul.b(416, (byte) -123);
                        ul.b(417, (byte) -85);
                        tm.a(260, (byte) -77, false, 407);
                        ul.b(260, (byte) -105);
                        ul.b(407, (byte) -72);
                        decompiledFrameRemainder0 = (var12 != 0);
                      }
                      if (decompiledFrameRemainder0) {
                        stackIn_42_0 = 499;
                        stackIn_42_1 = 481;
                        stackIn_42_2 = 1;
                        stackIn_42_3 = -101;
                        if (this.field_h != -1) {
                          stackIn_43_4 = 0;
                        } else {
                          stackIn_43_4 = -1;
                        }
                        qk.a(stackIn_42_0, stackIn_42_1, stackIn_42_2, stackIn_42_3, stackIn_43_4);
                        stackIn_46_0 = 499;
                        stackIn_46_1 = 483;
                        stackIn_46_2 = 1;
                        stackIn_46_3 = -100;
                        if (-1 != this.field_h) {
                          stackIn_47_4 = 1;
                        } else {
                          stackIn_47_4 = -1;
                        }
                        qk.a(stackIn_46_0, stackIn_46_1, stackIn_46_2, stackIn_46_3, stackIn_47_4);
                        stackIn_50_0 = 499;
                        stackIn_50_1 = 485;
                        stackIn_50_2 = 1;
                        stackIn_50_3 = -110;
                        if (-1 != this.field_h) {
                          stackIn_51_4 = 2;
                        } else {
                          stackIn_51_4 = -1;
                        }
                        qk.a(stackIn_50_0, stackIn_50_1, stackIn_50_2, stackIn_50_3, stackIn_51_4);
                        stackIn_54_0 = 499;
                        stackIn_54_1 = 487;
                        stackIn_54_2 = 1;
                        stackIn_54_3 = -114;
                        if (-1 == this.field_h) {
                          stackIn_55_4 = -1;
                        } else {
                          stackIn_55_4 = 3;
                        }
                        qk.a(stackIn_54_0, stackIn_54_1, stackIn_54_2, stackIn_54_3, stackIn_55_4);
                        stackIn_58_0 = 497;
                        stackIn_58_1 = 482;
                        stackIn_58_2 = 2;
                        stackIn_58_3 = param0 - 130;
                        if (this.field_h == -1) {
                          stackIn_59_4 = -1;
                        } else {
                          stackIn_59_4 = 0;
                        }
                        qk.a(stackIn_58_0, stackIn_58_1, stackIn_58_2, stackIn_58_3, stackIn_59_4);
                        stackIn_62_0 = 497;
                        stackIn_62_1 = 484;
                        stackIn_62_2 = 2;
                        stackIn_62_3 = -96;
                        if (this.field_h == -1) {
                          stackIn_63_4 = -1;
                        } else {
                          stackIn_63_4 = 1;
                        }
                        qk.a(stackIn_62_0, stackIn_62_1, stackIn_62_2, stackIn_62_3, stackIn_63_4);
                        stackIn_66_0 = 497;
                        stackIn_66_1 = 486;
                        stackIn_66_2 = 2;
                        stackIn_66_3 = param0 ^ -125;
                        if (-1 != this.field_h) {
                          stackIn_67_4 = 2;
                        } else {
                          stackIn_67_4 = -1;
                        }
                        qk.a(stackIn_66_0, stackIn_66_1, stackIn_66_2, stackIn_66_3, stackIn_67_4);
                        stackIn_70_0 = 497;
                        stackIn_70_1 = 488;
                        stackIn_70_2 = 2;
                        stackIn_70_3 = param0 - 131;
                        if (this.field_h != -1) {
                          stackIn_71_4 = 3;
                        } else {
                          stackIn_71_4 = -1;
                        }
                        qk.a(stackIn_70_0, stackIn_70_1, stackIn_70_2, stackIn_70_3, stackIn_71_4);
                        jc.a(510, (byte) -75);
                        ul.b(472, (byte) -91);
                        ul.b(473, (byte) -120);
                        decompiledFrameRemainder0 = (var12 != 0);
                      }
                    }
                    if (decompiledFrameRemainder0) {
                      hk.a(48, (byte) -23, 10, 0, 54, 0, 55);
                      hk.a(56, (byte) -23, 10, 0, 62, 0, 63);
                      ul.b(329, (byte) -126);
                      tm.a(329, (byte) -77, false, 330);
                      decompiledFrameRemainder0 = (var12 != 0);
                    }
                  }
                }
                if (decompiledFrameRemainder0) {
                  ul.b(163, (byte) -108);
                  ul.b(164, (byte) -70);
                  ul.b(165, (byte) -69);
                  ul.b(213, (byte) -108);
                  ul.b(214, (byte) -89);
                  ul.b(215, (byte) -69);
                  tm.a(163, (byte) -77, true, 213);
                  tm.a(164, (byte) -77, true, 214);
                  tm.a(165, (byte) -77, true, 215);
                  ul.b(230, (byte) -124);
                  ul.b(246, (byte) -74);
                  tm.a(230, (byte) -77, false, 246);
                  ul.b(247, (byte) -72);
                  ul.b(263, (byte) -126);
                  tm.a(247, (byte) -77, false, 263);
                  decompiledFrameRemainder0 = (var12 != 0);
                }
              }
              if (decompiledFrameRemainder0) {
                ul.b(132, (byte) -89);
                ul.b(133, (byte) -95);
                ul.b(70, (byte) -111);
                ul.b(264, (byte) -104);
                ul.b(265, (byte) -106);
                ul.b(266, (byte) -93);
                ul.b(267, (byte) -76);
                tm.a(133, (byte) -77, false, 132);
                tm.a(264, (byte) -77, false, 268);
                tm.a(265, (byte) -77, false, 269);
                tm.a(266, (byte) -77, false, 270);
                tm.a(267, (byte) -77, false, 271);
                decompiledFrameRemainder0 = (var12 != 0);
              }
            }
            if (decompiledFrameRemainder0) {
              ul.b(77, (byte) -124);
              ul.b(110, (byte) -67);
              ul.b(111, (byte) -117);
              ul.b(173, (byte) -106);
              ul.b(174, (byte) -71);
              ul.b(175, (byte) -122);
              tm.a(173, (byte) -77, true, 189);
              tm.a(174, (byte) -77, true, 190);
              tm.a(175, (byte) -77, true, 191);
            }
          }
          if ((decompiledFrameRemainder0) &&
            (param1 == 0 ||
            var12 != 0)) {
            hk.a(21, (byte) -23, 3, 0, 16, -16384, 22);
            hk.a(16, (byte) -23, 3, 0, 21, 16384, 23);
            qk.n((byte) 98);
            ul.b(59, (byte) -91);
            ul.b(60, (byte) -81);
            ul.b(61, (byte) -74);
            ul.b(71, (byte) -76);
            ul.b(70, (byte) -96);
            ul.b(110, (byte) -66);
            ul.b(111, (byte) -67);
            ul.b(120, (byte) -104);
            ul.b(121, (byte) -103);
            ul.b(122, (byte) -73);
            ul.b(156, (byte) -103);
            ul.b(157, (byte) -87);
            ul.b(158, (byte) -97);
            ul.b(276, (byte) -80);
            ul.b(277, (byte) -116);
            ul.b(278, (byte) -74);
            tm.a(120, (byte) -77, true, 276);
            tm.a(121, (byte) -77, true, 277);
            tm.a(122, (byte) -77, true, 278);
          }
          if (param0 != 8) {
            this.field_o = -16;
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3 = decompiledCaughtException;
          throw sh.a((Throwable) ((Object) var3), "hi.DB(" + param0 + ',' + param1 + ')');
        }
    }

    private final void c(byte param0) {
        RuntimeException runtimeException = null;
        kd var2 = null;
        int var3 = 0;
        int var4 = 0;
        RuntimeException decompiledCaughtException = null;
        var4 = ZombieDawn.field_J;
        try {
          if (this.field_W.a(false) == 0) {
            return;
          }
          var3 = -60 / ((param0 + 57) / 38);
          var2 = (kd) (this.field_W.c((byte) 34));
          while (null != var2) {
            var2.q((byte) -119);
            var2 = (kd) (this.field_W.a((byte) 123));
            if (var4 != 0) {
              return;
            }
          }
          this.field_W.b(65);
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          runtimeException = decompiledCaughtException;
          throw sh.a((Throwable) ((Object) runtimeException), "hi.IA(" + param0 + ')');
        }
    }

    final static void a(byte param0) {
        try {
          jk.a(true, false);
          int var1_int = 92 % ((param0 - 56) / 63);
        } catch (RuntimeException runtimeException) {
          throw sh.a((Throwable) ((Object) runtimeException), "hi.DA(" + param0 + ')');
        }
    }

    final int j(int param0) {
        RuntimeException var2 = null;
        int stackIn_2_0 = 0;
        int stackIn_4_0 = 0;
        RuntimeException decompiledCaughtException = null;
        try {
          if (param0 == -5402) {
            stackIn_4_0 = eh.field_y;
            return stackIn_4_0;
          }
          stackIn_2_0 = 10;
          return stackIn_2_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2 = decompiledCaughtException;
          throw sh.a((Throwable) ((Object) var2), "hi.M(" + param0 + ')');
        }
    }

    final void a(kd param0, boolean param1) {
        boolean stackIn_39_1 = false;
        RuntimeException stackIn_50_0 = null;
        StringBuilder stackIn_50_1 = null;
        String stackIn_51_2 = null;
        RuntimeException decompiledCaughtException = null;
        int var3_int = 0;
        RuntimeException var3 = null;
        kd var4_ref_kd = null;
        int var4 = 0;
        qh var5 = null;
        kd var5_ref = null;
        qh var6 = null;
        int var7 = 0;
        int var3_intLifetime1;
        var7 = ZombieDawn.field_J;
        try {
          param0.d(0);
          param0.c((byte) -48);
          param0.b(-27598);
          this.field_gb.d((byte) -106);
          if (!param1) {
            this.e(69);
          }
          if (-1 == this.field_h &&
            this.field_q == 2 &&
            this.field_gb.field_k < 100) {
            var3_int = 0;
            while (var3_int < 2) {
              var4_ref_kd = this.a(20, (byte) 125, 400, 160, 670);
              var5 = new qh();
              var5.a(0, new kk(var4_ref_kd.a(true), -110 + var4_ref_kd.f(237239984)));
              var4_ref_kd.a(var5, true);
              var3_int++;
              if (var7 != 0) {
                return;
              }
            }
            if (var7 == 0) {
              return;
            }
          }
          if (this.field_h != 0 ||
            this.field_q != 7 ||
            param0.i((byte) -126)) {
            if (param0.field_fb <= 0) {
              return;
            }
            if (6 != this.field_q) {
              return;
            }
            stackIn_39_1 = !(param1);
            this.a(stackIn_39_1, param0);
            if (var7 == 0) {
              return;
            }
          }
          var3_intLifetime1 = 1;
          var4 = 0;
          while (var4 < var3_intLifetime1) {
            var5_ref = this.a(90, (byte) 125, 90, 915 - (80 - 80 * param0.field_fb), 1600);
            var5_ref.field_fb = param0.field_fb;
            this.field_gb.d((byte) -106);
            var6 = new qh();
            var6.a(0, new kk(960, 1090));
            var5_ref.a(var6, true);
            var4++;
            if (var7 != 0) {
              return;
            }
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3 = decompiledCaughtException;
          stackIn_50_0 = var3;
          stackIn_50_1 = new StringBuilder().append("hi.EA(");
          if (param0 == null) {
            stackIn_51_2 = "null";
          } else {
            stackIn_51_2 = "{...}";
          }
          throw sh.a((Throwable) ((Object) stackIn_50_0), ((StringBuilder) (Object) stackIn_50_1).append(stackIn_51_2).append(',').append(param1).append(')').toString());
        }
    }

    final void a(ig param0, byte param1) {
        int var3_int = 0;
        int var4 = 0;
        RuntimeException stackIn_12_0 = null;
        StringBuilder stackIn_12_1 = null;
        String stackIn_13_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var3 = null;
        try {
          this.field_nb = this.field_nb + 1;
          if (param1 < 51) {
            this.a(-98, 109, 21, -13, -54);
          }
          if (this.field_nb >= 120) {
            this.a(237, 18, (byte) -23);
          }
          var3_int = jo.field_Qb;
          var4 = var3_int;
          this.field_G = this.field_G + var4;
          this.field_l = this.field_l + var4;
          this.field_C = this.field_C + (var4 << 8);
          this.field_ab = this.field_ab + var4 * this.field_K;
          this.h(1);
          this.field_i.a(0, new ao(param0.a(true), -30 + param0.f(237239984), var3_int, true));
          this.field_gb.d((byte) -106);
          kh.a(47, false);
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3 = decompiledCaughtException;
          stackIn_12_0 = var3;
          stackIn_12_1 = new StringBuilder().append("hi.BA(");
          if (param0 == null) {
            stackIn_13_2 = "null";
          } else {
            stackIn_13_2 = "{...}";
          }
          throw sh.a((Throwable) ((Object) stackIn_12_0), ((StringBuilder) (Object) stackIn_12_1).append(stackIn_13_2).append(',').append(param1).append(')').toString());
        }
    }

    final void h(int param0) {
        RuntimeException decompiledCaughtException = null;
        RuntimeException var2 = null;
        try {
          if (this.field_G >= 2000) {
            this.a(255, 0, (byte) -23);
          }
          if (5000 <= this.field_G) {
            this.a(254, 1, (byte) -23);
          }
          if (this.field_G >= 10000) {
            this.a(253, 2, (byte) -23);
          }
          if (param0 != 1) {
            return;
          }
          if (this.field_G >= 16661) {
            this.a(242, 13, (byte) -23);
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2 = decompiledCaughtException;
          throw sh.a((Throwable) ((Object) var2), "hi.J(" + param0 + ')');
        }
    }

    final void a(int param0) {
        int var3 = 0;
        if (!this.b(-25983)) {
          return;
        }
        try {
          int var2_int = -108 % ((param0 + 64) / 49);
          var3 = -this.field_l;
          this.field_ab = this.field_ab + var3 * this.field_K;
          this.field_l = this.field_l + var3;
          this.field_C = this.field_C + (var3 << 8);
          this.field_G = this.field_G + var3;
          this.h(1);
          this.c(true);
          this.a(this.a(this.field_q, (byte) -103, this.field_h), (byte) -99);
          eh.field_y = eh.field_y - 1;
        } catch (RuntimeException runtimeException) {
          throw sh.a((Throwable) ((Object) runtimeException), "hi.QA(" + param0 + ')');
        }
    }

    private final int h(boolean param0) {
        int stackIn_47_0 = 0;
        RuntimeException decompiledCaughtException = null;
        int var2_int = 0;
        RuntimeException var2 = null;
        int var3 = 0;
        var3 = ZombieDawn.field_J;
        try {
          boolean decompiledFrameRemainder0 = true;
          var2_int = -1;
          if (this.field_h != -1) {
            if (this.field_q == 0) {
              var2_int = 1;
              decompiledFrameRemainder0 = (var3 != 0);
            }
            if (decompiledFrameRemainder0) {
              if (1 != this.field_q) {
                if (this.field_q == 2) {
                  var2_int = 3;
                  decompiledFrameRemainder0 = (var3 != 0);
                }
                if (decompiledFrameRemainder0) {
                  if (this.field_q != 3) {
                    if (this.field_q != 4) {
                      if (this.field_q == 5) {
                        var2_int = 12;
                        decompiledFrameRemainder0 = (var3 != 0);
                      }
                      if (decompiledFrameRemainder0) {
                        if ((7 != this.field_q) &&
                          (decompiledFrameRemainder0 = (this.field_q == 6))) {
                          var2_int = 11;
                          decompiledFrameRemainder0 = (var3 != 0);
                        }
                        if (decompiledFrameRemainder0) {
                          var2_int = 13;
                          decompiledFrameRemainder0 = (var3 != 0);
                        }
                      }
                    }
                    if (decompiledFrameRemainder0) {
                      var2_int = 10;
                      decompiledFrameRemainder0 = (var3 != 0);
                    }
                  }
                  if (decompiledFrameRemainder0) {
                    var2_int = 4;
                    decompiledFrameRemainder0 = (var3 != 0);
                  }
                }
              }
              if (decompiledFrameRemainder0) {
                var2_int = 2;
                decompiledFrameRemainder0 = (var3 != 0);
              }
            }
          }
          if (decompiledFrameRemainder0) {
            if (this.field_q != 3) {
              if (this.field_q != 7) {
                var2_int = 7;
                if (var3 != 0) {
                  var2_int = 8;
                  var2_int = 8;
                }
              } else {
                var2_int = 8;
                if (var3 != 0) {
                  var2_int = 8;
                }
              }
            } else {
              var2_int = 8;
            }
          }
          if (param0) {
            this.field_h = 28;
          }
          stackIn_47_0 = var2_int;
          return stackIn_47_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2 = decompiledCaughtException;
          throw sh.a((Throwable) ((Object) var2), "hi.R(" + param0 + ')');
        }
    }

    final void a(boolean param0, int param1, int param2, int param3) {
        mn var5 = null;
        mn stackIn_6_0;
        mn stackIn_6_1;
        ej stackIn_6_2;
        int stackIn_6_3;
        int stackIn_6_4;
        mn stackIn_7_0 = null;
        mn stackIn_7_1 = null;
        int stackIn_7_5 = 0;
        int stackIn_11_0 = 0;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var5_ref = null;
        try {
          if (param1 != -6355) {
            this.a(105, 'ﾬ', -105);
          }
          stackIn_6_0 = null;
          stackIn_6_1 = null;
          stackIn_6_2 = this.field_H;
          stackIn_6_3 = param2;
          stackIn_6_4 = param3;
          if (!param0) {
            stackIn_7_0 = null;
            stackIn_7_1 = null;
            stackIn_7_5 = 0;
          } else {
            stackIn_7_0 = null;
            stackIn_7_1 = null;
            stackIn_7_5 = 1;
          }
          var5 = new mn(stackIn_6_2, stackIn_6_3, stackIn_6_4, stackIn_7_5);
          stackIn_11_0 = (!param0) ? 77 : 76;
          kh.a(stackIn_11_0, false);
          this.field_v.a(param1 + 6355, var5);
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var5_ref = decompiledCaughtException;
          throw sh.a((Throwable) ((Object) var5_ref), "hi.N(" + param0 + ',' + param1 + ',' + param2 + ',' + param3 + ')');
        }
    }

    private final void i(int param0) {
        int stackIn_18_0 = 0;
        int stackIn_33_0 = 0;
        int stackIn_34_1 = 0;
        RuntimeException decompiledCaughtException = null;
        int var2_int = 0;
        RuntimeException var2 = null;
        int var3 = 0;
        int var4 = 0;
        fn var5 = null;
        int var6 = 0;
        fn var5Lifetime1;
        int var2_intLifetime1;
        int var4Lifetime1;
        var6 = ZombieDawn.field_J;
        try {
          if (param0 != 1) {
            return;
          }
          if (0 < this.field_fb) {
            var2_int = this.field_fb * (3 - Math.abs(-3 + this.field_h)) / 3;
            bi.a(0, 0, bd.field_e, nh.field_P, 13421772, var2_int);
            this.field_fb = this.field_fb - 14;
            if (var6 == 0) {
              return;
            }
          }
          boolean decompiledFrameRemainder0 = true;
          var2_intLifetime1 = (int)(tp.field_p % 157L);
          if ((var2_intLifetime1 < 2 ||
            var2_intLifetime1 >= 139 &&
            var2_intLifetime1 <= 141) && fb.a(1311979239, (int)(tp.field_p << 6)) < 0) {
            stackIn_18_0 = 1;
            decompiledFrameRemainder0 = false;
          }
          else {
            stackIn_18_0 = 0;
          }
          var3 = stackIn_18_0;
          if (var3 != 0) {
            this.field_fb = 70 + (40 * rd.a(true, (int)(tp.field_p << 6)) >> 16);
            var4 = this.field_fb * (-Math.abs(this.field_h - 3) + 3) / 3;
            var5 = tp.$cfr$intArgs$b$3010b50b2764(40, 97);
            if (null != var5) {
              var5.h(var4 * ge.field_c >> 8);
              var5.i(300 + var4 * 150);
            }
            if (var6 == 0) {
              return;
            }
          }
          if (var2_intLifetime1 == 5 &&
            3 > fb.a(param0 ^ 1311979238, (int)(tp.field_p << 6))) {
            var4Lifetime1 = 70 + (40 * rd.a(true, (int)(tp.field_p << 6)) >> 16);
            stackIn_33_0 = 84;
            if (0L != (tp.field_p & 1L)) {
              stackIn_34_1 = 129;
            } else {
              stackIn_34_1 = 128;
            }
            var5Lifetime1 = tp.$cfr$intArgs$b$3010b50b2764(stackIn_33_0, stackIn_34_1);
            if (var5Lifetime1 != null) {
              var5Lifetime1.h(var4Lifetime1 * ge.field_c >> 8);
            }
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2 = decompiledCaughtException;
          throw sh.a((Throwable) ((Object) var2), "hi.UA(" + param0 + ')');
        }
    }

    final boolean a(int param0, char param1, int param2) {
        boolean stackIn_49_0 = false;
        boolean stackIn_57_0 = false;
        boolean stackIn_65_0 = false;
        boolean stackIn_73_0 = false;
        boolean stackIn_81_0 = false;
        boolean stackIn_89_0 = false;
        boolean stackIn_97_0 = false;
        boolean stackIn_105_0 = false;
        boolean stackIn_113_0 = false;
        boolean stackIn_121_0 = false;
        uh stackIn_128_0 = null;
        int stackIn_128_1 = 0;
        int stackIn_129_2 = 0;
        boolean stackIn_158_0 = false;
        boolean stackIn_168_0 = false;
        RuntimeException decompiledCaughtException = null;
        boolean stackOut_157_0;
        int var4_int = 0;
        le var4 = null;
        RuntimeException var4_ref = null;
        int var5 = 0;
        var5 = ZombieDawn.field_J;
        try {
          this.field_C = this.field_C - this.field_Z;
          this.field_c = this.field_c - 1;
          this.field_I = this.field_I - param0;
          this.field_g = this.field_g + param0;
          if (param0 == 13) {
            ca.a(false, true, 2);
            return true;
          }
          if (mg.field_j == param0) {
            this.field_Q.a(3158064, 0);
            return true;
          }
          if (~gm.field_k == ~param0) {
            this.field_Q.a(3158064, 1);
            return true;
          }
          if (param0 == dl.field_c) {
            this.field_Q.a(3158064, 2);
            return true;
          }
          if (param0 == e.field_K) {
            this.field_Q.a(3158064, 3);
            return true;
          }
          if (~param0 == ~rd.field_D) {
            this.field_Q.a(3158064, 4);
            return true;
          }
          if (param0 == si.field_Rb) {
            this.field_Q.a(3158064, 5);
            return true;
          }
          if (sh.field_g == param0) {
            this.field_Q.a(param2 + 3187702, 6);
            return true;
          }
          if (~hn.field_m == ~param0) {
            this.field_Q.a(3158064, 7);
            return true;
          }
          if (param2 != -29638) {
            field_x = (vn) null;
          }
          if (this.field_A) {
            if (param0 == 34) {
              stackIn_49_0 = !(ga.field_w);
              ga.field_w = stackIn_49_0;
            }
            if (param0 == 36) {
              stackIn_57_0 = !(jp.field_m);
              jp.field_m = stackIn_57_0;
            }
            if (39 == param0) {
              stackIn_65_0 = !(al.field_e);
              al.field_e = stackIn_65_0;
            }
            if (param0 == 51) {
              stackIn_73_0 = !(g.field_Q);
              g.field_Q = stackIn_73_0;
            }
            if (param0 == 37) {
              stackIn_81_0 = !(ac.field_r);
              ac.field_r = stackIn_81_0;
            }
            if (param0 == 85) {
              stackIn_89_0 = !(a.field_c);
              a.field_c = stackIn_89_0;
            }
            if (param0 == 32) {
              stackIn_97_0 = !(kc.field_Q);
              kc.field_Q = stackIn_97_0;
            }
            if (param0 == 38) {
              stackIn_105_0 = !(nk.field_d);
              nk.field_d = stackIn_105_0;
            }
            if (param0 == 35) {
              stackIn_113_0 = !(b.field_h);
              b.field_h = stackIn_113_0;
            }
            if (param0 == 40) {
              stackIn_121_0 = !(dg.field_a);
              dg.field_a = stackIn_121_0;
            }
            if (param0 == 41) {
              this.field_F = true;
              stackIn_128_0 = this.field_Q;
              stackIn_128_1 = 122;
              if (bo.field_p[81]) {
                stackIn_129_2 = 9;
              } else {
                stackIn_129_2 = 0;
              }
              ((uh) (Object) stackIn_128_0).a((byte) stackIn_128_1, stackIn_129_2);
              return true;
            }
            if (param0 == 73) {
              System.gc();
            }
            if (param0 >= 1 &&
              4 >= param0) {
              var4_int = -1 + param0;
              if (bo.field_p[81]) {
                var4_int += 4;
              }
              this.a(this.a(var4_int, (byte) -77, 0), (byte) -99);
              this.field_F = true;
              return true;
            }
            if (param0 == 88) {
              ((kl) (jj.c(12, param2 ^ -29608))).e(param2 + 29510);
              ca.a(true, true, 12);
            }
            if (param0 == 5) {
              if (bo.field_i) {
                ch.a((byte) 80);
              }
              this.field_F = true;
              this.field_P = this.field_f;
              return true;
            }
            if (param0 == 6) {
              var4 = this.field_R.b((byte) 26);
              boolean decompiledNaturalLoopExit0 = false;
              while (!(decompiledNaturalLoopExit0 = (!(var4 instanceof fb)))) {
                stackOut_157_0 = var4 instanceof kd;
                stackIn_168_0 = stackOut_157_0;
                stackIn_158_0 = stackOut_157_0;
                if (var5 == 0) {
                  if (stackIn_158_0 &&
                    !((kd) (var4)).p(11312)) {
                    ((kd) (var4)).z(0);
                  }
                  var4 = var4.field_b;
                  continue;
                }
                break;
              }
              if (decompiledNaturalLoopExit0) {
                this.field_gb.d((byte) -106);
                this.field_F = true;
                stackIn_168_0 = true;
              }
              return stackIn_168_0;
            }
            if (param0 == 7) {
              this.field_gb.l(param2 + 29688);
              this.field_F = true;
              return true;
            }
            if (8 == param0) {
              this.g(true);
              this.field_F = true;
              return true;
            }
            if (param0 == 9) {
              this.a(this.a(this.field_q, (byte) 98, -1), (byte) -99);
              this.field_F = true;
              return true;
            }
            if (param0 == 10) {
              this.a(this.a(this.field_q, (byte) 126, this.field_h), (byte) -99);
              this.field_F = true;
              return true;
            }
            if (param0 == 11) {
              he.field_c = 1;
              return true;
            }
            if (param0 == 12 &&
              bo.field_p[82]) {
              this.field_S.a((byte) -99);
              return true;
            }
            if (param0 == 12) {
              this.field_gb.d(0);
              this.field_F = true;
              return true;
            }
          }
          if (bo.field_p[82] &&
            param0 == 48) {
            this.a(0, this.field_H.field_u, this.field_H.field_p, param2 ^ -29685, 0);
            return true;
          }
          return false;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var4_ref = decompiledCaughtException;
          throw sh.a((Throwable) ((Object) var4_ref), "hi.WA(" + param0 + ',' + param1 + ',' + param2 + ')');
        }
    }

    private final void g(int param0) {
        int stackIn_29_0 = 0;
        RuntimeException decompiledCaughtException = null;
        le var2 = null;
        RuntimeException var2_ref = null;
        le var3 = null;
        int var4 = 0;
        int var5 = 0;
        var5 = ZombieDawn.field_J;
        try {
          if (param0 <= 75) {
            hi.a((java.applet.Applet) null, -78);
          }
          var2 = this.field_R.b((byte) 26);
          boolean decompiledNaturalLoopExit0 = false;
          while (!(decompiledNaturalLoopExit0 = (!(var2 instanceof fb)))) {
            var3 = var2.field_b;
            stackIn_29_0 = this.field_ib;
            if (var5 == 0) {
              if (stackIn_29_0 == -1 &&
                var2 instanceof hk) {
                ((fb) (var2)).g(107);
              }
              if (var2 instanceof kd &&
                ((kd) (var2)).f(237239984) < 200) {
                var2.b(-27598);
                ((nb) (var2)).c((byte) -10);
                this.field_i.a(0, new ao(((kd) (var2)).a(true), 200, fl.field_e, false));
                var4 = fl.field_e;
                this.field_g = this.field_g - var4 * this.field_K;
                this.field_l = this.field_l + var4;
                this.field_G = this.field_G + var4;
                this.field_eb = this.field_eb + (var4 << 8);
                this.h(1);
                this.field_gb.a(true);
              }
              if (this.field_gb.field_b >= 50) {
                this.a(251, 4, (byte) -23);
              }
              var2 = var3;
              continue;
            }
            break;
          }
          if (decompiledNaturalLoopExit0) {
            stackIn_29_0 = 0;
          }
          fk.b(stackIn_29_0 != 0);
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2_ref = decompiledCaughtException;
          throw sh.a((Throwable) ((Object) var2_ref), "hi.SA(" + param0 + ')');
        }
    }

    final void e(int param0) {
        vn[] stackIn_27_0 = null;
        int stackIn_28_1 = 0;
        int stackIn_58_0 = 0;
        int stackIn_58_1 = 0;
        int stackIn_108_0 = 0;
        int stackIn_108_1 = 0;
        boolean stackIn_127_0 = false;
        int stackIn_146_0 = 0;
        int stackIn_146_1 = 0;
        int stackIn_180_0 = 0;
        int stackIn_180_1 = 0;
        RuntimeException decompiledCaughtException = null;
        int var2_int = 0;
        le var2 = null;
        RuntimeException var2_ref = null;
        int var3 = 0;
        ck var4 = null;
        int var4_int = 0;
        tj var4_ref = null;
        int var5_int = 0;
        oi var5 = null;
        int var6_int = 0;
        oi var6 = null;
        int var7_int = 0;
        da var7 = null;
        int var8_int = 0;
        long var8 = 0L;
        int var9 = 0;
        int var10_int = 0;
        long var10 = 0L;
        int var11 = 0;
        int var12 = 0;
        float var13 = 0.0f;
        int var14 = 0;
        ck var4Lifetime1;
        int stackIn_146_0Lifetime1;
        int stackIn_146_1Lifetime1;
        int var2_intLifetime1;
        int var5_intLifetime1;
        int var7_intLifetime1;
        int var8_intLifetime1;
        int var9Lifetime1;
        int var10_intLifetime1;
        int var11Lifetime1;
        int var12Lifetime1;
        int var5_intLifetime2;
        var14 = ZombieDawn.field_J;
        try {
          if (!this.field_X) {
            return;
          }
          if (0 < this.field_r) {
            var2_int = 16;
            if (this.field_r >= 200) {
              if (-this.field_r + 500 < 100) {
                var2_int = (500 - this.field_r) * 16 / 100;
                if (var14 != 0) {
                  var2_int = 16 * this.field_r / 200;
                }
              }
            } else {
              var2_int = 16 * this.field_r / 200;
            }
            this.field_L.h(ge.field_c * (220 * var2_int) / 16 >> 8);
            if (var2_int > 0) {
              this.field_S.field_u = this.field_S.field_u + (pb.a(so.field_a, var2_int, param0 - 9843) - var2_int / 2);
              this.field_S.field_c = this.field_S.field_c + (-(var2_int / 2) + pb.a(so.field_a, var2_int, 1));
            }
          }
          this.field_H.a(this.field_S, false);
          if (-1 != this.field_H.field_A.field_c &&
            this.field_H.field_A.field_o != -1) {
            var2_intLifetime1 = this.field_S.a(this.field_H.field_A.field_c, (byte) -100);
            var3 = this.field_S.a(this.field_H.field_A.field_o, 0);
            stackIn_27_0 = sl.field_c;
            if (5 > he.field_c) {
              stackIn_28_1 = he.field_c;
            } else {
              stackIn_28_1 = 4;
            }
            ((vn) (Object) stackIn_27_0[stackIn_28_1]).b(var2_intLifetime1 - 44, -44 + var3);
          }
          var2 = this.field_lb.b((byte) 26);
          while (null != var2) {
            ((mm) (var2)).a((byte) 117, this.field_S);
            var2 = this.field_lb.a(false);
            if (var14 == 0) {
              continue;
            }
            break;
          }
          boolean decompiledFrameCompleted3 = true;
          var3 = bo.field_i ? 1 : 0;
          if (var3 != 0) {
            li.a(-18996, this.field_S);
          }
          if (var3 == 0 ||
            var14 != 0) {
            var2 = this.field_d.b((byte) 26);
            while (var2 != null) {
              ((gk) (var2)).a((byte) -104, this.field_S);
              var2 = this.field_d.a(false);
              if (var14 != 0) {
                decompiledFrameCompleted3 = false;
                break;
              }
            }
          }
          if (decompiledFrameCompleted3) {
            var2 = this.field_e.b((byte) 26);
          }
          do {
            if (var2 == null) {
              var2 = this.field_m.b((byte) 26);
              break;
            }
            ((nc) (var2)).a(this.field_S, true);
            var2 = this.field_e.a(false);
          } while (var14 == 0);
          boolean decompiledNaturalLoopExit2 = false;
          while (!(decompiledNaturalLoopExit2 = (null == var2))) {
            var4 = (ck) (var2);
            stackIn_58_0 = -2;
            stackIn_58_1 = ~var4.field_o;
            if (var14 == 0) {
              if (stackIn_58_0 == stackIn_58_1) {
                var4.a(this.field_S, (byte) 110);
              }
              var2 = this.field_m.a(false);
              continue;
            }
            break;
          }
          if (decompiledNaturalLoopExit2) {
            stackIn_58_0 = param0;
            stackIn_58_1 = 9844;
          }
          if (stackIn_58_0 != stackIn_58_1) {
            this.a((kd) null, false);
          }
          this.field_H.a(this.field_S, 1, true, false);
          var2 = this.field_v.b((byte) 26);
          L20: while (true) {
            boolean decompiledFrameRemainder0 = true;
            if (null != var2) {
              ((mn) (var2)).a(this.field_S, -516);
              var2 = this.field_v.a(false);
              if (var14 == 0) {
                continue;
              }
            } else {
              decompiledFrameRemainder0 = (var3 != 0);
            }
            if (decompiledFrameRemainder0) {
              var2 = this.field_d.b((byte) 26);
              while (null != var2) {
                ((gk) (var2)).a((byte) -82, this.field_S);
                var2 = this.field_d.a(false);
                if (var14 != 0) {
                  break L20;
                }
              }
            }
            ap.field_u = 0;
            wg.field_n = 0;
            break;
          }
          if (!(Math.abs(-on.field_q + this.field_S.field_u) <= 40) ||
            !(40 >= Math.abs(-qb.field_b + this.field_S.field_c))) {
            qb.field_b = this.field_S.field_c;
            ld.field_m = true;
            on.field_q = this.field_S.field_u;
            ki.a((byte) -120, hn.field_p);
            bi.d();
            pa.a(-21189);
            if (var14 != 0) {
              ld.field_m = false;
            }
          } else {
            ld.field_m = false;
          }
          var2 = this.field_R.b((byte) 26);
          do {
            if (var2 == null) {
              var2 = this.field_T.b((byte) 26);
              break;
            }
            ((fb) (var2)).a((byte) -101, this.field_S);
            var2 = this.field_R.a(false);
          } while (var14 == 0);
          do {
            if (null == var2) {
              var2 = this.field_m.b((byte) 26);
              break;
            }
            ((gb) (var2)).a((byte) -86, this.field_S);
            var2 = this.field_T.a(false);
          } while (var14 == 0);
          boolean decompiledNaturalLoopExit1 = false;
          while (!(decompiledNaturalLoopExit1 = (null == var2))) {
            var4Lifetime1 = (ck) (var2);
            stackIn_108_0 = var4Lifetime1.field_o;
            stackIn_108_1 = 1;
            if (var14 == 0) {
              if (stackIn_108_0 != stackIn_108_1) {
                var4Lifetime1.a(this.field_S, (byte) 110);
              }
              var2 = this.field_m.a(false);
              continue;
            }
            break;
          }
          if (decompiledNaturalLoopExit1) {
            stackIn_108_0 = ~this.field_q;
            stackIn_108_1 = -6;
          }
          if (stackIn_108_0 == stackIn_108_1) {
            hn.field_p.b(-this.field_S.field_u + on.field_q - 40, -this.field_S.field_c + (qb.field_b - 40));
          }
          this.field_H.a(this.field_S, 2, true, false);
          if (this.field_H.field_A.field_a == 6 &&
            this.field_h != -1) {
            this.i(1);
          }
          this.field_H.a(this.field_S, 3, true, false);
          var2 = this.field_R.b((byte) 26);
          boolean decompiledNaturalLoopExit0 = false;
          while (!(decompiledNaturalLoopExit0 = (null == var2))) {
            stackIn_127_0 = var2 instanceof kd;
            if (var14 == 0) {
              if (stackIn_127_0) {
                ((kd) (var2)).a(0, this.field_S);
              }
              var2 = this.field_R.a(false);
              continue;
            }
            break;
          }
          if (decompiledNaturalLoopExit0) {
            this.field_b.a((byte) 6, this.field_S);
            stackIn_127_0 = kc.field_Q;
          }
          boolean decompiledFrameCompleted2 = true;
          boolean decompiledFrameCompleted0 = true;
          boolean decompiledFrameCompleted1 = true;
          if (stackIn_127_0) {
            var4_int = 0;
            while (var4_int < this.field_H.field_u) {
              var5_int = this.field_S.a(var4_int, (byte) -92);
              stackIn_146_0 = ~var5_int;
              stackIn_146_1 = -1;
              if (var14 != 0) {
                if (stackIn_146_0 < stackIn_146_1) {
                  var5_int = this.field_S.a(var4_int, 0);
                  stackIn_180_0 = ~var5_int;
                  stackIn_180_1 = -1;
                  decompiledFrameCompleted2 = false;
                  break;
                }
                decompiledFrameCompleted1 = false;
                break;
              }
              if (stackIn_146_0 <= stackIn_146_1 && (!((bd.field_e * 2) < var5_int) ||
                var14 != 0)) {
                bi.e(-1 + var5_int, 0, 2 * nh.field_P, 255);
                bi.e(var5_int, 0, 2 * nh.field_P, 255);
                bi.e(var5_int + 1, 0, nh.field_P * 2, 255);
              }
              var4_int += 128;
            }
            if ((decompiledFrameCompleted2) &&
              (decompiledFrameCompleted1)) {
              var4_int = 0;
              while (true) {
                stackIn_146_0Lifetime1 = ~this.field_H.field_p;
                stackIn_146_1Lifetime1 = ~var4_int;
                if (stackIn_146_0Lifetime1 >= stackIn_146_1Lifetime1) {
                  break;
                }
                var5_intLifetime2 = this.field_S.a(var4_int, 0);
                stackIn_180_0 = ~var5_intLifetime2;
                stackIn_180_1 = -1;
                if (var14 != 0) {
                  decompiledFrameCompleted0 = false;
                  break;
                }
                if (stackIn_180_0 <= stackIn_180_1 && (!(var5_intLifetime2 > (2 * nh.field_P)) ||
                  var14 != 0)) {
                  bi.b(0, -1 + var5_intLifetime2, bd.field_e * 2, 255);
                  bi.b(0, var5_intLifetime2, 2 * bd.field_e, 255);
                  bi.b(0, 1 + var5_intLifetime2, bd.field_e * 2, 255);
                }
                var4_int += 128;
              }
            }
          }
          if ((decompiledFrameCompleted2) &&
            (decompiledFrameCompleted0)) {
            if (this.field_p &&
              !this.field_w) {
              lb.field_eb[8].b(-12 + ha.field_b, ei.field_K - 12);
            }
            if (this.field_p &&
              this.field_w) {
              var6_int = ha.field_b - this.field_B;
              if (var6_int >= 0) {
                var4_int = this.field_B;
              }
              if (var6_int < 0 ||
                var14 != 0) {
                var6_int = -var6_int;
                var4_int = ha.field_b;
              }
              var7_int = ei.field_K - this.field_j;
              if (var7_int < 0) {
                var7_int = -var7_int;
                var5_intLifetime1 = ei.field_K;
                if (var14 != 0) {
                  var5_intLifetime1 = this.field_j;
                }
              } else {
                var5_intLifetime1 = this.field_j;
              }
              bi.c(var4_int, var5_intLifetime1, var6_int, var7_int, 16777215);
              bi.b(var4_int + 1, 1 + var5_intLifetime1, var6_int - 2, -2 + var7_int, 10066431, 32);
              bi.a(2 + var4_int, 2 + var5_intLifetime1, -4 + var6_int, -4 + var7_int, 3355647, 32);
            }
            stackIn_180_0 = -1;
            stackIn_180_1 = ~this.field_ib;
          }
          if (stackIn_180_0 == stackIn_180_1) {
            this.field_Q.g(param0 - 11137);
          }
          f.a((byte) -17, this.field_S);
          if (this.field_q == 5) {
            this.d(param0 - 9934);
          }
          if (ql.field_j >= 0.0f) {
            oj.field_f.b(this.field_S.a(ek.field_I, (byte) -124), this.field_S.a(-(int)ql.field_j + el.field_g, param0 ^ 9844));
          }
          var2 = this.field_i.b((byte) 26);
          do {
            if (null == var2) {
              this.field_gb.b(param0 ^ -9762);
              this.field_Q.b((byte) -55);
              eg.d(0);
              break;
            }
            ((ao) (var2)).a((byte) -106, this.field_S);
            var2 = this.field_i.a(false);
          } while (var14 == 0);
          var4_ref = sg.field_jb;
          var5 = bj.field_q;
          var6 = pc.field_k;
          if (!bo.field_i && ((this.field_S.field_d ||
            0.0f < this.field_S.field_g) &&
            (!(vh.field_b <= 150) ||
            !(id.field_M <= 150)))) {
            var7_intLifetime1 = this.field_S.a(this.field_S.field_v, (byte) -102);
            var8_int = this.field_S.a(this.field_S.field_f, 0);
            var9 = var7_intLifetime1 - 320;
            var10_int = 320 + var7_intLifetime1;
            var11 = var8_int - 240;
            var12 = 240 + var8_int;
            if (!this.field_S.field_d) {
              var13 = this.field_S.field_g;
              var10_int = (int)((float)(bd.field_e - 5) * (1.0f - var13) + var13 * (float)var10_int);
              var9 = (int)(var13 * (float)var9 + (-var13 + 1.0f) * 5.0f);
              var11 = (int)(var13 * (float)var11 + 5.0f * (-var13 + 1.0f));
              var12 = (int)(var13 * (float)var12 + (-var13 + 1.0f) * (float)(nh.field_P - 5));
              System.out.println("lit area: " + var9 + "," + var11 + "," + (-var9 + var10_int) + "," + (-var11 + var12));
            }
            bi.f(5, 5, -5 + bd.field_e, -5 + nh.field_P);
            bi.b(5, 5, -10 + bd.field_e, var11 - 5, 0);
            bi.b(5, var12, bd.field_e - 10, nh.field_P + (-5 - var12), 0);
            bi.b(5, var11, -5 + var9, -var11 + var12, 0);
            bi.b(var10_int, var11, -5 + bd.field_e - var10_int, -var11 + var12, 0);
          }
          if (this.field_ib == -1 ||
            this.field_N > 0) {
            bi.f(-this.field_N + (vh.field_b + 640), 0, bd.field_e, nh.field_P);
            if (this.field_h == -1) {
              var5.a(kb.field_g[this.field_q], bd.field_d, 280, 16777215, 0);
            }
            this.field_V.b(-(this.field_V.field_w / 2) + bd.field_d, nh.field_G - this.field_V.field_t);
            so.a(this.field_t, bd.field_d + (-(this.field_V.field_w / 2) - 6), -6 + (-this.field_V.field_t + nh.field_G));
            bi.c();
          }
          var7 = (da) (this.field_ob.b((byte) 26));
          if (var7 != null) {
            var8_intLifetime1 = 10;
            var9Lifetime1 = 10;
            var10_intLifetime1 = var7.field_k;
            var11Lifetime1 = var5.b(hk.field_J[var10_intLifetime1]) + 70;
            var12Lifetime1 = this.field_z;
            if (32 > var12Lifetime1 ||
              303 < var12Lifetime1) {
              if (var12Lifetime1 > 32) {
                var12Lifetime1 = -var12Lifetime1 + 335;
              }
              var8_intLifetime1 = -310 + var12Lifetime1 * 10;
            }
            bi.a(var8_intLifetime1, var9Lifetime1, var11Lifetime1, 40, 6, 0, 160);
            bi.e(var8_intLifetime1, var9Lifetime1, var11Lifetime1, 40, 6, 7829367);
            ed.field_a[var10_intLifetime1].g(var8_intLifetime1 + 9, var9Lifetime1 + 5);
            var5.c(hk.field_J[var10_intLifetime1], var8_intLifetime1 + 50, var9Lifetime1 + 25, 16777215, 3355443);
          }
          of.a(11690);
          if (al.field_e) {
            bi.a(0, 22, 80, 105, 0, 128);
            var6.c(Integer.toString(this.field_c), 5, 40, 16777215, 0);
            var6.c(Integer.toString(this.field_C), 5, 60, 16777215, 0);
            var6.c(Integer.toString(this.field_eb), 5, 80, 16777215, 0);
            var6.c(Integer.toString(this.field_Z), 5, 100, 16777215, 0);
            var6.c(Integer.toString((this.field_G << 8) + this.f(param0 ^ -9799)), 5, 120, 16777215, 0);
          }
          if (jp.field_m ||
            ac.field_r ||
            nk.field_d) {
            bi.a(0, 0, 640, 17, 0, 100);
          }
          if (jp.field_m) {
            pc.field_k.c("cam=(" + this.field_S.field_u + ", " + this.field_S.field_c + ") bk=" + ci.field_d + " k=" + kc.field_R + " mouse=(" + ha.field_b + "," + ei.field_K + ") trees=" + ap.field_u + " tree tiles=" + wg.field_n, 5, 13, 16777215, 0);
          }
          if (nk.field_d) {
            pc.field_k.c("mouseover tile=(" + (-bd.field_d + ha.field_b + this.field_S.field_u) / 24 + ", " + (-nh.field_G + (ei.field_K + this.field_S.field_c)) / 24 + ")  pixel=(" + (ha.field_b + (this.field_S.field_u - bd.field_d)) + "," + (this.field_S.field_c + ei.field_K - nh.field_G) + ")", 5, 13, 16777215, 0);
          }
          if (this.field_F) {
            var5.b("Cheater!", 630, 410, 16776960, 0);
          }
          if (ac.field_r) {
            var8 = Runtime.getRuntime().totalMemory();
            var10 = Runtime.getRuntime().freeMemory();
            pc.field_k.b((var8 - var10) / 1024L + " kB / " + var8 / 1024L + " kB", 636, 13, 16777215, 0);
          }
          if (a.field_c) {
            var4_ref.c(Integer.toString(mf.field_d), 10, 40, 2, -1);
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2_ref = decompiledCaughtException;
          throw sh.a((Throwable) ((Object) var2_ref), "hi.AB(" + param0 + ')');
        }
    }

    private final void b(int param0, int param1, int param2) {
        int incrementValue$0 = 0;
        int incrementValue$1 = 0;
        int incrementValue$2 = 0;
        int incrementValue$3 = 0;
        int stackIn_31_0 = 0;
        int stackIn_31_1 = 0;
        int stackIn_41_0 = 0;
        int stackIn_63_0 = 0;
        int stackIn_68_0 = 0;
        int stackIn_68_1 = 0;
        int stackIn_79_0 = 0;
        RuntimeException decompiledCaughtException = null;
        int var4_int = 0;
        RuntimeException var4 = null;
        ra var5 = null;
        kd var6_ref_kd = null;
        int var6 = 0;
        qh var7_ref_qh = null;
        int var7 = 0;
        int[][] var8 = null;
        int var9 = 0;
        int var10 = 0;
        int var11 = 0;
        int var12 = 0;
        int var13_int = 0;
        kd var13 = null;
        int var14 = 0;
        int var15 = 0;
        int var16 = 0;
        int var17 = 0;
        int var18 = 0;
        kd var13Lifetime1;
        int stackIn_41_0Lifetime1;
        int stackIn_63_0Lifetime1;
        int stackIn_79_0Lifetime1;
        int var12Lifetime1;
        int var14Lifetime1;
        int var15Lifetime1;
        var18 = ZombieDawn.field_J;
        try {
          this.field_b.a((byte) 75, param1, param0);
          if (1 < this.field_W.a(false)) {
            param1 = fa.e(-126) + (-(param1 % 24) + param1);
            param0 = fa.e(-127) + param0 - param0 % 24;
            if (var18 != 0) {
              param0 += 6;
            }
          } else {
            param0 += 6;
          }
          var4_int = 1;
          var5 = new ra();
          var6_ref_kd = (kd) (this.field_W.c((byte) 34));
          while (null != var6_ref_kd) {
            var7_ref_qh = this.field_H.a(true, var6_ref_kd.a(true), param0, param1, var6_ref_kd.f(237239984));
            if (var18 != 0) {
              return;
            }
            if (null == var7_ref_qh) {
              var6_ref_kd.c((byte) -68);
              var5.a(var6_ref_kd, (byte) -128);
            } else {
              var4_int = 0;
            }
            var6_ref_kd = (kd) (this.field_W.a((byte) 116));
          }
          if (var4_int == 0) {
            this.field_b.c(20);
            if (var18 == 0) {
              var6 = param1 / 24;
              var7 = param0 / 24;
              if (param2 <= 114) {
                this.field_F = false;
              }
              var8 = this.field_H.a(8728);
              var8[var7][var6] = 1;
              var9 = 2;
              var10 = 1;
              var11 = this.field_W.a(false);
              while (var11 >= var9) {
                var12 = -1;
                var13_int = -1;
                stackIn_63_0 = 0;
                var14 = stackIn_63_0;
                L12: while (true) {
                  stackIn_31_0 = var8.length;
                  stackIn_31_1 = var14;
                  if (stackIn_31_0 > stackIn_31_1) {
                    stackIn_41_0 = 0;
                    var15 = stackIn_41_0;
                    while (var8[0].length > var15) {
                      stackIn_31_0 = ~var8[var14][var15];
                      stackIn_31_1 = ~var10;
                      if (stackIn_31_0 == stackIn_31_1) {
                        var12 = var15;
                        var13_int = var14;
                      }
                      var15++;
                    }
                    var14++;
                    continue L12;
                  }
                  break;
                }
                stackIn_41_0Lifetime1 = -1;
                if (stackIn_41_0Lifetime1 == var12 &&
                  var13_int == -1) {
                  return;
                }
                if (hm.a(var12, -1 + var13_int, var8, 2) == 0) {
                  incrementValue$0 = var9;
                  var9++;
                  var8[-1 + var13_int][var12] = incrementValue$0;
                }
                if (hm.a(1 + var12, var13_int, var8, 2) == 0) {
                  incrementValue$1 = var9;
                  var9++;
                  var8[var13_int][var12 + 1] = incrementValue$1;
                }
                if (hm.a(var12, var13_int + 1, var8, 2) == 0) {
                  incrementValue$2 = var9;
                  var9++;
                  var8[var13_int + 1][var12] = incrementValue$2;
                }
                var10++;
                if (hm.a(-1 + var12, var13_int, var8, 2) == 0) {
                  incrementValue$3 = var9;
                  var9++;
                  var8[var13_int][-1 + var12] = incrementValue$3;
                }
              }
              stackIn_63_0Lifetime1 = 0;
              var12Lifetime1 = stackIn_63_0Lifetime1;
              var13 = (kd) (this.field_W.c((byte) 34));
              while (null != var13) {
                var12Lifetime1++;
                var14Lifetime1 = -1;
                var15Lifetime1 = -1;
                var16 = 0;
                L27: while (true) {
                  stackIn_68_0 = var8.length;
                  stackIn_68_1 = var16;
                  if (stackIn_68_0 > stackIn_68_1) {
                    stackIn_79_0 = 0;
                    var17 = stackIn_79_0;
                    while (var8[0].length > var17) {
                      stackIn_68_0 = ~var12Lifetime1;
                      stackIn_68_1 = ~var8[var16][var17];
                      if (stackIn_68_0 == stackIn_68_1) {
                        var14Lifetime1 = var17;
                        var15Lifetime1 = var16;
                      }
                      var17++;
                    }
                    var16++;
                    continue L27;
                  }
                  break;
                }
                stackIn_79_0Lifetime1 = ~var14Lifetime1;
                if (stackIn_79_0Lifetime1 == 0 &&
                  -1 == var15Lifetime1) {
                  return;
                }
                param1 = 24 * var14Lifetime1 + fa.e(-128);
                param0 = fa.e(49) + var15Lifetime1 * 24;
                var13.a(this.field_H.a(true, var13.a(true), param0, param1, var13.f(237239984)), true);
                if (7 == this.field_q &&
                  0 == this.field_h &&
                  !var13.x(52)) {
                  ck.a(-12, 6836);
                }
                var13 = (kd) (this.field_W.a((byte) 114));
              }
              var13Lifetime1 = (kd) (var5.c((byte) 34));
              while (var13Lifetime1 != null) {
                var13Lifetime1.c((byte) -85);
                this.field_W.a(var13Lifetime1, (byte) -109);
                var13Lifetime1 = (kd) (var5.a((byte) 122));
              }
              return;
            }
          }
          this.field_W = var5;
          this.field_b.a((byte) 29);
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var4 = decompiledCaughtException;
          throw sh.a((Throwable) ((Object) var4), "hi.S(" + param0 + ',' + param1 + ',' + param2 + ')');
        }
    }

    private final on a(int param0, byte param1, int param2) {
        int var4_int = 0;
        RuntimeException var4 = null;
        int var5 = 0;
        int var6 = 0;
        on stackIn_5_0 = null;
        int stackIn_9_0 = 0;
        byte[][] stackIn_9_1 = null;
        int stackIn_10_2 = 0;
        on stackIn_11_0 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          if (param0 > 3 &&
            0 >= be.field_j) {
            stackIn_5_0 = this.a(0, (byte) -93, 0);
            return stackIn_5_0;
          }
          var4_int = -89 / ((param1 + 2) / 55);
          var5 = this.f(104) + 28 * this.field_bb;
          this.field_q = param0;
          this.field_bb = this.field_q / 4;
          this.field_h = param2;
          var6 = this.f(82) + this.field_bb * 28;
          this.field_C = this.field_C + (-var5 + var6);
          stackIn_9_0 = 124;
          stackIn_9_1 = cl.field_c[this.field_q];
          if (this.field_h != -1) {
            stackIn_10_2 = this.field_h;
          } else {
            stackIn_10_2 = 6;
          }
          stackIn_11_0 = ja.$cfr$intArgs$a$362bc3736cea(stackIn_9_0, stackIn_9_1[stackIn_10_2]);
          return stackIn_11_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var4 = decompiledCaughtException;
          throw sh.a((Throwable) ((Object) var4), "hi.JA(" + param0 + ',' + param1 + ',' + param2 + ')');
        }
    }

    private final g a(int param0, boolean param1, byte param2, int param3) {
        int var5_int = 0;
        RuntimeException var5 = null;
        int var6 = 0;
        Object var7 = null;
        int var8 = 0;
        fb var9 = null;
        g var10 = null;
        int var11 = 0;
        Object stackIn_23_0 = null;
        RuntimeException decompiledCaughtException = null;
        var11 = ZombieDawn.field_J;
        try {
          var5_int = this.field_S.a(param3, false);
          var6 = this.field_S.b(param0, true);
          var7 = null;
          var8 = -1;
          if (param2 >= -66) {
            this.a(112, -70, 11, 40, -44);
          }
          var9 = (fb) (this.field_R.b((byte) 26));
          while (null != var9) {
            if (param1 &&
              var9 instanceof ah ||
              !param1 &&
              var9 instanceof kd) {
              var10 = (g) (var9);
              if (var10.a(76, var5_int, var6) &&
                var8 < var10.f(237239984)) {
                var8 = var10.f(237239984);
                var7 = var10;
              }
            }
            var9 = (fb) (this.field_R.a(false));
            if (var11 == 0) {
              continue;
            }
            break;
          }
          stackIn_23_0 = var7;
          return (g) (stackIn_23_0);
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var5 = decompiledCaughtException;
          throw sh.a((Throwable) ((Object) var5), "hi.CA(" + param0 + ',' + param1 + ',' + param2 + ',' + param3 + ')');
        }
    }

    final void a(int param0, ah param1, byte param2, boolean param3, kk param4) {
        int stackIn_55_0 = 0;
        RuntimeException stackIn_110_0 = null;
        StringBuilder stackIn_110_1 = null;
        String stackIn_111_2 = null;
        StringBuilder stackIn_114_1 = null;
        String stackIn_115_2 = null;
        RuntimeException decompiledCaughtException = null;
        int var6_int = 0;
        RuntimeException var6 = null;
        int var7 = 0;
        kd var8 = null;
        int var9_int = 0;
        fn var9 = null;
        int var10 = 0;
        try {
          if (fj.a(0, -126)) {
            if (param1.field_t == 4 ||
              param1.field_t == 1) {
              this.field_U = this.field_U + 1;
            }
            if (this.field_U == 100) {
              this.a(243, 12, (byte) -23);
            }
          }
          if (this.field_q == 5 &&
            this.field_h == 3 &&
            param1.field_t == 23) {
            this.field_o = this.field_o + 1;
            if (this.field_o == 7) {
              this.a(238, 17, (byte) -23);
            }
          }
          var6_int = param1.a(true);
          var7 = param1.f(237239984);
          var8 = new kd(var6_int, var7, param1.t(10), param0);
          if (param1.field_kb) {
            var8.b((byte) 124, 1000);
          }
          this.field_R.a(0, var8);
          var8.d((byte) 118);
          so.b(this.field_R);
          if (param0 == 0) {
            if (param3) {
              var8.r(param2 ^ -31320);
              this.field_W.a(var8, (byte) -126);
              if (param4 != null) {
                var8.a(this.field_H.a(true, var6_int, param4.field_h, param4.field_l, var7), true);
              }
            }
            if (!(param1 instanceof we)) {
              this.field_P = this.field_P + 1;
            }
            param1.field_F = 18;
            if (param1.field_t == 28) {
              this.field_hb = this.field_hb + 1;
            }
            this.field_gb.d((byte) -106);
            if (this.field_q != 5 ||
              this.field_h != -1) {
              if (-1 == this.field_h) {
                stackIn_55_0 = ga.field_r;
              } else {
                stackIn_55_0 = param1.s(24478);
              }
              var9_int = stackIn_55_0;
              if (0 != var9_int) {
                var10 = var9_int;
                this.field_C = this.field_C + (var10 << 8);
                this.field_l = this.field_l + var10;
                this.field_G = this.field_G + var10;
                this.field_ab = this.field_ab + var10 * this.field_K;
                this.h(1);
                this.field_i.a(param2 ^ 60, new ao(param1.a(true), param1.f(237239984) - 30, var9_int, true));
              }
            }
            if (param1 instanceof we) {
              this.a(249, 6, (byte) -23);
            }
            if (param1.field_ib) {
              if (this.field_q == 4 &&
                this.field_h == 5) {
                this.a(226, 29, (byte) -23);
              }
              if (this.field_q == 5 &&
                this.field_h == 5 &&
                30 == param1.field_t) {
                this.a(225, 30, (byte) -23);
              }
              if (this.field_q == 7 &&
                this.field_h == 3) {
                this.a(224, 31, (byte) -23);
              }
            }
            ck.a(-4, 6836);
          }
          if (param0 != 0 ||
            ZombieDawn.field_J != 0) {
            this.field_gb.d((byte) -106);
          }
          if (!this.field_gb.b(true)) {
            var8.u(param2 - 165);
          }
          if (param2 != 60) {
            this.a(-64, -71, -114, -32, 40);
          }
          if (this.field_q == 4 &&
            5 == this.field_h &&
            k.field_t == 20) {
            kh.a(122, false);
            var9 = kh.a(149, false);
            var9.h(3 * var9.j() / 2);
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var6 = decompiledCaughtException;
          stackIn_110_0 = var6;
          stackIn_110_1 = new StringBuilder().append("hi.NA(").append(param0).append(',');
          if (param1 == null) {
            stackIn_111_2 = "null";
          } else {
            stackIn_111_2 = "{...}";
          }
          stackIn_114_1 = ((StringBuilder) (Object) stackIn_110_1).append(stackIn_111_2).append(',').append(param2).append(',').append(param3).append(',');
          if (param4 == null) {
            stackIn_115_2 = "null";
          } else {
            stackIn_115_2 = "{...}";
          }
          throw sh.a((Throwable) ((Object) stackIn_110_0), ((StringBuilder) (Object) stackIn_114_1).append(stackIn_115_2).append(')').toString());
        }
    }

    private final void d(int param0, int param1, int param2) {
        int stackIn_50_0 = 0;
        RuntimeException decompiledCaughtException = null;
        int var4_int = 0;
        RuntimeException var4 = null;
        int var5 = 0;
        Object var6_ref = null;
        int var6 = 0;
        int var7 = 0;
        kd var8 = null;
        int var9 = 0;
        var9 = ZombieDawn.field_J;
        try {
          this.field_Q.d((byte) -83);
          if (param2 != 31098) {
            return;
          }
          if (!this.field_A ||
            !bo.field_p[81]) {
            this.c((byte) 126);
            if (var9 == 0) {
              return;
            }
          }
          var4_int = this.field_S.a(param0, false);
          var5 = this.field_S.b(param1, true);
          if (this.field_H.a(false, var5, var4_int, true)) {
            boolean decompiledFrameRemainder1 = true;
            boolean decompiledFrameCompleted0 = true;
            if (bo.field_p[82]) {
              boolean decompiledFrameRemainder0 = true;
              if (this.field_q != 4 ||
                -1 != this.field_h) {
                if (this.field_q == 5 &&
                  this.field_h == -1) {
                  var6_ref = new ig(var4_int, var5, 3);
                  decompiledFrameRemainder0 = (var9 != 0);
                }
                if (decompiledFrameRemainder0) {
                  if (5 == this.field_q) {
                    var6_ref = eo.a(52, var4_int, 23, var5);
                    decompiledFrameRemainder0 = (var9 != 0);
                  }
                  if (decompiledFrameRemainder0) {
                    if (7 != this.field_q) {
                      var6_ref = eo.a(105, var4_int, so.c(9), var5);
                      if (var9 != 0) {
                        var6_ref = eo.a(68, var4_int, 28, var5);
                        var6_ref = new me(var4_int, var5, 3);
                      }
                    } else {
                      var6_ref = eo.a(68, var4_int, 28, var5);
                      if (var9 != 0) {
                        var6_ref = new me(var4_int, var5, 3);
                      }
                    }
                  }
                }
              } else {
                var6_ref = new me(var4_int, var5, 3);
              }
              this.field_f = this.field_f + 1;
              this.field_R.a(0, (le) (var6_ref));
              this.field_gb.d((byte) -106);
              ((ah) (var6_ref)).d((byte) 124);
              decompiledFrameRemainder1 = (var9 != 0);
            }
            if (decompiledFrameRemainder1) {
              if (bo.field_p[74]) {
                this.a(var5, true, 119, var4_int);
                decompiledFrameRemainder1 = (var9 != 0);
              }
              if (decompiledFrameRemainder1) {
                stackIn_50_0 = (bo.field_p[86]) ? 100 : 1;
                var6 = stackIn_50_0;
                var7 = 0;
                while (var7 < var6) {
                  var8 = new kd(var4_int, var5, pb.a(so.field_a, 2, param2 ^ 31099), 0);
                  this.field_R.a(0, var8);
                  var8.d((byte) -1);
                  var7++;
                  if (var9 != 0) {
                    decompiledFrameCompleted0 = false;
                    break;
                  }
                }
                if (decompiledFrameCompleted0) {
                  this.field_gb.d((byte) -106);
                }
              }
            }
            this.field_F = true;
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var4 = decompiledCaughtException;
          throw sh.a((Throwable) ((Object) var4), "hi.O(" + param0 + ',' + param1 + ',' + param2 + ')');
        }
    }

    private final void d(byte param0) {
        RuntimeException decompiledCaughtException = null;
        RuntimeException var2 = null;
        int var3 = 0;
        var3 = ZombieDawn.field_J;
        try {
          if (bo.field_i) {
            return;
          }
          boolean decompiledFrameRemainder0 = true;
          if (this.field_ib == 0) {
            if (null == this.field_kb) {
              if (null != this.field_a) {
                this.field_a.field_ob = false;
                this.field_a = null;
                if (var3 != 0) {
                  this.field_kb.field_qb = false;
                  this.field_kb.field_cb = false;
                  this.field_kb = null;
                }
              }
            } else {
              this.field_kb.field_qb = false;
              this.field_kb.field_cb = false;
              this.field_kb = null;
            }
            this.field_a = (ah) (this.a(ei.field_K, true, (byte) -87, ha.field_b));
            if ((this.field_Q.a(-112)) &&
              (decompiledFrameRemainder0 = (this.field_a != null))) {
              this.field_a.field_ob = true;
              decompiledFrameRemainder0 = (var3 != 0);
            }
            if (decompiledFrameRemainder0) {
              this.field_kb = (kd) (this.a(ei.field_K, false, (byte) -83, ha.field_b));
              if (null != this.field_kb) {
                if (!this.field_kb.i((byte) -126)) {
                  this.field_kb = null;
                  if (var3 != 0) {
                    if (!this.field_Q.a((byte) 113)) {
                      this.field_kb.field_qb = true;
                      this.field_kb.field_cb = true;
                    } else {
                      this.field_kb.field_cb = true;
                    }
                  }
                } else {
                  if (!this.field_Q.a((byte) 113)) {
                    this.field_kb.field_qb = true;
                    if (var3 != 0) {
                      this.field_kb.field_cb = true;
                    }
                  } else {
                    this.field_kb.field_cb = true;
                  }
                }
              }
            }
          }
          if (param0 > -126) {
            this.field_m = (vo) null;
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2 = decompiledCaughtException;
          throw sh.a((Throwable) ((Object) var2), "hi.AA(" + param0 + ')');
        }
    }

    static int a(int param0, int param1) {
        int stackIn_1_0 = 0;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var2 = null;
        try {
          stackIn_1_0 = param0 | param1;
          return stackIn_1_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2 = decompiledCaughtException;
          throw sh.a((Throwable) ((Object) var2), "hi.A(" + param0 + ',' + param1 + ')');
        }
    }

    final void f(byte param0) {
        try {
          this.field_r = 500;
          this.field_L = jp.$cfr$intArgs$a$c44adeabe1a9(127, 74);
          if (param0 != 9) {
            field_Y = (String) null;
          }
        } catch (RuntimeException runtimeException) {
          throw sh.a((Throwable) ((Object) runtimeException), "hi.KA(" + param0 + ')');
        }
    }

    private final void b(byte param0) {
        int fieldTemp$0 = 0;
        int fieldTemp$1 = 0;
        int fieldTemp$2 = 0;
        int fieldTemp$3 = 0;
        int fieldTemp$4 = 0;
        int stackIn_10_0 = 0;
        le stackIn_29_0 = null;
        boolean stackIn_56_0 = false;
        int stackIn_63_0 = 0;
        boolean stackIn_130_0 = false;
        int stackIn_226_0 = 0;
        RuntimeException decompiledCaughtException = null;
        boolean stackOut_55_0;
        int var2_int = 0;
        RuntimeException var2 = null;
        int var3 = 0;
        int var4 = 0;
        le var5_ref_le = null;
        ck var5_ref_ck = null;
        mm var5_ref_mm = null;
        nc var5_ref_nc = null;
        ao var5_ref_ao = null;
        int var5 = 0;
        le var6 = null;
        Object var6_ref = null;
        mn var6_ref2 = null;
        mn var7_ref_mn = null;
        int var7 = 0;
        fb var7_ref_fb = null;
        int[] var7_ref_int__ = null;
        kd var8_ref_kd = null;
        int var8 = 0;
        int var9 = 0;
        int var10 = 0;
        int var11 = 0;
        int var12 = 0;
        int var13 = 0;
        mn var7_ref_mnLifetime1;
        boolean stackIn_130_0Lifetime1;
        int var7Lifetime1;
        int var7Lifetime2;
        int var8Lifetime1;
        int var8Lifetime2;
        int var9Lifetime1;
        int var9Lifetime2;
        int var9Lifetime3;
        int var10Lifetime1;
        int var11Lifetime1;
        int var7Lifetime3;
        int var8Lifetime3;
        int var9Lifetime4;
        int var10Lifetime2;
        var13 = ZombieDawn.field_J;
        try {
          if (param0 != 93) {
            return;
          }
          if (this.field_ib != -1) {
            stackIn_10_0 = (this.field_gb.k(16284)) ? 0 : 1;
            var2_int = stackIn_10_0;
            this.field_gb.c(this.field_G, 0);
            if (var2_int != 0 &&
              this.field_gb.k(16284)) {
              ck.a(-6, 6836);
            }
            this.field_H.a(false);
            var3 = 0;
            var4 = 0;
            var5_ref_le = this.field_R.b((byte) 26);
            boolean decompiledNaturalLoopExit1 = false;
            while (!(decompiledNaturalLoopExit1 = (!(var5_ref_le instanceof fb)))) {
              var6 = var5_ref_le.field_b;
              ((fb) (var5_ref_le)).g(119);
              stackIn_29_0 = var5_ref_le;
              if (var13 == 0) {
                if (stackIn_29_0 instanceof kd) {
                  var3++;
                }
                if (var5_ref_le instanceof we) {
                  var4++;
                }
                var5_ref_le = var6;
                continue;
              }
              break;
            }
            if (decompiledNaturalLoopExit1) {
              stackIn_29_0 = this.field_m.b((byte) 26);
            }
            var5_ref_ck = (ck) (stackIn_29_0);
            while (null != var5_ref_ck) {
              var5_ref_ck.a(-11367);
              var5_ref_ck = (ck) (this.field_m.a(false));
              if (var13 != 0) {
                return;
              }
            }
            var5_ref_mm = (mm) (this.field_lb.b((byte) 26));
            while (null != var5_ref_mm) {
              var5_ref_mm.a(-25687);
              var5_ref_mm = (mm) (this.field_lb.a(false));
              if (var13 != 0) {
                return;
              }
            }
            var5_ref_nc = (nc) (this.field_e.b((byte) 26));
            while (null != var5_ref_nc) {
              var5_ref_nc.a(false);
              var5_ref_nc = (nc) (this.field_e.a(false));
              if (var13 != 0) {
                return;
              }
            }
            var5_ref_ao = (ao) (this.field_i.b((byte) 26));
            while (null != var5_ref_ao) {
              var5_ref_ao.g(param0 + 21);
              var5_ref_ao = (ao) (this.field_i.a(false));
              if (var13 != 0) {
                return;
              }
            }
            var5 = 0;
            var6_ref = null;
            var7_ref_mn = (mn) (this.field_v.b((byte) 26));
            boolean decompiledNaturalLoopExit0 = false;
            while (!(decompiledNaturalLoopExit0 = (null == var7_ref_mn))) {
              var6_ref2 = (mn) (this.field_v.a(false));
              stackOut_55_0 = var7_ref_mn.b(true);
              stackIn_63_0 = stackOut_55_0 ? 1 : 0;
              stackIn_56_0 = stackOut_55_0;
              if (var13 == 0) {
                if (stackIn_56_0) {
                  var5 = 1;
                }
                var7_ref_mn = var6_ref2;
                continue;
              }
              break;
            }
            if (decompiledNaturalLoopExit0) {
              stackIn_63_0 = var5;
            }
            boolean decompiledFrameCompleted1 = true;
            if (stackIn_63_0 != 0) {
              var7_ref_mnLifetime1 = (mn) (this.field_v.b((byte) 26));
              while (var7_ref_mnLifetime1 != null) {
                var7_ref_mnLifetime1.c((byte) 76);
                var7_ref_mnLifetime1 = (mn) (this.field_v.a(false));
                if (var13 != 0) {
                  decompiledFrameCompleted1 = false;
                  break;
                }
              }
              if (decompiledFrameCompleted1) {
                this.b(true);
              }
            }
            boolean decompiledFrameRemainder2 = true;
            boolean decompiledFrameCompleted0 = true;
            if (this.field_h == -1) {
              boolean decompiledFrameRemainder1 = true;
              var7 = this.field_q;
              if ((var7 != 4) &&
                (decompiledFrameRemainder1 = (5 != var7 ||
                var13 != 0))) {
                decompiledFrameRemainder2 = (var7 == 6);
                if ((decompiledFrameRemainder2) &&
                  (var13 == 0)) {
                  var7_ref_fb = (fb) (this.field_n.a(0, 0, this.field_n.field_d, 1, true));
                  while (null != var7_ref_fb) {
                    stackIn_130_0 = var7_ref_fb instanceof kd;
                    if (stackIn_130_0) {
                      var8_ref_kd = (kd) (var7_ref_fb);
                      if (var8_ref_kd.i((byte) -126) &&
                        var8_ref_kd.f(237239984) < 288) {
                        var8_ref_kd.field_fb = -1;
                        var8_ref_kd.field_qb = false;
                        var8_ref_kd.field_cb = false;
                        var8_ref_kd.c((byte) -20);
                        var8_ref_kd.q((byte) -114);
                        var8_ref_kd.a(this.field_H.a(true, var8_ref_kd.a(true), 120, this.field_H.field_u - 1, var8_ref_kd.f(237239984)), true);
                        this.field_gb.a(true);
                        if (60 >= this.field_gb.j(-106)) {
                          this.a(233, 22, (byte) -23);
                        }
                      }
                    }
                    var7_ref_fb = (fb) (this.field_n.b(false));
                  }
                  decompiledFrameRemainder2 = false;
                }
              }
              if ((decompiledFrameRemainder2) &&
                (decompiledFrameRemainder1)) {
                fieldTemp$0 = this.field_jb - 1;
                this.field_jb = this.field_jb - 1;
                decompiledFrameRemainder2 = !(fieldTemp$0 > 0);
                if (decompiledFrameRemainder2) {
                  this.field_jb = 100;
                  if (this.field_gb.field_a < 600) {
                    this.field_jb = 650;
                  }
                  var7Lifetime3 = so.c(3);
                  var8 = 240 * var7Lifetime3 + 156;
                  var9 = 0;
                  var8 = -12 + (264 + 288 * var7Lifetime3);
                  var10 = 0;
                  while (var10 < 18) {
                    var11 = so.c(24) + var8;
                    var12 = so.c(9);
                    this.field_R.a(0, new me(var11, var9, var12));
                    var9 -= 30;
                    var10++;
                    if (var13 != 0) {
                      decompiledFrameCompleted0 = false;
                      break;
                    }
                  }
                  if (decompiledFrameCompleted0) {
                    decompiledFrameRemainder2 = (var13 != 0);
                  }
                }
              }
              if ((decompiledFrameRemainder2) &&
                (decompiledFrameCompleted0)) {
                fieldTemp$1 = this.field_jb - 1;
                this.field_jb = this.field_jb - 1;
                if (fieldTemp$1 <= 0) {
                  var7_ref_int__ = new int[]{0, 3, 5, 2, 30, 26, 24};
                  var8Lifetime3 = so.c(this.field_k);
                  var9Lifetime4 = this.field_D[var8Lifetime3];
                  var10Lifetime2 = this.field_s[var8Lifetime3];
                  var11Lifetime1 = so.a(var7_ref_int__);
                  var9Lifetime4 = var9Lifetime4 + so.c(48);
                  var10Lifetime2 = var10Lifetime2 + so.c(48);
                  this.field_jb = 25;
                  this.field_R.a(0, new ig(var9Lifetime4, var10Lifetime2, var11Lifetime1));
                }
              }
            }
            stackIn_130_0Lifetime1 = this.field_gb.k(16284);
            boolean decompiledFrameRemainder0 = true;
            if (stackIn_130_0Lifetime1 &&
              this.field_h != -1) {
              if (he.field_c == 0) {
                he.field_c = 1;
                decompiledFrameRemainder0 = (var13 != 0);
              }
              if ((decompiledFrameRemainder0) &&
                (he.field_c == 4)) {
                if (ub.field_f < 0.0f &&
                  0.0f > ql.field_j) {
                  ql.field_j = -1.0f;
                  ub.field_f = 0.0f;
                  var7Lifetime1 = 0;
                  while (true) {
                    if (var7Lifetime1 < 4) {
                      var8Lifetime1 = -15 + pb.a(so.field_a, 30, param0 - 92);
                      var9Lifetime1 = pb.a(so.field_a, 30, 1) - 15;
                      this.field_R.a(param0 ^ 93, eo.a(123, var8Lifetime1 + this.field_H.field_A.field_c, 19, this.field_H.field_A.field_o + var9Lifetime1));
                      var7Lifetime1++;
                      if (var13 == 0) {
                        continue;
                      }
                    } else {
                      this.b(3, this.field_H.field_A.field_o, true, this.field_H.field_A.field_c);
                    }
                    break;
                  }
                  if (var13 != 0) {
                    if (0 == this.field_E &&
                      var3 > var4) {
                      ql.field_j = 0.0f;
                      ub.field_f = 6.0f;
                    }
                    fieldTemp$2 = this.field_E + 1;
                    this.field_E = this.field_E + 1;
                    if (fieldTemp$2 > 400) {
                      this.field_E = 0;
                    }
                  }
                } else {
                  if (0 == this.field_E &&
                    var3 > var4) {
                    ql.field_j = 0.0f;
                    ub.field_f = 6.0f;
                  }
                  fieldTemp$2 = this.field_E + 1;
                  this.field_E = this.field_E + 1;
                  if (fieldTemp$2 > 400) {
                    this.field_E = 0;
                  }
                }
              }
            }
            if (this.field_H.field_A.field_c != -1 &&
              this.field_H.field_A.field_o != -1) {
              if (ql.field_j >= 0.0f) {
                ql.field_j = ql.field_j + ub.field_f;
                ub.field_f = ub.field_f - 0.18000000715255737f;
              }
              if (he.field_c > 0 &&
                he.field_c < 4) {
                fieldTemp$3 = mc.field_h + 1;
                mc.field_h = mc.field_h + 1;
                if (fieldTemp$3 > 2) {
                  mc.field_h = 0;
                  fieldTemp$4 = he.field_c + 1;
                  he.field_c = he.field_c + 1;
                  if (20 < fieldTemp$4) {
                    he.field_c = 0;
                  }
                }
              }
            }
            var9Lifetime2 = this.field_q;
            if (var9Lifetime2 != 4 &&
              var9Lifetime2 != 5) {
              return;
            }
            if (var9Lifetime2 == 4 ||
              var13 != 0) {
              if (this.field_h == -1) {
                return;
              }
              if (this.field_h == 5 &&
                k.field_t <= 40) {
                return;
              }
              var9Lifetime2 = 1793;
              var10Lifetime1 = (int)(tp.field_p % (long)var9Lifetime2);
              if (var10Lifetime1 == 0) {
                kh.a(122, false);
              }
              if ((var10Lifetime1 != 0 ||
                var13 != 0) &&
                var10Lifetime1 == 60) {
                kh.a(so.c(3) + 119, false);
              }
              if (var13 == 0) {
                return;
              }
            }
            var7Lifetime2 = 419;
            var8Lifetime2 = (int)(tp.field_p % (long)var7Lifetime2);
            if (0 != var8Lifetime2) {
              return;
            }
            stackIn_226_0 = (tp.field_p % 2L != 0L) ? 138 : 137;
            var9Lifetime3 = stackIn_226_0;
            kh.a(var9Lifetime3, false);
            return;
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2 = decompiledCaughtException;
          throw sh.a((Throwable) ((Object) var2), "hi.T(" + param0 + ')');
        }
    }

    private final void a(int param0, int param1, int param2) {
        RuntimeException decompiledCaughtException = null;
        int var4_int = 0;
        RuntimeException var4 = null;
        int var5 = 0;
        var5 = ZombieDawn.field_J;
        try {
          var4_int = 109 % ((param0 + 77) / 40);
          if (!d.a(param2, false, param1)) {
            if (this.field_Q.a((byte) 118, param2, param1)) {
              return;
            }
            if (this.field_Q.a((byte) 126) &&
              null != this.field_kb) {
              this.a(this.field_kb, (byte) -2);
              this.field_Q.a(67, this.field_kb);
              return;
            }
            if (this.field_Q.a(-107) &&
              null != this.field_a) {
              if (!bo.field_p[81]) {
                this.c((byte) -114);
              }
              this.field_Q.a(67, this.field_a);
              return;
            }
            if (!this.field_Q.a(true) &&
              !this.field_Q.d(121)) {
              if (null == this.field_kb) {
                if (this.field_W.a(false) <= 0) {
                  return;
                }
                this.b(this.field_S.b(param2, true), this.field_S.a(param1, false), 122);
                if (var5 == 0) {
                  return;
                }
              }
              this.a(this.field_kb, (byte) -2);
              ck.a(-3, 6836);
              if (var5 == 0) {
                return;
              }
            }
            this.field_Q.b(this.field_S.b(param2, true), this.field_S.a(param1, false), false);
            return;
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var4 = decompiledCaughtException;
          throw sh.a((Throwable) ((Object) var4), "hi.OA(" + param0 + ',' + param1 + ',' + param2 + ')');
        }
    }

    final void a(int param0, boolean param1, int param2, int param3) {
        RuntimeException decompiledCaughtException = null;
        int var5_int = 0;
        RuntimeException var5 = null;
        int var6 = 0;
        var6 = ZombieDawn.field_J;
        try {
          boolean decompiledFrameCompleted0 = true;
          if (this.field_d.d(-46) > 200) {
            var5_int = 0;
            while (var5_int < 5) {
              this.field_d.f(67);
              var5_int++;
              if (var6 != 0) {
                decompiledFrameCompleted0 = false;
                break;
              }
            }
          }
          if (decompiledFrameCompleted0) {
            this.field_d.a(0, new gk(param3, param0, pb.a(so.field_a, 6, 1), param1));
            this.field_d.a(0, new gk(param3 + 15, param0, pb.a(so.field_a, 6, 1), param1));
            this.field_d.a(0, new gk(-15 + param3, param0, pb.a(so.field_a, 6, 1), param1));
            this.field_d.a(0, new gk(param3, param0 - 15, pb.a(so.field_a, 6, 1), param1));
          }
          if (param2 < 109) {
            this.a((kd) null, (byte) -74);
          }
          this.field_d.a(0, new gk(param3, 15 + param0, pb.a(so.field_a, 6, 1), param1));
          if (!this.field_H.a(false, param0 - 24, param3, true) &&
            !this.field_H.a(false, -24 + param0, param3 + 24, true) &&
            !this.field_H.a(false, param0 - 24, -24 + param3, true) &&
            this.field_H.a(false, param0, param3, true)) {
            param0 = param0 - (24 + param0 % 24);
            this.field_R.a(0, new gk(param3, param0, 6 + pb.a(so.field_a, 6, 1), param1));
            this.field_d.a(0, new gk(param3, 24 + param0, pb.a(so.field_a, 6, 1), param1));
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var5 = decompiledCaughtException;
          throw sh.a((Throwable) ((Object) var5), "hi.HA(" + param0 + ',' + param1 + ',' + param2 + ',' + param3 + ')');
        }
    }

    final void c(int param0) {
        RuntimeException decompiledCaughtException = null;
        RuntimeException var2 = null;
        try {
          if (param0 != 9091) {
            this.field_e = (vo) null;
          }
          bd.a(this.h(false), true);
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2 = decompiledCaughtException;
          throw sh.a((Throwable) ((Object) var2), "hi.MA(" + param0 + ')');
        }
    }

    private final void e(boolean param0) {
        int stackIn_16_0 = 0;
        boolean stackIn_19_0 = false;
        int stackIn_82_0 = 0;
        ub stackIn_91_1 = null;
        ub stackIn_91_2 = null;
        ub stackIn_92_1 = null;
        ub stackIn_92_2 = null;
        int stackIn_92_3 = 0;
        int stackIn_94_0 = 0;
        int stackIn_94_1 = 0;
        boolean stackIn_95_2 = false;
        boolean stackIn_117_0 = false;
        boolean stackIn_124_1 = false;
        int stackIn_142_0 = 0;
        int stackIn_143_1 = 0;
        ub stackIn_159_0 = null;
        int stackIn_159_1 = 0;
        boolean stackIn_160_2 = false;
        ub stackIn_166_0 = null;
        boolean stackIn_167_1 = false;
        ub stackIn_173_0 = null;
        int stackIn_173_1 = 0;
        boolean stackIn_174_2 = false;
        ub stackIn_178_0 = null;
        int stackIn_178_1 = 0;
        boolean stackIn_184_2 = false;
        ub stackIn_187_0 = null;
        boolean stackIn_188_1 = false;
        int stackIn_251_0 = 0;
        int stackIn_257_0 = 0;
        int stackIn_259_0 = 0;
        int stackIn_259_1 = 0;
        kc stackIn_300_0 = null;
        boolean stackIn_301_1 = false;
        int stackIn_304_0 = 0;
        int stackIn_304_1 = 0;
        int stackIn_320_0 = 0;
        int stackIn_320_1 = 0;
        int stackIn_331_0 = 0;
        int stackIn_331_1 = 0;
        int stackIn_340_0 = 0;
        int stackIn_340_1 = 0;
        int stackIn_351_0 = 0;
        int stackIn_351_1 = 0;
        int stackIn_371_0 = 0;
        int stackIn_374_0 = 0;
        int stackIn_374_1 = 0;
        int stackIn_378_0 = 0;
        int stackIn_378_1 = 0;
        int stackIn_393_0 = 0;
        int stackIn_415_0 = 0;
        RuntimeException decompiledCaughtException = null;
        boolean stackOut_18_0;
        int var2_int = 0;
        RuntimeException var2 = null;
        int var3 = 0;
        fb var4 = null;
        String var4_ref = null;
        tj var5 = null;
        fn var6_ref_fn = null;
        boolean[][] var6_ref_boolean____ = null;
        int var6 = 0;
        boolean[][] var7_ref_boolean____ = null;
        int var7 = 0;
        int var8 = 0;
        int var9 = 0;
        kc var9_ref_kc = null;
        kd var9_ref_kd = null;
        int var10_int = 0;
        qh var10 = null;
        int[] var10_array = null;
        int var11 = 0;
        int var12 = 0;
        int var13 = 0;
        int var14 = 0;
        int var15 = 0;
        int var16 = 0;
        int var17 = 0;
        kd var9_ref_kdLifetime1;
        qh var10Lifetime1;
        int stackIn_304_0Lifetime1;
        int stackIn_304_1Lifetime1;
        int stackIn_331_0Lifetime1;
        int stackIn_331_1Lifetime1;
        int stackIn_351_0Lifetime1;
        int stackIn_351_1Lifetime1;
        int stackIn_374_0Lifetime1;
        int stackIn_374_1Lifetime1;
        int stackIn_393_0Lifetime1;
        int var6Lifetime1;
        int var7Lifetime1;
        int var8Lifetime1;
        int var9Lifetime1;
        int var10_intLifetime1;
        int var11Lifetime1;
        int var12Lifetime1;
        int var13Lifetime1;
        int var16Lifetime1;
        int var6Lifetime2;
        int var6Lifetime3;
        int var6Lifetime4;
        int var7Lifetime2;
        int var7Lifetime3;
        int var7Lifetime4;
        int var8Lifetime2;
        int var8Lifetime3;
        int var8Lifetime4;
        int var8Lifetime5;
        int var11Lifetime2;
        int stackIn_351_0Lifetime1Lifetime1;
        int stackIn_351_1Lifetime1Lifetime1;
        int var12Lifetime1Lifetime1;
        var17 = ZombieDawn.field_J;
        try {
          var2_int = 15 + this.h(false);
          oj.field_d.a(false, 13);
          if (this.field_bb == 1) {
            oj.field_d.a(false, 14);
          }
          oj.field_d.a(param0, this.field_mb.field_a);
          oj.field_d.a(param0, var2_int);
          if (!oj.field_d.c((byte) 115)) {
            return;
          }
          boolean decompiledFrameRemainder4 = true;
          this.field_w = true;
          this.field_M = false;
          this.field_p = param0;
          this.field_kb = null;
          this.field_W = new ra();
          this.field_b = new qj();
          this.field_nb = 0;
          mc.field_h = 0;
          this.field_E = 0;
          on.field_q = -1;
          ld.field_m = true;
          this.field_hb = 0;
          this.field_o = 0;
          he.field_c = 0;
          this.field_P = 0;
          qb.field_b = -1;
          this.field_r = 0;
          this.field_fb = 0;
          uc.field_c = 0;
          this.field_H = new ej(this.field_mb);
          this.field_u = new int[3];
          this.field_J = new int[3];
          mn.a(false);
          hm.a(9);
          this.field_n = new mj(1 + (this.field_H.field_u >> 7), 1 + (this.field_H.field_p >> 7));
          this.field_S = new wk(this.field_H.field_u, this.field_H.field_p);
          this.field_S.a(this.field_mb.field_b[1], this.field_mb.field_b[3], this.field_mb.field_m[2], this.field_mb.field_m[0], this.field_mb.field_b[0], this.field_mb.field_m[1], this.field_mb.field_m[3], this.field_mb.field_b[2], 106);
          this.field_S.a((byte) -98);
          this.b(8, this.field_mb.field_a);
          this.field_mb.a(0, true);
          this.field_m = new vo();
          this.field_lb = new vo();
          this.field_d = new vo();
          this.field_e = new vo();
          this.field_v = new vo();
          this.field_T = new vo();
          this.field_i = new vo();
          this.field_R = this.field_mb.b((byte) 106);
          so.b(this.field_R);
          this.field_f = 0;
          this.field_l = 0;
          cm.field_c = null;
          if ((this.field_q == 4 ||
            this.field_q == 7) && this.field_h == 0) {
            stackIn_16_0 = 1;
            decompiledFrameRemainder4 = false;
          }
          else {
            stackIn_16_0 = 0;
          }
          var3 = stackIn_16_0;
          var4 = (fb) (this.field_R.b((byte) 26));
          boolean decompiledNaturalLoopExit1 = false;
          while (!(decompiledNaturalLoopExit1 = (null == var4))) {
            stackOut_18_0 = var4 instanceof gb;
            stackIn_82_0 = stackOut_18_0 ? 1 : 0;
            stackIn_19_0 = stackOut_18_0;
            if (var17 == 0) {
              boolean decompiledFrameRemainder3 = true;
              if (stackIn_19_0 &&
                var4.field_C &&
                vi.field_a) {
                var4.b(-27598);
              } else {
                if (var4 instanceof ah) {
                  if (var4.field_C &&
                    !vi.field_a) {
                    var4.b(-27598);
                    decompiledFrameRemainder3 = false;
                  }
                  else {
                    if (!((ah) (var4)).field_ib) {
                      this.field_f = this.field_f + 1;
                    }
                  }
                }
                if (decompiledFrameRemainder3) {
                  if (!(var4.field_z <= 0) ||
                    var4 instanceof g) {
                    var4.d((byte) -85);
                    if (var4.a((byte) 99, 4)) {
                      this.field_u[-1 + var4.field_z] = this.field_u[-1 + var4.field_z] + 1;
                    }
                    if (var4.a((byte) 38, 1) &&
                      0 < var4.field_z) {
                      this.field_J[-1 + var4.field_z] = this.field_J[-1 + var4.field_z] + 1;
                    }
                  }
                  if (var4 instanceof te) {
                    var4.d((byte) 127);
                  }
                  if (var3 != 0 &&
                    var4 instanceof kd) {
                    ((kd) (var4)).v(-23221);
                    if (this.field_q == 7) {
                      var3 = 0;
                    }
                  }
                  if (var4 instanceof kc) {
                    ((kc) (var4)).a(this.field_H, false);
                  }
                }
              }
              var4 = (fb) (this.field_R.a(false));
              continue;
            }
            break;
          }
          if (decompiledNaturalLoopExit1) {
            this.field_db = 0;
            stackIn_82_0 = 6;
          }
          if (stackIn_82_0 == this.field_q &&
            3 == this.field_h) {
            this.field_db = 13;
          }
          this.field_Q = new uh();
          stackIn_91_1 = null;
          stackIn_91_2 = null;
          if (!vi.field_a) {
            stackIn_92_1 = null;
            stackIn_92_2 = null;
            stackIn_92_3 = 1 + this.field_mb.field_j;
          } else {
            stackIn_92_1 = null;
            stackIn_92_2 = null;
            stackIn_92_3 = this.field_mb.field_s + 1;
          }
          this.field_gb = new ub(stackIn_92_3);
          gg.a(128);
          nc.a(11800);
          wh.a((byte) 100);
          jj.b(param0);
          stackIn_94_0 = this.field_q;
          stackIn_94_1 = this.field_h;
          stackIn_95_2 = !(param0);
          ih.a(stackIn_94_0, stackIn_94_1, stackIn_95_2);
          bo.field_i = false;
          if (-1 == this.field_h) {
            var4_ref = te.field_S;
            if (this.field_q == 3 ||
              this.field_q == 7) {
              if (7 != this.field_q) {
                if (3 == this.field_q) {
                  this.a(248, 7, (byte) -23);
                  if (var17 != 0) {
                    this.a(231, 24, (byte) -23);
                  }
                }
              } else {
                this.a(231, 24, (byte) -23);
              }
              qm.a(1, this.field_bb);
              var4_ref = hm.field_M;
            }
          } else {
            var4_ref = gj.field_w[this.field_q][this.field_h];
          }
          var5 = sg.field_jb;
          this.field_V = new vn(var5.b(var4_ref), var5.field_I + var5.field_x);
          this.field_t = new vn(12 + this.field_V.field_w, 12 + this.field_V.field_t);
          this.field_V.a();
          this.field_N = 640;
          var5.a(var4_ref, this.field_V.field_w / 2, this.field_V.field_t - var5.field_x, 2, -1);
          this.field_t.a();
          this.field_V.h(6, 6, 16777215);
          bi.h(4, 4, 0, 0, bi.field_f, bi.field_a);
          this.field_V.h(6, 6, 0);
          cn.field_f.b(96);
          stackIn_117_0 = !param0;
          stackIn_124_1 = (this.field_q == 0) && (this.field_h == 5);
          boolean decompiledFrameRemainder1 = true;
          lc.a(stackIn_117_0, stackIn_124_1);
          if (1 == this.field_q && (this.field_h == 1 ||
            this.field_h == 4)) {
            jp.$cfr$intArgs$a$c44adeabe1a9(125, 53);
            decompiledFrameRemainder1 = (var17 != 0);
          }
          if (decompiledFrameRemainder1) {
            if (this.field_q == 5) {
              stackIn_142_0 = 127;
              if (0 == this.field_h % 2) {
                stackIn_143_1 = 147;
              } else {
                stackIn_143_1 = 148;
              }
              var6_ref_fn = jp.$cfr$intArgs$a$c44adeabe1a9(stackIn_142_0, stackIn_143_1);
              var6_ref_fn.h(2 * var6_ref_fn.j());
              if (2 == this.field_h ||
                3 == this.field_h) {
                jp.$cfr$intArgs$a$c44adeabe1a9(126, 145);
              }
              decompiledFrameRemainder1 = (var17 != 0);
            }
            if ((decompiledFrameRemainder1) &&
              (6 != this.field_q)) {
            }
          }
          stackIn_159_0 = this.field_gb;
          stackIn_159_1 = 49;
          stackIn_160_2 = (7 == this.field_q) && (this.field_h == 5);
          ((ub) (Object) stackIn_159_0).a(stackIn_159_1, stackIn_160_2);
          stackIn_166_0 = this.field_gb;
          stackIn_167_1 = (this.field_q == 4) && (this.field_h == -1);
          ((ub) (Object) stackIn_166_0).a(stackIn_167_1, (byte) -13);
          stackIn_173_0 = this.field_gb;
          stackIn_173_1 = 10;
          stackIn_174_2 = (this.field_q == 5) && (this.field_h == -1);
          boolean decompiledFrameRemainder2 = true;
          ((ub) (Object) stackIn_173_0).b(stackIn_173_1, stackIn_174_2);
          stackIn_178_0 = this.field_gb;
          stackIn_178_1 = 0;
          if ((1 == this.field_q ||
            this.field_q == 6) && this.field_h == -1) {
            stackIn_184_2 = true;
            decompiledFrameRemainder2 = false;
          }
          else {
            stackIn_184_2 = false;
          }
          ((ub) (Object) stackIn_178_0).c(stackIn_178_1, stackIn_184_2);
          stackIn_187_0 = this.field_gb;
          stackIn_188_1 = !(param0);
          ((ub) (Object) stackIn_187_0).a(stackIn_188_1, bo.field_i);
          if (this.field_q == 0 &&
            this.field_h != -1 ||
            1 == this.field_q &&
            5 == this.field_h ||
            this.field_q == 1 &&
            this.field_h == -1 ||
            this.field_q == 2 &&
            this.field_h == 5 ||
            this.field_q == 6 &&
            this.field_h == 3 ||
            this.field_q == 6 &&
            4 == this.field_h ||
            this.field_q == 6 &&
            this.field_h == 5 ||
            this.field_q == 5 &&
            this.field_h != -1 ||
            7 == this.field_q) {
            this.field_gb.d(0);
            this.field_H.field_A.field_c = -1;
            this.field_H.field_A.field_o = -1;
          }
          boolean decompiledFrameCompleted3 = true;
          boolean decompiledFrameCompleted1 = true;
          L54: {
            boolean decompiledFrameCompleted2 = true;
            if (this.field_h == -1) {
              this.field_H.field_A.field_o = -1;
              this.field_H.field_A.field_c = -1;
              if (5 != this.field_q) {
                if (this.field_q != 6) {
                  break L54;
                }
                var6_ref_boolean____ = new boolean[4][6];
                var7_ref_boolean____ = new boolean[4][6];
                var8 = 0;
                L56: while (true) {
                  stackIn_251_0 = -4;
                  L57: while (true) {
                    boolean decompiledFrameRemainder0 = true;
                    if (stackIn_251_0 >= ~var8) {
                      stackIn_257_0 = 5;
                      decompiledFrameRemainder0 = (var17 == 0);
                      if ((decompiledFrameRemainder0) &&
                        (stackIn_257_0 >= var8)) {
                        break L57;
                      }
                    }
                    if (decompiledFrameRemainder0) {
                      var8 = 0;
                      stackIn_257_0 = 0;
                    }
                    var9 = stackIn_257_0;
                    var10_int = 0;
                    while (true) {
                      stackIn_259_0 = -5;
                      stackIn_259_1 = ~var10_int;
                      if (stackIn_259_0 < stackIn_259_1) {
                        var11 = 0;
                        stackIn_251_0 = 0;
                        if (var17 != 0) {
                          continue L57;
                        }
                        var12 = stackIn_251_0;
                        while (var12 < 6) {
                          var6_ref_boolean____[var10_int][var12] = true;
                          var7_ref_boolean____[var10_int][var12] = true;
                          stackIn_259_0 = var12;
                          stackIn_259_1 = 5;
                          if (stackIn_259_0 >= stackIn_259_1 ||
                            var10_int != 0 &&
                            !(so.c(256) < 100)) {
                            var7_ref_boolean____[var10_int][var12] = true;
                            var13 = var12 - so.c(var11 + 1);
                            if (var10_int == 0) {
                              var9 = var13;
                            } else {
                              if (var9 <= var12 &&
                                var9 >= (var12 - var11)) {
                                var8 = var8 + Math.abs(var9 - var13);
                                var9 = var13;
                              }
                            }
                            var6_ref_boolean____[var10_int][var13] = false;
                            var11 = 0;
                          } else {
                            var7_ref_boolean____[var10_int][var12] = false;
                            var11++;
                          }
                          var12++;
                        }
                        var10_int++;
                        continue;
                      }
                      break;
                    }
                    if (var17 == 0) {
                      continue L56;
                    }
                    break;
                  }
                  break;
                }
                var9_ref_kc = (kc) (rg.field_J.c((byte) 34));
                L72: while (true) {
                  if (var9_ref_kc != null) {
                    stackIn_304_0 = ~var9_ref_kc.field_V;
                    stackIn_304_1 = -2;
                    if (var17 != 0) {
                      if (stackIn_304_0 < stackIn_304_1) {
                        var9_ref_kd = this.a(216, (byte) 122, -264 + this.field_H.field_u, 144, 48 + (this.field_H.field_p + 30));
                        var10 = new qh();
                        var10.a(0, new kk(var9_ref_kd.a(true), this.field_H.field_p - 168 + so.c(96)));
                        var9_ref_kd.a(var10, true);
                        break L54;
                      }
                      break L72;
                    }
                    if (stackIn_304_0 == stackIn_304_1) {
                      var10_intLifetime1 = (var9_ref_kc.a(true) - 168) / 168;
                      var11Lifetime2 = (var9_ref_kc.f(237239984) - 168) / 168;
                      var9_ref_kc.field_S = var7_ref_boolean____[var11Lifetime2][var10_intLifetime1];
                    } else {
                      stackIn_300_0 = var9_ref_kc;
                      stackIn_301_1 = !(param0);
                      var10_intLifetime1 = (((kc) (Object) stackIn_300_0).a(stackIn_301_1) - 24) / 168;
                      var11Lifetime2 = (var9_ref_kc.f(237239984) - 288) / 168;
                      var9_ref_kc.field_S = var6_ref_boolean____[var11Lifetime2][var10_intLifetime1];
                    }
                    var9_ref_kc = (kc) (rg.field_J.a((byte) 111));
                    continue;
                  }
                  while (true) {
                    stackIn_304_0Lifetime1 = this.field_gb.field_k;
                    stackIn_304_1Lifetime1 = 99;
                    if (stackIn_304_0Lifetime1 >= stackIn_304_1Lifetime1) {
                      break;
                    }
                    var9_ref_kdLifetime1 = this.a(216, (byte) 122, -264 + this.field_H.field_u, 144, 48 + (this.field_H.field_p + 30));
                    var10Lifetime1 = new qh();
                    var10Lifetime1.a(0, new kk(var9_ref_kdLifetime1.a(true), this.field_H.field_p - 168 + so.c(96)));
                    var9_ref_kdLifetime1.a(var10Lifetime1, true);
                    if (var17 != 0) {
                      break L54;
                    }
                  }
                  break;
                }
                if (var17 == 0) {
                  break L54;
                }
              }
              this.field_s = new int[10];
              this.field_k = 0;
              this.field_D = new int[10];
              var6 = 0;
              var7 = 0;
              boolean decompiledNaturalLoopExit0 = false;
              while (!(decompiledNaturalLoopExit0 = (!(var7 < this.field_mb.field_r)))) {
                var8Lifetime2 = this.field_H.c(var7, -34, var6) & 127;
                stackIn_320_0 = ~var8Lifetime2;
                stackIn_320_1 = -8;
                if (var17 == 0) {
                  if (stackIn_320_0 == stackIn_320_1) {
                    this.field_D[this.field_k] = (-2 + var6) * 24;
                    this.field_s[this.field_k] = var7 * 24;
                    this.field_k = this.field_k + 1;
                    this.field_H.field_A.field_f[var7][var6] = eg.a(-128, this.field_H.field_A.field_f[var7][var6]);
                  }
                  var7++;
                  continue;
                }
                break;
              }
              if (decompiledNaturalLoopExit0) {
                stackIn_320_0 = this.field_mb.field_k;
                stackIn_320_1 = 1;
              }
              var6Lifetime2 = stackIn_320_0 - stackIn_320_1;
              var7Lifetime2 = 0;
              L85: while (true) {
                boolean decompiledFrameRemainder5 = true;
                if (this.field_mb.field_r > var7Lifetime2) {
                  var8Lifetime3 = 127 & this.field_H.c(var7Lifetime2, 89, var6Lifetime2);
                  stackIn_331_0 = -8;
                  stackIn_331_1 = ~var8Lifetime3;
                  if (var17 != 0) {
                    if (stackIn_331_0 < stackIn_331_1) {
                      var8Lifetime3 = this.field_H.c(var7Lifetime2, 109, var6Lifetime2) & 127;
                      stackIn_340_0 = ~var8Lifetime3;
                      stackIn_340_1 = -8;
                      break L85;
                    }
                    decompiledFrameRemainder5 = false;
                  }
                  else {
                    if (stackIn_331_0 == stackIn_331_1) {
                      this.field_D[this.field_k] = var6Lifetime2 * 24 + 24;
                      this.field_s[this.field_k] = 24 * var7Lifetime2;
                      this.field_k = this.field_k + 1;
                      this.field_H.field_A.field_f[var7Lifetime2][var6Lifetime2] = eg.a(this.field_H.field_A.field_f[var7Lifetime2][var6Lifetime2], -128);
                    }
                    var7Lifetime2++;
                    continue;
                  }
                }
                if (decompiledFrameRemainder5) {
                  var7Lifetime2 = 0;
                  var6Lifetime2 = 0;
                  while (true) {
                    stackIn_331_0Lifetime1 = var6Lifetime2;
                    stackIn_331_1Lifetime1 = this.field_mb.field_k;
                    if (stackIn_331_0Lifetime1 >= stackIn_331_1Lifetime1) {
                      break;
                    }
                    var8Lifetime3 = this.field_H.c(var7Lifetime2, 109, var6Lifetime2) & 127;
                    stackIn_340_0 = ~var8Lifetime3;
                    stackIn_340_1 = -8;
                    if (var17 != 0) {
                      break L85;
                    }
                    if (stackIn_340_0 == stackIn_340_1) {
                      this.field_D[this.field_k] = 24 * var6Lifetime2 - 12;
                      this.field_s[this.field_k] = 24 * var7Lifetime2 - 48;
                      this.field_k = this.field_k + 1;
                      this.field_H.field_A.field_f[var7Lifetime2][var6Lifetime2] = eg.a(-128, this.field_H.field_A.field_f[var7Lifetime2][var6Lifetime2]);
                    }
                    var6Lifetime2++;
                  }
                }
                stackIn_340_0 = this.field_mb.field_r;
                stackIn_340_1 = 1;
                break;
              }
              var7Lifetime3 = stackIn_340_0 - stackIn_340_1;
              var6Lifetime3 = 0;
              while (var6Lifetime3 < this.field_mb.field_k) {
                var8Lifetime4 = 127 & this.field_H.c(var7Lifetime3, -63, var6Lifetime3);
                stackIn_351_0 = var8Lifetime4;
                stackIn_351_1 = 7;
                if (var17 != 0) {
                  if (stackIn_351_0 < stackIn_351_1) {
                    stackIn_371_0 = 0;
                    decompiledFrameCompleted3 = false;
                    break;
                  }
                  decompiledFrameCompleted2 = false;
                  break;
                }
                if (stackIn_351_0 == stackIn_351_1) {
                  this.field_D[this.field_k] = (var6Lifetime3 - 1) * 24;
                  this.field_s[this.field_k] = 24 + var7Lifetime3 * 24;
                  this.field_k = this.field_k + 1;
                  this.field_H.field_A.field_f[var7Lifetime3][var6Lifetime3] = eg.a(this.field_H.field_A.field_f[var7Lifetime3][var6Lifetime3], -128);
                }
                var6Lifetime3++;
              }
              if ((decompiledFrameCompleted3) &&
                (decompiledFrameCompleted2)) {
                this.field_H.field_A.a(0);
                var7Lifetime4 = 0;
                while (true) {
                  stackIn_351_0Lifetime1 = var7Lifetime4;
                  stackIn_351_1Lifetime1 = this.field_mb.field_r;
                  if (stackIn_351_0Lifetime1 >= stackIn_351_1Lifetime1) {
                    break;
                  }
                  stackIn_371_0 = 0;
                  if (var17 != 0) {
                    decompiledFrameCompleted1 = false;
                    break;
                  }
                  var6Lifetime4 = stackIn_371_0;
                  while (var6Lifetime4 < this.field_mb.field_k) {
                    var8Lifetime5 = 127 & this.field_H.field_A.field_h[var7Lifetime4][var6Lifetime4];
                    stackIn_351_0Lifetime1Lifetime1 = var8Lifetime5;
                    stackIn_351_1Lifetime1Lifetime1 = 14;
                    if (stackIn_351_0Lifetime1Lifetime1 == stackIn_351_1Lifetime1Lifetime1 ||
                      var8Lifetime5 == 10 ||
                      2 == var8Lifetime5) {
                      this.field_H.field_A.field_h[var7Lifetime4][var6Lifetime4] = eg.a(this.field_H.field_A.field_h[var7Lifetime4][var6Lifetime4], -128);
                    }
                    var6Lifetime4++;
                  }
                  var7Lifetime4++;
                }
              }
            }
          }
          if ((decompiledFrameCompleted3) &&
            (decompiledFrameCompleted1)) {
            stackIn_371_0 = ~this.field_mb.field_a;
          }
          boolean decompiledFrameCompleted0 = true;
          if (stackIn_371_0 == -9) {
            var6Lifetime1 = 0;
            while (true) {
              stackIn_374_0 = this.field_mb.field_r;
              stackIn_374_1 = var6Lifetime1;
              if (stackIn_374_0 <= stackIn_374_1) {
                break;
              }
              stackIn_415_0 = 0;
              if (var17 != 0) {
                decompiledFrameCompleted0 = false;
                break;
              }
              var7Lifetime1 = stackIn_415_0;
              while (true) {
                stackIn_378_0 = this.field_mb.field_k;
                stackIn_378_1 = var7Lifetime1;
                if (stackIn_378_0 > stackIn_378_1) {
                  var8Lifetime1 = this.field_H.field_A.field_h[var6Lifetime1][var7Lifetime1];
                  var9Lifetime1 = 127 & var8Lifetime1;
                  stackIn_374_0Lifetime1 = ~var9Lifetime1;
                  stackIn_374_1Lifetime1 = -61;
                  if (stackIn_374_0Lifetime1 <= stackIn_374_1Lifetime1) {
                    var10_array = new int[8];
                    var10_array[0] = eg.a(this.field_H.field_A.field_h[-1 + var6Lifetime1][var7Lifetime1 - 1], 127);
                    var10_array[1] = eg.a(this.field_H.field_A.field_h[0 + var6Lifetime1][var7Lifetime1 - 1], 127);
                    var10_array[2] = eg.a(127, this.field_H.field_A.field_h[var6Lifetime1 + 1][-1 + var7Lifetime1]);
                    var10_array[3] = eg.a(127, this.field_H.field_A.field_h[-1 + var6Lifetime1][0 + var7Lifetime1]);
                    var10_array[4] = eg.a(127, this.field_H.field_A.field_h[var6Lifetime1 + 1][0 + var7Lifetime1]);
                    var10_array[5] = eg.a(127, this.field_H.field_A.field_h[var6Lifetime1 - 1][1 + var7Lifetime1]);
                    var10_array[6] = eg.a(this.field_H.field_A.field_h[0 + var6Lifetime1][1 + var7Lifetime1], 127);
                    var10_array[7] = eg.a(this.field_H.field_A.field_h[1 + var6Lifetime1][var7Lifetime1 + 1], 127);
                    var11Lifetime1 = 1;
                    while (true) {
                      if (var11Lifetime1 != 0) {
                        var11Lifetime1 = 0;
                        stackIn_393_0 = 0;
                        var12Lifetime1 = stackIn_393_0;
                        while (var10_array.length - 1 > var12Lifetime1) {
                          stackIn_378_0 = var10_array[var12Lifetime1];
                          stackIn_378_1 = var10_array[1 + var12Lifetime1];
                          if (stackIn_378_0 > stackIn_378_1) {
                            var10_array[1 + var12Lifetime1] = rd.b(var10_array[1 + var12Lifetime1], var10_array[var12Lifetime1]);
                            var10_array[var12Lifetime1] = rd.b(var10_array[var12Lifetime1], var10_array[1 + var12Lifetime1]);
                            var10_array[1 + var12Lifetime1] = rd.b(var10_array[1 + var12Lifetime1], var10_array[var12Lifetime1]);
                            var11Lifetime1 = 1;
                          }
                          var12Lifetime1++;
                        }
                        continue;
                      }
                      break;
                    }
                    stackIn_393_0Lifetime1 = 0;
                    var12Lifetime1Lifetime1 = stackIn_393_0Lifetime1;
                    var13Lifetime1 = 1;
                    var14 = var10_array[0];
                    var15 = 0;
                    var16 = 0;
                    while (var16 <= var10_array.length) {
                      stackIn_378_0 = ~var16;
                      stackIn_378_1 = ~var10_array.length;
                      if (stackIn_378_0 > stackIn_378_1 &&
                        ~var14 == ~var10_array[var16]) {
                        var15++;
                      } else {
                        if (var13Lifetime1 < var15) {
                          var12Lifetime1Lifetime1 = var14;
                          var13Lifetime1 = var15;
                        }
                        if (var10_array.length > var16) {
                          var14 = var10_array[var16];
                        }
                        var15 = 1;
                      }
                      var16++;
                    }
                    var16Lifetime1 = var12Lifetime1Lifetime1;
                    this.field_H.field_A.field_h[var6Lifetime1][var7Lifetime1] = hi.a(eg.a(-128, var8Lifetime1), var16Lifetime1);
                  }
                  var7Lifetime1++;
                  continue;
                }
                break;
              }
              var6Lifetime1++;
            }
          }
          if (decompiledFrameCompleted0) {
            el.field_g = this.field_H.field_A.field_o;
            this.field_ib = -1;
            ql.field_j = -1.0f;
            ek.field_I = this.field_H.field_A.field_c;
            this.field_gb.c(this.field_G, 0);
            stackIn_415_0 = 120;
          }
          ha.$cfr$intArgs$a$6121ff5511c4(stackIn_415_0);
          this.c(9091);
          this.field_X = true;
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2 = decompiledCaughtException;
          throw sh.a((Throwable) ((Object) var2), "hi.PA(" + param0 + ')');
        }
    }

    public static void f(boolean param0) {
        RuntimeException decompiledCaughtException = null;
        RuntimeException var1 = null;
        try {
          field_Y = null;
          field_x = null;
          if (!param0) {
            field_Y = (String) null;
          }
          field_O = null;
          field_pb = null;
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var1 = decompiledCaughtException;
          throw sh.a((Throwable) ((Object) var1), "hi.G(" + param0 + ')');
        }
    }

    final boolean g(boolean param0) {
        RuntimeException var2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          if (null != this.field_H &&
            null != this.field_H.field_A) {
            if (this.field_q == 3 &&
              this.field_h == -1) {
              return false;
            }
            if (!param0) {
              return true;
            }
            if (7 == this.field_q &&
              this.field_h == -1) {
              return false;
            }
            if (this.field_h == 5) {
              this.a(this.a(this.field_q, (byte) 101, -1), (byte) -99);
              return true;
            }
            if (this.field_h != -1) {
              this.a(this.a(this.field_q, (byte) 62, this.field_h + 1), (byte) -99);
              return true;
            }
            this.a(this.a(this.field_q + 1, (byte) 54, 0), (byte) -99);
            return true;
          }
          this.a(this.a(0, (byte) -124, 0), (byte) -99);
          return true;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2 = decompiledCaughtException;
          throw sh.a((Throwable) ((Object) var2), "hi.FA(" + param0 + ')');
        }
    }

    private final void a(kd param0, byte param1) {
        RuntimeException stackIn_14_0 = null;
        StringBuilder stackIn_14_1 = null;
        String stackIn_15_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var3 = null;
        try {
          if (!param0.i((byte) -126)) {
            return;
          }
          if (!bo.field_p[81]) {
            this.c((byte) 25);
          }
          param0.r(param1 - 31338);
          if (param1 != -2) {
            this.c(-111, -8, -118);
          }
          this.field_W.a(param0, (byte) -105);
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3 = decompiledCaughtException;
          stackIn_14_0 = var3;
          stackIn_14_1 = new StringBuilder().append("hi.TA(");
          if (param0 == null) {
            stackIn_15_2 = "null";
          } else {
            stackIn_15_2 = "{...}";
          }
          throw sh.a((Throwable) ((Object) stackIn_14_0), ((StringBuilder) (Object) stackIn_14_1).append(stackIn_15_2).append(',').append(param1).append(')').toString());
        }
    }

    private final void e(byte param0) {
        boolean stackIn_38_0 = false;
        boolean stackIn_48_1 = false;
        int stackIn_96_0 = 0;
        int stackIn_97_1 = 0;
        boolean stackIn_118_0 = false;
        int stackIn_126_0 = 0;
        RuntimeException decompiledCaughtException = null;
        boolean stackOut_37_0;
        boolean stackOut_117_0;
        fb var2 = null;
        int var2_int = 0;
        RuntimeException var2_ref = null;
        int var3 = 0;
        fb var4 = null;
        kd var5 = null;
        int var6 = 0;
        int var2_intLifetime1;
        var6 = ZombieDawn.field_J;
        try {
          if (bo.field_i) {
            return;
          }
          boolean decompiledFrameCompleted1 = true;
          boolean decompiledFrameCompleted0 = true;
          boolean decompiledFrameRemainder1 = true;
          this.field_C = this.field_C - this.field_Z * ha.field_b;
          this.field_c = this.field_c - ha.field_b;
          if ((this.field_ib == -1) &&
            (decompiledFrameRemainder1 = (ci.field_d == 1 ||
            bo.field_p[83]))) {
            this.field_ib = 0;
            ck.a(-1, 6836);
            this.field_S.c(-106);
            this.field_N = 0;
            decompiledFrameRemainder1 = (var6 != 0);
          }
          if ((decompiledFrameRemainder1) &&
            (this.field_ib == 0)) {
            if (ci.field_d == 1 ||
              2 == ci.field_d) {
              if (ci.field_d == 2 &&
                this.field_M &&
                this.field_p &&
                this.field_w) {
                var2 = (fb) (this.field_R.b((byte) 26));
                while (null != var2) {
                  stackOut_37_0 = var2 instanceof kd;
                  stackIn_126_0 = stackOut_37_0 ? 1 : 0;
                  stackIn_38_0 = stackOut_37_0;
                  if (var6 != 0) {
                    decompiledFrameCompleted1 = false;
                    break;
                  }
                  if (stackIn_38_0) {
                    ((kd) (var2)).field_qb = false;
                  }
                  var2 = (fb) (this.field_R.a(false));
                }
              }
              if (decompiledFrameCompleted1) {
                this.field_M = true;
                this.field_B = ha.field_b;
                stackIn_48_1 = (ci.field_d == 1);
                this.field_w = stackIn_48_1;
                this.field_j = ei.field_K;
                this.field_p = false;
                decompiledFrameRemainder1 = (var6 != 0);
              }
            }
            if ((decompiledFrameRemainder1) &&
              (decompiledFrameCompleted1)) {
              if ((!this.field_M ||
                kc.field_R != 1 &&
                kc.field_R != 2) &&
                (decompiledFrameRemainder1 = (this.field_M))) {
                boolean decompiledFrameRemainder0 = true;
                boolean decompiledSharedTail0 = (this.field_p);
                if (!decompiledSharedTail0) {
                  if (this.field_w) {
                    this.a(96, ha.field_b, ei.field_K);
                    decompiledFrameRemainder0 = (var6 != 0);
                  }
                  if (decompiledFrameRemainder0) {
                    this.d(ha.field_b, ei.field_K, 31098);
                    decompiledSharedTail0 = (var6 != 0);
                  }
                }
                if ((decompiledFrameRemainder0) &&
                  (decompiledSharedTail0) &&
                  (this.field_w)) {
                  if (!bo.field_p[81] &&
                    !bo.field_p[82]) {
                    this.c((byte) 112);
                  }
                  this.a(this.field_S.b(ei.field_K, true), this.field_S.a(this.field_B, false), this.field_S.b(this.field_j, true), 47, this.field_S.a(ha.field_b, false));
                  if (this.field_W.a(false) > 0) {
                    ck.a(-3, 6836);
                  }
                }
                this.field_p = false;
                this.field_M = false;
                decompiledFrameRemainder1 = (var6 != 0);
              }
              if (decompiledFrameRemainder1) {
                var2_int = ha.field_b - this.field_B;
                var3 = ei.field_K - this.field_j;
                if (!this.field_p) {
                  stackIn_96_0 = Math.abs(var2_int) + Math.abs(var3);
                  if (!this.field_w) {
                    stackIn_97_1 = 5;
                  } else {
                    stackIn_97_1 = 20;
                  }
                  if (stackIn_96_0 > stackIn_97_1) {
                    this.field_p = true;
                  }
                }
                if (this.field_p) {
                  if (!this.field_w) {
                    this.field_S.a((byte) -123, var2_int, var3);
                    this.field_B = ha.field_b;
                    this.field_j = ei.field_K;
                    decompiledFrameRemainder1 = (var6 != 0);
                  }
                  if (decompiledFrameRemainder1) {
                    this.field_Q.d((byte) -83);
                    if (!bo.field_p[81] &&
                      !bo.field_p[82]) {
                      this.c((byte) -112);
                    }
                    var4 = (fb) (this.field_R.b((byte) 26));
                    while (var4 != null) {
                      stackOut_117_0 = var4 instanceof kd;
                      stackIn_126_0 = stackOut_117_0 ? 1 : 0;
                      stackIn_118_0 = stackOut_117_0;
                      if (var6 != 0) {
                        decompiledFrameCompleted0 = false;
                        break;
                      }
                      if (stackIn_118_0) {
                        var5 = (kd) (var4);
                        if (var5.i((byte) -126)) {
                          var5.field_qb = var5.a(this.field_S.a(this.field_B, false), this.field_S.a(ha.field_b, false), this.field_S.b(this.field_j, true), this.field_S.b(ei.field_K, true), false);
                        }
                      }
                      var4 = (fb) (this.field_R.a(false));
                    }
                  }
                }
              }
            }
          }
          if ((decompiledFrameCompleted1) &&
            (decompiledFrameCompleted0)) {
            stackIn_126_0 = -94 / ((-47 - param0) / 55);
          }
          var2_intLifetime1 = stackIn_126_0;
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2_ref = decompiledCaughtException;
          throw sh.a((Throwable) ((Object) var2_ref), "hi.V(" + param0 + ')');
        }
    }

    final void b(boolean param0) {
        boolean stackIn_4_0 = false;
        ej stackIn_10_0 = null;
        boolean stackIn_11_1 = false;
        g stackIn_17_0 = null;
        int stackIn_18_1 = 0;
        vo stackIn_22_0 = null;
        boolean stackIn_23_1 = false;
        int stackIn_25_0 = 0;
        RuntimeException decompiledCaughtException = null;
        boolean stackOut_3_0;
        fb var2 = null;
        RuntimeException var2_ref = null;
        g var3 = null;
        int var4 = 0;
        var4 = ZombieDawn.field_J;
        try {
          dj.field_e.field_H.a(param0, -106);
          var2 = (fb) (this.field_R.b((byte) 26));
          boolean decompiledNaturalLoopExit0 = false;
          while (!(decompiledNaturalLoopExit0 = (null == var2))) {
            stackOut_3_0 = var2 instanceof g;
            stackIn_25_0 = stackOut_3_0 ? 1 : 0;
            stackIn_4_0 = stackOut_3_0;
            if (var4 == 0) {
              if (stackIn_4_0) {
                var3 = (g) (var2);
                stackIn_10_0 = this.field_H;
                stackIn_11_1 = !(param0);
                if (!((ej) (Object) stackIn_10_0).a(stackIn_11_1, var3.f(237239984), var3.a(true), false)) {
                  stackIn_17_0 = var3;
                  if (var3 instanceof ah) {
                    stackIn_18_1 = 0;
                  } else {
                    stackIn_18_1 = 4;
                  }
                  ((g) (Object) stackIn_17_0).e(stackIn_18_1, -6904);
                }
              }
              stackIn_22_0 = this.field_R;
              stackIn_23_1 = !(param0);
              var2 = (fb) (((vo) (Object) stackIn_22_0).a(stackIn_23_1));
              continue;
            }
            break;
          }
          if (decompiledNaturalLoopExit0) {
            stackIn_25_0 = 6;
          }
          if (stackIn_25_0 != this.field_q ||
            this.field_h != 0) {
            if (this.field_q != 7) {
              return;
            }
            if (this.field_h != 0) {
              return;
            }
            if (!this.field_H.a(false, 1056, 972, false)) {
              return;
            }
            this.a(232, 23, (byte) -23);
            if (var4 == 0) {
              return;
            }
          }
          if (0 == this.field_u[1] &&
            this.field_gb.j(-95) <= 120) {
            this.a(236, 19, (byte) -23);
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2_ref = decompiledCaughtException;
          throw sh.a((Throwable) ((Object) var2_ref), "hi.E(" + param0 + ')');
        }
    }

    final void a(boolean param0, fb param1) {
        RuntimeException runtimeException = null;
        RuntimeException stackIn_7_0 = null;
        StringBuilder stackIn_7_1 = null;
        String stackIn_8_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          if (param0) {
            return;
          }
          this.field_n.a(param1.field_u, -1, param1, param1.field_B);
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          runtimeException = decompiledCaughtException;
          stackIn_7_0 = runtimeException;
          stackIn_7_1 = new StringBuilder().append("hi.H(").append(param0).append(',');
          if (param1 == null) {
            stackIn_8_2 = "null";
          } else {
            stackIn_8_2 = "{...}";
          }
          throw sh.a((Throwable) ((Object) stackIn_7_0), ((StringBuilder) (Object) stackIn_7_1).append(stackIn_8_2).append(')').toString());
        }
    }

    final boolean b(int param0, int param1, boolean param2, int param3) {
        RuntimeException var5 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          this.field_m.a(0, new ck(param3, param1, param0));
          if (!param2) {
            this.field_W = (ra) null;
          }
          return true;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var5 = decompiledCaughtException;
          throw sh.a((Throwable) ((Object) var5), "hi.U(" + param0 + ',' + param1 + ',' + param2 + ',' + param3 + ')');
        }
    }

    final void c(boolean param0) {
        int var2_int = 0;
        int var3 = 0;
        int var4 = 0;
        int stackIn_11_0 = 0;
        int stackIn_12_1 = 0;
        int stackIn_23_0 = 0;
        int stackIn_27_0 = 0;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var2 = null;
        try {
          if (!param0) {
            this.field_p = false;
          }
          if (!po.w(13296) &&
            !this.field_F) {
            stackIn_11_0 = 7 * this.field_q;
            if (this.field_h == -1) {
              stackIn_12_1 = 6;
            } else {
              stackIn_12_1 = this.field_h;
            }
            var2_int = stackIn_11_0 + stackIn_12_1;
            if (vi.field_a) {
              var2_int += 10000;
            }
            if (this.field_h != -1 &&
              !this.field_gb.b(true)) {
              stackIn_23_0 = 0;
            } else {
              stackIn_23_0 = 1;
            }
            var3 = stackIn_23_0;
            stackIn_27_0 = (var3 != 0) ? 1 : 0;
            var4 = stackIn_27_0;
            ql.a(this.field_gb.j(-106), 16, var4, var2_int);
            return;
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2 = decompiledCaughtException;
          throw sh.a((Throwable) ((Object) var2), "hi.VA(" + param0 + ')');
        }
    }

    final void d(boolean param0) {
        RuntimeException decompiledCaughtException = null;
        RuntimeException var2 = null;
        try {
          if (this.field_G > 0 &&
            !this.field_F &&
            null == wi.field_b) {
            wi.field_b = nd.a(this.field_I, this.field_K, this.field_bb + 42, new int[]{this.field_G}, 1159192543, 3, this.field_ab, this.field_g, this.field_bb + 42 ^ 65535);
          }
          qm.field_b = this.field_bb;
          if (param0) {
            this.field_n = (mj) null;
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2 = decompiledCaughtException;
          throw sh.a((Throwable) ((Object) var2), "hi.LA(" + param0 + ')');
        }
    }

    hi(int param0, int param1) {
        RuntimeException runtimeException = null;
        int[] var3 = null;
        int[] var4 = null;
        int var5 = 0;
        int var6 = 0;
        int stackIn_3_1 = 0;
        int stackIn_4_2 = 0;
        boolean stackIn_14_1 = false;
        RuntimeException decompiledCaughtException = null;
        var6 = ZombieDawn.field_J;
        this.field_eb = 0;
        this.field_c = 50340864;
        this.field_C = -604090368;
        this.field_F = false;
        this.field_Z = -12;
        this.field_ob = new vo();
        this.field_r = 0;
        this.field_P = 0;
        this.field_nb = 0;
        this.field_G = 0;
        this.field_hb = 0;
        this.field_z = 0;
        this.field_b = new qj();
        this.field_j = -1;
        this.field_B = -1;
        this.field_q = 0;
        this.field_p = false;
        this.field_o = 0;
        this.field_w = true;
        this.field_u = new int[3];
        this.field_U = 0;
        this.field_h = 0;
        this.field_X = false;
        this.field_kb = null;
        this.field_M = false;
        this.field_bb = 0;
        this.field_J = new int[3];
        this.field_cb = 0;
        this.field_l = 0;
        this.field_E = 0;
        this.field_a = null;
        try {
          dj.field_e = this;
          this.field_I = 47646;
          this.field_K = 15731621;
          stackIn_3_1 = param0 * 7;
          if (-1 != param1) {
            stackIn_4_2 = param1;
          } else {
            stackIn_4_2 = 6;
          }
          this.field_y = stackIn_3_1 + stackIn_4_2;
          this.field_g = 45364;
          this.field_ab = 799342592 + this.field_g;
          var3 = kg.field_g;
          var4 = var3;
          var5 = 0;
          while (var5 < 8) {
            var4[var5] = 0;
            var5++;
            if (var6 != 0) {
              return;
            }
          }
          stackIn_14_1 = !(lo.field_j < 2);
          this.field_A = stackIn_14_1;
          eh.field_y = 3;
          this.a(this.a(param0, (byte) -106, param1), (byte) -99);
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          runtimeException = decompiledCaughtException;
          throw sh.a((Throwable) ((Object) runtimeException), "hi.<init>(" + param0 + ',' + param1 + ')');
        }
    }

    static {
        field_pb = "Type your email address again to make sure it's correct";
        field_Y = "Please log in as a subscribing member to access this feature.";
    }
}
