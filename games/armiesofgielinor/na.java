/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class na extends tj implements mf, he {
    static me field_G;
    private ma field_P;
    static int field_E;
    kv field_M;
    static String field_K;
    private fw field_L;
    static String field_I;
    static int field_F;
    private fw field_O;
    static String field_N;
    static int[] field_J;

    public na() {
        super(0, 0, 496, 0, (kh) null);
        this.field_P = new ma("", (qo) null, 12);
        lk var1 = new lk(gl.field_e, 0, 0, 0, 0, 16777215, -1, 3, 0, ArmiesOfGielinor.field_J.field_H, -1, 2147483647, true);
        kb var2 = new kb(iu.field_u, var1, (qo) null);
        this.field_O = new fw(ul.field_f, (qo) null);
        this.field_L = new fw(ac.field_s, (qo) null);
        this.field_P.field_s = ms.field_m;
        this.field_P.a((byte) 16, new uj(this.field_P));
        this.field_O.field_I = false;
        this.field_O.field_k = (kh) ((Object) new nu());
        this.field_L.field_k = (kh) ((Object) new td());
        this.field_P.field_k = (kh) ((Object) new lu(10000536));
        int var3 = 20;
        int var4 = 4;
        int var5 = 200;
        var2.a(20, 270, var3, 8192, 50);
        var3 += 50;
        this.a((byte) 10, var2);
        var3 = var3 + (5 + this.a(-124, fq.field_k, dn.field_Ob, 170, var3, this.field_P));
        this.field_O.a(496 - var5 >> 1, var5, var3, 8192, 40);
        this.field_L.a(var4 + 3, 60, var3 + 15, 8192, 40);
        this.field_L.field_x = (qo) (this);
        this.field_O.field_x = (qo) (this);
        this.a((byte) 10, (kb) (this.field_O));
        this.a((byte) 10, (kb) (this.field_L));
        this.field_M = new kv((mf) (this));
        this.field_M.a(60 + (this.field_P.field_B + this.field_P.field_l), -60 + (-this.field_P.field_B + (this.field_l - this.field_P.field_l)), 20, 8192, 150);
        this.a((byte) 10, (kb) (this.field_M));
        this.a(0, 496, 0, 8192, var4 + var3 + 55);
    }

    public final void a(int param0, int param1, int param2, int param3, fw param4) {
        RuntimeException var6 = null;
        RuntimeException stackIn_9_0 = null;
        StringBuilder stackIn_9_1 = null;
        String stackIn_10_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          if (param1 != 11) {
            this.field_L = (fw) null;
          }
          if (param4 == this.field_L) {
            ou.b((byte) 115);
            return;
          }
          if (param4 != this.field_O) {
            return;
          }
          this.b(false);
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var6 = decompiledCaughtException;
          stackIn_9_0 = var6;
          stackIn_9_1 = new StringBuilder().append("na.N(").append(param0).append(',').append(param1).append(',').append(param2).append(',').append(param3).append(',');
          if (param4 == null) {
            stackIn_10_2 = "null";
          } else {
            stackIn_10_2 = "{...}";
          }
          throw ig.addExceptionContext((Throwable) ((Object) stackIn_9_0), ((StringBuilder) (Object) stackIn_9_1).append(stackIn_10_2).append(')').toString());
        }
    }

    public final void a(byte param0) {
        int discarded$0 = 0;
        ((uj) (this.field_P.a(param0 - 918933514))).g(50);
        if (param0 != -116) {
          String var3 = (String) null;
          discarded$0 = this.a(-47, 45, (String) null, (kb) null, 47, (String) null, -7);
        }
    }

    final void a(int param0, int param1, int param2, kb param3) {
        try {
          super.a(param0 ^ 0, param1, param2, param3);
          if (param0 != 32722) {
            this.field_O = (fw) null;
          }
          this.field_O.field_I = this.a(-29967);
        } catch (RuntimeException runtimeException) {
          throw ig.addExceptionContext((Throwable) ((Object) runtimeException), "na.P(" + param0 + ',' + param1 + ',' + param2 + ',' + (param3 != null ? "{...}" : "null") + ')');
        }
    }

    private final boolean a(boolean param0, eg param1) {
        n var3 = null;
        RuntimeException var3_ref = null;
        gu var4 = null;
        boolean stackIn_10_0 = false;
        RuntimeException stackIn_13_0 = null;
        StringBuilder stackIn_13_1 = null;
        String stackIn_14_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          if (!param0) {
            return false;
          }
          var3 = param1.a(-918933630);
          if (var3 == null) {
            return true;
          }
          var4 = var3.a(false);
          stackIn_10_0 = (var4 == oo.field_g);
          return stackIn_10_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3_ref = decompiledCaughtException;
          stackIn_13_0 = var3_ref;
          stackIn_13_1 = new StringBuilder().append("na.K(").append(param0).append(',');
          if (param1 == null) {
            stackIn_14_2 = "null";
          } else {
            stackIn_14_2 = "{...}";
          }
          throw ig.addExceptionContext((Throwable) ((Object) stackIn_13_0), ((StringBuilder) (Object) stackIn_13_1).append(stackIn_14_2).append(')').toString());
        }
    }

    private final boolean a(int param0) {
        if (param0 != -29967) {
          return false;
        }
        if (!this.a(true, (eg) (this.field_P))) {
          return false;
        }
        return true;
    }

    private final void b(boolean param0) {
        if (param0) {
          return;
        }
        if (!this.a(-29967)) {
          return;
        }
        TelepopEvent.a(param0, this.field_P.field_v);
    }

    final static void c(int param0, int param1, int param2, int param3, int param4) {
        int stackIn_4_0 = 0;
        int stackIn_7_0 = 0;
        int stackIn_10_0 = 0;
        int stackIn_13_0 = 0;
        RuntimeException decompiledCaughtException = null;
        int var5_int = 0;
        RuntimeException var5 = null;
        int var6 = 0;
        int var7 = 0;
        int var8 = 0;
        int var9 = 0;
        int var10 = 0;
        int var11 = 0;
        int var12 = 0;
        int var13 = 0;
        int var14 = 0;
        int var11Lifetime1;
        int var11Lifetime2;
        int var12Lifetime1;
        int var12Lifetime2;
        int var12Lifetime3;
        int var13Lifetime1;
        var14 = ArmiesOfGielinor.obfuscationControl ? 1 : 0;
        try {
          var5_int = param1 + param0;
          var6 = param3 + param4;
          if (param1 > SoftwareRaster.clipLeft) {
            stackIn_4_0 = param1;
          } else {
            stackIn_4_0 = SoftwareRaster.clipLeft;
          }
          var7 = stackIn_4_0;
          if (SoftwareRaster.clipTop < param4) {
            stackIn_7_0 = param4;
          } else {
            stackIn_7_0 = SoftwareRaster.clipTop;
          }
          var8 = stackIn_7_0;
          if (var5_int >= SoftwareRaster.clipRight) {
            stackIn_10_0 = SoftwareRaster.clipRight;
          } else {
            stackIn_10_0 = var5_int;
          }
          var9 = stackIn_10_0;
          if (var6 >= SoftwareRaster.clipBottom) {
            stackIn_13_0 = SoftwareRaster.clipBottom;
          } else {
            stackIn_13_0 = var6;
          }
          var10 = stackIn_13_0;
          if (param1 >= SoftwareRaster.clipLeft &&
            param1 < SoftwareRaster.clipRight) {
            var11 = var8 * SoftwareRaster.width + param1;
            var12 = 1 + var10 - var8 >> 1;
            while (true) {
              var12--;
              if (var12 < 0) {
                break;
              }
              SoftwareRaster.pixels[var11] = 16777215;
              var11 = var11 + 2 * SoftwareRaster.width;
            }
          }
          if (SoftwareRaster.clipTop <= param4 &&
            SoftwareRaster.clipBottom > var6) {
            var11Lifetime1 = SoftwareRaster.width * param4 + var7;
            var12Lifetime1 = -var7 + var9 + 1 >> 1;
            while (true) {
              var12Lifetime1--;
              if (var12Lifetime1 < 0) {
                break;
              }
              SoftwareRaster.pixels[var11Lifetime1] = 16777215;
              var11Lifetime1 += 2;
            }
          }
          var11Lifetime2 = 72 / ((param2 - 79) / 37);
          if (SoftwareRaster.clipLeft <= var5_int &&
            SoftwareRaster.clipRight > var5_int) {
            var12Lifetime2 = var5_int + SoftwareRaster.width * ((1 & var5_int - param1) + var8);
            var13 = 1 + var10 - var8 >> 1;
            while (true) {
              var13--;
              if (var13 < 0) {
                break;
              }
              SoftwareRaster.pixels[var12Lifetime2] = 16777215;
              var12Lifetime2 = var12Lifetime2 + 2 * SoftwareRaster.width;
            }
          }
          if (SoftwareRaster.clipTop <= param4 &&
            var6 < SoftwareRaster.clipBottom) {
            var12Lifetime3 = var7 + (SoftwareRaster.width * var6 + (-param4 + var6 & 1));
            var13Lifetime1 = 1 + var9 - var7 >> 1;
            while (true) {
              var13Lifetime1--;
              if (0 > var13Lifetime1) {
                return;
              }
              SoftwareRaster.pixels[var12Lifetime3] = 16777215;
              var12Lifetime3 += 2;
            }
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var5 = decompiledCaughtException;
          throw ig.addExceptionContext((Throwable) ((Object) var5), "na.D(" + param0 + ',' + param1 + ',' + param2 + ',' + param3 + ',' + param4 + ')');
        }
    }

    private final int a(int param0, int param1, String param2, kb param3, int param4, String param5, int param6) {
        RuntimeException var8 = null;
        pk var9 = null;
        ta var10 = null;
        int stackIn_2_0 = 0;
        int stackIn_4_0 = 0;
        RuntimeException stackIn_7_0 = null;
        StringBuilder stackIn_7_1 = null;
        String stackIn_8_2 = null;
        StringBuilder stackIn_10_1 = null;
        String stackIn_11_2 = null;
        StringBuilder stackIn_13_1 = null;
        String stackIn_14_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          var10 = new ta(20, param0, 120 + param4, 25, param3, false, 120, 3, ArmiesOfGielinor.field_J, 16777215, param2);
          this.a((byte) 10, (kb) (var10));
          var9 = new pk(((eg) ((Object) param3)).a(-918933630), param5, 126, param0 + var10.field_w, param4 + 25, param1);
          var9.field_x = (qo) (this);
          this.a((byte) 10, (kb) (var9));
          if (param6 < -59) {
            stackIn_4_0 = var9.field_w + var10.field_w;
            return stackIn_4_0;
          }
          stackIn_2_0 = 6;
          return stackIn_2_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var8 = decompiledCaughtException;
          stackIn_7_0 = var8;
          stackIn_7_1 = new StringBuilder().append("na.B(").append(param0).append(',').append(param1).append(',');
          if (param2 == null) {
            stackIn_8_2 = "null";
          } else {
            stackIn_8_2 = "{...}";
          }
          stackIn_10_1 = ((StringBuilder) (Object) stackIn_7_1).append(stackIn_8_2).append(',');
          if (param3 == null) {
            stackIn_11_2 = "null";
          } else {
            stackIn_11_2 = "{...}";
          }
          stackIn_13_1 = ((StringBuilder) (Object) stackIn_10_1).append(stackIn_11_2).append(',').append(param4).append(',');
          if (param5 == null) {
            stackIn_14_2 = "null";
          } else {
            stackIn_14_2 = "{...}";
          }
          throw ig.addExceptionContext((Throwable) ((Object) stackIn_7_0), ((StringBuilder) (Object) stackIn_13_1).append(stackIn_14_2).append(',').append(param6).append(')').toString());
        }
    }

    final static nd a(dr[] param0, byte param1, nd[] param2, String param3) throws cb {
        int var4_int = 0;
        StringBuilder discarded$1 = null;
        StringBuilder discarded$2 = null;
        StringBuilder discarded$3 = null;
        StringBuilder discarded$0 = null;
        nd stackIn_6_0 = null;
        RuntimeException stackIn_21_0 = null;
        StringBuilder stackIn_21_1 = null;
        String stackIn_22_2 = null;
        StringBuilder stackIn_24_1 = null;
        String stackIn_25_2 = null;
        StringBuilder stackIn_27_1 = null;
        String stackIn_28_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var4 = null;
        int var5 = 0;
        int var6 = 0;
        int var7 = 0;
        StringBuilder var8 = null;
        int var5Lifetime1;
        var6 = ArmiesOfGielinor.obfuscationControl ? 1 : 0;
        try {
          var5 = 5 / ((-46 - param1) / 37);
          for (var4_int = 0; param0.length > var4_int; var4_int++) {
            if (param0[var4_int].a(param3, (byte) 55, param2)) {
              stackIn_6_0 = param0[var4_int].a(-24872, param2);
              return stackIn_6_0;
            }
          }
          var8 = new StringBuilder("The method " + param3 + "(");
          var7 = 0;
          var5Lifetime1 = var7;
          while (param2.length > var7) {
            if (!param2[var7].field_e) {
              discarded$1 = var8.append(SummonRequest.a(640, param2[var7].field_c.getClass()));
            } else {
              discarded$2 = var8.append(CampaignMenuEntry.getBoxedPrimitiveType(param2[var7].field_c, (byte) -75).toString());
            }
            if (var7 < param2.length - 1) {
              discarded$3 = var8.append(',');
            }
            var7++;
          }
          discarded$0 = var8.append(") is undefined.");
          throw new cb(var8.toString());
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var4 = decompiledCaughtException;
          stackIn_21_0 = var4;
          stackIn_21_1 = new StringBuilder().append("na.J(");
          if (param0 == null) {
            stackIn_22_2 = "null";
          } else {
            stackIn_22_2 = "{...}";
          }
          stackIn_24_1 = ((StringBuilder) (Object) stackIn_21_1).append(stackIn_22_2).append(',').append(param1).append(',');
          if (param2 == null) {
            stackIn_25_2 = "null";
          } else {
            stackIn_25_2 = "{...}";
          }
          stackIn_27_1 = ((StringBuilder) (Object) stackIn_24_1).append(stackIn_25_2).append(',');
          if (param3 == null) {
            stackIn_28_2 = "null";
          } else {
            stackIn_28_2 = "{...}";
          }
          throw ig.addExceptionContext((Throwable) ((Object) stackIn_21_0), ((StringBuilder) (Object) stackIn_27_1).append(stackIn_28_2).append(')').toString());
        }
    }

    public static void f(byte param0) {
        if (param0 == -117) {
          field_J = null;
          field_K = null;
          field_N = null;
          field_I = null;
          field_G = null;
          return;
        }
        field_K = (String) null;
        field_J = null;
        field_K = null;
        field_N = null;
        field_I = null;
        field_G = null;
    }

    public final void a(int param0, String param1) {
        ma var3 = null;
        RuntimeException var3_ref = null;
        String var4 = null;
        kb var5 = null;
        RuntimeException stackIn_5_0 = null;
        StringBuilder stackIn_5_1 = null;
        String stackIn_6_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          var3 = this.field_P;
          var4 = param1;
          ((fn) ((Object) var3)).a(false, var4, -27934);
          if (param0 == -1) {
            return;
          }
          var5 = (kb) null;
          this.a((kb) null, 40, '\034', 104);
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3_ref = decompiledCaughtException;
          stackIn_5_0 = var3_ref;
          stackIn_5_1 = new StringBuilder().append("na.I(").append(param0).append(',');
          if (param1 == null) {
            stackIn_6_2 = "null";
          } else {
            stackIn_6_2 = "{...}";
          }
          throw ig.addExceptionContext((Throwable) ((Object) stackIn_5_0), ((StringBuilder) (Object) stackIn_5_1).append(stackIn_6_2).append(')').toString());
        }
    }

    final static CampaignMission a(CipherPacketBuffer param0, int param1) {
        int var2_int = 0;
        RuntimeException var2 = null;
        CampaignMission var3 = null;
        CampaignMission stackIn_2_0 = null;
        CampaignMission stackIn_4_0 = null;
        RuntimeException stackIn_7_0 = null;
        StringBuilder stackIn_7_1 = null;
        String stackIn_8_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          if (param1 < 3) {
            stackIn_2_0 = (CampaignMission) null;
            return stackIn_2_0;
          }
          var2_int = param0.readInt(1);
          param0.beginBitReading(117);
          var3 = pf.a(var2_int, (byte) 6, param0);
          param0.endBitReading(-2);
          stackIn_4_0 = var3;
          return stackIn_4_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2 = decompiledCaughtException;
          stackIn_7_0 = var2;
          stackIn_7_1 = new StringBuilder().append("na.O(");
          if (param0 == null) {
            stackIn_8_2 = "null";
          } else {
            stackIn_8_2 = "{...}";
          }
          throw ig.addExceptionContext((Throwable) ((Object) stackIn_7_0), ((StringBuilder) (Object) stackIn_7_1).append(stackIn_8_2).append(',').append(param1).append(')').toString());
        }
    }

    private final int a(int param0, String param1, String param2, int param3, int param4, kb param5) {
        RuntimeException var7 = null;
        int stackIn_2_0 = 0;
        int stackIn_4_0 = 0;
        RuntimeException stackIn_7_0 = null;
        StringBuilder stackIn_7_1 = null;
        String stackIn_8_2 = null;
        StringBuilder stackIn_10_1 = null;
        String stackIn_11_2 = null;
        StringBuilder stackIn_13_1 = null;
        String stackIn_14_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          if (param0 < -55) {
            stackIn_4_0 = this.a(param4, 35, param1, param5, param3, param2, -67);
            return stackIn_4_0;
          }
          stackIn_2_0 = -123;
          return stackIn_2_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var7 = decompiledCaughtException;
          stackIn_7_0 = var7;
          stackIn_7_1 = new StringBuilder().append("na.G(").append(param0).append(',');
          if (param1 == null) {
            stackIn_8_2 = "null";
          } else {
            stackIn_8_2 = "{...}";
          }
          stackIn_10_1 = ((StringBuilder) (Object) stackIn_7_1).append(stackIn_8_2).append(',');
          if (param2 == null) {
            stackIn_11_2 = "null";
          } else {
            stackIn_11_2 = "{...}";
          }
          stackIn_13_1 = ((StringBuilder) (Object) stackIn_10_1).append(stackIn_11_2).append(',').append(param3).append(',').append(param4).append(',');
          if (param5 == null) {
            stackIn_14_2 = "null";
          } else {
            stackIn_14_2 = "{...}";
          }
          throw ig.addExceptionContext((Throwable) ((Object) stackIn_7_0), ((StringBuilder) (Object) stackIn_13_1).append(stackIn_14_2).append(')').toString());
        }
    }

    final boolean a(kb param0, int param1, char param2, int param3) {
        RuntimeException var5 = null;
        boolean stackIn_6_0 = false;
        boolean stackIn_12_0 = false;
        RuntimeException stackIn_15_0 = null;
        StringBuilder stackIn_15_1 = null;
        String stackIn_16_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          if (super.a(param0, param1, param2, param3 + 0)) {
            return true;
          }
          if (param1 == 98) {
            stackIn_6_0 = this.a(false, param0);
            return stackIn_6_0;
          }
          if (param3 != -12215) {
            field_F = -74;
          }
          if (param1 != 99) {
            return false;
          }
          stackIn_12_0 = this.b((byte) -127, param0);
          return stackIn_12_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var5 = decompiledCaughtException;
          stackIn_15_0 = var5;
          stackIn_15_1 = new StringBuilder().append("na.F(");
          if (param0 == null) {
            stackIn_16_2 = "null";
          } else {
            stackIn_16_2 = "{...}";
          }
          throw ig.addExceptionContext((Throwable) ((Object) stackIn_15_0), ((StringBuilder) (Object) stackIn_15_1).append(stackIn_16_2).append(',').append(param1).append(',').append(param2).append(',').append(param3).append(')').toString());
        }
    }

    static {
        field_E = 4;
        field_K = "Remove <%0> from friend list";
        field_I = "Spells";
        field_N = "This item can only be used on other players' units.";
        field_J = new int[]{1, 1, 2, 1, 1, 1, 2, 2, 2, 2, 3, 2, 2, 2, 3, 5, 1, 1, 1, 2, 3, 3, 1, 1, 1, 1, 1, 1, 1, 1, 2, 2, 5, 2, 2, 2, 2, 2, 2, 3, 5, 3, 3, 5, 2, 3, 5, 3, 3, 5, 2, 3, 5, 2, 3, 5};
        field_G = new me(1, 2, 2, 0);
    }
}
