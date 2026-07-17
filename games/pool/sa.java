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

    final static String a() {
        if (ra.field_e != wd.field_Lb) {
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
            Throwable decompiledCaughtException = null;
            int stackOut_7_0 = 0;
            int stackOut_6_0 = 0;
            L0: {
              if (ge.field_u != null) {
                break L0;
              } else {
                ge.field_u = nd.field_a.a(mp.field_S, vj.field_d, 0);
                break L0;
              }
            }
            if (ge.field_u.field_f != 0) {
              long dupTemp$1 = rl.a((byte) -95);
              nf.field_Q = dupTemp$1;
              ob.field_v = dupTemp$1;
              if (ge.field_u.field_f != 1) {
                tl.field_J = vk.field_V;
                if (param0 != 65) {
                  return false;
                } else {
                  ge.field_u = null;
                  return true;
                }
              } else {
                try {
                  L1: {
                    L2: {
                      jd.field_c = new vb((java.net.Socket) ge.field_u.field_e, nd.field_a);
                      var4 = kn.field_e;
                      var5 = var4;
                      ej.field_j.field_v = 0;
                      var5.field_v = 0;
                      if (!param1) {
                        stackOut_7_0 = -1;
                        stackIn_8_0 = stackOut_7_0;
                        break L2;
                      } else {
                        stackOut_6_0 = -2;
                        stackIn_8_0 = stackOut_6_0;
                        break L2;
                      }
                    }
                    hb.field_e = stackIn_8_0;
                    vd.field_g = stackIn_8_0;
                    ia.field_l = stackIn_8_0;
                    tl.field_J = no.field_h;
                    fm.a((ge) (Object) ej.field_j, true, kc.field_c, kh.field_uc, lf.field_b);
                    de.a(-1, 0);
                    break L1;
                  }
                } catch (java.io.IOException decompiledCaughtParameter0) {
                  decompiledCaughtException = decompiledCaughtParameter0;
                  var2 = (IOException) (Object) decompiledCaughtException;
                  tl.field_J = vk.field_V;
                  if (param0 != 65) {
                    return false;
                  } else {
                    ge.field_u = null;
                    return true;
                  }
                }
                if (param0 != 65) {
                  return false;
                } else {
                  ge.field_u = null;
                  return true;
                }
              }
            } else {
              return false;
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
