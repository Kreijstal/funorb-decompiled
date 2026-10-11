/*
 * Decompiled by CFR-JS 0.4.0.
 */
import java.io.*;

final class qo extends jd {
    static hu field_k;
    static eg[] field_l;
    static String field_j;

    final static tf d(byte param0) {
        tf var1 = new tf();
        var1.a(new hm("sumIntegers", new Class[]{int[].class}, (String) null), 3);
        var1.a(new kb("writeIntegers", new Class[]{int[].class}, (String) null), 3);
        var1.a(new jo("demoIntegers", new Class[]{}, (String) null), 3);
        var1.a(new jf("doSomething", new Class[]{String.class}, "Do something clever to a string to annoy TdR."), param0 - 23);
        var1.a(new ir("three", new Class[]{}, (String) null), param0 ^ 25);
        var1.a(new pb("isSix", new Class[]{Integer.TYPE}, (String) null), param0 - 23);
        if (param0 != 26) {
          qo.a(42, -71L, -88L);
        }
        var1.a(new tq("not", new Class[]{Boolean.TYPE}, (String) null), param0 - 23);
        var1.a(new ik("intDouble", new Class[]{Integer.TYPE}, (String) null), 3);
        var1.a(new uc("intTriple", new Class[]{Integer.TYPE}, (String) null), param0 - 23);
        var1.a(new ev("LongPlusOne", new Class[]{Long.TYPE}, "Returns a long value. Useful for testing the auto-casts."), 3);
        var1.a(new el("BytePlusOne", new Class[]{Byte.TYPE}, "Returns a byte. Should lose precision."), 3);
        var1.a(new ls("big", new Class[]{}, (String) null), param0 - 23);
        var1.a(new uj("set_lag", new Class[]{Integer.TYPE}, (String) null), param0 ^ 25);
        var1.a(new lh("broadcast_server", new Class[]{String.class}, "Send a broadcast to ALL players in games and the lobby. Only for emergencies, it's filtered too incase someone tries to swear."), 3);
        return var1;
    }

    final rv a(String param0, int param1) {
        int var3_int = 0;
        RuntimeException var3 = null;
        int stackIn_3_0 = 0;
        rv stackIn_7_0 = null;
        rv stackIn_9_0 = null;
        RuntimeException stackIn_12_0 = null;
        StringBuilder stackIn_12_1 = null;
        String stackIn_13_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          stackIn_3_0 = (null != gf.a(64, param0)) ? 0 : 1;
          var3_int = stackIn_3_0;
          if (param1 != -5) {
            qo.c((byte) -62);
          }
          if (var3_int != 0) {
            stackIn_9_0 = he.field_yb;
            return stackIn_9_0;
          }
          stackIn_7_0 = jt.field_Bb;
          return stackIn_7_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3 = decompiledCaughtException;
          stackIn_12_0 = var3;
          stackIn_12_1 = new StringBuilder().append("qo.E(");
          if (param0 == null) {
            stackIn_13_2 = "null";
          } else {
            stackIn_13_2 = "{...}";
          }
          throw nb.a((Throwable) ((Object) stackIn_12_0), ((StringBuilder) (Object) stackIn_12_1).append(stackIn_13_2).append(',').append(param1).append(')').toString());
        }
    }

    final static int a(int param0, long param1, long param2) {
        if (param0 != -8905) {
          qo.e((byte) 58);
        }
        return (int)(param1 * param2 >> 16);
    }

    final static ot g(int param0) {
        int var2_int = 0;
        int var3 = 0;
        int var4 = Kickabout.field_G;
        ut var6 = new ut(108, 108);
        int var3Lifetime1;
        iw.a(-110, var6);
        on.d(54, 54, 51, 204);
        for (var2_int = 43; var2_int > 0; var2_int--) {
          var3 = 119 * var2_int / 43 + 34;
          on.d(54, 54, var2_int, var3);
        }
        if (param0 != -22976) {
          qo.g(126);
        }
        ta.e(param0 ^ -22987);
        ot var2 = new ot(54, 54);
        iw.a(param0 ^ -23017, var2);
        var6.f(0, 0);
        ta.e(125);
        int var5 = 0;
        var3Lifetime1 = var5;
        while (var5 < var2.field_y.length) {
          var2.field_y[var5] = hf.a(var2.field_y[var5] << 24, 16777215);
          var5++;
        }
        return var2;
    }

    final String a(byte param0, String param1) {
        RuntimeException var3 = null;
        String stackIn_2_0 = null;
        String stackIn_6_0 = null;
        RuntimeException stackIn_9_0 = null;
        StringBuilder stackIn_9_1 = null;
        String stackIn_10_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          if (this.a(param1, param0 ^ -30) == jt.field_Bb) {
            stackIn_2_0 = tk.field_Cb;
            return stackIn_2_0;
          }
          if (param0 != 25) {
            field_j = (String) null;
          }
          stackIn_6_0 = dl.field_g;
          return stackIn_6_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3 = decompiledCaughtException;
          stackIn_9_0 = var3;
          stackIn_9_1 = new StringBuilder().append("qo.A(").append(param0).append(',');
          if (param1 == null) {
            stackIn_10_2 = "null";
          } else {
            stackIn_10_2 = "{...}";
          }
          throw nb.a((Throwable) ((Object) stackIn_9_0), ((StringBuilder) (Object) stackIn_9_1).append(stackIn_10_2).append(')').toString());
        }
    }

    public static void f(byte param0) {
        field_k = null;
        field_l = null;
        if (param0 != -126) {
          return;
        }
        field_j = null;
    }

    final static boolean a(boolean param0, byte param1) {
        try {
          ml var2_ref_ml = null;
          if (wt.field_A == null) {
            wt.field_A = vl.field_c.a(true, uc.field_E, rl.field_o);
          }
          if (wt.field_A.field_a == 0) {
            return false;
          }
          long dupTemp$0 = nj.a(-100);
          mp.field_i = dupTemp$0;
          ci.field_c = dupTemp$0;
          if (1 != wt.field_A.field_a) {
            un.field_c = cp.field_h;
          } else {
            try {
              op.field_y = new bh((java.net.Socket) (wt.field_A.field_b), vl.field_c);
              or.field_d.field_n = 0;
              var2_ref_ml = un.field_e;
              un.field_c = sd.field_d;
              var2_ref_ml.field_n = 0;
              dj.field_A = param0 ? -2 : -1;
              wb.field_n = param0 ? -2 : -1;
              kq.field_Ab = param0 ? -2 : -1;
              dh.a(fp.field_g, il.field_g, or.field_d, -3210, s.field_E);
              c.a(-1, false);
            } catch (IOException iOException) {
              un.field_c = cp.field_h;
            }
          }
          wt.field_A = null;
          int var2 = -53 / ((-57 - param1) / 43);
          return true;
        } catch (RuntimeException | Error decompiledUncheckedException) {
          throw decompiledUncheckedException;
        } catch (Throwable decompiledCheckedException) {
          throw new RuntimeException(decompiledCheckedException);
        }
    }

    qo(ga param0) {
        super(param0);
    }

    final static boolean c(byte param0) {
        boolean stackIn_6_0 = false;
        if (param0 != -42) {
          return true;
        }
        stackIn_6_0 = (null != oo.field_c) && (oo.field_c.field_l);
        return stackIn_6_0;
    }

    final static int e(byte param0) {
        if (param0 != 18) {
          field_j = (String) null;
        }
        return fr.field_G;
    }

    static {
        field_l = new eg[9];
        field_j = "You have been removed from <%0>'s game.";
    }
}
