/*
 * Decompiled by CFR-JS 0.4.0.
 */
import java.io.*;
import java.util.*;

abstract class qda {
    vj field_e;
    static String field_l;
    vj field_m;
    static String field_f;
    static int field_i;
    static String field_b;
    vj field_c;
    vj field_k;
    long field_j;
    uia field_o;
    int field_p;
    uia field_h;
    volatile int field_n;
    volatile int field_a;
    byte field_d;
    qqa field_g;

    public static void c(byte param0) {
        if (param0 != 0) {
          field_l = (String) null;
        }
        field_b = null;
        field_l = null;
        field_f = null;
    }

    final boolean d(int param0) {
        if (param0 != -21) {
          this.b(-15);
        }
        return this.f(-3) >= 20 ? true : false;
    }

    final int f(int param0) {
        if (param0 != -3) {
          qda.b((byte) 52);
        }
        return this.field_e.a((byte) -56) + this.field_m.a((byte) -92);
    }

    final static void a(int param0, int param1) {
        int var3 = 0;
        toa var4 = null;
        ik var5 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var2 = null;
        var3 = TombRacer.field_G ? 1 : 0;
        try {
          if (param1 != -21) {
            return;
          }
          var4 = (toa) (vsa.field_m.f(-80));
          while (var4 != null) {
            uca.a(param0, var4, (byte) 93);
            var4 = (toa) (vsa.field_m.e(113));
          }
          var5 = (ik) (hca.field_I.f(param1 ^ 91));
          while (var5 != null) {
            fna.a(param0, -23814, var5);
            var5 = (ik) (hca.field_I.e(121));
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2 = decompiledCaughtException;
          throw tba.a((Throwable) ((Object) var2), "qda.B(" + param0 + ',' + param1 + ')');
        }
    }

    final static int b(byte param0) {
        try {
          int stackIn_16_0 = 0;
          int stackIn_26_0 = 0;
          int stackIn_31_0 = 0;
          int stackIn_34_0 = 0;
          int stackIn_36_0 = 0;
          Throwable decompiledCaughtException = null;
          int var1_int = 0;
          IOException var1 = null;
          uia var2 = null;
          if (4 <= wg.field_l.field_a) {
            if (wg.field_l.field_n == -1) {
              return 3;
            }
            if (wg.field_l.field_n != -2) {
              return 1;
            }
            return 4;
          }
          if (param0 != -66) {
            return -114;
          }
          try {
            if (cma.field_m == 0) {
              bga.field_c = oi.field_a.a(-24818, pca.field_a, du.field_d);
              cma.field_m = cma.field_m + 1;
            }
            if (cma.field_m == 1) {
              if (2 == bga.field_c.field_b) {
                stackIn_16_0 = du.a(-1, (byte) 122);
                return stackIn_16_0;
              }
              if (bga.field_c.field_b == 1) {
                cma.field_m = cma.field_m + 1;
              }
            }
            if (cma.field_m == 2) {
              jia.field_a = new jqa((java.net.Socket) (bga.field_c.field_f), oi.field_a);
              var2 = new uia(13);
              ea.a((byte) 107, pu.field_b, var2, wk.field_n, joa.field_a);
              var2.i(15, 0);
              var2.a(wea.field_a, (byte) 117);
              jia.field_a.a(var2.field_g, 0, 13, 106);
              cma.field_m = cma.field_m + 1;
              pm.field_n = 30000L + bva.b((byte) -107);
            }
            if (cma.field_m == 3) {
              if (jia.field_a.c(0) <= 0) {
                if (bva.b((byte) -107) > pm.field_n) {
                  stackIn_31_0 = du.a(-2, (byte) 17);
                  return stackIn_31_0;
                }
              } else {
                var1_int = jia.field_a.d(-2147483648);
                if (var1_int != 0) {
                  stackIn_26_0 = du.a(var1_int, (byte) -26);
                  return stackIn_26_0;
                }
                cma.field_m = cma.field_m + 1;
              }
            }
            if (4 != cma.field_m) {
              stackIn_36_0 = -1;
              return stackIn_36_0;
            }
            wg.field_l.a(jia.field_a, (byte) 54, vga.field_q);
            cma.field_m = 0;
            jia.field_a = null;
            bga.field_c = null;
            stackIn_34_0 = 0;
            return stackIn_34_0;
          } catch (java.io.IOException decompiledCaughtParameter0) {
            decompiledCaughtException = decompiledCaughtParameter0;
            var1 = (IOException) (Object) decompiledCaughtException;
            return du.a(-3, (byte) -93);
          }
        } catch (RuntimeException | Error decompiledUncheckedException) {
          throw decompiledUncheckedException;
        } catch (Throwable decompiledCheckedException) {
          throw new RuntimeException(decompiledCheckedException);
        }
    }

    abstract void a(int param0);

    abstract void e(int param0);

    abstract boolean c(int param0);

    abstract void a(Object param0, byte param1, boolean param2);

    final boolean b(int param0) {
        if (param0 != -21) {
          this.field_o = (uia) null;
        }
        return this.a((byte) 78) >= 20 ? true : false;
    }

    final static int a(BitSet param0, int param1) {
        int var3 = 0;
        int var2_int = 0;
        int var4 = 0;
        int stackIn_11_0 = 0;
        RuntimeException stackIn_14_0 = null;
        StringBuilder stackIn_14_1 = null;
        String stackIn_15_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var2 = null;
        var4 = TombRacer.field_G ? 1 : 0;
        try {
          var2_int = 0;
          if (param1 < 80) {
            field_i = 11;
          }
          for (var3 = 0; var3 < param0.size(); var3++) {
            if (param0.get(var3)) {
              var2_int++;
            }
          }
          stackIn_11_0 = var2_int;
          return stackIn_11_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2 = decompiledCaughtException;
          stackIn_14_0 = var2;
          stackIn_14_1 = new StringBuilder().append("qda.F(");
          if (param0 == null) {
            stackIn_15_2 = "null";
          } else {
            stackIn_15_2 = "{...}";
          }
          throw tba.a((Throwable) ((Object) stackIn_14_0), ((StringBuilder) (Object) stackIn_14_1).append(stackIn_15_2).append(',').append(param1).append(')').toString());
        }
    }

    final int a(byte param0) {
        if (param0 != 78) {
          this.field_k = (vj) null;
        }
        return this.field_c.a((byte) -77) + this.field_k.a((byte) -43);
    }

    final qqa a(int param0, boolean param1, int param2, int param3, byte param4) {
        long var6 = ((long)param2 << 32) + (long)param0;
        qqa var8 = new qqa();
        var8.field_j = var6;
        if (param3 != -21) {
          return (qqa) null;
        }
        var8.field_l = param1 ? true : false;
        var8.field_q = param4;
        if (param1) {
          if (!(this.f(param3 ^ 22) < 20)) {
            throw new RuntimeException();
          }
          this.field_e.a(var8, (byte) -78);
        } else {
          if (!(this.a((byte) 78) < 20)) {
            throw new RuntimeException();
          }
          this.field_c.a(var8, (byte) -96);
        }
        return var8;
    }

    final static boolean a(byte param0, String param1) {
        int var2_int = 0;
        RuntimeException var2 = null;
        int var3 = 0;
        int var4 = 0;
        RuntimeException stackIn_14_0 = null;
        StringBuilder stackIn_14_1 = null;
        String stackIn_15_2 = null;
        RuntimeException decompiledCaughtException = null;
        var4 = TombRacer.field_G ? 1 : 0;
        try {
          if (param0 != -72) {
            field_l = (String) null;
          }
          for (var2_int = 0; param1.length() > var2_int; var2_int++) {
            var3 = param1.charAt(var2_int);
            if (!dja.a((byte) -20, (char) var3) &&
              !dp.a(param0 + 190, (char) var3)) {
              return true;
            }
          }
          return false;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2 = decompiledCaughtException;
          stackIn_14_0 = var2;
          stackIn_14_1 = new StringBuilder().append("qda.K(").append(param0).append(',');
          if (param1 == null) {
            stackIn_15_2 = "null";
          } else {
            stackIn_15_2 = "{...}";
          }
          throw tba.a((Throwable) ((Object) stackIn_14_0), ((StringBuilder) (Object) stackIn_14_1).append(stackIn_15_2).append(')').toString());
        }
    }

    qda() {
        this.field_e = new vj();
        this.field_m = new vj();
        this.field_c = new vj();
        this.field_k = new vj();
        this.field_o = new uia(6);
        this.field_a = 0;
        this.field_n = 0;
        this.field_d = (byte) 0;
        this.field_h = new uia(10);
    }

    static {
        field_f = "Unfortunately we are unable to create an account for you at this time.";
        field_l = "Try changing the following settings:  ";
    }
}
