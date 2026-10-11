/*
 * Decompiled by CFR-JS 0.4.0.
 */
import java.util.*;

class s extends pj {
    static int field_x;
    static sh field_A;
    private boolean field_z;
    private boolean field_B;
    static String[] field_E;
    static dj field_y;
    boolean field_D;
    boolean field_F;
    static mg field_C;

    public static void i(int param0) {
        field_y = null;
        field_A = null;
        if (param0 > 7) {
          field_E = null;
          field_C = null;
          return;
        }
        field_x = -57;
        field_E = null;
        field_C = null;
    }

    final void h(int param0) {
        if (param0 != 0) {
          StringBuilder var3 = (StringBuilder) null;
          this.a((byte) 0, (Hashtable) null, -79, (StringBuilder) null);
          if (!this.field_z) {
            return;
          }
          this.field_z = false;
          if (null == this.field_h) {
            return;
          }
          if (this.field_h instanceof sb) {
            ((sb) (this.field_h)).a((pj) (this), this.field_z, param0 ^ -119);
            return;
          }
          return;
        }
        if (!this.field_z) {
          return;
        }
        this.field_z = false;
        if (null == this.field_h) {
          return;
        }
        if (this.field_h instanceof sb) {
          ((sb) (this.field_h)).a((pj) (this), this.field_z, param0 ^ -119);
          return;
        }
    }

