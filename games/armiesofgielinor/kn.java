/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class kn extends oj {
    static int field_z;
    static String field_y;

    final boolean b(ha param0, int param1) {
        RuntimeException var3 = null;
        boolean stackIn_6_0 = false;
        RuntimeException stackIn_9_0 = null;
        StringBuilder stackIn_9_1 = null;
        String stackIn_10_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          if (param1 == -75) {
            stackIn_6_0 = (param0.field_Eb[this.field_w.field_w * param0.field_v + this.field_w.field_J].field_c != null);
            return stackIn_6_0;
          }
          return false;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3 = decompiledCaughtException;
          stackIn_9_0 = var3;
          stackIn_9_1 = new StringBuilder().append("kn.B(");
          if (param0 == null) {
            stackIn_10_2 = "null";
          } else {
            stackIn_10_2 = "{...}";
          }
          throw ig.a((Throwable) ((Object) stackIn_9_0), ((StringBuilder) (Object) stackIn_9_1).append(stackIn_10_2).append(',').append(param1).append(')').toString());
        }
    }

    public static void g(int param0) {
        field_y = null;
        if (param0 != -75) {
          kn.g(-9);
        }
    }

    final String a(byte param0, boolean param1) {
        String var3 = null;
        int var4 = 0;
        String var3Lifetime1;
        int var4Lifetime1;
        if (!param1) {
          if (null == this.field_w) {
            var3 = "EventTelefrag: unit: null";
          } else {
            var3 = "EventTelefrag: pos: (" + this.field_w.field_J + "," + this.field_w.field_w + ")";
          }
          var4 = -50 % ((53 - param0) / 51);
          return var3;
        }
        System.out.println("Teleport reappear event debug");
        System.out.println("Unit at " + this.field_w.field_J + "," + this.field_w.field_w);
        if (null == this.field_w) {
          var3Lifetime1 = "EventTelefrag: unit: null";
        } else {
          var3Lifetime1 = "EventTelefrag: pos: (" + this.field_w.field_J + "," + this.field_w.field_w + ")";
        }
        var4Lifetime1 = -50 % ((53 - param0) / 51);
        return var3Lifetime1;
    }

    final void a(ha param0, int param1) {
        ne var4 = null;
        ne var3 = null;
        if (param0.field_x) {
          return;
        }
        try {
          var4 = param0.field_Eb[param0.field_v * this.field_w.field_w + this.field_w.field_J];
          var3 = var4;
          if (null != var4.field_c) {
            var4.field_c.a(false, (byte) 105);
          }
          var3.field_c = this.field_w;
          this.field_w.a((byte) 82);
          if (this.field_w.field_N == 74) {
            this.field_w.field_B = 2;
          } else {
            this.field_w.field_B = 1;
          }
          if (param1 != -26661) {
            kn.g(99);
          }
          this.field_w.field_s = true;
          fl.a(param0, -114);
        } catch (RuntimeException runtimeException) {
          throw ig.a((Throwable) ((Object) runtimeException), "kn.G(" + (param0 != null ? "{...}" : "null") + ',' + param1 + ')');
        }
    }

    final boolean a(at param0, byte param1, ic param2) {
        RuntimeException var4 = null;
        boolean stackIn_4_0 = false;
        RuntimeException stackIn_7_0 = null;
        StringBuilder stackIn_7_1 = null;
        String stackIn_8_2 = null;
        StringBuilder stackIn_10_1 = null;
        String stackIn_11_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          if (param1 <= -84) {
            stackIn_4_0 = this.a((byte) -39, param2, param0, true);
            return stackIn_4_0;
          }
          return false;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var4 = decompiledCaughtException;
          stackIn_7_0 = var4;
          stackIn_7_1 = new StringBuilder().append("kn.A(");
          if (param0 == null) {
            stackIn_8_2 = "null";
          } else {
            stackIn_8_2 = "{...}";
          }
          stackIn_10_1 = ((StringBuilder) (Object) stackIn_7_1).append(stackIn_8_2).append(',').append(param1).append(',');
          if (param2 == null) {
            stackIn_11_2 = "null";
          } else {
            stackIn_11_2 = "{...}";
          }
          throw ig.a((Throwable) ((Object) stackIn_7_0), ((StringBuilder) (Object) stackIn_10_1).append(stackIn_11_2).append(')').toString());
        }
    }

    kn(jd param0) {
        try {
          this.field_w = param0;
          this.field_m = 5;
        } catch (RuntimeException runtimeException) {
          throw ig.a((Throwable) ((Object) runtimeException), "kn.<init>(" + (param0 != null ? "{...}" : "null") + ')');
        }
    }

    static {
        field_z = 0;
        field_y = "Game full";
    }
}
