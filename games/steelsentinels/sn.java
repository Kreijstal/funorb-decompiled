/*
 * Decompiled by CFR-JS 0.4.0.
 */
import java.io.*;

final class sn {
    private long field_m;
    static ul field_r;
    private long field_c;
    private RandomAccessFile field_e;
    static ml field_p;
    static String field_h;
    static String field_a;
    static int field_b;
    static boolean field_d;
    static String field_s;
    static boolean field_n;
    static kg field_j;
    static boolean field_l;
    static String field_k;
    static byte[][] field_g;
    static String field_o;
    static String[] field_i;
    static uf field_f;
    static int field_q;

    final static void a(int param0) {
        int var1_int = 0;
        RuntimeException var1 = null;
        int var2 = 0;
        int var3 = 0;
        int var4 = 0;
        RuntimeException decompiledCaughtException = null;
        var4 = SteelSentinels.field_G;
        try {
          L0: {
            var1_int = ck.field_c[param0];
            var2 = 1;
            L1: while (true) {
              if (var2 >= ck.field_c.length) {
                break L0;
              } else {
                var3 = ck.field_c[var2];
                ii.a(um.field_bb, var2 << 4, um.field_bb, var1_int, var3);
                var1_int = var1_int + var3;
                var2++;
                continue L1;
              }
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var1 = decompiledCaughtException;
          throw ci.a((Throwable) (Object) var1, "sn.I(" + param0 + ')');
        }
    }

    final void a(boolean param0) throws IOException {
        if (!param0) {
            ((sn) this).field_e = null;
            if (!(null == ((sn) this).field_e)) {
                ((sn) this).field_e.close();
                ((sn) this).field_e = null;
            }
            return;
        }
        if (!(null == ((sn) this).field_e)) {
            ((sn) this).field_e.close();
            ((sn) this).field_e = null;
        }
    }

    final static fh a(byte[] param0) {
        int var2_int = 0;
        RuntimeException var2 = null;
        fh var3 = null;
        Object stackIn_2_0 = null;
        fh stackIn_4_0 = null;
        RuntimeException stackIn_6_0 = null;
        StringBuilder stackIn_6_1 = null;
        RuntimeException stackIn_7_0 = null;
        StringBuilder stackIn_7_1 = null;
        RuntimeException stackIn_8_0 = null;
        StringBuilder stackIn_8_1 = null;
        String stackIn_8_2 = null;
        RuntimeException decompiledCaughtException = null;
        fh stackOut_3_0 = null;
        Object stackOut_1_0 = null;
        RuntimeException stackOut_5_0 = null;
        StringBuilder stackOut_5_1 = null;
        RuntimeException stackOut_7_0 = null;
        StringBuilder stackOut_7_1 = null;
        String stackOut_7_2 = null;
        RuntimeException stackOut_6_0 = null;
        StringBuilder stackOut_6_1 = null;
        String stackOut_6_2 = null;
        try {
          L0: {
            var2_int = 28;
            if (param0 != null) {
              var3 = new fh(param0, rl.field_a, oa.field_M, le.field_L, ca.field_r, dl.field_L);
              int discarded$2 = 9324;
              uh.a();
              stackOut_3_0 = (fh) var3;
              stackIn_4_0 = stackOut_3_0;
              break L0;
            } else {
              stackOut_1_0 = null;
              stackIn_2_0 = stackOut_1_0;
              return (fh) (Object) stackIn_2_0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L1: {
            var2 = decompiledCaughtException;
            stackOut_5_0 = (RuntimeException) var2;
            stackOut_5_1 = new StringBuilder().append("sn.C(");
            stackIn_7_0 = stackOut_5_0;
            stackIn_7_1 = stackOut_5_1;
            stackIn_6_0 = stackOut_5_0;
            stackIn_6_1 = stackOut_5_1;
            if (param0 == null) {
              stackOut_7_0 = (RuntimeException) (Object) stackIn_7_0;
              stackOut_7_1 = (StringBuilder) (Object) stackIn_7_1;
              stackOut_7_2 = "null";
              stackIn_8_0 = stackOut_7_0;
              stackIn_8_1 = stackOut_7_1;
              stackIn_8_2 = stackOut_7_2;
              break L1;
            } else {
              stackOut_6_0 = (RuntimeException) (Object) stackIn_6_0;
              stackOut_6_1 = (StringBuilder) (Object) stackIn_6_1;
              stackOut_6_2 = "{...}";
              stackIn_8_0 = stackOut_6_0;
              stackIn_8_1 = stackOut_6_1;
              stackIn_8_2 = stackOut_6_2;
              break L1;
            }
          }
          throw ci.a((Throwable) (Object) stackIn_8_0, stackIn_8_2 + ',' + 103 + ')');
        }
        return stackIn_4_0;
    }

    final void a(int param0, int param1, byte[] param2, int param3) throws IOException {
        RuntimeException var5 = null;
        RuntimeException stackIn_6_0 = null;
        StringBuilder stackIn_6_1 = null;
        RuntimeException stackIn_7_0 = null;
        StringBuilder stackIn_7_1 = null;
        RuntimeException stackIn_8_0 = null;
        StringBuilder stackIn_8_1 = null;
        String stackIn_8_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException stackOut_5_0 = null;
        StringBuilder stackOut_5_1 = null;
        RuntimeException stackOut_7_0 = null;
        StringBuilder stackOut_7_1 = null;
        String stackOut_7_2 = null;
        RuntimeException stackOut_6_0 = null;
        StringBuilder stackOut_6_1 = null;
        String stackOut_6_2 = null;
        try {
          L0: {
            if (~((sn) this).field_m <= ~(((sn) this).field_c + (long)param0)) {
              L1: {
                ((sn) this).field_e.write(param2, param3, param0);
                ((sn) this).field_c = ((sn) this).field_c + (long)param0;
                if (param1 == 1) {
                  break L1;
                } else {
                  field_s = null;
                  break L1;
                }
              }
              break L0;
            } else {
              ((sn) this).field_e.seek(((sn) this).field_m);
              ((sn) this).field_e.write(1);
              throw new EOFException();
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L2: {
            var5 = decompiledCaughtException;
            stackOut_5_0 = (RuntimeException) var5;
            stackOut_5_1 = new StringBuilder().append("sn.D(").append(param0).append(',').append(param1).append(',');
            stackIn_7_0 = stackOut_5_0;
            stackIn_7_1 = stackOut_5_1;
            stackIn_6_0 = stackOut_5_0;
            stackIn_6_1 = stackOut_5_1;
            if (param2 == null) {
              stackOut_7_0 = (RuntimeException) (Object) stackIn_7_0;
              stackOut_7_1 = (StringBuilder) (Object) stackIn_7_1;
              stackOut_7_2 = "null";
              stackIn_8_0 = stackOut_7_0;
              stackIn_8_1 = stackOut_7_1;
              stackIn_8_2 = stackOut_7_2;
              break L2;
            } else {
              stackOut_6_0 = (RuntimeException) (Object) stackIn_6_0;
              stackOut_6_1 = (StringBuilder) (Object) stackIn_6_1;
              stackOut_6_2 = "{...}";
              stackIn_8_0 = stackOut_6_0;
              stackIn_8_1 = stackOut_6_1;
              stackIn_8_2 = stackOut_6_2;
              break L2;
            }
          }
          throw ci.a((Throwable) (Object) stackIn_8_0, stackIn_8_2 + ',' + param3 + ')');
        }
    }

    final void a(long param0, int param1) throws IOException {
        ((sn) this).field_e.seek(param0);
        ((sn) this).field_c = param0;
        if (param1 != -1) {
            sn.a(-104);
            return;
        }
    }

    protected final void finalize() throws Throwable {
        if (null != ((sn) this).field_e) {
            System.out.println("");
            ((sn) this).a(true);
        }
    }

    public static void b() {
        field_g = null;
        field_f = null;
        field_a = null;
        field_i = null;
        field_r = null;
        field_s = null;
        field_p = null;
        field_o = null;
        field_j = null;
        field_k = null;
        field_h = null;
    }

    final long d(int param0) throws IOException {
        if (param0 != 0) {
            sn.a(-66);
            return ((sn) this).field_e.length();
        }
        return ((sn) this).field_e.length();
    }

    final int a(byte[] param0, int param1, int param2, boolean param3) throws IOException {
        int var5_int = 0;
        RuntimeException var5 = null;
        int stackIn_5_0 = 0;
        RuntimeException stackIn_7_0 = null;
        StringBuilder stackIn_7_1 = null;
        RuntimeException stackIn_8_0 = null;
        StringBuilder stackIn_8_1 = null;
        RuntimeException stackIn_9_0 = null;
        StringBuilder stackIn_9_1 = null;
        String stackIn_9_2 = null;
        RuntimeException decompiledCaughtException = null;
        int stackOut_4_0 = 0;
        RuntimeException stackOut_6_0 = null;
        StringBuilder stackOut_6_1 = null;
        RuntimeException stackOut_8_0 = null;
        StringBuilder stackOut_8_1 = null;
        String stackOut_8_2 = null;
        RuntimeException stackOut_7_0 = null;
        StringBuilder stackOut_7_1 = null;
        String stackOut_7_2 = null;
        try {
          L0: {
            L1: {
              var5_int = ((sn) this).field_e.read(param0, param1, param2);
              if (!param3) {
                break L1;
              } else {
                sn.a(-122);
                break L1;
              }
            }
            L2: {
              if (var5_int <= 0) {
                break L2;
              } else {
                ((sn) this).field_c = ((sn) this).field_c + (long)var5_int;
                break L2;
              }
            }
            stackOut_4_0 = var5_int;
            stackIn_5_0 = stackOut_4_0;
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L3: {
            var5 = decompiledCaughtException;
            stackOut_6_0 = (RuntimeException) var5;
            stackOut_6_1 = new StringBuilder().append("sn.A(");
            stackIn_8_0 = stackOut_6_0;
            stackIn_8_1 = stackOut_6_1;
            stackIn_7_0 = stackOut_6_0;
            stackIn_7_1 = stackOut_6_1;
            if (param0 == null) {
              stackOut_8_0 = (RuntimeException) (Object) stackIn_8_0;
              stackOut_8_1 = (StringBuilder) (Object) stackIn_8_1;
              stackOut_8_2 = "null";
              stackIn_9_0 = stackOut_8_0;
              stackIn_9_1 = stackOut_8_1;
              stackIn_9_2 = stackOut_8_2;
              break L3;
            } else {
              stackOut_7_0 = (RuntimeException) (Object) stackIn_7_0;
              stackOut_7_1 = (StringBuilder) (Object) stackIn_7_1;
              stackOut_7_2 = "{...}";
              stackIn_9_0 = stackOut_7_0;
              stackIn_9_1 = stackOut_7_1;
              stackIn_9_2 = stackOut_7_2;
              break L3;
            }
          }
          throw ci.a((Throwable) (Object) stackIn_9_0, stackIn_9_2 + ',' + param1 + ',' + param2 + ',' + param3 + ')');
        }
        return stackIn_5_0;
    }

    sn(File param0, String param1, long param2) throws IOException {
        int var5_int = 0;
        try {
            if (-1L == param2) {
                param2 = 9223372036854775807L;
            }
            if (param2 < param0.length()) {
                boolean discarded$0 = param0.delete();
            }
            ((sn) this).field_e = new RandomAccessFile(param0, param1);
            ((sn) this).field_c = 0L;
            ((sn) this).field_m = param2;
            var5_int = ((sn) this).field_e.read();
            if (var5_int != -1) {
                if (!param1.equals((Object) (Object) "r")) {
                    ((sn) this).field_e.seek(0L);
                    ((sn) this).field_e.write(var5_int);
                }
            }
            ((sn) this).field_e.seek(0L);
        } catch (RuntimeException runtimeException) {
            throw ci.a((Throwable) (Object) runtimeException, "sn.<init>(" + (param0 != null ? "{...}" : "null") + ',' + (param1 != null ? "{...}" : "null") + ',' + param2 + ')');
        }
    }

    final static void c() {
        RuntimeException var1 = null;
        int var2 = 0;
        RuntimeException decompiledCaughtException = null;
        var2 = SteelSentinels.field_G;
        try {
          L0: {
            int discarded$14 = 84;
            if (!oc.a()) {
              L1: {
                if (wb.field_c == null) {
                  break L1;
                } else {
                  if (wb.field_c.field_b) {
                    ub.c(0);
                    dl.field_J.a((lh) (Object) new jd(dl.field_J, wh.field_b), 116);
                    break L1;
                  } else {
                    break L1;
                  }
                }
              }
              return;
            } else {
              boolean discarded$15 = dl.field_J.a((byte) 40, true, km.field_l, ml.field_e);
              dl.field_J.h((byte) -4);
              L2: while (true) {
                if (!dl.f(22759)) {
                  break L0;
                } else {
                  boolean discarded$16 = dl.field_J.a(true, ei.field_q, de.field_c);
                  continue L2;
                }
              }
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var1 = decompiledCaughtException;
          throw ci.a((Throwable) (Object) var1, "sn.H(" + -51 + ')');
        }
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_r = new ul();
        field_p = new ml();
        field_b = 1;
        field_s = "<%0> is already on your ignore list.";
        field_h = "Discard";
        field_k = "Respawns: <col=ffffff><%0></col>";
        field_n = false;
        field_o = "X";
        field_a = "ALT";
        field_i = new String[]{"CHASSIS", "HEAD", "ARM", "WING", "<img=8> LIGHT WEAPONS", "<img=9> HEAVY WEAPONS", "<img=10> ORDNANCE WEAPONS", "<img=11> SMALL ROCKETS AND MISSILES", "<img=12> LARGE ROCKETS AND MISSILES", "<img=18> NUKE - GOLEM CHASSIS ONLY", "REAR ARM", "BIG ARM"};
        field_q = -1;
    }
}
