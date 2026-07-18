/*
 * Decompiled by CFR-JS 0.4.0.
 */
abstract class ul extends vd {
    static int field_H;
    private int field_I;
    static bd field_G;
    static java.text.DecimalFormat field_E;
    private gg field_K;
    static String field_M;
    static int field_L;
    static bd[] field_J;
    static boolean field_O;
    static gb field_P;
    static boolean field_N;
    boolean field_F;

    ul(gg param0, int param1, int param2) {
        super(-param1 + mm.field_q >> 1, fb.field_f - param2 >> 1, param1, param2, (nn) null);
        try {
            ((ul) this).field_K = param0;
            ((ul) this).field_I = 0;
            ((ul) this).field_F = false;
        } catch (RuntimeException runtimeException) {
            throw wg.a((Throwable) (Object) runtimeException, "ul.<init>(" + (param0 != null ? "{...}" : "null") + ',' + param1 + ',' + param2 + ')');
        }
    }

    abstract void b(int param0, int param1, int param2);

    private final int a(boolean param0) {
        return !((ul) this).field_F ? 0 : this != (Object) (Object) ((ul) this).field_K.k(0) ? 0 : 256;
    }

    boolean l(int param0) {
        int var2 = 0;
        int var3 = 0;
        int stackIn_10_0 = 0;
        int stackIn_20_0 = 0;
        int stackIn_32_0 = 0;
        int stackIn_41_0 = 0;
        int stackOut_39_0 = 0;
        int stackOut_40_0 = 0;
        int stackOut_30_0 = 0;
        int stackOut_31_0 = 0;
        int stackOut_19_0 = 0;
        int stackOut_18_0 = 0;
        int stackOut_8_0 = 0;
        int stackOut_9_0 = 0;
        if (param0 == 65393) {
          var2 = this.a(true);
          var3 = -((ul) this).field_I + var2;
          if (var3 > 0) {
            L0: {
              ((ul) this).field_I = ((ul) this).field_I + (-1 + var3 + 8) / 8;
              if (0 > var3) {
                ((ul) this).field_I = ((ul) this).field_I + (-16 + var3 - -1) / 16;
                break L0;
              } else {
                break L0;
              }
            }
            L1: {
              L2: {
                if (((ul) this).field_I != 0) {
                  break L2;
                } else {
                  if (var2 != 0) {
                    break L2;
                  } else {
                    if (((ul) this).field_F) {
                      break L2;
                    } else {
                      stackOut_39_0 = 1;
                      stackIn_41_0 = stackOut_39_0;
                      break L1;
                    }
                  }
                }
              }
              stackOut_40_0 = 0;
              stackIn_41_0 = stackOut_40_0;
              break L1;
            }
            return stackIn_41_0 != 0;
          } else {
            L3: {
              if (0 > var3) {
                ((ul) this).field_I = ((ul) this).field_I + (-16 + var3 - -1) / 16;
                break L3;
              } else {
                break L3;
              }
            }
            L4: {
              L5: {
                if (((ul) this).field_I != 0) {
                  break L5;
                } else {
                  if (var2 != 0) {
                    break L5;
                  } else {
                    if (((ul) this).field_F) {
                      break L5;
                    } else {
                      stackOut_30_0 = 1;
                      stackIn_32_0 = stackOut_30_0;
                      break L4;
                    }
                  }
                }
              }
              stackOut_31_0 = 0;
              stackIn_32_0 = stackOut_31_0;
              break L4;
            }
            return stackIn_32_0 != 0;
          }
        } else {
          field_O = false;
          var2 = this.a(true);
          var3 = -((ul) this).field_I + var2;
          if (var3 <= 0) {
            L6: {
              if (0 > var3) {
                ((ul) this).field_I = ((ul) this).field_I + (-16 + var3 - -1) / 16;
                break L6;
              } else {
                break L6;
              }
            }
            if (((ul) this).field_I == 0) {
              if (var2 != 0) {
                return false;
              } else {
                L7: {
                  if (((ul) this).field_F) {
                    stackOut_19_0 = 0;
                    stackIn_20_0 = stackOut_19_0;
                    break L7;
                  } else {
                    stackOut_18_0 = 1;
                    stackIn_20_0 = stackOut_18_0;
                    break L7;
                  }
                }
                return stackIn_20_0 != 0;
              }
            } else {
              return false;
            }
          } else {
            L8: {
              ((ul) this).field_I = ((ul) this).field_I + (-1 + var3 + 8) / 8;
              if (0 > var3) {
                ((ul) this).field_I = ((ul) this).field_I + (-16 + var3 - -1) / 16;
                break L8;
              } else {
                break L8;
              }
            }
            L9: {
              L10: {
                if (((ul) this).field_I != 0) {
                  break L10;
                } else {
                  if (var2 != 0) {
                    break L10;
                  } else {
                    if (((ul) this).field_F) {
                      break L10;
                    } else {
                      stackOut_8_0 = 1;
                      stackIn_10_0 = stackOut_8_0;
                      break L9;
                    }
                  }
                }
              }
              stackOut_9_0 = 0;
              stackIn_10_0 = stackOut_9_0;
              break L9;
            }
            return stackIn_10_0 != 0;
          }
        }
    }

