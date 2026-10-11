/*
 * Decompiled by CFR-JS 0.4.0.
 */
import java.util.*;

class hc extends hm {
    static int[] field_C;
    boolean field_z;
    private boolean field_B;
    boolean field_y;
    private boolean field_A;

    final static boolean a(boolean param0, java.applet.Applet param1) {
        try {
          int var5 = 0;
          String var2 = null;
          String var3 = null;
          String[] var4 = null;
          int var6 = 0;
          int var7 = 0;
          boolean stackIn_19_0 = false;
          RuntimeException stackIn_22_0 = null;
          StringBuilder stackIn_22_1 = null;
          String stackIn_23_2 = null;
          Throwable decompiledCaughtException = null;
          Throwable var2_ref = null;
          RuntimeException var2_ref2 = null;
          var7 = EscapeVector.field_A;
          try {
            if (an.field_a) {
              return true;
            }
            try {
              var2 = "tuhstatbut";
              if (param0) {
                return false;
              }
              var3 = (String) (sd.a(param1, "getcookies", -29155));
              var4 = bb.a(-128, var3, ';');
              for (var5 = 0; var4.length > var5; var5++) {
                var6 = var4[var5].indexOf('=');
                if (var6 >= 0 &&
                  var4[var5].substring(0, var6).trim().equals(var2)) {
                  return true;
                }
              }
            } catch (java.lang.Throwable decompiledCaughtParameter0) {
              decompiledCaughtException = decompiledCaughtParameter0;
              var2_ref = decompiledCaughtException;
            }
            stackIn_19_0 = (null != param1.getParameter("tuhstatbut"));
            return stackIn_19_0;
          } catch (java.lang.RuntimeException decompiledCaughtParameter1) {
            decompiledCaughtException = decompiledCaughtParameter1;
            var2_ref2 = (RuntimeException) (Object) decompiledCaughtException;
            stackIn_22_0 = var2_ref2;
            stackIn_22_1 = new StringBuilder().append("hc.IA(").append(param0).append(',');
            if (param1 == null) {
              stackIn_23_2 = "null";
            } else {
              stackIn_23_2 = "{...}";
            }
            throw t.a((Throwable) ((Object) stackIn_22_0), ((StringBuilder) (Object) stackIn_22_1).append(stackIn_23_2).append(')').toString());
          }
        } catch (RuntimeException | Error decompiledUncheckedException) {
          throw decompiledUncheckedException;
        } catch (Throwable decompiledCheckedException) {
          throw new RuntimeException(decompiledCheckedException);
        }
    }

