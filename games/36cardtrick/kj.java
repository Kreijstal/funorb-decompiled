/*
 * Decompiled by CFR-JS 0.4.0.
 */
class kj extends cj {
    private boolean field_p;
    private kc field_V;
    private kc[] field_Q;
    private int field_K;
    private kc field_A;
    private int field_I;
    private int field_u;
    private int field_E;
    private int field_H;
    private boolean field_o;
    private static long[] field_z;
    private kc field_x;
    private int field_U;
    private int field_D;
    private int field_S;
    private kc[] field_w;
    static String field_q;
    private kc field_N;
    private boolean field_C;
    private int field_J;
    private int field_bb;
    private String field_Z;
    private boolean field_s;
    private boolean field_v;
    static int field_t;
    private kc field_B;
    private boolean field_F;
    private int field_r;
    private ee field_Y;
    private int field_ab;
    private kc[] field_T;
    private int field_R;
    private int field_G;
    private int field_n;
    private kc[] field_L;
    private String field_O;
    private kc[] field_X;
    static boolean field_P;
    private int field_M;
    private int field_W;
    private int field_y;

    final static void a(int param0, int param1, int param2, int param3, int param4) {
        sa.field_d = param1;
        mg.field_q = param4;
        if (param3 > -79) {
            return;
        }
        tl.field_b = param2;
        sj.field_c = param0;
    }

    final static void a(byte param0, int param1) {
        int var2 = 0;
        int var3 = 0;
        int var4 = 0;
        int var5 = 0;
        int var6 = 0;
        L0: {
          var6 = Main.field_T;
          var2 = 0;
          var3 = h.field_F;
          if (var3 >= 5) {
            if (105 <= var3) {
              if (120 > var3) {
                var3 = -var3 + 120;
                var2 = 8192 - 8192 * var3 * var3 / 3300;
                break L0;
              } else {
                break L0;
              }
            } else {
              var2 = (var3 * 16384 + -40960) / 220;
              break L0;
            }
          } else {
            var2 = var3 * (var3 * 8192) / 1100;
            break L0;
          }
        }
        L1: {
          var4 = 1;
          var5 = 0;
          if (param1 != 3) {
            break L1;
          } else {
            var4 = -1;
            break L1;
          }
        }
        L2: {
          if (param1 != 1) {
            break L2;
          } else {
            var5 = 1;
            break L2;
          }
        }
        L3: {
          if (4 != param1) {
            break L3;
          } else {
            var4 = 1;
            var5 = 1;
            break L3;
          }
        }
        L4: {
          if (param1 == 5) {
            var4 = -1;
            var5 = 1;
            break L4;
          } else {
            break L4;
          }
        }
        L5: {
          if (param1 == 6) {
            var5 = -1;
            var4 = 1;
            break L5;
          } else {
            break L5;
          }
        }
        L6: {
          L7: {
            if (param1 == 7) {
              break L7;
            } else {
              if (param1 == 8) {
                break L7;
              } else {
                break L6;
              }
            }
          }
          var5 = -1;
          var4 = -1;
          break L6;
        }
        L8: {
          if (11 == param1) {
            var4 = -1;
            break L8;
          } else {
            break L8;
          }
        }
        L9: {
          if (param1 != 12) {
            break L9;
          } else {
            var4 = -1;
            var5 = -1;
            break L9;
          }
        }
        L10: {
          if (param1 == 13) {
            var5 = -1;
            var4 = 1;
            break L10;
          } else {
            break L10;
          }
        }
        L11: {
          if (param1 == 14) {
            var4 = -1;
            var5 = 1;
            break L11;
          } else {
            break L11;
          }
        }
        L12: {
          if (param1 == 15) {
            var4 = 1;
            var5 = 1;
            break L12;
          } else {
            break L12;
          }
        }
        nl.field_c = lf.a(var2 * var4, var5 * var2, true);
    }

