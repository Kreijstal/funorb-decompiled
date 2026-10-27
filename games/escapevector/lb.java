/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class lb extends ah {
    static String[] field_n;
    private ul field_o;

    public static void g(int param0) {
        if (param0 != -17318) {
          return;
        }
        field_n = null;
    }

    final String a(byte param0, String param1) {
        String stackIn_18_2 = null;
        try {
          if (this.field_o instanceof og) {
            el var3 = ((og) ((Object) this.field_o)).a((byte) -89);
            if (var3 != null) {
              if (var3.a(17124) == df.field_h &&
                !param1.equals(this.field_o.field_l)) {
                String stackIn_7_0 = me.field_n;
                return stackIn_7_0;
              }
              String stackIn_9_0 = var3.b(54);
              return stackIn_9_0;
            }
          }
          int var3_int = 126 % ((10 - param0) / 51);
          if (param1.equals(this.field_o.field_l)) {
            return null;
          }
          String stackIn_13_0 = me.field_n;
          return stackIn_13_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          RuntimeException decompiledCaughtException = decompiledCaughtParameter0;
          RuntimeException var3_ref = decompiledCaughtException;
          RuntimeException stackIn_17_0 = var3_ref;
          StringBuilder stackIn_17_1 = new StringBuilder().append("lb.L(").append(param0).append(',');
          if (param1 == null) {
            stackIn_18_2 = "null";
          } else {
            stackIn_18_2 = "{...}";
          }
          throw t.a((Throwable) ((Object) stackIn_17_0), ((StringBuilder) (Object) stackIn_17_1).append(stackIn_18_2).append(')').toString());
        }
    }

    final rf a(int param0, String param1) {
        rf stackIn_10_0 = null;
        String stackIn_14_2 = null;
        try {
          if (param0 != -1) {
            field_n = (String[]) null;
          }
          if (this.field_o instanceof og) {
            el var3 = ((og) ((Object) this.field_o)).a((byte) -89);
            if (var3 != null &&
              var3.a(17124) != df.field_h) {
              rf stackIn_6_0 = ob.field_a;
              return stackIn_6_0;
            }
          }
          if (param1.equals(this.field_o.field_l)) {
            stackIn_10_0 = df.field_h;
          } else {
            stackIn_10_0 = ob.field_a;
          }
          return stackIn_10_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          RuntimeException decompiledCaughtException = decompiledCaughtParameter0;
          RuntimeException var3_ref = decompiledCaughtException;
          RuntimeException stackIn_13_0 = var3_ref;
          StringBuilder stackIn_13_1 = new StringBuilder().append("lb.G(").append(param0).append(',');
          if (param1 == null) {
            stackIn_14_2 = "null";
          } else {
            stackIn_14_2 = "{...}";
          }
          throw t.a((Throwable) ((Object) stackIn_13_0), ((StringBuilder) (Object) stackIn_13_1).append(stackIn_14_2).append(')').toString());
        }
    }

    static int a(int param0, int param1) {
        return param0 | param1;
    }

    final static boolean b(byte param0, String param1) {
        String stackIn_16_2 = null;
        int var4 = EscapeVector.obfuscationControl;
        try {
          if (param0 > -1) {
            field_n = (String[]) null;
          }
          for (int var2_int = 0; var2_int < param1.length(); var2_int++) {
            int var3 = param1.charAt(var2_int);
            if (!of.a((char) var3, (byte) 103) &&
              !on.a((char) var3, false)) {
              return true;
            }
          }
          return false;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          RuntimeException decompiledCaughtException = decompiledCaughtParameter0;
          RuntimeException var2 = decompiledCaughtException;
          RuntimeException stackIn_15_0 = var2;
          StringBuilder stackIn_15_1 = new StringBuilder().append("lb.K(").append(param0).append(',');
          if (param1 == null) {
            stackIn_16_2 = "null";
          } else {
            stackIn_16_2 = "{...}";
          }
          throw t.a((Throwable) ((Object) stackIn_15_0), ((StringBuilder) (Object) stackIn_15_1).append(stackIn_16_2).append(')').toString());
        }
    }

    lb(ul param0, ul param1) {
        super(param0);
        try {
          this.field_o = param1;
        } catch (RuntimeException runtimeException) {
          throw t.a((Throwable) ((Object) runtimeException), "lb.<init>(" + (param0 != null ? "{...}" : "null") + ',' + (param1 != null ? "{...}" : "null") + ')');
        }
    }

    final static void c(boolean param0) {
        Throwable decompiledCaughtException = null;
        if (om.field_b != null) {
          Object var1 = om.field_b;
          synchronized (var1) {
            om.field_b = null;
          }
        }
        if (!param0) {
          field_n = (String[]) null;
        }
    }

    final static void b(int param0, String param1) {
        try {
          p.field_i = param1;
          if (param0 != -10002) {
            field_n = (String[]) null;
          }
        } catch (RuntimeException runtimeException) {
          throw t.a((Throwable) ((Object) runtimeException), "lb.F(" + param0 + ',' + (param1 != null ? "{...}" : "null") + ')');
        }
    }

    final static void a(int param0, String param1, int param2, int param3, int param4) {
        mj.field_b.g();
        SoftwareRasterizer.d();
        fh.field_g.c(param1, 160, 22, param2, -1);
        md.field_D.a(122);
        cf.a(mj.field_b, true, 1);
        if (param3 > -109) {
          return;
        }
        try {
          mj.field_b.h(5267536);
          mj.field_b.e(param4 - 160, -22 + param0);
        } catch (RuntimeException runtimeException) {
          throw t.a((Throwable) ((Object) runtimeException), "lb.I(" + param0 + ',' + (param1 != null ? "{...}" : "null") + ',' + param2 + ',' + param3 + ',' + param4 + ')');
        }
    }

    static {
        field_n = new String[]{"All other member expansions", "Loads more Achievements", "Full community features"};
    }
}
