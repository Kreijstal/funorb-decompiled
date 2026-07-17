/*
 * Decompiled by CFR-JS 0.4.0.
 */
class vp extends df {
    static int[] field_s;
    static String field_t;
    static int field_r;
    static ar field_o;
    vp field_p;
    vp field_q;

    final static void c(int param0, int param1) {
        RuntimeException var2 = null;
        int var2_int = 0;
        int var3 = 0;
        wa var4 = null;
        int var5 = 0;
        int var6 = 0;
        int var7 = 0;
        int var8 = 0;
        int var9 = 0;
        int var10 = 0;
        int var11 = 0;
        int var12 = 0;
        Object var13 = null;
        RuntimeException decompiledCaughtException = null;
        var12 = ShatteredPlansClient.field_F ? 1 : 0;
        try {
          L0: {
            L1: {
              if (param0 == -20677) {
                break L1;
              } else {
                var13 = null;
                byte[] discarded$4 = vp.a((String) null, 69);
                break L1;
              }
            }
            var2_int = 16711935 & param1;
            lk.a(param0 ^ 27840);
            var3 = param1 & 65280;
            L2: while (true) {
              wa dupTemp$5 = tf.a((byte) -92);
              var4 = dupTemp$5;
              if (dupTemp$5 == null) {
                L3: {
                  if (bd.field_A) {
                    System.out.println(ms.field_a);
                    break L3;
                  } else {
                    break L3;
                  }
                }
                break L0;
              } else {
                var5 = gf.field_b * ui.field_p + var4.field_g;
                if (gf.field_b <= var4.field_g) {
                  continue L2;
                } else {
                  L4: {
                    var6 = 511 & var4.field_e;
                    if (var6 > 256) {
                      var6 = 512 + -var6;
                      break L4;
                    } else {
                      break L4;
                    }
                  }
                  L5: {
                    var7 = 256 - var6;
                    var8 = var4.field_h;
                    var9 = var4.field_f;
                    if (0 > var4.field_g) {
                      var11 = -var4.field_g - 1;
                      var8 = var8 - var11;
                      var5 = var5 - var4.field_g;
                      var9 = var9 - var11 * var4.field_a;
                      var4.field_g = 0;
                      break L5;
                    } else {
                      var10 = gf.field_h[var5];
                      var10 = ((var7 * (16711935 & var10) & -16711936) + (-16711936 & var2_int * var6) | (var7 * (var10 & 65280) & 16711680) - -(16711680 & var3 * var6)) >>> 8;
                      int incrementValue$6 = var5;
                      var5++;
                      gf.field_h[incrementValue$6] = var10;
                      break L5;
                    }
                  }
                  L6: {
                    if (1000 >= var8) {
                      break L6;
                    } else {
                      var8 = 1000;
                      break L6;
                    }
                  }
                  L7: {
                    if (var8 + var4.field_g <= gf.field_b) {
                      break L7;
                    } else {
                      var8 = -var4.field_g + gf.field_b;
                      break L7;
                    }
                  }
                  L8: while (true) {
                    var8--;
                    if (var8 <= 0) {
                      continue L2;
                    } else {
                      L9: {
                        var6 = 511 & var9;
                        if (var6 <= 256) {
                          break L9;
                        } else {
                          var6 = 512 + -var6;
                          break L9;
                        }
                      }
                      var10 = gf.field_h[var5];
                      var7 = -var6 + 256;
                      var10 = ((16711680 & var6 * var3) + (var7 * (65280 & var10) & 16711680) | (var2_int * var6 & -16711936) + (-16711936 & (16711935 & var10) * var7)) >>> 8;
                      int incrementValue$7 = var5;
                      var5++;
                      gf.field_h[incrementValue$7] = var10;
                      var9 = var9 + var4.field_a;
                      continue L8;
                    }
                  }
                }
              }
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2 = decompiledCaughtException;
          throw r.a((Throwable) (Object) var2, "vp.I(" + param0 + 44 + param1 + 41);
        }
    }

    final void d(boolean param0) {
        if (((vp) this).field_p == null) {
            return;
        }
        ((vp) this).field_p.field_q = ((vp) this).field_q;
        if (!param0) {
            ((vp) this).field_q = null;
        }
        ((vp) this).field_q.field_p = ((vp) this).field_p;
        ((vp) this).field_p = null;
        ((vp) this).field_q = null;
    }

    final static eg a(byte param0, ln param1) {
        oh var2 = null;
        RuntimeException var2_ref = null;
        eg var3 = null;
        fs[] var4 = null;
        int var5 = 0;
        fs var6 = null;
        int var7 = 0;
        Object stackIn_3_0 = null;
        eg stackIn_19_0 = null;
        RuntimeException stackIn_25_0 = null;
        StringBuilder stackIn_25_1 = null;
        RuntimeException stackIn_26_0 = null;
        StringBuilder stackIn_26_1 = null;
        RuntimeException stackIn_27_0 = null;
        StringBuilder stackIn_27_1 = null;
        String stackIn_27_2 = null;
        RuntimeException decompiledCaughtException = null;
        eg stackOut_18_0 = null;
        Object stackOut_2_0 = null;
        RuntimeException stackOut_24_0 = null;
        StringBuilder stackOut_24_1 = null;
        RuntimeException stackOut_26_0 = null;
        StringBuilder stackOut_26_1 = null;
        String stackOut_26_2 = null;
        RuntimeException stackOut_25_0 = null;
        StringBuilder stackOut_25_1 = null;
        String stackOut_25_2 = null;
        var7 = ShatteredPlansClient.field_F ? 1 : 0;
        try {
          if (param0 == -69) {
            if (oq.field_a.field_Q != null) {
              var2 = oq.field_a.field_Q.field_a.d(param0 ^ -69);
              L0: while (true) {
                if (var2 != null) {
                  L1: {
                    if (!(var2 instanceof eg)) {
                      break L1;
                    } else {
                      var3 = (eg) (Object) var2;
                      if (param1 == var3.field_p) {
                        var4 = var3.field_h;
                        var5 = 0;
                        L2: while (true) {
                          if (var5 < var4.length) {
                            var6 = var4[var5];
                            if (var6 == ho.field_d) {
                              stackOut_18_0 = (eg) var3;
                              stackIn_19_0 = stackOut_18_0;
                              return stackIn_19_0;
                            } else {
                              var5++;
                              continue L2;
                            }
                          } else {
                            return null;
                          }
                        }
                      } else {
                        break L1;
                      }
                    }
                  }
                  var2 = oq.field_a.field_Q.field_a.a((byte) -71);
                  continue L0;
                } else {
                  return null;
                }
              }
            } else {
              return null;
            }
          } else {
            stackOut_2_0 = null;
            stackIn_3_0 = stackOut_2_0;
            return (eg) (Object) stackIn_3_0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L3: {
            var2_ref = decompiledCaughtException;
            stackOut_24_0 = (RuntimeException) var2_ref;
            stackOut_24_1 = new StringBuilder().append("vp.H(").append(param0).append(44);
            stackIn_26_0 = stackOut_24_0;
            stackIn_26_1 = stackOut_24_1;
            stackIn_25_0 = stackOut_24_0;
            stackIn_25_1 = stackOut_24_1;
            if (param1 == null) {
              stackOut_26_0 = (RuntimeException) (Object) stackIn_26_0;
              stackOut_26_1 = (StringBuilder) (Object) stackIn_26_1;
              stackOut_26_2 = "null";
              stackIn_27_0 = stackOut_26_0;
              stackIn_27_1 = stackOut_26_1;
              stackIn_27_2 = stackOut_26_2;
              break L3;
            } else {
              stackOut_25_0 = (RuntimeException) (Object) stackIn_25_0;
              stackOut_25_1 = (StringBuilder) (Object) stackIn_25_1;
              stackOut_25_2 = "{...}";
              stackIn_27_0 = stackOut_25_0;
              stackIn_27_1 = stackOut_25_1;
              stackIn_27_2 = stackOut_25_2;
              break L3;
            }
          }
          throw r.a((Throwable) (Object) stackIn_27_0, stackIn_27_2 + 41);
        }
    }

    public static void e(byte param0) {
        if (param0 != -21) {
            vp.e((byte) -56);
        }
        field_o = null;
        field_s = null;
        field_t = null;
    }

    final static byte[] a(String param0, int param1) {
        RuntimeException var2 = null;
        Object stackIn_2_0 = null;
        byte[] stackIn_4_0 = null;
        RuntimeException stackIn_6_0 = null;
        StringBuilder stackIn_6_1 = null;
        RuntimeException stackIn_7_0 = null;
        StringBuilder stackIn_7_1 = null;
        RuntimeException stackIn_8_0 = null;
        StringBuilder stackIn_8_1 = null;
        String stackIn_8_2 = null;
        RuntimeException decompiledCaughtException = null;
        byte[] stackOut_3_0 = null;
        Object stackOut_1_0 = null;
        RuntimeException stackOut_5_0 = null;
        StringBuilder stackOut_5_1 = null;
        RuntimeException stackOut_7_0 = null;
        StringBuilder stackOut_7_1 = null;
        String stackOut_7_2 = null;
        RuntimeException stackOut_6_0 = null;
        StringBuilder stackOut_6_1 = null;
        String stackOut_6_2 = null;
        try {
          L0: {
            if (param1 == 511) {
              stackOut_3_0 = bc.field_d.a(true, param0, "");
              stackIn_4_0 = stackOut_3_0;
              break L0;
            } else {
              stackOut_1_0 = null;
              stackIn_2_0 = stackOut_1_0;
              return (byte[]) (Object) stackIn_2_0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L1: {
            var2 = decompiledCaughtException;
            stackOut_5_0 = (RuntimeException) var2;
            stackOut_5_1 = new StringBuilder().append("vp.G(");
            stackIn_7_0 = stackOut_5_0;
            stackIn_7_1 = stackOut_5_1;
            stackIn_6_0 = stackOut_5_0;
            stackIn_6_1 = stackOut_5_1;
            if (param0 == null) {
              stackOut_7_0 = (RuntimeException) (Object) stackIn_7_0;
              stackOut_7_1 = (StringBuilder) (Object) stackIn_7_1;
              stackOut_7_2 = "null";
              stackIn_8_0 = stackOut_7_0;
              stackIn_8_1 = stackOut_7_1;
              stackIn_8_2 = stackOut_7_2;
              break L1;
            } else {
              stackOut_6_0 = (RuntimeException) (Object) stackIn_6_0;
              stackOut_6_1 = (StringBuilder) (Object) stackIn_6_1;
              stackOut_6_2 = "{...}";
              stackIn_8_0 = stackOut_6_0;
              stackIn_8_1 = stackOut_6_1;
              stackIn_8_2 = stackOut_6_2;
              break L1;
            }
          }
          throw r.a((Throwable) (Object) stackIn_8_0, stackIn_8_2 + 44 + param1 + 41);
        }
        return stackIn_4_0;
    }

    vp() {
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_t = "<%0> HAS WON!";
        field_s = new int[4];
    }
}
