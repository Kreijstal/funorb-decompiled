/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class bj extends ci {
    private int field_q;
    private int[] field_o;
    static sla field_p;
    private int field_r;
    private int[] field_m;
    private int field_n;
    static ti[] field_s;

    public bj() {
        super(0, true);
        this.field_q = 0;
        this.field_r = 2048;
        this.field_n = 10;
    }

    final int[] c(int param0, int param1) {
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
        int[] var13Lifetime1;
        int[] var13Lifetime1Lifetime1;
        var10 = TombRacer.field_G ? 1 : 0;
        var13 = this.field_i.a((byte) -113, param1);
        var12 = var13;
        var3 = var12;
        if (param0 != 1) {
          this.c(-75);
        }
        boolean decompiledFrameRemainder0 = true;
        if (this.field_i.field_d) {
          var4 = sj.field_b[param1];
          if (this.field_q == 0) {
            var13Lifetime1 = var12;
            var5 = 0;
            var6 = 0;
            L3: while (true) {
              if (this.field_n > var6) {
                if (this.field_o[var6] <= var4 &&
                  var4 < this.field_o[1 + var6]) {
                  if (var4 < this.field_m[var6]) {
                    var5 = 4096;
                    break L3;
                  }
                  lua.a(var13Lifetime1, 0, ns.field_g, var5);
                  return var3;
                }
                var6++;
                continue;
              }
              break;
            }
            lua.a(var13Lifetime1, 0, ns.field_g, var5);
            decompiledFrameRemainder0 = false;
          }
          else {
            var5Lifetime1 = 0;
            while (!(ns.field_g <= var5Lifetime1)) {
              var6Lifetime1 = 0;
              var7 = 0;
              var8 = ht.field_Fb[var5Lifetime1];
              var9 = this.field_q;
              if (var9 != 1) {
                if (var9 != 2) {
                  if (var9 == 3) {
                    var6Lifetime1 = (var8 - var4 >> 1) + 2048;
                  }
                } else {
                  var6Lifetime1 = (var8 + var4 - 4096 >> 1) + 2048;
                }
              } else {
                var6Lifetime1 = var8;
              }
              var11 = 0;
              var9Lifetime1 = var11;
              L8: while (true) {
                if (this.field_n > var11) {
                  if (var6Lifetime1 >= this.field_o[var11] &&
                    this.field_o[var11 + 1] > var6Lifetime1) {
                    if (this.field_m[var11] <= var6Lifetime1) {
                      break L8;
                    }
                    var7 = 4096;
                    break L8;
                  }
                  var11++;
                  continue;
                }
                break;
              }
              var13Lifetime1Lifetime1 = var12;
              var13Lifetime1Lifetime1[var5Lifetime1] = var7;
              var5Lifetime1++;
            }
          }
        }
        return var3;
    }

    final void b(byte param0) {
        this.c(param0 ^ -117);
        if (param0 != 116) {
          this.field_o = (int[]) null;
        }
    }

    private final void c(int param0) {
        int var5 = 0;
        int var6 = TombRacer.field_G ? 1 : 0;
        this.field_o = new int[this.field_n - param0];
        this.field_m = new int[1 + this.field_n];
        int var2 = 0;
        int var3 = 4096 / this.field_n;
        int var4 = var3 * this.field_r >> 12;
        for (var5 = 0; this.field_n > var5; var5++) {
          this.field_o[var5] = var2;
          this.field_m[var5] = var2 + var4;
          var2 = var2 + var3;
        }
        this.field_o[this.field_n] = 4096;
        this.field_m[this.field_n] = this.field_m[0] + 4096;
    }

    public static void a(boolean param0) {
        field_s = null;
        if (!param0) {
          bj.a(true);
        }
        field_p = null;
    }

    final void a(byte param0, uia param1, int param2) {
        int var4_int = 0;
        int var5 = 0;
        RuntimeException stackIn_13_0 = null;
        StringBuilder stackIn_13_1 = null;
        String stackIn_14_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var4 = null;
        var5 = TombRacer.field_G ? 1 : 0;
        try {
          var4_int = param2;
          if (var4_int == 0) {
            this.field_n = param1.h(255);
          } else {
            if (var4_int == 1) {
              this.field_r = param1.d(121);
            } else {
              if (2 == var4_int) {
                this.field_q = param1.h(255);
              }
            }
          }
          if (param0 != 107) {
            this.field_q = 15;
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var4 = decompiledCaughtException;
          stackIn_13_0 = var4;
          stackIn_13_1 = new StringBuilder().append("bj.A(").append(param0).append(',');
          if (param1 == null) {
            stackIn_14_2 = "null";
          } else {
            stackIn_14_2 = "{...}";
          }
          throw tba.a((Throwable) ((Object) stackIn_13_0), ((StringBuilder) (Object) stackIn_13_1).append(stackIn_14_2).append(',').append(param2).append(')').toString());
        }
    }

    static {
        int var0 = 0;
        field_p = new sla();
        field_s = new ti[255];
        for (var0 = 0; var0 < field_s.length; var0++) {
          field_s[var0] = new ti();
        }
    }
}
