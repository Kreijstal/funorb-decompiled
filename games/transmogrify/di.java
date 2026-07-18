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
            if (!(~(((di) this).field_g + (long)param2) >= ~((di) this).field_c)) {
                ((di) this).field_f.seek(((di) this).field_c);
                ((di) this).field_f.write(1);
                throw new EOFException();
            }
            if (param0 < 60) {
                field_e = 104;
            }
            ((di) this).field_f.write(param1, param3, param2);
            ((di) this).field_g = ((di) this).field_g + (long)param2;
        } catch (RuntimeException runtimeException) {
            throw ch.a((Throwable) (Object) runtimeException, "di.A(" + param0 + ',' + (param1 != null ? "{...}" : "null") + ',' + param2 + ',' + param3 + ')');
        }
    }

    final static char a(int param0, byte param1) {
        int var2 = 0;
        int var3 = 0;
        var2 = param1 & 255;
        if (var2 == 0) {
          throw new IllegalArgumentException("" + Integer.toString(var2, 16));
        } else {
          if (var2 >= 128) {
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
        int var5_int = 0;
        RuntimeException var5 = null;
        int stackIn_5_0 = 0;
        int stackIn_7_0 = 0;
        RuntimeException stackIn_9_0 = null;
        StringBuilder stackIn_9_1 = null;
        RuntimeException stackIn_10_0 = null;
        StringBuilder stackIn_10_1 = null;
        RuntimeException stackIn_11_0 = null;
        StringBuilder stackIn_11_1 = null;
        String stackIn_11_2 = null;
        RuntimeException decompiledCaughtException = null;
        int stackOut_6_0 = 0;
        int stackOut_4_0 = 0;
        RuntimeException stackOut_8_0 = null;
        StringBuilder stackOut_8_1 = null;
        RuntimeException stackOut_10_0 = null;
        StringBuilder stackOut_10_1 = null;
        String stackOut_10_2 = null;
        RuntimeException stackOut_9_0 = null;
        StringBuilder stackOut_9_1 = null;
        String stackOut_9_2 = null;
        try {
          L0: {
            L1: {
              var5_int = ((di) this).field_f.read(param0, param3, param2);
              if (var5_int > 0) {
                ((di) this).field_g = ((di) this).field_g + (long)var5_int;
                break L1;
              } else {
                break L1;
              }
            }
            if (param1) {
              stackOut_6_0 = var5_int;
              stackIn_7_0 = stackOut_6_0;
              break L0;
            } else {
              stackOut_4_0 = 34;
              stackIn_5_0 = stackOut_4_0;
              return stackIn_5_0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L2: {
            var5 = decompiledCaughtException;
            stackOut_8_0 = (RuntimeException) var5;
            stackOut_8_1 = new StringBuilder().append("di.I(");
            stackIn_10_0 = stackOut_8_0;
            stackIn_10_1 = stackOut_8_1;
            stackIn_9_0 = stackOut_8_0;
            stackIn_9_1 = stackOut_8_1;
            if (param0 == null) {
              stackOut_10_0 = (RuntimeException) (Object) stackIn_10_0;
              stackOut_10_1 = (StringBuilder) (Object) stackIn_10_1;
              stackOut_10_2 = "null";
              stackIn_11_0 = stackOut_10_0;
              stackIn_11_1 = stackOut_10_1;
              stackIn_11_2 = stackOut_10_2;
              break L2;
            } else {
              stackOut_9_0 = (RuntimeException) (Object) stackIn_9_0;
              stackOut_9_1 = (StringBuilder) (Object) stackIn_9_1;
              stackOut_9_2 = "{...}";
              stackIn_11_0 = stackOut_9_0;
              stackIn_11_1 = stackOut_9_1;
              stackIn_11_2 = stackOut_9_2;
              break L2;
            }
          }
          throw ch.a((Throwable) (Object) stackIn_11_0, stackIn_11_2 + ',' + param1 + ',' + param2 + ',' + param3 + ')');
        }
        return stackIn_7_0;
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
            if (var1 != 1) {
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
        int var5_int = 0;
        try {
            if (param2 == -1L) {
                param2 = 9223372036854775807L;
            }
            if (~param2 > ~param0.length()) {
                boolean discarded$0 = param0.delete();
            }
            ((di) this).field_f = new RandomAccessFile(param0, param1);
            ((di) this).field_g = 0L;
            ((di) this).field_c = param2;
            var5_int = ((di) this).field_f.read();
            if (var5_int != -1) {
                if (!param1.equals((Object) (Object) "r")) {
                    ((di) this).field_f.seek(0L);
                    ((di) this).field_f.write(var5_int);
                }
            }
            ((di) this).field_f.seek(0L);
        } catch (RuntimeException runtimeException) {
            throw ch.a((Throwable) (Object) runtimeException, "di.<init>(" + (param0 != null ? "{...}" : "null") + ',' + (param1 != null ? "{...}" : "null") + ',' + param2 + ')');
        }
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
        RuntimeException var1_ref = null;
        int var2 = 0;
        int var3 = 0;
        int var4 = 0;
        int[] var5 = null;
        RuntimeException decompiledCaughtException = null;
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
                int incrementValue$40 = var2;
                var2++;
                var5[incrementValue$40] = 0;
                int incrementValue$41 = var2;
                var2++;
                var5[incrementValue$41] = 0;
                int incrementValue$42 = var2;
                var2++;
                var5[incrementValue$42] = 0;
                int incrementValue$43 = var2;
                var2++;
                var5[incrementValue$43] = 0;
                int incrementValue$44 = var2;
                var2++;
                var5[incrementValue$44] = 0;
                int incrementValue$45 = var2;
                var2++;
                var5[incrementValue$45] = 0;
                int incrementValue$46 = var2;
                var2++;
                var5[incrementValue$46] = 0;
                int incrementValue$47 = var2;
                var2++;
                var5[incrementValue$47] = 0;
                continue L2;
              }
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var1_ref = decompiledCaughtException;
          throw ch.a((Throwable) (Object) var1_ref, "di.B(" + param0 + ')');
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
