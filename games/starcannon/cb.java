/*
 * Decompiled by CFR-JS 0.4.0.
 */
import java.io.*;

final class cb {
    static int field_f;
    private long field_e;
    static byte[] field_b;
    static ae field_d;
    static long field_a;
    private long field_g;
    private RandomAccessFile field_h;
    static ue field_c;

    final static byte[] a(String param0, byte param1) {
        if (param1 != -124) {
            return null;
        }
        return ri.field_c.a("", (byte) -128, param0);
    }

    final void a(int param0, long param1) throws IOException {
        ((cb) this).field_h.seek(param1);
        if (param0 != 0) {
            cb.b(17);
        }
        ((cb) this).field_e = param1;
    }

    final long c(int param0) throws IOException {
        int var2 = -109 % ((44 - param0) / 55);
        return ((cb) this).field_h.length();
    }

    final void a(int param0) throws IOException {
        if (null != ((cb) this).field_h) {
            ((cb) this).field_h.close();
            ((cb) this).field_h = null;
        }
        if (param0 != 1) {
            String discarded$0 = cb.b(false);
        }
    }

    final void a(int param0, byte[] param1, int param2, int param3) throws IOException {
        if (param2 != 494) {
            field_b = null;
        }
        if (!(((cb) this).field_g >= (long)param3 + ((cb) this).field_e)) {
            ((cb) this).field_h.seek(((cb) this).field_g);
            ((cb) this).field_h.write(1);
            throw new EOFException();
        }
        ((cb) this).field_h.write(param1, param0, param3);
        ((cb) this).field_e = ((cb) this).field_e + (long)param3;
    }

    final int a(byte[] param0, int param1, int param2, byte param3) throws IOException {
        if (param3 > -72) {
            cb.a((byte) 54);
        }
        int var5 = ((cb) this).field_h.read(param0, param1, param2);
        if (var5 > 0) {
            ((cb) this).field_e = ((cb) this).field_e + (long)var5;
        }
        return var5;
    }

