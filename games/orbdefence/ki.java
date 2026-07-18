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
        int var6 = 0;
        Object stackIn_2_0 = null;
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
        Object stackOut_14_0 = null;
        Object stackOut_40_0 = null;
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
                var6 = this.a(param1, -895, param2, param3) ? 1 : 0;
                if (var6 == 0) {
                  this.a(param2, 114);
                  var6 = this.a(param1, -895, param2, param3) ? 1 : 0;
                  if (var6 != 0) {
                    break L2;
                  } else {
                    stackOut_14_0 = null;
                    stackIn_15_0 = stackOut_14_0;
                    return (byte[]) (Object) stackIn_15_0;
                  }
                } else {
                  break L2;
                }
              }
              if (null != ((ki) this).field_c[param2]) {
                L4: {
                  if (((ki) this).field_c[param2][param3] != null) {
                    var5 = (Object) (Object) e.a(((ki) this).field_c[param2][param3], false, 25966);
                    if (null != var5) {
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
                stackOut_40_0 = var5;
                stackIn_41_0 = stackOut_40_0;
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
            stackOut_42_0 = var5;
            stackOut_42_1 = new StringBuilder().append("ki.A(").append(param0).append(',');
            stackIn_45_0 = stackOut_42_0;
            stackIn_45_1 = stackOut_42_1;
            stackIn_43_0 = stackOut_42_0;
            stackIn_43_1 = stackOut_42_1;
            if (param1 == null) {
              stackOut_45_0 = stackIn_45_0;
              stackOut_45_1 = (StringBuilder) (Object) stackIn_45_1;
              stackOut_45_2 = "null";
              stackIn_46_0 = stackOut_45_0;
              stackIn_46_1 = stackOut_45_1;
              stackIn_46_2 = stackOut_45_2;
              break L7;
            } else {
              stackOut_43_0 = stackIn_43_0;
              stackOut_43_1 = (StringBuilder) (Object) stackIn_43_1;
              stackOut_43_2 = "{...}";
              stackIn_46_0 = stackOut_43_0;
              stackIn_46_1 = stackOut_43_1;
              stackIn_46_2 = stackOut_43_2;
              break L7;
            }
          }
          throw dd.a((Throwable) (Object) stackIn_46_0, stackIn_46_2 + ',' + param2 + ',' + param3 + ')');
        }
        return (byte[]) (Object) stackIn_41_0;
    }

    private final synchronized void a(int param0, int param1) {
        int var3_int = 0;
        RuntimeException var3 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          L0: {
            L1: {
              L2: {
                if (((ki) this).field_g) {
                  break L2;
                } else {
                  ((ki) this).field_a[param0] = fm.a(((ki) this).field_e.a(-15861, param0), 3, false);
                  if (!OrbDefence.field_D) {
                    break L1;
                  } else {
                    break L2;
                  }
                }
              }
              ((ki) this).field_a[param0] = (Object) (Object) ((ki) this).field_e.a(-15861, param0);
              break L1;
            }
            var3_int = -85 % ((param1 - 69) / 38);
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3 = decompiledCaughtException;
          throw dd.a((Throwable) (Object) var3, "ki.U(" + param0 + ',' + param1 + ')');
        }
    }

    final boolean a(String param0, String param1, int param2) {
        int var4_int = 0;
        RuntimeException var4 = null;
        int var5 = 0;
        int stackIn_2_0 = 0;
        int stackIn_7_0 = 0;
        boolean stackIn_12_0 = false;
        RuntimeException stackIn_14_0 = null;
        StringBuilder stackIn_14_1 = null;
        RuntimeException stackIn_16_0 = null;
        StringBuilder stackIn_16_1 = null;
        RuntimeException stackIn_17_0 = null;
        StringBuilder stackIn_17_1 = null;
        String stackIn_17_2 = null;
        RuntimeException stackIn_18_0 = null;
        StringBuilder stackIn_18_1 = null;
        RuntimeException stackIn_20_0 = null;
        StringBuilder stackIn_20_1 = null;
        RuntimeException stackIn_21_0 = null;
        StringBuilder stackIn_21_1 = null;
        String stackIn_21_2 = null;
        RuntimeException decompiledCaughtException = null;
        int stackOut_6_0 = 0;
        boolean stackOut_11_0 = false;
        int stackOut_1_0 = 0;
        RuntimeException stackOut_13_0 = null;
        StringBuilder stackOut_13_1 = null;
        RuntimeException stackOut_16_0 = null;
        StringBuilder stackOut_16_1 = null;
        String stackOut_16_2 = null;
        RuntimeException stackOut_14_0 = null;
        StringBuilder stackOut_14_1 = null;
        String stackOut_14_2 = null;
        RuntimeException stackOut_17_0 = null;
        StringBuilder stackOut_17_1 = null;
        RuntimeException stackOut_20_0 = null;
        StringBuilder stackOut_20_1 = null;
        String stackOut_20_2 = null;
        RuntimeException stackOut_18_0 = null;
        StringBuilder stackOut_18_1 = null;
        String stackOut_18_2 = null;
        try {
          L0: {
            if (((ki) this).b(param2)) {
              param0 = param0.toLowerCase();
              param1 = param1.toLowerCase();
              var4_int = ((ki) this).field_i.field_o.a(sk.a((byte) 76, (CharSequence) (Object) param0), -76);
              if (!this.b(var4_int, -7720)) {
                stackOut_6_0 = 0;
                stackIn_7_0 = stackOut_6_0;
                return stackIn_7_0 != 0;
              } else {
                L1: {
                  var5 = ((ki) this).field_i.field_g[var4_int].a(sk.a((byte) 76, (CharSequence) (Object) param1), -119);
                  if (param2 == -1) {
                    break L1;
                  } else {
                    field_h = (String) ((Object[]) ((ki) this).field_a[26])[11];
                    break L1;
                  }
                }
                stackOut_11_0 = ((ki) this).a(var5, 19115, var4_int);
                stackIn_12_0 = stackOut_11_0;
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
            stackOut_13_0 = (RuntimeException) var4;
            stackOut_13_1 = new StringBuilder().append("ki.E(");
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
          L3: {
            stackOut_17_0 = (RuntimeException) (Object) stackIn_17_0;
            stackOut_17_1 = ((StringBuilder) (Object) stackIn_17_1).append(stackIn_17_2).append(',');
            stackIn_20_0 = stackOut_17_0;
            stackIn_20_1 = stackOut_17_1;
            stackIn_18_0 = stackOut_17_0;
            stackIn_18_1 = stackOut_17_1;
            if (param1 == null) {
              stackOut_20_0 = (RuntimeException) (Object) stackIn_20_0;
              stackOut_20_1 = (StringBuilder) (Object) stackIn_20_1;
              stackOut_20_2 = "null";
              stackIn_21_0 = stackOut_20_0;
              stackIn_21_1 = stackOut_20_1;
              stackIn_21_2 = stackOut_20_2;
              break L3;
            } else {
              stackOut_18_0 = (RuntimeException) (Object) stackIn_18_0;
              stackOut_18_1 = (StringBuilder) (Object) stackIn_18_1;
              stackOut_18_2 = "{...}";
              stackIn_21_0 = stackOut_18_0;
              stackIn_21_1 = stackOut_18_1;
              stackIn_21_2 = stackOut_18_2;
              break L3;
            }
          }
          throw dd.a((Throwable) (Object) stackIn_21_0, stackIn_21_2 + ',' + param2 + ')');
        }
        return stackIn_12_0;
    }

    final boolean b(byte param0, String param1) {
        int var3_int = 0;
        RuntimeException var3 = null;
        int var4 = 0;
        int stackIn_2_0 = 0;
        boolean stackIn_4_0 = false;
        RuntimeException stackIn_6_0 = null;
        StringBuilder stackIn_6_1 = null;
        RuntimeException stackIn_8_0 = null;
        StringBuilder stackIn_8_1 = null;
        RuntimeException stackIn_9_0 = null;
        StringBuilder stackIn_9_1 = null;
        String stackIn_9_2 = null;
        RuntimeException decompiledCaughtException = null;
        boolean stackOut_3_0 = false;
        int stackOut_1_0 = 0;
        RuntimeException stackOut_5_0 = null;
        StringBuilder stackOut_5_1 = null;
        RuntimeException stackOut_8_0 = null;
        StringBuilder stackOut_8_1 = null;
        String stackOut_8_2 = null;
        RuntimeException stackOut_6_0 = null;
        StringBuilder stackOut_6_1 = null;
        String stackOut_6_2 = null;
        try {
          L0: {
            var3_int = -79 % ((param0 - -5) / 55);
            if (((ki) this).b(-1)) {
              param1 = param1.toLowerCase();
              var4 = ((ki) this).field_i.field_o.a(sk.a((byte) 76, (CharSequence) (Object) param1), -107);
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
            stackOut_5_1 = new StringBuilder().append("ki.D(").append(param0).append(',');
            stackIn_8_0 = stackOut_5_0;
            stackIn_8_1 = stackOut_5_1;
            stackIn_6_0 = stackOut_5_0;
            stackIn_6_1 = stackOut_5_1;
            if (param1 == null) {
              stackOut_8_0 = (RuntimeException) (Object) stackIn_8_0;
              stackOut_8_1 = (StringBuilder) (Object) stackIn_8_1;
              stackOut_8_2 = "null";
              stackIn_9_0 = stackOut_8_0;
              stackIn_9_1 = stackOut_8_1;
              stackIn_9_2 = stackOut_8_2;
              break L1;
            } else {
              stackOut_6_0 = (RuntimeException) (Object) stackIn_6_0;
              stackOut_6_1 = (StringBuilder) (Object) stackIn_6_1;
              stackOut_6_2 = "{...}";
              stackIn_9_0 = stackOut_6_0;
              stackIn_9_1 = stackOut_6_1;
              stackIn_9_2 = stackOut_6_2;
              break L1;
            }
          }
          throw dd.a((Throwable) (Object) stackIn_9_0, stackIn_9_2 + ')');
        }
        return stackIn_4_0;
    }

    final synchronized boolean c(byte param0, int param1) {
        RuntimeException var3 = null;
        int stackIn_2_0 = 0;
        boolean stackIn_5_0 = false;
        int stackIn_10_0 = 0;
        int stackIn_13_0 = 0;
        int stackIn_15_0 = 0;
        RuntimeException decompiledCaughtException = null;
        int stackOut_9_0 = 0;
        int stackOut_14_0 = 0;
        int stackOut_12_0 = 0;
        boolean stackOut_4_0 = false;
        int stackOut_1_0 = 0;
        try {
          L0: {
            if (this.b(param1, -7720)) {
              if (param0 >= 93) {
                if (((ki) this).field_a[param1] != null) {
                  stackOut_9_0 = 1;
                  stackIn_10_0 = stackOut_9_0;
                  return stackIn_10_0 != 0;
                } else {
                  this.a(param1, -45);
                  if (null == ((ki) this).field_a[param1]) {
                    stackOut_14_0 = 0;
                    stackIn_15_0 = stackOut_14_0;
                    break L0;
                  } else {
                    stackOut_12_0 = 1;
                    stackIn_13_0 = stackOut_12_0;
                    return stackIn_13_0 != 0;
                  }
                }
              } else {
                stackOut_4_0 = ((boolean[]) ((Object[]) ((ki) this).field_a[4])[3])[1];
                stackIn_5_0 = stackOut_4_0;
                return stackIn_5_0;
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
          throw dd.a((Throwable) (Object) var3, "ki.H(" + param0 + ',' + param1 + ')');
        }
        return stackIn_15_0 != 0;
    }

    final synchronized int b(byte param0, int param1) {
        int var3_int = 0;
        RuntimeException var3 = null;
        int stackIn_2_0 = 0;
        int stackIn_7_0 = 0;
        int stackIn_9_0 = 0;
        RuntimeException decompiledCaughtException = null;
        int stackOut_6_0 = 0;
        int stackOut_8_0 = 0;
        int stackOut_1_0 = 0;
        try {
          L0: {
            if (this.b(param1, -7720)) {
              if (null != ((ki) this).field_a[param1]) {
                stackOut_6_0 = 100;
                stackIn_7_0 = stackOut_6_0;
                return stackIn_7_0;
              } else {
                var3_int = 91 % ((param0 - 25) / 52);
                stackOut_8_0 = ((ki) this).field_e.b(param1, -7362);
                stackIn_9_0 = stackOut_8_0;
                break L0;
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
          throw dd.a((Throwable) (Object) var3, "ki.P(" + param0 + ',' + param1 + ')');
        }
        return stackIn_9_0;
    }

    final int a(byte param0) {
        RuntimeException var2 = null;
        int stackIn_4_0 = 0;
        int stackIn_7_0 = 0;
        int stackIn_9_0 = 0;
        RuntimeException decompiledCaughtException = null;
        int stackOut_3_0 = 0;
        int stackOut_8_0 = 0;
        int stackOut_6_0 = 0;
        try {
          L0: {
            if (!((ki) this).b(-1)) {
              stackOut_3_0 = -1;
              stackIn_4_0 = stackOut_3_0;
              return stackIn_4_0;
            } else {
              if (param0 > 112) {
                stackOut_8_0 = ((ki) this).field_i.field_l.length;
                stackIn_9_0 = stackOut_8_0;
                break L0;
              } else {
                stackOut_6_0 = 124;
                stackIn_7_0 = stackOut_6_0;
                return stackIn_7_0;
              }
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2 = decompiledCaughtException;
          throw dd.a((Throwable) (Object) var2, "ki.Q(" + param0 + ')');
        }
        return stackIn_9_0;
    }

    final int a(byte param0, int param1) {
        RuntimeException var3 = null;
        int stackIn_4_0 = 0;
        int stackIn_7_0 = 0;
        int stackIn_9_0 = 0;
        RuntimeException decompiledCaughtException = null;
        int stackOut_3_0 = 0;
        int stackOut_8_0 = 0;
        int stackOut_6_0 = 0;
        try {
          L0: {
            if (!this.b(param1, -7720)) {
              stackOut_3_0 = 0;
              stackIn_4_0 = stackOut_3_0;
              return stackIn_4_0;
            } else {
              if (param0 >= 100) {
                stackOut_8_0 = ((ki) this).field_i.field_l[param1];
                stackIn_9_0 = stackOut_8_0;
                break L0;
              } else {
                stackOut_6_0 = 42;
                stackIn_7_0 = stackOut_6_0;
                return stackIn_7_0;
              }
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3 = decompiledCaughtException;
          throw dd.a((Throwable) (Object) var3, "ki.L(" + param0 + ',' + param1 + ')');
        }
        return stackIn_9_0;
    }

    final int a(byte param0, String param1) {
        int var3_int = 0;
        RuntimeException var3 = null;
        int var4 = 0;
        int stackIn_4_0 = 0;
        int stackIn_6_0 = 0;
        RuntimeException stackIn_8_0 = null;
        StringBuilder stackIn_8_1 = null;
        RuntimeException stackIn_10_0 = null;
        StringBuilder stackIn_10_1 = null;
        RuntimeException stackIn_11_0 = null;
        StringBuilder stackIn_11_1 = null;
        String stackIn_11_2 = null;
        RuntimeException decompiledCaughtException = null;
        int stackOut_3_0 = 0;
        int stackOut_5_0 = 0;
        RuntimeException stackOut_7_0 = null;
        StringBuilder stackOut_7_1 = null;
        RuntimeException stackOut_10_0 = null;
        StringBuilder stackOut_10_1 = null;
        String stackOut_10_2 = null;
        RuntimeException stackOut_8_0 = null;
        StringBuilder stackOut_8_1 = null;
        String stackOut_8_2 = null;
        try {
          L0: {
            var3_int = -81 / ((param0 - 32) / 58);
            if (!((ki) this).b(-1)) {
              stackOut_3_0 = 0;
              stackIn_4_0 = stackOut_3_0;
              return stackIn_4_0;
            } else {
              param1 = param1.toLowerCase();
              var4 = ((ki) this).field_i.field_o.a(sk.a((byte) 76, (CharSequence) (Object) param1), -121);
              stackOut_5_0 = ((ki) this).b((byte) -53, var4);
              stackIn_6_0 = stackOut_5_0;
              break L0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L1: {
            var3 = decompiledCaughtException;
            stackOut_7_0 = (RuntimeException) var3;
            stackOut_7_1 = new StringBuilder().append("ki.AA(").append(param0).append(',');
            stackIn_10_0 = stackOut_7_0;
            stackIn_10_1 = stackOut_7_1;
            stackIn_8_0 = stackOut_7_0;
            stackIn_8_1 = stackOut_7_1;
            if (param1 == null) {
              stackOut_10_0 = (RuntimeException) (Object) stackIn_10_0;
              stackOut_10_1 = (StringBuilder) (Object) stackIn_10_1;
              stackOut_10_2 = "null";
              stackIn_11_0 = stackOut_10_0;
              stackIn_11_1 = stackOut_10_1;
              stackIn_11_2 = stackOut_10_2;
              break L1;
            } else {
              stackOut_8_0 = (RuntimeException) (Object) stackIn_8_0;
              stackOut_8_1 = (StringBuilder) (Object) stackIn_8_1;
              stackOut_8_2 = "{...}";
              stackIn_11_0 = stackOut_8_0;
              stackIn_11_1 = stackOut_8_1;
              stackIn_11_2 = stackOut_8_2;
              break L1;
            }
          }
          throw dd.a((Throwable) (Object) stackIn_11_0, stackIn_11_2 + ')');
        }
        return stackIn_6_0;
    }

    final boolean c(byte param0, String param1) {
        int var3_int = 0;
        RuntimeException var3 = null;
        int var4 = 0;
        int stackIn_4_0 = 0;
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
        int stackOut_3_0 = 0;
        int stackOut_8_0 = 0;
        int stackOut_6_0 = 0;
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
            if (!((ki) this).b(-1)) {
              stackOut_3_0 = 0;
              stackIn_4_0 = stackOut_3_0;
              return stackIn_4_0 != 0;
            } else {
              param1 = param1.toLowerCase();
              var4 = 125 % ((param0 - 7) / 32);
              var3_int = ((ki) this).field_i.field_o.a(sk.a((byte) 76, (CharSequence) (Object) param1), -126);
              if (var3_int >= 0) {
                stackOut_8_0 = 1;
                stackIn_9_0 = stackOut_8_0;
                break L0;
              } else {
                stackOut_6_0 = 0;
                stackIn_7_0 = stackOut_6_0;
                return stackIn_7_0 != 0;
              }
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L1: {
            var3 = decompiledCaughtException;
            stackOut_10_0 = (RuntimeException) var3;
            stackOut_10_1 = new StringBuilder().append("ki.C(").append(param0).append(',');
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
          throw dd.a((Throwable) (Object) stackIn_14_0, stackIn_14_2 + ')');
        }
        return stackIn_9_0 != 0;
    }

    final byte[] b(int param0, boolean param1, int param2) {
        RuntimeException var4 = null;
        byte[] stackIn_4_0 = null;
        RuntimeException decompiledCaughtException = null;
        byte[] stackOut_3_0 = null;
        try {
          L0: {
            L1: {
              if (!param1) {
                break L1;
              } else {
                ((ki) this).field_c = null;
                break L1;
              }
            }
            stackOut_3_0 = this.a(-2, (int[]) null, param0, param2);
            stackIn_4_0 = stackOut_3_0;
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var4 = decompiledCaughtException;
          throw dd.a((Throwable) (Object) var4, "ki.S(" + param0 + ',' + param1 + ',' + param2 + ')');
        }
        return stackIn_4_0;
    }

    final synchronized int a(int param0) {
        int var2_int = 0;
        RuntimeException var2 = null;
        int var3 = 0;
        int var4 = 0;
        int var5 = 0;
        int stackIn_3_0 = 0;
        int stackIn_7_0 = 0;
        int stackIn_7_1 = 0;
        int stackIn_13_0 = 0;
        int stackIn_13_1 = 0;
        int stackIn_20_0 = 0;
        int stackIn_22_0 = 0;
        RuntimeException decompiledCaughtException = null;
        int stackOut_6_0 = 0;
        int stackOut_6_1 = 0;
        int stackOut_12_0 = 0;
        int stackOut_12_1 = 0;
        int stackOut_19_0 = 0;
        int stackOut_21_0 = 0;
        int stackOut_2_0 = 0;
        var5 = OrbDefence.field_D ? 1 : 0;
        try {
          L0: {
            if (((ki) this).b(-1)) {
              var2_int = 0;
              var3 = 0;
              var4 = 0;
              L1: while (true) {
                L2: {
                  L3: {
                    if (var4 >= ((ki) this).field_a.length) {
                      break L3;
                    } else {
                      stackOut_6_0 = 0;
                      stackOut_6_1 = ((ki) this).field_i.field_d[var4];
                      stackIn_13_0 = stackOut_6_0;
                      stackIn_13_1 = stackOut_6_1;
                      stackIn_7_0 = stackOut_6_0;
                      stackIn_7_1 = stackOut_6_1;
                      if (var5 != 0) {
                        break L2;
                      } else {
                        L4: {
                          if (stackIn_7_0 >= stackIn_7_1) {
                            break L4;
                          } else {
                            var3 = var3 + ((ki) this).b((byte) -93, var4);
                            var2_int += 100;
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
                  stackOut_12_0 = param0;
                  stackOut_12_1 = 20147;
                  stackIn_13_0 = stackOut_12_0;
                  stackIn_13_1 = stackOut_12_1;
                  break L2;
                }
                L5: {
                  if (stackIn_13_0 == stackIn_13_1) {
                    break L5;
                  } else {
                    int discarded$2 = ((ki) this).a((String) null, 33);
                    break L5;
                  }
                }
                if (var2_int == 0) {
                  stackOut_19_0 = 100;
                  stackIn_20_0 = stackOut_19_0;
                  return stackIn_20_0;
                } else {
                  var4 = var3 * 100 / var2_int;
                  stackOut_21_0 = var4;
                  stackIn_22_0 = stackOut_21_0;
                  break L0;
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
          throw dd.a((Throwable) (Object) var2, "ki.N(" + param0 + ')');
        }
        return stackIn_22_0;
    }

    final synchronized byte[] a(String param0, int param1, String param2) {
        int var4_int = 0;
        RuntimeException var4 = null;
        int var5 = 0;
        Object stackIn_2_0 = null;
        Object stackIn_5_0 = null;
        Object stackIn_10_0 = null;
        byte[] stackIn_12_0 = null;
        RuntimeException stackIn_14_0 = null;
        StringBuilder stackIn_14_1 = null;
        RuntimeException stackIn_16_0 = null;
        StringBuilder stackIn_16_1 = null;
        RuntimeException stackIn_17_0 = null;
        StringBuilder stackIn_17_1 = null;
        String stackIn_17_2 = null;
        RuntimeException stackIn_18_0 = null;
        StringBuilder stackIn_18_1 = null;
        RuntimeException stackIn_20_0 = null;
        StringBuilder stackIn_20_1 = null;
        RuntimeException stackIn_21_0 = null;
        StringBuilder stackIn_21_1 = null;
        String stackIn_21_2 = null;
        RuntimeException decompiledCaughtException = null;
        Object stackOut_9_0 = null;
        byte[] stackOut_11_0 = null;
        Object stackOut_4_0 = null;
        Object stackOut_1_0 = null;
        RuntimeException stackOut_13_0 = null;
        StringBuilder stackOut_13_1 = null;
        RuntimeException stackOut_16_0 = null;
        StringBuilder stackOut_16_1 = null;
        String stackOut_16_2 = null;
        RuntimeException stackOut_14_0 = null;
        StringBuilder stackOut_14_1 = null;
        String stackOut_14_2 = null;
        RuntimeException stackOut_17_0 = null;
        StringBuilder stackOut_17_1 = null;
        RuntimeException stackOut_20_0 = null;
        StringBuilder stackOut_20_1 = null;
        String stackOut_20_2 = null;
        RuntimeException stackOut_18_0 = null;
        StringBuilder stackOut_18_1 = null;
        String stackOut_18_2 = null;
        try {
          L0: {
            if (((ki) this).b(-1)) {
              if (param1 == 1) {
                param2 = param2.toLowerCase();
                param0 = param0.toLowerCase();
                var4_int = ((ki) this).field_i.field_o.a(sk.a((byte) 76, (CharSequence) (Object) param2), -80);
                if (!this.b(var4_int, param1 + -7721)) {
                  stackOut_9_0 = null;
                  stackIn_10_0 = stackOut_9_0;
                  return (byte[]) (Object) stackIn_10_0;
                } else {
                  var5 = ((ki) this).field_i.field_g[var4_int].a(sk.a((byte) 76, (CharSequence) (Object) param0), -87);
                  stackOut_11_0 = ((ki) this).b(var4_int, false, var5);
                  stackIn_12_0 = stackOut_11_0;
                  break L0;
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
            stackOut_13_0 = (RuntimeException) var4;
            stackOut_13_1 = new StringBuilder().append("ki.M(");
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
              break L1;
            } else {
              stackOut_14_0 = (RuntimeException) (Object) stackIn_14_0;
              stackOut_14_1 = (StringBuilder) (Object) stackIn_14_1;
              stackOut_14_2 = "{...}";
              stackIn_17_0 = stackOut_14_0;
              stackIn_17_1 = stackOut_14_1;
              stackIn_17_2 = stackOut_14_2;
              break L1;
            }
          }
          L2: {
            stackOut_17_0 = (RuntimeException) (Object) stackIn_17_0;
            stackOut_17_1 = ((StringBuilder) (Object) stackIn_17_1).append(stackIn_17_2).append(',').append(param1).append(',');
            stackIn_20_0 = stackOut_17_0;
            stackIn_20_1 = stackOut_17_1;
            stackIn_18_0 = stackOut_17_0;
            stackIn_18_1 = stackOut_17_1;
            if (param2 == null) {
              stackOut_20_0 = (RuntimeException) (Object) stackIn_20_0;
              stackOut_20_1 = (StringBuilder) (Object) stackIn_20_1;
              stackOut_20_2 = "null";
              stackIn_21_0 = stackOut_20_0;
              stackIn_21_1 = stackOut_20_1;
              stackIn_21_2 = stackOut_20_2;
              break L2;
            } else {
              stackOut_18_0 = (RuntimeException) (Object) stackIn_18_0;
              stackOut_18_1 = (StringBuilder) (Object) stackIn_18_1;
              stackOut_18_2 = "{...}";
              stackIn_21_0 = stackOut_18_0;
              stackIn_21_1 = stackOut_18_1;
              stackIn_21_2 = stackOut_18_2;
              break L2;
            }
          }
          throw dd.a((Throwable) (Object) stackIn_21_0, stackIn_21_2 + ')');
        }
        return stackIn_12_0;
    }

    final synchronized boolean b(int param0) {
        RuntimeException var2 = null;
        int stackIn_2_0 = 0;
        int stackIn_10_0 = 0;
        int stackIn_13_0 = 0;
        RuntimeException decompiledCaughtException = null;
        int stackOut_9_0 = 0;
        int stackOut_12_0 = 0;
        int stackOut_1_0 = 0;
        try {
          L0: {
            if (param0 == -1) {
              L1: {
                if (null != ((ki) this).field_i) {
                  break L1;
                } else {
                  ((ki) this).field_i = ((ki) this).field_e.a(-23879);
                  if (null == ((ki) this).field_i) {
                    stackOut_9_0 = 0;
                    stackIn_10_0 = stackOut_9_0;
                    return stackIn_10_0 != 0;
                  } else {
                    ((ki) this).field_c = new Object[((ki) this).field_i.field_s][];
                    ((ki) this).field_a = new Object[((ki) this).field_i.field_s];
                    break L1;
                  }
                }
              }
              stackOut_12_0 = 1;
              stackIn_13_0 = stackOut_12_0;
              break L0;
            } else {
              stackOut_1_0 = 1;
              stackIn_2_0 = stackOut_1_0;
              return stackIn_2_0 != 0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2 = decompiledCaughtException;
          throw dd.a((Throwable) (Object) var2, "ki.B(" + param0 + ')');
        }
        return stackIn_13_0 != 0;
    }

    final synchronized boolean a(int param0, int param1, int param2) {
        RuntimeException var4 = null;
        int stackIn_2_0 = 0;
        int stackIn_8_0 = 0;
        int stackIn_11_0 = 0;
        boolean stackIn_14_0 = false;
        int stackIn_17_0 = 0;
        int stackIn_19_0 = 0;
        RuntimeException decompiledCaughtException = null;
        int stackOut_7_0 = 0;
        int stackOut_18_0 = 0;
        int stackOut_16_0 = 0;
        boolean stackOut_13_0 = false;
        int stackOut_10_0 = 0;
        int stackOut_1_0 = 0;
        try {
          L0: {
            if (this.a(param2, true, param0)) {
              L1: {
                if (((ki) this).field_c[param2] == null) {
                  break L1;
                } else {
                  if (null == ((ki) this).field_c[param2][param0]) {
                    break L1;
                  } else {
                    stackOut_7_0 = 1;
                    stackIn_8_0 = stackOut_7_0;
                    return stackIn_8_0 != 0;
                  }
                }
              }
              if (((ki) this).field_a[param2] == null) {
                if (param1 == 19115) {
                  this.a(param2, -74);
                  if (((ki) this).field_a[param2] == null) {
                    stackOut_18_0 = 0;
                    stackIn_19_0 = stackOut_18_0;
                    break L0;
                  } else {
                    stackOut_16_0 = 1;
                    stackIn_17_0 = stackOut_16_0;
                    return stackIn_17_0 != 0;
                  }
                } else {
                  stackOut_13_0 = ((boolean[]) ((ki) this).field_a[0])[13];
                  stackIn_14_0 = stackOut_13_0;
                  return stackIn_14_0;
                }
              } else {
                stackOut_10_0 = 1;
                stackIn_11_0 = stackOut_10_0;
                return stackIn_11_0 != 0;
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
          throw dd.a((Throwable) (Object) var4, "ki.F(" + param0 + ',' + param1 + ',' + param2 + ')');
        }
        return stackIn_19_0 != 0;
    }

    final static boolean d(int param0) {
        RuntimeException var1 = null;
        boolean stackIn_4_0 = false;
        RuntimeException decompiledCaughtException = null;
        boolean stackOut_3_0 = false;
        try {
          L0: {
            L1: {
              if (param0 < -92) {
                break L1;
              } else {
                field_d = null;
                break L1;
              }
            }
            stackOut_3_0 = ec.k(783);
            stackIn_4_0 = stackOut_3_0;
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var1 = decompiledCaughtException;
          throw dd.a((Throwable) (Object) var1, "ki.K(" + param0 + ')');
        }
        return stackIn_4_0;
    }

    final static String a(int param0, CharSequence param1) {
        RuntimeException var2 = null;
        String stackIn_4_0 = null;
        RuntimeException stackIn_6_0 = null;
        StringBuilder stackIn_6_1 = null;
        RuntimeException stackIn_8_0 = null;
        StringBuilder stackIn_8_1 = null;
        RuntimeException stackIn_9_0 = null;
        StringBuilder stackIn_9_1 = null;
        String stackIn_9_2 = null;
        RuntimeException decompiledCaughtException = null;
        String stackOut_3_0 = null;
        RuntimeException stackOut_5_0 = null;
        StringBuilder stackOut_5_1 = null;
        RuntimeException stackOut_8_0 = null;
        StringBuilder stackOut_8_1 = null;
        String stackOut_8_2 = null;
        RuntimeException stackOut_6_0 = null;
        StringBuilder stackOut_6_1 = null;
        String stackOut_6_2 = null;
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
            stackOut_3_0 = fi.a(1, param1, false);
            stackIn_4_0 = stackOut_3_0;
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L2: {
            var2 = decompiledCaughtException;
            stackOut_5_0 = (RuntimeException) var2;
            stackOut_5_1 = new StringBuilder().append("ki.R(").append(param0).append(',');
            stackIn_8_0 = stackOut_5_0;
            stackIn_8_1 = stackOut_5_1;
            stackIn_6_0 = stackOut_5_0;
            stackIn_6_1 = stackOut_5_1;
            if (param1 == null) {
              stackOut_8_0 = (RuntimeException) (Object) stackIn_8_0;
              stackOut_8_1 = (StringBuilder) (Object) stackIn_8_1;
              stackOut_8_2 = "null";
              stackIn_9_0 = stackOut_8_0;
              stackIn_9_1 = stackOut_8_1;
              stackIn_9_2 = stackOut_8_2;
              break L2;
            } else {
              stackOut_6_0 = (RuntimeException) (Object) stackIn_6_0;
              stackOut_6_1 = (StringBuilder) (Object) stackIn_6_1;
              stackOut_6_2 = "{...}";
              stackIn_9_0 = stackOut_6_0;
              stackIn_9_1 = stackOut_6_1;
              stackIn_9_2 = stackOut_6_2;
              break L2;
            }
          }
          throw dd.a((Throwable) (Object) stackIn_9_0, stackIn_9_2 + ')');
        }
        return stackIn_4_0;
    }

    private final synchronized boolean a(int[] param0, int param1, int param2, int param3) {
        RuntimeException var5 = null;
        int var5_int = 0;
        int[] var6 = null;
        Object[] var7 = null;
        int var8 = 0;
        Object[] var9 = null;
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
        int stackIn_3_0 = 0;
        int stackIn_8_0 = 0;
        int[] stackIn_16_0 = null;
        int stackIn_30_0 = 0;
        int[] stackIn_32_0 = null;
        int stackIn_49_0 = 0;
        RuntimeException stackIn_53_0 = null;
        StringBuilder stackIn_53_1 = null;
        RuntimeException stackIn_55_0 = null;
        StringBuilder stackIn_55_1 = null;
        RuntimeException stackIn_56_0 = null;
        StringBuilder stackIn_56_1 = null;
        int stackIn_56_2 = 0;
        int stackIn_68_0 = 0;
        int stackIn_77_0 = 0;
        int stackIn_87_0 = 0;
        int stackIn_96_0 = 0;
        int stackIn_115_0 = 0;
        int stackIn_129_0 = 0;
        int stackIn_133_0 = 0;
        int stackIn_137_0 = 0;
        int stackIn_163_0 = 0;
        RuntimeException stackIn_165_0 = null;
        StringBuilder stackIn_165_1 = null;
        RuntimeException stackIn_167_0 = null;
        StringBuilder stackIn_167_1 = null;
        RuntimeException stackIn_168_0 = null;
        StringBuilder stackIn_168_1 = null;
        String stackIn_168_2 = null;
        RuntimeException decompiledCaughtException = null;
        int stackOut_7_0 = 0;
        int[] stackOut_15_0 = null;
        int[] stackOut_31_0 = null;
        int stackOut_29_0 = 0;
        RuntimeException stackOut_52_0 = null;
        StringBuilder stackOut_52_1 = null;
        RuntimeException stackOut_55_0 = null;
        StringBuilder stackOut_55_1 = null;
        int stackOut_55_2 = 0;
        RuntimeException stackOut_53_0 = null;
        StringBuilder stackOut_53_1 = null;
        int stackOut_53_2 = 0;
        int stackOut_67_0 = 0;
        int stackOut_76_0 = 0;
        int stackOut_86_0 = 0;
        int stackOut_95_0 = 0;
        int stackOut_114_0 = 0;
        int stackOut_128_0 = 0;
        int stackOut_132_0 = 0;
        int stackOut_136_0 = 0;
        int stackOut_162_0 = 0;
        int stackOut_48_0 = 0;
        int stackOut_2_0 = 0;
        RuntimeException stackOut_164_0 = null;
        StringBuilder stackOut_164_1 = null;
        RuntimeException stackOut_167_0 = null;
        StringBuilder stackOut_167_1 = null;
        String stackOut_167_2 = null;
        RuntimeException stackOut_165_0 = null;
        StringBuilder stackOut_165_1 = null;
        String stackOut_165_2 = null;
        var22 = OrbDefence.field_D ? 1 : 0;
        try {
          L0: {
            if (this.b(param2, -7720)) {
              if (((ki) this).field_a[param2] == null) {
                stackOut_7_0 = 0;
                stackIn_8_0 = stackOut_7_0;
                return stackIn_8_0 != 0;
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
                        stackOut_15_0 = (int[]) var6;
                        stackIn_32_0 = stackOut_15_0;
                        stackIn_16_0 = stackOut_15_0;
                        if (var22 != 0) {
                          break L3;
                        } else {
                          L5: {
                            L6: {
                              if (stackIn_16_0 == null) {
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
                      stackOut_31_0 = (int[]) param0;
                      stackIn_32_0 = stackOut_31_0;
                      break L3;
                    } else {
                      stackOut_29_0 = 1;
                      stackIn_30_0 = stackOut_29_0;
                      return stackIn_30_0 != 0;
                    }
                  }
                  L8: {
                    L9: {
                      if (stackIn_32_0 == null) {
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
                        var10_array = nf.a(var9_array, param1 ^ 895);
                        break L11;
                      }
                    } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
                      decompiledCaughtException = decompiledCaughtParameter0;
                      L12: {
                        var11_ref_RuntimeException = decompiledCaughtException;
                        stackOut_52_0 = (RuntimeException) var11_ref_RuntimeException;
                        stackOut_52_1 = new StringBuilder();
                        stackIn_55_0 = stackOut_52_0;
                        stackIn_55_1 = stackOut_52_1;
                        stackIn_53_0 = stackOut_52_0;
                        stackIn_53_1 = stackOut_52_1;
                        if (null == param0) {
                          stackOut_55_0 = (RuntimeException) (Object) stackIn_55_0;
                          stackOut_55_1 = (StringBuilder) (Object) stackIn_55_1;
                          stackOut_55_2 = 0;
                          stackIn_56_0 = stackOut_55_0;
                          stackIn_56_1 = stackOut_55_1;
                          stackIn_56_2 = stackOut_55_2;
                          break L12;
                        } else {
                          stackOut_53_0 = (RuntimeException) (Object) stackIn_53_0;
                          stackOut_53_1 = (StringBuilder) (Object) stackIn_53_1;
                          stackOut_53_2 = 1;
                          stackIn_56_0 = stackOut_53_0;
                          stackIn_56_1 = stackOut_53_1;
                          stackIn_56_2 = stackOut_53_2;
                          break L12;
                        }
                      }
                      throw dd.a((Throwable) (Object) stackIn_56_0, (stackIn_56_2 != 0) + " " + param2 + " " + var9_array.length + " " + eg.a(var9_array, 0, var9_array.length) + " " + eg.a(var9_array, 0, var9_array.length + -2) + " " + ((ki) this).field_i.field_r[param2] + " " + ((ki) this).field_i.field_p);
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
                                var11 = var10_array.length;
                                var11--;
                                var12 = var10_array[var11] & 255;
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
                                        stackOut_67_0 = 0;
                                        stackIn_77_0 = stackOut_67_0;
                                        stackIn_68_0 = stackOut_67_0;
                                        if (var22 != 0) {
                                          break L19;
                                        } else {
                                          var17 = stackIn_68_0;
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
                                    stackOut_76_0 = var5_int;
                                    stackIn_77_0 = stackOut_76_0;
                                    break L19;
                                  }
                                  var15_ref_byte____ = new byte[stackIn_77_0][];
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
                                            stackOut_86_0 = 0;
                                            stackIn_96_0 = stackOut_86_0;
                                            stackIn_87_0 = stackOut_86_0;
                                            if (var22 != 0) {
                                              break L28;
                                            } else {
                                              var19 = stackIn_87_0;
                                              L30: while (true) {
                                                L31: {
                                                  L32: {
                                                    if (~var5_int >= ~var19) {
                                                      break L32;
                                                    } else {
                                                      var18 = var18 + var13.l(0);
                                                      mk.a(var10_array, var16_int, var15_ref_byte____[var19], var14_ref_int__[var19], var18);
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
                                        stackOut_95_0 = 0;
                                        stackIn_96_0 = stackOut_95_0;
                                        break L28;
                                      }
                                      var17 = stackIn_96_0;
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
                            var11 = var10_array.length;
                            var11--;
                            var12 = var10_array[var11] & 255;
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
                                    stackOut_114_0 = 0;
                                    stackIn_129_0 = stackOut_114_0;
                                    stackIn_115_0 = stackOut_114_0;
                                    if (var22 != 0) {
                                      break L40;
                                    } else {
                                      var18 = stackIn_115_0;
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
                                                    if (null == var6) {
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
                                stackOut_128_0 = ~var14;
                                stackIn_129_0 = stackOut_128_0;
                                break L40;
                              }
                              if (stackIn_129_0 == -1) {
                                stackOut_132_0 = 1;
                                stackIn_133_0 = stackOut_132_0;
                                return stackIn_133_0 != 0;
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
                                      stackOut_136_0 = 0;
                                      stackIn_163_0 = stackOut_136_0;
                                      stackIn_137_0 = stackOut_136_0;
                                      if (var22 != 0) {
                                        break L14;
                                      } else {
                                        var20 = stackIn_137_0;
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
                                                      if (null == var6) {
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
                          if (((ki) this).field_b != 0) {
                            break L58;
                          } else {
                            var7[var11] = fm.a(var10_array, gi.a(param1, -894), false);
                            if (var22 == 0) {
                              break L15;
                            } else {
                              break L58;
                            }
                          }
                        }
                        var7[var11] = (Object) (Object) var10_array;
                        break L15;
                      }
                      stackOut_162_0 = 1;
                      stackIn_163_0 = stackOut_162_0;
                      break L14;
                    }
                    break L0;
                  } else {
                    stackOut_48_0 = 0;
                    stackIn_49_0 = stackOut_48_0;
                    return stackIn_49_0 != 0;
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
            stackOut_164_0 = (RuntimeException) var5;
            stackOut_164_1 = new StringBuilder().append("ki.BA(");
            stackIn_167_0 = stackOut_164_0;
            stackIn_167_1 = stackOut_164_1;
            stackIn_165_0 = stackOut_164_0;
            stackIn_165_1 = stackOut_164_1;
            if (param0 == null) {
              stackOut_167_0 = (RuntimeException) (Object) stackIn_167_0;
              stackOut_167_1 = (StringBuilder) (Object) stackIn_167_1;
              stackOut_167_2 = "null";
              stackIn_168_0 = stackOut_167_0;
              stackIn_168_1 = stackOut_167_1;
              stackIn_168_2 = stackOut_167_2;
              break L59;
            } else {
              stackOut_165_0 = (RuntimeException) (Object) stackIn_165_0;
              stackOut_165_1 = (StringBuilder) (Object) stackIn_165_1;
              stackOut_165_2 = "{...}";
              stackIn_168_0 = stackOut_165_0;
              stackIn_168_1 = stackOut_165_1;
              stackIn_168_2 = stackOut_165_2;
              break L59;
            }
          }
          throw dd.a((Throwable) (Object) stackIn_168_0, stackIn_168_2 + ',' + param1 + ',' + param2 + ',' + param3 + ')');
        }
        return stackIn_163_0 != 0;
    }

    public static void a(boolean param0) {
        field_h = null;
        if (param0) {
            return;
        }
        try {
            field_d = null;
            field_f = null;
        } catch (RuntimeException runtimeException) {
            throw dd.a((Throwable) (Object) runtimeException, "ki.G(" + param0 + ')');
        }
    }

    final synchronized byte[] a(int param0, boolean param1) {
        RuntimeException var3 = null;
        Object stackIn_4_0 = null;
        byte[] stackIn_9_0 = null;
        Object stackIn_15_0 = null;
        Object stackIn_18_0 = null;
        int stackIn_18_1 = 0;
        Object stackIn_20_0 = null;
        int stackIn_20_1 = 0;
        Object stackIn_22_0 = null;
        int stackIn_22_1 = 0;
        Object stackIn_23_0 = null;
        int stackIn_23_1 = 0;
        int stackIn_23_2 = 0;
        byte[] stackIn_24_0 = null;
        RuntimeException decompiledCaughtException = null;
        Object stackOut_3_0 = null;
        byte[] stackOut_8_0 = null;
        Object stackOut_17_0 = null;
        int stackOut_17_1 = 0;
        Object stackOut_22_0 = null;
        int stackOut_22_1 = 0;
        int stackOut_22_2 = 0;
        Object stackOut_18_0 = null;
        int stackOut_18_1 = 0;
        Object stackOut_20_0 = null;
        int stackOut_20_1 = 0;
        int stackOut_20_2 = 0;
        byte[] stackOut_23_0 = null;
        Object stackOut_14_0 = null;
        try {
          if (!((ki) this).b(-1)) {
            stackOut_3_0 = null;
            stackIn_4_0 = stackOut_3_0;
            return (byte[]) (Object) stackIn_4_0;
          } else {
            if (((ki) this).field_i.field_l.length == 1) {
              stackOut_8_0 = ((ki) this).b(0, false, param0);
              stackIn_9_0 = stackOut_8_0;
              return stackIn_9_0;
            } else {
              L0: {
                if (param1) {
                  break L0;
                } else {
                  field_f = (int[]) ((ki) this).field_a[5];
                  break L0;
                }
              }
              if (this.b(param0, -7720)) {
                if (1 != ((ki) this).field_i.field_l[param0]) {
                  throw new RuntimeException();
                } else {
                  L1: {
                    stackOut_17_0 = this;
                    stackOut_17_1 = param0;
                    stackIn_22_0 = stackOut_17_0;
                    stackIn_22_1 = stackOut_17_1;
                    stackIn_18_0 = stackOut_17_0;
                    stackIn_18_1 = stackOut_17_1;
                    if (param1) {
                      stackOut_22_0 = this;
                      stackOut_22_1 = stackIn_22_1;
                      stackOut_22_2 = 0;
                      stackIn_23_0 = stackOut_22_0;
                      stackIn_23_1 = stackOut_22_1;
                      stackIn_23_2 = stackOut_22_2;
                      break L1;
                    } else {
                      stackOut_18_0 = this;
                      stackOut_18_1 = stackIn_18_1;
                      stackIn_20_0 = stackOut_18_0;
                      stackIn_20_1 = stackOut_18_1;
                      stackOut_20_0 = this;
                      stackOut_20_1 = stackIn_20_1;
                      stackOut_20_2 = 1;
                      stackIn_23_0 = stackOut_20_0;
                      stackIn_23_1 = stackOut_20_1;
                      stackIn_23_2 = stackOut_20_2;
                      break L1;
                    }
                  }
                  stackOut_23_0 = ((ki) this).b(stackIn_23_1, stackIn_23_2 != 0, 0);
                  stackIn_24_0 = stackOut_23_0;
                  return stackIn_24_0;
                }
              } else {
                stackOut_14_0 = null;
                stackIn_15_0 = stackOut_14_0;
                return (byte[]) (Object) stackIn_15_0;
              }
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3 = decompiledCaughtException;
          throw dd.a((Throwable) (Object) var3, "ki.O(" + param0 + ',' + param1 + ')');
        }
    }

    final int a(String param0, int param1, int param2) {
        int var4_int = 0;
        RuntimeException var4 = null;
        int stackIn_7_0 = 0;
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
        int stackOut_6_0 = 0;
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
            L1: {
              if (param1 == 5187) {
                break L1;
              } else {
                int discarded$2 = ((ki) this).a((byte) 121);
                break L1;
              }
            }
            if (!this.b(param2, -7720)) {
              stackOut_6_0 = -1;
              stackIn_7_0 = stackOut_6_0;
              return stackIn_7_0;
            } else {
              param0 = param0.toLowerCase();
              var4_int = ((ki) this).field_i.field_g[param2].a(sk.a((byte) 76, (CharSequence) (Object) param0), -109);
              if (this.a(param2, true, var4_int)) {
                stackOut_11_0 = var4_int;
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
            var4 = decompiledCaughtException;
            stackOut_13_0 = (RuntimeException) var4;
            stackOut_13_1 = new StringBuilder().append("ki.J(");
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
          throw dd.a((Throwable) (Object) stackIn_17_0, stackIn_17_2 + ',' + param1 + ',' + param2 + ')');
        }
        return stackIn_12_0;
    }

    private final synchronized boolean b(int param0, int param1) {
        RuntimeException var3 = null;
        int stackIn_2_0 = 0;
        int stackIn_5_0 = 0;
        int stackIn_17_0 = 0;
        int stackIn_20_0 = 0;
        RuntimeException decompiledCaughtException = null;
        int stackOut_19_0 = 0;
        int stackOut_16_0 = 0;
        int stackOut_4_0 = 0;
        int stackOut_1_0 = 0;
        try {
          L0: {
            if (((ki) this).b(param1 + 7719)) {
              if (param1 == -7720) {
                L1: {
                  if (0 > param0) {
                    break L1;
                  } else {
                    if (~((ki) this).field_i.field_l.length >= ~param0) {
                      break L1;
                    } else {
                      if (((ki) this).field_i.field_l[param0] != 0) {
                        stackOut_19_0 = 1;
                        stackIn_20_0 = stackOut_19_0;
                        break L0;
                      } else {
                        break L1;
                      }
                    }
                  }
                }
                if (rf.field_N) {
                  throw new IllegalArgumentException(Integer.toString(param0));
                } else {
                  stackOut_16_0 = 0;
                  stackIn_17_0 = stackOut_16_0;
                  return stackIn_17_0 != 0;
                }
              } else {
                stackOut_4_0 = 1;
                stackIn_5_0 = stackOut_4_0;
                return stackIn_5_0 != 0;
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
          throw dd.a((Throwable) (Object) var3, "ki.W(" + param0 + ',' + param1 + ')');
        }
        return stackIn_20_0 != 0;
    }

    final int a(String param0, int param1) {
        int var3_int = 0;
        RuntimeException var3 = null;
        int stackIn_2_0 = 0;
        int stackIn_7_0 = 0;
        int stackIn_12_0 = 0;
        RuntimeException stackIn_14_0 = null;
        StringBuilder stackIn_14_1 = null;
        RuntimeException stackIn_16_0 = null;
        StringBuilder stackIn_16_1 = null;
        RuntimeException stackIn_17_0 = null;
        StringBuilder stackIn_17_1 = null;
        String stackIn_17_2 = null;
        RuntimeException decompiledCaughtException = null;
        int stackOut_6_0 = 0;
        int stackOut_11_0 = 0;
        int stackOut_1_0 = 0;
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
            if (((ki) this).b(-1)) {
              param0 = param0.toLowerCase();
              var3_int = ((ki) this).field_i.field_o.a(sk.a((byte) 76, (CharSequence) (Object) param0), -73);
              if (!this.b(var3_int, param1 + -7720)) {
                stackOut_6_0 = -1;
                stackIn_7_0 = stackOut_6_0;
                return stackIn_7_0;
              } else {
                L1: {
                  if (param1 == 0) {
                    break L1;
                  } else {
                    ((int[]) ((Object[]) ((ki) this).field_a[0])[2])[9] = ((int[]) ((ki) this).field_a[1])[5];
                    break L1;
                  }
                }
                stackOut_11_0 = var3_int;
                stackIn_12_0 = stackOut_11_0;
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
            stackOut_13_0 = (RuntimeException) var3;
            stackOut_13_1 = new StringBuilder().append("ki.I(");
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
          throw dd.a((Throwable) (Object) stackIn_17_0, stackIn_17_2 + ',' + param1 + ')');
        }
        return stackIn_12_0;
    }

    final synchronized boolean c(int param0) {
        int var2_int = 0;
        RuntimeException var2 = null;
        int var3 = 0;
        int var4 = 0;
        int var5 = 0;
        int stackIn_3_0 = 0;
        int stackIn_19_0 = 0;
        int stackIn_21_0 = 0;
        RuntimeException decompiledCaughtException = null;
        int stackOut_18_0 = 0;
        int stackOut_20_0 = 0;
        int stackOut_2_0 = 0;
        var5 = OrbDefence.field_D ? 1 : 0;
        try {
          L0: {
            if (((ki) this).b(-1)) {
              var2_int = 1;
              var3 = 0;
              L1: while (true) {
                L2: {
                  L3: {
                    if (var3 >= ((ki) this).field_i.field_c.length) {
                      break L3;
                    } else {
                      var4 = ((ki) this).field_i.field_c[var3];
                      if (var5 != 0) {
                        break L2;
                      } else {
                        L4: {
                          if (null != ((ki) this).field_a[var4]) {
                            break L4;
                          } else {
                            this.a(var4, param0 ^ -7726);
                            if (null == ((ki) this).field_a[var4]) {
                              var2_int = 0;
                              break L4;
                            } else {
                              break L4;
                            }
                          }
                        }
                        var3++;
                        if (var5 == 0) {
                          continue L1;
                        } else {
                          break L3;
                        }
                      }
                    }
                  }
                  if (param0 == 7715) {
                    break L2;
                  } else {
                    stackOut_18_0 = 1;
                    stackIn_19_0 = stackOut_18_0;
                    return stackIn_19_0 != 0;
                  }
                }
                stackOut_20_0 = var2_int;
                stackIn_21_0 = stackOut_20_0;
                break L0;
              }
            } else {
              stackOut_2_0 = 0;
              stackIn_3_0 = stackOut_2_0;
              return stackIn_3_0 != 0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2 = decompiledCaughtException;
          throw dd.a((Throwable) (Object) var2, "ki.V(" + param0 + ')');
        }
        return stackIn_21_0 != 0;
    }

    ki(jl param0, boolean param1, int param2) {
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
        ((ki) this).field_i = null;
        try {
          L0: {
            L1: {
              if (param2 < 0) {
                break L1;
              } else {
                if (param2 <= 2) {
                  ((ki) this).field_b = param2;
                  ((ki) this).field_g = param1;
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
          L2: {
            runtimeException = decompiledCaughtException;
            stackOut_7_0 = (RuntimeException) runtimeException;
            stackOut_7_1 = new StringBuilder().append("ki.<init>(");
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
          throw dd.a((Throwable) (Object) stackIn_11_0, stackIn_11_2 + ',' + param1 + ',' + param2 + ')');
        }
    }

    private final synchronized boolean a(int param0, boolean param1, int param2) {
        RuntimeException var4 = null;
        int stackIn_4_0 = 0;
        int stackIn_24_0 = 0;
        int stackIn_26_0 = 0;
        RuntimeException decompiledCaughtException = null;
        int stackOut_3_0 = 0;
        int stackOut_25_0 = 0;
        int stackOut_23_0 = 0;
        try {
          L0: {
            if (!((ki) this).b(-1)) {
              stackOut_3_0 = 0;
              stackIn_4_0 = stackOut_3_0;
              return stackIn_4_0 != 0;
            } else {
              L1: {
                if (param1) {
                  break L1;
                } else {
                  String discarded$2 = ki.a(101, (CharSequence) null);
                  break L1;
                }
              }
              L2: {
                if (param0 < 0) {
                  break L2;
                } else {
                  if (0 > param2) {
                    break L2;
                  } else {
                    if (param0 >= ((ki) this).field_i.field_l.length) {
                      break L2;
                    } else {
                      if (((ki) this).field_i.field_l[param0] <= param2) {
                        break L2;
                      } else {
                        stackOut_25_0 = 1;
                        stackIn_26_0 = stackOut_25_0;
                        break L0;
                      }
                    }
                  }
                }
              }
              if (!rf.field_N) {
                stackOut_23_0 = 0;
                stackIn_24_0 = stackOut_23_0;
                return stackIn_24_0 != 0;
              } else {
                throw new IllegalArgumentException(param0 + " " + param2);
              }
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var4 = decompiledCaughtException;
          throw dd.a((Throwable) (Object) var4, "ki.T(" + param0 + ',' + param1 + ',' + param2 + ')');
        }
        return stackIn_26_0 != 0;
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        int var0 = 0;
        field_h = "Create a free Account";
        field_f = new int[256];
        var0 = 0;
        L0: while (true) {
          if (var0 >= 256) {
            field_d = "Logging in...";
            return;
          } else {
            field_f[var0] = 256 * (var0 / 3) + var0 / 2 * 65536 + var0;
            var0++;
            continue L0;
          }
        }
    }
}
