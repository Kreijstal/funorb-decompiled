/*
 * Decompiled by CFR-JS 0.4.0.
 */
import java.lang.String;

class ih extends fd {
    private int field_W;
    private boolean field_x;
    private tg[] field_I;
    private boolean field_N;
    private tg field_t;
    private tg[] field_C;
    private int field_H;
    private int field_G;
    private boolean field_eb;
    private int field_L;
    static bc field_w;
    static String field_P;
    private int field_M;
    private int field_hb;
    private tg[] field_S;
    static int[] field_db;
    private tg field_F;
    private tg[] field_ab;
    private int field_r;
    private tg[] field_U;
    private int field_E;
    static oj field_Q;
    private int field_y;
    private String field_z;
    private int field_R;
    private int field_O;
    static int field_D;
    private String field_fb;
    static int[] field_V;
    private int field_J;
    private tg field_Z;
    static gk field_p;
    private boolean field_q;
    private boolean field_Y;
    static int field_X;
    private int field_A;
    private int field_ib;
    private int field_B;
    private int field_K;
    private boolean field_bb;
    private int field_s;
    static tg[] field_T;
    private int field_v;
    private tg field_gb;
    private tj field_u;
    private tg field_cb;

    public static void d(byte param0) {
        field_T = null;
        field_Q = null;
        field_V = null;
        field_P = null;
        field_p = null;
        if (param0 != -58) {
            ih.d((byte) -127);
        }
        field_w = null;
        field_db = null;
    }

