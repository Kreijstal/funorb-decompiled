/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class nwa implements ntb {
    static eab field_c;
    static int field_a;
    static boolean field_d;
    private rha[] field_b;

    public static void a(int param0) {
        field_c = null;
        if (param0 != 1) {
          nwa.a(20);
        }
    }

    final void a(int param0, int param1) {
        int var3;
        int var4;
        int var5;
        var5 = VoidHunters.field_G;
        if (param0 <= 57) {
          return;
        }
        cla.field_a = param1;
        if (null != this.field_b) {
          var3 = 0;
          while (this.field_b.length > var3) {
            var4 = param1 - this.field_b[var3].field_a;
            if (oq.field_c <= var4) {
              this.field_b = (rha[]) (dt.a(bob.field_e, var3, 15667, this.field_b));
              if (this.field_b == null) {
                break;
              }
              var3--;
            }
            var3++;
          }
        }
    }

    public final void b(byte param0, tv param1) {
        nwa var3 = (nwa) (param1);
        if (param0 < 54) {
          return;
        }
        try {
          var3.field_b = (rha[]) (sqb.a(var3.field_b, this.field_b, 1, bob.field_e, false));
        } catch (RuntimeException runtimeException) {
          throw rta.a((Throwable) ((Object) runtimeException), "nwa.D(" + param0 + ',' + (param1 != null ? "{...}" : "null") + ')');
        }
    }

    final static tjb a(llb param0, int[] param1, int param2, llb param3, llb param4) {
        int var10_int = 0;
        int var5_int = 0;
        String[] var6 = null;
        char[] var7 = null;
        tjb[] var8 = null;
        int var9 = 0;
        pi var11 = null;
        int var12 = 0;
        char[] var13 = null;
        char[] var14 = null;
        Object stackIn_7_0 = null;
        tjb stackIn_9_0 = null;
        RuntimeException stackIn_12_0 = null;
        StringBuilder stackIn_12_1 = null;
        String stackIn_13_2 = null;
        StringBuilder stackIn_15_1 = null;
        String stackIn_16_2 = null;
        StringBuilder stackIn_18_1 = null;
        String stackIn_19_2 = null;
        StringBuilder stackIn_21_1 = null;
        String stackIn_22_2 = null;
        Throwable decompiledCaughtException = null;
        RuntimeException var5 = null;
        Exception var10 = null;
        var12 = VoidHunters.field_G;
        try {
          var5_int = param1.length;
          var6 = new String[var5_int];
          var14 = new char[var5_int];
          var13 = var14;
          var7 = var13;
          var8 = new tjb[var5_int];
          var9 = 49;
          try {
            for (var10_int = param2; var10_int < var5_int; var10_int++) {
              var11 = usa.field_o.a(param1[var10_int], -122);
              var6[var10_int] = var11.a(80);
              var9 = (char)(var9 + 1);
              var7[var10_int] = (char)var9;
              var8[var10_int] = null;
            }
          } catch (java.lang.Exception decompiledCaughtParameter0) {
            decompiledCaughtException = decompiledCaughtParameter0;
            var10 = (Exception) (Object) decompiledCaughtException;
            stackIn_7_0 = null;
            return (tjb) (stackIn_7_0);
          }
          stackIn_9_0 = new tjb(0L, param0, param4, param3, var8, param1, var6, var14);
          return stackIn_9_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter1) {
          decompiledCaughtException = decompiledCaughtParameter1;
          var5 = (RuntimeException) (Object) decompiledCaughtException;
          stackIn_12_0 = var5;
          stackIn_12_1 = new StringBuilder().append("nwa.J(");
          if (param0 == null) {
            stackIn_13_2 = "null";
          } else {
            stackIn_13_2 = "{...}";
          }
          stackIn_15_1 = ((StringBuilder) (Object) stackIn_12_1).append(stackIn_13_2).append(',');
          if (param1 == null) {
            stackIn_16_2 = "null";
          } else {
            stackIn_16_2 = "{...}";
          }
          stackIn_18_1 = ((StringBuilder) (Object) stackIn_15_1).append(stackIn_16_2).append(',').append(param2).append(',');
          if (param3 == null) {
            stackIn_19_2 = "null";
          } else {
            stackIn_19_2 = "{...}";
          }
          stackIn_21_1 = ((StringBuilder) (Object) stackIn_18_1).append(stackIn_19_2).append(',');
          if (param4 == null) {
            stackIn_22_2 = "null";
          } else {
            stackIn_22_2 = "{...}";
          }
          throw rta.a((Throwable) ((Object) stackIn_12_0), ((StringBuilder) (Object) stackIn_21_1).append(stackIn_22_2).append(')').toString());
        }
    }

    final void a(rha param0, boolean param1) {
        RuntimeException stackIn_8_0 = null;
        StringBuilder stackIn_8_1 = null;
        String stackIn_9_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var3 = null;
        try {
          param0.field_a = cla.field_a;
          this.field_b = (rha[]) (ija.a(param0, this.field_b, 0, bob.field_e));
          if (hb.field_a < this.field_b.length) {
            this.field_b = (rha[]) (dt.a(bob.field_e, 0, 15667, this.field_b));
          }
          if (!param1) {
            field_a = 89;
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3 = decompiledCaughtException;
          stackIn_8_0 = var3;
          stackIn_8_1 = new StringBuilder().append("nwa.I(");
          if (param0 == null) {
            stackIn_9_2 = "null";
          } else {
            stackIn_9_2 = "{...}";
          }
          throw rta.a((Throwable) ((Object) stackIn_8_0), ((StringBuilder) (Object) stackIn_8_1).append(stackIn_9_2).append(',').append(param1).append(')').toString());
        }
    }

    public final void b(faa param0, int param1) {
        int var5 = 0;
        rha[] var6 = null;
        int var7 = 0;
        rha var8 = null;
        int var9 = VoidHunters.field_G;
        faa var3 = param0;
        rha[] var4 = this.field_b;
        if (param1 >= -109) {
          return;
        }
        try {
          var5 = var4 == null ? 0 : var4.length;
          var3.a(-632, var5, 8);
          if (0 != var5) {
            var6 = var4;
            for (var7 = 0; var7 < var6.length; var7++) {
              var8 = var6[var7];
              if (vq.a(var3, -74, var8 != null ? true : false)) {
                stb.a(2, 1, var3, var8);
              }
            }
          }
        } catch (RuntimeException runtimeException) {
          throw rta.a((Throwable) ((Object) runtimeException), "nwa.B(" + (param0 != null ? "{...}" : "null") + ',' + param1 + ')');
        }
    }

    public final void a(faa param0, boolean param1) {
        try {
          this.field_b = (rha[]) (kcb.a(8, bob.field_e, param0, 1, -69, this.field_b));
          if (param1) {
            tv var4 = (tv) null;
            this.a((byte) -113, (tv) null);
          }
        } catch (RuntimeException runtimeException) {
          throw rta.a((Throwable) ((Object) runtimeException), "nwa.H(" + (param0 != null ? "{...}" : "null") + ',' + param1 + ')');
        }
    }

    public final void a(tv param0, int param1) {
        nwa var3 = null;
        int var4 = 0;
        rha var5 = null;
        RuntimeException stackIn_10_0 = null;
        StringBuilder stackIn_10_1 = null;
        String stackIn_11_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var3_ref = null;
        try {
          var3 = (nwa) (param0);
          tja.a(var3.field_b, 1, this.field_b, false, 5547);
          var4 = 0;
          if (dn.a(var3.field_b, false, 1, this.field_b, 121)) {
            System.out.println("Message[] messages has changed. ");
            var4 = 1;
          }
          if (var4 != 0) {
            System.out.println("This instance of MessageLog has changed");
          }
          if (param1 > -19) {
            var5 = (rha) null;
            this.a((rha) null, true);
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3_ref = decompiledCaughtException;
          stackIn_10_0 = var3_ref;
          stackIn_10_1 = new StringBuilder().append("nwa.F(");
          if (param0 == null) {
            stackIn_11_2 = "null";
          } else {
            stackIn_11_2 = "{...}";
          }
          throw rta.a((Throwable) ((Object) stackIn_10_0), ((StringBuilder) (Object) stackIn_10_1).append(stackIn_11_2).append(',').append(param1).append(')').toString());
        }
    }

    public final boolean a(byte param0, tv param1) {
        nwa var3 = null;
        RuntimeException var3_ref = null;
        int var4 = 0;
        boolean stackIn_1_0 = false;
        RuntimeException stackIn_4_0 = null;
        StringBuilder stackIn_4_1 = null;
        String stackIn_5_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          var3 = (nwa) (param1);
          var4 = 22 % ((param0 - 22) / 59);
          stackIn_1_0 = dn.a(var3.field_b, false, 1, this.field_b, 116);
          return stackIn_1_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3_ref = decompiledCaughtException;
          stackIn_4_0 = var3_ref;
          stackIn_4_1 = new StringBuilder().append("nwa.C(").append(param0).append(',');
          if (param1 == null) {
            stackIn_5_2 = "null";
          } else {
            stackIn_5_2 = "{...}";
          }
          throw rta.a((Throwable) ((Object) stackIn_4_0), ((StringBuilder) (Object) stackIn_4_1).append(stackIn_5_2).append(')').toString());
        }
    }

    final rha[] a(byte param0) {
        if (param0 < 44) {
          field_c = (eab) null;
        }
        return this.field_b;
    }

    static {
        field_a = 0;
    }
}
