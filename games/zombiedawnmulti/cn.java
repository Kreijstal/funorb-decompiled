/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class cn extends ng {
    private be field_s;
    private byte[] field_A;
    static String field_C;
    private bq field_x;
    private f field_p;
    private byte[] field_k;
    private qb field_h;
    static ao field_j;
    private bq field_t;
    private qc field_l;
    private ai field_z;
    private int field_B;
    static String field_u;
    private int field_w;
    private int field_o;
    private boolean field_m;
    private th field_q;
    private th field_v;
    private int field_i;
    private boolean field_y;
    private boolean field_n;
    private long field_r;

    final static ic a(byte param0, String param1, String param2, boolean param3) {
        long var4_long = 0L;
        RuntimeException var4 = null;
        Object var6 = null;
        CharSequence var7 = null;
        ic stackIn_2_0 = null;
        ic stackIn_7_0 = null;
        RuntimeException stackIn_10_0 = null;
        StringBuilder stackIn_10_1 = null;
        String stackIn_11_2 = null;
        StringBuilder stackIn_13_1 = null;
        String stackIn_14_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          if (param0 < 116) {
            stackIn_2_0 = (ic) null;
            return stackIn_2_0;
          }
          var4_long = 0L;
          var6 = null;
          if (-1 == param1.indexOf('@')) {
            var7 = (CharSequence) ((Object) param1);
            var4_long = cq.a(0, var7);
          } else {
            var6 = param1;
          }
          stackIn_7_0 = eg.a(64, var4_long, (String) (var6), param3, param2);
          return stackIn_7_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var4 = decompiledCaughtException;
          stackIn_10_0 = var4;
          stackIn_10_1 = new StringBuilder().append("cn.I(").append(param0).append(',');
          if (param1 == null) {
            stackIn_11_2 = "null";
          } else {
            stackIn_11_2 = "{...}";
          }
          stackIn_13_1 = ((StringBuilder) (Object) stackIn_10_1).append(stackIn_11_2).append(',');
          if (param2 == null) {
            stackIn_14_2 = "null";
          } else {
            stackIn_14_2 = "{...}";
          }
          throw fa.a((Throwable) ((Object) stackIn_10_0), ((StringBuilder) (Object) stackIn_13_1).append(stackIn_14_2).append(',').append(param3).append(')').toString());
        }
    }

    final void a(boolean param0) {
        if (this.field_x == null) {
          return;
        }
        this.field_m = true;
        if (null == this.field_v) {
          this.field_v = new th();
        }
        if (param0) {
          this.field_i = -112;
        }
    }

    final void c(int param0) {
        qc discarded$0 = null;
        qc discarded$1 = null;
        br var2;
        int var3;
        int var4;
        var4 = ZombieDawnMulti.field_E ? 1 : 0;
        if (null == this.field_v) {
          return;
        }
        if (null == this.a((byte) -101)) {
          return;
        }
        var2 = this.field_q.c(65);
        while (var2 != null) {
          var3 = (int)var2.field_e;
          if (var3 >= 0) {
            if (var3 < this.field_s.field_e) {
              if (this.field_s.field_s[var3] == 0) {
                var2.a(true);
              } else {
                if (this.field_A[var3] == 0) {
                  discarded$0 = this.b(1, 0, var3);
                }
                if (-1 == this.field_A[var3]) {
                  discarded$1 = this.b(2, 0, var3);
                }
                if (this.field_A[var3] == 1) {
                  var2.a(true);
                }
              }
            } else {
              var2.a(true);
            }
          } else {
            var2.a(true);
          }
          var2 = this.field_q.b(6);
        }
        if (param0 <= 64) {
          cn.a((ul) null, -84, (byte[]) null, (int[]) null, (byte[]) null, -44, (String[]) null, (ul) null, (ri[]) null, (ul) null, 116, (ja[][]) null, true, (String[][]) null, (int[]) null, (ja[][]) null, (String[][]) null);
        }
        return;
    }

    final be a(byte param0) {
        RuntimeException decompiledCaughtException = null;
        byte[] var2 = null;
        RuntimeException var3 = null;
        int var4 = 0;
        byte[] var5 = null;
        byte[] var6 = null;
        byte[] var7 = null;
        var4 = ZombieDawnMulti.field_E ? 1 : 0;
        if (this.field_s != null) {
          return this.field_s;
        }
        if (null == this.field_l) {
          if (this.field_h.e(24)) {
            return null;
          }
          this.field_l = (qc) ((Object) this.field_h.a(487989472, this.field_B, true, 255, (byte) 0));
        }
        if (this.field_l.field_t) {
          return null;
        }
        var7 = this.field_l.e(0);
        var6 = var7;
        var5 = var6;
        var2 = var5;
        if (param0 > -83) {
          cn.d(-53);
        }
        if (this.field_l instanceof li) {
          try {
            if (var5 == null) {
              throw new RuntimeException();
            }
            this.field_s = new be(var7, this.field_o, this.field_k);
            if (this.field_w != this.field_s.field_h) {
              throw new RuntimeException();
            }
          } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
            decompiledCaughtException = decompiledCaughtParameter0;
            var3 = decompiledCaughtException;
            this.field_s = null;
            if (this.field_h.e(88)) {
              this.field_l = null;
            } else {
              this.field_l = (qc) ((Object) this.field_h.a(487989472, this.field_B, true, 255, (byte) 0));
            }
            return null;
          }
        } else {
          try {
            if (var5 == null) {
              throw new RuntimeException();
            }
            this.field_s = new be(var7, this.field_o, this.field_k);
          } catch (java.lang.RuntimeException decompiledCaughtParameter1) {
            decompiledCaughtException = decompiledCaughtParameter1;
            var3 = decompiledCaughtException;
            this.field_h.a((byte) 113);
            this.field_s = null;
            if (this.field_h.e(98)) {
              this.field_l = null;
            } else {
              this.field_l = (qc) ((Object) this.field_h.a(487989472, this.field_B, true, 255, (byte) 0));
            }
            return null;
          }
          if (this.field_t != null) {
            this.field_z.a(this.field_B, this.field_t, var7, 100);
          }
        }
        this.field_l = null;
        if (this.field_x != null) {
          this.field_A = new byte[this.field_s.field_e];
        }
        return this.field_s;
    }

    final static ja[] a(boolean param0, String param1, ul param2, String param3) {
        int var4_int = 0;
        RuntimeException var4 = null;
        int var5 = 0;
        ja[] stackIn_2_0 = null;
        ja[] stackIn_4_0 = null;
        RuntimeException stackIn_7_0 = null;
        StringBuilder stackIn_7_1 = null;
        String stackIn_8_2 = null;
        StringBuilder stackIn_10_1 = null;
        String stackIn_11_2 = null;
        StringBuilder stackIn_13_1 = null;
        String stackIn_14_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          var4_int = param2.a(param3, (byte) 112);
          if (!param0) {
            stackIn_2_0 = (ja[]) null;
            return stackIn_2_0;
          }
          var5 = param2.a(param1, var4_int, -1);
          stackIn_4_0 = a.a(var5, (byte) -93, param2, var4_int);
          return stackIn_4_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var4 = decompiledCaughtException;
          stackIn_7_0 = var4;
          stackIn_7_1 = new StringBuilder().append("cn.F(").append(param0).append(',');
          if (param1 == null) {
            stackIn_8_2 = "null";
          } else {
            stackIn_8_2 = "{...}";
          }
          stackIn_10_1 = ((StringBuilder) (Object) stackIn_7_1).append(stackIn_8_2).append(',');
          if (param2 == null) {
            stackIn_11_2 = "null";
          } else {
            stackIn_11_2 = "{...}";
          }
          stackIn_13_1 = ((StringBuilder) (Object) stackIn_10_1).append(stackIn_11_2).append(',');
          if (param3 == null) {
            stackIn_14_2 = "null";
          } else {
            stackIn_14_2 = "{...}";
          }
          throw fa.a((Throwable) ((Object) stackIn_7_0), ((StringBuilder) (Object) stackIn_13_1).append(stackIn_14_2).append(')').toString());
        }
    }

    final static void a(int param0, boolean param1, int param2, byte param3) {
        aa.a((byte) 124, param1);
        lp.a((byte) -45, param0, param1, param2);
        if (param3 > -79) {
          field_u = (String) null;
        }
    }

    final int b(int param0, int param1) {
        qc var3 = (qc) (this.field_p.a(param1 ^ param1, (long)param0));
        if (var3 != null) {
          return var3.f(param1 + 103);
        }
        return 0;
    }

    final void b(int param0) {
        qc discarded$3 = null;
        qc discarded$2 = null;
        qc discarded$1 = null;
        qc discarded$0 = null;
        int var2_int;
        qc var2;
        br var3;
        int var4;
        int var5;
        br var6;
        br var7;
        int var2_intLifetime1;
        int var4Lifetime1;
        br var3Lifetime1;
        var5 = ZombieDawnMulti.field_E ? 1 : 0;
        if (param0 != -2) {
          this.field_t = (bq) null;
        }
        boolean decompiledFrameRemainder0 = true;
        if (null != this.field_v) {
          if (null == this.a((byte) -110)) {
            return;
          }
          if (this.field_y) {
            var2_int = 1;
            var3 = this.field_v.c(46);
            while (var3 != null) {
              var4 = (int)var3.field_e;
              if (this.field_A[var4] == 0) {
                discarded$3 = this.b(1, 0, var4);
              }
              if (this.field_A[var4] == 0) {
                var2_int = 0;
              } else {
                var3.a(true);
              }
              var3 = this.field_v.b(6);
            }
            L11: while (true) {
              if (this.field_i < this.field_s.field_s.length) {
                if (this.field_s.field_s[this.field_i] != 0) {
                  if (250 <= this.field_z.field_h) {
                    var2_int = 0;
                    break L11;
                  }
                  if (this.field_A[this.field_i] == 0) {
                    discarded$2 = this.b(1, 0, this.field_i);
                  }
                  if (this.field_A[this.field_i] == 0) {
                    var6 = new br();
                    var6.field_e = (long)this.field_i;
                    this.field_v.a(var6, false);
                    var2_int = 0;
                  }
                }
                this.field_i = this.field_i + 1;
                continue;
              }
              break;
            }
            if ((var2_int != 0)) {
              this.field_y = false;
              this.field_i = 0;
            }
            decompiledFrameRemainder0 = false;
          }
          else {
            if (this.field_m) {
              var2_intLifetime1 = 1;
              var3Lifetime1 = this.field_v.c(105);
              while (var3Lifetime1 != null) {
                var4Lifetime1 = (int)var3Lifetime1.field_e;
                if (1 != this.field_A[var4Lifetime1]) {
                  discarded$1 = this.b(2, param0 ^ -2, var4Lifetime1);
                }
                if (this.field_A[var4Lifetime1] != 1) {
                  var2_intLifetime1 = 0;
                } else {
                  var3Lifetime1.a(true);
                }
                var3Lifetime1 = this.field_v.b(6);
              }
              L4: while (true) {
                if (this.field_i < this.field_s.field_s.length) {
                  if (this.field_s.field_s[this.field_i] != 0) {
                    if (this.field_h.c(param0 - 89)) {
                      var2_intLifetime1 = 0;
                      break L4;
                    }
                    if (this.field_A[this.field_i] != 1) {
                      discarded$0 = this.b(2, 0, this.field_i);
                    }
                    if (this.field_A[this.field_i] != 1) {
                      var7 = new br();
                      var7.field_e = (long)this.field_i;
                      var2_intLifetime1 = 0;
                      this.field_v.a(var7, false);
                    }
                  }
                  this.field_i = this.field_i + 1;
                  continue;
                }
                break;
              }
              if ((var2_intLifetime1 != 0)) {
                this.field_m = false;
                this.field_i = 0;
              }
              decompiledFrameRemainder0 = false;
            }
            else {
              this.field_v = null;
            }
          }
        }
        if (this.field_n &&
          bl.a((byte) 48) >= this.field_r) {
          var2 = (qc) (this.field_p.a(0));
          while (var2 != null) {
            if (!var2.field_t) {
              if (var2.field_x) {
                if (!var2.field_r) {
                  throw new RuntimeException();
                }
                var2.a(true);
              } else {
                var2.field_x = true;
              }
            }
            var2 = (qc) (this.field_p.b(param0 ^ 122));
          }
          this.field_r = bl.a((byte) 114) + 1000L;
        }
    }

    private final qc b(int param0, int param1, int param2) {
        Object stackIn_58_0 = null;
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
        qc var12 = null;
        byte[] var13 = null;
        byte[] var18 = null;
        byte[] var27 = null;
        byte[] var28 = null;
        byte[] var29 = null;
        byte[] var30 = null;
        var10 = ZombieDawnMulti.field_E ? 1 : 0;
        var12 = (qc) (this.field_p.a(0, (long)param2));
        var4 = var12;
        if (var12 != null &&
          param0 == 0 &&
          !var12.field_r &&
          var12.field_t) {
          var12.a(true);
          var4 = null;
        }
        if (var4 == null) {
          if (param0 != 0) {
            if (param0 != 1) {
              if (param0 != 2) {
                throw new RuntimeException();
              }
              if (this.field_x == null) {
                throw new RuntimeException();
              }
              if (-1 != this.field_A[param2]) {
                throw new RuntimeException();
              }
              if (this.field_h.c(-64)) {
                return null;
              }
              var4 = this.field_h.a(487989472, param2, false, this.field_B, (byte) 2);
            } else {
              if (this.field_x == null) {
                throw new RuntimeException();
              }
              var4 = this.field_z.b(param2, this.field_x, 10);
            }
          } else {
            if (this.field_x != null &&
              this.field_A[param2] != -1) {
              var4 = this.field_z.a(param2, this.field_x, -3);
            } else {
              if (this.field_h.e(param1 + 116)) {
                return null;
              }
              var4 = this.field_h.a(487989472, param2, true, this.field_B, (byte) 2);
            }
          }
          this.field_p.a(true, (long)param2, (br) (var4));
        }
        if (((qc) (var4)).field_t) {
          return null;
        }
        var18 = ((qc) (var4)).e(param1);
        var13 = var18;
        var5 = var13;
        if (var4 instanceof li) {
          try {
            if (var5 != null &&
              var18.length > 2) {
              gn.field_B.reset();
              gn.field_B.update(var5, 0, -2 + var18.length);
              var6_int = (int)gn.field_B.getValue();
              if (this.field_s.field_r[param2] != var6_int) {
                throw new RuntimeException();
              }
              if (null != this.field_s.field_a &&
                this.field_s.field_a[param2] != null) {
                var27 = this.field_s.field_a[param2];
                var28 = ho.a(4246, 0, var5, var18.length - 2);
                for (var9 = 0; var9 < 64; var9++) {
                  if (~var27[var9] != ~var28[var9]) {
                    throw new RuntimeException();
                  }
                }
              }
              var7 = (65280 & var5[var18.length - 2] << 8) + (255 & var5[var18.length - 1]);
              if (var7 != (this.field_s.field_p[param2] & 65535)) {
                throw new RuntimeException();
              }
              if (this.field_A[param2] != 1) {
                if (0 == this.field_A[param2]) {
                }
                this.field_A[param2] = (byte) 1;
              }
              if (!((qc) (var4)).field_r) {
                ((qc) (var4)).a(true);
              }
              stackIn_58_0 = var4;
              return (qc) (stackIn_58_0);
            }
            throw new RuntimeException();
          } catch (java.lang.Exception decompiledCaughtParameter1) {
            decompiledCaughtException = decompiledCaughtParameter1;
            var6_ref = (Exception) (Object) decompiledCaughtException;
            this.field_A[param2] = (byte)-1;
            ((qc) (var4)).a(true);
            if (!((qc) (var4)).field_r) {
              return null;
            }
            if (this.field_h.e(34)) {
              return null;
            }
            var4 = this.field_h.a(487989472, param2, true, this.field_B, (byte) 2);
            this.field_p.a(true, (long)param2, (br) (var4));
            return null;
          }
        }
        try {
          if (var5 != null &&
            var18.length > 2) {
            gn.field_B.reset();
            gn.field_B.update(var5, 0, -2 + var18.length);
            var6_int = (int)gn.field_B.getValue();
            if (this.field_s.field_r[param2] != var6_int) {
              throw new RuntimeException();
            }
            if (this.field_s.field_a != null &&
              this.field_s.field_a[param2] != null) {
              var30 = this.field_s.field_a[param2];
              var29 = ho.a(4246, 0, var5, -2 + var18.length);
              var11 = 0;
              var9 = var11;
              while (var11 < 64) {
                if (~var29[var11] != ~var30[var11]) {
                  throw new RuntimeException();
                }
                var11++;
              }
            }
            this.field_h.field_n = 0;
            this.field_h.field_p = 0;
          } else {
            throw new RuntimeException();
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var6 = (RuntimeException) (Object) decompiledCaughtException;
          this.field_h.a((byte) 95);
          ((qc) (var4)).a(true);
          if (!((qc) (var4)).field_r) {
            return null;
          }
          if (!this.field_h.e(110)) {
            var4 = this.field_h.a(487989472, param2, true, this.field_B, (byte) 2);
            this.field_p.a(true, (long)param2, (br) (var4));
          }
          return null;
        }
        var5[-2 + var18.length] = (byte)(this.field_s.field_p[param2] >>> 8);
        var5[-1 + var18.length] = (byte)this.field_s.field_p[param2];
        if (null != this.field_x) {
          this.field_z.a(param2, this.field_x, var18, param1 + 108);
          if (1 != this.field_A[param2]) {
            this.field_A[param2] = (byte) 1;
          }
        }
        if (!((qc) (var4)).field_r) {
          ((qc) (var4)).a(true);
        }
        return (qc) (var4);
    }

    final static int a(int param0, int param1, int param2) {
        if (param1 >= -5) {
          field_u = (String) null;
        }
        int var3 = param2 >>> 31;
        return -var3 + (var3 + param2) / param0;
    }

    final static void a(ul param0, int param1, byte[] param2, int[] param3, byte[] param4, int param5, String[] param6, ul param7, ri[] param8, ul param9, int param10, ja[][] param11, boolean param12, String[][] param13, int[] param14, ja[][] param15, String[][] param16) {
        RuntimeException stackIn_6_0 = null;
        StringBuilder stackIn_6_1 = null;
        String stackIn_7_2 = null;
        StringBuilder stackIn_9_1 = null;
        String stackIn_10_2 = null;
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
        StringBuilder stackIn_27_1 = null;
        String stackIn_28_2 = null;
        StringBuilder stackIn_30_1 = null;
        String stackIn_31_2 = null;
        StringBuilder stackIn_33_1 = null;
        String stackIn_34_2 = null;
        StringBuilder stackIn_36_1 = null;
        String stackIn_37_2 = null;
        StringBuilder stackIn_39_1 = null;
        String stackIn_40_2 = null;
        StringBuilder stackIn_42_1 = null;
        String stackIn_43_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var17 = null;
        String var18 = null;
        String[] var19 = null;
        try {
          if (param1 != 0) {
            var18 = (String) null;
            cn.a(true, (String) null, (ul) null, (String) null);
          }
          var19 = (String[]) null;
          e.a(param7, param4, 1, (String[]) null, param14, param5, param11, param6, true, param16, param10, param13, param0, param2, param3, param8, param15, param9, param12);
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var17 = decompiledCaughtException;
          stackIn_6_0 = var17;
          stackIn_6_1 = new StringBuilder().append("cn.L(");
          if (param0 == null) {
            stackIn_7_2 = "null";
          } else {
            stackIn_7_2 = "{...}";
          }
          stackIn_9_1 = ((StringBuilder) (Object) stackIn_6_1).append(stackIn_7_2).append(',').append(param1).append(',');
          if (param2 == null) {
            stackIn_10_2 = "null";
          } else {
            stackIn_10_2 = "{...}";
          }
          stackIn_12_1 = ((StringBuilder) (Object) stackIn_9_1).append(stackIn_10_2).append(',');
          if (param3 == null) {
            stackIn_13_2 = "null";
          } else {
            stackIn_13_2 = "{...}";
          }
          stackIn_15_1 = ((StringBuilder) (Object) stackIn_12_1).append(stackIn_13_2).append(',');
          if (param4 == null) {
            stackIn_16_2 = "null";
          } else {
            stackIn_16_2 = "{...}";
          }
          stackIn_18_1 = ((StringBuilder) (Object) stackIn_15_1).append(stackIn_16_2).append(',').append(param5).append(',');
          if (param6 == null) {
            stackIn_19_2 = "null";
          } else {
            stackIn_19_2 = "{...}";
          }
          stackIn_21_1 = ((StringBuilder) (Object) stackIn_18_1).append(stackIn_19_2).append(',');
          if (param7 == null) {
            stackIn_22_2 = "null";
          } else {
            stackIn_22_2 = "{...}";
          }
          stackIn_24_1 = ((StringBuilder) (Object) stackIn_21_1).append(stackIn_22_2).append(',');
          if (param8 == null) {
            stackIn_25_2 = "null";
          } else {
            stackIn_25_2 = "{...}";
          }
          stackIn_27_1 = ((StringBuilder) (Object) stackIn_24_1).append(stackIn_25_2).append(',');
          if (param9 == null) {
            stackIn_28_2 = "null";
          } else {
            stackIn_28_2 = "{...}";
          }
          stackIn_30_1 = ((StringBuilder) (Object) stackIn_27_1).append(stackIn_28_2).append(',').append(param10).append(',');
          if (param11 == null) {
            stackIn_31_2 = "null";
          } else {
            stackIn_31_2 = "{...}";
          }
          stackIn_33_1 = ((StringBuilder) (Object) stackIn_30_1).append(stackIn_31_2).append(',').append(param12).append(',');
          if (param13 == null) {
            stackIn_34_2 = "null";
          } else {
            stackIn_34_2 = "{...}";
          }
          stackIn_36_1 = ((StringBuilder) (Object) stackIn_33_1).append(stackIn_34_2).append(',');
          if (param14 == null) {
            stackIn_37_2 = "null";
          } else {
            stackIn_37_2 = "{...}";
          }
          stackIn_39_1 = ((StringBuilder) (Object) stackIn_36_1).append(stackIn_37_2).append(',');
          if (param15 == null) {
            stackIn_40_2 = "null";
          } else {
            stackIn_40_2 = "{...}";
          }
          stackIn_42_1 = ((StringBuilder) (Object) stackIn_39_1).append(stackIn_40_2).append(',');
          if (param16 == null) {
            stackIn_43_2 = "null";
          } else {
            stackIn_43_2 = "{...}";
          }
          throw fa.a((Throwable) ((Object) stackIn_6_0), ((StringBuilder) (Object) stackIn_42_1).append(stackIn_43_2).append(')').toString());
        }
    }

    final byte[] a(int param0, int param1) {
        qc var3 = this.b(0, 0, param1);
        if (var3 == null) {
          return null;
        }
        if (param0 != -123) {
          return (byte[]) null;
        }
        byte[] var4 = var3.e(0);
        var3.a(true);
        return var4;
    }

    public static void d(int param0) {
        if (param0 >= -103) {
          cn.a(-126, true, 28, (byte) -117);
        }
        field_C = null;
        field_j = null;
        field_u = null;
    }

    cn(int param0, bq param1, bq param2, qb param3, ai param4, int param5, byte[] param6, int param7, boolean param8) {
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
        this.field_p = new f(16);
        this.field_i = 0;
        this.field_q = new th();
        this.field_r = 0L;
        try {
          this.field_x = param1;
          this.field_B = param0;
          if (null != this.field_x) {
            this.field_y = true;
            this.field_v = new th();
          } else {
            this.field_y = false;
          }
          this.field_t = param2;
          this.field_w = param7;
          this.field_h = param3;
          this.field_z = param4;
          stackIn_7_1 = (param8);
          this.field_n = stackIn_7_1;
          this.field_o = param5;
          this.field_k = param6;
          if (null != this.field_t) {
            this.field_l = (qc) ((Object) this.field_z.a(this.field_B, this.field_t, -3));
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var10 = decompiledCaughtException;
          stackIn_12_0 = var10;
          stackIn_12_1 = new StringBuilder().append("cn.<init>(").append(param0).append(',');
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
          throw fa.a((Throwable) ((Object) stackIn_12_0), ((StringBuilder) (Object) stackIn_24_1).append(stackIn_25_2).append(',').append(param7).append(',').append(param8).append(')').toString());
        }
    }

    static {
        field_C = "New Game";
        field_j = new ao(12, 0, 1, 0);
        field_u = "Get them! GET THEM!";
    }
}
