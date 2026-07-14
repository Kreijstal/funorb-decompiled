/*
 * Decompiled by CFR-JS 0.4.0.
 */
import java.io.*;

final class wk {
    private long field_c;
    static long field_d;
    private long field_b;
    private RandomAccessFile field_a;

    final int a(int param0, byte[] param1, int param2, int param3) throws IOException {
        int var5 = ((wk) this).field_a.read(param1, param2, param0);
        if (!((var5 ^ -1) >= param3)) {
            ((wk) this).field_b = ((wk) this).field_b + (long)var5;
        }
        return var5;
    }

    final static void a(byte param0, long param1) {
        if ((param1 ^ -1L) >= -1L) {
            return;
        }
        if (param0 > -88) {
            return;
        }
        if (-1L != (param1 % 10L ^ -1L)) {
            ie.a((byte) 10, param1);
        } else {
            ie.a((byte) 10, param1 + -1L);
            ie.a((byte) 10, 1L);
            return;
        }
    }

    final static String a(char param0, int param1, String param2, String param3) {
        int var4 = 0;
        int var5 = 0;
        int var6 = 0;
        int var7 = 0;
        int var8_int = 0;
        StringBuilder var8 = null;
        int var9 = 0;
        int var10 = 0;
        int var11 = 0;
        StringBuilder var12 = null;
        StringBuilder var13 = null;
        var11 = Main.field_T;
        var4 = param2.length();
        var5 = param3.length();
        if (param1 > 11) {
          var6 = var4;
          var7 = var5 + -1;
          if (var7 == 0) {
            var12 = new StringBuilder(var6);
            var9 = 0;
            L0: while (true) {
              var10 = param2.indexOf((int) param0, var9);
              if ((var10 ^ -1) > -1) {
                StringBuilder discarded$12 = var12.append(param2.substring(var9));
                return var12.toString();
              } else {
                StringBuilder discarded$13 = var12.append(param2.substring(var9, var10));
                StringBuilder discarded$14 = var12.append(param3);
                var9 = var10 - -1;
                continue L0;
              }
            }
          } else {
            var8_int = 0;
            L1: while (true) {
              var8_int = param2.indexOf((int) param0, var8_int);
              if ((var8_int ^ -1) <= -1) {
                var8_int++;
                var6 = var6 + var7;
                continue L1;
              } else {
                var13 = new StringBuilder(var6);
                var8 = var13;
                var9 = 0;
                L2: while (true) {
                  var10 = param2.indexOf((int) param0, var9);
                  if ((var10 ^ -1) > -1) {
                    StringBuilder discarded$15 = var13.append(param2.substring(var9));
                    return var13.toString();
                  } else {
                    StringBuilder discarded$16 = var13.append(param2.substring(var9, var10));
                    StringBuilder discarded$17 = var13.append(param3);
                    var9 = var10 - -1;
                    continue L2;
                  }
                }
              }
            }
          }
        } else {
          wk.a(false);
          var6 = var4;
          var7 = var5 + -1;
          if (var7 == 0) {
            var8 = new StringBuilder(var6);
            var9 = 0;
            L3: while (true) {
              var10 = param2.indexOf((int) param0, var9);
              if ((var10 ^ -1) > -1) {
                StringBuilder discarded$18 = var8.append(param2.substring(var9));
                return var8.toString();
              } else {
                StringBuilder discarded$19 = var8.append(param2.substring(var9, var10));
                StringBuilder discarded$20 = var8.append(param3);
                var9 = var10 - -1;
                continue L3;
              }
            }
          } else {
            var8_int = 0;
            L4: while (true) {
              var8_int = param2.indexOf((int) param0, var8_int);
              if ((var8_int ^ -1) <= -1) {
                var8_int++;
                var6 = var6 + var7;
                continue L4;
              } else {
                var8 = new StringBuilder(var6);
                var9 = 0;
                L5: while (true) {
                  var10 = param2.indexOf((int) param0, var9);
                  if ((var10 ^ -1) > -1) {
                    StringBuilder discarded$21 = var8.append(param2.substring(var9));
                    return var8.toString();
                  } else {
                    StringBuilder discarded$22 = var8.append(param2.substring(var9, var10));
                    StringBuilder discarded$23 = var8.append(param3);
                    var9 = var10 - -1;
                    continue L5;
                  }
                }
              }
            }
          }
        }
    }

