/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class no extends en {
    static au field_K;
    static int[] field_U;
    static je field_M;
    static wk field_P;
    static int field_J;
    private fn field_Q;
    static int field_S;
    private fn field_O;
    static je field_T;
    private boolean field_R;
    private fn field_L;
    static String field_N;

    final int l(int param0) {
        int var2 = 0;
        NumberFormatException var3 = null;
        int stackIn_2_0 = 0;
        int stackOut_1_0 = 0;
        int statePc = 0;
        Throwable caughtException = null;
        stateLoop: while (true) {
            switch (statePc) {
                case 0: {
                    var2 = 47 % ((param0 - -30) / 36);
                    statePc = 1;
                    continue stateLoop;
                }
                case 1: {
                    try {
                        stackOut_1_0 = Integer.parseInt(((no) this).field_L.field_v);
                        stackIn_2_0 = stackOut_1_0;
                        statePc = 2;
                        continue stateLoop;
                    } catch (Throwable stateCaught_1) {
                        caughtException = stateCaught_1;
                        statePc = 3;
                        continue stateLoop;
                    }
                }
                case 2: {
                    return stackIn_2_0;
                }
                case 3: {
                    var3 = (NumberFormatException) (Object) caughtException;
                    return -1;
                }
                default: throw new IllegalStateException("invalid CFG state " + statePc);
            }
        }
    }

    final boolean k(int param0) {
        if (null != ((no) this).field_L.field_v) {
          if (0 != ((no) this).field_L.field_v.length()) {
            L0: {
              if (null == ((no) this).field_Q.field_v) {
                break L0;
              } else {
                if (((no) this).field_Q.field_v.length() == 0) {
                  break L0;
                } else {
                  if (param0 == -22339) {
                    L1: {
                      if (null == ((no) this).field_O.field_v) {
                        break L1;
                      } else {
                        if (((no) this).field_O.field_v.length() == 0) {
                          break L1;
                        } else {
                          return false;
                        }
                      }
                    }
                    return true;
                  } else {
                    return false;
                  }
                }
              }
            }
            return true;
          } else {
            return true;
          }
        } else {
          return true;
        }
    }

    private final void a(String param0, kb param1, int param2, int param3, int param4) {
        gl.field_e.c(param0, param4 - (-param1.field_B - (param1.field_l >> 1645072737)), param1.field_p + (param2 - 5), param3, -1);
    }

    no(kh param0, boolean param1, int param2, int param3, int param4, int param5) {
        this(param0, param1);
        ((no) this).a(param2, param4, param3, 8192, param5);
    }

    final static void a(bv param0, uo param1, int param2, int param3) {
        int var4 = 0;
        String var5 = null;
        int var6 = 0;
        int var7 = 0;
        int var8 = 0;
        int var9 = 0;
        var9 = ArmiesOfGielinor.field_M ? 1 : 0;
        var4 = param2 + param0.a(false);
        L0: while (true) {
          if (param0.a(false) >= var4) {
            if (param3 != -24721) {
              field_M = null;
              return;
            } else {
              return;
            }
          } else {
            var5 = mt.a(param0, true);
            var6 = param0.a(false);
            var7 = ej.a(param0, true);
            var8 = param0.a(false) + -var6;
            kq.a(var6, param3 + 489, var8, var7, param0);
            param1.a(var7, param0, var5, (byte) 37);
            ao.a(var6, 4, var8, param0, var7);
            continue L0;
          }
        }
    }

    final void a(byte param0, sb param1) {
        this.a((byte) -108, param1);
        ((no) this).field_L.field_x = (qo) (Object) param1;
        ((no) this).field_Q.field_x = (qo) (Object) param1;
        if (param0 > -21) {
          boolean discarded$2 = ((no) this).k(-25);
          ((no) this).field_O.field_x = (qo) (Object) param1;
          return;
        } else {
          ((no) this).field_O.field_x = (qo) (Object) param1;
          return;
        }
    }

    final int m(int param0) {
        NumberFormatException var2 = null;
        int stackIn_3_0 = 0;
        Throwable decompiledCaughtException = null;
        int stackOut_2_0 = 0;
        if (param0 == -26458) {
          try {
            stackOut_2_0 = Integer.parseInt(((no) this).field_Q.field_v) + -1;
            stackIn_3_0 = stackOut_2_0;
          } catch (java.lang.Exception decompiledCaughtParameter) {
            decompiledCaughtException = decompiledCaughtParameter;
            return stackIn_3_0;
          }
        } else {
          return -46;
        }
        return 0;
    }

    public static void c(boolean param0) {
        field_N = null;
        field_U = null;
        field_P = null;
        field_T = null;
        field_M = null;
        field_K = null;
        if (param0) {
            field_U = null;
        }
    }

    final String h(int param0) {
        String var2 = null;
        String stackIn_7_0 = null;
        String stackOut_6_0 = null;
        String stackOut_5_0 = null;
        var2 = ((no) this).field_Q.h(param0 ^ 0);
        if (var2 == null) {
          if (((no) this).field_t) {
            L0: {
              if (((no) this).field_s != null) {
                stackOut_6_0 = ((no) this).field_s;
                stackIn_7_0 = stackOut_6_0;
                break L0;
              } else {
                stackOut_5_0 = ((no) this).field_v;
                stackIn_7_0 = stackOut_5_0;
                break L0;
              }
            }
            return (String) (Object) stackIn_7_0;
          } else {
            if (param0 == 21384) {
              return null;
            } else {
              field_K = null;
              return null;
            }
          }
        } else {
          return var2;
        }
    }

    final static void b(boolean param0) {
        tf.a((byte) -99, ag.d((byte) -111));
        if (param0) {
            field_N = null;
        }
    }

    final void a(int param0, int param1, byte param2, int param3) {
        this.a(param0, param1, (byte) -84, param3);
        if (0 == param3) {
          if (param2 >= -82) {
            return;
          } else {
            param0 = param0 + ((no) this).field_B;
            param1 = param1 + ((no) this).field_p;
            this.a(mi.field_z, (kb) (Object) ((no) this).field_L, param1, 16777215, param0);
            this.a(eb.field_e, (kb) (Object) ((no) this).field_Q, param1, 16777215, param0);
            this.a(iu.field_l, (kb) (Object) ((no) this).field_O, param1, 16777215, param0);
            return;
          }
        } else {
          return;
        }
    }

    final static String a(char param0, boolean param1, int param2) {
        char[] var3 = null;
        int var4 = 0;
        int var5 = 0;
        char[] var6 = null;
        var5 = ArmiesOfGielinor.field_M ? 1 : 0;
        var6 = new char[param2];
        var3 = var6;
        if (!param1) {
          return null;
        } else {
          var4 = 0;
          L0: while (true) {
            if (param2 <= var4) {
              return new String(var6);
            } else {
              var6[var4] = param0;
              var4++;
              continue L0;
            }
          }
        }
    }

    private no(kh param0, boolean param1) {
        super(0, 0, 0, 0, (kh) null);
        ((no) this).field_L = (fn) (Object) new ma("", (qo) null, 2);
        ((no) this).field_Q = (fn) (Object) new ma("", (qo) null, 2);
        ((no) this).field_O = (fn) (Object) new ma("", (qo) null, 4);
        ((no) this).field_O.field_k = param0;
        ((no) this).field_Q.field_k = param0;
        ((no) this).field_L.field_k = param0;
        ((no) this).field_R = param1 ? true : false;
        if (!((no) this).field_R) {
            ((no) this).a((byte) 10, (kb) (Object) ((no) this).field_L);
            ((no) this).a((byte) 10, (kb) (Object) ((no) this).field_Q);
        } else {
            ((no) this).a((byte) 10, (kb) (Object) ((no) this).field_Q);
            ((no) this).a((byte) 10, (kb) (Object) ((no) this).field_L);
        }
        ((no) this).a((byte) 10, (kb) (Object) ((no) this).field_O);
    }

    final void a(int param0, int param1, int param2, int param3, int param4) {
        int var6 = 0;
        this.a(param0, param1, param2, 8192, param4);
        var6 = param1 + -130 >> -614069727;
        if (!((no) this).field_R) {
          ((no) this).field_L.a(var6, 25, 0, 8192, param4);
          ((no) this).field_Q.a(45 + var6, 25, 0, 8192, param4);
          ((no) this).field_O.a(90 + var6, 40, 0, param3, param4);
          return;
        } else {
          ((no) this).field_Q.a(var6, 25, 0, 8192, param4);
          ((no) this).field_L.a(var6 + 45, 25, 0, 8192, param4);
          ((no) this).field_O.a(90 + var6, 40, 0, param3, param4);
          return;
        }
    }

    final int a(byte param0) {
        NumberFormatException var2 = null;
        int stackIn_3_0 = 0;
        Throwable decompiledCaughtException = null;
        int stackOut_2_0 = 0;
        if (param0 == -77) {
          try {
            stackOut_2_0 = Integer.parseInt(((no) this).field_O.field_v);
            stackIn_3_0 = stackOut_2_0;
          } catch (java.lang.Exception decompiledCaughtParameter) {
            decompiledCaughtException = decompiledCaughtParameter;
            return stackIn_3_0;
          }
        } else {
          return -48;
        }
        return 0;
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_P = new wk(0, 0);
    }
}
