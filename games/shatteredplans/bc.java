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
        CharSequence var7 = null;
        CharSequence var8 = null;
        int stackIn_2_0 = 0;
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
        RuntimeException stackIn_15_0 = null;
        StringBuilder stackIn_15_1 = null;
        RuntimeException stackIn_16_0 = null;
        StringBuilder stackIn_16_1 = null;
        RuntimeException stackIn_17_0 = null;
        StringBuilder stackIn_17_1 = null;
        String stackIn_17_2 = null;
        RuntimeException decompiledCaughtException = null;
        int stackOut_9_0 = 0;
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
            if (((bc) this).b((byte) 124)) {
              param2 = param2.toLowerCase();
              param1 = param1.toLowerCase();
              var7 = (CharSequence) (Object) param2;
              var4_int = ((bc) this).field_f.field_b.a(24396, pc.a(false, var7));
              var5 = -116 / ((58 - param0) / 34);
              if (var4_int >= 0) {
                var8 = (CharSequence) (Object) param1;
                var6 = ((bc) this).field_f.field_i[var4_int].a(24396, pc.a(false, var8));
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
            stackOut_11_1 = new StringBuilder().append("bc.CA(").append(param0).append(44);
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
            stackOut_14_1 = ((StringBuilder) (Object) stackIn_14_1).append(stackIn_14_2).append(44);
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
          throw r.a((Throwable) (Object) stackIn_17_0, stackIn_17_2 + 41);
        }
        return stackIn_10_0 != 0;
    }

    final int a(int param0, byte param1, String param2) {
        int var4_int = 0;
        RuntimeException var4 = null;
        CharSequence var5 = null;
        int stackIn_3_0 = 0;
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
        int stackOut_2_0 = 0;
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
            if (!this.b((byte) -63, param0)) {
              stackOut_2_0 = -1;
              stackIn_3_0 = stackOut_2_0;
              return stackIn_3_0;
            } else {
              L1: {
                param2 = param2.toLowerCase();
                var5 = (CharSequence) (Object) param2;
                var4_int = ((bc) this).field_f.field_i[param0].a(24396, pc.a(false, var5));
                if (param1 == 106) {
                  break L1;
                } else {
                  ((boolean[]) ((bc) this).field_m[2])[1] = true;
                  break L1;
                }
              }
              if (this.b((byte) 52, param0, var4_int)) {
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
            stackOut_11_1 = new StringBuilder().append("bc.C(").append(param0).append(44).append(param1).append(44);
            stackIn_13_0 = stackOut_11_0;
            stackIn_13_1 = stackOut_11_1;
            stackIn_12_0 = stackOut_11_0;
            stackIn_12_1 = stackOut_11_1;
            if (param2 == null) {
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
          throw r.a((Throwable) (Object) stackIn_14_0, stackIn_14_2 + 41);
        }
        return stackIn_10_0;
    }

    final synchronized boolean b(byte param0) {
        int var2 = -20 % ((60 - param0) / 47);
        if (((bc) this).field_f != null) {
            return true;
        }
        ((bc) this).field_f = ((bc) this).field_e.a(6);
        if (!(((bc) this).field_f != null)) {
            return false;
        }
        ((bc) this).field_m = new Object[((bc) this).field_f.field_a];
        ((bc) this).field_n = new Object[((bc) this).field_f.field_a][];
        return true;
    }

    final int a(String param0, byte param1) {
        int var3_int = 0;
        RuntimeException var3 = null;
        CharSequence var4 = null;
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
            if (param1 > 22) {
              if (((bc) this).b((byte) 127)) {
                param0 = param0.toLowerCase();
                var4 = (CharSequence) (Object) param0;
                var3_int = ((bc) this).field_f.field_b.a(24396, pc.a(false, var4));
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
          throw r.a((Throwable) (Object) stackIn_11_0, stackIn_11_2 + 44 + param1 + 41);
        }
        return stackIn_7_0;
    }

    final int a(byte param0) {
        L0: {
          if (param0 <= -72) {
            break L0;
          } else {
            ((bc) this).field_m[4] = ((bc) this).field_m[0];
            break L0;
          }
        }
        if (!((bc) this).b((byte) -16)) {
          return -1;
        } else {
          return ((bc) this).field_f.field_m.length;
        }
    }

    final synchronized int c(byte param0, int param1) {
        if (!this.b((byte) -63, param1)) {
          return 0;
        } else {
          if (((bc) this).field_m[param1] != null) {
            return 100;
          } else {
            L0: {
              if (param0 == 36) {
                break L0;
              } else {
                ((bc) this).field_m = (Object[]) ((bc) this).field_m[11];
                break L0;
              }
            }
            return ((bc) this).field_e.a(param1, (byte) 77);
          }
        }
    }

    final synchronized boolean a(int param0) {
        int var2 = 0;
        int var3 = 0;
        int var4 = 0;
        int var5 = 0;
        Object var6 = null;
        int stackIn_9_0 = 0;
        int stackIn_10_0 = 0;
        int stackOut_8_0 = 0;
        L0: {
          var5 = ShatteredPlansClient.field_F ? 1 : 0;
          if (param0 == -1) {
            break L0;
          } else {
            var6 = null;
            int discarded$2 = ((bc) this).a((String) null, (byte) -122);
            break L0;
          }
        }
        if (!((bc) this).b((byte) -43)) {
          return false;
        } else {
          var2 = 1;
          var3 = 0;
          L1: while (true) {
            if (var3 < ((bc) this).field_f.field_q.length) {
              stackOut_8_0 = ((bc) this).field_f.field_q[var3];
              stackIn_10_0 = stackOut_8_0;
              stackIn_9_0 = stackOut_8_0;
              if (var5 == 0) {
                var4 = stackIn_10_0;
                if (null == ((bc) this).field_m[var4]) {
                  L2: {
                    this.a((byte) -113, var4);
                    if (null != ((bc) this).field_m[var4]) {
                      break L2;
                    } else {
                      var2 = 0;
                      break L2;
                    }
                  }
                  var3++;
                  continue L1;
                } else {
                  var3++;
                  continue L1;
                }
              } else {
                return stackIn_9_0 != 0;
              }
            } else {
              return var2 != 0;
            }
          }
        }
    }

    final int a(int param0, String param1) {
        int var3_int = 0;
        RuntimeException var3 = null;
        CharSequence var4 = null;
        int stackIn_2_0 = 0;
        int stackIn_7_0 = 0;
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
        int stackOut_6_0 = 0;
        int stackOut_1_0 = 0;
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
            if (((bc) this).b((byte) -43)) {
              L1: {
                param1 = param1.toLowerCase();
                var4 = (CharSequence) (Object) param1;
                var3_int = ((bc) this).field_f.field_b.a(24396, pc.a(false, var4));
                if (param0 > 121) {
                  break L1;
                } else {
                  field_h = null;
                  break L1;
                }
              }
              if (this.b((byte) -63, var3_int)) {
                stackOut_8_0 = var3_int;
                stackIn_9_0 = stackOut_8_0;
                break L0;
              } else {
                stackOut_6_0 = -1;
                stackIn_7_0 = stackOut_6_0;
                return stackIn_7_0;
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
            stackOut_10_0 = (RuntimeException) var3;
            stackOut_10_1 = new StringBuilder().append("bc.D(").append(param0).append(44);
            stackIn_12_0 = stackOut_10_0;
            stackIn_12_1 = stackOut_10_1;
            stackIn_11_0 = stackOut_10_0;
            stackIn_11_1 = stackOut_10_1;
            if (param1 == null) {
              stackOut_12_0 = (RuntimeException) (Object) stackIn_12_0;
              stackOut_12_1 = (StringBuilder) (Object) stackIn_12_1;
              stackOut_12_2 = "null";
              stackIn_13_0 = stackOut_12_0;
              stackIn_13_1 = stackOut_12_1;
              stackIn_13_2 = stackOut_12_2;
              break L2;
            } else {
              stackOut_11_0 = (RuntimeException) (Object) stackIn_11_0;
              stackOut_11_1 = (StringBuilder) (Object) stackIn_11_1;
              stackOut_11_2 = "{...}";
              stackIn_13_0 = stackOut_11_0;
              stackIn_13_1 = stackOut_11_1;
              stackIn_13_2 = stackOut_11_2;
              break L2;
            }
          }
          throw r.a((Throwable) (Object) stackIn_13_0, stackIn_13_2 + 41);
        }
        return stackIn_9_0;
    }

    final boolean a(String param0, byte param1, String param2) {
        int var4_int = 0;
        RuntimeException var4 = null;
        int var5 = 0;
        CharSequence var6 = null;
        CharSequence var7 = null;
        int stackIn_3_0 = 0;
        boolean stackIn_6_0 = false;
        int stackIn_9_0 = 0;
        boolean stackIn_11_0 = false;
        RuntimeException stackIn_13_0 = null;
        StringBuilder stackIn_13_1 = null;
        RuntimeException stackIn_14_0 = null;
        StringBuilder stackIn_14_1 = null;
        RuntimeException stackIn_15_0 = null;
        StringBuilder stackIn_15_1 = null;
        String stackIn_15_2 = null;
        RuntimeException stackIn_16_0 = null;
        StringBuilder stackIn_16_1 = null;
        RuntimeException stackIn_17_0 = null;
        StringBuilder stackIn_17_1 = null;
        RuntimeException stackIn_18_0 = null;
        StringBuilder stackIn_18_1 = null;
        String stackIn_18_2 = null;
        RuntimeException decompiledCaughtException = null;
        int stackOut_2_0 = 0;
        boolean stackOut_10_0 = false;
        int stackOut_8_0 = 0;
        boolean stackOut_5_0 = false;
        RuntimeException stackOut_12_0 = null;
        StringBuilder stackOut_12_1 = null;
        RuntimeException stackOut_14_0 = null;
        StringBuilder stackOut_14_1 = null;
        String stackOut_14_2 = null;
        RuntimeException stackOut_13_0 = null;
        StringBuilder stackOut_13_1 = null;
        String stackOut_13_2 = null;
        RuntimeException stackOut_15_0 = null;
        StringBuilder stackOut_15_1 = null;
        RuntimeException stackOut_17_0 = null;
        StringBuilder stackOut_17_1 = null;
        String stackOut_17_2 = null;
        RuntimeException stackOut_16_0 = null;
        StringBuilder stackOut_16_1 = null;
        String stackOut_16_2 = null;
        try {
          L0: {
            if (!((bc) this).b((byte) -80)) {
              stackOut_2_0 = 0;
              stackIn_3_0 = stackOut_2_0;
              return stackIn_3_0 != 0;
            } else {
              param0 = param0.toLowerCase();
              if (param1 == 5) {
                param2 = param2.toLowerCase();
                var6 = (CharSequence) (Object) param0;
                var4_int = ((bc) this).field_f.field_b.a(param1 + 24391, pc.a(false, var6));
                if (this.b((byte) -63, var4_int)) {
                  var7 = (CharSequence) (Object) param2;
                  var5 = ((bc) this).field_f.field_i[var4_int].a(param1 ^ 24393, pc.a(false, var7));
                  stackOut_10_0 = ((bc) this).a((byte) 125, var5, var4_int);
                  stackIn_11_0 = stackOut_10_0;
                  break L0;
                } else {
                  stackOut_8_0 = 0;
                  stackIn_9_0 = stackOut_8_0;
                  return stackIn_9_0 != 0;
                }
              } else {
                stackOut_5_0 = ((boolean[]) ((bc) this).field_m[20])[23];
                stackIn_6_0 = stackOut_5_0;
                return stackIn_6_0;
              }
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L1: {
            var4 = decompiledCaughtException;
            stackOut_12_0 = (RuntimeException) var4;
            stackOut_12_1 = new StringBuilder().append("bc.P(");
            stackIn_14_0 = stackOut_12_0;
            stackIn_14_1 = stackOut_12_1;
            stackIn_13_0 = stackOut_12_0;
            stackIn_13_1 = stackOut_12_1;
            if (param0 == null) {
              stackOut_14_0 = (RuntimeException) (Object) stackIn_14_0;
              stackOut_14_1 = (StringBuilder) (Object) stackIn_14_1;
              stackOut_14_2 = "null";
              stackIn_15_0 = stackOut_14_0;
              stackIn_15_1 = stackOut_14_1;
              stackIn_15_2 = stackOut_14_2;
              break L1;
            } else {
              stackOut_13_0 = (RuntimeException) (Object) stackIn_13_0;
              stackOut_13_1 = (StringBuilder) (Object) stackIn_13_1;
              stackOut_13_2 = "{...}";
              stackIn_15_0 = stackOut_13_0;
              stackIn_15_1 = stackOut_13_1;
              stackIn_15_2 = stackOut_13_2;
              break L1;
            }
          }
          L2: {
            stackOut_15_0 = (RuntimeException) (Object) stackIn_15_0;
            stackOut_15_1 = ((StringBuilder) (Object) stackIn_15_1).append(stackIn_15_2).append(44).append(param1).append(44);
            stackIn_17_0 = stackOut_15_0;
            stackIn_17_1 = stackOut_15_1;
            stackIn_16_0 = stackOut_15_0;
            stackIn_16_1 = stackOut_15_1;
            if (param2 == null) {
              stackOut_17_0 = (RuntimeException) (Object) stackIn_17_0;
              stackOut_17_1 = (StringBuilder) (Object) stackIn_17_1;
              stackOut_17_2 = "null";
              stackIn_18_0 = stackOut_17_0;
              stackIn_18_1 = stackOut_17_1;
              stackIn_18_2 = stackOut_17_2;
              break L2;
            } else {
              stackOut_16_0 = (RuntimeException) (Object) stackIn_16_0;
              stackOut_16_1 = (StringBuilder) (Object) stackIn_16_1;
              stackOut_16_2 = "{...}";
              stackIn_18_0 = stackOut_16_0;
              stackIn_18_1 = stackOut_16_1;
              stackIn_18_2 = stackOut_16_2;
              break L2;
            }
          }
          throw r.a((Throwable) (Object) stackIn_18_0, stackIn_18_2 + 41);
        }
        return stackIn_11_0;
    }

    private final synchronized boolean b(byte param0, int param1, int param2) {
        if (!((bc) this).b((byte) 125)) {
          return false;
        } else {
          L0: {
            if (param1 < 0) {
              break L0;
            } else {
              if (param2 < 0) {
                break L0;
              } else {
                if (((bc) this).field_f.field_m.length <= param1) {
                  break L0;
                } else {
                  if (((bc) this).field_f.field_m[param1] > param2) {
                    if (param0 <= 40) {
                      field_g = (wh) ((bc) this).field_m[17];
                      return true;
                    } else {
                      return true;
                    }
                  } else {
                    break L0;
                  }
                }
              }
            }
          }
          if (!sd.field_v) {
            return false;
          } else {
            throw new IllegalArgumentException(param1 + " " + param2);
          }
        }
    }

    final boolean a(String param0, int param1) {
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
            if (((bc) this).b((byte) 127)) {
              var4 = 2 % ((param1 - -1) / 49);
              param0 = param0.toLowerCase();
              var5 = (CharSequence) (Object) param0;
              var3_int = ((bc) this).field_f.field_b.a(24396, pc.a(false, var5));
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
            stackIn_7_0 = stackOut_5_0;
            stackIn_7_1 = stackOut_5_1;
            stackIn_6_0 = stackOut_5_0;
            stackIn_6_1 = stackOut_5_1;
            if (param0 == null) {
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
          throw r.a((Throwable) (Object) stackIn_8_0, stackIn_8_2 + 44 + param1 + 41);
        }
        return stackIn_4_0;
    }

    public static void b(int param0) {
        if (param0 != -466) {
          return;
        } else {
          field_g = null;
          field_c = null;
          field_a = null;
          field_h = null;
          field_i = null;
          field_l = null;
          field_d = null;
          return;
        }
    }

    private final synchronized void a(byte param0, int param1) {
        L0: {
          L1: {
            if (((bc) this).field_j) {
              break L1;
            } else {
              ((bc) this).field_m[param1] = wq.a(false, (byte) -126, ((bc) this).field_e.a((byte) -120, param1));
              if (!ShatteredPlansClient.field_F) {
                break L0;
              } else {
                break L1;
              }
            }
          }
          ((bc) this).field_m[param1] = (Object) (Object) ((bc) this).field_e.a((byte) -112, param1);
          break L0;
        }
        L2: {
          if (param0 < -42) {
            break L2;
          } else {
            int discarded$2 = ((bc) this).c((byte) 112, -73);
            break L2;
          }
        }
    }

    final static void a(int param0, byte param1, long param2) {
        sl var4 = null;
        int var5 = 0;
        var4 = js.field_f;
        var4.h(param0, param1 + 253);
        if (param1 != 2) {
          return;
        } else {
          var4.field_j = var4.field_j + 1;
          var5 = var4.field_j;
          var4.c(7, (byte) -82);
          var4.b(-16426, param2);
          var4.b(-var5 + var4.field_j, (byte) 127);
          return;
        }
    }

    private final synchronized byte[] a(int[] param0, int param1, int param2, int param3) {
        Object var5 = null;
        byte[] var7 = null;
        Object stackIn_26_0 = null;
        Object stackIn_28_0 = null;
        StringBuilder stackIn_28_1 = null;
        Object stackIn_29_0 = null;
        StringBuilder stackIn_29_1 = null;
        Object stackIn_30_0 = null;
        StringBuilder stackIn_30_1 = null;
        String stackIn_30_2 = null;
        RuntimeException decompiledCaughtException = null;
        Object stackOut_25_0 = null;
        Object stackOut_27_0 = null;
        StringBuilder stackOut_27_1 = null;
        Object stackOut_29_0 = null;
        StringBuilder stackOut_29_1 = null;
        String stackOut_29_2 = null;
        Object stackOut_28_0 = null;
        StringBuilder stackOut_28_1 = null;
        String stackOut_28_2 = null;
        try {
          L0: {
            if (this.b((byte) 106, param2, param1)) {
              L1: {
                L2: {
                  var5 = null;
                  if (null == ((bc) this).field_n[param2]) {
                    break L2;
                  } else {
                    if (null != ((bc) this).field_n[param2][param1]) {
                      break L1;
                    } else {
                      break L2;
                    }
                  }
                }
                if (this.a(param1, param0, param2, (byte) -113)) {
                  break L1;
                } else {
                  this.a((byte) -127, param2);
                  if (this.a(param1, param0, param2, (byte) -114)) {
                    break L1;
                  } else {
                    return null;
                  }
                }
              }
              if (((bc) this).field_n[param2] != null) {
                L3: {
                  if (((bc) this).field_n[param2][param1] == null) {
                    break L3;
                  } else {
                    var7 = sq.a(-1, ((bc) this).field_n[param2][param1], false);
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
                    L5: {
                      if (((bc) this).field_k == 1) {
                        break L5;
                      } else {
                        if (2 != ((bc) this).field_k) {
                          break L4;
                        } else {
                          ((bc) this).field_n[param2] = null;
                          if (!ShatteredPlansClient.field_F) {
                            break L4;
                          } else {
                            break L5;
                          }
                        }
                      }
                    }
                    ((bc) this).field_n[param2][param1] = null;
                    if (((bc) this).field_f.field_m[param2] == 1) {
                      ((bc) this).field_n[param2] = null;
                      break L4;
                    } else {
                      break L4;
                    }
                  } else {
                    break L4;
                  }
                }
                stackOut_25_0 = var5;
                stackIn_26_0 = stackOut_25_0;
                break L0;
              } else {
                throw new RuntimeException("");
              }
            } else {
              return null;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L6: {
            var5 = (Object) (Object) decompiledCaughtException;
            stackOut_27_0 = var5;
            stackOut_27_1 = new StringBuilder().append("bc.B(");
            stackIn_29_0 = stackOut_27_0;
            stackIn_29_1 = stackOut_27_1;
            stackIn_28_0 = stackOut_27_0;
            stackIn_28_1 = stackOut_27_1;
            if (param0 == null) {
              stackOut_29_0 = stackIn_29_0;
              stackOut_29_1 = (StringBuilder) (Object) stackIn_29_1;
              stackOut_29_2 = "null";
              stackIn_30_0 = stackOut_29_0;
              stackIn_30_1 = stackOut_29_1;
              stackIn_30_2 = stackOut_29_2;
              break L6;
            } else {
              stackOut_28_0 = stackIn_28_0;
              stackOut_28_1 = (StringBuilder) (Object) stackIn_28_1;
              stackOut_28_2 = "{...}";
              stackIn_30_0 = stackOut_28_0;
              stackIn_30_1 = stackOut_28_1;
              stackIn_30_2 = stackOut_28_2;
              break L6;
            }
          }
          throw r.a((Throwable) (Object) stackIn_30_0, stackIn_30_2 + 44 + param1 + 44 + param2 + 44 + 113 + 41);
        }
        return (byte[]) (Object) stackIn_26_0;
    }

    final boolean b(String param0, byte param1) {
        int var3_int = 0;
        RuntimeException var3 = null;
        CharSequence var4 = null;
        int stackIn_2_0 = 0;
        int stackIn_6_0 = 0;
        boolean stackIn_9_0 = false;
        int stackIn_11_0 = 0;
        RuntimeException stackIn_13_0 = null;
        StringBuilder stackIn_13_1 = null;
        RuntimeException stackIn_14_0 = null;
        StringBuilder stackIn_14_1 = null;
        RuntimeException stackIn_15_0 = null;
        StringBuilder stackIn_15_1 = null;
        String stackIn_15_2 = null;
        RuntimeException decompiledCaughtException = null;
        int stackOut_5_0 = 0;
        int stackOut_10_0 = 0;
        boolean stackOut_8_0 = false;
        int stackOut_1_0 = 0;
        RuntimeException stackOut_12_0 = null;
        StringBuilder stackOut_12_1 = null;
        RuntimeException stackOut_14_0 = null;
        StringBuilder stackOut_14_1 = null;
        String stackOut_14_2 = null;
        RuntimeException stackOut_13_0 = null;
        StringBuilder stackOut_13_1 = null;
        String stackOut_13_2 = null;
        try {
          L0: {
            if (((bc) this).b((byte) 2)) {
              param0 = param0.toLowerCase();
              var4 = (CharSequence) (Object) param0;
              var3_int = ((bc) this).field_f.field_b.a(24396, pc.a(false, var4));
              if (0 > var3_int) {
                stackOut_5_0 = 0;
                stackIn_6_0 = stackOut_5_0;
                return stackIn_6_0 != 0;
              } else {
                if (param1 < -110) {
                  stackOut_10_0 = 1;
                  stackIn_11_0 = stackOut_10_0;
                  break L0;
                } else {
                  stackOut_8_0 = ((boolean[]) ((bc) this).field_m[2])[11];
                  stackIn_9_0 = stackOut_8_0;
                  return stackIn_9_0;
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
            stackOut_12_0 = (RuntimeException) var3;
            stackOut_12_1 = new StringBuilder().append("bc.K(");
            stackIn_14_0 = stackOut_12_0;
            stackIn_14_1 = stackOut_12_1;
            stackIn_13_0 = stackOut_12_0;
            stackIn_13_1 = stackOut_12_1;
            if (param0 == null) {
              stackOut_14_0 = (RuntimeException) (Object) stackIn_14_0;
              stackOut_14_1 = (StringBuilder) (Object) stackIn_14_1;
              stackOut_14_2 = "null";
              stackIn_15_0 = stackOut_14_0;
              stackIn_15_1 = stackOut_14_1;
              stackIn_15_2 = stackOut_14_2;
              break L1;
            } else {
              stackOut_13_0 = (RuntimeException) (Object) stackIn_13_0;
              stackOut_13_1 = (StringBuilder) (Object) stackIn_13_1;
              stackOut_13_2 = "{...}";
              stackIn_15_0 = stackOut_13_0;
              stackIn_15_1 = stackOut_13_1;
              stackIn_15_2 = stackOut_13_2;
              break L1;
            }
          }
          throw r.a((Throwable) (Object) stackIn_15_0, stackIn_15_2 + 44 + param1 + 41);
        }
        return stackIn_11_0 != 0;
    }

    private final synchronized boolean b(byte param0, int param1) {
        if (((bc) this).b((byte) 115)) {
          L0: {
            if (param1 < 0) {
              break L0;
            } else {
              if (~((bc) this).field_f.field_m.length >= ~param1) {
                break L0;
              } else {
                if (((bc) this).field_f.field_m[param1] != 0) {
                  if (param0 == -63) {
                    return true;
                  } else {
                    boolean discarded$2 = ((bc) this).a((byte) 34, -45, 63);
                    return true;
                  }
                } else {
                  break L0;
                }
              }
            }
          }
          if (!sd.field_v) {
            return false;
          } else {
            throw new IllegalArgumentException(Integer.toString(param1));
          }
        } else {
          return false;
        }
    }

    final byte[] a(int param0, int param1, int param2) {
        if (param1 != -1) {
            field_i = (String) ((bc) this).field_m[11];
        }
        return this.a((int[]) null, param2, param0, 113);
    }

    final int a(int param0, int param1) {
        if (!this.b((byte) -63, param0)) {
          return 0;
        } else {
          if (param1 != -26268) {
            return ((int[]) ((bc) this).field_m[0])[4];
          } else {
            return ((bc) this).field_f.field_m[param0];
          }
        }
    }

    final synchronized byte[] a(boolean param0, String param1, String param2) {
        int var4_int = 0;
        RuntimeException var4 = null;
        int var5 = 0;
        CharSequence var6 = null;
        CharSequence var7 = null;
        Object stackIn_4_0 = null;
        cm stackIn_6_0 = null;
        int stackIn_6_1 = 0;
        cm stackIn_7_0 = null;
        int stackIn_7_1 = 0;
        cm stackIn_8_0 = null;
        int stackIn_8_1 = 0;
        int stackIn_8_2 = 0;
        cm stackIn_12_0 = null;
        int stackIn_12_1 = 0;
        cm stackIn_13_0 = null;
        int stackIn_13_1 = 0;
        cm stackIn_14_0 = null;
        int stackIn_14_1 = 0;
        int stackIn_14_2 = 0;
        byte[] stackIn_15_0 = null;
        RuntimeException stackIn_17_0 = null;
        StringBuilder stackIn_17_1 = null;
        RuntimeException stackIn_18_0 = null;
        StringBuilder stackIn_18_1 = null;
        RuntimeException stackIn_19_0 = null;
        StringBuilder stackIn_19_1 = null;
        String stackIn_19_2 = null;
        RuntimeException stackIn_20_0 = null;
        StringBuilder stackIn_20_1 = null;
        RuntimeException stackIn_21_0 = null;
        StringBuilder stackIn_21_1 = null;
        RuntimeException stackIn_22_0 = null;
        StringBuilder stackIn_22_1 = null;
        String stackIn_22_2 = null;
        RuntimeException decompiledCaughtException = null;
        cm stackOut_5_0 = null;
        int stackOut_5_1 = 0;
        cm stackOut_7_0 = null;
        int stackOut_7_1 = 0;
        int stackOut_7_2 = 0;
        cm stackOut_6_0 = null;
        int stackOut_6_1 = 0;
        int stackOut_6_2 = 0;
        cm stackOut_11_0 = null;
        int stackOut_11_1 = 0;
        cm stackOut_13_0 = null;
        int stackOut_13_1 = 0;
        int stackOut_13_2 = 0;
        cm stackOut_12_0 = null;
        int stackOut_12_1 = 0;
        int stackOut_12_2 = 0;
        byte[] stackOut_14_0 = null;
        Object stackOut_3_0 = null;
        RuntimeException stackOut_16_0 = null;
        StringBuilder stackOut_16_1 = null;
        RuntimeException stackOut_18_0 = null;
        StringBuilder stackOut_18_1 = null;
        String stackOut_18_2 = null;
        RuntimeException stackOut_17_0 = null;
        StringBuilder stackOut_17_1 = null;
        String stackOut_17_2 = null;
        RuntimeException stackOut_19_0 = null;
        StringBuilder stackOut_19_1 = null;
        RuntimeException stackOut_21_0 = null;
        StringBuilder stackOut_21_1 = null;
        String stackOut_21_2 = null;
        RuntimeException stackOut_20_0 = null;
        StringBuilder stackOut_20_1 = null;
        String stackOut_20_2 = null;
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
                stackOut_5_0 = ((bc) this).field_f.field_b;
                stackOut_5_1 = 24396;
                stackIn_7_0 = stackOut_5_0;
                stackIn_7_1 = stackOut_5_1;
                stackIn_6_0 = stackOut_5_0;
                stackIn_6_1 = stackOut_5_1;
                if (param0) {
                  stackOut_7_0 = (cm) (Object) stackIn_7_0;
                  stackOut_7_1 = stackIn_7_1;
                  stackOut_7_2 = 0;
                  stackIn_8_0 = stackOut_7_0;
                  stackIn_8_1 = stackOut_7_1;
                  stackIn_8_2 = stackOut_7_2;
                  break L2;
                } else {
                  stackOut_6_0 = (cm) (Object) stackIn_6_0;
                  stackOut_6_1 = stackIn_6_1;
                  stackOut_6_2 = 1;
                  stackIn_8_0 = stackOut_6_0;
                  stackIn_8_1 = stackOut_6_1;
                  stackIn_8_2 = stackOut_6_2;
                  break L2;
                }
              }
              var6 = (CharSequence) (Object) param2;
              var4_int = ((cm) (Object) stackIn_8_0).a(stackIn_8_1, pc.a(stackIn_8_2 != 0, var6));
              if (this.b((byte) -63, var4_int)) {
                L3: {
                  stackOut_11_0 = ((bc) this).field_f.field_i[var4_int];
                  stackOut_11_1 = 24396;
                  stackIn_13_0 = stackOut_11_0;
                  stackIn_13_1 = stackOut_11_1;
                  stackIn_12_0 = stackOut_11_0;
                  stackIn_12_1 = stackOut_11_1;
                  if (param0) {
                    stackOut_13_0 = (cm) (Object) stackIn_13_0;
                    stackOut_13_1 = stackIn_13_1;
                    stackOut_13_2 = 0;
                    stackIn_14_0 = stackOut_13_0;
                    stackIn_14_1 = stackOut_13_1;
                    stackIn_14_2 = stackOut_13_2;
                    break L3;
                  } else {
                    stackOut_12_0 = (cm) (Object) stackIn_12_0;
                    stackOut_12_1 = stackIn_12_1;
                    stackOut_12_2 = 1;
                    stackIn_14_0 = stackOut_12_0;
                    stackIn_14_1 = stackOut_12_1;
                    stackIn_14_2 = stackOut_12_2;
                    break L3;
                  }
                }
                var7 = (CharSequence) (Object) param1;
                var5 = ((cm) (Object) stackIn_14_0).a(stackIn_14_1, pc.a(stackIn_14_2 != 0, var7));
                stackOut_14_0 = ((bc) this).a(var4_int, -1, var5);
                stackIn_15_0 = stackOut_14_0;
                break L0;
              } else {
                return null;
              }
            } else {
              stackOut_3_0 = null;
              stackIn_4_0 = stackOut_3_0;
              return (byte[]) (Object) stackIn_4_0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L4: {
            var4 = decompiledCaughtException;
            stackOut_16_0 = (RuntimeException) var4;
            stackOut_16_1 = new StringBuilder().append("bc.E(").append(param0).append(44);
            stackIn_18_0 = stackOut_16_0;
            stackIn_18_1 = stackOut_16_1;
            stackIn_17_0 = stackOut_16_0;
            stackIn_17_1 = stackOut_16_1;
            if (param1 == null) {
              stackOut_18_0 = (RuntimeException) (Object) stackIn_18_0;
              stackOut_18_1 = (StringBuilder) (Object) stackIn_18_1;
              stackOut_18_2 = "null";
              stackIn_19_0 = stackOut_18_0;
              stackIn_19_1 = stackOut_18_1;
              stackIn_19_2 = stackOut_18_2;
              break L4;
            } else {
              stackOut_17_0 = (RuntimeException) (Object) stackIn_17_0;
              stackOut_17_1 = (StringBuilder) (Object) stackIn_17_1;
              stackOut_17_2 = "{...}";
              stackIn_19_0 = stackOut_17_0;
              stackIn_19_1 = stackOut_17_1;
              stackIn_19_2 = stackOut_17_2;
              break L4;
            }
          }
          L5: {
            stackOut_19_0 = (RuntimeException) (Object) stackIn_19_0;
            stackOut_19_1 = ((StringBuilder) (Object) stackIn_19_1).append(stackIn_19_2).append(44);
            stackIn_21_0 = stackOut_19_0;
            stackIn_21_1 = stackOut_19_1;
            stackIn_20_0 = stackOut_19_0;
            stackIn_20_1 = stackOut_19_1;
            if (param2 == null) {
              stackOut_21_0 = (RuntimeException) (Object) stackIn_21_0;
              stackOut_21_1 = (StringBuilder) (Object) stackIn_21_1;
              stackOut_21_2 = "null";
              stackIn_22_0 = stackOut_21_0;
              stackIn_22_1 = stackOut_21_1;
              stackIn_22_2 = stackOut_21_2;
              break L5;
            } else {
              stackOut_20_0 = (RuntimeException) (Object) stackIn_20_0;
              stackOut_20_1 = (StringBuilder) (Object) stackIn_20_1;
              stackOut_20_2 = "{...}";
              stackIn_22_0 = stackOut_20_0;
              stackIn_22_1 = stackOut_20_1;
              stackIn_22_2 = stackOut_20_2;
              break L5;
            }
          }
          throw r.a((Throwable) (Object) stackIn_22_0, stackIn_22_2 + 41);
        }
        return stackIn_15_0;
    }

    final synchronized boolean a(byte param0, int param1, int param2) {
        L0: {
          if (param0 == 125) {
            break L0;
          } else {
            field_c = null;
            break L0;
          }
        }
        if (this.b((byte) 104, param2, param1)) {
          L1: {
            if (((bc) this).field_n[param2] == null) {
              break L1;
            } else {
              if (null == ((bc) this).field_n[param2][param1]) {
                break L1;
              } else {
                return true;
              }
            }
          }
          if (((bc) this).field_m[param2] != null) {
            return true;
          } else {
            this.a((byte) -66, param2);
            if (((bc) this).field_m[param2] == null) {
              return false;
            } else {
              return true;
            }
          }
        } else {
          return false;
        }
    }

    final synchronized int d(int param0) {
        int var2 = 0;
        int var3 = 0;
        int var4 = 0;
        int var5 = 0;
        int stackIn_5_0 = 0;
        int stackIn_5_1 = 0;
        int stackIn_6_0 = 0;
        int stackIn_6_1 = 0;
        int stackOut_4_0 = 0;
        int stackOut_4_1 = 0;
        var5 = ShatteredPlansClient.field_F ? 1 : 0;
        if (((bc) this).b((byte) 111)) {
          var2 = 0;
          var3 = 0;
          var4 = 0;
          L0: while (true) {
            if (var4 >= ((bc) this).field_m.length) {
              if (var2 == 0) {
                return 100;
              } else {
                var4 = var3 * param0 / var2;
                return var4;
              }
            } else {
              stackOut_4_0 = 0;
              stackOut_4_1 = ((bc) this).field_f.field_n[var4];
              stackIn_6_0 = stackOut_4_0;
              stackIn_6_1 = stackOut_4_1;
              stackIn_5_0 = stackOut_4_0;
              stackIn_5_1 = stackOut_4_1;
              if (var5 == 0) {
                L1: {
                  if (stackIn_6_0 >= stackIn_6_1) {
                    break L1;
                  } else {
                    var3 = var3 + ((bc) this).c((byte) 36, var4);
                    var2 += 100;
                    break L1;
                  }
                }
                var4++;
                continue L0;
              } else {
                var4 = stackIn_5_0 / stackIn_5_1;
                return var4;
              }
            }
          }
        } else {
          return 0;
        }
    }

    final synchronized byte[] a(boolean param0, int param1) {
        Object var4 = null;
        if (((bc) this).b((byte) -106)) {
          if (1 == ((bc) this).field_f.field_m.length) {
            return ((bc) this).a(0, -1, param1);
          } else {
            if (this.b((byte) -63, param1)) {
              L0: {
                if (!param0) {
                  break L0;
                } else {
                  var4 = null;
                  int discarded$2 = ((bc) this).a((String) null, (byte) -7);
                  break L0;
                }
              }
              if (((bc) this).field_f.field_m[param1] == 1) {
                return ((bc) this).a(param1, -1, 0);
              } else {
                throw new RuntimeException();
              }
            } else {
              return null;
            }
          }
        } else {
          return null;
        }
    }

    private final synchronized boolean a(int param0, int[] param1, int param2, byte param3) {
        RuntimeException var5 = null;
        int var5_int = 0;
        int[] var6 = null;
        Object[] var7 = null;
        int var8 = 0;
        Object var9 = null;
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
        byte[] var23 = null;
        int stackIn_3_0 = 0;
        int stackIn_6_0 = 0;
        int stackIn_12_0 = 0;
        Object stackIn_15_0 = null;
        int[] stackIn_15_1 = null;
        int stackIn_25_0 = 0;
        Object stackIn_27_0 = null;
        int[] stackIn_27_1 = null;
        RuntimeException stackIn_38_0 = null;
        StringBuilder stackIn_38_1 = null;
        RuntimeException stackIn_39_0 = null;
        StringBuilder stackIn_39_1 = null;
        RuntimeException stackIn_40_0 = null;
        StringBuilder stackIn_40_1 = null;
        int stackIn_40_2 = 0;
        int stackIn_49_0 = 0;
        int stackIn_61_0 = 0;
        int stackIn_64_0 = 0;
        int stackIn_68_0 = 0;
        int stackIn_83_0 = 0;
        int stackIn_91_0 = 0;
        int stackIn_100_0 = 0;
        int stackIn_108_0 = 0;
        int stackIn_128_0 = 0;
        RuntimeException stackIn_130_0 = null;
        StringBuilder stackIn_130_1 = null;
        RuntimeException stackIn_131_0 = null;
        StringBuilder stackIn_131_1 = null;
        RuntimeException stackIn_132_0 = null;
        StringBuilder stackIn_132_1 = null;
        String stackIn_132_2 = null;
        RuntimeException decompiledCaughtException = null;
        Object stackOut_14_0 = null;
        int[] stackOut_14_1 = null;
        int stackOut_24_0 = 0;
        Object stackOut_26_0 = null;
        int[] stackOut_26_1 = null;
        RuntimeException stackOut_37_0 = null;
        StringBuilder stackOut_37_1 = null;
        RuntimeException stackOut_39_0 = null;
        StringBuilder stackOut_39_1 = null;
        int stackOut_39_2 = 0;
        RuntimeException stackOut_38_0 = null;
        StringBuilder stackOut_38_1 = null;
        int stackOut_38_2 = 0;
        int stackOut_60_0 = 0;
        int stackOut_48_0 = 0;
        int stackOut_63_0 = 0;
        int stackOut_67_0 = 0;
        int stackOut_90_0 = 0;
        int stackOut_82_0 = 0;
        int stackOut_107_0 = 0;
        int stackOut_99_0 = 0;
        int stackOut_127_0 = 0;
        int stackOut_11_0 = 0;
        int stackOut_5_0 = 0;
        int stackOut_2_0 = 0;
        RuntimeException stackOut_129_0 = null;
        StringBuilder stackOut_129_1 = null;
        RuntimeException stackOut_131_0 = null;
        StringBuilder stackOut_131_1 = null;
        String stackOut_131_2 = null;
        RuntimeException stackOut_130_0 = null;
        StringBuilder stackOut_130_1 = null;
        String stackOut_130_2 = null;
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
                        if (var9_int >= var5_int) {
                          break L4;
                        } else {
                          stackOut_14_0 = null;
                          stackOut_14_1 = (int[]) var6;
                          stackIn_27_0 = stackOut_14_0;
                          stackIn_27_1 = stackOut_14_1;
                          stackIn_15_0 = stackOut_14_0;
                          stackIn_15_1 = stackOut_14_1;
                          if (var22 != 0) {
                            break L3;
                          } else {
                            L5: {
                              L6: {
                                if (stackIn_15_0 != (Object) (Object) stackIn_15_1) {
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
                            continue L2;
                          }
                        }
                      }
                      if (var8 != 0) {
                        stackOut_24_0 = 1;
                        stackIn_25_0 = stackOut_24_0;
                        return stackIn_25_0 != 0;
                      } else {
                        stackOut_26_0 = null;
                        stackOut_26_1 = (int[]) param1;
                        stackIn_27_0 = stackOut_26_0;
                        stackIn_27_1 = stackOut_26_1;
                        break L3;
                      }
                    }
                    L8: {
                      L9: {
                        if (stackIn_27_0 == (Object) (Object) stackIn_27_1) {
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
                        var23 = pa.a(var9_array, 200);
                        var10 = var23;
                        break L11;
                      }
                    } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
                      decompiledCaughtException = decompiledCaughtParameter0;
                      L12: {
                        var11_ref_RuntimeException = decompiledCaughtException;
                        stackOut_37_0 = (RuntimeException) var11_ref_RuntimeException;
                        stackOut_37_1 = new StringBuilder();
                        stackIn_39_0 = stackOut_37_0;
                        stackIn_39_1 = stackOut_37_1;
                        stackIn_38_0 = stackOut_37_0;
                        stackIn_38_1 = stackOut_37_1;
                        if (param1 == null) {
                          stackOut_39_0 = (RuntimeException) (Object) stackIn_39_0;
                          stackOut_39_1 = (StringBuilder) (Object) stackIn_39_1;
                          stackOut_39_2 = 0;
                          stackIn_40_0 = stackOut_39_0;
                          stackIn_40_1 = stackOut_39_1;
                          stackIn_40_2 = stackOut_39_2;
                          break L12;
                        } else {
                          stackOut_38_0 = (RuntimeException) (Object) stackIn_38_0;
                          stackOut_38_1 = (StringBuilder) (Object) stackIn_38_1;
                          stackOut_38_2 = 1;
                          stackIn_40_0 = stackOut_38_0;
                          stackIn_40_1 = stackOut_38_1;
                          stackIn_40_2 = stackOut_38_2;
                          break L12;
                        }
                      }
                      throw r.a((Throwable) (Object) stackIn_40_0, stackIn_40_2 + " " + param2 + " " + param1.length + " " + me.a(63, var9_array, param1.length) + " " + me.a(59, var9_array, param1.length - 2) + " " + ((bc) this).field_f.field_f[param2] + " " + ((bc) this).field_f.field_c);
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
                                var11 = var23.length;
                                var11--;
                                var12 = 255 & var23[var11];
                                var11 = var11 - 4 * (var5_int * var12);
                                var13 = new ob(var10);
                                var14_int = 0;
                                var13.field_j = var11;
                                var15_int = 0;
                                var16 = 0;
                                L18: while (true) {
                                  L19: {
                                    if (var16 >= var12) {
                                      stackOut_60_0 = var14_int;
                                      stackIn_61_0 = stackOut_60_0;
                                      break L19;
                                    } else {
                                      var17 = 0;
                                      stackOut_48_0 = 0;
                                      stackIn_61_0 = stackOut_48_0;
                                      stackIn_49_0 = stackOut_48_0;
                                      if (var22 != 0) {
                                        break L19;
                                      } else {
                                        var18 = stackIn_49_0;
                                        L20: while (true) {
                                          L21: {
                                            if (var18 >= var5_int) {
                                              var16++;
                                              break L21;
                                            } else {
                                              var17 = var17 + var13.a(16711680);
                                              if (var22 != 0) {
                                                break L21;
                                              } else {
                                                L22: {
                                                  L23: {
                                                    if (var6 != null) {
                                                      break L23;
                                                    } else {
                                                      var19 = var18;
                                                      if (var22 == 0) {
                                                        break L22;
                                                      } else {
                                                        break L23;
                                                      }
                                                    }
                                                  }
                                                  var19 = var6[var18];
                                                  break L22;
                                                }
                                                L24: {
                                                  if (var19 != param0) {
                                                    break L24;
                                                  } else {
                                                    var14_int = var14_int + var17;
                                                    var15_int = var19;
                                                    break L24;
                                                  }
                                                }
                                                var18++;
                                                continue L20;
                                              }
                                            }
                                          }
                                          continue L18;
                                        }
                                      }
                                    }
                                  }
                                  if (stackIn_61_0 == 0) {
                                    stackOut_63_0 = 1;
                                    stackIn_64_0 = stackOut_63_0;
                                    return stackIn_64_0 != 0;
                                  } else {
                                    var16_ref_byte__ = new byte[var14_int];
                                    var14_int = 0;
                                    var13.field_j = var11;
                                    var17 = 0;
                                    var18 = 0;
                                    L25: while (true) {
                                      if (var12 <= var18) {
                                        var7[var15_int] = (Object) (Object) var16_ref_byte__;
                                        if (var22 == 0) {
                                          break L15;
                                        } else {
                                          break L17;
                                        }
                                      } else {
                                        var19 = 0;
                                        stackOut_67_0 = 0;
                                        stackIn_128_0 = stackOut_67_0;
                                        stackIn_68_0 = stackOut_67_0;
                                        if (var22 != 0) {
                                          break L14;
                                        } else {
                                          var20 = stackIn_68_0;
                                          L26: while (true) {
                                            L27: {
                                              if (var5_int <= var20) {
                                                var18++;
                                                break L27;
                                              } else {
                                                var19 = var19 + var13.a(16711680);
                                                if (var22 != 0) {
                                                  break L27;
                                                } else {
                                                  L28: {
                                                    L29: {
                                                      if (var6 == null) {
                                                        break L29;
                                                      } else {
                                                        var21 = var6[var20];
                                                        if (var22 == 0) {
                                                          break L28;
                                                        } else {
                                                          break L29;
                                                        }
                                                      }
                                                    }
                                                    var21 = var20;
                                                    break L28;
                                                  }
                                                  L30: {
                                                    if (param0 != var21) {
                                                      break L30;
                                                    } else {
                                                      ps.a(var10, var17, var16_ref_byte__, var14_int, var19);
                                                      var14_int = var14_int + var19;
                                                      break L30;
                                                    }
                                                  }
                                                  var17 = var17 + var19;
                                                  var20++;
                                                  continue L26;
                                                }
                                              }
                                            }
                                            continue L25;
                                          }
                                        }
                                      }
                                    }
                                  }
                                }
                              }
                            }
                            var11 = var23.length;
                            var11--;
                            var12 = 255 & var23[var11];
                            var11 = var11 - 4 * (var12 * var5_int);
                            var13 = new ob(var10);
                            var13.field_j = var11;
                            var14 = new int[var5_int];
                            var15_int = 0;
                            L31: while (true) {
                              L32: {
                                if (var12 <= var15_int) {
                                  stackOut_90_0 = var5_int;
                                  stackIn_91_0 = stackOut_90_0;
                                  break L32;
                                } else {
                                  var16 = 0;
                                  stackOut_82_0 = 0;
                                  stackIn_91_0 = stackOut_82_0;
                                  stackIn_83_0 = stackOut_82_0;
                                  if (var22 != 0) {
                                    break L32;
                                  } else {
                                    var17 = stackIn_83_0;
                                    L33: while (true) {
                                      L34: {
                                        if (var17 >= var5_int) {
                                          var15_int++;
                                          break L34;
                                        } else {
                                          var16 = var16 + var13.a(16711680);
                                          var14[var17] = var14[var17] + var16;
                                          var17++;
                                          if (var22 != 0) {
                                            break L34;
                                          } else {
                                            continue L33;
                                          }
                                        }
                                      }
                                      continue L31;
                                    }
                                  }
                                }
                              }
                              var15 = new byte[stackIn_91_0][];
                              var16 = 0;
                              L35: while (true) {
                                L36: {
                                  if (var16 >= var5_int) {
                                    var13.field_j = var11;
                                    var16 = 0;
                                    break L36;
                                  } else {
                                    var15[var16] = new byte[var14[var16]];
                                    var14[var16] = 0;
                                    var16++;
                                    if (var22 != 0) {
                                      break L36;
                                    } else {
                                      continue L35;
                                    }
                                  }
                                }
                                var17 = 0;
                                L37: while (true) {
                                  L38: {
                                    if (var12 <= var17) {
                                      stackOut_107_0 = 0;
                                      stackIn_108_0 = stackOut_107_0;
                                      break L38;
                                    } else {
                                      var18 = 0;
                                      stackOut_99_0 = 0;
                                      stackIn_108_0 = stackOut_99_0;
                                      stackIn_100_0 = stackOut_99_0;
                                      if (var22 != 0) {
                                        break L38;
                                      } else {
                                        var19 = stackIn_100_0;
                                        L39: while (true) {
                                          L40: {
                                            if (var5_int <= var19) {
                                              var17++;
                                              break L40;
                                            } else {
                                              var18 = var18 + var13.a(16711680);
                                              ps.a(var23, var16, var15[var19], var14[var19], var18);
                                              var14[var19] = var14[var19] + var18;
                                              var16 = var16 + var18;
                                              var19++;
                                              if (var22 != 0) {
                                                break L40;
                                              } else {
                                                continue L39;
                                              }
                                            }
                                          }
                                          continue L37;
                                        }
                                      }
                                    }
                                  }
                                  var17 = stackIn_108_0;
                                  L41: while (true) {
                                    if (var5_int <= var17) {
                                      if (var22 == 0) {
                                        break L15;
                                      } else {
                                        break L16;
                                      }
                                    } else {
                                      if (var22 != 0) {
                                        break L15;
                                      } else {
                                        L42: {
                                          L43: {
                                            if (var6 == null) {
                                              break L43;
                                            } else {
                                              var18 = var6[var17];
                                              if (var22 == 0) {
                                                break L42;
                                              } else {
                                                break L43;
                                              }
                                            }
                                          }
                                          var18 = var17;
                                          break L42;
                                        }
                                        L44: {
                                          L45: {
                                            if (((bc) this).field_k != 0) {
                                              break L45;
                                            } else {
                                              var7[var18] = wq.a(false, (byte) -127, var15[var17]);
                                              if (var22 == 0) {
                                                break L44;
                                              } else {
                                                break L45;
                                              }
                                            }
                                          }
                                          var7[var18] = (Object) (Object) var15[var17];
                                          break L44;
                                        }
                                        var17++;
                                        continue L41;
                                      }
                                    }
                                  }
                                }
                              }
                            }
                          }
                        }
                        L46: {
                          L47: {
                            if (var6 == null) {
                              break L47;
                            } else {
                              var11 = var6[0];
                              if (var22 == 0) {
                                break L46;
                              } else {
                                break L47;
                              }
                            }
                          }
                          var11 = 0;
                          break L46;
                        }
                        L48: {
                          if (0 != ((bc) this).field_k) {
                            break L48;
                          } else {
                            var7[var11] = wq.a(false, (byte) -126, var23);
                            if (var22 == 0) {
                              break L15;
                            } else {
                              break L48;
                            }
                          }
                        }
                        var7[var11] = (Object) (Object) var23;
                        return true;
                      }
                      stackOut_127_0 = 1;
                      stackIn_128_0 = stackOut_127_0;
                      break L14;
                    }
                    break L0;
                  }
                } else {
                  stackOut_11_0 = 0;
                  stackIn_12_0 = stackOut_11_0;
                  return stackIn_12_0 != 0;
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
          L49: {
            var5 = decompiledCaughtException;
            stackOut_129_0 = (RuntimeException) var5;
            stackOut_129_1 = new StringBuilder().append("bc.J(").append(param0).append(44);
            stackIn_131_0 = stackOut_129_0;
            stackIn_131_1 = stackOut_129_1;
            stackIn_130_0 = stackOut_129_0;
            stackIn_130_1 = stackOut_129_1;
            if (param1 == null) {
              stackOut_131_0 = (RuntimeException) (Object) stackIn_131_0;
              stackOut_131_1 = (StringBuilder) (Object) stackIn_131_1;
              stackOut_131_2 = "null";
              stackIn_132_0 = stackOut_131_0;
              stackIn_132_1 = stackOut_131_1;
              stackIn_132_2 = stackOut_131_2;
              break L49;
            } else {
              stackOut_130_0 = (RuntimeException) (Object) stackIn_130_0;
              stackOut_130_1 = (StringBuilder) (Object) stackIn_130_1;
              stackOut_130_2 = "{...}";
              stackIn_132_0 = stackOut_130_0;
              stackIn_132_1 = stackOut_130_1;
              stackIn_132_2 = stackOut_130_2;
              break L49;
            }
          }
          throw r.a((Throwable) (Object) stackIn_132_0, stackIn_132_2 + 44 + param2 + 44 + param3 + 41);
        }
        return stackIn_128_0 != 0;
    }

    final static void c(int param0) {
        RuntimeException var1 = null;
        int var2 = 0;
        int decompiledRegionSelector0 = 0;
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
                  if (!cc.e((byte) 55)) {
                    break L4;
                  } else {
                    boolean discarded$13 = rp.field_I.a(oq.field_j, ho.field_h, true);
                    if (var2 != 0) {
                      decompiledRegionSelector0 = 1;
                      break L0;
                    } else {
                      if (var2 == 0) {
                        continue L3;
                      } else {
                        break L4;
                      }
                    }
                  }
                }
                decompiledRegionSelector0 = 0;
                break L0;
              }
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var1 = decompiledCaughtException;
          throw r.a((Throwable) (Object) var1, "bc.V(" + param0 + 41);
        }
        if (decompiledRegionSelector0 == 0) {
          return;
        } else {
          return;
        }
    }

    final synchronized boolean b(int param0, int param1) {
        if (this.b((byte) -63, param1)) {
          if (null == ((bc) this).field_m[param1]) {
            this.a((byte) -73, param1);
            if (((bc) this).field_m[param1] != null) {
              return true;
            } else {
              if (param0 < 83) {
                int discarded$2 = ((bc) this).d(-19);
                return false;
              } else {
                return false;
              }
            }
          } else {
            return true;
          }
        } else {
          return false;
        }
    }

    bc(lc param0, boolean param1, int param2) {
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
        ((bc) this).field_f = null;
        try {
          L0: {
            L1: {
              if (param2 < 0) {
                break L1;
              } else {
                if (param2 <= 2) {
                  L2: {
                    ((bc) this).field_k = param2;
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
                  ((bc) this).field_j = stackIn_7_1 != 0;
                  ((bc) this).field_e = param0;
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
            stackOut_9_1 = new StringBuilder().append("bc.<init>(");
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
          throw r.a((Throwable) (Object) stackIn_12_0, stackIn_12_2 + 44 + param1 + 44 + param2 + 41);
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
