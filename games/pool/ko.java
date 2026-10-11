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
        if (param0 != 0) {
          this.a(-24);
        }
        return this.field_e == this.field_e.field_d ? true : false;
    }

    final void d(byte param0) {
        ma var2;
        if (param0 <= 20) {
          return;
        }
        while (true) {
          var2 = this.field_e.field_d;
          if (this.field_e != var2) {
            var2.a((byte) -117);
            continue;
          }
          break;
        }
        this.field_f = null;
        return;
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
        if (this.field_e == var2) {
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
        int var2 = -43 % ((param1 + 69) / 57);
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
        try {
          if (null != param1.field_k) {
            param1.a((byte) -117);
          }
          if (param0 != -84) {
            ko.a(-104, (byte) -10);
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
        ma var2 = this.field_f;
        if (param0 != -5) {
          this.b(63);
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
        RuntimeException stackIn_13_0 = null;
        StringBuilder stackIn_13_1 = null;
        String stackIn_14_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          if (param0 != null) {
            var3 = param0;
          } else {
            var3 = this.field_e.field_d;
          }
          if (param1 != 0) {
            stackIn_5_0 = (ma) null;
            return stackIn_5_0;
          }
          if (this.field_e != var3) {
            this.field_f = var3.field_d;
            stackIn_10_0 = var3;
            return stackIn_10_0;
          }
          this.field_f = null;
          stackIn_8_0 = null;
          return (ma) (stackIn_8_0);
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3_ref = decompiledCaughtException;
          stackIn_13_0 = var3_ref;
          stackIn_13_1 = new StringBuilder().append("ko.K(");
          if (param0 == null) {
            stackIn_14_2 = "null";
          } else {
            stackIn_14_2 = "{...}";
          }
          throw wm.a((Throwable) ((Object) stackIn_13_0), ((StringBuilder) (Object) stackIn_13_1).append(stackIn_14_2).append(',').append(param1).append(')').toString());
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
        int incrementValue$0 = 0;
        int incrementValue$1 = 0;
        byte dupTemp$2 = 0;
        int dupTemp$3 = 0;
        RuntimeException stackIn_10_0 = null;
        StringBuilder stackIn_10_1 = null;
        String stackIn_11_2 = null;
        StringBuilder stackIn_13_1 = null;
        String stackIn_14_2 = null;
        RuntimeException decompiledCaughtException = null;
        int var5_int = 0;
        RuntimeException var5 = null;
        int var6 = 0;
        try {
          var5_int = 0;
          if (param4 != -147296924) {
            return;
          }
          while (true) {
            if (var5_int >= lq.field_T.length) {
              return;
            }
            param3 = lq.field_T[var5_int];
            var6 = var5_int << 4;
            while (true) {
              incrementValue$0 = param3;
              param3--;
              if (incrementValue$0 == 0) {
                var5_int++;
                break;
              }
              incrementValue$1 = var6;
              var6++;
              param1 = tl.field_I[incrementValue$1];
              dupTemp$2 = param2[param1];
              dupTemp$3 = param0[dupTemp$2];
              param0[dupTemp$2] = dupTemp$3 + 1;
              tl.field_I[dupTemp$3] = param1;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var5 = decompiledCaughtException;
          stackIn_10_0 = var5;
          stackIn_10_1 = new StringBuilder().append("ko.N(");
          if (param0 == null) {
            stackIn_11_2 = "null";
          } else {
            stackIn_11_2 = "{...}";
          }
          stackIn_13_1 = ((StringBuilder) (Object) stackIn_10_1).append(stackIn_11_2).append(',').append(param1).append(',');
          if (param2 == null) {
            stackIn_14_2 = "null";
          } else {
            stackIn_14_2 = "{...}";
          }
          throw wm.a((Throwable) ((Object) stackIn_10_0), ((StringBuilder) (Object) stackIn_13_1).append(stackIn_14_2).append(',').append(param3).append(',').append(param4).append(')').toString());
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