    final static void a(byte param0) {
        int var2 = 0;
        oj var3 = null;
        int var4 = 0;
        int var5 = 0;
        int var6_int = 0;
        String[][] var6 = null;
        int var8 = 0;
        int var9 = 0;
        int var10 = 0;
        int var11 = 0;
        ia var12 = null;
        int var13 = 0;
        int var14 = 0;
        ia var15 = null;
        int[][] var19 = null;
        var12 = se.field_p;
        var15 = var12;
        var2 = var15.j(7909);
        var3 = (oj) (Object) uc.field_b.c(-3905);
        L0: while (true) {
          L1: {
            if (var3 == null) {
              break L1;
            } else {
              if (var3.field_i == var2) {
                break L1;
              } else {
                var3 = (oj) (Object) uc.field_b.a(-16913);
                continue L0;
              }
            }
          }
          if (var3 != null) {
            L2: {
              if (param0 <= -93) {
                break L2;
              } else {
                String discarded$1 = cb.b(false);
                break L2;
              }
            }
            L3: {
              var4 = var15.j(7909);
              if (0 != var4) {
                var5 = var3.field_h;
                ef.field_f[0] = we.field_i;
                var6_int = 1;
                L4: while (true) {
                  if (var6_int >= var4) {
                    ai.a(var5, false, var4);
                    var6_int = 0;
                    L5: while (true) {
                      if (var4 <= var6_int) {
                        kk.a(var5, 42);
                        var6 = new String[2][var5];
                        var19 = new int[2][var5 * 4];
                        var8 = ed.field_p;
                        var9 = 0;
                        var10 = 0;
                        L6: while (true) {
                          if (var9 >= var8) {
                            var13 = 0;
                            var9 = var13;
                            var14 = 0;
                            var10 = var14;
                            L7: while (true) {
                              if (var8 <= var13) {
                                break L3;
                              } else {
                                var11 = jk.field_c[var13 + var5];
                                var6[1][var14] = ef.field_f[var11];
                                var19[1][4 * var14] = tk.field_f[var11];
                                var19[1][1 + 4 * var14] = nf.field_b[var11];
                                var19[1][2 + 4 * var14] = gj.field_f[var11];
                                var19[1][4 * var14 - -3] = ab.field_G[var11];
                                if (mc.a(ef.field_f[var11], 0)) {
                                  if (-1 == (nf.field_b[var11] + gj.field_f[var11] - -ab.field_G[var11] ^ -1)) {
                                    var6[1][var14] = null;
                                    var14--;
                                    var14++;
                                    var13++;
                                    continue L7;
                                  } else {
                                    var14++;
                                    var13++;
                                    continue L7;
                                  }
                                } else {
                                  var14++;
                                  var13++;
                                  continue L7;
                                }
                              }
                            }
                          } else {
                            var11 = jk.field_c[var9];
                            var6[0][var10] = ef.field_f[var11];
                            var19[0][var10 * 4] = tk.field_f[var11];
                            var19[0][1 + var10 * 4] = nf.field_b[var11];
                            var19[0][2 + 4 * var10] = gj.field_f[var11];
                            var19[0][4 * var10 - -3] = ab.field_G[var11];
                            if (mc.a(ef.field_f[var11], 0)) {
                              if (0 == nf.field_b[var11] + (gj.field_f[var11] - -ab.field_G[var11])) {
                                var6[0][var10] = null;
                                var10--;
                                var10++;
                                var9++;
                                continue L6;
                              } else {
                                var10++;
                                var9++;
                                continue L6;
                              }
                            } else {
                              var10++;
                              var9++;
                              continue L6;
                            }
                          }
                        }
                      } else {
                        o.a(-20954, (rb) (Object) var15);
                        if (-1 != (var6_int ^ -1)) {
                          fa.a(mc.field_f, var6_int, og.field_f, rb.field_i, ta.field_e, -106);
                          var6_int++;
                          continue L5;
                        } else {
                          fa.a(mc.field_f, var6_int, og.field_f, rb.field_i, ta.field_e, 12);
                          var6_int++;
                          continue L5;
                        }
                      }
                    }
                  } else {
                    ef.field_f[var6_int] = var12.a(-103);
                    var6_int++;
                    continue L4;
                  }
                }
              } else {
                break L3;
              }
            }
            var3.b(4);
            return;
          } else {
            ec.a((byte) 27);
            return;
          }
        }
    }

    public static void b(int param0) {
        if (param0 != 0) {
            field_b = null;
        }
        field_b = null;
        field_d = null;
        field_c = null;
    }

    final static String b(boolean param0) {
        if (we.field_i == null) {
            return "";
        }
        if (!param0) {
            field_c = null;
        }
        return we.field_i;
    }

    protected final void finalize() throws Throwable {
        if (null != ((cb) this).field_h) {
            System.out.println("");
            ((cb) this).a(1);
        }
    }

    final static boolean a(boolean param0) {
        if (param0) {
            boolean discarded$0 = cb.a(true);
        }
        return nd.b(true);
    }

    cb(File param0, String param1, long param2) throws IOException {
        if (-1L == param2) {
            param2 = 9223372036854775807L;
        }
        if ((param0.length() ^ -1L) < (param2 ^ -1L)) {
            boolean discarded$0 = param0.delete();
        }
        ((cb) this).field_h = new RandomAccessFile(param0, param1);
        ((cb) this).field_g = param2;
        ((cb) this).field_e = 0L;
        int var5 = ((cb) this).field_h.read();
        if (0 != (var5 ^ -1)) {
            if (!param1.equals((Object) (Object) "r")) {
                ((cb) this).field_h.seek(0L);
                ((cb) this).field_h.write(var5);
            }
        }
        ((cb) this).field_h.seek(0L);
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_b = new byte[520];
        field_d = new ae();
    }
}
