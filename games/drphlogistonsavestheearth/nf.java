/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class nf extends ei {
    static vd field_x;
    private kl field_r;
    static he[] field_p;
    static int field_w;
    static String[] field_q;
    static he[] field_s;
    static int field_u;
    static he field_v;
    static int field_t;

    final vh a(int param0, String param1) {
        qi var3 = null;
        RuntimeException var3_ref = null;
        vh stackIn_4_0 = null;
        vh stackIn_7_0 = null;
        vh stackIn_11_0 = null;
        RuntimeException stackIn_14_0 = null;
        StringBuilder stackIn_14_1 = null;
        String stackIn_15_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          if (this.field_r instanceof ud) {
            var3 = ((ud) ((Object) this.field_r)).a((byte) 87);
            if (var3 != null &&
              var3.a(-12317) != ce.field_e) {
              stackIn_4_0 = u.field_b;
              return stackIn_4_0;
            }
          }
          if (param0 != 8192) {
            stackIn_7_0 = (vh) null;
            return stackIn_7_0;
          }
          if (!param1.equals(this.field_r.field_p)) {
            stackIn_11_0 = u.field_b;
          } else {
            stackIn_11_0 = ce.field_e;
          }
          return stackIn_11_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3_ref = decompiledCaughtException;
          stackIn_14_0 = var3_ref;
          stackIn_14_1 = new StringBuilder().append("nf.G(").append(param0).append(',');
          if (param1 == null) {
            stackIn_15_2 = "null";
          } else {
            stackIn_15_2 = "{...}";
          }
          throw ie.a((Throwable) ((Object) stackIn_14_0), ((StringBuilder) (Object) stackIn_14_1).append(stackIn_15_2).append(')').toString());
        }
    }

    nf(kl param0, kl param1) {
        super(param0);
        try {
          this.field_r = param1;
        } catch (RuntimeException runtimeException) {
          throw ie.a((Throwable) ((Object) runtimeException), "nf.<init>(" + (param0 != null ? "{...}" : "null") + ',' + (param1 != null ? "{...}" : "null") + ')');
        }
    }

    final static int c(boolean param0) {
        if (param0) {
          field_x = (vd) null;
          return dk.field_c;
        }
        return dk.field_c;
    }

    final static String e(byte param0) {
        if (hg.field_ub == fk.field_q) {
          return bg.field_q;
        }
        if (!ib.field_f.a(false)) {
          return ib.field_f.a((byte) -58);
        }
        if (hg.field_ub == lc.field_h) {
          return ib.field_f.a((byte) -58);
        }
        if (param0 >= 125) {
          return qf.field_c;
        }
        field_x = (vd) null;
        return qf.field_c;
    }

    final String a(byte param0, String param1) {
        qi var3 = null;
        RuntimeException var3_ref = null;
        String stackIn_6_0 = null;
        String stackIn_8_0 = null;
        String stackIn_11_0 = null;
        Object stackIn_15_0 = null;
        RuntimeException stackIn_18_0 = null;
        StringBuilder stackIn_18_1 = null;
        String stackIn_19_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          if (this.field_r instanceof ud) {
            var3 = ((ud) ((Object) this.field_r)).a((byte) 74);
            if (var3 != null) {
              if (var3.a(-12317) == ce.field_e &&
                !param1.equals(this.field_r.field_p)) {
                stackIn_6_0 = ih.field_N;
                return stackIn_6_0;
              }
              stackIn_8_0 = var3.b(-16034);
              return stackIn_8_0;
            }
          }
          if (!param1.equals(this.field_r.field_p)) {
            stackIn_11_0 = ih.field_N;
            return stackIn_11_0;
          }
          if (param0 >= 47) {
            return null;
          }
          nf.d((byte) -95);
          stackIn_15_0 = null;
          return (String) (stackIn_15_0);
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3_ref = decompiledCaughtException;
          stackIn_18_0 = var3_ref;
          stackIn_18_1 = new StringBuilder().append("nf.D(").append(param0).append(',');
          if (param1 == null) {
            stackIn_19_2 = "null";
          } else {
            stackIn_19_2 = "{...}";
          }
          throw ie.a((Throwable) ((Object) stackIn_18_0), ((StringBuilder) (Object) stackIn_18_1).append(stackIn_19_2).append(')').toString());
        }
    }

    public static void d(byte param0) {
        field_s = null;
        field_x = null;
        if (param0 == -95) {
          field_p = null;
          field_v = null;
          field_q = null;
          return;
        }
        nf.b(true);
        field_p = null;
        field_v = null;
        field_q = null;
    }

    final static java.awt.Container b(boolean param0) {
        if (param0) {
          field_v = (he) null;
          if (null == bb.field_a) {
            return (java.awt.Container) ((Object) nb.a(119));
          }
          return (java.awt.Container) ((Object) bb.field_a);
        }
        if (null == bb.field_a) {
          return (java.awt.Container) ((Object) nb.a(119));
        }
        return (java.awt.Container) ((Object) bb.field_a);
    }

    static {
        field_w = 0;
        field_x = new vd();
        field_q = new String[]{"Sun", "Mon", "Tue", "Wed", "Thu", "Fri", "Sat"};
    }
}
