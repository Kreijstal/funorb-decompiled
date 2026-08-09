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
        if (this.field_u.length == 0 || null == this.field_u) {
            this.field_j = true;
            return;
        }
        if (-1 < (this.field_s ^ -1)) {
            this.field_s = 0;
        }
        if (!(this.field_u.length > this.field_s)) {
            this.field_s = this.field_u.length - 1;
        }
        this.field_u[this.field_s].b((byte) 71);
        int var2 = 52 / ((param0 - -69) / 42);
    }

    private final void e(int param0) {
        this.field_s = this.field_s + 1;
        if (param0 > -15) {
            return;
        }
        if (this.field_s >= this.field_u.length) {
            this.field_s = 0;
        }
    }

    final void b(int param0) {
        if (param0 != 1) {
            fsa var3 = (fsa) null;
            this.a(32, (fsa) null);
        }
    }

    final void a(boolean param0, byte param1, ui param2, ui param3) {
        int var5_int = 0;
        int var6 = TombRacer.field_G ? 1 : 0;
        super.a(param0, (byte) -125, param2, param3);
        if (param1 >= -106) {
            return;
        }
        try {
            if (this.field_u != null) {
                for (var5_int = 0; this.field_u.length > var5_int; var5_int++) {
                    this.field_u[var5_int].a(param0, (byte) -122, param2, param3);
                }
            }
        } catch (RuntimeException runtimeException) {
            throw tba.a((Throwable) ((Object) runtimeException), "nj.G(" + param0 + ',' + param1 + ',' + (param2 != null ? "{...}" : "null") + ',' + (param3 != null ? "{...}" : "null") + ')');
        }
    }

    nj(la param0, kh param1, boolean param2) {
        super(param0, param1, param2);
        int var4_int = 0;
        int var5 = 0;
        wda var6 = null;
        try {
            var4_int = param1.b((byte) 44, 2);
            this.field_u = new wda[var4_int];
            for (var5 = 0; var4_int > var5; var5++) {
                var6 = ki.a(param1, (byte) -118, param0, param2);
                this.field_u[var5] = var6;
            }
            this.field_s = param1.b((byte) 44, 2);
        } catch (RuntimeException runtimeException) {
            throw tba.a((Throwable) ((Object) runtimeException), "nj.<init>(" + (param0 != null ? "{...}" : "null") + ',' + (param1 != null ? "{...}" : "null") + ',' + param2 + ')');
        }
    }

    public final void m(int param0) {
        if (!(!this.field_i)) {
            return;
        }
        this.e(-114);
        int var2 = 94 % ((28 - param0) / 49);
    }

    final int a(int param0, int param1) {
        param1 = fs.a((byte) 63, param1, this.field_s);
        if (param0 != 0) {
            this.field_u = (wda[]) null;
        }
        return param1;
    }

    public static void e(byte param0) {
        field_v = null;
        if (param0 >= -30) {
            field_r = (iw) null;
        }
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
            field_r = (iw) null;
        }
        wda[] var6 = this.field_u;
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
            param0.a((byte) 7, this.field_u.length, 2);
            if (param1 > -78) {
                this.b(-101);
            }
            for (var3_int = 0; var3_int < this.field_u.length; var3_int++) {
                this.field_u[var3_int].a(param0, (byte) -117);
            }
            param0.a((byte) -128, this.field_s, 2);
        } catch (RuntimeException runtimeException) {
            throw tba.a((Throwable) ((Object) runtimeException), "nj.R(" + (param0 != null ? "{...}" : "null") + ',' + param1 + ')');
        }
    }

    final int c(int param0) {
        if (param0 != 1) {
            field_q = (String) null;
        }
        return 2;
    }

    final static void a(byte[] param0, int param1, int param2, File param3) throws IOException {
        DataInputStream var4 = null;
        try {
            var4 = new DataInputStream((InputStream) ((Object) new BufferedInputStream((InputStream) ((Object) new FileInputStream(param3)))));
            try {
                var4.readFully(param0, 0, param2);
            } catch (EOFException eOFException) {
            }
            var4.close();
            int var5 = 59 % ((-16 - param1) / 50);
        } catch (RuntimeException runtimeException) {
            throw tba.a((Throwable) ((Object) runtimeException), "nj.N(" + (param0 != null ? "{...}" : "null") + ',' + param1 + ',' + param2 + ',' + (param3 != null ? "{...}" : "null") + ')');
        }
    }

    final void a(int param0, fsa param1) {
        wda[] var3 = null;
        int var4 = 0;
        wda var5 = null;
        int var6 = 0;
        wda[] var7 = null;
        RuntimeException stackIn_9_0 = null;
        StringBuilder stackIn_9_1 = null;
        RuntimeException stackIn_10_0 = null;
        StringBuilder stackIn_10_1 = null;
        String stackIn_10_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var3_ref = null;
        var6 = TombRacer.field_G ? 1 : 0;
        try {
          L0: {
            super.a(110, param1);
            var7 = this.field_u;
            var3 = var7;
            var4 = 0;
            L1: while (true) {
              if (var4 >= var7.length) {
                L2: {
                  if (param0 > 35) {
                    break L2;
                  } else {
                    this.b((byte) -51);
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
            stackIn_9_0 = (RuntimeException) (var3_ref);

            stackIn_9_1 = new StringBuilder().append("nj.F(").append(param0).append(',');

            if (param1 == null) {
              stackIn_10_0 = (RuntimeException) ((Object) stackIn_9_0);
              stackIn_10_1 = (StringBuilder) ((Object) stackIn_9_1);
              stackIn_10_2 = "null";
              break L3;
            } else {
              stackIn_10_0 = (RuntimeException) ((Object) stackIn_9_0);
              stackIn_10_1 = (StringBuilder) ((Object) stackIn_9_1);
              stackIn_10_2 = "{...}";
              break L3;
            }
          }
          throw tba.a((Throwable) ((Object) stackIn_10_0), stackIn_10_2 + ')');
        }
    }

    static {
        field_q = "Quit to website";
        field_r = new iw();
        field_o = "Rating";
    }
}
