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
        if (param1 != 418) {
            ((ba) this).field_R = 95;
            return false;
        }
        return false;
    }

    final static ck h(byte param0) {
        try {
            Throwable var1 = null;
            ck stackIn_3_0 = null;
            Throwable decompiledCaughtException = null;
            ck stackOut_2_0 = null;
            try {
              L0: {
                if (param0 >= 102) {
                  break L0;
                } else {
                  field_T = null;
                  break L0;
                }
              }
              stackOut_2_0 = (ck) Class.forName("tc").newInstance();
              stackIn_3_0 = stackOut_2_0;
            } catch (java.lang.Throwable decompiledCaughtParameter) {
              decompiledCaughtException = decompiledCaughtParameter;
              return stackIn_3_0;
            }
        } catch (RuntimeException | Error decompiledUncheckedException) {
            throw decompiledUncheckedException;
        } catch (Throwable decompiledCheckedException) {
            throw new RuntimeException(decompiledCheckedException);
        }
        return null;
    }

    final void a(fj param0, int param1, int param2, int param3) {
        ((ba) this).field_R = ((ba) this).field_R + 1;
        super.a(param0, param1, param2, param3);
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
            var5 = (((ba) this).field_F >> -107815871) + (((ba) this).field_q + param3);
            var6 = (((ba) this).field_z >> -782945887) + param0 - -((ba) this).field_m;
            var8 = ((ba) this).field_S.a(-3621);
            if (var8 != ab.field_b) {
              if (qh.field_x != var8) {
                if (var8 != fb.field_e) {
                  if (var8 != nn.field_q) {
                    return;
                  } else {
                    var21 = gg.field_q[1];
                    var21.c(var5 + -(var21.field_u >> -1289104255), var6 + -(var21.field_w >> 1167864865), 256);
                    return;
                  }
                } else {
                  var20 = gg.field_q[2];
                  var20.c(-(var20.field_u >> 1460538689) + var5, -(var20.field_w >> 1871911905) + var6, 256);
                  return;
                }
              } else {
                var22 = gg.field_q[0];
                var9 = var22.field_t << 1099972737;
                var10 = var22.field_x << 1786172929;
                if (jg.field_g != null) {
                  if (jg.field_g.field_u >= var9) {
                    if (var10 <= jg.field_g.field_w) {
                      vm.a(jg.field_g, -8409);
                      fn.d();
                      var22.a(112, 144, var22.field_t << 1943676548, var22.field_x << -1434706236, -((ba) this).field_R << 994309034, 4096);
                      ib.b(false);
                      jg.field_g.c(var5 + -var22.field_t, -var22.field_x + var6, 256);
                      return;
                    } else {
                      jg.field_g = new nf(var9, var10);
                      vm.a(jg.field_g, -8409);
                      var22.a(112, 144, var22.field_t << 1943676548, var22.field_x << -1434706236, -((ba) this).field_R << 994309034, 4096);
                      ib.b(false);
                      jg.field_g.c(var5 + -var22.field_t, -var22.field_x + var6, 256);
                      return;
                    }
                  } else {
                    jg.field_g = new nf(var9, var10);
                    vm.a(jg.field_g, -8409);
                    var22.a(112, 144, var22.field_t << 1943676548, var22.field_x << -1434706236, -((ba) this).field_R << 994309034, 4096);
                    ib.b(false);
                    jg.field_g.c(var5 + -var22.field_t, -var22.field_x + var6, 256);
                    return;
                  }
                } else {
                  jg.field_g = new nf(var9, var10);
                  vm.a(jg.field_g, -8409);
                  var22.a(112, 144, var22.field_t << 1943676548, var22.field_x << -1434706236, -((ba) this).field_R << 994309034, 4096);
                  ib.b(false);
                  jg.field_g.c(var5 + -var22.field_t, -var22.field_x + var6, 256);
                  return;
                }
              }
            } else {
              var22 = gg.field_q[0];
              var9 = var22.field_t << 1099972737;
              var10 = var22.field_x << 1786172929;
              if (jg.field_g != null) {
                if (jg.field_g.field_u >= var9) {
                  if (var10 <= jg.field_g.field_w) {
                    vm.a(jg.field_g, -8409);
                    fn.d();
                    var22.a(112, 144, var22.field_t << 1943676548, var22.field_x << -1434706236, -((ba) this).field_R << 994309034, 4096);
                    ib.b(false);
                    jg.field_g.c(var5 + -var22.field_t, -var22.field_x + var6, 256);
                    return;
                  } else {
                    jg.field_g = new nf(var9, var10);
                    vm.a(jg.field_g, -8409);
                    var22.a(112, 144, var22.field_t << 1943676548, var22.field_x << -1434706236, -((ba) this).field_R << 994309034, 4096);
                    ib.b(false);
                    jg.field_g.c(var5 + -var22.field_t, -var22.field_x + var6, 256);
                    return;
                  }
                } else {
                  jg.field_g = new nf(var9, var10);
                  vm.a(jg.field_g, -8409);
                  var22.a(112, 144, var22.field_t << 1943676548, var22.field_x << -1434706236, -((ba) this).field_R << 994309034, 4096);
                  ib.b(false);
                  jg.field_g.c(var5 + -var22.field_t, -var22.field_x + var6, 256);
                  return;
                }
              } else {
                jg.field_g = new nf(var9, var10);
                vm.a(jg.field_g, -8409);
                var22.a(112, 144, var22.field_t << 1943676548, var22.field_x << -1434706236, -((ba) this).field_R << 994309034, 4096);
                ib.b(false);
                jg.field_g.c(var5 + -var22.field_t, -var22.field_x + var6, 256);
                return;
              }
            }
          } else {
            field_Q = null;
            var5 = (((ba) this).field_F >> -107815871) + (((ba) this).field_q + param3);
            var6 = (((ba) this).field_z >> -782945887) + param0 - -((ba) this).field_m;
            var8 = ((ba) this).field_S.a(-3621);
            if (var8 != ab.field_b) {
              if (qh.field_x != var8) {
                if (var8 != fb.field_e) {
                  if (var8 == nn.field_q) {
                    var18 = gg.field_q[1];
                    var18.c(var5 + -(var18.field_u >> -1289104255), var6 + -(var18.field_w >> 1167864865), 256);
                    return;
                  } else {
                    return;
                  }
                } else {
                  var17 = gg.field_q[2];
                  var17.c(-(var17.field_u >> 1460538689) + var5, -(var17.field_w >> 1871911905) + var6, 256);
                  return;
                }
              } else {
                var16 = gg.field_q[0];
                var14 = var16;
                var9 = var16.field_t << 1099972737;
                var10 = var16.field_x << 1786172929;
                if (jg.field_g != null) {
                  if (jg.field_g.field_u >= var9) {
                    if (var10 <= jg.field_g.field_w) {
                      vm.a(jg.field_g, -8409);
                      fn.d();
                      var16.a(112, 144, var16.field_t << 1943676548, var16.field_x << -1434706236, -((ba) this).field_R << 994309034, 4096);
                      ib.b(false);
                      jg.field_g.c(var5 + -var16.field_t, -var16.field_x + var6, 256);
                      return;
                    } else {
                      jg.field_g = new nf(var9, var10);
                      vm.a(jg.field_g, -8409);
                      var16.a(112, 144, var16.field_t << 1943676548, var16.field_x << -1434706236, -((ba) this).field_R << 994309034, 4096);
                      ib.b(false);
                      jg.field_g.c(var5 + -var16.field_t, -var16.field_x + var6, 256);
                      return;
                    }
                  } else {
                    jg.field_g = new nf(var9, var10);
                    vm.a(jg.field_g, -8409);
                    var16.a(112, 144, var16.field_t << 1943676548, var16.field_x << -1434706236, -((ba) this).field_R << 994309034, 4096);
                    ib.b(false);
                    jg.field_g.c(var5 + -var16.field_t, -var16.field_x + var6, 256);
                    return;
                  }
                } else {
                  jg.field_g = new nf(var9, var10);
                  vm.a(jg.field_g, -8409);
                  var16.a(112, 144, var16.field_t << 1943676548, var16.field_x << -1434706236, -((ba) this).field_R << 994309034, 4096);
                  ib.b(false);
                  jg.field_g.c(var5 + -var16.field_t, -var16.field_x + var6, 256);
                  return;
                }
              }
            } else {
              L0: {
                L1: {
                  var15 = gg.field_q[0];
                  var9 = var15.field_t << 1099972737;
                  var10 = var15.field_x << 1786172929;
                  if (jg.field_g == null) {
                    break L1;
                  } else {
                    if (jg.field_g.field_u < var9) {
                      break L1;
                    } else {
                      if (var10 > jg.field_g.field_w) {
                        break L1;
                      } else {
                        vm.a(jg.field_g, -8409);
                        fn.d();
                        break L0;
                      }
                    }
                  }
                }
                jg.field_g = new nf(var9, var10);
                vm.a(jg.field_g, -8409);
                break L0;
              }
              var15.a(112, 144, var15.field_t << 1943676548, var15.field_x << -1434706236, -((ba) this).field_R << 994309034, 4096);
              ib.b(false);
              jg.field_g.c(var5 + -var15.field_t, -var15.field_x + var6, 256);
              return;
            }
          }
        }
    }

    ba(dm param0) {
        ((ba) this).field_S = param0;
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
