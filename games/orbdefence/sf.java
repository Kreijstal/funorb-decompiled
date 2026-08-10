/*
 * Decompiled by CFR-JS 0.4.0.
 */
class sf extends ie {
    private int field_w;
    private hj field_D;
    private int field_R;
    private int field_x;
    private int field_n;
    static int[] field_K;
    private int field_E;
    private int field_X;
    private int field_y;
    private hj field_v;
    private String field_N;
    private boolean field_l;
    private hj[] field_B;
    static ki field_q;
    private hj field_S;
    static int field_O;
    private hj[] field_J;
    private int field_H;
    private int field_s;
    private boolean field_U;
    private int field_m;
    private hj[] field_V;
    private hj[] field_t;
    private int field_p;
    private hj field_C;
    private int field_z;
    private kc field_A;
    private int field_Q;
    private int field_I;
    private boolean field_o;
    static int field_T;
    private int field_L;
    private int field_G;
    private hj field_M;
    private int field_u;
    private String field_r;
    private boolean field_Y;
    private int field_W;
    private hj[] field_k;
    private boolean field_P;
    private boolean field_F;

    sf(long param0, sf param1) {
        this(param0, param1, 0, 0, 0, 0, (String) null);
    }

    final static wa a(String param0, ki param1, int param2, String param3, ki param4) {
        int var5_int = 0;
        RuntimeException var5 = null;
        int var6 = 0;
        wa stackIn_2_0 = null;
        wa stackIn_4_0 = null;
        RuntimeException stackIn_7_0 = null;
        StringBuilder stackIn_7_1 = null;
        RuntimeException stackIn_8_0 = null;
        StringBuilder stackIn_8_1 = null;
        String stackIn_8_2 = null;
        StringBuilder stackIn_10_1 = null;
        StringBuilder stackIn_11_1 = null;
        String stackIn_11_2 = null;
        StringBuilder stackIn_13_1 = null;
        StringBuilder stackIn_14_1 = null;
        String stackIn_14_2 = null;
        StringBuilder stackIn_16_1 = null;
        StringBuilder stackIn_17_1 = null;
        String stackIn_17_2 = null;
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        try {
          L0: {
            var5_int = param4.a(param0, 0);
            var6 = param4.a(param3, 5187, var5_int);
            if (param2 == -1) {
              stackIn_4_0 = pf.a(var5_int, -6, param1, param4, var6);
              decompiledRegionSelector0 = 1;
              break L0;
            } else {
              stackIn_2_0 = (wa) null;
              decompiledRegionSelector0 = 0;
              break L0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L1: {
            var5 = decompiledCaughtException;
            stackIn_7_0 = (RuntimeException) (var5);

            stackIn_7_1 = new StringBuilder().append("sf.H(");

            if (param0 == null) {
              stackIn_8_0 = (RuntimeException) ((Object) stackIn_7_0);
              stackIn_8_1 = (StringBuilder) ((Object) stackIn_7_1);
              stackIn_8_2 = "null";
              break L1;
            } else {
              stackIn_8_0 = (RuntimeException) ((Object) stackIn_7_0);
              stackIn_8_1 = (StringBuilder) ((Object) stackIn_7_1);
              stackIn_8_2 = "{...}";
              break L1;
            }
          }
          L2: {


            stackIn_10_1 = ((StringBuilder) (Object) stackIn_8_1).append(stackIn_8_2).append(',');

            if (param1 == null) {
              stackIn_8_0 = (RuntimeException) ((Object) stackIn_8_0);
              stackIn_11_1 = (StringBuilder) ((Object) stackIn_10_1);
              stackIn_11_2 = "null";
              break L2;
            } else {
              stackIn_8_0 = (RuntimeException) ((Object) stackIn_8_0);
              stackIn_11_1 = (StringBuilder) ((Object) stackIn_10_1);
              stackIn_11_2 = "{...}";
              break L2;
            }
          }
          L3: {


            stackIn_13_1 = ((StringBuilder) (Object) stackIn_11_1).append(stackIn_11_2).append(',').append(param2).append(',');

            if (param3 == null) {
              stackIn_8_0 = (RuntimeException) ((Object) stackIn_8_0);
              stackIn_14_1 = (StringBuilder) ((Object) stackIn_13_1);
              stackIn_14_2 = "null";
              break L3;
            } else {
              stackIn_8_0 = (RuntimeException) ((Object) stackIn_8_0);
              stackIn_14_1 = (StringBuilder) ((Object) stackIn_13_1);
              stackIn_14_2 = "{...}";
              break L3;
            }
          }
          L4: {


            stackIn_16_1 = ((StringBuilder) (Object) stackIn_14_1).append(stackIn_14_2).append(',');

            if (param4 == null) {
              stackIn_8_0 = (RuntimeException) ((Object) stackIn_8_0);
              stackIn_17_1 = (StringBuilder) ((Object) stackIn_16_1);
              stackIn_17_2 = "null";
              break L4;
            } else {
              stackIn_8_0 = (RuntimeException) ((Object) stackIn_8_0);
              stackIn_17_1 = (StringBuilder) ((Object) stackIn_16_1);
              stackIn_17_2 = "{...}";
              break L4;
            }
          }
          throw dd.a((Throwable) ((Object) stackIn_8_0), stackIn_17_2 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return stackIn_2_0;
        } else {
          return stackIn_4_0;
        }
    }

    final static StringBuilder a(int param0, StringBuilder param1, char param2, byte param3) {
        int var4_int = 0;
        RuntimeException var4 = null;
        int var5 = 0;
        int var6 = 0;
        int var7 = 0;
        StringBuilder stackIn_5_0 = null;
        RuntimeException stackIn_8_0 = null;
        StringBuilder stackIn_8_1 = null;
        RuntimeException stackIn_9_0 = null;
        StringBuilder stackIn_9_1 = null;
        String stackIn_9_2 = null;
        RuntimeException decompiledCaughtException = null;
        var7 = OrbDefence.field_D ? 1 : 0;
        try {
          L0: {
            var5 = -73 / ((param3 - -32) / 42);
            var4_int = param1.length();
            param1.setLength(param0);
            var6 = var4_int;
            L1: while (true) {
              if (param0 <= var6) {
                stackIn_5_0 = (StringBuilder) (param1);
                break L0;
              } else {
                param1.setCharAt(var6, param2);
                var6++;
                continue L1;
              }
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L2: {
            var4 = decompiledCaughtException;
            stackIn_8_0 = (RuntimeException) (var4);

            stackIn_8_1 = new StringBuilder().append("sf.J(").append(param0).append(',');

            if (param1 == null) {
              stackIn_9_0 = (RuntimeException) ((Object) stackIn_8_0);
              stackIn_9_1 = (StringBuilder) ((Object) stackIn_8_1);
              stackIn_9_2 = "null";
              break L2;
            } else {
              stackIn_9_0 = (RuntimeException) ((Object) stackIn_8_0);
              stackIn_9_1 = (StringBuilder) ((Object) stackIn_8_1);
              stackIn_9_2 = "{...}";
              break L2;
            }
          }
          throw dd.a((Throwable) ((Object) stackIn_9_0), stackIn_9_2 + ',' + param2 + ',' + param3 + ')');
        }
        return stackIn_5_0;
    }

    private final void a(sf param0, byte param1) {
        RuntimeException stackIn_99_0 = null;
        StringBuilder stackIn_99_1 = null;
        RuntimeException stackIn_100_0 = null;
        StringBuilder stackIn_100_1 = null;
        String stackIn_100_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var3 = null;
        try {
          L0: {
            L1: {
              if (param1 <= -111) {
                break L1;
              } else {
                this.field_l = true;
                break L1;
              }
            }
            L2: {
              if (param0 != null) {
                L3: {
                  if (-1 == (param0.field_R ^ -1)) {
                    break L3;
                  } else {
                    this.field_R = param0.field_R;
                    break L3;
                  }
                }
                L4: {
                  if (param0.field_D == null) {
                    break L4;
                  } else {
                    this.field_D = param0.field_D;
                    break L4;
                  }
                }
                L5: {
                  if (!param0.field_o) {
                    break L5;
                  } else {
                    this.field_o = param0.field_o;
                    break L5;
                  }
                }
                L6: {
                  if (param0.field_L != 0) {
                    this.field_L = param0.field_L;
                    break L6;
                  } else {
                    break L6;
                  }
                }
                L7: {
                  if (!param0.field_P) {
                    this.field_P = param0.field_P;
                    break L7;
                  } else {
                    break L7;
                  }
                }
                L8: {
                  if (!param0.field_U) {
                    break L8;
                  } else {
                    this.field_U = param0.field_U;
                    break L8;
                  }
                }
                L9: {
                  if (param0.field_v == null) {
                    break L9;
                  } else {
                    this.field_v = param0.field_v;
                    break L9;
                  }
                }
                L10: {
                  if (0 == param0.field_p) {
                    break L10;
                  } else {
                    this.field_p = param0.field_p;
                    break L10;
                  }
                }
                L11: {
                  if (null == param0.field_N) {
                    break L11;
                  } else {
                    this.field_N = param0.field_N;
                    break L11;
                  }
                }
                L12: {
                  if ((param0.field_H ^ -1) == 2147483647) {
                    break L12;
                  } else {
                    this.field_H = param0.field_H;
                    break L12;
                  }
                }
                L13: {
                  if ((param0.field_G ^ -1) <= -1) {
                    this.field_G = param0.field_G;
                    break L13;
                  } else {
                    break L13;
                  }
                }
                L14: {
                  if (param0.field_X == 0) {
                    break L14;
                  } else {
                    this.field_X = param0.field_X;
                    break L14;
                  }
                }
                L15: {
                  if (-1 >= (param0.field_z ^ -1)) {
                    this.field_z = param0.field_z;
                    break L15;
                  } else {
                    break L15;
                  }
                }
                L16: {
                  if (param0.field_k == null) {
                    break L16;
                  } else {
                    this.field_k = param0.field_k;
                    break L16;
                  }
                }
                L17: {
                  if (null == param0.field_V) {
                    break L17;
                  } else {
                    this.field_V = param0.field_V;
                    break L17;
                  }
                }
                L18: {
                  if (null == param0.field_B) {
                    break L18;
                  } else {
                    this.field_B = param0.field_B;
                    break L18;
                  }
                }
                L19: {
                  if (param0.field_y != 0) {
                    this.field_y = param0.field_y;
                    break L19;
                  } else {
                    break L19;
                  }
                }
                L20: {
                  if (!param0.field_l) {
                    break L20;
                  } else {
                    this.field_l = param0.field_l;
                    break L20;
                  }
                }
                L21: {
                  if (param0.field_m < 0) {
                    break L21;
                  } else {
                    this.field_m = param0.field_m;
                    break L21;
                  }
                }
                L22: {
                  if (null != param0.field_t) {
                    this.field_t = param0.field_t;
                    break L22;
                  } else {
                    break L22;
                  }
                }
                L23: {
                  if (param0.field_I != 0) {
                    this.field_I = param0.field_I;
                    break L23;
                  } else {
                    break L23;
                  }
                }
                L24: {
                  if (!param0.field_F) {
                    break L24;
                  } else {
                    this.field_F = param0.field_F;
                    break L24;
                  }
                }
                L25: {
                  if (null != param0.field_M) {
                    this.field_M = param0.field_M;
                    break L25;
                  } else {
                    break L25;
                  }
                }
                L26: {
                  if (param0.field_J != null) {
                    this.field_J = param0.field_J;
                    break L26;
                  } else {
                    break L26;
                  }
                }
                L27: {
                  if ((param0.field_Q ^ -1) != 2147483647) {
                    this.field_Q = param0.field_Q;
                    break L27;
                  } else {
                    break L27;
                  }
                }
                L28: {
                  if ((param0.field_E ^ -1) != -257) {
                    this.field_E = param0.field_E;
                    break L28;
                  } else {
                    break L28;
                  }
                }
                L29: {
                  if (param0.field_W != -2147483648) {
                    this.field_W = param0.field_W;
                    break L29;
                  } else {
                    break L29;
                  }
                }
                L30: {
                  if (param0.field_n < 0) {
                    break L30;
                  } else {
                    this.field_n = param0.field_n;
                    break L30;
                  }
                }
                L31: {
                  if (param0.field_C != null) {
                    this.field_C = param0.field_C;
                    break L31;
                  } else {
                    break L31;
                  }
                }
                L32: {
                  if (param0.field_w == -2147483648) {
                    break L32;
                  } else {
                    this.field_w = param0.field_w;
                    break L32;
                  }
                }
                L33: {
                  if (-2147483648 == param0.field_s) {
                    break L33;
                  } else {
                    this.field_s = param0.field_s;
                    break L33;
                  }
                }
                L34: {
                  if (param0.field_u != 0) {
                    this.field_u = param0.field_u;
                    break L34;
                  } else {
                    break L34;
                  }
                }
                L35: {
                  if (null != param0.field_S) {
                    this.field_S = param0.field_S;
                    break L35;
                  } else {
                    break L35;
                  }
                }
                L36: {
                  if (null != param0.field_r) {
                    this.field_r = param0.field_r;
                    break L36;
                  } else {
                    break L36;
                  }
                }
                L37: {
                  if (param0.field_A != null) {
                    this.field_A = param0.field_A;
                    break L37;
                  } else {
                    break L37;
                  }
                }
                L38: {
                  if ((param0.field_x ^ -1) != 2147483647) {
                    this.field_x = param0.field_x;
                    break L38;
                  } else {
                    break L38;
                  }
                }
                if (!param0.field_Y) {
                  break L2;
                } else {
                  this.field_Y = param0.field_Y;
                  break L2;
                }
              } else {
                break L2;
              }
            }
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L39: {
            var3 = decompiledCaughtException;
            stackIn_99_0 = (RuntimeException) (var3);

            stackIn_99_1 = new StringBuilder().append("sf.G(");

            if (param0 == null) {
              stackIn_100_0 = (RuntimeException) ((Object) stackIn_99_0);
              stackIn_100_1 = (StringBuilder) ((Object) stackIn_99_1);
              stackIn_100_2 = "null";
              break L39;
            } else {
              stackIn_100_0 = (RuntimeException) ((Object) stackIn_99_0);
              stackIn_100_1 = (StringBuilder) ((Object) stackIn_99_1);
              stackIn_100_2 = "{...}";
              break L39;
            }
          }
          throw dd.a((Throwable) ((Object) stackIn_100_0), stackIn_100_2 + ',' + param1 + ')');
        }
    }

    public static void b(byte param0) {
        if (param0 != 7) {
            StringBuilder var2 = (StringBuilder) null;
            sf.a(-50, (StringBuilder) null, '}', (byte) -73);
        }
        field_q = null;
        field_K = null;
    }

    private sf(long param0, sf param1, int param2, int param3, int param4, int param5, String param6) {
        this.field_x = -2147483648;
        this.field_H = -2147483648;
        this.field_m = -1;
        this.field_w = -2147483648;
        this.field_n = -1;
        this.field_Q = -2147483648;
        this.field_E = 256;
        this.field_z = -1;
        this.field_U = false;
        this.field_G = -1;
        this.field_s = -2147483648;
        this.field_W = -2147483648;
        this.field_P = true;
        try {
            this.field_d = param0;
            this.a(param1, (byte) -117);
            if (param6 != null) {
                this.field_r = param6;
            }
        } catch (RuntimeException runtimeException) {
            throw dd.a((Throwable) ((Object) runtimeException), "sf.<init>(" + param0 + ',' + (param1 != null ? "{...}" : "null") + ',' + param2 + ',' + param3 + ',' + param4 + ',' + param5 + ',' + (param6 != null ? "{...}" : "null") + ')');
        }
    }

    static {
        field_K = new int[4];
        field_O = 9;
    }
}
