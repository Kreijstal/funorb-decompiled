/*
 * Decompiled by CFR-JS 0.4.0.
 */
import java.util.*;

final class ti {
    static java.util.zip.CRC32 field_k;
    private oh field_f;
    private int field_b;
    private oh[] field_a;
    private oh field_l;
    static fg field_d;
    static fg field_i;
    private int field_c;
    static bi field_h;
    static boolean field_e;
    static String field_j;
    static bc field_g;

    public static void b(int param0) {
        field_h = null;
        field_d = null;
        field_i = null;
        field_k = null;
        field_j = null;
        field_g = null;
        if (param0 != 0) {
          field_k = (java.util.zip.CRC32) null;
        }
    }

    final void a(oh param0, int param1, long param2) {
        oh var5 = null;
        try {
          if (param0.field_e != null) {
            param0.b((byte) -125);
          }
          var5 = this.field_a[(int)((long)(-1 + this.field_b) & param2)];
          param0.field_e = var5.field_e;
          param0.field_f = var5;
          param0.field_e.field_f = param0;
          param0.field_b = param2;
          int var6 = 113 / ((-54 - param1) / 63);
          param0.field_f.field_e = param0;
        } catch (RuntimeException runtimeException) {
          throw r.a((Throwable) ((Object) runtimeException), "ti.C(" + (param0 != null ? "{...}" : "null") + ',' + param1 + ',' + param2 + ')');
        }
    }

    final oh a(long param0, int param1) {
        oh var5 = null;
        int var6 = ShatteredPlansClient.field_F ? 1 : 0;
        oh var4 = this.field_a[(int)(param0 & (long)(-1 + this.field_b))];
        this.field_l = var4.field_f;
        while (this.field_l != var4) {
          if (this.field_l.field_b == param0) {
            var5 = this.field_l;
            this.field_l = this.field_l.field_f;
            return var5;
          }
          this.field_l = this.field_l.field_f;
        }
        if (param1 != -25064) {
          this.a(61L, 9);
        }
        this.field_l = null;
        return null;
    }

    final static bi[] a(int param0) {
        int var2 = 0;
        int var6_int = 0;
        int var7 = 0;
        bi[] var1;
        int var3;
        int[] var6;
        int var8;
        int[] var9;
        int[] var13;
        int[] var16;
        byte[] var20;
        int[] var21;
        byte[] var22;
        var8 = ShatteredPlansClient.field_F ? 1 : 0;
        var1 = new bi[en.field_c];
        if (param0 >= -103) {
          return (bi[]) null;
        }
        for (var2 = 0; var2 < en.field_c; var2++) {
          var3 = mc.field_s[var2] * cm.field_g[var2];
          var20 = hd.field_q[var2];
          if (!ua.field_h[var2]) {
            var9 = new int[var3];
            var21 = var9;
            for (var6_int = 0; var3 > var6_int; var6_int++) {
              var9[var6_int] = eo.field_fb[we.a((int) var20[var6_int], 255)];
            }
            var1[var2] = new bi(tk.field_y, eg.field_t, cf.field_H[var2], sj.field_a[var2], mc.field_s[var2], cm.field_g[var2], var21);
          } else {
            var22 = kc.field_l[var2];
            var16 = new int[var3];
            var13 = var16;
            var6 = var13;
            for (var7 = 0; var3 > var7; var7++) {
              var6[var7] = ee.a(eo.field_fb[we.a((int) var20[var7], 255)], we.a(255, (int) var22[var7]) << 24);
            }
            var1[var2] = (bi) ((Object) new om(tk.field_y, eg.field_t, cf.field_H[var2], sj.field_a[var2], mc.field_s[var2], cm.field_g[var2], var16));
          }
        }
        pd.a(0);
        return var1;
    }

    final static void a(int param0, int param1, int param2, int param3, int param4, int param5, qb param6, String param7, int param8) {
        try {
          ae.field_h = param3;
          dh.field_a = param6;
          rd.field_d = param7;
          si.field_u = param0;
          hn.field_i = param1;
          if (param5 != 1491341222) {
            field_j = (String) null;
          }
          sr.field_q = param4;
          sg.field_Cb = param2;
          cf.field_D = param8;
          vp.field_o = (ar) ((Object) new qc());
          vn.field_w = new rn(param6);
          lg.field_c = new tj(vp.field_o, vn.field_w);
        } catch (RuntimeException runtimeException) {
          throw r.a((Throwable) ((Object) runtimeException), "ti.F(" + param0 + ',' + param1 + ',' + param2 + ',' + param3 + ',' + param4 + ',' + param5 + ',' + (param6 != null ? "{...}" : "null") + ',' + (param7 != null ? "{...}" : "null") + ',' + param8 + ')');
        }
    }

