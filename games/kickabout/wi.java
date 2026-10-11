/*
 * Decompiled by CFR-JS 0.4.0.
 */
import java.util.*;

class wi extends fd {
    static String field_x;
    private boolean field_D;
    static boolean field_B;
    private boolean field_w;
    static uv field_v;
    boolean field_y;
    static boolean[] field_z;
    static int field_C;
    boolean field_A;

    wi(String param0, gj param1, jv param2) {
        super(param0, param1, param2);
        this.field_D = false;
        this.field_w = true;
        this.field_y = true;
    }

    final static void a(String param0, String param1, int param2, int param3, String param4, int param5) {
        tv var6 = null;
        try {
          if (param5 >= -112) {
            field_x = (String) null;
          }
          var6 = new tv(param3, param1, param2, param0, param4);
          ec.a(true, var6);
        } catch (RuntimeException runtimeException) {
          throw nb.a((Throwable) ((Object) runtimeException), "wi.N(" + (param0 != null ? "{...}" : "null") + ',' + (param1 != null ? "{...}" : "null") + ',' + param2 + ',' + param3 + ',' + (param4 != null ? "{...}" : "null") + ',' + param5 + ')');
        }
    }

    boolean a(boolean param0, int param1, int param2, fd param3, int param4, int param5, int param6) {
        RuntimeException var8 = null;
        RuntimeException stackIn_15_0 = null;
        StringBuilder stackIn_15_1 = null;
        String stackIn_16_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          if (this.field_y &&
            this.a((byte) 47, param5, param1, param2, param4)) {
            this.a(param3, 0);
            this.field_p = param6;
            if (null != this.field_k) {
              if (!(this.field_k instanceof nf)) {
                return true;
              }
              ((nf) (this.field_k)).a(param4, param6, param2, param5, this, (byte) -32, param1);
            }
            return true;
          }
          if (param0) {
            return false;
          }
          return true;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var8 = decompiledCaughtException;
          stackIn_15_0 = var8;
          stackIn_15_1 = new StringBuilder().append("wi.EA(").append(param0).append(',').append(param1).append(',').append(param2).append(',');
          if (param3 == null) {
            stackIn_16_2 = "null";
          } else {
            stackIn_16_2 = "{...}";
          }
          throw nb.a((Throwable) ((Object) stackIn_15_0), ((StringBuilder) (Object) stackIn_15_1).append(stackIn_16_2).append(',').append(param4).append(',').append(param5).append(',').append(param6).append(')').toString());
        }
    }

    public static void a(int param0) {
        if (param0 <= 40) {
          field_z = (boolean[]) null;
        }
        field_x = null;
        field_v = null;
        field_z = null;
    }

    boolean a(char param0, byte param1, fd param2, int param3) {
        RuntimeException var5 = null;
        RuntimeException stackIn_12_0 = null;
        StringBuilder stackIn_12_1 = null;
        String stackIn_13_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          if (param1 >= -60) {
            this.field_w = true;
          }
          if (!this.b(97)) {
            return false;
          }
          if (param3 != 84 &&
            param3 != 83) {
            return false;
          }
          this.b(1, -1, -1, -1);
          return true;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var5 = decompiledCaughtException;
          stackIn_12_0 = var5;
          stackIn_12_1 = new StringBuilder().append("wi.E(").append(param0).append(',').append(param1).append(',');
          if (param2 == null) {
            stackIn_13_2 = "null";
          } else {
            stackIn_13_2 = "{...}";
          }
          throw nb.a((Throwable) ((Object) stackIn_12_0), ((StringBuilder) (Object) stackIn_12_1).append(stackIn_13_2).append(',').append(param3).append(')').toString());
        }
    }

    final boolean b(int param0) {
        if (param0 < 10) {
          return false;
        }
        return this.field_D;
    }

    final void g(int param0) {
        if (this.field_D) {
          this.field_D = false;
          if (null != this.field_k &&
            this.field_k instanceof ab) {
            ((ab) (this.field_k)).a(this.field_D, (fd) (this), -9307);
          }
        }
        if (param0 != 84) {
          fd var3 = (fd) null;
          this.a('￱', (byte) 74, (fd) null, -102);
        }
    }

    final void a(int param0, int param1, int param2, fd param3, int param4, int param5) {
        try {
          if (null != this.field_k &&
            this.field_k instanceof nf) {
            ((nf) (this.field_k)).a(this, param2, param4 - 31878, param1, param0, param5);
          }
          if (param4 != -1) {
            this.field_A = false;
          }
          this.field_p = 0;
        } catch (RuntimeException runtimeException) {
          throw nb.a((Throwable) ((Object) runtimeException), "wi.T(" + param0 + ',' + param1 + ',' + param2 + ',' + (param3 != null ? "{...}" : "null") + ',' + param4 + ',' + param5 + ')');
        }
    }

    wi(String param0, jv param1) {
        this(param0, nb.field_i.field_l, param1);
    }

    void a(byte param0, fd param1, int param2, int param3) {
        try {
          super.a(param0, param1, param2, param3);
          if (this.field_p != 0 &&
            this.field_p != nl.field_p) {
            if (this.a((byte) -70, param2, param3, el.field_A, n.field_m) &&
              0 == nl.field_p) {
              this.b(this.field_p, -param2 + el.field_A, n.field_m - param3, -1);
            }
            this.a(param3, n.field_m, el.field_A, param1, param0 - 13, param2);
          }
        } catch (RuntimeException runtimeException) {
          throw nb.a((Throwable) ((Object) runtimeException), "wi.P(" + param0 + ',' + (param1 != null ? "{...}" : "null") + ',' + param2 + ',' + param3 + ')');
        }
    }

    boolean a(fd param0, int param1) {
        RuntimeException var3 = null;
        RuntimeException stackIn_16_0 = null;
        StringBuilder stackIn_16_1 = null;
        String stackIn_17_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          if (this.field_y &&
            this.field_w) {
            if (param1 != 0) {
              return true;
            }
            param0.g(84);
            this.field_D = true;
            if (this.field_k != null) {
              if (!(this.field_k instanceof ab)) {
                return true;
              }
              ((ab) (this.field_k)).a(this.field_D, (fd) (this), param1 ^ -9307);
            }
            return true;
          }
          return false;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3 = decompiledCaughtException;
          stackIn_16_0 = var3;
          stackIn_16_1 = new StringBuilder().append("wi.HA(");
          if (param0 == null) {
            stackIn_17_2 = "null";
          } else {
            stackIn_17_2 = "{...}";
          }
          throw nb.a((Throwable) ((Object) stackIn_16_0), ((StringBuilder) (Object) stackIn_16_1).append(stackIn_17_2).append(',').append(param1).append(')').toString());
        }
    }

    final static StringBuilder a(int param0, int[] param1) {
        int var3 = 0;
        StringBuilder discarded$10 = null;
        StringBuilder discarded$11 = null;
        StringBuilder var2 = null;
        RuntimeException var2_ref = null;
        int var4 = 0;
        String var5 = null;
        StringBuilder stackIn_9_0 = null;
        RuntimeException stackIn_12_0 = null;
        StringBuilder stackIn_12_1 = null;
        String stackIn_13_2 = null;
        RuntimeException decompiledCaughtException = null;
        var4 = Kickabout.field_G;
        try {
          if (param0 != -31182) {
            var5 = (String) null;
            wi.a((String) null, (String) null, -61, -57, (String) null, 83);
          }
          var2 = new StringBuilder("int[] {");
          for (var3 = 0; var3 < param1.length; var3++) {
            discarded$10 = var2.append(var3);
            if (-1 + param1.length > var3) {
              discarded$11 = var2.append(',');
            }
          }
          stackIn_9_0 = var2.append('}');
          return stackIn_9_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2_ref = decompiledCaughtException;
          stackIn_12_0 = var2_ref;
          stackIn_12_1 = new StringBuilder().append("wi.M(").append(param0).append(',');
          if (param1 == null) {
            stackIn_13_2 = "null";
          } else {
            stackIn_13_2 = "{...}";
          }
          throw nb.a((Throwable) ((Object) stackIn_12_0), ((StringBuilder) (Object) stackIn_12_1).append(stackIn_13_2).append(')').toString());
        }
    }

    void b(int param0, int param1, int param2, int param3) {
        if (param3 != -1) {
          this.b(117, -8, -51, -115);
        }
        if (this.field_k != null &&
          this.field_k instanceof vh) {
          ((vh) (this.field_k)).a(param1, this, param2, (byte) 99, param0);
        }
    }

    final StringBuilder a(int param0, int param1, Hashtable param2, StringBuilder param3) {
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
          if (this.a(param0 - 17882, param3, param2, param1)) {
            this.b(param1, param3, param2, -18568);
            if (this.field_A) {
              discarded$2 = param3.append(" active");
            }
            if (!this.field_y) {
              discarded$3 = param3.append(" disabled");
            }
          }
          if (param0 != 17883) {
            field_C = -75;
          }
          stackIn_11_0 = (StringBuilder) (param3);
          return stackIn_11_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var5 = decompiledCaughtException;
          stackIn_14_0 = var5;
          stackIn_14_1 = new StringBuilder().append("wi.GA(").append(param0).append(',').append(param1).append(',');
          if (param2 == null) {
            stackIn_15_2 = "null";
          } else {
            stackIn_15_2 = "{...}";
          }
          stackIn_17_1 = ((StringBuilder) (Object) stackIn_14_1).append(stackIn_15_2).append(',');
          if (param3 == null) {
            stackIn_18_2 = "null";
          } else {
            stackIn_18_2 = "{...}";
          }
          throw nb.a((Throwable) ((Object) stackIn_14_0), ((StringBuilder) (Object) stackIn_17_1).append(stackIn_18_2).append(')').toString());
        }
    }

    protected wi() {
        this.field_D = false;
        this.field_w = true;
        this.field_y = true;
        this.field_r = nb.field_i.field_n;
    }

    static {
        field_x = "You are invited to <%0>'s game.";
        field_C = -1;
    }
}
