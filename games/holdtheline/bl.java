/*
 * Decompiled by CFR-JS 0.4.0.
 */
import java.io.*;

final class bl extends tj {
    static sg field_r;
    ah field_q;
    static int[] field_n;
    static String field_o;
    static uf field_s;
    private kf field_m;
    fg field_p;

    private final void a(ck param0, int param1, int param2) {
        kf stackIn_8_0 = null;
        int stackIn_8_1 = 0;
        ck stackIn_8_2 = null;
        boolean stackIn_9_3;
        RuntimeException stackIn_20_0 = null;
        StringBuilder stackIn_20_1 = null;
        String stackIn_21_2 = null;
        RuntimeException decompiledCaughtException = null;
        int var4_int = 0;
        RuntimeException var4 = null;
        int var5 = 0;
        try {
          if (0 != (this.field_m.field_o[param0.field_p] & 4) &&
            param0.field_z < 0) {
            var4_int = this.field_m.field_t[param0.field_p] / lo.field_l;
            var5 = (1048575 - (-var4_int + param0.field_v)) / var4_int;
            param0.field_v = var4_int * param2 + param0.field_v & 1048575;
            if (var5 <= param2) {
              if (this.field_m.field_S[param0.field_p] == 0) {
                param0.field_t = db.b(param0.field_s, param0.field_t.l(), param0.field_t.j(), param0.field_t.k());
              } else {
                param0.field_t = db.b(param0.field_s, param0.field_t.l(), 0, param0.field_t.k());
                stackIn_8_0 = this.field_m;
                stackIn_8_1 = 2;
                stackIn_8_2 = (ck) (param0);
                stackIn_9_3 = !(param0.field_o.field_q[param0.field_u] >= 0);
                ((kf) (Object) stackIn_8_0).a(stackIn_8_1, stackIn_8_2, stackIn_9_3);
              }
              if (param0.field_o.field_q[param0.field_u] < 0) {
                param0.field_t.g(-1);
              }
              param2 = param0.field_v / var4_int;
            }
          }
          if (param1 > -71) {
            this.field_q = (ah) null;
          }
          param0.field_t.a(param2);
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var4 = decompiledCaughtException;
          stackIn_20_0 = var4;
          stackIn_20_1 = new StringBuilder().append("bl.D(");
          if (param0 == null) {
            stackIn_21_2 = "null";
          } else {
            stackIn_21_2 = "{...}";
          }
          throw kk.a((Throwable) ((Object) stackIn_20_0), ((StringBuilder) (Object) stackIn_20_1).append(stackIn_21_2).append(',').append(param1).append(',').append(param2).append(')').toString());
        }
    }

    final tj a() {
        ck var1 = (ck) (this.field_q.b((byte) 100));
        if (var1 == null) {
          return null;
        }
        if (var1.field_t != null) {
          return (tj) ((Object) var1.field_t);
        }
        return this.b();
    }

