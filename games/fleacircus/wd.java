/*
 * Decompiled by CFR-JS 0.4.0.
 */
import java.util.*;

final class wd {
    static wh field_b;
    static vg field_a;
    static int field_c;

    public final String toString() {
        throw new IllegalStateException();
    }

    final static void a(int param0, int param1) {
        lh var2 = null;
        int var3 = 0;
        hi var4 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var2_ref = null;
        var3 = fleas.field_A ? 1 : 0;
        try {
          if (param0 != -29250) {
            field_c = -7;
          }
          var4 = (hi) (bf.field_e.c((byte) 47));
          while (var4 != null) {
            sc.a(param1, var4, param0 + 29251);
            var4 = (hi) (bf.field_e.b((byte) -105));
          }
          var2 = rj.field_i.c((byte) 47);
          while (var2 != null) {
            ki.a(param1, 1);
            var2 = rj.field_i.b((byte) -105);
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2_ref = decompiledCaughtException;
          throw pf.a((Throwable) ((Object) var2_ref), "wd.D(" + param0 + ',' + param1 + ')');
        }
    }

    final static void a(boolean param0, int param1, kc param2, int param3, boolean param4) {
        RuntimeException stackIn_21_0 = null;
        StringBuilder stackIn_21_1 = null;
        String stackIn_22_2 = null;
        RuntimeException decompiledCaughtException = null;
        int var5_int = 0;
        RuntimeException var5 = null;
        int var6 = 0;
        int var7 = 0;
        String var8 = null;
        try {
          ue.field_a[0] = jj.field_R.nextInt();
          ue.field_a[1] = jj.field_R.nextInt();
          ue.field_a[2] = (int)(ug.field_a >> 32);
          sd.field_i.field_i = 0;
          ue.field_a[3] = (int)ug.field_a;
          sd.field_i.a(ue.field_a[0], (byte) -23);
          sd.field_i.a(ue.field_a[1], (byte) -100);
          sd.field_i.a(ue.field_a[2], (byte) -96);
          var5_int = 27 % ((-65 - param1) / 51);
          sd.field_i.a(ue.field_a[3], (byte) -104);
          lc.a(sd.field_i, (byte) -113);
          sd.field_i.b((byte) 99, param3);
          param2.a(sd.field_i, (byte) -100);
          ud.field_b.field_i = 0;
          if (param0) {
            ud.field_b.a(-11, 18);
          } else {
            ud.field_b.a(-11, 16);
          }
          ud.field_b.field_i = ud.field_b.field_i + 2;
          var6 = ud.field_b.field_i;
          ud.field_b.a(pc.field_j, (byte) -125);
          ud.field_b.a(-108, c.field_P);
          var7 = 0;
          if (va.field_m) {
            var7 = var7 | 1;
          }
          if (bk.field_e) {
            var7 = var7 | 4;
          }
          if (param4) {
            var7 = var7 | 8;
          }
          if (wc.field_p != null) {
            var7 = var7 | 16;
          }
          ud.field_b.a(-11, var7);
          var8 = w.a(0, rl.a((byte) -75));
          if (var8 == null) {
            var8 = "";
          }
          ud.field_b.a(116, var8);
          if (null != wc.field_p) {
            ud.field_b.a(wc.field_p, (byte) -87);
          }
          cg.a(fj.field_c, -111, sd.field_i, ud.field_b, de.field_k);
          ud.field_b.a((byte) 119, -var6 + ud.field_b.field_i);
          dk.b((byte) 41, -1);
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var5 = decompiledCaughtException;
          stackIn_21_0 = var5;
          stackIn_21_1 = new StringBuilder().append("wd.B(").append(param0).append(',').append(param1).append(',');
          if (param2 == null) {
            stackIn_22_2 = "null";
          } else {
            stackIn_22_2 = "{...}";
          }
          throw pf.a((Throwable) ((Object) stackIn_21_0), ((StringBuilder) (Object) stackIn_21_1).append(stackIn_22_2).append(',').append(param3).append(',').append(param4).append(')').toString());
        }
    }

    public static void a(boolean param0) {
        if (param0) {
          wd.a((byte) -2, -36L);
          field_a = null;
          field_b = null;
          return;
        }
        field_a = null;
        field_b = null;
    }

    final static String a(byte param0, long param1) {
        int var4 = 0;
        int var5 = 0;
        int var6 = 0;
        int var7 = 0;
        int var8 = 0;
        int var9 = 0;
        hh.field_c.setTime(new Date(param1));
        int var3 = hh.field_c.get(7);
        if (param0 <= -7) {
          var4 = hh.field_c.get(5);
          var5 = hh.field_c.get(2);
          var6 = hh.field_c.get(1);
          var7 = hh.field_c.get(11);
          var8 = hh.field_c.get(12);
          var9 = hh.field_c.get(13);
          return th.field_m[-1 + var3] + ", " + var4 / 10 + var4 % 10 + "-" + md.field_P[var5] + "-" + var6 + " " + var7 / 10 + var7 % 10 + ":" + var8 / 10 + var8 % 10 + ":" + var9 / 10 + var9 % 10 + " GMT";
        }
        return (String) null;
    }

    static {
        field_b = new wh("usename");
    }
}
