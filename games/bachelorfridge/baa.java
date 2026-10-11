/*
 * Decompiled by CFR-JS 0.4.0.
 */
import java.util.*;

final class baa extends ana {
    private int field_I;
    static int field_Q;
    private kv field_J;
    private int field_L;
    private int field_O;
    private boolean field_N;
    private int field_K;
    private boolean field_w;
    static Random field_v;
    private int field_D;
    private int field_x;
    private int field_F;
    private rn field_B;
    private int field_G;
    static kv field_y;
    static int[] field_z;
    static long[] field_C;
    private ad field_R;
    static String field_A;
    static String field_E;
    static byte[][] field_P;

    final static void e(int param0) {
        bn.field_h = null;
        nw.field_p = null;
        jla.field_d = null;
        a.field_n = null;
        cga.field_r = null;
        bla.field_p = null;
        wq.field_k = null;
        ew.field_q = null;
        gg.field_a = null;
        gba.field_xb = null;
        iq.field_l = null;
        dc.field_y = null;
        wd.field_w = null;
        kja.field_e = null;
        an.field_r = null;
        vl.field_c = null;
        ps.field_q = null;
        if (param0 == 17035) {
          pja.field_b = null;
          ca.field_c = null;
          gq.field_E = null;
          wa.field_n = null;
          kaa.field_l = null;
          jf.field_l = null;
          hh.field_b = null;
          lfa.field_s = null;
          ska.field_k = null;
          pw.field_y = null;
          eq.field_b = null;
          us.field_b = null;
          op.field_I = null;
          nia.field_l = null;
          a.field_o = null;
          fba.field_a = null;
          tq.field_g = null;
          cka.field_y = null;
          hl.field_D = null;
          rj.field_l = null;
          dr.field_p = null;
          ln.field_v = null;
          bna.field_v = null;
          bn.field_i = null;
          nma.field_v = null;
          mq.field_b = null;
          wja.field_l = null;
          ada.field_m = null;
          Runtime.getRuntime().gc();
          return;
        }
        eaa var2 = (eaa) null;
        baa.a((eaa) null, true, -4, -1, -110, -21);
        pja.field_b = null;
        ca.field_c = null;
        gq.field_E = null;
        wa.field_n = null;
        kaa.field_l = null;
        jf.field_l = null;
        hh.field_b = null;
        lfa.field_s = null;
        ska.field_k = null;
        pw.field_y = null;
        eq.field_b = null;
        us.field_b = null;
        op.field_I = null;
        nia.field_l = null;
        a.field_o = null;
        fba.field_a = null;
        tq.field_g = null;
        cka.field_y = null;
        hl.field_D = null;
        rj.field_l = null;
        dr.field_p = null;
        ln.field_v = null;
        bna.field_v = null;
        bn.field_i = null;
        nma.field_v = null;
        mq.field_b = null;
        wja.field_l = null;
        ada.field_m = null;
        Runtime.getRuntime().gc();
    }

    baa(gj param0, rn param1) {
        super(param0, param1);
        this.field_L = 0;
        this.field_N = false;
        this.field_x = -1;
        this.field_D = -1;
        try {
          this.field_B = param1;
          this.field_R = this.field_B.field_l.a(-27449, this.field_q);
          this.field_O = this.field_R.field_s.field_x;
          this.field_G = this.field_R.field_s.field_J;
          this.field_F = this.field_B.field_r;
          this.field_K = this.field_R.field_s.field_x;
          this.field_I = this.field_R.field_s.field_J;
          this.field_J = nha.field_a.a();
        } catch (RuntimeException runtimeException) {
          throw pe.a((Throwable) ((Object) runtimeException), "baa.<init>(" + (param0 != null ? "{...}" : "null") + ',' + (param1 != null ? "{...}" : "null") + ')');
        }
    }

