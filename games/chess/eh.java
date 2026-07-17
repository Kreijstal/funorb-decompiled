/*
 * Decompiled by CFR-JS 0.4.0.
 */
import java.util.*;

abstract class eh extends ma {
    private fm field_Q;
    static int[] field_L;
    static dm field_K;
    boolean field_P;
    static jc field_R;
    private int field_N;
    static ci field_M;
    static java.util.zip.CRC32 field_O;

    abstract void b(int param0, int param1, int param2);

    boolean g(byte param0) {
        int var2 = 0;
        int var3 = 0;
        int stackIn_8_0 = 0;
        int stackIn_15_0 = 0;
        int stackIn_24_0 = 0;
        int stackIn_30_0 = 0;
        int stackIn_39_0 = 0;
        int stackIn_45_0 = 0;
        int stackIn_53_0 = 0;
        int stackIn_59_0 = 0;
        int stackOut_57_0 = 0;
        int stackOut_58_0 = 0;
        int stackOut_51_0 = 0;
        int stackOut_52_0 = 0;
        int stackOut_43_0 = 0;
        int stackOut_44_0 = 0;
        int stackOut_37_0 = 0;
        int stackOut_38_0 = 0;
        int stackOut_28_0 = 0;
        int stackOut_29_0 = 0;
        int stackOut_22_0 = 0;
        int stackOut_23_0 = 0;
        int stackOut_14_0 = 0;
        int stackOut_13_0 = 0;
        int stackOut_6_0 = 0;
        int stackOut_7_0 = 0;
        if (param0 <= -4) {
          var2 = this.h(0);
          var3 = var2 - ((eh) this).field_N;
          if (var3 <= 0) {
            if (var3 < 0) {
              L0: {
                L1: {
                  ((eh) this).field_N = ((eh) this).field_N + (-15 + var3) / 16;
                  if (0 != ((eh) this).field_N) {
                    break L1;
                  } else {
                    if (0 != var2) {
                      break L1;
                    } else {
                      if (((eh) this).field_P) {
                        break L1;
                      } else {
                        stackOut_57_0 = 1;
                        stackIn_59_0 = stackOut_57_0;
                        break L0;
                      }
                    }
                  }
                }
                stackOut_58_0 = 0;
                stackIn_59_0 = stackOut_58_0;
                break L0;
              }
              return stackIn_59_0 != 0;
            } else {
              L2: {
                L3: {
                  if (0 != ((eh) this).field_N) {
                    break L3;
                  } else {
                    if (0 != var2) {
                      break L3;
                    } else {
                      if (((eh) this).field_P) {
                        break L3;
                      } else {
                        stackOut_51_0 = 1;
                        stackIn_53_0 = stackOut_51_0;
                        break L2;
                      }
                    }
                  }
                }
                stackOut_52_0 = 0;
                stackIn_53_0 = stackOut_52_0;
                break L2;
              }
              return stackIn_53_0 != 0;
            }
          } else {
            ((eh) this).field_N = ((eh) this).field_N + (-1 + (8 + var3)) / 8;
            if (var3 < 0) {
              L4: {
                L5: {
                  ((eh) this).field_N = ((eh) this).field_N + (-15 + var3) / 16;
                  if (0 != ((eh) this).field_N) {
                    break L5;
                  } else {
                    if (0 != var2) {
                      break L5;
                    } else {
                      if (((eh) this).field_P) {
                        break L5;
                      } else {
                        stackOut_43_0 = 1;
                        stackIn_45_0 = stackOut_43_0;
                        break L4;
                      }
                    }
                  }
                }
                stackOut_44_0 = 0;
                stackIn_45_0 = stackOut_44_0;
                break L4;
              }
              return stackIn_45_0 != 0;
            } else {
              L6: {
                L7: {
                  if (0 != ((eh) this).field_N) {
                    break L7;
                  } else {
                    if (0 != var2) {
                      break L7;
                    } else {
                      if (((eh) this).field_P) {
                        break L7;
                      } else {
                        stackOut_37_0 = 1;
                        stackIn_39_0 = stackOut_37_0;
                        break L6;
                      }
                    }
                  }
                }
                stackOut_38_0 = 0;
                stackIn_39_0 = stackOut_38_0;
                break L6;
              }
              return stackIn_39_0 != 0;
            }
          }
        } else {
          field_M = null;
          var2 = this.h(0);
          var3 = var2 - ((eh) this).field_N;
          if (var3 > 0) {
            ((eh) this).field_N = ((eh) this).field_N + (-1 + (8 + var3)) / 8;
            if (var3 >= 0) {
              L8: {
                L9: {
                  if (0 != ((eh) this).field_N) {
                    break L9;
                  } else {
                    if (0 != var2) {
                      break L9;
                    } else {
                      if (((eh) this).field_P) {
                        break L9;
                      } else {
                        stackOut_28_0 = 1;
                        stackIn_30_0 = stackOut_28_0;
                        break L8;
                      }
                    }
                  }
                }
                stackOut_29_0 = 0;
                stackIn_30_0 = stackOut_29_0;
                break L8;
              }
              return stackIn_30_0 != 0;
            } else {
              L10: {
                L11: {
                  ((eh) this).field_N = ((eh) this).field_N + (-15 + var3) / 16;
                  if (0 != ((eh) this).field_N) {
                    break L11;
                  } else {
                    if (0 != var2) {
                      break L11;
                    } else {
                      if (((eh) this).field_P) {
                        break L11;
                      } else {
                        stackOut_22_0 = 1;
                        stackIn_24_0 = stackOut_22_0;
                        break L10;
                      }
                    }
                  }
                }
                stackOut_23_0 = 0;
                stackIn_24_0 = stackOut_23_0;
                break L10;
              }
              return stackIn_24_0 != 0;
            }
          } else {
            if (var3 < 0) {
              ((eh) this).field_N = ((eh) this).field_N + (-15 + var3) / 16;
              if (0 == ((eh) this).field_N) {
                if (0 != var2) {
                  return false;
                } else {
                  L12: {
                    if (((eh) this).field_P) {
                      stackOut_14_0 = 0;
                      stackIn_15_0 = stackOut_14_0;
                      break L12;
                    } else {
                      stackOut_13_0 = 1;
                      stackIn_15_0 = stackOut_13_0;
                      break L12;
                    }
                  }
                  return stackIn_15_0 != 0;
                }
              } else {
                return false;
              }
            } else {
              L13: {
                L14: {
                  if (0 != ((eh) this).field_N) {
                    break L14;
                  } else {
                    if (0 != var2) {
                      break L14;
                    } else {
                      if (((eh) this).field_P) {
                        break L14;
                      } else {
                        stackOut_6_0 = 1;
                        stackIn_8_0 = stackOut_6_0;
                        break L13;
                      }
                    }
                  }
                }
                stackOut_7_0 = 0;
                stackIn_8_0 = stackOut_7_0;
                break L13;
              }
              return stackIn_8_0 != 0;
            }
          }
        }
    }

