/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class dd {
    int field_b;
    private int field_j;
    private nm field_e;
    private nm[] field_d;
    private int field_a;
    static int field_f;
    private int[] field_g;
    private int field_h;
    static long field_c;
    private int field_i;

    final boolean a(int param0) {
        int var2 = 0;
        if (null != ((dd) this).field_d) {
          if (0 <= ((dd) this).field_i) {
            L0: {
              ((dd) this).field_g[((dd) this).field_i] = ((dd) this).field_g[((dd) this).field_i] - 1;
              if (((dd) this).field_g[((dd) this).field_i] >= 0) {
                break L0;
              } else {
                L1: {
                  var2 = ((dd) this).field_i;
                  ((dd) this).a(((dd) this).field_d[((dd) this).field_i], (byte) -107);
                  ((dd) this).field_i = var2;
                  ((dd) this).field_d[((dd) this).field_i] = null;
                  ((dd) this).field_i = ((dd) this).field_i + 1;
                  if (((dd) this).field_i == ((dd) this).field_d.length) {
                    ((dd) this).field_i = 0;
                    break L1;
                  } else {
                    break L1;
                  }
                }
                if (((dd) this).field_d[((dd) this).field_i] == null) {
                  ((dd) this).field_i = -1;
                  break L0;
                } else {
                  if (param0 >= 121) {
                    if (null == ((dd) this).field_e) {
                      return true;
                    } else {
                      ((dd) this).field_h = ((dd) this).field_h - 1;
                      if (((dd) this).field_h <= 0) {
                        return this.c(0);
                      } else {
                        return false;
                      }
                    }
                  } else {
                    return true;
                  }
                }
              }
            }
            if (param0 >= 121) {
              if (null == ((dd) this).field_e) {
                return true;
              } else {
                ((dd) this).field_h = ((dd) this).field_h - 1;
                if (((dd) this).field_h <= 0) {
                  return this.c(0);
                } else {
                  return false;
                }
              }
            } else {
              return true;
            }
          } else {
            if (param0 >= 121) {
              if (null == ((dd) this).field_e) {
                return true;
              } else {
                ((dd) this).field_h = ((dd) this).field_h - 1;
                if (((dd) this).field_h <= 0) {
                  return this.c(0);
                } else {
                  return false;
                }
              }
            } else {
              return true;
            }
          }
        } else {
          if (param0 >= 121) {
            if (null == ((dd) this).field_e) {
              return true;
            } else {
              ((dd) this).field_h = ((dd) this).field_h - 1;
              if (((dd) this).field_h > 0) {
                return false;
              } else {
                return this.c(0);
              }
            }
          } else {
            return true;
          }
        }
    }

    private final void b(boolean param0) {
        ((dd) this).field_h = 0;
        ((dd) this).field_j = 0;
        ((dd) this).field_a = 0;
        ((dd) this).field_b = 0;
    }

    final static hd b(int param0) {
        if (param0 > -108) {
            return null;
        }
        return bs.field_c.field_Ab;
    }

    final static void a(byte param0) {
        int var1_int = 0;
        int var2 = Kickabout.field_G;
        try {
            e.field_k.b(-1);
            for (var1_int = 0; var1_int < 32; var1_int++) {
                mi.field_b[var1_int] = 0L;
            }
            if (param0 <= 40) {
                dd.a((byte) 120);
            }
            for (var1_int = 0; var1_int < 32; var1_int++) {
                cp.field_d[var1_int] = 0L;
            }
            qh.field_b = 0;
        } catch (RuntimeException runtimeException) {
            throw nb.a((Throwable) (Object) runtimeException, "dd.F(" + param0 + 41);
        }
    }

    final int a(boolean param0) {
        if (!param0) {
            return -113;
        }
        return ((dd) this).field_e.field_e.length;
    }

    private final boolean c(int param0) {
        ((dd) this).field_b = ((dd) this).field_b + 1;
        if (((dd) this).field_e.field_e.length <= ((dd) this).field_b) {
          ((dd) this).field_a = ((dd) this).field_a + 1;
          if (((dd) this).field_e.field_j) {
            if (((dd) this).field_e.field_h >= 0) {
              if (((dd) this).field_e.field_h >= ((dd) this).field_e.field_e.length) {
                ((dd) this).field_b = 0;
                ((dd) this).field_j = ((dd) this).field_e.field_e[((dd) this).field_b];
                ((dd) this).field_h = ((dd) this).field_e.field_c[((dd) this).field_b];
                return false;
              } else {
                ((dd) this).field_b = ((dd) this).field_e.field_h;
                ((dd) this).field_j = ((dd) this).field_e.field_e[((dd) this).field_b];
                ((dd) this).field_h = ((dd) this).field_e.field_c[((dd) this).field_b];
                return false;
              }
            } else {
              ((dd) this).field_b = 0;
              ((dd) this).field_j = ((dd) this).field_e.field_e[((dd) this).field_b];
              ((dd) this).field_h = ((dd) this).field_e.field_c[((dd) this).field_b];
              return false;
            }
          } else {
            if (((dd) this).field_e.field_f > ((dd) this).field_a) {
              if (((dd) this).field_e.field_h >= 0) {
                if (((dd) this).field_e.field_h >= ((dd) this).field_e.field_e.length) {
                  ((dd) this).field_b = 0;
                  ((dd) this).field_j = ((dd) this).field_e.field_e[((dd) this).field_b];
                  ((dd) this).field_h = ((dd) this).field_e.field_c[((dd) this).field_b];
                  return false;
                } else {
                  ((dd) this).field_b = ((dd) this).field_e.field_h;
                  ((dd) this).field_j = ((dd) this).field_e.field_e[((dd) this).field_b];
                  ((dd) this).field_h = ((dd) this).field_e.field_c[((dd) this).field_b];
                  return false;
                }
              } else {
                ((dd) this).field_b = 0;
                ((dd) this).field_j = ((dd) this).field_e.field_e[((dd) this).field_b];
                ((dd) this).field_h = ((dd) this).field_e.field_c[((dd) this).field_b];
                return false;
              }
            } else {
              return true;
            }
          }
        } else {
          ((dd) this).field_j = ((dd) this).field_e.field_e[((dd) this).field_b];
          ((dd) this).field_h = ((dd) this).field_e.field_c[((dd) this).field_b];
          return false;
        }
    }

    final void a(int param0, int param1) {
        ((dd) this).field_b = param0;
        int var3 = 124 % ((28 - param1) / 60);
        ((dd) this).field_j = ((dd) this).field_e.field_e[((dd) this).field_b];
        ((dd) this).field_h = 0;
    }

    final void a(nm param0, byte param1) {
        try {
            this.b(true);
            ((dd) this).field_e = param0;
            if (param1 != -107) {
                ((dd) this).field_h = -20;
            }
            ((dd) this).field_j = ((dd) this).field_e.field_e[((dd) this).field_b];
            ((dd) this).field_h = ((dd) this).field_e.field_c[((dd) this).field_b];
            ((dd) this).field_i = -1;
        } catch (RuntimeException runtimeException) {
            throw nb.a((Throwable) (Object) runtimeException, "dd.C(" + (param0 != null ? "{...}" : "null") + 44 + param1 + 41);
        }
    }

    final qc a(qc param0, boolean param1, boolean param2, boolean param3) {
        qc var5 = null;
        RuntimeException var5_ref = null;
        Object stackIn_2_0 = null;
        qc stackIn_4_0 = null;
        boolean stackIn_4_1 = false;
        int stackIn_4_2 = 0;
        qc stackIn_5_0 = null;
        boolean stackIn_5_1 = false;
        int stackIn_5_2 = 0;
        qc stackIn_6_0 = null;
        boolean stackIn_6_1 = false;
        int stackIn_6_2 = 0;
        int stackIn_6_3 = 0;
        qc stackIn_7_0 = null;
        RuntimeException stackIn_9_0 = null;
        StringBuilder stackIn_9_1 = null;
        RuntimeException stackIn_10_0 = null;
        StringBuilder stackIn_10_1 = null;
        RuntimeException stackIn_11_0 = null;
        StringBuilder stackIn_11_1 = null;
        String stackIn_11_2 = null;
        RuntimeException decompiledCaughtException = null;
        qc stackOut_3_0 = null;
        boolean stackOut_3_1 = false;
        int stackOut_3_2 = 0;
        qc stackOut_5_0 = null;
        boolean stackOut_5_1 = false;
        int stackOut_5_2 = 0;
        int stackOut_5_3 = 0;
        qc stackOut_4_0 = null;
        boolean stackOut_4_1 = false;
        int stackOut_4_2 = 0;
        int stackOut_4_3 = 0;
        qc stackOut_6_0 = null;
        Object stackOut_1_0 = null;
        RuntimeException stackOut_8_0 = null;
        StringBuilder stackOut_8_1 = null;
        RuntimeException stackOut_10_0 = null;
        StringBuilder stackOut_10_1 = null;
        String stackOut_10_2 = null;
        RuntimeException stackOut_9_0 = null;
        StringBuilder stackOut_9_1 = null;
        String stackOut_9_2 = null;
        try {
          L0: {
            if (param3) {
              L1: {
                stackOut_3_0 = (qc) param0;
                stackOut_3_1 = param2;
                stackOut_3_2 = 0;
                stackIn_5_0 = stackOut_3_0;
                stackIn_5_1 = stackOut_3_1;
                stackIn_5_2 = stackOut_3_2;
                stackIn_4_0 = stackOut_3_0;
                stackIn_4_1 = stackOut_3_1;
                stackIn_4_2 = stackOut_3_2;
                if (param1) {
                  stackOut_5_0 = (qc) (Object) stackIn_5_0;
                  stackOut_5_1 = stackIn_5_1;
                  stackOut_5_2 = stackIn_5_2;
                  stackOut_5_3 = 0;
                  stackIn_6_0 = stackOut_5_0;
                  stackIn_6_1 = stackOut_5_1;
                  stackIn_6_2 = stackOut_5_2;
                  stackIn_6_3 = stackOut_5_3;
                  break L1;
                } else {
                  stackOut_4_0 = (qc) (Object) stackIn_4_0;
                  stackOut_4_1 = stackIn_4_1;
                  stackOut_4_2 = stackIn_4_2;
                  stackOut_4_3 = 1;
                  stackIn_6_0 = stackOut_4_0;
                  stackIn_6_1 = stackOut_4_1;
                  stackIn_6_2 = stackOut_4_2;
                  stackIn_6_3 = stackOut_4_3;
                  break L1;
                }
              }
              var5 = ((qc) (Object) stackIn_6_0).a(stackIn_6_1, stackIn_6_2 != 0, stackIn_6_3 != 0);
              var5.a(se.field_C, ((dd) this).field_j, (ef) null, -1, 0, 0, param1);
              stackOut_6_0 = (qc) var5;
              stackIn_7_0 = stackOut_6_0;
              break L0;
            } else {
              stackOut_1_0 = null;
              stackIn_2_0 = stackOut_1_0;
              return (qc) (Object) stackIn_2_0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L2: {
            var5_ref = decompiledCaughtException;
            stackOut_8_0 = (RuntimeException) var5_ref;
            stackOut_8_1 = new StringBuilder().append("dd.I(");
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
              break L2;
            } else {
              stackOut_9_0 = (RuntimeException) (Object) stackIn_9_0;
              stackOut_9_1 = (StringBuilder) (Object) stackIn_9_1;
              stackOut_9_2 = "{...}";
              stackIn_11_0 = stackOut_9_0;
              stackIn_11_1 = stackOut_9_1;
              stackIn_11_2 = stackOut_9_2;
              break L2;
            }
          }
          throw nb.a((Throwable) (Object) stackIn_11_0, stackIn_11_2 + 44 + param1 + 44 + param2 + 44 + param3 + 41);
        }
        return stackIn_7_0;
    }

    public dd() {
    }

    dd(int param0) {
        ((dd) this).field_i = -1;
        ((dd) this).field_d = new nm[param0];
        ((dd) this).field_g = new int[param0];
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_f = 0;
    }
}
