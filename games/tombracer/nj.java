/*
 * Decompiled by CFR-JS 0.4.0.
 */
import java.io.*;

final class nj extends wda {
    static lqa field_t;
    static iw field_r;
    static String field_q;
    private wda[] field_u;
    private int field_s;
    static oc[] field_p;
    static String field_o;
    static cn field_v;

    final void b(byte param0) {
        int var2 = 0;
        L0: {
          if (((nj) this).field_u.length == -1) {
            break L0;
          } else {
            if (null != ((nj) this).field_u) {
              L1: {
                if (-1 <= ((nj) this).field_s) {
                  break L1;
                } else {
                  ((nj) this).field_s = 0;
                  break L1;
                }
              }
              L2: {
                if (((nj) this).field_u.length <= ((nj) this).field_s) {
                  ((nj) this).field_s = ((nj) this).field_u.length - 1;
                  break L2;
                } else {
                  break L2;
                }
              }
              ((nj) this).field_u[((nj) this).field_s].b((byte) 71);
              var2 = 52 / ((param0 - -69) / 42);
              return;
            } else {
              break L0;
            }
          }
        }
        ((nj) this).field_j = true;
    }

    private final void e(int param0) {
        ((nj) this).field_s = ((nj) this).field_s + 1;
        if (((nj) this).field_s >= ((nj) this).field_u.length) {
            ((nj) this).field_s = 0;
        }
    }

    final void b(int param0) {
        if (param0 != 1) {
            Object var3 = null;
            ((nj) this).a(32, (fsa) null);
        }
    }

