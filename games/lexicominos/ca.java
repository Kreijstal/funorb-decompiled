/*
 * Decompiled by CFR-JS 0.4.0.
 */
class ca extends kd {
    ca field_l;
    ca field_m;
    static boolean field_k;
    long field_j;
    static ng field_n;
    static long field_h;
    static String field_o;
    static ki field_i;

    final static void c(boolean param0) {
        af.a(-56);
        if (null != ug.field_y) {
            jd.a(ug.field_y, 160);
            rg.a(-124);
            hc.h(249);
            wa.a(-45);
            if (!el.a(1)) {
                ck.b((byte) -60);
                return;
            }
            ed.field_q.h(1, 0);
            kc.a(0, -1);
            ck.b((byte) -60);
            return;
        }
        rg.a(-124);
        hc.h(249);
        wa.a(-45);
        if (el.a(1)) {
            ed.field_q.h(1, 0);
            kc.a(0, -1);
            ck.b((byte) -60);
            return;
        }
        ck.b((byte) -60);
    }

    final static boolean a(byte param0) {
        return ee.field_c == field_i;
    }

    final static void a(ab param0, int param1, java.awt.Frame param2) {
        ei var3 = null;
        RuntimeException var3_ref = null;
        int var4 = 0;
        RuntimeException stackIn_9_0 = null;
        StringBuilder stackIn_9_1 = null;
        RuntimeException stackIn_10_0 = null;
        StringBuilder stackIn_10_1 = null;
        RuntimeException stackIn_11_0 = null;
        StringBuilder stackIn_11_1 = null;
        String stackIn_11_2 = null;
        RuntimeException stackIn_12_0 = null;
        StringBuilder stackIn_12_1 = null;
        RuntimeException stackIn_13_0 = null;
        StringBuilder stackIn_13_1 = null;
        RuntimeException stackIn_14_0 = null;
        StringBuilder stackIn_14_1 = null;
        String stackIn_14_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException stackOut_8_0 = null;
        StringBuilder stackOut_8_1 = null;
        RuntimeException stackOut_10_0 = null;
        StringBuilder stackOut_10_1 = null;
        String stackOut_10_2 = null;
        RuntimeException stackOut_9_0 = null;
        StringBuilder stackOut_9_1 = null;
        String stackOut_9_2 = null;
        RuntimeException stackOut_11_0 = null;
        StringBuilder stackOut_11_1 = null;
        RuntimeException stackOut_13_0 = null;
        StringBuilder stackOut_13_1 = null;
        String stackOut_13_2 = null;
        RuntimeException stackOut_12_0 = null;
        StringBuilder stackOut_12_1 = null;
        String stackOut_12_2 = null;
        var4 = Lexicominos.field_L ? 1 : 0;
        try {
          L0: {
            L1: while (true) {
              var3 = param0.a(0, param2);
              L2: while (true) {
                if (0 != var3.field_b) {
                  if (1 == var3.field_b) {
                    param2.setVisible(false);
                    param2.dispose();
                    break L0;
                  } else {
                    ge.a(0, 100L);
                    continue L1;
                  }
                } else {
                  ge.a(0, 10L);
                  continue L2;
                }
              }
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L3: {
            var3_ref = decompiledCaughtException;
            stackOut_8_0 = (RuntimeException) var3_ref;
            stackOut_8_1 = new StringBuilder().append("ca.O(");
            stackIn_10_0 = stackOut_8_0;
            stackIn_10_1 = stackOut_8_1;
            stackIn_9_0 = stackOut_8_0;
            stackIn_9_1 = stackOut_8_1;
            if (param0 == null) {
              stackOut_10_0 = (RuntimeException) (Object) stackIn_10_0;
              stackOut_10_1 = (StringBuilder) (Object) stackIn_10_1;
              stackOut_10_2 = "null";
              stackIn_11_0 = stackOut_10_0;
              stackIn_11_1 = stackOut_10_1;
              stackIn_11_2 = stackOut_10_2;
              break L3;
            } else {
              stackOut_9_0 = (RuntimeException) (Object) stackIn_9_0;
              stackOut_9_1 = (StringBuilder) (Object) stackIn_9_1;
              stackOut_9_2 = "{...}";
              stackIn_11_0 = stackOut_9_0;
              stackIn_11_1 = stackOut_9_1;
              stackIn_11_2 = stackOut_9_2;
              break L3;
            }
          }
          L4: {
            stackOut_11_0 = (RuntimeException) (Object) stackIn_11_0;
            stackOut_11_1 = ((StringBuilder) (Object) stackIn_11_1).append(stackIn_11_2).append(',').append(15232).append(',');
            stackIn_13_0 = stackOut_11_0;
            stackIn_13_1 = stackOut_11_1;
            stackIn_12_0 = stackOut_11_0;
            stackIn_12_1 = stackOut_11_1;
            if (param2 == null) {
              stackOut_13_0 = (RuntimeException) (Object) stackIn_13_0;
              stackOut_13_1 = (StringBuilder) (Object) stackIn_13_1;
              stackOut_13_2 = "null";
              stackIn_14_0 = stackOut_13_0;
              stackIn_14_1 = stackOut_13_1;
              stackIn_14_2 = stackOut_13_2;
              break L4;
            } else {
              stackOut_12_0 = (RuntimeException) (Object) stackIn_12_0;
              stackOut_12_1 = (StringBuilder) (Object) stackIn_12_1;
              stackOut_12_2 = "{...}";
              stackIn_14_0 = stackOut_12_0;
              stackIn_14_1 = stackOut_12_1;
              stackIn_14_2 = stackOut_12_2;
              break L4;
            }
          }
          throw ld.a((Throwable) (Object) stackIn_14_0, stackIn_14_2 + ')');
        }
    }

    public static void a(int param0) {
        int var1 = -106 % ((42 - param0) / 35);
        field_i = null;
        field_o = null;
        field_n = null;
    }

    final static void a(int param0, int param1, int param2, int param3, boolean param4) {
        ja.b((byte) -128);
        lf.f(param2, param1, param0, param3);
    }

    final void b(int param0) {
        if (((ca) this).field_m == null) {
            return;
        }
        ((ca) this).field_m.field_l = ((ca) this).field_l;
        ((ca) this).field_l.field_m = ((ca) this).field_m;
        ((ca) this).field_l = null;
        if (param0 != 12) {
            field_o = null;
            ((ca) this).field_m = null;
            return;
        }
        ((ca) this).field_m = null;
    }

    protected ca() {
    }

    final static int a(int param0, int param1) {
        int var2 = 0;
        int var3 = 0;
        var3 = Lexicominos.field_L ? 1 : 0;
        lj.field_b = null;
        re.field_X = null;
        gj.field_t = 0;
        var2 = rc.field_i;
        rc.field_i = jc.field_c;
        if (param1 == 51) {
          kb.field_b.field_j = 2;
          jc.field_c = var2;
          kb.field_b.field_p = kb.field_b.field_p + 1;
          if (kb.field_b.field_p < 2) {
            if (kb.field_b.field_p < 2) {
              if (kb.field_b.field_p < 4) {
                return -1;
              } else {
                return 1;
              }
            } else {
              if (param1 == 50) {
                return 5;
              } else {
                if (kb.field_b.field_p < 4) {
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
              if (kb.field_b.field_p < 2) {
                if (kb.field_b.field_p < 4) {
                  return -1;
                } else {
                  return 1;
                }
              } else {
                if (param1 == 50) {
                  return 5;
                } else {
                  if (kb.field_b.field_p < 4) {
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
            kb.field_b.field_j = 5;
            jc.field_c = var2;
            kb.field_b.field_p = kb.field_b.field_p + 1;
            if (kb.field_b.field_p < 2) {
              if (kb.field_b.field_p < 2) {
                if (kb.field_b.field_p < 4) {
                  return -1;
                } else {
                  return 1;
                }
              } else {
                if (param1 == 50) {
                  return 5;
                } else {
                  if (kb.field_b.field_p < 4) {
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
                if (kb.field_b.field_p >= 2) {
                  if (param1 == 50) {
                    return 5;
                  } else {
                    if (kb.field_b.field_p < 4) {
                      return -1;
                    } else {
                      return 1;
                    }
                  }
                } else {
                  if (kb.field_b.field_p < 4) {
                    return -1;
                  } else {
                    return 1;
                  }
                }
              }
            }
          } else {
            kb.field_b.field_j = 1;
            jc.field_c = var2;
            kb.field_b.field_p = kb.field_b.field_p + 1;
            if (kb.field_b.field_p >= 2) {
              if (param1 == 51) {
                return 2;
              } else {
                if (kb.field_b.field_p >= 2) {
                  if (param1 == 50) {
                    return 5;
                  } else {
                    if (kb.field_b.field_p < 4) {
                      return -1;
                    } else {
                      return 1;
                    }
                  }
                } else {
                  if (kb.field_b.field_p < 4) {
                    return -1;
                  } else {
                    return 1;
                  }
                }
              }
            } else {
              if (kb.field_b.field_p < 2) {
                if (kb.field_b.field_p < 4) {
                  return -1;
                } else {
                  return 1;
                }
              } else {
                if (param1 == 50) {
                  return 5;
                } else {
                  if (kb.field_b.field_p < 4) {
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

    final static void a(int param0, int[] param1, bd param2) {
        int var3_int = 0;
        try {
            var3_int = param2.field_h;
            param1[3] = var3_int % 18 + 1;
            var3_int = var3_int / 18;
            param1[2] = 1 + var3_int % 12;
            var3_int = var3_int / 12;
            param1[1] = var3_int % 12;
            param1[0] = var3_int / 12;
            param1[1] = -param1[1] + 11;
        } catch (RuntimeException runtimeException) {
            throw ld.a((Throwable) (Object) runtimeException, "ca.M(" + 12 + ',' + (param1 != null ? "{...}" : "null") + ',' + (param2 != null ? "{...}" : "null") + ')');
        }
    }

    final static boolean d(boolean param0) {
        return true;
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_h = 20000000L;
        field_n = new ng();
        field_o = "Logging in...";
        field_i = new ki();
    }
}
