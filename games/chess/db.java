/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class db extends vm {
    static int field_p;
    private boolean field_o;
    static int[] field_n;
    private oc field_q;
    static String[] field_m;
    private String field_l;

    public static void d(boolean param0) {
        field_m = null;
        if (!param0) {
          return;
        }
        field_n = null;
    }

    final static void i(int param0) {
        int var2 = Chess.field_G;
        if (param0 <= -9) {
          if (oc.field_p.field_m) {
            if ((1 << oc.field_p.field_a & oc.field_p.field_B.field_c) != 0) {
              fm.field_R[36] = dj.field_w;
              return;
            }
            if (oc.field_p.field_B.field_c != 0) {
              fm.field_R[36] = ig.field_e;
              return;
            }
            if ((oc.field_p.field_A | 1 << oc.field_p.field_a) == -1 + (1 << oc.field_p.field_B.field_h)) {
              fm.field_R[36] = jc.field_c;
              return;
            }
            fm.field_R[36] = hk.field_J;
            return;
          }
          if ((oc.field_p.field_B.field_c & 1 << oc.field_p.field_a) != 0) {
            fm.field_R[36] = jh.field_d;
            return;
          }
          if (oc.field_p.field_B.field_c != 0) {
            fm.field_R[36] = qa.field_d;
            return;
          }
          if ((1 << oc.field_p.field_B.field_h) - 1 == (oc.field_p.field_A | 1 << oc.field_p.field_a)) {
            fm.field_R[36] = vh.field_h;
            return;
          }
          fm.field_R[36] = od.field_U;
          return;
        }
        db.d(false);
        if (oc.field_p.field_m) {
          if ((1 << oc.field_p.field_a & oc.field_p.field_B.field_c) != 0) {
            fm.field_R[36] = dj.field_w;
            return;
          }
          if (oc.field_p.field_B.field_c != 0) {
            fm.field_R[36] = ig.field_e;
            return;
          }
          if ((oc.field_p.field_A | 1 << oc.field_p.field_a) == -1 + (1 << oc.field_p.field_B.field_h)) {
            fm.field_R[36] = jc.field_c;
            return;
          }
          fm.field_R[36] = hk.field_J;
          return;
        }
        if ((oc.field_p.field_B.field_c & 1 << oc.field_p.field_a) != 0) {
          fm.field_R[36] = jh.field_d;
          return;
        }
        if (oc.field_p.field_B.field_c != 0) {
          fm.field_R[36] = qa.field_d;
          return;
        }
        if ((1 << oc.field_p.field_B.field_h) - 1 == (oc.field_p.field_A | 1 << oc.field_p.field_a)) {
          fm.field_R[36] = vh.field_h;
          return;
        }
        fm.field_R[36] = od.field_U;
    }

    final static void h(int param0) {
        if (param0 != 12082) {
          return;
        }
        if (!ad.field_b) {
          throw new IllegalStateException();
        }
        vh.field_e = true;
        vf.a(true, -125);
        rm.field_Q = 0;
    }

    final String a(String param0, int param1) {
        RuntimeException var3 = null;
        String stackIn_2_0 = null;
        String stackIn_5_0 = null;
        String stackIn_8_0 = null;
        String stackIn_10_0 = null;
        RuntimeException stackIn_13_0 = null;
        StringBuilder stackIn_13_1 = null;
        String stackIn_14_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          if (this.field_q.a((byte) -114, param0) == qk.field_b) {
            stackIn_2_0 = this.field_q.a(param0, -9316);
            return stackIn_2_0;
          }
          if (param1 != -9316) {
            stackIn_5_0 = (String) null;
            return stackIn_5_0;
          }
          if (this.a((byte) -117, param0) != qk.field_b) {
            stackIn_10_0 = ie.field_c;
            return stackIn_10_0;
          }
          stackIn_8_0 = v.field_h;
          return stackIn_8_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3 = decompiledCaughtException;
          stackIn_13_0 = var3;
          stackIn_13_1 = new StringBuilder().append("db.D(");
          if (param0 == null) {
            stackIn_14_2 = "null";
          } else {
            stackIn_14_2 = "{...}";
          }
          throw fk.a((Throwable) ((Object) stackIn_13_0), ((StringBuilder) (Object) stackIn_13_1).append(stackIn_14_2).append(',').append(param1).append(')').toString());
        }
    }

    final mk a(byte param0, String param1) {
        int var3_int = 0;
        RuntimeException var3 = null;
        mh var4 = null;
        mk stackIn_3_0 = null;
        mk stackIn_8_0 = null;
        mk stackIn_13_0 = null;
        RuntimeException stackIn_16_0 = null;
        StringBuilder stackIn_16_1 = null;
        String stackIn_17_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          var3_int = 28 / ((-49 - param0) / 62);
          if (this.field_q.a((byte) -116, param1) == qk.field_b) {
            stackIn_3_0 = qk.field_b;
            return stackIn_3_0;
          }
          if (!param1.equals(this.field_l)) {
            var4 = va.a(26447, param1);
            if (!var4.b((byte) 123)) {
              stackIn_8_0 = ek.field_d;
              return stackIn_8_0;
            }
            this.field_l = param1;
            this.field_o = var4.c(-79);
          }
          if (!this.field_o) {
            stackIn_13_0 = qk.field_b;
          } else {
            stackIn_13_0 = oa.field_a;
          }
          return stackIn_13_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3 = decompiledCaughtException;
          stackIn_16_0 = var3;
          stackIn_16_1 = new StringBuilder().append("db.B(").append(param0).append(',');
          if (param1 == null) {
            stackIn_17_2 = "null";
          } else {
            stackIn_17_2 = "{...}";
          }
          throw fk.a((Throwable) ((Object) stackIn_16_0), ((StringBuilder) (Object) stackIn_16_1).append(stackIn_17_2).append(')').toString());
        }
    }

    final static void a(int param0, int param1, int param2) {
        nk var3 = qn.field_U;
        var3.f(param0, -83);
        var3.c(3, (byte) 83);
        var3.c(9, (byte) 103);
        if (param2 == 28113) {
          var3.b(param1, 113);
          return;
        }
    }

    final static ci j(int param0) {
        if (param0 != -1) {
          db.a(33, 69, -51);
          return se.field_S.field_Kb;
        }
        return se.field_S.field_Kb;
    }

    db(qn param0, qn param1) {
        super(param0);
        this.field_o = false;
        this.field_l = "";
        try {
          this.field_q = new oc(param0, param1);
        } catch (RuntimeException runtimeException) {
          throw fk.a((Throwable) ((Object) runtimeException), "db.<init>(" + (param0 != null ? "{...}" : "null") + ',' + (param1 != null ? "{...}" : "null") + ')');
        }
    }

    static {
        field_p = 0;
        field_n = new int[8192];
    }
}
