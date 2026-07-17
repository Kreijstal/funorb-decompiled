/*
 * Decompiled by CFR-JS 0.4.0.
 */
import java.io.*;
import java.lang.Class;
import java.net.URL;
import java.lang.String;

final class di extends um {
    private int field_Q;
    private int[] field_P;
    static String field_cb;
    private cg[][] field_gb;
    static int[] field_V;
    private int[] field_w;
    static int field_K;
    private int field_r;
    private int[] field_db;
    private int[] field_S;
    private int[] field_H;
    private tg field_F;
    static cl field_D;
    static ea field_ab;
    private int[] field_I;
    private int[] field_R;
    private int[] field_y;
    private int[] field_B;
    static gi field_O;
    static int field_Z;
    int[] field_Y;
    private int[] field_T;
    private nl field_eb;
    int[] field_u;
    private cg[][] field_U;
    int[] field_v;
    private int[] field_J;
    private int[] field_s;
    static String field_E;
    private int[] field_N;
    static int[] field_x;
    static int field_X;
    private long field_fb;
    private int field_W;
    private int field_bb;
    private gd field_z;
    private boolean field_C;
    private long field_t;
    private wh field_L;
    private boolean field_A;
    private int field_M;

    private final void b(boolean param0) {
        int var3 = 0;
        int var4 = MinerDisturbance.field_ab;
        if (param0) {
            this.a(-1, -10911);
        } else {
            this.e(-1, 110);
        }
        this.b(-1, 0);
        for (var3 = 0; var3 < 16; var3++) {
            ((di) this).field_J[var3] = ((di) this).field_y[var3];
        }
        int var5 = 0;
        var3 = var5;
        while (var5 < 16) {
            ((di) this).field_B[var5] = c.a(((di) this).field_y[var5], -128);
            var5++;
        }
    }

