/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class aqa implements ntb {
    private boolean field_d;
    private tbb field_b;
    private gqb field_c;
    static String[] field_a;

    final int c(int param0) {
        if (this.field_c != null) {
          return this.field_c.field_c;
        }
        if (param0 != 0) {
          this.field_d = false;
          return 0;
        }
        return 0;
    }

    private final void a(pe param0, int param1, int param2, int param3, int param4, int[] param5, int param6, int param7, anb param8) {
        RuntimeException stackIn_13_0 = null;
        StringBuilder stackIn_13_1 = null;
        String stackIn_14_2 = null;
        StringBuilder stackIn_16_1 = null;
        String stackIn_17_2 = null;
        StringBuilder stackIn_19_1 = null;
        String stackIn_20_2 = null;
        RuntimeException decompiledCaughtException = null;
        int var10_int = 0;
        RuntimeException var10 = null;
        int var11 = 0;
        int var12 = 0;
        try {
          if (param3 != 0) {
            return;
          }
          var10_int = this.a(param6, false) * param1 >> 8;
          var11 = var10_int * fc.a(param2, (byte) 31) >> 8;
          var12 = var10_int * eu.a(param2, param3 ^ 50) >> 8;
          param8.a(var12, param4, param7, (byte) -117, var11);
          if (veb.field_b == 0) {
            if (param6 != 46) {
              param0.a(1, -var11 >> ina.field_p, 0, slb.field_a, 30273, param4, 0, param7, -var12 >> ina.field_p);
            } else {
              param0.a(5, -var11 >> ina.field_p, 0, slb.field_a, 30273, param4, 1024, param7, -var12 >> ina.field_p);
            }
          }
          if (this.field_b != null) {
            if (param0.c((byte) -86)) {
              return;
            }
            this.field_b.a((byte) 98, 16);
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var10 = decompiledCaughtException;
          stackIn_13_0 = var10;
          stackIn_13_1 = new StringBuilder().append("aqa.G(");
          if (param0 == null) {
            stackIn_14_2 = "null";
          } else {
            stackIn_14_2 = "{...}";
          }
          stackIn_16_1 = ((StringBuilder) (Object) stackIn_13_1).append(stackIn_14_2).append(',').append(param1).append(',').append(param2).append(',').append(param3).append(',').append(param4).append(',');
          if (param5 == null) {
            stackIn_17_2 = "null";
          } else {
            stackIn_17_2 = "{...}";
          }
          stackIn_19_1 = ((StringBuilder) (Object) stackIn_16_1).append(stackIn_17_2).append(',').append(param6).append(',').append(param7).append(',');
          if (param8 == null) {
            stackIn_20_2 = "null";
          } else {
            stackIn_20_2 = "{...}";
          }
          throw rta.a((Throwable) ((Object) stackIn_13_0), ((StringBuilder) (Object) stackIn_19_1).append(stackIn_20_2).append(')').toString());
        }
    }

    final void a(boolean param0) {
        if (param0) {
          return;
        }
        if (this.field_b != null) {
          this.field_b.a(98);
        }
    }

    final void a(boolean param0, int param1) {
        if (veb.field_b == 0) {
          param0 = false;
        }
        if (param1 != 1024) {
          return;
        }
        if (!param0) {
          if (null != this.field_b) {
            this.field_b = null;
            return;
          }
          return;
        }
        if (this.field_b == null) {
          this.field_b = new tbb();
          return;
        }
        if (param0) {
          return;
        }
        if (null != this.field_b) {
          this.field_b = null;
          return;
        }
    }

    public final boolean a(byte param0, tv param1) {
        aqa var3 = null;
        int var4 = 0;
        int stackIn_3_0 = 0;
        int stackIn_6_1 = 0;
        int stackIn_13_0 = 0;
        int stackIn_16_1 = 0;
        boolean stackIn_22_0 = false;
        RuntimeException stackIn_25_0 = null;
        StringBuilder stackIn_25_1 = null;
        String stackIn_26_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var3_ref = null;
        try {
          var4 = -36 % ((22 - param0) / 59);
          var3 = (aqa) (param1);
          stackIn_3_0 = (this.field_c != null) ? 0 : 1;
          if (var3.field_c != null) {
            stackIn_6_1 = 0;
          } else {
            stackIn_6_1 = 1;
          }
          boolean decompiledFrameRemainder0 = true;
          if ((stackIn_3_0 ^ stackIn_6_1) == 0 && (null == this.field_c ||
            !this.field_c.a((byte) -83, var3.field_c))) {
            stackIn_13_0 = (null != this.field_b) ? 0 : 1;
            if (var3.field_b != null) {
              stackIn_16_1 = 0;
            } else {
              stackIn_16_1 = 1;
            }
            if ((stackIn_13_0 ^ stackIn_16_1) == 0 && (null == this.field_b ||
              !this.field_b.a((byte) -44, var3.field_b))) {
              stackIn_22_0 = false;
              decompiledFrameRemainder0 = false;
            }
          }
          if (decompiledFrameRemainder0) {
            stackIn_22_0 = true;
          }
          return stackIn_22_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3_ref = decompiledCaughtException;
          stackIn_25_0 = var3_ref;
          stackIn_25_1 = new StringBuilder().append("aqa.C(").append(param0).append(',');
          if (param1 == null) {
            stackIn_26_2 = "null";
          } else {
            stackIn_26_2 = "{...}";
          }
          throw rta.a((Throwable) ((Object) stackIn_25_0), ((StringBuilder) (Object) stackIn_25_1).append(stackIn_26_2).append(')').toString());
        }
    }

    public final void b(faa param0, int param1) {
        RuntimeException var3 = null;
        tv var4 = null;
        faa stackIn_2_0 = null;
        int stackIn_2_1 = 0;
        boolean stackIn_3_2 = false;
        faa stackIn_8_0 = null;
        int stackIn_8_1 = 0;
        boolean stackIn_9_2 = false;
        RuntimeException stackIn_16_0 = null;
        StringBuilder stackIn_16_1 = null;
        String stackIn_17_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          stackIn_2_0 = (faa) (param0);
          stackIn_2_1 = 53;
          stackIn_3_2 = (this.field_c != null);
          if (vq.a(stackIn_2_0, stackIn_2_1, stackIn_3_2)) {
            this.field_c.b(param0, -123);
          }
          stackIn_8_0 = (faa) (param0);
          stackIn_8_1 = 87;
          stackIn_9_2 = (null != this.field_b);
          if (vq.a(stackIn_8_0, stackIn_8_1, stackIn_9_2)) {
            this.field_b.b(param0, -126);
          }
          if (param1 < -109) {
            return;
          }
          var4 = (tv) null;
          this.a((tv) null, -102);
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3 = decompiledCaughtException;
          stackIn_16_0 = var3;
          stackIn_16_1 = new StringBuilder().append("aqa.B(");
          if (param0 == null) {
            stackIn_17_2 = "null";
          } else {
            stackIn_17_2 = "{...}";
          }
          throw rta.a((Throwable) ((Object) stackIn_16_0), ((StringBuilder) (Object) stackIn_16_1).append(stackIn_17_2).append(',').append(param1).append(')').toString());
        }
    }

    public final void a(tv param0, int param1) {
        int stackIn_12_0 = 0;
        int stackIn_15_1 = 0;
        int stackIn_23_0 = 0;
        int stackIn_26_1 = 0;
        RuntimeException stackIn_36_0 = null;
        StringBuilder stackIn_36_1 = null;
        String stackIn_37_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var3 = null;
        int var4 = 0;
        aqa var5 = null;
        try {
          var5 = (aqa) (param0);
          if (param1 > -19) {
            return;
          }
          if (this.field_c != null &&
            var5.field_c != null) {
            this.field_c.a(var5.field_c, -100);
          }
          if (this.field_b != null &&
            null != var5.field_b) {
            this.field_b.a(var5.field_b, -61);
          }
          var4 = 0;
          stackIn_12_0 = (this.field_c != null) ? 0 : 1;
          if (null != var5.field_c) {
            stackIn_15_1 = 0;
          } else {
            stackIn_15_1 = 1;
          }
          if ((stackIn_12_0 ^ stackIn_15_1) != 0 ||
            null != this.field_c &&
            this.field_c.a((byte) 81, var5.field_c)) {
            System.out.println("TimedSpecialOrderBehaviour timer has changed. before=" + var5.field_c + ", now=" + this.field_c);
            var4 = 1;
          }
          stackIn_23_0 = (null != this.field_b) ? 0 : 1;
          if (var5.field_b != null) {
            stackIn_26_1 = 0;
          } else {
            stackIn_26_1 = 1;
          }
          if ((stackIn_23_0 ^ stackIn_26_1) != 0 ||
            null != this.field_b &&
            this.field_b.a((byte) 91, var5.field_b)) {
            var4 = 1;
            System.out.println("TrailHolder trail has changed. before=" + var5.field_b + ", now=" + this.field_b);
          }
          if (var4 == 0) {
            return;
          }
          System.out.println("This instance of ThrusterBehaviour has changed");
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3 = decompiledCaughtException;
          stackIn_36_0 = var3;
          stackIn_36_1 = new StringBuilder().append("aqa.F(");
          if (param0 == null) {
            stackIn_37_2 = "null";
          } else {
            stackIn_37_2 = "{...}";
          }
          throw rta.a((Throwable) ((Object) stackIn_36_0), ((StringBuilder) (Object) stackIn_36_1).append(stackIn_37_2).append(',').append(param1).append(')').toString());
        }
    }

    public final void b(byte param0, tv param1) {
        aqa var4 = null;
        aqa var3 = null;
        try {
          var4 = (aqa) (param1);
          var3 = var4;
          if (null == this.field_c) {
            var4.field_c = null;
          } else {
            if (var3.field_c == null) {
              var3.field_c = new gqb();
            }
            this.field_c.b((byte) 102, var3.field_c);
          }
          this.field_d = false;
          var3.field_b = this.field_b;
          if (param0 < 54) {
            aqa.b(-40);
          }
          var3.field_d = false;
        } catch (RuntimeException runtimeException) {
          throw rta.a((Throwable) ((Object) runtimeException), "aqa.D(" + param0 + ',' + (param1 != null ? "{...}" : "null") + ')');
        }
    }

    final void b(boolean param0) {
        tbb var2 = null;
        if (this.field_d) {
          return;
        }
        if (null != this.field_b) {
          var2 = this.field_b;
          this.field_b = new tbb();
          var2.b((byte) 112, this.field_b);
          this.field_d = param0 ? true : false;
          return;
        }
    }

    final boolean a(int param0, byte param1) {
        if (param1 == -61) {
          return param0 == 46 ? true : false;
        }
        this.field_d = false;
        return param0 == 46 ? true : false;
    }

    final void a(byte param0, int param1, lta param2, int[] param3) {
        RuntimeException var5 = null;
        RuntimeException stackIn_8_0 = null;
        StringBuilder stackIn_8_1 = null;
        String stackIn_9_2 = null;
        StringBuilder stackIn_11_1 = null;
        String stackIn_12_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          if (param0 != -116) {
            this.a(false, -52);
          }
          if (this.field_b == null) {
            return;
          }
          this.field_b.a(param2, 1325107016, param1);
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var5 = decompiledCaughtException;
          stackIn_8_0 = var5;
          stackIn_8_1 = new StringBuilder().append("aqa.K(").append(param0).append(',').append(param1).append(',');
          if (param2 == null) {
            stackIn_9_2 = "null";
          } else {
            stackIn_9_2 = "{...}";
          }
          stackIn_11_1 = ((StringBuilder) (Object) stackIn_8_1).append(stackIn_9_2).append(',');
          if (param3 == null) {
            stackIn_12_2 = "null";
          } else {
            stackIn_12_2 = "{...}";
          }
          throw rta.a((Throwable) ((Object) stackIn_8_0), ((StringBuilder) (Object) stackIn_11_1).append(stackIn_12_2).append(')').toString());
        }
    }

    final void a(int param0, anb param1, int param2) {
        uj var4 = null;
        RuntimeException var4_ref = null;
        RuntimeException stackIn_10_0 = null;
        StringBuilder stackIn_10_1 = null;
        String stackIn_11_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          if (46 == param0 &&
            !(param1 instanceof sg)) {
            var4 = pca.field_i[5];
            if (this.field_c.field_c > var4.d((byte) 64)) {
              this.field_c.field_c = var4.d((byte) 64);
              param1.d((byte) -55);
            }
          }
          if (param2 == -24213) {
            return;
          }
          this.field_b = (tbb) null;
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var4_ref = decompiledCaughtException;
          stackIn_10_0 = var4_ref;
          stackIn_10_1 = new StringBuilder().append("aqa.P(").append(param0).append(',');
          if (param1 == null) {
            stackIn_11_2 = "null";
          } else {
            stackIn_11_2 = "{...}";
          }
          throw rta.a((Throwable) ((Object) stackIn_10_0), ((StringBuilder) (Object) stackIn_10_1).append(stackIn_11_2).append(',').append(param2).append(')').toString());
        }
    }

    public static void b(int param0) {
        field_a = null;
        if (param0 > -52) {
          aqa.a(115);
        }
    }

    final int a(int param0, boolean param1) {
        int var3;
        var3 = param0;
        if (var3 == 46) {
          return enb.field_c;
        }
        if (var3 == 13) {
          return pwa.field_b;
        }
        if (var3 == 12) {
          return clb.field_a;
        }
        if (param1) {
          return 127;
        }
        return 0;
    }

    final static boolean a(int param0) {
        if (param0 > -53) {
          return false;
        }
        return ho.field_a.a(true);
    }

    public aqa() {
    }

    final void a(boolean param0, anb param1, int param2, int param3, int param4, int[] param5, int param6, int param7, pe param8) {
        RuntimeException stackIn_20_0 = null;
        StringBuilder stackIn_20_1 = null;
        String stackIn_21_2 = null;
        StringBuilder stackIn_23_1 = null;
        String stackIn_24_2 = null;
        StringBuilder stackIn_26_1 = null;
        String stackIn_27_2 = null;
        RuntimeException decompiledCaughtException = null;
        int var10_int = 0;
        RuntimeException var10 = null;
        try {
          if (oua.field_a &&
            null != this.field_b &&
            !param8.c((byte) 33)) {
            this.field_b.a((byte) -128);
            this.field_b.a(param5[3], param5[2], (byte) -125, param5[4], param5[2] + param5[4] >> 1, param5[5], param5[3] + param5[5] >> 1);
          }
          if (param4 == 46) {
            var10_int = pca.field_i[5].d((byte) 64);
            if (param0) {
              if (this.field_c.field_c > var10_int) {
                this.field_c.field_c = var10_int;
                param1.d((byte) -82);
              }
              return;
            }
            if (0 < this.field_c.field_c) {
              this.field_c.field_c = this.field_c.field_c - 1;
              param1.d((byte) -128);
            }
            if (this.field_c.field_c > var10_int) {
              rmb.a(param3, param1.field_l + param8.d(1000).length, 2, -64, param7);
              this.a(param8, 256, param2, param6 + 31501, param7, param5, param4, param3, param1);
            }
          }
          if (param6 == -31501) {
            return;
          }
          this.field_c = (gqb) null;
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var10 = decompiledCaughtException;
          stackIn_20_0 = var10;
          stackIn_20_1 = new StringBuilder().append("aqa.M(").append(param0).append(',');
          if (param1 == null) {
            stackIn_21_2 = "null";
          } else {
            stackIn_21_2 = "{...}";
          }
          stackIn_23_1 = ((StringBuilder) (Object) stackIn_20_1).append(stackIn_21_2).append(',').append(param2).append(',').append(param3).append(',').append(param4).append(',');
          if (param5 == null) {
            stackIn_24_2 = "null";
          } else {
            stackIn_24_2 = "{...}";
          }
          stackIn_26_1 = ((StringBuilder) (Object) stackIn_23_1).append(stackIn_24_2).append(',').append(param6).append(',').append(param7).append(',');
          if (param8 == null) {
            stackIn_27_2 = "null";
          } else {
            stackIn_27_2 = "{...}";
          }
          throw rta.a((Throwable) ((Object) stackIn_20_0), ((StringBuilder) (Object) stackIn_26_1).append(stackIn_27_2).append(')').toString());
        }
    }

    final void a(boolean param0, int param1, int param2, int param3, int param4, anb param5, int[] param6, int[] param7, pe param8, int param9, int param10, int param11, int param12, int param13) {
        RuntimeException stackIn_12_0 = null;
        StringBuilder stackIn_12_1 = null;
        String stackIn_13_2 = null;
        StringBuilder stackIn_15_1 = null;
        String stackIn_16_2 = null;
        StringBuilder stackIn_18_1 = null;
        String stackIn_19_2 = null;
        StringBuilder stackIn_21_1 = null;
        String stackIn_22_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var15 = null;
        uj var16 = null;
        try {
          if (param13 == 46) {
            if (this.field_c.field_c <= 0) {
              var16 = pca.field_i[5];
              this.field_c.field_c = var16.d((byte) 64) + var16.b(-25131);
              param5.d((byte) -57);
            }
          } else {
            if (param13 != 12) {
              rmb.a(param3, param5.field_l, 69, 87, param2);
            }
            this.a(param8, param11, param9, 0, param2, param7, param13, param3, param5);
          }
          if (param0) {
            return;
          }
          aqa.a(-31);
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var15 = decompiledCaughtException;
          stackIn_12_0 = var15;
          stackIn_12_1 = new StringBuilder().append("aqa.I(").append(param0).append(',').append(param1).append(',').append(param2).append(',').append(param3).append(',').append(param4).append(',');
          if (param5 == null) {
            stackIn_13_2 = "null";
          } else {
            stackIn_13_2 = "{...}";
          }
          stackIn_15_1 = ((StringBuilder) (Object) stackIn_12_1).append(stackIn_13_2).append(',');
          if (param6 == null) {
            stackIn_16_2 = "null";
          } else {
            stackIn_16_2 = "{...}";
          }
          stackIn_18_1 = ((StringBuilder) (Object) stackIn_15_1).append(stackIn_16_2).append(',');
          if (param7 == null) {
            stackIn_19_2 = "null";
          } else {
            stackIn_19_2 = "{...}";
          }
          stackIn_21_1 = ((StringBuilder) (Object) stackIn_18_1).append(stackIn_19_2).append(',');
          if (param8 == null) {
            stackIn_22_2 = "null";
          } else {
            stackIn_22_2 = "{...}";
          }
          throw rta.a((Throwable) ((Object) stackIn_12_0), ((StringBuilder) (Object) stackIn_21_1).append(stackIn_22_2).append(',').append(param9).append(',').append(param10).append(',').append(param11).append(',').append(param12).append(',').append(param13).append(')').toString());
        }
    }

    public final void a(faa param0, boolean param1) {
        RuntimeException var3 = null;
        int var4 = 0;
        tv var5 = null;
        RuntimeException stackIn_15_0 = null;
        StringBuilder stackIn_15_1 = null;
        String stackIn_16_2 = null;
        RuntimeException decompiledCaughtException = null;
        var4 = VoidHunters.field_G;
        try {
          if (param1) {
            var5 = (tv) null;
            this.a((byte) 111, (tv) null);
          }
          if (!kv.a(param1, param0)) {
            this.field_c = null;
          } else {
            if (null == this.field_c) {
              this.field_c = new gqb();
            }
            this.field_c.a(param0, false);
          }
          if (!kv.a(param1, param0)) {
            this.field_b = null;
            return;
          }
          this.field_b = new tbb();
          this.field_b.a(param0, false);
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3 = decompiledCaughtException;
          stackIn_15_0 = var3;
          stackIn_15_1 = new StringBuilder().append("aqa.H(");
          if (param0 == null) {
            stackIn_16_2 = "null";
          } else {
            stackIn_16_2 = "{...}";
          }
          throw rta.a((Throwable) ((Object) stackIn_15_0), ((StringBuilder) (Object) stackIn_15_1).append(stackIn_16_2).append(',').append(param1).append(')').toString());
        }
    }

    aqa(int param0) {
        if (param0 == 46) {
          this.field_c = new gqb();
        }
    }

    static {
    }
}
