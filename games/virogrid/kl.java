/*
 * Decompiled by CFR-JS 0.4.0.
 */
import java.io.*;

final class kl extends fd implements ta {
    private String[] field_H;
    private tg[] field_F;
    private fc field_G;
    static int field_E;

    final static void a(byte param0, int param1) {
        int var3 = 0;
        dh var4 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var2 = null;
        var3 = Virogrid.field_F ? 1 : 0;
        try {
          var4 = (dh) (bl.field_D.a((byte) -99));
          if (param0 > -18) {
            field_E = 67;
          }
          while (var4 != null) {
            gl.a(var4, (byte) 111, param1);
            var4 = (dh) (bl.field_D.a(16213));
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2 = decompiledCaughtException;
          throw kg.a((Throwable) ((Object) var2), "kl.A(" + param0 + ',' + param1 + ')');
        }
    }

    final void a(String[] param0, byte param1) {
        int var4_int = 0;
        int var5 = 0;
        RuntimeException stackIn_18_0 = null;
        StringBuilder stackIn_18_1 = null;
        String stackIn_19_2 = null;
        RuntimeException decompiledCaughtException = null;
        int var3_int = 0;
        RuntimeException var3 = null;
        ti var4 = null;
        int var6 = 0;
        var6 = Virogrid.field_F ? 1 : 0;
        try {
          if (param1 < 13) {
            return;
          }
          this.field_z.a(false);
          if (param0 != null &&
            param0.length != 0) {
            var3_int = param0.length;
            this.field_H = new String[var3_int];
            for (var4_int = 0; var3_int > var4_int; var4_int++) {
              this.field_H[var4_int] = ji.a(11, (CharSequence) ((Object) param0[var4_int])).replace(' ', ' ');
            }
            var4 = new ti(dj.field_h, 0, 1);
            this.field_F = new tg[1 + var3_int];
            for (var5 = 0; var5 < var3_int; var5++) {
              this.field_F[var5] = new tg(this.field_H[var5], (cd) (this));
              this.field_F[var5].field_w = (ol) ((Object) var4);
              this.field_F[var5].field_h = jj.field_i;
              this.field_F[var5].a(15, true, 20 + 16 * var5, 0, 80);
              this.a((fi) (this.field_F[var5]), (byte) -78);
            }
            this.field_F[var3_int] = new tg(rj.field_i, (cd) (this));
            this.field_F[var3_int].field_w = (ol) ((Object) var4);
            this.field_F[var3_int].a(15, true, 20 - (-(var3_int * 16) - 16), 0, 100);
            this.a((fi) (this.field_F[var3_int]), (byte) -78);
            return;
          }
          this.field_H = null;
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3 = decompiledCaughtException;
          stackIn_18_0 = var3;
          stackIn_18_1 = new StringBuilder().append("kl.C(");
          if (param0 == null) {
            stackIn_19_2 = "null";
          } else {
            stackIn_19_2 = "{...}";
          }
          throw kg.a((Throwable) ((Object) stackIn_18_0), ((StringBuilder) (Object) stackIn_18_1).append(stackIn_19_2).append(',').append(param1).append(')').toString());
        }
    }

    final static void a(jc param0, byte param1) {
        try {
          int var5 = 0;
          RuntimeException runtimeException = null;
          byte[] var2 = null;
          int var3 = 0;
          int var4_int = 0;
          Exception var4 = null;
          int var6 = 0;
          byte[] var7 = null;
          byte[] var8 = null;
          byte[] var9 = null;
          byte[] var10 = null;
          byte[] var11 = null;
          RuntimeException stackIn_18_0 = null;
          StringBuilder stackIn_18_1 = null;
          String stackIn_19_2 = null;
          Throwable decompiledCaughtException = null;
          var6 = Virogrid.field_F ? 1 : 0;
          try {
            var10 = new byte[24];
            var8 = var10;
            var7 = var8;
            var11 = var7;
            var9 = var11;
            var2 = var9;
            var3 = -4 / ((param1 + 44) / 58);
            if (null != gh.field_Ib) {
              try {
                gh.field_Ib.a(0L, 0);
                gh.field_Ib.a((byte) -102, var10);
                for (var4_int = 0; var4_int < 24; var4_int++) {
                  if (0 == var11[var4_int]) {
                    continue;
                  }
                  break;
                }
                if (var4_int >= 24) {
                  throw new IOException();
                }
              } catch (java.lang.Exception decompiledCaughtParameter0) {
                decompiledCaughtException = decompiledCaughtParameter0;
                var4 = (Exception) (Object) decompiledCaughtException;
                for (var5 = 0; var5 < 24; var5++) {
                  var2[var5] = (byte)-1;
                }
              }
            }
            param0.a(var11, 24, 0, (byte) 41);
            return;
          } catch (java.lang.RuntimeException decompiledCaughtParameter1) {
            decompiledCaughtException = decompiledCaughtParameter1;
            runtimeException = (RuntimeException) (Object) decompiledCaughtException;
            stackIn_18_0 = runtimeException;
            stackIn_18_1 = new StringBuilder().append("kl.B(");
            if (param0 == null) {
              stackIn_19_2 = "null";
            } else {
              stackIn_19_2 = "{...}";
            }
            throw kg.a((Throwable) ((Object) stackIn_18_0), ((StringBuilder) (Object) stackIn_18_1).append(stackIn_19_2).append(',').append(param1).append(')').toString());
          }
        } catch (RuntimeException | Error decompiledUncheckedException) {
          throw decompiledUncheckedException;
        } catch (Throwable decompiledCheckedException) {
          throw new RuntimeException(decompiledCheckedException);
        }
    }

    public final void a(int param0, tg param1, int param2, int param3, int param4) {
        int var6_int = 0;
        int var7 = 0;
        RuntimeException stackIn_16_0 = null;
        StringBuilder stackIn_16_1 = null;
        String stackIn_17_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var6 = null;
        var7 = Virogrid.field_F ? 1 : 0;
        try {
          if (param0 != 12085) {
            kl.a((byte) 103, 7);
          }
          for (var6_int = 0; this.field_H.length > var6_int; var6_int++) {
            if (this.field_F[var6_int] == param1) {
              this.field_G.a(this.field_H[var6_int], false);
            }
          }
          if (param1 == this.field_F[this.field_H.length]) {
            this.field_G.a((byte) -72);
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var6 = decompiledCaughtException;
          stackIn_16_0 = var6;
          stackIn_16_1 = new StringBuilder().append("kl.L(").append(param0).append(',');
          if (param1 == null) {
            stackIn_17_2 = "null";
          } else {
            stackIn_17_2 = "{...}";
          }
          throw kg.a((Throwable) ((Object) stackIn_16_0), ((StringBuilder) (Object) stackIn_16_1).append(stackIn_17_2).append(',').append(param2).append(',').append(param3).append(',').append(param4).append(')').toString());
        }
    }

    kl(fc param0) {
        super(0, 0, 0, 0, (ol) null);
        try {
          this.field_G = param0;
        } catch (RuntimeException runtimeException) {
          throw kg.a((Throwable) ((Object) runtimeException), "kl.<init>(" + (param0 != null ? "{...}" : "null") + ')');
        }
    }

    final void a(byte param0, int param1, int param2, int param3) {
        super.a(param0, param1, param2, param3);
        if (param3 != 0) {
          return;
        }
        e var5 = dj.field_h;
        if (this.field_H != null) {
          var5.a(bg.field_Pb, this.field_l + param1, param2 + this.field_u, this.field_g, 20, 16777215, -1, 0, 0, var5.field_G + var5.field_H);
        }
    }

    final boolean a(fi param0, char param1, int param2, int param3) {
        int var5_int = 0;
        RuntimeException var5 = null;
        boolean stackIn_7_0 = false;
        boolean stackIn_11_0 = false;
        RuntimeException stackIn_14_0 = null;
        StringBuilder stackIn_14_1 = null;
        String stackIn_15_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          if (super.a(param0, param1, param2, -118)) {
            return true;
          }
          if (param2 == 98) {
            stackIn_7_0 = this.b(2, param0);
            return stackIn_7_0;
          }
          var5_int = 4 / ((param3 + 75) / 36);
          if (param2 != 99) {
            return false;
          }
          stackIn_11_0 = this.a(-16234, param0);
          return stackIn_11_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var5 = decompiledCaughtException;
          stackIn_14_0 = var5;
          stackIn_14_1 = new StringBuilder().append("kl.AA(");
          if (param0 == null) {
            stackIn_15_2 = "null";
          } else {
            stackIn_15_2 = "{...}";
          }
          throw kg.a((Throwable) ((Object) stackIn_14_0), ((StringBuilder) (Object) stackIn_14_1).append(stackIn_15_2).append(',').append(param1).append(',').append(param2).append(',').append(param3).append(')').toString());
        }
    }

    static {
        field_E = 10;
    }
}
