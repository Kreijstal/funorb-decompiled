/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class go extends ci {
    static int[] field_m;
    private int field_n;

    final static int e(int param0, int param1, int param2) {
        if (param0 != -1) {
            return 4;
        }
        int var3 = param1 >>> -749859809;
        return (var3 + param1) / param2 - var3;
    }

    public go() {
        super(1, true);
        this.field_n = 4096;
    }

    final static boolean d(int param0, int param1, int param2) {
        if (param2 != 26205) {
            go.e(-33, 75, 49);
        }
        return (param1 & 256) != 0 ? true : false;
    }

    public static void d(byte param0) {
        field_m = null;
        if (param0 >= -85) {
            field_m = (int[]) null;
        }
    }

    final int[] c(int param0, int param1) {
        int stackIn_7_0 = 0;
        int[] var3;
        int[] var5;
        int var7;
        int var8;
        int var9;
        int var10;
        int var11;
        int var12;
        int var13;
        int var14;
        int var15;
        int var16;
        int[] var17;
        int[] var24;
        int[] var25;
        L0: {
          var16 = TombRacer.field_G ? 1 : 0;
          var17 = this.field_i.a((byte) 80, param1);
          var3 = var17;
          if (this.field_i.field_d) {
            var24 = this.c(0, -73, -1 + param1 & hba.field_b);
            var5 = this.c(0, -112, param1);
            var25 = this.c(0, -47, param1 + 1 & hba.field_b);
            var7 = 0;
            L1: while (true) {
              if (var7 >= ns.field_g) {
                break L0;
              } else {
                L2: {
                  var8 = (-var24[var7] + var25[var7]) * this.field_n;
                  var9 = this.field_n * (-var5[una.field_b & var7 - 1] + var5[1 + var7 & una.field_b]);
                  var10 = var9 >> 1524452236;
                  var11 = var8 >> -791331572;
                  var12 = var10 * var10 >> -1730752852;
                  var13 = var11 * var11 >> -1609901940;
                  var14 = (int)(4096.0 * Math.sqrt((double)((float)(var13 + var12 + 4096) / 4096.0f)));
                  if (var14 == 0) {
                    var17 = var3;
                    stackIn_7_0 = 0;
                    break L2;
                  } else {
                    stackIn_7_0 = 16777216 / var14;
                    break L2;
                  }
                }
                var17 = var3;
                var15 = stackIn_7_0;
                var17[var7] = 4096 - var15;
                var7++;
                continue L1;
              }
            }
          } else {
            break L0;
          }
        }
        L3: {
          if (param0 == 1) {
            break L3;
          } else {
            this.c(-51, 114);
            break L3;
          }
        }
        return var17;
    }

    final void a(byte param0, uia param1, int param2) {
        if (param0 != 107) {
            return;
        }
        try {
            if (-1 == (param2 ^ -1)) {
                this.field_n = param1.d(124);
            }
        } catch (RuntimeException runtimeException) {
            throw tba.a((Throwable) ((Object) runtimeException), "go.A(" + param0 + ',' + (param1 != null ? "{...}" : "null") + ',' + param2 + ')');
        }
    }

    static {
        field_m = new int[]{200, 224, 300, 200, 230, 292};
    }
}
