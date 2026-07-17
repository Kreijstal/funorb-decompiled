/*
 * Decompiled by CFR-JS 0.4.0.
 */
abstract class hf extends ee {
    static String field_S;
    static byte[][] field_Z;
    ee field_R;
    static String field_X;
    double field_Y;
    static bi field_T;
    pm field_W;
    double field_V;
    int field_Q;
    static String field_U;

    final boolean f(int param0) {
        if (param0 >= -54) {
            hf.m(-59);
            return ((hf) this).field_R.f(-67);
        }
        return ((hf) this).field_R.f(-67);
    }

    hf(hn param0, double param1, double param2, double param3, double param4, double param5, ee param6, double param7, double param8) {
        super(param0, param1, param2, param3, param4, param5);
        ((hf) this).field_W = null;
        ((hf) this).field_Q = 1;
        try {
            ((hf) this).field_V = param7;
            ((hf) this).field_R = param6;
            ((hf) this).field_Y = param8;
        } catch (RuntimeException runtimeException) {
            throw sd.a((Throwable) (Object) runtimeException, "hf.<init>(" + (param0 != null ? "{...}" : "null") + 44 + param1 + 44 + param2 + 44 + param3 + 44 + param4 + 44 + param5 + 44 + (param6 != null ? "{...}" : "null") + 44 + param7 + 44 + param8 + 41);
        }
    }

    void a(pm param0, int param1) {
        if (param1 > -81) {
            return;
        }
        try {
            param0.a(-80, (hf) this);
        } catch (RuntimeException runtimeException) {
            throw sd.a((Throwable) (Object) runtimeException, "hf.D(" + (param0 != null ? "{...}" : "null") + 44 + param1 + 41);
        }
    }

