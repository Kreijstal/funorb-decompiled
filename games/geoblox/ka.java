/*
 * Decompiled by CFR-JS 0.4.0.
 */
abstract class ka {
    static dm[][][] field_m;
    int field_k;
    int field_e;
    static float field_c;
    int field_d;
    static d field_i;
    static int field_h;
    int field_b;
    private int field_f;
    boolean field_g;
    boolean field_l;
    static long field_a;
    private int field_j;

    final static na[] a(String param0, String param1, boolean param2, rh param3) {
        int var4_int = 0;
        RuntimeException var4 = null;
        int var5 = 0;
        na[] stackIn_3_0 = null;
        RuntimeException stackIn_5_0 = null;
        StringBuilder stackIn_5_1 = null;
        RuntimeException stackIn_6_0 = null;
        StringBuilder stackIn_6_1 = null;
        RuntimeException stackIn_7_0 = null;
        StringBuilder stackIn_7_1 = null;
        String stackIn_7_2 = null;
        RuntimeException stackIn_8_0 = null;
        StringBuilder stackIn_8_1 = null;
        RuntimeException stackIn_9_0 = null;
        StringBuilder stackIn_9_1 = null;
        RuntimeException stackIn_10_0 = null;
        StringBuilder stackIn_10_1 = null;
        String stackIn_10_2 = null;
        RuntimeException stackIn_11_0 = null;
        StringBuilder stackIn_11_1 = null;
        RuntimeException stackIn_12_0 = null;
        StringBuilder stackIn_12_1 = null;
        RuntimeException stackIn_13_0 = null;
        StringBuilder stackIn_13_1 = null;
        String stackIn_13_2 = null;
        RuntimeException decompiledCaughtException = null;
        na[] stackOut_2_0 = null;
        RuntimeException stackOut_4_0 = null;
        StringBuilder stackOut_4_1 = null;
        RuntimeException stackOut_6_0 = null;
        StringBuilder stackOut_6_1 = null;
        String stackOut_6_2 = null;
        RuntimeException stackOut_5_0 = null;
        StringBuilder stackOut_5_1 = null;
        String stackOut_5_2 = null;
        RuntimeException stackOut_7_0 = null;
        StringBuilder stackOut_7_1 = null;
        RuntimeException stackOut_9_0 = null;
        StringBuilder stackOut_9_1 = null;
        String stackOut_9_2 = null;
        RuntimeException stackOut_8_0 = null;
        StringBuilder stackOut_8_1 = null;
        String stackOut_8_2 = null;
        RuntimeException stackOut_10_0 = null;
        StringBuilder stackOut_10_1 = null;
        RuntimeException stackOut_12_0 = null;
        StringBuilder stackOut_12_1 = null;
        String stackOut_12_2 = null;
        RuntimeException stackOut_11_0 = null;
        StringBuilder stackOut_11_1 = null;
        String stackOut_11_2 = null;
        try {
          L0: {
            var4_int = param3.a((byte) 126, param0);
            var5 = param3.a(param1, -89, var4_int);
            stackOut_2_0 = sd.a(true, param3, var5, var4_int);
            stackIn_3_0 = stackOut_2_0;
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L1: {
            var4 = decompiledCaughtException;
            stackOut_4_0 = (RuntimeException) var4;
            stackOut_4_1 = new StringBuilder().append("ka.W(");
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
          L2: {
            stackOut_7_0 = (RuntimeException) (Object) stackIn_7_0;
            stackOut_7_1 = ((StringBuilder) (Object) stackIn_7_1).append(stackIn_7_2).append(',');
            stackIn_9_0 = stackOut_7_0;
            stackIn_9_1 = stackOut_7_1;
            stackIn_8_0 = stackOut_7_0;
            stackIn_8_1 = stackOut_7_1;
            if (param1 == null) {
              stackOut_9_0 = (RuntimeException) (Object) stackIn_9_0;
              stackOut_9_1 = (StringBuilder) (Object) stackIn_9_1;
              stackOut_9_2 = "null";
              stackIn_10_0 = stackOut_9_0;
              stackIn_10_1 = stackOut_9_1;
              stackIn_10_2 = stackOut_9_2;
              break L2;
            } else {
              stackOut_8_0 = (RuntimeException) (Object) stackIn_8_0;
              stackOut_8_1 = (StringBuilder) (Object) stackIn_8_1;
              stackOut_8_2 = "{...}";
              stackIn_10_0 = stackOut_8_0;
              stackIn_10_1 = stackOut_8_1;
              stackIn_10_2 = stackOut_8_2;
              break L2;
            }
          }
          L3: {
            stackOut_10_0 = (RuntimeException) (Object) stackIn_10_0;
            stackOut_10_1 = ((StringBuilder) (Object) stackIn_10_1).append(stackIn_10_2).append(',').append(true).append(',');
            stackIn_12_0 = stackOut_10_0;
            stackIn_12_1 = stackOut_10_1;
            stackIn_11_0 = stackOut_10_0;
            stackIn_11_1 = stackOut_10_1;
            if (param3 == null) {
              stackOut_12_0 = (RuntimeException) (Object) stackIn_12_0;
              stackOut_12_1 = (StringBuilder) (Object) stackIn_12_1;
              stackOut_12_2 = "null";
              stackIn_13_0 = stackOut_12_0;
              stackIn_13_1 = stackOut_12_1;
              stackIn_13_2 = stackOut_12_2;
              break L3;
            } else {
              stackOut_11_0 = (RuntimeException) (Object) stackIn_11_0;
              stackOut_11_1 = (StringBuilder) (Object) stackIn_11_1;
              stackOut_11_2 = "{...}";
              stackIn_13_0 = stackOut_11_0;
              stackIn_13_1 = stackOut_11_1;
              stackIn_13_2 = stackOut_11_2;
              break L3;
            }
          }
          throw t.a((Throwable) (Object) stackIn_13_0, stackIn_13_2 + ')');
        }
        return stackIn_3_0;
    }

    abstract void a(byte param0, int param1);

    void a(int param0, int param1) {
        int var4 = 0;
        L0: {
          var4 = Geoblox.field_C;
          if (param1 < -26) {
            break L0;
          } else {
            ((ka) this).field_j = 8;
            break L0;
          }
        }
        L1: {
          if (ki.field_d != 96) {
            if (ki.field_d == 97) {
              ((ka) this).a((byte) 90, param0);
              break L1;
            } else {
              L2: {
                if (ki.field_d == 84) {
                  break L2;
                } else {
                  if (ki.field_d != 83) {
                    break L1;
                  } else {
                    break L2;
                  }
                }
              }
              ((ka) this).b(param0, (byte) -2);
              break L1;
            }
          } else {
            ((ka) this).a(param0, (byte) -7);
            break L1;
          }
        }
    }

    void a(int param0, int param1, boolean param2, int param3, boolean param4, int param5) {
        int var8 = Geoblox.field_C;
        if (!param4) {
            if (1 != param5) {
                ((ka) this).a(param0, (byte) -121);
            } else {
                ((ka) this).b(param0, (byte) -2);
            }
            s.field_H = lj.field_a;
        } else {
            s.field_H = s.field_H - 1;
            if (s.field_H <= 0) {
                if (param5 == 1) {
                    ((ka) this).b(param0, (byte) -2);
                } else {
                    ((ka) this).a(param0, (byte) 6);
                }
                s.field_H = fj.field_o;
            }
        }
        if (param2) {
            ((ka) this).field_l = false;
        }
    }

    abstract void a(boolean param0, byte param1, int param2, int param3);

    public static void a() {
        int var1 = 15;
        field_m = null;
        field_i = null;
    }

    int a(int param0, int param1, byte param2) {
        int var4 = 0;
        L0: {
          if (((ka) this).field_j > param0) {
            break L0;
          } else {
            if (param0 >= ((ka) this).field_f) {
              break L0;
            } else {
              if (((ka) this).field_k > param1) {
                break L0;
              } else {
                if (param2 >= 20) {
                  var4 = (param1 + -((ka) this).field_k) / ((ka) this).field_d;
                  if (((ka) this).field_e > var4) {
                    return var4;
                  } else {
                    return -1;
                  }
                } else {
                  return 81;
                }
              }
            }
          }
        }
        return -1;
    }

    abstract void b(int param0, byte param1);

    final void a(boolean param0) {
        int var2 = 0;
        int var3 = 0;
        Object stackIn_15_0 = null;
        int stackIn_15_1 = 0;
        int stackIn_15_2 = 0;
        Object stackIn_16_0 = null;
        int stackIn_16_1 = 0;
        int stackIn_16_2 = 0;
        Object stackIn_17_0 = null;
        int stackIn_17_1 = 0;
        int stackIn_17_2 = 0;
        int stackIn_17_3 = 0;
        Object stackOut_14_0 = null;
        int stackOut_14_1 = 0;
        int stackOut_14_2 = 0;
        Object stackOut_16_0 = null;
        int stackOut_16_1 = 0;
        int stackOut_16_2 = 0;
        int stackOut_16_3 = 0;
        Object stackOut_15_0 = null;
        int stackOut_15_1 = 0;
        int stackOut_15_2 = 0;
        int stackOut_15_3 = 0;
        L0: {
          var3 = Geoblox.field_C;
          if (bi.field_g != 0) {
            var2 = ((ka) this).a(mc.field_a, he.field_d, (byte) 28);
            ((ka) this).field_b = var2;
            if (var2 != -1) {
              L1: {
                ((ka) this).field_g = true;
                stackOut_14_0 = this;
                stackOut_14_1 = var2;
                stackOut_14_2 = mc.field_a;
                stackIn_16_0 = stackOut_14_0;
                stackIn_16_1 = stackOut_14_1;
                stackIn_16_2 = stackOut_14_2;
                stackIn_15_0 = stackOut_14_0;
                stackIn_15_1 = stackOut_14_1;
                stackIn_15_2 = stackOut_14_2;
                if (param0) {
                  stackOut_16_0 = this;
                  stackOut_16_1 = stackIn_16_1;
                  stackOut_16_2 = stackIn_16_2;
                  stackOut_16_3 = 0;
                  stackIn_17_0 = stackOut_16_0;
                  stackIn_17_1 = stackOut_16_1;
                  stackIn_17_2 = stackOut_16_2;
                  stackIn_17_3 = stackOut_16_3;
                  break L1;
                } else {
                  stackOut_15_0 = this;
                  stackOut_15_1 = stackIn_15_1;
                  stackOut_15_2 = stackIn_15_2;
                  stackOut_15_3 = 1;
                  stackIn_17_0 = stackOut_15_0;
                  stackIn_17_1 = stackOut_15_1;
                  stackIn_17_2 = stackOut_15_2;
                  stackIn_17_3 = stackOut_15_3;
                  break L1;
                }
              }
              ((ka) this).a(stackIn_17_1, stackIn_17_2, stackIn_17_3 != 0, -(var2 * ((ka) this).field_d) + -((ka) this).field_k + he.field_d, false, bi.field_g);
              break L0;
            } else {
              ((ka) this).field_g = false;
              break L0;
            }
          } else {
            L2: {
              if (gf.field_a == 0) {
                break L2;
              } else {
                if (!((ka) this).field_g) {
                  break L2;
                } else {
                  var2 = ((ka) this).field_b;
                  if (var2 != -1) {
                    ((ka) this).a(var2, qa.field_a, false, -(((ka) this).field_d * var2) + (ue.field_e - ((ka) this).field_k), true, gf.field_a);
                    break L0;
                  } else {
                    break L0;
                  }
                }
              }
            }
            ((ka) this).field_g = false;
            if (!wb.field_a) {
              break L0;
            } else {
              var2 = ((ka) this).a(qa.field_a, ue.field_e, (byte) 126);
              if (var2 != -1) {
                ((ka) this).field_b = var2;
                ((ka) this).field_l = false;
                break L0;
              } else {
                if (((ka) this).field_l) {
                  break L0;
                } else {
                  ((ka) this).field_b = var2;
                  ((ka) this).field_l = false;
                  break L0;
                }
              }
            }
          }
        }
        L3: {
          if (param0) {
            break L3;
          } else {
            ((ka) this).field_j = 56;
            break L3;
          }
        }
    }

    ka(int param0, int param1, int param2, int param3, int param4) {
        ((ka) this).field_l = true;
        ((ka) this).field_b = 0;
        ((ka) this).field_j = param1;
        ((ka) this).field_d = param4;
        ((ka) this).field_f = param2;
        ((ka) this).field_e = param0;
        ((ka) this).field_k = param3;
    }

    abstract void a(int param0, byte param1);

    void a(int param0) {
        int var4 = Geoblox.field_C;
        int var2 = 0;
        if (param0 != -28750) {
            ((ka) this).a(false);
        }
        int var3 = ((ka) this).field_k;
        while (var2 < ((ka) this).field_e) {
            ((ka) this).a(((ka) this).field_b == var2 ? true : false, (byte) -112, var2, var3);
            var3 = var3 + ((ka) this).field_d;
            var2++;
        }
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_m = new dm[7][7][4];
        field_h = 0;
        field_a = 0L;
    }
}
