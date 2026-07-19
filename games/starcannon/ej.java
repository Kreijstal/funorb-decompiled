/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class ej extends mi {
    static int[] field_s;
    static String field_t;
    static String field_q;
    private Object field_r;

    final static void b(boolean param0, int param1) {
        bd.field_a = (55 & param1) >> -1988185500;
        if (2 >= bd.field_a) {
          L0: {
            sc.field_b = (param1 & 12) >> -660305150;
            if (sc.field_b > 2) {
              sc.field_b = 2;
              break L0;
            } else {
              break L0;
            }
          }
          bd.field_b = param1 & 3;
          if (!param0) {
            L1: {
              ej.f(96);
              if (bd.field_b > 2) {
                bd.field_b = 2;
                break L1;
              } else {
                break L1;
              }
            }
            return;
          } else {
            L2: {
              if (bd.field_b > 2) {
                bd.field_b = 2;
                break L2;
              } else {
                break L2;
              }
            }
            return;
          }
        } else {
          L3: {
            bd.field_a = 2;
            sc.field_b = (param1 & 12) >> -660305150;
            if (sc.field_b > 2) {
              sc.field_b = 2;
              break L3;
            } else {
              break L3;
            }
          }
          bd.field_b = param1 & 3;
          if (param0) {
            L4: {
              if (bd.field_b > 2) {
                bd.field_b = 2;
                break L4;
              } else {
                break L4;
              }
            }
            return;
          } else {
            L5: {
              ej.f(96);
              if (bd.field_b > 2) {
                bd.field_b = 2;
                break L5;
              } else {
                break L5;
              }
            }
            return;
          }
        }
    }

    final static int a(boolean param0, int param1) {
        ue var3 = null;
        param1 = (param1 & 1431655765) - -((param1 & -1431655766) >>> -500619679);
        param1 = ((param1 & -858993460) >>> 234706274) + (858993459 & param1);
        param1 = 252645135 & param1 + (param1 >>> 1355325188);
        param1 = param1 + (param1 >>> 1042980584);
        param1 = param1 + (param1 >>> 1201164464);
        if (!param0) {
          var3 = (ue) null;
          ej.a((ue) null, (ue) null, 8);
          return 255 & param1;
        } else {
          return 255 & param1;
        }
    }

    final static int a(int param0, int param1) {
        int var2 = 0;
        int var3 = 0;
        var3 = StarCannon.field_A;
        bj.field_d = null;
        bg.field_a = 0;
        ok.field_sb = null;
        var2 = va.field_s;
        va.field_s = ob.field_b;
        if ((param1 ^ -1) == -52) {
          jh.field_b.field_d = 2;
          jh.field_b.field_p = jh.field_b.field_p + 1;
          ob.field_b = var2;
          if (param0 > jh.field_b.field_p) {
            if (jh.field_b.field_p < 2) {
              if (-5 < (jh.field_b.field_p ^ -1)) {
                return -1;
              } else {
                return 1;
              }
            } else {
              if (param1 == 50) {
                return 5;
              } else {
                if (-5 < (jh.field_b.field_p ^ -1)) {
                  return -1;
                } else {
                  return 1;
                }
              }
            }
          } else {
            if (-52 == (param1 ^ -1)) {
              return 2;
            } else {
              if (jh.field_b.field_p < 2) {
                if (-5 < (jh.field_b.field_p ^ -1)) {
                  return -1;
                } else {
                  return 1;
                }
              } else {
                if (param1 == 50) {
                  return 5;
                } else {
                  if (-5 < (jh.field_b.field_p ^ -1)) {
                    return -1;
                  } else {
                    return 1;
                  }
                }
              }
            }
          }
        } else {
          if (50 == param1) {
            jh.field_b.field_d = 5;
            jh.field_b.field_p = jh.field_b.field_p + 1;
            ob.field_b = var2;
            if (param0 > jh.field_b.field_p) {
              if (jh.field_b.field_p < 2) {
                if (-5 >= (jh.field_b.field_p ^ -1)) {
                  return 1;
                } else {
                  return -1;
                }
              } else {
                if (param1 != 50) {
                  if (-5 < (jh.field_b.field_p ^ -1)) {
                    return -1;
                  } else {
                    return 1;
                  }
                } else {
                  return 5;
                }
              }
            } else {
              if (-52 != (param1 ^ -1)) {
                if (jh.field_b.field_p >= 2) {
                  if (param1 == 50) {
                    return 5;
                  } else {
                    if (-5 >= (jh.field_b.field_p ^ -1)) {
                      return 1;
                    } else {
                      return -1;
                    }
                  }
                } else {
                  if (-5 >= (jh.field_b.field_p ^ -1)) {
                    return 1;
                  } else {
                    return -1;
                  }
                }
              } else {
                return 2;
              }
            }
          } else {
            jh.field_b.field_d = 1;
            jh.field_b.field_p = jh.field_b.field_p + 1;
            ob.field_b = var2;
            if (param0 <= jh.field_b.field_p) {
              if (-52 == (param1 ^ -1)) {
                return 2;
              } else {
                if (jh.field_b.field_p >= 2) {
                  if (param1 == 50) {
                    return 5;
                  } else {
                    if (-5 >= (jh.field_b.field_p ^ -1)) {
                      return 1;
                    } else {
                      return -1;
                    }
                  }
                } else {
                  if (-5 >= (jh.field_b.field_p ^ -1)) {
                    return 1;
                  } else {
                    return -1;
                  }
                }
              }
            } else {
              if (jh.field_b.field_p < 2) {
                if (-5 >= (jh.field_b.field_p ^ -1)) {
                  return 1;
                } else {
                  return -1;
                }
              } else {
                if (param1 != 50) {
                  if (-5 >= (jh.field_b.field_p ^ -1)) {
                    return 1;
                  } else {
                    return -1;
                  }
                } else {
                  return 5;
                }
              }
            }
          }
        }
    }

    public static void f(int param0) {
        field_s = null;
        field_t = null;
        int var1 = 2 / ((-62 - param0) / 53);
        field_q = null;
    }

    final static void f(byte param0) {
        if (param0 != -80) {
            return;
        }
        ne.a(true, lh.field_D, wj.field_c, param0 + 230);
        vj.field_V = true;
    }

    ej(Object param0, int param1) {
        super(param1);
        try {
            this.field_r = param0;
        } catch (RuntimeException runtimeException) {
            throw sd.a((Throwable) ((Object) runtimeException), "ej.<init>(" + (param0 != null ? "{...}" : "null") + ',' + param1 + ')');
        }
    }

    final Object d(byte param0) {
        int var2 = -91 % ((26 - param0) / 56);
        return this.field_r;
    }

    final boolean e(int param0) {
        boolean discarded$0 = false;
        if (param0 != 1) {
            discarded$0 = this.e(-86);
            return false;
        }
        return false;
    }

    final static void a(ue param0, ue param1, int param2) {
        RuntimeException runtimeException = null;
        RuntimeException stackIn_4_0 = null;
        StringBuilder stackIn_4_1 = null;
        RuntimeException stackIn_5_0 = null;
        StringBuilder stackIn_5_1 = null;
        RuntimeException stackIn_6_0 = null;
        StringBuilder stackIn_6_1 = null;
        String stackIn_6_2 = null;
        RuntimeException stackIn_7_0 = null;
        StringBuilder stackIn_7_1 = null;
        RuntimeException stackIn_8_0 = null;
        StringBuilder stackIn_8_1 = null;
        RuntimeException stackIn_9_0 = null;
        StringBuilder stackIn_9_1 = null;
        String stackIn_9_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException stackOut_3_0 = null;
        StringBuilder stackOut_3_1 = null;
        RuntimeException stackOut_5_0 = null;
        StringBuilder stackOut_5_1 = null;
        String stackOut_5_2 = null;
        RuntimeException stackOut_4_0 = null;
        StringBuilder stackOut_4_1 = null;
        String stackOut_4_2 = null;
        RuntimeException stackOut_6_0 = null;
        StringBuilder stackOut_6_1 = null;
        RuntimeException stackOut_8_0 = null;
        StringBuilder stackOut_8_1 = null;
        String stackOut_8_2 = null;
        RuntimeException stackOut_7_0 = null;
        StringBuilder stackOut_7_1 = null;
        String stackOut_7_2 = null;
        try {
          L0: {
            L1: {
              g.field_a = param0;
              pf.field_a = param1;
              if (param2 < -73) {
                break L1;
              } else {
                field_q = (String) null;
                break L1;
              }
            }
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L2: {
            runtimeException = decompiledCaughtException;
            stackOut_3_0 = (RuntimeException) (runtimeException);
            stackOut_3_1 = new StringBuilder().append("ej.J(");
            stackIn_5_0 = stackOut_3_0;
            stackIn_5_1 = stackOut_3_1;
            stackIn_4_0 = stackOut_3_0;
            stackIn_4_1 = stackOut_3_1;
            if (param0 == null) {
              stackOut_5_0 = (RuntimeException) ((Object) stackIn_5_0);
              stackOut_5_1 = (StringBuilder) ((Object) stackIn_5_1);
              stackOut_5_2 = "null";
              stackIn_6_0 = stackOut_5_0;
              stackIn_6_1 = stackOut_5_1;
              stackIn_6_2 = stackOut_5_2;
              break L2;
            } else {
              stackOut_4_0 = (RuntimeException) ((Object) stackIn_4_0);
              stackOut_4_1 = (StringBuilder) ((Object) stackIn_4_1);
              stackOut_4_2 = "{...}";
              stackIn_6_0 = stackOut_4_0;
              stackIn_6_1 = stackOut_4_1;
              stackIn_6_2 = stackOut_4_2;
              break L2;
            }
          }
          L3: {
            stackOut_6_0 = (RuntimeException) ((Object) stackIn_6_0);
            stackOut_6_1 = ((StringBuilder) (Object) stackIn_6_1).append(stackIn_6_2).append(',');
            stackIn_8_0 = stackOut_6_0;
            stackIn_8_1 = stackOut_6_1;
            stackIn_7_0 = stackOut_6_0;
            stackIn_7_1 = stackOut_6_1;
            if (param1 == null) {
              stackOut_8_0 = (RuntimeException) ((Object) stackIn_8_0);
              stackOut_8_1 = (StringBuilder) ((Object) stackIn_8_1);
              stackOut_8_2 = "null";
              stackIn_9_0 = stackOut_8_0;
              stackIn_9_1 = stackOut_8_1;
              stackIn_9_2 = stackOut_8_2;
              break L3;
            } else {
              stackOut_7_0 = (RuntimeException) ((Object) stackIn_7_0);
              stackOut_7_1 = (StringBuilder) ((Object) stackIn_7_1);
              stackOut_7_2 = "{...}";
              stackIn_9_0 = stackOut_7_0;
              stackIn_9_1 = stackOut_7_1;
              stackIn_9_2 = stackOut_7_2;
              break L3;
            }
          }
          throw sd.a((Throwable) ((Object) stackIn_9_0), stackIn_9_2 + ',' + param2 + ')');
        }
    }

    static {
        field_s = new int[8192];
        field_q = "Updates will sent to the email address you've given";
        field_t = "Play the game without logging in just yet";
    }
}
