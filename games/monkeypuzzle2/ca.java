/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class ca extends rf {
    private byte[] field_i;
    private int field_w;
    private int field_u;
    private gf field_g;
    private wd field_c;
    static le field_f;
    private gf field_p;
    private cg field_q;
    private int field_t;
    private wl field_r;
    private fb field_o;
    private uj field_v;
    static String field_n;
    private byte[] field_s;
    private pj field_j;
    private pj field_h;
    private boolean field_m;
    private boolean field_d;
    private int field_l;
    private boolean field_k;
    private long field_e;

    final void c(int param0) {
        fb discarded$3 = null;
        fb discarded$2 = null;
        fb discarded$1 = null;
        fb discarded$0 = null;
        int var2_int;
        fb var2;
        ug var3;
        int var4;
        int var5;
        ug var6;
        ug var7;
        int var2_intLifetime1;
        int var4Lifetime1;
        ug var3Lifetime1;
        boolean decompiledFrameRemainder0 = true;
        var5 = MonkeyPuzzle2.field_F ? 1 : 0;
        if (null != this.field_h) {
          if (null == this.a((byte) 119)) {
            return;
          }
          if (this.field_d) {
            var2_int = 1;
            var3 = this.field_h.a((byte) -117);
            while (var3 != null) {
              var4 = (int)var3.field_a;
              if (this.field_s[var4] == 0) {
                discarded$3 = this.a(2, 1, var4);
              }
              if (this.field_s[var4] == 0) {
                var2_int = 0;
              } else {
                var3.c(-19822);
              }
              var3 = this.field_h.d((byte) 63);
            }
            L10: while (true) {
              if (this.field_c.field_m.length > this.field_l) {
                if (this.field_c.field_m[this.field_l] != 0) {
                  if (250 <= this.field_v.field_j) {
                    var2_int = 0;
                    break L10;
                  }
                  if (0 == this.field_s[this.field_l]) {
                    discarded$2 = this.a(param0 ^ 16309, 1, this.field_l);
                  }
                  if (this.field_s[this.field_l] == 0) {
                    var6 = new ug();
                    var6.field_a = (long)this.field_l;
                    var2_int = 0;
                    this.field_h.a(-8212, var6);
                  }
                }
                this.field_l = this.field_l + 1;
                continue;
              }
              break;
            }
            if ((var2_int != 0)) {
              this.field_l = 0;
              this.field_d = false;
            }
            decompiledFrameRemainder0 = false;
          }
          else {
            if (this.field_m) {
              var2_intLifetime1 = 1;
              var3Lifetime1 = this.field_h.a((byte) -117);
              while (var3Lifetime1 != null) {
                var4Lifetime1 = (int)var3Lifetime1.field_a;
                if (1 != this.field_s[var4Lifetime1]) {
                  discarded$1 = this.a(2, 2, var4Lifetime1);
                }
                if (this.field_s[var4Lifetime1] == 1) {
                  var3Lifetime1.c(param0 - 36133);
                } else {
                  var2_intLifetime1 = 0;
                }
                var3Lifetime1 = this.field_h.d((byte) 63);
              }
              while (this.field_l < this.field_c.field_m.length) {
                if (this.field_c.field_m[this.field_l] == 0) {
                  this.field_l = this.field_l + 1;
                  continue;
                }
                if (!this.field_r.a(20)) {
                  if (this.field_s[this.field_l] != 1) {
                    discarded$0 = this.a(param0 - 16309, 2, this.field_l);
                  }
                  if (this.field_s[this.field_l] != 1) {
                    var7 = new ug();
                    var7.field_a = (long)this.field_l;
                    var2_intLifetime1 = 0;
                    this.field_h.a(-8212, var7);
                  }
                  this.field_l = this.field_l + 1;
                  continue;
                }
                var2_intLifetime1 = 0;
                break;
              }
              if ((var2_intLifetime1 != 0)) {
                this.field_l = 0;
                this.field_m = false;
              }
              decompiledFrameRemainder0 = false;
            }
            else {
              this.field_h = null;
            }
          }
        }
        if (param0 != 16311) {
          this.field_q = (cg) null;
        }
        if (this.field_k &&
          pf.a(0) >= this.field_e) {
          var2 = (fb) (this.field_q.a(0));
          while (var2 != null) {
            if (!var2.field_j) {
              if (!var2.field_l) {
                var2.field_l = true;
              } else {
                if (!var2.field_m) {
                  throw new RuntimeException();
                }
                var2.c(param0 - 36133);
              }
            }
            var2 = (fb) (this.field_q.a((byte) -55));
          }
          this.field_e = pf.a(param0 - 16311) + 1000L;
        }
    }

    final static void a(int param0, int param1, int param2, int param3, int param4, int param5, int[] param6, int param7, int param8) {
        RuntimeException stackIn_79_0 = null;
        StringBuilder stackIn_79_1 = null;
        String stackIn_80_2 = null;
        RuntimeException decompiledCaughtException = null;
        int var9_int = 0;
        RuntimeException var9 = null;
        int var10 = 0;
        int var11 = 0;
        int var12 = 0;
        int var13 = 0;
        int var14 = 0;
        int var15 = 0;
        int var16 = 0;
        int var17 = 0;
        int var18 = 0;
        int var19 = 0;
        int var15Lifetime1;
        int var16Lifetime1;
        int var17Lifetime1;
        int var16Lifetime2;
        int var16Lifetime3;
        int var17Lifetime2;
        var19 = MonkeyPuzzle2.field_F ? 1 : 0;
        try {
          if (param8 >= 0 &&
            param2 < ig.field_a) {
            if (0 > param3 &&
              0 > param1 &&
              param4 < 0) {
              return;
            }
            if (param3 >= ig.field_c &&
              ig.field_c <= param1 &&
              param4 >= ig.field_c) {
              return;
            }
            var14 = param8 - param2;
            if (param2 == param5) {
              if (param2 != param8) {
                var15 = -param5 + param8;
                if (param3 < param1) {
                  var9_int = param3 << 16;
                  var11 = (param4 - param3 << 16) / var14;
                  var10 = param1 << 16;
                  var12 = (-param1 + param4 << 16) / var15;
                } else {
                  var11 = (param4 - param1 << 16) / var15;
                  var12 = (-param3 + param4 << 16) / var14;
                  var10 = param3 << 16;
                  var9_int = param1 << 16;
                }
              } else {
                var11 = 0;
                var12 = 0;
                var10 = param1 << 16;
                var9_int = param3 << 16;
              }
              if (param2 < 0) {
                param2 = Math.min(-param2, param5 - param2);
                var10 = var10 + var12 * param2;
                var9_int = var9_int + param2 * var11;
                param2 = 0;
              }
              var13 = 0;
            } else {
              var10 = param3 << 16;
              var9_int = param3 << 16;
              var15 = -param2 + param5;
              var11 = (param1 - param3 << 16) / var15;
              var12 = (-param3 + param4 << 16) / var14;
              if (var11 >= var12) {
                var16 = var11;
                var11 = var12;
                var12 = var16;
                var13 = 1;
              } else {
                var13 = 0;
              }
              boolean decompiledFrameRemainder0 = true;
              if (param2 < 0) {
                if (param5 < 0) {
                  param2 = param5 - param2;
                  var9_int = var9_int + var11 * param2;
                  var10 = var10 + param2 * var12;
                  param2 = param5;
                  decompiledFrameRemainder0 = false;
                }
                else {
                  param2 = -param2;
                  var9_int = var9_int + var11 * param2;
                  var10 = var10 + param2 * var12;
                  param2 = 0;
                }
              }
              if (decompiledFrameRemainder0) {
                var16Lifetime2 = ig.field_i[param2];
                while (param5 > param2) {
                  var17 = var9_int >> 16;
                  if (ig.field_c > var17) {
                    var18 = (var10 >> 16) - (var9_int >> 16);
                    if (var18 != 0) {
                      if (var18 + var17 >= ig.field_c) {
                        var18 = ig.field_c + (-var17 - 1);
                      }
                      if (var17 >= 0) {
                        tl.a(var18, param0, (byte) -76, var16Lifetime2 + var17, param6);
                      } else {
                        tl.a(var17 + var18, param0, (byte) -115, var16Lifetime2, param6);
                      }
                    } else {
                      if (var17 >= 0 &&
                        ig.field_c > var17) {
                        tl.a(var18, param0, (byte) -97, var17 + var16Lifetime2, param6);
                      }
                    }
                  }
                  param2++;
                  if (ig.field_a <= param2) {
                    return;
                  }
                  var16Lifetime2 = var16Lifetime2 + ge.field_h;
                  var9_int = var9_int + var11;
                  var10 = var10 + var12;
                }
              }
              var16Lifetime3 = -param5 + param8;
              if (0 == var16Lifetime3) {
                var12 = 0;
                var11 = 0;
              } else {
                var17Lifetime2 = param4 << 16;
                if (var13 != 0) {
                  var10 = param1 << 16;
                } else {
                  var9_int = param1 << 16;
                }
                var12 = (var17Lifetime2 - var10) / var16Lifetime3;
                var11 = (var17Lifetime2 - var9_int) / var16Lifetime3;
              }
            }
            if (0 > param2) {
              param2 = -param2;
              var9_int = var9_int + var11 * param2;
              var10 = var10 + param2 * var12;
              param2 = 0;
            }
            if (param7 != -18427) {
              field_n = (String) null;
            }
            var15Lifetime1 = ig.field_i[param2];
            while (param2 < param8) {
              var16Lifetime1 = var9_int >> 16;
              if (ig.field_c > var16Lifetime1) {
                var17Lifetime1 = (var10 >> 16) - (var9_int >> 16);
                if (var17Lifetime1 == 0) {
                  if (var16Lifetime1 >= 0 &&
                    ig.field_c > var16Lifetime1) {
                    tl.a(var17Lifetime1, param0, (byte) -106, var15Lifetime1 + var16Lifetime1, param6);
                  }
                } else {
                  if (var16Lifetime1 + var17Lifetime1 >= ig.field_c) {
                    var17Lifetime1 = -var16Lifetime1 + (ig.field_c - 1);
                  }
                  if (0 > var16Lifetime1) {
                    tl.a(var17Lifetime1 + var16Lifetime1, param0, (byte) -91, var15Lifetime1, param6);
                  } else {
                    tl.a(var17Lifetime1, param0, (byte) -106, var16Lifetime1 + var15Lifetime1, param6);
                  }
                }
              }
              param2++;
              if (ig.field_a <= param2) {
                return;
              }
              var10 = var10 + var12;
              var9_int = var9_int + var11;
              var15Lifetime1 = var15Lifetime1 + ge.field_h;
            }
            return;
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var9 = decompiledCaughtException;
          stackIn_79_0 = var9;
          stackIn_79_1 = new StringBuilder().append("ca.H(").append(param0).append(',').append(param1).append(',').append(param2).append(',').append(param3).append(',').append(param4).append(',').append(param5).append(',');
          if (param6 == null) {
            stackIn_80_2 = "null";
          } else {
            stackIn_80_2 = "{...}";
          }
          throw la.a((Throwable) ((Object) stackIn_79_0), ((StringBuilder) (Object) stackIn_79_1).append(stackIn_80_2).append(',').append(param7).append(',').append(param8).append(')').toString());
        }
    }

    final wd a(byte param0) {
        RuntimeException decompiledCaughtException = null;
        byte[] var2 = null;
        RuntimeException var3 = null;
        int var4 = 0;
        byte[] var5 = null;
        byte[] var6 = null;
        byte[] var7 = null;
        var4 = MonkeyPuzzle2.field_F ? 1 : 0;
        if (null != this.field_c) {
          return this.field_c;
        }
        if (param0 < 39) {
          this.field_e = -112L;
        }
        if (this.field_o == null) {
          if (this.field_r.d(20)) {
            return null;
          }
          this.field_o = (fb) ((Object) this.field_r.a(255, this.field_u, 102, true, (byte) 0));
        }
        if (this.field_o.field_j) {
          return null;
        }
        var7 = this.field_o.e(125);
        var6 = var7;
        var5 = var6;
        var2 = var5;
        if (this.field_o instanceof si) {
          try {
            if (var5 == null) {
              throw new RuntimeException();
            }
            this.field_c = new wd(var7, this.field_w, this.field_i);
            if (this.field_c.field_l != this.field_t) {
              throw new RuntimeException();
            }
          } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
            decompiledCaughtException = decompiledCaughtParameter0;
            var3 = decompiledCaughtException;
            this.field_c = null;
            if (this.field_r.d(20)) {
              this.field_o = null;
            } else {
              this.field_o = (fb) ((Object) this.field_r.a(255, this.field_u, 91, true, (byte) 0));
            }
            return null;
          }
        } else {
          try {
            if (var5 == null) {
              throw new RuntimeException();
            }
            this.field_c = new wd(var7, this.field_w, this.field_i);
          } catch (java.lang.RuntimeException decompiledCaughtParameter1) {
            decompiledCaughtException = decompiledCaughtParameter1;
            var3 = decompiledCaughtException;
            this.field_r.b(20);
            this.field_c = null;
            if (!this.field_r.d(20)) {
              this.field_o = (fb) ((Object) this.field_r.a(255, this.field_u, 75, true, (byte) 0));
            } else {
              this.field_o = null;
            }
            return null;
          }
          if (null != this.field_p) {
            this.field_v.a(false, this.field_u, var7, this.field_p);
          }
        }
        this.field_o = null;
        if (this.field_g != null) {
          this.field_s = new byte[this.field_c.field_e];
        }
        return this.field_c;
    }

    final byte[] b(int param0, int param1) {
        fb var3 = this.a(2, 0, param1);
        if (var3 == null) {
          return null;
        }
        byte[] var4 = var3.e(-81);
        var3.c(-19822);
        if (param0 >= -110) {
          return (byte[]) null;
        }
        return var4;
    }

    private final fb a(int param0, int param1, int param2) {
        int stackIn_61_0 = 0;
        int stackIn_61_1 = 0;
        Object stackIn_91_0 = null;
        Throwable decompiledCaughtException = null;
        Object var4 = null;
        byte[] var5 = null;
        int var6_int = 0;
        Exception var6 = null;
        RuntimeException var6_ref = null;
        int var7 = 0;
        int var9 = 0;
        int var10 = 0;
        int var11 = 0;
        fb var12 = null;
        byte[] var13 = null;
        byte[] var18 = null;
        byte[] var27 = null;
        byte[] var28 = null;
        byte[] var29 = null;
        byte[] var30 = null;
        var10 = MonkeyPuzzle2.field_F ? 1 : 0;
        if (param0 != 2) {
          this.field_w = 1;
        }
        var12 = (fb) (this.field_q.a((byte) 119, (long)param2));
        var4 = var12;
        if (var12 != null &&
          param1 == 0 &&
          !var12.field_m &&
          var12.field_j) {
          var12.c(param0 - 19824);
          var4 = null;
        }
        if (var4 == null) {
          if (0 == param1) {
            if (this.field_g != null &&
              this.field_s[param2] != -1) {
              var4 = this.field_v.a(this.field_g, 1, param2);
            } else {
              if (this.field_r.d(20)) {
                return null;
              }
              var4 = this.field_r.a(this.field_u, param2, 103, true, (byte) 2);
            }
          } else {
            if (param1 == 1) {
              if (this.field_g == null) {
                throw new RuntimeException();
              }
              var4 = this.field_v.a(param2, this.field_g, (byte) -127);
            } else {
              if (2 != param1) {
                throw new RuntimeException();
              }
              if (null == this.field_g) {
                throw new RuntimeException();
              }
              if (this.field_s[param2] != -1) {
                throw new RuntimeException();
              }
              if (this.field_r.a(param0 + 18)) {
                return null;
              }
              var4 = this.field_r.a(this.field_u, param2, 82, false, (byte) 2);
            }
          }
          this.field_q.a((ug) (var4), (long)param2, (byte) -36);
        }
        if (((fb) (var4)).field_j) {
          return null;
        }
        var18 = ((fb) (var4)).e(119);
        var13 = var18;
        var5 = var13;
        if (var4 instanceof si) {
          try {
            if (var5 != null &&
              var18.length > 2) {
              cl.field_f.reset();
              cl.field_f.update(var5, 0, var18.length - 2);
              var6_int = (int)cl.field_f.getValue();
              if (var6_int != this.field_c.field_j[param2]) {
                throw new RuntimeException();
              }
              if (null != this.field_c.field_n &&
                null != this.field_c.field_n[param2]) {
                var29 = this.field_c.field_n[param2];
                var30 = ie.a(-68, var5, -2 + var18.length, 0);
                var11 = 0;
                var9 = var11;
                while (var11 < 64) {
                  if (var29[var11] != var30[var11]) {
                    throw new RuntimeException();
                  }
                  var11++;
                }
              }
              var7 = (255 & var5[var18.length - 1]) + (65280 & var5[var18.length - 2] << 8);
              if (var7 != (65535 & this.field_c.field_p[param2])) {
                throw new RuntimeException();
              }
              if (this.field_s[param2] != 1) {
                if (0 == this.field_s[param2]) {
                }
                this.field_s[param2] = (byte) 1;
              }
              if (!((fb) (var4)).field_m) {
                ((fb) (var4)).c(-19822);
              }
              stackIn_91_0 = var4;
              return (fb) (stackIn_91_0);
            }
            throw new RuntimeException();
          } catch (java.lang.Exception decompiledCaughtParameter0) {
            decompiledCaughtException = decompiledCaughtParameter0;
            var6 = (Exception) (Object) decompiledCaughtException;
            this.field_s[param2] = (byte)-1;
            ((fb) (var4)).c(-19822);
            if (((fb) (var4)).field_m) {
              if (this.field_r.d(param0 + 18)) {
                return null;
              }
              var4 = this.field_r.a(this.field_u, param2, 83, true, (byte) 2);
              this.field_q.a((ug) (var4), (long)param2, (byte) -36);
            }
            return null;
          }
        }
        try {
          if (var5 != null &&
            var18.length > 2) {
            cl.field_f.reset();
            cl.field_f.update(var5, 0, -2 + var18.length);
            var6_int = (int)cl.field_f.getValue();
            if (var6_int != this.field_c.field_j[param2]) {
              throw new RuntimeException();
            }
            if (null != this.field_c.field_n &&
              this.field_c.field_n[param2] != null) {
              var28 = this.field_c.field_n[param2];
              var27 = ie.a(param0 - 109, var5, -2 + var18.length, 0);
              for (var9 = 0; var9 < 64; var9++) {
                if (~var27[var9] != ~var28[var9]) {
                  throw new RuntimeException();
                }
              }
            }
            this.field_r.field_b = 0;
            this.field_r.field_a = 0;
          } else {
            throw new RuntimeException();
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter1) {
          decompiledCaughtException = decompiledCaughtParameter1;
          var6_ref = (RuntimeException) (Object) decompiledCaughtException;
          this.field_r.b(20);
          ((fb) (var4)).c(-19822);
          if (((fb) (var4)).field_m &&
            !this.field_r.d(param0 + 18)) {
            var4 = this.field_r.a(this.field_u, param2, param0 + 112, true, (byte) 2);
            this.field_q.a((ug) (var4), (long)param2, (byte) -36);
          }
          return null;
        }
        var5[var18.length - 2] = (byte)(this.field_c.field_p[param2] >>> 8);
        var5[-1 + var18.length] = (byte)this.field_c.field_p[param2];
        if (this.field_g != null) {
          this.field_v.a(false, param2, var18, this.field_g);
          stackIn_61_0 = ~this.field_s[param2];
          stackIn_61_1 = -2;
          if (stackIn_61_0 != stackIn_61_1) {
            this.field_s[param2] = (byte) 1;
          }
        }
        if (!((fb) (var4)).field_m) {
          ((fb) (var4)).c(-19822);
        }
        return (fb) (var4);
    }

    final void b(int param0) {
        fb discarded$0 = null;
        fb discarded$1 = null;
        ug var2;
        int var3;
        int var4;
        var4 = MonkeyPuzzle2.field_F ? 1 : 0;
        if (null == this.field_h) {
          return;
        }
        if (param0 != -1) {
          return;
        }
        if (null == this.a((byte) 53)) {
          return;
        }
        var2 = this.field_j.a((byte) -117);
        while (var2 != null) {
          var3 = (int)var2.field_a;
          if (var3 >= 0) {
            if (this.field_c.field_e > var3) {
              if (this.field_c.field_m[var3] == 0) {
                var2.c(-19822);
              } else {
                if (this.field_s[var3] == 0) {
                  discarded$0 = this.a(2, 1, var3);
                }
                if (-1 == this.field_s[var3]) {
                  discarded$1 = this.a(2, 2, var3);
                }
                if (this.field_s[var3] == 1) {
                  var2.c(-19822);
                }
              }
            } else {
              var2.c(-19822);
            }
          } else {
            var2.c(-19822);
          }
          var2 = this.field_j.d((byte) 63);
        }
    }

    public static void d(int param0) {
        if (param0 != -1) {
          field_f = (le) null;
        }
        field_n = null;
        field_f = null;
    }

    final int a(int param0, int param1) {
        fb discarded$0 = null;
        fb var3 = (fb) (this.field_q.a((byte) 112, (long)param1));
        if (param0 >= -42) {
          discarded$0 = this.a(85, 123, 107);
        }
        if (var3 == null) {
          return 0;
        }
        return var3.a(true);
    }

    final void a(int param0) {
        if (this.field_g == null) {
          return;
        }
        if (param0 != -1) {
          this.a(-68, -82);
        }
        this.field_m = true;
        if (null == this.field_h) {
          this.field_h = new pj();
        }
    }

    ca(int param0, gf param1, gf param2, wl param3, uj param4, int param5, byte[] param6, int param7, boolean param8) {
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
        this.field_q = new cg(16);
        this.field_l = 0;
        this.field_j = new pj();
        this.field_e = 0L;
        try {
          this.field_g = param1;
          this.field_u = param0;
          if (this.field_g == null) {
            this.field_d = false;
          } else {
            this.field_d = true;
            this.field_h = new pj();
          }
          stackIn_7_1 = (param8);
          this.field_k = stackIn_7_1;
          this.field_t = param7;
          this.field_r = param3;
          this.field_v = param4;
          this.field_w = param5;
          this.field_i = param6;
          this.field_p = param2;
          if (null != this.field_p) {
            this.field_o = (fb) ((Object) this.field_v.a(this.field_p, 1, this.field_u));
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var10 = decompiledCaughtException;
          stackIn_12_0 = var10;
          stackIn_12_1 = new StringBuilder().append("ca.<init>(").append(param0).append(',');
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
          throw la.a((Throwable) ((Object) stackIn_12_0), ((StringBuilder) (Object) stackIn_24_1).append(stackIn_25_2).append(',').append(param7).append(',').append(param8).append(')').toString());
        }
    }

    static {
        field_n = "Play the game without logging in just yet";
        field_f = new le(270, 70);
    }
}
