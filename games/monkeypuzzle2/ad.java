/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class ad {
    private Object[][] field_i;
    private int field_e;
    private Object[] field_h;
    private boolean field_b;
    private rf field_c;
    static String field_d;
    private wd field_a;
    static String field_j;
    static int[] field_g;
    static String field_k;
    static String field_f;

    public static void a(byte param0) {
        RuntimeException var1 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          L0: {
            L1: {
              field_j = null;
              field_g = null;
              field_d = null;
              if (param0 == 123) {
                break L1;
              } else {
                field_j = null;
                break L1;
              }
            }
            field_k = null;
            field_f = null;
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var1 = decompiledCaughtException;
          throw la.a((Throwable) (Object) var1, "ad.I(" + param0 + ')');
        }
    }

    final boolean a(String param0, boolean param1, String param2) {
        int var4_int = 0;
        RuntimeException var4 = null;
        int var5 = 0;
        int stackIn_2_0 = 0;
        int stackIn_5_0 = 0;
        int stackIn_8_0 = 0;
        boolean stackIn_10_0 = false;
        RuntimeException stackIn_12_0 = null;
        StringBuilder stackIn_12_1 = null;
        RuntimeException stackIn_14_0 = null;
        StringBuilder stackIn_14_1 = null;
        RuntimeException stackIn_15_0 = null;
        StringBuilder stackIn_15_1 = null;
        String stackIn_15_2 = null;
        RuntimeException stackIn_16_0 = null;
        StringBuilder stackIn_16_1 = null;
        RuntimeException stackIn_18_0 = null;
        StringBuilder stackIn_18_1 = null;
        RuntimeException stackIn_19_0 = null;
        StringBuilder stackIn_19_1 = null;
        String stackIn_19_2 = null;
        RuntimeException decompiledCaughtException = null;
        boolean stackOut_9_0 = false;
        int stackOut_7_0 = 0;
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
            if (((ad) this).a(-22)) {
              param2 = param2.toLowerCase();
              param0 = param0.toLowerCase();
              if (param1) {
                var4_int = ((ad) this).field_a.field_b.a(param1, ra.a((byte) -21, (CharSequence) (Object) param2));
                if (this.a((byte) 115, var4_int)) {
                  var5 = ((ad) this).field_a.field_t[var4_int].a(param1, ra.a((byte) 99, (CharSequence) (Object) param0));
                  stackOut_9_0 = ((ad) this).c(var4_int, var5, -119);
                  stackIn_10_0 = stackOut_9_0;
                  break L0;
                } else {
                  stackOut_7_0 = 0;
                  stackIn_8_0 = stackOut_7_0;
                  return stackIn_8_0 != 0;
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
          L1: {
            var4 = decompiledCaughtException;
            stackOut_11_0 = (RuntimeException) var4;
            stackOut_11_1 = new StringBuilder().append("ad.K(");
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
              break L1;
            } else {
              stackOut_12_0 = (RuntimeException) (Object) stackIn_12_0;
              stackOut_12_1 = (StringBuilder) (Object) stackIn_12_1;
              stackOut_12_2 = "{...}";
              stackIn_15_0 = stackOut_12_0;
              stackIn_15_1 = stackOut_12_1;
              stackIn_15_2 = stackOut_12_2;
              break L1;
            }
          }
          L2: {
            stackOut_15_0 = (RuntimeException) (Object) stackIn_15_0;
            stackOut_15_1 = ((StringBuilder) (Object) stackIn_15_1).append(stackIn_15_2).append(',').append(param1).append(',');
            stackIn_18_0 = stackOut_15_0;
            stackIn_18_1 = stackOut_15_1;
            stackIn_16_0 = stackOut_15_0;
            stackIn_16_1 = stackOut_15_1;
            if (param2 == null) {
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
          throw la.a((Throwable) (Object) stackIn_19_0, stackIn_19_2 + ')');
        }
        return stackIn_10_0;
    }

    private final synchronized byte[] a(int param0, int[] param1, int param2, byte param3) {
        Object var5 = null;
        int var6 = 0;
        Object stackIn_4_0 = null;
        Object stackIn_7_0 = null;
        Object stackIn_19_0 = null;
        Object stackIn_45_0 = null;
        Object stackIn_47_0 = null;
        StringBuilder stackIn_47_1 = null;
        Object stackIn_49_0 = null;
        StringBuilder stackIn_49_1 = null;
        Object stackIn_50_0 = null;
        StringBuilder stackIn_50_1 = null;
        String stackIn_50_2 = null;
        RuntimeException decompiledCaughtException = null;
        Object stackOut_3_0 = null;
        Object stackOut_18_0 = null;
        Object stackOut_44_0 = null;
        Object stackOut_6_0 = null;
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
            if (!this.a(param2, param0, 0)) {
              stackOut_3_0 = null;
              stackIn_4_0 = stackOut_3_0;
              return (byte[]) (Object) stackIn_4_0;
            } else {
              if (param3 <= -30) {
                L1: {
                  L2: {
                    var5 = null;
                    if (null == ((ad) this).field_i[param2]) {
                      break L2;
                    } else {
                      if (((ad) this).field_i[param2][param0] != null) {
                        break L1;
                      } else {
                        break L2;
                      }
                    }
                  }
                  var6 = this.a((byte) -12, param1, param0, param2) ? 1 : 0;
                  if (var6 == 0) {
                    this.a(3, param2);
                    var6 = this.a((byte) -12, param1, param0, param2) ? 1 : 0;
                    if (var6 == 0) {
                      stackOut_18_0 = null;
                      stackIn_19_0 = stackOut_18_0;
                      return (byte[]) (Object) stackIn_19_0;
                    } else {
                      break L1;
                    }
                  } else {
                    break L1;
                  }
                }
                if (null == ((ad) this).field_i[param2]) {
                  throw new RuntimeException("");
                } else {
                  L3: {
                    if (((ad) this).field_i[param2][param0] == null) {
                      break L3;
                    } else {
                      var5 = (Object) (Object) uj.a(43, ((ad) this).field_i[param2][param0], false);
                      if (null == var5) {
                        throw new RuntimeException("");
                      } else {
                        break L3;
                      }
                    }
                  }
                  L4: {
                    if (null != var5) {
                      L5: {
                        if (((ad) this).field_e == 1) {
                          break L5;
                        } else {
                          if (2 == ((ad) this).field_e) {
                            ((ad) this).field_i[param2] = null;
                            if (!MonkeyPuzzle2.field_F) {
                              break L4;
                            } else {
                              break L5;
                            }
                          } else {
                            break L4;
                          }
                        }
                      }
                      ((ad) this).field_i[param2][param0] = null;
                      if (((ad) this).field_a.field_r[param2] != 1) {
                        break L4;
                      } else {
                        ((ad) this).field_i[param2] = null;
                        break L4;
                      }
                    } else {
                      break L4;
                    }
                  }
                  stackOut_44_0 = var5;
                  stackIn_45_0 = stackOut_44_0;
                  break L0;
                }
              } else {
                stackOut_6_0 = null;
                stackIn_7_0 = stackOut_6_0;
                return (byte[]) (Object) stackIn_7_0;
              }
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L6: {
            var5 = (Object) (Object) decompiledCaughtException;
            stackOut_46_0 = var5;
            stackOut_46_1 = new StringBuilder().append("ad.N(").append(param0).append(',');
            stackIn_49_0 = stackOut_46_0;
            stackIn_49_1 = stackOut_46_1;
            stackIn_47_0 = stackOut_46_0;
            stackIn_47_1 = stackOut_46_1;
            if (param1 == null) {
              stackOut_49_0 = stackIn_49_0;
              stackOut_49_1 = (StringBuilder) (Object) stackIn_49_1;
              stackOut_49_2 = "null";
              stackIn_50_0 = stackOut_49_0;
              stackIn_50_1 = stackOut_49_1;
              stackIn_50_2 = stackOut_49_2;
              break L6;
            } else {
              stackOut_47_0 = stackIn_47_0;
              stackOut_47_1 = (StringBuilder) (Object) stackIn_47_1;
              stackOut_47_2 = "{...}";
              stackIn_50_0 = stackOut_47_0;
              stackIn_50_1 = stackOut_47_1;
              stackIn_50_2 = stackOut_47_2;
              break L6;
            }
          }
          throw la.a((Throwable) (Object) stackIn_50_0, stackIn_50_2 + ',' + param2 + ',' + param3 + ')');
        }
        return (byte[]) (Object) stackIn_45_0;
    }

    final synchronized boolean c(int param0, int param1, int param2) {
        int var4_int = 0;
        RuntimeException var4 = null;
        int stackIn_4_0 = 0;
        int stackIn_10_0 = 0;
        int stackIn_13_0 = 0;
        int stackIn_16_0 = 0;
        int stackIn_18_0 = 0;
        RuntimeException decompiledCaughtException = null;
        int stackOut_3_0 = 0;
        int stackOut_9_0 = 0;
        int stackOut_17_0 = 0;
        int stackOut_15_0 = 0;
        int stackOut_12_0 = 0;
        try {
          L0: {
            var4_int = 43 / ((param2 - 5) / 50);
            if (!this.a(param0, param1, 0)) {
              stackOut_3_0 = 0;
              stackIn_4_0 = stackOut_3_0;
              return stackIn_4_0 != 0;
            } else {
              L1: {
                if (((ad) this).field_i[param0] == null) {
                  break L1;
                } else {
                  if (null == ((ad) this).field_i[param0][param1]) {
                    break L1;
                  } else {
                    stackOut_9_0 = 1;
                    stackIn_10_0 = stackOut_9_0;
                    return stackIn_10_0 != 0;
                  }
                }
              }
              if (((ad) this).field_h[param0] == null) {
                this.a(3, param0);
                if (null == ((ad) this).field_h[param0]) {
                  stackOut_17_0 = 0;
                  stackIn_18_0 = stackOut_17_0;
                  break L0;
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
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var4 = decompiledCaughtException;
          throw la.a((Throwable) (Object) var4, "ad.U(" + param0 + ',' + param1 + ',' + param2 + ')');
        }
        return stackIn_18_0 != 0;
    }

    final boolean a(int param0, String param1) {
        int var3_int = 0;
        RuntimeException var3 = null;
        int stackIn_5_0 = 0;
        boolean stackIn_7_0 = false;
        RuntimeException stackIn_9_0 = null;
        StringBuilder stackIn_9_1 = null;
        RuntimeException stackIn_11_0 = null;
        StringBuilder stackIn_11_1 = null;
        RuntimeException stackIn_12_0 = null;
        StringBuilder stackIn_12_1 = null;
        String stackIn_12_2 = null;
        RuntimeException decompiledCaughtException = null;
        boolean stackOut_6_0 = false;
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
              if (param0 == 0) {
                break L1;
              } else {
                boolean discarded$2 = ((ad) this).b(93);
                break L1;
              }
            }
            if (((ad) this).a(118)) {
              param1 = param1.toLowerCase();
              var3_int = ((ad) this).field_a.field_b.a(true, ra.a((byte) 115, (CharSequence) (Object) param1));
              stackOut_6_0 = ((ad) this).a(false, var3_int);
              stackIn_7_0 = stackOut_6_0;
              break L0;
            } else {
              stackOut_4_0 = 0;
              stackIn_5_0 = stackOut_4_0;
              return stackIn_5_0 != 0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L2: {
            var3 = decompiledCaughtException;
            stackOut_8_0 = (RuntimeException) var3;
            stackOut_8_1 = new StringBuilder().append("ad.E(").append(param0).append(',');
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
          throw la.a((Throwable) (Object) stackIn_12_0, stackIn_12_2 + ')');
        }
        return stackIn_7_0;
    }

    final static void a(String param0, int param1, float param2) {
        RuntimeException runtimeException = null;
        RuntimeException stackIn_4_0 = null;
        StringBuilder stackIn_4_1 = null;
        RuntimeException stackIn_6_0 = null;
        StringBuilder stackIn_6_1 = null;
        RuntimeException stackIn_7_0 = null;
        StringBuilder stackIn_7_1 = null;
        String stackIn_7_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException stackOut_3_0 = null;
        StringBuilder stackOut_3_1 = null;
        RuntimeException stackOut_6_0 = null;
        StringBuilder stackOut_6_1 = null;
        String stackOut_6_2 = null;
        RuntimeException stackOut_4_0 = null;
        StringBuilder stackOut_4_1 = null;
        String stackOut_4_2 = null;
        try {
          L0: {
            L1: {
              pj.field_h = param2;
              be.field_d = param0;
              if (param1 == -24119) {
                break L1;
              } else {
                field_f = null;
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
            stackOut_3_1 = new StringBuilder().append("ad.C(");
            stackIn_6_0 = stackOut_3_0;
            stackIn_6_1 = stackOut_3_1;
            stackIn_4_0 = stackOut_3_0;
            stackIn_4_1 = stackOut_3_1;
            if (param0 == null) {
              stackOut_6_0 = (RuntimeException) (Object) stackIn_6_0;
              stackOut_6_1 = (StringBuilder) (Object) stackIn_6_1;
              stackOut_6_2 = "null";
              stackIn_7_0 = stackOut_6_0;
              stackIn_7_1 = stackOut_6_1;
              stackIn_7_2 = stackOut_6_2;
              break L2;
            } else {
              stackOut_4_0 = (RuntimeException) (Object) stackIn_4_0;
              stackOut_4_1 = (StringBuilder) (Object) stackIn_4_1;
              stackOut_4_2 = "{...}";
              stackIn_7_0 = stackOut_4_0;
              stackIn_7_1 = stackOut_4_1;
              stackIn_7_2 = stackOut_4_2;
              break L2;
            }
          }
          throw la.a((Throwable) (Object) stackIn_7_0, stackIn_7_2 + ',' + param1 + ',' + param2 + ')');
        }
    }

    final int c(String param0, byte param1) {
        int var3_int = 0;
        RuntimeException var3 = null;
        int stackIn_2_0 = 0;
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
        int stackOut_9_0 = 0;
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
            if (((ad) this).a(112)) {
              L1: {
                if (param1 == -105) {
                  break L1;
                } else {
                  field_j = null;
                  break L1;
                }
              }
              param0 = param0.toLowerCase();
              var3_int = ((ad) this).field_a.field_b.a(true, ra.a((byte) -14, (CharSequence) (Object) param0));
              if (!this.a((byte) 73, var3_int)) {
                stackOut_9_0 = -1;
                stackIn_10_0 = stackOut_9_0;
                return stackIn_10_0;
              } else {
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
            stackOut_13_1 = new StringBuilder().append("ad.M(");
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
          throw la.a((Throwable) (Object) stackIn_17_0, stackIn_17_2 + ',' + param1 + ')');
        }
        return stackIn_12_0;
    }

    final synchronized boolean a(boolean param0, int param1) {
        RuntimeException var3 = null;
        int stackIn_2_0 = 0;
        int stackIn_7_0 = 0;
        int stackIn_10_0 = 0;
        boolean stackIn_13_0 = false;
        int stackIn_15_0 = 0;
        RuntimeException decompiledCaughtException = null;
        int stackOut_6_0 = 0;
        int stackOut_14_0 = 0;
        boolean stackOut_12_0 = false;
        int stackOut_9_0 = 0;
        int stackOut_1_0 = 0;
        try {
          L0: {
            if (this.a((byte) 124, param1)) {
              if (null != ((ad) this).field_h[param1]) {
                stackOut_6_0 = 1;
                stackIn_7_0 = stackOut_6_0;
                return stackIn_7_0 != 0;
              } else {
                this.a(3, param1);
                if (((ad) this).field_h[param1] == null) {
                  if (!param0) {
                    stackOut_14_0 = 0;
                    stackIn_15_0 = stackOut_14_0;
                    break L0;
                  } else {
                    stackOut_12_0 = ((boolean[]) ((ad) this).field_h[1])[8];
                    stackIn_13_0 = stackOut_12_0;
                    return stackIn_13_0;
                  }
                } else {
                  stackOut_9_0 = 1;
                  stackIn_10_0 = stackOut_9_0;
                  return stackIn_10_0 != 0;
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
          throw la.a((Throwable) (Object) var3, "ad.W(" + param0 + ',' + param1 + ')');
        }
        return stackIn_15_0 != 0;
    }

    private final synchronized boolean a(byte param0, int param1) {
        RuntimeException var3 = null;
        int stackIn_2_0 = 0;
        int stackIn_14_0 = 0;
        int stackIn_20_0 = 0;
        RuntimeException decompiledCaughtException = null;
        int stackOut_19_0 = 0;
        int stackOut_13_0 = 0;
        int stackOut_1_0 = 0;
        try {
          L0: {
            if (((ad) this).a(-18)) {
              L1: {
                if (param1 < 0) {
                  break L1;
                } else {
                  if (~((ad) this).field_a.field_r.length >= ~param1) {
                    break L1;
                  } else {
                    if (((ad) this).field_a.field_r[param1] == 0) {
                      break L1;
                    } else {
                      L2: {
                        if (param0 >= 64) {
                          break L2;
                        } else {
                          int discarded$2 = ((ad) this).b(0, 17);
                          break L2;
                        }
                      }
                      stackOut_19_0 = 1;
                      stackIn_20_0 = stackOut_19_0;
                      break L0;
                    }
                  }
                }
              }
              if (mg.field_t) {
                throw new IllegalArgumentException(Integer.toString(param1));
              } else {
                stackOut_13_0 = 0;
                stackIn_14_0 = stackOut_13_0;
                return stackIn_14_0 != 0;
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
          throw la.a((Throwable) (Object) var3, "ad.R(" + param0 + ',' + param1 + ')');
        }
        return stackIn_20_0 != 0;
    }

    final boolean b(String param0, byte param1) {
        int var3_int = 0;
        RuntimeException var3 = null;
        int var4 = 0;
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
            if (((ad) this).a(-63)) {
              var3_int = 20 % ((param1 - -58) / 43);
              param0 = param0.toLowerCase();
              var4 = ((ad) this).field_a.field_b.a(true, ra.a((byte) 104, (CharSequence) (Object) param0));
              if (var4 >= 0) {
                stackOut_6_0 = 1;
                stackIn_7_0 = stackOut_6_0;
                break L0;
              } else {
                stackOut_4_0 = 0;
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
          L1: {
            var3 = decompiledCaughtException;
            stackOut_8_0 = (RuntimeException) var3;
            stackOut_8_1 = new StringBuilder().append("ad.S(");
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
          throw la.a((Throwable) (Object) stackIn_12_0, stackIn_12_2 + ',' + param1 + ')');
        }
        return stackIn_7_0 != 0;
    }

    private final synchronized void a(int param0, int param1) {
        RuntimeException var3 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          L0: {
            if (param0 == 3) {
              L1: {
                L2: {
                  if (!((ad) this).field_b) {
                    break L2;
                  } else {
                    ((ad) this).field_h[param1] = (Object) (Object) ((ad) this).field_c.b(-113, param1);
                    if (!MonkeyPuzzle2.field_F) {
                      break L1;
                    } else {
                      break L2;
                    }
                  }
                }
                ((ad) this).field_h[param1] = p.a(((ad) this).field_c.b(-116, param1), (byte) 111, false);
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
          throw la.a((Throwable) (Object) var3, "ad.O(" + param0 + ',' + param1 + ')');
        }
    }

    private final synchronized boolean a(byte param0, int[] param1, int param2, int param3) {
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
        gk var10_ref = null;
        RuntimeException var11_ref_RuntimeException = null;
        int var11 = 0;
        int var12 = 0;
        gk var13 = null;
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
        int stackIn_78_0 = 0;
        int stackIn_87_0 = 0;
        int stackIn_97_0 = 0;
        int stackIn_106_0 = 0;
        int stackIn_125_0 = 0;
        int stackIn_139_0 = 0;
        int stackIn_141_0 = 0;
        int stackIn_145_0 = 0;
        int stackIn_162_0 = 0;
        RuntimeException stackIn_164_0 = null;
        StringBuilder stackIn_164_1 = null;
        RuntimeException stackIn_166_0 = null;
        StringBuilder stackIn_166_1 = null;
        RuntimeException stackIn_167_0 = null;
        StringBuilder stackIn_167_1 = null;
        String stackIn_167_2 = null;
        RuntimeException decompiledCaughtException = null;
        int stackOut_4_0 = 0;
        int stackOut_28_0 = 0;
        RuntimeException stackOut_47_0 = null;
        StringBuilder stackOut_47_1 = null;
        RuntimeException stackOut_50_0 = null;
        StringBuilder stackOut_50_1 = null;
        int stackOut_50_2 = 0;
        RuntimeException stackOut_48_0 = null;
        StringBuilder stackOut_48_1 = null;
        int stackOut_48_2 = 0;
        int stackOut_77_0 = 0;
        int stackOut_86_0 = 0;
        int stackOut_96_0 = 0;
        int stackOut_105_0 = 0;
        int stackOut_124_0 = 0;
        int stackOut_138_0 = 0;
        int stackOut_144_0 = 0;
        int stackOut_140_0 = 0;
        int stackOut_161_0 = 0;
        int stackOut_7_0 = 0;
        RuntimeException stackOut_163_0 = null;
        StringBuilder stackOut_163_1 = null;
        RuntimeException stackOut_166_0 = null;
        StringBuilder stackOut_166_1 = null;
        String stackOut_166_2 = null;
        RuntimeException stackOut_164_0 = null;
        StringBuilder stackOut_164_1 = null;
        String stackOut_164_2 = null;
        var22 = MonkeyPuzzle2.field_F ? 1 : 0;
        try {
          L0: {
            if (!this.a((byte) 88, param3)) {
              stackOut_4_0 = 0;
              stackIn_5_0 = stackOut_4_0;
              return stackIn_5_0 != 0;
            } else {
              if (((ad) this).field_h[param3] != null) {
                L1: {
                  var5_int = ((ad) this).field_a.field_m[param3];
                  var6 = ((ad) this).field_a.field_a[param3];
                  if (((ad) this).field_i[param3] != null) {
                    break L1;
                  } else {
                    ((ad) this).field_i[param3] = new Object[((ad) this).field_a.field_r[param3]];
                    break L1;
                  }
                }
                var7 = ((ad) this).field_i[param3];
                var8 = 1;
                var9_int = 0;
                L2: while (true) {
                  L3: {
                    L4: {
                      if (~var5_int >= ~var9_int) {
                        break L4;
                      } else {
                        if (var22 != 0) {
                          break L3;
                        } else {
                          L5: {
                            L6: {
                              if (null == var6) {
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
                            if (var7[var10_int] == null) {
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
                      break L3;
                    } else {
                      stackOut_28_0 = 1;
                      stackIn_29_0 = stackOut_28_0;
                      return stackIn_29_0 != 0;
                    }
                  }
                  L8: {
                    L9: {
                      if (param1 == null) {
                        break L9;
                      } else {
                        L10: {
                          if (param1[0] != 0) {
                            break L10;
                          } else {
                            if (param1[1] != 0) {
                              break L10;
                            } else {
                              if (param1[2] != 0) {
                                break L10;
                              } else {
                                if (0 != param1[3]) {
                                  break L10;
                                } else {
                                  break L9;
                                }
                              }
                            }
                          }
                        }
                        var9_array = uj.a(59, ((ad) this).field_h[param3], true);
                        var10_ref = new gk(var9_array);
                        var10_ref.a(5, var10_ref.field_g.length, -84, param1);
                        break L8;
                      }
                    }
                    var9_array = uj.a(67, ((ad) this).field_h[param3], false);
                    break L8;
                  }
                  try {
                    L11: {
                      var10 = rc.a(var9_array, 120);
                      break L11;
                    }
                  } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
                    decompiledCaughtException = decompiledCaughtParameter0;
                    L12: {
                      var11_ref_RuntimeException = decompiledCaughtException;
                      stackOut_47_0 = (RuntimeException) var11_ref_RuntimeException;
                      stackOut_47_1 = new StringBuilder();
                      stackIn_50_0 = stackOut_47_0;
                      stackIn_50_1 = stackOut_47_1;
                      stackIn_48_0 = stackOut_47_0;
                      stackIn_48_1 = stackOut_47_1;
                      if (param1 == null) {
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
                    throw la.a((Throwable) (Object) stackIn_51_0, (stackIn_51_2 != 0) + " " + param3 + " " + var9_array.length + " " + w.a(var9_array.length, var9_array, -18694) + " " + w.a(-2 + var9_array.length, var9_array, param0 ^ 18702) + " " + ((ad) this).field_a.field_j[param3] + " " + ((ad) this).field_a.field_d);
                  }
                  L13: {
                    if (param0 == -12) {
                      break L13;
                    } else {
                      int discarded$1 = ((ad) this).a((String) ((ad) this).field_h[11], (byte) 73);
                      break L13;
                    }
                  }
                  L14: {
                    if (((ad) this).field_b) {
                      ((ad) this).field_h[param3] = null;
                      break L14;
                    } else {
                      break L14;
                    }
                  }
                  L15: {
                    L16: {
                      L17: {
                        if (var5_int > 1) {
                          break L17;
                        } else {
                          L18: {
                            L19: {
                              if (null != var6) {
                                break L19;
                              } else {
                                var11 = 0;
                                if (var22 == 0) {
                                  break L18;
                                } else {
                                  break L19;
                                }
                              }
                            }
                            var11 = var6[0];
                            break L18;
                          }
                          L20: {
                            L21: {
                              if (((ad) this).field_e == 0) {
                                break L21;
                              } else {
                                var7[var11] = (Object) (Object) var10;
                                if (var22 == 0) {
                                  break L20;
                                } else {
                                  break L21;
                                }
                              }
                            }
                            var7[var11] = p.a(var10, (byte) 110, false);
                            break L20;
                          }
                          if (var22 == 0) {
                            break L16;
                          } else {
                            break L17;
                          }
                        }
                      }
                      L22: {
                        if (((ad) this).field_e == 2) {
                          break L22;
                        } else {
                          var11 = var10.length;
                          var11--;
                          var12 = 255 & var10[var11];
                          var11 = var11 - var5_int * var12 * 4;
                          var13 = new gk(var10);
                          var13.field_h = var11;
                          var14_ref_int__ = new int[var5_int];
                          var15 = 0;
                          L23: while (true) {
                            L24: {
                              L25: {
                                if (~var12 >= ~var15) {
                                  break L25;
                                } else {
                                  var16_int = 0;
                                  stackOut_77_0 = 0;
                                  stackIn_87_0 = stackOut_77_0;
                                  stackIn_78_0 = stackOut_77_0;
                                  if (var22 != 0) {
                                    break L24;
                                  } else {
                                    var17 = stackIn_78_0;
                                    L26: while (true) {
                                      L27: {
                                        L28: {
                                          if (~var5_int >= ~var17) {
                                            break L28;
                                          } else {
                                            var16_int = var16_int + var13.e(-30);
                                            var14_ref_int__[var17] = var14_ref_int__[var17] + var16_int;
                                            var17++;
                                            if (var22 != 0) {
                                              break L27;
                                            } else {
                                              if (var22 == 0) {
                                                continue L26;
                                              } else {
                                                break L28;
                                              }
                                            }
                                          }
                                        }
                                        var15++;
                                        break L27;
                                      }
                                      if (var22 == 0) {
                                        continue L23;
                                      } else {
                                        break L25;
                                      }
                                    }
                                  }
                                }
                              }
                              stackOut_86_0 = var5_int;
                              stackIn_87_0 = stackOut_86_0;
                              break L24;
                            }
                            var15_ref_byte____ = new byte[stackIn_87_0][];
                            var16_int = 0;
                            L29: while (true) {
                              L30: {
                                L31: {
                                  if (~var5_int >= ~var16_int) {
                                    break L31;
                                  } else {
                                    var15_ref_byte____[var16_int] = new byte[var14_ref_int__[var16_int]];
                                    var14_ref_int__[var16_int] = 0;
                                    var16_int++;
                                    if (var22 != 0) {
                                      break L30;
                                    } else {
                                      if (var22 == 0) {
                                        continue L29;
                                      } else {
                                        break L31;
                                      }
                                    }
                                  }
                                }
                                var13.field_h = var11;
                                var16_int = 0;
                                break L30;
                              }
                              var17 = 0;
                              L32: while (true) {
                                L33: {
                                  L34: {
                                    if (var12 <= var17) {
                                      break L34;
                                    } else {
                                      var18 = 0;
                                      stackOut_96_0 = 0;
                                      stackIn_106_0 = stackOut_96_0;
                                      stackIn_97_0 = stackOut_96_0;
                                      if (var22 != 0) {
                                        break L33;
                                      } else {
                                        var19 = stackIn_97_0;
                                        L35: while (true) {
                                          L36: {
                                            L37: {
                                              if (var19 >= var5_int) {
                                                break L37;
                                              } else {
                                                var18 = var18 + var13.e(-95);
                                                gl.a(var10, var16_int, var15_ref_byte____[var19], var14_ref_int__[var19], var18);
                                                var14_ref_int__[var19] = var14_ref_int__[var19] + var18;
                                                var16_int = var16_int + var18;
                                                var19++;
                                                if (var22 != 0) {
                                                  break L36;
                                                } else {
                                                  if (var22 == 0) {
                                                    continue L35;
                                                  } else {
                                                    break L37;
                                                  }
                                                }
                                              }
                                            }
                                            var17++;
                                            break L36;
                                          }
                                          if (var22 == 0) {
                                            continue L32;
                                          } else {
                                            break L34;
                                          }
                                        }
                                      }
                                    }
                                  }
                                  stackOut_105_0 = 0;
                                  stackIn_106_0 = stackOut_105_0;
                                  break L33;
                                }
                                var17 = stackIn_106_0;
                                L38: while (true) {
                                  L39: {
                                    if (var17 >= var5_int) {
                                      break L39;
                                    } else {
                                      if (var22 != 0) {
                                        break L16;
                                      } else {
                                        L40: {
                                          L41: {
                                            if (var6 != null) {
                                              break L41;
                                            } else {
                                              var18 = var17;
                                              if (var22 == 0) {
                                                break L40;
                                              } else {
                                                break L41;
                                              }
                                            }
                                          }
                                          var18 = var6[var17];
                                          break L40;
                                        }
                                        L42: {
                                          L43: {
                                            if (((ad) this).field_e != 0) {
                                              break L43;
                                            } else {
                                              var7[var18] = p.a(var15_ref_byte____[var17], (byte) 117, false);
                                              if (var22 == 0) {
                                                break L42;
                                              } else {
                                                break L43;
                                              }
                                            }
                                          }
                                          var7[var18] = (Object) (Object) var15_ref_byte____[var17];
                                          break L42;
                                        }
                                        var17++;
                                        if (var22 == 0) {
                                          continue L38;
                                        } else {
                                          break L39;
                                        }
                                      }
                                    }
                                  }
                                  if (var22 == 0) {
                                    break L16;
                                  } else {
                                    break L22;
                                  }
                                }
                              }
                            }
                          }
                        }
                      }
                      var11 = var10.length;
                      var11--;
                      var12 = 255 & var10[var11];
                      var11 = var11 - 4 * var5_int * var12;
                      var13 = new gk(var10);
                      var14 = 0;
                      var15 = 0;
                      var13.field_h = var11;
                      var16_int = 0;
                      L44: while (true) {
                        L45: {
                          L46: {
                            if (~var16_int <= ~var12) {
                              break L46;
                            } else {
                              var17 = 0;
                              stackOut_124_0 = 0;
                              stackIn_139_0 = stackOut_124_0;
                              stackIn_125_0 = stackOut_124_0;
                              if (var22 != 0) {
                                break L45;
                              } else {
                                var18 = stackIn_125_0;
                                L47: while (true) {
                                  L48: {
                                    L49: {
                                      if (~var18 <= ~var5_int) {
                                        break L49;
                                      } else {
                                        var17 = var17 + var13.e(param0 ^ -118);
                                        if (var22 != 0) {
                                          break L48;
                                        } else {
                                          L50: {
                                            L51: {
                                              if (null != var6) {
                                                break L51;
                                              } else {
                                                var19 = var18;
                                                if (var22 == 0) {
                                                  break L50;
                                                } else {
                                                  break L51;
                                                }
                                              }
                                            }
                                            var19 = var6[var18];
                                            break L50;
                                          }
                                          L52: {
                                            if (param2 != var19) {
                                              break L52;
                                            } else {
                                              var14 = var14 + var17;
                                              var15 = var19;
                                              break L52;
                                            }
                                          }
                                          var18++;
                                          if (var22 == 0) {
                                            continue L47;
                                          } else {
                                            break L49;
                                          }
                                        }
                                      }
                                    }
                                    var16_int++;
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
                          stackOut_138_0 = var14;
                          stackIn_139_0 = stackOut_138_0;
                          break L45;
                        }
                        if (stackIn_139_0 != 0) {
                          var16 = new byte[var14];
                          var14 = 0;
                          var13.field_h = var11;
                          var17 = 0;
                          var18 = 0;
                          L53: while (true) {
                            L54: {
                              if (~var12 >= ~var18) {
                                break L54;
                              } else {
                                var19 = 0;
                                stackOut_144_0 = 0;
                                stackIn_162_0 = stackOut_144_0;
                                stackIn_145_0 = stackOut_144_0;
                                if (var22 != 0) {
                                  break L15;
                                } else {
                                  var20 = stackIn_145_0;
                                  L55: while (true) {
                                    L56: {
                                      L57: {
                                        if (~var20 <= ~var5_int) {
                                          break L57;
                                        } else {
                                          var19 = var19 + var13.e(param0 + -102);
                                          if (var22 != 0) {
                                            break L56;
                                          } else {
                                            L58: {
                                              L59: {
                                                if (var6 == null) {
                                                  break L59;
                                                } else {
                                                  var21 = var6[var20];
                                                  if (var22 == 0) {
                                                    break L58;
                                                  } else {
                                                    break L59;
                                                  }
                                                }
                                              }
                                              var21 = var20;
                                              break L58;
                                            }
                                            L60: {
                                              if (~param2 == ~var21) {
                                                gl.a(var10, var17, var16, var14, var19);
                                                var14 = var14 + var19;
                                                break L60;
                                              } else {
                                                break L60;
                                              }
                                            }
                                            var17 = var17 + var19;
                                            var20++;
                                            if (var22 == 0) {
                                              continue L55;
                                            } else {
                                              break L57;
                                            }
                                          }
                                        }
                                      }
                                      var18++;
                                      break L56;
                                    }
                                    if (var22 == 0) {
                                      continue L53;
                                    } else {
                                      break L54;
                                    }
                                  }
                                }
                              }
                            }
                            var7[var15] = (Object) (Object) var16;
                            break L16;
                          }
                        } else {
                          stackOut_140_0 = 1;
                          stackIn_141_0 = stackOut_140_0;
                          return stackIn_141_0 != 0;
                        }
                      }
                    }
                    stackOut_161_0 = 1;
                    stackIn_162_0 = stackOut_161_0;
                    break L15;
                  }
                  break L0;
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
          L61: {
            var5 = decompiledCaughtException;
            stackOut_163_0 = (RuntimeException) var5;
            stackOut_163_1 = new StringBuilder().append("ad.V(").append(param0).append(',');
            stackIn_166_0 = stackOut_163_0;
            stackIn_166_1 = stackOut_163_1;
            stackIn_164_0 = stackOut_163_0;
            stackIn_164_1 = stackOut_163_1;
            if (param1 == null) {
              stackOut_166_0 = (RuntimeException) (Object) stackIn_166_0;
              stackOut_166_1 = (StringBuilder) (Object) stackIn_166_1;
              stackOut_166_2 = "null";
              stackIn_167_0 = stackOut_166_0;
              stackIn_167_1 = stackOut_166_1;
              stackIn_167_2 = stackOut_166_2;
              break L61;
            } else {
              stackOut_164_0 = (RuntimeException) (Object) stackIn_164_0;
              stackOut_164_1 = (StringBuilder) (Object) stackIn_164_1;
              stackOut_164_2 = "{...}";
              stackIn_167_0 = stackOut_164_0;
              stackIn_167_1 = stackOut_164_1;
              stackIn_167_2 = stackOut_164_2;
              break L61;
            }
          }
          throw la.a((Throwable) (Object) stackIn_167_0, stackIn_167_2 + ',' + param2 + ',' + param3 + ')');
        }
        return stackIn_162_0 != 0;
    }

    final synchronized int b(boolean param0) {
        int var2_int = 0;
        RuntimeException var2 = null;
        int var3 = 0;
        int var4 = 0;
        int var5 = 0;
        int stackIn_5_0 = 0;
        int stackIn_12_0 = 0;
        int stackIn_12_1 = 0;
        int stackIn_19_0 = 0;
        int stackIn_19_1 = 0;
        int stackIn_22_0 = 0;
        int stackIn_24_0 = 0;
        RuntimeException decompiledCaughtException = null;
        int stackOut_4_0 = 0;
        int stackOut_11_0 = 0;
        int stackOut_11_1 = 0;
        int stackOut_18_0 = 0;
        int stackOut_18_1 = 0;
        int stackOut_21_0 = 0;
        int stackOut_23_0 = 0;
        var5 = MonkeyPuzzle2.field_F ? 1 : 0;
        try {
          L0: {
            if (!((ad) this).a(89)) {
              stackOut_4_0 = 0;
              stackIn_5_0 = stackOut_4_0;
              return stackIn_5_0;
            } else {
              L1: {
                if (param0) {
                  break L1;
                } else {
                  ((ad) this).field_e = 47;
                  break L1;
                }
              }
              var2_int = 0;
              var3 = 0;
              var4 = 0;
              L2: while (true) {
                L3: {
                  L4: {
                    if (~var4 <= ~((ad) this).field_h.length) {
                      break L4;
                    } else {
                      stackOut_11_0 = 0;
                      stackOut_11_1 = ((ad) this).field_a.field_m[var4];
                      stackIn_19_0 = stackOut_11_0;
                      stackIn_19_1 = stackOut_11_1;
                      stackIn_12_0 = stackOut_11_0;
                      stackIn_12_1 = stackOut_11_1;
                      if (var5 != 0) {
                        break L3;
                      } else {
                        L5: {
                          if (stackIn_12_0 < stackIn_12_1) {
                            var3 = var3 + ((ad) this).b(var4, 11619);
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
                  stackOut_18_0 = -1;
                  stackOut_18_1 = ~var2_int;
                  stackIn_19_0 = stackOut_18_0;
                  stackIn_19_1 = stackOut_18_1;
                  break L3;
                }
                if (stackIn_19_0 == stackIn_19_1) {
                  stackOut_21_0 = 100;
                  stackIn_22_0 = stackOut_21_0;
                  return stackIn_22_0;
                } else {
                  var4 = 100 * var3 / var2_int;
                  stackOut_23_0 = var4;
                  stackIn_24_0 = stackOut_23_0;
                  break L0;
                }
              }
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2 = decompiledCaughtException;
          throw la.a((Throwable) (Object) var2, "ad.AA(" + param0 + ')');
        }
        return stackIn_24_0;
    }

    final static boolean c(boolean param0) {
        RuntimeException var1 = null;
        boolean stackIn_4_0 = false;
        RuntimeException decompiledCaughtException = null;
        boolean stackOut_3_0 = false;
        try {
          L0: {
            L1: {
              if (!param0) {
                break L1;
              } else {
                field_g = null;
                break L1;
              }
            }
            stackOut_3_0 = oa.a((byte) -127, ii.a(false));
            stackIn_4_0 = stackOut_3_0;
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var1 = decompiledCaughtException;
          throw la.a((Throwable) (Object) var1, "ad.P(" + param0 + ')');
        }
        return stackIn_4_0;
    }

    final byte[] b(int param0, int param1, int param2) {
        RuntimeException var4 = null;
        byte[] stackIn_4_0 = null;
        RuntimeException decompiledCaughtException = null;
        byte[] stackOut_3_0 = null;
        try {
          L0: {
            L1: {
              if (param0 == 255) {
                break L1;
              } else {
                boolean discarded$2 = this.a((byte) 89, -23);
                break L1;
              }
            }
            stackOut_3_0 = this.a(param1, (int[]) null, param2, (byte) -85);
            stackIn_4_0 = stackOut_3_0;
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var4 = decompiledCaughtException;
          throw la.a((Throwable) (Object) var4, "ad.J(" + param0 + ',' + param1 + ',' + param2 + ')');
        }
        return stackIn_4_0;
    }

    final synchronized byte[] a(String param0, String param1, int param2) {
        int var4_int = 0;
        RuntimeException var4 = null;
        int var5 = 0;
        int var6 = 0;
        Object stackIn_4_0 = null;
        Object stackIn_9_0 = null;
        byte[] stackIn_11_0 = null;
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
        Object stackOut_3_0 = null;
        Object stackOut_8_0 = null;
        byte[] stackOut_10_0 = null;
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
            if (!((ad) this).a(85)) {
              stackOut_3_0 = null;
              stackIn_4_0 = stackOut_3_0;
              return (byte[]) (Object) stackIn_4_0;
            } else {
              param1 = param1.toLowerCase();
              param0 = param0.toLowerCase();
              var5 = 26 / ((-88 - param2) / 36);
              var4_int = ((ad) this).field_a.field_b.a(true, ra.a((byte) 125, (CharSequence) (Object) param1));
              if (!this.a((byte) 117, var4_int)) {
                stackOut_8_0 = null;
                stackIn_9_0 = stackOut_8_0;
                return (byte[]) (Object) stackIn_9_0;
              } else {
                var6 = ((ad) this).field_a.field_t[var4_int].a(true, ra.a((byte) -59, (CharSequence) (Object) param0));
                stackOut_10_0 = ((ad) this).b(255, var6, var4_int);
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
            stackOut_12_1 = new StringBuilder().append("ad.L(");
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
          throw la.a((Throwable) (Object) stackIn_20_0, stackIn_20_2 + ',' + param2 + ')');
        }
        return stackIn_11_0;
    }

    final static boolean a(boolean param0) {
        RuntimeException var1 = null;
        boolean stackIn_4_0 = false;
        RuntimeException decompiledCaughtException = null;
        boolean stackOut_3_0 = false;
        try {
          L0: {
            L1: {
              if (!param0) {
                break L1;
              } else {
                field_j = null;
                break L1;
              }
            }
            stackOut_3_0 = wd.field_g;
            stackIn_4_0 = stackOut_3_0;
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var1 = decompiledCaughtException;
          throw la.a((Throwable) (Object) var1, "ad.B(" + param0 + ')');
        }
        return stackIn_4_0;
    }

    private final synchronized boolean a(int param0, int param1, int param2) {
        RuntimeException var4 = null;
        int stackIn_2_0 = 0;
        int stackIn_17_0 = 0;
        int stackIn_20_0 = 0;
        RuntimeException decompiledCaughtException = null;
        int stackOut_19_0 = 0;
        int stackOut_16_0 = 0;
        int stackOut_1_0 = 0;
        try {
          L0: {
            if (((ad) this).a(param2 ^ -42)) {
              L1: {
                if (param0 < param2) {
                  break L1;
                } else {
                  if (param1 < 0) {
                    break L1;
                  } else {
                    if (((ad) this).field_a.field_r.length <= param0) {
                      break L1;
                    } else {
                      if (~param1 <= ~((ad) this).field_a.field_r[param0]) {
                        break L1;
                      } else {
                        stackOut_19_0 = 1;
                        stackIn_20_0 = stackOut_19_0;
                        break L0;
                      }
                    }
                  }
                }
              }
              if (mg.field_t) {
                throw new IllegalArgumentException(param0 + " " + param1);
              } else {
                stackOut_16_0 = 0;
                stackIn_17_0 = stackOut_16_0;
                return stackIn_17_0 != 0;
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
          throw la.a((Throwable) (Object) var4, "ad.A(" + param0 + ',' + param1 + ',' + param2 + ')');
        }
        return stackIn_20_0 != 0;
    }

    final static void a(java.applet.Applet param0, boolean param1) {
        RuntimeException runtimeException = null;
        RuntimeException stackIn_5_0 = null;
        StringBuilder stackIn_5_1 = null;
        RuntimeException stackIn_7_0 = null;
        StringBuilder stackIn_7_1 = null;
        RuntimeException stackIn_8_0 = null;
        StringBuilder stackIn_8_1 = null;
        String stackIn_8_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException stackOut_4_0 = null;
        StringBuilder stackOut_4_1 = null;
        RuntimeException stackOut_7_0 = null;
        StringBuilder stackOut_7_1 = null;
        String stackOut_7_2 = null;
        RuntimeException stackOut_5_0 = null;
        StringBuilder stackOut_5_1 = null;
        String stackOut_5_2 = null;
        try {
          L0: {
            if (param1) {
              mk.a("", (byte) -5, param0);
              l.a(param0, -106);
              break L0;
            } else {
              return;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L1: {
            runtimeException = decompiledCaughtException;
            stackOut_4_0 = (RuntimeException) runtimeException;
            stackOut_4_1 = new StringBuilder().append("ad.T(");
            stackIn_7_0 = stackOut_4_0;
            stackIn_7_1 = stackOut_4_1;
            stackIn_5_0 = stackOut_4_0;
            stackIn_5_1 = stackOut_4_1;
            if (param0 == null) {
              stackOut_7_0 = (RuntimeException) (Object) stackIn_7_0;
              stackOut_7_1 = (StringBuilder) (Object) stackIn_7_1;
              stackOut_7_2 = "null";
              stackIn_8_0 = stackOut_7_0;
              stackIn_8_1 = stackOut_7_1;
              stackIn_8_2 = stackOut_7_2;
              break L1;
            } else {
              stackOut_5_0 = (RuntimeException) (Object) stackIn_5_0;
              stackOut_5_1 = (StringBuilder) (Object) stackIn_5_1;
              stackOut_5_2 = "{...}";
              stackIn_8_0 = stackOut_5_0;
              stackIn_8_1 = stackOut_5_1;
              stackIn_8_2 = stackOut_5_2;
              break L1;
            }
          }
          throw la.a((Throwable) (Object) stackIn_8_0, stackIn_8_2 + ',' + param1 + ')');
        }
    }

    final synchronized boolean a(int param0) {
        int var2_int = 0;
        RuntimeException var2 = null;
        int stackIn_5_0 = 0;
        int stackIn_8_0 = 0;
        RuntimeException decompiledCaughtException = null;
        int stackOut_4_0 = 0;
        int stackOut_7_0 = 0;
        try {
          L0: {
            L1: {
              if (((ad) this).field_a != null) {
                break L1;
              } else {
                ((ad) this).field_a = ((ad) this).field_c.a((byte) 80);
                if (((ad) this).field_a != null) {
                  ((ad) this).field_h = new Object[((ad) this).field_a.field_e];
                  ((ad) this).field_i = new Object[((ad) this).field_a.field_e][];
                  break L1;
                } else {
                  stackOut_4_0 = 0;
                  stackIn_5_0 = stackOut_4_0;
                  return stackIn_5_0 != 0;
                }
              }
            }
            var2_int = -110 / ((param0 - 24) / 38);
            stackOut_7_0 = 1;
            stackIn_8_0 = stackOut_7_0;
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2 = decompiledCaughtException;
          throw la.a((Throwable) (Object) var2, "ad.D(" + param0 + ')');
        }
        return stackIn_8_0 != 0;
    }

    final synchronized boolean b(int param0) {
        int var2_int = 0;
        RuntimeException var2 = null;
        int var3 = 0;
        int var4 = 0;
        int var5 = 0;
        int stackIn_3_0 = 0;
        int stackIn_7_0 = 0;
        int stackIn_16_0 = 0;
        RuntimeException decompiledCaughtException = null;
        int stackOut_6_0 = 0;
        int stackOut_15_0 = 0;
        int stackOut_2_0 = 0;
        var5 = MonkeyPuzzle2.field_F ? 1 : 0;
        try {
          L0: {
            if (((ad) this).a(-123)) {
              var2_int = 1;
              var3 = param0;
              L1: while (true) {
                L2: {
                  L3: {
                    if (var3 >= ((ad) this).field_a.field_f.length) {
                      break L3;
                    } else {
                      stackOut_6_0 = ((ad) this).field_a.field_f[var3];
                      stackIn_16_0 = stackOut_6_0;
                      stackIn_7_0 = stackOut_6_0;
                      if (var5 != 0) {
                        break L2;
                      } else {
                        L4: {
                          var4 = stackIn_7_0;
                          if (((ad) this).field_h[var4] != null) {
                            break L4;
                          } else {
                            this.a(3, var4);
                            if (null == ((ad) this).field_h[var4]) {
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
                  stackOut_15_0 = var2_int;
                  stackIn_16_0 = stackOut_15_0;
                  break L2;
                }
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
          throw la.a((Throwable) (Object) var2, "ad.BA(" + param0 + ')');
        }
        return stackIn_16_0 != 0;
    }

    final int a(String param0, int param1, int param2) {
        int var4_int = 0;
        RuntimeException var4 = null;
        int stackIn_2_0 = 0;
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
        int stackOut_9_0 = 0;
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
            if (this.a((byte) 96, param1)) {
              L1: {
                param0 = param0.toLowerCase();
                var4_int = ((ad) this).field_a.field_t[param1].a(true, ra.a((byte) 3, (CharSequence) (Object) param0));
                if (param2 == -28459) {
                  break L1;
                } else {
                  ((int[]) ((Object[]) ((Object[]) ((ad) this).field_h[1])[14])[2])[0] = -43;
                  break L1;
                }
              }
              if (!this.a(param1, var4_int, 0)) {
                stackOut_9_0 = -1;
                stackIn_10_0 = stackOut_9_0;
                return stackIn_10_0;
              } else {
                stackOut_11_0 = var4_int;
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
            var4 = decompiledCaughtException;
            stackOut_13_0 = (RuntimeException) var4;
            stackOut_13_1 = new StringBuilder().append("ad.G(");
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
          throw la.a((Throwable) (Object) stackIn_17_0, stackIn_17_2 + ',' + param1 + ',' + param2 + ')');
        }
        return stackIn_12_0;
    }

    final synchronized int b(int param0, int param1) {
        RuntimeException var3 = null;
        int stackIn_2_0 = 0;
        int stackIn_7_0 = 0;
        int stackIn_10_0 = 0;
        int stackIn_12_0 = 0;
        RuntimeException decompiledCaughtException = null;
        int stackOut_6_0 = 0;
        int stackOut_11_0 = 0;
        int stackOut_9_0 = 0;
        int stackOut_1_0 = 0;
        try {
          L0: {
            if (param1 == 11619) {
              if (!this.a((byte) 73, param0)) {
                stackOut_6_0 = 0;
                stackIn_7_0 = stackOut_6_0;
                return stackIn_7_0;
              } else {
                if (null == ((ad) this).field_h[param0]) {
                  stackOut_11_0 = ((ad) this).field_c.a(-48, param0);
                  stackIn_12_0 = stackOut_11_0;
                  break L0;
                } else {
                  stackOut_9_0 = 100;
                  stackIn_10_0 = stackOut_9_0;
                  return stackIn_10_0;
                }
              }
            } else {
              stackOut_1_0 = -123;
              stackIn_2_0 = stackOut_1_0;
              return stackIn_2_0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3 = decompiledCaughtException;
          throw la.a((Throwable) (Object) var3, "ad.H(" + param0 + ',' + param1 + ')');
        }
        return stackIn_12_0;
    }

    ad(rf param0, boolean param1, int param2) {
        RuntimeException runtimeException = null;
        RuntimeException stackIn_9_0 = null;
        StringBuilder stackIn_9_1 = null;
        RuntimeException stackIn_11_0 = null;
        StringBuilder stackIn_11_1 = null;
        RuntimeException stackIn_12_0 = null;
        StringBuilder stackIn_12_1 = null;
        String stackIn_12_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException stackOut_8_0 = null;
        StringBuilder stackOut_8_1 = null;
        RuntimeException stackOut_11_0 = null;
        StringBuilder stackOut_11_1 = null;
        String stackOut_11_2 = null;
        RuntimeException stackOut_9_0 = null;
        StringBuilder stackOut_9_1 = null;
        String stackOut_9_2 = null;
        ((ad) this).field_a = null;
        try {
          L0: {
            L1: {
              if (0 > param2) {
                break L1;
              } else {
                if (2 < param2) {
                  break L1;
                } else {
                  ((ad) this).field_b = param1;
                  ((ad) this).field_e = param2;
                  ((ad) this).field_c = param0;
                  break L0;
                }
              }
            }
            throw new IllegalArgumentException("");
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L2: {
            runtimeException = decompiledCaughtException;
            stackOut_8_0 = (RuntimeException) runtimeException;
            stackOut_8_1 = new StringBuilder().append("ad.<init>(");
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
          throw la.a((Throwable) (Object) stackIn_12_0, stackIn_12_2 + ',' + param1 + ',' + param2 + ')');
        }
    }

    final static int a(int param0, int param1, boolean param2, boolean param3, String param4, String param5) {
        try {
            RuntimeException var6 = null;
            int var6_int = 0;
            String var6_ref = null;
            int var7 = 0;
            Throwable var8_ref_Throwable = null;
            int var8 = 0;
            int var9 = 0;
            int stackIn_6_0 = 0;
            int stackIn_51_0 = 0;
            int stackIn_69_0 = 0;
            int stackIn_73_0 = 0;
            int stackIn_119_0 = 0;
            int stackIn_131_0 = 0;
            int stackIn_136_0 = 0;
            int stackIn_154_0 = 0;
            int stackIn_156_0 = 0;
            RuntimeException stackIn_158_0 = null;
            StringBuilder stackIn_158_1 = null;
            RuntimeException stackIn_160_0 = null;
            StringBuilder stackIn_160_1 = null;
            RuntimeException stackIn_161_0 = null;
            StringBuilder stackIn_161_1 = null;
            String stackIn_161_2 = null;
            RuntimeException stackIn_162_0 = null;
            StringBuilder stackIn_162_1 = null;
            RuntimeException stackIn_164_0 = null;
            StringBuilder stackIn_164_1 = null;
            RuntimeException stackIn_165_0 = null;
            StringBuilder stackIn_165_1 = null;
            String stackIn_165_2 = null;
            int decompiledRegionSelector0 = 0;
            Throwable decompiledCaughtException = null;
            int stackOut_5_0 = 0;
            int stackOut_50_0 = 0;
            int stackOut_68_0 = 0;
            int stackOut_66_0 = 0;
            int stackOut_72_0 = 0;
            int stackOut_70_0 = 0;
            int stackOut_118_0 = 0;
            int stackOut_130_0 = 0;
            int stackOut_135_0 = 0;
            int stackOut_153_0 = 0;
            int stackOut_155_0 = 0;
            RuntimeException stackOut_157_0 = null;
            StringBuilder stackOut_157_1 = null;
            RuntimeException stackOut_160_0 = null;
            StringBuilder stackOut_160_1 = null;
            String stackOut_160_2 = null;
            RuntimeException stackOut_158_0 = null;
            StringBuilder stackOut_158_1 = null;
            String stackOut_158_2 = null;
            RuntimeException stackOut_161_0 = null;
            StringBuilder stackOut_161_1 = null;
            RuntimeException stackOut_164_0 = null;
            StringBuilder stackOut_164_1 = null;
            String stackOut_164_2 = null;
            RuntimeException stackOut_162_0 = null;
            StringBuilder stackOut_162_1 = null;
            String stackOut_162_2 = null;
            var9 = MonkeyPuzzle2.field_F ? 1 : 0;
            try {
              L0: {
                L1: {
                  if (null == ol.field_g) {
                    var6_int = cb.a(param1 ^ 665, param3) ? 1 : 0;
                    if (var6_int != 0) {
                      break L1;
                    } else {
                      stackOut_5_0 = -1;
                      stackIn_6_0 = stackOut_5_0;
                      return stackIn_6_0;
                    }
                  } else {
                    break L1;
                  }
                }
                L2: {
                  if (dk.field_h == ii.field_r) {
                    L3: {
                      L4: {
                        if (!param3) {
                          break L4;
                        } else {
                          pj.field_b = sk.a(param4, ia.field_f, false, true, (String) null);
                          if (var9 == 0) {
                            break L3;
                          } else {
                            break L4;
                          }
                        }
                      }
                      pj.field_b = h.a(param1 ^ -739, false, param4, param5);
                      break L3;
                    }
                    gf.field_c.field_h = 0;
                    gf.field_c.b(14, -49152);
                    gf.field_c.b(pj.field_b.a(false).field_b, -49152);
                    al.a((byte) -71, -1);
                    dk.field_h = kh.field_a;
                    break L2;
                  } else {
                    break L2;
                  }
                }
                L5: {
                  if (dk.field_h == kh.field_a) {
                    if (hj.a(1, true)) {
                      L6: {
                        L7: {
                          var6_int = MonkeyPuzzle2.field_D.a((byte) 114);
                          if (var6_int != 0) {
                            break L7;
                          } else {
                            dk.field_h = aa.field_b;
                            if (var9 == 0) {
                              break L6;
                            } else {
                              break L7;
                            }
                          }
                        }
                        dk.field_h = dk.field_d;
                        rc.field_f = -1;
                        wk.field_a = var6_int;
                        break L6;
                      }
                      MonkeyPuzzle2.field_D.field_h = 0;
                      break L5;
                    } else {
                      break L5;
                    }
                  } else {
                    break L5;
                  }
                }
                L8: {
                  if (aa.field_b != dk.field_h) {
                    break L8;
                  } else {
                    if (hj.a(8, true)) {
                      ld.field_a = MonkeyPuzzle2.field_D.i(127);
                      MonkeyPuzzle2.field_D.field_h = 0;
                      ki.a(param0, pj.field_b, true, param3, param2);
                      dk.field_h = qk.field_c;
                      break L8;
                    } else {
                      break L8;
                    }
                  }
                }
                L9: {
                  if (qk.field_c == dk.field_h) {
                    if (hj.a(1, true)) {
                      L10: {
                        var6_int = MonkeyPuzzle2.field_D.a((byte) 114);
                        df.field_o = null;
                        wk.field_a = var6_int;
                        MonkeyPuzzle2.field_D.field_h = 0;
                        if (var6_int == 0) {
                          break L10;
                        } else {
                          if (var6_int == 1) {
                            break L10;
                          } else {
                            if (var6_int != 8) {
                              dk.field_h = dk.field_d;
                              rc.field_f = -1;
                              if (var9 == 0) {
                                break L9;
                              } else {
                                break L10;
                              }
                            } else {
                              gk.a(-1);
                              ck.field_e = false;
                              stackOut_50_0 = var6_int;
                              stackIn_51_0 = stackOut_50_0;
                              return stackIn_51_0;
                            }
                          }
                        }
                      }
                      dk.field_h = ea.field_a;
                      rc.field_f = -1;
                      break L9;
                    } else {
                      break L9;
                    }
                  } else {
                    break L9;
                  }
                }
                L11: {
                  if (dk.field_h != ea.field_a) {
                    break L11;
                  } else {
                    if (!gb.a(true)) {
                      break L11;
                    } else {
                      L12: {
                        ia.field_f = MonkeyPuzzle2.field_D.i(103);
                        ec.field_d = MonkeyPuzzle2.field_D.a((byte) 114);
                        int discarded$7 = MonkeyPuzzle2.field_D.a((byte) 114);
                        af.field_c = MonkeyPuzzle2.field_D.j(17277);
                        var6_ref = MonkeyPuzzle2.field_D.g(-1185292952);
                        var7 = MonkeyPuzzle2.field_D.a((byte) 114);
                        if ((1 & var7) == 0) {
                          break L12;
                        } else {
                          gd.b(-594181854);
                          break L12;
                        }
                      }
                      L13: {
                        if (param3) {
                          break L13;
                        } else {
                          L14: {
                            if ((8 & var7) == 0) {
                              stackOut_68_0 = 0;
                              stackIn_69_0 = stackOut_68_0;
                              break L14;
                            } else {
                              stackOut_66_0 = 1;
                              stackIn_69_0 = stackOut_66_0;
                              break L14;
                            }
                          }
                          L15: {
                            rh.field_B = stackIn_69_0 != 0;
                            if (0 == (var7 & 4)) {
                              stackOut_72_0 = 0;
                              stackIn_73_0 = stackOut_72_0;
                              break L15;
                            } else {
                              stackOut_70_0 = 1;
                              stackIn_73_0 = stackOut_70_0;
                              break L15;
                            }
                          }
                          fj.field_J = stackIn_73_0 != 0;
                          if (rh.field_B) {
                            break L13;
                          } else {
                            break L13;
                          }
                        }
                      }
                      L16: {
                        L17: {
                          if (me.field_e) {
                            int discarded$8 = MonkeyPuzzle2.field_D.a((byte) 114);
                            int discarded$9 = MonkeyPuzzle2.field_D.a((byte) 114);
                            int discarded$10 = MonkeyPuzzle2.field_D.e(param1 ^ 756);
                            il.field_h = MonkeyPuzzle2.field_D.j(param1 + 16627);
                            il.field_g = new byte[il.field_h];
                            var8 = 0;
                            L18: while (true) {
                              if (il.field_h <= var8) {
                                break L17;
                              } else {
                                il.field_g[var8] = MonkeyPuzzle2.field_D.k(-91);
                                var8++;
                                if (var9 != 0) {
                                  break L16;
                                } else {
                                  if (var9 == 0) {
                                    continue L18;
                                  } else {
                                    break L17;
                                  }
                                }
                              }
                            }
                          } else {
                            break L17;
                          }
                        }
                        cl.field_e = MonkeyPuzzle2.field_D.f(-1);
                        uj.field_f = pl.a((byte) 109, (CharSequence) (Object) cl.field_e);
                        ue.field_G = MonkeyPuzzle2.field_D.a((byte) 114);
                        dk.field_h = wh.field_b;
                        break L16;
                      }
                      L19: {
                        L20: {
                          if (pj.field_b.a(false) != te.field_a) {
                            break L20;
                          } else {
                            oe.field_l.a(false, ii.a(false));
                            if (var9 == 0) {
                              break L19;
                            } else {
                              break L20;
                            }
                          }
                        }
                        if (pj.field_b.a(false) == sj.field_g) {
                          dh.field_d.a(false, ii.a(false));
                          break L19;
                        } else {
                          break L19;
                        }
                      }
                      L21: {
                        ck.field_e = false;
                        if (null != var6_ref) {
                          pe.a(var6_ref, (byte) -108, ii.a(false));
                          break L21;
                        } else {
                          break L21;
                        }
                      }
                      L22: {
                        L23: {
                          L24: {
                            if (af.field_c > 0) {
                              break L24;
                            } else {
                              if (!fj.field_J) {
                                break L23;
                              } else {
                                break L24;
                              }
                            }
                          }
                          try {
                            L25: {
                              Object discarded$11 = mf.a(126, "zap", ii.a(false), new Object[1]);
                              decompiledRegionSelector0 = 0;
                              break L25;
                            }
                          } catch (java.lang.Throwable decompiledCaughtParameter0) {
                            decompiledCaughtException = decompiledCaughtParameter0;
                            L26: {
                              var8_ref_Throwable = decompiledCaughtException;
                              if (var9 == 0) {
                                decompiledRegionSelector0 = 0;
                                break L26;
                              } else {
                                decompiledRegionSelector0 = 1;
                                break L26;
                              }
                            }
                          }
                          if (decompiledRegionSelector0 == 0) {
                            break L22;
                          } else {
                            break L23;
                          }
                        }
                        try {
                          L27: {
                            Object discarded$12 = mf.a(-26159, "unzap", ii.a(false));
                            break L27;
                          }
                        } catch (java.lang.Throwable decompiledCaughtParameter1) {
                          decompiledCaughtException = decompiledCaughtParameter1;
                          L28: {
                            var8_ref_Throwable = decompiledCaughtException;
                            break L28;
                          }
                        }
                        break L22;
                      }
                      L29: {
                        if (af.field_c <= 0) {
                          break L29;
                        } else {
                          mb.field_c = true;
                          break L29;
                        }
                      }
                      gf.field_c.a(e.field_b, param1 ^ 650);
                      var8 = 0;
                      L30: while (true) {
                        L31: {
                          L32: {
                            if (4 <= var8) {
                              break L32;
                            } else {
                              e.field_b[var8] = e.field_b[var8] + 50;
                              var8++;
                              if (var9 != 0) {
                                break L31;
                              } else {
                                if (var9 == 0) {
                                  continue L30;
                                } else {
                                  break L32;
                                }
                              }
                            }
                          }
                          MonkeyPuzzle2.field_D.a(e.field_b, 0);
                          break L31;
                        }
                        stackOut_118_0 = wk.field_a;
                        stackIn_119_0 = stackOut_118_0;
                        return stackIn_119_0;
                      }
                    }
                  }
                }
                L33: {
                  if (dk.field_h != dk.field_d) {
                    break L33;
                  } else {
                    if (gb.a(true)) {
                      L34: {
                        gk.a(param1 + -651);
                        if (wk.field_a != 7) {
                          break L34;
                        } else {
                          if (ck.field_e) {
                            break L34;
                          } else {
                            ck.field_e = true;
                            stackOut_130_0 = -1;
                            stackIn_131_0 = stackOut_130_0;
                            return stackIn_131_0;
                          }
                        }
                      }
                      L35: {
                        if (wk.field_a != 7) {
                          break L35;
                        } else {
                          wk.field_a = 3;
                          break L35;
                        }
                      }
                      sl.field_n = MonkeyPuzzle2.field_D.f(-1);
                      ck.field_e = false;
                      stackOut_135_0 = wk.field_a;
                      stackIn_136_0 = stackOut_135_0;
                      return stackIn_136_0;
                    } else {
                      break L33;
                    }
                  }
                }
                L36: {
                  if (param1 == 650) {
                    break L36;
                  } else {
                    int discarded$13 = ad.a(-115, 60, false, false, (String) null, (String) null);
                    break L36;
                  }
                }
                L37: {
                  if (ol.field_g != null) {
                    break L37;
                  } else {
                    L38: {
                      if (ck.field_e) {
                        break L38;
                      } else {
                        var6_int = cg.field_g;
                        cg.field_g = id.field_m;
                        id.field_m = var6_int;
                        ck.field_e = true;
                        if (var9 == 0) {
                          break L37;
                        } else {
                          break L38;
                        }
                      }
                    }
                    L39: {
                      L40: {
                        if (30000L >= wf.a(84)) {
                          break L40;
                        } else {
                          sl.field_n = kj.field_E;
                          if (var9 == 0) {
                            break L39;
                          } else {
                            break L40;
                          }
                        }
                      }
                      sl.field_n = hh.field_p;
                      break L39;
                    }
                    ck.field_e = false;
                    stackOut_153_0 = 3;
                    stackIn_154_0 = stackOut_153_0;
                    return stackIn_154_0;
                  }
                }
                stackOut_155_0 = -1;
                stackIn_156_0 = stackOut_155_0;
                break L0;
              }
            } catch (java.lang.RuntimeException decompiledCaughtParameter2) {
              decompiledCaughtException = decompiledCaughtParameter2;
              L41: {
                var6 = (RuntimeException) (Object) decompiledCaughtException;
                stackOut_157_0 = (RuntimeException) var6;
                stackOut_157_1 = new StringBuilder().append("ad.F(").append(param0).append(',').append(param1).append(',').append(param2).append(',').append(param3).append(',');
                stackIn_160_0 = stackOut_157_0;
                stackIn_160_1 = stackOut_157_1;
                stackIn_158_0 = stackOut_157_0;
                stackIn_158_1 = stackOut_157_1;
                if (param4 == null) {
                  stackOut_160_0 = (RuntimeException) (Object) stackIn_160_0;
                  stackOut_160_1 = (StringBuilder) (Object) stackIn_160_1;
                  stackOut_160_2 = "null";
                  stackIn_161_0 = stackOut_160_0;
                  stackIn_161_1 = stackOut_160_1;
                  stackIn_161_2 = stackOut_160_2;
                  break L41;
                } else {
                  stackOut_158_0 = (RuntimeException) (Object) stackIn_158_0;
                  stackOut_158_1 = (StringBuilder) (Object) stackIn_158_1;
                  stackOut_158_2 = "{...}";
                  stackIn_161_0 = stackOut_158_0;
                  stackIn_161_1 = stackOut_158_1;
                  stackIn_161_2 = stackOut_158_2;
                  break L41;
                }
              }
              L42: {
                stackOut_161_0 = (RuntimeException) (Object) stackIn_161_0;
                stackOut_161_1 = ((StringBuilder) (Object) stackIn_161_1).append(stackIn_161_2).append(',');
                stackIn_164_0 = stackOut_161_0;
                stackIn_164_1 = stackOut_161_1;
                stackIn_162_0 = stackOut_161_0;
                stackIn_162_1 = stackOut_161_1;
                if (param5 == null) {
                  stackOut_164_0 = (RuntimeException) (Object) stackIn_164_0;
                  stackOut_164_1 = (StringBuilder) (Object) stackIn_164_1;
                  stackOut_164_2 = "null";
                  stackIn_165_0 = stackOut_164_0;
                  stackIn_165_1 = stackOut_164_1;
                  stackIn_165_2 = stackOut_164_2;
                  break L42;
                } else {
                  stackOut_162_0 = (RuntimeException) (Object) stackIn_162_0;
                  stackOut_162_1 = (StringBuilder) (Object) stackIn_162_1;
                  stackOut_162_2 = "{...}";
                  stackIn_165_0 = stackOut_162_0;
                  stackIn_165_1 = stackOut_162_1;
                  stackIn_165_2 = stackOut_162_2;
                  break L42;
                }
              }
              throw la.a((Throwable) (Object) stackIn_165_0, stackIn_165_2 + ')');
            }
            return stackIn_156_0;
        } catch (RuntimeException | Error decompiledUncheckedException) {
            throw decompiledUncheckedException;
        } catch (Throwable decompiledCheckedException) {
            throw new RuntimeException(decompiledCheckedException);
        }
    }

    final int a(String param0, byte param1) {
        int var3_int = 0;
        RuntimeException var3 = null;
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
            L1: {
              if (param1 == -81) {
                break L1;
              } else {
                int discarded$2 = ((ad) this).c((String) ((ad) this).field_h[13], (byte) 11);
                break L1;
              }
            }
            if (!((ad) this).a(85)) {
              stackOut_6_0 = 0;
              stackIn_7_0 = stackOut_6_0;
              return stackIn_7_0;
            } else {
              param0 = param0.toLowerCase();
              var3_int = ((ad) this).field_a.field_b.a(true, ra.a((byte) -117, (CharSequence) (Object) param0));
              stackOut_8_0 = ((ad) this).b(var3_int, 11619);
              stackIn_9_0 = stackOut_8_0;
              break L0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L2: {
            var3 = decompiledCaughtException;
            stackOut_10_0 = (RuntimeException) var3;
            stackOut_10_1 = new StringBuilder().append("ad.Q(");
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
          throw la.a((Throwable) (Object) stackIn_14_0, stackIn_14_2 + ',' + param1 + ')');
        }
        return stackIn_9_0;
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        int var0 = 0;
        field_d = "This password contains your email address, and would be easy to guess";
        field_k = "This entry doesn't match";
        field_g = new int[5];
        field_j = "Use this alternative as your account name";
        var0 = 0;
        L0: while (true) {
          if (~field_g.length >= ~var0) {
            field_f = "Your email address is used to identify this account";
            return;
          } else {
            L1: {
              if (var0 == 0) {
                field_g[var0] = 20 * (var0 + 1) << -1088248624;
                break L1;
              } else {
                field_g[var0] = var0 * 51 - -51 << 1319719984;
                break L1;
              }
            }
            L2: {
              if (2 < var0) {
                field_g[var0] = bd.a(field_g[var0], (-2 + var0) * 22 << -1695822616);
                break L2;
              } else {
                break L2;
              }
            }
            var0++;
            continue L0;
          }
        }
    }
}
