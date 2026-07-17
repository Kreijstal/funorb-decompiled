/*
 * Decompiled by CFR-JS 0.4.0.
 */
abstract class sq {
    static int[] field_a;
    static int field_b;
    al field_d;
    static no field_c;

    abstract int a(boolean param0);

    int e(int param0) {
        if (param0 <= 64) {
            ((sq) this).field_d = null;
        }
        return ((sq) this).field_d.field_n;
    }

    final static boolean k(int param0) {
        if (param0 != 0) {
            Object var2 = null;
            sq.a((String[]) null, false, -52, (String) null);
        }
        return ie.a((byte) 28, hk.d(71));
    }

    void a(qe param0, boolean param1) {
        RuntimeException runtimeException = null;
        qe stackIn_1_0 = null;
        qe stackIn_2_0 = null;
        qe stackIn_3_0 = null;
        qe stackIn_4_0 = null;
        int stackIn_4_1 = 0;
        RuntimeException stackIn_9_0 = null;
        StringBuilder stackIn_9_1 = null;
        RuntimeException stackIn_10_0 = null;
        StringBuilder stackIn_10_1 = null;
        RuntimeException stackIn_11_0 = null;
        StringBuilder stackIn_11_1 = null;
        String stackIn_11_2 = null;
        RuntimeException decompiledCaughtException = null;
        qe stackOut_0_0 = null;
        qe stackOut_1_0 = null;
        qe stackOut_2_0 = null;
        int stackOut_2_1 = 0;
        qe stackOut_3_0 = null;
        int stackOut_3_1 = 0;
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
            L1: {
              L2: {
                param0.field_z = ((sq) this).a(-1);
                stackOut_0_0 = (qe) param0;
                stackIn_3_0 = stackOut_0_0;
                stackIn_1_0 = stackOut_0_0;
                if (0 != param0.field_u) {
                  break L2;
                } else {
                  stackOut_1_0 = (qe) (Object) stackIn_1_0;
                  stackIn_3_0 = stackOut_1_0;
                  stackIn_2_0 = stackOut_1_0;
                  if (!((sq) this).a(param0.field_L, -35)) {
                    break L2;
                  } else {
                    stackOut_2_0 = (qe) (Object) stackIn_2_0;
                    stackOut_2_1 = 1;
                    stackIn_4_0 = stackOut_2_0;
                    stackIn_4_1 = stackOut_2_1;
                    break L1;
                  }
                }
              }
              stackOut_3_0 = (qe) (Object) stackIn_3_0;
              stackOut_3_1 = 0;
              stackIn_4_0 = stackOut_3_0;
              stackIn_4_1 = stackOut_3_1;
              break L1;
            }
            L3: {
              stackIn_4_0.field_E = stackIn_4_1 != 0;
              if (!param1) {
                break L3;
              } else {
                ((sq) this).field_d = null;
                break L3;
              }
            }
            param0.field_I = ((sq) this).j(0);
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L4: {
            runtimeException = decompiledCaughtException;
            stackOut_8_0 = (RuntimeException) runtimeException;
            stackOut_8_1 = new StringBuilder().append("sq.K(");
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
              break L4;
            } else {
              stackOut_9_0 = (RuntimeException) (Object) stackIn_9_0;
              stackOut_9_1 = (StringBuilder) (Object) stackIn_9_1;
              stackOut_9_2 = "{...}";
              stackIn_11_0 = stackOut_9_0;
              stackIn_11_1 = stackOut_9_1;
              stackIn_11_2 = stackOut_9_2;
              break L4;
            }
          }
          throw wm.a((Throwable) (Object) stackIn_11_0, stackIn_11_2 + 44 + param1 + 41);
        }
    }

    abstract int a(int param0);

    abstract int[] a(int param0, byte param1);

    abstract boolean a(int param0, byte param1, qe param2);

    abstract int i(int param0);

    abstract int b(int param0);

    void n(int param0) {
        if (param0 != 11828) {
            ((sq) this).field_d = null;
        }
    }

    abstract int h(int param0);

    final void l(int param0) {
        qe var2 = ((sq) this).field_d.j(45);
        var2.field_u = ((sq) this).b(-120);
        int var3 = -67 % ((param0 - -14) / 58);
        if (!(0 > var2.field_L)) {
            ((sq) this).a(var2, false);
        }
    }

    abstract boolean c(qe param0, int param1);

    int c(int param0, int param1) {
        if (param0 >= -36) {
            boolean discarded$0 = sq.k(73);
        }
        return param1;
    }

    abstract boolean f(int param0);

    abstract byte b(int param0, int param1);

    public static void d(int param0) {
        field_a = null;
        field_c = null;
    }

    abstract dd b(qe param0, int param1);

    int m(int param0) {
        if (param0 != 0) {
            field_a = null;
            return 0;
        }
        return 0;
    }

    final static void b(byte param0) {
        al.field_B = new tm[7];
        al.field_B[0] = (tm) (Object) new mf();
        al.field_B[1] = (tm) (Object) new vl();
        al.field_B[2] = (tm) (Object) new jr();
        al.field_B[3] = (tm) (Object) new to();
        al.field_B[4] = (tm) (Object) new lm();
        al.field_B[5] = (tm) (Object) new ac();
        al.field_B[6] = (tm) (Object) new ul();
    }

    int a(qe param0, byte param1) {
        int var3_int = 0;
        RuntimeException var3 = null;
        int var4 = 0;
        int stackIn_9_0 = 0;
        RuntimeException stackIn_11_0 = null;
        StringBuilder stackIn_11_1 = null;
        RuntimeException stackIn_12_0 = null;
        StringBuilder stackIn_12_1 = null;
        RuntimeException stackIn_13_0 = null;
        StringBuilder stackIn_13_1 = null;
        String stackIn_13_2 = null;
        RuntimeException decompiledCaughtException = null;
        int stackOut_8_0 = 0;
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
            var3_int = (1 + param0.field_L) % ((sq) this).field_d.field_n;
            var4 = 1;
            L1: while (true) {
              L2: {
                if (var4 > ((sq) this).field_d.field_n) {
                  break L2;
                } else {
                  L3: {
                    var3_int = (var4 + param0.field_L) % ((sq) this).field_d.field_n;
                    if (!((sq) this).a((byte) -112, var3_int)) {
                      break L3;
                    } else {
                      if ((((sq) this).field_d.field_p & 1 << var3_int) == 0) {
                        break L2;
                      } else {
                        break L3;
                      }
                    }
                  }
                  var4++;
                  continue L1;
                }
              }
              L4: {
                if (param1 >= 82) {
                  break L4;
                } else {
                  field_b = 82;
                  break L4;
                }
              }
              stackOut_8_0 = var3_int;
              stackIn_9_0 = stackOut_8_0;
              break L0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L5: {
            var3 = decompiledCaughtException;
            stackOut_10_0 = (RuntimeException) var3;
            stackOut_10_1 = new StringBuilder().append("sq.I(");
            stackIn_12_0 = stackOut_10_0;
            stackIn_12_1 = stackOut_10_1;
            stackIn_11_0 = stackOut_10_0;
            stackIn_11_1 = stackOut_10_1;
            if (param0 == null) {
              stackOut_12_0 = (RuntimeException) (Object) stackIn_12_0;
              stackOut_12_1 = (StringBuilder) (Object) stackIn_12_1;
              stackOut_12_2 = "null";
              stackIn_13_0 = stackOut_12_0;
              stackIn_13_1 = stackOut_12_1;
              stackIn_13_2 = stackOut_12_2;
              break L5;
            } else {
              stackOut_11_0 = (RuntimeException) (Object) stackIn_11_0;
              stackOut_11_1 = (StringBuilder) (Object) stackIn_11_1;
              stackOut_11_2 = "{...}";
              stackIn_13_0 = stackOut_11_0;
              stackIn_13_1 = stackOut_11_1;
              stackIn_13_2 = stackOut_11_2;
              break L5;
            }
          }
          throw wm.a((Throwable) (Object) stackIn_13_0, stackIn_13_2 + 44 + param1 + 41);
        }
        return stackIn_9_0;
    }

    abstract boolean a(int param0, int param1);

    final static int g(int param0) {
        return or.field_b;
    }

    final static void a(String[] args, boolean param1, int param2, String param3) {
        RuntimeException var4 = null;
        String[] var4_array = null;
        Object var5 = null;
        int stackIn_4_0 = 0;
        RuntimeException stackIn_12_0 = null;
        StringBuilder stackIn_12_1 = null;
        RuntimeException stackIn_13_0 = null;
        StringBuilder stackIn_13_1 = null;
        RuntimeException stackIn_14_0 = null;
        StringBuilder stackIn_14_1 = null;
        String stackIn_14_2 = null;
        RuntimeException stackIn_15_0 = null;
        StringBuilder stackIn_15_1 = null;
        RuntimeException stackIn_16_0 = null;
        StringBuilder stackIn_16_1 = null;
        RuntimeException stackIn_17_0 = null;
        StringBuilder stackIn_17_1 = null;
        String stackIn_17_2 = null;
        RuntimeException decompiledCaughtException = null;
        int stackOut_3_0 = 0;
        int stackOut_2_0 = 0;
        RuntimeException stackOut_11_0 = null;
        StringBuilder stackOut_11_1 = null;
        RuntimeException stackOut_13_0 = null;
        StringBuilder stackOut_13_1 = null;
        String stackOut_13_2 = null;
        RuntimeException stackOut_12_0 = null;
        StringBuilder stackOut_12_1 = null;
        String stackOut_12_2 = null;
        RuntimeException stackOut_14_0 = null;
        StringBuilder stackOut_14_1 = null;
        RuntimeException stackOut_16_0 = null;
        StringBuilder stackOut_16_1 = null;
        String stackOut_16_2 = null;
        RuntimeException stackOut_15_0 = null;
        StringBuilder stackOut_15_1 = null;
        String stackOut_15_2 = null;
        try {
          L0: {
            L1: {
              pa.field_I = td.field_f;
              if (param2 != 255) {
                L2: {
                  if (param2 < 100) {
                    break L2;
                  } else {
                    if (param2 <= 105) {
                      var4_array = args;
                      gf.a(92, var4_array);
                      int discarded$19 = 57;
                      uf.field_gb = jo.a(args);
                      break L1;
                    } else {
                      break L2;
                    }
                  }
                }
                uf.field_gb = gg.a(param2, true, param3);
                break L1;
              } else {
                L3: {
                  if (j.field_b >= 13) {
                    stackOut_3_0 = 0;
                    stackIn_4_0 = stackOut_3_0;
                    break L3;
                  } else {
                    stackOut_2_0 = 1;
                    stackIn_4_0 = stackOut_2_0;
                    break L3;
                  }
                }
                int discarded$20 = -30914;
                uf.field_gb = ta.a(stackIn_4_0 != 0);
                var5 = null;
                gf.a(108, (String[]) null);
                break L1;
              }
            }
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L4: {
            var4 = decompiledCaughtException;
            stackOut_11_0 = (RuntimeException) var4;
            stackOut_11_1 = new StringBuilder().append("sq.S(");
            stackIn_13_0 = stackOut_11_0;
            stackIn_13_1 = stackOut_11_1;
            stackIn_12_0 = stackOut_11_0;
            stackIn_12_1 = stackOut_11_1;
            if (args == null) {
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
          L5: {
            stackOut_14_0 = (RuntimeException) (Object) stackIn_14_0;
            stackOut_14_1 = ((StringBuilder) (Object) stackIn_14_1).append(stackIn_14_2).append(44).append(0).append(44).append(param2).append(44);
            stackIn_16_0 = stackOut_14_0;
            stackIn_16_1 = stackOut_14_1;
            stackIn_15_0 = stackOut_14_0;
            stackIn_15_1 = stackOut_14_1;
            if (param3 == null) {
              stackOut_16_0 = (RuntimeException) (Object) stackIn_16_0;
              stackOut_16_1 = (StringBuilder) (Object) stackIn_16_1;
              stackOut_16_2 = "null";
              stackIn_17_0 = stackOut_16_0;
              stackIn_17_1 = stackOut_16_1;
              stackIn_17_2 = stackOut_16_2;
              break L5;
            } else {
              stackOut_15_0 = (RuntimeException) (Object) stackIn_15_0;
              stackOut_15_1 = (StringBuilder) (Object) stackIn_15_1;
              stackOut_15_2 = "{...}";
              stackIn_17_0 = stackOut_15_0;
              stackIn_17_1 = stackOut_15_1;
              stackIn_17_2 = stackOut_15_2;
              break L5;
            }
          }
          throw wm.a((Throwable) (Object) stackIn_17_0, stackIn_17_2 + 41);
        }
    }

    abstract void c(int param0);

    sq(al param0) {
        try {
            ((sq) this).field_d = param0;
        } catch (RuntimeException runtimeException) {
            throw wm.a((Throwable) (Object) runtimeException, "sq.<init>(" + (param0 != null ? "{...}" : "null") + 41);
        }
    }

    boolean a(byte param0, int param1) {
        int var3 = 35 % ((-16 - param0) / 46);
        return true;
    }

    void a(ge param0, boolean param1) {
        RuntimeException runtimeException = null;
        RuntimeException stackIn_4_0 = null;
        StringBuilder stackIn_4_1 = null;
        RuntimeException stackIn_5_0 = null;
        StringBuilder stackIn_5_1 = null;
        RuntimeException stackIn_6_0 = null;
        StringBuilder stackIn_6_1 = null;
        String stackIn_6_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException stackOut_3_0 = null;
        StringBuilder stackOut_3_1 = null;
        RuntimeException stackOut_5_0 = null;
        StringBuilder stackOut_5_1 = null;
        String stackOut_5_2 = null;
        RuntimeException stackOut_4_0 = null;
        StringBuilder stackOut_4_1 = null;
        String stackOut_4_2 = null;
        try {
          L0: {
            L1: {
              if (param1) {
                break L1;
              } else {
                int discarded$2 = ((sq) this).a(-101);
                break L1;
              }
            }
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L2: {
            runtimeException = decompiledCaughtException;
            stackOut_3_0 = (RuntimeException) runtimeException;
            stackOut_3_1 = new StringBuilder().append("sq.M(");
            stackIn_5_0 = stackOut_3_0;
            stackIn_5_1 = stackOut_3_1;
            stackIn_4_0 = stackOut_3_0;
            stackIn_4_1 = stackOut_3_1;
            if (param0 == null) {
              stackOut_5_0 = (RuntimeException) (Object) stackIn_5_0;
              stackOut_5_1 = (StringBuilder) (Object) stackIn_5_1;
              stackOut_5_2 = "null";
              stackIn_6_0 = stackOut_5_0;
              stackIn_6_1 = stackOut_5_1;
              stackIn_6_2 = stackOut_5_2;
              break L2;
            } else {
              stackOut_4_0 = (RuntimeException) (Object) stackIn_4_0;
              stackOut_4_1 = (StringBuilder) (Object) stackIn_4_1;
              stackOut_4_2 = "{...}";
              stackIn_6_0 = stackOut_4_0;
              stackIn_6_1 = stackOut_4_1;
              stackIn_6_2 = stackOut_4_2;
              break L2;
            }
          }
          throw wm.a((Throwable) (Object) stackIn_6_0, stackIn_6_2 + 44 + param1 + 41);
        }
    }

    String a(int param0, String[] param1) {
        int var3_int = 0;
        RuntimeException var3 = null;
        int var4_int = 0;
        StringBuilder var4 = null;
        int var5 = 0;
        int var6 = 0;
        String stackIn_6_0 = null;
        String stackIn_19_0 = null;
        RuntimeException stackIn_21_0 = null;
        StringBuilder stackIn_21_1 = null;
        RuntimeException stackIn_22_0 = null;
        StringBuilder stackIn_22_1 = null;
        RuntimeException stackIn_23_0 = null;
        StringBuilder stackIn_23_1 = null;
        String stackIn_23_2 = null;
        RuntimeException decompiledCaughtException = null;
        String stackOut_18_0 = null;
        String stackOut_5_0 = null;
        RuntimeException stackOut_20_0 = null;
        StringBuilder stackOut_20_1 = null;
        RuntimeException stackOut_22_0 = null;
        StringBuilder stackOut_22_1 = null;
        String stackOut_22_2 = null;
        RuntimeException stackOut_21_0 = null;
        StringBuilder stackOut_21_1 = null;
        String stackOut_21_2 = null;
        var6 = Pool.field_O;
        try {
          L0: {
            if (param0 < ((sq) this).field_d.field_n) {
              if (((sq) this).field_d.field_n != 2) {
                var3_int = 0;
                var4_int = 0;
                L1: while (true) {
                  if (param1.length <= var4_int) {
                    var4 = new StringBuilder(var3_int);
                    var5 = 0;
                    L2: while (true) {
                      if (param1.length <= var5) {
                        stackOut_18_0 = var4.toString();
                        stackIn_19_0 = stackOut_18_0;
                        break L0;
                      } else {
                        L3: {
                          if (var5 > 0) {
                            StringBuilder discarded$4 = var4.append("<br>");
                            break L3;
                          } else {
                            break L3;
                          }
                        }
                        StringBuilder discarded$5 = var4.append(param1[var5]);
                        var5++;
                        continue L2;
                      }
                    }
                  } else {
                    L4: {
                      if (var4_int <= 0) {
                        break L4;
                      } else {
                        var3_int += 4;
                        break L4;
                      }
                    }
                    var3_int = var3_int + param1[var4_int].length();
                    var4_int++;
                    continue L1;
                  }
                }
              } else {
                stackOut_5_0 = nr.a(param1, param0 ^ -2, w.field_g);
                stackIn_6_0 = stackOut_5_0;
                return stackIn_6_0;
              }
            } else {
              return null;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L5: {
            var3 = decompiledCaughtException;
            stackOut_20_0 = (RuntimeException) var3;
            stackOut_20_1 = new StringBuilder().append("sq.P(").append(param0).append(44);
            stackIn_22_0 = stackOut_20_0;
            stackIn_22_1 = stackOut_20_1;
            stackIn_21_0 = stackOut_20_0;
            stackIn_21_1 = stackOut_20_1;
            if (param1 == null) {
              stackOut_22_0 = (RuntimeException) (Object) stackIn_22_0;
              stackOut_22_1 = (StringBuilder) (Object) stackIn_22_1;
              stackOut_22_2 = "null";
              stackIn_23_0 = stackOut_22_0;
              stackIn_23_1 = stackOut_22_1;
              stackIn_23_2 = stackOut_22_2;
              break L5;
            } else {
              stackOut_21_0 = (RuntimeException) (Object) stackIn_21_0;
              stackOut_21_1 = (StringBuilder) (Object) stackIn_21_1;
              stackOut_21_2 = "{...}";
              stackIn_23_0 = stackOut_21_0;
              stackIn_23_1 = stackOut_21_1;
              stackIn_23_2 = stackOut_21_2;
              break L5;
            }
          }
          throw wm.a((Throwable) (Object) stackIn_23_0, stackIn_23_2 + 41);
        }
        return stackIn_19_0;
    }

    abstract int a(byte param0);

    int b(byte param0, int param1) {
        if (param0 >= -113) {
            field_a = null;
        }
        return 1 << param1;
    }

    int j(int param0) {
        if (param0 != 0) {
            return 82;
        }
        return -1;
    }

    void a(int param0, int param1, int param2) {
        if (param1 != -1) {
            int discarded$0 = ((sq) this).j(100);
        }
    }

    abstract boolean a(int param0, byte param1, int param2);

    abstract int a(qe param0, int param1);

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_a = new int[4];
    }
}
