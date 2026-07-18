/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class ej extends mi {
    static int[] field_s;
    static String field_t;
    static String field_q;
    private Object field_r;

    final static void b(boolean param0, int param1) {
        bd.field_a = (55 & param1) >> 4;
        if (2 < bd.field_a) {
          L0: {
            bd.field_a = 2;
            sc.field_b = (param1 & 12) >> 2;
            if (sc.field_b > 2) {
              sc.field_b = 2;
              break L0;
            } else {
              break L0;
            }
          }
          L1: {
            bd.field_b = param1 & 3;
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
            sc.field_b = (param1 & 12) >> 2;
            if (sc.field_b > 2) {
              sc.field_b = 2;
              break L2;
            } else {
              break L2;
            }
          }
          L3: {
            bd.field_b = param1 & 3;
            if (bd.field_b > 2) {
              bd.field_b = 2;
              break L3;
            } else {
              break L3;
            }
          }
          return;
        }
    }

    final static int a(boolean param0, int param1) {
        param1 = (param1 & 1431655765) - -((param1 & -1431655766) >>> 1);
        param1 = ((param1 & -858993460) >>> 2) + (858993459 & param1);
        param1 = 252645135 & param1 + (param1 >>> 4);
        param1 = param1 + (param1 >>> 8);
        param1 = param1 + (param1 >>> 16);
        return 255 & param1;
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
        if (param1 == 51) {
          jh.field_b.field_d = 2;
          jh.field_b.field_p = jh.field_b.field_p + 1;
          ob.field_b = var2;
          if (2 > jh.field_b.field_p) {
            if (jh.field_b.field_p < 2) {
              if (jh.field_b.field_p < 4) {
                return -1;
              } else {
                return 1;
              }
            } else {
              if (param1 == 50) {
                return 5;
              } else {
                if (jh.field_b.field_p < 4) {
                  return -1;
                } else {
                  return 1;
                }
              }
            }
          } else {
            if (param1 == 51) {
              return 2;
            } else {
              if (jh.field_b.field_p < 2) {
                if (jh.field_b.field_p < 4) {
                  return -1;
                } else {
                  return 1;
                }
              } else {
                if (param1 == 50) {
                  return 5;
                } else {
                  if (jh.field_b.field_p < 4) {
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
            if (2 > jh.field_b.field_p) {
              if (jh.field_b.field_p < 2) {
                if (jh.field_b.field_p < 4) {
                  return -1;
                } else {
                  return 1;
                }
              } else {
                if (param1 == 50) {
                  return 5;
                } else {
                  if (jh.field_b.field_p < 4) {
                    return -1;
                  } else {
                    return 1;
                  }
                }
              }
            } else {
              if (param1 == 51) {
                return 2;
              } else {
                if (jh.field_b.field_p >= 2) {
                  if (param1 == 50) {
                    return 5;
                  } else {
                    if (jh.field_b.field_p < 4) {
                      return -1;
                    } else {
                      return 1;
                    }
                  }
                } else {
                  if (jh.field_b.field_p < 4) {
                    return -1;
                  } else {
                    return 1;
                  }
                }
              }
            }
          } else {
            jh.field_b.field_d = 1;
            jh.field_b.field_p = jh.field_b.field_p + 1;
            ob.field_b = var2;
            if (2 <= jh.field_b.field_p) {
              if (param1 == 51) {
                return 2;
              } else {
                if (jh.field_b.field_p >= 2) {
                  if (param1 == 50) {
                    return 5;
                  } else {
                    if (jh.field_b.field_p < 4) {
                      return -1;
                    } else {
                      return 1;
                    }
                  }
                } else {
                  if (jh.field_b.field_p < 4) {
                    return -1;
                  } else {
                    return 1;
                  }
                }
              }
            } else {
              if (jh.field_b.field_p < 2) {
                if (jh.field_b.field_p < 4) {
                  return -1;
                } else {
                  return 1;
                }
              } else {
                if (param1 == 50) {
                  return 5;
                } else {
                  if (jh.field_b.field_p < 4) {
                    return -1;
                  } else {
                    return 1;
                  }
                }
              }
            }
          }
        }
    }

    public static void f(int param0) {
        field_s = null;
        field_t = null;
        int var1 = 0;
        field_q = null;
    }

    final static void f() {
        int discarded$0 = 150;
        ne.a(true, lh.field_D, wj.field_c);
        vj.field_V = true;
    }

    ej(Object param0, int param1) {
        super(param1);
        try {
            ((ej) this).field_r = param0;
        } catch (RuntimeException runtimeException) {
            throw sd.a((Throwable) (Object) runtimeException, "ej.<init>(" + (param0 != null ? "{...}" : "null") + ',' + param1 + ')');
        }
    }

    final Object d(byte param0) {
        int var2 = -91 % ((26 - param0) / 56);
        return ((ej) this).field_r;
    }

    final boolean e(int param0) {
        if (param0 != 1) {
            boolean discarded$0 = ((ej) this).e(-86);
            return false;
        }
        return false;
    }

    final static void a(ue param0, ue param1) {
        RuntimeException var3 = null;
        RuntimeException stackIn_3_0 = null;
        StringBuilder stackIn_3_1 = null;
        RuntimeException stackIn_4_0 = null;
        StringBuilder stackIn_4_1 = null;
        RuntimeException stackIn_5_0 = null;
        StringBuilder stackIn_5_1 = null;
        String stackIn_5_2 = null;
        RuntimeException stackIn_6_0 = null;
        StringBuilder stackIn_6_1 = null;
        RuntimeException stackIn_7_0 = null;
        StringBuilder stackIn_7_1 = null;
        RuntimeException stackIn_8_0 = null;
        StringBuilder stackIn_8_1 = null;
        String stackIn_8_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException stackOut_2_0 = null;
        StringBuilder stackOut_2_1 = null;
        RuntimeException stackOut_4_0 = null;
        StringBuilder stackOut_4_1 = null;
        String stackOut_4_2 = null;
        RuntimeException stackOut_3_0 = null;
        StringBuilder stackOut_3_1 = null;
        String stackOut_3_2 = null;
        RuntimeException stackOut_5_0 = null;
        StringBuilder stackOut_5_1 = null;
        RuntimeException stackOut_7_0 = null;
        StringBuilder stackOut_7_1 = null;
        String stackOut_7_2 = null;
        RuntimeException stackOut_6_0 = null;
        StringBuilder stackOut_6_1 = null;
        String stackOut_6_2 = null;
        try {
          g.field_a = param0;
          pf.field_a = param1;
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L0: {
            var3 = decompiledCaughtException;
            stackOut_2_0 = (RuntimeException) var3;
            stackOut_2_1 = new StringBuilder().append("ej.J(");
            stackIn_4_0 = stackOut_2_0;
            stackIn_4_1 = stackOut_2_1;
            stackIn_3_0 = stackOut_2_0;
            stackIn_3_1 = stackOut_2_1;
            if (param0 == null) {
              stackOut_4_0 = (RuntimeException) (Object) stackIn_4_0;
              stackOut_4_1 = (StringBuilder) (Object) stackIn_4_1;
              stackOut_4_2 = "null";
              stackIn_5_0 = stackOut_4_0;
              stackIn_5_1 = stackOut_4_1;
              stackIn_5_2 = stackOut_4_2;
              break L0;
            } else {
              stackOut_3_0 = (RuntimeException) (Object) stackIn_3_0;
              stackOut_3_1 = (StringBuilder) (Object) stackIn_3_1;
              stackOut_3_2 = "{...}";
              stackIn_5_0 = stackOut_3_0;
              stackIn_5_1 = stackOut_3_1;
              stackIn_5_2 = stackOut_3_2;
              break L0;
            }
          }
          L1: {
            stackOut_5_0 = (RuntimeException) (Object) stackIn_5_0;
            stackOut_5_1 = ((StringBuilder) (Object) stackIn_5_1).append(stackIn_5_2).append(',');
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
          throw sd.a((Throwable) (Object) stackIn_8_0, stackIn_8_2 + ',' + -127 + ')');
        }
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_s = new int[8192];
        field_q = "Updates will sent to the email address you've given";
        field_t = "Play the game without logging in just yet";
    }
}
