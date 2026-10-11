/*
 * Decompiled by CFR-JS 0.4.0.
 */
import java.util.*;

class tg extends fi {
    boolean field_z;
    static wg field_D;
    static int[] field_A;
    private boolean field_E;
    static String field_y;
    private boolean field_B;
    static int field_x;
    boolean field_C;

    tg(String param0, ol param1, cd param2) {
        super(param0, param1, param2);
        this.field_E = false;
        this.field_B = true;
        this.field_C = true;
    }

    final void c(int param0) {
        if (param0 != -1) {
          return;
        }
        if (!this.field_E) {
          return;
        }
        this.field_E = false;
        if (this.field_o == null) {
          return;
        }
        if (this.field_o instanceof t) {
          ((t) (this.field_o)).a(this.field_E, (fi) (this), 97);
          return;
        }
    }

    void a(int param0, int param1, fi param2, int param3) {
        try {
          super.a(param0, 125, param2, param3);
          if (param1 <= 113) {
            this.c(-62);
          }
          if (this.field_i != 0) {
            if (this.field_i == j.field_e) {
              return;
            }
            if (this.a(param3, nl.field_u, hk.field_Jb, (byte) 79, param0) &&
              j.field_e == 0) {
              this.b((byte) 48, this.field_i, -param3 + hk.field_Jb, nl.field_u - param0);
            }
            this.a(hk.field_Jb, nl.field_u, param0, param2, param3, 99);
          }
        } catch (RuntimeException runtimeException) {
          throw kg.a((Throwable) ((Object) runtimeException), "tg.E(" + param0 + ',' + param1 + ',' + (param2 != null ? "{...}" : "null") + ',' + param3 + ')');
        }
    }

    void b(byte param0, int param1, int param2, int param3) {
        int var5 = 0;
        int var5Lifetime1;
        int var5Lifetime2;
        if (null == this.field_o) {
          var5 = 61 / ((param0 + 33) / 42);
          return;
        }
        if (this.field_o instanceof ta) {
          ((ta) (this.field_o)).a(12085, this, param1, param2, param3);
          var5Lifetime1 = 61 / ((param0 + 33) / 42);
          return;
        }
        var5Lifetime2 = 61 / ((param0 + 33) / 42);
    }

    final boolean f(boolean param0) {
        if (!param0) {
          tg.a((byte) 76);
          return this.field_E;
        }
        return this.field_E;
    }

