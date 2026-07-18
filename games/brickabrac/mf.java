/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class mf {
    private Object[][] field_h;
    static vl field_i;
    static int field_c;
    private bc field_g;
    int field_l;
    private ko field_k;
    private Object[] field_j;
    static cp field_f;
    static String field_e;
    boolean field_b;
    static jp[] field_a;
    static int[] field_d;

    public static void a(boolean param0) {
        RuntimeException var1 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          L0: {
            L1: {
              field_e = null;
              field_f = null;
              field_a = null;
              if (!param0) {
                break L1;
              } else {
                lo discarded$2 = mf.a((byte) -93, (String) null);
                break L1;
              }
            }
            field_i = null;
            field_d = null;
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var1 = decompiledCaughtException;
          throw qb.a((Throwable) (Object) var1, "mf.B(" + param0 + ')');
        }
    }

    final synchronized byte[] a(int param0, String param1, String param2) {
        int var4_int = 0;
        RuntimeException var4 = null;
        int var5 = 0;
        int var6 = 0;
        Object stackIn_2_0 = null;
        Object stackIn_7_0 = null;
        byte[] stackIn_9_0 = null;
        RuntimeException stackIn_11_0 = null;
        StringBuilder stackIn_11_1 = null;
        RuntimeException stackIn_13_0 = null;
        StringBuilder stackIn_13_1 = null;
        RuntimeException stackIn_14_0 = null;
        StringBuilder stackIn_14_1 = null;
        String stackIn_14_2 = null;
        RuntimeException stackIn_15_0 = null;
        StringBuilder stackIn_15_1 = null;
        RuntimeException stackIn_17_0 = null;
        StringBuilder stackIn_17_1 = null;
        RuntimeException stackIn_18_0 = null;
        StringBuilder stackIn_18_1 = null;
        String stackIn_18_2 = null;
        RuntimeException decompiledCaughtException = null;
        Object stackOut_6_0 = null;
        byte[] stackOut_8_0 = null;
        Object stackOut_1_0 = null;
        RuntimeException stackOut_10_0 = null;
        StringBuilder stackOut_10_1 = null;
        RuntimeException stackOut_13_0 = null;
        StringBuilder stackOut_13_1 = null;
        String stackOut_13_2 = null;
        RuntimeException stackOut_11_0 = null;
        StringBuilder stackOut_11_1 = null;
        String stackOut_11_2 = null;
        RuntimeException stackOut_14_0 = null;
        StringBuilder stackOut_14_1 = null;
        RuntimeException stackOut_17_0 = null;
        StringBuilder stackOut_17_1 = null;
        String stackOut_17_2 = null;
        RuntimeException stackOut_15_0 = null;
        StringBuilder stackOut_15_1 = null;
        String stackOut_15_2 = null;
        try {
          L0: {
            if (((mf) this).a((byte) -127)) {
              param1 = param1.toLowerCase();
              param2 = param2.toLowerCase();
              var5 = 110 % ((param0 - 33) / 51);
              var4_int = ((mf) this).field_k.field_n.a(ni.a(-128, (CharSequence) (Object) param1), (byte) -94);
              if (!this.b(0, var4_int)) {
                stackOut_6_0 = null;
                stackIn_7_0 = stackOut_6_0;
                return (byte[]) (Object) stackIn_7_0;
              } else {
                var6 = ((mf) this).field_k.field_i[var4_int].a(ni.a(-110, (CharSequence) (Object) param2), (byte) -106);
                stackOut_8_0 = ((mf) this).a(var6, var4_int, 4);
                stackIn_9_0 = stackOut_8_0;
                break L0;
              }
            } else {
              stackOut_1_0 = null;
              stackIn_2_0 = stackOut_1_0;
              return (byte[]) (Object) stackIn_2_0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L1: {
            var4 = decompiledCaughtException;
            stackOut_10_0 = (RuntimeException) var4;
            stackOut_10_1 = new StringBuilder().append("mf.J(").append(param0).append(',');
            stackIn_13_0 = stackOut_10_0;
            stackIn_13_1 = stackOut_10_1;
            stackIn_11_0 = stackOut_10_0;
            stackIn_11_1 = stackOut_10_1;
            if (param1 == null) {
              stackOut_13_0 = (RuntimeException) (Object) stackIn_13_0;
              stackOut_13_1 = (StringBuilder) (Object) stackIn_13_1;
              stackOut_13_2 = "null";
              stackIn_14_0 = stackOut_13_0;
              stackIn_14_1 = stackOut_13_1;
              stackIn_14_2 = stackOut_13_2;
              break L1;
            } else {
              stackOut_11_0 = (RuntimeException) (Object) stackIn_11_0;
              stackOut_11_1 = (StringBuilder) (Object) stackIn_11_1;
              stackOut_11_2 = "{...}";
              stackIn_14_0 = stackOut_11_0;
              stackIn_14_1 = stackOut_11_1;
              stackIn_14_2 = stackOut_11_2;
              break L1;
            }
          }
          L2: {
            stackOut_14_0 = (RuntimeException) (Object) stackIn_14_0;
            stackOut_14_1 = ((StringBuilder) (Object) stackIn_14_1).append(stackIn_14_2).append(',');
            stackIn_17_0 = stackOut_14_0;
            stackIn_17_1 = stackOut_14_1;
            stackIn_15_0 = stackOut_14_0;
            stackIn_15_1 = stackOut_14_1;
            if (param2 == null) {
              stackOut_17_0 = (RuntimeException) (Object) stackIn_17_0;
              stackOut_17_1 = (StringBuilder) (Object) stackIn_17_1;
              stackOut_17_2 = "null";
              stackIn_18_0 = stackOut_17_0;
              stackIn_18_1 = stackOut_17_1;
              stackIn_18_2 = stackOut_17_2;
              break L2;
            } else {
              stackOut_15_0 = (RuntimeException) (Object) stackIn_15_0;
              stackOut_15_1 = (StringBuilder) (Object) stackIn_15_1;
              stackOut_15_2 = "{...}";
              stackIn_18_0 = stackOut_15_0;
              stackIn_18_1 = stackOut_15_1;
              stackIn_18_2 = stackOut_15_2;
              break L2;
            }
          }
          throw qb.a((Throwable) (Object) stackIn_18_0, stackIn_18_2 + ')');
        }
        return stackIn_9_0;
    }

    private final synchronized void a(int param0, byte param1) {
        RuntimeException var3 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          L0: {
            if (param1 == -78) {
              L1: {
                L2: {
                  if (((mf) this).field_b) {
                    break L2;
                  } else {
                    ((mf) this).field_j[param0] = eg.a(param1 + -39, ((mf) this).field_g.a(param0, (byte) -51), false);
                    if (!BrickABrac.field_J) {
                      break L1;
                    } else {
                      break L2;
                    }
                  }
                }
                ((mf) this).field_j[param0] = (Object) (Object) ((mf) this).field_g.a(param0, (byte) -121);
                break L1;
              }
              break L0;
            } else {
              return;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3 = decompiledCaughtException;
          throw qb.a((Throwable) (Object) var3, "mf.AA(" + param0 + ',' + param1 + ')');
        }
    }

    final synchronized boolean a(byte param0) {
        RuntimeException var2 = null;
        int stackIn_2_0 = 0;
        int stackIn_8_0 = 0;
        int stackIn_11_0 = 0;
        RuntimeException decompiledCaughtException = null;
        int stackOut_7_0 = 0;
        int stackOut_10_0 = 0;
        int stackOut_1_0 = 0;
        try {
          L0: {
            if (param0 == -127) {
              L1: {
                if (null == ((mf) this).field_k) {
                  ((mf) this).field_k = ((mf) this).field_g.b((byte) -112);
                  if (((mf) this).field_k != null) {
                    ((mf) this).field_h = new Object[((mf) this).field_k.field_f][];
                    ((mf) this).field_j = new Object[((mf) this).field_k.field_f];
                    break L1;
                  } else {
                    stackOut_7_0 = 0;
                    stackIn_8_0 = stackOut_7_0;
                    return stackIn_8_0 != 0;
                  }
                } else {
                  break L1;
                }
              }
              stackOut_10_0 = 1;
              stackIn_11_0 = stackOut_10_0;
              break L0;
            } else {
              stackOut_1_0 = 0;
              stackIn_2_0 = stackOut_1_0;
              return stackIn_2_0 != 0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2 = decompiledCaughtException;
          throw qb.a((Throwable) (Object) var2, "mf.D(" + param0 + ')');
        }
        return stackIn_11_0 != 0;
    }

    final int c(int param0, int param1) {
        RuntimeException var3 = null;
        int stackIn_7_0 = 0;
        int stackIn_9_0 = 0;
        RuntimeException decompiledCaughtException = null;
        int stackOut_6_0 = 0;
        int stackOut_8_0 = 0;
        try {
          L0: {
            L1: {
              if (param0 <= -69) {
                break L1;
              } else {
                ((byte[]) ((mf) this).field_j[0])[0] = (byte) 85;
                break L1;
              }
            }
            if (!this.b(0, param1)) {
              stackOut_6_0 = 0;
              stackIn_7_0 = stackOut_6_0;
              return stackIn_7_0;
            } else {
              stackOut_8_0 = ((mf) this).field_k.field_l[param1];
              stackIn_9_0 = stackOut_8_0;
              break L0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3 = decompiledCaughtException;
          throw qb.a((Throwable) (Object) var3, "mf.N(" + param0 + ',' + param1 + ')');
        }
        return stackIn_9_0;
    }

    final boolean a(String param0, int param1) {
        int var3_int = 0;
        RuntimeException var3 = null;
        int stackIn_4_0 = 0;
        boolean stackIn_9_0 = false;
        RuntimeException stackIn_11_0 = null;
        StringBuilder stackIn_11_1 = null;
        RuntimeException stackIn_13_0 = null;
        StringBuilder stackIn_13_1 = null;
        RuntimeException stackIn_14_0 = null;
        StringBuilder stackIn_14_1 = null;
        String stackIn_14_2 = null;
        RuntimeException decompiledCaughtException = null;
        int stackOut_3_0 = 0;
        boolean stackOut_8_0 = false;
        RuntimeException stackOut_10_0 = null;
        StringBuilder stackOut_10_1 = null;
        RuntimeException stackOut_13_0 = null;
        StringBuilder stackOut_13_1 = null;
        String stackOut_13_2 = null;
        RuntimeException stackOut_11_0 = null;
        StringBuilder stackOut_11_1 = null;
        String stackOut_11_2 = null;
        try {
          L0: {
            if (!((mf) this).a((byte) -127)) {
              stackOut_3_0 = 0;
              stackIn_4_0 = stackOut_3_0;
              return stackIn_4_0 != 0;
            } else {
              L1: {
                param0 = param0.toLowerCase();
                if (param1 == -28138) {
                  break L1;
                } else {
                  field_a = null;
                  break L1;
                }
              }
              var3_int = ((mf) this).field_k.field_n.a(ni.a(param1 + 28015, (CharSequence) (Object) param0), (byte) -85);
              stackOut_8_0 = ((mf) this).a(param1 + 15055, var3_int);
              stackIn_9_0 = stackOut_8_0;
              break L0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L2: {
            var3 = decompiledCaughtException;
            stackOut_10_0 = (RuntimeException) var3;
            stackOut_10_1 = new StringBuilder().append("mf.L(");
            stackIn_13_0 = stackOut_10_0;
            stackIn_13_1 = stackOut_10_1;
            stackIn_11_0 = stackOut_10_0;
            stackIn_11_1 = stackOut_10_1;
            if (param0 == null) {
              stackOut_13_0 = (RuntimeException) (Object) stackIn_13_0;
              stackOut_13_1 = (StringBuilder) (Object) stackIn_13_1;
              stackOut_13_2 = "null";
              stackIn_14_0 = stackOut_13_0;
              stackIn_14_1 = stackOut_13_1;
              stackIn_14_2 = stackOut_13_2;
              break L2;
            } else {
              stackOut_11_0 = (RuntimeException) (Object) stackIn_11_0;
              stackOut_11_1 = (StringBuilder) (Object) stackIn_11_1;
              stackOut_11_2 = "{...}";
              stackIn_14_0 = stackOut_11_0;
              stackIn_14_1 = stackOut_11_1;
              stackIn_14_2 = stackOut_11_2;
              break L2;
            }
          }
          throw qb.a((Throwable) (Object) stackIn_14_0, stackIn_14_2 + ',' + param1 + ')');
        }
        return stackIn_9_0;
    }

    final int c(int param0) {
        RuntimeException var2 = null;
        int stackIn_2_0 = 0;
        int stackIn_7_0 = 0;
        RuntimeException decompiledCaughtException = null;
        int stackOut_6_0 = 0;
        int stackOut_1_0 = 0;
        try {
          L0: {
            if (((mf) this).a((byte) -127)) {
              L1: {
                if (param0 < -86) {
                  break L1;
                } else {
                  field_d = null;
                  break L1;
                }
              }
              stackOut_6_0 = ((mf) this).field_k.field_l.length;
              stackIn_7_0 = stackOut_6_0;
              break L0;
            } else {
              stackOut_1_0 = -1;
              stackIn_2_0 = stackOut_1_0;
              return stackIn_2_0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2 = decompiledCaughtException;
          throw qb.a((Throwable) (Object) var2, "mf.H(" + param0 + ')');
        }
        return stackIn_7_0;
    }

    final int a(String param0, boolean param1) {
        int var3_int = 0;
        RuntimeException var3 = null;
        int stackIn_4_0 = 0;
        int stackIn_10_0 = 0;
        int stackIn_12_0 = 0;
        RuntimeException stackIn_14_0 = null;
        StringBuilder stackIn_14_1 = null;
        RuntimeException stackIn_16_0 = null;
        StringBuilder stackIn_16_1 = null;
        RuntimeException stackIn_17_0 = null;
        StringBuilder stackIn_17_1 = null;
        String stackIn_17_2 = null;
        RuntimeException decompiledCaughtException = null;
        int stackOut_3_0 = 0;
        int stackOut_11_0 = 0;
        int stackOut_9_0 = 0;
        RuntimeException stackOut_13_0 = null;
        StringBuilder stackOut_13_1 = null;
        RuntimeException stackOut_16_0 = null;
        StringBuilder stackOut_16_1 = null;
        String stackOut_16_2 = null;
        RuntimeException stackOut_14_0 = null;
        StringBuilder stackOut_14_1 = null;
        String stackOut_14_2 = null;
        try {
          L0: {
            if (!((mf) this).a((byte) -127)) {
              stackOut_3_0 = -1;
              stackIn_4_0 = stackOut_3_0;
              return stackIn_4_0;
            } else {
              L1: {
                if (!param1) {
                  break L1;
                } else {
                  int discarded$2 = ((mf) this).a((String) null, true);
                  break L1;
                }
              }
              param0 = param0.toLowerCase();
              var3_int = ((mf) this).field_k.field_n.a(ni.a(-121, (CharSequence) (Object) param0), (byte) -86);
              if (this.b(0, var3_int)) {
                stackOut_11_0 = var3_int;
                stackIn_12_0 = stackOut_11_0;
                break L0;
              } else {
                stackOut_9_0 = -1;
                stackIn_10_0 = stackOut_9_0;
                return stackIn_10_0;
              }
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L2: {
            var3 = decompiledCaughtException;
            stackOut_13_0 = (RuntimeException) var3;
            stackOut_13_1 = new StringBuilder().append("mf.U(");
            stackIn_16_0 = stackOut_13_0;
            stackIn_16_1 = stackOut_13_1;
            stackIn_14_0 = stackOut_13_0;
            stackIn_14_1 = stackOut_13_1;
            if (param0 == null) {
              stackOut_16_0 = (RuntimeException) (Object) stackIn_16_0;
              stackOut_16_1 = (StringBuilder) (Object) stackIn_16_1;
              stackOut_16_2 = "null";
              stackIn_17_0 = stackOut_16_0;
              stackIn_17_1 = stackOut_16_1;
              stackIn_17_2 = stackOut_16_2;
              break L2;
            } else {
              stackOut_14_0 = (RuntimeException) (Object) stackIn_14_0;
              stackOut_14_1 = (StringBuilder) (Object) stackIn_14_1;
              stackOut_14_2 = "{...}";
              stackIn_17_0 = stackOut_14_0;
              stackIn_17_1 = stackOut_14_1;
              stackIn_17_2 = stackOut_14_2;
              break L2;
            }
          }
          throw qb.a((Throwable) (Object) stackIn_17_0, stackIn_17_2 + ',' + param1 + ')');
        }
        return stackIn_12_0;
    }

    final boolean a(String param0, String param1, int param2) {
        int var4_int = 0;
        RuntimeException var4 = null;
        int var5 = 0;
        int stackIn_4_0 = 0;
        int stackIn_9_0 = 0;
        boolean stackIn_11_0 = false;
        RuntimeException stackIn_13_0 = null;
        StringBuilder stackIn_13_1 = null;
        RuntimeException stackIn_15_0 = null;
        StringBuilder stackIn_15_1 = null;
        RuntimeException stackIn_16_0 = null;
        StringBuilder stackIn_16_1 = null;
        String stackIn_16_2 = null;
        RuntimeException stackIn_17_0 = null;
        StringBuilder stackIn_17_1 = null;
        RuntimeException stackIn_19_0 = null;
        StringBuilder stackIn_19_1 = null;
        RuntimeException stackIn_20_0 = null;
        StringBuilder stackIn_20_1 = null;
        String stackIn_20_2 = null;
        RuntimeException decompiledCaughtException = null;
        int stackOut_3_0 = 0;
        int stackOut_8_0 = 0;
        boolean stackOut_10_0 = false;
        RuntimeException stackOut_12_0 = null;
        StringBuilder stackOut_12_1 = null;
        RuntimeException stackOut_15_0 = null;
        StringBuilder stackOut_15_1 = null;
        String stackOut_15_2 = null;
        RuntimeException stackOut_13_0 = null;
        StringBuilder stackOut_13_1 = null;
        String stackOut_13_2 = null;
        RuntimeException stackOut_16_0 = null;
        StringBuilder stackOut_16_1 = null;
        RuntimeException stackOut_19_0 = null;
        StringBuilder stackOut_19_1 = null;
        String stackOut_19_2 = null;
        RuntimeException stackOut_17_0 = null;
        StringBuilder stackOut_17_1 = null;
        String stackOut_17_2 = null;
        try {
          L0: {
            if (!((mf) this).a((byte) -127)) {
              stackOut_3_0 = 0;
              stackIn_4_0 = stackOut_3_0;
              return stackIn_4_0 != 0;
            } else {
              param1 = param1.toLowerCase();
              param0 = param0.toLowerCase();
              var4_int = ((mf) this).field_k.field_n.a(ni.a(-112, (CharSequence) (Object) param1), (byte) -91);
              if (!this.b(param2, var4_int)) {
                stackOut_8_0 = 0;
                stackIn_9_0 = stackOut_8_0;
                return stackIn_9_0 != 0;
              } else {
                var5 = ((mf) this).field_k.field_i[var4_int].a(ni.a(-109, (CharSequence) (Object) param0), (byte) -114);
                stackOut_10_0 = ((mf) this).a(var5, var4_int, (byte) 102);
                stackIn_11_0 = stackOut_10_0;
                break L0;
              }
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L1: {
            var4 = decompiledCaughtException;
            stackOut_12_0 = (RuntimeException) var4;
            stackOut_12_1 = new StringBuilder().append("mf.T(");
            stackIn_15_0 = stackOut_12_0;
            stackIn_15_1 = stackOut_12_1;
            stackIn_13_0 = stackOut_12_0;
            stackIn_13_1 = stackOut_12_1;
            if (param0 == null) {
              stackOut_15_0 = (RuntimeException) (Object) stackIn_15_0;
              stackOut_15_1 = (StringBuilder) (Object) stackIn_15_1;
              stackOut_15_2 = "null";
              stackIn_16_0 = stackOut_15_0;
              stackIn_16_1 = stackOut_15_1;
              stackIn_16_2 = stackOut_15_2;
              break L1;
            } else {
              stackOut_13_0 = (RuntimeException) (Object) stackIn_13_0;
              stackOut_13_1 = (StringBuilder) (Object) stackIn_13_1;
              stackOut_13_2 = "{...}";
              stackIn_16_0 = stackOut_13_0;
              stackIn_16_1 = stackOut_13_1;
              stackIn_16_2 = stackOut_13_2;
              break L1;
            }
          }
          L2: {
            stackOut_16_0 = (RuntimeException) (Object) stackIn_16_0;
            stackOut_16_1 = ((StringBuilder) (Object) stackIn_16_1).append(stackIn_16_2).append(',');
            stackIn_19_0 = stackOut_16_0;
            stackIn_19_1 = stackOut_16_1;
            stackIn_17_0 = stackOut_16_0;
            stackIn_17_1 = stackOut_16_1;
            if (param1 == null) {
              stackOut_19_0 = (RuntimeException) (Object) stackIn_19_0;
              stackOut_19_1 = (StringBuilder) (Object) stackIn_19_1;
              stackOut_19_2 = "null";
              stackIn_20_0 = stackOut_19_0;
              stackIn_20_1 = stackOut_19_1;
              stackIn_20_2 = stackOut_19_2;
              break L2;
            } else {
              stackOut_17_0 = (RuntimeException) (Object) stackIn_17_0;
              stackOut_17_1 = (StringBuilder) (Object) stackIn_17_1;
              stackOut_17_2 = "{...}";
              stackIn_20_0 = stackOut_17_0;
              stackIn_20_1 = stackOut_17_1;
              stackIn_20_2 = stackOut_17_2;
              break L2;
            }
          }
          throw qb.a((Throwable) (Object) stackIn_20_0, stackIn_20_2 + ',' + param2 + ')');
        }
        return stackIn_11_0;
    }

    final synchronized int d(int param0, int param1) {
        RuntimeException var3 = null;
        int stackIn_2_0 = 0;
        int stackIn_8_0 = 0;
        int stackIn_10_0 = 0;
        RuntimeException decompiledCaughtException = null;
        int stackOut_9_0 = 0;
        int stackOut_7_0 = 0;
        int stackOut_1_0 = 0;
        try {
          L0: {
            if (this.b(0, param0)) {
              L1: {
                if (param1 == -27509) {
                  break L1;
                } else {
                  field_a = null;
                  break L1;
                }
              }
              if (null == ((mf) this).field_j[param0]) {
                stackOut_9_0 = ((mf) this).field_g.a((byte) -97, param0);
                stackIn_10_0 = stackOut_9_0;
                break L0;
              } else {
                stackOut_7_0 = 100;
                stackIn_8_0 = stackOut_7_0;
                return stackIn_8_0;
              }
            } else {
              stackOut_1_0 = 0;
              stackIn_2_0 = stackOut_1_0;
              return stackIn_2_0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3 = decompiledCaughtException;
          throw qb.a((Throwable) (Object) var3, "mf.I(" + param0 + ',' + param1 + ')');
        }
        return stackIn_10_0;
    }

    final synchronized byte[] b(int param0, byte param1) {
        RuntimeException var3 = null;
        Object stackIn_4_0 = null;
        byte[] stackIn_7_0 = null;
        Object stackIn_10_0 = null;
        byte[] stackIn_15_0 = null;
        Object stackIn_18_0 = null;
        RuntimeException decompiledCaughtException = null;
        Object stackOut_3_0 = null;
        byte[] stackOut_14_0 = null;
        Object stackOut_17_0 = null;
        Object stackOut_9_0 = null;
        byte[] stackOut_6_0 = null;
        try {
          if (!((mf) this).a((byte) -127)) {
            stackOut_3_0 = null;
            stackIn_4_0 = stackOut_3_0;
            return (byte[]) (Object) stackIn_4_0;
          } else {
            if (1 != ((mf) this).field_k.field_l.length) {
              if (this.b(0, param0)) {
                if (((mf) this).field_k.field_l[param0] == 1) {
                  stackOut_14_0 = ((mf) this).a(0, param0, 4);
                  stackIn_15_0 = stackOut_14_0;
                  return stackIn_15_0;
                } else {
                  if (param1 >= 19) {
                    throw new RuntimeException();
                  } else {
                    stackOut_17_0 = null;
                    stackIn_18_0 = stackOut_17_0;
                    return (byte[]) (Object) stackIn_18_0;
                  }
                }
              } else {
                stackOut_9_0 = null;
                stackIn_10_0 = stackOut_9_0;
                return (byte[]) (Object) stackIn_10_0;
              }
            } else {
              stackOut_6_0 = ((mf) this).a(param0, 0, 4);
              stackIn_7_0 = stackOut_6_0;
              return stackIn_7_0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3 = decompiledCaughtException;
          throw qb.a((Throwable) (Object) var3, "mf.E(" + param0 + ',' + param1 + ')');
        }
    }

    final synchronized boolean a(int param0) {
        int var2_int = 0;
        RuntimeException var2 = null;
        int var3 = 0;
        int var4 = 0;
        int var5 = 0;
        int stackIn_5_0 = 0;
        int stackIn_11_0 = 0;
        int stackIn_20_0 = 0;
        RuntimeException decompiledCaughtException = null;
        int stackOut_4_0 = 0;
        int stackOut_10_0 = 0;
        int stackOut_19_0 = 0;
        var5 = BrickABrac.field_J ? 1 : 0;
        try {
          L0: {
            if (!((mf) this).a((byte) -127)) {
              stackOut_4_0 = 0;
              stackIn_5_0 = stackOut_4_0;
              return stackIn_5_0 != 0;
            } else {
              L1: {
                var2_int = 1;
                var3 = 0;
                if (param0 > 88) {
                  break L1;
                } else {
                  byte[] discarded$2 = ((mf) this).a(-39, (String) ((mf) this).field_j[1], (String) null);
                  break L1;
                }
              }
              L2: while (true) {
                L3: {
                  L4: {
                    if (var3 >= ((mf) this).field_k.field_g.length) {
                      break L4;
                    } else {
                      stackOut_10_0 = ((mf) this).field_k.field_g[var3];
                      stackIn_20_0 = stackOut_10_0;
                      stackIn_11_0 = stackOut_10_0;
                      if (var5 != 0) {
                        break L3;
                      } else {
                        L5: {
                          var4 = stackIn_11_0;
                          if (null == ((mf) this).field_j[var4]) {
                            this.a(var4, (byte) -78);
                            if (((mf) this).field_j[var4] == null) {
                              var2_int = 0;
                              break L5;
                            } else {
                              break L5;
                            }
                          } else {
                            break L5;
                          }
                        }
                        var3++;
                        if (var5 == 0) {
                          continue L2;
                        } else {
                          break L4;
                        }
                      }
                    }
                  }
                  stackOut_19_0 = var2_int;
                  stackIn_20_0 = stackOut_19_0;
                  break L3;
                }
                break L0;
              }
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2 = decompiledCaughtException;
          throw qb.a((Throwable) (Object) var2, "mf.W(" + param0 + ')');
        }
        return stackIn_20_0 != 0;
    }

    final int b(int param0, String param1) {
        int var3_int = 0;
        RuntimeException var3 = null;
        int stackIn_2_0 = 0;
        int stackIn_5_0 = 0;
        int stackIn_7_0 = 0;
        RuntimeException stackIn_9_0 = null;
        StringBuilder stackIn_9_1 = null;
        RuntimeException stackIn_11_0 = null;
        StringBuilder stackIn_11_1 = null;
        RuntimeException stackIn_12_0 = null;
        StringBuilder stackIn_12_1 = null;
        String stackIn_12_2 = null;
        RuntimeException decompiledCaughtException = null;
        int stackOut_6_0 = 0;
        int stackOut_4_0 = 0;
        int stackOut_1_0 = 0;
        RuntimeException stackOut_8_0 = null;
        StringBuilder stackOut_8_1 = null;
        RuntimeException stackOut_11_0 = null;
        StringBuilder stackOut_11_1 = null;
        String stackOut_11_2 = null;
        RuntimeException stackOut_9_0 = null;
        StringBuilder stackOut_9_1 = null;
        String stackOut_9_2 = null;
        try {
          L0: {
            if (((mf) this).a((byte) -127)) {
              if (param0 == 0) {
                param1 = param1.toLowerCase();
                var3_int = ((mf) this).field_k.field_n.a(ni.a(-120, (CharSequence) (Object) param1), (byte) -94);
                stackOut_6_0 = ((mf) this).d(var3_int, -27509);
                stackIn_7_0 = stackOut_6_0;
                break L0;
              } else {
                stackOut_4_0 = 48;
                stackIn_5_0 = stackOut_4_0;
                return stackIn_5_0;
              }
            } else {
              stackOut_1_0 = 0;
              stackIn_2_0 = stackOut_1_0;
              return stackIn_2_0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L1: {
            var3 = decompiledCaughtException;
            stackOut_8_0 = (RuntimeException) var3;
            stackOut_8_1 = new StringBuilder().append("mf.R(").append(param0).append(',');
            stackIn_11_0 = stackOut_8_0;
            stackIn_11_1 = stackOut_8_1;
            stackIn_9_0 = stackOut_8_0;
            stackIn_9_1 = stackOut_8_1;
            if (param1 == null) {
              stackOut_11_0 = (RuntimeException) (Object) stackIn_11_0;
              stackOut_11_1 = (StringBuilder) (Object) stackIn_11_1;
              stackOut_11_2 = "null";
              stackIn_12_0 = stackOut_11_0;
              stackIn_12_1 = stackOut_11_1;
              stackIn_12_2 = stackOut_11_2;
              break L1;
            } else {
              stackOut_9_0 = (RuntimeException) (Object) stackIn_9_0;
              stackOut_9_1 = (StringBuilder) (Object) stackIn_9_1;
              stackOut_9_2 = "{...}";
              stackIn_12_0 = stackOut_9_0;
              stackIn_12_1 = stackOut_9_1;
              stackIn_12_2 = stackOut_9_2;
              break L1;
            }
          }
          throw qb.a((Throwable) (Object) stackIn_12_0, stackIn_12_2 + ')');
        }
        return stackIn_7_0;
    }

    final boolean a(int param0, String param1) {
        int var3_int = 0;
        RuntimeException var3 = null;
        int var4 = 0;
        int stackIn_2_0 = 0;
        int stackIn_7_0 = 0;
        int stackIn_9_0 = 0;
        RuntimeException stackIn_11_0 = null;
        StringBuilder stackIn_11_1 = null;
        RuntimeException stackIn_13_0 = null;
        StringBuilder stackIn_13_1 = null;
        RuntimeException stackIn_14_0 = null;
        StringBuilder stackIn_14_1 = null;
        String stackIn_14_2 = null;
        RuntimeException decompiledCaughtException = null;
        int stackOut_6_0 = 0;
        int stackOut_8_0 = 0;
        int stackOut_1_0 = 0;
        RuntimeException stackOut_10_0 = null;
        StringBuilder stackOut_10_1 = null;
        RuntimeException stackOut_13_0 = null;
        StringBuilder stackOut_13_1 = null;
        String stackOut_13_2 = null;
        RuntimeException stackOut_11_0 = null;
        StringBuilder stackOut_11_1 = null;
        String stackOut_11_2 = null;
        try {
          L0: {
            if (((mf) this).a((byte) -127)) {
              param1 = param1.toLowerCase();
              var3_int = 12 % ((param0 - 59) / 33);
              var4 = ((mf) this).field_k.field_n.a(ni.a(-128, (CharSequence) (Object) param1), (byte) -84);
              if (var4 < 0) {
                stackOut_6_0 = 0;
                stackIn_7_0 = stackOut_6_0;
                return stackIn_7_0 != 0;
              } else {
                stackOut_8_0 = 1;
                stackIn_9_0 = stackOut_8_0;
                break L0;
              }
            } else {
              stackOut_1_0 = 0;
              stackIn_2_0 = stackOut_1_0;
              return stackIn_2_0 != 0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L1: {
            var3 = decompiledCaughtException;
            stackOut_10_0 = (RuntimeException) var3;
            stackOut_10_1 = new StringBuilder().append("mf.K(").append(param0).append(',');
            stackIn_13_0 = stackOut_10_0;
            stackIn_13_1 = stackOut_10_1;
            stackIn_11_0 = stackOut_10_0;
            stackIn_11_1 = stackOut_10_1;
            if (param1 == null) {
              stackOut_13_0 = (RuntimeException) (Object) stackIn_13_0;
              stackOut_13_1 = (StringBuilder) (Object) stackIn_13_1;
              stackOut_13_2 = "null";
              stackIn_14_0 = stackOut_13_0;
              stackIn_14_1 = stackOut_13_1;
              stackIn_14_2 = stackOut_13_2;
              break L1;
            } else {
              stackOut_11_0 = (RuntimeException) (Object) stackIn_11_0;
              stackOut_11_1 = (StringBuilder) (Object) stackIn_11_1;
              stackOut_11_2 = "{...}";
              stackIn_14_0 = stackOut_11_0;
              stackIn_14_1 = stackOut_11_1;
              stackIn_14_2 = stackOut_11_2;
              break L1;
            }
          }
          throw qb.a((Throwable) (Object) stackIn_14_0, stackIn_14_2 + ')');
        }
        return stackIn_9_0 != 0;
    }

    private final synchronized byte[] a(int param0, int param1, int param2, int[] param3) {
        Object var5 = null;
        int var6 = 0;
        Object stackIn_2_0 = null;
        Object stackIn_12_0 = null;
        Object stackIn_15_0 = null;
        Object stackIn_41_0 = null;
        Object stackIn_43_0 = null;
        StringBuilder stackIn_43_1 = null;
        Object stackIn_45_0 = null;
        StringBuilder stackIn_45_1 = null;
        Object stackIn_46_0 = null;
        StringBuilder stackIn_46_1 = null;
        String stackIn_46_2 = null;
        RuntimeException decompiledCaughtException = null;
        Object stackOut_11_0 = null;
        Object stackOut_40_0 = null;
        Object stackOut_14_0 = null;
        Object stackOut_1_0 = null;
        Object stackOut_42_0 = null;
        StringBuilder stackOut_42_1 = null;
        Object stackOut_45_0 = null;
        StringBuilder stackOut_45_1 = null;
        String stackOut_45_2 = null;
        Object stackOut_43_0 = null;
        StringBuilder stackOut_43_1 = null;
        String stackOut_43_2 = null;
        try {
          L0: {
            if (this.a(true, param2, param1)) {
              L1: {
                L2: {
                  var5 = null;
                  if (null == ((mf) this).field_h[param1]) {
                    break L2;
                  } else {
                    if (null != ((mf) this).field_h[param1][param2]) {
                      break L1;
                    } else {
                      break L2;
                    }
                  }
                }
                var6 = this.a(122, param3, param1, param2) ? 1 : 0;
                if (var6 != 0) {
                  break L1;
                } else {
                  this.a(param1, (byte) -78);
                  var6 = this.a(106, param3, param1, param2) ? 1 : 0;
                  if (var6 == 0) {
                    stackOut_11_0 = null;
                    stackIn_12_0 = stackOut_11_0;
                    return (byte[]) (Object) stackIn_12_0;
                  } else {
                    break L1;
                  }
                }
              }
              if (param0 == 646) {
                if (((mf) this).field_h[param1] == null) {
                  throw new RuntimeException("");
                } else {
                  L3: {
                    if (((mf) this).field_h[param1][param2] == null) {
                      break L3;
                    } else {
                      var5 = (Object) (Object) be.a(false, ((mf) this).field_h[param1][param2], false);
                      if (var5 == null) {
                        throw new RuntimeException("");
                      } else {
                        break L3;
                      }
                    }
                  }
                  L4: {
                    if (var5 != null) {
                      L5: {
                        if (((mf) this).field_l != 1) {
                          break L5;
                        } else {
                          ((mf) this).field_h[param1][param2] = null;
                          if (((mf) this).field_k.field_l[param1] != 1) {
                            break L4;
                          } else {
                            ((mf) this).field_h[param1] = null;
                            if (!BrickABrac.field_J) {
                              break L4;
                            } else {
                              break L5;
                            }
                          }
                        }
                      }
                      if (((mf) this).field_l != 2) {
                        break L4;
                      } else {
                        ((mf) this).field_h[param1] = null;
                        break L4;
                      }
                    } else {
                      break L4;
                    }
                  }
                  stackOut_40_0 = var5;
                  stackIn_41_0 = stackOut_40_0;
                  break L0;
                }
              } else {
                stackOut_14_0 = null;
                stackIn_15_0 = stackOut_14_0;
                return (byte[]) (Object) stackIn_15_0;
              }
            } else {
              stackOut_1_0 = null;
              stackIn_2_0 = stackOut_1_0;
              return (byte[]) (Object) stackIn_2_0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L6: {
            var5 = (Object) (Object) decompiledCaughtException;
            stackOut_42_0 = var5;
            stackOut_42_1 = new StringBuilder().append("mf.F(").append(param0).append(',').append(param1).append(',').append(param2).append(',');
            stackIn_45_0 = stackOut_42_0;
            stackIn_45_1 = stackOut_42_1;
            stackIn_43_0 = stackOut_42_0;
            stackIn_43_1 = stackOut_42_1;
            if (param3 == null) {
              stackOut_45_0 = stackIn_45_0;
              stackOut_45_1 = (StringBuilder) (Object) stackIn_45_1;
              stackOut_45_2 = "null";
              stackIn_46_0 = stackOut_45_0;
              stackIn_46_1 = stackOut_45_1;
              stackIn_46_2 = stackOut_45_2;
              break L6;
            } else {
              stackOut_43_0 = stackIn_43_0;
              stackOut_43_1 = (StringBuilder) (Object) stackIn_43_1;
              stackOut_43_2 = "{...}";
              stackIn_46_0 = stackOut_43_0;
              stackIn_46_1 = stackOut_43_1;
              stackIn_46_2 = stackOut_43_2;
              break L6;
            }
          }
          throw qb.a((Throwable) (Object) stackIn_46_0, stackIn_46_2 + ')');
        }
        return (byte[]) (Object) stackIn_41_0;
    }

    final byte[] a(int param0, int param1, int param2) {
        RuntimeException var4 = null;
        Object stackIn_2_0 = null;
        byte[] stackIn_4_0 = null;
        RuntimeException decompiledCaughtException = null;
        byte[] stackOut_3_0 = null;
        Object stackOut_1_0 = null;
        try {
          L0: {
            if (param2 == 4) {
              stackOut_3_0 = this.a(646, param1, param0, (int[]) null);
              stackIn_4_0 = stackOut_3_0;
              break L0;
            } else {
              stackOut_1_0 = null;
              stackIn_2_0 = stackOut_1_0;
              return (byte[]) (Object) stackIn_2_0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var4 = decompiledCaughtException;
          throw qb.a((Throwable) (Object) var4, "mf.P(" + param0 + ',' + param1 + ',' + param2 + ')');
        }
        return stackIn_4_0;
    }

    final synchronized boolean a(int param0, int param1, byte param2) {
        RuntimeException var4 = null;
        int stackIn_2_0 = 0;
        int stackIn_10_0 = 0;
        int stackIn_13_0 = 0;
        int stackIn_16_0 = 0;
        boolean stackIn_19_0 = false;
        int stackIn_21_0 = 0;
        RuntimeException decompiledCaughtException = null;
        int stackOut_9_0 = 0;
        int stackOut_20_0 = 0;
        boolean stackOut_18_0 = false;
        int stackOut_15_0 = 0;
        int stackOut_12_0 = 0;
        int stackOut_1_0 = 0;
        try {
          L0: {
            if (this.a(true, param0, param1)) {
              L1: {
                if (null == ((mf) this).field_h[param1]) {
                  break L1;
                } else {
                  if (((mf) this).field_h[param1][param0] != null) {
                    stackOut_9_0 = 1;
                    stackIn_10_0 = stackOut_9_0;
                    return stackIn_10_0 != 0;
                  } else {
                    break L1;
                  }
                }
              }
              if (null == ((mf) this).field_j[param1]) {
                this.a(param1, (byte) -78);
                if (null == ((mf) this).field_j[param1]) {
                  if (param2 == 102) {
                    stackOut_20_0 = 0;
                    stackIn_21_0 = stackOut_20_0;
                    break L0;
                  } else {
                    stackOut_18_0 = ((boolean[]) ((mf) this).field_j[3])[5];
                    stackIn_19_0 = stackOut_18_0;
                    return stackIn_19_0;
                  }
                } else {
                  stackOut_15_0 = 1;
                  stackIn_16_0 = stackOut_15_0;
                  return stackIn_16_0 != 0;
                }
              } else {
                stackOut_12_0 = 1;
                stackIn_13_0 = stackOut_12_0;
                return stackIn_13_0 != 0;
              }
            } else {
              stackOut_1_0 = 0;
              stackIn_2_0 = stackOut_1_0;
              return stackIn_2_0 != 0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var4 = decompiledCaughtException;
          throw qb.a((Throwable) (Object) var4, "mf.O(" + param0 + ',' + param1 + ',' + param2 + ')');
        }
        return stackIn_21_0 != 0;
    }

    final synchronized int b(int param0) {
        int var2_int = 0;
        RuntimeException var2 = null;
        int var3 = 0;
        int var4 = 0;
        int var5 = 0;
        int stackIn_3_0 = 0;
        int stackIn_7_0 = 0;
        int stackIn_7_1 = 0;
        int stackIn_14_0 = 0;
        int stackIn_14_1 = 0;
        int stackIn_17_0 = 0;
        int stackIn_20_0 = 0;
        int stackIn_22_0 = 0;
        RuntimeException decompiledCaughtException = null;
        int stackOut_6_0 = 0;
        int stackOut_6_1 = 0;
        int stackOut_13_0 = 0;
        int stackOut_13_1 = 0;
        int stackOut_16_0 = 0;
        int stackOut_21_0 = 0;
        int stackOut_19_0 = 0;
        int stackOut_2_0 = 0;
        var5 = BrickABrac.field_J ? 1 : 0;
        try {
          L0: {
            if (((mf) this).a((byte) -127)) {
              var2_int = 0;
              var3 = 0;
              var4 = 0;
              L1: while (true) {
                L2: {
                  L3: {
                    if (~((mf) this).field_j.length >= ~var4) {
                      break L3;
                    } else {
                      stackOut_6_0 = -1;
                      stackOut_6_1 = ~((mf) this).field_k.field_m[var4];
                      stackIn_14_0 = stackOut_6_0;
                      stackIn_14_1 = stackOut_6_1;
                      stackIn_7_0 = stackOut_6_0;
                      stackIn_7_1 = stackOut_6_1;
                      if (var5 != 0) {
                        break L2;
                      } else {
                        L4: {
                          if (stackIn_7_0 > stackIn_7_1) {
                            var2_int += 100;
                            var3 = var3 + ((mf) this).d(var4, -27509);
                            break L4;
                          } else {
                            break L4;
                          }
                        }
                        var4++;
                        if (var5 == 0) {
                          continue L1;
                        } else {
                          break L3;
                        }
                      }
                    }
                  }
                  stackOut_13_0 = 0;
                  stackOut_13_1 = var2_int;
                  stackIn_14_0 = stackOut_13_0;
                  stackIn_14_1 = stackOut_13_1;
                  break L2;
                }
                if (stackIn_14_0 == stackIn_14_1) {
                  stackOut_16_0 = 100;
                  stackIn_17_0 = stackOut_16_0;
                  return stackIn_17_0;
                } else {
                  var4 = var3 * 100 / var2_int;
                  if (param0 == -4126) {
                    stackOut_21_0 = var4;
                    stackIn_22_0 = stackOut_21_0;
                    break L0;
                  } else {
                    stackOut_19_0 = 74;
                    stackIn_20_0 = stackOut_19_0;
                    return stackIn_20_0;
                  }
                }
              }
            } else {
              stackOut_2_0 = 0;
              stackIn_3_0 = stackOut_2_0;
              return stackIn_3_0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2 = decompiledCaughtException;
          throw qb.a((Throwable) (Object) var2, "mf.BA(" + param0 + ')');
        }
        return stackIn_22_0;
    }

    private final synchronized boolean a(boolean param0, int param1, int param2) {
        RuntimeException var4 = null;
        int stackIn_2_0 = 0;
        int stackIn_7_0 = 0;
        int stackIn_22_0 = 0;
        int stackIn_25_0 = 0;
        RuntimeException decompiledCaughtException = null;
        int stackOut_6_0 = 0;
        int stackOut_24_0 = 0;
        int stackOut_21_0 = 0;
        int stackOut_1_0 = 0;
        try {
          L0: {
            if (param0) {
              if (!((mf) this).a((byte) -127)) {
                stackOut_6_0 = 0;
                stackIn_7_0 = stackOut_6_0;
                return stackIn_7_0 != 0;
              } else {
                L1: {
                  if (param2 < 0) {
                    break L1;
                  } else {
                    if (param1 < 0) {
                      break L1;
                    } else {
                      if (param2 >= ((mf) this).field_k.field_l.length) {
                        break L1;
                      } else {
                        if (~param1 > ~((mf) this).field_k.field_l[param2]) {
                          stackOut_24_0 = 1;
                          stackIn_25_0 = stackOut_24_0;
                          break L0;
                        } else {
                          break L1;
                        }
                      }
                    }
                  }
                }
                if (rn.field_n) {
                  throw new IllegalArgumentException(param2 + " " + param1);
                } else {
                  stackOut_21_0 = 0;
                  stackIn_22_0 = stackOut_21_0;
                  return stackIn_22_0 != 0;
                }
              }
            } else {
              stackOut_1_0 = 1;
              stackIn_2_0 = stackOut_1_0;
              return stackIn_2_0 != 0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var4 = decompiledCaughtException;
          throw qb.a((Throwable) (Object) var4, "mf.C(" + param0 + ',' + param1 + ',' + param2 + ')');
        }
        return stackIn_25_0 != 0;
    }

    private final synchronized boolean b(int param0, int param1) {
        RuntimeException var3 = null;
        int stackIn_4_0 = 0;
        int stackIn_18_0 = 0;
        int stackIn_20_0 = 0;
        RuntimeException decompiledCaughtException = null;
        int stackOut_3_0 = 0;
        int stackOut_19_0 = 0;
        int stackOut_17_0 = 0;
        try {
          L0: {
            if (!((mf) this).a((byte) -127)) {
              stackOut_3_0 = 0;
              stackIn_4_0 = stackOut_3_0;
              return stackIn_4_0 != 0;
            } else {
              L1: {
                if (param0 > param1) {
                  break L1;
                } else {
                  if (((mf) this).field_k.field_l.length <= param1) {
                    break L1;
                  } else {
                    if (0 == ((mf) this).field_k.field_l[param1]) {
                      break L1;
                    } else {
                      stackOut_19_0 = 1;
                      stackIn_20_0 = stackOut_19_0;
                      break L0;
                    }
                  }
                }
              }
              if (!rn.field_n) {
                stackOut_17_0 = 0;
                stackIn_18_0 = stackOut_17_0;
                return stackIn_18_0 != 0;
              } else {
                throw new IllegalArgumentException(Integer.toString(param1));
              }
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3 = decompiledCaughtException;
          throw qb.a((Throwable) (Object) var3, "mf.S(" + param0 + ',' + param1 + ')');
        }
        return stackIn_20_0 != 0;
    }

    final int a(int param0, int param1, String param2) {
        int var4_int = 0;
        RuntimeException var4 = null;
        int stackIn_2_0 = 0;
        int stackIn_5_0 = 0;
        int stackIn_10_0 = 0;
        RuntimeException stackIn_12_0 = null;
        StringBuilder stackIn_12_1 = null;
        RuntimeException stackIn_14_0 = null;
        StringBuilder stackIn_14_1 = null;
        RuntimeException stackIn_15_0 = null;
        StringBuilder stackIn_15_1 = null;
        String stackIn_15_2 = null;
        RuntimeException decompiledCaughtException = null;
        int stackOut_9_0 = 0;
        int stackOut_4_0 = 0;
        int stackOut_1_0 = 0;
        RuntimeException stackOut_11_0 = null;
        StringBuilder stackOut_11_1 = null;
        RuntimeException stackOut_14_0 = null;
        StringBuilder stackOut_14_1 = null;
        String stackOut_14_2 = null;
        RuntimeException stackOut_12_0 = null;
        StringBuilder stackOut_12_1 = null;
        String stackOut_12_2 = null;
        try {
          L0: {
            if (this.b(0, param0)) {
              param2 = param2.toLowerCase();
              var4_int = ((mf) this).field_k.field_i[param0].a(ni.a(-115, (CharSequence) (Object) param2), (byte) -109);
              if (this.a(true, var4_int, param0)) {
                L1: {
                  if (param1 < -13) {
                    break L1;
                  } else {
                    boolean discarded$2 = ((mf) this).a(((int[]) ((Object[]) ((Object[]) ((mf) this).field_j[7])[5])[0])[0]);
                    break L1;
                  }
                }
                stackOut_9_0 = var4_int;
                stackIn_10_0 = stackOut_9_0;
                break L0;
              } else {
                stackOut_4_0 = -1;
                stackIn_5_0 = stackOut_4_0;
                return stackIn_5_0;
              }
            } else {
              stackOut_1_0 = -1;
              stackIn_2_0 = stackOut_1_0;
              return stackIn_2_0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L2: {
            var4 = decompiledCaughtException;
            stackOut_11_0 = (RuntimeException) var4;
            stackOut_11_1 = new StringBuilder().append("mf.Q(").append(param0).append(',').append(param1).append(',');
            stackIn_14_0 = stackOut_11_0;
            stackIn_14_1 = stackOut_11_1;
            stackIn_12_0 = stackOut_11_0;
            stackIn_12_1 = stackOut_11_1;
            if (param2 == null) {
              stackOut_14_0 = (RuntimeException) (Object) stackIn_14_0;
              stackOut_14_1 = (StringBuilder) (Object) stackIn_14_1;
              stackOut_14_2 = "null";
              stackIn_15_0 = stackOut_14_0;
              stackIn_15_1 = stackOut_14_1;
              stackIn_15_2 = stackOut_14_2;
              break L2;
            } else {
              stackOut_12_0 = (RuntimeException) (Object) stackIn_12_0;
              stackOut_12_1 = (StringBuilder) (Object) stackIn_12_1;
              stackOut_12_2 = "{...}";
              stackIn_15_0 = stackOut_12_0;
              stackIn_15_1 = stackOut_12_1;
              stackIn_15_2 = stackOut_12_2;
              break L2;
            }
          }
          throw qb.a((Throwable) (Object) stackIn_15_0, stackIn_15_2 + ')');
        }
        return stackIn_10_0;
    }

    final static lo a(byte param0, String param1) {
        int var2_int = 0;
        RuntimeException var2 = null;
        int var3 = 0;
        int var4 = 0;
        int var5 = 0;
        int stackIn_4_0 = 0;
        int stackIn_4_1 = 0;
        Object stackIn_11_0 = null;
        int stackIn_14_0 = 0;
        int stackIn_14_1 = 0;
        lo stackIn_18_0 = null;
        RuntimeException stackIn_20_0 = null;
        StringBuilder stackIn_20_1 = null;
        RuntimeException stackIn_22_0 = null;
        StringBuilder stackIn_22_1 = null;
        RuntimeException stackIn_23_0 = null;
        StringBuilder stackIn_23_1 = null;
        String stackIn_23_2 = null;
        RuntimeException decompiledCaughtException = null;
        int stackOut_3_0 = 0;
        int stackOut_3_1 = 0;
        Object stackOut_10_0 = null;
        byte stackOut_13_0 = 0;
        int stackOut_13_1 = 0;
        lo stackOut_17_0 = null;
        RuntimeException stackOut_19_0 = null;
        StringBuilder stackOut_19_1 = null;
        RuntimeException stackOut_22_0 = null;
        StringBuilder stackOut_22_1 = null;
        String stackOut_22_2 = null;
        RuntimeException stackOut_20_0 = null;
        StringBuilder stackOut_20_1 = null;
        String stackOut_20_2 = null;
        var5 = BrickABrac.field_J ? 1 : 0;
        try {
          L0: {
            var2_int = param1.length();
            var3 = 0;
            L1: while (true) {
              L2: {
                L3: {
                  if (var3 >= var2_int) {
                    break L3;
                  } else {
                    var4 = param1.charAt(var3);
                    stackOut_3_0 = -49;
                    stackOut_3_1 = ~var4;
                    stackIn_14_0 = stackOut_3_0;
                    stackIn_14_1 = stackOut_3_1;
                    stackIn_4_0 = stackOut_3_0;
                    stackIn_4_1 = stackOut_3_1;
                    if (var5 != 0) {
                      break L2;
                    } else {
                      L4: {
                        if (stackIn_4_0 < stackIn_4_1) {
                          break L4;
                        } else {
                          if (var4 <= 57) {
                            var3++;
                            if (var5 == 0) {
                              continue L1;
                            } else {
                              break L3;
                            }
                          } else {
                            break L4;
                          }
                        }
                      }
                      stackOut_10_0 = null;
                      stackIn_11_0 = stackOut_10_0;
                      return (lo) (Object) stackIn_11_0;
                    }
                  }
                }
                stackOut_13_0 = param0;
                stackOut_13_1 = -58;
                stackIn_14_0 = stackOut_13_0;
                stackIn_14_1 = stackOut_13_1;
                break L2;
              }
              L5: {
                if (stackIn_14_0 <= stackIn_14_1) {
                  break L5;
                } else {
                  mf.a(false);
                  break L5;
                }
              }
              stackOut_17_0 = wg.field_c;
              stackIn_18_0 = stackOut_17_0;
              break L0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L6: {
            var2 = decompiledCaughtException;
            stackOut_19_0 = (RuntimeException) var2;
            stackOut_19_1 = new StringBuilder().append("mf.G(").append(param0).append(',');
            stackIn_22_0 = stackOut_19_0;
            stackIn_22_1 = stackOut_19_1;
            stackIn_20_0 = stackOut_19_0;
            stackIn_20_1 = stackOut_19_1;
            if (param1 == null) {
              stackOut_22_0 = (RuntimeException) (Object) stackIn_22_0;
              stackOut_22_1 = (StringBuilder) (Object) stackIn_22_1;
              stackOut_22_2 = "null";
              stackIn_23_0 = stackOut_22_0;
              stackIn_23_1 = stackOut_22_1;
              stackIn_23_2 = stackOut_22_2;
              break L6;
            } else {
              stackOut_20_0 = (RuntimeException) (Object) stackIn_20_0;
              stackOut_20_1 = (StringBuilder) (Object) stackIn_20_1;
              stackOut_20_2 = "{...}";
              stackIn_23_0 = stackOut_20_0;
              stackIn_23_1 = stackOut_20_1;
              stackIn_23_2 = stackOut_20_2;
              break L6;
            }
          }
          throw qb.a((Throwable) (Object) stackIn_23_0, stackIn_23_2 + ')');
        }
        return stackIn_18_0;
    }

    private final synchronized boolean a(int param0, int[] param1, int param2, int param3) {
        RuntimeException var5 = null;
        int var5_int = 0;
        int[] var6 = null;
        Object[] var7 = null;
        int var8 = 0;
        Object[] var9 = null;
        int var9_int = 0;
        byte[] var9_array = null;
        int var10_int = 0;
        byte[] var10 = null;
        wq var10_ref = null;
        RuntimeException var11_ref_RuntimeException = null;
        int var11 = 0;
        int var12 = 0;
        wq var13 = null;
        int[] var14 = null;
        int var14_int = 0;
        int var15_int = 0;
        byte[][] var15 = null;
        int var16 = 0;
        byte[] var16_ref_byte__ = null;
        int var17 = 0;
        int var18 = 0;
        int var19 = 0;
        int var20 = 0;
        int var21 = 0;
        int var22 = 0;
        int stackIn_5_0 = 0;
        int stackIn_10_0 = 0;
        int[] stackIn_17_0 = null;
        int stackIn_29_0 = 0;
        int[] stackIn_31_0 = null;
        RuntimeException stackIn_49_0 = null;
        StringBuilder stackIn_49_1 = null;
        RuntimeException stackIn_51_0 = null;
        StringBuilder stackIn_51_1 = null;
        RuntimeException stackIn_52_0 = null;
        StringBuilder stackIn_52_1 = null;
        int stackIn_52_2 = 0;
        int stackIn_64_0 = 0;
        int stackIn_78_0 = 0;
        int stackIn_80_0 = 0;
        int stackIn_84_0 = 0;
        int stackIn_103_0 = 0;
        int stackIn_112_0 = 0;
        int stackIn_122_0 = 0;
        int stackIn_131_0 = 0;
        int stackIn_159_0 = 0;
        int stackIn_163_0 = 0;
        RuntimeException stackIn_165_0 = null;
        StringBuilder stackIn_165_1 = null;
        RuntimeException stackIn_167_0 = null;
        StringBuilder stackIn_167_1 = null;
        RuntimeException stackIn_168_0 = null;
        StringBuilder stackIn_168_1 = null;
        String stackIn_168_2 = null;
        RuntimeException decompiledCaughtException = null;
        int stackOut_4_0 = 0;
        int stackOut_9_0 = 0;
        int[] stackOut_16_0 = null;
        int[] stackOut_30_0 = null;
        int stackOut_28_0 = 0;
        RuntimeException stackOut_48_0 = null;
        StringBuilder stackOut_48_1 = null;
        RuntimeException stackOut_51_0 = null;
        StringBuilder stackOut_51_1 = null;
        int stackOut_51_2 = 0;
        RuntimeException stackOut_49_0 = null;
        StringBuilder stackOut_49_1 = null;
        int stackOut_49_2 = 0;
        int stackOut_63_0 = 0;
        int stackOut_77_0 = 0;
        int stackOut_83_0 = 0;
        int stackOut_79_0 = 0;
        int stackOut_102_0 = 0;
        int stackOut_111_0 = 0;
        int stackOut_121_0 = 0;
        int stackOut_130_0 = 0;
        int stackOut_158_0 = 0;
        int stackOut_162_0 = 0;
        RuntimeException stackOut_164_0 = null;
        StringBuilder stackOut_164_1 = null;
        RuntimeException stackOut_167_0 = null;
        StringBuilder stackOut_167_1 = null;
        String stackOut_167_2 = null;
        RuntimeException stackOut_165_0 = null;
        StringBuilder stackOut_165_1 = null;
        String stackOut_165_2 = null;
        var22 = BrickABrac.field_J ? 1 : 0;
        try {
          L0: {
            if (!this.b(0, param2)) {
              stackOut_4_0 = 0;
              stackIn_5_0 = stackOut_4_0;
              return stackIn_5_0 != 0;
            } else {
              if (null == ((mf) this).field_j[param2]) {
                stackOut_9_0 = 0;
                stackIn_10_0 = stackOut_9_0;
                return stackIn_10_0 != 0;
              } else {
                L1: {
                  var5_int = ((mf) this).field_k.field_m[param2];
                  var6 = ((mf) this).field_k.field_h[param2];
                  if (null != ((mf) this).field_h[param2]) {
                    break L1;
                  } else {
                    ((mf) this).field_h[param2] = new Object[((mf) this).field_k.field_l[param2]];
                    break L1;
                  }
                }
                var7 = ((mf) this).field_h[param2];
                var8 = 1;
                var9_int = 0;
                L2: while (true) {
                  L3: {
                    L4: {
                      if (~var5_int >= ~var9_int) {
                        break L4;
                      } else {
                        stackOut_16_0 = (int[]) var6;
                        stackIn_31_0 = stackOut_16_0;
                        stackIn_17_0 = stackOut_16_0;
                        if (var22 != 0) {
                          break L3;
                        } else {
                          L5: {
                            L6: {
                              if (stackIn_17_0 != null) {
                                break L6;
                              } else {
                                var10_int = var9_int;
                                if (var22 == 0) {
                                  break L5;
                                } else {
                                  break L6;
                                }
                              }
                            }
                            var10_int = var6[var9_int];
                            break L5;
                          }
                          L7: {
                            if (var7[var10_int] != null) {
                              break L7;
                            } else {
                              var8 = 0;
                              if (var22 == 0) {
                                break L4;
                              } else {
                                break L7;
                              }
                            }
                          }
                          var9_int++;
                          if (var22 == 0) {
                            continue L2;
                          } else {
                            break L4;
                          }
                        }
                      }
                    }
                    if (var8 == 0) {
                      stackOut_30_0 = (int[]) param1;
                      stackIn_31_0 = stackOut_30_0;
                      break L3;
                    } else {
                      stackOut_28_0 = 1;
                      stackIn_29_0 = stackOut_28_0;
                      return stackIn_29_0 != 0;
                    }
                  }
                  L8: {
                    L9: {
                      if (stackIn_31_0 == null) {
                        break L9;
                      } else {
                        L10: {
                          if (0 != param1[0]) {
                            break L10;
                          } else {
                            if (param1[1] != 0) {
                              break L10;
                            } else {
                              if (0 != param1[2]) {
                                break L10;
                              } else {
                                if (param1[3] != 0) {
                                  break L10;
                                } else {
                                  break L9;
                                }
                              }
                            }
                          }
                        }
                        var9_array = be.a(false, ((mf) this).field_j[param2], true);
                        var10_ref = new wq(var9_array);
                        var10_ref.a(param1, 5, var10_ref.field_k.length, (byte) 85);
                        break L8;
                      }
                    }
                    var9_array = be.a(false, ((mf) this).field_j[param2], false);
                    break L8;
                  }
                  try {
                    L11: {
                      var10 = i.a(true, var9_array);
                      break L11;
                    }
                  } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
                    decompiledCaughtException = decompiledCaughtParameter0;
                    L12: {
                      var11_ref_RuntimeException = decompiledCaughtException;
                      stackOut_48_0 = (RuntimeException) var11_ref_RuntimeException;
                      stackOut_48_1 = new StringBuilder();
                      stackIn_51_0 = stackOut_48_0;
                      stackIn_51_1 = stackOut_48_1;
                      stackIn_49_0 = stackOut_48_0;
                      stackIn_49_1 = stackOut_48_1;
                      if (null == param1) {
                        stackOut_51_0 = (RuntimeException) (Object) stackIn_51_0;
                        stackOut_51_1 = (StringBuilder) (Object) stackIn_51_1;
                        stackOut_51_2 = 0;
                        stackIn_52_0 = stackOut_51_0;
                        stackIn_52_1 = stackOut_51_1;
                        stackIn_52_2 = stackOut_51_2;
                        break L12;
                      } else {
                        stackOut_49_0 = (RuntimeException) (Object) stackIn_49_0;
                        stackOut_49_1 = (StringBuilder) (Object) stackIn_49_1;
                        stackOut_49_2 = 1;
                        stackIn_52_0 = stackOut_49_0;
                        stackIn_52_1 = stackOut_49_1;
                        stackIn_52_2 = stackOut_49_2;
                        break L12;
                      }
                    }
                    throw qb.a((Throwable) (Object) stackIn_52_0, (stackIn_52_2 != 0) + " " + param2 + " " + var9_array.length + " " + cg.a(var9_array.length, var9_array, (byte) -86) + " " + cg.a(var9_array.length - 2, var9_array, (byte) -86) + " " + ((mf) this).field_k.field_p[param2] + " " + ((mf) this).field_k.field_b);
                  }
                  L13: {
                    if (((mf) this).field_b) {
                      ((mf) this).field_j[param2] = null;
                      break L13;
                    } else {
                      break L13;
                    }
                  }
                  L14: {
                    L15: {
                      L16: {
                        if (var5_int <= 1) {
                          break L16;
                        } else {
                          L17: {
                            if (2 != ((mf) this).field_l) {
                              break L17;
                            } else {
                              var11 = var10.length;
                              var11--;
                              var12 = var10[var11] & 255;
                              var11 = var11 - var12 * (var5_int * 4);
                              var13 = new wq(var10);
                              var14_int = 0;
                              var15_int = 0;
                              var13.field_l = var11;
                              var16 = 0;
                              L18: while (true) {
                                L19: {
                                  L20: {
                                    if (var16 >= var12) {
                                      break L20;
                                    } else {
                                      var17 = 0;
                                      stackOut_63_0 = 0;
                                      stackIn_78_0 = stackOut_63_0;
                                      stackIn_64_0 = stackOut_63_0;
                                      if (var22 != 0) {
                                        break L19;
                                      } else {
                                        var18 = stackIn_64_0;
                                        L21: while (true) {
                                          L22: {
                                            L23: {
                                              if (~var5_int >= ~var18) {
                                                break L23;
                                              } else {
                                                var17 = var17 + var13.e(255);
                                                if (var22 != 0) {
                                                  break L22;
                                                } else {
                                                  L24: {
                                                    L25: {
                                                      if (var6 == null) {
                                                        break L25;
                                                      } else {
                                                        var19 = var6[var18];
                                                        if (var22 == 0) {
                                                          break L24;
                                                        } else {
                                                          break L25;
                                                        }
                                                      }
                                                    }
                                                    var19 = var18;
                                                    break L24;
                                                  }
                                                  L26: {
                                                    if (param3 != var19) {
                                                      break L26;
                                                    } else {
                                                      var15_int = var19;
                                                      var14_int = var14_int + var17;
                                                      break L26;
                                                    }
                                                  }
                                                  var18++;
                                                  if (var22 == 0) {
                                                    continue L21;
                                                  } else {
                                                    break L23;
                                                  }
                                                }
                                              }
                                            }
                                            var16++;
                                            break L22;
                                          }
                                          if (var22 == 0) {
                                            continue L18;
                                          } else {
                                            break L20;
                                          }
                                        }
                                      }
                                    }
                                  }
                                  stackOut_77_0 = ~var14_int;
                                  stackIn_78_0 = stackOut_77_0;
                                  break L19;
                                }
                                if (stackIn_78_0 != -1) {
                                  var16_ref_byte__ = new byte[var14_int];
                                  var13.field_l = var11;
                                  var14_int = 0;
                                  var17 = 0;
                                  var18 = 0;
                                  L27: while (true) {
                                    L28: {
                                      if (var12 <= var18) {
                                        break L28;
                                      } else {
                                        var19 = 0;
                                        stackOut_83_0 = 0;
                                        stackIn_159_0 = stackOut_83_0;
                                        stackIn_84_0 = stackOut_83_0;
                                        if (var22 != 0) {
                                          break L14;
                                        } else {
                                          var20 = stackIn_84_0;
                                          L29: while (true) {
                                            L30: {
                                              L31: {
                                                if (~var5_int >= ~var20) {
                                                  break L31;
                                                } else {
                                                  var19 = var19 + var13.e(255);
                                                  if (var22 != 0) {
                                                    break L30;
                                                  } else {
                                                    L32: {
                                                      L33: {
                                                        if (var6 == null) {
                                                          break L33;
                                                        } else {
                                                          var21 = var6[var20];
                                                          if (var22 == 0) {
                                                            break L32;
                                                          } else {
                                                            break L33;
                                                          }
                                                        }
                                                      }
                                                      var21 = var20;
                                                      break L32;
                                                    }
                                                    L34: {
                                                      if (param3 == var21) {
                                                        pm.a(var10, var17, var16_ref_byte__, var14_int, var19);
                                                        var14_int = var14_int + var19;
                                                        break L34;
                                                      } else {
                                                        break L34;
                                                      }
                                                    }
                                                    var17 = var17 + var19;
                                                    var20++;
                                                    if (var22 == 0) {
                                                      continue L29;
                                                    } else {
                                                      break L31;
                                                    }
                                                  }
                                                }
                                              }
                                              var18++;
                                              break L30;
                                            }
                                            if (var22 == 0) {
                                              continue L27;
                                            } else {
                                              break L28;
                                            }
                                          }
                                        }
                                      }
                                    }
                                    var7[var15_int] = (Object) (Object) var16_ref_byte__;
                                    if (var22 == 0) {
                                      break L15;
                                    } else {
                                      break L17;
                                    }
                                  }
                                } else {
                                  stackOut_79_0 = 1;
                                  stackIn_80_0 = stackOut_79_0;
                                  return stackIn_80_0 != 0;
                                }
                              }
                            }
                          }
                          var11 = var10.length;
                          var11--;
                          var12 = 255 & var10[var11];
                          var11 = var11 - var5_int * var12 * 4;
                          var13 = new wq(var10);
                          var13.field_l = var11;
                          var14 = new int[var5_int];
                          var15_int = 0;
                          L35: while (true) {
                            L36: {
                              L37: {
                                if (var15_int >= var12) {
                                  break L37;
                                } else {
                                  var16 = 0;
                                  stackOut_102_0 = 0;
                                  stackIn_112_0 = stackOut_102_0;
                                  stackIn_103_0 = stackOut_102_0;
                                  if (var22 != 0) {
                                    break L36;
                                  } else {
                                    var17 = stackIn_103_0;
                                    L38: while (true) {
                                      L39: {
                                        L40: {
                                          if (var17 >= var5_int) {
                                            break L40;
                                          } else {
                                            var16 = var16 + var13.e(255);
                                            var14[var17] = var14[var17] + var16;
                                            var17++;
                                            if (var22 != 0) {
                                              break L39;
                                            } else {
                                              if (var22 == 0) {
                                                continue L38;
                                              } else {
                                                break L40;
                                              }
                                            }
                                          }
                                        }
                                        var15_int++;
                                        break L39;
                                      }
                                      if (var22 == 0) {
                                        continue L35;
                                      } else {
                                        break L37;
                                      }
                                    }
                                  }
                                }
                              }
                              stackOut_111_0 = var5_int;
                              stackIn_112_0 = stackOut_111_0;
                              break L36;
                            }
                            var15 = new byte[stackIn_112_0][];
                            var16 = 0;
                            L41: while (true) {
                              L42: {
                                L43: {
                                  if (~var16 <= ~var5_int) {
                                    break L43;
                                  } else {
                                    var15[var16] = new byte[var14[var16]];
                                    var14[var16] = 0;
                                    var16++;
                                    if (var22 != 0) {
                                      break L42;
                                    } else {
                                      if (var22 == 0) {
                                        continue L41;
                                      } else {
                                        break L43;
                                      }
                                    }
                                  }
                                }
                                var13.field_l = var11;
                                var16 = 0;
                                break L42;
                              }
                              var17 = 0;
                              L44: while (true) {
                                L45: {
                                  L46: {
                                    if (~var12 >= ~var17) {
                                      break L46;
                                    } else {
                                      var18 = 0;
                                      stackOut_121_0 = 0;
                                      stackIn_131_0 = stackOut_121_0;
                                      stackIn_122_0 = stackOut_121_0;
                                      if (var22 != 0) {
                                        break L45;
                                      } else {
                                        var19 = stackIn_122_0;
                                        L47: while (true) {
                                          L48: {
                                            L49: {
                                              if (var5_int <= var19) {
                                                break L49;
                                              } else {
                                                var18 = var18 + var13.e(255);
                                                pm.a(var10, var16, var15[var19], var14[var19], var18);
                                                var16 = var16 + var18;
                                                var14[var19] = var14[var19] + var18;
                                                var19++;
                                                if (var22 != 0) {
                                                  break L48;
                                                } else {
                                                  if (var22 == 0) {
                                                    continue L47;
                                                  } else {
                                                    break L49;
                                                  }
                                                }
                                              }
                                            }
                                            var17++;
                                            break L48;
                                          }
                                          if (var22 == 0) {
                                            continue L44;
                                          } else {
                                            break L46;
                                          }
                                        }
                                      }
                                    }
                                  }
                                  stackOut_130_0 = 0;
                                  stackIn_131_0 = stackOut_130_0;
                                  break L45;
                                }
                                var17 = stackIn_131_0;
                                L50: while (true) {
                                  L51: {
                                    if (~var17 <= ~var5_int) {
                                      break L51;
                                    } else {
                                      if (var22 != 0) {
                                        break L15;
                                      } else {
                                        L52: {
                                          L53: {
                                            if (var6 == null) {
                                              break L53;
                                            } else {
                                              var18 = var6[var17];
                                              if (var22 == 0) {
                                                break L52;
                                              } else {
                                                break L53;
                                              }
                                            }
                                          }
                                          var18 = var17;
                                          break L52;
                                        }
                                        L54: {
                                          L55: {
                                            if (((mf) this).field_l != 0) {
                                              break L55;
                                            } else {
                                              var7[var18] = eg.a(-128, var15[var17], false);
                                              if (var22 == 0) {
                                                break L54;
                                              } else {
                                                break L55;
                                              }
                                            }
                                          }
                                          var7[var18] = (Object) (Object) var15[var17];
                                          break L54;
                                        }
                                        var17++;
                                        if (var22 == 0) {
                                          continue L50;
                                        } else {
                                          break L51;
                                        }
                                      }
                                    }
                                  }
                                  if (var22 == 0) {
                                    break L15;
                                  } else {
                                    break L16;
                                  }
                                }
                              }
                            }
                          }
                        }
                      }
                      L56: {
                        L57: {
                          if (null == var6) {
                            break L57;
                          } else {
                            var11 = var6[0];
                            if (var22 == 0) {
                              break L56;
                            } else {
                              break L57;
                            }
                          }
                        }
                        var11 = 0;
                        break L56;
                      }
                      L58: {
                        if (0 == ((mf) this).field_l) {
                          break L58;
                        } else {
                          var7[var11] = (Object) (Object) var10;
                          if (var22 == 0) {
                            break L15;
                          } else {
                            break L58;
                          }
                        }
                      }
                      var7[var11] = eg.a(-123, var10, false);
                      break L15;
                    }
                    stackOut_158_0 = param0;
                    stackIn_159_0 = stackOut_158_0;
                    break L14;
                  }
                  L59: {
                    if (stackIn_159_0 >= 95) {
                      break L59;
                    } else {
                      field_i = null;
                      break L59;
                    }
                  }
                  stackOut_162_0 = 1;
                  stackIn_163_0 = stackOut_162_0;
                  break L0;
                }
              }
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter1) {
          decompiledCaughtException = decompiledCaughtParameter1;
          L60: {
            var5 = decompiledCaughtException;
            stackOut_164_0 = (RuntimeException) var5;
            stackOut_164_1 = new StringBuilder().append("mf.V(").append(param0).append(',');
            stackIn_167_0 = stackOut_164_0;
            stackIn_167_1 = stackOut_164_1;
            stackIn_165_0 = stackOut_164_0;
            stackIn_165_1 = stackOut_164_1;
            if (param1 == null) {
              stackOut_167_0 = (RuntimeException) (Object) stackIn_167_0;
              stackOut_167_1 = (StringBuilder) (Object) stackIn_167_1;
              stackOut_167_2 = "null";
              stackIn_168_0 = stackOut_167_0;
              stackIn_168_1 = stackOut_167_1;
              stackIn_168_2 = stackOut_167_2;
              break L60;
            } else {
              stackOut_165_0 = (RuntimeException) (Object) stackIn_165_0;
              stackOut_165_1 = (StringBuilder) (Object) stackIn_165_1;
              stackOut_165_2 = "{...}";
              stackIn_168_0 = stackOut_165_0;
              stackIn_168_1 = stackOut_165_1;
              stackIn_168_2 = stackOut_165_2;
              break L60;
            }
          }
          throw qb.a((Throwable) (Object) stackIn_168_0, stackIn_168_2 + ',' + param2 + ',' + param3 + ')');
        }
        return stackIn_163_0 != 0;
    }

    final synchronized boolean a(int param0, int param1) {
        RuntimeException var3 = null;
        int stackIn_2_0 = 0;
        int stackIn_10_0 = 0;
        int stackIn_15_0 = 0;
        int stackIn_17_0 = 0;
        RuntimeException decompiledCaughtException = null;
        int stackOut_9_0 = 0;
        int stackOut_14_0 = 0;
        int stackOut_16_0 = 0;
        int stackOut_1_0 = 0;
        try {
          L0: {
            if (this.b(0, param1)) {
              L1: {
                if (param0 == -13083) {
                  break L1;
                } else {
                  boolean discarded$2 = this.a(-71, (int[]) null, ((int[]) ((Object[]) ((Object[]) ((mf) this).field_j[6])[0])[3])[7], -35);
                  break L1;
                }
              }
              if (null != ((mf) this).field_j[param1]) {
                stackOut_9_0 = 1;
                stackIn_10_0 = stackOut_9_0;
                return stackIn_10_0 != 0;
              } else {
                this.a(param1, (byte) -78);
                if (((mf) this).field_j[param1] != null) {
                  stackOut_14_0 = 1;
                  stackIn_15_0 = stackOut_14_0;
                  return stackIn_15_0 != 0;
                } else {
                  stackOut_16_0 = 0;
                  stackIn_17_0 = stackOut_16_0;
                  break L0;
                }
              }
            } else {
              stackOut_1_0 = 0;
              stackIn_2_0 = stackOut_1_0;
              return stackIn_2_0 != 0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3 = decompiledCaughtException;
          throw qb.a((Throwable) (Object) var3, "mf.M(" + param0 + ',' + param1 + ')');
        }
        return stackIn_17_0 != 0;
    }

    final boolean a(String param0, String param1, byte param2) {
        int var4_int = 0;
        RuntimeException var4 = null;
        int var5 = 0;
        int stackIn_4_0 = 0;
        int stackIn_9_0 = 0;
        int stackIn_14_0 = 0;
        int stackIn_19_0 = 0;
        RuntimeException stackIn_21_0 = null;
        StringBuilder stackIn_21_1 = null;
        RuntimeException stackIn_23_0 = null;
        StringBuilder stackIn_23_1 = null;
        RuntimeException stackIn_24_0 = null;
        StringBuilder stackIn_24_1 = null;
        String stackIn_24_2 = null;
        RuntimeException stackIn_25_0 = null;
        StringBuilder stackIn_25_1 = null;
        RuntimeException stackIn_27_0 = null;
        StringBuilder stackIn_27_1 = null;
        RuntimeException stackIn_28_0 = null;
        StringBuilder stackIn_28_1 = null;
        String stackIn_28_2 = null;
        RuntimeException decompiledCaughtException = null;
        int stackOut_3_0 = 0;
        int stackOut_8_0 = 0;
        int stackOut_13_0 = 0;
        int stackOut_18_0 = 0;
        RuntimeException stackOut_20_0 = null;
        StringBuilder stackOut_20_1 = null;
        RuntimeException stackOut_23_0 = null;
        StringBuilder stackOut_23_1 = null;
        String stackOut_23_2 = null;
        RuntimeException stackOut_21_0 = null;
        StringBuilder stackOut_21_1 = null;
        String stackOut_21_2 = null;
        RuntimeException stackOut_24_0 = null;
        StringBuilder stackOut_24_1 = null;
        RuntimeException stackOut_27_0 = null;
        StringBuilder stackOut_27_1 = null;
        String stackOut_27_2 = null;
        RuntimeException stackOut_25_0 = null;
        StringBuilder stackOut_25_1 = null;
        String stackOut_25_2 = null;
        try {
          L0: {
            if (!((mf) this).a((byte) -127)) {
              stackOut_3_0 = 0;
              stackIn_4_0 = stackOut_3_0;
              return stackIn_4_0 != 0;
            } else {
              param1 = param1.toLowerCase();
              param0 = param0.toLowerCase();
              var4_int = ((mf) this).field_k.field_n.a(ni.a(param2 ^ 4, (CharSequence) (Object) param1), (byte) -114);
              if (var4_int < 0) {
                stackOut_8_0 = 0;
                stackIn_9_0 = stackOut_8_0;
                return stackIn_9_0 != 0;
              } else {
                var5 = ((mf) this).field_k.field_i[var4_int].a(ni.a(-120, (CharSequence) (Object) param0), (byte) -105);
                if (0 > var5) {
                  stackOut_13_0 = 0;
                  stackIn_14_0 = stackOut_13_0;
                  return stackIn_14_0 != 0;
                } else {
                  L1: {
                    if (param2 == -121) {
                      break L1;
                    } else {
                      int discarded$2 = ((mf) this).b(-9);
                      break L1;
                    }
                  }
                  stackOut_18_0 = 1;
                  stackIn_19_0 = stackOut_18_0;
                  break L0;
                }
              }
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L2: {
            var4 = decompiledCaughtException;
            stackOut_20_0 = (RuntimeException) var4;
            stackOut_20_1 = new StringBuilder().append("mf.A(");
            stackIn_23_0 = stackOut_20_0;
            stackIn_23_1 = stackOut_20_1;
            stackIn_21_0 = stackOut_20_0;
            stackIn_21_1 = stackOut_20_1;
            if (param0 == null) {
              stackOut_23_0 = (RuntimeException) (Object) stackIn_23_0;
              stackOut_23_1 = (StringBuilder) (Object) stackIn_23_1;
              stackOut_23_2 = "null";
              stackIn_24_0 = stackOut_23_0;
              stackIn_24_1 = stackOut_23_1;
              stackIn_24_2 = stackOut_23_2;
              break L2;
            } else {
              stackOut_21_0 = (RuntimeException) (Object) stackIn_21_0;
              stackOut_21_1 = (StringBuilder) (Object) stackIn_21_1;
              stackOut_21_2 = "{...}";
              stackIn_24_0 = stackOut_21_0;
              stackIn_24_1 = stackOut_21_1;
              stackIn_24_2 = stackOut_21_2;
              break L2;
            }
          }
          L3: {
            stackOut_24_0 = (RuntimeException) (Object) stackIn_24_0;
            stackOut_24_1 = ((StringBuilder) (Object) stackIn_24_1).append(stackIn_24_2).append(',');
            stackIn_27_0 = stackOut_24_0;
            stackIn_27_1 = stackOut_24_1;
            stackIn_25_0 = stackOut_24_0;
            stackIn_25_1 = stackOut_24_1;
            if (param1 == null) {
              stackOut_27_0 = (RuntimeException) (Object) stackIn_27_0;
              stackOut_27_1 = (StringBuilder) (Object) stackIn_27_1;
              stackOut_27_2 = "null";
              stackIn_28_0 = stackOut_27_0;
              stackIn_28_1 = stackOut_27_1;
              stackIn_28_2 = stackOut_27_2;
              break L3;
            } else {
              stackOut_25_0 = (RuntimeException) (Object) stackIn_25_0;
              stackOut_25_1 = (StringBuilder) (Object) stackIn_25_1;
              stackOut_25_2 = "{...}";
              stackIn_28_0 = stackOut_25_0;
              stackIn_28_1 = stackOut_25_1;
              stackIn_28_2 = stackOut_25_2;
              break L3;
            }
          }
          throw qb.a((Throwable) (Object) stackIn_28_0, stackIn_28_2 + ',' + param2 + ')');
        }
        return stackIn_19_0 != 0;
    }

    mf(bc param0, boolean param1, int param2) {
        RuntimeException runtimeException = null;
        RuntimeException stackIn_8_0 = null;
        StringBuilder stackIn_8_1 = null;
        RuntimeException stackIn_10_0 = null;
        StringBuilder stackIn_10_1 = null;
        RuntimeException stackIn_11_0 = null;
        StringBuilder stackIn_11_1 = null;
        String stackIn_11_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException stackOut_7_0 = null;
        StringBuilder stackOut_7_1 = null;
        RuntimeException stackOut_10_0 = null;
        StringBuilder stackOut_10_1 = null;
        String stackOut_10_2 = null;
        RuntimeException stackOut_8_0 = null;
        StringBuilder stackOut_8_1 = null;
        String stackOut_8_2 = null;
        ((mf) this).field_k = null;
        try {
          L0: {
            L1: {
              if (param2 < 0) {
                break L1;
              } else {
                if (param2 <= 2) {
                  ((mf) this).field_g = param0;
                  ((mf) this).field_b = param1;
                  ((mf) this).field_l = param2;
                  break L0;
                } else {
                  break L1;
                }
              }
            }
            throw new IllegalArgumentException("");
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L2: {
            runtimeException = decompiledCaughtException;
            stackOut_7_0 = (RuntimeException) runtimeException;
            stackOut_7_1 = new StringBuilder().append("mf.<init>(");
            stackIn_10_0 = stackOut_7_0;
            stackIn_10_1 = stackOut_7_1;
            stackIn_8_0 = stackOut_7_0;
            stackIn_8_1 = stackOut_7_1;
            if (param0 == null) {
              stackOut_10_0 = (RuntimeException) (Object) stackIn_10_0;
              stackOut_10_1 = (StringBuilder) (Object) stackIn_10_1;
              stackOut_10_2 = "null";
              stackIn_11_0 = stackOut_10_0;
              stackIn_11_1 = stackOut_10_1;
              stackIn_11_2 = stackOut_10_2;
              break L2;
            } else {
              stackOut_8_0 = (RuntimeException) (Object) stackIn_8_0;
              stackOut_8_1 = (StringBuilder) (Object) stackIn_8_1;
              stackOut_8_2 = "{...}";
              stackIn_11_0 = stackOut_8_0;
              stackIn_11_1 = stackOut_8_1;
              stackIn_11_2 = stackOut_8_2;
              break L2;
            }
          }
          throw qb.a((Throwable) (Object) stackIn_11_0, stackIn_11_2 + ',' + param1 + ',' + param2 + ')');
        }
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_i = new vl();
        field_e = "Type your email address again to make sure it's correct";
    }
}
