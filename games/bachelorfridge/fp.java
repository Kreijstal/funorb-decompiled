/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class fp extends tja {
    private js field_q;
    private byte[] field_s;
    private ta field_g;
    private vm field_n;
    private rf field_d;
    private int field_k;
    private byte[] field_w;
    private cga field_i;
    static String field_t;
    private ea field_r;
    static po field_f;
    private int field_c;
    private ta field_h;
    private int field_o;
    private boolean field_j;
    private eaa field_v;
    private eaa field_l;
    private boolean field_e;
    private int field_u;
    private long field_m;
    private boolean field_p;

    final byte[] a(byte param0, int param1) {
        cga var3 = this.a(0, 123, param1);
        if (var3 == null) {
          return null;
        }
        byte[] var4 = var3.d((byte) -65);
        int var5 = -54 / ((param0 - 49) / 43);
        var3.a(false);
        return var4;
    }

    final void c(int param0) {
        cga discarded$1 = null;
        cga discarded$0 = null;
        cga discarded$3 = null;
        cga discarded$2 = null;
        int var2_int;
        cga var2;
        bw var3;
        int var4;
        int var5;
        bw var6;
        bw var7;
        int var2_intLifetime1;
        int var4Lifetime1;
        bw var3Lifetime1;
        boolean decompiledFrameRemainder0 = true;
        var5 = BachelorFridge.field_y;
        if (this.field_v != null) {
          if (null == this.b(-82)) {
            return;
          }
          if (this.field_j) {
            var2_int = 1;
            var3 = this.field_v.b((byte) 90);
            while (var3 != null) {
              var4 = (int)var3.field_c;
              if (this.field_s[var4] == 0) {
                discarded$1 = this.a(1, 127, var4);
              }
              if (0 != this.field_s[var4]) {
                var3.a(false);
              } else {
                var2_int = 0;
              }
              var3 = this.field_v.c(0);
            }
            L3: while (true) {
              if (this.field_d.field_e.length > this.field_u) {
                if (0 != this.field_d.field_e[this.field_u]) {
                  if (this.field_r.field_b >= 250) {
                    var2_int = 0;
                    break L3;
                  }
                  if (this.field_s[this.field_u] == 0) {
                    discarded$0 = this.a(1, 34, this.field_u);
                  }
                  if (0 == this.field_s[this.field_u]) {
                    var7 = new bw();
                    var7.field_c = (long)this.field_u;
                    var2_int = 0;
                    this.field_v.a(var7, true);
                  }
                }
                this.field_u = this.field_u + 1;
                continue;
              }
              break;
            }
            if ((var2_int != 0)) {
              this.field_u = 0;
              this.field_j = false;
            }
            decompiledFrameRemainder0 = false;
          }
          else {
            if (this.field_e) {
              var2_intLifetime1 = 1;
              var3Lifetime1 = this.field_v.b((byte) 90);
              while (var3Lifetime1 != null) {
                var4Lifetime1 = (int)var3Lifetime1.field_c;
                if (this.field_s[var4Lifetime1] != 1) {
                  discarded$3 = this.a(2, param0 - 14193, var4Lifetime1);
                }
                if (1 == this.field_s[var4Lifetime1]) {
                  var3Lifetime1.a(false);
                } else {
                  var2_intLifetime1 = 0;
                }
                var3Lifetime1 = this.field_v.c(0);
              }
              L10: while (true) {
                if (this.field_u < this.field_d.field_e.length) {
                  if (this.field_d.field_e[this.field_u] != 0) {
                    if (this.field_n.a(false)) {
                      var2_intLifetime1 = 0;
                      break L10;
                    }
                    if (1 != this.field_s[this.field_u]) {
                      discarded$2 = this.a(2, -107, this.field_u);
                    }
                    if (this.field_s[this.field_u] != 1) {
                      var6 = new bw();
                      var6.field_c = (long)this.field_u;
                      var2_intLifetime1 = 0;
                      this.field_v.a(var6, true);
                    }
                  }
                  this.field_u = this.field_u + 1;
                  continue;
                }
                break;
              }
              if ((var2_intLifetime1 != 0)) {
                this.field_e = false;
                this.field_u = 0;
              }
              decompiledFrameRemainder0 = false;
            }
            else {
              this.field_v = null;
            }
          }
        }
        if (this.field_p &&
          this.field_m <= f.b((byte) 73)) {
          var2 = (cga) (this.field_q.b(-13023));
          while (var2 != null) {
            if (!var2.field_n) {
              if (var2.field_o) {
                if (!var2.field_q) {
                  throw new RuntimeException();
                }
                var2.a(false);
              } else {
                var2.field_o = true;
              }
            }
            var2 = (cga) (this.field_q.c(-21446));
          }
          this.field_m = f.b((byte) 73) + 1000L;
        }
        if (param0 != 14075) {
          this.field_m = -36L;
        }
    }

    final void a(byte param0) {
        if (this.field_h == null) {
          return;
        }
        if (param0 != 90) {
          this.a((byte) 110);
        }
        this.field_e = true;
        if (this.field_v == null) {
          this.field_v = new eaa();
        }
    }

    final int a(int param0, int param1) {
        cga var3 = (cga) (this.field_q.a(true, (long)param1));
        if (var3 != null) {
          return var3.e(-6298);
        }
        if (param0 != 8192) {
          this.a(-44, -17);
          return 0;
        }
        return 0;
    }

    private final cga a(int param0, int param1, int param2) {
        Object stackIn_56_0 = null;
        Throwable decompiledCaughtException = null;
        Object var4 = null;
        byte[] var5 = null;
        int var6 = 0;
        int var7_int = 0;
        RuntimeException var7 = null;
        Exception var7_ref = null;
        int var8 = 0;
        int var10 = 0;
        int var11 = 0;
        int var12 = 0;
        cga var13 = null;
        byte[] var14 = null;
        byte[] var19 = null;
        byte[] var28 = null;
        byte[] var29 = null;
        byte[] var30 = null;
        byte[] var31 = null;
        var11 = BachelorFridge.field_y;
        var13 = (cga) (this.field_q.a(true, (long)param2));
        var4 = var13;
        if (var13 != null &&
          0 == param0 &&
          !var13.field_q &&
          var13.field_n) {
          var13.a(false);
          var4 = null;
        }
        if (var4 == null) {
          if (param0 == 0) {
            if (this.field_h != null &&
              this.field_s[param2] != -1) {
              var4 = this.field_r.a(param2, (byte) 112, this.field_h);
            } else {
              if (this.field_n.b(20)) {
                return null;
              }
              var4 = this.field_n.a(this.field_o, param2, 127, (byte) 2, true);
            }
          } else {
            if (1 != param0) {
              if (param0 != 2) {
                throw new RuntimeException();
              }
              if (this.field_h == null) {
                throw new RuntimeException();
              }
              if (this.field_s[param2] != -1) {
                throw new RuntimeException();
              }
              if (this.field_n.a(false)) {
                return null;
              }
              var4 = this.field_n.a(this.field_o, param2, 126, (byte) 2, false);
            } else {
              if (this.field_h == null) {
                throw new RuntimeException();
              }
              var4 = this.field_r.a(this.field_h, (byte) -124, param2);
            }
          }
          this.field_q.a((long)param2, (byte) -93, (bw) (var4));
        }
        if (((cga) (var4)).field_n) {
          return null;
        }
        var6 = -4 / ((param1 + 42) / 59);
        var19 = ((cga) (var4)).d((byte) -65);
        var14 = var19;
        var5 = var14;
        if (var4 instanceof se) {
          try {
            if (var5 != null &&
              var19.length > 2) {
              gt.field_l.reset();
              gt.field_l.update(var5, 0, -2 + var19.length);
              var7_int = (int)gt.field_l.getValue();
              if (this.field_d.field_p[param2] != var7_int) {
                throw new RuntimeException();
              }
              if (null != this.field_d.field_g &&
                null != this.field_d.field_g[param2]) {
                var28 = this.field_d.field_g[param2];
                var29 = ln.a(var19.length - 2, var19, 0, 8);
                for (var10 = 0; var10 < 64; var10++) {
                  if (var28[var10] != var29[var10]) {
                    throw new RuntimeException();
                  }
                }
              }
              var8 = ((255 & var5[-2 + var19.length]) << 8) + (255 & var5[var19.length - 1]);
              if (var8 != (this.field_d.field_i[param2] & 65535)) {
                throw new RuntimeException();
              }
              if (1 != this.field_s[param2]) {
                if (this.field_s[param2] != 0) {
                }
                this.field_s[param2] = (byte) 1;
              }
              if (!((cga) (var4)).field_q) {
                ((cga) (var4)).a(false);
              }
              stackIn_56_0 = var4;
              return (cga) (stackIn_56_0);
            }
            throw new RuntimeException();
          } catch (java.lang.Exception decompiledCaughtParameter1) {
            decompiledCaughtException = decompiledCaughtParameter1;
            var7_ref = (Exception) (Object) decompiledCaughtException;
            this.field_s[param2] = (byte)-1;
            ((cga) (var4)).a(false);
            if (!((cga) (var4)).field_q) {
              return null;
            }
            if (this.field_n.b(20)) {
              return null;
            }
            var4 = this.field_n.a(this.field_o, param2, 127, (byte) 2, true);
            this.field_q.a((long)param2, (byte) -38, (bw) (var4));
            return null;
          }
        }
        try {
          if (var5 != null &&
            var19.length > 2) {
            gt.field_l.reset();
            gt.field_l.update(var5, 0, var19.length - 2);
            var7_int = (int)gt.field_l.getValue();
            if (this.field_d.field_p[param2] != var7_int) {
              throw new RuntimeException();
            }
            if (null != this.field_d.field_g &&
              null != this.field_d.field_g[param2]) {
              var31 = this.field_d.field_g[param2];
              var30 = ln.a(-2 + var19.length, var19, 0, 8);
              var12 = 0;
              var10 = var12;
              while (var12 < 64) {
                if (~var30[var12] != ~var31[var12]) {
                  throw new RuntimeException();
                }
                var12++;
              }
            }
            this.field_n.field_e = 0;
            this.field_n.field_k = 0;
          } else {
            throw new RuntimeException();
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var7 = (RuntimeException) (Object) decompiledCaughtException;
          this.field_n.b((byte) 109);
          ((cga) (var4)).a(false);
          if (!((cga) (var4)).field_q) {
            return null;
          }
          if (!this.field_n.b(20)) {
            var4 = this.field_n.a(this.field_o, param2, 126, (byte) 2, true);
            this.field_q.a((long)param2, (byte) -77, (bw) (var4));
          }
          return null;
        }
        var5[-2 + var19.length] = (byte)(this.field_d.field_i[param2] >>> 8);
        var5[-1 + var19.length] = (byte)this.field_d.field_i[param2];
        if (this.field_h != null) {
          this.field_r.a(this.field_h, var19, param2, 5);
          if (this.field_s[param2] != 1) {
            this.field_s[param2] = (byte) 1;
          }
        }
        if (!((cga) (var4)).field_q) {
          ((cga) (var4)).a(false);
        }
        return (cga) (var4);
    }

    final rf b(int param0) {
        RuntimeException decompiledCaughtException = null;
        byte[] var2 = null;
        RuntimeException var3 = null;
        int var4 = 0;
        byte[] var5 = null;
        byte[] var6 = null;
        byte[] var7 = null;
        var4 = BachelorFridge.field_y;
        if (null != this.field_d) {
          return this.field_d;
        }
        if (param0 >= -7) {
          this.a(74, 4);
        }
        if (this.field_i == null) {
          if (this.field_n.b(20)) {
            return null;
          }
          this.field_i = (cga) ((Object) this.field_n.a(255, this.field_o, 127, (byte) 0, true));
        }
        if (this.field_i.field_n) {
          return null;
        }
        var7 = this.field_i.d((byte) -65);
        var6 = var7;
        var5 = var6;
        var2 = var5;
        if (!(this.field_i instanceof se)) {
          try {
            if (var5 == null) {
              throw new RuntimeException();
            }
            this.field_d = new rf(var7, this.field_k, this.field_w);
          } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
            decompiledCaughtException = decompiledCaughtParameter0;
            var3 = decompiledCaughtException;
            this.field_n.b((byte) -93);
            this.field_d = null;
            if (this.field_n.b(20)) {
              this.field_i = null;
            } else {
              this.field_i = (cga) ((Object) this.field_n.a(255, this.field_o, 122, (byte) 0, true));
            }
            return null;
          }
          if (null != this.field_g) {
            this.field_r.a(this.field_g, var7, this.field_o, 5);
          }
        } else {
          try {
            if (var5 == null) {
              throw new RuntimeException();
            }
            this.field_d = new rf(var7, this.field_k, this.field_w);
            if (this.field_d.field_r != this.field_c) {
              throw new RuntimeException();
            }
          } catch (java.lang.RuntimeException decompiledCaughtParameter1) {
            decompiledCaughtException = decompiledCaughtParameter1;
            var3 = decompiledCaughtException;
            this.field_d = null;
            if (!this.field_n.b(20)) {
              this.field_i = (cga) ((Object) this.field_n.a(255, this.field_o, 124, (byte) 0, true));
            } else {
              this.field_i = null;
            }
            return null;
          }
        }
        this.field_i = null;
        if (null != this.field_h) {
          this.field_s = new byte[this.field_d.field_f];
        }
        return this.field_d;
    }

    final void e(int param0) {
        int var3 = 0;
        cga discarded$0 = null;
        cga discarded$1 = null;
        int var4 = BachelorFridge.field_y;
        if (param0 < 44) {
          this.field_p = true;
        }
        if (this.field_v == null) {
          return;
        }
        if (this.b(-24) == null) {
          return;
        }
        bw var2 = this.field_l.b((byte) 90);
        while (var2 != null) {
          var3 = (int)var2.field_c;
          if (var3 < 0) {
            var2.a(false);
          } else {
            if (var3 >= this.field_d.field_f) {
              var2.a(false);
            } else {
              if (this.field_d.field_e[var3] == 0) {
                var2.a(false);
              } else {
                if (this.field_s[var3] == 0) {
                  discarded$0 = this.a(1, -111, var3);
                }
                if (-1 == this.field_s[var3]) {
                  discarded$1 = this.a(2, -116, var3);
                }
                if (this.field_s[var3] == 1) {
                  var2.a(false);
                }
              }
            }
          }
          var2 = this.field_l.c(0);
        }
    }

    public static void d(int param0) {
        field_t = null;
        int var1 = 5 % ((-59 - param0) / 47);
        field_f = null;
    }

    fp(int param0, ta param1, ta param2, vm param3, ea param4, int param5, byte[] param6, int param7, boolean param8) {
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
        this.field_q = new js(16);
        this.field_u = 0;
        this.field_l = new eaa();
        this.field_m = 0L;
        try {
          this.field_h = param1;
          this.field_o = param0;
          if (this.field_h != null) {
            this.field_j = true;
            this.field_v = new eaa();
          } else {
            this.field_j = false;
          }
          this.field_r = param4;
          this.field_w = param6;
          stackIn_7_1 = (param8);
          this.field_p = stackIn_7_1;
          this.field_c = param7;
          this.field_k = param5;
          this.field_g = param2;
          this.field_n = param3;
          if (null != this.field_g) {
            this.field_i = (cga) ((Object) this.field_r.a(this.field_o, (byte) -124, this.field_g));
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var10 = decompiledCaughtException;
          stackIn_12_0 = var10;
          stackIn_12_1 = new StringBuilder().append("fp.<init>(").append(param0).append(',');
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
          throw pe.a((Throwable) ((Object) stackIn_12_0), ((StringBuilder) (Object) stackIn_24_1).append(stackIn_25_2).append(',').append(param7).append(',').append(param8).append(')').toString());
        }
    }

    static {
        field_t = "Here you can see your creatures actions, stats and description. Clicking on an unequipped action will equip it, ready to be used in the Arena. You must equip at least one move type action, and one attack type action. Assign all your actions now.";
    }
}
