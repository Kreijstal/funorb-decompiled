/*
 * Decompiled by CFR-JS 0.4.0.
 */
abstract class vm {
    in field_f;
    static sna field_i;
    static String field_g;
    in field_a;
    in field_c;
    in field_l;
    long field_b;
    lu field_n;
    int field_j;
    lu field_d;
    volatile int field_k;
    volatile int field_e;
    byte field_m;
    qfa field_h;

    final static String a(String param0, byte param1) {
        int var2_int = 0;
        RuntimeException var2 = null;
        char[] var3 = null;
        int var4 = 0;
        int var5 = 0;
        String stackIn_8_0 = null;
        RuntimeException stackIn_12_0 = null;
        StringBuilder stackIn_12_1 = null;
        String stackIn_13_2 = null;
        RuntimeException decompiledCaughtException = null;
        var5 = BachelorFridge.field_y;
        try {
          var2_int = param0.length();
          var3 = new char[var2_int];
          if (param1 < 102) {
            vm.a(false, -62, 51, (ma) null, true);
          }
          var4 = 0;
          while (var4 < var2_int) {
            var3[-1 + var2_int - var4] = param0.charAt(var4);
            var4++;
            if (var5 == 0) {
              continue;
            }
            break;
          }
          stackIn_8_0 = new String(var3);
          return stackIn_8_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2 = decompiledCaughtException;
          stackIn_12_0 = var2;
          stackIn_12_1 = new StringBuilder().append("vm.J(");
          if (param0 == null) {
            stackIn_13_2 = "null";
          } else {
            stackIn_13_2 = "{...}";
          }
          throw pe.a((Throwable) ((Object) stackIn_12_0), ((StringBuilder) (Object) stackIn_12_1).append(stackIn_13_2).append(',').append(param1).append(')').toString());
        }
    }

    abstract void b(byte param0);

    final int d(byte param0) {
        RuntimeException var2 = null;
        int stackIn_4_0 = 0;
        RuntimeException decompiledCaughtException = null;
        try {
          if (param0 != 0) {
            this.field_e = 112;
          }
          stackIn_4_0 = this.field_f.b(true) + this.field_a.b(true);
          return stackIn_4_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2 = decompiledCaughtException;
          throw pe.a((Throwable) ((Object) var2), "vm.G(" + param0 + ')');
        }
    }

