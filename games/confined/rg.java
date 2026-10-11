/*
 * Decompiled by CFR-JS 0.4.0.
 */
import java.util.*;

class rg extends fj {
    private boolean field_H;
    static int field_M;
    boolean field_L;
    boolean field_O;
    static String field_J;
    static boolean field_K;
    static int[] field_I;
    private boolean field_N;

    boolean a(int param0, int param1, byte param2, int param3, fj param4, int param5, int param6) {
        RuntimeException var8 = null;
        RuntimeException stackIn_13_0 = null;
        StringBuilder stackIn_13_1 = null;
        String stackIn_14_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          if (param2 != 91) {
            rg.g((byte) 85);
          }
          if (this.field_L &&
            this.a(param1, (byte) 126, param0, param5, param3)) {
            this.a(param4, 418);
            this.field_o = param6;
            if (this.field_t != null &&
              this.field_t instanceof nc) {
              ((nc) (this.field_t)).a(param0, param5, this, param3, (byte) -115, param1, param6);
            }
            return true;
          }
          return false;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var8 = decompiledCaughtException;
          stackIn_13_0 = var8;
          stackIn_13_1 = new StringBuilder().append("rg.AA(").append(param0).append(',').append(param1).append(',').append(param2).append(',').append(param3).append(',');
          if (param4 == null) {
            stackIn_14_2 = "null";
          } else {
            stackIn_14_2 = "{...}";
          }
          throw sd.a((Throwable) ((Object) stackIn_13_0), ((StringBuilder) (Object) stackIn_13_1).append(stackIn_14_2).append(',').append(param5).append(',').append(param6).append(')').toString());
        }
    }

    void a(int param0, int param1, int param2, int param3) {
        if (param0 != 25124) {
          return;
        }
        if (null == this.field_t) {
          return;
        }
        if (this.field_t instanceof el) {
          ((el) (this.field_t)).a(98, param3, param1, this, param2);
          return;
        }
    }

    rg(String param0, uk param1) {
        this(param0, bg.field_d.field_h, param1);
    }

    boolean a(fj param0, int param1) {
        RuntimeException var3 = null;
        RuntimeException stackIn_14_0 = null;
        StringBuilder stackIn_14_1 = null;
        String stackIn_15_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          if (this.field_L &&
            this.field_N) {
            param0.b(param1 - 334);
            if (param1 != 418) {
              field_M = 32;
            }
            this.field_H = true;
            if (null != this.field_t &&
              this.field_t instanceof vi) {
              ((vi) (this.field_t)).a((fj) (this), this.field_H, (byte) -85);
            }
            return true;
          }
          return false;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3 = decompiledCaughtException;
          stackIn_14_0 = var3;
          stackIn_14_1 = new StringBuilder().append("rg.I(");
          if (param0 == null) {
            stackIn_15_2 = "null";
          } else {
            stackIn_15_2 = "{...}";
          }
          throw sd.a((Throwable) ((Object) stackIn_14_0), ((StringBuilder) (Object) stackIn_14_1).append(stackIn_15_2).append(',').append(param1).append(')').toString());
        }
    }

    public static void g(byte param0) {
        if (param0 != 17) {
          return;
        }
        field_J = null;
        field_I = null;
    }

    final StringBuilder a(StringBuilder param0, int param1, Hashtable param2, boolean param3) {
        StringBuilder discarded$2 = null;
        StringBuilder discarded$3 = null;
        RuntimeException var5 = null;
        StringBuilder stackIn_10_0 = null;
        RuntimeException stackIn_13_0 = null;
        StringBuilder stackIn_13_1 = null;
        String stackIn_14_2 = null;
        StringBuilder stackIn_16_1 = null;
        String stackIn_17_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          if (this.a((byte) -13, param1, param2, param0)) {
            this.a(param0, param2, (byte) -63, param1);
            if (this.field_O) {
              discarded$2 = param0.append(" active");
            }
            if (!this.field_L) {
              discarded$3 = param0.append(" disabled");
            }
          }
          if (param3) {
            this.e((byte) 17);
          }
          stackIn_10_0 = (StringBuilder) (param0);
          return stackIn_10_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var5 = decompiledCaughtException;
          stackIn_13_0 = var5;
          stackIn_13_1 = new StringBuilder().append("rg.O(");
          if (param0 == null) {
            stackIn_14_2 = "null";
          } else {
            stackIn_14_2 = "{...}";
          }
          stackIn_16_1 = ((StringBuilder) (Object) stackIn_13_1).append(stackIn_14_2).append(',').append(param1).append(',');
          if (param2 == null) {
            stackIn_17_2 = "null";
          } else {
            stackIn_17_2 = "{...}";
          }
          throw sd.a((Throwable) ((Object) stackIn_13_0), ((StringBuilder) (Object) stackIn_16_1).append(stackIn_17_2).append(',').append(param3).append(')').toString());
        }
    }

    void a(fj param0, int param1, int param2, int param3) {
        try {
          super.a(param0, param1, param2, param3);
          if (0 != this.field_o) {
            if (this.field_o == Confined.field_I) {
              return;
            }
            if (this.a(ld.field_l, (byte) 124, param2, jh.field_R, param3) &&
              Confined.field_I == 0) {
              this.a(25124, jh.field_R - param3, ld.field_l - param2, this.field_o);
            }
            this.a(-38, param3, ld.field_l, param0, jh.field_R, param2);
          }
        } catch (RuntimeException runtimeException) {
          throw sd.a((Throwable) ((Object) runtimeException), "rg.V(" + (param0 != null ? "{...}" : "null") + ',' + param1 + ',' + param2 + ',' + param3 + ')');
        }
    }

    rg(String param0, fe param1, uk param2) {
        super(param0, param1, param2);
        this.field_L = true;
        this.field_H = false;
        this.field_N = true;
    }

    final void b(int param0) {
        if (param0 != 84) {
          this.field_H = true;
          if (!this.field_H) {
            return;
          }
          this.field_H = false;
          if (this.field_t == null) {
            return;
          }
          if (this.field_t instanceof vi) {
            ((vi) (this.field_t)).a((fj) (this), this.field_H, (byte) -110);
            return;
          }
          return;
        }
        if (!this.field_H) {
          return;
        }
        this.field_H = false;
        if (this.field_t == null) {
          return;
        }
        if (this.field_t instanceof vi) {
          ((vi) (this.field_t)).a((fj) (this), this.field_H, (byte) -110);
          return;
        }
    }

    boolean a(fj param0, byte param1, int param2, char param3) {
        int var5_int = 0;
        RuntimeException var5 = null;
        RuntimeException stackIn_10_0 = null;
        StringBuilder stackIn_10_1 = null;
        String stackIn_11_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          if (this.e((byte) 60) && (param2 == 84 ||
            param2 == 83)) {
            this.a(25124, -1, -1, 1);
            return true;
          }
          var5_int = 0 / ((47 - param1) / 43);
          return false;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var5 = decompiledCaughtException;
          stackIn_10_0 = var5;
          stackIn_10_1 = new StringBuilder().append("rg.Q(");
          if (param0 == null) {
            stackIn_11_2 = "null";
          } else {
            stackIn_11_2 = "{...}";
          }
          throw sd.a((Throwable) ((Object) stackIn_10_0), ((StringBuilder) (Object) stackIn_10_1).append(stackIn_11_2).append(',').append(param1).append(',').append(param2).append(',').append(param3).append(')').toString());
        }
    }

    final boolean e(byte param0) {
        int var2 = -119 % ((param0 + 74) / 49);
        return this.field_H;
    }

    final void a(int param0, int param1, int param2, fj param3, int param4, int param5) {
        try {
          if (param0 >= -18) {
            fj var8 = (fj) null;
            this.a((fj) null, 87, -34, -5);
          }
          if (this.field_t != null &&
            this.field_t instanceof nc) {
            ((nc) (this.field_t)).a(this, -126, param2, param1, param4, param5);
          }
          this.field_o = 0;
        } catch (RuntimeException runtimeException) {
          throw sd.a((Throwable) ((Object) runtimeException), "rg.K(" + param0 + ',' + param1 + ',' + param2 + ',' + (param3 != null ? "{...}" : "null") + ',' + param4 + ',' + param5 + ')');
        }
    }

    protected rg() {
        this.field_L = true;
        this.field_H = false;
        this.field_N = true;
        this.field_n = bg.field_d.field_w;
    }

    static {
        field_J = "Mouse over an icon for details";
    }
}
