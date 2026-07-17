/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class ba extends rg {
    static String field_Q;
    private int field_R;
    private dm field_S;
    static int[] field_P;
    static String field_T;

    public static void a(byte param0) {
        field_P = null;
        field_Q = null;
        if (param0 >= -67) {
            ba.a((byte) 0);
            field_T = null;
            return;
        }
        field_T = null;
    }

    final String f(byte param0) {
        if (((ba) this).field_w) {
          return ((ba) this).field_S.a((byte) 95);
        } else {
          if (param0 <= -82) {
            return null;
          } else {
            field_Q = null;
            return null;
          }
        }
    }

    final boolean a(fj param0, int param1) {
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
            if (param1 == 418) {
              stackOut_2_0 = 0;
              stackIn_3_0 = stackOut_2_0;
              break L0;
            } else {
              ((ba) this).field_R = 95;
              return false;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L1: {
            var3 = decompiledCaughtException;
            stackOut_4_0 = (RuntimeException) var3;
            stackOut_4_1 = new StringBuilder().append("ba.I(");
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

    final static ck h() {
        try {
            Throwable var1 = null;
            ck stackIn_1_0 = null;
            Throwable decompiledCaughtException = null;
            ck stackOut_0_0 = null;
            try {
              L0: {
                stackOut_0_0 = (ck) Class.forName("tc").newInstance();
                stackIn_1_0 = stackOut_0_0;
                break L0;
              }
            } catch (java.lang.Throwable decompiledCaughtParameter0) {
              decompiledCaughtException = decompiledCaughtParameter0;
              var1 = decompiledCaughtException;
              return null;
            }
            return stackIn_1_0;
        } catch (RuntimeException | Error decompiledUncheckedException) {
            throw decompiledUncheckedException;
        } catch (Throwable decompiledCheckedException) {
            throw new RuntimeException(decompiledCheckedException);
        }
    }

    final void a(fj param0, int param1, int param2, int param3) {
        try {
            ((ba) this).field_R = ((ba) this).field_R + 1;
            super.a(param0, param1, param2, param3);
        } catch (RuntimeException runtimeException) {
            throw sd.a((Throwable) (Object) runtimeException, "ba.V(" + (param0 != null ? "{...}" : "null") + 44 + param1 + 44 + param2 + 44 + param3 + 41);
        }
    }

    final void a(int param0, int param1, byte param2, int param3) {
        int var5 = 0;
        int var6 = 0;
        fi var8 = null;
        int var9 = 0;
        int var10 = 0;
        int var11 = 0;
        nf var14 = null;
        nf var15 = null;
        nf var16 = null;
        nf var17 = null;
        nf var18 = null;
        nf var20 = null;
        nf var21 = null;
        nf var22 = null;
        var11 = Confined.field_J ? 1 : 0;
        super.a(param0, param1, (byte) 54, param3);
        if (param1 != 0) {
          return;
        } else {
          if (param2 > 36) {
            var5 = (((ba) this).field_F >> 1) + (((ba) this).field_q + param3);
            var6 = (((ba) this).field_z >> 1) + param0 - -((ba) this).field_m;
            var8 = ((ba) this).field_S.a(-3621);
            if (var8 != ab.field_b) {
              if (qh.field_x != var8) {
                if (var8 != fb.field_e) {
                  if (var8 != nn.field_q) {
                    return;
                  } else {
                    var21 = gg.field_q[1];
                    var21.c(var5 + -(var21.field_u >> 1), var6 + -(var21.field_w >> 1), 256);
                    return;
                  }
                } else {
                  var20 = gg.field_q[2];
                  var20.c(-(var20.field_u >> 1) + var5, -(var20.field_w >> 1) + var6, 256);
                  return;
                }
              } else {
                var22 = gg.field_q[0];
                var9 = var22.field_t << 1;
                var10 = var22.field_x << 1;
                if (jg.field_g != null) {
                  if (jg.field_g.field_u >= var9) {
                    if (var10 <= jg.field_g.field_w) {
                      int discarded$27 = -8409;
                      vm.a(jg.field_g);
                      fn.d();
                      var22.a(112, 144, var22.field_t << 4, var22.field_x << 4, -((ba) this).field_R << 10, 4096);
                      int discarded$28 = 0;
                      ib.b();
                      jg.field_g.c(var5 + -var22.field_t, -var22.field_x + var6, 256);
                      return;
                    } else {
                      jg.field_g = new nf(var9, var10);
                      int discarded$29 = -8409;
                      vm.a(jg.field_g);
                      var22.a(112, 144, var22.field_t << 4, var22.field_x << 4, -((ba) this).field_R << 10, 4096);
                      int discarded$30 = 0;
                      ib.b();
                      jg.field_g.c(var5 + -var22.field_t, -var22.field_x + var6, 256);
                      return;
                    }
                  } else {
                    jg.field_g = new nf(var9, var10);
                    int discarded$31 = -8409;
                    vm.a(jg.field_g);
                    var22.a(112, 144, var22.field_t << 4, var22.field_x << 4, -((ba) this).field_R << 10, 4096);
                    int discarded$32 = 0;
                    ib.b();
                    jg.field_g.c(var5 + -var22.field_t, -var22.field_x + var6, 256);
                    return;
                  }
                } else {
                  jg.field_g = new nf(var9, var10);
                  int discarded$33 = -8409;
                  vm.a(jg.field_g);
                  var22.a(112, 144, var22.field_t << 4, var22.field_x << 4, -((ba) this).field_R << 10, 4096);
                  int discarded$34 = 0;
                  ib.b();
                  jg.field_g.c(var5 + -var22.field_t, -var22.field_x + var6, 256);
                  return;
                }
              }
            } else {
              var22 = gg.field_q[0];
              var9 = var22.field_t << 1;
              var10 = var22.field_x << 1;
              if (jg.field_g != null) {
                if (jg.field_g.field_u >= var9) {
                  if (var10 <= jg.field_g.field_w) {
                    int discarded$35 = -8409;
                    vm.a(jg.field_g);
                    fn.d();
                    var22.a(112, 144, var22.field_t << 4, var22.field_x << 4, -((ba) this).field_R << 10, 4096);
                    int discarded$36 = 0;
                    ib.b();
                    jg.field_g.c(var5 + -var22.field_t, -var22.field_x + var6, 256);
                    return;
                  } else {
                    jg.field_g = new nf(var9, var10);
                    int discarded$37 = -8409;
                    vm.a(jg.field_g);
                    var22.a(112, 144, var22.field_t << 4, var22.field_x << 4, -((ba) this).field_R << 10, 4096);
                    int discarded$38 = 0;
                    ib.b();
                    jg.field_g.c(var5 + -var22.field_t, -var22.field_x + var6, 256);
                    return;
                  }
                } else {
                  jg.field_g = new nf(var9, var10);
                  int discarded$39 = -8409;
                  vm.a(jg.field_g);
                  var22.a(112, 144, var22.field_t << 4, var22.field_x << 4, -((ba) this).field_R << 10, 4096);
                  int discarded$40 = 0;
                  ib.b();
                  jg.field_g.c(var5 + -var22.field_t, -var22.field_x + var6, 256);
                  return;
                }
              } else {
                jg.field_g = new nf(var9, var10);
                int discarded$41 = -8409;
                vm.a(jg.field_g);
                var22.a(112, 144, var22.field_t << 4, var22.field_x << 4, -((ba) this).field_R << 10, 4096);
                int discarded$42 = 0;
                ib.b();
                jg.field_g.c(var5 + -var22.field_t, -var22.field_x + var6, 256);
                return;
              }
            }
          } else {
            field_Q = null;
            var5 = (((ba) this).field_F >> 1) + (((ba) this).field_q + param3);
            var6 = (((ba) this).field_z >> 1) + param0 - -((ba) this).field_m;
            var8 = ((ba) this).field_S.a(-3621);
            if (var8 != ab.field_b) {
              if (qh.field_x != var8) {
                if (var8 != fb.field_e) {
                  if (var8 == nn.field_q) {
                    var18 = gg.field_q[1];
                    var18.c(var5 + -(var18.field_u >> 1), var6 + -(var18.field_w >> 1), 256);
                    return;
                  } else {
                    return;
                  }
                } else {
                  var17 = gg.field_q[2];
                  var17.c(-(var17.field_u >> 1) + var5, -(var17.field_w >> 1) + var6, 256);
                  return;
                }
              } else {
                var16 = gg.field_q[0];
                var14 = var16;
                var9 = var16.field_t << 1;
                var10 = var16.field_x << 1;
                if (jg.field_g != null) {
                  if (jg.field_g.field_u >= var9) {
                    if (var10 <= jg.field_g.field_w) {
                      int discarded$43 = -8409;
                      vm.a(jg.field_g);
                      fn.d();
                      var16.a(112, 144, var16.field_t << 4, var16.field_x << 4, -((ba) this).field_R << 10, 4096);
                      int discarded$44 = 0;
                      ib.b();
                      jg.field_g.c(var5 + -var16.field_t, -var16.field_x + var6, 256);
                      return;
                    } else {
                      jg.field_g = new nf(var9, var10);
                      int discarded$45 = -8409;
                      vm.a(jg.field_g);
                      var16.a(112, 144, var16.field_t << 4, var16.field_x << 4, -((ba) this).field_R << 10, 4096);
                      int discarded$46 = 0;
                      ib.b();
                      jg.field_g.c(var5 + -var16.field_t, -var16.field_x + var6, 256);
                      return;
                    }
                  } else {
                    jg.field_g = new nf(var9, var10);
                    int discarded$47 = -8409;
                    vm.a(jg.field_g);
                    var16.a(112, 144, var16.field_t << 4, var16.field_x << 4, -((ba) this).field_R << 10, 4096);
                    int discarded$48 = 0;
                    ib.b();
                    jg.field_g.c(var5 + -var16.field_t, -var16.field_x + var6, 256);
                    return;
                  }
                } else {
                  jg.field_g = new nf(var9, var10);
                  int discarded$49 = -8409;
                  vm.a(jg.field_g);
                  var16.a(112, 144, var16.field_t << 4, var16.field_x << 4, -((ba) this).field_R << 10, 4096);
                  int discarded$50 = 0;
                  ib.b();
                  jg.field_g.c(var5 + -var16.field_t, -var16.field_x + var6, 256);
                  return;
                }
              }
            } else {
              L0: {
                L1: {
                  var15 = gg.field_q[0];
                  var9 = var15.field_t << 1;
                  var10 = var15.field_x << 1;
                  if (jg.field_g == null) {
                    break L1;
                  } else {
                    if (jg.field_g.field_u < var9) {
                      break L1;
                    } else {
                      if (var10 > jg.field_g.field_w) {
                        break L1;
                      } else {
                        int discarded$51 = -8409;
                        vm.a(jg.field_g);
                        fn.d();
                        break L0;
                      }
                    }
                  }
                }
                jg.field_g = new nf(var9, var10);
                int discarded$52 = -8409;
                vm.a(jg.field_g);
                break L0;
              }
              var15.a(112, 144, var15.field_t << 4, var15.field_x << 4, -((ba) this).field_R << 10, 4096);
              int discarded$53 = 0;
              ib.b();
              jg.field_g.c(var5 + -var15.field_t, -var15.field_x + var6, 256);
              return;
            }
          }
        }
    }

    ba(dm param0) {
        try {
            ((ba) this).field_S = param0;
        } catch (RuntimeException runtimeException) {
            throw sd.a((Throwable) (Object) runtimeException, "ba.<init>(" + (param0 != null ? "{...}" : "null") + 41);
        }
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_Q = "Log in / Create account";
        field_T = "Your ship thrusts forwards automatically.";
        field_P = new int[8192];
    }
}