    final StringBuilder a(byte param0, Hashtable param1, int param2, StringBuilder param3) {
        StringBuilder discarded$2 = null;
        StringBuilder discarded$3 = null;
        RuntimeException var5 = null;
        StringBuilder stackIn_9_0 = null;
        StringBuilder stackIn_11_0 = null;
        RuntimeException stackIn_14_0 = null;
        StringBuilder stackIn_14_1 = null;
        String stackIn_15_2 = null;
        StringBuilder stackIn_17_1 = null;
        String stackIn_18_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          if (this.a(9882, param3, param2, param1)) {
            this.a(param2, (byte) -122, param1, param3);
            if (this.field_D) {
              discarded$2 = param3.append(" active");
            }
            if (!this.field_F) {
              discarded$3 = param3.append(" disabled");
            }
          }
          if (param0 < -23) {
            stackIn_11_0 = (StringBuilder) (param3);
            return stackIn_11_0;
          }
          stackIn_9_0 = (StringBuilder) null;
          return stackIn_9_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var5 = decompiledCaughtException;
          stackIn_14_0 = var5;
          stackIn_14_1 = new StringBuilder().append("s.C(").append(param0).append(',');
          if (param1 == null) {
            stackIn_15_2 = "null";
          } else {
            stackIn_15_2 = "{...}";
          }
          stackIn_17_1 = ((StringBuilder) (Object) stackIn_14_1).append(stackIn_15_2).append(',').append(param2).append(',');
          if (param3 == null) {
            stackIn_18_2 = "null";
          } else {
            stackIn_18_2 = "{...}";
          }
          throw dd.a((Throwable) ((Object) stackIn_14_0), ((StringBuilder) (Object) stackIn_17_1).append(stackIn_18_2).append(')').toString());
        }
    }

    final boolean d(int param0) {
        if (param0 != -81) {
          return true;
        }
        return this.field_z;
    }

    s(String param0, td param1, ag param2) {
        super(param0, param1, param2);
        this.field_B = true;
        this.field_z = false;
        this.field_F = true;
    }

    void b(int param0, int param1, int param2, int param3) {
        if (param0 != 84) {
          this.field_F = true;
          if (null != this.field_h) {
            if (this.field_h instanceof ai) {
              ((ai) (this.field_h)).a((byte) -115, param3, param1, this, param2);
            }
            return;
          }
          return;
        }
        if (null == this.field_h) {
          return;
        }
        if (this.field_h instanceof ai) {
          ((ai) (this.field_h)).a((byte) -115, param3, param1, this, param2);
          return;
        }
    }

    final void a(int param0, int param1, byte param2, pj param3, int param4, int param5) {
        if (this.field_h != null &&
          this.field_h instanceof gh) {
          ((gh) (this.field_h)).a(param5, 4071, param0, param4, param1, this);
        }
        if (param2 >= -91) {
          return;
        }
        try {
          this.field_v = 0;
        } catch (RuntimeException runtimeException) {
          throw dd.a((Throwable) ((Object) runtimeException), "s.J(" + param0 + ',' + param1 + ',' + param2 + ',' + (param3 != null ? "{...}" : "null") + ',' + param4 + ',' + param5 + ')');
        }
    }

    boolean a(byte param0, pj param1, int param2, int param3, int param4, int param5, int param6) {
        RuntimeException var8 = null;
        pj var9 = null;
        RuntimeException stackIn_14_0 = null;
        StringBuilder stackIn_14_1 = null;
        String stackIn_15_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          if (param0 > -115) {
            var9 = (pj) null;
            this.a((byte) -30, (pj) null, 51, 84);
          }
          if (this.field_F &&
            this.a((byte) 3, param5, param4, param6, param3)) {
            this.a(-81, param1);
            this.field_v = param2;
            if (null != this.field_h) {
              if (!(this.field_h instanceof gh)) {
                return true;
              }
              ((gh) (this.field_h)).a(param2, param5, param4, this, param3, param6, (byte) 1);
            }
            return true;
          }
          return false;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var8 = decompiledCaughtException;
          stackIn_14_0 = var8;
          stackIn_14_1 = new StringBuilder().append("s.F(").append(param0).append(',');
          if (param1 == null) {
            stackIn_15_2 = "null";
          } else {
            stackIn_15_2 = "{...}";
          }
          throw dd.a((Throwable) ((Object) stackIn_14_0), ((StringBuilder) (Object) stackIn_14_1).append(stackIn_15_2).append(',').append(param2).append(',').append(param3).append(',').append(param4).append(',').append(param5).append(',').append(param6).append(')').toString());
        }
    }

    void a(byte param0, pj param1, int param2, int param3) {
        try {
          super.a(param0, param1, param2, param3);
          if (this.field_v != 0) {
            if (this.field_v == of.field_G) {
              return;
            }
            if (this.a((byte) 3, ua.field_a, vl.field_d, param3, param2) &&
              0 == of.field_G) {
              this.b(84, vl.field_d - param3, this.field_v, -param2 + ua.field_a);
            }
            this.a(param3, ua.field_a, (byte) -103, param1, param2, vl.field_d);
          }
        } catch (RuntimeException runtimeException) {
          throw dd.a((Throwable) ((Object) runtimeException), "s.A(" + param0 + ',' + (param1 != null ? "{...}" : "null") + ',' + param2 + ',' + param3 + ')');
        }
    }

    boolean a(char param0, int param1, pj param2, int param3) {
        RuntimeException var5 = null;
        RuntimeException stackIn_12_0 = null;
        StringBuilder stackIn_12_1 = null;
        String stackIn_13_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          if (param3 != 0) {
            this.field_B = true;
          }
          if (this.d(-81) && (84 == param1 ||
            param1 == 83)) {
            this.b(param3 ^ 84, -1, 1, -1);
            return true;
          }
          return false;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var5 = decompiledCaughtException;
          stackIn_12_0 = var5;
          stackIn_12_1 = new StringBuilder().append("s.I(").append(param0).append(',').append(param1).append(',');
          if (param2 == null) {
            stackIn_13_2 = "null";
          } else {
            stackIn_13_2 = "{...}";
          }
          throw dd.a((Throwable) ((Object) stackIn_12_0), ((StringBuilder) (Object) stackIn_12_1).append(stackIn_13_2).append(',').append(param3).append(')').toString());
        }
    }

    boolean a(int param0, pj param1) {
        RuntimeException var3 = null;
        RuntimeException stackIn_15_0 = null;
        StringBuilder stackIn_15_1 = null;
        String stackIn_16_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          if (this.field_F &&
            this.field_B) {
            if (param0 != -81) {
              return false;
            }
            param1.h(0);
            this.field_z = true;
            if (this.field_h != null &&
              this.field_h instanceof sb) {
              ((sb) (this.field_h)).a((pj) (this), this.field_z, 22);
            }
            return true;
          }
          return false;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3 = decompiledCaughtException;
          stackIn_15_0 = var3;
          stackIn_15_1 = new StringBuilder().append("s.E(").append(param0).append(',');
          if (param1 == null) {
            stackIn_16_2 = "null";
          } else {
            stackIn_16_2 = "{...}";
          }
          throw dd.a((Throwable) ((Object) stackIn_15_0), ((StringBuilder) (Object) stackIn_15_1).append(stackIn_16_2).append(')').toString());
        }
    }

    s(String param0, ag param1) {
        this(param0, mb.field_a.field_l, param1);
    }

    protected s() {
        this.field_B = true;
        this.field_z = false;
        this.field_F = true;
        this.field_j = mb.field_a.field_c;
    }

    static {
        field_A = null;
        field_E = new String[]{null, "Or click", "Or click", "Or click", "Or click", "Or click", "Or click", "Or click"};
    }
}
