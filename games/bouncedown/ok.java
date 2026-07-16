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

    public static void c(int param0) {
        field_c = null;
        if (param0 < 73) {
            int discarded$0 = ok.d(83);
        }
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
        if ((((ok) this).field_e ^ -1L) > ((long)param2 + ((ok) this).field_b ^ -1L)) {
          ((ok) this).field_d.seek(((ok) this).field_e);
          ((ok) this).field_d.write(1);
          throw new EOFException();
        } else {
          ((ok) this).field_d.write(param3, param1, param2);
          if (param0 != 1) {
            return;
          } else {
            ((ok) this).field_b = ((ok) this).field_b + (long)param2;
            return;
          }
        }
    }

    final static int d(int param0) {
        if (param0 != 1) {
            return 83;
        }
        return cg.field_a;
    }

    final static void a(java.applet.Applet param0, int param1) {
        String var2 = null;
        CharSequence var3 = null;
        var2 = param0.getParameter("username");
        if (var2 != null) {
          var3 = (CharSequence) (Object) var2;
          if ((ma.a((byte) -22, var3) ^ -1L) == -1L) {
            return;
          } else {
            L0: {
              if (param1 < -37) {
                break L0;
              } else {
                tg[] discarded$2 = ok.a(62, 7, 10, -75, 30);
                break L0;
              }
            }
            return;
          }
        } else {
          return;
        }
    }

    final int a(byte[] param0, int param1, int param2, int param3) throws IOException {
        int var5 = 0;
        var5 = ((ok) this).field_d.read(param0, param2, param1);
        if (param3 > (var5 ^ -1)) {
          ((ok) this).field_b = ((ok) this).field_b + (long)var5;
          return var5;
        } else {
          return var5;
        }
    }

    ok(File param0, String param1, long param2) throws IOException {
        int var5 = 0;
        L0: {
          if ((param2 ^ -1L) != 0L) {
            break L0;
          } else {
            param2 = 9223372036854775807L;
            break L0;
          }
        }
        L1: {
          if (param0.length() <= param2) {
            break L1;
          } else {
            boolean discarded$2 = param0.delete();
            break L1;
          }
        }
        ((ok) this).field_d = new RandomAccessFile(param0, param1);
        ((ok) this).field_b = 0L;
        ((ok) this).field_e = param2;
        var5 = ((ok) this).field_d.read();
        if (-1 == var5) {
          ((ok) this).field_d.seek(0L);
          return;
        } else {
          if (param1.equals((Object) (Object) "r")) {
            ((ok) this).field_d.seek(0L);
            return;
          } else {
            ((ok) this).field_d.seek(0L);
            ((ok) this).field_d.write(var5);
            ((ok) this).field_d.seek(0L);
            return;
          }
        }
    }

    final static tg[] a(int param0, int param1, int param2, int param3, int param4) {
        if (param0 != 18938) {
          boolean discarded$2 = ok.a(false, 11);
          return jk.a(param1, 1, param3, -7139, param4, 1, 3, param2, 1);
        } else {
          return jk.a(param1, 1, param3, -7139, param4, 1, 3, param2, 1);
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
              if ((ec.field_P.field_f ^ -1) == -2) {
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
