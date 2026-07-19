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
        int decompiledRegionSelector0 = 0;
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
            if (this.b((byte) 124)) {
              param2 = param2.toLowerCase();
              param1 = param1.toLowerCase();
              var7 = (CharSequence) ((Object) param2);
              var4_int = this.field_f.field_b.a(24396, pc.a(false, var7));
              var5 = -116 / ((58 - param0) / 34);
              if (var4_int >= 0) {
                var8 = (CharSequence) ((Object) param1);
                var6 = this.field_f.field_i[var4_int].a(24396, pc.a(false, var8));
                if (-1 >= (var6 ^ -1)) {
                  stackOut_9_0 = 1;
                  stackIn_10_0 = stackOut_9_0;
                  decompiledRegionSelector0 = 3;
                  break L0;
                } else {
                  stackOut_7_0 = 0;
                  stackIn_8_0 = stackOut_7_0;
                  decompiledRegionSelector0 = 2;
                  break L0;
                }
              } else {
                stackOut_4_0 = 0;
                stackIn_5_0 = stackOut_4_0;
                decompiledRegionSelector0 = 1;
                break L0;
              }
            } else {
              stackOut_1_0 = 0;
              stackIn_2_0 = stackOut_1_0;
              decompiledRegionSelector0 = 0;
              break L0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L1: {
            var4 = decompiledCaughtException;
            stackOut_11_0 = (RuntimeException) (var4);
            stackOut_11_1 = new StringBuilder().append("bc.CA(").append(param0).append(',');
            stackIn_13_0 = stackOut_11_0;
            stackIn_13_1 = stackOut_11_1;
            stackIn_12_0 = stackOut_11_0;
            stackIn_12_1 = stackOut_11_1;
            if (param1 == null) {
              stackOut_13_0 = (RuntimeException) ((Object) stackIn_13_0);
              stackOut_13_1 = (StringBuilder) ((Object) stackIn_13_1);
              stackOut_13_2 = "null";
              stackIn_14_0 = stackOut_13_0;
              stackIn_14_1 = stackOut_13_1;
              stackIn_14_2 = stackOut_13_2;
              break L1;
            } else {
              stackOut_12_0 = (RuntimeException) ((Object) stackIn_12_0);
              stackOut_12_1 = (StringBuilder) ((Object) stackIn_12_1);
              stackOut_12_2 = "{...}";
              stackIn_14_0 = stackOut_12_0;
              stackIn_14_1 = stackOut_12_1;
              stackIn_14_2 = stackOut_12_2;
              break L1;
            }
          }
          L2: {
            stackOut_14_0 = (RuntimeException) ((Object) stackIn_14_0);
            stackOut_14_1 = ((StringBuilder) (Object) stackIn_14_1).append(stackIn_14_2).append(',');
            stackIn_16_0 = stackOut_14_0;
            stackIn_16_1 = stackOut_14_1;
            stackIn_15_0 = stackOut_14_0;
            stackIn_15_1 = stackOut_14_1;
            if (param2 == null) {
              stackOut_16_0 = (RuntimeException) ((Object) stackIn_16_0);
              stackOut_16_1 = (StringBuilder) ((Object) stackIn_16_1);
              stackOut_16_2 = "null";
              stackIn_17_0 = stackOut_16_0;
              stackIn_17_1 = stackOut_16_1;
              stackIn_17_2 = stackOut_16_2;
              break L2;
            } else {
              stackOut_15_0 = (RuntimeException) ((Object) stackIn_15_0);
              stackOut_15_1 = (StringBuilder) ((Object) stackIn_15_1);
              stackOut_15_2 = "{...}";
              stackIn_17_0 = stackOut_15_0;
              stackIn_17_1 = stackOut_15_1;
              stackIn_17_2 = stackOut_15_2;
              break L2;
            }
          }
          throw r.a((Throwable) ((Object) stackIn_17_0), stackIn_17_2 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return stackIn_2_0 != 0;
        } else {
          if (decompiledRegionSelector0 == 1) {
            return stackIn_5_0 != 0;
          } else {
            if (decompiledRegionSelector0 == 2) {
              return stackIn_8_0 != 0;
            } else {
              return stackIn_10_0 != 0;
            }
          }
        }
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
        int decompiledRegionSelector0 = 0;
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
              decompiledRegionSelector0 = 0;
              break L0;
            } else {
              L1: {
                param2 = param2.toLowerCase();
                var5 = (CharSequence) ((Object) param2);
                var4_int = this.field_f.field_i[param0].a(24396, pc.a(false, var5));
                if (param1 == 106) {
                  break L1;
                } else {
                  ((boolean[]) (this.field_m[2]))[1] = true;
                  break L1;
                }
              }
              if (this.b((byte) 52, param0, var4_int)) {
                stackOut_9_0 = var4_int;
                stackIn_10_0 = stackOut_9_0;
                decompiledRegionSelector0 = 2;
                break L0;
              } else {
                stackOut_7_0 = -1;
                stackIn_8_0 = stackOut_7_0;
                decompiledRegionSelector0 = 1;
                break L0;
              }
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L2: {
            var4 = decompiledCaughtException;
            stackOut_11_0 = (RuntimeException) (var4);
            stackOut_11_1 = new StringBuilder().append("bc.C(").append(param0).append(',').append(param1).append(',');
            stackIn_13_0 = stackOut_11_0;
            stackIn_13_1 = stackOut_11_1;
            stackIn_12_0 = stackOut_11_0;
            stackIn_12_1 = stackOut_11_1;
            if (param2 == null) {
              stackOut_13_0 = (RuntimeException) ((Object) stackIn_13_0);
              stackOut_13_1 = (StringBuilder) ((Object) stackIn_13_1);
              stackOut_13_2 = "null";
              stackIn_14_0 = stackOut_13_0;
              stackIn_14_1 = stackOut_13_1;
              stackIn_14_2 = stackOut_13_2;
              break L2;
            } else {
              stackOut_12_0 = (RuntimeException) ((Object) stackIn_12_0);
              stackOut_12_1 = (StringBuilder) ((Object) stackIn_12_1);
              stackOut_12_2 = "{...}";
              stackIn_14_0 = stackOut_12_0;
              stackIn_14_1 = stackOut_12_1;
              stackIn_14_2 = stackOut_12_2;
              break L2;
            }
          }
          throw r.a((Throwable) ((Object) stackIn_14_0), stackIn_14_2 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return stackIn_3_0;
        } else {
          if (decompiledRegionSelector0 == 1) {
            return stackIn_8_0;
          } else {
            return stackIn_10_0;
          }
        }
    }

    final synchronized boolean b(byte param0) {
        int var2 = -20 % ((60 - param0) / 47);
        if (this.field_f == null) {
            this.field_f = this.field_e.a(6);
            if (!(this.field_f != null)) {
                return false;
            }
            this.field_m = new Object[this.field_f.field_a];
            this.field_n = new Object[this.field_f.field_a][];
        }
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
        int decompiledRegionSelector0 = 0;
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
              if (this.b((byte) 127)) {
                param0 = param0.toLowerCase();
                var4 = (CharSequence) ((Object) param0);
                var3_int = this.field_f.field_b.a(24396, pc.a(false, var4));
                stackOut_6_0 = this.c((byte) 36, var3_int);
                stackIn_7_0 = stackOut_6_0;
                decompiledRegionSelector0 = 2;
                break L0;
              } else {
                stackOut_4_0 = 0;
                stackIn_5_0 = stackOut_4_0;
                decompiledRegionSelector0 = 1;
                break L0;
              }
            } else {
              stackOut_1_0 = -90;
              stackIn_2_0 = stackOut_1_0;
              decompiledRegionSelector0 = 0;
              break L0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L1: {
            var3 = decompiledCaughtException;
            stackOut_8_0 = (RuntimeException) (var3);
            stackOut_8_1 = new StringBuilder().append("bc.L(");
            stackIn_10_0 = stackOut_8_0;
            stackIn_10_1 = stackOut_8_1;
            stackIn_9_0 = stackOut_8_0;
            stackIn_9_1 = stackOut_8_1;
            if (param0 == null) {
              stackOut_10_0 = (RuntimeException) ((Object) stackIn_10_0);
              stackOut_10_1 = (StringBuilder) ((Object) stackIn_10_1);
              stackOut_10_2 = "null";
              stackIn_11_0 = stackOut_10_0;
              stackIn_11_1 = stackOut_10_1;
              stackIn_11_2 = stackOut_10_2;
              break L1;
            } else {
              stackOut_9_0 = (RuntimeException) ((Object) stackIn_9_0);
              stackOut_9_1 = (StringBuilder) ((Object) stackIn_9_1);
              stackOut_9_2 = "{...}";
              stackIn_11_0 = stackOut_9_0;
              stackIn_11_1 = stackOut_9_1;
              stackIn_11_2 = stackOut_9_2;
              break L1;
            }
          }
          throw r.a((Throwable) ((Object) stackIn_11_0), stackIn_11_2 + ',' + param1 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return stackIn_2_0;
        } else {
          if (decompiledRegionSelector0 == 1) {
            return stackIn_5_0;
          } else {
            return stackIn_7_0;
          }
        }
    }

    final int a(byte param0) {
        if (param0 > -72) {
            this.field_m[4] = this.field_m[0];
        }
        if (!this.b((byte) -16)) {
            return -1;
        }
        return this.field_f.field_m.length;
    }

    final synchronized int c(byte param0, int param1) {
        if (!(this.b((byte) -63, param1))) {
            return 0;
        }
        if (this.field_m[param1] != null) {
            return 100;
        }
        if (param0 != 36) {
            this.field_m = (Object[]) (this.field_m[11]);
        }
        return this.field_e.a(param1, (byte) 77);
    }

    final synchronized boolean a(int param0) {
        int discarded$2 = 0;
        int var2 = 0;
        int var3 = 0;
        int var4 = 0;
        int var5 = 0;
        String var6 = null;
        L0: {
          var5 = ShatteredPlansClient.field_F ? 1 : 0;
          if (param0 == -1) {
            break L0;
          } else {
            var6 = (String) null;
            discarded$2 = this.a((String) null, (byte) -122);
            break L0;
          }
        }
        if (!this.b((byte) -43)) {
          return false;
        } else {
          var2 = 1;
          var3 = 0;
          L1: while (true) {
            if (var3 >= this.field_f.field_q.length) {
              return var2 != 0;
            } else {
              var4 = this.field_f.field_q[var3];
              if (null == this.field_m[var4]) {
                this.a((byte) -113, var4);
                if (null == this.field_m[var4]) {
                  var2 = 0;
                  var3++;
                  continue L1;
                } else {
                  var3++;
                  continue L1;
                }
              } else {
                var3++;
                continue L1;
              }
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
        int decompiledRegionSelector0 = 0;
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
            if (this.b((byte) -43)) {
              L1: {
                param1 = param1.toLowerCase();
                var4 = (CharSequence) ((Object) param1);
                var3_int = this.field_f.field_b.a(24396, pc.a(false, var4));
                if (param0 > 121) {
                  break L1;
                } else {
                  field_h = (String) null;
                  break L1;
                }
              }
              if (this.b((byte) -63, var3_int)) {
                stackOut_8_0 = var3_int;
                stackIn_9_0 = stackOut_8_0;
                decompiledRegionSelector0 = 2;
                break L0;
              } else {
                stackOut_6_0 = -1;
                stackIn_7_0 = stackOut_6_0;
                decompiledRegionSelector0 = 1;
                break L0;
              }
            } else {
              stackOut_1_0 = -1;
              stackIn_2_0 = stackOut_1_0;
              decompiledRegionSelector0 = 0;
              break L0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L2: {
            var3 = decompiledCaughtException;
            stackOut_10_0 = (RuntimeException) (var3);
            stackOut_10_1 = new StringBuilder().append("bc.D(").append(param0).append(',');
            stackIn_12_0 = stackOut_10_0;
            stackIn_12_1 = stackOut_10_1;
            stackIn_11_0 = stackOut_10_0;
            stackIn_11_1 = stackOut_10_1;
            if (param1 == null) {
              stackOut_12_0 = (RuntimeException) ((Object) stackIn_12_0);
              stackOut_12_1 = (StringBuilder) ((Object) stackIn_12_1);
              stackOut_12_2 = "null";
              stackIn_13_0 = stackOut_12_0;
              stackIn_13_1 = stackOut_12_1;
              stackIn_13_2 = stackOut_12_2;
              break L2;
            } else {
              stackOut_11_0 = (RuntimeException) ((Object) stackIn_11_0);
              stackOut_11_1 = (StringBuilder) ((Object) stackIn_11_1);
              stackOut_11_2 = "{...}";
              stackIn_13_0 = stackOut_11_0;
              stackIn_13_1 = stackOut_11_1;
              stackIn_13_2 = stackOut_11_2;
              break L2;
            }
          }
          throw r.a((Throwable) ((Object) stackIn_13_0), stackIn_13_2 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return stackIn_2_0;
        } else {
          if (decompiledRegionSelector0 == 1) {
            return stackIn_7_0;
          } else {
            return stackIn_9_0;
          }
        }
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
        int decompiledRegionSelector0 = 0;
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
            if (!this.b((byte) -80)) {
              stackOut_2_0 = 0;
              stackIn_3_0 = stackOut_2_0;
              decompiledRegionSelector0 = 0;
              break L0;
            } else {
              param0 = param0.toLowerCase();
              if (param1 == 5) {
                param2 = param2.toLowerCase();
                var6 = (CharSequence) ((Object) param0);
                var4_int = this.field_f.field_b.a(param1 + 24391, pc.a(false, var6));
                if (this.b((byte) -63, var4_int)) {
                  var7 = (CharSequence) ((Object) param2);
                  var5 = this.field_f.field_i[var4_int].a(param1 ^ 24393, pc.a(false, var7));
                  stackOut_10_0 = this.a((byte) 125, var5, var4_int);
                  stackIn_11_0 = stackOut_10_0;
                  decompiledRegionSelector0 = 3;
                  break L0;
                } else {
                  stackOut_8_0 = 0;
                  stackIn_9_0 = stackOut_8_0;
                  decompiledRegionSelector0 = 2;
                  break L0;
                }
              } else {
                stackOut_5_0 = ((boolean[]) (this.field_m[20]))[23];
                stackIn_6_0 = stackOut_5_0;
                decompiledRegionSelector0 = 1;
                break L0;
              }
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L1: {
            var4 = decompiledCaughtException;
            stackOut_12_0 = (RuntimeException) (var4);
            stackOut_12_1 = new StringBuilder().append("bc.P(");
            stackIn_14_0 = stackOut_12_0;
            stackIn_14_1 = stackOut_12_1;
            stackIn_13_0 = stackOut_12_0;
            stackIn_13_1 = stackOut_12_1;
            if (param0 == null) {
              stackOut_14_0 = (RuntimeException) ((Object) stackIn_14_0);
              stackOut_14_1 = (StringBuilder) ((Object) stackIn_14_1);
              stackOut_14_2 = "null";
              stackIn_15_0 = stackOut_14_0;
              stackIn_15_1 = stackOut_14_1;
              stackIn_15_2 = stackOut_14_2;
              break L1;
            } else {
              stackOut_13_0 = (RuntimeException) ((Object) stackIn_13_0);
              stackOut_13_1 = (StringBuilder) ((Object) stackIn_13_1);
              stackOut_13_2 = "{...}";
              stackIn_15_0 = stackOut_13_0;
              stackIn_15_1 = stackOut_13_1;
              stackIn_15_2 = stackOut_13_2;
              break L1;
            }
          }
          L2: {
            stackOut_15_0 = (RuntimeException) ((Object) stackIn_15_0);
            stackOut_15_1 = ((StringBuilder) (Object) stackIn_15_1).append(stackIn_15_2).append(',').append(param1).append(',');
            stackIn_17_0 = stackOut_15_0;
            stackIn_17_1 = stackOut_15_1;
            stackIn_16_0 = stackOut_15_0;
            stackIn_16_1 = stackOut_15_1;
            if (param2 == null) {
              stackOut_17_0 = (RuntimeException) ((Object) stackIn_17_0);
              stackOut_17_1 = (StringBuilder) ((Object) stackIn_17_1);
              stackOut_17_2 = "null";
              stackIn_18_0 = stackOut_17_0;
              stackIn_18_1 = stackOut_17_1;
              stackIn_18_2 = stackOut_17_2;
              break L2;
            } else {
              stackOut_16_0 = (RuntimeException) ((Object) stackIn_16_0);
              stackOut_16_1 = (StringBuilder) ((Object) stackIn_16_1);
              stackOut_16_2 = "{...}";
              stackIn_18_0 = stackOut_16_0;
              stackIn_18_1 = stackOut_16_1;
              stackIn_18_2 = stackOut_16_2;
              break L2;
            }
          }
          throw r.a((Throwable) ((Object) stackIn_18_0), stackIn_18_2 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return stackIn_3_0 != 0;
        } else {
          if (decompiledRegionSelector0 == 1) {
            return stackIn_6_0;
          } else {
            if (decompiledRegionSelector0 == 2) {
              return stackIn_9_0 != 0;
            } else {
              return stackIn_11_0;
            }
          }
        }
    }

    private final synchronized boolean b(byte param0, int param1, int param2) {
        if (!this.b((byte) 125)) {
          return false;
        } else {
          L0: {
            if (-1 < (param1 ^ -1)) {
              break L0;
            } else {
              if ((param2 ^ -1) > -1) {
                break L0;
              } else {
                if (this.field_f.field_m.length <= param1) {
                  break L0;
                } else {
                  if (this.field_f.field_m[param1] > param2) {
                    if (param0 > 40) {
                      return true;
                    } else {
                      field_g = (wh) (this.field_m[17]);
                      return true;
                    }
                  } else {
                    break L0;
                  }
                }
              }
            }
          }
          if (sd.field_v) {
            throw new IllegalArgumentException(param1 + " " + param2);
          } else {
            return false;
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
        int decompiledRegionSelector0 = 0;
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
            if (this.b((byte) 127)) {
              var4 = 2 % ((param1 - -1) / 49);
              param0 = param0.toLowerCase();
              var5 = (CharSequence) ((Object) param0);
              var3_int = this.field_f.field_b.a(24396, pc.a(false, var5));
              stackOut_3_0 = this.b(87, var3_int);
              stackIn_4_0 = stackOut_3_0;
              decompiledRegionSelector0 = 1;
              break L0;
            } else {
              stackOut_1_0 = 0;
              stackIn_2_0 = stackOut_1_0;
              decompiledRegionSelector0 = 0;
              break L0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L1: {
            var3 = decompiledCaughtException;
            stackOut_5_0 = (RuntimeException) (var3);
            stackOut_5_1 = new StringBuilder().append("bc.U(");
            stackIn_7_0 = stackOut_5_0;
            stackIn_7_1 = stackOut_5_1;
            stackIn_6_0 = stackOut_5_0;
            stackIn_6_1 = stackOut_5_1;
            if (param0 == null) {
              stackOut_7_0 = (RuntimeException) ((Object) stackIn_7_0);
              stackOut_7_1 = (StringBuilder) ((Object) stackIn_7_1);
              stackOut_7_2 = "null";
              stackIn_8_0 = stackOut_7_0;
              stackIn_8_1 = stackOut_7_1;
              stackIn_8_2 = stackOut_7_2;
              break L1;
            } else {
              stackOut_6_0 = (RuntimeException) ((Object) stackIn_6_0);
              stackOut_6_1 = (StringBuilder) ((Object) stackIn_6_1);
              stackOut_6_2 = "{...}";
              stackIn_8_0 = stackOut_6_0;
              stackIn_8_1 = stackOut_6_1;
              stackIn_8_2 = stackOut_6_2;
              break L1;
            }
          }
          throw r.a((Throwable) ((Object) stackIn_8_0), stackIn_8_2 + ',' + param1 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return stackIn_2_0 != 0;
        } else {
          return stackIn_4_0;
        }
    }

    public static void b(int param0) {
        if (param0 != -466) {
            return;
        }
        field_g = null;
        field_c = (int[][]) null;
        field_a = null;
        field_h = null;
        field_i = null;
        field_l = null;
        field_d = null;
    }

    private final synchronized void a(byte param0, int param1) {
        int discarded$0 = 0;
        if (!this.field_j) {
            this.field_m[param1] = wq.a(false, (byte) -126, this.field_e.a((byte) -120, param1));
        } else {
            this.field_m[param1] = this.field_e.a((byte) -112, param1);
        }
        if (param0 >= -42) {
            discarded$0 = this.c((byte) 112, -73);
        }
    }

    final static void a(int param0, byte param1, long param2) {
        sl var4 = js.field_f;
        var4.h(param0, param1 + 253);
        if (param1 != 2) {
            return;
        }
        var4.field_j = var4.field_j + 1;
        int var5 = var4.field_j;
        var4.c(7, (byte) -82);
        var4.b(-16426, param2);
        var4.b(-var5 + var4.field_j, (byte) 127);
    }

    private final synchronized byte[] a(int[] param0, int param1, int param2, int param3) {
        boolean discarded$1 = false;
        Object var5 = null;
        int[] var7 = null;
        byte[] var8 = null;
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
            if (this.b((byte) 106, param2, param1)) {
              L1: {
                if (param3 > 81) {
                  break L1;
                } else {
                  var7 = (int[]) null;
                  discarded$1 = this.a(42, (int[]) null, -94, (byte) -122);
                  break L1;
                }
              }
              L2: {
                L3: {
                  var5 = null;
                  if (null == this.field_n[param2]) {
                    break L3;
                  } else {
                    if (null != this.field_n[param2][param1]) {
                      break L2;
                    } else {
                      break L3;
                    }
                  }
                }
                if (this.a(param1, param0, param2, (byte) -113)) {
                  break L2;
                } else {
                  this.a((byte) -127, param2);
                  if (this.a(param1, param0, param2, (byte) -114)) {
                    break L2;
                  } else {
                    return null;
                  }
                }
              }
              if (this.field_n[param2] != null) {
                L4: {
                  if (this.field_n[param2][param1] == null) {
                    break L4;
                  } else {
                    var8 = sq.a(-1, this.field_n[param2][param1], false);
                    var5 = var8;
                    if (var8 == null) {
                      throw new RuntimeException("");
                    } else {
                      break L4;
                    }
                  }
                }
                L5: {
                  if (var5 != null) {
                    if (-2 == (this.field_k ^ -1)) {
                      this.field_n[param2][param1] = null;
                      if (-2 == (this.field_f.field_m[param2] ^ -1)) {
                        this.field_n[param2] = null;
                        break L5;
                      } else {
                        break L5;
                      }
                    } else {
                      if (2 != this.field_k) {
                        break L5;
                      } else {
                        this.field_n[param2] = null;
                        break L5;
                      }
                    }
                  } else {
                    break L5;
                  }
                }
                stackOut_26_0 = var5;
                stackIn_27_0 = stackOut_26_0;
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
            var5 = decompiledCaughtException;
            stackOut_28_0 = var5;
            stackOut_28_1 = new StringBuilder().append("bc.B(");
            stackIn_30_0 = stackOut_28_0;
            stackIn_30_1 = stackOut_28_1;
            stackIn_29_0 = stackOut_28_0;
            stackIn_29_1 = stackOut_28_1;
            if (param0 == null) {
              stackOut_30_0 = stackIn_30_0;
              stackOut_30_1 = (StringBuilder) ((Object) stackIn_30_1);
              stackOut_30_2 = "null";
              stackIn_31_0 = stackOut_30_0;
              stackIn_31_1 = stackOut_30_1;
              stackIn_31_2 = stackOut_30_2;
              break L6;
            } else {
              stackOut_29_0 = stackIn_29_0;
              stackOut_29_1 = (StringBuilder) ((Object) stackIn_29_1);
              stackOut_29_2 = "{...}";
              stackIn_31_0 = stackOut_29_0;
              stackIn_31_1 = stackOut_29_1;
              stackIn_31_2 = stackOut_29_2;
              break L6;
            }
          }
          throw r.a((Throwable) ((Object) stackIn_31_0), stackIn_31_2 + ',' + param1 + ',' + param2 + ',' + param3 + ')');
        }
        return (byte[]) ((Object) stackIn_27_0);
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
        int decompiledRegionSelector0 = 0;
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
            if (this.b((byte) 2)) {
              param0 = param0.toLowerCase();
              var4 = (CharSequence) ((Object) param0);
              var3_int = this.field_f.field_b.a(24396, pc.a(false, var4));
              if (0 > var3_int) {
                stackOut_5_0 = 0;
                stackIn_6_0 = stackOut_5_0;
                decompiledRegionSelector0 = 1;
                break L0;
              } else {
                if (param1 < -110) {
                  stackOut_10_0 = 1;
                  stackIn_11_0 = stackOut_10_0;
                  decompiledRegionSelector0 = 3;
                  break L0;
                } else {
                  stackOut_8_0 = ((boolean[]) (this.field_m[2]))[11];
                  stackIn_9_0 = stackOut_8_0;
                  decompiledRegionSelector0 = 2;
                  break L0;
                }
              }
            } else {
              stackOut_1_0 = 0;
              stackIn_2_0 = stackOut_1_0;
              decompiledRegionSelector0 = 0;
              break L0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L1: {
            var3 = decompiledCaughtException;
            stackOut_12_0 = (RuntimeException) (var3);
            stackOut_12_1 = new StringBuilder().append("bc.K(");
            stackIn_14_0 = stackOut_12_0;
            stackIn_14_1 = stackOut_12_1;
            stackIn_13_0 = stackOut_12_0;
            stackIn_13_1 = stackOut_12_1;
            if (param0 == null) {
              stackOut_14_0 = (RuntimeException) ((Object) stackIn_14_0);
              stackOut_14_1 = (StringBuilder) ((Object) stackIn_14_1);
              stackOut_14_2 = "null";
              stackIn_15_0 = stackOut_14_0;
              stackIn_15_1 = stackOut_14_1;
              stackIn_15_2 = stackOut_14_2;
              break L1;
            } else {
              stackOut_13_0 = (RuntimeException) ((Object) stackIn_13_0);
              stackOut_13_1 = (StringBuilder) ((Object) stackIn_13_1);
              stackOut_13_2 = "{...}";
              stackIn_15_0 = stackOut_13_0;
              stackIn_15_1 = stackOut_13_1;
              stackIn_15_2 = stackOut_13_2;
              break L1;
            }
          }
          throw r.a((Throwable) ((Object) stackIn_15_0), stackIn_15_2 + ',' + param1 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return stackIn_2_0 != 0;
        } else {
          if (decompiledRegionSelector0 == 1) {
            return stackIn_6_0 != 0;
          } else {
            if (decompiledRegionSelector0 == 2) {
              return stackIn_9_0;
            } else {
              return stackIn_11_0 != 0;
            }
          }
        }
    }

    private final synchronized boolean b(byte param0, int param1) {
        boolean discarded$2 = false;
        if (this.b((byte) 115)) {
          L0: {
            if ((param1 ^ -1) > -1) {
              break L0;
            } else {
              if (this.field_f.field_m.length <= param1) {
                break L0;
              } else {
                if (-1 != (this.field_f.field_m[param1] ^ -1)) {
                  if (param0 == -63) {
                    return true;
                  } else {
                    discarded$2 = this.a((byte) 34, -45, 63);
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
            field_i = (String) (this.field_m[11]);
        }
        return this.a((int[]) null, param2, param0, 113);
    }

    final int a(int param0, int param1) {
        if (!(this.b((byte) -63, param0))) {
            return 0;
        }
        if (param1 != -26268) {
            return ((int[]) (this.field_m[0]))[4];
        }
        return this.field_f.field_m[param0];
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
        int decompiledRegionSelector0 = 0;
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
            if (this.b((byte) -117)) {
              L2: {
                param2 = param2.toLowerCase();
                param1 = param1.toLowerCase();
                stackOut_5_0 = this.field_f.field_b;
                stackOut_5_1 = 24396;
                stackIn_7_0 = stackOut_5_0;
                stackIn_7_1 = stackOut_5_1;
                stackIn_6_0 = stackOut_5_0;
                stackIn_6_1 = stackOut_5_1;
                if (param0) {
                  stackOut_7_0 = (cm) ((Object) stackIn_7_0);
                  stackOut_7_1 = stackIn_7_1;
                  stackOut_7_2 = 0;
                  stackIn_8_0 = stackOut_7_0;
                  stackIn_8_1 = stackOut_7_1;
                  stackIn_8_2 = stackOut_7_2;
                  break L2;
                } else {
                  stackOut_6_0 = (cm) ((Object) stackIn_6_0);
                  stackOut_6_1 = stackIn_6_1;
                  stackOut_6_2 = 1;
                  stackIn_8_0 = stackOut_6_0;
                  stackIn_8_1 = stackOut_6_1;
                  stackIn_8_2 = stackOut_6_2;
                  break L2;
                }
              }
              var6 = (CharSequence) ((Object) param2);
              var4_int = ((cm) (Object) stackIn_8_0).a(stackIn_8_1, pc.a(stackIn_8_2 != 0, var6));
              if (this.b((byte) -63, var4_int)) {
                L3: {
                  stackOut_11_0 = this.field_f.field_i[var4_int];
                  stackOut_11_1 = 24396;
                  stackIn_13_0 = stackOut_11_0;
                  stackIn_13_1 = stackOut_11_1;
                  stackIn_12_0 = stackOut_11_0;
                  stackIn_12_1 = stackOut_11_1;
                  if (param0) {
                    stackOut_13_0 = (cm) ((Object) stackIn_13_0);
                    stackOut_13_1 = stackIn_13_1;
                    stackOut_13_2 = 0;
                    stackIn_14_0 = stackOut_13_0;
                    stackIn_14_1 = stackOut_13_1;
                    stackIn_14_2 = stackOut_13_2;
                    break L3;
                  } else {
                    stackOut_12_0 = (cm) ((Object) stackIn_12_0);
                    stackOut_12_1 = stackIn_12_1;
                    stackOut_12_2 = 1;
                    stackIn_14_0 = stackOut_12_0;
                    stackIn_14_1 = stackOut_12_1;
                    stackIn_14_2 = stackOut_12_2;
                    break L3;
                  }
                }
                var7 = (CharSequence) ((Object) param1);
                var5 = ((cm) (Object) stackIn_14_0).a(stackIn_14_1, pc.a(stackIn_14_2 != 0, var7));
                stackOut_14_0 = this.a(var4_int, -1, var5);
                stackIn_15_0 = stackOut_14_0;
                decompiledRegionSelector0 = 1;
                break L0;
              } else {
                return null;
              }
            } else {
              stackOut_3_0 = null;
              stackIn_4_0 = stackOut_3_0;
              decompiledRegionSelector0 = 0;
              break L0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L4: {
            var4 = decompiledCaughtException;
            stackOut_16_0 = (RuntimeException) (var4);
            stackOut_16_1 = new StringBuilder().append("bc.E(").append(param0).append(',');
            stackIn_18_0 = stackOut_16_0;
            stackIn_18_1 = stackOut_16_1;
            stackIn_17_0 = stackOut_16_0;
            stackIn_17_1 = stackOut_16_1;
            if (param1 == null) {
              stackOut_18_0 = (RuntimeException) ((Object) stackIn_18_0);
              stackOut_18_1 = (StringBuilder) ((Object) stackIn_18_1);
              stackOut_18_2 = "null";
              stackIn_19_0 = stackOut_18_0;
              stackIn_19_1 = stackOut_18_1;
              stackIn_19_2 = stackOut_18_2;
              break L4;
            } else {
              stackOut_17_0 = (RuntimeException) ((Object) stackIn_17_0);
              stackOut_17_1 = (StringBuilder) ((Object) stackIn_17_1);
              stackOut_17_2 = "{...}";
              stackIn_19_0 = stackOut_17_0;
              stackIn_19_1 = stackOut_17_1;
              stackIn_19_2 = stackOut_17_2;
              break L4;
            }
          }
          L5: {
            stackOut_19_0 = (RuntimeException) ((Object) stackIn_19_0);
            stackOut_19_1 = ((StringBuilder) (Object) stackIn_19_1).append(stackIn_19_2).append(',');
            stackIn_21_0 = stackOut_19_0;
            stackIn_21_1 = stackOut_19_1;
            stackIn_20_0 = stackOut_19_0;
            stackIn_20_1 = stackOut_19_1;
            if (param2 == null) {
              stackOut_21_0 = (RuntimeException) ((Object) stackIn_21_0);
              stackOut_21_1 = (StringBuilder) ((Object) stackIn_21_1);
              stackOut_21_2 = "null";
              stackIn_22_0 = stackOut_21_0;
              stackIn_22_1 = stackOut_21_1;
              stackIn_22_2 = stackOut_21_2;
              break L5;
            } else {
              stackOut_20_0 = (RuntimeException) ((Object) stackIn_20_0);
              stackOut_20_1 = (StringBuilder) ((Object) stackIn_20_1);
              stackOut_20_2 = "{...}";
              stackIn_22_0 = stackOut_20_0;
              stackIn_22_1 = stackOut_20_1;
              stackIn_22_2 = stackOut_20_2;
              break L5;
            }
          }
          throw r.a((Throwable) ((Object) stackIn_22_0), stackIn_22_2 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return (byte[]) ((Object) stackIn_4_0);
        } else {
          return stackIn_15_0;
        }
    }

    final synchronized boolean a(byte param0, int param1, int param2) {
        if (param0 != 125) {
            field_c = (int[][]) null;
        }
        if (!this.b((byte) 104, param2, param1)) {
            return false;
        }
        if (this.field_n[param2] != null) {
            if (null != this.field_n[param2][param1]) {
                return true;
            }
        }
        if (!(this.field_m[param2] == null)) {
            return true;
        }
        this.a((byte) -66, param2);
        if (this.field_m[param2] == null) {
            return false;
        }
        return true;
    }

    final synchronized int d(int param0) {
        int var2 = 0;
        int var3 = 0;
        int var4 = 0;
        int var5 = 0;
        var5 = ShatteredPlansClient.field_F ? 1 : 0;
        if (this.b((byte) 111)) {
          var2 = 0;
          var3 = 0;
          var4 = 0;
          L0: while (true) {
            if (var4 >= this.field_m.length) {
              if (var2 != 0) {
                var4 = var3 * param0 / var2;
                return var4;
              } else {
                return 100;
              }
            } else {
              if (0 < this.field_f.field_n[var4]) {
                var3 = var3 + this.c((byte) 36, var4);
                var2 += 100;
                var4++;
                continue L0;
              } else {
                var4++;
                continue L0;
              }
            }
          }
        } else {
          return 0;
        }
    }

    final synchronized byte[] a(boolean param0, int param1) {
        int discarded$0 = 0;
        if (!this.b((byte) -106)) {
            return null;
        }
        if (!(1 != this.field_f.field_m.length)) {
            return this.a(0, -1, param1);
        }
        if (!this.b((byte) -63, param1)) {
            return null;
        }
        if (param0) {
            String var4 = (String) null;
            discarded$0 = this.a((String) null, (byte) -7);
        }
        if ((this.field_f.field_m[param1] ^ -1) == -2) {
            return this.a(param1, -1, 0);
        }
        throw new RuntimeException();
    }

    private final synchronized boolean a(int param0, int[] param1, int param2, byte param3) {
        Object[] array$2 = null;
        byte[] array$3 = null;
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
        ob var13 = null;
        int[] var14 = null;
        int var14_int = 0;
        int var15_int = 0;
        byte[][] var15 = null;
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
        ob var26 = null;
        byte[] var27 = null;
        int[] var30 = null;
        byte[][] var31 = null;
        int[] var32 = null;
        byte[] var33 = null;
        byte[] var34 = null;
        int[] var37 = null;
        byte[][] var38 = null;
        byte[] var41 = null;
        byte[] var42 = null;
        int stackIn_3_0 = 0;
        int stackIn_6_0 = 0;
        int stackIn_12_0 = 0;
        int stackIn_23_0 = 0;
        RuntimeException stackIn_35_0 = null;
        StringBuilder stackIn_35_1 = null;
        RuntimeException stackIn_36_0 = null;
        StringBuilder stackIn_36_1 = null;
        RuntimeException stackIn_37_0 = null;
        StringBuilder stackIn_37_1 = null;
        int stackIn_37_2 = 0;
        int stackIn_57_0 = 0;
        int stackIn_101_0 = 0;
        RuntimeException stackIn_103_0 = null;
        StringBuilder stackIn_103_1 = null;
        RuntimeException stackIn_104_0 = null;
        StringBuilder stackIn_104_1 = null;
        RuntimeException stackIn_105_0 = null;
        StringBuilder stackIn_105_1 = null;
        String stackIn_105_2 = null;
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        int stackOut_22_0 = 0;
        RuntimeException stackOut_34_0 = null;
        StringBuilder stackOut_34_1 = null;
        RuntimeException stackOut_36_0 = null;
        StringBuilder stackOut_36_1 = null;
        int stackOut_36_2 = 0;
        RuntimeException stackOut_35_0 = null;
        StringBuilder stackOut_35_1 = null;
        int stackOut_35_2 = 0;
        int stackOut_56_0 = 0;
        int stackOut_100_0 = 0;
        int stackOut_11_0 = 0;
        int stackOut_5_0 = 0;
        int stackOut_2_0 = 0;
        RuntimeException stackOut_102_0 = null;
        StringBuilder stackOut_102_1 = null;
        RuntimeException stackOut_104_0 = null;
        StringBuilder stackOut_104_1 = null;
        String stackOut_104_2 = null;
        RuntimeException stackOut_103_0 = null;
        StringBuilder stackOut_103_1 = null;
        String stackOut_103_2 = null;
        var22 = ShatteredPlansClient.field_F ? 1 : 0;
        try {
          L0: {
            if (this.b((byte) -63, param2)) {
              if (this.field_m[param2] != null) {
                L1: {
                  var5_int = this.field_f.field_n[param2];
                  var32 = this.field_f.field_k[param2];
                  var24 = var32;
                  var6 = var24;
                  if (null == this.field_n[param2]) {
                    array$2 = new Object[this.field_f.field_m[param2]];
                    this.field_n[param2] = array$2;
                    break L1;
                  } else {
                    break L1;
                  }
                }
                var7 = this.field_n[param2];
                var8 = 1;
                var9_int = 0;
                if (param3 <= -4) {
                  L2: while (true) {
                    L3: {
                      if (var9_int >= var5_int) {
                        break L3;
                      } else {
                        L4: {
                          if (var6 != null) {
                            var10 = var32[var9_int];
                            break L4;
                          } else {
                            var10 = var9_int;
                            break L4;
                          }
                        }
                        if (var7[var10] != null) {
                          var9_int++;
                          continue L2;
                        } else {
                          var8 = 0;
                          break L3;
                        }
                      }
                    }
                    if (var8 != 0) {
                      stackOut_22_0 = 1;
                      stackIn_23_0 = stackOut_22_0;
                      decompiledRegionSelector0 = 3;
                      break L0;
                    } else {
                      L5: {
                        L6: {
                          if (param1 == null) {
                            break L6;
                          } else {
                            L7: {
                              if (0 != param1[0]) {
                                break L7;
                              } else {
                                if (-1 != (param1[1] ^ -1)) {
                                  break L7;
                                } else {
                                  if (param1[2] != 0) {
                                    break L7;
                                  } else {
                                    if (param1[3] == 0) {
                                      break L6;
                                    } else {
                                      break L7;
                                    }
                                  }
                                }
                              }
                            }
                            var33 = sq.a(-1, this.field_m[param2], true);
                            var25 = var33;
                            var9_array = var25;
                            var26 = new ob(var33);
                            var26.a(5, param1, (byte) -82, var26.field_h.length);
                            break L5;
                          }
                        }
                        var9_array = sq.a(-1, this.field_m[param2], false);
                        break L5;
                      }
                      try {
                        L8: {
                          var34 = pa.a(var9_array, 200);
                          var27 = var34;
                          var23 = var27;
                          var41 = var23;
                          break L8;
                        }
                      } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
                        decompiledCaughtException = decompiledCaughtParameter0;
                        L9: {
                          var11_ref_RuntimeException = decompiledCaughtException;
                          stackOut_34_0 = (RuntimeException) (var11_ref_RuntimeException);
                          stackOut_34_1 = new StringBuilder();
                          stackIn_36_0 = stackOut_34_0;
                          stackIn_36_1 = stackOut_34_1;
                          stackIn_35_0 = stackOut_34_0;
                          stackIn_35_1 = stackOut_34_1;
                          if (param1 == null) {
                            stackOut_36_0 = (RuntimeException) ((Object) stackIn_36_0);
                            stackOut_36_1 = (StringBuilder) ((Object) stackIn_36_1);
                            stackOut_36_2 = 0;
                            stackIn_37_0 = stackOut_36_0;
                            stackIn_37_1 = stackOut_36_1;
                            stackIn_37_2 = stackOut_36_2;
                            break L9;
                          } else {
                            stackOut_35_0 = (RuntimeException) ((Object) stackIn_35_0);
                            stackOut_35_1 = (StringBuilder) ((Object) stackIn_35_1);
                            stackOut_35_2 = 1;
                            stackIn_37_0 = stackOut_35_0;
                            stackIn_37_1 = stackOut_35_1;
                            stackIn_37_2 = stackOut_35_2;
                            break L9;
                          }
                        }
                        throw r.a((Throwable) ((Object) stackIn_37_0), (stackIn_37_2 != 0) + " " + param2 + " " + param1.length + " " + me.a(63, var9_array, param1.length) + " " + me.a(59, var9_array, param1.length - 2) + " " + this.field_f.field_f[param2] + " " + this.field_f.field_c);
                      }
                      L10: {
                        if (this.field_j) {
                          this.field_m[param2] = null;
                          break L10;
                        } else {
                          break L10;
                        }
                      }
                      L11: {
                        if (var5_int <= 1) {
                          L12: {
                            if (var6 == null) {
                              var11 = 0;
                              break L12;
                            } else {
                              var11 = var32[0];
                              break L12;
                            }
                          }
                          if (0 != this.field_k) {
                            var7[var11] = var41;
                            break L11;
                          } else {
                            var7[var11] = wq.a(false, (byte) -126, var34);
                            break L11;
                          }
                        } else {
                          if (-3 != (this.field_k ^ -1)) {
                            var11 = var34.length;
                            var11--;
                            var12 = 255 & var23[var11];
                            var11 = var11 - 4 * (var12 * var5_int);
                            var13 = new ob(var41);
                            var13.field_j = var11;
                            var37 = new int[var5_int];
                            var30 = var37;
                            var14 = var30;
                            var15_int = 0;
                            L13: while (true) {
                              if (var12 <= var15_int) {
                                var38 = new byte[var5_int][];
                                var31 = var38;
                                var15 = var31;
                                var16 = 0;
                                L14: while (true) {
                                  if (var16 >= var5_int) {
                                    var13.field_j = var11;
                                    var16 = 0;
                                    var17 = 0;
                                    L15: while (true) {
                                      if (var12 <= var17) {
                                        var17 = 0;
                                        L16: while (true) {
                                          if (var5_int <= var17) {
                                            break L11;
                                          } else {
                                            L17: {
                                              if (var6 == null) {
                                                var18 = var17;
                                                break L17;
                                              } else {
                                                var18 = var32[var17];
                                                break L17;
                                              }
                                            }
                                            L18: {
                                              if (this.field_k != 0) {
                                                var7[var18] = var38[var17];
                                                break L18;
                                              } else {
                                                var7[var18] = wq.a(false, (byte) -127, var38[var17]);
                                                break L18;
                                              }
                                            }
                                            var17++;
                                            continue L16;
                                          }
                                        }
                                      } else {
                                        var18 = 0;
                                        var19 = 0;
                                        L19: while (true) {
                                          if (var5_int <= var19) {
                                            var17++;
                                            continue L15;
                                          } else {
                                            var18 = var18 + var13.a(16711680);
                                            ps.a(var41, var16, var38[var19], var37[var19], var18);
                                            var14[var19] = var14[var19] + var18;
                                            var16 = var16 + var18;
                                            var19++;
                                            continue L19;
                                          }
                                        }
                                      }
                                    }
                                  } else {
                                    array$3 = new byte[var37[var16]];
                                    var15[var16] = array$3;
                                    var37[var16] = 0;
                                    var16++;
                                    continue L14;
                                  }
                                }
                              } else {
                                var16 = 0;
                                var17 = 0;
                                L20: while (true) {
                                  if (var17 >= var5_int) {
                                    var15_int++;
                                    continue L13;
                                  } else {
                                    var16 = var16 + var13.a(16711680);
                                    var14[var17] = var14[var17] + var16;
                                    var17++;
                                    continue L20;
                                  }
                                }
                              }
                            }
                          } else {
                            var11 = var34.length;
                            var11--;
                            var12 = 255 & var23[var11];
                            var11 = var11 - 4 * (var5_int * var12);
                            var13 = new ob(var41);
                            var14_int = 0;
                            var13.field_j = var11;
                            var15_int = 0;
                            var16 = 0;
                            L21: while (true) {
                              if (var16 >= var12) {
                                if (var14_int == 0) {
                                  stackOut_56_0 = 1;
                                  stackIn_57_0 = stackOut_56_0;
                                  decompiledRegionSelector0 = 4;
                                  break L0;
                                } else {
                                  var42 = new byte[var14_int];
                                  var14_int = 0;
                                  var13.field_j = var11;
                                  var17 = 0;
                                  var18 = 0;
                                  L22: while (true) {
                                    if (var12 <= var18) {
                                      var7[var15_int] = var42;
                                      return true;
                                    } else {
                                      var19 = 0;
                                      var20 = 0;
                                      L23: while (true) {
                                        if (var5_int <= var20) {
                                          var18++;
                                          continue L22;
                                        } else {
                                          L24: {
                                            var19 = var19 + var13.a(16711680);
                                            if (var6 == null) {
                                              var21 = var20;
                                              break L24;
                                            } else {
                                              var21 = var32[var20];
                                              break L24;
                                            }
                                          }
                                          L25: {
                                            if (param0 != var21) {
                                              break L25;
                                            } else {
                                              ps.a(var41, var17, var42, var14_int, var19);
                                              var14_int = var14_int + var19;
                                              break L25;
                                            }
                                          }
                                          var17 = var17 + var19;
                                          var20++;
                                          continue L23;
                                        }
                                      }
                                    }
                                  }
                                }
                              } else {
                                var17 = 0;
                                var18 = 0;
                                L26: while (true) {
                                  if (var18 >= var5_int) {
                                    var16++;
                                    continue L21;
                                  } else {
                                    L27: {
                                      var17 = var17 + var13.a(16711680);
                                      if (var6 != null) {
                                        var19 = var32[var18];
                                        break L27;
                                      } else {
                                        var19 = var18;
                                        break L27;
                                      }
                                    }
                                    if (var19 == param0) {
                                      var14_int = var14_int + var17;
                                      var15_int = var19;
                                      var18++;
                                      continue L26;
                                    } else {
                                      var18++;
                                      continue L26;
                                    }
                                  }
                                }
                              }
                            }
                          }
                        }
                      }
                      stackOut_100_0 = 1;
                      stackIn_101_0 = stackOut_100_0;
                      decompiledRegionSelector0 = 5;
                      break L0;
                    }
                  }
                } else {
                  stackOut_11_0 = 0;
                  stackIn_12_0 = stackOut_11_0;
                  decompiledRegionSelector0 = 2;
                  break L0;
                }
              } else {
                stackOut_5_0 = 0;
                stackIn_6_0 = stackOut_5_0;
                decompiledRegionSelector0 = 1;
                break L0;
              }
            } else {
              stackOut_2_0 = 0;
              stackIn_3_0 = stackOut_2_0;
              decompiledRegionSelector0 = 0;
              break L0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter1) {
          decompiledCaughtException = decompiledCaughtParameter1;
          L28: {
            var5 = decompiledCaughtException;
            stackOut_102_0 = (RuntimeException) (var5);
            stackOut_102_1 = new StringBuilder().append("bc.J(").append(param0).append(',');
            stackIn_104_0 = stackOut_102_0;
            stackIn_104_1 = stackOut_102_1;
            stackIn_103_0 = stackOut_102_0;
            stackIn_103_1 = stackOut_102_1;
            if (param1 == null) {
              stackOut_104_0 = (RuntimeException) ((Object) stackIn_104_0);
              stackOut_104_1 = (StringBuilder) ((Object) stackIn_104_1);
              stackOut_104_2 = "null";
              stackIn_105_0 = stackOut_104_0;
              stackIn_105_1 = stackOut_104_1;
              stackIn_105_2 = stackOut_104_2;
              break L28;
            } else {
              stackOut_103_0 = (RuntimeException) ((Object) stackIn_103_0);
              stackOut_103_1 = (StringBuilder) ((Object) stackIn_103_1);
              stackOut_103_2 = "{...}";
              stackIn_105_0 = stackOut_103_0;
              stackIn_105_1 = stackOut_103_1;
              stackIn_105_2 = stackOut_103_2;
              break L28;
            }
          }
          throw r.a((Throwable) ((Object) stackIn_105_0), stackIn_105_2 + ',' + param2 + ',' + param3 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return stackIn_3_0 != 0;
        } else {
          if (decompiledRegionSelector0 == 1) {
            return stackIn_6_0 != 0;
          } else {
            if (decompiledRegionSelector0 == 2) {
              return stackIn_12_0 != 0;
            } else {
              if (decompiledRegionSelector0 == 3) {
                return stackIn_23_0 != 0;
              } else {
                if (decompiledRegionSelector0 == 4) {
                  return stackIn_57_0 != 0;
                } else {
                  return stackIn_101_0 != 0;
                }
              }
            }
          }
        }
    }

    final static void c(int param0) {
        boolean discarded$15 = false;
        boolean discarded$16 = false;
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
                    rp.field_I.a(true, new bo(rp.field_I, bg.field_f));
                    break L1;
                  } else {
                    break L1;
                  }
                }
              }
              decompiledRegionSelector0 = 0;
              break L0;
            } else {
              L2: {
                if (param0 <= -11) {
                  break L2;
                } else {
                  field_h = (String) null;
                  break L2;
                }
              }
              discarded$15 = rp.field_I.a(eg.field_o, true, re.field_b, (byte) 0);
              rp.field_I.i(125);
              L3: while (true) {
                if (!cc.e((byte) 55)) {
                  decompiledRegionSelector0 = 1;
                  break L0;
                } else {
                  discarded$16 = rp.field_I.a(oq.field_j, ho.field_h, true);
                  continue L3;
                }
              }
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var1 = decompiledCaughtException;
          throw r.a((Throwable) ((Object) var1), "bc.V(" + param0 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return;
        } else {
          return;
        }
    }

    final synchronized boolean b(int param0, int param1) {
        int discarded$0 = 0;
        if (!this.b((byte) -63, param1)) {
            return false;
        }
        if (null != this.field_m[param1]) {
            return true;
        }
        this.a((byte) -73, param1);
        if (!(this.field_m[param1] == null)) {
            return true;
        }
        if (param0 < 83) {
            discarded$0 = this.d(-19);
            return false;
        }
        return false;
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
        this.field_f = null;
        try {
          L0: {
            L1: {
              if (-1 < (param2 ^ -1)) {
                break L1;
              } else {
                if (param2 <= 2) {
                  L2: {
                    this.field_k = param2;
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
                  ((bc) (this)).field_j = stackIn_7_1 != 0;
                  this.field_e = param0;
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
            stackOut_9_0 = (RuntimeException) (runtimeException);
            stackOut_9_1 = new StringBuilder().append("bc.<init>(");
            stackIn_11_0 = stackOut_9_0;
            stackIn_11_1 = stackOut_9_1;
            stackIn_10_0 = stackOut_9_0;
            stackIn_10_1 = stackOut_9_1;
            if (param0 == null) {
              stackOut_11_0 = (RuntimeException) ((Object) stackIn_11_0);
              stackOut_11_1 = (StringBuilder) ((Object) stackIn_11_1);
              stackOut_11_2 = "null";
              stackIn_12_0 = stackOut_11_0;
              stackIn_12_1 = stackOut_11_1;
              stackIn_12_2 = stackOut_11_2;
              break L3;
            } else {
              stackOut_10_0 = (RuntimeException) ((Object) stackIn_10_0);
              stackOut_10_1 = (StringBuilder) ((Object) stackIn_10_1);
              stackOut_10_2 = "{...}";
              stackIn_12_0 = stackOut_10_0;
              stackIn_12_1 = stackOut_10_1;
              stackIn_12_2 = stackOut_10_2;
              break L3;
            }
          }
          throw r.a((Throwable) ((Object) stackIn_12_0), stackIn_12_2 + ',' + param1 + ',' + param2 + ')');
        }
    }

    static {
        field_l = "Password is valid";
        field_a = "1 point, 1 point per turn.";
        field_c = new int[4][];
        field_i = "Accept invitation to <%0>'s game";
        field_h = "Scamming";
    }
}
