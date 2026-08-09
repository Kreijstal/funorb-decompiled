/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class gia extends ci {
    private int field_r;
    static String field_o;
    private int field_n;
    private int field_p;
    static String field_q;
    private int[] field_m;

    final void b(int param0, int param1, int param2) {
        int var4 = 0;
        super.b(param0, param1, param2);
        if ((this.field_n ^ -1) <= -1 && null != qw.field_j) {
            var4 = !qw.field_j.a((byte) -122, this.field_n).field_g ? 128 : 64;
            this.field_m = qw.field_j.a(14907, this.field_n, false, var4, 1.0f, var4);
            this.field_p = var4;
            this.field_r = var4;
        }
    }

    public static void c(int param0) {
        field_o = null;
        field_q = null;
        if (param0 != -26382) {
            gia.c(102);
        }
    }

    final int c(byte param0) {
        if (param0 != -117) {
            this.field_m = (int[]) null;
        }
        return this.field_n;
    }

    final void b(int param0) {
        if (param0 > -32) {
            return;
        }
        super.b(-116);
        this.field_m = null;
    }

    public gia() {
        super(0, false);
        this.field_n = -1;
    }

    final void a(byte param0, uia param1, int param2) {
        RuntimeException stackIn_8_0 = null;
        StringBuilder stackIn_8_1 = null;
        RuntimeException stackIn_9_0 = null;
        StringBuilder stackIn_9_1 = null;
        String stackIn_9_2 = null;
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var4 = null;
        try {
          L0: {
            if (param0 == 107) {
              L1: {
                if (0 == param2) {
                  this.field_n = param1.d(122);
                  break L1;
                } else {
                  break L1;
                }
              }
              decompiledRegionSelector0 = 1;
              break L0;
            } else {
              decompiledRegionSelector0 = 0;
              break L0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L2: {
            var4 = decompiledCaughtException;
            stackIn_8_0 = (RuntimeException) (var4);

            stackIn_8_1 = new StringBuilder().append("gia.A(").append(param0).append(',');

            if (param1 == null) {
              stackIn_9_0 = (RuntimeException) ((Object) stackIn_8_0);
              stackIn_9_1 = (StringBuilder) ((Object) stackIn_8_1);
              stackIn_9_2 = "null";
              break L2;
            } else {
              stackIn_9_0 = (RuntimeException) ((Object) stackIn_8_0);
              stackIn_9_1 = (StringBuilder) ((Object) stackIn_8_1);
              stackIn_9_2 = "{...}";
              break L2;
            }
          }
          throw tba.a((Throwable) ((Object) stackIn_9_0), stackIn_9_2 + ',' + param2 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return;
        } else {
          return;
        }
    }

    final int[][] b(int param0, int param1) {
        int incrementValue$0 = 0;
        int stackIn_6_0 = 0;
        int[][] var3;
        int var4;
        int[] var5;
        int[] var6;
        int[] var7;
        int var8;
        int var9;
        int var10;
        int var11;
        int[][] var12;
        int[][] var13;
        int[][] var14;
        var11 = TombRacer.field_G ? 1 : 0;
        if (param1 == -1) {
          L0: {
            var14 = this.field_h.a(param0, (byte) 124);
            var13 = var14;
            var12 = var13;
            var3 = var12;
            if (!this.field_h.field_f) {
              break L0;
            } else {
              L1: {
                if (qda.field_i == this.field_p) {
                  stackIn_6_0 = param0;
                  break L1;
                } else {
                  stackIn_6_0 = this.field_p * param0 / qda.field_i;
                  break L1;
                }
              }
              var4 = stackIn_6_0 * this.field_r;
              var5 = var14[0];
              var6 = var14[1];
              var7 = var14[2];
              if (this.field_r != ns.field_g) {
                var8 = 0;
                L2: while (true) {
                  if (ns.field_g <= var8) {
                    break L0;
                  } else {
                    var9 = var8 * this.field_r / ns.field_g;
                    var10 = this.field_m[var4 - -var9];
                    var7[var8] = sea.c(var10, 255) << -713475132;
                    var6[var8] = sea.c(var10, 65280) >> -1564428764;
                    var5[var8] = sea.c(16711680, var10) >> -1466471540;
                    var8++;
                    continue L2;
                  }
                }
              } else {
                var8 = 0;
                L3: while (true) {
                  if (var8 >= ns.field_g) {
                    break L0;
                  } else {
                    incrementValue$0 = var4;
                    var4++;
                    var9 = this.field_m[incrementValue$0];
                    var7[var8] = sea.c(4080, var9 << 92946724);
                    var6[var8] = sea.c(4080, var9 >> -598928700);
                    var5[var8] = sea.c(4080, var9 >> 880153548);
                    var8++;
                    continue L3;
                  }
                }
              }
            }
          }
          return var3;
        } else {
          return (int[][]) null;
        }
    }

    static {
        field_o = "<%0> has lost connection.";
    }
}
