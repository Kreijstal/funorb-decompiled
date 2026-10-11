/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class ce extends td {
    private g field_s;
    private byte[] field_p;
    private v field_f;
    static int[] field_n;
    private vh field_k;
    private int field_j;
    private int field_r;
    private vh field_l;
    private byte[] field_m;
    static String field_t;
    private int field_q;
    private vi field_u;
    private gj field_i;
    private uk field_o;
    private bc field_h;
    private bc field_c;
    private boolean field_g;
    private boolean field_d;
    private int field_w;
    private long field_e;
    private boolean field_v;

    final int a(int param0, int param1) {
        gj var3 = (gj) (this.field_o.a(19, (long)param1));
        if (param0 < 111) {
          return -12;
        }
        if (var3 != null) {
          return var3.c((byte) -120);
        }
        return 0;
    }

    final byte[] a(int param0, boolean param1) {
        gj var3 = this.a(0, 255, param0);
        if (var3 == null) {
          return null;
        }
        if (!param1) {
          this.field_h = (bc) null;
        }
        byte[] var4 = var3.d((byte) -124);
        var3.c(2);
        return var4;
    }

    final void b(byte param0) {
        if (this.field_k == null) {
          return;
        }
        this.field_d = true;
        if (param0 >= -72) {
          return;
        }
        if (null == this.field_h) {
          this.field_h = new bc();
        }
    }

    final g b(int param0) {
        RuntimeException decompiledCaughtException = null;
        byte[] var2 = null;
        RuntimeException var3 = null;
        int var4 = 0;
        byte[] var5 = null;
        byte[] var6 = null;
        byte[] var7 = null;
        var4 = Bounce.field_N;
        if (this.field_s != null) {
          return this.field_s;
        }
        if (this.field_i == null) {
          if (this.field_f.b(false)) {
            return null;
          }
          this.field_i = (gj) ((Object) this.field_f.a(this.field_q, (byte) 0, param0 ^ -102, true, 255));
        }
        if (this.field_i.field_n) {
          return null;
        }
        if (param0 != 1) {
          this.field_k = (vh) null;
        }
        var7 = this.field_i.d((byte) -115);
        var6 = var7;
        var5 = var6;
        var2 = var5;
        if (!(this.field_i instanceof md)) {
          try {
            if (var5 == null) {
              throw new RuntimeException();
            }
            this.field_s = new g(var7, this.field_r, this.field_m);
          } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
            decompiledCaughtException = decompiledCaughtParameter0;
            var3 = decompiledCaughtException;
            this.field_f.c((byte) 118);
            this.field_s = null;
            if (this.field_f.b(false)) {
              this.field_i = null;
            } else {
              this.field_i = (gj) ((Object) this.field_f.a(this.field_q, (byte) 0, -102, true, 255));
            }
            return null;
          }
          if (this.field_l != null) {
            this.field_u.a(this.field_l, this.field_q, (byte) -78, var7);
          }
        } else {
          try {
            if (var5 == null) {
              throw new RuntimeException();
            }
            this.field_s = new g(var7, this.field_r, this.field_m);
            if (this.field_j != this.field_s.field_h) {
              throw new RuntimeException();
            }
          } catch (java.lang.RuntimeException decompiledCaughtParameter1) {
            decompiledCaughtException = decompiledCaughtParameter1;
            var3 = decompiledCaughtException;
            this.field_s = null;
            if (!this.field_f.b(false)) {
              this.field_i = (gj) ((Object) this.field_f.a(this.field_q, (byte) 0, 107, true, 255));
            } else {
              this.field_i = null;
            }
            return null;
          }
        }
        this.field_i = null;
        if (this.field_k != null) {
          this.field_p = new byte[this.field_s.field_m];
        }
        return this.field_s;
    }

    public static void c(byte param0) {
        if (param0 >= -27) {
          return;
        }
        field_t = null;
        field_n = null;
    }

    private final gj a(int param0, int param1, int param2) {
        Object stackIn_92_0 = null;
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
        gj var12 = null;
        byte[] var13 = null;
        byte[] var18 = null;
        byte[] var27 = null;
        byte[] var28 = null;
        byte[] var29 = null;
        byte[] var30 = null;
        var10 = Bounce.field_N;
        var12 = (gj) (this.field_o.a(36, (long)param2));
        var4 = var12;
        if (var12 != null &&
          0 == param0 &&
          !var12.field_m &&
          var12.field_n) {
          var12.c(param1 ^ 253);
          var4 = null;
        }
        if (var4 == null) {
          if (param0 != 0) {
            if (param0 == 1) {
              if (null == this.field_k) {
                throw new RuntimeException();
              }
              var4 = this.field_u.a(3, param2, this.field_k);
            } else {
              if (param0 != 2) {
                throw new RuntimeException();
              }
              if (null == this.field_k) {
                throw new RuntimeException();
              }
              if (-1 != this.field_p[param2]) {
                throw new RuntimeException();
              }
              if (this.field_f.b((byte) 39)) {
                return null;
              }
              var4 = this.field_f.a(param2, (byte) 2, -122, false, this.field_q);
            }
          } else {
            if (this.field_k != null &&
              this.field_p[param2] != -1) {
              var4 = this.field_u.a(param2, this.field_k, true);
            } else {
              if (this.field_f.b(false)) {
                return null;
              }
              var4 = this.field_f.a(param2, (byte) 2, 81, true, this.field_q);
            }
          }
          this.field_o.a((long)param2, param1 - 172, (ai) (var4));
        }
        if (((gj) (var4)).field_n) {
          return null;
        }
        if (param1 != 255) {
          return (gj) null;
        }
        var18 = ((gj) (var4)).d((byte) -120);
        var13 = var18;
        var5 = var13;
        if (var4 instanceof md) {
          try {
            if (var5 != null &&
              2 < var18.length) {
              uf.field_b.reset();
              uf.field_b.update(var5, 0, -2 + var18.length);
              var6_int = (int)uf.field_b.getValue();
              if (this.field_s.field_j[param2] != var6_int) {
                throw new RuntimeException();
              }
              if (null != this.field_s.field_e &&
                this.field_s.field_e[param2] != null) {
                var29 = this.field_s.field_e[param2];
                var30 = jd.a(var5, 0, var18.length - 2, 0);
                var11 = 0;
                var9 = var11;
                while (64 > var11) {
                  if (var29[var11] != var30[var11]) {
                    throw new RuntimeException();
                  }
                  var11++;
                }
              }
              var7 = (65280 & var5[var18.length - 2] << 8) + (var5[-1 + var18.length] & 255);
              if (var7 != (65535 & this.field_s.field_g[param2])) {
                throw new RuntimeException();
              }
              if (this.field_p[param2] != 1) {
                if (0 != this.field_p[param2]) {
                }
                this.field_p[param2] = (byte) 1;
              }
              if (!((gj) (var4)).field_m) {
                ((gj) (var4)).c(2);
              }
              stackIn_92_0 = var4;
              return (gj) (stackIn_92_0);
            }
            throw new RuntimeException();
          } catch (java.lang.Exception decompiledCaughtParameter0) {
            decompiledCaughtException = decompiledCaughtParameter0;
            var6 = (Exception) (Object) decompiledCaughtException;
            this.field_p[param2] = (byte)-1;
            ((gj) (var4)).c(2);
            if (((gj) (var4)).field_m &&
              !this.field_f.b(false)) {
              var4 = this.field_f.a(param2, (byte) 2, 36, true, this.field_q);
              this.field_o.a((long)param2, 124, (ai) (var4));
            }
            return null;
          }
        }
        try {
          if (var5 != null &&
            2 < var18.length) {
            uf.field_b.reset();
            uf.field_b.update(var5, 0, var18.length - 2);
            var6_int = (int)uf.field_b.getValue();
            if (this.field_s.field_j[param2] != var6_int) {
              throw new RuntimeException();
            }
            if (null != this.field_s.field_e &&
              this.field_s.field_e[param2] != null) {
              var28 = this.field_s.field_e[param2];
              var27 = jd.a(var5, 0, var18.length - 2, param1 - 255);
              for (var9 = 0; var9 < 64; var9++) {
                if (var27[var9] != var28[var9]) {
                  throw new RuntimeException();
                }
              }
            }
            this.field_f.field_l = 0;
            this.field_f.field_d = 0;
          } else {
            throw new RuntimeException();
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter1) {
          decompiledCaughtException = decompiledCaughtParameter1;
          var6_ref = (RuntimeException) (Object) decompiledCaughtException;
          this.field_f.c((byte) 113);
          ((gj) (var4)).c(2);
          if (((gj) (var4)).field_m) {
            if (this.field_f.b(false)) {
              return null;
            }
            var4 = this.field_f.a(param2, (byte) 2, -62, true, this.field_q);
            this.field_o.a((long)param2, param1 ^ 202, (ai) (var4));
          }
          return null;
        }
        var5[var18.length - 2] = (byte)(this.field_s.field_g[param2] >>> 8);
        var5[-1 + var18.length] = (byte)this.field_s.field_g[param2];
        if (null != this.field_k) {
          this.field_u.a(this.field_k, param2, (byte) 97, var18);
          if (this.field_p[param2] != 1) {
            this.field_p[param2] = (byte) 1;
          }
        }
        if (!((gj) (var4)).field_m) {
          ((gj) (var4)).c(2);
        }
        return (gj) (var4);
    }

    final static String a(CharSequence param0, int param1) {
        int var6 = 0;
        StringBuilder discarded$0 = null;
        Object stackIn_3_0 = null;
        Object stackIn_26_0 = null;
        String stackIn_28_0 = null;
        RuntimeException stackIn_31_0 = null;
        StringBuilder stackIn_31_1 = null;
        String stackIn_32_2 = null;
        RuntimeException decompiledCaughtException = null;
        int var2_int = 0;
        RuntimeException var2 = null;
        int var3 = 0;
        int var4 = 0;
        StringBuilder var5 = null;
        int var7 = 0;
        int var8 = 0;
        int var9 = 0;
        var9 = Bounce.field_N;
        try {
          if (param0 == null) {
            stackIn_3_0 = null;
            return (String) (stackIn_3_0);
          }
          var2_int = param1;
          var3 = param0.length();
          while (var2_int < var3) {
            if (f.a(param0.charAt(var2_int), false)) {
              var2_int++;
              continue;
            }
            break;
          }
          while (var3 > var2_int) {
            if (f.a(param0.charAt(-1 + var3), false)) {
              var3--;
              continue;
            }
            break;
          }
          var4 = var3 - var2_int;
          if (var4 < 1) {
            return null;
          }
          if (var4 > 12) {
            return null;
          }
          var5 = new StringBuilder(var4);
          for (var6 = var2_int; var3 > var6; var6++) {
            var7 = param0.charAt(var6);
            if (ng.a((byte) -95, (char) var7)) {
              var8 = hd.a(31400, (char) var7);
              if (0 != var8) {
                discarded$0 = var5.append((char) var8);
              }
            }
          }
          if (0 != var5.length()) {
            stackIn_28_0 = var5.toString();
            return stackIn_28_0;
          }
          stackIn_26_0 = null;
          return (String) (stackIn_26_0);
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2 = decompiledCaughtException;
          stackIn_31_0 = var2;
          stackIn_31_1 = new StringBuilder().append("ce.L(");
          if (param0 == null) {
            stackIn_32_2 = "null";
          } else {
            stackIn_32_2 = "{...}";
          }
          throw ii.a((Throwable) ((Object) stackIn_31_0), ((StringBuilder) (Object) stackIn_31_1).append(stackIn_32_2).append(',').append(param1).append(')').toString());
        }
    }

    final void c(int param0) {
        gj discarded$3 = null;
        gj discarded$2 = null;
        gj discarded$1 = null;
        gj discarded$0 = null;
        int var2;
        int var3_int;
        gj var3;
        ai var4;
        int var5;
        int var6;
        ai var7;
        ai var8;
        int var3_intLifetime1;
        int var5Lifetime1;
        ai var4Lifetime1;
        boolean decompiledFrameRemainder0 = true;
        var6 = Bounce.field_N;
        var2 = 97 % ((46 - param0) / 34);
        if (this.field_h != null) {
          if (this.b(1) == null) {
            return;
          }
          if (this.field_g) {
            var3_int = 1;
            var4 = this.field_h.a((byte) -126);
            while (var4 != null) {
              var5 = (int)var4.field_d;
              if (this.field_p[var5] == 0) {
                discarded$3 = this.a(1, 255, var5);
              }
              if (this.field_p[var5] == 0) {
                var3_int = 0;
              } else {
                var4.c(2);
              }
              var4 = this.field_h.d((byte) -102);
            }
            while (this.field_s.field_q.length > this.field_w) {
              if (0 == this.field_s.field_q[this.field_w]) {
                this.field_w = this.field_w + 1;
                continue;
              }
              if (this.field_u.field_b < 250) {
                if (0 == this.field_p[this.field_w]) {
                  discarded$2 = this.a(1, 255, this.field_w);
                }
                if (this.field_p[this.field_w] == 0) {
                  var7 = new ai();
                  var7.field_d = (long)this.field_w;
                  var3_int = 0;
                  this.field_h.a(1, var7);
                }
                this.field_w = this.field_w + 1;
                continue;
              }
              var3_int = 0;
              break;
            }
            if ((var3_int != 0)) {
              this.field_g = false;
              this.field_w = 0;
            }
            decompiledFrameRemainder0 = false;
          }
          else {
            if (this.field_d) {
              var3_intLifetime1 = 1;
              var4Lifetime1 = this.field_h.a((byte) -45);
              while (var4Lifetime1 != null) {
                var5Lifetime1 = (int)var4Lifetime1.field_d;
                if (this.field_p[var5Lifetime1] != 1) {
                  discarded$1 = this.a(2, 255, var5Lifetime1);
                }
                if (1 == this.field_p[var5Lifetime1]) {
                  var4Lifetime1.c(2);
                } else {
                  var3_intLifetime1 = 0;
                }
                var4Lifetime1 = this.field_h.d((byte) -47);
              }
              L3: while (true) {
                if (this.field_w < this.field_s.field_q.length) {
                  if (this.field_s.field_q[this.field_w] != 0) {
                    if (this.field_f.b((byte) 90)) {
                      var3_intLifetime1 = 0;
                      break L3;
                    }
                    if (this.field_p[this.field_w] != 1) {
                      discarded$0 = this.a(2, 255, this.field_w);
                    }
                    if (1 != this.field_p[this.field_w]) {
                      var8 = new ai();
                      var8.field_d = (long)this.field_w;
                      this.field_h.a(1, var8);
                      var3_intLifetime1 = 0;
                    }
                  }
                  this.field_w = this.field_w + 1;
                  continue;
                }
                break;
              }
              if ((var3_intLifetime1 != 0)) {
                this.field_d = false;
                this.field_w = 0;
              }
              decompiledFrameRemainder0 = false;
            }
            else {
              this.field_h = null;
            }
          }
        }
        if (this.field_v &&
          this.field_e <= fa.a(75)) {
          var3 = (gj) (this.field_o.b(0));
          while (var3 != null) {
            if (!var3.field_n) {
              if (!var3.field_o) {
                var3.field_o = true;
              } else {
                if (!var3.field_m) {
                  throw new RuntimeException();
                }
                var3.c(2);
              }
            }
            var3 = (gj) (this.field_o.a(-1));
          }
          this.field_e = fa.a(-27) + 1000L;
        }
    }

    final void d(int param0) {
        gj discarded$0 = null;
        gj discarded$1 = null;
        ai var2;
        int var3;
        int var4;
        var4 = Bounce.field_N;
        if (null == this.field_h) {
          return;
        }
        if (null == this.b(1)) {
          return;
        }
        if (param0 != 2348) {
          return;
        }
        var2 = this.field_c.a((byte) -101);
        while (var2 != null) {
          var3 = (int)var2.field_d;
          if (0 <= var3) {
            if (var3 < this.field_s.field_m) {
              if (this.field_s.field_q[var3] == 0) {
                var2.c(2);
              } else {
                if (this.field_p[var3] == 0) {
                  discarded$0 = this.a(1, param0 - 2093, var3);
                }
                if (this.field_p[var3] == -1) {
                  discarded$1 = this.a(2, 255, var3);
                }
                if (this.field_p[var3] == 1) {
                  var2.c(2);
                }
              }
            } else {
              var2.c(2);
            }
          } else {
            var2.c(2);
          }
          var2 = this.field_c.d((byte) -108);
        }
    }

    ce(int param0, vh param1, vh param2, v param3, vi param4, int param5, byte[] param6, int param7, boolean param8) {
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
        this.field_o = new uk(16);
        this.field_w = 0;
        this.field_c = new bc();
        this.field_e = 0L;
        try {
          this.field_k = param1;
          this.field_q = param0;
          if (this.field_k == null) {
            this.field_g = false;
          } else {
            this.field_g = true;
            this.field_h = new bc();
          }
          this.field_j = param7;
          this.field_f = param3;
          stackIn_7_1 = (param8);
          this.field_v = stackIn_7_1;
          this.field_r = param5;
          this.field_m = param6;
          this.field_u = param4;
          this.field_l = param2;
          if (this.field_l != null) {
            this.field_i = (gj) ((Object) this.field_u.a(this.field_q, this.field_l, true));
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var10 = decompiledCaughtException;
          stackIn_12_0 = var10;
          stackIn_12_1 = new StringBuilder().append("ce.<init>(").append(param0).append(',');
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
          throw ii.a((Throwable) ((Object) stackIn_12_0), ((StringBuilder) (Object) stackIn_24_1).append(stackIn_25_2).append(',').append(param7).append(',').append(param8).append(')').toString());
        }
    }

    static {
        field_n = new int[256];
        field_t = "Creating your account";
    }
}
