/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class ij {
    ksa field_a;
    private ksa field_b;

    final ksa a(boolean param0) {
        ksa var2 = this.field_a.field_c;
        if (this.field_a == var2) {
          return null;
        }
        if (param0) {
          var2.b(-3846);
          return var2;
        }
        return (ksa) null;
    }

    final ksa[] f(int param0) {
        int var3 = 0;
        ksa var4 = null;
        int incrementValue$0 = 0;
        int var5 = VoidHunters.field_G;
        ksa[] var6 = new ksa[this.c(3)];
        ksa[] var2 = var6;
        if (param0 == -4872) {
          var3 = 0;
          var4 = this.field_a.field_c;
          while (var4 != this.field_a) {
            incrementValue$0 = var3;
            var3++;
            var6[incrementValue$0] = var4;
            var4 = var4.field_c;
          }
          return var2;
        }
        return (ksa[]) null;
    }

    final ksa a(int param0, ksa param1) {
        ksa var3 = null;
        RuntimeException var3_ref = null;
        Object stackIn_8_0 = null;
        ksa stackIn_10_0 = null;
        RuntimeException stackIn_13_0 = null;
        StringBuilder stackIn_13_1 = null;
        String stackIn_14_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          if (param1 == null) {
            var3 = this.field_a.field_c;
          } else {
            var3 = param1;
          }
          if (param0 != 3) {
            this.c(111);
          }
          if (var3 == this.field_a) {
            this.field_b = null;
            stackIn_8_0 = null;
            return (ksa) (stackIn_8_0);
          }
          this.field_b = var3.field_c;
          stackIn_10_0 = var3;
          return stackIn_10_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3_ref = decompiledCaughtException;
          stackIn_13_0 = var3_ref;
          stackIn_13_1 = new StringBuilder().append("ij.J(").append(param0).append(',');
          if (param1 == null) {
            stackIn_14_2 = "null";
          } else {
            stackIn_14_2 = "{...}";
          }
          throw rta.a((Throwable) ((Object) stackIn_13_0), ((StringBuilder) (Object) stackIn_13_1).append(stackIn_14_2).append(')').toString());
        }
    }

    final ksa c(byte param0) {
        ksa var2 = null;
        ksa var2Lifetime1;
        if (param0 >= -102) {
          ksa var3 = (ksa) null;
          this.a((ksa) null, (byte) -49);
          var2 = this.field_a.field_a;
          if (this.field_a != var2) {
            var2.b(-3846);
            return var2;
          }
          return null;
        }
        var2Lifetime1 = this.field_a.field_a;
        if (this.field_a != var2Lifetime1) {
          var2Lifetime1.b(-3846);
          return var2Lifetime1;
        }
        return null;
    }

    final void b(int param0, ksa param1) {
        try {
          if (param0 != -10258) {
            this.e(-27);
          }
          if (param1.field_a != null) {
            param1.b(-3846);
          }
          param1.field_a = this.field_a.field_a;
          param1.field_c = this.field_a;
          param1.field_a.field_c = param1;
          param1.field_c.field_a = param1;
        } catch (RuntimeException runtimeException) {
          throw rta.a((Throwable) ((Object) runtimeException), "ij.M(" + param0 + ',' + (param1 != null ? "{...}" : "null") + ')');
        }
    }

    final void e(int param0) {
        ksa var2 = null;
        int var3 = VoidHunters.field_G;
        while (true) {
          var2 = this.field_a.field_c;
          if (this.field_a == var2) {
            break;
          }
          var2.b(-3846);
        }
        if (param0 >= 89) {
          this.field_b = null;
          return;
        }
        this.field_a = (ksa) null;
        this.field_b = null;
    }

    final boolean b(int param0) {
        int var2 = 60 % ((59 - param0) / 37);
        return this.field_a.field_c == this.field_a ? true : false;
    }

    final void a(ksa param0, byte param1) {
        if (null != param0.field_a) {
          param0.b(-3846);
        }
        param0.field_c = this.field_a.field_c;
        param0.field_a = this.field_a;
        param0.field_a.field_c = param0;
        if (param1 != -55) {
          return;
        }
        try {
          param0.field_c.field_a = param0;
        } catch (RuntimeException runtimeException) {
          throw rta.a((Throwable) ((Object) runtimeException), "ij.C(" + (param0 != null ? "{...}" : "null") + ',' + param1 + ')');
        }
    }

    final ksa a(byte param0) {
        if (param0 <= 6) {
          return (ksa) null;
        }
        ksa var2 = this.field_b;
        if (var2 != this.field_a) {
          this.field_b = var2.field_c;
          return var2;
        }
        this.field_b = null;
        return null;
    }

    final static int a(byte[] param0, int param1, int param2, String param3) {
        int var6 = 0;
        int incrementValue$0 = 0;
        int incrementValue$1 = 0;
        int incrementValue$2 = 0;
        int stackIn_3_0 = 0;
        int stackIn_9_0 = 0;
        int stackIn_12_0 = 0;
        int stackIn_15_0 = 0;
        int stackIn_19_0 = 0;
        RuntimeException stackIn_22_0 = null;
        StringBuilder stackIn_22_1 = null;
        String stackIn_23_2 = null;
        StringBuilder stackIn_25_1 = null;
        String stackIn_26_2 = null;
        RuntimeException decompiledCaughtException = null;
        int var4_int = 0;
        RuntimeException var4 = null;
        int var5 = 0;
        int var7 = 0;
        int var8 = 0;
        int var9 = 0;
        int var10 = 0;
        int var11 = 0;
        var11 = VoidHunters.field_G;
        try {
          if (param1 != -10388) {
            stackIn_3_0 = 104;
            return stackIn_3_0;
          }
          var4_int = param2;
          var5 = param3.length();
          for (var6 = 0; var6 < var5; var6 += 4) {
            var7 = mwa.a(param3.charAt(var6), -89);
            if (var5 > (var6 + 1)) {
              stackIn_9_0 = mwa.a(param3.charAt(1 + var6), -23);
            } else {
              stackIn_9_0 = -1;
            }
            var8 = stackIn_9_0;
            if (var6 + 2 < var5) {
              stackIn_12_0 = mwa.a(param3.charAt(2 + var6), -103);
            } else {
              stackIn_12_0 = -1;
            }
            var9 = stackIn_12_0;
            if (3 + var6 >= var5) {
              stackIn_15_0 = -1;
            } else {
              stackIn_15_0 = mwa.a(param3.charAt(var6 + 3), -84);
            }
            var10 = stackIn_15_0;
            incrementValue$0 = param2;
            param2++;
            param0[incrementValue$0] = (byte)knb.a(var8 >>> 4, var7 << 2);
            if (var9 != -1) {
              incrementValue$1 = param2;
              param2++;
              param0[incrementValue$1] = (byte)knb.a(dla.a(15, var8) << 4, var9 >>> 2);
              if (-1 != var10) {
                incrementValue$2 = param2;
                param2++;
                param0[incrementValue$2] = (byte)knb.a(var10, dla.a(var9, 3) << 6);
                continue;
              }
            }
            break;
          }
          stackIn_19_0 = param2 - var4_int;
          return stackIn_19_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var4 = decompiledCaughtException;
          stackIn_22_0 = var4;
          stackIn_22_1 = new StringBuilder().append("ij.N(");
          if (param0 == null) {
            stackIn_23_2 = "null";
          } else {
            stackIn_23_2 = "{...}";
          }
          stackIn_25_1 = ((StringBuilder) (Object) stackIn_22_1).append(stackIn_23_2).append(',').append(param1).append(',').append(param2).append(',');
          if (param3 == null) {
            stackIn_26_2 = "null";
          } else {
            stackIn_26_2 = "{...}";
          }
          throw rta.a((Throwable) ((Object) stackIn_22_0), ((StringBuilder) (Object) stackIn_25_1).append(stackIn_26_2).append(')').toString());
        }
    }

    final ksa d(int param0) {
        ksa var2 = null;
        ksa var2Lifetime1;
        if (param0 != 0) {
          this.field_a = (ksa) null;
          var2 = this.field_a.field_c;
          if (var2 == this.field_a) {
            this.field_b = null;
            return null;
          }
          this.field_b = var2.field_c;
          return var2;
        }
        var2Lifetime1 = this.field_a.field_c;
        if (var2Lifetime1 == this.field_a) {
          this.field_b = null;
          return null;
        }
        this.field_b = var2Lifetime1.field_c;
        return var2Lifetime1;
    }

    final ksa a(int param0) {
        ksa var2 = null;
        ksa var2Lifetime1;
        if (param0 != -1155566844) {
          this.b(-8);
          var2 = this.field_b;
          if (this.field_a == var2) {
            this.field_b = null;
            return null;
          }
          this.field_b = var2.field_a;
          return var2;
        }
        var2Lifetime1 = this.field_b;
        if (this.field_a == var2Lifetime1) {
          this.field_b = null;
          return null;
        }
        this.field_b = var2Lifetime1.field_a;
        return var2Lifetime1;
    }

    final ksa b(byte param0) {
        ksa var2 = this.field_a.field_a;
        if (param0 < 115) {
          this.f(-72);
          if (var2 != this.field_a) {
            this.field_b = var2.field_a;
            return var2;
          }
          this.field_b = null;
          return null;
        }
        if (var2 != this.field_a) {
          this.field_b = var2.field_a;
          return var2;
        }
        this.field_b = null;
        return null;
    }

    public ij() {
        this.field_a = new ksa();
        this.field_a.field_c = this.field_a;
        this.field_a.field_a = this.field_a;
    }

    final int c(int param0) {
        int var2 = 0;
        ksa var3 = null;
        int var4 = VoidHunters.field_G;
        ksa var3Lifetime1;
        int var2Lifetime1;
        if (param0 == 3) {
          var2 = 0;
          var3 = this.field_a.field_c;
          while (var3 != this.field_a) {
            var3 = var3.field_c;
            var2++;
          }
          return var2;
        }
        this.field_a = (ksa) null;
        var2Lifetime1 = 0;
        var3Lifetime1 = this.field_a.field_c;
        while (var3Lifetime1 != this.field_a) {
          var3Lifetime1 = var3Lifetime1.field_c;
          var2Lifetime1++;
        }
        return var2Lifetime1;
    }

    static {
    }
}
