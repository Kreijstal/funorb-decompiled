/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class hd extends a {
    static pj field_u;
    private int field_q;
    private int field_t;
    private int field_s;
    private le[] field_r;

    final static void a(boolean param0, java.applet.Applet param1) {
        try {
          java.net.URL var2 = null;
          Exception var2_ref = null;
          RuntimeException var2_ref2 = null;
          RuntimeException stackIn_7_0 = null;
          StringBuilder stackIn_7_1 = null;
          String stackIn_8_2 = null;
          Throwable decompiledCaughtException = null;
          try {
            try {
              var2 = new java.net.URL(param1.getCodeBase(), "quit.ws");
              param1.getAppletContext().showDocument(uf.a(param1, (byte) 103, var2), "_top");
              if (param0) {
                return;
              }
              hd.b(false);
              return;
            } catch (java.lang.Exception decompiledCaughtParameter0) {
              decompiledCaughtException = decompiledCaughtParameter0;
              var2_ref = (Exception) (Object) decompiledCaughtException;
              var2_ref.printStackTrace();
              return;
            }
          } catch (java.lang.RuntimeException decompiledCaughtParameter1) {
            decompiledCaughtException = decompiledCaughtParameter1;
            var2_ref2 = (RuntimeException) (Object) decompiledCaughtException;
            stackIn_7_0 = var2_ref2;
            stackIn_7_1 = new StringBuilder().append("hd.A(").append(param0).append(',');
            if (param1 == null) {
              stackIn_8_2 = "null";
            } else {
              stackIn_8_2 = "{...}";
            }
            throw la.a((Throwable) ((Object) stackIn_7_0), ((StringBuilder) (Object) stackIn_7_1).append(stackIn_8_2).append(')').toString());
          }
        } catch (RuntimeException | Error decompiledUncheckedException) {
          throw decompiledUncheckedException;
        } catch (Throwable decompiledCheckedException) {
          throw new RuntimeException(decompiledCheckedException);
        }
    }

    public static void c(int param0) {
        field_u = null;
        if (param0 != 0) {
          field_u = (pj) null;
        }
    }

    static long a(long param0, long param1) {
        return param0 ^ param1;
    }

    public hd() {
        this(2188450, 2591221, 9543);
    }

    public final void a(boolean param0, we param1, int param2, int param3, int param4) {
        int stackIn_6_0 = 0;
        int stackIn_13_0 = 0;
        int stackIn_16_0 = 0;
        RuntimeException stackIn_22_0 = null;
        StringBuilder stackIn_22_1 = null;
        String stackIn_23_2 = null;
        RuntimeException decompiledCaughtException = null;
        int var6_int = 0;
        RuntimeException var6 = null;
        int var7 = 0;
        int var8 = 0;
        try {
          if (!param1.field_g) {
            stackIn_6_0 = (param1.b((byte) 80)) ? 1 : 0;
          } else {
            stackIn_6_0 = 1;
          }
          var6_int = stackIn_6_0;
          if (param1 instanceof t) {
            param0 = param0 & ((t) (param1)).field_w;
          }
          if (param0) {
            if (var6_int != 0) {
              stackIn_13_0 = this.field_s;
            } else {
              stackIn_13_0 = this.field_q;
            }
          } else {
            stackIn_13_0 = this.field_t;
          }
          var7 = stackIn_13_0;
          ab.a(param1.field_l, var7, this.field_r, (-this.field_r[0].field_n + param1.field_p >> 1) + param1.field_e + param2, param3 + param1.field_r, (byte) 42);
          stackIn_16_0 = (!param0) ? 7105644 : 16777215;
          var8 = stackIn_16_0;
          if (param4 <= 19) {
            return;
          }
          this.field_p.a(param1.field_s, param1.field_r + param3, param2 + (param1.field_e - 2), param1.field_l, param1.field_p, var8, -1, 1, 1, this.field_p.field_C);
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var6 = decompiledCaughtException;
          stackIn_22_0 = var6;
          stackIn_22_1 = new StringBuilder().append("hd.C(").append(param0).append(',');
          if (param1 == null) {
            stackIn_23_2 = "null";
          } else {
            stackIn_23_2 = "{...}";
          }
          throw la.a((Throwable) ((Object) stackIn_22_0), ((StringBuilder) (Object) stackIn_22_1).append(stackIn_23_2).append(',').append(param2).append(',').append(param3).append(',').append(param4).append(')').toString());
        }
    }

    final static java.awt.Container b(boolean param0) {
        if (hk.field_e != null) {
          return (java.awt.Container) ((Object) hk.field_e);
        }
        if (param0) {
          return (java.awt.Container) ((Object) ii.a(false));
        }
        java.applet.Applet var2 = (java.applet.Applet) null;
        hd.a(false, (java.applet.Applet) null);
        return (java.awt.Container) ((Object) ii.a(false));
    }

    private hd(int param0, int param1, int param2) {
        this.field_p = pj.field_c;
        this.field_q = param0;
        this.field_r = qj.field_C;
        this.field_s = param1;
        this.field_t = param2;
    }

    static {
        field_u = new pj();
    }
}
