/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class ih extends wm implements ntb, hd {
    static String[] field_f;
    private int field_d;
    static int field_e;
    private int field_c;

    public static void b(int param0) {
        if (param0 != -10570) {
          return;
        }
        field_f = null;
    }

    final int a(byte param0, int param1) {
        if (param0 > -102) {
          return 17;
        }
        if (param1 != 0) {
          return this.field_d;
        }
        return this.field_c;
    }

    final boolean a(int param0, lbb param1, pe param2) {
        int var6 = 0;
        sg var4 = null;
        RuntimeException var4_ref = null;
        sg[] var5 = null;
        sg var7 = null;
        int var8 = 0;
        sg[] var9 = null;
        RuntimeException stackIn_23_0 = null;
        StringBuilder stackIn_23_1 = null;
        String stackIn_24_2 = null;
        StringBuilder stackIn_26_1 = null;
        String stackIn_27_2 = null;
        RuntimeException decompiledCaughtException = null;
        var8 = VoidHunters.field_G;
        try {
          if (param0 != ~this.field_c) {
            var4 = param2.d(param0 ^ 1000)[this.field_c];
            if (var4 != null &&
              var4.q((byte) 86) == this.field_d &&
              !var4.l((byte) -10) &&
              -1 != var4.o((byte) -117)) {
              return true;
            }
            return false;
          }
          var9 = param2.d(param0 + 1000);
          var5 = var9;
          for (var6 = 0; var6 < var5.length; var6++) {
            var7 = var5[var6];
            if (var7 != null &&
              var7.q((byte) 120) == this.field_d &&
              !var7.l((byte) -10) &&
              var7.o((byte) -117) >= 0) {
              return true;
            }
          }
          return false;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var4_ref = decompiledCaughtException;
          stackIn_23_0 = var4_ref;
          stackIn_23_1 = new StringBuilder().append("ih.G(").append(param0).append(',');
          if (param1 == null) {
            stackIn_24_2 = "null";
          } else {
            stackIn_24_2 = "{...}";
          }
          stackIn_26_1 = ((StringBuilder) (Object) stackIn_23_1).append(stackIn_24_2).append(',');
          if (param2 == null) {
            stackIn_27_2 = "null";
          } else {
            stackIn_27_2 = "{...}";
          }
          throw rta.a((Throwable) ((Object) stackIn_23_0), ((StringBuilder) (Object) stackIn_26_1).append(stackIn_27_2).append(')').toString());
        }
    }

    final ucb[] a(pe param0, int param1) {
        sg var3 = null;
        RuntimeException var3_ref = null;
        sg var4 = null;
        ucb[] stackIn_4_0 = null;
        Object stackIn_8_0 = null;
        RuntimeException stackIn_11_0 = null;
        StringBuilder stackIn_11_1 = null;
        String stackIn_12_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          if (this.field_c != -1) {
            var4 = param0.d(1000)[this.field_c];
            var3 = var4;
            if (var3 != null) {
              stackIn_4_0 = new ucb[]{new ucb(var4.d(false), var4.g((byte) -58))};
              return stackIn_4_0;
            }
          }
          if (param1 == -20605) {
            return null;
          }
          field_e = 68;
          stackIn_8_0 = null;
          return (ucb[]) (stackIn_8_0);
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3_ref = decompiledCaughtException;
          stackIn_11_0 = var3_ref;
          stackIn_11_1 = new StringBuilder().append("ih.I(");
          if (param0 == null) {
            stackIn_12_2 = "null";
          } else {
            stackIn_12_2 = "{...}";
          }
          throw rta.a((Throwable) ((Object) stackIn_11_0), ((StringBuilder) (Object) stackIn_11_1).append(stackIn_12_2).append(',').append(param1).append(')').toString());
        }
    }

    public final void a(faa param0, boolean param1) {
        try {
          super.a(param0, param1);
          this.field_c = param0.i(0, 32);
          this.field_d = param0.i(0, 32);
        } catch (RuntimeException runtimeException) {
          throw rta.a((Throwable) ((Object) runtimeException), "ih.H(" + (param0 != null ? "{...}" : "null") + ',' + param1 + ')');
        }
    }

    final void a(pe param0, int param1, int param2, int param3) {
        int var5_int = 0;
        int var6 = 0;
        int var7 = 0;
        int var8 = 0;
        anb var9 = null;
        int var10 = 0;
        int stackIn_8_0 = 0;
        RuntimeException stackIn_20_0 = null;
        StringBuilder stackIn_20_1 = null;
        String stackIn_21_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var5 = null;
        var10 = VoidHunters.field_G;
        try {
          if (param1 != -2) {
            this.a(57, (int[]) null);
          }
          if (param2 == 0) {
            stackIn_8_0 = (this.field_c >= param3) ? -1 : 1;
            var5_int = stackIn_8_0;
            var6 = 50;
            var7 = var5_int * var6 + param3;
            var8 = param3;
            while (true) {
              if (var7 == var8) {
                return;
              }
              var9 = param0.d((byte) -27, var8);
              if ((var9 == null ||
                !(var9 instanceof sg)) && -1 != var8) {
                var8 = var8 + var5_int;
                continue;
              }
              break;
            }
            this.field_c = var8;
            return;
          }
          this.field_d = (so.field_b + param3) % so.field_b;
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var5 = decompiledCaughtException;
          stackIn_20_0 = var5;
          stackIn_20_1 = new StringBuilder().append("ih.E(");
          if (param0 == null) {
            stackIn_21_2 = "null";
          } else {
            stackIn_21_2 = "{...}";
          }
          throw rta.a((Throwable) ((Object) stackIn_20_0), ((StringBuilder) (Object) stackIn_20_1).append(stackIn_21_2).append(',').append(param1).append(',').append(param2).append(',').append(param3).append(')').toString());
        }
    }

    public final boolean a(byte param0, tv param1) {
        int var3_int = 0;
        ih var4 = null;
        boolean stackIn_6_0 = false;
        RuntimeException stackIn_9_0 = null;
        StringBuilder stackIn_9_1 = null;
        String stackIn_10_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var3 = null;
        try {
          var3_int = -3 / ((22 - param0) / 59);
          var4 = (ih) (param1);
          stackIn_6_0 = (super.a((byte) 89, param1)) || (this.field_c != var4.field_c) || (var4.field_d != this.field_d);
          return stackIn_6_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3 = decompiledCaughtException;
          stackIn_9_0 = var3;
          stackIn_9_1 = new StringBuilder().append("ih.C(").append(param0).append(',');
          if (param1 == null) {
            stackIn_10_2 = "null";
          } else {
            stackIn_10_2 = "{...}";
          }
          throw rta.a((Throwable) ((Object) stackIn_9_0), ((StringBuilder) (Object) stackIn_9_1).append(stackIn_10_2).append(')').toString());
        }
    }

    public final void b(faa param0, int param1) {
        if (param1 > -109) {
          return;
        }
        try {
          super.b(param0, -122);
          param0.a(-632, this.field_c, 32);
          param0.a(-632, this.field_d, 32);
        } catch (RuntimeException runtimeException) {
          throw rta.a((Throwable) ((Object) runtimeException), "ih.B(" + (param0 != null ? "{...}" : "null") + ',' + param1 + ')');
        }
    }

    final int[] a(pe param0, int param1, int[] param2) {
        int var6 = 0;
        sg[] var5 = null;
        sg var7 = null;
        int var8 = 0;
        sg[] var9 = null;
        int[] stackIn_5_0 = null;
        int[] stackIn_23_0 = null;
        RuntimeException stackIn_26_0 = null;
        StringBuilder stackIn_26_1 = null;
        String stackIn_27_2 = null;
        StringBuilder stackIn_29_1 = null;
        String stackIn_30_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var4 = null;
        var8 = VoidHunters.field_G;
        try {
          if (param1 < 16) {
            field_f = (String[]) null;
          }
          if (this.field_c != -1) {
            stackIn_5_0 = qi.a(this.field_c, true, param2, (byte) -14);
            return stackIn_5_0;
          }
          var9 = param0.d(1000);
          var5 = var9;
          for (var6 = 0; var6 < var5.length; var6++) {
            var7 = var5[var6];
            if (var7 != null &&
              var7.q((byte) 121) == this.field_d &&
              !var7.l((byte) -10) &&
              var7.o((byte) -117) >= 0) {
              param2 = qi.a(var7.c(false), true, param2, (byte) -14);
            }
          }
          stackIn_23_0 = (int[]) (param2);
          return stackIn_23_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var4 = decompiledCaughtException;
          stackIn_26_0 = var4;
          stackIn_26_1 = new StringBuilder().append("ih.J(");
          if (param0 == null) {
            stackIn_27_2 = "null";
          } else {
            stackIn_27_2 = "{...}";
          }
          stackIn_29_1 = ((StringBuilder) (Object) stackIn_26_1).append(stackIn_27_2).append(',').append(param1).append(',');
          if (param2 == null) {
            stackIn_30_2 = "null";
          } else {
            stackIn_30_2 = "{...}";
          }
          throw rta.a((Throwable) ((Object) stackIn_26_0), ((StringBuilder) (Object) stackIn_29_1).append(stackIn_30_2).append(')').toString());
        }
    }

    public final void a(tv param0, int param1) {
        int var4 = 0;
        ih var5 = null;
        RuntimeException stackIn_12_0 = null;
        StringBuilder stackIn_12_1 = null;
        String stackIn_13_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var3 = null;
        try {
          super.a(param0, -86);
          var5 = (ih) (param0);
          if (param1 >= -19) {
            this.b((faa) null, -126);
          }
          var4 = 0;
          if (this.field_c != var5.field_c) {
            System.out.println("int ship_id has changed. before=" + var5.field_c + ", now=" + this.field_c);
            var4 = 1;
          }
          if (this.field_d != var5.field_d) {
            var4 = 1;
            System.out.println("int team_id has changed. before=" + var5.field_d + ", now=" + this.field_d);
          }
          if (var4 != 0) {
            System.out.println("This instance of MissionConditionShipOnTeam has changed");
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3 = decompiledCaughtException;
          stackIn_12_0 = var3;
          stackIn_12_1 = new StringBuilder().append("ih.F(");
          if (param0 == null) {
            stackIn_13_2 = "null";
          } else {
            stackIn_13_2 = "{...}";
          }
          throw rta.a((Throwable) ((Object) stackIn_12_0), ((StringBuilder) (Object) stackIn_12_1).append(stackIn_13_2).append(',').append(param1).append(')').toString());
        }
    }

    public final int[] a(int param0, int[] param1) {
        RuntimeException var3 = null;
        int[] stackIn_2_0 = null;
        int[] stackIn_7_0 = null;
        RuntimeException stackIn_10_0 = null;
        StringBuilder stackIn_10_1 = null;
        String stackIn_11_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          if (param0 <= 99) {
            stackIn_2_0 = (int[]) null;
            return stackIn_2_0;
          }
          if (this.field_c >= 0) {
            param1 = qi.a(this.field_c, true, param1, (byte) -14);
          }
          stackIn_7_0 = (int[]) (param1);
          return stackIn_7_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3 = decompiledCaughtException;
          stackIn_10_0 = var3;
          stackIn_10_1 = new StringBuilder().append("ih.N(").append(param0).append(',');
          if (param1 == null) {
            stackIn_11_2 = "null";
          } else {
            stackIn_11_2 = "{...}";
          }
          throw rta.a((Throwable) ((Object) stackIn_10_0), ((StringBuilder) (Object) stackIn_10_1).append(stackIn_11_2).append(')').toString());
        }
    }

    ih() {
    }

    final String a(int param0) {
        String var2 = "Ship " + this.field_c;
        if (this.field_c == param0) {
          var2 = "Any ship";
        }
        return var2 + " in team " + this.field_d;
    }

    ih(int param0, int param1) {
        this.field_d = param1;
        this.field_c = param0;
    }

    public final void b(byte param0, tv param1) {
        ih var4 = (ih) (param1);
        ih var3 = var4;
        if (param0 <= 54) {
          return;
        }
        try {
          super.b((byte) 110, param1);
          var4.field_d = this.field_d;
          var4.field_c = this.field_c;
        } catch (RuntimeException runtimeException) {
          throw rta.a((Throwable) ((Object) runtimeException), "ih.D(" + param0 + ',' + (param1 != null ? "{...}" : "null") + ')');
        }
    }

    static {
    }
}
