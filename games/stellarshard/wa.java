/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class wa {
    private int field_d;
    static String field_b;
    private ai field_a;
    private bg field_f;
    static String[] field_e;
    private int field_c;

    final static boolean a(char param0, byte param1) {
        char[] var2 = null;
        int var2_int = 0;
        RuntimeException var2_ref = null;
        int var3 = 0;
        int var4 = 0;
        int var5 = 0;
        char[] var6 = null;
        int stackIn_8_0 = 0;
        int stackIn_15_0 = 0;
        int stackIn_18_0 = 0;
        RuntimeException decompiledCaughtException = null;
        int stackOut_7_0 = 0;
        int stackOut_14_0 = 0;
        int stackOut_17_0 = 0;
        var5 = stellarshard.field_B;
        try {
          L0: {
            L1: {
              if (param0 <= 0) {
                break L1;
              } else {
                if (param0 < 128) {
                  stackOut_7_0 = 1;
                  stackIn_8_0 = stackOut_7_0;
                  return stackIn_8_0 != 0;
                } else {
                  break L1;
                }
              }
            }
            L2: {
              if (param0 < 160) {
                break L2;
              } else {
                if (255 < param0) {
                  break L2;
                } else {
                  return true;
                }
              }
            }
            L3: {
              if (param0 == 0) {
                break L3;
              } else {
                var6 = wf.field_a;
                var2 = var6;
                var3 = 0;
                L4: while (true) {
                  if (var6.length <= var3) {
                    break L3;
                  } else {
                    var4 = var6[var3];
                    if (param0 == var4) {
                      stackOut_14_0 = 1;
                      stackIn_15_0 = stackOut_14_0;
                      return stackIn_15_0 != 0;
                    } else {
                      var3++;
                      continue L4;
                    }
                  }
                }
              }
            }
            var2_int = -80 / ((77 - param1) / 45);
            stackOut_17_0 = 0;
            stackIn_18_0 = stackOut_17_0;
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2_ref = decompiledCaughtException;
          throw ma.a((Throwable) (Object) var2_ref, "wa.G(" + param0 + 44 + param1 + 41);
        }
        return stackIn_18_0 != 0;
    }

    final static String a(int param0) {
        return ae.field_N.e((byte) 91);
    }

    public static void b(int param0) {
        field_e = null;
        field_b = null;
        if (param0 != 0) {
            boolean discarded$0 = wa.a('\n', (byte) 2);
        }
    }

    final void a(Object param0, long param1, int param2) {
        try {
            if (param2 != -22424) {
                field_b = null;
            }
            this.a(-123, 1, param1, param0);
        } catch (RuntimeException runtimeException) {
            throw ma.a((Throwable) (Object) runtimeException, "wa.C(" + (param0 != null ? "{...}" : "null") + 44 + param1 + 44 + param2 + 41);
        }
    }

    private final void a(int param0, int param1, long param2, Object param3) {
        gj var6 = null;
        ld var6_ref = null;
        int var7 = stellarshard.field_B;
        try {
            if (param1 > ((wa) this).field_c) {
                throw new IllegalStateException();
            }
            if (param0 >= -113) {
                this.a(-81L, (byte) 23);
            }
            this.a(param2, (byte) 110);
            ((wa) this).field_d = ((wa) this).field_d - param1;
            while (0 > ((wa) this).field_d) {
                var6 = (gj) (Object) ((wa) this).field_f.b((byte) 103);
                this.a(var6, (byte) 124);
            }
            var6_ref = new ld(param3, param1);
            ((wa) this).field_a.a((byte) 30, (gg) (Object) var6_ref, param2);
            ((wa) this).field_f.a(true, (ah) (Object) var6_ref);
            ((gj) (Object) var6_ref).field_o = 0L;
        } catch (RuntimeException runtimeException) {
            throw ma.a((Throwable) (Object) runtimeException, "wa.D(" + param0 + 44 + param1 + 44 + param2 + 44 + (param3 != null ? "{...}" : "null") + 41);
        }
    }

    final Object b(long param0, byte param1) {
        Object var5 = null;
        ld var6 = null;
        gj var7 = null;
        var7 = (gj) (Object) ((wa) this).field_a.a(param0, -1);
        if (var7 != null) {
          var5 = var7.e(-118);
          if (var5 == null) {
            var7.c(20);
            var7.c((byte) 36);
            ((wa) this).field_d = ((wa) this).field_d + var7.field_u;
            return null;
          } else {
            if (!var7.f(0)) {
              ((wa) this).field_f.a(true, (ah) (Object) var7);
              var7.field_o = 0L;
              if (param1 == 58) {
                return var5;
              } else {
                ((wa) this).field_a = null;
                return var5;
              }
            } else {
              var6 = new ld(var5, var7.field_u);
              ((wa) this).field_a.a((byte) 81, (gg) (Object) var6, var7.field_j);
              ((wa) this).field_f.a(true, (ah) (Object) var6);
              ((gj) (Object) var6).field_o = 0L;
              var7.c(20);
              var7.c((byte) 36);
              if (param1 == 58) {
                return var5;
              } else {
                ((wa) this).field_a = null;
                return var5;
              }
            }
          }
        } else {
          return null;
        }
    }

    private final void a(gj param0, byte param1) {
        RuntimeException runtimeException = null;
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
        try {
          L0: {
            if (param1 >= 116) {
              L1: {
                if (param0 == null) {
                  break L1;
                } else {
                  param0.c(20);
                  param0.c((byte) 36);
                  ((wa) this).field_d = ((wa) this).field_d + param0.field_u;
                  break L1;
                }
              }
              break L0;
            } else {
              return;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L2: {
            runtimeException = decompiledCaughtException;
            stackOut_5_0 = (RuntimeException) runtimeException;
            stackOut_5_1 = new StringBuilder().append("wa.F(");
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
          throw ma.a((Throwable) (Object) stackIn_8_0, stackIn_8_2 + 44 + param1 + 41);
        }
    }

    private final void a(long param0, byte param1) {
        gj var4 = null;
        var4 = (gj) (Object) ((wa) this).field_a.a(param0, -1);
        if (param1 <= 106) {
          wa.b(-119);
          this.a(var4, (byte) 118);
          return;
        } else {
          this.a(var4, (byte) 118);
          return;
        }
    }

    private wa() throws Throwable {
        throw new Error();
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_b = "Email address is unavailable";
        field_e = new String[]{"Connection lost - attempting to reconnect", "Connection lost - attempting to reconnect.", "Connection lost - attempting to reconnect..", "Connection lost - attempting to reconnect..."};
    }
}
