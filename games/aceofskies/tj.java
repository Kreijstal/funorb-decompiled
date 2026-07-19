/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class tj extends ao {
    static String field_n;
    private float field_r;
    private float field_s;
    private float field_g;
    private float field_q;
    private float field_f;
    private float field_e;
    static int field_o;
    private float field_p;
    private float field_l;
    static int field_m;
    private float field_h;
    private float field_k;
    private float field_i;
    private float field_j;

    final float[] a(byte param0) {
        ml.field_h[1] = this.field_h;
        ml.field_h[9] = this.field_p;
        ml.field_h[12] = 0.0f;
        ml.field_h[5] = this.field_j;
        ml.field_h[14] = 0.0f;
        ml.field_h[2] = this.field_f;
        ml.field_h[13] = 0.0f;
        ml.field_h[4] = this.field_l;
        ml.field_h[6] = this.field_q;
        ml.field_h[0] = this.field_i;
        ml.field_h[10] = this.field_r;
        ml.field_h[8] = this.field_s;
        if (param0 <= 97) {
          this.field_h = 1.0541695356369019f;
          return ml.field_h;
        } else {
          return ml.field_h;
        }
    }

    public static void b(byte param0) {
        if (param0 >= -45) {
            return;
        }
        field_n = null;
    }

    final void a(float param0, float param1, float[] param2, float param3, int param4, float param5) {
        RuntimeException var7 = null;
        float var7_float = 0.0f;
        float var8 = 0.0f;
        float var9 = 0.0f;
        float var10 = 0.0f;
        int var11 = 0;
        RuntimeException stackIn_14_0 = null;
        StringBuilder stackIn_14_1 = null;
        RuntimeException stackIn_15_0 = null;
        StringBuilder stackIn_15_1 = null;
        RuntimeException stackIn_16_0 = null;
        StringBuilder stackIn_16_1 = null;
        String stackIn_16_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException stackOut_13_0 = null;
        StringBuilder stackOut_13_1 = null;
        RuntimeException stackOut_15_0 = null;
        StringBuilder stackOut_15_1 = null;
        String stackOut_15_2 = null;
        RuntimeException stackOut_14_0 = null;
        StringBuilder stackOut_14_1 = null;
        String stackOut_14_2 = null;
        var11 = AceOfSkies.field_G ? 1 : 0;
        try {
          L0: {
            L1: {
              if (param4 <= -21) {
                break L1;
              } else {
                this.field_i = 1.9943350553512573f;
                break L1;
              }
            }
            L2: {
              L3: {
                if (0.00390625f < param5) {
                  break L3;
                } else {
                  if (param5 < -0.00390625f) {
                    break L3;
                  } else {
                    L4: {
                      if (param3 > 0.00390625f) {
                        break L4;
                      } else {
                        if (-0.00390625f <= param3) {
                          var10 = -param0 / param1;
                          var9 = this.field_e + var10 * this.field_r;
                          var7_float = this.field_g + this.field_s * var10;
                          var8 = this.field_k + var10 * this.field_p;
                          break L2;
                        } else {
                          break L4;
                        }
                      }
                    }
                    var10 = -param0 / param3;
                    var9 = this.field_e + this.field_q * var10;
                    var8 = this.field_j * var10 + this.field_k;
                    var7_float = var10 * this.field_l + this.field_g;
                    break L2;
                  }
                }
              }
              var10 = -param0 / param5;
              var8 = this.field_k + this.field_h * var10;
              var9 = this.field_f * var10 + this.field_e;
              var7_float = this.field_g + var10 * this.field_i;
              break L2;
            }
            param2[2] = param3 * this.field_q + this.field_f * param5 + param1 * this.field_r;
            param2[0] = this.field_s * param1 + (this.field_i * param5 + this.field_l * param3);
            param2[1] = this.field_p * param1 + (param3 * this.field_j + param5 * this.field_h);
            param2[3] = -(var7_float * param2[0] + param2[1] * var8 + var9 * param2[2]);
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L5: {
            var7 = decompiledCaughtException;
            stackOut_13_0 = (RuntimeException) (var7);
            stackOut_13_1 = new StringBuilder().append("tj.D(").append(param0).append(',').append(param1).append(',');
            stackIn_15_0 = stackOut_13_0;
            stackIn_15_1 = stackOut_13_1;
            stackIn_14_0 = stackOut_13_0;
            stackIn_14_1 = stackOut_13_1;
            if (param2 == null) {
              stackOut_15_0 = (RuntimeException) ((Object) stackIn_15_0);
              stackOut_15_1 = (StringBuilder) ((Object) stackIn_15_1);
              stackOut_15_2 = "null";
              stackIn_16_0 = stackOut_15_0;
              stackIn_16_1 = stackOut_15_1;
              stackIn_16_2 = stackOut_15_2;
              break L5;
            } else {
              stackOut_14_0 = (RuntimeException) ((Object) stackIn_14_0);
              stackOut_14_1 = (StringBuilder) ((Object) stackIn_14_1);
              stackOut_14_2 = "{...}";
              stackIn_16_0 = stackOut_14_0;
              stackIn_16_1 = stackOut_14_1;
              stackIn_16_2 = stackOut_14_2;
              break L5;
            }
          }
          throw pn.a((Throwable) ((Object) stackIn_16_0), stackIn_16_2 + ',' + param3 + ',' + param4 + ',' + param5 + ')');
        }
    }

    private final void c(byte param0) {
        this.field_p = 0.0f;
        this.field_h = 0.0f;
        this.field_j = 1.0f;
        this.field_s = 0.0f;
        if (param0 < 50) {
          return;
        } else {
          this.field_i = 1.0f;
          this.field_g = 0.0f;
          this.field_e = 0.0f;
          this.field_k = 0.0f;
          this.field_q = 0.0f;
          this.field_l = 0.0f;
          this.field_r = 1.0f;
          this.field_f = 0.0f;
          return;
        }
    }

    final static int a(int param0, int param1) {
        int var2 = 0;
        int var3 = 0;
        int var4 = 0;
        var4 = AceOfSkies.field_G ? 1 : 0;
        du.field_m = null;
        wu.field_l = null;
        bm.field_z = 0;
        var2 = l.field_f;
        l.field_f = ah.field_s;
        ul.field_r.field_j = ul.field_r.field_j + 1;
        ah.field_s = var2;
        if ((param1 ^ -1) == -52) {
          ul.field_r.field_e = 2;
          var3 = 97 / ((17 - param0) / 62);
          if (2 <= ul.field_r.field_j) {
            if ((param1 ^ -1) == -52) {
              return 2;
            } else {
              if ((ul.field_r.field_j ^ -1) > -3) {
                if (-5 < (ul.field_r.field_j ^ -1)) {
                  return -1;
                } else {
                  return 1;
                }
              } else {
                if (50 == param1) {
                  return 5;
                } else {
                  if (-5 < (ul.field_r.field_j ^ -1)) {
                    return -1;
                  } else {
                    return 1;
                  }
                }
              }
            }
          } else {
            if ((ul.field_r.field_j ^ -1) > -3) {
              if (-5 < (ul.field_r.field_j ^ -1)) {
                return -1;
              } else {
                return 1;
              }
            } else {
              if (50 == param1) {
                return 5;
              } else {
                if (-5 < (ul.field_r.field_j ^ -1)) {
                  return -1;
                } else {
                  return 1;
                }
              }
            }
          }
        } else {
          if (-51 == (param1 ^ -1)) {
            ul.field_r.field_e = 5;
            var3 = 97 / ((17 - param0) / 62);
            if (2 <= ul.field_r.field_j) {
              if ((param1 ^ -1) != -52) {
                if ((ul.field_r.field_j ^ -1) > -3) {
                  if (-5 >= (ul.field_r.field_j ^ -1)) {
                    return 1;
                  } else {
                    return -1;
                  }
                } else {
                  if (50 != param1) {
                    if (-5 >= (ul.field_r.field_j ^ -1)) {
                      return 1;
                    } else {
                      return -1;
                    }
                  } else {
                    return 5;
                  }
                }
              } else {
                return 2;
              }
            } else {
              if ((ul.field_r.field_j ^ -1) > -3) {
                if (-5 < (ul.field_r.field_j ^ -1)) {
                  return -1;
                } else {
                  return 1;
                }
              } else {
                if (50 != param1) {
                  if (-5 < (ul.field_r.field_j ^ -1)) {
                    return -1;
                  } else {
                    return 1;
                  }
                } else {
                  return 5;
                }
              }
            }
          } else {
            ul.field_r.field_e = 1;
            var3 = 97 / ((17 - param0) / 62);
            if (2 <= ul.field_r.field_j) {
              if ((param1 ^ -1) != -52) {
                if ((ul.field_r.field_j ^ -1) > -3) {
                  if (-5 >= (ul.field_r.field_j ^ -1)) {
                    return 1;
                  } else {
                    return -1;
                  }
                } else {
                  if (50 != param1) {
                    if (-5 >= (ul.field_r.field_j ^ -1)) {
                      return 1;
                    } else {
                      return -1;
                    }
                  } else {
                    return 5;
                  }
                }
              } else {
                return 2;
              }
            } else {
              if ((ul.field_r.field_j ^ -1) > -3) {
                if (-5 >= (ul.field_r.field_j ^ -1)) {
                  return 1;
                } else {
                  return -1;
                }
              } else {
                if (50 != param1) {
                  if (-5 >= (ul.field_r.field_j ^ -1)) {
                    return 1;
                  } else {
                    return -1;
                  }
                } else {
                  return 5;
                }
              }
            }
          }
        }
    }

    final float[] b(int param0) {
        ml.field_h[12] = this.field_g;
        ml.field_h[5] = this.field_j;
        ml.field_h[2] = this.field_f;
        ml.field_h[4] = this.field_l;
        if (param0 <= 102) {
          field_m = -21;
          ml.field_h[8] = this.field_s;
          ml.field_h[14] = this.field_e;
          ml.field_h[13] = this.field_k;
          ml.field_h[10] = this.field_r;
          ml.field_h[9] = this.field_p;
          ml.field_h[0] = this.field_i;
          ml.field_h[1] = this.field_h;
          ml.field_h[6] = this.field_q;
          return ml.field_h;
        } else {
          ml.field_h[8] = this.field_s;
          ml.field_h[14] = this.field_e;
          ml.field_h[13] = this.field_k;
          ml.field_h[10] = this.field_r;
          ml.field_h[9] = this.field_p;
          ml.field_h[0] = this.field_i;
          ml.field_h[1] = this.field_h;
          ml.field_h[6] = this.field_q;
          return ml.field_h;
        }
    }

    final static ll[] a(String param0, String param1, int param2, gk param3) {
        int var4_int = 0;
        RuntimeException var4 = null;
        int var5 = 0;
        ll[] stackIn_1_0 = null;
        RuntimeException stackIn_3_0 = null;
        StringBuilder stackIn_3_1 = null;
        RuntimeException stackIn_4_0 = null;
        StringBuilder stackIn_4_1 = null;
        RuntimeException stackIn_5_0 = null;
        StringBuilder stackIn_5_1 = null;
        String stackIn_5_2 = null;
        RuntimeException stackIn_6_0 = null;
        StringBuilder stackIn_6_1 = null;
        RuntimeException stackIn_7_0 = null;
        StringBuilder stackIn_7_1 = null;
        RuntimeException stackIn_8_0 = null;
        StringBuilder stackIn_8_1 = null;
        String stackIn_8_2 = null;
        RuntimeException stackIn_9_0 = null;
        StringBuilder stackIn_9_1 = null;
        RuntimeException stackIn_10_0 = null;
        StringBuilder stackIn_10_1 = null;
        RuntimeException stackIn_11_0 = null;
        StringBuilder stackIn_11_1 = null;
        String stackIn_11_2 = null;
        RuntimeException decompiledCaughtException = null;
        ll[] stackOut_0_0 = null;
        RuntimeException stackOut_2_0 = null;
        StringBuilder stackOut_2_1 = null;
        RuntimeException stackOut_4_0 = null;
        StringBuilder stackOut_4_1 = null;
        String stackOut_4_2 = null;
        RuntimeException stackOut_3_0 = null;
        StringBuilder stackOut_3_1 = null;
        String stackOut_3_2 = null;
        RuntimeException stackOut_5_0 = null;
        StringBuilder stackOut_5_1 = null;
        RuntimeException stackOut_7_0 = null;
        StringBuilder stackOut_7_1 = null;
        String stackOut_7_2 = null;
        RuntimeException stackOut_6_0 = null;
        StringBuilder stackOut_6_1 = null;
        String stackOut_6_2 = null;
        RuntimeException stackOut_8_0 = null;
        StringBuilder stackOut_8_1 = null;
        RuntimeException stackOut_10_0 = null;
        StringBuilder stackOut_10_1 = null;
        String stackOut_10_2 = null;
        RuntimeException stackOut_9_0 = null;
        StringBuilder stackOut_9_1 = null;
        String stackOut_9_2 = null;
        try {
          L0: {
            var4_int = param3.b(param1, param2 ^ param2);
            var5 = param3.a(-39, var4_int, param0);
            stackOut_0_0 = vc.a(param3, var4_int, (byte) -70, var5);
            stackIn_1_0 = stackOut_0_0;
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L1: {
            var4 = decompiledCaughtException;
            stackOut_2_0 = (RuntimeException) (var4);
            stackOut_2_1 = new StringBuilder().append("tj.G(");
            stackIn_4_0 = stackOut_2_0;
            stackIn_4_1 = stackOut_2_1;
            stackIn_3_0 = stackOut_2_0;
            stackIn_3_1 = stackOut_2_1;
            if (param0 == null) {
              stackOut_4_0 = (RuntimeException) ((Object) stackIn_4_0);
              stackOut_4_1 = (StringBuilder) ((Object) stackIn_4_1);
              stackOut_4_2 = "null";
              stackIn_5_0 = stackOut_4_0;
              stackIn_5_1 = stackOut_4_1;
              stackIn_5_2 = stackOut_4_2;
              break L1;
            } else {
              stackOut_3_0 = (RuntimeException) ((Object) stackIn_3_0);
              stackOut_3_1 = (StringBuilder) ((Object) stackIn_3_1);
              stackOut_3_2 = "{...}";
              stackIn_5_0 = stackOut_3_0;
              stackIn_5_1 = stackOut_3_1;
              stackIn_5_2 = stackOut_3_2;
              break L1;
            }
          }
          L2: {
            stackOut_5_0 = (RuntimeException) ((Object) stackIn_5_0);
            stackOut_5_1 = ((StringBuilder) (Object) stackIn_5_1).append(stackIn_5_2).append(',');
            stackIn_7_0 = stackOut_5_0;
            stackIn_7_1 = stackOut_5_1;
            stackIn_6_0 = stackOut_5_0;
            stackIn_6_1 = stackOut_5_1;
            if (param1 == null) {
              stackOut_7_0 = (RuntimeException) ((Object) stackIn_7_0);
              stackOut_7_1 = (StringBuilder) ((Object) stackIn_7_1);
              stackOut_7_2 = "null";
              stackIn_8_0 = stackOut_7_0;
              stackIn_8_1 = stackOut_7_1;
              stackIn_8_2 = stackOut_7_2;
              break L2;
            } else {
              stackOut_6_0 = (RuntimeException) ((Object) stackIn_6_0);
              stackOut_6_1 = (StringBuilder) ((Object) stackIn_6_1);
              stackOut_6_2 = "{...}";
              stackIn_8_0 = stackOut_6_0;
              stackIn_8_1 = stackOut_6_1;
              stackIn_8_2 = stackOut_6_2;
              break L2;
            }
          }
          L3: {
            stackOut_8_0 = (RuntimeException) ((Object) stackIn_8_0);
            stackOut_8_1 = ((StringBuilder) (Object) stackIn_8_1).append(stackIn_8_2).append(',').append(param2).append(',');
            stackIn_10_0 = stackOut_8_0;
            stackIn_10_1 = stackOut_8_1;
            stackIn_9_0 = stackOut_8_0;
            stackIn_9_1 = stackOut_8_1;
            if (param3 == null) {
              stackOut_10_0 = (RuntimeException) ((Object) stackIn_10_0);
              stackOut_10_1 = (StringBuilder) ((Object) stackIn_10_1);
              stackOut_10_2 = "null";
              stackIn_11_0 = stackOut_10_0;
              stackIn_11_1 = stackOut_10_1;
              stackIn_11_2 = stackOut_10_2;
              break L3;
            } else {
              stackOut_9_0 = (RuntimeException) ((Object) stackIn_9_0);
              stackOut_9_1 = (StringBuilder) ((Object) stackIn_9_1);
              stackOut_9_2 = "{...}";
              stackIn_11_0 = stackOut_9_0;
              stackIn_11_1 = stackOut_9_1;
              stackIn_11_2 = stackOut_9_2;
              break L3;
            }
          }
          throw pn.a((Throwable) ((Object) stackIn_11_0), stackIn_11_2 + ')');
        }
        return stackIn_1_0;
    }

    tj() {
        this.c((byte) 75);
    }

    static {
        field_n = "Passwords must be between 5 and 20 letters and numbers";
        field_m = 0;
    }
}
