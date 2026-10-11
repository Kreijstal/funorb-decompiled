/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class pk extends bh {
    int field_s;
    int field_n;
    static int field_r;
    static qn field_v;
    int field_u;
    pk field_o;
    static ud field_q;
    int field_p;
    int field_t;

    public static void c(int param0) {
        int var1 = 86 % ((52 - param0) / 35);
        field_v = null;
        field_q = null;
    }

    final static boolean d(int param0) {
        lf.field_g = true;
        if (param0 >= 55) {
          lb.field_d = 15000L + ik.a(4);
          return hc.field_d == 11 ? true : false;
        }
        pk.a(false, true);
        lb.field_d = 15000L + ik.a(4);
        return hc.field_d == 11 ? true : false;
    }

    final static void a(boolean param0, boolean param1) {
        if (param1) {
          return;
        }
        jj.field_f.a(-21, param0);
    }

    final static void a(byte param0, java.applet.Applet param1) {
        try {
          java.net.URL var2 = null;
          Exception var2_ref = null;
          RuntimeException var2_ref2 = null;
          RuntimeException stackIn_8_0 = null;
          StringBuilder stackIn_8_1 = null;
          String stackIn_9_2 = null;
          Throwable decompiledCaughtException = null;
          try {
            try {
              var2 = new java.net.URL(param1.getCodeBase(), "quit.ws");
              if (param0 != -17) {
                pk.a(-74);
              }
              param1.getAppletContext().showDocument(gn.a(var2, -1, param1), "_top");
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
            stackIn_8_0 = var2_ref2;
            stackIn_8_1 = new StringBuilder().append("pk.B(").append(param0).append(',');
            if (param1 == null) {
              stackIn_9_2 = "null";
            } else {
              stackIn_9_2 = "{...}";
            }
            throw dh.a((Throwable) ((Object) stackIn_8_0), ((StringBuilder) (Object) stackIn_8_1).append(stackIn_9_2).append(')').toString());
          }
        } catch (RuntimeException | Error decompiledUncheckedException) {
          throw decompiledUncheckedException;
        } catch (Throwable decompiledCheckedException) {
          throw new RuntimeException(decompiledCheckedException);
        }
    }

    final static mi a(int param0) {
        if (param0 != 15000) {
          return (mi) null;
        }
        return vh.field_a;
    }

    pk(int param0, int param1, int param2, int param3, int param4) {
        this.field_u = param2;
        this.field_n = param3;
        this.field_s = param4;
        this.field_p = param0;
        this.field_t = param1;
    }

    static {
        field_r = 0;
    }
}
