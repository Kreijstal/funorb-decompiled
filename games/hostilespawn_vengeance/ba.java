/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class ba extends ag {
    boolean field_E;
    private int field_z;
    private bd[] field_C;
    private int field_A;
    private bd field_F;
    private int field_y;
    private bd field_I;
    private int field_K;
    int field_G;
    private int field_B;
    private bd field_D;
    private int field_L;

    final static int a(byte param0) {
        if (param0 <= 53) {
            return -71;
        }
        return 4 + n.field_s << 4;
    }

    final void a(ag param0, int param1, int param2, int param3) {
        RuntimeException var5 = null;
        RuntimeException stackIn_7_0 = null;
        StringBuilder stackIn_7_1 = null;
        RuntimeException stackIn_8_0 = null;
        StringBuilder stackIn_8_1 = null;
        RuntimeException stackIn_9_0 = null;
        StringBuilder stackIn_9_1 = null;
        String stackIn_9_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException stackOut_6_0 = null;
        StringBuilder stackOut_6_1 = null;
        RuntimeException stackOut_8_0 = null;
        StringBuilder stackOut_8_1 = null;
        String stackOut_8_2 = null;
        RuntimeException stackOut_7_0 = null;
        StringBuilder stackOut_7_1 = null;
        String stackOut_7_2 = null;
        try {
          L0: {
            L1: {
              if (param2 == 0) {
                break L1;
              } else {
                ((ba) this).field_C = null;
                break L1;
              }
            }
            L2: {
              if (!((ba) this).field_E) {
                break L2;
              } else {
                ((ba) this).field_z = ((ba) this).field_z + 1;
                if (((ba) this).field_z <= 2 * ((ba) this).field_y) {
                  break L2;
                } else {
                  ((ba) this).field_z = ((ba) this).field_z - ((ba) this).field_y * 2;
                  break L2;
                }
              }
            }
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L3: {
            var5 = decompiledCaughtException;
            stackOut_6_0 = (RuntimeException) var5;
            stackOut_6_1 = new StringBuilder().append("ba.W(");
            stackIn_8_0 = stackOut_6_0;
            stackIn_8_1 = stackOut_6_1;
            stackIn_7_0 = stackOut_6_0;
            stackIn_7_1 = stackOut_6_1;
            if (param0 == null) {
              stackOut_8_0 = (RuntimeException) (Object) stackIn_8_0;
              stackOut_8_1 = (StringBuilder) (Object) stackIn_8_1;
              stackOut_8_2 = "null";
              stackIn_9_0 = stackOut_8_0;
              stackIn_9_1 = stackOut_8_1;
              stackIn_9_2 = stackOut_8_2;
              break L3;
            } else {
              stackOut_7_0 = (RuntimeException) (Object) stackIn_7_0;
              stackOut_7_1 = (StringBuilder) (Object) stackIn_7_1;
              stackOut_7_2 = "{...}";
              stackIn_9_0 = stackOut_7_0;
              stackIn_9_1 = stackOut_7_1;
              stackIn_9_2 = stackOut_7_2;
              break L3;
            }
          }
          throw wg.a((Throwable) (Object) stackIn_9_0, stackIn_9_2 + ',' + param1 + ',' + param2 + ',' + param3 + ')');
        }
    }

    private final void h(int param0) {
        if (param0 != 4008) {
            ((ba) this).field_A = -88;
        }
        ((ba) this).field_C = new bd[]{this.a((byte) -38, ((ba) this).field_K, ((ba) this).field_L), this.a((byte) -38, ((ba) this).field_A, ((ba) this).field_B)};
        int discarded$0 = -1;
        ((ba) this).field_D = this.i();
        ((ba) this).field_F = ((ba) this).field_D.d();
        ((ba) this).field_I = new bd(((ba) this).field_x >> 1, ((ba) this).field_x);
    }

    private final bd a(byte param0, int param1, int param2) {
        int var5 = 0;
        int var6 = 0;
        int var7 = 0;
        int var8 = 0;
        int var9 = 0;
        int var10 = 0;
        int var11 = 0;
        int var12 = 0;
        int var13 = 0;
        bd var14 = null;
        int stackIn_7_0 = 0;
        int stackIn_10_0 = 0;
        int stackOut_6_0 = 0;
        int stackOut_5_0 = 0;
        int stackOut_9_0 = 0;
        int stackOut_8_0 = 0;
        var13 = HostileSpawn.field_I ? 1 : 0;
        var14 = new bd(2 * ((ba) this).field_y, ((ba) this).field_x);
        sb.a(var14, param0 ^ 95);
        if (param0 == -38) {
          var5 = ((ba) this).field_x >> 1;
          var6 = 0;
          L0: while (true) {
            if (var6 >= ((ba) this).field_x) {
              int discarded$1 = 0;
              eh.b();
              return var14;
            } else {
              L1: {
                var7 = (-1 + ((ba) this).field_y * 2) * (var6 >> 1) % (((ba) this).field_y * 2);
                var8 = param1 & 16711935;
                var9 = 65280 & param1;
                var10 = var6 + -var5;
                var11 = 128 + (int)(128.0 * (Math.sqrt((double)(var5 * var5 - var10 * var10)) / (double)var5));
                if (var11 < 256) {
                  stackOut_6_0 = (-16711936 & var8 * var11 | var9 * var11 & 16711680) >>> 8;
                  stackIn_7_0 = stackOut_6_0;
                  break L1;
                } else {
                  stackOut_5_0 = var8 | var9;
                  stackIn_7_0 = stackOut_5_0;
                  break L1;
                }
              }
              L2: {
                var12 = stackIn_7_0;
                si.a(var7, var6, ((ba) this).field_y, var12);
                var9 = param2 & 65280;
                var8 = param2 & 16711935;
                si.a(var7 - 2 * ((ba) this).field_y, var6, ((ba) this).field_y, var12);
                if (256 <= var11) {
                  stackOut_9_0 = var8 | var9;
                  stackIn_10_0 = stackOut_9_0;
                  break L2;
                } else {
                  stackOut_8_0 = (-16711936 & var8 * var11 | var11 * var9 & 16711680) >>> 8;
                  stackIn_10_0 = stackOut_8_0;
                  break L2;
                }
              }
              var12 = stackIn_10_0;
              si.a(var7 + ((ba) this).field_y, var6, ((ba) this).field_y, var12);
              si.a(var7 + -((ba) this).field_y, var6, ((ba) this).field_y, var12);
              var6++;
              continue L0;
            }
          }
        } else {
          return null;
        }
    }

    final static void e(byte param0) {
        int var1 = 0;
        int var2 = HostileSpawn.field_I ? 1 : 0;
        se.field_g = null;
        eh.field_e = false;
        if (param0 >= -49) {
            int discarded$0 = ba.a((byte) 13);
        }
        if (li.field_o) {
            jj.field_d.p(-108);
        } else {
            var1 = ca.field_a;
            if (0 < var1) {
                if (1 != var1) {
                    se.field_g = vg.a(new String[1], 52, mk.field_Q);
                } else {
                    se.field_g = vj.field_u;
                }
                se.field_g = wg.a((byte) -21, new CharSequence[3]);
            }
            jj.field_d.g((byte) 64);
            dc.a((byte) -116);
        }
    }

    private final void a(int param0, bd param1, int param2, int param3) {
        RuntimeException var5 = null;
        int var5_int = 0;
        int var6 = 0;
        int var7 = 0;
        int var8 = 0;
        RuntimeException stackIn_16_0 = null;
        StringBuilder stackIn_16_1 = null;
        RuntimeException stackIn_17_0 = null;
        StringBuilder stackIn_17_1 = null;
        RuntimeException stackIn_18_0 = null;
        StringBuilder stackIn_18_1 = null;
        String stackIn_18_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException stackOut_15_0 = null;
        StringBuilder stackOut_15_1 = null;
        RuntimeException stackOut_17_0 = null;
        StringBuilder stackOut_17_1 = null;
        String stackOut_17_2 = null;
        RuntimeException stackOut_16_0 = null;
        StringBuilder stackOut_16_1 = null;
        String stackOut_16_2 = null;
        var8 = HostileSpawn.field_I ? 1 : 0;
        try {
          L0: {
            var5_int = ((ba) this).field_s + param2;
            int discarded$4 = 1;
            sf.a(-((ba) this).field_D.field_z + var5_int, param0, ((ba) this).field_x + param0, ((ba) this).field_D.field_z + param2);
            var6 = -((ba) this).field_z + param2;
            L1: while (true) {
              if (var6 >= var5_int) {
                if (param3 < -117) {
                  L2: {
                    int discarded$5 = 0;
                    eh.b();
                    if (((ba) this).field_D.field_z + param2 >= si.field_b) {
                      sb.a(((ba) this).field_I, -110);
                      param1.e(-((ba) this).field_z, 0);
                      param1.e(-((ba) this).field_z + ((ba) this).field_y * 2, 0);
                      ((ba) this).field_F.a(0, 0);
                      int discarded$6 = 0;
                      eh.b();
                      ((ba) this).field_I.e(param2, param0);
                      break L2;
                    } else {
                      break L2;
                    }
                  }
                  L3: {
                    if (si.field_l < -((ba) this).field_D.field_z + var5_int) {
                      break L3;
                    } else {
                      sb.a(((ba) this).field_I, -124);
                      var7 = ((ba) this).field_z + -((ba) this).field_D.field_z + ((ba) this).field_s;
                      L4: while (true) {
                        if (2 * ((ba) this).field_y >= var7) {
                          param1.e(-var7, 0);
                          param1.e(((ba) this).field_y * 2 - var7, 0);
                          ((ba) this).field_D.a(0, 0);
                          int discarded$7 = 0;
                          eh.b();
                          ((ba) this).field_I.e(-((ba) this).field_D.field_z + var5_int, param0);
                          break L3;
                        } else {
                          var7 = var7 - ((ba) this).field_y * 2;
                          continue L4;
                        }
                      }
                    }
                  }
                  break L0;
                } else {
                  return;
                }
              } else {
                param1.e(var6, param0);
                var6 = var6 + param1.field_z;
                continue L1;
              }
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L5: {
            var5 = decompiledCaughtException;
            stackOut_15_0 = (RuntimeException) var5;
            stackOut_15_1 = new StringBuilder().append("ba.A(").append(param0).append(',');
            stackIn_17_0 = stackOut_15_0;
            stackIn_17_1 = stackOut_15_1;
            stackIn_16_0 = stackOut_15_0;
            stackIn_16_1 = stackOut_15_1;
            if (param1 == null) {
              stackOut_17_0 = (RuntimeException) (Object) stackIn_17_0;
              stackOut_17_1 = (StringBuilder) (Object) stackIn_17_1;
              stackOut_17_2 = "null";
              stackIn_18_0 = stackOut_17_0;
              stackIn_18_1 = stackOut_17_1;
              stackIn_18_2 = stackOut_17_2;
              break L5;
            } else {
              stackOut_16_0 = (RuntimeException) (Object) stackIn_16_0;
              stackOut_16_1 = (StringBuilder) (Object) stackIn_16_1;
              stackOut_16_2 = "{...}";
              stackIn_18_0 = stackOut_16_0;
              stackIn_18_1 = stackOut_16_1;
              stackIn_18_2 = stackOut_16_2;
              break L5;
            }
          }
          throw wg.a((Throwable) (Object) stackIn_18_0, stackIn_18_2 + ',' + param2 + ',' + param3 + ')');
        }
    }

    ba(int param0, int param1, int param2, int param3, int param4, int param5, int param6) {
        this(param0, param1, param2, param3, param4, param5, param6, (param5 & 16711422) >> 1, (param6 & 16711422) >> 1);
    }

    final void a(int param0, int param1, byte param2, int param3) {
        if (!(param3 == 0)) {
            return;
        }
        int var5 = ((ba) this).field_v + param1;
        int var6 = param0 + ((ba) this).field_m;
        if (param2 < 42) {
            bd discarded$0 = this.a((byte) -98, -91, -62);
        }
        this.a(var6, ((ba) this).field_C[0], var5, -119);
        if (!(((ba) this).field_G >= 65536)) {
            int discarded$1 = 1;
            sf.a(((ba) this).field_s + var5, var6, ((ba) this).field_x + var6, var5 - -(((ba) this).field_G * ((ba) this).field_s >> 16));
            this.a(var6, ((ba) this).field_C[1], var5, -122);
            int discarded$2 = 0;
            eh.b();
        }
    }

    final void a(int param0, int param1, int param2) {
        ((ba) this).field_K = param0;
        ((ba) this).field_L = param1;
        ((ba) this).field_B = (param1 & 16711422) >> 1;
        if (param2 != -1) {
            return;
        }
        ((ba) this).field_A = 8355711 & param0 >> 1;
        this.h(4008);
    }

    final void a(int param0, int param1, int param2, int param3, int param4) {
        super.a(param0, param1, param2 ^ param2, param3, param4);
        this.h(param2 ^ 4008);
    }

    private ba(int param0, int param1, int param2, int param3, int param4, int param5, int param6, int param7, int param8) {
        ((ba) this).field_B = param8;
        ((ba) this).field_y = param4;
        ((ba) this).field_A = param7;
        ((ba) this).field_L = param6;
        ((ba) this).field_K = param5;
        ((ba) this).a(param2, param1, 0, param0, param3);
    }

    private final bd i() {
        int var4 = 0;
        int var5 = 0;
        double var6 = 0.0;
        int var8 = 0;
        int var9 = HostileSpawn.field_I ? 1 : 0;
        int var2 = ((ba) this).field_x >> 1;
        bd var3 = new bd(var2, ((ba) this).field_x);
        sb.a(var3, -110);
        for (var4 = 0; var4 < ((ba) this).field_x; var4++) {
            for (var5 = 0; var2 > var5; var5++) {
                var6 = (double)var5 * (double)var5 / (double)(var4 * (-var4 + ((ba) this).field_x));
                var8 = 1;
                if (!(var6 >= 1.0)) {
                    var6 = Math.sqrt(1.0 - var6);
                    var8 = var6 < 1.0 ? (int)(255.0 * var6) : 255;
                }
                si.b(var5, var4, var8 << 8 | var8 | var8 << 16);
            }
        }
        int discarded$0 = 0;
        eh.b();
        return var3;
    }

    static {
    }
}
