/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class ika {
    static gba field_a;
    eaa field_b;
    int field_c;

    final static tk a(byte param0, lu param1) {
        int var2_int = 0;
        RuntimeException var2 = null;
        int var3 = 0;
        int var4 = 0;
        int var5 = 0;
        int var6 = 0;
        int var7 = 0;
        int var8 = 0;
        int var9 = 0;
        int var10 = 0;
        int var11 = 0;
        int var12 = 0;
        int var13 = 0;
        int var14 = 0;
        int var15 = 0;
        int var16 = 0;
        int var17 = 0;
        int var18 = 0;
        int var19 = 0;
        Object stackIn_2_0 = null;
        tk stackIn_4_0 = null;
        RuntimeException stackIn_6_0 = null;
        StringBuilder stackIn_6_1 = null;
        RuntimeException stackIn_7_0 = null;
        StringBuilder stackIn_7_1 = null;
        RuntimeException stackIn_8_0 = null;
        StringBuilder stackIn_8_1 = null;
        String stackIn_8_2 = null;
        RuntimeException decompiledCaughtException = null;
        tk stackOut_3_0 = null;
        Object stackOut_1_0 = null;
        RuntimeException stackOut_5_0 = null;
        StringBuilder stackOut_5_1 = null;
        RuntimeException stackOut_7_0 = null;
        StringBuilder stackOut_7_1 = null;
        String stackOut_7_2 = null;
        RuntimeException stackOut_6_0 = null;
        StringBuilder stackOut_6_1 = null;
        String stackOut_6_2 = null;
        try {
          L0: {
            var2_int = param1.e((byte) 118);
            var3 = param1.e((byte) 45);
            var4 = param1.e((byte) 80);
            if (param0 == 85) {
              var5 = param1.e((byte) 61);
              var6 = param1.b(16711935);
              var7 = param1.b(16711935);
              var8 = param1.e((byte) 97);
              var9 = param1.b(16711935);
              var10 = param1.e((byte) 118);
              var11 = param1.e((byte) 83);
              var12 = param1.e((byte) 54);
              var13 = param1.e((byte) 102);
              var14 = param1.e((byte) 47);
              var15 = param1.e((byte) 124);
              var16 = param1.e((byte) 77);
              var17 = param1.e((byte) 45);
              var18 = param1.e((byte) 59);
              var19 = param1.b(16711935);
              stackOut_3_0 = new tk(var2_int, var3, var4, var5, var6, var7, var8, var9, var10, var11, var12, var13, var14, var15, var16, var17, var18, var19);
              stackIn_4_0 = stackOut_3_0;
              break L0;
            } else {
              stackOut_1_0 = null;
              stackIn_2_0 = stackOut_1_0;
              return (tk) (Object) stackIn_2_0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L1: {
            var2 = decompiledCaughtException;
            stackOut_5_0 = (RuntimeException) var2;
            stackOut_5_1 = new StringBuilder().append("ika.E(").append(param0).append(44);
            stackIn_7_0 = stackOut_5_0;
            stackIn_7_1 = stackOut_5_1;
            stackIn_6_0 = stackOut_5_0;
            stackIn_6_1 = stackOut_5_1;
            if (param1 == null) {
              stackOut_7_0 = (RuntimeException) (Object) stackIn_7_0;
              stackOut_7_1 = (StringBuilder) (Object) stackIn_7_1;
              stackOut_7_2 = "null";
              stackIn_8_0 = stackOut_7_0;
              stackIn_8_1 = stackOut_7_1;
              stackIn_8_2 = stackOut_7_2;
              break L1;
            } else {
              stackOut_6_0 = (RuntimeException) (Object) stackIn_6_0;
              stackOut_6_1 = (StringBuilder) (Object) stackIn_6_1;
              stackOut_6_2 = "{...}";
              stackIn_8_0 = stackOut_6_0;
              stackIn_8_1 = stackOut_6_1;
              stackIn_8_2 = stackOut_6_2;
              break L1;
            }
          }
          throw pe.a((Throwable) (Object) stackIn_8_0, stackIn_8_2 + 41);
        }
        return stackIn_4_0;
    }

    final static void a(int param0, int param1, int param2, int param3, int param4, int param5, int param6, int param7) {
        int var8 = 0;
        int var9 = 0;
        int var10 = 0;
        int var11 = 0;
        int var12 = 0;
        if (param6 >= 0) {
          L0: {
            var8 = param6 / 60;
            param6 = param6 % 60;
            if (0 == (4 & param1)) {
              break L0;
            } else {
              var8 = var8 % 60;
              break L0;
            }
          }
          var9 = param6 / 10;
          var10 = param6 % 10;
          if (param4 < -52) {
            var11 = var8 / 10;
            var12 = var8 % 10;
            if ((2 & param1) == 0) {
              L1: {
                if ((1 & param1) == 0) {
                  break L1;
                } else {
                  ce.a(true, param3, param5, "" + var9, param2, true);
                  param2 = param2 + (param0 + jha.field_g.a("" + var9) - -2);
                  ce.a(true, param3, param5, "" + var10, param2, true);
                  param2 = param2 + (jha.field_g.a("" + var10) + param0 - -2);
                  break L1;
                }
              }
              return;
            } else {
              ce.a(true, param3, param5, "" + var11, param2, true);
              param2 = param2 + (jha.field_g.a("" + var11) + (param0 + 2));
              ce.a(true, param3, param5, "" + var12, param2, true);
              param2 = param2 + (2 + (jha.field_g.a("" + var11) - -param0));
              if ((param1 & 32) == 0) {
                L2: {
                  ce.a(true, param3, param5, ":", param2, true);
                  param2 = param2 + (jha.field_g.a(":") + param0);
                  if ((1 & param1) == 0) {
                    break L2;
                  } else {
                    ce.a(true, param3, param5, "" + var9, param2, true);
                    param2 = param2 + (param0 + jha.field_g.a("" + var9) - -2);
                    ce.a(true, param3, param5, "" + var10, param2, true);
                    param2 = param2 + (jha.field_g.a("" + var10) + param0 - -2);
                    break L2;
                  }
                }
                return;
              } else {
                if (0 == (param6 & 1)) {
                  L3: {
                    ce.a(true, param3, param5, ":", param2, true);
                    param2 = param2 + (jha.field_g.a(":") + param0);
                    if ((1 & param1) == 0) {
                      break L3;
                    } else {
                      ce.a(true, param3, param5, "" + var9, param2, true);
                      param2 = param2 + (param0 + jha.field_g.a("" + var9) - -2);
                      ce.a(true, param3, param5, "" + var10, param2, true);
                      param2 = param2 + (jha.field_g.a("" + var10) + param0 - -2);
                      break L3;
                    }
                  }
                  return;
                } else {
                  L4: {
                    param2 = param2 + (jha.field_g.a(":") + param0);
                    if ((1 & param1) == 0) {
                      break L4;
                    } else {
                      ce.a(true, param3, param5, "" + var9, param2, true);
                      param2 = param2 + (param0 + jha.field_g.a("" + var9) - -2);
                      ce.a(true, param3, param5, "" + var10, param2, true);
                      param2 = param2 + (jha.field_g.a("" + var10) + param0 - -2);
                      break L4;
                    }
                  }
                  return;
                }
              }
            }
          } else {
            field_a = null;
            var11 = var8 / 10;
            var12 = var8 % 10;
            if ((2 & param1) == 0) {
              L5: {
                if ((1 & param1) == 0) {
                  break L5;
                } else {
                  ce.a(true, param3, param5, "" + var9, param2, true);
                  param2 = param2 + (param0 + jha.field_g.a("" + var9) - -2);
                  ce.a(true, param3, param5, "" + var10, param2, true);
                  param2 = param2 + (jha.field_g.a("" + var10) + param0 - -2);
                  break L5;
                }
              }
              return;
            } else {
              ce.a(true, param3, param5, "" + var11, param2, true);
              param2 = param2 + (jha.field_g.a("" + var11) + (param0 + 2));
              ce.a(true, param3, param5, "" + var12, param2, true);
              param2 = param2 + (2 + (jha.field_g.a("" + var11) - -param0));
              if ((param1 & 32) == 0) {
                ce.a(true, param3, param5, ":", param2, true);
                L6: {
                  param2 = param2 + (jha.field_g.a(":") + param0);
                  if ((1 & param1) == 0) {
                    break L6;
                  } else {
                    ce.a(true, param3, param5, "" + var9, param2, true);
                    param2 = param2 + (param0 + jha.field_g.a("" + var9) - -2);
                    ce.a(true, param3, param5, "" + var10, param2, true);
                    param2 = param2 + (jha.field_g.a("" + var10) + param0 - -2);
                    break L6;
                  }
                }
                return;
              } else {
                if (0 == (param6 & 1)) {
                  ce.a(true, param3, param5, ":", param2, true);
                  L7: {
                    param2 = param2 + (jha.field_g.a(":") + param0);
                    if ((1 & param1) == 0) {
                      break L7;
                    } else {
                      ce.a(true, param3, param5, "" + var9, param2, true);
                      param2 = param2 + (param0 + jha.field_g.a("" + var9) - -2);
                      ce.a(true, param3, param5, "" + var10, param2, true);
                      param2 = param2 + (jha.field_g.a("" + var10) + param0 - -2);
                      break L7;
                    }
                  }
                  return;
                } else {
                  L8: {
                    param2 = param2 + (jha.field_g.a(":") + param0);
                    if ((1 & param1) == 0) {
                      break L8;
                    } else {
                      ce.a(true, param3, param5, "" + var9, param2, true);
                      param2 = param2 + (param0 + jha.field_g.a("" + var9) - -2);
                      ce.a(true, param3, param5, "" + var10, param2, true);
                      param2 = param2 + (jha.field_g.a("" + var10) + param0 - -2);
                      break L8;
                    }
                  }
                  return;
                }
              }
            }
          }
        } else {
          return;
        }
    }

    ika(byte[] param0) {
        this(new lu(param0));
    }

    final static void a(byte param0, il param1) {
        try {
            if (param0 != 18) {
                ika.a(70, -118, -128, -79, -74, -69, 108, -112);
            }
            jka.field_l = param1;
        } catch (RuntimeException runtimeException) {
            throw pe.a((Throwable) (Object) runtimeException, "ika.A(" + param0 + 44 + (param1 != null ? "{...}" : "null") + 41);
        }
    }

    public static void a(boolean param0) {
        field_a = null;
    }

    private ika(lu param0) {
        ((ika) this).field_b = new eaa();
        try {
            this.a(param0, 0);
        } catch (RuntimeException runtimeException) {
            throw pe.a((Throwable) (Object) runtimeException, "ika.<init>(" + (param0 != null ? "{...}" : "null") + 41);
        }
    }

    private final void a(lu param0, int param1) {
        int var3_int = 0;
        RuntimeException var3 = null;
        int var4 = 0;
        RuntimeException stackIn_6_0 = null;
        StringBuilder stackIn_6_1 = null;
        RuntimeException stackIn_7_0 = null;
        StringBuilder stackIn_7_1 = null;
        RuntimeException stackIn_8_0 = null;
        StringBuilder stackIn_8_1 = null;
        String stackIn_8_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException stackOut_5_0 = null;
        StringBuilder stackOut_5_1 = null;
        RuntimeException stackOut_7_0 = null;
        StringBuilder stackOut_7_1 = null;
        String stackOut_7_2 = null;
        RuntimeException stackOut_6_0 = null;
        StringBuilder stackOut_6_1 = null;
        String stackOut_6_2 = null;
        var4 = BachelorFridge.field_y;
        try {
          L0: {
            ((ika) this).field_c = param0.e((byte) 114);
            var3_int = 0;
            L1: while (true) {
              if (var3_int >= ((ika) this).field_c) {
                break L0;
              } else {
                ((ika) this).field_b.a((bw) (Object) new ft(param0), true);
                var3_int++;
                continue L1;
              }
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L2: {
            var3 = decompiledCaughtException;
            stackOut_5_0 = (RuntimeException) var3;
            stackOut_5_1 = new StringBuilder().append("ika.D(");
            stackIn_7_0 = stackOut_5_0;
            stackIn_7_1 = stackOut_5_1;
            stackIn_6_0 = stackOut_5_0;
            stackIn_6_1 = stackOut_5_1;
            if (param0 == null) {
              stackOut_7_0 = (RuntimeException) (Object) stackIn_7_0;
              stackOut_7_1 = (StringBuilder) (Object) stackIn_7_1;
              stackOut_7_2 = "null";
              stackIn_8_0 = stackOut_7_0;
              stackIn_8_1 = stackOut_7_1;
              stackIn_8_2 = stackOut_7_2;
              break L2;
            } else {
              stackOut_6_0 = (RuntimeException) (Object) stackIn_6_0;
              stackOut_6_1 = (StringBuilder) (Object) stackIn_6_1;
              stackOut_6_2 = "{...}";
              stackIn_8_0 = stackOut_6_0;
              stackIn_8_1 = stackOut_6_1;
              stackIn_8_2 = stackOut_6_2;
              break L2;
            }
          }
          throw pe.a((Throwable) (Object) stackIn_8_0, stackIn_8_2 + 44 + 0 + 41);
        }
    }

    static {
    }
}
