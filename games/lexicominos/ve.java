/*
 * Decompiled by CFR-JS 0.4.0.
 */
abstract class ve {
    rj[] field_c;
    static dg field_e;
    static String[] field_b;
    static boolean field_a;
    static int field_d;

    public static void a(boolean param0) {
        field_b = null;
        field_e = null;
        if (!param0) {
          field_d = -91;
        }
    }

    final int a(int param0, boolean param1, int param2, String param3) {
        int var8 = 0;
        int var5_int = 0;
        int var6 = 0;
        int var7 = 0;
        int var9 = 0;
        int var10 = 0;
        int stackIn_16_0 = 0;
        int stackIn_18_0 = 0;
        RuntimeException stackIn_21_0 = null;
        StringBuilder stackIn_21_1 = null;
        String stackIn_22_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var5 = null;
        var10 = Lexicominos.field_L ? 1 : 0;
        try {
          var5_int = 0;
          var6 = param1 ? 1 : 0;
          var7 = param3.length();
          for (var8 = 0; var7 > var8; var8++) {
            var9 = param3.charAt(var8);
            if (var9 != 60) {
              if (62 != var9) {
                if (var6 == 0 &&
                  var9 == 32) {
                  var5_int++;
                }
              } else {
                var6 = 0;
              }
            } else {
              var6 = 1;
            }
          }
          if (var5_int <= 0) {
            stackIn_18_0 = 0;
            return stackIn_18_0;
          }
          stackIn_16_0 = (-param2 + param0 << 8) / var5_int;
          return stackIn_16_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var5 = decompiledCaughtException;
          stackIn_21_0 = var5;
          stackIn_21_1 = new StringBuilder().append("ve.D(").append(param0).append(',').append(param1).append(',').append(param2).append(',');
          if (param3 == null) {
            stackIn_22_2 = "null";
          } else {
            stackIn_22_2 = "{...}";
          }
          throw ld.a((Throwable) ((Object) stackIn_21_0), ((StringBuilder) (Object) stackIn_21_1).append(stackIn_22_2).append(')').toString());
        }
    }