    final static void a(Throwable param0, byte param1, String param2) {
        try {
          ib stackIn_13_0;
          java.net.URL stackIn_13_1;
          java.net.URL stackIn_13_2;
          java.net.URL stackIn_13_3;
          StringBuilder stackIn_13_4;
          java.net.URL stackIn_14_1;
          java.net.URL stackIn_14_2;
          String stackIn_14_5;
          Throwable decompiledCaughtException = null;
          String var3 = null;
          Exception var3_ref = null;
          af var4 = null;
          DataInputStream var5_ref_DataInputStream = null;
          int var5 = 0;
          int var6 = 0;
          String var7 = null;
          String var8 = null;
          String var9 = null;
          String var10 = null;
          var6 = HoldTheLine.field_D;
          try {
            var3 = "";
            if (param0 != null) {
              var3 = ih.a(param0, -12895);
            }
            if (param2 != null) {
              if (param0 != null) {
                var3 = var3 + " | ";
              }
              var3 = var3 + param2;
            }
            cd.a(12, var3);
            var7 = vn.a("%3a", ":", -104, var3);
            var8 = vn.a("%40", "@", -102, var7);
            var9 = vn.a("%26", "&", -102, var8);
            var10 = vn.a("%23", "#", -67, var9);
            if (null == rd.field_d) {
              return;
            }
            stackIn_13_0 = te.field_d;
            stackIn_13_1 = null;
            stackIn_13_2 = null;
            stackIn_13_3 = rd.field_d.getCodeBase();
            stackIn_13_4 = new StringBuilder().append("clienterror.ws?c=").append(im.field_a).append("&u=");
            if (null != am.field_f) {
              stackIn_14_1 = null;
              stackIn_14_2 = null;
              stackIn_14_5 = am.field_f;
            } else {
              stackIn_14_1 = null;
              stackIn_14_2 = null;
              stackIn_14_5 = "" + ul.field_e;
            }
            var4 = ((ib) (Object) stackIn_13_0).a(new java.net.URL(stackIn_13_3, ((StringBuilder) (Object) stackIn_13_4).append(stackIn_14_5).append("&v1=").append(ib.field_p).append("&v2=").append(ib.field_j).append("&e=").append(var10).toString()), 0);
            while (var4.field_d == 0) {
              qe.a(1L, (byte) 45);
            }
            if (var4.field_d == 1) {
              var5_ref_DataInputStream = (DataInputStream) (var4.field_b);
              var5_ref_DataInputStream.read();
              var5_ref_DataInputStream.close();
            }
            var5 = 44 % ((17 - param1) / 37);
          } catch (java.lang.Exception decompiledCaughtParameter0) {
            decompiledCaughtException = decompiledCaughtParameter0;
            var3_ref = (Exception) (Object) decompiledCaughtException;
          }
        } catch (RuntimeException | Error decompiledUncheckedException) {
          throw decompiledUncheckedException;
        } catch (Throwable decompiledCheckedException) {
          throw new RuntimeException(decompiledCheckedException);
        }
    }

    final void a(int param0) {
        int var2;
        ck var3;
        int var4;
        var4 = HoldTheLine.field_D;
        this.field_p.a(param0);
        var3 = (ck) (this.field_q.b((byte) 120));
        while (var3 != null) {
          if (!this.field_m.a(true, var3)) {
            var2 = param0;
            do {
              if (var3.field_r >= var2) {
                this.a(var3, -106, var2);
                var3.field_r = var3.field_r - var2;
                break;
              }
              this.a(var3, -121, var3.field_r);
              var2 = var2 - var3.field_r;
            } while (!this.field_m.a((int[]) null, var3, var2, -104, 0));
          }
          var3 = (ck) (this.field_q.c((byte) -120));
        }
    }

    private final void a(ck param0, int[] param1, byte param2, int param3, int param4, int param5) {
        kf stackIn_14_0 = null;
        int stackIn_14_1 = 0;
        ck stackIn_14_2 = null;
        boolean stackIn_15_3;
        RuntimeException stackIn_27_0 = null;
        StringBuilder stackIn_27_1 = null;
        String stackIn_28_2 = null;
        StringBuilder stackIn_30_1 = null;
        String stackIn_31_2 = null;
        RuntimeException decompiledCaughtException = null;
        int var7_int = 0;
        RuntimeException var7 = null;
        int var8 = 0;
        int var9 = 0;
        int var10 = 0;
        db var11 = null;
        int var12 = 0;
        var12 = HoldTheLine.field_D;
        try {
          if (param2 != -23) {
            this.field_q = (ah) null;
          }
          if ((4 & this.field_m.field_o[param0.field_p]) != 0 &&
            param0.field_z < 0) {
            var7_int = this.field_m.field_t[param0.field_p] / lo.field_l;
            while (true) {
              var8 = (-param0.field_v + var7_int + 1048575) / var7_int;
              if (param4 < var8) {
                param0.field_v = param0.field_v + var7_int * param4;
                break;
              }
              param0.field_t.b(param1, param3, var8);
              param0.field_v = param0.field_v + (-1048576 + var8 * var7_int);
              param3 = param3 + var8;
              param4 = param4 - var8;
              var9 = lo.field_l / 100;
              var10 = 262144 / var7_int;
              if (var9 > var10) {
                var9 = var10;
              }
              var11 = param0.field_t;
              if (0 != this.field_m.field_S[param0.field_p]) {
                param0.field_t = db.b(param0.field_s, var11.l(), 0, var11.k());
                stackIn_14_0 = this.field_m;
                stackIn_14_1 = param2 ^ -21;
                stackIn_14_2 = (ck) (param0);
                stackIn_15_3 = !(0 <= param0.field_o.field_q[param0.field_u]);
                ((kf) (Object) stackIn_14_0).a(stackIn_14_1, stackIn_14_2, stackIn_15_3);
                param0.field_t.c(var9, var11.j());
              } else {
                param0.field_t = db.b(param0.field_s, var11.l(), var11.j(), var11.k());
              }
              if (0 > param0.field_o.field_q[param0.field_u]) {
                param0.field_t.g(-1);
              }
              var11.f(var9);
              var11.b(param1, param3, param5 - param3);
              if (!var11.g()) {
                continue;
              }
              this.field_p.a(var11);
            }
          }
          param0.field_t.b(param1, param3, param4);
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var7 = decompiledCaughtException;
          stackIn_27_0 = var7;
          stackIn_27_1 = new StringBuilder().append("bl.C(");
          if (param0 == null) {
            stackIn_28_2 = "null";
          } else {
            stackIn_28_2 = "{...}";
          }
          stackIn_30_1 = ((StringBuilder) (Object) stackIn_27_1).append(stackIn_28_2).append(',');
          if (param1 == null) {
            stackIn_31_2 = "null";
          } else {
            stackIn_31_2 = "{...}";
          }
          throw kk.a((Throwable) ((Object) stackIn_27_0), ((StringBuilder) (Object) stackIn_30_1).append(stackIn_31_2).append(',').append(param2).append(',').append(param3).append(',').append(param4).append(',').append(param5).append(')').toString());
        }
    }

