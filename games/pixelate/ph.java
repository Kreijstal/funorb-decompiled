/*
 * Decompiled by CFR-JS 0.4.0.
 */
import java.io.*;

final class ph extends fa {
    static on field_l;
    static String field_m;
    int field_k;
    static tf field_n;
    static int field_o;

    final static int e(int param0) {
        try {
          int stackIn_14_0 = 0;
          int stackIn_26_0 = 0;
          int stackIn_30_0 = 0;
          int stackIn_33_0 = 0;
          int stackIn_37_0 = 0;
          Throwable decompiledCaughtException = null;
          int var1_int = 0;
          IOException var1 = null;
          we var2 = null;
          if (pm.field_h.field_h >= 4) {
            if (pm.field_h.field_m == -1) {
              return 3;
            }
            if (-2 != pm.field_h.field_m) {
              return 1;
            }
            return 4;
          }
          try {
            if (0 == rb.field_q) {
              se.field_o = ef.field_e.a(20278, bl.field_e, kj.field_s);
              rb.field_q = rb.field_q + 1;
            }
            if (1 == rb.field_q) {
              if (se.field_o.field_b == 2) {
                stackIn_14_0 = ce.a((byte) -124, -1);
                return stackIn_14_0;
              }
              if (se.field_o.field_b == 1) {
                rb.field_q = rb.field_q + 1;
              }
            }
            if (rb.field_q == 2) {
              sc.field_d = new mo((java.net.Socket) (se.field_o.field_e), ef.field_e);
              var2 = new we(13);
              al.a(ql.field_o, (byte) 66, ak.field_ib, var2, lk.field_n);
              var2.e(160, 15);
              var2.d(fj.field_a, -76);
              sc.field_d.a(13, -103, 0, var2.field_k);
              rb.field_q = rb.field_q + 1;
              co.field_a = 30000L + hm.a(64);
            }
            if (rb.field_q == 3) {
              if (sc.field_d.a(-120) <= 0) {
                if (co.field_a < hm.a(64)) {
                  stackIn_30_0 = ce.a((byte) -124, -2);
                  return stackIn_30_0;
                }
              } else {
                var1_int = sc.field_d.c((byte) -81);
                if (0 != var1_int) {
                  stackIn_26_0 = ce.a((byte) -124, var1_int);
                  return stackIn_26_0;
                }
                rb.field_q = rb.field_q + 1;
              }
            }
            if (param0 != 25960) {
              stackIn_33_0 = -28;
              return stackIn_33_0;
            }
            if (rb.field_q != 4) {
              return -1;
            }
            pm.field_h.a(sc.field_d, kn.field_L, 8);
            sc.field_d = null;
            se.field_o = null;
            rb.field_q = 0;
            stackIn_37_0 = 0;
            return stackIn_37_0;
          } catch (java.io.IOException decompiledCaughtParameter0) {
            decompiledCaughtException = decompiledCaughtParameter0;
            var1 = (IOException) (Object) decompiledCaughtException;
            return ce.a((byte) -124, -3);
          }
        } catch (RuntimeException | Error decompiledUncheckedException) {
          throw decompiledUncheckedException;
        } catch (Throwable decompiledCheckedException) {
          throw new RuntimeException(decompiledCheckedException);
        }
    }

    public static void a(int param0) {
        field_n = null;
        if (param0 < 104) {
          return;
        }
        field_l = null;
        field_m = null;
    }

    final static void a(fm param0, byte param1) {
        RuntimeException var2 = null;
        ak var3 = null;
        ak var5 = null;
        ak var6 = null;
        RuntimeException stackIn_5_0 = null;
        StringBuilder stackIn_5_1 = null;
        String stackIn_6_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          dk.field_e = bi.a("basic", "display_name_changed", param0, (byte) -25);
          ma.field_z = new pd(0L, rm.field_a, tp.field_u, op.field_q);
          v.field_e = new pd(0L, rm.field_a, qh.field_e, k.field_n);
          wa.field_f = new ak(0L, (ak) null);
          ak.field_E = new ak(0L, mg.field_h);
          ak.field_E.field_Bb = 1;
          kc.field_u = new ak(0L, u.field_l, qn.field_m);
          ae.field_e = new ak(0L, ni.field_s, gp.field_Jb);
          sk.field_e = new ak(0L, dn.field_c);
          wa.field_f.a(ak.field_E, (byte) 26);
          wa.field_f.a(kc.field_u, (byte) 26);
          wa.field_f.a(ae.field_e, (byte) 26);
          wa.field_f.a(ma.field_z, (byte) 26);
          wa.field_f.a(sk.field_e, (byte) 26);
          ma.field_z.field_Gb.field_Ib.a(param1 ^ 27853, mg.field_h);
          ma.field_z.field_Gb.field_Ib.field_kb = 1;
          var5 = ma.field_z.field_Gb.field_Ib;
          var6 = var5;
          var6.field_Bb = 1;
          v.field_e.field_Gb.field_Ib.a(param1 ^ 27853, mg.field_h);
          v.field_e.field_Gb.field_Ib.field_kb = 1;
          var3 = v.field_e.field_Gb.field_Ib;
          var3.field_Bb = 1;
          if (param1 == -106) {
            return;
          }
          ph.a(-30);
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2 = decompiledCaughtException;
          stackIn_5_0 = var2;
          stackIn_5_1 = new StringBuilder().append("ph.B(");
          if (param0 == null) {
            stackIn_6_2 = "null";
          } else {
            stackIn_6_2 = "{...}";
          }
          throw aa.a((Throwable) ((Object) stackIn_5_0), ((StringBuilder) (Object) stackIn_5_1).append(stackIn_6_2).append(',').append(param1).append(')').toString());
        }
    }

    ph(int param0) {
        this.field_k = param0;
    }

    static {
        field_m = "Unfortunately we are unable to create an account for you at this time.";
    }
}
