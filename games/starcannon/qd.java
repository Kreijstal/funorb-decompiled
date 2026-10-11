/*
 * Decompiled by CFR-JS 0.4.0.
 */
abstract class qd extends vk {
    static int[] field_E;
    static int[] field_H;
    boolean field_G;
    static String field_y;
    static o field_D;
    static String field_C;
    private int field_A;
    private tc field_F;
    static double field_z;
    static String field_B;

    qd(tc param0, int param1, int param2) {
        super(-param1 + ui.field_o >> 1, ak.field_h - param2 >> 1, param1, param2, (de) null);
        try {
          this.field_A = 0;
          this.field_G = false;
          this.field_F = param0;
        } catch (RuntimeException runtimeException) {
          throw sd.a((Throwable) ((Object) runtimeException), "qd.<init>(" + (param0 != null ? "{...}" : "null") + ',' + param1 + ',' + param2 + ')');
        }
    }

    final void a(int param0, int param1, byte param2, int param3) {
        if (0 == this.field_A) {
          return;
        }
        if (256 <= this.field_A) {
          if (param0 == 0) {
            this.c(this.field_s + param1, (byte) -122, param3 + this.field_j);
            super.a(param0, param1, (byte) 49, param3);
            return;
          }
          return;
        }
        if (le.field_c == null) {
          le.field_c = new hl(this.field_i, this.field_f);
          bc.a(le.field_c, 26095);
          ki.b();
          this.c(0, (byte) 73, 0);
          super.a(param0, -param1 - this.field_s, param2, -this.field_j - param3);
          wf.a(param2 ^ -15);
          le.field_c.e(param1 + this.field_s, param3 + this.field_j, this.field_A);
          return;
        }
        if (le.field_c.field_u < this.field_i) {
          le.field_c = new hl(this.field_i, this.field_f);
          bc.a(le.field_c, 26095);
          ki.b();
          this.c(0, (byte) 73, 0);
          super.a(param0, -param1 - this.field_s, param2, -this.field_j - param3);
          wf.a(param2 ^ -15);
          le.field_c.e(param1 + this.field_s, param3 + this.field_j, this.field_A);
          return;
        }
        if (le.field_c.field_v >= this.field_f) {
          bc.a(le.field_c, 26095);
          ki.b();
          this.c(0, (byte) 73, 0);
          super.a(param0, -param1 - this.field_s, param2, -this.field_j - param3);
          wf.a(param2 ^ -15);
          le.field_c.e(param1 + this.field_s, param3 + this.field_j, this.field_A);
          return;
        }
        le.field_c = new hl(this.field_i, this.field_f);
        bc.a(le.field_c, 26095);
        ki.b();
        this.c(0, (byte) 73, 0);
        super.a(param0, -param1 - this.field_s, param2, -this.field_j - param3);
        wf.a(param2 ^ -15);
        le.field_c.e(param1 + this.field_s, param3 + this.field_j, this.field_A);
    }

    final static void a(int param0, int param1) {
        fd.field_c = 1000000000L / (long)param1;
        if (param0 != 1) {
          qd.a(-81, -48);
        }
    }

    abstract void c(int param0, byte param1, int param2);

    boolean i(int param0) {
        if (param0 >= -121) {
          byte[] var3 = (byte[]) null;
          qd.a((byte[]) null, (byte) -3);
          this.field_A = this.a(0);
          if (this.field_A != 0) {
            return false;
          }
          if (!this.field_G) {
            return true;
          }
          return false;
        }
        this.field_A = this.a(0);
        if (this.field_A != 0) {
          return false;
        }
        if (!this.field_G) {
          return true;
        }
        return false;
    }

    final uj h(int param0) {
        uj var2 = super.h(param0);
        if (var2 != null) {
          return var2;
        }
        return (uj) (this);
    }

    public static void h(byte param0) {
        field_H = null;
        field_E = null;
        field_B = null;
        field_D = null;
        field_y = null;
        field_C = null;
        if (param0 != -37) {
          qd.h((byte) -24);
        }
    }

