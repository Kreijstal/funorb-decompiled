/*
 * Decompiled by CFR-JS 0.4.0.
 */
import java.util.*;

class mi extends ea {
    static String field_r;
    private boolean field_t;
    boolean field_u;
    private boolean field_v;
    boolean field_s;

    final StringBuilder a(StringBuilder param0, int param1, int param2, Hashtable param3) {
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
          if (param1 != 32462) {
            this.e(3);
          }
          if (this.a(param0, param2, false, param3)) {
            this.a(param0, 0, param3, param2);
            if (this.field_s) {
              discarded$2 = param0.append(" active");
            }
            if (!this.field_u) {
              discarded$3 = param0.append(" disabled");
            }
          }
          stackIn_10_0 = (StringBuilder) (param0);
          return stackIn_10_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var5 = decompiledCaughtException;
          stackIn_13_0 = var5;
          stackIn_13_1 = new StringBuilder().append("mi.A(");
          if (param0 == null) {
            stackIn_14_2 = "null";
          } else {
            stackIn_14_2 = "{...}";
          }
          stackIn_16_1 = ((StringBuilder) (Object) stackIn_13_1).append(stackIn_14_2).append(',').append(param1).append(',').append(param2).append(',');
          if (param3 == null) {
            stackIn_17_2 = "null";
          } else {
            stackIn_17_2 = "{...}";
          }
          throw pn.a((Throwable) ((Object) stackIn_13_0), ((StringBuilder) (Object) stackIn_16_1).append(stackIn_17_2).append(')').toString());
        }
    }

    boolean a(int param0, int param1, char param2, ea param3) {
        int var5_int = 0;
        RuntimeException var5 = null;
        RuntimeException stackIn_10_0 = null;
        StringBuilder stackIn_10_1 = null;
        String stackIn_11_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          var5_int = 63 / ((param0 + 53) / 33);
          if (!this.e(28660)) {
            return false;
          }
          if (84 != param1 &&
            83 != param1) {
            return false;
          }
          this.a(0, -1, 1, -1);
          return true;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var5 = decompiledCaughtException;
          stackIn_10_0 = var5;
          stackIn_10_1 = new StringBuilder().append("mi.G(").append(param0).append(',').append(param1).append(',').append(param2).append(',');
          if (param3 == null) {
            stackIn_11_2 = "null";
          } else {
            stackIn_11_2 = "{...}";
          }
          throw pn.a((Throwable) ((Object) stackIn_10_0), ((StringBuilder) (Object) stackIn_10_1).append(stackIn_11_2).append(')').toString());
        }
    }

    final static boolean a(int param0, CharSequence param1, boolean param2) {
        int var3_int = 0;
        RuntimeException var3 = null;
        int var4 = 0;
        RuntimeException stackIn_16_0 = null;
        StringBuilder stackIn_16_1 = null;
        String stackIn_17_2 = null;
        RuntimeException decompiledCaughtException = null;
        var4 = AceOfSkies.obfuscationControl ? 1 : 0;
        try {
          if (!ou.a(19069, param1, param2)) {
            return false;
          }
          var3_int = 0;
          while (true) {
            if (var3_int >= param1.length()) {
              if (param0 <= -31) {
                return true;
              }
              field_r = (String) null;
              return true;
            }
            if (cg.a(param1.charAt(var3_int), (byte) 117)) {
              var3_int++;
              continue;
            }
            break;
          }
          return false;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3 = decompiledCaughtException;
          stackIn_16_0 = var3;
          stackIn_16_1 = new StringBuilder().append("mi.CA(").append(param0).append(',');
          if (param1 == null) {
            stackIn_17_2 = "null";
          } else {
            stackIn_17_2 = "{...}";
          }
          throw pn.a((Throwable) ((Object) stackIn_16_0), ((StringBuilder) (Object) stackIn_16_1).append(stackIn_17_2).append(',').append(param2).append(')').toString());
        }
    }

    mi(String param0, no param1) {
        this(param0, ag.field_n.field_c, param1);
    }

    final static boolean b(int param0, int param1, int param2) {
        if (param2 != 22547) {
          field_r = (String) null;
          return false;
        }
        return false;
    }

    final void d(int param0) {
        if (param0 != 7398) {
          mi.b(45, -16, 2);
        }
        if (this.field_t) {
          this.field_t = false;
          if (null != this.field_o &&
            this.field_o instanceof ni) {
            ((ni) (this.field_o)).a(-119, this.field_t, (ea) (this));
          }
        }
    }

    final boolean e(int param0) {
        if (param0 != 28660) {
          return true;
        }
        return this.field_t;
    }

    final void a(int param0, int param1, int param2, int param3, ea param4, byte param5) {
        RuntimeException stackIn_8_0 = null;
        StringBuilder stackIn_8_1 = null;
        String stackIn_9_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var7 = null;
        try {
          if (this.field_o != null &&
            this.field_o instanceof uq) {
            ((uq) (this.field_o)).a(param2, param0, param3, -8703, param1, this);
          }
          this.field_i = 0;
          if (param5 != 91) {
            mi.b(36, -2, 6);
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var7 = decompiledCaughtException;
          stackIn_8_0 = var7;
          stackIn_8_1 = new StringBuilder().append("mi.F(").append(param0).append(',').append(param1).append(',').append(param2).append(',').append(param3).append(',');
          if (param4 == null) {
            stackIn_9_2 = "null";
          } else {
            stackIn_9_2 = "{...}";
          }
          throw pn.a((Throwable) ((Object) stackIn_8_0), ((StringBuilder) (Object) stackIn_8_1).append(stackIn_9_2).append(',').append(param5).append(')').toString());
        }
    }

    boolean a(int param0, int param1, int param2, int param3, int param4, ea param5, int param6) {
        RuntimeException var8 = null;
        RuntimeException stackIn_15_0 = null;
        StringBuilder stackIn_15_1 = null;
        String stackIn_16_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          if (this.field_u &&
            this.a(param6, param4, param0 ^ -83, param1, param2)) {
            this.a(param5, (byte) -42);
            this.field_i = param3;
            if (null != this.field_o &&
              this.field_o instanceof uq) {
              ((uq) (this.field_o)).a(param1, param2, param4, param3, param6, false, this);
            }
            return true;
          }
          if (param0 == 34) {
            return false;
          }
          return true;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var8 = decompiledCaughtException;
          stackIn_15_0 = var8;
          stackIn_15_1 = new StringBuilder().append("mi.O(").append(param0).append(',').append(param1).append(',').append(param2).append(',').append(param3).append(',').append(param4).append(',');
          if (param5 == null) {
            stackIn_16_2 = "null";
          } else {
            stackIn_16_2 = "{...}";
          }
          throw pn.a((Throwable) ((Object) stackIn_15_0), ((StringBuilder) (Object) stackIn_15_1).append(stackIn_16_2).append(',').append(param6).append(')').toString());
        }
    }

    void a(int param0, int param1, int param2, int param3) {
        if (param0 != 0) {
          Hashtable var6 = (Hashtable) null;
          this.a((StringBuilder) null, 57, 30, (Hashtable) null);
        }
        if (this.field_o != null &&
          this.field_o instanceof dn) {
          ((dn) (this.field_o)).a(param3, this, param1, param2, (byte) 58);
        }
    }

    public static void g(int param0) {
        field_r = null;
        if (param0 < 82) {
          mi.b(-79, 25, 3);
        }
    }

    void a(byte param0, ea param1, int param2, int param3) {
        try {
          if (param0 < 13) {
            this.field_t = false;
          }
          super.a((byte) 115, param1, param2, param3);
          if (this.field_i != 0 &&
            vu.heldMouseButton != this.field_i) {
            if (this.a(cf.field_g, param2, -41, param3, ic.field_b) &&
              0 == vu.heldMouseButton) {
              this.a(0, -param3 + ic.field_b, this.field_i, -param2 + cf.field_g);
            }
            this.a(param3, param2, cf.field_g, ic.field_b, param1, (byte) 91);
          }
        } catch (RuntimeException runtimeException) {
          throw pn.a((Throwable) ((Object) runtimeException), "mi.S(" + param0 + ',' + (param1 != null ? "{...}" : "null") + ',' + param2 + ',' + param3 + ')');
        }
    }

    boolean a(ea param0, byte param1) {
        RuntimeException var3 = null;
        RuntimeException stackIn_15_0 = null;
        StringBuilder stackIn_15_1 = null;
        String stackIn_16_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          if (param1 != -42) {
            return false;
          }
          if (!this.field_u) {
            return false;
          }
          if (!this.field_v) {
            return false;
          }
          param0.d(7398);
          this.field_t = true;
          if (null != this.field_o &&
            this.field_o instanceof ni) {
            ((ni) (this.field_o)).a(-97, this.field_t, (ea) (this));
          }
          return true;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3 = decompiledCaughtException;
          stackIn_15_0 = var3;
          stackIn_15_1 = new StringBuilder().append("mi.U(");
          if (param0 == null) {
            stackIn_16_2 = "null";
          } else {
            stackIn_16_2 = "{...}";
          }
          throw pn.a((Throwable) ((Object) stackIn_15_0), ((StringBuilder) (Object) stackIn_15_1).append(stackIn_16_2).append(',').append(param1).append(')').toString());
        }
    }

    mi(String param0, ir param1, no param2) {
        super(param0, param1, param2);
        this.field_v = true;
        this.field_t = false;
        this.field_u = true;
    }

    protected mi() {
        this.field_v = true;
        this.field_t = false;
        this.field_u = true;
        this.field_e = ag.field_n.field_p;
    }

    static {
        field_r = "More suggestions";
    }
}
