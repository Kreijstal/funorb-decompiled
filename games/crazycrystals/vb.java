/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class vb extends pn implements Cloneable {
    static long field_m;

    final void a(int param0, int param1, int param2, f[][] param3, int param4, int param5, int param6, int param7) {
        try {
          if (param0 < 92) {
            this.a(true, false);
          }
        } catch (RuntimeException runtimeException) {
          throw dn.a((Throwable) ((Object) runtimeException), "vb.HA(" + param0 + ',' + param1 + ',' + param2 + ',' + (param3 != null ? "{...}" : "null") + ',' + param4 + ',' + param5 + ',' + param6 + ',' + param7 + ')');
        }
    }

    final int a(boolean param0, boolean param1) {
        if (!param0) {
          return -17;
        }
        return 2;
    }

    final nj a(int param0, nj param1) {
        RuntimeException var3 = null;
        nj stackIn_3_0 = null;
        RuntimeException stackIn_6_0 = null;
        StringBuilder stackIn_6_1 = null;
        String stackIn_7_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          if (param0 != 23525) {
            this.b(-84, -83, 69, false, 69, 108);
          }
          stackIn_3_0 = ng.a(dq.field_F, param1, new vb(new kp(-1)), (byte) -83, nk.field_m);
          return stackIn_3_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3 = decompiledCaughtException;
          stackIn_6_0 = var3;
          stackIn_6_1 = new StringBuilder().append("vb.V(").append(param0).append(',');
          if (param1 == null) {
            stackIn_7_2 = "null";
          } else {
            stackIn_7_2 = "{...}";
          }
          throw dn.a((Throwable) ((Object) stackIn_6_0), ((StringBuilder) (Object) stackIn_6_1).append(stackIn_7_2).append(')').toString());
        }
    }

    final f a(int param0, ea param1, int param2, int param3, byte param4, int param5, f[][] param6) {
        RuntimeException var8 = null;
        f stackIn_3_0 = null;
        RuntimeException stackIn_6_0 = null;
        StringBuilder stackIn_6_1 = null;
        String stackIn_7_2 = null;
        StringBuilder stackIn_9_1 = null;
        String stackIn_10_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          if (param4 >= -87) {
            field_m = 115L;
          }
          mb.field_g = mb.field_g - ob.field_l;
          wd.field_j = wd.field_j - 1;
          fn.field_h.a(256, 12 * (param5 + param2), (param0 + param3) * 12, 0, (byte) -111);
          this.field_l.a((byte) 92, param1);
          stackIn_3_0 = this.field_l.a(param0, param1, param2, param3, (byte) -109, param5, param6);
          return stackIn_3_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var8 = decompiledCaughtException;
          stackIn_6_0 = var8;
          stackIn_6_1 = new StringBuilder().append("vb.Q(").append(param0).append(',');
          if (param1 == null) {
            stackIn_7_2 = "null";
          } else {
            stackIn_7_2 = "{...}";
          }
          stackIn_9_1 = ((StringBuilder) (Object) stackIn_6_1).append(stackIn_7_2).append(',').append(param2).append(',').append(param3).append(',').append(param4).append(',').append(param5).append(',');
          if (param6 == null) {
            stackIn_10_2 = "null";
          } else {
            stackIn_10_2 = "{...}";
          }
          throw dn.a((Throwable) ((Object) stackIn_6_0), ((StringBuilder) (Object) stackIn_9_1).append(stackIn_10_2).append(')').toString());
        }
    }

    vb(f param0) {
        super(param0);
    }

    final f a(f param0, int param1, int param2, f[][] param3, dl[] param4, byte param5) {
        RuntimeException var7 = null;
        ig stackIn_3_0 = null;
        RuntimeException stackIn_6_0 = null;
        StringBuilder stackIn_6_1 = null;
        String stackIn_7_2 = null;
        StringBuilder stackIn_9_1 = null;
        String stackIn_10_2 = null;
        StringBuilder stackIn_12_1 = null;
        String stackIn_13_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          we.field_h = we.field_h + 24;
          fp.field_a = fp.field_a + 24;
          je.field_j = je.field_j + 12;
          b.field_a = b.field_a + 12;
          if (param5 != -87) {
            field_m = -6L;
          }
          cn.field_e.a(64, 12 * param2, 12 * param1, 0, (byte) -111);
          stackIn_3_0 = new ig(param0, bd.field_n, this.field_l, true);
          return (f) ((Object) stackIn_3_0);
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var7 = decompiledCaughtException;
          stackIn_6_0 = var7;
          stackIn_6_1 = new StringBuilder().append("vb.H(");
          if (param0 == null) {
            stackIn_7_2 = "null";
          } else {
            stackIn_7_2 = "{...}";
          }
          stackIn_9_1 = ((StringBuilder) (Object) stackIn_6_1).append(stackIn_7_2).append(',').append(param1).append(',').append(param2).append(',');
          if (param3 == null) {
            stackIn_10_2 = "null";
          } else {
            stackIn_10_2 = "{...}";
          }
          stackIn_12_1 = ((StringBuilder) (Object) stackIn_9_1).append(stackIn_10_2).append(',');
          if (param4 == null) {
            stackIn_13_2 = "null";
          } else {
            stackIn_13_2 = "{...}";
          }
          throw dn.a((Throwable) ((Object) stackIn_6_0), ((StringBuilder) (Object) stackIn_12_1).append(stackIn_13_2).append(',').append(param5).append(')').toString());
        }
    }

    final void b(int param0, int param1, int param2, boolean param3, int param4, int param5) {
        int var7 = -78 % ((74 - param0) / 41);
        if (param1 != 24) {
          de.field_k.b(param4, param5 - param2, 2 * param1, 3 * param2);
          return;
        }
        if (24 == param2) {
          de.field_k.a(param4, -param2 + param5);
          return;
        }
        de.field_k.b(param4, param5 - param2, 2 * param1, 3 * param2);
    }

    final f a(int param0, byte param1, int param2) {
        if (param1 != -110) {
          return (f) null;
        }
        return (f) (this);
    }

    static {
    }
}