    final static void a(int param0, int param1) {
        ai var2 = null;
        RuntimeException var2_ref = null;
        int var3 = 0;
        ke var4 = null;
        RuntimeException decompiledCaughtException = null;
        var3 = Bounce.field_N;
        try {
          L0: {
            var4 = (ke) (Object) uk.field_d.a((byte) -107);
            L1: while (true) {
              if (var4 == null) {
                var2 = ne.field_r.a((byte) -59);
                L2: while (true) {
                  if (var2 == null) {
                    break L0;
                  } else {
                    int discarded$12 = 4;
                    int discarded$13 = 2;
                    ea.a();
                    var2 = ne.field_r.d((byte) -24);
                    continue L2;
                  }
                }
              } else {
                int discarded$14 = -22762;
                int discarded$15 = 4;
                qh.a(var4);
                var4 = (ke) (Object) uk.field_d.d((byte) -127);
                continue L1;
              }
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2_ref = decompiledCaughtException;
          throw ii.a((Throwable) (Object) var2_ref, "ih.B(" + 4 + ',' + -1 + ')');
        }
    }

    final static String a(boolean param0, CharSequence param1) {
        int var3_int = 0;
        RuntimeException var3 = null;
        String var4 = null;
        int var5 = 0;
        int var6 = 0;
        int var7 = 0;
        int var8 = 0;
        String stackIn_3_0 = null;
        String stackIn_8_0 = null;
        String stackIn_13_0 = null;
        String stackIn_18_0 = null;
        String stackIn_26_0 = null;
        String stackIn_33_0 = null;
        RuntimeException stackIn_35_0 = null;
        StringBuilder stackIn_35_1 = null;
        RuntimeException stackIn_36_0 = null;
        StringBuilder stackIn_36_1 = null;
        RuntimeException stackIn_37_0 = null;
        StringBuilder stackIn_37_1 = null;
        String stackIn_37_2 = null;
        RuntimeException decompiledCaughtException = null;
        String stackOut_32_0 = null;
        String stackOut_25_0 = null;
        String stackOut_17_0 = null;
        String stackOut_12_0 = null;
        String stackOut_7_0 = null;
        String stackOut_2_0 = null;
        RuntimeException stackOut_34_0 = null;
        StringBuilder stackOut_34_1 = null;
        RuntimeException stackOut_36_0 = null;
        StringBuilder stackOut_36_1 = null;
        String stackOut_36_2 = null;
        RuntimeException stackOut_35_0 = null;
        StringBuilder stackOut_35_1 = null;
        String stackOut_35_2 = null;
        var8 = Bounce.field_N;
        try {
          L0: {
            if (param1 != null) {
              L1: {
                var3_int = param1.length();
                if (1 > var3_int) {
                  break L1;
                } else {
                  if (12 >= var3_int) {
                    L2: {
                      int discarded$21 = 0;
                      var4 = ce.a(param1);
                      if (var4 == null) {
                        break L2;
                      } else {
                        if (var4.length() >= 1) {
                          L3: {
                            int discarded$22 = 0;
                            if (f.a(var4.charAt(0))) {
                              break L3;
                            } else {
                              int discarded$23 = 0;
                              if (!f.a(var4.charAt(-1 + var4.length()))) {
                                var5 = 0;
                                var6 = 0;
                                L4: while (true) {
                                  if (param1.length() <= var6) {
                                    if (var5 > 0) {
                                      stackOut_32_0 = hi.field_a;
                                      stackIn_33_0 = stackOut_32_0;
                                      break L0;
                                    } else {
                                      return null;
                                    }
                                  } else {
                                    L5: {
                                      var7 = param1.charAt(var6);
                                      int discarded$24 = 0;
                                      if (!f.a((char) var7)) {
                                        var5 = 0;
                                        break L5;
                                      } else {
                                        var5++;
                                        break L5;
                                      }
                                    }
                                    if (var5 < 2) {
                                      var6++;
                                      continue L4;
                                    } else {
                                      stackOut_25_0 = sg.field_c;
                                      stackIn_26_0 = stackOut_25_0;
                                      return stackIn_26_0;
                                    }
                                  }
                                }
                              } else {
                                break L3;
                              }
                            }
                          }
                          stackOut_17_0 = hi.field_a;
                          stackIn_18_0 = stackOut_17_0;
                          return stackIn_18_0;
                        } else {
                          break L2;
                        }
                      }
                    }
                    stackOut_12_0 = ub.field_e;
                    stackIn_13_0 = stackOut_12_0;
                    return stackIn_13_0;
                  } else {
                    break L1;
                  }
                }
              }
              stackOut_7_0 = ub.field_e;
              stackIn_8_0 = stackOut_7_0;
              return stackIn_8_0;
            } else {
              stackOut_2_0 = ub.field_e;
              stackIn_3_0 = stackOut_2_0;
              return stackIn_3_0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L6: {
            var3 = decompiledCaughtException;
            stackOut_34_0 = (RuntimeException) var3;
            stackOut_34_1 = new StringBuilder().append("ih.C(").append(false).append(',');
            stackIn_36_0 = stackOut_34_0;
            stackIn_36_1 = stackOut_34_1;
            stackIn_35_0 = stackOut_34_0;
            stackIn_35_1 = stackOut_34_1;
            if (param1 == null) {
              stackOut_36_0 = (RuntimeException) (Object) stackIn_36_0;
              stackOut_36_1 = (StringBuilder) (Object) stackIn_36_1;
              stackOut_36_2 = "null";
              stackIn_37_0 = stackOut_36_0;
              stackIn_37_1 = stackOut_36_1;
              stackIn_37_2 = stackOut_36_2;
              break L6;
            } else {
              stackOut_35_0 = (RuntimeException) (Object) stackIn_35_0;
              stackOut_35_1 = (StringBuilder) (Object) stackIn_35_1;
              stackOut_35_2 = "{...}";
              stackIn_37_0 = stackOut_35_0;
              stackIn_37_1 = stackOut_35_1;
              stackIn_37_2 = stackOut_35_2;
              break L6;
            }
          }
          throw ii.a((Throwable) (Object) stackIn_37_0, stackIn_37_2 + ',' + false + ')');
        }
        return stackIn_33_0;
    }

    private final void a(int param0, ih param1) {
        RuntimeException var3 = null;
        RuntimeException stackIn_92_0 = null;
        StringBuilder stackIn_92_1 = null;
        RuntimeException stackIn_93_0 = null;
        StringBuilder stackIn_93_1 = null;
        RuntimeException stackIn_94_0 = null;
        StringBuilder stackIn_94_1 = null;
        String stackIn_94_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException stackOut_91_0 = null;
        StringBuilder stackOut_91_1 = null;
        RuntimeException stackOut_93_0 = null;
        StringBuilder stackOut_93_1 = null;
        String stackOut_93_2 = null;
        RuntimeException stackOut_92_0 = null;
        StringBuilder stackOut_92_1 = null;
        String stackOut_92_2 = null;
        try {
          L0: {
            L1: {
              if (param1 != null) {
                L2: {
                  if (256 == param1.field_K) {
                    break L2;
                  } else {
                    ((ih) this).field_K = param1.field_K;
                    break L2;
                  }
                }
                L3: {
                  if (null == param1.field_cb) {
                    break L3;
                  } else {
                    ((ih) this).field_cb = param1.field_cb;
                    break L3;
                  }
                }
                L4: {
                  if (param1.field_x) {
                    ((ih) this).field_x = param1.field_x;
                    break L4;
                  } else {
                    break L4;
                  }
                }
                L5: {
                  if (param1.field_R != 0) {
                    ((ih) this).field_R = param1.field_R;
                    break L5;
                  } else {
                    break L5;
                  }
                }
                L6: {
                  if (param1.field_hb < 0) {
                    break L6;
                  } else {
                    ((ih) this).field_hb = param1.field_hb;
                    break L6;
                  }
                }
                L7: {
                  if (0 != param1.field_r) {
                    ((ih) this).field_r = param1.field_r;
                    break L7;
                  } else {
                    break L7;
                  }
                }
                L8: {
                  if (!param1.field_eb) {
                    break L8;
                  } else {
                    ((ih) this).field_eb = param1.field_eb;
                    break L8;
                  }
                }
                L9: {
                  if (param1.field_A != -2147483648) {
                    ((ih) this).field_A = param1.field_A;
                    break L9;
                  } else {
                    break L9;
                  }
                }
                L10: {
                  if (param1.field_M != 0) {
                    ((ih) this).field_M = param1.field_M;
                    break L10;
                  } else {
                    break L10;
                  }
                }
                L11: {
                  if (param1.field_bb) {
                    break L11;
                  } else {
                    ((ih) this).field_bb = param1.field_bb;
                    break L11;
                  }
                }
                L12: {
                  if (-2147483648 == param1.field_W) {
                    break L12;
                  } else {
                    ((ih) this).field_W = param1.field_W;
                    break L12;
                  }
                }
                L13: {
                  if (-2147483648 == param1.field_ib) {
                    break L13;
                  } else {
                    ((ih) this).field_ib = param1.field_ib;
                    break L13;
                  }
                }
                L14: {
                  if (param1.field_B == 0) {
                    break L14;
                  } else {
                    ((ih) this).field_B = param1.field_B;
                    break L14;
                  }
                }
                L15: {
                  if (param1.field_E == -2147483648) {
                    break L15;
                  } else {
                    ((ih) this).field_E = param1.field_E;
                    break L15;
                  }
                }
                L16: {
                  if (-2147483648 == param1.field_y) {
                    break L16;
                  } else {
                    ((ih) this).field_y = param1.field_y;
                    break L16;
                  }
                }
                L17: {
                  if (param1.field_U == null) {
                    break L17;
                  } else {
                    ((ih) this).field_U = param1.field_U;
                    break L17;
                  }
                }
                L18: {
                  if (param1.field_s < 0) {
                    break L18;
                  } else {
                    ((ih) this).field_s = param1.field_s;
                    break L18;
                  }
                }
                L19: {
                  if (param1.field_ab == null) {
                    break L19;
                  } else {
                    ((ih) this).field_ab = param1.field_ab;
                    break L19;
                  }
                }
                L20: {
                  if (null == param1.field_u) {
                    break L20;
                  } else {
                    ((ih) this).field_u = param1.field_u;
                    break L20;
                  }
                }
                L21: {
                  if (param1.field_F == null) {
                    break L21;
                  } else {
                    ((ih) this).field_F = param1.field_F;
                    break L21;
                  }
                }
                L22: {
                  if (null != param1.field_C) {
                    ((ih) this).field_C = param1.field_C;
                    break L22;
                  } else {
                    break L22;
                  }
                }
                L23: {
                  if (param1.field_z != null) {
                    ((ih) this).field_z = param1.field_z;
                    break L23;
                  } else {
                    break L23;
                  }
                }
                L24: {
                  if (null == param1.field_t) {
                    break L24;
                  } else {
                    ((ih) this).field_t = param1.field_t;
                    break L24;
                  }
                }
                L25: {
                  if (null == param1.field_fb) {
                    break L25;
                  } else {
                    ((ih) this).field_fb = param1.field_fb;
                    break L25;
                  }
                }
                L26: {
                  if (!param1.field_q) {
                    break L26;
                  } else {
                    ((ih) this).field_q = param1.field_q;
                    break L26;
                  }
                }
                L27: {
                  if (null != param1.field_gb) {
                    ((ih) this).field_gb = param1.field_gb;
                    break L27;
                  } else {
                    break L27;
                  }
                }
                L28: {
                  if (0 != param1.field_J) {
                    ((ih) this).field_J = param1.field_J;
                    break L28;
                  } else {
                    break L28;
                  }
                }
                L29: {
                  if (param1.field_v >= 0) {
                    ((ih) this).field_v = param1.field_v;
                    break L29;
                  } else {
                    break L29;
                  }
                }
                L30: {
                  if (!param1.field_N) {
                    break L30;
                  } else {
                    ((ih) this).field_N = param1.field_N;
                    break L30;
                  }
                }
                L31: {
                  if (param1.field_L != 0) {
                    ((ih) this).field_L = param1.field_L;
                    break L31;
                  } else {
                    break L31;
                  }
                }
                L32: {
                  if (null == param1.field_I) {
                    break L32;
                  } else {
                    ((ih) this).field_I = param1.field_I;
                    break L32;
                  }
                }
                L33: {
                  if (param1.field_S != null) {
                    ((ih) this).field_S = param1.field_S;
                    break L33;
                  } else {
                    break L33;
                  }
                }
                L34: {
                  if (!param1.field_Y) {
                    break L34;
                  } else {
                    ((ih) this).field_Y = param1.field_Y;
                    break L34;
                  }
                }
                L35: {
                  if (param1.field_Z != null) {
                    ((ih) this).field_Z = param1.field_Z;
                    break L35;
                  } else {
                    break L35;
                  }
                }
                L36: {
                  if (param1.field_G < 0) {
                    break L36;
                  } else {
                    ((ih) this).field_G = param1.field_G;
                    break L36;
                  }
                }
                L37: {
                  if (param1.field_O != -2147483648) {
                    ((ih) this).field_O = param1.field_O;
                    break L37;
                  } else {
                    break L37;
                  }
                }
                if (param1.field_H == 0) {
                  break L1;
                } else {
                  ((ih) this).field_H = param1.field_H;
                  break L1;
                }
              } else {
                break L1;
              }
            }
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L38: {
            var3 = decompiledCaughtException;
            stackOut_91_0 = (RuntimeException) var3;
            stackOut_91_1 = new StringBuilder().append("ih.A(").append(-1).append(',');
            stackIn_93_0 = stackOut_91_0;
            stackIn_93_1 = stackOut_91_1;
            stackIn_92_0 = stackOut_91_0;
            stackIn_92_1 = stackOut_91_1;
            if (param1 == null) {
              stackOut_93_0 = (RuntimeException) (Object) stackIn_93_0;
              stackOut_93_1 = (StringBuilder) (Object) stackIn_93_1;
              stackOut_93_2 = "null";
              stackIn_94_0 = stackOut_93_0;
              stackIn_94_1 = stackOut_93_1;
              stackIn_94_2 = stackOut_93_2;
              break L38;
            } else {
              stackOut_92_0 = (RuntimeException) (Object) stackIn_92_0;
              stackOut_92_1 = (StringBuilder) (Object) stackIn_92_1;
              stackOut_92_2 = "{...}";
              stackIn_94_0 = stackOut_92_0;
              stackIn_94_1 = stackOut_92_1;
              stackIn_94_2 = stackOut_92_2;
              break L38;
            }
          }
          throw ii.a((Throwable) (Object) stackIn_94_0, stackIn_94_2 + ')');
        }
    }

    ih(long param0, ih param1) {
        this(param0, param1, 0, 0, 0, 0, (String) null);
    }

    private ih(long param0, ih param1, int param2, int param3, int param4, int param5, String param6) {
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
        ((ih) this).field_W = -2147483648;
        ((ih) this).field_hb = -1;
        ((ih) this).field_G = -1;
        ((ih) this).field_O = -2147483648;
        ((ih) this).field_E = -2147483648;
        ((ih) this).field_y = -2147483648;
        ((ih) this).field_Y = false;
        ((ih) this).field_bb = true;
        ((ih) this).field_v = -1;
        ((ih) this).field_K = 256;
        ((ih) this).field_ib = -2147483648;
        ((ih) this).field_s = -1;
        ((ih) this).field_A = -2147483648;
        try {
          L0: {
            L1: {
              ((ih) this).field_d = param0;
              this.a(-1, param1);
              if (param6 == null) {
                break L1;
              } else {
                ((ih) this).field_fb = param6;
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
            stackOut_4_1 = new StringBuilder().append("ih.<init>(").append(param0).append(',');
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
          throw ii.a((Throwable) (Object) stackIn_10_0, stackIn_10_2 + ')');
        }
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_P = "Unfortunately you are not eligible to create an account.";
        field_db = new int[8192];
    }
}