    final static void a(int param0, int param1, int param2, int param3, int[] param4) {
        int[] var5 = null;
        RuntimeException var5_ref = null;
        int var6 = 0;
        int var7 = 0;
        int var8 = 0;
        int[] var9 = null;
        RuntimeException stackIn_8_0 = null;
        StringBuilder stackIn_8_1 = null;
        String stackIn_9_2 = null;
        RuntimeException decompiledCaughtException = null;
        var8 = StarCannon.field_A;
        try {
          while (true) {
            param0--;
            if (0 > param0) {
              if (param1 > 3) {
                return;
              }
              field_y = (String) null;
              return;
            }
            var9 = param4;
            var5 = var9;
            var6 = param2;
            var7 = param3;
            var9[var6] = w.a(var9[var6] >> 1, 8355711) + var7;
            param2++;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var5_ref = decompiledCaughtException;
          stackIn_8_0 = var5_ref;
          stackIn_8_1 = new StringBuilder().append("qd.TA(").append(param0).append(',').append(param1).append(',').append(param2).append(',').append(param3).append(',');
          if (param4 == null) {
            stackIn_9_2 = "null";
          } else {
            stackIn_9_2 = "{...}";
          }
          throw sd.a((Throwable) ((Object) stackIn_8_0), ((StringBuilder) (Object) stackIn_8_1).append(stackIn_9_2).append(')').toString());
        }
    }

    private final int a(int param0) {
        if (param0 == 0) {
          return !this.field_G ? 0 : this.field_F.k(0) == this ? 256 : 0;
        }
        return 107;
    }

    final void b(int param0, byte param1, int param2) {
        if (param1 == 57) {
          this.a(ui.field_o - param0 >> 1, param0, (byte) 120, param2, -param2 + ak.field_h >> 1);
          return;
        }
        this.field_A = -103;
        this.a(ui.field_o - param0 >> 1, param0, (byte) 120, param2, -param2 + ak.field_h >> 1);
    }

    boolean g(byte param0) {
        boolean stackIn_8_0 = false;
        boolean stackIn_15_0 = false;
        boolean stackIn_24_0 = false;
        boolean stackIn_30_0 = false;
        boolean stackIn_39_0 = false;
        boolean stackIn_45_0 = false;
        boolean stackIn_53_0 = false;
        boolean stackIn_59_0 = false;
        int var2;
        int var3;
        var2 = this.a(0);
        var3 = var2 - this.field_A;
        if (param0 != -124) {
          field_E = (int[]) null;
          if (var3 <= 0) {
            if (0 > var3) {
              this.field_A = this.field_A + (var3 - 15) / 16;
              if (0 != this.field_A) {
                return false;
              }
              if (var2 != 0) {
                return false;
              }
              stackIn_15_0 = !(this.field_G);
              return stackIn_15_0;
            }
            stackIn_8_0 = (0 == this.field_A) && (var2 == 0) && (!this.field_G);
            return stackIn_8_0;
          }
          this.field_A = this.field_A + (-1 + (var3 + 8)) / 8;
          if (0 <= var3) {
            stackIn_30_0 = (0 == this.field_A) && (var2 == 0) && (!this.field_G);
            return stackIn_30_0;
          }
          this.field_A = this.field_A + (var3 - 15) / 16;
          stackIn_24_0 = (0 == this.field_A) && (var2 == 0) && (!this.field_G);
          return stackIn_24_0;
        }
        if (var3 <= 0) {
          if (0 <= var3) {
            stackIn_53_0 = (0 == this.field_A) && (var2 == 0) && (!this.field_G);
            return stackIn_53_0;
          }
          this.field_A = this.field_A + (var3 - 15) / 16;
          stackIn_59_0 = (0 == this.field_A) && (var2 == 0) && (!this.field_G);
          return stackIn_59_0;
        }
        this.field_A = this.field_A + (-1 + (var3 + 8)) / 8;
        if (0 <= var3) {
          stackIn_39_0 = (0 == this.field_A) && (var2 == 0) && (!this.field_G);
          return stackIn_39_0;
        }
        this.field_A = this.field_A + (var3 - 15) / 16;
        stackIn_45_0 = (0 == this.field_A) && (var2 == 0) && (!this.field_G);
        return stackIn_45_0;
    }

    final static lh a(int param0, int param1, ja param2, byte param3, ue param4) {
        byte[] var5 = null;
        RuntimeException var5_ref = null;
        byte[] var6 = null;
        lh stackIn_2_0 = null;
        Object stackIn_5_0 = null;
        lh stackIn_7_0 = null;
        RuntimeException stackIn_10_0 = null;
        StringBuilder stackIn_10_1 = null;
        String stackIn_11_2 = null;
        StringBuilder stackIn_13_1 = null;
        String stackIn_14_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          if (param3 <= 71) {
            stackIn_2_0 = (lh) null;
            return stackIn_2_0;
          }
          var6 = param4.a(param0, true, param1);
          var5 = var6;
          if (var6 != null) {
            stackIn_7_0 = new lh(new rb(var6), param2);
            return stackIn_7_0;
          }
          stackIn_5_0 = null;
          return (lh) (stackIn_5_0);
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var5_ref = decompiledCaughtException;
          stackIn_10_0 = var5_ref;
          stackIn_10_1 = new StringBuilder().append("qd.KA(").append(param0).append(',').append(param1).append(',');
          if (param2 == null) {
            stackIn_11_2 = "null";
          } else {
            stackIn_11_2 = "{...}";
          }
          stackIn_13_1 = ((StringBuilder) (Object) stackIn_10_1).append(stackIn_11_2).append(',').append(param3).append(',');
          if (param4 == null) {
            stackIn_14_2 = "null";
          } else {
            stackIn_14_2 = "{...}";
          }
          throw sd.a((Throwable) ((Object) stackIn_10_0), ((StringBuilder) (Object) stackIn_13_1).append(stackIn_14_2).append(')').toString());
        }
    }

    final static lk a(byte[] param0, byte param1) {
        int var2_int = 0;
        RuntimeException var2 = null;
        lk var3 = null;
        lk stackIn_4_0 = null;
        RuntimeException stackIn_7_0 = null;
        StringBuilder stackIn_7_1 = null;
        String stackIn_8_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          if (param0 == null) {
            return null;
          }
          var2_int = -11 % ((29 - param1) / 41);
          var3 = new lk(param0, fc.field_d, field_H, gg.field_d, gh.field_C, og.field_c);
          rc.b((byte) -49);
          stackIn_4_0 = var3;
          return stackIn_4_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2 = decompiledCaughtException;
          stackIn_7_0 = var2;
          stackIn_7_1 = new StringBuilder().append("qd.VA(");
          if (param0 == null) {
            stackIn_8_2 = "null";
          } else {
            stackIn_8_2 = "{...}";
          }
          throw sd.a((Throwable) ((Object) stackIn_7_0), ((StringBuilder) (Object) stackIn_7_1).append(stackIn_8_2).append(',').append(param1).append(')').toString());
        }
    }

    static {
        field_E = new int[6];
        field_y = "Your shield will automatically deflect any single contact with an enemy or bullet, after which, it needs time to recharge.";
        field_C = "Account created successfully!";
        field_D = new o(2, 4, 4, 0);
        field_z = Math.atan2(1.0, 0.0);
        field_B = "Warning: if you quit, you will lose any game you are in the middle of!";
    }
}
