/*
 * Decompiled by CFR-JS 0.4.0.
 */
import java.io.*;

final class ok {
    static int field_a;
    private RandomAccessFile field_d;
    private long field_b;
    private long field_e;
    static int[] field_c;

    protected final void finalize() throws Throwable {
        if (((ok) this).field_d != null) {
            System.out.println("");
            ((ok) this).b(1337);
        }
    }

    public static void c() {
        field_c = null;
    }

    final void a(long param0, int param1) throws IOException {
        if (param1 != 20663) {
            return;
        }
        ((ok) this).field_d.seek(param0);
        ((ok) this).field_b = param0;
    }

    final long a(int param0) throws IOException {
        if (param0 < 87) {
            ((ok) this).field_b = -16L;
            return ((ok) this).field_d.length();
        }
        return ((ok) this).field_d.length();
    }

    final void b(int param0) throws IOException {
        if (param0 != 1337) {
            return;
        }
        if (!(((ok) this).field_d == null)) {
            ((ok) this).field_d.close();
            ((ok) this).field_d = null;
        }
    }

    final void a(int param0, int param1, int param2, byte[] param3) throws IOException {
        if (!(~((ok) this).field_e <= ~((long)param2 + ((ok) this).field_b))) {
            ((ok) this).field_d.seek(((ok) this).field_e);
            ((ok) this).field_d.write(1);
            throw new EOFException();
        }
        ((ok) this).field_d.write(param3, param1, param2);
        if (param0 != 1) {
            return;
        }
        try {
            ((ok) this).field_b = ((ok) this).field_b + (long)param2;
        } catch (RuntimeException runtimeException) {
            throw ii.a((Throwable) (Object) runtimeException, "ok.F(" + param0 + ',' + param1 + ',' + param2 + ',' + (param3 != null ? "{...}" : "null") + ')');
        }
    }

    final static int d(int param0) {
        if (param0 != 1) {
            return 83;
        }
        return cg.field_a;
    }