    private final void a(kj param0) {
        RuntimeException var3 = null;
        RuntimeException stackIn_97_0 = null;
        StringBuilder stackIn_97_1 = null;
        RuntimeException stackIn_98_0 = null;
        StringBuilder stackIn_98_1 = null;
        RuntimeException stackIn_99_0 = null;
        StringBuilder stackIn_99_1 = null;
        String stackIn_99_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException stackOut_96_0 = null;
        StringBuilder stackOut_96_1 = null;
        RuntimeException stackOut_98_0 = null;
        StringBuilder stackOut_98_1 = null;
        String stackOut_98_2 = null;
        RuntimeException stackOut_97_0 = null;
        StringBuilder stackOut_97_1 = null;
        String stackOut_97_2 = null;
        try {
          L0: {
            L1: {
              if (param0 == null) {
                break L1;
              } else {
                L2: {
                  if (param0.field_H < 0) {
                    break L2;
                  } else {
                    ((kj) this).field_H = param0.field_H;
                    break L2;
                  }
                }
                L3: {
                  if (0 == param0.field_J) {
                    break L3;
                  } else {
                    ((kj) this).field_J = param0.field_J;
                    break L3;
                  }
                }
                L4: {
                  if (param0.field_w != null) {
                    ((kj) this).field_w = param0.field_w;
                    break L4;
                  } else {
                    break L4;
                  }
                }
                L5: {
                  if (param0.field_U == 0) {
                    break L5;
                  } else {
                    ((kj) this).field_U = param0.field_U;
                    break L5;
                  }
                }
                L6: {
                  if (null != param0.field_L) {
                    ((kj) this).field_L = param0.field_L;
                    break L6;
                  } else {
                    break L6;
                  }
                }
                L7: {
                  if (null == param0.field_Q) {
                    break L7;
                  } else {
                    ((kj) this).field_Q = param0.field_Q;
                    break L7;
                  }
                }
                L8: {
                  if (param0.field_y >= 0) {
                    ((kj) this).field_y = param0.field_y;
                    break L8;
                  } else {
                    break L8;
                  }
                }
                L9: {
                  if (param0.field_B != null) {
                    ((kj) this).field_B = param0.field_B;
                    break L9;
                  } else {
                    break L9;
                  }
                }
                L10: {
                  if (!param0.field_o) {
                    break L10;
                  } else {
                    ((kj) this).field_o = param0.field_o;
                    break L10;
                  }
                }
                L11: {
                  if (!param0.field_C) {
                    ((kj) this).field_C = param0.field_C;
                    break L11;
                  } else {
                    break L11;
                  }
                }
                L12: {
                  if (param0.field_M == -2147483648) {
                    break L12;
                  } else {
                    ((kj) this).field_M = param0.field_M;
                    break L12;
                  }
                }
                L13: {
                  if (null != param0.field_X) {
                    ((kj) this).field_X = param0.field_X;
                    break L13;
                  } else {
                    break L13;
                  }
                }
                L14: {
                  if (param0.field_p) {
                    ((kj) this).field_p = param0.field_p;
                    break L14;
                  } else {
                    break L14;
                  }
                }
                L15: {
                  if (param0.field_n < 0) {
                    break L15;
                  } else {
                    ((kj) this).field_n = param0.field_n;
                    break L15;
                  }
                }
                L16: {
                  if (param0.field_T == null) {
                    break L16;
                  } else {
                    ((kj) this).field_T = param0.field_T;
                    break L16;
                  }
                }
                L17: {
                  if (param0.field_W != -2147483648) {
                    ((kj) this).field_W = param0.field_W;
                    break L17;
                  } else {
                    break L17;
                  }
                }
                L18: {
                  if (param0.field_Z == null) {
                    break L18;
                  } else {
                    ((kj) this).field_Z = param0.field_Z;
                    break L18;
                  }
                }
                L19: {
                  if (!param0.field_s) {
                    break L19;
                  } else {
                    ((kj) this).field_s = param0.field_s;
                    break L19;
                  }
                }
                L20: {
                  if (param0.field_v) {
                    ((kj) this).field_v = param0.field_v;
                    break L20;
                  } else {
                    break L20;
                  }
                }
                L21: {
                  if (param0.field_r == -2147483648) {
                    break L21;
                  } else {
                    ((kj) this).field_r = param0.field_r;
                    break L21;
                  }
                }
                L22: {
                  if (0 == param0.field_u) {
                    break L22;
                  } else {
                    ((kj) this).field_u = param0.field_u;
                    break L22;
                  }
                }
                L23: {
                  if (null != param0.field_A) {
                    ((kj) this).field_A = param0.field_A;
                    break L23;
                  } else {
                    break L23;
                  }
                }
                L24: {
                  if (param0.field_R != 0) {
                    ((kj) this).field_R = param0.field_R;
                    break L24;
                  } else {
                    break L24;
                  }
                }
                L25: {
                  if (param0.field_D == 0) {
                    break L25;
                  } else {
                    ((kj) this).field_D = param0.field_D;
                    break L25;
                  }
                }
                L26: {
                  if (param0.field_V != null) {
                    ((kj) this).field_V = param0.field_V;
                    break L26;
                  } else {
                    break L26;
                  }
                }
                L27: {
                  if (param0.field_I != 0) {
                    ((kj) this).field_I = param0.field_I;
                    break L27;
                  } else {
                    break L27;
                  }
                }
                L28: {
                  if (-2147483648 != param0.field_S) {
                    ((kj) this).field_S = param0.field_S;
                    break L28;
                  } else {
                    break L28;
                  }
                }
                L29: {
                  if (param0.field_Y == null) {
                    break L29;
                  } else {
                    ((kj) this).field_Y = param0.field_Y;
                    break L29;
                  }
                }
                L30: {
                  if (param0.field_O != null) {
                    ((kj) this).field_O = param0.field_O;
                    break L30;
                  } else {
                    break L30;
                  }
                }
                L31: {
                  if (-2147483648 != param0.field_K) {
                    ((kj) this).field_K = param0.field_K;
                    break L31;
                  } else {
                    break L31;
                  }
                }
                L32: {
                  if (0 == param0.field_E) {
                    break L32;
                  } else {
                    ((kj) this).field_E = param0.field_E;
                    break L32;
                  }
                }
                L33: {
                  if (param0.field_x == null) {
                    break L33;
                  } else {
                    ((kj) this).field_x = param0.field_x;
                    break L33;
                  }
                }
                L34: {
                  if (param0.field_N != null) {
                    ((kj) this).field_N = param0.field_N;
                    break L34;
                  } else {
                    break L34;
                  }
                }
                L35: {
                  if (param0.field_G >= 0) {
                    ((kj) this).field_G = param0.field_G;
                    break L35;
                  } else {
                    break L35;
                  }
                }
                L36: {
                  if (!param0.field_F) {
                    break L36;
                  } else {
                    ((kj) this).field_F = param0.field_F;
                    break L36;
                  }
                }
                L37: {
                  if (param0.field_ab != -2147483648) {
                    ((kj) this).field_ab = param0.field_ab;
                    break L37;
                  } else {
                    break L37;
                  }
                }
                if (param0.field_bb != 256) {
                  ((kj) this).field_bb = param0.field_bb;
                  break L1;
                } else {
                  break L1;
                }
              }
            }
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L38: {
            var3 = decompiledCaughtException;
            stackOut_96_0 = (RuntimeException) var3;
            stackOut_96_1 = new StringBuilder().append("kj.F(");
            stackIn_98_0 = stackOut_96_0;
            stackIn_98_1 = stackOut_96_1;
            stackIn_97_0 = stackOut_96_0;
            stackIn_97_1 = stackOut_96_1;
            if (param0 == null) {
              stackOut_98_0 = (RuntimeException) (Object) stackIn_98_0;
              stackOut_98_1 = (StringBuilder) (Object) stackIn_98_1;
              stackOut_98_2 = "null";
              stackIn_99_0 = stackOut_98_0;
              stackIn_99_1 = stackOut_98_1;
              stackIn_99_2 = stackOut_98_2;
              break L38;
            } else {
              stackOut_97_0 = (RuntimeException) (Object) stackIn_97_0;
              stackOut_97_1 = (StringBuilder) (Object) stackIn_97_1;
              stackOut_97_2 = "{...}";
              stackIn_99_0 = stackOut_97_0;
              stackIn_99_1 = stackOut_97_1;
              stackIn_99_2 = stackOut_97_2;
              break L38;
            }
          }
          throw ma.a((Throwable) (Object) stackIn_99_0, stackIn_99_2 + ',' + 1 + ')');
        }
    }

    public static void c() {
        field_q = null;
        field_z = null;
    }

    kj(long param0, kj param1) {
        this(param0, param1, 0, 0, 0, 0, (String) null);
    }

    private kj(long param0, kj param1, int param2, int param3, int param4, int param5, String param6) {
        RuntimeException runtimeException = null;
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
        RuntimeException decompiledCaughtException = null;
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
        ((kj) this).field_K = -2147483648;
        ((kj) this).field_p = false;
        ((kj) this).field_S = -2147483648;
        ((kj) this).field_bb = 256;
        ((kj) this).field_ab = -2147483648;
        ((kj) this).field_C = true;
        ((kj) this).field_n = -1;
        ((kj) this).field_H = -1;
        ((kj) this).field_M = -2147483648;
        ((kj) this).field_r = -2147483648;
        ((kj) this).field_W = -2147483648;
        ((kj) this).field_y = -1;
        ((kj) this).field_G = -1;
        try {
          L0: {
            L1: {
              ((kj) this).field_e = param0;
              int discarded$2 = 1;
              this.a(param1);
              if (param6 == null) {
                break L1;
              } else {
                ((kj) this).field_Z = param6;
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
            stackOut_4_1 = new StringBuilder().append("kj.<init>(").append(param0).append(',');
            stackIn_6_0 = stackOut_4_0;
            stackIn_6_1 = stackOut_4_1;
            stackIn_5_0 = stackOut_4_0;
            stackIn_5_1 = stackOut_4_1;
            if (param1 == null) {
              stackOut_6_0 = (RuntimeException) (Object) stackIn_6_0;
              stackOut_6_1 = (StringBuilder) (Object) stackIn_6_1;
              stackOut_6_2 = "null";
              stackIn_7_0 = stackOut_6_0;
              stackIn_7_1 = stackOut_6_1;
              stackIn_7_2 = stackOut_6_2;
              break L2;
            } else {
              stackOut_5_0 = (RuntimeException) (Object) stackIn_5_0;
              stackOut_5_1 = (StringBuilder) (Object) stackIn_5_1;
              stackOut_5_2 = "{...}";
              stackIn_7_0 = stackOut_5_0;
              stackIn_7_1 = stackOut_5_1;
              stackIn_7_2 = stackOut_5_2;
              break L2;
            }
          }
          L3: {
            stackOut_7_0 = (RuntimeException) (Object) stackIn_7_0;
            stackOut_7_1 = ((StringBuilder) (Object) stackIn_7_1).append(stackIn_7_2).append(',').append(param2).append(',').append(param3).append(',').append(param4).append(',').append(param5).append(',');
            stackIn_9_0 = stackOut_7_0;
            stackIn_9_1 = stackOut_7_1;
            stackIn_8_0 = stackOut_7_0;
            stackIn_8_1 = stackOut_7_1;
            if (param6 == null) {
              stackOut_9_0 = (RuntimeException) (Object) stackIn_9_0;
              stackOut_9_1 = (StringBuilder) (Object) stackIn_9_1;
              stackOut_9_2 = "null";
              stackIn_10_0 = stackOut_9_0;
              stackIn_10_1 = stackOut_9_1;
              stackIn_10_2 = stackOut_9_2;
              break L3;
            } else {
              stackOut_8_0 = (RuntimeException) (Object) stackIn_8_0;
              stackOut_8_1 = (StringBuilder) (Object) stackIn_8_1;
              stackOut_8_2 = "{...}";
              stackIn_10_0 = stackOut_8_0;
              stackIn_10_1 = stackOut_8_1;
              stackIn_10_2 = stackOut_8_2;
              break L3;
            }
          }
          throw ma.a((Throwable) (Object) stackIn_10_0, stackIn_10_2 + ')');
        }
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        long var0 = 0L;
        int var2 = 0;
        int var3 = 0;
        field_z = new long[256];
        field_q = "Logging in...";
        var2 = 0;
        L0: while (true) {
          if (256 <= var2) {
            return;
          } else {
            var0 = (long)var2;
            var3 = 0;
            L1: while (true) {
              if (var3 >= 8) {
                field_z[var2] = var0;
                var2++;
                continue L0;
              } else {
                if ((var0 & 1L) != 1L) {
                  var0 = var0 >>> 1;
                  var3++;
                  continue L1;
                } else {
                  var0 = var0 >>> 1 ^ -3932672073523589310L;
                  var3++;
                  continue L1;
                }
              }
            }
          }
        }
    }
}
