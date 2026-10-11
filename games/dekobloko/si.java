/*
 * Decompiled by CFR-JS 0.4.0.
 */
import java.util.*;

final class si implements Iterable {
    static vj field_e;
    int field_a;
    static ck[] field_d;
    static String field_j;
    private bh field_l;
    bh[] field_h;
    static String[] field_f;
    static String field_i;
    static ck field_n;
    static String field_c;
    static String field_k;
    static w[] field_b;
    static String field_g;
    static String field_m;

    final bh a(long param0, byte param1) {
        bh var5 = null;
        int var6 = client.field_A ? 1 : 0;
        bh var4 = this.field_h[(int)(param0 & (long)(this.field_a - 1))];
        this.field_l = var4.field_b;
        while (var4 != this.field_l) {
          if (~param0 == ~this.field_l.field_i) {
            var5 = this.field_l;
            this.field_l = this.field_l.field_b;
            return var5;
          }
          this.field_l = this.field_l.field_b;
        }
        this.field_l = null;
        if (param1 != -37) {
          this.field_a = 79;
          return null;
        }
        return null;
    }

    final void a(long param0, boolean param1, bh param2) {
        bh var5 = null;
        try {
          if (null != param2.field_a) {
            param2.b((byte) 107);
          }
          var5 = this.field_h[(int)(param0 & (long)(this.field_a - 1))];
          param2.field_a = var5.field_a;
          if (param1) {
            field_d = (ck[]) null;
          }
          param2.field_b = var5;
          param2.field_a.field_b = param2;
          param2.field_b.field_a = param2;
          param2.field_i = param0;
        } catch (RuntimeException runtimeException) {
          throw dh.a((Throwable) ((Object) runtimeException), "si.D(" + param0 + ',' + param1 + ',' + (param2 != null ? "{...}" : "null") + ')');
        }
    }

