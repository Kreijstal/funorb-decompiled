/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class jd extends vc {
    private int field_j;
    private long[] field_l;
    private long field_k;
    static String field_i;
    private int field_m;
    private long field_n;
    private long field_h;

    final static void a(int param0, fa param1, fa param2) {
        try {
          if (param0 < 106) {
            jd.a(-74, (fa) null, (fa) null);
          }
          sj.field_f = param1;
          dm.field_d = param2;
        } catch (RuntimeException runtimeException) {
          throw qk.a((Throwable) ((Object) runtimeException), "jd.C(" + param0 + ',' + (param1 != null ? "{...}" : "null") + ',' + (param2 != null ? "{...}" : "null") + ')');
        }
    }

    final long a(int param0) {
        this.field_n = this.field_n + this.a((byte) -82);
        if (param0 <= 39) {
          return 8L;
        }
        if (this.field_n < this.field_k) {
          return (-this.field_n + this.field_k) / 1000000L;
        }
        return 0L;
    }

    final int a(int param0, long param1) {
        int var4;
        int var5;
        int stackIn_6_0 = 0;
        var5 = Terraphoenix.field_V;
        if (param0 != 0) {
          return 3;
        }
        if (this.field_n < this.field_k) {
          this.field_h = this.field_h + (this.field_k - this.field_n);
          this.field_n = this.field_n + (this.field_k - this.field_n);
          this.field_k = this.field_k + param1;
          return 1;
        }
        var4 = 0;
        L0: while (true) {
          this.field_k = this.field_k + param1;
          var4++;
          stackIn_6_0 = 10;
          do {
            if (stackIn_6_0 > var4 &&
              this.field_n > this.field_k) {
              continue L0;
            }
            stackIn_6_0 = $cfr$lcmp(this.field_k, this.field_n);
          } while (var5 != 0);
          break;
        }
        if (stackIn_6_0 >= 0) {
          return var4;
        }
        this.field_k = this.field_n;
        return var4;
    }

    final static void a(boolean param0, int param1) {
        uf var2 = null;
        int var3 = 0;
        cc var4 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var2_ref = null;
        var3 = Terraphoenix.field_V;
        try {
          var4 = (cc) (qb.field_a.d(9272));
          do {
            if (var4 == null) {
              if (param0) {
                jd.d(116);
              }
              break;
            }
            ia.a(param1, var4, -118);
            var4 = (cc) (qb.field_a.e((byte) -119));
          } while (var3 == 0);
          var2 = qc.field_a.d(9272);
          while (var2 != null) {
            da.a(0, param1);
            var2 = qc.field_a.e((byte) -119);
            if (var3 != 0) {
              return;
            }
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2_ref = decompiledCaughtException;
          throw qk.a((Throwable) ((Object) var2_ref), "jd.D(" + param0 + ',' + param1 + ')');
        }
    }

    private final long a(byte param0) {
        long var2 = 0L;
        long var4 = 0L;
        long var6 = 0L;
        int var8 = 0;
        int var9 = 0;
        long var6Lifetime1;
        int var8Lifetime1;
        var9 = Terraphoenix.field_V;
        var2 = System.nanoTime();
        var4 = -this.field_h + var2;
        this.field_h = var2;
        if (var4 > -5000000000L) {
          if (5000000000L <= var4) {
            var6 = 0L;
            var8 = 1;
            while (true) {
              if (this.field_m < var8) {
                if (param0 >= -29) {
                  jd.a(69, (fa) null, (fa) null);
                }
                return var6 / (long)this.field_m;
              }
              var6 = var6 + this.field_l[(10 + (this.field_j - var8)) % 10];
              var8++;
              if (var9 != 0) {
                return var6 / (long)this.field_m;
              }
            }
          }
          this.field_l[this.field_j] = var4;
          if (this.field_m < 1) {
            this.field_m = this.field_m + 1;
          }
          this.field_j = (1 + this.field_j) % 10;
        }
        var6Lifetime1 = 0L;
        var8Lifetime1 = 1;
        while (true) {
          if (this.field_m >= var8Lifetime1) {
            var6Lifetime1 = var6Lifetime1 + this.field_l[(10 + (this.field_j - var8Lifetime1)) % 10];
            var8Lifetime1++;
            if (var9 == 0) {
              continue;
            }
            break;
          }
          if (param0 >= -29) {
            jd.a(69, (fa) null, (fa) null);
            return var6Lifetime1 / (long)this.field_m;
          }
          break;
        }
        return var6Lifetime1 / (long)this.field_m;
    }

    final static void a(int param0, byte param1, boolean param2, int param3) {
        int var4;
        int var4Lifetime1;
        if (param1 < -21) {
          uf.field_f.b(param3, param0);
          if (!param2) {
            return;
          }
          var4 = 2 * (el.field_e % uf.field_f.field_r);
          if (var4 >= uf.field_f.field_r) {
            var4 = uf.field_f.field_r - var4 + uf.field_f.field_r;
          }
          if (var4 < 10) {
            var4 = 10;
            if ((Terraphoenix.field_V != 0) &&
              (var4 > -40 + uf.field_f.field_r)) {
              var4 = -40 + uf.field_f.field_r;
            }
          } else {
            if (var4 > -40 + uf.field_f.field_r) {
              var4 = -40 + uf.field_f.field_r;
            }
          }
          lm.a(param3, 30, uf.field_f, 0, (byte) 126, param0, var4, 0, 80);
          return;
        }
        jd.a(false, -74);
        uf.field_f.b(param3, param0);
        if (!param2) {
          return;
        }
        var4Lifetime1 = 2 * (el.field_e % uf.field_f.field_r);
        if (var4Lifetime1 >= uf.field_f.field_r) {
          var4Lifetime1 = uf.field_f.field_r - var4Lifetime1 + uf.field_f.field_r;
        }
        if (var4Lifetime1 < 10) {
          var4Lifetime1 = 10;
          if ((Terraphoenix.field_V != 0) &&
            (var4Lifetime1 > -40 + uf.field_f.field_r)) {
            var4Lifetime1 = -40 + uf.field_f.field_r;
          }
        } else {
          if (var4Lifetime1 > -40 + uf.field_f.field_r) {
            var4Lifetime1 = -40 + uf.field_f.field_r;
          }
        }
        lm.a(param3, 30, uf.field_f, 0, (byte) 126, param0, var4Lifetime1, 0, 80);
    }

    final void b(int param0) {
        this.field_h = (long)param0;
        if (this.field_k > this.field_n) {
          this.field_n = this.field_n + (this.field_k - this.field_n);
          return;
        }
    }

    public static void d(int param0) {
        if (param0 != 1) {
          field_i = (String) null;
          field_i = null;
          return;
        }
        field_i = null;
    }

    final static void a(dc param0, byte param1) {
        int dupTemp$0 = 0;
        int dupTemp$1 = 0;
        int incrementValue$2 = 0;
        int fieldTemp$3 = 0;
        int stackIn_11_0 = 0;
        int stackIn_11_1 = 0;
        int stackIn_27_0 = 0;
        RuntimeException stackIn_31_0 = null;
        StringBuilder stackIn_31_1 = null;
        String stackIn_32_2 = null;
        RuntimeException decompiledCaughtException = null;
        int var2_int = 0;
        RuntimeException var2 = null;
        int var3 = 0;
        int var4 = 0;
        int var5 = 0;
        var5 = Terraphoenix.field_V;
        try {
          var2_int = 0;
          do {
            if (var2_int >= 3) {
              var2_int = 0;
              break;
            }
            je.field_a[var2_int] = 0;
            var2_int++;
          } while (var5 == 0);
          L4: while (true) {
            boolean decompiledFrameRemainder1 = true;
            if (var2_int < am.field_J) {
              stackIn_11_0 = ra.field_i[var2_int].field_l;
              stackIn_11_1 = param0.field_l;
              if (var5 != 0) {
                if (stackIn_11_0 <= stackIn_11_1) {
                  break L4;
                }
                decompiledFrameRemainder1 = false;
              }
              else {
                if (stackIn_11_0 == stackIn_11_1) {
                  dupTemp$0 = ra.field_i[var2_int].a(2);
                  je.field_a[dupTemp$0] = je.field_a[dupTemp$0] + 1;
                }
                var2_int++;
                continue;
              }
            }
            if ((decompiledFrameRemainder1) &&
              (param1 <= -93)) {
              break L4;
            }
            field_i = (String) null;
            break;
          }
          dupTemp$1 = param0.a(2);
          je.field_a[dupTemp$1] = je.field_a[dupTemp$1] + 1;
          var2_int = 0;
          var3 = 0;
          boolean decompiledNaturalLoopExit0 = false;
          while (!(decompiledNaturalLoopExit0 = (!(var3 < am.field_J)))) {
            stackIn_27_0 = ~param0.field_l;
            if (var5 == 0) {
              boolean decompiledFrameRemainder0 = true;
              if (stackIn_27_0 == ~ra.field_i[var3].field_l) {
                var4 = ra.field_i[var3].a(2);
                if (bl.field_f < je.field_a[var4]) {
                  je.field_a[var4] = je.field_a[var4] - 1;
                  decompiledFrameRemainder0 = false;
                }
              }
              if (decompiledFrameRemainder0) {
                incrementValue$2 = var2_int;
                var2_int++;
                ra.field_i[incrementValue$2] = ra.field_i[var3];
              }
              var3++;
              continue;
            }
            break;
          }
          if (decompiledNaturalLoopExit0) {
            stackIn_27_0 = var2_int;
          }
          am.field_J = stackIn_27_0;
          fieldTemp$3 = am.field_J;
          am.field_J = am.field_J + 1;
          ra.field_i[fieldTemp$3] = param0;
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2 = decompiledCaughtException;
          stackIn_31_0 = var2;
          stackIn_31_1 = new StringBuilder().append("jd.H(");
          if (param0 == null) {
            stackIn_32_2 = "null";
          } else {
            stackIn_32_2 = "{...}";
          }
          throw qk.a((Throwable) ((Object) stackIn_31_0), ((StringBuilder) (Object) stackIn_31_1).append(stackIn_32_2).append(',').append(param1).append(')').toString());
        }
    }

    jd() {
        this.field_k = 0L;
        this.field_l = new long[10];
        this.field_j = 0;
        this.field_n = 0L;
        this.field_h = 0L;
        this.field_m = 1;
        this.field_n = System.nanoTime();
        this.field_k = System.nanoTime();
    }

    static {
        field_i = "This password contains your Player Name, and would be easy to guess";
    }

    /* Full JVM integer arguments; original narrow signature preserved. */
    final static void $cfr$intArgs$a$c79a3df4369d(int param0, int param1, boolean param2, int param3) {
        int var4;
        int var4Lifetime1;
        if (param1 < -21) {
          uf.field_f.b(param3, param0);
          if (!param2) {
            return;
          }
          var4 = 2 * (el.field_e % uf.field_f.field_r);
          if (var4 >= uf.field_f.field_r) {
            var4 = uf.field_f.field_r - var4 + uf.field_f.field_r;
          }
          if (var4 < 10) {
            var4 = 10;
            if ((Terraphoenix.field_V != 0) &&
              (var4 > -40 + uf.field_f.field_r)) {
              var4 = -40 + uf.field_f.field_r;
            }
          } else {
            if (var4 > -40 + uf.field_f.field_r) {
              var4 = -40 + uf.field_f.field_r;
            }
          }
          lm.a(param3, 30, uf.field_f, 0, (byte) 126, param0, var4, 0, 80);
          return;
        }
        jd.a(false, -74);
        uf.field_f.b(param3, param0);
        if (!param2) {
          return;
        }
        var4Lifetime1 = 2 * (el.field_e % uf.field_f.field_r);
        if (var4Lifetime1 >= uf.field_f.field_r) {
          var4Lifetime1 = uf.field_f.field_r - var4Lifetime1 + uf.field_f.field_r;
        }
        if (var4Lifetime1 < 10) {
          var4Lifetime1 = 10;
          if ((Terraphoenix.field_V != 0) &&
            (var4Lifetime1 > -40 + uf.field_f.field_r)) {
            var4Lifetime1 = -40 + uf.field_f.field_r;
          }
        } else {
          if (var4Lifetime1 > -40 + uf.field_f.field_r) {
            var4Lifetime1 = -40 + uf.field_f.field_r;
          }
        }
        lm.a(param3, 30, uf.field_f, 0, (byte) 126, param0, var4Lifetime1, 0, 80);
    }

    private static int $cfr$lcmp(long left, long right) {
        return left < right ? -1 : (left == right ? 0 : 1);
    }
}