    final void a(int param0, int param1, int param2, fi param3, int param4, int param5) {
        RuntimeException var7 = null;
        StringBuilder var8 = null;
        RuntimeException stackIn_8_0 = null;
        StringBuilder stackIn_8_1 = null;
        String stackIn_9_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          if (null != this.field_o &&
            this.field_o instanceof pk) {
            ((pk) (this.field_o)).a(param0, param1, param4, -20637, this, param2);
          }
          this.field_i = 0;
          if (param5 >= 73) {
            return;
          }
          var8 = (StringBuilder) null;
          this.a((Hashtable) null, (byte) 73, -4, (StringBuilder) null);
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var7 = decompiledCaughtException;
          stackIn_8_0 = var7;
          stackIn_8_1 = new StringBuilder().append("tg.JA(").append(param0).append(',').append(param1).append(',').append(param2).append(',');
          if (param3 == null) {
            stackIn_9_2 = "null";
          } else {
            stackIn_9_2 = "{...}";
          }
          throw kg.a((Throwable) ((Object) stackIn_8_0), ((StringBuilder) (Object) stackIn_8_1).append(stackIn_9_2).append(',').append(param4).append(',').append(param5).append(')').toString());
        }
    }

    boolean a(fi param0, int param1) {
        RuntimeException var3 = null;
        RuntimeException stackIn_16_0 = null;
        StringBuilder stackIn_16_1 = null;
        String stackIn_17_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          if (!this.field_C) {
            return false;
          }
          if (!this.field_B) {
            return false;
          }
          param0.c(-1);
          if (param1 != -8515) {
            return true;
          }
          this.field_E = true;
          if (this.field_o != null &&
            this.field_o instanceof t) {
            ((t) (this.field_o)).a(this.field_E, (fi) (this), 91);
          }
          return true;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3 = decompiledCaughtException;
          stackIn_16_0 = var3;
          stackIn_16_1 = new StringBuilder().append("tg.G(");
          if (param0 == null) {
            stackIn_17_2 = "null";
          } else {
            stackIn_17_2 = "{...}";
          }
          throw kg.a((Throwable) ((Object) stackIn_16_0), ((StringBuilder) (Object) stackIn_16_1).append(stackIn_17_2).append(',').append(param1).append(')').toString());
        }
    }

    final StringBuilder a(Hashtable param0, byte param1, int param2, StringBuilder param3) {
        StringBuilder discarded$2 = null;
        StringBuilder discarded$3 = null;
        RuntimeException var5 = null;
        StringBuilder stackIn_9_0 = null;
        RuntimeException stackIn_12_0 = null;
        StringBuilder stackIn_12_1 = null;
        String stackIn_13_2 = null;
        StringBuilder stackIn_15_1 = null;
        String stackIn_16_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          if (this.a(param0, param2, 34, param3)) {
            this.a(param2, param0, (byte) 126, param3);
            if (this.field_z) {
              discarded$2 = param3.append(" active");
            }
            if (!this.field_C) {
              discarded$3 = param3.append(" disabled");
            }
          }
          if (param1 < 118) {
            this.field_z = true;
          }
          stackIn_9_0 = (StringBuilder) (param3);
          return stackIn_9_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var5 = decompiledCaughtException;
          stackIn_12_0 = var5;
          stackIn_12_1 = new StringBuilder().append("tg.MA(");
          if (param0 == null) {
            stackIn_13_2 = "null";
          } else {
            stackIn_13_2 = "{...}";
          }
          stackIn_15_1 = ((StringBuilder) (Object) stackIn_12_1).append(stackIn_13_2).append(',').append(param1).append(',').append(param2).append(',');
          if (param3 == null) {
            stackIn_16_2 = "null";
          } else {
            stackIn_16_2 = "{...}";
          }
          throw kg.a((Throwable) ((Object) stackIn_12_0), ((StringBuilder) (Object) stackIn_15_1).append(stackIn_16_2).append(')').toString());
        }
    }

    public static void a(byte param0) {
        if (param0 >= -51) {
          return;
        }
        field_y = null;
        field_A = null;
        field_D = null;
    }

    boolean a(fi param0, int param1, boolean param2, int param3, int param4, int param5, int param6) {
        RuntimeException var8 = null;
        RuntimeException stackIn_15_0 = null;
        StringBuilder stackIn_15_1 = null;
        String stackIn_16_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          if (this.field_C &&
            this.a(param5, param6, param4, (byte) 58, param3)) {
            this.a(param0, -8515);
            this.field_i = param1;
            if (this.field_o != null) {
              if (!(this.field_o instanceof pk)) {
                return true;
              }
              ((pk) (this.field_o)).a(param1, this, param6, param4, (byte) 111, param5, param3);
            }
            return true;
          }
          if (param2) {
            field_y = (String) null;
          }
          return false;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var8 = decompiledCaughtException;
          stackIn_15_0 = var8;
          stackIn_15_1 = new StringBuilder().append("tg.NA(");
          if (param0 == null) {
            stackIn_16_2 = "null";
          } else {
            stackIn_16_2 = "{...}";
          }
          throw kg.a((Throwable) ((Object) stackIn_15_0), ((StringBuilder) (Object) stackIn_15_1).append(stackIn_16_2).append(',').append(param1).append(',').append(param2).append(',').append(param3).append(',').append(param4).append(',').append(param5).append(',').append(param6).append(')').toString());
        }
    }

    tg(String param0, cd param1) {
        this(param0, vi.field_g.field_l, param1);
    }

    boolean a(fi param0, char param1, int param2, int param3) {
        int var5_int = 0;
        RuntimeException var5 = null;
        RuntimeException stackIn_10_0 = null;
        StringBuilder stackIn_10_1 = null;
        String stackIn_11_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          var5_int = -117 % ((-75 - param3) / 36);
          if (this.f(true) && (84 == param2 ||
            83 == param2)) {
            this.b((byte) -97, 1, -1, -1);
            return true;
          }
          return false;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var5 = decompiledCaughtException;
          stackIn_10_0 = var5;
          stackIn_10_1 = new StringBuilder().append("tg.AA(");
          if (param0 == null) {
            stackIn_11_2 = "null";
          } else {
            stackIn_11_2 = "{...}";
          }
          throw kg.a((Throwable) ((Object) stackIn_10_0), ((StringBuilder) (Object) stackIn_10_1).append(stackIn_11_2).append(',').append(param1).append(',').append(param2).append(',').append(param3).append(')').toString());
        }
    }

    protected tg() {
        this.field_E = false;
        this.field_B = true;
        this.field_C = true;
        this.field_w = vi.field_g.field_b;
    }

    static {
        field_x = 0;
        field_y = "Withdraw request to join <%0>'s game";
    }
}
