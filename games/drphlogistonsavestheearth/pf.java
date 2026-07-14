/*
 * Decompiled by CFR-JS 0.4.0.
 */
import java.io.*;

final class pf {
    private long field_b;
    static he[] field_c;
    static long field_a;
    static int field_f;
    private long field_d;
    private RandomAccessFile field_e;

    final void c(int param0) throws IOException {
        if (null != ((pf) this).field_e) {
            ((pf) this).field_e.close();
            ((pf) this).field_e = null;
        }
        int var2 = 18 / ((40 - param0) / 47);
    }

    protected final void finalize() throws Throwable {
        if (!(((pf) this).field_e == null)) {
            System.out.println("");
            ((pf) this).c(90);
        }
    }

    final void a(int param0, long param1) throws IOException {
        if (param0 != 1536) {
            pf.b(127);
        }
        ((pf) this).field_e.seek(param1);
        ((pf) this).field_d = param1;
    }

    final static boolean a(int param0, boolean param1, CharSequence param2) {
        int var3 = 0;
        String var4 = null;
        int var5 = 0;
        int var6 = 0;
        int var7 = 0;
        int var8 = 0;
        var8 = DrPhlogistonSavesTheEarth.field_D ? 1 : 0;
        if (param2 != null) {
          L0: {
            if (param0 == 1) {
              break L0;
            } else {
              field_f = 72;
              break L0;
            }
          }
          var3 = param2.length();
          if (-2 < var3) {
            return false;
          } else {
            if (-13 >= var3) {
              L1: {
                var4 = rh.a(-72, param2);
                if (var4 == null) {
                  break L1;
                } else {
                  if (1 > var4.length()) {
                    break L1;
                  } else {
                    L2: {
                      if (je.a(var4.charAt(0), 89)) {
                        break L2;
                      } else {
                        if (je.a(var4.charAt(var4.length() - 1), 117)) {
                          break L2;
                        } else {
                          var5 = 0;
                          var6 = 0;
                          L3: while (true) {
                            if (var6 >= param2.length()) {
                              if (-1 <= (var5 ^ -1)) {
                                return true;
                              } else {
                                return false;
                              }
                            } else {
                              L4: {
                                var7 = param2.charAt(var6);
                                if (je.a((char) var7, 107)) {
                                  var5++;
                                  break L4;
                                } else {
                                  var5 = 0;
                                  break L4;
                                }
                              }
                              if (2 <= var5) {
                                if (!param1) {
                                  return false;
                                } else {
                                  var6++;
                                  continue L3;
                                }
                              } else {
                                var6++;
                                continue L3;
                              }
                            }
                          }
                        }
                      }
                    }
                    return false;
                  }
                }
              }
              return false;
            } else {
              return false;
            }
          }
        } else {
          return false;
        }
    }

    final int a(byte[] param0, int param1, int param2, int param3) throws IOException {
        int var5 = ((pf) this).field_e.read(param0, param3, param1);
        if (!((var5 ^ -1) >= param2)) {
            ((pf) this).field_d = ((pf) this).field_d + (long)var5;
        }
        return var5;
    }

    public static void b(int param0) {
        field_c = null;
        if (param0 > -73) {
            boolean discarded$0 = pf.a((byte) 42);
        }
    }

    final void a(byte param0, int param1, int param2, byte[] param3) throws IOException {
        if ((((pf) this).field_d + (long)param1 ^ -1L) < (((pf) this).field_b ^ -1L)) {
            ((pf) this).field_e.seek(((pf) this).field_b);
            ((pf) this).field_e.write(1);
            throw new EOFException();
        }
        if (param0 > -82) {
            return;
        }
        ((pf) this).field_e.write(param3, param2, param1);
        ((pf) this).field_d = ((pf) this).field_d + (long)param1;
    }

    pf(File param0, String param1, long param2) throws IOException {
        if (param2 == -1L) {
            param2 = 9223372036854775807L;
        }
        if ((param0.length() ^ -1L) < (param2 ^ -1L)) {
            boolean discarded$0 = param0.delete();
        }
        ((pf) this).field_e = new RandomAccessFile(param0, param1);
        ((pf) this).field_b = param2;
        ((pf) this).field_d = 0L;
        int var5 = ((pf) this).field_e.read();
        if (-1 != var5) {
            if (!param1.equals((Object) (Object) "r")) {
                ((pf) this).field_e.seek(0L);
                ((pf) this).field_e.write(var5);
            }
        }
        ((pf) this).field_e.seek(0L);
    }

    final static boolean a(byte param0) {
        if (param0 != 97) {
            field_c = null;
        }
        return sh.field_e;
    }

    final long a(int param0) throws IOException {
        if (param0 >= -38) {
            return -62L;
        }
        return ((pf) this).field_e.length();
    }

    static {
    }
}