    boolean a(hm param0, char param1, int param2, int param3) {
        RuntimeException var5 = null;
        RuntimeException stackIn_12_0 = null;
        StringBuilder stackIn_12_1 = null;
        String stackIn_13_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          if (param3 <= 0) {
            this.h(-2);
          }
          if (this.h(0) && (param2 == 84 ||
            83 == param2)) {
            this.a(-19646, -1, -1, 1);
            return true;
          }
          return false;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var5 = decompiledCaughtException;
          stackIn_12_0 = var5;
          stackIn_12_1 = new StringBuilder().append("hc.G(");
          if (param0 == null) {
            stackIn_13_2 = "null";
          } else {
            stackIn_13_2 = "{...}";
          }
          throw t.a((Throwable) ((Object) stackIn_12_0), ((StringBuilder) (Object) stackIn_12_1).append(stackIn_13_2).append(',').append(param1).append(',').append(param2).append(',').append(param3).append(')').toString());
        }
    }

    void a(int param0, int param1, int param2, hm param3) {
        try {
          if (param0 != -14472) {
            field_C = (int[]) null;
          }
          super.a(param0 ^ 0, param1, param2, param3);
          if (this.field_t != 0) {
            if (eb.field_K == this.field_t) {
              return;
            }
            if (this.a(dh.field_d, bj.field_y, param2, (byte) 97, param1) &&
              eb.field_K == 0) {
              this.a(-19646, bj.field_y - param1, -param2 + dh.field_d, this.field_t);
            }
            this.a(bj.field_y, param2, dh.field_d, param1, param3, (byte) 15);
          }
        } catch (RuntimeException runtimeException) {
          throw t.a((Throwable) ((Object) runtimeException), "hc.Q(" + param0 + ',' + param1 + ',' + param2 + ',' + (param3 != null ? "{...}" : "null") + ')');
        }
    }

    final void a(int param0, int param1, int param2, int param3, hm param4, byte param5) {
        try {
          int var7_int = -18 % ((param5 + 39) / 45);
          if (this.field_q != null &&
            this.field_q instanceof ne) {
            ((ne) (this.field_q)).a(param2, this, param3, (byte) 114, param1, param0);
          }
          this.field_t = 0;
        } catch (RuntimeException runtimeException) {
          throw t.a((Throwable) ((Object) runtimeException), "hc.MA(" + param0 + ',' + param1 + ',' + param2 + ',' + param3 + ',' + (param4 != null ? "{...}" : "null") + ',' + param5 + ')');
        }
    }

    boolean a(int param0, hm param1) {
        RuntimeException var3 = null;
        RuntimeException stackIn_14_0 = null;
        StringBuilder stackIn_14_1 = null;
        String stackIn_15_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          if (this.field_y &&
            this.field_A) {
            param1.f(93);
            this.field_B = true;
            if (param0 != -4659) {
              this.field_z = true;
            }
            if (this.field_q != null &&
              this.field_q instanceof ql) {
              ((ql) (this.field_q)).a(this.field_B, param0 ^ -4679, (hm) (this));
            }
            return true;
          }
          return false;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3 = decompiledCaughtException;
          stackIn_14_0 = var3;
          stackIn_14_1 = new StringBuilder().append("hc.M(").append(param0).append(',');
          if (param1 == null) {
            stackIn_15_2 = "null";
          } else {
            stackIn_15_2 = "{...}";
          }
          throw t.a((Throwable) ((Object) stackIn_14_0), ((StringBuilder) (Object) stackIn_14_1).append(stackIn_15_2).append(')').toString());
        }
    }

    hc(String param0, db param1, wn param2) {
        super(param0, param1, param2);
        this.field_B = false;
        this.field_A = true;
        this.field_y = true;
    }

    final void f(int param0) {
        if (!this.field_B) {
          if (param0 > 46) {
            return;
          }
          field_C = (int[]) null;
          return;
        }
        this.field_B = false;
        if (null == this.field_q) {
          if (param0 > 46) {
            return;
          }
          field_C = (int[]) null;
          return;
        }
        if (!(this.field_q instanceof ql)) {
          if (param0 > 46) {
            return;
          }
          field_C = (int[]) null;
          return;
        }
        ((ql) (this.field_q)).a(this.field_B, 117, (hm) (this));
        if (param0 > 46) {
          return;
        }
        field_C = (int[]) null;
    }

    final StringBuilder a(int param0, Hashtable param1, StringBuilder param2, int param3) {
        StringBuilder discarded$2 = null;
        StringBuilder discarded$3 = null;
        RuntimeException var5 = null;
        hm var6 = null;
        StringBuilder stackIn_10_0 = null;
        RuntimeException stackIn_13_0 = null;
        StringBuilder stackIn_13_1 = null;
        String stackIn_14_2 = null;
        StringBuilder stackIn_16_1 = null;
        String stackIn_17_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          if (param0 != 0) {
            var6 = (hm) null;
            this.a(-48, 8, (byte) 115, -28, 107, (hm) null, -53);
          }
          if (this.a(param3, param1, param2, false)) {
            this.a(param1, param2, param3, 1);
            if (this.field_z) {
              discarded$2 = param2.append(" active");
            }
            if (!this.field_y) {
              discarded$3 = param2.append(" disabled");
            }
          }
          stackIn_10_0 = (StringBuilder) (param2);
          return stackIn_10_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var5 = decompiledCaughtException;
          stackIn_13_0 = var5;
          stackIn_13_1 = new StringBuilder().append("hc.AA(").append(param0).append(',');
          if (param1 == null) {
            stackIn_14_2 = "null";
          } else {
            stackIn_14_2 = "{...}";
          }
          stackIn_16_1 = ((StringBuilder) (Object) stackIn_13_1).append(stackIn_14_2).append(',');
          if (param2 == null) {
            stackIn_17_2 = "null";
          } else {
            stackIn_17_2 = "{...}";
          }
          throw t.a((Throwable) ((Object) stackIn_13_0), ((StringBuilder) (Object) stackIn_16_1).append(stackIn_17_2).append(',').append(param3).append(')').toString());
        }
    }

    hc(String param0, wn param1) {
        this(param0, mb.field_g.field_o, param1);
    }

    final static int a(int param0, byte param1) {
        if (param1 <= 64) {
          hc.j(54);
          return ul.a(500, param0, 123);
        }
        return ul.a(500, param0, 123);
    }

    void a(int param0, int param1, int param2, int param3) {
        if (param0 != -19646) {
          this.field_A = false;
          if (null == this.field_q) {
            return;
          }
          if (this.field_q instanceof qb) {
            ((qb) (this.field_q)).a(this, param3, param1, 1, param2);
            return;
          }
          return;
        }
        if (null == this.field_q) {
          return;
        }
        if (this.field_q instanceof qb) {
          ((qb) (this.field_q)).a(this, param3, param1, 1, param2);
          return;
        }
    }

    public static void j(int param0) {
        field_C = null;
        if (param0 != 1) {
          hc.j(-28);
        }
    }

    final boolean h(int param0) {
        if (param0 != 0) {
          this.field_y = false;
          return this.field_B;
        }
        return this.field_B;
    }

    boolean a(int param0, int param1, byte param2, int param3, int param4, hm param5, int param6) {
        RuntimeException var8 = null;
        RuntimeException stackIn_14_0 = null;
        StringBuilder stackIn_14_1 = null;
        String stackIn_15_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          if (this.field_y &&
            this.a(param1, param3, param4, (byte) 83, param0)) {
            this.a(-4659, param5);
            this.field_t = param6;
            if (this.field_q != null) {
              if (!(this.field_q instanceof ne)) {
                return true;
              }
              ((ne) (this.field_q)).a(param4, this, param1, param0, param6, (byte) 105, param3);
            }
            return true;
          }
          if (param2 != 3) {
            hc.j(15);
          }
          return false;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var8 = decompiledCaughtException;
          stackIn_14_0 = var8;
          stackIn_14_1 = new StringBuilder().append("hc.V(").append(param0).append(',').append(param1).append(',').append(param2).append(',').append(param3).append(',').append(param4).append(',');
          if (param5 == null) {
            stackIn_15_2 = "null";
          } else {
            stackIn_15_2 = "{...}";
          }
          throw t.a((Throwable) ((Object) stackIn_14_0), ((StringBuilder) (Object) stackIn_14_1).append(stackIn_15_2).append(',').append(param6).append(')').toString());
        }
    }

    protected hc() {
        this.field_B = false;
        this.field_A = true;
        this.field_y = true;
        this.field_s = mb.field_g.field_b;
    }

    static {
        field_C = new int[128];
    }
}
