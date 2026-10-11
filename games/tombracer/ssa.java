/*
 * Decompiled by CFR-JS 0.4.0.
 */
import java.io.*;

final class ssa {
    private iea field_c;
    private int[] field_a;
    private ha field_b;
    static String field_d;
    static jea field_g;
    private iea field_f;
    private nh field_e;

    final static void a(String param0, byte param1, Throwable param2) {
        try {
          fia stackIn_16_0;
          java.net.URL stackIn_16_1;
          java.net.URL stackIn_16_2;
          java.net.URL stackIn_16_3;
          StringBuilder stackIn_16_4;
          java.net.URL stackIn_17_1;
          java.net.URL stackIn_17_2;
          String stackIn_17_5;
          Throwable decompiledCaughtException = null;
          String var3 = null;
          Exception var3_ref = null;
          naa var4 = null;
          DataInputStream var5 = null;
          int var6 = 0;
          String var7 = null;
          String var8 = null;
          String var9 = null;
          String var10 = null;
          var6 = TombRacer.field_G ? 1 : 0;
          try {
            if (param1 < 112) {
              ssa.d(-5);
            }
            var3 = "";
            if (param2 != null) {
              var3 = qi.a(107, param2);
            }
            if (param0 != null) {
              if (param2 != null) {
                var3 = var3 + " | ";
              }
              var3 = var3 + param0;
            }
            upa.a(var3, (byte) -24);
            var7 = qf.a(966747152, "%3a", ":", var3);
            var8 = qf.a(966747152, "%40", "@", var7);
            var9 = qf.a(966747152, "%26", "&", var8);
            var10 = qf.a(966747152, "%23", "#", var9);
            if (dfa.field_e == null) {
              return;
            }
            stackIn_16_0 = nea.field_c;
            stackIn_16_1 = null;
            stackIn_16_2 = null;
            stackIn_16_3 = dfa.field_e.getCodeBase();
            stackIn_16_4 = new StringBuilder().append("clienterror.ws?c=").append(sua.field_L).append("&u=");
            if (toa.field_f != null) {
              stackIn_17_1 = null;
              stackIn_17_2 = null;
              stackIn_17_5 = toa.field_f;
            } else {
              stackIn_17_1 = null;
              stackIn_17_2 = null;
              stackIn_17_5 = "" + ic.field_b;
            }
            var4 = ((fia) (Object) stackIn_16_0).a(new java.net.URL(stackIn_16_3, ((StringBuilder) (Object) stackIn_16_4).append(stackIn_17_5).append("&v1=").append(fia.field_e).append("&v2=").append(fia.field_v).append("&e=").append(var10).toString()), 122);
            while (var4.field_b == 0) {
              vja.a(0, 1L);
            }
            if (1 == var4.field_b) {
              var5 = (DataInputStream) (var4.field_f);
              var5.read();
              var5.close();
            }
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

    private final void c(int param0) {
        iea var2 = null;
        this.field_b.K(this.field_a);
        if (param0 != -31138) {
          return;
        }
        if (null != this.field_f) {
          var2 = this.field_f;
          this.field_f = this.field_f.field_b;
        } else {
          var2 = new iea();
        }
        var2.a(this.field_a[3], this.field_a[2], this.field_a[1], this.field_a[0], this.field_c, this.field_e, param0 ^ -31170);
        this.field_c = var2;
    }

    final void a(int param0, int param1, byte param2, int param3, int param4) {
        this.c(param2 ^ 31146);
        this.field_b.T(param4, param1, param0, param3);
        if (param2 != -12) {
          this.c(-41);
        }
    }

    final void a(int param0) {
        if (this.field_e != this.field_c.field_a) {
          this.field_b.d();
          if (this.field_c.field_a != null) {
            this.field_b.a(this.field_c.field_a, true);
          }
          this.field_e = this.field_c.field_a;
        }
        this.field_b.KA(this.field_c.field_d, this.field_c.field_h, this.field_c.field_c, this.field_c.field_f);
        int var2 = -7 / ((param0 - 36) / 59);
        iea var3 = this.field_c;
        this.field_c = this.field_c.field_b;
        var3.field_b = this.field_f;
        var3.field_a = null;
        this.field_f = var3;
    }

    final static byte[] a(uia param0, int param1, boolean param2) throws Exception {
        int var10_int = 0;
        int[] array$0 = null;
        Object stackIn_5_0 = null;
        Object stackIn_47_0 = null;
        RuntimeException stackIn_50_0 = null;
        StringBuilder stackIn_50_1 = null;
        String stackIn_51_2 = null;
        RuntimeException decompiledCaughtException = null;
        int var3_int = 0;
        RuntimeException var3 = null;
        int var4 = 0;
        int var5 = 0;
        int var6 = 0;
        int var7 = 0;
        int[] var8 = null;
        int var9 = 0;
        Object var10 = null;
        int var11 = 0;
        int var12 = 0;
        int var13_int = 0;
        int[] var13 = null;
        int var14 = 0;
        int var15 = 0;
        int var16 = 0;
        int var17 = 0;
        int[] var19 = null;
        int[] var20 = null;
        uia var21 = null;
        uia var22 = null;
        byte[] var24 = null;
        int[] var25 = null;
        byte[] var27 = null;
        int[] var28 = null;
        int[] var31 = null;
        byte[] var32 = null;
        var17 = TombRacer.field_G ? 1 : 0;
        try {
          var4 = -82 % ((41 - param1) / 37);
          var3_int = param0.d(121);
          if (var3_int == 0) {
            if (!param2) {
              return null;
            }
            System.out.println("Loading funorbprofile local: blank");
            stackIn_5_0 = null;
            return (byte[]) (stackIn_5_0);
          }
          var5 = param0.field_h;
          var6 = var5 + var3_int;
          var7 = param0.d(126);
          if (2 < var7) {
            throw ssa.<RuntimeException>$cfr$sneakyThrow(new Exception("Local: header error: version=" + var7));
          }
          var28 = fqa.e(true);
          var25 = var28;
          var8 = var25;
          var31 = var8;
          for (var10_int = 0; var10_int < 8; var10_int++) {
            var31[var10_int] = 0;
          }
          if (var7 != 0) {
            if (1 == var7) {
              var19 = var8;
              var21 = param0;
              for (var11 = 0; var11 < 8; var11++) {
                var19[var11] = var21.e(100);
              }
            } else {
              var20 = var8;
              var22 = param0;
              var11 = var22.h(255);
              for (var12 = 0; var11 > var12; var12++) {
                var20[var12] = var22.e(-35);
              }
            }
          } else {
            var8[0] = param0.e(105);
          }
          var9 = param0.h(255);
          if (var9 > 0) {
            var10 = new int[var9][];
            var11 = 0;
            while (var11 < var9) {
              var12 = param0.field_h;
              do {
                var13_int = param0.h(255);
              } while (var13_int >= 128);
              array$0 = new int[31 + (-var12 + param0.field_h) * 7 >> 5];
              ((Object[]) (var10))[var11] = array$0;
              var13 = array$0;
              param0.field_h = var12;
              var14 = 0;
              var15 = 0;
              while (true) {
                var16 = param0.h(255);
                var13[var14] = var13[var14] + (sea.c(var16, 127) << var15);
                if (var15 >= 26) {
                  var13[var14 + 1] = var13[var14 + 1] + (sea.c(127, var16) >> -var15 + 32);
                }
                if (var16 < 128) {
                  var11++;
                  break;
                }
                var15 += 7;
                var14 = var14 + (var15 >> 5);
                var15 = var15 & 31;
              }
            }
          }
          var10 = null;
          if (param0.field_h < var6) {
            var11 = param0.h(255);
            if (var11 > 0) {
              var32 = new byte[var11];
              param0.a(var32, 0, -101, var11);
            }
            var12 = var6 - param0.field_h;
            if (0 < var12) {
              var27 = new byte[var12];
              var24 = var27;
              var10 = var24;
              param0.a(var27, 0, -93, var12);
            }
          }
          if (param0.field_h > var6) {
            throw ssa.<RuntimeException>$cfr$sneakyThrow(new Exception("Local: data overrun: start=" + var5 + " length=" + var3_int + " end=" + var6 + " overranto=" + param0.field_h));
          }
          if (param2) {
            System.out.println("Loading funorbprofile local: achievements=" + wg.a(0, var28));
          }
          stackIn_47_0 = var10;
          return (byte[]) (stackIn_47_0);
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3 = decompiledCaughtException;
          stackIn_50_0 = var3;
          stackIn_50_1 = new StringBuilder().append("ssa.B(");
          if (param0 == null) {
            stackIn_51_2 = "null";
          } else {
            stackIn_51_2 = "{...}";
          }
          throw tba.a((Throwable) ((Object) stackIn_50_0), ((StringBuilder) (Object) stackIn_50_1).append(stackIn_51_2).append(',').append(param1).append(',').append(param2).append(')').toString());
        }
    }

    ssa(ha param0) {
        this.field_e = null;
        this.field_a = new int[4];
        try {
          this.field_b = param0;
        } catch (RuntimeException runtimeException) {
          throw tba.a((Throwable) ((Object) runtimeException), "ssa.<init>(" + (param0 != null ? "{...}" : "null") + ')');
        }
    }

    final static void b(int param0) {
        int[] var1 = null;
        int var2 = 0;
        int var3 = 0;
        int var4 = 0;
        int[] var5 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var1_ref = null;
        var4 = TombRacer.field_G ? 1 : 0;
        try {
          var5 = ow.field_q;
          var1 = var5;
          var2 = param0;
          var3 = var5.length;
          while (var2 < var3) {
            var5[var2++] = 0;
            var5[var2++] = 0;
            var5[var2++] = 0;
            var5[var2++] = 0;
            var5[var2++] = 0;
            var5[var2++] = 0;
            var5[var2++] = 0;
            var5[var2++] = 0;
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var1_ref = decompiledCaughtException;
          throw tba.a((Throwable) ((Object) var1_ref), "ssa.E(" + param0 + ')');
        }
    }

    public static void d(int param0) {
        field_g = null;
        field_d = null;
        if (param0 > -89) {
          field_d = (String) null;
        }
    }

    static {
        field_d = "Names should contain a maximum of 12 characters";
    }

    @SuppressWarnings("unchecked")
    private static <T extends Throwable> RuntimeException $cfr$sneakyThrow(Throwable throwable) throws T {
        throw (T) throwable;
    }
}
