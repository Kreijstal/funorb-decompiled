/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class ve extends lj {
    private wa field_A;
    static String field_D;
    static boolean[] field_B;
    private int field_C;

    final static boolean a(int param0, String param1) {
        int var2_int = 0;
        RuntimeException var2 = null;
        int var3 = 0;
        int var4 = 0;
        int stackIn_6_0 = 0;
        int stackIn_9_0 = 0;
        RuntimeException stackIn_11_0 = null;
        StringBuilder stackIn_11_1 = null;
        RuntimeException stackIn_12_0 = null;
        StringBuilder stackIn_12_1 = null;
        RuntimeException stackIn_13_0 = null;
        StringBuilder stackIn_13_1 = null;
        String stackIn_13_2 = null;
        RuntimeException decompiledCaughtException = null;
        int stackOut_8_0 = 0;
        int stackOut_5_0 = 0;
        RuntimeException stackOut_10_0 = null;
        StringBuilder stackOut_10_1 = null;
        RuntimeException stackOut_12_0 = null;
        StringBuilder stackOut_12_1 = null;
        String stackOut_12_2 = null;
        RuntimeException stackOut_11_0 = null;
        StringBuilder stackOut_11_1 = null;
        String stackOut_11_2 = null;
        var4 = Transmogrify.field_A ? 1 : 0;
        try {
          L0: {
            var2_int = param1.charAt(0);
            var3 = 1;
            L1: while (true) {
              if (param1.length() <= var3) {
                stackOut_8_0 = 1;
                stackIn_9_0 = stackOut_8_0;
                break L0;
              } else {
                if (var2_int != param1.charAt(var3)) {
                  stackOut_5_0 = 0;
                  stackIn_6_0 = stackOut_5_0;
                  return stackIn_6_0 != 0;
                } else {
                  var3++;
                  continue L1;
                }
              }
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L2: {
            var2 = decompiledCaughtException;
            stackOut_10_0 = (RuntimeException) var2;
            stackOut_10_1 = new StringBuilder().append("ve.D(").append(1).append(44);
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
          throw ch.a((Throwable) (Object) stackIn_13_0, stackIn_13_2 + 41);
        }
        return stackIn_9_0 != 0;
    }

    final String f(int param0) {
        Object var3 = null;
        if (param0 == 4) {
          if (!((ve) this).field_g) {
            return null;
          } else {
            return ((ve) this).field_A.c(param0 + 30519);
          }
        } else {
          var3 = null;
          boolean discarded$5 = ((ve) this).a((qg) null, 58);
          if (!((ve) this).field_g) {
            return null;
          } else {
            return ((ve) this).field_A.c(param0 + 30519);
          }
        }
    }

    final void a(int param0, int param1, int param2, byte param3) {
        int var5 = 0;
        int var6 = 0;
        rc var8 = null;
        int var9 = 0;
        int var10 = 0;
        int var11 = 0;
        int var12 = 0;
        ti var13 = null;
        ti var14 = null;
        ti var16 = null;
        ti var17 = null;
        var12 = Transmogrify.field_A ? 1 : 0;
        super.a(param0, param1, param2, (byte) 111);
        if (param2 != 0) {
          return;
        } else {
          var5 = ((ve) this).field_p + (param0 - -(((ve) this).field_l >> 1));
          var6 = param1 - (-((ve) this).field_n - (((ve) this).field_h >> 1));
          var9 = -100 % ((param3 - 77) / 34);
          var8 = ((ve) this).field_A.a(27835);
          if (var8 != ek.field_a) {
            if (var8 != fi.field_u) {
              if (var8 != ec.field_d) {
                if (hi.field_b != var8) {
                  return;
                } else {
                  var13 = ai.field_b[1];
                  var13.c(var5 - (var13.field_n >> 1), var6 + -(var13.field_m >> 1), 256);
                  return;
                }
              } else {
                var14 = ai.field_b[2];
                var14.c(var5 + -(var14.field_n >> 1), var6 + -(var14.field_m >> 1), 256);
                return;
              }
            } else {
              var17 = ai.field_b[0];
              var10 = var17.field_r << 1;
              var11 = var17.field_s << 1;
              if (null != vh.field_l) {
                if (var10 <= vh.field_l.field_n) {
                  if (vh.field_l.field_m >= var11) {
                    int discarded$8 = 256;
                    oj.a(vh.field_l);
                    sb.c();
                    var17.a(112, 144, var17.field_r << 4, var17.field_s << 4, -((ve) this).field_C << 10, 4096);
                    fi.c(true);
                    vh.field_l.c(-var17.field_r + var5, var6 - var17.field_s, 256);
                    return;
                  } else {
                    vh.field_l = new ti(var10, var11);
                    int discarded$9 = 256;
                    oj.a(vh.field_l);
                    var17.a(112, 144, var17.field_r << 4, var17.field_s << 4, -((ve) this).field_C << 10, 4096);
                    fi.c(true);
                    vh.field_l.c(-var17.field_r + var5, var6 - var17.field_s, 256);
                    return;
                  }
                } else {
                  vh.field_l = new ti(var10, var11);
                  int discarded$10 = 256;
                  oj.a(vh.field_l);
                  var17.a(112, 144, var17.field_r << 4, var17.field_s << 4, -((ve) this).field_C << 10, 4096);
                  fi.c(true);
                  vh.field_l.c(-var17.field_r + var5, var6 - var17.field_s, 256);
                  return;
                }
              } else {
                vh.field_l = new ti(var10, var11);
                int discarded$11 = 256;
                oj.a(vh.field_l);
                var17.a(112, 144, var17.field_r << 4, var17.field_s << 4, -((ve) this).field_C << 10, 4096);
                fi.c(true);
                vh.field_l.c(-var17.field_r + var5, var6 - var17.field_s, 256);
                return;
              }
            }
          } else {
            var16 = ai.field_b[0];
            var10 = var16.field_r << 1;
            var11 = var16.field_s << 1;
            if (null != vh.field_l) {
              if (var10 <= vh.field_l.field_n) {
                if (vh.field_l.field_m >= var11) {
                  int discarded$12 = 256;
                  oj.a(vh.field_l);
                  sb.c();
                  var16.a(112, 144, var16.field_r << 4, var16.field_s << 4, -((ve) this).field_C << 10, 4096);
                  fi.c(true);
                  vh.field_l.c(-var16.field_r + var5, var6 - var16.field_s, 256);
                  return;
                } else {
                  vh.field_l = new ti(var10, var11);
                  int discarded$13 = 256;
                  oj.a(vh.field_l);
                  var16.a(112, 144, var16.field_r << 4, var16.field_s << 4, -((ve) this).field_C << 10, 4096);
                  fi.c(true);
                  vh.field_l.c(-var16.field_r + var5, var6 - var16.field_s, 256);
                  return;
                }
              } else {
                vh.field_l = new ti(var10, var11);
                int discarded$14 = 256;
                oj.a(vh.field_l);
                var16.a(112, 144, var16.field_r << 4, var16.field_s << 4, -((ve) this).field_C << 10, 4096);
                fi.c(true);
                vh.field_l.c(-var16.field_r + var5, var6 - var16.field_s, 256);
                return;
              }
            } else {
              vh.field_l = new ti(var10, var11);
              int discarded$15 = 256;
              oj.a(vh.field_l);
              var16.a(112, 144, var16.field_r << 4, var16.field_s << 4, -((ve) this).field_C << 10, 4096);
              fi.c(true);
              vh.field_l.c(-var16.field_r + var5, var6 - var16.field_s, 256);
              return;
            }
          }
        }
    }

    public static void a(byte param0) {
        field_B = null;
        field_D = null;
        if (param0 > -58) {
            ve.a((byte) 42);
        }
    }

    final static uj a(String[] args, byte param1) {
        uj var2 = null;
        RuntimeException var2_ref = null;
        uj stackIn_3_0 = null;
        RuntimeException stackIn_5_0 = null;
        StringBuilder stackIn_5_1 = null;
        RuntimeException stackIn_6_0 = null;
        StringBuilder stackIn_6_1 = null;
        RuntimeException stackIn_7_0 = null;
        StringBuilder stackIn_7_1 = null;
        String stackIn_7_2 = null;
        RuntimeException decompiledCaughtException = null;
        uj stackOut_2_0 = null;
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
              if (param1 <= -98) {
                break L1;
              } else {
                field_D = null;
                break L1;
              }
            }
            var2 = new uj(false);
            var2.field_j = args;
            stackOut_2_0 = (uj) var2;
            stackIn_3_0 = stackOut_2_0;
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L2: {
            var2_ref = decompiledCaughtException;
            stackOut_4_0 = (RuntimeException) var2_ref;
            stackOut_4_1 = new StringBuilder().append("ve.C(");
            stackIn_6_0 = stackOut_4_0;
            stackIn_6_1 = stackOut_4_1;
            stackIn_5_0 = stackOut_4_0;
            stackIn_5_1 = stackOut_4_1;
            if (args == null) {
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
          throw ch.a((Throwable) (Object) stackIn_7_0, stackIn_7_2 + 44 + param1 + 41);
        }
        return stackIn_3_0;
    }

    final boolean a(qg param0, int param1) {
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
            if (param1 < -11) {
              stackOut_2_0 = 0;
              stackIn_3_0 = stackOut_2_0;
              break L0;
            } else {
              var4 = null;
              uj discarded$2 = ve.a((String[]) null, (byte) -44);
              return false;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L1: {
            var3 = decompiledCaughtException;
            stackOut_4_0 = (RuntimeException) var3;
            stackOut_4_1 = new StringBuilder().append("ve.M(");
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
          throw ch.a((Throwable) (Object) stackIn_7_0, stackIn_7_2 + 44 + param1 + 41);
        }
        return stackIn_3_0 != 0;
    }

    ve(wa param0) {
        try {
            ((ve) this).field_A = param0;
        } catch (RuntimeException runtimeException) {
            throw ch.a((Throwable) (Object) runtimeException, "ve.<init>(" + (param0 != null ? "{...}" : "null") + 41);
        }
    }

    final void a(int param0, byte param1, qg param2, int param3) {
        try {
            ((ve) this).field_C = ((ve) this).field_C + 1;
            super.a(param0, param1, param2, param3);
        } catch (RuntimeException runtimeException) {
            throw ch.a((Throwable) (Object) runtimeException, "ve.B(" + param0 + 44 + param1 + 44 + (param2 != null ? "{...}" : "null") + 44 + param3 + 41);
        }
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_B = new boolean[112];
        field_D = "Total";
    }
}
