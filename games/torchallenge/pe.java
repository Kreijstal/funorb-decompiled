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
        this.field_cb = true;
        this.field_bb.field_L = false;
        if (param0 != 100) {
            pe.m(118);
        }
    }

    pe(si param0, String param1) {
        super(param0, 300, 120);
        int var3_int = 0;
        try {
            this.field_hb = param1;
            if (null != this.field_hb) {
                var3_int = dl.field_H.b(this.field_hb, 260, dl.field_H.field_x);
                this.b(0, 150 + var3_int, 300);
            }
            this.field_bb = new ek(13, 50, 274, 30, 15, 2113632, 4210752);
            this.field_cb = false;
            this.field_ib = false;
            this.field_bb.field_L = true;
            this.a(0, this.field_bb);
        } catch (RuntimeException runtimeException) {
            throw oj.a((Throwable) ((Object) runtimeException), "pe.<init>(" + (param0 != null ? "{...}" : "null") + ',' + (param1 != null ? "{...}" : "null") + ')');
        }
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
        boolean discarded$2 = false;
        RuntimeException var5 = null;
        Object stackIn_3_0 = null;
        Object stackIn_4_0 = null;
        Object stackIn_5_0 = null;
        int stackIn_5_1 = 0;
        RuntimeException stackIn_13_0 = null;
        StringBuilder stackIn_13_1 = null;
        RuntimeException stackIn_14_0 = null;
        StringBuilder stackIn_14_1 = null;
        RuntimeException stackIn_15_0 = null;
        StringBuilder stackIn_15_1 = null;
        String stackIn_15_2 = null;
        RuntimeException decompiledCaughtException = null;
        Object stackOut_2_0 = null;
        Object stackOut_4_0 = null;
        int stackOut_4_1 = 0;
        Object stackOut_3_0 = null;
        int stackOut_3_1 = 0;
        RuntimeException stackOut_12_0 = null;
        StringBuilder stackOut_12_1 = null;
        RuntimeException stackOut_14_0 = null;
        StringBuilder stackOut_14_1 = null;
        String stackOut_14_2 = null;
        RuntimeException stackOut_13_0 = null;
        StringBuilder stackOut_13_1 = null;
        String stackOut_13_2 = null;
        try {
          L0: {
            L1: {
              if (param0 != this.field_ib) {
                L2: {
                  stackOut_2_0 = this;
                  stackIn_4_0 = stackOut_2_0;
                  stackIn_3_0 = stackOut_2_0;
                  if (!param0) {
                    stackOut_4_0 = this;
                    stackOut_4_1 = 0;
                    stackIn_5_0 = stackOut_4_0;
                    stackIn_5_1 = stackOut_4_1;
                    break L2;
                  } else {
                    stackOut_3_0 = this;
                    stackOut_3_1 = 1;
                    stackIn_5_0 = stackOut_3_0;
                    stackIn_5_1 = stackOut_3_1;
                    break L2;
                  }
                }
                ((pe) (this)).field_ib = stackIn_5_1 != 0;
                if (this.field_ib) {
                  this.field_bb.b(23927, 8405024, 4210752);
                  this.field_bb.field_L = true;
                  break L1;
                } else {
                  this.field_bb.b(23927, 2113632, 4210752);
                  if (!this.field_cb) {
                    break L1;
                  } else {
                    this.field_bb.field_L = false;
                    break L1;
                  }
                }
              } else {
                break L1;
              }
            }
            this.field_bb.field_A = (int)(65536.0f * (param2 / 100.0f));
            this.field_fb = param1;
            if (!param3) {
              break L0;
            } else {
              discarded$2 = pe.a((byte) 25, -36);
              return;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L3: {
            var5 = decompiledCaughtException;
            stackOut_12_0 = (RuntimeException) (var5);
            stackOut_12_1 = new StringBuilder().append("pe.C(").append(param0).append(',');
            stackIn_14_0 = stackOut_12_0;
            stackIn_14_1 = stackOut_12_1;
            stackIn_13_0 = stackOut_12_0;
            stackIn_13_1 = stackOut_12_1;
            if (param1 == null) {
              stackOut_14_0 = (RuntimeException) ((Object) stackIn_14_0);
              stackOut_14_1 = (StringBuilder) ((Object) stackIn_14_1);
              stackOut_14_2 = "null";
              stackIn_15_0 = stackOut_14_0;
              stackIn_15_1 = stackOut_14_1;
              stackIn_15_2 = stackOut_14_2;
              break L3;
            } else {
              stackOut_13_0 = (RuntimeException) ((Object) stackIn_13_0);
              stackOut_13_1 = (StringBuilder) ((Object) stackIn_13_1);
              stackOut_13_2 = "{...}";
              stackIn_15_0 = stackOut_13_0;
              stackIn_15_1 = stackOut_13_1;
              stackIn_15_2 = stackOut_13_2;
              break L3;
            }
          }
          throw oj.a((Throwable) ((Object) stackIn_15_0), stackIn_15_2 + ',' + param2 + ',' + param3 + ')');
        }
    }

    final void c(int param0, int param1, int param2) {
        int discarded$0 = 0;
        super.c(param0, param1, param2);
        dl.field_H.a(this.field_fb, (this.field_p >> -2132544511) + param2, 103 + param1, 16777215, -1);
        if (this.field_hb != null) {
            qg.b(20 + param2, 120 + (param1 + -7), 260, 8421504);
            discarded$0 = dl.field_H.a(this.field_hb, 20 + param2, 8 + param1 + 120, 260, 100, 16777215, -1, 1, 0, dl.field_H.field_x);
        }
    }

    final static lj b(int param0, int param1) {
        if (param1 != -1) {
            return (lj) null;
        }
        return bb.a(param0, true, 1, (byte) 95, false, false);
    }

    final static boolean a(byte param0, int param1) {
        try {
            if (!(id.field_b.field_q < param1)) {
                return true;
            }
            if (param0 < 58) {
                field_gb = (int[]) null;
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
