/*
 * Decompiled by CFR-JS 0.4.0.
 */
import java.util.*;

class ag extends qm {
    private boolean field_y;
    static Random field_D;
    int field_F;
    static boolean field_E;
    boolean field_z;
    boolean field_B;
    static ij field_C;
    static String field_A;
    private boolean field_G;
    static String field_x;

    ag(String param0, pf param1, wc param2) {
        super(param0, param1, param2);
        this.field_F = 0;
        this.field_B = true;
        this.field_G = true;
        this.field_y = false;
    }

    boolean a(qm param0, byte param1, char param2, int param3) {
        RuntimeException var5 = null;
        RuntimeException stackIn_13_0 = null;
        StringBuilder stackIn_13_1 = null;
        String stackIn_14_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          if (param1 >= -120) {
            return false;
          }
          if (this.d(-2116) && (param3 == 84 ||
            param3 == 83)) {
            this.a(-122, -1, 1, -1);
            return true;
          }
          return false;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var5 = decompiledCaughtException;
          stackIn_13_0 = var5;
          stackIn_13_1 = new StringBuilder().append("ag.N(");
          if (param0 == null) {
            stackIn_14_2 = "null";
          } else {
            stackIn_14_2 = "{...}";
          }
          throw aa.a((Throwable) ((Object) stackIn_13_0), ((StringBuilder) (Object) stackIn_13_1).append(stackIn_14_2).append(',').append(param1).append(',').append(param2).append(',').append(param3).append(')').toString());
        }
    }

    void a(int param0, int param1, int param2, int param3) {
        this.field_F = param2;
        if (param0 >= -99) {
          return;
        }
        if (null == this.field_o) {
          return;
        }
        if (this.field_o instanceof vb) {
          ((vb) (this.field_o)).a(true, param3, param1, param2, this);
          return;
        }
    }

    boolean a(int param0, int param1, qm param2, int param3, int param4, int param5, int param6) {
        int var8_int = 0;
        RuntimeException var8 = null;
        RuntimeException stackIn_11_0 = null;
        StringBuilder stackIn_11_1 = null;
        String stackIn_12_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          var8_int = 48 / ((-42 - param4) / 35);
          if (this.field_B &&
            this.a((byte) -47, param3, param0, param6, param5)) {
            this.a(0, param2);
            this.field_t = param1;
            if (null != this.field_o &&
              this.field_o instanceof cl) {
              ((cl) (this.field_o)).a(31017, this, param0, param3, param6, param5, param1);
            }
            return true;
          }
          return false;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var8 = decompiledCaughtException;
          stackIn_11_0 = var8;
          stackIn_11_1 = new StringBuilder().append("ag.DA(").append(param0).append(',').append(param1).append(',');
          if (param2 == null) {
            stackIn_12_2 = "null";
          } else {
            stackIn_12_2 = "{...}";
          }
          throw aa.a((Throwable) ((Object) stackIn_11_0), ((StringBuilder) (Object) stackIn_11_1).append(stackIn_12_2).append(',').append(param3).append(',').append(param4).append(',').append(param5).append(',').append(param6).append(')').toString());
        }
    }

    final void a(int param0, int param1, int param2, int param3, int param4, qm param5) {
        try {
          if (param1 != -20592) {
            field_A = (String) null;
          }
          if (this.field_o != null &&
            this.field_o instanceof cl) {
            ((cl) (this.field_o)).a(param0, false, param4, param2, this, param3);
          }
          this.field_t = 0;
        } catch (RuntimeException runtimeException) {
          throw aa.a((Throwable) ((Object) runtimeException), "ag.IA(" + param0 + ',' + param1 + ',' + param2 + ',' + param3 + ',' + param4 + ',' + (param5 != null ? "{...}" : "null") + ')');
        }
    }

    void a(qm param0, int param1, int param2, int param3) {
        try {
          super.a(param0, param1, param2, param3);
          this.field_F = 0;
          if (0 != this.field_t &&
            wk.field_m != this.field_t) {
            if (this.a((byte) -47, param3, me.field_I, param1, an.field_g) &&
              wk.field_m == 0) {
              this.a(-102, -param1 + an.field_g, this.field_t, me.field_I - param3);
            }
            this.a(me.field_I, -20592, an.field_g, param3, param1, param0);
          }
        } catch (RuntimeException runtimeException) {
          throw aa.a((Throwable) ((Object) runtimeException), "ag.E(" + (param0 != null ? "{...}" : "null") + ',' + param1 + ',' + param2 + ',' + param3 + ')');
        }
    }

    ag(String param0, wc param1) {
        this(param0, io.field_n.field_u, param1);
    }

    ag(int param0, int param1, int param2, int param3, pf param4, wc param5) {
        super(param0, param1, param2, param3, param4, param5);
        this.field_F = 0;
        this.field_B = true;
        this.field_G = true;
        this.field_y = false;
    }

    boolean a(int param0, qm param1) {
        RuntimeException var3 = null;
        qm var4 = null;
        RuntimeException stackIn_14_0 = null;
        StringBuilder stackIn_14_1 = null;
        String stackIn_15_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          if (this.field_B &&
            this.field_G) {
            param1.d((byte) 29);
            this.field_y = true;
            if (param0 != 0) {
              var4 = (qm) null;
              this.a((qm) null, (byte) 125, 'B', 9);
            }
            if (this.field_o != null &&
              this.field_o instanceof wb) {
              ((wb) (this.field_o)).a(false, this.field_y, (qm) (this));
            }
            return true;
          }
          return false;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3 = decompiledCaughtException;
          stackIn_14_0 = var3;
          stackIn_14_1 = new StringBuilder().append("ag.A(").append(param0).append(',');
          if (param1 == null) {
            stackIn_15_2 = "null";
          } else {
            stackIn_15_2 = "{...}";
          }
          throw aa.a((Throwable) ((Object) stackIn_14_0), ((StringBuilder) (Object) stackIn_14_1).append(stackIn_15_2).append(')').toString());
        }
    }

    final static void a(byte param0) {
        sb.field_h[92] = 74;
        sb.field_h[46] = 72;
        sb.field_h[93] = 43;
        sb.field_h[59] = 57;
        sb.field_h[91] = 42;
        sb.field_h[61] = 27;
        sb.field_h[222] = 58;
        sb.field_h[192] = 28;
        if (param0 == -60) {
          sb.field_h[520] = 59;
          sb.field_h[44] = 71;
          sb.field_h[47] = 73;
          sb.field_h[45] = 26;
          return;
        }
        ag.a((byte) -28);
        sb.field_h[520] = 59;
        sb.field_h[44] = 71;
        sb.field_h[47] = 73;
        sb.field_h[45] = 26;
    }

    final StringBuilder a(StringBuilder param0, int param1, Hashtable param2, byte param3) {
        StringBuilder discarded$2 = null;
        StringBuilder discarded$3 = null;
        int var5_int = 0;
        RuntimeException var5 = null;
        StringBuilder stackIn_7_0 = null;
        RuntimeException stackIn_10_0 = null;
        StringBuilder stackIn_10_1 = null;
        String stackIn_11_2 = null;
        StringBuilder stackIn_13_1 = null;
        String stackIn_14_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          if (this.a(param0, (byte) -90, param2, param1)) {
            this.a(param0, param1, param2, 1);
            if (this.field_z) {
              discarded$2 = param0.append(" active");
            }
            if (!this.field_B) {
              discarded$3 = param0.append(" disabled");
            }
          }
          var5_int = -113 / ((param3 - 50) / 60);
          stackIn_7_0 = (StringBuilder) (param0);
          return stackIn_7_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var5 = decompiledCaughtException;
          stackIn_10_0 = var5;
          stackIn_10_1 = new StringBuilder().append("ag.FA(");
          if (param0 == null) {
            stackIn_11_2 = "null";
          } else {
            stackIn_11_2 = "{...}";
          }
          stackIn_13_1 = ((StringBuilder) (Object) stackIn_10_1).append(stackIn_11_2).append(',').append(param1).append(',');
          if (param2 == null) {
            stackIn_14_2 = "null";
          } else {
            stackIn_14_2 = "{...}";
          }
          throw aa.a((Throwable) ((Object) stackIn_10_0), ((StringBuilder) (Object) stackIn_13_1).append(stackIn_14_2).append(',').append(param3).append(')').toString());
        }
    }

    final void d(byte param0) {
        if (param0 != 29) {
          return;
        }
        if (!this.field_y) {
          return;
        }
        this.field_y = false;
        if (null == this.field_o) {
          return;
        }
        if (this.field_o instanceof wb) {
          ((wb) (this.field_o)).a(false, this.field_y, (qm) (this));
          return;
        }
    }

    final static void a(ij param0, byte param1) {
        if (param0 == null) {
          return;
        }
        nn.field_q = param0;
        co.field_f.field_G.c(param1 + 185);
        if (param1 != -104) {
          return;
        }
        try {
          co.field_f.a(nn.field_q, 60);
          oj.field_i = true;
        } catch (RuntimeException runtimeException) {
          throw aa.a((Throwable) ((Object) runtimeException), "ag.QA(" + (param0 != null ? "{...}" : "null") + ',' + param1 + ')');
        }
    }

    final boolean d(int param0) {
        if (param0 != -2116) {
          field_x = (String) null;
          return this.field_y;
        }
        return this.field_y;
    }

    public static void e(int param0) {
        field_C = null;
        field_x = null;
        if (param0 >= -97) {
          return;
        }
        field_D = null;
        field_A = null;
    }

    public ag() {
        this.field_F = 0;
        this.field_B = true;
        this.field_G = true;
        this.field_y = false;
        this.field_r = io.field_n.field_y;
    }

    static {
        field_D = new Random();
        field_A = "Off";
        field_x = "As you see, you performed a mighty leap when you pressed 'Enter'.<br>Try it again.";
    }
}
