/*
 * Decompiled by CFR-JS 0.4.0.
 */
class ol extends cd {
    private int field_eb;
    static bf field_E;
    private ed field_Z;
    private int field_H;
    private int field_gb;
    private ed[] field_w;
    static String field_K;
    private int field_C;
    private ed[] field_A;
    private int field_R;
    static ij[] field_N;
    private ed field_x;
    private int field_bb;
    private boolean field_ib;
    private int field_G;
    private int field_T;
    private int field_F;
    private int field_D;
    private ed[] field_jb;
    private ed[] field_V;
    private String field_cb;
    private int field_M;
    private boolean field_B;
    private String field_S;
    private int field_P;
    private boolean field_y;
    private ed field_O;
    private ed field_z;
    private ed[] field_fb;
    private int field_U;
    private int field_Y;
    private boolean field_W;
    private wl field_Q;
    private int field_X;
    private int field_kb;
    static int[] field_ab;
    private int field_L;
    private ed field_db;
    private boolean field_I;
    private boolean field_J;
    private int field_hb;

    final static byte[][] a(int param0, mf param1, int[] param2, int param3, mf param4) {
        int var5_int = 0;
        RuntimeException var5 = null;
        byte[][] var6 = null;
        int var7 = 0;
        int var8 = 0;
        byte[] var9 = null;
        int var10 = 0;
        byte[][] stackIn_3_0 = null;
        byte[][] stackIn_8_0 = null;
        RuntimeException stackIn_10_0 = null;
        StringBuilder stackIn_10_1 = null;
        RuntimeException stackIn_11_0 = null;
        StringBuilder stackIn_11_1 = null;
        RuntimeException stackIn_12_0 = null;
        StringBuilder stackIn_12_1 = null;
        String stackIn_12_2 = null;
        RuntimeException stackIn_13_0 = null;
        StringBuilder stackIn_13_1 = null;
        RuntimeException stackIn_14_0 = null;
        StringBuilder stackIn_14_1 = null;
        RuntimeException stackIn_15_0 = null;
        StringBuilder stackIn_15_1 = null;
        String stackIn_15_2 = null;
        RuntimeException stackIn_16_0 = null;
        StringBuilder stackIn_16_1 = null;
        RuntimeException stackIn_17_0 = null;
        StringBuilder stackIn_17_1 = null;
        RuntimeException stackIn_18_0 = null;
        StringBuilder stackIn_18_1 = null;
        String stackIn_18_2 = null;
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        byte[][] stackOut_7_0 = null;
        byte[][] stackOut_2_0 = null;
        RuntimeException stackOut_9_0 = null;
        StringBuilder stackOut_9_1 = null;
        RuntimeException stackOut_11_0 = null;
        StringBuilder stackOut_11_1 = null;
        String stackOut_11_2 = null;
        RuntimeException stackOut_10_0 = null;
        StringBuilder stackOut_10_1 = null;
        String stackOut_10_2 = null;
        RuntimeException stackOut_12_0 = null;
        StringBuilder stackOut_12_1 = null;
        RuntimeException stackOut_14_0 = null;
        StringBuilder stackOut_14_1 = null;
        String stackOut_14_2 = null;
        RuntimeException stackOut_13_0 = null;
        StringBuilder stackOut_13_1 = null;
        String stackOut_13_2 = null;
        RuntimeException stackOut_15_0 = null;
        StringBuilder stackOut_15_1 = null;
        RuntimeException stackOut_17_0 = null;
        StringBuilder stackOut_17_1 = null;
        String stackOut_17_2 = null;
        RuntimeException stackOut_16_0 = null;
        StringBuilder stackOut_16_1 = null;
        String stackOut_16_2 = null;
        var10 = EscapeVector.field_A;
        try {
          L0: {
            var5_int = je.a(false, param3);
            if (0 < var5_int) {
              var6 = new byte[var5_int][];
              var7 = 0;
              var8 = 103 / ((75 - param0) / 49);
              L1: while (true) {
                if (var5_int <= var7) {
                  stackOut_7_0 = (byte[][]) (var6);
                  stackIn_8_0 = stackOut_7_0;
                  decompiledRegionSelector0 = 1;
                  break L0;
                } else {
                  var9 = hf.a(param1, param2, var7, param3, param4, (byte) 97);
                  var6[var7] = var9;
                  var7++;
                  continue L1;
                }
              }
            } else {
              stackOut_2_0 = (byte[][]) null;
              stackIn_3_0 = stackOut_2_0;
              decompiledRegionSelector0 = 0;
              break L0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L2: {
            var5 = decompiledCaughtException;
            stackOut_9_0 = (RuntimeException) (var5);
            stackOut_9_1 = new StringBuilder().append("ol.C(").append(param0).append(',');
            stackIn_11_0 = stackOut_9_0;
            stackIn_11_1 = stackOut_9_1;
            stackIn_10_0 = stackOut_9_0;
            stackIn_10_1 = stackOut_9_1;
            if (param1 == null) {
              stackOut_11_0 = (RuntimeException) ((Object) stackIn_11_0);
              stackOut_11_1 = (StringBuilder) ((Object) stackIn_11_1);
              stackOut_11_2 = "null";
              stackIn_12_0 = stackOut_11_0;
              stackIn_12_1 = stackOut_11_1;
              stackIn_12_2 = stackOut_11_2;
              break L2;
            } else {
              stackOut_10_0 = (RuntimeException) ((Object) stackIn_10_0);
              stackOut_10_1 = (StringBuilder) ((Object) stackIn_10_1);
              stackOut_10_2 = "{...}";
              stackIn_12_0 = stackOut_10_0;
              stackIn_12_1 = stackOut_10_1;
              stackIn_12_2 = stackOut_10_2;
              break L2;
            }
          }
          L3: {
            stackOut_12_0 = (RuntimeException) ((Object) stackIn_12_0);
            stackOut_12_1 = ((StringBuilder) (Object) stackIn_12_1).append(stackIn_12_2).append(',');
            stackIn_14_0 = stackOut_12_0;
            stackIn_14_1 = stackOut_12_1;
            stackIn_13_0 = stackOut_12_0;
            stackIn_13_1 = stackOut_12_1;
            if (param2 == null) {
              stackOut_14_0 = (RuntimeException) ((Object) stackIn_14_0);
              stackOut_14_1 = (StringBuilder) ((Object) stackIn_14_1);
              stackOut_14_2 = "null";
              stackIn_15_0 = stackOut_14_0;
              stackIn_15_1 = stackOut_14_1;
              stackIn_15_2 = stackOut_14_2;
              break L3;
            } else {
              stackOut_13_0 = (RuntimeException) ((Object) stackIn_13_0);
              stackOut_13_1 = (StringBuilder) ((Object) stackIn_13_1);
              stackOut_13_2 = "{...}";
              stackIn_15_0 = stackOut_13_0;
              stackIn_15_1 = stackOut_13_1;
              stackIn_15_2 = stackOut_13_2;
              break L3;
            }
          }
          L4: {
            stackOut_15_0 = (RuntimeException) ((Object) stackIn_15_0);
            stackOut_15_1 = ((StringBuilder) (Object) stackIn_15_1).append(stackIn_15_2).append(',').append(param3).append(',');
            stackIn_17_0 = stackOut_15_0;
            stackIn_17_1 = stackOut_15_1;
            stackIn_16_0 = stackOut_15_0;
            stackIn_16_1 = stackOut_15_1;
            if (param4 == null) {
              stackOut_17_0 = (RuntimeException) ((Object) stackIn_17_0);
              stackOut_17_1 = (StringBuilder) ((Object) stackIn_17_1);
              stackOut_17_2 = "null";
              stackIn_18_0 = stackOut_17_0;
              stackIn_18_1 = stackOut_17_1;
              stackIn_18_2 = stackOut_17_2;
              break L4;
            } else {
              stackOut_16_0 = (RuntimeException) ((Object) stackIn_16_0);
              stackOut_16_1 = (StringBuilder) ((Object) stackIn_16_1);
              stackOut_16_2 = "{...}";
              stackIn_18_0 = stackOut_16_0;
              stackIn_18_1 = stackOut_16_1;
              stackIn_18_2 = stackOut_16_2;
              break L4;
            }
          }
          throw t.a((Throwable) ((Object) stackIn_18_0), stackIn_18_2 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return stackIn_3_0;
        } else {
          return stackIn_8_0;
        }
    }

    ol(long param0, ol param1) {
        this(param0, param1, 0, 0, 0, 0, (String) null);
    }

    public static void g(int param0) {
        field_E = null;
        field_ab = null;
        if (param0 != 4095) {
            return;
        }
        field_N = null;
        field_K = null;
    }

    final static boolean a(byte param0, String param1) {
        RuntimeException var2 = null;
        int stackIn_7_0 = 0;
        int stackIn_9_0 = 0;
        RuntimeException stackIn_11_0 = null;
        StringBuilder stackIn_11_1 = null;
        RuntimeException stackIn_12_0 = null;
        StringBuilder stackIn_12_1 = null;
        RuntimeException stackIn_13_0 = null;
        StringBuilder stackIn_13_1 = null;
        String stackIn_13_2 = null;
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        int stackOut_8_0 = 0;
        int stackOut_6_0 = 0;
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
              if (param0 == -7) {
                break L1;
              } else {
                field_N = (ij[]) null;
                break L1;
              }
            }
            L2: {
              if (param1 == null) {
                break L2;
              } else {
                if (param1.length() < oa.field_v) {
                  break L2;
                } else {
                  if (param1.length() <= p.field_a) {
                    stackOut_8_0 = 0;
                    stackIn_9_0 = stackOut_8_0;
                    decompiledRegionSelector0 = 1;
                    break L0;
                  } else {
                    return true;
                  }
                }
              }
            }
            stackOut_6_0 = 1;
            stackIn_7_0 = stackOut_6_0;
            decompiledRegionSelector0 = 0;
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L3: {
            var2 = decompiledCaughtException;
            stackOut_10_0 = (RuntimeException) (var2);
            stackOut_10_1 = new StringBuilder().append("ol.F(").append(param0).append(',');
            stackIn_12_0 = stackOut_10_0;
            stackIn_12_1 = stackOut_10_1;
            stackIn_11_0 = stackOut_10_0;
            stackIn_11_1 = stackOut_10_1;
            if (param1 == null) {
              stackOut_12_0 = (RuntimeException) ((Object) stackIn_12_0);
              stackOut_12_1 = (StringBuilder) ((Object) stackIn_12_1);
              stackOut_12_2 = "null";
              stackIn_13_0 = stackOut_12_0;
              stackIn_13_1 = stackOut_12_1;
              stackIn_13_2 = stackOut_12_2;
              break L3;
            } else {
              stackOut_11_0 = (RuntimeException) ((Object) stackIn_11_0);
              stackOut_11_1 = (StringBuilder) ((Object) stackIn_11_1);
              stackOut_11_2 = "{...}";
              stackIn_13_0 = stackOut_11_0;
              stackIn_13_1 = stackOut_11_1;
              stackIn_13_2 = stackOut_11_2;
              break L3;
            }
          }
          throw t.a((Throwable) ((Object) stackIn_13_0), stackIn_13_2 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return stackIn_7_0 != 0;
        } else {
          return stackIn_9_0 != 0;
        }
    }

    private final void a(int param0, ol param1) {
        RuntimeException var3 = null;
        RuntimeException stackIn_99_0 = null;
        StringBuilder stackIn_99_1 = null;
        RuntimeException stackIn_100_0 = null;
        StringBuilder stackIn_100_1 = null;
        RuntimeException stackIn_101_0 = null;
        StringBuilder stackIn_101_1 = null;
        String stackIn_101_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException stackOut_98_0 = null;
        StringBuilder stackOut_98_1 = null;
        RuntimeException stackOut_100_0 = null;
        StringBuilder stackOut_100_1 = null;
        String stackOut_100_2 = null;
        RuntimeException stackOut_99_0 = null;
        StringBuilder stackOut_99_1 = null;
        String stackOut_99_2 = null;
        try {
          L0: {
            L1: {
              if (param0 == -1680) {
                break L1;
              } else {
                ol.g(-110);
                break L1;
              }
            }
            L2: {
              if (param1 == null) {
                break L2;
              } else {
                L3: {
                  if (param1.field_W) {
                    break L3;
                  } else {
                    this.field_W = param1.field_W;
                    break L3;
                  }
                }
                L4: {
                  if (null == param1.field_V) {
                    break L4;
                  } else {
                    this.field_V = param1.field_V;
                    break L4;
                  }
                }
                L5: {
                  if (-2147483648 == param1.field_C) {
                    break L5;
                  } else {
                    this.field_C = param1.field_C;
                    break L5;
                  }
                }
                L6: {
                  if (param1.field_gb == 256) {
                    break L6;
                  } else {
                    this.field_gb = param1.field_gb;
                    break L6;
                  }
                }
                L7: {
                  if (param1.field_J) {
                    this.field_J = param1.field_J;
                    break L7;
                  } else {
                    break L7;
                  }
                }
                L8: {
                  if (null == param1.field_A) {
                    break L8;
                  } else {
                    this.field_A = param1.field_A;
                    break L8;
                  }
                }
                L9: {
                  if (null == param1.field_x) {
                    break L9;
                  } else {
                    this.field_x = param1.field_x;
                    break L9;
                  }
                }
                L10: {
                  if (param1.field_X != 0) {
                    this.field_X = param1.field_X;
                    break L10;
                  } else {
                    break L10;
                  }
                }
                L11: {
                  if (param1.field_R == 0) {
                    break L11;
                  } else {
                    this.field_R = param1.field_R;
                    break L11;
                  }
                }
                L12: {
                  if (-2147483648 != param1.field_U) {
                    this.field_U = param1.field_U;
                    break L12;
                  } else {
                    break L12;
                  }
                }
                L13: {
                  if (param1.field_O != null) {
                    this.field_O = param1.field_O;
                    break L13;
                  } else {
                    break L13;
                  }
                }
                L14: {
                  if (param1.field_G != 0) {
                    this.field_G = param1.field_G;
                    break L14;
                  } else {
                    break L14;
                  }
                }
                L15: {
                  if (-1 != (param1.field_D ^ -1)) {
                    this.field_D = param1.field_D;
                    break L15;
                  } else {
                    break L15;
                  }
                }
                L16: {
                  if (null != param1.field_Q) {
                    this.field_Q = param1.field_Q;
                    break L16;
                  } else {
                    break L16;
                  }
                }
                L17: {
                  if (-1 >= (param1.field_kb ^ -1)) {
                    this.field_kb = param1.field_kb;
                    break L17;
                  } else {
                    break L17;
                  }
                }
                L18: {
                  if (param1.field_S != null) {
                    this.field_S = param1.field_S;
                    break L18;
                  } else {
                    break L18;
                  }
                }
                L19: {
                  if (-2147483648 != param1.field_H) {
                    this.field_H = param1.field_H;
                    break L19;
                  } else {
                    break L19;
                  }
                }
                L20: {
                  if (0 != param1.field_L) {
                    this.field_L = param1.field_L;
                    break L20;
                  } else {
                    break L20;
                  }
                }
                L21: {
                  if (2147483647 != (param1.field_P ^ -1)) {
                    this.field_P = param1.field_P;
                    break L21;
                  } else {
                    break L21;
                  }
                }
                L22: {
                  if (null == param1.field_w) {
                    break L22;
                  } else {
                    this.field_w = param1.field_w;
                    break L22;
                  }
                }
                L23: {
                  if (!param1.field_B) {
                    break L23;
                  } else {
                    this.field_B = param1.field_B;
                    break L23;
                  }
                }
                L24: {
                  if (param1.field_eb >= 0) {
                    this.field_eb = param1.field_eb;
                    break L24;
                  } else {
                    break L24;
                  }
                }
                L25: {
                  if (!param1.field_ib) {
                    break L25;
                  } else {
                    this.field_ib = param1.field_ib;
                    break L25;
                  }
                }
                L26: {
                  if (-1 >= (param1.field_Y ^ -1)) {
                    this.field_Y = param1.field_Y;
                    break L26;
                  } else {
                    break L26;
                  }
                }
                L27: {
                  if (param1.field_y) {
                    this.field_y = param1.field_y;
                    break L27;
                  } else {
                    break L27;
                  }
                }
                L28: {
                  if (null == param1.field_db) {
                    break L28;
                  } else {
                    this.field_db = param1.field_db;
                    break L28;
                  }
                }
                L29: {
                  if (!param1.field_I) {
                    break L29;
                  } else {
                    this.field_I = param1.field_I;
                    break L29;
                  }
                }
                L30: {
                  if (2147483647 == (param1.field_T ^ -1)) {
                    break L30;
                  } else {
                    this.field_T = param1.field_T;
                    break L30;
                  }
                }
                L31: {
                  if (param1.field_Z != null) {
                    this.field_Z = param1.field_Z;
                    break L31;
                  } else {
                    break L31;
                  }
                }
                L32: {
                  if (-1 == (param1.field_F ^ -1)) {
                    break L32;
                  } else {
                    this.field_F = param1.field_F;
                    break L32;
                  }
                }
                L33: {
                  if (null != param1.field_fb) {
                    this.field_fb = param1.field_fb;
                    break L33;
                  } else {
                    break L33;
                  }
                }
                L34: {
                  if (param1.field_jb == null) {
                    break L34;
                  } else {
                    this.field_jb = param1.field_jb;
                    break L34;
                  }
                }
                L35: {
                  if (0 == param1.field_bb) {
                    break L35;
                  } else {
                    this.field_bb = param1.field_bb;
                    break L35;
                  }
                }
                L36: {
                  if (null != param1.field_z) {
                    this.field_z = param1.field_z;
                    break L36;
                  } else {
                    break L36;
                  }
                }
                L37: {
                  if (0 <= param1.field_hb) {
                    this.field_hb = param1.field_hb;
                    break L37;
                  } else {
                    break L37;
                  }
                }
                L38: {
                  if (null == param1.field_cb) {
                    break L38;
                  } else {
                    this.field_cb = param1.field_cb;
                    break L38;
                  }
                }
                if (2147483647 != (param1.field_M ^ -1)) {
                  this.field_M = param1.field_M;
                  break L2;
                } else {
                  break L2;
                }
              }
            }
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L39: {
            var3 = decompiledCaughtException;
            stackOut_98_0 = (RuntimeException) (var3);
            stackOut_98_1 = new StringBuilder().append("ol.D(").append(param0).append(',');
            stackIn_100_0 = stackOut_98_0;
            stackIn_100_1 = stackOut_98_1;
            stackIn_99_0 = stackOut_98_0;
            stackIn_99_1 = stackOut_98_1;
            if (param1 == null) {
              stackOut_100_0 = (RuntimeException) ((Object) stackIn_100_0);
              stackOut_100_1 = (StringBuilder) ((Object) stackIn_100_1);
              stackOut_100_2 = "null";
              stackIn_101_0 = stackOut_100_0;
              stackIn_101_1 = stackOut_100_1;
              stackIn_101_2 = stackOut_100_2;
              break L39;
            } else {
              stackOut_99_0 = (RuntimeException) ((Object) stackIn_99_0);
              stackOut_99_1 = (StringBuilder) ((Object) stackIn_99_1);
              stackOut_99_2 = "{...}";
              stackIn_101_0 = stackOut_99_0;
              stackIn_101_1 = stackOut_99_1;
              stackIn_101_2 = stackOut_99_2;
              break L39;
            }
          }
          throw t.a((Throwable) ((Object) stackIn_101_0), stackIn_101_2 + ')');
        }
    }

    private ol(long param0, ol param1, int param2, int param3, int param4, int param5, String param6) {
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
        this.field_H = -2147483648;
        this.field_eb = -1;
        this.field_gb = 256;
        this.field_T = -2147483648;
        this.field_P = -2147483648;
        this.field_M = -2147483648;
        this.field_Y = -1;
        this.field_C = -2147483648;
        this.field_kb = -1;
        this.field_W = true;
        this.field_I = false;
        this.field_U = -2147483648;
        this.field_hb = -1;
        try {
          L0: {
            L1: {
              this.field_e = param0;
              this.a(-1680, param1);
              if (param6 == null) {
                break L1;
              } else {
                this.field_S = param6;
                break L1;
              }
            }
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L2: {
            runtimeException = decompiledCaughtException;
            stackOut_4_0 = (RuntimeException) (runtimeException);
            stackOut_4_1 = new StringBuilder().append("ol.<init>(").append(param0).append(',');
            stackIn_6_0 = stackOut_4_0;
            stackIn_6_1 = stackOut_4_1;
            stackIn_5_0 = stackOut_4_0;
            stackIn_5_1 = stackOut_4_1;
            if (param1 == null) {
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
            stackOut_7_1 = ((StringBuilder) (Object) stackIn_7_1).append(stackIn_7_2).append(',').append(param2).append(',').append(param3).append(',').append(param4).append(',').append(param5).append(',');
            stackIn_9_0 = stackOut_7_0;
            stackIn_9_1 = stackOut_7_1;
            stackIn_8_0 = stackOut_7_0;
            stackIn_8_1 = stackOut_7_1;
            if (param6 == null) {
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
          throw t.a((Throwable) ((Object) stackIn_10_0), stackIn_10_2 + ')');
        }
    }

    static {
        field_K = "Unfortunately there was a focus problem while setting fullscreen mode. You could try disabling any multiple monitor drivers or window enhancements, if you have any enabled.";
        field_ab = new int[]{0, 1, 3, 7, 15, 31, 63, 127, 255, 511, 1023, 2047, 4095, 8191, 16383, 32767, 65535, 131071, 262143, 524287, 1048575, 2097151, 4194303, 8388607, 16777215, 33554431, 67108863, 134217727, 268435455, 536870911, 1073741823, 2147483647, -1};
    }
}
