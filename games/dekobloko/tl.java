/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class tl extends wm {
    private boolean field_p;
    static ck[] field_u;
    static String field_x;
    static String field_s;
    static ck[] field_w;
    static int[] field_q;
    static String field_r;
    private String field_t;
    private re field_v;

    final static boolean b(int param0, int param1, int param2) {
        if (13 == wh.field_c) {
          qn.l(param1 - 89);
          return true;
        }
        if (wh.field_c == param1) {
          mg.field_bc.e(0);
          return true;
        }
        if (null == mg.field_bc) {
          return false;
        }
        if (mg.field_bc.b(param2, 15028, param0)) {
          return true;
        }
        return false;
    }

    final tb b(String param0, byte param1) {
        ta var3 = null;
        RuntimeException var3_ref = null;
        tb stackIn_2_0 = null;
        tb stackIn_7_0 = null;
        tb stackIn_12_0 = null;
        RuntimeException stackIn_15_0 = null;
        StringBuilder stackIn_15_1 = null;
        String stackIn_16_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          if (this.field_v.b(param0, param1) == vm.field_u) {
            stackIn_2_0 = vm.field_u;
            return stackIn_2_0;
          }
          if (!param0.equals(this.field_t)) {
            var3 = ik.a(103, param0);
            if (!var3.a(103)) {
              stackIn_7_0 = jb.field_j;
              return stackIn_7_0;
            }
            this.field_t = param0;
            this.field_p = var3.b(-3348);
          }
          if (this.field_p) {
            stackIn_12_0 = dc.field_b;
          } else {
            stackIn_12_0 = vm.field_u;
          }
          return stackIn_12_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3_ref = decompiledCaughtException;
          stackIn_15_0 = var3_ref;
          stackIn_15_1 = new StringBuilder().append("tl.B(");
          if (param0 == null) {
            stackIn_16_2 = "null";
          } else {
            stackIn_16_2 = "{...}";
          }
          throw dh.a((Throwable) ((Object) stackIn_15_0), ((StringBuilder) (Object) stackIn_15_1).append(stackIn_16_2).append(',').append(param1).append(')').toString());
        }
    }

    public static void g(byte param0) {
        field_w = null;
        field_r = null;
        if (param0 < -59) {
          field_s = null;
          field_x = null;
          field_q = null;
          field_u = null;
          return;
        }
        field_w = (ck[]) null;
        field_s = null;
        field_x = null;
        field_q = null;
        field_u = null;
    }

    tl(rk param0, rk param1) {
        super(param0);
        this.field_t = "";
        this.field_p = false;
        try {
          this.field_v = new re(param0, param1);
        } catch (RuntimeException runtimeException) {
          throw dh.a((Throwable) ((Object) runtimeException), "tl.<init>(" + (param0 != null ? "{...}" : "null") + ',' + (param1 != null ? "{...}" : "null") + ')');
        }
    }

    final String a(String param0, byte param1) {
        RuntimeException var3 = null;
        String stackIn_5_0 = null;
        String stackIn_9_0 = null;
        RuntimeException stackIn_12_0 = null;
        StringBuilder stackIn_12_1 = null;
        String stackIn_13_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          if (param1 != -11) {
            field_s = (String) null;
          }
          if (this.field_v.b(param0, (byte) -40) == vm.field_u) {
            stackIn_5_0 = this.field_v.a(param0, (byte) -11);
            return stackIn_5_0;
          }
          if (this.b(param0, (byte) -40) != vm.field_u) {
            return li.field_a;
          }
          stackIn_9_0 = dd.field_m;
          return stackIn_9_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3 = decompiledCaughtException;
          stackIn_12_0 = var3;
          stackIn_12_1 = new StringBuilder().append("tl.A(");
          if (param0 == null) {
            stackIn_13_2 = "null";
          } else {
            stackIn_13_2 = "{...}";
          }
          throw dh.a((Throwable) ((Object) stackIn_12_0), ((StringBuilder) (Object) stackIn_12_1).append(stackIn_13_2).append(',').append(param1).append(')').toString());
        }
    }

    static {
        field_x = "This option cannot be combined with the current settings for:  ";
        field_q = new int[5];
        field_s = "Ignore";
        field_r = "You can spectate this game";
    }
}
