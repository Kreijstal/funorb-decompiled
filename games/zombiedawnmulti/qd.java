/*
 * Decompiled by CFR-JS 0.4.0.
 */
import java.util.*;

final class qd {
    static int field_N;
    static String field_K;
    static String field_v;
    static int field_e;
    static ja field_s;
    static String field_r;
    static String field_E;
    static String field_V;
    private th field_hb;
    private boolean field_ab;
    static boolean field_bb;
    private int field_h;
    private int field_Z;
    private int field_R;
    fh field_u;
    ko field_I;
    private qe field_G;
    int field_j;
    private uf field_J;
    nm field_k;
    int field_Y;
    private int field_p;
    private long field_a;
    int field_M;
    private th field_X;
    private th field_kb;
    private th field_cb;
    private int field_q;
    private th field_O;
    private ja field_L;
    lq field_Q;
    private gm field_x;
    private boolean field_lb;
    private int field_d;
    private boolean field_db;
    private wb field_mb;
    private int field_F;
    private ja field_y;
    th field_H;
    private ea field_S;
    private int field_fb;
    private th field_T;
    private lq field_c;
    private ja field_B;
    private th field_C;
    private boolean field_eb;
    private boolean field_w;
    private boolean field_f;
    private int field_n;
    private h field_o;
    private int field_l;
    private int field_ib;
    private boolean field_z;
    private int field_gb;
    private float field_D;
    private int field_A;
    private int field_jb;
    private int field_m;
    private int field_U;
    private jj field_b;
    long field_t;
    int field_W;
    private int field_g;
    private int[] field_i;

    private final void e(int param0) {
        boolean stackIn_78_0 = false;
        boolean stackIn_84_0 = false;
        int stackIn_86_0 = 0;
        int stackIn_86_1 = 0;
        boolean stackIn_110_0 = false;
        boolean stackIn_126_1 = false;
        int stackIn_142_0 = 0;
        int stackIn_143_1 = 0;
        boolean stackIn_176_0 = false;
        int stackIn_232_0 = 0;
        RuntimeException decompiledCaughtException = null;
        boolean stackOut_109_0;
        boolean stackOut_175_0;
        int var2_int = 0;
        RuntimeException var2 = null;
        float var3_float = 0.0f;
        int var3 = 0;
        id var3_ref_id = null;
        int var4 = 0;
        h var5 = null;
        id var5_ref = null;
        int var6_int = 0;
        wb var6 = null;
        int var7 = 0;
        int var8 = 0;
        int var9 = 0;
        int var10 = 0;
        wb var6Lifetime1;
        int var3Lifetime1;
        int var3Lifetime2;
        int var4Lifetime1;
        int var6_intLifetime1;
        int var7Lifetime1;
        int var7Lifetime2;
        int var8Lifetime1;
        int var8Lifetime2;
        var10 = ZombieDawnMulti.field_E ? 1 : 0;
        try {
          var2_int = 0;
          if (!this.field_z) {
            var2_int = t.field_d;
          }
          if (!iq.field_f ||
            !sq.field_N ||
            !re.field_b) {
            if (lc.field_m[26] ||
              lc.field_m[88]) {
              var2_int++;
            }
            if (lc.field_m[27] ||
              lc.field_m[87]) {
              var2_int--;
            }
          }
          bk.field_g = false;
          if (0 != var2_int) {
            var3_float = (1.0f + (float)var2_int * 0.03999999910593033f) * this.field_k.field_d;
            if (var3_float > 2.0f) {
              var3_float = 2.0f;
            }
            if (1.0f > var3_float) {
              var3_float = 1.0f;
            }
            if (var3_float != this.field_k.field_d &&
              (float)this.field_u.field_r >= 640.0f * var3_float &&
              var3_float * 480.0f <= (float)this.field_u.field_c) {
              this.field_k.field_d = var3_float;
            }
          }
          boolean decompiledFrameCompleted2 = true;
          if (this.c((byte) 124) &&
            !gf.field_h) {
            var3 = this.field_k.a(bd.field_g, 2);
            var4 = this.field_k.a(true, bo.field_d);
            bk.field_g = true;
            var5 = (h) (this.field_c.c((byte) 97));
            while (true) {
              boolean decompiledFrameRemainder3 = true;
              if (null != var5) {
                stackIn_86_0 = ~var5.field_I;
                stackIn_86_1 = ~this.field_M;
                if (var10 != 0) {
                  decompiledFrameCompleted2 = false;
                  break;
                }
                if (stackIn_86_0 != stackIn_86_1) {
                  var6_int = var5.g(-73) - var3;
                  var7 = var5.h(126) - var4;
                  var8 = 350;
                  if (var7 * var7 + var6_int * var6_int < var8 * var8) {
                    bk.field_g = false;
                    decompiledFrameRemainder3 = false;
                  }
                }
                if (decompiledFrameRemainder3) {
                  var5 = (h) (this.field_c.b((byte) 102));
                  continue;
                }
              }
              if (!bk.field_g) {
                break;
              }
              bk.field_g = false;
              var5_ref = (id) (this.field_H.c(112));
              L15: while (true) {
                boolean decompiledFrameRemainder2 = true;
                if (var5_ref != null) {
                  stackIn_78_0 = var5_ref instanceof wb;
                  if (var10 != 0) {
                    break L15;
                  }
                  if (stackIn_78_0) {
                    var6 = (wb) (var5_ref);
                    if (var6.i((byte) -43)) {
                      var7Lifetime1 = var6.g(88) - var3;
                      var8Lifetime1 = -var4 + var6.h(120);
                      var9 = var6.l(-113);
                      if (var7Lifetime1 * var7Lifetime1 + var8Lifetime1 * var8Lifetime1 < var9 * var9) {
                        bk.field_g = true;
                        decompiledFrameRemainder2 = false;
                      }
                    }
                  }
                  if (decompiledFrameRemainder2) {
                    var5_ref = (id) (this.field_H.b(6));
                    continue;
                  }
                }
                stackIn_78_0 = bk.field_g;
                break;
              }
              if (stackIn_78_0) {
                break;
              }
              var5 = this.field_o;
              var6_intLifetime1 = -var3 + var5.g(88);
              var7Lifetime2 = -var4 + var5.h(123);
              var8Lifetime2 = 350;
              stackIn_84_0 = !((var8Lifetime2 * var8Lifetime2) <= (var6_intLifetime1 * var6_intLifetime1 + var7Lifetime2 * var7Lifetime2));
              bk.field_g = stackIn_84_0;
              break;
            }
          }
          if (decompiledFrameCompleted2) {
            stackIn_86_0 = kd.field_b;
            stackIn_86_1 = 1;
          }
          boolean decompiledFrameCompleted1 = true;
          boolean decompiledFrameCompleted0 = true;
          boolean decompiledFrameRemainder1 = true;
          if ((stackIn_86_0 == stackIn_86_1 ||
            kd.field_b == 2) &&
            (decompiledFrameRemainder1 = !(this.field_z))) {
            if (kd.field_b == 2 &&
              this.field_db &&
              this.field_eb &&
              this.field_w) {
              var3_ref_id = (id) (this.field_H.c(83));
              while (null != var3_ref_id) {
                stackOut_109_0 = var3_ref_id instanceof wb;
                stackIn_232_0 = stackOut_109_0 ? 1 : 0;
                stackIn_110_0 = stackOut_109_0;
                if (var10 != 0) {
                  decompiledFrameCompleted1 = false;
                  break;
                }
                if (stackIn_110_0 && (((wb) (var3_ref_id)).field_Lb == this.field_M ||
                  var10 != 0)) {
                  ((wb) (var3_ref_id)).field_eb = false;
                }
                var3_ref_id = (id) (this.field_H.b(6));
              }
            }
            if (decompiledFrameCompleted1) {
              this.field_eb = false;
              stackIn_126_1 = (1 == kd.field_b);
              this.field_w = stackIn_126_1;
              this.field_p = bo.field_d;
              this.field_F = bd.field_g;
              this.field_db = true;
              decompiledFrameRemainder1 = (var10 != 0);
            }
          }
          if ((decompiledFrameRemainder1) &&
            (decompiledFrameCompleted1)) {
            if (this.field_db && (pq.field_f == 1 ||
              pq.field_f == 2)) {
              var3Lifetime1 = bd.field_g - this.field_F;
              var4Lifetime1 = -this.field_p + bo.field_d;
              if (!this.field_eb) {
                stackIn_142_0 = ~(Math.abs(var3Lifetime1) + Math.abs(var4Lifetime1));
                if (this.field_w) {
                  stackIn_143_1 = 20;
                } else {
                  stackIn_143_1 = 5;
                }
                if (stackIn_142_0 < ~stackIn_143_1) {
                  if (this.c((byte) 106) &&
                    this.field_w &&
                    !gf.field_h) {
                    this.field_I.h(1);
                    if (!lc.field_m[81] &&
                      !lc.field_m[82]) {
                      this.b(-57);
                    }
                  }
                  this.field_eb = true;
                }
              }
              if (this.field_eb) {
                if (this.c((byte) 101) &&
                  this.field_w &&
                  !gf.field_h) {
                  var5_ref = (id) (this.field_H.c(69));
                  while (var5_ref != null) {
                    stackOut_175_0 = var5_ref instanceof wb;
                    stackIn_232_0 = stackOut_175_0 ? 1 : 0;
                    stackIn_176_0 = stackOut_175_0;
                    if (var10 != 0) {
                      decompiledFrameCompleted0 = false;
                      break;
                    }
                    if (stackIn_176_0) {
                      var6Lifetime1 = (wb) (var5_ref);
                      if (this.field_M == var6Lifetime1.field_Lb ||
                        var10 != 0) {
                        var6Lifetime1.field_eb = var6Lifetime1.a(this.field_k.a(bd.field_g, 2), this.field_k.a(true, this.field_p), this.field_k.a(true, bo.field_d), 48, this.field_k.a(this.field_F, 2));
                      }
                    }
                    var5_ref = (id) (this.field_H.b(6));
                  }
                  if ((decompiledFrameCompleted0) &&
                    (var10 != 0)) {
                    if (-1 == this.field_q) {
                      this.field_q = this.field_F;
                    }
                    this.field_k.a(var3Lifetime1, var4Lifetime1, 25992);
                    this.field_p = bo.field_d;
                    this.field_F = bd.field_g;
                  }
                } else {
                  if (-1 == this.field_q) {
                    this.field_q = this.field_F;
                  }
                  this.field_k.a(var3Lifetime1, var4Lifetime1, 25992);
                  this.field_p = bo.field_d;
                  this.field_F = bd.field_g;
                }
              }
              if (decompiledFrameCompleted0) {
                decompiledFrameRemainder1 = (var10 != 0);
              }
            }
            if ((decompiledFrameRemainder1) &&
              (decompiledFrameCompleted0) &&
              (this.field_db)) {
              boolean decompiledFrameRemainder0 = true;
              if (this.c((byte) 113)) {
                if ((this.field_eb) &&
                  (decompiledFrameRemainder0 = (this.field_w))) {
                  if (!lc.field_m[81] &&
                    !lc.field_m[82]) {
                    this.b(-75);
                  }
                  this.a(this.field_k.a(this.field_F, 2), this.field_k.a(true, this.field_p), this.field_k.a(true, bo.field_d), this.field_k.a(bd.field_g, 2), (byte) 5);
                  decompiledFrameRemainder0 = !(this.field_Q.a((byte) 98) <= 0);
                  if (decompiledFrameRemainder0) {
                    iq.a(-3, (byte) 99);
                    decompiledFrameRemainder0 = (var10 != 0);
                  }
                }
                if ((decompiledFrameRemainder0) &&
                  (!gf.field_h)) {
                  if (!this.field_w) {
                    this.a(true, bo.field_d, bd.field_g);
                    if (var10 != 0) {
                      this.a(bo.field_d, (byte) -112, bd.field_g);
                    }
                  } else {
                    this.a(bo.field_d, (byte) -112, bd.field_g);
                  }
                }
              }
              this.field_eb = false;
              this.field_db = false;
            }
          }
          if ((decompiledFrameCompleted1) &&
            (decompiledFrameCompleted0)) {
            stackIn_232_0 = ~pq.field_f;
          }
          if (stackIn_232_0 != -3) {
            this.field_q = -1;
          }
          var3Lifetime2 = -105 % ((-52 - param0) / 52);
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2 = decompiledCaughtException;
          throw fa.a((Throwable) ((Object) var2), "qd.VA(" + param0 + ')');
        }
    }

