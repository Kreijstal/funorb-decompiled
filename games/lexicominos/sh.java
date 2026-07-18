/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class sh {
    static nj[] field_d;
    private e field_g;
    private hf field_h;
    static int field_a;
    private boolean field_i;
    static int field_e;
    static int field_f;
    private int field_c;
    private Object[][] field_b;
    private Object[] field_j;

    final int c(String param0, byte param1) {
        int var3_int = 0;
        RuntimeException var3 = null;
        int stackIn_4_0 = 0;
        int stackIn_7_0 = 0;
        int stackIn_12_0 = 0;
        int stackIn_14_0 = 0;
        RuntimeException stackIn_16_0 = null;
        StringBuilder stackIn_16_1 = null;
        RuntimeException stackIn_18_0 = null;
        StringBuilder stackIn_18_1 = null;
        RuntimeException stackIn_19_0 = null;
        StringBuilder stackIn_19_1 = null;
        String stackIn_19_2 = null;
        RuntimeException decompiledCaughtException = null;
        int stackOut_3_0 = 0;
        int stackOut_11_0 = 0;
        int stackOut_13_0 = 0;
        int stackOut_6_0 = 0;
        RuntimeException stackOut_15_0 = null;
        StringBuilder stackOut_15_1 = null;
        RuntimeException stackOut_18_0 = null;
        StringBuilder stackOut_18_1 = null;
        String stackOut_18_2 = null;
        RuntimeException stackOut_16_0 = null;
        StringBuilder stackOut_16_1 = null;
        String stackOut_16_2 = null;
        try {
          L0: {
            if (!((sh) this).c(81)) {
              stackOut_3_0 = -1;
              stackIn_4_0 = stackOut_3_0;
              return stackIn_4_0;
            } else {
              param0 = param0.toLowerCase();
              var3_int = ((sh) this).field_g.field_b.a(-20075, na.a(1048576, (CharSequence) (Object) param0));
              if (param1 == -89) {
                if (!this.b(var3_int, 127)) {
                  stackOut_11_0 = -1;
                  stackIn_12_0 = stackOut_11_0;
                  return stackIn_12_0;
                } else {
                  stackOut_13_0 = var3_int;
                  stackIn_14_0 = stackOut_13_0;
                  break L0;
                }
              } else {
                stackOut_6_0 = -87;
                stackIn_7_0 = stackOut_6_0;
                return stackIn_7_0;
              }
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L1: {
            var3 = decompiledCaughtException;
            stackOut_15_0 = (RuntimeException) var3;
            stackOut_15_1 = new StringBuilder().append("sh.V(");
            stackIn_18_0 = stackOut_15_0;
            stackIn_18_1 = stackOut_15_1;
            stackIn_16_0 = stackOut_15_0;
            stackIn_16_1 = stackOut_15_1;
            if (param0 == null) {
              stackOut_18_0 = (RuntimeException) (Object) stackIn_18_0;
              stackOut_18_1 = (StringBuilder) (Object) stackIn_18_1;
              stackOut_18_2 = "null";
              stackIn_19_0 = stackOut_18_0;
              stackIn_19_1 = stackOut_18_1;
              stackIn_19_2 = stackOut_18_2;
              break L1;
            } else {
              stackOut_16_0 = (RuntimeException) (Object) stackIn_16_0;
              stackOut_16_1 = (StringBuilder) (Object) stackIn_16_1;
              stackOut_16_2 = "{...}";
              stackIn_19_0 = stackOut_16_0;
              stackIn_19_1 = stackOut_16_1;
              stackIn_19_2 = stackOut_16_2;
              break L1;
            }
          }
          throw ld.a((Throwable) (Object) stackIn_19_0, stackIn_19_2 + ',' + param1 + ')');
        }
        return stackIn_14_0;
    }

    final byte[] a(int param0, int param1, int param2) {
        RuntimeException var4 = null;
        byte[] stackIn_4_0 = null;
        RuntimeException decompiledCaughtException = null;
        byte[] stackOut_3_0 = null;
        try {
          L0: {
            L1: {
              if (param1 == -27493) {
                break L1;
              } else {
                field_e = -77;
                break L1;
              }
            }
            stackOut_3_0 = this.a((int[]) null, (byte) 101, param0, param2);
            stackIn_4_0 = stackOut_3_0;
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var4 = decompiledCaughtException;
          throw ld.a((Throwable) (Object) var4, "sh.F(" + param0 + ',' + param1 + ',' + param2 + ')');
        }
        return stackIn_4_0;
    }

    final synchronized boolean c(int param0) {
        int var2_int = 0;
        RuntimeException var2 = null;
        int stackIn_7_0 = 0;
        int stackIn_10_0 = 0;
        RuntimeException decompiledCaughtException = null;
        int stackOut_6_0 = 0;
        int stackOut_9_0 = 0;
        try {
          L0: {
            L1: {
              if (null == ((sh) this).field_g) {
                ((sh) this).field_g = ((sh) this).field_h.a(false);
                if (((sh) this).field_g == null) {
                  stackOut_6_0 = 0;
                  stackIn_7_0 = stackOut_6_0;
                  return stackIn_7_0 != 0;
                } else {
                  ((sh) this).field_j = new Object[((sh) this).field_g.field_d];
                  ((sh) this).field_b = new Object[((sh) this).field_g.field_d][];
                  break L1;
                }
              } else {
                break L1;
              }
            }
            var2_int = -54 % ((21 - param0) / 52);
            stackOut_9_0 = 1;
            stackIn_10_0 = stackOut_9_0;
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2 = decompiledCaughtException;
          throw ld.a((Throwable) (Object) var2, "sh.E(" + param0 + ')');
        }
        return stackIn_10_0 != 0;
    }

    final int a(String param0, int param1, int param2) {
        int var4_int = 0;
        RuntimeException var4 = null;
        int stackIn_2_0 = 0;
        int stackIn_8_0 = 0;
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
        int stackOut_7_0 = 0;
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
            if (this.b(param2, 127)) {
              L1: {
                param0 = param0.toLowerCase();
                if (param1 == -27964) {
                  break L1;
                } else {
                  ((sh) this).field_c = 26;
                  break L1;
                }
              }
              var4_int = ((sh) this).field_g.field_c[param2].a(-20075, na.a(param1 ^ -1076540, (CharSequence) (Object) param0));
              if (this.a(true, param2, var4_int)) {
                stackOut_9_0 = var4_int;
                stackIn_10_0 = stackOut_9_0;
                break L0;
              } else {
                stackOut_7_0 = -1;
                stackIn_8_0 = stackOut_7_0;
                return stackIn_8_0;
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
            stackOut_11_1 = new StringBuilder().append("sh.D(");
            stackIn_14_0 = stackOut_11_0;
            stackIn_14_1 = stackOut_11_1;
            stackIn_12_0 = stackOut_11_0;
            stackIn_12_1 = stackOut_11_1;
            if (param0 == null) {
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
          throw ld.a((Throwable) (Object) stackIn_15_0, stackIn_15_2 + ',' + param1 + ',' + param2 + ')');
        }
        return stackIn_10_0;
    }

    final synchronized boolean a(int param0, byte param1, int param2) {
        RuntimeException var4 = null;
        int stackIn_4_0 = 0;
        int stackIn_10_0 = 0;
        int stackIn_15_0 = 0;
        int stackIn_18_0 = 0;
        int stackIn_23_0 = 0;
        RuntimeException decompiledCaughtException = null;
        int stackOut_3_0 = 0;
        int stackOut_9_0 = 0;
        int stackOut_14_0 = 0;
        int stackOut_22_0 = 0;
        int stackOut_17_0 = 0;
        try {
          L0: {
            if (!this.a(true, param0, param2)) {
              stackOut_3_0 = 0;
              stackIn_4_0 = stackOut_3_0;
              return stackIn_4_0 != 0;
            } else {
              L1: {
                if (null == ((sh) this).field_b[param0]) {
                  break L1;
                } else {
                  if (null == ((sh) this).field_b[param0][param2]) {
                    break L1;
                  } else {
                    stackOut_9_0 = 1;
                    stackIn_10_0 = stackOut_9_0;
                    return stackIn_10_0 != 0;
                  }
                }
              }
              if (null != ((sh) this).field_j[param0]) {
                stackOut_14_0 = 1;
                stackIn_15_0 = stackOut_14_0;
                return stackIn_15_0 != 0;
              } else {
                this.a(param0, true);
                if (null == ((sh) this).field_j[param0]) {
                  L2: {
                    if (param1 == 78) {
                      break L2;
                    } else {
                      boolean discarded$2 = sh.d((String) ((sh) this).field_j[7], (byte) -115);
                      break L2;
                    }
                  }
                  stackOut_22_0 = 0;
                  stackIn_23_0 = stackOut_22_0;
                  break L0;
                } else {
                  stackOut_17_0 = 1;
                  stackIn_18_0 = stackOut_17_0;
                  return stackIn_18_0 != 0;
                }
              }
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var4 = decompiledCaughtException;
          throw ld.a((Throwable) (Object) var4, "sh.Q(" + param0 + ',' + param1 + ',' + param2 + ')');
        }
        return stackIn_23_0 != 0;
    }

    final int b(int param0) {
        int var2_int = 0;
        RuntimeException var2 = null;
        int stackIn_4_0 = 0;
        int stackIn_6_0 = 0;
        RuntimeException decompiledCaughtException = null;
        int stackOut_3_0 = 0;
        int stackOut_5_0 = 0;
        try {
          L0: {
            if (!((sh) this).c(-54)) {
              stackOut_3_0 = -1;
              stackIn_4_0 = stackOut_3_0;
              return stackIn_4_0;
            } else {
              var2_int = 30 % ((-72 - param0) / 54);
              stackOut_5_0 = ((sh) this).field_g.field_a.length;
              stackIn_6_0 = stackOut_5_0;
              break L0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2 = decompiledCaughtException;
          throw ld.a((Throwable) (Object) var2, "sh.K(" + param0 + ')');
        }
        return stackIn_6_0;
    }

    final int b(String param0, byte param1) {
        int var3_int = 0;
        RuntimeException var3 = null;
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
            L1: {
              if (param1 > 109) {
                break L1;
              } else {
                ((sh) this).field_i = false;
                break L1;
              }
            }
            if (((sh) this).c(-41)) {
              param0 = param0.toLowerCase();
              var3_int = ((sh) this).field_g.field_b.a(-20075, na.a(1048576, (CharSequence) (Object) param0));
              stackOut_6_0 = ((sh) this).b((byte) -113, var3_int);
              stackIn_7_0 = stackOut_6_0;
              break L0;
            } else {
              stackOut_4_0 = 0;
              stackIn_5_0 = stackOut_4_0;
              return stackIn_5_0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L2: {
            var3 = decompiledCaughtException;
            stackOut_8_0 = (RuntimeException) var3;
            stackOut_8_1 = new StringBuilder().append("sh.N(");
            stackIn_11_0 = stackOut_8_0;
            stackIn_11_1 = stackOut_8_1;
            stackIn_9_0 = stackOut_8_0;
            stackIn_9_1 = stackOut_8_1;
            if (param0 == null) {
              stackOut_11_0 = (RuntimeException) (Object) stackIn_11_0;
              stackOut_11_1 = (StringBuilder) (Object) stackIn_11_1;
              stackOut_11_2 = "null";
              stackIn_12_0 = stackOut_11_0;
              stackIn_12_1 = stackOut_11_1;
              stackIn_12_2 = stackOut_11_2;
              break L2;
            } else {
              stackOut_9_0 = (RuntimeException) (Object) stackIn_9_0;
              stackOut_9_1 = (StringBuilder) (Object) stackIn_9_1;
              stackOut_9_2 = "{...}";
              stackIn_12_0 = stackOut_9_0;
              stackIn_12_1 = stackOut_9_1;
              stackIn_12_2 = stackOut_9_2;
              break L2;
            }
          }
          throw ld.a((Throwable) (Object) stackIn_12_0, stackIn_12_2 + ',' + param1 + ')');
        }
        return stackIn_7_0;
    }

    public static void a(int param0) {
        try {
            field_d = null;
            if (param0 != 1) {
                field_d = null;
            }
        } catch (RuntimeException runtimeException) {
            throw ld.a((Throwable) (Object) runtimeException, "sh.I(" + param0 + ')');
        }
    }

    private final synchronized byte[] a(int[] param0, byte param1, int param2, int param3) {
        Object var5 = null;
        int var6 = 0;
        Object stackIn_5_0 = null;
        Object stackIn_17_0 = null;
        Object stackIn_45_0 = null;
        Object stackIn_47_0 = null;
        StringBuilder stackIn_47_1 = null;
        Object stackIn_49_0 = null;
        StringBuilder stackIn_49_1 = null;
        Object stackIn_50_0 = null;
        StringBuilder stackIn_50_1 = null;
        String stackIn_50_2 = null;
        RuntimeException decompiledCaughtException = null;
        Object stackOut_16_0 = null;
        Object stackOut_44_0 = null;
        Object stackOut_4_0 = null;
        Object stackOut_46_0 = null;
        StringBuilder stackOut_46_1 = null;
        Object stackOut_49_0 = null;
        StringBuilder stackOut_49_1 = null;
        String stackOut_49_2 = null;
        Object stackOut_47_0 = null;
        StringBuilder stackOut_47_1 = null;
        String stackOut_47_2 = null;
        try {
          L0: {
            L1: {
              if (param1 == 101) {
                break L1;
              } else {
                boolean discarded$1 = this.a(69, ((int[]) ((sh) this).field_j[2])[7], (int[]) null, 35);
                break L1;
              }
            }
            if (this.a(true, param2, param3)) {
              L2: {
                L3: {
                  var5 = null;
                  if (null == ((sh) this).field_b[param2]) {
                    break L3;
                  } else {
                    if (null != ((sh) this).field_b[param2][param3]) {
                      break L2;
                    } else {
                      break L3;
                    }
                  }
                }
                var6 = this.a(param2, 80, param0, param3) ? 1 : 0;
                if (var6 == 0) {
                  this.a(param2, true);
                  var6 = this.a(param2, 124, param0, param3) ? 1 : 0;
                  if (var6 == 0) {
                    stackOut_16_0 = null;
                    stackIn_17_0 = stackOut_16_0;
                    return (byte[]) (Object) stackIn_17_0;
                  } else {
                    break L2;
                  }
                } else {
                  break L2;
                }
              }
              if (null == ((sh) this).field_b[param2]) {
                throw new RuntimeException("");
              } else {
                L4: {
                  if (((sh) this).field_b[param2][param3] != null) {
                    var5 = (Object) (Object) nl.a(((sh) this).field_b[param2][param3], (byte) -74, false);
                    if (var5 == null) {
                      throw new RuntimeException("");
                    } else {
                      break L4;
                    }
                  } else {
                    break L4;
                  }
                }
                L5: {
                  if (null != var5) {
                    L6: {
                      if (1 != ((sh) this).field_c) {
                        break L6;
                      } else {
                        ((sh) this).field_b[param2][param3] = null;
                        if (((sh) this).field_g.field_a[param2] != 1) {
                          break L5;
                        } else {
                          ((sh) this).field_b[param2] = null;
                          if (!Lexicominos.field_L) {
                            break L5;
                          } else {
                            break L6;
                          }
                        }
                      }
                    }
                    if (((sh) this).field_c != 2) {
                      break L5;
                    } else {
                      ((sh) this).field_b[param2] = null;
                      break L5;
                    }
                  } else {
                    break L5;
                  }
                }
                stackOut_44_0 = var5;
                stackIn_45_0 = stackOut_44_0;
                break L0;
              }
            } else {
              stackOut_4_0 = null;
              stackIn_5_0 = stackOut_4_0;
              return (byte[]) (Object) stackIn_5_0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L7: {
            var5 = (Object) (Object) decompiledCaughtException;
            stackOut_46_0 = var5;
            stackOut_46_1 = new StringBuilder().append("sh.W(");
            stackIn_49_0 = stackOut_46_0;
            stackIn_49_1 = stackOut_46_1;
            stackIn_47_0 = stackOut_46_0;
            stackIn_47_1 = stackOut_46_1;
            if (param0 == null) {
              stackOut_49_0 = stackIn_49_0;
              stackOut_49_1 = (StringBuilder) (Object) stackIn_49_1;
              stackOut_49_2 = "null";
              stackIn_50_0 = stackOut_49_0;
              stackIn_50_1 = stackOut_49_1;
              stackIn_50_2 = stackOut_49_2;
              break L7;
            } else {
              stackOut_47_0 = stackIn_47_0;
              stackOut_47_1 = (StringBuilder) (Object) stackIn_47_1;
              stackOut_47_2 = "{...}";
              stackIn_50_0 = stackOut_47_0;
              stackIn_50_1 = stackOut_47_1;
              stackIn_50_2 = stackOut_47_2;
              break L7;
            }
          }
          throw ld.a((Throwable) (Object) stackIn_50_0, stackIn_50_2 + ',' + param1 + ',' + param2 + ',' + param3 + ')');
        }
        return (byte[]) (Object) stackIn_45_0;
    }

    final synchronized boolean c(int param0, int param1) {
        RuntimeException var3 = null;
        int stackIn_4_0 = 0;
        int stackIn_9_0 = 0;
        int stackIn_14_0 = 0;
        boolean stackIn_17_0 = false;
        int stackIn_19_0 = 0;
        RuntimeException decompiledCaughtException = null;
        int stackOut_3_0 = 0;
        int stackOut_8_0 = 0;
        int stackOut_13_0 = 0;
        int stackOut_18_0 = 0;
        boolean stackOut_16_0 = false;
        try {
          L0: {
            if (!this.b(param1, 126)) {
              stackOut_3_0 = 0;
              stackIn_4_0 = stackOut_3_0;
              return stackIn_4_0 != 0;
            } else {
              if (null != ((sh) this).field_j[param1]) {
                stackOut_8_0 = 1;
                stackIn_9_0 = stackOut_8_0;
                return stackIn_9_0 != 0;
              } else {
                this.a(param1, true);
                if (null != ((sh) this).field_j[param1]) {
                  stackOut_13_0 = 1;
                  stackIn_14_0 = stackOut_13_0;
                  return stackIn_14_0 != 0;
                } else {
                  if (param0 == 5) {
                    stackOut_18_0 = 0;
                    stackIn_19_0 = stackOut_18_0;
                    break L0;
                  } else {
                    stackOut_16_0 = ((boolean[]) ((sh) this).field_j[4])[1];
                    stackIn_17_0 = stackOut_16_0;
                    return stackIn_17_0;
                  }
                }
              }
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3 = decompiledCaughtException;
          throw ld.a((Throwable) (Object) var3, "sh.T(" + param0 + ',' + param1 + ')');
        }
        return stackIn_19_0 != 0;
    }

    private final synchronized void a(int param0, boolean param1) {
        RuntimeException var3 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          L0: {
            L1: {
              L2: {
                if (!((sh) this).field_i) {
                  break L2;
                } else {
                  ((sh) this).field_j[param0] = (Object) (Object) ((sh) this).field_h.a(param0, param1);
                  if (!Lexicominos.field_L) {
                    break L1;
                  } else {
                    break L2;
                  }
                }
              }
              ((sh) this).field_j[param0] = ri.a(136, ((sh) this).field_h.a(param0, param1), false);
              break L1;
            }
            L3: {
              if (param1) {
                break L3;
              } else {
                field_f = ((int[]) ((Object[]) ((sh) this).field_j[13])[1])[8];
                break L3;
              }
            }
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3 = decompiledCaughtException;
          throw ld.a((Throwable) (Object) var3, "sh.L(" + param0 + ',' + param1 + ')');
        }
    }

    final boolean a(String param0, int param1) {
        int var3_int = 0;
        RuntimeException var3 = null;
        int stackIn_4_0 = 0;
        int stackIn_7_0 = 0;
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
            if (!((sh) this).c(param1 ^ 10842)) {
              stackOut_3_0 = 0;
              stackIn_4_0 = stackOut_3_0;
              return stackIn_4_0 != 0;
            } else {
              param0 = param0.toLowerCase();
              var3_int = ((sh) this).field_g.field_b.a(-20075, na.a(param1 ^ 1059338, (CharSequence) (Object) param0));
              if (param1 == 10762) {
                stackOut_8_0 = ((sh) this).c(5, var3_int);
                stackIn_9_0 = stackOut_8_0;
                break L0;
              } else {
                stackOut_6_0 = 1;
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
            stackOut_10_1 = new StringBuilder().append("sh.B(");
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
          throw ld.a((Throwable) (Object) stackIn_14_0, stackIn_14_2 + ',' + param1 + ')');
        }
        return stackIn_9_0;
    }

    final synchronized int b(byte param0, int param1) {
        RuntimeException var3 = null;
        int stackIn_2_0 = 0;
        int stackIn_5_0 = 0;
        int stackIn_8_0 = 0;
        int stackIn_10_0 = 0;
        RuntimeException decompiledCaughtException = null;
        int stackOut_9_0 = 0;
        int stackOut_7_0 = 0;
        int stackOut_4_0 = 0;
        int stackOut_1_0 = 0;
        try {
          L0: {
            if (this.b(param1, 126)) {
              if (param0 <= -79) {
                if (null == ((sh) this).field_j[param1]) {
                  stackOut_9_0 = ((sh) this).field_h.a(param1, 1215);
                  stackIn_10_0 = stackOut_9_0;
                  break L0;
                } else {
                  stackOut_7_0 = 100;
                  stackIn_8_0 = stackOut_7_0;
                  return stackIn_8_0;
                }
              } else {
                stackOut_4_0 = ((int[]) ((sh) this).field_j[0])[9];
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
          var3 = decompiledCaughtException;
          throw ld.a((Throwable) (Object) var3, "sh.AA(" + param0 + ',' + param1 + ')');
        }
        return stackIn_10_0;
    }

    final synchronized boolean a(byte param0) {
        int var2_int = 0;
        RuntimeException var2 = null;
        int var3 = 0;
        int var4 = 0;
        int var5 = 0;
        int var6 = 0;
        int stackIn_5_0 = 0;
        int stackIn_9_0 = 0;
        int stackIn_18_0 = 0;
        RuntimeException decompiledCaughtException = null;
        int stackOut_4_0 = 0;
        int stackOut_8_0 = 0;
        int stackOut_17_0 = 0;
        var6 = Lexicominos.field_L ? 1 : 0;
        try {
          L0: {
            if (!((sh) this).c(121)) {
              stackOut_4_0 = 0;
              stackIn_5_0 = stackOut_4_0;
              return stackIn_5_0 != 0;
            } else {
              var2_int = 1;
              var3 = 39 % ((-47 - param0) / 62);
              var4 = 0;
              L1: while (true) {
                L2: {
                  L3: {
                    if (var4 >= ((sh) this).field_g.field_f.length) {
                      break L3;
                    } else {
                      stackOut_8_0 = ((sh) this).field_g.field_f[var4];
                      stackIn_18_0 = stackOut_8_0;
                      stackIn_9_0 = stackOut_8_0;
                      if (var6 != 0) {
                        break L2;
                      } else {
                        L4: {
                          var5 = stackIn_9_0;
                          if (((sh) this).field_j[var5] == null) {
                            this.a(var5, true);
                            if (null == ((sh) this).field_j[var5]) {
                              var2_int = 0;
                              break L4;
                            } else {
                              break L4;
                            }
                          } else {
                            break L4;
                          }
                        }
                        var4++;
                        if (var6 == 0) {
                          continue L1;
                        } else {
                          break L3;
                        }
                      }
                    }
                  }
                  stackOut_17_0 = var2_int;
                  stackIn_18_0 = stackOut_17_0;
                  break L2;
                }
                break L0;
              }
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2 = decompiledCaughtException;
          throw ld.a((Throwable) (Object) var2, "sh.G(" + param0 + ')');
        }
        return stackIn_18_0 != 0;
    }

    final synchronized byte[] a(byte param0, String param1, String param2) {
        int var4_int = 0;
        RuntimeException var4 = null;
        int var5 = 0;
        Object stackIn_4_0 = null;
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
        Object stackOut_3_0 = null;
        byte[] stackOut_11_0 = null;
        Object stackOut_9_0 = null;
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
            if (!((sh) this).c(param0 + -250)) {
              stackOut_3_0 = null;
              stackIn_4_0 = stackOut_3_0;
              return (byte[]) (Object) stackIn_4_0;
            } else {
              L1: {
                param2 = param2.toLowerCase();
                if (param0 == 127) {
                  break L1;
                } else {
                  ((long[]) ((sh) this).field_j[9])[2] = ((long[]) ((sh) this).field_j[0])[1];
                  break L1;
                }
              }
              param1 = param1.toLowerCase();
              var4_int = ((sh) this).field_g.field_b.a(-20075, na.a(param0 ^ 1048703, (CharSequence) (Object) param2));
              if (this.b(var4_int, 127)) {
                var5 = ((sh) this).field_g.field_c[var4_int].a(-20075, na.a(param0 + 1048449, (CharSequence) (Object) param1));
                stackOut_11_0 = ((sh) this).a(var4_int, -27493, var5);
                stackIn_12_0 = stackOut_11_0;
                break L0;
              } else {
                stackOut_9_0 = null;
                stackIn_10_0 = stackOut_9_0;
                return (byte[]) (Object) stackIn_10_0;
              }
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L2: {
            var4 = decompiledCaughtException;
            stackOut_13_0 = (RuntimeException) var4;
            stackOut_13_1 = new StringBuilder().append("sh.R(").append(param0).append(',');
            stackIn_16_0 = stackOut_13_0;
            stackIn_16_1 = stackOut_13_1;
            stackIn_14_0 = stackOut_13_0;
            stackIn_14_1 = stackOut_13_1;
            if (param1 == null) {
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
            if (param2 == null) {
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
          throw ld.a((Throwable) (Object) stackIn_21_0, stackIn_21_2 + ')');
        }
        return stackIn_12_0;
    }

    final synchronized byte[] a(int param0, int param1) {
        int var3_int = 0;
        RuntimeException var3 = null;
        Object stackIn_4_0 = null;
        byte[] stackIn_7_0 = null;
        Object stackIn_10_0 = null;
        byte[] stackIn_15_0 = null;
        RuntimeException decompiledCaughtException = null;
        Object stackOut_3_0 = null;
        byte[] stackOut_14_0 = null;
        Object stackOut_9_0 = null;
        byte[] stackOut_6_0 = null;
        try {
          if (!((sh) this).c(125)) {
            stackOut_3_0 = null;
            stackIn_4_0 = stackOut_3_0;
            return (byte[]) (Object) stackIn_4_0;
          } else {
            if (((sh) this).field_g.field_a.length != 1) {
              if (this.b(param0, 127)) {
                if (((sh) this).field_g.field_a[param0] == 1) {
                  stackOut_14_0 = ((sh) this).a(param0, -27493, 0);
                  stackIn_15_0 = stackOut_14_0;
                  return stackIn_15_0;
                } else {
                  var3_int = 81 / ((param1 - -44) / 43);
                  throw new RuntimeException();
                }
              } else {
                stackOut_9_0 = null;
                stackIn_10_0 = stackOut_9_0;
                return (byte[]) (Object) stackIn_10_0;
              }
            } else {
              stackOut_6_0 = ((sh) this).a(0, -27493, param0);
              stackIn_7_0 = stackOut_6_0;
              return stackIn_7_0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3 = decompiledCaughtException;
          throw ld.a((Throwable) (Object) var3, "sh.P(" + param0 + ',' + param1 + ')');
        }
    }

    final synchronized int a(boolean param0) {
        int var2_int = 0;
        RuntimeException var2 = null;
        int var3 = 0;
        int var4 = 0;
        int var5 = 0;
        int stackIn_5_0 = 0;
        int stackIn_12_0 = 0;
        int stackIn_12_1 = 0;
        int stackIn_22_0 = 0;
        int stackIn_24_0 = 0;
        int stackIn_24_1 = 0;
        int stackIn_25_0 = 0;
        RuntimeException decompiledCaughtException = null;
        int stackOut_4_0 = 0;
        int stackOut_11_0 = 0;
        int stackOut_11_1 = 0;
        int stackOut_21_0 = 0;
        int stackOut_23_0 = 0;
        int stackOut_23_1 = 0;
        int stackOut_24_0 = 0;
        var5 = Lexicominos.field_L ? 1 : 0;
        try {
          L0: {
            if (!((sh) this).c(-98)) {
              stackOut_4_0 = 0;
              stackIn_5_0 = stackOut_4_0;
              return stackIn_5_0;
            } else {
              L1: {
                var2_int = 0;
                if (!param0) {
                  break L1;
                } else {
                  ((sh) this).field_j[1] = null;
                  break L1;
                }
              }
              var3 = 0;
              var4 = 0;
              L2: while (true) {
                L3: {
                  L4: {
                    if (~((sh) this).field_j.length >= ~var4) {
                      break L4;
                    } else {
                      stackOut_11_0 = -1;
                      stackOut_11_1 = ~((sh) this).field_g.field_m[var4];
                      stackIn_24_0 = stackOut_11_0;
                      stackIn_24_1 = stackOut_11_1;
                      stackIn_12_0 = stackOut_11_0;
                      stackIn_12_1 = stackOut_11_1;
                      if (var5 != 0) {
                        break L3;
                      } else {
                        L5: {
                          if (stackIn_12_0 > stackIn_12_1) {
                            var3 = var3 + ((sh) this).b((byte) -98, var4);
                            var2_int += 100;
                            break L5;
                          } else {
                            break L5;
                          }
                        }
                        var4++;
                        if (var5 == 0) {
                          continue L2;
                        } else {
                          break L4;
                        }
                      }
                    }
                  }
                  if (var2_int == 0) {
                    stackOut_21_0 = 100;
                    stackIn_22_0 = stackOut_21_0;
                    return stackIn_22_0;
                  } else {
                    stackOut_23_0 = 100 * var3;
                    stackOut_23_1 = var2_int;
                    stackIn_24_0 = stackOut_23_0;
                    stackIn_24_1 = stackOut_23_1;
                    break L3;
                  }
                }
                var4 = stackIn_24_0 / stackIn_24_1;
                stackOut_24_0 = var4;
                stackIn_25_0 = stackOut_24_0;
                break L0;
              }
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2 = decompiledCaughtException;
          throw ld.a((Throwable) (Object) var2, "sh.C(" + param0 + ')');
        }
        return stackIn_25_0;
    }

    final boolean a(String param0, String param1, int param2) {
        int var4_int = 0;
        RuntimeException var4 = null;
        int var5 = 0;
        int stackIn_4_0 = 0;
        int stackIn_12_0 = 0;
        boolean stackIn_14_0 = false;
        RuntimeException stackIn_16_0 = null;
        StringBuilder stackIn_16_1 = null;
        RuntimeException stackIn_18_0 = null;
        StringBuilder stackIn_18_1 = null;
        RuntimeException stackIn_19_0 = null;
        StringBuilder stackIn_19_1 = null;
        String stackIn_19_2 = null;
        RuntimeException stackIn_20_0 = null;
        StringBuilder stackIn_20_1 = null;
        RuntimeException stackIn_22_0 = null;
        StringBuilder stackIn_22_1 = null;
        RuntimeException stackIn_23_0 = null;
        StringBuilder stackIn_23_1 = null;
        String stackIn_23_2 = null;
        RuntimeException decompiledCaughtException = null;
        int stackOut_3_0 = 0;
        int stackOut_11_0 = 0;
        boolean stackOut_13_0 = false;
        RuntimeException stackOut_15_0 = null;
        StringBuilder stackOut_15_1 = null;
        RuntimeException stackOut_18_0 = null;
        StringBuilder stackOut_18_1 = null;
        String stackOut_18_2 = null;
        RuntimeException stackOut_16_0 = null;
        StringBuilder stackOut_16_1 = null;
        String stackOut_16_2 = null;
        RuntimeException stackOut_19_0 = null;
        StringBuilder stackOut_19_1 = null;
        RuntimeException stackOut_22_0 = null;
        StringBuilder stackOut_22_1 = null;
        String stackOut_22_2 = null;
        RuntimeException stackOut_20_0 = null;
        StringBuilder stackOut_20_1 = null;
        String stackOut_20_2 = null;
        try {
          L0: {
            if (!((sh) this).c(-118)) {
              stackOut_3_0 = 0;
              stackIn_4_0 = stackOut_3_0;
              return stackIn_4_0 != 0;
            } else {
              L1: {
                param1 = param1.toLowerCase();
                if (param2 == -1) {
                  break L1;
                } else {
                  field_a = ((int[]) ((Object[]) ((sh) this).field_j[2])[2])[0];
                  break L1;
                }
              }
              param0 = param0.toLowerCase();
              var4_int = ((sh) this).field_g.field_b.a(-20075, na.a(param2 ^ -1048577, (CharSequence) (Object) param1));
              if (!this.b(var4_int, 126)) {
                stackOut_11_0 = 0;
                stackIn_12_0 = stackOut_11_0;
                return stackIn_12_0 != 0;
              } else {
                var5 = ((sh) this).field_g.field_c[var4_int].a(-20075, na.a(1048576, (CharSequence) (Object) param0));
                stackOut_13_0 = ((sh) this).a(var4_int, (byte) 78, var5);
                stackIn_14_0 = stackOut_13_0;
                break L0;
              }
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L2: {
            var4 = decompiledCaughtException;
            stackOut_15_0 = (RuntimeException) var4;
            stackOut_15_1 = new StringBuilder().append("sh.J(");
            stackIn_18_0 = stackOut_15_0;
            stackIn_18_1 = stackOut_15_1;
            stackIn_16_0 = stackOut_15_0;
            stackIn_16_1 = stackOut_15_1;
            if (param0 == null) {
              stackOut_18_0 = (RuntimeException) (Object) stackIn_18_0;
              stackOut_18_1 = (StringBuilder) (Object) stackIn_18_1;
              stackOut_18_2 = "null";
              stackIn_19_0 = stackOut_18_0;
              stackIn_19_1 = stackOut_18_1;
              stackIn_19_2 = stackOut_18_2;
              break L2;
            } else {
              stackOut_16_0 = (RuntimeException) (Object) stackIn_16_0;
              stackOut_16_1 = (StringBuilder) (Object) stackIn_16_1;
              stackOut_16_2 = "{...}";
              stackIn_19_0 = stackOut_16_0;
              stackIn_19_1 = stackOut_16_1;
              stackIn_19_2 = stackOut_16_2;
              break L2;
            }
          }
          L3: {
            stackOut_19_0 = (RuntimeException) (Object) stackIn_19_0;
            stackOut_19_1 = ((StringBuilder) (Object) stackIn_19_1).append(stackIn_19_2).append(',');
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
              break L3;
            } else {
              stackOut_20_0 = (RuntimeException) (Object) stackIn_20_0;
              stackOut_20_1 = (StringBuilder) (Object) stackIn_20_1;
              stackOut_20_2 = "{...}";
              stackIn_23_0 = stackOut_20_0;
              stackIn_23_1 = stackOut_20_1;
              stackIn_23_2 = stackOut_20_2;
              break L3;
            }
          }
          throw ld.a((Throwable) (Object) stackIn_23_0, stackIn_23_2 + ',' + param2 + ')');
        }
        return stackIn_14_0;
    }

    final boolean a(String param0, byte param1) {
        int var3_int = 0;
        RuntimeException var3 = null;
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
              if (param1 < -113) {
                break L1;
              } else {
                boolean discarded$2 = ((sh) this).c(71, ((int[]) ((sh) this).field_j[23])[0]);
                break L1;
              }
            }
            if (!((sh) this).c(85)) {
              stackOut_6_0 = 0;
              stackIn_7_0 = stackOut_6_0;
              return stackIn_7_0 != 0;
            } else {
              param0 = param0.toLowerCase();
              var3_int = ((sh) this).field_g.field_b.a(-20075, na.a(1048576, (CharSequence) (Object) param0));
              if (var3_int >= 0) {
                stackOut_11_0 = 1;
                stackIn_12_0 = stackOut_11_0;
                break L0;
              } else {
                stackOut_9_0 = 0;
                stackIn_10_0 = stackOut_9_0;
                return stackIn_10_0 != 0;
              }
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L2: {
            var3 = decompiledCaughtException;
            stackOut_13_0 = (RuntimeException) var3;
            stackOut_13_1 = new StringBuilder().append("sh.S(");
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
          throw ld.a((Throwable) (Object) stackIn_17_0, stackIn_17_2 + ',' + param1 + ')');
        }
        return stackIn_12_0 != 0;
    }

    private final synchronized boolean b(int param0, int param1) {
        RuntimeException var3 = null;
        int stackIn_4_0 = 0;
        int stackIn_18_0 = 0;
        int stackIn_21_0 = 0;
        int stackIn_23_0 = 0;
        RuntimeException decompiledCaughtException = null;
        int stackOut_3_0 = 0;
        int stackOut_22_0 = 0;
        int stackOut_20_0 = 0;
        int stackOut_17_0 = 0;
        try {
          L0: {
            if (!((sh) this).c(101)) {
              stackOut_3_0 = 0;
              stackIn_4_0 = stackOut_3_0;
              return stackIn_4_0 != 0;
            } else {
              L1: {
                if (param0 < 0) {
                  break L1;
                } else {
                  if (((sh) this).field_g.field_a.length <= param0) {
                    break L1;
                  } else {
                    if (((sh) this).field_g.field_a[param0] == 0) {
                      break L1;
                    } else {
                      if (param1 >= 125) {
                        stackOut_22_0 = 1;
                        stackIn_23_0 = stackOut_22_0;
                        break L0;
                      } else {
                        stackOut_20_0 = 0;
                        stackIn_21_0 = stackOut_20_0;
                        return stackIn_21_0 != 0;
                      }
                    }
                  }
                }
              }
              if (!oc.field_b) {
                stackOut_17_0 = 0;
                stackIn_18_0 = stackOut_17_0;
                return stackIn_18_0 != 0;
              } else {
                throw new IllegalArgumentException(Integer.toString(param0));
              }
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3 = decompiledCaughtException;
          throw ld.a((Throwable) (Object) var3, "sh.M(" + param0 + ',' + param1 + ')');
        }
        return stackIn_23_0 != 0;
    }

    private final synchronized boolean a(boolean param0, int param1, int param2) {
        RuntimeException var4 = null;
        int stackIn_4_0 = 0;
        int stackIn_19_0 = 0;
        int stackIn_23_0 = 0;
        int stackIn_25_0 = 0;
        RuntimeException decompiledCaughtException = null;
        int stackOut_3_0 = 0;
        int stackOut_24_0 = 0;
        int stackOut_22_0 = 0;
        int stackOut_18_0 = 0;
        try {
          L0: {
            if (!((sh) this).c(-94)) {
              stackOut_3_0 = 0;
              stackIn_4_0 = stackOut_3_0;
              return stackIn_4_0 != 0;
            } else {
              L1: {
                if (0 > param1) {
                  break L1;
                } else {
                  if (0 > param2) {
                    break L1;
                  } else {
                    if (((sh) this).field_g.field_a.length <= param1) {
                      break L1;
                    } else {
                      if (~((sh) this).field_g.field_a[param1] >= ~param2) {
                        break L1;
                      } else {
                        if (param0) {
                          stackOut_24_0 = 1;
                          stackIn_25_0 = stackOut_24_0;
                          break L0;
                        } else {
                          stackOut_22_0 = 0;
                          stackIn_23_0 = stackOut_22_0;
                          return stackIn_23_0 != 0;
                        }
                      }
                    }
                  }
                }
              }
              if (oc.field_b) {
                throw new IllegalArgumentException(param1 + " " + param2);
              } else {
                stackOut_18_0 = 0;
                stackIn_19_0 = stackOut_18_0;
                return stackIn_19_0 != 0;
              }
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var4 = decompiledCaughtException;
          throw ld.a((Throwable) (Object) var4, "sh.H(" + param0 + ',' + param1 + ',' + param2 + ')');
        }
        return stackIn_25_0 != 0;
    }

    private final synchronized boolean a(int param0, int param1, int[] param2, int param3) {
        RuntimeException var5 = null;
        int var5_int = 0;
        int[] var6 = null;
        Object[] var7 = null;
        int var8 = 0;
        int var9 = 0;
        Object[] var10 = null;
        int var10_int = 0;
        byte[] var10_array = null;
        int var11_int = 0;
        byte[] var11 = null;
        wf var11_ref = null;
        RuntimeException var12_ref_RuntimeException = null;
        int var12 = 0;
        int var13 = 0;
        wf var14 = null;
        int var15 = 0;
        int[] var15_ref_int__ = null;
        int var16 = 0;
        byte[][] var16_ref_byte____ = null;
        int var17_int = 0;
        byte[] var17 = null;
        int var18 = 0;
        int var19 = 0;
        int var20 = 0;
        int var21 = 0;
        int var22 = 0;
        int var23 = 0;
        int stackIn_5_0 = 0;
        int stackIn_8_0 = 0;
        int stackIn_29_0 = 0;
        RuntimeException stackIn_48_0 = null;
        StringBuilder stackIn_48_1 = null;
        RuntimeException stackIn_50_0 = null;
        StringBuilder stackIn_50_1 = null;
        RuntimeException stackIn_51_0 = null;
        StringBuilder stackIn_51_1 = null;
        int stackIn_51_2 = 0;
        int stackIn_75_0 = 0;
        int stackIn_84_0 = 0;
        int stackIn_94_0 = 0;
        int stackIn_103_0 = 0;
        int stackIn_122_0 = 0;
        int stackIn_138_0 = 0;
        int stackIn_141_0 = 0;
        int stackIn_145_0 = 0;
        int stackIn_160_0 = 0;
        RuntimeException stackIn_162_0 = null;
        StringBuilder stackIn_162_1 = null;
        RuntimeException stackIn_164_0 = null;
        StringBuilder stackIn_164_1 = null;
        RuntimeException stackIn_165_0 = null;
        StringBuilder stackIn_165_1 = null;
        String stackIn_165_2 = null;
        RuntimeException decompiledCaughtException = null;
        int stackOut_4_0 = 0;
        RuntimeException stackOut_47_0 = null;
        StringBuilder stackOut_47_1 = null;
        RuntimeException stackOut_50_0 = null;
        StringBuilder stackOut_50_1 = null;
        int stackOut_50_2 = 0;
        RuntimeException stackOut_48_0 = null;
        StringBuilder stackOut_48_1 = null;
        int stackOut_48_2 = 0;
        int stackOut_74_0 = 0;
        int stackOut_83_0 = 0;
        int stackOut_93_0 = 0;
        int stackOut_102_0 = 0;
        int stackOut_121_0 = 0;
        int stackOut_137_0 = 0;
        int stackOut_140_0 = 0;
        int stackOut_144_0 = 0;
        int stackOut_159_0 = 0;
        int stackOut_28_0 = 0;
        int stackOut_7_0 = 0;
        RuntimeException stackOut_161_0 = null;
        StringBuilder stackOut_161_1 = null;
        RuntimeException stackOut_164_0 = null;
        StringBuilder stackOut_164_1 = null;
        String stackOut_164_2 = null;
        RuntimeException stackOut_162_0 = null;
        StringBuilder stackOut_162_1 = null;
        String stackOut_162_2 = null;
        var23 = Lexicominos.field_L ? 1 : 0;
        try {
          L0: {
            if (!this.b(param0, 126)) {
              stackOut_4_0 = 0;
              stackIn_5_0 = stackOut_4_0;
              return stackIn_5_0 != 0;
            } else {
              if (null != ((sh) this).field_j[param0]) {
                L1: {
                  var5_int = ((sh) this).field_g.field_m[param0];
                  var6 = ((sh) this).field_g.field_n[param0];
                  if (((sh) this).field_b[param0] != null) {
                    break L1;
                  } else {
                    ((sh) this).field_b[param0] = new Object[((sh) this).field_g.field_a[param0]];
                    break L1;
                  }
                }
                var7 = ((sh) this).field_b[param0];
                var8 = -4 % ((param1 - 17) / 39);
                var9 = 1;
                var10_int = 0;
                L2: while (true) {
                  L3: {
                    L4: {
                      if (~var5_int >= ~var10_int) {
                        break L4;
                      } else {
                        if (var23 != 0) {
                          break L3;
                        } else {
                          L5: {
                            L6: {
                              if (null == var6) {
                                break L6;
                              } else {
                                var11_int = var6[var10_int];
                                if (var23 == 0) {
                                  break L5;
                                } else {
                                  break L6;
                                }
                              }
                            }
                            var11_int = var10_int;
                            break L5;
                          }
                          L7: {
                            if (var7[var11_int] != null) {
                              break L7;
                            } else {
                              var9 = 0;
                              if (var23 == 0) {
                                break L4;
                              } else {
                                break L7;
                              }
                            }
                          }
                          var10_int++;
                          if (var23 == 0) {
                            continue L2;
                          } else {
                            break L4;
                          }
                        }
                      }
                    }
                    if (var9 != 0) {
                      break L3;
                    } else {
                      L8: {
                        L9: {
                          if (param2 == null) {
                            break L9;
                          } else {
                            L10: {
                              if (0 != param2[0]) {
                                break L10;
                              } else {
                                if (param2[1] != 0) {
                                  break L10;
                                } else {
                                  if (param2[2] != 0) {
                                    break L10;
                                  } else {
                                    if (param2[3] != 0) {
                                      break L10;
                                    } else {
                                      break L9;
                                    }
                                  }
                                }
                              }
                            }
                            var10_array = nl.a(((sh) this).field_j[param0], (byte) -74, true);
                            var11_ref = new wf(var10_array);
                            var11_ref.a(4, var11_ref.field_j.length, 5, param2);
                            break L8;
                          }
                        }
                        var10_array = nl.a(((sh) this).field_j[param0], (byte) -74, false);
                        break L8;
                      }
                      try {
                        L11: {
                          var11 = qk.a(65, var10_array);
                          break L11;
                        }
                      } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
                        decompiledCaughtException = decompiledCaughtParameter0;
                        L12: {
                          var12_ref_RuntimeException = decompiledCaughtException;
                          stackOut_47_0 = (RuntimeException) var12_ref_RuntimeException;
                          stackOut_47_1 = new StringBuilder();
                          stackIn_50_0 = stackOut_47_0;
                          stackIn_50_1 = stackOut_47_1;
                          stackIn_48_0 = stackOut_47_0;
                          stackIn_48_1 = stackOut_47_1;
                          if (param2 == null) {
                            stackOut_50_0 = (RuntimeException) (Object) stackIn_50_0;
                            stackOut_50_1 = (StringBuilder) (Object) stackIn_50_1;
                            stackOut_50_2 = 0;
                            stackIn_51_0 = stackOut_50_0;
                            stackIn_51_1 = stackOut_50_1;
                            stackIn_51_2 = stackOut_50_2;
                            break L12;
                          } else {
                            stackOut_48_0 = (RuntimeException) (Object) stackIn_48_0;
                            stackOut_48_1 = (StringBuilder) (Object) stackIn_48_1;
                            stackOut_48_2 = 1;
                            stackIn_51_0 = stackOut_48_0;
                            stackIn_51_1 = stackOut_48_1;
                            stackIn_51_2 = stackOut_48_2;
                            break L12;
                          }
                        }
                        throw ld.a((Throwable) (Object) stackIn_51_0, (stackIn_51_2 != 0) + " " + param0 + " " + var10_array.length + " " + oe.a(88, var10_array, var10_array.length) + " " + oe.a(-91, var10_array, -2 + var10_array.length) + " " + ((sh) this).field_g.field_r[param0] + " " + ((sh) this).field_g.field_i);
                      }
                      L13: {
                        if (((sh) this).field_i) {
                          ((sh) this).field_j[param0] = null;
                          break L13;
                        } else {
                          break L13;
                        }
                      }
                      L14: {
                        L15: {
                          L16: {
                            if (1 < var5_int) {
                              break L16;
                            } else {
                              L17: {
                                L18: {
                                  if (null != var6) {
                                    break L18;
                                  } else {
                                    var12 = 0;
                                    if (var23 == 0) {
                                      break L17;
                                    } else {
                                      break L18;
                                    }
                                  }
                                }
                                var12 = var6[0];
                                break L17;
                              }
                              L19: {
                                L20: {
                                  if (((sh) this).field_c != 0) {
                                    break L20;
                                  } else {
                                    var7[var12] = ri.a(136, var11, false);
                                    if (var23 == 0) {
                                      break L19;
                                    } else {
                                      break L20;
                                    }
                                  }
                                }
                                var7[var12] = (Object) (Object) var11;
                                break L19;
                              }
                              if (var23 == 0) {
                                break L15;
                              } else {
                                break L16;
                              }
                            }
                          }
                          L21: {
                            if (((sh) this).field_c == 2) {
                              break L21;
                            } else {
                              var12 = var11.length;
                              var12--;
                              var13 = 255 & var11[var12];
                              var12 = var12 - 4 * (var13 * var5_int);
                              var14 = new wf(var11);
                              var14.field_h = var12;
                              var15_ref_int__ = new int[var5_int];
                              var16 = 0;
                              L22: while (true) {
                                L23: {
                                  L24: {
                                    if (~var13 >= ~var16) {
                                      break L24;
                                    } else {
                                      var17_int = 0;
                                      stackOut_74_0 = 0;
                                      stackIn_84_0 = stackOut_74_0;
                                      stackIn_75_0 = stackOut_74_0;
                                      if (var23 != 0) {
                                        break L23;
                                      } else {
                                        var18 = stackIn_75_0;
                                        L25: while (true) {
                                          L26: {
                                            L27: {
                                              if (~var18 <= ~var5_int) {
                                                break L27;
                                              } else {
                                                var17_int = var17_int + var14.d((byte) 19);
                                                var15_ref_int__[var18] = var15_ref_int__[var18] + var17_int;
                                                var18++;
                                                if (var23 != 0) {
                                                  break L26;
                                                } else {
                                                  if (var23 == 0) {
                                                    continue L25;
                                                  } else {
                                                    break L27;
                                                  }
                                                }
                                              }
                                            }
                                            var16++;
                                            break L26;
                                          }
                                          if (var23 == 0) {
                                            continue L22;
                                          } else {
                                            break L24;
                                          }
                                        }
                                      }
                                    }
                                  }
                                  stackOut_83_0 = var5_int;
                                  stackIn_84_0 = stackOut_83_0;
                                  break L23;
                                }
                                var16_ref_byte____ = new byte[stackIn_84_0][];
                                var17_int = 0;
                                L28: while (true) {
                                  L29: {
                                    L30: {
                                      if (~var5_int >= ~var17_int) {
                                        break L30;
                                      } else {
                                        var16_ref_byte____[var17_int] = new byte[var15_ref_int__[var17_int]];
                                        var15_ref_int__[var17_int] = 0;
                                        var17_int++;
                                        if (var23 != 0) {
                                          break L29;
                                        } else {
                                          if (var23 == 0) {
                                            continue L28;
                                          } else {
                                            break L30;
                                          }
                                        }
                                      }
                                    }
                                    var14.field_h = var12;
                                    var17_int = 0;
                                    break L29;
                                  }
                                  var18 = 0;
                                  L31: while (true) {
                                    L32: {
                                      L33: {
                                        if (~var18 <= ~var13) {
                                          break L33;
                                        } else {
                                          var19 = 0;
                                          stackOut_93_0 = 0;
                                          stackIn_103_0 = stackOut_93_0;
                                          stackIn_94_0 = stackOut_93_0;
                                          if (var23 != 0) {
                                            break L32;
                                          } else {
                                            var20 = stackIn_94_0;
                                            L34: while (true) {
                                              L35: {
                                                L36: {
                                                  if (~var5_int >= ~var20) {
                                                    break L36;
                                                  } else {
                                                    var19 = var19 + var14.d((byte) 19);
                                                    o.a(var11, var17_int, var16_ref_byte____[var20], var15_ref_int__[var20], var19);
                                                    var17_int = var17_int + var19;
                                                    var15_ref_int__[var20] = var15_ref_int__[var20] + var19;
                                                    var20++;
                                                    if (var23 != 0) {
                                                      break L35;
                                                    } else {
                                                      if (var23 == 0) {
                                                        continue L34;
                                                      } else {
                                                        break L36;
                                                      }
                                                    }
                                                  }
                                                }
                                                var18++;
                                                break L35;
                                              }
                                              if (var23 == 0) {
                                                continue L31;
                                              } else {
                                                break L33;
                                              }
                                            }
                                          }
                                        }
                                      }
                                      stackOut_102_0 = 0;
                                      stackIn_103_0 = stackOut_102_0;
                                      break L32;
                                    }
                                    var18 = stackIn_103_0;
                                    L37: while (true) {
                                      L38: {
                                        if (var18 >= var5_int) {
                                          break L38;
                                        } else {
                                          if (var23 != 0) {
                                            break L15;
                                          } else {
                                            L39: {
                                              L40: {
                                                if (var6 != null) {
                                                  break L40;
                                                } else {
                                                  var19 = var18;
                                                  if (var23 == 0) {
                                                    break L39;
                                                  } else {
                                                    break L40;
                                                  }
                                                }
                                              }
                                              var19 = var6[var18];
                                              break L39;
                                            }
                                            L41: {
                                              L42: {
                                                if (((sh) this).field_c == 0) {
                                                  break L42;
                                                } else {
                                                  var7[var19] = (Object) (Object) var16_ref_byte____[var18];
                                                  if (var23 == 0) {
                                                    break L41;
                                                  } else {
                                                    break L42;
                                                  }
                                                }
                                              }
                                              var7[var19] = ri.a(136, var16_ref_byte____[var18], false);
                                              break L41;
                                            }
                                            var18++;
                                            if (var23 == 0) {
                                              continue L37;
                                            } else {
                                              break L38;
                                            }
                                          }
                                        }
                                      }
                                      if (var23 == 0) {
                                        break L15;
                                      } else {
                                        break L21;
                                      }
                                    }
                                  }
                                }
                              }
                            }
                          }
                          var12 = var11.length;
                          var12--;
                          var13 = var11[var12] & 255;
                          var12 = var12 - var5_int * var13 * 4;
                          var14 = new wf(var11);
                          var15 = 0;
                          var16 = 0;
                          var14.field_h = var12;
                          var17_int = 0;
                          L43: while (true) {
                            L44: {
                              L45: {
                                if (~var13 >= ~var17_int) {
                                  break L45;
                                } else {
                                  var18 = 0;
                                  stackOut_121_0 = 0;
                                  stackIn_138_0 = stackOut_121_0;
                                  stackIn_122_0 = stackOut_121_0;
                                  if (var23 != 0) {
                                    break L44;
                                  } else {
                                    var19 = stackIn_122_0;
                                    L46: while (true) {
                                      L47: {
                                        L48: {
                                          if (var5_int <= var19) {
                                            break L48;
                                          } else {
                                            var18 = var18 + var14.d((byte) 19);
                                            if (var23 != 0) {
                                              break L47;
                                            } else {
                                              L49: {
                                                L50: {
                                                  if (null == var6) {
                                                    break L50;
                                                  } else {
                                                    var20 = var6[var19];
                                                    if (var23 == 0) {
                                                      break L49;
                                                    } else {
                                                      break L50;
                                                    }
                                                  }
                                                }
                                                var20 = var19;
                                                break L49;
                                              }
                                              L51: {
                                                if (var20 == param3) {
                                                  var16 = var20;
                                                  var15 = var15 + var18;
                                                  break L51;
                                                } else {
                                                  break L51;
                                                }
                                              }
                                              var19++;
                                              if (var23 == 0) {
                                                continue L46;
                                              } else {
                                                break L48;
                                              }
                                            }
                                          }
                                        }
                                        var17_int++;
                                        break L47;
                                      }
                                      if (var23 == 0) {
                                        continue L43;
                                      } else {
                                        break L45;
                                      }
                                    }
                                  }
                                }
                              }
                              stackOut_137_0 = var15;
                              stackIn_138_0 = stackOut_137_0;
                              break L44;
                            }
                            if (stackIn_138_0 == 0) {
                              stackOut_140_0 = 1;
                              stackIn_141_0 = stackOut_140_0;
                              return stackIn_141_0 != 0;
                            } else {
                              var17 = new byte[var15];
                              var15 = 0;
                              var14.field_h = var12;
                              var18 = 0;
                              var19 = 0;
                              L52: while (true) {
                                L53: {
                                  if (~var19 <= ~var13) {
                                    break L53;
                                  } else {
                                    var20 = 0;
                                    stackOut_144_0 = 0;
                                    stackIn_160_0 = stackOut_144_0;
                                    stackIn_145_0 = stackOut_144_0;
                                    if (var23 != 0) {
                                      break L14;
                                    } else {
                                      var21 = stackIn_145_0;
                                      L54: while (true) {
                                        L55: {
                                          L56: {
                                            if (~var21 <= ~var5_int) {
                                              break L56;
                                            } else {
                                              var20 = var20 + var14.d((byte) 19);
                                              if (var23 != 0) {
                                                break L55;
                                              } else {
                                                L57: {
                                                  L58: {
                                                    if (var6 != null) {
                                                      break L58;
                                                    } else {
                                                      var22 = var21;
                                                      if (var23 == 0) {
                                                        break L57;
                                                      } else {
                                                        break L58;
                                                      }
                                                    }
                                                  }
                                                  var22 = var6[var21];
                                                  break L57;
                                                }
                                                L59: {
                                                  if (~param3 != ~var22) {
                                                    break L59;
                                                  } else {
                                                    o.a(var11, var18, var17, var15, var20);
                                                    var15 = var15 + var20;
                                                    break L59;
                                                  }
                                                }
                                                var18 = var18 + var20;
                                                var21++;
                                                if (var23 == 0) {
                                                  continue L54;
                                                } else {
                                                  break L56;
                                                }
                                              }
                                            }
                                          }
                                          var19++;
                                          break L55;
                                        }
                                        if (var23 == 0) {
                                          continue L52;
                                        } else {
                                          break L53;
                                        }
                                      }
                                    }
                                  }
                                }
                                var7[var16] = (Object) (Object) var17;
                                break L15;
                              }
                            }
                          }
                        }
                        stackOut_159_0 = 1;
                        stackIn_160_0 = stackOut_159_0;
                        break L14;
                      }
                      break L0;
                    }
                  }
                  stackOut_28_0 = 1;
                  stackIn_29_0 = stackOut_28_0;
                  return stackIn_29_0 != 0;
                }
              } else {
                stackOut_7_0 = 0;
                stackIn_8_0 = stackOut_7_0;
                return stackIn_8_0 != 0;
              }
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter1) {
          decompiledCaughtException = decompiledCaughtParameter1;
          L60: {
            var5 = decompiledCaughtException;
            stackOut_161_0 = (RuntimeException) var5;
            stackOut_161_1 = new StringBuilder().append("sh.A(").append(param0).append(',').append(param1).append(',');
            stackIn_164_0 = stackOut_161_0;
            stackIn_164_1 = stackOut_161_1;
            stackIn_162_0 = stackOut_161_0;
            stackIn_162_1 = stackOut_161_1;
            if (param2 == null) {
              stackOut_164_0 = (RuntimeException) (Object) stackIn_164_0;
              stackOut_164_1 = (StringBuilder) (Object) stackIn_164_1;
              stackOut_164_2 = "null";
              stackIn_165_0 = stackOut_164_0;
              stackIn_165_1 = stackOut_164_1;
              stackIn_165_2 = stackOut_164_2;
              break L60;
            } else {
              stackOut_162_0 = (RuntimeException) (Object) stackIn_162_0;
              stackOut_162_1 = (StringBuilder) (Object) stackIn_162_1;
              stackOut_162_2 = "{...}";
              stackIn_165_0 = stackOut_162_0;
              stackIn_165_1 = stackOut_162_1;
              stackIn_165_2 = stackOut_162_2;
              break L60;
            }
          }
          throw ld.a((Throwable) (Object) stackIn_165_0, stackIn_165_2 + ',' + param3 + ')');
        }
        return stackIn_160_0 != 0;
    }

    sh(hf param0, boolean param1, int param2) {
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
        ((sh) this).field_g = null;
        try {
          L0: {
            L1: {
              if (param2 < 0) {
                break L1;
              } else {
                if (param2 <= 2) {
                  ((sh) this).field_i = param1;
                  ((sh) this).field_c = param2;
                  ((sh) this).field_h = param0;
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
            stackOut_7_1 = new StringBuilder().append("sh.<init>(");
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
          throw ld.a((Throwable) (Object) stackIn_11_0, stackIn_11_2 + ',' + param1 + ',' + param2 + ')');
        }
    }

    final static boolean d(String param0, byte param1) {
        int var2_int = 0;
        RuntimeException var2 = null;
        int var3 = 0;
        int var4 = 0;
        boolean stackIn_6_0 = false;
        int stackIn_15_0 = 0;
        int stackIn_18_0 = 0;
        RuntimeException stackIn_20_0 = null;
        StringBuilder stackIn_20_1 = null;
        RuntimeException stackIn_22_0 = null;
        StringBuilder stackIn_22_1 = null;
        RuntimeException stackIn_23_0 = null;
        StringBuilder stackIn_23_1 = null;
        String stackIn_23_2 = null;
        RuntimeException decompiledCaughtException = null;
        boolean stackOut_5_0 = false;
        int stackOut_14_0 = 0;
        int stackOut_17_0 = 0;
        RuntimeException stackOut_19_0 = null;
        StringBuilder stackOut_19_1 = null;
        RuntimeException stackOut_22_0 = null;
        StringBuilder stackOut_22_1 = null;
        String stackOut_22_2 = null;
        RuntimeException stackOut_20_0 = null;
        StringBuilder stackOut_20_1 = null;
        String stackOut_20_2 = null;
        var4 = Lexicominos.field_L ? 1 : 0;
        try {
          L0: {
            L1: {
              var2_int = 0;
              if (param1 == 50) {
                break L1;
              } else {
                field_a = -22;
                break L1;
              }
            }
            L2: while (true) {
              L3: {
                L4: {
                  if (~var2_int <= ~param0.length()) {
                    break L4;
                  } else {
                    var3 = param0.charAt(var2_int);
                    stackOut_5_0 = hi.a(18670, (char) var3);
                    stackIn_18_0 = stackOut_5_0 ? 1 : 0;
                    stackIn_6_0 = stackOut_5_0;
                    if (var4 != 0) {
                      break L3;
                    } else {
                      L5: {
                        if (stackIn_6_0) {
                          break L5;
                        } else {
                          if (!ne.a((byte) 94, (char) var3)) {
                            stackOut_14_0 = 1;
                            stackIn_15_0 = stackOut_14_0;
                            return stackIn_15_0 != 0;
                          } else {
                            break L5;
                          }
                        }
                      }
                      var2_int++;
                      if (var4 == 0) {
                        continue L2;
                      } else {
                        break L4;
                      }
                    }
                  }
                }
                stackOut_17_0 = 0;
                stackIn_18_0 = stackOut_17_0;
                break L3;
              }
              break L0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L6: {
            var2 = decompiledCaughtException;
            stackOut_19_0 = (RuntimeException) var2;
            stackOut_19_1 = new StringBuilder().append("sh.O(");
            stackIn_22_0 = stackOut_19_0;
            stackIn_22_1 = stackOut_19_1;
            stackIn_20_0 = stackOut_19_0;
            stackIn_20_1 = stackOut_19_1;
            if (param0 == null) {
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
          throw ld.a((Throwable) (Object) stackIn_23_0, stackIn_23_2 + ',' + param1 + ')');
        }
        return stackIn_18_0 != 0;
    }

    final int a(byte param0, int param1) {
        int var3_int = 0;
        RuntimeException var3 = null;
        int stackIn_2_0 = 0;
        int stackIn_4_0 = 0;
        RuntimeException decompiledCaughtException = null;
        int stackOut_3_0 = 0;
        int stackOut_1_0 = 0;
        try {
          L0: {
            var3_int = 92 % ((70 - param0) / 40);
            if (this.b(param1, 126)) {
              stackOut_3_0 = ((sh) this).field_g.field_a[param1];
              stackIn_4_0 = stackOut_3_0;
              break L0;
            } else {
              stackOut_1_0 = 0;
              stackIn_2_0 = stackOut_1_0;
              return stackIn_2_0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3 = decompiledCaughtException;
          throw ld.a((Throwable) (Object) var3, "sh.U(" + param0 + ',' + param1 + ')');
        }
        return stackIn_4_0;
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_f = 0;
        field_e = 0;
    }
}