    final tj b() {
        ck var1;
        int var2;
        var2 = HoldTheLine.field_D;
        while (true) {
          var1 = (ck) (this.field_q.c((byte) -57));
          if (var1 == null) {
            return null;
          }
          if (var1.field_t != null) {
            return (tj) ((Object) var1.field_t);
          }
        }
    }

    final void b(int[] param0, int param1, int param2) {
        boolean stackIn_4_0 = false;
        RuntimeException stackIn_15_0 = null;
        StringBuilder stackIn_15_1 = null;
        String stackIn_16_2 = null;
        RuntimeException decompiledCaughtException = null;
        int var4_int = 0;
        RuntimeException var4 = null;
        int var5 = 0;
        ck var6 = null;
        int var7 = 0;
        var7 = HoldTheLine.field_D;
        try {
          this.field_p.b(param0, param1, param2);
          var6 = (ck) (this.field_q.b((byte) 101));
          while (var6 != null) {
            stackIn_4_0 = this.field_m.a(true, var6);
            boolean decompiledFrameCompleted0 = true;
            if (!stackIn_4_0) {
              var4_int = param1;
              var5 = param2;
              while (var5 > var6.field_r) {
                this.a(var6, param0, (byte) -23, var4_int, var6.field_r, var4_int + var5);
                var4_int = var4_int + var6.field_r;
                var5 = var5 - var6.field_r;
                if (this.field_m.a(param0, var6, var5, -116, var4_int)) {
                  decompiledFrameCompleted0 = false;
                  break;
                }
              }
              if (decompiledFrameCompleted0) {
                this.a(var6, param0, (byte) -23, var4_int, var5, var4_int + var5);
                var6.field_r = var6.field_r - var5;
              }
            }
            var6 = (ck) (this.field_q.c((byte) 102));
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var4 = decompiledCaughtException;
          stackIn_15_0 = var4;
          stackIn_15_1 = new StringBuilder().append("bl.A(");
          if (param0 == null) {
            stackIn_16_2 = "null";
          } else {
            stackIn_16_2 = "{...}";
          }
          throw kk.a((Throwable) ((Object) stackIn_15_0), ((StringBuilder) (Object) stackIn_15_1).append(stackIn_16_2).append(',').append(param1).append(',').append(param2).append(')').toString());
        }
    }

    public static void e(int param0) {
        field_o = null;
        field_n = null;
        field_r = null;
        if (param0 != 0) {
          field_s = (uf) null;
          field_s = null;
          return;
        }
        field_s = null;
    }

    final int c() {
        return 0;
    }

    bl(kf param0) {
        this.field_q = new ah();
        this.field_p = new fg();
        try {
          this.field_m = param0;
        } catch (RuntimeException runtimeException) {
          throw kk.a((Throwable) ((Object) runtimeException), "bl.<init>(" + (param0 != null ? "{...}" : "null") + ')');
        }
    }

    static {
        field_n = new int[]{3, 4, 3};
        field_o = "Deaths";
    }
}