    final void a(int param0, int param1, int param2, int param3, int param4, boolean param5, int param6) {
        Throwable decompiledCaughtException = null;
        wb var8 = null;
        Exception var8_ref = null;
        RuntimeException var8_ref2 = null;
        wb var9 = null;
        try {
          try {
            var8 = op.field_m.a(param3, false);
            var9 = op.field_m.a(param1, false);
            if (null != var8 &&
              null != var9) {
              var8.field_V = param4 << 16;
              var8.field_L = param2 << 16;
              var9.field_L = param6 << 16;
              var9.field_V = param0 << 16;
              var8.a(param5, var9);
              return;
            }
            return;
          } catch (java.lang.Exception decompiledCaughtParameter0) {
            decompiledCaughtException = decompiledCaughtParameter0;
            var8_ref = (Exception) (Object) decompiledCaughtException;
            return;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter1) {
          decompiledCaughtException = decompiledCaughtParameter1;
          var8_ref2 = (RuntimeException) (Object) decompiledCaughtException;
          throw fa.a((Throwable) ((Object) var8_ref2), "qd.R(" + param0 + ',' + param1 + ',' + param2 + ',' + param3 + ',' + param4 + ',' + param5 + ',' + param6 + ')');
        }
    }

    final int a(int param0, byte param1) {
        RuntimeException var3 = null;
        int stackIn_2_0 = 0;
        int stackIn_4_0 = 0;
        RuntimeException decompiledCaughtException = null;
        try {
          if (param1 >= 107) {
            stackIn_4_0 = op.field_m.a(tg.field_e.field_f[param0], tg.field_e.field_d[param0], this.field_M, false);
            return stackIn_4_0;
          }
          stackIn_2_0 = 126;
          return stackIn_2_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3 = decompiledCaughtException;
          throw fa.a((Throwable) ((Object) var3), "qd.KA(" + param0 + ',' + param1 + ')');
        }
    }

    final void a(byte param0, boolean param1) {
        int fieldTemp$0 = 0;
        int fieldTemp$1 = 0;
        int stackIn_14_0 = 0;
        int stackIn_27_0 = 0;
        int stackIn_27_1 = 0;
        int stackIn_31_0 = 0;
        nm stackIn_84_0 = null;
        boolean stackIn_87_1 = false;
        boolean stackIn_91_2 = false;
        boolean stackIn_94_3 = false;
        boolean stackIn_101_4 = false;
        int stackIn_105_5;
        boolean stackIn_108_6 = false;
        int stackIn_164_0 = 0;
        int stackIn_164_1 = 0;
        RuntimeException decompiledCaughtException = null;
        int var3_int = 0;
        RuntimeException var3 = null;
        int var4 = 0;
        int var5 = 0;
        float var6 = 0.0f;
        int var7 = 0;
        int var8 = 0;
        long var9 = 0L;
        int var11 = 0;
        int var12 = 0;
        int var13 = 0;
        int var14 = 0;
        int var7Lifetime1;
        int var7Lifetime2;
        var14 = ZombieDawnMulti.field_E ? 1 : 0;
        try {
          var3_int = 0;
          var4 = this.field_k.field_k;
          var5 = this.field_k.field_g;
          var6 = this.field_k.field_d;
          var7 = 0;
          boolean decompiledNaturalLoopExit1 = false;
          while (!(decompiledNaturalLoopExit1 = (!(var7 < op.field_m.field_a.length)))) {
            stackIn_14_0 = op.field_m.field_a[var7];
            if (var14 == 0) {
              if (stackIn_14_0 > 0) {
                op.field_m.field_a[var7] = op.field_m.field_a[var7] - 1;
              } else {
                op.field_m.field_a[var7] = 0;
              }
              var7++;
              continue;
            }
            break;
          }
          if (decompiledNaturalLoopExit1) {
            stackIn_14_0 = 0;
          }
          var7Lifetime1 = stackIn_14_0;
          boolean decompiledNaturalLoopExit0 = false;
          while (!(decompiledNaturalLoopExit0 = (!(op.field_m.field_z.length > var7Lifetime1)))) {
            stackIn_27_0 = 0;
            stackIn_27_1 = op.field_m.field_z[var7Lifetime1];
            if (var14 == 0) {
              if (stackIn_27_0 < stackIn_27_1) {
                op.field_m.field_z[var7Lifetime1] = op.field_m.field_z[var7Lifetime1] - 1;
              } else {
                op.field_m.field_z[var7Lifetime1] = 0;
              }
              var7Lifetime1++;
              continue;
            }
            break;
          }
          if (decompiledNaturalLoopExit0) {
            stackIn_27_0 = 2;
            stackIn_27_1 = ll.field_k.field_k;
          }
          stackIn_31_0 = (stackIn_27_0 != stackIn_27_1) ? 16 : 1;
          boolean decompiledFrameRemainder0 = true;
          ke.field_b = stackIn_31_0;
          if (gf.field_h) {
            this.e(-106);
            decompiledFrameRemainder0 = (var14 != 0);
          }
          if (decompiledFrameRemainder0) {
            if (this.c((byte) 104)) {
              if (param1) {
                this.d(15);
                this.e(107);
                if ((var14 != 0) &&
                  (op.field_m.field_l == 0)) {
                  this.e(-121);
                }
              }
            } else {
              if (op.field_m.field_l == 0) {
                this.e(-121);
              }
            }
            this.field_J.a(-29987);
            if (this.field_eb) {
              this.field_I.a(-1, -1, (byte) 101);
              if (var14 != 0) {
                this.field_I.a(bo.field_d, bd.field_g, (byte) 113);
              }
            } else {
              this.field_I.a(bo.field_d, bd.field_g, (byte) 113);
            }
            var3_int = er.a(-802) ? 1 : 0;
          }
          var7Lifetime2 = this.field_k.field_k;
          var8 = this.field_k.field_g;
          if (!this.field_k.field_f &&
            !this.field_f) {
            this.field_k.a(this.field_h, (byte) -86, this.field_R);
            this.field_f = true;
          }
          if (param0 <= 113) {
            return;
          }
          if (param1) {
            if (!iq.field_f ||
              !sq.field_N ||
              !re.field_b) {
              boolean decompiledFrameRemainder1 = true;
              stackIn_84_0 = this.field_k;
              if (!lc.field_m[96] && (!lc.field_m[field_e] ||
                lc.field_m[82])) {
                stackIn_87_1 = false;
                decompiledFrameRemainder1 = false;
              }
              else {
                stackIn_87_1 = true;
              }
              stackIn_91_2 = lc.field_m[81];
              stackIn_94_3 = (lc.field_m[98]) || (lc.field_m[rp.field_d]);
              stackIn_101_4 = (lc.field_m[97]) || (lc.field_m[bd.field_d]);
              stackIn_105_5 = -91;
              stackIn_108_6 = (lc.field_m[99]) || (lc.field_m[uq.field_g]);
              ((nm) (Object) stackIn_84_0).a(stackIn_87_1, stackIn_91_2, stackIn_94_3, stackIn_101_4, (byte) stackIn_105_5, stackIn_108_6);
              if (var14 != 0) {
                this.field_k.a(lc.field_m[96], lc.field_m[81], lc.field_m[98], lc.field_m[97], (byte) -91, lc.field_m[99]);
                this.field_k.a(false, false, false, false, (byte) -91, false);
              }
            } else {
              this.field_k.a(lc.field_m[96], lc.field_m[81], lc.field_m[98], lc.field_m[97], (byte) -91, lc.field_m[99]);
              if (var14 != 0) {
                this.field_k.a(false, false, false, false, (byte) -91, false);
              }
            }
          } else {
            this.field_k.a(false, false, false, false, (byte) -91, false);
          }
          if (0 < this.field_l && (this.field_l < 640 ||
            op.field_m.field_l != 0 ||
            op.field_m.field_l == 0 &&
            0.95 < (double)this.field_k.field_t)) {
            this.field_l = this.field_l - 15;
          }
          if (!gf.field_h &&
            this.field_eb &&
            1 == pq.field_f) {
            this.field_p = this.field_p - (this.field_k.field_g - var8);
            this.field_F = this.field_F - (this.field_k.field_k - var7Lifetime2);
            if (-1 == this.field_F) {
              this.field_F = this.field_F - 1;
            }
          }
          if (var3_int == 0) {
            var9 = bl.a((byte) 87);
            if (this.field_a == 0L) {
              this.field_a = var9 - 20L;
            }
            var11 = this.field_W + (int)((-this.field_t + var9) / 20L);
            if (df.field_I) {
              var11 = op.field_m.field_H;
            }
            boolean decompiledFrameRemainder2 = true;
            var12 = var11 - op.field_m.field_H;
            var13 = 0;
            if (var12 < 0) {
              fieldTemp$0 = this.field_U - 1;
              this.field_U = this.field_U - 1;
              if (fieldTemp$0 >= 0) {
                this.field_a = this.field_a + 20L;
                vd.a(false, 20L);
                decompiledFrameRemainder2 = (var14 != 0);
              }
              if (decompiledFrameRemainder2) {
                this.a((byte) -91);
                this.field_U = -var12 / 8 + 1;
                this.field_a = this.field_a + 20L;
              }
            }
            if ((decompiledFrameRemainder2) &&
              (!(var12 < 0) ||
              var14 != 0)) {
              L40: while (true) {
                boolean decompiledFrameCompleted0 = true;
                if (var9 - this.field_a >= 20L &&
                  var11 == op.field_m.field_H) {
                  while (true) {
                    var13++;
                    this.a((byte) 51);
                    this.field_a = this.field_a + 20L;
                    fieldTemp$1 = this.field_gb - 1;
                    this.field_gb = this.field_gb - 1;
                    if (fieldTemp$1 < 0) {
                      continue L40;
                    }
                    stackIn_164_0 = this.field_g;
                    stackIn_164_1 = var13;
                    if (var14 == 0) {
                      decompiledFrameCompleted0 = false;
                      break;
                    }
                    if (stackIn_164_0 <= stackIn_164_1) {
                      break L40;
                    }
                  }
                }
                if (decompiledFrameCompleted0) {
                  stackIn_164_0 = var11;
                  stackIn_164_1 = op.field_m.field_H;
                  do {
                    if (stackIn_164_0 <= stackIn_164_1) {
                      break L40;
                    }
                    var13++;
                    this.a((byte) 51);
                    this.field_a = this.field_a + 20L;
                    fieldTemp$1 = this.field_gb - 1;
                    this.field_gb = this.field_gb - 1;
                    if (fieldTemp$1 < 0) {
                      continue L40;
                    }
                    stackIn_164_0 = this.field_g;
                    stackIn_164_1 = var13;
                  } while (var14 != 0);
                }
                if (stackIn_164_0 >= stackIn_164_1) {
                  continue;
                }
                break;
              }
              if (var13 > 1) {
                this.field_gb = this.field_m;
              }
            }
            if (this.c((byte) 120)) {
              this.field_G.b((byte) 105, -op.field_m.field_H + op.field_m.field_C);
              if (var14 != 0) {
                this.field_G.c(0);
              }
            } else {
              this.field_G.c(0);
            }
          }
          if (pp.field_n &&
            !this.field_k.field_f) {
            this.field_A = this.field_A + Math.abs(-var4 + this.field_k.field_k);
            this.field_jb = this.field_jb + Math.abs(this.field_k.field_g - var5);
            this.field_D = this.field_D + Math.abs(-var6 + this.field_k.field_d);
            if (this.field_A + this.field_jb > 1100) {
              iq.a(-8, (byte) 99);
            }
            if (this.field_D > 2.200000047683716f) {
              iq.a(-7, (byte) 99);
            }
          }
          this.b(true);
          g.a(this.field_H);
          this.a(param1, 15978);
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3 = decompiledCaughtException;
          throw fa.a((Throwable) ((Object) var3), "qd.L(" + param0 + ',' + param1 + ')');
        }
    }

    private final void b(byte param0, int param1, int param2) {
        int incrementValue$0 = 0;
        int incrementValue$1 = 0;
        int incrementValue$2 = 0;
        int incrementValue$3 = 0;
        int stackIn_37_0 = 0;
        int stackIn_37_1 = 0;
        int stackIn_48_0 = 0;
        int stackIn_73_0 = 0;
        int stackIn_78_0 = 0;
        int stackIn_78_1 = 0;
        int stackIn_89_0 = 0;
        int stackIn_103_0 = 0;
        RuntimeException decompiledCaughtException = null;
        int var4_int = 0;
        RuntimeException var4 = null;
        lq var5 = null;
        wb var6 = null;
        int var6_int = 0;
        th var7_ref_th = null;
        int var7 = 0;
        int[][] var8 = null;
        wb var8_ref = null;
        int var9 = 0;
        int var10 = 0;
        int var11 = 0;
        int var12 = 0;
        int var13 = 0;
        int var14 = 0;
        int var15_int = 0;
        wb var15 = null;
        int var16 = 0;
        int var17 = 0;
        int var18 = 0;
        int var19 = 0;
        int var20 = 0;
        wb var6Lifetime1;
        int stackIn_48_0Lifetime1;
        int stackIn_89_0Lifetime1;
        int var6_intLifetime1;
        int var7Lifetime1;
        int var9Lifetime1;
        int var10Lifetime1;
        int var14Lifetime1;
        int var16Lifetime1;
        int var17Lifetime1;
        int var18Lifetime1;
        int var19Lifetime1;
        var20 = ZombieDawnMulti.field_E ? 1 : 0;
        try {
          this.field_J.a(0, param2, param1);
          if (this.field_Q.a((byte) 98) > 1) {
            param2 = po.d(12949) - param2 % 24 + param2;
            param1 = po.d(12949) + (-(param1 % 24) + param1);
            if (var20 != 0) {
              param1 += 6;
            }
          } else {
            param1 += 6;
          }
          var4_int = 1;
          var5 = new lq();
          var6 = (wb) (this.field_Q.c((byte) 121));
          boolean decompiledNaturalLoopExit0 = false;
          while (!(decompiledNaturalLoopExit0 = (var6 == null))) {
            var7_ref_th = this.field_u.b(var6.g(124), param1, var6.h(119), param2, 8760);
            if (var20 == 0) {
              if (null == var7_ref_th) {
                var6.a(-4564);
                var5.a(29664, var6);
              } else {
                var4_int = 0;
              }
              var6 = (wb) (this.field_Q.b((byte) 100));
              continue;
            }
            break;
          }
          if (decompiledNaturalLoopExit0) {
            if (var4_int != 0) {
              this.field_Q = var5;
              this.field_J.a(true);
              return;
            }
            this.field_J.b(true);
          }
          boolean decompiledFrameRemainder0 = true;
          boolean decompiledFrameCompleted0 = true;
          if (this.field_o.a(param1, param2, (byte) -69)) {
            param2 = -6 + this.field_o.g(-115);
            param1 = this.field_o.h(-110) + 15;
            var6_int = 8192;
            if (this.field_Q.a((byte) 98) > 0) {
              var6_int = var6_int / this.field_Q.a((byte) 98);
            }
            if (var6_int == 0) {
              var6_int = 1;
            }
            var7 = 0;
            var8_ref = (wb) (this.field_Q.c((byte) 88));
            while (var8_ref != null) {
              var9 = param2 + (wn.a(-128, var7) * 48 >> 16);
              var10 = (on.a(var7, -18924) * 48 >> 16) + param1;
              var7 = var7 + var6_int;
              var8_ref.a((byte) 68, op.field_m.field_H + 100, var9, var10);
              wd.a(var8_ref.field_y, op.field_m.field_H, ma.field_a, param2, 65, param1);
              var8_ref = (wb) (this.field_Q.b((byte) 117));
              if (var20 != 0) {
                decompiledFrameCompleted0 = false;
                break;
              }
            }
            decompiledFrameRemainder0 = !(decompiledFrameCompleted0);
          }
          if ((decompiledFrameRemainder0) &&
            (decompiledFrameCompleted0)) {
            var6_intLifetime1 = param2 / 24;
            var7Lifetime1 = param1 / 24;
            var8 = this.field_u.d(114);
            var8[var7Lifetime1][var6_intLifetime1] = 1;
            var9Lifetime1 = 2;
            var10Lifetime1 = 1;
            var11 = this.field_Q.a((byte) 98);
            var12 = -1;
            var13 = -1;
            L9: while (true) {
              boolean decompiledFrameRemainder1 = true;
              if (var11 >= var9Lifetime1) {
                var14 = -1;
                var15_int = -1;
                stackIn_73_0 = 0;
                if (var20 != 0) {
                  break L9;
                }
                var16 = stackIn_73_0;
                while (true) {
                  stackIn_37_0 = ~var8.length;
                  stackIn_37_1 = ~var16;
                  if (stackIn_37_0 < stackIn_37_1) {
                    stackIn_48_0 = 0;
                    var17 = stackIn_48_0;
                    while (var8[0].length > var17) {
                      stackIn_37_0 = ~var10Lifetime1;
                      stackIn_37_1 = ~var8[var16][var17];
                      if (stackIn_37_0 == stackIn_37_1) {
                        var14 = var17;
                        var15_int = var16;
                      }
                      var17++;
                    }
                    var16++;
                    continue;
                  }
                  break;
                }
                stackIn_48_0Lifetime1 = var14;
                if (stackIn_48_0Lifetime1 == -1 &&
                  var15_int == -1) {
                  this.field_J.a(true);
                  return;
                }
                if (jk.a((byte) 123, var14, var8, var15_int - 1) == 0) {
                  incrementValue$0 = var9Lifetime1;
                  var9Lifetime1++;
                  var8[var15_int - 1][var14] = incrementValue$0;
                }
                if (jk.a((byte) -82, var14 + 1, var8, var15_int) == 0) {
                  incrementValue$1 = var9Lifetime1;
                  var9Lifetime1++;
                  var8[var15_int][var14 + 1] = incrementValue$1;
                }
                if (jk.a((byte) -97, var14, var8, 1 + var15_int) == 0) {
                  incrementValue$2 = var9Lifetime1;
                  var9Lifetime1++;
                  var8[1 + var15_int][var14] = incrementValue$2;
                }
                if (jk.a((byte) 25, var14 - 1, var8, var15_int) == 0) {
                  incrementValue$3 = var9Lifetime1;
                  var9Lifetime1++;
                  var8[var15_int][var14 - 1] = incrementValue$3;
                }
                var10Lifetime1++;
                if (this.field_o.b(var14, var15_int, 19024)) {
                  var13 = var15_int;
                  var12 = var14;
                  decompiledFrameRemainder1 = false;
                }
                else {
                  continue;
                }
              }
              stackIn_73_0 = 0;
              break;
            }
            var14Lifetime1 = stackIn_73_0;
            var15 = (wb) (this.field_Q.c((byte) 109));
            L25: while (true) {
              if (var15 != null) {
                var14Lifetime1++;
                var16Lifetime1 = -1;
                var17Lifetime1 = -1;
                stackIn_103_0 = 0;
                if (var20 != 0) {
                  break L25;
                }
                var18 = stackIn_103_0;
                while (true) {
                  stackIn_78_0 = var8.length;
                  stackIn_78_1 = var18;
                  if (stackIn_78_0 > stackIn_78_1) {
                    stackIn_89_0 = 0;
                    var19 = stackIn_89_0;
                    while (var19 < var8[0].length) {
                      stackIn_78_0 = var14Lifetime1;
                      stackIn_78_1 = var8[var18][var19];
                      if (stackIn_78_0 == stackIn_78_1) {
                        var17Lifetime1 = var18;
                        var16Lifetime1 = var19;
                      }
                      var19++;
                    }
                    var18++;
                    continue;
                  }
                  break;
                }
                stackIn_89_0Lifetime1 = 0;
                if (stackIn_89_0Lifetime1 == ~var16Lifetime1 &&
                  var17Lifetime1 == -1) {
                  var16Lifetime1 = var12;
                  var17Lifetime1 = var13;
                }
                if (-1 == var16Lifetime1 &&
                  -1 == var17Lifetime1) {
                  return;
                }
                var18Lifetime1 = po.d(12949) + 24 * var16Lifetime1;
                var19Lifetime1 = 24 * var17Lifetime1 + po.d(12949);
                var15.a((byte) 95, 100 + op.field_m.field_H, var18Lifetime1, var19Lifetime1);
                wd.a(var15.field_y, op.field_m.field_H, ma.field_a, var18Lifetime1, 61, var19Lifetime1);
                var15 = (wb) (this.field_Q.b((byte) 108));
                continue;
              }
              stackIn_103_0 = 0;
              break;
            }
            if (stackIn_103_0 < var14Lifetime1) {
              iq.a(-13, (byte) 99);
            }
          }
          if (param0 <= 14) {
            this.b(false, -51, -45, 16);
          }
          var6Lifetime1 = (wb) (var5.c((byte) 98));
          while (null != var6Lifetime1) {
            var6Lifetime1.a(-4564);
            this.field_Q.a(29664, var6Lifetime1);
            var6Lifetime1 = (wb) (var5.b((byte) 126));
            if (var20 != 0) {
              return;
            }
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var4 = decompiledCaughtException;
          throw fa.a((Throwable) ((Object) var4), "qd.M(" + param0 + ',' + param1 + ',' + param2 + ')');
        }
    }

    final void a(byte param0, int param1, int param2, int param3, int param4) {
        kb stackIn_6_0 = null;
        int stackIn_6_1 = 0;
        int stackIn_7_2 = 0;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var6 = null;
        try {
          if (param0 >= -103) {
            this.a((byte) -73, false);
          }
          stackIn_6_0 = op.field_m;
          stackIn_6_1 = param4;
          if (param2 == 9) {
            stackIn_7_2 = 1;
          } else {
            stackIn_7_2 = 0;
          }
          ((kb) (Object) stackIn_6_0).a(stackIn_6_1, stackIn_7_2, 118, param1, param3, this.field_u);
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var6 = decompiledCaughtException;
          throw fa.a((Throwable) ((Object) var6), "qd.HB(" + param0 + ',' + param1 + ',' + param2 + ',' + param3 + ',' + param4 + ')');
        }
    }

    private final void a(boolean param0) {
        int var2_int = 0;
        int var3 = 0;
        int var4 = 0;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var2 = null;
        var4 = ZombieDawnMulti.field_E ? 1 : 0;
        try {
          if (!param0) {
            return;
          }
          if (!he.field_a) {
            oo.h(0, 40, 640, 440);
            if (var4 != 0) {
              oo.c();
            }
          } else {
            oo.c();
          }
          if (1.0f == this.field_k.field_d) {
            ki.field_k.c(0, 0);
            if (var4 == 0) {
              return;
            }
          }
          var2_int = (int)(1280.0f / this.field_k.field_d);
          var3 = (int)(960.0f / this.field_k.field_d);
          ki.field_k.f(0, 0, var2_int, var3);
          if (1.2999999523162842f < this.field_k.field_d) {
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2 = decompiledCaughtException;
          throw fa.a((Throwable) ((Object) var2), "qd.GB(" + param0 + ')');
        }
    }

    private final void e(int param0, int param1, int param2) {
        RuntimeException runtimeException = null;
        int var4_int = 0;
        int var5 = 0;
        RuntimeException decompiledCaughtException = null;
        try {
          var4_int = (-this.field_k.field_k + param2) / 4;
          var5 = (-this.field_k.field_g + param0) / 4;
          this.field_k.a(var5 + this.field_k.field_g, -var4_int + param2, param2, this.field_k.field_k, this.field_k.field_g, param0, 0, param0 - var5, this.field_k.field_k + var4_int);
          this.field_k.a((byte) 47);
          this.field_k.field_i = this.field_k.field_i * 6.0f;
          if (param1 >= -36) {
            field_N = 59;
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          runtimeException = decompiledCaughtException;
          throw fa.a((Throwable) ((Object) runtimeException), "qd.BB(" + param0 + ',' + param1 + ',' + param2 + ')');
        }
    }

    final static void a(fm param0, int param1, String param2, int param3, td param4) {
        RuntimeException stackIn_31_0 = null;
        StringBuilder stackIn_31_1 = null;
        String stackIn_32_2 = null;
        StringBuilder stackIn_35_1 = null;
        String stackIn_36_2 = null;
        StringBuilder stackIn_39_1 = null;
        String stackIn_40_2 = null;
        RuntimeException decompiledCaughtException = null;
        int var5_int = 0;
        RuntimeException var5 = null;
        int var6 = 0;
        int var7 = 0;
        int var8 = 0;
        int var9 = 0;
        var9 = ZombieDawnMulti.field_E ? 1 : 0;
        try {
          var5_int = 0;
          var6 = -1;
          var7 = 1;
          if (param3 <= 82) {
            return;
          }
          while (param2.length() > var7) {
            var8 = param2.charAt(var7);
            if (var9 != 0) {
              return;
            }
            if (60 == var8) {
              var6 = param4.field_e[0] + ((var5_int >> 8) + param0.a(param2.substring(0, var7)));
            }
            if (-1 != var6) {
              param4.field_e[var7] = var6;
            } else {
              if (var8 == 32) {
                var5_int = var5_int + param1;
              }
              param4.field_e[var7] = param4.field_e[0] + (var5_int >> 8) + (param0.a(param2.substring(0, 1 + var7)) - param0.a((char) var8));
            }
            if (62 == var8) {
              var6 = -1;
            }
            var7++;
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var5 = decompiledCaughtException;
          stackIn_31_0 = var5;
          stackIn_31_1 = new StringBuilder().append("qd.KB(");
          if (param0 == null) {
            stackIn_32_2 = "null";
          } else {
            stackIn_32_2 = "{...}";
          }
          stackIn_35_1 = ((StringBuilder) (Object) stackIn_31_1).append(stackIn_32_2).append(',').append(param1).append(',');
          if (param2 == null) {
            stackIn_36_2 = "null";
          } else {
            stackIn_36_2 = "{...}";
          }
          stackIn_39_1 = ((StringBuilder) (Object) stackIn_35_1).append(stackIn_36_2).append(',').append(param3).append(',');
          if (param4 == null) {
            stackIn_40_2 = "null";
          } else {
            stackIn_40_2 = "{...}";
          }
          throw fa.a((Throwable) ((Object) stackIn_31_0), ((StringBuilder) (Object) stackIn_39_1).append(stackIn_40_2).append(')').toString());
        }
    }

    private final void d(int param0, int param1) {
        RuntimeException decompiledCaughtException = null;
        RuntimeException var3 = null;
        int var4 = 0;
        var4 = ZombieDawnMulti.field_E ? 1 : 0;
        try {
          pq.b(false);
          if (param1 != 3) {
            this.field_kb = (th) null;
          }
          if (param0 != 0) {
            if (param0 == 1) {
              h.b(param1 - 113, 1);
              ck.a(77, -23838);
              ck.a(110, -23838);
              ck.a(111, -23838);
              ck.a(173, -23838);
              ck.a(174, -23838);
              ck.a(175, param1 ^ -23839);
              sj.a(189, 173, (byte) -66);
              sj.a(190, 174, (byte) -66);
              sj.a(191, 175, (byte) -66);
              if (var4 == 0) {
                return;
              }
            }
            if (param0 == 2) {
              h.b(-101, 2);
              ck.a(132, -23838);
              ck.a(133, -23838);
              ck.a(70, -23838);
              ck.a(264, -23838);
              ck.a(265, -23838);
              ck.a(266, -23838);
              ck.a(267, -23838);
              sj.a(132, 133, (byte) -66);
              sj.a(268, 264, (byte) -66);
              sj.a(269, 265, (byte) -66);
              sj.a(270, 266, (byte) -66);
              sj.a(271, 267, (byte) -66);
              if (var4 == 0) {
                return;
              }
            }
            if (param0 == 3) {
              h.b(-74, 3);
              ck.a(163, -23838);
              ck.a(164, -23838);
              ck.a(165, -23838);
              ck.a(213, -23838);
              ck.a(214, -23838);
              ck.a(215, param1 ^ -23839);
              sj.a(213, 163, (byte) -66);
              sj.a(214, 164, (byte) -66);
              sj.a(215, 165, (byte) -66);
              ck.a(230, -23838);
              ck.a(246, -23838);
              sj.a(246, 230, (byte) -66);
              ck.a(247, -23838);
              ck.a(263, -23838);
              sj.a(263, 247, (byte) -66);
              if (var4 == 0) {
                return;
              }
            }
            if (param0 != 4) {
              return;
            }
            h.b(param1 ^ -89, 4);
            if (var4 == 0) {
              return;
            }
          }
          pj.a(0, 16, -16384, 22, 21, (byte) -27, 3);
          pj.a(0, 21, 16384, 23, 16, (byte) 122, 3);
          ge.s(9);
          ck.a(59, -23838);
          ck.a(60, -23838);
          ck.a(61, -23838);
          ck.a(71, param1 - 23841);
          ck.a(70, -23838);
          ck.a(110, -23838);
          ck.a(111, param1 ^ -23839);
          ck.a(120, -23838);
          ck.a(121, -23838);
          ck.a(122, -23838);
          ck.a(156, param1 ^ -23839);
          ck.a(157, -23838);
          ck.a(158, -23838);
          ck.a(276, -23838);
          ck.a(277, -23838);
          ck.a(278, -23838);
          sj.a(276, 120, (byte) -66);
          sj.a(277, 121, (byte) -66);
          sj.a(278, 122, (byte) -66);
          h.b(-70, 0);
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3 = decompiledCaughtException;
          throw fa.a((Throwable) ((Object) var3), "qd.DB(" + param0 + ',' + param1 + ')');
        }
    }

    final void a(int param0, int param1) {
        boolean stackIn_28_0 = false;
        boolean stackIn_55_0 = false;
        boolean stackIn_63_0 = false;
        boolean stackIn_71_0 = false;
        boolean stackIn_158_0 = false;
        boolean stackIn_166_0 = false;
        boolean stackIn_174_0 = false;
        boolean stackIn_182_0 = false;
        RuntimeException decompiledCaughtException = null;
        int var3_int = 0;
        RuntimeException var3 = null;
        int var4 = 0;
        var4 = ZombieDawnMulti.field_E ? 1 : 0;
        try {
          if (param1 == 13) {
            if (!iq.field_f) {
              bm.a(false, 2, 126, sp.field_g);
              if (var4 == 0) {
                return;
              }
            }
            iq.field_f = false;
            return;
          }
          if (!gf.field_h &&
            this.c((byte) 124)) {
            if (!df.field_I) {
              if (param1 == 84) {
                stackIn_28_0 = !(iq.field_f);
                iq.field_f = stackIn_28_0;
              }
              if ((param1 == 80) &&
                (!iq.field_f)) {
                sq.field_N = true;
                iq.field_f = true;
                if ((var4 != 0) && (83 == param1 ||
                  param1 == 84)) {
                  iq.a(-14, (byte) 99);
                }
              }
            } else {
              if (83 == param1 ||
                param1 == 84) {
                iq.a(-14, (byte) 99);
              }
            }
            if (this.field_ab) {
              if (param1 != 41) {
              }
              if (40 == param1) {
                stackIn_55_0 = !(po.field_p);
                po.field_p = stackIn_55_0;
              }
              if (32 == param1) {
                stackIn_63_0 = !(wh.field_c);
                wh.field_c = stackIn_63_0;
              }
              if (param1 == 85) {
                stackIn_71_0 = !(vk.field_E);
                vk.field_E = stackIn_71_0;
              }
              boolean decompiledFrameRemainder1 = true;
              if (lc.field_m[86]) {
                if (!lc.field_m[81]) {
                  if (param1 == 16) {
                    this.field_g = 1;
                  }
                  if (param1 == 17) {
                    this.field_g = 2;
                  }
                  if (param1 == 18) {
                    this.field_g = 4;
                  }
                  if (param1 == 19) {
                    this.field_g = 8;
                  }
                  if (param1 == 20) {
                    this.field_g = 16;
                  }
                  if (21 == param1) {
                    this.field_g = 32;
                  }
                  if (22 == param1) {
                    this.field_g = 64;
                  }
                  if (param1 == 23) {
                    this.field_g = 128;
                  }
                  if (param1 == 24) {
                    this.field_g = 256;
                  }
                  decompiledFrameRemainder1 = (25 == param1);
                  if (decompiledFrameRemainder1) {
                    this.field_g = 0;
                    decompiledFrameRemainder1 = (var4 != 0);
                  }
                }
                if (decompiledFrameRemainder1) {
                  if (param1 == 16) {
                    this.field_m = 1;
                  }
                  if (param1 == 17) {
                    this.field_m = 2;
                  }
                  if (param1 == 18) {
                    this.field_m = 4;
                  }
                  if (19 == param1) {
                    this.field_m = 8;
                  }
                  if (param1 == 20) {
                    this.field_m = 16;
                  }
                  if (21 == param1) {
                    this.field_m = 32;
                  }
                  if (param1 == 22) {
                    this.field_m = 64;
                  }
                  if (param1 == 23) {
                    this.field_m = 128;
                  }
                  if (24 == param1) {
                    this.field_m = 256;
                  }
                  if (25 == param1) {
                    this.field_m = 0;
                  }
                }
              }
              if (param1 == 37) {
                stackIn_158_0 = !(wj.field_n);
                wj.field_n = stackIn_158_0;
              }
              if (param1 == 34) {
                stackIn_166_0 = !(qq.field_h);
                qq.field_h = stackIn_166_0;
              }
              if (param1 == 38) {
                stackIn_174_0 = !(n.field_g);
                n.field_g = stackIn_174_0;
              }
              if (param1 == 36) {
                stackIn_182_0 = !(sc.field_a);
                sc.field_a = stackIn_182_0;
              }
              if (param1 == 41) {
                tl.a(2, (byte) -11, ma.field_a, 0, this.field_M, 0);
                if (!gf.field_h) {
                  this.field_I.b(113);
                }
              }
              if (2 == param1) {
                tl.a(0, (byte) -11, ma.field_a, this.field_k.a(true, bo.field_d), 0, this.field_k.a(bd.field_g, 2));
              }
              if (param1 == 4) {
                tl.a(1, (byte) -11, ma.field_a, 0, this.field_M, 0);
              }
              if (5 == param1) {
                tl.a(1, (byte) -11, ma.field_a, 0, (this.field_M + 1) % op.field_m.field_t, 0);
              }
              if (6 == param1) {
                nk.a(120, la.field_n, 120, 0, si.field_C);
              }
              if (7 == param1) {
                nk.a(1500, la.field_n, 1500, 0, si.field_C);
              }
              if (param1 == 8) {
                tl.a(3, (byte) -11, ma.field_a, 0, 0, 2);
              }
            }
            var3_int = -34 % ((param0 - 63) / 56);
            if (lc.field_m[82] &&
              param1 == 48) {
              this.a(this.field_u.field_r, this.field_u.field_c, 0, 0, (byte) 5);
            }
            if (~eg.field_C == ~param1) {
              this.field_I.a(0, -1);
            }
            if (~param1 == ~tl.field_v) {
              this.field_I.a(1, -1);
            }
            if (tp.field_s == param1) {
              this.field_I.a(2, -1);
            }
            if (~param1 == ~pd.field_c) {
              this.field_I.a(3, -1);
            }
            if (mg.field_F == param1) {
              this.field_I.a(4, -1);
            }
            if (op.field_m.b((byte) -67, 51, this.field_M)) {
              if (param1 == 35) {
                this.a(this.field_k.a(640, 2), this.field_k.a(true, 480), this.field_k.a(true, 0), this.field_k.a(0, 2), (byte) 5);
              }
              boolean decompiledFrameRemainder0 = true;
              if (lc.field_m[82]) {
                if (param1 != 16) {
                  if ((param1 != 17) &&
                    (decompiledFrameRemainder0 = (param1 == 18))) {
                    this.a((byte) 44, 3);
                    decompiledFrameRemainder0 = (var4 != 0);
                  }
                  if (decompiledFrameRemainder0) {
                    this.a((byte) 84, 2);
                    decompiledFrameRemainder0 = (var4 != 0);
                  }
                }
                if (decompiledFrameRemainder0) {
                  this.a((byte) 114, 1);
                  decompiledFrameRemainder0 = (var4 != 0);
                }
              }
              if (decompiledFrameRemainder0) {
                if (param1 == 16) {
                  this.a(1, 1782, lc.field_m[81]);
                }
                if (param1 != 16 ||
                  var4 != 0) {
                  if (17 != param1) {
                    if (param1 == 18) {
                      this.a(3, 1782, lc.field_m[81]);
                      if (var4 != 0) {
                        this.a(2, 1782, lc.field_m[81]);
                      }
                    }
                  } else {
                    this.a(2, 1782, lc.field_m[81]);
                  }
                }
              }
              if (param1 == 53) {
                this.e(this.field_o.h(-85), -108, this.field_o.g(63));
              }
            }
            return;
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3 = decompiledCaughtException;
          throw fa.a((Throwable) ((Object) var3), "qd.J(" + param0 + ',' + param1 + ')');
        }
    }

    private final void a(int param0, int param1, int param2, int param3, byte param4) {
        br var6 = null;
        wb var7 = null;
        int var8 = 0;
        boolean stackIn_7_0 = false;
        int stackIn_19_0 = 0;
        RuntimeException decompiledCaughtException = null;
        boolean stackOut_6_0;
        RuntimeException var6_ref = null;
        var8 = ZombieDawnMulti.field_E ? 1 : 0;
        try {
          if (param4 != 5) {
            this.a((byte) -83, -17, -19, -39, -124);
          }
          var6 = this.field_H.c(param4 ^ 120);
          boolean decompiledNaturalLoopExit0 = false;
          while (!(decompiledNaturalLoopExit0 = (!(var6 instanceof id)))) {
            stackOut_6_0 = var6 instanceof wb;
            stackIn_19_0 = stackOut_6_0 ? 1 : 0;
            stackIn_7_0 = stackOut_6_0;
            if (var8 == 0) {
              if (stackIn_7_0) {
                var7 = (wb) (var6);
                if (this.field_M == var7.field_Lb) {
                  var7.field_eb = false;
                  if (var7.a(param3, param1, param2, 48, param0)) {
                    this.field_Q.a(29664, var7);
                    var7.r(0);
                  }
                }
              }
              var6 = var6.field_d;
              continue;
            }
            break;
          }
          if (decompiledNaturalLoopExit0) {
            stackIn_19_0 = this.field_Q.a((byte) 98);
          }
          if (stackIn_19_0 > 1) {
            iq.a(-5, (byte) 99);
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var6_ref = decompiledCaughtException;
          throw fa.a((Throwable) ((Object) var6_ref), "qd.W(" + param0 + ',' + param1 + ',' + param2 + ',' + param3 + ',' + param4 + ')');
        }
    }

    final void b(boolean param0, int param1, int param2, int param3) {
        if (param1 != 0) {
          return;
        }
        try {
          this.field_O.a(new lj(param3, param2, param0), false);
        } catch (RuntimeException runtimeException) {
          throw fa.a((Throwable) ((Object) runtimeException), "qd.UA(" + param0 + ',' + param1 + ',' + param2 + ',' + param3 + ')');
        }
    }

    final boolean b(int param0, int param1, int param2, int param3) {
        cg stackIn_4_0 = null;
        Object stackIn_13_0 = null;
        boolean stackIn_16_0 = false;
        boolean stackIn_25_0 = false;
        boolean stackIn_34_0 = false;
        int stackIn_43_0 = 0;
        int stackIn_55_0 = 0;
        int stackIn_57_0 = 0;
        int stackIn_73_0 = 0;
        int stackIn_75_0 = 0;
        RuntimeException decompiledCaughtException = null;
        cg stackOut_3_0;
        boolean stackOut_15_0;
        boolean stackOut_24_0;
        boolean stackOut_33_0;
        Object var5 = null;
        br var5_ref = null;
        RuntimeException var5_ref2 = null;
        cg var6_ref_cg = null;
        pq var6_ref_pq = null;
        ce var6_ref_ce = null;
        br var6_ref_br = null;
        int var6 = 0;
        jj var7_ref_jj = null;
        int var7 = 0;
        int var8 = 0;
        int var9 = 0;
        int var7Lifetime1;
        var9 = ZombieDawnMulti.field_E ? 1 : 0;
        try {
          var5 = null;
          var6_ref_cg = (cg) (op.field_m.field_A.c(49));
          boolean decompiledNaturalLoopExit2 = false;
          while (!(decompiledNaturalLoopExit2 = (var6_ref_cg == null))) {
            stackOut_3_0 = var6_ref_cg;
            stackIn_13_0 = stackOut_3_0;
            stackIn_4_0 = stackOut_3_0;
            if (var9 == 0) {
              if (((cg) (Object) stackIn_4_0).a((byte) 60, param2, param0)) {
                var6_ref_cg.a(-1);
                return true;
              }
              var6_ref_cg = (cg) (op.field_m.field_A.b(6));
              continue;
            }
            break;
          }
          if (decompiledNaturalLoopExit2) {
            stackIn_13_0 = op.field_m.field_G.c(98);
          }
          var6_ref_pq = (pq) (stackIn_13_0);
          L4: while (true) {
            if (var6_ref_pq != null) {
              var5_ref = op.field_m.field_G.b(6);
              stackOut_15_0 = var6_ref_pq.a(param0, false, param2);
              stackIn_43_0 = stackOut_15_0 ? 1 : 0;
              stackIn_16_0 = stackOut_15_0;
              if (var9 == 0) {
                if (stackIn_16_0) {
                  var6_ref_pq.c(-24421);
                  var6_ref_pq.a(true);
                  return true;
                }
                var6_ref_pq = (pq) (var5_ref);
                continue;
              }
            } else {
              var6_ref_ce = (ce) (op.field_m.field_s.c(39));
              while (true) {
                if (var6_ref_ce != null) {
                  var5_ref = op.field_m.field_s.b(6);
                  stackOut_24_0 = var6_ref_ce.a(param0, param2, -1);
                  stackIn_43_0 = stackOut_24_0 ? 1 : 0;
                  stackIn_25_0 = stackOut_24_0;
                  if (var9 != 0) {
                    break;
                  }
                  if (stackIn_25_0) {
                    var6_ref_ce.c(-28188);
                  } else {
                    var6_ref_ce = (ce) (var5_ref);
                    continue;
                  }
                }
                var6_ref_br = op.field_m.field_K.c(125);
                while (var6_ref_br != null) {
                  stackOut_33_0 = var6_ref_br instanceof jj;
                  stackIn_43_0 = stackOut_33_0 ? 1 : 0;
                  stackIn_34_0 = stackOut_33_0;
                  if (var9 != 0) {
                    break L4;
                  }
                  if (stackIn_34_0) {
                    var7_ref_jj = (jj) (var6_ref_br);
                    if (var7_ref_jj.a(7, param0, param2)) {
                      var7_ref_jj.field_P = 1;
                    }
                  }
                  var6_ref_br = op.field_m.field_K.b(6);
                }
                stackIn_43_0 = 0;
                break;
              }
            }
            break;
          }
          var6 = stackIn_43_0;
          var7 = 0;
          boolean decompiledNaturalLoopExit1 = false;
          while (!(decompiledNaturalLoopExit1 = (!(op.field_m.field_a.length > var7)))) {
            stackIn_57_0 = var6;
            if (var9 == 0) {
              if (stackIn_57_0 == 0 &&
                op.field_m.field_a[var7] <= 0) {
                stackIn_55_0 = 0;
              } else {
                stackIn_55_0 = 1;
              }
              var6 = stackIn_55_0;
              op.field_m.field_a[var7] = 0;
              var7++;
              continue;
            }
            break;
          }
          if (decompiledNaturalLoopExit1) {
            stackIn_57_0 = var6;
          }
          if (stackIn_57_0 != 0) {
            return true;
          }
          var7Lifetime1 = 0;
          var8 = 0;
          boolean decompiledNaturalLoopExit0 = false;
          while (!(decompiledNaturalLoopExit0 = (!(op.field_m.field_z.length > var8)))) {
            stackIn_75_0 = var7Lifetime1;
            if (var9 == 0) {
              if (stackIn_75_0 == 0 &&
                op.field_m.field_z[var8] <= 0) {
                stackIn_73_0 = 0;
              } else {
                stackIn_73_0 = 1;
              }
              var7Lifetime1 = stackIn_73_0;
              op.field_m.field_z[var8] = 0;
              var8++;
              continue;
            }
            break;
          }
          if (decompiledNaturalLoopExit0) {
            stackIn_75_0 = param1;
          }
          if (stackIn_75_0 > -100) {
            this.field_T = (th) null;
          }
          if (var7Lifetime1 == 0) {
            return false;
          }
          return true;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var5_ref2 = decompiledCaughtException;
          throw fa.a((Throwable) ((Object) var5_ref2), "qd.MA(" + param0 + ',' + param1 + ',' + param2 + ',' + param3 + ')');
        }
    }

    private final void a(byte param0, int param1) {
        RuntimeException runtimeException = null;
        br var3 = null;
        int var4 = 0;
        wb var5 = null;
        int var6 = 0;
        RuntimeException decompiledCaughtException = null;
        var6 = ZombieDawnMulti.field_E ? 1 : 0;
        try {
          var3 = op.field_m.field_K.c(40);
          var4 = -123 % ((-35 - param0) / 45);
          while (null != var3) {
            if (var6 != 0) {
              return;
            }
            if (var3 instanceof wb) {
              var5 = (wb) (var3);
              if (var5.field_Bb) {
                var5.field_Kb = param1;
              } else {
                if (param1 == var5.field_Kb) {
                  var5.field_Kb = 0;
                }
              }
            }
            var3 = op.field_m.field_K.b(6);
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          runtimeException = decompiledCaughtException;
          throw fa.a((Throwable) ((Object) runtimeException), "qd.E(" + param0 + ',' + param1 + ')');
        }
    }

    final void b(int param0, byte param1, int param2) {
        int stackIn_22_0 = 0;
        int stackIn_23_1 = 0;
        RuntimeException decompiledCaughtException = null;
        ti var4 = null;
        RuntimeException var4_ref = null;
        int var5 = 0;
        int var6 = 0;
        var6 = ZombieDawnMulti.field_E ? 1 : 0;
        try {
          if (param1 != 127) {
            return;
          }
          var4 = (ti) (op.field_m.a(param2, (byte) 33));
          if (var4 == null) {
            System.out.println("*** character oid " + param2 + "is null!");
          }
          if (21 == var4.field_K) {
            System.out.println("*** tried to enter portal twice!");
            return;
          }
          boolean decompiledFrameRemainder0 = true;
          if (var4 instanceof gm) {
            op.field_m.field_J[param0] = op.field_m.field_J[param0] + 1;
            var5 = 10;
            this.f(27);
            if (op.field_m.b((byte) -88, 60, param0)) {
              var5 = var5 + var5 / 2;
            }
            if (this.field_M != param0) {
              pb.$cfr$intArgs$a$90ed9136db05(62, 79);
              decompiledFrameRemainder0 = (var6 != 0);
            }
            if (decompiledFrameRemainder0) {
              stackIn_22_0 = 62;
              if (((gm) (var4)).m(param1 + 15557)) {
                stackIn_23_1 = 77;
              } else {
                stackIn_23_1 = 76;
              }
              pb.$cfr$intArgs$a$90ed9136db05(stackIn_22_0, stackIn_23_1);
              if (var6 != 0) {
                var5 = 4;
                if (op.field_m.b((byte) -124, 53, param0)) {
                  var5 = var5 + var5 / 2;
                }
                if (~this.field_M == ~param0) {
                  qq.b(1481485697, 78);
                  qq.b(1481485697, 79);
                } else {
                  qq.b(1481485697, 79);
                }
              }
            }
          } else {
            var5 = 4;
            if (op.field_m.b((byte) -124, 53, param0)) {
              var5 = var5 + var5 / 2;
            }
            if (~this.field_M == ~param0) {
              qq.b(1481485697, 78);
              if (var6 != 0) {
                qq.b(1481485697, 79);
              }
            } else {
              qq.b(1481485697, 79);
            }
          }
          this.field_T.a(new wc(var4.g(-78), -30 + var4.h(-66), var5, true), false);
          var4.b(21, -27655);
          op.field_m.field_d[param0] = op.field_m.field_d[param0] + var5;
          iq.a(-9, (byte) 99);
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var4_ref = decompiledCaughtException;
          throw fa.a((Throwable) ((Object) var4_ref), "qd.V(" + param0 + ',' + param1 + ',' + param2 + ')');
        }
    }

    final void c(byte param0, int param1, int param2) {
        RuntimeException runtimeException = null;
        id var4 = null;
        id var5 = null;
        gm var6 = null;
        wb var7 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          var4 = op.field_m.a(param2, (byte) 33);
          if (var4 == null) {
            return;
          }
          if (param0 != 118) {
            this.field_lb = false;
          }
          if (!(var4 instanceof wb)) {
            return;
          }
          var5 = op.field_m.a(param1, (byte) 33);
          if (var4 == null) {
            return;
          }
          var6 = (gm) (var5);
          var7 = (wb) (var4);
          var7.field_Eb = var6;
          var7.b(7, param0 ^ -27761);
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          runtimeException = decompiledCaughtException;
          throw fa.a((Throwable) ((Object) runtimeException), "qd.GA(" + param0 + ',' + param1 + ',' + param2 + ')');
        }
    }

    final wb a(int param0, wb param1, gm param2, boolean param3, qk param4) {
        wb stackIn_3_0;
        wb stackIn_3_1;
        int stackIn_3_2;
        int stackIn_3_3;
        wb stackIn_4_0 = null;
        wb stackIn_4_1 = null;
        boolean stackIn_4_4 = false;
        int stackIn_15_0 = 0;
        wb stackIn_17_0 = null;
        wb stackIn_33_0 = null;
        RuntimeException stackIn_37_0 = null;
        StringBuilder stackIn_37_1 = null;
        String stackIn_38_2 = null;
        StringBuilder stackIn_41_1 = null;
        String stackIn_42_2 = null;
        StringBuilder stackIn_45_1 = null;
        String stackIn_46_2 = null;
        RuntimeException decompiledCaughtException = null;
        int var6_int = 0;
        RuntimeException var6 = null;
        int var7 = 0;
        wb var8 = null;
        int var9 = 0;
        try {
          var6_int = param4.field_g >> 16;
          var7 = param4.field_h >> 16;
          stackIn_3_0 = null;
          stackIn_3_1 = null;
          stackIn_3_2 = var6_int;
          stackIn_3_3 = var7;
          if (null == param2) {
            stackIn_4_0 = null;
            stackIn_4_1 = null;
            stackIn_4_4 = true;
          } else {
            stackIn_4_0 = null;
            stackIn_4_1 = null;
            stackIn_4_4 = param2.m(15684);
          }
          var8 = new wb(stackIn_3_2, stackIn_3_3, stackIn_4_4);
          var8.field_Lb = param0;
          this.a(1, var6_int, var7);
          this.field_H.a(var8, false);
          g.a(this.field_H);
          if (null != param1) {
            if (param1.field_Bb) {
              var8.r(0);
              this.field_Q.a(29664, var8);
            }
            var8.field_Kb = param1.field_Kb;
          }
          if (param2 == null) {
            stackIn_15_0 = 0;
          } else {
            stackIn_15_0 = param2.q(-5183);
          }
          var9 = stackIn_15_0;
          if (!param3) {
            stackIn_17_0 = (wb) null;
            return stackIn_17_0;
          }
          op.field_m.field_d[param0] = op.field_m.field_d[param0] + var9;
          if (0 != var9 &&
            this.field_M == param0) {
            this.field_T.a(new wc(param2.g(104), param2.h(86) - 30, var9, true), false);
          }
          if (!this.field_G.b((byte) 31)) {
            var8.p(72);
          }
          iq.a(-4, (byte) 99);
          if (param2 != null) {
            param2.b(false);
          }
          stackIn_33_0 = var8;
          return stackIn_33_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var6 = decompiledCaughtException;
          stackIn_37_0 = var6;
          stackIn_37_1 = new StringBuilder().append("qd.LB(").append(param0).append(',');
          if (param1 == null) {
            stackIn_38_2 = "null";
          } else {
            stackIn_38_2 = "{...}";
          }
          stackIn_41_1 = ((StringBuilder) (Object) stackIn_37_1).append(stackIn_38_2).append(',');
          if (param2 == null) {
            stackIn_42_2 = "null";
          } else {
            stackIn_42_2 = "{...}";
          }
          stackIn_45_1 = ((StringBuilder) (Object) stackIn_41_1).append(stackIn_42_2).append(',').append(param3).append(',');
          if (param4 == null) {
            stackIn_46_2 = "null";
          } else {
            stackIn_46_2 = "{...}";
          }
          throw fa.a((Throwable) ((Object) stackIn_37_0), ((StringBuilder) (Object) stackIn_45_1).append(stackIn_46_2).append(')').toString());
        }
    }

    final void f(int param0) {
        int var2_int = 0;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var2 = null;
        try {
          op.field_m.c(-122);
          this.field_G.h(2);
          if (op.field_m.field_l == 1) {
            this.field_G.field_n = 2.0f;
          }
          var2_int = 66 % ((param0 - 78) / 48);
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2 = decompiledCaughtException;
          throw fa.a((Throwable) ((Object) var2), "qd.DA(" + param0 + ')');
        }
    }

    private final ti a(boolean param0, int param1, int param2, int param3) {
        ti stackIn_3_0 = null;
        Object stackIn_37_0 = null;
        RuntimeException decompiledCaughtException = null;
        int var5_int = 0;
        RuntimeException var5 = null;
        int var6 = 0;
        Object var7 = null;
        int var8 = 0;
        id var9 = null;
        ti var10 = null;
        jj var10_ref = null;
        int var11 = 0;
        var11 = ZombieDawnMulti.field_E ? 1 : 0;
        try {
          var5_int = this.field_k.a(param3, 2);
          var6 = this.field_k.a(true, param2);
          if (param1 <= 35) {
            stackIn_3_0 = (ti) null;
            return stackIn_3_0;
          }
          var7 = null;
          var8 = -1;
          var9 = (id) (this.field_H.c(48));
          while (var9 != null) {
            if (param0 &&
              var9 instanceof gm ||
              !param0 &&
              var9 instanceof wb) {
              var10 = (ti) (var9);
              if (var10.a(var5_int, true, var6) &&
                var8 < var10.h(-90)) {
                var8 = var10.h(124);
                var7 = var10;
              }
            }
            if (!param0 &&
              var9 instanceof jj) {
              var10_ref = (jj) (var9);
              if (~var10_ref.field_Q != ~this.field_M &&
                var10_ref.a(7, var5_int, var6)) {
                this.field_b = var10_ref;
              }
            }
            var9 = (id) (this.field_H.b(6));
            if (var11 == 0) {
              continue;
            }
            break;
          }
          stackIn_37_0 = var7;
          return (ti) (stackIn_37_0);
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var5 = decompiledCaughtException;
          throw fa.a((Throwable) ((Object) var5), "qd.WA(" + param0 + ',' + param1 + ',' + param2 + ',' + param3 + ')');
        }
    }

    private final void a(int param0, byte param1, int param2, int param3) {
        RuntimeException runtimeException = null;
        ja var5 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          var5 = am.a(0, op.field_m.field_D[param3][1], 0, 1, op.field_m.field_D[param3][0]);
          og.h((byte) 116);
          oo.h(320 - this.field_l / 2, 0, 320 + this.field_l / 2, 480);
          if (param1 != -99) {
            this.b(95, (byte) 85, -97);
          }
          if (320 > param0) {
            var5.g(param0 - 24, param2);
            ah.field_e.c(op.field_m.field_b[param3], param0 + 24, 48 + param2, 0, 0);
            if (!ZombieDawnMulti.field_E) {
              return;
            }
          }
          var5.b(param0 - 24, param2);
          ah.field_e.a(op.field_m.field_b[param3], param0 - 24, 48 + param2, 0, 0);
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          runtimeException = decompiledCaughtException;
          throw fa.a((Throwable) ((Object) runtimeException), "qd.B(" + param0 + ',' + param1 + ',' + param2 + ',' + param3 + ')');
        }
    }

    final void b(int param0, int param1) {
        RuntimeException runtimeException = null;
        wb var3 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          var3 = op.field_m.a(param0, false);
          if (null != var3) {
            var3.e(false);
          }
          if (param1 != 10) {
            this.c((byte) -13, 20, 111);
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          runtimeException = decompiledCaughtException;
          throw fa.a((Throwable) ((Object) runtimeException), "qd.NA(" + param0 + ',' + param1 + ')');
        }
    }

    final void a(boolean param0, ae param1) {
        ae var3 = null;
        int var4 = 0;
        RuntimeException stackIn_23_0 = null;
        StringBuilder stackIn_23_1 = null;
        String stackIn_24_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var3_ref = null;
        var4 = ZombieDawnMulti.field_E ? 1 : 0;
        try {
          if (param1 instanceof fq) {
            this.d(((fq) (param1)).field_l, param1.field_f, -30305);
          }
          if (this.field_hb.f(28113)) {
            this.field_hb.a(-25612, param1);
            return;
          }
          if (param0) {
            return;
          }
          var3 = (ae) (this.field_hb.a((byte) -84));
          while (null != var3) {
            if (var4 != 0) {
              return;
            }
            if (param1.field_f > var3.field_f) {
              qc.a(param1, var3, 0);
              return;
            }
            var3 = (ae) (this.field_hb.c((byte) 97));
          }
          this.field_hb.a(-25612, param1);
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3_ref = decompiledCaughtException;
          stackIn_23_0 = var3_ref;
          stackIn_23_1 = new StringBuilder().append("qd.U(").append(param0).append(',');
          if (param1 == null) {
            stackIn_24_2 = "null";
          } else {
            stackIn_24_2 = "{...}";
          }
          throw fa.a((Throwable) ((Object) stackIn_23_0), ((StringBuilder) (Object) stackIn_23_1).append(stackIn_24_2).append(')').toString());
        }
    }

    final void a(boolean param0, wb param1) {
        RuntimeException stackIn_8_0 = null;
        StringBuilder stackIn_8_1 = null;
        String stackIn_9_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var3 = null;
        try {
          param1.c((byte) -70);
          param1.a(-4564);
          param1.a(param0);
          if (!param0) {
            this.a(112, true, -72, (byte) -98, 26);
          }
          this.field_G.h(2);
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3 = decompiledCaughtException;
          stackIn_8_0 = var3;
          stackIn_8_1 = new StringBuilder().append("qd.OA(").append(param0).append(',');
          if (param1 == null) {
            stackIn_9_2 = "null";
          } else {
            stackIn_9_2 = "{...}";
          }
          throw fa.a((Throwable) ((Object) stackIn_8_0), ((StringBuilder) (Object) stackIn_8_1).append(stackIn_9_2).append(')').toString());
        }
    }

    final void a(int param0, int param1, int param2, int param3) {
        RuntimeException runtimeException = null;
        lc var5 = null;
        int var6 = 0;
        RuntimeException decompiledCaughtException = null;
        try {
          var5 = (lc) (this.field_X.g(106));
          if (null == var5) {
            var5 = new lc();
          }
          var5.a(param1, param3, op.field_m.a(param2, (byte) 33), (byte) 108);
          this.field_C.a(-25612, var5);
          g.a(this.field_C);
          var6 = -116 / ((param0 + 36) / 61);
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          runtimeException = decompiledCaughtException;
          throw fa.a((Throwable) ((Object) runtimeException), "qd.TA(" + param0 + ',' + param1 + ',' + param2 + ',' + param3 + ')');
        }
    }

    final void c(boolean param0, int param1) {
        RuntimeException decompiledCaughtException = null;
        int var3_int = 0;
        br var3 = null;
        RuntimeException var3_ref = null;
        gm var4 = null;
        wb var4_ref = null;
        int var5 = 0;
        var5 = ZombieDawnMulti.field_E ? 1 : 0;
        try {
          wd.field_G = null;
          if (!param0) {
            this.a((byte) 76, false);
          }
          var3_int = param1;
          if (var3_int == 9 &&
            var5 == 0) {
            if (!this.field_I.b(17, 0)) {
              this.field_I.a(81, 0, 255);
              return;
            }
            this.field_I.b(17, 0);
            return;
          } else {
            if (3 != var3_int) {
              boolean decompiledFrameRemainder0 = true;
              if (var3_int == 0 &&
                var5 == 0) {
                this.e(gk.field_c, -81, hc.field_c);
                return;
              } else {
                if ((var3_int != 8) &&
                  (decompiledFrameRemainder0 = (5 != var3_int ||
                  var5 != 0))) {
                  if (11 != var3_int) {
                    return;
                  }
                  we.field_g[7] = se.field_D;
                  return;
                }
              }
              if (decompiledFrameRemainder0) {
                this.e(this.field_o.h(-102), -92, this.field_o.g(61));
                wd.field_G = (id) ((Object) this.field_o);
                if (var5 == 0) {
                  return;
                }
              }
              var3 = op.field_m.field_K.c(89);
              while (var3 != null) {
                if (var5 != 0) {
                  return;
                }
                if (var3 instanceof gm) {
                  var4 = (gm) (var3);
                  if (var4.field_C == 4) {
                    this.e(var4.h(-96), -49, var4.g(63));
                    wd.field_G = (id) ((Object) var4);
                    return;
                  }
                }
                var3 = op.field_m.field_K.b(6);
              }
              return;
            }
          }
          var3 = op.field_m.field_K.c(47);
          while (var3 != null) {
            if (var5 != 0) {
              return;
            }
            if (var3 instanceof wb) {
              var4_ref = (wb) (var3);
              if (var4_ref.field_Lb == this.field_M) {
                this.e(var4_ref.h(87), -61, var4_ref.g(73));
                wd.field_G = (id) ((Object) var4_ref);
                return;
              }
            }
            var3 = op.field_m.field_K.b(6);
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3_ref = decompiledCaughtException;
          throw fa.a((Throwable) ((Object) var3_ref), "qd.IB(" + param0 + ',' + param1 + ')');
        }
    }

    private final void a(int param0, fc param1) {
        boolean stackIn_112_0 = false;
        boolean stackIn_125_0 = false;
        int stackIn_132_0 = 0;
        RuntimeException stackIn_180_0 = null;
        StringBuilder stackIn_180_1 = null;
        String stackIn_181_2 = null;
        RuntimeException decompiledCaughtException = null;
        boolean stackOut_124_0;
        int var3_int = 0;
        RuntimeException var3 = null;
        int var4 = 0;
        int var5 = 0;
        int var6 = 0;
        th var7 = null;
        id var8 = null;
        cg var8_ref = null;
        ce var8_ref2 = null;
        rp var8_ref3 = null;
        String var8_ref4 = null;
        h var9 = null;
        wb var9_ref = null;
        int var9_int = 0;
        sl var9_ref2 = null;
        int var10 = 0;
        int var11 = 0;
        int var12 = 0;
        int var13 = 0;
        int var14 = 0;
        int var10Lifetime1;
        var14 = ZombieDawnMulti.field_E ? 1 : 0;
        try {
          iq.field_f = false;
          this.field_f = false;
          this.field_Q.d(-1);
          this.field_jb = 0;
          this.field_A = 0;
          on.j((byte) 113);
          if (df.field_I) {
            if (!pp.field_n) {
              if (!op.field_m.b((byte) -128, 45, this.field_M)) {
                ah.a((byte) -86, 19);
                if (var14 != 0) {
                  ah.a((byte) -86, 20);
                  ah.a((byte) -86, 21);
                }
              } else {
                ah.a((byte) -86, 20);
                if (var14 != 0) {
                  ah.a((byte) -86, 21);
                }
              }
            } else {
              ah.a((byte) -86, 21);
            }
            iq.a(-1, (byte) 99);
          }
          this.field_w = true;
          this.field_mb = null;
          if (!pp.field_n) {
            if (!df.field_I) {
              if (gf.field_h) {
                we.field_g[7] = pi.field_b;
                if (var14 != 0) {
                  we.field_g[7] = kb.field_B;
                  we.field_g[7] = se.field_D;
                  we.field_g[7] = e.field_b;
                }
              } else {
                we.field_g[7] = kb.field_B;
                if (var14 != 0) {
                  we.field_g[7] = se.field_D;
                  we.field_g[7] = e.field_b;
                }
              }
            } else {
              we.field_g[7] = se.field_D;
              if (var14 != 0) {
                we.field_g[7] = e.field_b;
              }
            }
          } else {
            we.field_g[7] = e.field_b;
          }
          this.field_eb = false;
          this.field_db = false;
          this.field_J = new uf();
          this.field_Y = 0;
          this.field_u = new fh(param1);
          ip.b((byte) 111);
          gj.a(param0 + 6956);
          this.field_k = new nm(this.field_u.field_r, this.field_u.field_c);
          this.field_k.field_f = false;
          this.d(param1.field_j, 3);
          this.field_fb = op.field_m.field_r;
          this.field_ib = 1;
          this.field_O = new th();
          this.field_cb = new th();
          this.field_kb = new th();
          this.field_T = new th();
          this.field_hb = new th();
          this.field_C = new th();
          this.field_X = new th();
          this.field_c = new lq();
          var3_int = -2147483647;
          var4 = -2147483647;
          var5 = 2147483647;
          var6 = 2147483647;
          var7 = param1.a(-120);
          var8 = (id) (var7.c(param0 + 38));
          boolean decompiledNaturalLoopExit1 = false;
          while (!(decompiledNaturalLoopExit1 = (var8 == null))) {
            stackIn_112_0 = var8 instanceof h;
            if (var14 == 0) {
              if (stackIn_112_0) {
                boolean decompiledFrameRemainder0 = true;
                var9 = (h) (var8);
                if (op.field_m.field_t > var9.field_I) {
                  var9.field_I = op.field_m.field_y[var9.field_I];
                  this.field_H.a(var8, false);
                  this.field_c.a(29664, var8);
                  if (var9.field_I == this.field_M) {
                    var10 = var8.g(param0 + 83);
                    var11 = var8.h(74);
                    this.field_o = var9;
                    var12 = var10 - (var5 + var3_int) / 2;
                    var13 = -((var6 + var4) / 2) + var11;
                    if (var3_int == 2147483647 ||
                      !(Math.abs(var12) >= 640) &&
                      !(Math.abs(var13) >= 480)) {
                      if (var11 < var6) {
                        var6 = var11;
                      }
                      if (var11 > var4) {
                        var4 = var11;
                      }
                      if (var10 < var5) {
                        var5 = var10;
                      }
                      if (!(var10 <= var3_int)) {
                        var3_int = var10;
                      }
                      decompiledFrameRemainder0 = false;
                    }
                    else {
                      var5 = var10;
                      var3_int = var10;
                      var6 = var11;
                      var4 = var11;
                    }
                  }
                }
              } else if (!(var8 instanceof wb)) {
                if (var8 instanceof fd) {
                  this.field_H.a(var8, false);
                }
              } else {
                var9_ref = (wb) (var8);
                if (op.field_m.field_t > var9_ref.field_Lb &&
                  op.field_m.field_y[var9_ref.field_Lb] == this.field_M) {
                  var10 = var8.g(param0 ^ -37);
                  var11 = var8.h(-56);
                  var12 = var10 - (var3_int + var5) / 2;
                  var13 = -((var4 + var6) / 2) + var11;
                  if (var3_int == 2147483647 ||
                    !(Math.abs(var12) >= 640) &&
                    !(Math.abs(var13) >= 480)) {
                    if (var5 > var10) {
                      var5 = var10;
                    }
                    if (var11 > var4) {
                      var4 = var11;
                    }
                    if (var3_int < var10) {
                      var3_int = var10;
                    }
                    if (var6 > var11) {
                      var6 = var11;
                    }
                  }
                  if (df.field_I) {
                    gk.field_c = var11;
                    hc.field_c = var10;
                  }
                }
              }
              var8 = (id) (var7.b(6));
              continue;
            }
            break;
          }
          if (decompiledNaturalLoopExit1) {
            this.field_h = (var6 + var4) / 2;
            this.field_R = (var5 + var3_int) / 2;
            stackIn_112_0 = gf.field_h;
          }
          if (stackIn_112_0 ||
            df.field_I) {
            this.field_h = this.field_u.field_c / 2;
            this.field_R = this.field_u.field_r / 2;
          }
          this.field_k.a(this.field_h, (byte) -69, this.field_R);
          if (gf.field_h) {
            this.field_k.a(false);
          }
          g.a(this.field_H);
          this.field_j = 0;
          var8 = (id) (this.field_H.c(46));
          boolean decompiledNaturalLoopExit0 = false;
          while (!(decompiledNaturalLoopExit0 = (null == var8))) {
            stackOut_124_0 = var8 instanceof gm;
            stackIn_132_0 = stackOut_124_0 ? 1 : 0;
            stackIn_125_0 = stackOut_124_0;
            if (var14 == 0) {
              if (stackIn_125_0) {
                this.field_j = this.field_j + 1;
              }
              var8 = (id) (this.field_H.b(6));
              continue;
            }
            break;
          }
          if (decompiledNaturalLoopExit0) {
            stackIn_132_0 = -125;
          }
          ho.$cfr$intArgs$a$b55aceaa55ac(stackIn_132_0, this.field_u);
          var8_ref = (cg) (op.field_m.field_A.c(108));
          do {
            if (var8_ref == null) {
              na.a((byte) 127, this.field_u);
              ih.a(256);
              break;
            }
            var8_ref.a((byte) -85);
            var8_ref = (cg) (op.field_m.field_A.b(6));
          } while (var14 == 0);
          var8_ref2 = (ce) (op.field_m.field_s.c(72));
          L36: while (true) {
            if (var8_ref2 != null) {
              var8_ref2.a(this.field_u, -54);
              var8_ref2 = (ce) (op.field_m.field_s.b(6));
              if (var14 == 0) {
                continue;
              }
            } else {
              if (!gf.field_h) {
                this.field_I = new ko();
                if (!pp.field_n) {
                  var8_ref3 = ll.field_k;
                  var9_int = var8_ref3.g((byte) -116);
                  var10Lifetime1 = 0;
                  while (var9_int > var10Lifetime1) {
                    this.field_I.a(87, tg.field_e.field_d[var10Lifetime1], tg.field_e.field_f[var10Lifetime1]);
                    var10Lifetime1++;
                    if (var14 != 0) {
                      break L36;
                    }
                  }
                }
              }
              this.field_G = new qe();
            }
            break;
          }
          var8_ref4 = gm.field_pb[hp.a((byte) -90, g.field_a, gm.field_pb.length)];
          var9_ref2 = ah.field_e;
          this.field_y = new ja(var9_ref2.a(var8_ref4), var9_ref2.field_C + var9_ref2.field_r);
          this.field_L = new ja(12 + this.field_y.field_x, this.field_y.field_w + 12);
          g.c(this.field_y);
          this.field_l = 640;
          var9_ref2.b(var8_ref4, this.field_y.field_x / 2, this.field_y.field_w - var9_ref2.field_r, 2, -1);
          this.field_L.a();
          oo.b(0, 0, this.field_L.field_x, this.field_L.field_w, 12, 8421504, 80);
          this.field_y.f(6, param0, 16777215);
          oo.i(4, 4, 0, 0, oo.field_b, oo.field_l);
          this.field_y.f(6, 6, 0);
          g.d();
          if (op.field_m.field_t == 1) {
            this.field_l = 0;
          }
          this.field_G.c(0);
          if (!df.field_I) {
            if (!gf.field_h ||
              op.field_m.field_l != 0) {
              this.a((byte) -110, op.field_m.field_l, op.field_m.field_C);
              if (var14 != 0) {
                this.a((byte) -36, 1, 0);
                this.field_k.field_f = false;
                op.field_m.field_l = 1;
              }
            } else {
              this.a((byte) -36, 1, 0);
              if (var14 != 0) {
                this.field_k.field_f = false;
                op.field_m.field_l = 1;
              }
            }
          } else {
            this.field_k.field_f = false;
            op.field_m.field_l = 1;
          }
          this.field_W = op.field_m.field_H - 50;
          this.field_t = bl.a((byte) 43);
          this.field_G.a(this.field_Z, false);
          this.a(21);
          op.field_m.field_D = new int[4][2];
          op.field_m.field_D[0][0] = 9089042;
          op.field_m.field_D[0][1] = 2473480;
          op.field_m.field_D[1][0] = 11498997;
          op.field_m.field_D[1][1] = 8165621;
          op.field_m.field_D[2][0] = 13542477;
          op.field_m.field_D[2][1] = 13843485;
          op.field_m.field_D[3][1] = 16054670;
          op.field_m.field_D[3][0] = 9796207;
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3 = decompiledCaughtException;
          stackIn_180_0 = var3;
          stackIn_180_1 = new StringBuilder().append("qd.FB(").append(param0).append(',');
          if (param1 == null) {
            stackIn_181_2 = "null";
          } else {
            stackIn_181_2 = "{...}";
          }
          throw fa.a((Throwable) ((Object) stackIn_180_0), ((StringBuilder) (Object) stackIn_180_1).append(stackIn_181_2).append(')').toString());
        }
    }

    private final void a(int param0) {
        RuntimeException runtimeException = null;
        int var2_int = 0;
        RuntimeException decompiledCaughtException = null;
        try {
          var2_int = -11 % ((param0 + 61) / 43);
          if (!df.field_I) {
            lb.a(this.field_ib, false, this.field_fb);
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          runtimeException = decompiledCaughtException;
          throw fa.a((Throwable) ((Object) runtimeException), "qd.QA(" + param0 + ')');
        }
    }

    final void a(int param0, int param1, byte param2, int[] param3) {
        si var5 = null;
        boolean stackIn_6_0 = false;
        int stackIn_6_1 = 0;
        ug[] stackIn_6_2 = null;
        int stackIn_7_3;
        RuntimeException stackIn_12_0 = null;
        StringBuilder stackIn_12_1 = null;
        String stackIn_13_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var5_ref = null;
        try {
          if (param2 < 116) {
            this.e(95, -38, -6);
          }
          this.field_lb = true;
          op.field_m.field_c = true;
          this.a((byte) -57, 3, 0);
          this.field_d = 450;
          var5 = (si) (gk.a(2, 10));
          var5.a(param1, 0, param0, param3, op.field_m);
          stackIn_6_0 = false;
          stackIn_6_1 = 256;
          stackIn_6_2 = hl.field_d;
          if (~param0 == ~this.field_M) {
            stackIn_7_3 = 13;
          } else {
            stackIn_7_3 = 14;
          }
          ih.a(stackIn_6_0, stackIn_6_1, stackIn_6_2[stackIn_7_3]);
          td.field_b = hl.field_d[11];
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var5_ref = decompiledCaughtException;
          stackIn_12_0 = var5_ref;
          stackIn_12_1 = new StringBuilder().append("qd.S(").append(param0).append(',').append(param1).append(',').append(param2).append(',');
          if (param3 == null) {
            stackIn_13_2 = "null";
          } else {
            stackIn_13_2 = "{...}";
          }
          throw fa.a((Throwable) ((Object) stackIn_12_0), ((StringBuilder) (Object) stackIn_12_1).append(stackIn_13_2).append(')').toString());
        }
    }

    private final void b(int param0) {
        RuntimeException runtimeException = null;
        wb var2 = null;
        int var3 = 0;
        RuntimeException decompiledCaughtException = null;
        var3 = ZombieDawnMulti.field_E ? 1 : 0;
        try {
          if (this.field_Q.a((byte) 98) == 0) {
            return;
          }
          var2 = (wb) (this.field_Q.c((byte) 112));
          while (var2 != null) {
            var2.t(16);
            var2 = (wb) (this.field_Q.b((byte) 88));
            if (var3 != 0) {
              return;
            }
          }
          if (param0 > -50) {
            this.a((int[]) null, false);
          }
          this.field_Q.d(-1);
          iq.a(-6, (byte) 99);
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          runtimeException = decompiledCaughtException;
          throw fa.a((Throwable) ((Object) runtimeException), "qd.H(" + param0 + ')');
        }
    }

    final void c(int param0, int param1, int param2) {
        try {
          op.field_m.field_a[param0] = param1;
          if (param2 != -2) {
            this.field_O = (th) null;
          }
        } catch (RuntimeException runtimeException) {
          throw fa.a((Throwable) ((Object) runtimeException), "qd.EA(" + param0 + ',' + param1 + ',' + param2 + ')');
        }
    }

    final void a(int param0, int param1, int param2, int param3, int param4) {
        wb var6 = null;
        gm var7 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var6_ref = null;
        try {
          try {
            var6 = op.field_m.a(param2, false);
            var7 = op.field_m.a(param4, -81);
            if (var6 != null &&
              null != var7) {
              if (param0 != -1181) {
                field_r = (String) null;
              }
              var6.field_z = param3 << 16;
              var6.field_Eb = var7;
              var6.field_E = param1 << 16;
              var7.n(20);
              var6.b(8, param0 ^ 26778);
              return;
            }
            return;
          } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
            decompiledCaughtException = decompiledCaughtParameter0;
            var6_ref = decompiledCaughtException;
            return;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter1) {
          decompiledCaughtException = decompiledCaughtParameter1;
          var6_ref = decompiledCaughtException;
          throw fa.a((Throwable) ((Object) var6_ref), "qd.PA(" + param0 + ',' + param1 + ',' + param2 + ',' + param3 + ',' + param4 + ')');
        }
    }

    private final void b(boolean param0) {
        int fieldTemp$0 = 0;
        RuntimeException decompiledCaughtException = null;
        wb var2 = null;
        RuntimeException var2_ref = null;
        int var3 = 0;
        wb var2Lifetime1;
        var3 = ZombieDawnMulti.field_E ? 1 : 0;
        try {
          if (!param0) {
            return;
          }
          if (op.field_m.field_l == 0) {
            if (this.field_W < 400) {
              return;
            }
            this.a((byte) -25, 1, op.field_m.field_C);
            if (var3 == 0) {
              return;
            }
          }
          if (op.field_m.field_l != 3 &&
            !op.field_m.field_c) {
            if (op.field_m.field_l == 2) {
              if ((op.field_m.field_C - 1550) > op.field_m.field_H) {
                return;
              }
              cj.d(!param0, 12);
              if (var3 == 0) {
                return;
              }
            }
            if (!df.field_I) {
              return;
            }
            if (0 != op.field_m.field_m[this.field_M]) {
              return;
            }
            if (pp.field_n &&
              hg.field_rb != 11) {
              var2 = new wb(hc.field_c, gk.field_c, 0);
              var2.field_Lb = this.field_M;
              var2.field_y = op.field_m.a(-16777216);
              op.field_m.field_K.a(-25612, var2);
              op.field_m.field_m[this.field_M] = op.field_m.field_m[this.field_M] + 1;
              var2Lifetime1 = new wb(hc.field_c, gk.field_c - 30, 1);
              var2Lifetime1.field_Lb = this.field_M;
              var2Lifetime1.field_y = op.field_m.a(-16777216);
              op.field_m.field_K.a(-25612, var2Lifetime1);
              op.field_m.field_m[this.field_M] = op.field_m.field_m[this.field_M] + 1;
              iq.a(-12, (byte) 99);
              if (var3 == 0) {
                return;
              }
            } else {
              if (ai.field_b != 21 ||
                hg.field_rb != 11) {
                ec.field_c = false;
                if (var3 != 0) {
                  ud.field_S = true;
                  ec.field_c = true;
                }
              } else {
                ud.field_S = true;
                ec.field_c = true;
              }
              wb.l((byte) 123);
              bm.a(false, 15, 126, sp.field_g);
              return;
            }
          }
          this.field_eb = false;
          fieldTemp$0 = this.field_d;
          this.field_d = this.field_d - 1;
          if (0 == fieldTemp$0) {
            bm.a(false, 10, 126, sp.field_g);
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2_ref = decompiledCaughtException;
          throw fa.a((Throwable) ((Object) var2_ref), "qd.CB(" + param0 + ')');
        }
    }

    final void a(int param0, int param1, int param2, int param3, int param4, int param5, int param6, int param7) {
        RuntimeException decompiledCaughtException = null;
        wb var9 = null;
        RuntimeException var9_ref = null;
        try {
          var9 = op.field_m.a(param0, false);
          if (var9 == null) {
            return;
          }
          if (23 != param7 &&
            param7 != 28 &&
            param7 != 15 &&
            27 != param7 &&
            17 != param7 &&
            25 != param7 &&
            param7 != 13 &&
            29 != param7 &&
            param7 != 33) {
            if (var9.field_K == 5 &&
              param7 == 4) {
              return;
            }
            if (~param7 != ~var9.field_K) {
              var9.b(param7, -27655);
            }
            var9.field_E = param6;
            var9.field_z = param1;
            var9.a(this.field_u.b(var9.g(-116), param4, var9.h(param2 - 65), param5, 8760), 88);
            var9.d(6, param3);
          }
          if (23 == param7 ||
            param7 == 28 ||
            param7 == 15 ||
            27 == param7 ||
            17 == param7 ||
            25 == param7 ||
            param7 == 13 ||
            29 == param7 ||
            param7 == 33 || ZombieDawnMulti.field_E) {
            var9.b(param7, -27655);
          }
          if (param2 != -34) {
            this.c(false, -121);
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var9_ref = decompiledCaughtException;
          throw fa.a((Throwable) ((Object) var9_ref), "qd.C(" + param0 + ',' + param1 + ',' + param2 + ',' + param3 + ',' + param4 + ',' + param5 + ',' + param6 + ',' + param7 + ')');
        }
    }

    private final void a(boolean param0, int param1, int param2) {
        int var4_int = 0;
        int var5 = 0;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var4 = null;
        var5 = ZombieDawnMulti.field_E ? 1 : 0;
        try {
          en.a(-1, 0);
          var4_int = this.field_n;
          if (var4_int == 0 &&
            var5 == 0 || var4_int == 1) {
            if (var4_int == 0 &&
              var5 == 0 || var5 != 0) {
              if (this.field_I.h(1)) {
                return;
              }
              this.b(-93);
            }
            if ((var4_int != 0 ||
              var5 != 0) && var5 == 0 || var5 != 0) {
              if (this.field_I.h(1)) {
                return;
              }
              if (0 < this.field_Q.a((byte) 98) &&
                40 < param1 &&
                param1 < 440) {
                this.b((byte) 104, this.field_k.a(true, param1), this.field_k.a(param2, 2));
              }
            }}
          if (!param0) {
            this.field_i = (int[]) null;
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var4 = decompiledCaughtException;
          throw fa.a((Throwable) ((Object) var4), "qd.A(" + param0 + ',' + param1 + ',' + param2 + ')');
        }
    }

    final int g(int param0) {
        int stackIn_1_0 = 0;
        RuntimeException decompiledCaughtException = null;
        int var2_int = 0;
        RuntimeException var2 = null;
        try {
          var2_int = 25 / ((-72 - param0) / 49);
          stackIn_1_0 = wq.field_a;
          return stackIn_1_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2 = decompiledCaughtException;
          throw fa.a((Throwable) ((Object) var2), "qd.IA(" + param0 + ')');
        }
    }

    private final void d(int param0, int param1, int param2) {
        RuntimeException runtimeException = null;
        int var4_int = 0;
        RuntimeException decompiledCaughtException = null;
        try {
          if (param2 != -30305) {
            return;
          }
          var4_int = param0;
          if (1 != var4_int) {
            if (var4_int != 2) {
              return;
            }
            if (!ZombieDawnMulti.field_E) {
              return;
            }
          }
          op.field_m.field_H = param1;
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          runtimeException = decompiledCaughtException;
          throw fa.a((Throwable) ((Object) runtimeException), "qd.D(" + param0 + ',' + param1 + ',' + param2 + ')');
        }
    }

    private final boolean c(byte param0) {
        int var2_int = 0;
        RuntimeException var2 = null;
        boolean stackIn_7_0 = false;
        RuntimeException decompiledCaughtException = null;
        try {
          var2_int = -104 % ((param0 - 59) / 39);
          stackIn_7_0 = (op.field_m.field_l == 1) || (op.field_m.field_l == 2);
          return stackIn_7_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2 = decompiledCaughtException;
          throw fa.a((Throwable) ((Object) var2), "qd.EB(" + param0 + ')');
        }
    }

    final static cj a(int param0, fm param1, int param2, int param3, int param4, int param5, int param6, byte param7, int param8, int param9, int param10, int param11, int param12) {
        cj var13 = null;
        RuntimeException var13_ref = null;
        int var14 = 0;
        cj stackIn_1_0 = null;
        RuntimeException stackIn_5_0 = null;
        StringBuilder stackIn_5_1 = null;
        String stackIn_6_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          var13 = new cj(0L, (cj) null);
          var14 = -121 % ((param7 - 81) / 36);
          var13.field_ab = bk.a(param3, param6, (byte) 28);
          var13.field_X = bk.a(param4, param11, (byte) 28);
          var13.field_S = bk.a(param9, param0, (byte) 28);
          var13.field_gb = bk.a(param12, param5, (byte) 28);
          var13.field_Bb = bk.a(param2, param10, (byte) 28);
          var13.field_yb = param1;
          var13.field_M = param8;
          stackIn_1_0 = var13;
          return stackIn_1_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var13_ref = decompiledCaughtException;
          stackIn_5_0 = var13_ref;
          stackIn_5_1 = new StringBuilder().append("qd.N(").append(param0).append(',');
          if (param1 == null) {
            stackIn_6_2 = "null";
          } else {
            stackIn_6_2 = "{...}";
          }
          throw fa.a((Throwable) ((Object) stackIn_5_0), ((StringBuilder) (Object) stackIn_5_1).append(stackIn_6_2).append(',').append(param2).append(',').append(param3).append(',').append(param4).append(',').append(param5).append(',').append(param6).append(',').append(param7).append(',').append(param8).append(',').append(param9).append(',').append(param10).append(',').append(param11).append(',').append(param12).append(')').toString());
        }
    }

    final void b(byte param0) {
        try {
          this.field_n = ll.field_k.b((byte) -1);
          int var2_int = -91 % ((param0 + 12) / 44);
        } catch (RuntimeException runtimeException) {
          throw fa.a((Throwable) ((Object) runtimeException), "qd.JA(" + param0 + ')');
        }
    }

    final void a(int param0, boolean param1, int param2, byte param3, int param4) {
        boolean stackIn_6_0 = false;
        int stackIn_30_0 = 0;
        RuntimeException decompiledCaughtException = null;
        boolean stackOut_5_0;
        ti[] var6 = null;
        RuntimeException var6_ref = null;
        int[] var7 = null;
        int var8 = 0;
        br var9_ref_br = null;
        int var9 = 0;
        ti var10 = null;
        int var11 = 0;
        int var12 = 0;
        wb var13 = null;
        int var14 = 0;
        var14 = ZombieDawnMulti.field_E ? 1 : 0;
        try {
          g.field_a.setSeed((long)(param4 + ((param2 << 5) + param0)));
          if (param3 != -40) {
            return;
          }
          var6 = new ti[this.field_H.a(0)];
          var7 = new int[this.field_H.a(0)];
          d.a(var7, 0, var7.length, 32767);
          var8 = 0;
          var9_ref_br = this.field_H.c(94);
          boolean decompiledNaturalLoopExit0 = false;
          while (!(decompiledNaturalLoopExit0 = (!(var9_ref_br instanceof id)))) {
            stackOut_5_0 = var9_ref_br instanceof ti;
            stackIn_30_0 = stackOut_5_0 ? 1 : 0;
            stackIn_6_0 = stackOut_5_0;
            if (var14 == 0) {
              boolean decompiledFrameRemainder0 = true;
              if (stackIn_6_0) {
                var10 = (ti) (var9_ref_br);
                var11 = var10.g(108) - param0;
                var12 = -param2 + var10.h(-102);
                if (14400 >= var12 * var12 + var11 * var11) {
                  if (!param1 ||
                    !(var10 instanceof wb)) {
                    if (!(!(var10 instanceof gm))) {
                      var6[var8] = var10;
                      var7[var8] = var10.field_y;
                      var8++;
                    }
                    decompiledFrameRemainder0 = false;
                  }
                  else {
                    var13 = (wb) (var10);
                    if (~var13.field_Lb != ~param4) {
                      var6[var8] = (ti) ((Object) var13);
                      var7[var8] = var13.field_y;
                      var8++;
                    }
                  }
                }
              }
              var9_ref_br = this.field_H.b(6);
              continue;
            }
            break;
          }
          if (decompiledNaturalLoopExit0) {
            vh.a(-7255, var7, var6);
            stackIn_30_0 = 0;
          }
          var9 = stackIn_30_0;
          while (var8 > var9) {
            var10 = var6[var9];
            if (var14 != 0) {
              return;
            }
            if (!(var10 instanceof wb) ||
              !op.field_m.b(param3 ^ -40, ((wb) (var10)).field_Lb)) {
              var6[var9].e(param4, 2);
            }
            var9++;
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var6_ref = decompiledCaughtException;
          throw fa.a((Throwable) ((Object) var6_ref), "qd.BA(" + param0 + ',' + param1 + ',' + param2 + ',' + param3 + ',' + param4 + ')');
        }
    }

    final static void c(int param0) {
        try {
          ki.field_e = new no(wa.field_a, kc.field_c, jf.field_a, vo.field_m, jk.field_h, cm.field_b);
          if (param0 != 4024) {
            qd.a(-96, (fm) null, 119, -9, -35, -122, 29, (byte) 90, -18, -112, -60, -50, 117);
          }
        } catch (RuntimeException runtimeException) {
          throw fa.a((Throwable) ((Object) runtimeException), "qd.Q(" + param0 + ')');
        }
    }

    final void a(boolean param0, int param1, boolean param2) {
        RuntimeException decompiledCaughtException = null;
        RuntimeException var4 = null;
        try {
          gj.a(param1 - 17333);
          if (this.field_lb) {
            return;
          }
          this.field_lb = true;
          if (param1 != 24295) {
            this.d(27, 73);
          }
          bm.a(false, 10, 126, sp.field_g);
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var4 = decompiledCaughtException;
          throw fa.a((Throwable) ((Object) var4), "qd.LA(" + param0 + ',' + param1 + ',' + param2 + ')');
        }
    }

    private final void a(int param0, byte param1, int param2) {
        RuntimeException decompiledCaughtException = null;
        RuntimeException var4 = null;
        int var5 = 0;
        var5 = ZombieDawnMulti.field_E ? 1 : 0;
        try {
          if (na.b(param2, 20, param0)) {
            return;
          }
          boolean decompiledFrameRemainder1 = true;
          if (iq.field_f ||
            !this.field_I.b(param0, 0, param2)) {
            boolean decompiledFrameRemainder0 = true;
            if (this.field_I.a(20) &&
              this.field_mb != null &&
              !this.field_mb.i((byte) -15)) {
              this.field_I.a(this.field_k.a(true, param0), this.field_mb, this.field_k.a(param2, 2), 122);
              decompiledFrameRemainder1 = (var5 == 0);
            } else {
              if (this.field_I.a(20) &&
                this.field_b != null) {
                this.field_I.a(this.field_k.a(true, param0), this.field_b, this.field_k.a(param2, 2), 123);
                decompiledFrameRemainder0 = (var5 != 0);
              }
              if (decompiledFrameRemainder0) {
                if (this.field_I.a(true) &&
                  this.field_mb != null &&
                  this.field_mb.i((byte) -58)) {
                  if (!this.field_I.a((byte) -126)) {
                    this.b(-70);
                  }
                  this.field_Q.a(29664, this.field_mb);
                  if (!this.field_I.a((byte) -115)) {
                    this.field_mb.r(0);
                  }
                  this.field_I.a(this.field_k.a(true, param0), this.field_mb, this.field_k.a(param2, 2), 122);
                  return;
                }
                if (!this.field_I.g(13) ||
                  this.field_x == null) {
                  if (this.field_I.f(0)) {
                    if (!bk.field_g) {
                      return;
                    }
                    this.field_I.a(this.field_k.a(true, param0), this.field_x, this.field_k.a(param2, 2), 127);
                    return;
                  }
                  if (this.field_mb != null &&
                    this.field_mb.i((byte) -86)) {
                    if (!lc.field_m[81]) {
                      this.b(-51);
                    }
                    this.field_mb.r(0);
                    this.field_Q.a(29664, this.field_mb);
                    iq.a(-3, (byte) 99);
                    decompiledFrameRemainder0 = (var5 != 0);
                  }
                  if (decompiledFrameRemainder0) {
                    if ((this.field_n != 0 ||
                      !(this.field_Q.a((byte) 98) > 0)) &&
                      (decompiledFrameRemainder0 = (this.field_n == 1))) {
                      this.b(-128);
                      decompiledFrameRemainder0 = (var5 != 0);
                    }
                    if ((decompiledFrameRemainder0) &&
                      (decompiledFrameRemainder0 = !(this.field_I.a((byte) -127))) &&
                      (decompiledFrameRemainder0 = !(param0 <= 40)) &&
                      (decompiledFrameRemainder0 = !(440 <= param0))) {
                      this.b((byte) 57, this.field_k.a(true, param0), this.field_k.a(param2, 2));
                      decompiledFrameRemainder0 = (var5 != 0);
                    }
                  }
                }
                if (decompiledFrameRemainder0) {
                  this.b(-56);
                  this.field_I.a(this.field_k.a(true, param0), this.field_x, this.field_k.a(param2, 2), 117);
                  return;
                }
              }
            }
            if (decompiledFrameRemainder1) {
              if (param1 > -97) {
                this.field_I = (ko) null;
              }
              return;
            }
          }
          en.a(-1, 1);
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var4 = decompiledCaughtException;
          throw fa.a((Throwable) ((Object) var4), "qd.CA(" + param0 + ',' + param1 + ',' + param2 + ')');
        }
    }

    final void a(byte param0, int param1, int param2, int param3) {
        boolean discarded$0 = false;
        try {
          op.field_m.field_A.a(new cg(param3, param1, param2), false);
          if (param0 < 79) {
            discarded$0 = this.c((byte) -123);
          }
        } catch (RuntimeException runtimeException) {
          throw fa.a((Throwable) ((Object) runtimeException), "qd.F(" + param0 + ',' + param1 + ',' + param2 + ',' + param3 + ')');
        }
    }

    final void a(byte param0, int param1, int param2) {
        RuntimeException decompiledCaughtException = null;
        int var4_int = 0;
        br var4 = null;
        id var4_ref = null;
        RuntimeException var4_ref2 = null;
        wb var5 = null;
        int var6 = 0;
        var6 = ZombieDawnMulti.field_E ? 1 : 0;
        try {
          op.field_m.field_l = param1;
          if (param0 > -8) {
            this.b((byte) -48);
          }
          var4_int = op.field_m.field_l;
          if (var4_int != 0) {
            if (2 != var4_int) {
              if (var4_int == 1) {
                return;
              }
              if (3 != var4_int) {
                return;
              }
              if (var6 == 0) {
                we.field_g[7] = pi.field_b;
                var4 = op.field_m.field_K.c(86);
                while (true) {
                  if (null == var4) {
                    return;
                  }
                  if (var4 instanceof wb) {
                    var5 = (wb) (var4);
                    if (var5.field_K != 21) {
                      var5.b(4, -27655);
                    }
                  }
                  var4 = op.field_m.field_K.b(6);
                }
              }
            }
            if (df.field_I) {
              wb.l((byte) -68);
              bm.a(false, 15, 125, sp.field_g);
              return;
            }
            var4_ref = (id) (this.field_c.c((byte) 91));
            do {
              if (null == var4_ref) {
                op.field_m.field_C = param2;
                break;
              }
              ((h) (var4_ref)).c(2, 49951);
              var4_ref = (id) (this.field_c.b((byte) 117));
            } while (var6 == 0);
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var4_ref2 = decompiledCaughtException;
          throw fa.a((Throwable) ((Object) var4_ref2), "qd.AA(" + param0 + ',' + param1 + ',' + param2 + ')');
        }
    }

    final void b(boolean param0, int param1) {
        boolean stackIn_78_0 = false;
        int stackIn_89_0 = 0;
        int stackIn_103_0 = 0;
        int stackIn_103_1 = 0;
        int stackIn_112_0;
        int stackIn_112_1;
        int stackIn_112_2;
        int stackIn_112_3;
        int stackIn_113_4;
        int stackIn_117_0 = 0;
        int stackIn_121_0 = 0;
        boolean stackIn_153_0 = false;
        int stackIn_164_0 = 0;
        boolean stackIn_191_0 = false;
        int stackIn_241_0 = 0;
        int stackIn_260_0 = 0;
        int stackIn_261_0 = 0;
        int stackIn_261_1 = 0;
        int stackIn_348_0 = 0;
        int stackIn_351_1 = 0;
        int stackIn_352_2 = 0;
        RuntimeException decompiledCaughtException = null;
        boolean stackOut_152_0;
        boolean stackOut_190_0;
        int var3_int = 0;
        RuntimeException var3 = null;
        int var4 = 0;
        int var5 = 0;
        Object var6 = null;
        lc var7_ref_lc = null;
        int var7 = 0;
        wb var7_ref_wb = null;
        int var8_int = 0;
        sl var8 = null;
        int var9_int = 0;
        int[] var9 = null;
        String var9_ref = null;
        ae var9_ref2 = null;
        int var10 = 0;
        wb var10_ref_wb = null;
        h var10_ref_h = null;
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
        h var10_ref_hLifetime1;
        int stackIn_103_0Lifetime1;
        int stackIn_103_1Lifetime1;
        int var3_intLifetime1;
        int var4Lifetime1;
        int var14Lifetime1;
        int var15Lifetime1;
        int var16Lifetime1;
        int var17Lifetime1;
        int var18Lifetime1;
        int var14Lifetime2;
        int var14Lifetime1Lifetime1;
        var20 = ZombieDawnMulti.field_E ? 1 : 0;
        try {
          g.c(ki.field_k);
          if (!he.field_a) {
            oo.h(0, 40, (int)(640.0f * this.field_k.field_d), (int)(480.0f * this.field_k.field_d) - 40);
            if (var20 != 0) {
              oo.c();
            }
          } else {
            oo.c();
          }
          var3_int = 0;
          var4 = 0;
          var5 = oa.a((byte) 71);
          if (var5 <= 0) {
            var3_intLifetime1 = this.field_k.field_k;
            var4Lifetime1 = this.field_k.field_g;
            if (null != lp.field_k) {
              aa.a(true, lp.field_k);
              lp.field_k = null;
              if (var20 != 0) {
                if (null == lp.field_k) {
                  lp.field_k = wc.b(-1, 89);
                }
                lp.field_k.h(20 * var5 * db.field_c / 256);
                var3_intLifetime1 = -(var5 / 2) + (this.field_k.field_k + hp.a((byte) -123, qf.field_a, var5));
                var4Lifetime1 = -(var5 / 2) + (this.field_k.field_g + hp.a((byte) 36, qf.field_a, var5));
                this.field_k.field_g = var4Lifetime1;
                this.field_k.field_k = var3_intLifetime1;
              }
            }
          } else {
            if (null == lp.field_k) {
              lp.field_k = wc.b(-1, 89);
            }
            lp.field_k.h(20 * var5 * db.field_c / 256);
            var3_intLifetime1 = -(var5 / 2) + (this.field_k.field_k + hp.a((byte) -123, qf.field_a, var5));
            var4Lifetime1 = -(var5 / 2) + (this.field_k.field_g + hp.a((byte) 36, qf.field_a, var5));
            this.field_k.field_g = var4Lifetime1;
            this.field_k.field_k = var3_intLifetime1;
          }
          this.field_u.a((byte) 111, this.field_k);
          var6 = op.field_m.field_A.c(98);
          do {
            if (null == var6) {
              var6 = this.field_cb.c(122);
              break;
            }
            ((cg) (var6)).a(this.field_k, param1 + 58);
            var6 = op.field_m.field_A.b(6);
          } while (var20 == 0);
          L9: while (true) {
            if (var6 != null) {
              ((rj) (var6)).a(-10136, this.field_k);
              var6 = this.field_cb.b(6);
              if (var20 == 0) {
                continue;
              }
            } else {
              var6 = this.field_c.c((byte) 104);
              while (null != var6) {
                ((h) (var6)).a(this.field_k, 13542477);
                var6 = this.field_c.b((byte) 101);
                if (var20 != 0) {
                  break L9;
                }
              }
              var6 = op.field_m.field_G.c(113);
            }
            break;
          }
          do {
            if (var6 == null) {
              this.field_u.a(param1, false, this.field_k, -1);
              break;
            }
            ((pq) (var6)).a(255, this.field_k);
            var6 = op.field_m.field_G.b(param1 ^ 7);
          } while (var20 == 0);
          var6 = op.field_m.field_s.c(param1 ^ 116);
          do {
            if (var6 == null) {
              var6 = this.field_H.c(48);
              break;
            }
            ((ce) (var6)).a((byte) 19, this.field_k);
            var6 = op.field_m.field_s.b(param1 ^ 7);
          } while (var20 == 0);
          do {
            if (var6 == null) {
              var6 = this.field_kb.c(103);
              break;
            }
            ((id) (var6)).a(-10136, this.field_k);
            var6 = this.field_H.b(param1 ^ 7);
          } while (var20 == 0);
          do {
            if (null == var6) {
              var6 = this.field_O.c(88);
              break;
            }
            ((mg) (var6)).a(-10136, this.field_k);
            var6 = this.field_kb.b(6);
          } while (var20 == 0);
          do {
            if (var6 == null) {
              this.field_u.a(2, false, this.field_k, -1);
              this.field_u.a(3, false, this.field_k, -1);
              break;
            }
            ((lj) (var6)).a((byte) 103, this.field_k);
            var6 = this.field_O.b(6);
          } while (var20 == 0);
          var6 = this.field_C.c(param1 + 107);
          boolean decompiledNaturalLoopExit1 = false;
          while (!(decompiledNaturalLoopExit1 = (var6 == null))) {
            var7_ref_lc = (lc) (var6);
            stackIn_78_0 = var7_ref_lc.a(16711680, this.field_k);
            if (var20 == 0) {
              if (!stackIn_78_0) {
                var7_ref_lc.a(true);
                this.field_X.a(var7_ref_lc, false);
              }
              var6 = this.field_C.b(6);
              continue;
            }
            break;
          }
          if (decompiledNaturalLoopExit1) {
            stackIn_78_0 = gf.field_h;
          }
          if (!stackIn_78_0) {
            boolean decompiledFrameCompleted1 = true;
            var7 = this.field_I.b(false);
            if (var7 > 0 &&
              6 != wf.field_t) {
              stackIn_89_0 = (this.field_I.e(-1) != 9) ? 0 : 1;
              var8_int = stackIn_89_0;
              var9_int = this.field_k.a(-(int)((float)(24 * var7) / this.field_k.field_d) + bd.field_g, 2);
              var10 = this.field_k.a(true, bo.field_d - (int)((float)(var7 * 24) / this.field_k.field_d));
              var11 = var9_int / 24;
              var12 = var10 / 24;
              var13 = var12 + 2 * var7;
              var14 = var11 + 2 * var7;
              if (var13 > this.field_u.field_i.field_e) {
                var13 = this.field_u.field_i.field_e;
              }
              if (var12 < 0) {
                var12 = 0;
              }
              if (0 > var11) {
                var11 = 0;
              }
              if (this.field_u.field_i.field_d < var14) {
                var14 = this.field_u.field_i.field_d;
              }
              var15 = var12;
              while (true) {
                stackIn_103_0 = ~var15;
                stackIn_103_1 = ~var13;
                if (stackIn_103_0 <= stackIn_103_1) {
                  break;
                }
                stackIn_117_0 = var11;
                if (var20 != 0) {
                  decompiledFrameCompleted1 = false;
                  break;
                }
                var16 = stackIn_117_0;
                while (var14 > var16) {
                  var17 = this.field_u.a(var16, var15, (byte) -116);
                  stackIn_103_0Lifetime1 = 0;
                  stackIn_103_1Lifetime1 = -2147483648 & var17;
                  if (stackIn_103_0Lifetime1 == stackIn_103_1Lifetime1) {
                    var18 = this.field_k.c(24 * var16, -20126);
                    var19 = this.field_k.d(24 * var15, param1 + 107);
                    stackIn_112_0 = var18;
                    stackIn_112_1 = var19;
                    stackIn_112_2 = 24;
                    stackIn_112_3 = 24;
                    if (var8_int != 0) {
                      stackIn_113_4 = 12272691;
                    } else {
                      stackIn_113_4 = 3390259;
                    }
                    oo.f(stackIn_112_0, stackIn_112_1, stackIn_112_2, stackIn_112_3, stackIn_113_4, 128);
                  }
                  var16++;
                }
                var15++;
              }
            }
            if (decompiledFrameCompleted1) {
              stackIn_117_0 = 15;
            }
            stackIn_121_0 = (stackIn_117_0 != this.field_I.e(-1)) ? 0 : 1;
            var8_int = stackIn_121_0;
            if (var8_int != 0) {
              var9_int = this.field_k.a(bd.field_g - (int)((float)(var7 * 24) / this.field_k.field_d), 2);
              var10 = this.field_k.a(true, bo.field_d - (int)((float)(24 * var7) / this.field_k.field_d));
              var11 = var9_int / 24;
              var12 = var10 / 24;
              var13 = var7 * 2 + var12;
              if (var13 > this.field_u.field_i.field_e) {
                var13 = this.field_u.field_i.field_e;
              }
              var14Lifetime2 = 2 * var7 + var11;
              if (0 > var12) {
                var12 = 0;
              }
              if (var11 < 0) {
                var11 = 0;
              }
              if (this.field_u.field_i.field_d < var14Lifetime2) {
                var14Lifetime2 = this.field_u.field_i.field_d;
              }
              var15Lifetime1 = var14Lifetime2 + var11 >> 1;
              var16Lifetime1 = var12 + var13 >> 1;
              var17Lifetime1 = this.field_k.c(24 * var15Lifetime1, -20126);
              var18Lifetime1 = this.field_k.d(var16Lifetime1 * 24, 126);
              oo.d(var17Lifetime1, var18Lifetime1, 120, 0, 128);
            }
          }
          if (~(1280 / ke.field_b) != ~so.field_l.field_x) {
            if (kj.field_q >= 2) {
              System.out.println("realloc influence buffer, detail " + ke.field_b);
            }
            so.field_l = new ja(1280 / ke.field_b, 960 / ke.field_b);
          }
          boolean decompiledFrameCompleted0 = true;
          boolean decompiledFrameCompleted3 = true;
          boolean decompiledFrameRemainder1 = true;
          boolean decompiledFrameCompleted2 = true;
          if (gf.field_h) {
            var7 = 0;
            do {
              if (!(op.field_m.field_m.length > var7)) {
                var6 = this.field_H.c(123);
                break;
              }
              op.field_m.field_m[var7] = 0;
              var7++;
            } while (var20 == 0);
            while (var6 != null) {
              stackOut_152_0 = var6 instanceof wb;
              stackIn_260_0 = stackOut_152_0 ? 1 : 0;
              stackIn_153_0 = stackOut_152_0;
              if (var20 != 0) {
                decompiledFrameCompleted3 = false;
                break;
              }
              if (stackIn_153_0) {
                var7_ref_wb = (wb) (var6);
                op.field_m.field_m[var7_ref_wb.field_Lb] = op.field_m.field_m[var7_ref_wb.field_Lb] + 1;
              }
              var6 = this.field_H.b(6);
            }
            decompiledFrameRemainder1 = !(decompiledFrameCompleted3);
          }
          if ((decompiledFrameRemainder1) &&
            (decompiledFrameCompleted3)) {
            var7 = 4210753;
            stackIn_164_0 = (ll.field_k.field_k == 1) ? 0 : 1;
            var8_int = stackIn_164_0;
            if (var8_int != 0) {
              var9 = so.field_l.field_B;
              var10 = 0;
              var11 = so.field_l.field_x * so.field_l.field_w - 7;
              do {
                if (var10 >= var11) {
                  var11 += 7;
                  break;
                }
                var9[var10++] = var7;
                var9[var10++] = var7;
                var9[var10++] = var7;
                var9[var10++] = var7;
                var9[var10++] = var7;
                var9[var10++] = var7;
                var9[var10++] = var7;
                var9[var10++] = var7;
              } while (var20 == 0);
              while (var10 < var11) {
                var9[var10++] = var7;
                if (var20 != 0) {
                  decompiledFrameCompleted2 = false;
                  break;
                }
              }
            }
            if (decompiledFrameCompleted2) {
              var9_int = 0;
              do {
                if (!(op.field_m.field_m.length > var9_int)) {
                  var9_int = 350;
                  var9_int = var9_int / ke.field_b;
                  break;
                }
                op.field_m.field_m[var9_int] = 0;
                var9_int++;
              } while (var20 == 0);
              var6 = this.field_H.c(param1 + 113);
              boolean decompiledNaturalLoopExit0 = false;
              while (!(decompiledNaturalLoopExit0 = (null == var6))) {
                stackOut_190_0 = var6 instanceof wb;
                stackIn_241_0 = stackOut_190_0 ? 1 : 0;
                stackIn_191_0 = stackOut_190_0;
                if (var20 == 0) {
                  if (stackIn_191_0) {
                    var10_ref_wb = (wb) (var6);
                    var11 = this.field_k.c(var10_ref_wb.g(-79), -20126);
                    var12 = this.field_k.d(var10_ref_wb.h(-71), 114);
                    op.field_m.field_m[var10_ref_wb.field_Lb] = op.field_m.field_m[var10_ref_wb.field_Lb] + 1;
                    if (var10_ref_wb.field_K == 4 ||
                      var10_ref_wb.field_K == 5 ||
                      22 == var10_ref_wb.field_K ||
                      !(var10_ref_wb.field_Ib <= op.field_m.field_H)) {
                      var10_ref_wb.a(true, this.field_k);
                      if ((var10_ref_wb.field_Ib + var10_ref_wb.field_y) % 7 == 0 &&
                        var10_ref_wb.field_K == 5 &&
                        var10_ref_wb.field_Ib > op.field_m.field_H) {
                        var13 = (3 + var10_ref_wb.field_y) * var10_ref_wb.field_Ib % he.field_b.length;
                        if (0 != var13 ||
                          q.field_b) {
                          if (var13 == 1 &&
                            q.field_b) {
                            var13 = 0;
                          }
                        } else {
                          var13 = 1;
                        }
                        pb.field_e.a(he.field_b[var13], var11, -48 + var12, 14540253, 0, 253);
                      }
                    }
                    if (var8_int != 0 &&
                      var10_ref_wb.field_K != 9 &&
                      var10_ref_wb.field_K != 21 &&
                      var10_ref_wb.i((byte) 0)) {
                      g.c(so.field_l);
                      oo.d(var11 / ke.field_b, var12 / ke.field_b, var9_int, 0);
                      g.d();
                    }
                  }
                  var6 = this.field_H.b(6);
                  continue;
                }
                break;
              }
              if (decompiledNaturalLoopExit0) {
                stackIn_241_0 = var8_int;
              }
              if (stackIn_241_0 != 0) {
                g.c(so.field_l);
                var10_ref_h = this.field_o;
                var11 = this.field_k.c(var10_ref_h.g(param1 - 97), param1 - 20127);
                var12 = this.field_k.d(var10_ref_h.h(-51), 108);
                oo.d(var11 / ke.field_b, var12 / ke.field_b, var9_int, 0);
                var6 = this.field_c.c((byte) 127);
                while (var6 != null) {
                  var10_ref_hLifetime1 = (h) (var6);
                  stackIn_261_0 = ~var10_ref_hLifetime1.field_I;
                  stackIn_261_1 = ~this.field_M;
                  if (var20 != 0) {
                    decompiledFrameCompleted0 = false;
                    break;
                  }
                  if (stackIn_261_0 != stackIn_261_1) {
                    var11 = this.field_k.c(var10_ref_hLifetime1.g(param1 ^ -82), -20126);
                    var12 = this.field_k.d(var10_ref_hLifetime1.h(103), 121);
                    oo.d(var11 / ke.field_b, var12 / ke.field_b, var9_int, var7);
                  }
                  var6 = this.field_c.b((byte) 96);
                }
                if (decompiledFrameCompleted0) {
                  g.d();
                  so.field_l.a(0, 0, 1280, 960, 104);
                }
              }
              if (decompiledFrameCompleted0) {
                this.field_J.a(this.field_k, (byte) 36);
              }
            }
          }
          if ((decompiledFrameCompleted3) &&
            (decompiledFrameCompleted0)) {
            var6 = this.field_T.c(104);
            while (true) {
              if (null != var6) {
                ((wc) (var6)).a(-10136, this.field_k);
                var6 = this.field_T.b(6);
                if (var20 == 0) {
                  continue;
                }
              } else {
                g.d();
                g.c();
                this.a(true);
                g.b();
              }
              break;
            }
            stackIn_260_0 = ub.p(-91);
          }
          if (decompiledFrameCompleted0) {
            var7 = stackIn_260_0;
            stackIn_261_0 = -1;
            stackIn_261_1 = ~var7;
          }
          if (stackIn_261_0 > stackIn_261_1) {
            if (this.field_S == null) {
              g.c(this.field_B);
              this.field_S = new ea();
              g.d();
              this.field_i = nk.a(16777215, param1 + 455739623, 8401072);
            }
            if (0 == (wf.field_m & 1)) {
              g.c(this.field_B);
              this.field_i = nk.a(2154560, 455739624, 16724223);
              oo.b();
              oo.e(0, 0, oo.field_b, oo.field_l, 1);
              this.field_S.a(1, (double)wf.field_m / 6.25, this.field_i);
              g.d();
            }
            var8_int = 132;
            if (var8_int > (var7 * 3)) {
              var8_int = var7 * 3;
            }
            this.field_B.a(5, 40, 630, 400, 32 + var8_int);
          }
          if (this.field_eb &&
            !this.field_w) {
            pp.field_q[8].a(bd.field_g - 12, -12 + bo.field_d);
          }
          if (this.field_eb &&
            this.field_w) {
            var10 = bd.field_g - this.field_F;
            var11 = -this.field_p + bo.field_d;
            if (var10 < 0) {
              var10 = -var10;
              var8_int = bd.field_g;
              if (var20 != 0) {
                var8_int = this.field_F;
              }
            } else {
              var8_int = this.field_F;
            }
            if (var11 < 0) {
              var11 = -var11;
              var9_int = bo.field_d;
              if (var20 != 0) {
                var9_int = this.field_p;
              }
            } else {
              var9_int = this.field_p;
            }
            oo.a(var8_int, var9_int, var10, var11, 16777215);
            oo.h(var8_int + 1, 1 + var9_int, -2 + var10, var11 - 2, 10066431, 32);
            oo.f(2 + var8_int, var9_int + 2, -4 + var10, -4 + var11, 3355647, 32);
          }
          boolean decompiledFrameRemainder0 = true;
          var8 = ah.field_e;
          if (0 != op.field_m.field_l) {
            if ((3 == op.field_m.field_l) &&
              (decompiledFrameRemainder0 = !(this.field_d >= 225))) {
              var8.b(tm.field_g, 320, 240, 2, -1);
              decompiledFrameRemainder0 = (var20 != 0);
            }
            if (decompiledFrameRemainder0) {
              if (!gf.field_h &&
                op.field_m.field_l == 1 &&
                op.field_m.field_H < 500) {
                var8.b(up.field_c, 320, 240, 0, -1);
                this.field_k.field_f = false;
                decompiledFrameRemainder0 = (var20 != 0);
              }
              if ((decompiledFrameRemainder0) &&
                (decompiledFrameRemainder0 = (op.field_m.field_l == 2))) {
                var9_int = op.field_m.field_C - op.field_m.field_H;
                if (var9_int < 1550) {
                  if (gf.field_h) {
                    var8.b(gn.field_E, 320, 120, 0, -1);
                    if (var20 != 0) {
                      var8.b(sm.field_f, 320, 120, 0, -1);
                      if (var9_int > 2750 &&
                        var9_int < 2950 &&
                        !gf.field_h) {
                        var8.b(ng.field_c, 320, 120, 0, -1);
                      }
                    }
                  } else {
                    var8.b(sm.field_f, 320, 120, 0, -1);
                    if ((var20 != 0) && (var9_int > 2750 &&
                      var9_int < 2950 &&
                      !gf.field_h)) {
                      var8.b(ng.field_c, 320, 120, 0, -1);
                    }
                  }
                } else {
                  if (var9_int > 2750 &&
                    var9_int < 2950 &&
                    !gf.field_h) {
                    var8.b(ng.field_c, 320, 120, 0, -1);
                  }
                }
                decompiledFrameRemainder0 = (var20 != 0);
              }
            }
          }
          if (decompiledFrameRemainder0) {
            if (this.field_l <= 0) {
              var9_ref = pj.field_J;
              ah.field_e.b(var9_ref, 320, 240, 0, -1);
              decompiledFrameRemainder0 = (var20 != 0);
            }
            if (decompiledFrameRemainder0) {
              var9_int = -(this.field_l / 2) + 320;
              var10 = 320 + this.field_l / 2;
              oo.h(var9_int, 0, var10, 480);
              var11 = 140;
              oo.b(var11, 80, 640 - 2 * var11, 260, 1, 3355443, 120);
              if ((-5 + var11) > var9_int) {
                stackIn_348_0 = -5 + var11;
              } else {
                stackIn_348_0 = var9_int;
              }
              stackIn_351_1 = 75;
              if (var10 > 640 - var11) {
                stackIn_352_2 = -var11 + 640;
              } else {
                stackIn_352_2 = var10;
              }
              oo.h(stackIn_348_0, stackIn_351_1, stackIn_352_2, 345);
              sj.field_j.c(var11 - 5, 75);
              sj.field_j.a(-5 + var11, 340);
              lm.field_fb.c(var11 - 5, 75);
              lm.field_fb.b(-5 - var11 + 640, 75);
              rp.field_r[0].c(var11 - 5, 75);
              rp.field_r[1].c(635 - var11, 75);
              rp.field_r[2].c(var11 - 5, 340);
              rp.field_r[3].c(635 - var11, 340);
              var12 = 0;
              var13 = 160;
              var14Lifetime1 = 90;
              this.a(var13, (byte) -99, var14Lifetime1, var12);
              if (op.field_m.field_t > 1) {
                var12++;
                var14Lifetime1Lifetime1 = 270;
                var13 = 640 - var13;
                this.a(var13, (byte) -99, var14Lifetime1Lifetime1, var12);
                if (2 < op.field_m.field_t) {
                  var13 = 640 - var13;
                  var14Lifetime1Lifetime1 = 230;
                  var12++;
                  this.a(var13, (byte) -99, var14Lifetime1Lifetime1, var12);
                  if (3 < op.field_m.field_t) {
                    var12++;
                    var13 = 640 - var13;
                    var14Lifetime1Lifetime1 = 130;
                    this.a(var13, (byte) -99, var14Lifetime1Lifetime1, var12);
                  }
                }
              }
              this.field_y.g(-(this.field_y.field_x / 2) + 320, 235 - this.field_y.field_w);
              g.a(this.field_L, -(this.field_y.field_x / 2) + 320 - 6, 235 + (-this.field_y.field_w - 6));
              oo.c();
            }
          }
          if (param0) {
            this.field_G.g(-27635);
            if (!gf.field_h) {
              this.field_I.c(-118);
              rq.a(9);
            }
          }
          jq.field_e.e(0, 0);
          if (sc.field_a ||
            wj.field_n ||
            n.field_g) {
            oo.f(0, 0, 640, 17, 0, 100);
          }
          if (sc.field_a) {
            qp.field_w.c("cam=(" + this.field_k.field_k + ", " + this.field_k.field_g + ") bk=" + kd.field_b + " k=" + pq.field_f + " mouse=(" + bd.field_g + "," + bo.field_d + ")", 5, 13, 16777215, 0);
          }
          if (vk.field_E) {
            var8.c(Integer.toString(ji.field_b), 10, 40, 2, -1);
            var8.c(Integer.toString(ei.field_b), 10, 40, 2, -1);
            var8.c(Integer.toString(op.field_m.field_H), 10, 80, 2, -1);
            var9_ref2 = (ae) (this.field_hb.c(106));
            while (null != var9_ref2) {
              var9_ref2.a(-240 + this.field_k.field_g, true, -320 + this.field_k.field_k, op.field_m.field_H);
              var9_ref2 = (ae) (this.field_hb.b(6));
              if (var20 != 0) {
                return;
              }
            }
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3 = decompiledCaughtException;
          throw fa.a((Throwable) ((Object) var3), "qd.FA(" + param0 + ',' + param1 + ')');
        }
    }

    final void b(int param0, int param1, int param2, int param3, int param4) {
        RuntimeException runtimeException = null;
        lc var6 = null;
        int var7 = 0;
        RuntimeException decompiledCaughtException = null;
        try {
          var6 = (lc) (this.field_X.g(55));
          if (null == var6) {
            var6 = new lc();
          }
          var6.a(param3, param2, param1, param0, (byte) 114);
          this.field_C.a(-25612, var6);
          g.a(this.field_C);
          var7 = 74 % ((11 - param4) / 34);
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          runtimeException = decompiledCaughtException;
          throw fa.a((Throwable) ((Object) runtimeException), "qd.JB(" + param0 + ',' + param1 + ',' + param2 + ',' + param3 + ',' + param4 + ')');
        }
    }

    private final void a(int param0, int param1, boolean param2) {
        int stackIn_8_0 = 0;
        boolean stackIn_17_0 = false;
        int stackIn_54_0 = 0;
        RuntimeException decompiledCaughtException = null;
        boolean stackOut_16_0;
        int var4_int = 0;
        RuntimeException var4 = null;
        wb var5 = null;
        int var6 = 0;
        int var7 = 0;
        int var8 = 0;
        int var9 = 0;
        int var10 = 0;
        int var11 = 0;
        br var12 = null;
        wb var13 = null;
        int var14 = 0;
        var14 = ZombieDawnMulti.field_E ? 1 : 0;
        try {
          var4_int = 0;
          var5 = (wb) (this.field_Q.c((byte) 92));
          if (null != var5) {
            stackIn_8_0 = (~param0 != ~var5.field_Kb) ? 0 : 1;
            var4_int = stackIn_8_0;
          }
          if (!param2) {
            this.b(-60);
          }
          if (param1 != 1782) {
            return;
          }
          var6 = this.field_u.field_r << 16;
          var7 = 0;
          var8 = this.field_u.field_c << 16;
          var9 = 0;
          var10 = 41943040;
          var11 = 31457280;
          var12 = op.field_m.field_K.c(78);
          boolean decompiledNaturalLoopExit0 = false;
          while (!(decompiledNaturalLoopExit0 = (var12 == null))) {
            stackOut_16_0 = var12 instanceof wb;
            stackIn_54_0 = stackOut_16_0 ? 1 : 0;
            stackIn_17_0 = stackOut_16_0;
            if (var14 == 0) {
              if (stackIn_17_0) {
                var13 = (wb) (var12);
                if (~param0 == ~var13.field_Kb) {
                  var5 = var13;
                  var13.r(0);
                  this.field_Q.a(29664, var13);
                  if (var7 < var13.field_z &&
                    -var6 + var13.field_z < var10) {
                    var7 = var13.field_z;
                  }
                  if (var6 > var13.field_z &&
                    var10 > (var7 - var13.field_z)) {
                    var6 = var13.field_z;
                  }
                  if (var9 < var13.field_E &&
                    var11 > (var13.field_E - var8)) {
                    var9 = var13.field_E;
                  }
                  if (var8 > var13.field_E &&
                    (var9 - var13.field_E) < var11) {
                    var8 = var13.field_E;
                  }
                }
              }
              var12 = op.field_m.field_K.b(6);
              continue;
            }
            break;
          }
          if (decompiledNaturalLoopExit0) {
            if (null == var5) {
              return;
            }
            stackIn_54_0 = var4_int;
          }
          if (stackIn_54_0 != 0) {
            this.e(var8 + var9 >> 17, -108, var6 + var7 >> 17);
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var4 = decompiledCaughtException;
          throw fa.a((Throwable) ((Object) var4), "qd.RA(" + param0 + ',' + param1 + ',' + param2 + ')');
        }
    }

    final void c(int param0, int param1) {
        RuntimeException runtimeException = null;
        id var4 = null;
        ti var5 = null;
        int var6 = 0;
        RuntimeException decompiledCaughtException = null;
        wb var3 = null;
        try {
          var4 = op.field_m.a(param0, (byte) 33);
          if (!(var4 instanceof ti)) {
            return;
          }
          if (null == var4) {
            return;
          }
          var6 = 83 % ((param1 + 73) / 51);
          var5 = (ti) (var4);
          var5.j(0);
          if (var5 instanceof wb) {
            var3 = (wb) (var5);
            var3.j((byte) -13);
            var3.d(false);
            if (var3.field_K == 29) {
              var3.b(4, -27655);
            }
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          runtimeException = decompiledCaughtException;
          throw fa.a((Throwable) ((Object) runtimeException), "qd.G(" + param0 + ',' + param1 + ')');
        }
    }

    private final void d(int param0) {
        RuntimeException decompiledCaughtException = null;
        RuntimeException var2 = null;
        int var3 = 0;
        var3 = ZombieDawnMulti.field_E ? 1 : 0;
        try {
          if (param0 != 15) {
            qd.a((fm) null, 30, (String) null, 93, (td) null);
          }
          if (this.c((byte) 106)) {
            if (this.field_b != null) {
              this.field_b.field_O = false;
              this.field_b = null;
            }
            if (null == this.field_mb) {
              if (this.field_x != null) {
                this.field_x.field_jb = false;
                this.field_x = null;
                if (var3 != 0) {
                  this.field_mb.field_zb = false;
                  this.field_mb.field_eb = false;
                  this.field_mb = null;
                }
              }
            } else {
              this.field_mb.field_zb = false;
              this.field_mb.field_eb = false;
              this.field_mb = null;
            }
            boolean decompiledFrameRemainder0 = true;
            if (this.field_I.a((byte) -119)) {
              if (bk.field_g) {
                en.a(param0 - 16, 1);
                decompiledFrameRemainder0 = (var3 != 0);
              }
              if (decompiledFrameRemainder0) {
                en.a(-1, 6);
                return;
              }
            }
            if (decompiledFrameRemainder0) {
              en.a(-1, 0);
            }
            if (this.field_I.g(param0 ^ 2)) {
              this.field_x = (gm) (this.a(true, 54, bo.field_d, bd.field_g));
              if (this.field_x != null) {
                this.field_x.field_jb = true;
              }
            }
            this.field_mb = (wb) (this.a(false, 124, bo.field_d, bd.field_g));
            if (null != this.field_mb) {
              if ((!this.field_I.a(true) ||
                !this.field_mb.i((byte) 116)) &&
                (!this.field_I.a(param0 + 5) ||
                this.field_mb.i((byte) -59))) {
                if (this.field_mb.i((byte) -36)) {
                  this.field_mb.field_eb = true;
                  if (var3 != 0) {
                    if (bk.field_g) {
                      this.field_mb.field_zb = true;
                      this.field_mb = null;
                    } else {
                      this.field_mb = null;
                    }
                  }
                }
              } else {
                if (bk.field_g) {
                  this.field_mb.field_zb = true;
                  if (var3 != 0) {
                    this.field_mb = null;
                  }
                } else {
                  this.field_mb = null;
                }
              }
            }
            if (this.field_I.a(20) &&
              null != this.field_b) {
              this.field_b.field_O = true;
            }
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2 = decompiledCaughtException;
          throw fa.a((Throwable) ((Object) var2), "qd.AB(" + param0 + ')');
        }
    }

    final boolean a(boolean param0, int param1) {
        int stackIn_5_0 = 0;
        int stackIn_35_0 = 0;
        int stackIn_36_1 = 0;
        ja[] stackIn_56_0 = null;
        boolean stackIn_79_0 = false;
        boolean stackIn_91_1 = false;
        boolean stackIn_92_2 = false;
        boolean stackIn_102_0 = false;
        RuntimeException decompiledCaughtException = null;
        int var3_int = 0;
        RuntimeException var3 = null;
        int var4_int = 0;
        ja[] var4 = null;
        int var5 = 0;
        int var6 = 0;
        var6 = ZombieDawnMulti.field_E ? 1 : 0;
        try {
          this.field_z = false;
          stackIn_5_0 = (pl.field_I != 10) ? 0 : 1;
          var3_int = stackIn_5_0;
          if (!df.field_I) {
            boolean decompiledFrameRemainder0 = true;
            pb.field_i = id.field_x;
            if ((iq.field_f) &&
              (decompiledFrameRemainder0 = (var3_int != 0))) {
              pb.field_i = be.field_m;
              decompiledFrameRemainder0 = (var6 != 0);
            }
            if (decompiledFrameRemainder0) {
              if (id.field_D > 1) {
                pb.field_i = vl.a(rq.field_q, new String[]{Integer.toString(id.field_D)}, 2);
                if (var6 != 0) {
                  if (id.field_D != 1) {
                    pb.field_i = ll.field_d;
                    pb.field_i = ma.field_c;
                  } else {
                    pb.field_i = ma.field_c;
                  }
                }
              } else {
                if (id.field_D != 1) {
                  pb.field_i = ll.field_d;
                  if (var6 != 0) {
                    pb.field_i = ma.field_c;
                  }
                } else {
                  pb.field_i = ma.field_c;
                }
              }
            }
            var4_int = qp.field_w.a(pb.field_i);
            nf.field_d = (int)((float)nf.field_d + (float)(var4_int - nf.field_d) * 0.05000000074505806f);
            if (~nf.field_d != ~var4_int) {
              stackIn_35_0 = nf.field_d;
              if (var4_int > nf.field_d) {
                stackIn_36_1 = 1;
              } else {
                stackIn_36_1 = -1;
              }
              nf.field_d = stackIn_35_0 + stackIn_36_1;
            }
          }
          if (!df.field_I &&
            param0 && (!re.field_b ||
            !sq.field_N ||
            gf.field_h)) {
            if (!tj.field_f) {
              stackIn_56_0 = oi.field_h;
            } else {
              stackIn_56_0 = rl.field_a;
            }
            var4 = stackIn_56_0;
            tj.field_f = false;
            var5 = var4[0].field_w - (-var4[6].field_w - qp.field_w.field_C);
            if (bd.field_g >= (635 - nf.field_d) &&
              640 > bd.field_g &&
              -var5 + dq.field_k.field_qb <= bo.field_d &&
              dq.field_k.field_qb > bo.field_d) {
              this.field_z = true;
              tj.field_f = true;
            }
            if (kd.field_b == 1 &&
              tj.field_f) {
              stackIn_79_0 = !(iq.field_f);
              iq.field_f = stackIn_79_0;
              if (iq.field_f) {
                id.field_D = 0;
              }
            }
            if (var6 != 0) {
              tj.field_f = false;
            }
          } else {
            tj.field_f = false;
          }
          if (iq.field_f) {
            stackIn_91_1 = this.field_z;
            stackIn_92_2 = !(dq.field_k.field_qb > bo.field_d);
            this.field_z = stackIn_91_1 | stackIn_92_2;
            if (sq.field_N &&
              re.field_b) {
              this.field_z = true;
            }
          }
          this.field_z = this.field_z | tj.field_f;
          if (param1 == 15978) {
            stackIn_102_0 = this.field_z;
            return stackIn_102_0;
          }
          return true;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3 = decompiledCaughtException;
          throw fa.a((Throwable) ((Object) var3), "qd.T(" + param0 + ',' + param1 + ')');
        }
    }

    public static void h(int param0) {
        RuntimeException decompiledCaughtException = null;
        RuntimeException var1 = null;
        try {
          field_v = null;
          field_E = null;
          field_s = null;
          field_r = null;
          field_V = null;
          if (param0 != 256) {
            field_E = (String) null;
          }
          field_K = null;
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var1 = decompiledCaughtException;
          throw fa.a((Throwable) ((Object) var1), "qd.P(" + param0 + ')');
        }
    }

    private final void a(byte param0) {
        int stackIn_22_0 = 0;
        int stackIn_22_1 = 0;
        br stackIn_33_0 = null;
        lj stackIn_36_0 = null;
        Object stackIn_38_0 = null;
        cg stackIn_41_0 = null;
        Object stackIn_43_0 = null;
        pq stackIn_46_0 = null;
        Object stackIn_48_0 = null;
        wc stackIn_51_0 = null;
        Object stackIn_53_0 = null;
        boolean stackIn_56_0 = false;
        int stackIn_63_0 = 0;
        boolean stackIn_66_0 = false;
        int stackIn_73_0 = 0;
        Throwable decompiledCaughtException = null;
        lj stackOut_35_0;
        cg stackOut_40_0;
        pq stackOut_45_0;
        wc stackOut_50_0;
        boolean stackOut_55_0;
        boolean stackOut_65_0;
        Object var2 = null;
        ae var3_ref_ae = null;
        int var3 = 0;
        br var3_ref_br = null;
        lj var3_ref_lj = null;
        cg var3_ref_cg = null;
        pq var3_ref_pq = null;
        wc var3_ref_wc = null;
        lc var3_ref_lc = null;
        ae var4 = null;
        br var4_ref = null;
        Object var4_ref2 = null;
        ce var4_ref3 = null;
        Exception var5 = null;
        ce var5_ref = null;
        int var6 = 0;
        ce var5_refLifetime1;
        int var3Lifetime1;
        var6 = ZombieDawnMulti.field_E ? 1 : 0;
        try {
          op.field_m.field_H = op.field_m.field_H + 1;
          var2 = null;
          var3_ref_ae = (ae) (this.field_hb.c(50));
          while (var3_ref_ae != null) {
            if (var2 != null &&
              ((ae) (var2)).field_f <= var3_ref_ae.field_f) {
            }
            var2 = var3_ref_ae;
            var3_ref_ae = (ae) (this.field_hb.b(6));
            if (var6 == 0) {
              continue;
            }
            break;
          }
          var3 = 10 % ((-25 - param0) / 61);
          var4 = (ae) (this.field_hb.c(114));
          L4: while (true) {
            if (var4 != null) {
              stackIn_22_0 = op.field_m.field_H;
              stackIn_22_1 = var4.field_f;
              if (var6 != 0) {
                break L4;
              }
              if (stackIn_22_0 >= stackIn_22_1 ||
                var6 != 0) {
                try {
                  var4.a((byte) -84);
                  var4.a(0, this);
                } catch (java.lang.Exception decompiledCaughtParameter0) {
                  decompiledCaughtException = decompiledCaughtParameter0;
                  var5 = (Exception) (Object) decompiledCaughtException;
                  bd.a(op.field_m.field_H + ": error executing message of tick " + var4.field_f + ": " + var5.getMessage(), (Throwable) ((Object) var5), false);
                }
                var4 = (ae) (this.field_hb.c(78));
                continue;
              }
            }
            stackIn_22_0 = ~op.field_m.field_l;
            stackIn_22_1 = -1;
            break;
          }
          if (stackIn_22_0 != stackIn_22_1) {
            this.field_G.a(-21991);
            if (op.field_m.field_l != 3) {
              this.field_G.a(this.field_Z, false);
            }
            var3_ref_br = this.field_H.c(61);
            boolean decompiledNaturalLoopExit5 = false;
            while (!(decompiledNaturalLoopExit5 = (!(var3_ref_br instanceof id)))) {
              var4_ref = var3_ref_br.field_d;
              ((id) (var3_ref_br)).f((byte) -117);
              stackIn_33_0 = var4_ref;
              if (var6 == 0) {
                var3_ref_br = stackIn_33_0;
                continue;
              }
              break;
            }
            if (decompiledNaturalLoopExit5) {
              stackIn_33_0 = this.field_O.c(127);
            }
            var3_ref_lj = (lj) (stackIn_33_0);
            boolean decompiledNaturalLoopExit4 = false;
            while (!(decompiledNaturalLoopExit4 = (null == var3_ref_lj))) {
              var3_ref_lj.a(-20587);
              stackOut_35_0 = (lj) (this.field_O.b(6));
              stackIn_38_0 = stackOut_35_0;
              stackIn_36_0 = stackOut_35_0;
              if (var6 == 0) {
                var3_ref_lj = stackIn_36_0;
                continue;
              }
              break;
            }
            if (decompiledNaturalLoopExit4) {
              stackIn_38_0 = op.field_m.field_A.c(81);
            }
            var3_ref_cg = (cg) (stackIn_38_0);
            boolean decompiledNaturalLoopExit3 = false;
            while (!(decompiledNaturalLoopExit3 = (var3_ref_cg == null))) {
              var3_ref_cg.b(false);
              stackOut_40_0 = (cg) (op.field_m.field_A.b(6));
              stackIn_43_0 = stackOut_40_0;
              stackIn_41_0 = stackOut_40_0;
              if (var6 == 0) {
                var3_ref_cg = stackIn_41_0;
                continue;
              }
              break;
            }
            if (decompiledNaturalLoopExit3) {
              stackIn_43_0 = op.field_m.field_G.c(42);
            }
            var3_ref_pq = (pq) (stackIn_43_0);
            boolean decompiledNaturalLoopExit2 = false;
            while (!(decompiledNaturalLoopExit2 = (var3_ref_pq == null))) {
              var3_ref_pq.a(100);
              stackOut_45_0 = (pq) (op.field_m.field_G.b(6));
              stackIn_48_0 = stackOut_45_0;
              stackIn_46_0 = stackOut_45_0;
              if (var6 == 0) {
                var3_ref_pq = stackIn_46_0;
                continue;
              }
              break;
            }
            if (decompiledNaturalLoopExit2) {
              stackIn_48_0 = this.field_T.c(61);
            }
            var3_ref_wc = (wc) (stackIn_48_0);
            boolean decompiledNaturalLoopExit1 = false;
            while (!(decompiledNaturalLoopExit1 = (null == var3_ref_wc))) {
              var3_ref_wc.f((byte) -122);
              stackOut_50_0 = (wc) (this.field_T.b(6));
              stackIn_53_0 = stackOut_50_0;
              stackIn_51_0 = stackOut_50_0;
              if (var6 == 0) {
                var3_ref_wc = stackIn_51_0;
                continue;
              }
              break;
            }
            if (decompiledNaturalLoopExit1) {
              stackIn_53_0 = this.field_C.c(57);
            }
            var3_ref_lc = (lc) (stackIn_53_0);
            boolean decompiledNaturalLoopExit0 = false;
            while (!(decompiledNaturalLoopExit0 = (var3_ref_lc == null))) {
              var3_ref_lc.d((byte) 76);
              stackOut_55_0 = var3_ref_lc.field_q;
              stackIn_63_0 = stackOut_55_0 ? 1 : 0;
              stackIn_56_0 = stackOut_55_0;
              if (var6 == 0) {
                if (stackIn_56_0) {
                  var3_ref_lc.a(true);
                  this.field_X.a(var3_ref_lc, false);
                }
                var3_ref_lc = (lc) (this.field_C.b(6));
                continue;
              }
              break;
            }
            if (decompiledNaturalLoopExit0) {
              g.a(this.field_C);
              stackIn_63_0 = 0;
            }
            var3Lifetime1 = stackIn_63_0;
            var4_ref2 = null;
            var5_ref = (ce) (op.field_m.field_s.c(63));
            while (true) {
              if (null == var5_ref) {
                stackIn_73_0 = var3Lifetime1;
                break;
              }
              var4_ref3 = (ce) (op.field_m.field_s.b(6));
              stackOut_65_0 = var5_ref.d(-20232);
              stackIn_73_0 = stackOut_65_0 ? 1 : 0;
              stackIn_66_0 = stackOut_65_0;
              if (var6 == 0) {
                if (stackIn_66_0) {
                  var3Lifetime1 = 1;
                }
                var5_ref = var4_ref3;
                continue;
              }
              break;
            }
            if (stackIn_73_0 == 0) {
              return;
            }
            var5_refLifetime1 = (ce) (op.field_m.field_s.c(85));
            while (null != var5_refLifetime1) {
              var5_refLifetime1.a((byte) -60);
              var5_refLifetime1 = (ce) (op.field_m.field_s.b(6));
              if (var6 != 0) {
                return;
              }
            }
            this.field_u.a(48);
            return;
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter1) {
          decompiledCaughtException = decompiledCaughtParameter1;
          var2 = (RuntimeException) (Object) decompiledCaughtException;
          throw fa.a((Throwable) (var2), "qd.HA(" + param0 + ')');
        }
    }

    final void a(int param0, int param1, int param2) {
        RuntimeException decompiledCaughtException = null;
        int var4_int = 0;
        RuntimeException var4 = null;
        int var5 = 0;
        var5 = ZombieDawnMulti.field_E ? 1 : 0;
        try {
          boolean decompiledFrameCompleted0 = true;
          if (this.field_cb.a(param0 - 1) > 200) {
            var4_int = 0;
            while (var4_int < 5) {
              this.field_cb.g(80);
              var4_int++;
              if (var5 != 0) {
                decompiledFrameCompleted0 = false;
                break;
              }
            }
          }
          if (decompiledFrameCompleted0) {
            this.field_cb.a(new rj(param1, param2, hp.a((byte) -98, g.field_a, 6)), false);
            this.field_cb.a(new rj(param1 + 15, param2, hp.a((byte) 99, g.field_a, 6)), false);
            this.field_cb.a(new rj(param1 - 15, param2, hp.a((byte) 126, g.field_a, 6)), false);
          }
          if (param0 != 1) {
            this.field_o = (h) null;
          }
          this.field_cb.a(new rj(param1, param2 - 15, hp.a((byte) 9, g.field_a, 6)), false);
          this.field_cb.a(new rj(param1, param2 + 15, hp.a((byte) -86, g.field_a, 6)), false);
          if (!this.field_u.a(param1, true, true, param2 - 24) &&
            !this.field_u.a(param1 + 24, true, true, -24 + param2) &&
            !this.field_u.a(param1 - 24, true, true, -24 + param2) &&
            this.field_u.a(param1, true, true, param2)) {
            param2 = param2 - (param2 % 24 + 24);
            this.field_H.a(new rj(param1, param2, hp.a((byte) -100, g.field_a, 6) + 6), false);
            this.field_cb.a(new rj(param1, 24 + param2, hp.a((byte) -93, g.field_a, 6)), false);
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var4 = decompiledCaughtException;
          throw fa.a((Throwable) ((Object) var4), "qd.SA(" + param0 + ',' + param1 + ',' + param2 + ')');
        }
    }

    final void a(int[] param0, boolean param1) {
        RuntimeException stackIn_8_0 = null;
        StringBuilder stackIn_8_1 = null;
        String stackIn_9_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var3 = null;
        try {
          if (param1) {
            this.field_A = 96;
          }
          d.a(param0, 0, op.field_m.field_d, 0, param0.length);
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3 = decompiledCaughtException;
          stackIn_8_0 = var3;
          stackIn_8_1 = new StringBuilder().append("qd.I(");
          if (param0 == null) {
            stackIn_9_2 = "null";
          } else {
            stackIn_9_2 = "{...}";
          }
          throw fa.a((Throwable) ((Object) stackIn_8_0), ((StringBuilder) (Object) stackIn_8_1).append(stackIn_9_2).append(',').append(param1).append(')').toString());
        }
    }

    final void a(int param0, int param1, boolean param2, int param3, int param4, int param5, int param6, int param7) {
        RuntimeException decompiledCaughtException = null;
        id var9 = null;
        RuntimeException var9_ref = null;
        ti var10 = null;
        try {
          if (param2) {
            return;
          }
          var9 = op.field_m.a(param0, (byte) 33);
          if (var9 == null) {
            return;
          }
          if (!(var9 instanceof ti)) {
            throw new IllegalArgumentException("oid " + param0 + " is not a character");
          }
          var10 = (ti) (var9);
          if (23 != param6 &&
            param6 != 28 &&
            param6 != 15 &&
            param6 != 27 &&
            param6 != 17 &&
            25 != param6 &&
            13 != param6 &&
            29 != param6 &&
            31 != param6 &&
            param6 != 33) {
            if (var10.field_K == 5 &&
              param6 == 4) {
              return;
            }
            if (~var10.field_K != ~param6) {
              var10.b(param6, -27655);
            }
            var10.a(param1, param5, param3, (byte) 109, param4, param7);
            if (!ZombieDawnMulti.field_E) {
              return;
            }
          }
          var10.b(param6, -27655);
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var9_ref = decompiledCaughtException;
          throw fa.a((Throwable) ((Object) var9_ref), "qd.K(" + param0 + ',' + param1 + ',' + param2 + ',' + param3 + ',' + param4 + ',' + param5 + ',' + param6 + ',' + param7 + ')');
        }
    }

    final void b(int param0, int param1, int param2) {
        RuntimeException decompiledCaughtException = null;
        RuntimeException var4 = null;
        try {
          if (param1 != 0) {
            this.a(118, (byte) -12, -22);
          }
          op.field_m.field_z[param0] = param2;
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var4 = decompiledCaughtException;
          throw fa.a((Throwable) ((Object) var4), "qd.O(" + param0 + ',' + param1 + ',' + param2 + ')');
        }
    }

    qd(kb param0, hk param1, int param2) {
        boolean stackIn_8_0 = false;
        boolean stackIn_12_1 = false;
        int stackIn_26_0 = 0;
        RuntimeException stackIn_43_0 = null;
        StringBuilder stackIn_43_1 = null;
        String stackIn_44_2 = null;
        StringBuilder stackIn_47_1 = null;
        String stackIn_48_2 = null;
        RuntimeException decompiledCaughtException = null;
        int[] var4 = null;
        RuntimeException var4_ref = null;
        int var5_int = 0;
        int[] var5 = null;
        int[] var6 = null;
        int var7 = 0;
        int var8 = 0;
        int var9 = 0;
        var9 = ZombieDawnMulti.field_E ? 1 : 0;
        th discarded$0 = new th();
        this.field_Z = 0;
        this.field_Y = 0;
        this.field_J = new uf();
        this.field_q = -1;
        this.field_x = null;
        this.field_p = -1;
        this.field_mb = null;
        this.field_fb = 0;
        this.field_d = 0;
        this.field_eb = false;
        this.field_n = 0;
        this.field_w = true;
        this.field_F = -1;
        this.field_db = false;
        this.field_ib = 0;
        this.field_B = new ja(157, 100);
        this.field_z = false;
        this.field_m = 2;
        this.field_i = new int[256];
        this.field_g = 1;
        try {
          fb.field_e = this;
          mj.field_Hb[2].field_g.field_d = 0;
          gf.field_h = !(param2 >= 0);
          tg.field_e = param1;
          stackIn_8_0 = (((int)(bl.a((byte) 124) / 86400000L) - 11745) % 7 == 5);
          q.field_b = stackIn_8_0;
          op.field_m = param0;
          this.field_M = param2;
          stackIn_12_1 = !(kj.field_q < 2);
          this.field_ab = stackIn_12_1;
          this.b((byte) 72);
          this.field_Q = new lq();
          this.field_W = -50 + param0.field_H;
          var4 = fc.field_m;
          var5_int = 0;
          do {
            if (var5_int >= 8) {
              this.field_H = param0.a((byte) 114);
              this.a(6, param0.field_h);
              break;
            }
            var4[var5_int] = 0;
            var5_int++;
          } while (var9 == 0);
          if (null == so.field_l) {
            stackIn_26_0 = (ll.field_k.field_k == 2) ? 1 : 16;
            ke.field_b = stackIn_26_0;
            so.field_l = new ja(1280 / ke.field_b, 960 / ke.field_b);
          }
          if (!gf.field_h) {
            var4 = new int[param0.field_t + 3];
            var5 = new int[3 + param0.field_t];
            var6 = new int[param0.field_t + 2];
            var7 = 0;
            var8 = 0;
            boolean decompiledNaturalLoopExit0 = false;
            while (!(decompiledNaturalLoopExit0 = (var6.length <= var8))) {
              var5[var8] = param0.field_D[var7][1];
              var4[var8] = param0.field_D[var7][0];
              var6[var8] = 25;
              if (var9 == 0) {
                if (~var7 == ~fb.field_e.field_M) {
                  var8++;
                  var5[var8] = param0.field_D[var7][1];
                  var4[var8] = param0.field_D[var7][0];
                  var6[var8] = 75;
                  var8++;
                  var5[var8] = param0.field_D[var7][1];
                  var4[var8] = param0.field_D[var7][0];
                  var6[var8] = 25;
                }
                var7++;
                var8++;
                continue;
              }
              break;
            }
            if (decompiledNaturalLoopExit0) {
              var5[var5.length - 1] = var5[0];
              var4[var5.length - 1] = var4[0];
              ej.field_p = ao.a(var5, -837539512, var6);
            }
            fb.field_d = ao.a(var4, -837539512, var6);
            return;
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var4_ref = decompiledCaughtException;
          stackIn_43_0 = var4_ref;
          stackIn_43_1 = new StringBuilder().append("qd.<init>(");
          if (param0 == null) {
            stackIn_44_2 = "null";
          } else {
            stackIn_44_2 = "{...}";
          }
          stackIn_47_1 = ((StringBuilder) (Object) stackIn_43_1).append(stackIn_44_2).append(',');
          if (param1 == null) {
            stackIn_48_2 = "null";
          } else {
            stackIn_48_2 = "{...}";
          }
          throw fa.a((Throwable) ((Object) stackIn_43_0), ((StringBuilder) (Object) stackIn_47_1).append(stackIn_48_2).append(',').append(param2).append(')').toString());
        }
    }

    static {
        field_e = 48;
        field_r = "Name";
        field_E = "No spectators";
        field_v = "Press F10 to open Quick Chat.";
        field_K = "Please wait while we search.<br>Games usually start within a minute, provided the server is busy enough.<br><br>The longer you are forced to wait, the earlier in the list of players you are likely to appear.<br><br>If the game doesn't start, click 'Cancel' and then try choosing 'Don't mind' for more options or switching to a busier lobby.";
        field_V = "Sorry, you were removed from the game you were in. This can happen if you are disconnected for too long or if the server is updated.";
    }
}
