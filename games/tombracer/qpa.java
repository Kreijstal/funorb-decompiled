/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class qpa implements bo {
    private int field_a;
    static jea field_b;
    private int field_c;

    public static void a(boolean param0) {
        field_b = null;
        if (param0) {
            field_b = (jea) null;
        }
    }

    public final void a(int param0, kh param1) {
        try {
            param1.i(this.field_a, param0 + -200);
            if (param0 != 200) {
                this.field_a = -84;
            }
            param1.i(this.field_c, 0);
        } catch (RuntimeException runtimeException) {
            throw tba.a((Throwable) ((Object) runtimeException), "qpa.B(" + param0 + ',' + (param1 != null ? "{...}" : "null") + ')');
        }
    }

    final void b(int param0, int param1) {
        this.field_a = param0;
        int var3 = 28 % ((-35 - param1) / 61);
    }

    public final void a(kh param0, byte param1) {
        try {
            this.field_a = param0.h(255);
            if (param1 != -19) {
                qpa.a(false);
            }
            this.field_c = param0.h(255);
        } catch (RuntimeException runtimeException) {
            throw tba.a((Throwable) ((Object) runtimeException), "qpa.A(" + (param0 != null ? "{...}" : "null") + ',' + param1 + ')');
        }
    }

    final void a(int param0, int param1) {
        if (param0 != 7) {
            kh var4 = (kh) null;
            this.a((kh) null, (byte) -41);
            this.field_c = param1;
            return;
        }
        this.field_c = param1;
    }

    final static void a(int param0, int[] param1, int param2, int param3, int param4, int param5, int param6) {
        RuntimeException var7 = null;
        int var8 = 0;
        RuntimeException stackIn_42_0 = null;
        StringBuilder stackIn_42_1 = null;
        RuntimeException stackIn_43_0 = null;
        StringBuilder stackIn_43_1 = null;
        RuntimeException stackIn_44_0 = null;
        StringBuilder stackIn_44_1 = null;
        String stackIn_44_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException stackOut_41_0 = null;
        StringBuilder stackOut_41_1 = null;
        RuntimeException stackOut_43_0 = null;
        StringBuilder stackOut_43_1 = null;
        String stackOut_43_2 = null;
        RuntimeException stackOut_42_0 = null;
        StringBuilder stackOut_42_1 = null;
        String stackOut_42_2 = null;
        var8 = TombRacer.field_G ? 1 : 0;
        try {
          L0: {
            L1: {
              if (param5 >= 123) {
                break L1;
              } else {
                qpa.a(true);
                break L1;
              }
            }
            L2: {
              L3: {
                if (-1 != (param2 ^ -1)) {
                  break L3;
                } else {
                  uw.field_g[param2] = (wv) ((Object) new sv(param2, param6, param4, param0, param3, param1));
                  if (var8 == 0) {
                    break L2;
                  } else {
                    break L3;
                  }
                }
              }
              L4: {
                if (1 == param2) {
                  break L4;
                } else {
                  L5: {
                    if (-3 != (param2 ^ -1)) {
                      break L5;
                    } else {
                      uw.field_g[param2] = (wv) ((Object) new jn(param2, param6, param4, param0, param3, param1));
                      if (var8 == 0) {
                        break L2;
                      } else {
                        break L5;
                      }
                    }
                  }
                  L6: {
                    if (-4 == (param2 ^ -1)) {
                      break L6;
                    } else {
                      L7: {
                        if (4 == param2) {
                          break L7;
                        } else {
                          if ((param2 ^ -1) == -13) {
                            break L7;
                          } else {
                            L8: {
                              if (param2 == 5) {
                                break L8;
                              } else {
                                L9: {
                                  if (param2 == 6) {
                                    break L9;
                                  } else {
                                    L10: {
                                      if (param2 != 7) {
                                        break L10;
                                      } else {
                                        uw.field_g[param2] = (wv) ((Object) new ow(param2, param6, param4, param0, param3, param1));
                                        if (var8 == 0) {
                                          break L2;
                                        } else {
                                          break L10;
                                        }
                                      }
                                    }
                                    L11: {
                                      if (-9 == (param2 ^ -1)) {
                                        break L11;
                                      } else {
                                        L12: {
                                          if (-10 != (param2 ^ -1)) {
                                            break L12;
                                          } else {
                                            uw.field_g[param2] = (wv) ((Object) new oka(param2, param6, param4, param0, param3, param1));
                                            if (var8 == 0) {
                                              break L2;
                                            } else {
                                              break L12;
                                            }
                                          }
                                        }
                                        L13: {
                                          if (-11 == (param2 ^ -1)) {
                                            break L13;
                                          } else {
                                            if (param2 != 11) {
                                              break L2;
                                            } else {
                                              uw.field_g[param2] = (wv) ((Object) new rd(param2, param6, param4, param0, param3, param1));
                                              if (var8 == 0) {
                                                break L2;
                                              } else {
                                                break L13;
                                              }
                                            }
                                          }
                                        }
                                        uw.field_g[param2] = (wv) ((Object) new vv(param2, param6, param4, param0, param3, param1));
                                        if (var8 == 0) {
                                          break L2;
                                        } else {
                                          break L11;
                                        }
                                      }
                                    }
                                    uw.field_g[param2] = (wv) ((Object) new jn(param2, param6, param4, param0, param3, param1));
                                    if (var8 == 0) {
                                      break L2;
                                    } else {
                                      break L9;
                                    }
                                  }
                                }
                                uw.field_g[param2] = (wv) ((Object) new vba(param2, param6, param4, param0, param3, param1));
                                if (var8 == 0) {
                                  break L2;
                                } else {
                                  break L8;
                                }
                              }
                            }
                            uw.field_g[param2] = (wv) ((Object) new qp(param2, param6, param4, param0, param3, param1));
                            if (var8 == 0) {
                              break L2;
                            } else {
                              break L7;
                            }
                          }
                        }
                      }
                      uw.field_g[param2] = (wv) ((Object) new epa(param2, param6, param4, param0, param3, param1));
                      if (var8 == 0) {
                        break L2;
                      } else {
                        break L6;
                      }
                    }
                  }
                  uw.field_g[param2] = (wv) ((Object) new pk(param2, param6, param4, param0, param3, param1));
                  if (var8 == 0) {
                    break L2;
                  } else {
                    break L4;
                  }
                }
              }
              uw.field_g[param2] = (wv) ((Object) new se(param2, param6, param4, param0, param3, param1));
              break L2;
            }
            uw.field_g[param2].field_p = pm.field_h[param2];
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L14: {
            var7 = decompiledCaughtException;
            stackOut_41_0 = (RuntimeException) (var7);
            stackOut_41_1 = new StringBuilder().append("qpa.D(").append(param0).append(',');
            stackIn_43_0 = stackOut_41_0;
            stackIn_43_1 = stackOut_41_1;
            stackIn_42_0 = stackOut_41_0;
            stackIn_42_1 = stackOut_41_1;
            if (param1 == null) {
              stackOut_43_0 = (RuntimeException) ((Object) stackIn_43_0);
              stackOut_43_1 = (StringBuilder) ((Object) stackIn_43_1);
              stackOut_43_2 = "null";
              stackIn_44_0 = stackOut_43_0;
              stackIn_44_1 = stackOut_43_1;
              stackIn_44_2 = stackOut_43_2;
              break L14;
            } else {
              stackOut_42_0 = (RuntimeException) ((Object) stackIn_42_0);
              stackOut_42_1 = (StringBuilder) ((Object) stackIn_42_1);
              stackOut_42_2 = "{...}";
              stackIn_44_0 = stackOut_42_0;
              stackIn_44_1 = stackOut_42_1;
              stackIn_44_2 = stackOut_42_2;
              break L14;
            }
          }
          throw tba.a((Throwable) ((Object) stackIn_44_0), stackIn_44_2 + ',' + param2 + ',' + param3 + ',' + param4 + ',' + param5 + ',' + param6 + ')');
        }
    }

    static {
    }
}
