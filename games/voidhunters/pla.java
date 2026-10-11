/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class pla extends htb {
    private int field_B;
    private eeb field_C;

    final void b(int param0, int param1, int param2, int param3) {
        phb var15 = null;
        phb var16 = null;
        phb var13 = null;
        phb var12 = null;
        int var9 = 0;
        int var10 = 0;
        int var11 = VoidHunters.field_G;
        int var9Lifetime1;
        int var10Lifetime1;
        super.b(param0, param1, 56, param3);
        if (param1 != 0) {
          return;
        }
        int var5 = param0 - (-this.field_g - (this.field_h >> 1));
        int var6 = (this.field_f >> 1) + (this.field_r + param3);
        if (param2 < 47) {
          return;
        }
        qrb var8 = this.field_C.a((byte) 35);
        if (tg.field_p == var8) {
          var15 = ps.field_a[0];
          var9 = var15.field_m << 1;
          var10 = var15.field_n << 1;
          if (mi.field_o == null) {
            mi.field_o = new phb(var9, var10);
            de.a(26, mi.field_o);
            var15.b(112, 144, var15.field_m << 4, var15.field_n << 4, -this.field_B << 10, 4096);
            bia.a((byte) 124);
            mi.field_o.c(-var15.field_m + var5, -var15.field_n + var6, 256);
            return;
          }
          if (mi.field_o.field_q < var9) {
            mi.field_o = new phb(var9, var10);
            de.a(26, mi.field_o);
            var15.b(112, 144, var15.field_m << 4, var15.field_n << 4, -this.field_B << 10, 4096);
            bia.a((byte) 124);
            mi.field_o.c(-var15.field_m + var5, -var15.field_n + var6, 256);
            return;
          }
          if (var10 > mi.field_o.field_p) {
            mi.field_o = new phb(var9, var10);
            de.a(26, mi.field_o);
            var15.b(112, 144, var15.field_m << 4, var15.field_n << 4, -this.field_B << 10, 4096);
            bia.a((byte) 124);
            mi.field_o.c(-var15.field_m + var5, -var15.field_n + var6, 256);
            return;
          }
          de.a(85, mi.field_o);
          dma.a();
          var15.b(112, 144, var15.field_m << 4, var15.field_n << 4, -this.field_B << 10, 4096);
          bia.a((byte) 124);
          mi.field_o.c(-var15.field_m + var5, -var15.field_n + var6, 256);
          return;
        }
        if (dsa.field_q == var8) {
          var16 = ps.field_a[0];
          var9Lifetime1 = var16.field_m << 1;
          var10Lifetime1 = var16.field_n << 1;
          if (mi.field_o == null) {
            mi.field_o = new phb(var9Lifetime1, var10Lifetime1);
            de.a(26, mi.field_o);
            var16.b(112, 144, var16.field_m << 4, var16.field_n << 4, -this.field_B << 10, 4096);
            bia.a((byte) 124);
            mi.field_o.c(-var16.field_m + var5, -var16.field_n + var6, 256);
            return;
          }
          if (mi.field_o.field_q < var9Lifetime1) {
            mi.field_o = new phb(var9Lifetime1, var10Lifetime1);
            de.a(26, mi.field_o);
            var16.b(112, 144, var16.field_m << 4, var16.field_n << 4, -this.field_B << 10, 4096);
            bia.a((byte) 124);
            mi.field_o.c(-var16.field_m + var5, -var16.field_n + var6, 256);
            return;
          }
          if (var10Lifetime1 > mi.field_o.field_p) {
            mi.field_o = new phb(var9Lifetime1, var10Lifetime1);
            de.a(26, mi.field_o);
            var16.b(112, 144, var16.field_m << 4, var16.field_n << 4, -this.field_B << 10, 4096);
            bia.a((byte) 124);
            mi.field_o.c(-var16.field_m + var5, -var16.field_n + var6, 256);
            return;
          }
          de.a(85, mi.field_o);
          dma.a();
          var16.b(112, 144, var16.field_m << 4, var16.field_n << 4, -this.field_B << 10, 4096);
          bia.a((byte) 124);
          mi.field_o.c(-var16.field_m + var5, -var16.field_n + var6, 256);
          return;
        }
        if (var8 == cca.field_o) {
          var13 = ps.field_a[2];
          var13.c(var5 - (var13.field_q >> 1), var6 - (var13.field_p >> 1), 256);
          return;
        }
        if (lea.field_o == var8) {
          var12 = ps.field_a[1];
          var12.c(var5 - (var12.field_q >> 1), var6 - (var12.field_p >> 1), 256);
          return;
        }
    }

    final static void a(int param0) {
        if (!cgb.field_a) {
          throw new IllegalStateException();
        }
        djb.field_r = true;
        aka.a(false, param0 - 122);
        qmb.field_q = param0;
    }

    final String d(byte param0) {
        if (this.field_e) {
          return this.field_C.c((byte) -79);
        }
        if (param0 == 125) {
          return null;
        }
        return (String) null;
    }

    final boolean a(int param0, shb param1) {
        RuntimeException var3 = null;
        RuntimeException stackIn_7_0 = null;
        StringBuilder stackIn_7_1 = null;
        String stackIn_8_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          if (param0 == 0) {
            return false;
          }
          return true;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3 = decompiledCaughtException;
          stackIn_7_0 = var3;
          stackIn_7_1 = new StringBuilder().append("pla.A(").append(param0).append(',');
          if (param1 == null) {
            stackIn_8_2 = "null";
          } else {
            stackIn_8_2 = "{...}";
          }
          throw rta.a((Throwable) ((Object) stackIn_7_0), ((StringBuilder) (Object) stackIn_7_1).append(stackIn_8_2).append(')').toString());
        }
    }

    final void a(int param0, int param1, int param2, shb param3) {
        try {
          this.field_B = this.field_B + 1;
          super.a(param0, param1, param2, param3);
        } catch (RuntimeException runtimeException) {
          throw rta.a((Throwable) ((Object) runtimeException), "pla.B(" + param0 + ',' + param1 + ',' + param2 + ',' + (param3 != null ? "{...}" : "null") + ')');
        }
    }

    final static boolean a(int param0, int param1) {
        if (param1 != -4) {
          return false;
        }
        if (param0 == 3) {
          return true;
        }
        if (param0 != 12) {
          return false;
        }
        return true;
    }

    pla(eeb param0) {
        try {
          this.field_C = param0;
        } catch (RuntimeException runtimeException) {
          throw rta.a((Throwable) ((Object) runtimeException), "pla.<init>(" + (param0 != null ? "{...}" : "null") + ')');
        }
    }

    static {
    }
}
