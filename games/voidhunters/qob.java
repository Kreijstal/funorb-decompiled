/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class qob implements ntb {
    static int field_b;
    private int field_c;
    private int field_a;

    public final void a(tv param0, int param1) {
        RuntimeException var3 = null;
        int var4 = 0;
        qob var5 = null;
        RuntimeException stackIn_13_0 = null;
        StringBuilder stackIn_13_1 = null;
        String stackIn_14_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          var5 = (qob) (param0);
          var4 = 0;
          if (this.field_c != var5.field_c) {
            var4 = 1;
            System.out.println("int x has changed. before=" + var5.field_c + ", now=" + this.field_c);
          }
          if (var5.field_a != this.field_a) {
            var4 = 1;
            System.out.println("int y has changed. before=" + var5.field_a + ", now=" + this.field_a);
          }
          if (var4 != 0) {
            System.out.println("This instance of Nebula has changed");
          }
          if (param1 < -19) {
            return;
          }
          this.field_c = -50;
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3 = decompiledCaughtException;
          stackIn_13_0 = var3;
          stackIn_13_1 = new StringBuilder().append("qob.F(");
          if (param0 == null) {
            stackIn_14_2 = "null";
          } else {
            stackIn_14_2 = "{...}";
          }
          throw rta.a((Throwable) ((Object) stackIn_13_0), ((StringBuilder) (Object) stackIn_13_1).append(stackIn_14_2).append(',').append(param1).append(')').toString());
        }
    }

    public final boolean a(byte param0, tv param1) {
        qob var3 = null;
        int var4 = 0;
        boolean stackIn_5_0 = false;
        RuntimeException stackIn_8_0 = null;
        StringBuilder stackIn_8_1 = null;
        String stackIn_9_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var3_ref = null;
        try {
          var3 = (qob) (param1);
          var4 = -105 % ((param0 - 22) / 59);
          stackIn_5_0 = (var3.field_c != this.field_c) || (var3.field_a != this.field_a);
          return stackIn_5_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3_ref = decompiledCaughtException;
          stackIn_8_0 = var3_ref;
          stackIn_8_1 = new StringBuilder().append("qob.C(").append(param0).append(',');
          if (param1 == null) {
            stackIn_9_2 = "null";
          } else {
            stackIn_9_2 = "{...}";
          }
          throw rta.a((Throwable) ((Object) stackIn_8_0), ((StringBuilder) (Object) stackIn_8_1).append(stackIn_9_2).append(')').toString());
        }
    }

    final static void a(int param0) {
        int var1 = -119 / ((param0 + 46) / 50);
        if (hwa.field_o != null) {
          hwa.field_o.l((byte) -106);
        }
        fib.field_j = new waa();
        s.field_o.b(fib.field_j, -116);
    }

    public final void b(faa param0, int param1) {
        try {
          if (param1 >= -109) {
            faa var4 = (faa) null;
            this.a((faa) null, true);
          }
          param0.a(-632, this.field_c, 32);
          param0.a(-632, this.field_a, 32);
        } catch (RuntimeException runtimeException) {
          throw rta.a((Throwable) ((Object) runtimeException), "qob.B(" + (param0 != null ? "{...}" : "null") + ',' + param1 + ')');
        }
    }

    public final void a(faa param0, boolean param1) {
        if (param1) {
          return;
        }
        try {
          this.field_c = param0.i(0, 32);
          this.field_a = param0.i(0, 32);
        } catch (RuntimeException runtimeException) {
          throw rta.a((Throwable) ((Object) runtimeException), "qob.H(" + (param0 != null ? "{...}" : "null") + ',' + param1 + ')');
        }
    }

    final static boolean a(vu param0, int param1, vu param2) {
        int var3_int = 0;
        RuntimeException var3 = null;
        int var4 = 0;
        RuntimeException stackIn_18_0 = null;
        StringBuilder stackIn_18_1 = null;
        String stackIn_19_2 = null;
        StringBuilder stackIn_21_1 = null;
        String stackIn_22_2 = null;
        RuntimeException decompiledCaughtException = null;
        var4 = VoidHunters.field_G;
        try {
          var3_int = -param0.field_yb + param2.field_yb;
          if (param2.field_Ab != kbb.field_q) {
            if (null == param2.field_Ab) {
              var3_int += 200;
            }
          } else {
            var3_int -= 200;
          }
          if (param1 != 7569) {
            qob.a(-48);
          }
          if (kbb.field_q != param0.field_Ab) {
            if (param0.field_Ab == null) {
              var3_int -= 200;
            }
          } else {
            var3_int += 200;
          }
          return !(var3_int <= 0);
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3 = decompiledCaughtException;
          stackIn_18_0 = var3;
          stackIn_18_1 = new StringBuilder().append("qob.E(");
          if (param0 == null) {
            stackIn_19_2 = "null";
          } else {
            stackIn_19_2 = "{...}";
          }
          stackIn_21_1 = ((StringBuilder) (Object) stackIn_18_1).append(stackIn_19_2).append(',').append(param1).append(',');
          if (param2 == null) {
            stackIn_22_2 = "null";
          } else {
            stackIn_22_2 = "{...}";
          }
          throw rta.a((Throwable) ((Object) stackIn_18_0), ((StringBuilder) (Object) stackIn_21_1).append(stackIn_22_2).append(')').toString());
        }
    }

    final int a(boolean param0) {
        if (!param0) {
          this.field_c = 7;
          return this.field_c;
        }
        return this.field_c;
    }

    final boolean a(byte param0, int param1, int param2) {
        int var4 = 0;
        int var5 = 0;
        int var6 = 0;
        if (param0 == 100) {
          var4 = -this.field_c + param1;
          var5 = -this.field_a + param2;
          var6 = ar.a(var4, (byte) 105, var5);
          return var6 < 32768 ? true : false;
        }
        return true;
    }

    final int a(byte param0) {
        if (param0 >= -49) {
          return 42;
        }
        return this.field_a;
    }

    private final int a(int param0, boolean param1) {
        if (param1) {
          return 8192 * (-(param0 % 3) + 3);
        }
        field_b = 68;
        return 8192 * (-(param0 % 3) + 3);
    }

    public final void b(byte param0, tv param1) {
        qob var5 = null;
        qob var6 = null;
        try {
          if (param0 < 54) {
            this.a(false);
          }
          var5 = (qob) (param1);
          var6 = var5;
          var6.field_c = this.field_c;
          var6.field_a = this.field_a;
        } catch (RuntimeException runtimeException) {
          throw rta.a((Throwable) ((Object) runtimeException), "qob.D(" + param0 + ',' + (param1 != null ? "{...}" : "null") + ')');
        }
    }

    qob() {
    }

    qob(int param0, int param1) {
        this.field_a = param1;
        this.field_c = param0;
    }

    final void a(sg param0, int param1, int param2, lta param3, int param4) {
        RuntimeException stackIn_14_0 = null;
        StringBuilder stackIn_14_1 = null;
        String stackIn_15_2 = null;
        StringBuilder stackIn_17_1 = null;
        String stackIn_18_2 = null;
        RuntimeException decompiledCaughtException = null;
        int var6_int = 0;
        RuntimeException var6 = null;
        float var7 = 0.0f;
        float var8 = 0.0f;
        int var9 = 0;
        int var10 = 0;
        int var11 = 0;
        int var12 = 0;
        aja var13 = null;
        int var14 = 0;
        int var15 = 0;
        int var16 = 0;
        int var17 = 0;
        try {
          var6_int = param4 % 16 - 8;
          var7 = param3.b(this.field_c + (fc.a(param2 * var6_int << 1, (byte) -127) >> 4), -125);
          var8 = param3.c(0, this.field_a + (eu.a(param2 * var6_int << 1, 116) >> 4));
          if (param1 <= 42) {
            return;
          }
          var9 = this.a(param4, true);
          var10 = 200;
          var11 = 7842355;
          if (li.field_i &&
            1 == ki.field_o) {
            var12 = param4 % 3 + 8;
            var13 = mmb.field_d[var12];
            var14 = (int)((float)var9 * param3.field_a * 4.0f);
            var15 = (int)var7 - (var14 >> 1);
            var16 = -(var14 >> 1) + (int)var8;
            var17 = var9 << 1;
            if (param3.field_f[0] <= this.field_c + var17 &&
              -var17 + this.field_c < param3.field_f[1] &&
              this.field_a + var17 >= param3.field_f[2] &&
              param3.field_f[3] > this.field_a - var17) {
              var13.a(var15, var16, var14, var14, 2, var11, 1);
              return;
            }
            return;
          }
          jj.a(var11, (byte) 7, (int)var8, param3.field_a * (float)var9, var10, (int)var7);
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var6 = decompiledCaughtException;
          stackIn_14_0 = var6;
          stackIn_14_1 = new StringBuilder().append("qob.L(");
          if (param0 == null) {
            stackIn_15_2 = "null";
          } else {
            stackIn_15_2 = "{...}";
          }
          stackIn_17_1 = ((StringBuilder) (Object) stackIn_14_1).append(stackIn_15_2).append(',').append(param1).append(',').append(param2).append(',');
          if (param3 == null) {
            stackIn_18_2 = "null";
          } else {
            stackIn_18_2 = "{...}";
          }
          throw rta.a((Throwable) ((Object) stackIn_14_0), ((StringBuilder) (Object) stackIn_17_1).append(stackIn_18_2).append(',').append(param4).append(')').toString());
        }
    }

    static {
        field_b = 64;
    }
}
