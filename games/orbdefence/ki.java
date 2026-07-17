/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class ki {
    private int field_b;
    private jl field_e;
    private boolean field_g;
    static int[] field_f;
    static String field_h;
    private Object[][] field_c;
    private Object[] field_a;
    private hd field_i;
    static String field_d;

    private final synchronized byte[] a(int param0, int[] param1, int param2, int param3) {
        Object var5 = null;
        byte[] var7 = null;
        Object stackIn_2_0 = null;
        Object stackIn_12_0 = null;
        Object stackIn_28_0 = null;
        Object stackIn_30_0 = null;
        StringBuilder stackIn_30_1 = null;
        Object stackIn_31_0 = null;
        StringBuilder stackIn_31_1 = null;
        Object stackIn_32_0 = null;
        StringBuilder stackIn_32_1 = null;
        String stackIn_32_2 = null;
        RuntimeException decompiledCaughtException = null;
        Object stackOut_11_0 = null;
        Object stackOut_27_0 = null;
        Object stackOut_1_0 = null;
        Object stackOut_29_0 = null;
        StringBuilder stackOut_29_1 = null;
        Object stackOut_31_0 = null;
        StringBuilder stackOut_31_1 = null;
        String stackOut_31_2 = null;
        Object stackOut_30_0 = null;
        StringBuilder stackOut_30_1 = null;
        String stackOut_30_2 = null;
        try {
          L0: {
            if (this.a(param2, true, param3)) {
              L1: {
                var5 = null;
                if (param0 == -2) {
                  break L1;
                } else {
                  ((ki) this).field_i = (hd) ((Object[]) ((ki) this).field_a[18])[5];
                  break L1;
                }
              }
              L2: {
                L3: {
                  if (((ki) this).field_c[param2] == null) {
                    break L3;
                  } else {
                    if (null != ((ki) this).field_c[param2][param3]) {
                      break L2;
                    } else {
                      break L3;
                    }
                  }
                }
                if (!this.a(param1, -895, param2, param3)) {
                  this.a(param2, 114);
                  if (this.a(param1, -895, param2, param3)) {
                    break L2;
                  } else {
                    stackOut_11_0 = null;
                    stackIn_12_0 = stackOut_11_0;
                    return (byte[]) (Object) stackIn_12_0;
                  }
                } else {
                  break L2;
                }
              }
              if (null != ((ki) this).field_c[param2]) {
                L4: {
                  if (((ki) this).field_c[param2][param3] != null) {
                    var7 = e.a(((ki) this).field_c[param2][param3], false, 25966);
                    var5 = (Object) (Object) var7;
                    if (var7 != null) {
                      break L4;
                    } else {
                      throw new RuntimeException("");
                    }
                  } else {
                    break L4;
                  }
                }
                L5: {
                  if (var5 != null) {
                    L6: {
                      if (((ki) this).field_b == 1) {
                        break L6;
                      } else {
                        if (((ki) this).field_b == 2) {
                          ((ki) this).field_c[param2] = null;
                          if (!OrbDefence.field_D) {
                            break L5;
                          } else {
                            break L6;
                          }
                        } else {
                          break L5;
                        }
                      }
                    }
                    ((ki) this).field_c[param2][param3] = null;
                    if (((ki) this).field_i.field_l[param2] != 1) {
                      break L5;
                    } else {
                      ((ki) this).field_c[param2] = null;
                      break L5;
                    }
                  } else {
                    break L5;
                  }
                }
                stackOut_27_0 = var5;
                stackIn_28_0 = stackOut_27_0;
                break L0;
              } else {
                throw new RuntimeException("");
              }
            } else {
              stackOut_1_0 = null;
              stackIn_2_0 = stackOut_1_0;
              return (byte[]) (Object) stackIn_2_0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L7: {
            var5 = (Object) (Object) decompiledCaughtException;
            stackOut_29_0 = var5;
            stackOut_29_1 = new StringBuilder().append("ki.A(").append(param0).append(44);
            stackIn_31_0 = stackOut_29_0;
            stackIn_31_1 = stackOut_29_1;
            stackIn_30_0 = stackOut_29_0;
            stackIn_30_1 = stackOut_29_1;
            if (param1 == null) {
              stackOut_31_0 = stackIn_31_0;
              stackOut_31_1 = (StringBuilder) (Object) stackIn_31_1;
              stackOut_31_2 = "null";
              stackIn_32_0 = stackOut_31_0;
              stackIn_32_1 = stackOut_31_1;
              stackIn_32_2 = stackOut_31_2;
              break L7;
            } else {
              stackOut_30_0 = stackIn_30_0;
              stackOut_30_1 = (StringBuilder) (Object) stackIn_30_1;
              stackOut_30_2 = "{...}";
              stackIn_32_0 = stackOut_30_0;
              stackIn_32_1 = stackOut_30_1;
              stackIn_32_2 = stackOut_30_2;
              break L7;
            }
          }
          throw dd.a((Throwable) (Object) stackIn_32_0, stackIn_32_2 + 44 + param2 + 44 + param3 + 41);
        }
        return (byte[]) (Object) stackIn_28_0;
    }

    private final synchronized void a(int param0, int param1) {
        int var3 = 0;
        L0: {
          L1: {
            if (((ki) this).field_g) {
              break L1;
            } else {
              ((ki) this).field_a[param0] = fm.a(((ki) this).field_e.a(-15861, param0), 3, false);
              if (!OrbDefence.field_D) {
                break L0;
              } else {
                break L1;
              }
            }
          }
          ((ki) this).field_a[param0] = (Object) (Object) ((ki) this).field_e.a(-15861, param0);
          break L0;
        }
        var3 = -85 % ((param1 - 69) / 38);
    }

    final boolean a(String param0, String param1, int param2) {
        int var4_int = 0;
        RuntimeException var4 = null;
        int var5 = 0;
        CharSequence var6 = null;
        CharSequence var7 = null;
        int stackIn_2_0 = 0;
        int stackIn_6_0 = 0;
        boolean stackIn_10_0 = false;
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
        int stackOut_5_0 = 0;
        boolean stackOut_9_0 = false;
        int stackOut_1_0 = 0;
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
            if (((ki) this).b(param2)) {
              param0 = param0.toLowerCase();
              param1 = param1.toLowerCase();
              var6 = (CharSequence) (Object) param0;
              var4_int = ((ki) this).field_i.field_o.a(sk.a((byte) 76, var6), -76);
              if (!this.b(var4_int, -7720)) {
                stackOut_5_0 = 0;
                stackIn_6_0 = stackOut_5_0;
                return stackIn_6_0 != 0;
              } else {
                L1: {
                  var7 = (CharSequence) (Object) param1;
                  var5 = ((ki) this).field_i.field_g[var4_int].a(sk.a((byte) 76, var7), -119);
                  if (param2 == -1) {
                    break L1;
                  } else {
                    field_h = (String) ((Object[]) ((ki) this).field_a[26])[11];
                    break L1;
                  }
                }
                stackOut_9_0 = ((ki) this).a(var5, 19115, var4_int);
                stackIn_10_0 = stackOut_9_0;
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
          L2: {
            var4 = decompiledCaughtException;
            stackOut_11_0 = (RuntimeException) var4;
            stackOut_11_1 = new StringBuilder().append("ki.E(");
            stackIn_13_0 = stackOut_11_0;
            stackIn_13_1 = stackOut_11_1;
            stackIn_12_0 = stackOut_11_0;
            stackIn_12_1 = stackOut_11_1;
            if (param0 == null) {
              stackOut_13_0 = (RuntimeException) (Object) stackIn_13_0;
              stackOut_13_1 = (StringBuilder) (Object) stackIn_13_1;
              stackOut_13_2 = "null";
              stackIn_14_0 = stackOut_13_0;
              stackIn_14_1 = stackOut_13_1;
              stackIn_14_2 = stackOut_13_2;
              break L2;
            } else {
              stackOut_12_0 = (RuntimeException) (Object) stackIn_12_0;
              stackOut_12_1 = (StringBuilder) (Object) stackIn_12_1;
              stackOut_12_2 = "{...}";
              stackIn_14_0 = stackOut_12_0;
              stackIn_14_1 = stackOut_12_1;
              stackIn_14_2 = stackOut_12_2;
              break L2;
            }
          }
          L3: {
            stackOut_14_0 = (RuntimeException) (Object) stackIn_14_0;
            stackOut_14_1 = ((StringBuilder) (Object) stackIn_14_1).append(stackIn_14_2).append(44);
            stackIn_16_0 = stackOut_14_0;
            stackIn_16_1 = stackOut_14_1;
            stackIn_15_0 = stackOut_14_0;
            stackIn_15_1 = stackOut_14_1;
            if (param1 == null) {
              stackOut_16_0 = (RuntimeException) (Object) stackIn_16_0;
              stackOut_16_1 = (StringBuilder) (Object) stackIn_16_1;
              stackOut_16_2 = "null";
              stackIn_17_0 = stackOut_16_0;
              stackIn_17_1 = stackOut_16_1;
              stackIn_17_2 = stackOut_16_2;
              break L3;
            } else {
              stackOut_15_0 = (RuntimeException) (Object) stackIn_15_0;
              stackOut_15_1 = (StringBuilder) (Object) stackIn_15_1;
              stackOut_15_2 = "{...}";
              stackIn_17_0 = stackOut_15_0;
              stackIn_17_1 = stackOut_15_1;
              stackIn_17_2 = stackOut_15_2;
              break L3;
            }
          }
          throw dd.a((Throwable) (Object) stackIn_17_0, stackIn_17_2 + 44 + param2 + 41);
        }
        return stackIn_10_0;
    }

    final boolean b(byte param0, String param1) {
        int var3_int = 0;
        RuntimeException var3 = null;
        int var4 = 0;
        CharSequence var5 = null;
        int stackIn_2_0 = 0;
        boolean stackIn_4_0 = false;
        RuntimeException stackIn_6_0 = null;
        StringBuilder stackIn_6_1 = null;
        RuntimeException stackIn_7_0 = null;
        StringBuilder stackIn_7_1 = null;
        RuntimeException stackIn_8_0 = null;
        StringBuilder stackIn_8_1 = null;
        String stackIn_8_2 = null;
        RuntimeException decompiledCaughtException = null;
        boolean stackOut_3_0 = false;
        int stackOut_1_0 = 0;
        RuntimeException stackOut_5_0 = null;
        StringBuilder stackOut_5_1 = null;
        RuntimeException stackOut_7_0 = null;
        StringBuilder stackOut_7_1 = null;
        String stackOut_7_2 = null;
        RuntimeException stackOut_6_0 = null;
        StringBuilder stackOut_6_1 = null;
        String stackOut_6_2 = null;
        try {
          L0: {
            var3_int = -79 % ((param0 - -5) / 55);
            if (((ki) this).b(-1)) {
              param1 = param1.toLowerCase();
              var5 = (CharSequence) (Object) param1;
              var4 = ((ki) this).field_i.field_o.a(sk.a((byte) 76, var5), -107);
              stackOut_3_0 = ((ki) this).c((byte) 118, var4);
              stackIn_4_0 = stackOut_3_0;
              break L0;
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
            stackOut_5_0 = (RuntimeException) var3;
            stackOut_5_1 = new StringBuilder().append("ki.D(").append(param0).append(44);
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
          throw dd.a((Throwable) (Object) stackIn_8_0, stackIn_8_2 + 41);
        }
        return stackIn_4_0;
    }

    final synchronized boolean c(byte param0, int param1) {
        if (!this.b(param1, -7720)) {
            return false;
        }
        if (param0 < 93) {
            return ((boolean[]) ((Object[]) ((ki) this).field_a[4])[3])[1];
        }
        if (!(((ki) this).field_a[param1] == null)) {
            return true;
        }
        this.a(param1, -45);
        if (null != ((ki) this).field_a[param1]) {
            return true;
        }
        return false;
    }

    final synchronized int b(byte param0, int param1) {
        if (!this.b(param1, -7720)) {
            return 0;
        }
        if (!(null == ((ki) this).field_a[param1])) {
            return 100;
        }
        int var3 = 91 % ((param0 - 25) / 52);
        return ((ki) this).field_e.b(param1, -7362);
    }

    final int a(byte param0) {
        if (!(((ki) this).b(-1))) {
            return -1;
        }
        if (param0 <= 112) {
            return 124;
        }
        return ((ki) this).field_i.field_l.length;
    }

    final int a(byte param0, int param1) {
        if (!(this.b(param1, -7720))) {
            return 0;
        }
        if (param0 < 100) {
            return 42;
        }
        return ((ki) this).field_i.field_l[param1];
    }

    final int a(byte param0, String param1) {
        int var3_int = 0;
        RuntimeException var3 = null;
        int var4 = 0;
        CharSequence var5 = null;
        int stackIn_3_0 = 0;
        int stackIn_5_0 = 0;
        RuntimeException stackIn_7_0 = null;
        StringBuilder stackIn_7_1 = null;
        RuntimeException stackIn_8_0 = null;
        StringBuilder stackIn_8_1 = null;
        RuntimeException stackIn_9_0 = null;
        StringBuilder stackIn_9_1 = null;
        String stackIn_9_2 = null;
        RuntimeException decompiledCaughtException = null;
        int stackOut_2_0 = 0;
        int stackOut_4_0 = 0;
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
            var3_int = -81 / ((param0 - 32) / 58);
            if (!((ki) this).b(-1)) {
              stackOut_2_0 = 0;
              stackIn_3_0 = stackOut_2_0;
              return stackIn_3_0;
            } else {
              param1 = param1.toLowerCase();
              var5 = (CharSequence) (Object) param1;
              var4 = ((ki) this).field_i.field_o.a(sk.a((byte) 76, var5), -121);
              stackOut_4_0 = ((ki) this).b((byte) -53, var4);
              stackIn_5_0 = stackOut_4_0;
              break L0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L1: {
            var3 = decompiledCaughtException;
            stackOut_6_0 = (RuntimeException) var3;
            stackOut_6_1 = new StringBuilder().append("ki.AA(").append(param0).append(44);
            stackIn_8_0 = stackOut_6_0;
            stackIn_8_1 = stackOut_6_1;
            stackIn_7_0 = stackOut_6_0;
            stackIn_7_1 = stackOut_6_1;
            if (param1 == null) {
              stackOut_8_0 = (RuntimeException) (Object) stackIn_8_0;
              stackOut_8_1 = (StringBuilder) (Object) stackIn_8_1;
              stackOut_8_2 = "null";
              stackIn_9_0 = stackOut_8_0;
              stackIn_9_1 = stackOut_8_1;
              stackIn_9_2 = stackOut_8_2;
              break L1;
            } else {
              stackOut_7_0 = (RuntimeException) (Object) stackIn_7_0;
              stackOut_7_1 = (StringBuilder) (Object) stackIn_7_1;
              stackOut_7_2 = "{...}";
              stackIn_9_0 = stackOut_7_0;
              stackIn_9_1 = stackOut_7_1;
              stackIn_9_2 = stackOut_7_2;
              break L1;
            }
          }
          throw dd.a((Throwable) (Object) stackIn_9_0, stackIn_9_2 + 41);
        }
        return stackIn_5_0;
    }

    final boolean c(byte param0, String param1) {
        int var3_int = 0;
        RuntimeException var3 = null;
        int var4 = 0;
        CharSequence var5 = null;
        int stackIn_3_0 = 0;
        int stackIn_6_0 = 0;
        int stackIn_8_0 = 0;
        RuntimeException stackIn_10_0 = null;
        StringBuilder stackIn_10_1 = null;
        RuntimeException stackIn_11_0 = null;
        StringBuilder stackIn_11_1 = null;
        RuntimeException stackIn_12_0 = null;
        StringBuilder stackIn_12_1 = null;
        String stackIn_12_2 = null;
        RuntimeException decompiledCaughtException = null;
        int stackOut_2_0 = 0;
        int stackOut_7_0 = 0;
        int stackOut_5_0 = 0;
        RuntimeException stackOut_9_0 = null;
        StringBuilder stackOut_9_1 = null;
        RuntimeException stackOut_11_0 = null;
        StringBuilder stackOut_11_1 = null;
        String stackOut_11_2 = null;
        RuntimeException stackOut_10_0 = null;
        StringBuilder stackOut_10_1 = null;
        String stackOut_10_2 = null;
        try {
          L0: {
            if (!((ki) this).b(-1)) {
              stackOut_2_0 = 0;
              stackIn_3_0 = stackOut_2_0;
              return stackIn_3_0 != 0;
            } else {
              param1 = param1.toLowerCase();
              var4 = 125 % ((param0 - 7) / 32);
              var5 = (CharSequence) (Object) param1;
              var3_int = ((ki) this).field_i.field_o.a(sk.a((byte) 76, var5), -126);
              if (var3_int >= 0) {
                stackOut_7_0 = 1;
                stackIn_8_0 = stackOut_7_0;
                break L0;
              } else {
                stackOut_5_0 = 0;
                stackIn_6_0 = stackOut_5_0;
                return stackIn_6_0 != 0;
              }
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L1: {
            var3 = decompiledCaughtException;
            stackOut_9_0 = (RuntimeException) var3;
            stackOut_9_1 = new StringBuilder().append("ki.C(").append(param0).append(44);
            stackIn_11_0 = stackOut_9_0;
            stackIn_11_1 = stackOut_9_1;
            stackIn_10_0 = stackOut_9_0;
            stackIn_10_1 = stackOut_9_1;
            if (param1 == null) {
              stackOut_11_0 = (RuntimeException) (Object) stackIn_11_0;
              stackOut_11_1 = (StringBuilder) (Object) stackIn_11_1;
              stackOut_11_2 = "null";
              stackIn_12_0 = stackOut_11_0;
              stackIn_12_1 = stackOut_11_1;
              stackIn_12_2 = stackOut_11_2;
              break L1;
            } else {
              stackOut_10_0 = (RuntimeException) (Object) stackIn_10_0;
              stackOut_10_1 = (StringBuilder) (Object) stackIn_10_1;
              stackOut_10_2 = "{...}";
              stackIn_12_0 = stackOut_10_0;
              stackIn_12_1 = stackOut_10_1;
              stackIn_12_2 = stackOut_10_2;
              break L1;
            }
          }
          throw dd.a((Throwable) (Object) stackIn_12_0, stackIn_12_2 + 41);
        }
        return stackIn_8_0 != 0;
    }

    final byte[] b(int param0, boolean param1, int param2) {
        if (param1) {
            ((ki) this).field_c = null;
        }
        return this.a(-2, (int[]) null, param0, param2);
    }

    final synchronized int a(int param0) {
        int var2 = 0;
        int var3 = 0;
        int var4 = 0;
        int var5 = 0;
        Object var6 = null;
        int stackIn_5_0 = 0;
        int stackIn_5_1 = 0;
        int stackIn_9_0 = 0;
        int stackIn_9_1 = 0;
        int stackOut_4_0 = 0;
        int stackOut_4_1 = 0;
        int stackOut_8_0 = 0;
        int stackOut_8_1 = 0;
        var5 = OrbDefence.field_D ? 1 : 0;
        if (((ki) this).b(-1)) {
          var2 = 0;
          var3 = 0;
          var4 = 0;
          L0: while (true) {
            L1: {
              L2: {
                if (var4 >= ((ki) this).field_a.length) {
                  break L2;
                } else {
                  stackOut_4_0 = 0;
                  stackOut_4_1 = ((ki) this).field_i.field_d[var4];
                  stackIn_9_0 = stackOut_4_0;
                  stackIn_9_1 = stackOut_4_1;
                  stackIn_5_0 = stackOut_4_0;
                  stackIn_5_1 = stackOut_4_1;
                  if (var5 != 0) {
                    break L1;
                  } else {
                    L3: {
                      if (stackIn_5_0 >= stackIn_5_1) {
                        break L3;
                      } else {
                        var3 = var3 + ((ki) this).b((byte) -93, var4);
                        var2 += 100;
                        break L3;
                      }
                    }
                    var4++;
                    if (var5 == 0) {
                      continue L0;
                    } else {
                      break L2;
                    }
                  }
                }
              }
              stackOut_8_0 = param0;
              stackOut_8_1 = 20147;
              stackIn_9_0 = stackOut_8_0;
              stackIn_9_1 = stackOut_8_1;
              break L1;
            }
            L4: {
              if (stackIn_9_0 == stackIn_9_1) {
                break L4;
              } else {
                var6 = null;
                int discarded$2 = ((ki) this).a((String) null, 33);
                break L4;
              }
            }
            if (var2 == 0) {
              return 100;
            } else {
              var4 = var3 * 100 / var2;
              return var4;
            }
          }
        } else {
          return 0;
        }
    }

    final synchronized byte[] a(String param0, int param1, String param2) {
        int var4_int = 0;
        RuntimeException var4 = null;
        int var5 = 0;
        CharSequence var6 = null;
        CharSequence var7 = null;
        Object stackIn_2_0 = null;
        Object stackIn_5_0 = null;
        byte[] stackIn_10_0 = null;
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
        byte[] stackOut_9_0 = null;
        Object stackOut_4_0 = null;
        Object stackOut_1_0 = null;
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
            if (((ki) this).b(-1)) {
              if (param1 == 1) {
                param2 = param2.toLowerCase();
                param0 = param0.toLowerCase();
                var6 = (CharSequence) (Object) param2;
                var4_int = ((ki) this).field_i.field_o.a(sk.a((byte) 76, var6), -80);
                if (this.b(var4_int, param1 + -7721)) {
                  var7 = (CharSequence) (Object) param0;
                  var5 = ((ki) this).field_i.field_g[var4_int].a(sk.a((byte) 76, var7), -87);
                  stackOut_9_0 = ((ki) this).b(var4_int, false, var5);
                  stackIn_10_0 = stackOut_9_0;
                  break L0;
                } else {
                  return null;
                }
              } else {
                stackOut_4_0 = null;
                stackIn_5_0 = stackOut_4_0;
                return (byte[]) (Object) stackIn_5_0;
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
            stackOut_11_0 = (RuntimeException) var4;
            stackOut_11_1 = new StringBuilder().append("ki.M(");
            stackIn_13_0 = stackOut_11_0;
            stackIn_13_1 = stackOut_11_1;
            stackIn_12_0 = stackOut_11_0;
            stackIn_12_1 = stackOut_11_1;
            if (param0 == null) {
              stackOut_13_0 = (RuntimeException) (Object) stackIn_13_0;
              stackOut_13_1 = (StringBuilder) (Object) stackIn_13_1;
              stackOut_13_2 = "null";
              stackIn_14_0 = stackOut_13_0;
              stackIn_14_1 = stackOut_13_1;
              stackIn_14_2 = stackOut_13_2;
              break L1;
            } else {
              stackOut_12_0 = (RuntimeException) (Object) stackIn_12_0;
              stackOut_12_1 = (StringBuilder) (Object) stackIn_12_1;
              stackOut_12_2 = "{...}";
              stackIn_14_0 = stackOut_12_0;
              stackIn_14_1 = stackOut_12_1;
              stackIn_14_2 = stackOut_12_2;
              break L1;
            }
          }
          L2: {
            stackOut_14_0 = (RuntimeException) (Object) stackIn_14_0;
            stackOut_14_1 = ((StringBuilder) (Object) stackIn_14_1).append(stackIn_14_2).append(44).append(param1).append(44);
            stackIn_16_0 = stackOut_14_0;
            stackIn_16_1 = stackOut_14_1;
            stackIn_15_0 = stackOut_14_0;
            stackIn_15_1 = stackOut_14_1;
            if (param2 == null) {
              stackOut_16_0 = (RuntimeException) (Object) stackIn_16_0;
              stackOut_16_1 = (StringBuilder) (Object) stackIn_16_1;
              stackOut_16_2 = "null";
              stackIn_17_0 = stackOut_16_0;
              stackIn_17_1 = stackOut_16_1;
              stackIn_17_2 = stackOut_16_2;
              break L2;
            } else {
              stackOut_15_0 = (RuntimeException) (Object) stackIn_15_0;
              stackOut_15_1 = (StringBuilder) (Object) stackIn_15_1;
              stackOut_15_2 = "{...}";
              stackIn_17_0 = stackOut_15_0;
              stackIn_17_1 = stackOut_15_1;
              stackIn_17_2 = stackOut_15_2;
              break L2;
            }
          }
          throw dd.a((Throwable) (Object) stackIn_17_0, stackIn_17_2 + 41);
        }
        return stackIn_10_0;
    }

    final synchronized boolean b(int param0) {
        if (param0 != -1) {
            return true;
        }
        if (null == ((ki) this).field_i) {
            ((ki) this).field_i = ((ki) this).field_e.a(-23879);
            if (!(null != ((ki) this).field_i)) {
                return false;
            }
            ((ki) this).field_c = new Object[((ki) this).field_i.field_s][];
            ((ki) this).field_a = new Object[((ki) this).field_i.field_s];
        }
        return true;
    }

    final synchronized boolean a(int param0, int param1, int param2) {
        if (!this.a(param2, true, param0)) {
            return false;
        }
        if (((ki) this).field_c[param2] != null) {
            if (null != ((ki) this).field_c[param2][param0]) {
                return true;
            }
        }
        if (((ki) this).field_a[param2] != null) {
            return true;
        }
        if (param1 != 19115) {
            return ((boolean[]) ((ki) this).field_a[0])[13];
        }
        this.a(param2, -74);
        if (((ki) this).field_a[param2] != null) {
            return true;
        }
        return false;
    }

    final static boolean d(int param0) {
        if (param0 >= -92) {
            field_d = null;
        }
        return ec.k(783);
    }

    final static String a(int param0, CharSequence param1) {
        RuntimeException var2 = null;
        String stackIn_3_0 = null;
        RuntimeException stackIn_5_0 = null;
        StringBuilder stackIn_5_1 = null;
        RuntimeException stackIn_6_0 = null;
        StringBuilder stackIn_6_1 = null;
        RuntimeException stackIn_7_0 = null;
        StringBuilder stackIn_7_1 = null;
        String stackIn_7_2 = null;
        RuntimeException decompiledCaughtException = null;
        String stackOut_2_0 = null;
        RuntimeException stackOut_4_0 = null;
        StringBuilder stackOut_4_1 = null;
        RuntimeException stackOut_6_0 = null;
        StringBuilder stackOut_6_1 = null;
        String stackOut_6_2 = null;
        RuntimeException stackOut_5_0 = null;
        StringBuilder stackOut_5_1 = null;
        String stackOut_5_2 = null;
        try {
          L0: {
            L1: {
              if (param0 == -1) {
                break L1;
              } else {
                field_f = null;
                break L1;
              }
            }
            stackOut_2_0 = fi.a(1, param1, false);
            stackIn_3_0 = stackOut_2_0;
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L2: {
            var2 = decompiledCaughtException;
            stackOut_4_0 = (RuntimeException) var2;
            stackOut_4_1 = new StringBuilder().append("ki.R(").append(param0).append(44);
            stackIn_6_0 = stackOut_4_0;
            stackIn_6_1 = stackOut_4_1;
            stackIn_5_0 = stackOut_4_0;
            stackIn_5_1 = stackOut_4_1;
            if (param1 == null) {
              stackOut_6_0 = (RuntimeException) (Object) stackIn_6_0;
              stackOut_6_1 = (StringBuilder) (Object) stackIn_6_1;
              stackOut_6_2 = "null";
              stackIn_7_0 = stackOut_6_0;
              stackIn_7_1 = stackOut_6_1;
              stackIn_7_2 = stackOut_6_2;
              break L2;
            } else {
              stackOut_5_0 = (RuntimeException) (Object) stackIn_5_0;
              stackOut_5_1 = (StringBuilder) (Object) stackIn_5_1;
              stackOut_5_2 = "{...}";
              stackIn_7_0 = stackOut_5_0;
              stackIn_7_1 = stackOut_5_1;
              stackIn_7_2 = stackOut_5_2;
              break L2;
            }
          }
          throw dd.a((Throwable) (Object) stackIn_7_0, stackIn_7_2 + 41);
        }
        return stackIn_3_0;
    }

    private final synchronized boolean a(int[] param0, int param1, int param2, int param3) {
        RuntimeException var5 = null;
        int var5_int = 0;
        int[] var6 = null;
        Object[] var7 = null;
        int var8 = 0;
        Object var9 = null;
        int var9_int = 0;
        byte[] var9_array = null;
        int var10_int = 0;
        mg var10 = null;
        byte[] var10_array = null;
        RuntimeException var11_ref_RuntimeException = null;
        int var11 = 0;
        int var12 = 0;
        mg var13 = null;
        int var14 = 0;
        int[] var14_ref_int__ = null;
        int var15 = 0;
        byte[][] var15_ref_byte____ = null;
        int var16_int = 0;
        byte[] var16 = null;
        int var17 = 0;
        int var18 = 0;
        int var19 = 0;
        int var20 = 0;
        int var21 = 0;
        int var22 = 0;
        byte[] var23 = null;
        int stackIn_3_0 = 0;
        int stackIn_7_0 = 0;
        int[] stackIn_14_0 = null;
        int stackIn_24_0 = 0;
        int[] stackIn_26_0 = null;
        int stackIn_36_0 = 0;
        RuntimeException stackIn_40_0 = null;
        StringBuilder stackIn_40_1 = null;
        RuntimeException stackIn_41_0 = null;
        StringBuilder stackIn_41_1 = null;
        RuntimeException stackIn_42_0 = null;
        StringBuilder stackIn_42_1 = null;
        int stackIn_42_2 = 0;
        int stackIn_51_0 = 0;
        int stackIn_59_0 = 0;
        int stackIn_68_0 = 0;
        int stackIn_76_0 = 0;
        int stackIn_91_0 = 0;
        int stackIn_103_0 = 0;
        int stackIn_106_0 = 0;
        int stackIn_110_0 = 0;
        int stackIn_130_0 = 0;
        RuntimeException stackIn_132_0 = null;
        StringBuilder stackIn_132_1 = null;
        RuntimeException stackIn_133_0 = null;
        StringBuilder stackIn_133_1 = null;
        RuntimeException stackIn_134_0 = null;
        StringBuilder stackIn_134_1 = null;
        String stackIn_134_2 = null;
        RuntimeException decompiledCaughtException = null;
        int stackOut_6_0 = 0;
        int[] stackOut_13_0 = null;
        int[] stackOut_25_0 = null;
        int stackOut_23_0 = 0;
        RuntimeException stackOut_39_0 = null;
        StringBuilder stackOut_39_1 = null;
        RuntimeException stackOut_41_0 = null;
        StringBuilder stackOut_41_1 = null;
        int stackOut_41_2 = 0;
        RuntimeException stackOut_40_0 = null;
        StringBuilder stackOut_40_1 = null;
        int stackOut_40_2 = 0;
        int stackOut_50_0 = 0;
        int stackOut_58_0 = 0;
        int stackOut_67_0 = 0;
        int stackOut_75_0 = 0;
        int stackOut_90_0 = 0;
        int stackOut_102_0 = 0;
        int stackOut_105_0 = 0;
        int stackOut_109_0 = 0;
        int stackOut_129_0 = 0;
        int stackOut_35_0 = 0;
        int stackOut_2_0 = 0;
        RuntimeException stackOut_131_0 = null;
        StringBuilder stackOut_131_1 = null;
        RuntimeException stackOut_133_0 = null;
        StringBuilder stackOut_133_1 = null;
        String stackOut_133_2 = null;
        RuntimeException stackOut_132_0 = null;
        StringBuilder stackOut_132_1 = null;
        String stackOut_132_2 = null;
        var22 = OrbDefence.field_D ? 1 : 0;
        try {
          L0: {
            if (this.b(param2, -7720)) {
              if (((ki) this).field_a[param2] == null) {
                stackOut_6_0 = 0;
                stackIn_7_0 = stackOut_6_0;
                return stackIn_7_0 != 0;
              } else {
                L1: {
                  var5_int = ((ki) this).field_i.field_d[param2];
                  var6 = ((ki) this).field_i.field_f[param2];
                  if (null == ((ki) this).field_c[param2]) {
                    ((ki) this).field_c[param2] = new Object[((ki) this).field_i.field_l[param2]];
                    break L1;
                  } else {
                    break L1;
                  }
                }
                var7 = ((ki) this).field_c[param2];
                var8 = 1;
                var9_int = 0;
                L2: while (true) {
                  L3: {
                    L4: {
                      if (~var9_int <= ~var5_int) {
                        break L4;
                      } else {
                        stackOut_13_0 = (int[]) var6;
                        stackIn_26_0 = stackOut_13_0;
                        stackIn_14_0 = stackOut_13_0;
                        if (var22 != 0) {
                          break L3;
                        } else {
                          L5: {
                            L6: {
                              if (stackIn_14_0 == null) {
                                break L6;
                              } else {
                                var10_int = var6[var9_int];
                                if (var22 == 0) {
                                  break L5;
                                } else {
                                  break L6;
                                }
                              }
                            }
                            var10_int = var9_int;
                            break L5;
                          }
                          L7: {
                            if (null == var7[var10_int]) {
                              var8 = 0;
                              if (var22 == 0) {
                                break L4;
                              } else {
                                break L7;
                              }
                            } else {
                              break L7;
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
                      stackOut_25_0 = (int[]) param0;
                      stackIn_26_0 = stackOut_25_0;
                      break L3;
                    } else {
                      stackOut_23_0 = 1;
                      stackIn_24_0 = stackOut_23_0;
                      return stackIn_24_0 != 0;
                    }
                  }
                  L8: {
                    L9: {
                      if (stackIn_26_0 == null) {
                        break L9;
                      } else {
                        L10: {
                          if (param0[0] != 0) {
                            break L10;
                          } else {
                            if (param0[1] != 0) {
                              break L10;
                            } else {
                              if (param0[2] != 0) {
                                break L10;
                              } else {
                                if (param0[3] == 0) {
                                  break L9;
                                } else {
                                  break L10;
                                }
                              }
                            }
                          }
                        }
                        var9_array = e.a(((ki) this).field_a[param2], true, 25966);
                        var10 = new mg(var9_array);
                        var10.a(5, var10.field_j.length, false, param0);
                        break L8;
                      }
                    }
                    var9_array = e.a(((ki) this).field_a[param2], false, 25966);
                    break L8;
                  }
                  if (param1 == -895) {
                    try {
                      L11: {
                        var23 = nf.a(var9_array, param1 ^ 895);
                        var10_array = var23;
                        break L11;
                      }
                    } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
                      decompiledCaughtException = decompiledCaughtParameter0;
                      L12: {
                        var11_ref_RuntimeException = decompiledCaughtException;
                        stackOut_39_0 = (RuntimeException) var11_ref_RuntimeException;
                        stackOut_39_1 = new StringBuilder();
                        stackIn_41_0 = stackOut_39_0;
                        stackIn_41_1 = stackOut_39_1;
                        stackIn_40_0 = stackOut_39_0;
                        stackIn_40_1 = stackOut_39_1;
                        if (param0 == null) {
                          stackOut_41_0 = (RuntimeException) (Object) stackIn_41_0;
                          stackOut_41_1 = (StringBuilder) (Object) stackIn_41_1;
                          stackOut_41_2 = 0;
                          stackIn_42_0 = stackOut_41_0;
                          stackIn_42_1 = stackOut_41_1;
                          stackIn_42_2 = stackOut_41_2;
                          break L12;
                        } else {
                          stackOut_40_0 = (RuntimeException) (Object) stackIn_40_0;
                          stackOut_40_1 = (StringBuilder) (Object) stackIn_40_1;
                          stackOut_40_2 = 1;
                          stackIn_42_0 = stackOut_40_0;
                          stackIn_42_1 = stackOut_40_1;
                          stackIn_42_2 = stackOut_40_2;
                          break L12;
                        }
                      }
                      throw dd.a((Throwable) (Object) stackIn_42_0, stackIn_42_2 + " " + param2 + " " + param0.length + " " + eg.a(var9_array, 0, param0.length) + " " + eg.a(var9_array, 0, param0.length + -2) + " " + ((ki) this).field_i.field_r[param2] + " " + ((ki) this).field_i.field_p);
                    }
                    L13: {
                      if (((ki) this).field_g) {
                        ((ki) this).field_a[param2] = null;
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
                              if (((ki) this).field_b == 2) {
                                break L17;
                              } else {
                                var11 = var23.length;
                                var11--;
                                var12 = var23[var11] & 255;
                                var11 = var11 - 4 * var12 * var5_int;
                                var13 = new mg(var10_array);
                                var14_ref_int__ = new int[var5_int];
                                var13.field_i = var11;
                                var15 = 0;
                                L18: while (true) {
                                  L19: {
                                    L20: {
                                      if (var15 >= var12) {
                                        break L20;
                                      } else {
                                        var16_int = 0;
                                        stackOut_50_0 = 0;
                                        stackIn_59_0 = stackOut_50_0;
                                        stackIn_51_0 = stackOut_50_0;
                                        if (var22 != 0) {
                                          break L19;
                                        } else {
                                          var17 = stackIn_51_0;
                                          L21: while (true) {
                                            L22: {
                                              L23: {
                                                if (~var5_int >= ~var17) {
                                                  break L23;
                                                } else {
                                                  var16_int = var16_int + var13.l(0);
                                                  var14_ref_int__[var17] = var14_ref_int__[var17] + var16_int;
                                                  var17++;
                                                  if (var22 != 0) {
                                                    break L22;
                                                  } else {
                                                    if (var22 == 0) {
                                                      continue L21;
                                                    } else {
                                                      break L23;
                                                    }
                                                  }
                                                }
                                              }
                                              var15++;
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
                                    stackOut_58_0 = var5_int;
                                    stackIn_59_0 = stackOut_58_0;
                                    break L19;
                                  }
                                  var15_ref_byte____ = new byte[stackIn_59_0][];
                                  var16_int = 0;
                                  L24: while (true) {
                                    L25: {
                                      L26: {
                                        if (var5_int <= var16_int) {
                                          break L26;
                                        } else {
                                          var15_ref_byte____[var16_int] = new byte[var14_ref_int__[var16_int]];
                                          var14_ref_int__[var16_int] = 0;
                                          var16_int++;
                                          if (var22 != 0) {
                                            break L25;
                                          } else {
                                            if (var22 == 0) {
                                              continue L24;
                                            } else {
                                              break L26;
                                            }
                                          }
                                        }
                                      }
                                      var13.field_i = var11;
                                      var16_int = 0;
                                      break L25;
                                    }
                                    var17 = 0;
                                    L27: while (true) {
                                      L28: {
                                        L29: {
                                          if (var12 <= var17) {
                                            break L29;
                                          } else {
                                            var18 = 0;
                                            stackOut_67_0 = 0;
                                            stackIn_76_0 = stackOut_67_0;
                                            stackIn_68_0 = stackOut_67_0;
                                            if (var22 != 0) {
                                              break L28;
                                            } else {
                                              var19 = stackIn_68_0;
                                              L30: while (true) {
                                                L31: {
                                                  L32: {
                                                    if (~var5_int >= ~var19) {
                                                      break L32;
                                                    } else {
                                                      var18 = var18 + var13.l(0);
                                                      mk.a(var23, var16_int, var15_ref_byte____[var19], var14_ref_int__[var19], var18);
                                                      var16_int = var16_int + var18;
                                                      var14_ref_int__[var19] = var14_ref_int__[var19] + var18;
                                                      var19++;
                                                      if (var22 != 0) {
                                                        break L31;
                                                      } else {
                                                        if (var22 == 0) {
                                                          continue L30;
                                                        } else {
                                                          break L32;
                                                        }
                                                      }
                                                    }
                                                  }
                                                  var17++;
                                                  break L31;
                                                }
                                                if (var22 == 0) {
                                                  continue L27;
                                                } else {
                                                  break L29;
                                                }
                                              }
                                            }
                                          }
                                        }
                                        stackOut_75_0 = 0;
                                        stackIn_76_0 = stackOut_75_0;
                                        break L28;
                                      }
                                      var17 = stackIn_76_0;
                                      L33: while (true) {
                                        L34: {
                                          if (var17 >= var5_int) {
                                            break L34;
                                          } else {
                                            if (var22 != 0) {
                                              break L15;
                                            } else {
                                              L35: {
                                                L36: {
                                                  if (var6 != null) {
                                                    break L36;
                                                  } else {
                                                    var18 = var17;
                                                    if (var22 == 0) {
                                                      break L35;
                                                    } else {
                                                      break L36;
                                                    }
                                                  }
                                                }
                                                var18 = var6[var17];
                                                break L35;
                                              }
                                              L37: {
                                                L38: {
                                                  if (((ki) this).field_b == 0) {
                                                    break L38;
                                                  } else {
                                                    var7[var18] = (Object) (Object) var15_ref_byte____[var17];
                                                    if (var22 == 0) {
                                                      break L37;
                                                    } else {
                                                      break L38;
                                                    }
                                                  }
                                                }
                                                var7[var18] = fm.a(var15_ref_byte____[var17], 3, false);
                                                break L37;
                                              }
                                              var17++;
                                              if (var22 == 0) {
                                                continue L33;
                                              } else {
                                                break L34;
                                              }
                                            }
                                          }
                                        }
                                        if (var22 == 0) {
                                          break L15;
                                        } else {
                                          break L17;
                                        }
                                      }
                                    }
                                  }
                                }
                              }
                            }
                            var11 = var23.length;
                            var11--;
                            var12 = var23[var11] & 255;
                            var11 = var11 - 4 * var12 * var5_int;
                            var13 = new mg(var10_array);
                            var14 = 0;
                            var13.field_i = var11;
                            var15 = 0;
                            var16_int = 0;
                            L39: while (true) {
                              L40: {
                                L41: {
                                  if (var12 <= var16_int) {
                                    break L41;
                                  } else {
                                    var17 = 0;
                                    stackOut_90_0 = 0;
                                    stackIn_103_0 = stackOut_90_0;
                                    stackIn_91_0 = stackOut_90_0;
                                    if (var22 != 0) {
                                      break L40;
                                    } else {
                                      var18 = stackIn_91_0;
                                      L42: while (true) {
                                        L43: {
                                          L44: {
                                            if (~var5_int >= ~var18) {
                                              break L44;
                                            } else {
                                              var17 = var17 + var13.l(param1 ^ -895);
                                              if (var22 != 0) {
                                                break L43;
                                              } else {
                                                L45: {
                                                  L46: {
                                                    if (var6 == null) {
                                                      break L46;
                                                    } else {
                                                      var19 = var6[var18];
                                                      if (var22 == 0) {
                                                        break L45;
                                                      } else {
                                                        break L46;
                                                      }
                                                    }
                                                  }
                                                  var19 = var18;
                                                  break L45;
                                                }
                                                L47: {
                                                  if (var19 != param3) {
                                                    break L47;
                                                  } else {
                                                    var15 = var19;
                                                    var14 = var14 + var17;
                                                    break L47;
                                                  }
                                                }
                                                var18++;
                                                if (var22 == 0) {
                                                  continue L42;
                                                } else {
                                                  break L44;
                                                }
                                              }
                                            }
                                          }
                                          var16_int++;
                                          break L43;
                                        }
                                        if (var22 == 0) {
                                          continue L39;
                                        } else {
                                          break L41;
                                        }
                                      }
                                    }
                                  }
                                }
                                stackOut_102_0 = ~var14;
                                stackIn_103_0 = stackOut_102_0;
                                break L40;
                              }
                              if (stackIn_103_0 == -1) {
                                stackOut_105_0 = 1;
                                stackIn_106_0 = stackOut_105_0;
                                return stackIn_106_0 != 0;
                              } else {
                                var16 = new byte[var14];
                                var14 = 0;
                                var13.field_i = var11;
                                var17 = 0;
                                var18 = 0;
                                L48: while (true) {
                                  L49: {
                                    if (~var18 <= ~var12) {
                                      break L49;
                                    } else {
                                      var19 = 0;
                                      stackOut_109_0 = 0;
                                      stackIn_130_0 = stackOut_109_0;
                                      stackIn_110_0 = stackOut_109_0;
                                      if (var22 != 0) {
                                        break L14;
                                      } else {
                                        var20 = stackIn_110_0;
                                        L50: while (true) {
                                          L51: {
                                            L52: {
                                              if (~var20 <= ~var5_int) {
                                                break L52;
                                              } else {
                                                var19 = var19 + var13.l(0);
                                                if (var22 != 0) {
                                                  break L51;
                                                } else {
                                                  L53: {
                                                    L54: {
                                                      if (var6 == null) {
                                                        break L54;
                                                      } else {
                                                        var21 = var6[var20];
                                                        if (var22 == 0) {
                                                          break L53;
                                                        } else {
                                                          break L54;
                                                        }
                                                      }
                                                    }
                                                    var21 = var20;
                                                    break L53;
                                                  }
                                                  L55: {
                                                    if (param3 != var21) {
                                                      break L55;
                                                    } else {
                                                      mk.a(var10_array, var17, var16, var14, var19);
                                                      var14 = var14 + var19;
                                                      break L55;
                                                    }
                                                  }
                                                  var17 = var17 + var19;
                                                  var20++;
                                                  if (var22 == 0) {
                                                    continue L50;
                                                  } else {
                                                    break L52;
                                                  }
                                                }
                                              }
                                            }
                                            var18++;
                                            break L51;
                                          }
                                          if (var22 == 0) {
                                            continue L48;
                                          } else {
                                            break L49;
                                          }
                                        }
                                      }
                                    }
                                  }
                                  var7[var15] = (Object) (Object) var16;
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
                        L56: {
                          L57: {
                            if (var6 == null) {
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
                          if (((ki) this).field_b != 0) {
                            break L58;
                          } else {
                            var7[var11] = fm.a(var23, gi.a(param1, -894), false);
                            if (var22 == 0) {
                              break L15;
                            } else {
                              break L58;
                            }
                          }
                        }
                        var7[var11] = (Object) (Object) var23;
                        return true;
                      }
                      stackOut_129_0 = 1;
                      stackIn_130_0 = stackOut_129_0;
                      break L14;
                    }
                    break L0;
                  } else {
                    stackOut_35_0 = 0;
                    stackIn_36_0 = stackOut_35_0;
                    return stackIn_36_0 != 0;
                  }
                }
              }
            } else {
              stackOut_2_0 = 0;
              stackIn_3_0 = stackOut_2_0;
              return stackIn_3_0 != 0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter1) {
          decompiledCaughtException = decompiledCaughtParameter1;
          L59: {
            var5 = decompiledCaughtException;
            stackOut_131_0 = (RuntimeException) var5;
            stackOut_131_1 = new StringBuilder().append("ki.BA(");
            stackIn_133_0 = stackOut_131_0;
            stackIn_133_1 = stackOut_131_1;
            stackIn_132_0 = stackOut_131_0;
            stackIn_132_1 = stackOut_131_1;
            if (param0 == null) {
              stackOut_133_0 = (RuntimeException) (Object) stackIn_133_0;
              stackOut_133_1 = (StringBuilder) (Object) stackIn_133_1;
              stackOut_133_2 = "null";
              stackIn_134_0 = stackOut_133_0;
              stackIn_134_1 = stackOut_133_1;
              stackIn_134_2 = stackOut_133_2;
              break L59;
            } else {
              stackOut_132_0 = (RuntimeException) (Object) stackIn_132_0;
              stackOut_132_1 = (StringBuilder) (Object) stackIn_132_1;
              stackOut_132_2 = "{...}";
              stackIn_134_0 = stackOut_132_0;
              stackIn_134_1 = stackOut_132_1;
              stackIn_134_2 = stackOut_132_2;
              break L59;
            }
          }
          throw dd.a((Throwable) (Object) stackIn_134_0, stackIn_134_2 + 44 + param1 + 44 + param2 + 44 + param3 + 41);
        }
        return stackIn_130_0 != 0;
    }

    public static void a(boolean param0) {
        field_h = null;
        if (param0) {
            return;
        }
        field_d = null;
        field_f = null;
    }

    final synchronized byte[] a(int param0, boolean param1) {
        if (!((ki) this).b(-1)) {
            return null;
        }
        if (!(((ki) this).field_i.field_l.length != 1)) {
            return ((ki) this).b(0, false, param0);
        }
        if (!param1) {
            field_f = (int[]) ((ki) this).field_a[5];
        }
        if (!this.b(param0, -7720)) {
            return null;
        }
        if (1 == ((ki) this).field_i.field_l[param0]) {
            return ((ki) this).b(param0, !param1 ? true : false, 0);
        }
        throw new RuntimeException();
    }

    final int a(String param0, int param1, int param2) {
        int var4_int = 0;
        RuntimeException var4 = null;
        CharSequence var5 = null;
        int stackIn_5_0 = 0;
        int stackIn_8_0 = 0;
        int stackIn_10_0 = 0;
        RuntimeException stackIn_12_0 = null;
        StringBuilder stackIn_12_1 = null;
        RuntimeException stackIn_13_0 = null;
        StringBuilder stackIn_13_1 = null;
        RuntimeException stackIn_14_0 = null;
        StringBuilder stackIn_14_1 = null;
        String stackIn_14_2 = null;
        RuntimeException decompiledCaughtException = null;
        int stackOut_4_0 = 0;
        int stackOut_9_0 = 0;
        int stackOut_7_0 = 0;
        RuntimeException stackOut_11_0 = null;
        StringBuilder stackOut_11_1 = null;
        RuntimeException stackOut_13_0 = null;
        StringBuilder stackOut_13_1 = null;
        String stackOut_13_2 = null;
        RuntimeException stackOut_12_0 = null;
        StringBuilder stackOut_12_1 = null;
        String stackOut_12_2 = null;
        try {
          L0: {
            L1: {
              if (param1 == 5187) {
                break L1;
              } else {
                int discarded$2 = ((ki) this).a((byte) 121);
                break L1;
              }
            }
            if (!this.b(param2, -7720)) {
              stackOut_4_0 = -1;
              stackIn_5_0 = stackOut_4_0;
              return stackIn_5_0;
            } else {
              param0 = param0.toLowerCase();
              var5 = (CharSequence) (Object) param0;
              var4_int = ((ki) this).field_i.field_g[param2].a(sk.a((byte) 76, var5), -109);
              if (this.a(param2, true, var4_int)) {
                stackOut_9_0 = var4_int;
                stackIn_10_0 = stackOut_9_0;
                break L0;
              } else {
                stackOut_7_0 = -1;
                stackIn_8_0 = stackOut_7_0;
                return stackIn_8_0;
              }
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L2: {
            var4 = decompiledCaughtException;
            stackOut_11_0 = (RuntimeException) var4;
            stackOut_11_1 = new StringBuilder().append("ki.J(");
            stackIn_13_0 = stackOut_11_0;
            stackIn_13_1 = stackOut_11_1;
            stackIn_12_0 = stackOut_11_0;
            stackIn_12_1 = stackOut_11_1;
            if (param0 == null) {
              stackOut_13_0 = (RuntimeException) (Object) stackIn_13_0;
              stackOut_13_1 = (StringBuilder) (Object) stackIn_13_1;
              stackOut_13_2 = "null";
              stackIn_14_0 = stackOut_13_0;
              stackIn_14_1 = stackOut_13_1;
              stackIn_14_2 = stackOut_13_2;
              break L2;
            } else {
              stackOut_12_0 = (RuntimeException) (Object) stackIn_12_0;
              stackOut_12_1 = (StringBuilder) (Object) stackIn_12_1;
              stackOut_12_2 = "{...}";
              stackIn_14_0 = stackOut_12_0;
              stackIn_14_1 = stackOut_12_1;
              stackIn_14_2 = stackOut_12_2;
              break L2;
            }
          }
          throw dd.a((Throwable) (Object) stackIn_14_0, stackIn_14_2 + 44 + param1 + 44 + param2 + 41);
        }
        return stackIn_10_0;
    }

    private final synchronized boolean b(int param0, int param1) {
        if (((ki) this).b(param1 + 7719)) {
          if (param1 == -7720) {
            L0: {
              if (0 > param0) {
                break L0;
              } else {
                if (~((ki) this).field_i.field_l.length >= ~param0) {
                  break L0;
                } else {
                  if (((ki) this).field_i.field_l[param0] != 0) {
                    return true;
                  } else {
                    break L0;
                  }
                }
              }
            }
            if (rf.field_N) {
              throw new IllegalArgumentException(Integer.toString(param0));
            } else {
              return false;
            }
          } else {
            return true;
          }
        } else {
          return false;
        }
    }

    final int a(String param0, int param1) {
        int var3_int = 0;
        RuntimeException var3 = null;
        CharSequence var4 = null;
        int stackIn_2_0 = 0;
        int stackIn_6_0 = 0;
        int stackIn_10_0 = 0;
        RuntimeException stackIn_12_0 = null;
        StringBuilder stackIn_12_1 = null;
        RuntimeException stackIn_13_0 = null;
        StringBuilder stackIn_13_1 = null;
        RuntimeException stackIn_14_0 = null;
        StringBuilder stackIn_14_1 = null;
        String stackIn_14_2 = null;
        RuntimeException decompiledCaughtException = null;
        int stackOut_5_0 = 0;
        int stackOut_9_0 = 0;
        int stackOut_1_0 = 0;
        RuntimeException stackOut_11_0 = null;
        StringBuilder stackOut_11_1 = null;
        RuntimeException stackOut_13_0 = null;
        StringBuilder stackOut_13_1 = null;
        String stackOut_13_2 = null;
        RuntimeException stackOut_12_0 = null;
        StringBuilder stackOut_12_1 = null;
        String stackOut_12_2 = null;
        try {
          L0: {
            if (((ki) this).b(-1)) {
              param0 = param0.toLowerCase();
              var4 = (CharSequence) (Object) param0;
              var3_int = ((ki) this).field_i.field_o.a(sk.a((byte) 76, var4), -73);
              if (!this.b(var3_int, param1 + -7720)) {
                stackOut_5_0 = -1;
                stackIn_6_0 = stackOut_5_0;
                return stackIn_6_0;
              } else {
                L1: {
                  if (param1 == 0) {
                    break L1;
                  } else {
                    ((int[]) ((Object[]) ((ki) this).field_a[0])[2])[9] = ((int[]) ((ki) this).field_a[1])[5];
                    break L1;
                  }
                }
                stackOut_9_0 = var3_int;
                stackIn_10_0 = stackOut_9_0;
                break L0;
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
            var3 = decompiledCaughtException;
            stackOut_11_0 = (RuntimeException) var3;
            stackOut_11_1 = new StringBuilder().append("ki.I(");
            stackIn_13_0 = stackOut_11_0;
            stackIn_13_1 = stackOut_11_1;
            stackIn_12_0 = stackOut_11_0;
            stackIn_12_1 = stackOut_11_1;
            if (param0 == null) {
              stackOut_13_0 = (RuntimeException) (Object) stackIn_13_0;
              stackOut_13_1 = (StringBuilder) (Object) stackIn_13_1;
              stackOut_13_2 = "null";
              stackIn_14_0 = stackOut_13_0;
              stackIn_14_1 = stackOut_13_1;
              stackIn_14_2 = stackOut_13_2;
              break L2;
            } else {
              stackOut_12_0 = (RuntimeException) (Object) stackIn_12_0;
              stackOut_12_1 = (StringBuilder) (Object) stackIn_12_1;
              stackOut_12_2 = "{...}";
              stackIn_14_0 = stackOut_12_0;
              stackIn_14_1 = stackOut_12_1;
              stackIn_14_2 = stackOut_12_2;
              break L2;
            }
          }
          throw dd.a((Throwable) (Object) stackIn_14_0, stackIn_14_2 + 44 + param1 + 41);
        }
        return stackIn_10_0;
    }

    final synchronized boolean c(int param0) {
        int var2 = 0;
        int var3 = 0;
        int var4 = 0;
        int var5 = 0;
        var5 = OrbDefence.field_D ? 1 : 0;
        if (((ki) this).b(-1)) {
          var2 = 1;
          var3 = 0;
          L0: while (true) {
            L1: {
              L2: {
                if (var3 >= ((ki) this).field_i.field_c.length) {
                  break L2;
                } else {
                  var4 = ((ki) this).field_i.field_c[var3];
                  if (var5 != 0) {
                    break L1;
                  } else {
                    L3: {
                      if (null != ((ki) this).field_a[var4]) {
                        break L3;
                      } else {
                        this.a(var4, param0 ^ -7726);
                        if (null == ((ki) this).field_a[var4]) {
                          var2 = 0;
                          break L3;
                        } else {
                          break L3;
                        }
                      }
                    }
                    var3++;
                    if (var5 == 0) {
                      continue L0;
                    } else {
                      break L2;
                    }
                  }
                }
              }
              if (param0 == 7715) {
                break L1;
              } else {
                return true;
              }
            }
            return var2 != 0;
          }
        } else {
          return false;
        }
    }

    ki(jl param0, boolean param1, int param2) {
        RuntimeException runtimeException = null;
        Object stackIn_5_0 = null;
        Object stackIn_6_0 = null;
        Object stackIn_7_0 = null;
        int stackIn_7_1 = 0;
        RuntimeException stackIn_10_0 = null;
        StringBuilder stackIn_10_1 = null;
        RuntimeException stackIn_11_0 = null;
        StringBuilder stackIn_11_1 = null;
        RuntimeException stackIn_12_0 = null;
        StringBuilder stackIn_12_1 = null;
        String stackIn_12_2 = null;
        RuntimeException decompiledCaughtException = null;
        Object stackOut_4_0 = null;
        Object stackOut_6_0 = null;
        int stackOut_6_1 = 0;
        Object stackOut_5_0 = null;
        int stackOut_5_1 = 0;
        RuntimeException stackOut_9_0 = null;
        StringBuilder stackOut_9_1 = null;
        RuntimeException stackOut_11_0 = null;
        StringBuilder stackOut_11_1 = null;
        String stackOut_11_2 = null;
        RuntimeException stackOut_10_0 = null;
        StringBuilder stackOut_10_1 = null;
        String stackOut_10_2 = null;
        ((ki) this).field_i = null;
        try {
          L0: {
            L1: {
              if (param2 < 0) {
                break L1;
              } else {
                if (param2 <= 2) {
                  L2: {
                    ((ki) this).field_b = param2;
                    stackOut_4_0 = this;
                    stackIn_6_0 = stackOut_4_0;
                    stackIn_5_0 = stackOut_4_0;
                    if (!param1) {
                      stackOut_6_0 = this;
                      stackOut_6_1 = 0;
                      stackIn_7_0 = stackOut_6_0;
                      stackIn_7_1 = stackOut_6_1;
                      break L2;
                    } else {
                      stackOut_5_0 = this;
                      stackOut_5_1 = 1;
                      stackIn_7_0 = stackOut_5_0;
                      stackIn_7_1 = stackOut_5_1;
                      break L2;
                    }
                  }
                  ((ki) this).field_g = stackIn_7_1 != 0;
                  ((ki) this).field_e = param0;
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
          L3: {
            runtimeException = decompiledCaughtException;
            stackOut_9_0 = (RuntimeException) runtimeException;
            stackOut_9_1 = new StringBuilder().append("ki.<init>(");
            stackIn_11_0 = stackOut_9_0;
            stackIn_11_1 = stackOut_9_1;
            stackIn_10_0 = stackOut_9_0;
            stackIn_10_1 = stackOut_9_1;
            if (param0 == null) {
              stackOut_11_0 = (RuntimeException) (Object) stackIn_11_0;
              stackOut_11_1 = (StringBuilder) (Object) stackIn_11_1;
              stackOut_11_2 = "null";
              stackIn_12_0 = stackOut_11_0;
              stackIn_12_1 = stackOut_11_1;
              stackIn_12_2 = stackOut_11_2;
              break L3;
            } else {
              stackOut_10_0 = (RuntimeException) (Object) stackIn_10_0;
              stackOut_10_1 = (StringBuilder) (Object) stackIn_10_1;
              stackOut_10_2 = "{...}";
              stackIn_12_0 = stackOut_10_0;
              stackIn_12_1 = stackOut_10_1;
              stackIn_12_2 = stackOut_10_2;
              break L3;
            }
          }
          throw dd.a((Throwable) (Object) stackIn_12_0, stackIn_12_2 + 44 + param1 + 44 + param2 + 41);
        }
    }

    private final synchronized boolean a(int param0, boolean param1, int param2) {
        if (!(((ki) this).b(-1))) {
            return false;
        }
        if (!param1) {
            Object var5 = null;
            String discarded$0 = ki.a(101, (CharSequence) null);
        }
        if (param0 >= 0) {
            if (0 <= param2) {
                if (param0 < ((ki) this).field_i.field_l.length) {
                    if (((ki) this).field_i.field_l[param0] > param2) {
                        return true;
                    }
                }
            }
        }
        if (rf.field_N) {
            throw new IllegalArgumentException(param0 + " " + param2);
        }
        return false;
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        int var0 = 0;
        field_h = "Create a free Account";
        field_f = new int[256];
        for (var0 = 0; var0 < 256; var0++) {
            field_f[var0] = 256 * (var0 / 3) + var0 / 2 * 65536 + var0;
        }
        field_d = "Logging in...";
    }
}
