/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class hk extends le {
    static String field_i;
    private int field_j;

    final void a(int param0, int param1, ds param2) {
        RuntimeException stackIn_8_0 = null;
        StringBuilder stackIn_8_1 = null;
        RuntimeException stackIn_9_0 = null;
        StringBuilder stackIn_9_1 = null;
        String stackIn_9_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var4 = null;
        try {
          L0: {
            L1: {
              if (param1 <= -60) {
                break L1;
              } else {
                field_i = (String) null;
                break L1;
              }
            }
            L2: {
              if (0 == param0) {
                this.field_j = param2.e(1869);
                break L2;
              } else {
                break L2;
              }
            }
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L3: {
            var4 = decompiledCaughtException;
            stackIn_8_0 = (RuntimeException) (var4);

            stackIn_8_1 = new StringBuilder().append("hk.F(").append(param0).append(',').append(param1).append(',');

            if (param2 == null) {
              stackIn_9_0 = (RuntimeException) ((Object) stackIn_8_0);
              stackIn_9_1 = (StringBuilder) ((Object) stackIn_8_1);
              stackIn_9_2 = "null";
              break L3;
            } else {
              stackIn_9_0 = (RuntimeException) ((Object) stackIn_8_0);
              stackIn_9_1 = (StringBuilder) ((Object) stackIn_8_1);
              stackIn_9_2 = "{...}";
              break L3;
            }
          }
          throw rta.a((Throwable) ((Object) stackIn_9_0), stackIn_9_2 + ')');
        }
    }

    final int[] a(int param0, boolean param1) {
        int stackIn_9_0 = 0;
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
        var16 = VoidHunters.field_G;
        if (param1) {
          L0: {
            var17 = this.field_f.a((byte) 124, param0);
            var3 = var17;
            if (this.field_f.field_e) {
              var25 = this.a(0, wf.field_d & -1 + param0, 255);
              var5 = this.a(0, param0, 255);
              var24 = this.a(0, wf.field_d & param0 - -1, 255);
              var7 = 0;
              L1: while (true) {
                if (var7 >= hob.field_d) {
                  break L0;
                } else {
                  L2: {
                    var8 = this.field_j * (var24[var7] - var25[var7]);
                    var9 = (-var5[gbb.field_q & -1 + var7] + var5[var7 - -1 & gbb.field_q]) * this.field_j;
                    var10 = var9 >> -1225116564;
                    var11 = var8 >> 1949747916;
                    var12 = var10 * var10 >> -692120020;
                    var13 = var11 * var11 >> -1210841460;
                    var14 = (int)(4096.0 * Math.sqrt((double)((float)(4096 + (var13 + var12)) / 4096.0f)));
                    if (var14 != 0) {
                      stackIn_9_0 = 16777216 / var14;
                      break L2;
                    } else {
                      stackIn_9_0 = 0;
                      break L2;
                    }
                  }
                  var15 = stackIn_9_0;
                  var17[var7] = 4096 + -var15;
                  var7++;
                  continue L1;
                }
              }
            } else {
              break L0;
            }
          }
          return var17;
        } else {
          return (int[]) null;
        }
    }

    final static void b(int param0, int param1) {
        nrb.field_b = new pgb[param0 * 15];
        if (param1 > -90) {
            field_i = (String) null;
        }
        ou.field_q = 0;
        dca.field_q = new int[3];
        hab.field_k = param0;
    }

    public static void d(int param0) {
        field_i = null;
        if (param0 != -1210841460) {
            field_i = (String) null;
        }
    }

    public hk() {
        super(1, true);
        this.field_j = 4096;
    }

    static {
        field_i = "Enter name of friend to add to list";
    }
}