    final void a(boolean param0, byte param1, ui param2, ui param3) {
        int var5_int = 0;
        RuntimeException var5 = null;
        int var6 = 0;
        RuntimeException stackIn_9_0 = null;
        StringBuilder stackIn_9_1 = null;
        RuntimeException stackIn_10_0 = null;
        StringBuilder stackIn_10_1 = null;
        RuntimeException stackIn_11_0 = null;
        StringBuilder stackIn_11_1 = null;
        String stackIn_11_2 = null;
        RuntimeException stackIn_12_0 = null;
        StringBuilder stackIn_12_1 = null;
        RuntimeException stackIn_13_0 = null;
        StringBuilder stackIn_13_1 = null;
        RuntimeException stackIn_14_0 = null;
        StringBuilder stackIn_14_1 = null;
        String stackIn_14_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException stackOut_8_0 = null;
        StringBuilder stackOut_8_1 = null;
        RuntimeException stackOut_10_0 = null;
        StringBuilder stackOut_10_1 = null;
        String stackOut_10_2 = null;
        RuntimeException stackOut_9_0 = null;
        StringBuilder stackOut_9_1 = null;
        String stackOut_9_2 = null;
        RuntimeException stackOut_11_0 = null;
        StringBuilder stackOut_11_1 = null;
        RuntimeException stackOut_13_0 = null;
        StringBuilder stackOut_13_1 = null;
        String stackOut_13_2 = null;
        RuntimeException stackOut_12_0 = null;
        StringBuilder stackOut_12_1 = null;
        String stackOut_12_2 = null;
        var6 = TombRacer.field_G ? 1 : 0;
        try {
          L0: {
            super.a(param0, (byte) -125, param2, param3);
            if (param1 < -106) {
              L1: {
                if (((nj) this).field_u == null) {
                  break L1;
                } else {
                  var5_int = 0;
                  L2: while (true) {
                    if (((nj) this).field_u.length <= var5_int) {
                      break L1;
                    } else {
                      ((nj) this).field_u[var5_int].a(param0, (byte) -122, param2, param3);
                      var5_int++;
                      continue L2;
                    }
                  }
                }
              }
              break L0;
            } else {
              return;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L3: {
            var5 = decompiledCaughtException;
            stackOut_8_0 = (RuntimeException) var5;
            stackOut_8_1 = new StringBuilder().append("nj.G(").append(param0).append(44).append(param1).append(44);
            stackIn_10_0 = stackOut_8_0;
            stackIn_10_1 = stackOut_8_1;
            stackIn_9_0 = stackOut_8_0;
            stackIn_9_1 = stackOut_8_1;
            if (param2 == null) {
              stackOut_10_0 = (RuntimeException) (Object) stackIn_10_0;
              stackOut_10_1 = (StringBuilder) (Object) stackIn_10_1;
              stackOut_10_2 = "null";
              stackIn_11_0 = stackOut_10_0;
              stackIn_11_1 = stackOut_10_1;
              stackIn_11_2 = stackOut_10_2;
              break L3;
            } else {
              stackOut_9_0 = (RuntimeException) (Object) stackIn_9_0;
              stackOut_9_1 = (StringBuilder) (Object) stackIn_9_1;
              stackOut_9_2 = "{...}";
              stackIn_11_0 = stackOut_9_0;
              stackIn_11_1 = stackOut_9_1;
              stackIn_11_2 = stackOut_9_2;
              break L3;
            }
          }
          L4: {
            stackOut_11_0 = (RuntimeException) (Object) stackIn_11_0;
            stackOut_11_1 = ((StringBuilder) (Object) stackIn_11_1).append(stackIn_11_2).append(44);
            stackIn_13_0 = stackOut_11_0;
            stackIn_13_1 = stackOut_11_1;
            stackIn_12_0 = stackOut_11_0;
            stackIn_12_1 = stackOut_11_1;
            if (param3 == null) {
              stackOut_13_0 = (RuntimeException) (Object) stackIn_13_0;
              stackOut_13_1 = (StringBuilder) (Object) stackIn_13_1;
              stackOut_13_2 = "null";
              stackIn_14_0 = stackOut_13_0;
              stackIn_14_1 = stackOut_13_1;
              stackIn_14_2 = stackOut_13_2;
              break L4;
            } else {
              stackOut_12_0 = (RuntimeException) (Object) stackIn_12_0;
              stackOut_12_1 = (StringBuilder) (Object) stackIn_12_1;
              stackOut_12_2 = "{...}";
              stackIn_14_0 = stackOut_12_0;
              stackIn_14_1 = stackOut_12_1;
              stackIn_14_2 = stackOut_12_2;
              break L4;
            }
          }
          throw tba.a((Throwable) (Object) stackIn_14_0, stackIn_14_2 + 41);
        }
    }

    nj(la param0, kh param1, boolean param2) {
        super(param0, param1, param2);
        int var4_int = 0;
        int var5 = 0;
        wda var6 = null;
        try {
            var4_int = param1.b((byte) 44, 2);
            ((nj) this).field_u = new wda[var4_int];
            for (var5 = 0; var4_int > var5; var5++) {
                var6 = ki.a(param1, (byte) -118, param0, param2);
                ((nj) this).field_u[var5] = var6;
            }
            ((nj) this).field_s = param1.b((byte) 44, 2);
        } catch (RuntimeException runtimeException) {
            throw tba.a((Throwable) (Object) runtimeException, "nj.<init>(" + (param0 != null ? "{...}" : "null") + 44 + (param1 != null ? "{...}" : "null") + 44 + param2 + 41);
        }
    }

    public final void m(int param0) {
        if (!(!((nj) this).field_i)) {
            return;
        }
        this.e(-114);
        int var2 = 94 % ((28 - param0) / 49);
    }

    final int a(int param0, int param1) {
        param1 = fs.a((byte) 63, param1, ((nj) this).field_s);
        if (param0 != 0) {
            ((nj) this).field_u = null;
        }
        return param1;
    }

    public static void e() {
        field_v = null;
        field_q = null;
        field_p = null;
        field_o = null;
        field_r = null;
        field_t = null;
    }

    final void c(byte param0) {
        int var3 = 0;
        wda var4 = null;
        int var5 = TombRacer.field_G ? 1 : 0;
        super.c((byte) -121);
        if (param0 >= -116) {
            field_r = null;
        }
        wda[] var6 = ((nj) this).field_u;
        wda[] var2 = var6;
        for (var3 = 0; var6.length > var3; var3++) {
            var4 = var6[var3];
            var4.c((byte) -124);
        }
    }

    final void a(kh param0, byte param1) {
        int var3_int = 0;
        int var4 = TombRacer.field_G ? 1 : 0;
        try {
            super.a(param0, (byte) -128);
            param0.a((byte) 7, ((nj) this).field_u.length, 2);
            if (param1 > -78) {
                ((nj) this).b(-101);
            }
            for (var3_int = 0; var3_int < ((nj) this).field_u.length; var3_int++) {
                ((nj) this).field_u[var3_int].a(param0, (byte) -117);
            }
            param0.a((byte) -128, ((nj) this).field_s, 2);
        } catch (RuntimeException runtimeException) {
            throw tba.a((Throwable) (Object) runtimeException, "nj.R(" + (param0 != null ? "{...}" : "null") + 44 + param1 + 41);
        }
    }

    final int c(int param0) {
        if (param0 != 1) {
            field_q = null;
        }
        return 2;
    }

    final static void a(byte[] param0, int param1, int param2, File param3) throws IOException {
        DataInputStream var4 = null;
        try {
            var4 = new DataInputStream((InputStream) (Object) new BufferedInputStream((InputStream) (Object) new FileInputStream(param3)));
            {
                var4.readFully(param0, 0, param2);
            }
            var4.close();
            int var5 = 1;
        } catch (RuntimeException runtimeException) {
            throw tba.a((Throwable) (Object) runtimeException, "nj.N(" + (param0 != null ? "{...}" : "null") + 44 + 107 + 44 + param2 + 44 + (param3 != null ? "{...}" : "null") + 41);
        }
    }

    final void a(int param0, fsa param1) {
        wda[] var3 = null;
        RuntimeException var3_ref = null;
        int var4 = 0;
        wda var5 = null;
        int var6 = 0;
        wda[] var7 = null;
        RuntimeException stackIn_8_0 = null;
        StringBuilder stackIn_8_1 = null;
        RuntimeException stackIn_9_0 = null;
        StringBuilder stackIn_9_1 = null;
        RuntimeException stackIn_10_0 = null;
        StringBuilder stackIn_10_1 = null;
        String stackIn_10_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException stackOut_7_0 = null;
        StringBuilder stackOut_7_1 = null;
        RuntimeException stackOut_9_0 = null;
        StringBuilder stackOut_9_1 = null;
        String stackOut_9_2 = null;
        RuntimeException stackOut_8_0 = null;
        StringBuilder stackOut_8_1 = null;
        String stackOut_8_2 = null;
        var6 = TombRacer.field_G ? 1 : 0;
        try {
          L0: {
            super.a(110, param1);
            var7 = ((nj) this).field_u;
            var3 = var7;
            var4 = 0;
            L1: while (true) {
              if (var4 >= var7.length) {
                L2: {
                  if (param0 > 35) {
                    break L2;
                  } else {
                    ((nj) this).b((byte) -51);
                    break L2;
                  }
                }
                break L0;
              } else {
                var5 = var7[var4];
                var5.a(36, param1);
                var4++;
                continue L1;
              }
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L3: {
            var3_ref = decompiledCaughtException;
            stackOut_7_0 = (RuntimeException) var3_ref;
            stackOut_7_1 = new StringBuilder().append("nj.F(").append(param0).append(44);
            stackIn_9_0 = stackOut_7_0;
            stackIn_9_1 = stackOut_7_1;
            stackIn_8_0 = stackOut_7_0;
            stackIn_8_1 = stackOut_7_1;
            if (param1 == null) {
              stackOut_9_0 = (RuntimeException) (Object) stackIn_9_0;
              stackOut_9_1 = (StringBuilder) (Object) stackIn_9_1;
              stackOut_9_2 = "null";
              stackIn_10_0 = stackOut_9_0;
              stackIn_10_1 = stackOut_9_1;
              stackIn_10_2 = stackOut_9_2;
              break L3;
            } else {
              stackOut_8_0 = (RuntimeException) (Object) stackIn_8_0;
              stackOut_8_1 = (StringBuilder) (Object) stackIn_8_1;
              stackOut_8_2 = "{...}";
              stackIn_10_0 = stackOut_8_0;
              stackIn_10_1 = stackOut_8_1;
              stackIn_10_2 = stackOut_8_2;
              break L3;
            }
          }
          throw tba.a((Throwable) (Object) stackIn_10_0, stackIn_10_2 + 41);
        }
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_q = "Quit to website";
        field_r = new iw();
        field_o = "Rating";
    }
}