    final static void a(java.applet.Applet param0) {
        String var2 = null;
        RuntimeException var2_ref = null;
        CharSequence var3 = null;
        RuntimeException stackIn_6_0 = null;
        StringBuilder stackIn_6_1 = null;
        RuntimeException stackIn_7_0 = null;
        StringBuilder stackIn_7_1 = null;
        RuntimeException stackIn_8_0 = null;
        StringBuilder stackIn_8_1 = null;
        String stackIn_8_2 = null;
        int decompiledRegionSelector0 = 0;
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
            L1: {
              var2 = param0.getParameter("username");
              if (var2 == null) {
                break L1;
              } else {
                var3 = (CharSequence) (Object) var2;
                if (ma.a((byte) -22, var3) != 0L) {
                  decompiledRegionSelector0 = 1;
                  break L0;
                } else {
                  break L1;
                }
              }
            }
            decompiledRegionSelector0 = 0;
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L2: {
            var2_ref = decompiledCaughtException;
            stackOut_5_0 = (RuntimeException) var2_ref;
            stackOut_5_1 = new StringBuilder().append("ok.G(");
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
          throw ii.a((Throwable) (Object) stackIn_8_0, stackIn_8_2 + ',' + -122 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return;
        } else {
          return;
        }
    }

    final int a(byte[] param0, int param1, int param2, int param3) throws IOException {
        int var5_int = 0;
        RuntimeException var5 = null;
        int stackIn_3_0 = 0;
        RuntimeException stackIn_5_0 = null;
        StringBuilder stackIn_5_1 = null;
        RuntimeException stackIn_6_0 = null;
        StringBuilder stackIn_6_1 = null;
        RuntimeException stackIn_7_0 = null;
        StringBuilder stackIn_7_1 = null;
        String stackIn_7_2 = null;
        RuntimeException decompiledCaughtException = null;
        int stackOut_2_0 = 0;
        RuntimeException stackOut_4_0 = null;
        StringBuilder stackOut_4_1 = null;
        RuntimeException stackOut_6_0 = null;
        StringBuilder stackOut_6_1 = null;
        String stackOut_6_2 = null;
        RuntimeException stackOut_5_0 = null;
        StringBuilder stackOut_5_1 = null;
        String stackOut_5_2 = null;
        try {
          L0: {
            L1: {
              var5_int = ((ok) this).field_d.read(param0, param2, param1);
              if (param3 <= ~var5_int) {
                break L1;
              } else {
                ((ok) this).field_b = ((ok) this).field_b + (long)var5_int;
                break L1;
              }
            }
            stackOut_2_0 = var5_int;
            stackIn_3_0 = stackOut_2_0;
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L2: {
            var5 = decompiledCaughtException;
            stackOut_4_0 = (RuntimeException) var5;
            stackOut_4_1 = new StringBuilder().append("ok.E(");
            stackIn_6_0 = stackOut_4_0;
            stackIn_6_1 = stackOut_4_1;
            stackIn_5_0 = stackOut_4_0;
            stackIn_5_1 = stackOut_4_1;
            if (param0 == null) {
              stackOut_6_0 = (RuntimeException) (Object) stackIn_6_0;
              stackOut_6_1 = (StringBuilder) (Object) stackIn_6_1;
              stackOut_6_2 = "null";
              stackIn_7_0 = stackOut_6_0;
              stackIn_7_1 = stackOut_6_1;
              stackIn_7_2 = stackOut_6_2;
              break L2;
            } else {
              stackOut_5_0 = (RuntimeException) (Object) stackIn_5_0;
              stackOut_5_1 = (StringBuilder) (Object) stackIn_5_1;
              stackOut_5_2 = "{...}";
              stackIn_7_0 = stackOut_5_0;
              stackIn_7_1 = stackOut_5_1;
              stackIn_7_2 = stackOut_5_2;
              break L2;
            }
          }
          throw ii.a((Throwable) (Object) stackIn_7_0, stackIn_7_2 + ',' + param1 + ',' + param2 + ',' + param3 + ')');
        }
        return stackIn_3_0;
    }

    ok(File param0, String param1, long param2) throws IOException {
        int var5_int = 0;
        try {
            if (param2 == -1L) {
                param2 = 9223372036854775807L;
            }
            if (param0.length() > param2) {
                boolean discarded$0 = param0.delete();
            }
            ((ok) this).field_d = new RandomAccessFile(param0, param1);
            ((ok) this).field_b = 0L;
            ((ok) this).field_e = param2;
            var5_int = ((ok) this).field_d.read();
            if (-1 != var5_int) {
                if (!param1.equals((Object) (Object) "r")) {
                    ((ok) this).field_d.seek(0L);
                    ((ok) this).field_d.write(var5_int);
                }
            }
            ((ok) this).field_d.seek(0L);
        } catch (RuntimeException runtimeException) {
            throw ii.a((Throwable) (Object) runtimeException, "ok.<init>(" + (param0 != null ? "{...}" : "null") + ',' + (param1 != null ? "{...}" : "null") + ',' + param2 + ')');
        }
    }

    final static tg[] a(int param0, int param1, int param2, int param3, int param4) {
        if (param0 != 18938) {
          boolean discarded$2 = ok.a(false, 11);
          return jk.a(0, 1, 0, -7139, 65793, 1, 3, 0, 1);
        } else {
          return jk.a(0, 1, 0, -7139, 65793, 1, 3, 0, 1);
        }
    }

    final static boolean a(boolean param0, int param1) {
        try {
            IOException var2 = null;
            ii var4 = null;
            ii var5 = null;
            int stackIn_13_0 = 0;
            Throwable decompiledCaughtException = null;
            int stackOut_12_0 = 0;
            int stackOut_11_0 = 0;
            L0: {
              if (null == ec.field_P) {
                ec.field_P = pj.field_c.a(gk.field_h, td.field_b, 0);
                break L0;
              } else {
                break L0;
              }
            }
            if (ec.field_P.field_f != 0) {
              long dupTemp$8 = fa.a(73);
              wa.field_e = dupTemp$8;
              qe.field_k = dupTemp$8;
              if (ec.field_P.field_f == 1) {
                try {
                  L1: {
                    L2: {
                      dh.field_a = new pc((java.net.Socket) ec.field_P.field_e, pj.field_c);
                      var4 = jc.field_g;
                      var5 = var4;
                      hh.field_p.field_h = 0;
                      if (!param0) {
                        stackOut_12_0 = -1;
                        stackIn_13_0 = stackOut_12_0;
                        break L2;
                      } else {
                        stackOut_11_0 = -2;
                        stackIn_13_0 = stackOut_11_0;
                        break L2;
                      }
                    }
                    ak.field_z = stackIn_13_0;
                    i.field_f = stackIn_13_0;
                    ck.field_b = stackIn_13_0;
                    pj.field_a = ga.field_c;
                    var5.field_h = 0;
                    fj.a(fi.field_b, 6, cf.field_a, (wi) (Object) hh.field_p, of.field_c);
                    jj.a(-1, true);
                    break L1;
                  }
                } catch (java.io.IOException decompiledCaughtParameter0) {
                  decompiledCaughtException = decompiledCaughtParameter0;
                  var2 = (IOException) (Object) decompiledCaughtException;
                  pj.field_a = ri.field_C;
                  ec.field_P = null;
                  if (param1 <= 117) {
                    int discarded$9 = ok.d(70);
                    return true;
                  } else {
                    return true;
                  }
                }
                L3: {
                  ec.field_P = null;
                  if (param1 > 117) {
                    break L3;
                  } else {
                    int discarded$10 = ok.d(70);
                    break L3;
                  }
                }
                return true;
              } else {
                pj.field_a = ri.field_C;
                ec.field_P = null;
                if (param1 <= 117) {
                  int discarded$11 = ok.d(70);
                  return true;
                } else {
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

    static {
    }
}
