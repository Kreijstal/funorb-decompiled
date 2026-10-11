/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class gm extends kja {
    private phb field_N;
    static ij field_H;
    private int field_K;
    private eeb field_L;
    static byte[] field_M;
    static String field_I;
    private String field_J;

    final void a(int param0, int param1, int param2, shb param3) {
        try {
          this.field_K = this.field_K + 1;
          super.a(param0, param1, param2, param3);
        } catch (RuntimeException runtimeException) {
          throw rta.a((Throwable) ((Object) runtimeException), "gm.B(" + param0 + ',' + param1 + ',' + param2 + ',' + (param3 != null ? "{...}" : "null") + ')');
        }
    }

    public static void e(int param0) {
        field_M = null;
        field_I = null;
        if (param0 != -2459) {
          return;
        }
        field_H = null;
    }

    final void b(int param0, int param1, int param2, int param3) {
        String var5;
        qrb var6;
        int var13;
        Object var17;
        Object var21;
        Object var25;
        Object var30;
        int var9;
        int var10;
        int var11;
        int var12;
        phb var16;
        phb var18;
        phb var19;
        phb var20;
        phb var22;
        phb var23;
        phb var24;
        phb var26;
        phb var27;
        phb var28;
        phb var29;
        phb var31;
        phb var32;
        phb var33;
        at var34;
        at var35;
        at var36;
        at var37;
        int var9Lifetime1;
        int var9Lifetime2;
        int var10Lifetime1;
        int var10Lifetime2;
        int var11Lifetime1;
        int var11Lifetime2;
        int var11Lifetime3;
        int var12Lifetime1;
        int var12Lifetime2;
        int var12Lifetime3;
        int var9Lifetime3;
        int var10Lifetime3;
        int var11Lifetime4;
        int var12Lifetime4;
        qrb var6Lifetime1;
        qrb var6Lifetime2;
        qrb var6Lifetime3;
        qrb var6Lifetime1Lifetime1;
        var17 = null;
        var21 = null;
        var25 = null;
        var30 = null;
        var13 = VoidHunters.field_G;
        var6 = this.field_L.a((byte) 35);
        if (tg.field_p != var6 &&
          var6 != dsa.field_q) {
          var5 = this.field_L.c((byte) -79);
          if (var5 == null) {
            var5 = this.field_J;
          }
        } else {
          var5 = nga.field_c;
        }
        if (var5.equals(this.field_j)) {
          if (param2 < 47) {
            this.field_L = (eeb) null;
            super.b(param0, param1, 111, param3);
            var6Lifetime1 = this.field_L.a((byte) 35);
            var34 = (at) ((Object) this.field_q);
            var9 = param0 + this.field_g;
            var10 = var34.b(-3, param3, (shb) (this)) + (var34.a((shb) (this), 3).a(29565) >> 1);
            if (tg.field_p != var6Lifetime1 &&
              dsa.field_q != var6Lifetime1) {
              if (cca.field_o == var6Lifetime1) {
                var18 = ps.field_a[2];
                var18.c(var9, var10 - (var18.field_p >> 1), 256);
                return;
              }
              if (var6Lifetime1 != lea.field_o) {
                return;
              }
              var19 = ps.field_a[1];
              var19.c(var9, var10 - (var19.field_p >> 1), 256);
              return;
            }
            var20 = ps.field_a[0];
            var11 = var20.field_m << 1;
            var12 = var20.field_n << 1;
            if (this.field_N != null &&
              var11 <= this.field_N.field_q &&
              var12 <= this.field_N.field_p) {
              de.a(94, this.field_N);
              dma.a();
            } else {
              this.field_N = new phb(var11, var12);
              de.a(99, this.field_N);
            }
            var20.b(112, 144, var20.field_m << 4, var20.field_n << 4, -this.field_K << 10, 4096);
            bia.a((byte) 124);
            this.field_N.c(var9 - (var20.field_m >> 1), -var20.field_n + var10, 256);
            return;
          }
          super.b(param0, param1, 111, param3);
          var6Lifetime1Lifetime1 = this.field_L.a((byte) 35);
          var35 = (at) ((Object) this.field_q);
          var9Lifetime3 = param0 + this.field_g;
          var10Lifetime3 = var35.b(-3, param3, (shb) (this)) + (var35.a((shb) (this), 3).a(29565) >> 1);
          if (tg.field_p != var6Lifetime1Lifetime1 &&
            dsa.field_q != var6Lifetime1Lifetime1) {
            if (cca.field_o == var6Lifetime1Lifetime1) {
              var22 = ps.field_a[2];
              var22.c(var9Lifetime3, var10Lifetime3 - (var22.field_p >> 1), 256);
              return;
            }
            if (var6Lifetime1Lifetime1 != lea.field_o) {
              return;
            }
            var23 = ps.field_a[1];
            var23.c(var9Lifetime3, var10Lifetime3 - (var23.field_p >> 1), 256);
            return;
          }
          var24 = ps.field_a[0];
          var11Lifetime4 = var24.field_m << 1;
          var12Lifetime4 = var24.field_n << 1;
          if (this.field_N == null) {
            this.field_N = new phb(var11Lifetime4, var12Lifetime4);
            de.a(99, this.field_N);
          } else {
            if (var11Lifetime4 > this.field_N.field_q) {
              this.field_N = new phb(var11Lifetime4, var12Lifetime4);
              de.a(99, this.field_N);
            } else {
              if (var12Lifetime4 > this.field_N.field_p) {
                this.field_N = new phb(var11Lifetime4, var12Lifetime4);
                de.a(99, this.field_N);
              } else {
                de.a(94, this.field_N);
                dma.a();
              }
            }
          }
          var24.b(112, 144, var24.field_m << 4, var24.field_n << 4, -this.field_K << 10, 4096);
          bia.a((byte) 124);
          this.field_N.c(var9Lifetime3 - (var24.field_m >> 1), -var24.field_n + var10Lifetime3, 256);
          return;
        }
        this.field_j = var5;
        this.g((byte) 115);
        if (param2 >= 47) {
          super.b(param0, param1, 111, param3);
          var6Lifetime2 = this.field_L.a((byte) 35);
          var37 = (at) ((Object) this.field_q);
          var9Lifetime1 = param0 + this.field_g;
          var10Lifetime1 = var37.b(-3, param3, (shb) (this)) + (var37.a((shb) (this), 3).a(29565) >> 1);
          if (tg.field_p != var6Lifetime2 &&
            dsa.field_q != var6Lifetime2) {
            if (cca.field_o == var6Lifetime2) {
              var31 = ps.field_a[2];
              var31.c(var9Lifetime1, var10Lifetime1 - (var31.field_p >> 1), 256);
              return;
            }
            if (var6Lifetime2 != lea.field_o) {
              return;
            }
            var32 = ps.field_a[1];
            var32.c(var9Lifetime1, var10Lifetime1 - (var32.field_p >> 1), 256);
            return;
          }
          var33 = ps.field_a[0];
          var11Lifetime1 = var33.field_m << 1;
          var12Lifetime1 = var33.field_n << 1;
          if (this.field_N == null) {
            this.field_N = new phb(var11Lifetime1, var12Lifetime1);
            de.a(99, this.field_N);
          } else {
            if (var11Lifetime1 > this.field_N.field_q) {
              this.field_N = new phb(var11Lifetime1, var12Lifetime1);
              de.a(99, this.field_N);
            } else {
              if (var12Lifetime1 <= this.field_N.field_p) {
                de.a(94, this.field_N);
                dma.a();
              } else {
                this.field_N = new phb(var11Lifetime1, var12Lifetime1);
                de.a(99, this.field_N);
              }
            }
          }
          var33.b(112, 144, var33.field_m << 4, var33.field_n << 4, -this.field_K << 10, 4096);
          bia.a((byte) 124);
          this.field_N.c(var9Lifetime1 - (var33.field_m >> 1), -var33.field_n + var10Lifetime1, 256);
          return;
        }
        this.field_L = (eeb) null;
        super.b(param0, param1, 111, param3);
        var6Lifetime3 = this.field_L.a((byte) 35);
        var36 = (at) ((Object) this.field_q);
        var9Lifetime2 = param0 + this.field_g;
        var10Lifetime2 = var36.b(-3, param3, (shb) (this)) + (var36.a((shb) (this), 3).a(29565) >> 1);
        if (tg.field_p == var6Lifetime3) {
          var26 = ps.field_a[0];
          var11Lifetime2 = var26.field_m << 1;
          var12Lifetime2 = var26.field_n << 1;
          if (this.field_N != null &&
            var11Lifetime2 <= this.field_N.field_q &&
            var12Lifetime2 <= this.field_N.field_p) {
            de.a(94, this.field_N);
            dma.a();
          } else {
            this.field_N = new phb(var11Lifetime2, var12Lifetime2);
            de.a(99, this.field_N);
          }
          var26.b(112, 144, var26.field_m << 4, var26.field_n << 4, -this.field_K << 10, 4096);
          bia.a((byte) 124);
          this.field_N.c(var9Lifetime2 - (var26.field_m >> 1), -var26.field_n + var10Lifetime2, 256);
          return;
        }
        if (dsa.field_q != var6Lifetime3) {
          if (cca.field_o == var6Lifetime3) {
            var27 = ps.field_a[2];
            var27.c(var9Lifetime2, var10Lifetime2 - (var27.field_p >> 1), 256);
            return;
          }
          if (var6Lifetime3 != lea.field_o) {
            return;
          }
          var28 = ps.field_a[1];
          var28.c(var9Lifetime2, var10Lifetime2 - (var28.field_p >> 1), 256);
          return;
        }
        var29 = ps.field_a[0];
        var16 = var29;
        var11Lifetime3 = var29.field_m << 1;
        var12Lifetime3 = var29.field_n << 1;
        if (this.field_N == null) {
          this.field_N = new phb(var11Lifetime3, var12Lifetime3);
          de.a(99, this.field_N);
        } else {
          if (var11Lifetime3 > this.field_N.field_q) {
            this.field_N = new phb(var11Lifetime3, var12Lifetime3);
            de.a(99, this.field_N);
          } else {
            if (var12Lifetime3 > this.field_N.field_p) {
              this.field_N = new phb(var11Lifetime3, var12Lifetime3);
              de.a(99, this.field_N);
            } else {
              de.a(94, this.field_N);
              dma.a();
            }
          }
        }
        var29.b(112, 144, var29.field_m << 4, var29.field_n << 4, -this.field_K << 10, 4096);
        bia.a((byte) 124);
        this.field_N.c(var9Lifetime2 - (var29.field_m >> 1), -var29.field_n + var10Lifetime2, 256);
        return;
    }

    final boolean a(int param0, shb param1) {
        RuntimeException var3 = null;
        RuntimeException stackIn_6_0 = null;
        StringBuilder stackIn_6_1 = null;
        String stackIn_7_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          if (param0 == 0) {
            return false;
          }
          field_H = (ij) null;
          return false;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3 = decompiledCaughtException;
          stackIn_6_0 = var3;
          stackIn_6_1 = new StringBuilder().append("gm.A(").append(param0).append(',');
          if (param1 == null) {
            stackIn_7_2 = "null";
          } else {
            stackIn_7_2 = "{...}";
          }
          throw rta.a((Throwable) ((Object) stackIn_6_0), ((StringBuilder) (Object) stackIn_6_1).append(stackIn_7_2).append(')').toString());
        }
    }

    final String d(byte param0) {
        if (param0 == 125) {
          return null;
        }
        this.field_J = (String) null;
        return null;
    }

    final static int a(uja param0, int param1) {
        RuntimeException var2 = null;
        int stackIn_2_0 = 0;
        int stackIn_7_0 = 0;
        int stackIn_9_0 = 0;
        RuntimeException stackIn_15_0 = null;
        StringBuilder stackIn_15_1 = null;
        String stackIn_16_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          if (rpa.field_c == param0) {
            stackIn_2_0 = 9216;
            return stackIn_2_0;
          }
          if (param0 == tea.field_d) {
            stackIn_9_0 = 34065;
            return stackIn_9_0;
          }
          if (param0 == tma.field_p) {
            stackIn_7_0 = 34066;
            return stackIn_7_0;
          }
          if (param1 != 9216) {
            field_H = (ij) null;
          }
          throw new IllegalArgumentException();
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2 = decompiledCaughtException;
          stackIn_15_0 = var2;
          stackIn_15_1 = new StringBuilder().append("gm.L(");
          if (param0 == null) {
            stackIn_16_2 = "null";
          } else {
            stackIn_16_2 = "{...}";
          }
          throw rta.a((Throwable) ((Object) stackIn_15_0), ((StringBuilder) (Object) stackIn_15_1).append(stackIn_16_2).append(',').append(param1).append(')').toString());
        }
    }

    gm(eeb param0, String param1, int param2, int param3, int param4, int param5) {
        super(param1, cfa.b((byte) -111));
        try {
          this.field_J = param1;
          this.field_L = param0;
          this.a(param2, param4, param5, 1, param3);
        } catch (RuntimeException runtimeException) {
          throw rta.a((Throwable) ((Object) runtimeException), "gm.<init>(" + (param0 != null ? "{...}" : "null") + ',' + (param1 != null ? "{...}" : "null") + ',' + param2 + ',' + param3 + ',' + param4 + ',' + param5 + ')');
        }
    }

    static {
        field_H = new ij();
        field_I = "Stingray chassis";
    }
}
