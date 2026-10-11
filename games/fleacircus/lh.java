/*
 * Decompiled by CFR-JS 0.4.0.
 */
class lh {
    static fa field_b;
    lh field_a;
    static String field_d;
    static sk field_g;
    long field_c;
    static int[][] field_e;
    static int field_f;
    lh field_h;

    final boolean b(byte param0) {
        if (null == this.field_a) {
          return false;
        }
        if (param0 == -54) {
          return true;
        }
        lh.a(-118, -117, -87, false, -11, -87, -1);
        return true;
    }

    final static void a(boolean param0) {
        if (rh.field_p == null) {
          return;
        }
        lh.a((byte) -97, rh.field_p);
        rh.field_p.a(fg.field_q, 20401);
        rh.field_p = null;
        if (aa.field_r != null) {
          aa.field_r.a(-115);
          ol.field_e.requestFocus();
          if (param0) {
            field_e = (int[][]) null;
            return;
          }
          return;
        }
        ol.field_e.requestFocus();
        if (!param0) {
          return;
        }
        field_e = (int[][]) null;
    }

    final void c(int param0) {
        if (this.field_a == null) {
          return;
        }
        if (param0 == -1) {
          this.field_a.field_h = this.field_h;
          this.field_h.field_a = this.field_a;
          this.field_h = null;
          this.field_a = null;
          return;
        }
    }

    public static void b(int param0) {
        field_b = null;
        field_e = (int[][]) null;
        field_g = null;
        field_d = null;
        if (param0 != 1) {
          field_b = (fa) null;
        }
    }

    final static dd[] a(int param0, int param1, byte param2, int param3) {
        int var4 = 22 % ((-22 - param2) / 59);
        return cb.a(1, param0, 0, param3, param1);
    }

    final static void a(byte param0, java.awt.Canvas param1) {
        RuntimeException var2 = null;
        RuntimeException stackIn_7_0 = null;
        StringBuilder stackIn_7_1 = null;
        String stackIn_8_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          ca.a((java.awt.Component) ((Object) param1), (byte) 83);
          ui.a((java.awt.Component) ((Object) param1), 122);
          if (param0 >= -4) {
            field_f = 38;
          }
          if (ui.field_pb == null) {
            return;
          }
          ui.field_pb.a((byte) 103, (java.awt.Component) ((Object) param1));
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2 = decompiledCaughtException;
          stackIn_7_0 = var2;
          stackIn_7_1 = new StringBuilder().append("lh.PC(").append(param0).append(',');
          if (param1 == null) {
            stackIn_8_2 = "null";
          } else {
            stackIn_8_2 = "{...}";
          }
          throw pf.a((Throwable) ((Object) stackIn_7_0), ((StringBuilder) (Object) stackIn_7_1).append(stackIn_8_2).append(')').toString());
        }
    }

    final static boolean a(String param0, String param1, int param2) {
        RuntimeException var3 = null;
        RuntimeException stackIn_27_0 = null;
        StringBuilder stackIn_27_1 = null;
        String stackIn_28_2 = null;
        StringBuilder stackIn_30_1 = null;
        String stackIn_31_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          if (fm.a(true, param0)) {
            return false;
          }
          if (hg.a(param0, 1)) {
            return false;
          }
          if (o.a(false, param0)) {
            return false;
          }
          if (~param1.length() == param2) {
            return true;
          }
          if (hj.a(param0, param1, 0)) {
            return false;
          }
          if (hf.a((byte) 98, param0, param1)) {
            return false;
          }
          if (!gl.a(param1, -1, param0)) {
            return true;
          }
          return false;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3 = decompiledCaughtException;
          stackIn_27_0 = var3;
          stackIn_27_1 = new StringBuilder().append("lh.UC(");
          if (param0 == null) {
            stackIn_28_2 = "null";
          } else {
            stackIn_28_2 = "{...}";
          }
          stackIn_30_1 = ((StringBuilder) (Object) stackIn_27_1).append(stackIn_28_2).append(',');
          if (param1 == null) {
            stackIn_31_2 = "null";
          } else {
            stackIn_31_2 = "{...}";
          }
          throw pf.a((Throwable) ((Object) stackIn_27_0), ((StringBuilder) (Object) stackIn_30_1).append(stackIn_31_2).append(',').append(param2).append(')').toString());
        }
    }

    final static boolean a(int param0, int param1, int param2, boolean param3, int param4, int param5, int param6) {
        if (!param3) {
          lh.a(-73, 30, -70, true, -43, 84, 103);
          if (param5 < param4) {
            return false;
          }
          if (param5 >= param4 + param2) {
            return false;
          }
          if (param6 < param0) {
            return false;
          }
          if (param6 < param1 + param0) {
            return true;
          }
          return false;
        }
        if (param5 < param4) {
          return false;
        }
        if (param5 >= param4 + param2) {
          return false;
        }
        if (param6 < param0) {
          return false;
        }
        if (param6 < param1 + param0) {
          return true;
        }
        return false;
    }

    static {
        field_e = new int[160][100];
        field_d = "Use this alternative as your account name";
    }
}
