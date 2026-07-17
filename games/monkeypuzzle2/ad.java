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
        field_j = null;
        field_g = null;
        field_d = null;
        field_k = null;
        field_f = null;
    }

    final boolean a(String param0, boolean param1, String param2) {
        int var4_int = 0;
        RuntimeException var4 = null;
        int var5 = 0;
        CharSequence var6 = null;
        CharSequence var7 = null;
        int stackIn_2_0 = 0;
        int stackIn_5_0 = 0;
        int stackIn_8_0 = 0;
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
        boolean stackOut_9_0 = false;
        int stackOut_7_0 = 0;
        int stackOut_4_0 = 0;
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
            if (((ad) this).a(-22)) {
              param2 = param2.toLowerCase();
              param0 = param0.toLowerCase();
              if (param1) {
                var6 = (CharSequence) (Object) param2;
                var4_int = ((ad) this).field_a.field_b.a(param1, ra.a((byte) -21, var6));
                if (this.a((byte) 115, var4_int)) {
                  var7 = (CharSequence) (Object) param0;
                  var5 = ((ad) this).field_a.field_t[var4_int].a(param1, ra.a((byte) 99, var7));
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
          throw la.a((Throwable) (Object) stackIn_17_0, stackIn_17_2 + 41);
        }
        return stackIn_10_0;
    }

    private final synchronized byte[] a(int param0, int[] param1, int param2, byte param3) {
        Object var5 = null;
        byte[] var7 = null;
        Object stackIn_27_0 = null;
        Object stackIn_29_0 = null;
        StringBuilder stackIn_29_1 = null;
        Object stackIn_30_0 = null;
        StringBuilder stackIn_30_1 = null;
        Object stackIn_31_0 = null;
        StringBuilder stackIn_31_1 = null;
        String stackIn_31_2 = null;
        RuntimeException decompiledCaughtException = null;
        Object stackOut_26_0 = null;
        Object stackOut_28_0 = null;
        StringBuilder stackOut_28_1 = null;
        Object stackOut_30_0 = null;
        StringBuilder stackOut_30_1 = null;
        String stackOut_30_2 = null;
        Object stackOut_29_0 = null;
        StringBuilder stackOut_29_1 = null;
        String stackOut_29_2 = null;
        try {
          L0: {
            if (this.a(param2, param0, 0)) {
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
                if (!this.a((byte) -12, param1, param0, param2)) {
                  this.a(3, param2);
                  if (this.a((byte) -12, param1, param0, param2)) {
                    break L1;
                  } else {
                    return null;
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
                    var7 = uj.a(43, ((ad) this).field_i[param2][param0], false);
                    var5 = (Object) (Object) var7;
                    if (var7 == null) {
                      throw new RuntimeException("");
                    } else {
                      break L3;
                    }
                  }
                }
                L4: {
                  if (var5 != null) {
                    if (((ad) this).field_e == 1) {
                      ((ad) this).field_i[param2][param0] = null;
                      if (((ad) this).field_a.field_r[param2] != 1) {
                        break L4;
                      } else {
                        ((ad) this).field_i[param2] = null;
                        break L4;
                      }
                    } else {
                      if (2 == ((ad) this).field_e) {
                        ((ad) this).field_i[param2] = null;
                        break L4;
                      } else {
                        break L4;
                      }
                    }
                  } else {
                    break L4;
                  }
                }
                stackOut_26_0 = var5;
                stackIn_27_0 = stackOut_26_0;
                break L0;
              }
            } else {
              return null;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L5: {
            var5 = (Object) (Object) decompiledCaughtException;
            stackOut_28_0 = var5;
            stackOut_28_1 = new StringBuilder().append("ad.N(").append(param0).append(44);
            stackIn_30_0 = stackOut_28_0;
            stackIn_30_1 = stackOut_28_1;
            stackIn_29_0 = stackOut_28_0;
            stackIn_29_1 = stackOut_28_1;
            if (param1 == null) {
              stackOut_30_0 = stackIn_30_0;
              stackOut_30_1 = (StringBuilder) (Object) stackIn_30_1;
              stackOut_30_2 = "null";
              stackIn_31_0 = stackOut_30_0;
              stackIn_31_1 = stackOut_30_1;
              stackIn_31_2 = stackOut_30_2;
              break L5;
            } else {
              stackOut_29_0 = stackIn_29_0;
              stackOut_29_1 = (StringBuilder) (Object) stackIn_29_1;
              stackOut_29_2 = "{...}";
              stackIn_31_0 = stackOut_29_0;
              stackIn_31_1 = stackOut_29_1;
              stackIn_31_2 = stackOut_29_2;
              break L5;
            }
          }
          throw la.a((Throwable) (Object) stackIn_31_0, stackIn_31_2 + 44 + param2 + 44 + -85 + 41);
        }
        return (byte[]) (Object) stackIn_27_0;
    }

    final synchronized boolean c(int param0, int param1, int param2) {
        int var4 = 43 / ((param2 - 5) / 50);
        if (!(this.a(param0, param1, 0))) {
            return false;
        }
        if (((ad) this).field_i[param0] != null) {
            if (null != ((ad) this).field_i[param0][param1]) {
                return true;
            }
        }
        if (((ad) this).field_h[param0] != null) {
            return true;
        }
        this.a(3, param0);
        if (null != ((ad) this).field_h[param0]) {
            return true;
        }
        return false;
    }

    final boolean a(int param0, String param1) {
        int var3_int = 0;
        RuntimeException var3 = null;
        CharSequence var4 = null;
        int stackIn_4_0 = 0;
        boolean stackIn_6_0 = false;
        RuntimeException stackIn_8_0 = null;
        StringBuilder stackIn_8_1 = null;
        RuntimeException stackIn_9_0 = null;
        StringBuilder stackIn_9_1 = null;
        RuntimeException stackIn_10_0 = null;
        StringBuilder stackIn_10_1 = null;
        String stackIn_10_2 = null;
        RuntimeException decompiledCaughtException = null;
        boolean stackOut_5_0 = false;
        int stackOut_3_0 = 0;
        RuntimeException stackOut_7_0 = null;
        StringBuilder stackOut_7_1 = null;
        RuntimeException stackOut_9_0 = null;
        StringBuilder stackOut_9_1 = null;
        String stackOut_9_2 = null;
        RuntimeException stackOut_8_0 = null;
        StringBuilder stackOut_8_1 = null;
        String stackOut_8_2 = null;
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
              var4 = (CharSequence) (Object) param1;
              var3_int = ((ad) this).field_a.field_b.a(true, ra.a((byte) 115, var4));
              stackOut_5_0 = ((ad) this).a(false, var3_int);
              stackIn_6_0 = stackOut_5_0;
              break L0;
            } else {
              stackOut_3_0 = 0;
              stackIn_4_0 = stackOut_3_0;
              return stackIn_4_0 != 0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L2: {
            var3 = decompiledCaughtException;
            stackOut_7_0 = (RuntimeException) var3;
            stackOut_7_1 = new StringBuilder().append("ad.E(").append(param0).append(44);
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
          throw la.a((Throwable) (Object) stackIn_10_0, stackIn_10_2 + 41);
        }
        return stackIn_6_0;
    }

    final static void a(String param0, int param1, float param2) {
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
          throw la.a((Throwable) (Object) stackIn_6_0, stackIn_6_2 + 44 + param1 + 44 + param2 + 41);
        }
    }

    final int c(String param0, byte param1) {
        int var3_int = 0;
        RuntimeException var3 = null;
        CharSequence var4 = null;
        int stackIn_2_0 = 0;
        int stackIn_8_0 = 0;
        RuntimeException stackIn_10_0 = null;
        StringBuilder stackIn_10_1 = null;
        RuntimeException stackIn_11_0 = null;
        StringBuilder stackIn_11_1 = null;
        RuntimeException stackIn_12_0 = null;
        StringBuilder stackIn_12_1 = null;
        String stackIn_12_2 = null;
        RuntimeException decompiledCaughtException = null;
        int stackOut_7_0 = 0;
        int stackOut_1_0 = 0;
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
              var4 = (CharSequence) (Object) param0;
              var3_int = ((ad) this).field_a.field_b.a(true, ra.a((byte) -14, var4));
              if (!this.a((byte) 73, var3_int)) {
                stackOut_7_0 = -1;
                stackIn_8_0 = stackOut_7_0;
                break L0;
              } else {
                return var3_int;
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
            stackOut_9_0 = (RuntimeException) var3;
            stackOut_9_1 = new StringBuilder().append("ad.M(");
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
              break L2;
            } else {
              stackOut_10_0 = (RuntimeException) (Object) stackIn_10_0;
              stackOut_10_1 = (StringBuilder) (Object) stackIn_10_1;
              stackOut_10_2 = "{...}";
              stackIn_12_0 = stackOut_10_0;
              stackIn_12_1 = stackOut_10_1;
              stackIn_12_2 = stackOut_10_2;
              break L2;
            }
          }
          throw la.a((Throwable) (Object) stackIn_12_0, stackIn_12_2 + 44 + param1 + 41);
        }
        return stackIn_8_0;
    }

    final synchronized boolean a(boolean param0, int param1) {
        if (!this.a((byte) 124, param1)) {
            return false;
        }
        if (!(null == ((ad) this).field_h[param1])) {
            return true;
        }
        this.a(3, param1);
        if (((ad) this).field_h[param1] != null) {
            return true;
        }
        if (param0) {
            return ((boolean[]) ((ad) this).field_h[1])[8];
        }
        return false;
    }

    private final synchronized boolean a(byte param0, int param1) {
        if (((ad) this).a(-18)) {
          L0: {
            if (param1 < 0) {
              break L0;
            } else {
              if (((ad) this).field_a.field_r.length <= param1) {
                break L0;
              } else {
                if (((ad) this).field_a.field_r[param1] == 0) {
                  break L0;
                } else {
                  if (param0 >= 64) {
                    return true;
                  } else {
                    int discarded$2 = ((ad) this).b(0, 17);
                    return true;
                  }
                }
              }
            }
          }
          if (mg.field_t) {
            throw new IllegalArgumentException(Integer.toString(param1));
          } else {
            return false;
          }
        } else {
          return false;
        }
    }

    final boolean b(String param0, byte param1) {
        int var3_int = 0;
        RuntimeException var3 = null;
        int var4 = 0;
        CharSequence var5 = null;
        int stackIn_2_0 = 0;
        int stackIn_5_0 = 0;
        int stackIn_7_0 = 0;
        RuntimeException stackIn_9_0 = null;
        StringBuilder stackIn_9_1 = null;
        RuntimeException stackIn_10_0 = null;
        StringBuilder stackIn_10_1 = null;
        RuntimeException stackIn_11_0 = null;
        StringBuilder stackIn_11_1 = null;
        String stackIn_11_2 = null;
        RuntimeException decompiledCaughtException = null;
        int stackOut_6_0 = 0;
        int stackOut_4_0 = 0;
        int stackOut_1_0 = 0;
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
            if (((ad) this).a(-63)) {
              var3_int = 20 % ((param1 - -58) / 43);
              param0 = param0.toLowerCase();
              var5 = (CharSequence) (Object) param0;
              var4 = ((ad) this).field_a.field_b.a(true, ra.a((byte) 104, var5));
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
              break L1;
            } else {
              stackOut_9_0 = (RuntimeException) (Object) stackIn_9_0;
              stackOut_9_1 = (StringBuilder) (Object) stackIn_9_1;
              stackOut_9_2 = "{...}";
              stackIn_11_0 = stackOut_9_0;
              stackIn_11_1 = stackOut_9_1;
              stackIn_11_2 = stackOut_9_2;
              break L1;
            }
          }
          throw la.a((Throwable) (Object) stackIn_11_0, stackIn_11_2 + 44 + param1 + 41);
        }
        return stackIn_7_0 != 0;
    }

    private final synchronized void a(int param0, int param1) {
        if (param0 != 3) {
            return;
        }
        if (((ad) this).field_b) {
            ((ad) this).field_h[param1] = (Object) (Object) ((ad) this).field_c.b(-113, param1);
        } else {
            ((ad) this).field_h[param1] = p.a(((ad) this).field_c.b(-116, param1), (byte) 111, false);
        }
    }

    private final synchronized boolean a(byte param0, int[] param1, int param2, int param3) {
        RuntimeException var5 = null;
        int var5_int = 0;
        int[] var6 = null;
        Object[] var7 = null;
        int var8 = 0;
        Object var9 = null;
        int var9_int = 0;
        byte[] var9_array = null;
        int var10 = 0;
        RuntimeException var11_ref_RuntimeException = null;
        int var11 = 0;
        int var12 = 0;
        int var14 = 0;
        int[] var14_ref_int__ = null;
        int var15 = 0;
        byte[][] var15_ref_byte____ = null;
        int var16 = 0;
        int var17 = 0;
        int var18 = 0;
        int var19 = 0;
        int var20 = 0;
        int var21 = 0;
        int var22 = 0;
        byte[] var23 = null;
        int[] var24 = null;
        byte[] var25 = null;
        gk var26 = null;
        byte[] var27 = null;
        gk var29 = null;
        int[] var30 = null;
        byte[][] var31 = null;
        gk var32 = null;
        int[] var34 = null;
        byte[] var35 = null;
        byte[] var36 = null;
        int[] var38 = null;
        byte[][] var39 = null;
        int[] var41 = null;
        byte[] var42 = null;
        byte[] var43 = null;
        int[] var45 = null;
        byte[][] var46 = null;
        int[] var48 = null;
        byte[] var49 = null;
        byte[] var50 = null;
        byte[] var51 = null;
        int[] var52 = null;
        byte[][] var53 = null;
        byte[] var54 = null;
        int stackIn_4_0 = 0;
        int stackIn_7_0 = 0;
        int stackIn_21_0 = 0;
        RuntimeException stackIn_33_0 = null;
        StringBuilder stackIn_33_1 = null;
        RuntimeException stackIn_34_0 = null;
        StringBuilder stackIn_34_1 = null;
        RuntimeException stackIn_35_0 = null;
        StringBuilder stackIn_35_1 = null;
        int stackIn_35_2 = 0;
        int stackIn_86_0 = 0;
        int stackIn_101_0 = 0;
        RuntimeException stackIn_103_0 = null;
        StringBuilder stackIn_103_1 = null;
        RuntimeException stackIn_104_0 = null;
        StringBuilder stackIn_104_1 = null;
        RuntimeException stackIn_105_0 = null;
        StringBuilder stackIn_105_1 = null;
        String stackIn_105_2 = null;
        RuntimeException decompiledCaughtException = null;
        int stackOut_3_0 = 0;
        RuntimeException stackOut_32_0 = null;
        StringBuilder stackOut_32_1 = null;
        RuntimeException stackOut_34_0 = null;
        StringBuilder stackOut_34_1 = null;
        int stackOut_34_2 = 0;
        RuntimeException stackOut_33_0 = null;
        StringBuilder stackOut_33_1 = null;
        int stackOut_33_2 = 0;
        int stackOut_85_0 = 0;
        int stackOut_100_0 = 0;
        int stackOut_20_0 = 0;
        int stackOut_6_0 = 0;
        RuntimeException stackOut_102_0 = null;
        StringBuilder stackOut_102_1 = null;
        RuntimeException stackOut_104_0 = null;
        StringBuilder stackOut_104_1 = null;
        String stackOut_104_2 = null;
        RuntimeException stackOut_103_0 = null;
        StringBuilder stackOut_103_1 = null;
        String stackOut_103_2 = null;
        var22 = MonkeyPuzzle2.field_F ? 1 : 0;
        try {
          L0: {
            if (!this.a((byte) 88, param3)) {
              stackOut_3_0 = 0;
              stackIn_4_0 = stackOut_3_0;
              return stackIn_4_0 != 0;
            } else {
              if (((ad) this).field_h[param3] != null) {
                L1: {
                  var5_int = ((ad) this).field_a.field_m[param3];
                  var48 = ((ad) this).field_a.field_a[param3];
                  var41 = var48;
                  var34 = var41;
                  var24 = var34;
                  var6 = var24;
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
                    if (var5_int <= var9_int) {
                      break L3;
                    } else {
                      L4: {
                        if (var6 == null) {
                          var10 = var9_int;
                          break L4;
                        } else {
                          var10 = var48[var9_int];
                          break L4;
                        }
                      }
                      if (var7[var10] == null) {
                        var8 = 0;
                        break L3;
                      } else {
                        var9_int++;
                        continue L2;
                      }
                    }
                  }
                  if (var8 == 0) {
                    L5: {
                      L6: {
                        if (param1 == null) {
                          break L6;
                        } else {
                          L7: {
                            if (param1[0] != 0) {
                              break L7;
                            } else {
                              if (param1[1] != 0) {
                                break L7;
                              } else {
                                if (param1[2] != 0) {
                                  break L7;
                                } else {
                                  if (0 != param1[3]) {
                                    break L7;
                                  } else {
                                    break L6;
                                  }
                                }
                              }
                            }
                          }
                          var49 = uj.a(59, ((ad) this).field_h[param3], true);
                          var42 = var49;
                          var35 = var42;
                          var25 = var35;
                          var9_array = var25;
                          var26 = new gk(var49);
                          var26.a(5, var26.field_g.length, -84, param1);
                          break L5;
                        }
                      }
                      var9_array = uj.a(67, ((ad) this).field_h[param3], false);
                      break L5;
                    }
                    try {
                      L8: {
                        var50 = rc.a(var9_array, 120);
                        var43 = var50;
                        var36 = var43;
                        var27 = var36;
                        var23 = var27;
                        var51 = var23;
                        break L8;
                      }
                    } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
                      decompiledCaughtException = decompiledCaughtParameter0;
                      L9: {
                        var11_ref_RuntimeException = decompiledCaughtException;
                        stackOut_32_0 = (RuntimeException) var11_ref_RuntimeException;
                        stackOut_32_1 = new StringBuilder();
                        stackIn_34_0 = stackOut_32_0;
                        stackIn_34_1 = stackOut_32_1;
                        stackIn_33_0 = stackOut_32_0;
                        stackIn_33_1 = stackOut_32_1;
                        if (param1 == null) {
                          stackOut_34_0 = (RuntimeException) (Object) stackIn_34_0;
                          stackOut_34_1 = (StringBuilder) (Object) stackIn_34_1;
                          stackOut_34_2 = 0;
                          stackIn_35_0 = stackOut_34_0;
                          stackIn_35_1 = stackOut_34_1;
                          stackIn_35_2 = stackOut_34_2;
                          break L9;
                        } else {
                          stackOut_33_0 = (RuntimeException) (Object) stackIn_33_0;
                          stackOut_33_1 = (StringBuilder) (Object) stackIn_33_1;
                          stackOut_33_2 = 1;
                          stackIn_35_0 = stackOut_33_0;
                          stackIn_35_1 = stackOut_33_1;
                          stackIn_35_2 = stackOut_33_2;
                          break L9;
                        }
                      }
                      throw la.a((Throwable) (Object) stackIn_35_0, stackIn_35_2 + " " + param3 + " " + param1.length + " " + w.a(param1.length, var9_array, -18694) + " " + w.a(-2 + param1.length, var9_array, param0 ^ 18702) + " " + ((ad) this).field_a.field_j[param3] + " " + ((ad) this).field_a.field_d);
                    }
                    L10: {
                      if (param0 == -12) {
                        break L10;
                      } else {
                        int discarded$1 = ((ad) this).a((String) ((ad) this).field_h[11], (byte) 73);
                        break L10;
                      }
                    }
                    L11: {
                      if (((ad) this).field_b) {
                        ((ad) this).field_h[param3] = null;
                        break L11;
                      } else {
                        break L11;
                      }
                    }
                    L12: {
                      if (var5_int > 1) {
                        if (((ad) this).field_e == 2) {
                          var11 = var50.length;
                          var11--;
                          var12 = 255 & var23[var11];
                          var11 = var11 - 4 * var5_int * var12;
                          var32 = new gk(var51);
                          var14 = 0;
                          var15 = 0;
                          var32.field_h = var11;
                          var16 = 0;
                          L13: while (true) {
                            if (var16 >= var12) {
                              if (var14 != 0) {
                                var54 = new byte[var14];
                                var14 = 0;
                                var32.field_h = var11;
                                var17 = 0;
                                var18 = 0;
                                L14: while (true) {
                                  if (var12 <= var18) {
                                    var7[var15] = (Object) (Object) var54;
                                    break L12;
                                  } else {
                                    var19 = 0;
                                    var20 = 0;
                                    L15: while (true) {
                                      if (var20 >= var5_int) {
                                        var18++;
                                        continue L14;
                                      } else {
                                        L16: {
                                          var19 = var19 + var32.e(param0 + -102);
                                          if (var6 == null) {
                                            var21 = var20;
                                            break L16;
                                          } else {
                                            var21 = var48[var20];
                                            break L16;
                                          }
                                        }
                                        L17: {
                                          if (param2 == var21) {
                                            gl.a(var51, var17, var54, var14, var19);
                                            var14 = var14 + var19;
                                            break L17;
                                          } else {
                                            break L17;
                                          }
                                        }
                                        var17 = var17 + var19;
                                        var20++;
                                        continue L15;
                                      }
                                    }
                                  }
                                }
                              } else {
                                stackOut_85_0 = 1;
                                stackIn_86_0 = stackOut_85_0;
                                return stackIn_86_0 != 0;
                              }
                            } else {
                              var17 = 0;
                              var18 = 0;
                              L18: while (true) {
                                if (var18 >= var5_int) {
                                  var16++;
                                  continue L13;
                                } else {
                                  L19: {
                                    var17 = var17 + var32.e(param0 ^ -118);
                                    if (var6 != null) {
                                      var19 = var48[var18];
                                      break L19;
                                    } else {
                                      var19 = var18;
                                      break L19;
                                    }
                                  }
                                  L20: {
                                    if (param2 != var19) {
                                      break L20;
                                    } else {
                                      break L20;
                                    }
                                  }
                                  var18++;
                                  continue L18;
                                }
                              }
                            }
                          }
                        } else {
                          var11 = var50.length;
                          var11--;
                          var12 = 255 & var23[var11];
                          var11 = var11 - var5_int * var12 * 4;
                          var29 = new gk(var51);
                          var29.field_h = var11;
                          var52 = new int[var5_int];
                          var45 = var52;
                          var38 = var45;
                          var30 = var38;
                          var14_ref_int__ = var30;
                          var15 = 0;
                          L21: while (true) {
                            if (var12 <= var15) {
                              var53 = new byte[var5_int][];
                              var46 = var53;
                              var39 = var46;
                              var31 = var39;
                              var15_ref_byte____ = var31;
                              var16 = 0;
                              L22: while (true) {
                                if (var5_int <= var16) {
                                  var29.field_h = var11;
                                  var16 = 0;
                                  var17 = 0;
                                  L23: while (true) {
                                    if (var12 <= var17) {
                                      var17 = 0;
                                      L24: while (true) {
                                        if (var17 >= var5_int) {
                                          break L12;
                                        } else {
                                          L25: {
                                            if (var6 != null) {
                                              var18 = var48[var17];
                                              break L25;
                                            } else {
                                              var18 = var17;
                                              break L25;
                                            }
                                          }
                                          L26: {
                                            if (((ad) this).field_e != 0) {
                                              var7[var18] = (Object) (Object) var53[var17];
                                              break L26;
                                            } else {
                                              var7[var18] = p.a(var53[var17], (byte) 117, false);
                                              break L26;
                                            }
                                          }
                                          var17++;
                                          continue L24;
                                        }
                                      }
                                    } else {
                                      var18 = 0;
                                      var19 = 0;
                                      L27: while (true) {
                                        if (var19 >= var5_int) {
                                          var17++;
                                          continue L23;
                                        } else {
                                          var18 = var18 + var29.e(-95);
                                          gl.a(var51, var16, var53[var19], var52[var19], var18);
                                          var14_ref_int__[var19] = var14_ref_int__[var19] + var18;
                                          var16 = var16 + var18;
                                          var19++;
                                          continue L27;
                                        }
                                      }
                                    }
                                  }
                                } else {
                                  var15_ref_byte____[var16] = new byte[var52[var16]];
                                  var52[var16] = 0;
                                  var16++;
                                  continue L22;
                                }
                              }
                            } else {
                              var16 = 0;
                              var17 = 0;
                              L28: while (true) {
                                if (var5_int <= var17) {
                                  var15++;
                                  continue L21;
                                } else {
                                  var16 = var16 + var29.e(-30);
                                  var14_ref_int__[var17] = var14_ref_int__[var17] + var16;
                                  var17++;
                                  continue L28;
                                }
                              }
                            }
                          }
                        }
                      } else {
                        L29: {
                          if (var6 != null) {
                            var11 = var48[0];
                            break L29;
                          } else {
                            var11 = 0;
                            break L29;
                          }
                        }
                        if (((ad) this).field_e == 0) {
                          var7[var11] = p.a(var51, (byte) 110, false);
                          break L12;
                        } else {
                          var7[var11] = (Object) (Object) var50;
                          return true;
                        }
                      }
                    }
                    stackOut_100_0 = 1;
                    stackIn_101_0 = stackOut_100_0;
                    break L0;
                  } else {
                    stackOut_20_0 = 1;
                    stackIn_21_0 = stackOut_20_0;
                    return stackIn_21_0 != 0;
                  }
                }
              } else {
                stackOut_6_0 = 0;
                stackIn_7_0 = stackOut_6_0;
                return stackIn_7_0 != 0;
              }
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter1) {
          decompiledCaughtException = decompiledCaughtParameter1;
          L30: {
            var5 = decompiledCaughtException;
            stackOut_102_0 = (RuntimeException) var5;
            stackOut_102_1 = new StringBuilder().append("ad.V(").append(param0).append(44);
            stackIn_104_0 = stackOut_102_0;
            stackIn_104_1 = stackOut_102_1;
            stackIn_103_0 = stackOut_102_0;
            stackIn_103_1 = stackOut_102_1;
            if (param1 == null) {
              stackOut_104_0 = (RuntimeException) (Object) stackIn_104_0;
              stackOut_104_1 = (StringBuilder) (Object) stackIn_104_1;
              stackOut_104_2 = "null";
              stackIn_105_0 = stackOut_104_0;
              stackIn_105_1 = stackOut_104_1;
              stackIn_105_2 = stackOut_104_2;
              break L30;
            } else {
              stackOut_103_0 = (RuntimeException) (Object) stackIn_103_0;
              stackOut_103_1 = (StringBuilder) (Object) stackIn_103_1;
              stackOut_103_2 = "{...}";
              stackIn_105_0 = stackOut_103_0;
              stackIn_105_1 = stackOut_103_1;
              stackIn_105_2 = stackOut_103_2;
              break L30;
            }
          }
          throw la.a((Throwable) (Object) stackIn_105_0, stackIn_105_2 + 44 + param2 + 44 + param3 + 41);
        }
        return stackIn_101_0 != 0;
    }

    final synchronized int b(boolean param0) {
        int var2 = 0;
        int var3 = 0;
        int var4 = 0;
        int var5 = 0;
        var5 = MonkeyPuzzle2.field_F ? 1 : 0;
        if (!((ad) this).a(89)) {
          return 0;
        } else {
          L0: {
            if (param0) {
              break L0;
            } else {
              ((ad) this).field_e = 47;
              break L0;
            }
          }
          var2 = 0;
          var3 = 0;
          var4 = 0;
          L1: while (true) {
            if (var4 >= ((ad) this).field_h.length) {
              if (var2 == 0) {
                return 100;
              } else {
                var4 = 100 * var3 / var2;
                return var4;
              }
            } else {
              if (0 < ((ad) this).field_a.field_m[var4]) {
                var3 = var3 + ((ad) this).b(var4, 11619);
                var2 += 100;
                var4++;
                continue L1;
              } else {
                var4++;
                continue L1;
              }
            }
          }
        }
    }

    final static boolean c(boolean param0) {
        return oa.a((byte) -127, ii.a(false));
    }

    final byte[] b(int param0, int param1, int param2) {
        if (param0 != 255) {
            boolean discarded$0 = this.a((byte) 89, -23);
        }
        return this.a(param1, (int[]) null, param2, (byte) -85);
    }

    final synchronized byte[] a(String param0, String param1, int param2) {
        int var4_int = 0;
        RuntimeException var4 = null;
        int var5 = 0;
        int var6 = 0;
        CharSequence var7 = null;
        CharSequence var8 = null;
        byte[] stackIn_7_0 = null;
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
        byte[] stackOut_6_0 = null;
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
        try {
          L0: {
            if (((ad) this).a(85)) {
              param1 = param1.toLowerCase();
              param0 = param0.toLowerCase();
              var5 = 26 / ((-88 - param2) / 36);
              var7 = (CharSequence) (Object) param1;
              var4_int = ((ad) this).field_a.field_b.a(true, ra.a((byte) 125, var7));
              if (this.a((byte) 117, var4_int)) {
                var8 = (CharSequence) (Object) param0;
                var6 = ((ad) this).field_a.field_t[var4_int].a(true, ra.a((byte) -59, var8));
                stackOut_6_0 = ((ad) this).b(255, var6, var4_int);
                stackIn_7_0 = stackOut_6_0;
                break L0;
              } else {
                return null;
              }
            } else {
              return null;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L1: {
            var4 = decompiledCaughtException;
            stackOut_8_0 = (RuntimeException) var4;
            stackOut_8_1 = new StringBuilder().append("ad.L(");
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
              break L1;
            } else {
              stackOut_9_0 = (RuntimeException) (Object) stackIn_9_0;
              stackOut_9_1 = (StringBuilder) (Object) stackIn_9_1;
              stackOut_9_2 = "{...}";
              stackIn_11_0 = stackOut_9_0;
              stackIn_11_1 = stackOut_9_1;
              stackIn_11_2 = stackOut_9_2;
              break L1;
            }
          }
          L2: {
            stackOut_11_0 = (RuntimeException) (Object) stackIn_11_0;
            stackOut_11_1 = ((StringBuilder) (Object) stackIn_11_1).append(stackIn_11_2).append(44);
            stackIn_13_0 = stackOut_11_0;
            stackIn_13_1 = stackOut_11_1;
            stackIn_12_0 = stackOut_11_0;
            stackIn_12_1 = stackOut_11_1;
            if (param1 == null) {
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
          throw la.a((Throwable) (Object) stackIn_14_0, stackIn_14_2 + 44 + param2 + 41);
        }
        return stackIn_7_0;
    }

    final static boolean a(boolean param0) {
        return wd.field_g;
    }

    private final synchronized boolean a(int param0, int param1, int param2) {
        if (!((ad) this).a(-42)) {
            return false;
        }
        if (param0 >= 0) {
            if (param1 >= 0) {
                if (((ad) this).field_a.field_r.length > param0) {
                    if (param1 < ((ad) this).field_a.field_r[param0]) {
                        return true;
                    }
                }
            }
        }
        if (!mg.field_t) {
            return false;
        }
        throw new IllegalArgumentException(param0 + " " + param1);
    }

    final static void a(java.applet.Applet param0, boolean param1) {
        try {
            mk.a("", (byte) -5, param0);
            l.a(param0, -106);
        } catch (RuntimeException runtimeException) {
            throw la.a((Throwable) (Object) runtimeException, "ad.T(" + (param0 != null ? "{...}" : "null") + 44 + 1 + 41);
        }
    }

    final synchronized boolean a(int param0) {
        if (((ad) this).field_a == null) {
            ((ad) this).field_a = ((ad) this).field_c.a((byte) 80);
            if (((ad) this).field_a == null) {
                return false;
            }
            ((ad) this).field_h = new Object[((ad) this).field_a.field_e];
            ((ad) this).field_i = new Object[((ad) this).field_a.field_e][];
        }
        int var2 = -110 / ((param0 - 24) / 38);
        return true;
    }

    final synchronized boolean b(int param0) {
        int var2 = 0;
        int var3 = 0;
        int var4 = 0;
        int var5 = 0;
        var5 = MonkeyPuzzle2.field_F ? 1 : 0;
        if (((ad) this).a(-123)) {
          var2 = 1;
          var3 = param0;
          L0: while (true) {
            if (var3 >= ((ad) this).field_a.field_f.length) {
              return var2 != 0;
            } else {
              var4 = ((ad) this).field_a.field_f[var3];
              if (((ad) this).field_h[var4] == null) {
                this.a(3, var4);
                if (null == ((ad) this).field_h[var4]) {
                  var2 = 0;
                  var3++;
                  continue L0;
                } else {
                  var3++;
                  continue L0;
                }
              } else {
                var3++;
                continue L0;
              }
            }
          }
        } else {
          return false;
        }
    }

    final int a(String param0, int param1, int param2) {
        int var4_int = 0;
        RuntimeException var4 = null;
        CharSequence var5 = null;
        int stackIn_2_0 = 0;
        int stackIn_8_0 = 0;
        RuntimeException stackIn_10_0 = null;
        StringBuilder stackIn_10_1 = null;
        RuntimeException stackIn_11_0 = null;
        StringBuilder stackIn_11_1 = null;
        RuntimeException stackIn_12_0 = null;
        StringBuilder stackIn_12_1 = null;
        String stackIn_12_2 = null;
        RuntimeException decompiledCaughtException = null;
        int stackOut_7_0 = 0;
        int stackOut_1_0 = 0;
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
            if (this.a((byte) 96, param1)) {
              L1: {
                param0 = param0.toLowerCase();
                var5 = (CharSequence) (Object) param0;
                var4_int = ((ad) this).field_a.field_t[param1].a(true, ra.a((byte) 3, var5));
                if (param2 == -28459) {
                  break L1;
                } else {
                  ((int[]) ((Object[]) ((Object[]) ((ad) this).field_h[1])[14])[2])[0] = -43;
                  break L1;
                }
              }
              if (!this.a(param1, var4_int, 0)) {
                stackOut_7_0 = -1;
                stackIn_8_0 = stackOut_7_0;
                break L0;
              } else {
                return var4_int;
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
            stackOut_9_0 = (RuntimeException) var4;
            stackOut_9_1 = new StringBuilder().append("ad.G(");
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
              break L2;
            } else {
              stackOut_10_0 = (RuntimeException) (Object) stackIn_10_0;
              stackOut_10_1 = (StringBuilder) (Object) stackIn_10_1;
              stackOut_10_2 = "{...}";
              stackIn_12_0 = stackOut_10_0;
              stackIn_12_1 = stackOut_10_1;
              stackIn_12_2 = stackOut_10_2;
              break L2;
            }
          }
          throw la.a((Throwable) (Object) stackIn_12_0, stackIn_12_2 + 44 + param1 + 44 + param2 + 41);
        }
        return stackIn_8_0;
    }

    final synchronized int b(int param0, int param1) {
        if (param1 != 11619) {
            return -123;
        }
        if (!(this.a((byte) 73, param0))) {
            return 0;
        }
        if (null != ((ad) this).field_h[param0]) {
            return 100;
        }
        return ((ad) this).field_c.a(-48, param0);
    }

    ad(rf param0, boolean param1, int param2) {
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
        ((ad) this).field_a = null;
        try {
          L0: {
            L1: {
              if (0 > param2) {
                break L1;
              } else {
                if (2 >= param2) {
                  L2: {
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
                  ((ad) this).field_b = stackIn_7_1 != 0;
                  ((ad) this).field_e = param2;
                  ((ad) this).field_c = param0;
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
            stackOut_9_1 = new StringBuilder().append("ad.<init>(");
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
          throw la.a((Throwable) (Object) stackIn_12_0, stackIn_12_2 + 44 + param1 + 44 + param2 + 41);
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
            Object var10 = null;
            Object var11 = null;
            CharSequence var12 = null;
            int stackIn_5_0 = 0;
            int stackIn_32_0 = 0;
            int stackIn_43_0 = 0;
            int stackIn_46_0 = 0;
            int stackIn_75_0 = 0;
            int stackIn_82_0 = 0;
            int stackIn_86_0 = 0;
            int stackIn_96_0 = 0;
            int stackIn_98_0 = 0;
            RuntimeException stackIn_100_0 = null;
            StringBuilder stackIn_100_1 = null;
            RuntimeException stackIn_101_0 = null;
            StringBuilder stackIn_101_1 = null;
            RuntimeException stackIn_102_0 = null;
            StringBuilder stackIn_102_1 = null;
            String stackIn_102_2 = null;
            RuntimeException stackIn_103_0 = null;
            StringBuilder stackIn_103_1 = null;
            RuntimeException stackIn_104_0 = null;
            StringBuilder stackIn_104_1 = null;
            RuntimeException stackIn_105_0 = null;
            StringBuilder stackIn_105_1 = null;
            String stackIn_105_2 = null;
            Throwable decompiledCaughtException = null;
            int stackOut_4_0 = 0;
            int stackOut_31_0 = 0;
            int stackOut_42_0 = 0;
            int stackOut_41_0 = 0;
            int stackOut_45_0 = 0;
            int stackOut_44_0 = 0;
            int stackOut_74_0 = 0;
            int stackOut_81_0 = 0;
            int stackOut_85_0 = 0;
            int stackOut_95_0 = 0;
            int stackOut_97_0 = 0;
            RuntimeException stackOut_99_0 = null;
            StringBuilder stackOut_99_1 = null;
            RuntimeException stackOut_101_0 = null;
            StringBuilder stackOut_101_1 = null;
            String stackOut_101_2 = null;
            RuntimeException stackOut_100_0 = null;
            StringBuilder stackOut_100_1 = null;
            String stackOut_100_2 = null;
            RuntimeException stackOut_102_0 = null;
            StringBuilder stackOut_102_1 = null;
            RuntimeException stackOut_104_0 = null;
            StringBuilder stackOut_104_1 = null;
            String stackOut_104_2 = null;
            RuntimeException stackOut_103_0 = null;
            StringBuilder stackOut_103_1 = null;
            String stackOut_103_2 = null;
            var9 = MonkeyPuzzle2.field_F ? 1 : 0;
            try {
              L0: {
                L1: {
                  if (null == ol.field_g) {
                    if (cb.a(param1 ^ 665, param3)) {
                      break L1;
                    } else {
                      stackOut_4_0 = -1;
                      stackIn_5_0 = stackOut_4_0;
                      return stackIn_5_0;
                    }
                  } else {
                    break L1;
                  }
                }
                L2: {
                  if (dk.field_h == ii.field_r) {
                    L3: {
                      if (!param3) {
                        pj.field_b = h.a(param1 ^ -739, false, param4, param5);
                        break L3;
                      } else {
                        var11 = null;
                        pj.field_b = sk.a(param4, ia.field_f, false, true, (String) null);
                        break L3;
                      }
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
                L4: {
                  if (dk.field_h == kh.field_a) {
                    if (hj.a(1, true)) {
                      L5: {
                        var6_int = MonkeyPuzzle2.field_D.a((byte) 114);
                        if (var6_int != 0) {
                          dk.field_h = dk.field_d;
                          rc.field_f = -1;
                          wk.field_a = var6_int;
                          break L5;
                        } else {
                          dk.field_h = aa.field_b;
                          break L5;
                        }
                      }
                      MonkeyPuzzle2.field_D.field_h = 0;
                      break L4;
                    } else {
                      break L4;
                    }
                  } else {
                    break L4;
                  }
                }
                L6: {
                  if (aa.field_b != dk.field_h) {
                    break L6;
                  } else {
                    if (hj.a(8, true)) {
                      ld.field_a = MonkeyPuzzle2.field_D.i(127);
                      MonkeyPuzzle2.field_D.field_h = 0;
                      ki.a(param0, pj.field_b, true, param3, param2);
                      dk.field_h = qk.field_c;
                      break L6;
                    } else {
                      break L6;
                    }
                  }
                }
                L7: {
                  if (qk.field_c == dk.field_h) {
                    if (hj.a(1, true)) {
                      L8: {
                        var6_int = MonkeyPuzzle2.field_D.a((byte) 114);
                        df.field_o = null;
                        wk.field_a = var6_int;
                        MonkeyPuzzle2.field_D.field_h = 0;
                        if (var6_int == 0) {
                          break L8;
                        } else {
                          if (var6_int == 1) {
                            break L8;
                          } else {
                            if (var6_int != 8) {
                              dk.field_h = dk.field_d;
                              rc.field_f = -1;
                              break L7;
                            } else {
                              gk.a(-1);
                              ck.field_e = false;
                              stackOut_31_0 = var6_int;
                              stackIn_32_0 = stackOut_31_0;
                              return stackIn_32_0;
                            }
                          }
                        }
                      }
                      dk.field_h = ea.field_a;
                      rc.field_f = -1;
                      break L7;
                    } else {
                      break L7;
                    }
                  } else {
                    break L7;
                  }
                }
                L9: {
                  if (dk.field_h != ea.field_a) {
                    break L9;
                  } else {
                    if (!gb.a(true)) {
                      break L9;
                    } else {
                      L10: {
                        ia.field_f = MonkeyPuzzle2.field_D.i(103);
                        ec.field_d = MonkeyPuzzle2.field_D.a((byte) 114);
                        int discarded$7 = MonkeyPuzzle2.field_D.a((byte) 114);
                        af.field_c = MonkeyPuzzle2.field_D.j(17277);
                        var6_ref = MonkeyPuzzle2.field_D.g(-1185292952);
                        var7 = MonkeyPuzzle2.field_D.a((byte) 114);
                        if ((1 & var7) == 0) {
                          break L10;
                        } else {
                          gd.b(-594181854);
                          break L10;
                        }
                      }
                      L11: {
                        if (param3) {
                          break L11;
                        } else {
                          L12: {
                            if ((8 & var7) == 0) {
                              stackOut_42_0 = 0;
                              stackIn_43_0 = stackOut_42_0;
                              break L12;
                            } else {
                              stackOut_41_0 = 1;
                              stackIn_43_0 = stackOut_41_0;
                              break L12;
                            }
                          }
                          L13: {
                            rh.field_B = stackIn_43_0 != 0;
                            if (0 == (var7 & 4)) {
                              stackOut_45_0 = 0;
                              stackIn_46_0 = stackOut_45_0;
                              break L13;
                            } else {
                              stackOut_44_0 = 1;
                              stackIn_46_0 = stackOut_44_0;
                              break L13;
                            }
                          }
                          fj.field_J = stackIn_46_0 != 0;
                          if (rh.field_B) {
                            break L11;
                          } else {
                            break L11;
                          }
                        }
                      }
                      L14: {
                        if (me.field_e) {
                          int discarded$8 = MonkeyPuzzle2.field_D.a((byte) 114);
                          int discarded$9 = MonkeyPuzzle2.field_D.a((byte) 114);
                          int discarded$10 = MonkeyPuzzle2.field_D.e(param1 ^ 756);
                          il.field_h = MonkeyPuzzle2.field_D.j(param1 + 16627);
                          il.field_g = new byte[il.field_h];
                          var8 = 0;
                          L15: while (true) {
                            if (il.field_h <= var8) {
                              break L14;
                            } else {
                              il.field_g[var8] = MonkeyPuzzle2.field_D.k(-91);
                              var8++;
                              continue L15;
                            }
                          }
                        } else {
                          break L14;
                        }
                      }
                      L16: {
                        cl.field_e = MonkeyPuzzle2.field_D.f(-1);
                        var12 = (CharSequence) (Object) cl.field_e;
                        uj.field_f = pl.a((byte) 109, var12);
                        ue.field_G = MonkeyPuzzle2.field_D.a((byte) 114);
                        dk.field_h = wh.field_b;
                        if (pj.field_b.a(false) != te.field_a) {
                          if (pj.field_b.a(false) == sj.field_g) {
                            dh.field_d.a(false, ii.a(false));
                            break L16;
                          } else {
                            break L16;
                          }
                        } else {
                          oe.field_l.a(false, ii.a(false));
                          break L16;
                        }
                      }
                      L17: {
                        ck.field_e = false;
                        if (var6_ref != null) {
                          pe.a(var6_ref, (byte) -108, ii.a(false));
                          break L17;
                        } else {
                          break L17;
                        }
                      }
                      L18: {
                        L19: {
                          if (af.field_c > 0) {
                            break L19;
                          } else {
                            if (!fj.field_J) {
                              try {
                                L20: {
                                  Object discarded$11 = mf.a(-26159, "unzap", ii.a(false));
                                  break L20;
                                }
                              } catch (java.lang.Throwable decompiledCaughtParameter0) {
                                decompiledCaughtException = decompiledCaughtParameter0;
                                L21: {
                                  var8_ref_Throwable = decompiledCaughtException;
                                  break L21;
                                }
                              }
                              break L18;
                            } else {
                              break L19;
                            }
                          }
                        }
                        try {
                          L22: {
                            Object discarded$12 = mf.a(126, "zap", ii.a(false), new Object[1]);
                            break L22;
                          }
                        } catch (java.lang.Throwable decompiledCaughtParameter1) {
                          decompiledCaughtException = decompiledCaughtParameter1;
                          L23: {
                            var8_ref_Throwable = decompiledCaughtException;
                            break L23;
                          }
                        }
                        break L18;
                      }
                      L24: {
                        if (af.field_c <= 0) {
                          break L24;
                        } else {
                          mb.field_c = true;
                          break L24;
                        }
                      }
                      gf.field_c.a(e.field_b, param1 ^ 650);
                      var8 = 0;
                      L25: while (true) {
                        if (4 <= var8) {
                          MonkeyPuzzle2.field_D.a(e.field_b, 0);
                          stackOut_74_0 = wk.field_a;
                          stackIn_75_0 = stackOut_74_0;
                          return stackIn_75_0;
                        } else {
                          e.field_b[var8] = e.field_b[var8] + 50;
                          var8++;
                          continue L25;
                        }
                      }
                    }
                  }
                }
                L26: {
                  if (dk.field_h != dk.field_d) {
                    break L26;
                  } else {
                    if (gb.a(true)) {
                      L27: {
                        gk.a(param1 + -651);
                        if (wk.field_a != 7) {
                          break L27;
                        } else {
                          if (ck.field_e) {
                            break L27;
                          } else {
                            ck.field_e = true;
                            stackOut_81_0 = -1;
                            stackIn_82_0 = stackOut_81_0;
                            return stackIn_82_0;
                          }
                        }
                      }
                      L28: {
                        if (wk.field_a != 7) {
                          break L28;
                        } else {
                          wk.field_a = 3;
                          break L28;
                        }
                      }
                      sl.field_n = MonkeyPuzzle2.field_D.f(-1);
                      ck.field_e = false;
                      stackOut_85_0 = wk.field_a;
                      stackIn_86_0 = stackOut_85_0;
                      return stackIn_86_0;
                    } else {
                      break L26;
                    }
                  }
                }
                L29: {
                  if (param1 == 650) {
                    break L29;
                  } else {
                    var10 = null;
                    int discarded$13 = ad.a(-115, 60, false, false, (String) null, (String) null);
                    break L29;
                  }
                }
                L30: {
                  if (ol.field_g != null) {
                    break L30;
                  } else {
                    if (ck.field_e) {
                      L31: {
                        if (30000L >= wf.a(84)) {
                          sl.field_n = hh.field_p;
                          break L31;
                        } else {
                          sl.field_n = kj.field_E;
                          break L31;
                        }
                      }
                      ck.field_e = false;
                      stackOut_95_0 = 3;
                      stackIn_96_0 = stackOut_95_0;
                      return stackIn_96_0;
                    } else {
                      var6_int = cg.field_g;
                      cg.field_g = id.field_m;
                      id.field_m = var6_int;
                      ck.field_e = true;
                      break L30;
                    }
                  }
                }
                stackOut_97_0 = -1;
                stackIn_98_0 = stackOut_97_0;
                break L0;
              }
            } catch (java.lang.RuntimeException decompiledCaughtParameter2) {
              decompiledCaughtException = decompiledCaughtParameter2;
              L32: {
                var6 = (RuntimeException) (Object) decompiledCaughtException;
                stackOut_99_0 = (RuntimeException) var6;
                stackOut_99_1 = new StringBuilder().append("ad.F(").append(param0).append(44).append(param1).append(44).append(param2).append(44).append(param3).append(44);
                stackIn_101_0 = stackOut_99_0;
                stackIn_101_1 = stackOut_99_1;
                stackIn_100_0 = stackOut_99_0;
                stackIn_100_1 = stackOut_99_1;
                if (param4 == null) {
                  stackOut_101_0 = (RuntimeException) (Object) stackIn_101_0;
                  stackOut_101_1 = (StringBuilder) (Object) stackIn_101_1;
                  stackOut_101_2 = "null";
                  stackIn_102_0 = stackOut_101_0;
                  stackIn_102_1 = stackOut_101_1;
                  stackIn_102_2 = stackOut_101_2;
                  break L32;
                } else {
                  stackOut_100_0 = (RuntimeException) (Object) stackIn_100_0;
                  stackOut_100_1 = (StringBuilder) (Object) stackIn_100_1;
                  stackOut_100_2 = "{...}";
                  stackIn_102_0 = stackOut_100_0;
                  stackIn_102_1 = stackOut_100_1;
                  stackIn_102_2 = stackOut_100_2;
                  break L32;
                }
              }
              L33: {
                stackOut_102_0 = (RuntimeException) (Object) stackIn_102_0;
                stackOut_102_1 = ((StringBuilder) (Object) stackIn_102_1).append(stackIn_102_2).append(44);
                stackIn_104_0 = stackOut_102_0;
                stackIn_104_1 = stackOut_102_1;
                stackIn_103_0 = stackOut_102_0;
                stackIn_103_1 = stackOut_102_1;
                if (param5 == null) {
                  stackOut_104_0 = (RuntimeException) (Object) stackIn_104_0;
                  stackOut_104_1 = (StringBuilder) (Object) stackIn_104_1;
                  stackOut_104_2 = "null";
                  stackIn_105_0 = stackOut_104_0;
                  stackIn_105_1 = stackOut_104_1;
                  stackIn_105_2 = stackOut_104_2;
                  break L33;
                } else {
                  stackOut_103_0 = (RuntimeException) (Object) stackIn_103_0;
                  stackOut_103_1 = (StringBuilder) (Object) stackIn_103_1;
                  stackOut_103_2 = "{...}";
                  stackIn_105_0 = stackOut_103_0;
                  stackIn_105_1 = stackOut_103_1;
                  stackIn_105_2 = stackOut_103_2;
                  break L33;
                }
              }
              throw la.a((Throwable) (Object) stackIn_105_0, stackIn_105_2 + 41);
            }
            return stackIn_98_0;
        } catch (RuntimeException | Error decompiledUncheckedException) {
            throw decompiledUncheckedException;
        } catch (Throwable decompiledCheckedException) {
            throw new RuntimeException(decompiledCheckedException);
        }
    }

    final int a(String param0, byte param1) {
        int var3_int = 0;
        RuntimeException var3 = null;
        CharSequence var4 = null;
        int stackIn_5_0 = 0;
        int stackIn_7_0 = 0;
        RuntimeException stackIn_9_0 = null;
        StringBuilder stackIn_9_1 = null;
        RuntimeException stackIn_10_0 = null;
        StringBuilder stackIn_10_1 = null;
        RuntimeException stackIn_11_0 = null;
        StringBuilder stackIn_11_1 = null;
        String stackIn_11_2 = null;
        RuntimeException decompiledCaughtException = null;
        int stackOut_4_0 = 0;
        int stackOut_6_0 = 0;
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
              if (param1 == -81) {
                break L1;
              } else {
                int discarded$2 = ((ad) this).c((String) ((ad) this).field_h[13], (byte) 11);
                break L1;
              }
            }
            if (!((ad) this).a(85)) {
              stackOut_4_0 = 0;
              stackIn_5_0 = stackOut_4_0;
              return stackIn_5_0;
            } else {
              param0 = param0.toLowerCase();
              var4 = (CharSequence) (Object) param0;
              var3_int = ((ad) this).field_a.field_b.a(true, ra.a((byte) -117, var4));
              stackOut_6_0 = ((ad) this).b(var3_int, 11619);
              stackIn_7_0 = stackOut_6_0;
              break L0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L2: {
            var3 = decompiledCaughtException;
            stackOut_8_0 = (RuntimeException) var3;
            stackOut_8_1 = new StringBuilder().append("ad.Q(");
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
          throw la.a((Throwable) (Object) stackIn_11_0, stackIn_11_2 + 44 + param1 + 41);
        }
        return stackIn_7_0;
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
          if (field_g.length <= var0) {
            field_f = "Your email address is used to identify this account";
            return;
          } else {
            L1: {
              if (var0 == 0) {
                field_g[var0] = 20 * (var0 + 1) << 16;
                break L1;
              } else {
                field_g[var0] = var0 * 51 - -51 << 16;
                break L1;
              }
            }
            if (2 < var0) {
              field_g[var0] = bd.a(field_g[var0], (-2 + var0) * 22 << 8);
              var0++;
              continue L0;
            } else {
              var0++;
              continue L0;
            }
          }
        }
    }
}
