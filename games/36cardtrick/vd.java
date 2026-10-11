/*
 * Decompiled by CFR-JS 0.4.0.
 */
import java.io.*;

final class vd extends he {
    static cc field_q;
    static volatile int field_s;
    private int[][] field_v;
    private int[] field_t;
    private String[] field_o;
    int[] field_m;
    static ee field_p;
    static byte[][] field_r;
    static volatile boolean field_w;
    static String field_l;
    static String field_k;
    static int field_u;
    static String field_n;

    private final void a(int param0, pb param1, byte param2) {
        int[] array$0 = null;
        int var9 = 0;
        RuntimeException stackIn_21_0 = null;
        StringBuilder stackIn_21_1 = null;
        String stackIn_22_2 = null;
        RuntimeException decompiledCaughtException = null;
        int var4_int = 0;
        RuntimeException var4 = null;
        int var5 = 0;
        int var6 = 0;
        int var7 = 0;
        de var8 = null;
        int var10 = 0;
        var10 = Main.field_T;
        try {
          var4_int = -30 % ((param2 - 34) / 63);
          if (1 != param0) {
            if (param0 == 2) {
              var5 = param1.f(29);
              this.field_m = new int[var5];
              for (var6 = 0; var6 < var5; var6++) {
                this.field_m[var6] = param1.d((byte) 72);
              }
            } else if (param0 == 3) {
              var5 = param1.f(-96);
              this.field_v = new int[var5][];
              this.field_t = new int[var5];
              for (var6 = 0; var5 > var6; var6++) {
                var7 = param1.d((byte) 72);
                var8 = p.a(-1, var7);
                if (var8 != null) {
                  this.field_t[var6] = var7;
                  array$0 = new int[var8.field_d];
                  this.field_v[var6] = array$0;
                  for (var9 = 0; var8.field_d > var9; var9++) {
                    this.field_v[var6][var9] = param1.d((byte) 72);
                  }
                }
              }
            } else {
              if (param0 != 4) {
                return;
              }
            }
          } else {
            this.field_o = rh.a('<', param1.c(false), -124);
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var4 = decompiledCaughtException;
          stackIn_21_0 = var4;
          stackIn_21_1 = new StringBuilder().append("vd.C(").append(param0).append(',');
          if (param1 == null) {
            stackIn_22_2 = "null";
          } else {
            stackIn_22_2 = "{...}";
          }
          throw ma.a((Throwable) ((Object) stackIn_21_0), ((StringBuilder) (Object) stackIn_21_1).append(stackIn_22_2).append(',').append(param2).append(')').toString());
        }
    }

    final static void a(int param0, int param1) {
        try {
          try {
            vh.a(new Object[]{new Integer(param0)}, "resizing", (byte) 115, mk.g(-123));
          } catch (Throwable throwable) {
          }
          if (param1 != -1) {
            field_w = true;
          }
        } catch (RuntimeException | Error decompiledUncheckedException) {
          throw decompiledUncheckedException;
        } catch (Throwable decompiledCheckedException) {
          throw new RuntimeException(decompiledCheckedException);
        }
    }

    final static void a(int param0, int param1, boolean param2, long param3, int param4, int param5, String param6, int param7, int param8, int param9, int param10, int param11, le param12, boolean param13) {
        try {
          RuntimeException stackIn_16_0 = null;
          StringBuilder stackIn_16_1 = null;
          String stackIn_17_2 = null;
          StringBuilder stackIn_19_1 = null;
          String stackIn_20_2 = null;
          Throwable decompiledCaughtException = null;
          IOException var15 = null;
          RuntimeException var15_ref = null;
          try {
            rd.field_j = new w(param11);
            na.field_r = new w(param7);
            hj.field_l = param8;
            ag.field_e = param10;
            ag.field_d = param4;
            nf.field_c = param0;
            td.field_b = param12;
            mk.field_k = param6;
            wk.field_d = param3;
            kh.field_g = param9;
            bj.field_m = param2;
            dg.field_F = param13;
            kj.field_t = param1;
            if (param5 < 44) {
              vd.e(65);
            }
            if (null != td.field_b.field_x) {
              try {
                e.field_e = new tk(td.field_b.field_x, 64, 0);
              } catch (java.io.IOException decompiledCaughtParameter0) {
                decompiledCaughtException = decompiledCaughtParameter0;
                var15 = (IOException) (Object) decompiledCaughtException;
                throw new RuntimeException(var15.toString());
              }
            }
            return;
          } catch (java.lang.RuntimeException decompiledCaughtParameter1) {
            decompiledCaughtException = decompiledCaughtParameter1;
            var15_ref = (RuntimeException) (Object) decompiledCaughtException;
            stackIn_16_0 = var15_ref;
            stackIn_16_1 = new StringBuilder().append("vd.B(").append(param0).append(',').append(param1).append(',').append(param2).append(',').append(param3).append(',').append(param4).append(',').append(param5).append(',');
            if (param6 == null) {
              stackIn_17_2 = "null";
            } else {
              stackIn_17_2 = "{...}";
            }
            stackIn_19_1 = ((StringBuilder) (Object) stackIn_16_1).append(stackIn_17_2).append(',').append(param7).append(',').append(param8).append(',').append(param9).append(',').append(param10).append(',').append(param11).append(',');
            if (param12 == null) {
              stackIn_20_2 = "null";
            } else {
              stackIn_20_2 = "{...}";
            }
            throw ma.a((Throwable) ((Object) stackIn_16_0), ((StringBuilder) (Object) stackIn_19_1).append(stackIn_20_2).append(',').append(param13).append(')').toString());
          }
        } catch (RuntimeException | Error decompiledUncheckedException) {
          throw decompiledUncheckedException;
        } catch (Throwable decompiledCheckedException) {
          throw new RuntimeException(decompiledCheckedException);
        }
    }

    final void a(byte param0, pb param1) {
        int var3_int = 0;
        int var4 = 0;
        RuntimeException stackIn_9_0 = null;
        StringBuilder stackIn_9_1 = null;
        String stackIn_10_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var3 = null;
        le var5 = null;
        var4 = Main.field_T;
        try {
          while (true) {
            var3_int = param1.f(91);
            if (0 != var3_int) {
              this.a(var3_int, param1, (byte) 117);
              continue;
            }
            break;
          }
          if (param0 < 29) {
            var5 = (le) null;
            vd.a(73, -78, true, -52L, -55, -9, (String) null, -34, -78, -25, -16, 3, (le) null, false);
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3 = decompiledCaughtException;
          stackIn_9_0 = var3;
          stackIn_9_1 = new StringBuilder().append("vd.G(").append(param0).append(',');
          if (param1 == null) {
            stackIn_10_2 = "null";
          } else {
            stackIn_10_2 = "{...}";
          }
          throw ma.a((Throwable) ((Object) stackIn_9_0), ((StringBuilder) (Object) stackIn_9_1).append(stackIn_10_2).append(')').toString());
        }
    }

    final String b(byte param0) {
        int var3 = 0;
        StringBuilder discarded$1 = null;
        StringBuilder discarded$2 = null;
        int var4 = Main.field_T;
        StringBuilder var5 = new StringBuilder(80);
        StringBuilder var2 = var5;
        if (param0 != 28) {
          return (String) null;
        }
        if (this.field_o == null) {
          return "";
        }
        StringBuilder discarded$0 = var5.append(this.field_o[0]);
        for (var3 = 1; var3 < this.field_o.length; var3++) {
          discarded$1 = var2.append("...");
          discarded$2 = var5.append(this.field_o[var3]);
        }
        return var2.toString();
    }

    public static void e(int param0) {
        field_k = null;
        if (param0 <= 45) {
          return;
        }
        field_r = (byte[][]) null;
        field_p = null;
        field_n = null;
        field_q = null;
        field_l = null;
    }

    final void c(byte param0) {
        int var2 = 0;
        int var3 = Main.field_T;
        int var2Lifetime1;
        if (this.field_m != null) {
          for (var2 = 0; var2 < this.field_m.length; var2++) {
            this.field_m[var2] = fj.a(this.field_m[var2], 32768);
          }
        }
        var2Lifetime1 = -85 % ((param0 - 62) / 63);
    }

    vd() {
    }

    static {
        field_s = -1;
        field_q = new cc();
        field_l = "Player";
        field_w = false;
        field_n = "Not yet achieved";
        field_u = -1;
        field_k = "Name is available";
    }
}