    final boolean c(byte param0) {
        int var3 = 0;
        int var4 = 0;
        aj var5 = null;
        aj var5Lifetime1;
        int var3Lifetime1;
        int var4Lifetime1;
        if (this.field_m.a((byte) -106)) {
          return false;
        }
        if (!this.field_N) {
          this.field_N = true;
          wf.a(6, (byte) -62);
        }
        int var2 = 59 % ((param0 - 71) / 47);
        int fieldTemp$0 = this.field_L - 1;
        this.field_L = this.field_L - 1;
        if (fieldTemp$0 >= 0) {
          var3 = (-this.field_O + this.field_K << 16) * (-this.field_L + 6) / 6 + (this.field_O << 16);
          var4 = (-this.field_L + 6) * (-this.field_I + this.field_G << 16) / 6 + (this.field_I << 16);
          var5 = this.field_q.field_s.a(false, var4, var3);
          var5.field_a = var5.field_a - this.field_q.field_s.field_B;
          var5.field_c = var5.field_c - this.field_q.field_s.field_b;
          this.field_q.field_s.c(2, -var5.field_a + 240, 320 - var5.field_c);
          return false;
        }
        this.field_O = this.field_K;
        this.field_I = this.field_G;
        if (this.d(-44)) {
          this.a(this.field_K, this.field_G, this.field_R, 0);
          this.field_L = this.field_L + 6;
          var3Lifetime1 = (-this.field_O + this.field_K << 16) * (-this.field_L + 6) / 6 + (this.field_O << 16);
          var4Lifetime1 = (-this.field_L + 6) * (-this.field_I + this.field_G << 16) / 6 + (this.field_I << 16);
          var5Lifetime1 = this.field_q.field_s.a(false, var4Lifetime1, var3Lifetime1);
          var5Lifetime1.field_a = var5Lifetime1.field_a - this.field_q.field_s.field_B;
          var5Lifetime1.field_c = var5Lifetime1.field_c - this.field_q.field_s.field_b;
          this.field_q.field_s.c(2, -var5Lifetime1.field_a + 240, 320 - var5Lifetime1.field_c);
          return false;
        }
        this.f(-126);
        return true;
    }

    private final void f(int param0) {
        if (param0 > -98) {
          this.field_R = (ad) null;
          if (!this.field_B.field_o.e(12917)) {
            throw new IllegalStateException();
          }
          return;
        }
        if (!this.field_B.field_o.e(12917)) {
          throw new IllegalStateException();
        }
    }

