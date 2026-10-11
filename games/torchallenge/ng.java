/*
 * Decompiled by CFR-JS 0.4.0.
 */
import java.util.*;

class ng extends ee {
    static cf field_A;
    boolean field_F;
    private boolean field_B;
    boolean field_D;
    private boolean field_M;
    static String field_E;
    static p field_C;
    private static int[] field_N;
    static int field_I;
    private static int[] field_G;
    static int[] field_H;
    static ka[] field_L;
    static int[] field_K;
    static String field_J;

    boolean a(ee param0, int param1) {
        RuntimeException var3 = null;
        RuntimeException stackIn_15_0 = null;
        StringBuilder stackIn_15_1 = null;
        String stackIn_16_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          if (param1 != 0) {
            this.a(24, 47, -94, 79);
          }
          if (this.field_F &&
            this.field_M) {
            param0.d(6064);
            this.field_B = true;
            if (this.field_k != null) {
              if (!(this.field_k instanceof mk)) {
                return true;
              }
              ((mk) (this.field_k)).a((ee) (this), this.field_B, (byte) -74);
            }
            return true;
          }
          return false;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3 = decompiledCaughtException;
          stackIn_15_0 = var3;
          stackIn_15_1 = new StringBuilder().append("ng.RA(");
          if (param0 == null) {
            stackIn_16_2 = "null";
          } else {
            stackIn_16_2 = "{...}";
          }
          throw oj.a((Throwable) ((Object) stackIn_15_0), ((StringBuilder) (Object) stackIn_15_1).append(stackIn_16_2).append(',').append(param1).append(')').toString());
        }
    }

    boolean a(int param0, char param1, byte param2, ee param3) {
        RuntimeException var5 = null;
        RuntimeException stackIn_13_0 = null;
        StringBuilder stackIn_13_1 = null;
        String stackIn_14_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          if (param2 <= 9) {
            return false;
          }
          if (!this.c(86)) {
            return false;
          }
          if (param0 != 84 &&
            param0 != 83) {
            return false;
          }
          this.a(-1, -13461, -1, 1);
          return true;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var5 = decompiledCaughtException;
          stackIn_13_0 = var5;
          stackIn_13_1 = new StringBuilder().append("ng.E(").append(param0).append(',').append(param1).append(',').append(param2).append(',');
          if (param3 == null) {
            stackIn_14_2 = "null";
          } else {
            stackIn_14_2 = "{...}";
          }
          throw oj.a((Throwable) ((Object) stackIn_13_0), ((StringBuilder) (Object) stackIn_13_1).append(stackIn_14_2).append(')').toString());
        }
    }

    ng(String param0, gg param1) {
        this(param0, kl.field_e.field_f, param1);
    }

    final boolean c(int param0) {
        if (param0 > 76) {
          return this.field_B;
        }
        ee var3 = (ee) null;
        this.a(54, -80, 117, 118, -114, 23, (ee) null);
        return this.field_B;
    }

    void a(ee param0, int param1, byte param2, int param3) {
        super.a(param0, param1, (byte) -112, param3);
        if (param2 >= -97) {
          return;
        }
        try {
          if (this.field_z != 0 &&
            this.field_z != wh.field_e) {
            if (this.a(ph.field_d, kc.field_u, param3, -29991, param1) &&
              wh.field_e == 0) {
              this.a(-param3 + ph.field_d, -13461, kc.field_u - param1, this.field_z);
            }
            this.a(param3, (byte) 119, param0, param1, kc.field_u, ph.field_d);
          }
        } catch (RuntimeException runtimeException) {
          throw oj.a((Throwable) ((Object) runtimeException), "ng.U(" + (param0 != null ? "{...}" : "null") + ',' + param1 + ',' + param2 + ',' + param3 + ')');
        }
    }

    boolean a(int param0, int param1, int param2, int param3, int param4, int param5, ee param6) {
        RuntimeException var8 = null;
        RuntimeException stackIn_14_0 = null;
        StringBuilder stackIn_14_1 = null;
        String stackIn_15_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          if (param2 != -81) {
            this.c(43);
          }
          if (!this.field_F) {
            return false;
          }
          if (!this.a(param0, param1, param3, -29991, param4)) {
            return false;
          }
          this.a(param6, 0);
          this.field_z = param5;
          if (null != this.field_k &&
            this.field_k instanceof pb) {
            ((pb) (this.field_k)).a(param3, param1, (byte) -1, param0, this, param4, param5);
          }
          return true;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var8 = decompiledCaughtException;
          stackIn_14_0 = var8;
          stackIn_14_1 = new StringBuilder().append("ng.CA(").append(param0).append(',').append(param1).append(',').append(param2).append(',').append(param3).append(',').append(param4).append(',').append(param5).append(',');
          if (param6 == null) {
            stackIn_15_2 = "null";
          } else {
            stackIn_15_2 = "{...}";
          }
          throw oj.a((Throwable) ((Object) stackIn_14_0), ((StringBuilder) (Object) stackIn_14_1).append(stackIn_15_2).append(')').toString());
        }
    }

    final void a(int param0, byte param1, ee param2, int param3, int param4, int param5) {
        try {
          if (null != this.field_k &&
            this.field_k instanceof pb) {
            ((pb) (this.field_k)).a(param5, true, param4, this, param3, param0);
          }
          this.field_z = 0;
          int var7_int = 94 / ((-29 - param1) / 39);
        } catch (RuntimeException runtimeException) {
          throw oj.a((Throwable) ((Object) runtimeException), "ng.Q(" + param0 + ',' + param1 + ',' + (param2 != null ? "{...}" : "null") + ',' + param3 + ',' + param4 + ',' + param5 + ')');
        }
    }

    final StringBuilder a(Hashtable param0, int param1, StringBuilder param2, boolean param3) {
        StringBuilder discarded$2 = null;
        StringBuilder discarded$3 = null;
        RuntimeException var5 = null;
        StringBuilder stackIn_11_0 = null;
        RuntimeException stackIn_14_0 = null;
        StringBuilder stackIn_14_1 = null;
        String stackIn_15_2 = null;
        StringBuilder stackIn_17_1 = null;
        String stackIn_18_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          if (!param3) {
            field_I = 125;
          }
          if (this.a(param0, param1, -126, param2)) {
            this.a(param2, -125, param0, param1);
            if (this.field_D) {
              discarded$2 = param2.append(" active");
            }
            if (!this.field_F) {
              discarded$3 = param2.append(" disabled");
            }
          }
          stackIn_11_0 = (StringBuilder) (param2);
          return stackIn_11_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var5 = decompiledCaughtException;
          stackIn_14_0 = var5;
          stackIn_14_1 = new StringBuilder().append("ng.W(");
          if (param0 == null) {
            stackIn_15_2 = "null";
          } else {
            stackIn_15_2 = "{...}";
          }
          stackIn_17_1 = ((StringBuilder) (Object) stackIn_14_1).append(stackIn_15_2).append(',').append(param1).append(',');
          if (param2 == null) {
            stackIn_18_2 = "null";
          } else {
            stackIn_18_2 = "{...}";
          }
          throw oj.a((Throwable) ((Object) stackIn_14_0), ((StringBuilder) (Object) stackIn_17_1).append(stackIn_18_2).append(',').append(param3).append(')').toString());
        }
    }

    ng(String param0, j param1, gg param2) {
        super(param0, param1, param2);
        this.field_F = true;
        this.field_B = false;
        this.field_M = true;
    }

    void a(int param0, int param1, int param2, int param3) {
        if (param1 != -13461) {
          field_N = (int[]) null;
          if (this.field_k != null) {
            if (this.field_k instanceof sg) {
              ((sg) (this.field_k)).a(this, param2, param0, param3, false);
            }
            return;
          }
          return;
        }
        if (this.field_k == null) {
          return;
        }
        if (this.field_k instanceof sg) {
          ((sg) (this.field_k)).a(this, param2, param0, param3, false);
          return;
        }
    }

    final void d(int param0) {
        if (param0 != 6064) {
          ng.c(true);
          if (!this.field_B) {
            return;
          }
          this.field_B = false;
          if (this.field_k == null) {
            return;
          }
          if (this.field_k instanceof mk) {
            ((mk) (this.field_k)).a((ee) (this), this.field_B, (byte) -54);
            return;
          }
          return;
        }
        if (!this.field_B) {
          return;
        }
        this.field_B = false;
        if (this.field_k == null) {
          return;
        }
        if (this.field_k instanceof mk) {
          ((mk) (this.field_k)).a((ee) (this), this.field_B, (byte) -54);
          return;
        }
    }

    public static void c(boolean param0) {
        field_J = null;
        field_N = null;
        field_G = null;
        field_L = null;
        if (param0) {
          field_A = null;
          field_H = null;
          field_C = null;
          field_E = null;
          field_K = null;
          return;
        }
    }

    protected ng() {
        this.field_F = true;
        this.field_B = false;
        this.field_M = true;
        this.field_q = kl.field_e.field_i;
    }

    static {
        field_A = new cf();
        field_E = "Names cannot start or end with space or underscore";
        field_C = new p();
        field_G = new int[]{127, 127, 127, 127, 127, 127};
        field_N = new int[]{255, 255, 255, 255, 255, 255};
        field_H = new int[]{-field_G[0] + field_N[0] >> 1, field_N[1] - field_G[1] >> 1, -field_G[2] + field_N[2] >> 1, field_N[3] - field_G[3] >> 1, -field_G[4] + field_N[4] >> 1, -field_G[5] + field_N[5] >> 1};
        field_J = "Warning: if you quit, you will lose any game you are in the middle of!";
        field_K = new int[]{field_G[0] + field_N[0] >> 1, field_N[1] + field_G[1] >> 1, field_N[2] + field_G[2] >> 1, field_N[3] + field_G[3] >> 1, field_G[4] + field_N[4] >> 1, field_G[5] + field_N[5] >> 1};
    }
}