    final long a(int param0) throws IOException {
        if (param0 != 11311) {
            return 27L;
        }
        return ((wk) this).field_a.length();
    }

    protected final void finalize() throws Throwable {
        if (!(((wk) this).field_a == null)) {
            System.out.println("");
            ((wk) this).a((byte) 87);
        }
    }

    final static boolean b(byte param0) {
        if (param0 != -112) {
            return false;
        }
        if (null == cb.field_j) {
            return false;
        }
        if (!ra.field_b.c(0)) {
            return false;
        }
        return true;
    }

    final void a(long param0, boolean param1) throws IOException {
        if (param1) {
            return;
        }
        ((wk) this).field_a.seek(param0);
        ((wk) this).field_b = param0;
    }

    final static void a(boolean param0) {
        int var2 = 0;
        var2 = Main.field_T;
        if (!ia.a((byte) -79)) {
          if (null != gj.field_a) {
            L0: {
              if (gj.field_a.field_b) {
                ga.a(true);
                s.field_d.b((lk) (Object) new ol(s.field_d, tk.field_b), (byte) -15);
                break L0;
              } else {
                break L0;
              }
            }
            return;
          } else {
            return;
          }
        } else {
          boolean discarded$12 = s.field_d.a((byte) -116, hk.field_b, e.field_c, true);
          s.field_d.l(-2054);
          if (!param0) {
            L1: while (true) {
              if (ge.b((byte) -114)) {
                boolean discarded$13 = s.field_d.a(fd.field_n, 34, tb.field_d);
                continue L1;
              } else {
                return;
              }
            }
          } else {
            return;
          }
        }
    }

    final void b(int param0, byte[] param1, int param2, int param3) throws IOException {
        if (param2 != 0) {
            return;
        }
        if (!(((wk) this).field_b + (long)param3 <= ((wk) this).field_c)) {
            ((wk) this).field_a.seek(((wk) this).field_c);
            ((wk) this).field_a.write(1);
            throw new EOFException();
        }
        ((wk) this).field_a.write(param1, param0, param3);
        ((wk) this).field_b = ((wk) this).field_b + (long)param3;
    }

    final void a(byte param0) throws IOException {
        if (null == ((wk) this).field_a) {
          if (param0 > 9) {
            return;
          } else {
            wk.a((byte) -90, 9L);
            return;
          }
        } else {
          ((wk) this).field_a.close();
          ((wk) this).field_a = null;
          if (param0 > 9) {
            return;
          } else {
            wk.a((byte) -90, 9L);
            return;
          }
        }
    }

    wk(File param0, String param1, long param2) throws IOException {
        if (param2 == -1L) {
            param2 = 9223372036854775807L;
        }
        if ((param2 ^ -1L) > (param0.length() ^ -1L)) {
            boolean discarded$0 = param0.delete();
        }
        ((wk) this).field_a = new RandomAccessFile(param0, param1);
        ((wk) this).field_b = 0L;
        ((wk) this).field_c = param2;
        int var5 = ((wk) this).field_a.read();
        if ((var5 ^ -1) != 0) {
            // ifne L116
            ((wk) this).field_a.seek(0L);
            ((wk) this).field_a.write(var5);
        } else {
            ((wk) this).field_a.seek(0L);
            ((wk) this).field_a.seek(0L);
        }
        ((wk) this).field_a.seek(0L);
    }

    static {
    }
}