    boolean a(int param0) {
        ((eh) this).field_N = this.h(0);
        if (param0 > 46) {
          if (0 == ((eh) this).field_N) {
            if (((eh) this).field_P) {
              return false;
            } else {
              return true;
            }
          } else {
            return false;
          }
        } else {
          eh.i(-44);
          if (0 == ((eh) this).field_N) {
            if (((eh) this).field_P) {
              return false;
            } else {
              return true;
            }
          } else {
            return false;
          }
        }
    }

    final void a(int param0, byte param1, int param2) {
        ((eh) this).a(e.field_O - param2 >> 1, 34, param2, param0, hk.field_I + -param0 >> 1);
        if (param1 < 70) {
            ((eh) this).field_P = false;
        }
    }

    public static void i(int param0) {
        field_K = null;
        field_M = null;
        field_O = null;
        field_R = null;
        field_L = null;
        if (param0 != 888706465) {
            field_M = null;
        }
    }

    eh(fm param0, int param1, int param2) {
        super(-param1 + hk.field_I >> 1, e.field_O - param2 >> 1, param1, param2, (jm) null);
        try {
            ((eh) this).field_N = 0;
            ((eh) this).field_P = false;
            ((eh) this).field_Q = param0;
        } catch (RuntimeException runtimeException) {
            throw fk.a((Throwable) (Object) runtimeException, "eh.<init>(" + (param0 != null ? "{...}" : "null") + 44 + param1 + 44 + param2 + 41);
        }
    }