    final static int a(boolean param0, String param1, boolean param2) {
        RuntimeException var3 = null;
        int stackIn_4_0 = 0;
        int stackIn_6_0 = 0;
        RuntimeException stackIn_9_0 = null;
        StringBuilder stackIn_9_1 = null;
        String stackIn_10_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          if (param0) {
            si.a(115, true, -31, -28, 79, (byte) 85, -127);
          }
          if (param2) {
            stackIn_6_0 = bg.field_g.a(param1);
            return stackIn_6_0;
          }
          stackIn_4_0 = rk.field_R.a(param1);
          return stackIn_4_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3 = decompiledCaughtException;
          stackIn_9_0 = var3;
          stackIn_9_1 = new StringBuilder().append("si.K(").append(param0).append(',');
          if (param1 == null) {
            stackIn_10_2 = "null";
          } else {
            stackIn_10_2 = "{...}";
          }
          throw dh.a((Throwable) ((Object) stackIn_9_0), ((StringBuilder) (Object) stackIn_9_1).append(stackIn_10_2).append(',').append(param2).append(')').toString());
        }
    }

    final static void d(int param0) {
        String var2 = null;
        String var2Lifetime1;
        if (cl.field_r != null) {
          cl.field_r.n(22);
          sn.field_k = new cn();
          if (param0 != -31842) {
            var2 = (String) null;
            si.a(true, (String) null, true);
            de.field_W.c(sn.field_k, (byte) 87);
            return;
          }
          de.field_W.c(sn.field_k, (byte) 87);
          return;
        }
        sn.field_k = new cn();
        if (param0 == -31842) {
          de.field_W.c(sn.field_k, (byte) 87);
          return;
        }
        var2Lifetime1 = (String) null;
        si.a(true, (String) null, true);
        de.field_W.c(sn.field_k, (byte) 87);
    }

    final static void a(int param0) {
        if (null != qc.field_s) {
          qc.field_s.a(0);
          qc.field_s = null;
        }
        if (param0 > 57) {
          return;
        }
        String var2 = (String) null;
        si.a(true, (String) null, true);
    }

    final static ck[] a(int param0, int param1, ji param2, byte param3) {
        RuntimeException var4 = null;
        ck[] var5 = null;
        ck[] stackIn_6_0 = null;
        RuntimeException stackIn_9_0 = null;
        StringBuilder stackIn_9_1 = null;
        String stackIn_10_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          if (!gb.a(param1, param2, param0, 106)) {
            return null;
          }
          if (param3 != -46) {
            var5 = (ck[]) null;
            si.a(55, false, (ck[]) null, true);
          }
          stackIn_6_0 = ca.m(0);
          return stackIn_6_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var4 = decompiledCaughtException;
          stackIn_9_0 = var4;
          stackIn_9_1 = new StringBuilder().append("si.B(").append(param0).append(',').append(param1).append(',');
          if (param2 == null) {
            stackIn_10_2 = "null";
          } else {
            stackIn_10_2 = "{...}";
          }
          throw dh.a((Throwable) ((Object) stackIn_9_0), ((StringBuilder) (Object) stackIn_9_1).append(stackIn_10_2).append(',').append(param3).append(')').toString());
        }
    }

    final static ck[] a(int param0, boolean param1, ck[] param2, boolean param3) {
        int var5 = 0;
        ck[] var4 = null;
        RuntimeException var4_ref = null;
        int var6 = 0;
        ck[] var7 = null;
        ck[] stackIn_3_0 = null;
        ck[] stackIn_8_0 = null;
        RuntimeException stackIn_11_0 = null;
        StringBuilder stackIn_11_1 = null;
        String stackIn_12_2 = null;
        RuntimeException decompiledCaughtException = null;
        var6 = client.field_A ? 1 : 0;
        try {
          if (param0 != 25972) {
            stackIn_3_0 = (ck[]) null;
            return stackIn_3_0;
          }
          var7 = new ck[param2.length];
          var4 = var7;
          for (var5 = 0; param2.length > var5; var5++) {
            var7[var5] = me.a(param2[var5], param3, (byte) -87, param1);
          }
          stackIn_8_0 = var4;
          return stackIn_8_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var4_ref = decompiledCaughtException;
          stackIn_11_0 = var4_ref;
          stackIn_11_1 = new StringBuilder().append("si.J(").append(param0).append(',').append(param1).append(',');
          if (param2 == null) {
            stackIn_12_2 = "null";
          } else {
            stackIn_12_2 = "{...}";
          }
          throw dh.a((Throwable) ((Object) stackIn_11_0), ((StringBuilder) (Object) stackIn_11_1).append(stackIn_12_2).append(',').append(param3).append(')').toString());
        }
    }

    final static boolean c(int param0) {
        if (param0 != -12851) {
          field_i = (String) null;
          if (null == qc.field_s) {
            return false;
          }
          if (ph.field_xb == wf.field_u) {
            return true;
          }
          return false;
        }
        if (null == qc.field_s) {
          return false;
        }
        if (ph.field_xb == wf.field_u) {
          return true;
        }
        return false;
    }

    public final Iterator iterator() {
        return (Iterator) ((Object) new cm(this));
    }

    final static void b(int param0) {
        try {
          Throwable decompiledCaughtException = null;
          java.lang.reflect.Method var1 = null;
          Exception var1_ref = null;
          Runtime var2 = null;
          Throwable var2_ref = null;
          Long var3 = null;
          Object[] var4 = null;
          try {
            var1 = Runtime.class.getMethod("maxMemory", new Class[]{});
            if (param0 != 1) {
              field_g = (String) null;
            }
            if (var1 == null) {
              return;
            }
            try {
              var2 = Runtime.getRuntime();
              var4 = (Object[]) null;
              var3 = (Long) (var1.invoke((Object) (var2), (Object[]) null));
              ab.field_e = 1 + (int)(var3.longValue() / 1048576L);
              return;
            } catch (java.lang.Throwable decompiledCaughtParameter0) {
              decompiledCaughtException = decompiledCaughtParameter0;
              var2_ref = decompiledCaughtException;
              return;
            }
          } catch (java.lang.Exception decompiledCaughtParameter1) {
            decompiledCaughtException = decompiledCaughtParameter1;
            var1_ref = (Exception) (Object) decompiledCaughtException;
            return;
          }
        } catch (RuntimeException | Error decompiledUncheckedException) {
          throw decompiledUncheckedException;
        } catch (Throwable decompiledCheckedException) {
          throw new RuntimeException(decompiledCheckedException);
        }
    }

    final static void a(int param0, boolean param1, int param2, int param3, int param4, byte param5, int param6) {
        String var7 = null;
        if (param5 == -41) {
          if (pk.field_r == 2) {
            var7 = wk.field_n;
          } else {
            var7 = ob.field_l;
          }
          pn.a(param3, param2, param1, param4, var7, param5 + 168, param0, param6);
          return;
        }
    }

    public static void e(int param0) {
        field_b = null;
        field_k = null;
        field_f = null;
        field_m = null;
        field_d = null;
        field_e = null;
        field_i = null;
        field_j = null;
        field_n = null;
        field_g = null;
        field_c = null;
        if (param0 != 0) {
          field_n = (ck) null;
        }
    }

    si(int param0) {
        int var2 = 0;
        bh dupTemp$0 = null;
        bh var3 = null;
        this.field_a = param0;
        this.field_h = new bh[param0];
        for (var2 = 0; param0 > var2; var2++) {
          dupTemp$0 = new bh();
          var3 = dupTemp$0;
          this.field_h[var2] = dupTemp$0;
          var3.field_a = var3;
          var3.field_b = var3;
        }
    }

    static {
        field_j = "Mute this player for 48 hours";
        field_e = new vj();
        field_k = "Unrated game";
        field_f = new String[]{"Bucket size", "Speed", "Colours", "Special items", "Shape feedback"};
        field_i = "You cannot add yourself!";
        field_c = "Unfortunately your configuration doesn't support fullscreen mode. You could try restarting your browser and using the signed applet.";
        field_g = "You are not currently logged in to the<nbsp>game.";
        field_m = "Connecting to<br>friend server...";
    }
}
