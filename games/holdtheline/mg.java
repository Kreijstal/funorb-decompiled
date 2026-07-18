/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class mg {
    private boolean field_j;
    private boolean field_d;
    static boolean field_c;
    static String field_i;
    static jg[] field_g;
    static java.awt.Frame field_f;
    private hj[] field_h;
    static String field_e;
    static String field_k;
    private int field_a;
    private hj field_b;

    final static void a(int param0) {
        int var1 = cf.field_w == -1 ? 0 : cf.field_w;
        ca.field_r = kj.b(2, 10) == 0 ? 6 : 5;
        nm.field_b = ca.field_r == 6 ? tk.field_c[5][var1] : tk.field_c[var1][0];
        if (!pd.a(nm.field_b, true)) {
            qn.field_k = false;
            fl.field_j = false;
            on.field_r = -1;
            bl.field_r = null;
            sk.field_i = -1;
        } else {
            bl.field_r = new sg(nm.field_b, ca.field_r, false, false, -1, -1);
            ca.field_r = -1;
        }
        kk.field_j = false;
    }

    final mg a(int param0, int param1) {
        int[] var4 = null;
        int var5 = 0;
        int var6 = 0;
        int var7 = 0;
        int var8 = 0;
        int var9 = 0;
        hj var10 = null;
        int[] var11 = null;
        int[] var12 = null;
        var9 = HoldTheLine.field_D;
        var10 = ((mg) this).field_b.e();
        var12 = var10.field_z;
        var11 = var12;
        var4 = var11;
        var5 = param1 & 16711935;
        var6 = param1 & 65280;
        var7 = 0;
        if (param0 == -4503) {
          L0: while (true) {
            if (var7 >= var12.length) {
              return new mg(var10, ((mg) this).field_a, ((mg) this).field_j, ((mg) this).field_d);
            } else {
              var8 = var12[var7];
              if (var8 != 0) {
                if ((65535 & var8) == var8 >> 8) {
                  var8 = var8 & 255;
                  var4[var7] = 1 + (pk.a(16711680, var6 * var8) + pk.a(var5 * var8, -16712192) >>> 8);
                  var7++;
                  continue L0;
                } else {
                  var7++;
                  continue L0;
                }
              } else {
                var7++;
                continue L0;
              }
            }
          }
        } else {
          return null;
        }
    }

    final void a(int param0, boolean param1) {
        if (param1) {
            return;
        }
        this.b(27854);
        ((mg) this).field_a = param0;
    }

    final hj a(float param0, int param1) {
        int var3 = 0;
        int var4 = HoldTheLine.field_D;
        param0 = (float)((double)param0 * 10.185916357881302);
        if (param1 != 27788) {
            return null;
        }
        for (var3 = Math.round(param0); var3 < 0; var3 += 64) {
        }
        while (var3 >= 64) {
            var3 -= 64;
        }
        return this.a(var3, (byte) 120);
    }

    final static int a(qi param0, String param1, String[] param2, byte param3, int param4) {
        RuntimeException var5 = null;
        int var5_int = 0;
        int var6 = 0;
        int var7 = 0;
        int var8 = 0;
        int var9 = 0;
        int var10 = 0;
        int var11 = 0;
        String var12 = null;
        int var13 = 0;
        int var14 = 0;
        int stackIn_5_0 = 0;
        int stackIn_19_0 = 0;
        RuntimeException stackIn_21_0 = null;
        StringBuilder stackIn_21_1 = null;
        RuntimeException stackIn_22_0 = null;
        StringBuilder stackIn_22_1 = null;
        RuntimeException stackIn_23_0 = null;
        StringBuilder stackIn_23_1 = null;
        String stackIn_23_2 = null;
        RuntimeException stackIn_24_0 = null;
        StringBuilder stackIn_24_1 = null;
        RuntimeException stackIn_25_0 = null;
        StringBuilder stackIn_25_1 = null;
        RuntimeException stackIn_26_0 = null;
        StringBuilder stackIn_26_1 = null;
        String stackIn_26_2 = null;
        RuntimeException stackIn_27_0 = null;
        StringBuilder stackIn_27_1 = null;
        RuntimeException stackIn_28_0 = null;
        StringBuilder stackIn_28_1 = null;
        RuntimeException stackIn_29_0 = null;
        StringBuilder stackIn_29_1 = null;
        String stackIn_29_2 = null;
        RuntimeException decompiledCaughtException = null;
        int stackOut_4_0 = 0;
        int stackOut_18_0 = 0;
        RuntimeException stackOut_20_0 = null;
        StringBuilder stackOut_20_1 = null;
        RuntimeException stackOut_22_0 = null;
        StringBuilder stackOut_22_1 = null;
        String stackOut_22_2 = null;
        RuntimeException stackOut_21_0 = null;
        StringBuilder stackOut_21_1 = null;
        String stackOut_21_2 = null;
        RuntimeException stackOut_23_0 = null;
        StringBuilder stackOut_23_1 = null;
        RuntimeException stackOut_25_0 = null;
        StringBuilder stackOut_25_1 = null;
        String stackOut_25_2 = null;
        RuntimeException stackOut_24_0 = null;
        StringBuilder stackOut_24_1 = null;
        String stackOut_24_2 = null;
        RuntimeException stackOut_26_0 = null;
        StringBuilder stackOut_26_1 = null;
        RuntimeException stackOut_28_0 = null;
        StringBuilder stackOut_28_1 = null;
        String stackOut_28_2 = null;
        RuntimeException stackOut_27_0 = null;
        StringBuilder stackOut_27_1 = null;
        String stackOut_27_2 = null;
        var14 = HoldTheLine.field_D;
        try {
          L0: {
            L1: {
              var5_int = 62 / ((param3 - 29) / 60);
              var6 = param0.a(param1);
              if (param4 < var6) {
                break L1;
              } else {
                if (param1.indexOf("<br>") == -1) {
                  param2[0] = param1;
                  stackOut_4_0 = 1;
                  stackIn_5_0 = stackOut_4_0;
                  return stackIn_5_0;
                } else {
                  break L1;
                }
              }
            }
            var7 = (-1 + (param4 + var6)) / param4;
            param4 = var6 / var7;
            var7 = 0;
            var8 = 0;
            var9 = param1.length();
            var10 = 0;
            L2: while (true) {
              if (var10 >= var9) {
                L3: {
                  if (var8 >= var9) {
                    break L3;
                  } else {
                    int incrementValue$2 = var7;
                    var7++;
                    param2[incrementValue$2] = param1.substring(var8, var9).trim();
                    break L3;
                  }
                }
                stackOut_18_0 = var7;
                stackIn_19_0 = stackOut_18_0;
                break L0;
              } else {
                L4: {
                  L5: {
                    var11 = param1.charAt(var10);
                    if (32 == var11) {
                      break L5;
                    } else {
                      if (var11 == 45) {
                        break L5;
                      } else {
                        break L4;
                      }
                    }
                  }
                  var12 = param1.substring(var8, 1 + var10).trim();
                  var13 = param0.a(var12);
                  if (param4 > var13) {
                    break L4;
                  } else {
                    var8 = var10 - -1;
                    int incrementValue$3 = var7;
                    var7++;
                    param2[incrementValue$3] = var12;
                    break L4;
                  }
                }
                L6: {
                  if (62 != var11) {
                    break L6;
                  } else {
                    break L6;
                  }
                }
                var10++;
                continue L2;
              }
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L7: {
            var5 = decompiledCaughtException;
            stackOut_20_0 = (RuntimeException) var5;
            stackOut_20_1 = new StringBuilder().append("mg.E(");
            stackIn_22_0 = stackOut_20_0;
            stackIn_22_1 = stackOut_20_1;
            stackIn_21_0 = stackOut_20_0;
            stackIn_21_1 = stackOut_20_1;
            if (param0 == null) {
              stackOut_22_0 = (RuntimeException) (Object) stackIn_22_0;
              stackOut_22_1 = (StringBuilder) (Object) stackIn_22_1;
              stackOut_22_2 = "null";
              stackIn_23_0 = stackOut_22_0;
              stackIn_23_1 = stackOut_22_1;
              stackIn_23_2 = stackOut_22_2;
              break L7;
            } else {
              stackOut_21_0 = (RuntimeException) (Object) stackIn_21_0;
              stackOut_21_1 = (StringBuilder) (Object) stackIn_21_1;
              stackOut_21_2 = "{...}";
              stackIn_23_0 = stackOut_21_0;
              stackIn_23_1 = stackOut_21_1;
              stackIn_23_2 = stackOut_21_2;
              break L7;
            }
          }
          L8: {
            stackOut_23_0 = (RuntimeException) (Object) stackIn_23_0;
            stackOut_23_1 = ((StringBuilder) (Object) stackIn_23_1).append(stackIn_23_2).append(',');
            stackIn_25_0 = stackOut_23_0;
            stackIn_25_1 = stackOut_23_1;
            stackIn_24_0 = stackOut_23_0;
            stackIn_24_1 = stackOut_23_1;
            if (param1 == null) {
              stackOut_25_0 = (RuntimeException) (Object) stackIn_25_0;
              stackOut_25_1 = (StringBuilder) (Object) stackIn_25_1;
              stackOut_25_2 = "null";
              stackIn_26_0 = stackOut_25_0;
              stackIn_26_1 = stackOut_25_1;
              stackIn_26_2 = stackOut_25_2;
              break L8;
            } else {
              stackOut_24_0 = (RuntimeException) (Object) stackIn_24_0;
              stackOut_24_1 = (StringBuilder) (Object) stackIn_24_1;
              stackOut_24_2 = "{...}";
              stackIn_26_0 = stackOut_24_0;
              stackIn_26_1 = stackOut_24_1;
              stackIn_26_2 = stackOut_24_2;
              break L8;
            }
          }
          L9: {
            stackOut_26_0 = (RuntimeException) (Object) stackIn_26_0;
            stackOut_26_1 = ((StringBuilder) (Object) stackIn_26_1).append(stackIn_26_2).append(',');
            stackIn_28_0 = stackOut_26_0;
            stackIn_28_1 = stackOut_26_1;
            stackIn_27_0 = stackOut_26_0;
            stackIn_27_1 = stackOut_26_1;
            if (param2 == null) {
              stackOut_28_0 = (RuntimeException) (Object) stackIn_28_0;
              stackOut_28_1 = (StringBuilder) (Object) stackIn_28_1;
              stackOut_28_2 = "null";
              stackIn_29_0 = stackOut_28_0;
              stackIn_29_1 = stackOut_28_1;
              stackIn_29_2 = stackOut_28_2;
              break L9;
            } else {
              stackOut_27_0 = (RuntimeException) (Object) stackIn_27_0;
              stackOut_27_1 = (StringBuilder) (Object) stackIn_27_1;
              stackOut_27_2 = "{...}";
              stackIn_29_0 = stackOut_27_0;
              stackIn_29_1 = stackOut_27_1;
              stackIn_29_2 = stackOut_27_2;
              break L9;
            }
          }
          throw kk.a((Throwable) (Object) stackIn_29_0, stackIn_29_2 + ',' + param3 + ',' + param4 + ')');
        }
        return stackIn_19_0;
    }

    final static Object a(byte param0, byte[] param1, boolean param2) {
        la var3 = null;
        RuntimeException var3_ref = null;
        Object stackIn_2_0 = null;
        la stackIn_6_0 = null;
        Object stackIn_9_0 = null;
        byte[] stackIn_11_0 = null;
        RuntimeException stackIn_14_0 = null;
        StringBuilder stackIn_14_1 = null;
        RuntimeException stackIn_15_0 = null;
        StringBuilder stackIn_15_1 = null;
        RuntimeException stackIn_16_0 = null;
        StringBuilder stackIn_16_1 = null;
        String stackIn_16_2 = null;
        RuntimeException decompiledCaughtException = null;
        la stackOut_5_0 = null;
        byte[] stackOut_10_0 = null;
        Object stackOut_8_0 = null;
        Object stackOut_1_0 = null;
        RuntimeException stackOut_13_0 = null;
        StringBuilder stackOut_13_1 = null;
        RuntimeException stackOut_15_0 = null;
        StringBuilder stackOut_15_1 = null;
        String stackOut_15_2 = null;
        RuntimeException stackOut_14_0 = null;
        StringBuilder stackOut_14_1 = null;
        String stackOut_14_2 = null;
        try {
          L0: {
            if (param1 != null) {
              if (param1.length > 136) {
                var3 = new la();
                ((ej) (Object) var3).a(95, param1);
                stackOut_5_0 = (la) var3;
                stackIn_6_0 = stackOut_5_0;
                return (Object) (Object) stackIn_6_0;
              } else {
                if (param0 > 93) {
                  stackOut_10_0 = (byte[]) param1;
                  stackIn_11_0 = stackOut_10_0;
                  break L0;
                } else {
                  stackOut_8_0 = null;
                  stackIn_9_0 = stackOut_8_0;
                  return stackIn_9_0;
                }
              }
            } else {
              stackOut_1_0 = null;
              stackIn_2_0 = stackOut_1_0;
              return stackIn_2_0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L1: {
            var3_ref = decompiledCaughtException;
            stackOut_13_0 = (RuntimeException) var3_ref;
            stackOut_13_1 = new StringBuilder().append("mg.C(").append(param0).append(',');
            stackIn_15_0 = stackOut_13_0;
            stackIn_15_1 = stackOut_13_1;
            stackIn_14_0 = stackOut_13_0;
            stackIn_14_1 = stackOut_13_1;
            if (param1 == null) {
              stackOut_15_0 = (RuntimeException) (Object) stackIn_15_0;
              stackOut_15_1 = (StringBuilder) (Object) stackIn_15_1;
              stackOut_15_2 = "null";
              stackIn_16_0 = stackOut_15_0;
              stackIn_16_1 = stackOut_15_1;
              stackIn_16_2 = stackOut_15_2;
              break L1;
            } else {
              stackOut_14_0 = (RuntimeException) (Object) stackIn_14_0;
              stackOut_14_1 = (StringBuilder) (Object) stackIn_14_1;
              stackOut_14_2 = "{...}";
              stackIn_16_0 = stackOut_14_0;
              stackIn_16_1 = stackOut_14_1;
              stackIn_16_2 = stackOut_14_2;
              break L1;
            }
          }
          throw kk.a((Throwable) (Object) stackIn_16_0, stackIn_16_2 + ',' + false + ')');
        }
        return (Object) (Object) stackIn_11_0;
    }

    public static void a(byte param0) {
        field_g = null;
        field_k = null;
        field_i = null;
        field_e = null;
        field_f = null;
    }

    private final void b(int param0) {
        ((mg) this).field_h = new hj[64];
        if (param0 != 27854) {
            this.b(85);
        }
    }

    private final hj a(int param0, byte param1) {
        int var5 = 0;
        int var4 = 0;
        hj var6 = null;
        int var3 = 0;
        if (((mg) this).field_h[param0] != null) {
        } else {
            var5 = ((mg) this).field_b.field_o - -((mg) this).field_b.field_v;
            var4 = ((mg) this).field_b.field_o - -((mg) this).field_b.field_v;
            var6 = new hj(var4, var5);
            vb.a(-128, var6);
            if (((mg) this).field_d) {
                ((mg) this).field_b.a(15, 16384 + param0 * 1024, ((mg) this).field_a, var4 >> 1, var5 >> 1);
            } else {
                ((mg) this).field_b.b(var4 >> 1, var5 >> 1, 16384 + param0 * 1024, ((mg) this).field_a);
            }
            if (!((mg) this).field_j) {
                var6.c();
            }
            ((mg) this).field_h[param0] = new hj(var6.field_s, var6.field_y);
            ((mg) this).field_h[param0].field_z = var6.field_z;
            ug.b(-1);
        }
        return ((mg) this).field_h[param0];
    }

    mg(hj param0, boolean param1, boolean param2) {
        try {
            ((mg) this).field_d = param2 ? true : false;
            ((mg) this).field_j = param1 ? true : false;
            ((mg) this).field_b = param0;
            ((mg) this).a(4096, false);
        } catch (RuntimeException runtimeException) {
            throw kk.a((Throwable) (Object) runtimeException, "mg.<init>(" + (param0 != null ? "{...}" : "null") + ',' + param1 + ',' + param2 + ')');
        }
    }

    mg(hj param0, int param1, boolean param2, boolean param3) {
        try {
            ((mg) this).field_j = param2 ? true : false;
            ((mg) this).field_d = param3 ? true : false;
            ((mg) this).field_b = param0;
            ((mg) this).a(param1, false);
        } catch (RuntimeException runtimeException) {
            throw kk.a((Throwable) (Object) runtimeException, "mg.<init>(" + (param0 != null ? "{...}" : "null") + ',' + param1 + ',' + param2 + ',' + param3 + ')');
        }
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_c = false;
        field_e = "Members";
        field_i = "Quit";
        field_k = "to keep fullscreen or";
    }
}
