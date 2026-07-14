/*
 * Decompiled by CFR-JS 0.4.0.
 */
import java.io.*;

final class sa {
    static int[] field_m;
    byte field_x;
    static an field_h;
    static String field_y;
    int field_u;
    static boolean field_k;
    static boolean field_c;
    byte field_i;
    static String field_g;
    static String field_o;
    static int[] field_q;
    static String field_d;
    static String field_v;
    byte field_a;
    static int field_p;
    static String field_b;
    static String field_j;
    static so field_s;
    static fn field_f;
    static int field_t;
    static int[] field_r;
    static String[] field_e;
    byte field_n;
    static String field_l;
    static int[] field_w;

    final static String a(boolean param0) {
        if (ra.field_e != wd.field_Lb) {
          if (!param0) {
            if (pa.field_I == ra.field_e) {
              return l.field_c;
            } else {
              if (!ig.field_j.a(88)) {
                return l.field_c;
              } else {
                return qo.field_x;
              }
            }
          } else {
            sa.a(38);
            if (pa.field_I == ra.field_e) {
              return l.field_c;
            } else {
              if (!ig.field_j.a(88)) {
                return l.field_c;
              } else {
                return qo.field_x;
              }
            }
          }
        } else {
          return vq.field_Xb;
        }
    }

    final static boolean a(byte param0, boolean param1) {
        try {
            IOException var2 = null;
            oq var4 = null;
            oq var5 = null;
            int stackIn_8_0 = 0;
            int stackOut_6_0 = 0;
            int stackOut_7_0 = 0;
            int statePc = 0;
            Throwable caughtException = null;
            stateLoop: while (true) {
                switch (statePc) {
                    case 0: {
                        if (ge.field_u != null) {
                            statePc = 2;
                        } else {
                            statePc = 1;
                        }
                        continue stateLoop;
                    }
                    case 1: {
                        ge.field_u = nd.field_a.a(mp.field_S, vj.field_d, 0);
                        statePc = 2;
                        continue stateLoop;
                    }
                    case 2: {
                        if (ge.field_u.field_f != 0) {
                            statePc = 4;
                        } else {
                            statePc = 3;
                        }
                        continue stateLoop;
                    }
                    case 3: {
                        return false;
                    }
                    case 4: {
                        nf.field_Q = rl.a((byte) -95);
                        ob.field_v = rl.a((byte) -95);
                        if ((ge.field_u.field_f ^ -1) != -2) {
                            statePc = 17;
                        } else {
                            statePc = 5;
                        }
                        continue stateLoop;
                    }
                    case 5: {
                        try {
                            jd.field_c = new vb((java.net.Socket) ge.field_u.field_e, nd.field_a);
                            var4 = kn.field_e;
                            var5 = var4;
                            ej.field_j.field_v = 0;
                            var5.field_v = 0;
                            if (!param1) {
                                statePc = 7;
                            } else {
                                statePc = 6;
                            }
                            continue stateLoop;
                        } catch (Throwable stateCaught_5) {
                            caughtException = stateCaught_5;
                            statePc = 13;
                            continue stateLoop;
                        }
                    }
                    case 6: {
                        try {
                            stackOut_6_0 = -2;
                            stackIn_8_0 = stackOut_6_0;
                            statePc = 8;
                            continue stateLoop;
                        } catch (Throwable stateCaught_6) {
                            caughtException = stateCaught_6;
                            statePc = 13;
                            continue stateLoop;
                        }
                    }
                    case 7: {
                        try {
                            stackOut_7_0 = -1;
                            stackIn_8_0 = stackOut_7_0;
                            statePc = 8;
                            continue stateLoop;
                        } catch (Throwable stateCaught_7) {
                            caughtException = stateCaught_7;
                            statePc = 13;
                            continue stateLoop;
                        }
                    }
                    case 8: {
                        try {
                            hb.field_e = stackIn_8_0;
                            vd.field_g = stackIn_8_0;
                            ia.field_l = stackIn_8_0;
                            tl.field_J = no.field_h;
                            fm.a((ge) (Object) ej.field_j, true, kc.field_c, kh.field_uc, lf.field_b);
                            de.a(-1, 0);
                            statePc = 9;
                            continue stateLoop;
                        } catch (Throwable stateCaught_8) {
                            caughtException = stateCaught_8;
                            statePc = 13;
                            continue stateLoop;
                        }
                    }
                    case 9: {
                        if (param0 != 65) {
                            statePc = 11;
                        } else {
                            statePc = 10;
                        }
                        continue stateLoop;
                    }
                    case 10: {
                        ge.field_u = null;
                        return true;
                    }
                    case 11: {
                        return false;
                    }
                    case 13: {
                        var2 = (IOException) (Object) caughtException;
                        tl.field_J = vk.field_V;
                        if (param0 != 65) {
                            statePc = 15;
                        } else {
                            statePc = 14;
                        }
                        continue stateLoop;
                    }
                    case 14: {
                        ge.field_u = null;
                        return true;
                    }
                    case 15: {
                        return false;
                    }
                    case 17: {
                        tl.field_J = vk.field_V;
                        if (param0 != 65) {
                            statePc = 19;
                        } else {
                            statePc = 18;
                        }
                        continue stateLoop;
                    }
                    case 18: {
                        ge.field_u = null;
                        return true;
                    }
                    case 19: {
                        return false;
                    }
                    default: throw new IllegalStateException("invalid CFG state " + statePc);
                }
            }
        } catch (RuntimeException | Error decompiledUncheckedException) {
            throw decompiledUncheckedException;
        } catch (Throwable decompiledCheckedException) {
            throw new RuntimeException(decompiledCheckedException);
        }
    }

    public static void a(int param0) {
        field_s = null;
        field_m = null;
        field_v = null;
        field_d = null;
        field_h = null;
        field_j = null;
        field_l = null;
        field_b = null;
        field_y = null;
        field_e = null;
        if (param0 != -13265) {
          boolean discarded$2 = sa.a((byte) 89, true);
          field_q = null;
          field_f = null;
          field_o = null;
          field_r = null;
          field_g = null;
          field_w = null;
          return;
        } else {
          field_q = null;
          field_f = null;
          field_o = null;
          field_r = null;
          field_g = null;
          field_w = null;
          return;
        }
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_m = new int[]{0, 0, 0, 65536, 0, 0, 0, 65536, 0, 0, 0, 65536};
        field_d = "You have <%0> unread messages!";
        field_g = "Climbing out of the jungle into the mountains...";
        field_c = false;
        field_j = "Show lobby chat from my friends";
        field_b = "Tutorial";
        field_y = "Log in";
        field_t = 0;
        field_e = new String[255];
        field_l = "Use <img=5>/<img=6>, or <img=13>/<img=15> to aim the cue.";
    }
}
