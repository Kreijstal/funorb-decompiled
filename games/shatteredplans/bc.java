/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class bc {
    boolean field_j;
    static String field_l;
    private Object[] field_m;
    static String field_h;
    static String field_i;
    private Object[][] field_n;
    private lc field_e;
    static wh field_g;
    static int[][] field_c;
    private ci field_f;
    static String field_a;
    static int field_b;
    static bc field_d;
    int field_k;

    final boolean a(byte param0, String param1, String param2) {
        int var4_int = 0;
        RuntimeException var4 = null;
        int var5 = 0;
        int var6 = 0;
        int stackIn_2_0 = 0;
        int stackIn_5_0 = 0;
        int stackIn_8_0 = 0;
        int stackIn_10_0 = 0;
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
        int stackOut_9_0 = 0;
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
            if (((bc) this).b((byte) 124)) {
              param2 = param2.toLowerCase();
              param1 = param1.toLowerCase();
              var4_int = ((bc) this).field_f.field_b.a(24396, pc.a(false, (CharSequence) (Object) param2));
              var5 = -116 / ((58 - param0) / 34);
              if (var4_int >= 0) {
                var6 = ((bc) this).field_f.field_i[var4_int].a(24396, pc.a(false, (CharSequence) (Object) param1));
                if (var6 >= 0) {
                  stackOut_9_0 = 1;
                  stackIn_10_0 = stackOut_9_0;
                  break L0;
                } else {
                  stackOut_7_0 = 0;
                  stackIn_8_0 = stackOut_7_0;
                  return stackIn_8_0 != 0;
                }
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
            var4 = decompiledCaughtException;
            stackOut_11_0 = (RuntimeException) var4;
            stackOut_11_1 = new StringBuilder().append("bc.CA(").append(param0).append(',');
            stackIn_14_0 = stackOut_11_0;
            stackIn_14_1 = stackOut_11_1;
            stackIn_12_0 = stackOut_11_0;
            stackIn_12_1 = stackOut_11_1;
            if (param1 == null) {
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
            stackOut_15_1 = ((StringBuilder) (Object) stackIn_15_1).append(stackIn_15_2).append(',');
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
          throw r.a((Throwable) (Object) stackIn_19_0, stackIn_19_2 + ')');
        }
        return stackIn_10_0 != 0;
    }

    final int a(int param0, byte param1, String param2) {
        int var4_int = 0;
        RuntimeException var4 = null;
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
            if (!this.b((byte) -63, param0)) {
              stackOut_3_0 = -1;
              stackIn_4_0 = stackOut_3_0;
              return stackIn_4_0;
            } else {
              L1: {
                param2 = param2.toLowerCase();
                var4_int = ((bc) this).field_f.field_i[param0].a(24396, pc.a(false, (CharSequence) (Object) param2));
                if (param1 == 106) {
                  break L1;
                } else {
                  ((boolean[]) ((bc) this).field_m[2])[1] = true;
                  break L1;
                }
              }
              if (this.b((byte) 52, param0, var4_int)) {
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
            stackOut_13_1 = new StringBuilder().append("bc.C(").append(param0).append(',').append(param1).append(',');
            stackIn_16_0 = stackOut_13_0;
            stackIn_16_1 = stackOut_13_1;
            stackIn_14_0 = stackOut_13_0;
            stackIn_14_1 = stackOut_13_1;
            if (param2 == null) {
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
          throw r.a((Throwable) (Object) stackIn_17_0, stackIn_17_2 + ')');
        }
        return stackIn_12_0;
    }

    final synchronized boolean b(byte param0) {
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
              var2_int = -20 % ((60 - param0) / 47);
              if (((bc) this).field_f != null) {
                break L1;
              } else {
                ((bc) this).field_f = ((bc) this).field_e.a(6);
                if (((bc) this).field_f == null) {
                  stackOut_6_0 = 0;
                  stackIn_7_0 = stackOut_6_0;
                  return stackIn_7_0 != 0;
                } else {
                  ((bc) this).field_m = new Object[((bc) this).field_f.field_a];
                  ((bc) this).field_n = new Object[((bc) this).field_f.field_a][];
                  break L1;
                }
              }
            }
            stackOut_9_0 = 1;
            stackIn_10_0 = stackOut_9_0;
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2 = decompiledCaughtException;
          throw r.a((Throwable) (Object) var2, "bc.AA(" + param0 + ')');
        }
        return stackIn_10_0 != 0;
    }

    final int a(String param0, byte param1) {
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
            if (param1 > 22) {
              if (((bc) this).b((byte) 127)) {
                param0 = param0.toLowerCase();
                var3_int = ((bc) this).field_f.field_b.a(24396, pc.a(false, (CharSequence) (Object) param0));
                stackOut_6_0 = ((bc) this).c((byte) 36, var3_int);
                stackIn_7_0 = stackOut_6_0;
                break L0;
              } else {
                stackOut_4_0 = 0;
                stackIn_5_0 = stackOut_4_0;
                return stackIn_5_0;
              }
            } else {
              stackOut_1_0 = -90;
              stackIn_2_0 = stackOut_1_0;
              return stackIn_2_0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L1: {
            var3 = decompiledCaughtException;
            stackOut_8_0 = (RuntimeException) var3;
            stackOut_8_1 = new StringBuilder().append("bc.L(");
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
          throw r.a((Throwable) (Object) stackIn_12_0, stackIn_12_2 + ',' + param1 + ')');
        }
        return stackIn_7_0;
    }

    final int a(byte param0) {
        RuntimeException var2 = null;
        int stackIn_5_0 = 0;
        int stackIn_7_0 = 0;
        RuntimeException decompiledCaughtException = null;
        int stackOut_6_0 = 0;
        int stackOut_4_0 = 0;
        try {
          L0: {
            L1: {
              if (param0 <= -72) {
                break L1;
              } else {
                ((bc) this).field_m[4] = ((bc) this).field_m[0];
                break L1;
              }
            }
            if (((bc) this).b((byte) -16)) {
              stackOut_6_0 = ((bc) this).field_f.field_m.length;
              stackIn_7_0 = stackOut_6_0;
              break L0;
            } else {
              stackOut_4_0 = -1;
              stackIn_5_0 = stackOut_4_0;
              return stackIn_5_0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2 = decompiledCaughtException;
          throw r.a((Throwable) (Object) var2, "bc.I(" + param0 + ')');
        }
        return stackIn_7_0;
    }

    final synchronized int c(byte param0, int param1) {
        RuntimeException var3 = null;
        int stackIn_4_0 = 0;
        int stackIn_7_0 = 0;
        int stackIn_12_0 = 0;
        RuntimeException decompiledCaughtException = null;
        int stackOut_3_0 = 0;
        int stackOut_11_0 = 0;
        int stackOut_6_0 = 0;
        try {
          L0: {
            if (!this.b((byte) -63, param1)) {
              stackOut_3_0 = 0;
              stackIn_4_0 = stackOut_3_0;
              return stackIn_4_0;
            } else {
              if (((bc) this).field_m[param1] == null) {
                L1: {
                  if (param0 == 36) {
                    break L1;
                  } else {
                    ((bc) this).field_m = (Object[]) ((bc) this).field_m[11];
                    break L1;
                  }
                }
                stackOut_11_0 = ((bc) this).field_e.a(param1, (byte) 77);
                stackIn_12_0 = stackOut_11_0;
                break L0;
              } else {
                stackOut_6_0 = 100;
                stackIn_7_0 = stackOut_6_0;
                return stackIn_7_0;
              }
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3 = decompiledCaughtException;
          throw r.a((Throwable) (Object) var3, "bc.A(" + param0 + ',' + param1 + ')');
        }
        return stackIn_12_0;
    }

    final synchronized boolean a(int param0) {
        int var2_int = 0;
        RuntimeException var2 = null;
        int var3 = 0;
        int var4 = 0;
        int var5 = 0;
        int stackIn_8_0 = 0;
        int stackIn_12_0 = 0;
        int stackIn_19_0 = 0;
        RuntimeException decompiledCaughtException = null;
        int stackOut_7_0 = 0;
        int stackOut_11_0 = 0;
        int stackOut_18_0 = 0;
        var5 = ShatteredPlansClient.field_F ? 1 : 0;
        try {
          L0: {
            L1: {
              if (param0 == -1) {
                break L1;
              } else {
                int discarded$2 = ((bc) this).a((String) null, (byte) -122);
                break L1;
              }
            }
            if (!((bc) this).b((byte) -43)) {
              stackOut_7_0 = 0;
              stackIn_8_0 = stackOut_7_0;
              return stackIn_8_0 != 0;
            } else {
              var2_int = 1;
              var3 = 0;
              L2: while (true) {
                L3: {
                  L4: {
                    if (var3 >= ((bc) this).field_f.field_q.length) {
                      break L4;
                    } else {
                      stackOut_11_0 = ((bc) this).field_f.field_q[var3];
                      stackIn_19_0 = stackOut_11_0;
                      stackIn_12_0 = stackOut_11_0;
                      if (var5 != 0) {
                        break L3;
                      } else {
                        L5: {
                          var4 = stackIn_12_0;
                          if (null == ((bc) this).field_m[var4]) {
                            this.a((byte) -113, var4);
                            if (null != ((bc) this).field_m[var4]) {
                              break L5;
                            } else {
                              var2_int = 0;
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
                  stackOut_18_0 = var2_int;
                  stackIn_19_0 = stackOut_18_0;
                  break L3;
                }
                break L0;
              }
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2 = decompiledCaughtException;
          throw r.a((Throwable) (Object) var2, "bc.W(" + param0 + ')');
        }
        return stackIn_19_0 != 0;
    }

    final int a(int param0, String param1) {
        int var3_int = 0;
        RuntimeException var3 = null;
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
            if (((bc) this).b((byte) -43)) {
              L1: {
                param1 = param1.toLowerCase();
                var3_int = ((bc) this).field_f.field_b.a(24396, pc.a(false, (CharSequence) (Object) param1));
                if (param0 > 121) {
                  break L1;
                } else {
                  field_h = null;
                  break L1;
                }
              }
              if (this.b((byte) -63, var3_int)) {
                stackOut_9_0 = var3_int;
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
            var3 = decompiledCaughtException;
            stackOut_11_0 = (RuntimeException) var3;
            stackOut_11_1 = new StringBuilder().append("bc.D(").append(param0).append(',');
            stackIn_14_0 = stackOut_11_0;
            stackIn_14_1 = stackOut_11_1;
            stackIn_12_0 = stackOut_11_0;
            stackIn_12_1 = stackOut_11_1;
            if (param1 == null) {
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
          throw r.a((Throwable) (Object) stackIn_15_0, stackIn_15_2 + ')');
        }
        return stackIn_10_0;
    }

    final boolean a(String param0, byte param1, String param2) {
        int var4_int = 0;
        RuntimeException var4 = null;
        int var5 = 0;
        int stackIn_4_0 = 0;
        boolean stackIn_7_0 = false;
        int stackIn_10_0 = 0;
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
        int stackOut_3_0 = 0;
        boolean stackOut_11_0 = false;
        int stackOut_9_0 = 0;
        boolean stackOut_6_0 = false;
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
            if (!((bc) this).b((byte) -80)) {
              stackOut_3_0 = 0;
              stackIn_4_0 = stackOut_3_0;
              return stackIn_4_0 != 0;
            } else {
              param0 = param0.toLowerCase();
              if (param1 == 5) {
                param2 = param2.toLowerCase();
                var4_int = ((bc) this).field_f.field_b.a(param1 + 24391, pc.a(false, (CharSequence) (Object) param0));
                if (this.b((byte) -63, var4_int)) {
                  var5 = ((bc) this).field_f.field_i[var4_int].a(param1 ^ 24393, pc.a(false, (CharSequence) (Object) param2));
                  stackOut_11_0 = ((bc) this).a((byte) 125, var5, var4_int);
                  stackIn_12_0 = stackOut_11_0;
                  break L0;
                } else {
                  stackOut_9_0 = 0;
                  stackIn_10_0 = stackOut_9_0;
                  return stackIn_10_0 != 0;
                }
              } else {
                stackOut_6_0 = ((boolean[]) ((bc) this).field_m[20])[23];
                stackIn_7_0 = stackOut_6_0;
                return stackIn_7_0;
              }
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L1: {
            var4 = decompiledCaughtException;
            stackOut_13_0 = (RuntimeException) var4;
            stackOut_13_1 = new StringBuilder().append("bc.P(");
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
          throw r.a((Throwable) (Object) stackIn_21_0, stackIn_21_2 + ')');
        }
        return stackIn_12_0;
    }

    private final synchronized boolean b(byte param0, int param1, int param2) {
        RuntimeException var4 = null;
        int stackIn_4_0 = 0;
        int stackIn_19_0 = 0;
        int stackIn_25_0 = 0;
        RuntimeException decompiledCaughtException = null;
        int stackOut_3_0 = 0;
        int stackOut_24_0 = 0;
        int stackOut_18_0 = 0;
        try {
          L0: {
            if (!((bc) this).b((byte) 125)) {
              stackOut_3_0 = 0;
              stackIn_4_0 = stackOut_3_0;
              return stackIn_4_0 != 0;
            } else {
              L1: {
                if (param1 < 0) {
                  break L1;
                } else {
                  if (param2 < 0) {
                    break L1;
                  } else {
                    if (((bc) this).field_f.field_m.length <= param1) {
                      break L1;
                    } else {
                      if (~((bc) this).field_f.field_m[param1] < ~param2) {
                        L2: {
                          if (param0 > 40) {
                            break L2;
                          } else {
                            field_g = (wh) ((bc) this).field_m[17];
                            break L2;
                          }
                        }
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
              if (sd.field_v) {
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
          throw r.a((Throwable) (Object) var4, "bc.H(" + param0 + ',' + param1 + ',' + param2 + ')');
        }
        return stackIn_25_0 != 0;
    }

    final boolean a(String param0, int param1) {
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
            if (((bc) this).b((byte) 127)) {
              var4 = 2 % ((param1 - -1) / 49);
              param0 = param0.toLowerCase();
              var3_int = ((bc) this).field_f.field_b.a(24396, pc.a(false, (CharSequence) (Object) param0));
              stackOut_3_0 = ((bc) this).b(87, var3_int);
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
            stackOut_5_1 = new StringBuilder().append("bc.U(");
            stackIn_8_0 = stackOut_5_0;
            stackIn_8_1 = stackOut_5_1;
            stackIn_6_0 = stackOut_5_0;
            stackIn_6_1 = stackOut_5_1;
            if (param0 == null) {
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
          throw r.a((Throwable) (Object) stackIn_9_0, stackIn_9_2 + ',' + param1 + ')');
        }
        return stackIn_4_0;
    }

    public static void b(int param0) {
        if (param0 != -466) {
            return;
        }
        try {
            field_g = null;
            field_c = null;
            field_a = null;
            field_h = null;
            field_i = null;
            field_l = null;
            field_d = null;
        } catch (RuntimeException runtimeException) {
            throw r.a((Throwable) (Object) runtimeException, "bc.BA(" + param0 + ')');
        }
    }

    private final synchronized void a(byte param0, int param1) {
        RuntimeException var3 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          L0: {
            L1: {
              L2: {
                if (((bc) this).field_j) {
                  break L2;
                } else {
                  ((bc) this).field_m[param1] = wq.a(false, (byte) -126, ((bc) this).field_e.a((byte) -120, param1));
                  if (!ShatteredPlansClient.field_F) {
                    break L1;
                  } else {
                    break L2;
                  }
                }
              }
              ((bc) this).field_m[param1] = (Object) (Object) ((bc) this).field_e.a((byte) -112, param1);
              break L1;
            }
            L3: {
              if (param0 < -42) {
                break L3;
              } else {
                int discarded$2 = ((bc) this).c((byte) 112, -73);
                break L3;
              }
            }
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3 = decompiledCaughtException;
          throw r.a((Throwable) (Object) var3, "bc.N(" + param0 + ',' + param1 + ')');
        }
    }

    final static void a(int param0, byte param1, long param2) {
        int var5 = 0;
        sl var4 = js.field_f;
        var4.h(param0, param1 + 253);
        if (param1 != 2) {
            return;
        }
        try {
            var4.field_j = var4.field_j + 1;
            var5 = var4.field_j;
            var4.c(7, (byte) -82);
            var4.b(-16426, param2);
            var4.b(-var5 + var4.field_j, (byte) 127);
        } catch (RuntimeException runtimeException) {
            throw r.a((Throwable) (Object) runtimeException, "bc.O(" + param0 + ',' + param1 + ',' + param2 + ')');
        }
    }

    private final synchronized byte[] a(int[] param0, int param1, int param2, int param3) {
        Object var5 = null;
        int var6 = 0;
        Object stackIn_4_0 = null;
        Object stackIn_17_0 = null;
        Object stackIn_43_0 = null;
        Object stackIn_45_0 = null;
        StringBuilder stackIn_45_1 = null;
        Object stackIn_47_0 = null;
        StringBuilder stackIn_47_1 = null;
        Object stackIn_48_0 = null;
        StringBuilder stackIn_48_1 = null;
        String stackIn_48_2 = null;
        RuntimeException decompiledCaughtException = null;
        Object stackOut_3_0 = null;
        Object stackOut_16_0 = null;
        Object stackOut_42_0 = null;
        Object stackOut_44_0 = null;
        StringBuilder stackOut_44_1 = null;
        Object stackOut_47_0 = null;
        StringBuilder stackOut_47_1 = null;
        String stackOut_47_2 = null;
        Object stackOut_45_0 = null;
        StringBuilder stackOut_45_1 = null;
        String stackOut_45_2 = null;
        try {
          L0: {
            if (!this.b((byte) 106, param2, param1)) {
              stackOut_3_0 = null;
              stackIn_4_0 = stackOut_3_0;
              return (byte[]) (Object) stackIn_4_0;
            } else {
              L1: {
                if (param3 > 81) {
                  break L1;
                } else {
                  boolean discarded$1 = this.a(42, (int[]) null, -94, (byte) -122);
                  break L1;
                }
              }
              L2: {
                L3: {
                  var5 = null;
                  if (null == ((bc) this).field_n[param2]) {
                    break L3;
                  } else {
                    if (null != ((bc) this).field_n[param2][param1]) {
                      break L2;
                    } else {
                      break L3;
                    }
                  }
                }
                var6 = this.a(param1, param0, param2, (byte) -113) ? 1 : 0;
                if (var6 != 0) {
                  break L2;
                } else {
                  this.a((byte) -127, param2);
                  var6 = this.a(param1, param0, param2, (byte) -114) ? 1 : 0;
                  if (var6 == 0) {
                    stackOut_16_0 = null;
                    stackIn_17_0 = stackOut_16_0;
                    return (byte[]) (Object) stackIn_17_0;
                  } else {
                    break L2;
                  }
                }
              }
              if (((bc) this).field_n[param2] != null) {
                L4: {
                  if (((bc) this).field_n[param2][param1] == null) {
                    break L4;
                  } else {
                    var5 = (Object) (Object) sq.a(-1, ((bc) this).field_n[param2][param1], false);
                    if (var5 == null) {
                      throw new RuntimeException("");
                    } else {
                      break L4;
                    }
                  }
                }
                L5: {
                  if (null != var5) {
                    L6: {
                      if (((bc) this).field_k == 1) {
                        break L6;
                      } else {
                        if (2 != ((bc) this).field_k) {
                          break L5;
                        } else {
                          ((bc) this).field_n[param2] = null;
                          if (!ShatteredPlansClient.field_F) {
                            break L5;
                          } else {
                            break L6;
                          }
                        }
                      }
                    }
                    ((bc) this).field_n[param2][param1] = null;
                    if (((bc) this).field_f.field_m[param2] == 1) {
                      ((bc) this).field_n[param2] = null;
                      break L5;
                    } else {
                      break L5;
                    }
                  } else {
                    break L5;
                  }
                }
                stackOut_42_0 = var5;
                stackIn_43_0 = stackOut_42_0;
                break L0;
              } else {
                throw new RuntimeException("");
              }
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L7: {
            var5 = (Object) (Object) decompiledCaughtException;
            stackOut_44_0 = var5;
            stackOut_44_1 = new StringBuilder().append("bc.B(");
            stackIn_47_0 = stackOut_44_0;
            stackIn_47_1 = stackOut_44_1;
            stackIn_45_0 = stackOut_44_0;
            stackIn_45_1 = stackOut_44_1;
            if (param0 == null) {
              stackOut_47_0 = stackIn_47_0;
              stackOut_47_1 = (StringBuilder) (Object) stackIn_47_1;
              stackOut_47_2 = "null";
              stackIn_48_0 = stackOut_47_0;
              stackIn_48_1 = stackOut_47_1;
              stackIn_48_2 = stackOut_47_2;
              break L7;
            } else {
              stackOut_45_0 = stackIn_45_0;
              stackOut_45_1 = (StringBuilder) (Object) stackIn_45_1;
              stackOut_45_2 = "{...}";
              stackIn_48_0 = stackOut_45_0;
              stackIn_48_1 = stackOut_45_1;
              stackIn_48_2 = stackOut_45_2;
              break L7;
            }
          }
          throw r.a((Throwable) (Object) stackIn_48_0, stackIn_48_2 + ',' + param1 + ',' + param2 + ',' + param3 + ')');
        }
        return (byte[]) (Object) stackIn_43_0;
    }

    final boolean b(String param0, byte param1) {
        int var3_int = 0;
        RuntimeException var3 = null;
        int stackIn_2_0 = 0;
        int stackIn_7_0 = 0;
        boolean stackIn_10_0 = false;
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
        boolean stackOut_9_0 = false;
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
            if (((bc) this).b((byte) 2)) {
              param0 = param0.toLowerCase();
              var3_int = ((bc) this).field_f.field_b.a(24396, pc.a(false, (CharSequence) (Object) param0));
              if (0 > var3_int) {
                stackOut_6_0 = 0;
                stackIn_7_0 = stackOut_6_0;
                return stackIn_7_0 != 0;
              } else {
                if (param1 < -110) {
                  stackOut_11_0 = 1;
                  stackIn_12_0 = stackOut_11_0;
                  break L0;
                } else {
                  stackOut_9_0 = ((boolean[]) ((bc) this).field_m[2])[11];
                  stackIn_10_0 = stackOut_9_0;
                  return stackIn_10_0;
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
          L1: {
            var3 = decompiledCaughtException;
            stackOut_13_0 = (RuntimeException) var3;
            stackOut_13_1 = new StringBuilder().append("bc.K(");
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
          throw r.a((Throwable) (Object) stackIn_17_0, stackIn_17_2 + ',' + param1 + ')');
        }
        return stackIn_12_0 != 0;
    }

    private final synchronized boolean b(byte param0, int param1) {
        RuntimeException var3 = null;
        int stackIn_2_0 = 0;
        int stackIn_16_0 = 0;
        int stackIn_21_0 = 0;
        RuntimeException decompiledCaughtException = null;
        int stackOut_20_0 = 0;
        int stackOut_15_0 = 0;
        int stackOut_1_0 = 0;
        try {
          L0: {
            if (((bc) this).b((byte) 115)) {
              L1: {
                if (param1 < 0) {
                  break L1;
                } else {
                  if (~((bc) this).field_f.field_m.length >= ~param1) {
                    break L1;
                  } else {
                    if (((bc) this).field_f.field_m[param1] != 0) {
                      L2: {
                        if (param0 == -63) {
                          break L2;
                        } else {
                          boolean discarded$2 = ((bc) this).a((byte) 34, -45, 63);
                          break L2;
                        }
                      }
                      stackOut_20_0 = 1;
                      stackIn_21_0 = stackOut_20_0;
                      break L0;
                    } else {
                      break L1;
                    }
                  }
                }
              }
              if (!sd.field_v) {
                stackOut_15_0 = 0;
                stackIn_16_0 = stackOut_15_0;
                return stackIn_16_0 != 0;
              } else {
                throw new IllegalArgumentException(Integer.toString(param1));
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
          throw r.a((Throwable) (Object) var3, "bc.G(" + param0 + ',' + param1 + ')');
        }
        return stackIn_21_0 != 0;
    }

    final byte[] a(int param0, int param1, int param2) {
        RuntimeException var4 = null;
        byte[] stackIn_4_0 = null;
        RuntimeException decompiledCaughtException = null;
        byte[] stackOut_3_0 = null;
        try {
          L0: {
            L1: {
              if (param1 == -1) {
                break L1;
              } else {
                field_i = (String) ((bc) this).field_m[11];
                break L1;
              }
            }
            stackOut_3_0 = this.a((int[]) null, param2, param0, 113);
            stackIn_4_0 = stackOut_3_0;
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var4 = decompiledCaughtException;
          throw r.a((Throwable) (Object) var4, "bc.F(" + param0 + ',' + param1 + ',' + param2 + ')');
        }
        return stackIn_4_0;
    }

    final int a(int param0, int param1) {
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
            if (!this.b((byte) -63, param0)) {
              stackOut_3_0 = 0;
              stackIn_4_0 = stackOut_3_0;
              return stackIn_4_0;
            } else {
              if (param1 == -26268) {
                stackOut_8_0 = ((bc) this).field_f.field_m[param0];
                stackIn_9_0 = stackOut_8_0;
                break L0;
              } else {
                stackOut_6_0 = ((int[]) ((bc) this).field_m[0])[4];
                stackIn_7_0 = stackOut_6_0;
                return stackIn_7_0;
              }
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3 = decompiledCaughtException;
          throw r.a((Throwable) (Object) var3, "bc.M(" + param0 + ',' + param1 + ')');
        }
        return stackIn_9_0;
    }

    final synchronized byte[] a(boolean param0, String param1, String param2) {
        int var4_int = 0;
        RuntimeException var4 = null;
        int var5 = 0;
        Object stackIn_5_0 = null;
        cm stackIn_7_0 = null;
        int stackIn_7_1 = 0;
        cm stackIn_9_0 = null;
        int stackIn_9_1 = 0;
        cm stackIn_10_0 = null;
        int stackIn_10_1 = 0;
        int stackIn_10_2 = 0;
        Object stackIn_14_0 = null;
        cm stackIn_16_0 = null;
        int stackIn_16_1 = 0;
        cm stackIn_18_0 = null;
        int stackIn_18_1 = 0;
        cm stackIn_19_0 = null;
        int stackIn_19_1 = 0;
        int stackIn_19_2 = 0;
        byte[] stackIn_20_0 = null;
        RuntimeException stackIn_22_0 = null;
        StringBuilder stackIn_22_1 = null;
        RuntimeException stackIn_24_0 = null;
        StringBuilder stackIn_24_1 = null;
        RuntimeException stackIn_25_0 = null;
        StringBuilder stackIn_25_1 = null;
        String stackIn_25_2 = null;
        RuntimeException stackIn_26_0 = null;
        StringBuilder stackIn_26_1 = null;
        RuntimeException stackIn_28_0 = null;
        StringBuilder stackIn_28_1 = null;
        RuntimeException stackIn_29_0 = null;
        StringBuilder stackIn_29_1 = null;
        String stackIn_29_2 = null;
        RuntimeException decompiledCaughtException = null;
        cm stackOut_6_0 = null;
        int stackOut_6_1 = 0;
        cm stackOut_9_0 = null;
        int stackOut_9_1 = 0;
        int stackOut_9_2 = 0;
        cm stackOut_7_0 = null;
        int stackOut_7_1 = 0;
        int stackOut_7_2 = 0;
        Object stackOut_13_0 = null;
        cm stackOut_15_0 = null;
        int stackOut_15_1 = 0;
        cm stackOut_18_0 = null;
        int stackOut_18_1 = 0;
        int stackOut_18_2 = 0;
        cm stackOut_16_0 = null;
        int stackOut_16_1 = 0;
        int stackOut_16_2 = 0;
        byte[] stackOut_19_0 = null;
        Object stackOut_4_0 = null;
        RuntimeException stackOut_21_0 = null;
        StringBuilder stackOut_21_1 = null;
        RuntimeException stackOut_24_0 = null;
        StringBuilder stackOut_24_1 = null;
        String stackOut_24_2 = null;
        RuntimeException stackOut_22_0 = null;
        StringBuilder stackOut_22_1 = null;
        String stackOut_22_2 = null;
        RuntimeException stackOut_25_0 = null;
        StringBuilder stackOut_25_1 = null;
        RuntimeException stackOut_28_0 = null;
        StringBuilder stackOut_28_1 = null;
        String stackOut_28_2 = null;
        RuntimeException stackOut_26_0 = null;
        StringBuilder stackOut_26_1 = null;
        String stackOut_26_2 = null;
        try {
          L0: {
            L1: {
              if (param0) {
                break L1;
              } else {
                this.a((byte) 105, 121);
                break L1;
              }
            }
            if (((bc) this).b((byte) -117)) {
              L2: {
                param2 = param2.toLowerCase();
                param1 = param1.toLowerCase();
                stackOut_6_0 = ((bc) this).field_f.field_b;
                stackOut_6_1 = 24396;
                stackIn_9_0 = stackOut_6_0;
                stackIn_9_1 = stackOut_6_1;
                stackIn_7_0 = stackOut_6_0;
                stackIn_7_1 = stackOut_6_1;
                if (param0) {
                  stackOut_9_0 = (cm) (Object) stackIn_9_0;
                  stackOut_9_1 = stackIn_9_1;
                  stackOut_9_2 = 0;
                  stackIn_10_0 = stackOut_9_0;
                  stackIn_10_1 = stackOut_9_1;
                  stackIn_10_2 = stackOut_9_2;
                  break L2;
                } else {
                  stackOut_7_0 = (cm) (Object) stackIn_7_0;
                  stackOut_7_1 = stackIn_7_1;
                  stackOut_7_2 = 1;
                  stackIn_10_0 = stackOut_7_0;
                  stackIn_10_1 = stackOut_7_1;
                  stackIn_10_2 = stackOut_7_2;
                  break L2;
                }
              }
              var4_int = ((cm) (Object) stackIn_10_0).a(stackIn_10_1, pc.a(stackIn_10_2 != 0, (CharSequence) (Object) param2));
              if (!this.b((byte) -63, var4_int)) {
                stackOut_13_0 = null;
                stackIn_14_0 = stackOut_13_0;
                return (byte[]) (Object) stackIn_14_0;
              } else {
                L3: {
                  stackOut_15_0 = ((bc) this).field_f.field_i[var4_int];
                  stackOut_15_1 = 24396;
                  stackIn_18_0 = stackOut_15_0;
                  stackIn_18_1 = stackOut_15_1;
                  stackIn_16_0 = stackOut_15_0;
                  stackIn_16_1 = stackOut_15_1;
                  if (param0) {
                    stackOut_18_0 = (cm) (Object) stackIn_18_0;
                    stackOut_18_1 = stackIn_18_1;
                    stackOut_18_2 = 0;
                    stackIn_19_0 = stackOut_18_0;
                    stackIn_19_1 = stackOut_18_1;
                    stackIn_19_2 = stackOut_18_2;
                    break L3;
                  } else {
                    stackOut_16_0 = (cm) (Object) stackIn_16_0;
                    stackOut_16_1 = stackIn_16_1;
                    stackOut_16_2 = 1;
                    stackIn_19_0 = stackOut_16_0;
                    stackIn_19_1 = stackOut_16_1;
                    stackIn_19_2 = stackOut_16_2;
                    break L3;
                  }
                }
                var5 = ((cm) (Object) stackIn_19_0).a(stackIn_19_1, pc.a(stackIn_19_2 != 0, (CharSequence) (Object) param1));
                stackOut_19_0 = ((bc) this).a(var4_int, -1, var5);
                stackIn_20_0 = stackOut_19_0;
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
          L4: {
            var4 = decompiledCaughtException;
            stackOut_21_0 = (RuntimeException) var4;
            stackOut_21_1 = new StringBuilder().append("bc.E(").append(param0).append(',');
            stackIn_24_0 = stackOut_21_0;
            stackIn_24_1 = stackOut_21_1;
            stackIn_22_0 = stackOut_21_0;
            stackIn_22_1 = stackOut_21_1;
            if (param1 == null) {
              stackOut_24_0 = (RuntimeException) (Object) stackIn_24_0;
              stackOut_24_1 = (StringBuilder) (Object) stackIn_24_1;
              stackOut_24_2 = "null";
              stackIn_25_0 = stackOut_24_0;
              stackIn_25_1 = stackOut_24_1;
              stackIn_25_2 = stackOut_24_2;
              break L4;
            } else {
              stackOut_22_0 = (RuntimeException) (Object) stackIn_22_0;
              stackOut_22_1 = (StringBuilder) (Object) stackIn_22_1;
              stackOut_22_2 = "{...}";
              stackIn_25_0 = stackOut_22_0;
              stackIn_25_1 = stackOut_22_1;
              stackIn_25_2 = stackOut_22_2;
              break L4;
            }
          }
          L5: {
            stackOut_25_0 = (RuntimeException) (Object) stackIn_25_0;
            stackOut_25_1 = ((StringBuilder) (Object) stackIn_25_1).append(stackIn_25_2).append(',');
            stackIn_28_0 = stackOut_25_0;
            stackIn_28_1 = stackOut_25_1;
            stackIn_26_0 = stackOut_25_0;
            stackIn_26_1 = stackOut_25_1;
            if (param2 == null) {
              stackOut_28_0 = (RuntimeException) (Object) stackIn_28_0;
              stackOut_28_1 = (StringBuilder) (Object) stackIn_28_1;
              stackOut_28_2 = "null";
              stackIn_29_0 = stackOut_28_0;
              stackIn_29_1 = stackOut_28_1;
              stackIn_29_2 = stackOut_28_2;
              break L5;
            } else {
              stackOut_26_0 = (RuntimeException) (Object) stackIn_26_0;
              stackOut_26_1 = (StringBuilder) (Object) stackIn_26_1;
              stackOut_26_2 = "{...}";
              stackIn_29_0 = stackOut_26_0;
              stackIn_29_1 = stackOut_26_1;
              stackIn_29_2 = stackOut_26_2;
              break L5;
            }
          }
          throw r.a((Throwable) (Object) stackIn_29_0, stackIn_29_2 + ')');
        }
        return stackIn_20_0;
    }

    final synchronized boolean a(byte param0, int param1, int param2) {
        RuntimeException var4 = null;
        int stackIn_5_0 = 0;
        int stackIn_11_0 = 0;
        int stackIn_16_0 = 0;
        int stackIn_21_0 = 0;
        int stackIn_23_0 = 0;
        RuntimeException decompiledCaughtException = null;
        int stackOut_10_0 = 0;
        int stackOut_15_0 = 0;
        int stackOut_20_0 = 0;
        int stackOut_22_0 = 0;
        int stackOut_4_0 = 0;
        try {
          L0: {
            L1: {
              if (param0 == 125) {
                break L1;
              } else {
                field_c = null;
                break L1;
              }
            }
            if (this.b((byte) 104, param2, param1)) {
              L2: {
                if (((bc) this).field_n[param2] == null) {
                  break L2;
                } else {
                  if (null == ((bc) this).field_n[param2][param1]) {
                    break L2;
                  } else {
                    stackOut_10_0 = 1;
                    stackIn_11_0 = stackOut_10_0;
                    return stackIn_11_0 != 0;
                  }
                }
              }
              if (((bc) this).field_m[param2] != null) {
                stackOut_15_0 = 1;
                stackIn_16_0 = stackOut_15_0;
                return stackIn_16_0 != 0;
              } else {
                this.a((byte) -66, param2);
                if (((bc) this).field_m[param2] != null) {
                  stackOut_20_0 = 1;
                  stackIn_21_0 = stackOut_20_0;
                  return stackIn_21_0 != 0;
                } else {
                  stackOut_22_0 = 0;
                  stackIn_23_0 = stackOut_22_0;
                  break L0;
                }
              }
            } else {
              stackOut_4_0 = 0;
              stackIn_5_0 = stackOut_4_0;
              return stackIn_5_0 != 0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var4 = decompiledCaughtException;
          throw r.a((Throwable) (Object) var4, "bc.T(" + param0 + ',' + param1 + ',' + param2 + ')');
        }
        return stackIn_23_0 != 0;
    }

    final synchronized int d(int param0) {
        int var2_int = 0;
        RuntimeException var2 = null;
        int var3 = 0;
        int var4 = 0;
        int var5 = 0;
        int stackIn_3_0 = 0;
        int stackIn_7_0 = 0;
        int stackIn_7_1 = 0;
        int stackIn_14_0 = 0;
        int stackIn_16_0 = 0;
        int stackIn_16_1 = 0;
        int stackIn_17_0 = 0;
        RuntimeException decompiledCaughtException = null;
        int stackOut_6_0 = 0;
        int stackOut_6_1 = 0;
        int stackOut_15_0 = 0;
        int stackOut_15_1 = 0;
        int stackOut_13_0 = 0;
        int stackOut_16_0 = 0;
        int stackOut_2_0 = 0;
        var5 = ShatteredPlansClient.field_F ? 1 : 0;
        try {
          L0: {
            if (((bc) this).b((byte) 111)) {
              var2_int = 0;
              var3 = 0;
              var4 = 0;
              L1: while (true) {
                L2: {
                  L3: {
                    if (~var4 <= ~((bc) this).field_m.length) {
                      break L3;
                    } else {
                      stackOut_6_0 = 0;
                      stackOut_6_1 = ((bc) this).field_f.field_n[var4];
                      stackIn_16_0 = stackOut_6_0;
                      stackIn_16_1 = stackOut_6_1;
                      stackIn_7_0 = stackOut_6_0;
                      stackIn_7_1 = stackOut_6_1;
                      if (var5 != 0) {
                        break L2;
                      } else {
                        L4: {
                          if (stackIn_7_0 >= stackIn_7_1) {
                            break L4;
                          } else {
                            var3 = var3 + ((bc) this).c((byte) 36, var4);
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
                  if (var2_int != 0) {
                    stackOut_15_0 = var3 * param0;
                    stackOut_15_1 = var2_int;
                    stackIn_16_0 = stackOut_15_0;
                    stackIn_16_1 = stackOut_15_1;
                    break L2;
                  } else {
                    stackOut_13_0 = 100;
                    stackIn_14_0 = stackOut_13_0;
                    return stackIn_14_0;
                  }
                }
                var4 = stackIn_16_0 / stackIn_16_1;
                stackOut_16_0 = var4;
                stackIn_17_0 = stackOut_16_0;
                break L0;
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
          throw r.a((Throwable) (Object) var2, "bc.R(" + param0 + ')');
        }
        return stackIn_17_0;
    }

    final synchronized byte[] a(boolean param0, int param1) {
        RuntimeException var3 = null;
        Object stackIn_2_0 = null;
        byte[] stackIn_7_0 = null;
        Object stackIn_10_0 = null;
        byte[] stackIn_16_0 = null;
        RuntimeException decompiledCaughtException = null;
        byte[] stackOut_6_0 = null;
        byte[] stackOut_15_0 = null;
        Object stackOut_9_0 = null;
        Object stackOut_1_0 = null;
        try {
          if (((bc) this).b((byte) -106)) {
            if (1 == ((bc) this).field_f.field_m.length) {
              stackOut_6_0 = ((bc) this).a(0, -1, param1);
              stackIn_7_0 = stackOut_6_0;
              return stackIn_7_0;
            } else {
              if (this.b((byte) -63, param1)) {
                L0: {
                  if (!param0) {
                    break L0;
                  } else {
                    int discarded$2 = ((bc) this).a((String) null, (byte) -7);
                    break L0;
                  }
                }
                if (((bc) this).field_f.field_m[param1] != 1) {
                  throw new RuntimeException();
                } else {
                  stackOut_15_0 = ((bc) this).a(param1, -1, 0);
                  stackIn_16_0 = stackOut_15_0;
                  return stackIn_16_0;
                }
              } else {
                stackOut_9_0 = null;
                stackIn_10_0 = stackOut_9_0;
                return (byte[]) (Object) stackIn_10_0;
              }
            }
          } else {
            stackOut_1_0 = null;
            stackIn_2_0 = stackOut_1_0;
            return (byte[]) (Object) stackIn_2_0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3 = decompiledCaughtException;
          throw r.a((Throwable) (Object) var3, "bc.Q(" + param0 + ',' + param1 + ')');
        }
    }

    private final synchronized boolean a(int param0, int[] param1, int param2, byte param3) {
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
        ob var10_ref = null;
        RuntimeException var11_ref_RuntimeException = null;
        int var11 = 0;
        int var12 = 0;
        ob var13 = null;
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
        int stackIn_3_0 = 0;
        int stackIn_6_0 = 0;
        int stackIn_13_0 = 0;
        Object stackIn_16_0 = null;
        int[] stackIn_16_1 = null;
        int stackIn_30_0 = 0;
        Object stackIn_32_0 = null;
        int[] stackIn_32_1 = null;
        RuntimeException stackIn_50_0 = null;
        StringBuilder stackIn_50_1 = null;
        RuntimeException stackIn_52_0 = null;
        StringBuilder stackIn_52_1 = null;
        RuntimeException stackIn_53_0 = null;
        StringBuilder stackIn_53_1 = null;
        int stackIn_53_2 = 0;
        int stackIn_65_0 = 0;
        int stackIn_79_0 = 0;
        int stackIn_82_0 = 0;
        int stackIn_86_0 = 0;
        int stackIn_103_0 = 0;
        int stackIn_112_0 = 0;
        int stackIn_122_0 = 0;
        int stackIn_131_0 = 0;
        int stackIn_159_0 = 0;
        RuntimeException stackIn_161_0 = null;
        StringBuilder stackIn_161_1 = null;
        RuntimeException stackIn_163_0 = null;
        StringBuilder stackIn_163_1 = null;
        RuntimeException stackIn_164_0 = null;
        StringBuilder stackIn_164_1 = null;
        String stackIn_164_2 = null;
        RuntimeException decompiledCaughtException = null;
        Object stackOut_15_0 = null;
        int[] stackOut_15_1 = null;
        int stackOut_29_0 = 0;
        Object stackOut_31_0 = null;
        int[] stackOut_31_1 = null;
        RuntimeException stackOut_49_0 = null;
        StringBuilder stackOut_49_1 = null;
        RuntimeException stackOut_52_0 = null;
        StringBuilder stackOut_52_1 = null;
        int stackOut_52_2 = 0;
        RuntimeException stackOut_50_0 = null;
        StringBuilder stackOut_50_1 = null;
        int stackOut_50_2 = 0;
        int stackOut_64_0 = 0;
        int stackOut_78_0 = 0;
        int stackOut_81_0 = 0;
        int stackOut_85_0 = 0;
        int stackOut_102_0 = 0;
        int stackOut_111_0 = 0;
        int stackOut_121_0 = 0;
        int stackOut_130_0 = 0;
        int stackOut_158_0 = 0;
        int stackOut_12_0 = 0;
        int stackOut_5_0 = 0;
        int stackOut_2_0 = 0;
        RuntimeException stackOut_160_0 = null;
        StringBuilder stackOut_160_1 = null;
        RuntimeException stackOut_163_0 = null;
        StringBuilder stackOut_163_1 = null;
        String stackOut_163_2 = null;
        RuntimeException stackOut_161_0 = null;
        StringBuilder stackOut_161_1 = null;
        String stackOut_161_2 = null;
        var22 = ShatteredPlansClient.field_F ? 1 : 0;
        try {
          L0: {
            if (this.b((byte) -63, param2)) {
              if (((bc) this).field_m[param2] != null) {
                L1: {
                  var5_int = ((bc) this).field_f.field_n[param2];
                  var6 = ((bc) this).field_f.field_k[param2];
                  if (null == ((bc) this).field_n[param2]) {
                    ((bc) this).field_n[param2] = new Object[((bc) this).field_f.field_m[param2]];
                    break L1;
                  } else {
                    break L1;
                  }
                }
                var7 = ((bc) this).field_n[param2];
                var8 = 1;
                var9_int = 0;
                if (param3 <= -4) {
                  L2: while (true) {
                    L3: {
                      L4: {
                        if (~var9_int <= ~var5_int) {
                          break L4;
                        } else {
                          stackOut_15_0 = null;
                          stackOut_15_1 = (int[]) var6;
                          stackIn_32_0 = stackOut_15_0;
                          stackIn_32_1 = stackOut_15_1;
                          stackIn_16_0 = stackOut_15_0;
                          stackIn_16_1 = stackOut_15_1;
                          if (var22 != 0) {
                            break L3;
                          } else {
                            L5: {
                              L6: {
                                if (stackIn_16_0 != (Object) (Object) stackIn_16_1) {
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
                      if (var8 != 0) {
                        stackOut_29_0 = 1;
                        stackIn_30_0 = stackOut_29_0;
                        return stackIn_30_0 != 0;
                      } else {
                        stackOut_31_0 = null;
                        stackOut_31_1 = (int[]) param1;
                        stackIn_32_0 = stackOut_31_0;
                        stackIn_32_1 = stackOut_31_1;
                        break L3;
                      }
                    }
                    L8: {
                      L9: {
                        if (stackIn_32_0 == (Object) (Object) stackIn_32_1) {
                          break L9;
                        } else {
                          L10: {
                            if (0 != param1[0]) {
                              break L10;
                            } else {
                              if (param1[1] != 0) {
                                break L10;
                              } else {
                                if (param1[2] != 0) {
                                  break L10;
                                } else {
                                  if (param1[3] == 0) {
                                    break L9;
                                  } else {
                                    break L10;
                                  }
                                }
                              }
                            }
                          }
                          var9_array = sq.a(-1, ((bc) this).field_m[param2], true);
                          var10_ref = new ob(var9_array);
                          var10_ref.a(5, param1, (byte) -82, var10_ref.field_h.length);
                          break L8;
                        }
                      }
                      var9_array = sq.a(-1, ((bc) this).field_m[param2], false);
                      break L8;
                    }
                    try {
                      L11: {
                        var10 = pa.a(var9_array, 200);
                        break L11;
                      }
                    } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
                      decompiledCaughtException = decompiledCaughtParameter0;
                      L12: {
                        var11_ref_RuntimeException = decompiledCaughtException;
                        stackOut_49_0 = (RuntimeException) var11_ref_RuntimeException;
                        stackOut_49_1 = new StringBuilder();
                        stackIn_52_0 = stackOut_49_0;
                        stackIn_52_1 = stackOut_49_1;
                        stackIn_50_0 = stackOut_49_0;
                        stackIn_50_1 = stackOut_49_1;
                        if (param1 == null) {
                          stackOut_52_0 = (RuntimeException) (Object) stackIn_52_0;
                          stackOut_52_1 = (StringBuilder) (Object) stackIn_52_1;
                          stackOut_52_2 = 0;
                          stackIn_53_0 = stackOut_52_0;
                          stackIn_53_1 = stackOut_52_1;
                          stackIn_53_2 = stackOut_52_2;
                          break L12;
                        } else {
                          stackOut_50_0 = (RuntimeException) (Object) stackIn_50_0;
                          stackOut_50_1 = (StringBuilder) (Object) stackIn_50_1;
                          stackOut_50_2 = 1;
                          stackIn_53_0 = stackOut_50_0;
                          stackIn_53_1 = stackOut_50_1;
                          stackIn_53_2 = stackOut_50_2;
                          break L12;
                        }
                      }
                      throw r.a((Throwable) (Object) stackIn_53_0, (stackIn_53_2 != 0) + " " + param2 + " " + var9_array.length + " " + me.a(63, var9_array, var9_array.length) + " " + me.a(59, var9_array, var9_array.length - 2) + " " + ((bc) this).field_f.field_f[param2] + " " + ((bc) this).field_f.field_c);
                    }
                    L13: {
                      if (((bc) this).field_j) {
                        ((bc) this).field_m[param2] = null;
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
                              if (((bc) this).field_k != 2) {
                                break L17;
                              } else {
                                var11 = var10.length;
                                var11--;
                                var12 = 255 & var10[var11];
                                var11 = var11 - 4 * (var5_int * var12);
                                var13 = new ob(var10);
                                var14_int = 0;
                                var13.field_j = var11;
                                var15_int = 0;
                                var16 = 0;
                                L18: while (true) {
                                  L19: {
                                    L20: {
                                      if (~var16 <= ~var12) {
                                        break L20;
                                      } else {
                                        var17 = 0;
                                        stackOut_64_0 = 0;
                                        stackIn_79_0 = stackOut_64_0;
                                        stackIn_65_0 = stackOut_64_0;
                                        if (var22 != 0) {
                                          break L19;
                                        } else {
                                          var18 = stackIn_65_0;
                                          L21: while (true) {
                                            L22: {
                                              L23: {
                                                if (~var18 <= ~var5_int) {
                                                  break L23;
                                                } else {
                                                  var17 = var17 + var13.a(16711680);
                                                  if (var22 != 0) {
                                                    break L22;
                                                  } else {
                                                    L24: {
                                                      L25: {
                                                        if (var6 != null) {
                                                          break L25;
                                                        } else {
                                                          var19 = var18;
                                                          if (var22 == 0) {
                                                            break L24;
                                                          } else {
                                                            break L25;
                                                          }
                                                        }
                                                      }
                                                      var19 = var6[var18];
                                                      break L24;
                                                    }
                                                    L26: {
                                                      if (var19 != param0) {
                                                        break L26;
                                                      } else {
                                                        var14_int = var14_int + var17;
                                                        var15_int = var19;
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
                                    stackOut_78_0 = var14_int;
                                    stackIn_79_0 = stackOut_78_0;
                                    break L19;
                                  }
                                  if (stackIn_79_0 == 0) {
                                    stackOut_81_0 = 1;
                                    stackIn_82_0 = stackOut_81_0;
                                    return stackIn_82_0 != 0;
                                  } else {
                                    var16_ref_byte__ = new byte[var14_int];
                                    var14_int = 0;
                                    var13.field_j = var11;
                                    var17 = 0;
                                    var18 = 0;
                                    L27: while (true) {
                                      L28: {
                                        if (~var12 >= ~var18) {
                                          break L28;
                                        } else {
                                          var19 = 0;
                                          stackOut_85_0 = 0;
                                          stackIn_159_0 = stackOut_85_0;
                                          stackIn_86_0 = stackOut_85_0;
                                          if (var22 != 0) {
                                            break L14;
                                          } else {
                                            var20 = stackIn_86_0;
                                            L29: while (true) {
                                              L30: {
                                                L31: {
                                                  if (~var5_int >= ~var20) {
                                                    break L31;
                                                  } else {
                                                    var19 = var19 + var13.a(16711680);
                                                    if (var22 != 0) {
                                                      break L30;
                                                    } else {
                                                      L32: {
                                                        L33: {
                                                          if (null == var6) {
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
                                                        if (param0 != var21) {
                                                          break L34;
                                                        } else {
                                                          ps.a(var10, var17, var16_ref_byte__, var14_int, var19);
                                                          var14_int = var14_int + var19;
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
                                  }
                                }
                              }
                            }
                            var11 = var10.length;
                            var11--;
                            var12 = 255 & var10[var11];
                            var11 = var11 - 4 * (var12 * var5_int);
                            var13 = new ob(var10);
                            var13.field_j = var11;
                            var14 = new int[var5_int];
                            var15_int = 0;
                            L35: while (true) {
                              L36: {
                                L37: {
                                  if (~var12 >= ~var15_int) {
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
                                            if (~var17 <= ~var5_int) {
                                              break L40;
                                            } else {
                                              var16 = var16 + var13.a(16711680);
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
                                  var13.field_j = var11;
                                  var16 = 0;
                                  break L42;
                                }
                                var17 = 0;
                                L44: while (true) {
                                  L45: {
                                    L46: {
                                      if (var12 <= var17) {
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
                                                  var18 = var18 + var13.a(16711680);
                                                  ps.a(var10, var16, var15[var19], var14[var19], var18);
                                                  var14[var19] = var14[var19] + var18;
                                                  var16 = var16 + var18;
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
                                      if (var5_int <= var17) {
                                        break L51;
                                      } else {
                                        if (var22 != 0) {
                                          break L15;
                                        } else {
                                          L52: {
                                            L53: {
                                              if (null == var6) {
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
                                              if (((bc) this).field_k != 0) {
                                                break L55;
                                              } else {
                                                var7[var18] = wq.a(false, (byte) -127, var15[var17]);
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
                          if (0 != ((bc) this).field_k) {
                            break L58;
                          } else {
                            var7[var11] = wq.a(false, (byte) -126, var10);
                            if (var22 == 0) {
                              break L15;
                            } else {
                              break L58;
                            }
                          }
                        }
                        var7[var11] = (Object) (Object) var10;
                        break L15;
                      }
                      stackOut_158_0 = 1;
                      stackIn_159_0 = stackOut_158_0;
                      break L14;
                    }
                    break L0;
                  }
                } else {
                  stackOut_12_0 = 0;
                  stackIn_13_0 = stackOut_12_0;
                  return stackIn_13_0 != 0;
                }
              } else {
                stackOut_5_0 = 0;
                stackIn_6_0 = stackOut_5_0;
                return stackIn_6_0 != 0;
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
            stackOut_160_0 = (RuntimeException) var5;
            stackOut_160_1 = new StringBuilder().append("bc.J(").append(param0).append(',');
            stackIn_163_0 = stackOut_160_0;
            stackIn_163_1 = stackOut_160_1;
            stackIn_161_0 = stackOut_160_0;
            stackIn_161_1 = stackOut_160_1;
            if (param1 == null) {
              stackOut_163_0 = (RuntimeException) (Object) stackIn_163_0;
              stackOut_163_1 = (StringBuilder) (Object) stackIn_163_1;
              stackOut_163_2 = "null";
              stackIn_164_0 = stackOut_163_0;
              stackIn_164_1 = stackOut_163_1;
              stackIn_164_2 = stackOut_163_2;
              break L59;
            } else {
              stackOut_161_0 = (RuntimeException) (Object) stackIn_161_0;
              stackOut_161_1 = (StringBuilder) (Object) stackIn_161_1;
              stackOut_161_2 = "{...}";
              stackIn_164_0 = stackOut_161_0;
              stackIn_164_1 = stackOut_161_1;
              stackIn_164_2 = stackOut_161_2;
              break L59;
            }
          }
          throw r.a((Throwable) (Object) stackIn_164_0, stackIn_164_2 + ',' + param2 + ',' + param3 + ')');
        }
        return stackIn_159_0 != 0;
    }

    final static void c(int param0) {
        RuntimeException var1 = null;
        int var2 = 0;
        RuntimeException decompiledCaughtException = null;
        var2 = ShatteredPlansClient.field_F ? 1 : 0;
        try {
          L0: {
            if (!qe.a(116)) {
              L1: {
                if (null == bj.field_K) {
                  break L1;
                } else {
                  if (bj.field_K.field_c) {
                    ej.c(0);
                    rp.field_I.a(true, (vg) (Object) new bo(rp.field_I, bg.field_f));
                    break L1;
                  } else {
                    break L1;
                  }
                }
              }
              return;
            } else {
              L2: {
                if (param0 <= -11) {
                  break L2;
                } else {
                  field_h = null;
                  break L2;
                }
              }
              boolean discarded$12 = rp.field_I.a(eg.field_o, true, re.field_b, (byte) 0);
              rp.field_I.i(125);
              L3: while (true) {
                L4: {
                  L5: {
                    if (!cc.e((byte) 55)) {
                      break L5;
                    } else {
                      boolean discarded$13 = rp.field_I.a(oq.field_j, ho.field_h, true);
                      if (var2 != 0) {
                        break L4;
                      } else {
                        if (var2 == 0) {
                          continue L3;
                        } else {
                          break L5;
                        }
                      }
                    }
                  }
                  break L4;
                }
                break L0;
              }
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var1 = decompiledCaughtException;
          throw r.a((Throwable) (Object) var1, "bc.V(" + param0 + ')');
        }
    }

    final synchronized boolean b(int param0, int param1) {
        RuntimeException var3 = null;
        int stackIn_2_0 = 0;
        int stackIn_5_0 = 0;
        int stackIn_10_0 = 0;
        int stackIn_15_0 = 0;
        RuntimeException decompiledCaughtException = null;
        int stackOut_9_0 = 0;
        int stackOut_14_0 = 0;
        int stackOut_4_0 = 0;
        int stackOut_1_0 = 0;
        try {
          L0: {
            if (this.b((byte) -63, param1)) {
              if (null == ((bc) this).field_m[param1]) {
                this.a((byte) -73, param1);
                if (((bc) this).field_m[param1] != null) {
                  stackOut_9_0 = 1;
                  stackIn_10_0 = stackOut_9_0;
                  return stackIn_10_0 != 0;
                } else {
                  L1: {
                    if (param0 >= 83) {
                      break L1;
                    } else {
                      int discarded$2 = ((bc) this).d(-19);
                      break L1;
                    }
                  }
                  stackOut_14_0 = 0;
                  stackIn_15_0 = stackOut_14_0;
                  break L0;
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
          throw r.a((Throwable) (Object) var3, "bc.S(" + param0 + ',' + param1 + ')');
        }
        return stackIn_15_0 != 0;
    }

    bc(lc param0, boolean param1, int param2) {
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
        ((bc) this).field_f = null;
        try {
          L0: {
            L1: {
              if (param2 < 0) {
                break L1;
              } else {
                if (param2 > 2) {
                  break L1;
                } else {
                  ((bc) this).field_k = param2;
                  ((bc) this).field_j = param1;
                  ((bc) this).field_e = param0;
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
            stackOut_8_1 = new StringBuilder().append("bc.<init>(");
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
          throw r.a((Throwable) (Object) stackIn_12_0, stackIn_12_2 + ',' + param1 + ',' + param2 + ')');
        }
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_l = "Password is valid";
        field_a = "1 point, 1 point per turn.";
        field_c = new int[4][];
        field_i = "Accept invitation to <%0>'s game";
        field_h = "Scamming";
    }
}
