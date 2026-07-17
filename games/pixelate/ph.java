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
            IOException var1 = null;
            int var1_int = 0;
            we var2 = null;
            int stackIn_14_0 = 0;
            int stackIn_26_0 = 0;
            int stackIn_30_0 = 0;
            int stackIn_33_0 = 0;
            int stackIn_37_0 = 0;
            Throwable decompiledCaughtException = null;
            int stackOut_13_0 = 0;
            int stackOut_29_0 = 0;
            int stackOut_25_0 = 0;
            int stackOut_36_0 = 0;
            int stackOut_32_0 = 0;
            if (pm.field_h.field_h < 4) {
              try {
                L0: {
                  L1: {
                    if (0 != rb.field_q) {
                      break L1;
                    } else {
                      se.field_o = ef.field_e.a(20278, bl.field_e, kj.field_s);
                      rb.field_q = rb.field_q + 1;
                      break L1;
                    }
                  }
                  L2: {
                    if (1 != rb.field_q) {
                      break L2;
                    } else {
                      if (se.field_o.field_b == 2) {
                        stackOut_13_0 = ce.a((byte) -124, -1);
                        stackIn_14_0 = stackOut_13_0;
                        return stackIn_14_0;
                      } else {
                        if (se.field_o.field_b == 1) {
                          rb.field_q = rb.field_q + 1;
                          break L2;
                        } else {
                          break L2;
                        }
                      }
                    }
                  }
                  L3: {
                    if (rb.field_q == 2) {
                      sc.field_d = new mo((java.net.Socket) se.field_o.field_e, ef.field_e);
                      var2 = new we(13);
                      al.a(ql.field_o, (byte) 66, ak.field_ib, var2, lk.field_n);
                      var2.e(160, 15);
                      var2.d(fj.field_a, -76);
                      sc.field_d.a(13, -103, 0, var2.field_k);
                      rb.field_q = rb.field_q + 1;
                      co.field_a = 30000L + hm.a(64);
                      break L3;
                    } else {
                      break L3;
                    }
                  }
                  L4: {
                    if (rb.field_q == 3) {
                      if (sc.field_d.a(-120) <= 0) {
                        if (~co.field_a <= ~hm.a(64)) {
                          break L4;
                        } else {
                          stackOut_29_0 = ce.a((byte) -124, -2);
                          stackIn_30_0 = stackOut_29_0;
                          return stackIn_30_0;
                        }
                      } else {
                        var1_int = sc.field_d.c((byte) -81);
                        if (0 == var1_int) {
                          rb.field_q = rb.field_q + 1;
                          break L4;
                        } else {
                          stackOut_25_0 = ce.a((byte) -124, var1_int);
                          stackIn_26_0 = stackOut_25_0;
                          return stackIn_26_0;
                        }
                      }
                    } else {
                      break L4;
                    }
                  }
                  if (param0 == 25960) {
                    if (rb.field_q == 4) {
                      pm.field_h.a((Object) (Object) sc.field_d, kn.field_L, 8);
                      sc.field_d = null;
                      se.field_o = null;
                      rb.field_q = 0;
                      stackOut_36_0 = 0;
                      stackIn_37_0 = stackOut_36_0;
                      break L0;
                    } else {
                      return -1;
                    }
                  } else {
                    stackOut_32_0 = -28;
                    stackIn_33_0 = stackOut_32_0;
                    return stackIn_33_0;
                  }
                }
              } catch (java.io.IOException decompiledCaughtParameter0) {
                decompiledCaughtException = decompiledCaughtParameter0;
                var1 = (IOException) (Object) decompiledCaughtException;
                return ce.a((byte) -124, -3);
              }
              return stackIn_37_0;
            } else {
              if (pm.field_h.field_m == -1) {
                return 3;
              } else {
                if (-2 != pm.field_h.field_m) {
                  return 1;
                } else {
                  return 4;
                }
              }
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
        RuntimeException stackIn_3_0 = null;
        StringBuilder stackIn_3_1 = null;
        RuntimeException stackIn_4_0 = null;
        StringBuilder stackIn_4_1 = null;
        RuntimeException stackIn_5_0 = null;
        StringBuilder stackIn_5_1 = null;
        String stackIn_5_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException stackOut_2_0 = null;
        StringBuilder stackOut_2_1 = null;
        RuntimeException stackOut_4_0 = null;
        StringBuilder stackOut_4_1 = null;
        String stackOut_4_2 = null;
        RuntimeException stackOut_3_0 = null;
        StringBuilder stackOut_3_1 = null;
        String stackOut_3_2 = null;
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
          wa.field_f.a((ak) (Object) ma.field_z, (byte) 26);
          wa.field_f.a(sk.field_e, (byte) 26);
          ma.field_z.field_Gb.field_Ib.a(-27813, mg.field_h);
          ma.field_z.field_Gb.field_Ib.field_kb = 1;
          var5 = ma.field_z.field_Gb.field_Ib;
          var6 = var5;
          var6.field_Bb = 1;
          v.field_e.field_Gb.field_Ib.a(-27813, mg.field_h);
          v.field_e.field_Gb.field_Ib.field_kb = 1;
          var3 = v.field_e.field_Gb.field_Ib;
          var3.field_Bb = 1;
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L0: {
            var2 = decompiledCaughtException;
            stackOut_2_0 = (RuntimeException) var2;
            stackOut_2_1 = new StringBuilder().append("ph.B(");
            stackIn_4_0 = stackOut_2_0;
            stackIn_4_1 = stackOut_2_1;
            stackIn_3_0 = stackOut_2_0;
            stackIn_3_1 = stackOut_2_1;
            if (param0 == null) {
              stackOut_4_0 = (RuntimeException) (Object) stackIn_4_0;
              stackOut_4_1 = (StringBuilder) (Object) stackIn_4_1;
              stackOut_4_2 = "null";
              stackIn_5_0 = stackOut_4_0;
              stackIn_5_1 = stackOut_4_1;
              stackIn_5_2 = stackOut_4_2;
              break L0;
            } else {
              stackOut_3_0 = (RuntimeException) (Object) stackIn_3_0;
              stackOut_3_1 = (StringBuilder) (Object) stackIn_3_1;
              stackOut_3_2 = "{...}";
              stackIn_5_0 = stackOut_3_0;
              stackIn_5_1 = stackOut_3_1;
              stackIn_5_2 = stackOut_3_2;
              break L0;
            }
          }
          throw aa.a((Throwable) (Object) stackIn_5_0, stackIn_5_2 + 44 + -106 + 41);
        }
    }

    ph(int param0) {
        ((ph) this).field_k = param0;
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_m = "Unfortunately we are unable to create an account for you at this time.";
    }
}