    final qfa a(int param0, int param1, int param2, byte param3, boolean param4) {
        long var6_long = 0L;
        RuntimeException var6 = null;
        qfa var8 = null;
        qfa stackIn_2_0 = null;
        qfa stackIn_19_0 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          if (param2 <= 120) {
            stackIn_2_0 = (qfa) null;
            return stackIn_2_0;
          }
          var6_long = ((long)param0 << 32) + (long)param1;
          var8 = new qfa();
          var8.field_q = param4;
          var8.field_h = var6_long;
          var8.field_s = param3;
          if (!param4) {
            if (this.a(-117) >= 20) {
              throw new RuntimeException();
            }
            this.field_c.a(var8, (byte) 110);
          }
          if (param4 ||
            BachelorFridge.field_y != 0) {
            if (this.d((byte) 0) >= 20) {
              throw new RuntimeException();
            }
            this.field_f.a(var8, (byte) -120);
          }
          stackIn_19_0 = var8;
          return stackIn_19_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var6 = decompiledCaughtException;
          throw pe.a((Throwable) ((Object) var6), "vm.E(" + param0 + ',' + param1 + ',' + param2 + ',' + param3 + ',' + param4 + ')');
        }
    }

    final static void a(boolean param0, int param1, int param2, ma param3, boolean param4) {
        byte dupTemp$0 = 0;
        boolean stackIn_13_0 = false;
        int stackIn_29_0 = 0;
        int stackIn_30_1 = 0;
        int stackIn_41_0 = 0;
        int stackIn_51_0 = 0;
        RuntimeException stackIn_67_0 = null;
        StringBuilder stackIn_67_1 = null;
        String stackIn_68_2 = null;
        RuntimeException decompiledCaughtException = null;
        boolean stackOut_12_0;
        int var5_int = 0;
        RuntimeException var5 = null;
        int var6 = 0;
        int var7 = 0;
        int var8 = 0;
        int var9 = 0;
        int var10 = 0;
        int var11 = 0;
        int var12 = 0;
        int var13 = 0;
        int var14 = 0;
        int var15 = 0;
        int var16 = 0;
        int var17 = 0;
        int var18 = 0;
        int var19 = 0;
        int stackIn_41_0Lifetime1;
        int var8Lifetime1;
        int var9Lifetime1;
        int var10Lifetime1;
        int var12Lifetime1;
        int var13Lifetime1;
        var19 = BachelorFridge.field_y;
        try {
          if (!param0) {
            return;
          }
          var5_int = mda.a((-param1 + param2) * 3, 16);
          var6 = param1 * 3;
          var7 = var5_int - 10;
          qh.c((byte) 89);
          if (param3.field_n > 0 &&
            param3.field_d != null) {
            ej.a(-11163);
          }
          lq.field_y = 0;
          var8 = 0;
          boolean decompiledNaturalLoopExit0 = false;
          while (!(decompiledNaturalLoopExit0 = (!(param3.field_K > var8)))) {
            var9 = param3.field_C[var8];
            var10 = param3.field_h[var8];
            var11 = param3.field_t[var8];
            stackOut_12_0 = param4;
            stackIn_51_0 = stackOut_12_0 ? 1 : 0;
            stackIn_13_0 = stackOut_12_0;
            if (var19 == 0) {
              if (stackIn_13_0) {
                var12 = du.field_e[var9];
                var13 = ew.field_s[var9];
                var14 = -var12 + du.field_e[var10];
                var15 = -var12 + du.field_e[var11];
                var16 = -var13 + ew.field_s[var10];
                var17 = -var13 + ew.field_s[var11];
              }
              if (!stackIn_13_0 ||
                !(-(var15 * var16) + var14 * var17 >= 0)) {
                var12Lifetime1 = dl.field_i[var9];
                if (-2147483648 != var12Lifetime1) {
                  var13Lifetime1 = dl.field_i[var10];
                  if (var13Lifetime1 != -2147483648) {
                    var14 = dl.field_i[var11];
                    if (var14 != -2147483648) {
                      var15 = var12Lifetime1 - (-var13Lifetime1 + (-var14 + var6));
                      stackIn_29_0 = -1 + wa.field_m.length;
                      if (var7 >= 0) {
                        stackIn_30_1 = var15 >> var7;
                      } else {
                        stackIn_30_1 = var15 << -var7;
                      }
                      var16 = stackIn_29_0 - stackIn_30_1;
                      var17 = wa.field_m[var16];
                      while (true) {
                        if (var17 >> 4 != 0) {
                          var16--;
                          stackIn_41_0 = var16;
                          if (stackIn_41_0 < 0) {
                            System.err.println("Out of range!");
                            break;
                          }
                          var17 = wa.field_m[var16];
                          continue;
                        }
                        stackIn_41_0Lifetime1 = var17 + (var16 << 4);
                        var18 = stackIn_41_0Lifetime1;
                        ci.field_q[var18] = var8;
                        wa.field_m[var16] = 1 + var17;
                        if (param3.field_n > 0 &&
                          param3.field_d != null) {
                          dupTemp$0 = param3.field_d[var8];
                          fg.field_a[dupTemp$0] = fg.field_a[dupTemp$0] + 1;
                        }
                        lq.field_y = lq.field_y + 1;
                        break;
                      }
                    }
                  }
                }
              }
              var8++;
              continue;
            }
            break;
          }
          if (decompiledNaturalLoopExit0) {
            stackIn_51_0 = param3.field_n;
          }
          if (stackIn_51_0 > 0 &&
            param3.field_d != null) {
            var8Lifetime1 = 0;
            var9Lifetime1 = 0;
            while (!(var9Lifetime1 >= fg.field_a.length)) {
              var10Lifetime1 = fg.field_a[var9Lifetime1];
              fg.field_a[var9Lifetime1] = var8Lifetime1;
              var8Lifetime1 = var8Lifetime1 + var10Lifetime1;
              var9Lifetime1++;
              if (var19 != 0) {
                return;
              }
            }
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var5 = decompiledCaughtException;
          stackIn_67_0 = var5;
          stackIn_67_1 = new StringBuilder().append("vm.F(").append(param0).append(',').append(param1).append(',').append(param2).append(',');
          if (param3 == null) {
            stackIn_68_2 = "null";
          } else {
            stackIn_68_2 = "{...}";
          }
          throw pe.a((Throwable) ((Object) stackIn_67_0), ((StringBuilder) (Object) stackIn_67_1).append(stackIn_68_2).append(',').append(param4).append(')').toString());
        }
    }

    abstract void a(boolean param0, Object param1, int param2);

    final int a(int param0) {
        RuntimeException var2 = null;
        int stackIn_2_0 = 0;
        int stackIn_4_0 = 0;
        RuntimeException decompiledCaughtException = null;
        try {
          if (param0 <= -114) {
            stackIn_4_0 = this.field_c.b(true) + this.field_l.b(true);
            return stackIn_4_0;
          }
          stackIn_2_0 = -97;
          return stackIn_2_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2 = decompiledCaughtException;
          throw pe.a((Throwable) ((Object) var2), "vm.K(" + param0 + ')');
        }
    }

    abstract boolean c(byte param0);

    final boolean a(boolean param0) {
        RuntimeException var2 = null;
        boolean stackIn_7_0 = false;
        RuntimeException decompiledCaughtException = null;
        try {
          if (!param0) {
            stackIn_7_0 = !(20 > this.a(-118));
            return stackIn_7_0;
          }
          return false;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2 = decompiledCaughtException;
          throw pe.a((Throwable) ((Object) var2), "vm.C(" + param0 + ')');
        }
    }

    abstract void c(int param0);

    public static void a(byte param0) {
        try {
          field_i = null;
          int var1_int = -127 % ((param0 - 71) / 46);
          field_g = null;
        } catch (RuntimeException runtimeException) {
          throw pe.a((Throwable) ((Object) runtimeException), "vm.H(" + param0 + ')');
        }
    }

    final boolean b(int param0) {
        RuntimeException var2 = null;
        boolean stackIn_7_0 = false;
        RuntimeException decompiledCaughtException = null;
        try {
          if (param0 != 20) {
            this.field_b = -117L;
          }
          stackIn_7_0 = !(this.d((byte) 0) < 20);
          return stackIn_7_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2 = decompiledCaughtException;
          throw pe.a((Throwable) ((Object) var2), "vm.L(" + param0 + ')');
        }
    }

    vm() {
        this.field_f = new in();
        this.field_a = new in();
        this.field_c = new in();
        this.field_l = new in();
        this.field_n = new lu(6);
        this.field_e = 0;
        this.field_m = (byte) 0;
        this.field_k = 0;
        this.field_d = new lu(10);
    }

    static {
        field_g = "Fisticuffs</col>";
    }
}