    final static void a(eaa param0, boolean param1, int param2, int param3, int param4, int param5) {
        rea var6 = null;
        int var7 = 0;
        int var8 = 0;
        eaa var9 = null;
        RuntimeException stackIn_12_0 = null;
        StringBuilder stackIn_12_1 = null;
        String stackIn_13_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var6_ref = null;
        var8 = BachelorFridge.field_y;
        try {
          if (!param1) {
            var9 = (eaa) null;
            baa.a((eaa) null, true, 50, 90, 110, 28);
          }
          var6 = (rea) (param0.b((byte) 90));
          while (var6 != null) {
            var7 = (326565 * (int)var6.field_j + 8357 * (int)var6.field_m & 630) + (var6.field_n >> 1);
            param2 = var6.field_i;
            if (var7 > 256) {
              var7 = 256;
            }
            dg.d(((int)var6.field_m * param5 >> 16) + param3, -2 + param4 - (((int)var6.field_j - (int)var6.field_l) * param5 >> 16), 5, param2);
            dg.f(param3 + (int)var6.field_m, (int)var6.field_l + param4 - 2, (-var6.field_n + 128) / 12, param2, 256 - var7 >> 3);
            var6 = (rea) (param0.c(0));
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var6_ref = decompiledCaughtException;
          stackIn_12_0 = var6_ref;
          stackIn_12_1 = new StringBuilder().append("baa.C(");
          if (param0 == null) {
            stackIn_13_2 = "null";
          } else {
            stackIn_13_2 = "{...}";
          }
          throw pe.a((Throwable) ((Object) stackIn_12_0), ((StringBuilder) (Object) stackIn_12_1).append(stackIn_13_2).append(',').append(param1).append(',').append(param2).append(',').append(param3).append(',').append(param4).append(',').append(param5).append(')').toString());
        }
    }

    public static void g(int param0) {
        field_C = null;
        field_E = null;
        field_P = (byte[][]) null;
        int var1 = -80 / ((68 - param0) / 43);
        field_v = null;
        field_y = null;
        field_z = null;
        field_A = null;
    }

    private final boolean d(int param0) {
        int var2;
        int var3;
        int var2Lifetime1;
        int var2Lifetime2;
        int var2Lifetime3;
        int var2Lifetime1Lifetime1;
        int var2Lifetime2Lifetime1;
        var3 = BachelorFridge.field_y;
        if (param0 > -8) {
          return true;
        }
        if (!this.field_w) {
          while (true) {
            this.field_K = this.field_O;
            this.field_G = this.field_I;
            var2 = this.field_F;
            if (2 != var2) {
              if (var2 != 4) {
                if (1 != var2) {
                  if (var2 != 3) {
                    throw new IllegalStateException();
                  }
                  this.field_G = this.field_G + 1;
                } else {
                  this.field_G = this.field_G - 1;
                }
              } else {
                this.field_K = this.field_K + 1;
              }
            } else {
              this.field_K = this.field_K - 1;
            }
            var2Lifetime3 = 0;
            if (this.field_K < 0) {
              this.field_F = 3;
              var2Lifetime3 = 1;
            }
            if (this.field_q.field_h.field_z <= this.field_K) {
              var2Lifetime3 = 1;
              this.field_F = 1;
            }
            if (this.field_G < 0) {
              this.field_F = 2;
              var2Lifetime3 = 1;
            }
            if (this.field_G >= this.field_q.field_h.field_B) {
              var2Lifetime3 = 1;
              this.field_F = 4;
            }
            if (var2Lifetime3 != 0) {
              if (this.field_w) {
                continue;
              }
              this.field_x = this.field_I;
              this.field_D = this.field_O;
              this.field_w = true;
              continue;
            }
            break;
          }
          if (!this.field_w) {
            return true;
          }
          if (this.field_D != this.field_K) {
            return true;
          }
          if (this.field_x != this.field_G) {
            return true;
          }
          this.field_F = ov.b(this.field_B.field_r, 60);
          return true;
        }
        if (this.field_O != this.field_R.field_s.field_x) {
          while (true) {
            this.field_K = this.field_O;
            this.field_G = this.field_I;
            var2Lifetime1 = this.field_F;
            if (2 != var2Lifetime1) {
              if (var2Lifetime1 != 4) {
                if (1 != var2Lifetime1) {
                  if (var2Lifetime1 != 3) {
                    throw new IllegalStateException();
                  }
                  this.field_G = this.field_G + 1;
                } else {
                  this.field_G = this.field_G - 1;
                }
              } else {
                this.field_K = this.field_K + 1;
              }
            } else {
              this.field_K = this.field_K - 1;
            }
            var2Lifetime1Lifetime1 = 0;
            if (this.field_K < 0) {
              this.field_F = 3;
              var2Lifetime1Lifetime1 = 1;
            }
            if (this.field_q.field_h.field_z <= this.field_K) {
              var2Lifetime1Lifetime1 = 1;
              this.field_F = 1;
            }
            if (this.field_G < 0) {
              this.field_F = 2;
              var2Lifetime1Lifetime1 = 1;
            }
            if (this.field_G >= this.field_q.field_h.field_B) {
              var2Lifetime1Lifetime1 = 1;
              this.field_F = 4;
            }
            if (var2Lifetime1Lifetime1 != 0) {
              if (this.field_w) {
                continue;
              }
              this.field_x = this.field_I;
              this.field_D = this.field_O;
              this.field_w = true;
              continue;
            }
            break;
          }
          if (!this.field_w) {
            return true;
          }
          if (this.field_D != this.field_K) {
            return true;
          }
          if (this.field_x != this.field_G) {
            return true;
          }
          this.field_F = ov.b(this.field_B.field_r, 60);
          return true;
        }
        if (this.field_I == this.field_R.field_s.field_J) {
          return false;
        }
        while (true) {
          this.field_K = this.field_O;
          this.field_G = this.field_I;
          var2Lifetime2 = this.field_F;
          if (2 != var2Lifetime2) {
            if (var2Lifetime2 != 4) {
              if (1 != var2Lifetime2) {
                if (var2Lifetime2 != 3) {
                  throw new IllegalStateException();
                }
                this.field_G = this.field_G + 1;
              } else {
                this.field_G = this.field_G - 1;
              }
            } else {
              this.field_K = this.field_K + 1;
            }
          } else {
            this.field_K = this.field_K - 1;
          }
          var2Lifetime2Lifetime1 = 0;
          if (this.field_K < 0) {
            this.field_F = 3;
            var2Lifetime2Lifetime1 = 1;
          }
          if (this.field_q.field_h.field_z <= this.field_K) {
            var2Lifetime2Lifetime1 = 1;
            this.field_F = 1;
          }
          if (this.field_G < 0) {
            this.field_F = 2;
            var2Lifetime2Lifetime1 = 1;
          }
          if (this.field_G >= this.field_q.field_h.field_B) {
            var2Lifetime2Lifetime1 = 1;
            this.field_F = 4;
          }
          if (var2Lifetime2Lifetime1 != 0) {
            if (this.field_w) {
              continue;
            }
            this.field_x = this.field_I;
            this.field_D = this.field_O;
            this.field_w = true;
            continue;
          }
          break;
        }
        if (this.field_w &&
          this.field_D == this.field_K &&
          this.field_x == this.field_G) {
          this.field_F = ov.b(this.field_B.field_r, 60);
          return true;
        }
        return true;
    }

    final void c(int param0) {
        aj var9 = null;
        int var3 = 0;
        int var5 = 0;
        int var6 = 0;
        int var7 = 0;
        int var3Lifetime1;
        int var5Lifetime1;
        int var6Lifetime1;
        int var7Lifetime1;
        if (this.field_m.a((byte) -106)) {
          return;
        }
        if (this.field_f) {
          return;
        }
        int var2 = (this.field_K << 16) + (-this.field_K + this.field_O << 16) * this.field_L / 6;
        if (param0 < -10) {
          var3 = this.field_L * (this.field_I - this.field_G << 16) / 6 + (this.field_G << 16);
          var9 = this.field_q.field_s.a(false, var3, var2);
          var5 = 16;
          var6 = 64 - (var5 >> 2);
          var7 = 48 - (var5 >> 2);
          nk.a(this.field_q.field_s.field_y, -(var6 >> 1) + var9.field_c + 64, -(var7 >> 1) + (var9.field_a + 24), var6, var7);
          this.field_J.a(vr.field_b << 12, -var5 - 20 + var9.field_a, 64 + var9.field_c, -1049413117, 3072);
          return;
        }
        this.field_J = (kv) null;
        var3Lifetime1 = this.field_L * (this.field_I - this.field_G << 16) / 6 + (this.field_G << 16);
        aj var8 = this.field_q.field_s.a(false, var3Lifetime1, var2);
        var5Lifetime1 = 16;
        var6Lifetime1 = 64 - (var5Lifetime1 >> 2);
        var7Lifetime1 = 48 - (var5Lifetime1 >> 2);
        nk.a(this.field_q.field_s.field_y, -(var6Lifetime1 >> 1) + var8.field_c + 64, -(var7Lifetime1 >> 1) + (var8.field_a + 24), var6Lifetime1, var7Lifetime1);
        this.field_J.a(vr.field_b << 12, -var5Lifetime1 - 20 + var8.field_a, 64 + var8.field_c, -1049413117, 3072);
    }

    static {
        field_Q = 2;
        field_v = new Random();
        field_C = new long[32];
        field_E = "Pause Menu";
        field_A = "Add friend";
    }
}