    void a(int param0, vg param1) {
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
              param1.a(-61, (hf) this);
              if (param0 == -1) {
                break L1;
              } else {
                ((hf) this).field_W = null;
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
            stackOut_3_1 = new StringBuilder().append("hf.DA(").append(param0).append(44);
            stackIn_5_0 = stackOut_3_0;
            stackIn_5_1 = stackOut_3_1;
            stackIn_4_0 = stackOut_3_0;
            stackIn_4_1 = stackOut_3_1;
            if (param1 == null) {
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
          throw sd.a((Throwable) (Object) stackIn_6_0, stackIn_6_2 + 41);
        }
    }

    void a(int param0, int param1) {
        double var3 = 0.0;
        double var5 = 0.0;
        double var7 = 0.0;
        double var9 = 0.0;
        L0: {
          if (0 < ((hf) this).field_Q) {
            ((hf) this).field_Q = ((hf) this).field_Q - 1;
            break L0;
          } else {
            break L0;
          }
        }
        if (((hf) this).field_W != null) {
          L1: {
            var3 = Math.sqrt(((hf) this).field_K * ((hf) this).field_K + ((hf) this).field_G * ((hf) this).field_G + ((hf) this).field_L * ((hf) this).field_L);
            if (var3 >= 0.001) {
              break L1;
            } else {
              var3 = 0.001;
              break L1;
            }
          }
          var5 = ((hf) this).field_K / var3;
          var7 = ((hf) this).field_G / var3;
          var9 = ((hf) this).field_L / var3;
          if (!((hf) this).a(var9, ((hf) this).field_W, var5, 1, var7)) {
            ((hf) this).b(((hf) this).field_W, (byte) 106);
            ((hf) this).a(true, ((hf) this).field_Y, 27871);
            super.a(param0, param1);
            return;
          } else {
            pm dupTemp$1 = ((hf) this).a(var5, var7, var9, false);
            ((hf) this).field_W = dupTemp$1;
            if (dupTemp$1 != null) {
              ((hf) this).b(((hf) this).field_W, (byte) 106);
              ((hf) this).a(true, ((hf) this).field_Y, 27871);
              super.a(param0, param1);
              return;
            } else {
              super.a(param0, param1);
              return;
            }
          }
        } else {
          super.a(param0, param1);
          return;
        }
    }

    void a(boolean param0, il param1) {
        try {
            if (param0) {
                ((hf) this).field_W = null;
            }
            param1.a(-51, (hf) this);
        } catch (RuntimeException runtimeException) {
            throw sd.a((Throwable) (Object) runtimeException, "hf.L(" + param0 + 44 + (param1 != null ? "{...}" : "null") + 41);
        }
    }

    final static nf[] a(mi param0, int param1, byte param2, int param3) {
        RuntimeException var4 = null;
        Object stackIn_4_0 = null;
        nf[] stackIn_6_0 = null;
        RuntimeException stackIn_8_0 = null;
        StringBuilder stackIn_8_1 = null;
        RuntimeException stackIn_9_0 = null;
        StringBuilder stackIn_9_1 = null;
        RuntimeException stackIn_10_0 = null;
        StringBuilder stackIn_10_1 = null;
        String stackIn_10_2 = null;
        RuntimeException decompiledCaughtException = null;
        nf[] stackOut_5_0 = null;
        Object stackOut_3_0 = null;
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
              if (param2 <= -122) {
                break L1;
              } else {
                field_S = null;
                break L1;
              }
            }
            if (mc.a(param3, param1, param0, (byte) 119)) {
              stackOut_5_0 = ja.a(-122);
              stackIn_6_0 = stackOut_5_0;
              break L0;
            } else {
              stackOut_3_0 = null;
              stackIn_4_0 = stackOut_3_0;
              return (nf[]) (Object) stackIn_4_0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L2: {
            var4 = decompiledCaughtException;
            stackOut_7_0 = (RuntimeException) var4;
            stackOut_7_1 = new StringBuilder().append("hf.SA(");
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
          throw sd.a((Throwable) (Object) stackIn_10_0, stackIn_10_2 + 44 + param1 + 44 + param2 + 44 + param3 + 41);
        }
        return stackIn_6_0;
    }

    void a(int param0, mb param1) {
        RuntimeException runtimeException = null;
        Object var4 = null;
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
              param1.a(param0 + 23056, (hf) this);
              if (param0 == -23154) {
                break L1;
              } else {
                var4 = null;
                nf[] discarded$2 = hf.a((mi) null, -38, (byte) -52, 80);
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
            stackOut_3_1 = new StringBuilder().append("hf.F(").append(param0).append(44);
            stackIn_5_0 = stackOut_3_0;
            stackIn_5_1 = stackOut_3_1;
            stackIn_4_0 = stackOut_3_0;
            stackIn_4_1 = stackOut_3_1;
            if (param1 == null) {
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
          throw sd.a((Throwable) (Object) stackIn_6_0, stackIn_6_2 + 41);
        }
    }

    void a(boolean param0, ee param1) {
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
              ((hf) this).b(param1, -126);
              if (param0) {
                break L1;
              } else {
                field_X = null;
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
            stackOut_3_1 = new StringBuilder().append("hf.E(").append(param0).append(44);
            stackIn_5_0 = stackOut_3_0;
            stackIn_5_1 = stackOut_3_1;
            stackIn_4_0 = stackOut_3_0;
            stackIn_4_1 = stackOut_3_1;
            if (param1 == null) {
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
          throw sd.a((Throwable) (Object) stackIn_6_0, stackIn_6_2 + 41);
        }
    }

    final static boolean l(int param0) {
        return na.field_S == wh.field_fb;
    }

    final double a(int param0, boolean param1, double param2) {
        if (param0 != 14170) {
            ((hf) this).field_V = -1.316130172528065;
            return param2;
        }
        return param2;
    }

    boolean a(pm param0, byte param1) {
        RuntimeException var3 = null;
        int stackIn_3_0 = 0;
        RuntimeException stackIn_5_0 = null;
        StringBuilder stackIn_5_1 = null;
        RuntimeException stackIn_6_0 = null;
        StringBuilder stackIn_6_1 = null;
        RuntimeException stackIn_7_0 = null;
        StringBuilder stackIn_7_1 = null;
        String stackIn_7_2 = null;
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
        try {
          L0: {
            if (param1 == 72) {
              stackOut_2_0 = 0;
              stackIn_3_0 = stackOut_2_0;
              break L0;
            } else {
              ((hf) this).field_Q = 4;
              return false;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L1: {
            var3 = decompiledCaughtException;
            stackOut_4_0 = (RuntimeException) var3;
            stackOut_4_1 = new StringBuilder().append("hf.WA(");
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
              break L1;
            } else {
              stackOut_5_0 = (RuntimeException) (Object) stackIn_5_0;
              stackOut_5_1 = (StringBuilder) (Object) stackIn_5_1;
              stackOut_5_2 = "{...}";
              stackIn_7_0 = stackOut_5_0;
              stackIn_7_1 = stackOut_5_1;
              stackIn_7_2 = stackOut_5_2;
              break L1;
            }
          }
          throw sd.a((Throwable) (Object) stackIn_7_0, stackIn_7_2 + 44 + param1 + 41);
        }
        return stackIn_3_0 != 0;
    }

    void a(int param0, ah param1) {
        try {
            param1.a(-35, (hf) this);
            int var3_int = 3 / ((param0 - 14) / 53);
        } catch (RuntimeException runtimeException) {
            throw sd.a((Throwable) (Object) runtimeException, "hf.C(" + param0 + 44 + (param1 != null ? "{...}" : "null") + 41);
        }
    }

    final boolean c(int param0) {
        if (param0 != 5) {
            Object var3 = null;
            ((hf) this).a(true, (ee) null);
            return false;
        }
        return false;
    }

    void a(cl param0, byte param1) {
        try {
            int var3_int = 75 / ((param1 - -35) / 60);
            param0.a(-84, (hf) this);
        } catch (RuntimeException runtimeException) {
            throw sd.a((Throwable) (Object) runtimeException, "hf.I(" + (param0 != null ? "{...}" : "null") + 44 + param1 + 41);
        }
    }

    void a(int param0, double param1, double param2, double param3, double param4, double param5, double param6) {
        if (param0 != 256) {
            return;
        }
        ((hf) this).d(param0 ^ 11053);
    }

    void a(int param0, hf param1) {
        RuntimeException runtimeException = null;
        Object var4 = null;
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
              if (param0 <= -29) {
                break L1;
              } else {
                var4 = null;
                ((hf) this).a(-7, (mb) null);
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
            stackOut_3_1 = new StringBuilder().append("hf.A(").append(param0).append(44);
            stackIn_5_0 = stackOut_3_0;
            stackIn_5_1 = stackOut_3_1;
            stackIn_4_0 = stackOut_3_0;
            stackIn_4_1 = stackOut_3_1;
            if (param1 == null) {
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
          throw sd.a((Throwable) (Object) stackIn_6_0, stackIn_6_2 + 41);
        }
    }

    void a(byte param0, sa param1) {
        if (param0 != 9) {
            return;
        }
        try {
            param1.a(param0 + -106, (hf) this);
        } catch (RuntimeException runtimeException) {
            throw sd.a((Throwable) (Object) runtimeException, "hf.M(" + param0 + 44 + (param1 != null ? "{...}" : "null") + 41);
        }
    }

    final boolean a(boolean param0, pm param1) {
        RuntimeException var3 = null;
        Object var4 = null;
        int stackIn_3_0 = 0;
        RuntimeException stackIn_5_0 = null;
        StringBuilder stackIn_5_1 = null;
        RuntimeException stackIn_6_0 = null;
        StringBuilder stackIn_6_1 = null;
        RuntimeException stackIn_7_0 = null;
        StringBuilder stackIn_7_1 = null;
        String stackIn_7_2 = null;
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
        try {
          L0: {
            L1: {
              if (param0) {
                break L1;
              } else {
                var4 = null;
                ((hf) this).a((byte) -53, (sa) null);
                break L1;
              }
            }
            stackOut_2_0 = 0;
            stackIn_3_0 = stackOut_2_0;
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L2: {
            var3 = decompiledCaughtException;
            stackOut_4_0 = (RuntimeException) var3;
            stackOut_4_1 = new StringBuilder().append("hf.CB(").append(param0).append(44);
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
          throw sd.a((Throwable) (Object) stackIn_7_0, stackIn_7_2 + 41);
        }
        return stackIn_3_0 != 0;
    }

    public static void m(int param0) {
        field_U = null;
        field_S = null;
        int var1 = 12 % ((param0 - 4) / 35);
        field_X = null;
        field_Z = null;
        field_T = null;
    }

    void b(ee param0, int param1) {
        if (param0 == ((hf) this).field_R) {
            if (((hf) this).field_Q > 0) {
                ((hf) this).field_Q = ((hf) this).field_Q + 1;
                return;
            }
        }
        ((hf) this).a(param0, 0.0, -77);
        if (param1 >= -122) {
            return;
        }
        try {
            ((hf) this).d(10797);
        } catch (RuntimeException runtimeException) {
            throw sd.a((Throwable) (Object) runtimeException, "hf.B(" + (param0 != null ? "{...}" : "null") + 44 + param1 + 41);
        }
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_X = "<%0> homing missiles";
        field_S = "Connection timed out. Please try using a different server.";
        field_Z = new byte[50][];
        field_U = "Updates will sent to the email address you've given";
    }
}
