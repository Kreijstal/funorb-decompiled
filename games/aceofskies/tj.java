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
        ml.field_h[1] = ((tj) this).field_h;
        ml.field_h[9] = ((tj) this).field_p;
        ml.field_h[12] = 0.0f;
        ml.field_h[5] = ((tj) this).field_j;
        ml.field_h[14] = 0.0f;
        ml.field_h[2] = ((tj) this).field_f;
        ml.field_h[13] = 0.0f;
        ml.field_h[4] = ((tj) this).field_l;
        ml.field_h[6] = ((tj) this).field_q;
        ml.field_h[0] = ((tj) this).field_i;
        ml.field_h[10] = ((tj) this).field_r;
        ml.field_h[8] = ((tj) this).field_s;
        if (param0 <= 97) {
          ((tj) this).field_h = 1.0541695356369019f;
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
        float var7 = 0.0f;
        float var8 = 0.0f;
        float var9 = 0.0f;
        float var10 = 0.0f;
        int var11 = 0;
        var11 = AceOfSkies.field_G ? 1 : 0;
        if (param4 <= -21) {
          if (0.00390625f >= param5) {
            if (param5 >= -0.00390625f) {
              if (param3 <= 0.00390625f) {
                if (-0.00390625f > param3) {
                  var10 = -param0 / param3;
                  var9 = ((tj) this).field_e + ((tj) this).field_q * var10;
                  var8 = ((tj) this).field_j * var10 + ((tj) this).field_k;
                  var7 = var10 * ((tj) this).field_l + ((tj) this).field_g;
                  param2[2] = param3 * ((tj) this).field_q + ((tj) this).field_f * param5 + param1 * ((tj) this).field_r;
                  param2[0] = ((tj) this).field_s * param1 + (((tj) this).field_i * param5 + ((tj) this).field_l * param3);
                  param2[1] = ((tj) this).field_p * param1 + (param3 * ((tj) this).field_j + param5 * ((tj) this).field_h);
                  param2[3] = -(var7 * param2[0] + param2[1] * var8 + var9 * param2[2]);
                  return;
                } else {
                  var10 = -param0 / param1;
                  var9 = ((tj) this).field_e + var10 * ((tj) this).field_r;
                  var7 = ((tj) this).field_g + ((tj) this).field_s * var10;
                  var8 = ((tj) this).field_k + var10 * ((tj) this).field_p;
                  param2[2] = param3 * ((tj) this).field_q + ((tj) this).field_f * param5 + param1 * ((tj) this).field_r;
                  param2[0] = ((tj) this).field_s * param1 + (((tj) this).field_i * param5 + ((tj) this).field_l * param3);
                  param2[1] = ((tj) this).field_p * param1 + (param3 * ((tj) this).field_j + param5 * ((tj) this).field_h);
                  param2[3] = -(var7 * param2[0] + param2[1] * var8 + var9 * param2[2]);
                  return;
                }
              } else {
                var10 = -param0 / param3;
                var9 = ((tj) this).field_e + ((tj) this).field_q * var10;
                var8 = ((tj) this).field_j * var10 + ((tj) this).field_k;
                var7 = var10 * ((tj) this).field_l + ((tj) this).field_g;
                param2[2] = param3 * ((tj) this).field_q + ((tj) this).field_f * param5 + param1 * ((tj) this).field_r;
                param2[0] = ((tj) this).field_s * param1 + (((tj) this).field_i * param5 + ((tj) this).field_l * param3);
                param2[1] = ((tj) this).field_p * param1 + (param3 * ((tj) this).field_j + param5 * ((tj) this).field_h);
                param2[3] = -(var7 * param2[0] + param2[1] * var8 + var9 * param2[2]);
                return;
              }
            } else {
              var10 = -param0 / param5;
              var8 = ((tj) this).field_k + ((tj) this).field_h * var10;
              var9 = ((tj) this).field_f * var10 + ((tj) this).field_e;
              var7 = ((tj) this).field_g + var10 * ((tj) this).field_i;
              param2[2] = param3 * ((tj) this).field_q + ((tj) this).field_f * param5 + param1 * ((tj) this).field_r;
              param2[0] = ((tj) this).field_s * param1 + (((tj) this).field_i * param5 + ((tj) this).field_l * param3);
              param2[1] = ((tj) this).field_p * param1 + (param3 * ((tj) this).field_j + param5 * ((tj) this).field_h);
              param2[3] = -(var7 * param2[0] + param2[1] * var8 + var9 * param2[2]);
              return;
            }
          } else {
            var10 = -param0 / param5;
            var8 = ((tj) this).field_k + ((tj) this).field_h * var10;
            var9 = ((tj) this).field_f * var10 + ((tj) this).field_e;
            var7 = ((tj) this).field_g + var10 * ((tj) this).field_i;
            param2[2] = param3 * ((tj) this).field_q + ((tj) this).field_f * param5 + param1 * ((tj) this).field_r;
            param2[0] = ((tj) this).field_s * param1 + (((tj) this).field_i * param5 + ((tj) this).field_l * param3);
            param2[1] = ((tj) this).field_p * param1 + (param3 * ((tj) this).field_j + param5 * ((tj) this).field_h);
            param2[3] = -(var7 * param2[0] + param2[1] * var8 + var9 * param2[2]);
            return;
          }
        } else {
          L0: {
            L1: {
              ((tj) this).field_i = 1.9943350553512573f;
              if (0.00390625f < param5) {
                break L1;
              } else {
                if (param5 < -0.00390625f) {
                  break L1;
                } else {
                  L2: {
                    if (param3 > 0.00390625f) {
                      break L2;
                    } else {
                      if (-0.00390625f <= param3) {
                        var10 = -param0 / param1;
                        var9 = ((tj) this).field_e + var10 * ((tj) this).field_r;
                        var7 = ((tj) this).field_g + ((tj) this).field_s * var10;
                        var8 = ((tj) this).field_k + var10 * ((tj) this).field_p;
                        break L0;
                      } else {
                        break L2;
                      }
                    }
                  }
                  var10 = -param0 / param3;
                  var9 = ((tj) this).field_e + ((tj) this).field_q * var10;
                  var8 = ((tj) this).field_j * var10 + ((tj) this).field_k;
                  var7 = var10 * ((tj) this).field_l + ((tj) this).field_g;
                  break L0;
                }
              }
            }
            var10 = -param0 / param5;
            var8 = ((tj) this).field_k + ((tj) this).field_h * var10;
            var9 = ((tj) this).field_f * var10 + ((tj) this).field_e;
            var7 = ((tj) this).field_g + var10 * ((tj) this).field_i;
            break L0;
          }
          param2[2] = param3 * ((tj) this).field_q + ((tj) this).field_f * param5 + param1 * ((tj) this).field_r;
          param2[0] = ((tj) this).field_s * param1 + (((tj) this).field_i * param5 + ((tj) this).field_l * param3);
          param2[1] = ((tj) this).field_p * param1 + (param3 * ((tj) this).field_j + param5 * ((tj) this).field_h);
          param2[3] = -(var7 * param2[0] + param2[1] * var8 + var9 * param2[2]);
          return;
        }
    }

    private final void c(byte param0) {
        ((tj) this).field_p = 0.0f;
        ((tj) this).field_h = 0.0f;
        ((tj) this).field_j = 1.0f;
        ((tj) this).field_s = 0.0f;
        if (param0 < 50) {
          return;
        } else {
          ((tj) this).field_i = 1.0f;
          ((tj) this).field_g = 0.0f;
          ((tj) this).field_e = 0.0f;
          ((tj) this).field_k = 0.0f;
          ((tj) this).field_q = 0.0f;
          ((tj) this).field_l = 0.0f;
          ((tj) this).field_r = 1.0f;
          ((tj) this).field_f = 0.0f;
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
        if (param1 == -52) {
          ul.field_r.field_e = 2;
          var3 = 97 / ((17 - param0) / 62);
          if (2 <= ul.field_r.field_j) {
            if ((param1 ^ -1) == -52) {
              return 2;
            } else {
              if (ul.field_r.field_j > -3) {
                if (-5 < (ul.field_r.field_j ^ -1)) {
                  return -1;
                } else {
                  return 1;
                }
              } else {
                if (50 == param1) {
                  return 5;
                } else {
                  if (-5 > ul.field_r.field_j) {
                    return -1;
                  } else {
                    return 1;
                  }
                }
              }
            }
          } else {
            if (ul.field_r.field_j > -3) {
              if (-5 < (ul.field_r.field_j ^ -1)) {
                return -1;
              } else {
                return 1;
              }
            } else {
              if (50 == param1) {
                return 5;
              } else {
                if (-5 > ul.field_r.field_j) {
                  return -1;
                } else {
                  return 1;
                }
              }
            }
          }
        } else {
          if (-51 == param1) {
            ul.field_r.field_e = 5;
            var3 = 97 / ((17 - param0) / 62);
            if (2 <= ul.field_r.field_j) {
              if ((param1 ^ -1) != -52) {
                if (ul.field_r.field_j > -3) {
                  if (-5 >= (ul.field_r.field_j ^ -1)) {
                    return 1;
                  } else {
                    return -1;
                  }
                } else {
                  if (50 != param1) {
                    if (-5 <= ul.field_r.field_j) {
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
              if (ul.field_r.field_j > -3) {
                if (-5 < (ul.field_r.field_j ^ -1)) {
                  return -1;
                } else {
                  return 1;
                }
              } else {
                if (50 != param1) {
                  if (-5 > ul.field_r.field_j) {
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
                if (ul.field_r.field_j > -3) {
                  if (-5 >= (ul.field_r.field_j ^ -1)) {
                    return 1;
                  } else {
                    return -1;
                  }
                } else {
                  if (50 != param1) {
                    if (-5 <= ul.field_r.field_j) {
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
              if (ul.field_r.field_j > -3) {
                if (-5 >= (ul.field_r.field_j ^ -1)) {
                  return 1;
                } else {
                  return -1;
                }
              } else {
                if (50 != param1) {
                  if (-5 <= ul.field_r.field_j) {
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
        ml.field_h[12] = ((tj) this).field_g;
        ml.field_h[5] = ((tj) this).field_j;
        ml.field_h[2] = ((tj) this).field_f;
        ml.field_h[4] = ((tj) this).field_l;
        if (param0 <= 102) {
          field_m = -21;
          ml.field_h[8] = ((tj) this).field_s;
          ml.field_h[14] = ((tj) this).field_e;
          ml.field_h[13] = ((tj) this).field_k;
          ml.field_h[10] = ((tj) this).field_r;
          ml.field_h[9] = ((tj) this).field_p;
          ml.field_h[0] = ((tj) this).field_i;
          ml.field_h[1] = ((tj) this).field_h;
          ml.field_h[6] = ((tj) this).field_q;
          return ml.field_h;
        } else {
          ml.field_h[8] = ((tj) this).field_s;
          ml.field_h[14] = ((tj) this).field_e;
          ml.field_h[13] = ((tj) this).field_k;
          ml.field_h[10] = ((tj) this).field_r;
          ml.field_h[9] = ((tj) this).field_p;
          ml.field_h[0] = ((tj) this).field_i;
          ml.field_h[1] = ((tj) this).field_h;
          ml.field_h[6] = ((tj) this).field_q;
          return ml.field_h;
        }
    }

    final static ll[] a(String param0, String param1, int param2, gk param3) {
        int var4 = param3.b(param1, param2 ^ param2);
        int var5 = param3.a(-39, var4, param0);
        return vc.a(param3, var4, (byte) -70, var5);
    }

    tj() {
        this.c((byte) 75);
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_n = "Passwords must be between 5 and 20 letters and numbers";
        field_m = 0;
    }
}
