/*
 * Decompiled by CFR-JS 0.4.0.
 */
import java.util.*;

final class qjb implements ntb {
    int field_b;
    int field_c;
    static int field_d;
    private odb field_e;
    static String field_a;

    final int e(byte param0) {
        int var2 = 114 / ((param0 - 78) / 43);
        if (1 == fra.field_a) {
          return 2048;
        }
        return this.a((byte) 24).c(0);
    }

    final int a(int param0) {
        if (!this.a((byte) 24).h((byte) 38)) {
          return 0;
        }
        if (param0 < 67) {
          return 87;
        }
        return 256 * this.field_b / Math.max(1, this.a((byte) 24).f((byte) 118));
    }

    final boolean b(byte param0) {
        int var2;
        boolean stackIn_5_0 = false;
        var2 = -28 % ((74 - param0) / 38);
        stackIn_5_0 = (this.field_b <= 0) && (this.field_c != 9) && (this.field_c != 5);
        return stackIn_5_0;
    }

    public final void a(faa param0, boolean param1) {
        RuntimeException stackIn_9_0 = null;
        StringBuilder stackIn_9_1 = null;
        String stackIn_10_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var3 = null;
        try {
          this.field_b = param0.i(0, 16);
          this.field_c = param0.i(0, 4);
          if (kv.a(param1, param0)) {
            if (this.field_e == null) {
              this.field_e = new odb();
            }
            this.field_e.a(param0, param1);
          } else {
            this.field_e = null;
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3 = decompiledCaughtException;
          stackIn_9_0 = var3;
          stackIn_9_1 = new StringBuilder().append("qjb.H(");
          if (param0 == null) {
            stackIn_10_2 = "null";
          } else {
            stackIn_10_2 = "{...}";
          }
          throw rta.a((Throwable) ((Object) stackIn_9_0), ((StringBuilder) (Object) stackIn_9_1).append(stackIn_10_2).append(',').append(param1).append(')').toString());
        }
    }

    public final void a(tv param0, int param1) {
        int stackIn_12_0 = 0;
        int stackIn_15_1 = 0;
        RuntimeException stackIn_27_0 = null;
        StringBuilder stackIn_27_1 = null;
        String stackIn_28_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var3 = null;
        int var4 = 0;
        qjb var5 = null;
        try {
          var5 = (qjb) (param0);
          if (this.field_e != null &&
            var5.field_e != null) {
            this.field_e.a(var5.field_e, -104);
          }
          var4 = 0;
          if (var5.field_b != this.field_b) {
            var4 = 1;
            System.out.println("int reload has changed. before=" + var5.field_b + ", now=" + this.field_b);
          }
          if (this.field_c != var5.field_c) {
            var4 = 1;
            System.out.println("int weapontype has changed. before=" + var5.field_c + ", now=" + this.field_c);
          }
          stackIn_12_0 = (null != this.field_e) ? 0 : 1;
          if (null != var5.field_e) {
            stackIn_15_1 = 0;
          } else {
            stackIn_15_1 = 1;
          }
          if ((stackIn_12_0 ^ stackIn_15_1) != 0 ||
            null != this.field_e &&
            this.field_e.a((byte) -43, var5.field_e)) {
            System.out.println("TargetLock target_lock has changed. before=" + var5.field_e + ", now=" + this.field_e);
            var4 = 1;
          }
          if (param1 >= -19) {
            this.field_e = (odb) null;
          }
          if (var4 != 0) {
            System.out.println("This instance of WeaponBehaviour has changed");
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3 = decompiledCaughtException;
          stackIn_27_0 = var3;
          stackIn_27_1 = new StringBuilder().append("qjb.F(");
          if (param0 == null) {
            stackIn_28_2 = "null";
          } else {
            stackIn_28_2 = "{...}";
          }
          throw rta.a((Throwable) ((Object) stackIn_27_0), ((StringBuilder) (Object) stackIn_27_1).append(stackIn_28_2).append(',').append(param1).append(')').toString());
        }
    }

    final odb c(int param0) {
        if (param0 != 2) {
          this.field_b = 37;
        }
        return this.field_e;
    }

    final boolean b(boolean param0) {
        mfb var2;
        boolean stackIn_8_0 = false;
        if (!param0) {
          this.e((byte) 111);
        }
        boolean decompiledFrameRemainder0 = true;
        var2 = this.a((byte) 24);
        if (this.field_b != var2.f((byte) 127) && (!var2.i(1024) ||
          !(this.field_b > var2.f((byte) 32) - var2.c((byte) -50)))) {
          stackIn_8_0 = false;
          decompiledFrameRemainder0 = false;
        }
        else {
          stackIn_8_0 = true;
        }
        return stackIn_8_0;
    }

    final mfb a(byte param0) {
        if (param0 != 24) {
          field_d = -84;
        }
        return ema.field_o[this.field_c];
    }

    final void a(boolean param0, boolean param1) {
        if (!param1) {
          this.a(73);
        }
    }

    final boolean d(int param0) {
        if (param0 != 6) {
          ml var3 = (ml) null;
          this.a(-39, -35, 81, (wfb) null, (ml) null);
        }
        return !this.a((byte) 24).e(118) ? true : false;
    }

    final int d(byte param0) {
        if (param0 <= 106) {
          mfb var3 = (mfb) null;
          this.a(107, -16, 116, -66, 72, -61, -84, 43, -112, 41, (anb) null, 15, 117, -19, -92, (pe) null, (mfb) null);
        }
        return this.a((byte) 24).b(-105);
    }

    private final void a(int param0, int param1, int param2, int param3, int param4, int param5, int param6, int param7, int param8, int param9, anb param10, int param11, int param12, int param13, int param14, pe param15, mfb param16) {
        RuntimeException stackIn_34_0 = null;
        StringBuilder stackIn_34_1 = null;
        String stackIn_35_2 = null;
        StringBuilder stackIn_37_1 = null;
        String stackIn_38_2 = null;
        StringBuilder stackIn_40_1 = null;
        String stackIn_41_2 = null;
        RuntimeException decompiledCaughtException = null;
        int var18_int = 0;
        RuntimeException var18 = null;
        int var19 = 0;
        int var20 = 0;
        int var21 = 0;
        int var22 = 0;
        int var23 = 0;
        int var24 = 0;
        int var25 = 0;
        int var26 = 0;
        int var27 = 0;
        int var28 = 0;
        Random var29 = null;
        int var30 = 0;
        int var31 = 0;
        int var32 = 0;
        int var33 = 0;
        int var34 = 0;
        int var35 = 0;
        tj var36 = null;
        int var37 = 0;
        int var33Lifetime1;
        int var34Lifetime1;
        int var35Lifetime1;
        var37 = VoidHunters.field_G;
        try {
          var18_int = param16.b(false);
          var19 = param16.g((byte) -48);
          var20 = param16.h((byte) 105) ? 1 : 0;
          var21 = param16.d((byte) -106);
          var22 = param16.a((byte) 9);
          var23 = param16.k(0);
          this.field_b = param1;
          var24 = var21 * (param14 >> 4) >> 12;
          var25 = var21 * (param6 >> 4) >> 12;
          if (var20 != 0) {
            param10.a(var18_int * -var25, param5, param8, (byte) -125, var18_int * -var24);
          }
          var26 = var24 * aq.field_o + param10.c((byte) -126);
          var28 = 47 % ((15 - param2) / 63);
          var27 = var25 * aq.field_o + param10.f(0);
          if (param16.e(-34)) {
            var27 = -param7 + param11;
            var26 = param0 - param13;
          }
          var29 = new Random((long)param13);
          var30 = param13 + (param14 >> 8);
          var31 = param7 + (param6 >> 8);
          var32 = param16.g(2769);
          if (param16.e((byte) -63) > 0) {
            var33 = param16.f((byte) 30) - this.field_b;
            var34 = param16.c((byte) -111);
            var35 = -var33 + var34;
            if (var35 < param16.e((byte) -63)) {
              var32 = var32 * var35 / param16.e((byte) -63);
            }
          }
          if (!param16.c(true)) {
            if (6 == this.field_c ||
              11 == this.field_c ||
              this.field_c == 9) {
              param12 = 0;
            }
          } else {
            param12 = sqb.a(-param7 + param11 >> 6, 77, param0 - param13 >> 6);
          }
          for (var33Lifetime1 = 0; var33Lifetime1 < var18_int; var33Lifetime1++) {
            var34Lifetime1 = 0;
            var35Lifetime1 = 0;
            if (0 < var19) {
              var34Lifetime1 = hob.a(var29, var19 << 1, 124) - var19;
              var35Lifetime1 = -var19 + hob.a(var29, var19 << 1, 121);
            }
            var36 = new tj(var30, var31, var26 + var34Lifetime1, var27 + var35Lifetime1, param12, var22, param3, param9, var23, var32);
            param15.a(var36, false);
          }
          if (this.field_c != 6 &&
            this.field_c != 9 &&
            this.field_c != 11) {
            param15.a(5, param10.c((byte) -121) + (var24 >> eta.field_b), 20, 20, 30273, param13, 500, param7, param10.f(0) + (var25 >> eta.field_b));
          }
          if (this.field_c == 9 &&
            param4 >= 0) {
            rmb.a(param7, param10.field_l, param4, -39, param13);
            return;
          }
          if (param4 >= 0) {
            qba.a(20382, param13, param4, param7, 5);
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var18 = decompiledCaughtException;
          stackIn_34_0 = var18;
          stackIn_34_1 = new StringBuilder().append("qjb.L(").append(param0).append(',').append(param1).append(',').append(param2).append(',').append(param3).append(',').append(param4).append(',').append(param5).append(',').append(param6).append(',').append(param7).append(',').append(param8).append(',').append(param9).append(',');
          if (param10 == null) {
            stackIn_35_2 = "null";
          } else {
            stackIn_35_2 = "{...}";
          }
          stackIn_37_1 = ((StringBuilder) (Object) stackIn_34_1).append(stackIn_35_2).append(',').append(param11).append(',').append(param12).append(',').append(param13).append(',').append(param14).append(',');
          if (param15 == null) {
            stackIn_38_2 = "null";
          } else {
            stackIn_38_2 = "{...}";
          }
          stackIn_40_1 = ((StringBuilder) (Object) stackIn_37_1).append(stackIn_38_2).append(',');
          if (param16 == null) {
            stackIn_41_2 = "null";
          } else {
            stackIn_41_2 = "{...}";
          }
          throw rta.a((Throwable) ((Object) stackIn_34_0), ((StringBuilder) (Object) stackIn_40_1).append(stackIn_41_2).append(')').toString());
        }
    }

    final boolean c(byte param0) {
        if (param0 <= 71) {
          this.a(126);
        }
        return this.field_c == 6 ? true : false;
    }

    final void a(pe param0, boolean param1, int param2, int param3, int param4, anb param5, int param6, int param7, int param8, int param9, int param10, int[] param11) {
        RuntimeException stackIn_69_0 = null;
        StringBuilder stackIn_69_1 = null;
        String stackIn_70_2 = null;
        StringBuilder stackIn_72_1 = null;
        String stackIn_73_2 = null;
        StringBuilder stackIn_75_1 = null;
        String stackIn_76_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var13 = null;
        int var14 = 0;
        int var15 = 0;
        int var16 = 0;
        int var17 = 0;
        int var18 = 0;
        int var19 = 0;
        int var20 = 0;
        int var21 = 0;
        int var22 = 0;
        int var23 = 0;
        Object var24 = null;
        sg var25 = null;
        int var25_int = 0;
        aoa var26 = null;
        int var26_int = 0;
        int var27 = 0;
        int var28 = 0;
        anb var29 = null;
        int var30 = 0;
        int var31 = 0;
        int var32 = 0;
        int var33 = 0;
        mfb var34 = null;
        Object var35 = null;
        sg var35_ref = null;
        int var14Lifetime1;
        int var20Lifetime1;
        int var21Lifetime1;
        int var25_intLifetime1;
        int var26_intLifetime1;
        int var27Lifetime1;
        int var28Lifetime1;
        var35 = null;
        var33 = VoidHunters.field_G;
        try {
          var34 = this.a((byte) 24);
          if (var34.b((byte) 34) > 0) {
            this.field_b = this.field_b + var34.f(1024);
            var14 = var34.b((byte) 82);
            if (this.field_b > var14) {
              this.field_b = var14;
            }
            return;
          }
          var14Lifetime1 = -90 / ((param4 - 6) / 33);
          if (this.field_b > 0 &&
            !param1) {
            if (this.field_c != 9) {
              return;
            }
            if (this.field_b <= -upb.field_a + fja.field_o) {
              return;
            }
          }
          var15 = fc.a(param8, (byte) 123);
          var16 = eu.a(param8, 96);
          var17 = (-(param10 * var16) + var15 * param2 >> 16) + param9;
          var18 = (var15 * param10 + var16 * param2 >> 16) + param7;
          var19 = 0;
          for (var20 = 0; var20 < param11.length; var20 += 2) {
            var21 = param11[var20];
            if (var19 < var21) {
              var19 = var21;
            }
          }
          var20Lifetime1 = param9 + (var15 * (256 + var19) >> 16);
          var21Lifetime1 = (var16 * (256 + var19) >> 16) + param7;
          var22 = -1;
          var23 = -1;
          var24 = null;
          if (param5 instanceof sg) {
            var35_ref = (sg) (param5);
            var24 = var35_ref;
            var22 = var35_ref.q((byte) 86);
            var23 = var35_ref.o((byte) -117);
            if (null != var35_ref.k((byte) -108)) {
              var23 = var35_ref.k((byte) -108).a((byte) 80);
            }
          }
          if (2 == this.field_c) {
            if (var23 >= 0 &&
              param0.e(var23, (byte) -99) >= wk.field_a) {
              return;
            }
            var25 = gqb.a(false);
            var25.a(var20Lifetime1, var21Lifetime1, (byte) 118);
            var25.a(param8, -122);
            var25.h(17704, var22);
            var25.g(-1, -111);
            var26 = new aoa();
            var26.a(var23, true);
            var25.a(var26, 4);
            var25.a(var21Lifetime1, param8, var20Lifetime1, 500, 1948934248);
            param0.a(var25, (byte) 72);
            this.field_b = var34.f((byte) 77);
            eib.a(6811, var34.a(false), 1 + this.field_b / 2);
            return;
          }
          if (this.field_c == 10) {
            this.field_b = oq.field_a;
            qba.a(20382, var20Lifetime1, var34.a(false), var21Lifetime1, this.field_b / 2 + 1);
            return;
          }
          if (!var34.c(true) &&
            !param1 &&
            0 == di.field_p) {
            var25_int = param3 - var17;
            var26_int = -var18 + param6;
            var27 = ecb.a(var26_int, (byte) -77, var25_int);
            var28 = rrb.a(22433, var27 - param8);
            if (Math.abs(var28) > var34.d(27918)) {
              return;
            }
          }
          if (!param1 &&
            var34.i(1024) &&
            this.field_b > 0) {
            return;
          }
          var25_intLifetime1 = -1;
          var26_intLifetime1 = var34.f((byte) 64);
          var27Lifetime1 = 0;
          if (0 >= var34.c((byte) -106)) {
            var25_intLifetime1 = var34.a(false);
          } else {
            if (this.field_b == 0) {
              var27Lifetime1 = 1;
              var25_intLifetime1 = var34.a(false);
            } else {
              var26_intLifetime1 = this.field_b;
            }
          }
          var28Lifetime1 = var34.a(0);
          if (var24 != null &&
            !((sg) (var24)).a((byte) 11, var28Lifetime1)) {
            if (fra.field_a != 1) {
              return;
            }
            if (!param1) {
              return;
            }
            if (var27Lifetime1 != 0) {
              return;
            }
          }
          if (!this.c((byte) 101)) {
            this.a(param3, var26_intLifetime1, 113, var22, var25_intLifetime1, param9, var16, var21Lifetime1, param7, var23, param5, param6, param8, var20Lifetime1, var15, param0, var34);
            return;
          }
          if (!param1) {
            if (this.field_e == null) {
              this.field_e = new odb();
            }
            var29 = param0.a(true, param6, param3, ((sg) (var24)).q((byte) 83));
            var30 = 0;
            if (var29 != null) {
              var31 = -param3 + var29.field_d;
              var32 = var29.field_e - param6;
              if (ar.a(var31, (byte) 112, var32) <= var29.b(true) + 32768) {
                this.field_e.field_a = var29.c(false);
                this.field_e.field_d = param3 - var29.d(false);
                this.field_e.field_c = -var29.g((byte) -122) + param6;
                var30 = 1;
              }
            }
            if (var30 == 0) {
              this.field_e.field_a = -1;
              this.field_e.field_d = -param5.d(false) + param3;
              this.field_e.field_c = -param5.g((byte) 123) + param6;
            }
          }
          this.a(param3, var26_intLifetime1, 113, var22, var25_intLifetime1, param9, var16, var21Lifetime1, param7, var23, param5, param6, param8, var20Lifetime1, var15, param0, var34);
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var13 = decompiledCaughtException;
          stackIn_69_0 = var13;
          stackIn_69_1 = new StringBuilder().append("qjb.P(");
          if (param0 == null) {
            stackIn_70_2 = "null";
          } else {
            stackIn_70_2 = "{...}";
          }
          stackIn_72_1 = ((StringBuilder) (Object) stackIn_69_1).append(stackIn_70_2).append(',').append(param1).append(',').append(param2).append(',').append(param3).append(',').append(param4).append(',');
          if (param5 == null) {
            stackIn_73_2 = "null";
          } else {
            stackIn_73_2 = "{...}";
          }
          stackIn_75_1 = ((StringBuilder) (Object) stackIn_72_1).append(stackIn_73_2).append(',').append(param6).append(',').append(param7).append(',').append(param8).append(',').append(param9).append(',').append(param10).append(',');
          if (param11 == null) {
            stackIn_76_2 = "null";
          } else {
            stackIn_76_2 = "{...}";
          }
          throw rta.a((Throwable) ((Object) stackIn_69_0), ((StringBuilder) (Object) stackIn_75_1).append(stackIn_76_2).append(')').toString());
        }
    }

    public final void b(byte param0, tv param1) {
        qjb var3 = null;
        qjb var4 = null;
        RuntimeException stackIn_10_0 = null;
        StringBuilder stackIn_10_1 = null;
        String stackIn_11_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var3_ref = null;
        try {
          var4 = (qjb) (param1);
          var3 = var4;
          var4.field_c = this.field_c;
          var4.field_b = this.field_b;
          if (this.field_e != null) {
            if (null == var3.field_e) {
              var3.field_e = new odb();
            }
            this.field_e.b((byte) 79, var3.field_e);
          } else {
            var4.field_e = null;
          }
          if (param0 < 54) {
            field_d = -90;
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3_ref = decompiledCaughtException;
          stackIn_10_0 = var3_ref;
          stackIn_10_1 = new StringBuilder().append("qjb.D(").append(param0).append(',');
          if (param1 == null) {
            stackIn_11_2 = "null";
          } else {
            stackIn_11_2 = "{...}";
          }
          throw rta.a((Throwable) ((Object) stackIn_10_0), ((StringBuilder) (Object) stackIn_10_1).append(stackIn_11_2).append(')').toString());
        }
    }

    public final boolean a(byte param0, tv param1) {
        qjb var3 = null;
        int var4 = 0;
        int stackIn_5_0 = 0;
        int stackIn_8_1 = 0;
        boolean stackIn_14_0 = false;
        RuntimeException stackIn_17_0 = null;
        StringBuilder stackIn_17_1 = null;
        String stackIn_18_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var3_ref = null;
        try {
          boolean decompiledFrameRemainder0 = true;
          var4 = -72 / ((22 - param0) / 59);
          var3 = (qjb) (param1);
          if (var3.field_b == this.field_b &&
            var3.field_c == this.field_c) {
            stackIn_5_0 = (null != this.field_e) ? 0 : 1;
            if (var3.field_e != null) {
              stackIn_8_1 = 0;
            } else {
              stackIn_8_1 = 1;
            }
            if ((stackIn_5_0 ^ stackIn_8_1) == 0 && (this.field_e == null ||
              !this.field_e.a((byte) 91, var3.field_e))) {
              stackIn_14_0 = false;
              decompiledFrameRemainder0 = false;
            }
          }
          if (decompiledFrameRemainder0) {
            stackIn_14_0 = true;
          }
          return stackIn_14_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3_ref = decompiledCaughtException;
          stackIn_17_0 = var3_ref;
          stackIn_17_1 = new StringBuilder().append("qjb.C(").append(param0).append(',');
          if (param1 == null) {
            stackIn_18_2 = "null";
          } else {
            stackIn_18_2 = "{...}";
          }
          throw rta.a((Throwable) ((Object) stackIn_17_0), ((StringBuilder) (Object) stackIn_17_1).append(stackIn_18_2).append(')').toString());
        }
    }

    public final void b(faa param0, int param1) {
        faa stackIn_4_0 = null;
        int stackIn_4_1 = 0;
        boolean stackIn_5_2 = false;
        RuntimeException stackIn_11_0 = null;
        StringBuilder stackIn_11_1 = null;
        String stackIn_12_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var3 = null;
        try {
          param0.a(-632, this.field_b, 16);
          if (param1 > -109) {
            this.e((byte) -18);
          }
          param0.a(-632, this.field_c, 4);
          stackIn_4_0 = (faa) (param0);
          stackIn_4_1 = -103;
          stackIn_5_2 = (null != this.field_e);
          if (vq.a(stackIn_4_0, stackIn_4_1, stackIn_5_2)) {
            this.field_e.b(param0, -126);
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3 = decompiledCaughtException;
          stackIn_11_0 = var3;
          stackIn_11_1 = new StringBuilder().append("qjb.B(");
          if (param0 == null) {
            stackIn_12_2 = "null";
          } else {
            stackIn_12_2 = "{...}";
          }
          throw rta.a((Throwable) ((Object) stackIn_11_0), ((StringBuilder) (Object) stackIn_11_1).append(stackIn_12_2).append(',').append(param1).append(')').toString());
        }
    }

    public static void c(boolean param0) {
        field_a = null;
        if (!param0) {
          qjb.c(false);
        }
    }

    qjb() {
    }

    final void a(int param0, anb param1, int[] param2, int param3, int param4, boolean param5, int param6, int param7, pe param8) {
        RuntimeException stackIn_15_0 = null;
        StringBuilder stackIn_15_1 = null;
        String stackIn_16_2 = null;
        StringBuilder stackIn_18_1 = null;
        String stackIn_19_2 = null;
        StringBuilder stackIn_21_1 = null;
        String stackIn_22_2 = null;
        RuntimeException decompiledCaughtException = null;
        int var10_int = 0;
        RuntimeException var10 = null;
        uwa var11 = null;
        mfb var12 = null;
        try {
          if (0 < this.field_b) {
            this.field_b = this.field_b - 1;
            param1.d((byte) 87);
          }
          if (this.field_c == 10 &&
            oq.field_a - oq.field_n < this.field_b) {
            var10_int = oq.field_a - this.field_b;
            var11 = ccb.field_a.a(0);
            var11.a(-1, param4, param0, bpa.field_a / oq.field_n * var10_int, 1, 0, (byte) 69, param1, param7, 0);
          }
          var12 = this.a((byte) 24);
          if (var12.i(1024) &&
            this.field_b > var12.f((byte) 113) - var12.c((byte) 124)) {
            this.a(param8, true, param6, 0, -127, param1, 0, param4, param7, param0, param3, param2);
          }
          if (!param5) {
            this.b(-89);
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var10 = decompiledCaughtException;
          stackIn_15_0 = var10;
          stackIn_15_1 = new StringBuilder().append("qjb.M(").append(param0).append(',');
          if (param1 == null) {
            stackIn_16_2 = "null";
          } else {
            stackIn_16_2 = "{...}";
          }
          stackIn_18_1 = ((StringBuilder) (Object) stackIn_15_1).append(stackIn_16_2).append(',');
          if (param2 == null) {
            stackIn_19_2 = "null";
          } else {
            stackIn_19_2 = "{...}";
          }
          stackIn_21_1 = ((StringBuilder) (Object) stackIn_18_1).append(stackIn_19_2).append(',').append(param3).append(',').append(param4).append(',').append(param5).append(',').append(param6).append(',').append(param7).append(',');
          if (param8 == null) {
            stackIn_22_2 = "null";
          } else {
            stackIn_22_2 = "{...}";
          }
          throw rta.a((Throwable) ((Object) stackIn_15_0), ((StringBuilder) (Object) stackIn_21_1).append(stackIn_22_2).append(')').toString());
        }
    }

    final void b(int param0) {
        this.field_e = null;
        if (param0 != 2048) {
          field_d = 124;
        }
    }

    qjb(int param0) {
        this.field_c = param0;
    }

    final boolean a(int param0, int param1, int param2, wfb param3, ml param4) {
        int var6_int = 0;
        RuntimeException var6 = null;
        int var7 = 0;
        int var8 = 0;
        int var9 = 0;
        int var10 = 0;
        int var11 = 0;
        int var12 = 0;
        int var13 = 0;
        boolean stackIn_9_0 = false;
        RuntimeException stackIn_12_0 = null;
        StringBuilder stackIn_12_1 = null;
        String stackIn_13_2 = null;
        StringBuilder stackIn_15_1 = null;
        String stackIn_16_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          var6_int = param4.c(param0 + 26894);
          if (var6_int == 0) {
            return false;
          }
          if (param0 != -26772) {
            this.field_b = 95;
          }
          var7 = param4.a(param3, (byte) -69);
          var8 = param4.a(-119, param3);
          var9 = param4.g((byte) -127);
          var10 = param2 - var7;
          var11 = param1 - var8;
          var12 = ecb.a(var11, (byte) -77, var10);
          var13 = rrb.a(22433, var12 - var9);
          stackIn_9_0 = !(Math.abs(var13) > var6_int);
          return stackIn_9_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var6 = decompiledCaughtException;
          stackIn_12_0 = var6;
          stackIn_12_1 = new StringBuilder().append("qjb.T(").append(param0).append(',').append(param1).append(',').append(param2).append(',');
          if (param3 == null) {
            stackIn_13_2 = "null";
          } else {
            stackIn_13_2 = "{...}";
          }
          stackIn_15_1 = ((StringBuilder) (Object) stackIn_12_1).append(stackIn_13_2).append(',');
          if (param4 == null) {
            stackIn_16_2 = "null";
          } else {
            stackIn_16_2 = "{...}";
          }
          throw rta.a((Throwable) ((Object) stackIn_12_0), ((StringBuilder) (Object) stackIn_15_1).append(stackIn_16_2).append(')').toString());
        }
    }

    final boolean a(boolean param0) {
        if (!param0) {
          this.field_c = -50;
          return false;
        }
        return false;
    }

    static {
        field_d = 1;
        field_a = "Choose the mutators";
    }
}
