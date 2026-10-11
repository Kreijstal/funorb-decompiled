/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class hda extends k {
    private int field_k;
    static int field_o;
    private int[] field_p;
    private int field_m;
    private int[] field_q;
    static String field_l;
    private int field_n;

    final static void a(byte param0, boolean param1) {
        if (param0 != -91) {
          hda.a((byte) 27, true);
        }
        if (null != jja.field_m) {
          gp.b(-25942, jja.field_m);
        }
        if (ms.field_u != null) {
          ms.field_u.a((byte) -120, param1);
        }
        bga.a(param0 ^ 10043, param1);
        if (null != wt.field_n) {
          wt.field_n.a(param1, 7802);
        }
        vja.a((byte) 88, param1);
    }

    final void a(byte param0, lu param1, int param2) {
        int var4_int = 0;
        int var5 = 0;
        RuntimeException stackIn_14_0 = null;
        StringBuilder stackIn_14_1 = null;
        String stackIn_15_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var4 = null;
        var5 = BachelorFridge.field_y;
        try {
          if (param0 != -71) {
            hda.e(36);
          }
          var4_int = param2;
          if (var4_int != 0) {
            if (var4_int == 1) {
              this.field_n = param1.e((byte) 119);
            } else {
              if (var4_int == 2) {
                this.field_m = param1.b(16711935);
              }
            }
          } else {
            this.field_k = param1.b(16711935);
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var4 = decompiledCaughtException;
          stackIn_14_0 = var4;
          stackIn_14_1 = new StringBuilder().append("hda.E(").append(param0).append(',');
          if (param1 == null) {
            stackIn_15_2 = "null";
          } else {
            stackIn_15_2 = "{...}";
          }
          throw pe.a((Throwable) ((Object) stackIn_14_0), ((StringBuilder) (Object) stackIn_14_1).append(stackIn_15_2).append(',').append(param2).append(')').toString());
        }
    }

    public static void e(int param0) {
        int var1 = 7 % ((param0 - 52) / 62);
        field_l = null;
    }

    final int[] a(int param0, int param1) {
        int[] var3;
        int var4;
        int var5;
        int var6;
        int var7;
        int var8;
        int var9;
        int var10;
        int var11;
        int[] var12;
        int[] var13;
        int var5Lifetime1;
        int var6Lifetime1;
        int var9Lifetime1;
        boolean decompiledFrameRemainder0 = true;
        var10 = BachelorFridge.field_y;
        var13 = this.field_j.a(param0, -1);
        var12 = var13;
        var3 = var12;
        if (this.field_j.field_m) {
          var4 = tj.field_f[param0];
          if (0 == this.field_m) {
            var5 = 0;
            var6 = 0;
            L2: while (true) {
              if (var6 < this.field_k) {
                if (var4 >= this.field_q[var6] &&
                  this.field_q[1 + var6] > var4) {
                  if (this.field_p[var6] <= var4) {
                    break L2;
                  }
                  var5 = 4096;
                  break L2;
                }
                var6++;
                continue;
              }
              break;
            }
            bl.a(var13, 0, hh.field_d, var5);
            decompiledFrameRemainder0 = false;
          }
          else {
            var5Lifetime1 = 0;
            while (!(var5Lifetime1 >= hh.field_d)) {
              var6Lifetime1 = 0;
              var7 = 0;
              var8 = jq.field_k[var5Lifetime1];
              var9 = this.field_m;
              if (var9 != 1) {
                if (2 != var9) {
                  if (var9 == 3) {
                    var6Lifetime1 = (var8 - var4 >> 1) + 2048;
                  }
                } else {
                  var6Lifetime1 = (var8 - (-var4 + 4096) >> 1) + 2048;
                }
              } else {
                var6Lifetime1 = var8;
              }
              var11 = 0;
              var9Lifetime1 = var11;
              L7: while (true) {
                if (var11 < this.field_k) {
                  if (this.field_q[var11] <= var6Lifetime1 &&
                    var6Lifetime1 < this.field_q[1 + var11]) {
                    if (this.field_p[var11] <= var6Lifetime1) {
                      break L7;
                    }
                    var7 = 4096;
                    break L7;
                  }
                  var11++;
                  continue;
                }
                break;
              }
              var13 = var12;
              var13[var5Lifetime1] = var7;
              var5Lifetime1++;
            }
          }
        }
        if (param1 != 0) {
          this.a(-64, -61);
        }
        return var3;
    }

    public hda() {
        super(0, true);
        this.field_k = 10;
        this.field_n = 2048;
        this.field_m = 0;
    }

    private final void d(int param0) {
        int var5 = 0;
        int var6 = BachelorFridge.field_y;
        this.field_q = new int[this.field_k + 1];
        int var2 = 0;
        this.field_p = new int[this.field_k + 1];
        int var3 = 4096 / this.field_k;
        if (param0 != 2048) {
          return;
        }
        int var4 = var3 * this.field_n >> 12;
        for (var5 = 0; var5 < this.field_k; var5++) {
          this.field_q[var5] = var2;
          this.field_p[var5] = var4 + var2;
          var2 = var2 + var3;
        }
        this.field_q[this.field_k] = 4096;
        this.field_p[this.field_k] = this.field_p[0] + 4096;
    }

    final static void a(int param0, kia param1, boolean param2, int param3) {
        Object var4 = null;
        RuntimeException stackIn_20_0 = null;
        StringBuilder stackIn_20_1 = null;
        String stackIn_21_2 = null;
        Throwable decompiledCaughtException = null;
        Object var4_ref = null;
        RuntimeException var4_ref2 = null;
        try {
          if (param0 != -1) {
            field_l = (String) null;
          }
          if (kw.field_j != null) {
            uka.a(1048576, param1, param3, param2, (byte) -112);
          }
          if (null != uf.field_c) {
            var4_ref = lc.field_l;
            synchronized (var4_ref) {
              uf.field_c.a(-1, param3, (byte) -107);
              if (param1 == uw.field_o) {
                return;
              }
              uf.field_c.b(true);
              lc.field_l.c();
              uw.field_o = param1;
              if (uw.field_o != null) {
                uf.field_c.a(uw.field_o, (byte) -115, param2);
              }
            }
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var4_ref2 = (RuntimeException) (Object) decompiledCaughtException;
          stackIn_20_0 = var4_ref2;
          stackIn_20_1 = new StringBuilder().append("hda.F(").append(param0).append(',');
          if (param1 == null) {
            stackIn_21_2 = "null";
          } else {
            stackIn_21_2 = "{...}";
          }
          throw pe.a((Throwable) ((Object) stackIn_20_0), ((StringBuilder) (Object) stackIn_20_1).append(stackIn_21_2).append(',').append(param2).append(',').append(param3).append(')').toString());
        }
    }

    final void d(byte param0) {
        if (param0 != -68) {
          return;
        }
        this.d(2048);
    }

    static {
        field_o = -1;
    }
}
