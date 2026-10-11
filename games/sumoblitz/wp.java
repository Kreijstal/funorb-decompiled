/*
 * Decompiled by CFR-JS 0.4.0.
 */
import java.util.*;

class wp extends pk {
    int field_B;
    static String field_A;
    private boolean field_y;
    private boolean field_D;
    boolean field_C;
    static boolean[] field_z;
    boolean field_x;

    boolean a(pk param0, byte param1) {
        RuntimeException var3 = null;
        RuntimeException stackIn_15_0 = null;
        StringBuilder stackIn_15_1 = null;
        String stackIn_16_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          if (!this.field_x) {
            return false;
          }
          if (!this.field_y) {
            return false;
          }
          param0.c((byte) 122);
          if (param1 != 61) {
            return true;
          }
          this.field_D = true;
          if (this.field_o != null &&
            this.field_o instanceof fc) {
            ((fc) (this.field_o)).a(this.field_D, (pk) (this), -112);
          }
          return true;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3 = decompiledCaughtException;
          stackIn_15_0 = var3;
          stackIn_15_1 = new StringBuilder().append("wp.Q(");
          if (param0 == null) {
            stackIn_16_2 = "null";
          } else {
            stackIn_16_2 = "{...}";
          }
          throw qo.a((Throwable) ((Object) stackIn_15_0), ((StringBuilder) (Object) stackIn_15_1).append(stackIn_16_2).append(',').append(param1).append(')').toString());
        }
    }

    final void c(byte param0) {
        int var2 = 61 / ((param0 - 64) / 51);
        if (!this.field_D) {
          return;
        }
        this.field_D = false;
        if (null == this.field_o) {
          return;
        }
        if (!(this.field_o instanceof fc)) {
          return;
        }
        ((fc) (this.field_o)).a(this.field_D, (pk) (this), -76);
    }

    boolean a(pk param0, char param1, byte param2, int param3) {
        RuntimeException var5 = null;
        RuntimeException stackIn_12_0 = null;
        StringBuilder stackIn_12_1 = null;
        String stackIn_13_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          if (param2 < 9) {
            this.c((byte) -47);
          }
          if (!this.d(-1)) {
            return false;
          }
          if (param3 != 84 &&
            param3 != 83) {
            return false;
          }
          this.b(1, -1, true, -1);
          return true;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var5 = decompiledCaughtException;
          stackIn_12_0 = var5;
          stackIn_12_1 = new StringBuilder().append("wp.KA(");
          if (param0 == null) {
            stackIn_13_2 = "null";
          } else {
            stackIn_13_2 = "{...}";
          }
          throw qo.a((Throwable) ((Object) stackIn_12_0), ((StringBuilder) (Object) stackIn_12_1).append(stackIn_13_2).append(',').append(param1).append(',').append(param2).append(',').append(param3).append(')').toString());
        }
    }

    wp(int param0, int param1, int param2, int param3, mh param4, qm param5) {
        super(param0, param1, param2, param3, param4, param5);
        this.field_D = false;
        this.field_B = 0;
        this.field_y = true;
        this.field_x = true;
    }

    final static f a(fr param0, int param1, int param2, byte[] param3, boolean param4, int param5, int param6, int param7) {
        RuntimeException var8 = null;
        f stackIn_7_0 = null;
        f stackIn_10_0 = null;
        f stackIn_12_0 = null;
        RuntimeException stackIn_15_0 = null;
        StringBuilder stackIn_15_1 = null;
        String stackIn_16_2 = null;
        StringBuilder stackIn_18_1 = null;
        String stackIn_19_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          if (param6 <= 105) {
            wp.a((byte) 46);
          }
          if (!param0.field_Cc && (!rm.a(param2, -105) ||
            !rm.a(param1, -103))) {
            if (param0.field_C) {
              stackIn_12_0 = new f(param0, 34037, param5, param2, param1, param4, param3, param7);
              return stackIn_12_0;
            }
            stackIn_10_0 = new f(param0, param5, param2, param1, hn.a(false, param2), hn.a(false, param1), param3, param7);
            return stackIn_10_0;
          }
          stackIn_7_0 = new f(param0, 3553, param5, param2, param1, param4, param3, param7);
          return stackIn_7_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var8 = decompiledCaughtException;
          stackIn_15_0 = var8;
          stackIn_15_1 = new StringBuilder().append("wp.K(");
          if (param0 == null) {
            stackIn_16_2 = "null";
          } else {
            stackIn_16_2 = "{...}";
          }
          stackIn_18_1 = ((StringBuilder) (Object) stackIn_15_1).append(stackIn_16_2).append(',').append(param1).append(',').append(param2).append(',');
          if (param3 == null) {
            stackIn_19_2 = "null";
          } else {
            stackIn_19_2 = "{...}";
          }
          throw qo.a((Throwable) ((Object) stackIn_15_0), ((StringBuilder) (Object) stackIn_18_1).append(stackIn_19_2).append(',').append(param4).append(',').append(param5).append(',').append(param6).append(',').append(param7).append(')').toString());
        }
    }

    wp(String param0, qm param1) {
        this(param0, ks.field_x.field_h, param1);
    }

    final void a(pk param0, boolean param1, int param2, int param3, int param4, int param5) {
        if (param1) {
          return;
        }
        try {
          if (null != this.field_o &&
            this.field_o instanceof wu) {
            ((wu) (this.field_o)).a(param5, param2, param3, param4, this, -21726);
          }
          this.field_l = 0;
        } catch (RuntimeException runtimeException) {
          throw qo.a((Throwable) ((Object) runtimeException), "wp.T(" + (param0 != null ? "{...}" : "null") + ',' + param1 + ',' + param2 + ',' + param3 + ',' + param4 + ',' + param5 + ')');
        }
    }

    boolean a(pk param0, int param1, int param2, int param3, int param4, int param5, int param6) {
        RuntimeException var8 = null;
        pk var9 = null;
        RuntimeException stackIn_15_0 = null;
        StringBuilder stackIn_15_1 = null;
        String stackIn_16_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          if (param1 > -42) {
            var9 = (pk) null;
            this.a((pk) null, 108, 43, 75, 47, -24, -60);
          }
          if (!this.field_x) {
            return false;
          }
          if (!this.b(param5, -1, param4, param2, param6)) {
            return false;
          }
          this.a(param0, (byte) 61);
          this.field_l = param3;
          if (null != this.field_o &&
            this.field_o instanceof wu) {
            ((wu) (this.field_o)).a(param5, param3, param4, this, param2, param6, false);
          }
          return true;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var8 = decompiledCaughtException;
          stackIn_15_0 = var8;
          stackIn_15_1 = new StringBuilder().append("wp.R(");
          if (param0 == null) {
            stackIn_16_2 = "null";
          } else {
            stackIn_16_2 = "{...}";
          }
          throw qo.a((Throwable) ((Object) stackIn_15_0), ((StringBuilder) (Object) stackIn_15_1).append(stackIn_16_2).append(',').append(param1).append(',').append(param2).append(',').append(param3).append(',').append(param4).append(',').append(param5).append(',').append(param6).append(')').toString());
        }
    }

    final StringBuilder a(int param0, Hashtable param1, StringBuilder param2, int param3) {
        StringBuilder discarded$2 = null;
        StringBuilder discarded$3 = null;
        RuntimeException var5 = null;
        StringBuilder stackIn_8_0 = null;
        RuntimeException stackIn_11_0 = null;
        StringBuilder stackIn_11_1 = null;
        String stackIn_12_2 = null;
        StringBuilder stackIn_14_1 = null;
        String stackIn_15_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          if (this.a(param0, param1, -121, param2)) {
            this.a(param0, (byte) -128, param2, param1);
            if (this.field_C) {
              discarded$2 = param2.append(" active");
            }
            if (!this.field_x) {
              discarded$3 = param2.append(" disabled");
            }
          }
          if (param3 != 0) {
            this.field_B = 96;
          }
          stackIn_8_0 = (StringBuilder) (param2);
          return stackIn_8_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var5 = decompiledCaughtException;
          stackIn_11_0 = var5;
          stackIn_11_1 = new StringBuilder().append("wp.S(").append(param0).append(',');
          if (param1 == null) {
            stackIn_12_2 = "null";
          } else {
            stackIn_12_2 = "{...}";
          }
          stackIn_14_1 = ((StringBuilder) (Object) stackIn_11_1).append(stackIn_12_2).append(',');
          if (param2 == null) {
            stackIn_15_2 = "null";
          } else {
            stackIn_15_2 = "{...}";
          }
          throw qo.a((Throwable) ((Object) stackIn_11_0), ((StringBuilder) (Object) stackIn_14_1).append(stackIn_15_2).append(',').append(param3).append(')').toString());
        }
    }

    void a(int param0, int param1, pk param2, int param3) {
        try {
          int var5_int = -37 % ((-25 - param1) / 45);
          super.a(param0, 49, param2, param3);
          this.field_B = 0;
          if (this.field_l != 0) {
            if (this.field_l == ar.field_G) {
              return;
            }
            if (this.b(ko.field_p, -1, param0, pi.field_e, param3) &&
              0 == ar.field_G) {
              this.b(this.field_l, ko.field_p - param0, true, pi.field_e - param3);
            }
            this.a(param2, false, param0, pi.field_e, ko.field_p, param3);
          }
        } catch (RuntimeException runtimeException) {
          throw qo.a((Throwable) ((Object) runtimeException), "wp.U(" + param0 + ',' + param1 + ',' + (param2 != null ? "{...}" : "null") + ',' + param3 + ')');
        }
    }

    public static void a(byte param0) {
        field_z = null;
        field_A = null;
        int var1 = 124 % ((param0 + 16) / 53);
    }

    wp(String param0, mh param1, qm param2) {
        super(param0, param1, param2);
        this.field_D = false;
        this.field_B = 0;
        this.field_y = true;
        this.field_x = true;
    }

    final boolean d(int param0) {
        if (param0 != -1) {
          this.field_x = false;
          return this.field_D;
        }
        return this.field_D;
    }

    void b(int param0, int param1, boolean param2, int param3) {
        this.field_B = param0;
        if (this.field_o != null) {
          if (!(this.field_o instanceof ai)) {
            if (!param2) {
              this.field_y = true;
              return;
            }
            return;
          }
          ((ai) (this.field_o)).a(param0, 710, this, param1, param3);
        }
        if (param2) {
          return;
        }
        this.field_y = true;
    }

    public wp() {
        this.field_D = false;
        this.field_B = 0;
        this.field_y = true;
        this.field_x = true;
        this.field_w = ks.field_x.field_n;
    }

    static {
        field_A = "Return to main menu";
        field_z = new boolean[64];
    }
}
