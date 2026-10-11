/*
 * Decompiled by CFR-JS 0.4.0.
 */
import java.io.*;

final class jk {
    static SceneWidget[] field_a;
    static String field_e;
    static String field_f;
    static String field_b;
    static String field_k;
    private int[] field_c;
    static int[] field_j;
    static mg field_i;
    static String field_g;
    static SceneWidget field_h;
    static int field_d;

    final static boolean c(byte param0) {
        if (param0 <= 77) {
          jk.d((byte) 44);
        }
        return !gf.field_a.a((byte) -72) ? true : false;
    }

    final int a(int param0, byte param1) {
        int var3;
        int var4;
        int var5;
        int var6;
        var3 = (this.field_c.length >> 1) - 1;
        var4 = param0 & var3;
        var5 = 8 / ((48 - param1) / 60);
        while (true) {
          var6 = this.field_c[1 + var4 + var4];
          if (var6 == -1) {
            return -1;
          }
          if (this.field_c[var4 + var4] == param0) {
            return var6;
          }
          var4 = var3 & var4 + 1;
        }
    }

    final static String a(int param0, byte[] param1) {
        RuntimeException var2 = null;
        String stackIn_3_0 = null;
        RuntimeException stackIn_6_0 = null;
        StringBuilder stackIn_6_1 = null;
        String stackIn_7_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          if (param0 != 13) {
            field_g = (String) null;
          }
          stackIn_3_0 = ub.a((byte) 37, 0, param1, param1.length);
          return stackIn_3_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2 = decompiledCaughtException;
          stackIn_6_0 = var2;
          stackIn_6_1 = new StringBuilder().append("jk.B(").append(param0).append(',');
          if (param1 == null) {
            stackIn_7_2 = "null";
          } else {
            stackIn_7_2 = "{...}";
          }
          throw ci.a((Throwable) ((Object) stackIn_6_0), ((StringBuilder) (Object) stackIn_6_1).append(stackIn_7_2).append(')').toString());
        }
    }

    jk(int[] param0) {
        int var2_int = 0;
        int var3 = 0;
        int var4 = 0;
        RuntimeException stackIn_16_0 = null;
        StringBuilder stackIn_16_1 = null;
        String stackIn_17_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var2 = null;
        int var3Lifetime1;
        try {
          var2_int = 1;
          while ((param0.length >> 1) + param0.length >= var2_int) {
            var2_int = var2_int << 1;
          }
          this.field_c = new int[var2_int + var2_int];
          for (var3 = 0; var2_int + var2_int > var3; var3++) {
            this.field_c[var3] = -1;
          }
          for (var3Lifetime1 = 0; var3Lifetime1 < param0.length; var3Lifetime1++) {
            var4 = -1 + var2_int & param0[var3Lifetime1];
            while (this.field_c[1 + var4 + var4] != -1) {
              var4 = 1 + var4 & -1 + var2_int;
            }
            this.field_c[var4 + var4] = param0[var3Lifetime1];
            this.field_c[1 + var4 + var4] = var3Lifetime1;
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2 = decompiledCaughtException;
          stackIn_16_0 = var2;
          stackIn_16_1 = new StringBuilder().append("jk.<init>(");
          if (param0 == null) {
            stackIn_17_2 = "null";
          } else {
            stackIn_17_2 = "{...}";
          }
          throw ci.a((Throwable) ((Object) stackIn_16_0), ((StringBuilder) (Object) stackIn_16_1).append(stackIn_17_2).append(')').toString());
        }
    }

    final static void a(int param0, PacketBuffer param1) {
        try {
          int var4 = 0;
          byte[] var2 = null;
          int var3_int = 0;
          Exception var3 = null;
          int var5 = 0;
          byte[] var6 = null;
          byte[] var7 = null;
          byte[] var8 = null;
          byte[] var9 = null;
          byte[] var10 = null;
          RuntimeException stackIn_21_0 = null;
          StringBuilder stackIn_21_1 = null;
          String stackIn_22_2 = null;
          Throwable decompiledCaughtException = null;
          RuntimeException var2_ref = null;
          var5 = SteelSentinels.obfuscationControl;
          try {
            if (param0 < 120) {
              field_a = (SceneWidget[]) null;
            }
            var9 = new byte[24];
            var7 = var9;
            var6 = var7;
            var10 = var6;
            var8 = var10;
            var2 = var8;
            if (null != va.field_h) {
              try {
                va.field_h.a(-121, 0L);
                va.field_h.a(-121, var9);
                for (var3_int = 0; 24 > var3_int; var3_int++) {
                  if (var10[var3_int] == 0) {
                    continue;
                  }
                  break;
                }
                if (var3_int >= 24) {
                  throw new IOException();
                }
              } catch (java.lang.Exception decompiledCaughtParameter0) {
                decompiledCaughtException = decompiledCaughtParameter0;
                var3 = (Exception) (Object) decompiledCaughtException;
                for (var4 = 0; var4 < 24; var4++) {
                  var2[var4] = (byte)-1;
                }
              }
              param1.writeBytes(24, (byte) -122, 0, var10);
            } else {
              param1.writeBytes(24, (byte) -122, 0, var10);
            }
            return;
          } catch (java.lang.RuntimeException decompiledCaughtParameter1) {
            decompiledCaughtException = decompiledCaughtParameter1;
            var2_ref = (RuntimeException) (Object) decompiledCaughtException;
            stackIn_21_0 = var2_ref;
            stackIn_21_1 = new StringBuilder().append("jk.C(").append(param0).append(',');
            if (param1 == null) {
              stackIn_22_2 = "null";
            } else {
              stackIn_22_2 = "{...}";
            }
            throw ci.a((Throwable) ((Object) stackIn_21_0), ((StringBuilder) (Object) stackIn_21_1).append(stackIn_22_2).append(')').toString());
          }
        } catch (RuntimeException | Error decompiledUncheckedException) {
          throw decompiledUncheckedException;
        } catch (Throwable decompiledCheckedException) {
          throw new RuntimeException(decompiledCheckedException);
        }
    }

    final static void d(byte param0) {
        pc.d(param0 - 14);
        vd.a((byte) 63);
        if (param0 != -66) {
          field_b = (String) null;
        }
    }

    public static void b(byte param0) {
        if (param0 >= -67) {
          jk.c((byte) -9);
        }
        field_f = null;
        field_g = null;
        field_e = null;
        field_i = null;
        field_h = null;
        field_a = null;
        field_j = null;
        field_b = null;
        field_k = null;
    }

    final static void a(byte param0) {
        RgbSprite var3 = new RgbSprite(120, 30);
        RgbSprite var4 = var3;
        ub.field_a[0] = qe.a(var4, (byte) -93, jf.field_eb);
        ub.field_a[1] = qe.a(var4, (byte) -93, gf.field_e);
        ub.field_a[2] = qe.a(var4, (byte) -93, ob.field_w);
        ub.field_a[3] = qe.a(var4, (byte) -93, fm.field_i);
        ub.field_a[4] = qe.a(var4, (byte) -93, sn.field_o);
        ub.field_a[5] = qe.a(var4, (byte) -93, gm.field_a);
        ub.field_a[9] = qe.a(var4, (byte) -93, fc.field_c);
        ub.field_a[10] = qe.a(var4, (byte) -93, hm.field_e);
        ub.field_a[11] = qe.a(var4, (byte) -93, sn.field_a);
        ub.field_a[12] = qe.a(var4, (byte) -93, jm.field_t);
        ub.field_a[13] = qe.a(var4, (byte) -93, cl.field_g);
        ub.field_a[14] = qe.a(var4, (byte) -93, b.field_p);
        ub.field_a[15] = qe.a(var4, (byte) -93, lk.field_X);
        ub.field_a[16] = qe.a(var4, (byte) -93, pl.field_V);
        lc.field_a = new IndexedSprite[ub.field_a.length];
        ii.a(ub.field_a, 0, lc.field_a, 0, ub.field_a.length);
        lc.field_a[5] = ub.field_a[15];
        lc.field_a[4] = ub.field_a[14];
        lc.field_a[3] = ub.field_a[13];
        lc.field_a[8] = ub.field_a[7];
        lc.field_a[7] = ub.field_a[12];
        lc.field_a[15] = null;
        lc.field_a[14] = null;
        lc.field_a[13] = null;
        lc.field_a[12] = ub.field_a[7];
        rh.field_v[6].d();
        if (param0 != 6) {
          return;
        }
        fk.field_d.a(gf.field_e, 78, 26, 0, -1);
        fk.field_d.a(ob.field_w, 130, 26, 0, -1);
        sb.field_bb.b((byte) 121);
    }

    static {
        field_f = "achievements to collect";
        field_k = "<%1> was caught in <%0>'s core containment explosion";
        field_b = "Start Game";
        field_j = new int[]{14, 15, 16, 22, 4, -1, 8};
    }
}
