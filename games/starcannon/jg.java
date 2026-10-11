/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class jg extends dk {
    private int field_G;
    static int field_A;
    static String field_I;
    static int field_H;
    static ue field_F;
    private he field_D;
    static hl[] field_C;

    final String d(int param0) {
        if (this.field_h) {
          return this.field_D.a(26162);
        }
        if (param0 != 12606) {
          this.field_D = (he) null;
          return null;
        }
        return null;
    }

    final void a(int param0, int param1, uj param2, int param3) {
        try {
          if (param0 < 27) {
            uj var6 = (uj) null;
            this.a(64, (uj) null);
          }
          this.field_G = this.field_G + 1;
          super.a(40, param1, param2, param3);
        } catch (RuntimeException runtimeException) {
          throw sd.a((Throwable) ((Object) runtimeException), "jg.U(" + param0 + ',' + param1 + ',' + (param2 != null ? "{...}" : "null") + ',' + param3 + ')');
        }
    }

    final void a(int param0, int param1, byte param2, int param3) {
        int var5;
        int var6;
        p var8;
        int var9;
        int var10;
        int var11;
        hl var13;
        hl var14;
        hl var15;
        hl var16;
        int var9Lifetime1;
        int var10Lifetime1;
        var11 = StarCannon.field_A;
        super.a(param0, param1, param2, param3);
        if (param0 != 0) {
          return;
        }
        var5 = (this.field_i >> 1) + this.field_s + param1;
        var6 = this.field_j + (param3 + (this.field_f >> 1));
        var8 = this.field_D.b((byte) -126);
        if (cg.field_g == var8) {
          var16 = fi.field_g[0];
          var9 = var16.field_x << 1;
          var10 = var16.field_q << 1;
          if (fe.field_H == null) {
            fe.field_H = new hl(var9, var10);
            bc.a(fe.field_H, 26095);
          } else {
            if (fe.field_H.field_u < var9) {
              fe.field_H = new hl(var9, var10);
              bc.a(fe.field_H, 26095);
            } else {
              if (fe.field_H.field_v >= var10) {
                bc.a(fe.field_H, 26095);
                ki.b();
              } else {
                fe.field_H = new hl(var9, var10);
                bc.a(fe.field_H, 26095);
              }
            }
          }
          var16.b(112, 144, var16.field_x << 4, var16.field_q << 4, -this.field_G << 10, 4096);
          wf.a(-120);
          fe.field_H.f(var5 - var16.field_x, -var16.field_q + var6, 256);
          return;
        }
        if (var8 != cd.field_a) {
          if (var8 == sb.field_n) {
            var14 = fi.field_g[2];
            var14.f(var5 - (var14.field_u >> 1), var6 - (var14.field_v >> 1), 256);
            return;
          }
          if (var8 != bf.field_x) {
            return;
          }
          var13 = fi.field_g[1];
          var13.f(-(var13.field_u >> 1) + var5, -(var13.field_v >> 1) + var6, 256);
          return;
        }
        var15 = fi.field_g[0];
        var9Lifetime1 = var15.field_x << 1;
        var10Lifetime1 = var15.field_q << 1;
        if (fe.field_H == null) {
          fe.field_H = new hl(var9Lifetime1, var10Lifetime1);
          bc.a(fe.field_H, 26095);
        } else {
          if (fe.field_H.field_u < var9Lifetime1) {
            fe.field_H = new hl(var9Lifetime1, var10Lifetime1);
            bc.a(fe.field_H, 26095);
          } else {
            if (fe.field_H.field_v >= var10Lifetime1) {
              bc.a(fe.field_H, 26095);
              ki.b();
            } else {
              fe.field_H = new hl(var9Lifetime1, var10Lifetime1);
              bc.a(fe.field_H, 26095);
            }
          }
        }
        var15.b(112, 144, var15.field_x << 4, var15.field_q << 4, -this.field_G << 10, 4096);
        wf.a(-120);
        fe.field_H.f(var5 - var15.field_x, -var15.field_q + var6, 256);
    }

    final boolean a(int param0, uj param1) {
        RuntimeException var3 = null;
        RuntimeException stackIn_6_0 = null;
        StringBuilder stackIn_6_1 = null;
        String stackIn_7_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          if (param0 == 0) {
            return false;
          }
          field_A = -109;
          return false;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3 = decompiledCaughtException;
          stackIn_6_0 = var3;
          stackIn_6_1 = new StringBuilder().append("jg.PA(").append(param0).append(',');
          if (param1 == null) {
            stackIn_7_2 = "null";
          } else {
            stackIn_7_2 = "{...}";
          }
          throw sd.a((Throwable) ((Object) stackIn_6_0), ((StringBuilder) (Object) stackIn_6_1).append(stackIn_7_2).append(')').toString());
        }
    }

    public static void e(int param0) {
        field_I = null;
        field_C = null;
        if (param0 != 934716193) {
          jg.e((byte) -6);
          field_F = null;
          return;
        }
        field_F = null;
    }

    final static void e(byte param0) {
        if (param0 < 99) {
          field_F = (ue) null;
        }
    }

    jg(he param0) {
        try {
          this.field_D = param0;
        } catch (RuntimeException runtimeException) {
          throw sd.a((Throwable) ((Object) runtimeException), "jg.<init>(" + (param0 != null ? "{...}" : "null") + ')');
        }
    }

    static {
        field_C = new hl[10];
        field_I = "Revenge fleet destroyed<br><br>CONGRATULATIONS<br><br>Final score: ";
    }
}
