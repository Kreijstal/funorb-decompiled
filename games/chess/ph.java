/*
 * Decompiled by CFR-JS 0.4.0.
 */
import java.util.*;

class ph extends dm {
    private long field_i;
    private String field_e;
    static rk field_l;
    static Random field_d;
    static boolean field_k;
    static jd field_g;
    static String field_m;
    static vj field_j;
    static int field_h;
    static km field_f;

    final void a(p param0, byte param1) {
        try {
          param0.a(param1 ^ -7, this.field_i);
          param0.a(this.field_e, false);
          if (param1 != 123) {
            field_j = (vj) null;
          }
        } catch (RuntimeException runtimeException) {
          throw fk.a((Throwable) ((Object) runtimeException), "ph.D(" + (param0 != null ? "{...}" : "null") + ',' + param1 + ')');
        }
    }

    public static void b(int param0) {
        field_m = null;
        field_f = null;
        field_d = null;
        field_l = null;
        field_g = null;
        if (param0 != 0) {
          return;
        }
        field_j = null;
    }

    ug b(byte param0) {
        if (param0 <= 27) {
          return (ug) null;
        }
        return kn.field_H;
    }

    final static boolean a(int param0, byte param1, String param2, long param3, int[] param4) {
        RuntimeException var6 = null;
        boolean stackIn_8_0 = false;
        RuntimeException stackIn_11_0 = null;
        StringBuilder stackIn_11_1 = null;
        String stackIn_12_2 = null;
        StringBuilder stackIn_14_1 = null;
        String stackIn_15_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          if (param1 != -43) {
            field_j = (vj) null;
          }
          boolean decompiledFrameRemainder0 = true;
          if (param4 != null && (param0 != 2 ||
            kn.a(param2, param3, 29712))) {
            stackIn_8_0 = true;
            decompiledFrameRemainder0 = false;
          }
          else {
            stackIn_8_0 = false;
          }
          return stackIn_8_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var6 = decompiledCaughtException;
          stackIn_11_0 = var6;
          stackIn_11_1 = new StringBuilder().append("ph.N(").append(param0).append(',').append(param1).append(',');
          if (param2 == null) {
            stackIn_12_2 = "null";
          } else {
            stackIn_12_2 = "{...}";
          }
          stackIn_14_1 = ((StringBuilder) (Object) stackIn_11_1).append(stackIn_12_2).append(',').append(param3).append(',');
          if (param4 == null) {
            stackIn_15_2 = "null";
          } else {
            stackIn_15_2 = "{...}";
          }
          throw fk.a((Throwable) ((Object) stackIn_11_0), ((StringBuilder) (Object) stackIn_14_1).append(stackIn_15_2).append(')').toString());
        }
    }

    final static void a(java.awt.Canvas param0, boolean param1, boolean param2) {
        int var3_int = 0;
        RuntimeException var3 = null;
        int var4 = 0;
        RuntimeException stackIn_15_0 = null;
        StringBuilder stackIn_15_1 = null;
        String stackIn_16_2 = null;
        RuntimeException decompiledCaughtException = null;
        var4 = Chess.field_G;
        try {
          if (!param1) {
            field_m = (String) null;
          }
          if (il.field_a < 10) {
            var3_int = 0;
            if (od.field_W) {
              od.field_W = false;
              var3_int = 1;
            }
            wc.a(bb.field_e, var3_int != 0, jd.b(false), lf.i(120), false);
            return;
          }
          if (!mk.b((byte) 109)) {
            wb.b();
            jc.a(240, (byte) -117, 320);
            kf.a(0, (byte) 98, param0, 0);
            return;
          }
          if (rm.field_Q != 0) {
            cg.a(-12, param0);
            return;
          }
          cf.a(84, false, param2);
          kf.a(0, (byte) 98, param0, 0);
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3 = decompiledCaughtException;
          stackIn_15_0 = var3;
          stackIn_15_1 = new StringBuilder().append("ph.M(");
          if (param0 == null) {
            stackIn_16_2 = "null";
          } else {
            stackIn_16_2 = "{...}";
          }
          throw fk.a((Throwable) ((Object) stackIn_15_0), ((StringBuilder) (Object) stackIn_15_1).append(stackIn_16_2).append(',').append(param1).append(',').append(param2).append(')').toString());
        }
    }

    final static boolean a(byte param0, String param1) {
        int var2_int = 0;
        RuntimeException var2 = null;
        boolean stackIn_6_0 = false;
        RuntimeException stackIn_9_0 = null;
        StringBuilder stackIn_9_1 = null;
        String stackIn_10_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          var2_int = 0 % ((-40 - param0) / 41);
          if (null != gi.field_g) {
            stackIn_6_0 = !(param1.toLowerCase().indexOf(gi.field_g.toLowerCase()) < 0);
            return stackIn_6_0;
          }
          return false;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2 = decompiledCaughtException;
          stackIn_9_0 = var2;
          stackIn_9_1 = new StringBuilder().append("ph.L(").append(param0).append(',');
          if (param1 == null) {
            stackIn_10_2 = "null";
          } else {
            stackIn_10_2 = "{...}";
          }
          throw fk.a((Throwable) ((Object) stackIn_9_0), ((StringBuilder) (Object) stackIn_9_1).append(stackIn_10_2).append(')').toString());
        }
    }

    ph(long param0, String param1) {
        try {
          this.field_i = param0;
          this.field_e = param1;
        } catch (RuntimeException runtimeException) {
          throw fk.a((Throwable) ((Object) runtimeException), "ph.<init>(" + param0 + ',' + (param1 != null ? "{...}" : "null") + ')');
        }
    }

    final static void a(int param0) {
        int var2 = Chess.field_G;
        if (param0 != -7125) {
          String var3 = (String) null;
          ph.a((byte) -38, (String) null);
          if (qk.field_h == 0) {
            nh.field_m = true;
            return;
          }
          if (rn.field_b == 2) {
            nh.field_m = false;
            return;
          }
          nh.field_m = true;
          return;
        }
        if (qk.field_h == 0) {
          nh.field_m = true;
          return;
        }
        if (rn.field_b == 2) {
          nh.field_m = false;
          return;
        }
        nh.field_m = true;
    }

    static {
        field_d = new Random();
        field_h = 0;
        field_m = "Members";
        field_g = new jd("email");
    }
}
