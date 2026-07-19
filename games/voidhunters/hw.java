/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class hw {
    private int field_a;
    static asb field_e;
    private long[] field_c;
    static int[][] field_d;
    static int field_b;

    public static void a(int param0) {
        if (param0 != -1) {
            return;
        }
        field_d = (int[][]) null;
        field_e = null;
    }

    final void a(long param0, byte param1) {
        int fieldTemp$2 = this.field_a;
        this.field_a = this.field_a + 1;
        this.field_c[fieldTemp$2] = param0;
        if (param1 != -115) {
          return;
        } else {
          L0: {
            if (this.field_a >= this.field_c.length) {
              this.field_a = 0;
              break L0;
            } else {
              break L0;
            }
          }
          return;
        }
    }

    final void a(int param0, int param1, int param2, int param3, int param4) {
        int var6 = 0;
        long var7 = 0L;
        int var9 = 0;
        int var10 = 0;
        int var11 = 0;
        int var12 = 0;
        int var13 = 0;
        long var14 = 0L;
        int var16 = 0;
        int var17 = 0;
        L0: {
          var17 = VoidHunters.field_G;
          var6 = 500;
          if (var6 == this.field_c.length) {
            break L0;
          } else {
            this.field_c = new long[var6];
            if (this.field_c.length <= this.field_a) {
              this.field_a = 0;
              break L0;
            } else {
              param3 = param3 + param0;
              var7 = 40000000L;
              var9 = param4;
              var10 = param3;
              var11 = 16711935;
              var12 = 0;
              L1: while (true) {
                if (this.field_c.length <= var12) {
                  if (param1 >= 88) {
                    cka.a(-1, "Currentval=" + this.field_c[(-1 + (this.field_c.length + this.field_a)) % this.field_c.length] / 1000L, var11, -(param0 / 2) + param3, param2 + param4, 4266);
                    cka.a(-1, "Maxval=" + var7 / 1000L, var11, 20 + -(param0 / 2) + param3, param2 + param4, 4266);
                    return;
                  } else {
                    this.a(13L, (byte) 97);
                    cka.a(-1, "Currentval=" + this.field_c[(-1 + (this.field_c.length + this.field_a)) % this.field_c.length] / 1000L, var11, -(param0 / 2) + param3, param2 + param4, 4266);
                    cka.a(-1, "Maxval=" + var7 / 1000L, var11, 20 + -(param0 / 2) + param3, param2 + param4, 4266);
                    return;
                  }
                } else {
                  L2: {
                    var13 = param2 * var12 / this.field_c.length + param4;
                    var14 = this.field_c[var12];
                    var16 = -(int)(var14 * (long)param0 / var7) + param3;
                    if (var12 == this.field_a) {
                      c.a(10 + param3, var13, var13, param3, -16777216, 16711680);
                      break L2;
                    } else {
                      break L2;
                    }
                  }
                  L3: {
                    if (-1 <= (var12 ^ -1)) {
                      break L3;
                    } else {
                      c.a(var16, var13, var9, var10, -16777216, var11);
                      break L3;
                    }
                  }
                  var10 = var16;
                  var9 = var13;
                  var12++;
                  continue L1;
                }
              }
            }
          }
        }
        param3 = param3 + param0;
        var7 = 40000000L;
        var9 = param4;
        var10 = param3;
        var11 = 16711935;
        var12 = 0;
        L4: while (true) {
          if (this.field_c.length <= var12) {
            if (param1 < 88) {
              this.a(13L, (byte) 97);
              cka.a(-1, "Currentval=" + this.field_c[(-1 + (this.field_c.length + this.field_a)) % this.field_c.length] / 1000L, var11, -(param0 / 2) + param3, param2 + param4, 4266);
              cka.a(-1, "Maxval=" + var7 / 1000L, var11, 20 + -(param0 / 2) + param3, param2 + param4, 4266);
              return;
            } else {
              cka.a(-1, "Currentval=" + this.field_c[(-1 + (this.field_c.length + this.field_a)) % this.field_c.length] / 1000L, var11, -(param0 / 2) + param3, param2 + param4, 4266);
              cka.a(-1, "Maxval=" + var7 / 1000L, var11, 20 + -(param0 / 2) + param3, param2 + param4, 4266);
              return;
            }
          } else {
            L5: {
              var13 = param2 * var12 / this.field_c.length + param4;
              var14 = this.field_c[var12];
              var16 = -(int)(var14 * (long)param0 / var7) + param3;
              if (var12 == this.field_a) {
                c.a(10 + param3, var13, var13, param3, -16777216, 16711680);
                break L5;
              } else {
                break L5;
              }
            }
            L6: {
              if (-1 <= (var12 ^ -1)) {
                break L6;
              } else {
                c.a(var16, var13, var9, var10, -16777216, var11);
                break L6;
              }
            }
            var10 = var16;
            var9 = var13;
            var12++;
            continue L4;
          }
        }
    }

    hw() {
        this.field_a = 0;
        this.field_c = new long[500];
    }

    static {
        field_d = new int[1][0];
        field_b = 0;
    }
}
