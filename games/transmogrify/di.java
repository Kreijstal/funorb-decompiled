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
        try {
            if (!((this.field_g + (long)param2 ^ -1L) >= (this.field_c ^ -1L))) {
                this.field_f.seek(this.field_c);
                this.field_f.write(1);
                throw new EOFException();
            }
            if (param0 < 60) {
                field_e = 104;
            }
            this.field_f.write(param1, param3, param2);
            this.field_g = this.field_g + (long)param2;
        } catch (RuntimeException runtimeException) {
            throw ch.a((Throwable) ((Object) runtimeException), "di.A(" + param0 + ',' + (param1 != null ? "{...}" : "null") + ',' + param2 + ',' + param3 + ')');
        }
    }

    final static char a(int param0, byte param1) {
        int var2;
        int var3;
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
        if (this.field_f == null) {
          if (param0) {
            di.c(86);
            return;
          } else {
            return;
          }
        } else {
          this.field_f.close();
          this.field_f = null;
          if (!param0) {
            return;
          } else {
            di.c(86);
            return;
          }
        }
    }

    final int a(byte[] param0, boolean param1, int param2, int param3) throws IOException {
        int var5_int = 0;
        RuntimeException var5 = null;
        int stackIn_5_0 = 0;
        int stackIn_7_0 = 0;
        RuntimeException stackIn_10_0 = null;
        StringBuilder stackIn_10_1 = null;
        RuntimeException stackIn_11_0 = null;
        StringBuilder stackIn_11_1 = null;
        String stackIn_11_2 = null;
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        try {
          L0: {
            L1: {
              var5_int = this.field_f.read(param0, param3, param2);
              if ((var5_int ^ -1) < -1) {
                this.field_g = this.field_g + (long)var5_int;
                break L1;
              } else {
                break L1;
              }
            }
            if (param1) {
              stackIn_7_0 = var5_int;
              decompiledRegionSelector0 = 1;
              break L0;
            } else {
              stackIn_5_0 = 34;
              decompiledRegionSelector0 = 0;
              break L0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L2: {
            var5 = decompiledCaughtException;
            stackIn_10_0 = (RuntimeException) (var5);

            stackIn_10_1 = new StringBuilder().append("di.I(");

            if (param0 == null) {
              stackIn_11_0 = (RuntimeException) ((Object) stackIn_10_0);
              stackIn_11_1 = (StringBuilder) ((Object) stackIn_10_1);
              stackIn_11_2 = "null";
              break L2;
            } else {
              stackIn_11_0 = (RuntimeException) ((Object) stackIn_10_0);
              stackIn_11_1 = (StringBuilder) ((Object) stackIn_10_1);
              stackIn_11_2 = "{...}";
              break L2;
            }
          }
          throw ch.a((Throwable) ((Object) stackIn_11_0), stackIn_11_2 + ',' + param1 + ',' + param2 + ',' + param3 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return stackIn_5_0;
        } else {
          return stackIn_7_0;
        }
    }

    protected final void finalize() throws Throwable {
        if (!(this.field_f == null)) {
            System.out.println("");
            this.a(false);
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
        int var1;
        int var2;
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
              tg.field_c = ij.a(uh.field_d, new String[]{Integer.toString(var1)}, (byte) -78);
              tg.field_c = wk.a(73, new CharSequence[]{(CharSequence) ((Object) tg.field_c), (CharSequence) ((Object) "<br>"), (CharSequence) ((Object) vi.field_b)});
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
              tg.field_c = wk.a(73, new CharSequence[]{(CharSequence) ((Object) tg.field_c), (CharSequence) ((Object) "<br>"), (CharSequence) ((Object) vi.field_b)});
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
        int var5_int = 0;
        try {
            if (param2 == -1L) {
                param2 = 9223372036854775807L;
            }
            if ((param2 ^ -1L) > (param0.length() ^ -1L)) {
                param0.delete();
            }
            this.field_f = new RandomAccessFile(param0, param1);
            this.field_g = 0L;
            this.field_c = param2;
            var5_int = this.field_f.read();
            if (var5_int != -1 && !param1.equals("r")) {
                this.field_f.seek(0L);
                this.field_f.write(var5_int);
            }
            this.field_f.seek(0L);
        } catch (RuntimeException runtimeException) {
            throw ch.a((Throwable) ((Object) runtimeException), "di.<init>(" + (param0 != null ? "{...}" : "null") + ',' + (param1 != null ? "{...}" : "null") + ',' + param2 + ')');
        }
    }

    final void a(boolean param0, long param1) throws IOException {
        this.field_f.seek(param1);
        if (param0) {
            field_e = -73;
            this.field_g = param1;
            return;
        }
        this.field_g = param1;
    }

    final long a(int param0) throws IOException {
        if (param0 != 16) {
            this.field_f = (RandomAccessFile) null;
            return this.field_f.length();
        }
        return this.field_f.length();
    }

    final static void c(int param0) {
        int incrementValue$16 = 0;
        int incrementValue$17 = 0;
        int incrementValue$18 = 0;
        int incrementValue$19 = 0;
        int incrementValue$20 = 0;
        int incrementValue$21 = 0;
        int incrementValue$22 = 0;
        int incrementValue$23 = 0;
        int[] var1 = null;
        int var2 = 0;
        int var3 = 0;
        int var4 = 0;
        int[] var5 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var1_ref = null;
        var4 = Transmogrify.field_A ? 1 : 0;
        try {
          L0: {
            L1: {
              var5 = ca.field_c;
              var1 = var5;
              var2 = 0;
              if (param0 == -11517) {
                break L1;
              } else {
                di.d(-51);
                break L1;
              }
            }
            var3 = var5.length;
            L2: while (true) {
              if (var3 <= var2) {
                break L0;
              } else {
                incrementValue$16 = var2;
                var2++;
                var5[incrementValue$16] = 0;
                incrementValue$17 = var2;
                var2++;
                var5[incrementValue$17] = 0;
                incrementValue$18 = var2;
                var2++;
                var5[incrementValue$18] = 0;
                incrementValue$19 = var2;
                var2++;
                var5[incrementValue$19] = 0;
                incrementValue$20 = var2;
                var2++;
                var5[incrementValue$20] = 0;
                incrementValue$21 = var2;
                var2++;
                var5[incrementValue$21] = 0;
                incrementValue$22 = var2;
                var2++;
                var5[incrementValue$22] = 0;
                incrementValue$23 = var2;
                var2++;
                var5[incrementValue$23] = 0;
                continue L2;
              }
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var1_ref = decompiledCaughtException;
          throw ch.a((Throwable) ((Object) var1_ref), "di.B(" + param0 + ')');
        }
    }

    static {
        field_b = false;
        field_a = "Passwords must be between 5 and 20 letters and numbers";
    }
}
