/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class vr extends wp {
    static String field_G;
    private int field_E;
    private v field_H;
    static String field_F;

    final void a(int param0, int param1, pk param2, int param3) {
        try {
          this.field_E = this.field_E + 1;
          int var5_int = 46 / ((param1 + 25) / 45);
          super.a(param0, 54, param2, param3);
        } catch (RuntimeException runtimeException) {
          throw qo.a((Throwable) ((Object) runtimeException), "vr.U(" + param0 + ',' + param1 + ',' + (param2 != null ? "{...}" : "null") + ',' + param3 + ')');
        }
    }

    final static void a(java.awt.Component param0, int param1) {
        try {
          param0.removeKeyListener(wd.field_e);
          param0.removeFocusListener(wd.field_e);
          lv.field_i = param1;
        } catch (RuntimeException runtimeException) {
          throw qo.a((Throwable) ((Object) runtimeException), "vr.D(" + (param0 != null ? "{...}" : "null") + ',' + param1 + ')');
        }
    }

    final void a(int param0, int param1, byte param2, int param3) {
        wb var16 = null;
        wb var17 = null;
        wb var14 = null;
        wb var15 = null;
        int var9 = 0;
        int var10 = 0;
        pk var12 = null;
        int var11 = Sumoblitz.field_L ? 1 : 0;
        pk var12Lifetime1;
        pk var12Lifetime2;
        pk var12Lifetime3;
        pk var12Lifetime4;
        pk var12Lifetime5;
        pk var12Lifetime6;
        pk var12Lifetime1Lifetime1;
        pk var12Lifetime1Lifetime2;
        pk var12Lifetime1Lifetime3;
        int var9Lifetime1;
        int var10Lifetime1;
        super.a(param0, param1, (byte) -122, param3);
        if (0 != param3) {
          return;
        }
        int var5 = (this.field_q >> 1) + (this.field_r + param0);
        int var6 = (this.field_p >> 1) + param1 + this.field_v;
        gf var8 = this.field_H.c(-103);
        if (mb.field_f == var8) {
          var16 = fw.field_m[0];
          var9 = var16.field_z << 1;
          var10 = var16.field_w << 1;
          if (kv.field_a == null) {
            kv.field_a = new wb(var9, var10);
            jq.a(7161, kv.field_a);
            var16.a(112, 144, var16.field_z << 4, var16.field_w << 4, -this.field_E << 10, 4096);
            su.a((byte) 126);
            kv.field_a.d(var5 - var16.field_z, -var16.field_w + var6, 256);
            if (param2 >= -35) {
              var12 = (pk) null;
              this.a(86, -51, (pk) null, 16);
            }
            return;
          }
          if (var9 > kv.field_a.field_x) {
            kv.field_a = new wb(var9, var10);
            jq.a(7161, kv.field_a);
            var16.a(112, 144, var16.field_z << 4, var16.field_w << 4, -this.field_E << 10, 4096);
            su.a((byte) 126);
            kv.field_a.d(var5 - var16.field_z, -var16.field_w + var6, 256);
            if (param2 >= -35) {
              var12Lifetime4 = (pk) null;
              this.a(86, -51, (pk) null, 16);
            }
            return;
          }
          if (var10 <= kv.field_a.field_u) {
            jq.a(7161, kv.field_a);
            lk.b();
            var16.a(112, 144, var16.field_z << 4, var16.field_w << 4, -this.field_E << 10, 4096);
            su.a((byte) 126);
            kv.field_a.d(var5 - var16.field_z, -var16.field_w + var6, 256);
            if (param2 >= -35) {
              var12Lifetime5 = (pk) null;
              this.a(86, -51, (pk) null, 16);
            }
            return;
          }
          kv.field_a = new wb(var9, var10);
          jq.a(7161, kv.field_a);
          var16.a(112, 144, var16.field_z << 4, var16.field_w << 4, -this.field_E << 10, 4096);
          su.a((byte) 126);
          kv.field_a.d(var5 - var16.field_z, -var16.field_w + var6, 256);
          if (param2 >= -35) {
            var12Lifetime6 = (pk) null;
            this.a(86, -51, (pk) null, 16);
          }
          return;
        }
        if (kt.field_a == var8) {
          var17 = fw.field_m[0];
          var9Lifetime1 = var17.field_z << 1;
          var10Lifetime1 = var17.field_w << 1;
          if (kv.field_a == null) {
            kv.field_a = new wb(var9Lifetime1, var10Lifetime1);
            jq.a(7161, kv.field_a);
            var17.a(112, 144, var17.field_z << 4, var17.field_w << 4, -this.field_E << 10, 4096);
            su.a((byte) 126);
            kv.field_a.d(var5 - var17.field_z, -var17.field_w + var6, 256);
            if (param2 >= -35) {
              var12Lifetime1 = (pk) null;
              this.a(86, -51, (pk) null, 16);
            }
            return;
          }
          if (var9Lifetime1 > kv.field_a.field_x) {
            kv.field_a = new wb(var9Lifetime1, var10Lifetime1);
            jq.a(7161, kv.field_a);
            var17.a(112, 144, var17.field_z << 4, var17.field_w << 4, -this.field_E << 10, 4096);
            su.a((byte) 126);
            kv.field_a.d(var5 - var17.field_z, -var17.field_w + var6, 256);
            if (param2 >= -35) {
              var12Lifetime1Lifetime1 = (pk) null;
              this.a(86, -51, (pk) null, 16);
            }
            return;
          }
          if (var10Lifetime1 > kv.field_a.field_u) {
            kv.field_a = new wb(var9Lifetime1, var10Lifetime1);
            jq.a(7161, kv.field_a);
            var17.a(112, 144, var17.field_z << 4, var17.field_w << 4, -this.field_E << 10, 4096);
            su.a((byte) 126);
            kv.field_a.d(var5 - var17.field_z, -var17.field_w + var6, 256);
            if (param2 < -35) {
              return;
            }
            var12Lifetime1Lifetime2 = (pk) null;
            this.a(86, -51, (pk) null, 16);
            return;
          }
          jq.a(7161, kv.field_a);
          lk.b();
          var17.a(112, 144, var17.field_z << 4, var17.field_w << 4, -this.field_E << 10, 4096);
          su.a((byte) 126);
          kv.field_a.d(var5 - var17.field_z, -var17.field_w + var6, 256);
          if (param2 < -35) {
            return;
          }
          var12Lifetime1Lifetime3 = (pk) null;
          this.a(86, -51, (pk) null, 16);
          return;
        }
        if (qr.field_e == var8) {
          var14 = fw.field_m[2];
          var14.d(-(var14.field_x >> 1) + var5, var6 - (var14.field_u >> 1), 256);
          if (param2 < -35) {
            return;
          }
          var12Lifetime2 = (pk) null;
          this.a(86, -51, (pk) null, 16);
          return;
        }
        if (var8 == qe.field_a) {
          var15 = fw.field_m[1];
          var15.d(var5 - (var15.field_x >> 1), var6 - (var15.field_u >> 1), 256);
        }
        if (param2 < -35) {
          return;
        }
        var12Lifetime3 = (pk) null;
        this.a(86, -51, (pk) null, 16);
    }

    final String c(int param0) {
        if (this.field_k) {
          return this.field_H.a(3690);
        }
        if (param0 != -6696) {
          this.a(-102, 53, (byte) -40, -114);
          return null;
        }
        return null;
    }

    final boolean a(pk param0, byte param1) {
        RuntimeException var3 = null;
        RuntimeException stackIn_6_0 = null;
        StringBuilder stackIn_6_1 = null;
        String stackIn_7_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          if (param1 == 61) {
            return false;
          }
          this.field_E = 103;
          return false;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3 = decompiledCaughtException;
          stackIn_6_0 = var3;
          stackIn_6_1 = new StringBuilder().append("vr.Q(");
          if (param0 == null) {
            stackIn_7_2 = "null";
          } else {
            stackIn_7_2 = "{...}";
          }
          throw qo.a((Throwable) ((Object) stackIn_6_0), ((StringBuilder) (Object) stackIn_6_1).append(stackIn_7_2).append(',').append(param1).append(')').toString());
        }
    }

    public static void a(int param0) {
        field_G = null;
        field_F = null;
        if (param0 != -21433) {
          java.awt.Component var2 = (java.awt.Component) null;
          vr.a((java.awt.Component) null, -80);
        }
    }

    vr(v param0) {
        try {
          this.field_H = param0;
        } catch (RuntimeException runtimeException) {
          throw qo.a((Throwable) ((Object) runtimeException), "vr.<init>(" + (param0 != null ? "{...}" : "null") + ')');
        }
    }

    static {
        field_F = "This password contains your Player Name, and would be easy to guess";
    }
}
