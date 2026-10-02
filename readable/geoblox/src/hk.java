/*
 * Decompiled by CFR-JS 0.4.0.
 */
import java.util.*;

class hk extends el {
    boolean field_y;
    static ei field_C;
    static int field_B;
    private boolean field_z;
    boolean field_D;
    static nd field_x;
    private boolean field_A;

    boolean a(int param0, int param1, int param2, int param3, int param4, int param5, el param6) {
        int var8_int = 0;
        RuntimeException var8 = null;
        RuntimeException stackIn_13_0 = null;
        StringBuilder stackIn_13_1 = null;
        RuntimeException stackIn_14_0 = null;
        StringBuilder stackIn_14_1 = null;
        String stackIn_14_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          if (this.field_D) {
            if (this.a(param4, -1, param5, param0, param2)) {
              this.a((byte) -116, param6);
              this.field_f = param3;
              if (null != this.field_u) {
                if (!(this.field_u instanceof ti)) {
                  return true;
                }
                ((ti) ((Object) this.field_u)).a(param0, -30896, param2, param4, (hk) (this), param3, param5);
              }
              return true;
            }
          }
          var8_int = 4 / ((param1 + 3) / 38);
          return false;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var8 = decompiledCaughtException;
          stackIn_13_0 = (RuntimeException) (var8);

          stackIn_13_1 = new StringBuilder().append("hk.D(").append(param0).append(',').append(param1).append(',').append(param2).append(',').append(param3).append(',').append(param4).append(',').append(param5).append(',');

          if (param6 == null) {
            stackIn_14_0 = (RuntimeException) ((Object) stackIn_13_0);
            stackIn_14_1 = (StringBuilder) ((Object) stackIn_13_1);
            stackIn_14_2 = "null";
          } else {
            stackIn_14_0 = (RuntimeException) ((Object) stackIn_13_0);
            stackIn_14_1 = (StringBuilder) ((Object) stackIn_13_1);
            stackIn_14_2 = "{...}";
          }
          throw t.a((Throwable) ((Object) stackIn_14_0), ((StringBuilder) (Object) stackIn_14_1).append(stackIn_14_2).append(')').toString());
        }
    }

    void a(int param0, int param1, int param2, int param3) {
        if (null != this.field_u) {
            if (!(this.field_u instanceof pl)) {
                if (param1 != -28922) {
                    field_B = -42;
                    return;
                }
                return;
            }
            ((pl) ((Object) this.field_u)).a(param2, (byte) -20, param0, param3, (hk) (this));
        }
        if (param1 == -28922) {
            return;
        }
        field_B = -42;
    }

    public static void f(byte param0) {
        field_x = null;
        int var1 = -17 % ((param0 - 54) / 53);
        field_C = null;
    }

    hk(String param0, bb param1) {
        this(param0, hb.field_j.field_j, param1);
    }

    void a(boolean param0, int param1, el param2, int param3) {
        try {
            super.a(param0, param1, param2, param3);
            if (0 != this.field_f) {
                if (gf.heldPointerButtonSnapshot == this.field_f) {
                    return;
                }
                if (this.a(qa.pointerXSnapshot, -1, ue.pointerYSnapshot, param1, param3)) {
                    if (!(gf.heldPointerButtonSnapshot != 0)) {
                        this.a(ue.pointerYSnapshot - param1, -28922, qa.pointerXSnapshot - param3, this.field_f);
                    }
                }
                this.a(param3, qa.pointerXSnapshot, !param0 ? true : false, param2, param1, ue.pointerYSnapshot);
            }
        } catch (RuntimeException runtimeException) {
            throw t.a((Throwable) ((Object) runtimeException), "hk.H(" + param0 + ',' + param1 + ',' + (param2 != null ? "{...}" : "null") + ',' + param3 + ')');
        }
    }

    hk(String param0, dh param1, bb param2) {
        super(param0, param1, param2);
        this.field_D = true;
        this.field_z = true;
        this.field_A = false;
    }

    boolean a(int param0, int param1, char param2, el param3) {
        RuntimeException var5 = null;
        RuntimeException stackIn_12_0 = null;
        StringBuilder stackIn_12_1 = null;
        RuntimeException stackIn_13_0 = null;
        StringBuilder stackIn_13_1 = null;
        String stackIn_13_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          L0: {
            if (this.e((byte) 54)) {
              if (param0 != 84) {
                if (param0 != 83) {
                  break L0;
                }
              }
              this.a(-1, -28922, -1, 1);
              return true;
            }
          }
          if (param1 == 13) {
            return false;
          }
          this.field_y = true;
          return false;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var5 = decompiledCaughtException;
          stackIn_12_0 = (RuntimeException) (var5);

          stackIn_12_1 = new StringBuilder().append("hk.I(").append(param0).append(',').append(param1).append(',').append(param2).append(',');

          if (param3 == null) {
            stackIn_13_0 = (RuntimeException) ((Object) stackIn_12_0);
            stackIn_13_1 = (StringBuilder) ((Object) stackIn_12_1);
            stackIn_13_2 = "null";
          } else {
            stackIn_13_0 = (RuntimeException) ((Object) stackIn_12_0);
            stackIn_13_1 = (StringBuilder) ((Object) stackIn_12_1);
            stackIn_13_2 = "{...}";
          }
          throw t.a((Throwable) ((Object) stackIn_13_0), ((StringBuilder) (Object) stackIn_13_1).append(stackIn_13_2).append(')').toString());
        }
    }

    final boolean e(byte param0) {
        if (param0 != 54) {
            this.e((byte) -35);
            return this.field_A;
        }
        return this.field_A;
    }

    final void d(int param0) {
        if (param0 >= -122) {
            this.field_y = false;
            if (!this.field_A) {
                return;
            }
            this.field_A = false;
            if (null == this.field_u) {
                return;
            }
            if (!(this.field_u instanceof rk)) {
                return;
            }
            ((rk) ((Object) this.field_u)).a(3520, (el) (this), this.field_A);
            return;
        }
        if (!this.field_A) {
            return;
        }
        this.field_A = false;
        if (null == this.field_u) {
            return;
        }
        if (!(this.field_u instanceof rk)) {
            return;
        }
        ((rk) ((Object) this.field_u)).a(3520, (el) (this), this.field_A);
    }

    final static void e(int param0) {
        rd.c(520);
        pc.a(4, false);
        if (param0 != 83) {
            hk.f((byte) -65);
        }
    }

    boolean a(byte param0, el param1) {
        RuntimeException var3 = null;
        RuntimeException stackIn_15_0 = null;
        StringBuilder stackIn_15_1 = null;
        RuntimeException stackIn_16_0 = null;
        StringBuilder stackIn_16_1 = null;
        String stackIn_16_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          if (this.field_D) {
            if (this.field_z) {
              param1.d(-128);
              this.field_A = true;
              if (null != this.field_u) {
                if (this.field_u instanceof rk) {
                  ((rk) ((Object) this.field_u)).a(3520, (el) (this), this.field_A);
                }
              }
              if (param0 <= -30) {
                return true;
              }
              this.field_A = true;
              return true;
            }
          }
          return false;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3 = decompiledCaughtException;
          stackIn_15_0 = (RuntimeException) (var3);

          stackIn_15_1 = new StringBuilder().append("hk.UA(").append(param0).append(',');

          if (param1 == null) {
            stackIn_16_0 = (RuntimeException) ((Object) stackIn_15_0);
            stackIn_16_1 = (StringBuilder) ((Object) stackIn_15_1);
            stackIn_16_2 = "null";
          } else {
            stackIn_16_0 = (RuntimeException) ((Object) stackIn_15_0);
            stackIn_16_1 = (StringBuilder) ((Object) stackIn_15_1);
            stackIn_16_2 = "{...}";
          }
          throw t.a((Throwable) ((Object) stackIn_16_0), ((StringBuilder) (Object) stackIn_16_1).append(stackIn_16_2).append(')').toString());
        }
    }

    final StringBuilder a(int param0, StringBuilder param1, Hashtable param2, int param3) {
        StringBuilder discarded$2 = null;
        StringBuilder discarded$3 = null;
        RuntimeException var5 = null;
        StringBuilder stackIn_10_0 = null;
        RuntimeException stackIn_13_0 = null;
        StringBuilder stackIn_13_1 = null;
        RuntimeException stackIn_14_0 = null;
        StringBuilder stackIn_14_1 = null;
        String stackIn_14_2 = null;
        StringBuilder stackIn_16_1 = null;
        StringBuilder stackIn_17_1 = null;
        String stackIn_17_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          if (param0 != 0) {
            hk.e(-5);
          }
          if (this.a(param1, param3, 10095, param2)) {
            this.a(param3, param2, 34, param1);
            if (this.field_y) {
              discarded$2 = param1.append(" active");
            }
            if (!this.field_D) {
              discarded$3 = param1.append(" disabled");
            }
          }
          stackIn_10_0 = (StringBuilder) (param1);
          return stackIn_10_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var5 = decompiledCaughtException;
          stackIn_13_0 = (RuntimeException) (var5);

          stackIn_13_1 = new StringBuilder().append("hk.PA(").append(param0).append(',');

          if (param1 == null) {
            stackIn_14_0 = (RuntimeException) ((Object) stackIn_13_0);
            stackIn_14_1 = (StringBuilder) ((Object) stackIn_13_1);
            stackIn_14_2 = "null";
          } else {
            stackIn_14_0 = (RuntimeException) ((Object) stackIn_13_0);
            stackIn_14_1 = (StringBuilder) ((Object) stackIn_13_1);
            stackIn_14_2 = "{...}";
          }


          stackIn_16_1 = ((StringBuilder) (Object) stackIn_14_1).append(stackIn_14_2).append(',');

          if (param2 == null) {
            stackIn_14_0 = (RuntimeException) ((Object) stackIn_14_0);
            stackIn_17_1 = (StringBuilder) ((Object) stackIn_16_1);
            stackIn_17_2 = "null";
          } else {
            stackIn_14_0 = (RuntimeException) ((Object) stackIn_14_0);
            stackIn_17_1 = (StringBuilder) ((Object) stackIn_16_1);
            stackIn_17_2 = "{...}";
          }
          throw t.a((Throwable) ((Object) stackIn_14_0), ((StringBuilder) (Object) stackIn_17_1).append(stackIn_17_2).append(',').append(param3).append(')').toString());
        }
    }

    final void a(int param0, int param1, boolean param2, el param3, int param4, int param5) {
        if (null != this.field_u && this.field_u instanceof ti) {
            ((ti) ((Object) this.field_u)).a(param4, param5, (byte) 55, (hk) (this), param0, param1);
        }
        if (!param2) {
            return;
        }
        try {
            this.field_f = 0;
        } catch (RuntimeException runtimeException) {
            throw t.a((Throwable) ((Object) runtimeException), "hk.TA(" + param0 + ',' + param1 + ',' + param2 + ',' + (param3 != null ? "{...}" : "null") + ',' + param4 + ',' + param5 + ')');
        }
    }

    protected hk() {
        this.field_D = true;
        this.field_z = true;
        this.field_A = false;
        this.field_q = hb.field_j.field_l;
    }

    static {
        field_B = 0;
        field_x = new nd();
    }
}
