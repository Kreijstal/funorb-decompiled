/*
 * Decompiled by CFR-JS 0.4.0.
 */
class cb extends ce {
    private int field_L;
    private vn[] field_D;
    private int field_Y;
    private vn field_A;
    private boolean field_H;
    private vn field_F;
    private int field_S;
    private int field_K;
    private int field_P;
    private boolean field_E;
    private vn[] field_y;
    private String field_O;
    private rb field_bb;
    private boolean field_cb;
    private int field_J;
    private int field_x;
    static int[] field_N;
    private int field_V;
    private int field_Q;
    private vn field_R;
    private int field_fb;
    private int field_gb;
    private vn field_C;
    private boolean field_X;
    private int field_T;
    private boolean field_eb;
    private String field_Z;
    private int field_M;
    private boolean field_w;
    private vn[] field_db;
    private int field_z;
    private vn field_B;
    private int field_ab;
    private vn[] field_G;
    private int field_U;
    private int field_I;
    private int field_W;
    private vn[] field_hb;

    final static boolean a(int param0, char param1) {
        RuntimeException var2 = null;
        int stackIn_2_0 = 0;
        int stackIn_16_0 = 0;
        RuntimeException decompiledCaughtException = null;
        int stackOut_15_0 = 0;
        int stackOut_13_0 = 0;
        int stackOut_1_0 = 0;
        try {
          L0: {
            if (param0 >= 59) {
              L1: {
                L2: {
                  L3: {
                    if (65 > param1) {
                      break L3;
                    } else {
                      if (param1 <= 90) {
                        break L2;
                      } else {
                        break L3;
                      }
                    }
                  }
                  L4: {
                    if (param1 < 97) {
                      break L4;
                    } else {
                      if (param1 > 122) {
                        break L4;
                      } else {
                        break L2;
                      }
                    }
                  }
                  stackOut_15_0 = 0;
                  stackIn_16_0 = stackOut_15_0;
                  break L1;
                }
                stackOut_13_0 = 1;
                stackIn_16_0 = stackOut_13_0;
                break L1;
              }
              break L0;
            } else {
              stackOut_1_0 = 0;
              stackIn_2_0 = stackOut_1_0;
              return stackIn_2_0 != 0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2 = decompiledCaughtException;
          throw sh.a((Throwable) (Object) var2, "cb.B(" + param0 + ',' + param1 + ')');
        }
        return stackIn_16_0 != 0;
    }

    public static void e(int param0) {
        try {
            field_N = null;
            if (param0 < 65) {
                boolean discarded$0 = cb.a(-56, 'N');
            }
        } catch (RuntimeException runtimeException) {
            throw sh.a((Throwable) (Object) runtimeException, "cb.D(" + param0 + ')');
        }
    }

    final static String f(int param0) {
        RuntimeException var1 = null;
        String var1_ref = null;
        int var2 = 0;
        int var3 = 0;
        int var4 = 0;
        int var5 = 0;
        String stackIn_10_0 = null;
        String stackIn_24_0 = null;
        RuntimeException decompiledCaughtException = null;
        String stackOut_9_0 = null;
        String stackOut_23_0 = null;
        var5 = ZombieDawn.field_J;
        try {
          L0: {
            L1: {
              if (param0 == 3) {
                break L1;
              } else {
                boolean discarded$1 = cb.a(39, '￾');
                break L1;
              }
            }
            L2: {
              L3: {
                var1_ref = "(" + em.field_U + " " + wb.field_t + " " + e.field_P + ") " + l.field_d;
                if (jd.field_b > 0) {
                  var1_ref = var1_ref + ":";
                  var2 = 0;
                  L4: while (true) {
                    if (~jd.field_b >= ~var2) {
                      break L3;
                    } else {
                      stackOut_9_0 = var1_ref + ' ';
                      stackIn_24_0 = stackOut_9_0;
                      stackIn_10_0 = stackOut_9_0;
                      if (var5 != 0) {
                        break L2;
                      } else {
                        L5: {
                          L6: {
                            var1_ref = stackIn_10_0;
                            var3 = fj.field_g.field_h[var2] & 255;
                            var4 = var3 >> -1932707036;
                            var3 = var3 & 15;
                            if (var4 >= 10) {
                              break L6;
                            } else {
                              var4 += 48;
                              if (var5 == 0) {
                                break L5;
                              } else {
                                break L6;
                              }
                            }
                          }
                          var4 += 55;
                          break L5;
                        }
                        L7: {
                          L8: {
                            if (10 <= var3) {
                              break L8;
                            } else {
                              var3 += 48;
                              if (var5 == 0) {
                                break L7;
                              } else {
                                break L8;
                              }
                            }
                          }
                          var3 += 55;
                          break L7;
                        }
                        var1_ref = var1_ref + (char)var4;
                        var1_ref = var1_ref + (char)var3;
                        var2++;
                        if (var5 == 0) {
                          continue L4;
                        } else {
                          break L3;
                        }
                      }
                    }
                  }
                } else {
                  break L3;
                }
              }
              stackOut_23_0 = (String) var1_ref;
              stackIn_24_0 = stackOut_23_0;
              break L2;
            }
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var1 = decompiledCaughtException;
          throw sh.a((Throwable) (Object) var1, "cb.A(" + param0 + ')');
        }
        return stackIn_24_0;
    }

    cb(long param0, cb param1) {
        this(param0, param1, 0, 0, 0, 0, (String) null);
    }

    private final void a(int param0, cb param1) {
        RuntimeException var3 = null;
        RuntimeException stackIn_135_0 = null;
        StringBuilder stackIn_135_1 = null;
        RuntimeException stackIn_137_0 = null;
        StringBuilder stackIn_137_1 = null;
        RuntimeException stackIn_138_0 = null;
        StringBuilder stackIn_138_1 = null;
        String stackIn_138_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException stackOut_134_0 = null;
        StringBuilder stackOut_134_1 = null;
        RuntimeException stackOut_137_0 = null;
        StringBuilder stackOut_137_1 = null;
        String stackOut_137_2 = null;
        RuntimeException stackOut_135_0 = null;
        StringBuilder stackOut_135_1 = null;
        String stackOut_135_2 = null;
        try {
          L0: {
            L1: {
              if (null != param1) {
                L2: {
                  if (param1.field_F == null) {
                    break L2;
                  } else {
                    ((cb) this).field_F = param1.field_F;
                    break L2;
                  }
                }
                L3: {
                  if (null == param1.field_G) {
                    break L3;
                  } else {
                    ((cb) this).field_G = param1.field_G;
                    break L3;
                  }
                }
                L4: {
                  if (-2147483648 == param1.field_M) {
                    break L4;
                  } else {
                    ((cb) this).field_M = param1.field_M;
                    break L4;
                  }
                }
                L5: {
                  if (null == param1.field_bb) {
                    break L5;
                  } else {
                    ((cb) this).field_bb = param1.field_bb;
                    break L5;
                  }
                }
                L6: {
                  if (param1.field_D == null) {
                    break L6;
                  } else {
                    ((cb) this).field_D = param1.field_D;
                    break L6;
                  }
                }
                L7: {
                  if (param1.field_gb == -2147483648) {
                    break L7;
                  } else {
                    ((cb) this).field_gb = param1.field_gb;
                    break L7;
                  }
                }
                L8: {
                  if (!param1.field_w) {
                    break L8;
                  } else {
                    ((cb) this).field_w = param1.field_w;
                    break L8;
                  }
                }
                L9: {
                  if (null != param1.field_A) {
                    ((cb) this).field_A = param1.field_A;
                    break L9;
                  } else {
                    break L9;
                  }
                }
                L10: {
                  if (param1.field_X) {
                    break L10;
                  } else {
                    ((cb) this).field_X = param1.field_X;
                    break L10;
                  }
                }
                L11: {
                  if (!param1.field_E) {
                    break L11;
                  } else {
                    ((cb) this).field_E = param1.field_E;
                    break L11;
                  }
                }
                L12: {
                  if (-2147483648 == param1.field_Q) {
                    break L12;
                  } else {
                    ((cb) this).field_Q = param1.field_Q;
                    break L12;
                  }
                }
                L13: {
                  if (param1.field_O == null) {
                    break L13;
                  } else {
                    ((cb) this).field_O = param1.field_O;
                    break L13;
                  }
                }
                L14: {
                  if (param1.field_T != 0) {
                    ((cb) this).field_T = param1.field_T;
                    break L14;
                  } else {
                    break L14;
                  }
                }
                L15: {
                  if (!param1.field_H) {
                    break L15;
                  } else {
                    ((cb) this).field_H = param1.field_H;
                    break L15;
                  }
                }
                L16: {
                  if (param1.field_Y != 0) {
                    ((cb) this).field_Y = param1.field_Y;
                    break L16;
                  } else {
                    break L16;
                  }
                }
                L17: {
                  if (param1.field_Z != null) {
                    ((cb) this).field_Z = param1.field_Z;
                    break L17;
                  } else {
                    break L17;
                  }
                }
                L18: {
                  if (param1.field_K >= 0) {
                    ((cb) this).field_K = param1.field_K;
                    break L18;
                  } else {
                    break L18;
                  }
                }
                L19: {
                  if (param1.field_ab != 0) {
                    ((cb) this).field_ab = param1.field_ab;
                    break L19;
                  } else {
                    break L19;
                  }
                }
                L20: {
                  if (0 == param1.field_fb) {
                    break L20;
                  } else {
                    ((cb) this).field_fb = param1.field_fb;
                    break L20;
                  }
                }
                L21: {
                  if (null == param1.field_R) {
                    break L21;
                  } else {
                    ((cb) this).field_R = param1.field_R;
                    break L21;
                  }
                }
                L22: {
                  if (!param1.field_cb) {
                    break L22;
                  } else {
                    ((cb) this).field_cb = param1.field_cb;
                    break L22;
                  }
                }
                L23: {
                  if (null != param1.field_B) {
                    ((cb) this).field_B = param1.field_B;
                    break L23;
                  } else {
                    break L23;
                  }
                }
                L24: {
                  if (param1.field_db != null) {
                    ((cb) this).field_db = param1.field_db;
                    break L24;
                  } else {
                    break L24;
                  }
                }
                L25: {
                  if (param1.field_eb) {
                    ((cb) this).field_eb = param1.field_eb;
                    break L25;
                  } else {
                    break L25;
                  }
                }
                L26: {
                  if (null != param1.field_y) {
                    ((cb) this).field_y = param1.field_y;
                    break L26;
                  } else {
                    break L26;
                  }
                }
                L27: {
                  if (-2147483648 == param1.field_V) {
                    break L27;
                  } else {
                    ((cb) this).field_V = param1.field_V;
                    break L27;
                  }
                }
                L28: {
                  if (param1.field_z == -2147483648) {
                    break L28;
                  } else {
                    ((cb) this).field_z = param1.field_z;
                    break L28;
                  }
                }
                L29: {
                  if (param1.field_U == 0) {
                    break L29;
                  } else {
                    ((cb) this).field_U = param1.field_U;
                    break L29;
                  }
                }
                L30: {
                  if (null != param1.field_hb) {
                    ((cb) this).field_hb = param1.field_hb;
                    break L30;
                  } else {
                    break L30;
                  }
                }
                L31: {
                  if (256 != param1.field_x) {
                    ((cb) this).field_x = param1.field_x;
                    break L31;
                  } else {
                    break L31;
                  }
                }
                L32: {
                  if (param1.field_L != 0) {
                    ((cb) this).field_L = param1.field_L;
                    break L32;
                  } else {
                    break L32;
                  }
                }
                L33: {
                  if (param1.field_S != -2147483648) {
                    ((cb) this).field_S = param1.field_S;
                    break L33;
                  } else {
                    break L33;
                  }
                }
                L34: {
                  if (0 <= param1.field_J) {
                    ((cb) this).field_J = param1.field_J;
                    break L34;
                  } else {
                    break L34;
                  }
                }
                L35: {
                  if (0 > param1.field_I) {
                    break L35;
                  } else {
                    ((cb) this).field_I = param1.field_I;
                    break L35;
                  }
                }
                L36: {
                  if (null != param1.field_C) {
                    ((cb) this).field_C = param1.field_C;
                    break L36;
                  } else {
                    break L36;
                  }
                }
                L37: {
                  if (0 > param1.field_W) {
                    break L37;
                  } else {
                    ((cb) this).field_W = param1.field_W;
                    break L37;
                  }
                }
                if (param1.field_P == 0) {
                  break L1;
                } else {
                  ((cb) this).field_P = param1.field_P;
                  break L1;
                }
              } else {
                break L1;
              }
            }
            L38: {
              if (param0 == -2147483648) {
                break L38;
              } else {
                ((cb) this).field_D = null;
                break L38;
              }
            }
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L39: {
            var3 = decompiledCaughtException;
            stackOut_134_0 = (RuntimeException) var3;
            stackOut_134_1 = new StringBuilder().append("cb.C(").append(param0).append(',');
            stackIn_137_0 = stackOut_134_0;
            stackIn_137_1 = stackOut_134_1;
            stackIn_135_0 = stackOut_134_0;
            stackIn_135_1 = stackOut_134_1;
            if (param1 == null) {
              stackOut_137_0 = (RuntimeException) (Object) stackIn_137_0;
              stackOut_137_1 = (StringBuilder) (Object) stackIn_137_1;
              stackOut_137_2 = "null";
              stackIn_138_0 = stackOut_137_0;
              stackIn_138_1 = stackOut_137_1;
              stackIn_138_2 = stackOut_137_2;
              break L39;
            } else {
              stackOut_135_0 = (RuntimeException) (Object) stackIn_135_0;
              stackOut_135_1 = (StringBuilder) (Object) stackIn_135_1;
              stackOut_135_2 = "{...}";
              stackIn_138_0 = stackOut_135_0;
              stackIn_138_1 = stackOut_135_1;
              stackIn_138_2 = stackOut_135_2;
              break L39;
            }
          }
          throw sh.a((Throwable) (Object) stackIn_138_0, stackIn_138_2 + ')');
        }
    }

    private cb(long param0, cb param1, int param2, int param3, int param4, int param5, String param6) {
        RuntimeException runtimeException = null;
        RuntimeException stackIn_5_0 = null;
        StringBuilder stackIn_5_1 = null;
        RuntimeException stackIn_7_0 = null;
        StringBuilder stackIn_7_1 = null;
        RuntimeException stackIn_8_0 = null;
        StringBuilder stackIn_8_1 = null;
        String stackIn_8_2 = null;
        RuntimeException stackIn_9_0 = null;
        StringBuilder stackIn_9_1 = null;
        RuntimeException stackIn_11_0 = null;
        StringBuilder stackIn_11_1 = null;
        RuntimeException stackIn_12_0 = null;
        StringBuilder stackIn_12_1 = null;
        String stackIn_12_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException stackOut_4_0 = null;
        StringBuilder stackOut_4_1 = null;
        RuntimeException stackOut_7_0 = null;
        StringBuilder stackOut_7_1 = null;
        String stackOut_7_2 = null;
        RuntimeException stackOut_5_0 = null;
        StringBuilder stackOut_5_1 = null;
        String stackOut_5_2 = null;
        RuntimeException stackOut_8_0 = null;
        StringBuilder stackOut_8_1 = null;
        RuntimeException stackOut_11_0 = null;
        StringBuilder stackOut_11_1 = null;
        String stackOut_11_2 = null;
        RuntimeException stackOut_9_0 = null;
        StringBuilder stackOut_9_1 = null;
        String stackOut_9_2 = null;
        ((cb) this).field_K = -1;
        ((cb) this).field_S = -2147483648;
        ((cb) this).field_x = 256;
        ((cb) this).field_Q = -2147483648;
        ((cb) this).field_V = -2147483648;
        ((cb) this).field_gb = -2147483648;
        ((cb) this).field_M = -2147483648;
        ((cb) this).field_J = -1;
        ((cb) this).field_H = false;
        ((cb) this).field_X = true;
        ((cb) this).field_I = -1;
        ((cb) this).field_z = -2147483648;
        ((cb) this).field_W = -1;
        try {
          L0: {
            L1: {
              ((cb) this).field_f = param0;
              this.a(-2147483648, param1);
              if (null == param6) {
                break L1;
              } else {
                ((cb) this).field_Z = param6;
                break L1;
              }
            }
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L2: {
            runtimeException = decompiledCaughtException;
            stackOut_4_0 = (RuntimeException) runtimeException;
            stackOut_4_1 = new StringBuilder().append("cb.<init>(").append(param0).append(',');
            stackIn_7_0 = stackOut_4_0;
            stackIn_7_1 = stackOut_4_1;
            stackIn_5_0 = stackOut_4_0;
            stackIn_5_1 = stackOut_4_1;
            if (param1 == null) {
              stackOut_7_0 = (RuntimeException) (Object) stackIn_7_0;
              stackOut_7_1 = (StringBuilder) (Object) stackIn_7_1;
              stackOut_7_2 = "null";
              stackIn_8_0 = stackOut_7_0;
              stackIn_8_1 = stackOut_7_1;
              stackIn_8_2 = stackOut_7_2;
              break L2;
            } else {
              stackOut_5_0 = (RuntimeException) (Object) stackIn_5_0;
              stackOut_5_1 = (StringBuilder) (Object) stackIn_5_1;
              stackOut_5_2 = "{...}";
              stackIn_8_0 = stackOut_5_0;
              stackIn_8_1 = stackOut_5_1;
              stackIn_8_2 = stackOut_5_2;
              break L2;
            }
          }
          L3: {
            stackOut_8_0 = (RuntimeException) (Object) stackIn_8_0;
            stackOut_8_1 = ((StringBuilder) (Object) stackIn_8_1).append(stackIn_8_2).append(',').append(param2).append(',').append(param3).append(',').append(param4).append(',').append(param5).append(',');
            stackIn_11_0 = stackOut_8_0;
            stackIn_11_1 = stackOut_8_1;
            stackIn_9_0 = stackOut_8_0;
            stackIn_9_1 = stackOut_8_1;
            if (param6 == null) {
              stackOut_11_0 = (RuntimeException) (Object) stackIn_11_0;
              stackOut_11_1 = (StringBuilder) (Object) stackIn_11_1;
              stackOut_11_2 = "null";
              stackIn_12_0 = stackOut_11_0;
              stackIn_12_1 = stackOut_11_1;
              stackIn_12_2 = stackOut_11_2;
              break L3;
            } else {
              stackOut_9_0 = (RuntimeException) (Object) stackIn_9_0;
              stackOut_9_1 = (StringBuilder) (Object) stackIn_9_1;
              stackOut_9_2 = "{...}";
              stackIn_12_0 = stackOut_9_0;
              stackIn_12_1 = stackOut_9_1;
              stackIn_12_2 = stackOut_9_2;
              break L3;
            }
          }
          throw sh.a((Throwable) (Object) stackIn_12_0, stackIn_12_2 + ')');
        }
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_N = new int[]{1, 2, 3, 5, 5, 3, 5, 5, 1, 3, 5, 10, 5, 5, 2, 1, 3, 3, 3, 2, 2, 2, 3, 1, 5, 2, 3, 5, 10, 2, 2, 2};
    }
}
