/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class mda extends c implements fo, ffa, gma {
    private int field_i;
    private la field_q;
    private int field_n;
    static jea field_v;
    private int field_k;
    private int field_l;
    private int field_r;
    private int field_t;
    private boolean field_o;
    private int field_u;
    private int field_p;
    private int field_s;
    private int field_j;
    private int field_m;
    private int field_w;

    final static void b(int param0, byte param1) {
        RuntimeException var2 = null;
        int var3 = 0;
        upa var4 = null;
        RuntimeException decompiledCaughtException = null;
        var3 = TombRacer.field_G ? 1 : 0;
        try {
          L0: {
            L1: {
              if (param1 <= -101) {
                break L1;
              } else {
                mda.b(-10, (byte) -8);
                break L1;
              }
            }
            var4 = (upa) (Object) ina.field_d.f(-80);
            L2: while (true) {
              if (var4 == null) {
                break L0;
              } else {
                int discarded$4 = 2147;
                ip.a(var4, param0);
                var4 = (upa) (Object) ina.field_d.e(121);
                continue L2;
              }
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2 = decompiledCaughtException;
          throw tba.a((Throwable) (Object) var2, "mda.S(" + param0 + 44 + param1 + 41);
        }
    }

    public final boolean d(byte param0) {
        if (param0 != 48) {
            return true;
        }
        return ((mda) this).field_o;
    }

    private final void a(int param0, int param1, int param2, la param3, int param4) {
        try {
            ((mda) this).field_o = false;
            ((mda) this).field_q = param3;
            ((mda) this).field_l = param4 * 2;
            ((mda) this).field_m = 0;
            ((mda) this).field_n = param2;
            ((mda) this).field_s = param0;
            ((mda) this).field_i = iia.d(2, 786432, 2);
            ((mda) this).field_t = 0;
            ((mda) this).field_k = ((mda) this).field_l;
            int discarded$0 = 0;
            this.s();
        } catch (RuntimeException runtimeException) {
            throw tba.a((Throwable) (Object) runtimeException, "mda.R(" + param0 + 44 + 1 + 44 + param2 + 44 + (param3 != null ? "{...}" : "null") + 44 + param4 + 44 + 2 + 41);
        }
    }

    private final int a(int param0, int param1, int param2, int param3, int param4) {
        int var6 = 0;
        if (((mda) this).field_s != 1) {
          return 0;
        } else {
          var6 = 80 / ((-23 - param1) / 56);
          return ((mda) this).field_q.a((ffa) this, (gma) this, 1, ((mda) this).field_k, param3, 12, ((mda) this).field_k, ((mda) this).field_p, param4, param0, ((mda) this).field_j, param2, true);
        }
    }

    public final boolean a(int param0, gma param1, int param2, pc param3) {
        int var5_int = 0;
        RuntimeException var5 = null;
        int var6 = 0;
        int stackIn_3_0 = 0;
        int stackIn_9_0 = 0;
        int stackIn_11_0 = 0;
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
        RuntimeException decompiledCaughtException = null;
        int stackOut_2_0 = 0;
        int stackOut_8_0 = 0;
        int stackOut_10_0 = 0;
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
        try {
          L0: {
            if (((mda) this).field_s != 1) {
              stackOut_2_0 = 0;
              stackIn_3_0 = stackOut_2_0;
              return stackIn_3_0 != 0;
            } else {
              L1: {
                if (param0 == -1) {
                  break L1;
                } else {
                  ((mda) this).field_i = 97;
                  break L1;
                }
              }
              int discarded$2 = 2;
              var5_int = eha.a(((mda) this).field_k, 12, ((mda) this).field_j, ((mda) this).field_k, param3, ((mda) this).field_p);
              if (var5_int == -1) {
                stackOut_8_0 = 0;
                stackIn_9_0 = stackOut_8_0;
                return stackIn_9_0 != 0;
              } else {
                var6 = wm.a(4096, var5_int, 108);
                param3.a(var6, (byte) 47);
                stackOut_10_0 = 1;
                stackIn_11_0 = stackOut_10_0;
                break L0;
              }
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L2: {
            var5 = decompiledCaughtException;
            stackOut_12_0 = (RuntimeException) var5;
            stackOut_12_1 = new StringBuilder().append("mda.C(").append(param0).append(44);
            stackIn_14_0 = stackOut_12_0;
            stackIn_14_1 = stackOut_12_1;
            stackIn_13_0 = stackOut_12_0;
            stackIn_13_1 = stackOut_12_1;
            if (param1 == null) {
              stackOut_14_0 = (RuntimeException) (Object) stackIn_14_0;
              stackOut_14_1 = (StringBuilder) (Object) stackIn_14_1;
              stackOut_14_2 = "null";
              stackIn_15_0 = stackOut_14_0;
              stackIn_15_1 = stackOut_14_1;
              stackIn_15_2 = stackOut_14_2;
              break L2;
            } else {
              stackOut_13_0 = (RuntimeException) (Object) stackIn_13_0;
              stackOut_13_1 = (StringBuilder) (Object) stackIn_13_1;
              stackOut_13_2 = "{...}";
              stackIn_15_0 = stackOut_13_0;
              stackIn_15_1 = stackOut_13_1;
              stackIn_15_2 = stackOut_13_2;
              break L2;
            }
          }
          L3: {
            stackOut_15_0 = (RuntimeException) (Object) stackIn_15_0;
            stackOut_15_1 = ((StringBuilder) (Object) stackIn_15_1).append(stackIn_15_2).append(44).append(param2).append(44);
            stackIn_17_0 = stackOut_15_0;
            stackIn_17_1 = stackOut_15_1;
            stackIn_16_0 = stackOut_15_0;
            stackIn_16_1 = stackOut_15_1;
            if (param3 == null) {
              stackOut_17_0 = (RuntimeException) (Object) stackIn_17_0;
              stackOut_17_1 = (StringBuilder) (Object) stackIn_17_1;
              stackOut_17_2 = "null";
              stackIn_18_0 = stackOut_17_0;
              stackIn_18_1 = stackOut_17_1;
              stackIn_18_2 = stackOut_17_2;
              break L3;
            } else {
              stackOut_16_0 = (RuntimeException) (Object) stackIn_16_0;
              stackOut_16_1 = (StringBuilder) (Object) stackIn_16_1;
              stackOut_16_2 = "{...}";
              stackIn_18_0 = stackOut_16_0;
              stackIn_18_1 = stackOut_16_1;
              stackIn_18_2 = stackOut_16_2;
              break L3;
            }
          }
          throw tba.a((Throwable) (Object) stackIn_18_0, stackIn_18_2 + 41);
        }
        return stackIn_11_0 != 0;
    }

    final void a(la param0, int param1) {
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
              ((mda) this).field_p = param0.a(((mda) this).field_p, (byte) 71);
              if (param1 < -16) {
                break L1;
              } else {
                boolean discarded$2 = mda.b(-115, (byte) 124, 61, -21);
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
            stackOut_3_1 = new StringBuilder().append("mda.MA(");
            stackIn_5_0 = stackOut_3_0;
            stackIn_5_1 = stackOut_3_1;
            stackIn_4_0 = stackOut_3_0;
            stackIn_4_1 = stackOut_3_1;
            if (param0 == null) {
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
          throw tba.a((Throwable) (Object) stackIn_6_0, stackIn_6_2 + 44 + param1 + 41);
        }
    }

    public final int b(int param0) {
        int var2 = 0;
        var2 = -50 % ((param0 - 1) / 45);
        if (((mda) this).field_s == 1) {
          return ((mda) this).field_k >> 17;
        } else {
          return 0;
        }
    }

    public final int d(int param0) {
        if (param0 != 3) {
            return -56;
        }
        return ((mda) this).field_p;
    }

    final void a(uw param0, int param1) {
        try {
            if (param1 != 5465) {
                ((mda) this).field_m = -24;
            }
            param0.a((byte) 111, 6, (fo) this);
        } catch (RuntimeException runtimeException) {
            throw tba.a((Throwable) (Object) runtimeException, "mda.AA(" + (param0 != null ? "{...}" : "null") + 44 + param1 + 41);
        }
    }

    public final int a(up param0, int param1, pc param2) {
        RuntimeException var4 = null;
        int stackIn_3_0 = 0;
        int stackIn_5_0 = 0;
        RuntimeException stackIn_7_0 = null;
        StringBuilder stackIn_7_1 = null;
        RuntimeException stackIn_8_0 = null;
        StringBuilder stackIn_8_1 = null;
        RuntimeException stackIn_9_0 = null;
        StringBuilder stackIn_9_1 = null;
        String stackIn_9_2 = null;
        RuntimeException stackIn_10_0 = null;
        StringBuilder stackIn_10_1 = null;
        RuntimeException stackIn_11_0 = null;
        StringBuilder stackIn_11_1 = null;
        RuntimeException stackIn_12_0 = null;
        StringBuilder stackIn_12_1 = null;
        String stackIn_12_2 = null;
        RuntimeException decompiledCaughtException = null;
        int stackOut_2_0 = 0;
        int stackOut_4_0 = 0;
        RuntimeException stackOut_6_0 = null;
        StringBuilder stackOut_6_1 = null;
        RuntimeException stackOut_8_0 = null;
        StringBuilder stackOut_8_1 = null;
        String stackOut_8_2 = null;
        RuntimeException stackOut_7_0 = null;
        StringBuilder stackOut_7_1 = null;
        String stackOut_7_2 = null;
        RuntimeException stackOut_9_0 = null;
        StringBuilder stackOut_9_1 = null;
        RuntimeException stackOut_11_0 = null;
        StringBuilder stackOut_11_1 = null;
        String stackOut_11_2 = null;
        RuntimeException stackOut_10_0 = null;
        StringBuilder stackOut_10_1 = null;
        String stackOut_10_2 = null;
        try {
          L0: {
            int discarded$28 = 2;
            if (eha.a(((mda) this).field_k, param1, ((mda) this).field_j, ((mda) this).field_k, param2, ((mda) this).field_p) < 0) {
              stackOut_2_0 = 0;
              stackIn_3_0 = stackOut_2_0;
              return stackIn_3_0;
            } else {
              int discarded$29 = -6;
              stackOut_4_0 = this.a(param0);
              stackIn_5_0 = stackOut_4_0;
              break L0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L1: {
            var4 = decompiledCaughtException;
            stackOut_6_0 = (RuntimeException) var4;
            stackOut_6_1 = new StringBuilder().append("mda.ED(");
            stackIn_8_0 = stackOut_6_0;
            stackIn_8_1 = stackOut_6_1;
            stackIn_7_0 = stackOut_6_0;
            stackIn_7_1 = stackOut_6_1;
            if (param0 == null) {
              stackOut_8_0 = (RuntimeException) (Object) stackIn_8_0;
              stackOut_8_1 = (StringBuilder) (Object) stackIn_8_1;
              stackOut_8_2 = "null";
              stackIn_9_0 = stackOut_8_0;
              stackIn_9_1 = stackOut_8_1;
              stackIn_9_2 = stackOut_8_2;
              break L1;
            } else {
              stackOut_7_0 = (RuntimeException) (Object) stackIn_7_0;
              stackOut_7_1 = (StringBuilder) (Object) stackIn_7_1;
              stackOut_7_2 = "{...}";
              stackIn_9_0 = stackOut_7_0;
              stackIn_9_1 = stackOut_7_1;
              stackIn_9_2 = stackOut_7_2;
              break L1;
            }
          }
          L2: {
            stackOut_9_0 = (RuntimeException) (Object) stackIn_9_0;
            stackOut_9_1 = ((StringBuilder) (Object) stackIn_9_1).append(stackIn_9_2).append(44).append(param1).append(44);
            stackIn_11_0 = stackOut_9_0;
            stackIn_11_1 = stackOut_9_1;
            stackIn_10_0 = stackOut_9_0;
            stackIn_10_1 = stackOut_9_1;
            if (param2 == null) {
              stackOut_11_0 = (RuntimeException) (Object) stackIn_11_0;
              stackOut_11_1 = (StringBuilder) (Object) stackIn_11_1;
              stackOut_11_2 = "null";
              stackIn_12_0 = stackOut_11_0;
              stackIn_12_1 = stackOut_11_1;
              stackIn_12_2 = stackOut_11_2;
              break L2;
            } else {
              stackOut_10_0 = (RuntimeException) (Object) stackIn_10_0;
              stackOut_10_1 = (StringBuilder) (Object) stackIn_10_1;
              stackOut_10_2 = "{...}";
              stackIn_12_0 = stackOut_10_0;
              stackIn_12_1 = stackOut_10_1;
              stackIn_12_2 = stackOut_10_2;
              break L2;
            }
          }
          throw tba.a((Throwable) (Object) stackIn_12_0, stackIn_12_2 + 41);
        }
        return stackIn_5_0;
    }

    public final boolean a(byte param0, boolean param1) {
        int stackIn_7_0 = 0;
        int stackOut_5_0 = 0;
        int stackOut_6_0 = 0;
        if (param0 == -55) {
          L0: {
            if (((mda) this).field_s == 1) {
              stackOut_5_0 = 1;
              stackIn_7_0 = stackOut_5_0;
              break L0;
            } else {
              if (!param1) {
                stackOut_6_0 = 0;
                stackIn_7_0 = stackOut_6_0;
                break L0;
              } else {
                return true;
              }
            }
          }
          return stackIn_7_0 != 0;
        } else {
          return true;
        }
    }

    public final boolean a(int param0, gma param1, int param2, int param3, int param4, ffa param5, int param6, int param7) {
        RuntimeException var9 = null;
        int stackIn_3_0 = 0;
        int stackIn_6_0 = 0;
        int stackIn_8_0 = 0;
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
        RuntimeException decompiledCaughtException = null;
        int stackOut_2_0 = 0;
        int stackOut_7_0 = 0;
        int stackOut_5_0 = 0;
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
        try {
          L0: {
            L1: {
              if (1 != ((mda) this).field_s) {
                break L1;
              } else {
                if (!((mda) this).a((byte) 110, param4, param6, param0, param3)) {
                  break L1;
                } else {
                  stackOut_2_0 = 1;
                  stackIn_3_0 = stackOut_2_0;
                  return stackIn_3_0 != 0;
                }
              }
            }
            if (param2 >= 55) {
              stackOut_7_0 = 0;
              stackIn_8_0 = stackOut_7_0;
              break L0;
            } else {
              stackOut_5_0 = 0;
              stackIn_6_0 = stackOut_5_0;
              return stackIn_6_0 != 0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L2: {
            var9 = decompiledCaughtException;
            stackOut_9_0 = (RuntimeException) var9;
            stackOut_9_1 = new StringBuilder().append("mda.IC(").append(param0).append(44);
            stackIn_11_0 = stackOut_9_0;
            stackIn_11_1 = stackOut_9_1;
            stackIn_10_0 = stackOut_9_0;
            stackIn_10_1 = stackOut_9_1;
            if (param1 == null) {
              stackOut_11_0 = (RuntimeException) (Object) stackIn_11_0;
              stackOut_11_1 = (StringBuilder) (Object) stackIn_11_1;
              stackOut_11_2 = "null";
              stackIn_12_0 = stackOut_11_0;
              stackIn_12_1 = stackOut_11_1;
              stackIn_12_2 = stackOut_11_2;
              break L2;
            } else {
              stackOut_10_0 = (RuntimeException) (Object) stackIn_10_0;
              stackOut_10_1 = (StringBuilder) (Object) stackIn_10_1;
              stackOut_10_2 = "{...}";
              stackIn_12_0 = stackOut_10_0;
              stackIn_12_1 = stackOut_10_1;
              stackIn_12_2 = stackOut_10_2;
              break L2;
            }
          }
          L3: {
            stackOut_12_0 = (RuntimeException) (Object) stackIn_12_0;
            stackOut_12_1 = ((StringBuilder) (Object) stackIn_12_1).append(stackIn_12_2).append(44).append(param2).append(44).append(param3).append(44).append(param4).append(44);
            stackIn_14_0 = stackOut_12_0;
            stackIn_14_1 = stackOut_12_1;
            stackIn_13_0 = stackOut_12_0;
            stackIn_13_1 = stackOut_12_1;
            if (param5 == null) {
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
          throw tba.a((Throwable) (Object) stackIn_15_0, stackIn_15_2 + 44 + param6 + 44 + param7 + 41);
        }
        return stackIn_8_0 != 0;
    }

    private final boolean a(gma param0) {
        return ((mda) this).field_s == 1;
    }

    public final int a(up param0, ep param1, int param2) {
        int var4_int = 0;
        RuntimeException var4 = null;
        int stackIn_3_0 = 0;
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
        int stackOut_2_0 = 0;
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
        try {
          L0: {
            L1: {
              var4_int = param1.i(-1);
              if (param2 < -97) {
                break L1;
              } else {
                ((mda) this).field_q = null;
                break L1;
              }
            }
            stackOut_2_0 = ((mda) this).a(param0, var4_int, param1.d(3), 0, param1.e(9648), var4_int);
            stackIn_3_0 = stackOut_2_0;
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L2: {
            var4 = decompiledCaughtException;
            stackOut_4_0 = (RuntimeException) var4;
            stackOut_4_1 = new StringBuilder().append("mda.SD(");
            stackIn_6_0 = stackOut_4_0;
            stackIn_6_1 = stackOut_4_1;
            stackIn_5_0 = stackOut_4_0;
            stackIn_5_1 = stackOut_4_1;
            if (param0 == null) {
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
            stackOut_7_1 = ((StringBuilder) (Object) stackIn_7_1).append(stackIn_7_2).append(44);
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
          throw tba.a((Throwable) (Object) stackIn_10_0, stackIn_10_2 + 44 + param2 + 41);
        }
        return stackIn_3_0;
    }

    public final int b(byte param0) {
        int var2 = 12 % ((param0 - -23) / 53);
        return ((mda) this).field_p;
    }

    public final int e(byte param0) {
        if (param0 > -86) {
            return 2;
        }
        return 0;
    }

    public final int g(byte param0) {
        if (param0 != 115) {
            la discarded$0 = ((mda) this).f((byte) -93);
            return 0;
        }
        return 0;
    }

    final void a(int param0, byte param1, int param2, int param3) {
        Object var6 = null;
        if (param1 != -78) {
          var6 = null;
          int discarded$2 = ((mda) this).a((up) null, (ep) null, -22);
          ((mda) this).field_j = param2;
          ((mda) this).field_p = param0;
          return;
        } else {
          ((mda) this).field_j = param2;
          ((mda) this).field_p = param0;
          return;
        }
    }

    final static boolean b(int param0, byte param1, int param2, int param3) {
        if (!fua.field_g) {
          if (vo.field_b) {
            return mj.c(param1 + 2097196, param0, param3);
          } else {
            if (!dfa.a(param0, false, param3)) {
              if (ok.field_s) {
                return false;
              } else {
                if (param1 != -44) {
                  mda.j((byte) -121);
                  return eqa.a(param2, true, param0);
                } else {
                  return eqa.a(param2, true, param0);
                }
              }
            } else {
              return true;
            }
          }
        } else {
          return apa.field_c.a((byte) -121, fna.field_h, kda.field_td);
        }
    }

    public final int e(int param0) {
        Object var3 = null;
        if (param0 != 9648) {
          var3 = null;
          boolean discarded$2 = ((mda) this).a(-103, (gma) null, -104, -49, -55, (ffa) null, -28, -39);
          return ((mda) this).field_j;
        } else {
          return ((mda) this).field_j;
        }
    }

    public final int c(byte param0) {
        if (param0 <= 91) {
            ((mda) this).field_r = 45;
            return ((mda) this).field_j;
        }
        return ((mda) this).field_j;
    }

    public final int g(int param0) {
        if (param0 != -25787) {
            ((mda) this).field_j = 118;
            return 0;
        }
        return 0;
    }

    private final int a(up param0) {
        RuntimeException var3 = null;
        int var3_int = 0;
        int var4 = 0;
        int stackIn_16_0 = 0;
        RuntimeException stackIn_18_0 = null;
        StringBuilder stackIn_18_1 = null;
        RuntimeException stackIn_19_0 = null;
        StringBuilder stackIn_19_1 = null;
        RuntimeException stackIn_20_0 = null;
        StringBuilder stackIn_20_1 = null;
        String stackIn_20_2 = null;
        RuntimeException decompiledCaughtException = null;
        int stackOut_15_0 = 0;
        RuntimeException stackOut_17_0 = null;
        StringBuilder stackOut_17_1 = null;
        RuntimeException stackOut_19_0 = null;
        StringBuilder stackOut_19_1 = null;
        String stackOut_19_2 = null;
        RuntimeException stackOut_18_0 = null;
        StringBuilder stackOut_18_1 = null;
        String stackOut_18_2 = null;
        var4 = TombRacer.field_G ? 1 : 0;
        try {
          L0: {
            var3_int = 0;
            L1: {
              if (0 == ((mda) this).field_s) {
                if (param0.field_j == 3) {
                  ((mda) this).field_m = ((mda) this).field_m + 25;
                  break L1;
                } else {
                  if (param0.field_j != 5) {
                    break L1;
                  } else {
                    this.i((byte) -127);
                    boolean discarded$2 = ((mda) this).field_q.b(30097, ((mda) this).field_k / 2, 1, ((mda) this).field_j, ((mda) this).field_p);
                    var3_int = param0.field_b;
                    break L1;
                  }
                }
              } else {
                if (((mda) this).field_s != 1) {
                  break L1;
                } else {
                  if (param0.field_j == 3) {
                    this.i((byte) -126);
                    boolean discarded$3 = ((mda) this).field_q.b(30097, ((mda) this).field_k / 2, 0, ((mda) this).field_j, ((mda) this).field_p);
                    var3_int = param0.field_b;
                    break L1;
                  } else {
                    if (param0.field_j != 5) {
                      if (param0.field_j != 0) {
                        break L1;
                      } else {
                        ((mda) this).field_k = ((mda) this).field_k - 262144;
                        this.n(786432);
                        var3_int = param0.field_b;
                        break L1;
                      }
                    } else {
                      break L1;
                    }
                  }
                }
              }
            }
            stackOut_15_0 = var3_int;
            stackIn_16_0 = stackOut_15_0;
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L2: {
            var3 = decompiledCaughtException;
            stackOut_17_0 = (RuntimeException) var3;
            stackOut_17_1 = new StringBuilder().append("mda.K(");
            stackIn_19_0 = stackOut_17_0;
            stackIn_19_1 = stackOut_17_1;
            stackIn_18_0 = stackOut_17_0;
            stackIn_18_1 = stackOut_17_1;
            if (param0 == null) {
              stackOut_19_0 = (RuntimeException) (Object) stackIn_19_0;
              stackOut_19_1 = (StringBuilder) (Object) stackIn_19_1;
              stackOut_19_2 = "null";
              stackIn_20_0 = stackOut_19_0;
              stackIn_20_1 = stackOut_19_1;
              stackIn_20_2 = stackOut_19_2;
              break L2;
            } else {
              stackOut_18_0 = (RuntimeException) (Object) stackIn_18_0;
              stackOut_18_1 = (StringBuilder) (Object) stackIn_18_1;
              stackOut_18_2 = "{...}";
              stackIn_20_0 = stackOut_18_0;
              stackIn_20_1 = stackOut_18_1;
              stackIn_20_2 = stackOut_18_2;
              break L2;
            }
          }
          throw tba.a((Throwable) (Object) stackIn_20_0, stackIn_20_2 + 44 + -6 + 41);
        }
        return stackIn_16_0;
    }

    private final void i(byte param0) {
        ((mda) this).field_o = true;
        if (param0 > -120) {
            return;
        }
        ((mda) this).field_q.field_u.a((ffa) this, (byte) 82);
    }

    public final int a(boolean param0) {
        if (!param0) {
            return 18;
        }
        return 11 * (1 + ((mda) this).field_w);
    }

    public static void j(byte param0) {
        if (param0 != 87) {
            boolean discarded$0 = mda.b(-56, (byte) 104, -90, 106);
            field_v = null;
            return;
        }
        field_v = null;
    }

    public final boolean a(int param0, boolean param1, int param2, int param3, int param4, int param5) {
        int stackIn_17_0 = 0;
        int stackIn_25_0 = 0;
        int stackIn_31_0 = 0;
        int stackOut_29_0 = 0;
        int stackOut_23_0 = 0;
        int stackOut_24_0 = 0;
        int stackOut_30_0 = 0;
        int stackOut_16_0 = 0;
        int stackOut_15_0 = 0;
        if (param0 > 68) {
          L0: {
            L1: {
              if (!((mda) this).a((byte) -55, param1)) {
                break L1;
              } else {
                if (param4 != 0) {
                  int discarded$4 = 0;
                  this.s();
                  this.a(param3, (byte) -36, param2, param4, param5);
                  if (~(((mda) this).field_u - -param4) != ~((mda) this).field_p) {
                    break L1;
                  } else {
                    if (~((mda) this).field_j != ~(((mda) this).field_r - -param3)) {
                      break L1;
                    } else {
                      stackOut_29_0 = 1;
                      stackIn_31_0 = stackOut_29_0;
                      break L0;
                    }
                  }
                } else {
                  if (param3 == 0) {
                    return true;
                  } else {
                    L2: {
                      L3: {
                        int discarded$5 = 0;
                        this.s();
                        this.a(param3, (byte) -36, param2, param4, param5);
                        if (~(((mda) this).field_u - -param4) != ~((mda) this).field_p) {
                          break L3;
                        } else {
                          if (~((mda) this).field_j != ~(((mda) this).field_r - -param3)) {
                            break L3;
                          } else {
                            stackOut_23_0 = 1;
                            stackIn_25_0 = stackOut_23_0;
                            break L2;
                          }
                        }
                      }
                      stackOut_24_0 = 0;
                      stackIn_25_0 = stackOut_24_0;
                      break L2;
                    }
                    return stackIn_25_0 != 0;
                  }
                }
              }
            }
            stackOut_30_0 = 0;
            stackIn_31_0 = stackOut_30_0;
            break L0;
          }
          return stackIn_31_0 != 0;
        } else {
          ((mda) this).field_t = -15;
          if (((mda) this).a((byte) -55, param1)) {
            if (param4 == 0) {
              if (param3 == 0) {
                return true;
              } else {
                int discarded$6 = 0;
                this.s();
                this.a(param3, (byte) -36, param2, param4, param5);
                if (~(((mda) this).field_u - -param4) == ~((mda) this).field_p) {
                  L4: {
                    if (~((mda) this).field_j != ~(((mda) this).field_r - -param3)) {
                      stackOut_16_0 = 0;
                      stackIn_17_0 = stackOut_16_0;
                      break L4;
                    } else {
                      stackOut_15_0 = 1;
                      stackIn_17_0 = stackOut_15_0;
                      break L4;
                    }
                  }
                  return stackIn_17_0 != 0;
                } else {
                  return false;
                }
              }
            } else {
              int discarded$7 = 0;
              this.s();
              this.a(param3, (byte) -36, param2, param4, param5);
              if (~(((mda) this).field_u - -param4) == ~((mda) this).field_p) {
                if (~((mda) this).field_j == ~(((mda) this).field_r - -param3)) {
                  return true;
                } else {
                  return false;
                }
              } else {
                return false;
              }
            }
          } else {
            return false;
          }
        }
    }

    public final boolean a(byte param0, int param1, int param2, int param3, int param4) {
        if (param0 != 110) {
          ((mda) this).f(-11);
          return io.a(param4, ((mda) this).field_j, (byte) -70, param3, ((mda) this).field_p, param1, ((mda) this).field_k, ((mda) this).field_k, param2);
        } else {
          return io.a(param4, ((mda) this).field_j, (byte) -70, param3, ((mda) this).field_p, param1, ((mda) this).field_k, ((mda) this).field_k, param2);
        }
    }

    public final int i(int param0) {
        if (param0 <= 90) {
            boolean discarded$0 = mda.b(122, (byte) -32, 39, 92);
            return ((mda) this).field_u;
        }
        return ((mda) this).field_u;
    }

    public final boolean l(int param0) {
        if (param0 != 0) {
            return false;
        }
        return false;
    }

    public final void a(int param0, iq param1) {
        try {
            if (param0 <= 103) {
                int discarded$0 = ((mda) this).b(-91);
            }
            dea.field_a.a((mda) this, 95, param1);
        } catch (RuntimeException runtimeException) {
            throw tba.a((Throwable) (Object) runtimeException, "mda.DB(" + param0 + 44 + (param1 != null ? "{...}" : "null") + 41);
        }
    }

    private final void a(int param0, byte param1, int param2, int param3, int param4) {
        int var6 = 0;
        if (1 == ((mda) this).field_s) {
          L0: {
            int discarded$1 = 0;
            this.s();
            var6 = 0;
            if (param3 != 0) {
              var6 = 1;
              ((mda) this).field_p = ((mda) this).field_p + param3;
              break L0;
            } else {
              break L0;
            }
          }
          if (var6 != 0) {
            if (2 == this.a(((mda) this).field_p + -((mda) this).field_u, -104, param4, 0, param2)) {
              L1: {
                ((mda) this).field_p = ((mda) this).field_u;
                var6 = 0;
                if (0 != param0) {
                  ((mda) this).field_j = ((mda) this).field_j + param0;
                  var6 = 1;
                  break L1;
                } else {
                  break L1;
                }
              }
              L2: {
                if (var6 == 0) {
                  break L2;
                } else {
                  if (this.a(0, -103, param4, ((mda) this).e(9648) - ((mda) this).field_r, param2) == 2) {
                    ((mda) this).field_j = ((mda) this).field_r;
                    break L2;
                  } else {
                    if (((mda) this).field_j == ((mda) this).field_r) {
                      if (((mda) this).field_p != ((mda) this).field_u) {
                        ((mda) this).field_q.field_u.a((ffa) this, -123);
                        ((mda) this).field_q.field_u.b((ffa) this, 7073);
                        return;
                      } else {
                        return;
                      }
                    } else {
                      ((mda) this).field_q.field_u.a((ffa) this, -123);
                      ((mda) this).field_q.field_u.b((ffa) this, 7073);
                      return;
                    }
                  }
                }
              }
              if (((mda) this).field_j == ((mda) this).field_r) {
                if (((mda) this).field_p != ((mda) this).field_u) {
                  ((mda) this).field_q.field_u.a((ffa) this, -123);
                  ((mda) this).field_q.field_u.b((ffa) this, 7073);
                  return;
                } else {
                  return;
                }
              } else {
                ((mda) this).field_q.field_u.a((ffa) this, -123);
                ((mda) this).field_q.field_u.b((ffa) this, 7073);
                return;
              }
            } else {
              L3: {
                var6 = 0;
                if (0 != param0) {
                  ((mda) this).field_j = ((mda) this).field_j + param0;
                  var6 = 1;
                  break L3;
                } else {
                  break L3;
                }
              }
              L4: {
                if (var6 == 0) {
                  break L4;
                } else {
                  if (this.a(0, -103, param4, ((mda) this).e(9648) - ((mda) this).field_r, param2) == 2) {
                    ((mda) this).field_j = ((mda) this).field_r;
                    break L4;
                  } else {
                    if (((mda) this).field_j == ((mda) this).field_r) {
                      if (((mda) this).field_p == ((mda) this).field_u) {
                        return;
                      } else {
                        ((mda) this).field_q.field_u.a((ffa) this, -123);
                        ((mda) this).field_q.field_u.b((ffa) this, 7073);
                        return;
                      }
                    } else {
                      ((mda) this).field_q.field_u.a((ffa) this, -123);
                      ((mda) this).field_q.field_u.b((ffa) this, 7073);
                      return;
                    }
                  }
                }
              }
              if (((mda) this).field_j == ((mda) this).field_r) {
                if (((mda) this).field_p == ((mda) this).field_u) {
                  return;
                } else {
                  ((mda) this).field_q.field_u.a((ffa) this, -123);
                  ((mda) this).field_q.field_u.b((ffa) this, 7073);
                  return;
                }
              } else {
                ((mda) this).field_q.field_u.a((ffa) this, -123);
                ((mda) this).field_q.field_u.b((ffa) this, 7073);
                return;
              }
            }
          } else {
            L5: {
              var6 = 0;
              if (0 != param0) {
                ((mda) this).field_j = ((mda) this).field_j + param0;
                var6 = 1;
                break L5;
              } else {
                break L5;
              }
            }
            L6: {
              if (var6 == 0) {
                break L6;
              } else {
                if (this.a(0, -103, param4, ((mda) this).e(9648) - ((mda) this).field_r, param2) == 2) {
                  ((mda) this).field_j = ((mda) this).field_r;
                  break L6;
                } else {
                  if (((mda) this).field_j == ((mda) this).field_r) {
                    if (((mda) this).field_p == ((mda) this).field_u) {
                      return;
                    } else {
                      ((mda) this).field_q.field_u.a((ffa) this, -123);
                      ((mda) this).field_q.field_u.b((ffa) this, 7073);
                      return;
                    }
                  } else {
                    ((mda) this).field_q.field_u.a((ffa) this, -123);
                    ((mda) this).field_q.field_u.b((ffa) this, 7073);
                    return;
                  }
                }
              }
            }
            if (((mda) this).field_j == ((mda) this).field_r) {
              if (((mda) this).field_p == ((mda) this).field_u) {
                return;
              } else {
                ((mda) this).field_q.field_u.a((ffa) this, -123);
                ((mda) this).field_q.field_u.b((ffa) this, 7073);
                return;
              }
            } else {
              ((mda) this).field_q.field_u.a((ffa) this, -123);
              ((mda) this).field_q.field_u.b((ffa) this, 7073);
              return;
            }
          }
        } else {
          return;
        }
    }

    final int r(int param0) {
        int var2 = -27 % ((param0 - 55) / 55);
        return ((mda) this).field_s;
    }

    public final int a(byte param0) {
        if (param0 != 55) {
            return -104;
        }
        return ((mda) this).field_k;
    }

    private final void s() {
        ((mda) this).field_u = ((mda) this).field_p;
        ((mda) this).field_r = ((mda) this).field_j;
    }

    public final la f(byte param0) {
        int var2 = 38 / (param0 / 61);
        return ((mda) this).field_q;
    }

    final void a(la param0, int param1, int param2, int param3, int param4, int param5) {
        qea var7 = null;
        int var8 = 0;
        try {
            var7 = param0.q(-79);
            if (param4 == 0) {
                var8 = 200 - -var7.a(100, 0);
            } else {
                var8 = 0;
            }
            if (param2 <= 36) {
                ((mda) this).field_t = -51;
            }
            int discarded$0 = 2;
            this.a(param4, 1, var8, param0, param5);
        } catch (RuntimeException runtimeException) {
            throw tba.a((Throwable) (Object) runtimeException, "mda.CA(" + (param0 != null ? "{...}" : "null") + 44 + param1 + 44 + param2 + 44 + param3 + 44 + param4 + 44 + param5 + 41);
        }
    }

    final int t(int param0) {
        if (param0 != 1) {
            ((mda) this).field_m = -125;
            return ((mda) this).field_k;
        }
        return ((mda) this).field_k;
    }

    final void h(byte param0) {
        ((mda) this).field_k = ((mda) this).field_l;
        if (param0 != -1) {
          int discarded$2 = ((mda) this).c((byte) 100);
          ((mda) this).field_m = 0;
          return;
        } else {
          ((mda) this).field_m = 0;
          return;
        }
    }

    public final boolean a(int param0) {
        int var2 = 7 % ((param0 - 6) / 46);
        return 1 == ((mda) this).field_s ? true : false;
    }

    final c d(boolean param0) {
        if (!param0) {
            int discarded$0 = ((mda) this).k(117);
            return (c) (Object) new mda();
        }
        return (c) (Object) new mda();
    }

    private final void n(int param0) {
        if (param0 > ((mda) this).field_k) {
            this.i((byte) -121);
        }
    }

    public final boolean h(int param0) {
        if (param0 != 18407) {
            return true;
        }
        return ((mda) this).field_o;
    }

    public final int a(boolean param0, int param1, int param2, int param3, int param4, int param5) {
        if (!param0) {
            return 75;
        }
        return 0;
    }

    final void a(int param0, boolean param1) {
        float var3 = 0.0f;
        hca var5 = null;
        hca var6 = null;
        hca var7 = null;
        if (!((mda) this).field_o) {
          if (!param1) {
            L0: {
              if (((mda) this).field_t > 0) {
                ((mda) this).field_t = ((mda) this).field_t - 1;
                break L0;
              } else {
                if (((mda) this).field_n <= 0) {
                  break L0;
                } else {
                  ((mda) this).field_m = ((mda) this).field_m + 1;
                  if (((mda) this).field_n > ((mda) this).field_m) {
                    L1: {
                      ((mda) this).field_q.field_u.a((ffa) this, -50);
                      if (0 < ((mda) this).field_n) {
                        var3 = (float)((mda) this).field_m / (float)((mda) this).field_n;
                        ((mda) this).field_k = (int)((float)(((mda) this).field_i - ((mda) this).field_l) * var3 + (float)((mda) this).field_l);
                        break L1;
                      } else {
                        break L1;
                      }
                    }
                    this.n(param0 ^ -786433);
                    ((mda) this).field_q.field_u.b((ffa) this, 7073);
                    if (~((mda) this).field_s == param0) {
                      L2: {
                        var6 = ((mda) this).field_q.u(-37);
                        if (((mda) this).a((byte) 110, var6.e(9648), var6.d(3), var6.a((byte) 55), var6.c(param0 ^ 104))) {
                          var6.G(31027);
                          break L2;
                        } else {
                          break L2;
                        }
                      }
                      return;
                    } else {
                      return;
                    }
                  } else {
                    this.i((byte) -126);
                    return;
                  }
                }
              }
            }
            L3: {
              ((mda) this).field_q.field_u.a((ffa) this, -50);
              if (0 < ((mda) this).field_n) {
                var3 = (float)((mda) this).field_m / (float)((mda) this).field_n;
                ((mda) this).field_k = (int)((float)(((mda) this).field_i - ((mda) this).field_l) * var3 + (float)((mda) this).field_l);
                break L3;
              } else {
                break L3;
              }
            }
            this.n(param0 ^ -786433);
            ((mda) this).field_q.field_u.b((ffa) this, 7073);
            if (~((mda) this).field_s == param0) {
              L4: {
                var7 = ((mda) this).field_q.u(-37);
                if (((mda) this).a((byte) 110, var7.e(9648), var7.d(3), var7.a((byte) 55), var7.c(param0 ^ 104))) {
                  var7.G(31027);
                  break L4;
                } else {
                  break L4;
                }
              }
              return;
            } else {
              return;
            }
          } else {
            L5: {
              ((mda) this).field_q.field_u.a((ffa) this, -50);
              if (0 < ((mda) this).field_n) {
                var3 = (float)((mda) this).field_m / (float)((mda) this).field_n;
                ((mda) this).field_k = (int)((float)(((mda) this).field_i - ((mda) this).field_l) * var3 + (float)((mda) this).field_l);
                break L5;
              } else {
                break L5;
              }
            }
            this.n(param0 ^ -786433);
            ((mda) this).field_q.field_u.b((ffa) this, 7073);
            if (~((mda) this).field_s == param0) {
              L6: {
                var5 = ((mda) this).field_q.u(-37);
                if (((mda) this).a((byte) 110, var5.e(9648), var5.d(3), var5.a((byte) 55), var5.c(param0 ^ 104))) {
                  var5.G(31027);
                  break L6;
                } else {
                  break L6;
                }
              }
              return;
            } else {
              return;
            }
          }
        } else {
          return;
        }
    }

    public final boolean a(gma param0, int param1) {
        RuntimeException var3 = null;
        boolean stackIn_3_0 = false;
        RuntimeException stackIn_5_0 = null;
        StringBuilder stackIn_5_1 = null;
        RuntimeException stackIn_6_0 = null;
        StringBuilder stackIn_6_1 = null;
        RuntimeException stackIn_7_0 = null;
        StringBuilder stackIn_7_1 = null;
        String stackIn_7_2 = null;
        RuntimeException decompiledCaughtException = null;
        boolean stackOut_2_0 = false;
        RuntimeException stackOut_4_0 = null;
        StringBuilder stackOut_4_1 = null;
        RuntimeException stackOut_6_0 = null;
        StringBuilder stackOut_6_1 = null;
        String stackOut_6_2 = null;
        RuntimeException stackOut_5_0 = null;
        StringBuilder stackOut_5_1 = null;
        String stackOut_5_2 = null;
        try {
          L0: {
            L1: {
              if (param1 == 0) {
                break L1;
              } else {
                ((mda) this).field_q = null;
                break L1;
              }
            }
            int discarded$2 = 61;
            stackOut_2_0 = this.a(param0);
            stackIn_3_0 = stackOut_2_0;
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L2: {
            var3 = decompiledCaughtException;
            stackOut_4_0 = (RuntimeException) var3;
            stackOut_4_1 = new StringBuilder().append("mda.OA(");
            stackIn_6_0 = stackOut_4_0;
            stackIn_6_1 = stackOut_4_1;
            stackIn_5_0 = stackOut_4_0;
            stackIn_5_1 = stackOut_4_1;
            if (param0 == null) {
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
          throw tba.a((Throwable) (Object) stackIn_7_0, stackIn_7_2 + 44 + param1 + 41);
        }
        return stackIn_3_0;
    }

    public final boolean a(int param0, gma param1) {
        RuntimeException var3 = null;
        int stackIn_3_0 = 0;
        int stackIn_7_0 = 0;
        RuntimeException stackIn_9_0 = null;
        StringBuilder stackIn_9_1 = null;
        RuntimeException stackIn_10_0 = null;
        StringBuilder stackIn_10_1 = null;
        RuntimeException stackIn_11_0 = null;
        StringBuilder stackIn_11_1 = null;
        String stackIn_11_2 = null;
        RuntimeException decompiledCaughtException = null;
        int stackOut_2_0 = 0;
        int stackOut_6_0 = 0;
        RuntimeException stackOut_8_0 = null;
        StringBuilder stackOut_8_1 = null;
        RuntimeException stackOut_10_0 = null;
        StringBuilder stackOut_10_1 = null;
        String stackOut_10_2 = null;
        RuntimeException stackOut_9_0 = null;
        StringBuilder stackOut_9_1 = null;
        String stackOut_9_2 = null;
        try {
          L0: {
            int discarded$2 = 61;
            if (!this.a(param1)) {
              stackOut_2_0 = 0;
              stackIn_3_0 = stackOut_2_0;
              return stackIn_3_0 != 0;
            } else {
              L1: {
                if (param0 <= -77) {
                  break L1;
                } else {
                  ((mda) this).field_n = -69;
                  break L1;
                }
              }
              this.i((byte) -128);
              stackOut_6_0 = 1;
              stackIn_7_0 = stackOut_6_0;
              break L0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L2: {
            var3 = decompiledCaughtException;
            stackOut_8_0 = (RuntimeException) var3;
            stackOut_8_1 = new StringBuilder().append("mda.OD(").append(param0).append(44);
            stackIn_10_0 = stackOut_8_0;
            stackIn_10_1 = stackOut_8_1;
            stackIn_9_0 = stackOut_8_0;
            stackIn_9_1 = stackOut_8_1;
            if (param1 == null) {
              stackOut_10_0 = (RuntimeException) (Object) stackIn_10_0;
              stackOut_10_1 = (StringBuilder) (Object) stackIn_10_1;
              stackOut_10_2 = "null";
              stackIn_11_0 = stackOut_10_0;
              stackIn_11_1 = stackOut_10_1;
              stackIn_11_2 = stackOut_10_2;
              break L2;
            } else {
              stackOut_9_0 = (RuntimeException) (Object) stackIn_9_0;
              stackOut_9_1 = (StringBuilder) (Object) stackIn_9_1;
              stackOut_9_2 = "{...}";
              stackIn_11_0 = stackOut_9_0;
              stackIn_11_1 = stackOut_9_1;
              stackIn_11_2 = stackOut_9_2;
              break L2;
            }
          }
          throw tba.a((Throwable) (Object) stackIn_11_0, stackIn_11_2 + 41);
        }
        return stackIn_7_0 != 0;
    }

    public final void f(int param0) {
        if (param0 != -4366) {
            ((mda) this).field_s = 113;
        }
    }

    public final int k(int param0) {
        if (param0 != -21185) {
            ((mda) this).field_m = -67;
            return ((mda) this).field_r;
        }
        return ((mda) this).field_r;
    }

    public final int a(up param0, int param1, int param2, int param3, int param4, int param5) {
        RuntimeException var7 = null;
        int stackIn_2_0 = 0;
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
        int stackOut_1_0 = 0;
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
            if (((mda) this).a((byte) 110, param4, param2, param5, param1)) {
              L1: {
                if (param3 == 0) {
                  break L1;
                } else {
                  ((mda) this).field_q = null;
                  break L1;
                }
              }
              int discarded$2 = -6;
              stackOut_5_0 = this.a(param0);
              stackIn_6_0 = stackOut_5_0;
              break L0;
            } else {
              stackOut_1_0 = 0;
              stackIn_2_0 = stackOut_1_0;
              return stackIn_2_0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L2: {
            var7 = decompiledCaughtException;
            stackOut_7_0 = (RuntimeException) var7;
            stackOut_7_1 = new StringBuilder().append("mda.WC(");
            stackIn_9_0 = stackOut_7_0;
            stackIn_9_1 = stackOut_7_1;
            stackIn_8_0 = stackOut_7_0;
            stackIn_8_1 = stackOut_7_1;
            if (param0 == null) {
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
          throw tba.a((Throwable) (Object) stackIn_10_0, stackIn_10_2 + 44 + param1 + 44 + param2 + 44 + param3 + 44 + param4 + 44 + param5 + 41);
        }
        return stackIn_6_0;
    }

    mda() {
        int fieldTemp$0 = ui.field_a;
        ui.field_a = ui.field_a + 1;
        ((mda) this).field_w = fieldTemp$0;
    }

    public final int c(int param0) {
        if (param0 >= -11) {
            ((mda) this).field_l = 88;
            return ((mda) this).field_k;
        }
        return ((mda) this).field_k;
    }

    public final boolean j(int param0) {
        if (param0 != -1) {
            boolean discarded$0 = ((mda) this).a((byte) -105, false);
            return false;
        }
        return false;
    }

    public final boolean b(boolean param0) {
        int stackIn_4_0 = 0;
        int stackIn_8_0 = 0;
        int stackOut_7_0 = 0;
        int stackOut_6_0 = 0;
        int stackOut_3_0 = 0;
        int stackOut_2_0 = 0;
        if (!param0) {
          L0: {
            ((mda) this).field_w = -99;
            if (((mda) this).field_s != 1) {
              stackOut_7_0 = 0;
              stackIn_8_0 = stackOut_7_0;
              break L0;
            } else {
              stackOut_6_0 = 1;
              stackIn_8_0 = stackOut_6_0;
              break L0;
            }
          }
          return stackIn_8_0 != 0;
        } else {
          L1: {
            if (((mda) this).field_s != 1) {
              stackOut_3_0 = 0;
              stackIn_4_0 = stackOut_3_0;
              break L1;
            } else {
              stackOut_2_0 = 1;
              stackIn_4_0 = stackOut_2_0;
              break L1;
            }
          }
          return stackIn_4_0 != 0;
        }
    }

    static {
    }
}
