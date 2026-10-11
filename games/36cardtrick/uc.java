/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class uc extends pe {
    static String field_r;
    private int field_q;
    private int field_k;
    private gj field_m;
    private int field_d;
    private ch field_v;
    private hc field_p;
    private byte[] field_t;
    private la field_u;
    private byte[] field_f;
    private d field_l;
    static String field_o;
    private hc field_h;
    private vb field_n;
    private int field_c;
    private boolean field_s;
    private bk field_e;
    private boolean field_w;
    private bk field_j;
    private long field_i;
    private boolean field_g;

    private final la a(byte param0, int param1, int param2) {
        Object stackIn_15_0 = null;
        Object stackIn_35_0 = null;
        Object stackIn_40_0 = null;
        Object stackIn_77_0 = null;
        Object stackIn_86_0 = null;
        Object stackIn_117_0 = null;
        Object stackIn_127_0 = null;
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
        la var12 = null;
        byte[] var13 = null;
        byte[] var18 = null;
        byte[] var27 = null;
        byte[] var28 = null;
        byte[] var29 = null;
        byte[] var30 = null;
        var10 = Main.field_T;
        try {
          var12 = (la) (this.field_n.a(false, (long)param1));
          var4 = var12;
          if (var12 != null &&
            0 == param2 &&
            !var12.field_o &&
            var12.field_n) {
            var12.c(98);
            var4 = null;
          }
          if (var4 == null) {
            if (param2 != 0) {
              if (1 != param2) {
                if (param2 != 2) {
                  throw new RuntimeException();
                }
                if (null == this.field_p) {
                  throw new RuntimeException();
                }
                if (this.field_t[param1] != -1) {
                  throw new RuntimeException();
                }
                if (this.field_v.c(param0 - 170)) {
                  stackIn_35_0 = null;
                  return (la) (stackIn_35_0);
                }
                var4 = this.field_v.a(false, -1640279264, param1, (byte) 2, this.field_d);
              } else {
                if (null == this.field_p) {
                  throw new RuntimeException();
                }
                var4 = this.field_m.a(param1, -3, this.field_p);
              }
            } else {
              if (this.field_p != null &&
                this.field_t[param1] != -1) {
                var4 = this.field_m.a(param0 ^ 125, this.field_p, param1);
              } else {
                if (this.field_v.a(false)) {
                  stackIn_15_0 = null;
                  return (la) (stackIn_15_0);
                }
                var4 = this.field_v.a(true, -1640279264, param1, (byte) 2, this.field_d);
              }
            }
            this.field_n.a((long)param1, (byte) 69, (qb) (var4));
          }
          if (((la) (var4)).field_n) {
            stackIn_40_0 = null;
            return (la) (stackIn_40_0);
          }
          var18 = ((la) (var4)).b(true);
          var13 = var18;
          var5 = var13;
          if (param0 != 124) {
            this.field_f = (byte[]) null;
          }
          if (var4 instanceof ab) {
            try {
              if (var5 != null &&
                var18.length > 2) {
                fl.field_c.reset();
                fl.field_c.update(var5, 0, -2 + var18.length);
                var6_int = (int)fl.field_c.getValue();
                if (this.field_l.field_i[param1] != var6_int) {
                  throw new RuntimeException();
                }
                if (null != this.field_l.field_l &&
                  this.field_l.field_l[param1] != null) {
                  var28 = this.field_l.field_l[param1];
                  var27 = ti.a(0, var5, var18.length - 2, param0 - 124);
                  for (var9 = 0; var9 < 64; var9++) {
                    if (~var27[var9] != ~var28[var9]) {
                      throw new RuntimeException();
                    }
                  }
                }
                var7 = (var5[-1 + var18.length] & 255) + (65280 & var5[-2 + var18.length] << 8);
                if ((65535 & this.field_l.field_n[param1]) != var7) {
                  throw new RuntimeException();
                }
                if (this.field_t[param1] != 1) {
                  if (this.field_t[param1] == 0) {
                  }
                  this.field_t[param1] = (byte) 1;
                }
                if (!((la) (var4)).field_o) {
                  ((la) (var4)).c(param0 ^ 34);
                }
                stackIn_77_0 = var4;
                return (la) (stackIn_77_0);
              }
              throw new RuntimeException();
            } catch (java.lang.Exception decompiledCaughtParameter1) {
              decompiledCaughtException = decompiledCaughtParameter1;
              var6_ref = (Exception) (Object) decompiledCaughtException;
              this.field_t[param1] = (byte)-1;
              ((la) (var4)).c(param0 ^ 7);
              if (((la) (var4)).field_o &&
                !this.field_v.a(false)) {
                var4 = this.field_v.a(true, -1640279264, param1, (byte) 2, this.field_d);
                this.field_n.a((long)param1, (byte) 79, (qb) (var4));
              }
              stackIn_86_0 = null;
              return (la) (stackIn_86_0);
            }
          }
          try {
            if (var5 != null &&
              var18.length > 2) {
              fl.field_c.reset();
              fl.field_c.update(var5, 0, -2 + var18.length);
              var6_int = (int)fl.field_c.getValue();
              if (this.field_l.field_i[param1] != var6_int) {
                throw new RuntimeException();
              }
              if (this.field_l.field_l != null &&
                this.field_l.field_l[param1] != null) {
                var30 = this.field_l.field_l[param1];
                var29 = ti.a(0, var5, -2 + var18.length, 0);
                var11 = 0;
                var9 = var11;
                while (64 > var11) {
                  if (~var29[var11] != ~var30[var11]) {
                    throw new RuntimeException();
                  }
                  var11++;
                }
              }
              this.field_v.field_b = 0;
              this.field_v.field_l = 0;
            } else {
              throw new RuntimeException();
            }
          } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
            decompiledCaughtException = decompiledCaughtParameter0;
            var6 = (RuntimeException) (Object) decompiledCaughtException;
            this.field_v.c((byte) 0);
            ((la) (var4)).c(82);
            if (((la) (var4)).field_o &&
              !this.field_v.a(false)) {
              var4 = this.field_v.a(true, -1640279264, param1, (byte) 2, this.field_d);
              this.field_n.a((long)param1, (byte) 110, (qb) (var4));
            }
            stackIn_117_0 = null;
            return (la) (stackIn_117_0);
          }
          var5[-2 + var18.length] = (byte)(this.field_l.field_n[param1] >>> 8);
          var5[-1 + var18.length] = (byte)this.field_l.field_n[param1];
          if (null != this.field_p) {
            this.field_m.a(this.field_p, var18, param1, param0 ^ -23043);
            if (this.field_t[param1] != 1) {
              this.field_t[param1] = (byte) 1;
            }
          }
          if (!((la) (var4)).field_o) {
            ((la) (var4)).c(83);
          }
          stackIn_127_0 = var4;
          return (la) (stackIn_127_0);
        } catch (java.lang.RuntimeException decompiledCaughtParameter2) {
          decompiledCaughtException = decompiledCaughtParameter2;
          var4 = (RuntimeException) (Object) decompiledCaughtException;
          throw ma.a((Throwable) (var4), "uc.E(" + param0 + ',' + param1 + ',' + param2 + ')');
        }
    }

    final d b(byte param0) {
        d stackIn_3_0 = null;
        Object stackIn_7_0 = null;
        Object stackIn_11_0 = null;
        Object stackIn_25_0 = null;
        Object stackIn_36_0 = null;
        d stackIn_41_0 = null;
        d stackIn_47_0 = null;
        RuntimeException decompiledCaughtException = null;
        byte[] var2 = null;
        RuntimeException var2_ref = null;
        RuntimeException var3 = null;
        int var4 = 0;
        byte[] var5 = null;
        byte[] var6 = null;
        byte[] var7 = null;
        var4 = Main.field_T;
        try {
          if (this.field_l != null) {
            stackIn_3_0 = this.field_l;
            return stackIn_3_0;
          }
          if (this.field_u == null) {
            if (this.field_v.a(false)) {
              stackIn_7_0 = null;
              return (d) (stackIn_7_0);
            }
            this.field_u = (la) ((Object) this.field_v.a(true, -1640279264, this.field_d, (byte) 0, 255));
          }
          if (this.field_u.field_n) {
            stackIn_11_0 = null;
            return (d) (stackIn_11_0);
          }
          var7 = this.field_u.b(true);
          var6 = var7;
          var5 = var6;
          var2 = var5;
          if (!(this.field_u instanceof ab)) {
            try {
              if (var5 == null) {
                throw new RuntimeException();
              }
              this.field_l = new d(var7, this.field_k, this.field_f);
            } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
              decompiledCaughtException = decompiledCaughtParameter0;
              var3 = decompiledCaughtException;
              this.field_v.c((byte) 0);
              this.field_l = null;
              if (this.field_v.a(false)) {
                this.field_u = null;
              } else {
                this.field_u = (la) ((Object) this.field_v.a(true, -1640279264, this.field_d, (byte) 0, 255));
              }
              stackIn_36_0 = null;
              return (d) (stackIn_36_0);
            }
            if (null != this.field_h) {
              this.field_m.a(this.field_h, var7, this.field_d, -23167);
            }
          } else {
            try {
              if (var5 == null) {
                throw new RuntimeException();
              }
              this.field_l = new d(var7, this.field_k, this.field_f);
              if (this.field_l.field_k != this.field_q) {
                throw new RuntimeException();
              }
            } catch (java.lang.RuntimeException decompiledCaughtParameter1) {
              decompiledCaughtException = decompiledCaughtParameter1;
              var3 = decompiledCaughtException;
              this.field_l = null;
              if (this.field_v.a(false)) {
                this.field_u = null;
              } else {
                this.field_u = (la) ((Object) this.field_v.a(true, -1640279264, this.field_d, (byte) 0, 255));
              }
              stackIn_25_0 = null;
              return (d) (stackIn_25_0);
            }
          }
          if (param0 > -35) {
            stackIn_41_0 = (d) null;
            return stackIn_41_0;
          }
          this.field_u = null;
          if (this.field_p != null) {
            this.field_t = new byte[this.field_l.field_b];
          }
          stackIn_47_0 = this.field_l;
          return stackIn_47_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter2) {
          decompiledCaughtException = decompiledCaughtParameter2;
          var2_ref = decompiledCaughtException;
          throw ma.a((Throwable) ((Object) var2_ref), "uc.D(" + param0 + ')');
        }
    }

    final void c(byte param0) {
        la discarded$0 = null;
        la discarded$1 = null;
        RuntimeException decompiledCaughtException = null;
        qb var2 = null;
        RuntimeException var2_ref = null;
        int var3 = 0;
        int var4 = 0;
        var4 = Main.field_T;
        try {
          if (param0 < 89) {
            this.c((byte) -55);
          }
          if (null == this.field_j) {
            return;
          }
          if (this.b((byte) -71) == null) {
            return;
          }
          var2 = this.field_e.a((byte) 74);
          while (var2 != null) {
            var3 = (int)var2.field_e;
            if (var3 >= 0) {
              if (var3 < this.field_l.field_b) {
                if (this.field_l.field_q[var3] == 0) {
                  var2.c(109);
                } else {
                  if (0 == this.field_t[var3]) {
                    discarded$0 = this.a((byte) 124, var3, 1);
                  }
                  if (this.field_t[var3] == -1) {
                    discarded$1 = this.a((byte) 124, var3, 2);
                  }
                  if (this.field_t[var3] == 1) {
                    var2.c(85);
                  }
                }
              } else {
                var2.c(109);
              }
            } else {
              var2.c(109);
            }
            var2 = this.field_e.b((byte) -99);
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2_ref = decompiledCaughtException;
          throw ma.a((Throwable) ((Object) var2_ref), "uc.G(" + param0 + ')');
        }
    }

    final void c(int param0) {
        la discarded$1 = null;
        la discarded$0 = null;
        la discarded$3 = null;
        la discarded$2 = null;
        RuntimeException decompiledCaughtException = null;
        Object var2 = null;
        int var2_int = 0;
        la var2_ref = null;
        RuntimeException var2_ref2 = null;
        qb var3 = null;
        int var4 = 0;
        int var5 = 0;
        qb var6 = null;
        qb var7 = null;
        qb var3Lifetime1;
        int var2_intLifetime1;
        int var4Lifetime1;
        var2 = null;
        var5 = Main.field_T;
        try {
          boolean decompiledFrameRemainder0 = true;
          if (null != this.field_j) {
            if (this.b((byte) -56) == null) {
              return;
            }
            if (this.field_s) {
              var2_int = 1;
              var3 = this.field_j.a((byte) 74);
              while (var3 != null) {
                var4 = (int)var3.field_e;
                if (this.field_t[var4] == 0) {
                  discarded$1 = this.a((byte) 124, var4, 1);
                }
                if (this.field_t[var4] == 0) {
                  var2_int = 0;
                } else {
                  var3.c(98);
                }
                var3 = this.field_j.b((byte) -101);
              }
              while (this.field_l.field_q.length > this.field_c) {
                if (this.field_l.field_q[this.field_c] == 0) {
                  this.field_c = this.field_c + 1;
                  continue;
                }
                if (this.field_m.field_b < 250) {
                  if (0 == this.field_t[this.field_c]) {
                    discarded$0 = this.a((byte) 124, this.field_c, 1);
                  }
                  if (this.field_t[this.field_c] == 0) {
                    var7 = new qb();
                    var7.field_e = (long)this.field_c;
                    var2_int = 0;
                    this.field_j.a(var7, param0 + 30390);
                  }
                  this.field_c = this.field_c + 1;
                  continue;
                }
                var2_int = 0;
                break;
              }
              if ((var2_int != 0)) {
                this.field_s = false;
                this.field_c = 0;
              }
              decompiledFrameRemainder0 = false;
            }
            else {
              if (this.field_w) {
                var2_intLifetime1 = 1;
                var3Lifetime1 = this.field_j.a((byte) 74);
                while (var3Lifetime1 != null) {
                  var4Lifetime1 = (int)var3Lifetime1.field_e;
                  if (1 != this.field_t[var4Lifetime1]) {
                    discarded$3 = this.a((byte) 124, var4Lifetime1, 2);
                  }
                  if (this.field_t[var4Lifetime1] != 1) {
                    var2_intLifetime1 = 0;
                  } else {
                    var3Lifetime1.c(124);
                  }
                  var3Lifetime1 = this.field_j.b((byte) -104);
                }
                while (this.field_l.field_q.length > this.field_c) {
                  if (this.field_l.field_q[this.field_c] == 0) {
                    this.field_c = this.field_c + 1;
                    continue;
                  }
                  if (!this.field_v.c(param0 + 3129)) {
                    if (this.field_t[this.field_c] != 1) {
                      discarded$2 = this.a((byte) 124, this.field_c, 2);
                    }
                    if (this.field_t[this.field_c] != 1) {
                      var6 = new qb();
                      var6.field_e = (long)this.field_c;
                      this.field_j.a(var6, 27362);
                      var2_intLifetime1 = 0;
                    }
                    this.field_c = this.field_c + 1;
                    continue;
                  }
                  var2_intLifetime1 = 0;
                  break;
                }
                if ((var2_intLifetime1 != 0)) {
                  this.field_c = 0;
                  this.field_w = false;
                }
                decompiledFrameRemainder0 = false;
              }
              else {
                this.field_j = null;
              }
            }
          }
          if (this.field_g &&
            id.a(36) >= this.field_i) {
            var2_ref = (la) (this.field_n.b(-119));
            while (var2_ref != null) {
              if (!var2_ref.field_n) {
                if (var2_ref.field_l) {
                  if (!var2_ref.field_o) {
                    throw new RuntimeException();
                  }
                  var2_ref.c(86);
                } else {
                  var2_ref.field_l = true;
                }
              }
              var2_ref = (la) (this.field_n.a(true));
            }
            this.field_i = 1000L + id.a(109);
          }
          if (param0 != -3028) {
            this.field_v = (ch) null;
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2_ref2 = decompiledCaughtException;
          throw ma.a((Throwable) ((Object) var2_ref2), "uc.F(" + param0 + ')');
        }
    }

    final static void a(pb param0, java.math.BigInteger param1, int param2, byte param3, int param4, java.math.BigInteger param5, byte[] param6) {
        RuntimeException stackIn_28_0 = null;
        StringBuilder stackIn_28_1 = null;
        String stackIn_29_2 = null;
        RuntimeException stackIn_32_0 = null;
        StringBuilder stackIn_32_1 = null;
        RuntimeException stackIn_33_0 = null;
        String stackIn_33_2 = null;
        RuntimeException stackIn_36_0 = null;
        StringBuilder stackIn_36_1 = null;
        RuntimeException stackIn_37_0 = null;
        String stackIn_37_2 = null;
        RuntimeException stackIn_40_0 = null;
        StringBuilder stackIn_40_1 = null;
        RuntimeException stackIn_41_0 = null;
        String stackIn_41_2 = null;
        RuntimeException decompiledCaughtException = null;
        int var7_int = 0;
        RuntimeException var7 = null;
        int[] var8 = null;
        int var9 = 0;
        int var10 = 0;
        int var11 = 0;
        int[] var12 = null;
        int[] var13 = null;
        int var9Lifetime1;
        var10 = Main.field_T;
        try {
          var7_int = qa.a(param2, 8);
          if (null == bl.field_a) {
            bl.field_a = new java.security.SecureRandom();
          }
          var13 = new int[4];
          var12 = var13;
          var8 = var12;
          for (var9 = 0; var9 < 4; var9++) {
            var8[var9] = bl.field_a.nextInt();
          }
          if (vc.field_b == null ||
            !(vc.field_b.field_g.length >= var7_int)) {
            vc.field_b = new pb(var7_int);
          }
          vc.field_b.field_i = 0;
          vc.field_b.a(param2, param4, param6, (byte) -121);
          vc.field_b.c(1442653008, var7_int);
          vc.field_b.a(var13, 8);
          if (null == oj.field_a ||
            !(oj.field_a.field_g.length >= 100)) {
            oj.field_a = new pb(100);
          }
          if (param3 != 0) {
            uc.b(57);
          }
          oj.field_a.field_i = 0;
          oj.field_a.b(-9469, 10);
          var11 = 0;
          var9Lifetime1 = var11;
          while (var11 < 4) {
            oj.field_a.a(-246, var13[var11]);
            var11++;
          }
          oj.field_a.e(param2, 26040);
          oj.field_a.a(param1, param5, -15792);
          param0.a(oj.field_a.field_i, 0, oj.field_a.field_g, (byte) -84);
          param0.a(vc.field_b.field_i, 0, vc.field_b.field_g, (byte) -113);
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var7 = decompiledCaughtException;
          stackIn_28_0 = var7;
          stackIn_28_1 = new StringBuilder().append("uc.H(");
          if (param0 == null) {
            stackIn_29_2 = "null";
          } else {
            stackIn_29_2 = "{...}";
          }
          stackIn_32_0 = stackIn_28_0;
          stackIn_32_1 = ((StringBuilder) (Object) stackIn_28_1).append(stackIn_29_2).append(',');
          if (param1 == null) {
            stackIn_33_0 = stackIn_32_0;
            stackIn_33_2 = "null";
          } else {
            stackIn_33_0 = stackIn_28_0;
            stackIn_33_2 = "{...}";
          }
          stackIn_36_0 = stackIn_33_0;
          stackIn_36_1 = ((StringBuilder) (Object) stackIn_32_1).append(stackIn_33_2).append(',').append(param2).append(',').append(param3).append(',').append(param4).append(',');
          if (param5 == null) {
            stackIn_37_0 = stackIn_36_0;
            stackIn_37_2 = "null";
          } else {
            stackIn_37_0 = stackIn_33_0;
            stackIn_37_2 = "{...}";
          }
          stackIn_40_0 = stackIn_37_0;
          stackIn_40_1 = ((StringBuilder) (Object) stackIn_36_1).append(stackIn_37_2).append(',');
          if (param6 == null) {
            stackIn_41_0 = stackIn_40_0;
            stackIn_41_2 = "null";
          } else {
            stackIn_41_0 = stackIn_37_0;
            stackIn_41_2 = "{...}";
          }
          throw ma.a((Throwable) ((Object) stackIn_41_0), ((StringBuilder) (Object) stackIn_40_1).append(stackIn_41_2).append(')').toString());
        }
    }

    public static void b(int param0) {
        try {
          field_r = null;
          field_o = null;
          if (param0 != 0) {
            uc.a((pb) null, (java.math.BigInteger) null, 16, (byte) 108, 83, (java.math.BigInteger) null, (byte[]) null);
          }
        } catch (RuntimeException runtimeException) {
          throw ma.a((Throwable) ((Object) runtimeException), "uc.I(" + param0 + ')');
        }
    }

    final int a(int param0, int param1) {
        la var3 = null;
        int stackIn_4_0 = 0;
        int stackIn_6_0 = 0;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var3_ref = null;
        int var4 = 0;
        try {
          var3 = (la) (this.field_n.a(false, (long)param0));
          if (var3 != null) {
            stackIn_4_0 = var3.a(false);
            return stackIn_4_0;
          }
          var4 = 10 / ((-27 - param1) / 58);
          stackIn_6_0 = 0;
          return stackIn_6_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3_ref = decompiledCaughtException;
          throw ma.a((Throwable) ((Object) var3_ref), "uc.B(" + param0 + ',' + param1 + ')');
        }
    }

    final void a(int param0) {
        RuntimeException decompiledCaughtException = null;
        RuntimeException var2 = null;
        try {
          if (this.field_p == null) {
            return;
          }
          this.field_w = true;
          if (null == this.field_j) {
            this.field_j = new bk();
          }
          if (param0 != -25350) {
            this.field_m = (gj) null;
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2 = decompiledCaughtException;
          throw ma.a((Throwable) ((Object) var2), "uc.J(" + param0 + ')');
        }
    }

    final byte[] a(int param0, boolean param1) {
        la var3 = null;
        RuntimeException var3_ref = null;
        byte[] var4 = null;
        Object stackIn_2_0 = null;
        byte[] stackIn_4_0 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          var3 = this.a((byte) 124, param0, 0);
          if (var3 == null) {
            stackIn_2_0 = null;
            return (byte[]) (stackIn_2_0);
          }
          var4 = var3.b(param1);
          var3.c(109);
          stackIn_4_0 = var4;
          return stackIn_4_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3_ref = decompiledCaughtException;
          throw ma.a((Throwable) ((Object) var3_ref), "uc.C(" + param0 + ',' + param1 + ')');
        }
    }

    uc(int param0, hc param1, hc param2, ch param3, gj param4, int param5, byte[] param6, int param7, boolean param8) {
        boolean stackIn_7_1 = false;
        RuntimeException stackIn_13_0 = null;
        StringBuilder stackIn_13_1 = null;
        String stackIn_14_2 = null;
        RuntimeException stackIn_17_0 = null;
        StringBuilder stackIn_17_1 = null;
        RuntimeException stackIn_18_0 = null;
        String stackIn_18_2 = null;
        RuntimeException stackIn_21_0 = null;
        StringBuilder stackIn_21_1 = null;
        RuntimeException stackIn_22_0 = null;
        String stackIn_22_2 = null;
        RuntimeException stackIn_25_0 = null;
        StringBuilder stackIn_25_1 = null;
        RuntimeException stackIn_26_0 = null;
        String stackIn_26_2 = null;
        RuntimeException stackIn_29_0 = null;
        StringBuilder stackIn_29_1 = null;
        RuntimeException stackIn_30_0 = null;
        String stackIn_30_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var10 = null;
        this.field_n = new vb(16);
        this.field_c = 0;
        this.field_e = new bk();
        this.field_i = 0L;
        try {
          this.field_d = param0;
          this.field_p = param1;
          if (this.field_p == null) {
            this.field_s = false;
          } else {
            this.field_s = true;
            this.field_j = new bk();
          }
          this.field_m = param4;
          this.field_k = param5;
          this.field_f = param6;
          this.field_h = param2;
          stackIn_7_1 = (param8);
          this.field_g = stackIn_7_1;
          this.field_q = param7;
          this.field_v = param3;
          if (this.field_h != null) {
            this.field_u = (la) ((Object) this.field_m.a(1, this.field_h, this.field_d));
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var10 = decompiledCaughtException;
          stackIn_13_0 = var10;
          stackIn_13_1 = new StringBuilder().append("uc.<init>(").append(param0).append(',');
          if (param1 == null) {
            stackIn_14_2 = "null";
          } else {
            stackIn_14_2 = "{...}";
          }
          stackIn_17_0 = stackIn_13_0;
          stackIn_17_1 = ((StringBuilder) (Object) stackIn_13_1).append(stackIn_14_2).append(',');
          if (param2 == null) {
            stackIn_18_0 = stackIn_17_0;
            stackIn_18_2 = "null";
          } else {
            stackIn_18_0 = stackIn_13_0;
            stackIn_18_2 = "{...}";
          }
          stackIn_21_0 = stackIn_18_0;
          stackIn_21_1 = ((StringBuilder) (Object) stackIn_17_1).append(stackIn_18_2).append(',');
          if (param3 == null) {
            stackIn_22_0 = stackIn_21_0;
            stackIn_22_2 = "null";
          } else {
            stackIn_22_0 = stackIn_18_0;
            stackIn_22_2 = "{...}";
          }
          stackIn_25_0 = stackIn_22_0;
          stackIn_25_1 = ((StringBuilder) (Object) stackIn_21_1).append(stackIn_22_2).append(',');
          if (param4 == null) {
            stackIn_26_0 = stackIn_25_0;
            stackIn_26_2 = "null";
          } else {
            stackIn_26_0 = stackIn_22_0;
            stackIn_26_2 = "{...}";
          }
          stackIn_29_0 = stackIn_26_0;
          stackIn_29_1 = ((StringBuilder) (Object) stackIn_25_1).append(stackIn_26_2).append(',').append(param5).append(',');
          if (param6 == null) {
            stackIn_30_0 = stackIn_29_0;
            stackIn_30_2 = "null";
          } else {
            stackIn_30_0 = stackIn_26_0;
            stackIn_30_2 = "{...}";
          }
          throw ma.a((Throwable) ((Object) stackIn_30_0), ((StringBuilder) (Object) stackIn_29_1).append(stackIn_30_2).append(',').append(param7).append(',').append(param8).append(')').toString());
        }
    }

    static {
        field_r = "Back";
        field_o = "TIME";
    }
}
