/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class ee extends lk {
    static long field_e;
    private int field_u;
    static String field_q;
    private ni field_v;
    private wl field_k;
    private int field_r;
    private qg field_p;
    private sp field_l;
    private sp field_i;
    private byte[] field_x;
    private ob field_w;
    static dl field_m;
    private int field_s;
    private byte[] field_h;
    private fc field_g;
    private wb field_j;
    private wb field_n;
    private int field_o;
    private boolean field_d;
    private boolean field_f;
    private boolean field_t;
    private long field_c;

    final void e(int param0) {
        wl discarded$3 = null;
        wl discarded$2 = null;
        wl discarded$1 = null;
        wl discarded$0 = null;
        int var2;
        wl var2_ref_wl;
        jb var3;
        int var4;
        int var5;
        jb var6;
        jb var7;
        int var2Lifetime1;
        int var2Lifetime2;
        int var4Lifetime1;
        jb var3Lifetime1;
        boolean decompiledFrameRemainder0 = true;
        var5 = CrazyCrystals.field_B;
        if (this.field_j != null) {
          if (this.a(630779105) == null) {
            return;
          }
          if (this.field_d) {
            var2 = 1;
            var3 = this.field_j.g(32073);
            while (var3 != null) {
              var4 = (int)var3.field_e;
              if (0 == this.field_h[var4]) {
                discarded$3 = this.a(true, 1, var4);
              }
              if (0 == this.field_h[var4]) {
                var2 = 0;
              } else {
                var3.a(false);
              }
              var3 = this.field_j.a(false);
            }
            L10: while (true) {
              if (this.field_o < this.field_p.field_f.length) {
                if (this.field_p.field_f[this.field_o] != 0) {
                  if (this.field_v.field_c >= 250) {
                    var2 = 0;
                    break L10;
                  }
                  if (this.field_h[this.field_o] == 0) {
                    discarded$2 = this.a(true, 1, this.field_o);
                  }
                  if (this.field_h[this.field_o] == 0) {
                    var6 = new jb();
                    var6.field_e = (long)this.field_o;
                    var2 = 0;
                    this.field_j.b(0, var6);
                  }
                }
                this.field_o = this.field_o + 1;
                continue;
              }
              break;
            }
            if ((var2 != 0)) {
              this.field_o = 0;
              this.field_d = false;
            }
            decompiledFrameRemainder0 = false;
          }
          else {
            if (this.field_f) {
              var2Lifetime2 = 1;
              var3Lifetime1 = this.field_j.g(32073);
              while (var3Lifetime1 != null) {
                var4Lifetime1 = (int)var3Lifetime1.field_e;
                if (1 != this.field_h[var4Lifetime1]) {
                  discarded$1 = this.a(true, 2, var4Lifetime1);
                }
                if (this.field_h[var4Lifetime1] == 1) {
                  var3Lifetime1.a(false);
                } else {
                  var2Lifetime2 = 0;
                }
                var3Lifetime1 = this.field_j.a(false);
              }
              L3: while (true) {
                if (this.field_o < this.field_p.field_f.length) {
                  if (0 != this.field_p.field_f[this.field_o]) {
                    if (this.field_w.c(-21)) {
                      var2Lifetime2 = 0;
                      break L3;
                    }
                    if (this.field_h[this.field_o] != 1) {
                      discarded$0 = this.a(true, 2, this.field_o);
                    }
                    if (this.field_h[this.field_o] != 1) {
                      var7 = new jb();
                      var7.field_e = (long)this.field_o;
                      var2Lifetime2 = 0;
                      this.field_j.b(0, var7);
                    }
                  }
                  this.field_o = this.field_o + 1;
                  continue;
                }
                break;
              }
              if ((var2Lifetime2 != 0)) {
                this.field_f = false;
                this.field_o = 0;
              }
              decompiledFrameRemainder0 = false;
            }
            else {
              this.field_j = null;
            }
          }
        }
        if (this.field_t &&
          this.field_c <= lo.a((byte) 110)) {
          var2_ref_wl = (wl) (this.field_g.a((byte) -92));
          while (var2_ref_wl != null) {
            if (!var2_ref_wl.field_n) {
              if (var2_ref_wl.field_l) {
                if (!var2_ref_wl.field_q) {
                  throw new RuntimeException();
                }
                var2_ref_wl.a(false);
              } else {
                var2_ref_wl.field_l = true;
              }
            }
            var2_ref_wl = (wl) (this.field_g.a(105));
          }
          this.field_c = 1000L + lo.a((byte) -30);
        }
        var2Lifetime1 = -100 / ((param0 + 13) / 37);
    }

    final static wj a(db param0, String param1, byte param2, String param3) {
        int var4_int = 0;
        RuntimeException var4 = null;
        int var5 = 0;
        wj stackIn_3_0 = null;
        RuntimeException stackIn_6_0 = null;
        StringBuilder stackIn_6_1 = null;
        String stackIn_7_2 = null;
        StringBuilder stackIn_9_1 = null;
        String stackIn_10_2 = null;
        StringBuilder stackIn_12_1 = null;
        String stackIn_13_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          var4_int = param0.a(param1, -1);
          var5 = param0.a(-2862, param3, var4_int);
          if (param2 >= -14) {
            field_m = (dl) null;
          }
          stackIn_3_0 = v.a(28297, var4_int, var5, param0);
          return stackIn_3_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var4 = decompiledCaughtException;
          stackIn_6_0 = var4;
          stackIn_6_1 = new StringBuilder().append("ee.K(");
          if (param0 == null) {
            stackIn_7_2 = "null";
          } else {
            stackIn_7_2 = "{...}";
          }
          stackIn_9_1 = ((StringBuilder) (Object) stackIn_6_1).append(stackIn_7_2).append(',');
          if (param1 == null) {
            stackIn_10_2 = "null";
          } else {
            stackIn_10_2 = "{...}";
          }
          stackIn_12_1 = ((StringBuilder) (Object) stackIn_9_1).append(stackIn_10_2).append(',').append(param2).append(',');
          if (param3 == null) {
            stackIn_13_2 = "null";
          } else {
            stackIn_13_2 = "{...}";
          }
          throw dn.a((Throwable) ((Object) stackIn_6_0), ((StringBuilder) (Object) stackIn_12_1).append(stackIn_13_2).append(')').toString());
        }
    }

    final int a(int param0, int param1) {
        wl var3 = (wl) (this.field_g.a((long)param0, 0));
        if (param1 != 486289953) {
          this.e(-120);
        }
        if (var3 == null) {
          return 0;
        }
        return var3.b((byte) 95);
    }

    final byte[] a(int param0, boolean param1) {
        wl var3 = this.a(true, 0, param0);
        if (param1) {
          this.field_c = -78L;
        }
        if (var3 == null) {
          return null;
        }
        byte[] var4 = var3.e(-27);
        var3.a(param1);
        return var4;
    }

    public static void d(int param0) {
        field_q = null;
        field_m = null;
        if (param0 != 0) {
          ee.d(-92);
        }
    }

    private final wl a(boolean param0, int param1, int param2) {
        Object stackIn_58_0 = null;
        boolean stackIn_59_1 = false;
        Object stackIn_61_0 = null;
        Object stackIn_85_0 = null;
        boolean stackIn_86_1 = false;
        int stackIn_94_0 = 0;
        byte stackIn_94_1 = 0;
        Throwable decompiledCaughtException = null;
        Object var4 = null;
        byte[] var5 = null;
        int var6_int = 0;
        RuntimeException var6 = null;
        Exception var6_ref = null;
        int var7 = 0;
        int var9 = 0;
        int var10 = 0;
        int var11 = 0;
        wl var12 = null;
        byte[] var13 = null;
        byte[] var18 = null;
        byte[] var27 = null;
        byte[] var28 = null;
        byte[] var29 = null;
        byte[] var30 = null;
        var10 = CrazyCrystals.field_B;
        var12 = (wl) (this.field_g.a((long)param2, 0));
        var4 = var12;
        if (var12 != null &&
          param1 == 0 &&
          !var12.field_q &&
          var12.field_n) {
          var12.a(false);
          var4 = null;
        }
        if (!param0) {
          this.a(-107);
        }
        if (var4 == null) {
          if (0 == param1) {
            if (this.field_l != null &&
              this.field_h[param2] != -1) {
              var4 = this.field_v.a(param0, param2, this.field_l);
            } else {
              if (this.field_w.c((byte) -123)) {
                return null;
              }
              var4 = this.field_w.a(true, 18303, param2, this.field_r, (byte) 2);
            }
          } else {
            if (1 != param1) {
              if (param1 != 2) {
                throw new RuntimeException();
              }
              if (this.field_l == null) {
                throw new RuntimeException();
              }
              if (this.field_h[param2] != -1) {
                throw new RuntimeException();
              }
              if (this.field_w.c(-21)) {
                return null;
              }
              var4 = this.field_w.a(false, 18303, param2, this.field_r, (byte) 2);
            } else {
              if (null == this.field_l) {
                throw new RuntimeException();
              }
              var4 = this.field_v.a(-4, param2, this.field_l);
            }
          }
          this.field_g.a(-22072, (long)param2, (jb) (var4));
        }
        if (((wl) (var4)).field_n) {
          return null;
        }
        var18 = ((wl) (var4)).e(-5);
        var13 = var18;
        var5 = var13;
        if (var4 instanceof mf) {
          try {
            if (var5 != null &&
              2 < var18.length) {
              sj.field_b.reset();
              sj.field_b.update(var5, 0, -2 + var18.length);
              var6_int = (int)sj.field_b.getValue();
              if (this.field_p.field_n[param2] != var6_int) {
                throw new RuntimeException();
              }
              if (null != this.field_p.field_m &&
                null != this.field_p.field_m[param2]) {
                var27 = this.field_p.field_m[param2];
                var28 = ac.a(var5, 0, -2 + var18.length, (byte) -127);
                for (var9 = 0; 64 > var9; var9++) {
                  if (~var27[var9] != ~var28[var9]) {
                    throw new RuntimeException();
                  }
                }
              }
              var7 = (65280 & var5[var18.length - 2] << 8) + (var5[var18.length - 1] & 255);
              if (var7 != (this.field_p.field_g[param2] & 65535)) {
                throw new RuntimeException();
              }
              if (this.field_h[param2] != 1) {
                if (this.field_h[param2] == 0) {
                }
                this.field_h[param2] = (byte) 1;
              }
              if (!((wl) (var4)).field_q) {
                stackIn_58_0 = var4;
                stackIn_59_1 = !(param0);
                ((wl) stackIn_58_0).a(stackIn_59_1);
              }
              stackIn_61_0 = var4;
              return (wl) (stackIn_61_0);
            }
            throw new RuntimeException();
          } catch (java.lang.Exception decompiledCaughtParameter1) {
            decompiledCaughtException = decompiledCaughtParameter1;
            var6_ref = (Exception) (Object) decompiledCaughtException;
            this.field_h[param2] = (byte)-1;
            ((wl) (var4)).a(false);
            if (((wl) (var4)).field_q &&
              !this.field_w.c((byte) -72)) {
              var4 = this.field_w.a(true, 18303, param2, this.field_r, (byte) 2);
              this.field_g.a(-22072, (long)param2, (jb) (var4));
            }
            return null;
          }
        }
        try {
          if (var5 != null &&
            var18.length > 2) {
            sj.field_b.reset();
            sj.field_b.update(var5, 0, -2 + var18.length);
            var6_int = (int)sj.field_b.getValue();
            if (var6_int != this.field_p.field_n[param2]) {
              throw new RuntimeException();
            }
            if (this.field_p.field_m != null &&
              this.field_p.field_m[param2] != null) {
              var29 = this.field_p.field_m[param2];
              var30 = ac.a(var5, 0, -2 + var18.length, (byte) -127);
              var11 = 0;
              var9 = var11;
              while (var11 < 64) {
                if (~var29[var11] != ~var30[var11]) {
                  throw new RuntimeException();
                }
                var11++;
              }
            }
            this.field_w.field_j = 0;
            this.field_w.field_p = 0;
          } else {
            throw new RuntimeException();
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var6 = (RuntimeException) (Object) decompiledCaughtException;
          this.field_w.e(20406);
          stackIn_85_0 = var4;
          stackIn_86_1 = !(param0);
          ((wl) stackIn_85_0).a(stackIn_86_1);
          if (((wl) (var4)).field_q) {
            if (this.field_w.c((byte) -73)) {
              return null;
            }
            var4 = this.field_w.a(true, 18303, param2, this.field_r, (byte) 2);
            this.field_g.a(-22072, (long)param2, (jb) (var4));
          }
          return null;
        }
        var5[var18.length - 2] = (byte)(this.field_p.field_g[param2] >>> 8);
        var5[var18.length - 1] = (byte)this.field_p.field_g[param2];
        if (null != this.field_l) {
          this.field_v.a(param2, this.field_l, var18, (byte) 116);
          stackIn_94_0 = 1;
          stackIn_94_1 = this.field_h[param2];
          if (stackIn_94_0 != stackIn_94_1) {
            this.field_h[param2] = (byte) 1;
          }
        }
        if (!((wl) (var4)).field_q) {
          ((wl) (var4)).a(false);
        }
        return (wl) (var4);
    }

    final qg a(int param0) {
        RuntimeException decompiledCaughtException = null;
        byte[] var2 = null;
        RuntimeException var3 = null;
        int var4 = 0;
        byte[] var5 = null;
        byte[] var6 = null;
        byte[] var7 = null;
        byte[] var8 = null;
        byte[] var9 = null;
        var4 = CrazyCrystals.field_B;
        if (null != this.field_p) {
          return this.field_p;
        }
        if (param0 != 630779105) {
          return (qg) null;
        }
        if (this.field_k == null) {
          if (this.field_w.c((byte) -54)) {
            return null;
          }
          this.field_k = (wl) ((Object) this.field_w.a(true, 18303, this.field_r, 255, (byte) 0));
        }
        if (this.field_k.field_n) {
          return null;
        }
        var8 = this.field_k.e(115);
        var6 = var8;
        var5 = var6;
        var9 = var5;
        var7 = var9;
        var2 = var7;
        if (this.field_k instanceof mf) {
          try {
            if (var2 == null) {
              throw new RuntimeException();
            }
            this.field_p = new qg(var9, this.field_u, this.field_x);
            if (this.field_s != this.field_p.field_r) {
              throw new RuntimeException();
            }
          } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
            decompiledCaughtException = decompiledCaughtParameter0;
            var3 = decompiledCaughtException;
            this.field_p = null;
            if (this.field_w.c((byte) -90)) {
              this.field_k = null;
            } else {
              this.field_k = (wl) ((Object) this.field_w.a(true, 18303, this.field_r, 255, (byte) 0));
            }
            return null;
          }
        } else {
          try {
            if (var5 == null) {
              throw new RuntimeException();
            }
            this.field_p = new qg(var8, this.field_u, this.field_x);
          } catch (java.lang.RuntimeException decompiledCaughtParameter1) {
            decompiledCaughtException = decompiledCaughtParameter1;
            var3 = decompiledCaughtException;
            this.field_w.e(20406);
            this.field_p = null;
            if (!this.field_w.c((byte) -82)) {
              this.field_k = (wl) ((Object) this.field_w.a(true, 18303, this.field_r, 255, (byte) 0));
            } else {
              this.field_k = null;
            }
            return null;
          }
          if (null != this.field_i) {
            this.field_v.a(this.field_r, this.field_i, var8, (byte) 116);
          }
        }
        if (null != this.field_l) {
          this.field_h = new byte[this.field_p.field_a];
        }
        this.field_k = null;
        return this.field_p;
    }

    final void c(int param0) {
        wl discarded$0 = null;
        wl discarded$1 = null;
        jb var2;
        int var3;
        int var4;
        var4 = CrazyCrystals.field_B;
        if (null == this.field_j) {
          return;
        }
        if (param0 < 112) {
          this.field_h = (byte[]) null;
        }
        if (this.a(630779105) == null) {
          return;
        }
        var2 = this.field_n.g(32073);
        while (var2 != null) {
          var3 = (int)var2.field_e;
          if (var3 >= 0) {
            if (this.field_p.field_a > var3) {
              if (this.field_p.field_f[var3] == 0) {
                var2.a(false);
              } else {
                if (0 == this.field_h[var3]) {
                  discarded$0 = this.a(true, 1, var3);
                }
                if (this.field_h[var3] == -1) {
                  discarded$1 = this.a(true, 2, var3);
                }
                if (this.field_h[var3] == 1) {
                  var2.a(false);
                }
              }
            } else {
              var2.a(false);
            }
          } else {
            var2.a(false);
          }
          var2 = this.field_n.a(false);
        }
    }

    final static boolean a(int[] param0, int param1) {
        int var5_int = 0;
        int var6 = 0;
        int stackIn_21_0 = 0;
        RuntimeException stackIn_43_0 = null;
        StringBuilder stackIn_43_1 = null;
        String stackIn_44_2 = null;
        RuntimeException decompiledCaughtException = null;
        long var2_long = 0L;
        RuntimeException var2 = null;
        mo var4_ref_mo = null;
        int var4 = 0;
        mo var5 = null;
        int var7 = 0;
        var7 = CrazyCrystals.field_B;
        try {
          if (ek.field_h != gj.field_k) {
            return false;
          }
          if (param1 != 64) {
            return false;
          }
          var2_long = lo.a((byte) -98);
          if (0 != wb.field_d &&
            sm.field_i < 0) {
            var4_ref_mo = (mo) (bn.field_i.g(32073));
            if (var4_ref_mo != null &&
              var4_ref_mo.field_k < var2_long) {
              var4_ref_mo.a(false);
              rk.field_b = var4_ref_mo.field_g.length;
              kd.field_n.field_f = 0;
              for (var5_int = 0; rk.field_b > var5_int; var5_int++) {
                kd.field_n.field_h[var5_int] = var4_ref_mo.field_g[var5_int];
              }
              fl.field_m = ea.field_n;
              ea.field_n = qn.field_u;
              qn.field_u = bf.field_b;
              bf.field_b = var4_ref_mo.field_j;
              return true;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2 = decompiledCaughtException;
          stackIn_43_0 = var2;
          stackIn_43_1 = new StringBuilder().append("ee.G(");
          if (param0 == null) {
            stackIn_44_2 = "null";
          } else {
            stackIn_44_2 = "{...}";
          }
          throw dn.a((Throwable) ((Object) stackIn_43_0), ((StringBuilder) (Object) stackIn_43_1).append(stackIn_44_2).append(',').append(param1).append(')').toString());
        }
        stackIn_21_0 = sm.field_i;
        try {
          while (true) {
            if (stackIn_21_0 < 0) {
              kd.field_n.field_f = 0;
              if (!fq.a(1, (byte) 104)) {
                return false;
              }
              sm.field_i = kd.field_n.e(true);
              kd.field_n.field_f = 0;
              rk.field_b = param0[sm.field_i];
            }
            if (!ol.f((byte) 60)) {
              return false;
            }
            if (wb.field_d == 0) {
              fl.field_m = ea.field_n;
              ea.field_n = qn.field_u;
              qn.field_u = bf.field_b;
              bf.field_b = sm.field_i;
              sm.field_i = -1;
              return true;
            }
            var4 = wb.field_d;
            if (0.0 != kk.field_b) {
              var4 = (int)((double)var4 + og.field_w.nextGaussian() * kk.field_b);
              if (var4 < 0) {
                var4 = 0;
              }
            }
            var5 = new mo((long)var4 + var2_long, sm.field_i, new byte[rk.field_b]);
            for (var6 = 0; var6 < rk.field_b; var6++) {
              var5.field_g[var6] = kd.field_n.field_h[var6];
            }
            bn.field_i.b(param1 ^ 64, var5);
            sm.field_i = -1;
            stackIn_21_0 = sm.field_i;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter1) {
          decompiledCaughtException = decompiledCaughtParameter1;
          var2 = decompiledCaughtException;
          stackIn_43_0 = var2;
          stackIn_43_1 = new StringBuilder().append("ee.G(");
          if (param0 == null) {
            stackIn_44_2 = "null";
          } else {
            stackIn_44_2 = "{...}";
          }
          throw dn.a((Throwable) ((Object) stackIn_43_0), ((StringBuilder) (Object) stackIn_43_1).append(stackIn_44_2).append(',').append(param1).append(')').toString());
        }
    }

    final void b(byte param0) {
        if (this.field_l == null) {
          return;
        }
        this.field_f = true;
        if (this.field_j == null) {
          this.field_j = new wb();
        }
        int var2 = 42 % ((param0 - 7) / 45);
    }

    ee(int param0, sp param1, sp param2, ob param3, ni param4, int param5, byte[] param6, int param7, boolean param8) {
        boolean stackIn_7_1 = false;
        RuntimeException stackIn_12_0 = null;
        StringBuilder stackIn_12_1 = null;
        String stackIn_13_2 = null;
        StringBuilder stackIn_15_1 = null;
        String stackIn_16_2 = null;
        StringBuilder stackIn_18_1 = null;
        String stackIn_19_2 = null;
        StringBuilder stackIn_21_1 = null;
        String stackIn_22_2 = null;
        StringBuilder stackIn_24_1 = null;
        String stackIn_25_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var10 = null;
        this.field_g = new fc(16);
        this.field_o = 0;
        this.field_n = new wb();
        this.field_c = 0L;
        try {
          this.field_l = param1;
          this.field_r = param0;
          if (null == this.field_l) {
            this.field_d = false;
          } else {
            this.field_d = true;
            this.field_j = new wb();
          }
          this.field_s = param7;
          this.field_i = param2;
          this.field_w = param3;
          stackIn_7_1 = (param8);
          this.field_t = stackIn_7_1;
          this.field_u = param5;
          this.field_v = param4;
          this.field_x = param6;
          if (null != this.field_i) {
            this.field_k = (wl) ((Object) this.field_v.a(true, this.field_r, this.field_i));
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var10 = decompiledCaughtException;
          stackIn_12_0 = var10;
          stackIn_12_1 = new StringBuilder().append("ee.<init>(").append(param0).append(',');
          if (param1 == null) {
            stackIn_13_2 = "null";
          } else {
            stackIn_13_2 = "{...}";
          }
          stackIn_15_1 = ((StringBuilder) (Object) stackIn_12_1).append(stackIn_13_2).append(',');
          if (param2 == null) {
            stackIn_16_2 = "null";
          } else {
            stackIn_16_2 = "{...}";
          }
          stackIn_18_1 = ((StringBuilder) (Object) stackIn_15_1).append(stackIn_16_2).append(',');
          if (param3 == null) {
            stackIn_19_2 = "null";
          } else {
            stackIn_19_2 = "{...}";
          }
          stackIn_21_1 = ((StringBuilder) (Object) stackIn_18_1).append(stackIn_19_2).append(',');
          if (param4 == null) {
            stackIn_22_2 = "null";
          } else {
            stackIn_22_2 = "{...}";
          }
          stackIn_24_1 = ((StringBuilder) (Object) stackIn_21_1).append(stackIn_22_2).append(',').append(param5).append(',');
          if (param6 == null) {
            stackIn_25_2 = "null";
          } else {
            stackIn_25_2 = "{...}";
          }
          throw dn.a((Throwable) ((Object) stackIn_12_0), ((StringBuilder) (Object) stackIn_24_1).append(stackIn_25_2).append(',').append(param7).append(',').append(param8).append(')').toString());
        }
    }

    static {
        field_q = "Login: ";
    }
}