    final static int a(String param0, byte param1, boolean param2, boolean param3, String param4, int param5) {
        try {
          int stackIn_5_0 = 0;
          int stackIn_20_0 = 0;
          int stackIn_30_0 = 0;
          boolean stackIn_43_0 = false;
          boolean stackIn_46_0 = false;
          int stackIn_73_0 = 0;
          int stackIn_84_0 = 0;
          int stackIn_86_0 = 0;
          int stackIn_93_0 = 0;
          int stackIn_96_0 = 0;
          RuntimeException stackIn_99_0 = null;
          StringBuilder stackIn_99_1 = null;
          String stackIn_100_2 = null;
          StringBuilder stackIn_102_1 = null;
          String stackIn_103_2 = null;
          Throwable decompiledCaughtException = null;
          int var6_int = 0;
          String var6 = null;
          RuntimeException var6_ref = null;
          int var7 = 0;
          int var8 = 0;
          Throwable var8_ref_Throwable = null;
          int var9 = 0;
          CharSequence var11 = null;
          int var6_intLifetime1;
          int var6_intLifetime2;
          int var8Lifetime1;
          var9 = Lexicominos.field_L ? 1 : 0;
          try {
            if (null == jc.field_b &&
              !dg.a(param3, true)) {
              stackIn_5_0 = -1;
              return stackIn_5_0;
            }
            if (uf.field_m == ae.field_E) {
              if (param3) {
                fa.field_b = ef.a(rc.field_f, param1 ^ 27988, (String) null, false, param0);
              } else {
                fa.field_b = fj.a(param0, param4, false, param1 ^ 118);
              }
              ed.field_q.field_h = 0;
              ed.field_q.c(14, param1 + 24);
              ed.field_q.c(fa.field_b.a((byte) 45).field_b, -1);
              kc.a(-1, -1);
              uf.field_m = rb.field_d;
            }
            if (uf.field_m == rb.field_d &&
              a.b(1, 10343)) {
              var6_int = ig.field_a.d(true);
              ig.field_a.field_h = 0;
              if (var6_int == 0) {
                uf.field_m = kf.field_z;
              } else {
                pg.field_d = var6_int;
                a.field_c = -1;
                uf.field_m = uh.field_l;
              }
            }
            if (param1 != -25) {
              stackIn_20_0 = 43;
              return stackIn_20_0;
            }
            if (kf.field_z == uf.field_m &&
              a.b(8, 10343)) {
              ti.field_M = ig.field_a.f((byte) 49);
              ig.field_a.field_h = 0;
              ri.a(param2, param3, fa.field_b, (byte) -82, param5);
              uf.field_m = he.field_h;
            }
            boolean decompiledFrameRemainder0 = true;
            if (uf.field_m == he.field_h &&
              a.b(1, 10343)) {
              var6_intLifetime1 = ig.field_a.d(true);
              ig.field_a.field_h = 0;
              pg.field_d = var6_intLifetime1;
              og.field_b = null;
              if (0 != var6_intLifetime1 &&
                var6_intLifetime1 != 1) {
                if (8 != var6_intLifetime1) {
                  a.field_c = -1;
                  uf.field_m = uh.field_l;
                  decompiledFrameRemainder0 = false;
                }
                else {
                  ck.$cfr$intArgs$b$e683eeaaf5b5(-30);
                  fb.field_p = false;
                  stackIn_30_0 = var6_intLifetime1;
                  return stackIn_30_0;
                }
              }
              if (decompiledFrameRemainder0) {
                a.field_c = -1;
                uf.field_m = ug.field_q;
              }
            }
            if (uf.field_m == ug.field_q &&
              dc.d(param1 ^ -27)) {
              rc.field_f = ig.field_a.f((byte) -110);
              vb.field_i = ig.field_a.d(true);
              ig.field_a.d(true);
              jd.field_c = ig.field_a.b(param1 - 1698573631);
              var6 = ig.field_a.e((byte) -90);
              var7 = ig.field_a.d(true);
              if ((1 & var7) != 0) {
                fg.a((byte) 120);
              }
              if (!param3) {
                stackIn_43_0 = ((var7 & 4) != 0);
                jl.field_c = stackIn_43_0;
                stackIn_46_0 = ((8 & var7) != 0);
                ul.field_k = stackIn_46_0;
                if (ul.field_k) {
                }
              }
              if (qb.field_c) {
                ig.field_a.d(true);
                ig.field_a.d(true);
                ig.field_a.d((byte) 19);
                ef.field_f = ig.field_a.b(-1698573656);
                kc.field_d = new byte[ef.field_f];
                for (var8 = 0; ef.field_f > var8; var8++) {
                  kc.field_d[var8] = ig.field_a.e(true);
                }
              }
              og.field_c = ig.field_a.c(false);
              var11 = (CharSequence) ((Object) og.field_c);
              cb.field_t = ck.a(var11, (byte) -48);
              be.field_l = ig.field_a.d(true);
              uf.field_m = gg.field_b;
              if (fa.field_b.a((byte) 45) == jf.field_M) {
                bb.field_J.a(kk.c(-14047), 4096);
              } else {
                if (fa.field_b.a((byte) 45) == ej.field_a) {
                  mh.field_B.a(kk.c(-14047), 4096);
                }
              }
              fb.field_p = false;
              if (var6 != null) {
                ee.a(var6, -11971, kk.c(-14047));
              }
              if (0 >= jd.field_c &&
                !jl.field_c) {
                try {
                  oa.a(true, kk.c(-14047), "unzap");
                } catch (java.lang.Throwable decompiledCaughtParameter0) {
                  decompiledCaughtException = decompiledCaughtParameter0;
                  var8_ref_Throwable = decompiledCaughtException;
                }
              } else {
                try {
                  oa.a(kk.c(-14047), 22347, "zap", new Object[]{jd.a(rc.field_f, param1 + 62)});
                } catch (java.lang.Throwable decompiledCaughtParameter1) {
                  decompiledCaughtException = decompiledCaughtParameter1;
                  var8_ref_Throwable = decompiledCaughtException;
                }
              }
              if (jd.field_c > 0) {
                hl.field_F = true;
              }
              ed.field_q.a(l.field_F, param1 ^ -48);
              for (var8Lifetime1 = 0; var8Lifetime1 < 4; var8Lifetime1++) {
                l.field_F[var8Lifetime1] = l.field_F[var8Lifetime1] + 50;
              }
              ig.field_a.a(l.field_F, 16);
              stackIn_73_0 = pg.field_d;
              return stackIn_73_0;
            }
            if (uf.field_m == uh.field_l &&
              dc.d(param1 + 27)) {
              ck.$cfr$intArgs$b$e683eeaaf5b5(-96);
              if (7 == pg.field_d &&
                !fb.field_p) {
                fb.field_p = true;
                stackIn_86_0 = -1;
                return stackIn_86_0;
              }
              if (pg.field_d == 7) {
                pg.field_d = 3;
              }
              wj.field_p = ig.field_a.c(false);
              fb.field_p = false;
              stackIn_84_0 = pg.field_d;
              return stackIn_84_0;
            }
            if (jc.field_b == null) {
              if (fb.field_p) {
                if (vl.b(-92) <= 30000L) {
                  wj.field_p = sa.field_h;
                } else {
                  wj.field_p = nk.field_t;
                }
                fb.field_p = false;
                stackIn_93_0 = 3;
                return stackIn_93_0;
              }
              var6_intLifetime2 = nj.field_a;
              nj.field_a = mg.field_y;
              fb.field_p = true;
              mg.field_y = var6_intLifetime2;
            }
            stackIn_96_0 = -1;
            return stackIn_96_0;
          } catch (java.lang.RuntimeException decompiledCaughtParameter2) {
            decompiledCaughtException = decompiledCaughtParameter2;
            var6_ref = (RuntimeException) (Object) decompiledCaughtException;
            stackIn_99_0 = var6_ref;
            stackIn_99_1 = new StringBuilder().append("ve.G(");
            if (param0 == null) {
              stackIn_100_2 = "null";
            } else {
              stackIn_100_2 = "{...}";
            }
            stackIn_102_1 = ((StringBuilder) (Object) stackIn_99_1).append(stackIn_100_2).append(',').append(param1).append(',').append(param2).append(',').append(param3).append(',');
            if (param4 == null) {
              stackIn_103_2 = "null";
            } else {
              stackIn_103_2 = "{...}";
            }
            throw ld.a((Throwable) ((Object) stackIn_99_0), ((StringBuilder) (Object) stackIn_102_1).append(stackIn_103_2).append(',').append(param5).append(')').toString());
          }
        } catch (RuntimeException | Error decompiledUncheckedException) {
          throw decompiledUncheckedException;
        } catch (Throwable decompiledCheckedException) {
          throw new RuntimeException(decompiledCheckedException);
        }
    }

