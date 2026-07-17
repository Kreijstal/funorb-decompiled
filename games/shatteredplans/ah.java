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
        super(param1, (iq) (Object) ea.b(114));
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
        pj var8 = null;
        int var9 = 0;
        int var10 = 0;
        int var11 = 0;
        int var12 = 0;
        int var13 = 0;
        bi var17 = null;
        bi var18 = null;
        bi var19 = null;
        bi var20 = null;
        bi var21 = null;
        bi var22 = null;
        bi var23 = null;
        bi var24 = null;
        bi var25 = null;
        bi var26 = null;
        bi var27 = null;
        bi var28 = null;
        bi var29 = null;
        bi var30 = null;
        bi var31 = null;
        bi var32 = null;
        bi var33 = null;
        bi var34 = null;
        bi var35 = null;
        bi var36 = null;
        bi var37 = null;
        bi var38 = null;
        L0: {
          L1: {
            L2: {
              L3: {
                var13 = ShatteredPlansClient.field_F ? 1 : 0;
                var6 = ((ah) this).field_M.c(126);
                if (var6 == pd.field_h) {
                  break L3;
                } else {
                  if (var6 == lm.field_d) {
                    break L3;
                  } else {
                    var5 = ((ah) this).field_M.a((byte) -63);
                    if (var5 == null) {
                      var5 = ((ah) this).field_W;
                      if (var13 == 0) {
                        break L2;
                      } else {
                        break L3;
                      }
                    } else {
                      if (!var5.equals((Object) (Object) ((ah) this).field_s)) {
                        break L1;
                      } else {
                        break L0;
                      }
                    }
                  }
                }
              }
              var5 = qr.field_R;
              break L2;
            }
            if (!var5.equals((Object) (Object) ((ah) this).field_s)) {
              break L1;
            } else {
              break L0;
            }
          }
          ((ah) this).field_s = var5;
          ((ah) this).e(false);
          break L0;
        }
        super.a(param0, param1, param2, param3);
        var6 = ((ah) this).field_M.c(-123);
        var8 = (pj) (Object) ((ah) this).field_p;
        var9 = ((ah) this).field_m + param3;
        var10 = var8.a(param2, (vg) this, 66) - -(var8.a((vg) this, true).b(438) >> 1);
        if (pd.field_h == var6) {
          var28 = lp.field_w[0];
          var11 = var28.field_o << 1;
          var12 = var28.field_p << 1;
          if (((ah) this).field_V != null) {
            if (((ah) this).field_V.field_z >= var11) {
              if (((ah) this).field_V.field_w >= var12) {
                aq.a((byte) 106, ((ah) this).field_V);
                gf.b();
                if (var13 != 0) {
                  L4: {
                    L5: {
                      ((ah) this).field_V = new bi(var11, var12);
                      aq.a((byte) -31, ((ah) this).field_V);
                      var28.b(112, 144, var28.field_o << 4, var28.field_p << 4, -((ah) this).field_N << 10, 4096);
                      ln.f((byte) -63);
                      ((ah) this).field_V.c(var9 + -(var28.field_o >> 1), -var28.field_p + var10, 256);
                      if (var6 == tj.field_b) {
                        break L5;
                      } else {
                        if (p.field_g != var6) {
                          break L4;
                        } else {
                          var33 = lp.field_w[1];
                          var33.c(var9, -(var33.field_w >> 1) + var10, 256);
                          break L5;
                        }
                      }
                    }
                    var34 = lp.field_w[2];
                    var34.c(var9, var10 + -(var34.field_w >> 1), 256);
                    break L4;
                  }
                  return;
                } else {
                  L6: {
                    var28.b(112, 144, var28.field_o << 4, var28.field_p << 4, -((ah) this).field_N << 10, 4096);
                    ln.f((byte) -63);
                    ((ah) this).field_V.c(var9 + -(var28.field_o >> 1), -var28.field_p + var10, 256);
                    if (var13 == 0) {
                      break L6;
                    } else {
                      L7: {
                        if (var6 == tj.field_b) {
                          break L7;
                        } else {
                          if (p.field_g != var6) {
                            break L6;
                          } else {
                            var37 = lp.field_w[1];
                            var37.c(var9, -(var37.field_w >> 1) + var10, 256);
                            break L7;
                          }
                        }
                      }
                      var38 = lp.field_w[2];
                      var38.c(var9, var10 + -(var38.field_w >> 1), 256);
                      break L6;
                    }
                  }
                  return;
                }
              } else {
                L8: {
                  ((ah) this).field_V = new bi(var11, var12);
                  aq.a((byte) -31, ((ah) this).field_V);
                  var28.b(112, 144, var28.field_o << 4, var28.field_p << 4, -((ah) this).field_N << 10, 4096);
                  ln.f((byte) -63);
                  ((ah) this).field_V.c(var9 + -(var28.field_o >> 1), -var28.field_p + var10, 256);
                  if (var13 == 0) {
                    break L8;
                  } else {
                    L9: {
                      if (var6 == tj.field_b) {
                        break L9;
                      } else {
                        if (p.field_g != var6) {
                          break L8;
                        } else {
                          var35 = lp.field_w[1];
                          var35.c(var9, -(var35.field_w >> 1) + var10, 256);
                          break L9;
                        }
                      }
                    }
                    var36 = lp.field_w[2];
                    var36.c(var9, var10 + -(var36.field_w >> 1), 256);
                    break L8;
                  }
                }
                return;
              }
            } else {
              L10: {
                ((ah) this).field_V = new bi(var11, var12);
                aq.a((byte) -31, ((ah) this).field_V);
                var28.b(112, 144, var28.field_o << 4, var28.field_p << 4, -((ah) this).field_N << 10, 4096);
                ln.f((byte) -63);
                ((ah) this).field_V.c(var9 + -(var28.field_o >> 1), -var28.field_p + var10, 256);
                if (var13 == 0) {
                  break L10;
                } else {
                  L11: {
                    if (var6 == tj.field_b) {
                      break L11;
                    } else {
                      if (p.field_g != var6) {
                        break L10;
                      } else {
                        var31 = lp.field_w[1];
                        var31.c(var9, -(var31.field_w >> 1) + var10, 256);
                        break L11;
                      }
                    }
                  }
                  var32 = lp.field_w[2];
                  var32.c(var9, var10 + -(var32.field_w >> 1), 256);
                  break L10;
                }
              }
              return;
            }
          } else {
            L12: {
              ((ah) this).field_V = new bi(var11, var12);
              aq.a((byte) -31, ((ah) this).field_V);
              var28.b(112, 144, var28.field_o << 4, var28.field_p << 4, -((ah) this).field_N << 10, 4096);
              ln.f((byte) -63);
              ((ah) this).field_V.c(var9 + -(var28.field_o >> 1), -var28.field_p + var10, 256);
              if (var13 == 0) {
                break L12;
              } else {
                L13: {
                  if (var6 == tj.field_b) {
                    break L13;
                  } else {
                    if (p.field_g != var6) {
                      break L12;
                    } else {
                      var29 = lp.field_w[1];
                      var29.c(var9, -(var29.field_w >> 1) + var10, 256);
                      break L13;
                    }
                  }
                }
                var30 = lp.field_w[2];
                var30.c(var9, var10 + -(var30.field_w >> 1), 256);
                break L12;
              }
            }
            return;
          }
        } else {
          if (var6 == lm.field_d) {
            var17 = lp.field_w[0];
            var11 = var17.field_o << 1;
            var12 = var17.field_p << 1;
            if (((ah) this).field_V != null) {
              if (((ah) this).field_V.field_z >= var11) {
                if (((ah) this).field_V.field_w >= var12) {
                  aq.a((byte) 106, ((ah) this).field_V);
                  gf.b();
                  if (var13 != 0) {
                    L14: {
                      L15: {
                        ((ah) this).field_V = new bi(var11, var12);
                        aq.a((byte) -31, ((ah) this).field_V);
                        var17.b(112, 144, var17.field_o << 4, var17.field_p << 4, -((ah) this).field_N << 10, 4096);
                        ln.f((byte) -63);
                        ((ah) this).field_V.c(var9 + -(var17.field_o >> 1), -var17.field_p + var10, 256);
                        if (var6 == tj.field_b) {
                          break L15;
                        } else {
                          if (p.field_g != var6) {
                            break L14;
                          } else {
                            var22 = lp.field_w[1];
                            var22.c(var9, -(var22.field_w >> 1) + var10, 256);
                            break L15;
                          }
                        }
                      }
                      var23 = lp.field_w[2];
                      var23.c(var9, var10 + -(var23.field_w >> 1), 256);
                      break L14;
                    }
                    return;
                  } else {
                    L16: {
                      var17.b(112, 144, var17.field_o << 4, var17.field_p << 4, -((ah) this).field_N << 10, 4096);
                      ln.f((byte) -63);
                      ((ah) this).field_V.c(var9 + -(var17.field_o >> 1), -var17.field_p + var10, 256);
                      if (var13 == 0) {
                        break L16;
                      } else {
                        L17: {
                          if (var6 == tj.field_b) {
                            break L17;
                          } else {
                            if (p.field_g != var6) {
                              break L16;
                            } else {
                              var26 = lp.field_w[1];
                              var26.c(var9, -(var26.field_w >> 1) + var10, 256);
                              break L17;
                            }
                          }
                        }
                        var27 = lp.field_w[2];
                        var27.c(var9, var10 + -(var27.field_w >> 1), 256);
                        break L16;
                      }
                    }
                    return;
                  }
                } else {
                  L18: {
                    ((ah) this).field_V = new bi(var11, var12);
                    aq.a((byte) -31, ((ah) this).field_V);
                    var17.b(112, 144, var17.field_o << 4, var17.field_p << 4, -((ah) this).field_N << 10, 4096);
                    ln.f((byte) -63);
                    ((ah) this).field_V.c(var9 + -(var17.field_o >> 1), -var17.field_p + var10, 256);
                    if (var13 == 0) {
                      break L18;
                    } else {
                      L19: {
                        if (var6 == tj.field_b) {
                          break L19;
                        } else {
                          if (p.field_g != var6) {
                            break L18;
                          } else {
                            var24 = lp.field_w[1];
                            var24.c(var9, -(var24.field_w >> 1) + var10, 256);
                            break L19;
                          }
                        }
                      }
                      var25 = lp.field_w[2];
                      var25.c(var9, var10 + -(var25.field_w >> 1), 256);
                      break L18;
                    }
                  }
                  return;
                }
              } else {
                L20: {
                  ((ah) this).field_V = new bi(var11, var12);
                  aq.a((byte) -31, ((ah) this).field_V);
                  var17.b(112, 144, var17.field_o << 4, var17.field_p << 4, -((ah) this).field_N << 10, 4096);
                  ln.f((byte) -63);
                  ((ah) this).field_V.c(var9 + -(var17.field_o >> 1), -var17.field_p + var10, 256);
                  if (var13 == 0) {
                    break L20;
                  } else {
                    L21: {
                      if (var6 == tj.field_b) {
                        break L21;
                      } else {
                        if (p.field_g != var6) {
                          break L20;
                        } else {
                          var20 = lp.field_w[1];
                          var20.c(var9, -(var20.field_w >> 1) + var10, 256);
                          break L21;
                        }
                      }
                    }
                    var21 = lp.field_w[2];
                    var21.c(var9, var10 + -(var21.field_w >> 1), 256);
                    break L20;
                  }
                }
                return;
              }
            } else {
              L22: {
                ((ah) this).field_V = new bi(var11, var12);
                aq.a((byte) -31, ((ah) this).field_V);
                var17.b(112, 144, var17.field_o << 4, var17.field_p << 4, -((ah) this).field_N << 10, 4096);
                ln.f((byte) -63);
                ((ah) this).field_V.c(var9 + -(var17.field_o >> 1), -var17.field_p + var10, 256);
                if (var13 == 0) {
                  break L22;
                } else {
                  L23: {
                    if (var6 == tj.field_b) {
                      break L23;
                    } else {
                      if (p.field_g != var6) {
                        break L22;
                      } else {
                        var18 = lp.field_w[1];
                        var18.c(var9, -(var18.field_w >> 1) + var10, 256);
                        break L23;
                      }
                    }
                  }
                  var19 = lp.field_w[2];
                  var19.c(var9, var10 + -(var19.field_w >> 1), 256);
                  break L22;
                }
              }
              return;
            }
          } else {
            L24: {
              L25: {
                if (var6 == tj.field_b) {
                  break L25;
                } else {
                  if (p.field_g != var6) {
                    break L24;
                  } else {
                    var37 = lp.field_w[1];
                    var37.c(var9, -(var37.field_w >> 1) + var10, 256);
                    if (var13 == 0) {
                      break L24;
                    } else {
                      break L25;
                    }
                  }
                }
              }
              var38 = lp.field_w[2];
              var38.c(var9, var10 + -(var38.field_w >> 1), 256);
              break L24;
            }
            return;
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

    final static void g(byte param0) {
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
            var3 = -98 % ((param0 - 2) / 53);
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
                if (var5 == 0) {
                  continue L1;
                } else {
                  return;
                }
              }
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var1_ref = decompiledCaughtException;
          throw r.a((Throwable) (Object) var1_ref, "ah.A(" + param0 + 41);
        }
    }

    final String c(boolean param0) {
        if (param0) {
            return null;
        }
        ((ah) this).field_N = -109;
        return null;
    }

    public static void i(int param0) {
        field_S = null;
        field_Q = null;
        if (param0 != 4096) {
            field_S = null;
            field_O = null;
            return;
        }
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
