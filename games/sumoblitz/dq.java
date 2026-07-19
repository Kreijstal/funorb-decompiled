/*
 * Decompiled by CFR-JS 0.4.0.
 */
class dq extends dp {
    private wb[] field_D;
    private wb field_G;
    static int[] field_s;
    private int field_cb;
    private boolean field_z;
    private int field_M;
    private boolean field_x;
    private int field_O;
    private int field_N;
    private vn field_C;
    private wb field_A;
    static ri[] field_v;
    private boolean field_R;
    private int field_ab;
    private int field_E;
    private int field_S;
    private wb[] field_u;
    private int field_V;
    private int field_H;
    private wb field_W;
    private boolean field_J;
    static ki field_Z;
    private int field_U;
    private int field_Q;
    private int field_bb;
    private int field_L;
    private wb field_db;
    private int field_fb;
    private int field_B;
    private int field_I;
    private wb[] field_eb;
    private String field_t;
    private wb[] field_T;
    private boolean field_Y;
    private int field_w;
    private int field_K;
    private boolean field_y;
    private wb[] field_X;
    private wb field_r;
    private String field_F;

    final static void a(byte param0, int param1) {
        RuntimeException var2 = null;
        int var3 = 0;
        pd var4 = null;
        RuntimeException decompiledCaughtException = null;
        var3 = Sumoblitz.field_L ? 1 : 0;
        try {
          L0: {
            L1: {
              if (param0 == 115) {
                break L1;
              } else {
                dq.a((byte) 19, -85);
                break L1;
              }
            }
            var4 = (pd) ((Object) vu.field_g.b(-87));
            L2: while (true) {
              L3: {
                if (var4 == null) {
                  break L3;
                } else {
                  k.a(var4, param1, (byte) 117);
                  var4 = (pd) ((Object) vu.field_g.d((byte) 18));
                  if (var3 != 0) {
                    break L3;
                  } else {
                    if (var3 == 0) {
                      continue L2;
                    } else {
                      break L3;
                    }
                  }
                }
              }
              break L0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2 = decompiledCaughtException;
          throw qo.a((Throwable) ((Object) var2), "dq.C(" + param0 + ',' + param1 + ')');
        }
    }

    private final void a(dq param0, byte param1) {
        RuntimeException var3 = null;
        RuntimeException stackIn_100_0 = null;
        StringBuilder stackIn_100_1 = null;
        RuntimeException stackIn_101_0 = null;
        StringBuilder stackIn_101_1 = null;
        RuntimeException stackIn_102_0 = null;
        StringBuilder stackIn_102_1 = null;
        String stackIn_102_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException stackOut_99_0 = null;
        StringBuilder stackOut_99_1 = null;
        RuntimeException stackOut_101_0 = null;
        StringBuilder stackOut_101_1 = null;
        String stackOut_101_2 = null;
        RuntimeException stackOut_100_0 = null;
        StringBuilder stackOut_100_1 = null;
        String stackOut_100_2 = null;
        try {
          L0: {
            L1: {
              if (param0 != null) {
                L2: {
                  if (0 == param0.field_w) {
                    break L2;
                  } else {
                    this.field_w = param0.field_w;
                    break L2;
                  }
                }
                L3: {
                  if (param0.field_cb != -2147483648) {
                    this.field_cb = param0.field_cb;
                    break L3;
                  } else {
                    break L3;
                  }
                }
                L4: {
                  if (2147483647 == (param0.field_V ^ -1)) {
                    break L4;
                  } else {
                    this.field_V = param0.field_V;
                    break L4;
                  }
                }
                L5: {
                  if ((param0.field_U ^ -1) != 2147483647) {
                    this.field_U = param0.field_U;
                    break L5;
                  } else {
                    break L5;
                  }
                }
                L6: {
                  if (!param0.field_x) {
                    break L6;
                  } else {
                    this.field_x = param0.field_x;
                    break L6;
                  }
                }
                L7: {
                  if (param0.field_I != 0) {
                    this.field_I = param0.field_I;
                    break L7;
                  } else {
                    break L7;
                  }
                }
                L8: {
                  if (null == param0.field_G) {
                    break L8;
                  } else {
                    this.field_G = param0.field_G;
                    break L8;
                  }
                }
                L9: {
                  if (!param0.field_Y) {
                    break L9;
                  } else {
                    this.field_Y = param0.field_Y;
                    break L9;
                  }
                }
                L10: {
                  if (param0.field_r == null) {
                    break L10;
                  } else {
                    this.field_r = param0.field_r;
                    break L10;
                  }
                }
                L11: {
                  if (-1 != (param0.field_N ^ -1)) {
                    this.field_N = param0.field_N;
                    break L11;
                  } else {
                    break L11;
                  }
                }
                L12: {
                  if (param0.field_X == null) {
                    break L12;
                  } else {
                    this.field_X = param0.field_X;
                    break L12;
                  }
                }
                L13: {
                  if (param0.field_S < 0) {
                    break L13;
                  } else {
                    this.field_S = param0.field_S;
                    break L13;
                  }
                }
                L14: {
                  if (param0.field_E != -2147483648) {
                    this.field_E = param0.field_E;
                    break L14;
                  } else {
                    break L14;
                  }
                }
                L15: {
                  if (param0.field_C == null) {
                    break L15;
                  } else {
                    this.field_C = param0.field_C;
                    break L15;
                  }
                }
                L16: {
                  if (!param0.field_J) {
                    this.field_J = param0.field_J;
                    break L16;
                  } else {
                    break L16;
                  }
                }
                L17: {
                  if (param0.field_W != null) {
                    this.field_W = param0.field_W;
                    break L17;
                  } else {
                    break L17;
                  }
                }
                L18: {
                  if (param0.field_t == null) {
                    break L18;
                  } else {
                    this.field_t = param0.field_t;
                    break L18;
                  }
                }
                L19: {
                  if (!param0.field_z) {
                    break L19;
                  } else {
                    this.field_z = param0.field_z;
                    break L19;
                  }
                }
                L20: {
                  if (null != param0.field_u) {
                    this.field_u = param0.field_u;
                    break L20;
                  } else {
                    break L20;
                  }
                }
                L21: {
                  if (null != param0.field_db) {
                    this.field_db = param0.field_db;
                    break L21;
                  } else {
                    break L21;
                  }
                }
                L22: {
                  if (param0.field_R) {
                    this.field_R = param0.field_R;
                    break L22;
                  } else {
                    break L22;
                  }
                }
                L23: {
                  if (param0.field_H == 0) {
                    break L23;
                  } else {
                    this.field_H = param0.field_H;
                    break L23;
                  }
                }
                L24: {
                  if (null != param0.field_A) {
                    this.field_A = param0.field_A;
                    break L24;
                  } else {
                    break L24;
                  }
                }
                L25: {
                  if (!param0.field_y) {
                    break L25;
                  } else {
                    this.field_y = param0.field_y;
                    break L25;
                  }
                }
                L26: {
                  if ((param0.field_fb ^ -1) != 2147483647) {
                    this.field_fb = param0.field_fb;
                    break L26;
                  } else {
                    break L26;
                  }
                }
                L27: {
                  if (null != param0.field_eb) {
                    this.field_eb = param0.field_eb;
                    break L27;
                  } else {
                    break L27;
                  }
                }
                L28: {
                  if (param0.field_L == 0) {
                    break L28;
                  } else {
                    this.field_L = param0.field_L;
                    break L28;
                  }
                }
                L29: {
                  if (null != param0.field_T) {
                    this.field_T = param0.field_T;
                    break L29;
                  } else {
                    break L29;
                  }
                }
                L30: {
                  if (-257 != (param0.field_B ^ -1)) {
                    this.field_B = param0.field_B;
                    break L30;
                  } else {
                    break L30;
                  }
                }
                L31: {
                  if (0 > param0.field_M) {
                    break L31;
                  } else {
                    this.field_M = param0.field_M;
                    break L31;
                  }
                }
                L32: {
                  if (null != param0.field_D) {
                    this.field_D = param0.field_D;
                    break L32;
                  } else {
                    break L32;
                  }
                }
                L33: {
                  if (param0.field_bb != 0) {
                    this.field_bb = param0.field_bb;
                    break L33;
                  } else {
                    break L33;
                  }
                }
                L34: {
                  if (0 <= param0.field_ab) {
                    this.field_ab = param0.field_ab;
                    break L34;
                  } else {
                    break L34;
                  }
                }
                L35: {
                  if ((param0.field_K ^ -1) == 2147483647) {
                    break L35;
                  } else {
                    this.field_K = param0.field_K;
                    break L35;
                  }
                }
                L36: {
                  if (param0.field_F != null) {
                    this.field_F = param0.field_F;
                    break L36;
                  } else {
                    break L36;
                  }
                }
                L37: {
                  if (param0.field_Q == 0) {
                    break L37;
                  } else {
                    this.field_Q = param0.field_Q;
                    break L37;
                  }
                }
                if ((param0.field_O ^ -1) <= -1) {
                  this.field_O = param0.field_O;
                  break L1;
                } else {
                  break L1;
                }
              } else {
                break L1;
              }
            }
            L38: {
              if (param1 <= -68) {
                break L38;
              } else {
                this.field_fb = -47;
                break L38;
              }
            }
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L39: {
            var3 = decompiledCaughtException;
            stackOut_99_0 = (RuntimeException) (var3);
            stackOut_99_1 = new StringBuilder().append("dq.D(");
            stackIn_101_0 = stackOut_99_0;
            stackIn_101_1 = stackOut_99_1;
            stackIn_100_0 = stackOut_99_0;
            stackIn_100_1 = stackOut_99_1;
            if (param0 == null) {
              stackOut_101_0 = (RuntimeException) ((Object) stackIn_101_0);
              stackOut_101_1 = (StringBuilder) ((Object) stackIn_101_1);
              stackOut_101_2 = "null";
              stackIn_102_0 = stackOut_101_0;
              stackIn_102_1 = stackOut_101_1;
              stackIn_102_2 = stackOut_101_2;
              break L39;
            } else {
              stackOut_100_0 = (RuntimeException) ((Object) stackIn_100_0);
              stackOut_100_1 = (StringBuilder) ((Object) stackIn_100_1);
              stackOut_100_2 = "{...}";
              stackIn_102_0 = stackOut_100_0;
              stackIn_102_1 = stackOut_100_1;
              stackIn_102_2 = stackOut_100_2;
              break L39;
            }
          }
          throw qo.a((Throwable) ((Object) stackIn_102_0), stackIn_102_2 + ',' + param1 + ')');
        }
    }

    public static void a(int param0) {
        field_v = null;
        field_s = null;
        field_Z = null;
        if (param0 != -1) {
            dq.a(109);
        }
    }

    dq(long param0, dq param1) {
        this(param0, param1, 0, 0, 0, 0, (String) null);
    }

    private dq(long param0, dq param1, int param2, int param3, int param4, int param5, String param6) {
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
        this.field_O = -1;
        this.field_M = -1;
        this.field_E = -2147483648;
        this.field_U = -2147483648;
        this.field_V = -2147483648;
        this.field_J = true;
        this.field_S = -1;
        this.field_cb = -2147483648;
        this.field_ab = -1;
        this.field_B = 256;
        this.field_K = -2147483648;
        this.field_fb = -2147483648;
        this.field_y = false;
        try {
          L0: {
            L1: {
              this.field_h = param0;
              this.a(param1, (byte) -128);
              if (param6 == null) {
                break L1;
              } else {
                this.field_F = param6;
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
            stackOut_4_1 = new StringBuilder().append("dq.<init>(").append(param0).append(',');
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
          throw qo.a((Throwable) ((Object) stackIn_10_0), stackIn_10_2 + ')');
        }
    }

    static {
        field_s = new int[1];
    }
}
