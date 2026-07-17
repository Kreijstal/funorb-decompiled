/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class ah extends ts {
    static int field_T;
    static int field_P;
    static String field_O;
    static int field_X;
    static int field_R;
    private gk field_M;
    private bi field_V;
    private String field_W;
    private int field_N;
    static String field_Q;
    static String field_S;
    static int field_U;

    ah(gk param0, String param1, int param2, int param3, int param4, int param5) {
        super(param1, (iq) (Object) ea.b());
        int discarded$0 = 114;
        try {
            ((ah) this).field_M = param0;
            ((ah) this).field_W = param1;
            ((ah) this).a(param3, param5, (byte) 113, param2, param4);
        } catch (RuntimeException runtimeException) {
            throw r.a((Throwable) (Object) runtimeException, "ah.<init>(" + (param0 != null ? "{...}" : "null") + 44 + (param1 != null ? "{...}" : "null") + 44 + param2 + 44 + param3 + 44 + param4 + 44 + param5 + 41);
        }
    }

    final static int h(int param0) {
        if (param0 <= 92) {
            field_S = null;
            return rn.field_b;
        }
        return rn.field_b;
    }

    final void a(int param0, int param1, vg param2, byte param3) {
        try {
            ((ah) this).field_N = ((ah) this).field_N + 1;
            super.a(param0, param1, param2, param3);
        } catch (RuntimeException runtimeException) {
            throw r.a((Throwable) (Object) runtimeException, "ah.PA(" + param0 + 44 + param1 + 44 + (param2 != null ? "{...}" : "null") + 44 + param3 + 41);
        }
    }

    final void a(int param0, int param1, int param2, int param3) {
        String var5 = null;
        u var6 = null;
        Object var8 = null;
        int var9 = 0;
        int var10 = 0;
        int var11 = 0;
        int var12 = 0;
        int var13 = 0;
        bi var14 = null;
        bi var15 = null;
        bi var16 = null;
        pj var17 = null;
        var8 = null;
        var13 = ShatteredPlansClient.field_F ? 1 : 0;
        var6 = ((ah) this).field_M.c(126);
        if (var6 != pd.field_h) {
          if (var6 != lm.field_d) {
            var5 = ((ah) this).field_M.a((byte) -63);
            if (var5 != null) {
              L0: {
                if (!var5.equals((Object) (Object) ((ah) this).field_s)) {
                  ((ah) this).field_s = var5;
                  ((ah) this).e(false);
                  break L0;
                } else {
                  break L0;
                }
              }
              super.a(param0, param1, param2, param3);
              var6 = ((ah) this).field_M.c(-123);
              var17 = (pj) (Object) ((ah) this).field_p;
              var9 = ((ah) this).field_m + param3;
              var10 = var17.a(param2, (vg) this, 66) - -(var17.a((vg) this, true).b(438) >> 1);
              if (pd.field_h == var6) {
                L1: {
                  var14 = lp.field_w[0];
                  var11 = var14.field_o << 1;
                  var12 = var14.field_p << 1;
                  if (((ah) this).field_V == null) {
                    break L1;
                  } else {
                    if (((ah) this).field_V.field_z < var11) {
                      break L1;
                    } else {
                      if (((ah) this).field_V.field_w < var12) {
                        break L1;
                      } else {
                        aq.a((byte) 106, ((ah) this).field_V);
                        gf.b();
                        var14.b(112, 144, var14.field_o << 4, var14.field_p << 4, -((ah) this).field_N << 10, 4096);
                        ln.f((byte) -63);
                        ((ah) this).field_V.c(var9 + -(var14.field_o >> 1), -var14.field_p + var10, 256);
                        return;
                      }
                    }
                  }
                }
                ((ah) this).field_V = new bi(var11, var12);
                aq.a((byte) -31, ((ah) this).field_V);
                var14.b(112, 144, var14.field_o << 4, var14.field_p << 4, -((ah) this).field_N << 10, 4096);
                ln.f((byte) -63);
                ((ah) this).field_V.c(var9 + -(var14.field_o >> 1), -var14.field_p + var10, 256);
                return;
              } else {
                if (var6 != lm.field_d) {
                  L2: {
                    if (var6 == tj.field_b) {
                      var16 = lp.field_w[2];
                      var16.c(var9, var10 + -(var16.field_w >> 1), 256);
                      break L2;
                    } else {
                      if (p.field_g != var6) {
                        break L2;
                      } else {
                        var15 = lp.field_w[1];
                        var15.c(var9, -(var15.field_w >> 1) + var10, 256);
                        return;
                      }
                    }
                  }
                  return;
                } else {
                  var14 = lp.field_w[0];
                  var11 = var14.field_o << 1;
                  var12 = var14.field_p << 1;
                  if (((ah) this).field_V != null) {
                    L3: {
                      if (((ah) this).field_V.field_z < var11) {
                        break L3;
                      } else {
                        if (((ah) this).field_V.field_w < var12) {
                          break L3;
                        } else {
                          aq.a((byte) 106, ((ah) this).field_V);
                          gf.b();
                          var14.b(112, 144, var14.field_o << 4, var14.field_p << 4, -((ah) this).field_N << 10, 4096);
                          ln.f((byte) -63);
                          ((ah) this).field_V.c(var9 + -(var14.field_o >> 1), -var14.field_p + var10, 256);
                          return;
                        }
                      }
                    }
                    ((ah) this).field_V = new bi(var11, var12);
                    aq.a((byte) -31, ((ah) this).field_V);
                    var14.b(112, 144, var14.field_o << 4, var14.field_p << 4, -((ah) this).field_N << 10, 4096);
                    ln.f((byte) -63);
                    ((ah) this).field_V.c(var9 + -(var14.field_o >> 1), -var14.field_p + var10, 256);
                    return;
                  } else {
                    ((ah) this).field_V = new bi(var11, var12);
                    aq.a((byte) -31, ((ah) this).field_V);
                    var14.b(112, 144, var14.field_o << 4, var14.field_p << 4, -((ah) this).field_N << 10, 4096);
                    ln.f((byte) -63);
                    ((ah) this).field_V.c(var9 + -(var14.field_o >> 1), -var14.field_p + var10, 256);
                    return;
                  }
                }
              }
            } else {
              L4: {
                var5 = ((ah) this).field_W;
                if (!var5.equals((Object) (Object) ((ah) this).field_s)) {
                  ((ah) this).field_s = var5;
                  ((ah) this).e(false);
                  break L4;
                } else {
                  break L4;
                }
              }
              L5: {
                super.a(param0, param1, param2, param3);
                var6 = ((ah) this).field_M.c(-123);
                var17 = (pj) (Object) ((ah) this).field_p;
                var9 = ((ah) this).field_m + param3;
                var10 = var17.a(param2, (vg) this, 66) - -(var17.a((vg) this, true).b(438) >> 1);
                if (pd.field_h == var6) {
                  break L5;
                } else {
                  if (var6 != lm.field_d) {
                    if (var6 != tj.field_b) {
                      if (p.field_g == var6) {
                        var15 = lp.field_w[1];
                        var15.c(var9, -(var15.field_w >> 1) + var10, 256);
                        return;
                      } else {
                        return;
                      }
                    } else {
                      var16 = lp.field_w[2];
                      var16.c(var9, var10 + -(var16.field_w >> 1), 256);
                      return;
                    }
                  } else {
                    break L5;
                  }
                }
              }
              var14 = lp.field_w[0];
              var11 = var14.field_o << 1;
              var12 = var14.field_p << 1;
              if (((ah) this).field_V != null) {
                if (((ah) this).field_V.field_z >= var11) {
                  if (((ah) this).field_V.field_w < var12) {
                    ((ah) this).field_V = new bi(var11, var12);
                    aq.a((byte) -31, ((ah) this).field_V);
                    var14.b(112, 144, var14.field_o << 4, var14.field_p << 4, -((ah) this).field_N << 10, 4096);
                    ln.f((byte) -63);
                    ((ah) this).field_V.c(var9 + -(var14.field_o >> 1), -var14.field_p + var10, 256);
                    return;
                  } else {
                    aq.a((byte) 106, ((ah) this).field_V);
                    gf.b();
                    var14.b(112, 144, var14.field_o << 4, var14.field_p << 4, -((ah) this).field_N << 10, 4096);
                    ln.f((byte) -63);
                    ((ah) this).field_V.c(var9 + -(var14.field_o >> 1), -var14.field_p + var10, 256);
                    return;
                  }
                } else {
                  ((ah) this).field_V = new bi(var11, var12);
                  aq.a((byte) -31, ((ah) this).field_V);
                  var14.b(112, 144, var14.field_o << 4, var14.field_p << 4, -((ah) this).field_N << 10, 4096);
                  ln.f((byte) -63);
                  ((ah) this).field_V.c(var9 + -(var14.field_o >> 1), -var14.field_p + var10, 256);
                  return;
                }
              } else {
                ((ah) this).field_V = new bi(var11, var12);
                aq.a((byte) -31, ((ah) this).field_V);
                var14.b(112, 144, var14.field_o << 4, var14.field_p << 4, -((ah) this).field_N << 10, 4096);
                ln.f((byte) -63);
                ((ah) this).field_V.c(var9 + -(var14.field_o >> 1), -var14.field_p + var10, 256);
                return;
              }
            }
          } else {
            L6: {
              var5 = qr.field_R;
              if (!var5.equals((Object) (Object) ((ah) this).field_s)) {
                ((ah) this).field_s = var5;
                ((ah) this).e(false);
                break L6;
              } else {
                break L6;
              }
            }
            super.a(param0, param1, param2, param3);
            var6 = ((ah) this).field_M.c(-123);
            var17 = (pj) (Object) ((ah) this).field_p;
            var9 = ((ah) this).field_m + param3;
            var10 = var17.a(param2, (vg) this, 66) - -(var17.a((vg) this, true).b(438) >> 1);
            if (pd.field_h == var6) {
              var14 = lp.field_w[0];
              var11 = var14.field_o << 1;
              var12 = var14.field_p << 1;
              if (((ah) this).field_V != null) {
                if (((ah) this).field_V.field_z >= var11) {
                  if (((ah) this).field_V.field_w >= var12) {
                    aq.a((byte) 106, ((ah) this).field_V);
                    gf.b();
                    var14.b(112, 144, var14.field_o << 4, var14.field_p << 4, -((ah) this).field_N << 10, 4096);
                    ln.f((byte) -63);
                    ((ah) this).field_V.c(var9 + -(var14.field_o >> 1), -var14.field_p + var10, 256);
                    return;
                  } else {
                    ((ah) this).field_V = new bi(var11, var12);
                    aq.a((byte) -31, ((ah) this).field_V);
                    var14.b(112, 144, var14.field_o << 4, var14.field_p << 4, -((ah) this).field_N << 10, 4096);
                    ln.f((byte) -63);
                    ((ah) this).field_V.c(var9 + -(var14.field_o >> 1), -var14.field_p + var10, 256);
                    return;
                  }
                } else {
                  ((ah) this).field_V = new bi(var11, var12);
                  aq.a((byte) -31, ((ah) this).field_V);
                  var14.b(112, 144, var14.field_o << 4, var14.field_p << 4, -((ah) this).field_N << 10, 4096);
                  ln.f((byte) -63);
                  ((ah) this).field_V.c(var9 + -(var14.field_o >> 1), -var14.field_p + var10, 256);
                  return;
                }
              } else {
                ((ah) this).field_V = new bi(var11, var12);
                aq.a((byte) -31, ((ah) this).field_V);
                var14.b(112, 144, var14.field_o << 4, var14.field_p << 4, -((ah) this).field_N << 10, 4096);
                ln.f((byte) -63);
                ((ah) this).field_V.c(var9 + -(var14.field_o >> 1), -var14.field_p + var10, 256);
                return;
              }
            } else {
              if (var6 != lm.field_d) {
                if (var6 != tj.field_b) {
                  if (p.field_g != var6) {
                    return;
                  } else {
                    var15 = lp.field_w[1];
                    var15.c(var9, -(var15.field_w >> 1) + var10, 256);
                    return;
                  }
                } else {
                  var16 = lp.field_w[2];
                  var16.c(var9, var10 + -(var16.field_w >> 1), 256);
                  return;
                }
              } else {
                L7: {
                  L8: {
                    var14 = lp.field_w[0];
                    var11 = var14.field_o << 1;
                    var12 = var14.field_p << 1;
                    if (((ah) this).field_V == null) {
                      break L8;
                    } else {
                      if (((ah) this).field_V.field_z < var11) {
                        break L8;
                      } else {
                        if (((ah) this).field_V.field_w < var12) {
                          break L8;
                        } else {
                          aq.a((byte) 106, ((ah) this).field_V);
                          gf.b();
                          break L7;
                        }
                      }
                    }
                  }
                  ((ah) this).field_V = new bi(var11, var12);
                  aq.a((byte) -31, ((ah) this).field_V);
                  break L7;
                }
                var14.b(112, 144, var14.field_o << 4, var14.field_p << 4, -((ah) this).field_N << 10, 4096);
                ln.f((byte) -63);
                ((ah) this).field_V.c(var9 + -(var14.field_o >> 1), -var14.field_p + var10, 256);
                return;
              }
            }
          }
        } else {
          L9: {
            var5 = qr.field_R;
            if (!var5.equals((Object) (Object) ((ah) this).field_s)) {
              ((ah) this).field_s = var5;
              ((ah) this).e(false);
              break L9;
            } else {
              break L9;
            }
          }
          super.a(param0, param1, param2, param3);
          var6 = ((ah) this).field_M.c(-123);
          var17 = (pj) (Object) ((ah) this).field_p;
          var9 = ((ah) this).field_m + param3;
          var10 = var17.a(param2, (vg) this, 66) - -(var17.a((vg) this, true).b(438) >> 1);
          if (pd.field_h == var6) {
            var14 = lp.field_w[0];
            var11 = var14.field_o << 1;
            var12 = var14.field_p << 1;
            if (((ah) this).field_V != null) {
              if (((ah) this).field_V.field_z >= var11) {
                if (((ah) this).field_V.field_w >= var12) {
                  aq.a((byte) 106, ((ah) this).field_V);
                  gf.b();
                  var14.b(112, 144, var14.field_o << 4, var14.field_p << 4, -((ah) this).field_N << 10, 4096);
                  ln.f((byte) -63);
                  ((ah) this).field_V.c(var9 + -(var14.field_o >> 1), -var14.field_p + var10, 256);
                  return;
                } else {
                  ((ah) this).field_V = new bi(var11, var12);
                  aq.a((byte) -31, ((ah) this).field_V);
                  var14.b(112, 144, var14.field_o << 4, var14.field_p << 4, -((ah) this).field_N << 10, 4096);
                  ln.f((byte) -63);
                  ((ah) this).field_V.c(var9 + -(var14.field_o >> 1), -var14.field_p + var10, 256);
                  return;
                }
              } else {
                ((ah) this).field_V = new bi(var11, var12);
                aq.a((byte) -31, ((ah) this).field_V);
                var14.b(112, 144, var14.field_o << 4, var14.field_p << 4, -((ah) this).field_N << 10, 4096);
                ln.f((byte) -63);
                ((ah) this).field_V.c(var9 + -(var14.field_o >> 1), -var14.field_p + var10, 256);
                return;
              }
            } else {
              ((ah) this).field_V = new bi(var11, var12);
              aq.a((byte) -31, ((ah) this).field_V);
              var14.b(112, 144, var14.field_o << 4, var14.field_p << 4, -((ah) this).field_N << 10, 4096);
              ln.f((byte) -63);
              ((ah) this).field_V.c(var9 + -(var14.field_o >> 1), -var14.field_p + var10, 256);
              return;
            }
          } else {
            if (var6 != lm.field_d) {
              if (var6 != tj.field_b) {
                if (p.field_g == var6) {
                  var15 = lp.field_w[1];
                  var15.c(var9, -(var15.field_w >> 1) + var10, 256);
                  return;
                } else {
                  return;
                }
              } else {
                var16 = lp.field_w[2];
                var16.c(var9, var10 + -(var16.field_w >> 1), 256);
                return;
              }
            } else {
              L10: {
                L11: {
                  var14 = lp.field_w[0];
                  var11 = var14.field_o << 1;
                  var12 = var14.field_p << 1;
                  if (((ah) this).field_V == null) {
                    break L11;
                  } else {
                    if (((ah) this).field_V.field_z < var11) {
                      break L11;
                    } else {
                      if (((ah) this).field_V.field_w < var12) {
                        break L11;
                      } else {
                        aq.a((byte) 106, ((ah) this).field_V);
                        gf.b();
                        break L10;
                      }
                    }
                  }
                }
                ((ah) this).field_V = new bi(var11, var12);
                aq.a((byte) -31, ((ah) this).field_V);
                break L10;
              }
              var14.b(112, 144, var14.field_o << 4, var14.field_p << 4, -((ah) this).field_N << 10, 4096);
              ln.f((byte) -63);
              ((ah) this).field_V.c(var9 + -(var14.field_o >> 1), -var14.field_p + var10, 256);
              return;
            }
          }
        }
    }

    final boolean a(byte param0, vg param1) {
        int var3_int = 0;
        RuntimeException var3 = null;
        int stackIn_1_0 = 0;
        RuntimeException stackIn_3_0 = null;
        StringBuilder stackIn_3_1 = null;
        RuntimeException stackIn_4_0 = null;
        StringBuilder stackIn_4_1 = null;
        RuntimeException stackIn_5_0 = null;
        StringBuilder stackIn_5_1 = null;
        String stackIn_5_2 = null;
        RuntimeException decompiledCaughtException = null;
        int stackOut_0_0 = 0;
        RuntimeException stackOut_2_0 = null;
        StringBuilder stackOut_2_1 = null;
        RuntimeException stackOut_4_0 = null;
        StringBuilder stackOut_4_1 = null;
        String stackOut_4_2 = null;
        RuntimeException stackOut_3_0 = null;
        StringBuilder stackOut_3_1 = null;
        String stackOut_3_2 = null;
        try {
          L0: {
            var3_int = -79 / ((param0 - 61) / 59);
            stackOut_0_0 = 0;
            stackIn_1_0 = stackOut_0_0;
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L1: {
            var3 = decompiledCaughtException;
            stackOut_2_0 = (RuntimeException) var3;
            stackOut_2_1 = new StringBuilder().append("ah.CA(").append(param0).append(44);
            stackIn_4_0 = stackOut_2_0;
            stackIn_4_1 = stackOut_2_1;
            stackIn_3_0 = stackOut_2_0;
            stackIn_3_1 = stackOut_2_1;
            if (param1 == null) {
              stackOut_4_0 = (RuntimeException) (Object) stackIn_4_0;
              stackOut_4_1 = (StringBuilder) (Object) stackIn_4_1;
              stackOut_4_2 = "null";
              stackIn_5_0 = stackOut_4_0;
              stackIn_5_1 = stackOut_4_1;
              stackIn_5_2 = stackOut_4_2;
              break L1;
            } else {
              stackOut_3_0 = (RuntimeException) (Object) stackIn_3_0;
              stackOut_3_1 = (StringBuilder) (Object) stackIn_3_1;
              stackOut_3_2 = "{...}";
              stackIn_5_0 = stackOut_3_0;
              stackIn_5_1 = stackOut_3_1;
              stackIn_5_2 = stackOut_3_2;
              break L1;
            }
          }
          throw r.a((Throwable) (Object) stackIn_5_0, stackIn_5_2 + 41);
        }
        return stackIn_1_0 != 0;
    }

    final static void g() {
        int[] var1 = null;
        RuntimeException var1_ref = null;
        int var2 = 0;
        int var3 = 0;
        int var4 = 0;
        int var5 = 0;
        int[] var6 = null;
        RuntimeException decompiledCaughtException = null;
        var5 = ShatteredPlansClient.field_F ? 1 : 0;
        try {
          L0: {
            var6 = gd.field_b;
            var1 = var6;
            var3 = 0;
            var2 = 0;
            var4 = var6.length;
            L1: while (true) {
              if (var4 <= var2) {
                break L0;
              } else {
                int incrementValue$40 = var2;
                var2++;
                var6[incrementValue$40] = 0;
                int incrementValue$41 = var2;
                var2++;
                var6[incrementValue$41] = 0;
                int incrementValue$42 = var2;
                var2++;
                var6[incrementValue$42] = 0;
                int incrementValue$43 = var2;
                var2++;
                var6[incrementValue$43] = 0;
                int incrementValue$44 = var2;
                var2++;
                var6[incrementValue$44] = 0;
                int incrementValue$45 = var2;
                var2++;
                var6[incrementValue$45] = 0;
                int incrementValue$46 = var2;
                var2++;
                var6[incrementValue$46] = 0;
                int incrementValue$47 = var2;
                var2++;
                var6[incrementValue$47] = 0;
                continue L1;
              }
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var1_ref = decompiledCaughtException;
          throw r.a((Throwable) (Object) var1_ref, "ah.A(" + 111 + 41);
        }
    }

    final String c(boolean param0) {
        if (param0) {
            return null;
        }
        ((ah) this).field_N = -109;
        return null;
    }

    public static void i() {
        field_S = null;
        field_Q = null;
        field_O = null;
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_O = "Hide lobby chat";
        field_T = 0;
        field_U = 0;
        field_Q = "Human Players";
    }
}