    final void a(int param0, int param1, int param2, int param3) {
        if (((eh) this).field_N != 0) {
          if (-257 >= ((eh) this).field_N) {
            if (-1 != param1) {
              return;
            } else {
              ((eh) this).b(-14239, ((eh) this).field_r + param0, ((eh) this).field_u + param3);
              super.a(param0, param1, -122, param3);
              return;
            }
          } else {
            if (null == ud.field_c) {
              ud.field_c = new km(((eh) this).field_y, ((eh) this).field_C);
              tl.a((byte) -67, ud.field_c);
              wb.b();
              ((eh) this).b(-14239, 0, 0);
              if (param2 < -80) {
                super.a(-param0 + -((eh) this).field_r, param1, -105, -((eh) this).field_u + -param3);
                int discarded$12 = 28773;
                fd.a();
                ud.field_c.b(param3 - -((eh) this).field_u, ((eh) this).field_r + param0, ((eh) this).field_N);
                return;
              } else {
                int discarded$13 = this.h(125);
                super.a(-param0 + -((eh) this).field_r, param1, -105, -((eh) this).field_u + -param3);
                int discarded$14 = 28773;
                fd.a();
                ud.field_c.b(param3 - -((eh) this).field_u, ((eh) this).field_r + param0, ((eh) this).field_N);
                return;
              }
            } else {
              if (((eh) this).field_y > ud.field_c.field_w) {
                ud.field_c = new km(((eh) this).field_y, ((eh) this).field_C);
                tl.a((byte) -67, ud.field_c);
                wb.b();
                ((eh) this).b(-14239, 0, 0);
                if (param2 >= -80) {
                  int discarded$15 = this.h(125);
                  super.a(-param0 + -((eh) this).field_r, param1, -105, -((eh) this).field_u + -param3);
                  int discarded$16 = 28773;
                  fd.a();
                  ud.field_c.b(param3 - -((eh) this).field_u, ((eh) this).field_r + param0, ((eh) this).field_N);
                  return;
                } else {
                  super.a(-param0 + -((eh) this).field_r, param1, -105, -((eh) this).field_u + -param3);
                  int discarded$17 = 28773;
                  fd.a();
                  ud.field_c.b(param3 - -((eh) this).field_u, ((eh) this).field_r + param0, ((eh) this).field_N);
                  return;
                }
              } else {
                if (((eh) this).field_C > ud.field_c.field_t) {
                  ud.field_c = new km(((eh) this).field_y, ((eh) this).field_C);
                  tl.a((byte) -67, ud.field_c);
                  wb.b();
                  ((eh) this).b(-14239, 0, 0);
                  if (param2 >= -80) {
                    int discarded$18 = this.h(125);
                    super.a(-param0 + -((eh) this).field_r, param1, -105, -((eh) this).field_u + -param3);
                    int discarded$19 = 28773;
                    fd.a();
                    ud.field_c.b(param3 - -((eh) this).field_u, ((eh) this).field_r + param0, ((eh) this).field_N);
                    return;
                  } else {
                    super.a(-param0 + -((eh) this).field_r, param1, -105, -((eh) this).field_u + -param3);
                    int discarded$20 = 28773;
                    fd.a();
                    ud.field_c.b(param3 - -((eh) this).field_u, ((eh) this).field_r + param0, ((eh) this).field_N);
                    return;
                  }
                } else {
                  tl.a((byte) -67, ud.field_c);
                  wb.b();
                  ((eh) this).b(-14239, 0, 0);
                  if (param2 < -80) {
                    super.a(-param0 + -((eh) this).field_r, param1, -105, -((eh) this).field_u + -param3);
                    int discarded$21 = 28773;
                    fd.a();
                    ud.field_c.b(param3 - -((eh) this).field_u, ((eh) this).field_r + param0, ((eh) this).field_N);
                    return;
                  } else {
                    int discarded$22 = this.h(125);
                    super.a(-param0 + -((eh) this).field_r, param1, -105, -((eh) this).field_u + -param3);
                    int discarded$23 = 28773;
                    fd.a();
                    ud.field_c.b(param3 - -((eh) this).field_u, ((eh) this).field_r + param0, ((eh) this).field_N);
                    return;
                  }
                }
              }
            }
          }
        } else {
          return;
        }
    }

