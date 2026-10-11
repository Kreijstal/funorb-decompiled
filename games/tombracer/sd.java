/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class sd extends lga {
    static int field_K;
    private nua field_I;
    static String field_J;
    private int field_F;
    private iu field_H;
    static int field_G;
    private String field_E;

    final static int a(char param0, byte param1, CharSequence param2) {
        int var5 = 0;
        int var3_int = 0;
        int var4 = 0;
        int var6 = 0;
        int stackIn_11_0 = 0;
        RuntimeException stackIn_14_0 = null;
        StringBuilder stackIn_14_1 = null;
        String stackIn_15_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var3 = null;
        var6 = TombRacer.field_G ? 1 : 0;
        try {
          var3_int = 0;
          var4 = param2.length();
          for (var5 = 0; var4 > var5; var5++) {
            if (param2.charAt(var5) == param0) {
              var3_int++;
            }
          }
          if (param1 != 93) {
            field_G = 37;
          }
          stackIn_11_0 = var3_int;
          return stackIn_11_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3 = decompiledCaughtException;
          stackIn_14_0 = var3;
          stackIn_14_1 = new StringBuilder().append("sd.F(").append(param0).append(',').append(param1).append(',');
          if (param2 == null) {
            stackIn_15_2 = "null";
          } else {
            stackIn_15_2 = "{...}";
          }
          throw tba.a((Throwable) ((Object) stackIn_14_0), ((StringBuilder) (Object) stackIn_14_1).append(stackIn_15_2).append(')').toString());
        }
    }

    final boolean a(ae param0, boolean param1) {
        RuntimeException var3 = null;
        CharSequence var4 = null;
        RuntimeException stackIn_6_0 = null;
        StringBuilder stackIn_6_1 = null;
        String stackIn_7_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          if (!param1) {
            return false;
          }
          var4 = (CharSequence) null;
          sd.a('+', (byte) -127, (CharSequence) null);
          return false;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3 = decompiledCaughtException;
          stackIn_6_0 = var3;
          stackIn_6_1 = new StringBuilder().append("sd.S(");
          if (param0 == null) {
            stackIn_7_2 = "null";
          } else {
            stackIn_7_2 = "{...}";
          }
          throw tba.a((Throwable) ((Object) stackIn_6_0), ((StringBuilder) (Object) stackIn_6_1).append(stackIn_7_2).append(',').append(param1).append(')').toString());
        }
    }

    final void a(int param0, int param1, ae param2, int param3) {
        try {
          this.field_F = this.field_F + 1;
          super.a(param0, param1, param2, param3);
        } catch (RuntimeException runtimeException) {
          throw tba.a((Throwable) ((Object) runtimeException), "sd.A(" + param0 + ',' + param1 + ',' + (param2 != null ? "{...}" : "null") + ',' + param3 + ')');
        }
    }

    final void a(int param0, int param1, int param2, int param3) {
        it var6;
        int var9;
        int var10;
        int var13;
        String var17;
        Object var18;
        iu var19;
        iu var20;
        Object var22;
        Object var27;
        Object var31;
        Object var36;
        Object var40;
        Object var44;
        Object var50;
        oaa var54;
        String var5;
        int var11;
        int var12;
        iu var16;
        iu var21;
        iu var23;
        iu var24;
        iu var25;
        String var26;
        iu var28;
        iu var29;
        iu var30;
        iu var32;
        iu var33;
        iu var34;
        String var35;
        iu var37;
        iu var38;
        iu var39;
        iu var41;
        iu var42;
        iu var43;
        iu var45;
        iu var46;
        iu var47;
        iu var51;
        iu var52;
        iu var53;
        oaa var55;
        oaa var56;
        oaa var57;
        oaa var58;
        oaa var59;
        oaa var60;
        oaa var61;
        int var9Lifetime1;
        int var9Lifetime2;
        int var9Lifetime3;
        int var9Lifetime4;
        int var10Lifetime1;
        int var10Lifetime2;
        int var10Lifetime3;
        int var10Lifetime4;
        int var11Lifetime1;
        int var11Lifetime2;
        int var11Lifetime3;
        int var11Lifetime4;
        int var12Lifetime1;
        int var12Lifetime2;
        int var12Lifetime3;
        int var12Lifetime4;
        int var9Lifetime5;
        int var10Lifetime5;
        int var11Lifetime5;
        int var12Lifetime5;
        int var9Lifetime1Lifetime1;
        int var9Lifetime2Lifetime1;
        int var10Lifetime1Lifetime1;
        int var10Lifetime2Lifetime1;
        int var11Lifetime1Lifetime1;
        int var11Lifetime2Lifetime1;
        int var12Lifetime1Lifetime1;
        int var12Lifetime2Lifetime1;
        it var6Lifetime1;
        it var6Lifetime2;
        it var6Lifetime3;
        String var5Lifetime1;
        it var6Lifetime1Lifetime1;
        var18 = null;
        var22 = null;
        var27 = null;
        var31 = null;
        var36 = null;
        var40 = null;
        var44 = null;
        var50 = null;
        var13 = TombRacer.field_G ? 1 : 0;
        var6 = this.field_I.b(-4666);
        if (var6 == gla.field_p) {
          var17 = ko.field_g;
          if (!var17.equals(this.field_o)) {
            this.field_o = var17;
            this.b(18758);
            super.a(param0, param1, param2, param3);
            var6 = this.field_I.b(-4666);
            var54 = (oaa) ((Object) this.field_r);
            var9 = this.field_i + param0;
            var10 = var54.a(param1, (ae) (this), (byte) -89) + (var54.a((ae) (this), 14157).b(param2 - 117) >> 1);
            if (gla.field_p != var6 &&
              var6 != tea.field_b) {
              if (fp.field_c == var6) {
                var19 = pq.field_b[2];
                var19.a(var9, -(var19.field_q >> 1) + var10, 256);
                return;
              }
              if (var6 != uh.field_k) {
                return;
              }
              var20 = pq.field_b[1];
              var20.a(var9, -(var20.field_q >> 1) + var10, 256);
              return;
            }
            var21 = pq.field_b[0];
            var11 = var21.field_n << 1;
            var12 = var21.field_k << 1;
            if (this.field_H != null &&
              this.field_H.field_m >= var11 &&
              var12 <= this.field_H.field_q) {
              nm.a(this.field_H, (byte) 120);
              bea.a();
            } else {
              this.field_H = new iu(var11, var12);
              nm.a(this.field_H, (byte) 121);
            }
            var21.a(112, 144, var21.field_n << 4, var21.field_k << 4, -this.field_F << 10, 4096);
            pfa.a(1);
            this.field_H.a(var9 - (var21.field_n >> 1), var10 - var21.field_k, 256);
            return;
          }
          super.a(param0, param1, param2, param3);
          var6 = this.field_I.b(-4666);
          var55 = (oaa) ((Object) this.field_r);
          var9Lifetime5 = this.field_i + param0;
          var10Lifetime5 = var55.a(param1, (ae) (this), (byte) -89) + (var55.a((ae) (this), 14157).b(param2 - 117) >> 1);
          if (gla.field_p != var6 &&
            var6 != tea.field_b) {
            if (fp.field_c == var6) {
              var23 = pq.field_b[2];
              var23.a(var9Lifetime5, -(var23.field_q >> 1) + var10Lifetime5, 256);
              return;
            }
            if (var6 != uh.field_k) {
              return;
            }
            var24 = pq.field_b[1];
            var24.a(var9Lifetime5, -(var24.field_q >> 1) + var10Lifetime5, 256);
            return;
          }
          var25 = pq.field_b[0];
          var11Lifetime5 = var25.field_n << 1;
          var12Lifetime5 = var25.field_k << 1;
          if (this.field_H == null) {
            this.field_H = new iu(var11Lifetime5, var12Lifetime5);
            nm.a(this.field_H, (byte) 121);
          } else {
            if (this.field_H.field_m < var11Lifetime5) {
              this.field_H = new iu(var11Lifetime5, var12Lifetime5);
              nm.a(this.field_H, (byte) 121);
            } else {
              if (var12Lifetime5 <= this.field_H.field_q) {
                nm.a(this.field_H, (byte) 120);
                bea.a();
              } else {
                this.field_H = new iu(var11Lifetime5, var12Lifetime5);
                nm.a(this.field_H, (byte) 121);
              }
            }
          }
          var25.a(112, 144, var25.field_n << 4, var25.field_k << 4, -this.field_F << 10, 4096);
          pfa.a(1);
          this.field_H.a(var9Lifetime5 - (var25.field_n >> 1), var10Lifetime5 - var25.field_k, 256);
          return;
        }
        if (tea.field_b == var6) {
          var26 = ko.field_g;
          if (!var26.equals(this.field_o)) {
            this.field_o = var26;
            this.b(18758);
            super.a(param0, param1, param2, param3);
            var6 = this.field_I.b(-4666);
            var56 = (oaa) ((Object) this.field_r);
            var9Lifetime1 = this.field_i + param0;
            var10Lifetime1 = var56.a(param1, (ae) (this), (byte) -89) + (var56.a((ae) (this), 14157).b(param2 - 117) >> 1);
            if (gla.field_p != var6 &&
              var6 != tea.field_b) {
              if (fp.field_c == var6) {
                var28 = pq.field_b[2];
                var28.a(var9Lifetime1, -(var28.field_q >> 1) + var10Lifetime1, 256);
                return;
              }
              if (var6 != uh.field_k) {
                return;
              }
              var29 = pq.field_b[1];
              var29.a(var9Lifetime1, -(var29.field_q >> 1) + var10Lifetime1, 256);
              return;
            }
            var30 = pq.field_b[0];
            var11Lifetime1 = var30.field_n << 1;
            var12Lifetime1 = var30.field_k << 1;
            if (this.field_H != null &&
              this.field_H.field_m >= var11Lifetime1 &&
              var12Lifetime1 <= this.field_H.field_q) {
              nm.a(this.field_H, (byte) 120);
              bea.a();
            } else {
              this.field_H = new iu(var11Lifetime1, var12Lifetime1);
              nm.a(this.field_H, (byte) 121);
            }
            var30.a(112, 144, var30.field_n << 4, var30.field_k << 4, -this.field_F << 10, 4096);
            pfa.a(1);
            this.field_H.a(var9Lifetime1 - (var30.field_n >> 1), var10Lifetime1 - var30.field_k, 256);
            return;
          }
          super.a(param0, param1, param2, param3);
          var6 = this.field_I.b(-4666);
          var57 = (oaa) ((Object) this.field_r);
          var9Lifetime1Lifetime1 = this.field_i + param0;
          var10Lifetime1Lifetime1 = var57.a(param1, (ae) (this), (byte) -89) + (var57.a((ae) (this), 14157).b(param2 - 117) >> 1);
          if (gla.field_p != var6 &&
            var6 != tea.field_b) {
            if (fp.field_c == var6) {
              var32 = pq.field_b[2];
              var32.a(var9Lifetime1Lifetime1, -(var32.field_q >> 1) + var10Lifetime1Lifetime1, 256);
              return;
            }
            if (var6 != uh.field_k) {
              return;
            }
            var33 = pq.field_b[1];
            var33.a(var9Lifetime1Lifetime1, -(var33.field_q >> 1) + var10Lifetime1Lifetime1, 256);
            return;
          }
          var34 = pq.field_b[0];
          var11Lifetime1Lifetime1 = var34.field_n << 1;
          var12Lifetime1Lifetime1 = var34.field_k << 1;
          if (this.field_H == null) {
            this.field_H = new iu(var11Lifetime1Lifetime1, var12Lifetime1Lifetime1);
            nm.a(this.field_H, (byte) 121);
          } else {
            if (this.field_H.field_m < var11Lifetime1Lifetime1) {
              this.field_H = new iu(var11Lifetime1Lifetime1, var12Lifetime1Lifetime1);
              nm.a(this.field_H, (byte) 121);
            } else {
              if (var12Lifetime1Lifetime1 <= this.field_H.field_q) {
                nm.a(this.field_H, (byte) 120);
                bea.a();
              } else {
                this.field_H = new iu(var11Lifetime1Lifetime1, var12Lifetime1Lifetime1);
                nm.a(this.field_H, (byte) 121);
              }
            }
          }
          var34.a(112, 144, var34.field_n << 4, var34.field_k << 4, -this.field_F << 10, 4096);
          pfa.a(1);
          this.field_H.a(var9Lifetime1Lifetime1 - (var34.field_n >> 1), var10Lifetime1Lifetime1 - var34.field_k, 256);
          return;
        }
        var5 = this.field_I.a(101);
        if (var5 != null) {
          if (var5.equals(this.field_o)) {
            super.a(param0, param1, param2, param3);
            var6Lifetime1 = this.field_I.b(-4666);
            var61 = (oaa) ((Object) this.field_r);
            var9Lifetime2 = this.field_i + param0;
            var10Lifetime2 = var61.a(param1, (ae) (this), (byte) -89) + (var61.a((ae) (this), 14157).b(param2 - 117) >> 1);
            if (gla.field_p != var6Lifetime1 &&
              var6Lifetime1 != tea.field_b) {
              if (fp.field_c == var6Lifetime1) {
                var51 = pq.field_b[2];
                var51.a(var9Lifetime2, -(var51.field_q >> 1) + var10Lifetime2, 256);
                return;
              }
              if (var6Lifetime1 != uh.field_k) {
                return;
              }
              var52 = pq.field_b[1];
              var52.a(var9Lifetime2, -(var52.field_q >> 1) + var10Lifetime2, 256);
              return;
            }
            var53 = pq.field_b[0];
            var11Lifetime2 = var53.field_n << 1;
            var12Lifetime2 = var53.field_k << 1;
            if (this.field_H != null &&
              this.field_H.field_m >= var11Lifetime2 &&
              var12Lifetime2 <= this.field_H.field_q) {
              nm.a(this.field_H, (byte) 120);
              bea.a();
            } else {
              this.field_H = new iu(var11Lifetime2, var12Lifetime2);
              nm.a(this.field_H, (byte) 121);
            }
            var53.a(112, 144, var53.field_n << 4, var53.field_k << 4, -this.field_F << 10, 4096);
            pfa.a(1);
            this.field_H.a(var9Lifetime2 - (var53.field_n >> 1), var10Lifetime2 - var53.field_k, 256);
            return;
          }
          this.field_o = var5;
          this.b(18758);
          super.a(param0, param1, param2, param3);
          var6Lifetime1Lifetime1 = this.field_I.b(-4666);
          var60 = (oaa) ((Object) this.field_r);
          var9Lifetime2Lifetime1 = this.field_i + param0;
          var10Lifetime2Lifetime1 = var60.a(param1, (ae) (this), (byte) -89) + (var60.a((ae) (this), 14157).b(param2 - 117) >> 1);
          if (gla.field_p != var6Lifetime1Lifetime1 &&
            var6Lifetime1Lifetime1 != tea.field_b) {
            if (fp.field_c == var6Lifetime1Lifetime1) {
              var45 = pq.field_b[2];
              var45.a(var9Lifetime2Lifetime1, -(var45.field_q >> 1) + var10Lifetime2Lifetime1, 256);
              return;
            }
            if (var6Lifetime1Lifetime1 != uh.field_k) {
              return;
            }
            var46 = pq.field_b[1];
            var46.a(var9Lifetime2Lifetime1, -(var46.field_q >> 1) + var10Lifetime2Lifetime1, 256);
            return;
          }
          var47 = pq.field_b[0];
          var16 = var47;
          var11Lifetime2Lifetime1 = var47.field_n << 1;
          var12Lifetime2Lifetime1 = var47.field_k << 1;
          if (this.field_H == null) {
            this.field_H = new iu(var11Lifetime2Lifetime1, var12Lifetime2Lifetime1);
            nm.a(this.field_H, (byte) 121);
          } else {
            if (this.field_H.field_m < var11Lifetime2Lifetime1) {
              this.field_H = new iu(var11Lifetime2Lifetime1, var12Lifetime2Lifetime1);
              nm.a(this.field_H, (byte) 121);
            } else {
              if (var12Lifetime2Lifetime1 <= this.field_H.field_q) {
                nm.a(this.field_H, (byte) 120);
                bea.a();
              } else {
                this.field_H = new iu(var11Lifetime2Lifetime1, var12Lifetime2Lifetime1);
                nm.a(this.field_H, (byte) 121);
              }
            }
          }
          var47.a(112, 144, var47.field_n << 4, var47.field_k << 4, -this.field_F << 10, 4096);
          pfa.a(1);
          this.field_H.a(var9Lifetime2Lifetime1 - (var47.field_n >> 1), var10Lifetime2Lifetime1 - var47.field_k, 256);
          return;
        }
        var35 = this.field_E;
        var5Lifetime1 = var35;
        if (!var35.equals(this.field_o)) {
          this.field_o = var35;
          this.b(18758);
          super.a(param0, param1, param2, param3);
          var6Lifetime2 = this.field_I.b(-4666);
          var58 = (oaa) ((Object) this.field_r);
          var9Lifetime3 = this.field_i + param0;
          var10Lifetime3 = var58.a(param1, (ae) (this), (byte) -89) + (var58.a((ae) (this), 14157).b(param2 - 117) >> 1);
          if (gla.field_p != var6Lifetime2 &&
            var6Lifetime2 != tea.field_b) {
            if (fp.field_c == var6Lifetime2) {
              var37 = pq.field_b[2];
              var37.a(var9Lifetime3, -(var37.field_q >> 1) + var10Lifetime3, 256);
              return;
            }
            if (var6Lifetime2 != uh.field_k) {
              return;
            }
            var38 = pq.field_b[1];
            var38.a(var9Lifetime3, -(var38.field_q >> 1) + var10Lifetime3, 256);
            return;
          }
          var39 = pq.field_b[0];
          var11Lifetime3 = var39.field_n << 1;
          var12Lifetime3 = var39.field_k << 1;
          if (this.field_H != null &&
            this.field_H.field_m >= var11Lifetime3 &&
            var12Lifetime3 <= this.field_H.field_q) {
            nm.a(this.field_H, (byte) 120);
            bea.a();
          } else {
            this.field_H = new iu(var11Lifetime3, var12Lifetime3);
            nm.a(this.field_H, (byte) 121);
          }
          var39.a(112, 144, var39.field_n << 4, var39.field_k << 4, -this.field_F << 10, 4096);
          pfa.a(1);
          this.field_H.a(var9Lifetime3 - (var39.field_n >> 1), var10Lifetime3 - var39.field_k, 256);
          return;
        }
        super.a(param0, param1, param2, param3);
        var6Lifetime3 = this.field_I.b(-4666);
        var59 = (oaa) ((Object) this.field_r);
        var9Lifetime4 = this.field_i + param0;
        var10Lifetime4 = var59.a(param1, (ae) (this), (byte) -89) + (var59.a((ae) (this), 14157).b(param2 - 117) >> 1);
        if (gla.field_p != var6Lifetime3 &&
          var6Lifetime3 != tea.field_b) {
          if (fp.field_c == var6Lifetime3) {
            var41 = pq.field_b[2];
            var41.a(var9Lifetime4, -(var41.field_q >> 1) + var10Lifetime4, 256);
            return;
          }
          if (var6Lifetime3 != uh.field_k) {
            return;
          }
          var42 = pq.field_b[1];
          var42.a(var9Lifetime4, -(var42.field_q >> 1) + var10Lifetime4, 256);
          return;
        }
        var43 = pq.field_b[0];
        var11Lifetime4 = var43.field_n << 1;
        var12Lifetime4 = var43.field_k << 1;
        if (this.field_H == null) {
          this.field_H = new iu(var11Lifetime4, var12Lifetime4);
          nm.a(this.field_H, (byte) 121);
        } else {
          if (this.field_H.field_m < var11Lifetime4) {
            this.field_H = new iu(var11Lifetime4, var12Lifetime4);
            nm.a(this.field_H, (byte) 121);
          } else {
            if (var12Lifetime4 > this.field_H.field_q) {
              this.field_H = new iu(var11Lifetime4, var12Lifetime4);
              nm.a(this.field_H, (byte) 121);
            } else {
              nm.a(this.field_H, (byte) 120);
              bea.a();
            }
          }
        }
        var43.a(112, 144, var43.field_n << 4, var43.field_k << 4, -this.field_F << 10, 4096);
        pfa.a(1);
        this.field_H.a(var9Lifetime4 - (var43.field_n >> 1), var10Lifetime4 - var43.field_k, 256);
        return;
    }

    sd(nua param0, String param1, int param2, int param3, int param4, int param5) {
        super(param1, nk.a(-21819));
        try {
          this.field_I = param0;
          this.field_E = param1;
          this.a((byte) -31, param4, param5, param2, param3);
        } catch (RuntimeException runtimeException) {
          throw tba.a((Throwable) ((Object) runtimeException), "sd.<init>(" + (param0 != null ? "{...}" : "null") + ',' + (param1 != null ? "{...}" : "null") + ',' + param2 + ',' + param3 + ',' + param4 + ',' + param5 + ')');
        }
    }

    public static void g(byte param0) {
        if (param0 != 10) {
          field_J = (String) null;
          field_J = null;
          return;
        }
        field_J = null;
    }

    final String d(byte param0) {
        int var2 = -89 / ((param0 + 58) / 60);
        return null;
    }

    static {
        field_J = "ESC - cancel this line";
    }
}
