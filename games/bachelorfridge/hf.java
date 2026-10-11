/*
 * Decompiled by CFR-JS 0.4.0.
 */
import java.util.*;

class hf extends wj {
    boolean field_z;
    private boolean field_C;
    private boolean field_y;
    boolean field_B;

    void a(int param0, int param1, wj param2, int param3) {
        try {
          super.a(param0, param1, param2, param3);
          if (this.field_u != 0 &&
            this.field_u != fia.field_t) {
            if (this.a(gd.field_m, mk.field_p, 0, param0, param1) &&
              fia.field_t == 0) {
              this.a(-param0 + mk.field_p, this.field_u, false, -param1 + gd.field_m);
            }
            this.a(param0, mk.field_p, (byte) -101, param2, gd.field_m, param1);
          }
        } catch (RuntimeException runtimeException) {
          throw pe.a((Throwable) ((Object) runtimeException), "hf.O(" + param0 + ',' + param1 + ',' + (param2 != null ? "{...}" : "null") + ',' + param3 + ')');
        }
    }

    final void a(int param0, int param1, byte param2, wj param3, int param4, int param5) {
        try {
          if (null != this.field_k &&
            this.field_k instanceof uia) {
            ((uia) (this.field_k)).a(param5, param0, param2 - 10256, this, param4, param1);
          }
          if (param2 != -101) {
            this.field_C = true;
          }
          this.field_u = 0;
        } catch (RuntimeException runtimeException) {
          throw pe.a((Throwable) ((Object) runtimeException), "hf.H(" + param0 + ',' + param1 + ',' + param2 + ',' + (param3 != null ? "{...}" : "null") + ',' + param4 + ',' + param5 + ')');
        }
    }

    final void f(int param0) {
        if (param0 != 31) {
          this.field_y = true;
          if (!this.field_C) {
            return;
          }
          this.field_C = false;
          if (null != this.field_k) {
            if (this.field_k instanceof caa) {
              ((caa) (this.field_k)).a(this.field_C, param0 + 6171, (wj) (this));
            }
            return;
          }
          return;
        }
        if (!this.field_C) {
          return;
        }
        this.field_C = false;
        if (null == this.field_k) {
          return;
        }
        if (this.field_k instanceof caa) {
          ((caa) (this.field_k)).a(this.field_C, param0 + 6171, (wj) (this));
          return;
        }
    }

