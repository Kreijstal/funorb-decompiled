/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class br extends kp implements ik {
    static ve field_Y;
    static String field_W;
    static String field_S;
    private of field_Z;
    static int field_X;
    private int field_V;
    static int field_Q;
    static boolean field_R;
    static int field_T;
    static int field_U;

    final static void a(java.awt.Frame param0, jj param1, int param2) {
        wk var3 = null;
        int var4 = 0;
        RuntimeException stackIn_12_0 = null;
        StringBuilder stackIn_12_1 = null;
        String stackIn_13_2 = null;
        StringBuilder stackIn_15_1 = null;
        String stackIn_16_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var3_ref = null;
        var4 = Vertigo2.field_L ? 1 : 0;
        try {
          while (true) {
            var3 = param1.a(false, param0);
            while (var3.field_b == 0) {
              um.a(true, 10L);
            }
            if (var3.field_b != 1) {
              um.a(true, 100L);
              continue;
            }
            break;
          }
          if (param2 != 8) {
            field_Y = (ve) null;
          }
          param0.setVisible(false);
          param0.dispose();
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3_ref = decompiledCaughtException;
          stackIn_12_0 = var3_ref;
          stackIn_12_1 = new StringBuilder().append("br.V(");
          if (param0 == null) {
            stackIn_13_2 = "null";
          } else {
            stackIn_13_2 = "{...}";
          }
          stackIn_15_1 = ((StringBuilder) (Object) stackIn_12_1).append(stackIn_13_2).append(',');
          if (param1 == null) {
            stackIn_16_2 = "null";
          } else {
            stackIn_16_2 = "{...}";
          }
          throw wn.a((Throwable) ((Object) stackIn_12_0), ((StringBuilder) (Object) stackIn_15_1).append(stackIn_16_2).append(',').append(param2).append(')').toString());
        }
    }

    final void h(byte param0) {
        if (param0 <= 16) {
          return;
        }
        super.h((byte) 89);
        if (null != this.field_Z) {
          this.field_Z.b(18340);
        }
    }

    final void a(boolean param0, of param1) {
        try {
          this.field_Z = param1;
          if (!param0) {
            iq var4 = (iq) null;
            this.a((byte) 118, -53, -31, (iq) null);
          }
        } catch (RuntimeException runtimeException) {
          throw wn.a((Throwable) ((Object) runtimeException), "br.U(" + param0 + ',' + (param1 != null ? "{...}" : "null") + ')');
        }
    }

    final static int b(int param0, byte param1) {
        if (param1 != 48) {
          field_U = -18;
          return param0;
        }
        return param0;
    }

    final static String a(String param0, int param1, int param2) {
        RuntimeException var3 = null;
        int var4 = 0;
        mi var5 = null;
        CharSequence var6 = null;
        String stackIn_3_0 = null;
        String stackIn_6_0 = null;
        String stackIn_10_0 = null;
        String stackIn_13_0 = null;
        String stackIn_17_0 = null;
        String stackIn_21_0 = null;
        Object stackIn_23_0 = null;
        RuntimeException stackIn_26_0 = null;
        StringBuilder stackIn_26_1 = null;
        String stackIn_27_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          var6 = (CharSequence) ((Object) param0);
          if (!hi.a((byte) 122, var6)) {
            stackIn_3_0 = or.field_a;
            return stackIn_3_0;
          }
          if (wc.a(param0, true)) {
            stackIn_6_0 = Vertigo2.field_K;
            return stackIn_6_0;
          }
          if (2 != ba.field_d) {
            stackIn_10_0 = jf.field_J;
            return stackIn_10_0;
          }
          if (iq.b(param0, 109)) {
            stackIn_13_0 = Vertigo2.a(new String[]{param0}, lk.field_f, 55);
            return stackIn_13_0;
          }
          if (vd.field_a >= param2) {
            stackIn_17_0 = eb.field_i;
            return stackIn_17_0;
          }
          if (c.a(param0, (byte) -116)) {
            stackIn_21_0 = Vertigo2.a(new String[]{param0}, wb.field_C, -4);
            return stackIn_21_0;
          }
          var5 = uh.field_Wb;
          var5.j(param1, 127);
          var5.field_u = var5.field_u + 1;
          var4 = var5.field_u;
          var5.f(2, -92);
          var5.a((byte) 0, param0);
          var5.b((byte) -98, var5.field_u - var4);
          stackIn_23_0 = null;
          return (String) (stackIn_23_0);
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3 = decompiledCaughtException;
          stackIn_26_0 = var3;
          stackIn_26_1 = new StringBuilder().append("br.W(");
          if (param0 == null) {
            stackIn_27_2 = "null";
          } else {
            stackIn_27_2 = "{...}";
          }
          throw wn.a((Throwable) ((Object) stackIn_26_0), ((StringBuilder) (Object) stackIn_26_1).append(stackIn_27_2).append(',').append(param1).append(',').append(param2).append(')').toString());
        }
    }

    final void a(byte param0, int param1, int param2, iq param3) {
        try {
          super.a((byte) 45, param1, param2, param3);
          if (param0 < 6) {
            jj var6 = (jj) null;
            br.a((java.awt.Frame) null, (jj) null, -16);
          }
          this.field_V = -param1 + (-this.field_o + ed.field_n);
        } catch (RuntimeException runtimeException) {
          throw wn.a((Throwable) ((Object) runtimeException), "br.E(" + param0 + ',' + param1 + ',' + param2 + ',' + (param3 != null ? "{...}" : "null") + ')');
        }
    }

    public static void n(int param0) {
        field_W = null;
        field_Y = null;
        if (param0 != -17131) {
          return;
        }
        field_S = null;
    }

    final String a(boolean param0) {
        if (!this.field_p) {
          return null;
        }
        if (this.field_q == null) {
          return null;
        }
        if (!param0) {
          jn.a(gb.field_d, -4765, ed.field_n - (-this.field_n + this.field_V));
          return this.field_q;
        }
        br.b(-110, (byte) -108);
        jn.a(gb.field_d, -4765, ed.field_n - (-this.field_n + this.field_V));
        return this.field_q;
    }

    public final of a(byte param0) {
        if (param0 != -5) {
          field_U = -34;
          return this.field_Z;
        }
        return this.field_Z;
    }

    br(String param0, uf param1, int param2) {
        super(param0, param1, param2);
    }

    static {
        field_W = "Quick Chat Help";
        field_S = "Please enter your age in years";
        field_Y = new ve(8, 0, 4, 1);
    }
}
