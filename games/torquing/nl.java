/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class nl extends am {
    private int field_x;
    static boolean[] field_y;
    private int field_w;
    private int field_t;
    static String field_u;
    static vn field_s;
    private int[] field_v;

    final int[] a(byte param0, int param1) {
        int[] var3 = null;
        int var4 = 0;
        int var5 = 0;
        int var6 = 0;
        int var7 = 0;
        int[] var9 = null;
        int var11 = 0;
        int var12 = 0;
        int var13 = 0;
        int var14 = 0;
        int var15 = 0;
        int var16 = 0;
        int var17 = 0;
        int[] var18 = null;
        int[] var21 = null;
        int[] var22 = null;
        var17 = Torquing.field_u;
        var18 = ((nl) this).field_l.a(param1, 25657);
        var3 = var18;
        if (((nl) this).field_l.field_b) {
          var7 = ff.field_b * ((nl) this).field_t >> 12;
          var22 = ((nl) this).b(0, 0, vp.field_I & -1 + param1);
          var9 = ((nl) this).b(0, 0, param1);
          var21 = ((nl) this).b(0, 0, param1 + 1 & vp.field_I);
          var11 = 0;
          L0: while (true) {
            if (ci.field_c <= var11) {
              if (param0 < 86) {
                int[] discarded$2 = ((nl) this).a((byte) 107, 117);
                return var3;
              } else {
                return var3;
              }
            } else {
              L1: {
                var12 = var7 * (var21[var11] - var22[var11]) >> 12;
                var13 = (-var9[1 + var11 & jh.field_A] + var9[var11 + -1 & jh.field_A]) * var7 >> 12;
                var14 = var13 >> 4;
                if (var14 >= 0) {
                  break L1;
                } else {
                  var14 = -var14;
                  break L1;
                }
              }
              L2: {
                var15 = var12 >> 4;
                if (255 < var14) {
                  var14 = 255;
                  break L2;
                } else {
                  break L2;
                }
              }
              L3: {
                if (0 > var15) {
                  var15 = -var15;
                  break L3;
                } else {
                  break L3;
                }
              }
              L4: {
                if (var15 > 255) {
                  var15 = 255;
                  break L4;
                } else {
                  break L4;
                }
              }
              var16 = 255 & k.field_c[((1 + var15) * var15 >> 1) + var14];
              var5 = var16 * var12 >> 8;
              var4 = var16 * var13 >> 8;
              var6 = 4096 * var16 >> 8;
              var4 = var4 * ((nl) this).field_v[0] >> 12;
              var6 = ((nl) this).field_v[2] * var6 >> 12;
              var5 = var5 * ((nl) this).field_v[1] >> 12;
              var18[var11] = var4 + (var5 - -var6);
              var11++;
              continue L0;
            }
          }
        } else {
          if (param0 >= 86) {
            return var3;
          } else {
            int[] discarded$3 = ((nl) this).a((byte) 107, 117);
            return var3;
          }
        }
    }

    final void a(fj param0, int param1, int param2) {
        int var4_int = 0;
        RuntimeException var4 = null;
        int var5 = 0;
        RuntimeException stackIn_13_0 = null;
        StringBuilder stackIn_13_1 = null;
        RuntimeException stackIn_14_0 = null;
        StringBuilder stackIn_14_1 = null;
        RuntimeException stackIn_15_0 = null;
        StringBuilder stackIn_15_1 = null;
        String stackIn_15_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException stackOut_12_0 = null;
        StringBuilder stackOut_12_1 = null;
        RuntimeException stackOut_14_0 = null;
        StringBuilder stackOut_14_1 = null;
        String stackOut_14_2 = null;
        RuntimeException stackOut_13_0 = null;
        StringBuilder stackOut_13_1 = null;
        String stackOut_13_2 = null;
        var5 = Torquing.field_u;
        try {
          L0: {
            if (param1 == 35) {
              break L0;
            } else {
              this.b(44);
              break L0;
            }
          }
          var4_int = param2;
          if (var4_int != 0) {
            if (var4_int == 1) {
              ((nl) this).field_x = param0.i(param1 + 7053);
              return;
            } else {
              if (var4_int == 2) {
                ((nl) this).field_w = param0.i(7088);
                return;
              } else {
                return;
              }
            }
          } else {
            ((nl) this).field_t = param0.i(7088);
            return;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L1: {
            var4 = decompiledCaughtException;
            stackOut_12_0 = (RuntimeException) var4;
            stackOut_12_1 = new StringBuilder().append("nl.H(");
            stackIn_14_0 = stackOut_12_0;
            stackIn_14_1 = stackOut_12_1;
            stackIn_13_0 = stackOut_12_0;
            stackIn_13_1 = stackOut_12_1;
            if (param0 == null) {
              stackOut_14_0 = (RuntimeException) (Object) stackIn_14_0;
              stackOut_14_1 = (StringBuilder) (Object) stackIn_14_1;
              stackOut_14_2 = "null";
              stackIn_15_0 = stackOut_14_0;
              stackIn_15_1 = stackOut_14_1;
              stackIn_15_2 = stackOut_14_2;
              break L1;
            } else {
              stackOut_13_0 = (RuntimeException) (Object) stackIn_13_0;
              stackOut_13_1 = (StringBuilder) (Object) stackIn_13_1;
              stackOut_13_2 = "{...}";
              stackIn_15_0 = stackOut_13_0;
              stackIn_15_1 = stackOut_13_1;
              stackIn_15_2 = stackOut_13_2;
              break L1;
            }
          }
          throw rb.a((Throwable) (Object) stackIn_15_0, stackIn_15_2 + 44 + param1 + 44 + param2 + 41);
        }
    }

    final static void a(int param0, boolean param1) {
        qk.field_q.a(91, param1);
        if (param0 != -2) {
            field_y = null;
        }
    }

    public static void d(int param0) {
        field_u = null;
        if (param0 > -8) {
            nl.a(-69, false);
            field_y = null;
            field_s = null;
            return;
        }
        field_y = null;
        field_s = null;
    }

    private final void b(int param0) {
        double var2 = 0.0;
        int var4 = 0;
        int var5 = 0;
        int var6 = 0;
        int var7 = 0;
        var2 = Math.cos((double)((float)((nl) this).field_w / 4096.0f));
        ((nl) this).field_v[0] = (int)(4096.0 * (var2 * Math.sin((double)((float)((nl) this).field_x / 4096.0f))));
        ((nl) this).field_v[1] = (int)(Math.cos((double)((float)((nl) this).field_x / 4096.0f)) * var2 * 4096.0);
        ((nl) this).field_v[2] = (int)(4096.0 * Math.sin((double)((float)((nl) this).field_w / 4096.0f)));
        var4 = ((nl) this).field_v[0] * ((nl) this).field_v[0] >> 12;
        if (param0 != -21978) {
          return;
        } else {
          L0: {
            var5 = ((nl) this).field_v[1] * ((nl) this).field_v[1] >> 12;
            var6 = ((nl) this).field_v[2] * ((nl) this).field_v[2] >> 12;
            var7 = (int)(Math.sqrt((double)(var6 + var4 + var5 >> 12)) * 4096.0);
            if (0 != var7) {
              ((nl) this).field_v[0] = (((nl) this).field_v[0] << 12) / var7;
              ((nl) this).field_v[1] = (((nl) this).field_v[1] << 12) / var7;
              ((nl) this).field_v[2] = (((nl) this).field_v[2] << 12) / var7;
              break L0;
            } else {
              break L0;
            }
          }
          return;
        }
    }

    final void a(byte param0) {
        this.b(-21978);
        if (param0 <= 123) {
            int[] discarded$0 = ((nl) this).a((byte) 74, 123);
        }
    }

    public nl() {
        super(1, true);
        ((nl) this).field_x = 3216;
        ((nl) this).field_w = 3216;
        ((nl) this).field_t = 4096;
        ((nl) this).field_v = new int[3];
    }

    final static t c(int param0) {
        int var4_int = 0;
        int var5 = Torquing.field_u;
        int var1 = ij.field_o[0] * vo.field_b[0];
        byte[] var2 = pn.field_b[0];
        int[] var3 = new int[var1];
        for (var4_int = 0; var1 > var4_int; var4_int++) {
            var3[var4_int] = cq.field_y[ie.a(255, (int) var2[var4_int])];
        }
        t var4 = new t(fm.field_E, rh.field_d, fj.field_o[0], na.field_G[0], vo.field_b[0], ij.field_o[0], var3);
        go.b(0);
        return var4;
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_u = " <times>?";
        field_y = new boolean[8];
    }
}