    final static int a(byte param0, ln[] param1) {
        int var6 = 0;
        int var9 = 0;
        int stackIn_25_0 = 0;
        RuntimeException stackIn_28_0 = null;
        StringBuilder stackIn_28_1 = null;
        String stackIn_29_2 = null;
        RuntimeException decompiledCaughtException = null;
        int var2_int = 0;
        RuntimeException var2 = null;
        pf var3 = null;
        pf var4 = null;
        int var5 = 0;
        ln var7 = null;
        ln[] var8 = null;
        ln var10 = null;
        int var11 = 0;
        ln var12 = null;
        ln var13 = null;
        int var2_intLifetime1;
        var11 = ShatteredPlansClient.field_F ? 1 : 0;
        try {
          for (var2_int = 0; var2_int < param1.length; var2_int++) {
            param1[var2_int].field_x = -1;
          }
          var2_intLifetime1 = param1.length;
          var3 = new pf();
          if (param0 != 83) {
            field_k = (java.util.zip.CRC32) null;
          }
          var4 = new pf();
          var5 = 0;
          for (var6 = 0; var2_intLifetime1 > var6; var6++) {
            var12 = param1[var6];
            if (var12.field_x == -1) {
              var4.a((byte) -113, var12);
              {
                while (!(var4.g(-121))) {
                  var13 = (ln) (var4.h(80));
                  var3.a((byte) -113, var13);
                  var13.field_x = var5;
                  if (var13.field_D == null) {
                    continue;
                  }
                  var8 = var13.field_D;
                  for (var9 = 0; var9 < var8.length; var9++) {
                    var10 = var8[var9];
                    if (var10.field_x == -1) {
                      var4.a((byte) -113, var10);
                    }
                  }
                }
                {
                  var7 = (ln) (var3.d(0));
                  while (var7 != null) {
                    var7.field_x = var5;
                    var7 = (ln) (var3.a((byte) -71));
                  }
                  var3.a(0);
                  var5++;
                }
              }
            }
          }
          stackIn_25_0 = var5;
          return stackIn_25_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2 = decompiledCaughtException;
          stackIn_28_0 = var2;
          stackIn_28_1 = new StringBuilder().append("ti.G(").append(param0).append(',');
          if (param1 == null) {
            stackIn_29_2 = "null";
          } else {
            stackIn_29_2 = "{...}";
          }
          throw r.a((Throwable) ((Object) stackIn_28_0), ((StringBuilder) (Object) stackIn_28_1).append(stackIn_29_2).append(')').toString());
        }
    }

    final oh a(boolean param0) {
        int fieldTemp$0 = 0;
        oh var2;
        int var3;
        oh var4;
        var3 = ShatteredPlansClient.field_F ? 1 : 0;
        if (this.field_c > 0 &&
          this.field_f != this.field_a[this.field_c - 1]) {
          var2 = this.field_f;
          this.field_f = var2.field_f;
          return var2;
        }
        do {
          if (this.field_b <= this.field_c) {
            if (!param0) {
              return null;
            }
            ti.a(10);
            return null;
          }
          fieldTemp$0 = this.field_c;
          this.field_c = this.field_c + 1;
          var4 = this.field_a[fieldTemp$0].field_f;
          var2 = var4;
        } while (var4 == this.field_a[this.field_c - 1]);
        this.field_f = var2.field_f;
        return var2;
    }

    final oh c(int param0) {
        int var2 = 61 % ((param0 + 63) / 54);
        this.field_c = 0;
        return this.a(false);
    }

    final static void a(int param0, int param1) {
        sl var2 = js.field_f;
        var2.h(param0, 255);
        var2.field_j = var2.field_j + 1;
        int var3 = var2.field_j;
        var2.c(5, (byte) -92);
        var2.c(np.field_a.field_Eb, (byte) -120);
        int var4 = (np.field_a.field_Fb << 6) + np.field_a.field_nc;
        var2.c(var4, (byte) -72);
        var2.a(param1, np.field_a.field_dc.length, np.field_a.field_dc, param1 ^ 22186);
        var2.b(var2.field_j - var3, (byte) 124);
    }

    final static boolean a(String param0, boolean param1) {
        RuntimeException var2 = null;
        boolean stackIn_5_0 = false;
        RuntimeException stackIn_8_0 = null;
        StringBuilder stackIn_8_1 = null;
        String stackIn_9_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          if (!param1) {
            field_k = (java.util.zip.CRC32) null;
          }
          stackIn_5_0 = (null != di.a(param0, 119));
          return stackIn_5_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2 = decompiledCaughtException;
          stackIn_8_0 = var2;
          stackIn_8_1 = new StringBuilder().append("ti.J(");
          if (param0 == null) {
            stackIn_9_2 = "null";
          } else {
            stackIn_9_2 = "{...}";
          }
          throw r.a((Throwable) ((Object) stackIn_8_0), ((StringBuilder) (Object) stackIn_8_1).append(stackIn_9_2).append(',').append(param1).append(')').toString());
        }
    }

    ti(int param0) {
        int var2 = 0;
        oh dupTemp$0 = null;
        oh var3 = null;
        this.field_c = 0;
        this.field_b = param0;
        this.field_a = new oh[param0];
        for (var2 = 0; var2 < param0; var2++) {
          dupTemp$0 = new oh();
          var3 = dupTemp$0;
          this.field_a[var2] = dupTemp$0;
          var3.field_f = var3;
          var3.field_e = var3;
        }
    }

    static {
        field_k = new java.util.zip.CRC32();
        field_d = new fg();
        field_j = "Add <%0> to friend list";
        field_i = new fg();
    }
}