    boolean b(int param0, int param1, int param2, int param3, int param4, wj param5, int param6) {
        RuntimeException var8 = null;
        RuntimeException stackIn_13_0 = null;
        StringBuilder stackIn_13_1 = null;
        String stackIn_14_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          if (param1 != -7375) {
            this.field_z = true;
          }
          if (this.field_z &&
            this.a(param6, param0, param1 ^ -7375, param2, param4)) {
            this.a(param5, param1 ^ 7328);
            this.field_u = param3;
            if (this.field_k != null &&
              this.field_k instanceof uia) {
              ((uia) (this.field_k)).a(param3, param6, this, param4, param2, param0, true);
            }
            return true;
          }
          return false;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var8 = decompiledCaughtException;
          stackIn_13_0 = var8;
          stackIn_13_1 = new StringBuilder().append("hf.L(").append(param0).append(',').append(param1).append(',').append(param2).append(',').append(param3).append(',').append(param4).append(',');
          if (param5 == null) {
            stackIn_14_2 = "null";
          } else {
            stackIn_14_2 = "{...}";
          }
          throw pe.a((Throwable) ((Object) stackIn_13_0), ((StringBuilder) (Object) stackIn_13_1).append(stackIn_14_2).append(',').append(param6).append(')').toString());
        }
    }

    hf(String param0, qda param1, pl param2) {
        super(param0, param1, param2);
        this.field_C = false;
        this.field_z = true;
        this.field_y = true;
    }

    void a(int param0, int param1, boolean param2, int param3) {
        if (param2) {
          this.field_C = false;
          if (this.field_k != null) {
            if (this.field_k instanceof lja) {
              ((lja) (this.field_k)).a(param1, this, param0, (byte) 91, param3);
            }
            return;
          }
          return;
        }
        if (this.field_k == null) {
          return;
        }
        if (this.field_k instanceof lja) {
          ((lja) (this.field_k)).a(param1, this, param0, (byte) 91, param3);
          return;
        }
    }

    boolean a(wj param0, int param1) {
        RuntimeException var3 = null;
        RuntimeException stackIn_14_0 = null;
        StringBuilder stackIn_14_1 = null;
        String stackIn_15_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          if (param1 > -78) {
            this.field_y = true;
          }
          if (this.field_z &&
            this.field_y) {
            param0.f(31);
            this.field_C = true;
            if (this.field_k != null &&
              this.field_k instanceof caa) {
              ((caa) (this.field_k)).a(this.field_C, 6202, (wj) (this));
            }
            return true;
          }
          return false;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3 = decompiledCaughtException;
          stackIn_14_0 = var3;
          stackIn_14_1 = new StringBuilder().append("hf.W(");
          if (param0 == null) {
            stackIn_15_2 = "null";
          } else {
            stackIn_15_2 = "{...}";
          }
          throw pe.a((Throwable) ((Object) stackIn_14_0), ((StringBuilder) (Object) stackIn_14_1).append(stackIn_15_2).append(',').append(param1).append(')').toString());
        }
    }

    final boolean e(int param0) {
        if (param0 != 1023) {
          return true;
        }
        return this.field_C;
    }

    boolean a(int param0, int param1, char param2, wj param3) {
        RuntimeException var5 = null;
        wj var6 = null;
        RuntimeException stackIn_12_0 = null;
        StringBuilder stackIn_12_1 = null;
        String stackIn_13_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          if (this.e(1023) && (84 == param1 ||
            83 == param1)) {
            this.a(-1, 1, false, -1);
            return true;
          }
          if (param0 == 10) {
            return false;
          }
          var6 = (wj) null;
          this.b(-23, -63, 65, 37, -115, (wj) null, 80);
          return false;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var5 = decompiledCaughtException;
          stackIn_12_0 = var5;
          stackIn_12_1 = new StringBuilder().append("hf.I(").append(param0).append(',').append(param1).append(',').append(param2).append(',');
          if (param3 == null) {
            stackIn_13_2 = "null";
          } else {
            stackIn_13_2 = "{...}";
          }
          throw pe.a((Throwable) ((Object) stackIn_12_0), ((StringBuilder) (Object) stackIn_12_1).append(stackIn_13_2).append(')').toString());
        }
    }

    final StringBuilder a(Hashtable param0, int param1, byte param2, StringBuilder param3) {
        StringBuilder discarded$2 = null;
        StringBuilder discarded$3 = null;
        RuntimeException var5 = null;
        wj var6 = null;
        StringBuilder stackIn_9_0 = null;
        RuntimeException stackIn_12_0 = null;
        StringBuilder stackIn_12_1 = null;
        String stackIn_13_2 = null;
        StringBuilder stackIn_15_1 = null;
        String stackIn_16_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          if (this.a(param0, param1, param3, (byte) 110)) {
            this.a(9, param0, param3, param1);
            if (this.field_B) {
              discarded$2 = param3.append(" active");
            }
            if (!this.field_z) {
              discarded$3 = param3.append(" disabled");
            }
          }
          if (param2 <= 20) {
            var6 = (wj) null;
            this.a(90, -123, (wj) null, 76);
          }
          stackIn_9_0 = (StringBuilder) (param3);
          return stackIn_9_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var5 = decompiledCaughtException;
          stackIn_12_0 = var5;
          stackIn_12_1 = new StringBuilder().append("hf.V(");
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
          throw pe.a((Throwable) ((Object) stackIn_12_0), ((StringBuilder) (Object) stackIn_15_1).append(stackIn_16_2).append(')').toString());
        }
    }

    hf(String param0, pl param1) {
        this(param0, fda.field_i.field_r, param1);
    }

    protected hf() {
        this.field_C = false;
        this.field_z = true;
        this.field_y = true;
        this.field_f = fda.field_i.field_j;
    }

    static {
    }
}
