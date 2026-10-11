/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class wm extends ow {
    private qh field_q;
    static ut[] field_m;
    static int field_E;
    private int field_D;
    private kc field_v;
    private bi field_l;
    static String field_p;
    private int field_h;
    static ae field_u;
    private byte[] field_x;
    private eb field_w;
    private byte[] field_r;
    static int field_s;
    static double field_C;
    private qh field_k;
    private vv field_B;
    private int field_j;
    static String[] field_o;
    private kl field_z;
    private tf field_t;
    private boolean field_g;
    private boolean field_n;
    private int field_i;
    private tf field_F;
    private long field_y;
    private boolean field_A;

    final int a(int param0, int param1) {
        vv var3 = null;
        RuntimeException var3_ref = null;
        int stackIn_2_0 = 0;
        int stackIn_7_0 = 0;
        RuntimeException decompiledCaughtException = null;
        try {
          var3 = (vv) (this.field_v.a(true, (long)param1));
          if (var3 != null) {
            stackIn_2_0 = var3.a(0);
            return stackIn_2_0;
          }
          if (param0 == 6999) {
            stackIn_7_0 = 0;
            return stackIn_7_0;
          }
          this.b(-39, 41);
          return 0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3_ref = decompiledCaughtException;
          throw nb.a((Throwable) ((Object) var3_ref), "wm.E(" + param0 + ',' + param1 + ')');
        }
    }

    final void d(int param0) {
        vv discarded$0 = null;
        vv discarded$1 = null;
        RuntimeException decompiledCaughtException = null;
        gn var2 = null;
        RuntimeException var2_ref = null;
        int var3 = 0;
        int var4 = 0;
        var4 = Kickabout.field_G;
        try {
          if (param0 != 18137) {
            return;
          }
          if (null == this.field_t) {
            return;
          }
          if (this.a(param0 - 42991) == null) {
            return;
          }
          var2 = this.field_F.g(24009);
          while (var2 != null) {
            var3 = (int)var2.field_a;
            if (var3 >= 0) {
              if (this.field_z.field_d > var3) {
                if (this.field_z.field_i[var3] != 0) {
                  if (this.field_r[var3] == 0) {
                    discarded$0 = this.a(1, var3, (byte) -30);
                  }
                  if (-1 == this.field_r[var3]) {
                    discarded$1 = this.a(2, var3, (byte) -30);
                  }
                  if (this.field_r[var3] == 1) {
                    var2.c((byte) -109);
                  }
                } else {
                  var2.c((byte) -109);
                }
              } else {
                var2.c((byte) -109);
              }
            } else {
              var2.c((byte) -109);
            }
            var2 = this.field_F.c(33);
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2_ref = decompiledCaughtException;
          throw nb.a((Throwable) ((Object) var2_ref), "wm.F(" + param0 + ')');
        }
    }

    final static boolean c(byte param0) {
        int var1_int = 0;
        RuntimeException var1 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          if (!vg.field_Wb) {
            return false;
          }
          var1_int = -4 / ((-84 - param0) / 34);
          if (0 == ov.field_b) {
            return true;
          }
          return false;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var1 = decompiledCaughtException;
          throw nb.a((Throwable) ((Object) var1), "wm.L(" + param0 + ')');
        }
    }

    final static void c(int param0) {
        try {
          if (param0 != 1) {
            field_u = (ae) null;
          }
        } catch (RuntimeException runtimeException) {
          throw nb.a((Throwable) ((Object) runtimeException), "wm.J(" + param0 + ')');
        }
    }

    final void b(byte param0) {
        RuntimeException decompiledCaughtException = null;
        RuntimeException var2 = null;
        try {
          if (this.field_k == null) {
            return;
          }
          this.field_g = true;
          if (this.field_t == null) {
            this.field_t = new tf();
          }
          if (param0 < 28) {
            this.field_n = true;
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2 = decompiledCaughtException;
          throw nb.a((Throwable) ((Object) var2), "wm.G(" + param0 + ')');
        }
    }

    final kl a(int param0) {
        kl stackIn_5_0 = null;
        Object stackIn_11_0 = null;
        Object stackIn_15_0 = null;
        Object stackIn_27_0 = null;
        Object stackIn_44_0 = null;
        kl stackIn_52_0 = null;
        RuntimeException decompiledCaughtException = null;
        byte[] var2 = null;
        RuntimeException var2_ref = null;
        RuntimeException var3 = null;
        int var4 = 0;
        byte[] var5 = null;
        byte[] var6 = null;
        byte[] var7 = null;
        var4 = Kickabout.field_G;
        try {
          if (this.field_z != null) {
            stackIn_5_0 = this.field_z;
            return stackIn_5_0;
          }
          if (null == this.field_B) {
            if (this.field_l.a(25533)) {
              stackIn_11_0 = null;
              return (kl) (stackIn_11_0);
            }
            this.field_B = (vv) ((Object) this.field_l.a(255, this.field_h, (byte) 0, (byte) 89, true));
          }
          if (this.field_B.field_p) {
            stackIn_15_0 = null;
            return (kl) (stackIn_15_0);
          }
          var7 = this.field_B.b(12802);
          var6 = var7;
          var5 = var6;
          var2 = var5;
          if (this.field_B instanceof hi) {
            try {
              if (var5 == null) {
                throw new RuntimeException();
              }
              this.field_z = new kl(var7, this.field_D, this.field_x);
              if (this.field_z.field_p != this.field_j) {
                throw new RuntimeException();
              }
            } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
              decompiledCaughtException = decompiledCaughtParameter0;
              var3 = decompiledCaughtException;
              this.field_z = null;
              if (this.field_l.a(param0 + 50387)) {
                this.field_B = null;
              } else {
                this.field_B = (vv) ((Object) this.field_l.a(255, this.field_h, (byte) 0, (byte) 89, true));
              }
              stackIn_44_0 = null;
              return (kl) (stackIn_44_0);
            }
          } else {
            try {
              if (var5 == null) {
                throw new RuntimeException();
              }
              this.field_z = new kl(var7, this.field_D, this.field_x);
            } catch (java.lang.RuntimeException decompiledCaughtParameter1) {
              decompiledCaughtException = decompiledCaughtParameter1;
              var3 = decompiledCaughtException;
              this.field_l.c(-65);
              this.field_z = null;
              if (!this.field_l.a(param0 + 50387)) {
                this.field_B = (vv) ((Object) this.field_l.a(255, this.field_h, (byte) 0, (byte) 89, true));
              } else {
                this.field_B = null;
              }
              stackIn_27_0 = null;
              return (kl) (stackIn_27_0);
            }
            if (this.field_q != null) {
              this.field_w.a(this.field_h, this.field_q, var7, (byte) 11);
            }
          }
          if (param0 != -24854) {
            this.b(113);
          }
          if (null != this.field_k) {
            this.field_r = new byte[this.field_z.field_d];
          }
          this.field_B = null;
          stackIn_52_0 = this.field_z;
          return stackIn_52_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter2) {
          decompiledCaughtException = decompiledCaughtParameter2;
          var2_ref = decompiledCaughtException;
          throw nb.a((Throwable) ((Object) var2_ref), "wm.B(" + param0 + ')');
        }
    }

    final void b(int param0) {
        vv discarded$3 = null;
        vv discarded$2 = null;
        vv discarded$1 = null;
        vv discarded$0 = null;
        RuntimeException decompiledCaughtException = null;
        int var2_int = 0;
        RuntimeException var2 = null;
        gn var3 = null;
        vv var3_ref = null;
        int var4 = 0;
        int var5 = 0;
        gn var6 = null;
        gn var7 = null;
        gn var3Lifetime1;
        vv var3_refLifetime1;
        int var2_intLifetime1;
        int var4Lifetime1;
        int var2_intLifetime2;
        var5 = Kickabout.field_G;
        try {
          boolean decompiledFrameRemainder0 = true;
          boolean decompiledFrameRemainder1 = true;
          if (this.field_t != null) {
            if (null == this.a(-24854)) {
              return;
            }
            if (this.field_n) {
              var2_int = 1;
              var3 = this.field_t.g(24009);
              while (var3 != null) {
                var4 = (int)var3.field_a;
                if (this.field_r[var4] == 0) {
                  discarded$3 = this.a(1, var4, (byte) -30);
                }
                if (this.field_r[var4] == 0) {
                  var2_int = 0;
                } else {
                  var3.c((byte) -109);
                }
                var3 = this.field_t.c(33);
              }
              while (this.field_z.field_i.length > this.field_i) {
                if (this.field_z.field_i[this.field_i] == 0) {
                  this.field_i = this.field_i + 1;
                  continue;
                }
                if (this.field_w.field_e < 250) {
                  if (0 == this.field_r[this.field_i]) {
                    discarded$2 = this.a(1, this.field_i, (byte) -30);
                  }
                  if (0 == this.field_r[this.field_i]) {
                    var6 = new gn();
                    var6.field_a = (long)this.field_i;
                    var2_int = 0;
                    this.field_t.a(var6, 3);
                  }
                  this.field_i = this.field_i + 1;
                  continue;
                }
                var2_int = 0;
                break;
              }
              if ((var2_int != 0)) {
                this.field_i = 0;
                this.field_n = false;
              }
              decompiledFrameRemainder1 = false;
            }
            else {
              if (this.field_g) {
                var2_intLifetime2 = 1;
                var3Lifetime1 = this.field_t.g(24009);
                while (var3Lifetime1 != null) {
                  var4Lifetime1 = (int)var3Lifetime1.field_a;
                  if (this.field_r[var4Lifetime1] != 1) {
                    discarded$1 = this.a(2, var4Lifetime1, (byte) -30);
                  }
                  if (1 != this.field_r[var4Lifetime1]) {
                    var2_intLifetime2 = 0;
                  } else {
                    var3Lifetime1.c((byte) -109);
                  }
                  var3Lifetime1 = this.field_t.c(33);
                }
                while (this.field_i < this.field_z.field_i.length) {
                  if (this.field_z.field_i[this.field_i] == 0) {
                    this.field_i = this.field_i + 1;
                    continue;
                  }
                  if (!this.field_l.d(10770)) {
                    if (this.field_r[this.field_i] != 1) {
                      discarded$0 = this.a(2, this.field_i, (byte) -30);
                    }
                    if (this.field_r[this.field_i] != 1) {
                      var7 = new gn();
                      var7.field_a = (long)this.field_i;
                      var2_intLifetime2 = 0;
                      this.field_t.a(var7, 3);
                    }
                    this.field_i = this.field_i + 1;
                    continue;
                  }
                  var2_intLifetime2 = 0;
                  break;
                }
                if (var2_intLifetime2 != 0) {
                  this.field_g = false;
                  this.field_i = 0;
                  decompiledFrameRemainder1 = false;
                }
                else {
                  var2_intLifetime2 = 15 % ((-84 - param0) / 37);
                  if (!this.field_A) {
                    return;
                  }
                  if (nj.a(-58) < this.field_y) {
                    return;
                  }
                  var3_ref = (vv) (this.field_v.b(0));
                  while (var3_ref != null) {
                    if (!var3_ref.field_p) {
                      if (!var3_ref.field_n) {
                        var3_ref.field_n = true;
                      } else {
                        if (!var3_ref.field_q) {
                          throw new RuntimeException();
                        }
                        var3_ref.c((byte) -109);
                      }
                    }
                    var3_ref = (vv) (this.field_v.a(-1));
                  }
                  decompiledFrameRemainder0 = false;
                }
              }
              if ((decompiledFrameRemainder1) &&
                (decompiledFrameRemainder0)) {
                this.field_t = null;
              }
            }
          }
          if (decompiledFrameRemainder0) {
            var2_intLifetime1 = 15 % ((-84 - param0) / 37);
            if (!this.field_A) {
              return;
            }
            if (nj.a(-58) < this.field_y) {
              return;
            }
            var3_refLifetime1 = (vv) (this.field_v.b(0));
            while (var3_refLifetime1 != null) {
              if (!var3_refLifetime1.field_p) {
                if (!var3_refLifetime1.field_n) {
                  var3_refLifetime1.field_n = true;
                } else {
                  if (!var3_refLifetime1.field_q) {
                    throw new RuntimeException();
                  }
                  var3_refLifetime1.c((byte) -109);
                }
              }
              var3_refLifetime1 = (vv) (this.field_v.a(-1));
            }
          }
          this.field_y = 1000L + nj.a(116);
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2 = decompiledCaughtException;
          throw nb.a((Throwable) ((Object) var2), "wm.I(" + param0 + ')');
        }
    }

    public static void a(byte param0) {
        field_p = null;
        if (param0 > -114) {
          return;
        }
        try {
          field_m = null;
          field_u = null;
          field_o = null;
        } catch (RuntimeException runtimeException) {
          throw nb.a((Throwable) ((Object) runtimeException), "wm.M(" + param0 + ')');
        }
    }

    private final vv a(int param0, int param1, byte param2) {
        Object stackIn_34_0 = null;
        Object stackIn_40_0 = null;
        vv stackIn_43_0 = null;
        Object stackIn_73_0 = null;
        Object stackIn_81_0 = null;
        Object stackIn_107_0 = null;
        Object stackIn_117_0 = null;
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
        vv var12 = null;
        byte[] var13 = null;
        byte[] var18 = null;
        byte[] var27 = null;
        byte[] var28 = null;
        byte[] var29 = null;
        byte[] var30 = null;
        var10 = Kickabout.field_G;
        try {
          var12 = (vv) (this.field_v.a(true, (long)param1));
          var4 = var12;
          if (var12 != null &&
            param0 == 0 &&
            !var12.field_q &&
            var12.field_p) {
            var12.c((byte) -109);
            var4 = null;
          }
          if (var4 == null) {
            if (param0 == 0) {
              if (null != this.field_k &&
                -1 != this.field_r[param1]) {
                var4 = this.field_w.a(-913, this.field_k, param1);
              } else {
                if (this.field_l.a(25533)) {
                  stackIn_34_0 = null;
                  return (vv) (stackIn_34_0);
                }
                var4 = this.field_l.a(this.field_h, param1, (byte) 2, (byte) 89, true);
              }
            } else {
              if (param0 == 1) {
                if (null == this.field_k) {
                  throw new RuntimeException();
                }
                var4 = this.field_w.a(param2 + 8977, param1, this.field_k);
              } else {
                if (param0 != 2) {
                  throw new RuntimeException();
                }
                if (this.field_k == null) {
                  throw new RuntimeException();
                }
                if (this.field_r[param1] != -1) {
                  throw new RuntimeException();
                }
                if (this.field_l.d(10770)) {
                  return null;
                }
                var4 = this.field_l.a(this.field_h, param1, (byte) 2, (byte) 89, false);
              }
            }
            this.field_v.a((gn) (var4), -73, (long)param1);
          }
          if (((vv) (var4)).field_p) {
            stackIn_40_0 = null;
            return (vv) (stackIn_40_0);
          }
          if (param2 != -30) {
            stackIn_43_0 = (vv) null;
            return stackIn_43_0;
          }
          var18 = ((vv) (var4)).b(12802);
          var13 = var18;
          var5 = var13;
          if (var4 instanceof hi) {
            try {
              if (var5 != null &&
                var18.length > 2) {
                dg.field_b.reset();
                dg.field_b.update(var5, 0, -2 + var18.length);
                var6_int = (int)dg.field_b.getValue();
                if (this.field_z.field_c[param1] != var6_int) {
                  throw new RuntimeException();
                }
                if (null != this.field_z.field_k &&
                  this.field_z.field_k[param1] != null) {
                  var28 = this.field_z.field_k[param1];
                  var27 = jj.a(var18.length - 2, var18, (byte) 69, 0);
                  for (var9 = 0; var9 < 64; var9++) {
                    if (var27[var9] != var28[var9]) {
                      throw new RuntimeException();
                    }
                  }
                }
                var7 = (var5[var18.length - 1] & 255) + ((var5[var18.length - 2] & 255) << 8);
                if (var7 != (this.field_z.field_f[param1] & 65535)) {
                  throw new RuntimeException();
                }
                if (this.field_r[param1] != 1) {
                  if (this.field_r[param1] == 0) {
                  }
                  this.field_r[param1] = (byte) 1;
                }
                if (!((vv) (var4)).field_q) {
                  ((vv) (var4)).c((byte) -109);
                }
                stackIn_73_0 = var4;
                return (vv) (stackIn_73_0);
              }
              throw new RuntimeException();
            } catch (java.lang.Exception decompiledCaughtParameter1) {
              decompiledCaughtException = decompiledCaughtParameter1;
              var6_ref = (Exception) (Object) decompiledCaughtException;
              this.field_r[param1] = (byte)-1;
              ((vv) (var4)).c((byte) -109);
              if (((vv) (var4)).field_q) {
                if (this.field_l.a(25533)) {
                  return null;
                }
                var4 = this.field_l.a(this.field_h, param1, (byte) 2, (byte) 89, true);
                this.field_v.a((gn) (var4), -50, (long)param1);
              }
              stackIn_81_0 = null;
              return (vv) (stackIn_81_0);
            }
          }
          try {
            if (var5 != null &&
              var18.length > 2) {
              dg.field_b.reset();
              dg.field_b.update(var5, 0, var18.length - 2);
              var6_int = (int)dg.field_b.getValue();
              if (var6_int != this.field_z.field_c[param1]) {
                throw new RuntimeException();
              }
              if (null != this.field_z.field_k &&
                null != this.field_z.field_k[param1]) {
                var29 = this.field_z.field_k[param1];
                var30 = jj.a(-2 + var18.length, var18, (byte) 80, 0);
                var11 = 0;
                var9 = var11;
                while (var11 < 64) {
                  if (~var29[var11] != ~var30[var11]) {
                    throw new RuntimeException();
                  }
                  var11++;
                }
              }
              this.field_l.field_o = 0;
              this.field_l.field_l = 0;
            } else {
              throw new RuntimeException();
            }
          } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
            decompiledCaughtException = decompiledCaughtParameter0;
            var6 = (RuntimeException) (Object) decompiledCaughtException;
            this.field_l.c(5);
            ((vv) (var4)).c((byte) -109);
            if (!((vv) (var4)).field_q) {
              return null;
            }
            if (this.field_l.a(25533)) {
              return null;
            }
            var4 = this.field_l.a(this.field_h, param1, (byte) 2, (byte) 89, true);
            this.field_v.a((gn) (var4), param2 + 128, (long)param1);
            stackIn_107_0 = null;
            return (vv) (stackIn_107_0);
          }
          var5[-2 + var18.length] = (byte)(this.field_z.field_f[param1] >>> 8);
          var5[-1 + var18.length] = (byte)this.field_z.field_f[param1];
          if (null != this.field_k) {
            this.field_w.a(param1, this.field_k, var18, (byte) 66);
            if (this.field_r[param1] != 1) {
              this.field_r[param1] = (byte) 1;
            }
          }
          if (!((vv) (var4)).field_q) {
            ((vv) (var4)).c((byte) -109);
          }
          stackIn_117_0 = var4;
          return (vv) (stackIn_117_0);
        } catch (java.lang.RuntimeException decompiledCaughtParameter2) {
          decompiledCaughtException = decompiledCaughtParameter2;
          var4 = (RuntimeException) (Object) decompiledCaughtException;
          throw nb.a((Throwable) (var4), "wm.K(" + param0 + ',' + param1 + ',' + param2 + ')');
        }
    }

    final static ut a(byte param0, ut param1, int param2) {
        ut var3 = null;
        RuntimeException var3_ref = null;
        ut stackIn_3_0 = null;
        RuntimeException stackIn_7_0 = null;
        StringBuilder stackIn_7_1 = null;
        String stackIn_8_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          var3 = new ut(param2, param1.field_v);
          iw.a(-59, var3);
          param1.c(0, 0);
          pt.a(on.field_g, -22914, on.field_g >> 1, on.field_f, 0);
          if (param0 >= -20) {
            wm.c((byte) 52);
          }
          param1.c(-param1.field_o + on.field_g, 0);
          ta.e(122);
          ta.e(125);
          stackIn_3_0 = var3;
          return stackIn_3_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3_ref = decompiledCaughtException;
          stackIn_7_0 = var3_ref;
          stackIn_7_1 = new StringBuilder().append("wm.H(").append(param0).append(',');
          if (param1 == null) {
            stackIn_8_2 = "null";
          } else {
            stackIn_8_2 = "{...}";
          }
          throw nb.a((Throwable) ((Object) stackIn_7_0), ((StringBuilder) (Object) stackIn_7_1).append(stackIn_8_2).append(',').append(param2).append(')').toString());
        }
    }

    final byte[] b(int param0, int param1) {
        vv var3 = null;
        RuntimeException var3_ref = null;
        byte[] var4 = null;
        byte[] stackIn_7_0 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          var3 = this.a(0, param0, (byte) -30);
          if (var3 == null) {
            return null;
          }
          var4 = var3.b(12802);
          if (param1 != 4) {
            this.a(21);
          }
          var3.c((byte) -109);
          stackIn_7_0 = var4;
          return stackIn_7_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3_ref = decompiledCaughtException;
          throw nb.a((Throwable) ((Object) var3_ref), "wm.D(" + param0 + ',' + param1 + ')');
        }
    }

    wm(int param0, qh param1, qh param2, bi param3, eb param4, int param5, byte[] param6, int param7, boolean param8) {
        boolean stackIn_7_1 = false;
        RuntimeException stackIn_15_0 = null;
        StringBuilder stackIn_15_1 = null;
        String stackIn_16_2 = null;
        RuntimeException stackIn_19_0 = null;
        StringBuilder stackIn_19_1 = null;
        RuntimeException stackIn_20_0 = null;
        String stackIn_20_2 = null;
        RuntimeException stackIn_23_0 = null;
        StringBuilder stackIn_23_1 = null;
        RuntimeException stackIn_24_0 = null;
        String stackIn_24_2 = null;
        RuntimeException stackIn_27_0 = null;
        StringBuilder stackIn_27_1 = null;
        RuntimeException stackIn_28_0 = null;
        String stackIn_28_2 = null;
        RuntimeException stackIn_31_0 = null;
        StringBuilder stackIn_31_1 = null;
        RuntimeException stackIn_32_0 = null;
        String stackIn_32_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var10 = null;
        this.field_v = new kc(16);
        this.field_i = 0;
        this.field_F = new tf();
        this.field_y = 0L;
        try {
          this.field_h = param0;
          this.field_k = param1;
          if (this.field_k == null) {
            this.field_n = false;
          } else {
            this.field_n = true;
            this.field_t = new tf();
          }
          stackIn_7_1 = (param8);
          this.field_A = stackIn_7_1;
          this.field_j = param7;
          this.field_D = param5;
          this.field_w = param4;
          this.field_x = param6;
          this.field_l = param3;
          this.field_q = param2;
          if (null != this.field_q) {
            this.field_B = (vv) ((Object) this.field_w.a(-913, this.field_q, this.field_h));
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var10 = decompiledCaughtException;
          stackIn_15_0 = var10;
          stackIn_15_1 = new StringBuilder().append("wm.<init>(").append(param0).append(',');
          if (param1 == null) {
            stackIn_16_2 = "null";
          } else {
            stackIn_16_2 = "{...}";
          }
          stackIn_19_0 = stackIn_15_0;
          stackIn_19_1 = ((StringBuilder) (Object) stackIn_15_1).append(stackIn_16_2).append(',');
          if (param2 == null) {
            stackIn_20_0 = stackIn_19_0;
            stackIn_20_2 = "null";
          } else {
            stackIn_20_0 = stackIn_15_0;
            stackIn_20_2 = "{...}";
          }
          stackIn_23_0 = stackIn_20_0;
          stackIn_23_1 = ((StringBuilder) (Object) stackIn_19_1).append(stackIn_20_2).append(',');
          if (param3 == null) {
            stackIn_24_0 = stackIn_23_0;
            stackIn_24_2 = "null";
          } else {
            stackIn_24_0 = stackIn_20_0;
            stackIn_24_2 = "{...}";
          }
          stackIn_27_0 = stackIn_24_0;
          stackIn_27_1 = ((StringBuilder) (Object) stackIn_23_1).append(stackIn_24_2).append(',');
          if (param4 == null) {
            stackIn_28_0 = stackIn_27_0;
            stackIn_28_2 = "null";
          } else {
            stackIn_28_0 = stackIn_24_0;
            stackIn_28_2 = "{...}";
          }
          stackIn_31_0 = stackIn_28_0;
          stackIn_31_1 = ((StringBuilder) (Object) stackIn_27_1).append(stackIn_28_2).append(',').append(param5).append(',');
          if (param6 == null) {
            stackIn_32_0 = stackIn_31_0;
            stackIn_32_2 = "null";
          } else {
            stackIn_32_0 = stackIn_28_0;
            stackIn_32_2 = "{...}";
          }
          throw nb.a((Throwable) ((Object) stackIn_32_0), ((StringBuilder) (Object) stackIn_31_1).append(stackIn_32_2).append(',').append(param7).append(',').append(param8).append(')').toString());
        }
    }

    static {
        field_p = "Rating";
        field_s = 1;
    }
}
