/*
 * Decompiled by CFR-JS 0.4.0.
 */
import java.util.*;

final class j extends li {
    static String field_s;
    static vi field_n;
    static String field_o;
    static String field_p;
    static Random field_r;
    static cr field_q;

    private j() throws Throwable {
        throw new Error();
    }

    public static void a(int param0) {
        field_p = null;
        field_s = null;
        field_n = null;
        field_q = null;
        field_r = null;
        field_o = null;
        if (param0 != 0) {
          field_r = (Random) null;
          return;
        }
    }

    final static boolean a(int param0, int[] param1) {
        int var5_int = 0;
        int var6 = 0;
        RuntimeException stackIn_40_0 = null;
        StringBuilder stackIn_40_1 = null;
        String stackIn_41_2 = null;
        RuntimeException decompiledCaughtException = null;
        long var2_long = 0L;
        RuntimeException var2 = null;
        hl var4_ref_hl = null;
        int var4 = 0;
        hl var5 = null;
        int var7 = 0;
        var7 = Vertigo2.field_L ? 1 : 0;
        try {
          if (bm.field_I != rg.field_d) {
            return false;
          }
          if (param0 != 0) {
            return true;
          }
          var2_long = gk.a(109);
          if (ir.field_d != 0 &&
            m.field_A < 0) {
            var4_ref_hl = (hl) (s.field_t.a((byte) 100));
            if (var4_ref_hl != null &&
              var2_long > var4_ref_hl.field_p) {
              var4_ref_hl.c(2);
              ca.field_b = var4_ref_hl.field_n.length;
              id.field_f.field_u = 0;
              for (var5_int = 0; ca.field_b > var5_int; var5_int++) {
                id.field_f.field_p[var5_int] = var4_ref_hl.field_n[var5_int];
              }
              gf.field_d = jb.field_G;
              jb.field_G = cp.field_c;
              cp.field_c = lc.field_f;
              lc.field_f = var4_ref_hl.field_r;
              return true;
            }
          }
          while (true) {
            if (0 > m.field_A) {
              id.field_f.field_u = 0;
              if (!c.a(1, (byte) -104)) {
                return false;
              }
              m.field_A = id.field_f.c((byte) 35);
              id.field_f.field_u = 0;
              ca.field_b = param1[m.field_A];
            }
            if (!dl.b((byte) 113)) {
              return false;
            }
            if (ir.field_d == 0) {
              gf.field_d = jb.field_G;
              jb.field_G = cp.field_c;
              cp.field_c = lc.field_f;
              lc.field_f = m.field_A;
              m.field_A = -1;
              return true;
            }
            var4 = ir.field_d;
            if (0.0 != il.field_e) {
              var4 = (int)((double)var4 + field_r.nextGaussian() * il.field_e);
              if (var4 < 0) {
                var4 = 0;
              }
            }
            var5 = new hl((long)var4 + var2_long, m.field_A, new byte[ca.field_b]);
            for (var6 = 0; ca.field_b > var6; var6++) {
              var5.field_n[var6] = id.field_f.field_p[var6];
            }
            s.field_t.a(var5, false);
            m.field_A = -1;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2 = decompiledCaughtException;
          stackIn_40_0 = var2;
          stackIn_40_1 = new StringBuilder().append("j.C(").append(param0).append(',');
          if (param1 == null) {
            stackIn_41_2 = "null";
          } else {
            stackIn_41_2 = "{...}";
          }
          throw wn.a((Throwable) ((Object) stackIn_40_0), ((StringBuilder) (Object) stackIn_40_1).append(stackIn_41_2).append(')').toString());
        }
    }

    static long a(long param0, long param1) {
        return param0 & param1;
    }

    static {
        field_o = "Starting game...";
        field_n = null;
        field_s = "You have entered another game.";
        field_r = new Random();
    }
}
