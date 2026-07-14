/*
 * Decompiled by CFR-JS 0.4.0.
 */
import java.io.*;

final class di {
    static boolean field_b;
    static int field_e;
    private long field_c;
    private long field_g;
    private RandomAccessFile field_f;
    static ci field_h;
    static String field_a;
    static int field_d;

    final void a(byte param0, byte[] param1, int param2, int param3) throws IOException {
        if ((((di) this).field_g + (long)param2 ^ -1L) < (((di) this).field_c ^ -1L)) {
          ((di) this).field_f.seek(((di) this).field_c);
          ((di) this).field_f.write(1);
          throw new EOFException();
        } else {
          if (param0 < 60) {
            field_e = 104;
            ((di) this).field_f.write(param1, param3, param2);
            ((di) this).field_g = ((di) this).field_g + (long)param2;
            return;
          } else {
            ((di) this).field_f.write(param1, param3, param2);
            ((di) this).field_g = ((di) this).field_g + (long)param2;
            return;
          }
        }
    }

    final static char a(int param0, byte param1) {
        int var2 = 0;
        int var3 = 0;
        var2 = param1 & 255;
        if (var2 == 0) {
          throw new IllegalArgumentException("" + Integer.toString(var2, 16));
        } else {
          if (-129 >= (var2 ^ -1)) {
            if (var2 < 160) {
              L0: {
                var3 = af.field_a[-128 + var2];
                if (var3 == 0) {
                  var3 = 63;
                  break L0;
                } else {
                  break L0;
                }
              }
              var2 = var3;
              if (param0 <= 55) {
                return '￭';
              } else {
                return (char)var2;
              }
            } else {
              if (param0 <= 55) {
                return '￭';
              } else {
                return (char)var2;
              }
            }
          } else {
            if (param0 <= 55) {
              return '￭';
            } else {
              return (char)var2;
            }
          }
        }
    }

    final void a(boolean param0) throws IOException {
        if (((di) this).field_f == null) {
          if (param0) {
            di.c(86);
            return;
          } else {
            return;
          }
        } else {
          ((di) this).field_f.close();
          ((di) this).field_f = null;
          if (!param0) {
            return;
          } else {
            di.c(86);
            return;
          }
        }
    }

    final int a(byte[] param0, boolean param1, int param2, int param3) throws IOException {
        int var5 = 0;
        L0: {
          var5 = ((di) this).field_f.read(param0, param3, param2);
          if ((var5 ^ -1) < -1) {
            ((di) this).field_g = ((di) this).field_g + (long)var5;
            break L0;
          } else {
            break L0;
          }
        }
        if (!param1) {
          return 34;
        } else {
          return var5;
        }
    }

    protected final void finalize() throws Throwable {
        if (!(((di) this).field_f == null)) {
            System.out.println("");
            ((di) this).a(false);
        }
    }

    public static void b(int param0) {
        field_h = null;
        field_a = null;
        if (param0 <= 3) {
            di.b(97);
        }
    }

    final static void d(int param0) {
        int var1 = 0;
        int var2 = 0;
        var2 = Transmogrify.field_A ? 1 : 0;
        tg.field_c = null;
        aa.field_g = false;
        if (lb.field_d) {
          wg.field_d.t(2121792);
          if (param0 != -4690) {
            field_e = -128;
            return;
          } else {
            return;
          }
        } else {
          var1 = db.field_d;
          if (var1 > 0) {
            if ((var1 ^ -1) != -2) {
              tg.field_c = ij.a(uh.field_d, new String[1], (byte) -78);
              tg.field_c = wk.a(73, new CharSequence[3]);
              wg.field_d.r(77);
              dg.b(-86);
              if (param0 != -4690) {
                field_e = -128;
                return;
              } else {
                return;
              }
            } else {
              tg.field_c = hg.field_d;
              tg.field_c = wk.a(73, new CharSequence[3]);
              wg.field_d.r(77);
              dg.b(-86);
              if (param0 == -4690) {
                return;
              } else {
                field_e = -128;
                return;
              }
            }
          } else {
            wg.field_d.r(77);
            dg.b(-86);
            if (param0 == -4690) {
              return;
            } else {
              field_e = -128;
              return;
            }
          }
        }
    }

    di(File param0, String param1, long param2) throws IOException {
        if (param2 == -1L) {
            param2 = 9223372036854775807L;
        }
        if ((param2 ^ -1L) > (param0.length() ^ -1L)) {
            boolean discarded$0 = param0.delete();
        }
        ((di) this).field_f = new RandomAccessFile(param0, param1);
        ((di) this).field_g = 0L;
        ((di) this).field_c = param2;
        int var5 = ((di) this).field_f.read();
        if (var5 != -1) {
            // ifne L114
            ((di) this).field_f.seek(0L);
            ((di) this).field_f.write(var5);
        } else {
            ((di) this).field_f.seek(0L);
            ((di) this).field_f.seek(0L);
        }
        ((di) this).field_f.seek(0L);
    }

    final void a(boolean param0, long param1) throws IOException {
        ((di) this).field_f.seek(param1);
        if (param0) {
            field_e = -73;
            ((di) this).field_g = param1;
            return;
        }
        ((di) this).field_g = param1;
    }

    final long a(int param0) throws IOException {
        if (param0 != 16) {
            ((di) this).field_f = null;
            return ((di) this).field_f.length();
        }
        return ((di) this).field_f.length();
    }

    final static void c(int param0) {
        int[] var1 = null;
        int var2 = 0;
        int var3 = 0;
        int var4 = 0;
        int[] var5 = null;
        int[] var6 = null;
        int[] var7 = null;
        var4 = Transmogrify.field_A ? 1 : 0;
        var7 = ca.field_c;
        var6 = var7;
        var5 = var6;
        var1 = var5;
        var2 = 0;
        if (param0 != -11517) {
          di.d(-51);
          var3 = var7.length;
          L0: while (true) {
            if (var3 <= var2) {
              return;
            } else {
              var2++;
              var5[var2] = 0;
              var2++;
              var5[var2] = 0;
              var2++;
              var5[var2] = 0;
              var2++;
              var5[var2] = 0;
              var2++;
              var5[var2] = 0;
              var2++;
              var5[var2] = 0;
              var2++;
              var5[var2] = 0;
              var2++;
              var5[var2] = 0;
              continue L0;
            }
          }
        } else {
          var3 = var7.length;
          L1: while (true) {
            if (var3 <= var2) {
              return;
            } else {
              var2++;
              var5[var2] = 0;
              var2++;
              var5[var2] = 0;
              var2++;
              var5[var2] = 0;
              var2++;
              var5[var2] = 0;
              var2++;
              var5[var2] = 0;
              var2++;
              var5[var2] = 0;
              var2++;
              var5[var2] = 0;
              var2++;
              var5[var2] = 0;
              continue L1;
            }
          }
        }
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_b = false;
        field_a = "Passwords must be between 5 and 20 letters and numbers";
    }
}