    final ag i(int param0) {
        ag var2 = super.i(param0);
        if (var2 != null) {
            return var2;
        }
        return (ag) this;
    }

    boolean j(int param0) {
        ((ul) this).field_I = this.a(true);
        if (param0 == -15953) {
          if (((ul) this).field_I == 0) {
            if (((ul) this).field_F) {
              return false;
            } else {
              return true;
            }
          } else {
            return false;
          }
        } else {
          return false;
        }
    }

    final void a(int param0, int param1, int param2) {
        ((ul) this).a(param0, -param2 + fb.field_f >> 1, param1 + -15767, -param0 + mm.field_q >> 1, param2);
        if (param1 != 15767) {
            field_G = null;
        }
    }

    final static ca a(boolean param0, String param1, long param2, String param3, int param4) {
        int var6_int = 0;
        RuntimeException var6 = null;
        vk stackIn_5_0 = null;
        la stackIn_7_0 = null;
        uh stackIn_9_0 = null;
        RuntimeException stackIn_11_0 = null;
        StringBuilder stackIn_11_1 = null;
        RuntimeException stackIn_12_0 = null;
        StringBuilder stackIn_12_1 = null;
        RuntimeException stackIn_13_0 = null;
        StringBuilder stackIn_13_1 = null;
        String stackIn_13_2 = null;
        RuntimeException stackIn_14_0 = null;
        StringBuilder stackIn_14_1 = null;
        RuntimeException stackIn_15_0 = null;
        StringBuilder stackIn_15_1 = null;
        RuntimeException stackIn_16_0 = null;
        StringBuilder stackIn_16_1 = null;
        String stackIn_16_2 = null;
        RuntimeException decompiledCaughtException = null;
        la stackOut_6_0 = null;
        uh stackOut_8_0 = null;
        vk stackOut_4_0 = null;
        RuntimeException stackOut_10_0 = null;
        StringBuilder stackOut_10_1 = null;
        RuntimeException stackOut_12_0 = null;
        StringBuilder stackOut_12_1 = null;
        String stackOut_12_2 = null;
        RuntimeException stackOut_11_0 = null;
        StringBuilder stackOut_11_1 = null;
        String stackOut_11_2 = null;
        RuntimeException stackOut_13_0 = null;
        StringBuilder stackOut_13_1 = null;
        RuntimeException stackOut_15_0 = null;
        StringBuilder stackOut_15_1 = null;
        String stackOut_15_2 = null;
        RuntimeException stackOut_14_0 = null;
        StringBuilder stackOut_14_1 = null;
        String stackOut_14_2 = null;
        try {
          L0: {
            L1: {
              var6_int = -6 / ((param4 - -59) / 39);
              if (param2 != 0L) {
                break L1;
              } else {
                if (param1 != null) {
                  stackOut_6_0 = new la(param1, param3);
                  stackIn_7_0 = stackOut_6_0;
                  return (ca) (Object) stackIn_7_0;
                } else {
                  break L1;
                }
              }
            }
            if (!param0) {
              stackOut_8_0 = new uh(param2, param3);
              stackIn_9_0 = stackOut_8_0;
              break L0;
            } else {
              stackOut_4_0 = new vk(param2, param3);
              stackIn_5_0 = stackOut_4_0;
              return (ca) (Object) stackIn_5_0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L2: {
            var6 = decompiledCaughtException;
            stackOut_10_0 = (RuntimeException) var6;
            stackOut_10_1 = new StringBuilder().append("ul.PB(").append(param0).append(',');
            stackIn_12_0 = stackOut_10_0;
            stackIn_12_1 = stackOut_10_1;
            stackIn_11_0 = stackOut_10_0;
            stackIn_11_1 = stackOut_10_1;
            if (param1 == null) {
              stackOut_12_0 = (RuntimeException) (Object) stackIn_12_0;
              stackOut_12_1 = (StringBuilder) (Object) stackIn_12_1;
              stackOut_12_2 = "null";
              stackIn_13_0 = stackOut_12_0;
              stackIn_13_1 = stackOut_12_1;
              stackIn_13_2 = stackOut_12_2;
              break L2;
            } else {
              stackOut_11_0 = (RuntimeException) (Object) stackIn_11_0;
              stackOut_11_1 = (StringBuilder) (Object) stackIn_11_1;
              stackOut_11_2 = "{...}";
              stackIn_13_0 = stackOut_11_0;
              stackIn_13_1 = stackOut_11_1;
              stackIn_13_2 = stackOut_11_2;
              break L2;
            }
          }
          L3: {
            stackOut_13_0 = (RuntimeException) (Object) stackIn_13_0;
            stackOut_13_1 = ((StringBuilder) (Object) stackIn_13_1).append(stackIn_13_2).append(',').append(param2).append(',');
            stackIn_15_0 = stackOut_13_0;
            stackIn_15_1 = stackOut_13_1;
            stackIn_14_0 = stackOut_13_0;
            stackIn_14_1 = stackOut_13_1;
            if (param3 == null) {
              stackOut_15_0 = (RuntimeException) (Object) stackIn_15_0;
              stackOut_15_1 = (StringBuilder) (Object) stackIn_15_1;
              stackOut_15_2 = "null";
              stackIn_16_0 = stackOut_15_0;
              stackIn_16_1 = stackOut_15_1;
              stackIn_16_2 = stackOut_15_2;
              break L3;
            } else {
              stackOut_14_0 = (RuntimeException) (Object) stackIn_14_0;
              stackOut_14_1 = (StringBuilder) (Object) stackIn_14_1;
              stackOut_14_2 = "{...}";
              stackIn_16_0 = stackOut_14_0;
              stackIn_16_1 = stackOut_14_1;
              stackIn_16_2 = stackOut_14_2;
              break L3;
            }
          }
          throw wg.a((Throwable) (Object) stackIn_16_0, stackIn_16_2 + ',' + param4 + ')');
        }
        return (ca) (Object) stackIn_9_0;
    }

    final void a(int param0, int param1, byte param2, int param3) {
        Object var6 = null;
        if (param2 >= 42) {
          if (0 != ((ul) this).field_I) {
            if (((ul) this).field_I >= 256) {
              if (param3 != 0) {
                return;
              } else {
                ((ul) this).b(((ul) this).field_m + param0, -238948511, ((ul) this).field_v + param1);
                super.a(param0, param1, (byte) 49, param3);
                return;
              }
            } else {
              if (q.field_f != null) {
                if (((ul) this).field_s <= q.field_f.field_z) {
                  if (q.field_f.field_A >= ((ul) this).field_x) {
                    sb.a(q.field_f, -119);
                    si.d();
                    ((ul) this).b(0, -238948511, 0);
                    super.a(-((ul) this).field_m + -param0, -((ul) this).field_v + -param1, (byte) 47, param3);
                    eh.b(false);
                    q.field_f.b(param1 - -((ul) this).field_v, param0 - -((ul) this).field_m, ((ul) this).field_I);
                    return;
                  } else {
                    q.field_f = new bd(((ul) this).field_s, ((ul) this).field_x);
                    sb.a(q.field_f, -119);
                    si.d();
                    ((ul) this).b(0, -238948511, 0);
                    super.a(-((ul) this).field_m + -param0, -((ul) this).field_v + -param1, (byte) 47, param3);
                    eh.b(false);
                    q.field_f.b(param1 - -((ul) this).field_v, param0 - -((ul) this).field_m, ((ul) this).field_I);
                    return;
                  }
                } else {
                  q.field_f = new bd(((ul) this).field_s, ((ul) this).field_x);
                  sb.a(q.field_f, -119);
                  si.d();
                  ((ul) this).b(0, -238948511, 0);
                  super.a(-((ul) this).field_m + -param0, -((ul) this).field_v + -param1, (byte) 47, param3);
                  eh.b(false);
                  q.field_f.b(param1 - -((ul) this).field_v, param0 - -((ul) this).field_m, ((ul) this).field_I);
                  return;
                }
              } else {
                q.field_f = new bd(((ul) this).field_s, ((ul) this).field_x);
                sb.a(q.field_f, -119);
                si.d();
                ((ul) this).b(0, -238948511, 0);
                super.a(-((ul) this).field_m + -param0, -((ul) this).field_v + -param1, (byte) 47, param3);
                eh.b(false);
                q.field_f.b(param1 - -((ul) this).field_v, param0 - -((ul) this).field_m, ((ul) this).field_I);
                return;
              }
            }
          } else {
            return;
          }
        } else {
          var6 = null;
          ca discarded$1 = ul.a(true, (String) null, 48L, (String) null, -128);
          if (0 != ((ul) this).field_I) {
            if (((ul) this).field_I >= 256) {
              if (param3 != 0) {
                return;
              } else {
                ((ul) this).b(((ul) this).field_m + param0, -238948511, ((ul) this).field_v + param1);
                super.a(param0, param1, (byte) 49, param3);
                return;
              }
            } else {
              if (q.field_f != null) {
                if (((ul) this).field_s <= q.field_f.field_z) {
                  if (q.field_f.field_A >= ((ul) this).field_x) {
                    sb.a(q.field_f, -119);
                    si.d();
                    ((ul) this).b(0, -238948511, 0);
                    super.a(-((ul) this).field_m + -param0, -((ul) this).field_v + -param1, (byte) 47, param3);
                    eh.b(false);
                    q.field_f.b(param1 - -((ul) this).field_v, param0 - -((ul) this).field_m, ((ul) this).field_I);
                    return;
                  } else {
                    q.field_f = new bd(((ul) this).field_s, ((ul) this).field_x);
                    sb.a(q.field_f, -119);
                    si.d();
                    ((ul) this).b(0, -238948511, 0);
                    super.a(-((ul) this).field_m + -param0, -((ul) this).field_v + -param1, (byte) 47, param3);
                    eh.b(false);
                    q.field_f.b(param1 - -((ul) this).field_v, param0 - -((ul) this).field_m, ((ul) this).field_I);
                    return;
                  }
                } else {
                  q.field_f = new bd(((ul) this).field_s, ((ul) this).field_x);
                  sb.a(q.field_f, -119);
                  si.d();
                  ((ul) this).b(0, -238948511, 0);
                  super.a(-((ul) this).field_m + -param0, -((ul) this).field_v + -param1, (byte) 47, param3);
                  eh.b(false);
                  q.field_f.b(param1 - -((ul) this).field_v, param0 - -((ul) this).field_m, ((ul) this).field_I);
                  return;
                }
              } else {
                q.field_f = new bd(((ul) this).field_s, ((ul) this).field_x);
                sb.a(q.field_f, -119);
                si.d();
                ((ul) this).b(0, -238948511, 0);
                super.a(-((ul) this).field_m + -param0, -((ul) this).field_v + -param1, (byte) 47, param3);
                eh.b(false);
                q.field_f.b(param1 - -((ul) this).field_v, param0 - -((ul) this).field_m, ((ul) this).field_I);
                return;
              }
            }
          } else {
            return;
          }
        }
    }

    final static void e(byte param0) {
        ri.a((byte) 126, true, qi.field_G, fj.field_Sb);
        md.field_i = true;
    }

    public static void k(int param0) {
        field_P = null;
        field_E = null;
        field_J = null;
        if (param0 != -1847325791) {
          field_G = null;
          field_G = null;
          field_M = null;
          return;
        } else {
          field_G = null;
          field_M = null;
          return;
        }
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_M = "Your email address is used to identify this account";
        field_O = false;
    }
}
