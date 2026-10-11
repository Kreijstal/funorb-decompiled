/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class kh extends gm {
    private int field_g;
    static ij field_k;
    private long field_h;
    private long field_j;
    static ci field_l;
    static String field_p;
    private int field_n;
    static String field_m;
    private long field_i;
    private long[] field_q;
    static boolean field_o;

    final int a(long param0, int param1) {
        int var4;
        int var5;
        int var6;
        var6 = Chess.field_G;
        var4 = 108 % ((param1 - 64) / 54);
        if (this.field_j > this.field_i) {
          this.field_h = this.field_h + (-this.field_i + this.field_j);
          this.field_i = this.field_i + (-this.field_i + this.field_j);
          this.field_j = this.field_j + param0;
          return 1;
        }
        var5 = 0;
        do {
          var5++;
          this.field_j = this.field_j + param0;
        } while (var5 < 10 &&
          this.field_i > this.field_j);
        if (this.field_j < this.field_i) {
          this.field_j = this.field_i;
        }
        return var5;
    }

    final static byte[] a(int param0, int param1, byte param2, byte[] param3) {
        int var5_int = 0;
        byte[] var4 = null;
        int var8 = 0;
        byte[] var9 = null;
        byte[] stackIn_7_0 = null;
        RuntimeException stackIn_10_0 = null;
        StringBuilder stackIn_10_1 = null;
        String stackIn_11_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var4_ref = null;
        df var5 = null;
        int var6 = 0;
        byte[] var7 = null;
        var8 = Chess.field_G;
        try {
          if (0 < param0) {
            var9 = new byte[param1];
            var4 = var9;
            for (var5_int = 0; var5_int < param1; var5_int++) {
              var9[var5_int] = param3[param0 + var5_int];
            }
          } else {
            var4 = param3;
          }
          var6 = -88 / ((param2 - 55) / 51);
          var5 = new df();
          var5.a(94);
          var5.a((byte) -122, var4, (long)(8 * param1));
          var7 = new byte[64];
          var5.a(-115, 0, var7);
          stackIn_7_0 = var7;
          return stackIn_7_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var4_ref = decompiledCaughtException;
          stackIn_10_0 = var4_ref;
          stackIn_10_1 = new StringBuilder().append("kh.H(").append(param0).append(',').append(param1).append(',').append(param2).append(',');
          if (param3 == null) {
            stackIn_11_2 = "null";
          } else {
            stackIn_11_2 = "{...}";
          }
          throw fk.a((Throwable) ((Object) stackIn_10_0), ((StringBuilder) (Object) stackIn_10_1).append(stackIn_11_2).append(')').toString());
        }
    }

    final static void c(int param0) {
        int stackIn_12_0 = 0;
        r stackIn_18_0 = null;
        boolean stackIn_19_1 = false;
        r stackIn_80_0 = null;
        boolean stackIn_81_1 = false;
        RuntimeException decompiledCaughtException = null;
        nk var1 = null;
        RuntimeException var1_ref = null;
        int var2 = 0;
        long var3_long = 0L;
        int var3 = 0;
        r var3_ref_r = null;
        int var4 = 0;
        ln var4_ref_ln = null;
        int var5 = 0;
        ln var6 = null;
        r var7 = null;
        int var8 = 0;
        r var8_ref_r = null;
        int var9 = 0;
        int var10 = 0;
        int var11 = 0;
        ln var12 = null;
        ln var13 = null;
        ln var14 = null;
        r var15 = null;
        Object var16 = null;
        String var17 = null;
        r var18 = null;
        String var19 = null;
        String var20 = null;
        ln var21 = null;
        r var22 = null;
        r var23 = null;
        String var24 = null;
        String var25 = null;
        r var26 = null;
        Object var27 = null;
        ln var27_ref = null;
        ln var28 = null;
        r var29 = null;
        ln var30 = null;
        r var3_ref_rLifetime1;
        long var3_longLifetime1;
        long var3_longLifetime2;
        int var3Lifetime1;
        int var3Lifetime2;
        int var3Lifetime3;
        int var4Lifetime1;
        int var5Lifetime1;
        int var3Lifetime4;
        int var3Lifetime5;
        int var3Lifetime6;
        long var3_longLifetime2Lifetime1;
        int var5Lifetime1Lifetime1;
        var16 = null;
        var27 = null;
        var11 = Chess.field_G;
        try {
          var1 = tk.field_h;
          if (param0 != 17) {
            kh.c(1);
          }
          var2 = ((p) ((Object) var1)).i(param0 ^ -100);
          if (var2 != 0 &&
            1 != var2 &&
            var2 != 2 &&
            var2 != 3 &&
            var2 != 4) {
            if (5 == var2) {
              var3_long = ((p) ((Object) var1)).d((byte) -124);
              var20 = ((p) ((Object) var1)).d(0);
              var17 = ((p) ((Object) var1)).d(0);
              var19 = ((p) ((Object) var1)).d(0);
              var18 = ug.a((byte) -104, var3_long);
              var8_ref_r = var18;
              stackIn_12_0 = (var17.equals("")) ? 0 : 1;
              var9 = stackIn_12_0;
              if (var18 == null) {
                var8_ref_r = new r(var20, var19, var3_long);
                d.field_Mb.a(true, var8_ref_r, var3_long);
              } else {
                if (var9 != 0) {
                  var18.a(1, var19, var20);
                }
              }
              var8_ref_r.field_Nb = ud.a(2) - (long)((p) ((Object) var1)).e((byte) -112);
              var8_ref_r.field_Pb = ((p) ((Object) var1)).f(674914976);
              var10 = ((p) ((Object) var1)).c((byte) 112);
              stackIn_18_0 = var8_ref_r;
              stackIn_19_1 = ((var10 & 1) != 0);
              stackIn_18_0.field_Hb = stackIn_19_1;
              var8_ref_r.field_Jb = var10 >> 1;
              var8_ref_r.field_Vb = ((p) ((Object) var1)).i(-99);
              var8_ref_r.field_Wb = ((p) ((Object) var1)).i(param0 - 112);
              ta.a(var8_ref_r, param0 ^ -66);
              return;
            }
            if (var2 == 6) {
              var3_longLifetime1 = ((p) ((Object) var1)).d((byte) -127);
              var5 = ((p) ((Object) var1)).i(-77);
              var29 = ug.a((byte) -92, var3_longLifetime1);
              if (var29 != null) {
                if (var29.field_Qb) {
                  cb.field_f = cb.field_f - 1;
                  var29.field_Qb = false;
                }
                if (0 == var5) {
                  var29.c(-2193);
                } else {
                  var29.field_Mb = var5;
                  var29.field_Sb = ig.field_g;
                }
                var29.d(-1);
              }
              return;
            }
            if (var2 == 7) {
              var15 = (r) (bb.field_d.g(-18110));
              while (var15 != null) {
                var15.c(-2193);
                var15.d(-1);
                var15 = (r) (bb.field_d.a((byte) -122));
              }
              cb.field_f = 0;
              return;
            }
            if (var2 == 8) {
              var3 = ((p) ((Object) var1)).f(674914976);
              var4_ref_ln = (ln) (ae.field_f.a((long)var3, param0 + 2983));
              if (var4_ref_ln == null) {
                var4_ref_ln = new ln(qa.field_e);
                ae.field_f.a(true, var4_ref_ln, (long)var3);
              }
              vl.a(var1, var4_ref_ln, true, param0 ^ 101);
              fh.a((byte) -119, var4_ref_ln);
              return;
            }
            if (var2 == 9) {
              var3Lifetime4 = ((p) ((Object) var1)).f(param0 + 674914959);
              var4 = ((p) ((Object) var1)).i(-96);
              var12 = (ln) (ae.field_f.a((long)var3Lifetime4, 3000));
              var21 = var12;
              if (var12 == null) {
                return;
              }
              if (0 == var4) {
                var21.c(param0 ^ -2178);
              } else {
                var12.field_Hb = ig.field_g;
                var12.field_jc = var4;
              }
              var21.d(-1);
              return;
            }
            if (var2 == 10) {
              var30 = (ln) (nk.field_t.g(param0 ^ -18093));
              while (var30 != null) {
                var30.c(-2193);
                var30.d(-1);
                var30 = (ln) (nk.field_t.a((byte) -115));
              }
              return;
            }
            if (var2 != 11 &&
              var2 != 12) {
              if (var2 == 13) {
                var3Lifetime5 = ((p) ((Object) var1)).f(674914976);
                var4Lifetime1 = ((p) ((Object) var1)).i(-97);
                var27_ref = (ln) (ae.field_f.a((long)var3Lifetime5, 3000));
                if (var27_ref == null) {
                  return;
                }
                var13 = var27_ref;
                var6 = var13;
                var27_ref.field_Tb = false;
                var13.field_dc = false;
                if (var4Lifetime1 != 0) {
                  var27_ref.field_jc = var4Lifetime1;
                  var27_ref.field_Hb = ig.field_g;
                }
                fh.a((byte) -127, var27_ref);
                return;
              }
              if (var2 != 14 &&
                var2 != 16) {
                if (15 != var2 &&
                  var2 != 17) {
                  if (var2 == 18) {
                    var3_longLifetime2 = ((p) ((Object) var1)).d((byte) 116);
                    var24 = ((p) ((Object) var1)).d(0);
                    var25 = ((p) ((Object) var1)).d(0);
                    var7 = mi.a(param0 ^ 134217710, var3_longLifetime2);
                    if (var7 == null) {
                      var7 = new r(var24, var25, var3_longLifetime2);
                      cm.field_v.a(true, var7, var3_longLifetime2);
                      pd.field_Rb.field_Xb = pd.field_Rb.field_Xb + 1;
                    }
                    var7.field_Pb = ((p) ((Object) var1)).f(param0 ^ 674914993);
                    var8 = ((p) ((Object) var1)).c((byte) -59);
                    var7.field_Jb = var8 >> 1;
                    stackIn_80_0 = var7;
                    stackIn_81_1 = (0 != (1 & var8));
                    stackIn_80_0.field_Hb = stackIn_81_1;
                    var7.field_Vb = ((p) ((Object) var1)).i(param0 - 142);
                    var7.field_Wb = ((p) ((Object) var1)).i(-106);
                    pd.field_Sb.a((o) (var7), (byte) 109);
                    return;
                  }
                  if (var2 == 19) {
                    var3_longLifetime2 = ((p) ((Object) var1)).d((byte) -60);
                    var5Lifetime1 = ((p) ((Object) var1)).i(param0 - 144);
                    var23 = mi.a(134217727, var3_longLifetime2);
                    if (var23 == null) {
                      return;
                    }
                    if (var5Lifetime1 != 0) {
                      var23.field_Mb = var5Lifetime1;
                      var23.field_Sb = ig.field_g;
                    } else {
                      var23.c(param0 ^ -2178);
                    }
                    var23.d(-1);
                    pd.field_Rb.field_Xb = pd.field_Rb.field_Xb - 1;
                    return;
                  }
                  if (var2 == 20) {
                    vl.a(var1, pd.field_Rb, false, param0 ^ 127);
                    return;
                  }
                  if (var2 == 21) {
                    var3Lifetime5 = ((p) ((Object) var1)).f(param0 ^ 674914993);
                    if (var3Lifetime5 == 0) {
                      eg.field_e = 0L;
                      return;
                    }
                    eg.field_e = (long)var3Lifetime5 + ud.a(2);
                    return;
                  }
                  if (var2 == 22) {
                    fm.field_W = ((p) ((Object) var1)).f(674914976);
                    jf.field_b = ((p) ((Object) var1)).c((byte) 75);
                    return;
                  }
                  if (var2 == 23) {
                    gb.field_t = ((p) ((Object) var1)).d((byte) 116);
                    return;
                  }
                  fg.a((Throwable) null, (byte) -77, "L1: " + tm.b((byte) -123));
                  si.d(param0 ^ 65297);
                  return;
                }
                var3_longLifetime2 = ((p) ((Object) var1)).d((byte) -84);
                var5Lifetime1Lifetime1 = ((p) ((Object) var1)).i(-125);
                var26 = ug.a((byte) -87, var3_longLifetime2);
                if (var26 == null) {
                  return;
                }
                if (15 == var2) {
                  var26.field_ac = false;
                } else {
                  if (var26.field_Qb) {
                    cb.field_f = cb.field_f - 1;
                    var26.field_Qb = false;
                  }
                }
                if (var5Lifetime1Lifetime1 != 0) {
                  var26.field_Mb = var5Lifetime1Lifetime1;
                  var26.field_Sb = ig.field_g;
                }
                ta.a(var26, -122);
                return;
              }
              var3_longLifetime2Lifetime1 = ((p) ((Object) var1)).d((byte) -74);
              var22 = ug.a((byte) -107, var3_longLifetime2Lifetime1);
              if (var22 != null) {
                if (var2 != 14) {
                  if (!var22.field_Qb) {
                    var22.field_Qb = true;
                    cb.field_f = cb.field_f + 1;
                  }
                } else {
                  var22.field_ac = true;
                }
                ta.a(var22, param0 ^ -116);
              }
              return;
            }
            var3Lifetime6 = ((p) ((Object) var1)).f(674914976);
            var14 = (ln) (ae.field_f.a((long)var3Lifetime6, 3000));
            var28 = var14;
            if (var14 != null) {
              if (11 != var2) {
                var28.field_Tb = true;
              } else {
                var14.field_dc = true;
              }
              fh.a((byte) -124, var28);
            }
            return;
          }
          var3_ref_r = (r) (pd.field_Sb.g(-18110));
          while (var3_ref_r != null) {
            var3_ref_r.c(-2193);
            var3_ref_r.d(param0 ^ -18);
            var3_ref_r = (r) (pd.field_Sb.a((byte) -107));
          }
          var3_ref_rLifetime1 = (r) (d.field_Mb.a(false));
          while (var3_ref_rLifetime1 != null) {
            if (var3_ref_rLifetime1.field_ac ||
              var3_ref_rLifetime1.field_Qb) {
              var3_ref_rLifetime1.field_ac = false;
              if (var3_ref_rLifetime1.field_Qb) {
                var3_ref_rLifetime1.field_Qb = false;
                cb.field_f = cb.field_f - 1;
              }
              ta.a(var3_ref_rLifetime1, -98);
            }
            var3_ref_rLifetime1 = (r) (d.field_Mb.a(0));
          }
          if (var2 == 1 &&
            pd.field_Rb != null) {
            i.field_c = pd.field_Rb.field_Gb;
          }
          if (4 != var2) {
            pd.field_Rb = null;
          } else {
            var3Lifetime1 = ((p) ((Object) var1)).f(674914976);
            pd.field_Rb = new ln(qa.field_e);
            pd.field_Rb.a((long)var3Lifetime1, (byte) 71);
            vl.a(var1, pd.field_Rb, false, 120);
            eg.field_e = 0L;
          }
          if (var2 != 2 &&
            3 != var2) {
            ib.field_d = null;
          } else {
            if (null == ib.field_d) {
              ib.field_d = new ln(qa.field_e);
            }
          }
          if (var2 != 3) {
            ud.field_b = false;
            return;
          }
          ud.field_b = true;
          for (var3Lifetime2 = 0; g.field_f.length > var3Lifetime2; var3Lifetime2++) {
            g.field_f[var3Lifetime2] = ((p) ((Object) var1)).g(0);
          }
          qd.field_u = ((p) ((Object) var1)).i(param0 ^ -105);
          p.field_n = ((p) ((Object) var1)).i(-107);
          for (var3Lifetime3 = 0; var3Lifetime3 < fe.field_d.length; var3Lifetime3++) {
            fe.field_d[var3Lifetime3] = ((p) ((Object) var1)).g(0);
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var1_ref = decompiledCaughtException;
          throw fk.a((Throwable) ((Object) var1_ref), "kh.B(" + param0 + ')');
        }
    }

    private final long c(byte param0) {
        int var9 = 0;
        int var10 = Chess.field_G;
        int var6 = -119 / ((21 - param0) / 41);
        long var2 = System.nanoTime();
        long var4 = -this.field_h + var2;
        this.field_h = var2;
        if (var4 > -5000000000L &&
          var4 < 5000000000L) {
          this.field_q[this.field_n] = var4;
          this.field_n = (this.field_n + 1) % 10;
          if (1 > this.field_g) {
            this.field_g = this.field_g + 1;
          }
        }
        long var7 = 0L;
        for (var9 = 1; this.field_g >= var9; var9++) {
          var7 = var7 + this.field_q[(10 + (this.field_n - var9)) % 10];
        }
        return var7 / (long)this.field_g;
    }

    final void b(byte param0) {
        if (param0 != 40) {
          return;
        }
        this.field_h = 0L;
        if (this.field_j > this.field_i) {
          this.field_i = this.field_i + (-this.field_i + this.field_j);
        }
    }

    final long a(byte param0) {
        this.field_i = this.field_i + this.c((byte) 126);
        if (param0 != -84) {
          field_p = (String) null;
        }
        if (this.field_i < this.field_j) {
          return (-this.field_i + this.field_j) / 1000000L;
        }
        return 0L;
    }

    final static void a(byte param0, lb param1, int param2, um param3) {
        try {
          eg.field_i = param2 * qd.d(-31137) / 1000;
          fd.a((byte) -103, param3);
          aa.a(-8428, param3);
          cd.a((byte) 127, param3);
          tl.a(false);
          ie.b(540);
          if (param0 > -121) {
            kh.b(115);
          }
          sl.field_a = 0 - eg.field_i;
        } catch (RuntimeException runtimeException) {
          throw fk.a((Throwable) ((Object) runtimeException), "kh.E(" + param0 + ',' + (param1 != null ? "{...}" : "null") + ',' + param2 + ',' + (param3 != null ? "{...}" : "null") + ')');
        }
    }

    public static void b(int param0) {
        field_k = null;
        if (param0 != 64) {
          return;
        }
        field_l = null;
        field_m = null;
        field_p = null;
    }

    kh() {
        this.field_j = 0L;
        this.field_h = 0L;
        this.field_g = 1;
        this.field_i = 0L;
        this.field_n = 0;
        this.field_q = new long[10];
        this.field_i = System.nanoTime();
        this.field_j = System.nanoTime();
    }

    static {
        field_p = "Decline invitation to <%0>'s game";
        field_m = "abcdefghijklmnopqrstuvwxyzABCDEFGHIJKLMNOPQRSTUVWXYZ0123456789!#$%&'*+-/=?^_{}~";
        field_k = new ij();
    }
}