    final int a(byte param0) {
        int var4 = 0;
        int var2;
        rj[] var3;
        rj var5;
        int var7;
        int var6;
        var7 = Lexicominos.field_L ? 1 : 0;
        var2 = -1;
        if (this.field_c != null) {
          var3 = this.field_c;
          for (var4 = 0; var3.length > var4; var4++) {
            var5 = var3[var4];
            if (var5 != null) {
              var6 = var5.a((byte) 103);
              if (var2 < var6) {
                var2 = var6;
              }
            }
          }
        }
        if (param0 != 94) {
          ve.a(true);
        }
        return var2;
    }

    final int a(int param0, byte param1, int param2) {
        int var5 = 0;
        rj var6 = null;
        int var7 = 0;
        int var8 = Lexicominos.field_L ? 1 : 0;
        if (null == this.field_c ||
          this.field_c.length == 0 ||
          param2 < this.field_c[0].field_d) {
          return -1;
        }
        if (param1 > -97) {
          this.a((byte) -5, -94);
        }
        if (this.field_c[this.field_c.length - 1].field_c < param2) {
          return -1;
        }
        if (this.field_c.length == 1) {
          return this.field_c[0].a(param0, (byte) -100);
        }
        int var4 = 0;
        for (var5 = 0; this.field_c.length > var5; var5++) {
          var6 = this.field_c[var5];
          if (var6.field_d <= param2 &&
            !(param2 > var6.field_c)) {
            var7 = var6.a(param0, (byte) -100);
            if (var7 == -1) {
              return -1;
            }
            return var7 + var4;
          }
          var4 = var4 + (-1 + var6.field_a.length);
        }
        return -1;
    }

    final int a(int param0) {
        int stackIn_6_0 = 0;
        if (param0 != 0) {
          return 36;
        }
        if (this.field_c != null &&
          this.field_c.length > 0) {
          stackIn_6_0 = -this.field_c[0].field_d + this.field_c[-1 + this.field_c.length].field_c;
        } else {
          stackIn_6_0 = 0;
        }
        return stackIn_6_0;
    }

    final int a(int param0, int param1) {
        int var3 = 0;
        rj var4 = null;
        int var5 = Lexicominos.field_L ? 1 : 0;
        for (var3 = 0; var3 < this.field_c.length; var3++) {
          var4 = this.field_c[var3];
          if (var4.field_a.length > param1) {
            return var3;
          }
          param1 = param1 - (var4.field_a.length - 1);
        }
        if (param0 != 28276) {
          this.a(73, (byte) 15, -124);
        }
        return this.field_c.length;
    }

    final int a(byte param0, int param1) {
        int var4 = 0;
        rj var5 = null;
        int var6 = Lexicominos.field_L ? 1 : 0;
        rj[] var7 = this.field_c;
        rj[] var3 = var7;
        if (param0 > -108) {
          return 107;
        }
        for (var4 = 0; var4 < var7.length; var4++) {
          var5 = var7[var4];
          if (var5.field_a.length > param1) {
            return var5.field_a[param1];
          }
          param1 = param1 - (var5.field_a.length - 1);
        }
        return 0;
    }

    final static String b(int param0) {
        if (bk.field_c == ca.field_i) {
          return Lexicominos.field_H;
        }
        if (!qa.field_c.b(param0 ^ 25590)) {
          return qa.field_c.a(false);
        }
        if (param0 != 25594) {
          return (String) null;
        }
        if (ca.field_i == ee.field_c) {
          return qa.field_c.a(false);
        }
        return dd.field_d;
    }

    static {
        field_e = new dg();
        field_b = new String[]{"The dictionaries used by Lexicominos have been compiled with reference to multiple independent sources.", "Certain words, which may offend some players, have been omitted, as have all words shorter than 3 letters or longer than 8."};
        field_a = true;
    }
}
