/*
 * Decompiled by CFR-JS 0.4.0.
 */
import java.io.*;

final class pe extends v {
    private boolean field_ib;
    private String field_fb;
    private boolean field_cb;
    static ka[] field_eb;
    static int[] field_db;
    static int[] field_gb;
    private ek field_bb;
    private String field_hb;

    final void l(int param0) {
        ((pe) this).field_cb = true;
        ((pe) this).field_bb.field_L = false;
        if (param0 != 100) {
            pe.m(118);
        }
    }

    pe(si param0, String param1) {
        super(param0, 300, 120);
        int var3 = 0;
        ((pe) this).field_hb = param1;
        if (null != ((pe) this).field_hb) {
            var3 = dl.field_H.b(((pe) this).field_hb, 260, dl.field_H.field_x);
            ((pe) this).b(0, 150 + var3, 300);
        }
        ((pe) this).field_bb = new ek(13, 50, 274, 30, 15, 2113632, 4210752);
        ((pe) this).field_cb = false;
        ((pe) this).field_ib = false;
        ((pe) this).field_bb.field_L = true;
        ((pe) this).a(0, (ee) (Object) ((pe) this).field_bb);
    }

    public static void m(int param0) {
        field_gb = null;
        field_db = null;
        if (param0 != 4210752) {
            return;
        }
        field_eb = null;
    }

    final void a(boolean param0, String param1, float param2, boolean param3) {
        Object stackIn_6_0 = null;
        Object stackIn_7_0 = null;
        Object stackIn_8_0 = null;
        int stackIn_8_1 = 0;
        Object stackOut_5_0 = null;
        Object stackOut_7_0 = null;
        int stackOut_7_1 = 0;
        Object stackOut_6_0 = null;
        int stackOut_6_1 = 0;
        if (param0 != ((pe) this).field_ib) {
          L0: {
            stackOut_5_0 = this;
            stackIn_7_0 = stackOut_5_0;
            stackIn_6_0 = stackOut_5_0;
            if (!param0) {
              stackOut_7_0 = this;
              stackOut_7_1 = 0;
              stackIn_8_0 = stackOut_7_0;
              stackIn_8_1 = stackOut_7_1;
              break L0;
            } else {
              stackOut_6_0 = this;
              stackOut_6_1 = 1;
              stackIn_8_0 = stackOut_6_0;
              stackIn_8_1 = stackOut_6_1;
              break L0;
            }
          }
          ((pe) this).field_ib = stackIn_8_1 != 0;
          if (((pe) this).field_ib) {
            ((pe) this).field_bb.b(23927, 8405024, 4210752);
            ((pe) this).field_bb.field_L = true;
            ((pe) this).field_bb.field_A = (int)(65536.0f * (param2 / 100.0f));
            ((pe) this).field_fb = param1;
            if (param3) {
              boolean discarded$4 = pe.a((byte) 25, -36);
              return;
            } else {
              return;
            }
          } else {
            ((pe) this).field_bb.b(23927, 2113632, 4210752);
            if (!((pe) this).field_cb) {
              ((pe) this).field_bb.field_A = (int)(65536.0f * (param2 / 100.0f));
              ((pe) this).field_fb = param1;
              if (param3) {
                boolean discarded$5 = pe.a((byte) 25, -36);
                return;
              } else {
                return;
              }
            } else {
              ((pe) this).field_bb.field_L = false;
              ((pe) this).field_bb.field_A = (int)(65536.0f * (param2 / 100.0f));
              ((pe) this).field_fb = param1;
              if (!param3) {
                return;
              } else {
                boolean discarded$6 = pe.a((byte) 25, -36);
                return;
              }
            }
          }
        } else {
          ((pe) this).field_bb.field_A = (int)(65536.0f * (param2 / 100.0f));
          ((pe) this).field_fb = param1;
          if (!param3) {
            return;
          } else {
            boolean discarded$7 = pe.a((byte) 25, -36);
            return;
          }
        }
    }

    final void c(int param0, int param1, int param2) {
        super.c(param0, param1, param2);
        dl.field_H.a(((pe) this).field_fb, (((pe) this).field_p >> -2132544511) + param2, 103 + param1, 16777215, -1);
        if (((pe) this).field_hb != null) {
            qg.b(20 + param2, 120 + (param1 + -7), 260, 8421504);
            int discarded$0 = dl.field_H.a(((pe) this).field_hb, 20 + param2, 8 + param1 + 120, 260, 100, 16777215, -1, 1, 0, dl.field_H.field_x);
        }
    }

    final static lj b(int param0, int param1) {
        if (param1 != -1) {
            return null;
        }
        return bb.a(param0, true, 1, (byte) 95, false, false);
    }

    final static boolean a(byte param0, int param1) {
        try {
            if (!(id.field_b.field_q < param1)) {
                return true;
            }
            if (param0 < 58) {
                field_gb = null;
            }
            if (!(null != qf.field_a)) {
                return false;
            }
            int var2_int = qf.field_a.a(0);
            if (!((var2_int ^ -1) >= -1)) {
                if (!(-id.field_b.field_q + param1 >= var2_int)) {
                    var2_int = param1 + -id.field_b.field_q;
                }
                qf.field_a.a(-1, id.field_b.field_q, var2_int, id.field_b.field_m);
                ac.field_e = ol.a(256);
                id.field_b.field_q = id.field_b.field_q + var2_int;
                if (!(param1 <= id.field_b.field_q)) {
                    return false;
                }
                id.field_b.field_q = 0;
                return true;
            }
            try {
                if (false) throw (IOException) null;
                if (-1 >= (var2_int ^ -1)) {
                    if (-30001L <= (fc.e(106) ^ -1L)) {
                        return false;
                    }
                }
                ob.b(-111);
            } catch (IOException iOException) {
                ob.b(-93);
            }
            return false;
        } catch (RuntimeException | Error decompiledUncheckedException) {
            throw decompiledUncheckedException;
        } catch (Throwable decompiledCheckedException) {
            throw new RuntimeException(decompiledCheckedException);
        }
    }

    static {
    }
}
