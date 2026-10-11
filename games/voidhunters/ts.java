/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class ts {
    private qfa field_b;
    long field_c;
    static String field_a;

    final static void a(int param0) {
        Object var1 = null;
        Throwable decompiledCaughtException = null;
        Object var1_ref = null;
        var1_ref = wj.field_q;
        synchronized (var1_ref) {
          hu.field_b = am.field_q;
          rpa.field_b = rpa.field_b + 1;
          kc.field_b = wt.field_a;
          uia.field_b = kv.field_e;
          upb.field_c = hda.field_a;
          hda.field_a = false;
          pba.field_o = ro.field_a;
          oq.field_H = cma.field_a;
          if (param0 != 1001) {
            return;
          }
          qs.field_a = nlb.field_p;
          ro.field_a = 0;
          ds.field_g = tda.field_K;
        }
    }

    final static void a(boolean param0, int param1) {
        faa var2 = dpa.field_p;
        var2.h(24335, param1);
        var2.c(0, 1);
        var2.c(0, 1);
        if (param0) {
          ts.a(-12);
        }
    }

    ts(qfa param0, long param1, int param2) {
        try {
          this.field_b = param0;
          this.field_c = param1;
        } catch (RuntimeException runtimeException) {
          throw rta.a((Throwable) ((Object) runtimeException), "ts.<init>(" + (param0 != null ? "{...}" : "null") + ',' + param1 + ',' + param2 + ')');
        }
    }

    final static void a(java.awt.Component param0, int param1) {
        if (param1 != 1) {
          return;
        }
        try {
          param0.addMouseListener(wj.field_q);
          param0.addMouseMotionListener(wj.field_q);
          param0.addFocusListener(wj.field_q);
        } catch (RuntimeException runtimeException) {
          throw rta.a((Throwable) ((Object) runtimeException), "ts.B(" + (param0 != null ? "{...}" : "null") + ',' + param1 + ')');
        }
    }

    final static void a(byte param0, eab param1, Object param2) {
        RuntimeException stackIn_17_0 = null;
        StringBuilder stackIn_17_1 = null;
        String stackIn_18_2 = null;
        StringBuilder stackIn_20_1 = null;
        String stackIn_21_2 = null;
        Throwable decompiledCaughtException = null;
        int var3_int = 0;
        Exception var3 = null;
        RuntimeException var3_ref = null;
        int var4 = 0;
        var4 = VoidHunters.field_G;
        try {
          if (param1.field_n == null) {
            return;
          }
          var3_int = 0;
          if (param0 <= 55) {
            return;
          }
          while (var3_int < 50) {
            if (param1.field_n.peekEvent() != null) {
              gdb.b(-84, 1L);
              var3_int++;
              continue;
            }
            break;
          }
          try {
            if (param2 != null) {
              param1.field_n.postEvent((java.awt.AWTEvent) ((Object) new java.awt.event.ActionEvent(param2, 1001, "dummy")));
            }
          } catch (java.lang.Exception decompiledCaughtParameter0) {
            decompiledCaughtException = decompiledCaughtParameter0;
            var3 = (Exception) (Object) decompiledCaughtException;
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter1) {
          decompiledCaughtException = decompiledCaughtParameter1;
          var3_ref = (RuntimeException) (Object) decompiledCaughtException;
          stackIn_17_0 = var3_ref;
          stackIn_17_1 = new StringBuilder().append("ts.E(").append(param0).append(',');
          if (param1 == null) {
            stackIn_18_2 = "null";
          } else {
            stackIn_18_2 = "{...}";
          }
          stackIn_20_1 = ((StringBuilder) (Object) stackIn_17_1).append(stackIn_18_2).append(',');
          if (param2 == null) {
            stackIn_21_2 = "null";
          } else {
            stackIn_21_2 = "{...}";
          }
          throw rta.a((Throwable) ((Object) stackIn_17_0), ((StringBuilder) (Object) stackIn_20_1).append(stackIn_21_2).append(')').toString());
        }
    }

    public static void a(byte param0) {
        if (param0 <= 7) {
          return;
        }
        field_a = null;
    }

    protected final void finalize() throws Throwable {
        this.field_b.a((byte) 18, this.field_c);
        super.finalize();
    }

    static {
        field_a = "Withdraw invitation to <%0> to join this game";
    }
}
