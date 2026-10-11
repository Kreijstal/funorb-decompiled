/*
 * Decompiled by CFR-JS 0.4.0.
 */
import java.util.*;

final class l {
    byte[] field_k;
    static String field_i;
    byte[] field_f;
    private em field_b;
    int field_h;
    private int field_a;
    static oh[] field_c;
    je field_g;
    int field_l;
    bi field_d;
    byte[] field_e;
    int field_m;
    static int field_j;

    final static int a(Random param0, byte param1, int param2) {
        int var3_int = 0;
        RuntimeException var3 = null;
        int var4 = 0;
        int stackIn_4_0 = 0;
        int stackIn_10_0 = 0;
        RuntimeException stackIn_13_0 = null;
        StringBuilder stackIn_13_1 = null;
        String stackIn_14_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          if (param2 <= 0) {
            throw new IllegalArgumentException();
          }
          if (re.a((byte) -127, param2)) {
            stackIn_4_0 = (int)(((long)param0.nextInt() & 4294967295L) * (long)param2 >> 32);
            return stackIn_4_0;
          }
          var3_int = -2147483648 - (int)(4294967296L % (long)param2);
          if (param1 <= 71) {
            l.a(-15, -7);
          }
          do {
            var4 = param0.nextInt();
          } while (var3_int <= var4);
          stackIn_10_0 = oa.a(var4, 13309, param2);
          return stackIn_10_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3 = decompiledCaughtException;
          stackIn_13_0 = var3;
          stackIn_13_1 = new StringBuilder().append("l.G(");
          if (param0 == null) {
            stackIn_14_2 = "null";
          } else {
            stackIn_14_2 = "{...}";
          }
          throw oi.a((Throwable) ((Object) stackIn_13_0), ((StringBuilder) (Object) stackIn_13_1).append(stackIn_14_2).append(',').append(param1).append(',').append(param2).append(')').toString());
        }
    }

    private final void d(int param0) {
        int var2;
        int var3;
        int var4;
        int var5;
        int var6;
        int var7;
        int var8;
        int var9;
        int var2Lifetime1;
        int var2Lifetime2;
        int var3Lifetime1;
        int var3Lifetime2;
        int var4Lifetime1;
        int var4Lifetime2;
        var9 = TetraLink.field_J;
        this.field_f = new byte[6];
        for (var3 = 0; var3 < 4; var3++) {
          var4 = (byte)(15 << var3);
          for (var2 = 0; 6 > var2; var2++) {
            if (~(var4 & this.field_e[var2]) == ~var4) {
              this.field_f[var2] = (byte)mc.a((int) this.field_f[var2], var4);
              this.field_h = 0;
            }
            if (var4 == (var4 & this.field_k[var2])) {
              this.field_f[var2] = (byte)mc.a((int) this.field_f[var2], var4);
              this.field_h = 1;
            }
          }
        }
        for (var3Lifetime1 = 0; var3Lifetime1 < 7; var3Lifetime1++) {
          var4Lifetime1 = (byte)(1 << var3Lifetime1);
          for (var2Lifetime1 = 0; var2Lifetime1 < 3; var2Lifetime1++) {
            if (~var4Lifetime1 == ~(var4Lifetime1 & this.field_e[var2Lifetime1]) &&
              var4Lifetime1 == (this.field_e[1 + var2Lifetime1] & var4Lifetime1) &&
              var4Lifetime1 == (this.field_e[var2Lifetime1 + 2] & var4Lifetime1) &&
              (this.field_e[var2Lifetime1 + 3] & var4Lifetime1) == var4Lifetime1) {
              this.field_f[var2Lifetime1] = (byte)mc.a((int) this.field_f[var2Lifetime1], var4Lifetime1);
              this.field_f[var2Lifetime1 + 1] = (byte)mc.a((int) this.field_f[var2Lifetime1 + 1], var4Lifetime1);
              this.field_f[var2Lifetime1 + 2] = (byte)mc.a((int) this.field_f[var2Lifetime1 + 2], var4Lifetime1);
              this.field_f[3 + var2Lifetime1] = (byte)mc.a((int) this.field_f[3 + var2Lifetime1], var4Lifetime1);
              this.field_h = 0;
            }
            if (var4Lifetime1 == (var4Lifetime1 & this.field_k[var2Lifetime1]) &&
              var4Lifetime1 == (this.field_k[var2Lifetime1 + 1] & var4Lifetime1) &&
              var4Lifetime1 == (this.field_k[var2Lifetime1 + 2] & var4Lifetime1) &&
              var4Lifetime1 == (this.field_k[3 + var2Lifetime1] & var4Lifetime1)) {
              this.field_f[var2Lifetime1] = (byte)mc.a((int) this.field_f[var2Lifetime1], var4Lifetime1);
              this.field_f[1 + var2Lifetime1] = (byte)mc.a((int) this.field_f[1 + var2Lifetime1], var4Lifetime1);
              this.field_f[2 + var2Lifetime1] = (byte)mc.a((int) this.field_f[2 + var2Lifetime1], var4Lifetime1);
              this.field_f[3 + var2Lifetime1] = (byte)mc.a((int) this.field_f[3 + var2Lifetime1], var4Lifetime1);
              this.field_h = 1;
            }
          }
        }
        for (var3Lifetime2 = 0; var3Lifetime2 < 4; var3Lifetime2++) {
          var4Lifetime2 = (byte)(1 << var3Lifetime2);
          var5 = (byte)(2 << var3Lifetime2);
          var6 = (byte)(4 << var3Lifetime2);
          var7 = (byte)(8 << var3Lifetime2);
          for (var2Lifetime2 = 0; var2Lifetime2 < 3; var2Lifetime2++) {
            if (~var4Lifetime2 == ~(this.field_e[var2Lifetime2] & var4Lifetime2) &&
              var5 == (var5 & this.field_e[var2Lifetime2 + 1]) &&
              var6 == (this.field_e[2 + var2Lifetime2] & var6) &&
              var7 == (this.field_e[var2Lifetime2 + 3] & var7)) {
              this.field_f[var2Lifetime2] = (byte)mc.a((int) this.field_f[var2Lifetime2], var4Lifetime2);
              this.field_f[1 + var2Lifetime2] = (byte)mc.a((int) this.field_f[1 + var2Lifetime2], var5);
              this.field_f[var2Lifetime2 + 2] = (byte)mc.a((int) this.field_f[var2Lifetime2 + 2], var6);
              this.field_f[3 + var2Lifetime2] = (byte)mc.a((int) this.field_f[3 + var2Lifetime2], var7);
              this.field_h = 0;
            }
            if (var7 == (this.field_e[var2Lifetime2] & var7) &&
              var6 == (this.field_e[1 + var2Lifetime2] & var6) &&
              (var5 & this.field_e[var2Lifetime2 + 2]) == var5 &&
              var4Lifetime2 == (this.field_e[var2Lifetime2 + 3] & var4Lifetime2)) {
              this.field_f[var2Lifetime2] = (byte)mc.a((int) this.field_f[var2Lifetime2], var7);
              this.field_f[var2Lifetime2 + 1] = (byte)mc.a((int) this.field_f[var2Lifetime2 + 1], var6);
              this.field_f[var2Lifetime2 + 2] = (byte)mc.a((int) this.field_f[var2Lifetime2 + 2], var5);
              this.field_f[var2Lifetime2 + 3] = (byte)mc.a((int) this.field_f[var2Lifetime2 + 3], var4Lifetime2);
              this.field_h = 0;
            }
            if (var4Lifetime2 == (var4Lifetime2 & this.field_k[var2Lifetime2]) &&
              (var5 & this.field_k[var2Lifetime2 + 1]) == var5 &&
              (var6 & this.field_k[var2Lifetime2 + 2]) == var6 &&
              (this.field_k[3 + var2Lifetime2] & var7) == var7) {
              this.field_f[var2Lifetime2] = (byte)mc.a((int) this.field_f[var2Lifetime2], var4Lifetime2);
              this.field_f[1 + var2Lifetime2] = (byte)mc.a((int) this.field_f[1 + var2Lifetime2], var5);
              this.field_f[2 + var2Lifetime2] = (byte)mc.a((int) this.field_f[2 + var2Lifetime2], var6);
              this.field_f[var2Lifetime2 + 3] = (byte)mc.a((int) this.field_f[var2Lifetime2 + 3], var7);
              this.field_h = 1;
            }
            if (var7 == (var7 & this.field_k[var2Lifetime2]) &&
              var6 == (this.field_k[1 + var2Lifetime2] & var6) &&
              var5 == (var5 & this.field_k[var2Lifetime2 + 2]) &&
              (this.field_k[3 + var2Lifetime2] & var4Lifetime2) == var4Lifetime2) {
              this.field_f[var2Lifetime2] = (byte)mc.a((int) this.field_f[var2Lifetime2], var7);
              this.field_f[1 + var2Lifetime2] = (byte)mc.a((int) this.field_f[1 + var2Lifetime2], var6);
              this.field_f[2 + var2Lifetime2] = (byte)mc.a((int) this.field_f[2 + var2Lifetime2], var5);
              this.field_f[3 + var2Lifetime2] = (byte)mc.a((int) this.field_f[3 + var2Lifetime2], var4Lifetime2);
              this.field_h = 1;
            }
          }
        }
        var8 = -98 % ((32 - param0) / 39);
        if (this.field_h == -1) {
          this.field_f = null;
        }
    }

    final static boolean a(int param0, int param1, int param2) {
        if (param2 > -63) {
          field_j = -41;
        }
        int var3 = null != qe.field_a ? 1 : 0;
        if (9 == dg.field_e &&
          fi.a(ml.field_jb, vf.field_b, vd.field_h, (byte) -86, ba.field_N)) {
          if (vf.field_b != 2 &&
            var3 != 0) {
            return false;
          }
          return sj.a(ml.field_jb, vd.field_h, ba.field_N, 108, vf.field_b);
        }
        if (dg.field_e == 10) {
          if (var3 != 0) {
            return false;
          }
          em.d(-20715);
          return true;
        }
        if (dg.field_e == 11) {
          if (!va.field_u) {
            return false;
          }
          if (kd.field_h == 2 &&
            !nl.a((byte) 127, qf.field_j, rc.field_N)) {
            return false;
          }
          if (kd.field_h != 2 &&
            var3 != 0) {
            return false;
          }
          if (ui.a((byte) -46)) {
            String var4 = (String) null;
            eo.a(-3, me.field_g, param0, qf.field_j, kd.field_h, (String) null);
          }
          return true;
        }
        return false;
    }

    final static void a(java.awt.Component param0, int param1, g param2, int param3, boolean param4, ie param5) {
        try {
          ll.a(param4, param0, param1, param5, param2, param3, (byte) 127, param1);
        } catch (RuntimeException runtimeException) {
          throw oi.a((Throwable) ((Object) runtimeException), "l.L(" + (param0 != null ? "{...}" : "null") + ',' + param1 + ',' + (param2 != null ? "{...}" : "null") + ',' + param3 + ',' + param4 + ',' + (param5 != null ? "{...}" : "null") + ')');
        }
    }

    final void c(int param0) {
        int var2 = 0;
        int var3 = TetraLink.field_J;
        for (var2 = 0; var2 < 6; var2++) {
          this.field_e[var2] = this.field_b.field_p[var2];
          this.field_k[var2] = this.field_b.field_e[var2];
        }
        this.field_d = null;
        this.field_g.b(1);
        this.d(115);
        this.a(this.field_l, (byte) -96);
        if (param0 <= 12) {
          this.field_f = (byte[]) null;
        }
    }

    final void e(int param0) {
        ej var2;
        int var3;
        int var4;
        var4 = TetraLink.field_J;
        var2 = (ej) (this.field_g.c(false));
        while (var2 != null) {
          var3 = var2.field_q;
          if (var3 != 0) {
            if (var3 == 1) {
              var2.field_s = var2.field_s + 4;
              if (28 < var2.field_s) {
                var2.field_q = 2;
                var2.field_s = 28;
              }
            } else {
              if (var3 == 2) {
                var2.field_s = var2.field_s - 3;
                var2.field_y = var2.field_y - 40;
                if (var2.field_s < 0 &&
                  var2.field_y < 0) {
                  lb.a(ti.field_a[ui.a(5, 1692)], 573509761);
                  var3 = 1 << var2.field_u;
                  if (var2.field_x) {
                    this.field_e[var2.field_n] = (byte)mc.a((int) this.field_e[var2.field_n], var3);
                  } else {
                    this.field_k[var2.field_n] = (byte)mc.a((int) this.field_k[var2.field_n], var3);
                  }
                  var2.b(false);
                  this.d(-85);
                }
                if (var2.field_y < 0) {
                  var2.field_y = 0;
                }
                if (var2.field_s < 0) {
                  var2.field_s = 0;
                }
              }
            }
          } else {
            var2.field_y = var2.field_y + 40;
            if (var2.field_y <= 300 - 60 * var2.field_n) {
              var2 = (ej) (this.field_g.a((byte) -70));
              continue;
            }
            var2.field_y = 300 - 60 * var2.field_n;
            var2.field_q = 1;
          }
          var2 = (ej) (this.field_g.a((byte) -70));
        }
        if (param0 <= 72) {
          this.a((byte) 43);
        }
    }

    private final boolean a(boolean param0, int param1, int param2, int param3) {
        int var6 = TetraLink.field_J;
        if (param3 != -14933) {
          this.field_m = 52;
        }
        ej var5 = (ej) (this.field_g.c(false));
        while (var5 != null) {
          if ((!var5.field_x ? 1 : 0) != (param0 ? 1 : 0) &&
            param2 == var5.field_n &&
            param1 == var5.field_u) {
            return true;
          }
          var5 = (ej) (this.field_g.a((byte) -70));
        }
        return false;
    }

    final void a(byte param0) {
        int var2 = 0;
        int var3;
        int var4;
        int var5;
        int var6;
        int var7;
        int var4Lifetime1;
        int var5Lifetime1;
        var7 = TetraLink.field_J;
        for (var2 = 0; var2 < 6; var2++) {
          boolean decompiledFrameRemainder0 = true;
          var3 = this.field_b.field_p[var2] ^ this.field_e[var2];
          if (var3 != 0) {
            if (0 != (var3 & this.field_e[var2])) {
              this.field_e[var2] = this.field_b.field_p[var2];
              decompiledFrameRemainder0 = false;
            }
            else {
              for (var4 = 0; 7 > var4; var4++) {
                var5 = 1 << var4;
                if ((var3 & var5) != 0 &&
                  !this.a(true, var4, var2, -14933)) {
                  if (this.field_a == 0 &&
                    this.a((byte) -75, var4, var2)) {
                    this.field_g.a(new ej(this.field_d, true), false);
                    this.field_d = null;
                  } else {
                    this.field_g.a(new ej(var2, var4, true), false);
                    lb.a(s.field_a[ui.a(5, 1692)], 573509761);
                  }
                }
              }
            }
          }
          if (decompiledFrameRemainder0) {
            var4Lifetime1 = this.field_k[var2] ^ this.field_b.field_e[var2];
            if (var4Lifetime1 != 0) {
              if (0 == (this.field_k[var2] & var4Lifetime1)) {
                for (var5Lifetime1 = 0; var5Lifetime1 < 7; var5Lifetime1++) {
                  var6 = 1 << var5Lifetime1;
                  if ((var6 & var4Lifetime1) != 0 &&
                    !this.a(false, var5Lifetime1, var2, param0 ^ -14957)) {
                    if (this.field_a == 1 &&
                      this.a((byte) -75, var5Lifetime1, var2)) {
                      this.field_g.a(new ej(this.field_d, false), false);
                      this.field_d = null;
                    } else {
                      this.field_g.a(new ej(var2, var5Lifetime1, false), false);
                      lb.a(s.field_a[ui.a(5, 1692)], param0 ^ 573509817);
                    }
                  }
                }
              } else {
                this.field_k[var2] = this.field_b.field_e[var2];
              }
            }
          }
        }
        if (param0 != 56) {
          return;
        }
        this.a(this.field_l, (byte) -96);
    }

    final static void a(int param0) {
        me.field_a = param0;
    }

    final static void a(int param0, int param1) {
        bc var2 = nd.field_Lb;
        var2.f(param1, (byte) -92);
        var2.field_t = var2.field_t + 1;
        int var3 = var2.field_t;
        var2.a(2, false);
        var2.a(0, 128, km.field_o, km.field_o.length);
        var2.a(ni.field_c, false);
        var2.a(qa.field_A, false);
        var2.a(param0, param0 + 128, lo.field_a, lo.field_a.length);
        var2.b(var2.field_t - var3, -2);
    }

    public static void b(int param0) {
        field_i = null;
        int var1 = 118 % ((param0 + 38) / 43);
        field_c = null;
    }

    private final boolean a(byte param0, int param1, int param2) {
        ie var5;
        boolean stackIn_7_0 = false;
        if (param0 != -75) {
          var5 = (ie) null;
          l.a((java.awt.Component) null, 34, (g) null, 1, false, (ie) null);
        }
        stackIn_7_0 = (this.field_d != null) && (this.field_d.field_b == param2) && (this.field_d.field_f == param1);
        return stackIn_7_0;
    }

    final void a(int param0, byte param1) {
        if (param1 != -96) {
          this.field_h = -98;
        }
        this.field_l = param0;
        int dupTemp$0 = this.field_b.a(param0, (byte) 101);
        this.field_m = dupTemp$0;
        if (dupTemp$0 == -1) {
          this.field_l = -1;
        }
    }

    l(em param0, int param1) {
        try {
          this.field_a = param1;
          this.field_l = -1;
          this.field_b = param0;
          this.field_g = new je();
          this.field_k = new byte[6];
          this.field_h = -1;
          this.field_f = null;
          this.field_e = new byte[6];
        } catch (RuntimeException runtimeException) {
          throw oi.a((Throwable) ((Object) runtimeException), "l.<init>(" + (param0 != null ? "{...}" : "null") + ',' + param1 + ')');
        }
    }

    static {
        field_i = "Add <%0> to friend list";
    }
}