    final synchronized void a(int[] param0, int param1, int param2) {
        int var4_int = 0;
        RuntimeException var4 = null;
        long var5 = 0L;
        int var7 = 0;
        int var8 = 0;
        RuntimeException stackIn_11_0 = null;
        StringBuilder stackIn_11_1 = null;
        RuntimeException stackIn_12_0 = null;
        StringBuilder stackIn_12_1 = null;
        RuntimeException stackIn_13_0 = null;
        StringBuilder stackIn_13_1 = null;
        String stackIn_13_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException stackOut_10_0 = null;
        StringBuilder stackOut_10_1 = null;
        RuntimeException stackOut_12_0 = null;
        StringBuilder stackOut_12_1 = null;
        String stackOut_12_2 = null;
        RuntimeException stackOut_11_0 = null;
        StringBuilder stackOut_11_1 = null;
        String stackOut_11_2 = null;
        var8 = MinerDisturbance.field_ab;
        try {
          L0: {
            L1: {
              if (!((di) this).field_eb.e()) {
                break L1;
              } else {
                var4_int = ((di) this).field_eb.field_g * ((di) this).field_r / fj.field_r;
                L2: while (true) {
                  var5 = ((di) this).field_fb - -((long)var4_int * (long)param2);
                  if (-var5 + ((di) this).field_t >= 0L) {
                    ((di) this).field_fb = var5;
                    break L1;
                  } else {
                    var7 = (int)((-1L + ((di) this).field_t - (((di) this).field_fb - (long)var4_int)) / (long)var4_int);
                    ((di) this).field_fb = ((di) this).field_fb + (long)var4_int * (long)var7;
                    ((di) this).field_z.a(param0, param1, var7);
                    param2 = param2 - var7;
                    int discarded$1 = 128;
                    this.f();
                    param1 = param1 + var7;
                    if (!((di) this).field_eb.e()) {
                      break L1;
                    } else {
                      continue L2;
                    }
                  }
                }
              }
            }
            ((di) this).field_z.a(param0, param1, param2);
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L3: {
            var4 = decompiledCaughtException;
            stackOut_10_0 = (RuntimeException) var4;
            stackOut_10_1 = new StringBuilder().append("di.R(");
            stackIn_12_0 = stackOut_10_0;
            stackIn_12_1 = stackOut_10_1;
            stackIn_11_0 = stackOut_10_0;
            stackIn_11_1 = stackOut_10_1;
            if (param0 == null) {
              stackOut_12_0 = (RuntimeException) (Object) stackIn_12_0;
              stackOut_12_1 = (StringBuilder) (Object) stackIn_12_1;
              stackOut_12_2 = "null";
              stackIn_13_0 = stackOut_12_0;
              stackIn_13_1 = stackOut_12_1;
              stackIn_13_2 = stackOut_12_2;
              break L3;
            } else {
              stackOut_11_0 = (RuntimeException) (Object) stackIn_11_0;
              stackOut_11_1 = (StringBuilder) (Object) stackIn_11_1;
              stackOut_11_2 = "{...}";
              stackIn_13_0 = stackOut_11_0;
              stackIn_13_1 = stackOut_11_1;
              stackIn_13_2 = stackOut_11_2;
              break L3;
            }
          }
          throw lj.a((Throwable) (Object) stackIn_13_0, stackIn_13_2 + 44 + param1 + 44 + param2 + 41);
        }
    }

    final synchronized um c() {
        return null;
    }

    final static Class a(byte param0, String param1) throws ClassNotFoundException {
        RuntimeException var2 = null;
        Class stackIn_3_0 = null;
        Class stackIn_7_0 = null;
        Class stackIn_10_0 = null;
        Class stackIn_14_0 = null;
        Class stackIn_17_0 = null;
        Class stackIn_20_0 = null;
        Class stackIn_24_0 = null;
        Class stackIn_30_0 = null;
        RuntimeException stackIn_32_0 = null;
        StringBuilder stackIn_32_1 = null;
        RuntimeException stackIn_33_0 = null;
        StringBuilder stackIn_33_1 = null;
        RuntimeException stackIn_34_0 = null;
        StringBuilder stackIn_34_1 = null;
        String stackIn_34_2 = null;
        RuntimeException decompiledCaughtException = null;
        Class stackOut_2_0 = null;
        Class stackOut_6_0 = null;
        Class stackOut_13_0 = null;
        Class stackOut_23_0 = null;
        Class stackOut_29_0 = null;
        Class stackOut_19_0 = null;
        Class stackOut_16_0 = null;
        Class stackOut_9_0 = null;
        RuntimeException stackOut_31_0 = null;
        StringBuilder stackOut_31_1 = null;
        RuntimeException stackOut_33_0 = null;
        StringBuilder stackOut_33_1 = null;
        String stackOut_33_2 = null;
        RuntimeException stackOut_32_0 = null;
        StringBuilder stackOut_32_1 = null;
        String stackOut_32_2 = null;
        try {
          L0: {
            if (param1.equals((Object) (Object) "B")) {
              stackOut_2_0 = Byte.TYPE;
              stackIn_3_0 = stackOut_2_0;
              return stackIn_3_0;
            } else {
              if (param1.equals((Object) (Object) "I")) {
                stackOut_6_0 = Integer.TYPE;
                stackIn_7_0 = stackOut_6_0;
                return stackIn_7_0;
              } else {
                if (!param1.equals((Object) (Object) "S")) {
                  if (param1.equals((Object) (Object) "J")) {
                    stackOut_13_0 = Long.TYPE;
                    stackIn_14_0 = stackOut_13_0;
                    return stackIn_14_0;
                  } else {
                    if (!param1.equals((Object) (Object) "Z")) {
                      if (!param1.equals((Object) (Object) "F")) {
                        if (param1.equals((Object) (Object) "D")) {
                          stackOut_23_0 = Double.TYPE;
                          stackIn_24_0 = stackOut_23_0;
                          return stackIn_24_0;
                        } else {
                          L1: {
                            if (param0 > 36) {
                              break L1;
                            } else {
                              int discarded$2 = di.a(true);
                              break L1;
                            }
                          }
                          if (param1.equals((Object) (Object) "C")) {
                            stackOut_29_0 = Character.TYPE;
                            stackIn_30_0 = stackOut_29_0;
                            break L0;
                          } else {
                            return Class.forName(param1);
                          }
                        }
                      } else {
                        stackOut_19_0 = Float.TYPE;
                        stackIn_20_0 = stackOut_19_0;
                        return stackIn_20_0;
                      }
                    } else {
                      stackOut_16_0 = Boolean.TYPE;
                      stackIn_17_0 = stackOut_16_0;
                      return stackIn_17_0;
                    }
                  }
                } else {
                  stackOut_9_0 = Short.TYPE;
                  stackIn_10_0 = stackOut_9_0;
                  return stackIn_10_0;
                }
              }
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L2: {
            var2 = decompiledCaughtException;
            stackOut_31_0 = (RuntimeException) var2;
            stackOut_31_1 = new StringBuilder().append("di.PA(").append(param0).append(44);
            stackIn_33_0 = stackOut_31_0;
            stackIn_33_1 = stackOut_31_1;
            stackIn_32_0 = stackOut_31_0;
            stackIn_32_1 = stackOut_31_1;
            if (param1 == null) {
              stackOut_33_0 = (RuntimeException) (Object) stackIn_33_0;
              stackOut_33_1 = (StringBuilder) (Object) stackIn_33_1;
              stackOut_33_2 = "null";
              stackIn_34_0 = stackOut_33_0;
              stackIn_34_1 = stackOut_33_1;
              stackIn_34_2 = stackOut_33_2;
              break L2;
            } else {
              stackOut_32_0 = (RuntimeException) (Object) stackIn_32_0;
              stackOut_32_1 = (StringBuilder) (Object) stackIn_32_1;
              stackOut_32_2 = "{...}";
              stackIn_34_0 = stackOut_32_0;
              stackIn_34_1 = stackOut_32_1;
              stackIn_34_2 = stackOut_32_2;
              break L2;
            }
          }
          throw lj.a((Throwable) (Object) stackIn_34_0, stackIn_34_2 + 41);
        }
        return stackIn_30_0;
    }

    private final void a(int param0, byte param1, int param2) {
        ((di) this).field_s[param0] = param2;
        ((di) this).field_u[param0] = (int)(0.5 + Math.pow(2.0, 0.00054931640625 * (double)param2) * 2097152.0);
        if (param1 < 95) {
            ((di) this).field_I = null;
        }
    }

    private final int a(byte param0, cg param1) {
        int var3_int = 0;
        RuntimeException var3 = null;
        int stackIn_4_0 = 0;
        int stackIn_6_0 = 0;
        RuntimeException stackIn_8_0 = null;
        StringBuilder stackIn_8_1 = null;
        RuntimeException stackIn_9_0 = null;
        StringBuilder stackIn_9_1 = null;
        RuntimeException stackIn_10_0 = null;
        StringBuilder stackIn_10_1 = null;
        String stackIn_10_2 = null;
        RuntimeException decompiledCaughtException = null;
        int stackOut_5_0 = 0;
        int stackOut_3_0 = 0;
        RuntimeException stackOut_7_0 = null;
        StringBuilder stackOut_7_1 = null;
        RuntimeException stackOut_9_0 = null;
        StringBuilder stackOut_9_1 = null;
        String stackOut_9_2 = null;
        RuntimeException stackOut_8_0 = null;
        StringBuilder stackOut_8_1 = null;
        String stackOut_8_2 = null;
        try {
          L0: {
            L1: {
              var3_int = ((di) this).field_N[param1.field_n];
              if (param0 >= 82) {
                break L1;
              } else {
                ((di) this).field_y = null;
                break L1;
              }
            }
            if (var3_int >= 8192) {
              stackOut_5_0 = 16384 - ((128 - param1.field_E) * (-var3_int + 16384) + 32 >> 6);
              stackIn_6_0 = stackOut_5_0;
              break L0;
            } else {
              stackOut_3_0 = var3_int * param1.field_E - -32 >> 6;
              stackIn_4_0 = stackOut_3_0;
              return stackIn_4_0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L2: {
            var3 = decompiledCaughtException;
            stackOut_7_0 = (RuntimeException) var3;
            stackOut_7_1 = new StringBuilder().append("di.EA(").append(param0).append(44);
            stackIn_9_0 = stackOut_7_0;
            stackIn_9_1 = stackOut_7_1;
            stackIn_8_0 = stackOut_7_0;
            stackIn_8_1 = stackOut_7_1;
            if (param1 == null) {
              stackOut_9_0 = (RuntimeException) (Object) stackIn_9_0;
              stackOut_9_1 = (StringBuilder) (Object) stackIn_9_1;
              stackOut_9_2 = "null";
              stackIn_10_0 = stackOut_9_0;
              stackIn_10_1 = stackOut_9_1;
              stackIn_10_2 = stackOut_9_2;
              break L2;
            } else {
              stackOut_8_0 = (RuntimeException) (Object) stackIn_8_0;
              stackOut_8_1 = (StringBuilder) (Object) stackIn_8_1;
              stackOut_8_2 = "{...}";
              stackIn_10_0 = stackOut_8_0;
              stackIn_10_1 = stackOut_8_1;
              stackIn_10_2 = stackOut_8_2;
              break L2;
            }
          }
          throw lj.a((Throwable) (Object) stackIn_10_0, stackIn_10_2 + 41);
        }
        return stackIn_6_0;
    }

    private final synchronized void a(boolean param0, boolean param1) {
        ((di) this).field_eb.f();
        ((di) this).field_L = null;
        int discarded$0 = -21400;
        this.b(param0);
    }

    final boolean a(int param0, cg param1, int param2, int[] param3, int param4) {
        RuntimeException var6 = null;
        int var6_int = 0;
        ng var7 = null;
        int var8 = 0;
        double var9 = 0.0;
        int var11 = 0;
        int stackIn_10_0 = 0;
        int stackIn_18_0 = 0;
        int stackIn_65_0 = 0;
        int stackIn_67_0 = 0;
        RuntimeException stackIn_69_0 = null;
        StringBuilder stackIn_69_1 = null;
        RuntimeException stackIn_70_0 = null;
        StringBuilder stackIn_70_1 = null;
        RuntimeException stackIn_71_0 = null;
        StringBuilder stackIn_71_1 = null;
        String stackIn_71_2 = null;
        RuntimeException stackIn_72_0 = null;
        StringBuilder stackIn_72_1 = null;
        RuntimeException stackIn_73_0 = null;
        StringBuilder stackIn_73_1 = null;
        RuntimeException stackIn_74_0 = null;
        StringBuilder stackIn_74_1 = null;
        String stackIn_74_2 = null;
        RuntimeException decompiledCaughtException = null;
        int stackOut_9_0 = 0;
        int stackOut_66_0 = 0;
        int stackOut_64_0 = 0;
        int stackOut_17_0 = 0;
        RuntimeException stackOut_68_0 = null;
        StringBuilder stackOut_68_1 = null;
        RuntimeException stackOut_70_0 = null;
        StringBuilder stackOut_70_1 = null;
        String stackOut_70_2 = null;
        RuntimeException stackOut_69_0 = null;
        StringBuilder stackOut_69_1 = null;
        String stackOut_69_2 = null;
        RuntimeException stackOut_71_0 = null;
        StringBuilder stackOut_71_1 = null;
        RuntimeException stackOut_73_0 = null;
        StringBuilder stackOut_73_1 = null;
        String stackOut_73_2 = null;
        RuntimeException stackOut_72_0 = null;
        StringBuilder stackOut_72_1 = null;
        String stackOut_72_2 = null;
        var11 = MinerDisturbance.field_ab;
        try {
          L0: {
            L1: {
              param1.field_M = fj.field_r / 100;
              if (0 > param1.field_G) {
                break L1;
              } else {
                L2: {
                  if (null == param1.field_w) {
                    break L2;
                  } else {
                    if (param1.field_w.k()) {
                      break L2;
                    } else {
                      break L1;
                    }
                  }
                }
                L3: {
                  param1.a((byte) -103);
                  param1.b(34);
                  if (param1.field_J <= 0) {
                    break L3;
                  } else {
                    if (param1 == ((di) this).field_U[param1.field_n][param1.field_J]) {
                      ((di) this).field_U[param1.field_n][param1.field_J] = null;
                      break L3;
                    } else {
                      return true;
                    }
                  }
                }
                stackOut_9_0 = 1;
                stackIn_10_0 = stackOut_9_0;
                return stackIn_10_0 != 0;
              }
            }
            L4: {
              var6_int = param1.field_y;
              if (var6_int > 0) {
                L5: {
                  var6_int = var6_int - (int)(0.5 + 16.0 * Math.pow(2.0, (double)((di) this).field_T[param1.field_n] * 0.0004921259842519685));
                  if (var6_int >= 0) {
                    break L5;
                  } else {
                    var6_int = 0;
                    break L5;
                  }
                }
                param1.field_y = var6_int;
                break L4;
              } else {
                break L4;
              }
            }
            param1.field_w.h(this.a(-87, param1));
            if (param2 == 1387831944) {
              L6: {
                var7 = param1.field_z;
                param1.field_A = param1.field_A + var7.field_j;
                var8 = 0;
                param1.field_q = param1.field_q + 1;
                var9 = 0.000005086263020833333 * (double)((param1.field_F + -60 << 8) - -(param1.field_L * param1.field_y >> 12));
                if (var7.field_m <= 0) {
                  break L6;
                } else {
                  L7: {
                    if (0 < var7.field_d) {
                      param1.field_x = param1.field_x + (int)(Math.pow(2.0, (double)var7.field_d * var9) * 128.0 + 0.5);
                      break L7;
                    } else {
                      param1.field_x = param1.field_x + 128;
                      break L7;
                    }
                  }
                  if (param1.field_x * var7.field_m < 819200) {
                    break L6;
                  } else {
                    var8 = 1;
                    break L6;
                  }
                }
              }
              L8: {
                if (var7.field_b == null) {
                  break L8;
                } else {
                  L9: {
                    if (var7.field_a <= 0) {
                      param1.field_v = param1.field_v + 128;
                      break L9;
                    } else {
                      param1.field_v = param1.field_v + (int)(0.5 + 128.0 * Math.pow(2.0, var9 * (double)var7.field_a));
                      break L9;
                    }
                  }
                  L10: while (true) {
                    L11: {
                      if (param1.field_s >= var7.field_b.length + -2) {
                        break L11;
                      } else {
                        if (param1.field_v <= (var7.field_b[param1.field_s - -2] & 255) << 8) {
                          break L11;
                        } else {
                          param1.field_s = param1.field_s + 2;
                          continue L10;
                        }
                      }
                    }
                    if (-2 + var7.field_b.length != param1.field_s) {
                      break L8;
                    } else {
                      if (var7.field_b[param1.field_s + 1] == 0) {
                        var8 = 1;
                        break L8;
                      } else {
                        break L8;
                      }
                    }
                  }
                }
              }
              L12: {
                if (0 > param1.field_G) {
                  break L12;
                } else {
                  if (null == var7.field_g) {
                    break L12;
                  } else {
                    if ((((di) this).field_v[param1.field_n] & 1) == 0) {
                      L13: {
                        if (param1.field_J < 0) {
                          break L13;
                        } else {
                          if (param1 == ((di) this).field_U[param1.field_n][param1.field_J]) {
                            break L12;
                          } else {
                            break L13;
                          }
                        }
                      }
                      L14: {
                        if (0 < var7.field_h) {
                          param1.field_G = param1.field_G + (int)(Math.pow(2.0, var9 * (double)var7.field_h) * 128.0 + 0.5);
                          break L14;
                        } else {
                          param1.field_G = param1.field_G + 128;
                          break L14;
                        }
                      }
                      L15: while (true) {
                        L16: {
                          if (-2 + var7.field_g.length <= param1.field_p) {
                            break L16;
                          } else {
                            if ((65280 & var7.field_g[2 + param1.field_p] << 8) >= param1.field_G) {
                              break L16;
                            } else {
                              param1.field_p = param1.field_p + 2;
                              continue L15;
                            }
                          }
                        }
                        if (param1.field_p == var7.field_g.length + -2) {
                          var8 = 1;
                          break L12;
                        } else {
                          break L12;
                        }
                      }
                    } else {
                      break L12;
                    }
                  }
                }
              }
              if (var8 == 0) {
                param1.field_w.a(param1.field_M, this.a(param1, (byte) -68), this.a((byte) 93, param1));
                stackOut_66_0 = 0;
                stackIn_67_0 = stackOut_66_0;
                break L0;
              } else {
                L17: {
                  param1.field_w.g(param1.field_M);
                  if (param3 == null) {
                    param1.field_w.a(param0);
                    break L17;
                  } else {
                    param1.field_w.a(param3, param4, param0);
                    break L17;
                  }
                }
                L18: {
                  if (param1.field_w.j()) {
                    ((di) this).field_z.field_r.b((um) (Object) param1.field_w);
                    break L18;
                  } else {
                    break L18;
                  }
                }
                L19: {
                  param1.a((byte) 80);
                  if (0 <= param1.field_G) {
                    param1.b(34);
                    if (param1.field_J <= 0) {
                      break L19;
                    } else {
                      if (((di) this).field_U[param1.field_n][param1.field_J] != param1) {
                        break L19;
                      } else {
                        ((di) this).field_U[param1.field_n][param1.field_J] = null;
                        break L19;
                      }
                    }
                  } else {
                    break L19;
                  }
                }
                stackOut_64_0 = 1;
                stackIn_65_0 = stackOut_64_0;
                return stackIn_65_0 != 0;
              }
            } else {
              stackOut_17_0 = 0;
              stackIn_18_0 = stackOut_17_0;
              return stackIn_18_0 != 0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L20: {
            var6 = decompiledCaughtException;
            stackOut_68_0 = (RuntimeException) var6;
            stackOut_68_1 = new StringBuilder().append("di.N(").append(param0).append(44);
            stackIn_70_0 = stackOut_68_0;
            stackIn_70_1 = stackOut_68_1;
            stackIn_69_0 = stackOut_68_0;
            stackIn_69_1 = stackOut_68_1;
            if (param1 == null) {
              stackOut_70_0 = (RuntimeException) (Object) stackIn_70_0;
              stackOut_70_1 = (StringBuilder) (Object) stackIn_70_1;
              stackOut_70_2 = "null";
              stackIn_71_0 = stackOut_70_0;
              stackIn_71_1 = stackOut_70_1;
              stackIn_71_2 = stackOut_70_2;
              break L20;
            } else {
              stackOut_69_0 = (RuntimeException) (Object) stackIn_69_0;
              stackOut_69_1 = (StringBuilder) (Object) stackIn_69_1;
              stackOut_69_2 = "{...}";
              stackIn_71_0 = stackOut_69_0;
              stackIn_71_1 = stackOut_69_1;
              stackIn_71_2 = stackOut_69_2;
              break L20;
            }
          }
          L21: {
            stackOut_71_0 = (RuntimeException) (Object) stackIn_71_0;
            stackOut_71_1 = ((StringBuilder) (Object) stackIn_71_1).append(stackIn_71_2).append(44).append(param2).append(44);
            stackIn_73_0 = stackOut_71_0;
            stackIn_73_1 = stackOut_71_1;
            stackIn_72_0 = stackOut_71_0;
            stackIn_72_1 = stackOut_71_1;
            if (param3 == null) {
              stackOut_73_0 = (RuntimeException) (Object) stackIn_73_0;
              stackOut_73_1 = (StringBuilder) (Object) stackIn_73_1;
              stackOut_73_2 = "null";
              stackIn_74_0 = stackOut_73_0;
              stackIn_74_1 = stackOut_73_1;
              stackIn_74_2 = stackOut_73_2;
              break L21;
            } else {
              stackOut_72_0 = (RuntimeException) (Object) stackIn_72_0;
              stackOut_72_1 = (StringBuilder) (Object) stackIn_72_1;
              stackOut_72_2 = "{...}";
              stackIn_74_0 = stackOut_72_0;
              stackIn_74_1 = stackOut_72_1;
              stackIn_74_2 = stackOut_72_2;
              break L21;
            }
          }
          throw lj.a((Throwable) (Object) stackIn_74_0, stackIn_74_2 + 44 + param4 + 41);
        }
        return stackIn_67_0 != 0;
    }

    final void a(int param0, boolean param1, cg param2) {
        int var4_int = 0;
        RuntimeException var4 = null;
        int var5 = 0;
        int var6 = 0;
        RuntimeException stackIn_11_0 = null;
        StringBuilder stackIn_11_1 = null;
        RuntimeException stackIn_12_0 = null;
        StringBuilder stackIn_12_1 = null;
        RuntimeException stackIn_13_0 = null;
        StringBuilder stackIn_13_1 = null;
        String stackIn_13_2 = null;
        RuntimeException decompiledCaughtException = null;
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
              if (param0 == 255) {
                break L1;
              } else {
                um discarded$3 = ((di) this).b();
                break L1;
              }
            }
            L2: {
              L3: {
                var4_int = param2.field_D.field_r.length;
                if (!param1) {
                  break L3;
                } else {
                  if (!param2.field_D.field_p) {
                    break L3;
                  } else {
                    var6 = var4_int + var4_int - param2.field_D.field_q;
                    var4_int = var4_int << 8;
                    var5 = (int)((long)((di) this).field_Y[param2.field_n] * (long)var6 >> 6);
                    if (var5 >= var4_int) {
                      param2.field_w.a(true);
                      var5 = -1 + var4_int - -var4_int + -var5;
                      break L2;
                    } else {
                      break L2;
                    }
                  }
                }
              }
              var5 = (int)((long)((di) this).field_Y[param2.field_n] * (long)var4_int >> 6);
              break L2;
            }
            param2.field_w.e(var5);
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L4: {
            var4 = decompiledCaughtException;
            stackOut_10_0 = (RuntimeException) var4;
            stackOut_10_1 = new StringBuilder().append("di.SA(").append(param0).append(44).append(param1).append(44);
            stackIn_12_0 = stackOut_10_0;
            stackIn_12_1 = stackOut_10_1;
            stackIn_11_0 = stackOut_10_0;
            stackIn_11_1 = stackOut_10_1;
            if (param2 == null) {
              stackOut_12_0 = (RuntimeException) (Object) stackIn_12_0;
              stackOut_12_1 = (StringBuilder) (Object) stackIn_12_1;
              stackOut_12_2 = "null";
              stackIn_13_0 = stackOut_12_0;
              stackIn_13_1 = stackOut_12_1;
              stackIn_13_2 = stackOut_12_2;
              break L4;
            } else {
              stackOut_11_0 = (RuntimeException) (Object) stackIn_11_0;
              stackOut_11_1 = (StringBuilder) (Object) stackIn_11_1;
              stackOut_11_2 = "{...}";
              stackIn_13_0 = stackOut_11_0;
              stackIn_13_1 = stackOut_11_1;
              stackIn_13_2 = stackOut_11_2;
              break L4;
            }
          }
          throw lj.a((Throwable) (Object) stackIn_13_0, stackIn_13_2 + 41);
        }
    }

    final synchronized void a(int param0, int param1, int param2) {
        this.b(param0, param2, -95);
        if (param1 != -6242) {
            field_K = -87;
        }
    }

    private final void f() {
        int var2 = 0;
        int var3 = 0;
        long var4 = 0L;
        int var6 = 0;
        int var7 = 0;
        L0: {
          var7 = MinerDisturbance.field_ab;
          var2 = ((di) this).field_W;
          var3 = ((di) this).field_bb;
          var4 = ((di) this).field_t;
          if (((di) this).field_L == null) {
            break L0;
          } else {
            if (var3 == ((di) this).field_M) {
              this.a(-23, ((di) this).field_L, ((di) this).field_C, ((di) this).field_A);
              int discarded$3 = 128;
              this.f();
              return;
            } else {
              break L0;
            }
          }
        }
        L1: while (true) {
          if (((di) this).field_bb != var3) {
            L2: {
              ((di) this).field_bb = var3;
              ((di) this).field_W = var2;
              ((di) this).field_t = var4;
              if (((di) this).field_L == null) {
                break L2;
              } else {
                if (var3 <= ((di) this).field_M) {
                  break L2;
                } else {
                  ((di) this).field_W = -1;
                  ((di) this).field_bb = ((di) this).field_M;
                  ((di) this).field_t = ((di) this).field_eb.f(((di) this).field_bb);
                  break L2;
                }
              }
            }
            return;
          } else {
            L3: while (true) {
              L4: {
                if (((di) this).field_eb.field_b[var2] != var3) {
                  break L4;
                } else {
                  ((di) this).field_eb.a(var2);
                  var6 = ((di) this).field_eb.d(var2);
                  if (var6 != 1) {
                    L5: {
                      if (0 != (var6 & 128)) {
                        this.a(var6, (byte) 76);
                        break L5;
                      } else {
                        break L5;
                      }
                    }
                    ((di) this).field_eb.e(var2);
                    ((di) this).field_eb.b(var2);
                    continue L3;
                  } else {
                    ((di) this).field_eb.d();
                    ((di) this).field_eb.b(var2);
                    if (!((di) this).field_eb.a()) {
                      break L4;
                    } else {
                      if (((di) this).field_L == null) {
                        L6: {
                          if (!((di) this).field_C) {
                            break L6;
                          } else {
                            if (0 != var3) {
                              ((di) this).field_eb.b(var4);
                              break L4;
                            } else {
                              break L6;
                            }
                          }
                        }
                        int discarded$4 = -21400;
                        this.b(true);
                        ((di) this).field_eb.f();
                        return;
                      } else {
                        ((di) this).a(((di) this).field_C, ((di) this).field_L, (byte) 2);
                        int discarded$5 = 128;
                        this.f();
                        return;
                      }
                    }
                  }
                }
              }
              var2 = ((di) this).field_eb.c();
              var3 = ((di) this).field_eb.field_b[var2];
              var4 = ((di) this).field_eb.f(var3);
              continue L1;
            }
          }
        }
    }

    private final void c(int param0, int param1, int param2) {
        int var4 = 0;
        int var5 = MinerDisturbance.field_ab;
        if (param2 >= -19) {
            this.a((byte) 16, -9, 96, -116);
        }
        if (!(param0 == ((di) this).field_J[param1])) {
            ((di) this).field_J[param1] = param0;
            for (var4 = 0; var4 < 128; var4++) {
                ((di) this).field_U[param1][var4] = null;
            }
        }
    }

    final synchronized boolean a(boolean param0, wh param1, ri param2, int param3, bj param4) {
        RuntimeException var6 = null;
        int var6_int = 0;
        Object var7 = null;
        qf var8 = null;
        int var9 = 0;
        int var11 = 0;
        vc var12 = null;
        vc var13 = null;
        tg stackIn_11_0 = null;
        tg stackIn_18_0 = null;
        tg stackIn_19_0 = null;
        tg stackIn_20_0 = null;
        int stackIn_20_1 = 0;
        int stackIn_24_0 = 0;
        RuntimeException stackIn_26_0 = null;
        StringBuilder stackIn_26_1 = null;
        RuntimeException stackIn_27_0 = null;
        StringBuilder stackIn_27_1 = null;
        RuntimeException stackIn_28_0 = null;
        StringBuilder stackIn_28_1 = null;
        String stackIn_28_2 = null;
        RuntimeException stackIn_29_0 = null;
        StringBuilder stackIn_29_1 = null;
        RuntimeException stackIn_30_0 = null;
        StringBuilder stackIn_30_1 = null;
        RuntimeException stackIn_31_0 = null;
        StringBuilder stackIn_31_1 = null;
        String stackIn_31_2 = null;
        RuntimeException stackIn_32_0 = null;
        StringBuilder stackIn_32_1 = null;
        RuntimeException stackIn_33_0 = null;
        StringBuilder stackIn_33_1 = null;
        RuntimeException stackIn_34_0 = null;
        StringBuilder stackIn_34_1 = null;
        String stackIn_34_2 = null;
        RuntimeException decompiledCaughtException = null;
        int stackOut_23_0 = 0;
        tg stackOut_10_0 = null;
        tg stackOut_11_0 = null;
        int stackOut_11_1 = 0;
        tg stackOut_17_0 = null;
        tg stackOut_18_0 = null;
        int stackOut_18_1 = 0;
        tg stackOut_19_0 = null;
        int stackOut_19_1 = 0;
        RuntimeException stackOut_25_0 = null;
        StringBuilder stackOut_25_1 = null;
        RuntimeException stackOut_27_0 = null;
        StringBuilder stackOut_27_1 = null;
        String stackOut_27_2 = null;
        RuntimeException stackOut_26_0 = null;
        StringBuilder stackOut_26_1 = null;
        String stackOut_26_2 = null;
        RuntimeException stackOut_28_0 = null;
        StringBuilder stackOut_28_1 = null;
        RuntimeException stackOut_30_0 = null;
        StringBuilder stackOut_30_1 = null;
        String stackOut_30_2 = null;
        RuntimeException stackOut_29_0 = null;
        StringBuilder stackOut_29_1 = null;
        String stackOut_29_2 = null;
        RuntimeException stackOut_31_0 = null;
        StringBuilder stackOut_31_1 = null;
        RuntimeException stackOut_33_0 = null;
        StringBuilder stackOut_33_1 = null;
        String stackOut_33_2 = null;
        RuntimeException stackOut_32_0 = null;
        StringBuilder stackOut_32_1 = null;
        String stackOut_32_2 = null;
        var11 = MinerDisturbance.field_ab;
        try {
          L0: {
            L1: {
              param1.a();
              var6_int = 1;
              var7 = null;
              if (param3 > 0) {
                var7 = (Object) (Object) new int[]{param3};
                break L1;
              } else {
                break L1;
              }
            }
            L2: {
              if (!param0) {
                break L2;
              } else {
                ((di) this).field_W = 80;
                break L2;
              }
            }
            var8 = (qf) (Object) param1.field_n.a(-16545);
            L3: while (true) {
              if (var8 == null) {
                L4: {
                  if (var6_int == 0) {
                    break L4;
                  } else {
                    param1.b();
                    break L4;
                  }
                }
                stackOut_23_0 = var6_int;
                stackIn_24_0 = stackOut_23_0;
                break L0;
              } else {
                L5: {
                  L6: {
                    L7: {
                      var9 = (int)var8.field_d;
                      var12 = (vc) (Object) ((di) this).field_F.a((long)var9, -27109);
                      if (var12 == null) {
                        var13 = oh.a(-126, var9, param4);
                        if (var13 == null) {
                          var6_int = 0;
                          break L7;
                        } else {
                          ((di) this).field_F.a(0, (long)var9, (pi) (Object) var13);
                          if (var13.a(param2, (byte) -31, var8.field_s, (int[]) var7)) {
                            break L7;
                          } else {
                            var6_int = 0;
                            break L7;
                          }
                        }
                      } else {
                        if (var12.a(param2, (byte) -31, var8.field_s, (int[]) var7)) {
                          break L7;
                        } else {
                          var6_int = 0;
                          stackOut_10_0 = param1.field_n;
                          stackIn_19_0 = stackOut_10_0;
                          stackIn_11_0 = stackOut_10_0;
                          if (param0) {
                            break L6;
                          } else {
                            stackOut_11_0 = (tg) (Object) stackIn_11_0;
                            stackOut_11_1 = 1;
                            stackIn_20_0 = stackOut_11_0;
                            stackIn_20_1 = stackOut_11_1;
                            break L5;
                          }
                        }
                      }
                    }
                    stackOut_17_0 = param1.field_n;
                    stackIn_19_0 = stackOut_17_0;
                    stackIn_18_0 = stackOut_17_0;
                    if (param0) {
                      break L6;
                    } else {
                      stackOut_18_0 = (tg) (Object) stackIn_18_0;
                      stackOut_18_1 = 1;
                      stackIn_20_0 = stackOut_18_0;
                      stackIn_20_1 = stackOut_18_1;
                      break L5;
                    }
                  }
                  stackOut_19_0 = (tg) (Object) stackIn_19_0;
                  stackOut_19_1 = 0;
                  stackIn_20_0 = stackOut_19_0;
                  stackIn_20_1 = stackOut_19_1;
                  break L5;
                }
                var8 = (qf) (Object) ((tg) (Object) stackIn_20_0).a(stackIn_20_1 != 0);
                continue L3;
              }
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L8: {
            var6 = decompiledCaughtException;
            stackOut_25_0 = (RuntimeException) var6;
            stackOut_25_1 = new StringBuilder().append("di.LA(").append(param0).append(44);
            stackIn_27_0 = stackOut_25_0;
            stackIn_27_1 = stackOut_25_1;
            stackIn_26_0 = stackOut_25_0;
            stackIn_26_1 = stackOut_25_1;
            if (param1 == null) {
              stackOut_27_0 = (RuntimeException) (Object) stackIn_27_0;
              stackOut_27_1 = (StringBuilder) (Object) stackIn_27_1;
              stackOut_27_2 = "null";
              stackIn_28_0 = stackOut_27_0;
              stackIn_28_1 = stackOut_27_1;
              stackIn_28_2 = stackOut_27_2;
              break L8;
            } else {
              stackOut_26_0 = (RuntimeException) (Object) stackIn_26_0;
              stackOut_26_1 = (StringBuilder) (Object) stackIn_26_1;
              stackOut_26_2 = "{...}";
              stackIn_28_0 = stackOut_26_0;
              stackIn_28_1 = stackOut_26_1;
              stackIn_28_2 = stackOut_26_2;
              break L8;
            }
          }
          L9: {
            stackOut_28_0 = (RuntimeException) (Object) stackIn_28_0;
            stackOut_28_1 = ((StringBuilder) (Object) stackIn_28_1).append(stackIn_28_2).append(44);
            stackIn_30_0 = stackOut_28_0;
            stackIn_30_1 = stackOut_28_1;
            stackIn_29_0 = stackOut_28_0;
            stackIn_29_1 = stackOut_28_1;
            if (param2 == null) {
              stackOut_30_0 = (RuntimeException) (Object) stackIn_30_0;
              stackOut_30_1 = (StringBuilder) (Object) stackIn_30_1;
              stackOut_30_2 = "null";
              stackIn_31_0 = stackOut_30_0;
              stackIn_31_1 = stackOut_30_1;
              stackIn_31_2 = stackOut_30_2;
              break L9;
            } else {
              stackOut_29_0 = (RuntimeException) (Object) stackIn_29_0;
              stackOut_29_1 = (StringBuilder) (Object) stackIn_29_1;
              stackOut_29_2 = "{...}";
              stackIn_31_0 = stackOut_29_0;
              stackIn_31_1 = stackOut_29_1;
              stackIn_31_2 = stackOut_29_2;
              break L9;
            }
          }
          L10: {
            stackOut_31_0 = (RuntimeException) (Object) stackIn_31_0;
            stackOut_31_1 = ((StringBuilder) (Object) stackIn_31_1).append(stackIn_31_2).append(44).append(param3).append(44);
            stackIn_33_0 = stackOut_31_0;
            stackIn_33_1 = stackOut_31_1;
            stackIn_32_0 = stackOut_31_0;
            stackIn_32_1 = stackOut_31_1;
            if (param4 == null) {
              stackOut_33_0 = (RuntimeException) (Object) stackIn_33_0;
              stackOut_33_1 = (StringBuilder) (Object) stackIn_33_1;
              stackOut_33_2 = "null";
              stackIn_34_0 = stackOut_33_0;
              stackIn_34_1 = stackOut_33_1;
              stackIn_34_2 = stackOut_33_2;
              break L10;
            } else {
              stackOut_32_0 = (RuntimeException) (Object) stackIn_32_0;
              stackOut_32_1 = (StringBuilder) (Object) stackIn_32_1;
              stackOut_32_2 = "{...}";
              stackIn_34_0 = stackOut_32_0;
              stackIn_34_1 = stackOut_32_1;
              stackIn_34_2 = stackOut_32_2;
              break L10;
            }
          }
          throw lj.a((Throwable) (Object) stackIn_34_0, stackIn_34_2 + 41);
        }
        return stackIn_24_0 != 0;
    }

    private final void a(int param0, int param1, byte param2) {
        ((di) this).field_P[param1] = param0;
    }

    final synchronized int d() {
        return 0;
    }

    final synchronized void a(int param0, boolean param1, int param2) {
        int var4 = 0;
        int var5 = MinerDisturbance.field_ab;
        if (param2 >= 0) {
            ((di) this).field_H[param2] = param0;
        } else {
            for (var4 = 0; var4 < 16; var4++) {
                ((di) this).field_H[var4] = param0;
            }
        }
        if (!param1) {
            field_D = null;
        }
    }

    private final void a(int param0, int param1) {
        cg var3 = null;
        int var4 = 0;
        var4 = MinerDisturbance.field_ab;
        var3 = (cg) (Object) ((di) this).field_z.field_v.b(64);
        L0: while (true) {
          if (var3 == null) {
            return;
          } else {
            L1: {
              L2: {
                if (param0 < 0) {
                  break L2;
                } else {
                  if (param0 != var3.field_n) {
                    break L1;
                  } else {
                    break L2;
                  }
                }
              }
              L3: {
                if (null != var3.field_w) {
                  L4: {
                    var3.field_w.g(fj.field_r / 100);
                    if (!var3.field_w.j()) {
                      break L4;
                    } else {
                      ((di) this).field_z.field_r.b((um) (Object) var3.field_w);
                      break L4;
                    }
                  }
                  var3.a((byte) 76);
                  break L3;
                } else {
                  break L3;
                }
              }
              L5: {
                if (var3.field_G >= 0) {
                  break L5;
                } else {
                  ((di) this).field_gb[var3.field_n][var3.field_F] = null;
                  break L5;
                }
              }
              var3.b(34);
              break L1;
            }
            var3 = (cg) (Object) ((di) this).field_z.field_v.b((byte) 56);
            continue L0;
          }
        }
    }

    final static int a(boolean param0) {
        return ll.field_h ^ 38054639;
    }

    private final void b(int param0, int param1, int param2) {
        ((di) this).field_y[param1] = param0;
        int var4 = 0;
        ((di) this).field_B[param1] = c.a(param0, -128);
        this.c(param0, param1, -73);
    }

    final synchronized um b() {
        return (um) (Object) ((di) this).field_z;
    }

    private final void b(int param0, int param1) {
        int var4 = 0;
        var4 = MinerDisturbance.field_ab;
        if (param0 >= 0) {
          ((di) this).field_R[param0] = 12800;
          ((di) this).field_N[param0] = 8192;
          ((di) this).field_S[param0] = 16383;
          ((di) this).field_P[param0] = 8192;
          ((di) this).field_I[param0] = 0;
          ((di) this).field_T[param0] = 8192;
          this.d(param0, 27);
          this.f(param0, 20257);
          ((di) this).field_v[param0] = 0;
          ((di) this).field_w[param0] = 32767;
          ((di) this).field_db[param0] = 256;
          ((di) this).field_Y[param0] = 0;
          this.a(param0, (byte) 123, 8192);
          return;
        } else {
          param0 = 0;
          L0: while (true) {
            if (16 <= param0) {
              return;
            } else {
              this.b(param0, 0);
              param0++;
              continue L0;
            }
          }
        }
    }

    final synchronized void a(wh param0, boolean param1, boolean param2, int param3, int param4, int param5) {
        int var7_int = 0;
        int var8 = 0;
        if (!(((di) this).field_eb.e())) {
            ((di) this).a(param1, param0, (byte) 2);
            return;
        }
        try {
            ((di) this).field_L = param0;
            ((di) this).field_A = param2 ? true : false;
            if (param5 != -22604) {
                ((di) this).field_L = null;
            }
            ((di) this).field_C = param1 ? true : false;
            var7_int = ((di) this).field_eb.a(((di) this).field_fb) * param3;
            var8 = ((di) this).field_eb.field_g * param4;
            var7_int = var8 * ((var8 + (var7_int - 1)) / var8);
            ((di) this).field_M = (var7_int - -(param3 >> 1)) / param3;
        } catch (RuntimeException runtimeException) {
            throw lj.a((Throwable) (Object) runtimeException, "di.JA(" + (param0 != null ? "{...}" : "null") + 44 + param1 + 44 + param2 + 44 + param3 + 44 + param4 + 44 + param5 + 41);
        }
    }

    private final int a(cg param0, byte param1) {
        RuntimeException var3 = null;
        int var4 = 0;
        int var5 = 0;
        int var6 = 0;
        int var7 = 0;
        int var8 = 0;
        ng var9 = null;
        ng var10 = null;
        int stackIn_2_0 = 0;
        int stackIn_20_0 = 0;
        RuntimeException stackIn_22_0 = null;
        StringBuilder stackIn_22_1 = null;
        RuntimeException stackIn_23_0 = null;
        StringBuilder stackIn_23_1 = null;
        RuntimeException stackIn_24_0 = null;
        StringBuilder stackIn_24_1 = null;
        String stackIn_24_2 = null;
        RuntimeException decompiledCaughtException = null;
        int stackOut_19_0 = 0;
        int stackOut_1_0 = 0;
        RuntimeException stackOut_21_0 = null;
        StringBuilder stackOut_21_1 = null;
        RuntimeException stackOut_23_0 = null;
        StringBuilder stackOut_23_1 = null;
        String stackOut_23_2 = null;
        RuntimeException stackOut_22_0 = null;
        StringBuilder stackOut_22_1 = null;
        String stackOut_22_2 = null;
        try {
          L0: {
            if (0 != ((di) this).field_H[param0.field_n]) {
              L1: {
                var9 = param0.field_z;
                var10 = var9;
                var4 = 4096 + ((di) this).field_R[param0.field_n] * ((di) this).field_S[param0.field_n] >> 13;
                if (param1 < -32) {
                  break L1;
                } else {
                  um discarded$1 = ((di) this).c();
                  break L1;
                }
              }
              L2: {
                var4 = var4 * var4 + 16384 >> 15;
                var4 = 16384 + param0.field_t * var4 >> 15;
                var4 = 128 + var4 * ((di) this).field_Q >> 8;
                var4 = var4 * ((di) this).field_H[param0.field_n] - -128 >> 8;
                if (0 < var10.field_m) {
                  var4 = (int)(0.5 + (double)var4 * Math.pow(0.5, 0.00001953125 * (double)param0.field_x * (double)var10.field_m));
                  break L2;
                } else {
                  break L2;
                }
              }
              L3: {
                if (null != var10.field_b) {
                  L4: {
                    var5 = param0.field_v;
                    var6 = var10.field_b[param0.field_s + 1];
                    if (param0.field_s < -2 + var10.field_b.length) {
                      var7 = var9.field_b[param0.field_s] << 8 & 65280;
                      var8 = (var10.field_b[param0.field_s - -2] & 255) << 8;
                      var6 = var6 + (-var7 + var5) * (-var6 + var10.field_b[3 + param0.field_s]) / (-var7 + var8);
                      break L4;
                    } else {
                      break L4;
                    }
                  }
                  var4 = var4 * var6 - -32 >> 6;
                  break L3;
                } else {
                  break L3;
                }
              }
              L5: {
                if (param0.field_G <= 0) {
                  break L5;
                } else {
                  if (var10.field_g == null) {
                    break L5;
                  } else {
                    L6: {
                      var5 = param0.field_G;
                      var6 = var10.field_g[1 + param0.field_p];
                      if (-2 + var10.field_g.length <= param0.field_p) {
                        break L6;
                      } else {
                        var7 = 65280 & var9.field_g[param0.field_p] << 8;
                        var8 = var10.field_g[2 + param0.field_p] << 8 & 65280;
                        var6 = var6 + (var10.field_g[param0.field_p - -3] - var6) * (var5 - var7) / (var8 + -var7);
                        break L6;
                      }
                    }
                    var4 = var4 * var6 - -32 >> 6;
                    break L5;
                  }
                }
              }
              stackOut_19_0 = var4;
              stackIn_20_0 = stackOut_19_0;
              break L0;
            } else {
              stackOut_1_0 = 0;
              stackIn_2_0 = stackOut_1_0;
              return stackIn_2_0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L7: {
            var3 = decompiledCaughtException;
            stackOut_21_0 = (RuntimeException) var3;
            stackOut_21_1 = new StringBuilder().append("di.G(");
            stackIn_23_0 = stackOut_21_0;
            stackIn_23_1 = stackOut_21_1;
            stackIn_22_0 = stackOut_21_0;
            stackIn_22_1 = stackOut_21_1;
            if (param0 == null) {
              stackOut_23_0 = (RuntimeException) (Object) stackIn_23_0;
              stackOut_23_1 = (StringBuilder) (Object) stackIn_23_1;
              stackOut_23_2 = "null";
              stackIn_24_0 = stackOut_23_0;
              stackIn_24_1 = stackOut_23_1;
              stackIn_24_2 = stackOut_23_2;
              break L7;
            } else {
              stackOut_22_0 = (RuntimeException) (Object) stackIn_22_0;
              stackOut_22_1 = (StringBuilder) (Object) stackIn_22_1;
              stackOut_22_2 = "{...}";
              stackIn_24_0 = stackOut_22_0;
              stackIn_24_1 = stackOut_22_1;
              stackIn_24_2 = stackOut_22_2;
              break L7;
            }
          }
          throw lj.a((Throwable) (Object) stackIn_24_0, stackIn_24_2 + 44 + param1 + 41);
        }
        return stackIn_20_0;
    }

    final synchronized boolean b(byte param0) {
        if (param0 != -114) {
            return true;
        }
        return ((di) this).field_eb.e();
    }

    private final void b(byte param0, int param1, int param2, int param3) {
        cg var5 = null;
        ji var6 = null;
        int var6_int = 0;
        cg var7 = null;
        int var8 = 0;
        cg var9 = null;
        int var10 = 0;
        vc var11 = null;
        vc var12 = null;
        Object stackIn_15_0 = null;
        int stackIn_15_1 = 0;
        Object stackIn_16_0 = null;
        int stackIn_16_1 = 0;
        Object stackIn_17_0 = null;
        int stackIn_17_1 = 0;
        int stackIn_17_2 = 0;
        Object stackOut_14_0 = null;
        int stackOut_14_1 = 0;
        Object stackOut_16_0 = null;
        int stackOut_16_1 = 0;
        int stackOut_16_2 = 0;
        Object stackOut_15_0 = null;
        int stackOut_15_1 = 0;
        int stackOut_15_2 = 0;
        L0: {
          var10 = MinerDisturbance.field_ab;
          this.a((byte) -69, param3, 64, param1);
          if ((((di) this).field_v[param1] & 2) == 0) {
            break L0;
          } else {
            var5 = (cg) (Object) ((di) this).field_z.field_v.d(59287);
            L1: while (true) {
              if (var5 == null) {
                break L0;
              } else {
                L2: {
                  if (param1 != var5.field_n) {
                    break L2;
                  } else {
                    if (var5.field_G < 0) {
                      ((di) this).field_gb[param1][var5.field_F] = null;
                      ((di) this).field_gb[param1][param3] = var5;
                      var6_int = (var5.field_y * var5.field_L >> 12) + var5.field_u;
                      var5.field_u = var5.field_u + (-var5.field_F + param3 << 8);
                      var5.field_L = var6_int - var5.field_u;
                      var5.field_F = param3;
                      var5.field_y = 4096;
                      return;
                    } else {
                      break L2;
                    }
                  }
                }
                var5 = (cg) (Object) ((di) this).field_z.field_v.a(21510);
                continue L1;
              }
            }
          }
        }
        var11 = (vc) (Object) ((di) this).field_F.a((long)((di) this).field_J[param1], -27109);
        var12 = var11;
        if (var12 != null) {
          var6 = var11.field_v[param3];
          if (var6 != null) {
            L3: {
              var7 = new cg();
              var7.field_I = var12;
              var7.field_n = param1;
              var7.field_D = var6;
              var7.field_z = var11.field_y[param3];
              var7.field_J = var11.field_s[param3];
              var7.field_F = param3;
              var8 = 0;
              var7.field_t = var11.field_x[param3] * param2 * param2 * var12.field_q + 1024 >> 11;
              var7.field_E = var11.field_r[param3] & 255;
              var7.field_u = (param3 << 8) + -(32767 & var11.field_t[param3]);
              var7.field_x = 0;
              var7.field_v = 0;
              var7.field_p = 0;
              var7.field_G = -1;
              var7.field_s = 0;
              if (0 != ((di) this).field_Y[param1]) {
                L4: {
                  var7.field_w = rc.a(var6, this.a(-101, var7), 0, this.a((byte) 88, var7));
                  stackOut_14_0 = this;
                  stackOut_14_1 = 255;
                  stackIn_16_0 = stackOut_14_0;
                  stackIn_16_1 = stackOut_14_1;
                  stackIn_15_0 = stackOut_14_0;
                  stackIn_15_1 = stackOut_14_1;
                  if (var12.field_t[param3] >= 0) {
                    stackOut_16_0 = this;
                    stackOut_16_1 = stackIn_16_1;
                    stackOut_16_2 = 0;
                    stackIn_17_0 = stackOut_16_0;
                    stackIn_17_1 = stackOut_16_1;
                    stackIn_17_2 = stackOut_16_2;
                    break L4;
                  } else {
                    stackOut_15_0 = this;
                    stackOut_15_1 = stackIn_15_1;
                    stackOut_15_2 = 1;
                    stackIn_17_0 = stackOut_15_0;
                    stackIn_17_1 = stackOut_15_1;
                    stackIn_17_2 = stackOut_15_2;
                    break L4;
                  }
                }
                ((di) this).a(stackIn_17_1, stackIn_17_2 != 0, var7);
                break L3;
              } else {
                var7.field_w = rc.a(var6, this.a(79, var7), this.a(var7, (byte) -78), this.a((byte) 98, var7));
                break L3;
              }
            }
            L5: {
              if (var12.field_t[param3] >= 0) {
                break L5;
              } else {
                var7.field_w.i(-1);
                break L5;
              }
            }
            L6: {
              if (-1 < var7.field_J) {
                break L6;
              } else {
                L7: {
                  var9 = ((di) this).field_U[param1][var7.field_J];
                  if (var9 == null) {
                    break L7;
                  } else {
                    if (-1 <= var9.field_G) {
                      break L7;
                    } else {
                      ((di) this).field_gb[param1][var9.field_F] = null;
                      var9.field_G = 0;
                      break L7;
                    }
                  }
                }
                ((di) this).field_U[param1][var7.field_J] = var7;
                break L6;
              }
            }
            ((di) this).field_z.field_v.a((byte) -104, (pi) (Object) var7);
            ((di) this).field_gb[param1][param3] = var7;
            return;
          } else {
            return;
          }
        } else {
          return;
        }
    }

    private final int a(int param0, cg param1) {
        int var3_int = 0;
        RuntimeException var3 = null;
        int var4 = 0;
        ng var5 = null;
        int var6 = 0;
        int var7 = 0;
        double var8 = 0.0;
        int stackIn_10_0 = 0;
        RuntimeException stackIn_12_0 = null;
        StringBuilder stackIn_12_1 = null;
        RuntimeException stackIn_13_0 = null;
        StringBuilder stackIn_13_1 = null;
        RuntimeException stackIn_14_0 = null;
        StringBuilder stackIn_14_1 = null;
        String stackIn_14_2 = null;
        RuntimeException decompiledCaughtException = null;
        int stackOut_9_0 = 0;
        int stackOut_8_0 = 0;
        RuntimeException stackOut_11_0 = null;
        StringBuilder stackOut_11_1 = null;
        RuntimeException stackOut_13_0 = null;
        StringBuilder stackOut_13_1 = null;
        String stackOut_13_2 = null;
        RuntimeException stackOut_12_0 = null;
        StringBuilder stackOut_12_1 = null;
        String stackOut_12_2 = null;
        try {
          L0: {
            L1: {
              var3_int = (param1.field_y * param1.field_L >> 12) + param1.field_u;
              var3_int = var3_int + ((-8192 + ((di) this).field_P[param1.field_n]) * ((di) this).field_db[param1.field_n] >> 12);
              var4 = -15 % ((-38 - param0) / 47);
              var5 = param1.field_z;
              if (var5.field_j <= 0) {
                break L1;
              } else {
                L2: {
                  if (var5.field_c > 0) {
                    break L2;
                  } else {
                    if (0 >= ((di) this).field_I[param1.field_n]) {
                      break L1;
                    } else {
                      break L2;
                    }
                  }
                }
                L3: {
                  var6 = var5.field_c << 2;
                  var7 = var5.field_f << 1;
                  if (var7 <= param1.field_q) {
                    break L3;
                  } else {
                    var6 = var6 * param1.field_q / var7;
                    break L3;
                  }
                }
                var6 = var6 + (((di) this).field_I[param1.field_n] >> 7);
                var8 = Math.sin((double)(param1.field_A & 511) * 0.01227184630308513);
                var3_int = var3_int + (int)((double)var6 * var8);
                break L1;
              }
            }
            L4: {
              var6 = (int)(0.5 + (double)(256 * param1.field_D.field_s) * Math.pow(2.0, 0.0003255208333333333 * (double)var3_int) / (double)fj.field_r);
              if (var6 < 1) {
                stackOut_9_0 = 1;
                stackIn_10_0 = stackOut_9_0;
                break L4;
              } else {
                stackOut_8_0 = var6;
                stackIn_10_0 = stackOut_8_0;
                break L4;
              }
            }
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L5: {
            var3 = decompiledCaughtException;
            stackOut_11_0 = (RuntimeException) var3;
            stackOut_11_1 = new StringBuilder().append("di.DA(").append(param0).append(44);
            stackIn_13_0 = stackOut_11_0;
            stackIn_13_1 = stackOut_11_1;
            stackIn_12_0 = stackOut_11_0;
            stackIn_12_1 = stackOut_11_1;
            if (param1 == null) {
              stackOut_13_0 = (RuntimeException) (Object) stackIn_13_0;
              stackOut_13_1 = (StringBuilder) (Object) stackIn_13_1;
              stackOut_13_2 = "null";
              stackIn_14_0 = stackOut_13_0;
              stackIn_14_1 = stackOut_13_1;
              stackIn_14_2 = stackOut_13_2;
              break L5;
            } else {
              stackOut_12_0 = (RuntimeException) (Object) stackIn_12_0;
              stackOut_12_1 = (StringBuilder) (Object) stackIn_12_1;
              stackOut_12_2 = "{...}";
              stackIn_14_0 = stackOut_12_0;
              stackIn_14_1 = stackOut_12_1;
              stackIn_14_2 = stackOut_12_2;
              break L5;
            }
          }
          throw lj.a((Throwable) (Object) stackIn_14_0, stackIn_14_2 + 41);
        }
        return stackIn_10_0;
    }

    final boolean a(cg param0, int param1) {
        RuntimeException var3 = null;
        int stackIn_11_0 = 0;
        RuntimeException stackIn_13_0 = null;
        StringBuilder stackIn_13_1 = null;
        RuntimeException stackIn_14_0 = null;
        StringBuilder stackIn_14_1 = null;
        RuntimeException stackIn_15_0 = null;
        StringBuilder stackIn_15_1 = null;
        String stackIn_15_2 = null;
        RuntimeException decompiledCaughtException = null;
        int stackOut_10_0 = 0;
        RuntimeException stackOut_12_0 = null;
        StringBuilder stackOut_12_1 = null;
        RuntimeException stackOut_14_0 = null;
        StringBuilder stackOut_14_1 = null;
        String stackOut_14_2 = null;
        RuntimeException stackOut_13_0 = null;
        StringBuilder stackOut_13_1 = null;
        String stackOut_13_2 = null;
        try {
          L0: {
            L1: {
              if (param1 <= -6) {
                break L1;
              } else {
                ((di) this).field_B = null;
                break L1;
              }
            }
            if (null == param0.field_w) {
              if (param0.field_G >= 0) {
                L2: {
                  param0.b(34);
                  if (param0.field_J <= 0) {
                    break L2;
                  } else {
                    if (((di) this).field_U[param0.field_n][param0.field_J] == param0) {
                      ((di) this).field_U[param0.field_n][param0.field_J] = null;
                      break L2;
                    } else {
                      break L2;
                    }
                  }
                }
                stackOut_10_0 = 1;
                stackIn_11_0 = stackOut_10_0;
                break L0;
              } else {
                return true;
              }
            } else {
              return false;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L3: {
            var3 = decompiledCaughtException;
            stackOut_12_0 = (RuntimeException) var3;
            stackOut_12_1 = new StringBuilder().append("di.O(");
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
              break L3;
            } else {
              stackOut_13_0 = (RuntimeException) (Object) stackIn_13_0;
              stackOut_13_1 = (StringBuilder) (Object) stackIn_13_1;
              stackOut_13_2 = "{...}";
              stackIn_15_0 = stackOut_13_0;
              stackIn_15_1 = stackOut_13_1;
              stackIn_15_2 = stackOut_13_2;
              break L3;
            }
          }
          throw lj.a((Throwable) (Object) stackIn_15_0, stackIn_15_2 + 44 + param1 + 41);
        }
        return stackIn_11_0 != 0;
    }

    final static void a(Throwable param0, int param1, String param2) {
        try {
            Exception var3 = null;
            String var3_ref = null;
            ia var4 = null;
            DataInputStream var5 = null;
            int var6 = 0;
            String var7 = null;
            vf stackIn_11_0 = null;
            int stackIn_11_1 = 0;
            java.net.URL stackIn_11_2 = null;
            java.net.URL stackIn_11_3 = null;
            java.net.URL stackIn_11_4 = null;
            StringBuilder stackIn_11_5 = null;
            vf stackIn_12_0 = null;
            int stackIn_12_1 = 0;
            java.net.URL stackIn_12_2 = null;
            java.net.URL stackIn_12_3 = null;
            java.net.URL stackIn_12_4 = null;
            StringBuilder stackIn_12_5 = null;
            vf stackIn_13_0 = null;
            int stackIn_13_1 = 0;
            java.net.URL stackIn_13_2 = null;
            java.net.URL stackIn_13_3 = null;
            java.net.URL stackIn_13_4 = null;
            StringBuilder stackIn_13_5 = null;
            String stackIn_13_6 = null;
            Throwable decompiledCaughtException = null;
            vf stackOut_10_0 = null;
            int stackOut_10_1 = 0;
            java.net.URL stackOut_10_2 = null;
            java.net.URL stackOut_10_3 = null;
            java.net.URL stackOut_10_4 = null;
            StringBuilder stackOut_10_5 = null;
            vf stackOut_12_0 = null;
            int stackOut_12_1 = 0;
            java.net.URL stackOut_12_2 = null;
            java.net.URL stackOut_12_3 = null;
            java.net.URL stackOut_12_4 = null;
            StringBuilder stackOut_12_5 = null;
            String stackOut_12_6 = null;
            vf stackOut_11_0 = null;
            int stackOut_11_1 = 0;
            java.net.URL stackOut_11_2 = null;
            java.net.URL stackOut_11_3 = null;
            java.net.URL stackOut_11_4 = null;
            StringBuilder stackOut_11_5 = null;
            String stackOut_11_6 = null;
            var6 = MinerDisturbance.field_ab;
            try {
              L0: {
                L1: {
                  var3_ref = "";
                  if (param0 != null) {
                    int discarded$4 = 78;
                    var3_ref = w.a(param0);
                    break L1;
                  } else {
                    break L1;
                  }
                }
                L2: {
                  if (param2 == null) {
                    break L2;
                  } else {
                    L3: {
                      if (param0 == null) {
                        break L3;
                      } else {
                        var3_ref = var3_ref + " | ";
                        break L3;
                      }
                    }
                    var3_ref = var3_ref + param2;
                    break L2;
                  }
                }
                int discarded$5 = 1;
                vj.a(var3_ref);
                var3_ref = ld.a("%3a", -1, var3_ref, ":");
                var3_ref = ld.a("%40", -1, var3_ref, "@");
                var3_ref = ld.a("%26", -1, var3_ref, "&");
                var7 = ld.a("%23", -1, var3_ref, "#");
                if (null != aj.field_d) {
                  L4: {
                    stackOut_10_0 = hd.field_g;
                    stackOut_10_1 = -83;
                    stackOut_10_2 = null;
                    stackOut_10_3 = null;
                    stackOut_10_4 = aj.field_d.getCodeBase();
                    stackOut_10_5 = new StringBuilder().append("clienterror.ws?c=").append(tb.field_h).append("&u=");
                    stackIn_12_0 = stackOut_10_0;
                    stackIn_12_1 = stackOut_10_1;
                    stackIn_12_2 = stackOut_10_2;
                    stackIn_12_3 = stackOut_10_3;
                    stackIn_12_4 = stackOut_10_4;
                    stackIn_12_5 = stackOut_10_5;
                    stackIn_11_0 = stackOut_10_0;
                    stackIn_11_1 = stackOut_10_1;
                    stackIn_11_2 = stackOut_10_2;
                    stackIn_11_3 = stackOut_10_3;
                    stackIn_11_4 = stackOut_10_4;
                    stackIn_11_5 = stackOut_10_5;
                    if (kf.field_a == null) {
                      stackOut_12_0 = (vf) (Object) stackIn_12_0;
                      stackOut_12_1 = stackIn_12_1;
                      stackOut_12_2 = null;
                      stackOut_12_3 = null;
                      stackOut_12_4 = (java.net.URL) (Object) stackIn_12_4;
                      stackOut_12_5 = (StringBuilder) (Object) stackIn_12_5;
                      stackOut_12_6 = "" + jn.field_n;
                      stackIn_13_0 = stackOut_12_0;
                      stackIn_13_1 = stackOut_12_1;
                      stackIn_13_2 = stackOut_12_2;
                      stackIn_13_3 = stackOut_12_3;
                      stackIn_13_4 = stackOut_12_4;
                      stackIn_13_5 = stackOut_12_5;
                      stackIn_13_6 = stackOut_12_6;
                      break L4;
                    } else {
                      stackOut_11_0 = (vf) (Object) stackIn_11_0;
                      stackOut_11_1 = stackIn_11_1;
                      stackOut_11_2 = null;
                      stackOut_11_3 = null;
                      stackOut_11_4 = (java.net.URL) (Object) stackIn_11_4;
                      stackOut_11_5 = (StringBuilder) (Object) stackIn_11_5;
                      stackOut_11_6 = kf.field_a;
                      stackIn_13_0 = stackOut_11_0;
                      stackIn_13_1 = stackOut_11_1;
                      stackIn_13_2 = stackOut_11_2;
                      stackIn_13_3 = stackOut_11_3;
                      stackIn_13_4 = stackOut_11_4;
                      stackIn_13_5 = stackOut_11_5;
                      stackIn_13_6 = stackOut_11_6;
                      break L4;
                    }
                  }
                  var4 = ((vf) (Object) stackIn_13_0).a((byte) stackIn_13_1, new java.net.URL(stackIn_13_4, stackIn_13_6 + "&v1=" + vf.field_s + "&v2=" + vf.field_b + "&e=" + var7));
                  L5: while (true) {
                    if (var4.field_c != 0) {
                      L6: {
                        if (var4.field_c != 1) {
                          break L6;
                        } else {
                          var5 = (DataInputStream) var4.field_a;
                          int discarded$6 = var5.read();
                          var5.close();
                          break L6;
                        }
                      }
                      break L0;
                    } else {
                      int discarded$7 = -10309;
                      gf.a(1L);
                      continue L5;
                    }
                  }
                } else {
                  return;
                }
              }
            } catch (java.lang.Exception decompiledCaughtParameter0) {
              decompiledCaughtException = decompiledCaughtParameter0;
              L7: {
                var3 = (Exception) (Object) decompiledCaughtException;
                break L7;
              }
            }
        } catch (RuntimeException | Error decompiledUncheckedException) {
            throw decompiledUncheckedException;
        } catch (Throwable decompiledCheckedException) {
            throw new RuntimeException(decompiledCheckedException);
        }
    }

    final synchronized void c(int param0, int param1) {
        ((di) this).field_r = param0;
        if (param1 != -102) {
            int discarded$0 = ((di) this).d();
        }
    }

    private final void f(int param0, int param1) {
        cg var3 = null;
        int var4 = MinerDisturbance.field_ab;
        if (0 != (((di) this).field_v[param0] & 4)) {
            var3 = (cg) (Object) ((di) this).field_z.field_v.b(122);
            while (var3 != null) {
                if (!(var3.field_n != param0)) {
                    var3.field_B = 0;
                }
                var3 = (cg) (Object) ((di) this).field_z.field_v.b((byte) 56);
            }
        }
    }

    private final void e(int param0, int param1) {
        cg var3 = null;
        int var4 = 0;
        Object var5 = null;
        var4 = MinerDisturbance.field_ab;
        var3 = (cg) (Object) ((di) this).field_z.field_v.b(71);
        L0: while (true) {
          if (var3 == null) {
            L1: {
              if (param1 >= 1) {
                break L1;
              } else {
                var5 = null;
                ((di) this).a(false, (wh) null, (byte) 83);
                break L1;
              }
            }
            return;
          } else {
            L2: {
              L3: {
                if (param0 < 0) {
                  break L3;
                } else {
                  if (var3.field_n != param0) {
                    break L2;
                  } else {
                    break L3;
                  }
                }
              }
              if (var3.field_G < 0) {
                ((di) this).field_gb[var3.field_n][var3.field_F] = null;
                var3.field_G = 0;
                break L2;
              } else {
                break L2;
              }
            }
            var3 = (cg) (Object) ((di) this).field_z.field_v.b((byte) 56);
            continue L0;
          }
        }
    }

    private final synchronized void a(int param0, wh param1, boolean param2, boolean param3) {
        int var5_int = 0;
        int var6 = 0;
        int var8 = MinerDisturbance.field_ab;
        try {
            this.a(param3, true);
            ((di) this).field_eb.a(param1.field_o);
            ((di) this).field_C = param2 ? true : false;
            ((di) this).field_fb = 0L;
            var5_int = ((di) this).field_eb.g();
            var6 = 0;
            int var7 = -96 % ((66 - param0) / 48);
            while (var6 < var5_int) {
                ((di) this).field_eb.a(var6);
                ((di) this).field_eb.e(var6);
                ((di) this).field_eb.b(var6);
                var6++;
            }
            ((di) this).field_W = ((di) this).field_eb.c();
            ((di) this).field_bb = ((di) this).field_eb.field_b[((di) this).field_W];
            ((di) this).field_t = ((di) this).field_eb.f(((di) this).field_bb);
        } catch (RuntimeException runtimeException) {
            throw lj.a((Throwable) (Object) runtimeException, "di.K(" + param0 + 44 + (param1 != null ? "{...}" : "null") + 44 + param2 + 44 + param3 + 41);
        }
    }

    private final void a(int param0, byte param1) {
        int var3 = 0;
        int var4 = 0;
        int var5 = 0;
        int var6 = 0;
        int var7 = 0;
        int var8 = 0;
        var8 = MinerDisturbance.field_ab;
        var3 = 240 & param0;
        if (var3 != 128) {
          L0: {
            if (var3 == 144) {
              var4 = 15 & param0;
              var5 = param0 >> 8 & 127;
              var6 = param0 >> 16 & 127;
              if (var6 > 0) {
                this.b((byte) -114, var4, var6, var5);
                return;
              } else {
                this.a((byte) -60, var5, 64, var4);
                break L0;
              }
            } else {
              if (var3 == 160) {
                var4 = 15 & param0;
                var5 = 127 & param0 >> 8;
                var6 = (param0 & 8386190) >> 16;
                this.a(var4, (byte) 94, var6, var5);
                return;
              } else {
                if (var3 != 176) {
                  if (192 == var3) {
                    var4 = param0 & 15;
                    var5 = (32529 & param0) >> 8;
                    this.c(var5 + ((di) this).field_B[var4], var4, -56);
                    return;
                  } else {
                    if (var3 == 208) {
                      var4 = param0 & 15;
                      var5 = 127 & param0 >> 8;
                      this.d(var4, var5, 1632);
                      return;
                    } else {
                      if (var3 == 224) {
                        var4 = 15 & param0;
                        var5 = ((8323374 & param0) >> 9) + (127 & param0 >> 8);
                        this.a(var5, var4, (byte) 57);
                        return;
                      } else {
                        var3 = 255 & param0;
                        if (var3 != 255) {
                          var4 = -1;
                          return;
                        } else {
                          int discarded$1 = -21400;
                          this.b(true);
                          return;
                        }
                      }
                    }
                  }
                } else {
                  L1: {
                    var4 = 15 & param0;
                    var5 = 127 & param0 >> 8;
                    var6 = 127 & param0 >> 16;
                    if (var5 != 0) {
                      break L1;
                    } else {
                      ((di) this).field_B[var4] = (var6 << 14) + c.a(-2080769, ((di) this).field_B[var4]);
                      break L1;
                    }
                  }
                  L2: {
                    if (var5 != 32) {
                      break L2;
                    } else {
                      ((di) this).field_B[var4] = c.a(((di) this).field_B[var4], -16257) + (var6 << 7);
                      break L2;
                    }
                  }
                  L3: {
                    if (var5 == 1) {
                      ((di) this).field_I[var4] = (var6 << 7) + c.a(((di) this).field_I[var4], -16257);
                      break L3;
                    } else {
                      break L3;
                    }
                  }
                  L4: {
                    if (var5 == 33) {
                      ((di) this).field_I[var4] = c.a(-128, ((di) this).field_I[var4]) + var6;
                      break L4;
                    } else {
                      break L4;
                    }
                  }
                  L5: {
                    if (5 != var5) {
                      break L5;
                    } else {
                      ((di) this).field_T[var4] = (var6 << 7) + c.a(-16257, ((di) this).field_T[var4]);
                      break L5;
                    }
                  }
                  L6: {
                    if (var5 != 37) {
                      break L6;
                    } else {
                      ((di) this).field_T[var4] = c.a(-128, ((di) this).field_T[var4]) + var6;
                      break L6;
                    }
                  }
                  L7: {
                    if (var5 == 7) {
                      ((di) this).field_R[var4] = c.a(((di) this).field_R[var4], -16257) - -(var6 << 7);
                      break L7;
                    } else {
                      break L7;
                    }
                  }
                  L8: {
                    if (39 != var5) {
                      break L8;
                    } else {
                      ((di) this).field_R[var4] = c.a(-128, ((di) this).field_R[var4]) - -var6;
                      break L8;
                    }
                  }
                  L9: {
                    if (var5 == 10) {
                      ((di) this).field_N[var4] = (var6 << 7) + c.a(((di) this).field_N[var4], -16257);
                      break L9;
                    } else {
                      break L9;
                    }
                  }
                  L10: {
                    if (var5 != 42) {
                      break L10;
                    } else {
                      ((di) this).field_N[var4] = var6 + c.a(((di) this).field_N[var4], -128);
                      break L10;
                    }
                  }
                  L11: {
                    if (var5 == 11) {
                      ((di) this).field_S[var4] = c.a(-16257, ((di) this).field_S[var4]) - -(var6 << 7);
                      break L11;
                    } else {
                      break L11;
                    }
                  }
                  L12: {
                    if (var5 == 43) {
                      ((di) this).field_S[var4] = c.a(-128, ((di) this).field_S[var4]) + var6;
                      break L12;
                    } else {
                      break L12;
                    }
                  }
                  L13: {
                    if (var5 == 64) {
                      if (var6 >= 64) {
                        ((di) this).field_v[var4] = hi.a(((di) this).field_v[var4], 1);
                        break L13;
                      } else {
                        ((di) this).field_v[var4] = c.a(((di) this).field_v[var4], -2);
                        break L13;
                      }
                    } else {
                      break L13;
                    }
                  }
                  L14: {
                    if (var5 == 65) {
                      if (var6 < 64) {
                        this.d(var4, -114);
                        ((di) this).field_v[var4] = c.a(((di) this).field_v[var4], -3);
                        break L14;
                      } else {
                        ((di) this).field_v[var4] = hi.a(((di) this).field_v[var4], 2);
                        break L14;
                      }
                    } else {
                      break L14;
                    }
                  }
                  L15: {
                    if (var5 != 99) {
                      break L15;
                    } else {
                      ((di) this).field_w[var4] = c.a(127, ((di) this).field_w[var4]) - -(var6 << 7);
                      break L15;
                    }
                  }
                  L16: {
                    if (98 != var5) {
                      break L16;
                    } else {
                      ((di) this).field_w[var4] = var6 + c.a(16256, ((di) this).field_w[var4]);
                      break L16;
                    }
                  }
                  L17: {
                    if (var5 == 101) {
                      ((di) this).field_w[var4] = (var6 << 7) + (c.a(127, ((di) this).field_w[var4]) + 16384);
                      break L17;
                    } else {
                      break L17;
                    }
                  }
                  L18: {
                    if (var5 == 100) {
                      ((di) this).field_w[var4] = 16384 - -c.a(16256, ((di) this).field_w[var4]) - -var6;
                      break L18;
                    } else {
                      break L18;
                    }
                  }
                  L19: {
                    if (var5 != 120) {
                      break L19;
                    } else {
                      this.a(var4, -10911);
                      break L19;
                    }
                  }
                  L20: {
                    if (var5 != 121) {
                      break L20;
                    } else {
                      this.b(var4, 0);
                      break L20;
                    }
                  }
                  L21: {
                    if (123 != var5) {
                      break L21;
                    } else {
                      this.e(var4, 35);
                      break L21;
                    }
                  }
                  L22: {
                    if (var5 != 6) {
                      break L22;
                    } else {
                      var7 = ((di) this).field_w[var4];
                      if (var7 == 16384) {
                        ((di) this).field_db[var4] = c.a(((di) this).field_db[var4], -16257) - -(var6 << 7);
                        break L22;
                      } else {
                        break L22;
                      }
                    }
                  }
                  L23: {
                    if (var5 != 38) {
                      break L23;
                    } else {
                      var7 = ((di) this).field_w[var4];
                      if (var7 != 16384) {
                        break L23;
                      } else {
                        ((di) this).field_db[var4] = c.a(((di) this).field_db[var4], -128) + var6;
                        break L23;
                      }
                    }
                  }
                  L24: {
                    if (var5 == 16) {
                      ((di) this).field_Y[var4] = c.a(((di) this).field_Y[var4], -16257) + (var6 << 7);
                      break L24;
                    } else {
                      break L24;
                    }
                  }
                  L25: {
                    if (var5 == 48) {
                      ((di) this).field_Y[var4] = var6 + c.a(((di) this).field_Y[var4], -128);
                      break L25;
                    } else {
                      break L25;
                    }
                  }
                  L26: {
                    if (var5 == 81) {
                      if (var6 < 64) {
                        this.f(var4, 20257);
                        ((di) this).field_v[var4] = c.a(((di) this).field_v[var4], -5);
                        break L26;
                      } else {
                        ((di) this).field_v[var4] = hi.a(((di) this).field_v[var4], 4);
                        break L26;
                      }
                    } else {
                      break L26;
                    }
                  }
                  L27: {
                    if (var5 == 17) {
                      this.a(var4, (byte) 116, (var6 << 7) + (((di) this).field_s[var4] & -16257));
                      break L27;
                    } else {
                      break L27;
                    }
                  }
                  if (var5 != 49) {
                    break L0;
                  } else {
                    this.a(var4, (byte) 98, (((di) this).field_s[var4] & -128) + var6);
                    return;
                  }
                }
              }
            }
          }
          return;
        } else {
          var4 = param0 & 15;
          var5 = param0 >> 8 & 127;
          var6 = (param0 & 8366393) >> 16;
          this.a((byte) -123, var5, var6, var4);
          return;
        }
    }

    final synchronized void e(int param0) {
        int var3 = MinerDisturbance.field_ab;
        if (param0 != 100) {
            ((di) this).field_u = null;
        }
        vc var4 = (vc) (Object) ((di) this).field_F.a(-16545);
        while (var4 != null) {
            var4.a(12361);
            var4 = (vc) (Object) ((di) this).field_F.a(true);
        }
    }

    public static void a(byte param0) {
        field_D = null;
        field_x = null;
        field_O = null;
        field_V = null;
        field_E = null;
        field_cb = null;
        field_ab = null;
    }

    final synchronized void a(int param0) {
        int var2 = 0;
        long var3 = 0L;
        int var5 = 0;
        int var6 = 0;
        L0: {
          var6 = MinerDisturbance.field_ab;
          if (!((di) this).field_eb.e()) {
            break L0;
          } else {
            var2 = ((di) this).field_r * ((di) this).field_eb.field_g / fj.field_r;
            L1: while (true) {
              var3 = ((di) this).field_fb - -((long)param0 * (long)var2);
              if (-var3 + ((di) this).field_t >= 0L) {
                ((di) this).field_fb = var3;
                break L0;
              } else {
                var5 = (int)((-1L + (long)var2 + (((di) this).field_t + -((di) this).field_fb)) / (long)var2);
                ((di) this).field_fb = ((di) this).field_fb + (long)var5 * (long)var2;
                param0 = param0 - var5;
                ((di) this).field_z.a(var5);
                int discarded$1 = 128;
                this.f();
                if (!((di) this).field_eb.e()) {
                  break L0;
                } else {
                  continue L1;
                }
              }
            }
          }
        }
        ((di) this).field_z.a(param0);
    }

    private final void a(byte param0, int param1, int param2, int param3) {
        cg var6 = null;
        int var7 = 0;
        cg var8 = null;
        var7 = MinerDisturbance.field_ab;
        var8 = ((di) this).field_gb[param3][param1];
        if (var8 == null) {
          return;
        } else {
          L0: {
            ((di) this).field_gb[param3][param1] = null;
            if (param0 <= -3) {
              break L0;
            } else {
              this.d(-81, 83);
              break L0;
            }
          }
          L1: {
            if (0 == (2 & ((di) this).field_v[param3])) {
              var8.field_G = 0;
              break L1;
            } else {
              var6 = (cg) (Object) ((di) this).field_z.field_v.b(72);
              L2: while (true) {
                if (var6 == null) {
                  break L1;
                } else {
                  L3: {
                    if (var8.field_n != var6.field_n) {
                      break L3;
                    } else {
                      if (0 <= var6.field_G) {
                        break L3;
                      } else {
                        if (var6 == var8) {
                          break L3;
                        } else {
                          var8.field_G = 0;
                          break L1;
                        }
                      }
                    }
                  }
                  var6 = (cg) (Object) ((di) this).field_z.field_v.b((byte) 56);
                  continue L2;
                }
              }
            }
          }
          return;
        }
    }

    private final void d(int param0, int param1) {
        int var3 = 0;
        cg var4 = null;
        int var5 = 0;
        L0: {
          var5 = MinerDisturbance.field_ab;
          var3 = 125 / ((-48 - param1) / 62);
          if ((2 & ((di) this).field_v[param0]) == 0) {
            break L0;
          } else {
            var4 = (cg) (Object) ((di) this).field_z.field_v.b(76);
            L1: while (true) {
              if (var4 == null) {
                break L0;
              } else {
                L2: {
                  if (param0 != var4.field_n) {
                    break L2;
                  } else {
                    if (((di) this).field_gb[param0][var4.field_F] == null) {
                      if (0 > var4.field_G) {
                        var4.field_G = 0;
                        break L2;
                      } else {
                        break L2;
                      }
                    } else {
                      var4 = (cg) (Object) ((di) this).field_z.field_v.b((byte) 56);
                      continue L1;
                    }
                  }
                }
                var4 = (cg) (Object) ((di) this).field_z.field_v.b((byte) 56);
                continue L1;
              }
            }
          }
        }
    }

    private final void a(int param0, byte param1, int param2, int param3) {
    }

    final synchronized void a(boolean param0, wh param1, byte param2) {
        RuntimeException runtimeException = null;
        RuntimeException stackIn_4_0 = null;
        StringBuilder stackIn_4_1 = null;
        RuntimeException stackIn_5_0 = null;
        StringBuilder stackIn_5_1 = null;
        RuntimeException stackIn_6_0 = null;
        StringBuilder stackIn_6_1 = null;
        String stackIn_6_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException stackOut_3_0 = null;
        StringBuilder stackOut_3_1 = null;
        RuntimeException stackOut_5_0 = null;
        StringBuilder stackOut_5_1 = null;
        String stackOut_5_2 = null;
        RuntimeException stackOut_4_0 = null;
        StringBuilder stackOut_4_1 = null;
        String stackOut_4_2 = null;
        try {
          L0: {
            L1: {
              this.a(17, param1, param0, true);
              if (param2 == 2) {
                break L1;
              } else {
                ((di) this).field_H = null;
                break L1;
              }
            }
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L2: {
            runtimeException = decompiledCaughtException;
            stackOut_3_0 = (RuntimeException) runtimeException;
            stackOut_3_1 = new StringBuilder().append("di.AA(").append(param0).append(44);
            stackIn_5_0 = stackOut_3_0;
            stackIn_5_1 = stackOut_3_1;
            stackIn_4_0 = stackOut_3_0;
            stackIn_4_1 = stackOut_3_1;
            if (param1 == null) {
              stackOut_5_0 = (RuntimeException) (Object) stackIn_5_0;
              stackOut_5_1 = (StringBuilder) (Object) stackIn_5_1;
              stackOut_5_2 = "null";
              stackIn_6_0 = stackOut_5_0;
              stackIn_6_1 = stackOut_5_1;
              stackIn_6_2 = stackOut_5_2;
              break L2;
            } else {
              stackOut_4_0 = (RuntimeException) (Object) stackIn_4_0;
              stackOut_4_1 = (StringBuilder) (Object) stackIn_4_1;
              stackOut_4_2 = "{...}";
              stackIn_6_0 = stackOut_4_0;
              stackIn_6_1 = stackOut_4_1;
              stackIn_6_2 = stackOut_4_2;
              break L2;
            }
          }
          throw lj.a((Throwable) (Object) stackIn_6_0, stackIn_6_2 + 44 + param2 + 41);
        }
    }

    private final void d(int param0, int param1, int param2) {
    }

    final synchronized void c(byte param0) {
        this.a(true, true);
        if (param0 != 108) {
            ((di) this).field_T = null;
        }
    }

    final synchronized void a(byte param0, int param1) {
        ((di) this).field_Q = param1;
        if (param0 >= -64) {
            Object var4 = null;
            int discarded$0 = this.a(16, (cg) null);
        }
    }

    public di() {
        ((di) this).field_Q = 256;
        ((di) this).field_w = new int[16];
        ((di) this).field_P = new int[16];
        ((di) this).field_r = 1000000;
        ((di) this).field_I = new int[16];
        ((di) this).field_H = new int[16];
        ((di) this).field_B = new int[16];
        ((di) this).field_y = new int[16];
        ((di) this).field_R = new int[16];
        ((di) this).field_S = new int[16];
        ((di) this).field_gb = new cg[16][128];
        ((di) this).field_T = new int[16];
        ((di) this).field_Y = new int[16];
        ((di) this).field_db = new int[16];
        ((di) this).field_u = new int[16];
        ((di) this).field_s = new int[16];
        ((di) this).field_v = new int[16];
        ((di) this).field_U = new cg[16][128];
        ((di) this).field_N = new int[16];
        ((di) this).field_J = new int[16];
        ((di) this).field_eb = new nl();
        ((di) this).field_z = new gd((di) this);
        ((di) this).field_F = new tg(128);
        ((di) this).a(256, true, -1);
        int discarded$0 = -21400;
        this.b(true);
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_cb = "Confirm Email:";
        field_V = new int[128];
        field_Z = 0;
        field_E = "Passwords must be between 5 and 20 letters and numbers";
        field_O = new gi();
    }
}
