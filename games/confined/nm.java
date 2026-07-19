/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class nm extends gk {
    private double field_J;
    static int field_z;
    static int[] field_C;
    private double field_G;
    private double field_E;
    static String field_D;
    private dc field_H;
    static bi field_F;
    static int field_I;
    private boolean field_B;

    final static nf[] a(mi param0, String param1, int param2, String param3) {
        int var4_int = 0;
        RuntimeException var4 = null;
        int var5 = 0;
        nf[] stackIn_3_0 = null;
        RuntimeException stackIn_5_0 = null;
        StringBuilder stackIn_5_1 = null;
        RuntimeException stackIn_6_0 = null;
        StringBuilder stackIn_6_1 = null;
        RuntimeException stackIn_7_0 = null;
        StringBuilder stackIn_7_1 = null;
        String stackIn_7_2 = null;
        RuntimeException stackIn_8_0 = null;
        StringBuilder stackIn_8_1 = null;
        RuntimeException stackIn_9_0 = null;
        StringBuilder stackIn_9_1 = null;
        RuntimeException stackIn_10_0 = null;
        StringBuilder stackIn_10_1 = null;
        String stackIn_10_2 = null;
        RuntimeException stackIn_11_0 = null;
        StringBuilder stackIn_11_1 = null;
        RuntimeException stackIn_12_0 = null;
        StringBuilder stackIn_12_1 = null;
        RuntimeException stackIn_13_0 = null;
        StringBuilder stackIn_13_1 = null;
        String stackIn_13_2 = null;
        RuntimeException decompiledCaughtException = null;
        nf[] stackOut_2_0 = null;
        RuntimeException stackOut_4_0 = null;
        StringBuilder stackOut_4_1 = null;
        RuntimeException stackOut_6_0 = null;
        StringBuilder stackOut_6_1 = null;
        String stackOut_6_2 = null;
        RuntimeException stackOut_5_0 = null;
        StringBuilder stackOut_5_1 = null;
        String stackOut_5_2 = null;
        RuntimeException stackOut_7_0 = null;
        StringBuilder stackOut_7_1 = null;
        RuntimeException stackOut_9_0 = null;
        StringBuilder stackOut_9_1 = null;
        String stackOut_9_2 = null;
        RuntimeException stackOut_8_0 = null;
        StringBuilder stackOut_8_1 = null;
        String stackOut_8_2 = null;
        RuntimeException stackOut_10_0 = null;
        StringBuilder stackOut_10_1 = null;
        RuntimeException stackOut_12_0 = null;
        StringBuilder stackOut_12_1 = null;
        String stackOut_12_2 = null;
        RuntimeException stackOut_11_0 = null;
        StringBuilder stackOut_11_1 = null;
        String stackOut_11_2 = null;
        try {
          L0: {
            L1: {
              if (param2 == 1) {
                break L1;
              } else {
                field_C = (int[]) null;
                break L1;
              }
            }
            var4_int = param0.a(-26, param3);
            var5 = param0.a(var4_int, param1, -94);
            stackOut_2_0 = hf.a(param0, var4_int, (byte) -127, var5);
            stackIn_3_0 = stackOut_2_0;
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L2: {
            var4 = decompiledCaughtException;
            stackOut_4_0 = (RuntimeException) (var4);
            stackOut_4_1 = new StringBuilder().append("nm.F(");
            stackIn_6_0 = stackOut_4_0;
            stackIn_6_1 = stackOut_4_1;
            stackIn_5_0 = stackOut_4_0;
            stackIn_5_1 = stackOut_4_1;
            if (param0 == null) {
              stackOut_6_0 = (RuntimeException) ((Object) stackIn_6_0);
              stackOut_6_1 = (StringBuilder) ((Object) stackIn_6_1);
              stackOut_6_2 = "null";
              stackIn_7_0 = stackOut_6_0;
              stackIn_7_1 = stackOut_6_1;
              stackIn_7_2 = stackOut_6_2;
              break L2;
            } else {
              stackOut_5_0 = (RuntimeException) ((Object) stackIn_5_0);
              stackOut_5_1 = (StringBuilder) ((Object) stackIn_5_1);
              stackOut_5_2 = "{...}";
              stackIn_7_0 = stackOut_5_0;
              stackIn_7_1 = stackOut_5_1;
              stackIn_7_2 = stackOut_5_2;
              break L2;
            }
          }
          L3: {
            stackOut_7_0 = (RuntimeException) ((Object) stackIn_7_0);
            stackOut_7_1 = ((StringBuilder) (Object) stackIn_7_1).append(stackIn_7_2).append(',');
            stackIn_9_0 = stackOut_7_0;
            stackIn_9_1 = stackOut_7_1;
            stackIn_8_0 = stackOut_7_0;
            stackIn_8_1 = stackOut_7_1;
            if (param1 == null) {
              stackOut_9_0 = (RuntimeException) ((Object) stackIn_9_0);
              stackOut_9_1 = (StringBuilder) ((Object) stackIn_9_1);
              stackOut_9_2 = "null";
              stackIn_10_0 = stackOut_9_0;
              stackIn_10_1 = stackOut_9_1;
              stackIn_10_2 = stackOut_9_2;
              break L3;
            } else {
              stackOut_8_0 = (RuntimeException) ((Object) stackIn_8_0);
              stackOut_8_1 = (StringBuilder) ((Object) stackIn_8_1);
              stackOut_8_2 = "{...}";
              stackIn_10_0 = stackOut_8_0;
              stackIn_10_1 = stackOut_8_1;
              stackIn_10_2 = stackOut_8_2;
              break L3;
            }
          }
          L4: {
            stackOut_10_0 = (RuntimeException) ((Object) stackIn_10_0);
            stackOut_10_1 = ((StringBuilder) (Object) stackIn_10_1).append(stackIn_10_2).append(',').append(param2).append(',');
            stackIn_12_0 = stackOut_10_0;
            stackIn_12_1 = stackOut_10_1;
            stackIn_11_0 = stackOut_10_0;
            stackIn_11_1 = stackOut_10_1;
            if (param3 == null) {
              stackOut_12_0 = (RuntimeException) ((Object) stackIn_12_0);
              stackOut_12_1 = (StringBuilder) ((Object) stackIn_12_1);
              stackOut_12_2 = "null";
              stackIn_13_0 = stackOut_12_0;
              stackIn_13_1 = stackOut_12_1;
              stackIn_13_2 = stackOut_12_2;
              break L4;
            } else {
              stackOut_11_0 = (RuntimeException) ((Object) stackIn_11_0);
              stackOut_11_1 = (StringBuilder) ((Object) stackIn_11_1);
              stackOut_11_2 = "{...}";
              stackIn_13_0 = stackOut_11_0;
              stackIn_13_1 = stackOut_11_1;
              stackIn_13_2 = stackOut_11_2;
              break L4;
            }
          }
          throw sd.a((Throwable) ((Object) stackIn_13_0), stackIn_13_2 + ')');
        }
        return stackIn_3_0;
    }

    nm(pm param0, bi param1, dc param2, int param3) {
        super(param0, param1);
        try {
            this.field_n.e(param1.field_o.length * param3 >> -338220536);
            this.field_w = 0.2;
            this.field_H = param2;
        } catch (RuntimeException runtimeException) {
            throw sd.a((Throwable) ((Object) runtimeException), "nm.<init>(" + (param0 != null ? "{...}" : "null") + ',' + (param1 != null ? "{...}" : "null") + ',' + (param2 != null ? "{...}" : "null") + ',' + param3 + ')');
        }
    }

    final static boolean e(byte param0) {
        Object var1 = null;
        Object var1_ref = null;
        Throwable var2 = null;
        int stackIn_3_0 = 0;
        int stackIn_7_0 = 0;
        Throwable decompiledCaughtException = null;
        int stackOut_6_0 = 0;
        int stackOut_2_0 = 0;
        var1_ref = tf.field_p;
        synchronized (var1_ref) {
          L0: {
            if (ic.field_b != lh.field_b) {
              L1: {
                gk.field_r = ke.field_P[ic.field_b];
                if (param0 == -96) {
                  break L1;
                } else {
                  field_z = -30;
                  break L1;
                }
              }
              ad.field_h = mk.field_n[ic.field_b];
              ic.field_b = 127 & 1 + ic.field_b;
              stackOut_6_0 = 1;
              stackIn_7_0 = stackOut_6_0;
              break L0;
            } else {
              stackOut_2_0 = 0;
              stackIn_3_0 = stackOut_2_0;
              return stackIn_3_0 != 0;
            }
          }
        }
        return stackIn_7_0 != 0;
    }

    public static void h(int param0) {
        nf[] discarded$0 = null;
        if (param0 != 3981) {
            String var2 = (String) null;
            discarded$0 = nm.a((mi) null, (String) null, -1, (String) null);
        }
        field_D = null;
        field_F = null;
        field_C = null;
    }

    final void b(int param0) {
        boolean discarded$0 = false;
        boolean discarded$1 = false;
        if (!this.field_t.field_z) {
            this.e(param0 + 31537);
            if (param0 != -25071) {
                discarded$0 = nm.e((byte) -32);
            }
            return;
        }
        if (!(this.field_H.c((byte) 105))) {
            this.f(128);
            return;
        }
        this.e(param0 + 31537);
        if (param0 != -25071) {
            discarded$1 = nm.e((byte) -32);
        }
    }

    final void e(int param0) {
        double var3 = 0.0;
        double var5 = 0.0;
        double var7 = 0.0;
        double var9 = 0.0;
        double var11 = 0.0;
        double var13 = 0.0;
        double var15 = 0.0;
        double var17 = 0.0;
        double var19 = 0.0;
        int var21 = 0;
        double var23 = 0.0;
        double var25 = 0.0;
        double var27 = 0.0;
        int var29 = 0;
        double var30 = 0.0;
        double var32 = 0.0;
        double var34 = 0.0;
        double var36 = 0.0;
        double var38 = 0.0;
        double var40 = 0.0;
        double var42 = 0.0;
        double var44 = 0.0;
        dj var46 = null;
        double[] var50 = null;
        double stackIn_8_0 = 0.0;
        int stackIn_12_0 = 0;
        double stackIn_18_0 = 0.0;
        double stackIn_18_1 = 0.0;
        double stackIn_19_0 = 0.0;
        double stackIn_19_1 = 0.0;
        double stackIn_20_0 = 0.0;
        double stackIn_20_1 = 0.0;
        double stackIn_20_2 = 0.0;
        vc stackIn_33_0 = null;
        vc stackIn_34_0 = null;
        vc stackIn_35_0 = null;
        int stackIn_35_1 = 0;
        double stackOut_7_0 = 0.0;
        double stackOut_6_0 = 0.0;
        int stackOut_11_0 = 0;
        int stackOut_10_0 = 0;
        double stackOut_17_0 = 0.0;
        double stackOut_17_1 = 0.0;
        double stackOut_19_0 = 0.0;
        double stackOut_19_1 = 0.0;
        double stackOut_19_2 = 0.0;
        double stackOut_18_0 = 0.0;
        double stackOut_18_1 = 0.0;
        double stackOut_18_2 = 0.0;
        vc stackOut_32_0 = null;
        vc stackOut_34_0 = null;
        int stackOut_34_1 = 0;
        vc stackOut_33_0 = null;
        int stackOut_33_1 = 0;
        if (!this.field_H.c((byte) 105)) {
          this.field_B = false;
          this.field_n.h(0);
          this.field_n.d(0);
          return;
        } else {
          L0: {
            var46 = this.field_t.field_A.field_B;
            var3 = var46.field_E - this.field_H.field_cb;
            var5 = var46.field_t - this.field_H.field_L;
            var7 = var46.field_D - this.field_H.field_X;
            var9 = var7 * this.field_H.field_K + (var3 * this.field_H.field_x + var5 * this.field_H.field_P);
            var11 = var3;
            var13 = var5;
            var15 = var7;
            if (var9 >= 0.0) {
              L1: {
                if (this.field_H.field_y <= var9) {
                  stackOut_7_0 = this.field_H.field_y;
                  stackIn_8_0 = stackOut_7_0;
                  break L1;
                } else {
                  stackOut_6_0 = var9;
                  stackIn_8_0 = stackOut_6_0;
                  break L1;
                }
              }
              var17 = stackIn_8_0;
              var15 = var15 - var17 * this.field_H.field_K;
              var13 = var13 - this.field_H.field_P * var17;
              var11 = var11 - var17 * this.field_H.field_x;
              break L0;
            } else {
              break L0;
            }
          }
          L2: {
            var17 = var11 * var11 + var13 * var13 + var15 * var15;
            var19 = 2.0 * this.field_w;
            if (var17 > var19 * var19) {
              stackOut_11_0 = (int)(0.5 + var19 * (double)this.field_m / Math.sqrt(var17));
              stackIn_12_0 = stackOut_11_0;
              break L2;
            } else {
              stackOut_10_0 = this.field_m;
              stackIn_12_0 = stackOut_10_0;
              break L2;
            }
          }
          L3: {
            var21 = stackIn_12_0;
            if (param0 == 6466) {
              break L3;
            } else {
              field_C = (int[]) null;
              break L3;
            }
          }
          L4: {
            if ((var21 ^ -1) < -257) {
              var21 = 256;
              break L4;
            } else {
              break L4;
            }
          }
          L5: {
            var50 = new double[12];
            var46.field_jb.a((byte) 85, var50);
            var23 = var50[3];
            var25 = var50[4];
            var27 = var50[5];
            stackOut_17_0 = 128.5;
            stackOut_17_1 = 128.0 * (var13 * var25 + var11 * var23 + var27 * var15);
            stackIn_19_0 = stackOut_17_0;
            stackIn_19_1 = stackOut_17_1;
            stackIn_18_0 = stackOut_17_0;
            stackIn_18_1 = stackOut_17_1;
            if (var17 <= var19 * var19) {
              stackOut_19_0 = stackIn_19_0;
              stackOut_19_1 = stackIn_19_1;
              stackOut_19_2 = var19;
              stackIn_20_0 = stackOut_19_0;
              stackIn_20_1 = stackOut_19_1;
              stackIn_20_2 = stackOut_19_2;
              break L5;
            } else {
              stackOut_18_0 = stackIn_18_0;
              stackOut_18_1 = stackIn_18_1;
              stackOut_18_2 = Math.sqrt(var17);
              stackIn_20_0 = stackOut_18_0;
              stackIn_20_1 = stackOut_18_1;
              stackIn_20_2 = stackOut_18_2;
              break L5;
            }
          }
          L6: {
            var29 = (int)(stackIn_20_0 - stackIn_20_1 / stackIn_20_2);
            this.field_n.b(16384 + eg.field_i * var21 * fa.field_S >> 258769199, var29);
            var11 = -(var9 * this.field_H.field_x) + var3;
            var15 = -(this.field_H.field_K * var9) + var7;
            var13 = -(var9 * this.field_H.field_P) + var5;
            var30 = var46.field_K;
            var32 = var46.field_G;
            var34 = var46.field_L;
            if (this.field_B) {
              var32 = var32 + (-var13 + this.field_J);
              var30 = var30 + (this.field_G - var11);
              var34 = var34 + (-var15 + this.field_E);
              break L6;
            } else {
              break L6;
            }
          }
          L7: {
            this.field_G = var11;
            this.field_J = var13;
            this.field_E = var15;
            this.field_B = true;
            if (0.01 <= var17) {
              var17 = 1.0 / Math.sqrt(var17);
              var15 = var15 * var17;
              var13 = var13 * var17;
              var11 = var11 * var17;
              break L7;
            } else {
              break L7;
            }
          }
          var36 = -(var13 * var32) - var11 * var30 - var34 * var15 + 2.0;
          if (var36 < 0.01) {
            this.field_n.d(0);
            return;
          } else {
            var38 = -(var13 * var46.field_G) - var11 * var46.field_K - var15 * var46.field_L + 2.0;
            if (var38 < 0.01) {
              this.field_n.d(0);
              return;
            } else {
              L8: {
                var40 = (double)(this.field_s.field_n * 256) / (double)dk.field_k;
                var42 = var40 * 2.0 / var36;
                var44 = var38 * var42 / 2.0;
                stackOut_32_0 = this.field_n;
                stackIn_34_0 = stackOut_32_0;
                stackIn_33_0 = stackOut_32_0;
                if (1600.0 > var44) {
                  stackOut_34_0 = (vc) ((Object) stackIn_34_0);
                  stackOut_34_1 = (int)(var44 + 0.5);
                  stackIn_35_0 = stackOut_34_0;
                  stackIn_35_1 = stackOut_34_1;
                  break L8;
                } else {
                  stackOut_33_0 = (vc) ((Object) stackIn_33_0);
                  stackOut_33_1 = 1600;
                  stackIn_35_0 = stackOut_33_0;
                  stackIn_35_1 = stackOut_33_1;
                  break L8;
                }
              }
              L9: {
                ((vc) (Object) stackIn_35_0).d(stackIn_35_1);
                if (this.field_x) {
                  cb.field_a.a(this.field_n);
                  this.field_x = false;
                  break L9;
                } else {
                  break L9;
                }
              }
              return;
            }
          }
        }
    }

    final static boolean a(String param0, byte param1, String param2) {
        int var3_int = 0;
        RuntimeException var3 = null;
        String var4 = null;
        int stackIn_4_0 = 0;
        int stackIn_12_0 = 0;
        RuntimeException stackIn_14_0 = null;
        StringBuilder stackIn_14_1 = null;
        RuntimeException stackIn_15_0 = null;
        StringBuilder stackIn_15_1 = null;
        RuntimeException stackIn_16_0 = null;
        StringBuilder stackIn_16_1 = null;
        String stackIn_16_2 = null;
        RuntimeException stackIn_17_0 = null;
        StringBuilder stackIn_17_1 = null;
        RuntimeException stackIn_18_0 = null;
        StringBuilder stackIn_18_1 = null;
        RuntimeException stackIn_19_0 = null;
        StringBuilder stackIn_19_1 = null;
        String stackIn_19_2 = null;
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        int stackOut_3_0 = 0;
        int stackOut_11_0 = 0;
        int stackOut_10_0 = 0;
        RuntimeException stackOut_13_0 = null;
        StringBuilder stackOut_13_1 = null;
        RuntimeException stackOut_15_0 = null;
        StringBuilder stackOut_15_1 = null;
        String stackOut_15_2 = null;
        RuntimeException stackOut_14_0 = null;
        StringBuilder stackOut_14_1 = null;
        String stackOut_14_2 = null;
        RuntimeException stackOut_16_0 = null;
        StringBuilder stackOut_16_1 = null;
        RuntimeException stackOut_18_0 = null;
        StringBuilder stackOut_18_1 = null;
        String stackOut_18_2 = null;
        RuntimeException stackOut_17_0 = null;
        StringBuilder stackOut_17_1 = null;
        String stackOut_17_2 = null;
        try {
          L0: {
            var3_int = -74 % ((param1 - 19) / 41);
            var4 = pn.a(-1, param0);
            if (-1 != param2.indexOf(param0)) {
              stackOut_3_0 = 1;
              stackIn_4_0 = stackOut_3_0;
              decompiledRegionSelector0 = 0;
              break L0;
            } else {
              if (0 == (param2.indexOf(var4) ^ -1)) {
                L1: {
                  L2: {
                    if (param2.startsWith(param0)) {
                      break L2;
                    } else {
                      if (param2.startsWith(var4)) {
                        break L2;
                      } else {
                        if (param2.endsWith(param0)) {
                          break L2;
                        } else {
                          if (!param2.endsWith(var4)) {
                            stackOut_11_0 = 0;
                            stackIn_12_0 = stackOut_11_0;
                            break L1;
                          } else {
                            break L2;
                          }
                        }
                      }
                    }
                  }
                  stackOut_10_0 = 1;
                  stackIn_12_0 = stackOut_10_0;
                  break L1;
                }
                decompiledRegionSelector0 = 1;
                break L0;
              } else {
                return true;
              }
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L3: {
            var3 = decompiledCaughtException;
            stackOut_13_0 = (RuntimeException) (var3);
            stackOut_13_1 = new StringBuilder().append("nm.A(");
            stackIn_15_0 = stackOut_13_0;
            stackIn_15_1 = stackOut_13_1;
            stackIn_14_0 = stackOut_13_0;
            stackIn_14_1 = stackOut_13_1;
            if (param0 == null) {
              stackOut_15_0 = (RuntimeException) ((Object) stackIn_15_0);
              stackOut_15_1 = (StringBuilder) ((Object) stackIn_15_1);
              stackOut_15_2 = "null";
              stackIn_16_0 = stackOut_15_0;
              stackIn_16_1 = stackOut_15_1;
              stackIn_16_2 = stackOut_15_2;
              break L3;
            } else {
              stackOut_14_0 = (RuntimeException) ((Object) stackIn_14_0);
              stackOut_14_1 = (StringBuilder) ((Object) stackIn_14_1);
              stackOut_14_2 = "{...}";
              stackIn_16_0 = stackOut_14_0;
              stackIn_16_1 = stackOut_14_1;
              stackIn_16_2 = stackOut_14_2;
              break L3;
            }
          }
          L4: {
            stackOut_16_0 = (RuntimeException) ((Object) stackIn_16_0);
            stackOut_16_1 = ((StringBuilder) (Object) stackIn_16_1).append(stackIn_16_2).append(',').append(param1).append(',');
            stackIn_18_0 = stackOut_16_0;
            stackIn_18_1 = stackOut_16_1;
            stackIn_17_0 = stackOut_16_0;
            stackIn_17_1 = stackOut_16_1;
            if (param2 == null) {
              stackOut_18_0 = (RuntimeException) ((Object) stackIn_18_0);
              stackOut_18_1 = (StringBuilder) ((Object) stackIn_18_1);
              stackOut_18_2 = "null";
              stackIn_19_0 = stackOut_18_0;
              stackIn_19_1 = stackOut_18_1;
              stackIn_19_2 = stackOut_18_2;
              break L4;
            } else {
              stackOut_17_0 = (RuntimeException) ((Object) stackIn_17_0);
              stackOut_17_1 = (StringBuilder) ((Object) stackIn_17_1);
              stackOut_17_2 = "{...}";
              stackIn_19_0 = stackOut_17_0;
              stackIn_19_1 = stackOut_17_1;
              stackIn_19_2 = stackOut_17_2;
              break L4;
            }
          }
          throw sd.a((Throwable) ((Object) stackIn_19_0), stackIn_19_2 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return stackIn_4_0 != 0;
        } else {
          return stackIn_12_0 != 0;
        }
    }

    static {
        field_C = new int[8192];
        field_I = -1;
        field_D = "Username: ";
    }
}
