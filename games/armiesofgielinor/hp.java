/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class hp extends oj {
    int field_y;
    int field_D;
    private boolean field_z;
    static wk field_A;
    private boolean field_B;

    final static void a(li param0, int param1, int param2) {
        RuntimeException var3 = null;
        int var4 = 0;
        bv var5 = null;
        RuntimeException stackIn_8_0 = null;
        StringBuilder stackIn_8_1 = null;
        String stackIn_9_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          var5 = vl.field_n;
          var5.h(32161, param1);
          var5.field_q = var5.field_q + 1;
          var4 = var5.field_q;
          var5.b(1, 1);
          if (null == param0.field_l) {
            var5.b(param2 - 25521, 0);
          } else {
            var5.b(1, param0.field_l.length);
            var5.a(param0.field_l, 0, param0.field_l.length, 86);
          }
          var5.b((byte) -39, var4);
          var5.field_q = var5.field_q - 4;
          param0.field_o = var5.i(param2 ^ 25523);
          var5.e(-var4 + var5.field_q, 5930);
          if (param2 == 25522) {
            return;
          }
          field_A = (wk) null;
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3 = decompiledCaughtException;
          stackIn_8_0 = var3;
          stackIn_8_1 = new StringBuilder().append("hp.B(");
          if (param0 == null) {
            stackIn_9_2 = "null";
          } else {
            stackIn_9_2 = "{...}";
          }
          throw ig.a((Throwable) ((Object) stackIn_8_0), ((StringBuilder) (Object) stackIn_8_1).append(stackIn_9_2).append(',').append(param1).append(',').append(param2).append(')').toString());
        }
    }

    public static void g(int param0) {
        field_A = null;
        if (param0 >= -80) {
          field_A = (wk) null;
        }
    }

    final boolean a(at param0, byte param1, ic param2) {
        RuntimeException var4 = null;
        String var5 = null;
        nn stackIn_6_0 = null;
        boolean stackIn_7_1 = false;
        boolean stackIn_9_0 = false;
        RuntimeException stackIn_12_0 = null;
        StringBuilder stackIn_12_1 = null;
        String stackIn_13_2 = null;
        StringBuilder stackIn_15_1 = null;
        String stackIn_16_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          this.a(param2.field_xb, -26661);
          if (param1 > -84) {
            var5 = (String) null;
            hp.a((int[]) null, (int[]) null, (String) null, 40);
          }
          if (param2.field_T != null) {
            stackIn_6_0 = param2.field_vb;
            stackIn_7_1 = (null == param2.field_oc);
            ((nn) (Object) stackIn_6_0).a(stackIn_7_1, 32, param2.field_q, param2.field_T, param2.field_vb.field_y, param2.field_vb.field_p);
          }
          stackIn_9_0 = this.a((byte) -39, param2, param0, true);
          return stackIn_9_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var4 = decompiledCaughtException;
          stackIn_12_0 = var4;
          stackIn_12_1 = new StringBuilder().append("hp.A(");
          if (param0 == null) {
            stackIn_13_2 = "null";
          } else {
            stackIn_13_2 = "{...}";
          }
          stackIn_15_1 = ((StringBuilder) (Object) stackIn_12_1).append(stackIn_13_2).append(',').append(param1).append(',');
          if (param2 == null) {
            stackIn_16_2 = "null";
          } else {
            stackIn_16_2 = "{...}";
          }
          throw ig.a((Throwable) ((Object) stackIn_12_0), ((StringBuilder) (Object) stackIn_15_1).append(stackIn_16_2).append(')').toString());
        }
    }

    final String a(byte param0, boolean param1) {
        int var3 = 0;
        String var4 = null;
        String var4Lifetime1;
        String var4Lifetime2;
        int var3Lifetime1;
        int var3Lifetime2;
        if (!param1) {
          var3 = 58 / ((53 - param0) / 51);
          var4 = "EventDeath: pos: (" + this.field_y + "," + this.field_D + ")";
          return var4;
        }
        System.out.println("Death event debug");
        System.out.println("Unit at " + this.field_y + "," + this.field_D);
        if (this.field_z) {
          System.out.println("Bones devoured");
          var3Lifetime1 = 58 / ((53 - param0) / 51);
          var4Lifetime1 = "EventDeath: pos: (" + this.field_y + "," + this.field_D + ")";
          return var4Lifetime1;
        }
        var3Lifetime2 = 58 / ((53 - param0) / 51);
        var4Lifetime2 = "EventDeath: pos: (" + this.field_y + "," + this.field_D + ")";
        return var4Lifetime2;
    }

    hp(int param0, int param1) {
        this.field_B = false;
        this.field_z = false;
        this.field_y = param0;
        this.field_D = param1;
        this.field_m = 10;
        this.field_w = null;
    }

    final static wk a(int[] param0, int[] param1, String param2, int param3) {
        RuntimeException var4 = null;
        wk stackIn_2_0 = null;
        nj stackIn_4_0 = null;
        RuntimeException stackIn_7_0 = null;
        StringBuilder stackIn_7_1 = null;
        String stackIn_8_2 = null;
        StringBuilder stackIn_10_1 = null;
        String stackIn_11_2 = null;
        StringBuilder stackIn_13_1 = null;
        String stackIn_14_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          no.field_P.field_v = qn.field_g;
          no.field_P.field_B = qn.field_d;
          no.field_P.field_y = qn.field_l;
          ku.field_J.b();
          qn.b();
          dm.a(-1, -1, param1, -1, false, param0, -1, false, 0, false, 0, param2);
          no.field_P.b();
          if (param3 == 17813) {
            stackIn_4_0 = ew.a((byte) 107, ku.field_J);
            return (wk) ((Object) stackIn_4_0);
          }
          stackIn_2_0 = (wk) null;
          return stackIn_2_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var4 = decompiledCaughtException;
          stackIn_7_0 = var4;
          stackIn_7_1 = new StringBuilder().append("hp.E(");
          if (param0 == null) {
            stackIn_8_2 = "null";
          } else {
            stackIn_8_2 = "{...}";
          }
          stackIn_10_1 = ((StringBuilder) (Object) stackIn_7_1).append(stackIn_8_2).append(',');
          if (param1 == null) {
            stackIn_11_2 = "null";
          } else {
            stackIn_11_2 = "{...}";
          }
          stackIn_13_1 = ((StringBuilder) (Object) stackIn_10_1).append(stackIn_11_2).append(',');
          if (param2 == null) {
            stackIn_14_2 = "null";
          } else {
            stackIn_14_2 = "{...}";
          }
          throw ig.a((Throwable) ((Object) stackIn_7_0), ((StringBuilder) (Object) stackIn_13_1).append(stackIn_14_2).append(',').append(param3).append(')').toString());
        }
    }

    hp(jd param0) {
        this.field_B = false;
        try {
          this.field_D = param0.field_w;
          this.field_y = param0.field_J;
          this.field_w = param0;
          this.field_m = 10;
          this.field_z = false;
        } catch (RuntimeException runtimeException) {
          throw ig.a((Throwable) ((Object) runtimeException), "hp.<init>(" + (param0 != null ? "{...}" : "null") + ')');
        }
    }

    final void a(ha param0, int param1) {
        RuntimeException var3 = null;
        jd stackIn_8_0 = null;
        boolean stackIn_9_1 = false;
        RuntimeException stackIn_15_0 = null;
        StringBuilder stackIn_15_1 = null;
        String stackIn_16_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          if (this.field_B) {
            return;
          }
          this.field_B = true;
          if (null == this.field_w) {
            this.field_w = param0.c(this.field_D, true, this.field_y);
          }
          if (this.field_w != null) {
            stackIn_8_0 = this.field_w;
            stackIn_9_1 = !(this.field_z);
            ((jd) (Object) stackIn_8_0).a(stackIn_9_1, (byte) 105);
          }
          hf.a(param0, (byte) 9, true);
          if (param1 == -26661) {
            return;
          }
          field_A = (wk) null;
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3 = decompiledCaughtException;
          stackIn_15_0 = var3;
          stackIn_15_1 = new StringBuilder().append("hp.G(");
          if (param0 == null) {
            stackIn_16_2 = "null";
          } else {
            stackIn_16_2 = "{...}";
          }
          throw ig.a((Throwable) ((Object) stackIn_15_0), ((StringBuilder) (Object) stackIn_15_1).append(stackIn_16_2).append(',').append(param1).append(')').toString());
        }
    }

    hp(jd param0, boolean param1) {
        this.field_B = false;
        try {
          this.field_z = param1 ? true : false;
          this.field_m = 10;
          this.field_D = param0.field_w;
          this.field_y = param0.field_J;
          this.field_w = param0;
        } catch (RuntimeException runtimeException) {
          throw ig.a((Throwable) ((Object) runtimeException), "hp.<init>(" + (param0 != null ? "{...}" : "null") + ',' + param1 + ')');
        }
    }

    static {
    }
}
