/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class ko {
    static vq field_c;
    static String field_b;
    ma field_e;
    private ma field_f;
    static String field_a;
    static String field_d;

    final ma b(int param0) {
        ma var2 = this.field_e.field_k;
        if (var2 == this.field_e) {
            return null;
        }
        var2.a((byte) -117);
        if (param0 != -1) {
            return (ma) null;
        }
        return var2;
    }

    final boolean c(int param0) {
        int discarded$0 = 0;
        if (param0 != 0) {
            discarded$0 = this.a(-24);
        }
        return this.field_e == this.field_e.field_d ? true : false;
    }

    final void d(byte param0) {
        ma var2 = null;
        if (param0 > 20) {
          L0: while (true) {
            var2 = this.field_e.field_d;
            if (this.field_e != var2) {
              var2.a((byte) -117);
              continue L0;
            } else {
              this.field_f = null;
              return;
            }
          }
        } else {
          return;
        }
    }

    final ma e(byte param0) {
        ma var2 = this.field_e.field_d;
        if (this.field_e == var2) {
            return null;
        }
        var2.a((byte) -117);
        if (param0 != -41) {
            return (ma) null;
        }
        return var2;
    }

    final ma a(byte param0) {
        if (param0 != -127) {
            this.field_e = (ma) null;
        }
        ma var2 = this.field_e.field_k;
        if (var2 == this.field_e) {
            this.field_f = null;
            return null;
        }
        this.field_f = var2.field_k;
        return var2;
    }

    public static void d(int param0) {
        field_a = null;
        field_b = null;
        field_d = null;
        if (param0 >= -63) {
            field_a = (String) null;
        }
        field_c = null;
    }

    final ma b(byte param0) {
        ma var2 = this.field_f;
        if (!(this.field_e != var2)) {
            this.field_f = null;
            return null;
        }
        if (param0 != -46) {
            field_a = (String) null;
        }
        this.field_f = var2.field_k;
        return var2;
    }

    final ma c(byte param0) {
        ma var2 = this.field_e.field_d;
        if (this.field_e == var2) {
            this.field_f = null;
            return null;
        }
        int var3 = -68 / ((param0 - 28) / 32);
        this.field_f = var2.field_d;
        return var2;
    }

    final static boolean a(int param0, byte param1) {
        if (-1 == param0) {
            return true;
        }
        int var2 = -43 % ((param1 - -69) / 57);
        return (cb.field_d & 1 << param0) != 0 ? true : false;
    }

    final static void g(byte param0) {
        int var1_int = 0;
        int var2 = Pool.field_O;
        try {
            var1_int = 0;
            if (param0 < 73) {
                field_d = (String) null;
            }
            while (aa.field_e > var1_int) {
                wb.field_e[var1_int] = null;
                var1_int++;
            }
            aa.field_e = 0;
        } catch (RuntimeException runtimeException) {
            throw wm.a((Throwable) ((Object) runtimeException), "ko.B(" + param0 + ')');
        }
    }

    final void a(byte param0, ma param1) {
        boolean discarded$0 = false;
        try {
            if (!(null == param1.field_k)) {
                param1.a((byte) -117);
            }
            if (param0 != -84) {
                discarded$0 = ko.a(-104, (byte) -10);
            }
            param1.field_k = this.field_e;
            param1.field_d = this.field_e.field_d;
            param1.field_k.field_d = param1;
            param1.field_d.field_k = param1;
        } catch (RuntimeException runtimeException) {
            throw wm.a((Throwable) ((Object) runtimeException), "ko.O(" + param0 + ',' + (param1 != null ? "{...}" : "null") + ')');
        }
    }

    final int a(int param0) {
        int var2 = 0;
        ma var3 = this.field_e.field_d;
        if (param0 < 15) {
            field_d = (String) null;
        }
        while (var3 != this.field_e) {
            var2++;
            var3 = var3.field_d;
        }
        return var2;
    }

    final ma f(byte param0) {
        ma discarded$0 = null;
        ma var2 = this.field_f;
        if (param0 != -5) {
            discarded$0 = this.b(63);
        }
        if (var2 == this.field_e) {
            this.field_f = null;
            return null;
        }
        this.field_f = var2.field_d;
        return var2;
    }

    final ma a(ma param0, int param1) {
        ma var3 = null;
        RuntimeException var3_ref = null;
        ma stackIn_5_0 = null;
        Object stackIn_8_0 = null;
        ma stackIn_10_0 = null;
        RuntimeException stackIn_12_0 = null;
        StringBuilder stackIn_12_1 = null;
        RuntimeException stackIn_13_0 = null;
        StringBuilder stackIn_13_1 = null;
        RuntimeException stackIn_14_0 = null;
        StringBuilder stackIn_14_1 = null;
        String stackIn_14_2 = null;
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        ma stackOut_9_0 = null;
        Object stackOut_7_0 = null;
        ma stackOut_4_0 = null;
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
              if (param0 != null) {
                var3 = param0;
                break L1;
              } else {
                var3 = this.field_e.field_d;
                break L1;
              }
            }
            if (param1 == 0) {
              if (this.field_e != var3) {
                this.field_f = var3.field_d;
                stackOut_9_0 = (ma) (var3);
                stackIn_10_0 = stackOut_9_0;
                decompiledRegionSelector0 = 2;
                break L0;
              } else {
                this.field_f = null;
                stackOut_7_0 = null;
                stackIn_8_0 = stackOut_7_0;
                decompiledRegionSelector0 = 1;
                break L0;
              }
            } else {
              stackOut_4_0 = (ma) null;
              stackIn_5_0 = stackOut_4_0;
              decompiledRegionSelector0 = 0;
              break L0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L2: {
            var3_ref = decompiledCaughtException;
            stackOut_11_0 = (RuntimeException) (var3_ref);
            stackOut_11_1 = new StringBuilder().append("ko.K(");
            stackIn_13_0 = stackOut_11_0;
            stackIn_13_1 = stackOut_11_1;
            stackIn_12_0 = stackOut_11_0;
            stackIn_12_1 = stackOut_11_1;
            if (param0 == null) {
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
          throw wm.a((Throwable) ((Object) stackIn_14_0), stackIn_14_2 + ',' + param1 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return stackIn_5_0;
        } else {
          if (decompiledRegionSelector0 == 1) {
            return (ma) ((Object) stackIn_8_0);
          } else {
            return stackIn_10_0;
          }
        }
    }

    final void b(byte param0, ma param1) {
        try {
            if (param1.field_k != null) {
                param1.a((byte) -117);
            }
            param1.field_k = this.field_e.field_k;
            param1.field_d = this.field_e;
            param1.field_k.field_d = param1;
            param1.field_d.field_k = param1;
            int var3_int = -68 / ((param0 - 40) / 40);
        } catch (RuntimeException runtimeException) {
            throw wm.a((Throwable) ((Object) runtimeException), "ko.G(" + param0 + ',' + (param1 != null ? "{...}" : "null") + ')');
        }
    }

    final static void a(int[] param0, int param1, byte[] param2, int param3, int param4) {
        int incrementValue$12 = 0;
        int incrementValue$13 = 0;
        int var5_int = 0;
        RuntimeException var5 = null;
        int var6 = 0;
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
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
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
            var5_int = 0;
            if (param4 == -147296924) {
              L1: while (true) {
                if (var5_int >= lq.field_T.length) {
                  decompiledRegionSelector0 = 1;
                  break L0;
                } else {
                  param3 = lq.field_T[var5_int];
                  var6 = var5_int << -147296924;
                  L2: while (true) {
                    incrementValue$12 = param3;
                    param3--;
                    if (incrementValue$12 == 0) {
                      var5_int++;
                      continue L1;
                    } else {
                      incrementValue$13 = var6;
                      var6++;
                      param1 = tl.field_I[incrementValue$13];
                      param0[param2[param1]] = param0[param2[param1]] + 1;
                      tl.field_I[param0[param2[param1]]] = param1;
                      continue L2;
                    }
                  }
                }
              }
            } else {
              decompiledRegionSelector0 = 0;
              break L0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L3: {
            var5 = decompiledCaughtException;
            stackOut_8_0 = (RuntimeException) (var5);
            stackOut_8_1 = new StringBuilder().append("ko.N(");
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
              break L3;
            } else {
              stackOut_9_0 = (RuntimeException) ((Object) stackIn_9_0);
              stackOut_9_1 = (StringBuilder) ((Object) stackIn_9_1);
              stackOut_9_2 = "{...}";
              stackIn_11_0 = stackOut_9_0;
              stackIn_11_1 = stackOut_9_1;
              stackIn_11_2 = stackOut_9_2;
              break L3;
            }
          }
          L4: {
            stackOut_11_0 = (RuntimeException) ((Object) stackIn_11_0);
            stackOut_11_1 = ((StringBuilder) (Object) stackIn_11_1).append(stackIn_11_2).append(',').append(param1).append(',');
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
              break L4;
            } else {
              stackOut_12_0 = (RuntimeException) ((Object) stackIn_12_0);
              stackOut_12_1 = (StringBuilder) ((Object) stackIn_12_1);
              stackOut_12_2 = "{...}";
              stackIn_14_0 = stackOut_12_0;
              stackIn_14_1 = stackOut_12_1;
              stackIn_14_2 = stackOut_12_2;
              break L4;
            }
          }
          throw wm.a((Throwable) ((Object) stackIn_14_0), stackIn_14_2 + ',' + param3 + ',' + param4 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return;
        } else {
          return;
        }
    }

    public ko() {
        this.field_e = new ma();
        this.field_e.field_k = this.field_e;
        this.field_e.field_d = this.field_e;
    }

    static {
        field_b = "Resign";
        field_a = "Options";
        field_d = "Show all lobby chat";
    }
}