    final static int a(int param0, Random param1, int param2) {
        int var3_int = 0;
        RuntimeException var3 = null;
        int var4 = 0;
        int stackIn_5_0 = 0;
        int stackIn_10_0 = 0;
        RuntimeException stackIn_12_0 = null;
        StringBuilder stackIn_12_1 = null;
        RuntimeException stackIn_13_0 = null;
        StringBuilder stackIn_13_1 = null;
        RuntimeException stackIn_14_0 = null;
        StringBuilder stackIn_14_1 = null;
        String stackIn_14_2 = null;
        RuntimeException decompiledCaughtException = null;
        int stackOut_4_0 = 0;
        int stackOut_9_0 = 0;
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
            if (0 < param2) {
              if (ua.a(param2, 14)) {
                stackOut_4_0 = (int)((long)param2 * ((long)param1.nextInt() & 4294967295L) >> 32);
                stackIn_5_0 = stackOut_4_0;
                return stackIn_5_0;
              } else {
                var3_int = -(int)(4294967296L % (long)param2) + -2147483648;
                L1: while (true) {
                  var4 = param1.nextInt();
                  if (var3_int > var4) {
                    int discarded$2 = -40;
                    stackOut_9_0 = am.a(var4, param2);
                    stackIn_10_0 = stackOut_9_0;
                    break L0;
                  } else {
                    continue L1;
                  }
                }
              }
            } else {
              throw new IllegalArgumentException();
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L2: {
            var3 = decompiledCaughtException;
            stackOut_11_0 = (RuntimeException) var3;
            stackOut_11_1 = new StringBuilder().append("eh.MA(").append(28207).append(44);
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
              break L2;
            } else {
              stackOut_12_0 = (RuntimeException) (Object) stackIn_12_0;
              stackOut_12_1 = (StringBuilder) (Object) stackIn_12_1;
              stackOut_12_2 = "{...}";
              stackIn_14_0 = stackOut_12_0;
              stackIn_14_1 = stackOut_12_1;
              stackIn_14_2 = stackOut_12_2;
              break L2;
            }
          }
          throw fk.a((Throwable) (Object) stackIn_14_0, stackIn_14_2 + 44 + param2 + 41);
        }
        return stackIn_10_0;
    }

    final mf e(byte param0) {
        mf var2 = super.e(param0);
        if (!(var2 == null)) {
            return var2;
        }
        return (mf) this;
    }

    private final int h(int param0) {
        int stackIn_6_0 = 0;
        int stackIn_12_0 = 0;
        int stackOut_11_0 = 0;
        int stackOut_10_0 = 0;
        int stackOut_8_0 = 0;
        int stackOut_5_0 = 0;
        int stackOut_4_0 = 0;
        int stackOut_2_0 = 0;
        if (param0 != 0) {
          L0: {
            field_M = null;
            if (((eh) this).field_P) {
              if (this != (Object) (Object) ((eh) this).field_Q.k(-127)) {
                stackOut_11_0 = 0;
                stackIn_12_0 = stackOut_11_0;
                break L0;
              } else {
                stackOut_10_0 = 256;
                stackIn_12_0 = stackOut_10_0;
                break L0;
              }
            } else {
              stackOut_8_0 = 0;
              stackIn_12_0 = stackOut_8_0;
              break L0;
            }
          }
          return stackIn_12_0;
        } else {
          L1: {
            if (((eh) this).field_P) {
              if (this != (Object) (Object) ((eh) this).field_Q.k(-127)) {
                stackOut_5_0 = 0;
                stackIn_6_0 = stackOut_5_0;
                break L1;
              } else {
                stackOut_4_0 = 256;
                stackIn_6_0 = stackOut_4_0;
                break L1;
              }
            } else {
              stackOut_2_0 = 0;
              stackIn_6_0 = stackOut_2_0;
              break L1;
            }
          }
          return stackIn_6_0;
        }
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_K = null;
        field_R = new jc();
        field_O = new java.util.zip.CRC32();
    }
}
