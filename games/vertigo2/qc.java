/*
 * Decompiled by CFR-JS 0.4.0.
 */
abstract class qc extends gp {
    static r field_B;
    static db field_v;
    static int field_A;
    int field_C;
    static String field_y;
    static String field_u;
    static int field_z;
    static int field_t;
    static byte[] field_w;
    static cc field_x;

    abstract Object a(byte param0);

    public static void h(int param0) {
        field_y = null;
        field_u = null;
        field_x = null;
        field_B = null;
        if (param0 == 0) {
          field_v = null;
          field_w = null;
          return;
        }
        qc.h(126);
        field_v = null;
        field_w = null;
    }

    final static bk a(int param0, String param1) {
        RuntimeException var2 = null;
        bk stackIn_3_0 = null;
        RuntimeException stackIn_6_0 = null;
        StringBuilder stackIn_6_1 = null;
        String stackIn_7_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          if (param0 != 0) {
            field_t = -26;
          }
          stackIn_3_0 = new bk(param1);
          return stackIn_3_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2 = decompiledCaughtException;
          stackIn_6_0 = var2;
          stackIn_6_1 = new StringBuilder().append("qc.A(").append(param0).append(',');
          if (param1 == null) {
            stackIn_7_2 = "null";
          } else {
            stackIn_7_2 = "{...}";
          }
          throw wn.a((Throwable) ((Object) stackIn_6_0), ((StringBuilder) (Object) stackIn_6_1).append(stackIn_7_2).append(')').toString());
        }
    }

    abstract boolean i(int param0);

    final static void a(String param0, int param1) {
        int stackIn_17_0 = 0;
        RuntimeException stackIn_43_0 = null;
        StringBuilder stackIn_43_1 = null;
        String stackIn_44_2 = null;
        RuntimeException decompiledCaughtException = null;
        int var2_int = 0;
        RuntimeException var2 = null;
        int var3 = 0;
        int var2_intLifetime1;
        var3 = Vertigo2.field_L ? 1 : 0;
        try {
          qf.field_b = qf.field_b + 1;
          if (ek.field_E == -1 &&
            or.field_c == -1) {
            ek.field_E = ed.field_n;
            or.field_c = gb.field_d;
          }
          boolean decompiledFrameRemainder0 = true;
          if (param0 != null) {
            decompiledFrameRemainder0 = !(param0.equals(as.field_a));
          } else {
            decompiledFrameRemainder0 = (null == as.field_a);
          }
          if (decompiledFrameRemainder0) {
            if (!gl.field_o) {
              if (qf.field_b >= aj.field_h) {
                stackIn_17_0 = (aj.field_h + ea.field_g > qf.field_b) ? 1 : 0;
              } else {
                stackIn_17_0 = 0;
              }
            } else {
              stackIn_17_0 = 0;
            }
            var2_int = stackIn_17_0;
            if (param0 == null) {
              qf.field_b = 0;
            } else {
              if (gl.field_o) {
                qf.field_b = aj.field_h;
              } else {
                if (var2_int != 0) {
                  qf.field_b = aj.field_h;
                } else {
                  qf.field_b = 0;
                }
              }
            }
            if (param0 == null) {
              if (var2_int != 0) {
                gl.field_o = true;
              }
            } else {
              gl.field_o = false;
            }
            hn.field_n = ek.field_E;
            rl.field_db = or.field_c;
          }
          as.field_a = param0;
          if (!gl.field_o &&
            qf.field_b < aj.field_h &&
            wo.field_s) {
            hn.field_n = ek.field_E;
            qf.field_b = 0;
            rl.field_db = or.field_c;
          }
          if (gl.field_o &&
            qf.field_b == td.field_g) {
            gl.field_o = false;
            qf.field_b = 0;
          }
          or.field_c = -1;
          var2_intLifetime1 = -102 % ((-47 - param1) / 38);
          ek.field_E = -1;
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2 = decompiledCaughtException;
          stackIn_43_0 = var2;
          stackIn_43_1 = new StringBuilder().append("qc.E(");
          if (param0 == null) {
            stackIn_44_2 = "null";
          } else {
            stackIn_44_2 = "{...}";
          }
          throw wn.a((Throwable) ((Object) stackIn_43_0), ((StringBuilder) (Object) stackIn_43_1).append(stackIn_44_2).append(',').append(param1).append(')').toString());
        }
    }

    qc(int param0) {
        this.field_C = param0;
    }

    static {
        field_u = "This option cannot be combined with the current settings for:  ";
        field_y = "Enter name of player to delete from list";
    }
}
