/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class qqb implements ntb {
    private wna[] field_a;
    static int field_b;

    final int a(int param0, int param1) {
        int var3;
        int var4;
        wna var5;
        int var6;
        var6 = VoidHunters.field_G;
        if (null != this.field_a &&
          this.field_a.length != 0) {
          var3 = 0;
          var4 = 0;
          if (param0 > -49) {
            qqb.a(-126);
          }
          while (this.field_a.length > var4) {
            var5 = this.field_a[var4];
            if (var5.field_d == param1) {
              var3++;
            }
            var4++;
          }
          return var3;
        }
        return 0;
    }

    public final void b(byte param0, tv param1) {
        qqb var3 = null;
        tv var4 = null;
        RuntimeException stackIn_5_0 = null;
        StringBuilder stackIn_5_1 = null;
        String stackIn_6_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var3_ref = null;
        try {
          var3 = (qqb) (param1);
          var3.field_a = (wna[]) (sqb.a(var3.field_a, this.field_a, 1, lm.field_b, false));
          if (param0 < 54) {
            var4 = (tv) null;
            this.a((tv) null, 79);
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3_ref = decompiledCaughtException;
          stackIn_5_0 = var3_ref;
          stackIn_5_1 = new StringBuilder().append("qqb.D(").append(param0).append(',');
          if (param1 == null) {
            stackIn_6_2 = "null";
          } else {
            stackIn_6_2 = "{...}";
          }
          throw rta.a((Throwable) ((Object) stackIn_5_0), ((StringBuilder) (Object) stackIn_5_1).append(stackIn_6_2).append(')').toString());
        }
    }

    public final void b(faa param0, int param1) {
        int var5 = 0;
        wna[] var6 = null;
        int var7 = 0;
        wna var8 = null;
        int var9 = VoidHunters.field_G;
        faa var3 = param0;
        wna[] var4 = this.field_a;
        if (param1 >= -109) {
          return;
        }
        try {
          var5 = var4 != null ? var4.length : 0;
          var3.a(-632, var5, 8);
          if (var5 != 0) {
            var6 = var4;
            for (var7 = 0; var6.length > var7; var7++) {
              var8 = var6[var7];
              if (vq.a(var3, 86, var8 != null ? true : false)) {
                stb.a(2, 1, var3, var8);
              }
            }
          }
        } catch (RuntimeException runtimeException) {
          throw rta.a((Throwable) ((Object) runtimeException), "qqb.B(" + (param0 != null ? "{...}" : "null") + ',' + param1 + ')');
        }
    }

    public final boolean a(byte param0, tv param1) {
        qqb var3 = null;
        RuntimeException var3_ref = null;
        int var4 = 0;
        boolean stackIn_1_0 = false;
        RuntimeException stackIn_4_0 = null;
        StringBuilder stackIn_4_1 = null;
        String stackIn_5_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          var4 = -100 / ((22 - param0) / 59);
          var3 = (qqb) (param1);
          stackIn_1_0 = dn.a(var3.field_a, false, 1, this.field_a, -39);
          return stackIn_1_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3_ref = decompiledCaughtException;
          stackIn_4_0 = var3_ref;
          stackIn_4_1 = new StringBuilder().append("qqb.C(").append(param0).append(',');
          if (param1 == null) {
            stackIn_5_2 = "null";
          } else {
            stackIn_5_2 = "{...}";
          }
          throw rta.a((Throwable) ((Object) stackIn_4_0), ((StringBuilder) (Object) stackIn_4_1).append(stackIn_5_2).append(')').toString());
        }
    }

    public final void a(faa param0, boolean param1) {
        try {
          this.field_a = (wna[]) (kcb.a(8, lm.field_b, param0, 1, -62, this.field_a));
          if (param1) {
            field_b = 39;
          }
        } catch (RuntimeException runtimeException) {
          throw rta.a((Throwable) ((Object) runtimeException), "qqb.H(" + (param0 != null ? "{...}" : "null") + ',' + param1 + ')');
        }
    }

    final int a(int param0, byte param1) {
        int var4 = 0;
        int var3;
        wna var5;
        int var6;
        faa var7;
        var6 = VoidHunters.field_G;
        if (this.field_a != null &&
          this.field_a.length != 0) {
          var3 = 0;
          for (var4 = 0; this.field_a.length > var4; var4++) {
            var5 = this.field_a[var4];
            if (~param0 == ~var5.field_d) {
              var3 = var3 + var5.field_b;
            }
          }
          if (param1 != -88) {
            var7 = (faa) null;
            this.a((faa) null, false);
          }
          return var3;
        }
        return 0;
    }

    final void a(int param0, wna param1) {
        try {
          if (param0 < 87) {
            field_b = 57;
          }
          this.field_a = (wna[]) (ija.a(param1, this.field_a, 0, lm.field_b));
        } catch (RuntimeException runtimeException) {
          throw rta.a((Throwable) ((Object) runtimeException), "qqb.A(" + param0 + ',' + (param1 != null ? "{...}" : "null") + ')');
        }
    }

    final static void a(int param0) {
        hla.field_a = null;
        if (param0 <= 36) {
          return;
        }
        iib.field_e = null;
        rlb.field_d = null;
        nhb.field_o = null;
        sh.field_a = (byte[][]) null;
        so.field_f = null;
    }

    final int a(boolean param0) {
        int var2;
        int var3_int;
        int[] var3;
        int var5;
        int var6;
        wna var6_ref_wna;
        int var7;
        int var8;
        int var9;
        int var10;
        int[] var11;
        wna var12;
        int[] var13;
        int[] var14;
        int var5Lifetime1;
        int var5Lifetime2;
        int var7Lifetime1;
        int var8Lifetime1;
        int var8Lifetime2;
        var10 = VoidHunters.field_G;
        js.field_o = 0;
        if (null != this.field_a &&
          0 != this.field_a.length) {
          var2 = unb.field_p - 1;
          var3_int = 0;
          if (!param0) {
            field_b = -113;
          }
          while (this.field_a.length > var3_int) {
            var12 = this.field_a[var3_int];
            var5 = var12.field_d;
            if (var5 > var2) {
              var2 = var5;
            }
            var3_int++;
          }
          var14 = new int[1 + var2];
          var13 = var14;
          var3 = var13;
          var11 = new int[var14.length];
          for (var5Lifetime1 = 0; this.field_a.length > var5Lifetime1; var5Lifetime1++) {
            var6_ref_wna = this.field_a[var5Lifetime1];
            var7 = var6_ref_wna.field_d;
            var8 = var6_ref_wna.field_b;
            if (var7 >= 0 &&
              var7 < var14.length) {
              var3[var7] = var3[var7] + 1;
              var11[var7] = var11[var7] + var8;
            }
          }
          var5Lifetime2 = -1;
          var6 = -2147483648;
          js.field_o = 1;
          var7Lifetime1 = 2147483647;
          for (var8Lifetime1 = 0; var8Lifetime1 < var14.length; var8Lifetime1++) {
            if (var14[var8Lifetime1] > var6) {
              var7Lifetime1 = var11[var8Lifetime1];
              var5Lifetime2 = var8Lifetime1;
              var6 = var14[var8Lifetime1];
            } else {
              if (var6 == var14[var8Lifetime1] &&
                var7Lifetime1 > var11[var8Lifetime1]) {
                var5Lifetime2 = var8Lifetime1;
                var7Lifetime1 = var11[var8Lifetime1];
                var6 = var14[var8Lifetime1];
              } else {
                if (var6 == var14[var8Lifetime1] &&
                  var11[var8Lifetime1] == var7Lifetime1) {
                  var5Lifetime2 = -1;
                }
              }
            }
          }
          var8Lifetime2 = 0;
          var9 = 0;
          L6: while (true) {
            if (var14.length > var9) {
              if (var14[var9] == var6) {
                var8Lifetime2++;
                if (var8Lifetime2 >= 2) {
                  js.field_o = 2;
                  break L6;
                }
              }
              var9++;
              continue;
            }
            break;
          }
          if (this.field_a.length == 1) {
            js.field_o = 0;
          }
          return var5Lifetime2;
        }
        return -1;
    }

    public final void a(tv param0, int param1) {
        qqb var3 = null;
        int var4 = 0;
        wna var5 = null;
        RuntimeException stackIn_9_0 = null;
        StringBuilder stackIn_9_1 = null;
        String stackIn_10_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var3_ref = null;
        try {
          if (param1 > -19) {
            var5 = (wna) null;
            this.a(118, (wna) null);
          }
          var3 = (qqb) (param0);
          tja.a(var3.field_a, 1, this.field_a, false, 5547);
          var4 = 0;
          if (dn.a(var3.field_a, false, 1, this.field_a, -12)) {
            System.out.println("RoundResult[] results has changed. ");
            var4 = 1;
          }
          if (var4 != 0) {
            System.out.println("This instance of MatchResults has changed");
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3_ref = decompiledCaughtException;
          stackIn_9_0 = var3_ref;
          stackIn_9_1 = new StringBuilder().append("qqb.F(");
          if (param0 == null) {
            stackIn_10_2 = "null";
          } else {
            stackIn_10_2 = "{...}";
          }
          throw rta.a((Throwable) ((Object) stackIn_9_0), ((StringBuilder) (Object) stackIn_9_1).append(stackIn_10_2).append(',').append(param1).append(')').toString());
        }
    }

    static {
        field_b = 10;
    }
}
